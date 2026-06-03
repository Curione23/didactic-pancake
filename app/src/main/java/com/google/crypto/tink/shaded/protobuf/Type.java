package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public final class Type extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.shaded.protobuf.Type, com.google.crypto.tink.shaded.protobuf.Type.Builder> implements com.google.crypto.tink.shaded.protobuf.TypeOrBuilder {
    private static final com.google.crypto.tink.shaded.protobuf.Type DEFAULT_INSTANCE = null;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Type> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    private com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<com.google.crypto.tink.shaded.protobuf.Field> fields_;
    private java.lang.String name_;
    private com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<java.lang.String> oneofs_;
    private com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<com.google.crypto.tink.shaded.protobuf.Option> options_;
    private com.google.crypto.tink.shaded.protobuf.SourceContext sourceContext_;
    private int syntax_;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.Type$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = null;

        static {
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.shaded.protobuf.Type.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Type.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Type.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Type.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Type.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L3e
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Type.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Type.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L54
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                return
        }
    }

    public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.shaded.protobuf.Type, com.google.crypto.tink.shaded.protobuf.Type.Builder> implements com.google.crypto.tink.shaded.protobuf.TypeOrBuilder {
        private Builder() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.Type r0 = com.google.crypto.tink.shaded.protobuf.Type.access$000()
                r1.<init>(r0)
                return
        }

        /* synthetic */ Builder(com.google.crypto.tink.shaded.protobuf.Type.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.crypto.tink.shaded.protobuf.Type.Builder addAllFields(java.lang.Iterable<? extends com.google.crypto.tink.shaded.protobuf.Field> r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                com.google.crypto.tink.shaded.protobuf.Type.access$700(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Type.Builder addAllOneofs(java.lang.Iterable<java.lang.String> r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                com.google.crypto.tink.shaded.protobuf.Type.access$1200(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Type.Builder addAllOptions(java.lang.Iterable<? extends com.google.crypto.tink.shaded.protobuf.Option> r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                com.google.crypto.tink.shaded.protobuf.Type.access$1800(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Type.Builder addFields(int r2, com.google.crypto.tink.shaded.protobuf.Field.Builder r3) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.build()
                com.google.crypto.tink.shaded.protobuf.Field r3 = (com.google.crypto.tink.shaded.protobuf.Field) r3
                com.google.crypto.tink.shaded.protobuf.Type.access$600(r0, r2, r3)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Type.Builder addFields(int r2, com.google.crypto.tink.shaded.protobuf.Field r3) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                com.google.crypto.tink.shaded.protobuf.Type.access$600(r0, r2, r3)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Type.Builder addFields(com.google.crypto.tink.shaded.protobuf.Field.Builder r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
                com.google.crypto.tink.shaded.protobuf.Field r2 = (com.google.crypto.tink.shaded.protobuf.Field) r2
                com.google.crypto.tink.shaded.protobuf.Type.access$500(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Type.Builder addFields(com.google.crypto.tink.shaded.protobuf.Field r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                com.google.crypto.tink.shaded.protobuf.Type.access$500(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Type.Builder addOneofs(java.lang.String r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                com.google.crypto.tink.shaded.protobuf.Type.access$1100(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Type.Builder addOneofsBytes(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                com.google.crypto.tink.shaded.protobuf.Type.access$1400(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Type.Builder addOptions(int r2, com.google.crypto.tink.shaded.protobuf.Option.Builder r3) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.build()
                com.google.crypto.tink.shaded.protobuf.Option r3 = (com.google.crypto.tink.shaded.protobuf.Option) r3
                com.google.crypto.tink.shaded.protobuf.Type.access$1700(r0, r2, r3)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Type.Builder addOptions(int r2, com.google.crypto.tink.shaded.protobuf.Option r3) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                com.google.crypto.tink.shaded.protobuf.Type.access$1700(r0, r2, r3)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Type.Builder addOptions(com.google.crypto.tink.shaded.protobuf.Option.Builder r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
                com.google.crypto.tink.shaded.protobuf.Option r2 = (com.google.crypto.tink.shaded.protobuf.Option) r2
                com.google.crypto.tink.shaded.protobuf.Type.access$1600(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Type.Builder addOptions(com.google.crypto.tink.shaded.protobuf.Option r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                com.google.crypto.tink.shaded.protobuf.Type.access$1600(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Type.Builder clearFields() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                com.google.crypto.tink.shaded.protobuf.Type.access$800(r0)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Type.Builder clearName() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                com.google.crypto.tink.shaded.protobuf.Type.access$200(r0)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Type.Builder clearOneofs() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                com.google.crypto.tink.shaded.protobuf.Type.access$1300(r0)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Type.Builder clearOptions() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                com.google.crypto.tink.shaded.protobuf.Type.access$1900(r0)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Type.Builder clearSourceContext() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                com.google.crypto.tink.shaded.protobuf.Type.access$2300(r0)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Type.Builder clearSyntax() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                com.google.crypto.tink.shaded.protobuf.Type.access$2600(r0)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
        public com.google.crypto.tink.shaded.protobuf.Field getFields(int r2) {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                com.google.crypto.tink.shaded.protobuf.Field r2 = r0.getFields(r2)
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
        public int getFieldsCount() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                int r0 = r0.getFieldsCount()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
        public java.util.List<com.google.crypto.tink.shaded.protobuf.Field> getFieldsList() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                java.util.List r0 = r0.getFieldsList()
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
        public java.lang.String getName() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                java.lang.String r0 = r0.getName()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
        public com.google.crypto.tink.shaded.protobuf.ByteString getNameBytes() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getNameBytes()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
        public java.lang.String getOneofs(int r2) {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                java.lang.String r2 = r0.getOneofs(r2)
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
        public com.google.crypto.tink.shaded.protobuf.ByteString getOneofsBytes(int r2) {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                com.google.crypto.tink.shaded.protobuf.ByteString r2 = r0.getOneofsBytes(r2)
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
        public int getOneofsCount() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                int r0 = r0.getOneofsCount()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
        public java.util.List<java.lang.String> getOneofsList() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                java.util.List r0 = r0.getOneofsList()
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
        public com.google.crypto.tink.shaded.protobuf.Option getOptions(int r2) {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                com.google.crypto.tink.shaded.protobuf.Option r2 = r0.getOptions(r2)
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
        public int getOptionsCount() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                int r0 = r0.getOptionsCount()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
        public java.util.List<com.google.crypto.tink.shaded.protobuf.Option> getOptionsList() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                java.util.List r0 = r0.getOptionsList()
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
        public com.google.crypto.tink.shaded.protobuf.SourceContext getSourceContext() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                com.google.crypto.tink.shaded.protobuf.SourceContext r0 = r0.getSourceContext()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
        public com.google.crypto.tink.shaded.protobuf.Syntax getSyntax() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                com.google.crypto.tink.shaded.protobuf.Syntax r0 = r0.getSyntax()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
        public int getSyntaxValue() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                int r0 = r0.getSyntaxValue()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
        public boolean hasSourceContext() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                boolean r0 = r0.hasSourceContext()
                return r0
        }

        public com.google.crypto.tink.shaded.protobuf.Type.Builder mergeSourceContext(com.google.crypto.tink.shaded.protobuf.SourceContext r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                com.google.crypto.tink.shaded.protobuf.Type.access$2200(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Type.Builder removeFields(int r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                com.google.crypto.tink.shaded.protobuf.Type.access$900(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Type.Builder removeOptions(int r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                com.google.crypto.tink.shaded.protobuf.Type.access$2000(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Type.Builder setFields(int r2, com.google.crypto.tink.shaded.protobuf.Field.Builder r3) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.build()
                com.google.crypto.tink.shaded.protobuf.Field r3 = (com.google.crypto.tink.shaded.protobuf.Field) r3
                com.google.crypto.tink.shaded.protobuf.Type.access$400(r0, r2, r3)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Type.Builder setFields(int r2, com.google.crypto.tink.shaded.protobuf.Field r3) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                com.google.crypto.tink.shaded.protobuf.Type.access$400(r0, r2, r3)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Type.Builder setName(java.lang.String r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                com.google.crypto.tink.shaded.protobuf.Type.access$100(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Type.Builder setNameBytes(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                com.google.crypto.tink.shaded.protobuf.Type.access$300(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Type.Builder setOneofs(int r2, java.lang.String r3) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                com.google.crypto.tink.shaded.protobuf.Type.access$1000(r0, r2, r3)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Type.Builder setOptions(int r2, com.google.crypto.tink.shaded.protobuf.Option.Builder r3) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.build()
                com.google.crypto.tink.shaded.protobuf.Option r3 = (com.google.crypto.tink.shaded.protobuf.Option) r3
                com.google.crypto.tink.shaded.protobuf.Type.access$1500(r0, r2, r3)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Type.Builder setOptions(int r2, com.google.crypto.tink.shaded.protobuf.Option r3) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                com.google.crypto.tink.shaded.protobuf.Type.access$1500(r0, r2, r3)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Type.Builder setSourceContext(com.google.crypto.tink.shaded.protobuf.SourceContext.Builder r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
                com.google.crypto.tink.shaded.protobuf.SourceContext r2 = (com.google.crypto.tink.shaded.protobuf.SourceContext) r2
                com.google.crypto.tink.shaded.protobuf.Type.access$2100(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Type.Builder setSourceContext(com.google.crypto.tink.shaded.protobuf.SourceContext r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                com.google.crypto.tink.shaded.protobuf.Type.access$2100(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Type.Builder setSyntax(com.google.crypto.tink.shaded.protobuf.Syntax r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                com.google.crypto.tink.shaded.protobuf.Type.access$2500(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Type.Builder setSyntaxValue(int r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Type r0 = (com.google.crypto.tink.shaded.protobuf.Type) r0
                com.google.crypto.tink.shaded.protobuf.Type.access$2400(r0, r2)
                return r1
        }
    }

    static {
            com.google.crypto.tink.shaded.protobuf.Type r0 = new com.google.crypto.tink.shaded.protobuf.Type
            r0.<init>()
            com.google.crypto.tink.shaded.protobuf.Type.DEFAULT_INSTANCE = r0
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.Type> r1 = com.google.crypto.tink.shaded.protobuf.Type.class
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(r1, r0)
            return
    }

    private Type() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.name_ = r0
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r0 = emptyProtobufList()
            r1.fields_ = r0
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.emptyProtobufList()
            r1.oneofs_ = r0
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r0 = emptyProtobufList()
            r1.options_ = r0
            return
    }

    static /* synthetic */ com.google.crypto.tink.shaded.protobuf.Type access$000() {
            com.google.crypto.tink.shaded.protobuf.Type r0 = com.google.crypto.tink.shaded.protobuf.Type.DEFAULT_INSTANCE
            return r0
    }

    static /* synthetic */ void access$100(com.google.crypto.tink.shaded.protobuf.Type r0, java.lang.String r1) {
            r0.setName(r1)
            return
    }

    static /* synthetic */ void access$1000(com.google.crypto.tink.shaded.protobuf.Type r0, int r1, java.lang.String r2) {
            r0.setOneofs(r1, r2)
            return
    }

    static /* synthetic */ void access$1100(com.google.crypto.tink.shaded.protobuf.Type r0, java.lang.String r1) {
            r0.addOneofs(r1)
            return
    }

    static /* synthetic */ void access$1200(com.google.crypto.tink.shaded.protobuf.Type r0, java.lang.Iterable r1) {
            r0.addAllOneofs(r1)
            return
    }

    static /* synthetic */ void access$1300(com.google.crypto.tink.shaded.protobuf.Type r0) {
            r0.clearOneofs()
            return
    }

    static /* synthetic */ void access$1400(com.google.crypto.tink.shaded.protobuf.Type r0, com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0.addOneofsBytes(r1)
            return
    }

    static /* synthetic */ void access$1500(com.google.crypto.tink.shaded.protobuf.Type r0, int r1, com.google.crypto.tink.shaded.protobuf.Option r2) {
            r0.setOptions(r1, r2)
            return
    }

    static /* synthetic */ void access$1600(com.google.crypto.tink.shaded.protobuf.Type r0, com.google.crypto.tink.shaded.protobuf.Option r1) {
            r0.addOptions(r1)
            return
    }

    static /* synthetic */ void access$1700(com.google.crypto.tink.shaded.protobuf.Type r0, int r1, com.google.crypto.tink.shaded.protobuf.Option r2) {
            r0.addOptions(r1, r2)
            return
    }

    static /* synthetic */ void access$1800(com.google.crypto.tink.shaded.protobuf.Type r0, java.lang.Iterable r1) {
            r0.addAllOptions(r1)
            return
    }

    static /* synthetic */ void access$1900(com.google.crypto.tink.shaded.protobuf.Type r0) {
            r0.clearOptions()
            return
    }

    static /* synthetic */ void access$200(com.google.crypto.tink.shaded.protobuf.Type r0) {
            r0.clearName()
            return
    }

    static /* synthetic */ void access$2000(com.google.crypto.tink.shaded.protobuf.Type r0, int r1) {
            r0.removeOptions(r1)
            return
    }

    static /* synthetic */ void access$2100(com.google.crypto.tink.shaded.protobuf.Type r0, com.google.crypto.tink.shaded.protobuf.SourceContext r1) {
            r0.setSourceContext(r1)
            return
    }

    static /* synthetic */ void access$2200(com.google.crypto.tink.shaded.protobuf.Type r0, com.google.crypto.tink.shaded.protobuf.SourceContext r1) {
            r0.mergeSourceContext(r1)
            return
    }

    static /* synthetic */ void access$2300(com.google.crypto.tink.shaded.protobuf.Type r0) {
            r0.clearSourceContext()
            return
    }

    static /* synthetic */ void access$2400(com.google.crypto.tink.shaded.protobuf.Type r0, int r1) {
            r0.setSyntaxValue(r1)
            return
    }

    static /* synthetic */ void access$2500(com.google.crypto.tink.shaded.protobuf.Type r0, com.google.crypto.tink.shaded.protobuf.Syntax r1) {
            r0.setSyntax(r1)
            return
    }

    static /* synthetic */ void access$2600(com.google.crypto.tink.shaded.protobuf.Type r0) {
            r0.clearSyntax()
            return
    }

    static /* synthetic */ void access$300(com.google.crypto.tink.shaded.protobuf.Type r0, com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0.setNameBytes(r1)
            return
    }

    static /* synthetic */ void access$400(com.google.crypto.tink.shaded.protobuf.Type r0, int r1, com.google.crypto.tink.shaded.protobuf.Field r2) {
            r0.setFields(r1, r2)
            return
    }

    static /* synthetic */ void access$500(com.google.crypto.tink.shaded.protobuf.Type r0, com.google.crypto.tink.shaded.protobuf.Field r1) {
            r0.addFields(r1)
            return
    }

    static /* synthetic */ void access$600(com.google.crypto.tink.shaded.protobuf.Type r0, int r1, com.google.crypto.tink.shaded.protobuf.Field r2) {
            r0.addFields(r1, r2)
            return
    }

    static /* synthetic */ void access$700(com.google.crypto.tink.shaded.protobuf.Type r0, java.lang.Iterable r1) {
            r0.addAllFields(r1)
            return
    }

    static /* synthetic */ void access$800(com.google.crypto.tink.shaded.protobuf.Type r0) {
            r0.clearFields()
            return
    }

    static /* synthetic */ void access$900(com.google.crypto.tink.shaded.protobuf.Type r0, int r1) {
            r0.removeFields(r1)
            return
    }

    private void addAllFields(java.lang.Iterable<? extends com.google.crypto.tink.shaded.protobuf.Field> r2) {
            r1 = this;
            r1.ensureFieldsIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Field> r0 = r1.fields_
            com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.addAll(r2, r0)
            return
    }

    private void addAllOneofs(java.lang.Iterable<java.lang.String> r2) {
            r1 = this;
            r1.ensureOneofsIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<java.lang.String> r0 = r1.oneofs_
            com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.addAll(r2, r0)
            return
    }

    private void addAllOptions(java.lang.Iterable<? extends com.google.crypto.tink.shaded.protobuf.Option> r2) {
            r1 = this;
            r1.ensureOptionsIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Option> r0 = r1.options_
            com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.addAll(r2, r0)
            return
    }

    private void addFields(int r2, com.google.crypto.tink.shaded.protobuf.Field r3) {
            r1 = this;
            r3.getClass()
            r1.ensureFieldsIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Field> r0 = r1.fields_
            r0.add(r2, r3)
            return
    }

    private void addFields(com.google.crypto.tink.shaded.protobuf.Field r2) {
            r1 = this;
            r2.getClass()
            r1.ensureFieldsIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Field> r0 = r1.fields_
            r0.add(r2)
            return
    }

    private void addOneofs(java.lang.String r2) {
            r1 = this;
            r2.getClass()
            r1.ensureOneofsIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<java.lang.String> r0 = r1.oneofs_
            r0.add(r2)
            return
    }

    private void addOneofsBytes(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
            r1 = this;
            checkByteStringIsUtf8(r2)
            r1.ensureOneofsIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<java.lang.String> r0 = r1.oneofs_
            java.lang.String r2 = r2.toStringUtf8()
            r0.add(r2)
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

    private void clearFields() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r0 = emptyProtobufList()
            r1.fields_ = r0
            return
    }

    private void clearName() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Type r0 = getDefaultInstance()
            java.lang.String r0 = r0.getName()
            r1.name_ = r0
            return
    }

    private void clearOneofs() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.emptyProtobufList()
            r1.oneofs_ = r0
            return
    }

    private void clearOptions() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r0 = emptyProtobufList()
            r1.options_ = r0
            return
    }

    private void clearSourceContext() {
            r1 = this;
            r0 = 0
            r1.sourceContext_ = r0
            return
    }

    private void clearSyntax() {
            r1 = this;
            r0 = 0
            r1.syntax_ = r0
            return
    }

    private void ensureFieldsIsMutable() {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Field> r0 = r2.fields_
            boolean r1 = r0.isModifiable()
            if (r1 != 0) goto Le
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.mutableCopy(r0)
            r2.fields_ = r0
        Le:
            return
    }

    private void ensureOneofsIsMutable() {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<java.lang.String> r0 = r2.oneofs_
            boolean r1 = r0.isModifiable()
            if (r1 != 0) goto Le
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.mutableCopy(r0)
            r2.oneofs_ = r0
        Le:
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

    public static com.google.crypto.tink.shaded.protobuf.Type getDefaultInstance() {
            com.google.crypto.tink.shaded.protobuf.Type r0 = com.google.crypto.tink.shaded.protobuf.Type.DEFAULT_INSTANCE
            return r0
    }

    private void mergeSourceContext(com.google.crypto.tink.shaded.protobuf.SourceContext r3) {
            r2 = this;
            r3.getClass()
            com.google.crypto.tink.shaded.protobuf.SourceContext r0 = r2.sourceContext_
            if (r0 == 0) goto L22
            com.google.crypto.tink.shaded.protobuf.SourceContext r1 = com.google.crypto.tink.shaded.protobuf.SourceContext.getDefaultInstance()
            if (r0 == r1) goto L22
            com.google.crypto.tink.shaded.protobuf.SourceContext r0 = r2.sourceContext_
            com.google.crypto.tink.shaded.protobuf.SourceContext$Builder r0 = com.google.crypto.tink.shaded.protobuf.SourceContext.newBuilder(r0)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r3 = r0.mergeFrom(r3)
            com.google.crypto.tink.shaded.protobuf.SourceContext$Builder r3 = (com.google.crypto.tink.shaded.protobuf.SourceContext.Builder) r3
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.buildPartial()
            com.google.crypto.tink.shaded.protobuf.SourceContext r3 = (com.google.crypto.tink.shaded.protobuf.SourceContext) r3
            r2.sourceContext_ = r3
            goto L24
        L22:
            r2.sourceContext_ = r3
        L24:
            return
    }

    public static com.google.crypto.tink.shaded.protobuf.Type.Builder newBuilder() {
            com.google.crypto.tink.shaded.protobuf.Type r0 = com.google.crypto.tink.shaded.protobuf.Type.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.createBuilder()
            com.google.crypto.tink.shaded.protobuf.Type$Builder r0 = (com.google.crypto.tink.shaded.protobuf.Type.Builder) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Type.Builder newBuilder(com.google.crypto.tink.shaded.protobuf.Type r1) {
            com.google.crypto.tink.shaded.protobuf.Type r0 = com.google.crypto.tink.shaded.protobuf.Type.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = r0.createBuilder(r1)
            com.google.crypto.tink.shaded.protobuf.Type$Builder r1 = (com.google.crypto.tink.shaded.protobuf.Type.Builder) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Type parseDelimitedFrom(java.io.InputStream r1) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Type r0 = com.google.crypto.tink.shaded.protobuf.Type.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = parseDelimitedFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Type r1 = (com.google.crypto.tink.shaded.protobuf.Type) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Type parseDelimitedFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Type r0 = com.google.crypto.tink.shaded.protobuf.Type.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = parseDelimitedFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Type r1 = (com.google.crypto.tink.shaded.protobuf.Type) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Type parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Type r0 = com.google.crypto.tink.shaded.protobuf.Type.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Type r1 = (com.google.crypto.tink.shaded.protobuf.Type) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Type parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Type r0 = com.google.crypto.tink.shaded.protobuf.Type.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Type r1 = (com.google.crypto.tink.shaded.protobuf.Type) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Type parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Type r0 = com.google.crypto.tink.shaded.protobuf.Type.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Type r1 = (com.google.crypto.tink.shaded.protobuf.Type) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Type parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Type r0 = com.google.crypto.tink.shaded.protobuf.Type.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Type r1 = (com.google.crypto.tink.shaded.protobuf.Type) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Type parseFrom(java.io.InputStream r1) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Type r0 = com.google.crypto.tink.shaded.protobuf.Type.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Type r1 = (com.google.crypto.tink.shaded.protobuf.Type) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Type parseFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Type r0 = com.google.crypto.tink.shaded.protobuf.Type.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Type r1 = (com.google.crypto.tink.shaded.protobuf.Type) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Type parseFrom(java.nio.ByteBuffer r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Type r0 = com.google.crypto.tink.shaded.protobuf.Type.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Type r1 = (com.google.crypto.tink.shaded.protobuf.Type) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Type parseFrom(java.nio.ByteBuffer r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Type r0 = com.google.crypto.tink.shaded.protobuf.Type.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Type r1 = (com.google.crypto.tink.shaded.protobuf.Type) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Type parseFrom(byte[] r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Type r0 = com.google.crypto.tink.shaded.protobuf.Type.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Type r1 = (com.google.crypto.tink.shaded.protobuf.Type) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Type parseFrom(byte[] r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Type r0 = com.google.crypto.tink.shaded.protobuf.Type.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Type r1 = (com.google.crypto.tink.shaded.protobuf.Type) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Type> parser() {
            com.google.crypto.tink.shaded.protobuf.Type r0 = com.google.crypto.tink.shaded.protobuf.Type.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.Parser r0 = r0.getParserForType()
            return r0
    }

    private void removeFields(int r2) {
            r1 = this;
            r1.ensureFieldsIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Field> r0 = r1.fields_
            r0.remove(r2)
            return
    }

    private void removeOptions(int r2) {
            r1 = this;
            r1.ensureOptionsIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Option> r0 = r1.options_
            r0.remove(r2)
            return
    }

    private void setFields(int r2, com.google.crypto.tink.shaded.protobuf.Field r3) {
            r1 = this;
            r3.getClass()
            r1.ensureFieldsIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Field> r0 = r1.fields_
            r0.set(r2, r3)
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

    private void setOneofs(int r2, java.lang.String r3) {
            r1 = this;
            r3.getClass()
            r1.ensureOneofsIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<java.lang.String> r0 = r1.oneofs_
            r0.set(r2, r3)
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

    private void setSourceContext(com.google.crypto.tink.shaded.protobuf.SourceContext r1) {
            r0 = this;
            r1.getClass()
            r0.sourceContext_ = r1
            return
    }

    private void setSyntax(com.google.crypto.tink.shaded.protobuf.Syntax r1) {
            r0 = this;
            int r1 = r1.getNumber()
            r0.syntax_ = r1
            return
    }

    private void setSyntaxValue(int r1) {
            r0 = this;
            r0.syntax_ = r1
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke r9, java.lang.Object r10, java.lang.Object r11) {
            r8 = this;
            int[] r10 = com.google.crypto.tink.shaded.protobuf.Type.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke
            int r9 = r9.ordinal()
            r9 = r10[r9]
            r10 = 0
            switch(r9) {
                case 1: goto L59;
                case 2: goto L53;
                case 3: goto L36;
                case 4: goto L33;
                case 5: goto L19;
                case 6: goto L13;
                case 7: goto L12;
                default: goto Lc;
            }
        Lc:
            java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException
            r9.<init>()
            throw r9
        L12:
            return r10
        L13:
            r9 = 1
            java.lang.Byte r9 = java.lang.Byte.valueOf(r9)
            return r9
        L19:
            com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Type> r9 = com.google.crypto.tink.shaded.protobuf.Type.PARSER
            if (r9 != 0) goto L32
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.Type> r10 = com.google.crypto.tink.shaded.protobuf.Type.class
            monitor-enter(r10)
            com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Type> r9 = com.google.crypto.tink.shaded.protobuf.Type.PARSER     // Catch: java.lang.Throwable -> L2f
            if (r9 != 0) goto L2d
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser r9 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser     // Catch: java.lang.Throwable -> L2f
            com.google.crypto.tink.shaded.protobuf.Type r11 = com.google.crypto.tink.shaded.protobuf.Type.DEFAULT_INSTANCE     // Catch: java.lang.Throwable -> L2f
            r9.<init>(r11)     // Catch: java.lang.Throwable -> L2f
            com.google.crypto.tink.shaded.protobuf.Type.PARSER = r9     // Catch: java.lang.Throwable -> L2f
        L2d:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L2f
            goto L32
        L2f:
            r9 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L2f
            throw r9
        L32:
            return r9
        L33:
            com.google.crypto.tink.shaded.protobuf.Type r9 = com.google.crypto.tink.shaded.protobuf.Type.DEFAULT_INSTANCE
            return r9
        L36:
            java.lang.String r0 = "name_"
            java.lang.String r1 = "fields_"
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.Field> r2 = com.google.crypto.tink.shaded.protobuf.Field.class
            java.lang.String r3 = "oneofs_"
            java.lang.String r4 = "options_"
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.Option> r5 = com.google.crypto.tink.shaded.protobuf.Option.class
            java.lang.String r6 = "sourceContext_"
            java.lang.String r7 = "syntax_"
            java.lang.Object[] r9 = new java.lang.Object[]{r0, r1, r2, r3, r4, r5, r6, r7}
            java.lang.String r10 = "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003Ț\u0004\u001b\u0005\t\u0006\f"
            com.google.crypto.tink.shaded.protobuf.Type r11 = com.google.crypto.tink.shaded.protobuf.Type.DEFAULT_INSTANCE
            java.lang.Object r9 = newMessageInfo(r11, r10, r9)
            return r9
        L53:
            com.google.crypto.tink.shaded.protobuf.Type$Builder r9 = new com.google.crypto.tink.shaded.protobuf.Type$Builder
            r9.<init>(r10)
            return r9
        L59:
            com.google.crypto.tink.shaded.protobuf.Type r9 = new com.google.crypto.tink.shaded.protobuf.Type
            r9.<init>()
            return r9
    }

    @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
    public com.google.crypto.tink.shaded.protobuf.Field getFields(int r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Field> r0 = r1.fields_
            java.lang.Object r2 = r0.get(r2)
            com.google.crypto.tink.shaded.protobuf.Field r2 = (com.google.crypto.tink.shaded.protobuf.Field) r2
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
    public int getFieldsCount() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Field> r0 = r1.fields_
            int r0 = r0.size()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
    public java.util.List<com.google.crypto.tink.shaded.protobuf.Field> getFieldsList() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Field> r0 = r1.fields_
            return r0
    }

    public com.google.crypto.tink.shaded.protobuf.FieldOrBuilder getFieldsOrBuilder(int r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Field> r0 = r1.fields_
            java.lang.Object r2 = r0.get(r2)
            com.google.crypto.tink.shaded.protobuf.FieldOrBuilder r2 = (com.google.crypto.tink.shaded.protobuf.FieldOrBuilder) r2
            return r2
    }

    public java.util.List<? extends com.google.crypto.tink.shaded.protobuf.FieldOrBuilder> getFieldsOrBuilderList() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Field> r0 = r1.fields_
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name_
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
    public com.google.crypto.tink.shaded.protobuf.ByteString getNameBytes() {
            r1 = this;
            java.lang.String r0 = r1.name_
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFromUtf8(r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
    public java.lang.String getOneofs(int r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<java.lang.String> r0 = r1.oneofs_
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
    public com.google.crypto.tink.shaded.protobuf.ByteString getOneofsBytes(int r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<java.lang.String> r0 = r1.oneofs_
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFromUtf8(r2)
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
    public int getOneofsCount() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<java.lang.String> r0 = r1.oneofs_
            int r0 = r0.size()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
    public java.util.List<java.lang.String> getOneofsList() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<java.lang.String> r0 = r1.oneofs_
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
    public com.google.crypto.tink.shaded.protobuf.Option getOptions(int r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Option> r0 = r1.options_
            java.lang.Object r2 = r0.get(r2)
            com.google.crypto.tink.shaded.protobuf.Option r2 = (com.google.crypto.tink.shaded.protobuf.Option) r2
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
    public int getOptionsCount() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Option> r0 = r1.options_
            int r0 = r0.size()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
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

    @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
    public com.google.crypto.tink.shaded.protobuf.SourceContext getSourceContext() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.SourceContext r0 = r1.sourceContext_
            if (r0 != 0) goto L8
            com.google.crypto.tink.shaded.protobuf.SourceContext r0 = com.google.crypto.tink.shaded.protobuf.SourceContext.getDefaultInstance()
        L8:
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
    public com.google.crypto.tink.shaded.protobuf.Syntax getSyntax() {
            r1 = this;
            int r0 = r1.syntax_
            com.google.crypto.tink.shaded.protobuf.Syntax r0 = com.google.crypto.tink.shaded.protobuf.Syntax.forNumber(r0)
            if (r0 != 0) goto La
            com.google.crypto.tink.shaded.protobuf.Syntax r0 = com.google.crypto.tink.shaded.protobuf.Syntax.UNRECOGNIZED
        La:
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
    public int getSyntaxValue() {
            r1 = this;
            int r0 = r1.syntax_
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
    public boolean hasSourceContext() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.SourceContext r0 = r1.sourceContext_
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }
}
