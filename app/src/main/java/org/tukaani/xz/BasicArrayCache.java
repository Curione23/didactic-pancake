package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
public class BasicArrayCache extends org.tukaani.xz.ArrayCache {
    private static final int CACHEABLE_SIZE_MIN = 32768;
    private static final int ELEMENTS_PER_STACK = 512;
    private static final int STACKS_MAX = 32;
    private final org.tukaani.xz.BasicArrayCache.CacheMap<byte[]> byteArrayCache;
    private final org.tukaani.xz.BasicArrayCache.CacheMap<int[]> intArrayCache;

    /* JADX INFO: renamed from: org.tukaani.xz.BasicArrayCache$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static class CacheMap<T> extends java.util.LinkedHashMap<java.lang.Integer, org.tukaani.xz.BasicArrayCache.CyclicStack<java.lang.ref.Reference<T>>> {
        private static final long serialVersionUID = 1;

        public CacheMap() {
                r3 = this;
                r0 = 1061158912(0x3f400000, float:0.75)
                r1 = 1
                r2 = 64
                r3.<init>(r2, r0, r1)
                return
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(java.util.Map.Entry<java.lang.Integer, org.tukaani.xz.BasicArrayCache.CyclicStack<java.lang.ref.Reference<T>>> r2) {
                r1 = this;
                int r2 = r1.size()
                r0 = 32
                if (r2 <= r0) goto La
                r2 = 1
                goto Lb
            La:
                r2 = 0
            Lb:
                return r2
        }
    }

    private static class CyclicStack<T> {
        private final T[] elements;
        private int pos;

        private CyclicStack() {
                r1 = this;
                r1.<init>()
                r0 = 512(0x200, float:7.17E-43)
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1.elements = r0
                r0 = 0
                r1.pos = r0
                return
        }

        /* synthetic */ CyclicStack(org.tukaani.xz.BasicArrayCache.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public synchronized T pop() {
                r4 = this;
                monitor-enter(r4)
                T[] r0 = r4.elements     // Catch: java.lang.Throwable -> L12
                int r1 = r4.pos     // Catch: java.lang.Throwable -> L12
                r2 = r0[r1]     // Catch: java.lang.Throwable -> L12
                r3 = 0
                r0[r1] = r3     // Catch: java.lang.Throwable -> L12
                int r1 = r1 + (-1)
                r0 = r1 & 511(0x1ff, float:7.16E-43)
                r4.pos = r0     // Catch: java.lang.Throwable -> L12
                monitor-exit(r4)
                return r2
            L12:
                r0 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
                throw r0
        }

        public synchronized void push(T r3) {
                r2 = this;
                monitor-enter(r2)
                int r0 = r2.pos     // Catch: java.lang.Throwable -> Lf
                int r0 = r0 + 1
                r0 = r0 & 511(0x1ff, float:7.16E-43)
                r2.pos = r0     // Catch: java.lang.Throwable -> Lf
                T[] r1 = r2.elements     // Catch: java.lang.Throwable -> Lf
                r1[r0] = r3     // Catch: java.lang.Throwable -> Lf
                monitor-exit(r2)
                return
            Lf:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
                throw r3
        }
    }

    private static final class LazyHolder {
        static final org.tukaani.xz.BasicArrayCache INSTANCE = null;

        static {
                org.tukaani.xz.BasicArrayCache r0 = new org.tukaani.xz.BasicArrayCache
                r0.<init>()
                org.tukaani.xz.BasicArrayCache.LazyHolder.INSTANCE = r0
                return
        }

        private LazyHolder() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public BasicArrayCache() {
            r1 = this;
            r1.<init>()
            org.tukaani.xz.BasicArrayCache$CacheMap r0 = new org.tukaani.xz.BasicArrayCache$CacheMap
            r0.<init>()
            r1.byteArrayCache = r0
            org.tukaani.xz.BasicArrayCache$CacheMap r0 = new org.tukaani.xz.BasicArrayCache$CacheMap
            r0.<init>()
            r1.intArrayCache = r0
            return
    }

    private static <T> T getArray(org.tukaani.xz.BasicArrayCache.CacheMap<T> r2, int r3) {
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = 0
            if (r3 >= r0) goto L7
            return r1
        L7:
            monitor-enter(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L26
            java.lang.Object r3 = r2.get(r3)     // Catch: java.lang.Throwable -> L26
            org.tukaani.xz.BasicArrayCache$CyclicStack r3 = (org.tukaani.xz.BasicArrayCache.CyclicStack) r3     // Catch: java.lang.Throwable -> L26
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L26
            if (r3 != 0) goto L16
            return r1
        L16:
            java.lang.Object r2 = r3.pop()
            java.lang.ref.Reference r2 = (java.lang.ref.Reference) r2
            if (r2 != 0) goto L1f
            return r1
        L1f:
            java.lang.Object r2 = r2.get()
            if (r2 == 0) goto L16
            return r2
        L26:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L26
            throw r3
    }

    public static org.tukaani.xz.BasicArrayCache getInstance() {
            org.tukaani.xz.BasicArrayCache r0 = org.tukaani.xz.BasicArrayCache.LazyHolder.INSTANCE
            return r0
    }

    private static <T> void putArray(org.tukaani.xz.BasicArrayCache.CacheMap<T> r2, T r3, int r4) {
            r0 = 32768(0x8000, float:4.5918E-41)
            if (r4 >= r0) goto L6
            return
        L6:
            monitor-enter(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r0 = r2.get(r0)     // Catch: java.lang.Throwable -> L2a
            org.tukaani.xz.BasicArrayCache$CyclicStack r0 = (org.tukaani.xz.BasicArrayCache.CyclicStack) r0     // Catch: java.lang.Throwable -> L2a
            if (r0 != 0) goto L20
            org.tukaani.xz.BasicArrayCache$CyclicStack r0 = new org.tukaani.xz.BasicArrayCache$CyclicStack     // Catch: java.lang.Throwable -> L2a
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L2a
            r2.put(r4, r0)     // Catch: java.lang.Throwable -> L2a
        L20:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
            java.lang.ref.SoftReference r2 = new java.lang.ref.SoftReference
            r2.<init>(r3)
            r0.push(r2)
            return
        L2a:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
            throw r3
    }

    @Override // org.tukaani.xz.ArrayCache
    public byte[] getByteArray(int r2, boolean r3) {
            r1 = this;
            org.tukaani.xz.BasicArrayCache$CacheMap<byte[]> r0 = r1.byteArrayCache
            java.lang.Object r0 = getArray(r0, r2)
            byte[] r0 = (byte[]) r0
            if (r0 != 0) goto Ld
            byte[] r0 = new byte[r2]
            goto L13
        Ld:
            if (r3 == 0) goto L13
            r2 = 0
            java.util.Arrays.fill(r0, r2)
        L13:
            return r0
    }

    @Override // org.tukaani.xz.ArrayCache
    public int[] getIntArray(int r2, boolean r3) {
            r1 = this;
            org.tukaani.xz.BasicArrayCache$CacheMap<int[]> r0 = r1.intArrayCache
            java.lang.Object r0 = getArray(r0, r2)
            int[] r0 = (int[]) r0
            if (r0 != 0) goto Ld
            int[] r0 = new int[r2]
            goto L13
        Ld:
            if (r3 == 0) goto L13
            r2 = 0
            java.util.Arrays.fill(r0, r2)
        L13:
            return r0
    }

    @Override // org.tukaani.xz.ArrayCache
    public void putArray(byte[] r3) {
            r2 = this;
            org.tukaani.xz.BasicArrayCache$CacheMap<byte[]> r0 = r2.byteArrayCache
            int r1 = r3.length
            putArray(r0, r3, r1)
            return
    }

    @Override // org.tukaani.xz.ArrayCache
    public void putArray(int[] r3) {
            r2 = this;
            org.tukaani.xz.BasicArrayCache$CacheMap<int[]> r0 = r2.intArrayCache
            int r1 = r3.length
            putArray(r0, r3, r1)
            return
    }
}
