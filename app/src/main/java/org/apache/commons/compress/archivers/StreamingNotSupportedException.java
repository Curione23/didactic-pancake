package org.apache.commons.compress.archivers;

/* JADX INFO: loaded from: classes2.dex */
public class StreamingNotSupportedException extends org.apache.commons.compress.archivers.ArchiveException {
    private static final long serialVersionUID = 1;
    private final java.lang.String format;

    public StreamingNotSupportedException(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "The "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = " doesn't support streaming."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            r2.format = r3
            return
    }

    public java.lang.String getFormat() {
            r1 = this;
            java.lang.String r0 = r1.format
            return r0
    }
}
