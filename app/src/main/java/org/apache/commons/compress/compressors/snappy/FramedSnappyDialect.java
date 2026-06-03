package org.apache.commons.compress.compressors.snappy;

/* JADX INFO: loaded from: classes2.dex */
public enum FramedSnappyDialect extends java.lang.Enum<org.apache.commons.compress.compressors.snappy.FramedSnappyDialect> {
    private static final /* synthetic */ org.apache.commons.compress.compressors.snappy.FramedSnappyDialect[] $VALUES = null;
    public static final org.apache.commons.compress.compressors.snappy.FramedSnappyDialect IWORK_ARCHIVE = null;
    public static final org.apache.commons.compress.compressors.snappy.FramedSnappyDialect STANDARD = null;
    private final boolean checksumWithCompressedChunks;
    private final boolean streamIdentifier;

    private static /* synthetic */ org.apache.commons.compress.compressors.snappy.FramedSnappyDialect[] $values() {
            org.apache.commons.compress.compressors.snappy.FramedSnappyDialect r0 = org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.STANDARD
            org.apache.commons.compress.compressors.snappy.FramedSnappyDialect r1 = org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.IWORK_ARCHIVE
            org.apache.commons.compress.compressors.snappy.FramedSnappyDialect[] r0 = new org.apache.commons.compress.compressors.snappy.FramedSnappyDialect[]{r0, r1}
            return r0
    }

    static {
            org.apache.commons.compress.compressors.snappy.FramedSnappyDialect r0 = new org.apache.commons.compress.compressors.snappy.FramedSnappyDialect
            java.lang.String r1 = "STANDARD"
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3, r3)
            org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.STANDARD = r0
            org.apache.commons.compress.compressors.snappy.FramedSnappyDialect r0 = new org.apache.commons.compress.compressors.snappy.FramedSnappyDialect
            java.lang.String r1 = "IWORK_ARCHIVE"
            r0.<init>(r1, r3, r2, r2)
            org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.IWORK_ARCHIVE = r0
            org.apache.commons.compress.compressors.snappy.FramedSnappyDialect[] r0 = $values()
            org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.$VALUES = r0
            return
    }

    FramedSnappyDialect(java.lang.String r1, int r2, boolean r3, boolean r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.streamIdentifier = r3
            r0.checksumWithCompressedChunks = r4
            return
    }

    public static org.apache.commons.compress.compressors.snappy.FramedSnappyDialect valueOf(java.lang.String r1) {
            java.lang.Class<org.apache.commons.compress.compressors.snappy.FramedSnappyDialect> r0 = org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            org.apache.commons.compress.compressors.snappy.FramedSnappyDialect r1 = (org.apache.commons.compress.compressors.snappy.FramedSnappyDialect) r1
            return r1
    }

    public static org.apache.commons.compress.compressors.snappy.FramedSnappyDialect[] values() {
            org.apache.commons.compress.compressors.snappy.FramedSnappyDialect[] r0 = org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.$VALUES
            java.lang.Object r0 = r0.clone()
            org.apache.commons.compress.compressors.snappy.FramedSnappyDialect[] r0 = (org.apache.commons.compress.compressors.snappy.FramedSnappyDialect[]) r0
            return r0
    }

    boolean hasStreamIdentifier() {
            r1 = this;
            boolean r0 = r1.streamIdentifier
            return r0
    }

    boolean usesChecksumWithCompressedChunks() {
            r1 = this;
            boolean r0 = r1.checksumWithCompressedChunks
            return r0
    }
}
