package commons_io;

import javafx.scene.shape.Path;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * CommonIo框架：IO相关操作
 */
public class CommonIoDemo {
    public static void main(String[] args) throws IOException {
        FileUtils.copyFile(new File("learn_d6_file-io\\src\\learn.txt"),new File("D:\\Code\\JavaSE\\learn_d6_file-io\\src\\learnCommonIo.txt"));
        FileUtils.copyDirectory(new File("D:\\新建文件夹"),new File("D:\\新建文件夹1"));
//        FileUtils.deleteDirectory(new File("D:\\新建文件夹1"));



    }
}
