package com.dzq;

public class ByteUtil {

    public static int byte1int(byte[] bytes) {
        return bytes[0];
    }

    public static int byte2int(byte[] bytes) {
        int i1 = bytes[0] << 8;
        int i2 = bytes[1];
        return i1 | i2;
    }

    public static int byte4int(byte[] bytes) {
        int i1 = bytes[0] << 24;
        int i2 = bytes[1] << 16;
        int i3 = bytes[2] << 8;
        int i4 = bytes[3];
        return i1 | i2 | i3 | i4;
    }

    public static double byte8Double(byte[] bytes) {
        int i1 = bytes[0] << 56;
        int i2 = bytes[1] << 48;
        int i3 = bytes[2] << 40;
        int i4 = bytes[3] << 32;
        int i5 = bytes[3] << 24;
        int i6 = bytes[3] << 16;
        int i7 = bytes[3] << 8;
        int i8 = bytes[3] ;
        return i1 | i2 | i3 | i4 | i5 | i6 | i7 | i8;
    }

    public static float byte4Fload(byte[] bytes) {
        int i1 = bytes[0] << 24;
        int i2 = bytes[1] << 16;
        int i3 = bytes[2] << 8;
        int i4 = bytes[3];
        return i1 | i2 | i3 | i4;
    }
}
