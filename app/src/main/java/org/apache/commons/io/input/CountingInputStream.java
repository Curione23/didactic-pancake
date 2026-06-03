package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class CountingInputStream extends org.apache.commons.io.input.ProxyInputStream {
    private long count;

    public CountingInputStream(java.io.InputStream r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // org.apache.commons.io.input.ProxyInputStream
    protected synchronized void afterRead(int r5) throws java.io.IOException {
            r4 = this;
            monitor-enter(r4)
            r0 = -1
            if (r5 == r0) goto Le
            long r0 = r4.count     // Catch: java.lang.Throwable -> Lb
            long r2 = (long) r5     // Catch: java.lang.Throwable -> Lb
            long r0 = r0 + r2
            r4.count = r0     // Catch: java.lang.Throwable -> Lb
            goto Le
        Lb:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb
            throw r5
        Le:
            monitor-exit(r4)
            return
    }

    public synchronized long getByteCount() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.count     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    @java.lang.Deprecated
    public int getCount() {
            r5 = this;
            long r0 = r5.getByteCount()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto Ld
            int r0 = (int) r0
            return r0
        Ld:
            java.lang.ArithmeticException r2 = new java.lang.ArithmeticException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "The byte count "
            r3.<init>(r4)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r1 = " is too large to be converted to an int"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
    }

    public synchronized long resetByteCount() {
            r4 = this;
            monitor-enter(r4)
            long r0 = r4.count     // Catch: java.lang.Throwable -> L9
            r2 = 0
            r4.count = r2     // Catch: java.lang.Throwable -> L9
            monitor-exit(r4)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    @java.lang.Deprecated
    public int resetCount() {
            r5 = this;
            long r0 = r5.resetByteCount()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto Ld
            int r0 = (int) r0
            return r0
        Ld:
            java.lang.ArithmeticException r2 = new java.lang.ArithmeticException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "The byte count "
            r3.<init>(r4)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r1 = " is too large to be converted to an int"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long r3) throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            long r3 = super.skip(r3)     // Catch: java.lang.Throwable -> Lc
            long r0 = r2.count     // Catch: java.lang.Throwable -> Lc
            long r0 = r0 + r3
            r2.count = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return r3
        Lc:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
    }
}
