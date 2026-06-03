package org.apache.commons.compress.compressors.pack200;

/* JADX INFO: loaded from: classes2.dex */
final class TempFileCachingStreamBridge extends org.apache.commons.compress.compressors.pack200.AbstractStreamBridge {
    private final java.nio.file.Path path;


    TempFileCachingStreamBridge() throws java.io.IOException {
            r4 = this;
            r4.<init>()
            r0 = 0
            java.nio.file.attribute.FileAttribute[] r1 = new java.nio.file.attribute.FileAttribute[r0]
            java.lang.String r2 = "commons-compress"
            java.lang.String r3 = "packtemp"
            java.nio.file.Path r1 = java.nio.file.Files.createTempFile(r2, r3, r1)
            r4.path = r1
            java.io.File r2 = r1.toFile()
            r2.deleteOnExit()
            java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r0]
            java.io.OutputStream r0 = java.nio.file.Files.newOutputStream(r1, r0)
            r4.out = r0
            return
    }

    static /* synthetic */ java.nio.file.Path access$000(org.apache.commons.compress.compressors.pack200.TempFileCachingStreamBridge r0) {
            java.nio.file.Path r0 = r0.path
            return r0
    }

    @Override // org.apache.commons.compress.compressors.pack200.AbstractStreamBridge
    java.io.InputStream createInputStream() throws java.io.IOException {
            r3 = this;
            java.io.OutputStream r0 = r3.out
            r0.close()
            org.apache.commons.compress.compressors.pack200.TempFileCachingStreamBridge$1 r0 = new org.apache.commons.compress.compressors.pack200.TempFileCachingStreamBridge$1
            java.nio.file.Path r1 = r3.path
            r2 = 0
            java.nio.file.OpenOption[] r2 = new java.nio.file.OpenOption[r2]
            java.io.InputStream r1 = java.nio.file.Files.newInputStream(r1, r2)
            r0.<init>(r3, r1)
            return r0
    }
}
