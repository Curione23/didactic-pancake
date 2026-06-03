package moe.yushi.authlibinjector.internal.fi.iki.elonen;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/internal/fi/iki/elonen/ChunkedOutputStream.class */
class ChunkedOutputStream extends java.io.FilterOutputStream {
    public ChunkedOutputStream(java.io.OutputStream r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int r6) throws java.io.IOException {
            r5 = this;
            r0 = 1
            byte[] r0 = new byte[r0]
            r1 = r0
            r2 = 0
            r3 = r6
            byte r3 = (byte) r3
            r1[r2] = r3
            r7 = r0
            r0 = r5
            r1 = r7
            r2 = 0
            r3 = 1
            r0.write(r1, r2, r3)
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] r6) throws java.io.IOException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = 0
            r3 = r6
            int r3 = r3.length
            r0.write(r1, r2, r3)
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] r8, int r9, int r10) throws java.io.IOException {
            r7 = this;
            r0 = r10
            if (r0 != 0) goto L5
            return
        L5:
            r0 = r7
            java.io.OutputStream r0 = r0.out
            java.lang.String r1 = "%x\r\n"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r10
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r4] = r5
            java.lang.String r1 = java.lang.String.format(r1, r2)
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.US_ASCII
            byte[] r1 = r1.getBytes(r2)
            r0.write(r1)
            r0 = r7
            java.io.OutputStream r0 = r0.out
            r1 = r8
            r2 = r9
            r3 = r10
            r0.write(r1, r2, r3)
            r0 = r7
            java.io.OutputStream r0 = r0.out
            java.lang.String r1 = "\r\n"
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.US_ASCII
            byte[] r1 = r1.getBytes(r2)
            r0.write(r1)
            return
    }

    public void finish() throws java.io.IOException {
            r4 = this;
            r0 = r4
            java.io.OutputStream r0 = r0.out
            java.lang.String r1 = "0\r\n\r\n"
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.US_ASCII
            byte[] r1 = r1.getBytes(r2)
            r0.write(r1)
            return
    }
}
