package com.google.crypto.tink.internal;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
public final class LegacyProtoParameters extends com.google.crypto.tink.Parameters {
    private final com.google.crypto.tink.internal.ProtoParametersSerialization serialization;

    /* JADX INFO: renamed from: com.google.crypto.tink.internal.LegacyProtoParameters$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = null;

        static {
                com.google.crypto.tink.proto.OutputPrefixType[] r0 = com.google.crypto.tink.proto.OutputPrefixType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.internal.LegacyProtoParameters.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = r0
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.TINK     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.crypto.tink.internal.LegacyProtoParameters.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.crypto.tink.internal.LegacyProtoParameters.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.RAW     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.crypto.tink.internal.LegacyProtoParameters.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    public LegacyProtoParameters(com.google.crypto.tink.internal.ProtoParametersSerialization r1) {
            r0 = this;
            r0.<init>()
            r0.serialization = r1
            return
    }

    private static java.lang.String outputPrefixToString(com.google.crypto.tink.proto.OutputPrefixType r1) {
            int[] r0 = com.google.crypto.tink.internal.LegacyProtoParameters.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 1
            if (r1 == r0) goto L20
            r0 = 2
            if (r1 == r0) goto L1d
            r0 = 3
            if (r1 == r0) goto L1a
            r0 = 4
            if (r1 == r0) goto L17
            java.lang.String r1 = "UNKNOWN"
            return r1
        L17:
            java.lang.String r1 = "CRUNCHY"
            return r1
        L1a:
            java.lang.String r1 = "RAW"
            return r1
        L1d:
            java.lang.String r1 = "LEGACY"
            return r1
        L20:
            java.lang.String r1 = "TINK"
            return r1
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.crypto.tink.internal.LegacyProtoParameters
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.crypto.tink.internal.LegacyProtoParameters r4 = (com.google.crypto.tink.internal.LegacyProtoParameters) r4
            com.google.crypto.tink.internal.ProtoParametersSerialization r4 = r4.serialization
            com.google.crypto.tink.internal.ProtoParametersSerialization r0 = r3.serialization
            com.google.crypto.tink.proto.KeyTemplate r0 = r0.getKeyTemplate()
            com.google.crypto.tink.proto.OutputPrefixType r0 = r0.getOutputPrefixType()
            com.google.crypto.tink.proto.KeyTemplate r2 = r4.getKeyTemplate()
            com.google.crypto.tink.proto.OutputPrefixType r2 = r2.getOutputPrefixType()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L53
            com.google.crypto.tink.internal.ProtoParametersSerialization r0 = r3.serialization
            com.google.crypto.tink.proto.KeyTemplate r0 = r0.getKeyTemplate()
            java.lang.String r0 = r0.getTypeUrl()
            com.google.crypto.tink.proto.KeyTemplate r2 = r4.getKeyTemplate()
            java.lang.String r2 = r2.getTypeUrl()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L53
            com.google.crypto.tink.internal.ProtoParametersSerialization r0 = r3.serialization
            com.google.crypto.tink.proto.KeyTemplate r0 = r0.getKeyTemplate()
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getValue()
            com.google.crypto.tink.proto.KeyTemplate r4 = r4.getKeyTemplate()
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = r4.getValue()
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L53
            r1 = 1
        L53:
            return r1
    }

    public com.google.crypto.tink.internal.ProtoParametersSerialization getSerialization() {
            r1 = this;
            com.google.crypto.tink.internal.ProtoParametersSerialization r0 = r1.serialization
            return r0
    }

    @Override // com.google.crypto.tink.Parameters
    public boolean hasIdRequirement() {
            r2 = this;
            com.google.crypto.tink.internal.ProtoParametersSerialization r0 = r2.serialization
            com.google.crypto.tink.proto.KeyTemplate r0 = r0.getKeyTemplate()
            com.google.crypto.tink.proto.OutputPrefixType r0 = r0.getOutputPrefixType()
            com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            if (r0 == r1) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public int hashCode() {
            r2 = this;
            com.google.crypto.tink.internal.ProtoParametersSerialization r0 = r2.serialization
            com.google.crypto.tink.proto.KeyTemplate r0 = r0.getKeyTemplate()
            com.google.crypto.tink.internal.ProtoParametersSerialization r1 = r2.serialization
            com.google.crypto.tink.util.Bytes r1 = r1.getObjectIdentifier()
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            int r0 = java.util.Objects.hash(r0)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            com.google.crypto.tink.internal.ProtoParametersSerialization r0 = r2.serialization
            com.google.crypto.tink.proto.KeyTemplate r0 = r0.getKeyTemplate()
            java.lang.String r0 = r0.getTypeUrl()
            com.google.crypto.tink.internal.ProtoParametersSerialization r1 = r2.serialization
            com.google.crypto.tink.proto.KeyTemplate r1 = r1.getKeyTemplate()
            com.google.crypto.tink.proto.OutputPrefixType r1 = r1.getOutputPrefixType()
            java.lang.String r1 = outputPrefixToString(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "(typeUrl=%s, outputPrefixType=%s)"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }
}
