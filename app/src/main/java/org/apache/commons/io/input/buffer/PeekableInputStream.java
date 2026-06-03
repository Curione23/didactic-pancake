package org.apache.commons.io.input.buffer;

/* JADX INFO: loaded from: classes2.dex */
public class PeekableInputStream extends org.apache.commons.io.input.buffer.CircularBufferInputStream {
    public PeekableInputStream(java.io.InputStream r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public PeekableInputStream(java.io.InputStream r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public boolean peek(byte[] r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "sourceBuffer"
            java.util.Objects.requireNonNull(r3, r0)
            r0 = 0
            int r1 = r3.length
            boolean r3 = r2.peek(r3, r0, r1)
            return r3
    }

    public boolean peek(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "sourceBuffer"
            java.util.Objects.requireNonNull(r3, r0)
            int r0 = r3.length
            int r1 = r2.bufferSize
            if (r0 > r1) goto L1d
            org.apache.commons.io.input.buffer.CircularByteBuffer r0 = r2.buffer
            int r0 = r0.getCurrentNumberOfBytes()
            int r1 = r3.length
            if (r0 >= r1) goto L16
            r2.fillBuffer()
        L16:
            org.apache.commons.io.input.buffer.CircularByteBuffer r0 = r2.buffer
            boolean r3 = r0.peek(r3, r4, r5)
            return r3
        L1d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Peek request size of "
            r5.<init>(r0)
            int r3 = r3.length
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.String r5 = " bytes exceeds buffer size of "
            java.lang.StringBuilder r3 = r3.append(r5)
            int r5 = r2.bufferSize
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r5 = " bytes"
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }
}
