package com.google.crypto.tink.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class SerializationRegistry {
    private final java.util.Map<com.google.crypto.tink.internal.SerializationRegistry.ParserIndex, com.google.crypto.tink.internal.KeyParser<?>> keyParserMap;
    private final java.util.Map<com.google.crypto.tink.internal.SerializationRegistry.SerializerIndex, com.google.crypto.tink.internal.KeySerializer<?, ?>> keySerializerMap;
    private final java.util.Map<com.google.crypto.tink.internal.SerializationRegistry.ParserIndex, com.google.crypto.tink.internal.ParametersParser<?>> parametersParserMap;
    private final java.util.Map<com.google.crypto.tink.internal.SerializationRegistry.SerializerIndex, com.google.crypto.tink.internal.ParametersSerializer<?, ?>> parametersSerializerMap;

    /* JADX INFO: renamed from: com.google.crypto.tink.internal.SerializationRegistry$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private final java.util.Map<com.google.crypto.tink.internal.SerializationRegistry.ParserIndex, com.google.crypto.tink.internal.KeyParser<?>> keyParserMap;
        private final java.util.Map<com.google.crypto.tink.internal.SerializationRegistry.SerializerIndex, com.google.crypto.tink.internal.KeySerializer<?, ?>> keySerializerMap;
        private final java.util.Map<com.google.crypto.tink.internal.SerializationRegistry.ParserIndex, com.google.crypto.tink.internal.ParametersParser<?>> parametersParserMap;
        private final java.util.Map<com.google.crypto.tink.internal.SerializationRegistry.SerializerIndex, com.google.crypto.tink.internal.ParametersSerializer<?, ?>> parametersSerializerMap;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.keySerializerMap = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.keyParserMap = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.parametersSerializerMap = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.parametersParserMap = r0
                return
        }

        public Builder(com.google.crypto.tink.internal.SerializationRegistry r3) {
                r2 = this;
                r2.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                java.util.Map r1 = com.google.crypto.tink.internal.SerializationRegistry.access$000(r3)
                r0.<init>(r1)
                r2.keySerializerMap = r0
                java.util.HashMap r0 = new java.util.HashMap
                java.util.Map r1 = com.google.crypto.tink.internal.SerializationRegistry.access$100(r3)
                r0.<init>(r1)
                r2.keyParserMap = r0
                java.util.HashMap r0 = new java.util.HashMap
                java.util.Map r1 = com.google.crypto.tink.internal.SerializationRegistry.access$200(r3)
                r0.<init>(r1)
                r2.parametersSerializerMap = r0
                java.util.HashMap r0 = new java.util.HashMap
                java.util.Map r3 = com.google.crypto.tink.internal.SerializationRegistry.access$300(r3)
                r0.<init>(r3)
                r2.parametersParserMap = r0
                return
        }

        static /* synthetic */ java.util.Map access$1000(com.google.crypto.tink.internal.SerializationRegistry.Builder r0) {
                java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$ParserIndex, com.google.crypto.tink.internal.ParametersParser<?>> r0 = r0.parametersParserMap
                return r0
        }

        static /* synthetic */ java.util.Map access$700(com.google.crypto.tink.internal.SerializationRegistry.Builder r0) {
                java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex, com.google.crypto.tink.internal.KeySerializer<?, ?>> r0 = r0.keySerializerMap
                return r0
        }

        static /* synthetic */ java.util.Map access$800(com.google.crypto.tink.internal.SerializationRegistry.Builder r0) {
                java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$ParserIndex, com.google.crypto.tink.internal.KeyParser<?>> r0 = r0.keyParserMap
                return r0
        }

        static /* synthetic */ java.util.Map access$900(com.google.crypto.tink.internal.SerializationRegistry.Builder r0) {
                java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex, com.google.crypto.tink.internal.ParametersSerializer<?, ?>> r0 = r0.parametersSerializerMap
                return r0
        }

        com.google.crypto.tink.internal.SerializationRegistry build() {
                r2 = this;
                com.google.crypto.tink.internal.SerializationRegistry r0 = new com.google.crypto.tink.internal.SerializationRegistry
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public <SerializationT extends com.google.crypto.tink.internal.Serialization> com.google.crypto.tink.internal.SerializationRegistry.Builder registerKeyParser(com.google.crypto.tink.internal.KeyParser<SerializationT> r5) throws java.security.GeneralSecurityException {
                r4 = this;
                com.google.crypto.tink.internal.SerializationRegistry$ParserIndex r0 = new com.google.crypto.tink.internal.SerializationRegistry$ParserIndex
                java.lang.Class r1 = r5.getSerializationClass()
                com.google.crypto.tink.util.Bytes r2 = r5.getObjectIdentifier()
                r3 = 0
                r0.<init>(r1, r2, r3)
                java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$ParserIndex, com.google.crypto.tink.internal.KeyParser<?>> r1 = r4.keyParserMap
                boolean r1 = r1.containsKey(r0)
                if (r1 == 0) goto L40
                java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$ParserIndex, com.google.crypto.tink.internal.KeyParser<?>> r1 = r4.keyParserMap
                java.lang.Object r1 = r1.get(r0)
                com.google.crypto.tink.internal.KeyParser r1 = (com.google.crypto.tink.internal.KeyParser) r1
                boolean r2 = r1.equals(r5)
                if (r2 == 0) goto L2b
                boolean r5 = r5.equals(r1)
                if (r5 == 0) goto L2b
                goto L45
            L2b:
                java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Attempt to register non-equal parser for already existing object of type: "
                r1.<init>(r2)
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r0 = r0.toString()
                r5.<init>(r0)
                throw r5
            L40:
                java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$ParserIndex, com.google.crypto.tink.internal.KeyParser<?>> r1 = r4.keyParserMap
                r1.put(r0, r5)
            L45:
                return r4
        }

        public <KeyT extends com.google.crypto.tink.Key, SerializationT extends com.google.crypto.tink.internal.Serialization> com.google.crypto.tink.internal.SerializationRegistry.Builder registerKeySerializer(com.google.crypto.tink.internal.KeySerializer<KeyT, SerializationT> r5) throws java.security.GeneralSecurityException {
                r4 = this;
                com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex r0 = new com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex
                java.lang.Class r1 = r5.getKeyClass()
                java.lang.Class r2 = r5.getSerializationClass()
                r3 = 0
                r0.<init>(r1, r2, r3)
                java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex, com.google.crypto.tink.internal.KeySerializer<?, ?>> r1 = r4.keySerializerMap
                boolean r1 = r1.containsKey(r0)
                if (r1 == 0) goto L40
                java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex, com.google.crypto.tink.internal.KeySerializer<?, ?>> r1 = r4.keySerializerMap
                java.lang.Object r1 = r1.get(r0)
                com.google.crypto.tink.internal.KeySerializer r1 = (com.google.crypto.tink.internal.KeySerializer) r1
                boolean r2 = r1.equals(r5)
                if (r2 == 0) goto L2b
                boolean r5 = r5.equals(r1)
                if (r5 == 0) goto L2b
                goto L45
            L2b:
                java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Attempt to register non-equal serializer for already existing object of type: "
                r1.<init>(r2)
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r0 = r0.toString()
                r5.<init>(r0)
                throw r5
            L40:
                java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex, com.google.crypto.tink.internal.KeySerializer<?, ?>> r1 = r4.keySerializerMap
                r1.put(r0, r5)
            L45:
                return r4
        }

        public <SerializationT extends com.google.crypto.tink.internal.Serialization> com.google.crypto.tink.internal.SerializationRegistry.Builder registerParametersParser(com.google.crypto.tink.internal.ParametersParser<SerializationT> r5) throws java.security.GeneralSecurityException {
                r4 = this;
                com.google.crypto.tink.internal.SerializationRegistry$ParserIndex r0 = new com.google.crypto.tink.internal.SerializationRegistry$ParserIndex
                java.lang.Class r1 = r5.getSerializationClass()
                com.google.crypto.tink.util.Bytes r2 = r5.getObjectIdentifier()
                r3 = 0
                r0.<init>(r1, r2, r3)
                java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$ParserIndex, com.google.crypto.tink.internal.ParametersParser<?>> r1 = r4.parametersParserMap
                boolean r1 = r1.containsKey(r0)
                if (r1 == 0) goto L40
                java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$ParserIndex, com.google.crypto.tink.internal.ParametersParser<?>> r1 = r4.parametersParserMap
                java.lang.Object r1 = r1.get(r0)
                com.google.crypto.tink.internal.ParametersParser r1 = (com.google.crypto.tink.internal.ParametersParser) r1
                boolean r2 = r1.equals(r5)
                if (r2 == 0) goto L2b
                boolean r5 = r5.equals(r1)
                if (r5 == 0) goto L2b
                goto L45
            L2b:
                java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Attempt to register non-equal parser for already existing object of type: "
                r1.<init>(r2)
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r0 = r0.toString()
                r5.<init>(r0)
                throw r5
            L40:
                java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$ParserIndex, com.google.crypto.tink.internal.ParametersParser<?>> r1 = r4.parametersParserMap
                r1.put(r0, r5)
            L45:
                return r4
        }

        public <ParametersT extends com.google.crypto.tink.Parameters, SerializationT extends com.google.crypto.tink.internal.Serialization> com.google.crypto.tink.internal.SerializationRegistry.Builder registerParametersSerializer(com.google.crypto.tink.internal.ParametersSerializer<ParametersT, SerializationT> r5) throws java.security.GeneralSecurityException {
                r4 = this;
                com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex r0 = new com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex
                java.lang.Class r1 = r5.getParametersClass()
                java.lang.Class r2 = r5.getSerializationClass()
                r3 = 0
                r0.<init>(r1, r2, r3)
                java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex, com.google.crypto.tink.internal.ParametersSerializer<?, ?>> r1 = r4.parametersSerializerMap
                boolean r1 = r1.containsKey(r0)
                if (r1 == 0) goto L40
                java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex, com.google.crypto.tink.internal.ParametersSerializer<?, ?>> r1 = r4.parametersSerializerMap
                java.lang.Object r1 = r1.get(r0)
                com.google.crypto.tink.internal.ParametersSerializer r1 = (com.google.crypto.tink.internal.ParametersSerializer) r1
                boolean r2 = r1.equals(r5)
                if (r2 == 0) goto L2b
                boolean r5 = r5.equals(r1)
                if (r5 == 0) goto L2b
                goto L45
            L2b:
                java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Attempt to register non-equal serializer for already existing object of type: "
                r1.<init>(r2)
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r0 = r0.toString()
                r5.<init>(r0)
                throw r5
            L40:
                java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex, com.google.crypto.tink.internal.ParametersSerializer<?, ?>> r1 = r4.parametersSerializerMap
                r1.put(r0, r5)
            L45:
                return r4
        }
    }

    private static class ParserIndex {
        private final java.lang.Class<? extends com.google.crypto.tink.internal.Serialization> keySerializationClass;
        private final com.google.crypto.tink.util.Bytes serializationIdentifier;

        private ParserIndex(java.lang.Class<? extends com.google.crypto.tink.internal.Serialization> r1, com.google.crypto.tink.util.Bytes r2) {
                r0 = this;
                r0.<init>()
                r0.keySerializationClass = r1
                r0.serializationIdentifier = r2
                return
        }

        /* synthetic */ ParserIndex(java.lang.Class r1, com.google.crypto.tink.util.Bytes r2, com.google.crypto.tink.internal.SerializationRegistry.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.google.crypto.tink.internal.SerializationRegistry.ParserIndex
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                com.google.crypto.tink.internal.SerializationRegistry$ParserIndex r4 = (com.google.crypto.tink.internal.SerializationRegistry.ParserIndex) r4
                java.lang.Class<? extends com.google.crypto.tink.internal.Serialization> r0 = r4.keySerializationClass
                java.lang.Class<? extends com.google.crypto.tink.internal.Serialization> r2 = r3.keySerializationClass
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L1d
                com.google.crypto.tink.util.Bytes r4 = r4.serializationIdentifier
                com.google.crypto.tink.util.Bytes r0 = r3.serializationIdentifier
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L1d
                r1 = 1
            L1d:
                return r1
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class<? extends com.google.crypto.tink.internal.Serialization> r0 = r2.keySerializationClass
                com.google.crypto.tink.util.Bytes r1 = r2.serializationIdentifier
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
                int r0 = java.util.Objects.hash(r0)
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.Class<? extends com.google.crypto.tink.internal.Serialization> r1 = r2.keySerializationClass
                java.lang.String r1 = r1.getSimpleName()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", object identifier: "
                java.lang.StringBuilder r0 = r0.append(r1)
                com.google.crypto.tink.util.Bytes r1 = r2.serializationIdentifier
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    private static class SerializerIndex {
        private final java.lang.Class<?> keyClass;
        private final java.lang.Class<? extends com.google.crypto.tink.internal.Serialization> keySerializationClass;

        private SerializerIndex(java.lang.Class<?> r1, java.lang.Class<? extends com.google.crypto.tink.internal.Serialization> r2) {
                r0 = this;
                r0.<init>()
                r0.keyClass = r1
                r0.keySerializationClass = r2
                return
        }

        /* synthetic */ SerializerIndex(java.lang.Class r1, java.lang.Class r2, com.google.crypto.tink.internal.SerializationRegistry.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.google.crypto.tink.internal.SerializationRegistry.SerializerIndex
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex r4 = (com.google.crypto.tink.internal.SerializationRegistry.SerializerIndex) r4
                java.lang.Class<?> r0 = r4.keyClass
                java.lang.Class<?> r2 = r3.keyClass
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L1d
                java.lang.Class<? extends com.google.crypto.tink.internal.Serialization> r4 = r4.keySerializationClass
                java.lang.Class<? extends com.google.crypto.tink.internal.Serialization> r0 = r3.keySerializationClass
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L1d
                r1 = 1
            L1d:
                return r1
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class<?> r0 = r2.keyClass
                java.lang.Class<? extends com.google.crypto.tink.internal.Serialization> r1 = r2.keySerializationClass
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
                int r0 = java.util.Objects.hash(r0)
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.Class<?> r1 = r2.keyClass
                java.lang.String r1 = r1.getSimpleName()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " with serialization type: "
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.Class<? extends com.google.crypto.tink.internal.Serialization> r1 = r2.keySerializationClass
                java.lang.String r1 = r1.getSimpleName()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    private SerializationRegistry(com.google.crypto.tink.internal.SerializationRegistry.Builder r3) {
            r2 = this;
            r2.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            java.util.Map r1 = com.google.crypto.tink.internal.SerializationRegistry.Builder.access$700(r3)
            r0.<init>(r1)
            r2.keySerializerMap = r0
            java.util.HashMap r0 = new java.util.HashMap
            java.util.Map r1 = com.google.crypto.tink.internal.SerializationRegistry.Builder.access$800(r3)
            r0.<init>(r1)
            r2.keyParserMap = r0
            java.util.HashMap r0 = new java.util.HashMap
            java.util.Map r1 = com.google.crypto.tink.internal.SerializationRegistry.Builder.access$900(r3)
            r0.<init>(r1)
            r2.parametersSerializerMap = r0
            java.util.HashMap r0 = new java.util.HashMap
            java.util.Map r3 = com.google.crypto.tink.internal.SerializationRegistry.Builder.access$1000(r3)
            r0.<init>(r3)
            r2.parametersParserMap = r0
            return
    }

    /* synthetic */ SerializationRegistry(com.google.crypto.tink.internal.SerializationRegistry.Builder r1, com.google.crypto.tink.internal.SerializationRegistry.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static /* synthetic */ java.util.Map access$000(com.google.crypto.tink.internal.SerializationRegistry r0) {
            java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex, com.google.crypto.tink.internal.KeySerializer<?, ?>> r0 = r0.keySerializerMap
            return r0
    }

    static /* synthetic */ java.util.Map access$100(com.google.crypto.tink.internal.SerializationRegistry r0) {
            java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$ParserIndex, com.google.crypto.tink.internal.KeyParser<?>> r0 = r0.keyParserMap
            return r0
    }

    static /* synthetic */ java.util.Map access$200(com.google.crypto.tink.internal.SerializationRegistry r0) {
            java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex, com.google.crypto.tink.internal.ParametersSerializer<?, ?>> r0 = r0.parametersSerializerMap
            return r0
    }

    static /* synthetic */ java.util.Map access$300(com.google.crypto.tink.internal.SerializationRegistry r0) {
            java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$ParserIndex, com.google.crypto.tink.internal.ParametersParser<?>> r0 = r0.parametersParserMap
            return r0
    }

    public <SerializationT extends com.google.crypto.tink.internal.Serialization> boolean hasParserForKey(SerializationT r4) {
            r3 = this;
            com.google.crypto.tink.internal.SerializationRegistry$ParserIndex r0 = new com.google.crypto.tink.internal.SerializationRegistry$ParserIndex
            java.lang.Class r1 = r4.getClass()
            com.google.crypto.tink.util.Bytes r4 = r4.getObjectIdentifier()
            r2 = 0
            r0.<init>(r1, r4, r2)
            java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$ParserIndex, com.google.crypto.tink.internal.KeyParser<?>> r4 = r3.keyParserMap
            boolean r4 = r4.containsKey(r0)
            return r4
    }

    public <SerializationT extends com.google.crypto.tink.internal.Serialization> boolean hasParserForParameters(SerializationT r4) {
            r3 = this;
            com.google.crypto.tink.internal.SerializationRegistry$ParserIndex r0 = new com.google.crypto.tink.internal.SerializationRegistry$ParserIndex
            java.lang.Class r1 = r4.getClass()
            com.google.crypto.tink.util.Bytes r4 = r4.getObjectIdentifier()
            r2 = 0
            r0.<init>(r1, r4, r2)
            java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$ParserIndex, com.google.crypto.tink.internal.ParametersParser<?>> r4 = r3.parametersParserMap
            boolean r4 = r4.containsKey(r0)
            return r4
    }

    public <KeyT extends com.google.crypto.tink.Key, SerializationT extends com.google.crypto.tink.internal.Serialization> boolean hasSerializerForKey(KeyT r3, java.lang.Class<SerializationT> r4) {
            r2 = this;
            com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex r0 = new com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex
            java.lang.Class r3 = r3.getClass()
            r1 = 0
            r0.<init>(r3, r4, r1)
            java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex, com.google.crypto.tink.internal.KeySerializer<?, ?>> r3 = r2.keySerializerMap
            boolean r3 = r3.containsKey(r0)
            return r3
    }

    public <ParametersT extends com.google.crypto.tink.Parameters, SerializationT extends com.google.crypto.tink.internal.Serialization> boolean hasSerializerForParameters(ParametersT r3, java.lang.Class<SerializationT> r4) {
            r2 = this;
            com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex r0 = new com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex
            java.lang.Class r3 = r3.getClass()
            r1 = 0
            r0.<init>(r3, r4, r1)
            java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex, com.google.crypto.tink.internal.ParametersSerializer<?, ?>> r3 = r2.parametersSerializerMap
            boolean r3 = r3.containsKey(r0)
            return r3
    }

    public <SerializationT extends com.google.crypto.tink.internal.Serialization> com.google.crypto.tink.Key parseKey(SerializationT r5, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r6) throws java.security.GeneralSecurityException {
            r4 = this;
            com.google.crypto.tink.internal.SerializationRegistry$ParserIndex r0 = new com.google.crypto.tink.internal.SerializationRegistry$ParserIndex
            java.lang.Class r1 = r5.getClass()
            com.google.crypto.tink.util.Bytes r2 = r5.getObjectIdentifier()
            r3 = 0
            r0.<init>(r1, r2, r3)
            java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$ParserIndex, com.google.crypto.tink.internal.KeyParser<?>> r1 = r4.keyParserMap
            boolean r1 = r1.containsKey(r0)
            if (r1 == 0) goto L23
            java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$ParserIndex, com.google.crypto.tink.internal.KeyParser<?>> r1 = r4.keyParserMap
            java.lang.Object r0 = r1.get(r0)
            com.google.crypto.tink.internal.KeyParser r0 = (com.google.crypto.tink.internal.KeyParser) r0
            com.google.crypto.tink.Key r5 = r0.parseKey(r5, r6)
            return r5
        L23:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "No Key Parser for requested key type "
            r6.<init>(r1)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r0 = " available"
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    public <SerializationT extends com.google.crypto.tink.internal.Serialization> com.google.crypto.tink.Parameters parseParameters(SerializationT r5) throws java.security.GeneralSecurityException {
            r4 = this;
            com.google.crypto.tink.internal.SerializationRegistry$ParserIndex r0 = new com.google.crypto.tink.internal.SerializationRegistry$ParserIndex
            java.lang.Class r1 = r5.getClass()
            com.google.crypto.tink.util.Bytes r2 = r5.getObjectIdentifier()
            r3 = 0
            r0.<init>(r1, r2, r3)
            java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$ParserIndex, com.google.crypto.tink.internal.ParametersParser<?>> r1 = r4.parametersParserMap
            boolean r1 = r1.containsKey(r0)
            if (r1 == 0) goto L23
            java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$ParserIndex, com.google.crypto.tink.internal.ParametersParser<?>> r1 = r4.parametersParserMap
            java.lang.Object r0 = r1.get(r0)
            com.google.crypto.tink.internal.ParametersParser r0 = (com.google.crypto.tink.internal.ParametersParser) r0
            com.google.crypto.tink.Parameters r5 = r0.parseParameters(r5)
            return r5
        L23:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No Parameters Parser for requested key type "
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = " available"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    public <KeyT extends com.google.crypto.tink.Key, SerializationT extends com.google.crypto.tink.internal.Serialization> SerializationT serializeKey(KeyT r4, java.lang.Class<SerializationT> r5, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r6) throws java.security.GeneralSecurityException {
            r3 = this;
            com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex r0 = new com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex
            java.lang.Class r1 = r4.getClass()
            r2 = 0
            r0.<init>(r1, r5, r2)
            java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex, com.google.crypto.tink.internal.KeySerializer<?, ?>> r5 = r3.keySerializerMap
            boolean r5 = r5.containsKey(r0)
            if (r5 == 0) goto L1f
            java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex, com.google.crypto.tink.internal.KeySerializer<?, ?>> r5 = r3.keySerializerMap
            java.lang.Object r5 = r5.get(r0)
            com.google.crypto.tink.internal.KeySerializer r5 = (com.google.crypto.tink.internal.KeySerializer) r5
            com.google.crypto.tink.internal.Serialization r4 = r5.serializeKey(r4, r6)
            return r4
        L1f:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "No Key serializer for "
            r5.<init>(r6)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r6 = " available"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    public <ParametersT extends com.google.crypto.tink.Parameters, SerializationT extends com.google.crypto.tink.internal.Serialization> SerializationT serializeParameters(ParametersT r4, java.lang.Class<SerializationT> r5) throws java.security.GeneralSecurityException {
            r3 = this;
            com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex r0 = new com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex
            java.lang.Class r1 = r4.getClass()
            r2 = 0
            r0.<init>(r1, r5, r2)
            java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex, com.google.crypto.tink.internal.ParametersSerializer<?, ?>> r5 = r3.parametersSerializerMap
            boolean r5 = r5.containsKey(r0)
            if (r5 == 0) goto L1f
            java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex, com.google.crypto.tink.internal.ParametersSerializer<?, ?>> r5 = r3.parametersSerializerMap
            java.lang.Object r5 = r5.get(r0)
            com.google.crypto.tink.internal.ParametersSerializer r5 = (com.google.crypto.tink.internal.ParametersSerializer) r5
            com.google.crypto.tink.internal.Serialization r4 = r5.serializeParameters(r4)
            return r4
        L1f:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "No Key Format serializer for "
            r5.<init>(r1)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r0 = " available"
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }
}
