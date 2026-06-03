package ca.dnamobile.javalauncher;

/* JADX INFO: loaded from: classes.dex */
public final class ModpackUpdateDetailsActivity extends androidx.appcompat.app.AppCompatActivity {
    private static final int COLOR_ACCENT = 0;
    private static final int COLOR_CARD_BG = 0;
    private static final int COLOR_CARD_BG_PRESSED = 0;
    private static final int COLOR_CARD_STROKE = 0;
    private static final int COLOR_DIALOG_BG = 0;
    private static final int COLOR_TEXT_MUTED = 0;
    private static final int COLOR_TEXT_PRIMARY = 0;
    private static final int COLOR_TEXT_SECONDARY = 0;
    private static final java.lang.String EXTRA_CURRENT_PACK_VERSION = "ca.dnamobile.javalauncher.extra.MODPACK_UPDATE_CURRENT_VERSION";
    private static final java.lang.String EXTRA_PLATFORM = "ca.dnamobile.javalauncher.extra.MODPACK_UPDATE_PLATFORM";
    private static final java.lang.String EXTRA_PROJECT_ID = "ca.dnamobile.javalauncher.extra.MODPACK_UPDATE_PROJECT_ID";
    private static final java.lang.String EXTRA_PROJECT_SLUG = "ca.dnamobile.javalauncher.extra.MODPACK_UPDATE_PROJECT_SLUG";
    private static final java.lang.String EXTRA_PROJECT_SUMMARY = "ca.dnamobile.javalauncher.extra.MODPACK_UPDATE_PROJECT_SUMMARY";
    private static final java.lang.String EXTRA_PROJECT_TITLE = "ca.dnamobile.javalauncher.extra.MODPACK_UPDATE_PROJECT_TITLE";
    private static final java.lang.String FILTER_ALL = "All Minecraft versions";
    private static final java.lang.String FILTER_UNKNOWN = "Unknown Minecraft version";
    public static final java.lang.String PLATFORM_CURSEFORGE = "curseforge";
    public static final java.lang.String PLATFORM_MODRINTH = "modrinth";
    private static final java.lang.String TAG = "ModpackUpdateDetails";
    private final ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.VersionAdapter adapter;
    private final java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo> allVersions;
    private java.lang.String baseVersionId;
    private android.widget.TextView buttonFilter;
    private android.widget.TextView buttonNext;
    private android.widget.TextView buttonPrevious;
    private boolean collapseAllOnNextRebuild;
    private final java.util.HashSet<java.lang.String> collapsedGroups;
    private java.lang.String currentPackVersion;
    private final java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo> filteredVersions;
    private java.io.File gameDirectory;
    private java.io.File iconFile;
    private java.lang.String instanceId;
    private java.lang.String instanceName;
    private boolean isolated;
    private java.lang.String loader;
    private final java.util.ArrayList<java.lang.String> minecraftFilters;
    private java.lang.String minecraftVersionId;
    private android.widget.ProgressBar progressBar;
    private java.lang.String projectId;
    private java.lang.String projectPlatform;
    private java.lang.String projectSlug;
    private java.lang.String projectSummary;
    private java.lang.String projectTitle;
    private androidx.recyclerview.widget.RecyclerView recyclerVersions;
    private java.io.File rootDirectory;
    private java.lang.String selectedFilter;
    private android.widget.TextView textFilterSummary;
    private android.widget.TextView textMeta;
    private android.widget.TextView textPageIndicator;
    private android.widget.TextView textStatus;
    private android.widget.TextView textTitle;
    private final java.util.ArrayList<ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.VersionGroup> versionGroups;
    private java.lang.String versionType;
    private final java.util.ArrayList<ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.VersionDisplayRow> visibleRows;

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$1, reason: invalid class name */
    class AnonymousClass1 implements ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Listener {
        final /* synthetic */ ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity this$0;

        public static /* synthetic */ void $r8$lambda$TDJIiGfRINnXDiRgodgJNZ3V1o4(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.AnonymousClass1 r0, java.lang.String r1) {
                r0.lambda$onStatus$0(r1)
                return
        }

        AnonymousClass1(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        private /* synthetic */ void lambda$onStatus$0(java.lang.String r2) {
                r1 = this;
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0 = r1.this$0
                android.widget.TextView r0 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m386$$Nest$fgettextStatus(r0)
                r0.setText(r2)
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Listener
        public void onProgress(int r1, int r2) {
                r0 = this;
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Listener
        public void onStatus(java.lang.String r3) {
                r2 = this;
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$1$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$1$$ExternalSyntheticLambda0
                r1.<init>(r2, r3)
                r0.runOnUiThread(r1)
                return
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$2, reason: invalid class name */
    class AnonymousClass2 implements ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Listener {
        final /* synthetic */ ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity this$0;

        /* JADX INFO: renamed from: $r8$lambda$Enbw0Dl4heZ-3H_pMmtOhoQ6ZLg, reason: not valid java name */
        public static /* synthetic */ void m403$r8$lambda$Enbw0Dl4heZ3H_pMmtOhoQ6ZLg(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.AnonymousClass2 r0, int r1, int r2) {
                r0.lambda$onProgress$1(r1, r2)
                return
        }

        public static /* synthetic */ void $r8$lambda$zhW1xwJjCLYRDG_odJX9PL9Iy_w(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.AnonymousClass2 r0, java.lang.String r1) {
                r0.lambda$onStatus$0(r1)
                return
        }

        AnonymousClass2(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        private /* synthetic */ void lambda$onProgress$1(int r4, int r5) {
                r3 = this;
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0 = r3.this$0
                android.widget.TextView r0 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m386$$Nest$fgettextStatus(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Updating "
                r1.<init>(r2)
                r2 = 0
                int r4 = java.lang.Math.max(r2, r4)
                java.lang.StringBuilder r4 = r1.append(r4)
                java.lang.String r1 = " / "
                java.lang.StringBuilder r4 = r4.append(r1)
                java.lang.StringBuilder r4 = r4.append(r5)
                java.lang.String r4 = r4.toString()
                r0.setText(r4)
                return
        }

        private /* synthetic */ void lambda$onStatus$0(java.lang.String r2) {
                r1 = this;
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0 = r1.this$0
                android.widget.TextView r0 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m386$$Nest$fgettextStatus(r0)
                r0.setText(r2)
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Listener
        public void onProgress(int r3, int r4) {
                r2 = this;
                if (r4 <= 0) goto Lc
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$2$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$2$$ExternalSyntheticLambda0
                r1.<init>(r2, r3, r4)
                r0.runOnUiThread(r1)
            Lc:
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Listener
        public void onStatus(java.lang.String r3) {
                r2 = this;
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$2$$ExternalSyntheticLambda1 r1 = new ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$2$$ExternalSyntheticLambda1
                r1.<init>(r2, r3)
                r0.runOnUiThread(r1)
                return
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$3, reason: invalid class name */
    class AnonymousClass3 implements ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.Listener {
        final /* synthetic */ ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity this$0;

        public static /* synthetic */ void $r8$lambda$yraaCtbQUhwt1wWdh91n47mPazs(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.AnonymousClass3 r0, java.lang.String r1) {
                r0.lambda$onStatus$0(r1)
                return
        }

        AnonymousClass3(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        private /* synthetic */ void lambda$onStatus$0(java.lang.String r2) {
                r1 = this;
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0 = r1.this$0
                android.widget.TextView r0 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m386$$Nest$fgettextStatus(r0)
                r0.setText(r2)
                return
        }

        @Override // ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.Listener
        public void onProgress(int r1, int r2) {
                r0 = this;
                return
        }

        @Override // ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.Listener
        public void onStatus(java.lang.String r3) {
                r2 = this;
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$3$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$3$$ExternalSyntheticLambda0
                r1.<init>(r2, r3)
                r0.runOnUiThread(r1)
                return
        }
    }

    private final class VersionAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.VersionAdapter.ViewHolder> {
        private static final int TYPE_GROUP = 0;
        private static final int TYPE_VERSION = 1;
        private final java.util.ArrayList<ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.VersionDisplayRow> rows;
        final /* synthetic */ ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity this$0;

        final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            final android.widget.TextView action;
            final boolean groupRow;
            final android.widget.TextView meta;
            final /* synthetic */ ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.VersionAdapter this$1;
            final android.widget.TextView title;

            ViewHolder(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.VersionAdapter r1, android.view.View r2, android.widget.TextView r3, android.widget.TextView r4, android.widget.TextView r5, boolean r6) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>(r2)
                    r0.title = r3
                    r0.meta = r4
                    r0.action = r5
                    r0.groupRow = r6
                    return
            }
        }

        public static /* synthetic */ void $r8$lambda$O7LNU6rXh15Jm2O8pm_X0HxtH_I(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.VersionAdapter r0, ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.VersionGroup r1, android.view.View r2) {
                r0.lambda$bindGroup$1(r1, r2)
                return
        }

        public static /* synthetic */ void $r8$lambda$OPWcodycyFP5zwaOchY7ZLY13Js(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.VersionAdapter r0, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo r1, android.view.View r2) {
                r0.lambda$bindVersion$2(r1, r2)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$obhU5N9lrtV-vZv5WX3cmH_Z1Do, reason: not valid java name */
        public static /* synthetic */ void m404$r8$lambda$obhU5N9lrtVvZv5WX3cmH_Z1Do(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.VersionAdapter r0, ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.VersionGroup r1, android.view.View r2) {
                r0.lambda$bindGroup$0(r1, r2)
                return
        }

        public static /* synthetic */ void $r8$lambda$x4yUd1uxj8CKHsG9qjSDaunz85A(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.VersionAdapter r0, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo r1, android.view.View r2) {
                r0.lambda$bindVersion$3(r1, r2)
                return
        }

        private VersionAdapter(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.rows = r1
                return
        }

        /* synthetic */ VersionAdapter(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r1, ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.VersionAdapterIA r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void bindGroup(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.VersionAdapter.ViewHolder r6, ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.VersionGroup r7) {
                r5 = this;
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0 = r5.this$0
                java.util.HashSet r0 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m385$$Nest$fgetcollapsedGroups(r0)
                java.lang.String r1 = r7.minecraftVersion
                boolean r0 = r0.contains(r1)
                android.widget.TextView r1 = r6.title
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                if (r0 == 0) goto L18
                java.lang.String r3 = "▸ "
                goto L1a
            L18:
                java.lang.String r3 = "▾ "
            L1a:
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = "Minecraft "
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = r7.minecraftVersion
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.setText(r2)
                android.widget.TextView r1 = r6.meta
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo> r3 = r7.versions
                int r3 = r3.size()
                java.lang.StringBuilder r2 = r2.append(r3)
                java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo> r3 = r7.versions
                int r3 = r3.size()
                r4 = 1
                if (r3 != r4) goto L4e
                java.lang.String r3 = " version"
                goto L50
            L4e:
                java.lang.String r3 = " versions"
            L50:
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.setText(r2)
                android.widget.TextView r1 = r6.action
                if (r0 == 0) goto L62
                java.lang.String r0 = "+"
                goto L64
            L62:
                java.lang.String r0 = "–"
            L64:
                r1.setText(r0)
                android.view.View r0 = r6.itemView
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionAdapter$$ExternalSyntheticLambda2 r1 = new ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionAdapter$$ExternalSyntheticLambda2
                r1.<init>(r5, r7)
                r0.setOnClickListener(r1)
                android.widget.TextView r6 = r6.action
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionAdapter$$ExternalSyntheticLambda3 r0 = new ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionAdapter$$ExternalSyntheticLambda3
                r0.<init>(r5, r7)
                r6.setOnClickListener(r0)
                return
        }

        private void bindVersion(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.VersionAdapter.ViewHolder r5, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo r6) {
                r4 = this;
                android.widget.TextView r0 = r5.title
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                boolean r2 = r4.isLatestVersion(r6)
                if (r2 == 0) goto L10
                java.lang.String r2 = "Latest available: "
                goto L12
            L10:
                java.lang.String r2 = ""
            L12:
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = r6.versionLabel
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.setText(r1)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Minecraft "
                r1.<init>(r2)
                java.lang.String r2 = r6.getMinecraftVersionsLabel()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = " · "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = r6.getLoadersLabel()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.add(r1)
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r1 = r4.this$0
                java.lang.String r2 = r6.datePublished
                java.lang.String r1 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m395$$Nest$mtrimDate(r1, r2)
                boolean r2 = r1.isEmpty()
                if (r2 != 0) goto L5d
                r0.add(r1)
            L5d:
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r1 = r4.this$0
                java.lang.String r2 = r6.fileName
                boolean r1 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m390$$Nest$misBlank(r1, r2)
                if (r1 != 0) goto L6c
                java.lang.String r1 = r6.fileName
                r0.add(r1)
            L6c:
                android.widget.TextView r1 = r5.meta
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r2 = r4.this$0
                java.lang.String r3 = "\n"
                java.lang.String r0 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m391$$Nest$mjoin(r2, r0, r3)
                r1.setText(r0)
                android.widget.TextView r0 = r5.action
                java.lang.String r1 = "Update"
                r0.setText(r1)
                android.widget.TextView r0 = r5.action
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionAdapter$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionAdapter$$ExternalSyntheticLambda0
                r1.<init>(r4, r6)
                r0.setOnClickListener(r1)
                android.view.View r5 = r5.itemView
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionAdapter$$ExternalSyntheticLambda1 r0 = new ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionAdapter$$ExternalSyntheticLambda1
                r0.<init>(r4, r6)
                r5.setOnClickListener(r0)
                return
        }

        private boolean isLatestVersion(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo r3) {
                r2 = this;
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0 = r2.this$0
                java.util.ArrayList r0 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m384$$Nest$fgetallVersions(r0)
                boolean r0 = r0.isEmpty()
                r1 = 0
                if (r0 != 0) goto L1a
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0 = r2.this$0
                java.util.ArrayList r0 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m384$$Nest$fgetallVersions(r0)
                java.lang.Object r0 = r0.get(r1)
                if (r0 != r3) goto L1a
                r1 = 1
            L1a:
                return r1
        }

        private /* synthetic */ void lambda$bindGroup$0(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.VersionGroup r1, android.view.View r2) {
                r0 = this;
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r2 = r0.this$0
                java.lang.String r1 = r1.minecraftVersion
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m394$$Nest$mtoggleGroup(r2, r1)
                return
        }

        private /* synthetic */ void lambda$bindGroup$1(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.VersionGroup r1, android.view.View r2) {
                r0 = this;
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r2 = r0.this$0
                java.lang.String r1 = r1.minecraftVersion
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m394$$Nest$mtoggleGroup(r2, r1)
                return
        }

        private /* synthetic */ void lambda$bindVersion$2(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo r1, android.view.View r2) {
                r0 = this;
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r2 = r0.this$0
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m387$$Nest$mconfirmUpdate(r2, r1)
                return
        }

        private /* synthetic */ void lambda$bindVersion$3(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo r1, android.view.View r2) {
                r0 = this;
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r2 = r0.this$0
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m387$$Nest$mconfirmUpdate(r2, r1)
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
                r1 = this;
                java.util.ArrayList<ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionDisplayRow> r0 = r1.rows
                int r0 = r0.size()
                return r0
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int r2) {
                r1 = this;
                java.util.ArrayList<ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionDisplayRow> r0 = r1.rows
                java.lang.Object r2 = r0.get(r2)
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionDisplayRow r2 = (ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.VersionDisplayRow) r2
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionGroup r2 = r2.group
                if (r2 == 0) goto Le
                r2 = 0
                goto Lf
            Le:
                r2 = 1
            Lf:
                return r2
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
                r0 = this;
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionAdapter$ViewHolder r1 = (ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.VersionAdapter.ViewHolder) r1
                r0.onBindViewHolder(r1, r2)
                return
        }

        public void onBindViewHolder(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.VersionAdapter.ViewHolder r2, int r3) {
                r1 = this;
                java.util.ArrayList<ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionDisplayRow> r0 = r1.rows
                java.lang.Object r3 = r0.get(r3)
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionDisplayRow r3 = (ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.VersionDisplayRow) r3
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionGroup r0 = r3.group
                if (r0 == 0) goto L12
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionGroup r3 = r3.group
                r1.bindGroup(r2, r3)
                return
            L12:
                ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo r0 = r3.version
                if (r0 == 0) goto L1b
                ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo r3 = r3.version
                r1.bindVersion(r2, r3)
            L1b:
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r1, int r2) {
                r0 = this;
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionAdapter$ViewHolder r1 = r0.onCreateViewHolder(r1, r2)
                return r1
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.VersionAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup r16, int r17) {
                r15 = this;
                r7 = r15
                r0 = 3
                r1 = 1094713344(0x41400000, float:12.0)
                r2 = 14
                r3 = 18
                r4 = 2
                r5 = 16
                r6 = 1
                r8 = -1
                r9 = 0
                r10 = -2
                if (r17 != 0) goto L11e
                android.widget.LinearLayout r11 = new android.widget.LinearLayout
                android.content.Context r12 = r16.getContext()
                r11.<init>(r12)
                r11.setOrientation(r9)
                r11.setGravity(r5)
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r12 = r7.this$0
                int r12 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m389$$Nest$mdp(r12, r3)
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r13 = r7.this$0
                int r13 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m389$$Nest$mdp(r13, r2)
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r14 = r7.this$0
                int r3 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m389$$Nest$mdp(r14, r3)
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r14 = r7.this$0
                int r2 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m389$$Nest$mdp(r14, r2)
                r11.setPadding(r12, r13, r3, r2)
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r2 = r7.this$0
                r3 = 70
                int r2 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m389$$Nest$mdp(r2, r3)
                r11.setMinimumHeight(r2)
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r2 = r7.this$0
                int r3 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m398$$Nest$sfgetCOLOR_CARD_BG_PRESSED()
                int r12 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m399$$Nest$sfgetCOLOR_CARD_STROKE()
                android.graphics.drawable.GradientDrawable r2 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m393$$Nest$mroundedDrawable(r2, r3, r12, r5)
                r11.setBackground(r2)
                android.widget.LinearLayout r2 = new android.widget.LinearLayout
                android.content.Context r3 = r16.getContext()
                r2.<init>(r3)
                r2.setOrientation(r6)
                r2.setGravity(r5)
                android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
                r5 = 1065353216(0x3f800000, float:1.0)
                r3.<init>(r9, r10, r5)
                r11.addView(r2, r3)
                android.widget.TextView r3 = new android.widget.TextView
                android.content.Context r5 = r16.getContext()
                r3.<init>(r5)
                int r5 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m401$$Nest$sfgetCOLOR_TEXT_PRIMARY()
                r3.setTextColor(r5)
                r5 = 1099431936(0x41880000, float:17.0)
                r3.setTextSize(r4, r5)
                android.graphics.Typeface r5 = android.graphics.Typeface.DEFAULT_BOLD
                r3.setTypeface(r5)
                r3.setSingleLine(r6)
                android.text.TextUtils$TruncateAt r5 = android.text.TextUtils.TruncateAt.END
                r3.setEllipsize(r5)
                android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
                r5.<init>(r8, r10)
                r2.addView(r3, r5)
                android.widget.TextView r5 = new android.widget.TextView
                android.content.Context r12 = r16.getContext()
                r5.<init>(r12)
                int r12 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m400$$Nest$sfgetCOLOR_TEXT_MUTED()
                r5.setTextColor(r12)
                r5.setTextSize(r4, r1)
                r5.setSingleLine(r6)
                android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
                r5.setEllipsize(r1)
                android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
                r1.<init>(r8, r10)
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r6 = r7.this$0
                int r0 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m389$$Nest$mdp(r6, r0)
                r1.topMargin = r0
                r2.addView(r5, r1)
                android.widget.TextView r6 = new android.widget.TextView
                android.content.Context r0 = r16.getContext()
                r6.<init>(r0)
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0 = r7.this$0
                r1 = 16843829(0x1010435, float:2.3696576E-38)
                int r2 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m396$$Nest$sfgetCOLOR_ACCENT()
                int r0 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m392$$Nest$mresolveThemeColor(r0, r1, r2)
                r6.setTextColor(r0)
                r0 = 1103101952(0x41c00000, float:24.0)
                r6.setTextSize(r4, r0)
                r0 = 17
                r6.setGravity(r0)
                android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r1 = r7.this$0
                r2 = 42
                int r1 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m389$$Nest$mdp(r1, r2)
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r4 = r7.this$0
                int r2 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m389$$Nest$mdp(r4, r2)
                r0.<init>(r1, r2)
                r11.addView(r6, r0)
                androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = new androidx.recyclerview.widget.RecyclerView$LayoutParams
                r0.<init>(r8, r10)
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r1 = r7.this$0
                r2 = 10
                int r1 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m389$$Nest$mdp(r1, r2)
                r0.setMargins(r9, r9, r9, r1)
                r11.setLayoutParams(r0)
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionAdapter$ViewHolder r8 = new ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionAdapter$ViewHolder
                r9 = 1
                r0 = r8
                r1 = r15
                r2 = r11
                r4 = r5
                r5 = r6
                r6 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r8
            L11e:
                android.widget.LinearLayout r11 = new android.widget.LinearLayout
                android.content.Context r12 = r16.getContext()
                r11.<init>(r12)
                r11.setOrientation(r6)
                r11.setGravity(r5)
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r12 = r7.this$0
                int r12 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m389$$Nest$mdp(r12, r3)
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r13 = r7.this$0
                int r13 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m389$$Nest$mdp(r13, r2)
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r14 = r7.this$0
                int r3 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m389$$Nest$mdp(r14, r3)
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r14 = r7.this$0
                int r2 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m389$$Nest$mdp(r14, r2)
                r11.setPadding(r12, r13, r3, r2)
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r2 = r7.this$0
                r3 = 104(0x68, float:1.46E-43)
                int r2 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m389$$Nest$mdp(r2, r3)
                r11.setMinimumHeight(r2)
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r2 = r7.this$0
                int r3 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m397$$Nest$sfgetCOLOR_CARD_BG()
                int r12 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m399$$Nest$sfgetCOLOR_CARD_STROKE()
                android.graphics.drawable.GradientDrawable r2 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m393$$Nest$mroundedDrawable(r2, r3, r12, r5)
                r11.setBackground(r2)
                android.widget.TextView r3 = new android.widget.TextView
                android.content.Context r2 = r16.getContext()
                r3.<init>(r2)
                int r2 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m401$$Nest$sfgetCOLOR_TEXT_PRIMARY()
                r3.setTextColor(r2)
                r2 = 1098907648(0x41800000, float:16.0)
                r3.setTextSize(r4, r2)
                android.graphics.Typeface r2 = android.graphics.Typeface.DEFAULT_BOLD
                r3.setTypeface(r2)
                r3.setSingleLine(r6)
                android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
                r3.setEllipsize(r2)
                android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
                r2.<init>(r8, r10)
                r11.addView(r3, r2)
                android.widget.TextView r5 = new android.widget.TextView
                android.content.Context r2 = r16.getContext()
                r5.<init>(r2)
                int r2 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m402$$Nest$sfgetCOLOR_TEXT_SECONDARY()
                r5.setTextColor(r2)
                r5.setTextSize(r4, r1)
                r5.setSingleLine(r9)
                r5.setMaxLines(r0)
                android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
                r0.<init>(r8, r10)
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r1 = r7.this$0
                r2 = 5
                int r1 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m389$$Nest$mdp(r1, r2)
                r0.topMargin = r1
                r11.addView(r5, r0)
                android.widget.LinearLayout r0 = new android.widget.LinearLayout
                android.content.Context r1 = r16.getContext()
                r0.<init>(r1)
                r1 = 8388629(0x800015, float:1.1754973E-38)
                r0.setGravity(r1)
                android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
                r1.<init>(r8, r10)
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r2 = r7.this$0
                r4 = 12
                int r2 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m389$$Nest$mdp(r2, r4)
                r1.topMargin = r2
                r11.addView(r0, r1)
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r1 = r7.this$0
                java.lang.String r2 = "Update"
                android.widget.TextView r6 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m388$$Nest$mcreateTextButton(r1, r2, r6)
                android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r2 = r7.this$0
                r12 = 112(0x70, float:1.57E-43)
                int r2 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m389$$Nest$mdp(r2, r12)
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r12 = r7.this$0
                r13 = 44
                int r12 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m389$$Nest$mdp(r12, r13)
                r1.<init>(r2, r12)
                r0.addView(r6, r1)
                androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = new androidx.recyclerview.widget.RecyclerView$LayoutParams
                r0.<init>(r8, r10)
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r1 = r7.this$0
                r2 = 20
                int r1 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m389$$Nest$mdp(r1, r2)
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r2 = r7.this$0
                int r2 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.m389$$Nest$mdp(r2, r4)
                r0.setMargins(r1, r9, r9, r2)
                r11.setLayoutParams(r0)
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionAdapter$ViewHolder r8 = new ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionAdapter$ViewHolder
                r9 = 0
                r0 = r8
                r1 = r15
                r2 = r11
                r4 = r5
                r5 = r6
                r6 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r8
        }

        void submit(java.util.ArrayList<ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.VersionDisplayRow> r2) {
                r1 = this;
                java.util.ArrayList<ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionDisplayRow> r0 = r1.rows
                r0.clear()
                java.util.ArrayList<ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionDisplayRow> r0 = r1.rows
                r0.addAll(r2)
                r1.notifyDataSetChanged()
                return
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionAdapter-IA, reason: invalid class name */
    /* JADX INFO: compiled from: D8$$SyntheticClass */
    public final /* synthetic */ class VersionAdapterIA {
    }

    private static final class VersionDisplayRow {
        final ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.VersionGroup group;
        final ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo version;

        private VersionDisplayRow(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.VersionGroup r1, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo r2) {
                r0 = this;
                r0.<init>()
                r0.group = r1
                r0.version = r2
                return
        }

        static ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.VersionDisplayRow group(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.VersionGroup r2) {
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionDisplayRow r0 = new ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionDisplayRow
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        static ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.VersionDisplayRow version(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo r2) {
                ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionDisplayRow r0 = new ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionDisplayRow
                r1 = 0
                r0.<init>(r1, r2)
                return r0
        }
    }

    private static final class VersionGroup {
        final java.lang.String minecraftVersion;
        final java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo> versions;

        VersionGroup(java.lang.String r1, java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo> r2) {
                r0 = this;
                r0.<init>()
                r0.minecraftVersion = r1
                r0.versions = r2
                return
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$5c59j_tN-zAijaXT8ucl5Frcblk, reason: not valid java name */
    public static /* synthetic */ int m376$r8$lambda$5c59j_tNzAijaXT8ucl5Frcblk(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0, java.lang.String r1, java.lang.String r2) {
            int r0 = r0.compareMinecraftKeysDescending(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$7-a-PHhS-DRFk0OVMFKwyhJ0PMg, reason: not valid java name */
    public static /* synthetic */ void m377$r8$lambda$7aPHhSDRFk0OVMFKwyhJ0PMg(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0, androidx.appcompat.app.AlertDialog r1, android.content.DialogInterface r2) {
            r0.lambda$showMinecraftFilterDialog$8(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$ChlVp7tdpKNcE6bTInyMqguALgI(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0, java.util.ArrayList r1) {
            r0.lambda$loadVersions$4(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$HulePddouihD2wRQQKhAOXeGHI0(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.UpdateResult r1, ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.UpdateResult r2) {
            r0.lambda$runUpdate$14(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$O0POg-HEuLyauvRPWK5ScoF0Ey4, reason: not valid java name */
    public static /* synthetic */ void m378$r8$lambda$O0POgHEuLyauvRPWK5ScoF0Ey4(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0, java.lang.String r1) {
            r0.lambda$runUpdate$13(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$R7gDypP7xxICBM-n_6JAyJUVDeY, reason: not valid java name */
    public static /* synthetic */ void m379$r8$lambda$R7gDypP7xxICBMn_6JAyJUVDeY(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0, java.lang.Throwable r1) {
            r0.lambda$runUpdate$15(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$StzhSwMJlGQ9lqOsAFlaCuM2UiY(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0, android.view.View r1) {
            r0.lambda$buildLayout$3(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$WcsFAW1WIKVSGHk38_-jIFYMgpQ, reason: not valid java name */
    public static /* synthetic */ void m380$r8$lambda$WcsFAW1WIKVSGHk38_jIFYMgpQ(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0, android.content.DialogInterface r1, int r2) {
            r0.lambda$showMinecraftFilterDialog$7(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$Xun4iMSH5pkpRyE31veqNFiPsXE(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0, android.content.DialogInterface r1) {
            r0.lambda$showMinecraftFilterDialog$9(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$YJsrgwyG9HQJeVDfhXVoUQ5oiQg(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo r1, android.content.DialogInterface r2, int r3) {
            r0.lambda$confirmUpdate$10(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$_D_yvojn2jdzu0bsPpeslfURO74(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0, android.content.DialogInterface r1) {
            r0.lambda$confirmUpdate$12(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$a7r03rJJK5dtzUDU90dQVYWInfo(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0, android.view.View r1) {
            r0.lambda$buildLayout$2(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$d9rS2u5bOuATg_LoevhOFvtLa24(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0) {
            r0.lambda$loadVersions$6()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$fXo4FSIN-cQOHg71-OVj-mDtfGk, reason: not valid java name */
    public static /* synthetic */ void m381$r8$lambda$fXo4FSINcQOHg71OVjmDtfGk(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0, java.lang.Throwable r1) {
            r0.lambda$loadVersions$5(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$jB_cAZ6PpljTlYP5Yo8HLNqOYFw(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0, androidx.appcompat.app.AlertDialog r1, android.content.DialogInterface r2) {
            r0.lambda$confirmUpdate$11(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$jt_QJYLT_ma1DNWxGNVds-5UCME, reason: not valid java name */
    public static /* synthetic */ void m382$r8$lambda$jt_QJYLT_ma1DNWxGNVds5UCME(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo r1, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo r2) {
            r0.lambda$runUpdate$16(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$kMxcOt1aGP-lkJglmAPxOkau3cI, reason: not valid java name */
    public static /* synthetic */ void m383$r8$lambda$kMxcOt1aGPlkJglmAPxOkau3cI(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0, android.view.View r1) {
            r0.lambda$buildLayout$1(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$oO1p9tPGbXcjAaZXjh1uWZPjJzQ(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0, android.view.View r1) {
            r0.lambda$buildLayout$0(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$fgetallVersions, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.util.ArrayList m384$$Nest$fgetallVersions(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0) {
            java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo> r0 = r0.allVersions
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgetcollapsedGroups, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.util.HashSet m385$$Nest$fgetcollapsedGroups(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0) {
            java.util.HashSet<java.lang.String> r0 = r0.collapsedGroups
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgettextStatus, reason: not valid java name */
    static /* bridge */ /* synthetic */ android.widget.TextView m386$$Nest$fgettextStatus(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0) {
            android.widget.TextView r0 = r0.textStatus
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mconfirmUpdate, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m387$$Nest$mconfirmUpdate(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo r1) {
            r0.confirmUpdate(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mcreateTextButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ android.widget.TextView m388$$Nest$mcreateTextButton(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0, java.lang.String r1, boolean r2) {
            android.widget.TextView r0 = r0.createTextButton(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mdp, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m389$$Nest$mdp(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0, int r1) {
            int r0 = r0.dp(r1)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$misBlank, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m390$$Nest$misBlank(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0, java.lang.String r1) {
            boolean r0 = r0.isBlank(r1)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mjoin, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m391$$Nest$mjoin(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0, java.util.ArrayList r1, java.lang.String r2) {
            java.lang.String r0 = r0.join(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mresolveThemeColor, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m392$$Nest$mresolveThemeColor(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0, int r1, int r2) {
            int r0 = r0.resolveThemeColor(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mroundedDrawable, reason: not valid java name */
    static /* bridge */ /* synthetic */ android.graphics.drawable.GradientDrawable m393$$Nest$mroundedDrawable(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0, int r1, int r2, int r3) {
            android.graphics.drawable.GradientDrawable r0 = r0.roundedDrawable(r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mtoggleGroup, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m394$$Nest$mtoggleGroup(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0, java.lang.String r1) {
            r0.toggleGroup(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mtrimDate, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m395$$Nest$mtrimDate(ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity r0, java.lang.String r1) {
            java.lang.String r0 = r0.trimDate(r1)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$sfgetCOLOR_ACCENT, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m396$$Nest$sfgetCOLOR_ACCENT() {
            int r0 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.COLOR_ACCENT
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$sfgetCOLOR_CARD_BG, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m397$$Nest$sfgetCOLOR_CARD_BG() {
            int r0 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.COLOR_CARD_BG
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$sfgetCOLOR_CARD_BG_PRESSED, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m398$$Nest$sfgetCOLOR_CARD_BG_PRESSED() {
            int r0 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.COLOR_CARD_BG_PRESSED
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$sfgetCOLOR_CARD_STROKE, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m399$$Nest$sfgetCOLOR_CARD_STROKE() {
            int r0 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.COLOR_CARD_STROKE
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$sfgetCOLOR_TEXT_MUTED, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m400$$Nest$sfgetCOLOR_TEXT_MUTED() {
            int r0 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.COLOR_TEXT_MUTED
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$sfgetCOLOR_TEXT_PRIMARY, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m401$$Nest$sfgetCOLOR_TEXT_PRIMARY() {
            int r0 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.COLOR_TEXT_PRIMARY
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$sfgetCOLOR_TEXT_SECONDARY, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m402$$Nest$sfgetCOLOR_TEXT_SECONDARY() {
            int r0 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.COLOR_TEXT_SECONDARY
            return r0
    }

    static {
            r0 = 10
            r1 = 8
            r2 = 12
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.COLOR_DIALOG_BG = r0
            r0 = 25
            r1 = 24
            int r0 = android.graphics.Color.rgb(r1, r1, r0)
            ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.COLOR_CARD_BG = r0
            r0 = 35
            r2 = 30
            int r0 = android.graphics.Color.rgb(r0, r2, r1)
            ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.COLOR_CARD_BG_PRESSED = r0
            r0 = 48
            r1 = 26
            r2 = 66
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.COLOR_CARD_STROKE = r0
            r0 = 238(0xee, float:3.34E-43)
            r1 = 232(0xe8, float:3.25E-43)
            r2 = 241(0xf1, float:3.38E-43)
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.COLOR_TEXT_PRIMARY = r0
            r0 = 198(0xc6, float:2.77E-43)
            r1 = 188(0xbc, float:2.63E-43)
            r2 = 205(0xcd, float:2.87E-43)
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.COLOR_TEXT_SECONDARY = r0
            r0 = 147(0x93, float:2.06E-43)
            r1 = 132(0x84, float:1.85E-43)
            r2 = 157(0x9d, float:2.2E-43)
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.COLOR_TEXT_MUTED = r0
            r0 = 91
            r1 = 14
            r2 = 145(0x91, float:2.03E-43)
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.COLOR_ACCENT = r0
            return
    }

    public ModpackUpdateDetailsActivity() {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = ""
            r2.instanceId = r0
            r2.instanceName = r0
            r2.loader = r0
            r2.baseVersionId = r0
            r2.minecraftVersionId = r0
            r2.versionType = r0
            java.lang.String r1 = "modrinth"
            r2.projectPlatform = r1
            r2.projectId = r0
            r2.projectSlug = r0
            java.lang.String r1 = "Modpack"
            r2.projectTitle = r1
            r2.projectSummary = r0
            java.lang.String r0 = "Unknown"
            r2.currentPackVersion = r0
            ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionAdapter r0 = new ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionAdapter
            r1 = 0
            r0.<init>(r2, r1)
            r2.adapter = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.allVersions = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.filteredVersions = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.versionGroups = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.visibleRows = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.minecraftFilters = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.collapsedGroups = r0
            r0 = 1
            r2.collapseAllOnNextRebuild = r0
            java.lang.String r0 = "All Minecraft versions"
            r2.selectedFilter = r0
            return
    }

    private android.widget.LinearLayout addCard(android.widget.LinearLayout r8) {
            r7 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r7)
            r1 = 1
            r0.setOrientation(r1)
            r1 = 18
            int r2 = r7.dp(r1)
            r3 = 14
            int r4 = r7.dp(r3)
            int r5 = r7.dp(r1)
            int r6 = r7.dp(r3)
            r0.setPadding(r2, r4, r5, r6)
            int r2 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.COLOR_CARD_BG
            int r4 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.COLOR_CARD_STROKE
            android.graphics.drawable.GradientDrawable r1 = r7.roundedDrawable(r2, r4, r1)
            r0.setBackground(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = -1
            r4 = -2
            r1.<init>(r2, r4)
            r2 = 12
            int r2 = r7.dp(r2)
            int r3 = r7.dp(r3)
            r4 = 0
            r1.setMargins(r4, r2, r4, r3)
            r8.addView(r0, r1)
            return r0
    }

    private void addCardText(android.widget.LinearLayout r2, java.lang.String r3, int r4, int r5) {
            r1 = this;
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r1)
            r0.setText(r3)
            r0.setTextColor(r4)
            r3 = 2
            float r4 = (float) r5
            r0.setTextSize(r3, r4)
            r3 = 0
            r0.setSingleLine(r3)
            r4 = 4
            int r4 = r1.dp(r4)
            r0.setPadding(r3, r3, r3, r4)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = -1
            r5 = -2
            r3.<init>(r4, r5)
            r2.addView(r0, r3)
            return
    }

    private void addCardTitle(android.widget.LinearLayout r4, java.lang.String r5) {
            r3 = this;
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r3)
            r0.setText(r5)
            int r5 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.COLOR_TEXT_PRIMARY
            r0.setTextColor(r5)
            r5 = 2
            r1 = 1099956224(0x41900000, float:18.0)
            r0.setTextSize(r5, r1)
            android.graphics.Typeface r5 = android.graphics.Typeface.DEFAULT_BOLD
            r0.setTypeface(r5)
            r5 = 6
            int r5 = r3.dp(r5)
            r1 = 0
            r0.setPadding(r1, r1, r1, r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r1 = -1
            r2 = -2
            r5.<init>(r1, r2)
            r4.addView(r0, r5)
            return
    }

    private void addVersionPart(java.util.ArrayList<java.lang.Integer> r1, java.lang.String r2) {
            r0 = this;
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> Lc
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> Lc
            r1.add(r2)     // Catch: java.lang.Throwable -> Lc
            goto L14
        Lc:
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.add(r2)
        L14:
            return
    }

    private void applyFilter() {
            r3 = this;
            java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo> r0 = r3.filteredVersions
            r0.clear()
            java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo> r0 = r3.allVersions
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo r1 = (ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo) r1
            java.lang.String r2 = r3.selectedFilter
            boolean r2 = r3.matchesFilter(r1, r2)
            if (r2 == 0) goto Lb
            java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo> r2 = r3.filteredVersions
            r2.add(r1)
            goto Lb
        L25:
            r3.rebuildVersionGroups()
            r3.refreshVisibleRows()
            return
    }

    private java.lang.String buildFilterSummary(int r4, int r5) {
            r3 = this;
            java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo> r4 = r3.allVersions
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto Lb
            java.lang.String r4 = "No versions were found for this modpack."
            return r4
        Lb:
            java.lang.String r4 = r3.selectedFilter
            java.lang.String r0 = "All Minecraft versions"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L16
            goto L27
        L16:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Minecraft "
            r4.<init>(r0)
            java.lang.String r0 = r3.selectedFilter
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r0 = r4.toString()
        L27:
            java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo> r4 = r3.filteredVersions
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L43
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r5 = " · No matching versions"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            return r4
        L43:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r0 = " · "
            java.lang.StringBuilder r4 = r4.append(r0)
            java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo> r1 = r3.filteredVersions
            int r1 = r1.size()
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r1 = " versions · "
            java.lang.StringBuilder r4 = r4.append(r1)
            java.util.ArrayList<ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionGroup> r1 = r3.versionGroups
            int r1 = r1.size()
            java.lang.StringBuilder r4 = r4.append(r1)
            java.util.ArrayList<ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionGroup> r1 = r3.versionGroups
            int r1 = r1.size()
            r2 = 1
            if (r1 != r2) goto L78
            java.lang.String r1 = " group"
            goto L7a
        L78:
            java.lang.String r1 = " groups"
        L7a:
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            if (r5 <= 0) goto L9f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = " hidden"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
        L9f:
            return r4
    }

    private void buildLayout() {
            r16 = this;
            r0 = r16
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r0)
            r2 = 1
            r1.setOrientation(r2)
            int r3 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.COLOR_DIALOG_BG
            r1.setBackgroundColor(r3)
            r3 = 20
            int r4 = r0.dp(r3)
            r5 = 14
            int r5 = r0.dp(r5)
            r6 = 12
            int r7 = r0.dp(r6)
            r1.setPadding(r4, r5, r4, r7)
            r0.setContentView(r1)
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            r4.<init>(r0)
            r5 = 0
            r4.setOrientation(r5)
            r7 = 16
            r4.setGravity(r7)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r9 = -1
            r10 = -2
            r8.<init>(r9, r10)
            r1.addView(r4, r8)
            java.lang.String r8 = "‹"
            android.widget.TextView r8 = r0.createTextButton(r8, r5)
            r11 = 1107296256(0x42000000, float:32.0)
            r12 = 2
            r8.setTextSize(r12, r11)
            ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$$ExternalSyntheticLambda16 r11 = new ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$$ExternalSyntheticLambda16
            r11.<init>(r0)
            r8.setOnClickListener(r11)
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            r13 = 56
            int r14 = r0.dp(r13)
            int r13 = r0.dp(r13)
            r11.<init>(r14, r13)
            r4.addView(r8, r11)
            android.widget.LinearLayout r8 = new android.widget.LinearLayout
            r8.<init>(r0)
            r8.setOrientation(r2)
            int r11 = r0.dp(r6)
            r8.setPadding(r11, r5, r5, r5)
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            r13 = 1065353216(0x3f800000, float:1.0)
            r11.<init>(r5, r10, r13)
            r4.addView(r8, r11)
            android.widget.TextView r4 = new android.widget.TextView
            r4.<init>(r0)
            r0.textTitle = r4
            java.lang.String r11 = r0.projectTitle
            r4.setText(r11)
            android.widget.TextView r4 = r0.textTitle
            int r11 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.COLOR_TEXT_PRIMARY
            r4.setTextColor(r11)
            android.widget.TextView r4 = r0.textTitle
            r11 = 1103626240(0x41c80000, float:25.0)
            r4.setTextSize(r12, r11)
            android.widget.TextView r4 = r0.textTitle
            android.graphics.Typeface r11 = android.graphics.Typeface.DEFAULT_BOLD
            r4.setTypeface(r11)
            android.widget.TextView r4 = r0.textTitle
            r4.setSingleLine(r2)
            android.widget.TextView r4 = r0.textTitle
            android.text.TextUtils$TruncateAt r11 = android.text.TextUtils.TruncateAt.END
            r4.setEllipsize(r11)
            android.widget.TextView r4 = r0.textTitle
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            r11.<init>(r9, r10)
            r8.addView(r4, r11)
            android.widget.TextView r4 = new android.widget.TextView
            r4.<init>(r0)
            r0.textMeta = r4
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r14 = r16.getPlatformLabel()
            java.lang.StringBuilder r11 = r11.append(r14)
            java.lang.String r14 = " update · Current pack: "
            java.lang.StringBuilder r11 = r11.append(r14)
            java.lang.String r14 = r0.currentPackVersion
            java.lang.StringBuilder r11 = r11.append(r14)
            java.lang.String r14 = " · Instance: "
            java.lang.StringBuilder r11 = r11.append(r14)
            java.lang.String r14 = r0.instanceName
            java.lang.StringBuilder r11 = r11.append(r14)
            java.lang.String r11 = r11.toString()
            r4.setText(r11)
            android.widget.TextView r4 = r0.textMeta
            int r11 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.COLOR_TEXT_SECONDARY
            r4.setTextColor(r11)
            android.widget.TextView r4 = r0.textMeta
            r14 = 1095761920(0x41500000, float:13.0)
            r4.setTextSize(r12, r14)
            android.widget.TextView r4 = r0.textMeta
            r4.setSingleLine(r5)
            android.widget.TextView r4 = r0.textMeta
            android.widget.LinearLayout$LayoutParams r15 = new android.widget.LinearLayout$LayoutParams
            r15.<init>(r9, r10)
            r8.addView(r4, r15)
            android.widget.LinearLayout r4 = r0.addCard(r1)
            java.lang.String r8 = "Worlds are preserved"
            r0.addCardTitle(r4, r8)
            int r8 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.COLOR_TEXT_MUTED
            java.lang.String r15 = "Existing saves stay in place. If the new pack includes saves, they are installed too. Conflicting bundled worlds are copied with a new name."
            r0.addCardText(r4, r15, r8, r6)
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            r4.<init>(r0)
            r4.setOrientation(r2)
            int r15 = r0.dp(r12)
            r3 = 10
            int r2 = r0.dp(r3)
            r4.setPadding(r5, r15, r5, r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r9, r10)
            r1.addView(r4, r2)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r0)
            r2.setOrientation(r5)
            r2.setGravity(r7)
            android.widget.LinearLayout$LayoutParams r15 = new android.widget.LinearLayout$LayoutParams
            r15.<init>(r9, r10)
            r4.addView(r2, r15)
            java.lang.String r15 = "All Minecraft versions"
            android.widget.TextView r15 = r0.createTextButton(r15, r5)
            r0.buttonFilter = r15
            r15.setGravity(r7)
            android.widget.TextView r15 = r0.buttonFilter
            ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$$ExternalSyntheticLambda17 r7 = new ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$$ExternalSyntheticLambda17
            r7.<init>(r0)
            r15.setOnClickListener(r7)
            android.widget.TextView r7 = r0.buttonFilter
            android.widget.LinearLayout$LayoutParams r15 = new android.widget.LinearLayout$LayoutParams
            r3 = 50
            int r3 = r0.dp(r3)
            r15.<init>(r5, r3, r13)
            r2.addView(r7, r15)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r0)
            r0.textPageIndicator = r3
            java.lang.String r7 = "Grouped by Minecraft version"
            r3.setText(r7)
            android.widget.TextView r3 = r0.textPageIndicator
            r3.setTextColor(r8)
            android.widget.TextView r3 = r0.textPageIndicator
            r3.setTextSize(r12, r14)
            android.widget.TextView r3 = r0.textPageIndicator
            r7 = 8388629(0x800015, float:1.1754973E-38)
            r3.setGravity(r7)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r8 = 170(0xaa, float:2.38E-43)
            int r8 = r0.dp(r8)
            r3.<init>(r8, r10)
            int r8 = r0.dp(r6)
            r3.leftMargin = r8
            android.widget.TextView r8 = r0.textPageIndicator
            r2.addView(r8, r3)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r0)
            r2.setOrientation(r5)
            r2.setGravity(r7)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r9, r10)
            r7 = 10
            int r8 = r0.dp(r7)
            r3.topMargin = r8
            r4.addView(r2, r3)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r0)
            r0.textFilterSummary = r3
            java.lang.String r4 = "Loading versions..."
            r3.setText(r4)
            android.widget.TextView r3 = r0.textFilterSummary
            r3.setTextColor(r11)
            android.widget.TextView r3 = r0.textFilterSummary
            r3.setTextSize(r12, r14)
            android.widget.TextView r3 = r0.textFilterSummary
            r3.setSingleLine(r5)
            android.widget.TextView r3 = r0.textFilterSummary
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r7.<init>(r5, r10, r13)
            r2.addView(r3, r7)
            java.lang.String r3 = "Collapse all"
            android.widget.TextView r3 = r0.createTextButton(r3, r5)
            r0.buttonPrevious = r3
            ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$$ExternalSyntheticLambda1 r7 = new ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$$ExternalSyntheticLambda1
            r7.<init>(r0)
            r3.setOnClickListener(r7)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r7 = 132(0x84, float:1.85E-43)
            int r7 = r0.dp(r7)
            r8 = 46
            int r15 = r0.dp(r8)
            r3.<init>(r7, r15)
            int r7 = r0.dp(r6)
            r3.leftMargin = r7
            android.widget.TextView r7 = r0.buttonPrevious
            r2.addView(r7, r3)
            java.lang.String r3 = "Expand all"
            r7 = 1
            android.widget.TextView r3 = r0.createTextButton(r3, r7)
            r0.buttonNext = r3
            ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$$ExternalSyntheticLambda2 r7 = new ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$$ExternalSyntheticLambda2
            r7.<init>(r0)
            r3.setOnClickListener(r7)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r7 = 122(0x7a, float:1.71E-43)
            int r7 = r0.dp(r7)
            int r8 = r0.dp(r8)
            r3.<init>(r7, r8)
            r7 = 8
            int r8 = r0.dp(r7)
            r3.leftMargin = r8
            android.widget.TextView r8 = r0.buttonNext
            r2.addView(r8, r3)
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            r2.<init>(r0)
            int r3 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.COLOR_CARD_BG
            int r8 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.COLOR_CARD_STROKE
            r15 = 20
            android.graphics.drawable.GradientDrawable r3 = r0.roundedDrawable(r3, r8, r15)
            r2.setBackground(r3)
            int r3 = r0.dp(r6)
            int r8 = r0.dp(r6)
            int r15 = r0.dp(r6)
            int r12 = r0.dp(r6)
            r2.setPadding(r3, r8, r15, r12)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r9, r5, r13)
            r1.addView(r2, r3)
            androidx.recyclerview.widget.RecyclerView r3 = new androidx.recyclerview.widget.RecyclerView
            r3.<init>(r0)
            r0.recyclerVersions = r3
            androidx.recyclerview.widget.LinearLayoutManager r8 = new androidx.recyclerview.widget.LinearLayoutManager
            r8.<init>(r0)
            r3.setLayoutManager(r8)
            androidx.recyclerview.widget.RecyclerView r3 = r0.recyclerVersions
            r8 = 1
            r3.setNestedScrollingEnabled(r8)
            androidx.recyclerview.widget.RecyclerView r3 = r0.recyclerVersions
            r3.setClipToPadding(r5)
            androidx.recyclerview.widget.RecyclerView r3 = r0.recyclerVersions
            int r8 = r0.dp(r6)
            r3.setPadding(r5, r5, r5, r8)
            androidx.recyclerview.widget.RecyclerView r3 = r0.recyclerVersions
            ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionAdapter r8 = r0.adapter
            r3.setAdapter(r8)
            androidx.recyclerview.widget.RecyclerView r3 = r0.recyclerVersions
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r8.<init>(r9, r9)
            r2.addView(r3, r8)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r0)
            r2.setOrientation(r5)
            r3 = 16
            r2.setGravity(r3)
            r3 = 4
            int r8 = r0.dp(r3)
            r12 = 10
            int r12 = r0.dp(r12)
            int r3 = r0.dp(r3)
            r2.setPadding(r8, r12, r3, r5)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r9, r10)
            r1.addView(r2, r3)
            android.widget.ProgressBar r1 = new android.widget.ProgressBar
            r1.<init>(r0)
            r0.progressBar = r1
            r3 = 1
            r1.setIndeterminate(r3)
            android.widget.ProgressBar r1 = r0.progressBar
            r1.setVisibility(r7)
            android.widget.ProgressBar r1 = r0.progressBar
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r7 = 28
            int r8 = r0.dp(r7)
            int r7 = r0.dp(r7)
            r3.<init>(r8, r7)
            r2.addView(r1, r3)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r0)
            r0.textStatus = r1
            r1.setText(r4)
            android.widget.TextView r1 = r0.textStatus
            r1.setTextColor(r11)
            android.widget.TextView r1 = r0.textStatus
            r3 = 2
            r1.setTextSize(r3, r14)
            android.widget.TextView r1 = r0.textStatus
            int r3 = r0.dp(r6)
            r1.setPadding(r3, r5, r5, r5)
            android.widget.TextView r1 = r0.textStatus
            r1.setSingleLine(r5)
            android.widget.TextView r1 = r0.textStatus
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r5, r10, r13)
            r2.addView(r1, r3)
            return
    }

    private int compareMinecraftKeysDescending(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.lang.String r0 = "Unknown Minecraft version"
            boolean r1 = r0.equalsIgnoreCase(r3)
            boolean r0 = r0.equalsIgnoreCase(r4)
            if (r1 == 0) goto L10
            if (r0 == 0) goto L10
            r3 = 0
            return r3
        L10:
            if (r1 == 0) goto L14
            r3 = 1
            return r3
        L14:
            if (r0 == 0) goto L18
            r3 = -1
            return r3
        L18:
            int r0 = r2.compareVersionLabelsDescending(r3, r4)
            if (r0 == 0) goto L1f
            return r0
        L1f:
            int r3 = r4.compareToIgnoreCase(r3)
            return r3
    }

    private int compareVersionLabelsDescending(java.lang.String r8, java.lang.String r9) {
            r7 = this;
            java.lang.String r0 = ""
            if (r8 != 0) goto L6
            r8 = r0
            goto La
        L6:
            java.lang.String r8 = r8.trim()
        La:
            if (r9 != 0) goto Ld
            goto L11
        Ld:
            java.lang.String r0 = r9.trim()
        L11:
            boolean r9 = r8.isEmpty()
            r1 = 0
            if (r9 == 0) goto L1f
            boolean r9 = r0.isEmpty()
            if (r9 == 0) goto L1f
            return r1
        L1f:
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L27
            r8 = 1
            return r8
        L27:
            boolean r9 = r0.isEmpty()
            if (r9 == 0) goto L2f
            r8 = -1
            return r8
        L2f:
            java.util.ArrayList r9 = r7.extractVersionNumberParts(r8)
            java.util.ArrayList r2 = r7.extractVersionNumberParts(r0)
            int r3 = r9.size()
            int r4 = r2.size()
            int r3 = java.lang.Math.max(r3, r4)
            r4 = r1
        L44:
            if (r4 >= r3) goto L74
            int r5 = r9.size()
            if (r4 >= r5) goto L57
            java.lang.Object r5 = r9.get(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            goto L58
        L57:
            r5 = r1
        L58:
            int r6 = r2.size()
            if (r4 >= r6) goto L69
            java.lang.Object r6 = r2.get(r4)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            goto L6a
        L69:
            r6 = r1
        L6a:
            if (r5 == r6) goto L71
            int r8 = java.lang.Integer.compare(r6, r5)
            return r8
        L71:
            int r4 = r4 + 1
            goto L44
        L74:
            int r8 = r0.compareToIgnoreCase(r8)
            return r8
    }

    private void confirmUpdate(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Update "
            r0.<init>(r1)
            java.lang.String r1 = r3.instanceName
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.String r2 = " with this modpack version?\n\nSelected version:\n"
            r1.append(r2)
            java.lang.String r1 = r4.versionLabel
            r0.append(r1)
            java.lang.String r1 = "\nMinecraft "
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.String r2 = r4.getMinecraftVersionsLabel()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " · "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r4.getLoadersLabel()
            r1.append(r2)
            java.lang.String r1 = r4.datePublished
            boolean r1 = r3.isBlank(r1)
            if (r1 != 0) goto L49
            java.lang.String r1 = "\n"
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.String r2 = r4.datePublished
            java.lang.String r2 = r3.trimDate(r2)
            r1.append(r2)
        L49:
            java.lang.String r1 = "\n\nBack up your worlds before updating. Modpack updates can replace configs and other pack-managed files.\n\nThe old mods, shaderpacks, and resourcepacks folders will be deleted and rebuilt from the selected pack so stale files do not survive the update.\n\nExisting saves stay in place. If this pack includes saves, those saves are installed too. Conflicting bundled worlds are copied with a new name instead of overwriting your worlds."
            r0.append(r1)
            androidx.appcompat.app.AlertDialog$Builder r1 = new androidx.appcompat.app.AlertDialog$Builder
            r1.<init>(r3)
            java.lang.String r2 = "Update Modpack"
            androidx.appcompat.app.AlertDialog$Builder r1 = r1.setTitle(r2)
            java.lang.String r0 = r0.toString()
            androidx.appcompat.app.AlertDialog$Builder r0 = r1.setMessage(r0)
            r1 = 17039360(0x1040000, float:2.424457E-38)
            r2 = 0
            androidx.appcompat.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$$ExternalSyntheticLambda13 r1 = new ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$$ExternalSyntheticLambda13
            r1.<init>(r3, r4)
            java.lang.String r4 = "Update"
            androidx.appcompat.app.AlertDialog$Builder r4 = r0.setPositiveButton(r4, r1)
            androidx.appcompat.app.AlertDialog r4 = r4.create()
            ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$$ExternalSyntheticLambda14 r0 = new ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$$ExternalSyntheticLambda14
            r0.<init>(r3, r4)
            r4.setOnShowListener(r0)
            ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$$ExternalSyntheticLambda15 r0 = new ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$$ExternalSyntheticLambda15
            r0.<init>(r3)
            r4.setOnDismissListener(r0)
            r4.show()
            return
    }

    private boolean containsIgnoreCase(java.util.ArrayList<java.lang.String> r2, java.lang.String r3) {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L4
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L4
            r2 = 1
            return r2
        L1a:
            r2 = 0
            return r2
    }

    private int countForFilter(java.lang.String r4) {
            r3 = this;
            java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo> r0 = r3.allVersions
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1c
            java.lang.Object r2 = r0.next()
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo r2 = (ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo) r2
            boolean r2 = r3.matchesFilter(r2, r4)
            if (r2 == 0) goto L7
            int r1 = r1 + 1
            goto L7
        L1c:
            return r1
    }

    public static android.content.Intent createIntent(android.content.Context r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.io.File r11, java.io.File r12, java.io.File r13, boolean r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity> r1 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.class
            r2 = r4
            r0.<init>(r4, r1)
            java.lang.String r1 = ""
            if (r5 != 0) goto Le
            r2 = r1
            goto Lf
        Le:
            r2 = r5
        Lf:
            java.lang.String r3 = "ca.dnamobile.javalauncher.extra.INSTANCE_ID"
            r0.putExtra(r3, r2)
            java.lang.String r2 = "ca.dnamobile.javalauncher.extra.INSTANCE_NAME"
            r3 = r6
            r0.putExtra(r2, r6)
            java.lang.String r2 = "ca.dnamobile.javalauncher.extra.INSTANCE_LOADER"
            r3 = r7
            r0.putExtra(r2, r7)
            java.lang.String r2 = "ca.dnamobile.javalauncher.extra.BASE_VERSION_ID"
            r3 = r8
            r0.putExtra(r2, r8)
            java.lang.String r2 = "ca.dnamobile.javalauncher.extra.MINECRAFT_VERSION_ID"
            r3 = r9
            r0.putExtra(r2, r9)
            java.lang.String r2 = "ca.dnamobile.javalauncher.extra.VERSION_TYPE"
            r3 = r10
            r0.putExtra(r2, r10)
            if (r11 != 0) goto L36
            r2 = r1
            goto L3a
        L36:
            java.lang.String r2 = r11.getAbsolutePath()
        L3a:
            java.lang.String r3 = "ca.dnamobile.javalauncher.extra.ROOT_DIRECTORY"
            r0.putExtra(r3, r2)
            java.lang.String r2 = "ca.dnamobile.javalauncher.extra.GAME_DIRECTORY"
            java.lang.String r3 = r12.getAbsolutePath()
            r0.putExtra(r2, r3)
            if (r13 != 0) goto L4b
            goto L4f
        L4b:
            java.lang.String r1 = r13.getAbsolutePath()
        L4f:
            java.lang.String r2 = "ca.dnamobile.javalauncher.extra.ICON_FILE"
            r0.putExtra(r2, r1)
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.ISOLATED"
            r2 = r14
            r0.putExtra(r1, r14)
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.MODPACK_UPDATE_PLATFORM"
            r2 = r15
            r0.putExtra(r1, r15)
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.MODPACK_UPDATE_PROJECT_ID"
            r2 = r16
            r0.putExtra(r1, r2)
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.MODPACK_UPDATE_PROJECT_SLUG"
            r2 = r17
            r0.putExtra(r1, r2)
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.MODPACK_UPDATE_PROJECT_TITLE"
            r2 = r18
            r0.putExtra(r1, r2)
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.MODPACK_UPDATE_PROJECT_SUMMARY"
            r2 = r19
            r0.putExtra(r1, r2)
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.MODPACK_UPDATE_CURRENT_VERSION"
            r2 = r20
            r0.putExtra(r1, r2)
            return r0
    }

    private ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.ProjectMatch createProjectMatch() {
            r7 = this;
            java.lang.String r0 = r7.projectPlatform
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r1 = r7.toPlatform(r0)
            java.lang.String r2 = r7.projectId
            java.lang.String r3 = r7.projectTitle
            java.lang.String r4 = r7.projectSlug
            java.lang.String r5 = r7.projectSummary
            r6 = 1
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$ProjectMatch r0 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.createProjectMatch(r1, r2, r3, r4, r5, r6)
            return r0
    }

    private android.widget.TextView createTextButton(java.lang.String r6, boolean r7) {
            r5 = this;
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r5)
            r0.setText(r6)
            r6 = 17
            r0.setGravity(r6)
            r6 = 2
            r1 = 1096810496(0x41600000, float:14.0)
            r0.setTextSize(r6, r1)
            android.graphics.Typeface r6 = android.graphics.Typeface.DEFAULT_BOLD
            r0.setTypeface(r6)
            r6 = 1
            r0.setSingleLine(r6)
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            r0.setEllipsize(r1)
            r1 = 16843829(0x1010435, float:2.3696576E-38)
            int r2 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.COLOR_ACCENT
            int r1 = r5.resolveThemeColor(r1, r2)
            if (r7 == 0) goto L2f
            int r2 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.COLOR_TEXT_PRIMARY
            goto L30
        L2f:
            r2 = r1
        L30:
            r0.setTextColor(r2)
            r2 = 16
            int r3 = r5.dp(r2)
            int r2 = r5.dp(r2)
            r4 = 0
            r0.setPadding(r3, r4, r2, r4)
            if (r7 == 0) goto L44
            r4 = r1
        L44:
            r7 = 18
            android.graphics.drawable.GradientDrawable r7 = r5.roundedDrawable(r4, r1, r7)
            r0.setBackground(r7)
            r0.setClickable(r6)
            r0.setFocusable(r6)
            return r0
    }

    private int dp(int r2) {
            r1 = this;
            float r2 = (float) r2
            android.content.res.Resources r0 = r1.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r2 = r2 * r0
            int r2 = java.lang.Math.round(r2)
            return r2
    }

    private java.util.ArrayList<java.lang.Integer> extractVersionNumberParts(java.lang.String r7) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            r3 = r2
        Lc:
            int r4 = r7.length()
            if (r3 >= r4) goto L33
            char r4 = r7.charAt(r3)
            boolean r5 = java.lang.Character.isDigit(r4)
            if (r5 == 0) goto L20
            r1.append(r4)
            goto L30
        L20:
            int r4 = r1.length()
            if (r4 <= 0) goto L30
            java.lang.String r4 = r1.toString()
            r6.addVersionPart(r0, r4)
            r1.setLength(r2)
        L30:
            int r3 = r3 + 1
            goto Lc
        L33:
            int r7 = r1.length()
            if (r7 <= 0) goto L40
            java.lang.String r7 = r1.toString()
            r6.addVersionPart(r0, r7)
        L40:
            return r0
    }

    private void finishUpdate(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.UpdateResult r6, ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.UpdateResult r7) {
            r5 = this;
            android.view.Window r0 = r5.getWindow()
            r1 = 128(0x80, float:1.8E-43)
            r0.clearFlags(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r5.recyclerVersions
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
            r0 = 0
            java.lang.String r1 = "Update complete."
            r5.setBusy(r0, r1)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = ""
            if (r7 == 0) goto L88
            java.lang.String r2 = r7.loader
            r5.loader = r2
            java.lang.String r2 = r7.baseVersionId
            r5.baseVersionId = r2
            java.lang.String r2 = r7.minecraftVersionId
            r5.minecraftVersionId = r2
            java.lang.String r2 = r7.versionType
            r5.versionType = r2
            java.lang.String r2 = "ca.dnamobile.javalauncher.extra.INSTANCE_LOADER"
            java.lang.String r3 = r7.loader
            r0.putExtra(r2, r3)
            java.lang.String r2 = "ca.dnamobile.javalauncher.extra.BASE_VERSION_ID"
            java.lang.String r3 = r7.baseVersionId
            r0.putExtra(r2, r3)
            java.lang.String r2 = "ca.dnamobile.javalauncher.extra.MINECRAFT_VERSION_ID"
            java.lang.String r3 = r7.minecraftVersionId
            r0.putExtra(r2, r3)
            java.lang.String r2 = "ca.dnamobile.javalauncher.extra.VERSION_TYPE"
            java.lang.String r3 = r7.versionType
            r0.putExtra(r2, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = " · Minecraft "
            r2.<init>(r3)
            java.lang.String r3 = r7.minecraftVersionId
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r7.loaderVersion
            boolean r3 = r5.isBlank(r3)
            if (r3 == 0) goto L62
            r7 = r1
            goto L7f
        L62:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = " · "
            r3.<init>(r4)
            java.lang.String r4 = r7.loader
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r7 = r7.loaderVersion
            java.lang.StringBuilder r7 = r3.append(r7)
            java.lang.String r7 = r7.toString()
        L7f:
            java.lang.StringBuilder r7 = r2.append(r7)
            java.lang.String r7 = r7.toString()
            goto L89
        L88:
            r7 = r1
        L89:
            int r2 = r6.removedOldFiles
            r3 = 1
            if (r2 > 0) goto L8f
            goto Lb3
        L8f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = " · removed "
            r1.<init>(r2)
            int r2 = r6.removedOldFiles
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " old "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r6.removedOldFiles
            if (r2 != r3) goto La9
            java.lang.String r2 = "file"
            goto Lab
        La9:
            java.lang.String r2 = "files"
        Lab:
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
        Lb3:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Modpack updated to "
            r2.<init>(r4)
            java.lang.String r6 = r6.versionLabel
            java.lang.StringBuilder r6 = r2.append(r6)
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r6 = r6.toString()
            r7 = -1
            r5.setResult(r7, r0)
            android.widget.Toast r6 = android.widget.Toast.makeText(r5, r6, r3)
            r6.show()
            r5.finish()
            return
    }

    private java.lang.String getPlatformLabel() {
            r1 = this;
            java.lang.String r0 = r1.projectPlatform
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r0 = r1.toPlatform(r0)
            java.lang.String r0 = r0.displayName
            return r0
    }

    private boolean isBlank(java.lang.String r1) {
            r0 = this;
            if (r1 == 0) goto Lf
            java.lang.String r1 = r1.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            goto L10
        Lf:
            r1 = 1
        L10:
            return r1
    }

    private java.lang.String join(java.util.ArrayList<java.lang.String> r4, java.lang.String r5) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L9:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L9
            java.lang.String r2 = r1.trim()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L22
            goto L9
        L22:
            int r2 = r0.length()
            if (r2 <= 0) goto L2b
            r0.append(r5)
        L2b:
            java.lang.String r1 = r1.trim()
            r0.append(r1)
            goto L9
        L33:
            java.lang.String r4 = r0.toString()
            return r4
    }

    private /* synthetic */ void lambda$buildLayout$0(android.view.View r1) {
            r0 = this;
            r0.finish()
            return
    }

    private /* synthetic */ void lambda$buildLayout$1(android.view.View r1) {
            r0 = this;
            r0.showMinecraftFilterDialog()
            return
    }

    private /* synthetic */ void lambda$buildLayout$2(android.view.View r1) {
            r0 = this;
            r1 = 1
            r0.setAllGroupsCollapsed(r1)
            return
    }

    private /* synthetic */ void lambda$buildLayout$3(android.view.View r1) {
            r0 = this;
            r1 = 0
            r0.setAllGroupsCollapsed(r1)
            return
    }

    private /* synthetic */ void lambda$confirmUpdate$10(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo r1, android.content.DialogInterface r2, int r3) {
            r0 = this;
            r0.runUpdate(r1)
            return
    }

    private /* synthetic */ void lambda$confirmUpdate$11(androidx.appcompat.app.AlertDialog r1, android.content.DialogInterface r2) {
            r0 = this;
            r0.styleDialog(r1)
            return
    }

    private /* synthetic */ void lambda$confirmUpdate$12(android.content.DialogInterface r1) {
            r0 = this;
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r0)
            return
    }

    private /* synthetic */ void lambda$loadVersions$4(java.util.ArrayList r3) {
            r2 = this;
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L9
            java.lang.String r0 = "No versions were returned."
            goto L20
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " versions loaded."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
        L20:
            r1 = 0
            r2.setBusy(r1, r0)
            r2.submitVersions(r3)
            return
    }

    private /* synthetic */ void lambda$loadVersions$5(java.lang.Throwable r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to load versions: "
            r0.<init>(r1)
            java.lang.String r1 = r2.readableError(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            r2.setBusy(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to load modpack versions: "
            r0.<init>(r1)
            java.lang.String r3 = r2.readableError(r3)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r0 = 1
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r0)
            r3.show()
            return
    }

    private /* synthetic */ void lambda$loadVersions$6() {
            r3 = this;
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$ProjectMatch r0 = r3.createProjectMatch()     // Catch: java.lang.Throwable -> L16
            ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$1 r1 = new ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$1     // Catch: java.lang.Throwable -> L16
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L16
            java.util.ArrayList r0 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.loadVersions(r0, r1)     // Catch: java.lang.Throwable -> L16
            ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$$ExternalSyntheticLambda3 r1 = new ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$$ExternalSyntheticLambda3     // Catch: java.lang.Throwable -> L16
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L16
            r3.runOnUiThread(r1)     // Catch: java.lang.Throwable -> L16
            goto L26
        L16:
            r0 = move-exception
            java.lang.String r1 = "ModpackUpdateDetails"
            java.lang.String r2 = "Unable to load modpack versions"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r2, r0)
            ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$$ExternalSyntheticLambda4 r1 = new ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$$ExternalSyntheticLambda4
            r1.<init>(r3, r0)
            r3.runOnUiThread(r1)
        L26:
            return
    }

    private /* synthetic */ void lambda$runUpdate$13(java.lang.String r4) {
            r3 = this;
            android.widget.TextView r0 = r3.textStatus
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Updating instance to Minecraft "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = "..."
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.setText(r4)
            return
    }

    private /* synthetic */ void lambda$runUpdate$14(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.UpdateResult r1, ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.UpdateResult r2) {
            r0 = this;
            r0.finishUpdate(r1, r2)
            return
    }

    private /* synthetic */ void lambda$runUpdate$15(java.lang.Throwable r4) {
            r3 = this;
            android.view.Window r0 = r3.getWindow()
            r1 = 128(0x80, float:1.8E-43)
            r0.clearFlags(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r3.recyclerVersions
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Modpack update failed: "
            r0.<init>(r1)
            java.lang.String r2 = r3.readableError(r4)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r2 = 0
            r3.setBusy(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r4 = r3.readableError(r4)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            r0 = 1
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r0)
            r4.show()
            return
    }

    private /* synthetic */ void lambda$runUpdate$16(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo r10, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo r11) {
            r9 = this;
            java.io.File r1 = r9.rootDirectory     // Catch: java.lang.Throwable -> L5d
            java.io.File r2 = r9.gameDirectory     // Catch: java.lang.Throwable -> L5d
            java.lang.String r3 = r9.minecraftVersionId     // Catch: java.lang.Throwable -> L5d
            java.lang.String r4 = r9.loader     // Catch: java.lang.Throwable -> L5d
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$ProjectMatch r6 = r9.createProjectMatch()     // Catch: java.lang.Throwable -> L5d
            ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$2 r8 = new ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$2     // Catch: java.lang.Throwable -> L5d
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L5d
            r0 = r9
            r5 = r10
            r7 = r11
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$UpdateResult r10 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.updateInstalledModpack(r0, r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L5d
            boolean r11 = r9.shouldUpdateInstanceBaseForModpack(r10)     // Catch: java.lang.Throwable -> L5d
            if (r11 == 0) goto L53
            java.lang.String r11 = r10.loader     // Catch: java.lang.Throwable -> L5d
            boolean r11 = r9.isBlank(r11)     // Catch: java.lang.Throwable -> L5d
            if (r11 == 0) goto L29
            java.lang.String r11 = r9.loader     // Catch: java.lang.Throwable -> L5d
            goto L2b
        L29:
            java.lang.String r11 = r10.loader     // Catch: java.lang.Throwable -> L5d
        L2b:
            r4 = r11
            java.lang.String r11 = r10.minecraftVersion     // Catch: java.lang.Throwable -> L5d
            boolean r11 = r9.isBlank(r11)     // Catch: java.lang.Throwable -> L5d
            if (r11 == 0) goto L37
            java.lang.String r11 = r9.minecraftVersionId     // Catch: java.lang.Throwable -> L5d
            goto L39
        L37:
            java.lang.String r11 = r10.minecraftVersion     // Catch: java.lang.Throwable -> L5d
        L39:
            r5 = r11
            ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$$ExternalSyntheticLambda10 r11 = new ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$$ExternalSyntheticLambda10     // Catch: java.lang.Throwable -> L5d
            r11.<init>(r9, r5)     // Catch: java.lang.Throwable -> L5d
            r9.runOnUiThread(r11)     // Catch: java.lang.Throwable -> L5d
            java.io.File r1 = r9.rootDirectory     // Catch: java.lang.Throwable -> L5d
            java.io.File r2 = r9.gameDirectory     // Catch: java.lang.Throwable -> L5d
            java.lang.String r3 = r9.instanceName     // Catch: java.lang.Throwable -> L5d
            ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$3 r6 = new ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$3     // Catch: java.lang.Throwable -> L5d
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L5d
            r0 = r9
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$UpdateResult r11 = ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.updateInstanceVersion(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L5d
            goto L54
        L53:
            r11 = 0
        L54:
            ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$$ExternalSyntheticLambda11 r0 = new ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$$ExternalSyntheticLambda11     // Catch: java.lang.Throwable -> L5d
            r0.<init>(r9, r10, r11)     // Catch: java.lang.Throwable -> L5d
            r9.runOnUiThread(r0)     // Catch: java.lang.Throwable -> L5d
            goto L6d
        L5d:
            r10 = move-exception
            java.lang.String r11 = "ModpackUpdateDetails"
            java.lang.String r0 = "Unable to update modpack"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r11, r0, r10)
            ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$$ExternalSyntheticLambda12 r11 = new ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$$ExternalSyntheticLambda12
            r11.<init>(r9, r10)
            r9.runOnUiThread(r11)
        L6d:
            return
    }

    private /* synthetic */ void lambda$showMinecraftFilterDialog$7(android.content.DialogInterface r1, int r2) {
            r0 = this;
            java.util.ArrayList<java.lang.String> r1 = r0.minecraftFilters
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            r0.selectedFilter = r1
            java.util.HashSet<java.lang.String> r1 = r0.collapsedGroups
            r1.clear()
            r1 = 1
            r0.collapseAllOnNextRebuild = r1
            r0.updateFilterButton()
            r0.applyFilter()
            return
    }

    private /* synthetic */ void lambda$showMinecraftFilterDialog$8(androidx.appcompat.app.AlertDialog r1, android.content.DialogInterface r2) {
            r0 = this;
            r0.styleDialog(r1)
            return
    }

    private /* synthetic */ void lambda$showMinecraftFilterDialog$9(android.content.DialogInterface r1) {
            r0 = this;
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r0)
            return
    }

    private void loadVersions() {
            r3 = this;
            java.io.File r0 = r3.gameDirectory
            if (r0 != 0) goto Lc
            android.widget.TextView r0 = r3.textStatus
            java.lang.String r1 = "Missing instance game directory."
            r0.setText(r1)
            return
        Lc:
            java.lang.String r0 = r3.projectId
            boolean r0 = r3.isBlank(r0)
            if (r0 == 0) goto L1c
            android.widget.TextView r0 = r3.textStatus
            java.lang.String r1 = "Missing modpack project id."
            r0.setText(r1)
            return
        L1c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Loading "
            r0.<init>(r1)
            java.lang.String r1 = r3.getPlatformLabel()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " versions..."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 1
            r3.setBusy(r1, r0)
            java.lang.Thread r0 = new java.lang.Thread
            ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$$ExternalSyntheticLambda9 r1 = new ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$$ExternalSyntheticLambda9
            r1.<init>(r3)
            java.lang.String r2 = "Load Modpack Update Versions"
            r0.<init>(r1, r2)
            r0.start()
            return
    }

    private boolean matchesFilter(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo r4, java.lang.String r5) {
            r3 = this;
            java.lang.String r0 = "All Minecraft versions"
            boolean r0 = r0.equals(r5)
            r1 = 1
            if (r0 == 0) goto La
            return r1
        La:
            java.util.ArrayList<java.lang.String> r4 = r4.gameVersions
            java.util.Iterator r4 = r4.iterator()
        L10:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r3.normalizeMinecraftVersion(r0)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L28
            java.lang.String r0 = "Unknown Minecraft version"
        L28:
            boolean r0 = r5.equalsIgnoreCase(r0)
            if (r0 == 0) goto L10
            return r1
        L2f:
            r4 = 0
            return r4
    }

    private java.lang.String normalizeLoaderNameForUpdate(java.lang.String r3) {
            r2 = this;
            if (r3 != 0) goto L5
            java.lang.String r3 = ""
            return r3
        L5:
            java.lang.String r3 = r3.trim()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = r3.toLowerCase(r0)
            java.lang.String r0 = "neoforge"
            boolean r1 = r3.contains(r0)
            if (r1 != 0) goto L45
            java.lang.String r1 = "neo forge"
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L20
            goto L45
        L20:
            java.lang.String r0 = "forge"
            boolean r1 = r3.contains(r0)
            if (r1 == 0) goto L29
            return r0
        L29:
            java.lang.String r0 = "fabric"
            boolean r1 = r3.contains(r0)
            if (r1 == 0) goto L32
            return r0
        L32:
            java.lang.String r0 = "quilt"
            boolean r1 = r3.contains(r0)
            if (r1 == 0) goto L3b
            return r0
        L3b:
            java.lang.String r0 = "vanilla"
            boolean r1 = r3.contains(r0)
            if (r1 == 0) goto L44
            return r0
        L44:
            return r3
        L45:
            return r0
    }

    private java.lang.String normalizeMinecraftVersion(java.lang.String r3) {
            r2 = this;
            if (r3 != 0) goto L5
            java.lang.String r3 = ""
            return r3
        L5:
            java.lang.String r3 = r3.trim()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r3.toLowerCase(r0)
            java.lang.String r1 = "minecraft "
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L23
            int r0 = r1.length()
            java.lang.String r3 = r3.substring(r0)
            java.lang.String r3 = r3.trim()
        L23:
            return r3
    }

    private void readExtras() {
            r7 = this;
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.INSTANCE_ID"
            java.lang.String r2 = ""
            java.lang.String r1 = r7.safeExtra(r0, r1, r2)
            r7.instanceId = r1
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.INSTANCE_NAME"
            java.lang.String r3 = "Unknown instance"
            java.lang.String r1 = r7.safeExtra(r0, r1, r3)
            r7.instanceName = r1
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.INSTANCE_LOADER"
            java.lang.String r3 = "Vanilla"
            java.lang.String r1 = r7.safeExtra(r0, r1, r3)
            r7.loader = r1
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.BASE_VERSION_ID"
            java.lang.String r1 = r7.safeExtra(r0, r1, r2)
            r7.baseVersionId = r1
            java.lang.String r3 = "ca.dnamobile.javalauncher.extra.MINECRAFT_VERSION_ID"
            java.lang.String r1 = r7.safeExtra(r0, r3, r1)
            r7.minecraftVersionId = r1
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.VERSION_TYPE"
            java.lang.String r3 = "release"
            java.lang.String r1 = r7.safeExtra(r0, r1, r3)
            r7.versionType = r1
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.ISOLATED"
            r3 = 1
            boolean r1 = r0.getBooleanExtra(r1, r3)
            r7.isolated = r1
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.ROOT_DIRECTORY"
            java.lang.String r1 = r7.safeExtra(r0, r1, r2)
            java.lang.String r3 = "ca.dnamobile.javalauncher.extra.GAME_DIRECTORY"
            java.lang.String r3 = r7.safeExtra(r0, r3, r2)
            java.lang.String r4 = "ca.dnamobile.javalauncher.extra.ICON_FILE"
            java.lang.String r4 = r7.safeExtra(r0, r4, r2)
            boolean r5 = r7.isBlank(r1)
            r6 = 0
            if (r5 == 0) goto L60
            r5 = r6
            goto L65
        L60:
            java.io.File r5 = new java.io.File
            r5.<init>(r1)
        L65:
            r7.rootDirectory = r5
            boolean r1 = r7.isBlank(r3)
            if (r1 == 0) goto L6f
            r1 = r6
            goto L74
        L6f:
            java.io.File r1 = new java.io.File
            r1.<init>(r3)
        L74:
            r7.gameDirectory = r1
            boolean r1 = r7.isBlank(r4)
            if (r1 == 0) goto L7d
            goto L82
        L7d:
            java.io.File r6 = new java.io.File
            r6.<init>(r4)
        L82:
            r7.iconFile = r6
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.MODPACK_UPDATE_PLATFORM"
            java.lang.String r3 = "modrinth"
            java.lang.String r1 = r7.safeExtra(r0, r1, r3)
            r7.projectPlatform = r1
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.MODPACK_UPDATE_PROJECT_ID"
            java.lang.String r1 = r7.safeExtra(r0, r1, r2)
            r7.projectId = r1
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.MODPACK_UPDATE_PROJECT_SLUG"
            java.lang.String r1 = r7.safeExtra(r0, r1, r2)
            r7.projectSlug = r1
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.MODPACK_UPDATE_PROJECT_TITLE"
            java.lang.String r3 = "Modpack"
            java.lang.String r1 = r7.safeExtra(r0, r1, r3)
            r7.projectTitle = r1
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.MODPACK_UPDATE_PROJECT_SUMMARY"
            java.lang.String r1 = r7.safeExtra(r0, r1, r2)
            r7.projectSummary = r1
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.MODPACK_UPDATE_CURRENT_VERSION"
            java.lang.String r2 = "Unknown"
            java.lang.String r0 = r7.safeExtra(r0, r1, r2)
            r7.currentPackVersion = r0
            return
    }

    private java.lang.String readableError(java.lang.Throwable r3) {
            r2 = this;
            java.lang.String r0 = r3.getMessage()
            if (r0 == 0) goto L10
            java.lang.String r1 = r0.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L18
        L10:
            java.lang.Class r3 = r3.getClass()
            java.lang.String r0 = r3.getSimpleName()
        L18:
            return r0
    }

    private void rebuildVersionGroups() {
            r6 = this;
            java.util.ArrayList<ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionGroup> r0 = r6.versionGroups
            r0.clear()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo> r1 = r6.filteredVersions
            java.util.Iterator r1 = r1.iterator()
        L10:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r1.next()
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo r2 = (ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo) r2
            java.lang.String r3 = r6.resolveGroupMinecraftVersion(r2)
            java.lang.Object r4 = r0.get(r3)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 != 0) goto L30
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.put(r3, r4)
        L30:
            r4.add(r2)
            goto L10
        L34:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList<java.lang.String> r2 = r6.minecraftFilters
            java.util.Iterator r2 = r2.iterator()
        L3f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5e
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "All Minecraft versions"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L54
            goto L3f
        L54:
            boolean r4 = r0.containsKey(r3)
            if (r4 == 0) goto L3f
            r1.add(r3)
            goto L3f
        L5e:
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L66:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L7c
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = r6.containsIgnoreCase(r1, r3)
            if (r4 != 0) goto L66
            r1.add(r3)
            goto L66
        L7c:
            java.util.Iterator r1 = r1.iterator()
        L80:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La6
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r0.get(r2)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            if (r3 == 0) goto L80
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L9b
            goto L80
        L9b:
            java.util.ArrayList<ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionGroup> r4 = r6.versionGroups
            ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionGroup r5 = new ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionGroup
            r5.<init>(r2, r3)
            r4.add(r5)
            goto L80
        La6:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList<ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionGroup> r1 = r6.versionGroups
            java.util.Iterator r1 = r1.iterator()
        Lb1:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Ld1
            java.lang.Object r2 = r1.next()
            ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionGroup r2 = (ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.VersionGroup) r2
            boolean r3 = r6.collapseAllOnNextRebuild
            if (r3 != 0) goto Lcb
            java.util.HashSet<java.lang.String> r3 = r6.collapsedGroups
            java.lang.String r4 = r2.minecraftVersion
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto Lb1
        Lcb:
            java.lang.String r2 = r2.minecraftVersion
            r0.add(r2)
            goto Lb1
        Ld1:
            java.util.HashSet<java.lang.String> r1 = r6.collapsedGroups
            r1.clear()
            java.util.HashSet<java.lang.String> r1 = r6.collapsedGroups
            r1.addAll(r0)
            r0 = 0
            r6.collapseAllOnNextRebuild = r0
            return
    }

    private void refreshVisibleRows() {
            r7 = this;
            java.util.ArrayList<ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionDisplayRow> r0 = r7.visibleRows
            r0.clear()
            java.util.ArrayList<ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionGroup> r0 = r7.versionGroups
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
            r3 = r2
        Le:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L53
            java.lang.Object r4 = r0.next()
            ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionGroup r4 = (ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.VersionGroup) r4
            java.util.ArrayList<ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionDisplayRow> r5 = r7.visibleRows
            ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionDisplayRow r6 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.VersionDisplayRow.group(r4)
            r5.add(r6)
            java.util.HashSet<java.lang.String> r5 = r7.collapsedGroups
            java.lang.String r6 = r4.minecraftVersion
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L35
            java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo> r4 = r4.versions
            int r4 = r4.size()
            int r2 = r2 + r4
            goto Le
        L35:
            java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo> r4 = r4.versions
            java.util.Iterator r4 = r4.iterator()
        L3b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Le
            java.lang.Object r5 = r4.next()
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo r5 = (ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo) r5
            java.util.ArrayList<ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionDisplayRow> r6 = r7.visibleRows
            ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionDisplayRow r5 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.VersionDisplayRow.version(r5)
            r6.add(r5)
            int r3 = r3 + 1
            goto L3b
        L53:
            ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionAdapter r0 = r7.adapter
            java.util.ArrayList<ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionDisplayRow> r4 = r7.visibleRows
            r0.submit(r4)
            android.widget.TextView r0 = r7.textPageIndicator
            java.util.ArrayList<ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionGroup> r4 = r7.versionGroups
            int r4 = r4.size()
            r5 = 1
            if (r4 != r5) goto L68
            java.lang.String r4 = "1 MC version"
            goto L81
        L68:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.util.ArrayList<ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionGroup> r6 = r7.versionGroups
            int r6 = r6.size()
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r6 = " MC versions"
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r4 = r4.toString()
        L81:
            r0.setText(r4)
            android.widget.TextView r0 = r7.textFilterSummary
            java.lang.String r2 = r7.buildFilterSummary(r3, r2)
            r0.setText(r2)
            java.util.ArrayList<ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionGroup> r0 = r7.versionGroups
            java.util.Iterator r0 = r0.iterator()
            r2 = r1
        L94:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lae
            java.lang.Object r3 = r0.next()
            ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionGroup r3 = (ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.VersionGroup) r3
            java.util.HashSet<java.lang.String> r4 = r7.collapsedGroups
            java.lang.String r3 = r3.minecraftVersion
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto Lac
            r2 = r5
            goto L94
        Lac:
            r1 = r5
            goto L94
        Lae:
            android.widget.TextView r0 = r7.buttonPrevious
            r0.setEnabled(r1)
            android.widget.TextView r0 = r7.buttonNext
            r0.setEnabled(r2)
            android.widget.TextView r0 = r7.buttonPrevious
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 1055286886(0x3ee66666, float:0.45)
            if (r1 == 0) goto Lc3
            r1 = r3
            goto Lc4
        Lc3:
            r1 = r4
        Lc4:
            r0.setAlpha(r1)
            android.widget.TextView r0 = r7.buttonNext
            if (r2 == 0) goto Lcc
            goto Lcd
        Lcc:
            r3 = r4
        Lcd:
            r0.setAlpha(r3)
            return
    }

    private java.lang.String resolveGroupMinecraftVersion(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo r5) {
            r4 = this;
            java.lang.String r0 = "All Minecraft versions"
            java.lang.String r1 = r4.selectedFilter
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Ld
            java.lang.String r5 = r4.selectedFilter
            return r5
        Ld:
            java.lang.String r0 = r5.primaryMinecraftVersion
            java.lang.String r0 = r4.normalizeMinecraftVersion(r0)
            boolean r1 = r0.isEmpty()
            java.lang.String r2 = "Unknown Minecraft version"
            if (r1 == 0) goto L1c
            r0 = r2
        L1c:
            java.util.ArrayList<java.lang.String> r5 = r5.gameVersions
            java.util.Iterator r5 = r5.iterator()
        L22:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r4.normalizeMinecraftVersion(r1)
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L39
            r1 = r2
        L39:
            int r3 = r4.compareMinecraftKeysDescending(r1, r0)
            if (r3 >= 0) goto L22
            r0 = r1
            goto L22
        L41:
            return r0
    }

    private int resolveThemeColor(int r4, int r5) {
            r3 = this;
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r1 = r3.getTheme()
            r2 = 1
            boolean r4 = r1.resolveAttribute(r4, r0, r2)
            if (r4 != 0) goto L11
            return r5
        L11:
            int r4 = r0.resourceId
            if (r4 == 0) goto L21
            android.content.res.Resources r4 = r3.getResources()     // Catch: java.lang.Throwable -> L20
            int r0 = r0.resourceId     // Catch: java.lang.Throwable -> L20
            int r4 = r4.getColor(r0)     // Catch: java.lang.Throwable -> L20
            return r4
        L20:
            return r5
        L21:
            int r4 = r0.data
            return r4
    }

    private android.graphics.drawable.GradientDrawable roundedDrawable(int r2, int r3, int r4) {
            r1 = this;
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r0.setColor(r2)
            int r2 = r1.dp(r4)
            float r2 = (float) r2
            r0.setCornerRadius(r2)
            r2 = 1
            int r2 = r1.dp(r2)
            r0.setStroke(r2, r3)
            return r0
    }

    private void runUpdate(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo r4) {
            r3 = this;
            java.io.File r0 = r3.gameDirectory
            r1 = 1
            if (r0 != 0) goto Lf
            java.lang.String r4 = "Missing instance folder."
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r1)
            r4.show()
            return
        Lf:
            java.io.File r2 = r3.rootDirectory
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$InstalledModpackInfo r0 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.readInstalledModpackInfo(r2, r0)
            if (r0 != 0) goto L21
            java.lang.String r4 = "This instance does not have modpack update metadata."
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r1)
            r4.show()
            return
        L21:
            java.lang.String r2 = "Preparing modpack update..."
            r3.setBusy(r1, r2)
            android.view.Window r1 = r3.getWindow()
            r2 = 128(0x80, float:1.8E-43)
            r1.addFlags(r2)
            androidx.recyclerview.widget.RecyclerView r1 = r3.recyclerVersions
            r2 = 1057803469(0x3f0ccccd, float:0.55)
            r1.setAlpha(r2)
            java.lang.Thread r1 = new java.lang.Thread
            ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$$ExternalSyntheticLambda0 r2 = new ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$$ExternalSyntheticLambda0
            r2.<init>(r3, r0, r4)
            java.lang.String r4 = "Update Modpack"
            r1.<init>(r2, r4)
            r1.start()
            return
    }

    private java.lang.String safeExtra(android.content.Intent r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            java.lang.String r1 = r1.getStringExtra(r2)
            if (r1 == 0) goto L15
            java.lang.String r2 = r1.trim()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L11
            goto L15
        L11:
            java.lang.String r3 = r1.trim()
        L15:
            return r3
    }

    private void setAllGroupsCollapsed(boolean r3) {
            r2 = this;
            java.util.HashSet<java.lang.String> r0 = r2.collapsedGroups
            r0.clear()
            if (r3 == 0) goto L21
            java.util.ArrayList<ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionGroup> r3 = r2.versionGroups
            java.util.Iterator r3 = r3.iterator()
        Ld:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L21
            java.lang.Object r0 = r3.next()
            ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionGroup r0 = (ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.VersionGroup) r0
            java.util.HashSet<java.lang.String> r1 = r2.collapsedGroups
            java.lang.String r0 = r0.minecraftVersion
            r1.add(r0)
            goto Ld
        L21:
            r2.refreshVisibleRows()
            return
    }

    private void setBusy(boolean r4, java.lang.String r5) {
            r3 = this;
            android.widget.ProgressBar r0 = r3.progressBar
            r1 = 0
            if (r0 == 0) goto Le
            if (r4 == 0) goto L9
            r2 = r1
            goto Lb
        L9:
            r2 = 8
        Lb:
            r0.setVisibility(r2)
        Le:
            android.widget.TextView r0 = r3.textStatus
            if (r0 == 0) goto L15
            r0.setText(r5)
        L15:
            android.widget.TextView r5 = r3.buttonFilter
            r0 = 1
            if (r5 == 0) goto L2a
            if (r4 != 0) goto L26
            java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo> r2 = r3.allVersions
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L26
            r2 = r0
            goto L27
        L26:
            r2 = r1
        L27:
            r5.setEnabled(r2)
        L2a:
            android.widget.TextView r5 = r3.buttonPrevious
            if (r5 == 0) goto L3e
            if (r4 != 0) goto L3a
            java.util.ArrayList<ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionGroup> r2 = r3.versionGroups
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L3a
            r2 = r0
            goto L3b
        L3a:
            r2 = r1
        L3b:
            r5.setEnabled(r2)
        L3e:
            android.widget.TextView r5 = r3.buttonNext
            if (r5 == 0) goto L50
            if (r4 != 0) goto L4d
            java.util.ArrayList<ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$VersionGroup> r4 = r3.versionGroups
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L4d
            r1 = r0
        L4d:
            r5.setEnabled(r1)
        L50:
            return
    }

    private void setupMinecraftFilters() {
            r5 = this;
            java.util.ArrayList<java.lang.String> r0 = r5.minecraftFilters
            r0.clear()
            java.util.ArrayList<java.lang.String> r0 = r5.minecraftFilters
            java.lang.String r1 = "All Minecraft versions"
            r0.add(r1)
            java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo> r0 = r5.allVersions
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4a
            java.lang.Object r2 = r0.next()
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo r2 = (ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo) r2
            java.util.ArrayList<java.lang.String> r2 = r2.gameVersions
            java.util.Iterator r2 = r2.iterator()
        L24:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L12
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = r5.normalizeMinecraftVersion(r3)
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L3c
            java.lang.String r3 = "Unknown Minecraft version"
        L3c:
            java.util.ArrayList<java.lang.String> r4 = r5.minecraftFilters
            boolean r4 = r5.containsIgnoreCase(r4, r3)
            if (r4 != 0) goto L24
            java.util.ArrayList<java.lang.String> r4 = r5.minecraftFilters
            r4.add(r3)
            goto L24
        L4a:
            java.util.ArrayList<java.lang.String> r0 = r5.minecraftFilters
            int r0 = r0.size()
            r2 = 2
            if (r0 <= r2) goto L7a
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.ArrayList<java.lang.String> r2 = r5.minecraftFilters
            r3 = 1
            int r4 = r2.size()
            java.util.List r2 = r2.subList(r3, r4)
            r0.<init>(r2)
            ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$$ExternalSyntheticLambda5 r2 = new ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$$ExternalSyntheticLambda5
            r2.<init>(r5)
            java.util.Collections.sort(r0, r2)
            java.util.ArrayList<java.lang.String> r2 = r5.minecraftFilters
            r2.clear()
            java.util.ArrayList<java.lang.String> r2 = r5.minecraftFilters
            r2.add(r1)
            java.util.ArrayList<java.lang.String> r2 = r5.minecraftFilters
            r2.addAll(r0)
        L7a:
            r5.selectedFilter = r1
            r5.updateFilterButton()
            return
    }

    private boolean shouldUpdateInstanceBaseForModpack(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.UpdateResult r5) {
            r4 = this;
            java.lang.String r0 = r5.minecraftVersion
            boolean r0 = r4.isBlank(r0)
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            java.lang.String r0 = r5.minecraftVersion
            java.lang.String r2 = r4.minecraftVersionId
            boolean r0 = r0.equalsIgnoreCase(r2)
            r2 = 1
            if (r0 != 0) goto L16
            return r2
        L16:
            java.lang.String r5 = r5.loader
            java.lang.String r5 = r4.normalizeLoaderNameForUpdate(r5)
            java.lang.String r0 = r4.loader
            java.lang.String r0 = r4.normalizeLoaderNameForUpdate(r0)
            boolean r3 = r4.isBlank(r5)
            if (r3 != 0) goto L2f
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L2f
            r1 = r2
        L2f:
            return r1
    }

    private void showMinecraftFilterDialog() {
            r5 = this;
            java.util.ArrayList<java.lang.String> r0 = r5.minecraftFilters
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            return
        L9:
            java.util.ArrayList<java.lang.String> r0 = r5.minecraftFilters
            int r0 = r0.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
        L12:
            java.util.ArrayList<java.lang.String> r2 = r5.minecraftFilters
            int r2 = r2.size()
            if (r1 >= r2) goto L48
            java.util.ArrayList<java.lang.String> r2 = r5.minecraftFilters
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r4 = "  ·  "
            java.lang.StringBuilder r3 = r3.append(r4)
            int r2 = r5.countForFilter(r2)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r3 = " versions"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L12
        L48:
            androidx.appcompat.app.AlertDialog$Builder r1 = new androidx.appcompat.app.AlertDialog$Builder
            r1.<init>(r5)
            java.lang.String r2 = "Pick Minecraft Version"
            androidx.appcompat.app.AlertDialog$Builder r1 = r1.setTitle(r2)
            ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$$ExternalSyntheticLambda6 r2 = new ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$$ExternalSyntheticLambda6
            r2.<init>(r5)
            androidx.appcompat.app.AlertDialog$Builder r0 = r1.setItems(r0, r2)
            r1 = 17039360(0x1040000, float:2.424457E-38)
            r2 = 0
            androidx.appcompat.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            androidx.appcompat.app.AlertDialog r0 = r0.create()
            ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$$ExternalSyntheticLambda7 r1 = new ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$$ExternalSyntheticLambda7
            r1.<init>(r5, r0)
            r0.setOnShowListener(r1)
            ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$$ExternalSyntheticLambda8 r1 = new ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity$$ExternalSyntheticLambda8
            r1.<init>(r5)
            r0.setOnDismissListener(r1)
            r0.show()
            return
    }

    private void styleDialog(androidx.appcompat.app.AlertDialog r4) {
            r3 = this;
            android.view.Window r0 = r4.getWindow()
            if (r0 == 0) goto L17
            int r1 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.COLOR_DIALOG_BG
            r2 = 22
            android.graphics.drawable.GradientDrawable r1 = r3.roundedDrawable(r1, r1, r2)
            r0.setBackgroundDrawable(r1)
            r1 = 1058306785(0x3f147ae1, float:0.58)
            r0.setDimAmount(r1)
        L17:
            r0 = -1
            android.widget.Button r0 = r4.getButton(r0)
            r1 = -2
            android.widget.Button r4 = r4.getButton(r1)
            r1 = 16843829(0x1010435, float:2.3696576E-38)
            int r2 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.COLOR_ACCENT
            int r1 = r3.resolveThemeColor(r1, r2)
            if (r0 == 0) goto L2f
            r0.setTextColor(r1)
        L2f:
            if (r4 == 0) goto L34
            r4.setTextColor(r1)
        L34:
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r3)
            return
    }

    private void submitVersions(java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo> r2) {
            r1 = this;
            java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo> r0 = r1.allVersions
            r0.clear()
            java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo> r0 = r1.allVersions
            r0.addAll(r2)
            r2 = 1
            r1.collapseAllOnNextRebuild = r2
            r1.setupMinecraftFilters()
            r1.applyFilter()
            return
    }

    private ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform toPlatform(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "curseforge"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto Lb
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r2 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform.CURSEFORGE
            goto Ld
        Lb:
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r2 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform.MODRINTH
        Ld:
            return r2
    }

    private void toggleGroup(java.lang.String r2) {
            r1 = this;
            java.util.HashSet<java.lang.String> r0 = r1.collapsedGroups
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto Le
            java.util.HashSet<java.lang.String> r0 = r1.collapsedGroups
            r0.remove(r2)
            goto L13
        Le:
            java.util.HashSet<java.lang.String> r0 = r1.collapsedGroups
            r0.add(r2)
        L13:
            r1.refreshVisibleRows()
            return
    }

    private java.lang.String trimDate(java.lang.String r3) {
            r2 = this;
            if (r3 != 0) goto L5
            java.lang.String r3 = ""
            return r3
        L5:
            java.lang.String r3 = r3.trim()
            r0 = 10
            int r1 = r3.length()
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 0
            java.lang.String r3 = r3.substring(r1, r0)
            return r3
    }

    private void updateFilterButton() {
            r2 = this;
            android.widget.TextView r0 = r2.buttonFilter
            java.lang.String r1 = r2.selectedFilter
            r0.setText(r1)
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r0)
            r0.readExtras()
            r0.buildLayout()
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r0)
            r0.loadVersions()
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
            r0 = this;
            super.onResume()
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r0)
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean r1) {
            r0 = this;
            super.onWindowFocusChanged(r1)
            if (r1 == 0) goto L8
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r0)
        L8:
            return
    }
}
