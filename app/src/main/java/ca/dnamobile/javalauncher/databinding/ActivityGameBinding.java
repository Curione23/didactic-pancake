package ca.dnamobile.javalauncher.databinding;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityGameBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.ImageButton buttonGameSettings;
    public final android.widget.LinearLayout layoutLogOverlay;
    public final net.kdt.pojavlaunch.MinecraftGLSurface minecraftSurface;
    private final android.widget.FrameLayout rootView;
    public final android.widget.ScrollView scrollLogOverlay;
    public final android.widget.TextView textLogOverlay;
    public final android.widget.TextView textStatus;

    private ActivityGameBinding(android.widget.FrameLayout r1, android.widget.ImageButton r2, android.widget.LinearLayout r3, net.kdt.pojavlaunch.MinecraftGLSurface r4, android.widget.ScrollView r5, android.widget.TextView r6, android.widget.TextView r7) {
            r0 = this;
            r0.<init>()
            r0.rootView = r1
            r0.buttonGameSettings = r2
            r0.layoutLogOverlay = r3
            r0.minecraftSurface = r4
            r0.scrollLogOverlay = r5
            r0.textLogOverlay = r6
            r0.textStatus = r7
            return
    }

    public static ca.dnamobile.javalauncher.databinding.ActivityGameBinding bind(android.view.View r10) {
            int r0 = ca.dnamobile.javalauncher.R.id.buttonGameSettings
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r10, r0)
            r4 = r1
            android.widget.ImageButton r4 = (android.widget.ImageButton) r4
            if (r4 == 0) goto L4c
            int r0 = ca.dnamobile.javalauncher.R.id.layoutLogOverlay
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r10, r0)
            r5 = r1
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            if (r5 == 0) goto L4c
            int r0 = ca.dnamobile.javalauncher.R.id.minecraft_surface
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r10, r0)
            r6 = r1
            net.kdt.pojavlaunch.MinecraftGLSurface r6 = (net.kdt.pojavlaunch.MinecraftGLSurface) r6
            if (r6 == 0) goto L4c
            int r0 = ca.dnamobile.javalauncher.R.id.scrollLogOverlay
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r10, r0)
            r7 = r1
            android.widget.ScrollView r7 = (android.widget.ScrollView) r7
            if (r7 == 0) goto L4c
            int r0 = ca.dnamobile.javalauncher.R.id.textLogOverlay
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r10, r0)
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L4c
            int r0 = ca.dnamobile.javalauncher.R.id.textStatus
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r10, r0)
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L4c
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = new ca.dnamobile.javalauncher.databinding.ActivityGameBinding
            r3 = r10
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r0
        L4c:
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r10 = r10.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r10 = r1.concat(r10)
            r0.<init>(r10)
            throw r0
    }

    public static ca.dnamobile.javalauncher.databinding.ActivityGameBinding inflate(android.view.LayoutInflater r2) {
            r0 = 0
            r1 = 0
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r2 = inflate(r2, r0, r1)
            return r2
    }

    public static ca.dnamobile.javalauncher.databinding.ActivityGameBinding inflate(android.view.LayoutInflater r2, android.view.ViewGroup r3, boolean r4) {
            int r0 = ca.dnamobile.javalauncher.R.layout.activity_game
            r1 = 0
            android.view.View r2 = r2.inflate(r0, r3, r1)
            if (r4 == 0) goto Lc
            r3.addView(r2)
        Lc:
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r2 = bind(r2)
            return r2
    }

    @Override // androidx.viewbinding.ViewBinding
    public /* bridge */ /* synthetic */ android.view.View getRoot() {
            r1 = this;
            android.widget.FrameLayout r0 = r1.getRoot()
            return r0
    }

    @Override // androidx.viewbinding.ViewBinding
    public android.widget.FrameLayout getRoot() {
            r1 = this;
            android.widget.FrameLayout r0 = r1.rootView
            return r0
    }
}
