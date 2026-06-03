package javassist.convert;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/convert/TransformAfter.class */
public class TransformAfter extends javassist.convert.TransformBefore {
    public TransformAfter(javassist.convert.Transformer r6, javassist.CtMethod r7, javassist.CtMethod r8) throws javassist.NotFoundException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // javassist.convert.TransformBefore
    protected int match2(int r6, javassist.bytecode.CodeIterator r7) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r7
            r1 = r6
            r0.move(r1)
            r0 = r7
            r1 = r5
            byte[] r1 = r1.saveCode
            int r0 = r0.insert(r1)
            r0 = r7
            r1 = r5
            byte[] r1 = r1.loadCode
            int r0 = r0.insert(r1)
            r0 = r7
            r1 = 3
            int r0 = r0.insertGap(r1)
            r8 = r0
            r0 = r7
            r1 = r8
            r0.setMark(r1)
            r0 = r7
            r1 = r5
            byte[] r1 = r1.loadCode
            int r0 = r0.insert(r1)
            r0 = r7
            int r0 = r0.next()
            r6 = r0
            r0 = r7
            int r0 = r0.getMark()
            r8 = r0
            r0 = r7
            r1 = r7
            r2 = r6
            int r1 = r1.byteAt(r2)
            r2 = r8
            r0.writeByte(r1, r2)
            r0 = r7
            r1 = r7
            r2 = r6
            r3 = 1
            int r2 = r2 + r3
            int r1 = r1.u16bitAt(r2)
            r2 = r8
            r3 = 1
            int r2 = r2 + r3
            r0.write16bit(r1, r2)
            r0 = r7
            r1 = 184(0xb8, float:2.58E-43)
            r2 = r6
            r0.writeByte(r1, r2)
            r0 = r7
            r1 = r5
            int r1 = r1.newIndex
            r2 = r6
            r3 = 1
            int r2 = r2 + r3
            r0.write16bit(r1, r2)
            r0 = r7
            r1 = r8
            r0.move(r1)
            r0 = r7
            int r0 = r0.next()
            return r0
    }
}
