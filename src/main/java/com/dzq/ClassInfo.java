package com.dzq;

public class ClassInfo {

    private int minorVersion;

    private int majorVersion;

    private int constantPoolCount;

    private ConstantInfo[] constantInfos;

    public int getMinorVersion() {
        return minorVersion;
    }

    public void setMinorVersion(int minorVersion) {
        this.minorVersion = minorVersion;
    }

    public int getMajorVersion() {
        return majorVersion;
    }

    public void setMajorVersion(int majorVersion) {
        this.majorVersion = majorVersion;
    }

    public int getConstantPoolCount() {
        return constantPoolCount;
    }

    public void setConstantPoolCount(int constantPoolCount) {
        this.constantPoolCount = constantPoolCount;
    }

    public ConstantInfo[] getConstantInfos() {
        return constantInfos;
    }

    public void setConstantInfos(ConstantInfo[] constantInfos) {
        this.constantInfos = constantInfos;
    }

    @Override
    public String toString() {

        return "minorVersion=" + minorVersion + "\r\n" +
                "majorVersion=" + majorVersion + "\r\n"+
                "constantPoolCount=" + constantPoolCount + "\r\n"
                ;
    }
}
