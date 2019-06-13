package com.dzq.attr;

import com.dzq.*;
import com.sun.xml.internal.bind.v2.model.core.ArrayInfo;

import java.io.IOException;
import java.io.InputStream;

/**
 * Code
 */
public class CodeAttrInfo extends AttrInfo{

    private int maxStack;
    private int maxLocals;
    private int codeLength;
    private int[] code;
    private int exceptionTableLength;
    private ExceptionTable[] exceptionTableArray;
    private int attrLength;
    private AttrInfo[] attrInfoArray;


    public CodeAttrInfo(int attrNameIndex, int attrLength,String attrName) {
        super(attrNameIndex, attrLength, attrName);
    }

    public void parseAttrInfo(ClassInfo classInfo,InputStream in) throws IOException {
        this.maxStack = U2.byteToInt(in);
        this.maxLocals = U2.byteToInt(in);
        this.codeLength = U4.byteToInt(in);

        if (codeLength > 0) {
            int[] codeArray = new int[codeLength];
            for (int i = 0; i < codeLength; i++) {
                code[i] = U1.byteToInt(in);
            }
            this.code = codeArray;
        }
        this.exceptionTableLength = U2.byteToInt(in);
        if (exceptionTableLength > 0) {
            ExceptionTable[] tableArray = new ExceptionTable[exceptionTableLength];
            for (int i = 0; i < exceptionTableLength; i++) {
                ExceptionTable etable = new ExceptionTable();
                etable.setStartPc(U2.byteToInt(in));
                etable.setEndPc(U2.byteToInt(in));
                etable.setHandlerPc(U2.byteToInt(in));
                etable.setCatchType(U2.byteToInt(in));
                tableArray[i] = etable;
            }
            exceptionTableArray = tableArray;
        }

        this.attrLength = U2.byteToInt(in);
        this.attrInfoArray = AttrInfoUtil.analysisAttrInfo(attrLength, classInfo, in);

    }

    public int getMaxStack() {
        return maxStack;
    }

    public void setMaxStack(int maxStack) {
        this.maxStack = maxStack;
    }

    public int getMaxLocals() {
        return maxLocals;
    }

    public void setMaxLocals(int maxLocals) {
        this.maxLocals = maxLocals;
    }

    public int getCodeLength() {
        return codeLength;
    }

    public void setCodeLength(int codeLength) {
        this.codeLength = codeLength;
    }

    public int[] getCode() {
        return code;
    }

    public void setCode(int[] code) {
        this.code = code;
    }

    public int getExceptionTableLength() {
        return exceptionTableLength;
    }

    public void setExceptionTableLength(int exceptionTableLength) {
        this.exceptionTableLength = exceptionTableLength;
    }

    public ExceptionTable[] getExceptionTableArray() {
        return exceptionTableArray;
    }

    public void setExceptionTableArray(ExceptionTable[] exceptionTableArray) {
        this.exceptionTableArray = exceptionTableArray;
    }

    @Override
    public int getAttrLength() {
        return attrLength;
    }

    @Override
    public void setAttrLength(int attrLength) {
        this.attrLength = attrLength;
    }

    public AttrInfo[] getAttrInfoArray() {
        return attrInfoArray;
    }

    public void setAttrInfoArray(AttrInfo[] attrInfoArray) {
        this.attrInfoArray = attrInfoArray;
    }
}
