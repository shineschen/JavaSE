package learn_d2_recuision;

import java.io.File;

/**
 * 文件搜索案例
 */
public class RecursionDemo4 {

    public static void main(String[] args) {
        searchFilePath(new File("D:/"), "learn1.txt");
    }

    public static void searchFilePath(File file, String fileName) {
        // 过滤非法数据
        if (file == null || file.isFile() || !file.exists()) return;

        File[] files = file.listFiles();

        if (files != null && files.length > 0) {
            for (File f : files) {
                if (f.isFile()) {
                    if (f.getName().equals(fileName)) {
                        System.out.println("找到了：" + f.getAbsolutePath());
                    }
                } else {
                    searchFilePath(f, fileName);
                }
            }
        }
    }
}


