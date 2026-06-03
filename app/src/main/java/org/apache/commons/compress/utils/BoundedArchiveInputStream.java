package org.apache.commons.compress.utils;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BoundedArchiveInputStream extends java.io.InputStream {
    private final long end;
    private long loc;
    private java.nio.ByteBuffer singleByteBuffer;

    public BoundedArchiveInputStream(long r4, long r6) {
            r3 = this;
            r3.<init>()
            long r0 = r4 + r6
            r3.end = r0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto Le
            r3.loc = r4
            return
        Le:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid length of stream at offset="
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r5 = ", length="
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // java.io.InputStream
    public synchronized int read() throws java.io.IOException {
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.loc     // Catch: java.lang.Throwable -> L38
            long r2 = r5.end     // Catch: java.lang.Throwable -> L38
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = -1
            if (r0 < 0) goto Lc
            monitor-exit(r5)
            return r1
        Lc:
            java.nio.ByteBuffer r0 = r5.singleByteBuffer     // Catch: java.lang.Throwable -> L38
            r2 = 1
            if (r0 != 0) goto L18
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r2)     // Catch: java.lang.Throwable -> L38
            r5.singleByteBuffer = r0     // Catch: java.lang.Throwable -> L38
            goto L1b
        L18:
            r0.rewind()     // Catch: java.lang.Throwable -> L38
        L1b:
            long r3 = r5.loc     // Catch: java.lang.Throwable -> L38
            java.nio.ByteBuffer r0 = r5.singleByteBuffer     // Catch: java.lang.Throwable -> L38
            int r0 = r5.read(r3, r0)     // Catch: java.lang.Throwable -> L38
            if (r0 >= r2) goto L27
            monitor-exit(r5)
            return r1
        L27:
            long r0 = r5.loc     // Catch: java.lang.Throwable -> L38
            r2 = 1
            long r0 = r0 + r2
            r5.loc = r0     // Catch: java.lang.Throwable -> L38
            java.nio.ByteBuffer r0 = r5.singleByteBuffer     // Catch: java.lang.Throwable -> L38
            byte r0 = r0.get()     // Catch: java.lang.Throwable -> L38
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r5)
            return r0
        L38:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L38
            throw r0
    }

    protected abstract int read(long r1, java.nio.ByteBuffer r3) throws java.io.IOException;

    @Override // java.io.InputStream
    public synchronized int read(byte[] r7, int r8, int r9) throws java.io.IOException {
            r6 = this;
            monitor-enter(r6)
            long r0 = r6.loc     // Catch: java.lang.Throwable -> L44
            long r2 = r6.end     // Catch: java.lang.Throwable -> L44
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto Lc
            monitor-exit(r6)
            r7 = -1
            return r7
        Lc:
            long r4 = (long) r9
            long r2 = r2 - r0
            long r0 = java.lang.Math.min(r4, r2)     // Catch: java.lang.Throwable -> L44
            r2 = 0
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 > 0) goto L1b
            monitor-exit(r6)
            r7 = 0
            return r7
        L1b:
            if (r8 < 0) goto L3c
            int r9 = r7.length     // Catch: java.lang.Throwable -> L44
            if (r8 > r9) goto L3c
            int r9 = r7.length     // Catch: java.lang.Throwable -> L44
            int r9 = r9 - r8
            long r2 = (long) r9     // Catch: java.lang.Throwable -> L44
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 > 0) goto L3c
            int r9 = (int) r0     // Catch: java.lang.Throwable -> L44
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.wrap(r7, r8, r9)     // Catch: java.lang.Throwable -> L44
            long r8 = r6.loc     // Catch: java.lang.Throwable -> L44
            int r7 = r6.read(r8, r7)     // Catch: java.lang.Throwable -> L44
            if (r7 <= 0) goto L3a
            long r8 = r6.loc     // Catch: java.lang.Throwable -> L44
            long r0 = (long) r7     // Catch: java.lang.Throwable -> L44
            long r8 = r8 + r0
            r6.loc = r8     // Catch: java.lang.Throwable -> L44
        L3a:
            monitor-exit(r6)
            return r7
        L3c:
            java.lang.IndexOutOfBoundsException r7 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L44
            java.lang.String r8 = "offset or len are out of bounds"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L44
            throw r7     // Catch: java.lang.Throwable -> L44
        L44:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L44
            throw r7
    }
}
