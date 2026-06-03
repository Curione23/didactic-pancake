package com.google.crypto.tink;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
public final class KeyTemplate {
    private final com.google.crypto.tink.proto.KeyTemplate kt;

    /* JADX INFO: renamed from: com.google.crypto.tink.KeyTemplate$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType = null;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = null;

        static {
                com.google.crypto.tink.KeyTemplate$OutputPrefixType[] r0 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.KeyTemplate.AnonymousClass1.$SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType = r0
                r1 = 1
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r2 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.TINK     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = com.google.crypto.tink.KeyTemplate.AnonymousClass1.$SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r3 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.LEGACY     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = com.google.crypto.tink.KeyTemplate.AnonymousClass1.$SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r4 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                r3 = 4
                int[] r4 = com.google.crypto.tink.KeyTemplate.AnonymousClass1.$SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r5 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.CRUNCHY     // Catch: java.lang.NoSuchFieldError -> L33
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r4[r5] = r3     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                com.google.crypto.tink.proto.OutputPrefixType[] r4 = com.google.crypto.tink.proto.OutputPrefixType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                com.google.crypto.tink.KeyTemplate.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = r4
                com.google.crypto.tink.proto.OutputPrefixType r5 = com.google.crypto.tink.proto.OutputPrefixType.TINK     // Catch: java.lang.NoSuchFieldError -> L44
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L44
                r4[r5] = r1     // Catch: java.lang.NoSuchFieldError -> L44
            L44:
                int[] r1 = com.google.crypto.tink.KeyTemplate.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L4e
                com.google.crypto.tink.proto.OutputPrefixType r4 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY     // Catch: java.lang.NoSuchFieldError -> L4e
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4e
                r1[r4] = r0     // Catch: java.lang.NoSuchFieldError -> L4e
            L4e:
                int[] r0 = com.google.crypto.tink.KeyTemplate.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L58
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.RAW     // Catch: java.lang.NoSuchFieldError -> L58
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L58
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L58
            L58:
                int[] r0 = com.google.crypto.tink.KeyTemplate.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L62
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY     // Catch: java.lang.NoSuchFieldError -> L62
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L62
                r0[r1] = r3     // Catch: java.lang.NoSuchFieldError -> L62
            L62:
                return
        }
    }

    public enum OutputPrefixType extends java.lang.Enum<com.google.crypto.tink.KeyTemplate.OutputPrefixType> {
        private static final /* synthetic */ com.google.crypto.tink.KeyTemplate.OutputPrefixType[] $VALUES = null;
        public static final com.google.crypto.tink.KeyTemplate.OutputPrefixType CRUNCHY = null;
        public static final com.google.crypto.tink.KeyTemplate.OutputPrefixType LEGACY = null;
        public static final com.google.crypto.tink.KeyTemplate.OutputPrefixType RAW = null;
        public static final com.google.crypto.tink.KeyTemplate.OutputPrefixType TINK = null;

        static {
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r0 = new com.google.crypto.tink.KeyTemplate$OutputPrefixType
                java.lang.String r1 = "TINK"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.crypto.tink.KeyTemplate.OutputPrefixType.TINK = r0
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r1 = new com.google.crypto.tink.KeyTemplate$OutputPrefixType
                java.lang.String r2 = "LEGACY"
                r3 = 1
                r1.<init>(r2, r3)
                com.google.crypto.tink.KeyTemplate.OutputPrefixType.LEGACY = r1
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r2 = new com.google.crypto.tink.KeyTemplate$OutputPrefixType
                java.lang.String r3 = "RAW"
                r4 = 2
                r2.<init>(r3, r4)
                com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW = r2
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r3 = new com.google.crypto.tink.KeyTemplate$OutputPrefixType
                java.lang.String r4 = "CRUNCHY"
                r5 = 3
                r3.<init>(r4, r5)
                com.google.crypto.tink.KeyTemplate.OutputPrefixType.CRUNCHY = r3
                com.google.crypto.tink.KeyTemplate$OutputPrefixType[] r0 = new com.google.crypto.tink.KeyTemplate.OutputPrefixType[]{r0, r1, r2, r3}
                com.google.crypto.tink.KeyTemplate.OutputPrefixType.$VALUES = r0
                return
        }

        OutputPrefixType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.crypto.tink.KeyTemplate.OutputPrefixType valueOf(java.lang.String r1) {
                java.lang.Class<com.google.crypto.tink.KeyTemplate$OutputPrefixType> r0 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r1 = (com.google.crypto.tink.KeyTemplate.OutputPrefixType) r1
                return r1
        }

        public static com.google.crypto.tink.KeyTemplate.OutputPrefixType[] values() {
                com.google.crypto.tink.KeyTemplate$OutputPrefixType[] r0 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.crypto.tink.KeyTemplate$OutputPrefixType[] r0 = (com.google.crypto.tink.KeyTemplate.OutputPrefixType[]) r0
                return r0
        }
    }

    private KeyTemplate(com.google.crypto.tink.proto.KeyTemplate r1) {
            r0 = this;
            r0.<init>()
            r0.kt = r1
            return
    }

    public static com.google.crypto.tink.KeyTemplate create(java.lang.String r2, byte[] r3, com.google.crypto.tink.KeyTemplate.OutputPrefixType r4) {
            com.google.crypto.tink.KeyTemplate r0 = new com.google.crypto.tink.KeyTemplate
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            com.google.crypto.tink.proto.KeyTemplate$Builder r2 = r1.setTypeUrl(r2)
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r3)
            com.google.crypto.tink.proto.KeyTemplate$Builder r2 = r2.setValue(r3)
            com.google.crypto.tink.proto.OutputPrefixType r3 = toProto(r4)
            com.google.crypto.tink.proto.KeyTemplate$Builder r2 = r2.setOutputPrefixType(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.KeyTemplate r2 = (com.google.crypto.tink.proto.KeyTemplate) r2
            r0.<init>(r2)
            return r0
    }

    static com.google.crypto.tink.KeyTemplate.OutputPrefixType fromProto(com.google.crypto.tink.proto.OutputPrefixType r1) {
            int[] r0 = com.google.crypto.tink.KeyTemplate.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType
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
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
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

    static com.google.crypto.tink.proto.OutputPrefixType toProto(com.google.crypto.tink.KeyTemplate.OutputPrefixType r1) {
            int[] r0 = com.google.crypto.tink.KeyTemplate.AnonymousClass1.$SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType
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
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
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

    public com.google.crypto.tink.KeyTemplate.OutputPrefixType getOutputPrefixType() {
            r1 = this;
            com.google.crypto.tink.proto.KeyTemplate r0 = r1.kt
            com.google.crypto.tink.proto.OutputPrefixType r0 = r0.getOutputPrefixType()
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r0 = fromProto(r0)
            return r0
    }

    com.google.crypto.tink.proto.KeyTemplate getProto() {
            r1 = this;
            com.google.crypto.tink.proto.KeyTemplate r0 = r1.kt
            return r0
    }

    public java.lang.String getTypeUrl() {
            r1 = this;
            com.google.crypto.tink.proto.KeyTemplate r0 = r1.kt
            java.lang.String r0 = r0.getTypeUrl()
            return r0
    }

    public byte[] getValue() {
            r1 = this;
            com.google.crypto.tink.proto.KeyTemplate r0 = r1.kt
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getValue()
            byte[] r0 = r0.toByteArray()
            return r0
    }
}
