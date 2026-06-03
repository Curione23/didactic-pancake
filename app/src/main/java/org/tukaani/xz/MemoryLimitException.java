package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
public class MemoryLimitException extends org.tukaani.xz.XZIOException {
    private static final long serialVersionUID = 3;
    private final int memoryLimit;
    private final int memoryNeeded;

    public MemoryLimitException(int r3, int r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = " KiB of memory would be needed; limit was "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r1 = " KiB"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            r2.memoryNeeded = r3
            r2.memoryLimit = r4
            return
    }

    public int getMemoryLimit() {
            r1 = this;
            int r0 = r1.memoryLimit
            return r0
    }

    public int getMemoryNeeded() {
            r1 = this;
            int r0 = r1.memoryNeeded
            return r0
    }
}
