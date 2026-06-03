package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
public final class MessageDigestInputStream extends org.apache.commons.io.input.ObservableInputStream {
    private final java.security.MessageDigest messageDigest;

    /* JADX INFO: renamed from: org.apache.commons.io.input.MessageDigestInputStream$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder extends org.apache.commons.io.build.AbstractStreamBuilder<org.apache.commons.io.input.MessageDigestInputStream, org.apache.commons.io.input.MessageDigestInputStream.Builder> {
        private java.security.MessageDigest messageDigest;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public /* bridge */ /* synthetic */ java.lang.Object get() throws java.io.IOException {
                r1 = this;
                org.apache.commons.io.input.MessageDigestInputStream r0 = r1.get()
                return r0
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public org.apache.commons.io.input.MessageDigestInputStream get() throws java.io.IOException {
                r4 = this;
                org.apache.commons.io.input.MessageDigestInputStream r0 = new org.apache.commons.io.input.MessageDigestInputStream
                java.io.InputStream r1 = r4.getInputStream()
                java.security.MessageDigest r2 = r4.messageDigest
                r3 = 0
                r0.<init>(r1, r2, r3)
                return r0
        }

        public org.apache.commons.io.input.MessageDigestInputStream.Builder setMessageDigest(java.lang.String r1) throws java.security.NoSuchAlgorithmException {
                r0 = this;
                java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)
                r0.messageDigest = r1
                return r0
        }

        public org.apache.commons.io.input.MessageDigestInputStream.Builder setMessageDigest(java.security.MessageDigest r1) {
                r0 = this;
                r0.messageDigest = r1
                return r0
        }
    }

    public static class MessageDigestMaintainingObserver extends org.apache.commons.io.input.ObservableInputStream.Observer {
        private final java.security.MessageDigest messageDigest;

        public MessageDigestMaintainingObserver(java.security.MessageDigest r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "messageDigest"
                java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
                java.security.MessageDigest r2 = (java.security.MessageDigest) r2
                r1.messageDigest = r2
                return
        }

        @Override // org.apache.commons.io.input.ObservableInputStream.Observer
        public void data(int r2) throws java.io.IOException {
                r1 = this;
                java.security.MessageDigest r0 = r1.messageDigest
                byte r2 = (byte) r2
                r0.update(r2)
                return
        }

        @Override // org.apache.commons.io.input.ObservableInputStream.Observer
        public void data(byte[] r2, int r3, int r4) throws java.io.IOException {
                r1 = this;
                java.security.MessageDigest r0 = r1.messageDigest
                r0.update(r2, r3, r4)
                return
        }
    }

    private MessageDigestInputStream(java.io.InputStream r4, java.security.MessageDigest r5) {
            r3 = this;
            r0 = 1
            org.apache.commons.io.input.ObservableInputStream$Observer[] r0 = new org.apache.commons.io.input.ObservableInputStream.Observer[r0]
            org.apache.commons.io.input.MessageDigestInputStream$MessageDigestMaintainingObserver r1 = new org.apache.commons.io.input.MessageDigestInputStream$MessageDigestMaintainingObserver
            r1.<init>(r5)
            r2 = 0
            r0[r2] = r1
            r3.<init>(r4, r0)
            r3.messageDigest = r5
            return
    }

    /* synthetic */ MessageDigestInputStream(java.io.InputStream r1, java.security.MessageDigest r2, org.apache.commons.io.input.MessageDigestInputStream.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static org.apache.commons.io.input.MessageDigestInputStream.Builder builder() {
            org.apache.commons.io.input.MessageDigestInputStream$Builder r0 = new org.apache.commons.io.input.MessageDigestInputStream$Builder
            r0.<init>()
            return r0
    }

    public java.security.MessageDigest getMessageDigest() {
            r1 = this;
            java.security.MessageDigest r0 = r1.messageDigest
            return r0
    }
}
