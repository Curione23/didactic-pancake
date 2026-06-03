package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
public class ArrayCache {
    private static volatile org.tukaani.xz.ArrayCache defaultCache;
    private static final org.tukaani.xz.ArrayCache dummyCache = null;

    static {
            org.tukaani.xz.ArrayCache r0 = new org.tukaani.xz.ArrayCache
            r0.<init>()
            org.tukaani.xz.ArrayCache.dummyCache = r0
            java.lang.String r1 = "org.tukaani.xz.ArrayCache"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            java.lang.String r2 = "Dummy"
            if (r1 != 0) goto L12
            r1 = r2
        L12:
            r1.hashCode()
            java.lang.String r3 = "Basic"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L41
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L26
            org.tukaani.xz.ArrayCache.defaultCache = r0
            goto L47
        L26:
            java.lang.Error r0 = new java.lang.Error
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unsupported value '"
            r2.<init>(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = "' in the system property org.tukaani.xz.ArrayCache. Supported values: Dummy, Basic"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L41:
            org.tukaani.xz.BasicArrayCache r0 = org.tukaani.xz.BasicArrayCache.getInstance()
            org.tukaani.xz.ArrayCache.defaultCache = r0
        L47:
            return
    }

    public ArrayCache() {
            r0 = this;
            r0.<init>()
            return
    }

    public static org.tukaani.xz.ArrayCache getDefaultCache() {
            org.tukaani.xz.ArrayCache r0 = org.tukaani.xz.ArrayCache.defaultCache
            return r0
    }

    public static org.tukaani.xz.ArrayCache getDummyCache() {
            org.tukaani.xz.ArrayCache r0 = org.tukaani.xz.ArrayCache.dummyCache
            return r0
    }

    public static void setDefaultCache(org.tukaani.xz.ArrayCache r0) {
            r0.getClass()
            org.tukaani.xz.ArrayCache.defaultCache = r0
            return
    }

    public byte[] getByteArray(int r1, boolean r2) {
            r0 = this;
            byte[] r1 = new byte[r1]
            return r1
    }

    public int[] getIntArray(int r1, boolean r2) {
            r0 = this;
            int[] r1 = new int[r1]
            return r1
    }

    public void putArray(byte[] r1) {
            r0 = this;
            return
    }

    public void putArray(int[] r1) {
            r0 = this;
            return
    }
}
