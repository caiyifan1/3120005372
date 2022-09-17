package java.cyf.check;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * 论文类
 * @param <C>Collection
 */
public class Paper<C extends Collection>{
    private C features;

    public C getFeatures() {
        return features;
    }

    public Paper(C features) {
        this.features = features;
    }

    public Paper(String path,C features)throws IOException{
        this.features = features;
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line;
        while ((line = br.readLine()) != null) {
            split(line);
        }
        br.close();
    }

    public void split(String s){
        char[] chars=s.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(isSymbol(chars[i])||isSymbol(chars[i+1]))continue;
            features.add(new String(chars,i,2));
        }
    }

    public Boolean isSymbol(char c){
        Pattern pattern=Pattern.compile("\\pP");
        return pattern.matcher(String.valueOf(c)).find();
    }
}
