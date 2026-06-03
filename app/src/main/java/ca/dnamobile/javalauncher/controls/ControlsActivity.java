package ca.dnamobile.javalauncher.controls;

/* JADX INFO: loaded from: classes.dex */
public final class ControlsActivity extends androidx.appcompat.app.AppCompatActivity {
    private static final int REQUEST_EXPORT_CONTROLS = 9012;
    private static final int REQUEST_IMPORT_CONTROLS = 9011;
    private android.widget.ArrayAdapter<java.lang.String> adapter;
    private final java.util.ArrayList<java.io.File> layoutFiles;
    private android.widget.ListView listView;
    private java.io.File pendingExportFile;
    private android.widget.TextView summary;

    public static /* synthetic */ void $r8$lambda$0OL_l60EOYrcJwKr9jmt8FNnBpI(ca.dnamobile.javalauncher.controls.ControlsActivity r0, java.io.File r1, android.content.DialogInterface r2, int r3) {
            r0.lambda$confirmDelete$7(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$B5aCOuNG7WB7bdw6jFDJhsFMUrg(ca.dnamobile.javalauncher.controls.ControlsActivity r0, int r1, java.io.File r2, android.content.DialogInterface r3, int r4) {
            r0.lambda$showLayoutOptions$5(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void $r8$lambda$Et9aDl1eT5pYMF04JJsuTbyebb4(ca.dnamobile.javalauncher.controls.ControlsActivity r0, android.view.View r1) {
            r0.lambda$onCreate$0(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$I26kaawIIPF5-ZHPK3AIE-_ead0, reason: not valid java name */
    public static /* synthetic */ void m407$r8$lambda$I26kaawIIPF5ZHPK3AIE_ead0(ca.dnamobile.javalauncher.controls.ControlsActivity r0, android.view.View r1) {
            r0.lambda$onCreate$2(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$gQ1RMl6LB0dx3TMKu5HBvHFV8QU(ca.dnamobile.javalauncher.controls.ControlsActivity r0, android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0.lambda$onCreate$3(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void $r8$lambda$mKdxf9BBDVns0egmLIlSXlJe98U(ca.dnamobile.javalauncher.controls.ControlsActivity r0, android.app.AlertDialog r1, android.content.DialogInterface r2) {
            r0.lambda$showLayoutOptions$6(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$qtnljby7m38f35ZA3pLjWIM02R4(ca.dnamobile.javalauncher.controls.ControlsActivity r0) {
            r0.enableImmersiveSafely()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$u-pslKvg8OOC9ZeCTChcgQeXtqc, reason: not valid java name */
    public static /* synthetic */ void m408$r8$lambda$upslKvg8OOC9ZeCTChcgQeXtqc(ca.dnamobile.javalauncher.controls.ControlsActivity r0, android.view.View r1) {
            r0.lambda$onCreate$1(r1)
            return
    }

    public static /* synthetic */ boolean $r8$lambda$xVAHB12SskmTsCFDIvi34xn9TG0(ca.dnamobile.javalauncher.controls.ControlsActivity r0, android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            boolean r0 = r0.lambda$onCreate$4(r1, r2, r3, r4)
            return r0
    }

    public ControlsActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.layoutFiles = r0
            return
    }

    private android.widget.Button actionButton(java.lang.String r2) {
            r1 = this;
            android.widget.Button r0 = new android.widget.Button
            r0.<init>(r1)
            r0.setText(r2)
            r2 = 0
            r0.setAllCaps(r2)
            return r0
    }

    private void confirmDelete(java.io.File r4) {
            r3 = this;
            java.io.File r0 = ca.dnamobile.javalauncher.controls.TouchControlsStore.getDefaultLayoutFile(r3)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L15
            java.lang.String r4 = "Default layout cannot be deleted."
            r0 = 0
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r0)
            r4.show()
            return
        L15:
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r3)
            java.lang.String r1 = "Delete layout?"
            android.app.AlertDialog$Builder r0 = r0.setTitle(r1)
            java.lang.String r1 = r4.getName()
            android.app.AlertDialog$Builder r0 = r0.setMessage(r1)
            r1 = 17039360(0x1040000, float:2.424457E-38)
            r2 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            ca.dnamobile.javalauncher.controls.ControlsActivity$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.controls.ControlsActivity$$ExternalSyntheticLambda0
            r1.<init>(r3, r4)
            java.lang.String r4 = "Delete"
            android.app.AlertDialog$Builder r4 = r0.setPositiveButton(r4, r1)
            r4.show()
            return
    }

    private int dp(float r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r2 = r2 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r0
            int r2 = (int) r2
            return r2
    }

    private void enableImmersiveSafely() {
            r3 = this;
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r3)     // Catch: java.lang.Throwable -> L4
            goto Lc
        L4:
            r0 = move-exception
            java.lang.String r1 = "ControlsActivity"
            java.lang.String r2 = "Unable to enable immersive mode"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r2, r0)
        Lc:
            return
    }

    private void handleExportResult(int r4, android.content.Intent r5) {
            r3 = this;
            java.lang.String r0 = "Exported "
            java.io.File r1 = r3.pendingExportFile
            r2 = 0
            r3.pendingExportFile = r2
            r2 = -1
            if (r4 != r2) goto L8d
            if (r5 == 0) goto L8d
            android.net.Uri r4 = r5.getData()
            if (r4 == 0) goto L8d
            if (r1 != 0) goto L16
            goto L8d
        L16:
            android.net.Uri r4 = r5.getData()
            android.content.ContentResolver r5 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r2 = "wt"
            java.io.OutputStream r4 = r5.openOutputStream(r4, r2)     // Catch: java.lang.Throwable -> L6a
            if (r4 == 0) goto L57
            java.lang.String r5 = ca.dnamobile.javalauncher.controls.TouchControlsStore.readText(r1)     // Catch: java.lang.Throwable -> L55
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L55
            byte[] r5 = r5.getBytes(r2)     // Catch: java.lang.Throwable -> L55
            r4.write(r5)     // Catch: java.lang.Throwable -> L55
            r4.flush()     // Catch: java.lang.Throwable -> L55
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L55
            java.lang.String r0 = r1.getName()     // Catch: java.lang.Throwable -> L55
            java.lang.StringBuilder r5 = r5.append(r0)     // Catch: java.lang.Throwable -> L55
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L55
            r0 = 0
            android.widget.Toast r5 = android.widget.Toast.makeText(r3, r5, r0)     // Catch: java.lang.Throwable -> L55
            r5.show()     // Catch: java.lang.Throwable -> L55
            if (r4 == 0) goto L8d
            r4.close()     // Catch: java.lang.Throwable -> L6a
            goto L8d
        L55:
            r5 = move-exception
            goto L5f
        L57:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L55
            java.lang.String r0 = "Unable to open export destination."
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L55
            throw r5     // Catch: java.lang.Throwable -> L55
        L5f:
            if (r4 == 0) goto L69
            r4.close()     // Catch: java.lang.Throwable -> L65
            goto L69
        L65:
            r4 = move-exception
            r5.addSuppressed(r4)     // Catch: java.lang.Throwable -> L6a
        L69:
            throw r5     // Catch: java.lang.Throwable -> L6a
        L6a:
            r4 = move-exception
            java.lang.String r5 = "ControlsActivity"
            java.lang.String r0 = "Unable to export controls"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r5, r0, r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Export failed: "
            r5.<init>(r0)
            java.lang.String r4 = r4.getMessage()
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r4 = r4.toString()
            r5 = 1
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r5)
            r4.show()
        L8d:
            return
    }

    private void handleImportResult(int r3, android.content.Intent r4) {
            r2 = this;
            java.lang.String r0 = "Imported "
            r1 = -1
            if (r3 != r1) goto L5d
            if (r4 == 0) goto L5d
            android.net.Uri r3 = r4.getData()
            if (r3 != 0) goto Le
            goto L5d
        Le:
            android.net.Uri r3 = r4.getData()
            r4 = 1
            android.content.ContentResolver r1 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L1a
            r1.takePersistableUriPermission(r3, r4)     // Catch: java.lang.Throwable -> L1a
        L1a:
            java.io.File r3 = ca.dnamobile.javalauncher.controls.TouchControlsStore.saveImportedLayout(r2, r3)     // Catch: java.lang.Throwable -> L3b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L3b
            java.lang.StringBuilder r3 = r1.append(r3)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L3b
            r0 = 0
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r0)     // Catch: java.lang.Throwable -> L3b
            r3.show()     // Catch: java.lang.Throwable -> L3b
            r2.refreshList()     // Catch: java.lang.Throwable -> L3b
            goto L5d
        L3b:
            r3 = move-exception
            java.lang.String r0 = "ControlsActivity"
            java.lang.String r1 = "Unable to import controls"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r1, r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Import failed: "
            r0.<init>(r1)
            java.lang.String r3 = r3.getMessage()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r4)
            r3.show()
        L5d:
            return
    }

    private /* synthetic */ void lambda$confirmDelete$7(java.io.File r1, android.content.DialogInterface r2, int r3) {
            r0 = this;
            r1.delete()
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.String r2 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getSelectedLayoutPath(r0)
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L1c
            java.io.File r1 = ca.dnamobile.javalauncher.controls.TouchControlsStore.getDefaultLayoutFile(r0)
            java.lang.String r1 = r1.getAbsolutePath()
            ca.dnamobile.javalauncher.controls.ControlsPreferences.setSelectedLayoutPath(r0, r1)
        L1c:
            r0.refreshList()
            return
    }

    private /* synthetic */ void lambda$onCreate$0(android.view.View r1) {
            r0 = this;
            r0.openImportPicker()
            return
    }

    private /* synthetic */ void lambda$onCreate$1(android.view.View r2) {
            r1 = this;
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<ca.dnamobile.javalauncher.controls.ControlsEditorActivity> r0 = ca.dnamobile.javalauncher.controls.ControlsEditorActivity.class
            r2.<init>(r1, r0)
            r1.startActivity(r2)
            return
    }

    private /* synthetic */ void lambda$onCreate$2(android.view.View r1) {
            r0 = this;
            r0.finish()
            return
    }

    private /* synthetic */ void lambda$onCreate$3(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            r0.selectLayout(r3)
            return
    }

    private /* synthetic */ boolean lambda$onCreate$4(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            r0.showLayoutOptions(r3)
            r1 = 1
            return r1
    }

    private /* synthetic */ void lambda$showLayoutOptions$5(int r1, java.io.File r2, android.content.DialogInterface r3, int r4) {
            r0 = this;
            if (r4 != 0) goto L5
            r0.selectLayout(r1)
        L5:
            r1 = 1
            if (r4 != r1) goto L19
            java.lang.String r1 = r2.getAbsolutePath()
            ca.dnamobile.javalauncher.controls.ControlsPreferences.setSelectedLayoutPath(r0, r1)
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<ca.dnamobile.javalauncher.controls.ControlsEditorActivity> r3 = ca.dnamobile.javalauncher.controls.ControlsEditorActivity.class
            r1.<init>(r0, r3)
            r0.startActivity(r1)
        L19:
            r1 = 2
            if (r4 != r1) goto L1f
            r0.openExportPicker(r2)
        L1f:
            r1 = 3
            if (r4 != r1) goto L25
            r0.confirmDelete(r2)
        L25:
            return
    }

    private /* synthetic */ void lambda$showLayoutOptions$6(android.app.AlertDialog r1, android.content.DialogInterface r2) {
            r0 = this;
            android.view.Window r2 = r1.getWindow()
            if (r2 == 0) goto L11
            android.view.Window r1 = r1.getWindow()
            android.graphics.drawable.GradientDrawable r2 = r0.makeDialogBackground()
            r1.setBackgroundDrawable(r2)
        L11:
            return
    }

    private android.graphics.drawable.GradientDrawable makeDialogBackground() {
            r3 = this;
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r1 = -299884252(0xffffffffee202124, float:-1.2389417E28)
            r0.setColor(r1)
            r1 = 1102053376(0x41b00000, float:22.0)
            int r1 = r3.dp(r1)
            float r1 = (float) r1
            r0.setCornerRadius(r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = r3.dp(r1)
            r2 = 1
            int r1 = java.lang.Math.max(r2, r1)
            r2 = 1157627903(0x44ffffff, float:2047.9999)
            r0.setStroke(r1, r2)
            return r0
    }

    private android.graphics.drawable.GradientDrawable makePanelBackground() {
            r3 = this;
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r1 = -300213216(0xffffffffee1b1c20, float:-1.2001044E28)
            r0.setColor(r1)
            r1 = 1099956224(0x41900000, float:18.0)
            int r1 = r3.dp(r1)
            float r1 = (float) r1
            r0.setCornerRadius(r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = r3.dp(r1)
            r2 = 1
            int r1 = java.lang.Math.max(r2, r1)
            r2 = 872415231(0x33ffffff, float:1.1920928E-7)
            r0.setStroke(r1, r2)
            return r0
    }

    private void openExportPicker(java.io.File r3) {
            r2 = this;
            r2.pendingExportFile = r3
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.CREATE_DOCUMENT"
            r0.<init>(r1)
            java.lang.String r1 = "android.intent.category.OPENABLE"
            r0.addCategory(r1)
            java.lang.String r1 = "application/json"
            r0.setType(r1)
            java.lang.String r1 = "android.intent.extra.TITLE"
            java.lang.String r3 = safeExportName(r3)
            r0.putExtra(r1, r3)
            r3 = 3
            r0.addFlags(r3)
            r3 = 9012(0x2334, float:1.2629E-41)
            r2.startActivityForResult(r0, r3)     // Catch: android.content.ActivityNotFoundException -> L26
            goto L33
        L26:
            r3 = 0
            r2.pendingExportFile = r3
            java.lang.String r3 = "No file picker found."
            r0 = 1
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r0)
            r3.show()
        L33:
            return
    }

    private void openImportPicker() {
            r2 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.OPEN_DOCUMENT"
            r0.<init>(r1)
            java.lang.String r1 = "android.intent.category.OPENABLE"
            r0.addCategory(r1)
            java.lang.String r1 = "application/json"
            r0.setType(r1)
            r1 = 65
            r0.addFlags(r1)
            r1 = 9011(0x2333, float:1.2627E-41)
            r2.startActivityForResult(r0, r1)     // Catch: android.content.ActivityNotFoundException -> L1c
            goto L26
        L1c:
            java.lang.String r0 = "No file picker found."
            r1 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
        L26:
            return
    }

    private void refreshList() {
            r7 = this;
            java.util.ArrayList<java.io.File> r0 = r7.layoutFiles
            r0.clear()
            java.util.ArrayList<java.io.File> r0 = r7.layoutFiles
            java.util.List r1 = ca.dnamobile.javalauncher.controls.TouchControlsStore.listLayouts(r7)
            r0.addAll(r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getSelectedLayoutPath(r7)
            java.util.ArrayList<java.io.File> r2 = r7.layoutFiles
            java.util.Iterator r2 = r2.iterator()
        L1d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L61
            java.lang.Object r3 = r2.next()
            java.io.File r3 = (java.io.File) r3
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r4 = ca.dnamobile.javalauncher.controls.TouchControlsStore.loadLayout(r3)
            java.lang.String r5 = r3.getAbsolutePath()
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L3a
            java.lang.String r5 = "✓ "
            goto L3c
        L3a:
            java.lang.String r5 = "   "
        L3c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.String r4 = r4.name
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r5 = "\n"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            r0.add(r3)
            goto L1d
        L61:
            android.widget.ArrayAdapter<java.lang.String> r1 = r7.adapter
            r1.clear()
            android.widget.ArrayAdapter<java.lang.String> r1 = r7.adapter
            r1.addAll(r0)
            android.widget.ArrayAdapter<java.lang.String> r0 = r7.adapter
            r0.notifyDataSetChanged()
            android.widget.TextView r0 = r7.summary
            java.lang.String r1 = "Select a layout, long-press for options. Import/export uses JSON layouts compatible with JavaLauncher, controls mimmick how other launcher's work."
            r0.setText(r1)
            return
    }

    private static java.lang.String safeExportName(java.io.File r2) {
            java.lang.String r2 = r2.getName()
            java.lang.String r0 = r2.toLowerCase()
            java.lang.String r1 = ".json"
            boolean r0 = r0.endsWith(r1)
            if (r0 != 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r2 = r2.toString()
        L21:
            java.lang.String r0 = "[^A-Za-z0-9._-]+"
            java.lang.String r1 = "_"
            java.lang.String r2 = r2.replaceAll(r0, r1)
            return r2
    }

    private void selectLayout(int r3) {
            r2 = this;
            if (r3 < 0) goto L38
            java.util.ArrayList<java.io.File> r0 = r2.layoutFiles
            int r0 = r0.size()
            if (r3 < r0) goto Lb
            goto L38
        Lb:
            java.util.ArrayList<java.io.File> r0 = r2.layoutFiles
            java.lang.Object r3 = r0.get(r3)
            java.io.File r3 = (java.io.File) r3
            java.lang.String r0 = r3.getAbsolutePath()
            ca.dnamobile.javalauncher.controls.ControlsPreferences.setSelectedLayoutPath(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Selected "
            r0.<init>(r1)
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r0 = 0
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r0)
            r3.show()
            r2.refreshList()
        L38:
            return
    }

    private void showLayoutOptions(int r5) {
            r4 = this;
            if (r5 < 0) goto L4f
            java.util.ArrayList<java.io.File> r0 = r4.layoutFiles
            int r0 = r0.size()
            if (r5 < r0) goto Lb
            goto L4f
        Lb:
            java.util.ArrayList<java.io.File> r0 = r4.layoutFiles
            java.lang.Object r0 = r0.get(r5)
            java.io.File r0 = (java.io.File) r0
            r1 = 4
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            java.lang.String r3 = "Use this layout"
            r1[r2] = r3
            r2 = 1
            java.lang.String r3 = "Edit"
            r1[r2] = r3
            r2 = 2
            java.lang.String r3 = "Export JSON"
            r1[r2] = r3
            r2 = 3
            java.lang.String r3 = "Delete"
            r1[r2] = r3
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            r2.<init>(r4)
            java.lang.String r3 = r0.getName()
            android.app.AlertDialog$Builder r2 = r2.setTitle(r3)
            ca.dnamobile.javalauncher.controls.ControlsActivity$$ExternalSyntheticLambda2 r3 = new ca.dnamobile.javalauncher.controls.ControlsActivity$$ExternalSyntheticLambda2
            r3.<init>(r4, r5, r0)
            android.app.AlertDialog$Builder r5 = r2.setItems(r1, r3)
            android.app.AlertDialog r5 = r5.create()
            ca.dnamobile.javalauncher.controls.ControlsActivity$$ExternalSyntheticLambda3 r0 = new ca.dnamobile.javalauncher.controls.ControlsActivity$$ExternalSyntheticLambda3
            r0.<init>(r4, r5)
            r5.setOnShowListener(r0)
            r5.show()
        L4f:
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int r2, int r3, android.content.Intent r4) {
            r1 = this;
            super.onActivityResult(r2, r3, r4)
            r0 = 9011(0x2333, float:1.2627E-41)
            if (r2 != r0) goto Lb
            r1.handleImportResult(r3, r4)
            return
        Lb:
            r0 = 9012(0x2334, float:1.2629E-41)
            if (r2 != r0) goto L12
            r1.handleExportResult(r3, r4)
        L12:
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(android.os.Bundle r8) {
            r7 = this;
            super.onCreate(r8)
            android.widget.LinearLayout r8 = new android.widget.LinearLayout
            r8.<init>(r7)
            r0 = 1
            r8.setOrientation(r0)
            r0 = 1098907648(0x41800000, float:16.0)
            int r0 = r7.dp(r0)
            r8.setPadding(r0, r0, r0, r0)
            r0 = -15724268(0xffffffffff101114, float:-1.914975E38)
            r8.setBackgroundColor(r0)
            r7.setContentView(r8)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r7)
            java.lang.String r1 = "Touch Controls"
            r0.setText(r1)
            r1 = -1
            r0.setTextColor(r1)
            r2 = 1103101952(0x41c00000, float:24.0)
            r0.setTextSize(r2)
            r2 = 8388611(0x800003, float:1.1754948E-38)
            r0.setGravity(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = -2
            r2.<init>(r1, r3)
            r8.addView(r0, r2)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r7)
            r7.summary = r0
            r2 = 1096810496(0x41600000, float:14.0)
            r0.setTextSize(r2)
            android.widget.TextView r0 = r7.summary
            r2 = -4342339(0xffffffffffbdbdbd, float:NaN)
            r0.setTextColor(r2)
            android.widget.TextView r0 = r7.summary
            r2 = 1082130432(0x40800000, float:4.0)
            int r2 = r7.dp(r2)
            r4 = 1092616192(0x41200000, float:10.0)
            int r5 = r7.dp(r4)
            r6 = 0
            r0.setPadding(r6, r2, r6, r5)
            android.widget.TextView r0 = r7.summary
            r8.addView(r0)
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r7)
            r0.setOrientation(r6)
            int r2 = r7.dp(r4)
            r0.setPadding(r6, r6, r6, r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r1, r3)
            r8.addView(r0, r2)
            java.lang.String r2 = "Import"
            android.widget.Button r2 = r7.actionButton(r2)
            ca.dnamobile.javalauncher.controls.ControlsActivity$$ExternalSyntheticLambda4 r4 = new ca.dnamobile.javalauncher.controls.ControlsActivity$$ExternalSyntheticLambda4
            r4.<init>(r7)
            r2.setOnClickListener(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = 1065353216(0x3f800000, float:1.0)
            r4.<init>(r6, r3, r5)
            r0.addView(r2, r4)
            java.lang.String r2 = "Edit Current"
            android.widget.Button r2 = r7.actionButton(r2)
            ca.dnamobile.javalauncher.controls.ControlsActivity$$ExternalSyntheticLambda5 r4 = new ca.dnamobile.javalauncher.controls.ControlsActivity$$ExternalSyntheticLambda5
            r4.<init>(r7)
            r2.setOnClickListener(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r4.<init>(r6, r3, r5)
            r0.addView(r2, r4)
            java.lang.String r2 = "Close"
            android.widget.Button r2 = r7.actionButton(r2)
            ca.dnamobile.javalauncher.controls.ControlsActivity$$ExternalSyntheticLambda6 r4 = new ca.dnamobile.javalauncher.controls.ControlsActivity$$ExternalSyntheticLambda6
            r4.<init>(r7)
            r2.setOnClickListener(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r4.<init>(r6, r3, r5)
            r0.addView(r2, r4)
            android.widget.ListView r0 = new android.widget.ListView
            r0.<init>(r7)
            r7.listView = r0
            android.graphics.drawable.GradientDrawable r2 = r7.makePanelBackground()
            r0.setBackground(r2)
            android.widget.ArrayAdapter r0 = new android.widget.ArrayAdapter
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 17367043(0x1090003, float:2.5162934E-38)
            r0.<init>(r7, r3, r2)
            r7.adapter = r0
            android.widget.ListView r2 = r7.listView
            r2.setAdapter(r0)
            android.widget.ListView r0 = r7.listView
            ca.dnamobile.javalauncher.controls.ControlsActivity$$ExternalSyntheticLambda7 r2 = new ca.dnamobile.javalauncher.controls.ControlsActivity$$ExternalSyntheticLambda7
            r2.<init>(r7)
            r0.setOnItemClickListener(r2)
            android.widget.ListView r0 = r7.listView
            ca.dnamobile.javalauncher.controls.ControlsActivity$$ExternalSyntheticLambda8 r2 = new ca.dnamobile.javalauncher.controls.ControlsActivity$$ExternalSyntheticLambda8
            r2.<init>(r7)
            r0.setOnItemLongClickListener(r2)
            android.widget.ListView r0 = r7.listView
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r1, r6, r5)
            r8.addView(r0, r2)
            r7.refreshList()
            ca.dnamobile.javalauncher.controls.ControlsActivity$$ExternalSyntheticLambda1 r0 = new ca.dnamobile.javalauncher.controls.ControlsActivity$$ExternalSyntheticLambda1
            r0.<init>(r7)
            r8.post(r0)
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
            r2 = this;
            super.onResume()
            android.widget.ListView r0 = r2.listView
            if (r0 == 0) goto L10
            ca.dnamobile.javalauncher.controls.ControlsActivity$$ExternalSyntheticLambda1 r1 = new ca.dnamobile.javalauncher.controls.ControlsActivity$$ExternalSyntheticLambda1
            r1.<init>(r2)
            r0.post(r1)
            goto L13
        L10:
            r2.enableImmersiveSafely()
        L13:
            r2.refreshList()
            return
    }
}
