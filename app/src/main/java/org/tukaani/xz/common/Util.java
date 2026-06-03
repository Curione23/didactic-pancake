package org.tukaani.xz.common;

/* JADX INFO: loaded from: classes2.dex */
public class Util {
    public static final long BACKWARD_SIZE_MAX = 17179869184L;
    public static final int BLOCK_HEADER_SIZE_MAX = 1024;
    public static final int STREAM_HEADER_SIZE = 12;
    public static final long VLI_MAX = Long.MAX_VALUE;
    public static final int VLI_SIZE_MAX = 9;

    public Util() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getVLISize(long r3) {
            r0 = 0
        L1:
            int r0 = r0 + 1
            r1 = 7
            long r3 = r3 >> r1
            r1 = 0
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L1
            return r0
    }
}
