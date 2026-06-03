package ca.dnamobile.javalauncher.databinding;

/* JADX INFO: loaded from: classes.dex */
public final class ItemContentProjectBinding implements androidx.viewbinding.ViewBinding {
    public final com.google.android.material.button.MaterialButton buttonInstallProject;
    public final com.google.android.material.button.MaterialButton buttonProjectMenu;
    public final com.google.android.material.imageview.ShapeableImageView imageProjectIcon;
    public final android.widget.ImageView imageProjectInstalledSource;
    private final com.google.android.material.card.MaterialCardView rootView;
    public final android.widget.TextView textProjectAuthor;
    public final android.widget.TextView textProjectDescription;
    public final android.widget.TextView textProjectDownloads;
    public final android.widget.TextView textProjectLikes;
    public final android.widget.TextView textProjectName;
    public final android.widget.TextView textProjectTags;
    public final android.widget.TextView textProjectUpdated;

    private ItemContentProjectBinding(com.google.android.material.card.MaterialCardView r1, com.google.android.material.button.MaterialButton r2, com.google.android.material.button.MaterialButton r3, com.google.android.material.imageview.ShapeableImageView r4, android.widget.ImageView r5, android.widget.TextView r6, android.widget.TextView r7, android.widget.TextView r8, android.widget.TextView r9, android.widget.TextView r10, android.widget.TextView r11, android.widget.TextView r12) {
            r0 = this;
            r0.<init>()
            r0.rootView = r1
            r0.buttonInstallProject = r2
            r0.buttonProjectMenu = r3
            r0.imageProjectIcon = r4
            r0.imageProjectInstalledSource = r5
            r0.textProjectAuthor = r6
            r0.textProjectDescription = r7
            r0.textProjectDownloads = r8
            r0.textProjectLikes = r9
            r0.textProjectName = r10
            r0.textProjectTags = r11
            r0.textProjectUpdated = r12
            return
    }

    public static ca.dnamobile.javalauncher.databinding.ItemContentProjectBinding bind(android.view.View r15) {
            int r0 = ca.dnamobile.javalauncher.R.id.buttonInstallProject
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r4 = r1
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            if (r4 == 0) goto L83
            int r0 = ca.dnamobile.javalauncher.R.id.buttonProjectMenu
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r5 = r1
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            if (r5 == 0) goto L83
            int r0 = ca.dnamobile.javalauncher.R.id.imageProjectIcon
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r6 = r1
            com.google.android.material.imageview.ShapeableImageView r6 = (com.google.android.material.imageview.ShapeableImageView) r6
            if (r6 == 0) goto L83
            int r0 = ca.dnamobile.javalauncher.R.id.imageProjectInstalledSource
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r7 = r1
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            if (r7 == 0) goto L83
            int r0 = ca.dnamobile.javalauncher.R.id.textProjectAuthor
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L83
            int r0 = ca.dnamobile.javalauncher.R.id.textProjectDescription
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L83
            int r0 = ca.dnamobile.javalauncher.R.id.textProjectDownloads
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r10 == 0) goto L83
            int r0 = ca.dnamobile.javalauncher.R.id.textProjectLikes
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r11 = r1
            android.widget.TextView r11 = (android.widget.TextView) r11
            if (r11 == 0) goto L83
            int r0 = ca.dnamobile.javalauncher.R.id.textProjectName
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r12 = r1
            android.widget.TextView r12 = (android.widget.TextView) r12
            if (r12 == 0) goto L83
            int r0 = ca.dnamobile.javalauncher.R.id.textProjectTags
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r13 = r1
            android.widget.TextView r13 = (android.widget.TextView) r13
            if (r13 == 0) goto L83
            int r0 = ca.dnamobile.javalauncher.R.id.textProjectUpdated
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r14 = r1
            android.widget.TextView r14 = (android.widget.TextView) r14
            if (r14 == 0) goto L83
            ca.dnamobile.javalauncher.databinding.ItemContentProjectBinding r0 = new ca.dnamobile.javalauncher.databinding.ItemContentProjectBinding
            r3 = r15
            com.google.android.material.card.MaterialCardView r3 = (com.google.android.material.card.MaterialCardView) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L83:
            android.content.res.Resources r15 = r15.getResources()
            java.lang.String r15 = r15.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r15 = r1.concat(r15)
            r0.<init>(r15)
            throw r0
    }

    public static ca.dnamobile.javalauncher.databinding.ItemContentProjectBinding inflate(android.view.LayoutInflater r2) {
            r0 = 0
            r1 = 0
            ca.dnamobile.javalauncher.databinding.ItemContentProjectBinding r2 = inflate(r2, r0, r1)
            return r2
    }

    public static ca.dnamobile.javalauncher.databinding.ItemContentProjectBinding inflate(android.view.LayoutInflater r2, android.view.ViewGroup r3, boolean r4) {
            int r0 = ca.dnamobile.javalauncher.R.layout.item_content_project
            r1 = 0
            android.view.View r2 = r2.inflate(r0, r3, r1)
            if (r4 == 0) goto Lc
            r3.addView(r2)
        Lc:
            ca.dnamobile.javalauncher.databinding.ItemContentProjectBinding r2 = bind(r2)
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
