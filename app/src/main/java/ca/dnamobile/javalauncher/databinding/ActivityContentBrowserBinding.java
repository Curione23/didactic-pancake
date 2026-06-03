package ca.dnamobile.javalauncher.databinding;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityContentBrowserBinding implements androidx.viewbinding.ViewBinding {
    public final com.google.android.material.button.MaterialButton buttonBackToInstance;
    public final com.google.android.material.button.MaterialButton buttonPageNext;
    public final com.google.android.material.button.MaterialButton buttonPagePrevious;
    public final com.google.android.material.button.MaterialButton buttonSortContent;
    public final com.google.android.material.button.MaterialButton buttonSourceCurseForge;
    public final com.google.android.material.button.MaterialButton buttonSourceModrinth;
    public final com.google.android.material.button.MaterialButton buttonViewCount;
    public final com.google.android.material.textfield.TextInputEditText editContentSearch;
    public final android.widget.ImageView imageContentBrowserInstanceIcon;
    public final android.widget.LinearLayout layoutContentBrowserHeader;
    public final android.widget.LinearLayout layoutContentPagination;
    public final com.google.android.material.textfield.TextInputLayout layoutContentSearch;
    public final androidx.recyclerview.widget.RecyclerView recyclerContentProjects;
    private final androidx.core.widget.NestedScrollView rootView;
    public final androidx.core.widget.NestedScrollView scrollContentBrowserRoot;
    public final com.google.android.material.tabs.TabLayout tabContentTypes;
    public final android.widget.TextView textContentBrowserInstanceMeta;
    public final android.widget.TextView textContentBrowserInstanceName;
    public final android.widget.TextView textContentBrowserLoaderChip;
    public final android.widget.TextView textContentBrowserResultSummary;
    public final android.widget.TextView textContentBrowserTitle;
    public final android.widget.TextView textContentBrowserVersionChip;
    public final android.widget.TextView textPageIndicator;
    public final com.google.android.material.button.MaterialButtonToggleGroup toggleContentSource;

    private ActivityContentBrowserBinding(androidx.core.widget.NestedScrollView r3, com.google.android.material.button.MaterialButton r4, com.google.android.material.button.MaterialButton r5, com.google.android.material.button.MaterialButton r6, com.google.android.material.button.MaterialButton r7, com.google.android.material.button.MaterialButton r8, com.google.android.material.button.MaterialButton r9, com.google.android.material.button.MaterialButton r10, com.google.android.material.textfield.TextInputEditText r11, android.widget.ImageView r12, android.widget.LinearLayout r13, android.widget.LinearLayout r14, com.google.android.material.textfield.TextInputLayout r15, androidx.recyclerview.widget.RecyclerView r16, androidx.core.widget.NestedScrollView r17, com.google.android.material.tabs.TabLayout r18, android.widget.TextView r19, android.widget.TextView r20, android.widget.TextView r21, android.widget.TextView r22, android.widget.TextView r23, android.widget.TextView r24, android.widget.TextView r25, com.google.android.material.button.MaterialButtonToggleGroup r26) {
            r2 = this;
            r0 = r2
            r2.<init>()
            r1 = r3
            r0.rootView = r1
            r1 = r4
            r0.buttonBackToInstance = r1
            r1 = r5
            r0.buttonPageNext = r1
            r1 = r6
            r0.buttonPagePrevious = r1
            r1 = r7
            r0.buttonSortContent = r1
            r1 = r8
            r0.buttonSourceCurseForge = r1
            r1 = r9
            r0.buttonSourceModrinth = r1
            r1 = r10
            r0.buttonViewCount = r1
            r1 = r11
            r0.editContentSearch = r1
            r1 = r12
            r0.imageContentBrowserInstanceIcon = r1
            r1 = r13
            r0.layoutContentBrowserHeader = r1
            r1 = r14
            r0.layoutContentPagination = r1
            r1 = r15
            r0.layoutContentSearch = r1
            r1 = r16
            r0.recyclerContentProjects = r1
            r1 = r17
            r0.scrollContentBrowserRoot = r1
            r1 = r18
            r0.tabContentTypes = r1
            r1 = r19
            r0.textContentBrowserInstanceMeta = r1
            r1 = r20
            r0.textContentBrowserInstanceName = r1
            r1 = r21
            r0.textContentBrowserLoaderChip = r1
            r1 = r22
            r0.textContentBrowserResultSummary = r1
            r1 = r23
            r0.textContentBrowserTitle = r1
            r1 = r24
            r0.textContentBrowserVersionChip = r1
            r1 = r25
            r0.textPageIndicator = r1
            r1 = r26
            r0.toggleContentSource = r1
            return
    }

    public static ca.dnamobile.javalauncher.databinding.ActivityContentBrowserBinding bind(android.view.View r28) {
            r0 = r28
            int r1 = ca.dnamobile.javalauncher.R.id.buttonBackToInstance
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r5 = r2
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            if (r5 == 0) goto L10c
            int r1 = ca.dnamobile.javalauncher.R.id.buttonPageNext
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r6 = r2
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            if (r6 == 0) goto L10c
            int r1 = ca.dnamobile.javalauncher.R.id.buttonPagePrevious
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r7 = r2
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            if (r7 == 0) goto L10c
            int r1 = ca.dnamobile.javalauncher.R.id.buttonSortContent
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r8 = r2
            com.google.android.material.button.MaterialButton r8 = (com.google.android.material.button.MaterialButton) r8
            if (r8 == 0) goto L10c
            int r1 = ca.dnamobile.javalauncher.R.id.buttonSourceCurseForge
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r9 = r2
            com.google.android.material.button.MaterialButton r9 = (com.google.android.material.button.MaterialButton) r9
            if (r9 == 0) goto L10c
            int r1 = ca.dnamobile.javalauncher.R.id.buttonSourceModrinth
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r10 = r2
            com.google.android.material.button.MaterialButton r10 = (com.google.android.material.button.MaterialButton) r10
            if (r10 == 0) goto L10c
            int r1 = ca.dnamobile.javalauncher.R.id.buttonViewCount
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r11 = r2
            com.google.android.material.button.MaterialButton r11 = (com.google.android.material.button.MaterialButton) r11
            if (r11 == 0) goto L10c
            int r1 = ca.dnamobile.javalauncher.R.id.editContentSearch
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r12 = r2
            com.google.android.material.textfield.TextInputEditText r12 = (com.google.android.material.textfield.TextInputEditText) r12
            if (r12 == 0) goto L10c
            int r1 = ca.dnamobile.javalauncher.R.id.imageContentBrowserInstanceIcon
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r13 = r2
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            if (r13 == 0) goto L10c
            int r1 = ca.dnamobile.javalauncher.R.id.layoutContentBrowserHeader
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r14 = r2
            android.widget.LinearLayout r14 = (android.widget.LinearLayout) r14
            if (r14 == 0) goto L10c
            int r1 = ca.dnamobile.javalauncher.R.id.layoutContentPagination
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r15 = r2
            android.widget.LinearLayout r15 = (android.widget.LinearLayout) r15
            if (r15 == 0) goto L10c
            int r1 = ca.dnamobile.javalauncher.R.id.layoutContentSearch
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r16 = r2
            com.google.android.material.textfield.TextInputLayout r16 = (com.google.android.material.textfield.TextInputLayout) r16
            if (r16 == 0) goto L10c
            int r1 = ca.dnamobile.javalauncher.R.id.recyclerContentProjects
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r17 = r2
            androidx.recyclerview.widget.RecyclerView r17 = (androidx.recyclerview.widget.RecyclerView) r17
            if (r17 == 0) goto L10c
            r18 = r0
            androidx.core.widget.NestedScrollView r18 = (androidx.core.widget.NestedScrollView) r18
            int r1 = ca.dnamobile.javalauncher.R.id.tabContentTypes
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r19 = r2
            com.google.android.material.tabs.TabLayout r19 = (com.google.android.material.tabs.TabLayout) r19
            if (r19 == 0) goto L10c
            int r1 = ca.dnamobile.javalauncher.R.id.textContentBrowserInstanceMeta
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r20 = r2
            android.widget.TextView r20 = (android.widget.TextView) r20
            if (r20 == 0) goto L10c
            int r1 = ca.dnamobile.javalauncher.R.id.textContentBrowserInstanceName
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r21 = r2
            android.widget.TextView r21 = (android.widget.TextView) r21
            if (r21 == 0) goto L10c
            int r1 = ca.dnamobile.javalauncher.R.id.textContentBrowserLoaderChip
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r22 = r2
            android.widget.TextView r22 = (android.widget.TextView) r22
            if (r22 == 0) goto L10c
            int r1 = ca.dnamobile.javalauncher.R.id.textContentBrowserResultSummary
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r23 = r2
            android.widget.TextView r23 = (android.widget.TextView) r23
            if (r23 == 0) goto L10c
            int r1 = ca.dnamobile.javalauncher.R.id.textContentBrowserTitle
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r24 = r2
            android.widget.TextView r24 = (android.widget.TextView) r24
            if (r24 == 0) goto L10c
            int r1 = ca.dnamobile.javalauncher.R.id.textContentBrowserVersionChip
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r25 = r2
            android.widget.TextView r25 = (android.widget.TextView) r25
            if (r25 == 0) goto L10c
            int r1 = ca.dnamobile.javalauncher.R.id.textPageIndicator
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r26 = r2
            android.widget.TextView r26 = (android.widget.TextView) r26
            if (r26 == 0) goto L10c
            int r1 = ca.dnamobile.javalauncher.R.id.toggleContentSource
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r27 = r2
            com.google.android.material.button.MaterialButtonToggleGroup r27 = (com.google.android.material.button.MaterialButtonToggleGroup) r27
            if (r27 == 0) goto L10c
            ca.dnamobile.javalauncher.databinding.ActivityContentBrowserBinding r0 = new ca.dnamobile.javalauncher.databinding.ActivityContentBrowserBinding
            r3 = r0
            r4 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r0
        L10c:
            android.content.res.Resources r0 = r28.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
    }

    public static ca.dnamobile.javalauncher.databinding.ActivityContentBrowserBinding inflate(android.view.LayoutInflater r2) {
            r0 = 0
            r1 = 0
            ca.dnamobile.javalauncher.databinding.ActivityContentBrowserBinding r2 = inflate(r2, r0, r1)
            return r2
    }

    public static ca.dnamobile.javalauncher.databinding.ActivityContentBrowserBinding inflate(android.view.LayoutInflater r2, android.view.ViewGroup r3, boolean r4) {
            int r0 = ca.dnamobile.javalauncher.R.layout.activity_content_browser
            r1 = 0
            android.view.View r2 = r2.inflate(r0, r3, r1)
            if (r4 == 0) goto Lc
            r3.addView(r2)
        Lc:
            ca.dnamobile.javalauncher.databinding.ActivityContentBrowserBinding r2 = bind(r2)
            return r2
    }

    @Override // androidx.viewbinding.ViewBinding
    public /* bridge */ /* synthetic */ android.view.View getRoot() {
            r1 = this;
            androidx.core.widget.NestedScrollView r0 = r1.getRoot()
            return r0
    }

    @Override // androidx.viewbinding.ViewBinding
    public androidx.core.widget.NestedScrollView getRoot() {
            r1 = this;
            androidx.core.widget.NestedScrollView r0 = r1.rootView
            return r0
    }
}
