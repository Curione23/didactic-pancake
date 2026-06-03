package com.google.crypto.tink;

/* JADX INFO: loaded from: classes2.dex */
public final class BinaryKeysetWriter implements com.google.crypto.tink.KeysetWriter {
    private final java.io.OutputStream outputStream;

    private BinaryKeysetWriter(java.io.OutputStream r1) {
            r0 = this;
            r0.<init>()
            r0.outputStream = r1
            return
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.KeysetWriter withFile(java.io.File r1) throws java.io.IOException {
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            com.google.crypto.tink.KeysetWriter r1 = withOutputStream(r0)
            return r1
    }

    public static com.google.crypto.tink.KeysetWriter withOutputStream(java.io.OutputStream r1) {
            com.google.crypto.tink.BinaryKeysetWriter r0 = new com.google.crypto.tink.BinaryKeysetWriter
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.crypto.tink.KeysetWriter
    public void write(com.google.crypto.tink.proto.EncryptedKeyset r2) throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.outputStream     // Catch: java.lang.Throwable -> Lb
            r2.writeTo(r0)     // Catch: java.lang.Throwable -> Lb
            java.io.OutputStream r2 = r1.outputStream
            r2.close()
            return
        Lb:
            r2 = move-exception
            java.io.OutputStream r0 = r1.outputStream
            r0.close()
            throw r2
    }

    @Override // com.google.crypto.tink.KeysetWriter
    public void write(com.google.crypto.tink.proto.Keyset r2) throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.outputStream     // Catch: java.lang.Throwable -> Lb
            r2.writeTo(r0)     // Catch: java.lang.Throwable -> Lb
            java.io.OutputStream r2 = r1.outputStream
            r2.close()
            return
        Lb:
            r2 = move-exception
            java.io.OutputStream r0 = r1.outputStream
            r0.close()
            throw r2
    }
}
