package org.apache.commons.io;

/* JADX INFO: loaded from: classes2.dex */
public class ByteOrderMark implements java.io.Serializable {
    public static final org.apache.commons.io.ByteOrderMark UTF_16BE = null;
    public static final org.apache.commons.io.ByteOrderMark UTF_16LE = null;
    public static final org.apache.commons.io.ByteOrderMark UTF_32BE = null;
    public static final org.apache.commons.io.ByteOrderMark UTF_32LE = null;
    public static final org.apache.commons.io.ByteOrderMark UTF_8 = null;
    public static final char UTF_BOM = 65279;
    private static final long serialVersionUID = 1;
    private final int[] bytes;
    private final java.lang.String charsetName;

    static {
            org.apache.commons.io.ByteOrderMark r0 = new org.apache.commons.io.ByteOrderMark
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r1 = r1.name()
            r2 = 187(0xbb, float:2.62E-43)
            r3 = 191(0xbf, float:2.68E-43)
            r4 = 239(0xef, float:3.35E-43)
            int[] r2 = new int[]{r4, r2, r3}
            r0.<init>(r1, r2)
            org.apache.commons.io.ByteOrderMark.UTF_8 = r0
            org.apache.commons.io.ByteOrderMark r0 = new org.apache.commons.io.ByteOrderMark
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16BE
            java.lang.String r1 = r1.name()
            r2 = 254(0xfe, float:3.56E-43)
            r3 = 255(0xff, float:3.57E-43)
            int[] r4 = new int[]{r2, r3}
            r0.<init>(r1, r4)
            org.apache.commons.io.ByteOrderMark.UTF_16BE = r0
            org.apache.commons.io.ByteOrderMark r0 = new org.apache.commons.io.ByteOrderMark
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16LE
            java.lang.String r1 = r1.name()
            int[] r4 = new int[]{r3, r2}
            r0.<init>(r1, r4)
            org.apache.commons.io.ByteOrderMark.UTF_16LE = r0
            org.apache.commons.io.ByteOrderMark r0 = new org.apache.commons.io.ByteOrderMark
            r1 = 0
            int[] r4 = new int[]{r1, r1, r2, r3}
            java.lang.String r5 = "UTF-32BE"
            r0.<init>(r5, r4)
            org.apache.commons.io.ByteOrderMark.UTF_32BE = r0
            org.apache.commons.io.ByteOrderMark r0 = new org.apache.commons.io.ByteOrderMark
            java.lang.String r4 = "UTF-32LE"
            int[] r1 = new int[]{r3, r2, r1, r1}
            r0.<init>(r4, r1)
            org.apache.commons.io.ByteOrderMark.UTF_32LE = r0
            return
    }

    public ByteOrderMark(java.lang.String r2, int... r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "charsetName"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.String r0 = "bytes"
            java.util.Objects.requireNonNull(r3, r0)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L29
            int r0 = r3.length
            if (r0 == 0) goto L21
            r1.charsetName = r2
            java.lang.Object r2 = r3.clone()
            int[] r2 = (int[]) r2
            r1.bytes = r2
            return
        L21:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "No bytes specified"
            r2.<init>(r3)
            throw r2
        L29:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "No charsetName specified"
            r2.<init>(r3)
            throw r2
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof org.apache.commons.io.ByteOrderMark
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            org.apache.commons.io.ByteOrderMark r5 = (org.apache.commons.io.ByteOrderMark) r5
            int[] r0 = r4.bytes
            int r0 = r0.length
            int r2 = r5.length()
            if (r0 == r2) goto L12
            return r1
        L12:
            r0 = r1
        L13:
            int[] r2 = r4.bytes
            int r3 = r2.length
            if (r0 >= r3) goto L24
            r2 = r2[r0]
            int r3 = r5.get(r0)
            if (r2 == r3) goto L21
            return r1
        L21:
            int r0 = r0 + 1
            goto L13
        L24:
            r5 = 1
            return r5
    }

    public int get(int r2) {
            r1 = this;
            int[] r0 = r1.bytes
            r2 = r0[r2]
            return r2
    }

    public byte[] getBytes() {
            r4 = this;
            int[] r0 = r4.bytes
            int r0 = r0.length
            byte[] r0 = org.apache.commons.io.IOUtils.byteArray(r0)
            r1 = 0
        L8:
            int[] r2 = r4.bytes
            int r3 = r2.length
            if (r1 >= r3) goto L15
            r2 = r2[r1]
            byte r2 = (byte) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto L8
        L15:
            return r0
    }

    public java.lang.String getCharsetName() {
            r1 = this;
            java.lang.String r0 = r1.charsetName
            return r0
    }

    public int hashCode() {
            r5 = this;
            java.lang.Class r0 = r5.getClass()
            int r0 = r0.hashCode()
            int[] r1 = r5.bytes
            int r2 = r1.length
            r3 = 0
        Lc:
            if (r3 >= r2) goto L14
            r4 = r1[r3]
            int r0 = r0 + r4
            int r3 = r3 + 1
            goto Lc
        L14:
            return r0
    }

    public int length() {
            r1 = this;
            int[] r0 = r1.bytes
            int r0 = r0.length
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = r4.charsetName
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            r1 = 0
        L20:
            int[] r2 = r4.bytes
            int r2 = r2.length
            if (r1 >= r2) goto L47
            if (r1 <= 0) goto L2c
            java.lang.String r2 = ","
            r0.append(r2)
        L2c:
            java.lang.String r2 = "0x"
            r0.append(r2)
            int[] r2 = r4.bytes
            r2 = r2[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toUpperCase(r3)
            r0.append(r2)
            int r1 = r1 + 1
            goto L20
        L47:
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
