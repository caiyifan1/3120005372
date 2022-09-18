package cn.cyf.Test;

import cn.cyf.check.Paper;
import java.util.HashSet;
import java.util.Set;

public class TestSplit {
    /**
     * 测试分词
     */
    public void testSplit(){
        String s="今天天气真好！";
        Paper paper=new Paper(new HashSet<String>());
        paper.split(s);
        Set<String> features =(HashSet<String>)paper.getFeatures();
        for(String feature:features){
            System.out.println(feature);
        }
    }
}
