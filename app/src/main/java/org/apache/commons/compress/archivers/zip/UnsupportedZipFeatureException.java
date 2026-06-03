package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
public class UnsupportedZipFeatureException extends java.util.zip.ZipException {
    private static final long serialVersionUID = 20161219;
    private final transient org.apache.commons.compress.archivers.zip.ZipArchiveEntry entry;
    private final org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature reason;

    public static class Feature implements java.io.Serializable {
        public static final org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature DATA_DESCRIPTOR = null;
        public static final org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature ENCRYPTION = null;
        public static final org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature METHOD = null;
        public static final org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature SPLITTING = null;
        public static final org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature UNKNOWN_COMPRESSED_SIZE = null;
        private static final long serialVersionUID = 4112582948775420359L;
        private final java.lang.String name;

        static {
                org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException$Feature r0 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException$Feature
                java.lang.String r1 = "encryption"
                r0.<init>(r1)
                org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.ENCRYPTION = r0
                org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException$Feature r0 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException$Feature
                java.lang.String r1 = "compression method"
                r0.<init>(r1)
                org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.METHOD = r0
                org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException$Feature r0 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException$Feature
                java.lang.String r1 = "data descriptor"
                r0.<init>(r1)
                org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.DATA_DESCRIPTOR = r0
                org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException$Feature r0 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException$Feature
                java.lang.String r1 = "splitting"
                r0.<init>(r1)
                org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.SPLITTING = r0
                org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException$Feature r0 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException$Feature
                java.lang.String r1 = "unknown compressed size"
                r0.<init>(r1)
                org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.UNKNOWN_COMPRESSED_SIZE = r0
                return
        }

        private Feature(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                return
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }
    }

    public UnsupportedZipFeatureException(org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unsupported feature "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = " used in archive."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            r2.reason = r3
            r3 = 0
            r2.entry = r3
            return
    }

    public UnsupportedZipFeatureException(org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature r3, org.apache.commons.compress.archivers.zip.ZipArchiveEntry r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unsupported feature "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = " used in entry "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r4.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            r2.reason = r3
            r2.entry = r4
            return
    }

    public UnsupportedZipFeatureException(org.apache.commons.compress.archivers.zip.ZipMethod r3, org.apache.commons.compress.archivers.zip.ZipArchiveEntry r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unsupported compression method "
            r0.<init>(r1)
            int r1 = r4.getMethod()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " ("
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r3 = r3.name()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = ") used in entry "
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r0 = r4.getName()
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException$Feature r3 = org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.METHOD
            r2.reason = r3
            r2.entry = r4
            return
    }

    public org.apache.commons.compress.archivers.zip.ZipArchiveEntry getEntry() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = r1.entry
            return r0
    }

    public org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature getFeature() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException$Feature r0 = r1.reason
            return r0
    }
}
