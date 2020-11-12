package info.nj005py.exercise.week9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//151. 翻转字符串里的单词
public class ReverseWordsInAString {
    public String reverseWords(String s) {
        s = s.trim();
        List<String> list = Arrays.asList(s.split("\\s+"));
        Collections.reverse(list);
        return String.join(" ",list);
    }

}
