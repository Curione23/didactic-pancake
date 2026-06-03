package com.google.crypto.tink;

/* JADX INFO: loaded from: classes2.dex */
public final class Registry {
    private static final java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.Catalogue<?>> catalogueMap = null;
    private static final java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.Registry.KeyDeriverContainer> keyDeriverMap = null;
    private static final java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.KeyManagerRegistry> keyManagerRegistry = null;
    private static final java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyTemplate> keyTemplateMap = null;
    private static final java.util.logging.Logger logger = null;
    private static final java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> newKeyAllowedMap = null;


    private interface KeyDeriverContainer {
        com.google.crypto.tink.proto.KeyData deriveKey(com.google.crypto.tink.shaded.protobuf.ByteString r1, java.io.InputStream r2) throws java.security.GeneralSecurityException;
    }

    static {
            java.lang.Class<com.google.crypto.tink.Registry> r0 = com.google.crypto.tink.Registry.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.crypto.tink.Registry.logger = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            com.google.crypto.tink.KeyManagerRegistry r1 = new com.google.crypto.tink.KeyManagerRegistry
            r1.<init>()
            r0.<init>(r1)
            com.google.crypto.tink.Registry.keyManagerRegistry = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.google.crypto.tink.Registry.keyDeriverMap = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.google.crypto.tink.Registry.newKeyAllowedMap = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.google.crypto.tink.Registry.catalogueMap = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.google.crypto.tink.Registry.keyTemplateMap = r0
            return
    }

    private Registry() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static synchronized void addCatalogue(java.lang.String r6, com.google.crypto.tink.Catalogue<?> r7) throws java.security.GeneralSecurityException {
            java.lang.String r0 = "catalogue for name "
            java.lang.String r1 = "Attempted overwrite of a catalogueName catalogue for name "
            java.lang.Class<com.google.crypto.tink.Registry> r2 = com.google.crypto.tink.Registry.class
            monitor-enter(r2)
            if (r6 == 0) goto L7a
            if (r7 == 0) goto L72
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.Catalogue<?>> r3 = com.google.crypto.tink.Registry.catalogueMap     // Catch: java.lang.Throwable -> L82
            java.util.Locale r4 = java.util.Locale.US     // Catch: java.lang.Throwable -> L82
            java.lang.String r4 = r6.toLowerCase(r4)     // Catch: java.lang.Throwable -> L82
            boolean r4 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L82
            if (r4 == 0) goto L67
            java.util.Locale r4 = java.util.Locale.US     // Catch: java.lang.Throwable -> L82
            java.lang.String r4 = r6.toLowerCase(r4)     // Catch: java.lang.Throwable -> L82
            java.lang.Object r4 = r3.get(r4)     // Catch: java.lang.Throwable -> L82
            com.google.crypto.tink.Catalogue r4 = (com.google.crypto.tink.Catalogue) r4     // Catch: java.lang.Throwable -> L82
            java.lang.Class r5 = r7.getClass()     // Catch: java.lang.Throwable -> L82
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L82
            java.lang.Class r4 = r4.getClass()     // Catch: java.lang.Throwable -> L82
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L82
            boolean r4 = r5.equals(r4)     // Catch: java.lang.Throwable -> L82
            if (r4 == 0) goto L3c
            goto L67
        L3c:
            java.util.logging.Logger r7 = com.google.crypto.tink.Registry.logger     // Catch: java.lang.Throwable -> L82
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L82
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L82
            java.lang.StringBuilder r1 = r3.append(r6)     // Catch: java.lang.Throwable -> L82
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L82
            r7.warning(r1)     // Catch: java.lang.Throwable -> L82
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L82
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L82
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L82
            java.lang.StringBuilder r6 = r1.append(r6)     // Catch: java.lang.Throwable -> L82
            java.lang.String r0 = " has been already registered"
            java.lang.StringBuilder r6 = r6.append(r0)     // Catch: java.lang.Throwable -> L82
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L82
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L82
            throw r7     // Catch: java.lang.Throwable -> L82
        L67:
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.Throwable -> L82
            java.lang.String r6 = r6.toLowerCase(r0)     // Catch: java.lang.Throwable -> L82
            r3.put(r6, r7)     // Catch: java.lang.Throwable -> L82
            monitor-exit(r2)
            return
        L72:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L82
            java.lang.String r7 = "catalogue must be non-null."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L82
            throw r6     // Catch: java.lang.Throwable -> L82
        L7a:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L82
            java.lang.String r7 = "catalogueName must be non-null."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L82
            throw r6     // Catch: java.lang.Throwable -> L82
        L82:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L82
            throw r6
    }

    private static <KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> com.google.crypto.tink.Registry.KeyDeriverContainer createDeriverFor(com.google.crypto.tink.internal.KeyTypeManager<KeyProtoT> r1) {
            com.google.crypto.tink.Registry$1 r0 = new com.google.crypto.tink.Registry$1
            r0.<init>(r1)
            return r0
    }

    static synchronized com.google.crypto.tink.proto.KeyData deriveKey(com.google.crypto.tink.proto.KeyTemplate r5, java.io.InputStream r6) throws java.security.GeneralSecurityException {
            java.lang.String r0 = "No keymanager registered or key manager cannot derive keys for "
            java.lang.Class<com.google.crypto.tink.Registry> r1 = com.google.crypto.tink.Registry.class
            monitor-enter(r1)
            java.lang.String r2 = r5.getTypeUrl()     // Catch: java.lang.Throwable -> L34
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.Registry$KeyDeriverContainer> r3 = com.google.crypto.tink.Registry.keyDeriverMap     // Catch: java.lang.Throwable -> L34
            boolean r4 = r3.containsKey(r2)     // Catch: java.lang.Throwable -> L34
            if (r4 == 0) goto L21
            java.lang.Object r0 = r3.get(r2)     // Catch: java.lang.Throwable -> L34
            com.google.crypto.tink.Registry$KeyDeriverContainer r0 = (com.google.crypto.tink.Registry.KeyDeriverContainer) r0     // Catch: java.lang.Throwable -> L34
            com.google.crypto.tink.shaded.protobuf.ByteString r5 = r5.getValue()     // Catch: java.lang.Throwable -> L34
            com.google.crypto.tink.proto.KeyData r5 = r0.deriveKey(r5, r6)     // Catch: java.lang.Throwable -> L34
            monitor-exit(r1)
            return r5
        L21:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L34
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L34
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L34
            java.lang.StringBuilder r6 = r6.append(r2)     // Catch: java.lang.Throwable -> L34
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L34
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L34
            throw r5     // Catch: java.lang.Throwable -> L34
        L34:
            r5 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            throw r5
    }

    private static synchronized <KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, KeyFormatProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> void ensureKeyManagerInsertable(java.lang.String r4, java.util.Map<java.lang.String, com.google.crypto.tink.internal.KeyTypeManager.KeyFactory.KeyFormat<KeyFormatProtoT>> r5, boolean r6) throws java.security.GeneralSecurityException {
            java.lang.String r0 = "New keys are already disallowed for key type "
            java.lang.Class<com.google.crypto.tink.Registry> r1 = com.google.crypto.tink.Registry.class
            monitor-enter(r1)
            if (r6 == 0) goto L32
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r2 = com.google.crypto.tink.Registry.newKeyAllowedMap     // Catch: java.lang.Throwable -> L2f
            boolean r3 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L32
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.Throwable -> L2f
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L2f
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L1c
            goto L32
        L1c:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r4 = r6.append(r4)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L2f
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L2f
            throw r5     // Catch: java.lang.Throwable -> L2f
        L2f:
            r4 = move-exception
            goto Lcc
        L32:
            if (r6 == 0) goto Lce
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.KeyManagerRegistry> r6 = com.google.crypto.tink.Registry.keyManagerRegistry     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r6 = r6.get()     // Catch: java.lang.Throwable -> L2f
            com.google.crypto.tink.KeyManagerRegistry r6 = (com.google.crypto.tink.KeyManagerRegistry) r6     // Catch: java.lang.Throwable -> L2f
            boolean r6 = r6.typeUrlExists(r4)     // Catch: java.lang.Throwable -> L2f
            if (r6 == 0) goto L8c
            java.util.Set r5 = r5.entrySet()     // Catch: java.lang.Throwable -> L2f
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L2f
        L4a:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L2f
            if (r6 == 0) goto Lce
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L2f
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch: java.lang.Throwable -> L2f
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyTemplate> r0 = com.google.crypto.tink.Registry.keyTemplateMap     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r2 = r6.getKey()     // Catch: java.lang.Throwable -> L2f
            boolean r0 = r0.containsKey(r2)     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L63
            goto L4a
        L63:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r0.<init>()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = "Attempted to register a new key template "
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r6 = r6.getKey()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r6 = r0.append(r6)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = " from an existing key manager of type "
            java.lang.StringBuilder r6 = r6.append(r0)     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r4 = r6.append(r4)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L2f
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L2f
            throw r5     // Catch: java.lang.Throwable -> L2f
        L8c:
            java.util.Set r4 = r5.entrySet()     // Catch: java.lang.Throwable -> L2f
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L2f
        L94:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L2f
            if (r5 == 0) goto Lce
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L2f
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> L2f
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyTemplate> r6 = com.google.crypto.tink.Registry.keyTemplateMap     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r0 = r5.getKey()     // Catch: java.lang.Throwable -> L2f
            boolean r6 = r6.containsKey(r0)     // Catch: java.lang.Throwable -> L2f
            if (r6 != 0) goto Lad
            goto L94
        Lad:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r6.<init>()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = "Attempted overwrite of a registered key template "
            java.lang.StringBuilder r6 = r6.append(r0)     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r5 = r5.getKey()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r5 = r6.append(r5)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L2f
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L2f
            throw r4     // Catch: java.lang.Throwable -> L2f
        Lcc:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f
            throw r4
        Lce:
            monitor-exit(r1)
            return
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.Catalogue<?> getCatalogue(java.lang.String r3) throws java.security.GeneralSecurityException {
            if (r3 == 0) goto L12b
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.Catalogue<?>> r0 = com.google.crypto.tink.Registry.catalogueMap
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r1 = r3.toLowerCase(r1)
            java.lang.Object r0 = r0.get(r1)
            com.google.crypto.tink.Catalogue r0 = (com.google.crypto.tink.Catalogue) r0
            if (r0 != 0) goto L12a
            java.lang.String r0 = "no catalogue found for %s. "
            java.lang.Object[] r1 = new java.lang.Object[]{r3}
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r1 = r3.toLowerCase(r1)
            java.lang.String r2 = "tinkaead"
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L3d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "Maybe call AeadConfig.register()."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
        L3d:
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r1 = r3.toLowerCase(r1)
            java.lang.String r2 = "tinkdeterministicaead"
            boolean r1 = r1.startsWith(r2)
            if (r1 != 0) goto L111
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r1 = r3.toLowerCase(r1)
            java.lang.String r2 = "tinkstreamingaead"
            boolean r1 = r1.startsWith(r2)
            if (r1 != 0) goto Lfd
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r1 = r3.toLowerCase(r1)
            java.lang.String r2 = "tinkhybriddecrypt"
            boolean r1 = r1.startsWith(r2)
            if (r1 != 0) goto Le9
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r1 = r3.toLowerCase(r1)
            java.lang.String r2 = "tinkhybridencrypt"
            boolean r1 = r1.startsWith(r2)
            if (r1 != 0) goto Le9
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r1 = r3.toLowerCase(r1)
            java.lang.String r2 = "tinkmac"
            boolean r1 = r1.startsWith(r2)
            if (r1 != 0) goto Ld5
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r1 = r3.toLowerCase(r1)
            java.lang.String r2 = "tinkpublickeysign"
            boolean r1 = r1.startsWith(r2)
            if (r1 != 0) goto Lc1
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r1 = r3.toLowerCase(r1)
            java.lang.String r2 = "tinkpublickeyverify"
            boolean r1 = r1.startsWith(r2)
            if (r1 != 0) goto Lc1
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r3 = r3.toLowerCase(r1)
            java.lang.String r1 = "tink"
            boolean r3 = r3.startsWith(r1)
            if (r3 == 0) goto L124
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r0 = "Maybe call TinkConfig.register()."
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r0 = r3.toString()
            goto L124
        Lc1:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r0 = "Maybe call SignatureConfig.register()."
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r0 = r3.toString()
            goto L124
        Ld5:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r0 = "Maybe call MacConfig.register()."
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r0 = r3.toString()
            goto L124
        Le9:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r0 = "Maybe call HybridConfig.register()."
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r0 = r3.toString()
            goto L124
        Lfd:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r0 = "Maybe call StreamingAeadConfig.register()."
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r0 = r3.toString()
            goto L124
        L111:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r0 = "Maybe call DeterministicAeadConfig.register()."
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r0 = r3.toString()
        L124:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            r3.<init>(r0)
            throw r3
        L12a:
            return r0
        L12b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "catalogueName must be non-null."
            r3.<init>(r0)
            throw r3
    }

    static <KeyT extends com.google.crypto.tink.Key, P> P getFullPrimitive(KeyT r1, java.lang.Class<P> r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.internal.MutablePrimitiveRegistry r0 = com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance()
            java.lang.Object r1 = r0.getPrimitive(r1, r2)
            return r1
    }

    @javax.annotation.Nullable
    public static java.lang.Class<?> getInputPrimitive(java.lang.Class<?> r1) {
            com.google.crypto.tink.internal.MutablePrimitiveRegistry r0 = com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance()     // Catch: java.security.GeneralSecurityException -> L9
            java.lang.Class r1 = r0.getInputPrimitiveClass(r1)     // Catch: java.security.GeneralSecurityException -> L9
            return r1
        L9:
            r1 = 0
            return r1
    }

    @java.lang.Deprecated
    public static <P> com.google.crypto.tink.KeyManager<P> getKeyManager(java.lang.String r1) throws java.security.GeneralSecurityException {
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.KeyManagerRegistry> r0 = com.google.crypto.tink.Registry.keyManagerRegistry
            java.lang.Object r0 = r0.get()
            com.google.crypto.tink.KeyManagerRegistry r0 = (com.google.crypto.tink.KeyManagerRegistry) r0
            com.google.crypto.tink.KeyManager r1 = r0.getKeyManager(r1)
            return r1
    }

    public static <P> com.google.crypto.tink.KeyManager<P> getKeyManager(java.lang.String r1, java.lang.Class<P> r2) throws java.security.GeneralSecurityException {
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.KeyManagerRegistry> r0 = com.google.crypto.tink.Registry.keyManagerRegistry
            java.lang.Object r0 = r0.get()
            com.google.crypto.tink.KeyManagerRegistry r0 = (com.google.crypto.tink.KeyManagerRegistry) r0
            com.google.crypto.tink.KeyManager r1 = r0.getKeyManager(r1, r2)
            return r1
    }

    @java.lang.Deprecated
    public static <P> P getPrimitive(com.google.crypto.tink.proto.KeyData r1) throws java.security.GeneralSecurityException {
            java.lang.String r0 = r1.getTypeUrl()
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.getValue()
            java.lang.Object r1 = getPrimitive(r0, r1)
            return r1
    }

    public static <P> P getPrimitive(com.google.crypto.tink.proto.KeyData r1, java.lang.Class<P> r2) throws java.security.GeneralSecurityException {
            java.lang.String r0 = r1.getTypeUrl()
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.getValue()
            java.lang.Object r1 = getPrimitive(r0, r1, r2)
            return r1
    }

    @java.lang.Deprecated
    public static <P> P getPrimitive(java.lang.String r1, com.google.crypto.tink.shaded.protobuf.ByteString r2) throws java.security.GeneralSecurityException {
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.KeyManagerRegistry> r0 = com.google.crypto.tink.Registry.keyManagerRegistry
            java.lang.Object r0 = r0.get()
            com.google.crypto.tink.KeyManagerRegistry r0 = (com.google.crypto.tink.KeyManagerRegistry) r0
            com.google.crypto.tink.KeyManager r1 = r0.getKeyManager(r1)
            java.lang.Object r1 = r1.getPrimitive(r2)
            return r1
    }

    public static <P> P getPrimitive(java.lang.String r1, com.google.crypto.tink.shaded.protobuf.ByteString r2, java.lang.Class<P> r3) throws java.security.GeneralSecurityException {
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.KeyManagerRegistry> r0 = com.google.crypto.tink.Registry.keyManagerRegistry
            java.lang.Object r0 = r0.get()
            com.google.crypto.tink.KeyManagerRegistry r0 = (com.google.crypto.tink.KeyManagerRegistry) r0
            com.google.crypto.tink.KeyManager r1 = r0.getKeyManager(r1, r3)
            java.lang.Object r1 = r1.getPrimitive(r2)
            return r1
    }

    @java.lang.Deprecated
    public static <P> P getPrimitive(java.lang.String r1, com.google.crypto.tink.shaded.protobuf.MessageLite r2) throws java.security.GeneralSecurityException {
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.KeyManagerRegistry> r0 = com.google.crypto.tink.Registry.keyManagerRegistry
            java.lang.Object r0 = r0.get()
            com.google.crypto.tink.KeyManagerRegistry r0 = (com.google.crypto.tink.KeyManagerRegistry) r0
            com.google.crypto.tink.KeyManager r1 = r0.getKeyManager(r1)
            java.lang.Object r1 = r1.getPrimitive(r2)
            return r1
    }

    public static <P> P getPrimitive(java.lang.String r1, com.google.crypto.tink.shaded.protobuf.MessageLite r2, java.lang.Class<P> r3) throws java.security.GeneralSecurityException {
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.KeyManagerRegistry> r0 = com.google.crypto.tink.Registry.keyManagerRegistry
            java.lang.Object r0 = r0.get()
            com.google.crypto.tink.KeyManagerRegistry r0 = (com.google.crypto.tink.KeyManagerRegistry) r0
            com.google.crypto.tink.KeyManager r1 = r0.getKeyManager(r1, r3)
            java.lang.Object r1 = r1.getPrimitive(r2)
            return r1
    }

    @java.lang.Deprecated
    public static <P> P getPrimitive(java.lang.String r0, byte[] r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r1)
            java.lang.Object r0 = getPrimitive(r0, r1)
            return r0
    }

    public static <P> P getPrimitive(java.lang.String r0, byte[] r1, java.lang.Class<P> r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r1)
            java.lang.Object r0 = getPrimitive(r0, r1, r2)
            return r0
    }

    public static com.google.crypto.tink.proto.KeyData getPublicKeyData(java.lang.String r2, com.google.crypto.tink.shaded.protobuf.ByteString r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.KeyManager r0 = getKeyManager(r2)
            boolean r1 = r0 instanceof com.google.crypto.tink.PrivateKeyManager
            if (r1 == 0) goto Lf
            com.google.crypto.tink.PrivateKeyManager r0 = (com.google.crypto.tink.PrivateKeyManager) r0
            com.google.crypto.tink.proto.KeyData r2 = r0.getPublicKeyData(r3)
            return r2
        Lf:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "manager for key type "
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r0 = " is not a PrivateKeyManager"
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    public static com.google.crypto.tink.KeyManager<?> getUntypedKeyManager(java.lang.String r1) throws java.security.GeneralSecurityException {
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.KeyManagerRegistry> r0 = com.google.crypto.tink.Registry.keyManagerRegistry
            java.lang.Object r0 = r0.get()
            com.google.crypto.tink.KeyManagerRegistry r0 = (com.google.crypto.tink.KeyManagerRegistry) r0
            com.google.crypto.tink.KeyManager r1 = r0.getUntypedKeyManager(r1)
            return r1
    }

    static synchronized java.util.Map<java.lang.String, com.google.crypto.tink.KeyTemplate> keyTemplateMap() {
            java.lang.Class<com.google.crypto.tink.Registry> r0 = com.google.crypto.tink.Registry.class
            monitor-enter(r0)
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyTemplate> r1 = com.google.crypto.tink.Registry.keyTemplateMap     // Catch: java.lang.Throwable -> Lb
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    public static synchronized java.util.List<java.lang.String> keyTemplates() {
            java.lang.Class<com.google.crypto.tink.Registry> r0 = com.google.crypto.tink.Registry.class
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L17
            r1.<init>()     // Catch: java.lang.Throwable -> L17
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyTemplate> r2 = com.google.crypto.tink.Registry.keyTemplateMap     // Catch: java.lang.Throwable -> L17
            java.util.Set r2 = r2.keySet()     // Catch: java.lang.Throwable -> L17
            r1.addAll(r2)     // Catch: java.lang.Throwable -> L17
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            return r1
        L17:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1
    }

    public static synchronized com.google.crypto.tink.shaded.protobuf.MessageLite newKey(com.google.crypto.tink.proto.KeyTemplate r5) throws java.security.GeneralSecurityException {
            java.lang.String r0 = "newKey-operation not permitted for key type "
            java.lang.Class<com.google.crypto.tink.Registry> r1 = com.google.crypto.tink.Registry.class
            monitor-enter(r1)
            java.lang.String r2 = r5.getTypeUrl()     // Catch: java.lang.Throwable -> L40
            com.google.crypto.tink.KeyManager r2 = getUntypedKeyManager(r2)     // Catch: java.lang.Throwable -> L40
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r3 = com.google.crypto.tink.Registry.newKeyAllowedMap     // Catch: java.lang.Throwable -> L40
            java.lang.String r4 = r5.getTypeUrl()     // Catch: java.lang.Throwable -> L40
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L40
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L40
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L40
            if (r3 == 0) goto L29
            com.google.crypto.tink.shaded.protobuf.ByteString r5 = r5.getValue()     // Catch: java.lang.Throwable -> L40
            com.google.crypto.tink.shaded.protobuf.MessageLite r5 = r2.newKey(r5)     // Catch: java.lang.Throwable -> L40
            monitor-exit(r1)
            return r5
        L29:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L40
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = r5.getTypeUrl()     // Catch: java.lang.Throwable -> L40
            java.lang.StringBuilder r5 = r3.append(r5)     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L40
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L40
            throw r2     // Catch: java.lang.Throwable -> L40
        L40:
            r5 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L40
            throw r5
    }

    public static synchronized com.google.crypto.tink.shaded.protobuf.MessageLite newKey(java.lang.String r4, com.google.crypto.tink.shaded.protobuf.MessageLite r5) throws java.security.GeneralSecurityException {
            java.lang.String r0 = "newKey-operation not permitted for key type "
            java.lang.Class<com.google.crypto.tink.Registry> r1 = com.google.crypto.tink.Registry.class
            monitor-enter(r1)
            com.google.crypto.tink.KeyManager r2 = getKeyManager(r4)     // Catch: java.lang.Throwable -> L30
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r3 = com.google.crypto.tink.Registry.newKeyAllowedMap     // Catch: java.lang.Throwable -> L30
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L30
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L30
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L1d
            com.google.crypto.tink.shaded.protobuf.MessageLite r4 = r2.newKey(r5)     // Catch: java.lang.Throwable -> L30
            monitor-exit(r1)
            return r4
        L1d:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r4 = r2.append(r4)     // Catch: java.lang.Throwable -> L30
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L30
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L30
            throw r5     // Catch: java.lang.Throwable -> L30
        L30:
            r4 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
            throw r4
    }

    public static synchronized com.google.crypto.tink.proto.KeyData newKeyData(com.google.crypto.tink.KeyTemplate r1) throws java.security.GeneralSecurityException {
            java.lang.Class<com.google.crypto.tink.Registry> r0 = com.google.crypto.tink.Registry.class
            monitor-enter(r0)
            com.google.crypto.tink.proto.KeyTemplate r1 = r1.getProto()     // Catch: java.lang.Throwable -> Ld
            com.google.crypto.tink.proto.KeyData r1 = newKeyData(r1)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return r1
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    public static synchronized com.google.crypto.tink.proto.KeyData newKeyData(com.google.crypto.tink.proto.KeyTemplate r5) throws java.security.GeneralSecurityException {
            java.lang.String r0 = "newKey-operation not permitted for key type "
            java.lang.Class<com.google.crypto.tink.Registry> r1 = com.google.crypto.tink.Registry.class
            monitor-enter(r1)
            java.lang.String r2 = r5.getTypeUrl()     // Catch: java.lang.Throwable -> L40
            com.google.crypto.tink.KeyManager r2 = getUntypedKeyManager(r2)     // Catch: java.lang.Throwable -> L40
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r3 = com.google.crypto.tink.Registry.newKeyAllowedMap     // Catch: java.lang.Throwable -> L40
            java.lang.String r4 = r5.getTypeUrl()     // Catch: java.lang.Throwable -> L40
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L40
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L40
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L40
            if (r3 == 0) goto L29
            com.google.crypto.tink.shaded.protobuf.ByteString r5 = r5.getValue()     // Catch: java.lang.Throwable -> L40
            com.google.crypto.tink.proto.KeyData r5 = r2.newKeyData(r5)     // Catch: java.lang.Throwable -> L40
            monitor-exit(r1)
            return r5
        L29:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L40
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = r5.getTypeUrl()     // Catch: java.lang.Throwable -> L40
            java.lang.StringBuilder r5 = r3.append(r5)     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L40
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L40
            throw r2     // Catch: java.lang.Throwable -> L40
        L40:
            r5 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L40
            throw r5
    }

    static com.google.crypto.tink.shaded.protobuf.MessageLite parseKeyData(com.google.crypto.tink.proto.KeyData r1) throws java.security.GeneralSecurityException, com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.KeyManagerRegistry> r0 = com.google.crypto.tink.Registry.keyManagerRegistry
            java.lang.Object r0 = r0.get()
            com.google.crypto.tink.KeyManagerRegistry r0 = (com.google.crypto.tink.KeyManagerRegistry) r0
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parseKeyData(r1)
            return r1
    }

    public static synchronized <KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, PublicKeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> void registerAsymmetricKeyManagers(com.google.crypto.tink.internal.PrivateKeyTypeManager<KeyProtoT, PublicKeyProtoT> r7, com.google.crypto.tink.internal.KeyTypeManager<PublicKeyProtoT> r8, boolean r9) throws java.security.GeneralSecurityException {
            java.lang.Class<com.google.crypto.tink.Registry> r0 = com.google.crypto.tink.Registry.class
            monitor-enter(r0)
            if (r7 == 0) goto L74
            if (r8 == 0) goto L74
            com.google.crypto.tink.KeyManagerRegistry r1 = new com.google.crypto.tink.KeyManagerRegistry     // Catch: java.lang.Throwable -> L7c
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.KeyManagerRegistry> r2 = com.google.crypto.tink.Registry.keyManagerRegistry     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r3 = r2.get()     // Catch: java.lang.Throwable -> L7c
            com.google.crypto.tink.KeyManagerRegistry r3 = (com.google.crypto.tink.KeyManagerRegistry) r3     // Catch: java.lang.Throwable -> L7c
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L7c
            r1.registerAsymmetricKeyManagers(r7, r8)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r3 = r7.getKeyType()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r8 = r8.getKeyType()     // Catch: java.lang.Throwable -> L7c
            if (r9 == 0) goto L2a
            com.google.crypto.tink.internal.KeyTypeManager$KeyFactory r4 = r7.keyFactory()     // Catch: java.lang.Throwable -> L7c
            java.util.Map r4 = r4.keyFormats()     // Catch: java.lang.Throwable -> L7c
            goto L2e
        L2a:
            java.util.Map r4 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> L7c
        L2e:
            ensureKeyManagerInsertable(r3, r4, r9)     // Catch: java.lang.Throwable -> L7c
            java.util.Map r4 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> L7c
            r5 = 0
            ensureKeyManagerInsertable(r8, r4, r5)     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r4 = r2.get()     // Catch: java.lang.Throwable -> L7c
            com.google.crypto.tink.KeyManagerRegistry r4 = (com.google.crypto.tink.KeyManagerRegistry) r4     // Catch: java.lang.Throwable -> L7c
            boolean r4 = r4.typeUrlExists(r3)     // Catch: java.lang.Throwable -> L7c
            if (r4 != 0) goto L5f
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.Registry$KeyDeriverContainer> r4 = com.google.crypto.tink.Registry.keyDeriverMap     // Catch: java.lang.Throwable -> L7c
            com.google.crypto.tink.Registry$KeyDeriverContainer r6 = createDeriverFor(r7)     // Catch: java.lang.Throwable -> L7c
            r4.put(r3, r6)     // Catch: java.lang.Throwable -> L7c
            if (r9 == 0) goto L5f
            java.lang.String r4 = r7.getKeyType()     // Catch: java.lang.Throwable -> L7c
            com.google.crypto.tink.internal.KeyTypeManager$KeyFactory r7 = r7.keyFactory()     // Catch: java.lang.Throwable -> L7c
            java.util.Map r7 = r7.keyFormats()     // Catch: java.lang.Throwable -> L7c
            registerKeyTemplates(r4, r7)     // Catch: java.lang.Throwable -> L7c
        L5f:
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r7 = com.google.crypto.tink.Registry.newKeyAllowedMap     // Catch: java.lang.Throwable -> L7c
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> L7c
            r7.put(r3, r9)     // Catch: java.lang.Throwable -> L7c
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L7c
            r7.put(r8, r9)     // Catch: java.lang.Throwable -> L7c
            r2.set(r1)     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r0)
            return
        L74:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L7c
            java.lang.String r8 = "given key managers must be non-null."
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L7c
            throw r7     // Catch: java.lang.Throwable -> L7c
        L7c:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7c
            throw r7
    }

    public static synchronized <P> void registerKeyManager(com.google.crypto.tink.KeyManager<P> r2) throws java.security.GeneralSecurityException {
            java.lang.Class<com.google.crypto.tink.Registry> r0 = com.google.crypto.tink.Registry.class
            monitor-enter(r0)
            r1 = 1
            registerKeyManager(r2, r1)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)
            return
        L9:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    public static synchronized <P> void registerKeyManager(com.google.crypto.tink.KeyManager<P> r4, boolean r5) throws java.security.GeneralSecurityException {
            java.lang.Class<com.google.crypto.tink.Registry> r0 = com.google.crypto.tink.Registry.class
            monitor-enter(r0)
            if (r4 == 0) goto L40
            com.google.crypto.tink.KeyManagerRegistry r1 = new com.google.crypto.tink.KeyManagerRegistry     // Catch: java.lang.Throwable -> L3e
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.KeyManagerRegistry> r2 = com.google.crypto.tink.Registry.keyManagerRegistry     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r3 = r2.get()     // Catch: java.lang.Throwable -> L3e
            com.google.crypto.tink.KeyManagerRegistry r3 = (com.google.crypto.tink.KeyManagerRegistry) r3     // Catch: java.lang.Throwable -> L3e
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L3e
            r1.registerKeyManager(r4)     // Catch: java.lang.Throwable -> L3e
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r3 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS     // Catch: java.lang.Throwable -> L3e
            boolean r3 = r3.isCompatible()     // Catch: java.lang.Throwable -> L3e
            if (r3 == 0) goto L36
            java.lang.String r4 = r4.getKeyType()     // Catch: java.lang.Throwable -> L3e
            java.util.Map r3 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> L3e
            ensureKeyManagerInsertable(r4, r3, r5)     // Catch: java.lang.Throwable -> L3e
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r3 = com.google.crypto.tink.Registry.newKeyAllowedMap     // Catch: java.lang.Throwable -> L3e
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L3e
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L3e
            r2.set(r1)     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)
            return
        L36:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L3e
            java.lang.String r5 = "Registering key managers is not supported in FIPS mode"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L3e
            throw r4     // Catch: java.lang.Throwable -> L3e
        L3e:
            r4 = move-exception
            goto L48
        L40:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L3e
            java.lang.String r5 = "key manager must be non-null."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L3e
            throw r4     // Catch: java.lang.Throwable -> L3e
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r4
    }

    public static synchronized <KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> void registerKeyManager(com.google.crypto.tink.internal.KeyTypeManager<KeyProtoT> r6, boolean r7) throws java.security.GeneralSecurityException {
            java.lang.Class<com.google.crypto.tink.Registry> r0 = com.google.crypto.tink.Registry.class
            monitor-enter(r0)
            if (r6 == 0) goto L5d
            com.google.crypto.tink.KeyManagerRegistry r1 = new com.google.crypto.tink.KeyManagerRegistry     // Catch: java.lang.Throwable -> L5b
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.KeyManagerRegistry> r2 = com.google.crypto.tink.Registry.keyManagerRegistry     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r3 = r2.get()     // Catch: java.lang.Throwable -> L5b
            com.google.crypto.tink.KeyManagerRegistry r3 = (com.google.crypto.tink.KeyManagerRegistry) r3     // Catch: java.lang.Throwable -> L5b
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L5b
            r1.registerKeyManager(r6)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r3 = r6.getKeyType()     // Catch: java.lang.Throwable -> L5b
            if (r7 == 0) goto L24
            com.google.crypto.tink.internal.KeyTypeManager$KeyFactory r4 = r6.keyFactory()     // Catch: java.lang.Throwable -> L5b
            java.util.Map r4 = r4.keyFormats()     // Catch: java.lang.Throwable -> L5b
            goto L28
        L24:
            java.util.Map r4 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> L5b
        L28:
            ensureKeyManagerInsertable(r3, r4, r7)     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r4 = r2.get()     // Catch: java.lang.Throwable -> L5b
            com.google.crypto.tink.KeyManagerRegistry r4 = (com.google.crypto.tink.KeyManagerRegistry) r4     // Catch: java.lang.Throwable -> L5b
            boolean r4 = r4.typeUrlExists(r3)     // Catch: java.lang.Throwable -> L5b
            if (r4 != 0) goto L4d
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.Registry$KeyDeriverContainer> r4 = com.google.crypto.tink.Registry.keyDeriverMap     // Catch: java.lang.Throwable -> L5b
            com.google.crypto.tink.Registry$KeyDeriverContainer r5 = createDeriverFor(r6)     // Catch: java.lang.Throwable -> L5b
            r4.put(r3, r5)     // Catch: java.lang.Throwable -> L5b
            if (r7 == 0) goto L4d
            com.google.crypto.tink.internal.KeyTypeManager$KeyFactory r6 = r6.keyFactory()     // Catch: java.lang.Throwable -> L5b
            java.util.Map r6 = r6.keyFormats()     // Catch: java.lang.Throwable -> L5b
            registerKeyTemplates(r3, r6)     // Catch: java.lang.Throwable -> L5b
        L4d:
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r6 = com.google.crypto.tink.Registry.newKeyAllowedMap     // Catch: java.lang.Throwable -> L5b
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L5b
            r6.put(r3, r7)     // Catch: java.lang.Throwable -> L5b
            r2.set(r1)     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r0)
            return
        L5b:
            r6 = move-exception
            goto L65
        L5d:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L5b
            java.lang.String r7 = "key manager must be non-null."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L5b
            throw r6     // Catch: java.lang.Throwable -> L5b
        L65:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            throw r6
    }

    @java.lang.Deprecated
    public static synchronized <P> void registerKeyManager(java.lang.String r2, com.google.crypto.tink.KeyManager<P> r3) throws java.security.GeneralSecurityException {
            java.lang.Class<com.google.crypto.tink.Registry> r0 = com.google.crypto.tink.Registry.class
            monitor-enter(r0)
            r1 = 1
            registerKeyManager(r2, r3, r1)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)
            return
        L9:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    @java.lang.Deprecated
    public static synchronized <P> void registerKeyManager(java.lang.String r3, com.google.crypto.tink.KeyManager<P> r4, boolean r5) throws java.security.GeneralSecurityException {
            java.lang.String r0 = "Manager does not support key type "
            java.lang.Class<com.google.crypto.tink.Registry> r1 = com.google.crypto.tink.Registry.class
            monitor-enter(r1)
            if (r4 == 0) goto L31
            java.lang.String r2 = r4.getKeyType()     // Catch: java.lang.Throwable -> L2f
            boolean r2 = r3.equals(r2)     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L16
            registerKeyManager(r4, r5)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r1)
            return
        L16:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r3 = r5.append(r3)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r5 = "."
            java.lang.StringBuilder r3 = r3.append(r5)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2f
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L2f
            throw r4     // Catch: java.lang.Throwable -> L2f
        L2f:
            r3 = move-exception
            goto L39
        L31:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = "key manager must be non-null."
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L2f
            throw r3     // Catch: java.lang.Throwable -> L2f
        L39:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f
            throw r3
    }

    private static <KeyFormatProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> void registerKeyTemplates(java.lang.String r4, java.util.Map<java.lang.String, com.google.crypto.tink.internal.KeyTypeManager.KeyFactory.KeyFormat<KeyFormatProtoT>> r5) {
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L8:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L3a
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyTemplate> r1 = com.google.crypto.tink.Registry.keyTemplateMap
            java.lang.Object r2 = r0.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r0.getValue()
            com.google.crypto.tink.internal.KeyTypeManager$KeyFactory$KeyFormat r3 = (com.google.crypto.tink.internal.KeyTypeManager.KeyFactory.KeyFormat) r3
            KeyFormatProtoT r3 = r3.keyFormat
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r3
            byte[] r3 = r3.toByteArray()
            java.lang.Object r0 = r0.getValue()
            com.google.crypto.tink.internal.KeyTypeManager$KeyFactory$KeyFormat r0 = (com.google.crypto.tink.internal.KeyTypeManager.KeyFactory.KeyFormat) r0
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r0 = r0.outputPrefixType
            com.google.crypto.tink.KeyTemplate r0 = com.google.crypto.tink.KeyTemplate.create(r4, r3, r0)
            r1.put(r2, r0)
            goto L8
        L3a:
            return
    }

    public static synchronized <B, P> void registerPrimitiveWrapper(com.google.crypto.tink.PrimitiveWrapper<B, P> r2) throws java.security.GeneralSecurityException {
            java.lang.Class<com.google.crypto.tink.Registry> r0 = com.google.crypto.tink.Registry.class
            monitor-enter(r0)
            com.google.crypto.tink.internal.MutablePrimitiveRegistry r1 = com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance()     // Catch: java.lang.Throwable -> Lc
            r1.registerPrimitiveWrapper(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)
            return
        Lc:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r2
    }

    static synchronized void reset() {
            java.lang.Class<com.google.crypto.tink.Registry> r0 = com.google.crypto.tink.Registry.class
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.KeyManagerRegistry> r1 = com.google.crypto.tink.Registry.keyManagerRegistry     // Catch: java.lang.Throwable -> L26
            com.google.crypto.tink.KeyManagerRegistry r2 = new com.google.crypto.tink.KeyManagerRegistry     // Catch: java.lang.Throwable -> L26
            r2.<init>()     // Catch: java.lang.Throwable -> L26
            r1.set(r2)     // Catch: java.lang.Throwable -> L26
            com.google.crypto.tink.internal.MutablePrimitiveRegistry.resetGlobalInstanceTestOnly()     // Catch: java.lang.Throwable -> L26
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.Registry$KeyDeriverContainer> r1 = com.google.crypto.tink.Registry.keyDeriverMap     // Catch: java.lang.Throwable -> L26
            r1.clear()     // Catch: java.lang.Throwable -> L26
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r1 = com.google.crypto.tink.Registry.newKeyAllowedMap     // Catch: java.lang.Throwable -> L26
            r1.clear()     // Catch: java.lang.Throwable -> L26
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.Catalogue<?>> r1 = com.google.crypto.tink.Registry.catalogueMap     // Catch: java.lang.Throwable -> L26
            r1.clear()     // Catch: java.lang.Throwable -> L26
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyTemplate> r1 = com.google.crypto.tink.Registry.keyTemplateMap     // Catch: java.lang.Throwable -> L26
            r1.clear()     // Catch: java.lang.Throwable -> L26
            monitor-exit(r0)
            return
        L26:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r1
    }

    public static synchronized void restrictToFipsIfEmpty() throws java.security.GeneralSecurityException {
            java.lang.Class<com.google.crypto.tink.Registry> r0 = com.google.crypto.tink.Registry.class
            monitor-enter(r0)
            boolean r1 = com.google.crypto.tink.config.internal.TinkFipsUtil.useOnlyFips()     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto Lb
            monitor-exit(r0)
            return
        Lb:
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.KeyManagerRegistry> r1 = com.google.crypto.tink.Registry.keyManagerRegistry     // Catch: java.lang.Throwable -> L26
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L26
            com.google.crypto.tink.KeyManagerRegistry r1 = (com.google.crypto.tink.KeyManagerRegistry) r1     // Catch: java.lang.Throwable -> L26
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L1e
            com.google.crypto.tink.config.internal.TinkFipsUtil.setFipsRestricted()     // Catch: java.lang.Throwable -> L26
            monitor-exit(r0)
            return
        L1e:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = "Could not enable FIPS mode as Registry is not empty."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L26
            throw r1     // Catch: java.lang.Throwable -> L26
        L26:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r1
    }

    public static <P> P wrap(com.google.crypto.tink.PrimitiveSet<P> r1) throws java.security.GeneralSecurityException {
            java.lang.Class r0 = r1.getPrimitiveClass()
            java.lang.Object r1 = wrap(r1, r0)
            return r1
    }

    public static <B, P> P wrap(com.google.crypto.tink.PrimitiveSet<B> r1, java.lang.Class<P> r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.internal.MutablePrimitiveRegistry r0 = com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance()
            java.lang.Object r1 = r0.wrap(r1, r2)
            return r1
    }
}
