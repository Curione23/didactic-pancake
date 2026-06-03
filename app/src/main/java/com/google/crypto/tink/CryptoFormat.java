package com.google.crypto.tink;

/* JADX INFO: loaded from: classes2.dex */
public final class CryptoFormat {
    public static final int LEGACY_PREFIX_SIZE = 5;
    public static final byte LEGACY_START_BYTE = 0;
    public static final int NON_RAW_PREFIX_SIZE = 5;
    public static final byte[] RAW_PREFIX = null;
    public static final int RAW_PREFIX_SIZE = 0;
    public static final int TINK_PREFIX_SIZE = 5;
    public static final byte TINK_START_BYTE = 1;

    /* JADX INFO: renamed from: com.google.crypto.tink.CryptoFormat$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = null;

        static {
                com.google.crypto.tink.proto.OutputPrefixType[] r0 = com.google.crypto.tink.proto.OutputPrefixType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.CryptoFormat.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = r0
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.crypto.tink.CryptoFormat.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.crypto.tink.CryptoFormat.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.TINK     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.crypto.tink.CryptoFormat.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.RAW     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    static {
            r0 = 0
            byte[] r0 = new byte[r0]
            com.google.crypto.tink.CryptoFormat.RAW_PREFIX = r0
            return
    }

    private CryptoFormat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte[] getOutputPrefix(com.google.crypto.tink.proto.Keyset.Key r4) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.CryptoFormat.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType
            com.google.crypto.tink.proto.OutputPrefixType r1 = r4.getOutputPrefixType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 5
            r2 = 1
            if (r0 == r2) goto L39
            r3 = 2
            if (r0 == r3) goto L39
            r3 = 3
            if (r0 == r3) goto L24
            r4 = 4
            if (r0 != r4) goto L1c
            byte[] r4 = com.google.crypto.tink.CryptoFormat.RAW_PREFIX
            return r4
        L1c:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r0 = "unknown output prefix type"
            r4.<init>(r0)
            throw r4
        L24:
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r1)
            java.nio.ByteBuffer r0 = r0.put(r2)
            int r4 = r4.getKeyId()
            java.nio.ByteBuffer r4 = r0.putInt(r4)
            byte[] r4 = r4.array()
            return r4
        L39:
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r1)
            r1 = 0
            java.nio.ByteBuffer r0 = r0.put(r1)
            int r4 = r4.getKeyId()
            java.nio.ByteBuffer r4 = r0.putInt(r4)
            byte[] r4 = r4.array()
            return r4
    }
}
