package com.dzq;

import java.io.IOException;
import java.io.InputStream;

public class U2 {

    public static String byteToString(InputStream in) throws IOException {
        byte[] bytes = new byte[2];
        in.read(bytes, 0, bytes.length);
        return new String(bytes, 0, bytes.length);
    }

    public static int byteToInt(InputStream in) throws IOException {
        byte[] bytes = new byte[2];
        in.read(bytes, 0, bytes.length);
        return ByteUtil.byte2int(bytes);
    }

}
