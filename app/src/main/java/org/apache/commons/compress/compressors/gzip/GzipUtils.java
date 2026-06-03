package org.apache.commons.compress.compressors.gzip;

/* JADX INFO: loaded from: classes2.dex */
public class GzipUtils {
    static final java.nio.charset.Charset GZIP_ENCODING = null;
    private static final org.apache.commons.compress.compressors.FileNameUtil fileNameUtil = null;

    static {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.String r1 = ".tgz"
            java.lang.String r2 = ".tar"
            r0.put(r1, r2)
            java.lang.String r1 = ".taz"
            r0.put(r1, r2)
            java.lang.String r1 = ".svgz"
            java.lang.String r2 = ".svg"
            r0.put(r1, r2)
            java.lang.String r1 = ".cpgz"
            java.lang.String r2 = ".cpio"
            r0.put(r1, r2)
            java.lang.String r1 = ".wmz"
            java.lang.String r2 = ".wmf"
            r0.put(r1, r2)
            java.lang.String r1 = ".emz"
            java.lang.String r2 = ".emf"
            r0.put(r1, r2)
            java.lang.String r1 = ".gz"
            java.lang.String r2 = ""
            r0.put(r1, r2)
            java.lang.String r3 = ".z"
            r0.put(r3, r2)
            java.lang.String r3 = "-gz"
            r0.put(r3, r2)
            java.lang.String r3 = "-z"
            r0.put(r3, r2)
            java.lang.String r3 = "_z"
            r0.put(r3, r2)
            org.apache.commons.compress.compressors.FileNameUtil r2 = new org.apache.commons.compress.compressors.FileNameUtil
            r2.<init>(r0, r1)
            org.apache.commons.compress.compressors.gzip.GzipUtils.fileNameUtil = r2
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.ISO_8859_1
            org.apache.commons.compress.compressors.gzip.GzipUtils.GZIP_ENCODING = r0
            return
    }

    private GzipUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getCompressedFileName(java.lang.String r1) {
            org.apache.commons.compress.compressors.FileNameUtil r0 = org.apache.commons.compress.compressors.gzip.GzipUtils.fileNameUtil
            java.lang.String r1 = r0.getCompressedFileName(r1)
            return r1
    }

    @java.lang.Deprecated
    public static java.lang.String getCompressedFilename(java.lang.String r1) {
            org.apache.commons.compress.compressors.FileNameUtil r0 = org.apache.commons.compress.compressors.gzip.GzipUtils.fileNameUtil
            java.lang.String r1 = r0.getCompressedFileName(r1)
            return r1
    }

    public static java.lang.String getUncompressedFileName(java.lang.String r1) {
            org.apache.commons.compress.compressors.FileNameUtil r0 = org.apache.commons.compress.compressors.gzip.GzipUtils.fileNameUtil
            java.lang.String r1 = r0.getUncompressedFileName(r1)
            return r1
    }

    @java.lang.Deprecated
    public static java.lang.String getUncompressedFilename(java.lang.String r1) {
            org.apache.commons.compress.compressors.FileNameUtil r0 = org.apache.commons.compress.compressors.gzip.GzipUtils.fileNameUtil
            java.lang.String r1 = r0.getUncompressedFileName(r1)
            return r1
    }

    public static boolean isCompressedFileName(java.lang.String r1) {
            org.apache.commons.compress.compressors.FileNameUtil r0 = org.apache.commons.compress.compressors.gzip.GzipUtils.fileNameUtil
            boolean r1 = r0.isCompressedFileName(r1)
            return r1
    }

    @java.lang.Deprecated
    public static boolean isCompressedFilename(java.lang.String r1) {
            org.apache.commons.compress.compressors.FileNameUtil r0 = org.apache.commons.compress.compressors.gzip.GzipUtils.fileNameUtil
            boolean r1 = r0.isCompressedFileName(r1)
            return r1
    }
}
