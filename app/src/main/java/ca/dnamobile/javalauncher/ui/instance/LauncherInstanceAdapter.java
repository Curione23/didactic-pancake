package ca.dnamobile.javalauncher.ui.instance;

/* JADX INFO: loaded from: classes.dex */
public final class LauncherInstanceAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter.InstanceViewHolder> {
    private final android.content.Context context;
    private final android.view.LayoutInflater inflater;
    private final java.util.ArrayList<ca.dnamobile.javalauncher.instance.LauncherInstance> instances;
    private final ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter.Listener listener;
    private java.lang.String selectedInstanceKey;

    static final class InstanceViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        final ca.dnamobile.javalauncher.databinding.ItemLauncherInstanceBinding binding;

        InstanceViewHolder(ca.dnamobile.javalauncher.databinding.ItemLauncherInstanceBinding r2) {
                r1 = this;
                com.google.android.material.card.MaterialCardView r0 = r2.getRoot()
                r1.<init>(r0)
                r1.binding = r2
                return
        }
    }

    public interface Listener {
        void onInstanceDeleteRequested(ca.dnamobile.javalauncher.instance.LauncherInstance r1);

        void onInstanceQuickPlayRequested(ca.dnamobile.javalauncher.instance.LauncherInstance r1);

        void onInstanceSelected(ca.dnamobile.javalauncher.instance.LauncherInstance r1);
    }

    /* JADX INFO: renamed from: $r8$lambda$BAbm53oiZ11lgM-Iy-V0IbAb1-Y, reason: not valid java name */
    public static /* synthetic */ void m578$r8$lambda$BAbm53oiZ11lgMIyV0IbAb1Y(ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter r0, ca.dnamobile.javalauncher.instance.LauncherInstance r1, android.view.View r2) {
            r0.lambda$onBindViewHolder$2(r1, r2)
            return
    }

    public static /* synthetic */ boolean $r8$lambda$K7lCaixSZlu6FOvbNt1EZ1nuebE(ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter r0, ca.dnamobile.javalauncher.instance.LauncherInstance r1, android.view.View r2) {
            boolean r0 = r0.lambda$onBindViewHolder$1(r1, r2)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$mjaCKJtsQ2giG5dUGWoNXWFfNFY(ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter r0, ca.dnamobile.javalauncher.instance.LauncherInstance r1, android.view.View r2) {
            r0.lambda$onBindViewHolder$0(r1, r2)
            return
    }

    public LauncherInstanceAdapter(android.content.Context r2, ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter.Listener r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.instances = r0
            r1.context = r2
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r1.inflater = r2
            r1.listener = r3
            return
    }

    private void bindInstanceIcon(ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter.InstanceViewHolder r3, ca.dnamobile.javalauncher.instance.LauncherInstance r4) {
            r2 = this;
            ca.dnamobile.javalauncher.databinding.ItemLauncherInstanceBinding r0 = r3.binding
            android.widget.ImageView r0 = r0.imageInstanceIcon
            r1 = 0
            r0.setImageDrawable(r1)
            java.io.File r0 = r4.getIconFile()
            if (r0 == 0) goto L2a
            boolean r1 = r0.isFile()
            if (r1 == 0) goto L2a
            ca.dnamobile.javalauncher.databinding.ItemLauncherInstanceBinding r1 = r3.binding     // Catch: java.lang.Throwable -> L2a
            android.widget.ImageView r1 = r1.imageInstanceIcon     // Catch: java.lang.Throwable -> L2a
            android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch: java.lang.Throwable -> L2a
            r1.setImageURI(r0)     // Catch: java.lang.Throwable -> L2a
            ca.dnamobile.javalauncher.databinding.ItemLauncherInstanceBinding r0 = r3.binding     // Catch: java.lang.Throwable -> L2a
            android.widget.ImageView r0 = r0.imageInstanceIcon     // Catch: java.lang.Throwable -> L2a
            android.graphics.drawable.Drawable r0 = r0.getDrawable()     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L2a
            return
        L2a:
            ca.dnamobile.javalauncher.databinding.ItemLauncherInstanceBinding r3 = r3.binding
            android.widget.ImageView r3 = r3.imageInstanceIcon
            int r4 = ca.dnamobile.javalauncher.ui.instance.InstanceIconResolver.getDefaultIcon(r4)
            r3.setImageResource(r4)
            return
    }

    private static java.lang.String cleanDate(java.lang.String r2) {
            if (r2 == 0) goto L17
            boolean r0 = ca.dnamobile.javalauncher.MainActivity$$ExternalSyntheticBackport0.m(r2)
            if (r0 == 0) goto L9
            goto L17
        L9:
            r0 = 84
            int r0 = r2.indexOf(r0)
            if (r0 <= 0) goto L16
            r1 = 0
            java.lang.String r2 = r2.substring(r1, r0)
        L16:
            return r2
        L17:
            java.lang.String r2 = "Unknown date"
            return r2
    }

    private java.lang.String displayLoader(java.lang.String r5) {
            r4 = this;
            if (r5 == 0) goto L2b
            boolean r0 = ca.dnamobile.javalauncher.MainActivity$$ExternalSyntheticBackport0.m(r5)
            if (r0 == 0) goto L9
            goto L2b
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = 1
            java.lang.String r1 = r5.substring(r1, r2)
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r1 = r1.toUpperCase(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r5 = r5.substring(r2)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            return r5
        L2b:
            java.lang.String r5 = "Vanilla"
            return r5
    }

    private static java.lang.String displayVersionType(java.lang.String r4) {
            if (r4 != 0) goto L5
            java.lang.String r4 = "Unknown"
            return r4
        L5:
            r4.hashCode()
            int r0 = r4.hashCode()
            r1 = 0
            r2 = 1
            r3 = -1
            switch(r0) {
                case 198238472: goto L34;
                case 284874180: goto L29;
                case 1090594823: goto L1e;
                case 1849706822: goto L13;
                default: goto L12;
            }
        L12:
            goto L3e
        L13:
            java.lang.String r0 = "old_alpha"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L1c
            goto L3e
        L1c:
            r3 = 3
            goto L3e
        L1e:
            java.lang.String r0 = "release"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L27
            goto L3e
        L27:
            r3 = 2
            goto L3e
        L29:
            java.lang.String r0 = "snapshot"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L32
            goto L3e
        L32:
            r3 = r2
            goto L3e
        L34:
            java.lang.String r0 = "old_beta"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L3d
            goto L3e
        L3d:
            r3 = r1
        L3e:
            switch(r3) {
                case 0: goto L72;
                case 1: goto L6f;
                case 2: goto L6c;
                case 3: goto L69;
                default: goto L41;
            }
        L41:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r4.substring(r1, r2)
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r1 = r1.toUpperCase(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r4 = r4.substring(r2)
            r1 = 95
            r2 = 32
            java.lang.String r4 = r4.replace(r1, r2)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            return r4
        L69:
            java.lang.String r4 = "Alpha"
            return r4
        L6c:
            java.lang.String r4 = "Release"
            return r4
        L6f:
            java.lang.String r4 = "Snapshot"
            return r4
        L72:
            java.lang.String r4 = "Beta"
            return r4
    }

    private int dp(int r2) {
            r1 = this;
            float r2 = (float) r2
            android.content.Context r0 = r1.context
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r2 = r2 * r0
            int r2 = java.lang.Math.round(r2)
            return r2
    }

    public static java.lang.String getSelectionKey(ca.dnamobile.javalauncher.instance.LauncherInstance r3) {
            boolean r0 = r3.isIsolated()
            java.lang.String r1 = ":"
            if (r0 == 0) goto L30
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "isolated:"
            r0.<init>(r2)
            java.io.File r2 = r3.getRootDirectory()
            java.lang.String r2 = safePath(r2)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r3 = r3.getName()
            java.lang.String r3 = nullToEmpty(r3)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            return r3
        L30:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "shared:"
            r0.<init>(r2)
            java.io.File r2 = r3.getGameDirectory()
            java.lang.String r2 = safePath(r2)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r3 = r3.getBaseVersionId()
            java.lang.String r3 = nullToEmpty(r3)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            return r3
    }

    private /* synthetic */ void lambda$onBindViewHolder$0(ca.dnamobile.javalauncher.instance.LauncherInstance r1, android.view.View r2) {
            r0 = this;
            r0.setSelectedInstance(r1)
            ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter$Listener r2 = r0.listener
            r2.onInstanceSelected(r1)
            return
    }

    private /* synthetic */ boolean lambda$onBindViewHolder$1(ca.dnamobile.javalauncher.instance.LauncherInstance r1, android.view.View r2) {
            r0 = this;
            ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter$Listener r2 = r0.listener
            r2.onInstanceDeleteRequested(r1)
            r1 = 1
            return r1
    }

    private /* synthetic */ void lambda$onBindViewHolder$2(ca.dnamobile.javalauncher.instance.LauncherInstance r1, android.view.View r2) {
            r0 = this;
            ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter$Listener r2 = r0.listener
            r2.onInstanceQuickPlayRequested(r1)
            return
    }

    private static java.lang.String nullToEmpty(java.lang.String r0) {
            if (r0 != 0) goto L4
            java.lang.String r0 = ""
        L4:
            return r0
    }

    private static java.lang.String safePath(java.io.File r0) {
            if (r0 != 0) goto L5
            java.lang.String r0 = ""
            return r0
        L5:
            java.io.File r0 = r0.getAbsoluteFile()
            java.lang.String r0 = r0.getAbsolutePath()
            return r0
    }

    public void clearSelectedInstance() {
            r1 = this;
            r0 = 0
            r1.selectedInstanceKey = r0
            r1.notifyDataSetChanged()
            return
    }

    public java.util.List<ca.dnamobile.javalauncher.instance.LauncherInstance> getCurrentItems() {
            r1 = this;
            java.util.ArrayList<ca.dnamobile.javalauncher.instance.LauncherInstance> r0 = r1.instances
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
            r1 = this;
            java.util.ArrayList<ca.dnamobile.javalauncher.instance.LauncherInstance> r0 = r1.instances
            int r0 = r0.size()
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
            r0 = this;
            ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter$InstanceViewHolder r1 = (ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter.InstanceViewHolder) r1
            r0.onBindViewHolder(r1, r2)
            return
    }

    public void onBindViewHolder(ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter.InstanceViewHolder r10, int r11) {
            r9 = this;
            java.util.ArrayList<ca.dnamobile.javalauncher.instance.LauncherInstance> r0 = r9.instances
            java.lang.Object r11 = r0.get(r11)
            ca.dnamobile.javalauncher.instance.LauncherInstance r11 = (ca.dnamobile.javalauncher.instance.LauncherInstance) r11
            java.lang.String r0 = r9.selectedInstanceKey
            r1 = 1
            if (r0 == 0) goto L19
            java.lang.String r2 = getSelectionKey(r11)
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L19
            r0 = r1
            goto L1a
        L19:
            r0 = 0
        L1a:
            ca.dnamobile.javalauncher.databinding.ItemLauncherInstanceBinding r2 = r10.binding
            android.widget.TextView r2 = r2.textInstanceName
            java.lang.String r3 = r11.getName()
            r2.setText(r3)
            ca.dnamobile.javalauncher.databinding.ItemLauncherInstanceBinding r2 = r10.binding
            android.widget.TextView r2 = r2.textInstanceMeta
            android.content.Context r3 = r9.context
            boolean r4 = r11.isIsolated()
            if (r4 == 0) goto L34
            int r4 = ca.dnamobile.javalauncher.R.string.instance_meta_value
            goto L36
        L34:
            int r4 = ca.dnamobile.javalauncher.R.string.instance_meta_shared_value
        L36:
            java.lang.String r5 = r11.getLoader()
            java.lang.String r5 = r9.displayLoader(r5)
            java.lang.String r6 = r11.getBaseVersionId()
            java.lang.String r7 = r11.getVersionType()
            java.lang.String r7 = displayVersionType(r7)
            java.lang.String r8 = r11.getCreatedAt()
            java.lang.String r8 = cleanDate(r8)
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r6, r7, r8}
            java.lang.String r3 = r3.getString(r4, r5)
            r2.setText(r3)
            ca.dnamobile.javalauncher.databinding.ItemLauncherInstanceBinding r2 = r10.binding
            android.widget.TextView r2 = r2.textInstanceState
            boolean r3 = r11.isIsolated()
            if (r3 == 0) goto L6a
            int r3 = ca.dnamobile.javalauncher.R.string.version_state_installed
            goto L6c
        L6a:
            int r3 = ca.dnamobile.javalauncher.R.string.instance_state_shared
        L6c:
            r2.setText(r3)
            r9.bindInstanceIcon(r10, r11)
            ca.dnamobile.javalauncher.databinding.ItemLauncherInstanceBinding r2 = r10.binding
            com.google.android.material.card.MaterialCardView r2 = r2.instanceCard
            int r3 = com.google.android.material.R.attr.colorPrimary
            int r3 = com.google.android.material.color.MaterialColors.getColor(r2, r3)
            int r4 = com.google.android.material.R.attr.colorOutline
            int r4 = com.google.android.material.color.MaterialColors.getColor(r2, r4)
            if (r0 == 0) goto L85
            goto L86
        L85:
            r3 = r4
        L86:
            r2.setStrokeColor(r3)
            if (r0 == 0) goto L91
            r0 = 2
            int r0 = r9.dp(r0)
            goto L95
        L91:
            int r0 = r9.dp(r1)
        L95:
            r2.setStrokeWidth(r0)
            ca.dnamobile.javalauncher.databinding.ItemLauncherInstanceBinding r0 = r10.binding
            com.google.android.material.card.MaterialCardView r0 = r0.getRoot()
            ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter$$ExternalSyntheticLambda0
            r1.<init>(r9, r11)
            r0.setOnClickListener(r1)
            ca.dnamobile.javalauncher.databinding.ItemLauncherInstanceBinding r0 = r10.binding
            com.google.android.material.card.MaterialCardView r0 = r0.getRoot()
            ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter$$ExternalSyntheticLambda1 r1 = new ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter$$ExternalSyntheticLambda1
            r1.<init>(r9, r11)
            r0.setOnLongClickListener(r1)
            ca.dnamobile.javalauncher.databinding.ItemLauncherInstanceBinding r0 = r10.binding
            android.widget.ImageButton r0 = r0.buttonDeleteInstance
            int r1 = ca.dnamobile.javalauncher.R.drawable.ic_play_arrow_24
            r0.setImageResource(r1)
            ca.dnamobile.javalauncher.databinding.ItemLauncherInstanceBinding r0 = r10.binding
            android.widget.ImageButton r0 = r0.buttonDeleteInstance
            java.lang.String r1 = "Play instance"
            r0.setContentDescription(r1)
            ca.dnamobile.javalauncher.databinding.ItemLauncherInstanceBinding r10 = r10.binding
            android.widget.ImageButton r10 = r10.buttonDeleteInstance
            ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter$$ExternalSyntheticLambda2 r0 = new ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter$$ExternalSyntheticLambda2
            r0.<init>(r9, r11)
            r10.setOnClickListener(r0)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r1, int r2) {
            r0 = this;
            ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter$InstanceViewHolder r1 = r0.onCreateViewHolder(r1, r2)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter.InstanceViewHolder onCreateViewHolder(android.view.ViewGroup r2, int r3) {
            r1 = this;
            android.view.LayoutInflater r3 = r1.inflater
            r0 = 0
            ca.dnamobile.javalauncher.databinding.ItemLauncherInstanceBinding r2 = ca.dnamobile.javalauncher.databinding.ItemLauncherInstanceBinding.inflate(r3, r2, r0)
            ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter$InstanceViewHolder r3 = new ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter$InstanceViewHolder
            r3.<init>(r2)
            return r3
    }

    public void setSelectedInstance(ca.dnamobile.javalauncher.instance.LauncherInstance r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 0
            goto L8
        L4:
            java.lang.String r1 = getSelectionKey(r1)
        L8:
            r0.selectedInstanceKey = r1
            r0.notifyDataSetChanged()
            return
    }

    public void setSelectedInstanceId(java.lang.String r4) {
            r3 = this;
            if (r4 != 0) goto L6
            r3.clearSelectedInstance()
            return
        L6:
            java.util.ArrayList<ca.dnamobile.javalauncher.instance.LauncherInstance> r0 = r3.instances
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            ca.dnamobile.javalauncher.instance.LauncherInstance r1 = (ca.dnamobile.javalauncher.instance.LauncherInstance) r1
            java.lang.String r2 = r1.getId()
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto Lc
            r3.setSelectedInstance(r1)
            return
        L26:
            r3.clearSelectedInstance()
            return
    }

    public void submitList(java.util.List<ca.dnamobile.javalauncher.instance.LauncherInstance> r2) {
            r1 = this;
            java.util.ArrayList<ca.dnamobile.javalauncher.instance.LauncherInstance> r0 = r1.instances
            r0.clear()
            java.util.ArrayList<ca.dnamobile.javalauncher.instance.LauncherInstance> r0 = r1.instances
            r0.addAll(r2)
            r1.notifyDataSetChanged()
            return
    }
}
