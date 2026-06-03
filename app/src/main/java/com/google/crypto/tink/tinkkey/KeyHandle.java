package com.google.crypto.tink.tinkkey;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
@java.lang.Deprecated
public class KeyHandle {
    private final int id;
    private final com.google.crypto.tink.tinkkey.TinkKey key;
    private final com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType status;

    public enum KeyStatusType extends java.lang.Enum<com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType> {
        private static final /* synthetic */ com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType[] $VALUES = null;
        public static final com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType DESTROYED = null;
        public static final com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType DISABLED = null;
        public static final com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType ENABLED = null;

        static {
                com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType r0 = new com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType
                java.lang.String r1 = "ENABLED"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType.ENABLED = r0
                com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType r1 = new com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType
                java.lang.String r2 = "DISABLED"
                r3 = 1
                r1.<init>(r2, r3)
                com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType.DISABLED = r1
                com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType r2 = new com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType
                java.lang.String r3 = "DESTROYED"
                r4 = 2
                r2.<init>(r3, r4)
                com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType.DESTROYED = r2
                com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType[] r0 = new com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType[]{r0, r1, r2}
                com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType.$VALUES = r0
                return
        }

        KeyStatusType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType valueOf(java.lang.String r1) {
                java.lang.Class<com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType> r0 = com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType r1 = (com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType) r1
                return r1
        }

        public static com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType[] values() {
                com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType[] r0 = com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType[] r0 = (com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType[]) r0
                return r0
        }
    }

    private KeyHandle(com.google.crypto.tink.tinkkey.TinkKey r1) {
            r0 = this;
            r0.<init>()
            r0.key = r1
            com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType r1 = com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType.ENABLED
            r0.status = r1
            int r1 = com.google.crypto.tink.internal.Util.randKeyId()
            r0.id = r1
            return
    }

    protected KeyHandle(com.google.crypto.tink.tinkkey.TinkKey r1, com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.key = r1
            r0.status = r2
            r0.id = r3
            return
    }

    private void checkAccess(com.google.crypto.tink.tinkkey.KeyAccess r2) throws java.security.GeneralSecurityException {
            r1 = this;
            boolean r0 = r1.hasSecret()
            if (r0 == 0) goto L15
            boolean r2 = r2.canAccessSecret()
            if (r2 == 0) goto Ld
            goto L15
        Ld:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r0 = "No access"
            r2.<init>(r0)
            throw r2
        L15:
            return
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.tinkkey.KeyHandle createFromKey(com.google.crypto.tink.proto.KeyData r2, com.google.crypto.tink.KeyTemplate.OutputPrefixType r3) {
            com.google.crypto.tink.tinkkey.KeyHandle r0 = new com.google.crypto.tink.tinkkey.KeyHandle
            com.google.crypto.tink.tinkkey.internal.ProtoKey r1 = new com.google.crypto.tink.tinkkey.internal.ProtoKey
            r1.<init>(r2, r3)
            r0.<init>(r1)
            return r0
    }

    public static com.google.crypto.tink.tinkkey.KeyHandle createFromKey(com.google.crypto.tink.tinkkey.TinkKey r1, com.google.crypto.tink.tinkkey.KeyAccess r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.tinkkey.KeyHandle r0 = new com.google.crypto.tink.tinkkey.KeyHandle
            r0.<init>(r1)
            r0.checkAccess(r2)
            return r0
    }

    public static com.google.crypto.tink.tinkkey.KeyHandle generateNew(com.google.crypto.tink.KeyTemplate r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.tinkkey.internal.ProtoKey r0 = new com.google.crypto.tink.tinkkey.internal.ProtoKey
            com.google.crypto.tink.proto.KeyData r1 = com.google.crypto.tink.Registry.newKeyData(r2)
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r2 = r2.getOutputPrefixType()
            r0.<init>(r1, r2)
            com.google.crypto.tink.tinkkey.KeyHandle r2 = new com.google.crypto.tink.tinkkey.KeyHandle
            r2.<init>(r0)
            return r2
    }

    public int getId() {
            r1 = this;
            int r0 = r1.id
            return r0
    }

    public com.google.crypto.tink.tinkkey.TinkKey getKey(com.google.crypto.tink.tinkkey.KeyAccess r1) throws java.security.GeneralSecurityException {
            r0 = this;
            r0.checkAccess(r1)
            com.google.crypto.tink.tinkkey.TinkKey r1 = r0.key
            return r1
    }

    public com.google.crypto.tink.KeyTemplate getKeyTemplate() {
            r1 = this;
            com.google.crypto.tink.tinkkey.TinkKey r0 = r1.key
            com.google.crypto.tink.KeyTemplate r0 = r0.getKeyTemplate()
            return r0
    }

    public com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType getStatus() {
            r1 = this;
            com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType r0 = r1.status
            return r0
    }

    public boolean hasSecret() {
            r1 = this;
            com.google.crypto.tink.tinkkey.TinkKey r0 = r1.key
            boolean r0 = r0.hasSecret()
            return r0
    }
}
