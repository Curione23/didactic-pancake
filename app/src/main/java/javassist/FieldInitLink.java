package javassist;

/* JADX INFO: compiled from: CtClassType.java */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/FieldInitLink.class */
class FieldInitLink {
    javassist.FieldInitLink next;
    javassist.CtField field;
    javassist.CtField.Initializer init;

    FieldInitLink(javassist.CtField r4, javassist.CtField.Initializer r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = 0
            r0.next = r1
            r0 = r3
            r1 = r4
            r0.field = r1
            r0 = r3
            r1 = r5
            r0.init = r1
            return
    }
}
