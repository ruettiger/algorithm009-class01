package com.rudy.study;

public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0, n = bills.length;
        for (int i = 0; i < n; i++) {
            switch (bills[i]) {
                case 20:
                    if (ten > 0) {
                        ten--;
                        five--;
                    } else {
                        five -= 3;
                    }
                    break;
                case 10:
                    ten++;
                    five--;
                    break;
                default:
                    five++;
            }
            if (five < 0) return false;
        }
        return true;
    }
}
