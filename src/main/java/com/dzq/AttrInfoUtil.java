package com.dzq;

import com.dzq.attr.AttrInfo;
import com.dzq.attr.AttrInfoFactory;

import java.io.IOException;
import java.io.InputStream;

public class AttrInfoUtil {

    public static AttrInfo[] analysisAttrInfo(int length, ClassInfo classInfo, InputStream in) throws IOException {
        AttrInfo[] attrInfoArray = new AttrInfo[length];
        for (int i = 0; i < length; i++) {
            attrInfoArray[i] = itemArrayInfo(classInfo, in);
        }
        return attrInfoArray;
    }
    private static AttrInfo itemArrayInfo(ClassInfo classInfo, InputStream in) throws IOException {
        AttrInfo attrInfo = AttrInfoFactory.createAttrInfo(classInfo, in);
        attrInfo.parseAttrInfo(classInfo,in);
        return attrInfo;
    }
}
