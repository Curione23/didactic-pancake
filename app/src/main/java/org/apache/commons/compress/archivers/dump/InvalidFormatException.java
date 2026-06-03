package org.apache.commons.compress.archivers.dump;

/* JADX INFO: loaded from: classes2.dex */
public class InvalidFormatException extends org.apache.commons.compress.archivers.dump.DumpArchiveException {
    private static final long serialVersionUID = 1;
    protected long offset;

    public InvalidFormatException() {
            r1 = this;
            java.lang.String r0 = "there was an error decoding a tape segment"
            r1.<init>(r0)
            return
    }

    public InvalidFormatException(long r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "there was an error decoding a tape segment header at offset "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = "."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            r2.offset = r3
            return
    }

    public long getOffset() {
            r2 = this;
            long r0 = r2.offset
            return r0
    }
}
