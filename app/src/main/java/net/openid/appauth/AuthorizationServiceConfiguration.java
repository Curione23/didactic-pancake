package net.openid.appauth;

/* JADX INFO: loaded from: classes2.dex */
public class AuthorizationServiceConfiguration {
    private static final java.lang.String KEY_AUTHORIZATION_ENDPOINT = "authorizationEndpoint";
    private static final java.lang.String KEY_DISCOVERY_DOC = "discoveryDoc";
    private static final java.lang.String KEY_END_SESSION_ENPOINT = "endSessionEndpoint";
    private static final java.lang.String KEY_REGISTRATION_ENDPOINT = "registrationEndpoint";
    private static final java.lang.String KEY_TOKEN_ENDPOINT = "tokenEndpoint";
    public static final java.lang.String OPENID_CONFIGURATION_RESOURCE = "openid-configuration";
    public static final java.lang.String WELL_KNOWN_PATH = ".well-known";
    public final android.net.Uri authorizationEndpoint;
    public final net.openid.appauth.AuthorizationServiceDiscovery discoveryDoc;
    public final android.net.Uri endSessionEndpoint;
    public final android.net.Uri registrationEndpoint;
    public final android.net.Uri tokenEndpoint;

    private static class ConfigurationRetrievalAsyncTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, net.openid.appauth.AuthorizationServiceConfiguration> {
        private net.openid.appauth.AuthorizationServiceConfiguration.RetrieveConfigurationCallback mCallback;
        private net.openid.appauth.connectivity.ConnectionBuilder mConnectionBuilder;
        private net.openid.appauth.AuthorizationException mException;
        private android.net.Uri mUri;

        ConfigurationRetrievalAsyncTask(android.net.Uri r1, net.openid.appauth.connectivity.ConnectionBuilder r2, net.openid.appauth.AuthorizationServiceConfiguration.RetrieveConfigurationCallback r3) {
                r0 = this;
                r0.<init>()
                r0.mUri = r1
                r0.mConnectionBuilder = r2
                r0.mCallback = r3
                r1 = 0
                r0.mException = r1
                return
        }

        @Override // android.os.AsyncTask
        protected /* bridge */ /* synthetic */ net.openid.appauth.AuthorizationServiceConfiguration doInBackground(java.lang.Void[] r1) {
                r0 = this;
                java.lang.Void[] r1 = (java.lang.Void[]) r1
                net.openid.appauth.AuthorizationServiceConfiguration r1 = r0.doInBackground2(r1)
                return r1
        }

        /* JADX INFO: renamed from: doInBackground, reason: avoid collision after fix types in other method */
        protected net.openid.appauth.AuthorizationServiceConfiguration doInBackground2(java.lang.Void... r5) {
                r4 = this;
                r5 = 0
                r0 = 0
                net.openid.appauth.connectivity.ConnectionBuilder r1 = r4.mConnectionBuilder     // Catch: java.lang.Throwable -> L37 net.openid.appauth.AuthorizationServiceDiscovery.MissingArgumentException -> L39 org.json.JSONException -> L4b java.io.IOException -> L5d
                android.net.Uri r2 = r4.mUri     // Catch: java.lang.Throwable -> L37 net.openid.appauth.AuthorizationServiceDiscovery.MissingArgumentException -> L39 org.json.JSONException -> L4b java.io.IOException -> L5d
                java.net.HttpURLConnection r1 = r1.openConnection(r2)     // Catch: java.lang.Throwable -> L37 net.openid.appauth.AuthorizationServiceDiscovery.MissingArgumentException -> L39 org.json.JSONException -> L4b java.io.IOException -> L5d
                java.lang.String r2 = "GET"
                r1.setRequestMethod(r2)     // Catch: java.lang.Throwable -> L37 net.openid.appauth.AuthorizationServiceDiscovery.MissingArgumentException -> L39 org.json.JSONException -> L4b java.io.IOException -> L5d
                r2 = 1
                r1.setDoInput(r2)     // Catch: java.lang.Throwable -> L37 net.openid.appauth.AuthorizationServiceDiscovery.MissingArgumentException -> L39 org.json.JSONException -> L4b java.io.IOException -> L5d
                r1.connect()     // Catch: java.lang.Throwable -> L37 net.openid.appauth.AuthorizationServiceDiscovery.MissingArgumentException -> L39 org.json.JSONException -> L4b java.io.IOException -> L5d
                java.io.InputStream r1 = r1.getInputStream()     // Catch: java.lang.Throwable -> L37 net.openid.appauth.AuthorizationServiceDiscovery.MissingArgumentException -> L39 org.json.JSONException -> L4b java.io.IOException -> L5d
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch: net.openid.appauth.AuthorizationServiceDiscovery.MissingArgumentException -> L31 org.json.JSONException -> L33 java.io.IOException -> L35 java.lang.Throwable -> L72
                java.lang.String r3 = net.openid.appauth.Utils.readInputStream(r1)     // Catch: net.openid.appauth.AuthorizationServiceDiscovery.MissingArgumentException -> L31 org.json.JSONException -> L33 java.io.IOException -> L35 java.lang.Throwable -> L72
                r2.<init>(r3)     // Catch: net.openid.appauth.AuthorizationServiceDiscovery.MissingArgumentException -> L31 org.json.JSONException -> L33 java.io.IOException -> L35 java.lang.Throwable -> L72
                net.openid.appauth.AuthorizationServiceDiscovery r3 = new net.openid.appauth.AuthorizationServiceDiscovery     // Catch: net.openid.appauth.AuthorizationServiceDiscovery.MissingArgumentException -> L31 org.json.JSONException -> L33 java.io.IOException -> L35 java.lang.Throwable -> L72
                r3.<init>(r2)     // Catch: net.openid.appauth.AuthorizationServiceDiscovery.MissingArgumentException -> L31 org.json.JSONException -> L33 java.io.IOException -> L35 java.lang.Throwable -> L72
                net.openid.appauth.AuthorizationServiceConfiguration r2 = new net.openid.appauth.AuthorizationServiceConfiguration     // Catch: net.openid.appauth.AuthorizationServiceDiscovery.MissingArgumentException -> L31 org.json.JSONException -> L33 java.io.IOException -> L35 java.lang.Throwable -> L72
                r2.<init>(r3)     // Catch: net.openid.appauth.AuthorizationServiceDiscovery.MissingArgumentException -> L31 org.json.JSONException -> L33 java.io.IOException -> L35 java.lang.Throwable -> L72
                net.openid.appauth.Utils.closeQuietly(r1)
                return r2
            L31:
                r2 = move-exception
                goto L3b
            L33:
                r2 = move-exception
                goto L4d
            L35:
                r2 = move-exception
                goto L5f
            L37:
                r5 = move-exception
                goto L74
            L39:
                r2 = move-exception
                r1 = r0
            L3b:
                java.lang.String r3 = "Malformed discovery document"
                java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L72
                net.openid.appauth.internal.Logger.errorWithStack(r2, r3, r5)     // Catch: java.lang.Throwable -> L72
                net.openid.appauth.AuthorizationException r5 = net.openid.appauth.AuthorizationException.GeneralErrors.INVALID_DISCOVERY_DOCUMENT     // Catch: java.lang.Throwable -> L72
                net.openid.appauth.AuthorizationException r5 = net.openid.appauth.AuthorizationException.fromTemplate(r5, r2)     // Catch: java.lang.Throwable -> L72
                r4.mException = r5     // Catch: java.lang.Throwable -> L72
                goto L6e
            L4b:
                r2 = move-exception
                r1 = r0
            L4d:
                java.lang.String r3 = "Error parsing discovery document"
                java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L72
                net.openid.appauth.internal.Logger.errorWithStack(r2, r3, r5)     // Catch: java.lang.Throwable -> L72
                net.openid.appauth.AuthorizationException r5 = net.openid.appauth.AuthorizationException.GeneralErrors.JSON_DESERIALIZATION_ERROR     // Catch: java.lang.Throwable -> L72
                net.openid.appauth.AuthorizationException r5 = net.openid.appauth.AuthorizationException.fromTemplate(r5, r2)     // Catch: java.lang.Throwable -> L72
                r4.mException = r5     // Catch: java.lang.Throwable -> L72
                goto L6e
            L5d:
                r2 = move-exception
                r1 = r0
            L5f:
                java.lang.String r3 = "Network error when retrieving discovery document"
                java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L72
                net.openid.appauth.internal.Logger.errorWithStack(r2, r3, r5)     // Catch: java.lang.Throwable -> L72
                net.openid.appauth.AuthorizationException r5 = net.openid.appauth.AuthorizationException.GeneralErrors.NETWORK_ERROR     // Catch: java.lang.Throwable -> L72
                net.openid.appauth.AuthorizationException r5 = net.openid.appauth.AuthorizationException.fromTemplate(r5, r2)     // Catch: java.lang.Throwable -> L72
                r4.mException = r5     // Catch: java.lang.Throwable -> L72
            L6e:
                net.openid.appauth.Utils.closeQuietly(r1)
                return r0
            L72:
                r5 = move-exception
                r0 = r1
            L74:
                net.openid.appauth.Utils.closeQuietly(r0)
                throw r5
        }

        @Override // android.os.AsyncTask
        protected /* bridge */ /* synthetic */ void onPostExecute(net.openid.appauth.AuthorizationServiceConfiguration r1) {
                r0 = this;
                net.openid.appauth.AuthorizationServiceConfiguration r1 = (net.openid.appauth.AuthorizationServiceConfiguration) r1
                r0.onPostExecute2(r1)
                return
        }

        /* JADX INFO: renamed from: onPostExecute, reason: avoid collision after fix types in other method */
        protected void onPostExecute2(net.openid.appauth.AuthorizationServiceConfiguration r3) {
                r2 = this;
                net.openid.appauth.AuthorizationException r0 = r2.mException
                r1 = 0
                if (r0 == 0) goto Lb
                net.openid.appauth.AuthorizationServiceConfiguration$RetrieveConfigurationCallback r3 = r2.mCallback
                r3.onFetchConfigurationCompleted(r1, r0)
                goto L10
            Lb:
                net.openid.appauth.AuthorizationServiceConfiguration$RetrieveConfigurationCallback r0 = r2.mCallback
                r0.onFetchConfigurationCompleted(r3, r1)
            L10:
                return
        }
    }

    public interface RetrieveConfigurationCallback {
        void onFetchConfigurationCompleted(net.openid.appauth.AuthorizationServiceConfiguration r1, net.openid.appauth.AuthorizationException r2);
    }

    public AuthorizationServiceConfiguration(android.net.Uri r2, android.net.Uri r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public AuthorizationServiceConfiguration(android.net.Uri r2, android.net.Uri r3, android.net.Uri r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public AuthorizationServiceConfiguration(android.net.Uri r1, android.net.Uri r2, android.net.Uri r3, android.net.Uri r4) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = net.openid.appauth.Preconditions.checkNotNull(r1)
            android.net.Uri r1 = (android.net.Uri) r1
            r0.authorizationEndpoint = r1
            java.lang.Object r1 = net.openid.appauth.Preconditions.checkNotNull(r2)
            android.net.Uri r1 = (android.net.Uri) r1
            r0.tokenEndpoint = r1
            r0.registrationEndpoint = r3
            r0.endSessionEndpoint = r4
            r1 = 0
            r0.discoveryDoc = r1
            return
    }

    public AuthorizationServiceConfiguration(net.openid.appauth.AuthorizationServiceDiscovery r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "docJson cannot be null"
            net.openid.appauth.Preconditions.checkNotNull(r2, r0)
            r1.discoveryDoc = r2
            android.net.Uri r0 = r2.getAuthorizationEndpoint()
            r1.authorizationEndpoint = r0
            android.net.Uri r0 = r2.getTokenEndpoint()
            r1.tokenEndpoint = r0
            android.net.Uri r0 = r2.getRegistrationEndpoint()
            r1.registrationEndpoint = r0
            android.net.Uri r2 = r2.getEndSessionEndpoint()
            r1.endSessionEndpoint = r2
            return
    }

    static android.net.Uri buildConfigurationUriFromIssuer(android.net.Uri r1) {
            android.net.Uri$Builder r1 = r1.buildUpon()
            java.lang.String r0 = ".well-known"
            android.net.Uri$Builder r1 = r1.appendPath(r0)
            java.lang.String r0 = "openid-configuration"
            android.net.Uri$Builder r1 = r1.appendPath(r0)
            android.net.Uri r1 = r1.build()
            return r1
    }

    public static void fetchFromIssuer(android.net.Uri r0, net.openid.appauth.AuthorizationServiceConfiguration.RetrieveConfigurationCallback r1) {
            android.net.Uri r0 = buildConfigurationUriFromIssuer(r0)
            fetchFromUrl(r0, r1)
            return
    }

    public static void fetchFromIssuer(android.net.Uri r0, net.openid.appauth.AuthorizationServiceConfiguration.RetrieveConfigurationCallback r1, net.openid.appauth.connectivity.ConnectionBuilder r2) {
            android.net.Uri r0 = buildConfigurationUriFromIssuer(r0)
            fetchFromUrl(r0, r1, r2)
            return
    }

    public static void fetchFromUrl(android.net.Uri r1, net.openid.appauth.AuthorizationServiceConfiguration.RetrieveConfigurationCallback r2) {
            net.openid.appauth.connectivity.DefaultConnectionBuilder r0 = net.openid.appauth.connectivity.DefaultConnectionBuilder.INSTANCE
            fetchFromUrl(r1, r2, r0)
            return
    }

    public static void fetchFromUrl(android.net.Uri r1, net.openid.appauth.AuthorizationServiceConfiguration.RetrieveConfigurationCallback r2, net.openid.appauth.connectivity.ConnectionBuilder r3) {
            java.lang.String r0 = "openIDConnectDiscoveryUri cannot be null"
            net.openid.appauth.Preconditions.checkNotNull(r1, r0)
            java.lang.String r0 = "callback cannot be null"
            net.openid.appauth.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "connectionBuilder must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r3, r0)
            net.openid.appauth.AuthorizationServiceConfiguration$ConfigurationRetrievalAsyncTask r0 = new net.openid.appauth.AuthorizationServiceConfiguration$ConfigurationRetrievalAsyncTask
            r0.<init>(r1, r3, r2)
            r1 = 0
            java.lang.Void[] r1 = new java.lang.Void[r1]
            r0.execute(r1)
            return
    }

    public static net.openid.appauth.AuthorizationServiceConfiguration fromJson(java.lang.String r1) throws org.json.JSONException {
            java.lang.String r0 = "json cannot be null"
            net.openid.appauth.Preconditions.checkNotNull(r1, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r1)
            net.openid.appauth.AuthorizationServiceConfiguration r1 = fromJson(r0)
            return r1
    }

    public static net.openid.appauth.AuthorizationServiceConfiguration fromJson(org.json.JSONObject r5) throws org.json.JSONException {
            java.lang.String r0 = "json object cannot be null"
            net.openid.appauth.Preconditions.checkNotNull(r5, r0)
            java.lang.String r0 = "discoveryDoc"
            boolean r1 = r5.has(r0)
            if (r1 == 0) goto L36
            net.openid.appauth.AuthorizationServiceDiscovery r1 = new net.openid.appauth.AuthorizationServiceDiscovery     // Catch: net.openid.appauth.AuthorizationServiceDiscovery.MissingArgumentException -> L1c
            org.json.JSONObject r5 = r5.optJSONObject(r0)     // Catch: net.openid.appauth.AuthorizationServiceDiscovery.MissingArgumentException -> L1c
            r1.<init>(r5)     // Catch: net.openid.appauth.AuthorizationServiceDiscovery.MissingArgumentException -> L1c
            net.openid.appauth.AuthorizationServiceConfiguration r5 = new net.openid.appauth.AuthorizationServiceConfiguration     // Catch: net.openid.appauth.AuthorizationServiceDiscovery.MissingArgumentException -> L1c
            r5.<init>(r1)     // Catch: net.openid.appauth.AuthorizationServiceDiscovery.MissingArgumentException -> L1c
            return r5
        L1c:
            r5 = move-exception
            org.json.JSONException r0 = new org.json.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Missing required field in discovery doc: "
            r1.<init>(r2)
            java.lang.String r5 = r5.getMissingField()
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        L36:
            java.lang.String r0 = "authorizationEndpoint"
            boolean r1 = r5.has(r0)
            java.lang.String r2 = "missing authorizationEndpoint"
            net.openid.appauth.Preconditions.checkArgument(r1, r2)
            java.lang.String r1 = "tokenEndpoint"
            boolean r2 = r5.has(r1)
            java.lang.String r3 = "missing tokenEndpoint"
            net.openid.appauth.Preconditions.checkArgument(r2, r3)
            net.openid.appauth.AuthorizationServiceConfiguration r2 = new net.openid.appauth.AuthorizationServiceConfiguration
            android.net.Uri r0 = net.openid.appauth.JsonUtil.getUri(r5, r0)
            android.net.Uri r1 = net.openid.appauth.JsonUtil.getUri(r5, r1)
            java.lang.String r3 = "registrationEndpoint"
            android.net.Uri r3 = net.openid.appauth.JsonUtil.getUriIfDefined(r5, r3)
            java.lang.String r4 = "endSessionEndpoint"
            android.net.Uri r5 = net.openid.appauth.JsonUtil.getUriIfDefined(r5, r4)
            r2.<init>(r0, r1, r3, r5)
            return r2
    }

    public org.json.JSONObject toJson() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            android.net.Uri r1 = r3.authorizationEndpoint
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "authorizationEndpoint"
            net.openid.appauth.JsonUtil.put(r0, r2, r1)
            android.net.Uri r1 = r3.tokenEndpoint
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "tokenEndpoint"
            net.openid.appauth.JsonUtil.put(r0, r2, r1)
            android.net.Uri r1 = r3.registrationEndpoint
            if (r1 == 0) goto L28
            java.lang.String r2 = "registrationEndpoint"
            java.lang.String r1 = r1.toString()
            net.openid.appauth.JsonUtil.put(r0, r2, r1)
        L28:
            android.net.Uri r1 = r3.endSessionEndpoint
            if (r1 == 0) goto L35
            java.lang.String r2 = "endSessionEndpoint"
            java.lang.String r1 = r1.toString()
            net.openid.appauth.JsonUtil.put(r0, r2, r1)
        L35:
            net.openid.appauth.AuthorizationServiceDiscovery r1 = r3.discoveryDoc
            if (r1 == 0) goto L40
            java.lang.String r2 = "discoveryDoc"
            org.json.JSONObject r1 = r1.docJson
            net.openid.appauth.JsonUtil.put(r0, r2, r1)
        L40:
            return r0
    }

    public java.lang.String toJsonString() {
            r1 = this;
            org.json.JSONObject r0 = r1.toJson()
            java.lang.String r0 = r0.toString()
            return r0
    }
}
