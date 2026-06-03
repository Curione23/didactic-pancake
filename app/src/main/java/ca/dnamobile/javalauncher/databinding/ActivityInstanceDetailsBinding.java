package ca.dnamobile.javalauncher.databinding;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityInstanceDetailsBinding implements androidx.viewbinding.ViewBinding {
    public final com.google.android.material.button.MaterialButton buttonAddMods;
    public final com.google.android.material.button.MaterialButton buttonBackFromInstanceDetails;
    public final com.google.android.material.button.MaterialButton buttonBrowseContent;
    public final com.google.android.material.button.MaterialButton buttonCheckContentUpdates;
    public final com.google.android.material.button.MaterialButton buttonInstanceSettings;
    public final com.google.android.material.button.MaterialButton buttonPlay;
    public final com.google.android.material.button.MaterialButton buttonUpdateAllContent;
    public final com.google.android.material.card.MaterialCardView cardInstanceHeader;
    public final com.google.android.material.card.MaterialCardView cardResourceItems;
    public final com.google.android.material.textfield.TextInputEditText editTextContentSearch;
    public final android.widget.ImageView imageInstanceIcon;
    public final android.widget.LinearLayout layoutContentActions;
    public final android.widget.LinearLayout layoutContentControls;
    public final com.google.android.material.textfield.TextInputLayout layoutContentSearch;
    public final ca.dnamobile.javalauncher.ui.view.RoundedClipFrameLayout layoutResourceCategoryTabs;
    public final androidx.recyclerview.widget.RecyclerView recyclerResourceItems;
    private final android.widget.LinearLayout rootView;
    public final com.google.android.material.tabs.TabLayout tabResourceCategories;
    public final android.widget.TextView textInstanceMeta;
    public final android.widget.TextView textInstanceName;
    public final android.widget.TextView textModsHint;

    private ActivityInstanceDetailsBinding(android.widget.LinearLayout r3, com.google.android.material.button.MaterialButton r4, com.google.android.material.button.MaterialButton r5, com.google.android.material.button.MaterialButton r6, com.google.android.material.button.MaterialButton r7, com.google.android.material.button.MaterialButton r8, com.google.android.material.button.MaterialButton r9, com.google.android.material.button.MaterialButton r10, com.google.android.material.card.MaterialCardView r11, com.google.android.material.card.MaterialCardView r12, com.google.android.material.textfield.TextInputEditText r13, android.widget.ImageView r14, android.widget.LinearLayout r15, android.widget.LinearLayout r16, com.google.android.material.textfield.TextInputLayout r17, ca.dnamobile.javalauncher.ui.view.RoundedClipFrameLayout r18, androidx.recyclerview.widget.RecyclerView r19, com.google.android.material.tabs.TabLayout r20, android.widget.TextView r21, android.widget.TextView r22, android.widget.TextView r23) {
            r2 = this;
            r0 = r2
            r2.<init>()
            r1 = r3
            r0.rootView = r1
            r1 = r4
            r0.buttonAddMods = r1
            r1 = r5
            r0.buttonBackFromInstanceDetails = r1
            r1 = r6
            r0.buttonBrowseContent = r1
            r1 = r7
            r0.buttonCheckContentUpdates = r1
            r1 = r8
            r0.buttonInstanceSettings = r1
            r1 = r9
            r0.buttonPlay = r1
            r1 = r10
            r0.buttonUpdateAllContent = r1
            r1 = r11
            r0.cardInstanceHeader = r1
            r1 = r12
            r0.cardResourceItems = r1
            r1 = r13
            r0.editTextContentSearch = r1
            r1 = r14
            r0.imageInstanceIcon = r1
            r1 = r15
            r0.layoutContentActions = r1
            r1 = r16
            r0.layoutContentControls = r1
            r1 = r17
            r0.layoutContentSearch = r1
            r1 = r18
            r0.layoutResourceCategoryTabs = r1
            r1 = r19
            r0.recyclerResourceItems = r1
            r1 = r20
            r0.tabResourceCategories = r1
            r1 = r21
            r0.textInstanceMeta = r1
            r1 = r22
            r0.textInstanceName = r1
            r1 = r23
            r0.textModsHint = r1
            return
    }

    public static ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding bind(android.view.View r25) {
            r0 = r25
            int r1 = ca.dnamobile.javalauncher.R.id.buttonAddMods
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r5 = r2
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            if (r5 == 0) goto Led
            int r1 = ca.dnamobile.javalauncher.R.id.buttonBackFromInstanceDetails
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r6 = r2
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            if (r6 == 0) goto Led
            int r1 = ca.dnamobile.javalauncher.R.id.buttonBrowseContent
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r7 = r2
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            if (r7 == 0) goto Led
            int r1 = ca.dnamobile.javalauncher.R.id.buttonCheckContentUpdates
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r8 = r2
            com.google.android.material.button.MaterialButton r8 = (com.google.android.material.button.MaterialButton) r8
            if (r8 == 0) goto Led
            int r1 = ca.dnamobile.javalauncher.R.id.buttonInstanceSettings
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r9 = r2
            com.google.android.material.button.MaterialButton r9 = (com.google.android.material.button.MaterialButton) r9
            if (r9 == 0) goto Led
            int r1 = ca.dnamobile.javalauncher.R.id.buttonPlay
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r10 = r2
            com.google.android.material.button.MaterialButton r10 = (com.google.android.material.button.MaterialButton) r10
            if (r10 == 0) goto Led
            int r1 = ca.dnamobile.javalauncher.R.id.buttonUpdateAllContent
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r11 = r2
            com.google.android.material.button.MaterialButton r11 = (com.google.android.material.button.MaterialButton) r11
            if (r11 == 0) goto Led
            int r1 = ca.dnamobile.javalauncher.R.id.cardInstanceHeader
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r12 = r2
            com.google.android.material.card.MaterialCardView r12 = (com.google.android.material.card.MaterialCardView) r12
            if (r12 == 0) goto Led
            int r1 = ca.dnamobile.javalauncher.R.id.cardResourceItems
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r13 = r2
            com.google.android.material.card.MaterialCardView r13 = (com.google.android.material.card.MaterialCardView) r13
            if (r13 == 0) goto Led
            int r1 = ca.dnamobile.javalauncher.R.id.editTextContentSearch
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r14 = r2
            com.google.android.material.textfield.TextInputEditText r14 = (com.google.android.material.textfield.TextInputEditText) r14
            if (r14 == 0) goto Led
            int r1 = ca.dnamobile.javalauncher.R.id.imageInstanceIcon
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r15 = r2
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            if (r15 == 0) goto Led
            int r1 = ca.dnamobile.javalauncher.R.id.layoutContentActions
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r16 = r1
            android.widget.LinearLayout r16 = (android.widget.LinearLayout) r16
            int r1 = ca.dnamobile.javalauncher.R.id.layoutContentControls
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r17 = r1
            android.widget.LinearLayout r17 = (android.widget.LinearLayout) r17
            int r1 = ca.dnamobile.javalauncher.R.id.layoutContentSearch
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r18 = r2
            com.google.android.material.textfield.TextInputLayout r18 = (com.google.android.material.textfield.TextInputLayout) r18
            if (r18 == 0) goto Led
            int r1 = ca.dnamobile.javalauncher.R.id.layoutResourceCategoryTabs
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r19 = r2
            ca.dnamobile.javalauncher.ui.view.RoundedClipFrameLayout r19 = (ca.dnamobile.javalauncher.ui.view.RoundedClipFrameLayout) r19
            if (r19 == 0) goto Led
            int r1 = ca.dnamobile.javalauncher.R.id.recyclerResourceItems
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r20 = r2
            androidx.recyclerview.widget.RecyclerView r20 = (androidx.recyclerview.widget.RecyclerView) r20
            if (r20 == 0) goto Led
            int r1 = ca.dnamobile.javalauncher.R.id.tabResourceCategories
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r21 = r2
            com.google.android.material.tabs.TabLayout r21 = (com.google.android.material.tabs.TabLayout) r21
            if (r21 == 0) goto Led
            int r1 = ca.dnamobile.javalauncher.R.id.textInstanceMeta
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r22 = r2
            android.widget.TextView r22 = (android.widget.TextView) r22
            if (r22 == 0) goto Led
            int r1 = ca.dnamobile.javalauncher.R.id.textInstanceName
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r23 = r2
            android.widget.TextView r23 = (android.widget.TextView) r23
            if (r23 == 0) goto Led
            int r1 = ca.dnamobile.javalauncher.R.id.textModsHint
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r24 = r2
            android.widget.TextView r24 = (android.widget.TextView) r24
            if (r24 == 0) goto Led
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r1 = new ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding
            r3 = r1
            r4 = r0
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r1
        Led:
            android.content.res.Resources r0 = r25.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
    }

    public static ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding inflate(android.view.LayoutInflater r2) {
            r0 = 0
            r1 = 0
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r2 = inflate(r2, r0, r1)
            return r2
    }

    public static ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding inflate(android.view.LayoutInflater r2, android.view.ViewGroup r3, boolean r4) {
            int r0 = ca.dnamobile.javalauncher.R.layout.activity_instance_details
            r1 = 0
            android.view.View r2 = r2.inflate(r0, r3, r1)
            if (r4 == 0) goto Lc
            r3.addView(r2)
        Lc:
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r2 = bind(r2)
            return r2
    }

    @Override // androidx.viewbinding.ViewBinding
    public /* bridge */ /* synthetic */ android.view.View getRoot() {
            r1 = this;
            android.widget.LinearLayout r0 = r1.getRoot()
            return r0
    }

    @Override // androidx.viewbinding.ViewBinding
    public android.widget.LinearLayout getRoot() {
            r1 = this;
            android.widget.LinearLayout r0 = r1.rootView
            return r0
    }
}
