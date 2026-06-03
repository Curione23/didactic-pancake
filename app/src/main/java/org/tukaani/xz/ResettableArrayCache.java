package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
public class ResettableArrayCache extends org.tukaani.xz.ArrayCache {
    private final org.tukaani.xz.ArrayCache arrayCache;
    private final java.util.List<byte[]> byteArrays;
    private final java.util.List<int[]> intArrays;

    public ResettableArrayCache(org.tukaani.xz.ArrayCache r2) {
            r1 = this;
            r1.<init>()
            r1.arrayCache = r2
            org.tukaani.xz.ArrayCache r0 = org.tukaani.xz.ArrayCache.getDummyCache()
            if (r2 != r0) goto L11
            r2 = 0
            r1.byteArrays = r2
            r1.intArrays = r2
            goto L1f
        L11:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.byteArrays = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.intArrays = r2
        L1f:
            return
    }

    @Override // org.tukaani.xz.ArrayCache
    public byte[] getByteArray(int r2, boolean r3) {
            r1 = this;
            org.tukaani.xz.ArrayCache r0 = r1.arrayCache
            byte[] r2 = r0.getByteArray(r2, r3)
            java.util.List<byte[]> r3 = r1.byteArrays
            if (r3 == 0) goto L15
            monitor-enter(r3)
            java.util.List<byte[]> r0 = r1.byteArrays     // Catch: java.lang.Throwable -> L12
            r0.add(r2)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            goto L15
        L12:
            r2 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            throw r2
        L15:
            return r2
    }

    @Override // org.tukaani.xz.ArrayCache
    public int[] getIntArray(int r2, boolean r3) {
            r1 = this;
            org.tukaani.xz.ArrayCache r0 = r1.arrayCache
            int[] r2 = r0.getIntArray(r2, r3)
            java.util.List<int[]> r3 = r1.intArrays
            if (r3 == 0) goto L15
            monitor-enter(r3)
            java.util.List<int[]> r0 = r1.intArrays     // Catch: java.lang.Throwable -> L12
            r0.add(r2)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            goto L15
        L12:
            r2 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            throw r2
        L15:
            return r2
    }

    @Override // org.tukaani.xz.ArrayCache
    public void putArray(byte[] r4) {
            r3 = this;
            java.util.List<byte[]> r0 = r3.byteArrays
            if (r0 == 0) goto L1d
            monitor-enter(r0)
            java.util.List<byte[]> r1 = r3.byteArrays     // Catch: java.lang.Throwable -> L1a
            int r1 = r1.lastIndexOf(r4)     // Catch: java.lang.Throwable -> L1a
            r2 = -1
            if (r1 == r2) goto L13
            java.util.List<byte[]> r2 = r3.byteArrays     // Catch: java.lang.Throwable -> L1a
            r2.remove(r1)     // Catch: java.lang.Throwable -> L1a
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            org.tukaani.xz.ArrayCache r0 = r3.arrayCache
            r0.putArray(r4)
            goto L1d
        L1a:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r4
        L1d:
            return
    }

    @Override // org.tukaani.xz.ArrayCache
    public void putArray(int[] r4) {
            r3 = this;
            java.util.List<int[]> r0 = r3.intArrays
            if (r0 == 0) goto L1d
            monitor-enter(r0)
            java.util.List<int[]> r1 = r3.intArrays     // Catch: java.lang.Throwable -> L1a
            int r1 = r1.lastIndexOf(r4)     // Catch: java.lang.Throwable -> L1a
            r2 = -1
            if (r1 == r2) goto L13
            java.util.List<int[]> r2 = r3.intArrays     // Catch: java.lang.Throwable -> L1a
            r2.remove(r1)     // Catch: java.lang.Throwable -> L1a
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            org.tukaani.xz.ArrayCache r0 = r3.arrayCache
            r0.putArray(r4)
            goto L1d
        L1a:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r4
        L1d:
            return
    }

    public void reset() {
            r4 = this;
            java.util.List<byte[]> r0 = r4.byteArrays
            if (r0 == 0) goto L4f
            monitor-enter(r0)
            java.util.List<byte[]> r1 = r4.byteArrays     // Catch: java.lang.Throwable -> L4c
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L4c
            int r1 = r1 + (-1)
        Ld:
            if (r1 < 0) goto L1f
            org.tukaani.xz.ArrayCache r2 = r4.arrayCache     // Catch: java.lang.Throwable -> L4c
            java.util.List<byte[]> r3 = r4.byteArrays     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L4c
            byte[] r3 = (byte[]) r3     // Catch: java.lang.Throwable -> L4c
            r2.putArray(r3)     // Catch: java.lang.Throwable -> L4c
            int r1 = r1 + (-1)
            goto Ld
        L1f:
            java.util.List<byte[]> r1 = r4.byteArrays     // Catch: java.lang.Throwable -> L4c
            r1.clear()     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4c
            java.util.List<int[]> r1 = r4.intArrays
            monitor-enter(r1)
            java.util.List<int[]> r0 = r4.intArrays     // Catch: java.lang.Throwable -> L49
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L49
            int r0 = r0 + (-1)
        L30:
            if (r0 < 0) goto L42
            org.tukaani.xz.ArrayCache r2 = r4.arrayCache     // Catch: java.lang.Throwable -> L49
            java.util.List<int[]> r3 = r4.intArrays     // Catch: java.lang.Throwable -> L49
            java.lang.Object r3 = r3.get(r0)     // Catch: java.lang.Throwable -> L49
            int[] r3 = (int[]) r3     // Catch: java.lang.Throwable -> L49
            r2.putArray(r3)     // Catch: java.lang.Throwable -> L49
            int r0 = r0 + (-1)
            goto L30
        L42:
            java.util.List<int[]> r0 = r4.intArrays     // Catch: java.lang.Throwable -> L49
            r0.clear()     // Catch: java.lang.Throwable -> L49
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L49
            goto L4f
        L49:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L49
            throw r0
        L4c:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4c
            throw r1
        L4f:
            return
    }
}
