package com.dzq.attr;

import com.dzq.*;

import java.io.IOException;
import java.io.InputStream;

/**
 * Code
 */
public class LineNumberTableAttrInfo extends AttrInfo{

    private int lineNumberTableLength;
    private LineNumberInfo[] numberInfoArray;

    public LineNumberTableAttrInfo(int attrNameIndex, int attrLength, String attrName) {
        super(attrNameIndex, attrLength, attrName);
    }

    public void parseAttrInfo(ClassInfo classInfo,InputStream in) throws IOException {

        this.lineNumberTableLength = U2.byteToInt(in);

        if (this.lineNumberTableLength > 0) {
            LineNumberInfo[] numberInfos = new LineNumberInfo[lineNumberTableLength];
            for (int i = 0; i < lineNumberTableLength; i++) {
                LineNumberInfo numberInfo = new LineNumberInfo(U2.byteToInt(in), U2.byteToInt(in));
                numberInfos[i] = numberInfo;
            }
            this.numberInfoArray = numberInfos;
        }
    }

    public int getLineNumberTableLength() {
        return lineNumberTableLength;
    }

    public void setLineNumberTableLength(int lineNumberTableLength) {
        this.lineNumberTableLength = lineNumberTableLength;
    }

    public LineNumberInfo[] getNumberInfoArray() {
        return numberInfoArray;
    }

    public void setNumberInfoArray(LineNumberInfo[] numberInfoArray) {
        this.numberInfoArray = numberInfoArray;
    }
}
