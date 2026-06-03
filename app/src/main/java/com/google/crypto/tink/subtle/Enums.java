package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes2.dex */
public final class Enums {

    public enum HashType extends java.lang.Enum<com.google.crypto.tink.subtle.Enums.HashType> {
        private static final /* synthetic */ com.google.crypto.tink.subtle.Enums.HashType[] $VALUES = null;
        public static final com.google.crypto.tink.subtle.Enums.HashType SHA1 = null;
        public static final com.google.crypto.tink.subtle.Enums.HashType SHA224 = null;
        public static final com.google.crypto.tink.subtle.Enums.HashType SHA256 = null;
        public static final com.google.crypto.tink.subtle.Enums.HashType SHA384 = null;
        public static final com.google.crypto.tink.subtle.Enums.HashType SHA512 = null;

        static {
                com.google.crypto.tink.subtle.Enums$HashType r0 = new com.google.crypto.tink.subtle.Enums$HashType
                java.lang.String r1 = "SHA1"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.crypto.tink.subtle.Enums.HashType.SHA1 = r0
                com.google.crypto.tink.subtle.Enums$HashType r1 = new com.google.crypto.tink.subtle.Enums$HashType
                java.lang.String r2 = "SHA224"
                r3 = 1
                r1.<init>(r2, r3)
                com.google.crypto.tink.subtle.Enums.HashType.SHA224 = r1
                com.google.crypto.tink.subtle.Enums$HashType r2 = new com.google.crypto.tink.subtle.Enums$HashType
                java.lang.String r3 = "SHA256"
                r4 = 2
                r2.<init>(r3, r4)
                com.google.crypto.tink.subtle.Enums.HashType.SHA256 = r2
                com.google.crypto.tink.subtle.Enums$HashType r3 = new com.google.crypto.tink.subtle.Enums$HashType
                java.lang.String r4 = "SHA384"
                r5 = 3
                r3.<init>(r4, r5)
                com.google.crypto.tink.subtle.Enums.HashType.SHA384 = r3
                com.google.crypto.tink.subtle.Enums$HashType r4 = new com.google.crypto.tink.subtle.Enums$HashType
                java.lang.String r5 = "SHA512"
                r6 = 4
                r4.<init>(r5, r6)
                com.google.crypto.tink.subtle.Enums.HashType.SHA512 = r4
                com.google.crypto.tink.subtle.Enums$HashType[] r0 = new com.google.crypto.tink.subtle.Enums.HashType[]{r0, r1, r2, r3, r4}
                com.google.crypto.tink.subtle.Enums.HashType.$VALUES = r0
                return
        }

        HashType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.crypto.tink.subtle.Enums.HashType valueOf(java.lang.String r1) {
                java.lang.Class<com.google.crypto.tink.subtle.Enums$HashType> r0 = com.google.crypto.tink.subtle.Enums.HashType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.crypto.tink.subtle.Enums$HashType r1 = (com.google.crypto.tink.subtle.Enums.HashType) r1
                return r1
        }

        public static com.google.crypto.tink.subtle.Enums.HashType[] values() {
                com.google.crypto.tink.subtle.Enums$HashType[] r0 = com.google.crypto.tink.subtle.Enums.HashType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.crypto.tink.subtle.Enums$HashType[] r0 = (com.google.crypto.tink.subtle.Enums.HashType[]) r0
                return r0
        }
    }

    private Enums() {
            r0 = this;
            r0.<init>()
            return
    }
}
