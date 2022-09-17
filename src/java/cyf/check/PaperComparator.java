package java.cyf.check;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 论文比较类
 *原理：将原文与抄袭文本进行文本特征比较
 *如果文本特征相同的，重复书加一
 * 返回文本特征重复数
 */
public class PaperComparator {
    private static int count =0;    //文本特征重复数

    @SuppressWarnings(value = "unchecked")  //告诉编译器忽略值 = unchecked 警告信息
    public int compare(Paper originPaper,Paper copyPaper){
        Set<String> originFeatures =(HashSet<String>)originPaper.getFeatures();
        List<String> copyFeatures=(ArrayList<String>)copyPaper.getFeatures();
        for(String s: copyFeatures){
            if(originFeatures.contains(s))count++;
        }
        return count;
    }

}
