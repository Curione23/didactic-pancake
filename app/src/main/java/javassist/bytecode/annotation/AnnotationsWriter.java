package javassist.bytecode.annotation;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/annotation/AnnotationsWriter.class */
public class AnnotationsWriter {
    protected java.io.OutputStream output;
    private javassist.bytecode.ConstPool pool;

    public AnnotationsWriter(java.io.OutputStream r4, javassist.bytecode.ConstPool r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.output = r1
            r0 = r3
            r1 = r5
            r0.pool = r1
            return
    }

    public javassist.bytecode.ConstPool getConstPool() {
            r2 = this;
            r0 = r2
            javassist.bytecode.ConstPool r0 = r0.pool
            return r0
    }

    public void close() throws java.io.IOException {
            r2 = this;
            r0 = r2
            java.io.OutputStream r0 = r0.output
            r0.close()
            return
    }

    public void numParameters(int r4) throws java.io.IOException {
            r3 = this;
            r0 = r3
            java.io.OutputStream r0 = r0.output
            r1 = r4
            r0.write(r1)
            return
    }

    public void numAnnotations(int r4) throws java.io.IOException {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.write16bit(r1)
            return
    }

    public void annotation(java.lang.String r5, int r6) throws java.io.IOException {
            r4 = this;
            r0 = r4
            r1 = r4
            javassist.bytecode.ConstPool r1 = r1.pool
            r2 = r5
            int r1 = r1.addUtf8Info(r2)
            r2 = r6
            r0.annotation(r1, r2)
            return
    }

    public void annotation(int r4, int r5) throws java.io.IOException {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.write16bit(r1)
            r0 = r3
            r1 = r5
            r0.write16bit(r1)
            return
    }

    public void memberValuePair(java.lang.String r5) throws java.io.IOException {
            r4 = this;
            r0 = r4
            r1 = r4
            javassist.bytecode.ConstPool r1 = r1.pool
            r2 = r5
            int r1 = r1.addUtf8Info(r2)
            r0.memberValuePair(r1)
            return
    }

    public void memberValuePair(int r4) throws java.io.IOException {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.write16bit(r1)
            return
    }

    public void constValueIndex(boolean r6) throws java.io.IOException {
            r5 = this;
            r0 = r5
            r1 = 90
            r2 = r5
            javassist.bytecode.ConstPool r2 = r2.pool
            r3 = r6
            if (r3 == 0) goto Lf
            r3 = 1
            goto L10
        Lf:
            r3 = 0
        L10:
            int r2 = r2.addIntegerInfo(r3)
            r0.constValueIndex(r1, r2)
            return
    }

    public void constValueIndex(byte r6) throws java.io.IOException {
            r5 = this;
            r0 = r5
            r1 = 66
            r2 = r5
            javassist.bytecode.ConstPool r2 = r2.pool
            r3 = r6
            int r2 = r2.addIntegerInfo(r3)
            r0.constValueIndex(r1, r2)
            return
    }

    public void constValueIndex(char r6) throws java.io.IOException {
            r5 = this;
            r0 = r5
            r1 = 67
            r2 = r5
            javassist.bytecode.ConstPool r2 = r2.pool
            r3 = r6
            int r2 = r2.addIntegerInfo(r3)
            r0.constValueIndex(r1, r2)
            return
    }

    public void constValueIndex(short r6) throws java.io.IOException {
            r5 = this;
            r0 = r5
            r1 = 83
            r2 = r5
            javassist.bytecode.ConstPool r2 = r2.pool
            r3 = r6
            int r2 = r2.addIntegerInfo(r3)
            r0.constValueIndex(r1, r2)
            return
    }

    public void constValueIndex(int r6) throws java.io.IOException {
            r5 = this;
            r0 = r5
            r1 = 73
            r2 = r5
            javassist.bytecode.ConstPool r2 = r2.pool
            r3 = r6
            int r2 = r2.addIntegerInfo(r3)
            r0.constValueIndex(r1, r2)
            return
    }

    public void constValueIndex(long r7) throws java.io.IOException {
            r6 = this;
            r0 = r6
            r1 = 74
            r2 = r6
            javassist.bytecode.ConstPool r2 = r2.pool
            r3 = r7
            int r2 = r2.addLongInfo(r3)
            r0.constValueIndex(r1, r2)
            return
    }

    public void constValueIndex(float r6) throws java.io.IOException {
            r5 = this;
            r0 = r5
            r1 = 70
            r2 = r5
            javassist.bytecode.ConstPool r2 = r2.pool
            r3 = r6
            int r2 = r2.addFloatInfo(r3)
            r0.constValueIndex(r1, r2)
            return
    }

    public void constValueIndex(double r7) throws java.io.IOException {
            r6 = this;
            r0 = r6
            r1 = 68
            r2 = r6
            javassist.bytecode.ConstPool r2 = r2.pool
            r3 = r7
            int r2 = r2.addDoubleInfo(r3)
            r0.constValueIndex(r1, r2)
            return
    }

    public void constValueIndex(java.lang.String r6) throws java.io.IOException {
            r5 = this;
            r0 = r5
            r1 = 115(0x73, float:1.61E-43)
            r2 = r5
            javassist.bytecode.ConstPool r2 = r2.pool
            r3 = r6
            int r2 = r2.addUtf8Info(r3)
            r0.constValueIndex(r1, r2)
            return
    }

    public void constValueIndex(int r4, int r5) throws java.io.IOException {
            r3 = this;
            r0 = r3
            java.io.OutputStream r0 = r0.output
            r1 = r4
            r0.write(r1)
            r0 = r3
            r1 = r5
            r0.write16bit(r1)
            return
    }

    public void enumConstValue(java.lang.String r6, java.lang.String r7) throws java.io.IOException {
            r5 = this;
            r0 = r5
            r1 = r5
            javassist.bytecode.ConstPool r1 = r1.pool
            r2 = r6
            int r1 = r1.addUtf8Info(r2)
            r2 = r5
            javassist.bytecode.ConstPool r2 = r2.pool
            r3 = r7
            int r2 = r2.addUtf8Info(r3)
            r0.enumConstValue(r1, r2)
            return
    }

    public void enumConstValue(int r4, int r5) throws java.io.IOException {
            r3 = this;
            r0 = r3
            java.io.OutputStream r0 = r0.output
            r1 = 101(0x65, float:1.42E-43)
            r0.write(r1)
            r0 = r3
            r1 = r4
            r0.write16bit(r1)
            r0 = r3
            r1 = r5
            r0.write16bit(r1)
            return
    }

    public void classInfoIndex(java.lang.String r5) throws java.io.IOException {
            r4 = this;
            r0 = r4
            r1 = r4
            javassist.bytecode.ConstPool r1 = r1.pool
            r2 = r5
            int r1 = r1.addUtf8Info(r2)
            r0.classInfoIndex(r1)
            return
    }

    public void classInfoIndex(int r4) throws java.io.IOException {
            r3 = this;
            r0 = r3
            java.io.OutputStream r0 = r0.output
            r1 = 99
            r0.write(r1)
            r0 = r3
            r1 = r4
            r0.write16bit(r1)
            return
    }

    public void annotationValue() throws java.io.IOException {
            r3 = this;
            r0 = r3
            java.io.OutputStream r0 = r0.output
            r1 = 64
            r0.write(r1)
            return
    }

    public void arrayValue(int r4) throws java.io.IOException {
            r3 = this;
            r0 = r3
            java.io.OutputStream r0 = r0.output
            r1 = 91
            r0.write(r1)
            r0 = r3
            r1 = r4
            r0.write16bit(r1)
            return
    }

    protected void write16bit(int r5) throws java.io.IOException {
            r4 = this;
            r0 = 2
            byte[] r0 = new byte[r0]
            r6 = r0
            r0 = r5
            r1 = r6
            r2 = 0
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            r0 = r4
            java.io.OutputStream r0 = r0.output
            r1 = r6
            r0.write(r1)
            return
    }
}
