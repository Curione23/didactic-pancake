package javassist.tools.reflect;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/tools/reflect/Loader.class */
public class Loader extends javassist.Loader {
    protected javassist.tools.reflect.Reflection reflection;

    public static void main(java.lang.String[] r3) throws java.lang.Throwable {
            javassist.tools.reflect.Loader r0 = new javassist.tools.reflect.Loader
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r4
            r1 = r3
            r0.run(r1)
            return
    }

    public Loader() throws javassist.CannotCompileException, javassist.NotFoundException {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            java.lang.String r1 = "javassist.tools.reflect.Loader"
            r0.delegateLoadingOf(r1)
            r0 = r4
            javassist.tools.reflect.Reflection r1 = new javassist.tools.reflect.Reflection
            r2 = r1
            r2.<init>()
            r0.reflection = r1
            javassist.ClassPool r0 = javassist.ClassPool.getDefault()
            r5 = r0
            r0 = r4
            r1 = r5
            r2 = r4
            javassist.tools.reflect.Reflection r2 = r2.reflection
            r0.addTranslator(r1, r2)
            return
    }

    public boolean makeReflective(java.lang.String r6, java.lang.String r7, java.lang.String r8) throws javassist.CannotCompileException, javassist.NotFoundException {
            r5 = this;
            r0 = r5
            javassist.tools.reflect.Reflection r0 = r0.reflection
            r1 = r6
            r2 = r7
            r3 = r8
            boolean r0 = r0.makeReflective(r1, r2, r3)
            return r0
    }
}
