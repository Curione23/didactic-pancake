package kotlin.io.encoding;

/* JADX INFO: compiled from: Base64IOStream.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0002J(\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tH\u0002J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tH\u0002J\b\u0010\u001d\u001a\u00020\tH\u0016J \u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0016J\b\u0010 \u001a\u00020\tH\u0002J\b\u0010!\u001a\u00020\u0014H\u0002J\b\u0010\"\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lkotlin/io/encoding/DecodeInputStream;", "Ljava/io/InputStream;", "input", "base64", "Lkotlin/io/encoding/Base64;", "(Ljava/io/InputStream;Lkotlin/io/encoding/Base64;)V", "byteBuffer", "", "byteBufferEndIndex", "", "byteBufferLength", "getByteBufferLength", "()I", "byteBufferStartIndex", "isClosed", "", "isEOF", "singleByteBuffer", "symbolBuffer", "close", "", "copyByteBufferInto", "dst", "dstOffset", "length", "decodeSymbolBufferInto", "dstEndIndex", "symbolBufferLength", "handlePaddingSymbol", "read", "destination", "offset", "readNextSymbol", "resetByteBufferIfEmpty", "shiftByteBufferToStartIfNeeded", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DecodeInputStream extends java.io.InputStream {
    private final kotlin.io.encoding.Base64 base64;
    private final byte[] byteBuffer;
    private int byteBufferEndIndex;
    private int byteBufferStartIndex;
    private final java.io.InputStream input;
    private boolean isClosed;
    private boolean isEOF;
    private final byte[] singleByteBuffer;
    private final byte[] symbolBuffer;

    public DecodeInputStream(java.io.InputStream r2, kotlin.io.encoding.Base64 r3) {
            r1 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "base64"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.input = r2
            r1.base64 = r3
            r2 = 1
            byte[] r2 = new byte[r2]
            r1.singleByteBuffer = r2
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r2]
            r1.symbolBuffer = r3
            byte[] r2 = new byte[r2]
            r1.byteBuffer = r2
            return
    }

    private final void copyByteBufferInto(byte[] r4, int r5, int r6) {
            r3 = this;
            byte[] r0 = r3.byteBuffer
            int r1 = r3.byteBufferStartIndex
            int r2 = r1 + r6
            kotlin.collections.ArraysKt.copyInto(r0, r4, r5, r1, r2)
            int r4 = r3.byteBufferStartIndex
            int r4 = r4 + r6
            r3.byteBufferStartIndex = r4
            r3.resetByteBufferIfEmpty()
            return
    }

    private final int decodeSymbolBufferInto(byte[] r8, int r9, int r10, int r11) {
            r7 = this;
            int r6 = r7.byteBufferEndIndex
            kotlin.io.encoding.Base64 r0 = r7.base64
            byte[] r1 = r7.symbolBuffer
            byte[] r2 = r7.byteBuffer
            r4 = 0
            r3 = r6
            r5 = r11
            int r11 = r0.decodeIntoByteArray(r1, r2, r3, r4, r5)
            int r6 = r6 + r11
            r7.byteBufferEndIndex = r6
            int r11 = r7.getByteBufferLength()
            int r10 = r10 - r9
            int r10 = java.lang.Math.min(r11, r10)
            r7.copyByteBufferInto(r8, r9, r10)
            r7.shiftByteBufferToStartIfNeeded()
            return r10
    }

    private final int getByteBufferLength() {
            r2 = this;
            int r0 = r2.byteBufferEndIndex
            int r1 = r2.byteBufferStartIndex
            int r0 = r0 - r1
            return r0
    }

    private final int handlePaddingSymbol(int r5) {
            r4 = this;
            byte[] r0 = r4.symbolBuffer
            r1 = 61
            r0[r5] = r1
            r0 = r5 & 3
            r1 = 2
            if (r0 != r1) goto L1a
            int r0 = r4.readNextSymbol()
            if (r0 < 0) goto L18
            byte[] r2 = r4.symbolBuffer
            int r3 = r5 + 1
            byte r0 = (byte) r0
            r2[r3] = r0
        L18:
            int r5 = r5 + r1
            goto L1c
        L1a:
            int r5 = r5 + 1
        L1c:
            return r5
    }

    private final int readNextSymbol() {
            r2 = this;
            kotlin.io.encoding.Base64 r0 = r2.base64
            boolean r0 = r0.isMimeScheme$kotlin_stdlib()
            if (r0 != 0) goto Lf
            java.io.InputStream r0 = r2.input
            int r0 = r0.read()
            return r0
        Lf:
            java.io.InputStream r0 = r2.input
            int r0 = r0.read()
            r1 = -1
            if (r0 == r1) goto L1e
            boolean r1 = kotlin.io.encoding.Base64Kt.isInMimeAlphabet(r0)
            if (r1 == 0) goto Lf
        L1e:
            return r0
    }

    private final void resetByteBufferIfEmpty() {
            r2 = this;
            int r0 = r2.byteBufferStartIndex
            int r1 = r2.byteBufferEndIndex
            if (r0 != r1) goto Lb
            r0 = 0
            r2.byteBufferStartIndex = r0
            r2.byteBufferEndIndex = r0
        Lb:
            return
    }

    private final void shiftByteBufferToStartIfNeeded() {
            r4 = this;
            byte[] r0 = r4.byteBuffer
            int r1 = r0.length
            int r2 = r4.byteBufferEndIndex
            int r1 = r1 - r2
            byte[] r3 = r4.symbolBuffer
            int r3 = r3.length
            int r3 = r3 / 4
            int r3 = r3 * 3
            if (r3 <= r1) goto L1e
            int r1 = r4.byteBufferStartIndex
            r3 = 0
            kotlin.collections.ArraysKt.copyInto(r0, r0, r3, r1, r2)
            int r0 = r4.byteBufferEndIndex
            int r1 = r4.byteBufferStartIndex
            int r0 = r0 - r1
            r4.byteBufferEndIndex = r0
            r4.byteBufferStartIndex = r3
        L1e:
            return
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            boolean r0 = r1.isClosed
            if (r0 != 0) goto Lc
            r0 = 1
            r1.isClosed = r0
            java.io.InputStream r0 = r1.input
            r0.close()
        Lc:
            return
    }

    @Override // java.io.InputStream
    public int read() {
            r4 = this;
            int r0 = r4.byteBufferStartIndex
            int r1 = r4.byteBufferEndIndex
            r2 = 1
            if (r0 >= r1) goto L14
            byte[] r1 = r4.byteBuffer
            r1 = r1[r0]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r0 = r0 + r2
            r4.byteBufferStartIndex = r0
            r4.resetByteBufferIfEmpty()
            return r1
        L14:
            byte[] r0 = r4.singleByteBuffer
            r1 = 0
            int r0 = r4.read(r0, r1, r2)
            r3 = -1
            if (r0 == r3) goto L33
            if (r0 != r2) goto L27
            byte[] r0 = r4.singleByteBuffer
            r0 = r0[r1]
            r3 = r0 & 255(0xff, float:3.57E-43)
            goto L33
        L27:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unreachable"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L33:
            return r3
    }

    @Override // java.io.InputStream
    public int read(byte[] r10, int r11, int r12) {
            r9 = this;
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            if (r11 < 0) goto L8b
            if (r12 < 0) goto L8b
            int r0 = r11 + r12
            int r1 = r10.length
            if (r0 > r1) goto L8b
            boolean r1 = r9.isClosed
            if (r1 != 0) goto L83
            boolean r1 = r9.isEOF
            r2 = -1
            if (r1 == 0) goto L18
            return r2
        L18:
            r1 = 0
            if (r12 != 0) goto L1c
            return r1
        L1c:
            int r3 = r9.getByteBufferLength()
            if (r3 < r12) goto L26
            r9.copyByteBufferInto(r10, r11, r12)
            return r12
        L26:
            int r3 = r9.getByteBufferLength()
            int r12 = r12 - r3
            int r12 = r12 + 2
            int r12 = r12 / 3
            int r12 = r12 * 4
            r3 = r11
        L32:
            boolean r4 = r9.isEOF
            if (r4 != 0) goto L7b
            if (r12 <= 0) goto L7b
            byte[] r4 = r9.symbolBuffer
            int r4 = r4.length
            int r4 = java.lang.Math.min(r4, r12)
            r5 = r1
        L40:
            boolean r6 = r9.isEOF
            if (r6 != 0) goto L63
            if (r5 >= r4) goto L63
            int r6 = r9.readNextSymbol()
            r7 = 1
            if (r6 == r2) goto L60
            r8 = 61
            if (r6 == r8) goto L59
            byte[] r7 = r9.symbolBuffer
            byte r6 = (byte) r6
            r7[r5] = r6
            int r5 = r5 + 1
            goto L40
        L59:
            int r5 = r9.handlePaddingSymbol(r5)
            r9.isEOF = r7
            goto L40
        L60:
            r9.isEOF = r7
            goto L40
        L63:
            if (r6 != 0) goto L74
            if (r5 != r4) goto L68
            goto L74
        L68:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Check failed."
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L74:
            int r12 = r12 - r5
            int r4 = r9.decodeSymbolBufferInto(r10, r3, r0, r5)
            int r3 = r3 + r4
            goto L32
        L7b:
            if (r3 != r11) goto L80
            if (r4 == 0) goto L80
            goto L82
        L80:
            int r2 = r3 - r11
        L82:
            return r2
        L83:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "The input stream is closed."
            r10.<init>(r11)
            throw r10
        L8b:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "offset: "
            r1.<init>(r2)
            java.lang.StringBuilder r11 = r1.append(r11)
            java.lang.String r1 = ", length: "
            java.lang.StringBuilder r11 = r11.append(r1)
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r12 = ", buffer size: "
            java.lang.StringBuilder r11 = r11.append(r12)
            int r10 = r10.length
            java.lang.StringBuilder r10 = r11.append(r10)
            java.lang.String r10 = r10.toString()
            r0.<init>(r10)
            throw r0
    }
}
