package com.dzq;

import com.dzq.attr.AttrInfo;
import com.dzq.attr.AttrInfoFactory;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

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
            //常量池
            ConstantInfo[] constantInfoArray = new ConstantInfo[classInfo.getConstantPoolCount()]; //0位置空缺

            for (int i = 1; i < constantInfoArray.length; i++) {

                constantInfoArray[i] = itemConstantInfo(in);

            }

            classInfo.setConstantInfos(constantInfoArray);
            //类的访问标识
            analysisAccessFlags(classInfo, in);
            //类索引，父类索引，继承索引
            classInfo.setClassIndex(U2.byteToInt(in));
            classInfo.setSupIndex(U2.byteToInt(in));
            classInfo.setInterfaceLength(U2.byteToInt(in));

            if (classInfo.getInterfaceLength() > 0) {
                int[] interfaceArray = new int[classInfo.getInterfaceLength() - 1];
                for (int i = 0; i < classInfo.getInterfaceLength(); i++) {
                    interfaceArray[i] = U2.byteToInt(in);
                }
                classInfo.setInterfaceIndex(interfaceArray);
            }
            //属性集合
            classInfo.setFieldsCount(U2.byteToInt(in));
            if (classInfo.getFieldsCount() > 0) {
                FieldInfo[] fieldInfoArray = new FieldInfo[classInfo.getFieldsCount() - 1];
                for (int i = 0; i < classInfo.getFieldsCount(); i++) {
                    FieldInfo fieldInfo = new FieldInfo();
                    analysisFieldAccessFlags(fieldInfo, in);
                    fieldInfo.setNameIndex(U2.byteToInt(in));
                    fieldInfo.setDescIndex(U2.byteToInt(in));
                    fieldInfo.setAttrCount(U2.byteToInt(in));
                    if (fieldInfo.getAttrCount() > 0) {
                        fieldInfo.setAttrInfoArray(AttrInfoUtil.analysisAttrInfo(fieldInfo.getAttrCount(), classInfo, in));
                    }
                }
                classInfo.setFieldInfoArray(fieldInfoArray);
            }

            classInfo.setMethodsCount(U2.byteToInt(in));

            if (classInfo.getMethodsCount() > 0) {
                MethodInfo[] methodInfoArray = new MethodInfo[classInfo.getMethodsCount()];
                for (int i = 0; i < classInfo.getMethodsCount(); i++) {
                    MethodInfo methodInfo = new MethodInfo();
                    analysisMethodAccessFlags(methodInfo, in);
                    methodInfo.setNameIndex(U2.byteToInt(in));
                    methodInfo.setDescIndex(U2.byteToInt(in));
                    methodInfo.setAttrCount(U2.byteToInt(in));
                    if (methodInfo.getAttrCount() > 0) {
                        methodInfo.setAttrInfoArray(AttrInfoUtil.analysisAttrInfo(methodInfo.getAttrCount(), classInfo, in));
                    }
                    methodInfoArray[i] = methodInfo;
                }
                classInfo.setMethodInfoArray(methodInfoArray);
            }
            //属性解析
            classInfo.setAttributesCount(U2.byteToInt(in));

            if (classInfo.getAttributesCount() > 0) {
                classInfo.setAttrInfoArray(AttrInfoUtil.analysisAttrInfo(classInfo.getAttributesCount(), classInfo, in));
            }

        }finally {
            if (in != null) {
                in.close();
            }
        }

        System.out.println(classInfo);



    }


    private static void analysisMethodAccessFlags(MethodInfo methodInfo, InputStream in) throws IOException {
        int accessFlags = U2.byteToInt(in);
        methodInfo.setPublic(BitUtil.isOne(accessFlags, 0));
        methodInfo.setPrivate(BitUtil.isOne(accessFlags, 1));
        methodInfo.setProtected(BitUtil.isOne(accessFlags, 2));
        methodInfo.setStatic(BitUtil.isOne(accessFlags, 3));
        methodInfo.setFinal(BitUtil.isOne(accessFlags, 4));
        methodInfo.setSynchronized(BitUtil.isOne(accessFlags, 5));
        methodInfo.setBridge(BitUtil.isOne(accessFlags, 6));
        methodInfo.setVarargs(BitUtil.isOne(accessFlags, 7));
        methodInfo.setNative(BitUtil.isOne(accessFlags, 8));
        methodInfo.setAbstract(BitUtil.isOne(accessFlags, 10));
        methodInfo.setStrictfp(BitUtil.isOne(accessFlags, 11));
        methodInfo.setSynthetic(BitUtil.isOne(accessFlags, 12));

    }

    private static void analysisFieldAccessFlags(FieldInfo fieldInfo, InputStream in) throws IOException {

        int accessFlags = U2.byteToInt(in);
        //isPublic 0
        fieldInfo.setPublic(BitUtil.isOne(accessFlags, 0));
        //isPrivate
        fieldInfo.setPrivate(BitUtil.isOne(accessFlags, 1));
        //isProtected
        fieldInfo.setProtected(BitUtil.isOne(accessFlags, 2));
        //isStatic
        fieldInfo.setStatic(BitUtil.isOne(accessFlags, 3));

        fieldInfo.setFinal(BitUtil.isOne(accessFlags, 4));

        fieldInfo.setVolatile(BitUtil.isOne(accessFlags, 6));

        fieldInfo.setTransient(BitUtil.isOne(accessFlags, 7));

        fieldInfo.setSynthetic(BitUtil.isOne(accessFlags, 12));

        fieldInfo.setEnum(BitUtil.isOne(accessFlags, 14));


    }

    private static void analysisAccessFlags(ClassInfo classInfo, InputStream in) throws IOException {

        int accessFlags = U2.byteToInt(in);

        //isPublic 0
        classInfo.setPublic(BitUtil.isOne(accessFlags, 0));
        //isFinal 4
        classInfo.setFinal(BitUtil.isOne(accessFlags, 4));
        //isSuper
        classInfo.setSuper(BitUtil.isOne(accessFlags, 5));
        //isInterface
        classInfo.setInterface(BitUtil.isOne(accessFlags, 9));
        //isAbstract
        classInfo.setAbstract(BitUtil.isOne(accessFlags, 10));
        //isSynthetic
        classInfo.setSynthetic(BitUtil.isOne(accessFlags, 12));
        //isAnnotation
        classInfo.setAnnotation(BitUtil.isOne(accessFlags, 13));
        //isEnum
        classInfo.setAnnotation(BitUtil.isOne(accessFlags, 14));

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
