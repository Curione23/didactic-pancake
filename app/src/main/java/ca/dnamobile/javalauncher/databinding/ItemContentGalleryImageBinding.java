package ca.dnamobile.javalauncher.databinding;

/* JADX INFO: loaded from: classes.dex */
public final class ItemContentGalleryImageBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.ImageView imageGalleryScreenshot;
    private final com.google.android.material.card.MaterialCardView rootView;
    public final android.widget.TextView textGalleryIndex;

    private ItemContentGalleryImageBinding(com.google.android.material.card.MaterialCardView r1, android.widget.ImageView r2, android.widget.TextView r3) {
            r0 = this;
            r0.<init>()
            r0.rootView = r1
            r0.imageGalleryScreenshot = r2
            r0.textGalleryIndex = r3
            return
    }

    public static ca.dnamobile.javalauncher.databinding.ItemContentGalleryImageBinding bind(android.view.View r3) {
            int r0 = ca.dnamobile.javalauncher.R.id.imageGalleryScreenshot
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r3, r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            if (r1 == 0) goto L1c
            int r0 = ca.dnamobile.javalauncher.R.id.textGalleryIndex
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r3, r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L1c
            ca.dnamobile.javalauncher.databinding.ItemContentGalleryImageBinding r0 = new ca.dnamobile.javalauncher.databinding.ItemContentGalleryImageBinding
            com.google.android.material.card.MaterialCardView r3 = (com.google.android.material.card.MaterialCardView) r3
            r0.<init>(r3, r1, r2)
            return r0
        L1c:
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r3 = r3.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r3 = r1.concat(r3)
            r0.<init>(r3)
            throw r0
    }

    public static ca.dnamobile.javalauncher.databinding.ItemContentGalleryImageBinding inflate(android.view.LayoutInflater r2) {
            r0 = 0
            r1 = 0
            ca.dnamobile.javalauncher.databinding.ItemContentGalleryImageBinding r2 = inflate(r2, r0, r1)
            return r2
    }

    public static ca.dnamobile.javalauncher.databinding.ItemContentGalleryImageBinding inflate(android.view.LayoutInflater r2, android.view.ViewGroup r3, boolean r4) {
            int r0 = ca.dnamobile.javalauncher.R.layout.item_content_gallery_image
            r1 = 0
            android.view.View r2 = r2.inflate(r0, r3, r1)
            if (r4 == 0) goto Lc
            r3.addView(r2)
        Lc:
            ca.dnamobile.javalauncher.databinding.ItemContentGalleryImageBinding r2 = bind(r2)
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
