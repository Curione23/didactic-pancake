package com.google.crypto.tink.aead;

/* JADX INFO: loaded from: classes2.dex */
public final class ChaCha20Poly1305Parameters extends com.google.crypto.tink.aead.AeadParameters {
    private final com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.Variant variant;

    @com.google.errorprone.annotations.Immutable
    public static final class Variant {
        public static final com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.Variant CRUNCHY = null;
        public static final com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.Variant NO_PREFIX = null;
        public static final com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.Variant TINK = null;
        private final java.lang.String name;

        static {
                com.google.crypto.tink.aead.ChaCha20Poly1305Parameters$Variant r0 = new com.google.crypto.tink.aead.ChaCha20Poly1305Parameters$Variant
                java.lang.String r1 = "TINK"
                r0.<init>(r1)
                com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.Variant.TINK = r0
                com.google.crypto.tink.aead.ChaCha20Poly1305Parameters$Variant r0 = new com.google.crypto.tink.aead.ChaCha20Poly1305Parameters$Variant
                java.lang.String r1 = "CRUNCHY"
                r0.<init>(r1)
                com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.Variant.CRUNCHY = r0
                com.google.crypto.tink.aead.ChaCha20Poly1305Parameters$Variant r0 = new com.google.crypto.tink.aead.ChaCha20Poly1305Parameters$Variant
                java.lang.String r1 = "NO_PREFIX"
                r0.<init>(r1)
                com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.Variant.NO_PREFIX = r0
                return
        }

        private Variant(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                return
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }
    }

    private ChaCha20Poly1305Parameters(com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.Variant r1) {
            r0 = this;
            r0.<init>()
            r0.variant = r1
            return
    }

    public static com.google.crypto.tink.aead.ChaCha20Poly1305Parameters create() {
            com.google.crypto.tink.aead.ChaCha20Poly1305Parameters r0 = new com.google.crypto.tink.aead.ChaCha20Poly1305Parameters
            com.google.crypto.tink.aead.ChaCha20Poly1305Parameters$Variant r1 = com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.Variant.NO_PREFIX
            r0.<init>(r1)
            return r0
    }

    public static com.google.crypto.tink.aead.ChaCha20Poly1305Parameters create(com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.Variant r1) {
            com.google.crypto.tink.aead.ChaCha20Poly1305Parameters r0 = new com.google.crypto.tink.aead.ChaCha20Poly1305Parameters
            r0.<init>(r1)
            return r0
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof com.google.crypto.tink.aead.ChaCha20Poly1305Parameters
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.crypto.tink.aead.ChaCha20Poly1305Parameters r3 = (com.google.crypto.tink.aead.ChaCha20Poly1305Parameters) r3
            com.google.crypto.tink.aead.ChaCha20Poly1305Parameters$Variant r3 = r3.getVariant()
            com.google.crypto.tink.aead.ChaCha20Poly1305Parameters$Variant r0 = r2.getVariant()
            if (r3 != r0) goto L13
            r1 = 1
        L13:
            return r1
    }

    public com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.Variant getVariant() {
            r1 = this;
            com.google.crypto.tink.aead.ChaCha20Poly1305Parameters$Variant r0 = r1.variant
            return r0
    }

    @Override // com.google.crypto.tink.Parameters
    public boolean hasIdRequirement() {
            r2 = this;
            com.google.crypto.tink.aead.ChaCha20Poly1305Parameters$Variant r0 = r2.variant
            com.google.crypto.tink.aead.ChaCha20Poly1305Parameters$Variant r1 = com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.Variant.NO_PREFIX
            if (r0 == r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public int hashCode() {
            r1 = this;
            com.google.crypto.tink.aead.ChaCha20Poly1305Parameters$Variant r0 = r1.variant
            int r0 = java.util.Objects.hashCode(r0)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ChaCha20Poly1305 Parameters (variant: "
            r0.<init>(r1)
            com.google.crypto.tink.aead.ChaCha20Poly1305Parameters$Variant r1 = r2.variant
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
