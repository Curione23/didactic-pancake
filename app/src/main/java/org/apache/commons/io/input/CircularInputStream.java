package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
public class CircularInputStream extends java.io.InputStream {
    private long byteCount;
    private int position;
    private final byte[] repeatedContent;
    private final long targetByteCount;

    public CircularInputStream(byte[] r2, long r3) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.position = r0
            byte[] r0 = validate(r2)
            r1.repeatedContent = r0
            int r2 = r2.length
            if (r2 == 0) goto L12
            r1.targetByteCount = r3
            return
        L12:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "repeatContent is empty."
            r2.<init>(r3)
            throw r2
    }

    private static byte[] validate(byte[] r4) {
            java.lang.String r0 = "repeatContent"
            java.util.Objects.requireNonNull(r4, r0)
            int r0 = r4.length
            r1 = 0
        L7:
            if (r1 >= r0) goto L19
            r2 = r4[r1]
            r3 = -1
            if (r2 == r3) goto L11
            int r1 = r1 + 1
            goto L7
        L11:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "repeatContent contains the end-of-stream marker -1"
            r4.<init>(r0)
            throw r4
        L19:
            return r4
    }

    @Override // java.io.InputStream
    public int read() {
            r4 = this;
            long r0 = r4.targetByteCount
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L15
            long r2 = r4.byteCount
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L10
            r0 = -1
            return r0
        L10:
            r0 = 1
            long r2 = r2 + r0
            r4.byteCount = r2
        L15:
            int r0 = r4.position
            int r0 = r0 + 1
            byte[] r1 = r4.repeatedContent
            int r2 = r1.length
            int r0 = r0 % r2
            r4.position = r0
            r0 = r1[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }
}
