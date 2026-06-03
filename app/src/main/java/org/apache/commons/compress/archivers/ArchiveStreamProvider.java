package org.apache.commons.compress.archivers;

/* JADX INFO: loaded from: classes2.dex */
public interface ArchiveStreamProvider {
    <I extends org.apache.commons.compress.archivers.ArchiveInputStream<? extends org.apache.commons.compress.archivers.ArchiveEntry>> I createArchiveInputStream(java.lang.String r1, java.io.InputStream r2, java.lang.String r3) throws org.apache.commons.compress.archivers.ArchiveException;

    <O extends org.apache.commons.compress.archivers.ArchiveOutputStream<? extends org.apache.commons.compress.archivers.ArchiveEntry>> O createArchiveOutputStream(java.lang.String r1, java.io.OutputStream r2, java.lang.String r3) throws org.apache.commons.compress.archivers.ArchiveException;

    java.util.Set<java.lang.String> getInputStreamArchiveNames();

    java.util.Set<java.lang.String> getOutputStreamArchiveNames();
}
