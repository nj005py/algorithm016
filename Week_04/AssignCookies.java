package info.nj005py.exercise.week4;

import java.util.Arrays;

//455. 分发饼干
public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        if (g == null || s == null) return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int child = 0;
        for (int cookie = 0; child < g.length && cookie < s.length; cookie++) {
            if (s[cookie] >= g[child]) {
                child++;
            }
        }
        return child;
    }
}
