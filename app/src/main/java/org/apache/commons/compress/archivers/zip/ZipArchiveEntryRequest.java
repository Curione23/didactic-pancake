package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
public class ZipArchiveEntryRequest {
    private final int method;
    private final org.apache.commons.compress.parallel.InputStreamSupplier payloadSupplier;
    private final org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry;

    private ZipArchiveEntryRequest(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r1, org.apache.commons.compress.parallel.InputStreamSupplier r2) {
            r0 = this;
            r0.<init>()
            r0.zipArchiveEntry = r1
            r0.payloadSupplier = r2
            int r1 = r1.getMethod()
            r0.method = r1
            return
    }

    public static org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest createZipArchiveEntryRequest(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r1, org.apache.commons.compress.parallel.InputStreamSupplier r2) {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest r0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest
            r0.<init>(r1, r2)
            return r0
    }

    public int getMethod() {
            r1 = this;
            int r0 = r1.method
            return r0
    }

    public java.io.InputStream getPayloadStream() {
            r1 = this;
            org.apache.commons.compress.parallel.InputStreamSupplier r0 = r1.payloadSupplier
            java.io.InputStream r0 = r0.get()
            return r0
    }

    org.apache.commons.compress.archivers.zip.ZipArchiveEntry getZipArchiveEntry() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = r1.zipArchiveEntry
            return r0
    }
}
