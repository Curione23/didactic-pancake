package javassist.bytecode.annotation;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/annotation/TypeAnnotationsWriter.class */
public class TypeAnnotationsWriter extends javassist.bytecode.annotation.AnnotationsWriter {
    public TypeAnnotationsWriter(java.io.OutputStream r5, javassist.bytecode.ConstPool r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
    }

    @Override // javassist.bytecode.annotation.AnnotationsWriter
    public void numAnnotations(int r4) throws java.io.IOException {
            r3 = this;
            r0 = r3
            r1 = r4
            super.numAnnotations(r1)
            return
    }

    public void typeParameterTarget(int r4, int r5) throws java.io.IOException {
            r3 = this;
            r0 = r3
            java.io.OutputStream r0 = r0.output
            r1 = r4
            r0.write(r1)
            r0 = r3
            java.io.OutputStream r0 = r0.output
            r1 = r5
            r0.write(r1)
            return
    }

    public void supertypeTarget(int r4) throws java.io.IOException {
            r3 = this;
            r0 = r3
            java.io.OutputStream r0 = r0.output
            r1 = 16
            r0.write(r1)
            r0 = r3
            r1 = r4
            r0.write16bit(r1)
            return
    }

    public void typeParameterBoundTarget(int r4, int r5, int r6) throws java.io.IOException {
            r3 = this;
            r0 = r3
            java.io.OutputStream r0 = r0.output
            r1 = r4
            r0.write(r1)
            r0 = r3
            java.io.OutputStream r0 = r0.output
            r1 = r5
            r0.write(r1)
            r0 = r3
            java.io.OutputStream r0 = r0.output
            r1 = r6
            r0.write(r1)
            return
    }

    public void emptyTarget(int r4) throws java.io.IOException {
            r3 = this;
            r0 = r3
            java.io.OutputStream r0 = r0.output
            r1 = r4
            r0.write(r1)
            return
    }

    public void formalParameterTarget(int r4) throws java.io.IOException {
            r3 = this;
            r0 = r3
            java.io.OutputStream r0 = r0.output
            r1 = 22
            r0.write(r1)
            r0 = r3
            java.io.OutputStream r0 = r0.output
            r1 = r4
            r0.write(r1)
            return
    }

    public void throwsTarget(int r4) throws java.io.IOException {
            r3 = this;
            r0 = r3
            java.io.OutputStream r0 = r0.output
            r1 = 23
            r0.write(r1)
            r0 = r3
            r1 = r4
            r0.write16bit(r1)
            return
    }

    public void localVarTarget(int r4, int r5) throws java.io.IOException {
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

    public void localVarTargetTable(int r4, int r5, int r6) throws java.io.IOException {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.write16bit(r1)
            r0 = r3
            r1 = r5
            r0.write16bit(r1)
            r0 = r3
            r1 = r6
            r0.write16bit(r1)
            return
    }

    public void catchTarget(int r4) throws java.io.IOException {
            r3 = this;
            r0 = r3
            java.io.OutputStream r0 = r0.output
            r1 = 66
            r0.write(r1)
            r0 = r3
            r1 = r4
            r0.write16bit(r1)
            return
    }

    public void offsetTarget(int r4, int r5) throws java.io.IOException {
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

    public void typeArgumentTarget(int r4, int r5, int r6) throws java.io.IOException {
            r3 = this;
            r0 = r3
            java.io.OutputStream r0 = r0.output
            r1 = r4
            r0.write(r1)
            r0 = r3
            r1 = r5
            r0.write16bit(r1)
            r0 = r3
            java.io.OutputStream r0 = r0.output
            r1 = r6
            r0.write(r1)
            return
    }

    public void typePath(int r4) throws java.io.IOException {
            r3 = this;
            r0 = r3
            java.io.OutputStream r0 = r0.output
            r1 = r4
            r0.write(r1)
            return
    }

    public void typePathPath(int r4, int r5) throws java.io.IOException {
            r3 = this;
            r0 = r3
            java.io.OutputStream r0 = r0.output
            r1 = r4
            r0.write(r1)
            r0 = r3
            java.io.OutputStream r0 = r0.output
            r1 = r5
            r0.write(r1)
            return
    }
}
