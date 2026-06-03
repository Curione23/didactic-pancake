package moe.yushi.authlibinjector.internal.fi.iki.elonen;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/internal/fi/iki/elonen/ChunkedInputStream.class */
class ChunkedInputStream extends java.io.InputStream {
    private final java.io.InputStream in;
    private int currentRemaining;

    public ChunkedInputStream(java.io.InputStream r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = -1
            r0.currentRemaining = r1
            r0 = r3
            r1 = r4
            r0.in = r1
            return
    }

    @Override // java.io.InputStream
    public synchronized int read() throws java.io.IOException {
            r4 = this;
            r0 = r4
            int r0 = r0.currentRemaining
            r1 = -2
            if (r0 != r1) goto Lb
            r0 = -1
            return r0
        Lb:
            r0 = r4
            int r0 = r0.currentRemaining
            if (r0 != 0) goto L1b
            r0 = r4
            r0.readCRLF()
            r0 = r4
            r1 = -1
            r0.currentRemaining = r1
        L1b:
            r0 = r4
            int r0 = r0.currentRemaining
            r1 = -1
            if (r0 != r1) goto L3e
            r0 = r4
            r1 = r4
            int r1 = r1.readChunkLength()
            r0.currentRemaining = r1
            r0 = r4
            int r0 = r0.currentRemaining
            if (r0 != 0) goto L3e
            r0 = r4
            r0.readCRLF()
            r0 = r4
            r1 = -2
            r0.currentRemaining = r1
            r0 = -1
            return r0
        L3e:
            r0 = r4
            java.io.InputStream r0 = r0.in
            int r0 = r0.read()
            r5 = r0
            r0 = r4
            r1 = r0
            int r1 = r1.currentRemaining
            r2 = 1
            int r1 = r1 - r2
            r0.currentRemaining = r1
            r0 = r5
            r1 = -1
            if (r0 != r1) goto L5d
            java.io.EOFException r0 = new java.io.EOFException
            r1 = r0
            r1.<init>()
            throw r0
        L5d:
            r0 = r5
            return r0
    }

    private int readChunkLength() throws java.io.IOException {
            r5 = this;
            r0 = 0
            r6 = r0
        L2:
            r0 = r5
            java.io.InputStream r0 = r0.in
            int r0 = r0.read()
            r7 = r0
            r0 = r7
            r1 = -1
            if (r0 != r1) goto L17
            java.io.EOFException r0 = new java.io.EOFException
            r1 = r0
            r1.<init>()
            throw r0
        L17:
            r0 = r7
            r1 = 13
            if (r0 != r1) goto L55
            r0 = r5
            java.io.InputStream r0 = r0.in
            int r0 = r0.read()
            r7 = r0
            r0 = r7
            r1 = -1
            if (r0 != r1) goto L32
            java.io.EOFException r0 = new java.io.EOFException
            r1 = r0
            r1.<init>()
            throw r0
        L32:
            r0 = r7
            r1 = 10
            if (r0 != r1) goto L3a
            r0 = r6
            return r0
        L3a:
            java.io.IOException r0 = new java.io.IOException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "LF is expected, read: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r7
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L55:
            r0 = r7
            int r0 = hexDigit(r0)
            r8 = r0
            r0 = r8
            r1 = -1
            if (r0 != r1) goto L7a
            java.io.IOException r0 = new java.io.IOException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Hex digit is expected, read: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r7
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L7a:
            r0 = r6
            r1 = -134217728(0xfffffffff8000000, float:-1.0384594E34)
            r0 = r0 & r1
            if (r0 == 0) goto L8b
            java.io.IOException r0 = new java.io.IOException
            r1 = r0
            java.lang.String r2 = "Chunk is too long"
            r1.<init>(r2)
            throw r0
        L8b:
            r0 = r6
            r1 = 4
            int r0 = r0 << r1
            r6 = r0
            r0 = r6
            r1 = r8
            int r0 = r0 + r1
            r6 = r0
            goto L2
    }

    private void readCRLF() throws java.io.IOException {
            r5 = this;
            r0 = r5
            java.io.InputStream r0 = r0.in
            int r0 = r0.read()
            r6 = r0
            r0 = r5
            java.io.InputStream r0 = r0.in
            int r0 = r0.read()
            r7 = r0
            r0 = r6
            r1 = 13
            if (r0 != r1) goto L1d
            r0 = r7
            r1 = 10
            if (r0 != r1) goto L1d
            return
        L1d:
            r0 = r6
            r1 = -1
            if (r0 == r1) goto L27
            r0 = r7
            r1 = -1
            if (r0 != r1) goto L2f
        L27:
            java.io.EOFException r0 = new java.io.EOFException
            r1 = r0
            r1.<init>()
            throw r0
        L2f:
            java.io.IOException r0 = new java.io.IOException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "CRLF is expected, read: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r7
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    private static int hexDigit(int r3) {
            r0 = r3
            r1 = 48
            if (r0 < r1) goto L11
            r0 = r3
            r1 = 57
            if (r0 > r1) goto L11
            r0 = r3
            r1 = 48
            int r0 = r0 - r1
            return r0
        L11:
            r0 = r3
            r1 = 97
            if (r0 < r1) goto L25
            r0 = r3
            r1 = 102(0x66, float:1.43E-43)
            if (r0 > r1) goto L25
            r0 = r3
            r1 = 97
            int r0 = r0 - r1
            r1 = 10
            int r0 = r0 + r1
            return r0
        L25:
            r0 = r3
            r1 = 65
            if (r0 < r1) goto L39
            r0 = r3
            r1 = 70
            if (r0 > r1) goto L39
            r0 = r3
            r1 = 65
            int r0 = r0 - r1
            r1 = 10
            int r0 = r0 + r1
            return r0
        L39:
            r0 = -1
            return r0
    }

    @Override // java.io.InputStream
    public synchronized int available() throws java.io.IOException {
            r3 = this;
            r0 = r3
            int r0 = r0.currentRemaining
            if (r0 <= 0) goto L16
            r0 = r3
            int r0 = r0.currentRemaining
            r1 = r3
            java.io.InputStream r1 = r1.in
            int r1 = r1.available()
            int r0 = java.lang.Math.min(r0, r1)
            return r0
        L16:
            r0 = 0
            return r0
    }
}
