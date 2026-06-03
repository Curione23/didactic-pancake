package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class IntegrityTokenRequest {

    /* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
    public static abstract class Builder {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract com.google.android.play.core.integrity.IntegrityTokenRequest build();

        public abstract com.google.android.play.core.integrity.IntegrityTokenRequest.Builder setCloudProjectNumber(long r1);

        public abstract com.google.android.play.core.integrity.IntegrityTokenRequest.Builder setNonce(java.lang.String r1);
    }

    public IntegrityTokenRequest() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.play.core.integrity.IntegrityTokenRequest.Builder builder() {
            com.google.android.play.core.integrity.f r0 = new com.google.android.play.core.integrity.f
            r0.<init>()
            return r0
    }

    public abstract java.lang.Long cloudProjectNumber();

    public abstract java.lang.String nonce();
}
