package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
public final class ZipLong implements java.lang.Cloneable, java.io.Serializable {
    public static final org.apache.commons.compress.archivers.zip.ZipLong AED_SIG = null;
    public static final org.apache.commons.compress.archivers.zip.ZipLong CFH_SIG = null;
    public static final org.apache.commons.compress.archivers.zip.ZipLong DD_SIG = null;
    public static final org.apache.commons.compress.archivers.zip.ZipLong LFH_SIG = null;
    public static final org.apache.commons.compress.archivers.zip.ZipLong SINGLE_SEGMENT_SPLIT_MARKER = null;
    static final org.apache.commons.compress.archivers.zip.ZipLong ZIP64_MAGIC = null;
    private static final long serialVersionUID = 1;
    private final long value;

    static {
            org.apache.commons.compress.archivers.zip.ZipLong r0 = new org.apache.commons.compress.archivers.zip.ZipLong
            r1 = 33639248(0x2014b50, double:1.6619997E-316)
            r0.<init>(r1)
            org.apache.commons.compress.archivers.zip.ZipLong.CFH_SIG = r0
            org.apache.commons.compress.archivers.zip.ZipLong r0 = new org.apache.commons.compress.archivers.zip.ZipLong
            r1 = 67324752(0x4034b50, double:3.3262847E-316)
            r0.<init>(r1)
            org.apache.commons.compress.archivers.zip.ZipLong.LFH_SIG = r0
            org.apache.commons.compress.archivers.zip.ZipLong r0 = new org.apache.commons.compress.archivers.zip.ZipLong
            r1 = 134695760(0x8074b50, double:6.65485477E-316)
            r0.<init>(r1)
            org.apache.commons.compress.archivers.zip.ZipLong.DD_SIG = r0
            org.apache.commons.compress.archivers.zip.ZipLong r0 = new org.apache.commons.compress.archivers.zip.ZipLong
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r0.<init>(r1)
            org.apache.commons.compress.archivers.zip.ZipLong.ZIP64_MAGIC = r0
            org.apache.commons.compress.archivers.zip.ZipLong r0 = new org.apache.commons.compress.archivers.zip.ZipLong
            r1 = 808471376(0x30304b50, double:3.994379325E-315)
            r0.<init>(r1)
            org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER = r0
            org.apache.commons.compress.archivers.zip.ZipLong r0 = new org.apache.commons.compress.archivers.zip.ZipLong
            r1 = 134630224(0x8064b50, double:6.65161686E-316)
            r0.<init>(r1)
            org.apache.commons.compress.archivers.zip.ZipLong.AED_SIG = r0
            return
    }

    public ZipLong(int r3) {
            r2 = this;
            r2.<init>()
            long r0 = (long) r3
            r2.value = r0
            return
    }

    public ZipLong(long r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    public ZipLong(byte[] r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ZipLong(byte[] r1, int r2) {
            r0 = this;
            r0.<init>()
            long r1 = getValue(r1, r2)
            r0.value = r1
            return
    }

    public static byte[] getBytes(long r2) {
            r0 = 4
            byte[] r0 = new byte[r0]
            r1 = 0
            putLong(r2, r0, r1)
            return r0
    }

    public static long getValue(byte[] r2) {
            r0 = 0
            long r0 = getValue(r2, r0)
            return r0
    }

    public static long getValue(byte[] r1, int r2) {
            r0 = 4
            long r1 = org.apache.commons.compress.utils.ByteUtils.fromLittleEndian(r1, r2, r0)
            return r1
    }

    public static void putLong(long r1, byte[] r3, int r4) {
            r0 = 4
            org.apache.commons.compress.utils.ByteUtils.toLittleEndian(r3, r1, r4, r0)
            return
    }

    public java.lang.Object clone() {
            r2 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L5
            return r0
        L5:
            r0 = move-exception
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r0)
            throw r1
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof org.apache.commons.compress.archivers.zip.ZipLong
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            long r2 = r6.value
            org.apache.commons.compress.archivers.zip.ZipLong r7 = (org.apache.commons.compress.archivers.zip.ZipLong) r7
            long r4 = r7.getValue()
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L13
            r1 = 1
        L13:
            return r1
    }

    public byte[] getBytes() {
            r2 = this;
            long r0 = r2.value
            byte[] r0 = getBytes(r0)
            return r0
    }

    public int getIntValue() {
            r2 = this;
            long r0 = r2.value
            int r0 = (int) r0
            return r0
    }

    public long getValue() {
            r2 = this;
            long r0 = r2.value
            return r0
    }

    public int hashCode() {
            r2 = this;
            long r0 = r2.value
            int r0 = (int) r0
            return r0
    }

    public void putLong(byte[] r3, int r4) {
            r2 = this;
            long r0 = r2.value
            putLong(r0, r3, r4)
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ZipLong value: "
            r0.<init>(r1)
            long r1 = r3.value
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
