package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class MessageDigestCalculatingInputStream extends org.apache.commons.io.input.ObservableInputStream {
    private static final java.lang.String DEFAULT_ALGORITHM = "MD5";
    private final java.security.MessageDigest messageDigest;

    public static class Builder extends org.apache.commons.io.build.AbstractStreamBuilder<org.apache.commons.io.input.MessageDigestCalculatingInputStream, org.apache.commons.io.input.MessageDigestCalculatingInputStream.Builder> {
        private java.security.MessageDigest messageDigest;

        public Builder() {
                r2 = this;
                r2.<init>()
                java.security.MessageDigest r0 = org.apache.commons.io.input.MessageDigestCalculatingInputStream.getDefaultMessageDigest()     // Catch: java.security.NoSuchAlgorithmException -> La
                r2.messageDigest = r0     // Catch: java.security.NoSuchAlgorithmException -> La
                return
            La:
                r0 = move-exception
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>(r0)
                throw r1
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public /* bridge */ /* synthetic */ java.lang.Object get() throws java.io.IOException {
                r1 = this;
                org.apache.commons.io.input.MessageDigestCalculatingInputStream r0 = r1.get()
                return r0
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public org.apache.commons.io.input.MessageDigestCalculatingInputStream get() throws java.io.IOException {
                r3 = this;
                org.apache.commons.io.input.MessageDigestCalculatingInputStream r0 = new org.apache.commons.io.input.MessageDigestCalculatingInputStream
                java.io.InputStream r1 = r3.getInputStream()
                java.security.MessageDigest r2 = r3.messageDigest
                r0.<init>(r1, r2)
                return r0
        }

        public void setMessageDigest(java.lang.String r1) throws java.security.NoSuchAlgorithmException {
                r0 = this;
                java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)
                r0.messageDigest = r1
                return
        }

        public void setMessageDigest(java.security.MessageDigest r1) {
                r0 = this;
                r0.messageDigest = r1
                return
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

    @java.lang.Deprecated
    public MessageDigestCalculatingInputStream(java.io.InputStream r2) throws java.security.NoSuchAlgorithmException {
            r1 = this;
            java.security.MessageDigest r0 = getDefaultMessageDigest()
            r1.<init>(r2, r0)
            return
    }

    @java.lang.Deprecated
    public MessageDigestCalculatingInputStream(java.io.InputStream r1, java.lang.String r2) throws java.security.NoSuchAlgorithmException {
            r0 = this;
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)
            r0.<init>(r1, r2)
            return
    }

    @java.lang.Deprecated
    public MessageDigestCalculatingInputStream(java.io.InputStream r4, java.security.MessageDigest r5) {
            r3 = this;
            r0 = 1
            org.apache.commons.io.input.ObservableInputStream$Observer[] r0 = new org.apache.commons.io.input.ObservableInputStream.Observer[r0]
            org.apache.commons.io.input.MessageDigestCalculatingInputStream$MessageDigestMaintainingObserver r1 = new org.apache.commons.io.input.MessageDigestCalculatingInputStream$MessageDigestMaintainingObserver
            r1.<init>(r5)
            r2 = 0
            r0[r2] = r1
            r3.<init>(r4, r0)
            r3.messageDigest = r5
            return
    }

    public static org.apache.commons.io.input.MessageDigestCalculatingInputStream.Builder builder() {
            org.apache.commons.io.input.MessageDigestCalculatingInputStream$Builder r0 = new org.apache.commons.io.input.MessageDigestCalculatingInputStream$Builder
            r0.<init>()
            return r0
    }

    static java.security.MessageDigest getDefaultMessageDigest() throws java.security.NoSuchAlgorithmException {
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)
            return r0
    }

    public java.security.MessageDigest getMessageDigest() {
            r1 = this;
            java.security.MessageDigest r0 = r1.messageDigest
            return r0
    }
}
