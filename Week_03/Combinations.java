package info.nj005py.exercise.week3;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    List<Integer> temp = new ArrayList();
    List<List<Integer>> ans = new ArrayList();

    public List<List<Integer>> combine(int n, int k) {
        List<Integer> temp = new ArrayList();
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i <= k; i++) {
            temp.add(i);
        }
        temp.add(n + 1);

        int j = 0;
        while (j < k) {
            ans.add(new ArrayList<Integer>(temp.subList(0,k)));
            j = 0;
            while (j < k && temp.get(j) + 1 == temp.get(j + 1)) {
                temp.set(j,j + 1);
                j++;
            }
            temp.set(j,temp.get(j) + 1);
        }
        return ans;
    }
}
