package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
public class ReversedLinesFileReader implements java.io.Closeable {
    private static final int DEFAULT_BLOCK_SIZE = 0;
    private static final java.lang.String EMPTY_STRING = "";
    private final int avoidNewlineSplitBufferSize;
    private final int blockSize;
    private final int byteDecrement;
    private final java.nio.channels.SeekableByteChannel channel;
    private final java.nio.charset.Charset charset;
    private org.apache.commons.io.input.ReversedLinesFileReader.FilePart currentFilePart;
    private final byte[][] newLineSequences;
    private final long totalBlockCount;
    private final long totalByteLength;
    private boolean trailingNewlineOfFileSkipped;

    /* JADX INFO: renamed from: org.apache.commons.io.input.ReversedLinesFileReader$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder extends org.apache.commons.io.build.AbstractStreamBuilder<org.apache.commons.io.input.ReversedLinesFileReader, org.apache.commons.io.input.ReversedLinesFileReader.Builder> {
        public Builder() {
                r1 = this;
                r1.<init>()
                int r0 = org.apache.commons.io.input.ReversedLinesFileReader.access$000()
                r1.setBufferSizeDefault(r0)
                int r0 = org.apache.commons.io.input.ReversedLinesFileReader.access$000()
                r1.setBufferSize(r0)
                return
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public /* bridge */ /* synthetic */ java.lang.Object get() throws java.io.IOException {
                r1 = this;
                org.apache.commons.io.input.ReversedLinesFileReader r0 = r1.get()
                return r0
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public org.apache.commons.io.input.ReversedLinesFileReader get() throws java.io.IOException {
                r4 = this;
                org.apache.commons.io.input.ReversedLinesFileReader r0 = new org.apache.commons.io.input.ReversedLinesFileReader
                java.nio.file.Path r1 = r4.getPath()
                int r2 = r4.getBufferSize()
                java.nio.charset.Charset r3 = r4.getCharset()
                r0.<init>(r1, r2, r3)
                return r0
        }
    }

    private final class FilePart {
        private int currentLastBytePos;
        private final byte[] data;
        private byte[] leftOver;
        private final long no;
        final /* synthetic */ org.apache.commons.io.input.ReversedLinesFileReader this$0;

        private FilePart(org.apache.commons.io.input.ReversedLinesFileReader r7, long r8, int r10, byte[] r11) throws java.io.IOException {
                r6 = this;
                r6.this$0 = r7
                r6.<init>()
                r6.no = r8
                r0 = 0
                if (r11 == 0) goto Lc
                int r1 = r11.length
                goto Ld
            Lc:
                r1 = r0
            Ld:
                int r1 = r1 + r10
                byte[] r1 = new byte[r1]
                r6.data = r1
                r2 = 1
                long r2 = r8 - r2
                int r4 = org.apache.commons.io.input.ReversedLinesFileReader.access$100(r7)
                long r4 = (long) r4
                long r2 = r2 * r4
                r4 = 0
                int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r8 <= 0) goto L40
                java.nio.channels.SeekableByteChannel r8 = org.apache.commons.io.input.ReversedLinesFileReader.access$200(r7)
                r8.position(r2)
                java.nio.channels.SeekableByteChannel r7 = org.apache.commons.io.input.ReversedLinesFileReader.access$200(r7)
                java.nio.ByteBuffer r8 = java.nio.ByteBuffer.wrap(r1, r0, r10)
                int r7 = r7.read(r8)
                if (r7 != r10) goto L38
                goto L40
            L38:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "Count of requested bytes and actually read bytes don't match"
                r7.<init>(r8)
                throw r7
            L40:
                if (r11 == 0) goto L46
                int r7 = r11.length
                java.lang.System.arraycopy(r11, r0, r1, r10, r7)
            L46:
                int r7 = r1.length
                int r7 = r7 + (-1)
                r6.currentLastBytePos = r7
                r7 = 0
                r6.leftOver = r7
                return
        }

        /* synthetic */ FilePart(org.apache.commons.io.input.ReversedLinesFileReader r1, long r2, int r4, byte[] r5, org.apache.commons.io.input.ReversedLinesFileReader.AnonymousClass1 r6) throws java.io.IOException {
                r0 = this;
                r0.<init>(r1, r2, r4, r5)
                return
        }

        static /* synthetic */ java.lang.String access$800(org.apache.commons.io.input.ReversedLinesFileReader.FilePart r0) {
                java.lang.String r0 = r0.readLine()
                return r0
        }

        static /* synthetic */ org.apache.commons.io.input.ReversedLinesFileReader.FilePart access$900(org.apache.commons.io.input.ReversedLinesFileReader.FilePart r0) throws java.io.IOException {
                org.apache.commons.io.input.ReversedLinesFileReader$FilePart r0 = r0.rollOver()
                return r0
        }

        private void createLeftOver() {
                r2 = this;
                int r0 = r2.currentLastBytePos
                int r0 = r0 + 1
                if (r0 <= 0) goto Lf
                byte[] r1 = r2.data
                byte[] r0 = java.util.Arrays.copyOf(r1, r0)
                r2.leftOver = r0
                goto L12
            Lf:
                r0 = 0
                r2.leftOver = r0
            L12:
                r0 = -1
                r2.currentLastBytePos = r0
                return
        }

        private int getNewLineMatchByteCount(byte[] r11, int r12) {
                r10 = this;
                org.apache.commons.io.input.ReversedLinesFileReader r0 = r10.this$0
                byte[][] r0 = org.apache.commons.io.input.ReversedLinesFileReader.access$300(r0)
                int r1 = r0.length
                r2 = 0
                r3 = r2
            L9:
                if (r3 >= r1) goto L2e
                r4 = r0[r3]
                int r5 = r4.length
                r6 = 1
                int r5 = r5 - r6
                r7 = r6
            L11:
                if (r5 < 0) goto L27
                int r8 = r12 + r5
                int r9 = r4.length
                int r9 = r9 - r6
                int r8 = r8 - r9
                if (r8 < 0) goto L22
                r8 = r11[r8]
                r9 = r4[r5]
                if (r8 != r9) goto L22
                r8 = r6
                goto L23
            L22:
                r8 = r2
            L23:
                r7 = r7 & r8
                int r5 = r5 + (-1)
                goto L11
            L27:
                if (r7 == 0) goto L2b
                int r11 = r4.length
                return r11
            L2b:
                int r3 = r3 + 1
                goto L9
            L2e:
                return r2
        }

        private java.lang.String readLine() {
                r7 = this;
                long r0 = r7.no
                r2 = 1
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                r1 = 1
                if (r0 != 0) goto Lb
                r0 = r1
                goto Lc
            Lb:
                r0 = 0
            Lc:
                int r2 = r7.currentLastBytePos
            Le:
                r3 = -1
                r4 = 0
                if (r2 <= r3) goto L67
                if (r0 != 0) goto L20
                org.apache.commons.io.input.ReversedLinesFileReader r3 = r7.this$0
                int r3 = org.apache.commons.io.input.ReversedLinesFileReader.access$400(r3)
                if (r2 >= r3) goto L20
                r7.createLeftOver()
                goto L67
            L20:
                byte[] r3 = r7.data
                int r3 = r7.getNewLineMatchByteCount(r3, r2)
                if (r3 <= 0) goto L5b
                int r5 = r2 + 1
                int r6 = r7.currentLastBytePos
                int r6 = r6 - r5
                int r6 = r6 + r1
                if (r6 < 0) goto L46
                byte[] r1 = r7.data
                int r6 = r6 + r5
                byte[] r1 = java.util.Arrays.copyOfRange(r1, r5, r6)
                java.lang.String r5 = new java.lang.String
                org.apache.commons.io.input.ReversedLinesFileReader r6 = r7.this$0
                java.nio.charset.Charset r6 = org.apache.commons.io.input.ReversedLinesFileReader.access$500(r6)
                r5.<init>(r1, r6)
                int r2 = r2 - r3
                r7.currentLastBytePos = r2
                goto L68
            L46:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Unexpected negative line length="
                r1.<init>(r2)
                java.lang.StringBuilder r1 = r1.append(r6)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L5b:
                org.apache.commons.io.input.ReversedLinesFileReader r3 = r7.this$0
                int r3 = org.apache.commons.io.input.ReversedLinesFileReader.access$600(r3)
                int r2 = r2 - r3
                if (r2 >= 0) goto Le
                r7.createLeftOver()
            L67:
                r5 = r4
            L68:
                if (r0 == 0) goto L7d
                byte[] r0 = r7.leftOver
                if (r0 == 0) goto L7d
                java.lang.String r5 = new java.lang.String
                byte[] r0 = r7.leftOver
                org.apache.commons.io.input.ReversedLinesFileReader r1 = r7.this$0
                java.nio.charset.Charset r1 = org.apache.commons.io.input.ReversedLinesFileReader.access$500(r1)
                r5.<init>(r0, r1)
                r7.leftOver = r4
            L7d:
                return r5
        }

        private org.apache.commons.io.input.ReversedLinesFileReader.FilePart rollOver() throws java.io.IOException {
                r11 = this;
                int r0 = r11.currentLastBytePos
                r1 = -1
                if (r0 > r1) goto L3d
                long r0 = r11.no
                r2 = 1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L1e
                org.apache.commons.io.input.ReversedLinesFileReader$FilePart r4 = new org.apache.commons.io.input.ReversedLinesFileReader$FilePart
                org.apache.commons.io.input.ReversedLinesFileReader r6 = r11.this$0
                long r7 = r0 - r2
                int r9 = org.apache.commons.io.input.ReversedLinesFileReader.access$100(r6)
                byte[] r10 = r11.leftOver
                r5 = r4
                r5.<init>(r6, r7, r9, r10)
                return r4
            L1e:
                byte[] r0 = r11.leftOver
                if (r0 != 0) goto L24
                r0 = 0
                return r0
            L24:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = new java.lang.String
                byte[] r2 = r11.leftOver
                org.apache.commons.io.input.ReversedLinesFileReader r3 = r11.this$0
                java.nio.charset.Charset r3 = org.apache.commons.io.input.ReversedLinesFileReader.access$500(r3)
                r1.<init>(r2, r3)
                java.lang.String r2 = "Unexpected leftover of the last block: leftOverOfThisFilePart="
                java.lang.String r1 = r2.concat(r1)
                r0.<init>(r1)
                throw r0
            L3d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Current currentLastCharPos unexpectedly positive... last readLine() should have returned something! currentLastCharPos="
                r1.<init>(r2)
                int r2 = r11.currentLastBytePos
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }
    }

    static {
            org.apache.commons.io.FileSystem r0 = org.apache.commons.io.FileSystem.getCurrent()
            int r0 = r0.getBlockSize()
            org.apache.commons.io.input.ReversedLinesFileReader.DEFAULT_BLOCK_SIZE = r0
            return
    }

    @java.lang.Deprecated
    public ReversedLinesFileReader(java.io.File r3) throws java.io.IOException {
            r2 = this;
            int r0 = org.apache.commons.io.input.ReversedLinesFileReader.DEFAULT_BLOCK_SIZE
            java.nio.charset.Charset r1 = java.nio.charset.Charset.defaultCharset()
            r2.<init>(r3, r0, r1)
            return
    }

    @java.lang.Deprecated
    public ReversedLinesFileReader(java.io.File r1, int r2, java.lang.String r3) throws java.io.IOException {
            r0 = this;
            java.nio.file.Path r1 = r1.toPath()
            r0.<init>(r1, r2, r3)
            return
    }

    @java.lang.Deprecated
    public ReversedLinesFileReader(java.io.File r1, int r2, java.nio.charset.Charset r3) throws java.io.IOException {
            r0 = this;
            java.nio.file.Path r1 = r1.toPath()
            r0.<init>(r1, r2, r3)
            return
    }

    @java.lang.Deprecated
    public ReversedLinesFileReader(java.io.File r1, java.nio.charset.Charset r2) throws java.io.IOException {
            r0 = this;
            java.nio.file.Path r1 = r1.toPath()
            r0.<init>(r1, r2)
            return
    }

    @java.lang.Deprecated
    public ReversedLinesFileReader(java.nio.file.Path r1, int r2, java.lang.String r3) throws java.io.IOException {
            r0 = this;
            java.nio.charset.Charset r3 = org.apache.commons.io.Charsets.toCharset(r3)
            r0.<init>(r1, r2, r3)
            return
    }

    @java.lang.Deprecated
    public ReversedLinesFileReader(java.nio.file.Path r8, int r9, java.nio.charset.Charset r10) throws java.io.IOException {
            r7 = this;
            r7.<init>()
            r7.blockSize = r9
            java.nio.charset.Charset r0 = org.apache.commons.io.Charsets.toCharset(r10)
            r7.charset = r0
            java.nio.charset.CharsetEncoder r1 = r0.newEncoder()
            float r1 = r1.maxBytesPerChar()
            r2 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r2 = 1
            if (r1 == 0) goto L7f
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            if (r0 != r1) goto L1f
            goto L7f
        L1f:
            java.lang.String r1 = "Shift_JIS"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            if (r0 == r1) goto L7c
            java.lang.String r1 = "windows-31j"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            if (r0 == r1) goto L7c
            java.lang.String r1 = "x-windows-949"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            if (r0 == r1) goto L7c
            java.lang.String r1 = "gbk"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            if (r0 == r1) goto L7c
            java.lang.String r1 = "x-windows-950"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            if (r0 != r1) goto L48
            goto L7c
        L48:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16BE
            if (r0 == r1) goto L78
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16LE
            if (r0 != r1) goto L51
            goto L78
        L51:
            java.nio.charset.Charset r8 = java.nio.charset.StandardCharsets.UTF_16
            if (r0 != r8) goto L5d
            java.io.UnsupportedEncodingException r8 = new java.io.UnsupportedEncodingException
            java.lang.String r9 = "For UTF-16, you need to specify the byte order (use UTF-16BE or UTF-16LE)"
            r8.<init>(r9)
            throw r8
        L5d:
            java.io.UnsupportedEncodingException r8 = new java.io.UnsupportedEncodingException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Encoding "
            r9.<init>(r0)
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r10 = " is not supported yet (feel free to submit a patch)"
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L78:
            r10 = 2
            r7.byteDecrement = r10
            goto L81
        L7c:
            r7.byteDecrement = r2
            goto L81
        L7f:
            r7.byteDecrement = r2
        L81:
            org.apache.commons.io.StandardLineSeparator r10 = org.apache.commons.io.StandardLineSeparator.CRLF
            byte[] r10 = r10.getBytes(r0)
            org.apache.commons.io.StandardLineSeparator r1 = org.apache.commons.io.StandardLineSeparator.LF
            byte[] r1 = r1.getBytes(r0)
            org.apache.commons.io.StandardLineSeparator r3 = org.apache.commons.io.StandardLineSeparator.CR
            byte[] r0 = r3.getBytes(r0)
            byte[][] r10 = new byte[][]{r10, r1, r0}
            r7.newLineSequences = r10
            r0 = 0
            r10 = r10[r0]
            int r10 = r10.length
            r7.avoidNewlineSplitBufferSize = r10
            java.nio.file.OpenOption[] r10 = new java.nio.file.OpenOption[r2]
            java.nio.file.StandardOpenOption r1 = java.nio.file.StandardOpenOption.READ
            r10[r0] = r1
            java.nio.channels.SeekableByteChannel r8 = java.nio.file.Files.newByteChannel(r8, r10)
            r7.channel = r8
            long r0 = r8.size()
            r7.totalByteLength = r0
            long r2 = (long) r9
            long r4 = r0 % r2
            int r8 = (int) r4
            if (r8 <= 0) goto Lbe
            long r0 = r0 / r2
            r9 = 1
            long r0 = r0 + r9
            r7.totalBlockCount = r0
            goto Lca
        Lbe:
            long r2 = r0 / r2
            r7.totalBlockCount = r2
            r2 = 0
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 <= 0) goto Lca
            r4 = r9
            goto Lcb
        Lca:
            r4 = r8
        Lcb:
            org.apache.commons.io.input.ReversedLinesFileReader$FilePart r8 = new org.apache.commons.io.input.ReversedLinesFileReader$FilePart
            long r2 = r7.totalBlockCount
            r5 = 0
            r6 = 0
            r0 = r8
            r1 = r7
            r0.<init>(r1, r2, r4, r5, r6)
            r7.currentFilePart = r8
            return
    }

    @java.lang.Deprecated
    public ReversedLinesFileReader(java.nio.file.Path r2, java.nio.charset.Charset r3) throws java.io.IOException {
            r1 = this;
            int r0 = org.apache.commons.io.input.ReversedLinesFileReader.DEFAULT_BLOCK_SIZE
            r1.<init>(r2, r0, r3)
            return
    }

    static /* synthetic */ int access$000() {
            int r0 = org.apache.commons.io.input.ReversedLinesFileReader.DEFAULT_BLOCK_SIZE
            return r0
    }

    static /* synthetic */ int access$100(org.apache.commons.io.input.ReversedLinesFileReader r0) {
            int r0 = r0.blockSize
            return r0
    }

    static /* synthetic */ java.nio.channels.SeekableByteChannel access$200(org.apache.commons.io.input.ReversedLinesFileReader r0) {
            java.nio.channels.SeekableByteChannel r0 = r0.channel
            return r0
    }

    static /* synthetic */ byte[][] access$300(org.apache.commons.io.input.ReversedLinesFileReader r0) {
            byte[][] r0 = r0.newLineSequences
            return r0
    }

    static /* synthetic */ int access$400(org.apache.commons.io.input.ReversedLinesFileReader r0) {
            int r0 = r0.avoidNewlineSplitBufferSize
            return r0
    }

    static /* synthetic */ java.nio.charset.Charset access$500(org.apache.commons.io.input.ReversedLinesFileReader r0) {
            java.nio.charset.Charset r0 = r0.charset
            return r0
    }

    static /* synthetic */ int access$600(org.apache.commons.io.input.ReversedLinesFileReader r0) {
            int r0 = r0.byteDecrement
            return r0
    }

    public static org.apache.commons.io.input.ReversedLinesFileReader.Builder builder() {
            org.apache.commons.io.input.ReversedLinesFileReader$Builder r0 = new org.apache.commons.io.input.ReversedLinesFileReader$Builder
            r0.<init>()
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            java.nio.channels.SeekableByteChannel r0 = r1.channel
            r0.close()
            return
    }

    public java.lang.String readLine() throws java.io.IOException {
            r2 = this;
            org.apache.commons.io.input.ReversedLinesFileReader$FilePart r0 = r2.currentFilePart
            java.lang.String r0 = org.apache.commons.io.input.ReversedLinesFileReader.FilePart.access$800(r0)
        L6:
            if (r0 != 0) goto L18
            org.apache.commons.io.input.ReversedLinesFileReader$FilePart r1 = r2.currentFilePart
            org.apache.commons.io.input.ReversedLinesFileReader$FilePart r1 = org.apache.commons.io.input.ReversedLinesFileReader.FilePart.access$900(r1)
            r2.currentFilePart = r1
            if (r1 != 0) goto L13
            goto L18
        L13:
            java.lang.String r0 = org.apache.commons.io.input.ReversedLinesFileReader.FilePart.access$800(r1)
            goto L6
        L18:
            java.lang.String r1 = ""
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L2b
            boolean r1 = r2.trailingNewlineOfFileSkipped
            if (r1 != 0) goto L2b
            r0 = 1
            r2.trailingNewlineOfFileSkipped = r0
            java.lang.String r0 = r2.readLine()
        L2b:
            return r0
    }

    public java.util.List<java.lang.String> readLines(int r4) throws java.io.IOException {
            r3 = this;
            if (r4 < 0) goto L18
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r4)
            r1 = 0
        L8:
            if (r1 >= r4) goto L17
            java.lang.String r2 = r3.readLine()
            if (r2 != 0) goto L11
            return r0
        L11:
            r0.add(r2)
            int r1 = r1 + 1
            goto L8
        L17:
            return r0
        L18:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "lineCount < 0"
            r4.<init>(r0)
            throw r4
    }

    public java.lang.String toString(int r3) throws java.io.IOException {
            r2 = this;
            java.util.List r3 = r2.readLines(r3)
            java.util.Collections.reverse(r3)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L10
            java.lang.String r3 = ""
            goto L2d
        L10:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = java.lang.System.lineSeparator()
            java.lang.String r3 = java.lang.String.join(r1, r3)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = java.lang.System.lineSeparator()
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
        L2d:
            return r3
    }
}
