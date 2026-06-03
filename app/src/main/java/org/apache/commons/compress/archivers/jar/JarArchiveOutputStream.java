package org.apache.commons.compress.archivers.jar;

/* JADX INFO: loaded from: classes2.dex */
public class JarArchiveOutputStream extends org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream {
    private boolean jarMarkerAdded;

    public JarArchiveOutputStream(java.io.OutputStream r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public JarArchiveOutputStream(java.io.OutputStream r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1)
            r0.setEncoding(r2)
            return
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream, org.apache.commons.compress.archivers.ArchiveOutputStream
    public /* bridge */ /* synthetic */ void putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry r1) throws java.io.IOException {
            r0 = this;
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r1 = (org.apache.commons.compress.archivers.zip.ZipArchiveEntry) r1
            r0.putArchiveEntry(r1)
            return
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream
    public void putArchiveEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r2) throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.jarMarkerAdded
            if (r0 != 0) goto Le
            org.apache.commons.compress.archivers.zip.JarMarker r0 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance()
            r2.addAsFirstExtraField(r0)
            r0 = 1
            r1.jarMarkerAdded = r0
        Le:
            super.putArchiveEntry(r2)
            return
    }
}
