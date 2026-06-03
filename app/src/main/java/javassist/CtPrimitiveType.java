package javassist;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/CtPrimitiveType.class */
public final class CtPrimitiveType extends javassist.CtClass {
    private char descriptor;
    private java.lang.String wrapperName;
    private java.lang.String getMethodName;
    private java.lang.String mDescriptor;
    private int returnOp;
    private int arrayType;
    private int dataSize;

    CtPrimitiveType(java.lang.String r4, char r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, int r9, int r10, int r11) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            r0 = r3
            r1 = r5
            r0.descriptor = r1
            r0 = r3
            r1 = r6
            r0.wrapperName = r1
            r0 = r3
            r1 = r7
            r0.getMethodName = r1
            r0 = r3
            r1 = r8
            r0.mDescriptor = r1
            r0 = r3
            r1 = r9
            r0.returnOp = r1
            r0 = r3
            r1 = r10
            r0.arrayType = r1
            r0 = r3
            r1 = r11
            r0.dataSize = r1
            return
    }

    @Override // javassist.CtClass
    public boolean isPrimitive() {
            r2 = this;
            r0 = 1
            return r0
    }

    @Override // javassist.CtClass
    public int getModifiers() {
            r2 = this;
            r0 = 17
            return r0
    }

    public char getDescriptor() {
            r2 = this;
            r0 = r2
            char r0 = r0.descriptor
            return r0
    }

    public java.lang.String getWrapperName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.wrapperName
            return r0
    }

    public java.lang.String getGetMethodName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.getMethodName
            return r0
    }

    public java.lang.String getGetMethodDescriptor() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.mDescriptor
            return r0
    }

    public int getReturnOp() {
            r2 = this;
            r0 = r2
            int r0 = r0.returnOp
            return r0
    }

    public int getArrayType() {
            r2 = this;
            r0 = r2
            int r0 = r0.arrayType
            return r0
    }

    public int getDataSize() {
            r2 = this;
            r0 = r2
            int r0 = r0.dataSize
            return r0
    }
}
