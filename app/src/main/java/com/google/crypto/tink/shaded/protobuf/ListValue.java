package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public final class ListValue extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.shaded.protobuf.ListValue, com.google.crypto.tink.shaded.protobuf.ListValue.Builder> implements com.google.crypto.tink.shaded.protobuf.ListValueOrBuilder {
    private static final com.google.crypto.tink.shaded.protobuf.ListValue DEFAULT_INSTANCE = null;
    private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.ListValue> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<com.google.crypto.tink.shaded.protobuf.Value> values_;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.ListValue$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = null;

        static {
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.shaded.protobuf.ListValue.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.ListValue.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.ListValue.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.ListValue.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.ListValue.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L3e
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.ListValue.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.ListValue.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L54
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                return
        }
    }

    public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.shaded.protobuf.ListValue, com.google.crypto.tink.shaded.protobuf.ListValue.Builder> implements com.google.crypto.tink.shaded.protobuf.ListValueOrBuilder {
        private Builder() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.ListValue r0 = com.google.crypto.tink.shaded.protobuf.ListValue.access$000()
                r1.<init>(r0)
                return
        }

        /* synthetic */ Builder(com.google.crypto.tink.shaded.protobuf.ListValue.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.crypto.tink.shaded.protobuf.ListValue.Builder addAllValues(java.lang.Iterable<? extends com.google.crypto.tink.shaded.protobuf.Value> r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.ListValue r0 = (com.google.crypto.tink.shaded.protobuf.ListValue) r0
                com.google.crypto.tink.shaded.protobuf.ListValue.access$400(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.ListValue.Builder addValues(int r2, com.google.crypto.tink.shaded.protobuf.Value.Builder r3) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.ListValue r0 = (com.google.crypto.tink.shaded.protobuf.ListValue) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.build()
                com.google.crypto.tink.shaded.protobuf.Value r3 = (com.google.crypto.tink.shaded.protobuf.Value) r3
                com.google.crypto.tink.shaded.protobuf.ListValue.access$300(r0, r2, r3)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.ListValue.Builder addValues(int r2, com.google.crypto.tink.shaded.protobuf.Value r3) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.ListValue r0 = (com.google.crypto.tink.shaded.protobuf.ListValue) r0
                com.google.crypto.tink.shaded.protobuf.ListValue.access$300(r0, r2, r3)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.ListValue.Builder addValues(com.google.crypto.tink.shaded.protobuf.Value.Builder r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.ListValue r0 = (com.google.crypto.tink.shaded.protobuf.ListValue) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
                com.google.crypto.tink.shaded.protobuf.Value r2 = (com.google.crypto.tink.shaded.protobuf.Value) r2
                com.google.crypto.tink.shaded.protobuf.ListValue.access$200(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.ListValue.Builder addValues(com.google.crypto.tink.shaded.protobuf.Value r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.ListValue r0 = (com.google.crypto.tink.shaded.protobuf.ListValue) r0
                com.google.crypto.tink.shaded.protobuf.ListValue.access$200(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.ListValue.Builder clearValues() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.ListValue r0 = (com.google.crypto.tink.shaded.protobuf.ListValue) r0
                com.google.crypto.tink.shaded.protobuf.ListValue.access$500(r0)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ListValueOrBuilder
        public com.google.crypto.tink.shaded.protobuf.Value getValues(int r2) {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.ListValue r0 = (com.google.crypto.tink.shaded.protobuf.ListValue) r0
                com.google.crypto.tink.shaded.protobuf.Value r2 = r0.getValues(r2)
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ListValueOrBuilder
        public int getValuesCount() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.ListValue r0 = (com.google.crypto.tink.shaded.protobuf.ListValue) r0
                int r0 = r0.getValuesCount()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ListValueOrBuilder
        public java.util.List<com.google.crypto.tink.shaded.protobuf.Value> getValuesList() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.ListValue r0 = (com.google.crypto.tink.shaded.protobuf.ListValue) r0
                java.util.List r0 = r0.getValuesList()
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                return r0
        }

        public com.google.crypto.tink.shaded.protobuf.ListValue.Builder removeValues(int r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.ListValue r0 = (com.google.crypto.tink.shaded.protobuf.ListValue) r0
                com.google.crypto.tink.shaded.protobuf.ListValue.access$600(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.ListValue.Builder setValues(int r2, com.google.crypto.tink.shaded.protobuf.Value.Builder r3) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.ListValue r0 = (com.google.crypto.tink.shaded.protobuf.ListValue) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.build()
                com.google.crypto.tink.shaded.protobuf.Value r3 = (com.google.crypto.tink.shaded.protobuf.Value) r3
                com.google.crypto.tink.shaded.protobuf.ListValue.access$100(r0, r2, r3)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.ListValue.Builder setValues(int r2, com.google.crypto.tink.shaded.protobuf.Value r3) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.ListValue r0 = (com.google.crypto.tink.shaded.protobuf.ListValue) r0
                com.google.crypto.tink.shaded.protobuf.ListValue.access$100(r0, r2, r3)
                return r1
        }
    }

    static {
            com.google.crypto.tink.shaded.protobuf.ListValue r0 = new com.google.crypto.tink.shaded.protobuf.ListValue
            r0.<init>()
            com.google.crypto.tink.shaded.protobuf.ListValue.DEFAULT_INSTANCE = r0
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.ListValue> r1 = com.google.crypto.tink.shaded.protobuf.ListValue.class
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(r1, r0)
            return
    }

    private ListValue() {
            r1 = this;
            r1.<init>()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r0 = emptyProtobufList()
            r1.values_ = r0
            return
    }

    static /* synthetic */ com.google.crypto.tink.shaded.protobuf.ListValue access$000() {
            com.google.crypto.tink.shaded.protobuf.ListValue r0 = com.google.crypto.tink.shaded.protobuf.ListValue.DEFAULT_INSTANCE
            return r0
    }

    static /* synthetic */ void access$100(com.google.crypto.tink.shaded.protobuf.ListValue r0, int r1, com.google.crypto.tink.shaded.protobuf.Value r2) {
            r0.setValues(r1, r2)
            return
    }

    static /* synthetic */ void access$200(com.google.crypto.tink.shaded.protobuf.ListValue r0, com.google.crypto.tink.shaded.protobuf.Value r1) {
            r0.addValues(r1)
            return
    }

    static /* synthetic */ void access$300(com.google.crypto.tink.shaded.protobuf.ListValue r0, int r1, com.google.crypto.tink.shaded.protobuf.Value r2) {
            r0.addValues(r1, r2)
            return
    }

    static /* synthetic */ void access$400(com.google.crypto.tink.shaded.protobuf.ListValue r0, java.lang.Iterable r1) {
            r0.addAllValues(r1)
            return
    }

    static /* synthetic */ void access$500(com.google.crypto.tink.shaded.protobuf.ListValue r0) {
            r0.clearValues()
            return
    }

    static /* synthetic */ void access$600(com.google.crypto.tink.shaded.protobuf.ListValue r0, int r1) {
            r0.removeValues(r1)
            return
    }

    private void addAllValues(java.lang.Iterable<? extends com.google.crypto.tink.shaded.protobuf.Value> r2) {
            r1 = this;
            r1.ensureValuesIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Value> r0 = r1.values_
            com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.addAll(r2, r0)
            return
    }

    private void addValues(int r2, com.google.crypto.tink.shaded.protobuf.Value r3) {
            r1 = this;
            r3.getClass()
            r1.ensureValuesIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Value> r0 = r1.values_
            r0.add(r2, r3)
            return
    }

    private void addValues(com.google.crypto.tink.shaded.protobuf.Value r2) {
            r1 = this;
            r2.getClass()
            r1.ensureValuesIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Value> r0 = r1.values_
            r0.add(r2)
            return
    }

    private void clearValues() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r0 = emptyProtobufList()
            r1.values_ = r0
            return
    }

    private void ensureValuesIsMutable() {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Value> r0 = r2.values_
            boolean r1 = r0.isModifiable()
            if (r1 != 0) goto Le
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.mutableCopy(r0)
            r2.values_ = r0
        Le:
            return
    }

    public static com.google.crypto.tink.shaded.protobuf.ListValue getDefaultInstance() {
            com.google.crypto.tink.shaded.protobuf.ListValue r0 = com.google.crypto.tink.shaded.protobuf.ListValue.DEFAULT_INSTANCE
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.ListValue.Builder newBuilder() {
            com.google.crypto.tink.shaded.protobuf.ListValue r0 = com.google.crypto.tink.shaded.protobuf.ListValue.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.createBuilder()
            com.google.crypto.tink.shaded.protobuf.ListValue$Builder r0 = (com.google.crypto.tink.shaded.protobuf.ListValue.Builder) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.ListValue.Builder newBuilder(com.google.crypto.tink.shaded.protobuf.ListValue r1) {
            com.google.crypto.tink.shaded.protobuf.ListValue r0 = com.google.crypto.tink.shaded.protobuf.ListValue.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = r0.createBuilder(r1)
            com.google.crypto.tink.shaded.protobuf.ListValue$Builder r1 = (com.google.crypto.tink.shaded.protobuf.ListValue.Builder) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.ListValue parseDelimitedFrom(java.io.InputStream r1) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.ListValue r0 = com.google.crypto.tink.shaded.protobuf.ListValue.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = parseDelimitedFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.ListValue r1 = (com.google.crypto.tink.shaded.protobuf.ListValue) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.ListValue parseDelimitedFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.ListValue r0 = com.google.crypto.tink.shaded.protobuf.ListValue.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = parseDelimitedFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.ListValue r1 = (com.google.crypto.tink.shaded.protobuf.ListValue) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.ListValue parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.ListValue r0 = com.google.crypto.tink.shaded.protobuf.ListValue.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.ListValue r1 = (com.google.crypto.tink.shaded.protobuf.ListValue) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.ListValue parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.ListValue r0 = com.google.crypto.tink.shaded.protobuf.ListValue.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.ListValue r1 = (com.google.crypto.tink.shaded.protobuf.ListValue) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.ListValue parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.ListValue r0 = com.google.crypto.tink.shaded.protobuf.ListValue.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.ListValue r1 = (com.google.crypto.tink.shaded.protobuf.ListValue) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.ListValue parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.ListValue r0 = com.google.crypto.tink.shaded.protobuf.ListValue.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.ListValue r1 = (com.google.crypto.tink.shaded.protobuf.ListValue) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.ListValue parseFrom(java.io.InputStream r1) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.ListValue r0 = com.google.crypto.tink.shaded.protobuf.ListValue.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.ListValue r1 = (com.google.crypto.tink.shaded.protobuf.ListValue) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.ListValue parseFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.ListValue r0 = com.google.crypto.tink.shaded.protobuf.ListValue.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.ListValue r1 = (com.google.crypto.tink.shaded.protobuf.ListValue) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.ListValue parseFrom(java.nio.ByteBuffer r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.ListValue r0 = com.google.crypto.tink.shaded.protobuf.ListValue.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.ListValue r1 = (com.google.crypto.tink.shaded.protobuf.ListValue) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.ListValue parseFrom(java.nio.ByteBuffer r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.ListValue r0 = com.google.crypto.tink.shaded.protobuf.ListValue.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.ListValue r1 = (com.google.crypto.tink.shaded.protobuf.ListValue) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.ListValue parseFrom(byte[] r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.ListValue r0 = com.google.crypto.tink.shaded.protobuf.ListValue.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.ListValue r1 = (com.google.crypto.tink.shaded.protobuf.ListValue) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.ListValue parseFrom(byte[] r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.ListValue r0 = com.google.crypto.tink.shaded.protobuf.ListValue.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.ListValue r1 = (com.google.crypto.tink.shaded.protobuf.ListValue) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.ListValue> parser() {
            com.google.crypto.tink.shaded.protobuf.ListValue r0 = com.google.crypto.tink.shaded.protobuf.ListValue.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.Parser r0 = r0.getParserForType()
            return r0
    }

    private void removeValues(int r2) {
            r1 = this;
            r1.ensureValuesIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Value> r0 = r1.values_
            r0.remove(r2)
            return
    }

    private void setValues(int r2, com.google.crypto.tink.shaded.protobuf.Value r3) {
            r1 = this;
            r3.getClass()
            r1.ensureValuesIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Value> r0 = r1.values_
            r0.set(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            int[] r2 = com.google.crypto.tink.shaded.protobuf.ListValue.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 0
            switch(r1) {
                case 1: goto L4d;
                case 2: goto L47;
                case 3: goto L36;
                case 4: goto L33;
                case 5: goto L19;
                case 6: goto L13;
                case 7: goto L12;
                default: goto Lc;
            }
        Lc:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
        L12:
            return r2
        L13:
            r1 = 1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            return r1
        L19:
            com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.ListValue> r1 = com.google.crypto.tink.shaded.protobuf.ListValue.PARSER
            if (r1 != 0) goto L32
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.ListValue> r2 = com.google.crypto.tink.shaded.protobuf.ListValue.class
            monitor-enter(r2)
            com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.ListValue> r1 = com.google.crypto.tink.shaded.protobuf.ListValue.PARSER     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L2d
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser r1 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser     // Catch: java.lang.Throwable -> L2f
            com.google.crypto.tink.shaded.protobuf.ListValue r3 = com.google.crypto.tink.shaded.protobuf.ListValue.DEFAULT_INSTANCE     // Catch: java.lang.Throwable -> L2f
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L2f
            com.google.crypto.tink.shaded.protobuf.ListValue.PARSER = r1     // Catch: java.lang.Throwable -> L2f
        L2d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            goto L32
        L2f:
            r1 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            throw r1
        L32:
            return r1
        L33:
            com.google.crypto.tink.shaded.protobuf.ListValue r1 = com.google.crypto.tink.shaded.protobuf.ListValue.DEFAULT_INSTANCE
            return r1
        L36:
            java.lang.String r1 = "values_"
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.Value> r2 = com.google.crypto.tink.shaded.protobuf.Value.class
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r2 = "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b"
            com.google.crypto.tink.shaded.protobuf.ListValue r3 = com.google.crypto.tink.shaded.protobuf.ListValue.DEFAULT_INSTANCE
            java.lang.Object r1 = newMessageInfo(r3, r2, r1)
            return r1
        L47:
            com.google.crypto.tink.shaded.protobuf.ListValue$Builder r1 = new com.google.crypto.tink.shaded.protobuf.ListValue$Builder
            r1.<init>(r2)
            return r1
        L4d:
            com.google.crypto.tink.shaded.protobuf.ListValue r1 = new com.google.crypto.tink.shaded.protobuf.ListValue
            r1.<init>()
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ListValueOrBuilder
    public com.google.crypto.tink.shaded.protobuf.Value getValues(int r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Value> r0 = r1.values_
            java.lang.Object r2 = r0.get(r2)
            com.google.crypto.tink.shaded.protobuf.Value r2 = (com.google.crypto.tink.shaded.protobuf.Value) r2
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ListValueOrBuilder
    public int getValuesCount() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Value> r0 = r1.values_
            int r0 = r0.size()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ListValueOrBuilder
    public java.util.List<com.google.crypto.tink.shaded.protobuf.Value> getValuesList() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Value> r0 = r1.values_
            return r0
    }

    public com.google.crypto.tink.shaded.protobuf.ValueOrBuilder getValuesOrBuilder(int r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Value> r0 = r1.values_
            java.lang.Object r2 = r0.get(r2)
            com.google.crypto.tink.shaded.protobuf.ValueOrBuilder r2 = (com.google.crypto.tink.shaded.protobuf.ValueOrBuilder) r2
            return r2
    }

    public java.util.List<? extends com.google.crypto.tink.shaded.protobuf.ValueOrBuilder> getValuesOrBuilderList() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Value> r0 = r1.values_
            return r0
    }
}
