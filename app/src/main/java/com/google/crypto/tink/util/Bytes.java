package com.google.crypto.tink.util;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
public final class Bytes {
    private final byte[] data;

    private Bytes(byte[] r3, int r4, int r5) {
            r2 = this;
            r2.<init>()
            byte[] r0 = new byte[r5]
            r2.data = r0
            r1 = 0
            java.lang.System.arraycopy(r3, r4, r0, r1, r5)
            return
    }

    public static com.google.crypto.tink.util.Bytes copyFrom(byte[] r2) {
            if (r2 == 0) goto L9
            r0 = 0
            int r1 = r2.length
            com.google.crypto.tink.util.Bytes r2 = copyFrom(r2, r0, r1)
            return r2
        L9:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "data must be non-null"
            r2.<init>(r0)
            throw r2
    }

    public static com.google.crypto.tink.util.Bytes copyFrom(byte[] r1, int r2, int r3) {
            if (r1 == 0) goto L8
            com.google.crypto.tink.util.Bytes r0 = new com.google.crypto.tink.util.Bytes
            r0.<init>(r1, r2, r3)
            return r0
        L8:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "data must be non-null"
            r1.<init>(r2)
            throw r1
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.crypto.tink.util.Bytes
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            com.google.crypto.tink.util.Bytes r2 = (com.google.crypto.tink.util.Bytes) r2
            byte[] r2 = r2.data
            byte[] r0 = r1.data
            boolean r2 = java.util.Arrays.equals(r2, r0)
            return r2
    }

    public int hashCode() {
            r1 = this;
            byte[] r0 = r1.data
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    public int size() {
            r1 = this;
            byte[] r0 = r1.data
            int r0 = r0.length
            return r0
    }

    public byte[] toByteArray() {
            r4 = this;
            byte[] r0 = r4.data
            int r1 = r0.length
            byte[] r1 = new byte[r1]
            r2 = 0
            int r3 = r0.length
            java.lang.System.arraycopy(r0, r2, r1, r2, r3)
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Bytes("
            r0.<init>(r1)
            byte[] r1 = r2.data
            java.lang.String r1 = com.google.crypto.tink.subtle.Hex.encode(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
