package java.cyf.Test;

import java.cyf.check.PaperCheck;
import java.io.IOException;

public class Test {
    public void test(){
        String[] paths ={
                "C:\\Users\\caibu\\Desktop\\orig.txt",
                "C:\\Users\\caibu\\Desktop\\orig_0.8_add.txt",
                "java/cyf/outcome.txt"
        };
        try{
            PaperCheck.main(paths);
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("数据流异常");
        }
    }
}
