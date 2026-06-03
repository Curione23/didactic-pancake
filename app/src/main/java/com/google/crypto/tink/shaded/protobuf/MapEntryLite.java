package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public class MapEntryLite<K, V> {
    private static final int KEY_FIELD_NUMBER = 1;
    private static final int VALUE_FIELD_NUMBER = 2;
    private final K key;
    private final com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<K, V> metadata;
    private final V value;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.MapEntryLite$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType = null;

        static {
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.shaded.protobuf.MapEntryLite.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.MESSAGE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.MapEntryLite.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.ENUM     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.MapEntryLite.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.GROUP     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    static class Metadata<K, V> {
        public final K defaultKey;
        public final V defaultValue;
        public final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType keyType;
        public final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType valueType;

        public Metadata(com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r1, K r2, com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r3, V r4) {
                r0 = this;
                r0.<init>()
                r0.keyType = r1
                r0.defaultKey = r2
                r0.valueType = r3
                r0.defaultValue = r4
                return
        }
    }

    private MapEntryLite(com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<K, V> r1, K r2, V r3) {
            r0 = this;
            r0.<init>()
            r0.metadata = r1
            r0.key = r2
            r0.value = r3
            return
    }

    private MapEntryLite(com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r2, K r3, com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r4, V r5) {
            r1 = this;
            r1.<init>()
            com.google.crypto.tink.shaded.protobuf.MapEntryLite$Metadata r0 = new com.google.crypto.tink.shaded.protobuf.MapEntryLite$Metadata
            r0.<init>(r2, r3, r4, r5)
            r1.metadata = r0
            r1.key = r3
            r1.value = r5
            return
    }

    static <K, V> int computeSerializedSize(com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<K, V> r2, K r3, V r4) {
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = r2.keyType
            r1 = 1
            int r3 = com.google.crypto.tink.shaded.protobuf.FieldSet.computeElementSize(r0, r1, r3)
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r2 = r2.valueType
            r0 = 2
            int r2 = com.google.crypto.tink.shaded.protobuf.FieldSet.computeElementSize(r2, r0, r4)
            int r3 = r3 + r2
            return r3
    }

    public static <K, V> com.google.crypto.tink.shaded.protobuf.MapEntryLite<K, V> newDefaultInstance(com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r1, K r2, com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r3, V r4) {
            com.google.crypto.tink.shaded.protobuf.MapEntryLite r0 = new com.google.crypto.tink.shaded.protobuf.MapEntryLite
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    static <K, V> java.util.Map.Entry<K, V> parseEntry(com.google.crypto.tink.shaded.protobuf.CodedInputStream r5, com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<K, V> r6, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r7) throws java.io.IOException {
            K r0 = r6.defaultKey
            V r1 = r6.defaultValue
        L4:
            int r2 = r5.readTag()
            if (r2 != 0) goto Lb
            goto L39
        Lb:
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r3 = r6.keyType
            int r3 = r3.getWireType()
            r4 = 1
            int r3 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r4, r3)
            if (r2 != r3) goto L1f
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r2 = r6.keyType
            java.lang.Object r0 = parseField(r5, r7, r2, r0)
            goto L4
        L1f:
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r3 = r6.valueType
            int r3 = r3.getWireType()
            r4 = 2
            int r3 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r4, r3)
            if (r2 != r3) goto L33
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r2 = r6.valueType
            java.lang.Object r1 = parseField(r5, r7, r2, r1)
            goto L4
        L33:
            boolean r2 = r5.skipField(r2)
            if (r2 != 0) goto L4
        L39:
            java.util.AbstractMap$SimpleImmutableEntry r5 = new java.util.AbstractMap$SimpleImmutableEntry
            r5.<init>(r0, r1)
            return r5
    }

    static <T> T parseField(com.google.crypto.tink.shaded.protobuf.CodedInputStream r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3, com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r4, T r5) throws java.io.IOException {
            int[] r0 = com.google.crypto.tink.shaded.protobuf.MapEntryLite.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType
            int r1 = r4.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L27
            r3 = 2
            if (r0 == r3) goto L1e
            r3 = 3
            if (r0 == r3) goto L16
            java.lang.Object r2 = com.google.crypto.tink.shaded.protobuf.FieldSet.readPrimitiveField(r2, r4, r1)
            return r2
        L16:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Groups are not allowed in maps."
            r2.<init>(r3)
            throw r2
        L1e:
            int r2 = r2.readEnum()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L27:
            com.google.crypto.tink.shaded.protobuf.MessageLite r5 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r5
            com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r4 = r5.toBuilder()
            r2.readMessage(r4, r3)
            com.google.crypto.tink.shaded.protobuf.MessageLite r2 = r4.buildPartial()
            return r2
    }

    static <K, V> void writeTo(com.google.crypto.tink.shaded.protobuf.CodedOutputStream r2, com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<K, V> r3, K r4, V r5) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = r3.keyType
            r1 = 1
            com.google.crypto.tink.shaded.protobuf.FieldSet.writeElement(r2, r0, r1, r4)
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r3 = r3.valueType
            r4 = 2
            com.google.crypto.tink.shaded.protobuf.FieldSet.writeElement(r2, r3, r4, r5)
            return
    }

    public int computeMessageSize(int r2, K r3, V r4) {
            r1 = this;
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r2)
            com.google.crypto.tink.shaded.protobuf.MapEntryLite$Metadata<K, V> r0 = r1.metadata
            int r3 = computeSerializedSize(r0, r3, r4)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(r3)
            int r2 = r2 + r3
            return r2
    }

    public K getKey() {
            r1 = this;
            K r0 = r1.key
            return r0
    }

    com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<K, V> getMetadata() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.MapEntryLite$Metadata<K, V> r0 = r1.metadata
            return r0
    }

    public V getValue() {
            r1 = this;
            V r0 = r1.value
            return r0
    }

    public java.util.Map.Entry<K, V> parseEntry(com.google.crypto.tink.shaded.protobuf.ByteString r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r2.newCodedInput()
            com.google.crypto.tink.shaded.protobuf.MapEntryLite$Metadata<K, V> r0 = r1.metadata
            java.util.Map$Entry r2 = parseEntry(r2, r0, r3)
            return r2
    }

    public void parseInto(com.google.crypto.tink.shaded.protobuf.MapFieldLite<K, V> r7, com.google.crypto.tink.shaded.protobuf.CodedInputStream r8, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r9) throws java.io.IOException {
            r6 = this;
            int r0 = r8.readRawVarint32()
            int r0 = r8.pushLimit(r0)
            com.google.crypto.tink.shaded.protobuf.MapEntryLite$Metadata<K, V> r1 = r6.metadata
            K r1 = r1.defaultKey
            com.google.crypto.tink.shaded.protobuf.MapEntryLite$Metadata<K, V> r2 = r6.metadata
            V r2 = r2.defaultValue
        L10:
            int r3 = r8.readTag()
            if (r3 != 0) goto L17
            goto L4d
        L17:
            com.google.crypto.tink.shaded.protobuf.MapEntryLite$Metadata<K, V> r4 = r6.metadata
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r4 = r4.keyType
            int r4 = r4.getWireType()
            r5 = 1
            int r4 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r5, r4)
            if (r3 != r4) goto L2f
            com.google.crypto.tink.shaded.protobuf.MapEntryLite$Metadata<K, V> r3 = r6.metadata
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r3 = r3.keyType
            java.lang.Object r1 = parseField(r8, r9, r3, r1)
            goto L10
        L2f:
            com.google.crypto.tink.shaded.protobuf.MapEntryLite$Metadata<K, V> r4 = r6.metadata
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r4 = r4.valueType
            int r4 = r4.getWireType()
            r5 = 2
            int r4 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r5, r4)
            if (r3 != r4) goto L47
            com.google.crypto.tink.shaded.protobuf.MapEntryLite$Metadata<K, V> r3 = r6.metadata
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r3 = r3.valueType
            java.lang.Object r2 = parseField(r8, r9, r3, r2)
            goto L10
        L47:
            boolean r3 = r8.skipField(r3)
            if (r3 != 0) goto L10
        L4d:
            r9 = 0
            r8.checkLastTagWas(r9)
            r8.popLimit(r0)
            r7.put(r1, r2)
            return
    }

    public void serializeTo(com.google.crypto.tink.shaded.protobuf.CodedOutputStream r2, int r3, K r4, V r5) throws java.io.IOException {
            r1 = this;
            r0 = 2
            r2.writeTag(r3, r0)
            com.google.crypto.tink.shaded.protobuf.MapEntryLite$Metadata<K, V> r3 = r1.metadata
            int r3 = computeSerializedSize(r3, r4, r5)
            r2.writeUInt32NoTag(r3)
            com.google.crypto.tink.shaded.protobuf.MapEntryLite$Metadata<K, V> r3 = r1.metadata
            writeTo(r2, r3, r4, r5)
            return
    }
}
