package org.apache.commons.compress.utils;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class CRC32VerifyingInputStream extends org.apache.commons.compress.utils.ChecksumVerifyingInputStream {
    @java.lang.Deprecated
    public CRC32VerifyingInputStream(java.io.InputStream r11, long r12, int r14) {
            r10 = this;
            long r0 = (long) r14
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r0 & r2
            r4 = r10
            r5 = r11
            r6 = r12
            r4.<init>(r5, r6, r8)
            return
    }

    public CRC32VerifyingInputStream(java.io.InputStream r8, long r9, long r11) {
            r7 = this;
            java.util.zip.CRC32 r1 = new java.util.zip.CRC32
            r1.<init>()
            r0 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            r0.<init>(r1, r2, r3, r5)
            return
    }
}
