package com.dzq.attr;

import com.dzq.ClassInfo;
import com.dzq.ConstantInfo;
import com.dzq.U2;
import com.dzq.U4;
import com.dzq.constantpool.ConstantUtf8Info;

import java.io.IOException;
import java.io.InputStream;

public class AttrInfoFactory {


    public static AttrInfo createAttrInfo(ClassInfo classInfo, InputStream in) throws IOException {

        int attrNameIndex = U2.byteToInt(in);
        int attrLength = U4.byteToInt(in);
        String attrName = getAttrName(classInfo, attrNameIndex);
        if ("Code".equals(attrName)) {
            return new CodeAttrInfo(attrNameIndex, attrLength, attrName);
        }
        if ("LineNumberTable".equals(attrName)) {
            return new LineNumberTableAttrInfo(attrNameIndex, attrLength, attrName);
        }

        if ("LocalVariableTable".equals(attrName)) {
            return new LocalVariableTableAttrInfo(attrNameIndex, attrLength, attrName);
        }
        if ("SourceFile".equals(attrName)) {
            return new SourceFileAttrInfo(attrNameIndex, attrLength, attrName);
        }
        return null;
    }

    public static String getAttrName(ClassInfo classInfo,int attrNameIndex) {
        ConstantInfo constantInfo = classInfo.getConstantInfos()[attrNameIndex];
        if (constantInfo.getTag() == 1 && constantInfo instanceof ConstantUtf8Info) {
            ConstantUtf8Info utf8Info = (ConstantUtf8Info) constantInfo;
            return utf8Info.getValue();
        } else {
            throw new RuntimeException("无法获取属性名称");
        }

    }
}
