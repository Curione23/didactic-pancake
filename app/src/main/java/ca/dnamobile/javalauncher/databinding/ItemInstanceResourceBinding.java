package ca.dnamobile.javalauncher.databinding;

/* JADX INFO: loaded from: classes.dex */
public final class ItemInstanceResourceBinding implements androidx.viewbinding.ViewBinding {
    public final com.google.android.material.button.MaterialButton buttonDeleteResource;
    public final com.google.android.material.button.MaterialButton buttonPlayWorld;
    public final com.google.android.material.button.MaterialButton buttonUpdateResource;
    public final com.google.android.material.imageview.ShapeableImageView imageResourceIcon;
    public final android.widget.ImageView imageResourceInstalledSource;
    private final com.google.android.material.card.MaterialCardView rootView;
    public final com.google.android.material.switchmaterial.SwitchMaterial switchResourceEnabled;
    public final android.widget.TextView textResourceName;
    public final android.widget.TextView textResourceSubtitle;

    private ItemInstanceResourceBinding(com.google.android.material.card.MaterialCardView r1, com.google.android.material.button.MaterialButton r2, com.google.android.material.button.MaterialButton r3, com.google.android.material.button.MaterialButton r4, com.google.android.material.imageview.ShapeableImageView r5, android.widget.ImageView r6, com.google.android.material.switchmaterial.SwitchMaterial r7, android.widget.TextView r8, android.widget.TextView r9) {
            r0 = this;
            r0.<init>()
            r0.rootView = r1
            r0.buttonDeleteResource = r2
            r0.buttonPlayWorld = r3
            r0.buttonUpdateResource = r4
            r0.imageResourceIcon = r5
            r0.imageResourceInstalledSource = r6
            r0.switchResourceEnabled = r7
            r0.textResourceName = r8
            r0.textResourceSubtitle = r9
            return
    }

    public static ca.dnamobile.javalauncher.databinding.ItemInstanceResourceBinding bind(android.view.View r12) {
            int r0 = ca.dnamobile.javalauncher.R.id.buttonDeleteResource
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r0)
            r4 = r1
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            if (r4 == 0) goto L62
            int r0 = ca.dnamobile.javalauncher.R.id.buttonPlayWorld
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r0)
            r5 = r1
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            if (r5 == 0) goto L62
            int r0 = ca.dnamobile.javalauncher.R.id.buttonUpdateResource
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r0)
            r6 = r1
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            if (r6 == 0) goto L62
            int r0 = ca.dnamobile.javalauncher.R.id.imageResourceIcon
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r0)
            r7 = r1
            com.google.android.material.imageview.ShapeableImageView r7 = (com.google.android.material.imageview.ShapeableImageView) r7
            if (r7 == 0) goto L62
            int r0 = ca.dnamobile.javalauncher.R.id.imageResourceInstalledSource
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r0)
            r8 = r1
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            if (r8 == 0) goto L62
            int r0 = ca.dnamobile.javalauncher.R.id.switchResourceEnabled
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r0)
            r9 = r1
            com.google.android.material.switchmaterial.SwitchMaterial r9 = (com.google.android.material.switchmaterial.SwitchMaterial) r9
            if (r9 == 0) goto L62
            int r0 = ca.dnamobile.javalauncher.R.id.textResourceName
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r0)
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r10 == 0) goto L62
            int r0 = ca.dnamobile.javalauncher.R.id.textResourceSubtitle
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r0)
            r11 = r1
            android.widget.TextView r11 = (android.widget.TextView) r11
            if (r11 == 0) goto L62
            ca.dnamobile.javalauncher.databinding.ItemInstanceResourceBinding r0 = new ca.dnamobile.javalauncher.databinding.ItemInstanceResourceBinding
            r3 = r12
            com.google.android.material.card.MaterialCardView r3 = (com.google.android.material.card.MaterialCardView) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L62:
            android.content.res.Resources r12 = r12.getResources()
            java.lang.String r12 = r12.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r12 = r1.concat(r12)
            r0.<init>(r12)
            throw r0
    }

    public static ca.dnamobile.javalauncher.databinding.ItemInstanceResourceBinding inflate(android.view.LayoutInflater r2) {
            r0 = 0
            r1 = 0
            ca.dnamobile.javalauncher.databinding.ItemInstanceResourceBinding r2 = inflate(r2, r0, r1)
            return r2
    }

    public static ca.dnamobile.javalauncher.databinding.ItemInstanceResourceBinding inflate(android.view.LayoutInflater r2, android.view.ViewGroup r3, boolean r4) {
            int r0 = ca.dnamobile.javalauncher.R.layout.item_instance_resource
            r1 = 0
            android.view.View r2 = r2.inflate(r0, r3, r1)
            if (r4 == 0) goto Lc
            r3.addView(r2)
        Lc:
            ca.dnamobile.javalauncher.databinding.ItemInstanceResourceBinding r2 = bind(r2)
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
