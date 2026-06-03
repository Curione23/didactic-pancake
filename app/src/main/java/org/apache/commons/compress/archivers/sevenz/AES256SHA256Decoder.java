package org.apache.commons.compress.archivers.sevenz;

/* JADX INFO: loaded from: classes2.dex */
final class AES256SHA256Decoder extends org.apache.commons.compress.archivers.sevenz.AbstractCoder {

    /* JADX INFO: renamed from: org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static final class AES256SHA256DecoderInputStream extends java.io.InputStream {
        private final java.lang.String archiveName;
        private javax.crypto.CipherInputStream cipherInputStream;
        private final org.apache.commons.compress.archivers.sevenz.Coder coder;
        private final java.io.InputStream in;
        private boolean isInitialized;
        private final byte[] passwordBytes;

        private AES256SHA256DecoderInputStream(java.io.InputStream r1, org.apache.commons.compress.archivers.sevenz.Coder r2, java.lang.String r3, byte[] r4) {
                r0 = this;
                r0.<init>()
                r0.in = r1
                r0.coder = r2
                r0.archiveName = r3
                r0.passwordBytes = r4
                return
        }

        /* synthetic */ AES256SHA256DecoderInputStream(java.io.InputStream r1, org.apache.commons.compress.archivers.sevenz.Coder r2, java.lang.String r3, byte[] r4, org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder.AnonymousClass1 r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        private javax.crypto.CipherInputStream init() throws java.io.IOException {
                r11 = this;
                boolean r0 = r11.isInitialized
                if (r0 == 0) goto L7
                javax.crypto.CipherInputStream r0 = r11.cipherInputStream
                return r0
            L7:
                org.apache.commons.compress.archivers.sevenz.Coder r0 = r11.coder
                byte[] r0 = r0.properties
                if (r0 == 0) goto Ld0
                org.apache.commons.compress.archivers.sevenz.Coder r0 = r11.coder
                byte[] r0 = r0.properties
                int r0 = r0.length
                r1 = 2
                if (r0 < r1) goto Lb9
                org.apache.commons.compress.archivers.sevenz.Coder r0 = r11.coder
                byte[] r0 = r0.properties
                r2 = 0
                r0 = r0[r2]
                r3 = r0 & 255(0xff, float:3.57E-43)
                r4 = 63
                r0 = r0 & r4
                org.apache.commons.compress.archivers.sevenz.Coder r5 = r11.coder
                byte[] r5 = r5.properties
                r6 = 1
                r5 = r5[r6]
                r7 = r5 & 255(0xff, float:3.57E-43)
                int r8 = r3 >> 6
                r8 = r8 & r6
                r5 = r5 & 15
                int r8 = r8 + r5
                int r3 = r3 >> 7
                r3 = r3 & r6
                int r5 = r7 >> 4
                int r3 = r3 + r5
                int r5 = r3 + 2
                int r7 = r5 + r8
                org.apache.commons.compress.archivers.sevenz.Coder r9 = r11.coder
                byte[] r9 = r9.properties
                int r9 = r9.length
                if (r7 > r9) goto La2
                byte[] r7 = new byte[r3]
                org.apache.commons.compress.archivers.sevenz.Coder r9 = r11.coder
                byte[] r9 = r9.properties
                java.lang.System.arraycopy(r9, r1, r7, r2, r3)
                r9 = 16
                byte[] r9 = new byte[r9]
                org.apache.commons.compress.archivers.sevenz.Coder r10 = r11.coder
                byte[] r10 = r10.properties
                java.lang.System.arraycopy(r10, r5, r9, r2, r8)
                byte[] r5 = r11.passwordBytes
                if (r5 == 0) goto L9a
                if (r0 != r4) goto L6f
                r0 = 32
                byte[] r0 = new byte[r0]
                java.lang.System.arraycopy(r7, r2, r0, r2, r3)
                byte[] r4 = r11.passwordBytes
                int r5 = r4.length
                int r7 = 32 - r3
                int r5 = java.lang.Math.min(r5, r7)
                java.lang.System.arraycopy(r4, r2, r0, r3, r5)
                goto L73
            L6f:
                byte[] r0 = org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder.sha256Password(r5, r0, r7)
            L73:
                javax.crypto.spec.SecretKeySpec r0 = org.apache.commons.compress.archivers.sevenz.AES256Options.newSecretKeySpec(r0)
                java.lang.String r2 = "AES/CBC/NoPadding"
                javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r2)     // Catch: java.security.GeneralSecurityException -> L91
                javax.crypto.spec.IvParameterSpec r3 = new javax.crypto.spec.IvParameterSpec     // Catch: java.security.GeneralSecurityException -> L91
                r3.<init>(r9)     // Catch: java.security.GeneralSecurityException -> L91
                r2.init(r1, r0, r3)     // Catch: java.security.GeneralSecurityException -> L91
                javax.crypto.CipherInputStream r0 = new javax.crypto.CipherInputStream     // Catch: java.security.GeneralSecurityException -> L91
                java.io.InputStream r1 = r11.in     // Catch: java.security.GeneralSecurityException -> L91
                r0.<init>(r1, r2)     // Catch: java.security.GeneralSecurityException -> L91
                r11.cipherInputStream = r0     // Catch: java.security.GeneralSecurityException -> L91
                r11.isInitialized = r6     // Catch: java.security.GeneralSecurityException -> L91
                return r0
            L91:
                r0 = move-exception
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Decryption error (do you have the JCE Unlimited Strength Jurisdiction Policy Files installed?)"
                r1.<init>(r2, r0)
                throw r1
            L9a:
                org.apache.commons.compress.PasswordRequiredException r0 = new org.apache.commons.compress.PasswordRequiredException
                java.lang.String r1 = r11.archiveName
                r0.<init>(r1)
                throw r0
            La2:
                java.io.IOException r0 = new java.io.IOException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Salt size + IV size too long in "
                r1.<init>(r2)
                java.lang.String r2 = r11.archiveName
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            Lb9:
                java.io.IOException r0 = new java.io.IOException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "AES256 properties too short in "
                r1.<init>(r2)
                java.lang.String r2 = r11.archiveName
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            Ld0:
                java.io.IOException r0 = new java.io.IOException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Missing AES256 properties in "
                r1.<init>(r2)
                java.lang.String r2 = r11.archiveName
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r1 = this;
                javax.crypto.CipherInputStream r0 = r1.cipherInputStream
                if (r0 == 0) goto L7
                r0.close()
            L7:
                return
        }

        @Override // java.io.InputStream
        public int read() throws java.io.IOException {
                r1 = this;
                javax.crypto.CipherInputStream r0 = r1.init()
                int r0 = r0.read()
                return r0
        }

        @Override // java.io.InputStream
        public int read(byte[] r2, int r3, int r4) throws java.io.IOException {
                r1 = this;
                javax.crypto.CipherInputStream r0 = r1.init()
                int r2 = r0.read(r2, r3, r4)
                return r2
        }
    }

    private static final class AES256SHA256DecoderOutputStream extends java.io.OutputStream {
        private final byte[] cipherBlockBuffer;
        private final int cipherBlockSize;
        private final javax.crypto.CipherOutputStream cipherOutputStream;
        private int count;

        private AES256SHA256DecoderOutputStream(org.apache.commons.compress.archivers.sevenz.AES256Options r3, java.io.OutputStream r4) {
                r2 = this;
                r2.<init>()
                javax.crypto.CipherOutputStream r0 = new javax.crypto.CipherOutputStream
                javax.crypto.Cipher r1 = r3.getCipher()
                r0.<init>(r4, r1)
                r2.cipherOutputStream = r0
                javax.crypto.Cipher r3 = r3.getCipher()
                int r3 = r3.getBlockSize()
                r2.cipherBlockSize = r3
                byte[] r3 = new byte[r3]
                r2.cipherBlockBuffer = r3
                return
        }

        /* synthetic */ AES256SHA256DecoderOutputStream(org.apache.commons.compress.archivers.sevenz.AES256Options r1, java.io.OutputStream r2, org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private void flushBuffer() throws java.io.IOException {
                r2 = this;
                javax.crypto.CipherOutputStream r0 = r2.cipherOutputStream
                byte[] r1 = r2.cipherBlockBuffer
                r0.write(r1)
                r0 = 0
                r2.count = r0
                byte[] r1 = r2.cipherBlockBuffer
                java.util.Arrays.fill(r1, r0)
                return
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r2 = this;
                int r0 = r2.count
                if (r0 <= 0) goto Lb
                javax.crypto.CipherOutputStream r0 = r2.cipherOutputStream
                byte[] r1 = r2.cipherBlockBuffer
                r0.write(r1)
            Lb:
                javax.crypto.CipherOutputStream r0 = r2.cipherOutputStream
                r0.close()
                return
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws java.io.IOException {
                r1 = this;
                javax.crypto.CipherOutputStream r0 = r1.cipherOutputStream
                r0.flush()
                return
        }

        @Override // java.io.OutputStream
        public void write(int r4) throws java.io.IOException {
                r3 = this;
                byte[] r0 = r3.cipherBlockBuffer
                int r1 = r3.count
                int r2 = r1 + 1
                r3.count = r2
                byte r4 = (byte) r4
                r0[r1] = r4
                int r4 = r3.cipherBlockSize
                if (r2 != r4) goto L12
                r3.flushBuffer()
            L12:
                return
        }

        @Override // java.io.OutputStream
        public void write(byte[] r5, int r6, int r7) throws java.io.IOException {
                r4 = this;
                int r0 = r4.count
                int r1 = r7 + r0
                int r2 = r4.cipherBlockSize
                if (r1 <= r2) goto La
                int r2 = r2 - r0
                goto Lb
            La:
                r2 = r7
            Lb:
                byte[] r1 = r4.cipherBlockBuffer
                java.lang.System.arraycopy(r5, r6, r1, r0, r2)
                int r0 = r4.count
                int r0 = r0 + r2
                r4.count = r0
                int r1 = r4.cipherBlockSize
                if (r0 != r1) goto L36
                r4.flushBuffer()
                int r0 = r7 - r2
                int r1 = r4.cipherBlockSize
                if (r0 < r1) goto L2c
                int r0 = r0 / r1
                int r0 = r0 * r1
                javax.crypto.CipherOutputStream r1 = r4.cipherOutputStream
                int r3 = r6 + r2
                r1.write(r5, r3, r0)
                int r2 = r2 + r0
            L2c:
                int r6 = r6 + r2
                byte[] r0 = r4.cipherBlockBuffer
                int r7 = r7 - r2
                r1 = 0
                java.lang.System.arraycopy(r5, r6, r0, r1, r7)
                r4.count = r7
            L36:
                return
        }
    }

    AES256SHA256Decoder() {
            r3 = this;
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<org.apache.commons.compress.archivers.sevenz.AES256Options> r2 = org.apache.commons.compress.archivers.sevenz.AES256Options.class
            r0[r1] = r2
            r3.<init>(r0)
            return
    }

    static byte[] sha256Password(byte[] r9, int r10, byte[] r11) {
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L34
            r1 = 8
            byte[] r2 = new byte[r1]
            r3 = 0
        Lc:
            r5 = 1
            long r7 = r5 << r10
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 >= 0) goto L2f
            r0.update(r11)
            r0.update(r9)
            r0.update(r2)
            r7 = 0
        L1e:
            if (r7 >= r1) goto L2d
            r8 = r2[r7]
            int r8 = r8 + 1
            byte r8 = (byte) r8
            r2[r7] = r8
            if (r8 == 0) goto L2a
            goto L2d
        L2a:
            int r7 = r7 + 1
            goto L1e
        L2d:
            long r3 = r3 + r5
            goto Lc
        L2f:
            byte[] r9 = r0.digest()
            return r9
        L34:
            r9 = move-exception
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "SHA-256 is unsupported by your Java implementation"
            r10.<init>(r11, r9)
            throw r10
    }

    static byte[] sha256Password(char[] r0, int r1, byte[] r2) {
            byte[] r0 = utf16Decode(r0)
            byte[] r0 = sha256Password(r0, r1, r2)
            return r0
    }

    static byte[] utf16Decode(char[] r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            java.nio.CharBuffer r1 = java.nio.CharBuffer.wrap(r1)
            java.nio.ByteBuffer r1 = r0.encode(r1)
            boolean r0 = r1.hasArray()
            if (r0 == 0) goto L19
            byte[] r1 = r1.array()
            return r1
        L19:
            int r0 = r1.remaining()
            byte[] r0 = new byte[r0]
            r1.get(r0)
            return r0
    }

    @Override // org.apache.commons.compress.archivers.sevenz.AbstractCoder
    java.io.InputStream decode(java.lang.String r7, java.io.InputStream r8, long r9, org.apache.commons.compress.archivers.sevenz.Coder r11, byte[] r12, int r13) {
            r6 = this;
            org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder$AES256SHA256DecoderInputStream r9 = new org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder$AES256SHA256DecoderInputStream
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r11
            r3 = r7
            r4 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            return r9
    }

    @Override // org.apache.commons.compress.archivers.sevenz.AbstractCoder
    java.io.OutputStream encode(java.io.OutputStream r3, java.lang.Object r4) throws java.io.IOException {
            r2 = this;
            org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder$AES256SHA256DecoderOutputStream r0 = new org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder$AES256SHA256DecoderOutputStream
            org.apache.commons.compress.archivers.sevenz.AES256Options r4 = (org.apache.commons.compress.archivers.sevenz.AES256Options) r4
            r1 = 0
            r0.<init>(r4, r3, r1)
            return r0
    }

    @Override // org.apache.commons.compress.archivers.sevenz.AbstractCoder
    byte[] getOptionsAsProperties(java.lang.Object r7) throws java.io.IOException {
            r6 = this;
            org.apache.commons.compress.archivers.sevenz.AES256Options r7 = (org.apache.commons.compress.archivers.sevenz.AES256Options) r7
            byte[] r0 = r7.getSalt()
            int r0 = r0.length
            r1 = 2
            int r0 = r0 + r1
            byte[] r2 = r7.getIv()
            int r2 = r2.length
            int r0 = r0 + r2
            byte[] r0 = new byte[r0]
            int r2 = r7.getNumCyclesPower()
            byte[] r3 = r7.getSalt()
            int r3 = r3.length
            r4 = 0
            if (r3 != 0) goto L1f
            r3 = r4
            goto L21
        L1f:
            r3 = 128(0x80, float:1.8E-43)
        L21:
            r2 = r2 | r3
            byte[] r3 = r7.getIv()
            int r3 = r3.length
            if (r3 != 0) goto L2b
            r3 = r4
            goto L2d
        L2b:
            r3 = 64
        L2d:
            r2 = r2 | r3
            byte r2 = (byte) r2
            r0[r4] = r2
            byte[] r2 = r7.getSalt()
            int r2 = r2.length
            if (r2 != 0) goto L3f
            byte[] r2 = r7.getIv()
            int r2 = r2.length
            if (r2 == 0) goto L82
        L3f:
            byte[] r2 = r7.getSalt()
            int r2 = r2.length
            r3 = 1
            if (r2 != 0) goto L49
            r2 = r4
            goto L4f
        L49:
            byte[] r2 = r7.getSalt()
            int r2 = r2.length
            int r2 = r2 - r3
        L4f:
            int r2 = r2 << 4
            byte[] r5 = r7.getIv()
            int r5 = r5.length
            if (r5 != 0) goto L5a
            r5 = r4
            goto L60
        L5a:
            byte[] r5 = r7.getIv()
            int r5 = r5.length
            int r5 = r5 - r3
        L60:
            r2 = r2 | r5
            byte r2 = (byte) r2
            r0[r3] = r2
            byte[] r2 = r7.getSalt()
            byte[] r3 = r7.getSalt()
            int r3 = r3.length
            java.lang.System.arraycopy(r2, r4, r0, r1, r3)
            byte[] r2 = r7.getIv()
            byte[] r3 = r7.getSalt()
            int r3 = r3.length
            int r3 = r3 + r1
            byte[] r7 = r7.getIv()
            int r7 = r7.length
            java.lang.System.arraycopy(r2, r4, r0, r3, r7)
        L82:
            return r0
    }
}
