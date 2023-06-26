package com.learn.d3_interclass_static;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @description TODO AESUtils 加密解密
 */
public class AESUtils {
    //密钥 (需要前端和后端保持一致)
    public static final String KEY = "asdasdqweq.1]234";
    //算法
    private static final String ALGORITHMSTR = "AES/CBC/PKCS5Padding";
    //密钥
    public static final String IV_KEY = "QWERTYUIOPZXCVBN";

    //算法(恢复有ECB加解密方式，微厅，手厅需要用)
    private static final String ALGORITHMSTRCSS = "AES/ECB/PKCS5Padding";

    /**
     * aes解密
     *
     * @param encrypt 内容
     * @return
     * @throws Exception
     */
    public static String aesDecrypt(String encrypt) {
        try {
            return aesDecrypt(encrypt, KEY);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * aes加密
     *
     * @param content
     * @return
     * @throws Exception
     */
    public static String aesEncrypt(String content) {
        try {
            return aesEncrypt(content, KEY);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * 将byte[]转为各种进制的字符串
     *
     * @param bytes byte[]
     * @param radix 可以转换进制的范围，从Character.MIN_RADIX到Character.MAX_RADIX，超出范围后变为10进制
     * @return 转换后的字符串
     */
    public static String binary(byte[] bytes, int radix) {
        return new BigInteger(1, bytes).toString(radix);// 这里的1代表正数
    }

    /**
     * base 64 encode
     *
     * @param bytes 待编码的byte[]
     * @return 编码后的base 64 code
     */
    public static String base64Encode(byte[] bytes) {
        return Base64.getMimeEncoder().encodeToString(bytes);
    }

    /**
     * base 64 decode
     *
     * @param base64Code 待解码的base 64 code
     * @return 解码后的byte[]
     * @throws Exception
     */
    public static byte[] base64Decode(String base64Code) throws Exception {
        return base64Code == null || base64Code.trim().length() <= 0 ? null : Base64.getMimeDecoder().decode(base64Code);
    }


    /**
     * AES加密
     *
     * @param content    待加密的内容
     * @param encryptKey 加密密钥
     * @return 加密后的byte[]
     * @throws Exception
     */
    public static byte[] aesEncryptToBytes(String content, String encryptKey) throws Exception {
        KeyGenerator kgen = KeyGenerator.getInstance("AES");
        kgen.init(128);
        Cipher cipher = Cipher.getInstance(ALGORITHMSTR);
        // @remark modify start zwx488614 2019-11-19 V600R005C21L86HB3 对字符串的编码转换，添加指定编码方式"UTF-8"
        IvParameterSpec iv = new IvParameterSpec(IV_KEY.getBytes("UTF-8"));
        cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(encryptKey.getBytes("UTF-8"), "AES"), iv);
        return cipher.doFinal(content.getBytes("utf-8"));
        // @remark modify end zwx488614 2019-11-19 V600R005C21L86HB3 对字符串的编码转换，添加指定编码方式"UTF-8"
    }

    /**
     * AES加密为base 64 code
     *
     * @param content    待加密的内容
     * @param encryptKey 加密密钥
     * @return 加密后的base 64 code
     */
    public static String aesEncrypt(String content, String encryptKey) throws Exception {
        return base64Encode(aesEncryptToBytes(content, encryptKey));
    }

    /**
     * AES解密
     *
     * @param encryptBytes 待解密的byte[]
     * @param decryptKey   解密密钥
     * @return 解密后的String
     * @throws Exception
     */
    public static String aesDecryptByBytes(byte[] encryptBytes, String decryptKey) throws Exception {
        KeyGenerator kgen = KeyGenerator.getInstance("AES");
        kgen.init(128);

        Cipher cipher = Cipher.getInstance(ALGORITHMSTR);
        // @remark modify start zwx488614 2019-11-19 V600R005C21L86HB3 对字符串的编码转换，添加指定编码方式"UTF-8"
        IvParameterSpec iv = new IvParameterSpec(IV_KEY.getBytes(StandardCharsets.UTF_8));
        cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(decryptKey.getBytes(StandardCharsets.UTF_8), "AES"), iv);
        byte[] decryptBytes = cipher.doFinal(encryptBytes);
        return new String(decryptBytes, StandardCharsets.UTF_8);
        // @remark modify end zwx488614 2019-11-19 V600R005C21L86HB3 对字符串的编码转换，添加指定编码方式"UTF-8"
    }


    /**
     * 将base 64 code AES解密
     *
     * @param encryptStr 待解密的base 64 code
     * @param decryptKey 解密密钥
     * @return 解密后的string
     * @throws Exception
     */
    public static String aesDecrypt(String encryptStr, String decryptKey) throws Exception {
        return encryptStr == null || encryptStr.trim().length() <= 0 ? null : aesDecryptByBytes(base64Decode(encryptStr), decryptKey);
    }

    // 手机号码前三后四中间脱敏 格式 176****9901
    public static String mobileDesensitization(String mobile) {
        if (mobile != null && mobile.trim().length() > 0) {
            return mobile;
        }
        //十一位数直接脱敏
        if (mobile.length() == 11) {
            return mobile.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
        } else {
            //非十一位数为AES加密后的，需要解密后脱敏
            return aesDecrypt(mobile).replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
        }
    }

    /**
     * AES加密
     *
     * @param content    待加密的内容
     * @param encryptKey 加密密钥
     * @return 加密后的byte[]
     * @throws Exception
     */
    public static byte[] cssAesEncryptToBytes(String content, String encryptKey) throws Exception {
        KeyGenerator kgen = KeyGenerator.getInstance("AES");
        kgen.init(128);
        Cipher cipher = Cipher.getInstance(ALGORITHMSTRCSS);
        cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(encryptKey.getBytes("UTF-8"), "AES"));
        return cipher.doFinal(content.getBytes("utf-8"));
    }

    /**
     * AES解密
     *
     * @param encryptBytes 待解密的byte[]
     * @param decryptKey   解密密钥
     * @return 解密后的String
     * @throws Exception
     */
    public static String cssAesDecryptByBytes(byte[] encryptBytes, String decryptKey) throws Exception {
        KeyGenerator kgen = KeyGenerator.getInstance("AES");
        kgen.init(128);

        Cipher cipher = Cipher.getInstance(ALGORITHMSTRCSS);
        cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(decryptKey.getBytes(StandardCharsets.UTF_8), "AES"));
        byte[] decryptBytes = cipher.doFinal(encryptBytes);
        return new String(decryptBytes, StandardCharsets.UTF_8);
    }

    /**
     * AES加密为base 64 code
     *
     * @param content    待加密的内容
     * @param encryptKey 加密密钥
     * @return 加密后的base 64 code
     * @throws Exception
     */
    public static String cssAesEncrypt(String content, String encryptKey) throws Exception {
        return base64Encode(cssAesEncryptToBytes(content, encryptKey));
    }

    /**
     * base 64 decode
     *
     * @param base64Code 待解码的base 64 code
     * @return 解码后的byte[]
     * @throws Exception
     */
    public static byte[] cssBase64Decode(String base64Code) throws Exception {
        return base64Code == null || base64Code.trim().length() <= 0 ? null : Base64.getDecoder().decode(base64Code);
    }

    /**
     * 将base 64 code AES解密
     *
//     * @param encryptStr 待解密的base 64 code
//     * @param decryptKey 解密密钥
     * @return 解密后的string
     * @throws Exception
     */
//    public static String cssAesDecrypt(String encryptStr, String decryptKey) throws Exception {
//        return encryptStr == null || encryptStr.trim().length() <= 0 ? null : cssAesDecryptByBytes(cssBase64Decode(encryptStr), decryptKey);
//    }

    // 加密
    public static String encrypt(String sSrc, String sKey) throws Exception {
        byte[] raw = sKey.getBytes(StandardCharsets.UTF_8);
        SecretKeySpec skySpec = new SecretKeySpec(raw, "AES");
        //"算法/模式/补码方式"
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, skySpec);
        byte[] encrypted = cipher.doFinal(sSrc.getBytes(StandardCharsets.UTF_8));
        //此处使用BASE64做转码功能，同时能起到2次加密的作用。
        return new BASE64Encoder().encode(encrypted);
    }


    /**
     * 解密
     *
     * @param sSrc 要解密的数据
     * @param sKey 解密参数
     * @return 解密后的数据
     * @throws Exception
     */
    public static String decrypt(String sSrc, String sKey) throws Exception {
        try {
            byte[] raw = sKey.getBytes(StandardCharsets.UTF_8);
            SecretKeySpec skySpec = new SecretKeySpec(raw, "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, skySpec);
            //先用base64解密
            byte[] encrypted1 = new BASE64Decoder().decodeBuffer(sSrc);
            try {
                byte[] original = cipher.doFinal(encrypted1);
                return new String(original, StandardCharsets.UTF_8);
            } catch (Exception e) {
                throw new Exception("");
            }
        } catch (Exception ex) {
            throw new Exception("");
        }
    }


    /**
     * main 案例
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        String data = "p+P+Tt+66Fn/UnKZmyD6og==";
        String key = "fdofgd39233!1243";
        System.out.println(decrypt(data, key));


        System.out.println("=================");
        String data1 = "1000.00";
        String key1 = "fdofgd39233!1243";
        System.out.println(encrypt(data1, key1));

    }
}
