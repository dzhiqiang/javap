package com.dzq.attr;

import com.dzq.ClassInfo;
import com.dzq.LocalVariableInfo;
import com.dzq.U2;

import java.io.IOException;
import java.io.InputStream;

public class LocalVariableTableAttrInfo extends AttrInfo {


    private int localVariableTableLength;

    private LocalVariableInfo[] variableInfoArray;

    public LocalVariableTableAttrInfo(int attrNameIndex, int attrLength, String attrName) {
        super(attrNameIndex, attrLength, attrName);
    }

    public int getLocalVariableTableLength() {
        return localVariableTableLength;
    }

    public void setLocalVariableTableLength(int localVariableTableLength) {
        this.localVariableTableLength = localVariableTableLength;
    }

    public LocalVariableInfo[] getVariableInfoArray() {
        return variableInfoArray;
    }

    public void setVariableInfoArray(LocalVariableInfo[] variableInfoArray) {
        this.variableInfoArray = variableInfoArray;
    }

    public void parseAttrInfo(ClassInfo classInfo, InputStream in) throws IOException {

        this.localVariableTableLength = U2.byteToInt(in);

        if (this.localVariableTableLength > 0) {
            LocalVariableInfo[] variableInfos = new LocalVariableInfo[localVariableTableLength];
            for (int i = 0; i < localVariableTableLength; i++) {
                variableInfos[i] = new LocalVariableInfo(U2.byteToInt(in), U2.byteToInt(in), U2.byteToInt(in), U2.byteToInt(in), U2.byteToInt(in));
            }
            variableInfoArray = variableInfos;
        }

    }
}
