package androidx.browser.browseractions;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
class BrowserActionsFallbackMenuAdapter extends android.widget.BaseAdapter {
    private final android.content.Context mContext;
    private final java.util.List<androidx.browser.browseractions.BrowserActionItem> mMenuItems;



    static class ViewHolderItem {
        final android.widget.ImageView mIcon;
        final android.widget.TextView mText;

        ViewHolderItem(android.widget.ImageView r1, android.widget.TextView r2) {
                r0 = this;
                r0.<init>()
                r0.mIcon = r1
                r0.mText = r2
                return
        }
    }

    BrowserActionsFallbackMenuAdapter(java.util.List<androidx.browser.browseractions.BrowserActionItem> r1, android.content.Context r2) {
            r0 = this;
            r0.<init>()
            r0.mMenuItems = r1
            r0.mContext = r2
            return
    }

    @Override // android.widget.Adapter
    public int getCount() {
            r1 = this;
            java.util.List<androidx.browser.browseractions.BrowserActionItem> r0 = r1.mMenuItems
            int r0 = r0.size()
            return r0
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int r2) {
            r1 = this;
            java.util.List<androidx.browser.browseractions.BrowserActionItem> r0 = r1.mMenuItems
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // android.widget.Adapter
    public long getItemId(int r3) {
            r2 = this;
            long r0 = (long) r3
            return r0
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int r4, android.view.View r5, android.view.ViewGroup r6) {
            r3 = this;
            java.util.List<androidx.browser.browseractions.BrowserActionItem> r6 = r3.mMenuItems
            java.lang.Object r4 = r6.get(r4)
            androidx.browser.browseractions.BrowserActionItem r4 = (androidx.browser.browseractions.BrowserActionItem) r4
            r6 = 0
            if (r5 != 0) goto L3c
            android.content.Context r5 = r3.mContext
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            int r0 = androidx.browser.R.layout.browser_actions_context_menu_row
            android.view.View r5 = r5.inflate(r0, r6)
            int r0 = androidx.browser.R.id.browser_actions_menu_item_icon
            android.view.View r0 = r5.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            int r1 = androidx.browser.R.id.browser_actions_menu_item_text
            android.view.View r1 = r5.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r0 == 0) goto L34
            if (r1 == 0) goto L34
            androidx.browser.browseractions.BrowserActionsFallbackMenuAdapter$ViewHolderItem r2 = new androidx.browser.browseractions.BrowserActionsFallbackMenuAdapter$ViewHolderItem
            r2.<init>(r0, r1)
            r5.setTag(r2)
            goto L43
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Browser Actions fallback UI does not contain necessary Views."
            r4.<init>(r5)
            throw r4
        L3c:
            java.lang.Object r0 = r5.getTag()
            r2 = r0
            androidx.browser.browseractions.BrowserActionsFallbackMenuAdapter$ViewHolderItem r2 = (androidx.browser.browseractions.BrowserActionsFallbackMenuAdapter.ViewHolderItem) r2
        L43:
            java.lang.String r0 = r4.getTitle()
            android.widget.TextView r1 = r2.mText
            r1.setText(r0)
            int r1 = r4.getIconId()
            if (r1 == 0) goto L66
            android.content.Context r0 = r3.mContext
            android.content.res.Resources r0 = r0.getResources()
            int r4 = r4.getIconId()
            android.graphics.drawable.Drawable r4 = androidx.core.content.res.ResourcesCompat.getDrawable(r0, r4, r6)
            android.widget.ImageView r6 = r2.mIcon
            r6.setImageDrawable(r4)
            goto L93
        L66:
            android.net.Uri r1 = r4.getIconUri()
            if (r1 == 0) goto L88
            android.content.Context r6 = r3.mContext
            android.content.ContentResolver r6 = r6.getContentResolver()
            android.net.Uri r4 = r4.getIconUri()
            com.google.common.util.concurrent.ListenableFuture r4 = androidx.browser.browseractions.BrowserServiceFileProvider.loadBitmap(r6, r4)
            androidx.browser.browseractions.BrowserActionsFallbackMenuAdapter$1 r6 = new androidx.browser.browseractions.BrowserActionsFallbackMenuAdapter$1
            r6.<init>(r3, r0, r2, r4)
            androidx.browser.browseractions.BrowserActionsFallbackMenuAdapter$2 r0 = new androidx.browser.browseractions.BrowserActionsFallbackMenuAdapter$2
            r0.<init>(r3)
            r4.addListener(r6, r0)
            goto L93
        L88:
            android.widget.ImageView r4 = r2.mIcon
            r4.setImageBitmap(r6)
            android.widget.ImageView r4 = r2.mIcon
            r6 = 4
            r4.setVisibility(r6)
        L93:
            return r5
    }
}
