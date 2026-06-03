package ca.dnamobile.javalauncher.storage;

/* JADX INFO: loaded from: classes.dex */
public final class StorageLocationDialog {


    public interface Listener {
        void onAddLocationRequested();

        void onDeleteLocationRequested(ca.dnamobile.javalauncher.storage.StorageLocation r1);

        void onLocationSelected(ca.dnamobile.javalauncher.storage.StorageLocation r1);
    }

    private StorageLocationDialog() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.view.View createActions(android.app.Activity r7, androidx.appcompat.app.AlertDialog r8, ca.dnamobile.javalauncher.storage.StorageLocationDialog.Listener r9) {
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r7)
            r1 = 0
            r0.setOrientation(r1)
            r2 = 8388629(0x800015, float:1.1754973E-38)
            r0.setGravity(r2)
            r2 = 10
            int r3 = dp(r7, r2)
            r0.setPadding(r1, r3, r1, r1)
            com.google.android.material.button.MaterialButton r3 = new com.google.android.material.button.MaterialButton
            r3.<init>(r7)
            r4 = 17039360(0x1040000, float:2.424457E-38)
            r3.setText(r4)
            ca.dnamobile.javalauncher.storage.StorageLocationDialog$$ExternalSyntheticLambda1 r4 = new ca.dnamobile.javalauncher.storage.StorageLocationDialog$$ExternalSyntheticLambda1
            r4.<init>(r8)
            r3.setOnClickListener(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = -2
            r6 = 1065353216(0x3f800000, float:1.0)
            r4.<init>(r1, r5, r6)
            r0.addView(r3, r4)
            com.google.android.material.button.MaterialButton r3 = new com.google.android.material.button.MaterialButton
            r3.<init>(r7)
            int r4 = ca.dnamobile.javalauncher.R.string.button_add_storage_location
            r3.setText(r4)
            int r4 = ca.dnamobile.javalauncher.R.drawable.ic_folder_24
            r3.setIconResource(r4)
            r4 = 2
            r3.setIconGravity(r4)
            ca.dnamobile.javalauncher.storage.StorageLocationDialog$$ExternalSyntheticLambda2 r4 = new ca.dnamobile.javalauncher.storage.StorageLocationDialog$$ExternalSyntheticLambda2
            r4.<init>(r8, r9)
            r3.setOnClickListener(r4)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r8.<init>(r1, r5, r6)
            int r7 = dp(r7, r2)
            r8.setMargins(r7, r1, r1, r1)
            r0.addView(r3, r8)
            return r0
    }

    private static android.view.View createHeader(android.app.Activity r9) {
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r9)
            r1 = 0
            r0.setOrientation(r1)
            r2 = 16
            r0.setGravity(r2)
            r3 = 18
            int r4 = dp(r9, r3)
            r0.setPadding(r1, r1, r1, r4)
            android.widget.ImageView r4 = new android.widget.ImageView
            r4.<init>(r9)
            int r5 = ca.dnamobile.javalauncher.R.drawable.ic_folder_24
            r4.setImageResource(r5)
            r5 = 13
            int r6 = dp(r9, r5)
            int r7 = dp(r9, r5)
            int r8 = dp(r9, r5)
            int r5 = dp(r9, r5)
            r4.setPadding(r6, r7, r8, r5)
            android.graphics.drawable.GradientDrawable r5 = new android.graphics.drawable.GradientDrawable
            r5.<init>()
            int r3 = dp(r9, r3)
            float r3 = (float) r3
            r5.setCornerRadius(r3)
            r3 = -14670805(0xffffffffff20242b, float:-2.1286427E38)
            r5.setColor(r3)
            r4.setBackground(r5)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r5 = 78
            int r6 = dp(r9, r5)
            int r5 = dp(r9, r5)
            r3.<init>(r6, r5)
            r0.addView(r4, r3)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r9)
            r4 = 1
            r3.setOrientation(r4)
            int r2 = dp(r9, r2)
            r3.setPadding(r2, r1, r1, r1)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r9)
            int r5 = ca.dnamobile.javalauncher.R.string.storage_locations_title
            r2.setText(r5)
            r5 = 1102053376(0x41b00000, float:22.0)
            r2.setTextSize(r5)
            android.graphics.Typeface r5 = r2.getTypeface()
            r2.setTypeface(r5, r4)
            android.widget.LinearLayout$LayoutParams r4 = matchWrap()
            r3.addView(r2, r4)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r9)
            int r4 = ca.dnamobile.javalauncher.R.string.storage_locations_summary
            r2.setText(r4)
            r4 = 1095761920(0x41500000, float:13.0)
            r2.setTextSize(r4)
            r4 = 4
            int r9 = dp(r9, r4)
            r2.setPadding(r1, r9, r1, r1)
            android.widget.LinearLayout$LayoutParams r9 = matchWrap()
            r3.addView(r2, r9)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r2 = -2
            r4 = 1065353216(0x3f800000, float:1.0)
            r9.<init>(r1, r2, r4)
            r0.addView(r3, r9)
            return r0
    }

    private static android.view.View createLocationSection(android.app.Activity r6, ca.dnamobile.javalauncher.storage.StorageLocationDialog.Listener r7, androidx.appcompat.app.AlertDialog[] r8) {
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r6)
            r1 = 1
            r0.setOrientation(r1)
            r2 = 4
            int r3 = dp(r6, r2)
            r4 = 10
            int r4 = dp(r6, r4)
            r5 = 0
            r0.setPadding(r5, r3, r5, r4)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r6)
            int r4 = ca.dnamobile.javalauncher.R.string.storage_locations_choose_title
            r3.setText(r4)
            r4 = 1097859072(0x41700000, float:15.0)
            r3.setTextSize(r4)
            android.graphics.Typeface r4 = r3.getTypeface()
            r3.setTypeface(r4, r1)
            android.widget.LinearLayout$LayoutParams r1 = matchWrap()
            r0.addView(r3, r1)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r6)
            int r3 = ca.dnamobile.javalauncher.R.string.storage_locations_choose_summary
            r1.setText(r3)
            r3 = 1094713344(0x41400000, float:12.0)
            r1.setTextSize(r3)
            r3 = 2
            int r3 = dp(r6, r3)
            r4 = 8
            int r4 = dp(r6, r4)
            r1.setPadding(r5, r3, r5, r4)
            android.widget.LinearLayout$LayoutParams r3 = matchWrap()
            r0.addView(r1, r3)
            androidx.recyclerview.widget.RecyclerView r1 = new androidx.recyclerview.widget.RecyclerView
            r1.<init>(r6)
            androidx.recyclerview.widget.LinearLayoutManager r3 = new androidx.recyclerview.widget.LinearLayoutManager
            r3.<init>(r6)
            r1.setLayoutManager(r3)
            r1.setNestedScrollingEnabled(r5)
            ca.dnamobile.javalauncher.storage.StorageLocationAdapter r3 = new ca.dnamobile.javalauncher.storage.StorageLocationAdapter
            ca.dnamobile.javalauncher.storage.StorageLocationDialog$1 r4 = new ca.dnamobile.javalauncher.storage.StorageLocationDialog$1
            r4.<init>(r6, r8, r7)
            r3.<init>(r4)
            java.util.List r7 = ca.dnamobile.javalauncher.storage.StorageLocationStore.getLocations(r6)
            java.lang.String r8 = ca.dnamobile.javalauncher.storage.StorageLocationStore.getSelectedLocationId(r6)
            r3.submit(r7, r8)
            r1.setAdapter(r3)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r8 = 270(0x10e, float:3.78E-43)
            int r8 = dp(r6, r8)
            r3 = -1
            r7.<init>(r3, r8)
            int r6 = dp(r6, r2)
            r7.topMargin = r6
            r0.addView(r1, r7)
            return r0
    }

    private static int dp(android.app.Activity r0, int r1) {
            float r1 = (float) r1
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            int r0 = java.lang.Math.round(r1)
            return r0
    }

    static /* synthetic */ void lambda$createActions$1(androidx.appcompat.app.AlertDialog r0, android.view.View r1) {
            r0.dismiss()
            return
    }

    static /* synthetic */ void lambda$createActions$2(androidx.appcompat.app.AlertDialog r0, ca.dnamobile.javalauncher.storage.StorageLocationDialog.Listener r1, android.view.View r2) {
            r0.dismiss()
            r1.onAddLocationRequested()
            return
    }

    static /* synthetic */ void lambda$show$0(androidx.appcompat.app.AlertDialog r0, android.content.DialogInterface r1) {
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto Lc
            r1 = 17170445(0x106000d, float:2.461195E-38)
            r0.setBackgroundDrawableResource(r1)
        Lc:
            return
    }

    private static android.widget.LinearLayout.LayoutParams matchWrap() {
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
            return r0
    }

    public static void show(android.app.Activity r10, ca.dnamobile.javalauncher.storage.StorageLocationDialog.Listener r11) {
            android.widget.ScrollView r0 = new android.widget.ScrollView
            r0.<init>(r10)
            r1 = 0
            r0.setFillViewport(r1)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r10)
            r3 = 1
            r2.setOrientation(r3)
            r4 = 4
            int r5 = dp(r10, r4)
            int r6 = dp(r10, r4)
            int r7 = dp(r10, r4)
            int r4 = dp(r10, r4)
            r2.setPadding(r5, r6, r7, r4)
            r0.addView(r2)
            com.google.android.material.card.MaterialCardView r4 = new com.google.android.material.card.MaterialCardView
            r4.<init>(r10)
            r5 = 26
            int r5 = dp(r10, r5)
            float r5 = (float) r5
            r4.setRadius(r5)
            r5 = 8
            int r5 = dp(r10, r5)
            float r5 = (float) r5
            r4.setCardElevation(r5)
            r4.setUseCompatPadding(r3)
            r4.setPreventCornerOverlap(r3)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r10)
            r5.setOrientation(r3)
            r6 = 22
            int r7 = dp(r10, r6)
            r8 = 20
            int r8 = dp(r10, r8)
            int r6 = dp(r10, r6)
            r9 = 18
            int r9 = dp(r10, r9)
            r5.setPadding(r7, r8, r6, r9)
            android.widget.LinearLayout$LayoutParams r6 = matchWrap()
            r4.addView(r5, r6)
            androidx.appcompat.app.AlertDialog[] r3 = new androidx.appcompat.app.AlertDialog[r3]
            android.view.View r6 = createHeader(r10)
            r5.addView(r6)
            android.view.View r6 = createLocationSection(r10, r11, r3)
            android.widget.LinearLayout$LayoutParams r7 = matchWrap()
            r5.addView(r6, r7)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r6 = new com.google.android.material.dialog.MaterialAlertDialogBuilder
            r6.<init>(r10)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r0 = r6.setView(r0)
            androidx.appcompat.app.AlertDialog r0 = r0.create()
            r3[r1] = r0
            android.view.View r10 = createActions(r10, r0, r11)
            android.widget.LinearLayout$LayoutParams r11 = matchWrap()
            r5.addView(r10, r11)
            android.widget.LinearLayout$LayoutParams r10 = matchWrap()
            r2.addView(r4, r10)
            ca.dnamobile.javalauncher.storage.StorageLocationDialog$$ExternalSyntheticLambda0 r10 = new ca.dnamobile.javalauncher.storage.StorageLocationDialog$$ExternalSyntheticLambda0
            r10.<init>(r0)
            r0.setOnShowListener(r10)
            r0.show()
            return
    }
}
