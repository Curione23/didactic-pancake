package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
final class FieldInfo implements java.lang.Comparable<com.google.crypto.tink.shaded.protobuf.FieldInfo> {
    private final java.lang.reflect.Field cachedSizeField;
    private final boolean enforceUtf8;
    private final com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier enumVerifier;
    private final java.lang.reflect.Field field;
    private final int fieldNumber;
    private final java.lang.Object mapDefaultEntry;
    private final java.lang.Class<?> messageClass;
    private final com.google.crypto.tink.shaded.protobuf.OneofInfo oneof;
    private final java.lang.Class<?> oneofStoredType;
    private final java.lang.reflect.Field presenceField;
    private final int presenceMask;
    private final boolean required;
    private final com.google.crypto.tink.shaded.protobuf.FieldType type;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.FieldInfo$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$FieldType = null;

        static {
                com.google.crypto.tink.shaded.protobuf.FieldType[] r0 = com.google.crypto.tink.shaded.protobuf.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.shaded.protobuf.FieldInfo.AnonymousClass1.$SwitchMap$com$google$protobuf$FieldType = r0
                com.google.crypto.tink.shaded.protobuf.FieldType r1 = com.google.crypto.tink.shaded.protobuf.FieldType.MESSAGE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.FieldInfo.AnonymousClass1.$SwitchMap$com$google$protobuf$FieldType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.shaded.protobuf.FieldType r1 = com.google.crypto.tink.shaded.protobuf.FieldType.GROUP     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.FieldInfo.AnonymousClass1.$SwitchMap$com$google$protobuf$FieldType     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.shaded.protobuf.FieldType r1 = com.google.crypto.tink.shaded.protobuf.FieldType.MESSAGE_LIST     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.FieldInfo.AnonymousClass1.$SwitchMap$com$google$protobuf$FieldType     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.crypto.tink.shaded.protobuf.FieldType r1 = com.google.crypto.tink.shaded.protobuf.FieldType.GROUP_LIST     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    public static final class Builder {
        private java.lang.reflect.Field cachedSizeField;
        private boolean enforceUtf8;
        private com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier enumVerifier;
        private java.lang.reflect.Field field;
        private int fieldNumber;
        private java.lang.Object mapDefaultEntry;
        private com.google.crypto.tink.shaded.protobuf.OneofInfo oneof;
        private java.lang.Class<?> oneofStoredType;
        private java.lang.reflect.Field presenceField;
        private int presenceMask;
        private boolean required;
        private com.google.crypto.tink.shaded.protobuf.FieldType type;

        private Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ Builder(com.google.crypto.tink.shaded.protobuf.FieldInfo.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.crypto.tink.shaded.protobuf.FieldInfo build() {
                r8 = this;
                com.google.crypto.tink.shaded.protobuf.OneofInfo r2 = r8.oneof
                if (r2 == 0) goto L13
                int r0 = r8.fieldNumber
                com.google.crypto.tink.shaded.protobuf.FieldType r1 = r8.type
                java.lang.Class<?> r3 = r8.oneofStoredType
                boolean r4 = r8.enforceUtf8
                com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r5 = r8.enumVerifier
                com.google.crypto.tink.shaded.protobuf.FieldInfo r0 = com.google.crypto.tink.shaded.protobuf.FieldInfo.forOneofMemberField(r0, r1, r2, r3, r4, r5)
                return r0
            L13:
                java.lang.Object r0 = r8.mapDefaultEntry
                if (r0 == 0) goto L22
                java.lang.reflect.Field r1 = r8.field
                int r2 = r8.fieldNumber
                com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r3 = r8.enumVerifier
                com.google.crypto.tink.shaded.protobuf.FieldInfo r0 = com.google.crypto.tink.shaded.protobuf.FieldInfo.forMapField(r1, r2, r0, r3)
                return r0
            L22:
                java.lang.reflect.Field r4 = r8.presenceField
                if (r4 == 0) goto L4c
                boolean r0 = r8.required
                if (r0 == 0) goto L3b
                java.lang.reflect.Field r1 = r8.field
                int r2 = r8.fieldNumber
                com.google.crypto.tink.shaded.protobuf.FieldType r3 = r8.type
                int r5 = r8.presenceMask
                boolean r6 = r8.enforceUtf8
                com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r7 = r8.enumVerifier
                com.google.crypto.tink.shaded.protobuf.FieldInfo r0 = com.google.crypto.tink.shaded.protobuf.FieldInfo.forProto2RequiredField(r1, r2, r3, r4, r5, r6, r7)
                return r0
            L3b:
                java.lang.reflect.Field r1 = r8.field
                int r2 = r8.fieldNumber
                com.google.crypto.tink.shaded.protobuf.FieldType r3 = r8.type
                int r5 = r8.presenceMask
                boolean r6 = r8.enforceUtf8
                com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r7 = r8.enumVerifier
                com.google.crypto.tink.shaded.protobuf.FieldInfo r0 = com.google.crypto.tink.shaded.protobuf.FieldInfo.forProto2OptionalField(r1, r2, r3, r4, r5, r6, r7)
                return r0
            L4c:
                com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r0 = r8.enumVerifier
                if (r0 == 0) goto L6a
                java.lang.reflect.Field r1 = r8.cachedSizeField
                if (r1 != 0) goto L5f
                java.lang.reflect.Field r1 = r8.field
                int r2 = r8.fieldNumber
                com.google.crypto.tink.shaded.protobuf.FieldType r3 = r8.type
                com.google.crypto.tink.shaded.protobuf.FieldInfo r0 = com.google.crypto.tink.shaded.protobuf.FieldInfo.forFieldWithEnumVerifier(r1, r2, r3, r0)
                return r0
            L5f:
                java.lang.reflect.Field r2 = r8.field
                int r3 = r8.fieldNumber
                com.google.crypto.tink.shaded.protobuf.FieldType r4 = r8.type
                com.google.crypto.tink.shaded.protobuf.FieldInfo r0 = com.google.crypto.tink.shaded.protobuf.FieldInfo.forPackedFieldWithEnumVerifier(r2, r3, r4, r0, r1)
                return r0
            L6a:
                java.lang.reflect.Field r0 = r8.cachedSizeField
                if (r0 != 0) goto L7b
                java.lang.reflect.Field r0 = r8.field
                int r1 = r8.fieldNumber
                com.google.crypto.tink.shaded.protobuf.FieldType r2 = r8.type
                boolean r3 = r8.enforceUtf8
                com.google.crypto.tink.shaded.protobuf.FieldInfo r0 = com.google.crypto.tink.shaded.protobuf.FieldInfo.forField(r0, r1, r2, r3)
                return r0
            L7b:
                java.lang.reflect.Field r1 = r8.field
                int r2 = r8.fieldNumber
                com.google.crypto.tink.shaded.protobuf.FieldType r3 = r8.type
                com.google.crypto.tink.shaded.protobuf.FieldInfo r0 = com.google.crypto.tink.shaded.protobuf.FieldInfo.forPackedField(r1, r2, r3, r0)
                return r0
        }

        public com.google.crypto.tink.shaded.protobuf.FieldInfo.Builder withCachedSizeField(java.lang.reflect.Field r1) {
                r0 = this;
                r0.cachedSizeField = r1
                return r0
        }

        public com.google.crypto.tink.shaded.protobuf.FieldInfo.Builder withEnforceUtf8(boolean r1) {
                r0 = this;
                r0.enforceUtf8 = r1
                return r0
        }

        public com.google.crypto.tink.shaded.protobuf.FieldInfo.Builder withEnumVerifier(com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier r1) {
                r0 = this;
                r0.enumVerifier = r1
                return r0
        }

        public com.google.crypto.tink.shaded.protobuf.FieldInfo.Builder withField(java.lang.reflect.Field r2) {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.OneofInfo r0 = r1.oneof
                if (r0 != 0) goto L7
                r1.field = r2
                return r1
            L7:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "Cannot set field when building a oneof."
                r2.<init>(r0)
                throw r2
        }

        public com.google.crypto.tink.shaded.protobuf.FieldInfo.Builder withFieldNumber(int r1) {
                r0 = this;
                r0.fieldNumber = r1
                return r0
        }

        public com.google.crypto.tink.shaded.protobuf.FieldInfo.Builder withMapDefaultEntry(java.lang.Object r1) {
                r0 = this;
                r0.mapDefaultEntry = r1
                return r0
        }

        public com.google.crypto.tink.shaded.protobuf.FieldInfo.Builder withOneof(com.google.crypto.tink.shaded.protobuf.OneofInfo r2, java.lang.Class<?> r3) {
                r1 = this;
                java.lang.reflect.Field r0 = r1.field
                if (r0 != 0) goto Ld
                java.lang.reflect.Field r0 = r1.presenceField
                if (r0 != 0) goto Ld
                r1.oneof = r2
                r1.oneofStoredType = r3
                return r1
            Ld:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r3 = "Cannot set oneof when field or presenceField have been provided"
                r2.<init>(r3)
                throw r2
        }

        public com.google.crypto.tink.shaded.protobuf.FieldInfo.Builder withPresence(java.lang.reflect.Field r2, int r3) {
                r1 = this;
                java.lang.String r0 = "presenceField"
                java.lang.Object r2 = com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r2, r0)
                java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
                r1.presenceField = r2
                r1.presenceMask = r3
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.FieldInfo.Builder withRequired(boolean r1) {
                r0 = this;
                r0.required = r1
                return r0
        }

        public com.google.crypto.tink.shaded.protobuf.FieldInfo.Builder withType(com.google.crypto.tink.shaded.protobuf.FieldType r1) {
                r0 = this;
                r0.type = r1
                return r0
        }
    }

    private FieldInfo(java.lang.reflect.Field r1, int r2, com.google.crypto.tink.shaded.protobuf.FieldType r3, java.lang.Class<?> r4, java.lang.reflect.Field r5, int r6, boolean r7, boolean r8, com.google.crypto.tink.shaded.protobuf.OneofInfo r9, java.lang.Class<?> r10, java.lang.Object r11, com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier r12, java.lang.reflect.Field r13) {
            r0 = this;
            r0.<init>()
            r0.field = r1
            r0.type = r3
            r0.messageClass = r4
            r0.fieldNumber = r2
            r0.presenceField = r5
            r0.presenceMask = r6
            r0.required = r7
            r0.enforceUtf8 = r8
            r0.oneof = r9
            r0.oneofStoredType = r10
            r0.mapDefaultEntry = r11
            r0.enumVerifier = r12
            r0.cachedSizeField = r13
            return
    }

    private static void checkFieldNumber(int r3) {
            if (r3 <= 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "fieldNumber must be positive: "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    public static com.google.crypto.tink.shaded.protobuf.FieldInfo forField(java.lang.reflect.Field r15, int r16, com.google.crypto.tink.shaded.protobuf.FieldType r17, boolean r18) {
            r3 = r17
            checkFieldNumber(r16)
            java.lang.String r0 = "field"
            r1 = r15
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r15, r0)
            java.lang.String r0 = "fieldType"
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r3, r0)
            com.google.crypto.tink.shaded.protobuf.FieldType r0 = com.google.crypto.tink.shaded.protobuf.FieldType.MESSAGE_LIST
            if (r3 == r0) goto L2f
            com.google.crypto.tink.shaded.protobuf.FieldType r0 = com.google.crypto.tink.shaded.protobuf.FieldType.GROUP_LIST
            if (r3 == r0) goto L2f
            com.google.crypto.tink.shaded.protobuf.FieldInfo r14 = new com.google.crypto.tink.shaded.protobuf.FieldInfo
            r12 = 0
            r13 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r8 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r14
        L2f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Shouldn't be called for repeated message fields."
            r0.<init>(r1)
            throw r0
    }

    public static com.google.crypto.tink.shaded.protobuf.FieldInfo forFieldWithEnumVerifier(java.lang.reflect.Field r15, int r16, com.google.crypto.tink.shaded.protobuf.FieldType r17, com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier r18) {
            checkFieldNumber(r16)
            java.lang.String r0 = "field"
            r2 = r15
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r15, r0)
            com.google.crypto.tink.shaded.protobuf.FieldInfo r0 = new com.google.crypto.tink.shaded.protobuf.FieldInfo
            r12 = 0
            r14 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r1 = r0
            r3 = r16
            r4 = r17
            r13 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.FieldInfo forMapField(java.lang.reflect.Field r15, int r16, java.lang.Object r17, com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier r18) {
            java.lang.String r0 = "mapDefaultEntry"
            r12 = r17
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r12, r0)
            checkFieldNumber(r16)
            java.lang.String r0 = "field"
            r2 = r15
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r15, r0)
            com.google.crypto.tink.shaded.protobuf.FieldInfo r0 = new com.google.crypto.tink.shaded.protobuf.FieldInfo
            com.google.crypto.tink.shaded.protobuf.FieldType r4 = com.google.crypto.tink.shaded.protobuf.FieldType.MAP
            r11 = 0
            r14 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 1
            r10 = 0
            r1 = r0
            r3 = r16
            r13 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.FieldInfo forOneofMemberField(int r15, com.google.crypto.tink.shaded.protobuf.FieldType r16, com.google.crypto.tink.shaded.protobuf.OneofInfo r17, java.lang.Class<?> r18, boolean r19, com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier r20) {
            r3 = r16
            checkFieldNumber(r15)
            java.lang.String r0 = "fieldType"
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r3, r0)
            java.lang.String r0 = "oneof"
            r9 = r17
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r9, r0)
            java.lang.String r0 = "oneofStoredType"
            r10 = r18
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r10, r0)
            boolean r0 = r16.isScalar()
            if (r0 == 0) goto L37
            com.google.crypto.tink.shaded.protobuf.FieldInfo r14 = new com.google.crypto.tink.shaded.protobuf.FieldInfo
            r11 = 0
            r13 = 0
            r1 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r14
            r2 = r15
            r3 = r16
            r8 = r19
            r9 = r17
            r10 = r18
            r12 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r14
        L37:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Oneof is only supported for scalar fields. Field "
            r1.<init>(r2)
            r2 = r15
            java.lang.StringBuilder r1 = r1.append(r15)
            java.lang.String r2 = " is of type "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static com.google.crypto.tink.shaded.protobuf.FieldInfo forPackedField(java.lang.reflect.Field r15, int r16, com.google.crypto.tink.shaded.protobuf.FieldType r17, java.lang.reflect.Field r18) {
            r3 = r17
            checkFieldNumber(r16)
            java.lang.String r0 = "field"
            r1 = r15
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r15, r0)
            java.lang.String r0 = "fieldType"
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r3, r0)
            com.google.crypto.tink.shaded.protobuf.FieldType r0 = com.google.crypto.tink.shaded.protobuf.FieldType.MESSAGE_LIST
            if (r3 == r0) goto L2f
            com.google.crypto.tink.shaded.protobuf.FieldType r0 = com.google.crypto.tink.shaded.protobuf.FieldType.GROUP_LIST
            if (r3 == r0) goto L2f
            com.google.crypto.tink.shaded.protobuf.FieldInfo r14 = new com.google.crypto.tink.shaded.protobuf.FieldInfo
            r11 = 0
            r12 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r13 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r14
        L2f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Shouldn't be called for repeated message fields."
            r0.<init>(r1)
            throw r0
    }

    public static com.google.crypto.tink.shaded.protobuf.FieldInfo forPackedFieldWithEnumVerifier(java.lang.reflect.Field r15, int r16, com.google.crypto.tink.shaded.protobuf.FieldType r17, com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier r18, java.lang.reflect.Field r19) {
            checkFieldNumber(r16)
            java.lang.String r0 = "field"
            r2 = r15
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r15, r0)
            com.google.crypto.tink.shaded.protobuf.FieldInfo r0 = new com.google.crypto.tink.shaded.protobuf.FieldInfo
            r11 = 0
            r12 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r1 = r0
            r3 = r16
            r4 = r17
            r13 = r18
            r14 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.FieldInfo forProto2OptionalField(java.lang.reflect.Field r15, int r16, com.google.crypto.tink.shaded.protobuf.FieldType r17, java.lang.reflect.Field r18, int r19, boolean r20, com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier r21) {
            r5 = r18
            checkFieldNumber(r16)
            java.lang.String r0 = "field"
            r1 = r15
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r15, r0)
            java.lang.String r0 = "fieldType"
            r3 = r17
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r3, r0)
            java.lang.String r0 = "presenceField"
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r5, r0)
            if (r5 == 0) goto L37
            boolean r0 = isExactlyOneBitSet(r19)
            if (r0 == 0) goto L20
            goto L37
        L20:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "presenceMask must have exactly one bit set: "
            r1.<init>(r2)
            r6 = r19
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L37:
            r6 = r19
            com.google.crypto.tink.shaded.protobuf.FieldInfo r14 = new com.google.crypto.tink.shaded.protobuf.FieldInfo
            r11 = 0
            r13 = 0
            r4 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r18
            r6 = r19
            r8 = r20
            r12 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r14
    }

    public static com.google.crypto.tink.shaded.protobuf.FieldInfo forProto2RequiredField(java.lang.reflect.Field r15, int r16, com.google.crypto.tink.shaded.protobuf.FieldType r17, java.lang.reflect.Field r18, int r19, boolean r20, com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier r21) {
            r5 = r18
            checkFieldNumber(r16)
            java.lang.String r0 = "field"
            r1 = r15
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r15, r0)
            java.lang.String r0 = "fieldType"
            r3 = r17
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r3, r0)
            java.lang.String r0 = "presenceField"
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r5, r0)
            if (r5 == 0) goto L37
            boolean r0 = isExactlyOneBitSet(r19)
            if (r0 == 0) goto L20
            goto L37
        L20:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "presenceMask must have exactly one bit set: "
            r1.<init>(r2)
            r6 = r19
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L37:
            r6 = r19
            com.google.crypto.tink.shaded.protobuf.FieldInfo r14 = new com.google.crypto.tink.shaded.protobuf.FieldInfo
            r11 = 0
            r13 = 0
            r4 = 0
            r7 = 1
            r9 = 0
            r10 = 0
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r18
            r6 = r19
            r8 = r20
            r12 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r14
    }

    public static com.google.crypto.tink.shaded.protobuf.FieldInfo forRepeatedMessageField(java.lang.reflect.Field r15, int r16, com.google.crypto.tink.shaded.protobuf.FieldType r17, java.lang.Class<?> r18) {
            checkFieldNumber(r16)
            java.lang.String r0 = "field"
            r2 = r15
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r15, r0)
            java.lang.String r0 = "fieldType"
            r4 = r17
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r4, r0)
            java.lang.String r0 = "messageClass"
            r5 = r18
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r5, r0)
            com.google.crypto.tink.shaded.protobuf.FieldInfo r0 = new com.google.crypto.tink.shaded.protobuf.FieldInfo
            r13 = 0
            r14 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r1 = r0
            r3 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
    }

    private static boolean isExactlyOneBitSet(int r1) {
            if (r1 == 0) goto L9
            int r0 = r1 + (-1)
            r1 = r1 & r0
            if (r1 != 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.FieldInfo.Builder newBuilder() {
            com.google.crypto.tink.shaded.protobuf.FieldInfo$Builder r0 = new com.google.crypto.tink.shaded.protobuf.FieldInfo$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(com.google.crypto.tink.shaded.protobuf.FieldInfo r2) {
            r1 = this;
            int r0 = r1.fieldNumber
            int r2 = r2.fieldNumber
            int r0 = r0 - r2
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(com.google.crypto.tink.shaded.protobuf.FieldInfo r1) {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.FieldInfo r1 = (com.google.crypto.tink.shaded.protobuf.FieldInfo) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public java.lang.reflect.Field getCachedSizeField() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.cachedSizeField
            return r0
    }

    public com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier getEnumVerifier() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r0 = r1.enumVerifier
            return r0
    }

    public java.lang.reflect.Field getField() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.field
            return r0
    }

    public int getFieldNumber() {
            r1 = this;
            int r0 = r1.fieldNumber
            return r0
    }

    public java.lang.Class<?> getListElementType() {
            r1 = this;
            java.lang.Class<?> r0 = r1.messageClass
            return r0
    }

    public java.lang.Object getMapDefaultEntry() {
            r1 = this;
            java.lang.Object r0 = r1.mapDefaultEntry
            return r0
    }

    public java.lang.Class<?> getMessageFieldClass() {
            r2 = this;
            int[] r0 = com.google.crypto.tink.shaded.protobuf.FieldInfo.AnonymousClass1.$SwitchMap$com$google$protobuf$FieldType
            com.google.crypto.tink.shaded.protobuf.FieldType r1 = r2.type
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L1b
            r1 = 2
            if (r0 == r1) goto L1b
            r1 = 3
            if (r0 == r1) goto L18
            r1 = 4
            if (r0 == r1) goto L18
            r0 = 0
            return r0
        L18:
            java.lang.Class<?> r0 = r2.messageClass
            return r0
        L1b:
            java.lang.reflect.Field r0 = r2.field
            if (r0 == 0) goto L24
            java.lang.Class r0 = r0.getType()
            goto L26
        L24:
            java.lang.Class<?> r0 = r2.oneofStoredType
        L26:
            return r0
    }

    public com.google.crypto.tink.shaded.protobuf.OneofInfo getOneof() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.OneofInfo r0 = r1.oneof
            return r0
    }

    public java.lang.Class<?> getOneofStoredType() {
            r1 = this;
            java.lang.Class<?> r0 = r1.oneofStoredType
            return r0
    }

    public java.lang.reflect.Field getPresenceField() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.presenceField
            return r0
    }

    public int getPresenceMask() {
            r1 = this;
            int r0 = r1.presenceMask
            return r0
    }

    public com.google.crypto.tink.shaded.protobuf.FieldType getType() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.FieldType r0 = r1.type
            return r0
    }

    public boolean isEnforceUtf8() {
            r1 = this;
            boolean r0 = r1.enforceUtf8
            return r0
    }

    public boolean isRequired() {
            r1 = this;
            boolean r0 = r1.required
            return r0
    }
}
