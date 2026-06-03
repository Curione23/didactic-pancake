package net.openid.appauth;

/* JADX INFO: loaded from: classes2.dex */
public class AuthorizationManagementActivity extends androidx.appcompat.app.AppCompatActivity {
    static final java.lang.String KEY_AUTHORIZATION_STARTED = "authStarted";
    static final java.lang.String KEY_AUTH_INTENT = "authIntent";
    static final java.lang.String KEY_AUTH_REQUEST = "authRequest";
    static final java.lang.String KEY_AUTH_REQUEST_TYPE = "authRequestType";
    static final java.lang.String KEY_CANCEL_INTENT = "cancelIntent";
    static final java.lang.String KEY_COMPLETE_INTENT = "completeIntent";
    private android.content.Intent mAuthIntent;
    private net.openid.appauth.AuthorizationManagementRequest mAuthRequest;
    private boolean mAuthorizationStarted;
    private android.app.PendingIntent mCancelIntent;
    private android.app.PendingIntent mCompleteIntent;

    public AuthorizationManagementActivity() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mAuthorizationStarted = r0
            return
    }

    private static android.content.Intent createBaseIntent(android.content.Context r2) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<net.openid.appauth.AuthorizationManagementActivity> r1 = net.openid.appauth.AuthorizationManagementActivity.class
            r0.<init>(r2, r1)
            return r0
    }

    public static android.content.Intent createResponseHandlingIntent(android.content.Context r0, android.net.Uri r1) {
            android.content.Intent r0 = createBaseIntent(r0)
            r0.setData(r1)
            r1 = 603979776(0x24000000, float:2.7755576E-17)
            r0.addFlags(r1)
            return r0
    }

    public static android.content.Intent createStartForResultIntent(android.content.Context r1, net.openid.appauth.AuthorizationManagementRequest r2, android.content.Intent r3) {
            r0 = 0
            android.content.Intent r1 = createStartIntent(r1, r2, r3, r0, r0)
            return r1
    }

    public static android.content.Intent createStartIntent(android.content.Context r1, net.openid.appauth.AuthorizationManagementRequest r2, android.content.Intent r3, android.app.PendingIntent r4, android.app.PendingIntent r5) {
            android.content.Intent r1 = createBaseIntent(r1)
            java.lang.String r0 = "authIntent"
            r1.putExtra(r0, r3)
            java.lang.String r3 = "authRequest"
            java.lang.String r0 = r2.jsonSerializeString()
            r1.putExtra(r3, r0)
            java.lang.String r3 = "authRequestType"
            java.lang.String r2 = net.openid.appauth.AuthorizationManagementUtil.requestTypeFor(r2)
            r1.putExtra(r3, r2)
            java.lang.String r2 = "completeIntent"
            r1.putExtra(r2, r4)
            java.lang.String r2 = "cancelIntent"
            r1.putExtra(r2, r5)
            return r1
    }

    private android.content.Intent extractResponseData(android.net.Uri r3) {
            r2 = this;
            java.util.Set r0 = r3.getQueryParameterNames()
            java.lang.String r1 = "error"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L15
            net.openid.appauth.AuthorizationException r3 = net.openid.appauth.AuthorizationException.fromOAuthRedirect(r3)
            android.content.Intent r3 = r3.toIntent()
            return r3
        L15:
            net.openid.appauth.AuthorizationManagementRequest r0 = r2.mAuthRequest
            net.openid.appauth.AuthorizationManagementResponse r3 = net.openid.appauth.AuthorizationManagementUtil.responseWith(r0, r3)
            net.openid.appauth.AuthorizationManagementRequest r0 = r2.mAuthRequest
            java.lang.String r0 = r0.getState()
            if (r0 != 0) goto L29
            java.lang.String r0 = r3.getState()
            if (r0 != 0) goto L41
        L29:
            net.openid.appauth.AuthorizationManagementRequest r0 = r2.mAuthRequest
            java.lang.String r0 = r0.getState()
            if (r0 == 0) goto L5b
            net.openid.appauth.AuthorizationManagementRequest r0 = r2.mAuthRequest
            java.lang.String r0 = r0.getState()
            java.lang.String r1 = r3.getState()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5b
        L41:
            java.lang.String r3 = r3.getState()
            net.openid.appauth.AuthorizationManagementRequest r0 = r2.mAuthRequest
            java.lang.String r0 = r0.getState()
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r0}
            java.lang.String r0 = "State returned in authorization response (%s) does not match state from request (%s) - discarding response"
            net.openid.appauth.internal.Logger.warn(r0, r3)
            net.openid.appauth.AuthorizationException r3 = net.openid.appauth.AuthorizationException.AuthorizationRequestErrors.STATE_MISMATCH
            android.content.Intent r3 = r3.toIntent()
            return r3
        L5b:
            android.content.Intent r3 = r3.toIntent()
            return r3
    }

    private void extractState(android.os.Bundle r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto Le
            java.lang.String r5 = "No stored state - unable to handle response"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            net.openid.appauth.internal.Logger.warn(r5, r0)
            r4.finish()
            return
        Le:
            java.lang.String r1 = "authIntent"
            android.os.Parcelable r1 = r5.getParcelable(r1)
            android.content.Intent r1 = (android.content.Intent) r1
            r4.mAuthIntent = r1
            java.lang.String r1 = "authStarted"
            boolean r1 = r5.getBoolean(r1, r0)
            r4.mAuthorizationStarted = r1
            java.lang.String r1 = "completeIntent"
            android.os.Parcelable r1 = r5.getParcelable(r1)
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            r4.mCompleteIntent = r1
            java.lang.String r1 = "cancelIntent"
            android.os.Parcelable r1 = r5.getParcelable(r1)
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            r4.mCancelIntent = r1
            java.lang.String r1 = "authRequest"
            r2 = 0
            java.lang.String r1 = r5.getString(r1, r2)     // Catch: org.json.JSONException -> L4a
            java.lang.String r3 = "authRequestType"
            java.lang.String r5 = r5.getString(r3, r2)     // Catch: org.json.JSONException -> L4a
            if (r1 == 0) goto L47
            net.openid.appauth.AuthorizationManagementRequest r2 = net.openid.appauth.AuthorizationManagementUtil.requestFrom(r1, r5)     // Catch: org.json.JSONException -> L4a
        L47:
            r4.mAuthRequest = r2     // Catch: org.json.JSONException -> L4a
            goto L55
        L4a:
            android.app.PendingIntent r5 = r4.mCancelIntent
            net.openid.appauth.AuthorizationException r1 = net.openid.appauth.AuthorizationException.AuthorizationRequestErrors.INVALID_REQUEST
            android.content.Intent r1 = r1.toIntent()
            r4.sendResult(r5, r1, r0)
        L55:
            return
    }

    private void handleAuthorizationCanceled() {
            r3 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "Authorization flow canceled by user"
            net.openid.appauth.internal.Logger.debug(r2, r1)
            net.openid.appauth.AuthorizationException r1 = net.openid.appauth.AuthorizationException.GeneralErrors.USER_CANCELED_AUTH_FLOW
            r2 = 0
            net.openid.appauth.AuthorizationException r1 = net.openid.appauth.AuthorizationException.fromTemplate(r1, r2)
            android.content.Intent r1 = r1.toIntent()
            android.app.PendingIntent r2 = r3.mCancelIntent
            r3.sendResult(r2, r1, r0)
            return
    }

    private void handleAuthorizationComplete() {
            r3 = this;
            android.content.Intent r0 = r3.getIntent()
            android.net.Uri r0 = r0.getData()
            android.content.Intent r1 = r3.extractResponseData(r0)
            if (r1 != 0) goto L17
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Failed to extract OAuth2 response from redirect"
            net.openid.appauth.internal.Logger.error(r1, r0)
            return
        L17:
            r1.setData(r0)
            android.app.PendingIntent r0 = r3.mCompleteIntent
            r2 = -1
            r3.sendResult(r0, r1, r2)
            return
    }

    private void handleBrowserNotFound() {
            r3 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "Authorization flow canceled due to missing browser"
            net.openid.appauth.internal.Logger.debug(r2, r1)
            net.openid.appauth.AuthorizationException r1 = net.openid.appauth.AuthorizationException.GeneralErrors.PROGRAM_CANCELED_AUTH_FLOW
            r2 = 0
            net.openid.appauth.AuthorizationException r1 = net.openid.appauth.AuthorizationException.fromTemplate(r1, r2)
            android.content.Intent r1 = r1.toIntent()
            android.app.PendingIntent r2 = r3.mCancelIntent
            r3.sendResult(r2, r1, r0)
            return
    }

    private void sendResult(android.app.PendingIntent r1, android.content.Intent r2, int r3) {
            r0 = this;
            if (r1 == 0) goto L12
            r3 = 0
            r1.send(r0, r3, r2)     // Catch: android.app.PendingIntent.CanceledException -> L7
            goto L15
        L7:
            r1 = move-exception
            java.lang.String r2 = "Failed to send cancel intent"
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            net.openid.appauth.internal.Logger.error(r2, r1)
            goto L15
        L12:
            r0.setResult(r3, r2)
        L15:
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)
            if (r1 != 0) goto L11
            android.content.Intent r1 = r0.getIntent()
            android.os.Bundle r1 = r1.getExtras()
            r0.extractState(r1)
            goto L14
        L11:
            r0.extractState(r1)
        L14:
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(android.content.Intent r1) {
            r0 = this;
            super.onNewIntent(r1)
            r0.setIntent(r1)
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
            r1 = this;
            super.onResume()
            boolean r0 = r1.mAuthorizationStarted
            if (r0 != 0) goto L17
            android.content.Intent r0 = r1.mAuthIntent     // Catch: android.content.ActivityNotFoundException -> L10
            r1.startActivity(r0)     // Catch: android.content.ActivityNotFoundException -> L10
            r0 = 1
            r1.mAuthorizationStarted = r0     // Catch: android.content.ActivityNotFoundException -> L10
            goto L16
        L10:
            r1.handleBrowserNotFound()
            r1.finish()
        L16:
            return
        L17:
            android.content.Intent r0 = r1.getIntent()
            android.net.Uri r0 = r0.getData()
            if (r0 == 0) goto L25
            r1.handleAuthorizationComplete()
            goto L28
        L25:
            r1.handleAuthorizationCanceled()
        L28:
            r1.finish()
            return
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            super.onSaveInstanceState(r3)
            java.lang.String r0 = "authStarted"
            boolean r1 = r2.mAuthorizationStarted
            r3.putBoolean(r0, r1)
            java.lang.String r0 = "authIntent"
            android.content.Intent r1 = r2.mAuthIntent
            r3.putParcelable(r0, r1)
            net.openid.appauth.AuthorizationManagementRequest r0 = r2.mAuthRequest
            java.lang.String r0 = r0.jsonSerializeString()
            java.lang.String r1 = "authRequest"
            r3.putString(r1, r0)
            net.openid.appauth.AuthorizationManagementRequest r0 = r2.mAuthRequest
            java.lang.String r0 = net.openid.appauth.AuthorizationManagementUtil.requestTypeFor(r0)
            java.lang.String r1 = "authRequestType"
            r3.putString(r1, r0)
            java.lang.String r0 = "completeIntent"
            android.app.PendingIntent r1 = r2.mCompleteIntent
            r3.putParcelable(r0, r1)
            java.lang.String r0 = "cancelIntent"
            android.app.PendingIntent r1 = r2.mCancelIntent
            r3.putParcelable(r0, r1)
            return
    }
}
