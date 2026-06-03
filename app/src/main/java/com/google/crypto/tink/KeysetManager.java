package com.google.crypto.tink;

/* JADX INFO: loaded from: classes2.dex */
public final class KeysetManager {
    private final com.google.crypto.tink.proto.Keyset.Builder keysetBuilder;

    private KeysetManager(com.google.crypto.tink.proto.Keyset.Builder r1) {
            r0 = this;
            r0.<init>()
            r0.keysetBuilder = r1
            return
    }

    private synchronized com.google.crypto.tink.proto.Keyset.Key createKeysetKey(com.google.crypto.tink.proto.KeyData r3, com.google.crypto.tink.proto.OutputPrefixType r4) throws java.security.GeneralSecurityException {
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.newKeyId()     // Catch: java.lang.Throwable -> L2f
            com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.UNKNOWN_PREFIX     // Catch: java.lang.Throwable -> L2f
            if (r4 == r1) goto L27
            com.google.crypto.tink.proto.Keyset$Key$Builder r1 = com.google.crypto.tink.proto.Keyset.Key.newBuilder()     // Catch: java.lang.Throwable -> L2f
            com.google.crypto.tink.proto.Keyset$Key$Builder r3 = r1.setKeyData(r3)     // Catch: java.lang.Throwable -> L2f
            com.google.crypto.tink.proto.Keyset$Key$Builder r3 = r3.setKeyId(r0)     // Catch: java.lang.Throwable -> L2f
            com.google.crypto.tink.proto.KeyStatusType r0 = com.google.crypto.tink.proto.KeyStatusType.ENABLED     // Catch: java.lang.Throwable -> L2f
            com.google.crypto.tink.proto.Keyset$Key$Builder r3 = r3.setStatus(r0)     // Catch: java.lang.Throwable -> L2f
            com.google.crypto.tink.proto.Keyset$Key$Builder r3 = r3.setOutputPrefixType(r4)     // Catch: java.lang.Throwable -> L2f
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.build()     // Catch: java.lang.Throwable -> L2f
            com.google.crypto.tink.proto.Keyset$Key r3 = (com.google.crypto.tink.proto.Keyset.Key) r3     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r2)
            return r3
        L27:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = "unknown output prefix type"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L2f
            throw r3     // Catch: java.lang.Throwable -> L2f
        L2f:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            throw r3
    }

    private synchronized boolean keyIdExists(int r3) {
            r2 = this;
            monitor-enter(r2)
            com.google.crypto.tink.proto.Keyset$Builder r0 = r2.keysetBuilder     // Catch: java.lang.Throwable -> L23
            java.util.List r0 = r0.getKeyList()     // Catch: java.lang.Throwable -> L23
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L23
        Lb:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L23
            com.google.crypto.tink.proto.Keyset$Key r1 = (com.google.crypto.tink.proto.Keyset.Key) r1     // Catch: java.lang.Throwable -> L23
            int r1 = r1.getKeyId()     // Catch: java.lang.Throwable -> L23
            if (r1 != r3) goto Lb
            monitor-exit(r2)
            r3 = 1
            return r3
        L20:
            monitor-exit(r2)
            r3 = 0
            return r3
        L23:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L23
            throw r3
    }

    private synchronized com.google.crypto.tink.proto.Keyset.Key newKey(com.google.crypto.tink.proto.KeyTemplate r2) throws java.security.GeneralSecurityException {
            r1 = this;
            monitor-enter(r1)
            com.google.crypto.tink.proto.KeyData r0 = com.google.crypto.tink.Registry.newKeyData(r2)     // Catch: java.lang.Throwable -> Lf
            com.google.crypto.tink.proto.OutputPrefixType r2 = r2.getOutputPrefixType()     // Catch: java.lang.Throwable -> Lf
            com.google.crypto.tink.proto.Keyset$Key r2 = r1.createKeysetKey(r0, r2)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return r2
        Lf:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    private synchronized int newKeyId() {
            r2 = this;
            monitor-enter(r2)
            int r0 = com.google.crypto.tink.internal.Util.randKeyId()     // Catch: java.lang.Throwable -> L12
        L5:
            boolean r1 = r2.keyIdExists(r0)     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L10
            int r0 = com.google.crypto.tink.internal.Util.randKeyId()     // Catch: java.lang.Throwable -> L12
            goto L5
        L10:
            monitor-exit(r2)
            return r0
        L12:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r0
    }

    public static com.google.crypto.tink.KeysetManager withEmptyKeyset() {
            com.google.crypto.tink.KeysetManager r0 = new com.google.crypto.tink.KeysetManager
            com.google.crypto.tink.proto.Keyset$Builder r1 = com.google.crypto.tink.proto.Keyset.newBuilder()
            r0.<init>(r1)
            return r0
    }

    public static com.google.crypto.tink.KeysetManager withKeysetHandle(com.google.crypto.tink.KeysetHandle r1) {
            com.google.crypto.tink.KeysetManager r0 = new com.google.crypto.tink.KeysetManager
            com.google.crypto.tink.proto.Keyset r1 = r1.getKeyset()
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = r1.toBuilder()
            com.google.crypto.tink.proto.Keyset$Builder r1 = (com.google.crypto.tink.proto.Keyset.Builder) r1
            r0.<init>(r1)
            return r0
    }

    public synchronized com.google.crypto.tink.KeysetManager add(com.google.crypto.tink.KeyTemplate r2) throws java.security.GeneralSecurityException {
            r1 = this;
            monitor-enter(r1)
            com.google.crypto.tink.proto.KeyTemplate r2 = r2.getProto()     // Catch: java.lang.Throwable -> Lb
            r0 = 0
            r1.addNewKey(r2, r0)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return r1
        Lb:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    @java.lang.Deprecated
    public synchronized com.google.crypto.tink.KeysetManager add(com.google.crypto.tink.proto.KeyTemplate r2) throws java.security.GeneralSecurityException {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.addNewKey(r2, r0)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return r1
        L7:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    public synchronized com.google.crypto.tink.KeysetManager add(com.google.crypto.tink.tinkkey.KeyHandle r5) throws java.security.GeneralSecurityException {
            r4 = this;
            monitor-enter(r4)
            com.google.crypto.tink.tinkkey.KeyAccess r0 = com.google.crypto.tink.tinkkey.SecretKeyAccess.insecureSecretAccess()     // Catch: java.lang.Throwable -> L56 java.lang.ClassCastException -> L58
            com.google.crypto.tink.tinkkey.TinkKey r0 = r5.getKey(r0)     // Catch: java.lang.Throwable -> L56 java.lang.ClassCastException -> L58
            com.google.crypto.tink.tinkkey.internal.ProtoKey r0 = (com.google.crypto.tink.tinkkey.internal.ProtoKey) r0     // Catch: java.lang.Throwable -> L56 java.lang.ClassCastException -> L58
            int r1 = r5.getId()     // Catch: java.lang.Throwable -> L56
            boolean r1 = r4.keyIdExists(r1)     // Catch: java.lang.Throwable -> L56
            if (r1 != 0) goto L4e
            com.google.crypto.tink.proto.Keyset$Builder r1 = r4.keysetBuilder     // Catch: java.lang.Throwable -> L56
            com.google.crypto.tink.proto.Keyset$Key$Builder r2 = com.google.crypto.tink.proto.Keyset.Key.newBuilder()     // Catch: java.lang.Throwable -> L56
            com.google.crypto.tink.proto.KeyData r3 = r0.getProtoKey()     // Catch: java.lang.Throwable -> L56
            com.google.crypto.tink.proto.Keyset$Key$Builder r2 = r2.setKeyData(r3)     // Catch: java.lang.Throwable -> L56
            int r3 = r5.getId()     // Catch: java.lang.Throwable -> L56
            com.google.crypto.tink.proto.Keyset$Key$Builder r2 = r2.setKeyId(r3)     // Catch: java.lang.Throwable -> L56
            com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType r5 = r5.getStatus()     // Catch: java.lang.Throwable -> L56
            com.google.crypto.tink.proto.KeyStatusType r5 = com.google.crypto.tink.internal.KeyStatusTypeProtoConverter.toProto(r5)     // Catch: java.lang.Throwable -> L56
            com.google.crypto.tink.proto.Keyset$Key$Builder r5 = r2.setStatus(r5)     // Catch: java.lang.Throwable -> L56
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r0 = r0.getOutputPrefixType()     // Catch: java.lang.Throwable -> L56
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.KeyTemplate.toProto(r0)     // Catch: java.lang.Throwable -> L56
            com.google.crypto.tink.proto.Keyset$Key$Builder r5 = r5.setOutputPrefixType(r0)     // Catch: java.lang.Throwable -> L56
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r5 = r5.build()     // Catch: java.lang.Throwable -> L56
            com.google.crypto.tink.proto.Keyset$Key r5 = (com.google.crypto.tink.proto.Keyset.Key) r5     // Catch: java.lang.Throwable -> L56
            r1.addKey(r5)     // Catch: java.lang.Throwable -> L56
            monitor-exit(r4)
            return r4
        L4e:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L56
            java.lang.String r0 = "Trying to add a key with an ID already contained in the keyset."
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L56
            throw r5     // Catch: java.lang.Throwable -> L56
        L56:
            r5 = move-exception
            goto L61
        L58:
            r5 = move-exception
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch: java.lang.Throwable -> L56
            java.lang.String r1 = "KeyHandles which contain TinkKeys that are not ProtoKeys are not yet supported."
            r0.<init>(r1, r5)     // Catch: java.lang.Throwable -> L56
            throw r0     // Catch: java.lang.Throwable -> L56
        L61:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L56
            throw r5
    }

    public synchronized com.google.crypto.tink.KeysetManager add(com.google.crypto.tink.tinkkey.KeyHandle r1, com.google.crypto.tink.tinkkey.KeyAccess r2) throws java.security.GeneralSecurityException {
            r0 = this;
            monitor-enter(r0)
            com.google.crypto.tink.KeysetManager r1 = r0.add(r1)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @java.lang.Deprecated
    public synchronized int addNewKey(com.google.crypto.tink.proto.KeyTemplate r2, boolean r3) throws java.security.GeneralSecurityException {
            r1 = this;
            monitor-enter(r1)
            com.google.crypto.tink.proto.Keyset$Key r2 = r1.newKey(r2)     // Catch: java.lang.Throwable -> L1b
            com.google.crypto.tink.proto.Keyset$Builder r0 = r1.keysetBuilder     // Catch: java.lang.Throwable -> L1b
            r0.addKey(r2)     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto L15
            com.google.crypto.tink.proto.Keyset$Builder r3 = r1.keysetBuilder     // Catch: java.lang.Throwable -> L1b
            int r0 = r2.getKeyId()     // Catch: java.lang.Throwable -> L1b
            r3.setPrimaryKeyId(r0)     // Catch: java.lang.Throwable -> L1b
        L15:
            int r2 = r2.getKeyId()     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r1)
            return r2
        L1b:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            throw r2
    }

    public synchronized com.google.crypto.tink.KeysetManager delete(int r4) throws java.security.GeneralSecurityException {
            r3 = this;
            monitor-enter(r3)
            com.google.crypto.tink.proto.Keyset$Builder r0 = r3.keysetBuilder     // Catch: java.lang.Throwable -> L49
            int r0 = r0.getPrimaryKeyId()     // Catch: java.lang.Throwable -> L49
            if (r4 == r0) goto L41
            r0 = 0
        La:
            com.google.crypto.tink.proto.Keyset$Builder r1 = r3.keysetBuilder     // Catch: java.lang.Throwable -> L49
            int r1 = r1.getKeyCount()     // Catch: java.lang.Throwable -> L49
            if (r0 >= r1) goto L28
            com.google.crypto.tink.proto.Keyset$Builder r1 = r3.keysetBuilder     // Catch: java.lang.Throwable -> L49
            com.google.crypto.tink.proto.Keyset$Key r1 = r1.getKey(r0)     // Catch: java.lang.Throwable -> L49
            int r1 = r1.getKeyId()     // Catch: java.lang.Throwable -> L49
            if (r1 != r4) goto L25
            com.google.crypto.tink.proto.Keyset$Builder r4 = r3.keysetBuilder     // Catch: java.lang.Throwable -> L49
            r4.removeKey(r0)     // Catch: java.lang.Throwable -> L49
            monitor-exit(r3)
            return r3
        L25:
            int r0 = r0 + 1
            goto La
        L28:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r1.<init>()     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = "key not found: "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r4 = r1.append(r4)     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L49
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L49
            throw r0     // Catch: java.lang.Throwable -> L49
        L41:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = "cannot delete the primary key"
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L49
            throw r4     // Catch: java.lang.Throwable -> L49
        L49:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L49
            throw r4
    }

    public synchronized com.google.crypto.tink.KeysetManager destroy(int r5) throws java.security.GeneralSecurityException {
            r4 = this;
            monitor-enter(r4)
            com.google.crypto.tink.proto.Keyset$Builder r0 = r4.keysetBuilder     // Catch: java.lang.Throwable -> L91
            int r0 = r0.getPrimaryKeyId()     // Catch: java.lang.Throwable -> L91
            if (r5 == r0) goto L89
            r0 = 0
        La:
            com.google.crypto.tink.proto.Keyset$Builder r1 = r4.keysetBuilder     // Catch: java.lang.Throwable -> L91
            int r1 = r1.getKeyCount()     // Catch: java.lang.Throwable -> L91
            if (r0 >= r1) goto L70
            com.google.crypto.tink.proto.Keyset$Builder r1 = r4.keysetBuilder     // Catch: java.lang.Throwable -> L91
            com.google.crypto.tink.proto.Keyset$Key r1 = r1.getKey(r0)     // Catch: java.lang.Throwable -> L91
            int r2 = r1.getKeyId()     // Catch: java.lang.Throwable -> L91
            if (r2 != r5) goto L6d
            com.google.crypto.tink.proto.KeyStatusType r2 = r1.getStatus()     // Catch: java.lang.Throwable -> L91
            com.google.crypto.tink.proto.KeyStatusType r3 = com.google.crypto.tink.proto.KeyStatusType.ENABLED     // Catch: java.lang.Throwable -> L91
            if (r2 == r3) goto L50
            com.google.crypto.tink.proto.KeyStatusType r2 = r1.getStatus()     // Catch: java.lang.Throwable -> L91
            com.google.crypto.tink.proto.KeyStatusType r3 = com.google.crypto.tink.proto.KeyStatusType.DISABLED     // Catch: java.lang.Throwable -> L91
            if (r2 == r3) goto L50
            com.google.crypto.tink.proto.KeyStatusType r2 = r1.getStatus()     // Catch: java.lang.Throwable -> L91
            com.google.crypto.tink.proto.KeyStatusType r3 = com.google.crypto.tink.proto.KeyStatusType.DESTROYED     // Catch: java.lang.Throwable -> L91
            if (r2 != r3) goto L37
            goto L50
        L37:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L91
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L91
            r1.<init>()     // Catch: java.lang.Throwable -> L91
            java.lang.String r2 = "cannot destroy key with id "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L91
            java.lang.StringBuilder r5 = r1.append(r5)     // Catch: java.lang.Throwable -> L91
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L91
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L91
            throw r0     // Catch: java.lang.Throwable -> L91
        L50:
            com.google.crypto.tink.proto.Keyset$Builder r5 = r4.keysetBuilder     // Catch: java.lang.Throwable -> L91
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = r1.toBuilder()     // Catch: java.lang.Throwable -> L91
            com.google.crypto.tink.proto.Keyset$Key$Builder r1 = (com.google.crypto.tink.proto.Keyset.Key.Builder) r1     // Catch: java.lang.Throwable -> L91
            com.google.crypto.tink.proto.KeyStatusType r2 = com.google.crypto.tink.proto.KeyStatusType.DESTROYED     // Catch: java.lang.Throwable -> L91
            com.google.crypto.tink.proto.Keyset$Key$Builder r1 = r1.setStatus(r2)     // Catch: java.lang.Throwable -> L91
            com.google.crypto.tink.proto.Keyset$Key$Builder r1 = r1.clearKeyData()     // Catch: java.lang.Throwable -> L91
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()     // Catch: java.lang.Throwable -> L91
            com.google.crypto.tink.proto.Keyset$Key r1 = (com.google.crypto.tink.proto.Keyset.Key) r1     // Catch: java.lang.Throwable -> L91
            r5.setKey(r0, r1)     // Catch: java.lang.Throwable -> L91
            monitor-exit(r4)
            return r4
        L6d:
            int r0 = r0 + 1
            goto La
        L70:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L91
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L91
            r1.<init>()     // Catch: java.lang.Throwable -> L91
            java.lang.String r2 = "key not found: "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L91
            java.lang.StringBuilder r5 = r1.append(r5)     // Catch: java.lang.Throwable -> L91
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L91
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L91
            throw r0     // Catch: java.lang.Throwable -> L91
        L89:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L91
            java.lang.String r0 = "cannot destroy the primary key"
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L91
            throw r5     // Catch: java.lang.Throwable -> L91
        L91:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L91
            throw r5
    }

    public synchronized com.google.crypto.tink.KeysetManager disable(int r5) throws java.security.GeneralSecurityException {
            r4 = this;
            monitor-enter(r4)
            com.google.crypto.tink.proto.Keyset$Builder r0 = r4.keysetBuilder     // Catch: java.lang.Throwable -> L85
            int r0 = r0.getPrimaryKeyId()     // Catch: java.lang.Throwable -> L85
            if (r5 == r0) goto L7d
            r0 = 0
        La:
            com.google.crypto.tink.proto.Keyset$Builder r1 = r4.keysetBuilder     // Catch: java.lang.Throwable -> L85
            int r1 = r1.getKeyCount()     // Catch: java.lang.Throwable -> L85
            if (r0 >= r1) goto L64
            com.google.crypto.tink.proto.Keyset$Builder r1 = r4.keysetBuilder     // Catch: java.lang.Throwable -> L85
            com.google.crypto.tink.proto.Keyset$Key r1 = r1.getKey(r0)     // Catch: java.lang.Throwable -> L85
            int r2 = r1.getKeyId()     // Catch: java.lang.Throwable -> L85
            if (r2 != r5) goto L61
            com.google.crypto.tink.proto.KeyStatusType r2 = r1.getStatus()     // Catch: java.lang.Throwable -> L85
            com.google.crypto.tink.proto.KeyStatusType r3 = com.google.crypto.tink.proto.KeyStatusType.ENABLED     // Catch: java.lang.Throwable -> L85
            if (r2 == r3) goto L48
            com.google.crypto.tink.proto.KeyStatusType r2 = r1.getStatus()     // Catch: java.lang.Throwable -> L85
            com.google.crypto.tink.proto.KeyStatusType r3 = com.google.crypto.tink.proto.KeyStatusType.DISABLED     // Catch: java.lang.Throwable -> L85
            if (r2 != r3) goto L2f
            goto L48
        L2f:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L85
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85
            r1.<init>()     // Catch: java.lang.Throwable -> L85
            java.lang.String r2 = "cannot disable key with id "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L85
            java.lang.StringBuilder r5 = r1.append(r5)     // Catch: java.lang.Throwable -> L85
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L85
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L85
            throw r0     // Catch: java.lang.Throwable -> L85
        L48:
            com.google.crypto.tink.proto.Keyset$Builder r5 = r4.keysetBuilder     // Catch: java.lang.Throwable -> L85
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = r1.toBuilder()     // Catch: java.lang.Throwable -> L85
            com.google.crypto.tink.proto.Keyset$Key$Builder r1 = (com.google.crypto.tink.proto.Keyset.Key.Builder) r1     // Catch: java.lang.Throwable -> L85
            com.google.crypto.tink.proto.KeyStatusType r2 = com.google.crypto.tink.proto.KeyStatusType.DISABLED     // Catch: java.lang.Throwable -> L85
            com.google.crypto.tink.proto.Keyset$Key$Builder r1 = r1.setStatus(r2)     // Catch: java.lang.Throwable -> L85
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()     // Catch: java.lang.Throwable -> L85
            com.google.crypto.tink.proto.Keyset$Key r1 = (com.google.crypto.tink.proto.Keyset.Key) r1     // Catch: java.lang.Throwable -> L85
            r5.setKey(r0, r1)     // Catch: java.lang.Throwable -> L85
            monitor-exit(r4)
            return r4
        L61:
            int r0 = r0 + 1
            goto La
        L64:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L85
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85
            r1.<init>()     // Catch: java.lang.Throwable -> L85
            java.lang.String r2 = "key not found: "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L85
            java.lang.StringBuilder r5 = r1.append(r5)     // Catch: java.lang.Throwable -> L85
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L85
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L85
            throw r0     // Catch: java.lang.Throwable -> L85
        L7d:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L85
            java.lang.String r0 = "cannot disable the primary key"
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L85
            throw r5     // Catch: java.lang.Throwable -> L85
        L85:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L85
            throw r5
    }

    public synchronized com.google.crypto.tink.KeysetManager enable(int r5) throws java.security.GeneralSecurityException {
            r4 = this;
            monitor-enter(r4)
            r0 = 0
        L2:
            com.google.crypto.tink.proto.Keyset$Builder r1 = r4.keysetBuilder     // Catch: java.lang.Throwable -> L75
            int r1 = r1.getKeyCount()     // Catch: java.lang.Throwable -> L75
            if (r0 >= r1) goto L5c
            com.google.crypto.tink.proto.Keyset$Builder r1 = r4.keysetBuilder     // Catch: java.lang.Throwable -> L75
            com.google.crypto.tink.proto.Keyset$Key r1 = r1.getKey(r0)     // Catch: java.lang.Throwable -> L75
            int r2 = r1.getKeyId()     // Catch: java.lang.Throwable -> L75
            if (r2 != r5) goto L59
            com.google.crypto.tink.proto.KeyStatusType r2 = r1.getStatus()     // Catch: java.lang.Throwable -> L75
            com.google.crypto.tink.proto.KeyStatusType r3 = com.google.crypto.tink.proto.KeyStatusType.ENABLED     // Catch: java.lang.Throwable -> L75
            if (r2 == r3) goto L40
            com.google.crypto.tink.proto.KeyStatusType r2 = r1.getStatus()     // Catch: java.lang.Throwable -> L75
            com.google.crypto.tink.proto.KeyStatusType r3 = com.google.crypto.tink.proto.KeyStatusType.DISABLED     // Catch: java.lang.Throwable -> L75
            if (r2 != r3) goto L27
            goto L40
        L27:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L75
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75
            r1.<init>()     // Catch: java.lang.Throwable -> L75
            java.lang.String r2 = "cannot enable key with id "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L75
            java.lang.StringBuilder r5 = r1.append(r5)     // Catch: java.lang.Throwable -> L75
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L75
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L75
            throw r0     // Catch: java.lang.Throwable -> L75
        L40:
            com.google.crypto.tink.proto.Keyset$Builder r5 = r4.keysetBuilder     // Catch: java.lang.Throwable -> L75
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = r1.toBuilder()     // Catch: java.lang.Throwable -> L75
            com.google.crypto.tink.proto.Keyset$Key$Builder r1 = (com.google.crypto.tink.proto.Keyset.Key.Builder) r1     // Catch: java.lang.Throwable -> L75
            com.google.crypto.tink.proto.KeyStatusType r2 = com.google.crypto.tink.proto.KeyStatusType.ENABLED     // Catch: java.lang.Throwable -> L75
            com.google.crypto.tink.proto.Keyset$Key$Builder r1 = r1.setStatus(r2)     // Catch: java.lang.Throwable -> L75
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()     // Catch: java.lang.Throwable -> L75
            com.google.crypto.tink.proto.Keyset$Key r1 = (com.google.crypto.tink.proto.Keyset.Key) r1     // Catch: java.lang.Throwable -> L75
            r5.setKey(r0, r1)     // Catch: java.lang.Throwable -> L75
            monitor-exit(r4)
            return r4
        L59:
            int r0 = r0 + 1
            goto L2
        L5c:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L75
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75
            r1.<init>()     // Catch: java.lang.Throwable -> L75
            java.lang.String r2 = "key not found: "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L75
            java.lang.StringBuilder r5 = r1.append(r5)     // Catch: java.lang.Throwable -> L75
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L75
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L75
            throw r0     // Catch: java.lang.Throwable -> L75
        L75:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L75
            throw r5
    }

    public synchronized com.google.crypto.tink.KeysetHandle getKeysetHandle() throws java.security.GeneralSecurityException {
            r1 = this;
            monitor-enter(r1)
            com.google.crypto.tink.proto.Keyset$Builder r0 = r1.keysetBuilder     // Catch: java.lang.Throwable -> Lf
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()     // Catch: java.lang.Throwable -> Lf
            com.google.crypto.tink.proto.Keyset r0 = (com.google.crypto.tink.proto.Keyset) r0     // Catch: java.lang.Throwable -> Lf
            com.google.crypto.tink.KeysetHandle r0 = com.google.crypto.tink.KeysetHandle.fromKeyset(r0)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return r0
        Lf:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    @java.lang.Deprecated
    public synchronized com.google.crypto.tink.KeysetManager promote(int r1) throws java.security.GeneralSecurityException {
            r0 = this;
            monitor-enter(r0)
            com.google.crypto.tink.KeysetManager r1 = r0.setPrimary(r1)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @java.lang.Deprecated
    public synchronized com.google.crypto.tink.KeysetManager rotate(com.google.crypto.tink.proto.KeyTemplate r2) throws java.security.GeneralSecurityException {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.addNewKey(r2, r0)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return r1
        L7:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    public synchronized com.google.crypto.tink.KeysetManager setPrimary(int r4) throws java.security.GeneralSecurityException {
            r3 = this;
            monitor-enter(r3)
            r0 = 0
        L2:
            com.google.crypto.tink.proto.Keyset$Builder r1 = r3.keysetBuilder     // Catch: java.lang.Throwable -> L5e
            int r1 = r1.getKeyCount()     // Catch: java.lang.Throwable -> L5e
            if (r0 >= r1) goto L45
            com.google.crypto.tink.proto.Keyset$Builder r1 = r3.keysetBuilder     // Catch: java.lang.Throwable -> L5e
            com.google.crypto.tink.proto.Keyset$Key r1 = r1.getKey(r0)     // Catch: java.lang.Throwable -> L5e
            int r2 = r1.getKeyId()     // Catch: java.lang.Throwable -> L5e
            if (r2 != r4) goto L42
            com.google.crypto.tink.proto.KeyStatusType r0 = r1.getStatus()     // Catch: java.lang.Throwable -> L5e
            com.google.crypto.tink.proto.KeyStatusType r1 = com.google.crypto.tink.proto.KeyStatusType.ENABLED     // Catch: java.lang.Throwable -> L5e
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L29
            com.google.crypto.tink.proto.Keyset$Builder r0 = r3.keysetBuilder     // Catch: java.lang.Throwable -> L5e
            r0.setPrimaryKeyId(r4)     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r3)
            return r3
        L29:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L5e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e
            r1.<init>()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = "cannot set key as primary because it's not enabled: "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L5e
            java.lang.StringBuilder r4 = r1.append(r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L5e
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L5e
            throw r0     // Catch: java.lang.Throwable -> L5e
        L42:
            int r0 = r0 + 1
            goto L2
        L45:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L5e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e
            r1.<init>()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = "key not found: "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L5e
            java.lang.StringBuilder r4 = r1.append(r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L5e
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L5e
            throw r0     // Catch: java.lang.Throwable -> L5e
        L5e:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5e
            throw r4
    }
}
