package com.google.crypto.tink;

/* JADX INFO: loaded from: classes2.dex */
public class PrivilegedRegistry {
    private PrivilegedRegistry() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.proto.KeyData deriveKey(com.google.crypto.tink.proto.KeyTemplate r0, java.io.InputStream r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.KeyData r0 = com.google.crypto.tink.Registry.deriveKey(r0, r1)
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.MessageLite parseKeyData(com.google.crypto.tink.proto.KeyData r0) throws java.security.GeneralSecurityException, com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = com.google.crypto.tink.Registry.parseKeyData(r0)
            return r0
    }
}
