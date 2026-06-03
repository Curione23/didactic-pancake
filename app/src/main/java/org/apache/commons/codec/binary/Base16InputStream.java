package org.apache.commons.codec.binary;

/* JADX INFO: loaded from: classes2.dex */
public class Base16InputStream extends org.apache.commons.codec.binary.BaseNCodecInputStream {
    public Base16InputStream(java.io.InputStream r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public Base16InputStream(java.io.InputStream r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public Base16InputStream(java.io.InputStream r2, boolean r3, boolean r4) {
            r1 = this;
            org.apache.commons.codec.CodecPolicy r0 = org.apache.commons.codec.CodecPolicy.LENIENT
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public Base16InputStream(java.io.InputStream r2, boolean r3, boolean r4, org.apache.commons.codec.CodecPolicy r5) {
            r1 = this;
            org.apache.commons.codec.binary.Base16 r0 = new org.apache.commons.codec.binary.Base16
            r0.<init>(r4, r5)
            r1.<init>(r2, r0, r3)
            return
    }
}
