package org.apache.commons.io.input.buffer;

/* JADX INFO: loaded from: classes2.dex */
public class CircularByteBuffer {
    private final byte[] buffer;
    private int currentNumberOfBytes;
    private int endOffset;
    private int startOffset;

    public CircularByteBuffer() {
            r1 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r0)
            return
    }

    public CircularByteBuffer(int r1) {
            r0 = this;
            r0.<init>()
            byte[] r1 = org.apache.commons.io.IOUtils.byteArray(r1)
            r0.buffer = r1
            r1 = 0
            r0.startOffset = r1
            r0.endOffset = r1
            r0.currentNumberOfBytes = r1
            return
    }

    public void add(byte r4) {
            r3 = this;
            int r0 = r3.currentNumberOfBytes
            byte[] r1 = r3.buffer
            int r2 = r1.length
            if (r0 >= r2) goto L1a
            int r2 = r3.endOffset
            r1[r2] = r4
            int r0 = r0 + 1
            r3.currentNumberOfBytes = r0
            int r2 = r2 + 1
            r3.endOffset = r2
            int r4 = r1.length
            if (r2 != r4) goto L19
            r4 = 0
            r3.endOffset = r4
        L19:
            return
        L1a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "No space available"
            r4.<init>(r0)
            throw r4
    }

    public void add(byte[] r6, int r7, int r8) {
            r5 = this;
            java.lang.String r0 = "Buffer"
            java.util.Objects.requireNonNull(r6, r0)
            if (r7 < 0) goto L51
            int r0 = r6.length
            if (r7 >= r0) goto L51
            if (r8 < 0) goto L3c
            int r0 = r5.currentNumberOfBytes
            int r0 = r0 + r8
            byte[] r1 = r5.buffer
            int r1 = r1.length
            if (r0 > r1) goto L34
            r0 = 0
            r1 = r0
        L16:
            if (r1 >= r8) goto L2e
            byte[] r2 = r5.buffer
            int r3 = r5.endOffset
            int r4 = r7 + r1
            r4 = r6[r4]
            r2[r3] = r4
            int r3 = r3 + 1
            r5.endOffset = r3
            int r2 = r2.length
            if (r3 != r2) goto L2b
            r5.endOffset = r0
        L2b:
            int r1 = r1 + 1
            goto L16
        L2e:
            int r6 = r5.currentNumberOfBytes
            int r6 = r6 + r8
            r5.currentNumberOfBytes = r6
            return
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "No space available"
            r6.<init>(r7)
            throw r6
        L3c:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Illegal length: "
            r7.<init>(r0)
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L51:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Illegal offset: "
            r8.<init>(r0)
            java.lang.StringBuilder r7 = r8.append(r7)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
    }

    public void clear() {
            r1 = this;
            r0 = 0
            r1.startOffset = r0
            r1.endOffset = r0
            r1.currentNumberOfBytes = r0
            return
    }

    public int getCurrentNumberOfBytes() {
            r1 = this;
            int r0 = r1.currentNumberOfBytes
            return r0
    }

    public int getSpace() {
            r2 = this;
            byte[] r0 = r2.buffer
            int r0 = r0.length
            int r1 = r2.currentNumberOfBytes
            int r0 = r0 - r1
            return r0
    }

    public boolean hasBytes() {
            r1 = this;
            int r0 = r1.currentNumberOfBytes
            if (r0 <= 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean hasSpace() {
            r2 = this;
            int r0 = r2.currentNumberOfBytes
            byte[] r1 = r2.buffer
            int r1 = r1.length
            if (r0 >= r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public boolean hasSpace(int r2) {
            r1 = this;
            int r0 = r1.currentNumberOfBytes
            int r0 = r0 + r2
            byte[] r2 = r1.buffer
            int r2 = r2.length
            if (r0 > r2) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            return r2
    }

    public boolean peek(byte[] r7, int r8, int r9) {
            r6 = this;
            java.lang.String r0 = "Buffer"
            java.util.Objects.requireNonNull(r7, r0)
            if (r8 < 0) goto L47
            int r0 = r7.length
            if (r8 >= r0) goto L47
            if (r9 < 0) goto L32
            byte[] r0 = r6.buffer
            int r0 = r0.length
            if (r9 > r0) goto L32
            int r0 = r6.currentNumberOfBytes
            r1 = 0
            if (r9 >= r0) goto L17
            return r1
        L17:
            int r0 = r6.startOffset
            r2 = r1
        L1a:
            if (r2 >= r9) goto L30
            byte[] r3 = r6.buffer
            r4 = r3[r0]
            int r5 = r2 + r8
            r5 = r7[r5]
            if (r4 == r5) goto L27
            return r1
        L27:
            int r0 = r0 + 1
            int r3 = r3.length
            if (r0 != r3) goto L2d
            r0 = r1
        L2d:
            int r2 = r2 + 1
            goto L1a
        L30:
            r7 = 1
            return r7
        L32:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Illegal length: "
            r8.<init>(r0)
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L47:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Illegal offset: "
            r9.<init>(r0)
            java.lang.StringBuilder r8 = r9.append(r8)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }

    public byte read() {
            r4 = this;
            int r0 = r4.currentNumberOfBytes
            if (r0 <= 0) goto L19
            byte[] r1 = r4.buffer
            int r2 = r4.startOffset
            r3 = r1[r2]
            int r0 = r0 + (-1)
            r4.currentNumberOfBytes = r0
            int r2 = r2 + 1
            r4.startOffset = r2
            int r0 = r1.length
            if (r2 != r0) goto L18
            r0 = 0
            r4.startOffset = r0
        L18:
            return r3
        L19:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No bytes available."
            r0.<init>(r1)
            throw r0
    }

    public void read(byte[] r7, int r8, int r9) {
            r6 = this;
            java.lang.String r0 = "targetBuffer"
            java.util.Objects.requireNonNull(r7, r0)
            if (r8 < 0) goto L94
            int r0 = r7.length
            if (r8 >= r0) goto L94
            if (r9 < 0) goto L7f
            byte[] r0 = r6.buffer
            int r0 = r0.length
            if (r9 > r0) goto L7f
            int r0 = r8 + r9
            int r1 = r7.length
            if (r0 > r1) goto L5d
            int r0 = r6.currentNumberOfBytes
            if (r0 < r9) goto L3c
            r0 = 0
            r1 = r0
        L1c:
            if (r1 >= r9) goto L3b
            int r2 = r8 + 1
            byte[] r3 = r6.buffer
            int r4 = r6.startOffset
            r5 = r3[r4]
            r7[r8] = r5
            int r8 = r6.currentNumberOfBytes
            int r8 = r8 + (-1)
            r6.currentNumberOfBytes = r8
            int r4 = r4 + 1
            r6.startOffset = r4
            int r8 = r3.length
            if (r4 != r8) goto L37
            r6.startOffset = r0
        L37:
            int r1 = r1 + 1
            r8 = r2
            goto L1c
        L3b:
            return
        L3c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Currently, there are only "
            r8.<init>(r0)
            int r0 = r6.currentNumberOfBytes
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r0 = "in the buffer, not "
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L5d:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r1 = "The supplied byte array contains only "
            r9.<init>(r1)
            int r7 = r7.length
            java.lang.StringBuilder r7 = r9.append(r7)
            java.lang.String r9 = " bytes, but offset, and length would require "
            java.lang.StringBuilder r7 = r7.append(r9)
            int r0 = r0 + (-1)
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L7f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Illegal length: "
            r8.<init>(r0)
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L94:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Illegal offset: "
            r9.<init>(r0)
            java.lang.StringBuilder r8 = r9.append(r8)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }
}
