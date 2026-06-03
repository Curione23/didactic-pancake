package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
public class ScatterStatistics {
    private final long compressionElapsed;
    private final long mergingElapsed;

    ScatterStatistics(long r1, long r3) {
            r0 = this;
            r0.<init>()
            r0.compressionElapsed = r1
            r0.mergingElapsed = r3
            return
    }

    public long getCompressionElapsed() {
            r2 = this;
            long r0 = r2.compressionElapsed
            return r0
    }

    public long getMergingElapsed() {
            r2 = this;
            long r0 = r2.mergingElapsed
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "compressionElapsed="
            r0.<init>(r1)
            long r1 = r3.compressionElapsed
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "ms, mergingElapsed="
            java.lang.StringBuilder r0 = r0.append(r1)
            long r1 = r3.mergingElapsed
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "ms"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
