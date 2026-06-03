package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
class Encoding {
    static final int SIZEOF_BYTE = 8;
    static final int UINT_16_SIZE = 2;
    static final int UINT_32_SIZE = 4;
    static final int UINT_8_SIZE = 1;

    private Encoding() {
            r0 = this;
            r0.<init>()
            return
    }

    static int bitsToBytes(int r0) {
            int r0 = r0 + 7
            r0 = r0 & (-8)
            int r0 = r0 / 8
            return r0
    }

    static byte[] compress(byte[] r3) throws java.io.IOException {
            java.util.zip.Deflater r0 = new java.util.zip.Deflater
            r1 = 1
            r0.<init>(r1)
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            java.util.zip.DeflaterOutputStream r2 = new java.util.zip.DeflaterOutputStream     // Catch: java.lang.Throwable -> L28
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L28
            r2.write(r3)     // Catch: java.lang.Throwable -> L1e
            r2.close()     // Catch: java.lang.Throwable -> L28
            r0.end()
            byte[] r3 = r1.toByteArray()
            return r3
        L1e:
            r3 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L23
            goto L27
        L23:
            r1 = move-exception
            r3.addSuppressed(r1)     // Catch: java.lang.Throwable -> L28
        L27:
            throw r3     // Catch: java.lang.Throwable -> L28
        L28:
            r3 = move-exception
            r0.end()
            throw r3
    }

    static java.lang.RuntimeException error(java.lang.String r1) {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            return r0
    }

    static byte[] read(java.io.InputStream r3, int r4) throws java.io.IOException {
            byte[] r0 = new byte[r4]
            r1 = 0
        L3:
            if (r1 >= r4) goto L23
            int r2 = r4 - r1
            int r2 = r3.read(r0, r1, r2)
            if (r2 < 0) goto Lf
            int r1 = r1 + r2
            goto L3
        Lf:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Not enough bytes to read: "
            r3.<init>(r0)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.RuntimeException r3 = error(r3)
            throw r3
        L23:
            return r0
    }

    static byte[] readCompressed(java.io.InputStream r8, int r9, int r10) throws java.io.IOException {
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L8b
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L8b
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L8b
            if (r6 != 0) goto L56
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L8b
            if (r6 != 0) goto L56
            if (r4 >= r9) goto L56
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L8b
            if (r6 < 0) goto L38
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L8b
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.util.zip.DataFormatException -> L2e java.lang.Throwable -> L8b
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L8b
            java.lang.RuntimeException r8 = error(r8)     // Catch: java.lang.Throwable -> L8b
            throw r8     // Catch: java.lang.Throwable -> L8b
        L38:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8b
            r8.<init>()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            java.lang.StringBuilder r8 = r8.append(r10)     // Catch: java.lang.Throwable -> L8b
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r9 = " bytes"
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L8b
            java.lang.RuntimeException r8 = error(r8)     // Catch: java.lang.Throwable -> L8b
            throw r8     // Catch: java.lang.Throwable -> L8b
        L56:
            if (r4 != r9) goto L69
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L8b
            if (r8 == 0) goto L62
            r0.end()
            return r1
        L62:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.RuntimeException r8 = error(r8)     // Catch: java.lang.Throwable -> L8b
            throw r8     // Catch: java.lang.Throwable -> L8b
        L69:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8b
            r8.<init>()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            java.lang.StringBuilder r8 = r8.append(r10)     // Catch: java.lang.Throwable -> L8b
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r9 = " actual="
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: java.lang.Throwable -> L8b
            java.lang.StringBuilder r8 = r8.append(r4)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L8b
            java.lang.RuntimeException r8 = error(r8)     // Catch: java.lang.Throwable -> L8b
            throw r8     // Catch: java.lang.Throwable -> L8b
        L8b:
            r8 = move-exception
            r0.end()
            throw r8
    }

    static java.lang.String readString(java.io.InputStream r1, int r2) throws java.io.IOException {
            java.lang.String r0 = new java.lang.String
            byte[] r1 = read(r1, r2)
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            r0.<init>(r1, r2)
            return r0
    }

    static long readUInt(java.io.InputStream r6, int r7) throws java.io.IOException {
            byte[] r6 = read(r6, r7)
            r0 = 0
            r2 = 0
        L7:
            if (r2 >= r7) goto L15
            r3 = r6[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            long r3 = (long) r3
            int r5 = r2 * 8
            long r3 = r3 << r5
            long r0 = r0 + r3
            int r2 = r2 + 1
            goto L7
        L15:
            return r0
    }

    static int readUInt16(java.io.InputStream r2) throws java.io.IOException {
            r0 = 2
            long r0 = readUInt(r2, r0)
            int r2 = (int) r0
            return r2
    }

    static long readUInt32(java.io.InputStream r2) throws java.io.IOException {
            r0 = 4
            long r0 = readUInt(r2, r0)
            return r0
    }

    static int readUInt8(java.io.InputStream r2) throws java.io.IOException {
            r0 = 1
            long r0 = readUInt(r2, r0)
            int r2 = (int) r0
            return r2
    }

    static int utf8Length(java.lang.String r1) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r1 = r1.getBytes(r0)
            int r1 = r1.length
            return r1
    }

    static void writeAll(java.io.InputStream r3, java.io.OutputStream r4) throws java.io.IOException {
            r0 = 512(0x200, float:7.17E-43)
            byte[] r0 = new byte[r0]
        L4:
            int r1 = r3.read(r0)
            if (r1 <= 0) goto Lf
            r2 = 0
            r4.write(r0, r2, r1)
            goto L4
        Lf:
            return
    }

    static void writeCompressed(java.io.OutputStream r2, byte[] r3) throws java.io.IOException {
            int r0 = r3.length
            long r0 = (long) r0
            writeUInt32(r2, r0)
            byte[] r3 = compress(r3)
            int r0 = r3.length
            long r0 = (long) r0
            writeUInt32(r2, r0)
            r2.write(r3)
            return
    }

    static void writeString(java.io.OutputStream r1, java.lang.String r2) throws java.io.IOException {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r2 = r2.getBytes(r0)
            r1.write(r2)
            return
    }

    static void writeUInt(java.io.OutputStream r6, long r7, int r9) throws java.io.IOException {
            byte[] r0 = new byte[r9]
            r1 = 0
        L3:
            if (r1 >= r9) goto L13
            int r2 = r1 * 8
            long r2 = r7 >> r2
            r4 = 255(0xff, double:1.26E-321)
            long r2 = r2 & r4
            int r2 = (int) r2
            byte r2 = (byte) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto L3
        L13:
            r6.write(r0)
            return
    }

    static void writeUInt16(java.io.OutputStream r2, int r3) throws java.io.IOException {
            long r0 = (long) r3
            r3 = 2
            writeUInt(r2, r0, r3)
            return
    }

    static void writeUInt32(java.io.OutputStream r1, long r2) throws java.io.IOException {
            r0 = 4
            writeUInt(r1, r2, r0)
            return
    }

    static void writeUInt8(java.io.OutputStream r2, int r3) throws java.io.IOException {
            long r0 = (long) r3
            r3 = 1
            writeUInt(r2, r0, r3)
            return
    }
}
