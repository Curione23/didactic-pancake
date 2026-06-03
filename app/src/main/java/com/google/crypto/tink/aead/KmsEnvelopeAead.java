package com.google.crypto.tink.aead;

/* JADX INFO: loaded from: classes2.dex */
public final class KmsEnvelopeAead implements com.google.crypto.tink.Aead {
    private static final byte[] EMPTY_AAD = null;
    private static final int LENGTH_ENCRYPTED_DEK = 4;
    private final com.google.crypto.tink.proto.KeyTemplate dekTemplate;
    private final com.google.crypto.tink.Aead remote;

    static {
            r0 = 0
            byte[] r0 = new byte[r0]
            com.google.crypto.tink.aead.KmsEnvelopeAead.EMPTY_AAD = r0
            return
    }

    public KmsEnvelopeAead(com.google.crypto.tink.proto.KeyTemplate r1, com.google.crypto.tink.Aead r2) {
            r0 = this;
            r0.<init>()
            r0.dekTemplate = r1
            r0.remote = r2
            return
    }

    private byte[] buildCiphertext(byte[] r3, byte[] r4) {
            r2 = this;
            int r0 = r3.length
            int r0 = r0 + 4
            int r1 = r4.length
            int r0 = r0 + r1
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            int r1 = r3.length
            java.nio.ByteBuffer r0 = r0.putInt(r1)
            java.nio.ByteBuffer r3 = r0.put(r3)
            java.nio.ByteBuffer r3 = r3.put(r4)
            byte[] r3 = r3.array()
            return r3
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] decrypt(byte[] r6, byte[] r7) throws java.security.GeneralSecurityException {
            r5 = this;
            java.lang.String r0 = "invalid ciphertext"
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r6)     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            int r2 = r1.getInt()     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            if (r2 <= 0) goto L3f
            int r6 = r6.length     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            int r6 = r6 + (-4)
            if (r2 > r6) goto L3f
            byte[] r6 = new byte[r2]     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            r3 = 0
            r1.get(r6, r3, r2)     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            int r2 = r1.remaining()     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            byte[] r2 = new byte[r2]     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            int r4 = r1.remaining()     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            r1.get(r2, r3, r4)     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            com.google.crypto.tink.Aead r1 = r5.remote     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            byte[] r3 = com.google.crypto.tink.aead.KmsEnvelopeAead.EMPTY_AAD     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            byte[] r6 = r1.decrypt(r6, r3)     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            com.google.crypto.tink.proto.KeyTemplate r1 = r5.dekTemplate     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            java.lang.String r1 = r1.getTypeUrl()     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            java.lang.Class<com.google.crypto.tink.Aead> r3 = com.google.crypto.tink.Aead.class
            java.lang.Object r6 = com.google.crypto.tink.Registry.getPrimitive(r1, r6, r3)     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            com.google.crypto.tink.Aead r6 = (com.google.crypto.tink.Aead) r6     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            byte[] r6 = r6.decrypt(r2, r7)     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            return r6
        L3f:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            r6.<init>(r0)     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            throw r6     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
        L45:
            r6 = move-exception
            goto L4a
        L47:
            r6 = move-exception
            goto L4a
        L49:
            r6 = move-exception
        L4a:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            r7.<init>(r0, r6)
            throw r7
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] encrypt(byte[] r5, byte[] r6) throws java.security.GeneralSecurityException {
            r4 = this;
            com.google.crypto.tink.proto.KeyTemplate r0 = r4.dekTemplate
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = com.google.crypto.tink.Registry.newKey(r0)
            byte[] r0 = r0.toByteArray()
            com.google.crypto.tink.Aead r1 = r4.remote
            byte[] r2 = com.google.crypto.tink.aead.KmsEnvelopeAead.EMPTY_AAD
            byte[] r1 = r1.encrypt(r0, r2)
            com.google.crypto.tink.proto.KeyTemplate r2 = r4.dekTemplate
            java.lang.String r2 = r2.getTypeUrl()
            java.lang.Class<com.google.crypto.tink.Aead> r3 = com.google.crypto.tink.Aead.class
            java.lang.Object r0 = com.google.crypto.tink.Registry.getPrimitive(r2, r0, r3)
            com.google.crypto.tink.Aead r0 = (com.google.crypto.tink.Aead) r0
            byte[] r5 = r0.encrypt(r5, r6)
            byte[] r5 = r4.buildCiphertext(r1, r5)
            return r5
    }
}
