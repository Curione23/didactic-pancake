package org.apache.commons.compress.archivers.dump;

/* JADX INFO: loaded from: classes2.dex */
public class UnsupportedCompressionAlgorithmException extends org.apache.commons.compress.archivers.dump.DumpArchiveException {
    private static final long serialVersionUID = 1;

    public UnsupportedCompressionAlgorithmException() {
            r1 = this;
            java.lang.String r0 = "this file uses an unsupported compression algorithm."
            r1.<init>(r0)
            return
    }

    public UnsupportedCompressionAlgorithmException(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "this file uses an unsupported compression algorithm: "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = "."
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            return
    }
}
