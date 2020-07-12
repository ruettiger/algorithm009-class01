package com.rudy.java20200709;

public class ReverseBits {
    public int reverseBits(int n) {
        int ret = 0;
        for (int i = 0; i < 32; i++) {
            ret ^= (n&(1<<i)) == 0?0:1<<(31-i);
        }
        return ret;
    }
}
