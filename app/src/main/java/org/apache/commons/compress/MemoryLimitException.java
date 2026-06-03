package org.apache.commons.compress;

/* JADX INFO: loaded from: classes2.dex */
public class MemoryLimitException extends java.io.IOException {
    private static final long serialVersionUID = 1;
    private final int memoryLimitInKb;
    private final long memoryNeededInKb;

    public MemoryLimitException(long r2, int r4) {
            r1 = this;
            java.lang.String r0 = buildMessage(r2, r4)
            r1.<init>(r0)
            r1.memoryNeededInKb = r2
            r1.memoryLimitInKb = r4
            return
    }

    public MemoryLimitException(long r2, int r4, java.lang.Exception r5) {
            r1 = this;
            java.lang.String r0 = buildMessage(r2, r4)
            r1.<init>(r0, r5)
            r1.memoryNeededInKb = r2
            r1.memoryLimitInKb = r4
            return
    }

    private static java.lang.String buildMessage(long r1, int r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.String r2 = " kb of memory would be needed; limit was "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " kb. If the file is not corrupt, consider increasing the memory limit."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
    }

    public int getMemoryLimitInKb() {
            r1 = this;
            int r0 = r1.memoryLimitInKb
            return r0
    }

    public long getMemoryNeededInKb() {
            r2 = this;
            long r0 = r2.memoryNeededInKb
            return r0
    }
}
