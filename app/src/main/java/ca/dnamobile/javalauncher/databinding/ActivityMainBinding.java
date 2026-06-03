package ca.dnamobile.javalauncher.databinding;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityMainBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.LinearLayout bottomMainActions;
    public final com.google.android.material.button.MaterialButton buttonBrowseContentMain;
    public final com.google.android.material.button.MaterialButton buttonImportModpackMain;
    public final com.google.android.material.button.MaterialButton buttonLaunchVersion;
    public final com.google.android.material.button.MaterialButton buttonOpenFolder;
    public final com.google.android.material.button.MaterialButton buttonOpenSettings;
    public final com.google.android.material.button.MaterialButton buttonRefreshVersions;
    public final com.google.android.material.button.MaterialButton buttonShareLatestLog;
    public final com.google.android.material.button.MaterialButton buttonSignIn;
    public final com.google.android.material.button.MaterialButton buttonSignOut;
    public final com.google.android.material.button.MaterialButton buttonStorageLocations;
    public final com.google.android.material.card.MaterialCardView cardMainBottomActions;
    public final com.google.android.material.card.MaterialCardView cardMainTabsHeader;
    public final android.widget.CheckBox checkKeepLogs;
    public final com.google.android.material.floatingactionbutton.FloatingActionButton fabCreateInstance;
    public final android.widget.ImageView imageMainPlayerHead;
    public final android.widget.LinearLayout installinstanceslayout;
    public final android.widget.FrameLayout mainContent;
    public final com.google.android.material.card.MaterialCardView mainviewcardview;
    public final android.widget.ProgressBar progressVersions;
    public final androidx.recyclerview.widget.RecyclerView recyclerVersions;
    private final android.widget.FrameLayout rootView;
    public final com.google.android.material.switchmaterial.SwitchMaterial switchShowSharedInstalls;
    public final com.google.android.material.switchmaterial.SwitchMaterial switchUseNativeSurface;
    public final com.google.android.material.tabs.TabLayout tabVersionTypes;
    public final android.widget.TextView textAccountStatus;
    public final android.widget.TextView textAppTitle;
    public final android.widget.TextView textFolder;
    public final android.widget.TextView textMainInstancesTitle;
    public final android.widget.TextView textRenderSurfaceSummary;
    public final android.widget.TextView textRenderSurfaceTitle;
    public final android.widget.TextView textSelectedVersion;
    public final android.widget.TextView textSharedInstallsSummary;
    public final android.widget.TextView textStatus;
    public final android.widget.TextView textVersionCount;

    private ActivityMainBinding(android.widget.FrameLayout r3, android.widget.LinearLayout r4, com.google.android.material.button.MaterialButton r5, com.google.android.material.button.MaterialButton r6, com.google.android.material.button.MaterialButton r7, com.google.android.material.button.MaterialButton r8, com.google.android.material.button.MaterialButton r9, com.google.android.material.button.MaterialButton r10, com.google.android.material.button.MaterialButton r11, com.google.android.material.button.MaterialButton r12, com.google.android.material.button.MaterialButton r13, com.google.android.material.button.MaterialButton r14, com.google.android.material.card.MaterialCardView r15, com.google.android.material.card.MaterialCardView r16, android.widget.CheckBox r17, com.google.android.material.floatingactionbutton.FloatingActionButton r18, android.widget.ImageView r19, android.widget.LinearLayout r20, android.widget.FrameLayout r21, com.google.android.material.card.MaterialCardView r22, android.widget.ProgressBar r23, androidx.recyclerview.widget.RecyclerView r24, com.google.android.material.switchmaterial.SwitchMaterial r25, com.google.android.material.switchmaterial.SwitchMaterial r26, com.google.android.material.tabs.TabLayout r27, android.widget.TextView r28, android.widget.TextView r29, android.widget.TextView r30, android.widget.TextView r31, android.widget.TextView r32, android.widget.TextView r33, android.widget.TextView r34, android.widget.TextView r35, android.widget.TextView r36, android.widget.TextView r37) {
            r2 = this;
            r0 = r2
            r2.<init>()
            r1 = r3
            r0.rootView = r1
            r1 = r4
            r0.bottomMainActions = r1
            r1 = r5
            r0.buttonBrowseContentMain = r1
            r1 = r6
            r0.buttonImportModpackMain = r1
            r1 = r7
            r0.buttonLaunchVersion = r1
            r1 = r8
            r0.buttonOpenFolder = r1
            r1 = r9
            r0.buttonOpenSettings = r1
            r1 = r10
            r0.buttonRefreshVersions = r1
            r1 = r11
            r0.buttonShareLatestLog = r1
            r1 = r12
            r0.buttonSignIn = r1
            r1 = r13
            r0.buttonSignOut = r1
            r1 = r14
            r0.buttonStorageLocations = r1
            r1 = r15
            r0.cardMainBottomActions = r1
            r1 = r16
            r0.cardMainTabsHeader = r1
            r1 = r17
            r0.checkKeepLogs = r1
            r1 = r18
            r0.fabCreateInstance = r1
            r1 = r19
            r0.imageMainPlayerHead = r1
            r1 = r20
            r0.installinstanceslayout = r1
            r1 = r21
            r0.mainContent = r1
            r1 = r22
            r0.mainviewcardview = r1
            r1 = r23
            r0.progressVersions = r1
            r1 = r24
            r0.recyclerVersions = r1
            r1 = r25
            r0.switchShowSharedInstalls = r1
            r1 = r26
            r0.switchUseNativeSurface = r1
            r1 = r27
            r0.tabVersionTypes = r1
            r1 = r28
            r0.textAccountStatus = r1
            r1 = r29
            r0.textAppTitle = r1
            r1 = r30
            r0.textFolder = r1
            r1 = r31
            r0.textMainInstancesTitle = r1
            r1 = r32
            r0.textRenderSurfaceSummary = r1
            r1 = r33
            r0.textRenderSurfaceTitle = r1
            r1 = r34
            r0.textSelectedVersion = r1
            r1 = r35
            r0.textSharedInstallsSummary = r1
            r1 = r36
            r0.textStatus = r1
            r1 = r37
            r0.textVersionCount = r1
            return
    }

    public static ca.dnamobile.javalauncher.databinding.ActivityMainBinding bind(android.view.View r39) {
            r0 = r39
            int r1 = ca.dnamobile.javalauncher.R.id.bottomMainActions
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r5 = r2
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            if (r5 == 0) goto L190
            int r1 = ca.dnamobile.javalauncher.R.id.buttonBrowseContentMain
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r6 = r2
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            if (r6 == 0) goto L190
            int r1 = ca.dnamobile.javalauncher.R.id.buttonImportModpackMain
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r7 = r2
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            if (r7 == 0) goto L190
            int r1 = ca.dnamobile.javalauncher.R.id.buttonLaunchVersion
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r8 = r2
            com.google.android.material.button.MaterialButton r8 = (com.google.android.material.button.MaterialButton) r8
            if (r8 == 0) goto L190
            int r1 = ca.dnamobile.javalauncher.R.id.buttonOpenFolder
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r9 = r2
            com.google.android.material.button.MaterialButton r9 = (com.google.android.material.button.MaterialButton) r9
            if (r9 == 0) goto L190
            int r1 = ca.dnamobile.javalauncher.R.id.buttonOpenSettings
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r10 = r2
            com.google.android.material.button.MaterialButton r10 = (com.google.android.material.button.MaterialButton) r10
            if (r10 == 0) goto L190
            int r1 = ca.dnamobile.javalauncher.R.id.buttonRefreshVersions
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r11 = r2
            com.google.android.material.button.MaterialButton r11 = (com.google.android.material.button.MaterialButton) r11
            if (r11 == 0) goto L190
            int r1 = ca.dnamobile.javalauncher.R.id.buttonShareLatestLog
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r12 = r2
            com.google.android.material.button.MaterialButton r12 = (com.google.android.material.button.MaterialButton) r12
            if (r12 == 0) goto L190
            int r1 = ca.dnamobile.javalauncher.R.id.buttonSignIn
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r13 = r2
            com.google.android.material.button.MaterialButton r13 = (com.google.android.material.button.MaterialButton) r13
            if (r13 == 0) goto L190
            int r1 = ca.dnamobile.javalauncher.R.id.buttonSignOut
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r14 = r2
            com.google.android.material.button.MaterialButton r14 = (com.google.android.material.button.MaterialButton) r14
            if (r14 == 0) goto L190
            int r1 = ca.dnamobile.javalauncher.R.id.buttonStorageLocations
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r15 = r2
            com.google.android.material.button.MaterialButton r15 = (com.google.android.material.button.MaterialButton) r15
            if (r15 == 0) goto L190
            int r1 = ca.dnamobile.javalauncher.R.id.cardMainBottomActions
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r16 = r2
            com.google.android.material.card.MaterialCardView r16 = (com.google.android.material.card.MaterialCardView) r16
            if (r16 == 0) goto L190
            int r1 = ca.dnamobile.javalauncher.R.id.cardMainTabsHeader
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r17 = r2
            com.google.android.material.card.MaterialCardView r17 = (com.google.android.material.card.MaterialCardView) r17
            if (r17 == 0) goto L190
            int r1 = ca.dnamobile.javalauncher.R.id.checkKeepLogs
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r18 = r2
            android.widget.CheckBox r18 = (android.widget.CheckBox) r18
            if (r18 == 0) goto L190
            int r1 = ca.dnamobile.javalauncher.R.id.fabCreateInstance
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r19 = r2
            com.google.android.material.floatingactionbutton.FloatingActionButton r19 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r19
            if (r19 == 0) goto L190
            int r1 = ca.dnamobile.javalauncher.R.id.imageMainPlayerHead
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r20 = r2
            android.widget.ImageView r20 = (android.widget.ImageView) r20
            if (r20 == 0) goto L190
            int r1 = ca.dnamobile.javalauncher.R.id.installinstanceslayout
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r21 = r2
            android.widget.LinearLayout r21 = (android.widget.LinearLayout) r21
            if (r21 == 0) goto L190
            r22 = r0
            android.widget.FrameLayout r22 = (android.widget.FrameLayout) r22
            int r1 = ca.dnamobile.javalauncher.R.id.mainviewcardview
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r23 = r2
            com.google.android.material.card.MaterialCardView r23 = (com.google.android.material.card.MaterialCardView) r23
            if (r23 == 0) goto L190
            int r1 = ca.dnamobile.javalauncher.R.id.progressVersions
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r24 = r2
            android.widget.ProgressBar r24 = (android.widget.ProgressBar) r24
            if (r24 == 0) goto L190
            int r1 = ca.dnamobile.javalauncher.R.id.recyclerVersions
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r25 = r2
            androidx.recyclerview.widget.RecyclerView r25 = (androidx.recyclerview.widget.RecyclerView) r25
            if (r25 == 0) goto L190
            int r1 = ca.dnamobile.javalauncher.R.id.switchShowSharedInstalls
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r26 = r2
            com.google.android.material.switchmaterial.SwitchMaterial r26 = (com.google.android.material.switchmaterial.SwitchMaterial) r26
            if (r26 == 0) goto L190
            int r1 = ca.dnamobile.javalauncher.R.id.switchUseNativeSurface
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r27 = r2
            com.google.android.material.switchmaterial.SwitchMaterial r27 = (com.google.android.material.switchmaterial.SwitchMaterial) r27
            if (r27 == 0) goto L190
            int r1 = ca.dnamobile.javalauncher.R.id.tabVersionTypes
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r28 = r2
            com.google.android.material.tabs.TabLayout r28 = (com.google.android.material.tabs.TabLayout) r28
            if (r28 == 0) goto L190
            int r1 = ca.dnamobile.javalauncher.R.id.textAccountStatus
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r29 = r2
            android.widget.TextView r29 = (android.widget.TextView) r29
            if (r29 == 0) goto L190
            int r1 = ca.dnamobile.javalauncher.R.id.textAppTitle
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r30 = r2
            android.widget.TextView r30 = (android.widget.TextView) r30
            if (r30 == 0) goto L190
            int r1 = ca.dnamobile.javalauncher.R.id.textFolder
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r31 = r2
            android.widget.TextView r31 = (android.widget.TextView) r31
            if (r31 == 0) goto L190
            int r1 = ca.dnamobile.javalauncher.R.id.textMainInstancesTitle
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r32 = r2
            android.widget.TextView r32 = (android.widget.TextView) r32
            if (r32 == 0) goto L190
            int r1 = ca.dnamobile.javalauncher.R.id.textRenderSurfaceSummary
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r33 = r2
            android.widget.TextView r33 = (android.widget.TextView) r33
            if (r33 == 0) goto L190
            int r1 = ca.dnamobile.javalauncher.R.id.textRenderSurfaceTitle
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r34 = r2
            android.widget.TextView r34 = (android.widget.TextView) r34
            if (r34 == 0) goto L190
            int r1 = ca.dnamobile.javalauncher.R.id.textSelectedVersion
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r35 = r2
            android.widget.TextView r35 = (android.widget.TextView) r35
            if (r35 == 0) goto L190
            int r1 = ca.dnamobile.javalauncher.R.id.textSharedInstallsSummary
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r36 = r2
            android.widget.TextView r36 = (android.widget.TextView) r36
            if (r36 == 0) goto L190
            int r1 = ca.dnamobile.javalauncher.R.id.textStatus
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r37 = r2
            android.widget.TextView r37 = (android.widget.TextView) r37
            if (r37 == 0) goto L190
            int r1 = ca.dnamobile.javalauncher.R.id.textVersionCount
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r38 = r2
            android.widget.TextView r38 = (android.widget.TextView) r38
            if (r38 == 0) goto L190
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = new ca.dnamobile.javalauncher.databinding.ActivityMainBinding
            r3 = r0
            r4 = r22
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            return r0
        L190:
            android.content.res.Resources r0 = r39.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
    }

    public static ca.dnamobile.javalauncher.databinding.ActivityMainBinding inflate(android.view.LayoutInflater r2) {
            r0 = 0
            r1 = 0
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r2 = inflate(r2, r0, r1)
            return r2
    }

    public static ca.dnamobile.javalauncher.databinding.ActivityMainBinding inflate(android.view.LayoutInflater r2, android.view.ViewGroup r3, boolean r4) {
            int r0 = ca.dnamobile.javalauncher.R.layout.activity_main
            r1 = 0
            android.view.View r2 = r2.inflate(r0, r3, r1)
            if (r4 == 0) goto Lc
            r3.addView(r2)
        Lc:
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r2 = bind(r2)
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
