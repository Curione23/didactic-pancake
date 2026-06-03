package ca.dnamobile.javalauncher.databinding;

/* JADX INFO: loaded from: classes.dex */
public final class ItemLauncherInstanceBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.ImageButton buttonDeleteInstance;
    public final android.widget.ImageView imageInstanceIcon;
    public final com.google.android.material.card.MaterialCardView instanceCard;
    private final com.google.android.material.card.MaterialCardView rootView;
    public final android.widget.TextView textInstanceMeta;
    public final android.widget.TextView textInstanceName;
    public final android.widget.TextView textInstanceState;

    private ItemLauncherInstanceBinding(com.google.android.material.card.MaterialCardView r1, android.widget.ImageButton r2, android.widget.ImageView r3, com.google.android.material.card.MaterialCardView r4, android.widget.TextView r5, android.widget.TextView r6, android.widget.TextView r7) {
            r0 = this;
            r0.<init>()
            r0.rootView = r1
            r0.buttonDeleteInstance = r2
            r0.imageInstanceIcon = r3
            r0.instanceCard = r4
            r0.textInstanceMeta = r5
            r0.textInstanceName = r6
            r0.textInstanceState = r7
            return
    }

    public static ca.dnamobile.javalauncher.databinding.ItemLauncherInstanceBinding bind(android.view.View r10) {
            int r0 = ca.dnamobile.javalauncher.R.id.buttonDeleteInstance
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r10, r0)
            r4 = r1
            android.widget.ImageButton r4 = (android.widget.ImageButton) r4
            if (r4 == 0) goto L42
            int r0 = ca.dnamobile.javalauncher.R.id.imageInstanceIcon
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r10, r0)
            r5 = r1
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            if (r5 == 0) goto L42
            r6 = r10
            com.google.android.material.card.MaterialCardView r6 = (com.google.android.material.card.MaterialCardView) r6
            int r0 = ca.dnamobile.javalauncher.R.id.textInstanceMeta
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r10, r0)
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L42
            int r0 = ca.dnamobile.javalauncher.R.id.textInstanceName
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r10, r0)
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L42
            int r0 = ca.dnamobile.javalauncher.R.id.textInstanceState
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r10, r0)
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L42
            ca.dnamobile.javalauncher.databinding.ItemLauncherInstanceBinding r10 = new ca.dnamobile.javalauncher.databinding.ItemLauncherInstanceBinding
            r2 = r10
            r3 = r6
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r10
        L42:
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r10 = r10.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r10 = r1.concat(r10)
            r0.<init>(r10)
            throw r0
    }

    public static ca.dnamobile.javalauncher.databinding.ItemLauncherInstanceBinding inflate(android.view.LayoutInflater r2) {
            r0 = 0
            r1 = 0
            ca.dnamobile.javalauncher.databinding.ItemLauncherInstanceBinding r2 = inflate(r2, r0, r1)
            return r2
    }

    public static ca.dnamobile.javalauncher.databinding.ItemLauncherInstanceBinding inflate(android.view.LayoutInflater r2, android.view.ViewGroup r3, boolean r4) {
            int r0 = ca.dnamobile.javalauncher.R.layout.item_launcher_instance
            r1 = 0
            android.view.View r2 = r2.inflate(r0, r3, r1)
            if (r4 == 0) goto Lc
            r3.addView(r2)
        Lc:
            ca.dnamobile.javalauncher.databinding.ItemLauncherInstanceBinding r2 = bind(r2)
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
