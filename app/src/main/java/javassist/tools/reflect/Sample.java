package javassist.tools.reflect;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/tools/reflect/Sample.class */
public class Sample {
    private javassist.tools.reflect.Metaobject _metaobject;
    private static javassist.tools.reflect.ClassMetaobject _classobject;

    public Sample() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public java.lang.Object trap(java.lang.Object[] r5, int r6) throws java.lang.Throwable {
            r4 = this;
            r0 = r4
            javassist.tools.reflect.Metaobject r0 = r0._metaobject
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L10
            r0 = r4
            r1 = r6
            r2 = r5
            java.lang.Object r0 = javassist.tools.reflect.ClassMetaobject.invoke(r0, r1, r2)
            return r0
        L10:
            r0 = r7
            r1 = r6
            r2 = r5
            java.lang.Object r0 = r0.trapMethodcall(r1, r2)
            return r0
    }

    public static java.lang.Object trapStatic(java.lang.Object[] r4, int r5) throws java.lang.Throwable {
            javassist.tools.reflect.ClassMetaobject r0 = javassist.tools.reflect.Sample._classobject
            r1 = r5
            r2 = r4
            java.lang.Object r0 = r0.trapMethodcall(r1, r2)
            return r0
    }

    public static java.lang.Object trapRead(java.lang.Object[] r3, java.lang.String r4) {
            r0 = r3
            r1 = 0
            r0 = r0[r1]
            if (r0 != 0) goto Le
            javassist.tools.reflect.ClassMetaobject r0 = javassist.tools.reflect.Sample._classobject
            r1 = r4
            java.lang.Object r0 = r0.trapFieldRead(r1)
            return r0
        Le:
            r0 = r3
            r1 = 0
            r0 = r0[r1]
            javassist.tools.reflect.Metalevel r0 = (javassist.tools.reflect.Metalevel) r0
            javassist.tools.reflect.Metaobject r0 = r0._getMetaobject()
            r1 = r4
            java.lang.Object r0 = r0.trapFieldRead(r1)
            return r0
    }

    public static java.lang.Object trapWrite(java.lang.Object[] r5, java.lang.String r6) {
            r0 = r5
            r1 = 0
            r0 = r0[r1]
            javassist.tools.reflect.Metalevel r0 = (javassist.tools.reflect.Metalevel) r0
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L18
            javassist.tools.reflect.ClassMetaobject r0 = javassist.tools.reflect.Sample._classobject
            r1 = r6
            r2 = r5
            r3 = 1
            r2 = r2[r3]
            r0.trapFieldWrite(r1, r2)
            goto L25
        L18:
            r0 = r7
            javassist.tools.reflect.Metaobject r0 = r0._getMetaobject()
            r1 = r6
            r2 = r5
            r3 = 1
            r2 = r2[r3]
            r0.trapFieldWrite(r1, r2)
        L25:
            r0 = 0
            return r0
    }
}
