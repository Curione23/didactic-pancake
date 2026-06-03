package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public final class EnumValue extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.shaded.protobuf.EnumValue, com.google.crypto.tink.shaded.protobuf.EnumValue.Builder> implements com.google.crypto.tink.shaded.protobuf.EnumValueOrBuilder {
    private static final com.google.crypto.tink.shaded.protobuf.EnumValue DEFAULT_INSTANCE = null;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.EnumValue> PARSER;
    private java.lang.String name_;
    private int number_;
    private com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<com.google.crypto.tink.shaded.protobuf.Option> options_;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.EnumValue$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = null;

        static {
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.shaded.protobuf.EnumValue.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.EnumValue.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.EnumValue.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.EnumValue.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.EnumValue.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L3e
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.EnumValue.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.EnumValue.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L54
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                return
        }
    }

    public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.shaded.protobuf.EnumValue, com.google.crypto.tink.shaded.protobuf.EnumValue.Builder> implements com.google.crypto.tink.shaded.protobuf.EnumValueOrBuilder {
        private Builder() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.EnumValue r0 = com.google.crypto.tink.shaded.protobuf.EnumValue.access$000()
                r1.<init>(r0)
                return
        }

        /* synthetic */ Builder(com.google.crypto.tink.shaded.protobuf.EnumValue.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.crypto.tink.shaded.protobuf.EnumValue.Builder addAllOptions(java.lang.Iterable<? extends com.google.crypto.tink.shaded.protobuf.Option> r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.EnumValue r0 = (com.google.crypto.tink.shaded.protobuf.EnumValue) r0
                com.google.crypto.tink.shaded.protobuf.EnumValue.access$900(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.EnumValue.Builder addOptions(int r2, com.google.crypto.tink.shaded.protobuf.Option.Builder r3) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.EnumValue r0 = (com.google.crypto.tink.shaded.protobuf.EnumValue) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.build()
                com.google.crypto.tink.shaded.protobuf.Option r3 = (com.google.crypto.tink.shaded.protobuf.Option) r3
                com.google.crypto.tink.shaded.protobuf.EnumValue.access$800(r0, r2, r3)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.EnumValue.Builder addOptions(int r2, com.google.crypto.tink.shaded.protobuf.Option r3) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.EnumValue r0 = (com.google.crypto.tink.shaded.protobuf.EnumValue) r0
                com.google.crypto.tink.shaded.protobuf.EnumValue.access$800(r0, r2, r3)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.EnumValue.Builder addOptions(com.google.crypto.tink.shaded.protobuf.Option.Builder r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.EnumValue r0 = (com.google.crypto.tink.shaded.protobuf.EnumValue) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
                com.google.crypto.tink.shaded.protobuf.Option r2 = (com.google.crypto.tink.shaded.protobuf.Option) r2
                com.google.crypto.tink.shaded.protobuf.EnumValue.access$700(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.EnumValue.Builder addOptions(com.google.crypto.tink.shaded.protobuf.Option r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.EnumValue r0 = (com.google.crypto.tink.shaded.protobuf.EnumValue) r0
                com.google.crypto.tink.shaded.protobuf.EnumValue.access$700(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.EnumValue.Builder clearName() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.EnumValue r0 = (com.google.crypto.tink.shaded.protobuf.EnumValue) r0
                com.google.crypto.tink.shaded.protobuf.EnumValue.access$200(r0)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.EnumValue.Builder clearNumber() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.EnumValue r0 = (com.google.crypto.tink.shaded.protobuf.EnumValue) r0
                com.google.crypto.tink.shaded.protobuf.EnumValue.access$500(r0)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.EnumValue.Builder clearOptions() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.EnumValue r0 = (com.google.crypto.tink.shaded.protobuf.EnumValue) r0
                com.google.crypto.tink.shaded.protobuf.EnumValue.access$1000(r0)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.EnumValueOrBuilder
        public java.lang.String getName() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.EnumValue r0 = (com.google.crypto.tink.shaded.protobuf.EnumValue) r0
                java.lang.String r0 = r0.getName()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.EnumValueOrBuilder
        public com.google.crypto.tink.shaded.protobuf.ByteString getNameBytes() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.EnumValue r0 = (com.google.crypto.tink.shaded.protobuf.EnumValue) r0
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getNameBytes()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.EnumValueOrBuilder
        public int getNumber() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.EnumValue r0 = (com.google.crypto.tink.shaded.protobuf.EnumValue) r0
                int r0 = r0.getNumber()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.EnumValueOrBuilder
        public com.google.crypto.tink.shaded.protobuf.Option getOptions(int r2) {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.EnumValue r0 = (com.google.crypto.tink.shaded.protobuf.EnumValue) r0
                com.google.crypto.tink.shaded.protobuf.Option r2 = r0.getOptions(r2)
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.EnumValueOrBuilder
        public int getOptionsCount() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.EnumValue r0 = (com.google.crypto.tink.shaded.protobuf.EnumValue) r0
                int r0 = r0.getOptionsCount()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.EnumValueOrBuilder
        public java.util.List<com.google.crypto.tink.shaded.protobuf.Option> getOptionsList() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.EnumValue r0 = (com.google.crypto.tink.shaded.protobuf.EnumValue) r0
                java.util.List r0 = r0.getOptionsList()
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                return r0
        }

        public com.google.crypto.tink.shaded.protobuf.EnumValue.Builder removeOptions(int r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.EnumValue r0 = (com.google.crypto.tink.shaded.protobuf.EnumValue) r0
                com.google.crypto.tink.shaded.protobuf.EnumValue.access$1100(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.EnumValue.Builder setName(java.lang.String r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.EnumValue r0 = (com.google.crypto.tink.shaded.protobuf.EnumValue) r0
                com.google.crypto.tink.shaded.protobuf.EnumValue.access$100(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.EnumValue.Builder setNameBytes(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.EnumValue r0 = (com.google.crypto.tink.shaded.protobuf.EnumValue) r0
                com.google.crypto.tink.shaded.protobuf.EnumValue.access$300(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.EnumValue.Builder setNumber(int r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.EnumValue r0 = (com.google.crypto.tink.shaded.protobuf.EnumValue) r0
                com.google.crypto.tink.shaded.protobuf.EnumValue.access$400(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.EnumValue.Builder setOptions(int r2, com.google.crypto.tink.shaded.protobuf.Option.Builder r3) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.EnumValue r0 = (com.google.crypto.tink.shaded.protobuf.EnumValue) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.build()
                com.google.crypto.tink.shaded.protobuf.Option r3 = (com.google.crypto.tink.shaded.protobuf.Option) r3
                com.google.crypto.tink.shaded.protobuf.EnumValue.access$600(r0, r2, r3)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.EnumValue.Builder setOptions(int r2, com.google.crypto.tink.shaded.protobuf.Option r3) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.EnumValue r0 = (com.google.crypto.tink.shaded.protobuf.EnumValue) r0
                com.google.crypto.tink.shaded.protobuf.EnumValue.access$600(r0, r2, r3)
                return r1
        }
    }

    static {
            com.google.crypto.tink.shaded.protobuf.EnumValue r0 = new com.google.crypto.tink.shaded.protobuf.EnumValue
            r0.<init>()
            com.google.crypto.tink.shaded.protobuf.EnumValue.DEFAULT_INSTANCE = r0
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.EnumValue> r1 = com.google.crypto.tink.shaded.protobuf.EnumValue.class
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(r1, r0)
            return
    }

    private EnumValue() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.name_ = r0
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r0 = emptyProtobufList()
            r1.options_ = r0
            return
    }

    static /* synthetic */ com.google.crypto.tink.shaded.protobuf.EnumValue access$000() {
            com.google.crypto.tink.shaded.protobuf.EnumValue r0 = com.google.crypto.tink.shaded.protobuf.EnumValue.DEFAULT_INSTANCE
            return r0
    }

    static /* synthetic */ void access$100(com.google.crypto.tink.shaded.protobuf.EnumValue r0, java.lang.String r1) {
            r0.setName(r1)
            return
    }

    static /* synthetic */ void access$1000(com.google.crypto.tink.shaded.protobuf.EnumValue r0) {
            r0.clearOptions()
            return
    }

    static /* synthetic */ void access$1100(com.google.crypto.tink.shaded.protobuf.EnumValue r0, int r1) {
            r0.removeOptions(r1)
            return
    }

    static /* synthetic */ void access$200(com.google.crypto.tink.shaded.protobuf.EnumValue r0) {
            r0.clearName()
            return
    }

    static /* synthetic */ void access$300(com.google.crypto.tink.shaded.protobuf.EnumValue r0, com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0.setNameBytes(r1)
            return
    }

    static /* synthetic */ void access$400(com.google.crypto.tink.shaded.protobuf.EnumValue r0, int r1) {
            r0.setNumber(r1)
            return
    }

    static /* synthetic */ void access$500(com.google.crypto.tink.shaded.protobuf.EnumValue r0) {
            r0.clearNumber()
            return
    }

    static /* synthetic */ void access$600(com.google.crypto.tink.shaded.protobuf.EnumValue r0, int r1, com.google.crypto.tink.shaded.protobuf.Option r2) {
            r0.setOptions(r1, r2)
            return
    }

    static /* synthetic */ void access$700(com.google.crypto.tink.shaded.protobuf.EnumValue r0, com.google.crypto.tink.shaded.protobuf.Option r1) {
            r0.addOptions(r1)
            return
    }

    static /* synthetic */ void access$800(com.google.crypto.tink.shaded.protobuf.EnumValue r0, int r1, com.google.crypto.tink.shaded.protobuf.Option r2) {
            r0.addOptions(r1, r2)
            return
    }

    static /* synthetic */ void access$900(com.google.crypto.tink.shaded.protobuf.EnumValue r0, java.lang.Iterable r1) {
            r0.addAllOptions(r1)
            return
    }

    private void addAllOptions(java.lang.Iterable<? extends com.google.crypto.tink.shaded.protobuf.Option> r2) {
            r1 = this;
            r1.ensureOptionsIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Option> r0 = r1.options_
            com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.addAll(r2, r0)
            return
    }

    private void addOptions(int r2, com.google.crypto.tink.shaded.protobuf.Option r3) {
            r1 = this;
            r3.getClass()
            r1.ensureOptionsIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Option> r0 = r1.options_
            r0.add(r2, r3)
            return
    }

    private void addOptions(com.google.crypto.tink.shaded.protobuf.Option r2) {
            r1 = this;
            r2.getClass()
            r1.ensureOptionsIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Option> r0 = r1.options_
            r0.add(r2)
            return
    }

    private void clearName() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.EnumValue r0 = getDefaultInstance()
            java.lang.String r0 = r0.getName()
            r1.name_ = r0
            return
    }

    private void clearNumber() {
            r1 = this;
            r0 = 0
            r1.number_ = r0
            return
    }

    private void clearOptions() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r0 = emptyProtobufList()
            r1.options_ = r0
            return
    }

    private void ensureOptionsIsMutable() {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Option> r0 = r2.options_
            boolean r1 = r0.isModifiable()
            if (r1 != 0) goto Le
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.mutableCopy(r0)
            r2.options_ = r0
        Le:
            return
    }

    public static com.google.crypto.tink.shaded.protobuf.EnumValue getDefaultInstance() {
            com.google.crypto.tink.shaded.protobuf.EnumValue r0 = com.google.crypto.tink.shaded.protobuf.EnumValue.DEFAULT_INSTANCE
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.EnumValue.Builder newBuilder() {
            com.google.crypto.tink.shaded.protobuf.EnumValue r0 = com.google.crypto.tink.shaded.protobuf.EnumValue.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.createBuilder()
            com.google.crypto.tink.shaded.protobuf.EnumValue$Builder r0 = (com.google.crypto.tink.shaded.protobuf.EnumValue.Builder) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.EnumValue.Builder newBuilder(com.google.crypto.tink.shaded.protobuf.EnumValue r1) {
            com.google.crypto.tink.shaded.protobuf.EnumValue r0 = com.google.crypto.tink.shaded.protobuf.EnumValue.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = r0.createBuilder(r1)
            com.google.crypto.tink.shaded.protobuf.EnumValue$Builder r1 = (com.google.crypto.tink.shaded.protobuf.EnumValue.Builder) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.EnumValue parseDelimitedFrom(java.io.InputStream r1) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.EnumValue r0 = com.google.crypto.tink.shaded.protobuf.EnumValue.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = parseDelimitedFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.EnumValue r1 = (com.google.crypto.tink.shaded.protobuf.EnumValue) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.EnumValue parseDelimitedFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.EnumValue r0 = com.google.crypto.tink.shaded.protobuf.EnumValue.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = parseDelimitedFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.EnumValue r1 = (com.google.crypto.tink.shaded.protobuf.EnumValue) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.EnumValue parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.EnumValue r0 = com.google.crypto.tink.shaded.protobuf.EnumValue.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.EnumValue r1 = (com.google.crypto.tink.shaded.protobuf.EnumValue) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.EnumValue parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.EnumValue r0 = com.google.crypto.tink.shaded.protobuf.EnumValue.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.EnumValue r1 = (com.google.crypto.tink.shaded.protobuf.EnumValue) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.EnumValue parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.EnumValue r0 = com.google.crypto.tink.shaded.protobuf.EnumValue.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.EnumValue r1 = (com.google.crypto.tink.shaded.protobuf.EnumValue) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.EnumValue parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.EnumValue r0 = com.google.crypto.tink.shaded.protobuf.EnumValue.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.EnumValue r1 = (com.google.crypto.tink.shaded.protobuf.EnumValue) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.EnumValue parseFrom(java.io.InputStream r1) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.EnumValue r0 = com.google.crypto.tink.shaded.protobuf.EnumValue.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.EnumValue r1 = (com.google.crypto.tink.shaded.protobuf.EnumValue) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.EnumValue parseFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.EnumValue r0 = com.google.crypto.tink.shaded.protobuf.EnumValue.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.EnumValue r1 = (com.google.crypto.tink.shaded.protobuf.EnumValue) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.EnumValue parseFrom(java.nio.ByteBuffer r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.EnumValue r0 = com.google.crypto.tink.shaded.protobuf.EnumValue.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.EnumValue r1 = (com.google.crypto.tink.shaded.protobuf.EnumValue) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.EnumValue parseFrom(java.nio.ByteBuffer r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.EnumValue r0 = com.google.crypto.tink.shaded.protobuf.EnumValue.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.EnumValue r1 = (com.google.crypto.tink.shaded.protobuf.EnumValue) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.EnumValue parseFrom(byte[] r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.EnumValue r0 = com.google.crypto.tink.shaded.protobuf.EnumValue.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.EnumValue r1 = (com.google.crypto.tink.shaded.protobuf.EnumValue) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.EnumValue parseFrom(byte[] r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.EnumValue r0 = com.google.crypto.tink.shaded.protobuf.EnumValue.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.EnumValue r1 = (com.google.crypto.tink.shaded.protobuf.EnumValue) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.EnumValue> parser() {
            com.google.crypto.tink.shaded.protobuf.EnumValue r0 = com.google.crypto.tink.shaded.protobuf.EnumValue.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.Parser r0 = r0.getParserForType()
            return r0
    }

    private void removeOptions(int r2) {
            r1 = this;
            r1.ensureOptionsIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Option> r0 = r1.options_
            r0.remove(r2)
            return
    }

    private void setName(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            r0.name_ = r1
            return
    }

    private void setNameBytes(com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0 = this;
            checkByteStringIsUtf8(r1)
            java.lang.String r1 = r1.toStringUtf8()
            r0.name_ = r1
            return
    }

    private void setNumber(int r1) {
            r0 = this;
            r0.number_ = r1
            return
    }

    private void setOptions(int r2, com.google.crypto.tink.shaded.protobuf.Option r3) {
            r1 = this;
            r3.getClass()
            r1.ensureOptionsIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Option> r0 = r1.options_
            r0.set(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            int[] r3 = com.google.crypto.tink.shaded.protobuf.EnumValue.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke
            int r2 = r2.ordinal()
            r2 = r3[r2]
            r3 = 0
            switch(r2) {
                case 1: goto L51;
                case 2: goto L4b;
                case 3: goto L36;
                case 4: goto L33;
                case 5: goto L19;
                case 6: goto L13;
                case 7: goto L12;
                default: goto Lc;
            }
        Lc:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>()
            throw r2
        L12:
            return r3
        L13:
            r2 = 1
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            return r2
        L19:
            com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.EnumValue> r2 = com.google.crypto.tink.shaded.protobuf.EnumValue.PARSER
            if (r2 != 0) goto L32
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.EnumValue> r3 = com.google.crypto.tink.shaded.protobuf.EnumValue.class
            monitor-enter(r3)
            com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.EnumValue> r2 = com.google.crypto.tink.shaded.protobuf.EnumValue.PARSER     // Catch: java.lang.Throwable -> L2f
            if (r2 != 0) goto L2d
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser r2 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser     // Catch: java.lang.Throwable -> L2f
            com.google.crypto.tink.shaded.protobuf.EnumValue r4 = com.google.crypto.tink.shaded.protobuf.EnumValue.DEFAULT_INSTANCE     // Catch: java.lang.Throwable -> L2f
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L2f
            com.google.crypto.tink.shaded.protobuf.EnumValue.PARSER = r2     // Catch: java.lang.Throwable -> L2f
        L2d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2f
            goto L32
        L2f:
            r2 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2f
            throw r2
        L32:
            return r2
        L33:
            com.google.crypto.tink.shaded.protobuf.EnumValue r2 = com.google.crypto.tink.shaded.protobuf.EnumValue.DEFAULT_INSTANCE
            return r2
        L36:
            java.lang.String r2 = "name_"
            java.lang.String r3 = "number_"
            java.lang.String r4 = "options_"
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.Option> r0 = com.google.crypto.tink.shaded.protobuf.Option.class
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4, r0}
            java.lang.String r3 = "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u001b"
            com.google.crypto.tink.shaded.protobuf.EnumValue r4 = com.google.crypto.tink.shaded.protobuf.EnumValue.DEFAULT_INSTANCE
            java.lang.Object r2 = newMessageInfo(r4, r3, r2)
            return r2
        L4b:
            com.google.crypto.tink.shaded.protobuf.EnumValue$Builder r2 = new com.google.crypto.tink.shaded.protobuf.EnumValue$Builder
            r2.<init>(r3)
            return r2
        L51:
            com.google.crypto.tink.shaded.protobuf.EnumValue r2 = new com.google.crypto.tink.shaded.protobuf.EnumValue
            r2.<init>()
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.EnumValueOrBuilder
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name_
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.EnumValueOrBuilder
    public com.google.crypto.tink.shaded.protobuf.ByteString getNameBytes() {
            r1 = this;
            java.lang.String r0 = r1.name_
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFromUtf8(r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.EnumValueOrBuilder
    public int getNumber() {
            r1 = this;
            int r0 = r1.number_
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.EnumValueOrBuilder
    public com.google.crypto.tink.shaded.protobuf.Option getOptions(int r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Option> r0 = r1.options_
            java.lang.Object r2 = r0.get(r2)
            com.google.crypto.tink.shaded.protobuf.Option r2 = (com.google.crypto.tink.shaded.protobuf.Option) r2
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.EnumValueOrBuilder
    public int getOptionsCount() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Option> r0 = r1.options_
            int r0 = r0.size()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.EnumValueOrBuilder
    public java.util.List<com.google.crypto.tink.shaded.protobuf.Option> getOptionsList() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Option> r0 = r1.options_
            return r0
    }

    public com.google.crypto.tink.shaded.protobuf.OptionOrBuilder getOptionsOrBuilder(int r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Option> r0 = r1.options_
            java.lang.Object r2 = r0.get(r2)
            com.google.crypto.tink.shaded.protobuf.OptionOrBuilder r2 = (com.google.crypto.tink.shaded.protobuf.OptionOrBuilder) r2
            return r2
    }

    public java.util.List<? extends com.google.crypto.tink.shaded.protobuf.OptionOrBuilder> getOptionsOrBuilderList() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Option> r0 = r1.options_
            return r0
    }
}
