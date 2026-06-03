package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
final class MessageSchema<T> implements com.google.crypto.tink.shaded.protobuf.Schema<T> {
    private static final int[] EMPTY_INT_ARRAY = null;
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int INTS_PER_FIELD = 3;
    private static final int NO_PRESENCE_SENTINEL = 1048575;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_MASK = 268435456;
    private static final sun.misc.Unsafe UNSAFE = null;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final com.google.crypto.tink.shaded.protobuf.MessageLite defaultInstance;
    private final com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final com.google.crypto.tink.shaded.protobuf.ListFieldSchema listFieldSchema;
    private final boolean lite;
    private final com.google.crypto.tink.shaded.protobuf.MapFieldSchema mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final com.google.crypto.tink.shaded.protobuf.NewInstanceSchema newInstanceSchema;
    private final java.lang.Object[] objects;
    private final boolean proto3;
    private final int repeatedFieldOffsetStart;
    private final com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.MessageSchema$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType = null;

        static {
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.shaded.protobuf.MessageSchema.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.BOOL     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.BYTES     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.DOUBLE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FIXED32     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L3e
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SFIXED32     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FIXED64     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L54
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SFIXED64     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L60
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FLOAT     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L6c
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.ENUM     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L78
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.INT32     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L84
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.UINT32     // Catch: java.lang.NoSuchFieldError -> L84
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L84
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L84
            L84:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L90
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.INT64     // Catch: java.lang.NoSuchFieldError -> L90
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L90
                r2 = 12
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L90
            L90:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L9c
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.UINT64     // Catch: java.lang.NoSuchFieldError -> L9c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9c
                r2 = 13
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9c
            L9c:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> La8
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.MESSAGE     // Catch: java.lang.NoSuchFieldError -> La8
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La8
                r2 = 14
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La8
            La8:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lb4
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SINT32     // Catch: java.lang.NoSuchFieldError -> Lb4
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb4
                r2 = 15
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb4
            Lb4:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lc0
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SINT64     // Catch: java.lang.NoSuchFieldError -> Lc0
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc0
                r2 = 16
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lc0
            Lc0:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lcc
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.STRING     // Catch: java.lang.NoSuchFieldError -> Lcc
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lcc
                r2 = 17
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lcc
            Lcc:
                return
        }
    }

    static {
            r0 = 0
            int[] r0 = new int[r0]
            com.google.crypto.tink.shaded.protobuf.MessageSchema.EMPTY_INT_ARRAY = r0
            sun.misc.Unsafe r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getUnsafe()
            com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE = r0
            return
    }

    private MessageSchema(int[] r1, java.lang.Object[] r2, int r3, int r4, com.google.crypto.tink.shaded.protobuf.MessageLite r5, boolean r6, boolean r7, int[] r8, int r9, int r10, com.google.crypto.tink.shaded.protobuf.NewInstanceSchema r11, com.google.crypto.tink.shaded.protobuf.ListFieldSchema r12, com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r13, com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r14, com.google.crypto.tink.shaded.protobuf.MapFieldSchema r15) {
            r0 = this;
            r0.<init>()
            r0.buffer = r1
            r0.objects = r2
            r0.minFieldNumber = r3
            r0.maxFieldNumber = r4
            boolean r1 = r5 instanceof com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
            r0.lite = r1
            r0.proto3 = r6
            if (r14 == 0) goto L1b
            boolean r1 = r14.hasExtensions(r5)
            if (r1 == 0) goto L1b
            r1 = 1
            goto L1c
        L1b:
            r1 = 0
        L1c:
            r0.hasExtensions = r1
            r0.useCachedSizeField = r7
            r0.intArray = r8
            r0.checkInitializedCount = r9
            r0.repeatedFieldOffsetStart = r10
            r0.newInstanceSchema = r11
            r0.listFieldSchema = r12
            r0.unknownFieldSchema = r13
            r0.extensionSchema = r14
            r0.defaultInstance = r5
            r0.mapFieldSchema = r15
            return
    }

    private boolean arePresentForEquals(T r1, T r2, int r3) {
            r0 = this;
            boolean r1 = r0.isFieldPresent(r1, r3)
            boolean r2 = r0.isFieldPresent(r2, r3)
            if (r1 != r2) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }

    private static <T> boolean booleanAt(T r0, long r1) {
            boolean r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getBoolean(r0, r1)
            return r0
    }

    private static void checkMutable(java.lang.Object r3) {
            boolean r0 = isMutable(r3)
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Mutating immutable message: "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    private <K, V> int decodeMapEntry(byte[] r15, int r16, int r17, com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<K, V> r18, java.util.Map<K, V> r19, com.google.crypto.tink.shaded.protobuf.ArrayDecoders.Registers r20) throws java.io.IOException {
            r14 = this;
            r7 = r15
            r8 = r17
            r9 = r18
            r0 = r16
            r10 = r20
            int r0 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32(r15, r0, r10)
            int r1 = r10.int1
            if (r1 < 0) goto L81
            int r2 = r8 - r0
            if (r1 > r2) goto L81
            int r11 = r0 + r1
            K r1 = r9.defaultKey
            V r2 = r9.defaultValue
            r12 = r1
            r13 = r2
        L1d:
            if (r0 >= r11) goto L74
            int r1 = r0 + 1
            r0 = r7[r0]
            if (r0 >= 0) goto L2e
            int r0 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32(r0, r15, r1, r10)
            int r1 = r10.int1
            r2 = r0
            r0 = r1
            goto L2f
        L2e:
            r2 = r1
        L2f:
            int r1 = r0 >>> 3
            r3 = r0 & 7
            r4 = 1
            if (r1 == r4) goto L57
            r4 = 2
            if (r1 == r4) goto L3a
            goto L6f
        L3a:
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = r9.valueType
            int r1 = r1.getWireType()
            if (r3 != r1) goto L6f
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r4 = r9.valueType
            V r0 = r9.defaultValue
            java.lang.Class r5 = r0.getClass()
            r0 = r14
            r1 = r15
            r3 = r17
            r6 = r20
            int r0 = r0.decodeMapEntryValue(r1, r2, r3, r4, r5, r6)
            java.lang.Object r13 = r10.object1
            goto L1d
        L57:
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = r9.keyType
            int r1 = r1.getWireType()
            if (r3 != r1) goto L6f
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r4 = r9.keyType
            r5 = 0
            r0 = r14
            r1 = r15
            r3 = r17
            r6 = r20
            int r0 = r0.decodeMapEntryValue(r1, r2, r3, r4, r5, r6)
            java.lang.Object r12 = r10.object1
            goto L1d
        L6f:
            int r0 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.skipField(r0, r15, r2, r8, r10)
            goto L1d
        L74:
            if (r0 != r11) goto L7c
            r0 = r19
            r0.put(r12, r13)
            return r11
        L7c:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r0
        L81:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
            throw r0
    }

    private int decodeMapEntryValue(byte[] r2, int r3, int r4, com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r5, java.lang.Class<?> r6, com.google.crypto.tink.shaded.protobuf.ArrayDecoders.Registers r7) throws java.io.IOException {
            r1 = this;
            int[] r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType
            int r5 = r5.ordinal()
            r5 = r0[r5]
            switch(r5) {
                case 1: goto L99;
                case 2: goto L94;
                case 3: goto L87;
                case 4: goto L7a;
                case 5: goto L7a;
                case 6: goto L6f;
                case 7: goto L6f;
                case 8: goto L64;
                case 9: goto L57;
                case 10: goto L57;
                case 11: goto L57;
                case 12: goto L4a;
                case 13: goto L4a;
                case 14: goto L3d;
                case 15: goto L2b;
                case 16: goto L19;
                case 17: goto L13;
                default: goto Lb;
            }
        Lb:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "unsupported field type."
            r2.<init>(r3)
            throw r2
        L13:
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeStringRequireUtf8(r2, r3, r7)
            goto Lae
        L19:
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint64(r2, r3, r7)
            long r3 = r7.long1
            long r3 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.decodeZigZag64(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r7.object1 = r3
            goto Lae
        L2b:
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32(r2, r3, r7)
            int r3 = r7.int1
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.decodeZigZag32(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.object1 = r3
            goto Lae
        L3d:
            com.google.crypto.tink.shaded.protobuf.Protobuf r5 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
            com.google.crypto.tink.shaded.protobuf.Schema r5 = r5.schemaFor(r6)
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeMessageField(r5, r2, r3, r4, r7)
            goto Lae
        L4a:
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint64(r2, r3, r7)
            long r3 = r7.long1
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r7.object1 = r3
            goto Lae
        L57:
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32(r2, r3, r7)
            int r3 = r7.int1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.object1 = r3
            goto Lae
        L64:
            float r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeFloat(r2, r3)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r7.object1 = r2
            goto L84
        L6f:
            long r4 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeFixed64(r2, r3)
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r7.object1 = r2
            goto L91
        L7a:
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeFixed32(r2, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7.object1 = r2
        L84:
            int r2 = r3 + 4
            goto Lae
        L87:
            double r4 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeDouble(r2, r3)
            java.lang.Double r2 = java.lang.Double.valueOf(r4)
            r7.object1 = r2
        L91:
            int r2 = r3 + 8
            goto Lae
        L94:
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeBytes(r2, r3, r7)
            goto Lae
        L99:
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint64(r2, r3, r7)
            long r3 = r7.long1
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto La7
            r3 = 1
            goto La8
        La7:
            r3 = 0
        La8:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r7.object1 = r3
        Lae:
            return r2
    }

    private static <T> double doubleAt(T r0, long r1) {
            double r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getDouble(r0, r1)
            return r0
    }

    private boolean equals(T r8, T r9, int r10) {
            r7 = this;
            int r0 = r7.typeAndOffsetAt(r10)
            long r1 = offset(r0)
            int r0 = type(r0)
            r3 = 0
            r4 = 1
            switch(r0) {
                case 0: goto L196;
                case 1: goto L17c;
                case 2: goto L168;
                case 3: goto L154;
                case 4: goto L142;
                case 5: goto L12e;
                case 6: goto L11c;
                case 7: goto L10a;
                case 8: goto Lf4;
                case 9: goto Lde;
                case 10: goto Lc8;
                case 11: goto Lb6;
                case 12: goto La4;
                case 13: goto L92;
                case 14: goto L7e;
                case 15: goto L6c;
                case 16: goto L58;
                case 17: goto L42;
                case 18: goto L35;
                case 19: goto L35;
                case 20: goto L35;
                case 21: goto L35;
                case 22: goto L35;
                case 23: goto L35;
                case 24: goto L35;
                case 25: goto L35;
                case 26: goto L35;
                case 27: goto L35;
                case 28: goto L35;
                case 29: goto L35;
                case 30: goto L35;
                case 31: goto L35;
                case 32: goto L35;
                case 33: goto L35;
                case 34: goto L35;
                case 35: goto L35;
                case 36: goto L35;
                case 37: goto L35;
                case 38: goto L35;
                case 39: goto L35;
                case 40: goto L35;
                case 41: goto L35;
                case 42: goto L35;
                case 43: goto L35;
                case 44: goto L35;
                case 45: goto L35;
                case 46: goto L35;
                case 47: goto L35;
                case 48: goto L35;
                case 49: goto L35;
                case 50: goto L28;
                case 51: goto L12;
                case 52: goto L12;
                case 53: goto L12;
                case 54: goto L12;
                case 55: goto L12;
                case 56: goto L12;
                case 57: goto L12;
                case 58: goto L12;
                case 59: goto L12;
                case 60: goto L12;
                case 61: goto L12;
                case 62: goto L12;
                case 63: goto L12;
                case 64: goto L12;
                case 65: goto L12;
                case 66: goto L12;
                case 67: goto L12;
                case 68: goto L12;
                default: goto L11;
            }
        L11:
            return r4
        L12:
            boolean r10 = r7.isOneofCaseEqual(r8, r9, r10)
            if (r10 == 0) goto L27
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r8, r1)
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r9, r1)
            boolean r8 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.safeEquals(r8, r9)
            if (r8 == 0) goto L27
            r3 = r4
        L27:
            return r3
        L28:
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r8, r1)
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r9, r1)
            boolean r8 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.safeEquals(r8, r9)
            return r8
        L35:
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r8, r1)
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r9, r1)
            boolean r8 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.safeEquals(r8, r9)
            return r8
        L42:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto L57
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r8, r1)
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r9, r1)
            boolean r8 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.safeEquals(r8, r9)
            if (r8 == 0) goto L57
            r3 = r4
        L57:
            return r3
        L58:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto L6b
            long r5 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r8, r1)
            long r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r9, r1)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L6b
            r3 = r4
        L6b:
            return r3
        L6c:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto L7d
            int r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r8, r1)
            int r9 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r9, r1)
            if (r8 != r9) goto L7d
            r3 = r4
        L7d:
            return r3
        L7e:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto L91
            long r5 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r8, r1)
            long r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r9, r1)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L91
            r3 = r4
        L91:
            return r3
        L92:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto La3
            int r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r8, r1)
            int r9 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r9, r1)
            if (r8 != r9) goto La3
            r3 = r4
        La3:
            return r3
        La4:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto Lb5
            int r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r8, r1)
            int r9 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r9, r1)
            if (r8 != r9) goto Lb5
            r3 = r4
        Lb5:
            return r3
        Lb6:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto Lc7
            int r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r8, r1)
            int r9 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r9, r1)
            if (r8 != r9) goto Lc7
            r3 = r4
        Lc7:
            return r3
        Lc8:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto Ldd
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r8, r1)
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r9, r1)
            boolean r8 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.safeEquals(r8, r9)
            if (r8 == 0) goto Ldd
            r3 = r4
        Ldd:
            return r3
        Lde:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto Lf3
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r8, r1)
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r9, r1)
            boolean r8 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.safeEquals(r8, r9)
            if (r8 == 0) goto Lf3
            r3 = r4
        Lf3:
            return r3
        Lf4:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto L109
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r8, r1)
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r9, r1)
            boolean r8 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.safeEquals(r8, r9)
            if (r8 == 0) goto L109
            r3 = r4
        L109:
            return r3
        L10a:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto L11b
            boolean r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getBoolean(r8, r1)
            boolean r9 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getBoolean(r9, r1)
            if (r8 != r9) goto L11b
            r3 = r4
        L11b:
            return r3
        L11c:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto L12d
            int r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r8, r1)
            int r9 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r9, r1)
            if (r8 != r9) goto L12d
            r3 = r4
        L12d:
            return r3
        L12e:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto L141
            long r5 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r8, r1)
            long r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r9, r1)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L141
            r3 = r4
        L141:
            return r3
        L142:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto L153
            int r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r8, r1)
            int r9 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r9, r1)
            if (r8 != r9) goto L153
            r3 = r4
        L153:
            return r3
        L154:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto L167
            long r5 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r8, r1)
            long r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r9, r1)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L167
            r3 = r4
        L167:
            return r3
        L168:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto L17b
            long r5 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r8, r1)
            long r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r9, r1)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L17b
            r3 = r4
        L17b:
            return r3
        L17c:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto L195
            float r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getFloat(r8, r1)
            int r8 = java.lang.Float.floatToIntBits(r8)
            float r9 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getFloat(r9, r1)
            int r9 = java.lang.Float.floatToIntBits(r9)
            if (r8 != r9) goto L195
            r3 = r4
        L195:
            return r3
        L196:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto L1b1
            double r5 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getDouble(r8, r1)
            long r5 = java.lang.Double.doubleToLongBits(r5)
            double r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getDouble(r9, r1)
            long r8 = java.lang.Double.doubleToLongBits(r8)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L1b1
            r3 = r4
        L1b1:
            return r3
    }

    private <UT, UB> UB filterMapUnknownEnumValues(java.lang.Object r9, int r10, UB r11, com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<UT, UB> r12, java.lang.Object r13) {
            r8 = this;
            int r2 = r8.numberAt(r10)
            int r0 = r8.typeAndOffsetAt(r10)
            long r0 = offset(r0)
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r9, r0)
            if (r9 != 0) goto L13
            return r11
        L13:
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r4 = r8.getEnumFieldVerifier(r10)
            if (r4 != 0) goto L1a
            return r11
        L1a:
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r0 = r8.mapFieldSchema
            java.util.Map r3 = r0.forMutableMapData(r9)
            r0 = r8
            r1 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            java.lang.Object r9 = r0.filterUnknownEnumMap(r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    private <K, V, UT, UB> UB filterUnknownEnumMap(int r5, int r6, java.util.Map<K, V> r7, com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier r8, UB r9, com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<UT, UB> r10, java.lang.Object r11) {
            r4 = this;
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r0 = r4.mapFieldSchema
            java.lang.Object r5 = r4.getMapFieldDefaultEntry(r5)
            com.google.crypto.tink.shaded.protobuf.MapEntryLite$Metadata r5 = r0.forMapMetadata(r5)
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L12:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L65
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            boolean r1 = r8.isInRange(r1)
            if (r1 != 0) goto L12
            if (r9 != 0) goto L34
            java.lang.Object r9 = r10.getBuilderFromMessage(r11)
        L34:
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r2 = r0.getValue()
            int r1 = com.google.crypto.tink.shaded.protobuf.MapEntryLite.computeSerializedSize(r5, r1, r2)
            com.google.crypto.tink.shaded.protobuf.ByteString$CodedBuilder r1 = com.google.crypto.tink.shaded.protobuf.ByteString.newCodedBuilder(r1)
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r2 = r1.getCodedOutput()
            java.lang.Object r3 = r0.getKey()     // Catch: java.io.IOException -> L5e
            java.lang.Object r0 = r0.getValue()     // Catch: java.io.IOException -> L5e
            com.google.crypto.tink.shaded.protobuf.MapEntryLite.writeTo(r2, r5, r3, r0)     // Catch: java.io.IOException -> L5e
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.build()
            r10.addLengthDelimited(r9, r6, r0)
            r7.remove()
            goto L12
        L5e:
            r5 = move-exception
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>(r5)
            throw r6
        L65:
            return r9
    }

    private static <T> float floatAt(T r0, long r1) {
            float r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getFloat(r0, r1)
            return r0
    }

    private com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier getEnumFieldVerifier(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.objects
            int r2 = r2 / 3
            int r2 = r2 * 2
            int r2 = r2 + 1
            r2 = r0[r2]
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r2 = (com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier) r2
            return r2
    }

    private java.lang.Object getMapFieldDefaultEntry(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.objects
            int r2 = r2 / 3
            int r2 = r2 * 2
            r2 = r0[r2]
            return r2
    }

    private com.google.crypto.tink.shaded.protobuf.Schema getMessageFieldSchema(int r4) {
            r3 = this;
            int r4 = r4 / 3
            int r4 = r4 * 2
            java.lang.Object[] r0 = r3.objects
            r0 = r0[r4]
            com.google.crypto.tink.shaded.protobuf.Schema r0 = (com.google.crypto.tink.shaded.protobuf.Schema) r0
            if (r0 == 0) goto Ld
            return r0
        Ld:
            com.google.crypto.tink.shaded.protobuf.Protobuf r0 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
            java.lang.Object[] r1 = r3.objects
            int r2 = r4 + 1
            r1 = r1[r2]
            java.lang.Class r1 = (java.lang.Class) r1
            com.google.crypto.tink.shaded.protobuf.Schema r0 = r0.schemaFor(r1)
            java.lang.Object[] r1 = r3.objects
            r1[r4] = r0
            return r0
    }

    static com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite getMutableUnknownFields(java.lang.Object r2) {
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r2
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r0 = r2.unknownFields
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1 = com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite.getDefaultInstance()
            if (r0 != r1) goto L10
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r0 = com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite.newInstance()
            r2.unknownFields = r0
        L10:
            return r0
    }

    private int getSerializedSizeProto2(T r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            sun.misc.Unsafe r2 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r4
            r5 = 0
            r6 = 0
            r8 = 0
        Ld:
            int[] r9 = r0.buffer
            int r9 = r9.length
            if (r5 >= r9) goto L520
            int r9 = r0.typeAndOffsetAt(r5)
            int r10 = r0.numberAt(r5)
            int r11 = type(r9)
            r12 = 17
            r13 = 1
            if (r11 > r12) goto L38
            int[] r12 = r0.buffer
            int r14 = r5 + 2
            r12 = r12[r14]
            r14 = r12 & r4
            int r15 = r12 >>> 20
            int r15 = r13 << r15
            if (r14 == r7) goto L56
            long r7 = (long) r14
            int r8 = r2.getInt(r1, r7)
            r7 = r14
            goto L56
        L38:
            boolean r12 = r0.useCachedSizeField
            if (r12 == 0) goto L54
            com.google.crypto.tink.shaded.protobuf.FieldType r12 = com.google.crypto.tink.shaded.protobuf.FieldType.DOUBLE_LIST_PACKED
            int r12 = r12.id()
            if (r11 < r12) goto L54
            com.google.crypto.tink.shaded.protobuf.FieldType r12 = com.google.crypto.tink.shaded.protobuf.FieldType.SINT64_LIST_PACKED
            int r12 = r12.id()
            if (r11 > r12) goto L54
            int[] r12 = r0.buffer
            int r14 = r5 + 2
            r12 = r12[r14]
            r12 = r12 & r4
            goto L55
        L54:
            r12 = 0
        L55:
            r15 = 0
        L56:
            long r13 = offset(r9)
            r9 = 0
            r3 = 0
            switch(r11) {
                case 0: goto L50d;
                case 1: goto L503;
                case 2: goto L4f5;
                case 3: goto L4e7;
                case 4: goto L4d9;
                case 5: goto L4cf;
                case 6: goto L4c5;
                case 7: goto L4ba;
                case 8: goto L49e;
                case 9: goto L48d;
                case 10: goto L47e;
                case 11: goto L471;
                case 12: goto L464;
                case 13: goto L459;
                case 14: goto L450;
                case 15: goto L443;
                case 16: goto L436;
                case 17: goto L423;
                case 18: goto L414;
                case 19: goto L405;
                case 20: goto L3f9;
                case 21: goto L3ed;
                case 22: goto L3e1;
                case 23: goto L3d5;
                case 24: goto L3c9;
                case 25: goto L3bd;
                case 26: goto L3b2;
                case 27: goto L3a2;
                case 28: goto L396;
                case 29: goto L389;
                case 30: goto L37c;
                case 31: goto L36f;
                case 32: goto L362;
                case 33: goto L355;
                case 34: goto L348;
                case 35: goto L328;
                case 36: goto L30b;
                case 37: goto L2ee;
                case 38: goto L2d1;
                case 39: goto L2b3;
                case 40: goto L295;
                case 41: goto L277;
                case 42: goto L259;
                case 43: goto L23b;
                case 44: goto L21d;
                case 45: goto L1ff;
                case 46: goto L1e1;
                case 47: goto L1c3;
                case 48: goto L1a5;
                case 49: goto L195;
                case 50: goto L185;
                case 51: goto L177;
                case 52: goto L16b;
                case 53: goto L15b;
                case 54: goto L14b;
                case 55: goto L13b;
                case 56: goto L12f;
                case 57: goto L122;
                case 58: goto L115;
                case 59: goto Lf7;
                case 60: goto Le3;
                case 61: goto Ld1;
                case 62: goto Lc1;
                case 63: goto Lb1;
                case 64: goto La4;
                case 65: goto L98;
                case 66: goto L88;
                case 67: goto L78;
                case 68: goto L62;
                default: goto L60;
            }
        L60:
            goto L420
        L62:
            boolean r3 = r0.isOneofPresent(r1, r10, r5)
            if (r3 == 0) goto L420
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r3
            com.google.crypto.tink.shaded.protobuf.Schema r4 = r0.getMessageFieldSchema(r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeGroupSize(r10, r3, r4)
            goto L41f
        L78:
            boolean r3 = r0.isOneofPresent(r1, r10, r5)
            if (r3 == 0) goto L420
            long r3 = oneofLongAt(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSInt64Size(r10, r3)
            goto L41f
        L88:
            boolean r3 = r0.isOneofPresent(r1, r10, r5)
            if (r3 == 0) goto L420
            int r3 = oneofIntAt(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSInt32Size(r10, r3)
            goto L41f
        L98:
            boolean r9 = r0.isOneofPresent(r1, r10, r5)
            if (r9 == 0) goto L420
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSFixed64Size(r10, r3)
            goto L41f
        La4:
            boolean r3 = r0.isOneofPresent(r1, r10, r5)
            if (r3 == 0) goto L420
            r3 = 0
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSFixed32Size(r10, r3)
            goto L462
        Lb1:
            boolean r3 = r0.isOneofPresent(r1, r10, r5)
            if (r3 == 0) goto L420
            int r3 = oneofIntAt(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeEnumSize(r10, r3)
            goto L41f
        Lc1:
            boolean r3 = r0.isOneofPresent(r1, r10, r5)
            if (r3 == 0) goto L420
            int r3 = oneofIntAt(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32Size(r10, r3)
            goto L41f
        Ld1:
            boolean r3 = r0.isOneofPresent(r1, r10, r5)
            if (r3 == 0) goto L420
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = (com.google.crypto.tink.shaded.protobuf.ByteString) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBytesSize(r10, r3)
            goto L41f
        Le3:
            boolean r3 = r0.isOneofPresent(r1, r10, r5)
            if (r3 == 0) goto L420
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.crypto.tink.shaded.protobuf.Schema r4 = r0.getMessageFieldSchema(r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeMessage(r10, r3, r4)
            goto L41f
        Lf7:
            boolean r3 = r0.isOneofPresent(r1, r10, r5)
            if (r3 == 0) goto L420
            java.lang.Object r3 = r2.getObject(r1, r13)
            boolean r4 = r3 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r4 == 0) goto L10d
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = (com.google.crypto.tink.shaded.protobuf.ByteString) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBytesSize(r10, r3)
            goto L41f
        L10d:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeStringSize(r10, r3)
            goto L41f
        L115:
            boolean r3 = r0.isOneofPresent(r1, r10, r5)
            if (r3 == 0) goto L420
            r3 = 1
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBoolSize(r10, r3)
            goto L41f
        L122:
            boolean r3 = r0.isOneofPresent(r1, r10, r5)
            if (r3 == 0) goto L420
            r3 = 0
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFixed32Size(r10, r3)
            goto L462
        L12f:
            boolean r9 = r0.isOneofPresent(r1, r10, r5)
            if (r9 == 0) goto L420
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFixed64Size(r10, r3)
            goto L41f
        L13b:
            boolean r3 = r0.isOneofPresent(r1, r10, r5)
            if (r3 == 0) goto L420
            int r3 = oneofIntAt(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeInt32Size(r10, r3)
            goto L41f
        L14b:
            boolean r3 = r0.isOneofPresent(r1, r10, r5)
            if (r3 == 0) goto L420
            long r3 = oneofLongAt(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt64Size(r10, r3)
            goto L41f
        L15b:
            boolean r3 = r0.isOneofPresent(r1, r10, r5)
            if (r3 == 0) goto L420
            long r3 = oneofLongAt(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeInt64Size(r10, r3)
            goto L41f
        L16b:
            boolean r3 = r0.isOneofPresent(r1, r10, r5)
            if (r3 == 0) goto L420
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFloatSize(r10, r9)
            goto L41f
        L177:
            boolean r3 = r0.isOneofPresent(r1, r10, r5)
            if (r3 == 0) goto L420
            r3 = 0
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeDoubleSize(r10, r3)
            goto L41f
        L185:
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r3 = r0.mapFieldSchema
            java.lang.Object r4 = r2.getObject(r1, r13)
            java.lang.Object r9 = r0.getMapFieldDefaultEntry(r5)
            int r3 = r3.getSerializedSize(r10, r4, r9)
            goto L41f
        L195:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            com.google.crypto.tink.shaded.protobuf.Schema r4 = r0.getMessageFieldSchema(r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeGroupList(r10, r3, r4)
            goto L41f
        L1a5:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeSInt64ListNoTag(r3)
            if (r3 <= 0) goto L420
            boolean r4 = r0.useCachedSizeField
            if (r4 == 0) goto L1b9
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L1b9:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r3)
            goto L344
        L1c3:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeSInt32ListNoTag(r3)
            if (r3 <= 0) goto L420
            boolean r4 = r0.useCachedSizeField
            if (r4 == 0) goto L1d7
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L1d7:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r3)
            goto L344
        L1e1:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed64ListNoTag(r3)
            if (r3 <= 0) goto L420
            boolean r4 = r0.useCachedSizeField
            if (r4 == 0) goto L1f5
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L1f5:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r3)
            goto L344
        L1ff:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed32ListNoTag(r3)
            if (r3 <= 0) goto L420
            boolean r4 = r0.useCachedSizeField
            if (r4 == 0) goto L213
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L213:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r3)
            goto L344
        L21d:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeEnumListNoTag(r3)
            if (r3 <= 0) goto L420
            boolean r4 = r0.useCachedSizeField
            if (r4 == 0) goto L231
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L231:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r3)
            goto L344
        L23b:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeUInt32ListNoTag(r3)
            if (r3 <= 0) goto L420
            boolean r4 = r0.useCachedSizeField
            if (r4 == 0) goto L24f
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L24f:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r3)
            goto L344
        L259:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeBoolListNoTag(r3)
            if (r3 <= 0) goto L420
            boolean r4 = r0.useCachedSizeField
            if (r4 == 0) goto L26d
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L26d:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r3)
            goto L344
        L277:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed32ListNoTag(r3)
            if (r3 <= 0) goto L420
            boolean r4 = r0.useCachedSizeField
            if (r4 == 0) goto L28b
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L28b:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r3)
            goto L344
        L295:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed64ListNoTag(r3)
            if (r3 <= 0) goto L420
            boolean r4 = r0.useCachedSizeField
            if (r4 == 0) goto L2a9
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L2a9:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r3)
            goto L344
        L2b3:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeInt32ListNoTag(r3)
            if (r3 <= 0) goto L420
            boolean r4 = r0.useCachedSizeField
            if (r4 == 0) goto L2c7
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L2c7:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r3)
            goto L344
        L2d1:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeUInt64ListNoTag(r3)
            if (r3 <= 0) goto L420
            boolean r4 = r0.useCachedSizeField
            if (r4 == 0) goto L2e5
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L2e5:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r3)
            goto L344
        L2ee:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeInt64ListNoTag(r3)
            if (r3 <= 0) goto L420
            boolean r4 = r0.useCachedSizeField
            if (r4 == 0) goto L302
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L302:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r3)
            goto L344
        L30b:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed32ListNoTag(r3)
            if (r3 <= 0) goto L420
            boolean r4 = r0.useCachedSizeField
            if (r4 == 0) goto L31f
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L31f:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r3)
            goto L344
        L328:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed64ListNoTag(r3)
            if (r3 <= 0) goto L420
            boolean r4 = r0.useCachedSizeField
            if (r4 == 0) goto L33c
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L33c:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r3)
        L344:
            int r4 = r4 + r9
            int r4 = r4 + r3
            goto L462
        L348:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeSInt64List(r10, r3, r4)
            goto L410
        L355:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeSInt32List(r10, r3, r4)
            goto L410
        L362:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed64List(r10, r3, r4)
            goto L410
        L36f:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed32List(r10, r3, r4)
            goto L410
        L37c:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeEnumList(r10, r3, r4)
            goto L410
        L389:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeUInt32List(r10, r3, r4)
            goto L41f
        L396:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeByteStringList(r10, r3)
            goto L41f
        L3a2:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            com.google.crypto.tink.shaded.protobuf.Schema r4 = r0.getMessageFieldSchema(r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeMessageList(r10, r3, r4)
            goto L41f
        L3b2:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeStringList(r10, r3)
            goto L41f
        L3bd:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeBoolList(r10, r3, r4)
            goto L410
        L3c9:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed32List(r10, r3, r4)
            goto L410
        L3d5:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed64List(r10, r3, r4)
            goto L410
        L3e1:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeInt32List(r10, r3, r4)
            goto L410
        L3ed:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeUInt64List(r10, r3, r4)
            goto L410
        L3f9:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeInt64List(r10, r3, r4)
            goto L410
        L405:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed32List(r10, r3, r4)
        L410:
            int r6 = r6 + r3
            r11 = r4
            goto L519
        L414:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed64List(r10, r3, r4)
        L41f:
            int r6 = r6 + r3
        L420:
            r11 = 0
            goto L519
        L423:
            r3 = r8 & r15
            if (r3 == 0) goto L420
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r3
            com.google.crypto.tink.shaded.protobuf.Schema r4 = r0.getMessageFieldSchema(r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeGroupSize(r10, r3, r4)
            goto L41f
        L436:
            r3 = r8 & r15
            if (r3 == 0) goto L420
            long r3 = r2.getLong(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSInt64Size(r10, r3)
            goto L41f
        L443:
            r3 = r8 & r15
            if (r3 == 0) goto L420
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSInt32Size(r10, r3)
            goto L41f
        L450:
            r9 = r8 & r15
            if (r9 == 0) goto L420
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSFixed64Size(r10, r3)
            goto L41f
        L459:
            r3 = r8 & r15
            if (r3 == 0) goto L420
            r3 = 0
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSFixed32Size(r10, r3)
        L462:
            int r6 = r6 + r4
            goto L420
        L464:
            r3 = r8 & r15
            if (r3 == 0) goto L420
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeEnumSize(r10, r3)
            goto L41f
        L471:
            r3 = r8 & r15
            if (r3 == 0) goto L420
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32Size(r10, r3)
            goto L41f
        L47e:
            r3 = r8 & r15
            if (r3 == 0) goto L420
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = (com.google.crypto.tink.shaded.protobuf.ByteString) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBytesSize(r10, r3)
            goto L41f
        L48d:
            r3 = r8 & r15
            if (r3 == 0) goto L420
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.crypto.tink.shaded.protobuf.Schema r4 = r0.getMessageFieldSchema(r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeMessage(r10, r3, r4)
            goto L41f
        L49e:
            r3 = r8 & r15
            if (r3 == 0) goto L420
            java.lang.Object r3 = r2.getObject(r1, r13)
            boolean r4 = r3 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r4 == 0) goto L4b2
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = (com.google.crypto.tink.shaded.protobuf.ByteString) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBytesSize(r10, r3)
            goto L41f
        L4b2:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeStringSize(r10, r3)
            goto L41f
        L4ba:
            r3 = r8 & r15
            if (r3 == 0) goto L420
            r3 = 1
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBoolSize(r10, r3)
            goto L41f
        L4c5:
            r3 = r8 & r15
            if (r3 == 0) goto L420
            r11 = 0
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFixed32Size(r10, r11)
            goto L518
        L4cf:
            r11 = 0
            r9 = r8 & r15
            if (r9 == 0) goto L519
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFixed64Size(r10, r3)
            goto L518
        L4d9:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L519
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeInt32Size(r10, r3)
            goto L518
        L4e7:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L519
            long r3 = r2.getLong(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt64Size(r10, r3)
            goto L518
        L4f5:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L519
            long r3 = r2.getLong(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeInt64Size(r10, r3)
            goto L518
        L503:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L519
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFloatSize(r10, r9)
            goto L518
        L50d:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L519
            r3 = 0
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeDoubleSize(r10, r3)
        L518:
            int r6 = r6 + r3
        L519:
            int r5 = r5 + 3
            r4 = 1048575(0xfffff, float:1.469367E-39)
            goto Ld
        L520:
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r2 = r0.unknownFieldSchema
            int r2 = r0.getUnknownFieldsSerializedSize(r2, r1)
            int r6 = r6 + r2
            boolean r2 = r0.hasExtensions
            if (r2 == 0) goto L536
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r2 = r0.extensionSchema
            com.google.crypto.tink.shaded.protobuf.FieldSet r1 = r2.getExtensions(r1)
            int r1 = r1.getSerializedSize()
            int r6 = r6 + r1
        L536:
            return r6
    }

    private int getSerializedSizeProto3(T r16) {
            r15 = this;
            r0 = r15
            r1 = r16
            sun.misc.Unsafe r2 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            r3 = 0
            r4 = r3
            r5 = r4
        L8:
            int[] r6 = r0.buffer
            int r6 = r6.length
            if (r4 >= r6) goto L4e3
            int r6 = r15.typeAndOffsetAt(r4)
            int r7 = type(r6)
            int r8 = r15.numberAt(r4)
            long r9 = offset(r6)
            com.google.crypto.tink.shaded.protobuf.FieldType r6 = com.google.crypto.tink.shaded.protobuf.FieldType.DOUBLE_LIST_PACKED
            int r6 = r6.id()
            if (r7 < r6) goto L38
            com.google.crypto.tink.shaded.protobuf.FieldType r6 = com.google.crypto.tink.shaded.protobuf.FieldType.SINT64_LIST_PACKED
            int r6 = r6.id()
            if (r7 > r6) goto L38
            int[] r6 = r0.buffer
            int r11 = r4 + 2
            r6 = r6[r11]
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r11
            goto L39
        L38:
            r6 = r3
        L39:
            r11 = 1
            r12 = 0
            r13 = 0
            switch(r7) {
                case 0: goto L4d1;
                case 1: goto L4c5;
                case 2: goto L4b5;
                case 3: goto L4a5;
                case 4: goto L495;
                case 5: goto L489;
                case 6: goto L47d;
                case 7: goto L471;
                case 8: goto L453;
                case 9: goto L43f;
                case 10: goto L42e;
                case 11: goto L41f;
                case 12: goto L410;
                case 13: goto L405;
                case 14: goto L3fa;
                case 15: goto L3eb;
                case 16: goto L3dc;
                case 17: goto L3c7;
                case 18: goto L3bc;
                case 19: goto L3b3;
                case 20: goto L3aa;
                case 21: goto L3a1;
                case 22: goto L398;
                case 23: goto L38f;
                case 24: goto L386;
                case 25: goto L37d;
                case 26: goto L374;
                case 27: goto L367;
                case 28: goto L35e;
                case 29: goto L355;
                case 30: goto L34b;
                case 31: goto L341;
                case 32: goto L337;
                case 33: goto L32d;
                case 34: goto L323;
                case 35: goto L303;
                case 36: goto L2e6;
                case 37: goto L2c9;
                case 38: goto L2ac;
                case 39: goto L28e;
                case 40: goto L270;
                case 41: goto L252;
                case 42: goto L234;
                case 43: goto L216;
                case 44: goto L1f8;
                case 45: goto L1da;
                case 46: goto L1bc;
                case 47: goto L19e;
                case 48: goto L180;
                case 49: goto L172;
                case 50: goto L162;
                case 51: goto L154;
                case 52: goto L148;
                case 53: goto L138;
                case 54: goto L128;
                case 55: goto L118;
                case 56: goto L10c;
                case 57: goto L100;
                case 58: goto Lf4;
                case 59: goto Ld6;
                case 60: goto Lc2;
                case 61: goto Lb0;
                case 62: goto La0;
                case 63: goto L90;
                case 64: goto L84;
                case 65: goto L78;
                case 66: goto L68;
                case 67: goto L58;
                case 68: goto L42;
                default: goto L40;
            }
        L40:
            goto L4df
        L42:
            boolean r6 = r15.isOneofPresent(r1, r8, r4)
            if (r6 == 0) goto L4df
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r1, r9)
            com.google.crypto.tink.shaded.protobuf.MessageLite r6 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r6
            com.google.crypto.tink.shaded.protobuf.Schema r7 = r15.getMessageFieldSchema(r4)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeGroupSize(r8, r6, r7)
            goto L3c4
        L58:
            boolean r6 = r15.isOneofPresent(r1, r8, r4)
            if (r6 == 0) goto L4df
            long r6 = oneofLongAt(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSInt64Size(r8, r6)
            goto L3c4
        L68:
            boolean r6 = r15.isOneofPresent(r1, r8, r4)
            if (r6 == 0) goto L4df
            int r6 = oneofIntAt(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSInt32Size(r8, r6)
            goto L3c4
        L78:
            boolean r6 = r15.isOneofPresent(r1, r8, r4)
            if (r6 == 0) goto L4df
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSFixed64Size(r8, r13)
            goto L3c4
        L84:
            boolean r6 = r15.isOneofPresent(r1, r8, r4)
            if (r6 == 0) goto L4df
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSFixed32Size(r8, r3)
            goto L3c4
        L90:
            boolean r6 = r15.isOneofPresent(r1, r8, r4)
            if (r6 == 0) goto L4df
            int r6 = oneofIntAt(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeEnumSize(r8, r6)
            goto L3c4
        La0:
            boolean r6 = r15.isOneofPresent(r1, r8, r4)
            if (r6 == 0) goto L4df
            int r6 = oneofIntAt(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32Size(r8, r6)
            goto L3c4
        Lb0:
            boolean r6 = r15.isOneofPresent(r1, r8, r4)
            if (r6 == 0) goto L4df
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r1, r9)
            com.google.crypto.tink.shaded.protobuf.ByteString r6 = (com.google.crypto.tink.shaded.protobuf.ByteString) r6
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBytesSize(r8, r6)
            goto L3c4
        Lc2:
            boolean r6 = r15.isOneofPresent(r1, r8, r4)
            if (r6 == 0) goto L4df
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r1, r9)
            com.google.crypto.tink.shaded.protobuf.Schema r7 = r15.getMessageFieldSchema(r4)
            int r6 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeMessage(r8, r6, r7)
            goto L3c4
        Ld6:
            boolean r6 = r15.isOneofPresent(r1, r8, r4)
            if (r6 == 0) goto L4df
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r1, r9)
            boolean r7 = r6 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r7 == 0) goto Lec
            com.google.crypto.tink.shaded.protobuf.ByteString r6 = (com.google.crypto.tink.shaded.protobuf.ByteString) r6
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBytesSize(r8, r6)
            goto L3c4
        Lec:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeStringSize(r8, r6)
            goto L3c4
        Lf4:
            boolean r6 = r15.isOneofPresent(r1, r8, r4)
            if (r6 == 0) goto L4df
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBoolSize(r8, r11)
            goto L3c4
        L100:
            boolean r6 = r15.isOneofPresent(r1, r8, r4)
            if (r6 == 0) goto L4df
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFixed32Size(r8, r3)
            goto L3c4
        L10c:
            boolean r6 = r15.isOneofPresent(r1, r8, r4)
            if (r6 == 0) goto L4df
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFixed64Size(r8, r13)
            goto L3c4
        L118:
            boolean r6 = r15.isOneofPresent(r1, r8, r4)
            if (r6 == 0) goto L4df
            int r6 = oneofIntAt(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeInt32Size(r8, r6)
            goto L3c4
        L128:
            boolean r6 = r15.isOneofPresent(r1, r8, r4)
            if (r6 == 0) goto L4df
            long r6 = oneofLongAt(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt64Size(r8, r6)
            goto L3c4
        L138:
            boolean r6 = r15.isOneofPresent(r1, r8, r4)
            if (r6 == 0) goto L4df
            long r6 = oneofLongAt(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeInt64Size(r8, r6)
            goto L3c4
        L148:
            boolean r6 = r15.isOneofPresent(r1, r8, r4)
            if (r6 == 0) goto L4df
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFloatSize(r8, r12)
            goto L3c4
        L154:
            boolean r6 = r15.isOneofPresent(r1, r8, r4)
            if (r6 == 0) goto L4df
            r6 = 0
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeDoubleSize(r8, r6)
            goto L3c4
        L162:
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r6 = r0.mapFieldSchema
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r1, r9)
            java.lang.Object r9 = r15.getMapFieldDefaultEntry(r4)
            int r6 = r6.getSerializedSize(r8, r7, r9)
            goto L3c4
        L172:
            java.util.List r6 = listAt(r1, r9)
            com.google.crypto.tink.shaded.protobuf.Schema r7 = r15.getMessageFieldSchema(r4)
            int r6 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeGroupList(r8, r6, r7)
            goto L3c4
        L180:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeSInt64ListNoTag(r7)
            if (r7 <= 0) goto L4df
            boolean r9 = r0.useCachedSizeField
            if (r9 == 0) goto L194
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L194:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r7)
            goto L31f
        L19e:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeSInt32ListNoTag(r7)
            if (r7 <= 0) goto L4df
            boolean r9 = r0.useCachedSizeField
            if (r9 == 0) goto L1b2
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L1b2:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r7)
            goto L31f
        L1bc:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed64ListNoTag(r7)
            if (r7 <= 0) goto L4df
            boolean r9 = r0.useCachedSizeField
            if (r9 == 0) goto L1d0
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L1d0:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r7)
            goto L31f
        L1da:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed32ListNoTag(r7)
            if (r7 <= 0) goto L4df
            boolean r9 = r0.useCachedSizeField
            if (r9 == 0) goto L1ee
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L1ee:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r7)
            goto L31f
        L1f8:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeEnumListNoTag(r7)
            if (r7 <= 0) goto L4df
            boolean r9 = r0.useCachedSizeField
            if (r9 == 0) goto L20c
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L20c:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r7)
            goto L31f
        L216:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeUInt32ListNoTag(r7)
            if (r7 <= 0) goto L4df
            boolean r9 = r0.useCachedSizeField
            if (r9 == 0) goto L22a
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L22a:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r7)
            goto L31f
        L234:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeBoolListNoTag(r7)
            if (r7 <= 0) goto L4df
            boolean r9 = r0.useCachedSizeField
            if (r9 == 0) goto L248
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L248:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r7)
            goto L31f
        L252:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed32ListNoTag(r7)
            if (r7 <= 0) goto L4df
            boolean r9 = r0.useCachedSizeField
            if (r9 == 0) goto L266
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L266:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r7)
            goto L31f
        L270:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed64ListNoTag(r7)
            if (r7 <= 0) goto L4df
            boolean r9 = r0.useCachedSizeField
            if (r9 == 0) goto L284
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L284:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r7)
            goto L31f
        L28e:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeInt32ListNoTag(r7)
            if (r7 <= 0) goto L4df
            boolean r9 = r0.useCachedSizeField
            if (r9 == 0) goto L2a2
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L2a2:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r7)
            goto L31f
        L2ac:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeUInt64ListNoTag(r7)
            if (r7 <= 0) goto L4df
            boolean r9 = r0.useCachedSizeField
            if (r9 == 0) goto L2c0
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L2c0:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r7)
            goto L31f
        L2c9:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeInt64ListNoTag(r7)
            if (r7 <= 0) goto L4df
            boolean r9 = r0.useCachedSizeField
            if (r9 == 0) goto L2dd
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L2dd:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r7)
            goto L31f
        L2e6:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed32ListNoTag(r7)
            if (r7 <= 0) goto L4df
            boolean r9 = r0.useCachedSizeField
            if (r9 == 0) goto L2fa
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L2fa:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r7)
            goto L31f
        L303:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed64ListNoTag(r7)
            if (r7 <= 0) goto L4df
            boolean r9 = r0.useCachedSizeField
            if (r9 == 0) goto L317
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L317:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r7)
        L31f:
            int r6 = r6 + r8
            int r6 = r6 + r7
            goto L3c4
        L323:
            java.util.List r6 = listAt(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeSInt64List(r8, r6, r3)
            goto L3c4
        L32d:
            java.util.List r6 = listAt(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeSInt32List(r8, r6, r3)
            goto L3c4
        L337:
            java.util.List r6 = listAt(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed64List(r8, r6, r3)
            goto L3c4
        L341:
            java.util.List r6 = listAt(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed32List(r8, r6, r3)
            goto L3c4
        L34b:
            java.util.List r6 = listAt(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeEnumList(r8, r6, r3)
            goto L3c4
        L355:
            java.util.List r6 = listAt(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeUInt32List(r8, r6, r3)
            goto L3c4
        L35e:
            java.util.List r6 = listAt(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeByteStringList(r8, r6)
            goto L3c4
        L367:
            java.util.List r6 = listAt(r1, r9)
            com.google.crypto.tink.shaded.protobuf.Schema r7 = r15.getMessageFieldSchema(r4)
            int r6 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeMessageList(r8, r6, r7)
            goto L3c4
        L374:
            java.util.List r6 = listAt(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeStringList(r8, r6)
            goto L3c4
        L37d:
            java.util.List r6 = listAt(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeBoolList(r8, r6, r3)
            goto L3c4
        L386:
            java.util.List r6 = listAt(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed32List(r8, r6, r3)
            goto L3c4
        L38f:
            java.util.List r6 = listAt(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed64List(r8, r6, r3)
            goto L3c4
        L398:
            java.util.List r6 = listAt(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeInt32List(r8, r6, r3)
            goto L3c4
        L3a1:
            java.util.List r6 = listAt(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeUInt64List(r8, r6, r3)
            goto L3c4
        L3aa:
            java.util.List r6 = listAt(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeInt64List(r8, r6, r3)
            goto L3c4
        L3b3:
            java.util.List r6 = listAt(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed32List(r8, r6, r3)
            goto L3c4
        L3bc:
            java.util.List r6 = listAt(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed64List(r8, r6, r3)
        L3c4:
            int r5 = r5 + r6
            goto L4df
        L3c7:
            boolean r6 = r15.isFieldPresent(r1, r4)
            if (r6 == 0) goto L4df
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r1, r9)
            com.google.crypto.tink.shaded.protobuf.MessageLite r6 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r6
            com.google.crypto.tink.shaded.protobuf.Schema r7 = r15.getMessageFieldSchema(r4)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeGroupSize(r8, r6, r7)
            goto L3c4
        L3dc:
            boolean r6 = r15.isFieldPresent(r1, r4)
            if (r6 == 0) goto L4df
            long r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSInt64Size(r8, r6)
            goto L3c4
        L3eb:
            boolean r6 = r15.isFieldPresent(r1, r4)
            if (r6 == 0) goto L4df
            int r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSInt32Size(r8, r6)
            goto L3c4
        L3fa:
            boolean r6 = r15.isFieldPresent(r1, r4)
            if (r6 == 0) goto L4df
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSFixed64Size(r8, r13)
            goto L3c4
        L405:
            boolean r6 = r15.isFieldPresent(r1, r4)
            if (r6 == 0) goto L4df
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSFixed32Size(r8, r3)
            goto L3c4
        L410:
            boolean r6 = r15.isFieldPresent(r1, r4)
            if (r6 == 0) goto L4df
            int r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeEnumSize(r8, r6)
            goto L3c4
        L41f:
            boolean r6 = r15.isFieldPresent(r1, r4)
            if (r6 == 0) goto L4df
            int r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32Size(r8, r6)
            goto L3c4
        L42e:
            boolean r6 = r15.isFieldPresent(r1, r4)
            if (r6 == 0) goto L4df
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r1, r9)
            com.google.crypto.tink.shaded.protobuf.ByteString r6 = (com.google.crypto.tink.shaded.protobuf.ByteString) r6
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBytesSize(r8, r6)
            goto L3c4
        L43f:
            boolean r6 = r15.isFieldPresent(r1, r4)
            if (r6 == 0) goto L4df
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r1, r9)
            com.google.crypto.tink.shaded.protobuf.Schema r7 = r15.getMessageFieldSchema(r4)
            int r6 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeMessage(r8, r6, r7)
            goto L3c4
        L453:
            boolean r6 = r15.isFieldPresent(r1, r4)
            if (r6 == 0) goto L4df
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r1, r9)
            boolean r7 = r6 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r7 == 0) goto L469
            com.google.crypto.tink.shaded.protobuf.ByteString r6 = (com.google.crypto.tink.shaded.protobuf.ByteString) r6
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBytesSize(r8, r6)
            goto L3c4
        L469:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeStringSize(r8, r6)
            goto L3c4
        L471:
            boolean r6 = r15.isFieldPresent(r1, r4)
            if (r6 == 0) goto L4df
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBoolSize(r8, r11)
            goto L3c4
        L47d:
            boolean r6 = r15.isFieldPresent(r1, r4)
            if (r6 == 0) goto L4df
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFixed32Size(r8, r3)
            goto L3c4
        L489:
            boolean r6 = r15.isFieldPresent(r1, r4)
            if (r6 == 0) goto L4df
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFixed64Size(r8, r13)
            goto L3c4
        L495:
            boolean r6 = r15.isFieldPresent(r1, r4)
            if (r6 == 0) goto L4df
            int r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeInt32Size(r8, r6)
            goto L3c4
        L4a5:
            boolean r6 = r15.isFieldPresent(r1, r4)
            if (r6 == 0) goto L4df
            long r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt64Size(r8, r6)
            goto L3c4
        L4b5:
            boolean r6 = r15.isFieldPresent(r1, r4)
            if (r6 == 0) goto L4df
            long r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeInt64Size(r8, r6)
            goto L3c4
        L4c5:
            boolean r6 = r15.isFieldPresent(r1, r4)
            if (r6 == 0) goto L4df
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFloatSize(r8, r12)
            goto L3c4
        L4d1:
            boolean r6 = r15.isFieldPresent(r1, r4)
            if (r6 == 0) goto L4df
            r6 = 0
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeDoubleSize(r8, r6)
            goto L3c4
        L4df:
            int r4 = r4 + 3
            goto L8
        L4e3:
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r2 = r0.unknownFieldSchema
            int r1 = r15.getUnknownFieldsSerializedSize(r2, r1)
            int r5 = r5 + r1
            return r5
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<UT, UB> r1, T r2) {
            r0 = this;
            java.lang.Object r2 = r1.getFromMessage(r2)
            int r1 = r1.getSerializedSize(r2)
            return r1
    }

    private static <T> int intAt(T r0, long r1) {
            int r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r0, r1)
            return r0
    }

    private static boolean isEnforceUtf8(int r1) {
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r0
            if (r1 == 0) goto L7
            r1 = 1
            goto L8
        L7:
            r1 = 0
        L8:
            return r1
    }

    private boolean isFieldPresent(T r7, int r8) {
            r6 = this;
            int r0 = r6.presenceMaskAndOffsetAt(r8)
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r1 = (long) r1
            r3 = 1048575(0xfffff, double:5.18065E-318)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r4 = 0
            r5 = 1
            if (r3 != 0) goto Le8
            int r8 = r6.typeAndOffsetAt(r8)
            long r0 = offset(r8)
            int r8 = type(r8)
            r2 = 0
            switch(r8) {
                case 0: goto Lda;
                case 1: goto Lce;
                case 2: goto Lc4;
                case 3: goto Lba;
                case 4: goto Lb2;
                case 5: goto La8;
                case 6: goto La0;
                case 7: goto L9b;
                case 8: goto L79;
                case 9: goto L71;
                case 10: goto L65;
                case 11: goto L5d;
                case 12: goto L55;
                case 13: goto L4d;
                case 14: goto L43;
                case 15: goto L3b;
                case 16: goto L31;
                case 17: goto L29;
                default: goto L23;
            }
        L23:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        L29:
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r7, r0)
            if (r7 == 0) goto L30
            r4 = r5
        L30:
            return r4
        L31:
            long r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r7, r0)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 == 0) goto L3a
            r4 = r5
        L3a:
            return r4
        L3b:
            int r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r7, r0)
            if (r7 == 0) goto L42
            r4 = r5
        L42:
            return r4
        L43:
            long r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r7, r0)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 == 0) goto L4c
            r4 = r5
        L4c:
            return r4
        L4d:
            int r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r7, r0)
            if (r7 == 0) goto L54
            r4 = r5
        L54:
            return r4
        L55:
            int r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r7, r0)
            if (r7 == 0) goto L5c
            r4 = r5
        L5c:
            return r4
        L5d:
            int r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r7, r0)
            if (r7 == 0) goto L64
            r4 = r5
        L64:
            return r4
        L65:
            com.google.crypto.tink.shaded.protobuf.ByteString r8 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r7, r0)
            boolean r7 = r8.equals(r7)
            r7 = r7 ^ r5
            return r7
        L71:
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r7, r0)
            if (r7 == 0) goto L78
            r4 = r5
        L78:
            return r4
        L79:
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r7, r0)
            boolean r8 = r7 instanceof java.lang.String
            if (r8 == 0) goto L89
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = r7.isEmpty()
            r7 = r7 ^ r5
            return r7
        L89:
            boolean r8 = r7 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r8 == 0) goto L95
            com.google.crypto.tink.shaded.protobuf.ByteString r8 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
            boolean r7 = r8.equals(r7)
            r7 = r7 ^ r5
            return r7
        L95:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        L9b:
            boolean r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getBoolean(r7, r0)
            return r7
        La0:
            int r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r7, r0)
            if (r7 == 0) goto La7
            r4 = r5
        La7:
            return r4
        La8:
            long r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r7, r0)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 == 0) goto Lb1
            r4 = r5
        Lb1:
            return r4
        Lb2:
            int r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r7, r0)
            if (r7 == 0) goto Lb9
            r4 = r5
        Lb9:
            return r4
        Lba:
            long r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r7, r0)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 == 0) goto Lc3
            r4 = r5
        Lc3:
            return r4
        Lc4:
            long r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r7, r0)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 == 0) goto Lcd
            r4 = r5
        Lcd:
            return r4
        Lce:
            float r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getFloat(r7, r0)
            int r7 = java.lang.Float.floatToRawIntBits(r7)
            if (r7 == 0) goto Ld9
            r4 = r5
        Ld9:
            return r4
        Lda:
            double r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getDouble(r7, r0)
            long r7 = java.lang.Double.doubleToRawLongBits(r7)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 == 0) goto Le7
            r4 = r5
        Le7:
            return r4
        Le8:
            int r8 = r0 >>> 20
            int r8 = r5 << r8
            int r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r7, r1)
            r7 = r7 & r8
            if (r7 == 0) goto Lf4
            r4 = r5
        Lf4:
            return r4
    }

    private boolean isFieldPresent(T r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            r0 = 1048575(0xfffff, float:1.469367E-39)
            if (r4 != r0) goto La
            boolean r2 = r1.isFieldPresent(r2, r3)
            return r2
        La:
            r2 = r5 & r6
            if (r2 == 0) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            return r2
    }

    private static boolean isInitialized(java.lang.Object r2, int r3, com.google.crypto.tink.shaded.protobuf.Schema r4) {
            long r0 = offset(r3)
            java.lang.Object r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r2, r0)
            boolean r2 = r4.isInitialized(r2)
            return r2
    }

    private <N> boolean isListInitialized(java.lang.Object r4, int r5, int r6) {
            r3 = this;
            long r0 = offset(r5)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r4, r0)
            java.util.List r4 = (java.util.List) r4
            boolean r5 = r4.isEmpty()
            r0 = 1
            if (r5 == 0) goto L12
            return r0
        L12:
            com.google.crypto.tink.shaded.protobuf.Schema r5 = r3.getMessageFieldSchema(r6)
            r6 = 0
            r1 = r6
        L18:
            int r2 = r4.size()
            if (r1 >= r2) goto L2c
            java.lang.Object r2 = r4.get(r1)
            boolean r2 = r5.isInitialized(r2)
            if (r2 != 0) goto L29
            return r6
        L29:
            int r1 = r1 + 1
            goto L18
        L2c:
            return r0
    }

    private boolean isMapInitialized(T r4, int r5, int r6) {
            r3 = this;
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r0 = r3.mapFieldSchema
            long r1 = offset(r5)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r4, r1)
            java.util.Map r4 = r0.forMapData(r4)
            boolean r5 = r4.isEmpty()
            r0 = 1
            if (r5 == 0) goto L16
            return r0
        L16:
            java.lang.Object r5 = r3.getMapFieldDefaultEntry(r6)
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r6 = r3.mapFieldSchema
            com.google.crypto.tink.shaded.protobuf.MapEntryLite$Metadata r5 = r6.forMapMetadata(r5)
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r5 = r5.valueType
            com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r5 = r5.getJavaType()
            com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r6 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE
            if (r5 == r6) goto L2b
            return r0
        L2b:
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
        L34:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L54
            java.lang.Object r6 = r4.next()
            if (r5 != 0) goto L4c
            com.google.crypto.tink.shaded.protobuf.Protobuf r5 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
            java.lang.Class r1 = r6.getClass()
            com.google.crypto.tink.shaded.protobuf.Schema r5 = r5.schemaFor(r1)
        L4c:
            boolean r6 = r5.isInitialized(r6)
            if (r6 != 0) goto L34
            r4 = 0
            return r4
        L54:
            return r0
    }

    private static boolean isMutable(java.lang.Object r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            boolean r0 = r1 instanceof com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
            if (r0 == 0) goto Lf
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r1
            boolean r1 = r1.isMutable()
            return r1
        Lf:
            r1 = 1
            return r1
    }

    private boolean isOneofCaseEqual(T r3, T r4, int r5) {
            r2 = this;
            int r5 = r2.presenceMaskAndOffsetAt(r5)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r0
            long r0 = (long) r5
            int r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r3, r0)
            int r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r4, r0)
            if (r3 != r4) goto L15
            r3 = 1
            goto L16
        L15:
            r3 = 0
        L16:
            return r3
    }

    private boolean isOneofPresent(T r3, int r4, int r5) {
            r2 = this;
            int r5 = r2.presenceMaskAndOffsetAt(r5)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r0
            long r0 = (long) r5
            int r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r3, r0)
            if (r3 != r4) goto L11
            r3 = 1
            goto L12
        L11:
            r3 = 0
        L12:
            return r3
    }

    private static boolean isRequired(int r1) {
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r1 = r1 & r0
            if (r1 == 0) goto L7
            r1 = 1
            goto L8
        L7:
            r1 = 0
        L8:
            return r1
    }

    private static java.util.List<?> listAt(java.lang.Object r0, long r1) {
            java.lang.Object r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r0, r1)
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    private static <T> long longAt(T r0, long r1) {
            long r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r0, r1)
            return r0
    }

    private <UT, UB, ET extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<UT, UB> r19, com.google.crypto.tink.shaded.protobuf.ExtensionSchema<ET> r20, T r21, com.google.crypto.tink.shaded.protobuf.Reader r22, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r23) throws java.io.IOException {
            r18 = this;
            r8 = r18
            r7 = r19
            r15 = r21
            r0 = r22
            r6 = r23
            r17 = 0
            r5 = r17
            r9 = r5
        Lf:
            int r2 = r22.getFieldNumber()     // Catch: java.lang.Throwable -> L6a4
            int r3 = r8.positionForFieldNumber(r2)     // Catch: java.lang.Throwable -> L6a4
            if (r3 >= 0) goto Lb8
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r1) goto L3e
            int r0 = r8.checkInitializedCount
            r4 = r5
        L21:
            int r1 = r8.repeatedFieldOffsetStart
            if (r0 >= r1) goto L38
            int[] r1 = r8.intArray
            r3 = r1[r0]
            r1 = r18
            r2 = r21
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.filterMapUnknownEnumValues(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L21
        L38:
            if (r4 == 0) goto L3d
            r7.setBuilderToMessage(r15, r4)
        L3d:
            return
        L3e:
            boolean r1 = r8.hasExtensions     // Catch: java.lang.Throwable -> Lb4
            if (r1 != 0) goto L47
            r4 = r20
            r12 = r17
            goto L50
        L47:
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r8.defaultInstance     // Catch: java.lang.Throwable -> Lb4
            r4 = r20
            java.lang.Object r1 = r4.findExtensionByNumber(r6, r1, r2)     // Catch: java.lang.Throwable -> Lb4
            r12 = r1
        L50:
            if (r12 == 0) goto L71
            if (r9 != 0) goto L5c
            com.google.crypto.tink.shaded.protobuf.FieldSet r9 = r20.getMutableExtensions(r21)     // Catch: java.lang.Throwable -> L59
            goto L5c
        L59:
            r0 = move-exception
            goto L6a6
        L5c:
            r1 = r9
            r9 = r20
            r10 = r21
            r11 = r22
            r13 = r23
            r14 = r1
            r3 = r15
            r15 = r5
            r16 = r19
            java.lang.Object r5 = r9.parseExtension(r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> Lb0
            r9 = r1
        L6f:
            r15 = r3
            goto Lf
        L71:
            r3 = r15
            boolean r1 = r7.shouldDiscardUnknownFields(r0)     // Catch: java.lang.Throwable -> Lb0
            if (r1 == 0) goto L7f
            boolean r1 = r22.skipField()     // Catch: java.lang.Throwable -> Lb0
            if (r1 == 0) goto L8c
        L7e:
            goto L6f
        L7f:
            if (r5 != 0) goto L85
            java.lang.Object r5 = r7.getBuilderFromMessage(r3)     // Catch: java.lang.Throwable -> Lb0
        L85:
            boolean r1 = r7.mergeOneFieldFrom(r5, r0)     // Catch: java.lang.Throwable -> Lb0
            if (r1 == 0) goto L8c
            goto L7e
        L8c:
            int r0 = r8.checkInitializedCount
            r4 = r5
        L8f:
            int r1 = r8.repeatedFieldOffsetStart
            if (r0 >= r1) goto La9
            int[] r1 = r8.intArray
            r5 = r1[r0]
            r1 = r18
            r2 = r21
            r10 = r3
            r3 = r5
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.filterMapUnknownEnumValues(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            r3 = r10
            goto L8f
        La9:
            r10 = r3
            if (r4 == 0) goto Laf
            r7.setBuilderToMessage(r10, r4)
        Laf:
            return
        Lb0:
            r0 = move-exception
            r10 = r3
            goto L6a2
        Lb4:
            r0 = move-exception
            r10 = r15
            goto L6a2
        Lb8:
            r4 = r20
            r10 = r15
            int r11 = r8.typeAndOffsetAt(r3)     // Catch: java.lang.Throwable -> L6a0
            int r1 = type(r11)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63d java.lang.Throwable -> L6a0
            switch(r1) {
                case 0: goto L5fc;
                case 1: goto L5ea;
                case 2: goto L5d8;
                case 3: goto L5c6;
                case 4: goto L5b4;
                case 5: goto L5a1;
                case 6: goto L58e;
                case 7: goto L57b;
                case 8: goto L570;
                case 9: goto L55b;
                case 10: goto L548;
                case 11: goto L535;
                case 12: goto L50f;
                case 13: goto L4fc;
                case 14: goto L4e9;
                case 15: goto L4d6;
                case 16: goto L4c3;
                case 17: goto L4ae;
                case 18: goto L49c;
                case 19: goto L48a;
                case 20: goto L478;
                case 21: goto L466;
                case 22: goto L454;
                case 23: goto L442;
                case 24: goto L430;
                case 25: goto L41e;
                case 26: goto L416;
                case 27: goto L401;
                case 28: goto L3ef;
                case 29: goto L3dd;
                case 30: goto L3bc;
                case 31: goto L3aa;
                case 32: goto L398;
                case 33: goto L386;
                case 34: goto L374;
                case 35: goto L362;
                case 36: goto L350;
                case 37: goto L33e;
                case 38: goto L32c;
                case 39: goto L31a;
                case 40: goto L308;
                case 41: goto L2f6;
                case 42: goto L2e4;
                case 43: goto L2d2;
                case 44: goto L2b1;
                case 45: goto L29f;
                case 46: goto L28d;
                case 47: goto L27b;
                case 48: goto L269;
                case 49: goto L249;
                case 50: goto L234;
                case 51: goto L21d;
                case 52: goto L209;
                case 53: goto L1f6;
                case 54: goto L1e3;
                case 55: goto L1d0;
                case 56: goto L1bd;
                case 57: goto L1aa;
                case 58: goto L197;
                case 59: goto L18d;
                case 60: goto L17c;
                case 61: goto L16d;
                case 62: goto L15a;
                case 63: goto L132;
                case 64: goto L11f;
                case 65: goto L10b;
                case 66: goto Lf7;
                case 67: goto Le3;
                case 68: goto Ld1;
                default: goto Lc6;
            }
        Lc6:
            r12 = r5
            r13 = r6
            r14 = r7
            if (r12 != 0) goto L616
            java.lang.Object r5 = r14.getBuilderFromMessage(r10)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L617
        Ld1:
            java.lang.Object r1 = r8.mutableOneofMessageFieldForMerge(r10, r2, r3)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r1     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            com.google.crypto.tink.shaded.protobuf.Schema r11 = r8.getMessageFieldSchema(r3)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            r0.mergeGroupField(r1, r11, r6)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            r8.storeOneofMessageField(r10, r2, r3, r1)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            goto L193
        Le3:
            long r11 = offset(r11)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            long r13 = r22.readSInt64()     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r10, r11, r1)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            r8.setOneofPresent(r10, r2, r3)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            goto L193
        Lf7:
            long r11 = offset(r11)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            int r1 = r22.readSInt32()     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r10, r11, r1)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            r8.setOneofPresent(r10, r2, r3)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            goto L193
        L10b:
            long r11 = offset(r11)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            long r13 = r22.readSFixed64()     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r10, r11, r1)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            r8.setOneofPresent(r10, r2, r3)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            goto L193
        L11f:
            long r11 = offset(r11)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            int r1 = r22.readSFixed32()     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r10, r11, r1)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            r8.setOneofPresent(r10, r2, r3)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            goto L193
        L132:
            int r1 = r22.readEnum()     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r12 = r8.getEnumFieldVerifier(r3)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            if (r12 == 0) goto L14b
            boolean r12 = r12.isInRange(r1)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            if (r12 == 0) goto L143
            goto L14b
        L143:
            java.lang.Object r5 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.storeUnknownEnum(r10, r2, r1, r5, r7)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            r13 = r6
            r14 = r7
            goto L699
        L14b:
            long r11 = offset(r11)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r10, r11, r1)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            r8.setOneofPresent(r10, r2, r3)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            goto L193
        L15a:
            long r11 = offset(r11)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            int r1 = r22.readUInt32()     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r10, r11, r1)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            r8.setOneofPresent(r10, r2, r3)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            goto L193
        L16d:
            long r11 = offset(r11)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r22.readBytes()     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r10, r11, r1)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            r8.setOneofPresent(r10, r2, r3)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            goto L193
        L17c:
            java.lang.Object r1 = r8.mutableOneofMessageFieldForMerge(r10, r2, r3)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r1     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            com.google.crypto.tink.shaded.protobuf.Schema r11 = r8.getMessageFieldSchema(r3)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            r0.mergeMessageField(r1, r11, r6)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            r8.storeOneofMessageField(r10, r2, r3, r1)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            goto L193
        L18d:
            r8.readString(r10, r11, r0)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            r8.setOneofPresent(r10, r2, r3)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
        L193:
            r12 = r5
            r13 = r6
            goto L246
        L197:
            long r11 = offset(r11)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            boolean r1 = r22.readBool()     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r10, r11, r1)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            r8.setOneofPresent(r10, r2, r3)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            goto L193
        L1aa:
            long r11 = offset(r11)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            int r1 = r22.readFixed32()     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r10, r11, r1)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            r8.setOneofPresent(r10, r2, r3)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            goto L193
        L1bd:
            long r11 = offset(r11)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            long r13 = r22.readFixed64()     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r10, r11, r1)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            r8.setOneofPresent(r10, r2, r3)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            goto L193
        L1d0:
            long r11 = offset(r11)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            int r1 = r22.readInt32()     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r10, r11, r1)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            r8.setOneofPresent(r10, r2, r3)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            goto L193
        L1e3:
            long r11 = offset(r11)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            long r13 = r22.readUInt64()     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r10, r11, r1)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            r8.setOneofPresent(r10, r2, r3)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            goto L193
        L1f6:
            long r11 = offset(r11)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            long r13 = r22.readInt64()     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r10, r11, r1)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            r8.setOneofPresent(r10, r2, r3)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            goto L193
        L209:
            long r11 = offset(r11)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            float r1 = r22.readFloat()     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            java.lang.Float r1 = java.lang.Float.valueOf(r1)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r10, r11, r1)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            r8.setOneofPresent(r10, r2, r3)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            goto L193
        L21d:
            long r11 = offset(r11)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            double r13 = r22.readDouble()     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            java.lang.Double r1 = java.lang.Double.valueOf(r13)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r10, r11, r1)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            r8.setOneofPresent(r10, r2, r3)     // Catch: java.lang.Throwable -> L231 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63e
            goto L193
        L231:
            r0 = move-exception
            goto L6a2
        L234:
            java.lang.Object r11 = r8.getMapFieldDefaultEntry(r3)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L63d java.lang.Throwable -> L6a0
            r1 = r18
            r2 = r21
            r4 = r11
            r12 = r5
            r5 = r23
            r13 = r6
            r6 = r22
            r1.mergeMap(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L262 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L266
        L246:
            r14 = r7
            goto L60d
        L249:
            r12 = r5
            r13 = r6
            long r4 = offset(r11)     // Catch: java.lang.Throwable -> L262 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L266
            com.google.crypto.tink.shaded.protobuf.Schema r6 = r8.getMessageFieldSchema(r3)     // Catch: java.lang.Throwable -> L262 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L266
            r1 = r18
            r2 = r21
            r3 = r4
            r5 = r22
            r14 = r7
            r7 = r23
            r1.readGroupList(r2, r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L262:
            r0 = move-exception
            r14 = r7
            goto L611
        L266:
            r14 = r7
            goto L614
        L269:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            long r2 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r0.readSInt64List(r1)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L27b:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            long r2 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r0.readSInt32List(r1)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L28d:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            long r2 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r0.readSFixed64List(r1)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L29f:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            long r2 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r0.readSFixed32List(r1)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L2b1:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            long r4 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            java.util.List r4 = r1.mutableListAt(r10, r4)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r0.readEnumList(r4)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r5 = r8.getEnumFieldVerifier(r3)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r1 = r21
            r3 = r4
            r4 = r5
            r5 = r12
            r6 = r19
            java.lang.Object r5 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.filterUnknownEnumList(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L699
        L2d2:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            long r2 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r0.readUInt32List(r1)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L2e4:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            long r2 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r0.readBoolList(r1)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L2f6:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            long r2 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r0.readFixed32List(r1)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L308:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            long r2 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r0.readFixed64List(r1)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L31a:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            long r2 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r0.readInt32List(r1)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L32c:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            long r2 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r0.readUInt64List(r1)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L33e:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            long r2 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r0.readInt64List(r1)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L350:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            long r2 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r0.readFloatList(r1)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L362:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            long r2 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r0.readDoubleList(r1)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L374:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            long r2 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r0.readSInt64List(r1)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L386:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            long r2 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r0.readSInt32List(r1)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L398:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            long r2 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r0.readSFixed64List(r1)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L3aa:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            long r2 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r0.readSFixed32List(r1)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L3bc:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            long r4 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            java.util.List r4 = r1.mutableListAt(r10, r4)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r0.readEnumList(r4)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r5 = r8.getEnumFieldVerifier(r3)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r1 = r21
            r3 = r4
            r4 = r5
            r5 = r12
            r6 = r19
            java.lang.Object r5 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.filterUnknownEnumList(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L699
        L3dd:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            long r2 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r0.readUInt32List(r1)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L3ef:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            long r2 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r0.readBytesList(r1)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L401:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.Schema r5 = r8.getMessageFieldSchema(r3)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r1 = r18
            r2 = r21
            r3 = r11
            r4 = r22
            r6 = r23
            r1.readMessageList(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L416:
            r12 = r5
            r13 = r6
            r14 = r7
            r8.readStringList(r10, r11, r0)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L41e:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            long r2 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r0.readBoolList(r1)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L430:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            long r2 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r0.readFixed32List(r1)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L442:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            long r2 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r0.readFixed64List(r1)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L454:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            long r2 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r0.readInt32List(r1)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L466:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            long r2 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r0.readUInt64List(r1)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L478:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            long r2 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r0.readInt64List(r1)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L48a:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            long r2 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r0.readFloatList(r1)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L49c:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            long r2 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r0.readDoubleList(r1)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L4ae:
            r12 = r5
            r13 = r6
            r14 = r7
            java.lang.Object r1 = r8.mutableMessageFieldForMerge(r10, r3)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r1     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            com.google.crypto.tink.shaded.protobuf.Schema r2 = r8.getMessageFieldSchema(r3)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r0.mergeGroupField(r1, r2, r13)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r8.storeMessageField(r10, r3, r1)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L4c3:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            long r4 = r22.readSInt64()     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putLong(r10, r1, r4)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r8.setFieldPresent(r10, r3)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L4d6:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            int r4 = r22.readSInt32()     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putInt(r10, r1, r4)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r8.setFieldPresent(r10, r3)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L4e9:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            long r4 = r22.readSFixed64()     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putLong(r10, r1, r4)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r8.setFieldPresent(r10, r3)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L4fc:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            int r4 = r22.readSFixed32()     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putInt(r10, r1, r4)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r8.setFieldPresent(r10, r3)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L50f:
            r12 = r5
            r13 = r6
            r14 = r7
            int r1 = r22.readEnum()     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r4 = r8.getEnumFieldVerifier(r3)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            if (r4 == 0) goto L529
            boolean r4 = r4.isInRange(r1)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            if (r4 == 0) goto L523
            goto L529
        L523:
            java.lang.Object r5 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.storeUnknownEnum(r10, r2, r1, r12, r14)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L699
        L529:
            long r4 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putInt(r10, r4, r1)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r8.setFieldPresent(r10, r3)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L535:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            int r4 = r22.readUInt32()     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putInt(r10, r1, r4)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r8.setFieldPresent(r10, r3)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L548:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = r22.readBytes()     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r10, r1, r4)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r8.setFieldPresent(r10, r3)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L55b:
            r12 = r5
            r13 = r6
            r14 = r7
            java.lang.Object r1 = r8.mutableMessageFieldForMerge(r10, r3)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r1     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            com.google.crypto.tink.shaded.protobuf.Schema r2 = r8.getMessageFieldSchema(r3)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r0.mergeMessageField(r1, r2, r13)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r8.storeMessageField(r10, r3, r1)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L570:
            r12 = r5
            r13 = r6
            r14 = r7
            r8.readString(r10, r11, r0)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r8.setFieldPresent(r10, r3)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L57b:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            boolean r4 = r22.readBool()     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putBoolean(r10, r1, r4)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r8.setFieldPresent(r10, r3)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L58e:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            int r4 = r22.readFixed32()     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putInt(r10, r1, r4)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r8.setFieldPresent(r10, r3)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L5a1:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            long r4 = r22.readFixed64()     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putLong(r10, r1, r4)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r8.setFieldPresent(r10, r3)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L5b4:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            int r4 = r22.readInt32()     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putInt(r10, r1, r4)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r8.setFieldPresent(r10, r3)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L5c6:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            long r4 = r22.readUInt64()     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putLong(r10, r1, r4)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r8.setFieldPresent(r10, r3)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L5d8:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            long r4 = r22.readInt64()     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putLong(r10, r1, r4)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r8.setFieldPresent(r10, r3)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L5ea:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            float r4 = r22.readFloat()     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putFloat(r10, r1, r4)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r8.setFieldPresent(r10, r3)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            goto L60d
        L5fc:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = offset(r11)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            double r4 = r22.readDouble()     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putDouble(r10, r1, r4)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
            r8.setFieldPresent(r10, r3)     // Catch: java.lang.Throwable -> L610 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L614
        L60d:
            r5 = r12
            goto L699
        L610:
            r0 = move-exception
        L611:
            r5 = r12
            goto L6a8
        L614:
            r5 = r12
            goto L640
        L616:
            r5 = r12
        L617:
            boolean r1 = r14.mergeOneFieldFrom(r5, r0)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L640 java.lang.Throwable -> L69e
            if (r1 != 0) goto L699
            int r0 = r8.checkInitializedCount
            r4 = r5
        L620:
            int r1 = r8.repeatedFieldOffsetStart
            if (r0 >= r1) goto L637
            int[] r1 = r8.intArray
            r3 = r1[r0]
            r1 = r18
            r2 = r21
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.filterMapUnknownEnumValues(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L620
        L637:
            if (r4 == 0) goto L63c
            r14.setBuilderToMessage(r10, r4)
        L63c:
            return
        L63d:
            r12 = r5
        L63e:
            r13 = r6
            r14 = r7
        L640:
            boolean r1 = r14.shouldDiscardUnknownFields(r0)     // Catch: java.lang.Throwable -> L69e
            if (r1 == 0) goto L66c
            boolean r1 = r22.skipField()     // Catch: java.lang.Throwable -> L69e
            if (r1 != 0) goto L699
            int r0 = r8.checkInitializedCount
            r4 = r5
        L64f:
            int r1 = r8.repeatedFieldOffsetStart
            if (r0 >= r1) goto L666
            int[] r1 = r8.intArray
            r3 = r1[r0]
            r1 = r18
            r2 = r21
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.filterMapUnknownEnumValues(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L64f
        L666:
            if (r4 == 0) goto L66b
            r14.setBuilderToMessage(r10, r4)
        L66b:
            return
        L66c:
            if (r5 != 0) goto L673
            java.lang.Object r1 = r14.getBuilderFromMessage(r10)     // Catch: java.lang.Throwable -> L69e
            r5 = r1
        L673:
            boolean r1 = r14.mergeOneFieldFrom(r5, r0)     // Catch: java.lang.Throwable -> L69e
            if (r1 != 0) goto L699
            int r0 = r8.checkInitializedCount
            r4 = r5
        L67c:
            int r1 = r8.repeatedFieldOffsetStart
            if (r0 >= r1) goto L693
            int[] r1 = r8.intArray
            r3 = r1[r0]
            r1 = r18
            r2 = r21
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.filterMapUnknownEnumValues(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L67c
        L693:
            if (r4 == 0) goto L698
            r14.setBuilderToMessage(r10, r4)
        L698:
            return
        L699:
            r15 = r10
            r6 = r13
            r7 = r14
            goto Lf
        L69e:
            r0 = move-exception
            goto L6a8
        L6a0:
            r0 = move-exception
            r12 = r5
        L6a2:
            r14 = r7
            goto L6a8
        L6a4:
            r0 = move-exception
            r12 = r5
        L6a6:
            r14 = r7
            r10 = r15
        L6a8:
            int r1 = r8.checkInitializedCount
            r7 = r1
            r4 = r5
        L6ac:
            int r1 = r8.repeatedFieldOffsetStart
            if (r7 >= r1) goto L6c3
            int[] r1 = r8.intArray
            r3 = r1[r7]
            r1 = r18
            r2 = r21
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.filterMapUnknownEnumValues(r2, r3, r4, r5, r6)
            int r7 = r7 + 1
            goto L6ac
        L6c3:
            if (r4 == 0) goto L6c8
            r14.setBuilderToMessage(r10, r4)
        L6c8:
            throw r0
    }

    private final <K, V> void mergeMap(java.lang.Object r5, int r6, java.lang.Object r7, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r8, com.google.crypto.tink.shaded.protobuf.Reader r9) throws java.io.IOException {
            r4 = this;
            int r6 = r4.typeAndOffsetAt(r6)
            long r0 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r5, r0)
            if (r6 != 0) goto L18
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r6 = r4.mapFieldSchema
            java.lang.Object r6 = r6.newMapField(r7)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r5, r0, r6)
            goto L2f
        L18:
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r2 = r4.mapFieldSchema
            boolean r2 = r2.isImmutable(r6)
            if (r2 == 0) goto L2f
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r2 = r4.mapFieldSchema
            java.lang.Object r2 = r2.newMapField(r7)
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r3 = r4.mapFieldSchema
            r3.mergeFrom(r2, r6)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r5, r0, r2)
            r6 = r2
        L2f:
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r5 = r4.mapFieldSchema
            java.util.Map r5 = r5.forMutableMapData(r6)
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r6 = r4.mapFieldSchema
            com.google.crypto.tink.shaded.protobuf.MapEntryLite$Metadata r6 = r6.forMapMetadata(r7)
            r9.readMap(r5, r6, r8)
            return
    }

    private void mergeMessage(T r6, T r7, int r8) {
            r5 = this;
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r5.typeAndOffsetAt(r8)
            long r0 = offset(r0)
            sun.misc.Unsafe r2 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            java.lang.Object r3 = r2.getObject(r7, r0)
            if (r3 == 0) goto L52
            com.google.crypto.tink.shaded.protobuf.Schema r7 = r5.getMessageFieldSchema(r8)
            boolean r4 = r5.isFieldPresent(r6, r8)
            if (r4 != 0) goto L39
            boolean r4 = isMutable(r3)
            if (r4 != 0) goto L2b
            r2.putObject(r6, r0, r3)
            goto L35
        L2b:
            java.lang.Object r4 = r7.newInstance()
            r7.mergeFrom(r4, r3)
            r2.putObject(r6, r0, r4)
        L35:
            r5.setFieldPresent(r6, r8)
            return
        L39:
            java.lang.Object r8 = r2.getObject(r6, r0)
            boolean r4 = isMutable(r8)
            if (r4 != 0) goto L4e
            java.lang.Object r4 = r7.newInstance()
            r7.mergeFrom(r4, r8)
            r2.putObject(r6, r0, r4)
            r8 = r4
        L4e:
            r7.mergeFrom(r8, r3)
            return
        L52:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Source subfield "
            r0.<init>(r1)
            int r8 = r5.numberAt(r8)
            java.lang.StringBuilder r8 = r0.append(r8)
            java.lang.String r0 = " is present but null: "
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.StringBuilder r7 = r8.append(r7)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
    }

    private void mergeOneofMessage(T r7, T r8, int r9) {
            r6 = this;
            int r0 = r6.numberAt(r9)
            boolean r1 = r6.isOneofPresent(r8, r0, r9)
            if (r1 != 0) goto Lb
            return
        Lb:
            int r1 = r6.typeAndOffsetAt(r9)
            long r1 = offset(r1)
            sun.misc.Unsafe r3 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            java.lang.Object r4 = r3.getObject(r8, r1)
            if (r4 == 0) goto L56
            com.google.crypto.tink.shaded.protobuf.Schema r8 = r6.getMessageFieldSchema(r9)
            boolean r5 = r6.isOneofPresent(r7, r0, r9)
            if (r5 != 0) goto L3d
            boolean r5 = isMutable(r4)
            if (r5 != 0) goto L2f
            r3.putObject(r7, r1, r4)
            goto L39
        L2f:
            java.lang.Object r5 = r8.newInstance()
            r8.mergeFrom(r5, r4)
            r3.putObject(r7, r1, r5)
        L39:
            r6.setOneofPresent(r7, r0, r9)
            return
        L3d:
            java.lang.Object r9 = r3.getObject(r7, r1)
            boolean r0 = isMutable(r9)
            if (r0 != 0) goto L52
            java.lang.Object r0 = r8.newInstance()
            r8.mergeFrom(r0, r9)
            r3.putObject(r7, r1, r0)
            r9 = r0
        L52:
            r8.mergeFrom(r9, r4)
            return
        L56:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Source subfield "
            r0.<init>(r1)
            int r9 = r6.numberAt(r9)
            java.lang.StringBuilder r9 = r0.append(r9)
            java.lang.String r0 = " is present but null: "
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.StringBuilder r8 = r9.append(r8)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }

    private void mergeSingleField(T r6, T r7, int r8) {
            r5 = this;
            int r0 = r5.typeAndOffsetAt(r8)
            long r1 = offset(r0)
            int r3 = r5.numberAt(r8)
            int r0 = type(r0)
            switch(r0) {
                case 0: goto L163;
                case 1: goto L152;
                case 2: goto L141;
                case 3: goto L130;
                case 4: goto L11f;
                case 5: goto L10e;
                case 6: goto Lfd;
                case 7: goto Leb;
                case 8: goto Ld9;
                case 9: goto Ld4;
                case 10: goto Lc2;
                case 11: goto Lb0;
                case 12: goto L9e;
                case 13: goto L8c;
                case 14: goto L7a;
                case 15: goto L68;
                case 16: goto L56;
                case 17: goto L51;
                case 18: goto L4a;
                case 19: goto L4a;
                case 20: goto L4a;
                case 21: goto L4a;
                case 22: goto L4a;
                case 23: goto L4a;
                case 24: goto L4a;
                case 25: goto L4a;
                case 26: goto L4a;
                case 27: goto L4a;
                case 28: goto L4a;
                case 29: goto L4a;
                case 30: goto L4a;
                case 31: goto L4a;
                case 32: goto L4a;
                case 33: goto L4a;
                case 34: goto L4a;
                case 35: goto L4a;
                case 36: goto L4a;
                case 37: goto L4a;
                case 38: goto L4a;
                case 39: goto L4a;
                case 40: goto L4a;
                case 41: goto L4a;
                case 42: goto L4a;
                case 43: goto L4a;
                case 44: goto L4a;
                case 45: goto L4a;
                case 46: goto L4a;
                case 47: goto L4a;
                case 48: goto L4a;
                case 49: goto L4a;
                case 50: goto L43;
                case 51: goto L31;
                case 52: goto L31;
                case 53: goto L31;
                case 54: goto L31;
                case 55: goto L31;
                case 56: goto L31;
                case 57: goto L31;
                case 58: goto L31;
                case 59: goto L31;
                case 60: goto L2c;
                case 61: goto L1a;
                case 62: goto L1a;
                case 63: goto L1a;
                case 64: goto L1a;
                case 65: goto L1a;
                case 66: goto L1a;
                case 67: goto L1a;
                case 68: goto L15;
                default: goto L13;
            }
        L13:
            goto L173
        L15:
            r5.mergeOneofMessage(r6, r7, r8)
            goto L173
        L1a:
            boolean r0 = r5.isOneofPresent(r7, r3, r8)
            if (r0 == 0) goto L173
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r7, r1)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r6, r1, r7)
            r5.setOneofPresent(r6, r3, r8)
            goto L173
        L2c:
            r5.mergeOneofMessage(r6, r7, r8)
            goto L173
        L31:
            boolean r0 = r5.isOneofPresent(r7, r3, r8)
            if (r0 == 0) goto L173
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r7, r1)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r6, r1, r7)
            r5.setOneofPresent(r6, r3, r8)
            goto L173
        L43:
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r8 = r5.mapFieldSchema
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.mergeMap(r8, r6, r7, r1)
            goto L173
        L4a:
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r8 = r5.listFieldSchema
            r8.mergeListsAt(r6, r7, r1)
            goto L173
        L51:
            r5.mergeMessage(r6, r7, r8)
            goto L173
        L56:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L173
            long r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r7, r1)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putLong(r6, r1, r3)
            r5.setFieldPresent(r6, r8)
            goto L173
        L68:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L173
            int r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r7, r1)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putInt(r6, r1, r7)
            r5.setFieldPresent(r6, r8)
            goto L173
        L7a:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L173
            long r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r7, r1)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putLong(r6, r1, r3)
            r5.setFieldPresent(r6, r8)
            goto L173
        L8c:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L173
            int r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r7, r1)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putInt(r6, r1, r7)
            r5.setFieldPresent(r6, r8)
            goto L173
        L9e:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L173
            int r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r7, r1)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putInt(r6, r1, r7)
            r5.setFieldPresent(r6, r8)
            goto L173
        Lb0:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L173
            int r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r7, r1)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putInt(r6, r1, r7)
            r5.setFieldPresent(r6, r8)
            goto L173
        Lc2:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L173
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r7, r1)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r6, r1, r7)
            r5.setFieldPresent(r6, r8)
            goto L173
        Ld4:
            r5.mergeMessage(r6, r7, r8)
            goto L173
        Ld9:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L173
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r7, r1)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r6, r1, r7)
            r5.setFieldPresent(r6, r8)
            goto L173
        Leb:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L173
            boolean r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getBoolean(r7, r1)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putBoolean(r6, r1, r7)
            r5.setFieldPresent(r6, r8)
            goto L173
        Lfd:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L173
            int r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r7, r1)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putInt(r6, r1, r7)
            r5.setFieldPresent(r6, r8)
            goto L173
        L10e:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L173
            long r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r7, r1)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putLong(r6, r1, r3)
            r5.setFieldPresent(r6, r8)
            goto L173
        L11f:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L173
            int r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r7, r1)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putInt(r6, r1, r7)
            r5.setFieldPresent(r6, r8)
            goto L173
        L130:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L173
            long r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r7, r1)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putLong(r6, r1, r3)
            r5.setFieldPresent(r6, r8)
            goto L173
        L141:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L173
            long r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r7, r1)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putLong(r6, r1, r3)
            r5.setFieldPresent(r6, r8)
            goto L173
        L152:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L173
            float r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getFloat(r7, r1)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putFloat(r6, r1, r7)
            r5.setFieldPresent(r6, r8)
            goto L173
        L163:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L173
            double r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getDouble(r7, r1)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putDouble(r6, r1, r3)
            r5.setFieldPresent(r6, r8)
        L173:
            return
    }

    private java.lang.Object mutableMessageFieldForMerge(T r4, int r5) {
            r3 = this;
            com.google.crypto.tink.shaded.protobuf.Schema r0 = r3.getMessageFieldSchema(r5)
            int r1 = r3.typeAndOffsetAt(r5)
            long r1 = offset(r1)
            boolean r5 = r3.isFieldPresent(r4, r5)
            if (r5 != 0) goto L17
            java.lang.Object r4 = r0.newInstance()
            return r4
        L17:
            sun.misc.Unsafe r5 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            java.lang.Object r4 = r5.getObject(r4, r1)
            boolean r5 = isMutable(r4)
            if (r5 == 0) goto L24
            return r4
        L24:
            java.lang.Object r5 = r0.newInstance()
            if (r4 == 0) goto L2d
            r0.mergeFrom(r5, r4)
        L2d:
            return r5
    }

    private java.lang.Object mutableOneofMessageFieldForMerge(T r4, int r5, int r6) {
            r3 = this;
            com.google.crypto.tink.shaded.protobuf.Schema r0 = r3.getMessageFieldSchema(r6)
            boolean r5 = r3.isOneofPresent(r4, r5, r6)
            if (r5 != 0) goto Lf
            java.lang.Object r4 = r0.newInstance()
            return r4
        Lf:
            sun.misc.Unsafe r5 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            int r6 = r3.typeAndOffsetAt(r6)
            long r1 = offset(r6)
            java.lang.Object r4 = r5.getObject(r4, r1)
            boolean r5 = isMutable(r4)
            if (r5 == 0) goto L24
            return r4
        L24:
            java.lang.Object r5 = r0.newInstance()
            if (r4 == 0) goto L2d
            r0.mergeFrom(r5, r4)
        L2d:
            return r5
    }

    static <T> com.google.crypto.tink.shaded.protobuf.MessageSchema<T> newSchema(java.lang.Class<T> r6, com.google.crypto.tink.shaded.protobuf.MessageInfo r7, com.google.crypto.tink.shaded.protobuf.NewInstanceSchema r8, com.google.crypto.tink.shaded.protobuf.ListFieldSchema r9, com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r10, com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r11, com.google.crypto.tink.shaded.protobuf.MapFieldSchema r12) {
            boolean r6 = r7 instanceof com.google.crypto.tink.shaded.protobuf.RawMessageInfo
            if (r6 == 0) goto L11
            r0 = r7
            com.google.crypto.tink.shaded.protobuf.RawMessageInfo r0 = (com.google.crypto.tink.shaded.protobuf.RawMessageInfo) r0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            com.google.crypto.tink.shaded.protobuf.MessageSchema r6 = newSchemaForRawMessageInfo(r0, r1, r2, r3, r4, r5)
            return r6
        L11:
            r0 = r7
            com.google.crypto.tink.shaded.protobuf.StructuralMessageInfo r0 = (com.google.crypto.tink.shaded.protobuf.StructuralMessageInfo) r0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            com.google.crypto.tink.shaded.protobuf.MessageSchema r6 = newSchemaForMessageInfo(r0, r1, r2, r3, r4, r5)
            return r6
    }

    static <T> com.google.crypto.tink.shaded.protobuf.MessageSchema<T> newSchemaForMessageInfo(com.google.crypto.tink.shaded.protobuf.StructuralMessageInfo r20, com.google.crypto.tink.shaded.protobuf.NewInstanceSchema r21, com.google.crypto.tink.shaded.protobuf.ListFieldSchema r22, com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r23, com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r24, com.google.crypto.tink.shaded.protobuf.MapFieldSchema r25) {
            com.google.crypto.tink.shaded.protobuf.ProtoSyntax r0 = r20.getSyntax()
            com.google.crypto.tink.shaded.protobuf.ProtoSyntax r1 = com.google.crypto.tink.shaded.protobuf.ProtoSyntax.PROTO3
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lc
            r10 = r2
            goto Ld
        Lc:
            r10 = r3
        Ld:
            com.google.crypto.tink.shaded.protobuf.FieldInfo[] r0 = r20.getFields()
            int r1 = r0.length
            if (r1 != 0) goto L17
            r7 = r3
            r8 = r7
            goto L27
        L17:
            r1 = r0[r3]
            int r1 = r1.getFieldNumber()
            int r4 = r0.length
            int r4 = r4 - r2
            r2 = r0[r4]
            int r2 = r2.getFieldNumber()
            r7 = r1
            r8 = r2
        L27:
            int r1 = r0.length
            int r2 = r1 * 3
            int[] r5 = new int[r2]
            int r1 = r1 * 2
            java.lang.Object[] r6 = new java.lang.Object[r1]
            int r1 = r0.length
            r2 = r3
            r4 = r2
            r9 = r4
        L34:
            r11 = 49
            r12 = 18
            if (r2 >= r1) goto L60
            r13 = r0[r2]
            com.google.crypto.tink.shaded.protobuf.FieldType r14 = r13.getType()
            com.google.crypto.tink.shaded.protobuf.FieldType r15 = com.google.crypto.tink.shaded.protobuf.FieldType.MAP
            if (r14 != r15) goto L47
            int r4 = r4 + 1
            goto L5d
        L47:
            com.google.crypto.tink.shaded.protobuf.FieldType r14 = r13.getType()
            int r14 = r14.id()
            if (r14 < r12) goto L5d
            com.google.crypto.tink.shaded.protobuf.FieldType r12 = r13.getType()
            int r12 = r12.id()
            if (r12 > r11) goto L5d
            int r9 = r9 + 1
        L5d:
            int r2 = r2 + 1
            goto L34
        L60:
            r1 = 0
            if (r4 <= 0) goto L66
            int[] r2 = new int[r4]
            goto L67
        L66:
            r2 = r1
        L67:
            if (r9 <= 0) goto L6b
            int[] r1 = new int[r9]
        L6b:
            int[] r4 = r20.getCheckInitialized()
            if (r4 != 0) goto L73
            int[] r4 = com.google.crypto.tink.shaded.protobuf.MessageSchema.EMPTY_INT_ARRAY
        L73:
            r9 = r3
            r13 = r9
            r14 = r13
            r15 = r14
            r16 = r15
        L79:
            int r3 = r0.length
            if (r9 >= r3) goto Ld3
            r3 = r0[r9]
            int r11 = r3.getFieldNumber()
            storeFieldData(r3, r5, r13, r6)
            int r12 = r4.length
            if (r14 >= r12) goto L91
            r12 = r4[r14]
            if (r12 != r11) goto L91
            int r11 = r14 + 1
            r4[r14] = r13
            r14 = r11
        L91:
            com.google.crypto.tink.shaded.protobuf.FieldType r11 = r3.getType()
            com.google.crypto.tink.shaded.protobuf.FieldType r12 = com.google.crypto.tink.shaded.protobuf.FieldType.MAP
            if (r11 != r12) goto La1
            int r3 = r15 + 1
            r2[r15] = r13
            r15 = r3
        L9e:
            r18 = r13
            goto Lca
        La1:
            com.google.crypto.tink.shaded.protobuf.FieldType r11 = r3.getType()
            int r11 = r11.id()
            r12 = 18
            if (r11 < r12) goto L9e
            com.google.crypto.tink.shaded.protobuf.FieldType r11 = r3.getType()
            int r11 = r11.id()
            r12 = 49
            if (r11 > r12) goto L9e
            int r11 = r16 + 1
            java.lang.reflect.Field r3 = r3.getField()
            r18 = r13
            long r12 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.objectFieldOffset(r3)
            int r3 = (int) r12
            r1[r16] = r3
            r16 = r11
        Lca:
            int r9 = r9 + 1
            int r13 = r18 + 3
            r11 = 49
            r12 = 18
            goto L79
        Ld3:
            if (r2 != 0) goto Ld7
            int[] r2 = com.google.crypto.tink.shaded.protobuf.MessageSchema.EMPTY_INT_ARRAY
        Ld7:
            if (r1 != 0) goto Ldb
            int[] r1 = com.google.crypto.tink.shaded.protobuf.MessageSchema.EMPTY_INT_ARRAY
        Ldb:
            int r0 = r4.length
            int r3 = r2.length
            int r0 = r0 + r3
            int r3 = r1.length
            int r0 = r0 + r3
            int[] r12 = new int[r0]
            int r0 = r4.length
            r3 = 0
            java.lang.System.arraycopy(r4, r3, r12, r3, r0)
            int r0 = r4.length
            int r9 = r2.length
            java.lang.System.arraycopy(r2, r3, r12, r0, r9)
            int r0 = r4.length
            int r9 = r2.length
            int r0 = r0 + r9
            int r9 = r1.length
            java.lang.System.arraycopy(r1, r3, r12, r0, r9)
            com.google.crypto.tink.shaded.protobuf.MessageSchema r0 = new com.google.crypto.tink.shaded.protobuf.MessageSchema
            com.google.crypto.tink.shaded.protobuf.MessageLite r9 = r20.getDefaultInstance()
            int r13 = r4.length
            int r1 = r4.length
            int r2 = r2.length
            int r14 = r1 + r2
            r11 = 1
            r4 = r0
            r15 = r21
            r16 = r22
            r17 = r23
            r18 = r24
            r19 = r25
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
    }

    static <T> com.google.crypto.tink.shaded.protobuf.MessageSchema<T> newSchemaForRawMessageInfo(com.google.crypto.tink.shaded.protobuf.RawMessageInfo r33, com.google.crypto.tink.shaded.protobuf.NewInstanceSchema r34, com.google.crypto.tink.shaded.protobuf.ListFieldSchema r35, com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r36, com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r37, com.google.crypto.tink.shaded.protobuf.MapFieldSchema r38) {
            com.google.crypto.tink.shaded.protobuf.ProtoSyntax r0 = r33.getSyntax()
            com.google.crypto.tink.shaded.protobuf.ProtoSyntax r1 = com.google.crypto.tink.shaded.protobuf.ProtoSyntax.PROTO3
            r2 = 0
            if (r0 != r1) goto Lb
            r10 = 1
            goto Lc
        Lb:
            r10 = r2
        Lc:
            java.lang.String r0 = r33.getStringInfo()
            int r1 = r0.length()
            char r4 = r0.charAt(r2)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L28
            r4 = 1
        L1e:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L29
            r4 = r6
            goto L1e
        L28:
            r6 = 1
        L29:
            int r4 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L48
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L35:
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L45
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r8
            r6 = r6 | r4
            int r8 = r8 + 13
            r4 = r9
            goto L35
        L45:
            int r4 = r4 << r8
            r6 = r6 | r4
            r4 = r9
        L48:
            if (r6 != 0) goto L58
            int[] r6 = com.google.crypto.tink.shaded.protobuf.MessageSchema.EMPTY_INT_ARRAY
            r8 = r2
            r9 = r8
            r11 = r9
            r12 = r11
            r14 = r12
            r16 = r14
            r13 = r6
            r6 = r16
            goto L162
        L58:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L77
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L64:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L74
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r4 = r4 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L64
        L74:
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r9
        L77:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L96
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L83:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L93
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L83
        L93:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r11
        L96:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto Lb5
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        La2:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto Lb2
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto La2
        Lb2:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        Lb5:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto Ld4
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        Lc1:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto Ld1
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto Lc1
        Ld1:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        Ld4:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto Lf3
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        Le0:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto Lf0
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto Le0
        Lf0:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        Lf3:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L112
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        Lff:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L10f
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto Lff
        L10f:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L112:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L133
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L11e:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L12f
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L11e
        L12f:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L133:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L156
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L13f:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L151
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L13f
        L151:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L156:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 * 2
            int r16 = r16 + r6
            r6 = r4
            r4 = r15
        L162:
            sun.misc.Unsafe r15 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            java.lang.Object[] r17 = r33.getObjects()
            com.google.crypto.tink.shaded.protobuf.MessageLite r18 = r33.getDefaultInstance()
            java.lang.Class r2 = r18.getClass()
            int r7 = r11 * 3
            int[] r7 = new int[r7]
            int r11 = r11 * 2
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r20 = r14 + r12
            r22 = r14
            r23 = r20
            r12 = 0
            r21 = 0
        L181:
            if (r4 >= r1) goto L3b5
            int r24 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L1a9
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r3 = r24
            r24 = 13
        L191:
            int r26 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L1a3
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r4 = r4 | r3
            int r24 = r24 + 13
            r3 = r26
            goto L191
        L1a3:
            int r3 = r3 << r24
            r4 = r4 | r3
            r3 = r26
            goto L1ab
        L1a9:
            r3 = r24
        L1ab:
            int r24 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L1d8
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r5 = r24
            r24 = 13
        L1b9:
            int r27 = r5 + 1
            char r5 = r0.charAt(r5)
            r28 = r1
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r1) goto L1d2
            r1 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r24
            r3 = r3 | r1
            int r24 = r24 + 13
            r5 = r27
            r1 = r28
            goto L1b9
        L1d2:
            int r1 = r5 << r24
            r3 = r3 | r1
            r1 = r27
            goto L1dc
        L1d8:
            r28 = r1
            r1 = r24
        L1dc:
            r5 = r3 & 255(0xff, float:3.57E-43)
            r24 = r14
            r14 = r3 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L1e9
            int r14 = r12 + 1
            r13[r12] = r21
            r12 = r14
        L1e9:
            r14 = 51
            r30 = r12
            if (r5 < r14) goto L286
            int r14 = r1 + 1
            char r1 = r0.charAt(r1)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r12) goto L218
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r31 = 13
        L1fe:
            int r32 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r12) goto L213
            r12 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r31
            r1 = r1 | r12
            int r31 = r31 + 13
            r14 = r32
            r12 = 55296(0xd800, float:7.7486E-41)
            goto L1fe
        L213:
            int r12 = r14 << r31
            r1 = r1 | r12
            r14 = r32
        L218:
            int r12 = r5 + (-51)
            r31 = r14
            r14 = 9
            if (r12 == r14) goto L238
            r14 = 17
            if (r12 != r14) goto L225
            goto L238
        L225:
            r14 = 12
            if (r12 != r14) goto L246
            if (r10 != 0) goto L246
            int r12 = r21 / 3
            int r12 = r12 * 2
            r14 = 1
            int r12 = r12 + r14
            int r14 = r16 + 1
            r16 = r17[r16]
            r11[r12] = r16
            goto L244
        L238:
            int r12 = r21 / 3
            int r12 = r12 * 2
            r14 = 1
            int r12 = r12 + r14
            int r14 = r16 + 1
            r16 = r17[r16]
            r11[r12] = r16
        L244:
            r16 = r14
        L246:
            int r1 = r1 * 2
            r12 = r17[r1]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L251
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L259
        L251:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = reflectField(r2, r12)
            r17[r1] = r12
        L259:
            r14 = r8
            r32 = r9
            long r8 = r15.objectFieldOffset(r12)
            int r8 = (int) r8
            int r1 = r1 + 1
            r9 = r17[r1]
            boolean r12 = r9 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L26c
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L274
        L26c:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = reflectField(r2, r9)
            r17[r1] = r9
        L274:
            r1 = r8
            long r8 = r15.objectFieldOffset(r9)
            int r8 = (int) r8
            r29 = r0
            r9 = r8
            r0 = r10
            r27 = r31
            r25 = 1
            r8 = r1
            r1 = 0
            goto L37e
        L286:
            r14 = r8
            r32 = r9
            int r8 = r16 + 1
            r9 = r17[r16]
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = reflectField(r2, r9)
            r12 = 9
            if (r5 == r12) goto L2fe
            r12 = 17
            if (r5 != r12) goto L29c
            goto L2fe
        L29c:
            r12 = 27
            if (r5 == r12) goto L2ed
            r12 = 49
            if (r5 != r12) goto L2a5
            goto L2ed
        L2a5:
            r12 = 12
            if (r5 == r12) goto L2dc
            r12 = 30
            if (r5 == r12) goto L2dc
            r12 = 44
            if (r5 != r12) goto L2b2
            goto L2dc
        L2b2:
            r12 = 50
            if (r5 != r12) goto L2d2
            int r12 = r22 + 1
            r13[r22] = r21
            int r22 = r21 / 3
            int r22 = r22 * 2
            int r27 = r16 + 2
            r8 = r17[r8]
            r11[r22] = r8
            r8 = r3 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L2d5
            int r22 = r22 + 1
            int r8 = r16 + 3
            r16 = r17[r27]
            r11[r22] = r16
            r22 = r12
        L2d2:
            r25 = 1
            goto L30c
        L2d5:
            r22 = r12
            r12 = r27
            r25 = 1
            goto L30d
        L2dc:
            if (r10 != 0) goto L2d2
            int r12 = r21 / 3
            int r12 = r12 * 2
            r25 = 1
            int r12 = r12 + 1
            int r16 = r16 + 2
            r8 = r17[r8]
            r11[r12] = r8
            goto L2fb
        L2ed:
            r25 = 1
            int r12 = r21 / 3
            int r12 = r12 * 2
            int r12 = r12 + 1
            int r16 = r16 + 2
            r8 = r17[r8]
            r11[r12] = r8
        L2fb:
            r12 = r16
            goto L30d
        L2fe:
            r25 = 1
            int r12 = r21 / 3
            int r12 = r12 * 2
            int r12 = r12 + 1
            java.lang.Class r16 = r9.getType()
            r11[r12] = r16
        L30c:
            r12 = r8
        L30d:
            long r8 = r15.objectFieldOffset(r9)
            int r8 = (int) r8
            r9 = r3 & 4096(0x1000, float:5.74E-42)
            r16 = r12
            r12 = 4096(0x1000, float:5.74E-42)
            if (r9 != r12) goto L367
            r9 = 17
            if (r5 > r9) goto L367
            int r9 = r1 + 1
            char r1 = r0.charAt(r1)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r12) goto L343
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
        L32d:
            int r27 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r12) goto L33f
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r26
            r1 = r1 | r9
            int r26 = r26 + 13
            r9 = r27
            goto L32d
        L33f:
            int r9 = r9 << r26
            r1 = r1 | r9
            goto L345
        L343:
            r27 = r9
        L345:
            int r9 = r6 * 2
            int r26 = r1 / 32
            int r9 = r9 + r26
            r12 = r17[r9]
            r29 = r0
            boolean r0 = r12 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L356
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L35e
        L356:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = reflectField(r2, r12)
            r17[r9] = r12
        L35e:
            r0 = r10
            long r9 = r15.objectFieldOffset(r12)
            int r9 = (int) r9
            int r1 = r1 % 32
            goto L370
        L367:
            r29 = r0
            r0 = r10
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r27 = r1
            r1 = 0
        L370:
            r10 = 18
            if (r5 < r10) goto L37e
            r10 = 49
            if (r5 > r10) goto L37e
            int r10 = r23 + 1
            r13[r23] = r8
            r23 = r10
        L37e:
            int r10 = r21 + 1
            r7[r21] = r4
            int r4 = r21 + 2
            r12 = r3 & 512(0x200, float:7.17E-43)
            if (r12 == 0) goto L38b
            r12 = 536870912(0x20000000, float:1.0842022E-19)
            goto L38c
        L38b:
            r12 = 0
        L38c:
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L393
            r3 = 268435456(0x10000000, float:2.524355E-29)
            goto L394
        L393:
            r3 = 0
        L394:
            r3 = r3 | r12
            int r5 = r5 << 20
            r3 = r3 | r5
            r3 = r3 | r8
            r7[r10] = r3
            int r21 = r21 + 3
            int r1 = r1 << 20
            r1 = r1 | r9
            r7[r4] = r1
            r10 = r0
            r8 = r14
            r14 = r24
            r4 = r27
            r1 = r28
            r0 = r29
            r12 = r30
            r9 = r32
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L181
        L3b5:
            r32 = r9
            r0 = r10
            r24 = r14
            r14 = r8
            com.google.crypto.tink.shaded.protobuf.MessageSchema r1 = new com.google.crypto.tink.shaded.protobuf.MessageSchema
            com.google.crypto.tink.shaded.protobuf.MessageLite r9 = r33.getDefaultInstance()
            r2 = 0
            r4 = r1
            r5 = r7
            r6 = r11
            r7 = r14
            r8 = r32
            r11 = r2
            r12 = r13
            r13 = r24
            r14 = r20
            r15 = r34
            r16 = r35
            r17 = r36
            r18 = r37
            r19 = r38
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r1
    }

    private int numberAt(int r2) {
            r1 = this;
            int[] r0 = r1.buffer
            r2 = r0[r2]
            return r2
    }

    private static long offset(int r2) {
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r0
            long r0 = (long) r2
            return r0
    }

    private static <T> boolean oneofBooleanAt(T r0, long r1) {
            java.lang.Object r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    private static <T> double oneofDoubleAt(T r0, long r1) {
            java.lang.Object r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r0, r1)
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            return r0
    }

    private static <T> float oneofFloatAt(T r0, long r1) {
            java.lang.Object r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r0, r1)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            return r0
    }

    private static <T> int oneofIntAt(T r0, long r1) {
            java.lang.Object r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r0, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
    }

    private static <T> long oneofLongAt(T r0, long r1) {
            java.lang.Object r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r0, r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
    }

    private <K, V> int parseMapField(T r10, byte[] r11, int r12, int r13, int r14, long r15, com.google.crypto.tink.shaded.protobuf.ArrayDecoders.Registers r17) throws java.io.IOException {
            r9 = this;
            r7 = r9
            r0 = r10
            r1 = r15
            sun.misc.Unsafe r3 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            r4 = r14
            java.lang.Object r4 = r9.getMapFieldDefaultEntry(r14)
            java.lang.Object r5 = r3.getObject(r10, r1)
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r6 = r7.mapFieldSchema
            boolean r6 = r6.isImmutable(r5)
            if (r6 == 0) goto L25
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r6 = r7.mapFieldSchema
            java.lang.Object r6 = r6.newMapField(r4)
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r8 = r7.mapFieldSchema
            r8.mergeFrom(r6, r5)
            r3.putObject(r10, r1, r6)
            r5 = r6
        L25:
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r0 = r7.mapFieldSchema
            com.google.crypto.tink.shaded.protobuf.MapEntryLite$Metadata r4 = r0.forMapMetadata(r4)
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r0 = r7.mapFieldSchema
            java.util.Map r5 = r0.forMutableMapData(r5)
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r13
            r6 = r17
            int r0 = r0.decodeMapEntry(r1, r2, r3, r4, r5, r6)
            return r0
    }

    private int parseOneofField(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.crypto.tink.shaded.protobuf.ArrayDecoders.Registers r29) throws java.io.IOException {
            r16 = this;
            r0 = r16
            r1 = r17
            r4 = r18
            r5 = r19
            r2 = r21
            r9 = r22
            r3 = r23
            r6 = r26
            r10 = r28
            r8 = r29
            sun.misc.Unsafe r11 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            int[] r12 = r0.buffer
            int r13 = r10 + 2
            r12 = r12[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r12 & r13
            long r12 = (long) r12
            r14 = 5
            r15 = 2
            switch(r25) {
                case 51: goto L185;
                case 52: goto L172;
                case 53: goto L15f;
                case 54: goto L15f;
                case 55: goto L14c;
                case 56: goto L138;
                case 57: goto L125;
                case 58: goto L108;
                case 59: goto Ld4;
                case 60: goto Lb8;
                case 61: goto La8;
                case 62: goto L14c;
                case 63: goto L79;
                case 64: goto L125;
                case 65: goto L138;
                case 66: goto L61;
                case 67: goto L49;
                case 68: goto L28;
                default: goto L26;
            }
        L26:
            goto L199
        L28:
            r6 = 3
            if (r3 != r6) goto L199
            java.lang.Object r11 = r0.mutableOneofMessageFieldForMerge(r1, r9, r10)
            r2 = r2 & (-8)
            r7 = r2 | 4
            com.google.crypto.tink.shaded.protobuf.Schema r3 = r0.getMessageFieldSchema(r10)
            r2 = r11
            r4 = r18
            r5 = r19
            r6 = r20
            r8 = r29
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.mergeGroupField(r2, r3, r4, r5, r6, r7, r8)
            r0.storeOneofMessageField(r1, r9, r10, r11)
            goto L19a
        L49:
            if (r3 != 0) goto L199
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint64(r4, r5, r8)
            long r3 = r8.long1
            long r3 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.decodeZigZag64(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r11.putObject(r1, r6, r3)
            r11.putInt(r1, r12, r9)
            goto L19a
        L61:
            if (r3 != 0) goto L199
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32(r4, r5, r8)
            int r3 = r8.int1
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.decodeZigZag32(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r11.putObject(r1, r6, r3)
            r11.putInt(r1, r12, r9)
            goto L19a
        L79:
            if (r3 != 0) goto L199
            int r3 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32(r4, r5, r8)
            int r4 = r8.int1
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r5 = r0.getEnumFieldVerifier(r10)
            if (r5 == 0) goto L9b
            boolean r5 = r5.isInRange(r4)
            if (r5 == 0) goto L8e
            goto L9b
        L8e:
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1 = getMutableUnknownFields(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.storeField(r2, r4)
            goto La5
        L9b:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r11.putObject(r1, r6, r2)
            r11.putInt(r1, r12, r9)
        La5:
            r2 = r3
            goto L19a
        La8:
            if (r3 != r15) goto L199
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeBytes(r4, r5, r8)
            java.lang.Object r3 = r8.object1
            r11.putObject(r1, r6, r3)
            r11.putInt(r1, r12, r9)
            goto L19a
        Lb8:
            if (r3 != r15) goto L199
            java.lang.Object r11 = r0.mutableOneofMessageFieldForMerge(r1, r9, r10)
            com.google.crypto.tink.shaded.protobuf.Schema r3 = r0.getMessageFieldSchema(r10)
            r2 = r11
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r29
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.mergeMessageField(r2, r3, r4, r5, r6, r7)
            r0.storeOneofMessageField(r1, r9, r10, r11)
            goto L19a
        Ld4:
            if (r3 != r15) goto L199
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32(r4, r5, r8)
            int r3 = r8.int1
            if (r3 != 0) goto Le4
            java.lang.String r3 = ""
            r11.putObject(r1, r6, r3)
            goto L103
        Le4:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto Lf8
            int r5 = r2 + r3
            boolean r5 = com.google.crypto.tink.shaded.protobuf.Utf8.isValidUtf8(r4, r2, r5)
            if (r5 == 0) goto Lf3
            goto Lf8
        Lf3:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidUtf8()
            throw r1
        Lf8:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r8 = com.google.crypto.tink.shaded.protobuf.Internal.UTF_8
            r5.<init>(r4, r2, r3, r8)
            r11.putObject(r1, r6, r5)
            int r2 = r2 + r3
        L103:
            r11.putInt(r1, r12, r9)
            goto L19a
        L108:
            if (r3 != 0) goto L199
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint64(r4, r5, r8)
            long r3 = r8.long1
            r14 = 0
            int r3 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r3 == 0) goto L118
            r15 = 1
            goto L119
        L118:
            r15 = 0
        L119:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            r11.putObject(r1, r6, r3)
            r11.putInt(r1, r12, r9)
            goto L19a
        L125:
            if (r3 != r14) goto L199
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeFixed32(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r11.putObject(r1, r6, r2)
            int r2 = r5 + 4
            r11.putInt(r1, r12, r9)
            goto L19a
        L138:
            r2 = 1
            if (r3 != r2) goto L199
            long r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeFixed64(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r11.putObject(r1, r6, r2)
            int r2 = r5 + 8
            r11.putInt(r1, r12, r9)
            goto L19a
        L14c:
            if (r3 != 0) goto L199
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32(r4, r5, r8)
            int r3 = r8.int1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r11.putObject(r1, r6, r3)
            r11.putInt(r1, r12, r9)
            goto L19a
        L15f:
            if (r3 != 0) goto L199
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint64(r4, r5, r8)
            long r3 = r8.long1
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r11.putObject(r1, r6, r3)
            r11.putInt(r1, r12, r9)
            goto L19a
        L172:
            if (r3 != r14) goto L199
            float r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeFloat(r18, r19)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r11.putObject(r1, r6, r2)
            int r2 = r5 + 4
            r11.putInt(r1, r12, r9)
            goto L19a
        L185:
            r2 = 1
            if (r3 != r2) goto L199
            double r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeDouble(r18, r19)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r11.putObject(r1, r6, r2)
            int r2 = r5 + 8
            r11.putInt(r1, r12, r9)
            goto L19a
        L199:
            r2 = r5
        L19a:
            return r2
    }

    private int parseProto3Message(T r30, byte[] r31, int r32, int r33, com.google.crypto.tink.shaded.protobuf.ArrayDecoders.Registers r34) throws java.io.IOException {
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            checkMutable(r30)
            sun.misc.Unsafe r9 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            r16 = 0
            r8 = -1
            r0 = r32
            r1 = r8
            r2 = r16
            r6 = r2
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L1b:
            if (r0 >= r13) goto L32d
            int r3 = r0 + 1
            r0 = r12[r0]
            if (r0 >= 0) goto L2d
            int r0 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32(r0, r12, r3, r11)
            int r3 = r11.int1
            r4 = r0
            r17 = r3
            goto L30
        L2d:
            r17 = r0
            r4 = r3
        L30:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L3d
            int r2 = r2 / 3
            int r0 = r15.positionForFieldNumber(r5, r2)
            goto L41
        L3d:
            int r0 = r15.positionForFieldNumber(r5)
        L41:
            r2 = r0
            if (r2 != r8) goto L4f
            r2 = r4
            r18 = r5
            r27 = r8
            r28 = r9
            r19 = r16
            goto L309
        L4f:
            int[] r0 = r15.buffer
            int r1 = r2 + 1
            r1 = r0[r1]
            int r0 = type(r1)
            long r10 = offset(r1)
            r8 = 17
            r32 = r5
            if (r0 > r8) goto L20f
            int[] r8 = r15.buffer
            int r20 = r2 + 2
            r8 = r8[r20]
            int r20 = r8 >>> 20
            r5 = 1
            int r20 = r5 << r20
            r22 = r10
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r8 & r10
            if (r8 == r7) goto L87
            if (r7 == r10) goto L7f
            long r10 = (long) r7
            r9.putInt(r14, r10, r6)
            r10 = 1048575(0xfffff, float:1.469367E-39)
        L7f:
            if (r8 == r10) goto L86
            long r6 = (long) r8
            int r6 = r9.getInt(r14, r6)
        L86:
            r7 = r8
        L87:
            r8 = 5
            switch(r0) {
                case 0: goto L1ea;
                case 1: goto L1d3;
                case 2: goto L1b0;
                case 3: goto L1b0;
                case 4: goto L199;
                case 5: goto L17a;
                case 6: goto L163;
                case 7: goto L140;
                case 8: goto L11f;
                case 9: goto Lfb;
                case 10: goto Le3;
                case 11: goto L199;
                case 12: goto Ld0;
                case 13: goto L163;
                case 14: goto L17a;
                case 15: goto Lb9;
                case 16: goto L95;
                default: goto L8b;
            }
        L8b:
            r18 = r32
            r11 = r34
            r8 = r2
        L90:
            r10 = r4
            r32 = r6
            goto L204
        L95:
            if (r3 != 0) goto L8b
            r11 = r34
            r0 = r22
            int r8 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint64(r12, r4, r11)
            long r3 = r11.long1
            long r4 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.decodeZigZag64(r3)
            r0 = r9
            r1 = r30
            r17 = r8
            r8 = r2
            r2 = r22
            r18 = r32
            r0.putLong(r1, r2, r4)
            r6 = r6 | r20
            r2 = r8
            r0 = r17
            goto L253
        Lb9:
            r18 = r32
            r11 = r34
            r8 = r2
            if (r3 != 0) goto L90
            int r0 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32(r12, r4, r11)
            int r1 = r11.int1
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.decodeZigZag32(r1)
            r2 = r22
            r9.putInt(r14, r2, r1)
            goto L11b
        Ld0:
            r18 = r32
            r11 = r34
            r8 = r2
            r0 = r22
            if (r3 != 0) goto L90
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32(r12, r4, r11)
            int r3 = r11.int1
            r9.putInt(r14, r0, r3)
            goto Lf6
        Le3:
            r18 = r32
            r11 = r34
            r8 = r2
            r0 = r22
            r2 = 2
            if (r3 != r2) goto L90
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeBytes(r12, r4, r11)
            java.lang.Object r3 = r11.object1
            r9.putObject(r14, r0, r3)
        Lf6:
            r6 = r6 | r20
            r0 = r2
            goto L202
        Lfb:
            r18 = r32
            r11 = r34
            r8 = r2
            r2 = 2
            if (r3 != r2) goto L90
            java.lang.Object r5 = r15.mutableMessageFieldForMerge(r14, r8)
            com.google.crypto.tink.shaded.protobuf.Schema r1 = r15.getMessageFieldSchema(r8)
            r0 = r5
            r2 = r31
            r3 = r4
            r4 = r33
            r10 = r5
            r5 = r34
            int r0 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.mergeMessageField(r0, r1, r2, r3, r4, r5)
            r15.storeMessageField(r14, r8, r10)
        L11b:
            r6 = r6 | r20
            goto L202
        L11f:
            r18 = r32
            r11 = r34
            r8 = r2
            r32 = r6
            r5 = r22
            r0 = 2
            if (r3 != r0) goto L196
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r1
            if (r0 != 0) goto L135
            int r0 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeString(r12, r4, r11)
            goto L139
        L135:
            int r0 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeStringRequireUtf8(r12, r4, r11)
        L139:
            java.lang.Object r1 = r11.object1
            r9.putObject(r14, r5, r1)
            goto L200
        L140:
            r18 = r32
            r11 = r34
            r8 = r2
            r0 = r5
            r32 = r6
            r5 = r22
            if (r3 != 0) goto L196
            int r1 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint64(r12, r4, r11)
            long r2 = r11.long1
            r23 = 0
            int r2 = (r2 > r23 ? 1 : (r2 == r23 ? 0 : -1))
            if (r2 == 0) goto L159
            goto L15b
        L159:
            r0 = r16
        L15b:
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putBoolean(r14, r5, r0)
            r6 = r32 | r20
            r0 = r1
            goto L202
        L163:
            r18 = r32
            r11 = r34
            r32 = r6
            r0 = r8
            r5 = r22
            r8 = r2
            if (r3 != r0) goto L196
            int r0 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeFixed32(r12, r4)
            r9.putInt(r14, r5, r0)
            int r0 = r4 + 4
            goto L200
        L17a:
            r18 = r32
            r11 = r34
            r8 = r2
            r0 = r5
            r32 = r6
            r5 = r22
            if (r3 != r0) goto L196
            long r23 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeFixed64(r12, r4)
            r0 = r9
            r1 = r30
            r2 = r5
            r10 = r4
            r4 = r23
            r0.putLong(r1, r2, r4)
            goto L1fe
        L196:
            r10 = r4
            goto L204
        L199:
            r18 = r32
            r11 = r34
            r8 = r2
            r10 = r4
            r32 = r6
            r5 = r22
            if (r3 != 0) goto L204
            int r0 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32(r12, r10, r11)
            int r1 = r11.int1
            r9.putInt(r14, r5, r1)
            goto L200
        L1b0:
            r18 = r32
            r11 = r34
            r8 = r2
            r10 = r4
            r32 = r6
            r5 = r22
            if (r3 != 0) goto L204
            int r10 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint64(r12, r10, r11)
            long r2 = r11.long1
            r0 = r9
            r1 = r30
            r23 = r2
            r2 = r5
            r4 = r23
            r0.putLong(r1, r2, r4)
            r6 = r32 | r20
            r2 = r8
            r0 = r10
            goto L253
        L1d3:
            r18 = r32
            r11 = r34
            r10 = r4
            r32 = r6
            r0 = r8
            r5 = r22
            r8 = r2
            if (r3 != r0) goto L204
            float r0 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeFloat(r12, r10)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putFloat(r14, r5, r0)
            int r0 = r10 + 4
            goto L200
        L1ea:
            r18 = r32
            r11 = r34
            r8 = r2
            r10 = r4
            r0 = r5
            r32 = r6
            r5 = r22
            if (r3 != r0) goto L204
            double r0 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeDouble(r12, r10)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putDouble(r14, r5, r0)
        L1fe:
            int r0 = r10 + 8
        L200:
            r6 = r32 | r20
        L202:
            r2 = r8
            goto L253
        L204:
            r6 = r32
            r19 = r8
            r28 = r9
            r2 = r10
            r27 = -1
            goto L309
        L20f:
            r18 = r32
            r8 = r2
            r20 = r6
            r5 = r10
            r11 = r34
            r10 = r4
            r2 = 27
            if (r0 != r2) goto L265
            r2 = 2
            if (r3 != r2) goto L258
            java.lang.Object r0 = r9.getObject(r14, r5)
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r0 = (com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList) r0
            boolean r1 = r0.isModifiable()
            if (r1 != 0) goto L23d
            int r1 = r0.size()
            if (r1 != 0) goto L234
            r1 = 10
            goto L236
        L234:
            int r1 = r1 * 2
        L236:
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r0 = r0.mutableCopyWithCapacity(r1)
            r9.putObject(r14, r5, r0)
        L23d:
            r5 = r0
            com.google.crypto.tink.shaded.protobuf.Schema r0 = r15.getMessageFieldSchema(r8)
            r1 = r17
            r2 = r31
            r3 = r10
            r4 = r33
            r10 = r20
            r6 = r34
            int r0 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeMessageList(r0, r1, r2, r3, r4, r5, r6)
            r2 = r8
            r6 = r10
        L253:
            r1 = r18
            r8 = -1
            goto L1b
        L258:
            r22 = r7
            r19 = r8
            r28 = r9
            r15 = r10
            r26 = r20
            r27 = -1
            goto L2e4
        L265:
            r4 = r20
            r2 = 49
            if (r0 > r2) goto L2b2
            long r1 = (long) r1
            r32 = r0
            r0 = r29
            r20 = r1
            r1 = r30
            r2 = r31
            r23 = r3
            r3 = r10
            r15 = r4
            r4 = r33
            r24 = r5
            r5 = r17
            r6 = r18
            r26 = r15
            r15 = r7
            r7 = r23
            r19 = r8
            r27 = -1
            r28 = r9
            r22 = r15
            r15 = r10
            r9 = r20
            r11 = r32
            r12 = r24
            r14 = r34
            int r0 = r0.parseRepeatedField(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L307
        L29e:
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r1 = r18
            r2 = r19
            r7 = r22
            r6 = r26
            goto L327
        L2b2:
            r32 = r0
            r23 = r3
            r26 = r4
            r24 = r5
            r22 = r7
            r19 = r8
            r28 = r9
            r15 = r10
            r27 = -1
            r0 = 50
            r9 = r32
            if (r9 != r0) goto L2ea
            r7 = r23
            r0 = 2
            if (r7 != r0) goto L2e4
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r19
            r6 = r24
            r8 = r34
            int r0 = r0.parseMapField(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L307
            goto L29e
        L2e4:
            r2 = r15
        L2e5:
            r7 = r22
            r6 = r26
            goto L309
        L2ea:
            r7 = r23
            r0 = r29
            r8 = r1
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r17
            r6 = r18
            r10 = r24
            r12 = r19
            r13 = r34
            int r0 = r0.parseOneofField(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L307
            goto L29e
        L307:
            r2 = r0
            goto L2e5
        L309:
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r4 = getMutableUnknownFields(r30)
            r0 = r17
            r1 = r31
            r3 = r33
            r5 = r34
            int r0 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeUnknownField(r0, r1, r2, r3, r4, r5)
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r1 = r18
            r2 = r19
        L327:
            r8 = r27
            r9 = r28
            goto L1b
        L32d:
            r26 = r6
            r28 = r9
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 == r1) goto L340
            long r1 = (long) r7
            r3 = r30
            r6 = r26
            r4 = r28
            r4.putInt(r3, r1, r6)
        L340:
            r1 = r33
            if (r0 != r1) goto L345
            return r0
        L345:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r0
    }

    private int parseRepeatedField(T r14, byte[] r15, int r16, int r17, int r18, int r19, int r20, int r21, long r22, int r24, long r25, com.google.crypto.tink.shaded.protobuf.ArrayDecoders.Registers r27) throws java.io.IOException {
            r13 = this;
            r0 = r13
            r1 = r14
            r3 = r15
            r4 = r16
            r2 = r20
            r8 = r21
            r5 = r25
            r7 = r27
            sun.misc.Unsafe r9 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            java.lang.Object r10 = r9.getObject(r14, r5)
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r10 = (com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList) r10
            boolean r11 = r10.isModifiable()
            r12 = 2
            if (r11 != 0) goto L2d
            int r11 = r10.size()
            if (r11 != 0) goto L25
            r11 = 10
            goto L26
        L25:
            int r11 = r11 * r12
        L26:
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r10 = r10.mutableCopyWithCapacity(r11)
            r9.putObject(r14, r5, r10)
        L2d:
            r5 = 5
            r6 = 1
            switch(r24) {
                case 18: goto L1a3;
                case 19: goto L18b;
                case 20: goto L173;
                case 21: goto L173;
                case 22: goto L15a;
                case 23: goto L140;
                case 24: goto L126;
                case 25: goto L10c;
                case 26: goto Ldf;
                case 27: goto Lc5;
                case 28: goto Lb3;
                case 29: goto L15a;
                case 30: goto L83;
                case 31: goto L126;
                case 32: goto L140;
                case 33: goto L69;
                case 34: goto L4f;
                case 35: goto L1a3;
                case 36: goto L18b;
                case 37: goto L173;
                case 38: goto L173;
                case 39: goto L15a;
                case 40: goto L140;
                case 41: goto L126;
                case 42: goto L10c;
                case 43: goto L15a;
                case 44: goto L83;
                case 45: goto L126;
                case 46: goto L140;
                case 47: goto L69;
                case 48: goto L4f;
                case 49: goto L34;
                default: goto L32;
            }
        L32:
            goto L1bb
        L34:
            r1 = 3
            if (r2 != r1) goto L1bb
            com.google.crypto.tink.shaded.protobuf.Schema r1 = r13.getMessageFieldSchema(r8)
            r19 = r1
            r20 = r18
            r21 = r15
            r22 = r16
            r23 = r17
            r24 = r10
            r25 = r27
            int r1 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeGroupList(r19, r20, r21, r22, r23, r24, r25)
            goto L1bc
        L4f:
            if (r2 != r12) goto L57
            int r1 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodePackedSInt64List(r15, r4, r10, r7)
            goto L1bc
        L57:
            if (r2 != 0) goto L1bb
            r19 = r15
            r20 = r16
            r21 = r17
            r22 = r10
            r23 = r27
            int r1 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeSInt64List(r18, r19, r20, r21, r22, r23)
            goto L1bc
        L69:
            if (r2 != r12) goto L71
            int r1 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodePackedSInt32List(r15, r4, r10, r7)
            goto L1bc
        L71:
            if (r2 != 0) goto L1bb
            r19 = r15
            r20 = r16
            r21 = r17
            r22 = r10
            r23 = r27
            int r1 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeSInt32List(r18, r19, r20, r21, r22, r23)
            goto L1bc
        L83:
            if (r2 != r12) goto L8a
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodePackedVarint32List(r15, r4, r10, r7)
            goto L9a
        L8a:
            if (r2 != 0) goto L1bb
            r2 = r18
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r10
            r7 = r27
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32List(r2, r3, r4, r5, r6, r7)
        L9a:
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r3 = r13.getEnumFieldVerifier(r8)
            r4 = 0
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r5 = r0.unknownFieldSchema
            r20 = r14
            r21 = r19
            r22 = r10
            r23 = r3
            r24 = r4
            r25 = r5
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.filterUnknownEnumList(r20, r21, r22, r23, r24, r25)
            r1 = r2
            goto L1bc
        Lb3:
            if (r2 != r12) goto L1bb
            r19 = r15
            r20 = r16
            r21 = r17
            r22 = r10
            r23 = r27
            int r1 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeBytesList(r18, r19, r20, r21, r22, r23)
            goto L1bc
        Lc5:
            if (r2 != r12) goto L1bb
            com.google.crypto.tink.shaded.protobuf.Schema r1 = r13.getMessageFieldSchema(r8)
            r19 = r1
            r20 = r18
            r21 = r15
            r22 = r16
            r23 = r17
            r24 = r10
            r25 = r27
            int r1 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeMessageList(r19, r20, r21, r22, r23, r24, r25)
            goto L1bc
        Ldf:
            if (r2 != r12) goto L1bb
            r1 = 536870912(0x20000000, double:2.65249474E-315)
            long r1 = r22 & r1
            r5 = 0
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto Lfc
            r19 = r15
            r20 = r16
            r21 = r17
            r22 = r10
            r23 = r27
            int r1 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeStringList(r18, r19, r20, r21, r22, r23)
            goto L1bc
        Lfc:
            r19 = r15
            r20 = r16
            r21 = r17
            r22 = r10
            r23 = r27
            int r1 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeStringListRequireUtf8(r18, r19, r20, r21, r22, r23)
            goto L1bc
        L10c:
            if (r2 != r12) goto L114
            int r1 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodePackedBoolList(r15, r4, r10, r7)
            goto L1bc
        L114:
            if (r2 != 0) goto L1bb
            r19 = r15
            r20 = r16
            r21 = r17
            r22 = r10
            r23 = r27
            int r1 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeBoolList(r18, r19, r20, r21, r22, r23)
            goto L1bc
        L126:
            if (r2 != r12) goto L12e
            int r1 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodePackedFixed32List(r15, r4, r10, r7)
            goto L1bc
        L12e:
            if (r2 != r5) goto L1bb
            r19 = r15
            r20 = r16
            r21 = r17
            r22 = r10
            r23 = r27
            int r1 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeFixed32List(r18, r19, r20, r21, r22, r23)
            goto L1bc
        L140:
            if (r2 != r12) goto L148
            int r1 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodePackedFixed64List(r15, r4, r10, r7)
            goto L1bc
        L148:
            if (r2 != r6) goto L1bb
            r19 = r15
            r20 = r16
            r21 = r17
            r22 = r10
            r23 = r27
            int r1 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeFixed64List(r18, r19, r20, r21, r22, r23)
            goto L1bc
        L15a:
            if (r2 != r12) goto L162
            int r1 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodePackedVarint32List(r15, r4, r10, r7)
            goto L1bc
        L162:
            if (r2 != 0) goto L1bb
            r19 = r15
            r20 = r16
            r21 = r17
            r22 = r10
            r23 = r27
            int r1 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32List(r18, r19, r20, r21, r22, r23)
            goto L1bc
        L173:
            if (r2 != r12) goto L17a
            int r1 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodePackedVarint64List(r15, r4, r10, r7)
            goto L1bc
        L17a:
            if (r2 != 0) goto L1bb
            r19 = r15
            r20 = r16
            r21 = r17
            r22 = r10
            r23 = r27
            int r1 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint64List(r18, r19, r20, r21, r22, r23)
            goto L1bc
        L18b:
            if (r2 != r12) goto L192
            int r1 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodePackedFloatList(r15, r4, r10, r7)
            goto L1bc
        L192:
            if (r2 != r5) goto L1bb
            r19 = r15
            r20 = r16
            r21 = r17
            r22 = r10
            r23 = r27
            int r1 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeFloatList(r18, r19, r20, r21, r22, r23)
            goto L1bc
        L1a3:
            if (r2 != r12) goto L1aa
            int r1 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodePackedDoubleList(r15, r4, r10, r7)
            goto L1bc
        L1aa:
            if (r2 != r6) goto L1bb
            r19 = r15
            r20 = r16
            r21 = r17
            r22 = r10
            r23 = r27
            int r1 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeDoubleList(r18, r19, r20, r21, r22, r23)
            goto L1bc
        L1bb:
            r1 = r4
        L1bc:
            return r1
    }

    private int positionForFieldNumber(int r2) {
            r1 = this;
            int r0 = r1.minFieldNumber
            if (r2 < r0) goto Le
            int r0 = r1.maxFieldNumber
            if (r2 > r0) goto Le
            r0 = 0
            int r2 = r1.slowPositionForFieldNumber(r2, r0)
            return r2
        Le:
            r2 = -1
            return r2
    }

    private int positionForFieldNumber(int r2, int r3) {
            r1 = this;
            int r0 = r1.minFieldNumber
            if (r2 < r0) goto Ld
            int r0 = r1.maxFieldNumber
            if (r2 > r0) goto Ld
            int r2 = r1.slowPositionForFieldNumber(r2, r3)
            return r2
        Ld:
            r2 = -1
            return r2
    }

    private int presenceMaskAndOffsetAt(int r2) {
            r1 = this;
            int[] r0 = r1.buffer
            int r2 = r2 + 2
            r2 = r0[r2]
            return r2
    }

    private <E> void readGroupList(java.lang.Object r2, long r3, com.google.crypto.tink.shaded.protobuf.Reader r5, com.google.crypto.tink.shaded.protobuf.Schema<E> r6, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r7) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r0 = r1.listFieldSchema
            java.util.List r2 = r0.mutableListAt(r2, r3)
            r5.readGroupList(r2, r6, r7)
            return
    }

    private <E> void readMessageList(java.lang.Object r3, int r4, com.google.crypto.tink.shaded.protobuf.Reader r5, com.google.crypto.tink.shaded.protobuf.Schema<E> r6, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r7) throws java.io.IOException {
            r2 = this;
            long r0 = offset(r4)
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r4 = r2.listFieldSchema
            java.util.List r3 = r4.mutableListAt(r3, r0)
            r5.readMessageList(r3, r6, r7)
            return
    }

    private void readString(java.lang.Object r3, int r4, com.google.crypto.tink.shaded.protobuf.Reader r5) throws java.io.IOException {
            r2 = this;
            boolean r0 = isEnforceUtf8(r4)
            if (r0 == 0) goto L12
            long r0 = offset(r4)
            java.lang.String r4 = r5.readStringRequireUtf8()
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r3, r0, r4)
            goto L2d
        L12:
            boolean r0 = r2.lite
            if (r0 == 0) goto L22
            long r0 = offset(r4)
            java.lang.String r4 = r5.readString()
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r3, r0, r4)
            goto L2d
        L22:
            long r0 = offset(r4)
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = r5.readBytes()
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r3, r0, r4)
        L2d:
            return
    }

    private void readStringList(java.lang.Object r4, int r5, com.google.crypto.tink.shaded.protobuf.Reader r6) throws java.io.IOException {
            r3 = this;
            boolean r0 = isEnforceUtf8(r5)
            if (r0 == 0) goto L14
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r0 = r3.listFieldSchema
            long r1 = offset(r5)
            java.util.List r4 = r0.mutableListAt(r4, r1)
            r6.readStringListRequireUtf8(r4)
            goto L21
        L14:
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r0 = r3.listFieldSchema
            long r1 = offset(r5)
            java.util.List r4 = r0.mutableListAt(r4, r1)
            r6.readStringList(r4)
        L21:
            return
    }

    private static java.lang.reflect.Field reflectField(java.lang.Class<?> r5, java.lang.String r6) {
            java.lang.reflect.Field r5 = r5.getDeclaredField(r6)     // Catch: java.lang.NoSuchFieldException -> L5
            return r5
        L5:
            java.lang.reflect.Field[] r0 = r5.getDeclaredFields()
            int r1 = r0.length
            r2 = 0
        Lb:
            if (r2 >= r1) goto L1d
            r3 = r0[r2]
            java.lang.String r4 = r3.getName()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L1a
            return r3
        L1a:
            int r2 = r2 + 1
            goto Lb
        L1d:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Field "
            r2.<init>(r3)
            java.lang.StringBuilder r6 = r2.append(r6)
            java.lang.String r2 = " for "
            java.lang.StringBuilder r6 = r6.append(r2)
            java.lang.String r5 = r5.getName()
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.String r6 = " not found. Known fields are "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = java.util.Arrays.toString(r0)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5)
            throw r1
    }

    private void setFieldPresent(T r5, int r6) {
            r4 = this;
            int r6 = r4.presenceMaskAndOffsetAt(r6)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r6
            long r0 = (long) r0
            r2 = 1048575(0xfffff, double:5.18065E-318)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L11
            return
        L11:
            int r6 = r6 >>> 20
            r2 = 1
            int r6 = r2 << r6
            int r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r5, r0)
            r6 = r6 | r2
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putInt(r5, r0, r6)
            return
    }

    private void setOneofPresent(T r3, int r4, int r5) {
            r2 = this;
            int r5 = r2.presenceMaskAndOffsetAt(r5)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r0
            long r0 = (long) r5
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putInt(r3, r0, r4)
            return
    }

    private int slowPositionForFieldNumber(int r5, int r6) {
            r4 = this;
            int[] r0 = r4.buffer
            int r0 = r0.length
            int r0 = r0 / 3
            int r0 = r0 + (-1)
        L7:
            if (r6 > r0) goto L20
            int r1 = r0 + r6
            int r1 = r1 >>> 1
            int r2 = r1 * 3
            int r3 = r4.numberAt(r2)
            if (r5 != r3) goto L16
            return r2
        L16:
            if (r5 >= r3) goto L1c
            int r1 = r1 + (-1)
            r0 = r1
            goto L7
        L1c:
            int r1 = r1 + 1
            r6 = r1
            goto L7
        L20:
            r5 = -1
            return r5
    }

    private static void storeFieldData(com.google.crypto.tink.shaded.protobuf.FieldInfo r8, int[] r9, int r10, java.lang.Object[] r11) {
            com.google.crypto.tink.shaded.protobuf.OneofInfo r0 = r8.getOneof()
            r1 = 0
            if (r0 == 0) goto L25
            com.google.crypto.tink.shaded.protobuf.FieldType r2 = r8.getType()
            int r2 = r2.id()
            int r2 = r2 + 51
            java.lang.reflect.Field r3 = r0.getValueField()
            long r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.objectFieldOffset(r3)
            int r3 = (int) r3
            java.lang.reflect.Field r0 = r0.getCaseField()
            long r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.objectFieldOffset(r0)
        L22:
            int r0 = (int) r4
            r4 = r1
            goto L6c
        L25:
            com.google.crypto.tink.shaded.protobuf.FieldType r0 = r8.getType()
            java.lang.reflect.Field r2 = r8.getField()
            long r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.objectFieldOffset(r2)
            int r3 = (int) r2
            int r2 = r0.id()
            boolean r4 = r0.isList()
            if (r4 != 0) goto L5a
            boolean r0 = r0.isMap()
            if (r0 != 0) goto L5a
            java.lang.reflect.Field r0 = r8.getPresenceField()
            if (r0 != 0) goto L4c
            r0 = 1048575(0xfffff, float:1.469367E-39)
            goto L51
        L4c:
            long r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.objectFieldOffset(r0)
            int r0 = (int) r4
        L51:
            int r4 = r8.getPresenceMask()
            int r4 = java.lang.Integer.numberOfTrailingZeros(r4)
            goto L6c
        L5a:
            java.lang.reflect.Field r0 = r8.getCachedSizeField()
            if (r0 != 0) goto L63
            r0 = r1
            r4 = r0
            goto L6c
        L63:
            java.lang.reflect.Field r0 = r8.getCachedSizeField()
            long r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.objectFieldOffset(r0)
            goto L22
        L6c:
            int r5 = r8.getFieldNumber()
            r9[r10] = r5
            int r5 = r10 + 1
            boolean r6 = r8.isEnforceUtf8()
            if (r6 == 0) goto L7d
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            goto L7e
        L7d:
            r6 = r1
        L7e:
            boolean r7 = r8.isRequired()
            if (r7 == 0) goto L86
            r1 = 268435456(0x10000000, float:2.524355E-29)
        L86:
            r1 = r1 | r6
            int r2 = r2 << 20
            r1 = r1 | r2
            r1 = r1 | r3
            r9[r5] = r1
            int r1 = r10 + 2
            int r2 = r4 << 20
            r0 = r0 | r2
            r9[r1] = r0
            java.lang.Class r9 = r8.getMessageFieldClass()
            java.lang.Object r0 = r8.getMapDefaultEntry()
            if (r0 == 0) goto Lbe
            int r10 = r10 / 3
            int r10 = r10 * 2
            java.lang.Object r0 = r8.getMapDefaultEntry()
            r11[r10] = r0
            if (r9 == 0) goto Laf
            int r10 = r10 + 1
            r11[r10] = r9
            goto Ldb
        Laf:
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r9 = r8.getEnumVerifier()
            if (r9 == 0) goto Ldb
            int r10 = r10 + 1
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r8 = r8.getEnumVerifier()
            r11[r10] = r8
            goto Ldb
        Lbe:
            if (r9 == 0) goto Lc9
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            r11[r10] = r9
            goto Ldb
        Lc9:
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r9 = r8.getEnumVerifier()
            if (r9 == 0) goto Ldb
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r8 = r8.getEnumVerifier()
            r11[r10] = r8
        Ldb:
            return
    }

    private void storeMessageField(T r4, int r5, java.lang.Object r6) {
            r3 = this;
            sun.misc.Unsafe r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            int r1 = r3.typeAndOffsetAt(r5)
            long r1 = offset(r1)
            r0.putObject(r4, r1, r6)
            r3.setFieldPresent(r4, r5)
            return
    }

    private void storeOneofMessageField(T r4, int r5, int r6, java.lang.Object r7) {
            r3 = this;
            sun.misc.Unsafe r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            int r1 = r3.typeAndOffsetAt(r6)
            long r1 = offset(r1)
            r0.putObject(r4, r1, r7)
            r3.setOneofPresent(r4, r5, r6)
            return
    }

    private static int type(int r1) {
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r1 = r1 & r0
            int r1 = r1 >>> 20
            return r1
    }

    private int typeAndOffsetAt(int r2) {
            r1 = this;
            int[] r0 = r1.buffer
            int r2 = r2 + 1
            r2 = r0[r2]
            return r2
    }

    private void writeFieldsInAscendingOrderProto2(T r18, com.google.crypto.tink.shaded.protobuf.Writer r19) throws java.io.IOException {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.hasExtensions
            if (r3 == 0) goto L21
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r3 = r0.extensionSchema
            com.google.crypto.tink.shaded.protobuf.FieldSet r3 = r3.getExtensions(r1)
            boolean r5 = r3.isEmpty()
            if (r5 != 0) goto L21
            java.util.Iterator r3 = r3.iterator()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L23
        L21:
            r3 = 0
            r5 = 0
        L23:
            int[] r6 = r0.buffer
            int r6 = r6.length
            sun.misc.Unsafe r7 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r11 = r8
            r10 = 0
            r12 = 0
        L2e:
            if (r10 >= r6) goto L48d
            int r13 = r0.typeAndOffsetAt(r10)
            int r14 = r0.numberAt(r10)
            int r15 = type(r13)
            r4 = 17
            if (r15 > r4) goto L56
            int[] r4 = r0.buffer
            int r16 = r10 + 2
            r4 = r4[r16]
            r9 = r4 & r8
            if (r9 == r11) goto L50
            long r11 = (long) r9
            int r12 = r7.getInt(r1, r11)
            r11 = r9
        L50:
            int r4 = r4 >>> 20
            r9 = 1
            int r4 = r9 << r4
            goto L57
        L56:
            r4 = 0
        L57:
            if (r5 == 0) goto L75
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r9 = r0.extensionSchema
            int r9 = r9.extensionNumber(r5)
            if (r9 > r14) goto L75
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r9 = r0.extensionSchema
            r9.serializeExtension(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L73
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L57
        L73:
            r5 = 0
            goto L57
        L75:
            long r8 = offset(r13)
            switch(r15) {
                case 0: goto L47b;
                case 1: goto L46f;
                case 2: goto L463;
                case 3: goto L457;
                case 4: goto L44b;
                case 5: goto L43f;
                case 6: goto L433;
                case 7: goto L427;
                case 8: goto L41b;
                case 9: goto L40a;
                case 10: goto L3fb;
                case 11: goto L3ee;
                case 12: goto L3e1;
                case 13: goto L3d4;
                case 14: goto L3c7;
                case 15: goto L3ba;
                case 16: goto L3ad;
                case 17: goto L39c;
                case 18: goto L38c;
                case 19: goto L37c;
                case 20: goto L36c;
                case 21: goto L35c;
                case 22: goto L34c;
                case 23: goto L33c;
                case 24: goto L32c;
                case 25: goto L31c;
                case 26: goto L30d;
                case 27: goto L2fa;
                case 28: goto L2eb;
                case 29: goto L2db;
                case 30: goto L2cb;
                case 31: goto L2bb;
                case 32: goto L2ab;
                case 33: goto L29b;
                case 34: goto L28b;
                case 35: goto L27b;
                case 36: goto L26b;
                case 37: goto L25b;
                case 38: goto L24b;
                case 39: goto L23b;
                case 40: goto L22b;
                case 41: goto L21b;
                case 42: goto L20b;
                case 43: goto L1fb;
                case 44: goto L1eb;
                case 45: goto L1db;
                case 46: goto L1cb;
                case 47: goto L1bb;
                case 48: goto L1ab;
                case 49: goto L198;
                case 50: goto L18f;
                case 51: goto L180;
                case 52: goto L171;
                case 53: goto L162;
                case 54: goto L153;
                case 55: goto L144;
                case 56: goto L135;
                case 57: goto L126;
                case 58: goto L117;
                case 59: goto L108;
                case 60: goto Lf5;
                case 61: goto Le5;
                case 62: goto Ld7;
                case 63: goto Lc9;
                case 64: goto Lbb;
                case 65: goto Lad;
                case 66: goto L9f;
                case 67: goto L91;
                case 68: goto L7f;
                default: goto L7c;
            }
        L7c:
            r13 = 0
            goto L486
        L7f:
            boolean r4 = r0.isOneofPresent(r1, r14, r10)
            if (r4 == 0) goto L7c
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.crypto.tink.shaded.protobuf.Schema r8 = r0.getMessageFieldSchema(r10)
            r2.writeGroup(r14, r4, r8)
            goto L7c
        L91:
            boolean r4 = r0.isOneofPresent(r1, r14, r10)
            if (r4 == 0) goto L7c
            long r8 = oneofLongAt(r1, r8)
            r2.writeSInt64(r14, r8)
            goto L7c
        L9f:
            boolean r4 = r0.isOneofPresent(r1, r14, r10)
            if (r4 == 0) goto L7c
            int r4 = oneofIntAt(r1, r8)
            r2.writeSInt32(r14, r4)
            goto L7c
        Lad:
            boolean r4 = r0.isOneofPresent(r1, r14, r10)
            if (r4 == 0) goto L7c
            long r8 = oneofLongAt(r1, r8)
            r2.writeSFixed64(r14, r8)
            goto L7c
        Lbb:
            boolean r4 = r0.isOneofPresent(r1, r14, r10)
            if (r4 == 0) goto L7c
            int r4 = oneofIntAt(r1, r8)
            r2.writeSFixed32(r14, r4)
            goto L7c
        Lc9:
            boolean r4 = r0.isOneofPresent(r1, r14, r10)
            if (r4 == 0) goto L7c
            int r4 = oneofIntAt(r1, r8)
            r2.writeEnum(r14, r4)
            goto L7c
        Ld7:
            boolean r4 = r0.isOneofPresent(r1, r14, r10)
            if (r4 == 0) goto L7c
            int r4 = oneofIntAt(r1, r8)
            r2.writeUInt32(r14, r4)
            goto L7c
        Le5:
            boolean r4 = r0.isOneofPresent(r1, r14, r10)
            if (r4 == 0) goto L7c
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = (com.google.crypto.tink.shaded.protobuf.ByteString) r4
            r2.writeBytes(r14, r4)
            goto L7c
        Lf5:
            boolean r4 = r0.isOneofPresent(r1, r14, r10)
            if (r4 == 0) goto L7c
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.crypto.tink.shaded.protobuf.Schema r8 = r0.getMessageFieldSchema(r10)
            r2.writeMessage(r14, r4, r8)
            goto L7c
        L108:
            boolean r4 = r0.isOneofPresent(r1, r14, r10)
            if (r4 == 0) goto L7c
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.writeString(r14, r4, r2)
            goto L7c
        L117:
            boolean r4 = r0.isOneofPresent(r1, r14, r10)
            if (r4 == 0) goto L7c
            boolean r4 = oneofBooleanAt(r1, r8)
            r2.writeBool(r14, r4)
            goto L7c
        L126:
            boolean r4 = r0.isOneofPresent(r1, r14, r10)
            if (r4 == 0) goto L7c
            int r4 = oneofIntAt(r1, r8)
            r2.writeFixed32(r14, r4)
            goto L7c
        L135:
            boolean r4 = r0.isOneofPresent(r1, r14, r10)
            if (r4 == 0) goto L7c
            long r8 = oneofLongAt(r1, r8)
            r2.writeFixed64(r14, r8)
            goto L7c
        L144:
            boolean r4 = r0.isOneofPresent(r1, r14, r10)
            if (r4 == 0) goto L7c
            int r4 = oneofIntAt(r1, r8)
            r2.writeInt32(r14, r4)
            goto L7c
        L153:
            boolean r4 = r0.isOneofPresent(r1, r14, r10)
            if (r4 == 0) goto L7c
            long r8 = oneofLongAt(r1, r8)
            r2.writeUInt64(r14, r8)
            goto L7c
        L162:
            boolean r4 = r0.isOneofPresent(r1, r14, r10)
            if (r4 == 0) goto L7c
            long r8 = oneofLongAt(r1, r8)
            r2.writeInt64(r14, r8)
            goto L7c
        L171:
            boolean r4 = r0.isOneofPresent(r1, r14, r10)
            if (r4 == 0) goto L7c
            float r4 = oneofFloatAt(r1, r8)
            r2.writeFloat(r14, r4)
            goto L7c
        L180:
            boolean r4 = r0.isOneofPresent(r1, r14, r10)
            if (r4 == 0) goto L7c
            double r8 = oneofDoubleAt(r1, r8)
            r2.writeDouble(r14, r8)
            goto L7c
        L18f:
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.writeMapHelper(r2, r14, r4, r10)
            goto L7c
        L198:
            int r4 = r0.numberAt(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.Schema r9 = r0.getMessageFieldSchema(r10)
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeGroupList(r4, r8, r2, r9)
            goto L7c
        L1ab:
            int r4 = r0.numberAt(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 1
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSInt64List(r4, r8, r2, r13)
            goto L7c
        L1bb:
            r13 = 1
            int r4 = r0.numberAt(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSInt32List(r4, r8, r2, r13)
            goto L7c
        L1cb:
            r13 = 1
            int r4 = r0.numberAt(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSFixed64List(r4, r8, r2, r13)
            goto L7c
        L1db:
            r13 = 1
            int r4 = r0.numberAt(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSFixed32List(r4, r8, r2, r13)
            goto L7c
        L1eb:
            r13 = 1
            int r4 = r0.numberAt(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeEnumList(r4, r8, r2, r13)
            goto L7c
        L1fb:
            r13 = 1
            int r4 = r0.numberAt(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeUInt32List(r4, r8, r2, r13)
            goto L7c
        L20b:
            r13 = 1
            int r4 = r0.numberAt(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeBoolList(r4, r8, r2, r13)
            goto L7c
        L21b:
            r13 = 1
            int r4 = r0.numberAt(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeFixed32List(r4, r8, r2, r13)
            goto L7c
        L22b:
            r13 = 1
            int r4 = r0.numberAt(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeFixed64List(r4, r8, r2, r13)
            goto L7c
        L23b:
            r13 = 1
            int r4 = r0.numberAt(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeInt32List(r4, r8, r2, r13)
            goto L7c
        L24b:
            r13 = 1
            int r4 = r0.numberAt(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeUInt64List(r4, r8, r2, r13)
            goto L7c
        L25b:
            r13 = 1
            int r4 = r0.numberAt(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeInt64List(r4, r8, r2, r13)
            goto L7c
        L26b:
            r13 = 1
            int r4 = r0.numberAt(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeFloatList(r4, r8, r2, r13)
            goto L7c
        L27b:
            r13 = 1
            int r4 = r0.numberAt(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeDoubleList(r4, r8, r2, r13)
            goto L7c
        L28b:
            int r4 = r0.numberAt(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSInt64List(r4, r8, r2, r13)
            goto L486
        L29b:
            r13 = 0
            int r4 = r0.numberAt(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSInt32List(r4, r8, r2, r13)
            goto L486
        L2ab:
            r13 = 0
            int r4 = r0.numberAt(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSFixed64List(r4, r8, r2, r13)
            goto L486
        L2bb:
            r13 = 0
            int r4 = r0.numberAt(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSFixed32List(r4, r8, r2, r13)
            goto L486
        L2cb:
            r13 = 0
            int r4 = r0.numberAt(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeEnumList(r4, r8, r2, r13)
            goto L486
        L2db:
            r13 = 0
            int r4 = r0.numberAt(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeUInt32List(r4, r8, r2, r13)
            goto L486
        L2eb:
            int r4 = r0.numberAt(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeBytesList(r4, r8, r2)
            goto L7c
        L2fa:
            int r4 = r0.numberAt(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.Schema r9 = r0.getMessageFieldSchema(r10)
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeMessageList(r4, r8, r2, r9)
            goto L7c
        L30d:
            int r4 = r0.numberAt(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeStringList(r4, r8, r2)
            goto L7c
        L31c:
            int r4 = r0.numberAt(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeBoolList(r4, r8, r2, r13)
            goto L486
        L32c:
            r13 = 0
            int r4 = r0.numberAt(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeFixed32List(r4, r8, r2, r13)
            goto L486
        L33c:
            r13 = 0
            int r4 = r0.numberAt(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeFixed64List(r4, r8, r2, r13)
            goto L486
        L34c:
            r13 = 0
            int r4 = r0.numberAt(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeInt32List(r4, r8, r2, r13)
            goto L486
        L35c:
            r13 = 0
            int r4 = r0.numberAt(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeUInt64List(r4, r8, r2, r13)
            goto L486
        L36c:
            r13 = 0
            int r4 = r0.numberAt(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeInt64List(r4, r8, r2, r13)
            goto L486
        L37c:
            r13 = 0
            int r4 = r0.numberAt(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeFloatList(r4, r8, r2, r13)
            goto L486
        L38c:
            r13 = 0
            int r4 = r0.numberAt(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeDoubleList(r4, r8, r2, r13)
            goto L486
        L39c:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L486
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.crypto.tink.shaded.protobuf.Schema r8 = r0.getMessageFieldSchema(r10)
            r2.writeGroup(r14, r4, r8)
            goto L486
        L3ad:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L486
            long r8 = r7.getLong(r1, r8)
            r2.writeSInt64(r14, r8)
            goto L486
        L3ba:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L486
            int r4 = r7.getInt(r1, r8)
            r2.writeSInt32(r14, r4)
            goto L486
        L3c7:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L486
            long r8 = r7.getLong(r1, r8)
            r2.writeSFixed64(r14, r8)
            goto L486
        L3d4:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L486
            int r4 = r7.getInt(r1, r8)
            r2.writeSFixed32(r14, r4)
            goto L486
        L3e1:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L486
            int r4 = r7.getInt(r1, r8)
            r2.writeEnum(r14, r4)
            goto L486
        L3ee:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L486
            int r4 = r7.getInt(r1, r8)
            r2.writeUInt32(r14, r4)
            goto L486
        L3fb:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L486
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = (com.google.crypto.tink.shaded.protobuf.ByteString) r4
            r2.writeBytes(r14, r4)
            goto L486
        L40a:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L486
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.crypto.tink.shaded.protobuf.Schema r8 = r0.getMessageFieldSchema(r10)
            r2.writeMessage(r14, r4, r8)
            goto L486
        L41b:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L486
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.writeString(r14, r4, r2)
            goto L486
        L427:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L486
            boolean r4 = booleanAt(r1, r8)
            r2.writeBool(r14, r4)
            goto L486
        L433:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L486
            int r4 = r7.getInt(r1, r8)
            r2.writeFixed32(r14, r4)
            goto L486
        L43f:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L486
            long r8 = r7.getLong(r1, r8)
            r2.writeFixed64(r14, r8)
            goto L486
        L44b:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L486
            int r4 = r7.getInt(r1, r8)
            r2.writeInt32(r14, r4)
            goto L486
        L457:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L486
            long r8 = r7.getLong(r1, r8)
            r2.writeUInt64(r14, r8)
            goto L486
        L463:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L486
            long r8 = r7.getLong(r1, r8)
            r2.writeInt64(r14, r8)
            goto L486
        L46f:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L486
            float r4 = floatAt(r1, r8)
            r2.writeFloat(r14, r4)
            goto L486
        L47b:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L486
            double r8 = doubleAt(r1, r8)
            r2.writeDouble(r14, r8)
        L486:
            int r10 = r10 + 3
            r8 = 1048575(0xfffff, float:1.469367E-39)
            goto L2e
        L48d:
            if (r5 == 0) goto L4a4
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r4 = r0.extensionSchema
            r4.serializeExtension(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4a2
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r5 = r4
            goto L48d
        L4a2:
            r5 = 0
            goto L48d
        L4a4:
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r3 = r0.unknownFieldSchema
            r0.writeUnknownInMessageTo(r3, r1, r2)
            return
    }

    private void writeFieldsInAscendingOrderProto3(T r13, com.google.crypto.tink.shaded.protobuf.Writer r14) throws java.io.IOException {
            r12 = this;
            boolean r0 = r12.hasExtensions
            r1 = 0
            if (r0 == 0) goto L1c
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r0 = r12.extensionSchema
            com.google.crypto.tink.shaded.protobuf.FieldSet r0 = r0.getExtensions(r13)
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L1c
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L1e
        L1c:
            r0 = r1
            r2 = r0
        L1e:
            int[] r3 = r12.buffer
            int r3 = r3.length
            r4 = 0
            r5 = r4
        L23:
            if (r5 >= r3) goto L586
            int r6 = r12.typeAndOffsetAt(r5)
            int r7 = r12.numberAt(r5)
        L2d:
            if (r2 == 0) goto L4b
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r8 = r12.extensionSchema
            int r8 = r8.extensionNumber(r2)
            if (r8 > r7) goto L4b
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r8 = r12.extensionSchema
            r8.serializeExtension(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L49
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L2d
        L49:
            r2 = r1
            goto L2d
        L4b:
            int r8 = type(r6)
            r9 = 1
            switch(r8) {
                case 0: goto L571;
                case 1: goto L55f;
                case 2: goto L54d;
                case 3: goto L53b;
                case 4: goto L529;
                case 5: goto L517;
                case 6: goto L505;
                case 7: goto L4f2;
                case 8: goto L4df;
                case 9: goto L4c8;
                case 10: goto L4b3;
                case 11: goto L4a0;
                case 12: goto L48d;
                case 13: goto L47a;
                case 14: goto L467;
                case 15: goto L454;
                case 16: goto L441;
                case 17: goto L42a;
                case 18: goto L417;
                case 19: goto L404;
                case 20: goto L3f1;
                case 21: goto L3de;
                case 22: goto L3cb;
                case 23: goto L3b8;
                case 24: goto L3a5;
                case 25: goto L392;
                case 26: goto L37f;
                case 27: goto L368;
                case 28: goto L355;
                case 29: goto L342;
                case 30: goto L32f;
                case 31: goto L31c;
                case 32: goto L309;
                case 33: goto L2f6;
                case 34: goto L2e3;
                case 35: goto L2d0;
                case 36: goto L2bd;
                case 37: goto L2aa;
                case 38: goto L297;
                case 39: goto L284;
                case 40: goto L271;
                case 41: goto L25e;
                case 42: goto L24b;
                case 43: goto L238;
                case 44: goto L225;
                case 45: goto L212;
                case 46: goto L1ff;
                case 47: goto L1ec;
                case 48: goto L1d9;
                case 49: goto L1c2;
                case 50: goto L1b5;
                case 51: goto L1a2;
                case 52: goto L18f;
                case 53: goto L17c;
                case 54: goto L169;
                case 55: goto L156;
                case 56: goto L143;
                case 57: goto L130;
                case 58: goto L11d;
                case 59: goto L10a;
                case 60: goto Lf3;
                case 61: goto Lde;
                case 62: goto Lcb;
                case 63: goto Lb8;
                case 64: goto La5;
                case 65: goto L92;
                case 66: goto L7f;
                case 67: goto L6c;
                case 68: goto L55;
                default: goto L53;
            }
        L53:
            goto L582
        L55:
            boolean r8 = r12.isOneofPresent(r13, r7, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r8)
            com.google.crypto.tink.shaded.protobuf.Schema r8 = r12.getMessageFieldSchema(r5)
            r14.writeGroup(r7, r6, r8)
            goto L582
        L6c:
            boolean r8 = r12.isOneofPresent(r13, r7, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            long r8 = oneofLongAt(r13, r8)
            r14.writeSInt64(r7, r8)
            goto L582
        L7f:
            boolean r8 = r12.isOneofPresent(r13, r7, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            int r6 = oneofIntAt(r13, r8)
            r14.writeSInt32(r7, r6)
            goto L582
        L92:
            boolean r8 = r12.isOneofPresent(r13, r7, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            long r8 = oneofLongAt(r13, r8)
            r14.writeSFixed64(r7, r8)
            goto L582
        La5:
            boolean r8 = r12.isOneofPresent(r13, r7, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            int r6 = oneofIntAt(r13, r8)
            r14.writeSFixed32(r7, r6)
            goto L582
        Lb8:
            boolean r8 = r12.isOneofPresent(r13, r7, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            int r6 = oneofIntAt(r13, r8)
            r14.writeEnum(r7, r6)
            goto L582
        Lcb:
            boolean r8 = r12.isOneofPresent(r13, r7, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            int r6 = oneofIntAt(r13, r8)
            r14.writeUInt32(r7, r6)
            goto L582
        Lde:
            boolean r8 = r12.isOneofPresent(r13, r7, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r8)
            com.google.crypto.tink.shaded.protobuf.ByteString r6 = (com.google.crypto.tink.shaded.protobuf.ByteString) r6
            r14.writeBytes(r7, r6)
            goto L582
        Lf3:
            boolean r8 = r12.isOneofPresent(r13, r7, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r8)
            com.google.crypto.tink.shaded.protobuf.Schema r8 = r12.getMessageFieldSchema(r5)
            r14.writeMessage(r7, r6, r8)
            goto L582
        L10a:
            boolean r8 = r12.isOneofPresent(r13, r7, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r8)
            r12.writeString(r7, r6, r14)
            goto L582
        L11d:
            boolean r8 = r12.isOneofPresent(r13, r7, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            boolean r6 = oneofBooleanAt(r13, r8)
            r14.writeBool(r7, r6)
            goto L582
        L130:
            boolean r8 = r12.isOneofPresent(r13, r7, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            int r6 = oneofIntAt(r13, r8)
            r14.writeFixed32(r7, r6)
            goto L582
        L143:
            boolean r8 = r12.isOneofPresent(r13, r7, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            long r8 = oneofLongAt(r13, r8)
            r14.writeFixed64(r7, r8)
            goto L582
        L156:
            boolean r8 = r12.isOneofPresent(r13, r7, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            int r6 = oneofIntAt(r13, r8)
            r14.writeInt32(r7, r6)
            goto L582
        L169:
            boolean r8 = r12.isOneofPresent(r13, r7, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            long r8 = oneofLongAt(r13, r8)
            r14.writeUInt64(r7, r8)
            goto L582
        L17c:
            boolean r8 = r12.isOneofPresent(r13, r7, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            long r8 = oneofLongAt(r13, r8)
            r14.writeInt64(r7, r8)
            goto L582
        L18f:
            boolean r8 = r12.isOneofPresent(r13, r7, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            float r6 = oneofFloatAt(r13, r8)
            r14.writeFloat(r7, r6)
            goto L582
        L1a2:
            boolean r8 = r12.isOneofPresent(r13, r7, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            double r8 = oneofDoubleAt(r13, r8)
            r14.writeDouble(r7, r8)
            goto L582
        L1b5:
            long r8 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r8)
            r12.writeMapHelper(r14, r7, r6, r5)
            goto L582
        L1c2:
            int r7 = r12.numberAt(r5)
            long r8 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.Schema r8 = r12.getMessageFieldSchema(r5)
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeGroupList(r7, r6, r14, r8)
            goto L582
        L1d9:
            int r7 = r12.numberAt(r5)
            long r10 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSInt64List(r7, r6, r14, r9)
            goto L582
        L1ec:
            int r7 = r12.numberAt(r5)
            long r10 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSInt32List(r7, r6, r14, r9)
            goto L582
        L1ff:
            int r7 = r12.numberAt(r5)
            long r10 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSFixed64List(r7, r6, r14, r9)
            goto L582
        L212:
            int r7 = r12.numberAt(r5)
            long r10 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSFixed32List(r7, r6, r14, r9)
            goto L582
        L225:
            int r7 = r12.numberAt(r5)
            long r10 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeEnumList(r7, r6, r14, r9)
            goto L582
        L238:
            int r7 = r12.numberAt(r5)
            long r10 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeUInt32List(r7, r6, r14, r9)
            goto L582
        L24b:
            int r7 = r12.numberAt(r5)
            long r10 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeBoolList(r7, r6, r14, r9)
            goto L582
        L25e:
            int r7 = r12.numberAt(r5)
            long r10 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeFixed32List(r7, r6, r14, r9)
            goto L582
        L271:
            int r7 = r12.numberAt(r5)
            long r10 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeFixed64List(r7, r6, r14, r9)
            goto L582
        L284:
            int r7 = r12.numberAt(r5)
            long r10 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeInt32List(r7, r6, r14, r9)
            goto L582
        L297:
            int r7 = r12.numberAt(r5)
            long r10 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeUInt64List(r7, r6, r14, r9)
            goto L582
        L2aa:
            int r7 = r12.numberAt(r5)
            long r10 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeInt64List(r7, r6, r14, r9)
            goto L582
        L2bd:
            int r7 = r12.numberAt(r5)
            long r10 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeFloatList(r7, r6, r14, r9)
            goto L582
        L2d0:
            int r7 = r12.numberAt(r5)
            long r10 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeDoubleList(r7, r6, r14, r9)
            goto L582
        L2e3:
            int r7 = r12.numberAt(r5)
            long r8 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSInt64List(r7, r6, r14, r4)
            goto L582
        L2f6:
            int r7 = r12.numberAt(r5)
            long r8 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSInt32List(r7, r6, r14, r4)
            goto L582
        L309:
            int r7 = r12.numberAt(r5)
            long r8 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSFixed64List(r7, r6, r14, r4)
            goto L582
        L31c:
            int r7 = r12.numberAt(r5)
            long r8 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSFixed32List(r7, r6, r14, r4)
            goto L582
        L32f:
            int r7 = r12.numberAt(r5)
            long r8 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeEnumList(r7, r6, r14, r4)
            goto L582
        L342:
            int r7 = r12.numberAt(r5)
            long r8 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeUInt32List(r7, r6, r14, r4)
            goto L582
        L355:
            int r7 = r12.numberAt(r5)
            long r8 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeBytesList(r7, r6, r14)
            goto L582
        L368:
            int r7 = r12.numberAt(r5)
            long r8 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.Schema r8 = r12.getMessageFieldSchema(r5)
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeMessageList(r7, r6, r14, r8)
            goto L582
        L37f:
            int r7 = r12.numberAt(r5)
            long r8 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeStringList(r7, r6, r14)
            goto L582
        L392:
            int r7 = r12.numberAt(r5)
            long r8 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeBoolList(r7, r6, r14, r4)
            goto L582
        L3a5:
            int r7 = r12.numberAt(r5)
            long r8 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeFixed32List(r7, r6, r14, r4)
            goto L582
        L3b8:
            int r7 = r12.numberAt(r5)
            long r8 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeFixed64List(r7, r6, r14, r4)
            goto L582
        L3cb:
            int r7 = r12.numberAt(r5)
            long r8 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeInt32List(r7, r6, r14, r4)
            goto L582
        L3de:
            int r7 = r12.numberAt(r5)
            long r8 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeUInt64List(r7, r6, r14, r4)
            goto L582
        L3f1:
            int r7 = r12.numberAt(r5)
            long r8 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeInt64List(r7, r6, r14, r4)
            goto L582
        L404:
            int r7 = r12.numberAt(r5)
            long r8 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeFloatList(r7, r6, r14, r4)
            goto L582
        L417:
            int r7 = r12.numberAt(r5)
            long r8 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeDoubleList(r7, r6, r14, r4)
            goto L582
        L42a:
            boolean r8 = r12.isFieldPresent(r13, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r8)
            com.google.crypto.tink.shaded.protobuf.Schema r8 = r12.getMessageFieldSchema(r5)
            r14.writeGroup(r7, r6, r8)
            goto L582
        L441:
            boolean r8 = r12.isFieldPresent(r13, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            long r8 = longAt(r13, r8)
            r14.writeSInt64(r7, r8)
            goto L582
        L454:
            boolean r8 = r12.isFieldPresent(r13, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            int r6 = intAt(r13, r8)
            r14.writeSInt32(r7, r6)
            goto L582
        L467:
            boolean r8 = r12.isFieldPresent(r13, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            long r8 = longAt(r13, r8)
            r14.writeSFixed64(r7, r8)
            goto L582
        L47a:
            boolean r8 = r12.isFieldPresent(r13, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            int r6 = intAt(r13, r8)
            r14.writeSFixed32(r7, r6)
            goto L582
        L48d:
            boolean r8 = r12.isFieldPresent(r13, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            int r6 = intAt(r13, r8)
            r14.writeEnum(r7, r6)
            goto L582
        L4a0:
            boolean r8 = r12.isFieldPresent(r13, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            int r6 = intAt(r13, r8)
            r14.writeUInt32(r7, r6)
            goto L582
        L4b3:
            boolean r8 = r12.isFieldPresent(r13, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r8)
            com.google.crypto.tink.shaded.protobuf.ByteString r6 = (com.google.crypto.tink.shaded.protobuf.ByteString) r6
            r14.writeBytes(r7, r6)
            goto L582
        L4c8:
            boolean r8 = r12.isFieldPresent(r13, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r8)
            com.google.crypto.tink.shaded.protobuf.Schema r8 = r12.getMessageFieldSchema(r5)
            r14.writeMessage(r7, r6, r8)
            goto L582
        L4df:
            boolean r8 = r12.isFieldPresent(r13, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r13, r8)
            r12.writeString(r7, r6, r14)
            goto L582
        L4f2:
            boolean r8 = r12.isFieldPresent(r13, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            boolean r6 = booleanAt(r13, r8)
            r14.writeBool(r7, r6)
            goto L582
        L505:
            boolean r8 = r12.isFieldPresent(r13, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            int r6 = intAt(r13, r8)
            r14.writeFixed32(r7, r6)
            goto L582
        L517:
            boolean r8 = r12.isFieldPresent(r13, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            long r8 = longAt(r13, r8)
            r14.writeFixed64(r7, r8)
            goto L582
        L529:
            boolean r8 = r12.isFieldPresent(r13, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            int r6 = intAt(r13, r8)
            r14.writeInt32(r7, r6)
            goto L582
        L53b:
            boolean r8 = r12.isFieldPresent(r13, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            long r8 = longAt(r13, r8)
            r14.writeUInt64(r7, r8)
            goto L582
        L54d:
            boolean r8 = r12.isFieldPresent(r13, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            long r8 = longAt(r13, r8)
            r14.writeInt64(r7, r8)
            goto L582
        L55f:
            boolean r8 = r12.isFieldPresent(r13, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            float r6 = floatAt(r13, r8)
            r14.writeFloat(r7, r6)
            goto L582
        L571:
            boolean r8 = r12.isFieldPresent(r13, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            double r8 = doubleAt(r13, r8)
            r14.writeDouble(r7, r8)
        L582:
            int r5 = r5 + 3
            goto L23
        L586:
            if (r2 == 0) goto L59c
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r3 = r12.extensionSchema
            r3.serializeExtension(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L59a
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L586
        L59a:
            r2 = r1
            goto L586
        L59c:
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r0 = r12.unknownFieldSchema
            r12.writeUnknownInMessageTo(r0, r13, r14)
            return
    }

    private void writeFieldsInDescendingOrder(T r11, com.google.crypto.tink.shaded.protobuf.Writer r12) throws java.io.IOException {
            r10 = this;
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r0 = r10.unknownFieldSchema
            r10.writeUnknownInMessageTo(r0, r11, r12)
            boolean r0 = r10.hasExtensions
            r1 = 0
            if (r0 == 0) goto L21
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r0 = r10.extensionSchema
            com.google.crypto.tink.shaded.protobuf.FieldSet r0 = r0.getExtensions(r11)
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L21
            java.util.Iterator r0 = r0.descendingIterator()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L23
        L21:
            r0 = r1
            r2 = r0
        L23:
            int[] r3 = r10.buffer
            int r3 = r3.length
            int r3 = r3 + (-3)
        L28:
            if (r3 < 0) goto L58c
            int r4 = r10.typeAndOffsetAt(r3)
            int r5 = r10.numberAt(r3)
        L32:
            if (r2 == 0) goto L50
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r6 = r10.extensionSchema
            int r6 = r6.extensionNumber(r2)
            if (r6 <= r5) goto L50
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r6 = r10.extensionSchema
            r6.serializeExtension(r12, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4e
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L32
        L4e:
            r2 = r1
            goto L32
        L50:
            int r6 = type(r4)
            r7 = 1
            r8 = 0
            switch(r6) {
                case 0: goto L577;
                case 1: goto L565;
                case 2: goto L553;
                case 3: goto L541;
                case 4: goto L52f;
                case 5: goto L51d;
                case 6: goto L50b;
                case 7: goto L4f8;
                case 8: goto L4e5;
                case 9: goto L4ce;
                case 10: goto L4b9;
                case 11: goto L4a6;
                case 12: goto L493;
                case 13: goto L480;
                case 14: goto L46d;
                case 15: goto L45a;
                case 16: goto L447;
                case 17: goto L430;
                case 18: goto L41d;
                case 19: goto L40a;
                case 20: goto L3f7;
                case 21: goto L3e4;
                case 22: goto L3d1;
                case 23: goto L3be;
                case 24: goto L3ab;
                case 25: goto L398;
                case 26: goto L385;
                case 27: goto L36e;
                case 28: goto L35b;
                case 29: goto L348;
                case 30: goto L335;
                case 31: goto L322;
                case 32: goto L30f;
                case 33: goto L2fc;
                case 34: goto L2e9;
                case 35: goto L2d6;
                case 36: goto L2c3;
                case 37: goto L2b0;
                case 38: goto L29d;
                case 39: goto L28a;
                case 40: goto L277;
                case 41: goto L264;
                case 42: goto L251;
                case 43: goto L23e;
                case 44: goto L22b;
                case 45: goto L218;
                case 46: goto L205;
                case 47: goto L1f2;
                case 48: goto L1df;
                case 49: goto L1c8;
                case 50: goto L1bb;
                case 51: goto L1a8;
                case 52: goto L195;
                case 53: goto L182;
                case 54: goto L16f;
                case 55: goto L15c;
                case 56: goto L149;
                case 57: goto L136;
                case 58: goto L123;
                case 59: goto L110;
                case 60: goto Lf9;
                case 61: goto Le4;
                case 62: goto Ld1;
                case 63: goto Lbe;
                case 64: goto Lab;
                case 65: goto L98;
                case 66: goto L85;
                case 67: goto L72;
                case 68: goto L5b;
                default: goto L59;
            }
        L59:
            goto L588
        L5b:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r6)
            com.google.crypto.tink.shaded.protobuf.Schema r6 = r10.getMessageFieldSchema(r3)
            r12.writeGroup(r5, r4, r6)
            goto L588
        L72:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            long r6 = oneofLongAt(r11, r6)
            r12.writeSInt64(r5, r6)
            goto L588
        L85:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            int r4 = oneofIntAt(r11, r6)
            r12.writeSInt32(r5, r4)
            goto L588
        L98:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            long r6 = oneofLongAt(r11, r6)
            r12.writeSFixed64(r5, r6)
            goto L588
        Lab:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            int r4 = oneofIntAt(r11, r6)
            r12.writeSFixed32(r5, r4)
            goto L588
        Lbe:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            int r4 = oneofIntAt(r11, r6)
            r12.writeEnum(r5, r4)
            goto L588
        Ld1:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            int r4 = oneofIntAt(r11, r6)
            r12.writeUInt32(r5, r4)
            goto L588
        Le4:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r6)
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = (com.google.crypto.tink.shaded.protobuf.ByteString) r4
            r12.writeBytes(r5, r4)
            goto L588
        Lf9:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r6)
            com.google.crypto.tink.shaded.protobuf.Schema r6 = r10.getMessageFieldSchema(r3)
            r12.writeMessage(r5, r4, r6)
            goto L588
        L110:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r6)
            r10.writeString(r5, r4, r12)
            goto L588
        L123:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            boolean r4 = oneofBooleanAt(r11, r6)
            r12.writeBool(r5, r4)
            goto L588
        L136:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            int r4 = oneofIntAt(r11, r6)
            r12.writeFixed32(r5, r4)
            goto L588
        L149:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            long r6 = oneofLongAt(r11, r6)
            r12.writeFixed64(r5, r6)
            goto L588
        L15c:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            int r4 = oneofIntAt(r11, r6)
            r12.writeInt32(r5, r4)
            goto L588
        L16f:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            long r6 = oneofLongAt(r11, r6)
            r12.writeUInt64(r5, r6)
            goto L588
        L182:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            long r6 = oneofLongAt(r11, r6)
            r12.writeInt64(r5, r6)
            goto L588
        L195:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            float r4 = oneofFloatAt(r11, r6)
            r12.writeFloat(r5, r4)
            goto L588
        L1a8:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            double r6 = oneofDoubleAt(r11, r6)
            r12.writeDouble(r5, r6)
            goto L588
        L1bb:
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r6)
            r10.writeMapHelper(r12, r5, r4, r3)
            goto L588
        L1c8:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.Schema r6 = r10.getMessageFieldSchema(r3)
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeGroupList(r5, r4, r12, r6)
            goto L588
        L1df:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSInt64List(r5, r4, r12, r7)
            goto L588
        L1f2:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSInt32List(r5, r4, r12, r7)
            goto L588
        L205:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSFixed64List(r5, r4, r12, r7)
            goto L588
        L218:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSFixed32List(r5, r4, r12, r7)
            goto L588
        L22b:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeEnumList(r5, r4, r12, r7)
            goto L588
        L23e:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeUInt32List(r5, r4, r12, r7)
            goto L588
        L251:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeBoolList(r5, r4, r12, r7)
            goto L588
        L264:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeFixed32List(r5, r4, r12, r7)
            goto L588
        L277:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeFixed64List(r5, r4, r12, r7)
            goto L588
        L28a:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeInt32List(r5, r4, r12, r7)
            goto L588
        L29d:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeUInt64List(r5, r4, r12, r7)
            goto L588
        L2b0:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeInt64List(r5, r4, r12, r7)
            goto L588
        L2c3:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeFloatList(r5, r4, r12, r7)
            goto L588
        L2d6:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeDoubleList(r5, r4, r12, r7)
            goto L588
        L2e9:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSInt64List(r5, r4, r12, r8)
            goto L588
        L2fc:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSInt32List(r5, r4, r12, r8)
            goto L588
        L30f:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSFixed64List(r5, r4, r12, r8)
            goto L588
        L322:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSFixed32List(r5, r4, r12, r8)
            goto L588
        L335:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeEnumList(r5, r4, r12, r8)
            goto L588
        L348:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeUInt32List(r5, r4, r12, r8)
            goto L588
        L35b:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeBytesList(r5, r4, r12)
            goto L588
        L36e:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.Schema r6 = r10.getMessageFieldSchema(r3)
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeMessageList(r5, r4, r12, r6)
            goto L588
        L385:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeStringList(r5, r4, r12)
            goto L588
        L398:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeBoolList(r5, r4, r12, r8)
            goto L588
        L3ab:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeFixed32List(r5, r4, r12, r8)
            goto L588
        L3be:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeFixed64List(r5, r4, r12, r8)
            goto L588
        L3d1:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeInt32List(r5, r4, r12, r8)
            goto L588
        L3e4:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeUInt64List(r5, r4, r12, r8)
            goto L588
        L3f7:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeInt64List(r5, r4, r12, r8)
            goto L588
        L40a:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeFloatList(r5, r4, r12, r8)
            goto L588
        L41d:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeDoubleList(r5, r4, r12, r8)
            goto L588
        L430:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r6)
            com.google.crypto.tink.shaded.protobuf.Schema r6 = r10.getMessageFieldSchema(r3)
            r12.writeGroup(r5, r4, r6)
            goto L588
        L447:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            long r6 = longAt(r11, r6)
            r12.writeSInt64(r5, r6)
            goto L588
        L45a:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            int r4 = intAt(r11, r6)
            r12.writeSInt32(r5, r4)
            goto L588
        L46d:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            long r6 = longAt(r11, r6)
            r12.writeSFixed64(r5, r6)
            goto L588
        L480:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            int r4 = intAt(r11, r6)
            r12.writeSFixed32(r5, r4)
            goto L588
        L493:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            int r4 = intAt(r11, r6)
            r12.writeEnum(r5, r4)
            goto L588
        L4a6:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            int r4 = intAt(r11, r6)
            r12.writeUInt32(r5, r4)
            goto L588
        L4b9:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r6)
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = (com.google.crypto.tink.shaded.protobuf.ByteString) r4
            r12.writeBytes(r5, r4)
            goto L588
        L4ce:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r6)
            com.google.crypto.tink.shaded.protobuf.Schema r6 = r10.getMessageFieldSchema(r3)
            r12.writeMessage(r5, r4, r6)
            goto L588
        L4e5:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r6)
            r10.writeString(r5, r4, r12)
            goto L588
        L4f8:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            boolean r4 = booleanAt(r11, r6)
            r12.writeBool(r5, r4)
            goto L588
        L50b:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            int r4 = intAt(r11, r6)
            r12.writeFixed32(r5, r4)
            goto L588
        L51d:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            long r6 = longAt(r11, r6)
            r12.writeFixed64(r5, r6)
            goto L588
        L52f:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            int r4 = intAt(r11, r6)
            r12.writeInt32(r5, r4)
            goto L588
        L541:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            long r6 = longAt(r11, r6)
            r12.writeUInt64(r5, r6)
            goto L588
        L553:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            long r6 = longAt(r11, r6)
            r12.writeInt64(r5, r6)
            goto L588
        L565:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            float r4 = floatAt(r11, r6)
            r12.writeFloat(r5, r4)
            goto L588
        L577:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            double r6 = doubleAt(r11, r6)
            r12.writeDouble(r5, r6)
        L588:
            int r3 = r3 + (-3)
            goto L28
        L58c:
            if (r2 == 0) goto L5a3
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r11 = r10.extensionSchema
            r11.serializeExtension(r12, r2)
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L5a1
            java.lang.Object r11 = r0.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            r2 = r11
            goto L58c
        L5a1:
            r2 = r1
            goto L58c
        L5a3:
            return
    }

    private <K, V> void writeMapHelper(com.google.crypto.tink.shaded.protobuf.Writer r2, int r3, java.lang.Object r4, int r5) throws java.io.IOException {
            r1 = this;
            if (r4 == 0) goto L15
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r0 = r1.mapFieldSchema
            java.lang.Object r5 = r1.getMapFieldDefaultEntry(r5)
            com.google.crypto.tink.shaded.protobuf.MapEntryLite$Metadata r5 = r0.forMapMetadata(r5)
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r0 = r1.mapFieldSchema
            java.util.Map r4 = r0.forMapData(r4)
            r2.writeMap(r3, r5, r4)
        L15:
            return
    }

    private void writeString(int r2, java.lang.Object r3, com.google.crypto.tink.shaded.protobuf.Writer r4) throws java.io.IOException {
            r1 = this;
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto La
            java.lang.String r3 = (java.lang.String) r3
            r4.writeString(r2, r3)
            goto Lf
        La:
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = (com.google.crypto.tink.shaded.protobuf.ByteString) r3
            r4.writeBytes(r2, r3)
        Lf:
            return
    }

    private <UT, UB> void writeUnknownInMessageTo(com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<UT, UB> r1, T r2, com.google.crypto.tink.shaded.protobuf.Writer r3) throws java.io.IOException {
            r0 = this;
            java.lang.Object r2 = r1.getFromMessage(r2)
            r1.writeTo(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public boolean equals(T r5, T r6) {
            r4 = this;
            int[] r0 = r4.buffer
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L5:
            if (r2 >= r0) goto L11
            boolean r3 = r4.equals(r5, r6, r2)
            if (r3 != 0) goto Le
            return r1
        Le:
            int r2 = r2 + 3
            goto L5
        L11:
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r0 = r4.unknownFieldSchema
            java.lang.Object r0 = r0.getFromMessage(r5)
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r2 = r4.unknownFieldSchema
            java.lang.Object r2 = r2.getFromMessage(r6)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L24
            return r1
        L24:
            boolean r0 = r4.hasExtensions
            if (r0 == 0) goto L39
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r0 = r4.extensionSchema
            com.google.crypto.tink.shaded.protobuf.FieldSet r5 = r0.getExtensions(r5)
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r0 = r4.extensionSchema
            com.google.crypto.tink.shaded.protobuf.FieldSet r6 = r0.getExtensions(r6)
            boolean r5 = r5.equals(r6)
            return r5
        L39:
            r5 = 1
            return r5
    }

    int getSchemaSize() {
            r1 = this;
            int[] r0 = r1.buffer
            int r0 = r0.length
            int r0 = r0 * 3
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public int getSerializedSize(T r2) {
            r1 = this;
            boolean r0 = r1.proto3
            if (r0 == 0) goto L9
            int r2 = r1.getSerializedSizeProto3(r2)
            goto Ld
        L9:
            int r2 = r1.getSerializedSizeProto2(r2)
        Ld:
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public int hashCode(T r9) {
            r8 = this;
            int[] r0 = r8.buffer
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L5:
            if (r1 >= r0) goto L22a
            int r3 = r8.typeAndOffsetAt(r1)
            int r4 = r8.numberAt(r1)
            long r5 = offset(r3)
            int r3 = type(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L217;
                case 1: goto L20c;
                case 2: goto L201;
                case 3: goto L1f6;
                case 4: goto L1ef;
                case 5: goto L1e4;
                case 6: goto L1dd;
                case 7: goto L1d2;
                case 8: goto L1c5;
                case 9: goto L1b7;
                case 10: goto L1ab;
                case 11: goto L1a3;
                case 12: goto L19b;
                case 13: goto L193;
                case 14: goto L187;
                case 15: goto L17f;
                case 16: goto L173;
                case 17: goto L168;
                case 18: goto L15c;
                case 19: goto L15c;
                case 20: goto L15c;
                case 21: goto L15c;
                case 22: goto L15c;
                case 23: goto L15c;
                case 24: goto L15c;
                case 25: goto L15c;
                case 26: goto L15c;
                case 27: goto L15c;
                case 28: goto L15c;
                case 29: goto L15c;
                case 30: goto L15c;
                case 31: goto L15c;
                case 32: goto L15c;
                case 33: goto L15c;
                case 34: goto L15c;
                case 35: goto L15c;
                case 36: goto L15c;
                case 37: goto L15c;
                case 38: goto L15c;
                case 39: goto L15c;
                case 40: goto L15c;
                case 41: goto L15c;
                case 42: goto L15c;
                case 43: goto L15c;
                case 44: goto L15c;
                case 45: goto L15c;
                case 46: goto L15c;
                case 47: goto L15c;
                case 48: goto L15c;
                case 49: goto L15c;
                case 50: goto L150;
                case 51: goto L13a;
                case 52: goto L128;
                case 53: goto L116;
                case 54: goto L104;
                case 55: goto Lf6;
                case 56: goto Le4;
                case 57: goto Ld6;
                case 58: goto Lc4;
                case 59: goto Lb0;
                case 60: goto L9e;
                case 61: goto L8c;
                case 62: goto L7e;
                case 63: goto L70;
                case 64: goto L62;
                case 65: goto L50;
                case 66: goto L42;
                case 67: goto L30;
                case 68: goto L1e;
                default: goto L1c;
            }
        L1c:
            goto L226
        L1e:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L226
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L225
        L30:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            long r3 = oneofLongAt(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.Internal.hashLong(r3)
            goto L225
        L42:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            int r3 = oneofIntAt(r9, r5)
            goto L225
        L50:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            long r3 = oneofLongAt(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.Internal.hashLong(r3)
            goto L225
        L62:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            int r3 = oneofIntAt(r9, r5)
            goto L225
        L70:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            int r3 = oneofIntAt(r9, r5)
            goto L225
        L7e:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            int r3 = oneofIntAt(r9, r5)
            goto L225
        L8c:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r9, r5)
            int r3 = r3.hashCode()
            goto L225
        L9e:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L226
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L225
        Lb0:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L225
        Lc4:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            boolean r3 = oneofBooleanAt(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.Internal.hashBoolean(r3)
            goto L225
        Ld6:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            int r3 = oneofIntAt(r9, r5)
            goto L225
        Le4:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            long r3 = oneofLongAt(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.Internal.hashLong(r3)
            goto L225
        Lf6:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            int r3 = oneofIntAt(r9, r5)
            goto L225
        L104:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            long r3 = oneofLongAt(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.Internal.hashLong(r3)
            goto L225
        L116:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            long r3 = oneofLongAt(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.Internal.hashLong(r3)
            goto L225
        L128:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            float r3 = oneofFloatAt(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L225
        L13a:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            double r3 = oneofDoubleAt(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.crypto.tink.shaded.protobuf.Internal.hashLong(r3)
            goto L225
        L150:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r9, r5)
            int r3 = r3.hashCode()
            goto L225
        L15c:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r9, r5)
            int r3 = r3.hashCode()
            goto L225
        L168:
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r9, r5)
            if (r3 == 0) goto L1c1
            int r7 = r3.hashCode()
            goto L1c1
        L173:
            int r2 = r2 * 53
            long r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.Internal.hashLong(r3)
            goto L225
        L17f:
            int r2 = r2 * 53
            int r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r9, r5)
            goto L225
        L187:
            int r2 = r2 * 53
            long r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.Internal.hashLong(r3)
            goto L225
        L193:
            int r2 = r2 * 53
            int r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r9, r5)
            goto L225
        L19b:
            int r2 = r2 * 53
            int r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r9, r5)
            goto L225
        L1a3:
            int r2 = r2 * 53
            int r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r9, r5)
            goto L225
        L1ab:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r9, r5)
            int r3 = r3.hashCode()
            goto L225
        L1b7:
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r9, r5)
            if (r3 == 0) goto L1c1
            int r7 = r3.hashCode()
        L1c1:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L226
        L1c5:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L225
        L1d2:
            int r2 = r2 * 53
            boolean r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getBoolean(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.Internal.hashBoolean(r3)
            goto L225
        L1dd:
            int r2 = r2 * 53
            int r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r9, r5)
            goto L225
        L1e4:
            int r2 = r2 * 53
            long r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.Internal.hashLong(r3)
            goto L225
        L1ef:
            int r2 = r2 * 53
            int r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r9, r5)
            goto L225
        L1f6:
            int r2 = r2 * 53
            long r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.Internal.hashLong(r3)
            goto L225
        L201:
            int r2 = r2 * 53
            long r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.Internal.hashLong(r3)
            goto L225
        L20c:
            int r2 = r2 * 53
            float r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getFloat(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L225
        L217:
            int r2 = r2 * 53
            double r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getDouble(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.crypto.tink.shaded.protobuf.Internal.hashLong(r3)
        L225:
            int r2 = r2 + r3
        L226:
            int r1 = r1 + 3
            goto L5
        L22a:
            int r2 = r2 * 53
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r0 = r8.unknownFieldSchema
            java.lang.Object r0 = r0.getFromMessage(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.hasExtensions
            if (r0 == 0) goto L248
            int r2 = r2 * 53
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r0 = r8.extensionSchema
            com.google.crypto.tink.shaded.protobuf.FieldSet r9 = r0.getExtensions(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L248:
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public final boolean isInitialized(T r18) {
            r17 = this;
            r6 = r17
            r7 = r18
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 0
            r0 = r8
            r1 = r9
            r10 = r1
        Lb:
            int r2 = r6.checkInitializedCount
            r3 = 1
            if (r10 >= r2) goto Lb1
            int[] r2 = r6.intArray
            r11 = r2[r10]
            int r12 = r6.numberAt(r11)
            int r13 = r6.typeAndOffsetAt(r11)
            int[] r2 = r6.buffer
            int r4 = r11 + 2
            r2 = r2[r4]
            r4 = r2 & r8
            int r2 = r2 >>> 20
            int r14 = r3 << r2
            if (r4 == r0) goto L37
            if (r4 == r8) goto L33
            sun.misc.Unsafe r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            long r1 = (long) r4
            int r1 = r0.getInt(r7, r1)
        L33:
            r16 = r1
            r15 = r4
            goto L3a
        L37:
            r15 = r0
            r16 = r1
        L3a:
            boolean r0 = isRequired(r13)
            if (r0 == 0) goto L50
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r15
            r4 = r16
            r5 = r14
            boolean r0 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L50
            return r9
        L50:
            int r0 = type(r13)
            r1 = 9
            if (r0 == r1) goto L90
            r1 = 17
            if (r0 == r1) goto L90
            r1 = 27
            if (r0 == r1) goto L89
            r1 = 60
            if (r0 == r1) goto L78
            r1 = 68
            if (r0 == r1) goto L78
            r1 = 49
            if (r0 == r1) goto L89
            r1 = 50
            if (r0 == r1) goto L71
            goto Laa
        L71:
            boolean r0 = r6.isMapInitialized(r7, r13, r11)
            if (r0 != 0) goto Laa
            return r9
        L78:
            boolean r0 = r6.isOneofPresent(r7, r12, r11)
            if (r0 == 0) goto Laa
            com.google.crypto.tink.shaded.protobuf.Schema r0 = r6.getMessageFieldSchema(r11)
            boolean r0 = isInitialized(r7, r13, r0)
            if (r0 != 0) goto Laa
            return r9
        L89:
            boolean r0 = r6.isListInitialized(r7, r13, r11)
            if (r0 != 0) goto Laa
            return r9
        L90:
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r15
            r4 = r16
            r5 = r14
            boolean r0 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r0 == 0) goto Laa
            com.google.crypto.tink.shaded.protobuf.Schema r0 = r6.getMessageFieldSchema(r11)
            boolean r0 = isInitialized(r7, r13, r0)
            if (r0 != 0) goto Laa
            return r9
        Laa:
            int r10 = r10 + 1
            r0 = r15
            r1 = r16
            goto Lb
        Lb1:
            boolean r0 = r6.hasExtensions
            if (r0 == 0) goto Lc2
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r0 = r6.extensionSchema
            com.google.crypto.tink.shaded.protobuf.FieldSet r0 = r0.getExtensions(r7)
            boolean r0 = r0.isInitialized()
            if (r0 != 0) goto Lc2
            return r9
        Lc2:
            return r3
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public void makeImmutable(T r8) {
            r7 = this;
            boolean r0 = isMutable(r8)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r8 instanceof com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
            if (r0 == 0) goto L17
            r0 = r8
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r0
            r0.clearMemoizedSerializedSize()
            r0.clearMemoizedHashCode()
            r0.markImmutable()
        L17:
            int[] r0 = r7.buffer
            int r0 = r0.length
            r1 = 0
        L1b:
            if (r1 >= r0) goto L5f
            int r2 = r7.typeAndOffsetAt(r1)
            long r3 = offset(r2)
            int r2 = type(r2)
            r5 = 9
            if (r2 == r5) goto L49
            switch(r2) {
                case 17: goto L49;
                case 18: goto L43;
                case 19: goto L43;
                case 20: goto L43;
                case 21: goto L43;
                case 22: goto L43;
                case 23: goto L43;
                case 24: goto L43;
                case 25: goto L43;
                case 26: goto L43;
                case 27: goto L43;
                case 28: goto L43;
                case 29: goto L43;
                case 30: goto L43;
                case 31: goto L43;
                case 32: goto L43;
                case 33: goto L43;
                case 34: goto L43;
                case 35: goto L43;
                case 36: goto L43;
                case 37: goto L43;
                case 38: goto L43;
                case 39: goto L43;
                case 40: goto L43;
                case 41: goto L43;
                case 42: goto L43;
                case 43: goto L43;
                case 44: goto L43;
                case 45: goto L43;
                case 46: goto L43;
                case 47: goto L43;
                case 48: goto L43;
                case 49: goto L43;
                case 50: goto L31;
                default: goto L30;
            }
        L30:
            goto L5c
        L31:
            sun.misc.Unsafe r2 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L5c
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r6 = r7.mapFieldSchema
            java.lang.Object r5 = r6.toImmutable(r5)
            r2.putObject(r8, r3, r5)
            goto L5c
        L43:
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r2 = r7.listFieldSchema
            r2.makeImmutableListAt(r8, r3)
            goto L5c
        L49:
            boolean r2 = r7.isFieldPresent(r8, r1)
            if (r2 == 0) goto L5c
            com.google.crypto.tink.shaded.protobuf.Schema r2 = r7.getMessageFieldSchema(r1)
            sun.misc.Unsafe r5 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.makeImmutable(r3)
        L5c:
            int r1 = r1 + 3
            goto L1b
        L5f:
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r0 = r7.unknownFieldSchema
            r0.makeImmutable(r8)
            boolean r0 = r7.hasExtensions
            if (r0 == 0) goto L6d
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r0 = r7.extensionSchema
            r0.makeImmutable(r8)
        L6d:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public void mergeFrom(T r7, com.google.crypto.tink.shaded.protobuf.Reader r8, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r9) throws java.io.IOException {
            r6 = this;
            r9.getClass()
            checkMutable(r7)
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r1 = r6.unknownFieldSchema
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r2 = r6.extensionSchema
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            r0.mergeFromHelper(r1, r2, r3, r4, r5)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public void mergeFrom(T r3, T r4) {
            r2 = this;
            checkMutable(r3)
            r4.getClass()
            r0 = 0
        L7:
            int[] r1 = r2.buffer
            int r1 = r1.length
            if (r0 >= r1) goto L12
            r2.mergeSingleField(r3, r4, r0)
            int r0 = r0 + 3
            goto L7
        L12:
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r0 = r2.unknownFieldSchema
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.mergeUnknownFields(r0, r3, r4)
            boolean r0 = r2.hasExtensions
            if (r0 == 0) goto L20
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r0 = r2.extensionSchema
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.mergeExtensions(r0, r3, r4)
        L20:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public void mergeFrom(T r9, byte[] r10, int r11, int r12, com.google.crypto.tink.shaded.protobuf.ArrayDecoders.Registers r13) throws java.io.IOException {
            r8 = this;
            boolean r0 = r8.proto3
            if (r0 == 0) goto L8
            r8.parseProto3Message(r9, r10, r11, r12, r13)
            goto L12
        L8:
            r6 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r7 = r13
            r1.parseProto2Message(r2, r3, r4, r5, r6, r7)
        L12:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public T newInstance() {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.NewInstanceSchema r0 = r2.newInstanceSchema
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r2.defaultInstance
            java.lang.Object r0 = r0.newInstance(r1)
            return r0
    }

    int parseProto2Message(T r27, byte[] r28, int r29, int r30, int r31, com.google.crypto.tink.shaded.protobuf.ArrayDecoders.Registers r32) throws java.io.IOException {
            r26 = this;
            r15 = r26
            r14 = r27
            r12 = r28
            r13 = r30
            r11 = r31
            r9 = r32
            checkMutable(r27)
            sun.misc.Unsafe r10 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            r16 = 0
            r0 = r29
            r2 = r16
            r3 = r2
            r5 = r3
            r1 = -1
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L1d:
            if (r0 >= r13) goto L3fd
            int r3 = r0 + 1
            r0 = r12[r0]
            if (r0 >= 0) goto L2e
            int r0 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32(r0, r12, r3, r9)
            int r3 = r9.int1
            r4 = r3
            r3 = r0
            goto L2f
        L2e:
            r4 = r0
        L2f:
            int r0 = r4 >>> 3
            r8 = r4 & 7
            r7 = 3
            if (r0 <= r1) goto L3c
            int r2 = r2 / r7
            int r1 = r15.positionForFieldNumber(r0, r2)
            goto L40
        L3c:
            int r1 = r15.positionForFieldNumber(r0)
        L40:
            r2 = r1
            r1 = -1
            if (r2 != r1) goto L55
            r22 = r0
            r18 = r1
            r2 = r3
            r9 = r4
            r19 = r5
            r17 = r6
            r25 = r10
            r8 = r11
            r20 = r16
            goto L3a6
        L55:
            int[] r1 = r15.buffer
            int r19 = r2 + 1
            r1 = r1[r19]
            int r7 = type(r1)
            long r11 = offset(r1)
            r19 = r4
            r4 = 17
            r20 = r11
            if (r7 > r4) goto L2b4
            int[] r4 = r15.buffer
            int r12 = r2 + 2
            r4 = r4[r12]
            int r12 = r4 >>> 20
            r11 = 1
            int r12 = r11 << r12
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r11
            r17 = r12
            if (r4 == r6) goto L8c
            if (r6 == r11) goto L84
            long r11 = (long) r6
            r10.putInt(r14, r11, r5)
        L84:
            long r5 = (long) r4
            int r5 = r10.getInt(r14, r5)
            r12 = r4
            r11 = r5
            goto L8e
        L8c:
            r11 = r5
            r12 = r6
        L8e:
            r4 = 5
            switch(r7) {
                case 0: goto L280;
                case 1: goto L267;
                case 2: goto L240;
                case 3: goto L240;
                case 4: goto L226;
                case 5: goto L203;
                case 6: goto L1eb;
                case 7: goto L1c7;
                case 8: goto L1a2;
                case 9: goto L17c;
                case 10: goto L161;
                case 11: goto L226;
                case 12: goto L123;
                case 13: goto L1eb;
                case 14: goto L203;
                case 15: goto L105;
                case 16: goto Le1;
                case 17: goto L9f;
                default: goto L92;
            }
        L92:
            r7 = r28
            r22 = r0
            r6 = r2
            r29 = r12
            r12 = r19
            r18 = -1
            goto L2a6
        L9f:
            r5 = 3
            if (r8 != r5) goto Ld4
            java.lang.Object r7 = r15.mutableMessageFieldForMerge(r14, r2)
            int r1 = r0 << 3
            r5 = r1 | 4
            com.google.crypto.tink.shaded.protobuf.Schema r1 = r15.getMessageFieldSchema(r2)
            r22 = r0
            r0 = r7
            r18 = -1
            r8 = r2
            r2 = r28
            r6 = r19
            r4 = r30
            r29 = r12
            r12 = r6
            r6 = r32
            int r0 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.mergeGroupField(r0, r1, r2, r3, r4, r5, r6)
            r15.storeMessageField(r14, r8, r7)
            r5 = r11 | r17
            r6 = r29
            r11 = r31
            r2 = r8
            r3 = r12
            r1 = r22
            r12 = r28
            goto L1d
        Ld4:
            r22 = r0
            r29 = r12
            r12 = r19
            r18 = -1
            r7 = r28
            r6 = r2
            goto L2a6
        Le1:
            r22 = r0
            r6 = r2
            r29 = r12
            r12 = r19
            r18 = -1
            r7 = r28
            if (r8 != 0) goto L2a6
            r4 = r20
            int r8 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint64(r7, r3, r9)
            long r0 = r9.long1
            long r19 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.decodeZigZag64(r0)
            r0 = r10
            r1 = r27
            r2 = r4
            r4 = r19
            r0.putLong(r1, r2, r4)
            goto L260
        L105:
            r7 = r28
            r22 = r0
            r6 = r2
            r29 = r12
            r12 = r19
            r4 = r20
            r18 = -1
            if (r8 != 0) goto L2a6
            int r0 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32(r7, r3, r9)
            int r1 = r9.int1
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.decodeZigZag32(r1)
            r10.putInt(r14, r4, r1)
            goto L299
        L123:
            r7 = r28
            r22 = r0
            r6 = r2
            r29 = r12
            r12 = r19
            r4 = r20
            r18 = -1
            if (r8 != 0) goto L2a6
            int r0 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32(r7, r3, r9)
            int r1 = r9.int1
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r2 = r15.getEnumFieldVerifier(r6)
            if (r2 == 0) goto L15c
            boolean r2 = r2.isInRange(r1)
            if (r2 == 0) goto L145
            goto L15c
        L145:
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r2 = getMutableUnknownFields(r27)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.storeField(r12, r1)
            r2 = r6
            r5 = r11
            r3 = r12
            r1 = r22
            r6 = r29
            r11 = r31
            goto L2a3
        L15c:
            r10.putInt(r14, r4, r1)
            goto L299
        L161:
            r7 = r28
            r22 = r0
            r6 = r2
            r29 = r12
            r12 = r19
            r4 = r20
            r0 = 2
            r18 = -1
            if (r8 != r0) goto L2a6
            int r0 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeBytes(r7, r3, r9)
            java.lang.Object r1 = r9.object1
            r10.putObject(r14, r4, r1)
            goto L299
        L17c:
            r7 = r28
            r22 = r0
            r6 = r2
            r29 = r12
            r12 = r19
            r0 = 2
            r18 = -1
            if (r8 != r0) goto L2a6
            java.lang.Object r8 = r15.mutableMessageFieldForMerge(r14, r6)
            com.google.crypto.tink.shaded.protobuf.Schema r1 = r15.getMessageFieldSchema(r6)
            r0 = r8
            r2 = r28
            r4 = r30
            r5 = r32
            int r0 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.mergeMessageField(r0, r1, r2, r3, r4, r5)
            r15.storeMessageField(r14, r6, r8)
            goto L299
        L1a2:
            r7 = r28
            r22 = r0
            r6 = r2
            r29 = r12
            r12 = r19
            r4 = r20
            r0 = 2
            r18 = -1
            if (r8 != r0) goto L2a6
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r1
            if (r0 != 0) goto L1bc
            int r0 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeString(r7, r3, r9)
            goto L1c0
        L1bc:
            int r0 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeStringRequireUtf8(r7, r3, r9)
        L1c0:
            java.lang.Object r1 = r9.object1
            r10.putObject(r14, r4, r1)
            goto L299
        L1c7:
            r7 = r28
            r22 = r0
            r6 = r2
            r29 = r12
            r12 = r19
            r4 = r20
            r18 = -1
            if (r8 != 0) goto L2a6
            int r0 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint64(r7, r3, r9)
            long r1 = r9.long1
            r19 = 0
            int r1 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r1 == 0) goto L1e4
            r1 = 1
            goto L1e6
        L1e4:
            r1 = r16
        L1e6:
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putBoolean(r14, r4, r1)
            goto L299
        L1eb:
            r7 = r28
            r22 = r0
            r6 = r2
            r29 = r12
            r12 = r19
            r1 = r20
            r18 = -1
            if (r8 != r4) goto L2a6
            int r0 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeFixed32(r7, r3)
            r10.putInt(r14, r1, r0)
            goto L27d
        L203:
            r7 = r28
            r22 = r0
            r6 = r2
            r29 = r12
            r12 = r19
            r1 = r20
            r0 = 1
            r18 = -1
            if (r8 != r0) goto L2a6
            long r4 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeFixed64(r7, r3)
            r0 = r10
            r20 = r1
            r1 = r27
            r8 = r3
            r2 = r20
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L299
        L226:
            r7 = r28
            r22 = r0
            r6 = r2
            r29 = r12
            r12 = r19
            r18 = -1
            if (r8 != 0) goto L2a6
            int r0 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32(r7, r3, r9)
            int r1 = r9.int1
            r4 = r20
            r10.putInt(r14, r4, r1)
            goto L299
        L240:
            r7 = r28
            r22 = r0
            r6 = r2
            r29 = r12
            r12 = r19
            r4 = r20
            r18 = -1
            if (r8 != 0) goto L2a6
            int r8 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint64(r7, r3, r9)
            long r2 = r9.long1
            r0 = r10
            r1 = r27
            r19 = r2
            r2 = r4
            r4 = r19
            r0.putLong(r1, r2, r4)
        L260:
            r5 = r11 | r17
            r11 = r31
            r2 = r6
            r0 = r8
            goto L29e
        L267:
            r7 = r28
            r22 = r0
            r6 = r2
            r29 = r12
            r12 = r19
            r0 = r20
            r18 = -1
            if (r8 != r4) goto L2a6
            float r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeFloat(r7, r3)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putFloat(r14, r0, r2)
        L27d:
            int r0 = r3 + 4
            goto L299
        L280:
            r7 = r28
            r22 = r0
            r6 = r2
            r29 = r12
            r12 = r19
            r0 = r20
            r2 = 1
            r18 = -1
            if (r8 != r2) goto L2a6
            double r4 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeDouble(r7, r3)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putDouble(r14, r0, r4)
            int r0 = r3 + 8
        L299:
            r5 = r11 | r17
            r11 = r31
            r2 = r6
        L29e:
            r3 = r12
            r1 = r22
            r6 = r29
        L2a3:
            r12 = r7
            goto L1d
        L2a6:
            r17 = r29
            r8 = r31
            r2 = r3
            r20 = r6
            r25 = r10
            r19 = r11
            r9 = r12
            goto L3a6
        L2b4:
            r22 = r0
            r11 = r2
            r17 = r6
            r12 = r19
            r18 = -1
            r19 = r5
            r5 = r20
            r0 = 27
            if (r7 != r0) goto L30d
            r0 = 2
            if (r8 != r0) goto L304
            java.lang.Object r0 = r10.getObject(r14, r5)
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r0 = (com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList) r0
            boolean r1 = r0.isModifiable()
            if (r1 != 0) goto L2e6
            int r1 = r0.size()
            if (r1 != 0) goto L2dd
            r1 = 10
            goto L2df
        L2dd:
            int r1 = r1 * 2
        L2df:
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r0 = r0.mutableCopyWithCapacity(r1)
            r10.putObject(r14, r5, r0)
        L2e6:
            r5 = r0
            com.google.crypto.tink.shaded.protobuf.Schema r0 = r15.getMessageFieldSchema(r11)
            r1 = r12
            r2 = r28
            r4 = r30
            r6 = r32
            int r0 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeMessageList(r0, r1, r2, r3, r4, r5, r6)
            r2 = r11
            r3 = r12
            r6 = r17
            r5 = r19
            r1 = r22
            r12 = r28
            r11 = r31
            goto L1d
        L304:
            r15 = r3
            r25 = r10
            r20 = r11
            r21 = r12
            goto L37f
        L30d:
            r0 = 49
            if (r7 > r0) goto L355
            long r1 = (long) r1
            r0 = r26
            r20 = r1
            r1 = r27
            r2 = r28
            r4 = r3
            r15 = r4
            r4 = r30
            r23 = r5
            r5 = r12
            r6 = r22
            r29 = r7
            r7 = r8
            r8 = r11
            r25 = r10
            r9 = r20
            r20 = r11
            r11 = r29
            r21 = r12
            r12 = r23
            r14 = r32
            int r0 = r0.parseRepeatedField(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L3a2
        L33b:
            r15 = r26
            r14 = r27
            r12 = r28
            r13 = r30
            r11 = r31
            r9 = r32
            r6 = r17
            r5 = r19
            r2 = r20
            r3 = r21
            r1 = r22
            r10 = r25
            goto L1d
        L355:
            r15 = r3
            r23 = r5
            r29 = r7
            r25 = r10
            r20 = r11
            r21 = r12
            r0 = 50
            r9 = r29
            if (r9 != r0) goto L385
            r0 = 2
            if (r8 != r0) goto L37f
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r15
            r4 = r30
            r5 = r20
            r6 = r23
            r8 = r32
            int r0 = r0.parseMapField(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L3a2
            goto L33b
        L37f:
            r8 = r31
            r2 = r15
        L382:
            r9 = r21
            goto L3a6
        L385:
            r0 = r26
            r10 = r1
            r1 = r27
            r2 = r28
            r3 = r15
            r4 = r30
            r5 = r21
            r6 = r22
            r7 = r8
            r8 = r10
            r10 = r23
            r12 = r20
            r13 = r32
            int r0 = r0.parseOneofField(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L3a2
            goto L33b
        L3a2:
            r8 = r31
            r2 = r0
            goto L382
        L3a6:
            if (r9 != r8) goto L3b6
            if (r8 == 0) goto L3b6
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r26
            r6 = r2
            r0 = r17
            r5 = r19
            goto L40c
        L3b6:
            r10 = r26
            boolean r0 = r10.hasExtensions
            r11 = r32
            if (r0 == 0) goto L3d8
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = r11.extensionRegistry
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            if (r0 == r1) goto L3d8
            com.google.crypto.tink.shaded.protobuf.MessageLite r5 = r10.defaultInstance
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r6 = r10.unknownFieldSchema
            r0 = r9
            r1 = r28
            r3 = r30
            r4 = r27
            r7 = r32
            int r0 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeExtensionOrUnknownField(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L3e7
        L3d8:
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r4 = getMutableUnknownFields(r27)
            r0 = r9
            r1 = r28
            r3 = r30
            r5 = r32
            int r0 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeUnknownField(r0, r1, r2, r3, r4, r5)
        L3e7:
            r14 = r27
            r12 = r28
            r13 = r30
            r3 = r9
            r15 = r10
            r9 = r11
            r6 = r17
            r5 = r19
            r2 = r20
            r1 = r22
            r10 = r25
            r11 = r8
            goto L1d
        L3fd:
            r19 = r5
            r17 = r6
            r25 = r10
            r8 = r11
            r10 = r15
            r6 = r0
            r9 = r3
            r0 = r17
            r1 = 1048575(0xfffff, float:1.469367E-39)
        L40c:
            if (r0 == r1) goto L417
            long r0 = (long) r0
            r7 = r27
            r2 = r25
            r2.putInt(r7, r0, r5)
            goto L419
        L417:
            r7 = r27
        L419:
            int r0 = r10.checkInitializedCount
            r1 = 0
            r11 = r0
            r3 = r1
        L41e:
            int r0 = r10.repeatedFieldOffsetStart
            if (r11 >= r0) goto L438
            int[] r0 = r10.intArray
            r2 = r0[r11]
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r4 = r10.unknownFieldSchema
            r0 = r26
            r1 = r27
            r5 = r27
            java.lang.Object r0 = r0.filterMapUnknownEnumValues(r1, r2, r3, r4, r5)
            r3 = r0
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r3 = (com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite) r3
            int r11 = r11 + 1
            goto L41e
        L438:
            if (r3 == 0) goto L43f
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r0 = r10.unknownFieldSchema
            r0.setBuilderToMessage(r7, r3)
        L43f:
            if (r8 != 0) goto L44b
            r0 = r30
            if (r6 != r0) goto L446
            goto L451
        L446:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r0
        L44b:
            r0 = r30
            if (r6 > r0) goto L452
            if (r9 != r8) goto L452
        L451:
            return r6
        L452:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public void writeTo(T r3, com.google.crypto.tink.shaded.protobuf.Writer r4) throws java.io.IOException {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.Writer$FieldOrder r0 = r4.fieldOrder()
            com.google.crypto.tink.shaded.protobuf.Writer$FieldOrder r1 = com.google.crypto.tink.shaded.protobuf.Writer.FieldOrder.DESCENDING
            if (r0 != r1) goto Lc
            r2.writeFieldsInDescendingOrder(r3, r4)
            goto L17
        Lc:
            boolean r0 = r2.proto3
            if (r0 == 0) goto L14
            r2.writeFieldsInAscendingOrderProto3(r3, r4)
            goto L17
        L14:
            r2.writeFieldsInAscendingOrderProto2(r3, r4)
        L17:
            return
    }
}
