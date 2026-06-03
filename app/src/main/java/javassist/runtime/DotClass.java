package javassist.runtime;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/runtime/DotClass.class */
public class DotClass {
    public DotClass() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static java.lang.NoClassDefFoundError fail(java.lang.ClassNotFoundException r4) {
            java.lang.NoClassDefFoundError r0 = new java.lang.NoClassDefFoundError
            r1 = r0
            r2 = r4
            java.lang.String r2 = r2.getMessage()
            r1.<init>(r2)
            return r0
    }
}
