package cn.cyf.Test;

import cn.cyf.check.Paper;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

public class TestIsPunctuation {
    /**
     * 测试是否为标点符号
     */
    @Test
    public void testIsSymbol(){
        String s="。。？这里是标点符号测试！？，";
        Paper paper=new Paper(new HashSet<String>());
        char[] chars = s.toCharArray();
        for(char c: chars){
            if(paper.isPunctuation(c)){
                System.out.print(c);
            }
        }
    }
}
