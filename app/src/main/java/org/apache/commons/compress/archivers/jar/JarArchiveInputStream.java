package org.apache.commons.compress.archivers.jar;

/* JADX INFO: loaded from: classes2.dex */
public class JarArchiveInputStream extends org.apache.commons.compress.archivers.zip.ZipArchiveInputStream {
    public JarArchiveInputStream(java.io.InputStream r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public JarArchiveInputStream(java.io.InputStream r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static boolean matches(byte[] r0, int r1) {
            boolean r0 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(r0, r1)
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipArchiveInputStream, org.apache.commons.compress.archivers.ArchiveInputStream
    public /* bridge */ /* synthetic */ org.apache.commons.compress.archivers.ArchiveEntry getNextEntry() throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.archivers.jar.JarArchiveEntry r0 = r1.getNextEntry()
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipArchiveInputStream, org.apache.commons.compress.archivers.ArchiveInputStream
    public org.apache.commons.compress.archivers.jar.JarArchiveEntry getNextEntry() throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.archivers.jar.JarArchiveEntry r0 = r1.getNextJarEntry()
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipArchiveInputStream, org.apache.commons.compress.archivers.ArchiveInputStream
    public /* bridge */ /* synthetic */ org.apache.commons.compress.archivers.zip.ZipArchiveEntry getNextEntry() throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.archivers.jar.JarArchiveEntry r0 = r1.getNextEntry()
            return r0
    }

    @java.lang.Deprecated
    public org.apache.commons.compress.archivers.jar.JarArchiveEntry getNextJarEntry() throws java.io.IOException {
            r2 = this;
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = r2.getNextZipEntry()
            if (r0 != 0) goto L8
            r0 = 0
            goto Le
        L8:
            org.apache.commons.compress.archivers.jar.JarArchiveEntry r1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry
            r1.<init>(r0)
            r0 = r1
        Le:
            return r0
    }
}
