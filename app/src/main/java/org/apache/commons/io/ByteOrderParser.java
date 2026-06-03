package org.apache.commons.io;

/* JADX INFO: loaded from: classes2.dex */
public final class ByteOrderParser {
    private ByteOrderParser() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.nio.ByteOrder parseByteOrder(java.lang.String r3) {
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            java.lang.String r0 = r0.toString()
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Lf
            java.nio.ByteOrder r3 = java.nio.ByteOrder.BIG_ENDIAN
            return r3
        Lf:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.lang.String r0 = r0.toString()
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L1e
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            return r3
        L1e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported byte order setting: "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = ", expected one of "
            java.lang.StringBuilder r3 = r3.append(r1)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r1 = ", "
            java.lang.StringBuilder r3 = r3.append(r1)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }
}
