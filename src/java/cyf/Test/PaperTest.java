package java.cyf.Test;

import java.cyf.check.Paper;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;

public class PaperTest {
    Paper paper=new Paper(new HashSet<String>());

    /**
     * 测试Paper类
     */
    public void paperTest()  {
        String path= "java/cyf/orig.txt";
        try {
            new Paper(path, new HashSet<String>());
        }catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("文件路径异常");
        }catch (IOException e1){
            e1.printStackTrace();
            System.out.println("IO异常");
        }
    }
}
