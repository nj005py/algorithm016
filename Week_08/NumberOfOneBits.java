package info.nj005py.exercise.week8;

//191. 位1的个数
public class NumberOfOneBits {
    public int hammingWeight(int n) {
        int bits = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((mask & n) != 0) bits++;
            mask <<= 1;
        }
        return bits;
    }
}
