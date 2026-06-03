package ca.dnamobile.javalauncher.ui.version;

/* JADX INFO: loaded from: classes.dex */
public final class MinecraftVersionAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<ca.dnamobile.javalauncher.ui.version.MinecraftVersionAdapter.VersionViewHolder> {
    private final android.content.Context context;
    private final android.view.LayoutInflater inflater;
    private final java.util.Set<java.lang.String> installedVersionIds;
    private final ca.dnamobile.javalauncher.ui.version.MinecraftVersionAdapter.Listener listener;
    private java.lang.String selectedVersionId;
    private final java.util.ArrayList<ca.dnamobile.javalauncher.data.model.MinecraftVersion> versions;

    public interface Listener {
        void onVersionSelected(ca.dnamobile.javalauncher.data.model.MinecraftVersion r1);
    }

    static final class VersionViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        final ca.dnamobile.javalauncher.databinding.ItemVersionBinding binding;

        VersionViewHolder(ca.dnamobile.javalauncher.databinding.ItemVersionBinding r2) {
                r1 = this;
                com.google.android.material.card.MaterialCardView r0 = r2.getRoot()
                r1.<init>(r0)
                r1.binding = r2
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$3kVV6wtC0ldYde2Ee75M7D3gfBQ(ca.dnamobile.javalauncher.ui.version.MinecraftVersionAdapter r0, ca.dnamobile.javalauncher.data.model.MinecraftVersion r1, android.view.View r2) {
            r0.lambda$onBindViewHolder$0(r1, r2)
            return
    }

    public MinecraftVersionAdapter(android.content.Context r2, ca.dnamobile.javalauncher.ui.version.MinecraftVersionAdapter.Listener r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.versions = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.installedVersionIds = r0
            r1.context = r2
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r1.inflater = r2
            r1.listener = r3
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

    private /* synthetic */ void lambda$onBindViewHolder$0(ca.dnamobile.javalauncher.data.model.MinecraftVersion r1, android.view.View r2) {
            r0 = this;
            ca.dnamobile.javalauncher.ui.version.MinecraftVersionAdapter$Listener r2 = r0.listener
            r2.onVersionSelected(r1)
            return
    }

    public static java.lang.String toDisplayType(java.lang.String r4) {
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

    public java.util.List<ca.dnamobile.javalauncher.data.model.MinecraftVersion> getCurrentItems() {
            r1 = this;
            java.util.ArrayList<ca.dnamobile.javalauncher.data.model.MinecraftVersion> r0 = r1.versions
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
            r1 = this;
            java.util.ArrayList<ca.dnamobile.javalauncher.data.model.MinecraftVersion> r0 = r1.versions
            int r0 = r0.size()
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
            r0 = this;
            ca.dnamobile.javalauncher.ui.version.MinecraftVersionAdapter$VersionViewHolder r1 = (ca.dnamobile.javalauncher.ui.version.MinecraftVersionAdapter.VersionViewHolder) r1
            r0.onBindViewHolder(r1, r2)
            return
    }

    public void onBindViewHolder(ca.dnamobile.javalauncher.ui.version.MinecraftVersionAdapter.VersionViewHolder r8, int r9) {
            r7 = this;
            java.util.ArrayList<ca.dnamobile.javalauncher.data.model.MinecraftVersion> r0 = r7.versions
            java.lang.Object r9 = r0.get(r9)
            ca.dnamobile.javalauncher.data.model.MinecraftVersion r9 = (ca.dnamobile.javalauncher.data.model.MinecraftVersion) r9
            java.lang.String r0 = r9.getId()
            java.lang.String r1 = r7.selectedVersionId
            boolean r0 = r0.equals(r1)
            java.util.Set<java.lang.String> r1 = r7.installedVersionIds
            java.lang.String r2 = r9.getId()
            boolean r1 = r1.contains(r2)
            ca.dnamobile.javalauncher.databinding.ItemVersionBinding r2 = r8.binding
            android.widget.TextView r2 = r2.textVersionName
            java.lang.String r3 = r9.getId()
            r2.setText(r3)
            ca.dnamobile.javalauncher.databinding.ItemVersionBinding r2 = r8.binding
            android.widget.TextView r2 = r2.textVersionMeta
            android.content.Context r3 = r7.context
            int r4 = ca.dnamobile.javalauncher.R.string.version_meta_value
            java.lang.String r5 = r9.getType()
            java.lang.String r5 = toDisplayType(r5)
            java.lang.String r6 = r9.getReleaseTime()
            java.lang.String r6 = cleanDate(r6)
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r6}
            java.lang.String r3 = r3.getString(r4, r5)
            r2.setText(r3)
            ca.dnamobile.javalauncher.databinding.ItemVersionBinding r2 = r8.binding
            android.widget.TextView r2 = r2.textVersionState
            if (r1 == 0) goto L53
            int r1 = ca.dnamobile.javalauncher.R.string.version_state_installed
            goto L55
        L53:
            int r1 = ca.dnamobile.javalauncher.R.string.version_state_not_installed
        L55:
            r2.setText(r1)
            ca.dnamobile.javalauncher.databinding.ItemVersionBinding r1 = r8.binding
            com.google.android.material.card.MaterialCardView r1 = r1.versionCard
            r1.setChecked(r0)
            ca.dnamobile.javalauncher.databinding.ItemVersionBinding r8 = r8.binding
            com.google.android.material.card.MaterialCardView r8 = r8.getRoot()
            ca.dnamobile.javalauncher.ui.version.MinecraftVersionAdapter$$ExternalSyntheticLambda0 r0 = new ca.dnamobile.javalauncher.ui.version.MinecraftVersionAdapter$$ExternalSyntheticLambda0
            r0.<init>(r7, r9)
            r8.setOnClickListener(r0)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r1, int r2) {
            r0 = this;
            ca.dnamobile.javalauncher.ui.version.MinecraftVersionAdapter$VersionViewHolder r1 = r0.onCreateViewHolder(r1, r2)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ca.dnamobile.javalauncher.ui.version.MinecraftVersionAdapter.VersionViewHolder onCreateViewHolder(android.view.ViewGroup r2, int r3) {
            r1 = this;
            android.view.LayoutInflater r3 = r1.inflater
            r0 = 0
            ca.dnamobile.javalauncher.databinding.ItemVersionBinding r2 = ca.dnamobile.javalauncher.databinding.ItemVersionBinding.inflate(r3, r2, r0)
            ca.dnamobile.javalauncher.ui.version.MinecraftVersionAdapter$VersionViewHolder r3 = new ca.dnamobile.javalauncher.ui.version.MinecraftVersionAdapter$VersionViewHolder
            r3.<init>(r2)
            return r3
    }

    public void setInstalledVersionIds(java.util.Set<java.lang.String> r2) {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.installedVersionIds
            r0.clear()
            java.util.Set<java.lang.String> r0 = r1.installedVersionIds
            r0.addAll(r2)
            r1.notifyDataSetChanged()
            return
    }

    public void setSelectedVersionId(java.lang.String r1) {
            r0 = this;
            r0.selectedVersionId = r1
            r0.notifyDataSetChanged()
            return
    }

    public void submitList(java.util.List<ca.dnamobile.javalauncher.data.model.MinecraftVersion> r2) {
            r1 = this;
            java.util.ArrayList<ca.dnamobile.javalauncher.data.model.MinecraftVersion> r0 = r1.versions
            r0.clear()
            java.util.ArrayList<ca.dnamobile.javalauncher.data.model.MinecraftVersion> r0 = r1.versions
            r0.addAll(r2)
            r1.notifyDataSetChanged()
            return
    }
}
