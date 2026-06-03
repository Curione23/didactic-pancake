package javassist.bytecode;

/* JADX INFO: compiled from: ExceptionTable.java */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/ExceptionTableEntry.class */
class ExceptionTableEntry {
    int startPc;
    int endPc;
    int handlerPc;
    int catchType;

    ExceptionTableEntry(int r4, int r5, int r6, int r7) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.startPc = r1
            r0 = r3
            r1 = r5
            r0.endPc = r1
            r0 = r3
            r1 = r6
            r0.handlerPc = r1
            r0 = r3
            r1 = r7
            r0.catchType = r1
            return
    }
}
