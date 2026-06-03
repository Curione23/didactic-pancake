package net.openid.appauth;

/* JADX INFO: loaded from: classes2.dex */
public class EndSessionResponse extends net.openid.appauth.AuthorizationManagementResponse {
    public static final java.lang.String EXTRA_RESPONSE = "net.openid.appauth.EndSessionResponse";
    static final java.lang.String KEY_REQUEST = "request";
    static final java.lang.String KEY_STATE = "state";
    public final net.openid.appauth.EndSessionRequest request;
    public final java.lang.String state;

    /* JADX INFO: renamed from: net.openid.appauth.EndSessionResponse$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private net.openid.appauth.EndSessionRequest mRequest;
        private java.lang.String mState;

        public Builder(net.openid.appauth.EndSessionRequest r1) {
                r0 = this;
                r0.<init>()
                r0.setRequest(r1)
                return
        }

        public net.openid.appauth.EndSessionResponse build() {
                r4 = this;
                net.openid.appauth.EndSessionResponse r0 = new net.openid.appauth.EndSessionResponse
                net.openid.appauth.EndSessionRequest r1 = r4.mRequest
                java.lang.String r2 = r4.mState
                r3 = 0
                r0.<init>(r1, r2, r3)
                return r0
        }

        net.openid.appauth.EndSessionResponse.Builder fromUri(android.net.Uri r2) {
                r1 = this;
                java.lang.String r0 = "state"
                java.lang.String r2 = r2.getQueryParameter(r0)
                r1.setState(r2)
                return r1
        }

        public net.openid.appauth.EndSessionResponse.Builder setRequest(net.openid.appauth.EndSessionRequest r2) {
                r1 = this;
                java.lang.String r0 = "request cannot be null"
                java.lang.Object r2 = net.openid.appauth.Preconditions.checkNotNull(r2, r0)
                net.openid.appauth.EndSessionRequest r2 = (net.openid.appauth.EndSessionRequest) r2
                r1.mRequest = r2
                return r1
        }

        public net.openid.appauth.EndSessionResponse.Builder setState(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "state must not be empty"
                java.lang.String r2 = net.openid.appauth.Preconditions.checkNullOrNotEmpty(r2, r0)
                r1.mState = r2
                return r1
        }
    }

    private EndSessionResponse(net.openid.appauth.EndSessionRequest r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.request = r1
            r0.state = r2
            return
    }

    /* synthetic */ EndSessionResponse(net.openid.appauth.EndSessionRequest r1, java.lang.String r2, net.openid.appauth.EndSessionResponse.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    static boolean containsEndSessionResponse(android.content.Intent r1) {
            java.lang.String r0 = "net.openid.appauth.EndSessionResponse"
            boolean r1 = r1.hasExtra(r0)
            return r1
    }

    public static net.openid.appauth.EndSessionResponse fromIntent(android.content.Intent r2) {
            java.lang.String r0 = "dataIntent must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "net.openid.appauth.EndSessionResponse"
            boolean r1 = r2.hasExtra(r0)
            if (r1 != 0) goto Lf
            r2 = 0
            return r2
        Lf:
            java.lang.String r2 = r2.getStringExtra(r0)     // Catch: org.json.JSONException -> L18
            net.openid.appauth.EndSessionResponse r2 = jsonDeserialize(r2)     // Catch: org.json.JSONException -> L18
            return r2
        L18:
            r2 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Intent contains malformed auth response"
            r0.<init>(r1, r2)
            throw r0
    }

    public static net.openid.appauth.EndSessionResponse jsonDeserialize(java.lang.String r1) throws org.json.JSONException {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r1)
            net.openid.appauth.EndSessionResponse r1 = jsonDeserialize(r0)
            return r1
    }

    public static net.openid.appauth.EndSessionResponse jsonDeserialize(org.json.JSONObject r3) throws org.json.JSONException {
            java.lang.String r0 = "request"
            boolean r1 = r3.has(r0)
            if (r1 == 0) goto L1c
            net.openid.appauth.EndSessionResponse r1 = new net.openid.appauth.EndSessionResponse
            org.json.JSONObject r0 = r3.getJSONObject(r0)
            net.openid.appauth.EndSessionRequest r0 = net.openid.appauth.EndSessionRequest.jsonDeserialize(r0)
            java.lang.String r2 = "state"
            java.lang.String r3 = net.openid.appauth.JsonUtil.getStringIfDefined(r3, r2)
            r1.<init>(r0, r3)
            return r1
        L1c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "authorization request not provided and not found in JSON"
            r3.<init>(r0)
            throw r3
    }

    @Override // net.openid.appauth.AuthorizationManagementResponse
    public java.lang.String getState() {
            r1 = this;
            java.lang.String r0 = r1.state
            return r0
    }

    @Override // net.openid.appauth.AuthorizationManagementResponse
    public org.json.JSONObject jsonSerialize() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            net.openid.appauth.EndSessionRequest r1 = r3.request
            org.json.JSONObject r1 = r1.jsonSerialize()
            java.lang.String r2 = "request"
            net.openid.appauth.JsonUtil.put(r0, r2, r1)
            java.lang.String r1 = "state"
            java.lang.String r2 = r3.state
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            return r0
    }

    @Override // net.openid.appauth.AuthorizationManagementResponse
    public android.content.Intent toIntent() {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "net.openid.appauth.EndSessionResponse"
            java.lang.String r2 = r3.jsonSerializeString()
            r0.putExtra(r1, r2)
            return r0
    }
}
