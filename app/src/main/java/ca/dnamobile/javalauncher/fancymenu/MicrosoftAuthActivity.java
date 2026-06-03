package ca.dnamobile.javalauncher.fancymenu;

/* JADX INFO: loaded from: classes.dex */
public final class MicrosoftAuthActivity extends android.app.Activity {
    public static final java.lang.String EXTRA_AUTH_CODE = "ca.dnamobile.javalauncher.auth.AUTH_CODE";
    public static final java.lang.String EXTRA_AUTH_URL = "ca.dnamobile.javalauncher.auth.AUTH_URL";
    public static final java.lang.String EXTRA_CODE_VERIFIER = "ca.dnamobile.javalauncher.auth.CODE_VERIFIER";
    public static final java.lang.String EXTRA_ERROR = "ca.dnamobile.javalauncher.auth.ERROR";
    private static final java.lang.String STATE_AUTH_URL = "ca.dnamobile.javalauncher.auth.STATE_AUTH_URL";
    private static final java.lang.String STATE_CODE_VERIFIER = "ca.dnamobile.javalauncher.auth.STATE_CODE_VERIFIER";
    private static final java.lang.String TAG = "MicrosoftAuth";
    private java.lang.String authUrl;
    private boolean finished;
    private java.lang.String pkceCodeVerifier;
    private android.widget.ProgressBar progressBar;
    private boolean restoredFromPendingSession;
    private android.webkit.WebView webView;

    private final class LoginWebChromeClient extends android.webkit.WebChromeClient {
        final /* synthetic */ ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity this$0;

        private LoginWebChromeClient(ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ LoginWebChromeClient(ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity r1, ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity.LoginWebChromeClientIA r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(android.webkit.WebView r1, boolean r2, boolean r3, android.os.Message r4) {
                r0 = this;
                ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity r1 = r0.this$0
                android.webkit.WebView r1 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity.m446$$Nest$fgetwebView(r1)
                if (r1 == 0) goto L1d
                if (r4 != 0) goto Lb
                goto L1d
            Lb:
                java.lang.Object r1 = r4.obj
                android.webkit.WebView$WebViewTransport r1 = (android.webkit.WebView.WebViewTransport) r1
                ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity r2 = r0.this$0
                android.webkit.WebView r2 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity.m446$$Nest$fgetwebView(r2)
                r1.setWebView(r2)
                r4.sendToTarget()
                r1 = 1
                return r1
            L1d:
                r1 = 0
                return r1
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity$LoginWebChromeClient-IA, reason: invalid class name */
    /* JADX INFO: compiled from: D8$$SyntheticClass */
    public final /* synthetic */ class LoginWebChromeClientIA {
    }

    private final class LoginWebViewClient extends android.webkit.WebViewClient {
        final /* synthetic */ ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity this$0;

        private LoginWebViewClient(ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ LoginWebViewClient(ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity r1, ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity.LoginWebViewClientIA r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.webkit.WebViewClient
        public void doUpdateVisitedHistory(android.webkit.WebView r1, java.lang.String r2, boolean r3) {
                r0 = this;
                super.doUpdateVisitedHistory(r1, r2, r3)
                ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity r1 = r0.this$0
                ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity.m447$$Nest$mhandleUrl(r1, r2)
                return
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(android.webkit.WebView r1, java.lang.String r2) {
                r0 = this;
                super.onPageFinished(r1, r2)
                ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity r1 = r0.this$0
                ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity.m447$$Nest$mhandleUrl(r1, r2)
                ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity r1 = r0.this$0
                android.widget.ProgressBar r1 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity.m445$$Nest$fgetprogressBar(r1)
                if (r1 == 0) goto L1b
                ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity r1 = r0.this$0
                android.widget.ProgressBar r1 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity.m445$$Nest$fgetprogressBar(r1)
                r2 = 8
                r1.setVisibility(r2)
            L1b:
                return
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(android.webkit.WebView r1, java.lang.String r2, android.graphics.Bitmap r3) {
                r0 = this;
                super.onPageStarted(r1, r2, r3)
                ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity r1 = r0.this$0
                android.widget.ProgressBar r1 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity.m445$$Nest$fgetprogressBar(r1)
                if (r1 == 0) goto L15
                ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity r1 = r0.this$0
                android.widget.ProgressBar r1 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity.m445$$Nest$fgetprogressBar(r1)
                r3 = 0
                r1.setVisibility(r3)
            L15:
                ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity r1 = r0.this$0
                ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity.m447$$Nest$mhandleUrl(r1, r2)
                return
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(android.webkit.WebView r2, android.webkit.WebResourceRequest r3, android.webkit.WebResourceError r4) {
                r1 = this;
                super.onReceivedError(r2, r3, r4)
                if (r3 == 0) goto L5a
                boolean r2 = r3.isForMainFrame()
                if (r2 != 0) goto Lc
                goto L5a
            Lc:
                android.net.Uri r2 = r3.getUrl()
                if (r2 == 0) goto L1b
                android.net.Uri r2 = r3.getUrl()
                java.lang.String r2 = r2.toString()
                goto L1d
            L1b:
                java.lang.String r2 = ""
            L1d:
                boolean r3 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal.isRedirect(r2)
                if (r3 == 0) goto L29
                ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity r3 = r1.this$0
                ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity.m447$$Nest$mhandleUrl(r3, r2)
                return
            L29:
                if (r4 == 0) goto L34
                java.lang.CharSequence r3 = r4.getDescription()
                java.lang.String r3 = java.lang.String.valueOf(r3)
                goto L36
            L34:
                java.lang.String r3 = "Unknown WebView error"
            L36:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r0 = "Microsoft login WebView main-frame error: "
                r4.<init>(r0)
                java.lang.StringBuilder r3 = r4.append(r3)
                java.lang.String r4 = " url="
                java.lang.StringBuilder r3 = r3.append(r4)
                ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity r4 = r1.this$0
                java.lang.String r2 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity.m448$$Nest$msanitizeUrlForLog(r4, r2)
                java.lang.StringBuilder r2 = r3.append(r2)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "MicrosoftAuth"
                ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r2)
            L5a:
                return
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView r3, android.webkit.WebResourceRequest r4) {
                r2 = this;
                if (r4 == 0) goto L11
                android.net.Uri r0 = r4.getUrl()
                if (r0 == 0) goto L11
                android.net.Uri r0 = r4.getUrl()
                java.lang.String r0 = r0.toString()
                goto L12
            L11:
                r0 = 0
            L12:
                ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity r1 = r2.this$0
                boolean r0 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity.m447$$Nest$mhandleUrl(r1, r0)
                if (r0 != 0) goto L23
                boolean r3 = super.shouldOverrideUrlLoading(r3, r4)
                if (r3 == 0) goto L21
                goto L23
            L21:
                r3 = 0
                goto L24
            L23:
                r3 = 1
            L24:
                return r3
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView r2, java.lang.String r3) {
                r1 = this;
                ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity r0 = r1.this$0
                boolean r0 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity.m447$$Nest$mhandleUrl(r0, r3)
                if (r0 != 0) goto L11
                boolean r2 = super.shouldOverrideUrlLoading(r2, r3)
                if (r2 == 0) goto Lf
                goto L11
            Lf:
                r2 = 0
                goto L12
            L11:
                r2 = 1
            L12:
                return r2
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity$LoginWebViewClient-IA, reason: invalid class name */
    /* JADX INFO: compiled from: D8$$SyntheticClass */
    public final /* synthetic */ class LoginWebViewClientIA {
    }

    public static /* synthetic */ void $r8$lambda$RPGpOfKdJWvo7MOy6A_CulrKGh4(ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity r0, boolean r1) {
            r0.lambda$startSession$0(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$fgetprogressBar, reason: not valid java name */
    static /* bridge */ /* synthetic */ android.widget.ProgressBar m445$$Nest$fgetprogressBar(ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity r0) {
            android.widget.ProgressBar r0 = r0.progressBar
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgetwebView, reason: not valid java name */
    static /* bridge */ /* synthetic */ android.webkit.WebView m446$$Nest$fgetwebView(ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity r0) {
            android.webkit.WebView r0 = r0.webView
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mhandleUrl, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m447$$Nest$mhandleUrl(ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity r0, java.lang.String r1) {
            boolean r0 = r0.handleUrl(r1)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$msanitizeUrlForLog, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m448$$Nest$msanitizeUrlForLog(ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity r0, java.lang.String r1) {
            java.lang.String r0 = r0.sanitizeUrlForLog(r1)
            return r0
    }

    public MicrosoftAuthActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    private void cancelLogin(java.lang.String r3) {
            r2 = this;
            boolean r0 = r2.finished
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r2.finished = r0
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthSessionStore.clear(r2)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "ca.dnamobile.javalauncher.auth.ERROR"
            r0.putExtra(r1, r3)
            r3 = 0
            r2.setResult(r3, r0)
            r2.finish()
            return
    }

    private void createContentView() {
            r5 = this;
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r5)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.setBackgroundColor(r1)
            android.webkit.WebView r1 = new android.webkit.WebView
            r1.<init>(r5)
            r5.webView = r1
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = -1
            r2.<init>(r3, r3)
            r0.addView(r1, r2)
            android.widget.ProgressBar r1 = new android.widget.ProgressBar
            r1.<init>(r5)
            r5.progressBar = r1
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = -2
            r4 = 17
            r2.<init>(r3, r3, r4)
            r0.addView(r1, r2)
            r5.setContentView(r0)
            return
    }

    private void ensureAuthUrl() {
            r1 = this;
            java.lang.String r0 = r1.authUrl
            if (r0 == 0) goto Lb
            int r0 = r0.length()
            if (r0 <= 0) goto Lb
            return
        Lb:
            java.lang.String r0 = r1.pkceCodeVerifier
            if (r0 == 0) goto L15
            int r0 = r0.length()
            if (r0 != 0) goto L1b
        L15:
            java.lang.String r0 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal.createCodeVerifier()
            r1.pkceCodeVerifier = r0
        L1b:
            java.lang.String r0 = r1.pkceCodeVerifier
            android.net.Uri r0 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal.buildAuthorizationUriWithPkce(r0)
            java.lang.String r0 = r0.toString()
            r1.authUrl = r0
            return
    }

    private boolean handleUrl(java.lang.String r9) {
            r8 = this;
            boolean r0 = r8.finished
            r1 = 0
            if (r0 != 0) goto Lbc
            if (r9 != 0) goto L9
            goto Lbc
        L9:
            java.lang.String r0 = "res=cancel"
            boolean r0 = r9.contains(r0)
            r2 = 1
            if (r0 == 0) goto L18
            java.lang.String r9 = "Authorization canceled"
            r8.cancelLogin(r9)
            return r2
        L18:
            boolean r0 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal.isRedirect(r9)
            if (r0 != 0) goto L1f
            return r1
        L1f:
            android.net.Uri r0 = android.net.Uri.parse(r9)
            java.lang.String r3 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal.extractCode(r0)
            java.lang.String r0 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal.extractError(r0)
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r5 = "ca.dnamobile.javalauncher.auth.ERROR"
            java.lang.String r6 = "MicrosoftAuth"
            if (r3 == 0) goto L84
            int r7 = r3.length()
            if (r7 != 0) goto L3d
            goto L84
        L3d:
            java.lang.String r9 = "Microsoft authorization code received."
            ca.dnamobile.javalauncher.feature.log.Logging.i(r6, r9)
            java.lang.String r9 = "ca.dnamobile.javalauncher.auth.AUTH_CODE"
            r4.putExtra(r9, r3)
            java.lang.String r9 = r8.pkceCodeVerifier
            if (r9 == 0) goto L51
            int r9 = r9.length()
            if (r9 != 0) goto L57
        L51:
            java.lang.String r9 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal.getPendingCodeVerifier()
            r8.pkceCodeVerifier = r9
        L57:
            java.lang.String r9 = r8.pkceCodeVerifier
            if (r9 == 0) goto L70
            int r9 = r9.length()
            if (r9 != 0) goto L62
            goto L70
        L62:
            java.lang.String r9 = "ca.dnamobile.javalauncher.auth.CODE_VERIFIER"
            java.lang.String r0 = r8.pkceCodeVerifier
            r4.putExtra(r9, r0)
            r8.finished = r2
            r9 = -1
            r8.setResult(r9, r4)
            goto Lb8
        L70:
            java.lang.String r9 = "Authorization finished without a PKCE verifier. Please start Microsoft sign-in again."
            ca.dnamobile.javalauncher.feature.log.Logging.i(r6, r9)
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthSessionStore.clear(r8)
            r4.putExtra(r5, r9)
            r8.finished = r2
            r8.setResult(r1, r4)
            r8.finish()
            return r2
        L84:
            if (r0 == 0) goto L8d
            int r3 = r0.length()
            if (r3 <= 0) goto L8d
            goto L8f
        L8d:
            java.lang.String r0 = "Microsoft login finished without an authorization code."
        L8f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r7 = " url="
            java.lang.StringBuilder r3 = r3.append(r7)
            java.lang.String r9 = r8.sanitizeUrlForLog(r9)
            java.lang.StringBuilder r9 = r3.append(r9)
            java.lang.String r9 = r9.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r6, r9)
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthSessionStore.clear(r8)
            r4.putExtra(r5, r0)
            r8.finished = r2
            r8.setResult(r1, r4)
        Lb8:
            r8.finish()
            return r2
        Lbc:
            return r1
    }

    private static boolean isBlank(java.lang.String r0) {
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    private /* synthetic */ void lambda$startSession$0(boolean r2) {
            r1 = this;
            android.webkit.WebView r0 = r1.webView
            if (r0 != 0) goto L5
            return
        L5:
            if (r2 == 0) goto L15
            r0.clearHistory()
            android.webkit.WebView r2 = r1.webView
            r0 = 1
            r2.clearCache(r0)
            android.webkit.WebView r2 = r1.webView
            r2.clearFormData()
        L15:
            r1.ensureAuthUrl()
            java.lang.String r2 = r1.authUrl
            boolean r2 = isBlank(r2)
            if (r2 != 0) goto L52
            java.lang.String r2 = r1.pkceCodeVerifier
            boolean r2 = isBlank(r2)
            if (r2 == 0) goto L29
            goto L52
        L29:
            java.lang.String r2 = r1.pkceCodeVerifier
            java.lang.String r0 = r1.authUrl
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthSessionStore.save(r1, r2, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "Opening Microsoft login: "
            r2.<init>(r0)
            java.lang.String r0 = r1.authUrl
            java.lang.String r0 = r1.sanitizeUrlForLog(r0)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "MicrosoftAuth"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r2)
            android.webkit.WebView r2 = r1.webView
            java.lang.String r0 = r1.authUrl
            r2.loadUrl(r0)
            return
        L52:
            java.lang.String r2 = "Unable to create Microsoft authorization URL."
            r1.cancelLogin(r2)
            return
    }

    static /* synthetic */ void lambda$startSession$1(java.lang.Runnable r0, java.lang.Boolean r1) {
            android.webkit.CookieManager r1 = android.webkit.CookieManager.getInstance()     // Catch: java.lang.Throwable -> L7
            r1.flush()     // Catch: java.lang.Throwable -> L7
        L7:
            r0.run()
            return
    }

    private java.lang.String sanitizeUrlForLog(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = "code="
            int r0 = r6.indexOf(r0)
            r1 = 0
            if (r0 < 0) goto L21
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = r6.substring(r1, r0)
            java.lang.StringBuilder r6 = r2.append(r6)
            java.lang.String r0 = "code=<hidden>"
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            return r6
        L21:
            java.lang.String r0 = "code_challenge="
            int r0 = r6.indexOf(r0)
            if (r0 < 0) goto L66
            r2 = 38
            int r2 = r6.indexOf(r2, r0)
            java.lang.String r3 = "code_challenge=<hidden>"
            if (r2 < 0) goto L51
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = r6.substring(r1, r0)
            java.lang.StringBuilder r0 = r4.append(r0)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r6 = r6.substring(r2)
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r6 = r6.toString()
            return r6
        L51:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = r6.substring(r1, r0)
            java.lang.StringBuilder r6 = r2.append(r6)
            java.lang.StringBuilder r6 = r6.append(r3)
            java.lang.String r6 = r6.toString()
        L66:
            return r6
    }

    private void setupWebView() {
            r3 = this;
            android.webkit.WebView r0 = r3.webView
            android.webkit.WebSettings r0 = r0.getSettings()
            r1 = 1
            r0.setJavaScriptEnabled(r1)
            r0.setDomStorageEnabled(r1)
            r0.setDatabaseEnabled(r1)
            r0.setLoadWithOverviewMode(r1)
            r0.setUseWideViewPort(r1)
            r0.setJavaScriptCanOpenWindowsAutomatically(r1)
            r0.setSupportMultipleWindows(r1)
            r2 = 0
            r0.setSaveFormData(r2)
            android.webkit.CookieManager r0 = android.webkit.CookieManager.getInstance()
            r0.setAcceptCookie(r1)
            android.webkit.WebView r2 = r3.webView
            r0.setAcceptThirdPartyCookies(r2, r1)
            android.webkit.WebView r0 = r3.webView
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity$LoginWebChromeClient r1 = new ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity$LoginWebChromeClient
            r2 = 0
            r1.<init>(r3, r2)
            r0.setWebChromeClient(r1)
            android.webkit.WebView r0 = r3.webView
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity$LoginWebViewClient r1 = new ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity$LoginWebViewClient
            r1.<init>(r3, r2)
            r0.setWebViewClient(r1)
            return
    }

    private void startSession(boolean r3) {
            r2 = this;
            android.widget.ProgressBar r0 = r2.progressBar
            r1 = 0
            r0.setVisibility(r1)
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity$$ExternalSyntheticLambda0 r0 = new ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity$$ExternalSyntheticLambda0
            r0.<init>(r2, r3)
            if (r3 != 0) goto L11
            r0.run()
            return
        L11:
            android.webkit.CookieManager r3 = android.webkit.CookieManager.getInstance()
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity$$ExternalSyntheticLambda1 r1 = new ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity$$ExternalSyntheticLambda1
            r1.<init>(r0)
            r3.removeAllCookies(r1)
            return
    }

    @Override // android.app.Activity
    public void onBackPressed() {
            r1 = this;
            android.webkit.WebView r0 = r1.webView
            if (r0 == 0) goto L10
            boolean r0 = r0.canGoBack()
            if (r0 == 0) goto L10
            android.webkit.WebView r0 = r1.webView
            r0.goBack()
            return
        L10:
            java.lang.String r0 = "Authorization canceled"
            r1.cancelLogin(r0)
            return
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle r4) {
            r3 = this;
            super.onCreate(r4)
            if (r4 == 0) goto L15
            java.lang.String r0 = "ca.dnamobile.javalauncher.auth.STATE_AUTH_URL"
            java.lang.String r0 = r4.getString(r0)
            r3.authUrl = r0
            java.lang.String r0 = "ca.dnamobile.javalauncher.auth.STATE_CODE_VERIFIER"
            java.lang.String r0 = r4.getString(r0)
            r3.pkceCodeVerifier = r0
        L15:
            java.lang.String r0 = r3.authUrl
            boolean r0 = isBlank(r0)
            if (r0 == 0) goto L29
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "ca.dnamobile.javalauncher.auth.AUTH_URL"
            java.lang.String r0 = r0.getStringExtra(r1)
            r3.authUrl = r0
        L29:
            java.lang.String r0 = r3.pkceCodeVerifier
            boolean r0 = isBlank(r0)
            if (r0 == 0) goto L3d
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "ca.dnamobile.javalauncher.auth.CODE_VERIFIER"
            java.lang.String r0 = r0.getStringExtra(r1)
            r3.pkceCodeVerifier = r0
        L3d:
            java.lang.String r0 = r3.authUrl
            boolean r0 = isBlank(r0)
            r1 = 1
            if (r0 != 0) goto L4e
            java.lang.String r0 = r3.pkceCodeVerifier
            boolean r0 = isBlank(r0)
            if (r0 == 0) goto L5e
        L4e:
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthSessionStore$Pending r0 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthSessionStore.load(r3)
            if (r0 == 0) goto L5e
            java.lang.String r2 = r0.authUrl
            r3.authUrl = r2
            java.lang.String r0 = r0.codeVerifier
            r3.pkceCodeVerifier = r0
            r3.restoredFromPendingSession = r1
        L5e:
            r3.createContentView()
            r3.setupWebView()
            if (r4 != 0) goto L6d
            boolean r4 = r3.restoredFromPendingSession
            r4 = r4 ^ r1
            r3.startSession(r4)
            goto L72
        L6d:
            android.webkit.WebView r0 = r3.webView
            r0.restoreState(r4)
        L72:
            return
    }

    @Override // android.app.Activity
    protected void onDestroy() {
            r2 = this;
            android.webkit.WebView r0 = r2.webView
            if (r0 == 0) goto L19
            r0.stopLoading()
            android.webkit.WebView r0 = r2.webView
            r1 = 0
            r0.setWebChromeClient(r1)
            android.webkit.WebView r0 = r2.webView
            r0.setWebViewClient(r1)
            android.webkit.WebView r0 = r2.webView
            r0.destroy()
            r2.webView = r1
        L19:
            super.onDestroy()
            return
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            super.onSaveInstanceState(r3)
            java.lang.String r0 = r2.authUrl
            if (r0 == 0) goto L14
            int r0 = r0.length()
            if (r0 <= 0) goto L14
            java.lang.String r0 = "ca.dnamobile.javalauncher.auth.STATE_AUTH_URL"
            java.lang.String r1 = r2.authUrl
            r3.putString(r0, r1)
        L14:
            java.lang.String r0 = r2.pkceCodeVerifier
            if (r0 == 0) goto L25
            int r0 = r0.length()
            if (r0 <= 0) goto L25
            java.lang.String r0 = "ca.dnamobile.javalauncher.auth.STATE_CODE_VERIFIER"
            java.lang.String r1 = r2.pkceCodeVerifier
            r3.putString(r0, r1)
        L25:
            android.webkit.WebView r0 = r2.webView
            if (r0 == 0) goto L2c
            r0.saveState(r3)
        L2c:
            return
    }
}
