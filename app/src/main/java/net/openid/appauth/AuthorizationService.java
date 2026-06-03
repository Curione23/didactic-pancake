package net.openid.appauth;

/* JADX INFO: loaded from: classes2.dex */
public class AuthorizationService {
    private final net.openid.appauth.browser.BrowserDescriptor mBrowser;
    private final net.openid.appauth.AppAuthConfiguration mClientConfiguration;
    android.content.Context mContext;
    private final net.openid.appauth.browser.CustomTabManager mCustomTabManager;
    private boolean mDisposed;

    private static class RegistrationRequestTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, org.json.JSONObject> {
        private net.openid.appauth.AuthorizationService.RegistrationResponseCallback mCallback;
        private final net.openid.appauth.connectivity.ConnectionBuilder mConnectionBuilder;
        private net.openid.appauth.AuthorizationException mException;
        private net.openid.appauth.RegistrationRequest mRequest;

        RegistrationRequestTask(net.openid.appauth.RegistrationRequest r1, net.openid.appauth.connectivity.ConnectionBuilder r2, net.openid.appauth.AuthorizationService.RegistrationResponseCallback r3) {
                r0 = this;
                r0.<init>()
                r0.mRequest = r1
                r0.mConnectionBuilder = r2
                r0.mCallback = r3
                return
        }

        @Override // android.os.AsyncTask
        protected /* bridge */ /* synthetic */ org.json.JSONObject doInBackground(java.lang.Void[] r1) {
                r0 = this;
                java.lang.Void[] r1 = (java.lang.Void[]) r1
                org.json.JSONObject r1 = r0.doInBackground2(r1)
                return r1
        }

        /* JADX INFO: renamed from: doInBackground, reason: avoid collision after fix types in other method */
        protected org.json.JSONObject doInBackground2(java.lang.Void... r7) {
                r6 = this;
                java.lang.String r7 = "Failed to complete registration request"
                net.openid.appauth.RegistrationRequest r0 = r6.mRequest
                java.lang.String r0 = r0.toJsonString()
                r1 = 0
                r2 = 0
                net.openid.appauth.connectivity.ConnectionBuilder r3 = r6.mConnectionBuilder     // Catch: java.lang.Throwable -> L57 org.json.JSONException -> L59 java.io.IOException -> L69
                net.openid.appauth.RegistrationRequest r4 = r6.mRequest     // Catch: java.lang.Throwable -> L57 org.json.JSONException -> L59 java.io.IOException -> L69
                net.openid.appauth.AuthorizationServiceConfiguration r4 = r4.configuration     // Catch: java.lang.Throwable -> L57 org.json.JSONException -> L59 java.io.IOException -> L69
                android.net.Uri r4 = r4.registrationEndpoint     // Catch: java.lang.Throwable -> L57 org.json.JSONException -> L59 java.io.IOException -> L69
                java.net.HttpURLConnection r3 = r3.openConnection(r4)     // Catch: java.lang.Throwable -> L57 org.json.JSONException -> L59 java.io.IOException -> L69
                java.lang.String r4 = "POST"
                r3.setRequestMethod(r4)     // Catch: java.lang.Throwable -> L57 org.json.JSONException -> L59 java.io.IOException -> L69
                java.lang.String r4 = "Content-Type"
                java.lang.String r5 = "application/json"
                r3.setRequestProperty(r4, r5)     // Catch: java.lang.Throwable -> L57 org.json.JSONException -> L59 java.io.IOException -> L69
                r4 = 1
                r3.setDoOutput(r4)     // Catch: java.lang.Throwable -> L57 org.json.JSONException -> L59 java.io.IOException -> L69
                java.lang.String r4 = "Content-Length"
                int r5 = r0.length()     // Catch: java.lang.Throwable -> L57 org.json.JSONException -> L59 java.io.IOException -> L69
                java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L57 org.json.JSONException -> L59 java.io.IOException -> L69
                r3.setRequestProperty(r4, r5)     // Catch: java.lang.Throwable -> L57 org.json.JSONException -> L59 java.io.IOException -> L69
                java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L57 org.json.JSONException -> L59 java.io.IOException -> L69
                java.io.OutputStream r5 = r3.getOutputStream()     // Catch: java.lang.Throwable -> L57 org.json.JSONException -> L59 java.io.IOException -> L69
                r4.<init>(r5)     // Catch: java.lang.Throwable -> L57 org.json.JSONException -> L59 java.io.IOException -> L69
                r4.write(r0)     // Catch: java.lang.Throwable -> L57 org.json.JSONException -> L59 java.io.IOException -> L69
                r4.flush()     // Catch: java.lang.Throwable -> L57 org.json.JSONException -> L59 java.io.IOException -> L69
                java.io.InputStream r0 = r3.getInputStream()     // Catch: java.lang.Throwable -> L57 org.json.JSONException -> L59 java.io.IOException -> L69
                java.lang.String r3 = net.openid.appauth.Utils.readInputStream(r0)     // Catch: org.json.JSONException -> L53 java.io.IOException -> L55 java.lang.Throwable -> L7c
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L53 java.io.IOException -> L55 java.lang.Throwable -> L7c
                r4.<init>(r3)     // Catch: org.json.JSONException -> L53 java.io.IOException -> L55 java.lang.Throwable -> L7c
                net.openid.appauth.Utils.closeQuietly(r0)
                return r4
            L53:
                r3 = move-exception
                goto L5b
            L55:
                r3 = move-exception
                goto L6b
            L57:
                r7 = move-exception
                goto L7e
            L59:
                r3 = move-exception
                r0 = r2
            L5b:
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L7c
                net.openid.appauth.internal.Logger.debugWithStack(r3, r7, r1)     // Catch: java.lang.Throwable -> L7c
                net.openid.appauth.AuthorizationException r7 = net.openid.appauth.AuthorizationException.GeneralErrors.JSON_DESERIALIZATION_ERROR     // Catch: java.lang.Throwable -> L7c
                net.openid.appauth.AuthorizationException r7 = net.openid.appauth.AuthorizationException.fromTemplate(r7, r3)     // Catch: java.lang.Throwable -> L7c
                r6.mException = r7     // Catch: java.lang.Throwable -> L7c
                goto L78
            L69:
                r3 = move-exception
                r0 = r2
            L6b:
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L7c
                net.openid.appauth.internal.Logger.debugWithStack(r3, r7, r1)     // Catch: java.lang.Throwable -> L7c
                net.openid.appauth.AuthorizationException r7 = net.openid.appauth.AuthorizationException.GeneralErrors.NETWORK_ERROR     // Catch: java.lang.Throwable -> L7c
                net.openid.appauth.AuthorizationException r7 = net.openid.appauth.AuthorizationException.fromTemplate(r7, r3)     // Catch: java.lang.Throwable -> L7c
                r6.mException = r7     // Catch: java.lang.Throwable -> L7c
            L78:
                net.openid.appauth.Utils.closeQuietly(r0)
                return r2
            L7c:
                r7 = move-exception
                r2 = r0
            L7e:
                net.openid.appauth.Utils.closeQuietly(r2)
                throw r7
        }

        @Override // android.os.AsyncTask
        protected /* bridge */ /* synthetic */ void onPostExecute(org.json.JSONObject r1) {
                r0 = this;
                org.json.JSONObject r1 = (org.json.JSONObject) r1
                r0.onPostExecute2(r1)
                return
        }

        /* JADX INFO: renamed from: onPostExecute, reason: avoid collision after fix types in other method */
        protected void onPostExecute2(org.json.JSONObject r6) {
                r5 = this;
                net.openid.appauth.AuthorizationException r0 = r5.mException
                r1 = 0
                if (r0 == 0) goto Lb
                net.openid.appauth.AuthorizationService$RegistrationResponseCallback r6 = r5.mCallback
                r6.onRegistrationRequestCompleted(r1, r0)
                return
            Lb:
                java.lang.String r0 = "error"
                boolean r2 = r6.has(r0)
                if (r2 == 0) goto L3d
                java.lang.String r0 = r6.getString(r0)     // Catch: org.json.JSONException -> L30
                net.openid.appauth.AuthorizationException r2 = net.openid.appauth.AuthorizationException.RegistrationRequestErrors.byString(r0)     // Catch: org.json.JSONException -> L30
                java.lang.String r3 = "error_description"
                java.lang.String r3 = r6.getString(r3)     // Catch: org.json.JSONException -> L30
                java.lang.String r4 = "error_uri"
                java.lang.String r6 = r6.getString(r4)     // Catch: org.json.JSONException -> L30
                android.net.Uri r6 = net.openid.appauth.internal.UriUtil.parseUriIfAvailable(r6)     // Catch: org.json.JSONException -> L30
                net.openid.appauth.AuthorizationException r6 = net.openid.appauth.AuthorizationException.fromOAuthTemplate(r2, r0, r3, r6)     // Catch: org.json.JSONException -> L30
                goto L37
            L30:
                r6 = move-exception
                net.openid.appauth.AuthorizationException r0 = net.openid.appauth.AuthorizationException.GeneralErrors.JSON_DESERIALIZATION_ERROR
                net.openid.appauth.AuthorizationException r6 = net.openid.appauth.AuthorizationException.fromTemplate(r0, r6)
            L37:
                net.openid.appauth.AuthorizationService$RegistrationResponseCallback r0 = r5.mCallback
                r0.onRegistrationRequestCompleted(r1, r6)
                return
            L3d:
                net.openid.appauth.RegistrationResponse$Builder r0 = new net.openid.appauth.RegistrationResponse$Builder     // Catch: net.openid.appauth.RegistrationResponse.MissingArgumentException -> L61 org.json.JSONException -> L73
                net.openid.appauth.RegistrationRequest r2 = r5.mRequest     // Catch: net.openid.appauth.RegistrationResponse.MissingArgumentException -> L61 org.json.JSONException -> L73
                r0.<init>(r2)     // Catch: net.openid.appauth.RegistrationResponse.MissingArgumentException -> L61 org.json.JSONException -> L73
                net.openid.appauth.RegistrationResponse$Builder r6 = r0.fromResponseJson(r6)     // Catch: net.openid.appauth.RegistrationResponse.MissingArgumentException -> L61 org.json.JSONException -> L73
                net.openid.appauth.RegistrationResponse r6 = r6.build()     // Catch: net.openid.appauth.RegistrationResponse.MissingArgumentException -> L61 org.json.JSONException -> L73
                net.openid.appauth.RegistrationRequest r0 = r5.mRequest
                net.openid.appauth.AuthorizationServiceConfiguration r0 = r0.configuration
                android.net.Uri r0 = r0.registrationEndpoint
                java.lang.Object[] r0 = new java.lang.Object[]{r0}
                java.lang.String r2 = "Dynamic registration with %s completed"
                net.openid.appauth.internal.Logger.debug(r2, r0)
                net.openid.appauth.AuthorizationService$RegistrationResponseCallback r0 = r5.mCallback
                r0.onRegistrationRequestCompleted(r6, r1)
                return
            L61:
                r6 = move-exception
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "Malformed registration response"
                net.openid.appauth.internal.Logger.errorWithStack(r6, r1, r0)
                net.openid.appauth.AuthorizationException r0 = net.openid.appauth.AuthorizationException.GeneralErrors.INVALID_REGISTRATION_RESPONSE
                net.openid.appauth.AuthorizationException r6 = net.openid.appauth.AuthorizationException.fromTemplate(r0, r6)
                r5.mException = r6
                return
            L73:
                r6 = move-exception
                net.openid.appauth.AuthorizationService$RegistrationResponseCallback r0 = r5.mCallback
                net.openid.appauth.AuthorizationException r2 = net.openid.appauth.AuthorizationException.GeneralErrors.JSON_DESERIALIZATION_ERROR
                net.openid.appauth.AuthorizationException r6 = net.openid.appauth.AuthorizationException.fromTemplate(r2, r6)
                r0.onRegistrationRequestCompleted(r1, r6)
                return
        }
    }

    public interface RegistrationResponseCallback {
        void onRegistrationRequestCompleted(net.openid.appauth.RegistrationResponse r1, net.openid.appauth.AuthorizationException r2);
    }

    private static class TokenRequestTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, org.json.JSONObject> {
        private net.openid.appauth.AuthorizationService.TokenResponseCallback mCallback;
        private net.openid.appauth.ClientAuthentication mClientAuthentication;
        private net.openid.appauth.Clock mClock;
        private final net.openid.appauth.connectivity.ConnectionBuilder mConnectionBuilder;
        private net.openid.appauth.AuthorizationException mException;
        private net.openid.appauth.TokenRequest mRequest;
        private boolean mSkipIssuerHttpsCheck;

        TokenRequestTask(net.openid.appauth.TokenRequest r1, net.openid.appauth.ClientAuthentication r2, net.openid.appauth.connectivity.ConnectionBuilder r3, net.openid.appauth.Clock r4, net.openid.appauth.AuthorizationService.TokenResponseCallback r5, java.lang.Boolean r6) {
                r0 = this;
                r0.<init>()
                r0.mRequest = r1
                r0.mClientAuthentication = r2
                r0.mConnectionBuilder = r3
                r0.mClock = r4
                r0.mCallback = r5
                boolean r1 = r6.booleanValue()
                r0.mSkipIssuerHttpsCheck = r1
                return
        }

        private void addJsonToAcceptHeader(java.net.URLConnection r3) {
                r2 = this;
                java.lang.String r0 = "Accept"
                java.lang.String r1 = r3.getRequestProperty(r0)
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 == 0) goto L11
                java.lang.String r1 = "application/json"
                r3.setRequestProperty(r0, r1)
            L11:
                return
        }

        @Override // android.os.AsyncTask
        protected /* bridge */ /* synthetic */ org.json.JSONObject doInBackground(java.lang.Void[] r1) {
                r0 = this;
                java.lang.Void[] r1 = (java.lang.Void[]) r1
                org.json.JSONObject r1 = r0.doInBackground2(r1)
                return r1
        }

        /* JADX INFO: renamed from: doInBackground, reason: avoid collision after fix types in other method */
        protected org.json.JSONObject doInBackground2(java.lang.Void... r8) {
                r7 = this;
                java.lang.String r8 = "Failed to complete exchange request"
                r0 = 0
                r1 = 0
                net.openid.appauth.connectivity.ConnectionBuilder r2 = r7.mConnectionBuilder     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
                net.openid.appauth.TokenRequest r3 = r7.mRequest     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
                net.openid.appauth.AuthorizationServiceConfiguration r3 = r3.configuration     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
                android.net.Uri r3 = r3.tokenEndpoint     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
                java.net.HttpURLConnection r2 = r2.openConnection(r3)     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
                java.lang.String r3 = "POST"
                r2.setRequestMethod(r3)     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
                java.lang.String r3 = "Content-Type"
                java.lang.String r4 = "application/x-www-form-urlencoded"
                r2.setRequestProperty(r3, r4)     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
                r7.addJsonToAcceptHeader(r2)     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
                r3 = 1
                r2.setDoOutput(r3)     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
                net.openid.appauth.ClientAuthentication r3 = r7.mClientAuthentication     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
                net.openid.appauth.TokenRequest r4 = r7.mRequest     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
                java.lang.String r4 = r4.clientId     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
                java.util.Map r3 = r3.getRequestHeaders(r4)     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
                if (r3 == 0) goto L53
                java.util.Set r3 = r3.entrySet()     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
                java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
            L37:
                boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
                if (r4 == 0) goto L53
                java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
                java.lang.Object r5 = r4.getKey()     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
                java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
                java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
                java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
                r2.setRequestProperty(r5, r4)     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
                goto L37
            L53:
                net.openid.appauth.TokenRequest r3 = r7.mRequest     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
                java.util.Map r3 = r3.getRequestParameters()     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
                net.openid.appauth.ClientAuthentication r4 = r7.mClientAuthentication     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
                net.openid.appauth.TokenRequest r5 = r7.mRequest     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
                java.lang.String r5 = r5.clientId     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
                java.util.Map r4 = r4.getRequestParameters(r5)     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
                if (r4 == 0) goto L68
                r3.putAll(r4)     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
            L68:
                java.lang.String r3 = net.openid.appauth.internal.UriUtil.formUrlEncode(r3)     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
                java.lang.String r4 = "Content-Length"
                int r5 = r3.length()     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
                java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
                r2.setRequestProperty(r4, r5)     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
                java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
                java.io.OutputStream r5 = r2.getOutputStream()     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
                r4.<init>(r5)     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
                r4.write(r3)     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
                r4.flush()     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
                int r3 = r2.getResponseCode()     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
                r4 = 200(0xc8, float:2.8E-43)
                if (r3 < r4) goto L9d
                int r3 = r2.getResponseCode()     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
                r4 = 300(0x12c, float:4.2E-43)
                if (r3 >= r4) goto L9d
                java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
                goto La1
            L9d:
                java.io.InputStream r2 = r2.getErrorStream()     // Catch: java.lang.Throwable -> Lbb org.json.JSONException -> Lbd java.io.IOException -> Lcd
            La1:
                java.lang.String r3 = net.openid.appauth.Utils.readInputStream(r2)     // Catch: java.lang.Throwable -> Lae org.json.JSONException -> Lb1 java.io.IOException -> Lb6
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lae org.json.JSONException -> Lb1 java.io.IOException -> Lb6
                r4.<init>(r3)     // Catch: java.lang.Throwable -> Lae org.json.JSONException -> Lb1 java.io.IOException -> Lb6
                net.openid.appauth.Utils.closeQuietly(r2)
                return r4
            Lae:
                r8 = move-exception
                r1 = r2
                goto Le2
            Lb1:
                r3 = move-exception
                r6 = r3
                r3 = r2
                r2 = r6
                goto Lbf
            Lb6:
                r3 = move-exception
                r6 = r3
                r3 = r2
                r2 = r6
                goto Lcf
            Lbb:
                r8 = move-exception
                goto Le2
            Lbd:
                r2 = move-exception
                r3 = r1
            Lbf:
                java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> Le0
                net.openid.appauth.internal.Logger.debugWithStack(r2, r8, r0)     // Catch: java.lang.Throwable -> Le0
                net.openid.appauth.AuthorizationException r8 = net.openid.appauth.AuthorizationException.GeneralErrors.JSON_DESERIALIZATION_ERROR     // Catch: java.lang.Throwable -> Le0
                net.openid.appauth.AuthorizationException r8 = net.openid.appauth.AuthorizationException.fromTemplate(r8, r2)     // Catch: java.lang.Throwable -> Le0
                r7.mException = r8     // Catch: java.lang.Throwable -> Le0
                goto Ldc
            Lcd:
                r2 = move-exception
                r3 = r1
            Lcf:
                java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> Le0
                net.openid.appauth.internal.Logger.debugWithStack(r2, r8, r0)     // Catch: java.lang.Throwable -> Le0
                net.openid.appauth.AuthorizationException r8 = net.openid.appauth.AuthorizationException.GeneralErrors.NETWORK_ERROR     // Catch: java.lang.Throwable -> Le0
                net.openid.appauth.AuthorizationException r8 = net.openid.appauth.AuthorizationException.fromTemplate(r8, r2)     // Catch: java.lang.Throwable -> Le0
                r7.mException = r8     // Catch: java.lang.Throwable -> Le0
            Ldc:
                net.openid.appauth.Utils.closeQuietly(r3)
                return r1
            Le0:
                r8 = move-exception
                r1 = r3
            Le2:
                net.openid.appauth.Utils.closeQuietly(r1)
                throw r8
        }

        @Override // android.os.AsyncTask
        protected /* bridge */ /* synthetic */ void onPostExecute(org.json.JSONObject r1) {
                r0 = this;
                org.json.JSONObject r1 = (org.json.JSONObject) r1
                r0.onPostExecute2(r1)
                return
        }

        /* JADX INFO: renamed from: onPostExecute, reason: avoid collision after fix types in other method */
        protected void onPostExecute2(org.json.JSONObject r6) {
                r5 = this;
                net.openid.appauth.AuthorizationException r0 = r5.mException
                r1 = 0
                if (r0 == 0) goto Lb
                net.openid.appauth.AuthorizationService$TokenResponseCallback r6 = r5.mCallback
                r6.onTokenRequestCompleted(r1, r0)
                return
            Lb:
                java.lang.String r0 = "error"
                boolean r2 = r6.has(r0)
                if (r2 == 0) goto L3d
                java.lang.String r0 = r6.getString(r0)     // Catch: org.json.JSONException -> L30
                net.openid.appauth.AuthorizationException r2 = net.openid.appauth.AuthorizationException.TokenRequestErrors.byString(r0)     // Catch: org.json.JSONException -> L30
                java.lang.String r3 = "error_description"
                java.lang.String r3 = r6.optString(r3, r1)     // Catch: org.json.JSONException -> L30
                java.lang.String r4 = "error_uri"
                java.lang.String r6 = r6.optString(r4)     // Catch: org.json.JSONException -> L30
                android.net.Uri r6 = net.openid.appauth.internal.UriUtil.parseUriIfAvailable(r6)     // Catch: org.json.JSONException -> L30
                net.openid.appauth.AuthorizationException r6 = net.openid.appauth.AuthorizationException.fromOAuthTemplate(r2, r0, r3, r6)     // Catch: org.json.JSONException -> L30
                goto L37
            L30:
                r6 = move-exception
                net.openid.appauth.AuthorizationException r0 = net.openid.appauth.AuthorizationException.GeneralErrors.JSON_DESERIALIZATION_ERROR
                net.openid.appauth.AuthorizationException r6 = net.openid.appauth.AuthorizationException.fromTemplate(r0, r6)
            L37:
                net.openid.appauth.AuthorizationService$TokenResponseCallback r0 = r5.mCallback
                r0.onTokenRequestCompleted(r1, r6)
                return
            L3d:
                net.openid.appauth.TokenResponse$Builder r0 = new net.openid.appauth.TokenResponse$Builder     // Catch: org.json.JSONException -> L8b
                net.openid.appauth.TokenRequest r2 = r5.mRequest     // Catch: org.json.JSONException -> L8b
                r0.<init>(r2)     // Catch: org.json.JSONException -> L8b
                net.openid.appauth.TokenResponse$Builder r6 = r0.fromResponseJson(r6)     // Catch: org.json.JSONException -> L8b
                net.openid.appauth.TokenResponse r6 = r6.build()     // Catch: org.json.JSONException -> L8b
                java.lang.String r0 = r6.idToken
                if (r0 == 0) goto L76
                java.lang.String r0 = r6.idToken     // Catch: org.json.JSONException -> L67 net.openid.appauth.IdToken.IdTokenException -> L69
                net.openid.appauth.IdToken r0 = net.openid.appauth.IdToken.from(r0)     // Catch: org.json.JSONException -> L67 net.openid.appauth.IdToken.IdTokenException -> L69
                net.openid.appauth.TokenRequest r2 = r5.mRequest     // Catch: net.openid.appauth.AuthorizationException -> L60
                net.openid.appauth.Clock r3 = r5.mClock     // Catch: net.openid.appauth.AuthorizationException -> L60
                boolean r4 = r5.mSkipIssuerHttpsCheck     // Catch: net.openid.appauth.AuthorizationException -> L60
                r0.validate(r2, r3, r4)     // Catch: net.openid.appauth.AuthorizationException -> L60
                goto L76
            L60:
                r6 = move-exception
                net.openid.appauth.AuthorizationService$TokenResponseCallback r0 = r5.mCallback
                r0.onTokenRequestCompleted(r1, r6)
                return
            L67:
                r6 = move-exception
                goto L6a
            L69:
                r6 = move-exception
            L6a:
                net.openid.appauth.AuthorizationService$TokenResponseCallback r0 = r5.mCallback
                net.openid.appauth.AuthorizationException r2 = net.openid.appauth.AuthorizationException.GeneralErrors.ID_TOKEN_PARSING_ERROR
                net.openid.appauth.AuthorizationException r6 = net.openid.appauth.AuthorizationException.fromTemplate(r2, r6)
                r0.onTokenRequestCompleted(r1, r6)
                return
            L76:
                net.openid.appauth.TokenRequest r0 = r5.mRequest
                net.openid.appauth.AuthorizationServiceConfiguration r0 = r0.configuration
                android.net.Uri r0 = r0.tokenEndpoint
                java.lang.Object[] r0 = new java.lang.Object[]{r0}
                java.lang.String r2 = "Token exchange with %s completed"
                net.openid.appauth.internal.Logger.debug(r2, r0)
                net.openid.appauth.AuthorizationService$TokenResponseCallback r0 = r5.mCallback
                r0.onTokenRequestCompleted(r6, r1)
                return
            L8b:
                r6 = move-exception
                net.openid.appauth.AuthorizationService$TokenResponseCallback r0 = r5.mCallback
                net.openid.appauth.AuthorizationException r2 = net.openid.appauth.AuthorizationException.GeneralErrors.JSON_DESERIALIZATION_ERROR
                net.openid.appauth.AuthorizationException r6 = net.openid.appauth.AuthorizationException.fromTemplate(r2, r6)
                r0.onTokenRequestCompleted(r1, r6)
                return
        }
    }

    public interface TokenResponseCallback {
        void onTokenRequestCompleted(net.openid.appauth.TokenResponse r1, net.openid.appauth.AuthorizationException r2);
    }

    public AuthorizationService(android.content.Context r2) {
            r1 = this;
            net.openid.appauth.AppAuthConfiguration r0 = net.openid.appauth.AppAuthConfiguration.DEFAULT
            r1.<init>(r2, r0)
            return
    }

    public AuthorizationService(android.content.Context r3, net.openid.appauth.AppAuthConfiguration r4) {
            r2 = this;
            net.openid.appauth.browser.BrowserMatcher r0 = r4.getBrowserMatcher()
            net.openid.appauth.browser.BrowserDescriptor r0 = net.openid.appauth.browser.BrowserSelector.select(r3, r0)
            net.openid.appauth.browser.CustomTabManager r1 = new net.openid.appauth.browser.CustomTabManager
            r1.<init>(r3)
            r2.<init>(r3, r4, r0, r1)
            return
    }

    AuthorizationService(android.content.Context r2, net.openid.appauth.AppAuthConfiguration r3, net.openid.appauth.browser.BrowserDescriptor r4, net.openid.appauth.browser.CustomTabManager r5) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mDisposed = r0
            java.lang.Object r2 = net.openid.appauth.Preconditions.checkNotNull(r2)
            android.content.Context r2 = (android.content.Context) r2
            r1.mContext = r2
            r1.mClientConfiguration = r3
            r1.mCustomTabManager = r5
            r1.mBrowser = r4
            if (r4 == 0) goto L23
            java.lang.Boolean r2 = r4.useCustomTab
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L23
            java.lang.String r2 = r4.packageName
            r5.bind(r2)
        L23:
            return
    }

    private void checkNotDisposed() {
            r2 = this;
            boolean r0 = r2.mDisposed
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Service has been disposed and rendered inoperable"
            r0.<init>(r1)
            throw r0
    }

    private boolean isActivity(android.content.Context r2) {
            r1 = this;
        L0:
            boolean r0 = r2 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L11
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto La
            r2 = 1
            return r2
        La:
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            goto L0
        L11:
            r2 = 0
            return r2
    }

    private void performAuthManagementRequest(net.openid.appauth.AuthorizationManagementRequest r2, android.app.PendingIntent r3, android.app.PendingIntent r4, androidx.browser.customtabs.CustomTabsIntent r5) {
            r1 = this;
            r1.checkNotDisposed()
            net.openid.appauth.Preconditions.checkNotNull(r2)
            net.openid.appauth.Preconditions.checkNotNull(r3)
            net.openid.appauth.Preconditions.checkNotNull(r5)
            android.content.Intent r5 = r1.prepareAuthorizationRequestIntent(r2, r5)
            android.content.Context r0 = r1.mContext
            android.content.Intent r2 = net.openid.appauth.AuthorizationManagementActivity.createStartIntent(r0, r2, r5, r3, r4)
            android.content.Context r3 = r1.mContext
            boolean r3 = r1.isActivity(r3)
            if (r3 != 0) goto L23
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r2.addFlags(r3)
        L23:
            android.content.Context r3 = r1.mContext
            r3.startActivity(r2)
            return
    }

    private android.content.Intent prepareAuthorizationRequestIntent(net.openid.appauth.AuthorizationManagementRequest r2, androidx.browser.customtabs.CustomTabsIntent r3) {
            r1 = this;
            r1.checkNotDisposed()
            net.openid.appauth.browser.BrowserDescriptor r0 = r1.mBrowser
            if (r0 == 0) goto L3f
            android.net.Uri r2 = r2.toUri()
            net.openid.appauth.browser.BrowserDescriptor r0 = r1.mBrowser
            java.lang.Boolean r0 = r0.useCustomTab
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L18
            android.content.Intent r3 = r3.intent
            goto L1f
        L18:
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.VIEW"
            r3.<init>(r0)
        L1f:
            net.openid.appauth.browser.BrowserDescriptor r0 = r1.mBrowser
            java.lang.String r0 = r0.packageName
            r3.setPackage(r0)
            r3.setData(r2)
            java.lang.String r2 = r3.getPackage()
            net.openid.appauth.browser.BrowserDescriptor r0 = r1.mBrowser
            java.lang.Boolean r0 = r0.useCustomTab
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r0}
            java.lang.String r0 = "Using %s as browser for auth, custom tab = %s"
            net.openid.appauth.internal.Logger.debug(r0, r2)
            return r3
        L3f:
            android.content.ActivityNotFoundException r2 = new android.content.ActivityNotFoundException
            r2.<init>()
            throw r2
    }

    public androidx.browser.customtabs.CustomTabsIntent.Builder createCustomTabsIntentBuilder(android.net.Uri... r2) {
            r1 = this;
            r1.checkNotDisposed()
            net.openid.appauth.browser.CustomTabManager r0 = r1.mCustomTabManager
            androidx.browser.customtabs.CustomTabsIntent$Builder r2 = r0.createTabBuilder(r2)
            return r2
    }

    public void dispose() {
            r1 = this;
            boolean r0 = r1.mDisposed
            if (r0 == 0) goto L5
            return
        L5:
            net.openid.appauth.browser.CustomTabManager r0 = r1.mCustomTabManager
            r0.dispose()
            r0 = 1
            r1.mDisposed = r0
            return
    }

    public android.content.Intent getAuthorizationRequestIntent(net.openid.appauth.AuthorizationRequest r2) {
            r1 = this;
            r0 = 0
            android.net.Uri[] r0 = new android.net.Uri[r0]
            androidx.browser.customtabs.CustomTabsIntent$Builder r0 = r1.createCustomTabsIntentBuilder(r0)
            androidx.browser.customtabs.CustomTabsIntent r0 = r0.build()
            android.content.Intent r2 = r1.getAuthorizationRequestIntent(r2, r0)
            return r2
    }

    public android.content.Intent getAuthorizationRequestIntent(net.openid.appauth.AuthorizationRequest r2, androidx.browser.customtabs.CustomTabsIntent r3) {
            r1 = this;
            android.content.Intent r3 = r1.prepareAuthorizationRequestIntent(r2, r3)
            android.content.Context r0 = r1.mContext
            android.content.Intent r2 = net.openid.appauth.AuthorizationManagementActivity.createStartForResultIntent(r0, r2, r3)
            return r2
    }

    public net.openid.appauth.browser.BrowserDescriptor getBrowserDescriptor() {
            r1 = this;
            net.openid.appauth.browser.BrowserDescriptor r0 = r1.mBrowser
            return r0
    }

    public net.openid.appauth.browser.CustomTabManager getCustomTabManager() {
            r1 = this;
            net.openid.appauth.browser.CustomTabManager r0 = r1.mCustomTabManager
            return r0
    }

    public android.content.Intent getEndSessionRequestIntent(net.openid.appauth.EndSessionRequest r2) {
            r1 = this;
            r0 = 0
            android.net.Uri[] r0 = new android.net.Uri[r0]
            androidx.browser.customtabs.CustomTabsIntent$Builder r0 = r1.createCustomTabsIntentBuilder(r0)
            androidx.browser.customtabs.CustomTabsIntent r0 = r0.build()
            android.content.Intent r2 = r1.getEndSessionRequestIntent(r2, r0)
            return r2
    }

    public android.content.Intent getEndSessionRequestIntent(net.openid.appauth.EndSessionRequest r2, androidx.browser.customtabs.CustomTabsIntent r3) {
            r1 = this;
            android.content.Intent r3 = r1.prepareAuthorizationRequestIntent(r2, r3)
            android.content.Context r0 = r1.mContext
            android.content.Intent r2 = net.openid.appauth.AuthorizationManagementActivity.createStartForResultIntent(r0, r2, r3)
            return r2
    }

    public void performAuthorizationRequest(net.openid.appauth.AuthorizationRequest r3, android.app.PendingIntent r4) {
            r2 = this;
            r0 = 0
            android.net.Uri[] r0 = new android.net.Uri[r0]
            androidx.browser.customtabs.CustomTabsIntent$Builder r0 = r2.createCustomTabsIntentBuilder(r0)
            androidx.browser.customtabs.CustomTabsIntent r0 = r0.build()
            r1 = 0
            r2.performAuthorizationRequest(r3, r4, r1, r0)
            return
    }

    public void performAuthorizationRequest(net.openid.appauth.AuthorizationRequest r2, android.app.PendingIntent r3, android.app.PendingIntent r4) {
            r1 = this;
            r0 = 0
            android.net.Uri[] r0 = new android.net.Uri[r0]
            androidx.browser.customtabs.CustomTabsIntent$Builder r0 = r1.createCustomTabsIntentBuilder(r0)
            androidx.browser.customtabs.CustomTabsIntent r0 = r0.build()
            r1.performAuthorizationRequest(r2, r3, r4, r0)
            return
    }

    public void performAuthorizationRequest(net.openid.appauth.AuthorizationRequest r1, android.app.PendingIntent r2, android.app.PendingIntent r3, androidx.browser.customtabs.CustomTabsIntent r4) {
            r0 = this;
            r0.performAuthManagementRequest(r1, r2, r3, r4)
            return
    }

    public void performAuthorizationRequest(net.openid.appauth.AuthorizationRequest r2, android.app.PendingIntent r3, androidx.browser.customtabs.CustomTabsIntent r4) {
            r1 = this;
            r0 = 0
            r1.performAuthorizationRequest(r2, r3, r0, r4)
            return
    }

    public void performEndSessionRequest(net.openid.appauth.EndSessionRequest r3, android.app.PendingIntent r4) {
            r2 = this;
            r0 = 0
            android.net.Uri[] r0 = new android.net.Uri[r0]
            androidx.browser.customtabs.CustomTabsIntent$Builder r0 = r2.createCustomTabsIntentBuilder(r0)
            androidx.browser.customtabs.CustomTabsIntent r0 = r0.build()
            r1 = 0
            r2.performEndSessionRequest(r3, r4, r1, r0)
            return
    }

    public void performEndSessionRequest(net.openid.appauth.EndSessionRequest r2, android.app.PendingIntent r3, android.app.PendingIntent r4) {
            r1 = this;
            r0 = 0
            android.net.Uri[] r0 = new android.net.Uri[r0]
            androidx.browser.customtabs.CustomTabsIntent$Builder r0 = r1.createCustomTabsIntentBuilder(r0)
            androidx.browser.customtabs.CustomTabsIntent r0 = r0.build()
            r1.performEndSessionRequest(r2, r3, r4, r0)
            return
    }

    public void performEndSessionRequest(net.openid.appauth.EndSessionRequest r1, android.app.PendingIntent r2, android.app.PendingIntent r3, androidx.browser.customtabs.CustomTabsIntent r4) {
            r0 = this;
            r0.performAuthManagementRequest(r1, r2, r3, r4)
            return
    }

    public void performEndSessionRequest(net.openid.appauth.EndSessionRequest r2, android.app.PendingIntent r3, androidx.browser.customtabs.CustomTabsIntent r4) {
            r1 = this;
            r0 = 0
            r1.performEndSessionRequest(r2, r3, r0, r4)
            return
    }

    public void performRegistrationRequest(net.openid.appauth.RegistrationRequest r3, net.openid.appauth.AuthorizationService.RegistrationResponseCallback r4) {
            r2 = this;
            r2.checkNotDisposed()
            net.openid.appauth.AuthorizationServiceConfiguration r0 = r3.configuration
            android.net.Uri r0 = r0.registrationEndpoint
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "Initiating dynamic client registration %s"
            net.openid.appauth.internal.Logger.debug(r1, r0)
            net.openid.appauth.AuthorizationService$RegistrationRequestTask r0 = new net.openid.appauth.AuthorizationService$RegistrationRequestTask
            net.openid.appauth.AppAuthConfiguration r1 = r2.mClientConfiguration
            net.openid.appauth.connectivity.ConnectionBuilder r1 = r1.getConnectionBuilder()
            r0.<init>(r3, r1, r4)
            r3 = 0
            java.lang.Void[] r3 = new java.lang.Void[r3]
            r0.execute(r3)
            return
    }

    public void performTokenRequest(net.openid.appauth.TokenRequest r2, net.openid.appauth.AuthorizationService.TokenResponseCallback r3) {
            r1 = this;
            net.openid.appauth.NoClientAuthentication r0 = net.openid.appauth.NoClientAuthentication.INSTANCE
            r1.performTokenRequest(r2, r0, r3)
            return
    }

    public void performTokenRequest(net.openid.appauth.TokenRequest r10, net.openid.appauth.ClientAuthentication r11, net.openid.appauth.AuthorizationService.TokenResponseCallback r12) {
            r9 = this;
            r9.checkNotDisposed()
            net.openid.appauth.AuthorizationServiceConfiguration r0 = r10.configuration
            android.net.Uri r0 = r0.tokenEndpoint
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "Initiating code exchange request to %s"
            net.openid.appauth.internal.Logger.debug(r1, r0)
            net.openid.appauth.AuthorizationService$TokenRequestTask r0 = new net.openid.appauth.AuthorizationService$TokenRequestTask
            net.openid.appauth.AppAuthConfiguration r1 = r9.mClientConfiguration
            net.openid.appauth.connectivity.ConnectionBuilder r5 = r1.getConnectionBuilder()
            net.openid.appauth.SystemClock r6 = net.openid.appauth.SystemClock.INSTANCE
            net.openid.appauth.AppAuthConfiguration r1 = r9.mClientConfiguration
            boolean r1 = r1.getSkipIssuerHttpsCheck()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
            r2 = r0
            r3 = r10
            r4 = r11
            r7 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r10 = 0
            java.lang.Void[] r10 = new java.lang.Void[r10]
            r0.execute(r10)
            return
    }
}
