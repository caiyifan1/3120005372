package java.cyf.check;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * 论文查重类
 */
public class PaperCheck {
    /**
     * args[0]原文的路径，args[1]抄袭文本的路径，args[2]论文查重结果文件的路径
     * @param args 文件的路径
     */
    public static void main(String[] args) throws IOException {
        PaperComparator comparator=new PaperComparator();
        //初始化原始论文和抄袭论文
        Paper originPaper=new Paper<>(args[0],new HashSet<String>());
        Paper copyPaper=new Paper<>(args[1],new ArrayList<String>());
        int repeatCount= comparator.compare(originPaper,copyPaper);

        //计算重复率
        double rate =(double) repeatCount/copyPaper.getFeatures().size();

        //将重复率写入答案文件
        File file=new File(args[2]);
        if(!file.exists()){
            file.createNewFile();
        }
        BufferedWriter bw=new BufferedWriter(new FileWriter(file,true));
        bw.write("原文的路径："+args[0]+"\n");
        bw.write("抄袭文本的路径："+args[1]+"\n");
        bw.write("重复率："+rate);
        bw.close();

    }
}
