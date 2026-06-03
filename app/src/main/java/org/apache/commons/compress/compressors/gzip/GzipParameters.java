package org.apache.commons.compress.compressors.gzip;

/* JADX INFO: loaded from: classes2.dex */
public class GzipParameters {
    private int bufferSize;
    private java.lang.String comment;
    private int compressionLevel;
    private int deflateStrategy;
    private java.lang.String fileName;
    private long modificationTime;
    private int operatingSystem;

    public GzipParameters() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.compressionLevel = r0
            r0 = 255(0xff, float:3.57E-43)
            r1.operatingSystem = r0
            r0 = 512(0x200, float:7.17E-43)
            r1.bufferSize = r0
            r0 = 0
            r1.deflateStrategy = r0
            return
    }

    public int getBufferSize() {
            r1 = this;
            int r0 = r1.bufferSize
            return r0
    }

    public java.lang.String getComment() {
            r1 = this;
            java.lang.String r0 = r1.comment
            return r0
    }

    public int getCompressionLevel() {
            r1 = this;
            int r0 = r1.compressionLevel
            return r0
    }

    public int getDeflateStrategy() {
            r1 = this;
            int r0 = r1.deflateStrategy
            return r0
    }

    public java.lang.String getFileName() {
            r1 = this;
            java.lang.String r0 = r1.fileName
            return r0
    }

    @java.lang.Deprecated
    public java.lang.String getFilename() {
            r1 = this;
            java.lang.String r0 = r1.fileName
            return r0
    }

    public long getModificationTime() {
            r2 = this;
            long r0 = r2.modificationTime
            return r0
    }

    public int getOperatingSystem() {
            r1 = this;
            int r0 = r1.operatingSystem
            return r0
    }

    public void setBufferSize(int r4) {
            r3 = this;
            if (r4 <= 0) goto L5
            r3.bufferSize = r4
            return
        L5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "invalid buffer size: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public void setComment(java.lang.String r1) {
            r0 = this;
            r0.comment = r1
            return
    }

    public void setCompressionLevel(int r4) {
            r3 = this;
            r0 = -1
            if (r4 < r0) goto La
            r0 = 9
            if (r4 > r0) goto La
            r3.compressionLevel = r4
            return
        La:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid gzip compression level: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public void setDeflateStrategy(int r1) {
            r0 = this;
            r0.deflateStrategy = r1
            return
    }

    public void setFileName(java.lang.String r1) {
            r0 = this;
            r0.fileName = r1
            return
    }

    @java.lang.Deprecated
    public void setFilename(java.lang.String r1) {
            r0 = this;
            r0.fileName = r1
            return
    }

    public void setModificationTime(long r1) {
            r0 = this;
            r0.modificationTime = r1
            return
    }

    public void setOperatingSystem(int r1) {
            r0 = this;
            r0.operatingSystem = r1
            return
    }
}
