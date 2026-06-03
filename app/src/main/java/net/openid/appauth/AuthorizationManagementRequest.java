package net.openid.appauth;

/* JADX INFO: loaded from: classes2.dex */
public interface AuthorizationManagementRequest {
    java.lang.String getState();

    org.json.JSONObject jsonSerialize();

    java.lang.String jsonSerializeString();

    android.net.Uri toUri();
}
