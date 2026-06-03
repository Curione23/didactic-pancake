package org.apache.commons.compress.archivers.sevenz;

/* JADX INFO: loaded from: classes2.dex */
final class BindPair {
    final long inIndex;
    final long outIndex;

    BindPair(long r1, long r3) {
            r0 = this;
            r0.<init>()
            r0.inIndex = r1
            r0.outIndex = r3
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BindPair binding input "
            r0.<init>(r1)
            long r1 = r3.inIndex
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " to output "
            java.lang.StringBuilder r0 = r0.append(r1)
            long r1 = r3.outIndex
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
