package com.dzq;

public class BitUtil {

    public static boolean isZero(int i, int oper) {
        int result = i & (1 << oper);
        return result == 0;
    }

    public static boolean isOne(int i, int oper) {
        int result = i & (1 << oper);
        return result != 0;
    }

}
