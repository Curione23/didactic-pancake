package net.openid.appauth;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AuthorizationManagementResponse {
    public AuthorizationManagementResponse() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract java.lang.String getState();

    public abstract org.json.JSONObject jsonSerialize();

    public java.lang.String jsonSerializeString() {
            r1 = this;
            org.json.JSONObject r0 = r1.jsonSerialize()
            java.lang.String r0 = r0.toString()
            return r0
    }

    public abstract android.content.Intent toIntent();
}
