package com.google.crypto.tink.subtle.prf;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
public class HkdfStreamingPrf implements com.google.crypto.tink.subtle.prf.StreamingPrf {
    private final com.google.crypto.tink.subtle.Enums.HashType hashType;
    private final byte[] ikm;
    private final byte[] salt;

    /* JADX INFO: renamed from: com.google.crypto.tink.subtle.prf.HkdfStreamingPrf$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType = null;

        static {
                com.google.crypto.tink.subtle.Enums$HashType[] r0 = com.google.crypto.tink.subtle.Enums.HashType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.subtle.prf.HkdfStreamingPrf.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType = r0
                com.google.crypto.tink.subtle.Enums$HashType r1 = com.google.crypto.tink.subtle.Enums.HashType.SHA1     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.crypto.tink.subtle.prf.HkdfStreamingPrf.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.subtle.Enums$HashType r1 = com.google.crypto.tink.subtle.Enums.HashType.SHA256     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.crypto.tink.subtle.prf.HkdfStreamingPrf.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.subtle.Enums$HashType r1 = com.google.crypto.tink.subtle.Enums.HashType.SHA384     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.crypto.tink.subtle.prf.HkdfStreamingPrf.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.crypto.tink.subtle.Enums$HashType r1 = com.google.crypto.tink.subtle.Enums.HashType.SHA512     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    private class HkdfInputStream extends java.io.InputStream {
        private java.nio.ByteBuffer buffer;
        private int ctr;
        private final byte[] input;
        private javax.crypto.Mac mac;
        private byte[] prk;
        final /* synthetic */ com.google.crypto.tink.subtle.prf.HkdfStreamingPrf this$0;

        public HkdfInputStream(com.google.crypto.tink.subtle.prf.HkdfStreamingPrf r1, byte[] r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = -1
                r0.ctr = r1
                int r1 = r2.length
                byte[] r1 = java.util.Arrays.copyOf(r2, r1)
                r0.input = r1
                return
        }

        private void initialize() throws java.security.GeneralSecurityException, java.io.IOException {
                r4 = this;
                com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TMac, javax.crypto.Mac> r0 = com.google.crypto.tink.subtle.EngineFactory.MAC     // Catch: java.security.GeneralSecurityException -> L7d
                com.google.crypto.tink.subtle.prf.HkdfStreamingPrf r1 = r4.this$0     // Catch: java.security.GeneralSecurityException -> L7d
                com.google.crypto.tink.subtle.Enums$HashType r1 = com.google.crypto.tink.subtle.prf.HkdfStreamingPrf.access$000(r1)     // Catch: java.security.GeneralSecurityException -> L7d
                java.lang.String r1 = com.google.crypto.tink.subtle.prf.HkdfStreamingPrf.access$100(r1)     // Catch: java.security.GeneralSecurityException -> L7d
                java.lang.Object r0 = r0.getInstance(r1)     // Catch: java.security.GeneralSecurityException -> L7d
                javax.crypto.Mac r0 = (javax.crypto.Mac) r0     // Catch: java.security.GeneralSecurityException -> L7d
                r4.mac = r0     // Catch: java.security.GeneralSecurityException -> L7d
                com.google.crypto.tink.subtle.prf.HkdfStreamingPrf r0 = r4.this$0
                byte[] r0 = com.google.crypto.tink.subtle.prf.HkdfStreamingPrf.access$200(r0)
                if (r0 == 0) goto L41
                com.google.crypto.tink.subtle.prf.HkdfStreamingPrf r0 = r4.this$0
                byte[] r0 = com.google.crypto.tink.subtle.prf.HkdfStreamingPrf.access$200(r0)
                int r0 = r0.length
                if (r0 != 0) goto L26
                goto L41
            L26:
                javax.crypto.Mac r0 = r4.mac
                javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec
                com.google.crypto.tink.subtle.prf.HkdfStreamingPrf r2 = r4.this$0
                byte[] r2 = com.google.crypto.tink.subtle.prf.HkdfStreamingPrf.access$200(r2)
                com.google.crypto.tink.subtle.prf.HkdfStreamingPrf r3 = r4.this$0
                com.google.crypto.tink.subtle.Enums$HashType r3 = com.google.crypto.tink.subtle.prf.HkdfStreamingPrf.access$000(r3)
                java.lang.String r3 = com.google.crypto.tink.subtle.prf.HkdfStreamingPrf.access$100(r3)
                r1.<init>(r2, r3)
                r0.init(r1)
                goto L5d
            L41:
                javax.crypto.Mac r0 = r4.mac
                javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec
                javax.crypto.Mac r2 = r4.mac
                int r2 = r2.getMacLength()
                byte[] r2 = new byte[r2]
                com.google.crypto.tink.subtle.prf.HkdfStreamingPrf r3 = r4.this$0
                com.google.crypto.tink.subtle.Enums$HashType r3 = com.google.crypto.tink.subtle.prf.HkdfStreamingPrf.access$000(r3)
                java.lang.String r3 = com.google.crypto.tink.subtle.prf.HkdfStreamingPrf.access$100(r3)
                r1.<init>(r2, r3)
                r0.init(r1)
            L5d:
                javax.crypto.Mac r0 = r4.mac
                com.google.crypto.tink.subtle.prf.HkdfStreamingPrf r1 = r4.this$0
                byte[] r1 = com.google.crypto.tink.subtle.prf.HkdfStreamingPrf.access$300(r1)
                r0.update(r1)
                javax.crypto.Mac r0 = r4.mac
                byte[] r0 = r0.doFinal()
                r4.prk = r0
                r0 = 0
                java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r0)
                r4.buffer = r1
                r1.mark()
                r4.ctr = r0
                return
            L7d:
                r0 = move-exception
                java.io.IOException r1 = new java.io.IOException
                java.lang.String r2 = "Creating HMac failed"
                r1.<init>(r2, r0)
                throw r1
        }

        private void updateBuffer() throws java.security.GeneralSecurityException, java.io.IOException {
                r4 = this;
                javax.crypto.Mac r0 = r4.mac
                javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec
                byte[] r2 = r4.prk
                com.google.crypto.tink.subtle.prf.HkdfStreamingPrf r3 = r4.this$0
                com.google.crypto.tink.subtle.Enums$HashType r3 = com.google.crypto.tink.subtle.prf.HkdfStreamingPrf.access$000(r3)
                java.lang.String r3 = com.google.crypto.tink.subtle.prf.HkdfStreamingPrf.access$100(r3)
                r1.<init>(r2, r3)
                r0.init(r1)
                java.nio.ByteBuffer r0 = r4.buffer
                r0.reset()
                javax.crypto.Mac r0 = r4.mac
                java.nio.ByteBuffer r1 = r4.buffer
                r0.update(r1)
                javax.crypto.Mac r0 = r4.mac
                byte[] r1 = r4.input
                r0.update(r1)
                int r0 = r4.ctr
                int r0 = r0 + 1
                r4.ctr = r0
                javax.crypto.Mac r1 = r4.mac
                byte r0 = (byte) r0
                r1.update(r0)
                javax.crypto.Mac r0 = r4.mac
                byte[] r0 = r0.doFinal()
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
                r4.buffer = r0
                r0.mark()
                return
        }

        @Override // java.io.InputStream
        public int read() throws java.io.IOException {
                r4 = this;
                r0 = 1
                byte[] r1 = new byte[r0]
                r2 = 0
                int r3 = r4.read(r1, r2, r0)
                if (r3 != r0) goto Lf
                r0 = r1[r2]
                r0 = r0 & 255(0xff, float:3.57E-43)
                return r0
            Lf:
                r0 = -1
                if (r3 != r0) goto L13
                return r3
            L13:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "Reading failed"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.io.InputStream
        public int read(byte[] r3) throws java.io.IOException {
                r2 = this;
                r0 = 0
                int r1 = r3.length
                int r3 = r2.read(r3, r0, r1)
                return r3
        }

        @Override // java.io.InputStream
        public int read(byte[] r4, int r5, int r6) throws java.io.IOException {
                r3 = this;
                int r0 = r3.ctr     // Catch: java.security.GeneralSecurityException -> L32
                r1 = -1
                if (r0 != r1) goto L8
                r3.initialize()     // Catch: java.security.GeneralSecurityException -> L32
            L8:
                r0 = 0
            L9:
                if (r0 >= r6) goto L31
                java.nio.ByteBuffer r1 = r3.buffer     // Catch: java.security.GeneralSecurityException -> L32
                boolean r1 = r1.hasRemaining()     // Catch: java.security.GeneralSecurityException -> L32
                if (r1 != 0) goto L1d
                int r1 = r3.ctr     // Catch: java.security.GeneralSecurityException -> L32
                r2 = 255(0xff, float:3.57E-43)
                if (r1 != r2) goto L1a
                return r0
            L1a:
                r3.updateBuffer()     // Catch: java.security.GeneralSecurityException -> L32
            L1d:
                int r1 = r6 - r0
                java.nio.ByteBuffer r2 = r3.buffer     // Catch: java.security.GeneralSecurityException -> L32
                int r2 = r2.remaining()     // Catch: java.security.GeneralSecurityException -> L32
                int r1 = java.lang.Math.min(r1, r2)     // Catch: java.security.GeneralSecurityException -> L32
                java.nio.ByteBuffer r2 = r3.buffer     // Catch: java.security.GeneralSecurityException -> L32
                r2.get(r4, r5, r1)     // Catch: java.security.GeneralSecurityException -> L32
                int r5 = r5 + r1
                int r0 = r0 + r1
                goto L9
            L31:
                return r0
            L32:
                r4 = move-exception
                r5 = 0
                r3.mac = r5
                java.io.IOException r5 = new java.io.IOException
                java.lang.String r6 = "HkdfInputStream failed"
                r5.<init>(r6, r4)
                throw r5
        }
    }

    public HkdfStreamingPrf(com.google.crypto.tink.subtle.Enums.HashType r1, byte[] r2, byte[] r3) {
            r0 = this;
            r0.<init>()
            r0.hashType = r1
            int r1 = r2.length
            byte[] r1 = java.util.Arrays.copyOf(r2, r1)
            r0.ikm = r1
            int r1 = r3.length
            byte[] r1 = java.util.Arrays.copyOf(r3, r1)
            r0.salt = r1
            return
    }

    static /* synthetic */ com.google.crypto.tink.subtle.Enums.HashType access$000(com.google.crypto.tink.subtle.prf.HkdfStreamingPrf r0) {
            com.google.crypto.tink.subtle.Enums$HashType r0 = r0.hashType
            return r0
    }

    static /* synthetic */ java.lang.String access$100(com.google.crypto.tink.subtle.Enums.HashType r0) throws java.security.GeneralSecurityException {
            java.lang.String r0 = getJavaxHmacName(r0)
            return r0
    }

    static /* synthetic */ byte[] access$200(com.google.crypto.tink.subtle.prf.HkdfStreamingPrf r0) {
            byte[] r0 = r0.salt
            return r0
    }

    static /* synthetic */ byte[] access$300(com.google.crypto.tink.subtle.prf.HkdfStreamingPrf r0) {
            byte[] r0 = r0.ikm
            return r0
    }

    private static java.lang.String getJavaxHmacName(com.google.crypto.tink.subtle.Enums.HashType r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.subtle.prf.HkdfStreamingPrf.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L38
            r1 = 2
            if (r0 == r1) goto L35
            r1 = 3
            if (r0 == r1) goto L32
            r1 = 4
            if (r0 != r1) goto L17
            java.lang.String r3 = "HmacSha512"
            return r3
        L17:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No getJavaxHmacName for given hash "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = " known"
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L32:
            java.lang.String r3 = "HmacSha384"
            return r3
        L35:
            java.lang.String r3 = "HmacSha256"
            return r3
        L38:
            java.lang.String r3 = "HmacSha1"
            return r3
    }

    @Override // com.google.crypto.tink.subtle.prf.StreamingPrf
    public java.io.InputStream computePrf(byte[] r2) {
            r1 = this;
            com.google.crypto.tink.subtle.prf.HkdfStreamingPrf$HkdfInputStream r0 = new com.google.crypto.tink.subtle.prf.HkdfStreamingPrf$HkdfInputStream
            r0.<init>(r1, r2)
            return r0
    }
}
