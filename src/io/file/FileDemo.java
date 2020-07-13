package io.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class FileDemo {

    @Test
    public void test1() throws IOException {
        System.out.println(System.getProperty("user.dir"));//默认路径
        File file = new File("src/io/file/static/hello.txt");
        file.createNewFile();

        //创建一个与file同目录下的另外一个文件，文件名为：haha.txt
        File destFile = new File(file.getParent(), "haha.txt");
        boolean newFile = destFile.createNewFile();
        if (newFile) {
            System.out.println("创建成功！");
        }
    }
}
