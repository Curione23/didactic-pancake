package org.apache.commons.compress.archivers.tar;

/* JADX INFO: loaded from: classes2.dex */
public class TarArchiveSparseEntry implements org.apache.commons.compress.archivers.tar.TarConstants {
    private final boolean isExtended;
    private final java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> sparseHeaders;

    public TarArchiveSparseEntry(byte[] r4) throws java.io.IOException {
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 0
            r2 = 21
            java.util.List r1 = org.apache.commons.compress.archivers.tar.TarUtils.readSparseStructs(r4, r1, r2)
            r0.<init>(r1)
            r3.sparseHeaders = r0
            r0 = 504(0x1f8, float:7.06E-43)
            boolean r4 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(r4, r0)
            r3.isExtended = r4
            return
    }

    public java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> getSparseHeaders() {
            r1 = this;
            java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> r0 = r1.sparseHeaders
            return r0
    }

    public boolean isExtended() {
            r1 = this;
            boolean r0 = r1.isExtended
            return r0
    }
}
