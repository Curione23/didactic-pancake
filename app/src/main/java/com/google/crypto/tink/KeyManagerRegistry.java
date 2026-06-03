package com.google.crypto.tink;

/* JADX INFO: loaded from: classes2.dex */
final class KeyManagerRegistry {
    private static final java.util.logging.Logger logger = null;
    private final java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyManagerRegistry.KeyManagerContainer> keyManagerMap;




    private interface KeyManagerContainer {
        java.lang.Class<?> getImplementingClass();

        <P> com.google.crypto.tink.KeyManager<P> getKeyManager(java.lang.Class<P> r1) throws java.security.GeneralSecurityException;

        com.google.crypto.tink.KeyManager<?> getUntypedKeyManager();

        com.google.crypto.tink.shaded.protobuf.MessageLite parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws java.security.GeneralSecurityException, com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

        java.lang.Class<?> publicKeyManagerClassOrNull();

        java.util.Set<java.lang.Class<?>> supportedPrimitives();
    }

    static {
            java.lang.Class<com.google.crypto.tink.KeyManagerRegistry> r0 = com.google.crypto.tink.KeyManagerRegistry.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.crypto.tink.KeyManagerRegistry.logger = r0
            return
    }

    KeyManagerRegistry() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.keyManagerMap = r0
            return
    }

    KeyManagerRegistry(com.google.crypto.tink.KeyManagerRegistry r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer> r2 = r2.keyManagerMap
            r0.<init>(r2)
            r1.keyManagerMap = r0
            return
    }

    private static <T> T checkNotNull(T r0) {
            r0.getClass()
            return r0
    }

    private static <P> com.google.crypto.tink.KeyManagerRegistry.KeyManagerContainer createContainerFor(com.google.crypto.tink.KeyManager<P> r1) {
            com.google.crypto.tink.KeyManagerRegistry$1 r0 = new com.google.crypto.tink.KeyManagerRegistry$1
            r0.<init>(r1)
            return r0
    }

    private static <KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> com.google.crypto.tink.KeyManagerRegistry.KeyManagerContainer createContainerFor(com.google.crypto.tink.internal.KeyTypeManager<KeyProtoT> r1) {
            com.google.crypto.tink.KeyManagerRegistry$2 r0 = new com.google.crypto.tink.KeyManagerRegistry$2
            r0.<init>(r1)
            return r0
    }

    private static <KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, PublicKeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> com.google.crypto.tink.KeyManagerRegistry.KeyManagerContainer createPrivateKeyContainerFor(com.google.crypto.tink.internal.PrivateKeyTypeManager<KeyProtoT, PublicKeyProtoT> r1, com.google.crypto.tink.internal.KeyTypeManager<PublicKeyProtoT> r2) {
            com.google.crypto.tink.KeyManagerRegistry$3 r0 = new com.google.crypto.tink.KeyManagerRegistry$3
            r0.<init>(r1, r2)
            return r0
    }

    private synchronized com.google.crypto.tink.KeyManagerRegistry.KeyManagerContainer getKeyManagerContainerOrThrow(java.lang.String r4) throws java.security.GeneralSecurityException {
            r3 = this;
            java.lang.String r0 = "No key manager found for key type "
            monitor-enter(r3)
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer> r1 = r3.keyManagerMap     // Catch: java.lang.Throwable -> L28
            boolean r1 = r1.containsKey(r4)     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L15
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer> r0 = r3.keyManagerMap     // Catch: java.lang.Throwable -> L28
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.Throwable -> L28
            com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer r4 = (com.google.crypto.tink.KeyManagerRegistry.KeyManagerContainer) r4     // Catch: java.lang.Throwable -> L28
            monitor-exit(r3)
            return r4
        L15:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L28
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L28
            java.lang.StringBuilder r4 = r2.append(r4)     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L28
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L28
            throw r1     // Catch: java.lang.Throwable -> L28
        L28:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L28
            throw r4
    }

    private <P> com.google.crypto.tink.KeyManager<P> getKeyManagerInternal(java.lang.String r4, java.lang.Class<P> r5) throws java.security.GeneralSecurityException {
            r3 = this;
            com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer r4 = r3.getKeyManagerContainerOrThrow(r4)
            if (r5 != 0) goto Lb
            com.google.crypto.tink.KeyManager r4 = r4.getUntypedKeyManager()
            return r4
        Lb:
            java.util.Set r0 = r4.supportedPrimitives()
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L1a
            com.google.crypto.tink.KeyManager r4 = r4.getKeyManager(r5)
            return r4
        L1a:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Primitive type "
            r1.<init>(r2)
            java.lang.String r5 = r5.getName()
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r1 = " not supported by key manager of type "
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.Class r1 = r4.getImplementingClass()
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.String r1 = ", supported primitives: "
            java.lang.StringBuilder r5 = r5.append(r1)
            java.util.Set r4 = r4.supportedPrimitives()
            java.lang.String r4 = toCommaSeparatedString(r4)
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    private synchronized <P> void registerKeyManagerContainer(com.google.crypto.tink.KeyManagerRegistry.KeyManagerContainer r6, boolean r7) throws java.security.GeneralSecurityException {
            r5 = this;
            java.lang.String r0 = "Attempted overwrite of a registered key manager for key type "
            monitor-enter(r5)
            com.google.crypto.tink.KeyManager r1 = r6.getUntypedKeyManager()     // Catch: java.lang.Throwable -> L65
            java.lang.String r1 = r1.getKeyType()     // Catch: java.lang.Throwable -> L65
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer> r2 = r5.keyManagerMap     // Catch: java.lang.Throwable -> L65
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L65
            com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer r2 = (com.google.crypto.tink.KeyManagerRegistry.KeyManagerContainer) r2     // Catch: java.lang.Throwable -> L65
            if (r2 == 0) goto L56
            java.lang.Class r3 = r2.getImplementingClass()     // Catch: java.lang.Throwable -> L65
            java.lang.Class r4 = r6.getImplementingClass()     // Catch: java.lang.Throwable -> L65
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L65
            if (r3 == 0) goto L24
            goto L56
        L24:
            java.util.logging.Logger r7 = com.google.crypto.tink.KeyManagerRegistry.logger     // Catch: java.lang.Throwable -> L65
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L65
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L65
            java.lang.StringBuilder r0 = r3.append(r1)     // Catch: java.lang.Throwable -> L65
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L65
            r7.warning(r0)     // Catch: java.lang.Throwable -> L65
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L65
            java.lang.String r0 = "typeUrl (%s) is already registered with %s, cannot be re-registered with %s"
            java.lang.Class r2 = r2.getImplementingClass()     // Catch: java.lang.Throwable -> L65
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L65
            java.lang.Class r6 = r6.getImplementingClass()     // Catch: java.lang.Throwable -> L65
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L65
            java.lang.Object[] r6 = new java.lang.Object[]{r1, r2, r6}     // Catch: java.lang.Throwable -> L65
            java.lang.String r6 = java.lang.String.format(r0, r6)     // Catch: java.lang.Throwable -> L65
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L65
            throw r7     // Catch: java.lang.Throwable -> L65
        L56:
            if (r7 != 0) goto L5e
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer> r7 = r5.keyManagerMap     // Catch: java.lang.Throwable -> L65
            r7.putIfAbsent(r1, r6)     // Catch: java.lang.Throwable -> L65
            goto L63
        L5e:
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer> r7 = r5.keyManagerMap     // Catch: java.lang.Throwable -> L65
            r7.put(r1, r6)     // Catch: java.lang.Throwable -> L65
        L63:
            monitor-exit(r5)
            return
        L65:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L65
            throw r6
    }

    private static java.lang.String toCommaSeparatedString(java.util.Set<java.lang.Class<?>> r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
            r1 = 1
        La:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r3.next()
            java.lang.Class r2 = (java.lang.Class) r2
            if (r1 != 0) goto L1d
            java.lang.String r1 = ", "
            r0.append(r1)
        L1d:
            java.lang.String r1 = r2.getCanonicalName()
            r0.append(r1)
            r1 = 0
            goto La
        L26:
            java.lang.String r3 = r0.toString()
            return r3
    }

    @java.lang.Deprecated
    <P> com.google.crypto.tink.KeyManager<P> getKeyManager(java.lang.String r2) throws java.security.GeneralSecurityException {
            r1 = this;
            r0 = 0
            com.google.crypto.tink.KeyManager r2 = r1.getKeyManagerInternal(r2, r0)
            return r2
    }

    <P> com.google.crypto.tink.KeyManager<P> getKeyManager(java.lang.String r1, java.lang.Class<P> r2) throws java.security.GeneralSecurityException {
            r0 = this;
            java.lang.Object r2 = checkNotNull(r2)
            java.lang.Class r2 = (java.lang.Class) r2
            com.google.crypto.tink.KeyManager r1 = r0.getKeyManagerInternal(r1, r2)
            return r1
    }

    com.google.crypto.tink.KeyManager<?> getUntypedKeyManager(java.lang.String r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer r1 = r0.getKeyManagerContainerOrThrow(r1)
            com.google.crypto.tink.KeyManager r1 = r1.getUntypedKeyManager()
            return r1
    }

    boolean isEmpty() {
            r1 = this;
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer> r0 = r1.keyManagerMap
            boolean r0 = r0.isEmpty()
            return r0
    }

    com.google.crypto.tink.shaded.protobuf.MessageLite parseKeyData(com.google.crypto.tink.proto.KeyData r2) throws java.security.GeneralSecurityException, com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            java.lang.String r0 = r2.getTypeUrl()
            com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer r0 = r1.getKeyManagerContainerOrThrow(r0)
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r2.getValue()
            com.google.crypto.tink.shaded.protobuf.MessageLite r2 = r0.parseKey(r2)
            return r2
    }

    synchronized <KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, PublicKeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> void registerAsymmetricKeyManagers(com.google.crypto.tink.internal.PrivateKeyTypeManager<KeyProtoT, PublicKeyProtoT> r7, com.google.crypto.tink.internal.KeyTypeManager<PublicKeyProtoT> r8) throws java.security.GeneralSecurityException {
            r6 = this;
            java.lang.String r0 = "Attempted overwrite of a registered key manager for key type "
            java.lang.String r1 = "failed to register key manager "
            java.lang.String r2 = "failed to register key manager "
            monitor-enter(r6)
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r3 = r7.fipsStatus()     // Catch: java.lang.Throwable -> Le6
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r4 = r8.fipsStatus()     // Catch: java.lang.Throwable -> Le6
            boolean r3 = r3.isCompatible()     // Catch: java.lang.Throwable -> Le6
            if (r3 == 0) goto Lc9
            boolean r2 = r4.isCompatible()     // Catch: java.lang.Throwable -> Le6
            if (r2 == 0) goto Lac
            java.lang.String r1 = r7.getKeyType()     // Catch: java.lang.Throwable -> Le6
            java.lang.String r2 = r8.getKeyType()     // Catch: java.lang.Throwable -> Le6
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer> r3 = r6.keyManagerMap     // Catch: java.lang.Throwable -> Le6
            boolean r3 = r3.containsKey(r1)     // Catch: java.lang.Throwable -> Le6
            if (r3 == 0) goto L9a
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer> r3 = r6.keyManagerMap     // Catch: java.lang.Throwable -> Le6
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> Le6
            com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer r3 = (com.google.crypto.tink.KeyManagerRegistry.KeyManagerContainer) r3     // Catch: java.lang.Throwable -> Le6
            java.lang.Class r3 = r3.publicKeyManagerClassOrNull()     // Catch: java.lang.Throwable -> Le6
            if (r3 == 0) goto L9a
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer> r3 = r6.keyManagerMap     // Catch: java.lang.Throwable -> Le6
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> Le6
            com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer r3 = (com.google.crypto.tink.KeyManagerRegistry.KeyManagerContainer) r3     // Catch: java.lang.Throwable -> Le6
            java.lang.Class r3 = r3.publicKeyManagerClassOrNull()     // Catch: java.lang.Throwable -> Le6
            if (r3 == 0) goto L9a
            java.lang.String r4 = r3.getName()     // Catch: java.lang.Throwable -> Le6
            java.lang.Class r5 = r8.getClass()     // Catch: java.lang.Throwable -> Le6
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> Le6
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> Le6
            if (r4 == 0) goto L5a
            goto L9a
        L5a:
            java.util.logging.Logger r4 = com.google.crypto.tink.KeyManagerRegistry.logger     // Catch: java.lang.Throwable -> Le6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le6
            r5.<init>(r0)     // Catch: java.lang.Throwable -> Le6
            java.lang.StringBuilder r0 = r5.append(r1)     // Catch: java.lang.Throwable -> Le6
            java.lang.String r1 = " with inconsistent public key type "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> Le6
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Throwable -> Le6
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Le6
            r4.warning(r0)     // Catch: java.lang.Throwable -> Le6
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> Le6
            java.lang.String r1 = "public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s"
            java.lang.Class r7 = r7.getClass()     // Catch: java.lang.Throwable -> Le6
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Throwable -> Le6
            java.lang.String r2 = r3.getName()     // Catch: java.lang.Throwable -> Le6
            java.lang.Class r8 = r8.getClass()     // Catch: java.lang.Throwable -> Le6
            java.lang.String r8 = r8.getName()     // Catch: java.lang.Throwable -> Le6
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r2, r8}     // Catch: java.lang.Throwable -> Le6
            java.lang.String r7 = java.lang.String.format(r1, r7)     // Catch: java.lang.Throwable -> Le6
            r0.<init>(r7)     // Catch: java.lang.Throwable -> Le6
            throw r0     // Catch: java.lang.Throwable -> Le6
        L9a:
            com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer r7 = createPrivateKeyContainerFor(r7, r8)     // Catch: java.lang.Throwable -> Le6
            r0 = 1
            r6.registerKeyManagerContainer(r7, r0)     // Catch: java.lang.Throwable -> Le6
            com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer r7 = createContainerFor(r8)     // Catch: java.lang.Throwable -> Le6
            r8 = 0
            r6.registerKeyManagerContainer(r7, r8)     // Catch: java.lang.Throwable -> Le6
            monitor-exit(r6)
            return
        Lac:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> Le6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le6
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Le6
            java.lang.Class r8 = r8.getClass()     // Catch: java.lang.Throwable -> Le6
            java.lang.StringBuilder r8 = r0.append(r8)     // Catch: java.lang.Throwable -> Le6
            java.lang.String r0 = " as it is not FIPS compatible."
            java.lang.StringBuilder r8 = r8.append(r0)     // Catch: java.lang.Throwable -> Le6
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> Le6
            r7.<init>(r8)     // Catch: java.lang.Throwable -> Le6
            throw r7     // Catch: java.lang.Throwable -> Le6
        Lc9:
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> Le6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le6
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Le6
            java.lang.Class r7 = r7.getClass()     // Catch: java.lang.Throwable -> Le6
            java.lang.StringBuilder r7 = r0.append(r7)     // Catch: java.lang.Throwable -> Le6
            java.lang.String r0 = " as it is not FIPS compatible."
            java.lang.StringBuilder r7 = r7.append(r0)     // Catch: java.lang.Throwable -> Le6
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Le6
            r8.<init>(r7)     // Catch: java.lang.Throwable -> Le6
            throw r8     // Catch: java.lang.Throwable -> Le6
        Le6:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Le6
            throw r7
    }

    synchronized <P> void registerKeyManager(com.google.crypto.tink.KeyManager<P> r2) throws java.security.GeneralSecurityException {
            r1 = this;
            monitor-enter(r1)
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.isCompatible()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L13
            com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer r2 = createContainerFor(r2)     // Catch: java.lang.Throwable -> L1b
            r0 = 0
            r1.registerKeyManagerContainer(r2, r0)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r1)
            return
        L13:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = "Registering key managers is not supported in FIPS mode"
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L1b
            throw r2     // Catch: java.lang.Throwable -> L1b
        L1b:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            throw r2
    }

    synchronized <KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> void registerKeyManager(com.google.crypto.tink.internal.KeyTypeManager<KeyProtoT> r4) throws java.security.GeneralSecurityException {
            r3 = this;
            java.lang.String r0 = "failed to register key manager "
            monitor-enter(r3)
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r1 = r4.fipsStatus()     // Catch: java.lang.Throwable -> L34
            boolean r1 = r1.isCompatible()     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L17
            com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer r4 = createContainerFor(r4)     // Catch: java.lang.Throwable -> L34
            r0 = 0
            r3.registerKeyManagerContainer(r4, r0)     // Catch: java.lang.Throwable -> L34
            monitor-exit(r3)
            return
        L17:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L34
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L34
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L34
            java.lang.Class r4 = r4.getClass()     // Catch: java.lang.Throwable -> L34
            java.lang.StringBuilder r4 = r2.append(r4)     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = " as it is not FIPS compatible."
            java.lang.StringBuilder r4 = r4.append(r0)     // Catch: java.lang.Throwable -> L34
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L34
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L34
            throw r1     // Catch: java.lang.Throwable -> L34
        L34:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L34
            throw r4
    }

    boolean typeUrlExists(java.lang.String r2) {
            r1 = this;
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer> r0 = r1.keyManagerMap
            boolean r2 = r0.containsKey(r2)
            return r2
    }
}
