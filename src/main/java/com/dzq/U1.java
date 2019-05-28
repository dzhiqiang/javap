package com.dzq;

import java.io.IOException;
import java.io.InputStream;

public class U1 {

    public static int byteToInt(InputStream in) throws IOException {
        byte[] bytes = new byte[1];
        in.read(bytes, 0, bytes.length);
        return ByteUtil.byte1int(bytes);
    }

}
