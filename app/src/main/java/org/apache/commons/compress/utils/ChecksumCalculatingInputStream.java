package org.apache.commons.compress.utils;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class ChecksumCalculatingInputStream extends java.util.zip.CheckedInputStream {
    @java.lang.Deprecated
    public ChecksumCalculatingInputStream(java.util.zip.Checksum r2, java.io.InputStream r3) {
            r1 = this;
            java.lang.String r0 = "inputStream"
            java.lang.Object r3 = java.util.Objects.requireNonNull(r3, r0)
            java.io.InputStream r3 = (java.io.InputStream) r3
            java.lang.String r0 = "checksum"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            java.util.zip.Checksum r2 = (java.util.zip.Checksum) r2
            r1.<init>(r3, r2)
            return
    }

    @java.lang.Deprecated
    public long getValue() {
            r2 = this;
            java.util.zip.Checksum r0 = r2.getChecksum()
            long r0 = r0.getValue()
            return r0
    }
}
