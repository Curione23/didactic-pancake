package ca.dnamobile.javalauncher.databinding;

/* JADX INFO: loaded from: classes.dex */
public final class ItemContentVersionBinding implements androidx.viewbinding.ViewBinding {
    public final com.google.android.material.button.MaterialButton buttonInstallVersion;
    private final com.google.android.material.card.MaterialCardView rootView;
    public final android.widget.TextView textVersionMeta;
    public final android.widget.TextView textVersionName;

    private ItemContentVersionBinding(com.google.android.material.card.MaterialCardView r1, com.google.android.material.button.MaterialButton r2, android.widget.TextView r3, android.widget.TextView r4) {
            r0 = this;
            r0.<init>()
            r0.rootView = r1
            r0.buttonInstallVersion = r2
            r0.textVersionMeta = r3
            r0.textVersionName = r4
            return
    }

    public static ca.dnamobile.javalauncher.databinding.ItemContentVersionBinding bind(android.view.View r4) {
            int r0 = ca.dnamobile.javalauncher.R.id.buttonInstallVersion
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r4, r0)
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            if (r1 == 0) goto L26
            int r0 = ca.dnamobile.javalauncher.R.id.textVersionMeta
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r4, r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L26
            int r0 = ca.dnamobile.javalauncher.R.id.textVersionName
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r4, r0)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L26
            ca.dnamobile.javalauncher.databinding.ItemContentVersionBinding r0 = new ca.dnamobile.javalauncher.databinding.ItemContentVersionBinding
            com.google.android.material.card.MaterialCardView r4 = (com.google.android.material.card.MaterialCardView) r4
            r0.<init>(r4, r1, r2, r3)
            return r0
        L26:
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r4 = r4.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
    }

    public static ca.dnamobile.javalauncher.databinding.ItemContentVersionBinding inflate(android.view.LayoutInflater r2) {
            r0 = 0
            r1 = 0
            ca.dnamobile.javalauncher.databinding.ItemContentVersionBinding r2 = inflate(r2, r0, r1)
            return r2
    }

    public static ca.dnamobile.javalauncher.databinding.ItemContentVersionBinding inflate(android.view.LayoutInflater r2, android.view.ViewGroup r3, boolean r4) {
            int r0 = ca.dnamobile.javalauncher.R.layout.item_content_version
            r1 = 0
            android.view.View r2 = r2.inflate(r0, r3, r1)
            if (r4 == 0) goto Lc
            r3.addView(r2)
        Lc:
            ca.dnamobile.javalauncher.databinding.ItemContentVersionBinding r2 = bind(r2)
            return r2
    }

    @Override // androidx.viewbinding.ViewBinding
    public /* bridge */ /* synthetic */ android.view.View getRoot() {
            r1 = this;
            com.google.android.material.card.MaterialCardView r0 = r1.getRoot()
            return r0
    }

    @Override // androidx.viewbinding.ViewBinding
    public com.google.android.material.card.MaterialCardView getRoot() {
            r1 = this;
            com.google.android.material.card.MaterialCardView r0 = r1.rootView
            return r0
    }
}
