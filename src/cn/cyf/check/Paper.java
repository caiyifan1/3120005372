package cn.cyf.check;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.regex.Pattern;

public class Paper<T extends Collection> {

    private T features;

    public Paper(T features){
        this.features = features;
    }
    public Paper(String path, T features) throws IOException {

        this.features = features;
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line;
        while ((line = br.readLine()) != null) {
            split(line);
        }
        br.close();
    }

    /**
     * 获取文本特征
     */
    public T getFeatures(){
        return features;
    }

    /**
     *分词方法
     */
    public void split(String s){
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length - 1; i++){
            if(isPunctuation(chars[i]) || isPunctuation(chars[i + 1]))
                continue;
            features.add(new String(chars, i, 2));
        }
    }

    /**
     * 判断字符是否为标点符号
     */
    public Boolean isPunctuation(char c){
        // 中文标点符号的正则表达式
        Pattern pattern = Pattern.compile("\\pP");
        return pattern.matcher(String.valueOf(c)).find();
    }

}