package com.google.crypto.tink.internal;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
public final class ProtoParametersSerialization implements com.google.crypto.tink.internal.Serialization {
    private final com.google.crypto.tink.proto.KeyTemplate keyTemplate;
    private final com.google.crypto.tink.util.Bytes objectIdentifier;

    private ProtoParametersSerialization(com.google.crypto.tink.proto.KeyTemplate r1) {
            r0 = this;
            r0.<init>()
            r0.keyTemplate = r1
            java.lang.String r1 = r1.getTypeUrl()
            com.google.crypto.tink.util.Bytes r1 = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(r1)
            r0.objectIdentifier = r1
            return
    }

    public static com.google.crypto.tink.internal.ProtoParametersSerialization create(com.google.crypto.tink.proto.KeyTemplate r1) {
            com.google.crypto.tink.internal.ProtoParametersSerialization r0 = new com.google.crypto.tink.internal.ProtoParametersSerialization
            r0.<init>(r1)
            return r0
    }

    public static com.google.crypto.tink.internal.ProtoParametersSerialization create(java.lang.String r1, com.google.crypto.tink.proto.OutputPrefixType r2, com.google.crypto.tink.shaded.protobuf.MessageLite r3) {
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r0.setTypeUrl(r1)
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setOutputPrefixType(r2)
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r3.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setValue(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.KeyTemplate r1 = (com.google.crypto.tink.proto.KeyTemplate) r1
            com.google.crypto.tink.internal.ProtoParametersSerialization r1 = create(r1)
            return r1
    }

    public com.google.crypto.tink.proto.KeyTemplate getKeyTemplate() {
            r1 = this;
            com.google.crypto.tink.proto.KeyTemplate r0 = r1.keyTemplate
            return r0
    }

    @Override // com.google.crypto.tink.internal.Serialization
    public com.google.crypto.tink.util.Bytes getObjectIdentifier() {
            r1 = this;
            com.google.crypto.tink.util.Bytes r0 = r1.objectIdentifier
            return r0
    }
}
