package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PKWareExtraHeader implements org.apache.commons.compress.archivers.zip.ZipExtraField {
    private byte[] centralData;
    private final org.apache.commons.compress.archivers.zip.ZipShort headerId;
    private byte[] localData;

    public enum EncryptionAlgorithm extends java.lang.Enum<org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm> {
        private static final /* synthetic */ org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm[] $VALUES = null;
        public static final org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm AES128 = null;
        public static final org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm AES192 = null;
        public static final org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm AES256 = null;
        public static final org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm DES = null;
        public static final org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm RC2 = null;
        public static final org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm RC2pre52 = null;
        public static final org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm RC4 = null;
        public static final org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm TripleDES168 = null;
        public static final org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm TripleDES192 = null;
        public static final org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm UNKNOWN = null;
        private static final java.util.Map<java.lang.Integer, org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm> codeToEnum = null;
        private final int code;

        private static /* synthetic */ org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm[] $values() {
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm r0 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.DES
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm r1 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.RC2pre52
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm r2 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.TripleDES168
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm r3 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.TripleDES192
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm r4 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.AES128
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm r5 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.AES192
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm r6 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.AES256
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm r7 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.RC2
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm r8 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.RC4
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm r9 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.UNKNOWN
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm[] r0 = new org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9}
                return r0
        }

        static {
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm r0 = new org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm
                r1 = 26113(0x6601, float:3.6592E-41)
                java.lang.String r2 = "DES"
                r3 = 0
                r0.<init>(r2, r3, r1)
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.DES = r0
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm r0 = new org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm
                r1 = 1
                r2 = 26114(0x6602, float:3.6594E-41)
                java.lang.String r4 = "RC2pre52"
                r0.<init>(r4, r1, r2)
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.RC2pre52 = r0
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm r0 = new org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm
                r1 = 2
                r2 = 26115(0x6603, float:3.6595E-41)
                java.lang.String r4 = "TripleDES168"
                r0.<init>(r4, r1, r2)
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.TripleDES168 = r0
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm r0 = new org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm
                r1 = 3
                r2 = 26121(0x6609, float:3.6603E-41)
                java.lang.String r4 = "TripleDES192"
                r0.<init>(r4, r1, r2)
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.TripleDES192 = r0
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm r0 = new org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm
                r1 = 4
                r2 = 26126(0x660e, float:3.661E-41)
                java.lang.String r4 = "AES128"
                r0.<init>(r4, r1, r2)
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.AES128 = r0
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm r0 = new org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm
                r1 = 5
                r2 = 26127(0x660f, float:3.6612E-41)
                java.lang.String r4 = "AES192"
                r0.<init>(r4, r1, r2)
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.AES192 = r0
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm r0 = new org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm
                r1 = 6
                r2 = 26128(0x6610, float:3.6613E-41)
                java.lang.String r4 = "AES256"
                r0.<init>(r4, r1, r2)
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.AES256 = r0
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm r0 = new org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm
                r1 = 7
                r2 = 26370(0x6702, float:3.6952E-41)
                java.lang.String r4 = "RC2"
                r0.<init>(r4, r1, r2)
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.RC2 = r0
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm r0 = new org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm
                r1 = 8
                r2 = 26625(0x6801, float:3.731E-41)
                java.lang.String r4 = "RC4"
                r0.<init>(r4, r1, r2)
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.RC4 = r0
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm r0 = new org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm
                r1 = 9
                r2 = 65535(0xffff, float:9.1834E-41)
                java.lang.String r4 = "UNKNOWN"
                r0.<init>(r4, r1, r2)
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.UNKNOWN = r0
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm[] r0 = $values()
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.$VALUES = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm[] r1 = values()
                int r2 = r1.length
            L8b:
                if (r3 >= r2) goto L9d
                r4 = r1[r3]
                int r5 = r4.getCode()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r0.put(r5, r4)
                int r3 = r3 + 1
                goto L8b
            L9d:
                java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.codeToEnum = r0
                return
        }

        EncryptionAlgorithm(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.code = r3
                return
        }

        public static org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm getAlgorithmByCode(int r1) {
                java.util.Map<java.lang.Integer, org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm> r0 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.codeToEnum
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Object r1 = r0.get(r1)
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm r1 = (org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm) r1
                return r1
        }

        public static org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm valueOf(java.lang.String r1) {
                java.lang.Class<org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm> r0 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm r1 = (org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm) r1
                return r1
        }

        public static org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm[] values() {
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm[] r0 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.$VALUES
                java.lang.Object r0 = r0.clone()
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm[] r0 = (org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm[]) r0
                return r0
        }

        public int getCode() {
                r1 = this;
                int r0 = r1.code
                return r0
        }
    }

    public enum HashAlgorithm extends java.lang.Enum<org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm> {
        private static final /* synthetic */ org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm[] $VALUES = null;
        public static final org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm CRC32 = null;
        public static final org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm MD5 = null;
        public static final org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm NONE = null;
        public static final org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm RIPEND160 = null;
        public static final org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm SHA1 = null;
        public static final org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm SHA256 = null;
        public static final org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm SHA384 = null;
        public static final org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm SHA512 = null;
        private static final java.util.Map<java.lang.Integer, org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm> codeToEnum = null;
        private final int code;

        private static /* synthetic */ org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm[] $values() {
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$HashAlgorithm r0 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.NONE
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$HashAlgorithm r1 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.CRC32
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$HashAlgorithm r2 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.MD5
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$HashAlgorithm r3 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.SHA1
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$HashAlgorithm r4 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.RIPEND160
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$HashAlgorithm r5 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.SHA256
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$HashAlgorithm r6 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.SHA384
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$HashAlgorithm r7 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.SHA512
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$HashAlgorithm[] r0 = new org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm[]{r0, r1, r2, r3, r4, r5, r6, r7}
                return r0
        }

        static {
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$HashAlgorithm r0 = new org.apache.commons.compress.archivers.zip.PKWareExtraHeader$HashAlgorithm
                java.lang.String r1 = "NONE"
                r2 = 0
                r0.<init>(r1, r2, r2)
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.NONE = r0
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$HashAlgorithm r0 = new org.apache.commons.compress.archivers.zip.PKWareExtraHeader$HashAlgorithm
                java.lang.String r1 = "CRC32"
                r3 = 1
                r0.<init>(r1, r3, r3)
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.CRC32 = r0
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$HashAlgorithm r0 = new org.apache.commons.compress.archivers.zip.PKWareExtraHeader$HashAlgorithm
                r1 = 2
                r3 = 32771(0x8003, float:4.5922E-41)
                java.lang.String r4 = "MD5"
                r0.<init>(r4, r1, r3)
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.MD5 = r0
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$HashAlgorithm r0 = new org.apache.commons.compress.archivers.zip.PKWareExtraHeader$HashAlgorithm
                r1 = 3
                r3 = 32772(0x8004, float:4.5923E-41)
                java.lang.String r4 = "SHA1"
                r0.<init>(r4, r1, r3)
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.SHA1 = r0
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$HashAlgorithm r0 = new org.apache.commons.compress.archivers.zip.PKWareExtraHeader$HashAlgorithm
                r1 = 4
                r3 = 32775(0x8007, float:4.5928E-41)
                java.lang.String r4 = "RIPEND160"
                r0.<init>(r4, r1, r3)
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.RIPEND160 = r0
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$HashAlgorithm r0 = new org.apache.commons.compress.archivers.zip.PKWareExtraHeader$HashAlgorithm
                r1 = 5
                r3 = 32780(0x800c, float:4.5935E-41)
                java.lang.String r4 = "SHA256"
                r0.<init>(r4, r1, r3)
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.SHA256 = r0
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$HashAlgorithm r0 = new org.apache.commons.compress.archivers.zip.PKWareExtraHeader$HashAlgorithm
                r1 = 6
                r3 = 32781(0x800d, float:4.5936E-41)
                java.lang.String r4 = "SHA384"
                r0.<init>(r4, r1, r3)
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.SHA384 = r0
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$HashAlgorithm r0 = new org.apache.commons.compress.archivers.zip.PKWareExtraHeader$HashAlgorithm
                r1 = 7
                r3 = 32782(0x800e, float:4.5937E-41)
                java.lang.String r4 = "SHA512"
                r0.<init>(r4, r1, r3)
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.SHA512 = r0
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$HashAlgorithm[] r0 = $values()
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.$VALUES = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$HashAlgorithm[] r1 = values()
                int r3 = r1.length
            L72:
                if (r2 >= r3) goto L84
                r4 = r1[r2]
                int r5 = r4.getCode()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r0.put(r5, r4)
                int r2 = r2 + 1
                goto L72
            L84:
                java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.codeToEnum = r0
                return
        }

        HashAlgorithm(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.code = r3
                return
        }

        public static org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm getAlgorithmByCode(int r1) {
                java.util.Map<java.lang.Integer, org.apache.commons.compress.archivers.zip.PKWareExtraHeader$HashAlgorithm> r0 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.codeToEnum
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Object r1 = r0.get(r1)
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$HashAlgorithm r1 = (org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm) r1
                return r1
        }

        public static org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm valueOf(java.lang.String r1) {
                java.lang.Class<org.apache.commons.compress.archivers.zip.PKWareExtraHeader$HashAlgorithm> r0 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$HashAlgorithm r1 = (org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm) r1
                return r1
        }

        public static org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm[] values() {
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$HashAlgorithm[] r0 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.$VALUES
                java.lang.Object r0 = r0.clone()
                org.apache.commons.compress.archivers.zip.PKWareExtraHeader$HashAlgorithm[] r0 = (org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm[]) r0
                return r0
        }

        public int getCode() {
                r1 = this;
                int r0 = r1.code
                return r0
        }
    }

    protected PKWareExtraHeader(org.apache.commons.compress.archivers.zip.ZipShort r1) {
            r0 = this;
            r0.<init>()
            r0.headerId = r1
            return
    }

    protected final void assertMinimalLength(int r4, int r5) throws java.util.zip.ZipException {
            r3 = this;
            if (r5 < r4) goto L3
            return
        L3:
            java.util.zip.ZipException r0 = new java.util.zip.ZipException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r2 = r3.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " is too short, only "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r1 = " bytes, expected at least "
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public byte[] getCentralDirectoryData() {
            r1 = this;
            byte[] r0 = r1.centralData
            if (r0 == 0) goto L9
            byte[] r0 = org.apache.commons.compress.archivers.zip.ZipUtil.copy(r0)
            return r0
        L9:
            byte[] r0 = r1.getLocalFileDataData()
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public org.apache.commons.compress.archivers.zip.ZipShort getCentralDirectoryLength() {
            r2 = this;
            byte[] r0 = r2.centralData
            if (r0 == 0) goto Ld
            org.apache.commons.compress.archivers.zip.ZipShort r0 = new org.apache.commons.compress.archivers.zip.ZipShort
            byte[] r1 = r2.centralData
            int r1 = r1.length
            r0.<init>(r1)
            return r0
        Ld:
            org.apache.commons.compress.archivers.zip.ZipShort r0 = r2.getLocalFileDataLength()
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public org.apache.commons.compress.archivers.zip.ZipShort getHeaderId() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipShort r0 = r1.headerId
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public byte[] getLocalFileDataData() {
            r1 = this;
            byte[] r0 = r1.localData
            byte[] r0 = org.apache.commons.compress.archivers.zip.ZipUtil.copy(r0)
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public org.apache.commons.compress.archivers.zip.ZipShort getLocalFileDataLength() {
            r2 = this;
            org.apache.commons.compress.archivers.zip.ZipShort r0 = new org.apache.commons.compress.archivers.zip.ZipShort
            byte[] r1 = r2.localData
            if (r1 == 0) goto L8
            int r1 = r1.length
            goto L9
        L8:
            r1 = 0
        L9:
            r0.<init>(r1)
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public void parseFromCentralDirectoryData(byte[] r1, int r2, int r3) throws java.util.zip.ZipException {
            r0 = this;
            int r3 = r3 + r2
            byte[] r1 = java.util.Arrays.copyOfRange(r1, r2, r3)
            r0.setCentralDirectoryData(r1)
            byte[] r2 = r0.localData
            if (r2 != 0) goto Lf
            r0.setLocalFileDataData(r1)
        Lf:
            return
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public void parseFromLocalFileData(byte[] r1, int r2, int r3) throws java.util.zip.ZipException {
            r0 = this;
            int r3 = r3 + r2
            byte[] r1 = java.util.Arrays.copyOfRange(r1, r2, r3)
            r0.setLocalFileDataData(r1)
            return
    }

    public void setCentralDirectoryData(byte[] r1) {
            r0 = this;
            byte[] r1 = org.apache.commons.compress.archivers.zip.ZipUtil.copy(r1)
            r0.centralData = r1
            return
    }

    public void setLocalFileDataData(byte[] r1) {
            r0 = this;
            byte[] r1 = org.apache.commons.compress.archivers.zip.ZipUtil.copy(r1)
            r0.localData = r1
            return
    }
}
