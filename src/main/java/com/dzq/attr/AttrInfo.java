package com.dzq.attr;

import com.dzq.ClassInfo;
import com.dzq.ConstantInfo;
import com.dzq.constantpool.ConstantUtf8Info;

import java.io.IOException;
import java.io.InputStream;

public abstract class AttrInfo {

    protected int attrNameIndex;

    protected int attrLength;

    protected String attrName;

    public AttrInfo(int attrNameIndex, int attrLength,String attrName) {
        this.attrNameIndex = attrNameIndex;
        this.attrLength = attrLength;
        this.attrName = attrName;
    }


    public int getAttrNameIndex() {
        return attrNameIndex;
    }

    public void setAttrNameIndex(int attrNameIndex) {
        this.attrNameIndex = attrNameIndex;
    }

    public int getAttrLength() {
        return attrLength;
    }

    public void setAttrLength(int attrLength) {
        this.attrLength = attrLength;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public abstract void parseAttrInfo(ClassInfo classInfo,InputStream in) throws IOException;
}
