package javassist.convert;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/convert/Transformer.class */
public abstract class Transformer implements javassist.bytecode.Opcode {
    private javassist.convert.Transformer next;

    public Transformer(javassist.convert.Transformer r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.next = r1
            return
    }

    public javassist.convert.Transformer getNext() {
            r2 = this;
            r0 = r2
            javassist.convert.Transformer r0 = r0.next
            return r0
    }

    public void initialize(javassist.bytecode.ConstPool r2, javassist.bytecode.CodeAttribute r3) {
            r1 = this;
            return
    }

    public void initialize(javassist.bytecode.ConstPool r5, javassist.CtClass r6, javassist.bytecode.MethodInfo r7) throws javassist.CannotCompileException {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r7
            javassist.bytecode.CodeAttribute r2 = r2.getCodeAttribute()
            r0.initialize(r1, r2)
            return
    }

    public void clean() {
            r1 = this;
            return
    }

    public abstract int transform(javassist.CtClass r1, int r2, javassist.bytecode.CodeIterator r3, javassist.bytecode.ConstPool r4) throws javassist.CannotCompileException, javassist.bytecode.BadBytecode;

    public int extraLocals() {
            r2 = this;
            r0 = 0
            return r0
    }

    public int extraStack() {
            r2 = this;
            r0 = 0
            return r0
    }
}
