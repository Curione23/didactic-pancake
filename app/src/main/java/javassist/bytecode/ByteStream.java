package javassist.bytecode;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/ByteStream.class */
final class ByteStream extends java.io.OutputStream {
    private byte[] buf;
    private int count;

    public ByteStream() {
            r3 = this;
            r0 = r3
            r1 = 32
            r0.<init>(r1)
            return
    }

    public ByteStream(int r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            byte[] r1 = new byte[r1]
            r0.buf = r1
            r0 = r3
            r1 = 0
            r0.count = r1
            return
    }

    public int getPos() {
            r2 = this;
            r0 = r2
            int r0 = r0.count
            return r0
    }

    public int size() {
            r2 = this;
            r0 = r2
            int r0 = r0.count
            return r0
    }

    public void writeBlank(int r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.enlarge(r1)
            r0 = r4
            r1 = r0
            int r1 = r1.count
            r2 = r5
            int r1 = r1 + r2
            r0.count = r1
            return
    }

    @Override // java.io.OutputStream
    public void write(byte[] r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = 0
            r3 = r6
            int r3 = r3.length
            r0.write(r1, r2, r3)
            return
    }

    @Override // java.io.OutputStream
    public void write(byte[] r7, int r8, int r9) {
            r6 = this;
            r0 = r6
            r1 = r9
            r0.enlarge(r1)
            r0 = r7
            r1 = r8
            r2 = r6
            byte[] r2 = r2.buf
            r3 = r6
            int r3 = r3.count
            r4 = r9
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r6
            r1 = r0
            int r1 = r1.count
            r2 = r9
            int r1 = r1 + r2
            r0.count = r1
            return
    }

    @Override // java.io.OutputStream
    public void write(int r5) {
            r4 = this;
            r0 = r4
            r1 = 1
            r0.enlarge(r1)
            r0 = r4
            int r0 = r0.count
            r6 = r0
            r0 = r4
            byte[] r0 = r0.buf
            r1 = r6
            r2 = r5
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r4
            r1 = r6
            r2 = 1
            int r1 = r1 + r2
            r0.count = r1
            return
    }

    public void writeShort(int r6) {
            r5 = this;
            r0 = r5
            r1 = 2
            r0.enlarge(r1)
            r0 = r5
            int r0 = r0.count
            r7 = r0
            r0 = r5
            byte[] r0 = r0.buf
            r1 = r7
            r2 = r6
            r3 = 8
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r5
            byte[] r0 = r0.buf
            r1 = r7
            r2 = 1
            int r1 = r1 + r2
            r2 = r6
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r5
            r1 = r7
            r2 = 2
            int r1 = r1 + r2
            r0.count = r1
            return
    }

    public void writeInt(int r6) {
            r5 = this;
            r0 = r5
            r1 = 4
            r0.enlarge(r1)
            r0 = r5
            int r0 = r0.count
            r7 = r0
            r0 = r5
            byte[] r0 = r0.buf
            r1 = r7
            r2 = r6
            r3 = 24
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r5
            byte[] r0 = r0.buf
            r1 = r7
            r2 = 1
            int r1 = r1 + r2
            r2 = r6
            r3 = 16
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r5
            byte[] r0 = r0.buf
            r1 = r7
            r2 = 2
            int r1 = r1 + r2
            r2 = r6
            r3 = 8
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r5
            byte[] r0 = r0.buf
            r1 = r7
            r2 = 3
            int r1 = r1 + r2
            r2 = r6
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r5
            r1 = r7
            r2 = 4
            int r1 = r1 + r2
            r0.count = r1
            return
    }

    public void writeLong(long r7) {
            r6 = this;
            r0 = r6
            r1 = 8
            r0.enlarge(r1)
            r0 = r6
            int r0 = r0.count
            r9 = r0
            r0 = r6
            byte[] r0 = r0.buf
            r1 = r9
            r2 = r7
            r3 = 56
            long r2 = r2 >>> r3
            int r2 = (int) r2
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r6
            byte[] r0 = r0.buf
            r1 = r9
            r2 = 1
            int r1 = r1 + r2
            r2 = r7
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r6
            byte[] r0 = r0.buf
            r1 = r9
            r2 = 2
            int r1 = r1 + r2
            r2 = r7
            r3 = 40
            long r2 = r2 >>> r3
            int r2 = (int) r2
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r6
            byte[] r0 = r0.buf
            r1 = r9
            r2 = 3
            int r1 = r1 + r2
            r2 = r7
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r6
            byte[] r0 = r0.buf
            r1 = r9
            r2 = 4
            int r1 = r1 + r2
            r2 = r7
            r3 = 24
            long r2 = r2 >>> r3
            int r2 = (int) r2
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r6
            byte[] r0 = r0.buf
            r1 = r9
            r2 = 5
            int r1 = r1 + r2
            r2 = r7
            r3 = 16
            long r2 = r2 >>> r3
            int r2 = (int) r2
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r6
            byte[] r0 = r0.buf
            r1 = r9
            r2 = 6
            int r1 = r1 + r2
            r2 = r7
            r3 = 8
            long r2 = r2 >>> r3
            int r2 = (int) r2
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r6
            byte[] r0 = r0.buf
            r1 = r9
            r2 = 7
            int r1 = r1 + r2
            r2 = r7
            int r2 = (int) r2
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r6
            r1 = r9
            r2 = 8
            int r1 = r1 + r2
            r0.count = r1
            return
    }

    public void writeFloat(float r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            int r1 = java.lang.Float.floatToIntBits(r1)
            r0.writeInt(r1)
            return
    }

    public void writeDouble(double r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            long r1 = java.lang.Double.doubleToLongBits(r1)
            r0.writeLong(r1)
            return
    }

    public void writeUTF(java.lang.String r6) {
            r5 = this;
            r0 = r6
            int r0 = r0.length()
            r7 = r0
            r0 = r5
            int r0 = r0.count
            r8 = r0
            r0 = r5
            r1 = r7
            r2 = 2
            int r1 = r1 + r2
            r0.enlarge(r1)
            r0 = r5
            byte[] r0 = r0.buf
            r9 = r0
            r0 = r9
            r1 = r8
            int r8 = r8 + 1
            r2 = r7
            r3 = 8
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r9
            r1 = r8
            int r8 = r8 + 1
            r2 = r7
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = 0
            r10 = r0
        L2f:
            r0 = r10
            r1 = r7
            if (r0 >= r1) goto L66
            r0 = r6
            r1 = r10
            char r0 = r0.charAt(r1)
            r11 = r0
            r0 = 1
            r1 = r11
            if (r0 > r1) goto L57
            r0 = r11
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 > r1) goto L57
            r0 = r9
            r1 = r8
            int r8 = r8 + 1
            r2 = r11
            byte r2 = (byte) r2
            r0[r1] = r2
            goto L60
        L57:
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r10
            r0.writeUTF2(r1, r2, r3)
            return
        L60:
            int r10 = r10 + 1
            goto L2f
        L66:
            r0 = r5
            r1 = r8
            r0.count = r1
            return
    }

    private void writeUTF2(java.lang.String r7, int r8, int r9) {
            r6 = this;
            r0 = r8
            r10 = r0
            r0 = r9
            r11 = r0
        L6:
            r0 = r11
            r1 = r8
            if (r0 >= r1) goto L37
            r0 = r7
            r1 = r11
            char r0 = r0.charAt(r1)
            r12 = r0
            r0 = r12
            r1 = 2047(0x7ff, float:2.868E-42)
            if (r0 <= r1) goto L22
            int r10 = r10 + 2
            goto L31
        L22:
            r0 = r12
            if (r0 == 0) goto L2e
            r0 = r12
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 <= r1) goto L31
        L2e:
            int r10 = r10 + 1
        L31:
            int r11 = r11 + 1
            goto L6
        L37:
            r0 = r10
            r1 = 65535(0xffff, float:9.1834E-41)
            if (r0 <= r1) goto L63
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "encoded string too long: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r8
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r10
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " bytes"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L63:
            r0 = r6
            r1 = r10
            r2 = 2
            int r1 = r1 + r2
            r0.enlarge(r1)
            r0 = r6
            int r0 = r0.count
            r11 = r0
            r0 = r6
            byte[] r0 = r0.buf
            r12 = r0
            r0 = r12
            r1 = r11
            r2 = r10
            r3 = 8
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r12
            r1 = r11
            r2 = 1
            int r1 = r1 + r2
            r2 = r10
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r11
            r1 = 2
            r2 = r9
            int r1 = r1 + r2
            int r0 = r0 + r1
            r11 = r0
            r0 = r9
            r13 = r0
        L97:
            r0 = r13
            r1 = r8
            if (r0 >= r1) goto L131
            r0 = r7
            r1 = r13
            char r0 = r0.charAt(r1)
            r14 = r0
            r0 = 1
            r1 = r14
            if (r0 > r1) goto Lc0
            r0 = r14
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 > r1) goto Lc0
            r0 = r12
            r1 = r11
            int r11 = r11 + 1
            r2 = r14
            byte r2 = (byte) r2
            r0[r1] = r2
            goto L12b
        Lc0:
            r0 = r14
            r1 = 2047(0x7ff, float:2.868E-42)
            if (r0 <= r1) goto L105
            r0 = r12
            r1 = r11
            r2 = 224(0xe0, float:3.14E-43)
            r3 = r14
            r4 = 12
            int r3 = r3 >> r4
            r4 = 15
            r3 = r3 & r4
            r2 = r2 | r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r12
            r1 = r11
            r2 = 1
            int r1 = r1 + r2
            r2 = 128(0x80, float:1.8E-43)
            r3 = r14
            r4 = 6
            int r3 = r3 >> r4
            r4 = 63
            r3 = r3 & r4
            r2 = r2 | r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r12
            r1 = r11
            r2 = 2
            int r1 = r1 + r2
            r2 = 128(0x80, float:1.8E-43)
            r3 = r14
            r4 = 63
            r3 = r3 & r4
            r2 = r2 | r3
            byte r2 = (byte) r2
            r0[r1] = r2
            int r11 = r11 + 3
            goto L12b
        L105:
            r0 = r12
            r1 = r11
            r2 = 192(0xc0, float:2.69E-43)
            r3 = r14
            r4 = 6
            int r3 = r3 >> r4
            r4 = 31
            r3 = r3 & r4
            r2 = r2 | r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r12
            r1 = r11
            r2 = 1
            int r1 = r1 + r2
            r2 = 128(0x80, float:1.8E-43)
            r3 = r14
            r4 = 63
            r3 = r3 & r4
            r2 = r2 | r3
            byte r2 = (byte) r2
            r0[r1] = r2
            int r11 = r11 + 2
        L12b:
            int r13 = r13 + 1
            goto L97
        L131:
            r0 = r6
            r1 = r11
            r0.count = r1
            return
    }

    public void write(int r5, int r6) {
            r4 = this;
            r0 = r4
            byte[] r0 = r0.buf
            r1 = r5
            r2 = r6
            byte r2 = (byte) r2
            r0[r1] = r2
            return
    }

    public void writeShort(int r6, int r7) {
            r5 = this;
            r0 = r5
            byte[] r0 = r0.buf
            r1 = r6
            r2 = r7
            r3 = 8
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r5
            byte[] r0 = r0.buf
            r1 = r6
            r2 = 1
            int r1 = r1 + r2
            r2 = r7
            byte r2 = (byte) r2
            r0[r1] = r2
            return
    }

    public void writeInt(int r6, int r7) {
            r5 = this;
            r0 = r5
            byte[] r0 = r0.buf
            r1 = r6
            r2 = r7
            r3 = 24
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r5
            byte[] r0 = r0.buf
            r1 = r6
            r2 = 1
            int r1 = r1 + r2
            r2 = r7
            r3 = 16
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r5
            byte[] r0 = r0.buf
            r1 = r6
            r2 = 2
            int r1 = r1 + r2
            r2 = r7
            r3 = 8
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r5
            byte[] r0 = r0.buf
            r1 = r6
            r2 = 3
            int r1 = r1 + r2
            r2 = r7
            byte r2 = (byte) r2
            r0[r1] = r2
            return
    }

    public byte[] toByteArray() {
            r6 = this;
            r0 = r6
            int r0 = r0.count
            byte[] r0 = new byte[r0]
            r7 = r0
            r0 = r6
            byte[] r0 = r0.buf
            r1 = 0
            r2 = r7
            r3 = 0
            r4 = r6
            int r4 = r4.count
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r7
            return r0
    }

    public void writeTo(java.io.OutputStream r6) throws java.io.IOException {
            r5 = this;
            r0 = r6
            r1 = r5
            byte[] r1 = r1.buf
            r2 = 0
            r3 = r5
            int r3 = r3.count
            r0.write(r1, r2, r3)
            return
    }

    public void enlarge(int r7) {
            r6 = this;
            r0 = r6
            int r0 = r0.count
            r1 = r7
            int r0 = r0 + r1
            r8 = r0
            r0 = r8
            r1 = r6
            byte[] r1 = r1.buf
            int r1 = r1.length
            if (r0 <= r1) goto L3b
            r0 = r6
            byte[] r0 = r0.buf
            int r0 = r0.length
            r1 = 1
            int r0 = r0 << r1
            r9 = r0
            r0 = r9
            r1 = r8
            if (r0 <= r1) goto L21
            r0 = r9
            goto L22
        L21:
            r0 = r8
        L22:
            byte[] r0 = new byte[r0]
            r10 = r0
            r0 = r6
            byte[] r0 = r0.buf
            r1 = 0
            r2 = r10
            r3 = 0
            r4 = r6
            int r4 = r4.count
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r6
            r1 = r10
            r0.buf = r1
        L3b:
            return
    }
}
