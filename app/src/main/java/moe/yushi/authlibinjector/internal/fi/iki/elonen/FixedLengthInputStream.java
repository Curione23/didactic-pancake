package moe.yushi.authlibinjector.internal.fi.iki.elonen;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/internal/fi/iki/elonen/FixedLengthInputStream.class */
class FixedLengthInputStream extends java.io.InputStream {
    private final java.io.InputStream in;
    private long remaining;

    public FixedLengthInputStream(java.io.InputStream r5, long r6) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = 0
            r0.remaining = r1
            r0 = r4
            r1 = r6
            r0.remaining = r1
            r0 = r4
            r1 = r5
            r0.in = r1
            return
    }

    @Override // java.io.InputStream
    public synchronized int read() throws java.io.IOException {
            r6 = this;
            r0 = r6
            long r0 = r0.remaining
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L2a
            r0 = r6
            java.io.InputStream r0 = r0.in
            int r0 = r0.read()
            r7 = r0
            r0 = r7
            r1 = -1
            if (r0 != r1) goto L1e
            java.io.EOFException r0 = new java.io.EOFException
            r1 = r0
            r1.<init>()
            throw r0
        L1e:
            r0 = r6
            r1 = r0
            long r1 = r1.remaining
            r2 = 1
            long r1 = r1 - r2
            r0.remaining = r1
            r0 = r7
            return r0
        L2a:
            r0 = -1
            return r0
    }

    @Override // java.io.InputStream
    public synchronized int available() throws java.io.IOException {
            r4 = this;
            r0 = r4
            java.io.InputStream r0 = r0.in
            int r0 = r0.available()
            r1 = r4
            long r1 = r1.remaining
            int r1 = (int) r1
            int r0 = java.lang.Math.min(r0, r1)
            return r0
    }
}
