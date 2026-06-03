package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes2.dex */
public class ClassLoaderUtils {
    private static final java.net.URL[] EMPTY_URL_ARRAY = null;

    static {
            r0 = 0
            java.net.URL[] r0 = new java.net.URL[r0]
            org.apache.commons.lang3.ClassLoaderUtils.EMPTY_URL_ARRAY = r0
            return
    }

    @java.lang.Deprecated
    public ClassLoaderUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.net.URL[] getSystemURLs() {
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()
            java.net.URL[] r0 = getURLs(r0)
            return r0
    }

    public static java.net.URL[] getThreadURLs() {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r0 = r0.getContextClassLoader()
            java.net.URL[] r0 = getURLs(r0)
            return r0
    }

    private static java.net.URL[] getURLs(java.lang.ClassLoader r1) {
            boolean r0 = r1 instanceof java.net.URLClassLoader
            if (r0 == 0) goto Lb
            java.net.URLClassLoader r1 = (java.net.URLClassLoader) r1
            java.net.URL[] r1 = r1.getURLs()
            goto Ld
        Lb:
            java.net.URL[] r1 = org.apache.commons.lang3.ClassLoaderUtils.EMPTY_URL_ARRAY
        Ld:
            return r1
    }

    public static java.lang.String toString(java.lang.ClassLoader r1) {
            boolean r0 = r1 instanceof java.net.URLClassLoader
            if (r0 == 0) goto Lb
            java.net.URLClassLoader r1 = (java.net.URLClassLoader) r1
            java.lang.String r1 = toString(r1)
            return r1
        Lb:
            java.lang.String r1 = java.util.Objects.toString(r1)
            return r1
    }

    public static java.lang.String toString(java.net.URLClassLoader r1) {
            if (r1 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.net.URL[] r1 = r1.getURLs()
            java.lang.String r1 = java.util.Arrays.toString(r1)
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.String r1 = r1.toString()
            goto L1e
        L1c:
            java.lang.String r1 = "null"
        L1e:
            return r1
    }
}
