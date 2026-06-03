package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public final class UnsafeByteOperations {
    private UnsafeByteOperations() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.shaded.protobuf.ByteString unsafeWrap(java.nio.ByteBuffer r0) {
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.wrap(r0)
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.ByteString unsafeWrap(byte[] r0) {
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.wrap(r0)
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.ByteString unsafeWrap(byte[] r0, int r1, int r2) {
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.wrap(r0, r1, r2)
            return r0
    }

    public static void unsafeWriteTo(com.google.crypto.tink.shaded.protobuf.ByteString r0, com.google.crypto.tink.shaded.protobuf.ByteOutput r1) throws java.io.IOException {
            r0.writeTo(r1)
            return
    }
}
