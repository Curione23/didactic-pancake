package androidx.browser.browseractions;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
class BrowserActionsFallbackMenuUi implements android.widget.AdapterView.OnItemClickListener {
    private static final java.lang.String TAG = "BrowserActionskMenuUi";
    private androidx.browser.browseractions.BrowserActionsFallbackMenuDialog mBrowserActionsDialog;
    final android.content.Context mContext;
    private final java.util.List<androidx.browser.browseractions.BrowserActionItem> mMenuItems;
    androidx.browser.browseractions.BrowserActionsFallbackMenuUi.BrowserActionsFallMenuUiListener mMenuUiListener;
    final android.net.Uri mUri;




    interface BrowserActionsFallMenuUiListener {
        void onMenuShown(android.view.View r1);
    }

    BrowserActionsFallbackMenuUi(android.content.Context r1, android.net.Uri r2, java.util.List<androidx.browser.browseractions.BrowserActionItem> r3) {
            r0 = this;
            r0.<init>()
            r0.mContext = r1
            r0.mUri = r2
            java.util.List r1 = r0.buildFallbackMenuItemList(r3)
            r0.mMenuItems = r1
            return
    }

    private java.lang.Runnable buildCopyAction() {
            r1 = this;
            androidx.browser.browseractions.BrowserActionsFallbackMenuUi$1 r0 = new androidx.browser.browseractions.BrowserActionsFallbackMenuUi$1
            r0.<init>(r1)
            return r0
    }

    private java.util.List<androidx.browser.browseractions.BrowserActionItem> buildFallbackMenuItemList(java.util.List<androidx.browser.browseractions.BrowserActionItem> r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            androidx.browser.browseractions.BrowserActionItem r1 = new androidx.browser.browseractions.BrowserActionItem
            android.content.Context r2 = r4.mContext
            int r3 = androidx.browser.R.string.fallback_menu_item_open_in_browser
            java.lang.String r2 = r2.getString(r3)
            android.app.PendingIntent r3 = r4.buildOpenInBrowserAction()
            r1.<init>(r2, r3)
            r0.add(r1)
            androidx.browser.browseractions.BrowserActionItem r1 = new androidx.browser.browseractions.BrowserActionItem
            android.content.Context r2 = r4.mContext
            int r3 = androidx.browser.R.string.fallback_menu_item_copy_link
            java.lang.String r2 = r2.getString(r3)
            java.lang.Runnable r3 = r4.buildCopyAction()
            r1.<init>(r2, r3)
            r0.add(r1)
            androidx.browser.browseractions.BrowserActionItem r1 = new androidx.browser.browseractions.BrowserActionItem
            android.content.Context r2 = r4.mContext
            int r3 = androidx.browser.R.string.fallback_menu_item_share_link
            java.lang.String r2 = r2.getString(r3)
            android.app.PendingIntent r3 = r4.buildShareAction()
            r1.<init>(r2, r3)
            r0.add(r1)
            r0.addAll(r5)
            return r0
    }

    private android.app.PendingIntent buildOpenInBrowserAction() {
            r4 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.VIEW"
            android.net.Uri r2 = r4.mUri
            r0.<init>(r1, r2)
            android.content.Context r1 = r4.mContext
            r2 = 0
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r1, r2, r0, r3)
            return r0
    }

    private android.app.PendingIntent buildShareAction() {
            r4 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.SEND"
            r0.<init>(r1)
            android.net.Uri r1 = r4.mUri
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "android.intent.extra.TEXT"
            r0.putExtra(r2, r1)
            java.lang.String r1 = "text/plain"
            r0.setType(r1)
            android.content.Context r1 = r4.mContext
            r2 = 0
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r1, r2, r0, r3)
            return r0
    }

    private androidx.browser.browseractions.BrowserActionsFallbackMenuView initMenuView(android.view.View r5) {
            r4 = this;
            int r0 = androidx.browser.R.id.browser_actions_menu_view
            android.view.View r0 = r5.findViewById(r0)
            androidx.browser.browseractions.BrowserActionsFallbackMenuView r0 = (androidx.browser.browseractions.BrowserActionsFallbackMenuView) r0
            int r1 = androidx.browser.R.id.browser_actions_header_text
            android.view.View r1 = r5.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.net.Uri r2 = r4.mUri
            java.lang.String r2 = r2.toString()
            r1.setText(r2)
            androidx.browser.browseractions.BrowserActionsFallbackMenuUi$3 r2 = new androidx.browser.browseractions.BrowserActionsFallbackMenuUi$3
            r2.<init>(r4, r1)
            r1.setOnClickListener(r2)
            int r1 = androidx.browser.R.id.browser_actions_menu_items
            android.view.View r5 = r5.findViewById(r1)
            android.widget.ListView r5 = (android.widget.ListView) r5
            androidx.browser.browseractions.BrowserActionsFallbackMenuAdapter r1 = new androidx.browser.browseractions.BrowserActionsFallbackMenuAdapter
            java.util.List<androidx.browser.browseractions.BrowserActionItem> r2 = r4.mMenuItems
            android.content.Context r3 = r4.mContext
            r1.<init>(r2, r3)
            r5.setAdapter(r1)
            r5.setOnItemClickListener(r4)
            return r0
    }

    public void displayMenu() {
            r4 = this;
            android.content.Context r0 = r4.mContext
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = androidx.browser.R.layout.browser_actions_context_menu_page
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            androidx.browser.browseractions.BrowserActionsFallbackMenuDialog r1 = new androidx.browser.browseractions.BrowserActionsFallbackMenuDialog
            android.content.Context r2 = r4.mContext
            androidx.browser.browseractions.BrowserActionsFallbackMenuView r3 = r4.initMenuView(r0)
            r1.<init>(r2, r3)
            r4.mBrowserActionsDialog = r1
            r1.setContentView(r0)
            androidx.browser.browseractions.BrowserActionsFallbackMenuUi$BrowserActionsFallMenuUiListener r1 = r4.mMenuUiListener
            if (r1 == 0) goto L2b
            androidx.browser.browseractions.BrowserActionsFallbackMenuDialog r1 = r4.mBrowserActionsDialog
            androidx.browser.browseractions.BrowserActionsFallbackMenuUi$2 r2 = new androidx.browser.browseractions.BrowserActionsFallbackMenuUi$2
            r2.<init>(r4, r0)
            r1.setOnShowListener(r2)
        L2b:
            androidx.browser.browseractions.BrowserActionsFallbackMenuDialog r0 = r4.mBrowserActionsDialog
            r0.show()
            return
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            java.util.List<androidx.browser.browseractions.BrowserActionItem> r1 = r0.mMenuItems
            java.lang.Object r1 = r1.get(r3)
            androidx.browser.browseractions.BrowserActionItem r1 = (androidx.browser.browseractions.BrowserActionItem) r1
            android.app.PendingIntent r2 = r1.getAction()
            java.lang.String r3 = "BrowserActionskMenuUi"
            if (r2 == 0) goto L1f
            android.app.PendingIntent r1 = r1.getAction()     // Catch: android.app.PendingIntent.CanceledException -> L18
            r1.send()     // Catch: android.app.PendingIntent.CanceledException -> L18
            goto L2c
        L18:
            r1 = move-exception
            java.lang.String r2 = "Failed to send custom item action"
            android.util.Log.e(r3, r2, r1)
            goto L2c
        L1f:
            java.lang.Runnable r2 = r1.getRunnableAction()
            if (r2 == 0) goto L2c
            java.lang.Runnable r1 = r1.getRunnableAction()
            r1.run()
        L2c:
            androidx.browser.browseractions.BrowserActionsFallbackMenuDialog r1 = r0.mBrowserActionsDialog
            if (r1 != 0) goto L36
            java.lang.String r1 = "Cannot dismiss dialog, it has already been dismissed."
            android.util.Log.e(r3, r1)
            return
        L36:
            r1.dismiss()
            return
    }

    void setMenuUiListener(androidx.browser.browseractions.BrowserActionsFallbackMenuUi.BrowserActionsFallMenuUiListener r1) {
            r0 = this;
            r0.mMenuUiListener = r1
            return
    }
}
