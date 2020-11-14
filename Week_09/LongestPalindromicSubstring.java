package info.nj005py.exercise.week9;

import java.util.ArrayList;
import java.util.List;

//5. 最长回文子串
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int start = 0,end = -1;
        StringBuffer t = new StringBuffer("#");
        for (int i = 0; i < s.length(); ++i) {
            t.append(s.charAt(i));
            t.append('#');
        }
        t.append('#');
        s = t.toString();

        List<Integer> arm_len = new ArrayList<Integer>();
        int right = -1, j = -1;
        for (int i = 0; i < s.length(); ++i) {
            int curArmLen;
            if (right >= i) {
                int iSym = j * 2 - i;
                int minArmLen = Math.min(arm_len.get(iSym), right - i);
                curArmLen = expand(s, i - minArmLen, i + minArmLen);
            } else {
                curArmLen = expand(s, i, i);
            }
            arm_len.add(curArmLen);
            if (i + curArmLen > right) {
                j = i;
                right = i + curArmLen;
            }

            if (curArmLen * 2 + 1 > end - start) {
                start = i - curArmLen;
                end = i + curArmLen;
            }
        }
        StringBuffer ans = new StringBuffer();
        for (int i = start; i <= end; ++i) {
            if (s.charAt(i) != '#') {
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }

    public int expand(String s ,int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            --left;
            ++right;
        }
        return (right - left - 2) / 2;
    }
}
