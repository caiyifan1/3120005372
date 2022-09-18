package java.cyf.Test;

import java.cyf.check.Paper;
import java.util.HashSet;

public class TestIsSymbol {
    /**
     * 测试是否为标点符号
     */
    public void testIsSymbol(){
        String s="。。？这里是标点符号测试！？，";
        Paper paper=new Paper(new HashSet<String>());
        char[] chars = s.toCharArray();
        for(char c: chars){
            if(paper.isSymbol(c)){
                System.out.print(c);
            }
        }
    }
}
