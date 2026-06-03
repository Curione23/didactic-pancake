package org.apache.commons.compress.compressors.pack200;

/* JADX INFO: loaded from: classes2.dex */
final class InMemoryCachingStreamBridge extends org.apache.commons.compress.compressors.pack200.AbstractStreamBridge {
    InMemoryCachingStreamBridge() {
            r1 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1.<init>(r0)
            return
    }

    @Override // org.apache.commons.compress.compressors.pack200.AbstractStreamBridge
    java.io.InputStream createInputStream() throws java.io.IOException {
            r2 = this;
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            java.io.OutputStream r1 = r2.out
            java.io.ByteArrayOutputStream r1 = (java.io.ByteArrayOutputStream) r1
            byte[] r1 = r1.toByteArray()
            r0.<init>(r1)
            return r0
    }
}
