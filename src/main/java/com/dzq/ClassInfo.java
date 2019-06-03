package com.dzq;

public class ClassInfo {

    private int minorVersion;

    private int majorVersion;

    private int constantPoolCount;

    private ConstantInfo[] constantInfos;

    private boolean isPublic;

    private boolean isFinal;

    private boolean isSuper;

    private boolean isInterface;

    private boolean isAbstract;

    private boolean isSynthetic;

    private boolean isAnnotation;

    private boolean isEnum;

    private int classIndex;

    private int supIndex;

    private int interfaceLength;

    private int[] interfaceIndex;

    private int fieldsCount;

    private FieldInfo[] fieldInfoArray;

    private int methodsCount;

    private int attributesCount;

    public FieldInfo[] getFieldInfoArray() {
        return fieldInfoArray;
    }

    public void setFieldInfoArray(FieldInfo[] fieldInfoArray) {
        this.fieldInfoArray = fieldInfoArray;
    }

    public int getFieldsCount() {
        return fieldsCount;
    }

    public void setFieldsCount(int fieldsCount) {
        this.fieldsCount = fieldsCount;
    }

    public int getMethodsCount() {
        return methodsCount;
    }

    public void setMethodsCount(int methodsCount) {
        this.methodsCount = methodsCount;
    }

    public int getAttributesCount() {
        return attributesCount;
    }

    public void setAttributesCount(int attributesCount) {
        this.attributesCount = attributesCount;
    }

    public int[] getInterfaceIndex() {
        return interfaceIndex;
    }

    public void setInterfaceIndex(int[] interfaceIndex) {
        this.interfaceIndex = interfaceIndex;
    }

    public int getClassIndex() {
        return classIndex;
    }

    public void setClassIndex(int classIndex) {
        this.classIndex = classIndex;
    }

    public int getSupIndex() {
        return supIndex;
    }

    public void setSupIndex(int supIndex) {
        this.supIndex = supIndex;
    }

    public int getInterfaceLength() {
        return interfaceLength;
    }

    public void setInterfaceLength(int interfaceLength) {
        this.interfaceLength = interfaceLength;
    }

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

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public boolean isFinal() {
        return isFinal;
    }

    public void setFinal(boolean aFinal) {
        isFinal = aFinal;
    }

    public boolean isSuper() {
        return isSuper;
    }

    public void setSuper(boolean aSuper) {
        isSuper = aSuper;
    }

    public boolean isInterface() {
        return isInterface;
    }

    public void setInterface(boolean anInterface) {
        isInterface = anInterface;
    }

    public boolean isAbstract() {
        return isAbstract;
    }

    public void setAbstract(boolean anAbstract) {
        isAbstract = anAbstract;
    }

    public boolean isSynthetic() {
        return isSynthetic;
    }

    public void setSynthetic(boolean synthetic) {
        isSynthetic = synthetic;
    }

    public boolean isAnnotation() {
        return isAnnotation;
    }

    public void setAnnotation(boolean annotation) {
        isAnnotation = annotation;
    }

    public boolean isEnum() {
        return isEnum;
    }

    public void setEnum(boolean anEnum) {
        isEnum = anEnum;
    }

    @Override
    public String toString() {

        return "minorVersion=" + minorVersion + "\r\n" +
                "majorVersion=" + majorVersion + "\r\n"+
                "constantPoolCount=" + constantPoolCount + "\r\n"
                ;
    }
}
