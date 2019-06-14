package com.dzq.attr;

import com.dzq.ClassInfo;
import com.dzq.LocalVariableInfo;
import com.dzq.U2;

import java.io.IOException;
import java.io.InputStream;

public class SourceFileAttrInfo extends AttrInfo {


    private int sourcefileIndex;


    public SourceFileAttrInfo(int attrNameIndex, int attrLength, String attrName) {
        super(attrNameIndex, attrLength, attrName);
    }

    public int getSourcefileIndex() {
        return sourcefileIndex;
    }

    public void setSourcefileIndex(int sourcefileIndex) {
        this.sourcefileIndex = sourcefileIndex;
    }

    public void parseAttrInfo(ClassInfo classInfo, InputStream in) throws IOException {

        this.sourcefileIndex = U2.byteToInt(in);

    }
}
