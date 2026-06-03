package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public final class Api extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.shaded.protobuf.Api, com.google.crypto.tink.shaded.protobuf.Api.Builder> implements com.google.crypto.tink.shaded.protobuf.ApiOrBuilder {
    private static final com.google.crypto.tink.shaded.protobuf.Api DEFAULT_INSTANCE = null;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Api> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    private com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<com.google.crypto.tink.shaded.protobuf.Method> methods_;
    private com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<com.google.crypto.tink.shaded.protobuf.Mixin> mixins_;
    private java.lang.String name_;
    private com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<com.google.crypto.tink.shaded.protobuf.Option> options_;
    private com.google.crypto.tink.shaded.protobuf.SourceContext sourceContext_;
    private int syntax_;
    private java.lang.String version_;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.Api$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = null;

        static {
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.shaded.protobuf.Api.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Api.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Api.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Api.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Api.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L3e
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Api.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Api.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L54
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                return
        }
    }

    public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.shaded.protobuf.Api, com.google.crypto.tink.shaded.protobuf.Api.Builder> implements com.google.crypto.tink.shaded.protobuf.ApiOrBuilder {
        private Builder() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.Api r0 = com.google.crypto.tink.shaded.protobuf.Api.access$000()
                r1.<init>(r0)
                return
        }

        /* synthetic */ Builder(com.google.crypto.tink.shaded.protobuf.Api.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.crypto.tink.shaded.protobuf.Api.Builder addAllMethods(java.lang.Iterable<? extends com.google.crypto.tink.shaded.protobuf.Method> r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.Api.access$700(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Api.Builder addAllMixins(java.lang.Iterable<? extends com.google.crypto.tink.shaded.protobuf.Mixin> r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.Api.access$2500(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Api.Builder addAllOptions(java.lang.Iterable<? extends com.google.crypto.tink.shaded.protobuf.Option> r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.Api.access$1300(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Api.Builder addMethods(int r2, com.google.crypto.tink.shaded.protobuf.Method.Builder r3) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.build()
                com.google.crypto.tink.shaded.protobuf.Method r3 = (com.google.crypto.tink.shaded.protobuf.Method) r3
                com.google.crypto.tink.shaded.protobuf.Api.access$600(r0, r2, r3)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Api.Builder addMethods(int r2, com.google.crypto.tink.shaded.protobuf.Method r3) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.Api.access$600(r0, r2, r3)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Api.Builder addMethods(com.google.crypto.tink.shaded.protobuf.Method.Builder r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
                com.google.crypto.tink.shaded.protobuf.Method r2 = (com.google.crypto.tink.shaded.protobuf.Method) r2
                com.google.crypto.tink.shaded.protobuf.Api.access$500(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Api.Builder addMethods(com.google.crypto.tink.shaded.protobuf.Method r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.Api.access$500(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Api.Builder addMixins(int r2, com.google.crypto.tink.shaded.protobuf.Mixin.Builder r3) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.build()
                com.google.crypto.tink.shaded.protobuf.Mixin r3 = (com.google.crypto.tink.shaded.protobuf.Mixin) r3
                com.google.crypto.tink.shaded.protobuf.Api.access$2400(r0, r2, r3)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Api.Builder addMixins(int r2, com.google.crypto.tink.shaded.protobuf.Mixin r3) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.Api.access$2400(r0, r2, r3)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Api.Builder addMixins(com.google.crypto.tink.shaded.protobuf.Mixin.Builder r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
                com.google.crypto.tink.shaded.protobuf.Mixin r2 = (com.google.crypto.tink.shaded.protobuf.Mixin) r2
                com.google.crypto.tink.shaded.protobuf.Api.access$2300(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Api.Builder addMixins(com.google.crypto.tink.shaded.protobuf.Mixin r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.Api.access$2300(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Api.Builder addOptions(int r2, com.google.crypto.tink.shaded.protobuf.Option.Builder r3) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.build()
                com.google.crypto.tink.shaded.protobuf.Option r3 = (com.google.crypto.tink.shaded.protobuf.Option) r3
                com.google.crypto.tink.shaded.protobuf.Api.access$1200(r0, r2, r3)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Api.Builder addOptions(int r2, com.google.crypto.tink.shaded.protobuf.Option r3) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.Api.access$1200(r0, r2, r3)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Api.Builder addOptions(com.google.crypto.tink.shaded.protobuf.Option.Builder r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
                com.google.crypto.tink.shaded.protobuf.Option r2 = (com.google.crypto.tink.shaded.protobuf.Option) r2
                com.google.crypto.tink.shaded.protobuf.Api.access$1100(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Api.Builder addOptions(com.google.crypto.tink.shaded.protobuf.Option r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.Api.access$1100(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Api.Builder clearMethods() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.Api.access$800(r0)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Api.Builder clearMixins() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.Api.access$2600(r0)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Api.Builder clearName() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.Api.access$200(r0)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Api.Builder clearOptions() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.Api.access$1400(r0)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Api.Builder clearSourceContext() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.Api.access$2100(r0)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Api.Builder clearSyntax() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.Api.access$3000(r0)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Api.Builder clearVersion() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.Api.access$1700(r0)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public com.google.crypto.tink.shaded.protobuf.Method getMethods(int r2) {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.Method r2 = r0.getMethods(r2)
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public int getMethodsCount() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                int r0 = r0.getMethodsCount()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public java.util.List<com.google.crypto.tink.shaded.protobuf.Method> getMethodsList() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                java.util.List r0 = r0.getMethodsList()
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public com.google.crypto.tink.shaded.protobuf.Mixin getMixins(int r2) {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.Mixin r2 = r0.getMixins(r2)
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public int getMixinsCount() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                int r0 = r0.getMixinsCount()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public java.util.List<com.google.crypto.tink.shaded.protobuf.Mixin> getMixinsList() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                java.util.List r0 = r0.getMixinsList()
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public java.lang.String getName() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                java.lang.String r0 = r0.getName()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public com.google.crypto.tink.shaded.protobuf.ByteString getNameBytes() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getNameBytes()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public com.google.crypto.tink.shaded.protobuf.Option getOptions(int r2) {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.Option r2 = r0.getOptions(r2)
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public int getOptionsCount() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                int r0 = r0.getOptionsCount()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public java.util.List<com.google.crypto.tink.shaded.protobuf.Option> getOptionsList() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                java.util.List r0 = r0.getOptionsList()
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public com.google.crypto.tink.shaded.protobuf.SourceContext getSourceContext() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.SourceContext r0 = r0.getSourceContext()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public com.google.crypto.tink.shaded.protobuf.Syntax getSyntax() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.Syntax r0 = r0.getSyntax()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public int getSyntaxValue() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                int r0 = r0.getSyntaxValue()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public java.lang.String getVersion() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                java.lang.String r0 = r0.getVersion()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public com.google.crypto.tink.shaded.protobuf.ByteString getVersionBytes() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getVersionBytes()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public boolean hasSourceContext() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                boolean r0 = r0.hasSourceContext()
                return r0
        }

        public com.google.crypto.tink.shaded.protobuf.Api.Builder mergeSourceContext(com.google.crypto.tink.shaded.protobuf.SourceContext r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.Api.access$2000(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Api.Builder removeMethods(int r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.Api.access$900(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Api.Builder removeMixins(int r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.Api.access$2700(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Api.Builder removeOptions(int r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.Api.access$1500(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Api.Builder setMethods(int r2, com.google.crypto.tink.shaded.protobuf.Method.Builder r3) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.build()
                com.google.crypto.tink.shaded.protobuf.Method r3 = (com.google.crypto.tink.shaded.protobuf.Method) r3
                com.google.crypto.tink.shaded.protobuf.Api.access$400(r0, r2, r3)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Api.Builder setMethods(int r2, com.google.crypto.tink.shaded.protobuf.Method r3) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.Api.access$400(r0, r2, r3)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Api.Builder setMixins(int r2, com.google.crypto.tink.shaded.protobuf.Mixin.Builder r3) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.build()
                com.google.crypto.tink.shaded.protobuf.Mixin r3 = (com.google.crypto.tink.shaded.protobuf.Mixin) r3
                com.google.crypto.tink.shaded.protobuf.Api.access$2200(r0, r2, r3)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Api.Builder setMixins(int r2, com.google.crypto.tink.shaded.protobuf.Mixin r3) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.Api.access$2200(r0, r2, r3)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Api.Builder setName(java.lang.String r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.Api.access$100(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Api.Builder setNameBytes(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.Api.access$300(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Api.Builder setOptions(int r2, com.google.crypto.tink.shaded.protobuf.Option.Builder r3) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.build()
                com.google.crypto.tink.shaded.protobuf.Option r3 = (com.google.crypto.tink.shaded.protobuf.Option) r3
                com.google.crypto.tink.shaded.protobuf.Api.access$1000(r0, r2, r3)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Api.Builder setOptions(int r2, com.google.crypto.tink.shaded.protobuf.Option r3) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.Api.access$1000(r0, r2, r3)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Api.Builder setSourceContext(com.google.crypto.tink.shaded.protobuf.SourceContext.Builder r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
                com.google.crypto.tink.shaded.protobuf.SourceContext r2 = (com.google.crypto.tink.shaded.protobuf.SourceContext) r2
                com.google.crypto.tink.shaded.protobuf.Api.access$1900(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Api.Builder setSourceContext(com.google.crypto.tink.shaded.protobuf.SourceContext r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.Api.access$1900(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Api.Builder setSyntax(com.google.crypto.tink.shaded.protobuf.Syntax r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.Api.access$2900(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Api.Builder setSyntaxValue(int r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.Api.access$2800(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Api.Builder setVersion(java.lang.String r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.Api.access$1600(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Api.Builder setVersionBytes(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Api r0 = (com.google.crypto.tink.shaded.protobuf.Api) r0
                com.google.crypto.tink.shaded.protobuf.Api.access$1800(r0, r2)
                return r1
        }
    }

    static {
            com.google.crypto.tink.shaded.protobuf.Api r0 = new com.google.crypto.tink.shaded.protobuf.Api
            r0.<init>()
            com.google.crypto.tink.shaded.protobuf.Api.DEFAULT_INSTANCE = r0
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.Api> r1 = com.google.crypto.tink.shaded.protobuf.Api.class
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(r1, r0)
            return
    }

    private Api() {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = ""
            r2.name_ = r0
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r1 = emptyProtobufList()
            r2.methods_ = r1
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r1 = emptyProtobufList()
            r2.options_ = r1
            r2.version_ = r0
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r0 = emptyProtobufList()
            r2.mixins_ = r0
            return
    }

    static /* synthetic */ com.google.crypto.tink.shaded.protobuf.Api access$000() {
            com.google.crypto.tink.shaded.protobuf.Api r0 = com.google.crypto.tink.shaded.protobuf.Api.DEFAULT_INSTANCE
            return r0
    }

    static /* synthetic */ void access$100(com.google.crypto.tink.shaded.protobuf.Api r0, java.lang.String r1) {
            r0.setName(r1)
            return
    }

    static /* synthetic */ void access$1000(com.google.crypto.tink.shaded.protobuf.Api r0, int r1, com.google.crypto.tink.shaded.protobuf.Option r2) {
            r0.setOptions(r1, r2)
            return
    }

    static /* synthetic */ void access$1100(com.google.crypto.tink.shaded.protobuf.Api r0, com.google.crypto.tink.shaded.protobuf.Option r1) {
            r0.addOptions(r1)
            return
    }

    static /* synthetic */ void access$1200(com.google.crypto.tink.shaded.protobuf.Api r0, int r1, com.google.crypto.tink.shaded.protobuf.Option r2) {
            r0.addOptions(r1, r2)
            return
    }

    static /* synthetic */ void access$1300(com.google.crypto.tink.shaded.protobuf.Api r0, java.lang.Iterable r1) {
            r0.addAllOptions(r1)
            return
    }

    static /* synthetic */ void access$1400(com.google.crypto.tink.shaded.protobuf.Api r0) {
            r0.clearOptions()
            return
    }

    static /* synthetic */ void access$1500(com.google.crypto.tink.shaded.protobuf.Api r0, int r1) {
            r0.removeOptions(r1)
            return
    }

    static /* synthetic */ void access$1600(com.google.crypto.tink.shaded.protobuf.Api r0, java.lang.String r1) {
            r0.setVersion(r1)
            return
    }

    static /* synthetic */ void access$1700(com.google.crypto.tink.shaded.protobuf.Api r0) {
            r0.clearVersion()
            return
    }

    static /* synthetic */ void access$1800(com.google.crypto.tink.shaded.protobuf.Api r0, com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0.setVersionBytes(r1)
            return
    }

    static /* synthetic */ void access$1900(com.google.crypto.tink.shaded.protobuf.Api r0, com.google.crypto.tink.shaded.protobuf.SourceContext r1) {
            r0.setSourceContext(r1)
            return
    }

    static /* synthetic */ void access$200(com.google.crypto.tink.shaded.protobuf.Api r0) {
            r0.clearName()
            return
    }

    static /* synthetic */ void access$2000(com.google.crypto.tink.shaded.protobuf.Api r0, com.google.crypto.tink.shaded.protobuf.SourceContext r1) {
            r0.mergeSourceContext(r1)
            return
    }

    static /* synthetic */ void access$2100(com.google.crypto.tink.shaded.protobuf.Api r0) {
            r0.clearSourceContext()
            return
    }

    static /* synthetic */ void access$2200(com.google.crypto.tink.shaded.protobuf.Api r0, int r1, com.google.crypto.tink.shaded.protobuf.Mixin r2) {
            r0.setMixins(r1, r2)
            return
    }

    static /* synthetic */ void access$2300(com.google.crypto.tink.shaded.protobuf.Api r0, com.google.crypto.tink.shaded.protobuf.Mixin r1) {
            r0.addMixins(r1)
            return
    }

    static /* synthetic */ void access$2400(com.google.crypto.tink.shaded.protobuf.Api r0, int r1, com.google.crypto.tink.shaded.protobuf.Mixin r2) {
            r0.addMixins(r1, r2)
            return
    }

    static /* synthetic */ void access$2500(com.google.crypto.tink.shaded.protobuf.Api r0, java.lang.Iterable r1) {
            r0.addAllMixins(r1)
            return
    }

    static /* synthetic */ void access$2600(com.google.crypto.tink.shaded.protobuf.Api r0) {
            r0.clearMixins()
            return
    }

    static /* synthetic */ void access$2700(com.google.crypto.tink.shaded.protobuf.Api r0, int r1) {
            r0.removeMixins(r1)
            return
    }

    static /* synthetic */ void access$2800(com.google.crypto.tink.shaded.protobuf.Api r0, int r1) {
            r0.setSyntaxValue(r1)
            return
    }

    static /* synthetic */ void access$2900(com.google.crypto.tink.shaded.protobuf.Api r0, com.google.crypto.tink.shaded.protobuf.Syntax r1) {
            r0.setSyntax(r1)
            return
    }

    static /* synthetic */ void access$300(com.google.crypto.tink.shaded.protobuf.Api r0, com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0.setNameBytes(r1)
            return
    }

    static /* synthetic */ void access$3000(com.google.crypto.tink.shaded.protobuf.Api r0) {
            r0.clearSyntax()
            return
    }

    static /* synthetic */ void access$400(com.google.crypto.tink.shaded.protobuf.Api r0, int r1, com.google.crypto.tink.shaded.protobuf.Method r2) {
            r0.setMethods(r1, r2)
            return
    }

    static /* synthetic */ void access$500(com.google.crypto.tink.shaded.protobuf.Api r0, com.google.crypto.tink.shaded.protobuf.Method r1) {
            r0.addMethods(r1)
            return
    }

    static /* synthetic */ void access$600(com.google.crypto.tink.shaded.protobuf.Api r0, int r1, com.google.crypto.tink.shaded.protobuf.Method r2) {
            r0.addMethods(r1, r2)
            return
    }

    static /* synthetic */ void access$700(com.google.crypto.tink.shaded.protobuf.Api r0, java.lang.Iterable r1) {
            r0.addAllMethods(r1)
            return
    }

    static /* synthetic */ void access$800(com.google.crypto.tink.shaded.protobuf.Api r0) {
            r0.clearMethods()
            return
    }

    static /* synthetic */ void access$900(com.google.crypto.tink.shaded.protobuf.Api r0, int r1) {
            r0.removeMethods(r1)
            return
    }

    private void addAllMethods(java.lang.Iterable<? extends com.google.crypto.tink.shaded.protobuf.Method> r2) {
            r1 = this;
            r1.ensureMethodsIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Method> r0 = r1.methods_
            com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.addAll(r2, r0)
            return
    }

    private void addAllMixins(java.lang.Iterable<? extends com.google.crypto.tink.shaded.protobuf.Mixin> r2) {
            r1 = this;
            r1.ensureMixinsIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Mixin> r0 = r1.mixins_
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

    private void addMethods(int r2, com.google.crypto.tink.shaded.protobuf.Method r3) {
            r1 = this;
            r3.getClass()
            r1.ensureMethodsIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Method> r0 = r1.methods_
            r0.add(r2, r3)
            return
    }

    private void addMethods(com.google.crypto.tink.shaded.protobuf.Method r2) {
            r1 = this;
            r2.getClass()
            r1.ensureMethodsIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Method> r0 = r1.methods_
            r0.add(r2)
            return
    }

    private void addMixins(int r2, com.google.crypto.tink.shaded.protobuf.Mixin r3) {
            r1 = this;
            r3.getClass()
            r1.ensureMixinsIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Mixin> r0 = r1.mixins_
            r0.add(r2, r3)
            return
    }

    private void addMixins(com.google.crypto.tink.shaded.protobuf.Mixin r2) {
            r1 = this;
            r2.getClass()
            r1.ensureMixinsIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Mixin> r0 = r1.mixins_
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

    private void clearMethods() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r0 = emptyProtobufList()
            r1.methods_ = r0
            return
    }

    private void clearMixins() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r0 = emptyProtobufList()
            r1.mixins_ = r0
            return
    }

    private void clearName() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Api r0 = getDefaultInstance()
            java.lang.String r0 = r0.getName()
            r1.name_ = r0
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

    private void clearVersion() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Api r0 = getDefaultInstance()
            java.lang.String r0 = r0.getVersion()
            r1.version_ = r0
            return
    }

    private void ensureMethodsIsMutable() {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Method> r0 = r2.methods_
            boolean r1 = r0.isModifiable()
            if (r1 != 0) goto Le
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.mutableCopy(r0)
            r2.methods_ = r0
        Le:
            return
    }

    private void ensureMixinsIsMutable() {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Mixin> r0 = r2.mixins_
            boolean r1 = r0.isModifiable()
            if (r1 != 0) goto Le
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.mutableCopy(r0)
            r2.mixins_ = r0
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

    public static com.google.crypto.tink.shaded.protobuf.Api getDefaultInstance() {
            com.google.crypto.tink.shaded.protobuf.Api r0 = com.google.crypto.tink.shaded.protobuf.Api.DEFAULT_INSTANCE
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

    public static com.google.crypto.tink.shaded.protobuf.Api.Builder newBuilder() {
            com.google.crypto.tink.shaded.protobuf.Api r0 = com.google.crypto.tink.shaded.protobuf.Api.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.createBuilder()
            com.google.crypto.tink.shaded.protobuf.Api$Builder r0 = (com.google.crypto.tink.shaded.protobuf.Api.Builder) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Api.Builder newBuilder(com.google.crypto.tink.shaded.protobuf.Api r1) {
            com.google.crypto.tink.shaded.protobuf.Api r0 = com.google.crypto.tink.shaded.protobuf.Api.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = r0.createBuilder(r1)
            com.google.crypto.tink.shaded.protobuf.Api$Builder r1 = (com.google.crypto.tink.shaded.protobuf.Api.Builder) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Api parseDelimitedFrom(java.io.InputStream r1) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Api r0 = com.google.crypto.tink.shaded.protobuf.Api.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = parseDelimitedFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Api r1 = (com.google.crypto.tink.shaded.protobuf.Api) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Api parseDelimitedFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Api r0 = com.google.crypto.tink.shaded.protobuf.Api.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = parseDelimitedFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Api r1 = (com.google.crypto.tink.shaded.protobuf.Api) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Api parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Api r0 = com.google.crypto.tink.shaded.protobuf.Api.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Api r1 = (com.google.crypto.tink.shaded.protobuf.Api) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Api parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Api r0 = com.google.crypto.tink.shaded.protobuf.Api.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Api r1 = (com.google.crypto.tink.shaded.protobuf.Api) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Api parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Api r0 = com.google.crypto.tink.shaded.protobuf.Api.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Api r1 = (com.google.crypto.tink.shaded.protobuf.Api) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Api parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Api r0 = com.google.crypto.tink.shaded.protobuf.Api.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Api r1 = (com.google.crypto.tink.shaded.protobuf.Api) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Api parseFrom(java.io.InputStream r1) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Api r0 = com.google.crypto.tink.shaded.protobuf.Api.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Api r1 = (com.google.crypto.tink.shaded.protobuf.Api) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Api parseFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Api r0 = com.google.crypto.tink.shaded.protobuf.Api.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Api r1 = (com.google.crypto.tink.shaded.protobuf.Api) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Api parseFrom(java.nio.ByteBuffer r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Api r0 = com.google.crypto.tink.shaded.protobuf.Api.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Api r1 = (com.google.crypto.tink.shaded.protobuf.Api) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Api parseFrom(java.nio.ByteBuffer r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Api r0 = com.google.crypto.tink.shaded.protobuf.Api.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Api r1 = (com.google.crypto.tink.shaded.protobuf.Api) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Api parseFrom(byte[] r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Api r0 = com.google.crypto.tink.shaded.protobuf.Api.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Api r1 = (com.google.crypto.tink.shaded.protobuf.Api) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Api parseFrom(byte[] r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Api r0 = com.google.crypto.tink.shaded.protobuf.Api.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Api r1 = (com.google.crypto.tink.shaded.protobuf.Api) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Api> parser() {
            com.google.crypto.tink.shaded.protobuf.Api r0 = com.google.crypto.tink.shaded.protobuf.Api.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.Parser r0 = r0.getParserForType()
            return r0
    }

    private void removeMethods(int r2) {
            r1 = this;
            r1.ensureMethodsIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Method> r0 = r1.methods_
            r0.remove(r2)
            return
    }

    private void removeMixins(int r2) {
            r1 = this;
            r1.ensureMixinsIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Mixin> r0 = r1.mixins_
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

    private void setMethods(int r2, com.google.crypto.tink.shaded.protobuf.Method r3) {
            r1 = this;
            r3.getClass()
            r1.ensureMethodsIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Method> r0 = r1.methods_
            r0.set(r2, r3)
            return
    }

    private void setMixins(int r2, com.google.crypto.tink.shaded.protobuf.Mixin r3) {
            r1 = this;
            r3.getClass()
            r1.ensureMixinsIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Mixin> r0 = r1.mixins_
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

    private void setVersion(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            r0.version_ = r1
            return
    }

    private void setVersionBytes(com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0 = this;
            checkByteStringIsUtf8(r1)
            java.lang.String r1 = r1.toStringUtf8()
            r0.version_ = r1
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke r11, java.lang.Object r12, java.lang.Object r13) {
            r10 = this;
            int[] r12 = com.google.crypto.tink.shaded.protobuf.Api.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke
            int r11 = r11.ordinal()
            r11 = r12[r11]
            r12 = 0
            switch(r11) {
                case 1: goto L5d;
                case 2: goto L57;
                case 3: goto L36;
                case 4: goto L33;
                case 5: goto L19;
                case 6: goto L13;
                case 7: goto L12;
                default: goto Lc;
            }
        Lc:
            java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
            r11.<init>()
            throw r11
        L12:
            return r12
        L13:
            r11 = 1
            java.lang.Byte r11 = java.lang.Byte.valueOf(r11)
            return r11
        L19:
            com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Api> r11 = com.google.crypto.tink.shaded.protobuf.Api.PARSER
            if (r11 != 0) goto L32
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.Api> r12 = com.google.crypto.tink.shaded.protobuf.Api.class
            monitor-enter(r12)
            com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Api> r11 = com.google.crypto.tink.shaded.protobuf.Api.PARSER     // Catch: java.lang.Throwable -> L2f
            if (r11 != 0) goto L2d
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser r11 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser     // Catch: java.lang.Throwable -> L2f
            com.google.crypto.tink.shaded.protobuf.Api r13 = com.google.crypto.tink.shaded.protobuf.Api.DEFAULT_INSTANCE     // Catch: java.lang.Throwable -> L2f
            r11.<init>(r13)     // Catch: java.lang.Throwable -> L2f
            com.google.crypto.tink.shaded.protobuf.Api.PARSER = r11     // Catch: java.lang.Throwable -> L2f
        L2d:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L2f
            goto L32
        L2f:
            r11 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L2f
            throw r11
        L32:
            return r11
        L33:
            com.google.crypto.tink.shaded.protobuf.Api r11 = com.google.crypto.tink.shaded.protobuf.Api.DEFAULT_INSTANCE
            return r11
        L36:
            java.lang.String r0 = "name_"
            java.lang.String r1 = "methods_"
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.Method> r2 = com.google.crypto.tink.shaded.protobuf.Method.class
            java.lang.String r3 = "options_"
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.Option> r4 = com.google.crypto.tink.shaded.protobuf.Option.class
            java.lang.String r5 = "version_"
            java.lang.String r6 = "sourceContext_"
            java.lang.String r7 = "mixins_"
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.Mixin> r8 = com.google.crypto.tink.shaded.protobuf.Mixin.class
            java.lang.String r9 = "syntax_"
            java.lang.Object[] r11 = new java.lang.Object[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9}
            java.lang.String r12 = "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004Ȉ\u0005\t\u0006\u001b\u0007\f"
            com.google.crypto.tink.shaded.protobuf.Api r13 = com.google.crypto.tink.shaded.protobuf.Api.DEFAULT_INSTANCE
            java.lang.Object r11 = newMessageInfo(r13, r12, r11)
            return r11
        L57:
            com.google.crypto.tink.shaded.protobuf.Api$Builder r11 = new com.google.crypto.tink.shaded.protobuf.Api$Builder
            r11.<init>(r12)
            return r11
        L5d:
            com.google.crypto.tink.shaded.protobuf.Api r11 = new com.google.crypto.tink.shaded.protobuf.Api
            r11.<init>()
            return r11
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public com.google.crypto.tink.shaded.protobuf.Method getMethods(int r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Method> r0 = r1.methods_
            java.lang.Object r2 = r0.get(r2)
            com.google.crypto.tink.shaded.protobuf.Method r2 = (com.google.crypto.tink.shaded.protobuf.Method) r2
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public int getMethodsCount() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Method> r0 = r1.methods_
            int r0 = r0.size()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public java.util.List<com.google.crypto.tink.shaded.protobuf.Method> getMethodsList() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Method> r0 = r1.methods_
            return r0
    }

    public com.google.crypto.tink.shaded.protobuf.MethodOrBuilder getMethodsOrBuilder(int r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Method> r0 = r1.methods_
            java.lang.Object r2 = r0.get(r2)
            com.google.crypto.tink.shaded.protobuf.MethodOrBuilder r2 = (com.google.crypto.tink.shaded.protobuf.MethodOrBuilder) r2
            return r2
    }

    public java.util.List<? extends com.google.crypto.tink.shaded.protobuf.MethodOrBuilder> getMethodsOrBuilderList() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Method> r0 = r1.methods_
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public com.google.crypto.tink.shaded.protobuf.Mixin getMixins(int r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Mixin> r0 = r1.mixins_
            java.lang.Object r2 = r0.get(r2)
            com.google.crypto.tink.shaded.protobuf.Mixin r2 = (com.google.crypto.tink.shaded.protobuf.Mixin) r2
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public int getMixinsCount() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Mixin> r0 = r1.mixins_
            int r0 = r0.size()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public java.util.List<com.google.crypto.tink.shaded.protobuf.Mixin> getMixinsList() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Mixin> r0 = r1.mixins_
            return r0
    }

    public com.google.crypto.tink.shaded.protobuf.MixinOrBuilder getMixinsOrBuilder(int r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Mixin> r0 = r1.mixins_
            java.lang.Object r2 = r0.get(r2)
            com.google.crypto.tink.shaded.protobuf.MixinOrBuilder r2 = (com.google.crypto.tink.shaded.protobuf.MixinOrBuilder) r2
            return r2
    }

    public java.util.List<? extends com.google.crypto.tink.shaded.protobuf.MixinOrBuilder> getMixinsOrBuilderList() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Mixin> r0 = r1.mixins_
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name_
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public com.google.crypto.tink.shaded.protobuf.ByteString getNameBytes() {
            r1 = this;
            java.lang.String r0 = r1.name_
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFromUtf8(r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public com.google.crypto.tink.shaded.protobuf.Option getOptions(int r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Option> r0 = r1.options_
            java.lang.Object r2 = r0.get(r2)
            com.google.crypto.tink.shaded.protobuf.Option r2 = (com.google.crypto.tink.shaded.protobuf.Option) r2
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public int getOptionsCount() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Option> r0 = r1.options_
            int r0 = r0.size()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
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

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public com.google.crypto.tink.shaded.protobuf.SourceContext getSourceContext() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.SourceContext r0 = r1.sourceContext_
            if (r0 != 0) goto L8
            com.google.crypto.tink.shaded.protobuf.SourceContext r0 = com.google.crypto.tink.shaded.protobuf.SourceContext.getDefaultInstance()
        L8:
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public com.google.crypto.tink.shaded.protobuf.Syntax getSyntax() {
            r1 = this;
            int r0 = r1.syntax_
            com.google.crypto.tink.shaded.protobuf.Syntax r0 = com.google.crypto.tink.shaded.protobuf.Syntax.forNumber(r0)
            if (r0 != 0) goto La
            com.google.crypto.tink.shaded.protobuf.Syntax r0 = com.google.crypto.tink.shaded.protobuf.Syntax.UNRECOGNIZED
        La:
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public int getSyntaxValue() {
            r1 = this;
            int r0 = r1.syntax_
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public java.lang.String getVersion() {
            r1 = this;
            java.lang.String r0 = r1.version_
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public com.google.crypto.tink.shaded.protobuf.ByteString getVersionBytes() {
            r1 = this;
            java.lang.String r0 = r1.version_
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFromUtf8(r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
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
