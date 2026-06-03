package ca.dnamobile.javalauncher.input;

/* JADX INFO: loaded from: classes.dex */
public final class GamepadMappingTransferActivity extends androidx.appcompat.app.AppCompatActivity {
    private static final int COLOR_ACCENT = 0;
    private static final int COLOR_TEXT_PRIMARY = 0;
    private static final int COLOR_TEXT_SECONDARY = 0;
    private static final java.lang.String EXTRA_MODE = "ca.dnamobile.javalauncher.input.extra.MODE";
    private static final java.lang.String EXTRA_PROFILE_KEY = "ca.dnamobile.javalauncher.input.extra.PROFILE_KEY";
    private static final java.lang.String MODE_EXPORT = "export";
    private static final java.lang.String MODE_IMPORT = "import";
    private static final int REQUEST_EXPORT = 4101;
    private static final int REQUEST_IMPORT = 4102;
    private boolean launchedPicker;
    private java.lang.String pendingExportJson;
    private java.lang.String profileKey;

    static {
            r0 = 241(0xf1, float:3.38E-43)
            r1 = 248(0xf8, float:3.48E-43)
            r2 = 238(0xee, float:3.34E-43)
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.input.GamepadMappingTransferActivity.COLOR_TEXT_PRIMARY = r0
            r0 = 204(0xcc, float:2.86E-43)
            r1 = 216(0xd8, float:3.03E-43)
            r2 = 198(0xc6, float:2.77E-43)
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.input.GamepadMappingTransferActivity.COLOR_TEXT_SECONDARY = r0
            r0 = 211(0xd3, float:2.96E-43)
            r1 = 128(0x80, float:1.8E-43)
            r2 = 37
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.input.GamepadMappingTransferActivity.COLOR_ACCENT = r0
            return
    }

    public GamepadMappingTransferActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String buildExportFileName(java.lang.String r2) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r0)
            java.lang.String r0 = "[^a-z0-9._-]+"
            java.lang.String r1 = "-"
            java.lang.String r2 = r2.replaceAll(r0, r1)
            java.lang.String r0 = "^-+|-+$"
            java.lang.String r1 = ""
            java.lang.String r2 = r2.replaceAll(r0, r1)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L1e
            java.lang.String r2 = "controller-profile"
        L1e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "droidbridge-gamepad-"
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r0 = ".json"
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
    }

    private static android.widget.Button buildSettingsButton(android.app.Activity r4, java.lang.String r5) {
            android.widget.Button r0 = new android.widget.Button
            r0.<init>(r4)
            r0.setText(r5)
            r5 = 0
            r0.setAllCaps(r5)
            int r1 = ca.dnamobile.javalauncher.input.GamepadMappingTransferActivity.COLOR_ACCENT
            r0.setTextColor(r1)
            r0.setMinHeight(r5)
            r0.setMinimumHeight(r5)
            r5 = 1092616192(0x41200000, float:10.0)
            int r1 = dp(r4, r5)
            r2 = 1086324736(0x40c00000, float:6.0)
            int r3 = dp(r4, r2)
            int r5 = dp(r4, r5)
            int r4 = dp(r4, r2)
            r0.setPadding(r1, r3, r5, r4)
            return r0
    }

    private static int dp(android.content.Context r0, float r1) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            int r0 = java.lang.Math.round(r1)
            return r0
    }

    public static void installSettingsUi(android.app.Activity r10, android.widget.LinearLayout r11) {
            java.lang.String r0 = "gamepad_mapping_transfer"
            android.view.View r1 = r11.findViewWithTag(r0)
            if (r1 == 0) goto L9
            return
        L9:
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r10)
            r1.setTag(r0)
            r0 = 1
            r1.setOrientation(r0)
            r2 = 1096810496(0x41600000, float:14.0)
            int r2 = dp(r10, r2)
            r3 = 0
            r1.setPadding(r3, r2, r3, r3)
            android.view.View r2 = new android.view.View
            r2.<init>(r10)
            r4 = 855638016(0x33000000, float:2.9802322E-8)
            r2.setBackgroundColor(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = 1065353216(0x3f800000, float:1.0)
            int r6 = dp(r10, r5)
            int r0 = java.lang.Math.max(r0, r6)
            r6 = -1
            r4.<init>(r6, r0)
            r1.addView(r2, r4)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r10)
            java.lang.String r2 = "Controller profile import / export"
            r0.setText(r2)
            r2 = 1098907648(0x41800000, float:16.0)
            r0.setTextSize(r2)
            android.graphics.Typeface r2 = android.graphics.Typeface.DEFAULT_BOLD
            r0.setTypeface(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r4 = -2
            r2.<init>(r6, r4)
            r7 = 1094713344(0x41400000, float:12.0)
            int r7 = dp(r10, r7)
            r2.topMargin = r7
            r1.addView(r0, r2)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r10)
            java.lang.String r2 = "Save the selected built-in controller mapping as a portable JSON file, or import one into the currently selected profile."
            r0.setText(r2)
            r2 = 1095761920(0x41500000, float:13.0)
            r0.setTextSize(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r6, r4)
            r7 = 1073741824(0x40000000, float:2.0)
            int r7 = dp(r10, r7)
            r2.topMargin = r7
            r1.addView(r0, r2)
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r10)
            r0.setOrientation(r3)
            r2 = 16
            r0.setGravity(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r6, r4)
            r7 = 1090519040(0x41000000, float:8.0)
            int r8 = dp(r10, r7)
            r2.topMargin = r8
            r1.addView(r0, r2)
            java.lang.String r2 = "Export gamepad profile"
            android.widget.Button r2 = buildSettingsButton(r10, r2)
            java.lang.String r8 = "Import gamepad profile"
            android.widget.Button r8 = buildSettingsButton(r10, r8)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r9.<init>(r3, r4, r5)
            r0.addView(r2, r9)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r9.<init>(r3, r4, r5)
            int r3 = dp(r10, r7)
            r9.leftMargin = r3
            r0.addView(r8, r9)
            ca.dnamobile.javalauncher.input.GamepadMappingTransferActivity$$ExternalSyntheticLambda0 r0 = new ca.dnamobile.javalauncher.input.GamepadMappingTransferActivity$$ExternalSyntheticLambda0
            r0.<init>(r10)
            r2.setOnClickListener(r0)
            ca.dnamobile.javalauncher.input.GamepadMappingTransferActivity$$ExternalSyntheticLambda1 r0 = new ca.dnamobile.javalauncher.input.GamepadMappingTransferActivity$$ExternalSyntheticLambda1
            r0.<init>(r10)
            r8.setOnClickListener(r0)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r10.<init>(r6, r4)
            r11.addView(r1, r10)
            return
    }

    static /* synthetic */ void lambda$installSettingsUi$0(android.app.Activity r0, android.view.View r1) {
            ca.dnamobile.javalauncher.input.GamepadMappingStore r1 = ca.dnamobile.javalauncher.input.GamepadMappingStore.get(r0)
            java.lang.String r1 = r1.getActiveProfileKey()
            startExport(r0, r1)
            return
    }

    static /* synthetic */ void lambda$installSettingsUi$1(android.app.Activity r0, android.view.View r1) {
            ca.dnamobile.javalauncher.input.GamepadMappingStore r1 = ca.dnamobile.javalauncher.input.GamepadMappingStore.get(r0)
            java.lang.String r1 = r1.getActiveProfileKey()
            startImport(r0, r1)
            return
    }

    private void launchExportPicker() {
            r4 = this;
            ca.dnamobile.javalauncher.input.GamepadMappingStore r0 = ca.dnamobile.javalauncher.input.GamepadMappingStore.get(r4)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r1 = r4.profileKey     // Catch: java.lang.Throwable -> L3b
            if (r1 != 0) goto Lc
            java.lang.String r1 = r0.getActiveProfileKey()     // Catch: java.lang.Throwable -> L3b
        Lc:
            org.json.JSONObject r2 = r0.exportProfileToJson(r1)     // Catch: java.lang.Throwable -> L3b
            r3 = 2
            java.lang.String r2 = r2.toString(r3)     // Catch: java.lang.Throwable -> L3b
            r4.pendingExportJson = r2     // Catch: java.lang.Throwable -> L3b
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = "android.intent.action.CREATE_DOCUMENT"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = "android.intent.category.OPENABLE"
            r2.addCategory(r3)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = "application/json"
            r2.setType(r3)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = "android.intent.extra.TITLE"
            java.lang.String r0 = r0.getProfileDisplayName(r1)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r0 = buildExportFileName(r0)     // Catch: java.lang.Throwable -> L3b
            r2.putExtra(r3, r0)     // Catch: java.lang.Throwable -> L3b
            r0 = 4101(0x1005, float:5.747E-42)
            r4.startActivityForResult(r2, r0)     // Catch: java.lang.Throwable -> L3b
            goto L44
        L3b:
            r0 = move-exception
            java.lang.String r1 = "Unable to prepare controller export"
            r4.toastFailure(r1, r0)
            r4.finish()
        L44:
            return
    }

    private void launchImportPicker() {
            r5 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.OPEN_DOCUMENT"
            r0.<init>(r1)
            java.lang.String r1 = "android.intent.category.OPENABLE"
            r0.addCategory(r1)
            java.lang.String r1 = "*/*"
            r0.setType(r1)
            r1 = 4
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            java.lang.String r3 = "application/json"
            r1[r2] = r3
            java.lang.String r2 = "text/json"
            r3 = 1
            r1[r3] = r2
            r2 = 2
            java.lang.String r4 = "text/plain"
            r1[r2] = r4
            r2 = 3
            java.lang.String r4 = "application/octet-stream"
            r1[r2] = r4
            java.lang.String r2 = "android.intent.extra.MIME_TYPES"
            r0.putExtra(r2, r1)
            r0.addFlags(r3)
            r1 = 4102(0x1006, float:5.748E-42)
            r5.startActivityForResult(r0, r1)
            return
    }

    private void launchRequestedPicker() {
            r2 = this;
            boolean r0 = r2.launchedPicker
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r2.launchedPicker = r0
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "ca.dnamobile.javalauncher.input.extra.MODE"
            java.lang.String r0 = r0.getStringExtra(r1)
            java.lang.String r1 = "import"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1e
            r2.launchImportPicker()
            goto L21
        L1e:
            r2.launchExportPicker()
        L21:
            return
    }

    private static byte[] readAllBytes(java.io.InputStream r4) throws java.lang.Exception {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r1]
        L9:
            int r2 = r4.read(r1)
            r3 = -1
            if (r2 == r3) goto L15
            r3 = 0
            r0.write(r1, r3, r2)
            goto L9
        L15:
            byte[] r4 = r0.toByteArray()
            return r4
    }

    private void readImport(android.net.Uri r4) {
            r3 = this;
            android.content.ContentResolver r0 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L4e
            java.io.InputStream r4 = r0.openInputStream(r4)     // Catch: java.lang.Throwable -> L4e
            if (r4 == 0) goto L3b
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L39
            byte[] r1 = readAllBytes(r4)     // Catch: java.lang.Throwable -> L39
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L39
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L39
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L39
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L39
            ca.dnamobile.javalauncher.input.GamepadMappingStore r0 = ca.dnamobile.javalauncher.input.GamepadMappingStore.get(r3)     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = r3.profileKey     // Catch: java.lang.Throwable -> L39
            if (r2 != 0) goto L26
            java.lang.String r2 = r0.getActiveProfileKey()     // Catch: java.lang.Throwable -> L39
        L26:
            r0.importProfileFromJson(r1, r2)     // Catch: java.lang.Throwable -> L39
            java.lang.String r0 = "Controller profile imported."
            r1 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r1)     // Catch: java.lang.Throwable -> L39
            r0.show()     // Catch: java.lang.Throwable -> L39
            if (r4 == 0) goto L54
            r4.close()     // Catch: java.lang.Throwable -> L4e
            goto L54
        L39:
            r0 = move-exception
            goto L43
        L3b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L39
            java.lang.String r1 = "Unable to open selected file."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L39
            throw r0     // Catch: java.lang.Throwable -> L39
        L43:
            if (r4 == 0) goto L4d
            r4.close()     // Catch: java.lang.Throwable -> L49
            goto L4d
        L49:
            r4 = move-exception
            r0.addSuppressed(r4)     // Catch: java.lang.Throwable -> L4e
        L4d:
            throw r0     // Catch: java.lang.Throwable -> L4e
        L4e:
            r4 = move-exception
            java.lang.String r0 = "Controller import failed"
            r3.toastFailure(r0, r4)
        L54:
            r3.finish()
            return
    }

    public static void startExport(android.content.Context r3, java.lang.String r4) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<ca.dnamobile.javalauncher.input.GamepadMappingTransferActivity> r1 = ca.dnamobile.javalauncher.input.GamepadMappingTransferActivity.class
            r0.<init>(r3, r1)
            java.lang.String r1 = "ca.dnamobile.javalauncher.input.extra.MODE"
            java.lang.String r2 = "export"
            r0.putExtra(r1, r2)
            java.lang.String r1 = "ca.dnamobile.javalauncher.input.extra.PROFILE_KEY"
            r0.putExtra(r1, r4)
            boolean r4 = r3 instanceof android.app.Activity
            if (r4 != 0) goto L1c
            r4 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r4)
        L1c:
            r3.startActivity(r0)
            return
    }

    public static void startImport(android.content.Context r3, java.lang.String r4) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<ca.dnamobile.javalauncher.input.GamepadMappingTransferActivity> r1 = ca.dnamobile.javalauncher.input.GamepadMappingTransferActivity.class
            r0.<init>(r3, r1)
            java.lang.String r1 = "ca.dnamobile.javalauncher.input.extra.MODE"
            java.lang.String r2 = "import"
            r0.putExtra(r1, r2)
            java.lang.String r1 = "ca.dnamobile.javalauncher.input.extra.PROFILE_KEY"
            r0.putExtra(r1, r4)
            boolean r4 = r3 instanceof android.app.Activity
            if (r4 != 0) goto L1c
            r4 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r4)
        L1c:
            r3.startActivity(r0)
            return
    }

    private void toastFailure(java.lang.String r3, java.lang.Throwable r4) {
            r2 = this;
            java.lang.String r0 = r4.getMessage()
            if (r0 == 0) goto L10
            java.lang.String r1 = r0.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L14
        L10:
            java.lang.String r0 = r4.toString()
        L14:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r4 = ": "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r4 = 1
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r4)
            r3.show()
            return
    }

    private void writeExport(android.net.Uri r3) {
            r2 = this;
            android.content.ContentResolver r0 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L43
            java.lang.String r1 = "wt"
            java.io.OutputStream r3 = r0.openOutputStream(r3, r1)     // Catch: java.lang.Throwable -> L43
            if (r3 == 0) goto L30
            java.lang.String r0 = r2.pendingExportJson     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto L12
            java.lang.String r0 = "{}"
        L12:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L2e
            byte[] r0 = r0.getBytes(r1)     // Catch: java.lang.Throwable -> L2e
            r3.write(r0)     // Catch: java.lang.Throwable -> L2e
            r3.flush()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = "Controller profile exported."
            r1 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)     // Catch: java.lang.Throwable -> L2e
            r0.show()     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L49
            r3.close()     // Catch: java.lang.Throwable -> L43
            goto L49
        L2e:
            r0 = move-exception
            goto L38
        L30:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "Unable to open export file."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2e
            throw r0     // Catch: java.lang.Throwable -> L2e
        L38:
            if (r3 == 0) goto L42
            r3.close()     // Catch: java.lang.Throwable -> L3e
            goto L42
        L3e:
            r3 = move-exception
            r0.addSuppressed(r3)     // Catch: java.lang.Throwable -> L43
        L42:
            throw r0     // Catch: java.lang.Throwable -> L43
        L43:
            r3 = move-exception
            java.lang.String r0 = "Controller export failed"
            r2.toastFailure(r0, r3)
        L49:
            r2.finish()
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int r2, int r3, android.content.Intent r4) {
            r1 = this;
            super.onActivityResult(r2, r3, r4)
            r0 = -1
            if (r3 != r0) goto L27
            if (r4 == 0) goto L27
            android.net.Uri r3 = r4.getData()
            if (r3 != 0) goto Lf
            goto L27
        Lf:
            android.net.Uri r3 = r4.getData()
            r4 = 4101(0x1005, float:5.747E-42)
            if (r2 != r4) goto L1b
            r1.writeExport(r3)
            goto L26
        L1b:
            r4 = 4102(0x1006, float:5.748E-42)
            if (r2 != r4) goto L23
            r1.readImport(r3)
            goto L26
        L23:
            r1.finish()
        L26:
            return
        L27:
            r1.finish()
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(android.os.Bundle r6) {
            r5 = this;
            super.onCreate(r6)
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "ca.dnamobile.javalauncher.input.extra.PROFILE_KEY"
            java.lang.String r0 = r0.getStringExtra(r1)
            r5.profileKey = r0
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r5)
            java.lang.String r1 = "Opening controller profile picker…"
            r0.setText(r1)
            r1 = 17
            r0.setGravity(r1)
            r1 = 1103101952(0x41c00000, float:24.0)
            int r2 = dp(r5, r1)
            int r3 = dp(r5, r1)
            int r4 = dp(r5, r1)
            int r1 = dp(r5, r1)
            r0.setPadding(r2, r3, r4, r1)
            r5.setContentView(r0)
            if (r6 != 0) goto L3b
            r5.launchRequestedPicker()
        L3b:
            return
    }
}
