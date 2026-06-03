package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class IntegrityDialogRequest {

    /* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
    public static abstract class Builder {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract com.google.android.play.core.integrity.IntegrityDialogRequest build();

        public abstract com.google.android.play.core.integrity.IntegrityDialogRequest.Builder setActivity(android.app.Activity r1);

        public abstract com.google.android.play.core.integrity.IntegrityDialogRequest.Builder setIntegrityResponse(com.google.android.play.core.integrity.IntegrityDialogRequest.IntegrityResponse r1);

        public abstract com.google.android.play.core.integrity.IntegrityDialogRequest.Builder setTypeCode(int r1);
    }

    /* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
    public static abstract class IntegrityResponse {

        /* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
        public static final class ExceptionDetails extends com.google.android.play.core.integrity.IntegrityDialogRequest.IntegrityResponse {
            private final com.google.android.play.core.integrity.IntegrityServiceException a;

            public ExceptionDetails(com.google.android.play.core.integrity.IntegrityServiceException r2) {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r0)
                    r2.getClass()
                    r1.a = r2
                    return
            }

            public final com.google.android.play.core.integrity.IntegrityServiceException a() {
                    r1 = this;
                    com.google.android.play.core.integrity.IntegrityServiceException r0 = r1.a
                    return r0
            }

            @Override // com.google.android.play.core.integrity.IntegrityDialogRequest.IntegrityResponse
            final void b(boolean r2) {
                    r1 = this;
                    com.google.android.play.core.integrity.IntegrityServiceException r2 = r1.a
                    r0 = 1
                    r2.a(r0)
                    return
            }

            @Override // com.google.android.play.core.integrity.IntegrityDialogRequest.IntegrityResponse
            final boolean c(int r2) {
                    r1 = this;
                    r0 = 4
                    if (r2 == r0) goto L8
                    r0 = 5
                    if (r2 == r0) goto L8
                    r2 = 0
                    return r2
                L8:
                    com.google.android.play.core.integrity.IntegrityServiceException r2 = r1.a
                    boolean r2 = r2.b()
                    return r2
            }
        }

        /* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
        public static final class TokenResponse extends com.google.android.play.core.integrity.IntegrityDialogRequest.IntegrityResponse {
            private final com.google.android.play.core.integrity.IntegrityTokenResponse a;

            public TokenResponse(com.google.android.play.core.integrity.IntegrityTokenResponse r2) {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r0)
                    r2.getClass()
                    r1.a = r2
                    return
            }

            public final com.google.android.play.core.integrity.IntegrityTokenResponse a() {
                    r1 = this;
                    com.google.android.play.core.integrity.IntegrityTokenResponse r0 = r1.a
                    return r0
            }

            @Override // com.google.android.play.core.integrity.IntegrityDialogRequest.IntegrityResponse
            final void b(boolean r2) {
                    r1 = this;
                    com.google.android.play.core.integrity.IntegrityTokenResponse r2 = r1.a
                    boolean r0 = r2 instanceof com.google.android.play.core.integrity.av
                    if (r0 == 0) goto Lc
                    com.google.android.play.core.integrity.av r2 = (com.google.android.play.core.integrity.av) r2
                    r0 = 1
                    r2.b(r0)
                Lc:
                    return
            }

            @Override // com.google.android.play.core.integrity.IntegrityDialogRequest.IntegrityResponse
            final boolean c(int r2) {
                    r1 = this;
                    com.google.android.play.core.integrity.IntegrityTokenResponse r2 = r1.a
                    boolean r0 = r2 instanceof com.google.android.play.core.integrity.av
                    if (r0 == 0) goto Ld
                    com.google.android.play.core.integrity.av r2 = (com.google.android.play.core.integrity.av) r2
                    boolean r2 = r2.c()
                    return r2
                Ld:
                    r2 = 0
                    return r2
            }
        }

        private IntegrityResponse() {
                r1 = this;
                r0 = 0
                throw r0
        }

        /* synthetic */ IntegrityResponse(com.google.android.play.core.integrity.af r1) {
                r0 = this;
                r0.<init>()
                return
        }

        abstract void b(boolean r1);

        abstract boolean c(int r1);
    }

    public IntegrityDialogRequest() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.play.core.integrity.IntegrityDialogRequest.Builder builder() {
            com.google.android.play.core.integrity.c r0 = new com.google.android.play.core.integrity.c
            r0.<init>()
            return r0
    }

    public abstract android.app.Activity activity();

    public abstract com.google.android.play.core.integrity.IntegrityDialogRequest.IntegrityResponse integrityResponse();

    public abstract int typeCode();
}
