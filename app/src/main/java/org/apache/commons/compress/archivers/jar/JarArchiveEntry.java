package org.apache.commons.compress.archivers.jar;

/* JADX INFO: loaded from: classes2.dex */
public class JarArchiveEntry extends org.apache.commons.compress.archivers.zip.ZipArchiveEntry {
    public JarArchiveEntry(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public JarArchiveEntry(java.util.jar.JarEntry r1) throws java.util.zip.ZipException {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public JarArchiveEntry(java.util.zip.ZipEntry r1) throws java.util.zip.ZipException {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public JarArchiveEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r1) throws java.util.zip.ZipException {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @java.lang.Deprecated
    public java.security.cert.Certificate[] getCertificates() {
            r1 = this;
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public java.util.jar.Attributes getManifestAttributes() {
            r1 = this;
            r0 = 0
            return r0
    }
}
