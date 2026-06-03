package net.openid.appauth;

/* JADX INFO: loaded from: classes2.dex */
public interface ClientAuthentication {

    public static class UnsupportedAuthenticationMethod extends java.lang.Exception {
        private java.lang.String mAuthMethod;

        public UnsupportedAuthenticationMethod(java.lang.String r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Unsupported client authentication method: "
                r0.<init>(r1)
                java.lang.StringBuilder r0 = r0.append(r3)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                r2.mAuthMethod = r3
                return
        }

        public java.lang.String getUnsupportedAuthenticationMethod() {
                r1 = this;
                java.lang.String r0 = r1.mAuthMethod
                return r0
        }
    }

    java.util.Map<java.lang.String, java.lang.String> getRequestHeaders(java.lang.String r1);

    java.util.Map<java.lang.String, java.lang.String> getRequestParameters(java.lang.String r1);
}
