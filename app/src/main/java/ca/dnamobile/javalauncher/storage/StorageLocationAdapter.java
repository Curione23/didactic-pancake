package ca.dnamobile.javalauncher.storage;

/* JADX INFO: loaded from: classes.dex */
public final class StorageLocationAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<ca.dnamobile.javalauncher.storage.StorageLocationAdapter.ViewHolder> {
    private final ca.dnamobile.javalauncher.storage.StorageLocationAdapter.Listener listener;
    private final java.util.ArrayList<ca.dnamobile.javalauncher.storage.StorageLocation> locations;
    private java.lang.String selectedId;

    public interface Listener {
        void onLocationClicked(ca.dnamobile.javalauncher.storage.StorageLocation r1);

        void onLocationDeleteClicked(ca.dnamobile.javalauncher.storage.StorageLocation r1);
    }

    static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        final android.widget.ImageView deleteButton;
        final android.widget.RadioButton radio;
        final android.widget.TextView summary;
        final android.widget.TextView title;

        ViewHolder(android.view.View r1, android.widget.RadioButton r2, android.widget.TextView r3, android.widget.TextView r4, android.widget.ImageView r5) {
                r0 = this;
                r0.<init>(r1)
                r0.radio = r2
                r0.title = r3
                r0.summary = r4
                r0.deleteButton = r5
                return
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$9O-hFVhaF608KzqtKLlJy8y2hCQ, reason: not valid java name */
    public static /* synthetic */ void m568$r8$lambda$9OhFVhaF608KzqtKLlJy8y2hCQ(ca.dnamobile.javalauncher.storage.StorageLocationAdapter r0, ca.dnamobile.javalauncher.storage.StorageLocation r1, android.view.View r2) {
            r0.lambda$installRecursiveClickListener$1(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$Xtey4JDEVH7BWW_QK2X0ULeIB8Y(ca.dnamobile.javalauncher.storage.StorageLocationAdapter r0, ca.dnamobile.javalauncher.storage.StorageLocation r1, android.view.View r2) {
            r0.lambda$onBindViewHolder$0(r1, r2)
            return
    }

    public StorageLocationAdapter(ca.dnamobile.javalauncher.storage.StorageLocationAdapter.Listener r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.locations = r0
            java.lang.String r0 = "default"
            r1.selectedId = r0
            r1.listener = r2
            return
    }

    private static int dp(android.view.View r0, int r1) {
            float r1 = (float) r1
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            int r0 = java.lang.Math.round(r1)
            return r0
    }

    private void installRecursiveClickListener(android.view.View r3, ca.dnamobile.javalauncher.storage.StorageLocation r4, android.view.View r5) {
            r2 = this;
            if (r3 != r5) goto L3
            return
        L3:
            r0 = 1
            r3.setClickable(r0)
            ca.dnamobile.javalauncher.storage.StorageLocationAdapter$$ExternalSyntheticLambda0 r0 = new ca.dnamobile.javalauncher.storage.StorageLocationAdapter$$ExternalSyntheticLambda0
            r0.<init>(r2, r4)
            r3.setOnClickListener(r0)
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L26
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r0 = 0
        L16:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L26
            android.view.View r1 = r3.getChildAt(r0)
            r2.installRecursiveClickListener(r1, r4, r5)
            int r0 = r0 + 1
            goto L16
        L26:
            return
    }

    private /* synthetic */ void lambda$installRecursiveClickListener$1(ca.dnamobile.javalauncher.storage.StorageLocation r1, android.view.View r2) {
            r0 = this;
            r0.select(r1)
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$0(ca.dnamobile.javalauncher.storage.StorageLocation r1, android.view.View r2) {
            r0 = this;
            ca.dnamobile.javalauncher.storage.StorageLocationAdapter$Listener r2 = r0.listener
            r2.onLocationDeleteClicked(r1)
            return
    }

    private void select(ca.dnamobile.javalauncher.storage.StorageLocation r2) {
            r1 = this;
            java.lang.String r0 = r2.getId()
            r1.selectedId = r0
            r1.notifyDataSetChanged()
            ca.dnamobile.javalauncher.storage.StorageLocationAdapter$Listener r0 = r1.listener
            r0.onLocationClicked(r2)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
            r1 = this;
            java.util.ArrayList<ca.dnamobile.javalauncher.storage.StorageLocation> r0 = r1.locations
            int r0 = r0.size()
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
            r0 = this;
            ca.dnamobile.javalauncher.storage.StorageLocationAdapter$ViewHolder r1 = (ca.dnamobile.javalauncher.storage.StorageLocationAdapter.ViewHolder) r1
            r0.onBindViewHolder(r1, r2)
            return
    }

    public void onBindViewHolder(ca.dnamobile.javalauncher.storage.StorageLocationAdapter.ViewHolder r5, int r6) {
            r4 = this;
            java.util.ArrayList<ca.dnamobile.javalauncher.storage.StorageLocation> r0 = r4.locations
            java.lang.Object r6 = r0.get(r6)
            ca.dnamobile.javalauncher.storage.StorageLocation r6 = (ca.dnamobile.javalauncher.storage.StorageLocation) r6
            java.lang.String r0 = r6.getId()
            java.lang.String r1 = r4.selectedId
            boolean r0 = r0.equals(r1)
            boolean r1 = r6.isDefaultLocation()
            android.widget.RadioButton r2 = r5.radio
            r2.setChecked(r0)
            android.widget.TextView r2 = r5.title
            java.lang.String r3 = r6.getDisplayName()
            r2.setText(r3)
            android.widget.TextView r2 = r5.summary
            java.lang.String r3 = r6.getSummary()
            r2.setText(r3)
            android.view.View r2 = r5.itemView
            r2.setSelected(r0)
            android.view.View r0 = r5.itemView
            android.widget.ImageView r2 = r5.deleteButton
            r4.installRecursiveClickListener(r0, r6, r2)
            android.widget.ImageView r0 = r5.deleteButton
            if (r1 != 0) goto L3f
            r2 = 0
            goto L41
        L3f:
            r2 = 8
        L41:
            r0.setVisibility(r2)
            android.widget.ImageView r5 = r5.deleteButton
            if (r1 != 0) goto L4e
            ca.dnamobile.javalauncher.storage.StorageLocationAdapter$$ExternalSyntheticLambda1 r0 = new ca.dnamobile.javalauncher.storage.StorageLocationAdapter$$ExternalSyntheticLambda1
            r0.<init>(r4, r6)
            goto L4f
        L4e:
            r0 = 0
        L4f:
            r5.setOnClickListener(r0)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r1, int r2) {
            r0 = this;
            ca.dnamobile.javalauncher.storage.StorageLocationAdapter$ViewHolder r1 = r0.onCreateViewHolder(r1, r2)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ca.dnamobile.javalauncher.storage.StorageLocationAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup r13, int r14) {
            r12 = this;
            r14 = 10
            int r0 = dp(r13, r14)
            r1 = 6
            int r1 = dp(r13, r1)
            r2 = 12
            int r3 = dp(r13, r2)
            int r2 = dp(r13, r2)
            com.google.android.material.card.MaterialCardView r5 = new com.google.android.material.card.MaterialCardView
            android.content.Context r4 = r13.getContext()
            r5.<init>(r4)
            r4 = 18
            int r4 = dp(r13, r4)
            float r4 = (float) r4
            r5.setRadius(r4)
            r4 = 0
            int r6 = dp(r13, r4)
            float r6 = (float) r6
            r5.setCardElevation(r6)
            r6 = 1
            r5.setUseCompatPadding(r6)
            r5.setClickable(r6)
            r5.setFocusable(r6)
            int r7 = dp(r13, r6)
            r5.setStrokeWidth(r7)
            androidx.recyclerview.widget.RecyclerView$LayoutParams r7 = new androidx.recyclerview.widget.RecyclerView$LayoutParams
            r8 = -1
            r9 = -2
            r7.<init>(r8, r9)
            r7.setMargins(r4, r1, r4, r1)
            r5.setLayoutParams(r7)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            android.content.Context r7 = r13.getContext()
            r1.<init>(r7)
            r1.setOrientation(r4)
            r7 = 16
            r1.setGravity(r7)
            r1.setPadding(r0, r3, r0, r3)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r8, r9)
            r5.addView(r1, r0)
            android.widget.ImageView r0 = new android.widget.ImageView
            android.content.Context r3 = r13.getContext()
            r0.<init>(r3)
            int r3 = ca.dnamobile.javalauncher.R.drawable.ic_folder_24
            r0.setImageResource(r3)
            r3 = 9
            int r7 = dp(r13, r3)
            int r10 = dp(r13, r3)
            int r11 = dp(r13, r3)
            int r3 = dp(r13, r3)
            r0.setPadding(r7, r10, r11, r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r7 = 46
            int r10 = dp(r13, r7)
            int r7 = dp(r13, r7)
            r3.<init>(r10, r7)
            r1.addView(r0, r3)
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            android.content.Context r3 = r13.getContext()
            r0.<init>(r3)
            r0.setOrientation(r6)
            r0.setPadding(r2, r4, r2, r4)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r4, r9, r3)
            r1.addView(r0, r2)
            android.widget.TextView r7 = new android.widget.TextView
            android.content.Context r2 = r13.getContext()
            r7.<init>(r2)
            r2 = 1098907648(0x41800000, float:16.0)
            r7.setTextSize(r2)
            android.graphics.Typeface r2 = r7.getTypeface()
            r7.setTypeface(r2, r6)
            r7.setMaxLines(r6)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r8, r9)
            r0.addView(r7, r2)
            android.widget.TextView r2 = new android.widget.TextView
            android.content.Context r3 = r13.getContext()
            r2.<init>(r3)
            r3 = 1094713344(0x41400000, float:12.0)
            r2.setTextSize(r3)
            r3 = 3
            r2.setMaxLines(r3)
            int r3 = dp(r13, r3)
            r2.setPadding(r4, r3, r4, r4)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r8, r9)
            r0.addView(r2, r3)
            android.widget.RadioButton r0 = new android.widget.RadioButton
            android.content.Context r3 = r13.getContext()
            r0.<init>(r3)
            r0.setClickable(r6)
            r0.setFocusable(r4)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r9, r9)
            r1.addView(r0, r3)
            android.widget.ImageView r9 = new android.widget.ImageView
            android.content.Context r3 = r13.getContext()
            r9.<init>(r3)
            int r3 = ca.dnamobile.javalauncher.R.drawable.ic_delete_24
            r9.setImageResource(r3)
            android.content.Context r3 = r13.getContext()
            int r8 = ca.dnamobile.javalauncher.R.string.storage_location_delete_action
            java.lang.String r3 = r3.getString(r8)
            r9.setContentDescription(r3)
            int r3 = dp(r13, r14)
            int r8 = dp(r13, r14)
            int r10 = dp(r13, r14)
            int r14 = dp(r13, r14)
            r9.setPadding(r3, r8, r10, r14)
            r9.setClickable(r6)
            r9.setFocusable(r6)
            android.widget.LinearLayout$LayoutParams r14 = new android.widget.LinearLayout$LayoutParams
            r3 = 44
            int r6 = dp(r13, r3)
            int r3 = dp(r13, r3)
            r14.<init>(r6, r3)
            r3 = 4
            int r13 = dp(r13, r3)
            r14.setMargins(r13, r4, r4, r4)
            r1.addView(r9, r14)
            ca.dnamobile.javalauncher.storage.StorageLocationAdapter$ViewHolder r13 = new ca.dnamobile.javalauncher.storage.StorageLocationAdapter$ViewHolder
            r4 = r13
            r6 = r0
            r8 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            return r13
    }

    public void submit(java.util.List<ca.dnamobile.javalauncher.storage.StorageLocation> r2, java.lang.String r3) {
            r1 = this;
            java.util.ArrayList<ca.dnamobile.javalauncher.storage.StorageLocation> r0 = r1.locations
            r0.clear()
            java.util.ArrayList<ca.dnamobile.javalauncher.storage.StorageLocation> r0 = r1.locations
            r0.addAll(r2)
            r1.selectedId = r3
            r1.notifyDataSetChanged()
            return
    }
}
