package ca.dnamobile.javalauncher.ui.instance;

/* JADX INFO: loaded from: classes.dex */
public final class CreateInstanceDialog {
    private static final java.lang.String LOADER_FABRIC = "Fabric";
    private static final java.lang.String LOADER_FORGE = "Forge";
    private static final java.lang.String LOADER_NEOFORGE = "NeoForge";
    private static final java.lang.String LOADER_VANILLA = "Vanilla";
    private static final java.lang.String TYPE_ALPHA = "old_alpha";
    private static final java.lang.String TYPE_BETA = "old_beta";
    private static final java.lang.String TYPE_RELEASE = "release";
    private static final java.lang.String TYPE_SNAPSHOT = "snapshot";
    private final android.app.Activity activity;
    private final java.util.ArrayList<ca.dnamobile.javalauncher.data.model.MinecraftVersion> allVersions;
    private com.google.android.material.button.MaterialButton createButton;
    private androidx.appcompat.app.AlertDialog dialog;
    private final java.util.Set<java.lang.String> existingInstanceNameKeys;
    private final java.util.ArrayList<ca.dnamobile.javalauncher.data.model.MinecraftVersion> filteredVersions;
    private android.widget.ImageView iconPreview;
    private android.net.Uri iconUri;
    private android.widget.CheckBox isolatedInstanceCheck;
    private final ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog.Listener listener;
    private com.google.android.material.textfield.MaterialAutoCompleteTextView loaderVersionDropdown;
    private final java.util.ArrayList<ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver.LoaderVersionOption> loaderVersionOptions;
    private int loaderVersionRequestSerial;
    private android.widget.TextView loaderVersionStatus;
    private com.google.android.material.textfield.MaterialAutoCompleteTextView minecraftVersionDropdown;
    private com.google.android.material.textfield.TextInputEditText nameInput;
    private com.google.android.material.textfield.TextInputLayout nameInputLayout;
    private boolean programmaticNameChange;
    private java.lang.String selectedLoader;
    private int selectedLoaderVersionIndex;
    private int selectedMinecraftVersionIndex;
    private java.lang.String selectedType;
    private boolean userEditedName;
    private android.widget.TextView versionHelp;


    public interface Listener {
        void onCreateInstance(ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog.Request r1);

        void onPickIcon(ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog r1);
    }

    public static final class Request {
        public final android.net.Uri iconUri;
        public final boolean isolatedInstance;
        public final java.lang.String loader;
        public final java.lang.String loaderVersion;
        public final java.lang.String minecraftVersionId;
        public final java.lang.String name;
        public final java.lang.String versionType;

        Request(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, android.net.Uri r6, boolean r7) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                r0.loader = r2
                r0.loaderVersion = r3
                r0.minecraftVersionId = r4
                r0.versionType = r5
                r0.iconUri = r6
                r0.isolatedInstance = r7
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$I5mZRV13R4I91WqhlCENyvyVvXg(ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog r0, android.view.View r1) {
            r0.lambda$createActionsSection$9(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$IDgEDq81l5LkQmG2-K6RTT7_Hhc, reason: not valid java name */
    public static /* synthetic */ void m571$r8$lambda$IDgEDq81l5LkQmG2K6RTT7_Hhc(ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog r0, android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0.lambda$createVersionSection$5(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void $r8$lambda$JLQEtjOkzS4oNvh_to5r2CRZJtg(ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog r0, android.view.View r1) {
            r0.lambda$createVersionSection$4(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$JlE6xWzGETrmF3AO-0V84TZCLLg, reason: not valid java name */
    public static /* synthetic */ void m572$r8$lambda$JlE6xWzGETrmF3AO0V84TZCLLg(ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog r0, java.lang.String r1, java.lang.String r2, int r3) {
            r0.lambda$updateLoaderVersionDropdown$13(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$L_xh5Z2RlbXVoFuTmFAJINTdYG0(ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog r0, android.content.DialogInterface r1) {
            r0.lambda$show$0(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$WrNx4Zr4_T0zX2fDDc6nOHDbqXU(ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog r0, int r1, java.lang.String r2, java.util.ArrayList r3, java.lang.String r4, java.lang.String r5) {
            r0.lambda$updateLoaderVersionDropdown$12(r1, r2, r3, r4, r5)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$XUH-VE-ui7hHhTOpA0AKFbMG3ls, reason: not valid java name */
    public static /* synthetic */ void m573$r8$lambda$XUHVEui7hHhTOpA0AKFbMG3ls(ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog r0, com.google.android.material.button.MaterialButton r1, android.view.View r2) {
            r0.lambda$createHeader$2(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$YNScRbZIaOEyGYgQ123IgK4rH9E(ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog r0, android.view.View r1) {
            r0.lambda$createLoaderVersionSection$6(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$Z0gidlspCAiajZ2YiU1KMPBvzHE(ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog r0, com.google.android.material.button.MaterialButton r1, android.view.View r2) {
            r0.lambda$createHeader$3(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$aN1kKrytqY1CBaZydCi4XZLhxCc(ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog r0, android.view.View r1) {
            r0.lambda$createActionsSection$8(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$bYHlTi4Js-euupHatvbvt96MCWg, reason: not valid java name */
    public static /* synthetic */ void m574$r8$lambda$bYHlTi4JseuupHatvbvt96MCWg(ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog r0, java.lang.String r1, android.view.View r2) {
            r0.lambda$addTypeChip$11(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$t5zSz72uhIu2jw_NybVDYhljU70(ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog r0, java.lang.String r1, android.view.View r2) {
            r0.lambda$createLoaderChip$10(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$uZs4eDJs2W4r5DqhUR9zst0Ycig(ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog r0, android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0.lambda$createLoaderVersionSection$7(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void $r8$lambda$wXXatRpZomVowSFrxhkcU88dO5g(ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog r0, android.view.View r1) {
            r0.lambda$createHeader$1(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$fgetnameInputLayout, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.google.android.material.textfield.TextInputLayout m575$$Nest$fgetnameInputLayout(ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog r0) {
            com.google.android.material.textfield.TextInputLayout r0 = r0.nameInputLayout
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgetprogrammaticNameChange, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m576$$Nest$fgetprogrammaticNameChange(ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog r0) {
            boolean r0 = r0.programmaticNameChange
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fputuserEditedName, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m577$$Nest$fputuserEditedName(ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog r0, boolean r1) {
            r0.userEditedName = r1
            return
    }

    public CreateInstanceDialog(android.app.Activity r2, java.util.List<ca.dnamobile.javalauncher.data.model.MinecraftVersion> r3, ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog.Listener r4) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "release"
            r1.selectedType = r0
            java.lang.String r0 = "Vanilla"
            r1.selectedLoader = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.filteredVersions = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.loaderVersionOptions = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.existingInstanceNameKeys = r0
            r1.activity = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r3)
            r1.allVersions = r2
            r1.listener = r4
            return
    }

    private void addSectionTitle(android.widget.LinearLayout r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            android.widget.TextView r0 = new android.widget.TextView
            android.app.Activity r1 = r2.activity
            r0.<init>(r1)
            r0.setText(r4)
            android.graphics.Typeface r4 = r0.getTypeface()
            r1 = 1
            r0.setTypeface(r4, r1)
            r4 = 1097859072(0x41700000, float:15.0)
            r0.setTextSize(r4)
            android.widget.LinearLayout$LayoutParams r4 = r2.matchWrap()
            r3.addView(r0, r4)
            android.widget.TextView r4 = new android.widget.TextView
            android.app.Activity r0 = r2.activity
            r4.<init>(r0)
            r4.setText(r5)
            r5 = 1094713344(0x41400000, float:12.0)
            r4.setTextSize(r5)
            r5 = 2
            int r5 = r2.dp(r5)
            r0 = 8
            int r0 = r2.dp(r0)
            r1 = 0
            r4.setPadding(r1, r5, r1, r0)
            android.widget.LinearLayout$LayoutParams r5 = r2.matchWrap()
            r3.addView(r4, r5)
            return
    }

    private void addTypeChip(com.google.android.material.chip.ChipGroup r2, java.lang.String r3, java.lang.String r4, boolean r5) {
            r1 = this;
            r0 = 1
            com.google.android.material.chip.Chip r3 = r1.createChip(r3, r0, r5)
            ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog$$ExternalSyntheticLambda1 r5 = new ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog$$ExternalSyntheticLambda1
            r5.<init>(r1, r4)
            r3.setOnClickListener(r5)
            r2.addView(r3)
            return
    }

    private java.lang.String buildDefaultInstanceName() {
            r2 = this;
            ca.dnamobile.javalauncher.data.model.MinecraftVersion r0 = r2.getSelectedMinecraftVersion()
            if (r0 == 0) goto Lb
            java.lang.String r0 = r0.getId()
            goto Ld
        Lb:
            java.lang.String r0 = ""
        Ld:
            java.lang.String r1 = r0.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L1c
            java.lang.String r0 = r2.getSelectedLoaderName()
            return r0
        L1c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = " ("
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.getSelectedLoaderName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    private android.view.View createActionsSection() {
            r7 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            android.app.Activity r1 = r7.activity
            r0.<init>(r1)
            r1 = 0
            r0.setOrientation(r1)
            r2 = 8388629(0x800015, float:1.1754973E-38)
            r0.setGravity(r2)
            r2 = 10
            int r3 = r7.dp(r2)
            r0.setPadding(r1, r3, r1, r1)
            com.google.android.material.button.MaterialButton r3 = new com.google.android.material.button.MaterialButton
            android.app.Activity r4 = r7.activity
            r3.<init>(r4)
            r4 = 17039360(0x1040000, float:2.424457E-38)
            r3.setText(r4)
            ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog$$ExternalSyntheticLambda8 r4 = new ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog$$ExternalSyntheticLambda8
            r4.<init>(r7)
            r3.setOnClickListener(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = -2
            r6 = 1065353216(0x3f800000, float:1.0)
            r4.<init>(r1, r5, r6)
            r0.addView(r3, r4)
            com.google.android.material.button.MaterialButton r3 = new com.google.android.material.button.MaterialButton
            android.app.Activity r4 = r7.activity
            r3.<init>(r4)
            r7.createButton = r3
            int r4 = ca.dnamobile.javalauncher.R.string.create_instance_button
            r3.setText(r4)
            com.google.android.material.button.MaterialButton r3 = r7.createButton
            ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog$$ExternalSyntheticLambda9 r4 = new ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog$$ExternalSyntheticLambda9
            r4.<init>(r7)
            r3.setOnClickListener(r4)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r1, r5, r6)
            int r2 = r7.dp(r2)
            r3.setMargins(r2, r1, r1, r1)
            com.google.android.material.button.MaterialButton r1 = r7.createButton
            r0.addView(r1, r3)
            return r0
    }

    private com.google.android.material.chip.Chip createChip(java.lang.String r3, boolean r4, boolean r5) {
            r2 = this;
            com.google.android.material.chip.Chip r0 = new com.google.android.material.chip.Chip
            android.app.Activity r1 = r2.activity
            r0.<init>(r1)
            r0.setText(r3)
            r3 = 1
            r0.setCheckable(r3)
            r0.setEnabled(r4)
            r0.setChecked(r5)
            return r0
    }

    private com.google.android.material.textfield.TextInputLayout createDropdownLayout(java.lang.String r2) {
            r1 = this;
            com.google.android.material.textfield.TextInputLayout r2 = r1.createOutlinedLayout(r2)
            r0 = 3
            r2.setEndIconMode(r0)
            return r2
    }

    private android.view.View createHeader() {
            r9 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            android.app.Activity r1 = r9.activity
            r0.<init>(r1)
            r1 = 0
            r0.setOrientation(r1)
            r2 = 16
            r0.setGravity(r2)
            r3 = 18
            int r4 = r9.dp(r3)
            r0.setPadding(r1, r1, r1, r4)
            android.widget.ImageView r4 = new android.widget.ImageView
            android.app.Activity r5 = r9.activity
            r4.<init>(r5)
            r9.iconPreview = r4
            int r5 = ca.dnamobile.javalauncher.R.mipmap.ic_launcher
            r4.setImageResource(r5)
            android.widget.ImageView r4 = r9.iconPreview
            r5 = 12
            int r6 = r9.dp(r5)
            int r7 = r9.dp(r5)
            int r8 = r9.dp(r5)
            int r5 = r9.dp(r5)
            r4.setPadding(r6, r7, r8, r5)
            android.graphics.drawable.GradientDrawable r4 = new android.graphics.drawable.GradientDrawable
            r4.<init>()
            int r3 = r9.dp(r3)
            float r3 = (float) r3
            r4.setCornerRadius(r3)
            r3 = -14670805(0xffffffffff20242b, float:-2.1286427E38)
            r4.setColor(r3)
            android.widget.ImageView r3 = r9.iconPreview
            r3.setBackground(r4)
            android.widget.ImageView r3 = r9.iconPreview
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = 78
            int r6 = r9.dp(r5)
            int r5 = r9.dp(r5)
            r4.<init>(r6, r5)
            r0.addView(r3, r4)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            android.app.Activity r4 = r9.activity
            r3.<init>(r4)
            r4 = 1
            r3.setOrientation(r4)
            int r2 = r9.dp(r2)
            r3.setPadding(r2, r1, r1, r1)
            android.widget.TextView r2 = new android.widget.TextView
            android.app.Activity r5 = r9.activity
            r2.<init>(r5)
            int r5 = ca.dnamobile.javalauncher.R.string.create_instance_title
            r2.setText(r5)
            r5 = 1102053376(0x41b00000, float:22.0)
            r2.setTextSize(r5)
            android.graphics.Typeface r5 = r2.getTypeface()
            r2.setTypeface(r5, r4)
            android.widget.LinearLayout$LayoutParams r4 = r9.matchWrap()
            r3.addView(r2, r4)
            android.widget.TextView r2 = new android.widget.TextView
            android.app.Activity r4 = r9.activity
            r2.<init>(r4)
            int r4 = ca.dnamobile.javalauncher.R.string.create_instance_dialog_subtitle
            r2.setText(r4)
            r4 = 1095761920(0x41500000, float:13.0)
            r2.setTextSize(r4)
            r4 = 4
            int r4 = r9.dp(r4)
            r2.setPadding(r1, r4, r1, r1)
            android.widget.LinearLayout$LayoutParams r4 = r9.matchWrap()
            r3.addView(r2, r4)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            android.app.Activity r4 = r9.activity
            r2.<init>(r4)
            r2.setOrientation(r1)
            r4 = 10
            int r4 = r9.dp(r4)
            r2.setPadding(r1, r4, r1, r1)
            com.google.android.material.button.MaterialButton r4 = new com.google.android.material.button.MaterialButton
            android.app.Activity r5 = r9.activity
            r4.<init>(r5)
            int r5 = ca.dnamobile.javalauncher.R.string.create_instance_select_icon
            r4.setText(r5)
            ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog$$ExternalSyntheticLambda10 r5 = new ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog$$ExternalSyntheticLambda10
            r5.<init>(r9)
            r4.setOnClickListener(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r6 = -2
            r7 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r1, r6, r7)
            r2.addView(r4, r5)
            com.google.android.material.button.MaterialButton r5 = new com.google.android.material.button.MaterialButton
            android.app.Activity r8 = r9.activity
            r5.<init>(r8)
            int r8 = ca.dnamobile.javalauncher.R.string.create_instance_remove_icon
            r5.setText(r8)
            r5.setEnabled(r1)
            ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog$$ExternalSyntheticLambda11 r8 = new ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog$$ExternalSyntheticLambda11
            r8.<init>(r9, r5)
            r5.setOnClickListener(r8)
            ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog$$ExternalSyntheticLambda12 r8 = new ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog$$ExternalSyntheticLambda12
            r8.<init>(r9, r5)
            r4.setOnClickListener(r8)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r4.<init>(r1, r6, r7)
            r8 = 8
            int r8 = r9.dp(r8)
            r4.setMargins(r8, r1, r1, r1)
            r2.addView(r5, r4)
            android.widget.LinearLayout$LayoutParams r4 = r9.matchWrap()
            r3.addView(r2, r4)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r1, r6, r7)
            r0.addView(r3, r2)
            return r0
    }

    private com.google.android.material.chip.Chip createLoaderChip(java.lang.String r2, boolean r3) {
            r1 = this;
            r0 = 1
            com.google.android.material.chip.Chip r3 = r1.createChip(r2, r0, r3)
            ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog$$ExternalSyntheticLambda13 r0 = new ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog$$ExternalSyntheticLambda13
            r0.<init>(r1, r2)
            r3.setOnClickListener(r0)
            return r3
    }

    private com.google.android.material.chip.ChipGroup createLoaderChips() {
            r3 = this;
            com.google.android.material.chip.ChipGroup r0 = new com.google.android.material.chip.ChipGroup
            android.app.Activity r1 = r3.activity
            r0.<init>(r1)
            r1 = 1
            r0.setSingleSelection(r1)
            r0.setSelectionRequired(r1)
            java.lang.String r2 = "Vanilla"
            com.google.android.material.chip.Chip r1 = r3.createLoaderChip(r2, r1)
            r0.addView(r1)
            java.lang.String r1 = "Fabric"
            r2 = 0
            com.google.android.material.chip.Chip r1 = r3.createLoaderChip(r1, r2)
            r0.addView(r1)
            java.lang.String r1 = "Forge"
            com.google.android.material.chip.Chip r1 = r3.createLoaderChip(r1, r2)
            r0.addView(r1)
            java.lang.String r1 = "NeoForge"
            com.google.android.material.chip.Chip r1 = r3.createLoaderChip(r1, r2)
            r0.addView(r1)
            return r0
    }

    private android.view.View createLoaderSection() {
            r4 = this;
            android.widget.LinearLayout r0 = r4.createSection()
            android.app.Activity r1 = r4.activity
            int r2 = ca.dnamobile.javalauncher.R.string.create_instance_loader_label
            java.lang.String r1 = r1.getString(r2)
            android.app.Activity r2 = r4.activity
            int r3 = ca.dnamobile.javalauncher.R.string.create_instance_loader_section_summary
            java.lang.String r2 = r2.getString(r3)
            r4.addSectionTitle(r0, r1, r2)
            com.google.android.material.chip.ChipGroup r1 = r4.createLoaderChips()
            android.widget.LinearLayout$LayoutParams r2 = r4.matchWrap()
            r0.addView(r1, r2)
            return r0
    }

    private android.view.View createLoaderVersionSection() {
            r5 = this;
            android.widget.LinearLayout r0 = r5.createSection()
            android.app.Activity r1 = r5.activity
            int r2 = ca.dnamobile.javalauncher.R.string.create_instance_loader_version_label
            java.lang.String r1 = r1.getString(r2)
            android.app.Activity r2 = r5.activity
            int r3 = ca.dnamobile.javalauncher.R.string.create_instance_loader_version_summary
            java.lang.String r2 = r2.getString(r3)
            r5.addSectionTitle(r0, r1, r2)
            com.google.android.material.textfield.MaterialAutoCompleteTextView r1 = new com.google.android.material.textfield.MaterialAutoCompleteTextView
            android.app.Activity r2 = r5.activity
            r1.<init>(r2)
            r5.loaderVersionDropdown = r1
            r2 = 0
            r1.setInputType(r2)
            com.google.android.material.textfield.MaterialAutoCompleteTextView r1 = r5.loaderVersionDropdown
            r3 = 1
            r1.setSingleLine(r3)
            com.google.android.material.textfield.MaterialAutoCompleteTextView r1 = r5.loaderVersionDropdown
            ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog$$ExternalSyntheticLambda5 r3 = new ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog$$ExternalSyntheticLambda5
            r3.<init>(r5)
            r1.setOnClickListener(r3)
            com.google.android.material.textfield.MaterialAutoCompleteTextView r1 = r5.loaderVersionDropdown
            ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog$$ExternalSyntheticLambda6 r3 = new ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog$$ExternalSyntheticLambda6
            r3.<init>(r5)
            r1.setOnItemClickListener(r3)
            android.app.Activity r1 = r5.activity
            int r3 = ca.dnamobile.javalauncher.R.string.create_instance_loader_version_label
            java.lang.String r1 = r1.getString(r3)
            com.google.android.material.textfield.TextInputLayout r1 = r5.createDropdownLayout(r1)
            com.google.android.material.textfield.MaterialAutoCompleteTextView r3 = r5.loaderVersionDropdown
            android.widget.LinearLayout$LayoutParams r4 = r5.matchWrap()
            r1.addView(r3, r4)
            android.widget.LinearLayout$LayoutParams r3 = r5.matchWrap()
            r0.addView(r1, r3)
            android.widget.TextView r1 = new android.widget.TextView
            android.app.Activity r3 = r5.activity
            r1.<init>(r3)
            r5.loaderVersionStatus = r1
            r3 = 1094713344(0x41400000, float:12.0)
            r1.setTextSize(r3)
            android.widget.TextView r1 = r5.loaderVersionStatus
            r3 = 8
            int r3 = r5.dp(r3)
            r1.setPadding(r2, r3, r2, r2)
            android.widget.TextView r1 = r5.loaderVersionStatus
            android.widget.LinearLayout$LayoutParams r2 = r5.matchWrap()
            r0.addView(r1, r2)
            return r0
    }

    private android.view.View createNameSection() {
            r4 = this;
            android.widget.LinearLayout r0 = r4.createSection()
            com.google.android.material.textfield.TextInputEditText r1 = new com.google.android.material.textfield.TextInputEditText
            android.app.Activity r2 = r4.activity
            r1.<init>(r2)
            r4.nameInput = r1
            r2 = 1
            r1.setSingleLine(r2)
            com.google.android.material.textfield.TextInputEditText r1 = r4.nameInput
            android.app.Activity r2 = r4.activity
            int r3 = ca.dnamobile.javalauncher.R.string.create_instance_name_hint
            java.lang.String r2 = r2.getString(r3)
            r1.setHint(r2)
            com.google.android.material.textfield.TextInputEditText r1 = r4.nameInput
            ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog$1 r2 = new ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog$1
            r2.<init>(r4)
            r1.addTextChangedListener(r2)
            android.app.Activity r1 = r4.activity
            int r2 = ca.dnamobile.javalauncher.R.string.create_instance_name_label
            java.lang.String r1 = r1.getString(r2)
            com.google.android.material.textfield.TextInputLayout r1 = r4.createOutlinedLayout(r1)
            r4.nameInputLayout = r1
            com.google.android.material.textfield.TextInputEditText r2 = r4.nameInput
            android.widget.LinearLayout$LayoutParams r3 = r4.matchWrap()
            r1.addView(r2, r3)
            com.google.android.material.textfield.TextInputLayout r1 = r4.nameInputLayout
            android.widget.LinearLayout$LayoutParams r2 = r4.matchWrap()
            r0.addView(r1, r2)
            return r0
    }

    private android.view.View createOptionsSection() {
            r5 = this;
            android.widget.LinearLayout r0 = r5.createSection()
            android.widget.CheckBox r1 = new android.widget.CheckBox
            android.app.Activity r2 = r5.activity
            r1.<init>(r2)
            r5.isolatedInstanceCheck = r1
            int r2 = ca.dnamobile.javalauncher.R.string.create_instance_isolated_checkbox
            r1.setText(r2)
            android.widget.CheckBox r1 = r5.isolatedInstanceCheck
            r2 = 1
            r1.setChecked(r2)
            android.widget.CheckBox r1 = r5.isolatedInstanceCheck
            android.widget.LinearLayout$LayoutParams r2 = r5.matchWrap()
            r0.addView(r1, r2)
            android.widget.TextView r1 = new android.widget.TextView
            android.app.Activity r2 = r5.activity
            r1.<init>(r2)
            r2 = 1094713344(0x41400000, float:12.0)
            r1.setTextSize(r2)
            int r3 = ca.dnamobile.javalauncher.R.string.create_instance_isolated_summary
            r1.setText(r3)
            r3 = 4
            int r3 = r5.dp(r3)
            r4 = 0
            r1.setPadding(r4, r3, r4, r4)
            android.widget.LinearLayout$LayoutParams r3 = r5.matchWrap()
            r0.addView(r1, r3)
            android.widget.TextView r1 = new android.widget.TextView
            android.app.Activity r3 = r5.activity
            r1.<init>(r3)
            r5.versionHelp = r1
            r1.setTextSize(r2)
            android.widget.TextView r1 = r5.versionHelp
            int r2 = ca.dnamobile.javalauncher.R.string.create_instance_per_instance_summary
            r1.setText(r2)
            android.widget.TextView r1 = r5.versionHelp
            r2 = 12
            int r2 = r5.dp(r2)
            r1.setPadding(r4, r2, r4, r4)
            android.widget.TextView r1 = r5.versionHelp
            android.widget.LinearLayout$LayoutParams r2 = r5.matchWrap()
            r0.addView(r1, r2)
            return r0
    }

    private com.google.android.material.textfield.TextInputLayout createOutlinedLayout(java.lang.String r5) {
            r4 = this;
            com.google.android.material.textfield.TextInputLayout r0 = new com.google.android.material.textfield.TextInputLayout
            android.app.Activity r1 = r4.activity
            r0.<init>(r1)
            r0.setHint(r5)
            r5 = 2
            r0.setBoxBackgroundMode(r5)
            r5 = 14
            int r1 = r4.dp(r5)
            float r1 = (float) r1
            int r2 = r4.dp(r5)
            float r2 = (float) r2
            int r3 = r4.dp(r5)
            float r3 = (float) r3
            int r5 = r4.dp(r5)
            float r5 = (float) r5
            r0.setBoxCornerRadii(r1, r2, r3, r5)
            return r0
    }

    private android.widget.LinearLayout createSection() {
            r4 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            android.app.Activity r1 = r4.activity
            r0.<init>(r1)
            r1 = 1
            r0.setOrientation(r1)
            r1 = 8
            int r1 = r4.dp(r1)
            r2 = 10
            int r2 = r4.dp(r2)
            r3 = 0
            r0.setPadding(r3, r1, r3, r2)
            return r0
    }

    private android.view.View createVersionSection() {
            r6 = this;
            android.widget.LinearLayout r0 = r6.createSection()
            android.app.Activity r1 = r6.activity
            int r2 = ca.dnamobile.javalauncher.R.string.create_instance_game_version_label
            java.lang.String r1 = r1.getString(r2)
            android.app.Activity r2 = r6.activity
            int r3 = ca.dnamobile.javalauncher.R.string.create_instance_game_version_summary
            java.lang.String r2 = r2.getString(r3)
            r6.addSectionTitle(r0, r1, r2)
            com.google.android.material.textfield.MaterialAutoCompleteTextView r1 = new com.google.android.material.textfield.MaterialAutoCompleteTextView
            android.app.Activity r2 = r6.activity
            r1.<init>(r2)
            r6.minecraftVersionDropdown = r1
            r2 = 0
            r1.setInputType(r2)
            com.google.android.material.textfield.MaterialAutoCompleteTextView r1 = r6.minecraftVersionDropdown
            r3 = 1
            r1.setSingleLine(r3)
            com.google.android.material.textfield.MaterialAutoCompleteTextView r1 = r6.minecraftVersionDropdown
            ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog$$ExternalSyntheticLambda2 r4 = new ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog$$ExternalSyntheticLambda2
            r4.<init>(r6)
            r1.setOnClickListener(r4)
            com.google.android.material.textfield.MaterialAutoCompleteTextView r1 = r6.minecraftVersionDropdown
            ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog$$ExternalSyntheticLambda3 r4 = new ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog$$ExternalSyntheticLambda3
            r4.<init>(r6)
            r1.setOnItemClickListener(r4)
            android.app.Activity r1 = r6.activity
            int r4 = ca.dnamobile.javalauncher.R.string.create_instance_game_version_label
            java.lang.String r1 = r1.getString(r4)
            com.google.android.material.textfield.TextInputLayout r1 = r6.createDropdownLayout(r1)
            com.google.android.material.textfield.MaterialAutoCompleteTextView r4 = r6.minecraftVersionDropdown
            android.widget.LinearLayout$LayoutParams r5 = r6.matchWrap()
            r1.addView(r4, r5)
            android.widget.LinearLayout$LayoutParams r4 = r6.matchWrap()
            r0.addView(r1, r4)
            android.widget.TextView r1 = new android.widget.TextView
            android.app.Activity r4 = r6.activity
            r1.<init>(r4)
            int r4 = ca.dnamobile.javalauncher.R.string.create_instance_version_type_label
            r1.setText(r4)
            android.graphics.Typeface r4 = r1.getTypeface()
            r1.setTypeface(r4, r3)
            r3 = 12
            int r3 = r6.dp(r3)
            r4 = 4
            int r4 = r6.dp(r4)
            r1.setPadding(r2, r3, r2, r4)
            android.widget.LinearLayout$LayoutParams r2 = r6.matchWrap()
            r0.addView(r1, r2)
            com.google.android.material.chip.ChipGroup r1 = r6.createVersionTypeChips()
            android.widget.LinearLayout$LayoutParams r2 = r6.matchWrap()
            r0.addView(r1, r2)
            return r0
    }

    private com.google.android.material.chip.ChipGroup createVersionTypeChips() {
            r4 = this;
            com.google.android.material.chip.ChipGroup r0 = new com.google.android.material.chip.ChipGroup
            android.app.Activity r1 = r4.activity
            r0.<init>(r1)
            r1 = 1
            r0.setSingleSelection(r1)
            r0.setSelectionRequired(r1)
            android.app.Activity r2 = r4.activity
            int r3 = ca.dnamobile.javalauncher.R.string.version_tab_release
            java.lang.String r2 = r2.getString(r3)
            java.lang.String r3 = "release"
            r4.addTypeChip(r0, r2, r3, r1)
            android.app.Activity r1 = r4.activity
            int r2 = ca.dnamobile.javalauncher.R.string.version_tab_snapshot
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "snapshot"
            r3 = 0
            r4.addTypeChip(r0, r1, r2, r3)
            android.app.Activity r1 = r4.activity
            int r2 = ca.dnamobile.javalauncher.R.string.version_tab_beta
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "old_beta"
            r4.addTypeChip(r0, r1, r2, r3)
            android.app.Activity r1 = r4.activity
            int r2 = ca.dnamobile.javalauncher.R.string.version_tab_alpha
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "old_alpha"
            r4.addTypeChip(r0, r1, r2, r3)
            return r0
    }

    private int dp(int r2) {
            r1 = this;
            float r2 = (float) r2
            android.app.Activity r0 = r1.activity
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r2 = r2 * r0
            int r2 = java.lang.Math.round(r2)
            return r2
    }

    private java.lang.String getSelectedLoaderName() {
            r1 = this;
            java.lang.String r0 = r1.selectedLoader
            return r0
    }

    private java.lang.String getSelectedLoaderVersion() {
            r3 = this;
            java.util.ArrayList<ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver$LoaderVersionOption> r0 = r3.loaderVersionOptions
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            int r0 = r3.selectedLoaderVersionIndex
            if (r0 < 0) goto L35
            java.util.ArrayList<ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver$LoaderVersionOption> r2 = r3.loaderVersionOptions
            int r2 = r2.size()
            if (r0 < r2) goto L17
            goto L35
        L17:
            java.util.ArrayList<ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver$LoaderVersionOption> r0 = r3.loaderVersionOptions
            int r2 = r3.selectedLoaderVersionIndex
            java.lang.Object r0 = r0.get(r2)
            ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver$LoaderVersionOption r0 = (ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver.LoaderVersionOption) r0
            java.lang.String r0 = r0.loaderVersion
            if (r0 == 0) goto L35
            java.lang.String r2 = r0.trim()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L30
            goto L35
        L30:
            java.lang.String r0 = r0.trim()
            return r0
        L35:
            return r1
    }

    private ca.dnamobile.javalauncher.data.model.MinecraftVersion getSelectedMinecraftVersion() {
            r2 = this;
            java.util.ArrayList<ca.dnamobile.javalauncher.data.model.MinecraftVersion> r0 = r2.filteredVersions
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            int r0 = r2.selectedMinecraftVersionIndex
            if (r0 < 0) goto L16
            java.util.ArrayList<ca.dnamobile.javalauncher.data.model.MinecraftVersion> r1 = r2.filteredVersions
            int r1 = r1.size()
            if (r0 < r1) goto L17
        L16:
            r0 = 0
        L17:
            java.util.ArrayList<ca.dnamobile.javalauncher.data.model.MinecraftVersion> r1 = r2.filteredVersions
            java.lang.Object r0 = r1.get(r0)
            ca.dnamobile.javalauncher.data.model.MinecraftVersion r0 = (ca.dnamobile.javalauncher.data.model.MinecraftVersion) r0
            return r0
    }

    private boolean isDuplicateInstanceName(java.lang.String r2) {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.existingInstanceNameKeys
            java.lang.String r2 = r1.normalizeInstanceName(r2)
            boolean r2 = r0.contains(r2)
            return r2
    }

    private /* synthetic */ void lambda$addTypeChip$11(java.lang.String r1, android.view.View r2) {
            r0 = this;
            r0.selectedType = r1
            r0.updateMinecraftVersionDropdown()
            return
    }

    private /* synthetic */ void lambda$createActionsSection$8(android.view.View r1) {
            r0 = this;
            androidx.appcompat.app.AlertDialog r1 = r0.dialog
            if (r1 == 0) goto L7
            r1.dismiss()
        L7:
            return
    }

    private /* synthetic */ void lambda$createActionsSection$9(android.view.View r1) {
            r0 = this;
            r0.submit()
            return
    }

    private /* synthetic */ void lambda$createHeader$1(android.view.View r1) {
            r0 = this;
            ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog$Listener r1 = r0.listener
            r1.onPickIcon(r0)
            return
    }

    private /* synthetic */ void lambda$createHeader$2(com.google.android.material.button.MaterialButton r1, android.view.View r2) {
            r0 = this;
            r2 = 0
            r0.setIconUri(r2)
            r2 = 0
            r1.setEnabled(r2)
            return
    }

    private /* synthetic */ void lambda$createHeader$3(com.google.android.material.button.MaterialButton r1, android.view.View r2) {
            r0 = this;
            ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog$Listener r2 = r0.listener
            r2.onPickIcon(r0)
            r2 = 1
            r1.setEnabled(r2)
            return
    }

    private /* synthetic */ void lambda$createLoaderChip$10(java.lang.String r1, android.view.View r2) {
            r0 = this;
            r0.selectedLoader = r1
            r0.updateDefaultNameIfAllowed()
            r0.updateLoaderHelpText()
            r0.updateLoaderVersionDropdown()
            return
    }

    private /* synthetic */ void lambda$createLoaderVersionSection$6(android.view.View r1) {
            r0 = this;
            com.google.android.material.textfield.MaterialAutoCompleteTextView r1 = r0.loaderVersionDropdown
            r1.showDropDown()
            return
    }

    private /* synthetic */ void lambda$createLoaderVersionSection$7(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            r0.selectedLoaderVersionIndex = r3
            r0.updateLoaderVersionStatus()
            return
    }

    private /* synthetic */ void lambda$createVersionSection$4(android.view.View r1) {
            r0 = this;
            com.google.android.material.textfield.MaterialAutoCompleteTextView r1 = r0.minecraftVersionDropdown
            r1.showDropDown()
            return
    }

    private /* synthetic */ void lambda$createVersionSection$5(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            r0.selectedMinecraftVersionIndex = r3
            r0.updateDefaultNameIfAllowed()
            r0.updateLoaderVersionDropdown()
            return
    }

    private /* synthetic */ void lambda$show$0(android.content.DialogInterface r2) {
            r1 = this;
            androidx.appcompat.app.AlertDialog r2 = r1.dialog
            android.view.Window r2 = r2.getWindow()
            if (r2 == 0) goto Le
            r0 = 17170445(0x106000d, float:2.461195E-38)
            r2.setBackgroundDrawableResource(r0)
        Le:
            return
    }

    private /* synthetic */ void lambda$updateLoaderVersionDropdown$12(int r2, java.lang.String r3, java.util.ArrayList r4, java.lang.String r5, java.lang.String r6) {
            r1 = this;
            int r0 = r1.loaderVersionRequestSerial
            if (r2 == r0) goto L5
            return
        L5:
            r2 = 0
            if (r3 == 0) goto L1d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            android.app.Activity r5 = r1.activity
            int r6 = ca.dnamobile.javalauncher.R.string.create_instance_loader_version_error
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r3 = r5.getString(r6, r3)
            r1.setLoaderVersionOptions(r4, r3, r2)
            return
        L1d:
            boolean r3 = r4.isEmpty()
            if (r3 == 0) goto L38
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            android.app.Activity r4 = r1.activity
            int r0 = ca.dnamobile.javalauncher.R.string.create_instance_loader_version_none
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r6}
            java.lang.String r4 = r4.getString(r0, r5)
            r1.setLoaderVersionOptions(r3, r4, r2)
            return
        L38:
            android.app.Activity r2 = r1.activity
            int r3 = ca.dnamobile.javalauncher.R.string.create_instance_loader_version_loaded
            int r5 = r4.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r2 = r2.getString(r3, r5)
            r3 = 1
            r1.setLoaderVersionOptions(r4, r2, r3)
            return
    }

    private /* synthetic */ void lambda$updateLoaderVersionDropdown$13(java.lang.String r10, java.lang.String r11, int r12) {
            r9 = this;
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r0 = ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver.resolveVersions(r10, r11)     // Catch: java.lang.Throwable -> Lf
            r4.addAll(r0)     // Catch: java.lang.Throwable -> Lf
            r0 = 0
        Ld:
            r3 = r0
            goto L20
        Lf:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            if (r1 != 0) goto L1b
            java.lang.String r0 = r0.toString()
            goto Ld
        L1b:
            java.lang.String r0 = r0.getMessage()
            goto Ld
        L20:
            android.app.Activity r7 = r9.activity
            ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog$$ExternalSyntheticLambda7 r8 = new ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog$$ExternalSyntheticLambda7
            r0 = r8
            r1 = r9
            r2 = r12
            r5 = r10
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.runOnUiThread(r8)
            return
    }

    private android.widget.LinearLayout.LayoutParams matchWrap() {
            r3 = this;
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
            return r0
    }

    private java.lang.String normalizeInstanceName(java.lang.String r2) {
            r1 = this;
            if (r2 != 0) goto L5
            java.lang.String r2 = ""
            return r2
        L5:
            java.lang.String r2 = r2.trim()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r0)
            return r2
    }

    private void setLoaderVersionOptions(java.util.ArrayList<ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver.LoaderVersionOption> r6, java.lang.String r7, boolean r8) {
            r5 = this;
            java.util.ArrayList<ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver$LoaderVersionOption> r0 = r5.loaderVersionOptions
            r0.clear()
            java.util.ArrayList<ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver$LoaderVersionOption> r0 = r5.loaderVersionOptions
            r0.addAll(r6)
            r6 = 0
            r5.selectedLoaderVersionIndex = r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList<ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver$LoaderVersionOption> r1 = r5.loaderVersionOptions
            java.util.Iterator r1 = r1.iterator()
        L18:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r1.next()
            ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver$LoaderVersionOption r2 = (ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver.LoaderVersionOption) r2
            java.lang.String r2 = r2.displayName
            r0.add(r2)
            goto L18
        L2a:
            com.google.android.material.textfield.MaterialAutoCompleteTextView r1 = r5.loaderVersionDropdown
            r2 = 1
            if (r8 == 0) goto L37
            boolean r8 = r0.isEmpty()
            if (r8 != 0) goto L37
            r8 = r2
            goto L38
        L37:
            r8 = r6
        L38:
            r1.setEnabled(r8)
            com.google.android.material.textfield.MaterialAutoCompleteTextView r8 = r5.loaderVersionDropdown
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            android.app.Activity r3 = r5.activity
            r4 = 17367043(0x1090003, float:2.5162934E-38)
            r1.<init>(r3, r4, r0)
            r8.setAdapter(r1)
            com.google.android.material.textfield.MaterialAutoCompleteTextView r8 = r5.loaderVersionDropdown
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L55
            java.lang.String r0 = ""
            goto L5b
        L55:
            java.lang.Object r0 = r0.get(r6)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
        L5b:
            r8.setText(r0, r6)
            android.widget.TextView r8 = r5.loaderVersionStatus
            if (r8 == 0) goto L65
            r8.setText(r7)
        L65:
            com.google.android.material.button.MaterialButton r7 = r5.createButton
            if (r7 == 0) goto L7f
            java.lang.String r8 = "Vanilla"
            java.lang.String r0 = r5.selectedLoader
            boolean r8 = r8.equalsIgnoreCase(r0)
            if (r8 != 0) goto L7b
            java.util.ArrayList<ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver$LoaderVersionOption> r8 = r5.loaderVersionOptions
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L7c
        L7b:
            r6 = r2
        L7c:
            r7.setEnabled(r6)
        L7f:
            r5.updateLoaderVersionStatus()
            return
    }

    private void submit() {
            r12 = this;
            java.util.ArrayList<ca.dnamobile.javalauncher.data.model.MinecraftVersion> r0 = r12.filteredVersions
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L10
            android.widget.TextView r0 = r12.versionHelp
            int r1 = ca.dnamobile.javalauncher.R.string.create_instance_no_versions
            r0.setText(r1)
            return
        L10:
            ca.dnamobile.javalauncher.data.model.MinecraftVersion r0 = r12.getSelectedMinecraftVersion()
            if (r0 != 0) goto L1e
            android.widget.TextView r0 = r12.versionHelp
            int r1 = ca.dnamobile.javalauncher.R.string.create_instance_no_versions
            r0.setText(r1)
            return
        L1e:
            java.lang.String r1 = "Vanilla"
            java.lang.String r2 = r12.selectedLoader
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 != 0) goto L38
            java.util.ArrayList<ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver$LoaderVersionOption> r1 = r12.loaderVersionOptions
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L38
            android.widget.TextView r0 = r12.versionHelp
            int r1 = ca.dnamobile.javalauncher.R.string.create_instance_loader_version_required
            r0.setText(r1)
            return
        L38:
            java.lang.String r1 = r12.buildDefaultInstanceName()
            com.google.android.material.textfield.TextInputEditText r2 = r12.nameInput
            android.text.Editable r2 = r2.getText()
            if (r2 != 0) goto L47
            java.lang.String r2 = ""
            goto L55
        L47:
            com.google.android.material.textfield.TextInputEditText r2 = r12.nameInput
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.trim()
        L55:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L5d
            r5 = r1
            goto L5e
        L5d:
            r5 = r2
        L5e:
            android.widget.CheckBox r1 = r12.isolatedInstanceCheck
            if (r1 == 0) goto L6b
            boolean r1 = r1.isChecked()
            if (r1 == 0) goto L69
            goto L6b
        L69:
            r1 = 0
            goto L6c
        L6b:
            r1 = 1
        L6c:
            r11 = r1
            if (r11 == 0) goto L76
            boolean r1 = r12.validateInstanceName(r5)
            if (r1 != 0) goto L76
            return
        L76:
            ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog$Listener r1 = r12.listener
            ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog$Request r2 = new ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog$Request
            java.lang.String r6 = r12.getSelectedLoaderName()
            java.lang.String r7 = r12.getSelectedLoaderVersion()
            java.lang.String r8 = r0.getId()
            java.lang.String r9 = r12.selectedType
            android.net.Uri r10 = r12.iconUri
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r1.onCreateInstance(r2)
            androidx.appcompat.app.AlertDialog r0 = r12.dialog
            if (r0 == 0) goto L98
            r0.dismiss()
        L98:
            return
    }

    private void updateDefaultNameIfAllowed() {
            r2 = this;
            com.google.android.material.textfield.TextInputEditText r0 = r2.nameInput
            if (r0 == 0) goto L1f
            boolean r1 = r2.userEditedName
            if (r1 == 0) goto L9
            goto L1f
        L9:
            r1 = 1
            r2.programmaticNameChange = r1
            java.lang.String r1 = r2.buildDefaultInstanceName()
            r0.setText(r1)
            com.google.android.material.textfield.TextInputEditText r0 = r2.nameInput
            int r1 = r0.length()
            r0.setSelection(r1)
            r0 = 0
            r2.programmaticNameChange = r0
        L1f:
            return
    }

    private void updateLoaderHelpText() {
            r2 = this;
            android.widget.TextView r0 = r2.versionHelp
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r0 = "Fabric"
            java.lang.String r1 = r2.selectedLoader
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L17
            android.widget.TextView r0 = r2.versionHelp
            int r1 = ca.dnamobile.javalauncher.R.string.create_instance_fabric_summary
            r0.setText(r1)
            goto L42
        L17:
            java.lang.String r0 = "Forge"
            java.lang.String r1 = r2.selectedLoader
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L29
            android.widget.TextView r0 = r2.versionHelp
            int r1 = ca.dnamobile.javalauncher.R.string.create_instance_forge_summary
            r0.setText(r1)
            goto L42
        L29:
            java.lang.String r0 = "NeoForge"
            java.lang.String r1 = r2.selectedLoader
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L3b
            android.widget.TextView r0 = r2.versionHelp
            int r1 = ca.dnamobile.javalauncher.R.string.create_instance_neoforge_summary
            r0.setText(r1)
            goto L42
        L3b:
            android.widget.TextView r0 = r2.versionHelp
            int r1 = ca.dnamobile.javalauncher.R.string.create_instance_per_instance_summary
            r0.setText(r1)
        L42:
            return
    }

    private void updateLoaderVersionDropdown() {
            r6 = this;
            com.google.android.material.textfield.MaterialAutoCompleteTextView r0 = r6.loaderVersionDropdown
            if (r0 != 0) goto L5
            return
        L5:
            ca.dnamobile.javalauncher.data.model.MinecraftVersion r0 = r6.getSelectedMinecraftVersion()
            java.util.ArrayList<ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver$LoaderVersionOption> r1 = r6.loaderVersionOptions
            r1.clear()
            r1 = 0
            r6.selectedLoaderVersionIndex = r1
            int r2 = r6.loaderVersionRequestSerial
            r3 = 1
            int r2 = r2 + r3
            r6.loaderVersionRequestSerial = r2
            if (r0 != 0) goto L2a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.app.Activity r2 = r6.activity
            int r3 = ca.dnamobile.javalauncher.R.string.create_instance_no_versions
            java.lang.String r2 = r2.getString(r3)
            r6.setLoaderVersionOptions(r0, r2, r1)
            return
        L2a:
            java.lang.String r4 = "Vanilla"
            java.lang.String r5 = r6.selectedLoader
            boolean r4 = r4.equalsIgnoreCase(r5)
            if (r4 == 0) goto L57
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver$LoaderVersionOption r1 = new ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver$LoaderVersionOption
            android.app.Activity r2 = r6.activity
            int r4 = ca.dnamobile.javalauncher.R.string.create_instance_loader_version_vanilla
            java.lang.String r2 = r2.getString(r4)
            java.lang.String r4 = ""
            r1.<init>(r2, r4)
            r0.add(r1)
            android.app.Activity r1 = r6.activity
            int r2 = ca.dnamobile.javalauncher.R.string.create_instance_loader_version_auto
            java.lang.String r1 = r1.getString(r2)
            r6.setLoaderVersionOptions(r0, r1, r3)
            return
        L57:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            android.app.Activity r4 = r6.activity
            int r5 = ca.dnamobile.javalauncher.R.string.create_instance_loader_version_loading
            java.lang.String r4 = r4.getString(r5)
            r6.setLoaderVersionOptions(r3, r4, r1)
            java.lang.String r1 = r6.selectedLoader
            java.lang.String r0 = r0.getId()
            java.lang.Thread r3 = new java.lang.Thread
            ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog$$ExternalSyntheticLambda4 r4 = new ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog$$ExternalSyntheticLambda4
            r4.<init>(r6, r1, r0, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "LoaderVersionResolver-"
            r2.<init>(r5)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = "-"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r3.<init>(r4, r0)
            r3.start()
            return
    }

    private void updateLoaderVersionStatus() {
            r4 = this;
            android.widget.TextView r0 = r4.loaderVersionStatus
            if (r0 == 0) goto L4b
            java.util.ArrayList<ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver$LoaderVersionOption> r0 = r4.loaderVersionOptions
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto L4b
        Ld:
            java.util.ArrayList<ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver$LoaderVersionOption> r0 = r4.loaderVersionOptions
            int r1 = r4.selectedLoaderVersionIndex
            int r2 = r0.size()
            int r2 = r2 + (-1)
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            java.lang.Object r0 = r0.get(r1)
            ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver$LoaderVersionOption r0 = (ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver.LoaderVersionOption) r0
            java.lang.String r1 = "Vanilla"
            java.lang.String r2 = r4.selectedLoader
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L38
            android.widget.TextView r0 = r4.loaderVersionStatus
            int r1 = ca.dnamobile.javalauncher.R.string.create_instance_loader_version_auto
            r0.setText(r1)
            goto L4b
        L38:
            android.widget.TextView r1 = r4.loaderVersionStatus
            android.app.Activity r2 = r4.activity
            int r3 = ca.dnamobile.javalauncher.R.string.create_instance_loader_version_selected
            java.lang.String r0 = r0.displayName
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r2.getString(r3, r0)
            r1.setText(r0)
        L4b:
            return
    }

    private void updateMinecraftVersionDropdown() {
            r5 = this;
            com.google.android.material.textfield.MaterialAutoCompleteTextView r0 = r5.minecraftVersionDropdown
            if (r0 != 0) goto L5
            return
        L5:
            java.util.ArrayList<ca.dnamobile.javalauncher.data.model.MinecraftVersion> r0 = r5.filteredVersions
            r0.clear()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList<ca.dnamobile.javalauncher.data.model.MinecraftVersion> r1 = r5.allVersions
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r1.next()
            ca.dnamobile.javalauncher.data.model.MinecraftVersion r2 = (ca.dnamobile.javalauncher.data.model.MinecraftVersion) r2
            java.lang.String r3 = r5.selectedType
            java.lang.String r4 = r2.getType()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L15
            java.util.ArrayList<ca.dnamobile.javalauncher.data.model.MinecraftVersion> r3 = r5.filteredVersions
            r3.add(r2)
            java.lang.String r2 = r2.getId()
            r0.add(r2)
            goto L15
        L3a:
            r1 = 0
            r5.selectedMinecraftVersionIndex = r1
            android.widget.ArrayAdapter r2 = new android.widget.ArrayAdapter
            android.app.Activity r3 = r5.activity
            r4 = 17367043(0x1090003, float:2.5162934E-38)
            r2.<init>(r3, r4, r0)
            com.google.android.material.textfield.MaterialAutoCompleteTextView r3 = r5.minecraftVersionDropdown
            r3.setAdapter(r2)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L63
            com.google.android.material.textfield.MaterialAutoCompleteTextView r0 = r5.minecraftVersionDropdown
            java.lang.String r2 = ""
            r0.setText(r2, r1)
            android.widget.TextView r0 = r5.versionHelp
            if (r0 == 0) goto L6e
            int r1 = ca.dnamobile.javalauncher.R.string.create_instance_no_versions
            r0.setText(r1)
            goto L6e
        L63:
            com.google.android.material.textfield.MaterialAutoCompleteTextView r2 = r5.minecraftVersionDropdown
            java.lang.Object r0 = r0.get(r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.setText(r0, r1)
        L6e:
            r5.updateDefaultNameIfAllowed()
            r5.updateLoaderVersionDropdown()
            return
    }

    private boolean validateInstanceName(java.lang.String r4) {
            r3 = this;
            boolean r0 = r3.isDuplicateInstanceName(r4)
            if (r0 != 0) goto L10
            com.google.android.material.textfield.TextInputLayout r4 = r3.nameInputLayout
            if (r4 == 0) goto Le
            r0 = 0
            r4.setError(r0)
        Le:
            r4 = 1
            return r4
        L10:
            com.google.android.material.textfield.TextInputLayout r0 = r3.nameInputLayout
            if (r0 == 0) goto L23
            android.app.Activity r1 = r3.activity
            int r2 = ca.dnamobile.javalauncher.R.string.create_instance_name_already_exists
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r4 = r1.getString(r2, r4)
            r0.setError(r4)
        L23:
            com.google.android.material.textfield.TextInputEditText r4 = r3.nameInput
            if (r4 == 0) goto L2a
            r4.requestFocus()
        L2a:
            r4 = 0
            return r4
    }

    public boolean isShowing() {
            r1 = this;
            androidx.appcompat.app.AlertDialog r0 = r1.dialog
            if (r0 == 0) goto Lc
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public void setExistingInstanceNames(java.util.List<java.lang.String> r3) {
            r2 = this;
            java.util.Set<java.lang.String> r0 = r2.existingInstanceNameKeys
            r0.clear()
            if (r3 != 0) goto L8
            return
        L8:
            java.util.Iterator r3 = r3.iterator()
        Lc:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r2.normalizeInstanceName(r0)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto Lc
            java.util.Set<java.lang.String> r1 = r2.existingInstanceNameKeys
            r1.add(r0)
            goto Lc
        L28:
            return
    }

    public void setIconUri(android.net.Uri r2) {
            r1 = this;
            r1.iconUri = r2
            android.widget.ImageView r0 = r1.iconPreview
            if (r0 != 0) goto L7
            return
        L7:
            if (r2 != 0) goto Lf
            int r2 = ca.dnamobile.javalauncher.R.mipmap.ic_launcher
            r0.setImageResource(r2)
            goto L12
        Lf:
            r0.setImageURI(r2)
        L12:
            return
    }

    public void show() {
            r8 = this;
            android.widget.ScrollView r0 = new android.widget.ScrollView
            android.app.Activity r1 = r8.activity
            r0.<init>(r1)
            r1 = 0
            r0.setFillViewport(r1)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            android.app.Activity r2 = r8.activity
            r1.<init>(r2)
            r2 = 1
            r1.setOrientation(r2)
            r3 = 4
            int r4 = r8.dp(r3)
            int r5 = r8.dp(r3)
            int r6 = r8.dp(r3)
            int r3 = r8.dp(r3)
            r1.setPadding(r4, r5, r6, r3)
            r0.addView(r1)
            com.google.android.material.card.MaterialCardView r3 = new com.google.android.material.card.MaterialCardView
            android.app.Activity r4 = r8.activity
            r3.<init>(r4)
            r4 = 26
            int r4 = r8.dp(r4)
            float r4 = (float) r4
            r3.setRadius(r4)
            r4 = 8
            int r4 = r8.dp(r4)
            float r4 = (float) r4
            r3.setCardElevation(r4)
            r3.setUseCompatPadding(r2)
            r3.setPreventCornerOverlap(r2)
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            android.app.Activity r5 = r8.activity
            r4.<init>(r5)
            r4.setOrientation(r2)
            r2 = 22
            int r5 = r8.dp(r2)
            r6 = 20
            int r6 = r8.dp(r6)
            int r2 = r8.dp(r2)
            r7 = 18
            int r7 = r8.dp(r7)
            r4.setPadding(r5, r6, r2, r7)
            android.widget.LinearLayout$LayoutParams r2 = r8.matchWrap()
            r3.addView(r4, r2)
            android.view.View r2 = r8.createHeader()
            r4.addView(r2)
            android.view.View r2 = r8.createNameSection()
            r4.addView(r2)
            android.view.View r2 = r8.createLoaderSection()
            r4.addView(r2)
            android.view.View r2 = r8.createVersionSection()
            r4.addView(r2)
            android.view.View r2 = r8.createLoaderVersionSection()
            r4.addView(r2)
            android.view.View r2 = r8.createOptionsSection()
            r4.addView(r2)
            android.view.View r2 = r8.createActionsSection()
            r4.addView(r2)
            android.widget.LinearLayout$LayoutParams r2 = r8.matchWrap()
            r1.addView(r3, r2)
            r8.updateMinecraftVersionDropdown()
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = new com.google.android.material.dialog.MaterialAlertDialogBuilder
            android.app.Activity r2 = r8.activity
            r1.<init>(r2)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r0 = r1.setView(r0)
            androidx.appcompat.app.AlertDialog r0 = r0.create()
            r8.dialog = r0
            ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog$$ExternalSyntheticLambda0
            r1.<init>(r8)
            r0.setOnShowListener(r1)
            androidx.appcompat.app.AlertDialog r0 = r8.dialog
            r0.show()
            return
    }
}
