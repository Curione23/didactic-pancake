package com.google.crypto.tink.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class KeyTemplateProtoConverter {

    /* JADX INFO: renamed from: com.google.crypto.tink.internal.KeyTemplateProtoConverter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType = null;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = null;

        static {
                com.google.crypto.tink.KeyTemplate$OutputPrefixType[] r0 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.internal.KeyTemplateProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType = r0
                r1 = 1
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r2 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.TINK     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = com.google.crypto.tink.internal.KeyTemplateProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r3 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.LEGACY     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = com.google.crypto.tink.internal.KeyTemplateProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r4 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                r3 = 4
                int[] r4 = com.google.crypto.tink.internal.KeyTemplateProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r5 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.CRUNCHY     // Catch: java.lang.NoSuchFieldError -> L33
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r4[r5] = r3     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                com.google.crypto.tink.proto.OutputPrefixType[] r4 = com.google.crypto.tink.proto.OutputPrefixType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                com.google.crypto.tink.internal.KeyTemplateProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = r4
                com.google.crypto.tink.proto.OutputPrefixType r5 = com.google.crypto.tink.proto.OutputPrefixType.TINK     // Catch: java.lang.NoSuchFieldError -> L44
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L44
                r4[r5] = r1     // Catch: java.lang.NoSuchFieldError -> L44
            L44:
                int[] r1 = com.google.crypto.tink.internal.KeyTemplateProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L4e
                com.google.crypto.tink.proto.OutputPrefixType r4 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY     // Catch: java.lang.NoSuchFieldError -> L4e
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4e
                r1[r4] = r0     // Catch: java.lang.NoSuchFieldError -> L4e
            L4e:
                int[] r0 = com.google.crypto.tink.internal.KeyTemplateProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L58
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.RAW     // Catch: java.lang.NoSuchFieldError -> L58
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L58
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L58
            L58:
                int[] r0 = com.google.crypto.tink.internal.KeyTemplateProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L62
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY     // Catch: java.lang.NoSuchFieldError -> L62
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L62
                r0[r1] = r3     // Catch: java.lang.NoSuchFieldError -> L62
            L62:
                return
        }
    }

    private KeyTemplateProtoConverter() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.KeyTemplate fromByteArray(byte[] r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Ld
            com.google.crypto.tink.proto.KeyTemplate r2 = com.google.crypto.tink.proto.KeyTemplate.parseFrom(r2, r0)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Ld
            com.google.crypto.tink.KeyTemplate r2 = fromProto(r2)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Ld
            return r2
        Ld:
            r2 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "invalid key template"
            r0.<init>(r1, r2)
            throw r0
    }

    public static com.google.crypto.tink.KeyTemplate fromProto(com.google.crypto.tink.proto.KeyTemplate r2) throws java.security.GeneralSecurityException {
            java.lang.String r0 = r2.getTypeUrl()
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r2.getValue()
            byte[] r1 = r1.toByteArray()
            com.google.crypto.tink.proto.OutputPrefixType r2 = r2.getOutputPrefixType()
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r2 = prefixFromProto(r2)
            com.google.crypto.tink.KeyTemplate r2 = com.google.crypto.tink.KeyTemplate.create(r0, r1, r2)
            return r2
    }

    public static com.google.crypto.tink.KeyTemplate.OutputPrefixType prefixFromProto(com.google.crypto.tink.proto.OutputPrefixType r1) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.internal.KeyTemplateProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 1
            if (r1 == r0) goto L25
            r0 = 2
            if (r1 == r0) goto L22
            r0 = 3
            if (r1 == r0) goto L1f
            r0 = 4
            if (r1 != r0) goto L17
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r1 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.CRUNCHY
            return r1
        L17:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Unknown output prefix type"
            r1.<init>(r0)
            throw r1
        L1f:
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r1 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW
            return r1
        L22:
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r1 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.LEGACY
            return r1
        L25:
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r1 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.TINK
            return r1
    }

    private static com.google.crypto.tink.proto.OutputPrefixType prefixToProto(com.google.crypto.tink.KeyTemplate.OutputPrefixType r1) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.internal.KeyTemplateProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 1
            if (r1 == r0) goto L25
            r0 = 2
            if (r1 == r0) goto L22
            r0 = 3
            if (r1 == r0) goto L1f
            r0 = 4
            if (r1 != r0) goto L17
            com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY
            return r1
        L17:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Unknown output prefix type"
            r1.<init>(r0)
            throw r1
        L1f:
            com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            return r1
        L22:
            com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY
            return r1
        L25:
            com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            return r1
    }

    public static byte[] toByteArray(com.google.crypto.tink.KeyTemplate r0) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.KeyTemplate r0 = toProto(r0)
            byte[] r0 = r0.toByteArray()
            return r0
    }

    public static com.google.crypto.tink.proto.KeyTemplate toProto(com.google.crypto.tink.KeyTemplate r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            java.lang.String r1 = r2.getTypeUrl()
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setTypeUrl(r1)
            byte[] r1 = r2.getValue()
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r1)
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setValue(r1)
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r2 = r2.getOutputPrefixType()
            com.google.crypto.tink.proto.OutputPrefixType r2 = prefixToProto(r2)
            com.google.crypto.tink.proto.KeyTemplate$Builder r2 = r0.setOutputPrefixType(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.KeyTemplate r2 = (com.google.crypto.tink.proto.KeyTemplate) r2
            return r2
    }
}
