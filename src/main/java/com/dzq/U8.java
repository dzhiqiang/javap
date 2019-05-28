package com.dzq;

import java.io.IOException;
import java.io.InputStream;

public class U8 {


    public static double byteToDouble(InputStream in) throws IOException {
        byte[] bytes = new byte[8];
        in.read(bytes, 0, bytes.length);
        return ByteUtil.byte8Double(bytes);
    }

}
