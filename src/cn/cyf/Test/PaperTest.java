package cn.cyf.Test;

import cn.cyf.check.Paper;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;

public class PaperTest {
    Paper paper=new Paper(new HashSet<String>());

    /**
     * 测试Paper类
     */
    @Test
    public void paperTest()  {
        String path= "C:\\Users\\caibu\\Desktop\\orig.txt";
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
