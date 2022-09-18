package cn.cyf.Test;

import cn.cyf.check.PaperPass;
import java.io.IOException;

public class Test {
    public void test(){
        String[] paths ={
                "C:\\Users\\caibu\\Desktop\\orig.txt",
                "C:\\Users\\caibu\\Desktop\\orig_0.8_add.txt",
                "cn/cyf/outcome.txt"
        };
        try{
            PaperPass.main(paths);
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("数据流异常");
        }
    }
}
