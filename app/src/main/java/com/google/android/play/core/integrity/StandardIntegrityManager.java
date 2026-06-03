package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
public interface StandardIntegrityManager {

    /* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
    public static abstract class PrepareIntegrityTokenRequest {

        /* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
        public static abstract class Builder {
            public Builder() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public abstract com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest build();

            public abstract com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setCloudProjectNumber(long r1);

            public abstract com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setWebViewRequestMode(int r1);
        }

        public PrepareIntegrityTokenRequest() {
                r0 = this;
                r0.<init>()
                return
        }

        public static com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder builder() {
                com.google.android.play.core.integrity.i r0 = new com.google.android.play.core.integrity.i
                r0.<init>()
                r1 = 0
                r0.setWebViewRequestMode(r1)
                return r0
        }

        public abstract int a();

        public abstract long b();

        abstract java.lang.String c();
    }

    /* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
    public static abstract class StandardIntegrityDialogRequest {

        /* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
        public static abstract class Builder {
            public Builder() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public abstract com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityDialogRequest build();

            public abstract com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityDialogRequest.Builder setActivity(android.app.Activity r1);

            public abstract com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityDialogRequest.Builder setStandardIntegrityResponse(com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityDialogRequest.StandardIntegrityResponse r1);

            public abstract com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityDialogRequest.Builder setTypeCode(int r1);
        }

        /* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
        public static abstract class StandardIntegrityResponse {

            /* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
            public static final class ExceptionDetails extends com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityDialogRequest.StandardIntegrityResponse {
                private final com.google.android.play.core.integrity.StandardIntegrityException a;

                public ExceptionDetails(com.google.android.play.core.integrity.StandardIntegrityException r2) {
                        r1 = this;
                        r0 = 0
                        r1.<init>(r0)
                        r2.getClass()
                        r1.a = r2
                        return
                }

                @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityDialogRequest.StandardIntegrityResponse
                final void a(boolean r2) {
                        r1 = this;
                        com.google.android.play.core.integrity.StandardIntegrityException r2 = r1.a
                        r0 = 1
                        r2.a(r0)
                        return
                }

                @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityDialogRequest.StandardIntegrityResponse
                final boolean b(int r2) {
                        r1 = this;
                        r0 = 4
                        if (r2 == r0) goto L8
                        r0 = 5
                        if (r2 == r0) goto L8
                        r2 = 0
                        return r2
                    L8:
                        com.google.android.play.core.integrity.StandardIntegrityException r2 = r1.a
                        boolean r2 = r2.b()
                        return r2
                }

                public com.google.android.play.core.integrity.StandardIntegrityException getException() {
                        r1 = this;
                        com.google.android.play.core.integrity.StandardIntegrityException r0 = r1.a
                        return r0
                }
            }

            /* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
            public static final class TokenResponse extends com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityDialogRequest.StandardIntegrityResponse {
                private final com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken a;

                public TokenResponse(com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken r2) {
                        r1 = this;
                        r0 = 0
                        r1.<init>(r0)
                        r2.getClass()
                        r1.a = r2
                        return
                }

                @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityDialogRequest.StandardIntegrityResponse
                final void a(boolean r2) {
                        r1 = this;
                        com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityToken r2 = r1.a
                        boolean r0 = r2 instanceof com.google.android.play.core.integrity.bw
                        if (r0 == 0) goto Lc
                        com.google.android.play.core.integrity.bw r2 = (com.google.android.play.core.integrity.bw) r2
                        r0 = 1
                        r2.b(r0)
                    Lc:
                        return
                }

                @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityDialogRequest.StandardIntegrityResponse
                final boolean b(int r2) {
                        r1 = this;
                        com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityToken r2 = r1.a
                        boolean r0 = r2 instanceof com.google.android.play.core.integrity.bw
                        if (r0 == 0) goto Ld
                        com.google.android.play.core.integrity.bw r2 = (com.google.android.play.core.integrity.bw) r2
                        boolean r2 = r2.c()
                        return r2
                    Ld:
                        r2 = 0
                        return r2
                }

                public com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken getToken() {
                        r1 = this;
                        com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityToken r0 = r1.a
                        return r0
                }
            }

            private StandardIntegrityResponse() {
                    r1 = this;
                    r0 = 0
                    throw r0
            }

            /* synthetic */ StandardIntegrityResponse(com.google.android.play.core.integrity.bc r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }

            abstract void a(boolean r1);

            abstract boolean b(int r1);
        }

        public StandardIntegrityDialogRequest() {
                r0 = this;
                r0.<init>()
                return
        }

        public static com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityDialogRequest.Builder builder() {
                com.google.android.play.core.integrity.l r0 = new com.google.android.play.core.integrity.l
                r0.<init>()
                return r0
        }

        public abstract android.app.Activity activity();

        public abstract com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityDialogRequest.StandardIntegrityResponse standardIntegrityResponse();

        public abstract int typeCode();
    }

    /* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
    public static abstract class StandardIntegrityToken {
        public StandardIntegrityToken() {
                r0 = this;
                r0.<init>()
                return
        }

        @java.lang.Deprecated
        public abstract com.google.android.gms.tasks.Task<java.lang.Integer> showDialog(android.app.Activity r1, int r2);

        public abstract java.lang.String token();
    }

    /* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
    public interface StandardIntegrityTokenProvider {
        com.google.android.gms.tasks.Task<com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken> request(com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest r1);
    }

    /* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
    public static abstract class StandardIntegrityTokenRequest {

        /* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
        public static abstract class Builder {
            public Builder() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public abstract com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest build();

            public abstract com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder setRequestHash(java.lang.String r1);

            public abstract com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder setVerdictOptOut(java.util.Set<java.lang.Integer> r1);
        }

        public StandardIntegrityTokenRequest() {
                r0 = this;
                r0.<init>()
                return
        }

        public static com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder builder() {
                com.google.android.play.core.integrity.o r0 = new com.google.android.play.core.integrity.o
                r0.<init>()
                com.google.android.play.integrity.internal.aq r1 = com.google.android.play.integrity.internal.aq.h()
                r0.setVerdictOptOut(r1)
                return r0
        }

        public abstract java.lang.String requestHash();

        public abstract java.util.Set<java.lang.Integer> verdictOptOut();
    }

    com.google.android.gms.tasks.Task<com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider> prepareIntegrityToken(com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest r1);

    com.google.android.gms.tasks.Task<java.lang.Integer> showDialog(com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityDialogRequest r1);
}
