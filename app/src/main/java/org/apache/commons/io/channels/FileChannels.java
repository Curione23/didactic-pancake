package org.apache.commons.io.channels;

/* JADX INFO: loaded from: classes2.dex */
public final class FileChannels {
    private FileChannels() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean contentEquals(java.nio.channels.FileChannel r9, java.nio.channels.FileChannel r10, int r11) throws java.io.IOException {
            boolean r0 = java.util.Objects.equals(r9, r10)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            long r2 = size(r9)
            long r4 = size(r10)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r6 = 0
            if (r0 == 0) goto L16
            return r6
        L16:
            r7 = 0
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 != 0) goto L21
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 != 0) goto L21
            return r1
        L21:
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r11)
            java.nio.ByteBuffer r11 = java.nio.ByteBuffer.allocateDirect(r11)
        L29:
            int r1 = r9.read(r0)
            int r2 = r10.read(r11)
            r0.clear()
            r11.clear()
            r3 = -1
            if (r1 != r3) goto L41
            if (r2 != r3) goto L41
            boolean r9 = r0.equals(r11)
            return r9
        L41:
            if (r1 == r2) goto L44
            return r6
        L44:
            boolean r1 = r0.equals(r11)
            if (r1 != 0) goto L29
            return r6
    }

    private static long size(java.nio.channels.FileChannel r2) throws java.io.IOException {
            if (r2 == 0) goto L7
            long r0 = r2.size()
            goto L9
        L7:
            r0 = 0
        L9:
            return r0
    }
}
