package com.google.crypto.tink;

/* JADX INFO: loaded from: classes2.dex */
public final class CleartextKeysetHandle {
    private CleartextKeysetHandle() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.KeysetHandle fromKeyset(com.google.crypto.tink.proto.Keyset r0) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.KeysetHandle r0 = com.google.crypto.tink.KeysetHandle.fromKeyset(r0)
            return r0
    }

    public static com.google.crypto.tink.proto.Keyset getKeyset(com.google.crypto.tink.KeysetHandle r0) {
            com.google.crypto.tink.proto.Keyset r0 = r0.getKeyset()
            return r0
    }

    @java.lang.Deprecated
    public static final com.google.crypto.tink.KeysetHandle parseFrom(byte[] r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Ld
            com.google.crypto.tink.proto.Keyset r1 = com.google.crypto.tink.proto.Keyset.parseFrom(r1, r0)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Ld
            com.google.crypto.tink.KeysetHandle r1 = com.google.crypto.tink.KeysetHandle.fromKeyset(r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Ld
            return r1
        Ld:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r0 = "invalid keyset"
            r1.<init>(r0)
            throw r1
    }

    public static com.google.crypto.tink.KeysetHandle read(com.google.crypto.tink.KeysetReader r0) throws java.security.GeneralSecurityException, java.io.IOException {
            com.google.crypto.tink.proto.Keyset r0 = r0.read()
            com.google.crypto.tink.KeysetHandle r0 = com.google.crypto.tink.KeysetHandle.fromKeyset(r0)
            return r0
    }

    public static com.google.crypto.tink.KeysetHandle read(com.google.crypto.tink.KeysetReader r1, java.util.Map<java.lang.String, java.lang.String> r2) throws java.security.GeneralSecurityException, java.io.IOException {
            com.google.crypto.tink.proto.Keyset r1 = r1.read()
            com.google.crypto.tink.monitoring.MonitoringAnnotations$Builder r0 = com.google.crypto.tink.monitoring.MonitoringAnnotations.newBuilder()
            com.google.crypto.tink.monitoring.MonitoringAnnotations$Builder r2 = r0.addAll(r2)
            com.google.crypto.tink.monitoring.MonitoringAnnotations r2 = r2.build()
            com.google.crypto.tink.KeysetHandle r1 = com.google.crypto.tink.KeysetHandle.fromKeysetAndAnnotations(r1, r2)
            return r1
    }

    public static void write(com.google.crypto.tink.KeysetHandle r0, com.google.crypto.tink.KeysetWriter r1) throws java.io.IOException {
            com.google.crypto.tink.proto.Keyset r0 = r0.getKeyset()
            r1.write(r0)
            return
    }
}
