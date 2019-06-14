package com.dzq;

public class LineNumberInfo {

    private int startPc;
    private int lineNumber;

    public LineNumberInfo(int startPc, int lineNumber) {
        this.startPc = startPc;
        this.lineNumber = lineNumber;
    }

    public int getStartPc() {
        return startPc;
    }

    public void setStartPc(int startPc) {
        this.startPc = startPc;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }
}
