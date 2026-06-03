package javassist;

/* JADX INFO: compiled from: ClassPoolTail.java */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/ClassPathList.class */
final class ClassPathList {
    javassist.ClassPathList next;
    javassist.ClassPath path;

    ClassPathList(javassist.ClassPath r4, javassist.ClassPathList r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r5
            r0.next = r1
            r0 = r3
            r1 = r4
            r0.path = r1
            return
    }
}
