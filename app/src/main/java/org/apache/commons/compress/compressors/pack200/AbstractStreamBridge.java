package org.apache.commons.compress.compressors.pack200;

/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractStreamBridge extends java.io.FilterOutputStream {
    private java.io.InputStream inputStream;
    private final java.lang.Object inputStreamLock;

    protected AbstractStreamBridge() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    protected AbstractStreamBridge(java.io.OutputStream r1) {
            r0 = this;
            r0.<init>(r1)
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.inputStreamLock = r1
            return
    }

    abstract java.io.InputStream createInputStream() throws java.io.IOException;

    java.io.InputStream getInputStream() throws java.io.IOException {
            r2 = this;
            java.lang.Object r0 = r2.inputStreamLock
            monitor-enter(r0)
            java.io.InputStream r1 = r2.inputStream     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto Ld
            java.io.InputStream r1 = r2.createInputStream()     // Catch: java.lang.Throwable -> L11
            r2.inputStream = r1     // Catch: java.lang.Throwable -> L11
        Ld:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            java.io.InputStream r0 = r2.inputStream
            return r0
        L11:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    void stop() throws java.io.IOException {
            r2 = this;
            r2.close()
            java.lang.Object r0 = r2.inputStreamLock
            monitor-enter(r0)
            java.io.InputStream r1 = r2.inputStream     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L10
            r1.close()     // Catch: java.lang.Throwable -> L12
            r1 = 0
            r2.inputStream = r1     // Catch: java.lang.Throwable -> L12
        L10:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
    }
}
