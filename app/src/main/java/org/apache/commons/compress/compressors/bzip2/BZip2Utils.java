package org.apache.commons.compress.compressors.bzip2;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BZip2Utils {
    private static final org.apache.commons.compress.compressors.FileNameUtil fileNameUtil = null;

    static {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.String r1 = ".tar.bz2"
            java.lang.String r2 = ".tar"
            r0.put(r1, r2)
            java.lang.String r1 = ".tbz2"
            r0.put(r1, r2)
            java.lang.String r1 = ".tbz"
            r0.put(r1, r2)
            java.lang.String r1 = ".bz2"
            java.lang.String r2 = ""
            r0.put(r1, r2)
            java.lang.String r3 = ".bz"
            r0.put(r3, r2)
            org.apache.commons.compress.compressors.FileNameUtil r2 = new org.apache.commons.compress.compressors.FileNameUtil
            r2.<init>(r0, r1)
            org.apache.commons.compress.compressors.bzip2.BZip2Utils.fileNameUtil = r2
            return
    }

    private BZip2Utils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getCompressedFileName(java.lang.String r1) {
            org.apache.commons.compress.compressors.FileNameUtil r0 = org.apache.commons.compress.compressors.bzip2.BZip2Utils.fileNameUtil
            java.lang.String r1 = r0.getCompressedFileName(r1)
            return r1
    }

    @java.lang.Deprecated
    public static java.lang.String getCompressedFilename(java.lang.String r1) {
            org.apache.commons.compress.compressors.FileNameUtil r0 = org.apache.commons.compress.compressors.bzip2.BZip2Utils.fileNameUtil
            java.lang.String r1 = r0.getCompressedFileName(r1)
            return r1
    }

    public static java.lang.String getUncompressedFileName(java.lang.String r1) {
            org.apache.commons.compress.compressors.FileNameUtil r0 = org.apache.commons.compress.compressors.bzip2.BZip2Utils.fileNameUtil
            java.lang.String r1 = r0.getUncompressedFileName(r1)
            return r1
    }

    @java.lang.Deprecated
    public static java.lang.String getUncompressedFilename(java.lang.String r1) {
            org.apache.commons.compress.compressors.FileNameUtil r0 = org.apache.commons.compress.compressors.bzip2.BZip2Utils.fileNameUtil
            java.lang.String r1 = r0.getUncompressedFileName(r1)
            return r1
    }

    public static boolean isCompressedFileName(java.lang.String r1) {
            org.apache.commons.compress.compressors.FileNameUtil r0 = org.apache.commons.compress.compressors.bzip2.BZip2Utils.fileNameUtil
            boolean r1 = r0.isCompressedFileName(r1)
            return r1
    }

    @java.lang.Deprecated
    public static boolean isCompressedFilename(java.lang.String r1) {
            org.apache.commons.compress.compressors.FileNameUtil r0 = org.apache.commons.compress.compressors.bzip2.BZip2Utils.fileNameUtil
            boolean r1 = r0.isCompressedFileName(r1)
            return r1
    }
}
