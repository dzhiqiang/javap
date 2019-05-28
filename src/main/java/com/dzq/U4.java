package com.dzq;

import java.io.IOException;
import java.io.InputStream;

public class U4 {

    public static float byteToFloat(InputStream in) throws IOException {
        byte[] bytes = new byte[4];
        in.read(bytes, 0, bytes.length);
        return ByteUtil.byte4Fload(bytes);
    }

    public static int byteToInt(InputStream in) throws IOException {
        byte[] bytes = new byte[4];
        in.read(bytes, 0, bytes.length);
        return ByteUtil.byte4int(bytes);
    }

}
