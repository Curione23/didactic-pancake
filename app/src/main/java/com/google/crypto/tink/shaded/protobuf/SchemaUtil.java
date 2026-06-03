package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
final class SchemaUtil {
    private static final int DEFAULT_LOOK_UP_START_NUMBER = 40;
    private static final java.lang.Class<?> GENERATED_MESSAGE_CLASS = null;
    private static final com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> PROTO2_UNKNOWN_FIELD_SET_SCHEMA = null;
    private static final com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> PROTO3_UNKNOWN_FIELD_SET_SCHEMA = null;
    private static final com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> UNKNOWN_FIELD_SET_LITE_SCHEMA = null;

    static {
            java.lang.Class r0 = getGeneratedMessageClass()
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.GENERATED_MESSAGE_CLASS = r0
            r0 = 0
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema r0 = getUnknownFieldSetSchema(r0)
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.PROTO2_UNKNOWN_FIELD_SET_SCHEMA = r0
            r0 = 1
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema r0 = getUnknownFieldSetSchema(r0)
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.PROTO3_UNKNOWN_FIELD_SET_SCHEMA = r0
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLiteSchema r0 = new com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLiteSchema
            r0.<init>()
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.UNKNOWN_FIELD_SET_LITE_SCHEMA = r0
            return
    }

    private SchemaUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    static int computeSizeBoolList(int r0, java.util.List<?> r1, boolean r2) {
            int r1 = r1.size()
            if (r1 != 0) goto L8
            r0 = 0
            return r0
        L8:
            if (r2 == 0) goto L14
            int r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r0)
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(r1)
            int r0 = r0 + r1
            return r0
        L14:
            r2 = 1
            int r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBoolSize(r0, r2)
            int r1 = r1 * r0
            return r1
    }

    static int computeSizeBoolListNoTag(java.util.List<?> r0) {
            int r0 = r0.size()
            return r0
    }

    static int computeSizeByteStringList(int r2, java.util.List<com.google.crypto.tink.shaded.protobuf.ByteString> r3) {
            int r0 = r3.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r2)
            int r0 = r0 * r2
        Ld:
            int r2 = r3.size()
            if (r1 >= r2) goto L21
            java.lang.Object r2 = r3.get(r1)
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = (com.google.crypto.tink.shaded.protobuf.ByteString) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBytesSizeNoTag(r2)
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto Ld
        L21:
            return r0
    }

    static int computeSizeEnumList(int r1, java.util.List<java.lang.Integer> r2, boolean r3) {
            int r0 = r2.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r2 = computeSizeEnumListNoTag(r2)
            if (r3 == 0) goto L18
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r1)
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(r2)
            int r1 = r1 + r2
            return r1
        L18:
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r1)
            int r0 = r0 * r1
            int r2 = r2 + r0
            return r2
    }

    static int computeSizeEnumListNoTag(java.util.List<java.lang.Integer> r4) {
            int r0 = r4.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r4 instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList
            if (r2 == 0) goto L1d
            com.google.crypto.tink.shaded.protobuf.IntArrayList r4 = (com.google.crypto.tink.shaded.protobuf.IntArrayList) r4
            r2 = r1
        Lf:
            if (r1 >= r0) goto L32
            int r3 = r4.getInt(r1)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeEnumSizeNoTag(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L1d:
            r2 = r1
        L1e:
            if (r1 >= r0) goto L32
            java.lang.Object r3 = r4.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeEnumSizeNoTag(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    static int computeSizeFixed32List(int r1, java.util.List<?> r2, boolean r3) {
            int r2 = r2.size()
            r0 = 0
            if (r2 != 0) goto L8
            return r0
        L8:
            if (r3 == 0) goto L16
            int r2 = r2 * 4
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r1)
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(r2)
            int r1 = r1 + r2
            return r1
        L16:
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFixed32Size(r1, r0)
            int r2 = r2 * r1
            return r2
    }

    static int computeSizeFixed32ListNoTag(java.util.List<?> r0) {
            int r0 = r0.size()
            int r0 = r0 * 4
            return r0
    }

    static int computeSizeFixed64List(int r2, java.util.List<?> r3, boolean r4) {
            int r3 = r3.size()
            if (r3 != 0) goto L8
            r2 = 0
            return r2
        L8:
            if (r4 == 0) goto L16
            int r3 = r3 * 8
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r2)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(r3)
            int r2 = r2 + r3
            return r2
        L16:
            r0 = 0
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFixed64Size(r2, r0)
            int r3 = r3 * r2
            return r3
    }

    static int computeSizeFixed64ListNoTag(java.util.List<?> r0) {
            int r0 = r0.size()
            int r0 = r0 * 8
            return r0
    }

    static int computeSizeGroupList(int r4, java.util.List<com.google.crypto.tink.shaded.protobuf.MessageLite> r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r2 = r1
        L9:
            if (r1 >= r0) goto L19
            java.lang.Object r3 = r5.get(r1)
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeGroupSize(r4, r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L9
        L19:
            return r2
    }

    static int computeSizeGroupList(int r4, java.util.List<com.google.crypto.tink.shaded.protobuf.MessageLite> r5, com.google.crypto.tink.shaded.protobuf.Schema r6) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r2 = r1
        L9:
            if (r1 >= r0) goto L19
            java.lang.Object r3 = r5.get(r1)
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeGroupSize(r4, r3, r6)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L9
        L19:
            return r2
    }

    static int computeSizeInt32List(int r1, java.util.List<java.lang.Integer> r2, boolean r3) {
            int r0 = r2.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r2 = computeSizeInt32ListNoTag(r2)
            if (r3 == 0) goto L18
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r1)
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(r2)
            int r1 = r1 + r2
            return r1
        L18:
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r1)
            int r0 = r0 * r1
            int r2 = r2 + r0
            return r2
    }

    static int computeSizeInt32ListNoTag(java.util.List<java.lang.Integer> r4) {
            int r0 = r4.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r4 instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList
            if (r2 == 0) goto L1d
            com.google.crypto.tink.shaded.protobuf.IntArrayList r4 = (com.google.crypto.tink.shaded.protobuf.IntArrayList) r4
            r2 = r1
        Lf:
            if (r1 >= r0) goto L32
            int r3 = r4.getInt(r1)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeInt32SizeNoTag(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L1d:
            r2 = r1
        L1e:
            if (r1 >= r0) goto L32
            java.lang.Object r3 = r4.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeInt32SizeNoTag(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    static int computeSizeInt64List(int r1, java.util.List<java.lang.Long> r2, boolean r3) {
            int r0 = r2.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r0 = computeSizeInt64ListNoTag(r2)
            if (r3 == 0) goto L18
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r1)
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(r0)
            int r1 = r1 + r2
            return r1
        L18:
            int r2 = r2.size()
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r1)
            int r2 = r2 * r1
            int r0 = r0 + r2
            return r0
    }

    static int computeSizeInt64ListNoTag(java.util.List<java.lang.Long> r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList
            if (r2 == 0) goto L1d
            com.google.crypto.tink.shaded.protobuf.LongArrayList r5 = (com.google.crypto.tink.shaded.protobuf.LongArrayList) r5
            r2 = r1
        Lf:
            if (r1 >= r0) goto L32
            long r3 = r5.getLong(r1)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeInt64SizeNoTag(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L1d:
            r2 = r1
        L1e:
            if (r1 >= r0) goto L32
            java.lang.Object r3 = r5.get(r1)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeInt64SizeNoTag(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    static int computeSizeMessage(int r1, java.lang.Object r2, com.google.crypto.tink.shaded.protobuf.Schema r3) {
            boolean r0 = r2 instanceof com.google.crypto.tink.shaded.protobuf.LazyFieldLite
            if (r0 == 0) goto Lb
            com.google.crypto.tink.shaded.protobuf.LazyFieldLite r2 = (com.google.crypto.tink.shaded.protobuf.LazyFieldLite) r2
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeLazyFieldSize(r1, r2)
            return r1
        Lb:
            com.google.crypto.tink.shaded.protobuf.MessageLite r2 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r2
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeMessageSize(r1, r2, r3)
            return r1
    }

    static int computeSizeMessageList(int r4, java.util.List<?> r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r4)
            int r4 = r4 * r0
        Ld:
            if (r1 >= r0) goto L28
            java.lang.Object r2 = r5.get(r1)
            boolean r3 = r2 instanceof com.google.crypto.tink.shaded.protobuf.LazyFieldLite
            if (r3 == 0) goto L1e
            com.google.crypto.tink.shaded.protobuf.LazyFieldLite r2 = (com.google.crypto.tink.shaded.protobuf.LazyFieldLite) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeLazyFieldSizeNoTag(r2)
            goto L24
        L1e:
            com.google.crypto.tink.shaded.protobuf.MessageLite r2 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeMessageSizeNoTag(r2)
        L24:
            int r4 = r4 + r2
            int r1 = r1 + 1
            goto Ld
        L28:
            return r4
    }

    static int computeSizeMessageList(int r4, java.util.List<?> r5, com.google.crypto.tink.shaded.protobuf.Schema r6) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r4)
            int r4 = r4 * r0
        Ld:
            if (r1 >= r0) goto L28
            java.lang.Object r2 = r5.get(r1)
            boolean r3 = r2 instanceof com.google.crypto.tink.shaded.protobuf.LazyFieldLite
            if (r3 == 0) goto L1e
            com.google.crypto.tink.shaded.protobuf.LazyFieldLite r2 = (com.google.crypto.tink.shaded.protobuf.LazyFieldLite) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeLazyFieldSizeNoTag(r2)
            goto L24
        L1e:
            com.google.crypto.tink.shaded.protobuf.MessageLite r2 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeMessageSizeNoTag(r2, r6)
        L24:
            int r4 = r4 + r2
            int r1 = r1 + 1
            goto Ld
        L28:
            return r4
    }

    static int computeSizeSInt32List(int r1, java.util.List<java.lang.Integer> r2, boolean r3) {
            int r0 = r2.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r2 = computeSizeSInt32ListNoTag(r2)
            if (r3 == 0) goto L18
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r1)
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(r2)
            int r1 = r1 + r2
            return r1
        L18:
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r1)
            int r0 = r0 * r1
            int r2 = r2 + r0
            return r2
    }

    static int computeSizeSInt32ListNoTag(java.util.List<java.lang.Integer> r4) {
            int r0 = r4.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r4 instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList
            if (r2 == 0) goto L1d
            com.google.crypto.tink.shaded.protobuf.IntArrayList r4 = (com.google.crypto.tink.shaded.protobuf.IntArrayList) r4
            r2 = r1
        Lf:
            if (r1 >= r0) goto L32
            int r3 = r4.getInt(r1)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSInt32SizeNoTag(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L1d:
            r2 = r1
        L1e:
            if (r1 >= r0) goto L32
            java.lang.Object r3 = r4.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSInt32SizeNoTag(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    static int computeSizeSInt64List(int r1, java.util.List<java.lang.Long> r2, boolean r3) {
            int r0 = r2.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r2 = computeSizeSInt64ListNoTag(r2)
            if (r3 == 0) goto L18
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r1)
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(r2)
            int r1 = r1 + r2
            return r1
        L18:
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r1)
            int r0 = r0 * r1
            int r2 = r2 + r0
            return r2
    }

    static int computeSizeSInt64ListNoTag(java.util.List<java.lang.Long> r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList
            if (r2 == 0) goto L1d
            com.google.crypto.tink.shaded.protobuf.LongArrayList r5 = (com.google.crypto.tink.shaded.protobuf.LongArrayList) r5
            r2 = r1
        Lf:
            if (r1 >= r0) goto L32
            long r3 = r5.getLong(r1)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSInt64SizeNoTag(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L1d:
            r2 = r1
        L1e:
            if (r1 >= r0) goto L32
            java.lang.Object r3 = r5.get(r1)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSInt64SizeNoTag(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    static int computeSizeStringList(int r4, java.util.List<?> r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r4)
            int r4 = r4 * r0
            boolean r2 = r5 instanceof com.google.crypto.tink.shaded.protobuf.LazyStringList
            if (r2 == 0) goto L2e
            com.google.crypto.tink.shaded.protobuf.LazyStringList r5 = (com.google.crypto.tink.shaded.protobuf.LazyStringList) r5
        L13:
            if (r1 >= r0) goto L49
            java.lang.Object r2 = r5.getRaw(r1)
            boolean r3 = r2 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r3 == 0) goto L24
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = (com.google.crypto.tink.shaded.protobuf.ByteString) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBytesSizeNoTag(r2)
            goto L2a
        L24:
            java.lang.String r2 = (java.lang.String) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeStringSizeNoTag(r2)
        L2a:
            int r4 = r4 + r2
            int r1 = r1 + 1
            goto L13
        L2e:
            if (r1 >= r0) goto L49
            java.lang.Object r2 = r5.get(r1)
            boolean r3 = r2 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r3 == 0) goto L3f
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = (com.google.crypto.tink.shaded.protobuf.ByteString) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBytesSizeNoTag(r2)
            goto L45
        L3f:
            java.lang.String r2 = (java.lang.String) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeStringSizeNoTag(r2)
        L45:
            int r4 = r4 + r2
            int r1 = r1 + 1
            goto L2e
        L49:
            return r4
    }

    static int computeSizeUInt32List(int r1, java.util.List<java.lang.Integer> r2, boolean r3) {
            int r0 = r2.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r2 = computeSizeUInt32ListNoTag(r2)
            if (r3 == 0) goto L18
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r1)
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(r2)
            int r1 = r1 + r2
            return r1
        L18:
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r1)
            int r0 = r0 * r1
            int r2 = r2 + r0
            return r2
    }

    static int computeSizeUInt32ListNoTag(java.util.List<java.lang.Integer> r4) {
            int r0 = r4.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r4 instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList
            if (r2 == 0) goto L1d
            com.google.crypto.tink.shaded.protobuf.IntArrayList r4 = (com.google.crypto.tink.shaded.protobuf.IntArrayList) r4
            r2 = r1
        Lf:
            if (r1 >= r0) goto L32
            int r3 = r4.getInt(r1)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L1d:
            r2 = r1
        L1e:
            if (r1 >= r0) goto L32
            java.lang.Object r3 = r4.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    static int computeSizeUInt64List(int r1, java.util.List<java.lang.Long> r2, boolean r3) {
            int r0 = r2.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r2 = computeSizeUInt64ListNoTag(r2)
            if (r3 == 0) goto L18
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r1)
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(r2)
            int r1 = r1 + r2
            return r1
        L18:
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r1)
            int r0 = r0 * r1
            int r2 = r2 + r0
            return r2
    }

    static int computeSizeUInt64ListNoTag(java.util.List<java.lang.Long> r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList
            if (r2 == 0) goto L1d
            com.google.crypto.tink.shaded.protobuf.LongArrayList r5 = (com.google.crypto.tink.shaded.protobuf.LongArrayList) r5
            r2 = r1
        Lf:
            if (r1 >= r0) goto L32
            long r3 = r5.getLong(r1)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt64SizeNoTag(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L1d:
            r2 = r1
        L1e:
            if (r1 >= r0) goto L32
            java.lang.Object r3 = r5.get(r1)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt64SizeNoTag(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    static <UT, UB> UB filterUnknownEnumList(java.lang.Object r5, int r6, java.util.List<java.lang.Integer> r7, com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<?> r8, UB r9, com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<UT, UB> r10) {
            if (r8 != 0) goto L3
            return r9
        L3:
            boolean r0 = r7 instanceof java.util.RandomAccess
            if (r0 == 0) goto L3c
            int r0 = r7.size()
            r1 = 0
            r2 = r1
        Ld:
            if (r1 >= r0) goto L32
            java.lang.Object r3 = r7.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            com.google.crypto.tink.shaded.protobuf.Internal$EnumLite r4 = r8.findValueByNumber(r3)
            if (r4 == 0) goto L2b
            if (r1 == r2) goto L28
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.set(r2, r3)
        L28:
            int r2 = r2 + 1
            goto L2f
        L2b:
            java.lang.Object r9 = storeUnknownEnum(r5, r6, r3, r9, r10)
        L2f:
            int r1 = r1 + 1
            goto Ld
        L32:
            if (r2 == r0) goto L5e
            java.util.List r5 = r7.subList(r2, r0)
            r5.clear()
            goto L5e
        L3c:
            java.util.Iterator r7 = r7.iterator()
        L40:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r7.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            com.google.crypto.tink.shaded.protobuf.Internal$EnumLite r1 = r8.findValueByNumber(r0)
            if (r1 != 0) goto L40
            java.lang.Object r9 = storeUnknownEnum(r5, r6, r0, r9, r10)
            r7.remove()
            goto L40
        L5e:
            return r9
    }

    static <UT, UB> UB filterUnknownEnumList(java.lang.Object r5, int r6, java.util.List<java.lang.Integer> r7, com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier r8, UB r9, com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<UT, UB> r10) {
            if (r8 != 0) goto L3
            return r9
        L3:
            boolean r0 = r7 instanceof java.util.RandomAccess
            if (r0 == 0) goto L3c
            int r0 = r7.size()
            r1 = 0
            r2 = r1
        Ld:
            if (r1 >= r0) goto L32
            java.lang.Object r3 = r7.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            boolean r4 = r8.isInRange(r3)
            if (r4 == 0) goto L2b
            if (r1 == r2) goto L28
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.set(r2, r3)
        L28:
            int r2 = r2 + 1
            goto L2f
        L2b:
            java.lang.Object r9 = storeUnknownEnum(r5, r6, r3, r9, r10)
        L2f:
            int r1 = r1 + 1
            goto Ld
        L32:
            if (r2 == r0) goto L5e
            java.util.List r5 = r7.subList(r2, r0)
            r5.clear()
            goto L5e
        L3c:
            java.util.Iterator r7 = r7.iterator()
        L40:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r7.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            boolean r1 = r8.isInRange(r0)
            if (r1 != 0) goto L40
            java.lang.Object r9 = storeUnknownEnum(r5, r6, r0, r9, r10)
            r7.remove()
            goto L40
        L5e:
            return r9
    }

    private static java.lang.Class<?> getGeneratedMessageClass() {
            java.lang.String r0 = "com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    static java.lang.Object getMapDefaultEntry(java.lang.Class<?> r4, java.lang.String r5) {
            java.lang.String r0 = "Unable to look up map field default entry holder class for "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r1.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r2 = r4.getName()     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r2 = "$"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L5c
            r2 = 1
            java.lang.String r3 = toCamelCase(r5, r2)     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r3 = "DefaultEntryHolder"
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L5c
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L5c
            java.lang.reflect.Field[] r1 = r1.getDeclaredFields()     // Catch: java.lang.Throwable -> L5c
            int r3 = r1.length     // Catch: java.lang.Throwable -> L5c
            if (r3 != r2) goto L3b
            r4 = 0
            r4 = r1[r4]     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getStaticObject(r4)     // Catch: java.lang.Throwable -> L5c
            return r4
        L3b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r5 = r2.append(r5)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = " in "
            java.lang.StringBuilder r5 = r5.append(r0)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r4 = r5.append(r4)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L5c
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L5c
            throw r1     // Catch: java.lang.Throwable -> L5c
        L5c:
            r4 = move-exception
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            r5.<init>(r4)
            throw r5
    }

    private static com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> getUnknownFieldSetSchema(boolean r5) {
            r0 = 0
            java.lang.Class r1 = getUnknownFieldSetSchemaClass()     // Catch: java.lang.Throwable -> L23
            if (r1 != 0) goto L8
            return r0
        L8:
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L23
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L23
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Throwable -> L23
            java.lang.reflect.Constructor r1 = r1.getConstructor(r2)     // Catch: java.lang.Throwable -> L23
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L23
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L23
            java.lang.Object r5 = r1.newInstance(r5)     // Catch: java.lang.Throwable -> L23
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema r5 = (com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema) r5     // Catch: java.lang.Throwable -> L23
            return r5
        L23:
            return r0
    }

    private static java.lang.Class<?> getUnknownFieldSetSchemaClass() {
            java.lang.String r0 = "com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    static <T, FT extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<FT>> void mergeExtensions(com.google.crypto.tink.shaded.protobuf.ExtensionSchema<FT> r1, T r2, T r3) {
            com.google.crypto.tink.shaded.protobuf.FieldSet r3 = r1.getExtensions(r3)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L11
            com.google.crypto.tink.shaded.protobuf.FieldSet r1 = r1.getMutableExtensions(r2)
            r1.mergeFrom(r3)
        L11:
            return
    }

    static <T> void mergeMap(com.google.crypto.tink.shaded.protobuf.MapFieldSchema r1, T r2, T r3, long r4) {
            java.lang.Object r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r2, r4)
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r3, r4)
            java.lang.Object r1 = r1.mergeFrom(r0, r3)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r2, r4, r1)
            return
    }

    static <T, UT, UB> void mergeUnknownFields(com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<UT, UB> r1, T r2, T r3) {
            java.lang.Object r0 = r1.getFromMessage(r2)
            java.lang.Object r3 = r1.getFromMessage(r3)
            java.lang.Object r3 = r1.merge(r0, r3)
            r1.setToMessage(r2, r3)
            return
    }

    public static com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> proto2UnknownFieldSetSchema() {
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r0 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.PROTO2_UNKNOWN_FIELD_SET_SCHEMA
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> proto3UnknownFieldSetSchema() {
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r0 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.PROTO3_UNKNOWN_FIELD_SET_SCHEMA
            return r0
    }

    public static void requireGeneratedMessage(java.lang.Class<?> r1) {
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite> r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto L1b
            java.lang.Class<?> r0 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.GENERATED_MESSAGE_CLASS
            if (r0 == 0) goto L1b
            boolean r1 = r0.isAssignableFrom(r1)
            if (r1 == 0) goto L13
            goto L1b
        L13:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Message classes must extend GeneratedMessageV3 or GeneratedMessageLite"
            r1.<init>(r0)
            throw r1
        L1b:
            return
    }

    static boolean safeEquals(java.lang.Object r0, java.lang.Object r1) {
            if (r0 == r1) goto Ld
            if (r0 == 0) goto Lb
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    public static boolean shouldUseTableSwitch(int r10, int r11, int r12) {
            r0 = 40
            r1 = 1
            if (r11 >= r0) goto L6
            return r1
        L6:
            long r2 = (long) r11
            long r10 = (long) r10
            long r2 = r2 - r10
            long r10 = (long) r12
            r4 = 2
            long r4 = r4 * r10
            r6 = 3
            long r4 = r4 + r6
            long r10 = r10 + r6
            r8 = 10
            long r2 = r2 + r8
            long r10 = r10 * r6
            long r4 = r4 + r10
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 > 0) goto L1b
            goto L1c
        L1b:
            r1 = 0
        L1c:
            return r1
    }

    public static boolean shouldUseTableSwitch(com.google.crypto.tink.shaded.protobuf.FieldInfo[] r2) {
            int r0 = r2.length
            r1 = 0
            if (r0 != 0) goto L5
            return r1
        L5:
            r0 = r2[r1]
            int r0 = r0.getFieldNumber()
            int r1 = r2.length
            int r1 = r1 + (-1)
            r1 = r2[r1]
            int r1 = r1.getFieldNumber()
            int r2 = r2.length
            boolean r2 = shouldUseTableSwitch(r0, r1, r2)
            return r2
    }

    static <UT, UB> UB storeUnknownEnum(java.lang.Object r2, int r3, int r4, UB r5, com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<UT, UB> r6) {
            if (r5 != 0) goto L6
            java.lang.Object r5 = r6.getBuilderFromMessage(r2)
        L6:
            long r0 = (long) r4
            r6.addVarint(r5, r3, r0)
            return r5
    }

    static java.lang.String toCamelCase(java.lang.String r5, boolean r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            int r3 = r5.length()
            if (r2 >= r3) goto L4e
            char r3 = r5.charAt(r2)
            r4 = 97
            if (r4 > r3) goto L27
            r4 = 122(0x7a, float:1.71E-43)
            if (r3 > r4) goto L27
            if (r6 == 0) goto L22
            int r3 = r3 + (-32)
            char r6 = (char) r3
            r0.append(r6)
            goto L25
        L22:
            r0.append(r3)
        L25:
            r6 = r1
            goto L4b
        L27:
            r4 = 65
            if (r4 > r3) goto L3e
            r4 = 90
            if (r3 > r4) goto L3e
            if (r2 != 0) goto L3a
            if (r6 != 0) goto L3a
            int r3 = r3 + 32
            char r6 = (char) r3
            r0.append(r6)
            goto L25
        L3a:
            r0.append(r3)
            goto L25
        L3e:
            r6 = 48
            r4 = 1
            if (r6 > r3) goto L4a
            r6 = 57
            if (r3 > r6) goto L4a
            r0.append(r3)
        L4a:
            r6 = r4
        L4b:
            int r2 = r2 + 1
            goto L7
        L4e:
            java.lang.String r5 = r0.toString()
            return r5
    }

    public static com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> unknownFieldSetLiteSchema() {
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r0 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.UNKNOWN_FIELD_SET_LITE_SCHEMA
            return r0
    }

    public static void writeBool(int r0, boolean r1, com.google.crypto.tink.shaded.protobuf.Writer r2) throws java.io.IOException {
            if (r1 == 0) goto L6
            r1 = 1
            r2.writeBool(r0, r1)
        L6:
            return
    }

    public static void writeBoolList(int r1, java.util.List<java.lang.Boolean> r2, com.google.crypto.tink.shaded.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeBoolList(r1, r2, r4)
        Lb:
            return
    }

    public static void writeBytes(int r1, com.google.crypto.tink.shaded.protobuf.ByteString r2, com.google.crypto.tink.shaded.protobuf.Writer r3) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeBytes(r1, r2)
        Lb:
            return
    }

    public static void writeBytesList(int r1, java.util.List<com.google.crypto.tink.shaded.protobuf.ByteString> r2, com.google.crypto.tink.shaded.protobuf.Writer r3) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeBytesList(r1, r2)
        Lb:
            return
    }

    public static void writeDouble(int r4, double r5, com.google.crypto.tink.shaded.protobuf.Writer r7) throws java.io.IOException {
            long r0 = java.lang.Double.doubleToRawLongBits(r5)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Ld
            r7.writeDouble(r4, r5)
        Ld:
            return
    }

    public static void writeDoubleList(int r1, java.util.List<java.lang.Double> r2, com.google.crypto.tink.shaded.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeDoubleList(r1, r2, r4)
        Lb:
            return
    }

    public static void writeEnum(int r0, int r1, com.google.crypto.tink.shaded.protobuf.Writer r2) throws java.io.IOException {
            if (r1 == 0) goto L5
            r2.writeEnum(r0, r1)
        L5:
            return
    }

    public static void writeEnumList(int r1, java.util.List<java.lang.Integer> r2, com.google.crypto.tink.shaded.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeEnumList(r1, r2, r4)
        Lb:
            return
    }

    public static void writeFixed32(int r0, int r1, com.google.crypto.tink.shaded.protobuf.Writer r2) throws java.io.IOException {
            if (r1 == 0) goto L5
            r2.writeFixed32(r0, r1)
        L5:
            return
    }

    public static void writeFixed32List(int r1, java.util.List<java.lang.Integer> r2, com.google.crypto.tink.shaded.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeFixed32List(r1, r2, r4)
        Lb:
            return
    }

    public static void writeFixed64(int r2, long r3, com.google.crypto.tink.shaded.protobuf.Writer r5) throws java.io.IOException {
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L9
            r5.writeFixed64(r2, r3)
        L9:
            return
    }

    public static void writeFixed64List(int r1, java.util.List<java.lang.Long> r2, com.google.crypto.tink.shaded.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeFixed64List(r1, r2, r4)
        Lb:
            return
    }

    public static void writeFloat(int r1, float r2, com.google.crypto.tink.shaded.protobuf.Writer r3) throws java.io.IOException {
            int r0 = java.lang.Float.floatToRawIntBits(r2)
            if (r0 == 0) goto L9
            r3.writeFloat(r1, r2)
        L9:
            return
    }

    public static void writeFloatList(int r1, java.util.List<java.lang.Float> r2, com.google.crypto.tink.shaded.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeFloatList(r1, r2, r4)
        Lb:
            return
    }

    public static void writeGroupList(int r1, java.util.List<?> r2, com.google.crypto.tink.shaded.protobuf.Writer r3) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeGroupList(r1, r2)
        Lb:
            return
    }

    public static void writeGroupList(int r1, java.util.List<?> r2, com.google.crypto.tink.shaded.protobuf.Writer r3, com.google.crypto.tink.shaded.protobuf.Schema r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeGroupList(r1, r2, r4)
        Lb:
            return
    }

    public static void writeInt32(int r0, int r1, com.google.crypto.tink.shaded.protobuf.Writer r2) throws java.io.IOException {
            if (r1 == 0) goto L5
            r2.writeInt32(r0, r1)
        L5:
            return
    }

    public static void writeInt32List(int r1, java.util.List<java.lang.Integer> r2, com.google.crypto.tink.shaded.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeInt32List(r1, r2, r4)
        Lb:
            return
    }

    public static void writeInt64(int r2, long r3, com.google.crypto.tink.shaded.protobuf.Writer r5) throws java.io.IOException {
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L9
            r5.writeInt64(r2, r3)
        L9:
            return
    }

    public static void writeInt64List(int r1, java.util.List<java.lang.Long> r2, com.google.crypto.tink.shaded.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeInt64List(r1, r2, r4)
        Lb:
            return
    }

    public static void writeLazyFieldList(int r1, java.util.List<?> r2, com.google.crypto.tink.shaded.protobuf.Writer r3) throws java.io.IOException {
            if (r2 == 0) goto L1c
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L1c
            java.util.Iterator r2 = r2.iterator()
        Lc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r2.next()
            com.google.crypto.tink.shaded.protobuf.LazyFieldLite r0 = (com.google.crypto.tink.shaded.protobuf.LazyFieldLite) r0
            r0.writeTo(r3, r1)
            goto Lc
        L1c:
            return
    }

    public static void writeMessage(int r0, java.lang.Object r1, com.google.crypto.tink.shaded.protobuf.Writer r2) throws java.io.IOException {
            if (r1 == 0) goto L5
            r2.writeMessage(r0, r1)
        L5:
            return
    }

    public static void writeMessageList(int r1, java.util.List<?> r2, com.google.crypto.tink.shaded.protobuf.Writer r3) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeMessageList(r1, r2)
        Lb:
            return
    }

    public static void writeMessageList(int r1, java.util.List<?> r2, com.google.crypto.tink.shaded.protobuf.Writer r3, com.google.crypto.tink.shaded.protobuf.Schema r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeMessageList(r1, r2, r4)
        Lb:
            return
    }

    public static void writeSFixed32(int r0, int r1, com.google.crypto.tink.shaded.protobuf.Writer r2) throws java.io.IOException {
            if (r1 == 0) goto L5
            r2.writeSFixed32(r0, r1)
        L5:
            return
    }

    public static void writeSFixed32List(int r1, java.util.List<java.lang.Integer> r2, com.google.crypto.tink.shaded.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeSFixed32List(r1, r2, r4)
        Lb:
            return
    }

    public static void writeSFixed64(int r2, long r3, com.google.crypto.tink.shaded.protobuf.Writer r5) throws java.io.IOException {
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L9
            r5.writeSFixed64(r2, r3)
        L9:
            return
    }

    public static void writeSFixed64List(int r1, java.util.List<java.lang.Long> r2, com.google.crypto.tink.shaded.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeSFixed64List(r1, r2, r4)
        Lb:
            return
    }

    public static void writeSInt32(int r0, int r1, com.google.crypto.tink.shaded.protobuf.Writer r2) throws java.io.IOException {
            if (r1 == 0) goto L5
            r2.writeSInt32(r0, r1)
        L5:
            return
    }

    public static void writeSInt32List(int r1, java.util.List<java.lang.Integer> r2, com.google.crypto.tink.shaded.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeSInt32List(r1, r2, r4)
        Lb:
            return
    }

    public static void writeSInt64(int r2, long r3, com.google.crypto.tink.shaded.protobuf.Writer r5) throws java.io.IOException {
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L9
            r5.writeSInt64(r2, r3)
        L9:
            return
    }

    public static void writeSInt64List(int r1, java.util.List<java.lang.Long> r2, com.google.crypto.tink.shaded.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeSInt64List(r1, r2, r4)
        Lb:
            return
    }

    public static void writeString(int r1, java.lang.Object r2, com.google.crypto.tink.shaded.protobuf.Writer r3) throws java.io.IOException {
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto La
            java.lang.String r2 = (java.lang.String) r2
            writeStringInternal(r1, r2, r3)
            goto Lf
        La:
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = (com.google.crypto.tink.shaded.protobuf.ByteString) r2
            writeBytes(r1, r2, r3)
        Lf:
            return
    }

    private static void writeStringInternal(int r1, java.lang.String r2, com.google.crypto.tink.shaded.protobuf.Writer r3) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeString(r1, r2)
        Lb:
            return
    }

    public static void writeStringList(int r1, java.util.List<java.lang.String> r2, com.google.crypto.tink.shaded.protobuf.Writer r3) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeStringList(r1, r2)
        Lb:
            return
    }

    public static void writeUInt32(int r0, int r1, com.google.crypto.tink.shaded.protobuf.Writer r2) throws java.io.IOException {
            if (r1 == 0) goto L5
            r2.writeUInt32(r0, r1)
        L5:
            return
    }

    public static void writeUInt32List(int r1, java.util.List<java.lang.Integer> r2, com.google.crypto.tink.shaded.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeUInt32List(r1, r2, r4)
        Lb:
            return
    }

    public static void writeUInt64(int r2, long r3, com.google.crypto.tink.shaded.protobuf.Writer r5) throws java.io.IOException {
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L9
            r5.writeUInt64(r2, r3)
        L9:
            return
    }

    public static void writeUInt64List(int r1, java.util.List<java.lang.Long> r2, com.google.crypto.tink.shaded.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeUInt64List(r1, r2, r4)
        Lb:
            return
    }
}
