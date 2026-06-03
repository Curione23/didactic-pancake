package com.google.crypto.tink;

/* JADX INFO: loaded from: classes2.dex */
final class Util {
    public static final java.nio.charset.Charset UTF_8 = null;

    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.google.crypto.tink.Util.UTF_8 = r0
            return
    }

    private Util() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.proto.KeysetInfo.KeyInfo getKeyInfo(com.google.crypto.tink.proto.Keyset.Key r2) {
            com.google.crypto.tink.proto.KeysetInfo$KeyInfo$Builder r0 = com.google.crypto.tink.proto.KeysetInfo.KeyInfo.newBuilder()
            com.google.crypto.tink.proto.KeyData r1 = r2.getKeyData()
            java.lang.String r1 = r1.getTypeUrl()
            com.google.crypto.tink.proto.KeysetInfo$KeyInfo$Builder r0 = r0.setTypeUrl(r1)
            com.google.crypto.tink.proto.KeyStatusType r1 = r2.getStatus()
            com.google.crypto.tink.proto.KeysetInfo$KeyInfo$Builder r0 = r0.setStatus(r1)
            com.google.crypto.tink.proto.OutputPrefixType r1 = r2.getOutputPrefixType()
            com.google.crypto.tink.proto.KeysetInfo$KeyInfo$Builder r0 = r0.setOutputPrefixType(r1)
            int r2 = r2.getKeyId()
            com.google.crypto.tink.proto.KeysetInfo$KeyInfo$Builder r2 = r0.setKeyId(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.KeysetInfo$KeyInfo r2 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) r2
            return r2
    }

    public static com.google.crypto.tink.proto.KeysetInfo getKeysetInfo(com.google.crypto.tink.proto.Keyset r2) {
            com.google.crypto.tink.proto.KeysetInfo$Builder r0 = com.google.crypto.tink.proto.KeysetInfo.newBuilder()
            int r1 = r2.getPrimaryKeyId()
            com.google.crypto.tink.proto.KeysetInfo$Builder r0 = r0.setPrimaryKeyId(r1)
            java.util.List r2 = r2.getKeyList()
            java.util.Iterator r2 = r2.iterator()
        L14:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r2.next()
            com.google.crypto.tink.proto.Keyset$Key r1 = (com.google.crypto.tink.proto.Keyset.Key) r1
            com.google.crypto.tink.proto.KeysetInfo$KeyInfo r1 = getKeyInfo(r1)
            r0.addKeyInfo(r1)
            goto L14
        L28:
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r0.build()
            com.google.crypto.tink.proto.KeysetInfo r2 = (com.google.crypto.tink.proto.KeysetInfo) r2
            return r2
    }

    public static byte[] readAll(java.io.InputStream r4) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]
        L9:
            int r2 = r4.read(r1)
            r3 = -1
            if (r2 == r3) goto L15
            r3 = 0
            r0.write(r1, r3, r2)
            goto L9
        L15:
            byte[] r4 = r0.toByteArray()
            return r4
    }

    public static void validateKey(com.google.crypto.tink.proto.Keyset.Key r2) throws java.security.GeneralSecurityException {
            boolean r0 = r2.hasKeyData()
            if (r0 == 0) goto L47
            com.google.crypto.tink.proto.OutputPrefixType r0 = r2.getOutputPrefixType()
            com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.UNKNOWN_PREFIX
            if (r0 == r1) goto L2f
            com.google.crypto.tink.proto.KeyStatusType r0 = r2.getStatus()
            com.google.crypto.tink.proto.KeyStatusType r1 = com.google.crypto.tink.proto.KeyStatusType.UNKNOWN_STATUS
            if (r0 == r1) goto L17
            return
        L17:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            int r2 = r2.getKeyId()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = "key %d has unknown status"
            java.lang.String r2 = java.lang.String.format(r1, r2)
            r0.<init>(r2)
            throw r0
        L2f:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            int r2 = r2.getKeyId()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = "key %d has unknown prefix"
            java.lang.String r2 = java.lang.String.format(r1, r2)
            r0.<init>(r2)
            throw r0
        L47:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            int r2 = r2.getKeyId()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = "key %d has no key data"
            java.lang.String r2 = java.lang.String.format(r1, r2)
            r0.<init>(r2)
            throw r0
    }

    public static void validateKeyset(com.google.crypto.tink.proto.Keyset r9) throws java.security.GeneralSecurityException {
            int r0 = r9.getPrimaryKeyId()
            java.util.List r9 = r9.getKeyList()
            java.util.Iterator r9 = r9.iterator()
            r1 = 0
            r2 = 1
            r3 = r1
            r4 = r3
            r5 = r2
        L11:
            boolean r6 = r9.hasNext()
            if (r6 == 0) goto L4b
            java.lang.Object r6 = r9.next()
            com.google.crypto.tink.proto.Keyset$Key r6 = (com.google.crypto.tink.proto.Keyset.Key) r6
            com.google.crypto.tink.proto.KeyStatusType r7 = r6.getStatus()
            com.google.crypto.tink.proto.KeyStatusType r8 = com.google.crypto.tink.proto.KeyStatusType.ENABLED
            if (r7 == r8) goto L26
            goto L11
        L26:
            validateKey(r6)
            int r7 = r6.getKeyId()
            if (r7 != r0) goto L3b
            if (r4 != 0) goto L33
            r4 = r2
            goto L3b
        L33:
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException
            java.lang.String r0 = "keyset contains multiple primary keys"
            r9.<init>(r0)
            throw r9
        L3b:
            com.google.crypto.tink.proto.KeyData r6 = r6.getKeyData()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r6 = r6.getKeyMaterialType()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r7 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC
            if (r6 == r7) goto L48
            r5 = r1
        L48:
            int r3 = r3 + 1
            goto L11
        L4b:
            if (r3 == 0) goto L5b
            if (r4 != 0) goto L5a
            if (r5 == 0) goto L52
            goto L5a
        L52:
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException
            java.lang.String r0 = "keyset doesn't contain a valid primary key"
            r9.<init>(r0)
            throw r9
        L5a:
            return
        L5b:
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException
            java.lang.String r0 = "keyset must contain at least one ENABLED key"
            r9.<init>(r0)
            throw r9
    }
}
