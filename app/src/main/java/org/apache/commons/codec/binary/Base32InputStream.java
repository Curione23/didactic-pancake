package org.apache.commons.codec.binary;

/* JADX INFO: loaded from: classes2.dex */
public class Base32InputStream extends org.apache.commons.codec.binary.BaseNCodecInputStream {
    public Base32InputStream(java.io.InputStream r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public Base32InputStream(java.io.InputStream r3, boolean r4) {
            r2 = this;
            org.apache.commons.codec.binary.Base32 r0 = new org.apache.commons.codec.binary.Base32
            r1 = 0
            r0.<init>(r1)
            r2.<init>(r3, r0, r4)
            return
    }

    public Base32InputStream(java.io.InputStream r2, boolean r3, int r4, byte[] r5) {
            r1 = this;
            org.apache.commons.codec.binary.Base32 r0 = new org.apache.commons.codec.binary.Base32
            r0.<init>(r4, r5)
            r1.<init>(r2, r0, r3)
            return
    }

    public Base32InputStream(java.io.InputStream r8, boolean r9, int r10, byte[] r11, org.apache.commons.codec.CodecPolicy r12) {
            r7 = this;
            org.apache.commons.codec.binary.Base32 r6 = new org.apache.commons.codec.binary.Base32
            r3 = 0
            r4 = 61
            r0 = r6
            r1 = r10
            r2 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r7.<init>(r8, r6, r9)
            return
    }
}
