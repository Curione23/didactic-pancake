package com.google.crypto.tink;

/* JADX INFO: loaded from: classes2.dex */
public final class KeysetHandle {
    private final com.google.crypto.tink.monitoring.MonitoringAnnotations annotations;
    private final java.util.List<com.google.crypto.tink.KeysetHandle.Entry> entries;
    private final com.google.crypto.tink.proto.Keyset keyset;

    /* JADX INFO: renamed from: com.google.crypto.tink.KeysetHandle$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$KeyStatusType = null;

        static {
                com.google.crypto.tink.proto.KeyStatusType[] r0 = com.google.crypto.tink.proto.KeyStatusType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.KeysetHandle.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$KeyStatusType = r0
                com.google.crypto.tink.proto.KeyStatusType r1 = com.google.crypto.tink.proto.KeyStatusType.ENABLED     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.crypto.tink.KeysetHandle.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$KeyStatusType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.proto.KeyStatusType r1 = com.google.crypto.tink.proto.KeyStatusType.DISABLED     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.crypto.tink.KeysetHandle.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$KeyStatusType     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.proto.KeyStatusType r1 = com.google.crypto.tink.proto.KeyStatusType.DESTROYED     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    public static final class Builder {
        private final java.util.List<com.google.crypto.tink.KeysetHandle.Builder.Entry> entries;

        public static final class Entry {

            @javax.annotation.Nullable
            private com.google.crypto.tink.KeysetHandle.Builder builder;
            private boolean isPrimary;

            @javax.annotation.Nullable
            private final com.google.crypto.tink.Key key;
            private com.google.crypto.tink.KeyStatus keyStatus;

            @javax.annotation.Nullable
            private final com.google.crypto.tink.Parameters parameters;
            private com.google.crypto.tink.KeysetHandle.Builder.KeyIdStrategy strategy;

            private Entry(com.google.crypto.tink.Key r2) {
                    r1 = this;
                    r1.<init>()
                    com.google.crypto.tink.KeyStatus r0 = com.google.crypto.tink.KeyStatus.ENABLED
                    r1.keyStatus = r0
                    r0 = 0
                    r1.strategy = r0
                    r1.builder = r0
                    r1.key = r2
                    r1.parameters = r0
                    return
            }

            /* synthetic */ Entry(com.google.crypto.tink.Key r1, com.google.crypto.tink.KeysetHandle.AnonymousClass1 r2) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            private Entry(com.google.crypto.tink.Parameters r2) {
                    r1 = this;
                    r1.<init>()
                    com.google.crypto.tink.KeyStatus r0 = com.google.crypto.tink.KeyStatus.ENABLED
                    r1.keyStatus = r0
                    r0 = 0
                    r1.strategy = r0
                    r1.builder = r0
                    r1.key = r0
                    r1.parameters = r2
                    return
            }

            /* synthetic */ Entry(com.google.crypto.tink.Parameters r1, com.google.crypto.tink.KeysetHandle.AnonymousClass1 r2) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            static /* synthetic */ com.google.crypto.tink.KeyStatus access$1200(com.google.crypto.tink.KeysetHandle.Builder.Entry r0) {
                    com.google.crypto.tink.KeyStatus r0 = r0.keyStatus
                    return r0
            }

            static /* synthetic */ boolean access$300(com.google.crypto.tink.KeysetHandle.Builder.Entry r0) {
                    boolean r0 = r0.isPrimary
                    return r0
            }

            static /* synthetic */ boolean access$302(com.google.crypto.tink.KeysetHandle.Builder.Entry r0, boolean r1) {
                    r0.isPrimary = r1
                    return r1
            }

            static /* synthetic */ com.google.crypto.tink.KeysetHandle.Builder access$400(com.google.crypto.tink.KeysetHandle.Builder.Entry r0) {
                    com.google.crypto.tink.KeysetHandle$Builder r0 = r0.builder
                    return r0
            }

            static /* synthetic */ com.google.crypto.tink.KeysetHandle.Builder access$402(com.google.crypto.tink.KeysetHandle.Builder.Entry r0, com.google.crypto.tink.KeysetHandle.Builder r1) {
                    r0.builder = r1
                    return r1
            }

            static /* synthetic */ com.google.crypto.tink.KeysetHandle.Builder.KeyIdStrategy access$500(com.google.crypto.tink.KeysetHandle.Builder.Entry r0) {
                    com.google.crypto.tink.KeysetHandle$Builder$KeyIdStrategy r0 = r0.strategy
                    return r0
            }

            static /* synthetic */ com.google.crypto.tink.Key access$800(com.google.crypto.tink.KeysetHandle.Builder.Entry r0) {
                    com.google.crypto.tink.Key r0 = r0.key
                    return r0
            }

            static /* synthetic */ com.google.crypto.tink.Parameters access$900(com.google.crypto.tink.KeysetHandle.Builder.Entry r0) {
                    com.google.crypto.tink.Parameters r0 = r0.parameters
                    return r0
            }

            public com.google.crypto.tink.KeyStatus getStatus() {
                    r1 = this;
                    com.google.crypto.tink.KeyStatus r0 = r1.keyStatus
                    return r0
            }

            public boolean isPrimary() {
                    r1 = this;
                    boolean r0 = r1.isPrimary
                    return r0
            }

            public com.google.crypto.tink.KeysetHandle.Builder.Entry makePrimary() {
                    r1 = this;
                    com.google.crypto.tink.KeysetHandle$Builder r0 = r1.builder
                    if (r0 == 0) goto L7
                    com.google.crypto.tink.KeysetHandle.Builder.access$000(r0)
                L7:
                    r0 = 1
                    r1.isPrimary = r0
                    return r1
            }

            public com.google.crypto.tink.KeysetHandle.Builder.Entry setStatus(com.google.crypto.tink.KeyStatus r1) {
                    r0 = this;
                    r0.keyStatus = r1
                    return r0
            }

            public com.google.crypto.tink.KeysetHandle.Builder.Entry withFixedId(int r1) {
                    r0 = this;
                    com.google.crypto.tink.KeysetHandle$Builder$KeyIdStrategy r1 = com.google.crypto.tink.KeysetHandle.Builder.KeyIdStrategy.access$100(r1)
                    r0.strategy = r1
                    return r0
            }

            public com.google.crypto.tink.KeysetHandle.Builder.Entry withRandomId() {
                    r1 = this;
                    com.google.crypto.tink.KeysetHandle$Builder$KeyIdStrategy r0 = com.google.crypto.tink.KeysetHandle.Builder.KeyIdStrategy.access$200()
                    r1.strategy = r0
                    return r1
            }
        }

        private static class KeyIdStrategy {
            private static final com.google.crypto.tink.KeysetHandle.Builder.KeyIdStrategy RANDOM_ID = null;
            private final int fixedId;

            static {
                    com.google.crypto.tink.KeysetHandle$Builder$KeyIdStrategy r0 = new com.google.crypto.tink.KeysetHandle$Builder$KeyIdStrategy
                    r0.<init>()
                    com.google.crypto.tink.KeysetHandle.Builder.KeyIdStrategy.RANDOM_ID = r0
                    return
            }

            private KeyIdStrategy() {
                    r1 = this;
                    r1.<init>()
                    r0 = 0
                    r1.fixedId = r0
                    return
            }

            private KeyIdStrategy(int r1) {
                    r0 = this;
                    r0.<init>()
                    r0.fixedId = r1
                    return
            }

            static /* synthetic */ com.google.crypto.tink.KeysetHandle.Builder.KeyIdStrategy access$100(int r0) {
                    com.google.crypto.tink.KeysetHandle$Builder$KeyIdStrategy r0 = fixedId(r0)
                    return r0
            }

            static /* synthetic */ com.google.crypto.tink.KeysetHandle.Builder.KeyIdStrategy access$200() {
                    com.google.crypto.tink.KeysetHandle$Builder$KeyIdStrategy r0 = randomId()
                    return r0
            }

            static /* synthetic */ com.google.crypto.tink.KeysetHandle.Builder.KeyIdStrategy access$600() {
                    com.google.crypto.tink.KeysetHandle$Builder$KeyIdStrategy r0 = com.google.crypto.tink.KeysetHandle.Builder.KeyIdStrategy.RANDOM_ID
                    return r0
            }

            static /* synthetic */ int access$700(com.google.crypto.tink.KeysetHandle.Builder.KeyIdStrategy r0) {
                    int r0 = r0.getFixedId()
                    return r0
            }

            private static com.google.crypto.tink.KeysetHandle.Builder.KeyIdStrategy fixedId(int r1) {
                    com.google.crypto.tink.KeysetHandle$Builder$KeyIdStrategy r0 = new com.google.crypto.tink.KeysetHandle$Builder$KeyIdStrategy
                    r0.<init>(r1)
                    return r0
            }

            private int getFixedId() {
                    r1 = this;
                    int r0 = r1.fixedId
                    return r0
            }

            private static com.google.crypto.tink.KeysetHandle.Builder.KeyIdStrategy randomId() {
                    com.google.crypto.tink.KeysetHandle$Builder$KeyIdStrategy r0 = com.google.crypto.tink.KeysetHandle.Builder.KeyIdStrategy.RANDOM_ID
                    return r0
            }
        }

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.entries = r0
                return
        }

        static /* synthetic */ void access$000(com.google.crypto.tink.KeysetHandle.Builder r0) {
                r0.clearPrimary()
                return
        }

        private static void checkIdAssignments(java.util.List<com.google.crypto.tink.KeysetHandle.Builder.Entry> r3) throws java.security.GeneralSecurityException {
                r0 = 0
            L1:
                int r1 = r3.size()
                int r1 = r1 + (-1)
                if (r0 >= r1) goto L37
                java.lang.Object r1 = r3.get(r0)
                com.google.crypto.tink.KeysetHandle$Builder$Entry r1 = (com.google.crypto.tink.KeysetHandle.Builder.Entry) r1
                com.google.crypto.tink.KeysetHandle$Builder$KeyIdStrategy r1 = com.google.crypto.tink.KeysetHandle.Builder.Entry.access$500(r1)
                com.google.crypto.tink.KeysetHandle$Builder$KeyIdStrategy r2 = com.google.crypto.tink.KeysetHandle.Builder.KeyIdStrategy.access$600()
                if (r1 != r2) goto L34
                int r1 = r0 + 1
                java.lang.Object r1 = r3.get(r1)
                com.google.crypto.tink.KeysetHandle$Builder$Entry r1 = (com.google.crypto.tink.KeysetHandle.Builder.Entry) r1
                com.google.crypto.tink.KeysetHandle$Builder$KeyIdStrategy r1 = com.google.crypto.tink.KeysetHandle.Builder.Entry.access$500(r1)
                com.google.crypto.tink.KeysetHandle$Builder$KeyIdStrategy r2 = com.google.crypto.tink.KeysetHandle.Builder.KeyIdStrategy.access$600()
                if (r1 != r2) goto L2c
                goto L34
            L2c:
                java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
                java.lang.String r0 = "Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'."
                r3.<init>(r0)
                throw r3
            L34:
                int r0 = r0 + 1
                goto L1
            L37:
                return
        }

        private void clearPrimary() {
                r3 = this;
                java.util.List<com.google.crypto.tink.KeysetHandle$Builder$Entry> r0 = r3.entries
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L17
                java.lang.Object r1 = r0.next()
                com.google.crypto.tink.KeysetHandle$Builder$Entry r1 = (com.google.crypto.tink.KeysetHandle.Builder.Entry) r1
                r2 = 0
                com.google.crypto.tink.KeysetHandle.Builder.Entry.access$302(r1, r2)
                goto L6
            L17:
                return
        }

        private static com.google.crypto.tink.proto.Keyset.Key createKeyFromParameters(com.google.crypto.tink.Parameters r2, int r3, com.google.crypto.tink.proto.KeyStatusType r4) throws java.security.GeneralSecurityException {
                boolean r0 = r2 instanceof com.google.crypto.tink.internal.LegacyProtoParameters
                if (r0 == 0) goto Lb
                com.google.crypto.tink.internal.LegacyProtoParameters r2 = (com.google.crypto.tink.internal.LegacyProtoParameters) r2
                com.google.crypto.tink.internal.ProtoParametersSerialization r2 = r2.getSerialization()
                goto L17
            Lb:
                com.google.crypto.tink.internal.MutableSerializationRegistry r0 = com.google.crypto.tink.internal.MutableSerializationRegistry.globalInstance()
                java.lang.Class<com.google.crypto.tink.internal.ProtoParametersSerialization> r1 = com.google.crypto.tink.internal.ProtoParametersSerialization.class
                com.google.crypto.tink.internal.Serialization r2 = r0.serializeParameters(r2, r1)
                com.google.crypto.tink.internal.ProtoParametersSerialization r2 = (com.google.crypto.tink.internal.ProtoParametersSerialization) r2
            L17:
                com.google.crypto.tink.proto.KeyTemplate r0 = r2.getKeyTemplate()
                com.google.crypto.tink.proto.KeyData r0 = com.google.crypto.tink.Registry.newKeyData(r0)
                com.google.crypto.tink.proto.Keyset$Key$Builder r1 = com.google.crypto.tink.proto.Keyset.Key.newBuilder()
                com.google.crypto.tink.proto.Keyset$Key$Builder r3 = r1.setKeyId(r3)
                com.google.crypto.tink.proto.Keyset$Key$Builder r3 = r3.setStatus(r4)
                com.google.crypto.tink.proto.Keyset$Key$Builder r3 = r3.setKeyData(r0)
                com.google.crypto.tink.proto.KeyTemplate r2 = r2.getKeyTemplate()
                com.google.crypto.tink.proto.OutputPrefixType r2 = r2.getOutputPrefixType()
                com.google.crypto.tink.proto.Keyset$Key$Builder r2 = r3.setOutputPrefixType(r2)
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
                com.google.crypto.tink.proto.Keyset$Key r2 = (com.google.crypto.tink.proto.Keyset.Key) r2
                return r2
        }

        private static com.google.crypto.tink.proto.Keyset.Key createKeysetKeyFromBuilderEntry(com.google.crypto.tink.KeysetHandle.Builder.Entry r4, int r5) throws java.security.GeneralSecurityException {
                com.google.crypto.tink.Key r0 = com.google.crypto.tink.KeysetHandle.Builder.Entry.access$800(r4)
                if (r0 != 0) goto L17
                com.google.crypto.tink.Parameters r0 = com.google.crypto.tink.KeysetHandle.Builder.Entry.access$900(r4)
                com.google.crypto.tink.KeyStatus r4 = r4.getStatus()
                com.google.crypto.tink.proto.KeyStatusType r4 = com.google.crypto.tink.KeysetHandle.access$1000(r4)
                com.google.crypto.tink.proto.Keyset$Key r4 = createKeyFromParameters(r0, r5, r4)
                return r4
            L17:
                com.google.crypto.tink.Key r0 = com.google.crypto.tink.KeysetHandle.Builder.Entry.access$800(r4)
                boolean r0 = r0 instanceof com.google.crypto.tink.internal.LegacyProtoKey
                if (r0 == 0) goto L2e
                com.google.crypto.tink.Key r0 = com.google.crypto.tink.KeysetHandle.Builder.Entry.access$800(r4)
                com.google.crypto.tink.internal.LegacyProtoKey r0 = (com.google.crypto.tink.internal.LegacyProtoKey) r0
                com.google.crypto.tink.SecretKeyAccess r1 = com.google.crypto.tink.InsecureSecretKeyAccess.get()
                com.google.crypto.tink.internal.ProtoKeySerialization r0 = r0.getSerialization(r1)
                goto L42
            L2e:
                com.google.crypto.tink.internal.MutableSerializationRegistry r0 = com.google.crypto.tink.internal.MutableSerializationRegistry.globalInstance()
                com.google.crypto.tink.Key r1 = com.google.crypto.tink.KeysetHandle.Builder.Entry.access$800(r4)
                java.lang.Class<com.google.crypto.tink.internal.ProtoKeySerialization> r2 = com.google.crypto.tink.internal.ProtoKeySerialization.class
                com.google.crypto.tink.SecretKeyAccess r3 = com.google.crypto.tink.InsecureSecretKeyAccess.get()
                com.google.crypto.tink.internal.Serialization r0 = r0.serializeKey(r1, r2, r3)
                com.google.crypto.tink.internal.ProtoKeySerialization r0 = (com.google.crypto.tink.internal.ProtoKeySerialization) r0
            L42:
                java.lang.Integer r1 = r0.getIdRequirementOrNull()
                if (r1 == 0) goto L57
                int r1 = r1.intValue()
                if (r1 != r5) goto L4f
                goto L57
            L4f:
                java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
                java.lang.String r5 = "Wrong ID set for key with ID requirement"
                r4.<init>(r5)
                throw r4
            L57:
                com.google.crypto.tink.KeyStatus r4 = r4.getStatus()
                com.google.crypto.tink.proto.KeyStatusType r4 = com.google.crypto.tink.KeysetHandle.access$1000(r4)
                com.google.crypto.tink.proto.Keyset$Key r4 = com.google.crypto.tink.KeysetHandle.access$1100(r5, r4, r0)
                return r4
        }

        private static int getNextIdFromBuilderEntry(com.google.crypto.tink.KeysetHandle.Builder.Entry r2, java.util.Set<java.lang.Integer> r3) throws java.security.GeneralSecurityException {
                com.google.crypto.tink.KeysetHandle$Builder$KeyIdStrategy r0 = com.google.crypto.tink.KeysetHandle.Builder.Entry.access$500(r2)
                if (r0 == 0) goto L1e
                com.google.crypto.tink.KeysetHandle$Builder$KeyIdStrategy r0 = com.google.crypto.tink.KeysetHandle.Builder.Entry.access$500(r2)
                com.google.crypto.tink.KeysetHandle$Builder$KeyIdStrategy r1 = com.google.crypto.tink.KeysetHandle.Builder.KeyIdStrategy.access$600()
                if (r0 != r1) goto L15
                int r2 = randomIdNotInSet(r3)
                goto L1d
            L15:
                com.google.crypto.tink.KeysetHandle$Builder$KeyIdStrategy r2 = com.google.crypto.tink.KeysetHandle.Builder.Entry.access$500(r2)
                int r2 = com.google.crypto.tink.KeysetHandle.Builder.KeyIdStrategy.access$700(r2)
            L1d:
                return r2
            L1e:
                java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
                java.lang.String r3 = "No ID was set (with withFixedId or withRandomId)"
                r2.<init>(r3)
                throw r2
        }

        private static int randomIdNotInSet(java.util.Set<java.lang.Integer> r2) {
                r0 = 0
            L1:
                if (r0 == 0) goto Lf
                java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                boolean r1 = r2.contains(r1)
                if (r1 == 0) goto Le
                goto Lf
            Le:
                return r0
            Lf:
                int r0 = com.google.crypto.tink.internal.Util.randKeyId()
                goto L1
        }

        public com.google.crypto.tink.KeysetHandle.Builder addEntry(com.google.crypto.tink.KeysetHandle.Builder.Entry r2) {
                r1 = this;
                com.google.crypto.tink.KeysetHandle$Builder r0 = com.google.crypto.tink.KeysetHandle.Builder.Entry.access$400(r2)
                if (r0 != 0) goto L18
                boolean r0 = com.google.crypto.tink.KeysetHandle.Builder.Entry.access$300(r2)
                if (r0 == 0) goto Lf
                r1.clearPrimary()
            Lf:
                com.google.crypto.tink.KeysetHandle.Builder.Entry.access$402(r2, r1)
                java.util.List<com.google.crypto.tink.KeysetHandle$Builder$Entry> r0 = r1.entries
                r0.add(r2)
                return r1
            L18:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "Entry has already been added to a KeysetHandle.Builder"
                r2.<init>(r0)
                throw r2
        }

        public com.google.crypto.tink.KeysetHandle build() throws java.security.GeneralSecurityException {
                r7 = this;
                com.google.crypto.tink.proto.Keyset$Builder r0 = com.google.crypto.tink.proto.Keyset.newBuilder()
                java.util.List<com.google.crypto.tink.KeysetHandle$Builder$Entry> r1 = r7.entries
                checkIdAssignments(r1)
                java.util.HashSet r1 = new java.util.HashSet
                r1.<init>()
                java.util.List<com.google.crypto.tink.KeysetHandle$Builder$Entry> r2 = r7.entries
                java.util.Iterator r2 = r2.iterator()
                r3 = 0
            L15:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L7b
                java.lang.Object r4 = r2.next()
                com.google.crypto.tink.KeysetHandle$Builder$Entry r4 = (com.google.crypto.tink.KeysetHandle.Builder.Entry) r4
                com.google.crypto.tink.KeyStatus r5 = com.google.crypto.tink.KeysetHandle.Builder.Entry.access$1200(r4)
                if (r5 == 0) goto L73
                int r5 = getNextIdFromBuilderEntry(r4, r1)
                java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
                boolean r6 = r1.contains(r6)
                if (r6 != 0) goto L58
                java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
                r1.add(r6)
                com.google.crypto.tink.proto.Keyset$Key r6 = createKeysetKeyFromBuilderEntry(r4, r5)
                r0.addKey(r6)
                boolean r4 = com.google.crypto.tink.KeysetHandle.Builder.Entry.access$300(r4)
                if (r4 == 0) goto L15
                if (r3 != 0) goto L50
                java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
                goto L15
            L50:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "Two primaries were set"
                r0.<init>(r1)
                throw r0
            L58:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Id "
                r1.<init>(r2)
                java.lang.StringBuilder r1 = r1.append(r5)
                java.lang.String r2 = " is used twice in the keyset"
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L73:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "Key Status not set."
                r0.<init>(r1)
                throw r0
            L7b:
                if (r3 == 0) goto L8f
                int r1 = r3.intValue()
                r0.setPrimaryKeyId(r1)
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
                com.google.crypto.tink.proto.Keyset r0 = (com.google.crypto.tink.proto.Keyset) r0
                com.google.crypto.tink.KeysetHandle r0 = com.google.crypto.tink.KeysetHandle.fromKeyset(r0)
                return r0
            L8f:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "No primary was set"
                r0.<init>(r1)
                throw r0
        }

        public com.google.crypto.tink.KeysetHandle.Builder deleteAt(int r2) {
                r1 = this;
                java.util.List<com.google.crypto.tink.KeysetHandle$Builder$Entry> r0 = r1.entries
                r0.remove(r2)
                return r1
        }

        public com.google.crypto.tink.KeysetHandle.Builder.Entry getAt(int r2) {
                r1 = this;
                java.util.List<com.google.crypto.tink.KeysetHandle$Builder$Entry> r0 = r1.entries
                java.lang.Object r2 = r0.get(r2)
                com.google.crypto.tink.KeysetHandle$Builder$Entry r2 = (com.google.crypto.tink.KeysetHandle.Builder.Entry) r2
                return r2
        }

        @java.lang.Deprecated
        public com.google.crypto.tink.KeysetHandle.Builder.Entry removeAt(int r2) {
                r1 = this;
                java.util.List<com.google.crypto.tink.KeysetHandle$Builder$Entry> r0 = r1.entries
                java.lang.Object r2 = r0.remove(r2)
                com.google.crypto.tink.KeysetHandle$Builder$Entry r2 = (com.google.crypto.tink.KeysetHandle.Builder.Entry) r2
                return r2
        }

        public int size() {
                r1 = this;
                java.util.List<com.google.crypto.tink.KeysetHandle$Builder$Entry> r0 = r1.entries
                int r0 = r0.size()
                return r0
        }
    }

    @com.google.errorprone.annotations.Immutable
    public static final class Entry {
        private final int id;
        private final boolean isPrimary;
        private final com.google.crypto.tink.Key key;
        private final com.google.crypto.tink.KeyStatus keyStatus;

        private Entry(com.google.crypto.tink.Key r1, com.google.crypto.tink.KeyStatus r2, int r3, boolean r4) {
                r0 = this;
                r0.<init>()
                r0.key = r1
                r0.keyStatus = r2
                r0.id = r3
                r0.isPrimary = r4
                return
        }

        /* synthetic */ Entry(com.google.crypto.tink.Key r1, com.google.crypto.tink.KeyStatus r2, int r3, boolean r4, com.google.crypto.tink.KeysetHandle.AnonymousClass1 r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        public int getId() {
                r1 = this;
                int r0 = r1.id
                return r0
        }

        public com.google.crypto.tink.Key getKey() {
                r1 = this;
                com.google.crypto.tink.Key r0 = r1.key
                return r0
        }

        public com.google.crypto.tink.KeyStatus getStatus() {
                r1 = this;
                com.google.crypto.tink.KeyStatus r0 = r1.keyStatus
                return r0
        }

        public boolean isPrimary() {
                r1 = this;
                boolean r0 = r1.isPrimary
                return r0
        }
    }

    private KeysetHandle(com.google.crypto.tink.proto.Keyset r1, java.util.List<com.google.crypto.tink.KeysetHandle.Entry> r2) {
            r0 = this;
            r0.<init>()
            r0.keyset = r1
            r0.entries = r2
            com.google.crypto.tink.monitoring.MonitoringAnnotations r1 = com.google.crypto.tink.monitoring.MonitoringAnnotations.EMPTY
            r0.annotations = r1
            return
    }

    private KeysetHandle(com.google.crypto.tink.proto.Keyset r1, java.util.List<com.google.crypto.tink.KeysetHandle.Entry> r2, com.google.crypto.tink.monitoring.MonitoringAnnotations r3) {
            r0 = this;
            r0.<init>()
            r0.keyset = r1
            r0.entries = r2
            r0.annotations = r3
            return
    }

    static /* synthetic */ com.google.crypto.tink.proto.KeyStatusType access$1000(com.google.crypto.tink.KeyStatus r0) {
            com.google.crypto.tink.proto.KeyStatusType r0 = serializeStatus(r0)
            return r0
    }

    static /* synthetic */ com.google.crypto.tink.proto.Keyset.Key access$1100(int r0, com.google.crypto.tink.proto.KeyStatusType r1, com.google.crypto.tink.internal.ProtoKeySerialization r2) {
            com.google.crypto.tink.proto.Keyset$Key r0 = toKeysetKey(r0, r1, r2)
            return r0
    }

    private static void assertEnoughEncryptedKeyMaterial(com.google.crypto.tink.proto.EncryptedKeyset r1) throws java.security.GeneralSecurityException {
            if (r1 == 0) goto Ld
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.getEncryptedKeyset()
            int r1 = r1.size()
            if (r1 == 0) goto Ld
            return
        Ld:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r0 = "empty keyset"
            r1.<init>(r0)
            throw r1
    }

    private static void assertEnoughKeyMaterial(com.google.crypto.tink.proto.Keyset r1) throws java.security.GeneralSecurityException {
            if (r1 == 0) goto L9
            int r1 = r1.getKeyCount()
            if (r1 <= 0) goto L9
            return
        L9:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r0 = "empty keyset"
            r1.<init>(r0)
            throw r1
    }

    private static void assertNoSecretKeyMaterial(com.google.crypto.tink.proto.Keyset r3) throws java.security.GeneralSecurityException {
            java.util.List r3 = r3.getKeyList()
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L5d
            java.lang.Object r0 = r3.next()
            com.google.crypto.tink.proto.Keyset$Key r0 = (com.google.crypto.tink.proto.Keyset.Key) r0
            com.google.crypto.tink.proto.KeyData r1 = r0.getKeyData()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r1 = r1.getKeyMaterialType()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r2 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.UNKNOWN_KEYMATERIAL
            if (r1 == r2) goto L39
            com.google.crypto.tink.proto.KeyData r1 = r0.getKeyData()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r1 = r1.getKeyMaterialType()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r2 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC
            if (r1 == r2) goto L39
            com.google.crypto.tink.proto.KeyData r1 = r0.getKeyData()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r1 = r1.getKeyMaterialType()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r2 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE
            if (r1 == r2) goto L39
            goto L8
        L39:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            com.google.crypto.tink.proto.KeyData r1 = r0.getKeyData()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r1 = r1.getKeyMaterialType()
            java.lang.String r1 = r1.name()
            com.google.crypto.tink.proto.KeyData r0 = r0.getKeyData()
            java.lang.String r0 = r0.getTypeUrl()
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            java.lang.String r1 = "keyset contains key material of type %s for type url %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r3.<init>(r0)
            throw r3
        L5d:
            return
    }

    @java.lang.Deprecated
    public static final com.google.crypto.tink.KeysetHandle createFromKey(com.google.crypto.tink.tinkkey.KeyHandle r1, com.google.crypto.tink.tinkkey.KeyAccess r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.KeysetManager r2 = com.google.crypto.tink.KeysetManager.withEmptyKeyset()
            com.google.crypto.tink.KeysetManager r1 = r2.add(r1)
            com.google.crypto.tink.KeysetHandle r2 = r1.getKeysetHandle()
            com.google.crypto.tink.proto.KeysetInfo r2 = r2.getKeysetInfo()
            r0 = 0
            com.google.crypto.tink.proto.KeysetInfo$KeyInfo r2 = r2.getKeyInfo(r0)
            int r2 = r2.getKeyId()
            r1.setPrimary(r2)
            com.google.crypto.tink.KeysetHandle r1 = r1.getKeysetHandle()
            return r1
    }

    private static com.google.crypto.tink.proto.KeyData createPublicKeyData(com.google.crypto.tink.proto.KeyData r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r0 = r2.getKeyMaterialType()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r1 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE
            if (r0 != r1) goto L18
            java.lang.String r0 = r2.getTypeUrl()
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r2.getValue()
            com.google.crypto.tink.proto.KeyData r2 = com.google.crypto.tink.Registry.getPublicKeyData(r0, r2)
            validate(r2)
            return r2
        L18:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r0 = "The keyset contains a non-private key"
            r2.<init>(r0)
            throw r2
    }

    private static com.google.crypto.tink.proto.Keyset decrypt(com.google.crypto.tink.proto.EncryptedKeyset r0, com.google.crypto.tink.Aead r1, byte[] r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getEncryptedKeyset()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L18
            byte[] r0 = r0.toByteArray()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L18
            byte[] r0 = r1.decrypt(r0, r2)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L18
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L18
            com.google.crypto.tink.proto.Keyset r0 = com.google.crypto.tink.proto.Keyset.parseFrom(r0, r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L18
            assertEnoughKeyMaterial(r0)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L18
            return r0
        L18:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "invalid keyset, corrupted key material"
            r0.<init>(r1)
            throw r0
    }

    private static com.google.crypto.tink.proto.EncryptedKeyset encrypt(com.google.crypto.tink.proto.Keyset r1, com.google.crypto.tink.Aead r2, byte[] r3) throws java.security.GeneralSecurityException {
            byte[] r0 = r1.toByteArray()
            byte[] r0 = r2.encrypt(r0, r3)
            byte[] r2 = r2.decrypt(r0, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            com.google.crypto.tink.proto.Keyset r2 = com.google.crypto.tink.proto.Keyset.parseFrom(r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            boolean r2 = r2.equals(r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            if (r2 == 0) goto L35
            com.google.crypto.tink.proto.EncryptedKeyset$Builder r2 = com.google.crypto.tink.proto.EncryptedKeyset.newBuilder()
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r0)
            com.google.crypto.tink.proto.EncryptedKeyset$Builder r2 = r2.setEncryptedKeyset(r3)
            com.google.crypto.tink.proto.KeysetInfo r1 = com.google.crypto.tink.Util.getKeysetInfo(r1)
            com.google.crypto.tink.proto.EncryptedKeyset$Builder r1 = r2.setKeysetInfo(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.EncryptedKeyset r1 = (com.google.crypto.tink.proto.EncryptedKeyset) r1
            return r1
        L35:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            java.lang.String r2 = "cannot encrypt keyset"
            r1.<init>(r2)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            throw r1     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
        L3d:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "invalid keyset, corrupted key material"
            r1.<init>(r2)
            throw r1
    }

    private com.google.crypto.tink.KeysetHandle.Entry entryByIndex(int r2) {
            r1 = this;
            java.util.List<com.google.crypto.tink.KeysetHandle$Entry> r0 = r1.entries
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L11
            java.util.List<com.google.crypto.tink.KeysetHandle$Entry> r0 = r1.entries
            java.lang.Object r2 = r0.get(r2)
            com.google.crypto.tink.KeysetHandle$Entry r2 = (com.google.crypto.tink.KeysetHandle.Entry) r2
            return r2
        L11:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Keyset-Entry at position i has wrong status or key parsing failed"
            r2.<init>(r0)
            throw r2
    }

    static final com.google.crypto.tink.KeysetHandle fromKeyset(com.google.crypto.tink.proto.Keyset r2) throws java.security.GeneralSecurityException {
            assertEnoughKeyMaterial(r2)
            java.util.List r0 = getEntriesFromKeyset(r2)
            com.google.crypto.tink.KeysetHandle r1 = new com.google.crypto.tink.KeysetHandle
            r1.<init>(r2, r0)
            return r1
    }

    static final com.google.crypto.tink.KeysetHandle fromKeysetAndAnnotations(com.google.crypto.tink.proto.Keyset r2, com.google.crypto.tink.monitoring.MonitoringAnnotations r3) throws java.security.GeneralSecurityException {
            assertEnoughKeyMaterial(r2)
            java.util.List r0 = getEntriesFromKeyset(r2)
            com.google.crypto.tink.KeysetHandle r1 = new com.google.crypto.tink.KeysetHandle
            r1.<init>(r2, r0, r3)
            return r1
    }

    public static com.google.crypto.tink.KeysetHandle.Builder.Entry generateEntryFromParameters(com.google.crypto.tink.Parameters r2) {
            com.google.crypto.tink.KeysetHandle$Builder$Entry r0 = new com.google.crypto.tink.KeysetHandle$Builder$Entry
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static com.google.crypto.tink.KeysetHandle.Builder.Entry generateEntryFromParametersName(java.lang.String r3) throws java.security.GeneralSecurityException {
            java.util.Map r0 = com.google.crypto.tink.Registry.keyTemplateMap()
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L2b
            java.util.Map r0 = com.google.crypto.tink.Registry.keyTemplateMap()
            java.lang.Object r3 = r0.get(r3)
            com.google.crypto.tink.KeyTemplate r3 = (com.google.crypto.tink.KeyTemplate) r3
            com.google.crypto.tink.proto.KeyTemplate r3 = r3.getProto()
            com.google.crypto.tink.internal.ProtoParametersSerialization r3 = com.google.crypto.tink.internal.ProtoParametersSerialization.create(r3)
            com.google.crypto.tink.internal.MutableSerializationRegistry r0 = com.google.crypto.tink.internal.MutableSerializationRegistry.globalInstance()
            com.google.crypto.tink.Parameters r3 = r0.parseParametersWithLegacyFallback(r3)
            com.google.crypto.tink.KeysetHandle$Builder$Entry r0 = new com.google.crypto.tink.KeysetHandle$Builder$Entry
            r1 = 0
            r0.<init>(r3, r1)
            return r0
        L2b:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "cannot find key template: "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    public static final com.google.crypto.tink.KeysetHandle generateNew(com.google.crypto.tink.KeyTemplate r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.internal.LegacyProtoParameters r0 = new com.google.crypto.tink.internal.LegacyProtoParameters
            com.google.crypto.tink.proto.KeyTemplate r1 = r1.getProto()
            com.google.crypto.tink.internal.ProtoParametersSerialization r1 = com.google.crypto.tink.internal.ProtoParametersSerialization.create(r1)
            r0.<init>(r1)
            com.google.crypto.tink.KeysetHandle$Builder r1 = newBuilder()
            com.google.crypto.tink.KeysetHandle$Builder$Entry r0 = generateEntryFromParameters(r0)
            com.google.crypto.tink.KeysetHandle$Builder$Entry r0 = r0.makePrimary()
            com.google.crypto.tink.KeysetHandle$Builder$Entry r0 = r0.withRandomId()
            com.google.crypto.tink.KeysetHandle$Builder r1 = r1.addEntry(r0)
            com.google.crypto.tink.KeysetHandle r1 = r1.build()
            return r1
    }

    @java.lang.Deprecated
    public static final com.google.crypto.tink.KeysetHandle generateNew(com.google.crypto.tink.proto.KeyTemplate r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.internal.LegacyProtoParameters r0 = new com.google.crypto.tink.internal.LegacyProtoParameters
            com.google.crypto.tink.internal.ProtoParametersSerialization r1 = com.google.crypto.tink.internal.ProtoParametersSerialization.create(r1)
            r0.<init>(r1)
            com.google.crypto.tink.KeysetHandle$Builder r1 = newBuilder()
            com.google.crypto.tink.KeysetHandle$Builder$Entry r0 = generateEntryFromParameters(r0)
            com.google.crypto.tink.KeysetHandle$Builder$Entry r0 = r0.makePrimary()
            com.google.crypto.tink.KeysetHandle$Builder$Entry r0 = r0.withRandomId()
            com.google.crypto.tink.KeysetHandle$Builder r1 = r1.addEntry(r0)
            com.google.crypto.tink.KeysetHandle r1 = r1.build()
            return r1
    }

    private static java.util.List<com.google.crypto.tink.KeysetHandle.Entry> getEntriesFromKeyset(com.google.crypto.tink.proto.Keyset r10) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r10.getKeyCount()
            r0.<init>(r1)
            java.util.List r1 = r10.getKeyList()
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L53
            java.lang.Object r2 = r1.next()
            com.google.crypto.tink.proto.Keyset$Key r2 = (com.google.crypto.tink.proto.Keyset.Key) r2
            int r6 = r2.getKeyId()
            com.google.crypto.tink.internal.ProtoKeySerialization r3 = toProtoKeySerialization(r2)
            com.google.crypto.tink.internal.MutableSerializationRegistry r4 = com.google.crypto.tink.internal.MutableSerializationRegistry.globalInstance()     // Catch: java.security.GeneralSecurityException -> L4e
            com.google.crypto.tink.SecretKeyAccess r5 = com.google.crypto.tink.InsecureSecretKeyAccess.get()     // Catch: java.security.GeneralSecurityException -> L4e
            com.google.crypto.tink.Key r4 = r4.parseKeyWithLegacyFallback(r3, r5)     // Catch: java.security.GeneralSecurityException -> L4e
            com.google.crypto.tink.KeysetHandle$Entry r9 = new com.google.crypto.tink.KeysetHandle$Entry     // Catch: java.security.GeneralSecurityException -> L4e
            com.google.crypto.tink.proto.KeyStatusType r2 = r2.getStatus()     // Catch: java.security.GeneralSecurityException -> L4e
            com.google.crypto.tink.KeyStatus r5 = parseStatus(r2)     // Catch: java.security.GeneralSecurityException -> L4e
            int r2 = r10.getPrimaryKeyId()     // Catch: java.security.GeneralSecurityException -> L4e
            if (r6 != r2) goto L43
            r2 = 1
            goto L44
        L43:
            r2 = 0
        L44:
            r7 = r2
            r8 = 0
            r3 = r9
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.security.GeneralSecurityException -> L4e
            r0.add(r9)     // Catch: java.security.GeneralSecurityException -> L4e
            goto L11
        L4e:
            r2 = 0
            r0.add(r2)
            goto L11
        L53:
            java.util.List r10 = java.util.Collections.unmodifiableList(r0)
            return r10
    }

    @javax.annotation.Nullable
    private <B> B getFullPrimitiveOrNull(com.google.crypto.tink.Key r1, java.lang.Class<B> r2) throws java.security.GeneralSecurityException {
            r0 = this;
            java.lang.Object r1 = com.google.crypto.tink.Registry.getFullPrimitive(r1, r2)     // Catch: java.security.GeneralSecurityException -> L5
            return r1
        L5:
            r1 = 0
            return r1
    }

    @javax.annotation.Nullable
    private static <B> B getLegacyPrimitiveOrNull(com.google.crypto.tink.proto.Keyset.Key r1, java.lang.Class<B> r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.KeyData r1 = r1.getKeyData()     // Catch: java.security.GeneralSecurityException -> L9
            java.lang.Object r1 = com.google.crypto.tink.Registry.getPrimitive(r1, r2)     // Catch: java.security.GeneralSecurityException -> L9
            return r1
        L9:
            r1 = move-exception
            java.lang.String r2 = r1.getMessage()
            java.lang.String r0 = "No key manager found for key type "
            boolean r2 = r2.contains(r0)
            if (r2 != 0) goto L24
            java.lang.String r2 = r1.getMessage()
            java.lang.String r0 = " not supported by key manager of type "
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L23
            goto L24
        L23:
            throw r1
        L24:
            r1 = 0
            return r1
    }

    private <B, P> P getPrimitiveWithKnownInputPrimitive(java.lang.Class<P> r8, java.lang.Class<B> r9) throws java.security.GeneralSecurityException {
            r7 = this;
            com.google.crypto.tink.proto.Keyset r0 = r7.keyset
            com.google.crypto.tink.Util.validateKeyset(r0)
            com.google.crypto.tink.PrimitiveSet$Builder r0 = com.google.crypto.tink.PrimitiveSet.newBuilder(r9)
            com.google.crypto.tink.monitoring.MonitoringAnnotations r1 = r7.annotations
            r0.setAnnotations(r1)
            r1 = 0
        Lf:
            int r2 = r7.size()
            if (r1 >= r2) goto L5b
            com.google.crypto.tink.proto.Keyset r2 = r7.keyset
            com.google.crypto.tink.proto.Keyset$Key r2 = r2.getKey(r1)
            com.google.crypto.tink.proto.KeyStatusType r3 = r2.getStatus()
            com.google.crypto.tink.proto.KeyStatusType r4 = com.google.crypto.tink.proto.KeyStatusType.ENABLED
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L58
            java.lang.Object r3 = getLegacyPrimitiveOrNull(r2, r9)
            java.util.List<com.google.crypto.tink.KeysetHandle$Entry> r4 = r7.entries
            java.lang.Object r4 = r4.get(r1)
            if (r4 == 0) goto L44
            java.util.List<com.google.crypto.tink.KeysetHandle$Entry> r4 = r7.entries
            java.lang.Object r4 = r4.get(r1)
            com.google.crypto.tink.KeysetHandle$Entry r4 = (com.google.crypto.tink.KeysetHandle.Entry) r4
            com.google.crypto.tink.Key r4 = r4.getKey()
            java.lang.Object r4 = r7.getFullPrimitiveOrNull(r4, r9)
            goto L45
        L44:
            r4 = 0
        L45:
            int r5 = r2.getKeyId()
            com.google.crypto.tink.proto.Keyset r6 = r7.keyset
            int r6 = r6.getPrimaryKeyId()
            if (r5 != r6) goto L55
            r0.addPrimaryFullPrimitiveAndOptionalPrimitive(r4, r3, r2)
            goto L58
        L55:
            r0.addFullPrimitiveAndOptionalPrimitive(r4, r3, r2)
        L58:
            int r1 = r1 + 1
            goto Lf
        L5b:
            com.google.crypto.tink.PrimitiveSet r9 = r0.build()
            java.lang.Object r8 = com.google.crypto.tink.Registry.wrap(r9, r8)
            return r8
    }

    public static com.google.crypto.tink.KeysetHandle.Builder.Entry importKey(com.google.crypto.tink.Key r2) {
            com.google.crypto.tink.KeysetHandle$Builder$Entry r0 = new com.google.crypto.tink.KeysetHandle$Builder$Entry
            r1 = 0
            r0.<init>(r2, r1)
            java.lang.Integer r2 = r2.getIdRequirementOrNull()
            if (r2 == 0) goto L13
            int r2 = r2.intValue()
            r0.withFixedId(r2)
        L13:
            return r0
    }

    public static com.google.crypto.tink.KeysetHandle.Builder newBuilder() {
            com.google.crypto.tink.KeysetHandle$Builder r0 = new com.google.crypto.tink.KeysetHandle$Builder
            r0.<init>()
            return r0
    }

    public static com.google.crypto.tink.KeysetHandle.Builder newBuilder(com.google.crypto.tink.KeysetHandle r5) {
            com.google.crypto.tink.KeysetHandle$Builder r0 = new com.google.crypto.tink.KeysetHandle$Builder
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r5.size()
            if (r1 >= r2) goto L36
            com.google.crypto.tink.KeysetHandle$Entry r2 = r5.entryByIndex(r1)
            com.google.crypto.tink.Key r3 = r2.getKey()
            com.google.crypto.tink.KeysetHandle$Builder$Entry r3 = importKey(r3)
            int r4 = r2.getId()
            com.google.crypto.tink.KeysetHandle$Builder$Entry r3 = r3.withFixedId(r4)
            com.google.crypto.tink.KeyStatus r4 = r2.getStatus()
            r3.setStatus(r4)
            boolean r2 = r2.isPrimary()
            if (r2 == 0) goto L30
            r3.makePrimary()
        L30:
            r0.addEntry(r3)
            int r1 = r1 + 1
            goto L6
        L36:
            return r0
    }

    private static com.google.crypto.tink.KeyStatus parseStatus(com.google.crypto.tink.proto.KeyStatusType r1) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.KeysetHandle.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$KeyStatusType
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 1
            if (r1 == r0) goto L1f
            r0 = 2
            if (r1 == r0) goto L1c
            r0 = 3
            if (r1 != r0) goto L14
            com.google.crypto.tink.KeyStatus r1 = com.google.crypto.tink.KeyStatus.DESTROYED
            return r1
        L14:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Unknown key status"
            r1.<init>(r0)
            throw r1
        L1c:
            com.google.crypto.tink.KeyStatus r1 = com.google.crypto.tink.KeyStatus.DISABLED
            return r1
        L1f:
            com.google.crypto.tink.KeyStatus r1 = com.google.crypto.tink.KeyStatus.ENABLED
            return r1
    }

    public static final com.google.crypto.tink.KeysetHandle read(com.google.crypto.tink.KeysetReader r1, com.google.crypto.tink.Aead r2) throws java.security.GeneralSecurityException, java.io.IOException {
            r0 = 0
            byte[] r0 = new byte[r0]
            com.google.crypto.tink.KeysetHandle r1 = readWithAssociatedData(r1, r2, r0)
            return r1
    }

    public static final com.google.crypto.tink.KeysetHandle readNoSecret(com.google.crypto.tink.KeysetReader r1) throws java.security.GeneralSecurityException, java.io.IOException {
            com.google.crypto.tink.proto.Keyset r1 = r1.read()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lc
            assertNoSecretKeyMaterial(r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lc
            com.google.crypto.tink.KeysetHandle r1 = fromKeyset(r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lc
            return r1
        Lc:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r0 = "invalid keyset"
            r1.<init>(r0)
            throw r1
    }

    @java.lang.Deprecated
    public static final com.google.crypto.tink.KeysetHandle readNoSecret(byte[] r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L10
            com.google.crypto.tink.proto.Keyset r1 = com.google.crypto.tink.proto.Keyset.parseFrom(r1, r0)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L10
            assertNoSecretKeyMaterial(r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L10
            com.google.crypto.tink.KeysetHandle r1 = fromKeyset(r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L10
            return r1
        L10:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r0 = "invalid keyset"
            r1.<init>(r0)
            throw r1
    }

    public static final com.google.crypto.tink.KeysetHandle readWithAssociatedData(com.google.crypto.tink.KeysetReader r0, com.google.crypto.tink.Aead r1, byte[] r2) throws java.security.GeneralSecurityException, java.io.IOException {
            com.google.crypto.tink.proto.EncryptedKeyset r0 = r0.readEncrypted()
            assertEnoughEncryptedKeyMaterial(r0)
            com.google.crypto.tink.proto.Keyset r0 = decrypt(r0, r1, r2)
            com.google.crypto.tink.KeysetHandle r0 = fromKeyset(r0)
            return r0
    }

    private static com.google.crypto.tink.proto.KeyStatusType serializeStatus(com.google.crypto.tink.KeyStatus r1) {
            com.google.crypto.tink.KeyStatus r0 = com.google.crypto.tink.KeyStatus.ENABLED
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb
            com.google.crypto.tink.proto.KeyStatusType r1 = com.google.crypto.tink.proto.KeyStatusType.ENABLED
            return r1
        Lb:
            com.google.crypto.tink.KeyStatus r0 = com.google.crypto.tink.KeyStatus.DISABLED
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L16
            com.google.crypto.tink.proto.KeyStatusType r1 = com.google.crypto.tink.proto.KeyStatusType.DISABLED
            return r1
        L16:
            com.google.crypto.tink.KeyStatus r0 = com.google.crypto.tink.KeyStatus.DESTROYED
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L21
            com.google.crypto.tink.proto.KeyStatusType r1 = com.google.crypto.tink.proto.KeyStatusType.DESTROYED
            return r1
        L21:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unknown key status"
            r1.<init>(r0)
            throw r1
    }

    private static com.google.crypto.tink.proto.Keyset.Key toKeysetKey(int r3, com.google.crypto.tink.proto.KeyStatusType r4, com.google.crypto.tink.internal.ProtoKeySerialization r5) {
            com.google.crypto.tink.proto.Keyset$Key$Builder r0 = com.google.crypto.tink.proto.Keyset.Key.newBuilder()
            com.google.crypto.tink.proto.KeyData$Builder r1 = com.google.crypto.tink.proto.KeyData.newBuilder()
            java.lang.String r2 = r5.getTypeUrl()
            com.google.crypto.tink.proto.KeyData$Builder r1 = r1.setTypeUrl(r2)
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r5.getValue()
            com.google.crypto.tink.proto.KeyData$Builder r1 = r1.setValue(r2)
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r2 = r5.getKeyMaterialType()
            com.google.crypto.tink.proto.KeyData$Builder r1 = r1.setKeyMaterialType(r2)
            com.google.crypto.tink.proto.Keyset$Key$Builder r0 = r0.setKeyData(r1)
            com.google.crypto.tink.proto.Keyset$Key$Builder r4 = r0.setStatus(r4)
            com.google.crypto.tink.proto.Keyset$Key$Builder r3 = r4.setKeyId(r3)
            com.google.crypto.tink.proto.OutputPrefixType r4 = r5.getOutputPrefixType()
            com.google.crypto.tink.proto.Keyset$Key$Builder r3 = r3.setOutputPrefixType(r4)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.build()
            com.google.crypto.tink.proto.Keyset$Key r3 = (com.google.crypto.tink.proto.Keyset.Key) r3
            return r3
    }

    private static com.google.crypto.tink.internal.ProtoKeySerialization toProtoKeySerialization(com.google.crypto.tink.proto.Keyset.Key r4) {
            int r0 = r4.getKeyId()
            com.google.crypto.tink.proto.OutputPrefixType r1 = r4.getOutputPrefixType()
            com.google.crypto.tink.proto.OutputPrefixType r2 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            if (r1 != r2) goto Le
            r0 = 0
            goto L12
        Le:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L12:
            com.google.crypto.tink.proto.KeyData r1 = r4.getKeyData()     // Catch: java.security.GeneralSecurityException -> L33
            java.lang.String r1 = r1.getTypeUrl()     // Catch: java.security.GeneralSecurityException -> L33
            com.google.crypto.tink.proto.KeyData r2 = r4.getKeyData()     // Catch: java.security.GeneralSecurityException -> L33
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r2.getValue()     // Catch: java.security.GeneralSecurityException -> L33
            com.google.crypto.tink.proto.KeyData r3 = r4.getKeyData()     // Catch: java.security.GeneralSecurityException -> L33
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r3 = r3.getKeyMaterialType()     // Catch: java.security.GeneralSecurityException -> L33
            com.google.crypto.tink.proto.OutputPrefixType r4 = r4.getOutputPrefixType()     // Catch: java.security.GeneralSecurityException -> L33
            com.google.crypto.tink.internal.ProtoKeySerialization r4 = com.google.crypto.tink.internal.ProtoKeySerialization.create(r1, r2, r3, r4, r0)     // Catch: java.security.GeneralSecurityException -> L33
            return r4
        L33:
            r4 = move-exception
            com.google.crypto.tink.internal.TinkBugException r0 = new com.google.crypto.tink.internal.TinkBugException
            java.lang.String r1 = "Creating a protokey serialization failed"
            r0.<init>(r1, r4)
            throw r0
    }

    private static void validate(com.google.crypto.tink.proto.KeyData r0) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.Registry.getPrimitive(r0)
            return
    }

    public com.google.crypto.tink.KeysetHandle.Entry getAt(int r4) {
            r3 = this;
            if (r4 < 0) goto Ld
            int r0 = r3.size()
            if (r4 >= r0) goto Ld
            com.google.crypto.tink.KeysetHandle$Entry r4 = r3.entryByIndex(r4)
            return r4
        Ld:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid index "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " for keyset of size "
            java.lang.StringBuilder r4 = r4.append(r1)
            int r1 = r3.size()
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    @java.lang.Deprecated
    public java.util.List<com.google.crypto.tink.tinkkey.KeyHandle> getKeys() {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.crypto.tink.proto.Keyset r1 = r7.keyset
            java.util.List r1 = r1.getKeyList()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r1.next()
            com.google.crypto.tink.proto.Keyset$Key r2 = (com.google.crypto.tink.proto.Keyset.Key) r2
            com.google.crypto.tink.proto.KeyData r3 = r2.getKeyData()
            com.google.crypto.tink.tinkkey.internal.InternalKeyHandle r4 = new com.google.crypto.tink.tinkkey.internal.InternalKeyHandle
            com.google.crypto.tink.tinkkey.internal.ProtoKey r5 = new com.google.crypto.tink.tinkkey.internal.ProtoKey
            com.google.crypto.tink.proto.OutputPrefixType r6 = r2.getOutputPrefixType()
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r6 = com.google.crypto.tink.KeyTemplate.fromProto(r6)
            r5.<init>(r3, r6)
            com.google.crypto.tink.proto.KeyStatusType r3 = r2.getStatus()
            int r2 = r2.getKeyId()
            r4.<init>(r5, r3, r2)
            r0.add(r4)
            goto Lf
        L3d:
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    com.google.crypto.tink.proto.Keyset getKeyset() {
            r1 = this;
            com.google.crypto.tink.proto.Keyset r0 = r1.keyset
            return r0
    }

    public com.google.crypto.tink.proto.KeysetInfo getKeysetInfo() {
            r1 = this;
            com.google.crypto.tink.proto.Keyset r0 = r1.keyset
            com.google.crypto.tink.proto.KeysetInfo r0 = com.google.crypto.tink.Util.getKeysetInfo(r0)
            return r0
    }

    public com.google.crypto.tink.KeysetHandle.Entry getPrimary() {
            r3 = this;
            r0 = 0
        L1:
            com.google.crypto.tink.proto.Keyset r1 = r3.keyset
            int r1 = r1.getKeyCount()
            if (r0 >= r1) goto L33
            com.google.crypto.tink.proto.Keyset r1 = r3.keyset
            com.google.crypto.tink.proto.Keyset$Key r1 = r1.getKey(r0)
            int r1 = r1.getKeyId()
            com.google.crypto.tink.proto.Keyset r2 = r3.keyset
            int r2 = r2.getPrimaryKeyId()
            if (r1 != r2) goto L30
            com.google.crypto.tink.KeysetHandle$Entry r0 = r3.entryByIndex(r0)
            com.google.crypto.tink.KeyStatus r1 = r0.getStatus()
            com.google.crypto.tink.KeyStatus r2 = com.google.crypto.tink.KeyStatus.ENABLED
            if (r1 != r2) goto L28
            return r0
        L28:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Keyset has primary which isn't enabled"
            r0.<init>(r1)
            throw r0
        L30:
            int r0 = r0 + 1
            goto L1
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Keyset has no primary"
            r0.<init>(r1)
            throw r0
    }

    public <P> P getPrimitive(java.lang.Class<P> r4) throws java.security.GeneralSecurityException {
            r3 = this;
            java.lang.Class r0 = com.google.crypto.tink.Registry.getInputPrimitive(r4)
            if (r0 == 0) goto Lb
            java.lang.Object r4 = r3.getPrimitiveWithKnownInputPrimitive(r4, r0)
            return r4
        Lb:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No wrapper found for "
            r1.<init>(r2)
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public com.google.crypto.tink.KeysetHandle getPublicKeysetHandle() throws java.security.GeneralSecurityException {
            r4 = this;
            com.google.crypto.tink.proto.Keyset r0 = r4.keyset
            if (r0 == 0) goto L4e
            com.google.crypto.tink.proto.Keyset$Builder r0 = com.google.crypto.tink.proto.Keyset.newBuilder()
            com.google.crypto.tink.proto.Keyset r1 = r4.keyset
            java.util.List r1 = r1.getKeyList()
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r1.next()
            com.google.crypto.tink.proto.Keyset$Key r2 = (com.google.crypto.tink.proto.Keyset.Key) r2
            com.google.crypto.tink.proto.KeyData r3 = r2.getKeyData()
            com.google.crypto.tink.proto.KeyData r3 = createPublicKeyData(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r2 = r2.toBuilder()
            com.google.crypto.tink.proto.Keyset$Key$Builder r2 = (com.google.crypto.tink.proto.Keyset.Key.Builder) r2
            com.google.crypto.tink.proto.Keyset$Key$Builder r2 = r2.setKeyData(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.Keyset$Key r2 = (com.google.crypto.tink.proto.Keyset.Key) r2
            r0.addKey(r2)
            goto L12
        L3a:
            com.google.crypto.tink.proto.Keyset r1 = r4.keyset
            int r1 = r1.getPrimaryKeyId()
            r0.setPrimaryKeyId(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.Keyset r0 = (com.google.crypto.tink.proto.Keyset) r0
            com.google.crypto.tink.KeysetHandle r0 = fromKeyset(r0)
            return r0
        L4e:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "cleartext keyset is not available"
            r0.<init>(r1)
            throw r0
    }

    @java.lang.Deprecated
    public com.google.crypto.tink.tinkkey.KeyHandle primaryKey() throws java.security.GeneralSecurityException {
            r5 = this;
            com.google.crypto.tink.proto.Keyset r0 = r5.keyset
            int r0 = r0.getPrimaryKeyId()
            com.google.crypto.tink.proto.Keyset r1 = r5.keyset
            java.util.List r1 = r1.getKeyList()
            java.util.Iterator r1 = r1.iterator()
        L10:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L41
            java.lang.Object r2 = r1.next()
            com.google.crypto.tink.proto.Keyset$Key r2 = (com.google.crypto.tink.proto.Keyset.Key) r2
            int r3 = r2.getKeyId()
            if (r3 != r0) goto L10
            com.google.crypto.tink.tinkkey.internal.InternalKeyHandle r0 = new com.google.crypto.tink.tinkkey.internal.InternalKeyHandle
            com.google.crypto.tink.tinkkey.internal.ProtoKey r1 = new com.google.crypto.tink.tinkkey.internal.ProtoKey
            com.google.crypto.tink.proto.KeyData r3 = r2.getKeyData()
            com.google.crypto.tink.proto.OutputPrefixType r4 = r2.getOutputPrefixType()
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r4 = com.google.crypto.tink.KeyTemplate.fromProto(r4)
            r1.<init>(r3, r4)
            com.google.crypto.tink.proto.KeyStatusType r3 = r2.getStatus()
            int r2 = r2.getKeyId()
            r0.<init>(r1, r3, r2)
            return r0
        L41:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "No primary key found in keyset."
            r0.<init>(r1)
            throw r0
    }

    public int size() {
            r1 = this;
            com.google.crypto.tink.proto.Keyset r0 = r1.keyset
            int r0 = r0.getKeyCount()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            com.google.crypto.tink.proto.KeysetInfo r0 = r1.getKeysetInfo()
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void write(com.google.crypto.tink.KeysetWriter r2, com.google.crypto.tink.Aead r3) throws java.security.GeneralSecurityException, java.io.IOException {
            r1 = this;
            r0 = 0
            byte[] r0 = new byte[r0]
            r1.writeWithAssociatedData(r2, r3, r0)
            return
    }

    public void writeNoSecret(com.google.crypto.tink.KeysetWriter r2) throws java.security.GeneralSecurityException, java.io.IOException {
            r1 = this;
            com.google.crypto.tink.proto.Keyset r0 = r1.keyset
            assertNoSecretKeyMaterial(r0)
            com.google.crypto.tink.proto.Keyset r0 = r1.keyset
            r2.write(r0)
            return
    }

    public void writeWithAssociatedData(com.google.crypto.tink.KeysetWriter r2, com.google.crypto.tink.Aead r3, byte[] r4) throws java.security.GeneralSecurityException, java.io.IOException {
            r1 = this;
            com.google.crypto.tink.proto.Keyset r0 = r1.keyset
            com.google.crypto.tink.proto.EncryptedKeyset r3 = encrypt(r0, r3, r4)
            r2.write(r3)
            return
    }
}
