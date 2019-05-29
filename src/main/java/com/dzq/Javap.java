package com.dzq;

import java.io.*;

public class Javap {



    public static void main(String[] args) throws IOException {

        ClassInfo classInfo = new ClassInfo();
        InputStream in = null;
        try {
            in = new FileInputStream(new File("D:\\gitworkspace\\Test\\out\\production\\Test\\com\\wangyin\\Car.class"));
            checkMagicNumber(in);

            classInfo.setMinorVersion(U2.byteToInt(in));
            classInfo.setMajorVersion(U2.byteToInt(in));
            classInfo.setConstantPoolCount(U2.byteToInt(in));

            ConstantInfo[] constantInfoArray = new ConstantInfo[classInfo.getConstantPoolCount()]; //0位置空缺

            for (int i = 1; i < constantInfoArray.length; i++) {

                constantInfoArray[i] = itemConstantInfo(in);

            }

            classInfo.setConstantInfos(constantInfoArray);




        }finally {
            if (in != null) {
                in.close();
            }
        }

        System.out.println(classInfo);



    }

    private static ConstantInfo itemConstantInfo(InputStream in) throws IOException {
        int tag = U1.byteToInt(in);
        ConstantInfo constantInfo = ConstantInfo.createSubInfo(tag);
        constantInfo.analysis(in);
        return constantInfo;
    }

    private static void checkMagicNumber(InputStream in) throws IOException {

        byte[] bytes = new byte[4];
        in.read(bytes, 0, bytes.length);
        for (byte b : bytes) {
            System.out.println(b);
        }

    }

}
