package com.google.crypto.tink.internal;

import com.google.crypto.tink.shaded.protobuf.MessageLite;

/* JADX INFO: loaded from: classes2.dex */
public abstract class KeyTypeManager<KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> {
    private final java.lang.Class<KeyProtoT> clazz;
    private final java.util.Map<java.lang.Class<?>, com.google.crypto.tink.internal.PrimitiveFactory<?, KeyProtoT>> factories;
    private final java.lang.Class<?> firstPrimitiveClass;

    public static abstract class KeyFactory<KeyFormatProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> {
        private final java.lang.Class<KeyFormatProtoT> clazz;

        public static final class KeyFormat<KeyFormatProtoT> {
            public KeyFormatProtoT keyFormat;
            public com.google.crypto.tink.KeyTemplate.OutputPrefixType outputPrefixType;

            public KeyFormat(KeyFormatProtoT r1, com.google.crypto.tink.KeyTemplate.OutputPrefixType r2) {
                    r0 = this;
                    r0.<init>()
                    r0.keyFormat = r1
                    r0.outputPrefixType = r2
                    return
            }
        }

        public KeyFactory(java.lang.Class<KeyFormatProtoT> r1) {
                r0 = this;
                r0.<init>()
                r0.clazz = r1
                return
        }

        protected static void readFully(java.io.InputStream r4, byte[] r5) throws java.io.IOException, java.security.GeneralSecurityException {
                int r0 = r5.length
                r1 = 0
            L2:
                if (r1 >= r0) goto L17
                int r2 = r0 - r1
                int r2 = r4.read(r5, r1, r2)
                r3 = -1
                if (r2 == r3) goto Lf
                int r1 = r1 + r2
                goto L2
            Lf:
                java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
                java.lang.String r5 = "Not enough pseudorandomness provided"
                r4.<init>(r5)
                throw r4
            L17:
                return
        }

        public abstract KeyProtoT createKey(KeyFormatProtoT r1) throws java.security.GeneralSecurityException;

        public KeyProtoT deriveKey(KeyFormatProtoT r2, java.io.InputStream r3) throws java.security.GeneralSecurityException {
                r1 = this;
                java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r0 = "deriveKey not implemented for key of type "
                r3.<init>(r0)
                java.lang.Class<KeyFormatProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r0 = r1.clazz
                java.lang.StringBuilder r3 = r3.append(r0)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
        }

        public final java.lang.Class<KeyFormatProtoT> getKeyFormatClass() {
                r1 = this;
                java.lang.Class<KeyFormatProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r0 = r1.clazz
                return r0
        }

        public java.util.Map<java.lang.String, com.google.crypto.tink.internal.KeyTypeManager.KeyFactory.KeyFormat<KeyFormatProtoT>> keyFormats() throws java.security.GeneralSecurityException {
                r1 = this;
                java.util.Map r0 = java.util.Collections.emptyMap()
                return r0
        }

        public abstract KeyFormatProtoT parseKeyFormat(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

        public abstract void validateKeyFormat(KeyFormatProtoT r1) throws java.security.GeneralSecurityException;
    }

    @java.lang.SafeVarargs
    protected KeyTypeManager(java.lang.Class<KeyProtoT> r6, com.google.crypto.tink.internal.PrimitiveFactory<?, KeyProtoT>... r7) {
            r5 = this;
            r5.<init>()
            r5.clazz = r6
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            int r0 = r7.length
            r1 = 0
            r2 = r1
        Ld:
            if (r2 >= r0) goto L42
            r3 = r7[r2]
            java.lang.Class r4 = r3.getPrimitiveClass()
            boolean r4 = r6.containsKey(r4)
            if (r4 != 0) goto L25
            java.lang.Class r4 = r3.getPrimitiveClass()
            r6.put(r4, r3)
            int r2 = r2 + 1
            goto Ld
        L25:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "KeyTypeManager constructed with duplicate factories for primitive "
            r7.<init>(r0)
            java.lang.Class r0 = r3.getPrimitiveClass()
            java.lang.String r0 = r0.getCanonicalName()
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L42:
            int r0 = r7.length
            if (r0 <= 0) goto L4e
            r7 = r7[r1]
            java.lang.Class r7 = r7.getPrimitiveClass()
            r5.firstPrimitiveClass = r7
            goto L52
        L4e:
            java.lang.Class<java.lang.Void> r7 = java.lang.Void.class
            r5.firstPrimitiveClass = r7
        L52:
            java.util.Map r6 = java.util.Collections.unmodifiableMap(r6)
            r5.factories = r6
            return
    }

    public com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility fipsStatus() {
            r1 = this;
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS
            return r0
    }

    public final java.lang.Class<?> firstSupportedPrimitiveClass() {
            r1 = this;
            java.lang.Class<?> r0 = r1.firstPrimitiveClass
            return r0
    }

    public final java.lang.Class<KeyProtoT> getKeyClass() {
            r1 = this;
            java.lang.Class<KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r0 = r1.clazz
            return r0
    }

    public abstract java.lang.String getKeyType();

    public final <P> P getPrimitive(KeyProtoT r3, java.lang.Class<P> r4) throws java.security.GeneralSecurityException {
            r2 = this;
            java.util.Map<java.lang.Class<?>, com.google.crypto.tink.internal.PrimitiveFactory<?, KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite>> r0 = r2.factories
            java.lang.Object r0 = r0.get(r4)
            com.google.crypto.tink.internal.PrimitiveFactory r0 = (com.google.crypto.tink.internal.PrimitiveFactory) r0
            if (r0 == 0) goto Lf
            java.lang.Object r3 = r0.getPrimitive(r3)
            return r3
        Lf:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Requested primitive class "
            r0.<init>(r1)
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r0 = " not supported."
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    public abstract int getVersion();

    public com.google.crypto.tink.internal.KeyTypeManager.KeyFactory<?, KeyProtoT> keyFactory() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Creating keys is not supported."
            r0.<init>(r1)
            throw r0
    }

    public abstract com.google.crypto.tink.proto.KeyData.KeyMaterialType keyMaterialType();

    public abstract KeyProtoT parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

    public final java.util.Set<java.lang.Class<?>> supportedPrimitives() {
            r1 = this;
            java.util.Map<java.lang.Class<?>, com.google.crypto.tink.internal.PrimitiveFactory<?, KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite>> r0 = r1.factories
            java.util.Set r0 = r0.keySet()
            return r0
    }

    public abstract void validateKey(KeyProtoT r1) throws java.security.GeneralSecurityException;
}
