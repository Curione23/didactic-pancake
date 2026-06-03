package org.apache.commons.compress.utils;

/* JADX INFO: loaded from: classes2.dex */
public class OsgiUtils {
    private static final boolean inOsgiEnvironment = false;

    static {
            java.lang.Class<org.apache.commons.compress.utils.OsgiUtils> r0 = org.apache.commons.compress.utils.OsgiUtils.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            if (r0 == 0) goto L14
            java.lang.Class r0 = r0.getClass()
            boolean r0 = isBundleReference(r0)
            if (r0 == 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            org.apache.commons.compress.utils.OsgiUtils.inOsgiEnvironment = r0
            return
    }

    public OsgiUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean isBundleReference(java.lang.Class<?> r5) {
        L0:
            r0 = 0
            if (r5 == 0) goto L29
            java.lang.String r1 = r5.getName()
            java.lang.String r2 = "org.osgi.framework.BundleReference"
            boolean r1 = r1.equals(r2)
            r2 = 1
            if (r1 == 0) goto L11
            return r2
        L11:
            java.lang.Class[] r1 = r5.getInterfaces()
            int r3 = r1.length
        L16:
            if (r0 >= r3) goto L24
            r4 = r1[r0]
            boolean r4 = isBundleReference(r4)
            if (r4 == 0) goto L21
            return r2
        L21:
            int r0 = r0 + 1
            goto L16
        L24:
            java.lang.Class r5 = r5.getSuperclass()
            goto L0
        L29:
            return r0
    }

    public static boolean isRunningInOsgiEnvironment() {
            boolean r0 = org.apache.commons.compress.utils.OsgiUtils.inOsgiEnvironment
            return r0
    }
}
