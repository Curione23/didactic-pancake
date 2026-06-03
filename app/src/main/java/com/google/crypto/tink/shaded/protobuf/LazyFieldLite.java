package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public class LazyFieldLite {
    private static final com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite EMPTY_REGISTRY = null;
    private com.google.crypto.tink.shaded.protobuf.ByteString delayedBytes;
    private com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistry;
    private volatile com.google.crypto.tink.shaded.protobuf.ByteString memoizedBytes;
    protected volatile com.google.crypto.tink.shaded.protobuf.MessageLite value;

    static {
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.shaded.protobuf.LazyFieldLite.EMPTY_REGISTRY = r0
            return
    }

    public LazyFieldLite() {
            r0 = this;
            r0.<init>()
            return
    }

    public LazyFieldLite(com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1, com.google.crypto.tink.shaded.protobuf.ByteString r2) {
            r0 = this;
            r0.<init>()
            checkArguments(r1, r2)
            r0.extensionRegistry = r1
            r0.delayedBytes = r2
            return
    }

    private static void checkArguments(com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0, com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            if (r0 == 0) goto Ld
            if (r1 == 0) goto L5
            return
        L5:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "found null ByteString"
            r0.<init>(r1)
            throw r0
        Ld:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "found null ExtensionRegistry"
            r0.<init>(r1)
            throw r0
    }

    public static com.google.crypto.tink.shaded.protobuf.LazyFieldLite fromValue(com.google.crypto.tink.shaded.protobuf.MessageLite r1) {
            com.google.crypto.tink.shaded.protobuf.LazyFieldLite r0 = new com.google.crypto.tink.shaded.protobuf.LazyFieldLite
            r0.<init>()
            r0.setValue(r1)
            return r0
    }

    private static com.google.crypto.tink.shaded.protobuf.MessageLite mergeValueAndBytes(com.google.crypto.tink.shaded.protobuf.MessageLite r1, com.google.crypto.tink.shaded.protobuf.ByteString r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3) {
            com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r0 = r1.toBuilder()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lc
            com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r2 = r0.mergeFrom(r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lc
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r2.build()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lc
        Lc:
            return r1
    }

    public void clear() {
            r1 = this;
            r0 = 0
            r1.delayedBytes = r0
            r1.value = r0
            r1.memoizedBytes = r0
            return
    }

    public boolean containsDefaultInstance() {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.memoizedBytes
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
            if (r0 == r1) goto L15
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r2.value
            if (r0 != 0) goto L13
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.delayedBytes
            if (r0 == 0) goto L15
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
            if (r0 != r1) goto L13
            goto L15
        L13:
            r0 = 0
            goto L16
        L15:
            r0 = 1
        L16:
            return r0
    }

    protected void ensureInitialized(com.google.crypto.tink.shaded.protobuf.MessageLite r4) {
            r3 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r3.value
            if (r0 == 0) goto L5
            return
        L5:
            monitor-enter(r3)
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r3.value     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto Lc
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L34
            return
        Lc:
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r3.delayedBytes     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2c java.lang.Throwable -> L34
            if (r0 == 0) goto L25
            com.google.crypto.tink.shaded.protobuf.Parser r0 = r4.getParserForType()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2c java.lang.Throwable -> L34
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r3.delayedBytes     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2c java.lang.Throwable -> L34
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2 = r3.extensionRegistry     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2c java.lang.Throwable -> L34
            java.lang.Object r0 = r0.parseFrom(r1, r2)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2c java.lang.Throwable -> L34
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r0     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2c java.lang.Throwable -> L34
            r3.value = r0     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2c java.lang.Throwable -> L34
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r3.delayedBytes     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2c java.lang.Throwable -> L34
            r3.memoizedBytes = r0     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2c java.lang.Throwable -> L34
            goto L32
        L25:
            r3.value = r4     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2c java.lang.Throwable -> L34
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2c java.lang.Throwable -> L34
            r3.memoizedBytes = r0     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2c java.lang.Throwable -> L34
            goto L32
        L2c:
            r3.value = r4     // Catch: java.lang.Throwable -> L34
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY     // Catch: java.lang.Throwable -> L34
            r3.memoizedBytes = r4     // Catch: java.lang.Throwable -> L34
        L32:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L34
            return
        L34:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L34
            throw r4
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            boolean r0 = r3 instanceof com.google.crypto.tink.shaded.protobuf.LazyFieldLite
            if (r0 != 0) goto La
            r3 = 0
            return r3
        La:
            com.google.crypto.tink.shaded.protobuf.LazyFieldLite r3 = (com.google.crypto.tink.shaded.protobuf.LazyFieldLite) r3
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r2.value
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r3.value
            if (r0 != 0) goto L21
            if (r1 != 0) goto L21
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.toByteString()
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r3.toByteString()
            boolean r3 = r0.equals(r3)
            return r3
        L21:
            if (r0 == 0) goto L2a
            if (r1 == 0) goto L2a
            boolean r3 = r0.equals(r1)
            return r3
        L2a:
            if (r0 == 0) goto L39
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.getDefaultInstanceForType()
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = r3.getValue(r1)
            boolean r3 = r0.equals(r3)
            return r3
        L39:
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = r1.getDefaultInstanceForType()
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = r2.getValue(r3)
            boolean r3 = r3.equals(r1)
            return r3
    }

    public int getSerializedSize() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.memoizedBytes
            if (r0 == 0) goto Lb
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.memoizedBytes
            int r0 = r0.size()
            return r0
        Lb:
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.delayedBytes
            if (r0 == 0) goto L14
            int r0 = r0.size()
            return r0
        L14:
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.value
            if (r0 == 0) goto L1f
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.value
            int r0 = r0.getSerializedSize()
            return r0
        L1f:
            r0 = 0
            return r0
    }

    public com.google.crypto.tink.shaded.protobuf.MessageLite getValue(com.google.crypto.tink.shaded.protobuf.MessageLite r1) {
            r0 = this;
            r0.ensureInitialized(r1)
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.value
            return r1
    }

    public int hashCode() {
            r1 = this;
            r0 = 1
            return r0
    }

    public void merge(com.google.crypto.tink.shaded.protobuf.LazyFieldLite r3) {
            r2 = this;
            boolean r0 = r3.containsDefaultInstance()
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = r2.containsDefaultInstance()
            if (r0 == 0) goto L11
            r2.set(r3)
            return
        L11:
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = r2.extensionRegistry
            if (r0 != 0) goto L19
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = r3.extensionRegistry
            r2.extensionRegistry = r0
        L19:
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.delayedBytes
            if (r0 == 0) goto L28
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r3.delayedBytes
            if (r1 == 0) goto L28
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r0.concat(r1)
            r2.delayedBytes = r3
            return
        L28:
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r2.value
            if (r0 != 0) goto L3e
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r3.value
            if (r0 == 0) goto L3e
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = r3.value
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.delayedBytes
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = r2.extensionRegistry
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = mergeValueAndBytes(r3, r0, r1)
            r2.setValue(r3)
            return
        L3e:
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r2.value
            if (r0 == 0) goto L54
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r3.value
            if (r0 != 0) goto L54
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r2.value
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r3.delayedBytes
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3 = r3.extensionRegistry
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = mergeValueAndBytes(r0, r1, r3)
            r2.setValue(r3)
            return
        L54:
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r2.value
            com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r0 = r0.toBuilder()
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = r3.value
            com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r3 = r0.mergeFrom(r3)
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = r3.build()
            r2.setValue(r3)
            return
    }

    public void mergeFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3) throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.containsDefaultInstance()
            if (r0 == 0) goto Le
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r2.readBytes()
            r1.setByteString(r2, r3)
            return
        Le:
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = r1.extensionRegistry
            if (r0 != 0) goto L14
            r1.extensionRegistry = r3
        L14:
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.delayedBytes
            if (r0 == 0) goto L26
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r2.readBytes()
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r0.concat(r2)
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3 = r1.extensionRegistry
            r1.setByteString(r2, r3)
            return
        L26:
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.value     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L37
            com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r0 = r0.toBuilder()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L37
            com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r2 = r0.mergeFrom(r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L37
            com.google.crypto.tink.shaded.protobuf.MessageLite r2 = r2.build()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L37
            r1.setValue(r2)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L37
        L37:
            return
    }

    public void set(com.google.crypto.tink.shaded.protobuf.LazyFieldLite r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.delayedBytes
            r1.delayedBytes = r0
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r2.value
            r1.value = r0
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.memoizedBytes
            r1.memoizedBytes = r0
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2 = r2.extensionRegistry
            if (r2 == 0) goto L12
            r1.extensionRegistry = r2
        L12:
            return
    }

    public void setByteString(com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) {
            r0 = this;
            checkArguments(r2, r1)
            r0.delayedBytes = r1
            r0.extensionRegistry = r2
            r1 = 0
            r0.value = r1
            r0.memoizedBytes = r1
            return
    }

    public com.google.crypto.tink.shaded.protobuf.MessageLite setValue(com.google.crypto.tink.shaded.protobuf.MessageLite r3) {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r2.value
            r1 = 0
            r2.delayedBytes = r1
            r2.memoizedBytes = r1
            r2.value = r3
            return r0
    }

    public com.google.crypto.tink.shaded.protobuf.ByteString toByteString() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.memoizedBytes
            if (r0 == 0) goto L7
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.memoizedBytes
            return r0
        L7:
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.delayedBytes
            if (r0 == 0) goto Lc
            return r0
        Lc:
            monitor-enter(r1)
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.memoizedBytes     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L15
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.memoizedBytes     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2a
            return r0
        L15:
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.value     // Catch: java.lang.Throwable -> L2a
            if (r0 != 0) goto L1e
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY     // Catch: java.lang.Throwable -> L2a
            r1.memoizedBytes = r0     // Catch: java.lang.Throwable -> L2a
            goto L26
        L1e:
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.value     // Catch: java.lang.Throwable -> L2a
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.toByteString()     // Catch: java.lang.Throwable -> L2a
            r1.memoizedBytes = r0     // Catch: java.lang.Throwable -> L2a
        L26:
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.memoizedBytes     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2a
            return r0
        L2a:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2a
            throw r0
    }

    void writeTo(com.google.crypto.tink.shaded.protobuf.Writer r2, int r3) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.memoizedBytes
            if (r0 == 0) goto La
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.memoizedBytes
            r2.writeBytes(r3, r0)
            goto L21
        La:
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.delayedBytes
            if (r0 == 0) goto L12
            r2.writeBytes(r3, r0)
            goto L21
        L12:
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.value
            if (r0 == 0) goto L1c
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.value
            r2.writeMessage(r3, r0)
            goto L21
        L1c:
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
            r2.writeBytes(r3, r0)
        L21:
            return
    }
}
