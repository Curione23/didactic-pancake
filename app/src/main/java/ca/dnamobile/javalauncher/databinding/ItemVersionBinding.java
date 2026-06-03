package ca.dnamobile.javalauncher.databinding;

/* JADX INFO: loaded from: classes.dex */
public final class ItemVersionBinding implements androidx.viewbinding.ViewBinding {
    private final com.google.android.material.card.MaterialCardView rootView;
    public final android.widget.TextView textVersionMeta;
    public final android.widget.TextView textVersionName;
    public final android.widget.TextView textVersionState;
    public final com.google.android.material.card.MaterialCardView versionCard;

    private ItemVersionBinding(com.google.android.material.card.MaterialCardView r1, android.widget.TextView r2, android.widget.TextView r3, android.widget.TextView r4, com.google.android.material.card.MaterialCardView r5) {
            r0 = this;
            r0.<init>()
            r0.rootView = r1
            r0.textVersionMeta = r2
            r0.textVersionName = r3
            r0.textVersionState = r4
            r0.versionCard = r5
            return
    }

    public static ca.dnamobile.javalauncher.databinding.ItemVersionBinding bind(android.view.View r8) {
            int r0 = ca.dnamobile.javalauncher.R.id.textVersionMeta
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r8, r0)
            r4 = r1
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L2c
            int r0 = ca.dnamobile.javalauncher.R.id.textVersionName
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r8, r0)
            r5 = r1
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L2c
            int r0 = ca.dnamobile.javalauncher.R.id.textVersionState
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r8, r0)
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto L2c
            r7 = r8
            com.google.android.material.card.MaterialCardView r7 = (com.google.android.material.card.MaterialCardView) r7
            ca.dnamobile.javalauncher.databinding.ItemVersionBinding r8 = new ca.dnamobile.javalauncher.databinding.ItemVersionBinding
            r2 = r8
            r3 = r7
            r2.<init>(r3, r4, r5, r6, r7)
            return r8
        L2c:
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r8 = r8.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r8 = r1.concat(r8)
            r0.<init>(r8)
            throw r0
    }

    public static ca.dnamobile.javalauncher.databinding.ItemVersionBinding inflate(android.view.LayoutInflater r2) {
            r0 = 0
            r1 = 0
            ca.dnamobile.javalauncher.databinding.ItemVersionBinding r2 = inflate(r2, r0, r1)
            return r2
    }

    public static ca.dnamobile.javalauncher.databinding.ItemVersionBinding inflate(android.view.LayoutInflater r2, android.view.ViewGroup r3, boolean r4) {
            int r0 = ca.dnamobile.javalauncher.R.layout.item_version
            r1 = 0
            android.view.View r2 = r2.inflate(r0, r3, r1)
            if (r4 == 0) goto Lc
            r3.addView(r2)
        Lc:
            ca.dnamobile.javalauncher.databinding.ItemVersionBinding r2 = bind(r2)
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
