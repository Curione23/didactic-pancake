package ca.dnamobile.javalauncher;

/* JADX INFO: loaded from: classes.dex */
public final class ContentBrowserActivity extends androidx.appcompat.app.AppCompatActivity {
    public static final java.lang.String EXTRA_PROJECT_ICON_URL = "ca.dnamobile.javalauncher.extra.PROJECT_ICON_URL";
    public static final java.lang.String EXTRA_PROJECT_ID = "ca.dnamobile.javalauncher.extra.PROJECT_ID";
    public static final java.lang.String EXTRA_PROJECT_SLUG = "ca.dnamobile.javalauncher.extra.PROJECT_SLUG";
    public static final java.lang.String EXTRA_PROJECT_SOURCE = "ca.dnamobile.javalauncher.extra.PROJECT_SOURCE";
    public static final java.lang.String EXTRA_PROJECT_TITLE = "ca.dnamobile.javalauncher.extra.PROJECT_TITLE";
    public static final java.lang.String EXTRA_PROJECT_TYPE = "ca.dnamobile.javalauncher.extra.PROJECT_TYPE";
    private static final int PAGE_SIZE = 20;
    private static final long SEARCH_DEBOUNCE_DELAY_MS = 350;
    private final ca.dnamobile.javalauncher.ContentBrowserActivity.ContentProjectAdapter adapter;
    private java.lang.String baseVersionId;
    private com.google.android.material.button.MaterialButton buttonPageNext;
    private com.google.android.material.button.MaterialButton buttonPagePrevious;
    private com.google.android.material.button.MaterialButton buttonSortContent;
    private java.util.ArrayList<java.lang.String> cachedReleaseMinecraftVersions;
    private androidx.appcompat.app.AlertDialog currentModpackVersionDialog;
    private int currentPage;
    private com.google.android.material.textfield.TextInputEditText editSearch;
    private java.lang.String gameDirectoryPath;
    private java.lang.String gameVersionId;
    private java.lang.String iconPath;
    private android.widget.ImageView imageInstanceIcon;
    private java.lang.String instanceId;
    private java.lang.String instanceName;
    private java.lang.String loader;
    private androidx.appcompat.app.AlertDialog minecraftVersionLoadingDialog;
    private ca.dnamobile.javalauncher.ui.ModpackInstallProgressDialog modpackInstallDialog;
    private androidx.appcompat.app.AlertDialog modpackVersionLoadingDialog;
    private java.lang.Runnable pendingSearchRunnable;
    private androidx.recyclerview.widget.RecyclerView recyclerContentProjects;
    private final java.util.concurrent.atomic.AtomicInteger requestGeneration;
    private final java.util.Map<java.lang.String, java.lang.String> resolvedProjectIconUrls;
    private final java.util.Set<java.lang.String> resolvingProjectIconUrls;
    private androidx.core.widget.NestedScrollView scrollRoot;
    private android.graphics.drawable.Drawable searchClearDrawable;
    private final android.os.Handler searchHandler;
    private java.lang.String selectedModpackMinecraftVersionFilter;
    private ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort selectedSort;
    private ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSource selectedSource;
    private ca.dnamobile.javalauncher.modmanager.ModManagerContentType selectedType;
    private com.google.android.material.button.MaterialButtonToggleGroup sourceToggleGroup;
    private com.google.android.material.tabs.TabLayout tabContentTypes;
    private android.widget.TextView textContentTitle;
    private android.widget.TextView textInstanceMeta;
    private android.widget.TextView textInstanceName;
    private android.widget.TextView textLoaderChip;
    private android.widget.TextView textPageIndicator;
    private android.widget.TextView textResultSummary;
    private android.widget.TextView textVersionChip;
    private int totalHits;
    private final java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModManagerContentType> visibleTabTypes;



    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.ContentBrowserActivity$3, reason: invalid class name */
    class AnonymousClass3 implements ca.dnamobile.javalauncher.modmanager.ModrinthInstallManager.Listener {
        final /* synthetic */ ca.dnamobile.javalauncher.ContentBrowserActivity this$0;

        public static /* synthetic */ void $r8$lambda$PzTUxiFfBhxmUAWOqE5LiD98Ptc(ca.dnamobile.javalauncher.ContentBrowserActivity.AnonymousClass3 r0, java.lang.Throwable r1) {
                r0.lambda$onError$2(r1)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$R364vm7CMxCWmRaEyPc8F-GUifg, reason: not valid java name */
        public static /* synthetic */ void m113$r8$lambda$R364vm7CMxCWmRaEyPc8FGUifg(ca.dnamobile.javalauncher.ContentBrowserActivity.AnonymousClass3 r0, java.lang.String r1) {
                r0.lambda$onComplete$1(r1)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$nMfKfeBhuG0dTORBF_wAA-M-1d4, reason: not valid java name */
        public static /* synthetic */ void m114$r8$lambda$nMfKfeBhuG0dTORBF_wAAM1d4(ca.dnamobile.javalauncher.ContentBrowserActivity.AnonymousClass3 r0, java.lang.String r1) {
                r0.lambda$onStatus$0(r1)
                return
        }

        AnonymousClass3(ca.dnamobile.javalauncher.ContentBrowserActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        private /* synthetic */ void lambda$onComplete$1(java.lang.String r3) {
                r2 = this;
                ca.dnamobile.javalauncher.ContentBrowserActivity r0 = r2.this$0
                android.widget.TextView r0 = ca.dnamobile.javalauncher.ContentBrowserActivity.m87$$Nest$fgettextResultSummary(r0)
                r0.setText(r3)
                ca.dnamobile.javalauncher.ContentBrowserActivity r0 = r2.this$0
                r1 = 1
                android.widget.Toast r3 = android.widget.Toast.makeText(r0, r3, r1)
                r3.show()
                ca.dnamobile.javalauncher.ContentBrowserActivity r3 = r2.this$0
                r0 = -1
                r3.setResult(r0)
                ca.dnamobile.javalauncher.ContentBrowserActivity r3 = r2.this$0
                ca.dnamobile.javalauncher.ContentBrowserActivity$ContentProjectAdapter r3 = ca.dnamobile.javalauncher.ContentBrowserActivity.m83$$Nest$fgetadapter(r3)
                r3.notifyDataSetChanged()
                return
        }

        private /* synthetic */ void lambda$onError$2(java.lang.Throwable r5) {
                r4 = this;
                java.lang.String r0 = r5.getMessage()
                if (r0 == 0) goto Lb
                java.lang.String r5 = r5.getMessage()
                goto L13
            Lb:
                java.lang.Class r5 = r5.getClass()
                java.lang.String r5 = r5.getSimpleName()
            L13:
                ca.dnamobile.javalauncher.ContentBrowserActivity r0 = r4.this$0
                android.widget.TextView r0 = ca.dnamobile.javalauncher.ContentBrowserActivity.m87$$Nest$fgettextResultSummary(r0)
                ca.dnamobile.javalauncher.ContentBrowserActivity r1 = r4.this$0
                int r2 = ca.dnamobile.javalauncher.R.string.content_browser_install_failed
                java.lang.Object[] r3 = new java.lang.Object[]{r5}
                java.lang.String r1 = r1.getString(r2, r3)
                r0.setText(r1)
                ca.dnamobile.javalauncher.ContentBrowserActivity r0 = r4.this$0
                int r1 = ca.dnamobile.javalauncher.R.string.content_browser_install_failed
                java.lang.Object[] r5 = new java.lang.Object[]{r5}
                java.lang.String r5 = r0.getString(r1, r5)
                r1 = 1
                android.widget.Toast r5 = android.widget.Toast.makeText(r0, r5, r1)
                r5.show()
                return
        }

        private /* synthetic */ void lambda$onStatus$0(java.lang.String r2) {
                r1 = this;
                ca.dnamobile.javalauncher.ContentBrowserActivity r0 = r1.this$0
                android.widget.TextView r0 = ca.dnamobile.javalauncher.ContentBrowserActivity.m87$$Nest$fgettextResultSummary(r0)
                r0.setText(r2)
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModrinthInstallManager.Listener
        public void onComplete(java.lang.String r3) {
                r2 = this;
                ca.dnamobile.javalauncher.ContentBrowserActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.ContentBrowserActivity$3$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.ContentBrowserActivity$3$$ExternalSyntheticLambda0
                r1.<init>(r2, r3)
                r0.runOnUiThread(r1)
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModrinthInstallManager.Listener
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                ca.dnamobile.javalauncher.ContentBrowserActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.ContentBrowserActivity$3$$ExternalSyntheticLambda1 r1 = new ca.dnamobile.javalauncher.ContentBrowserActivity$3$$ExternalSyntheticLambda1
                r1.<init>(r2, r3)
                r0.runOnUiThread(r1)
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModrinthInstallManager.Listener
        public void onStatus(java.lang.String r3) {
                r2 = this;
                ca.dnamobile.javalauncher.ContentBrowserActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.ContentBrowserActivity$3$$ExternalSyntheticLambda2 r1 = new ca.dnamobile.javalauncher.ContentBrowserActivity$3$$ExternalSyntheticLambda2
                r1.<init>(r2, r3)
                r0.runOnUiThread(r1)
                return
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.ContentBrowserActivity$4, reason: invalid class name */
    class AnonymousClass4 implements ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener {
        final /* synthetic */ ca.dnamobile.javalauncher.ContentBrowserActivity this$0;

        /* JADX INFO: renamed from: $r8$lambda$MBtJooWfdFgrRrq1-82B3vyruds, reason: not valid java name */
        public static /* synthetic */ void m115$r8$lambda$MBtJooWfdFgrRrq182B3vyruds(ca.dnamobile.javalauncher.ContentBrowserActivity.AnonymousClass4 r0, java.lang.String r1, ca.dnamobile.javalauncher.instance.LauncherInstance r2) {
                r0.lambda$onComplete$2(r1, r2)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$UylXQ-OdvlB10i2sispTMIdcOmc, reason: not valid java name */
        public static /* synthetic */ void m116$r8$lambda$UylXQOdvlB10i2sispTMIdcOmc(ca.dnamobile.javalauncher.ContentBrowserActivity.AnonymousClass4 r0, java.lang.Throwable r1) {
                r0.lambda$onError$3(r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$a6UqnbIgvu5gO4fhEMqbXioG1kM(ca.dnamobile.javalauncher.ContentBrowserActivity.AnonymousClass4 r0, int r1, int r2) {
                r0.lambda$onProgress$1(r1, r2)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$jXh-0wMXY2bl1wEEhDU6N2TgN6M, reason: not valid java name */
        public static /* synthetic */ void m117$r8$lambda$jXh0wMXY2bl1wEEhDU6N2TgN6M(ca.dnamobile.javalauncher.ContentBrowserActivity.AnonymousClass4 r0, java.lang.String r1) {
                r0.lambda$onStatus$0(r1)
                return
        }

        AnonymousClass4(ca.dnamobile.javalauncher.ContentBrowserActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        private /* synthetic */ void lambda$onComplete$2(java.lang.String r3, ca.dnamobile.javalauncher.instance.LauncherInstance r4) {
                r2 = this;
                ca.dnamobile.javalauncher.ContentBrowserActivity r0 = r2.this$0
                android.widget.TextView r0 = ca.dnamobile.javalauncher.ContentBrowserActivity.m87$$Nest$fgettextResultSummary(r0)
                r0.setText(r3)
                ca.dnamobile.javalauncher.ContentBrowserActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.ContentBrowserActivity.m96$$Nest$mdismissModpackInstallDialog(r0)
                ca.dnamobile.javalauncher.ContentBrowserActivity r0 = r2.this$0
                r1 = 1
                android.widget.Toast r3 = android.widget.Toast.makeText(r0, r3, r1)
                r3.show()
                ca.dnamobile.javalauncher.ContentBrowserActivity r3 = r2.this$0
                r0 = -1
                r3.setResult(r0)
                ca.dnamobile.javalauncher.ContentBrowserActivity r3 = r2.this$0
                ca.dnamobile.javalauncher.ContentBrowserActivity.m106$$Nest$mopenInstalledModpackInstance(r3, r4)
                return
        }

        private /* synthetic */ void lambda$onError$3(java.lang.Throwable r5) {
                r4 = this;
                ca.dnamobile.javalauncher.ContentBrowserActivity r0 = r4.this$0
                ca.dnamobile.javalauncher.ContentBrowserActivity.m96$$Nest$mdismissModpackInstallDialog(r0)
                java.lang.String r0 = r5.getMessage()
                if (r0 == 0) goto L10
                java.lang.String r5 = r5.getMessage()
                goto L18
            L10:
                java.lang.Class r5 = r5.getClass()
                java.lang.String r5 = r5.getSimpleName()
            L18:
                ca.dnamobile.javalauncher.ContentBrowserActivity r0 = r4.this$0
                android.widget.TextView r0 = ca.dnamobile.javalauncher.ContentBrowserActivity.m87$$Nest$fgettextResultSummary(r0)
                ca.dnamobile.javalauncher.ContentBrowserActivity r1 = r4.this$0
                int r2 = ca.dnamobile.javalauncher.R.string.content_browser_install_failed
                java.lang.Object[] r3 = new java.lang.Object[]{r5}
                java.lang.String r1 = r1.getString(r2, r3)
                r0.setText(r1)
                ca.dnamobile.javalauncher.ContentBrowserActivity r0 = r4.this$0
                int r1 = ca.dnamobile.javalauncher.R.string.content_browser_install_failed
                java.lang.Object[] r5 = new java.lang.Object[]{r5}
                java.lang.String r5 = r0.getString(r1, r5)
                r1 = 1
                android.widget.Toast r5 = android.widget.Toast.makeText(r0, r5, r1)
                r5.show()
                return
        }

        private /* synthetic */ void lambda$onProgress$1(int r3, int r4) {
                r2 = this;
                ca.dnamobile.javalauncher.ContentBrowserActivity r0 = r2.this$0
                r1 = 0
                ca.dnamobile.javalauncher.ContentBrowserActivity.m111$$Nest$mupdateModpackInstallDialog(r0, r1, r3, r4)
                return
        }

        private /* synthetic */ void lambda$onStatus$0(java.lang.String r3) {
                r2 = this;
                ca.dnamobile.javalauncher.ContentBrowserActivity r0 = r2.this$0
                android.widget.TextView r0 = ca.dnamobile.javalauncher.ContentBrowserActivity.m87$$Nest$fgettextResultSummary(r0)
                r0.setText(r3)
                ca.dnamobile.javalauncher.ContentBrowserActivity r0 = r2.this$0
                r1 = -1
                ca.dnamobile.javalauncher.ContentBrowserActivity.m111$$Nest$mupdateModpackInstallDialog(r0, r3, r1, r1)
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener
        public void onComplete(java.lang.String r2) {
                r1 = this;
                r0 = 0
                r1.onComplete(r2, r0)
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener
        public void onComplete(java.lang.String r3, ca.dnamobile.javalauncher.instance.LauncherInstance r4) {
                r2 = this;
                ca.dnamobile.javalauncher.ContentBrowserActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.ContentBrowserActivity$4$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.ContentBrowserActivity$4$$ExternalSyntheticLambda0
                r1.<init>(r2, r3, r4)
                r0.runOnUiThread(r1)
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                ca.dnamobile.javalauncher.ContentBrowserActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.ContentBrowserActivity$4$$ExternalSyntheticLambda3 r1 = new ca.dnamobile.javalauncher.ContentBrowserActivity$4$$ExternalSyntheticLambda3
                r1.<init>(r2, r3)
                r0.runOnUiThread(r1)
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener
        public void onProgress(int r3, int r4) {
                r2 = this;
                ca.dnamobile.javalauncher.ContentBrowserActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.ContentBrowserActivity$4$$ExternalSyntheticLambda1 r1 = new ca.dnamobile.javalauncher.ContentBrowserActivity$4$$ExternalSyntheticLambda1
                r1.<init>(r2, r3, r4)
                r0.runOnUiThread(r1)
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener
        public void onStatus(java.lang.String r3) {
                r2 = this;
                ca.dnamobile.javalauncher.ContentBrowserActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.ContentBrowserActivity$4$$ExternalSyntheticLambda2 r1 = new ca.dnamobile.javalauncher.ContentBrowserActivity$4$$ExternalSyntheticLambda2
                r1.<init>(r2, r3)
                r0.runOnUiThread(r1)
                return
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.ContentBrowserActivity$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$ca$dnamobile$javalauncher$modmanager$ModManagerContentType = null;

        static {
                ca.dnamobile.javalauncher.modmanager.ModManagerContentType[] r0 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ca.dnamobile.javalauncher.ContentBrowserActivity.AnonymousClass5.$SwitchMap$ca$dnamobile$javalauncher$modmanager$ModManagerContentType = r0
                ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODPACKS     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = ca.dnamobile.javalauncher.ContentBrowserActivity.AnonymousClass5.$SwitchMap$ca$dnamobile$javalauncher$modmanager$ModManagerContentType     // Catch: java.lang.NoSuchFieldError -> L1d
                ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.RESOURCEPACKS     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = ca.dnamobile.javalauncher.ContentBrowserActivity.AnonymousClass5.$SwitchMap$ca$dnamobile$javalauncher$modmanager$ModManagerContentType     // Catch: java.lang.NoSuchFieldError -> L28
                ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.SHADERPACKS     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = ca.dnamobile.javalauncher.ContentBrowserActivity.AnonymousClass5.$SwitchMap$ca$dnamobile$javalauncher$modmanager$ModManagerContentType     // Catch: java.lang.NoSuchFieldError -> L33
                ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODS     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    private final class ContentProjectAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<ca.dnamobile.javalauncher.ContentBrowserActivity.ContentProjectAdapter.ViewHolder> {
        private ca.dnamobile.javalauncher.modmanager.ModManagerContentType boundType;
        private final java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModrinthProject> items;
        final /* synthetic */ ca.dnamobile.javalauncher.ContentBrowserActivity this$0;

        final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            final android.widget.TextView author;
            final android.widget.TextView description;
            final android.widget.TextView downloads;
            final android.widget.ImageView icon;
            final com.google.android.material.button.MaterialButton install;
            final android.widget.TextView likes;
            final com.google.android.material.button.MaterialButton menu;
            final android.widget.TextView name;
            final android.widget.ImageView sourceIcon;
            final android.widget.TextView tags;
            final /* synthetic */ ca.dnamobile.javalauncher.ContentBrowserActivity.ContentProjectAdapter this$1;
            final android.widget.TextView updated;

            ViewHolder(ca.dnamobile.javalauncher.ContentBrowserActivity.ContentProjectAdapter r2, android.view.View r3) {
                    r1 = this;
                    r1.this$1 = r2
                    r1.<init>(r3)
                    int r2 = ca.dnamobile.javalauncher.R.id.imageProjectIcon
                    android.view.View r2 = r3.findViewById(r2)
                    android.widget.ImageView r2 = (android.widget.ImageView) r2
                    r1.icon = r2
                    int r2 = ca.dnamobile.javalauncher.R.id.textProjectName
                    android.view.View r2 = r3.findViewById(r2)
                    android.widget.TextView r2 = (android.widget.TextView) r2
                    r1.name = r2
                    int r2 = ca.dnamobile.javalauncher.R.id.textProjectAuthor
                    android.view.View r2 = r3.findViewById(r2)
                    android.widget.TextView r2 = (android.widget.TextView) r2
                    r1.author = r2
                    int r2 = ca.dnamobile.javalauncher.R.id.textProjectDescription
                    android.view.View r2 = r3.findViewById(r2)
                    android.widget.TextView r2 = (android.widget.TextView) r2
                    r1.description = r2
                    int r2 = ca.dnamobile.javalauncher.R.id.textProjectTags
                    android.view.View r2 = r3.findViewById(r2)
                    android.widget.TextView r2 = (android.widget.TextView) r2
                    r1.tags = r2
                    int r2 = ca.dnamobile.javalauncher.R.id.textProjectDownloads
                    android.view.View r2 = r3.findViewById(r2)
                    android.widget.TextView r2 = (android.widget.TextView) r2
                    r1.downloads = r2
                    int r2 = ca.dnamobile.javalauncher.R.id.textProjectLikes
                    android.view.View r2 = r3.findViewById(r2)
                    android.widget.TextView r2 = (android.widget.TextView) r2
                    r1.likes = r2
                    int r2 = ca.dnamobile.javalauncher.R.id.textProjectUpdated
                    android.view.View r2 = r3.findViewById(r2)
                    android.widget.TextView r2 = (android.widget.TextView) r2
                    r1.updated = r2
                    int r2 = ca.dnamobile.javalauncher.R.id.imageProjectInstalledSource
                    android.view.View r2 = r3.findViewById(r2)
                    android.widget.ImageView r2 = (android.widget.ImageView) r2
                    r1.sourceIcon = r2
                    int r2 = ca.dnamobile.javalauncher.R.id.buttonInstallProject
                    android.view.View r2 = r3.findViewById(r2)
                    com.google.android.material.button.MaterialButton r2 = (com.google.android.material.button.MaterialButton) r2
                    r1.install = r2
                    int r0 = ca.dnamobile.javalauncher.R.id.buttonProjectMenu
                    android.view.View r3 = r3.findViewById(r0)
                    com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
                    r1.menu = r3
                    r0 = 0
                    r2.setFocusable(r0)
                    r2.setFocusableInTouchMode(r0)
                    r3.setFocusable(r0)
                    r3.setFocusableInTouchMode(r0)
                    return
            }
        }

        public static /* synthetic */ void $r8$lambda$1nxgbsq9Y2XJAAa7Qigo5t4WmaY(ca.dnamobile.javalauncher.ContentBrowserActivity.ContentProjectAdapter r0, ca.dnamobile.javalauncher.modmanager.ModrinthProject r1, android.view.View r2) {
                r0.lambda$onBindViewHolder$2(r1, r2)
                return
        }

        public static /* synthetic */ void $r8$lambda$p3EWTwCtH6sdjRckUXDUt2PwXzE(ca.dnamobile.javalauncher.ContentBrowserActivity.ContentProjectAdapter r0, ca.dnamobile.javalauncher.modmanager.ModrinthProject r1, android.view.View r2) {
                r0.lambda$onBindViewHolder$0(r1, r2)
                return
        }

        public static /* synthetic */ void $r8$lambda$rcIrtMtDZMk0QZJxETMnVzN2Hh4(ca.dnamobile.javalauncher.ContentBrowserActivity.ContentProjectAdapter r0, ca.dnamobile.javalauncher.modmanager.ModrinthProject r1, android.view.View r2) {
                r0.lambda$onBindViewHolder$1(r1, r2)
                return
        }

        private ContentProjectAdapter(ca.dnamobile.javalauncher.ContentBrowserActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.items = r1
                ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODS
                r0.boundType = r1
                return
        }

        /* synthetic */ ContentProjectAdapter(ca.dnamobile.javalauncher.ContentBrowserActivity r1, ca.dnamobile.javalauncher.ContentBrowserActivity.ContentProjectAdapterIA r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private /* synthetic */ void lambda$onBindViewHolder$0(ca.dnamobile.javalauncher.modmanager.ModrinthProject r1, android.view.View r2) {
                r0 = this;
                ca.dnamobile.javalauncher.ContentBrowserActivity r2 = r0.this$0
                ca.dnamobile.javalauncher.ContentBrowserActivity.m95$$Nest$mconfirmInstall(r2, r1)
                return
        }

        private /* synthetic */ void lambda$onBindViewHolder$1(ca.dnamobile.javalauncher.modmanager.ModrinthProject r2, android.view.View r3) {
                r1 = this;
                ca.dnamobile.javalauncher.ContentBrowserActivity r0 = r1.this$0
                ca.dnamobile.javalauncher.ContentBrowserActivity.m110$$Nest$mshowProjectMenu(r0, r3, r2)
                return
        }

        private /* synthetic */ void lambda$onBindViewHolder$2(ca.dnamobile.javalauncher.modmanager.ModrinthProject r1, android.view.View r2) {
                r0 = this;
                ca.dnamobile.javalauncher.ContentBrowserActivity r2 = r0.this$0
                ca.dnamobile.javalauncher.ContentBrowserActivity.m107$$Nest$mopenProjectDetails(r2, r1)
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
                r1 = this;
                java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModrinthProject> r0 = r1.items
                int r0 = r0.size()
                return r0
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
                r0 = this;
                ca.dnamobile.javalauncher.ContentBrowserActivity$ContentProjectAdapter$ViewHolder r1 = (ca.dnamobile.javalauncher.ContentBrowserActivity.ContentProjectAdapter.ViewHolder) r1
                r0.onBindViewHolder(r1, r2)
                return
        }

        public void onBindViewHolder(ca.dnamobile.javalauncher.ContentBrowserActivity.ContentProjectAdapter.ViewHolder r6, int r7) {
                r5 = this;
                java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModrinthProject> r0 = r5.items
                java.lang.Object r7 = r0.get(r7)
                ca.dnamobile.javalauncher.modmanager.ModrinthProject r7 = (ca.dnamobile.javalauncher.modmanager.ModrinthProject) r7
                ca.dnamobile.javalauncher.ContentBrowserActivity r0 = r5.this$0
                ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = r5.boundType
                ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = ca.dnamobile.javalauncher.ContentBrowserActivity.m108$$Nest$mresolveProjectDisplayType(r0, r7, r1)
                ca.dnamobile.javalauncher.ContentBrowserActivity r1 = r5.this$0
                android.widget.ImageView r2 = r6.icon
                ca.dnamobile.javalauncher.ContentBrowserActivity.m90$$Nest$mbindProjectIcon(r1, r2, r7, r0)
                android.widget.TextView r0 = r6.name
                java.lang.String r1 = r7.title
                r0.setText(r1)
                android.widget.TextView r0 = r6.author
                ca.dnamobile.javalauncher.ContentBrowserActivity r1 = r5.this$0
                int r2 = ca.dnamobile.javalauncher.R.string.content_browser_project_author
                java.lang.String r3 = r7.author
                if (r3 == 0) goto L38
                java.lang.String r3 = r7.author
                java.lang.String r3 = r3.trim()
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L35
                goto L38
            L35:
                java.lang.String r3 = r7.author
                goto L3e
            L38:
                ca.dnamobile.javalauncher.modmanager.ModManagerSource r3 = r7.source
                java.lang.String r3 = r3.getDisplayName()
            L3e:
                java.lang.Object[] r3 = new java.lang.Object[]{r3}
                java.lang.String r1 = r1.getString(r2, r3)
                r0.setText(r1)
                android.widget.TextView r0 = r6.description
                java.lang.String r1 = r7.description
                r0.setText(r1)
                android.widget.TextView r0 = r6.tags
                ca.dnamobile.javalauncher.ContentBrowserActivity r1 = r5.this$0
                java.util.ArrayList<java.lang.String> r2 = r7.categories
                java.lang.String r1 = ca.dnamobile.javalauncher.ContentBrowserActivity.m100$$Nest$mformatTags(r1, r2)
                r0.setText(r1)
                android.widget.TextView r0 = r6.downloads
                ca.dnamobile.javalauncher.ContentBrowserActivity r1 = r5.this$0
                long r2 = r7.downloads
                java.lang.String r1 = ca.dnamobile.javalauncher.ContentBrowserActivity.m99$$Nest$mformatNumber(r1, r2)
                r0.setText(r1)
                android.widget.TextView r0 = r6.likes
                ca.dnamobile.javalauncher.ContentBrowserActivity r1 = r5.this$0
                long r2 = r7.followers
                java.lang.String r1 = ca.dnamobile.javalauncher.ContentBrowserActivity.m99$$Nest$mformatNumber(r1, r2)
                r0.setText(r1)
                android.widget.TextView r0 = r6.updated
                java.lang.String r1 = r7.dateModified
                r2 = 0
                if (r1 == 0) goto L9e
                java.lang.String r1 = r7.dateModified
                java.lang.String r1 = r1.trim()
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L8b
                goto L9e
            L8b:
                java.lang.String r1 = r7.dateModified
                java.lang.String r3 = r7.dateModified
                int r3 = r3.length()
                r4 = 10
                int r3 = java.lang.Math.min(r4, r3)
                java.lang.String r1 = r1.substring(r2, r3)
                goto La6
            L9e:
                ca.dnamobile.javalauncher.ContentBrowserActivity r1 = r5.this$0
                int r3 = ca.dnamobile.javalauncher.R.string.content_browser_updated_unknown
                java.lang.String r1 = r1.getString(r3)
            La6:
                r0.setText(r1)
                ca.dnamobile.javalauncher.ContentBrowserActivity r0 = r5.this$0
                boolean r0 = ca.dnamobile.javalauncher.ContentBrowserActivity.m103$$Nest$misProjectInstalled(r0, r7)
                if (r0 == 0) goto Lb8
                ca.dnamobile.javalauncher.ContentBrowserActivity r1 = r5.this$0
                ca.dnamobile.javalauncher.modmanager.ModManagerSource r1 = ca.dnamobile.javalauncher.ContentBrowserActivity.m101$$Nest$mgetInstalledSource(r1, r7)
                goto Lba
            Lb8:
                ca.dnamobile.javalauncher.modmanager.ModManagerSource r1 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.UNKNOWN
            Lba:
                android.widget.ImageView r3 = r6.sourceIcon
                boolean r4 = r1.hasIcon()
                if (r4 == 0) goto Lc3
                goto Lc5
            Lc3:
                r2 = 8
            Lc5:
                r3.setVisibility(r2)
                boolean r2 = r1.hasIcon()
                if (r2 == 0) goto Lec
                android.widget.ImageView r2 = r6.sourceIcon
                int r3 = r1.getIconRes()
                r2.setImageResource(r3)
                android.widget.ImageView r2 = r6.sourceIcon
                ca.dnamobile.javalauncher.ContentBrowserActivity r3 = r5.this$0
                int r4 = ca.dnamobile.javalauncher.R.string.modmanager_installed_from
                java.lang.String r1 = r1.getDisplayName()
                java.lang.Object[] r1 = new java.lang.Object[]{r1}
                java.lang.String r1 = r3.getString(r4, r1)
                r2.setContentDescription(r1)
            Lec:
                com.google.android.material.button.MaterialButton r1 = r6.install
                r2 = r0 ^ 1
                r1.setEnabled(r2)
                com.google.android.material.button.MaterialButton r1 = r6.install
                if (r0 == 0) goto Lfa
                int r2 = ca.dnamobile.javalauncher.R.string.content_browser_installed
                goto Lfc
            Lfa:
                int r2 = ca.dnamobile.javalauncher.R.string.content_browser_install
            Lfc:
                r1.setText(r2)
                r1 = 0
                if (r0 == 0) goto L108
                com.google.android.material.button.MaterialButton r2 = r6.install
                r2.setIcon(r1)
                goto L10f
            L108:
                com.google.android.material.button.MaterialButton r2 = r6.install
                int r3 = ca.dnamobile.javalauncher.R.drawable.ic_add_24
                r2.setIconResource(r3)
            L10f:
                com.google.android.material.button.MaterialButton r2 = r6.install
                if (r0 == 0) goto L114
                goto L119
            L114:
                ca.dnamobile.javalauncher.ContentBrowserActivity$ContentProjectAdapter$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.ContentBrowserActivity$ContentProjectAdapter$$ExternalSyntheticLambda0
                r1.<init>(r5, r7)
            L119:
                r2.setOnClickListener(r1)
                com.google.android.material.button.MaterialButton r0 = r6.menu
                ca.dnamobile.javalauncher.ContentBrowserActivity$ContentProjectAdapter$$ExternalSyntheticLambda1 r1 = new ca.dnamobile.javalauncher.ContentBrowserActivity$ContentProjectAdapter$$ExternalSyntheticLambda1
                r1.<init>(r5, r7)
                r0.setOnClickListener(r1)
                android.view.View r6 = r6.itemView
                ca.dnamobile.javalauncher.ContentBrowserActivity$ContentProjectAdapter$$ExternalSyntheticLambda2 r0 = new ca.dnamobile.javalauncher.ContentBrowserActivity$ContentProjectAdapter$$ExternalSyntheticLambda2
                r0.<init>(r5, r7)
                r6.setOnClickListener(r0)
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r1, int r2) {
                r0 = this;
                ca.dnamobile.javalauncher.ContentBrowserActivity$ContentProjectAdapter$ViewHolder r1 = r0.onCreateViewHolder(r1, r2)
                return r1
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public ca.dnamobile.javalauncher.ContentBrowserActivity.ContentProjectAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup r3, int r4) {
                r2 = this;
                ca.dnamobile.javalauncher.ContentBrowserActivity r4 = r2.this$0
                android.view.LayoutInflater r4 = r4.getLayoutInflater()
                int r0 = ca.dnamobile.javalauncher.R.layout.item_content_project
                r1 = 0
                android.view.View r3 = r4.inflate(r0, r3, r1)
                r3.setFocusable(r1)
                r3.setFocusableInTouchMode(r1)
                ca.dnamobile.javalauncher.ContentBrowserActivity$ContentProjectAdapter$ViewHolder r4 = new ca.dnamobile.javalauncher.ContentBrowserActivity$ContentProjectAdapter$ViewHolder
                r4.<init>(r2, r3)
                return r4
        }

        void submit(java.util.List<ca.dnamobile.javalauncher.modmanager.ModrinthProject> r2) {
                r1 = this;
                ca.dnamobile.javalauncher.ContentBrowserActivity r0 = r1.this$0
                ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = ca.dnamobile.javalauncher.ContentBrowserActivity.m86$$Nest$fgetselectedType(r0)
                r1.boundType = r0
                java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModrinthProject> r0 = r1.items
                r0.clear()
                java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModrinthProject> r0 = r1.items
                r0.addAll(r2)
                r1.notifyDataSetChanged()
                return
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.ContentBrowserActivity$ContentProjectAdapter-IA, reason: invalid class name */
    /* JADX INFO: compiled from: D8$$SyntheticClass */
    public final /* synthetic */ class ContentProjectAdapterIA {
    }

    private enum ContentSort extends java.lang.Enum<ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort> {
        private static final /* synthetic */ ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort[] $VALUES = null;
        public static final ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort DOWNLOADS = null;
        public static final ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort FOLLOWERS = null;
        public static final ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort NAME = null;
        public static final ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort NEWEST = null;
        public static final ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort UPDATED = null;
        public static final ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort VERSIONS = null;
        final java.lang.String apiKey;
        final java.lang.String label;
        final int menuId;
        final boolean modpacks;
        final boolean regularContent;

        private static /* synthetic */ ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort[] $values() {
                ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort r0 = ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort.DOWNLOADS
                ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort r1 = ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort.UPDATED
                ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort r2 = ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort.NEWEST
                ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort r3 = ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort.FOLLOWERS
                ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort r4 = ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort.VERSIONS
                ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort r5 = ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort.NAME
                ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort[] r0 = new ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort[]{r0, r1, r2, r3, r4, r5}
                return r0
        }

        static {
                ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort r8 = new ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort
                r6 = 1
                r7 = 1
                java.lang.String r1 = "DOWNLOADS"
                r2 = 0
                r3 = 1
                java.lang.String r4 = "Downloads"
                java.lang.String r5 = "downloads"
                r0 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort.DOWNLOADS = r8
                ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort r0 = new ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort
                r15 = 1
                r16 = 0
                java.lang.String r10 = "UPDATED"
                r11 = 1
                r12 = 2
                java.lang.String r13 = "Recently Updated"
                java.lang.String r14 = "updated"
                r9 = r0
                r9.<init>(r10, r11, r12, r13, r14, r15, r16)
                ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort.UPDATED = r0
                ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort r0 = new ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort
                r8 = 0
                java.lang.String r2 = "NEWEST"
                r3 = 2
                r4 = 3
                java.lang.String r5 = "Newest"
                java.lang.String r6 = "newest"
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort.NEWEST = r0
                ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort r0 = new ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort
                java.lang.String r10 = "FOLLOWERS"
                r11 = 3
                r12 = 4
                java.lang.String r13 = "Followers"
                java.lang.String r14 = "followers"
                r9 = r0
                r9.<init>(r10, r11, r12, r13, r14, r15, r16)
                ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort.FOLLOWERS = r0
                ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort r0 = new ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort
                java.lang.String r2 = "VERSIONS"
                r3 = 4
                r4 = 5
                java.lang.String r5 = "Versions"
                java.lang.String r6 = "versions"
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort.VERSIONS = r0
                ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort r0 = new ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort
                java.lang.String r10 = "NAME"
                r11 = 5
                r12 = 6
                java.lang.String r13 = "Name"
                java.lang.String r14 = "name"
                r9 = r0
                r9.<init>(r10, r11, r12, r13, r14, r15, r16)
                ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort.NAME = r0
                ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort[] r0 = $values()
                ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort.$VALUES = r0
                return
        }

        ContentSort(java.lang.String r1, int r2, int r3, java.lang.String r4, java.lang.String r5, boolean r6, boolean r7) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.menuId = r3
                r0.label = r4
                r0.apiKey = r5
                r0.modpacks = r6
                r0.regularContent = r7
                return
        }

        static ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort fromMenuId(int r5) {
                ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort[] r0 = values()
                int r1 = r0.length
                r2 = 0
            L6:
                if (r2 >= r1) goto L12
                r3 = r0[r2]
                int r4 = r3.menuId
                if (r4 != r5) goto Lf
                return r3
            Lf:
                int r2 = r2 + 1
                goto L6
            L12:
                r5 = 0
                return r5
        }

        public static ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort valueOf(java.lang.String r1) {
                java.lang.Class<ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort> r0 = ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort r1 = (ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort) r1
                return r1
        }

        public static ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort[] values() {
                ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort[] r0 = ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort.$VALUES
                java.lang.Object r0 = r0.clone()
                ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort[] r0 = (ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort[]) r0
                return r0
        }

        boolean isAvailableFor(ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2) {
                r1 = this;
                ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODPACKS
                if (r2 != r0) goto L7
                boolean r2 = r1.modpacks
                goto L9
            L7:
                boolean r2 = r1.regularContent
            L9:
                return r2
        }
    }

    private enum ContentSource extends java.lang.Enum<ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSource> {
        private static final /* synthetic */ ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSource[] $VALUES = null;
        public static final ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSource CURSEFORGE = null;
        public static final ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSource MODRINTH = null;

        private static /* synthetic */ ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSource[] $values() {
                ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSource r0 = ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSource.MODRINTH
                ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSource r1 = ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSource.CURSEFORGE
                ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSource[] r0 = new ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSource[]{r0, r1}
                return r0
        }

        static {
                ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSource r0 = new ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSource
                java.lang.String r1 = "MODRINTH"
                r2 = 0
                r0.<init>(r1, r2)
                ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSource.MODRINTH = r0
                ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSource r0 = new ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSource
                java.lang.String r1 = "CURSEFORGE"
                r2 = 1
                r0.<init>(r1, r2)
                ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSource.CURSEFORGE = r0
                ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSource[] r0 = $values()
                ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSource.$VALUES = r0
                return
        }

        ContentSource(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSource valueOf(java.lang.String r1) {
                java.lang.Class<ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSource> r0 = ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSource.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSource r1 = (ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSource) r1
                return r1
        }

        public static ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSource[] values() {
                ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSource[] r0 = ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSource.$VALUES
                java.lang.Object r0 = r0.clone()
                ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSource[] r0 = (ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSource[]) r0
                return r0
        }
    }

    private interface ModpackMinecraftVersionClickListener {
        void onMinecraftVersionClicked(ca.dnamobile.javalauncher.ContentBrowserActivity.ModpackMinecraftVersionGroup r1);
    }

    private final class ModpackMinecraftVersionDialogAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<ca.dnamobile.javalauncher.ContentBrowserActivity.ModpackMinecraftVersionDialogAdapter.ViewHolder> {
        private final java.util.ArrayList<ca.dnamobile.javalauncher.ContentBrowserActivity.ModpackMinecraftVersionGroup> groups;
        private final ca.dnamobile.javalauncher.ContentBrowserActivity.ModpackMinecraftVersionClickListener listener;
        final /* synthetic */ ca.dnamobile.javalauncher.ContentBrowserActivity this$0;

        final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            final android.widget.TextView subtitle;
            final /* synthetic */ ca.dnamobile.javalauncher.ContentBrowserActivity.ModpackMinecraftVersionDialogAdapter this$1;
            final android.widget.TextView title;

            ViewHolder(ca.dnamobile.javalauncher.ContentBrowserActivity.ModpackMinecraftVersionDialogAdapter r1, android.view.View r2, android.widget.TextView r3, android.widget.TextView r4) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>(r2)
                    r0.title = r3
                    r0.subtitle = r4
                    return
            }
        }

        public static /* synthetic */ void $r8$lambda$Lh3vaKfEFPfh278FSnamM_dYEQI(ca.dnamobile.javalauncher.ContentBrowserActivity.ModpackMinecraftVersionDialogAdapter r0, ca.dnamobile.javalauncher.ContentBrowserActivity.ModpackMinecraftVersionGroup r1, android.view.View r2) {
                r0.lambda$onBindViewHolder$0(r1, r2)
                return
        }

        ModpackMinecraftVersionDialogAdapter(ca.dnamobile.javalauncher.ContentBrowserActivity r1, java.util.ArrayList<ca.dnamobile.javalauncher.ContentBrowserActivity.ModpackMinecraftVersionGroup> r2, ca.dnamobile.javalauncher.ContentBrowserActivity.ModpackMinecraftVersionClickListener r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.groups = r2
                r0.listener = r3
                return
        }

        private /* synthetic */ void lambda$onBindViewHolder$0(ca.dnamobile.javalauncher.ContentBrowserActivity.ModpackMinecraftVersionGroup r1, android.view.View r2) {
                r0 = this;
                ca.dnamobile.javalauncher.ContentBrowserActivity$ModpackMinecraftVersionClickListener r2 = r0.listener
                r2.onMinecraftVersionClicked(r1)
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
                r1 = this;
                java.util.ArrayList<ca.dnamobile.javalauncher.ContentBrowserActivity$ModpackMinecraftVersionGroup> r0 = r1.groups
                int r0 = r0.size()
                return r0
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
                r0 = this;
                ca.dnamobile.javalauncher.ContentBrowserActivity$ModpackMinecraftVersionDialogAdapter$ViewHolder r1 = (ca.dnamobile.javalauncher.ContentBrowserActivity.ModpackMinecraftVersionDialogAdapter.ViewHolder) r1
                r0.onBindViewHolder(r1, r2)
                return
        }

        public void onBindViewHolder(ca.dnamobile.javalauncher.ContentBrowserActivity.ModpackMinecraftVersionDialogAdapter.ViewHolder r4, int r5) {
                r3 = this;
                java.util.ArrayList<ca.dnamobile.javalauncher.ContentBrowserActivity$ModpackMinecraftVersionGroup> r0 = r3.groups
                java.lang.Object r5 = r0.get(r5)
                ca.dnamobile.javalauncher.ContentBrowserActivity$ModpackMinecraftVersionGroup r5 = (ca.dnamobile.javalauncher.ContentBrowserActivity.ModpackMinecraftVersionGroup) r5
                android.widget.TextView r0 = r4.title
                ca.dnamobile.javalauncher.ContentBrowserActivity r1 = r3.this$0
                java.lang.String r2 = r5.minecraftVersion
                java.lang.String r1 = ca.dnamobile.javalauncher.ContentBrowserActivity.m98$$Nest$mformatMinecraftVersionTitle(r1, r2)
                r0.setText(r1)
                android.widget.TextView r0 = r4.subtitle
                ca.dnamobile.javalauncher.ContentBrowserActivity r1 = r3.this$0
                java.lang.String r1 = ca.dnamobile.javalauncher.ContentBrowserActivity.m91$$Nest$mbuildMinecraftVersionGroupSubtitle(r1, r5)
                r0.setText(r1)
                android.view.View r4 = r4.itemView
                ca.dnamobile.javalauncher.ContentBrowserActivity$ModpackMinecraftVersionDialogAdapter$$ExternalSyntheticLambda0 r0 = new ca.dnamobile.javalauncher.ContentBrowserActivity$ModpackMinecraftVersionDialogAdapter$$ExternalSyntheticLambda0
                r0.<init>(r3, r5)
                r4.setOnClickListener(r0)
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r1, int r2) {
                r0 = this;
                ca.dnamobile.javalauncher.ContentBrowserActivity$ModpackMinecraftVersionDialogAdapter$ViewHolder r1 = r0.onCreateViewHolder(r1, r2)
                return r1
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public ca.dnamobile.javalauncher.ContentBrowserActivity.ModpackMinecraftVersionDialogAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup r8, int r9) {
                r7 = this;
                android.widget.LinearLayout r9 = new android.widget.LinearLayout
                android.content.Context r0 = r8.getContext()
                r9.<init>(r0)
                r0 = 1
                r9.setOrientation(r0)
                r1 = 16
                r9.setGravity(r1)
                ca.dnamobile.javalauncher.ContentBrowserActivity r2 = r7.this$0
                int r2 = ca.dnamobile.javalauncher.ContentBrowserActivity.m97$$Nest$mdp(r2, r1)
                ca.dnamobile.javalauncher.ContentBrowserActivity r3 = r7.this$0
                r4 = 14
                int r3 = ca.dnamobile.javalauncher.ContentBrowserActivity.m97$$Nest$mdp(r3, r4)
                ca.dnamobile.javalauncher.ContentBrowserActivity r5 = r7.this$0
                int r5 = ca.dnamobile.javalauncher.ContentBrowserActivity.m97$$Nest$mdp(r5, r1)
                ca.dnamobile.javalauncher.ContentBrowserActivity r6 = r7.this$0
                int r4 = ca.dnamobile.javalauncher.ContentBrowserActivity.m97$$Nest$mdp(r6, r4)
                r9.setPadding(r2, r3, r5, r4)
                ca.dnamobile.javalauncher.ContentBrowserActivity r2 = r7.this$0
                r3 = 78
                int r2 = ca.dnamobile.javalauncher.ContentBrowserActivity.m97$$Nest$mdp(r2, r3)
                r9.setMinimumHeight(r2)
                android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
                r2.<init>()
                int r3 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.COLOR_CARD_BG
                r2.setColor(r3)
                ca.dnamobile.javalauncher.ContentBrowserActivity r3 = r7.this$0
                int r1 = ca.dnamobile.javalauncher.ContentBrowserActivity.m97$$Nest$mdp(r3, r1)
                float r1 = (float) r1
                r2.setCornerRadius(r1)
                ca.dnamobile.javalauncher.ContentBrowserActivity r1 = r7.this$0
                int r1 = ca.dnamobile.javalauncher.ContentBrowserActivity.m97$$Nest$mdp(r1, r0)
                int r3 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.COLOR_CARD_STROKE
                r2.setStroke(r1, r3)
                r9.setBackground(r2)
                android.widget.TextView r1 = new android.widget.TextView
                android.content.Context r2 = r8.getContext()
                r1.<init>(r2)
                r2 = 1099431936(0x41880000, float:17.0)
                r3 = 2
                r1.setTextSize(r3, r2)
                int r2 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.COLOR_TEXT_PRIMARY
                r1.setTextColor(r2)
                android.graphics.Typeface r2 = r1.getTypeface()
                r1.setTypeface(r2, r0)
                r1.setSingleLine(r0)
                android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
                r1.setEllipsize(r0)
                android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
                r2 = -1
                r4 = -2
                r0.<init>(r2, r4)
                r9.addView(r1, r0)
                android.widget.TextView r0 = new android.widget.TextView
                android.content.Context r8 = r8.getContext()
                r0.<init>(r8)
                r8 = 1095761920(0x41500000, float:13.0)
                r0.setTextSize(r3, r8)
                int r8 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.COLOR_TEXT_SECONDARY
                r0.setTextColor(r8)
                r8 = 0
                r0.setSingleLine(r8)
                r0.setMaxLines(r3)
                android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
                r3.<init>(r2, r4)
                ca.dnamobile.javalauncher.ContentBrowserActivity r5 = r7.this$0
                r6 = 4
                int r5 = ca.dnamobile.javalauncher.ContentBrowserActivity.m97$$Nest$mdp(r5, r6)
                r3.topMargin = r5
                r9.addView(r0, r3)
                androidx.recyclerview.widget.RecyclerView$LayoutParams r3 = new androidx.recyclerview.widget.RecyclerView$LayoutParams
                r3.<init>(r2, r4)
                ca.dnamobile.javalauncher.ContentBrowserActivity r2 = r7.this$0
                r4 = 8
                int r2 = ca.dnamobile.javalauncher.ContentBrowserActivity.m97$$Nest$mdp(r2, r4)
                r3.setMargins(r8, r8, r8, r2)
                r9.setLayoutParams(r3)
                ca.dnamobile.javalauncher.ContentBrowserActivity$ModpackMinecraftVersionDialogAdapter$ViewHolder r8 = new ca.dnamobile.javalauncher.ContentBrowserActivity$ModpackMinecraftVersionDialogAdapter$ViewHolder
                r8.<init>(r7, r9, r1, r0)
                return r8
        }
    }

    private static final class ModpackMinecraftVersionGroup {
        final java.lang.String minecraftVersion;
        final java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice> versions;

        ModpackMinecraftVersionGroup(java.lang.String r1, java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice> r2) {
                r0 = this;
                r0.<init>()
                r0.minecraftVersion = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r2)
                r0.versions = r1
                return
        }
    }

    private interface ModpackVersionClickListener {
        void onVersionClicked(ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice r1);
    }

    private final class ModpackVersionDialogAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
        private final ca.dnamobile.javalauncher.ContentBrowserActivity.ModpackVersionClickListener listener;
        private final java.util.ArrayList<ca.dnamobile.javalauncher.ContentBrowserActivity.ModpackVersionDialogRow> rows;
        final /* synthetic */ ca.dnamobile.javalauncher.ContentBrowserActivity this$0;

        final class HeaderViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            final android.widget.TextView header;
            final /* synthetic */ ca.dnamobile.javalauncher.ContentBrowserActivity.ModpackVersionDialogAdapter this$1;

            HeaderViewHolder(ca.dnamobile.javalauncher.ContentBrowserActivity.ModpackVersionDialogAdapter r1, android.widget.TextView r2) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>(r2)
                    r0.header = r2
                    return
            }
        }

        final class VersionViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            final android.widget.TextView file;
            final android.widget.TextView meta;
            final /* synthetic */ ca.dnamobile.javalauncher.ContentBrowserActivity.ModpackVersionDialogAdapter this$1;
            final android.widget.TextView title;
            final android.widget.TextView warning;

            VersionViewHolder(ca.dnamobile.javalauncher.ContentBrowserActivity.ModpackVersionDialogAdapter r1, android.view.View r2, android.widget.TextView r3, android.widget.TextView r4, android.widget.TextView r5, android.widget.TextView r6) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>(r2)
                    r0.title = r3
                    r0.meta = r4
                    r0.file = r5
                    r0.warning = r6
                    return
            }
        }

        public static /* synthetic */ void $r8$lambda$HcJfh3TK6qNaCrjHK2Mcdnu5OSY(ca.dnamobile.javalauncher.ContentBrowserActivity.ModpackVersionDialogAdapter r0, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice r1, android.view.View r2) {
                r0.lambda$onBindViewHolder$0(r1, r2)
                return
        }

        ModpackVersionDialogAdapter(ca.dnamobile.javalauncher.ContentBrowserActivity r1, java.util.ArrayList<ca.dnamobile.javalauncher.ContentBrowserActivity.ModpackVersionDialogRow> r2, ca.dnamobile.javalauncher.ContentBrowserActivity.ModpackVersionClickListener r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.rows = r2
                r0.listener = r3
                return
        }

        private /* synthetic */ void lambda$onBindViewHolder$0(ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice r1, android.view.View r2) {
                r0 = this;
                ca.dnamobile.javalauncher.ContentBrowserActivity$ModpackVersionClickListener r2 = r0.listener
                r2.onVersionClicked(r1)
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
                r1 = this;
                java.util.ArrayList<ca.dnamobile.javalauncher.ContentBrowserActivity$ModpackVersionDialogRow> r0 = r1.rows
                int r0 = r0.size()
                return r0
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int r2) {
                r1 = this;
                java.util.ArrayList<ca.dnamobile.javalauncher.ContentBrowserActivity$ModpackVersionDialogRow> r0 = r1.rows
                java.lang.Object r2 = r0.get(r2)
                ca.dnamobile.javalauncher.ContentBrowserActivity$ModpackVersionDialogRow r2 = (ca.dnamobile.javalauncher.ContentBrowserActivity.ModpackVersionDialogRow) r2
                int r2 = r2.type
                return r2
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r5, int r6) {
                r4 = this;
                java.util.ArrayList<ca.dnamobile.javalauncher.ContentBrowserActivity$ModpackVersionDialogRow> r0 = r4.rows
                java.lang.Object r6 = r0.get(r6)
                ca.dnamobile.javalauncher.ContentBrowserActivity$ModpackVersionDialogRow r6 = (ca.dnamobile.javalauncher.ContentBrowserActivity.ModpackVersionDialogRow) r6
                boolean r0 = r5 instanceof ca.dnamobile.javalauncher.ContentBrowserActivity.ModpackVersionDialogAdapter.HeaderViewHolder
                r1 = 1
                if (r0 == 0) goto L43
                ca.dnamobile.javalauncher.ContentBrowserActivity$ModpackVersionDialogAdapter$HeaderViewHolder r5 = (ca.dnamobile.javalauncher.ContentBrowserActivity.ModpackVersionDialogAdapter.HeaderViewHolder) r5
                android.widget.TextView r5 = r5.header
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = r6.headerTitle
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.String r2 = "  ·  "
                java.lang.StringBuilder r0 = r0.append(r2)
                int r2 = r6.headerCount
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.String r2 = " "
                java.lang.StringBuilder r0 = r0.append(r2)
                int r6 = r6.headerCount
                if (r6 != r1) goto L35
                java.lang.String r6 = "version"
                goto L37
            L35:
                java.lang.String r6 = "versions"
            L37:
                java.lang.StringBuilder r6 = r0.append(r6)
                java.lang.String r6 = r6.toString()
                r5.setText(r6)
                return
            L43:
                ca.dnamobile.javalauncher.ContentBrowserActivity$ModpackVersionDialogAdapter$VersionViewHolder r5 = (ca.dnamobile.javalauncher.ContentBrowserActivity.ModpackVersionDialogAdapter.VersionViewHolder) r5
                ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$ModpackVersionChoice r6 = r6.version
                if (r6 != 0) goto L4a
                return
            L4a:
                android.widget.TextView r0 = r5.title
                java.lang.String r2 = r6.getDisplayTitle()
                r0.setText(r2)
                android.widget.TextView r0 = r5.meta
                ca.dnamobile.javalauncher.ContentBrowserActivity r2 = r4.this$0
                java.lang.String r2 = ca.dnamobile.javalauncher.ContentBrowserActivity.m93$$Nest$mbuildVersionMetaLine(r2, r6)
                r0.setText(r2)
                android.widget.TextView r0 = r5.file
                ca.dnamobile.javalauncher.ContentBrowserActivity r2 = r4.this$0
                java.lang.String r2 = ca.dnamobile.javalauncher.ContentBrowserActivity.m92$$Nest$mbuildVersionFileLine(r2, r6)
                r0.setText(r2)
                ca.dnamobile.javalauncher.ContentBrowserActivity r0 = r4.this$0
                boolean r0 = ca.dnamobile.javalauncher.ContentBrowserActivity.m102$$Nest$misGlobalBrowserMode(r0)
                r2 = 0
                if (r0 != 0) goto L85
                ca.dnamobile.javalauncher.ContentBrowserActivity r0 = r4.this$0
                java.lang.String r0 = ca.dnamobile.javalauncher.ContentBrowserActivity.m84$$Nest$fgetgameVersionId(r0)
                ca.dnamobile.javalauncher.ContentBrowserActivity r3 = r4.this$0
                java.lang.String r3 = ca.dnamobile.javalauncher.ContentBrowserActivity.m85$$Nest$fgetloader(r3)
                boolean r0 = r6.isCompatibleWith(r0, r3)
                if (r0 != 0) goto L85
                goto L86
            L85:
                r1 = r2
            L86:
                android.widget.TextView r0 = r5.warning
                if (r1 == 0) goto L8b
                goto L8d
            L8b:
                r2 = 8
            L8d:
                r0.setVisibility(r2)
                if (r1 == 0) goto L9a
                android.widget.TextView r0 = r5.warning
                java.lang.String r1 = "Does not match the current instance filter. It will still install using this pack version's Minecraft version and loader."
                r0.setText(r1)
                goto La1
            L9a:
                android.widget.TextView r0 = r5.warning
                java.lang.String r1 = ""
                r0.setText(r1)
            La1:
                android.view.View r5 = r5.itemView
                ca.dnamobile.javalauncher.ContentBrowserActivity$ModpackVersionDialogAdapter$$ExternalSyntheticLambda0 r0 = new ca.dnamobile.javalauncher.ContentBrowserActivity$ModpackVersionDialogAdapter$$ExternalSyntheticLambda0
                r0.<init>(r4, r6)
                r5.setOnClickListener(r0)
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r13, int r14) {
                r12 = this;
                r0 = 6
                r1 = 1095761920(0x41500000, float:13.0)
                r2 = 16
                r3 = 1
                r4 = 2
                if (r14 != 0) goto L47
                android.widget.TextView r14 = new android.widget.TextView
                android.content.Context r13 = r13.getContext()
                r14.<init>(r13)
                r14.setGravity(r2)
                r14.setTextSize(r4, r1)
                int r13 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.COLOR_TEXT_SECONDARY
                r14.setTextColor(r13)
                android.graphics.Typeface r13 = r14.getTypeface()
                r14.setTypeface(r13, r3)
                ca.dnamobile.javalauncher.ContentBrowserActivity r13 = r12.this$0
                int r13 = ca.dnamobile.javalauncher.ContentBrowserActivity.m97$$Nest$mdp(r13, r4)
                ca.dnamobile.javalauncher.ContentBrowserActivity r1 = r12.this$0
                r2 = 14
                int r1 = ca.dnamobile.javalauncher.ContentBrowserActivity.m97$$Nest$mdp(r1, r2)
                ca.dnamobile.javalauncher.ContentBrowserActivity r2 = r12.this$0
                int r2 = ca.dnamobile.javalauncher.ContentBrowserActivity.m97$$Nest$mdp(r2, r4)
                ca.dnamobile.javalauncher.ContentBrowserActivity r3 = r12.this$0
                int r0 = ca.dnamobile.javalauncher.ContentBrowserActivity.m97$$Nest$mdp(r3, r0)
                r14.setPadding(r13, r1, r2, r0)
                ca.dnamobile.javalauncher.ContentBrowserActivity$ModpackVersionDialogAdapter$HeaderViewHolder r13 = new ca.dnamobile.javalauncher.ContentBrowserActivity$ModpackVersionDialogAdapter$HeaderViewHolder
                r13.<init>(r12, r14)
                return r13
            L47:
                android.widget.LinearLayout r14 = new android.widget.LinearLayout
                android.content.Context r5 = r13.getContext()
                r14.<init>(r5)
                r14.setOrientation(r3)
                r14.setGravity(r2)
                ca.dnamobile.javalauncher.ContentBrowserActivity r5 = r12.this$0
                int r5 = ca.dnamobile.javalauncher.ContentBrowserActivity.m97$$Nest$mdp(r5, r2)
                ca.dnamobile.javalauncher.ContentBrowserActivity r6 = r12.this$0
                r7 = 12
                int r6 = ca.dnamobile.javalauncher.ContentBrowserActivity.m97$$Nest$mdp(r6, r7)
                ca.dnamobile.javalauncher.ContentBrowserActivity r8 = r12.this$0
                int r8 = ca.dnamobile.javalauncher.ContentBrowserActivity.m97$$Nest$mdp(r8, r2)
                ca.dnamobile.javalauncher.ContentBrowserActivity r9 = r12.this$0
                int r7 = ca.dnamobile.javalauncher.ContentBrowserActivity.m97$$Nest$mdp(r9, r7)
                r14.setPadding(r5, r6, r8, r7)
                ca.dnamobile.javalauncher.ContentBrowserActivity r5 = r12.this$0
                r6 = 92
                int r5 = ca.dnamobile.javalauncher.ContentBrowserActivity.m97$$Nest$mdp(r5, r6)
                r14.setMinimumHeight(r5)
                android.graphics.drawable.GradientDrawable r5 = new android.graphics.drawable.GradientDrawable
                r5.<init>()
                int r6 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.COLOR_CARD_BG
                r5.setColor(r6)
                ca.dnamobile.javalauncher.ContentBrowserActivity r6 = r12.this$0
                int r2 = ca.dnamobile.javalauncher.ContentBrowserActivity.m97$$Nest$mdp(r6, r2)
                float r2 = (float) r2
                r5.setCornerRadius(r2)
                ca.dnamobile.javalauncher.ContentBrowserActivity r2 = r12.this$0
                int r2 = ca.dnamobile.javalauncher.ContentBrowserActivity.m97$$Nest$mdp(r2, r3)
                int r6 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.COLOR_CARD_STROKE
                r5.setStroke(r2, r6)
                r14.setBackground(r5)
                android.widget.TextView r5 = new android.widget.TextView
                android.content.Context r2 = r13.getContext()
                r5.<init>(r2)
                r2 = 1098907648(0x41800000, float:16.0)
                r5.setTextSize(r4, r2)
                int r2 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.COLOR_TEXT_PRIMARY
                r5.setTextColor(r2)
                android.graphics.Typeface r2 = r5.getTypeface()
                r5.setTypeface(r2, r3)
                r2 = 0
                r5.setSingleLine(r2)
                r5.setMaxLines(r4)
                android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
                r7 = -1
                r8 = -2
                r6.<init>(r7, r8)
                r14.addView(r5, r6)
                android.widget.TextView r6 = new android.widget.TextView
                android.content.Context r9 = r13.getContext()
                r6.<init>(r9)
                r6.setTextSize(r4, r1)
                int r1 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.COLOR_TEXT_SECONDARY
                r6.setTextColor(r1)
                r6.setSingleLine(r2)
                r6.setMaxLines(r4)
                android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
                r1.<init>(r7, r8)
                ca.dnamobile.javalauncher.ContentBrowserActivity r9 = r12.this$0
                r10 = 4
                int r9 = ca.dnamobile.javalauncher.ContentBrowserActivity.m97$$Nest$mdp(r9, r10)
                r1.topMargin = r9
                r14.addView(r6, r1)
                android.widget.TextView r9 = new android.widget.TextView
                android.content.Context r1 = r13.getContext()
                r9.<init>(r1)
                r1 = 1094713344(0x41400000, float:12.0)
                r9.setTextSize(r4, r1)
                int r11 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.COLOR_TEXT_MUTED
                r9.setTextColor(r11)
                r9.setSingleLine(r3)
                android.text.TextUtils$TruncateAt r3 = android.text.TextUtils.TruncateAt.MIDDLE
                r9.setEllipsize(r3)
                android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
                r3.<init>(r7, r8)
                ca.dnamobile.javalauncher.ContentBrowserActivity r11 = r12.this$0
                int r10 = ca.dnamobile.javalauncher.ContentBrowserActivity.m97$$Nest$mdp(r11, r10)
                r3.topMargin = r10
                r14.addView(r9, r3)
                android.widget.TextView r10 = new android.widget.TextView
                android.content.Context r13 = r13.getContext()
                r10.<init>(r13)
                r10.setTextSize(r4, r1)
                int r13 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.COLOR_TEXT_SECONDARY
                r10.setTextColor(r13)
                r10.setSingleLine(r2)
                android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
                r13.<init>(r7, r8)
                ca.dnamobile.javalauncher.ContentBrowserActivity r1 = r12.this$0
                int r0 = ca.dnamobile.javalauncher.ContentBrowserActivity.m97$$Nest$mdp(r1, r0)
                r13.topMargin = r0
                r14.addView(r10, r13)
                androidx.recyclerview.widget.RecyclerView$LayoutParams r13 = new androidx.recyclerview.widget.RecyclerView$LayoutParams
                r13.<init>(r7, r8)
                ca.dnamobile.javalauncher.ContentBrowserActivity r0 = r12.this$0
                r1 = 8
                int r0 = ca.dnamobile.javalauncher.ContentBrowserActivity.m97$$Nest$mdp(r0, r1)
                r13.setMargins(r2, r2, r2, r0)
                r14.setLayoutParams(r13)
                ca.dnamobile.javalauncher.ContentBrowserActivity$ModpackVersionDialogAdapter$VersionViewHolder r13 = new ca.dnamobile.javalauncher.ContentBrowserActivity$ModpackVersionDialogAdapter$VersionViewHolder
                r0 = r13
                r1 = r12
                r2 = r14
                r3 = r5
                r4 = r6
                r5 = r9
                r6 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r13
        }
    }

    private static final class ModpackVersionDialogRow {
        static final int TYPE_HEADER = 0;
        static final int TYPE_VERSION = 1;
        final int headerCount;
        final java.lang.String headerTitle;
        final int type;
        final ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice version;

        private ModpackVersionDialogRow(int r1, java.lang.String r2, int r3, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice r4) {
                r0 = this;
                r0.<init>()
                r0.type = r1
                r0.headerTitle = r2
                r0.headerCount = r3
                r0.version = r4
                return
        }

        static ca.dnamobile.javalauncher.ContentBrowserActivity.ModpackVersionDialogRow header(java.lang.String r3, int r4) {
                ca.dnamobile.javalauncher.ContentBrowserActivity$ModpackVersionDialogRow r0 = new ca.dnamobile.javalauncher.ContentBrowserActivity$ModpackVersionDialogRow
                r1 = 0
                r2 = 0
                r0.<init>(r1, r3, r4, r2)
                return r0
        }

        static ca.dnamobile.javalauncher.ContentBrowserActivity.ModpackVersionDialogRow version(ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice r4) {
                ca.dnamobile.javalauncher.ContentBrowserActivity$ModpackVersionDialogRow r0 = new ca.dnamobile.javalauncher.ContentBrowserActivity$ModpackVersionDialogRow
                java.lang.String r1 = ""
                r2 = 0
                r3 = 1
                r0.<init>(r3, r1, r2, r4)
                return r0
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$--WdbIDu0Reciwd-i5x1VYZ3FXc, reason: not valid java name */
    public static /* synthetic */ void m71$r8$lambda$WdbIDu0Reciwdi5x1VYZ3FXc(ca.dnamobile.javalauncher.ContentBrowserActivity r0, java.lang.Throwable r1) {
            r0.lambda$showModpackVersionPicker$28(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$0A6RYrsAlFsjyoDL3WUXIYAoPuI(ca.dnamobile.javalauncher.ContentBrowserActivity r0) {
            r0.lambda$forceScrollTop$14()
            return
    }

    public static /* synthetic */ void $r8$lambda$1Yro5KKR8ekeXCGn4jOt5OnY_iU(ca.dnamobile.javalauncher.ContentBrowserActivity r0, android.view.View r1) {
            r0.lambda$setupSortDropdown$3(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$2w-cSZz8OW4hqBdLBflfMhbPj_w, reason: not valid java name */
    public static /* synthetic */ int m72$r8$lambda$2wcSZz8OW4hqBdLBflfMhbPj_w(ca.dnamobile.javalauncher.ContentBrowserActivity r0, ca.dnamobile.javalauncher.modmanager.ModrinthProject r1, ca.dnamobile.javalauncher.modmanager.ModrinthProject r2) {
            int r0 = r0.lambda$applyClientSideSortIfNeeded$19(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$34CQ-SEemNOEI7-JV04AUjq7-po, reason: not valid java name */
    public static /* synthetic */ void m73$r8$lambda$34CQSEemNOEI7JV04AUjq7po(ca.dnamobile.javalauncher.ContentBrowserActivity r0, ca.dnamobile.javalauncher.modmanager.ModrinthProject r1, android.content.DialogInterface r2, int r3) {
            r0.lambda$confirmInstall$23(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$4iZ9LBY-krh_M9-jFoqqtLOVchM, reason: not valid java name */
    public static /* synthetic */ boolean m74$r8$lambda$4iZ9LBYkrh_M9jFoqqtLOVchM(ca.dnamobile.javalauncher.ContentBrowserActivity r0, android.widget.TextView r1, int r2, android.view.KeyEvent r3) {
            boolean r0 = r0.lambda$setupSearch$2(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ int $r8$lambda$64bA9I0Bw5kyUCzmkQ8u9vREON4(ca.dnamobile.javalauncher.ContentBrowserActivity r0, ca.dnamobile.javalauncher.modmanager.ModrinthProject r1, ca.dnamobile.javalauncher.modmanager.ModrinthProject r2) {
            int r0 = r0.lambda$applyClientSideSortIfNeeded$18(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$9_DgpzPL1Z13fefSNIA1X-o5yWM, reason: not valid java name */
    public static /* synthetic */ void m75$r8$lambda$9_DgpzPL1Z13fefSNIA1Xo5yWM(ca.dnamobile.javalauncher.ContentBrowserActivity r0, ca.dnamobile.javalauncher.modmanager.ModrinthProject r1, java.lang.String r2, android.widget.ImageView r3, int r4) {
            r0.lambda$resolveProjectIconUrlAsync$40(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void $r8$lambda$9eNFF5y_hihwaO5nk8M59pW5N8A(ca.dnamobile.javalauncher.ContentBrowserActivity r0, ca.dnamobile.javalauncher.modmanager.ModrinthProject r1) {
            r0.lambda$showModpackVersionPicker$29(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$CO_xtCB4pDI3ZFLjlkW7OI_gRow(ca.dnamobile.javalauncher.ContentBrowserActivity r0, com.google.android.material.button.MaterialButtonToggleGroup r1, int r2, boolean r3) {
            r0.lambda$setupSourceToggle$1(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$D32eWGwr0wdPgvXo0UZI5XLDcxI(ca.dnamobile.javalauncher.ContentBrowserActivity r0) {
            r0.lambda$showMinecraftVersionFilterDialog$7()
            return
    }

    public static /* synthetic */ void $r8$lambda$D8pI4Pz09ovtY1p2w5Y3iPWWXx4(ca.dnamobile.javalauncher.ContentBrowserActivity r0, android.view.View r1) {
            r0.lambda$setupPagination$11(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$DWIfZYvhCaBl7tU1VLxTdfbGUnc(ca.dnamobile.javalauncher.ContentBrowserActivity r0, java.lang.Throwable r1) {
            r0.lambda$showMinecraftVersionFilterDialog$6(r1)
            return
    }

    public static /* synthetic */ int $r8$lambda$EJwOLwjTxRS2jnD4kTIeaIiyWKY(ca.dnamobile.javalauncher.ContentBrowserActivity r0, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice r1, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice r2) {
            int r0 = r0.lambda$sortModpackVersionsNewestFirst$41(r1, r2)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$FJrAJtytOxNL35SWBBPC15r6Ci4(ca.dnamobile.javalauncher.ContentBrowserActivity r0, java.util.ArrayList r1) {
            r0.lambda$showMinecraftVersionFilterDialog$5(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$I8czaPf2vUnoADAqHiqjFnknCZw(ca.dnamobile.javalauncher.ContentBrowserActivity r0, android.content.DialogInterface r1) {
            r0.lambda$confirmInstall$24(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$JShqYEfNp8j3L-0dW6lDfyk1mo0, reason: not valid java name */
    public static /* synthetic */ boolean m76$r8$lambda$JShqYEfNp8j3L0dW6lDfyk1mo0(ca.dnamobile.javalauncher.ContentBrowserActivity r0, ca.dnamobile.javalauncher.modmanager.ModrinthProject r1, android.view.MenuItem r2) {
            boolean r0 = r0.lambda$showProjectMenu$22(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$K-tT1COsruad2D4fF0gZC3I49Pk, reason: not valid java name */
    public static /* synthetic */ void m77$r8$lambda$KtT1COsruad2D4fF0gZC3I49Pk(ca.dnamobile.javalauncher.ContentBrowserActivity r0, androidx.appcompat.app.AlertDialog r1, android.content.DialogInterface r2) {
            r0.lambda$showMinecraftVersionPickerDialog$32(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$LJ_g6fvZEDtUV0wMvW8UJ5Gsuow(ca.dnamobile.javalauncher.ContentBrowserActivity r0, int r1, java.lang.Throwable r2) {
            r0.lambda$loadContent$16(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$Nvb3wr4VwGnhI-BymTSRgzz89WY, reason: not valid java name */
    public static /* synthetic */ void m78$r8$lambda$Nvb3wr4VwGnhIBymTSRgzz89WY(ca.dnamobile.javalauncher.ContentBrowserActivity r0, androidx.appcompat.app.AlertDialog r1, android.content.DialogInterface r2) {
            r0.lambda$showMinecraftVersionPickerDialog$31(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$OOg65ToGIWZ9Ge7SQhiMamkhT6o(ca.dnamobile.javalauncher.ContentBrowserActivity r0, ca.dnamobile.javalauncher.modmanager.ModrinthProject r1, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice r2) {
            r0.lambda$showModpackVersionsForMinecraftDialog$33(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$P5pCicKjJnSQ_3QKjmH_WT6g36I(ca.dnamobile.javalauncher.ContentBrowserActivity r0, androidx.appcompat.app.AlertDialog r1, android.content.DialogInterface r2) {
            r0.lambda$showModpackVersionsForMinecraftDialog$34(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$QpcwaPK_Ql4RqqZWz4PiKEm1VJ8(ca.dnamobile.javalauncher.ContentBrowserActivity r0, ca.dnamobile.javalauncher.modmanager.ModrinthProject r1, java.util.LinkedHashMap r2, ca.dnamobile.javalauncher.ContentBrowserActivity.ModpackMinecraftVersionGroup r3) {
            r0.lambda$showMinecraftVersionPickerDialog$30(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$Rprx_69FIlTASFDwaTx5Cb-4m3M, reason: not valid java name */
    public static /* synthetic */ void m79$r8$lambda$Rprx_69FIlTASFDwaTx5Cb4m3M(ca.dnamobile.javalauncher.ContentBrowserActivity r0, android.view.View r1) {
            r0.lambda$setupPagination$12(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$USQxqNOk3bh_49Z1pg3xpl4FM5E(ca.dnamobile.javalauncher.ContentBrowserActivity r0, java.util.ArrayList r1, ca.dnamobile.javalauncher.modmanager.ModrinthProject r2) {
            r0.lambda$showModpackVersionPicker$27(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$VBcTrrWHaDdEi1rSX2lw86D1ql8(ca.dnamobile.javalauncher.ContentBrowserActivity r0, ca.dnamobile.javalauncher.modmanager.ModrinthProject r1, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice r2, android.content.DialogInterface r3, int r4) {
            r0.lambda$confirmInstallModpackVersion$37(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void $r8$lambda$VkIAXp7KSBv3ajvOlzKM0nIRGVw(ca.dnamobile.javalauncher.ContentBrowserActivity r0, androidx.appcompat.app.AlertDialog r1, android.content.DialogInterface r2) {
            r0.lambda$showModpackVersionsForMinecraftDialog$35(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$Xscppk0Bpyba4plFfKYOmH6xQQw(ca.dnamobile.javalauncher.ContentBrowserActivity r0) {
            r0.lambda$forceScrollTop$13()
            return
    }

    public static /* synthetic */ void $r8$lambda$Y3khMEjmbUyaXQQ6HwB4yWo6I1Y(ca.dnamobile.javalauncher.ContentBrowserActivity r0, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1, ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSource r2, java.lang.String r3, java.lang.String r4, int r5, ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort r6, int r7, boolean r8) {
            r0.lambda$loadContent$17(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static /* synthetic */ void $r8$lambda$brtqwKRBjF6vZV4v4F6nO9WOENY(ca.dnamobile.javalauncher.ContentBrowserActivity r0, android.view.View r1) {
            r0.lambda$bindViews$0(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$c27giM0iteRN3TzQMoWNNhWzt1A(ca.dnamobile.javalauncher.ContentBrowserActivity r0, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice r1, ca.dnamobile.javalauncher.modmanager.ModrinthProject r2, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener r3) {
            r0.lambda$installModpackProject$26(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$e-QTSqGB5gUwhuxoTiwXgx4MJP0, reason: not valid java name */
    public static /* synthetic */ void m80$r8$lambda$eQTSqGB5gUwhuxoTiwXgx4MJP0(ca.dnamobile.javalauncher.ContentBrowserActivity r0, java.util.ArrayList r1, android.content.DialogInterface r2, int r3) {
            r0.lambda$showSortDialog$4(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$gOccwayAzO1wol8XNnF_GFkbaIY(ca.dnamobile.javalauncher.ContentBrowserActivity r0, int r1, int r2, java.util.ArrayList r3, boolean r4) {
            r0.lambda$loadContent$15(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ int $r8$lambda$gghwcpT23F4FAeN9YiUVOHjAEkE(ca.dnamobile.javalauncher.ContentBrowserActivity r0, java.lang.String r1, java.lang.String r2) {
            int r0 = r0.compareMinecraftVersionKeysDescending(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$kAOBFfMmme_Ea5yx-VNjS9XuW_I, reason: not valid java name */
    public static /* synthetic */ void m81$r8$lambda$kAOBFfMmme_Ea5yxVNjS9XuW_I(ca.dnamobile.javalauncher.ContentBrowserActivity r0, java.util.ArrayList r1, android.content.DialogInterface r2, int r3) {
            r0.lambda$showMinecraftVersionFilterDialog$8(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$lfFZRgA0Bc2Z166qNJtnBhIp0YI(ca.dnamobile.javalauncher.ContentBrowserActivity r0, androidx.appcompat.app.AlertDialog r1, ca.dnamobile.javalauncher.modmanager.ModrinthProject r2, java.util.LinkedHashMap r3, android.view.View r4) {
            r0.lambda$showModpackVersionsForMinecraftDialog$36(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void $r8$lambda$poaznlxxqV6xA8RkZfp9nAwLD1U(ca.dnamobile.javalauncher.ContentBrowserActivity r0) {
            r0.lambda$scheduleSearchFromTyping$10()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$ub0puYSHBgrhmF6-gjfAWCT82UA, reason: not valid java name */
    public static /* synthetic */ void m82$r8$lambda$ub0puYSHBgrhmF6gjfAWCT82UA(ca.dnamobile.javalauncher.ContentBrowserActivity r0, android.content.DialogInterface r1) {
            r0.lambda$confirmInstallModpackVersion$38(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$wCotyDrWuNkbSZkGQLscsgyf9sM(ca.dnamobile.javalauncher.ContentBrowserActivity r0, ca.dnamobile.javalauncher.modmanager.ModrinthProject r1, java.io.File r2, ca.dnamobile.javalauncher.modmanager.ModrinthInstallManager.Listener r3) {
            r0.lambda$installProject$25(r1, r2, r3)
            return
    }

    public static /* synthetic */ boolean $r8$lambda$zZYqV1rOp0v9YpzEJGW9YVHr7kY(ca.dnamobile.javalauncher.ContentBrowserActivity r0, android.view.View r1, android.view.MotionEvent r2) {
            boolean r0 = r0.lambda$configureSearchClearButton$9(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgetadapter, reason: not valid java name */
    static /* bridge */ /* synthetic */ ca.dnamobile.javalauncher.ContentBrowserActivity.ContentProjectAdapter m83$$Nest$fgetadapter(ca.dnamobile.javalauncher.ContentBrowserActivity r0) {
            ca.dnamobile.javalauncher.ContentBrowserActivity$ContentProjectAdapter r0 = r0.adapter
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgetgameVersionId, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m84$$Nest$fgetgameVersionId(ca.dnamobile.javalauncher.ContentBrowserActivity r0) {
            java.lang.String r0 = r0.gameVersionId
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgetloader, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m85$$Nest$fgetloader(ca.dnamobile.javalauncher.ContentBrowserActivity r0) {
            java.lang.String r0 = r0.loader
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgetselectedType, reason: not valid java name */
    static /* bridge */ /* synthetic */ ca.dnamobile.javalauncher.modmanager.ModManagerContentType m86$$Nest$fgetselectedType(ca.dnamobile.javalauncher.ContentBrowserActivity r0) {
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = r0.selectedType
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgettextResultSummary, reason: not valid java name */
    static /* bridge */ /* synthetic */ android.widget.TextView m87$$Nest$fgettextResultSummary(ca.dnamobile.javalauncher.ContentBrowserActivity r0) {
            android.widget.TextView r0 = r0.textResultSummary
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgetvisibleTabTypes, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.util.ArrayList m88$$Nest$fgetvisibleTabTypes(ca.dnamobile.javalauncher.ContentBrowserActivity r0) {
            java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModManagerContentType> r0 = r0.visibleTabTypes
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fputselectedType, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m89$$Nest$fputselectedType(ca.dnamobile.javalauncher.ContentBrowserActivity r0, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1) {
            r0.selectedType = r1
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mbindProjectIcon, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m90$$Nest$mbindProjectIcon(ca.dnamobile.javalauncher.ContentBrowserActivity r0, android.widget.ImageView r1, ca.dnamobile.javalauncher.modmanager.ModrinthProject r2, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r3) {
            r0.bindProjectIcon(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mbuildMinecraftVersionGroupSubtitle, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m91$$Nest$mbuildMinecraftVersionGroupSubtitle(ca.dnamobile.javalauncher.ContentBrowserActivity r0, ca.dnamobile.javalauncher.ContentBrowserActivity.ModpackMinecraftVersionGroup r1) {
            java.lang.String r0 = r0.buildMinecraftVersionGroupSubtitle(r1)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mbuildVersionFileLine, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m92$$Nest$mbuildVersionFileLine(ca.dnamobile.javalauncher.ContentBrowserActivity r0, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice r1) {
            java.lang.String r0 = r0.buildVersionFileLine(r1)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mbuildVersionMetaLine, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m93$$Nest$mbuildVersionMetaLine(ca.dnamobile.javalauncher.ContentBrowserActivity r0, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice r1) {
            java.lang.String r0 = r0.buildVersionMetaLine(r1)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mclearPendingSearch, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m94$$Nest$mclearPendingSearch(ca.dnamobile.javalauncher.ContentBrowserActivity r0) {
            r0.clearPendingSearch()
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mconfirmInstall, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m95$$Nest$mconfirmInstall(ca.dnamobile.javalauncher.ContentBrowserActivity r0, ca.dnamobile.javalauncher.modmanager.ModrinthProject r1) {
            r0.confirmInstall(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mdismissModpackInstallDialog, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m96$$Nest$mdismissModpackInstallDialog(ca.dnamobile.javalauncher.ContentBrowserActivity r0) {
            r0.dismissModpackInstallDialog()
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mdp, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m97$$Nest$mdp(ca.dnamobile.javalauncher.ContentBrowserActivity r0, int r1) {
            int r0 = r0.dp(r1)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mformatMinecraftVersionTitle, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m98$$Nest$mformatMinecraftVersionTitle(ca.dnamobile.javalauncher.ContentBrowserActivity r0, java.lang.String r1) {
            java.lang.String r0 = r0.formatMinecraftVersionTitle(r1)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mformatNumber, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m99$$Nest$mformatNumber(ca.dnamobile.javalauncher.ContentBrowserActivity r0, long r1) {
            java.lang.String r0 = r0.formatNumber(r1)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mformatTags, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m100$$Nest$mformatTags(ca.dnamobile.javalauncher.ContentBrowserActivity r0, java.util.List r1) {
            java.lang.String r0 = r0.formatTags(r1)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mgetInstalledSource, reason: not valid java name */
    static /* bridge */ /* synthetic */ ca.dnamobile.javalauncher.modmanager.ModManagerSource m101$$Nest$mgetInstalledSource(ca.dnamobile.javalauncher.ContentBrowserActivity r0, ca.dnamobile.javalauncher.modmanager.ModrinthProject r1) {
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = r0.getInstalledSource(r1)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$misGlobalBrowserMode, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m102$$Nest$misGlobalBrowserMode(ca.dnamobile.javalauncher.ContentBrowserActivity r0) {
            boolean r0 = r0.isGlobalBrowserMode()
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$misProjectInstalled, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m103$$Nest$misProjectInstalled(ca.dnamobile.javalauncher.ContentBrowserActivity r0, ca.dnamobile.javalauncher.modmanager.ModrinthProject r1) {
            boolean r0 = r0.isProjectInstalled(r1)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mloadContent, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m104$$Nest$mloadContent(ca.dnamobile.javalauncher.ContentBrowserActivity r0, boolean r1) {
            r0.loadContent(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mnormalizeSortForSelectedType, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m105$$Nest$mnormalizeSortForSelectedType(ca.dnamobile.javalauncher.ContentBrowserActivity r0) {
            r0.normalizeSortForSelectedType()
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mopenInstalledModpackInstance, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m106$$Nest$mopenInstalledModpackInstance(ca.dnamobile.javalauncher.ContentBrowserActivity r0, ca.dnamobile.javalauncher.instance.LauncherInstance r1) {
            r0.openInstalledModpackInstance(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mopenProjectDetails, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m107$$Nest$mopenProjectDetails(ca.dnamobile.javalauncher.ContentBrowserActivity r0, ca.dnamobile.javalauncher.modmanager.ModrinthProject r1) {
            r0.openProjectDetails(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mresolveProjectDisplayType, reason: not valid java name */
    static /* bridge */ /* synthetic */ ca.dnamobile.javalauncher.modmanager.ModManagerContentType m108$$Nest$mresolveProjectDisplayType(ca.dnamobile.javalauncher.ContentBrowserActivity r0, ca.dnamobile.javalauncher.modmanager.ModrinthProject r1, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2) {
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = r0.resolveProjectDisplayType(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mscheduleSearchFromTyping, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m109$$Nest$mscheduleSearchFromTyping(ca.dnamobile.javalauncher.ContentBrowserActivity r0) {
            r0.scheduleSearchFromTyping()
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mshowProjectMenu, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m110$$Nest$mshowProjectMenu(ca.dnamobile.javalauncher.ContentBrowserActivity r0, android.view.View r1, ca.dnamobile.javalauncher.modmanager.ModrinthProject r2) {
            r0.showProjectMenu(r1, r2)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mupdateModpackInstallDialog, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m111$$Nest$mupdateModpackInstallDialog(ca.dnamobile.javalauncher.ContentBrowserActivity r0, java.lang.String r1, int r2, int r3) {
            r0.updateModpackInstallDialog(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mupdateSearchClearButtonVisibility, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m112$$Nest$mupdateSearchClearButtonVisibility(ca.dnamobile.javalauncher.ContentBrowserActivity r0) {
            r0.updateSearchClearButtonVisibility()
            return
    }

    public ContentBrowserActivity() {
            r3 = this;
            r3.<init>()
            ca.dnamobile.javalauncher.ContentBrowserActivity$ContentProjectAdapter r0 = new ca.dnamobile.javalauncher.ContentBrowserActivity$ContentProjectAdapter
            r1 = 0
            r0.<init>(r3, r1)
            r3.adapter = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            r3.requestGeneration = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r0.<init>(r2)
            r3.searchHandler = r0
            r3.currentPage = r1
            r3.totalHits = r1
            ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSource r0 = ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSource.MODRINTH
            r3.selectedSource = r0
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODS
            r3.selectedType = r0
            ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort r0 = ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort.DOWNLOADS
            r3.selectedSort = r0
            java.lang.String r0 = ""
            r3.selectedModpackMinecraftVersionFilter = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.visibleTabTypes = r1
            r3.instanceId = r0
            r3.instanceName = r0
            r3.loader = r0
            r3.baseVersionId = r0
            r3.gameVersionId = r0
            r3.iconPath = r0
            r3.gameDirectoryPath = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r3.resolvedProjectIconUrls = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r3.resolvingProjectIconUrls = r0
            return
    }

    private void addFallbackVersion(java.util.ArrayList<java.lang.String> r2, java.lang.String r3) {
            r1 = this;
            if (r3 != 0) goto L5
            java.lang.String r3 = ""
            goto L9
        L5:
            java.lang.String r3 = r3.trim()
        L9:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L1f
            boolean r0 = r1.isSnapshotMinecraftVersion(r3)
            if (r0 != 0) goto L1f
            boolean r0 = r1.containsIgnoreCase(r2, r3)
            if (r0 == 0) goto L1c
            goto L1f
        L1c:
            r2.add(r3)
        L1f:
            return
    }

    private void addModpackVersionToGroup(java.util.LinkedHashMap<java.lang.String, java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice>> r3, java.lang.String r4, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice r5) {
            r2 = this;
            java.lang.Object r0 = r3.get(r4)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto L10
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.put(r4, r0)
        L10:
            java.lang.String r3 = r2.buildModpackVersionIdentity(r5)
            java.util.Iterator r4 = r0.iterator()
        L18:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r4.next()
            ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$ModpackVersionChoice r1 = (ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice) r1
            java.lang.String r1 = r2.buildModpackVersionIdentity(r1)
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L18
            return
        L2f:
            r0.add(r5)
            return
    }

    private void addParsedVersionNumberPart(java.util.ArrayList<java.lang.Integer> r1, java.lang.String r2) {
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

    private void applyClientSideSortIfNeeded(java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModrinthProject> r2, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r3, ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort r4) {
            r1 = this;
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODPACKS
            if (r3 != r0) goto L43
            int r3 = r2.size()
            r0 = 2
            if (r3 >= r0) goto Lc
            goto L43
        Lc:
            ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort r3 = ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort.NAME
            if (r4 != r3) goto L19
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda32 r3 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda32
            r3.<init>(r1)
            java.util.Collections.sort(r2, r3)
            goto L40
        L19:
            ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort r3 = ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort.UPDATED
            if (r4 == r3) goto L38
            ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort r3 = ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort.NEWEST
            if (r4 != r3) goto L22
            goto L38
        L22:
            ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort r3 = ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort.FOLLOWERS
            if (r4 != r3) goto L2f
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda35 r3 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda35
            r3.<init>()
            java.util.Collections.sort(r2, r3)
            goto L40
        L2f:
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda36 r3 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda36
            r3.<init>()
            java.util.Collections.sort(r2, r3)
            goto L40
        L38:
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda34 r3 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda34
            r3.<init>(r1)
            java.util.Collections.sort(r2, r3)
        L40:
            r1.pinOptiMobileFirst(r2)
        L43:
            return
    }

    private void bindProjectIcon(android.widget.ImageView r5, ca.dnamobile.javalauncher.modmanager.ModrinthProject r6, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r7) {
            r4 = this;
            java.lang.String r0 = r4.buildProjectIconCacheKey(r6)
            int r1 = r4.getFallbackIcon(r7)
            r5.setTag(r0)
            java.lang.String r2 = r4.getImmediateProjectImageUrl(r6)
            ca.dnamobile.javalauncher.modmanager.NetworkImageLoader.load(r5, r2, r1)
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r3 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.RESOURCEPACKS
            if (r7 == r3) goto L1d
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r3 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.SHADERPACKS
            if (r7 == r3) goto L1d
            if (r2 == 0) goto L1d
            return
        L1d:
            r4.resolveProjectIconUrlAsync(r5, r6, r0, r1)
            return
    }

    private void bindViews() {
            r2 = this;
            int r0 = ca.dnamobile.javalauncher.R.id.scrollContentBrowserRoot
            android.view.View r0 = r2.findViewById(r0)
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            r2.scrollRoot = r0
            int r0 = ca.dnamobile.javalauncher.R.id.imageContentBrowserInstanceIcon
            android.view.View r0 = r2.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.imageInstanceIcon = r0
            int r0 = ca.dnamobile.javalauncher.R.id.textContentBrowserInstanceName
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.textInstanceName = r0
            int r0 = ca.dnamobile.javalauncher.R.id.textContentBrowserInstanceMeta
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.textInstanceMeta = r0
            int r0 = ca.dnamobile.javalauncher.R.id.textContentBrowserTitle
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.textContentTitle = r0
            int r0 = ca.dnamobile.javalauncher.R.id.textContentBrowserVersionChip
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.textVersionChip = r0
            int r0 = ca.dnamobile.javalauncher.R.id.textContentBrowserLoaderChip
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.textLoaderChip = r0
            int r0 = ca.dnamobile.javalauncher.R.id.textContentBrowserResultSummary
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.textResultSummary = r0
            int r0 = ca.dnamobile.javalauncher.R.id.editContentSearch
            android.view.View r0 = r2.findViewById(r0)
            com.google.android.material.textfield.TextInputEditText r0 = (com.google.android.material.textfield.TextInputEditText) r0
            r2.editSearch = r0
            int r0 = ca.dnamobile.javalauncher.R.id.toggleContentSource
            android.view.View r0 = r2.findViewById(r0)
            com.google.android.material.button.MaterialButtonToggleGroup r0 = (com.google.android.material.button.MaterialButtonToggleGroup) r0
            r2.sourceToggleGroup = r0
            int r0 = ca.dnamobile.javalauncher.R.id.tabContentTypes
            android.view.View r0 = r2.findViewById(r0)
            com.google.android.material.tabs.TabLayout r0 = (com.google.android.material.tabs.TabLayout) r0
            r2.tabContentTypes = r0
            int r0 = ca.dnamobile.javalauncher.R.id.recyclerContentProjects
            android.view.View r0 = r2.findViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r2.recyclerContentProjects = r0
            int r0 = ca.dnamobile.javalauncher.R.id.buttonSortContent
            android.view.View r0 = r2.findViewById(r0)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            r2.buttonSortContent = r0
            int r0 = ca.dnamobile.javalauncher.R.id.buttonPagePrevious
            android.view.View r0 = r2.findViewById(r0)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            r2.buttonPagePrevious = r0
            int r0 = ca.dnamobile.javalauncher.R.id.buttonPageNext
            android.view.View r0 = r2.findViewById(r0)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            r2.buttonPageNext = r0
            int r0 = ca.dnamobile.javalauncher.R.id.textPageIndicator
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.textPageIndicator = r0
            int r0 = ca.dnamobile.javalauncher.R.id.buttonBackToInstance
            android.view.View r0 = r2.findViewById(r0)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda17 r1 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda17
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    private java.util.ArrayList<java.lang.String> buildFallbackReleaseMinecraftVersions() {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = r6.gameVersionId
            r6.addFallbackVersion(r0, r1)
            r1 = 69
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.String r3 = "1.21.10"
            r4 = 0
            r2[r4] = r3
            r3 = 1
            java.lang.String r5 = "1.21.9"
            r2[r3] = r5
            r3 = 2
            java.lang.String r5 = "1.21.8"
            r2[r3] = r5
            r3 = 3
            java.lang.String r5 = "1.21.7"
            r2[r3] = r5
            r3 = 4
            java.lang.String r5 = "1.21.6"
            r2[r3] = r5
            r3 = 5
            java.lang.String r5 = "1.21.5"
            r2[r3] = r5
            r3 = 6
            java.lang.String r5 = "1.21.4"
            r2[r3] = r5
            r3 = 7
            java.lang.String r5 = "1.21.3"
            r2[r3] = r5
            r3 = 8
            java.lang.String r5 = "1.21.2"
            r2[r3] = r5
            r3 = 9
            java.lang.String r5 = "1.21.1"
            r2[r3] = r5
            r3 = 10
            java.lang.String r5 = "1.21"
            r2[r3] = r5
            r3 = 11
            java.lang.String r5 = "1.20.6"
            r2[r3] = r5
            r3 = 12
            java.lang.String r5 = "1.20.5"
            r2[r3] = r5
            r3 = 13
            java.lang.String r5 = "1.20.4"
            r2[r3] = r5
            r3 = 14
            java.lang.String r5 = "1.20.3"
            r2[r3] = r5
            r3 = 15
            java.lang.String r5 = "1.20.2"
            r2[r3] = r5
            r3 = 16
            java.lang.String r5 = "1.20.1"
            r2[r3] = r5
            r3 = 17
            java.lang.String r5 = "1.20"
            r2[r3] = r5
            r3 = 18
            java.lang.String r5 = "1.19.4"
            r2[r3] = r5
            r3 = 19
            java.lang.String r5 = "1.19.3"
            r2[r3] = r5
            r3 = 20
            java.lang.String r5 = "1.19.2"
            r2[r3] = r5
            r3 = 21
            java.lang.String r5 = "1.19.1"
            r2[r3] = r5
            r3 = 22
            java.lang.String r5 = "1.19"
            r2[r3] = r5
            r3 = 23
            java.lang.String r5 = "1.18.2"
            r2[r3] = r5
            r3 = 24
            java.lang.String r5 = "1.18.1"
            r2[r3] = r5
            r3 = 25
            java.lang.String r5 = "1.18"
            r2[r3] = r5
            r3 = 26
            java.lang.String r5 = "1.17.1"
            r2[r3] = r5
            r3 = 27
            java.lang.String r5 = "1.17"
            r2[r3] = r5
            r3 = 28
            java.lang.String r5 = "1.16.5"
            r2[r3] = r5
            r3 = 29
            java.lang.String r5 = "1.16.4"
            r2[r3] = r5
            r3 = 30
            java.lang.String r5 = "1.16.3"
            r2[r3] = r5
            r3 = 31
            java.lang.String r5 = "1.16.2"
            r2[r3] = r5
            r3 = 32
            java.lang.String r5 = "1.16.1"
            r2[r3] = r5
            r3 = 33
            java.lang.String r5 = "1.16"
            r2[r3] = r5
            r3 = 34
            java.lang.String r5 = "1.15.2"
            r2[r3] = r5
            r3 = 35
            java.lang.String r5 = "1.15.1"
            r2[r3] = r5
            r3 = 36
            java.lang.String r5 = "1.15"
            r2[r3] = r5
            r3 = 37
            java.lang.String r5 = "1.14.4"
            r2[r3] = r5
            r3 = 38
            java.lang.String r5 = "1.14.3"
            r2[r3] = r5
            r3 = 39
            java.lang.String r5 = "1.14.2"
            r2[r3] = r5
            r3 = 40
            java.lang.String r5 = "1.14.1"
            r2[r3] = r5
            r3 = 41
            java.lang.String r5 = "1.14"
            r2[r3] = r5
            r3 = 42
            java.lang.String r5 = "1.13.2"
            r2[r3] = r5
            r3 = 43
            java.lang.String r5 = "1.13.1"
            r2[r3] = r5
            r3 = 44
            java.lang.String r5 = "1.13"
            r2[r3] = r5
            r3 = 45
            java.lang.String r5 = "1.12.2"
            r2[r3] = r5
            r3 = 46
            java.lang.String r5 = "1.12.1"
            r2[r3] = r5
            r3 = 47
            java.lang.String r5 = "1.12"
            r2[r3] = r5
            r3 = 48
            java.lang.String r5 = "1.11.2"
            r2[r3] = r5
            r3 = 49
            java.lang.String r5 = "1.11.1"
            r2[r3] = r5
            r3 = 50
            java.lang.String r5 = "1.11"
            r2[r3] = r5
            r3 = 51
            java.lang.String r5 = "1.10.2"
            r2[r3] = r5
            r3 = 52
            java.lang.String r5 = "1.10"
            r2[r3] = r5
            r3 = 53
            java.lang.String r5 = "1.9.4"
            r2[r3] = r5
            r3 = 54
            java.lang.String r5 = "1.9.2"
            r2[r3] = r5
            r3 = 55
            java.lang.String r5 = "1.9"
            r2[r3] = r5
            r3 = 56
            java.lang.String r5 = "1.8.9"
            r2[r3] = r5
            r3 = 57
            java.lang.String r5 = "1.8.8"
            r2[r3] = r5
            r3 = 58
            java.lang.String r5 = "1.8"
            r2[r3] = r5
            r3 = 59
            java.lang.String r5 = "1.7.10"
            r2[r3] = r5
            r3 = 60
            java.lang.String r5 = "1.7.2"
            r2[r3] = r5
            r3 = 61
            java.lang.String r5 = "1.6.4"
            r2[r3] = r5
            r3 = 62
            java.lang.String r5 = "1.6.2"
            r2[r3] = r5
            r3 = 63
            java.lang.String r5 = "1.5.2"
            r2[r3] = r5
            r3 = 64
            java.lang.String r5 = "1.4.7"
            r2[r3] = r5
            r3 = 65
            java.lang.String r5 = "1.3.2"
            r2[r3] = r5
            r3 = 66
            java.lang.String r5 = "1.2.5"
            r2[r3] = r5
            r3 = 67
            java.lang.String r5 = "1.1"
            r2[r3] = r5
            r3 = 68
            java.lang.String r5 = "1.0"
            r2[r3] = r5
        L1a4:
            if (r4 >= r1) goto L1ae
            r3 = r2[r4]
            r6.addFallbackVersion(r0, r3)
            int r4 = r4 + 1
            goto L1a4
        L1ae:
            return r0
    }

    private java.lang.String buildLoaderSummary(java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice> r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L9:
            boolean r1 = r6.hasNext()
            java.lang.String r2 = ""
            if (r1 == 0) goto L42
            java.lang.Object r1 = r6.next()
            ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$ModpackVersionChoice r1 = (ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice) r1
            java.util.ArrayList<java.lang.String> r1 = r1.loaders
            java.util.Iterator r1 = r1.iterator()
        L1d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L9
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L2d
            r3 = r2
            goto L31
        L2d:
            java.lang.String r3 = r3.trim()
        L31:
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L1d
            boolean r4 = r5.containsIgnoreCase(r0, r3)
            if (r4 == 0) goto L3e
            goto L1d
        L3e:
            r0.add(r3)
            goto L1d
        L42:
            boolean r6 = r0.isEmpty()
            if (r6 == 0) goto L49
            return r2
        L49:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "Loader "
            r6.<init>(r1)
            r1 = 3
            java.lang.String r0 = r5.joinShortList(r0, r1)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            return r6
    }

    private java.lang.String buildMinecraftVersionGroupSubtitle(ca.dnamobile.javalauncher.ContentBrowserActivity.ModpackMinecraftVersionGroup r5) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$ModpackVersionChoice> r1 = r5.versions
            int r1 = r1.size()
            java.lang.StringBuilder r1 = r0.append(r1)
            java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$ModpackVersionChoice> r2 = r5.versions
            int r2 = r2.size()
            r3 = 1
            if (r2 != r3) goto L1b
            java.lang.String r2 = " pack version"
            goto L1d
        L1b:
            java.lang.String r2 = " pack versions"
        L1d:
            r1.append(r2)
            java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$ModpackVersionChoice> r1 = r5.versions
            java.lang.String r1 = r4.buildLoaderSummary(r1)
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L35
            java.lang.String r2 = " · "
            java.lang.StringBuilder r2 = r0.append(r2)
            r2.append(r1)
        L35:
            java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$ModpackVersionChoice> r5 = r5.versions
            java.lang.String r5 = r4.getNewestPublishedDate(r5)
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L4a
            java.lang.String r1 = " · Newest "
            java.lang.StringBuilder r1 = r0.append(r1)
            r1.append(r5)
        L4a:
            java.lang.String r5 = r0.toString()
            return r5
    }

    private java.util.ArrayList<ca.dnamobile.javalauncher.ContentBrowserActivity.ModpackVersionDialogRow> buildModpackVersionDialogRows(java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice> r5) {
            r4 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L9:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r5.next()
            ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$ModpackVersionChoice r1 = (ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice) r1
            java.lang.String r2 = r4.getPrimaryGameVersion(r1)
            java.lang.Object r3 = r0.get(r2)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            if (r3 != 0) goto L29
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.put(r2, r3)
        L29:
            r3.add(r1)
            goto L9
        L2d:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L3a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L9d
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.String r2 = "Unknown Minecraft version"
            java.lang.Object r3 = r1.getKey()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L59
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            goto L6e
        L59:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Minecraft "
            r2.<init>(r3)
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
        L6e:
            java.lang.Object r3 = r1.getValue()
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r3 = r3.size()
            ca.dnamobile.javalauncher.ContentBrowserActivity$ModpackVersionDialogRow r2 = ca.dnamobile.javalauncher.ContentBrowserActivity.ModpackVersionDialogRow.header(r2, r3)
            r5.add(r2)
            java.lang.Object r1 = r1.getValue()
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r1 = r1.iterator()
        L89:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r1.next()
            ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$ModpackVersionChoice r2 = (ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice) r2
            ca.dnamobile.javalauncher.ContentBrowserActivity$ModpackVersionDialogRow r2 = ca.dnamobile.javalauncher.ContentBrowserActivity.ModpackVersionDialogRow.version(r2)
            r5.add(r2)
            goto L89
        L9d:
            return r5
    }

    private java.lang.String buildModpackVersionIdentity(ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice r4) {
            r3 = this;
            java.lang.String r0 = r4.versionId
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            java.lang.String r1 = ":"
            if (r0 != 0) goto L2c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r2 = r4.source
            java.lang.String r2 = r2.getId()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r4 = r4.versionId
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            return r4
        L2c:
            int r0 = r4.fileId
            if (r0 <= 0) goto L50
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r1 = r4.source
            java.lang.String r1 = r1.getId()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ":file:"
            java.lang.StringBuilder r0 = r0.append(r1)
            int r4 = r4.fileId
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            return r4
        L50:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r2 = r4.source
            java.lang.String r2 = r2.getId()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r2 = r4.fileName
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r4 = r4.downloadUrl
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            return r4
    }

    private java.lang.String buildProjectIconCacheKey(ca.dnamobile.javalauncher.modmanager.ModrinthProject r4) {
            r3 = this;
            java.lang.String r0 = r4.projectId
            java.lang.String r1 = ""
            if (r0 != 0) goto L8
            r0 = r1
            goto Le
        L8:
            java.lang.String r0 = r4.projectId
            java.lang.String r0 = r0.trim()
        Le:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L20
            java.lang.String r0 = r4.slug
            if (r0 != 0) goto L1a
            r0 = r1
            goto L20
        L1a:
            java.lang.String r0 = r4.slug
            java.lang.String r0 = r0.trim()
        L20:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L32
            java.lang.String r0 = r4.title
            if (r0 != 0) goto L2b
            goto L31
        L2b:
            java.lang.String r0 = r4.title
            java.lang.String r1 = r0.trim()
        L31:
            r0 = r1
        L32:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r4 = r4.source
            java.lang.String r4 = r4.getId()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = ":"
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            return r4
    }

    private java.lang.String buildVersionFileLine(ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice r3) {
            r2 = this;
            java.lang.String r0 = r3.fileName
            if (r0 != 0) goto L7
            java.lang.String r0 = ""
            goto Ld
        L7:
            java.lang.String r0 = r3.fileName
            java.lang.String r0 = r0.trim()
        Ld:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L14
            return r0
        L14:
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = r3.source
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r1 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.CURSEFORGE
            if (r0 != r1) goto L30
            int r0 = r3.fileId
            if (r0 <= 0) goto L30
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CurseForge file "
            r0.<init>(r1)
            int r3 = r3.fileId
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            return r3
        L30:
            java.lang.String r3 = r3.versionId
            return r3
    }

    private java.lang.String buildVersionMetaLine(ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice r6) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.ArrayList<java.lang.String> r1 = r6.gameVersions
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L1d
            java.lang.String r1 = "Minecraft "
            java.lang.StringBuilder r1 = r0.append(r1)
            java.util.ArrayList<java.lang.String> r2 = r6.gameVersions
            r3 = 3
            java.lang.String r2 = r5.joinShortList(r2, r3)
            r1.append(r2)
        L1d:
            java.util.ArrayList<java.lang.String> r1 = r6.loaders
            boolean r1 = r1.isEmpty()
            java.lang.String r2 = " · "
            if (r1 != 0) goto L40
            int r1 = r0.length()
            if (r1 <= 0) goto L30
            r0.append(r2)
        L30:
            java.lang.String r1 = "Loader "
            java.lang.StringBuilder r1 = r0.append(r1)
            java.util.ArrayList<java.lang.String> r3 = r6.loaders
            r4 = 2
            java.lang.String r3 = r5.joinShortList(r3, r4)
            r1.append(r3)
        L40:
            java.lang.String r1 = r6.datePublished
            java.lang.String r1 = r1.trim()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L6b
            int r1 = r0.length()
            if (r1 <= 0) goto L55
            r0.append(r2)
        L55:
            java.lang.String r1 = r6.datePublished
            java.lang.String r6 = r6.datePublished
            int r6 = r6.length()
            r2 = 10
            int r6 = java.lang.Math.min(r2, r6)
            r2 = 0
            java.lang.String r6 = r1.substring(r2, r6)
            r0.append(r6)
        L6b:
            int r6 = r0.length()
            if (r6 != 0) goto L74
            java.lang.String r6 = "No version metadata available"
            goto L78
        L74:
            java.lang.String r6 = r0.toString()
        L78:
            return r6
    }

    private boolean categoryContains(ca.dnamobile.javalauncher.modmanager.ModrinthProject r2, java.lang.String r3) {
            r1 = this;
            java.util.ArrayList<java.lang.String> r2 = r2.categories
            java.util.Iterator r2 = r2.iterator()
        L6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L6
            java.lang.String r0 = r0.trim()
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L6
            r2 = 1
            return r2
        L20:
            r2 = 0
            return r2
    }

    private void clearPendingSearch() {
            r2 = this;
            java.lang.Runnable r0 = r2.pendingSearchRunnable
            if (r0 == 0) goto Lc
            android.os.Handler r1 = r2.searchHandler
            r1.removeCallbacks(r0)
            r0 = 0
            r2.pendingSearchRunnable = r0
        Lc:
            return
    }

    private int compareMinecraftVersionKeysDescending(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.lang.String r0 = "Unknown Minecraft version"
            boolean r1 = r3.equalsIgnoreCase(r0)
            boolean r0 = r4.equalsIgnoreCase(r0)
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

    private int compareNullableIsoDatesDescending(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.lang.String r0 = ""
            if (r3 != 0) goto L6
            r3 = r0
            goto La
        L6:
            java.lang.String r3 = r3.trim()
        La:
            if (r4 != 0) goto Ld
            goto L11
        Ld:
            java.lang.String r0 = r4.trim()
        L11:
            boolean r4 = r3.isEmpty()
            boolean r1 = r0.isEmpty()
            if (r4 == 0) goto L1f
            if (r1 == 0) goto L1f
            r3 = 0
            return r3
        L1f:
            if (r4 == 0) goto L23
            r3 = 1
            return r3
        L23:
            if (r1 == 0) goto L27
            r3 = -1
            return r3
        L27:
            int r3 = r0.compareToIgnoreCase(r3)
            return r3
    }

    private int comparePrereleaseWeightDescending(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            int r1 = r0.getPrereleaseWeight(r1)
            int r2 = r0.getPrereleaseWeight(r2)
            int r1 = java.lang.Integer.compare(r2, r1)
            return r1
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
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r9 == 0) goto L1f
            if (r1 == 0) goto L1f
            return r2
        L1f:
            if (r9 == 0) goto L23
            r8 = 1
            return r8
        L23:
            if (r1 == 0) goto L27
            r8 = -1
            return r8
        L27:
            java.util.ArrayList r9 = r7.extractVersionNumberParts(r8)
            java.util.ArrayList r1 = r7.extractVersionNumberParts(r0)
            int r3 = r9.size()
            int r4 = r1.size()
            int r3 = java.lang.Math.max(r3, r4)
            r4 = r2
        L3c:
            if (r4 >= r3) goto L6c
            int r5 = r9.size()
            if (r4 >= r5) goto L4f
            java.lang.Object r5 = r9.get(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            goto L50
        L4f:
            r5 = r2
        L50:
            int r6 = r1.size()
            if (r4 >= r6) goto L61
            java.lang.Object r6 = r1.get(r4)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            goto L62
        L61:
            r6 = r2
        L62:
            if (r5 == r6) goto L69
            int r8 = java.lang.Integer.compare(r6, r5)
            return r8
        L69:
            int r4 = r4 + 1
            goto L3c
        L6c:
            int r9 = r7.comparePrereleaseWeightDescending(r8, r0)
            if (r9 == 0) goto L73
            return r9
        L73:
            int r8 = r0.compareToIgnoreCase(r8)
            return r8
    }

    private void configureSearchClearButton() {
            r3 = this;
            android.content.res.Resources r0 = r3.getResources()     // Catch: java.lang.Throwable -> L1c
            r1 = 17301560(0x1080038, float:2.4979412E-38)
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)     // Catch: java.lang.Throwable -> L1c
            r3.searchClearDrawable = r0     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1f
            r0 = 22
            int r0 = r3.dp(r0)     // Catch: java.lang.Throwable -> L1c
            android.graphics.drawable.Drawable r1 = r3.searchClearDrawable     // Catch: java.lang.Throwable -> L1c
            r2 = 0
            r1.setBounds(r2, r2, r0, r0)     // Catch: java.lang.Throwable -> L1c
            goto L1f
        L1c:
            r0 = 0
            r3.searchClearDrawable = r0
        L1f:
            com.google.android.material.textfield.TextInputEditText r0 = r3.editSearch
            r1 = 8
            int r1 = r3.dp(r1)
            r0.setCompoundDrawablePadding(r1)
            com.google.android.material.textfield.TextInputEditText r0 = r3.editSearch
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda9 r1 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda9
            r1.<init>(r3)
            r0.setOnTouchListener(r1)
            r3.updateSearchClearButtonVisibility()
            return
    }

    private void confirmInstall(ca.dnamobile.javalauncher.modmanager.ModrinthProject r9) {
            r8 = this;
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = r8.selectedType
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODPACKS
            if (r0 != r1) goto La
            r8.showModpackVersionPicker(r9)
            return
        La:
            java.lang.String r0 = r8.gameDirectoryPath
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L21
            int r9 = ca.dnamobile.javalauncher.R.string.content_browser_missing_game_dir
            r0 = 1
            android.widget.Toast r9 = android.widget.Toast.makeText(r8, r9, r0)
            r9.show()
            return
        L21:
            int r0 = ca.dnamobile.javalauncher.R.string.content_browser_install_message
            java.lang.String r1 = r9.title
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2 = r8.selectedType
            java.lang.String r2 = r8.getPluralLabel(r2)
            java.lang.String r3 = r8.gameVersionId
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L3a
            int r3 = ca.dnamobile.javalauncher.R.string.content_browser_unknown_version
            java.lang.String r3 = r8.getString(r3)
            goto L3c
        L3a:
            java.lang.String r3 = r8.gameVersionId
        L3c:
            java.lang.String r4 = r8.loader
            java.lang.String r4 = r8.displayLoader(r4)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3, r4}
            java.lang.String r4 = r8.getString(r0, r1)
            int r0 = ca.dnamobile.javalauncher.R.string.content_browser_install_title_value
            java.lang.String r1 = r9.title
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r3 = r8.getString(r0, r1)
            int r0 = ca.dnamobile.javalauncher.R.string.content_browser_install
            java.lang.String r5 = r8.getString(r0)
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda10 r6 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda10
            r6.<init>(r8, r9)
            r9 = 17039360(0x1040000, float:2.424457E-38)
            java.lang.String r7 = r8.getString(r9)
            r2 = r8
            androidx.appcompat.app.AlertDialog r9 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.showStyledMessageDialog(r2, r3, r4, r5, r6, r7)
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda12 r0 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda12
            r0.<init>(r8)
            r9.setOnDismissListener(r0)
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r8)
            return
    }

    private void confirmInstallModpackVersion(ca.dnamobile.javalauncher.modmanager.ModrinthProject r9, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice r10) {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Install "
            r0.<init>(r1)
            java.lang.String r1 = r9.title
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.String r2 = " as a new launcher instance?\n\nSelected version:\n"
            r1.append(r2)
            java.lang.String r1 = r10.getDisplayTitle()
            r0.append(r1)
            java.lang.String r1 = "\n"
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.String r2 = r10.getDisplaySubtitle()
            r1.append(r2)
            boolean r1 = r8.isGlobalBrowserMode()
            if (r1 != 0) goto L3b
            java.lang.String r1 = r8.gameVersionId
            java.lang.String r2 = r8.loader
            boolean r1 = r10.isCompatibleWith(r1, r2)
            if (r1 != 0) goto L3b
            java.lang.String r1 = "\n\nWarning: this version does not match the current instance filter. The installed modpack will still use the pack's own Minecraft version and loader."
            r0.append(r1)
        L3b:
            java.lang.String r4 = r0.toString()
            int r0 = ca.dnamobile.javalauncher.R.string.content_browser_install
            java.lang.String r5 = r8.getString(r0)
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda39 r6 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda39
            r6.<init>(r8, r9, r10)
            r9 = 17039360(0x1040000, float:2.424457E-38)
            java.lang.String r7 = r8.getString(r9)
            java.lang.String r3 = "Install Modpack"
            r2 = r8
            androidx.appcompat.app.AlertDialog r9 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.showStyledMessageDialog(r2, r3, r4, r5, r6, r7)
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda40 r10 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda40
            r10.<init>(r8)
            r9.setOnDismissListener(r10)
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r8)
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

    private void dismissMinecraftVersionLoadingDialog() {
            r1 = this;
            androidx.appcompat.app.AlertDialog r0 = r1.minecraftVersionLoadingDialog
            if (r0 == 0) goto La
            r0.dismiss()
            r0 = 0
            r1.minecraftVersionLoadingDialog = r0
        La:
            return
    }

    private void dismissModpackInstallDialog() {
            r1 = this;
            ca.dnamobile.javalauncher.ui.ModpackInstallProgressDialog r0 = r1.modpackInstallDialog
            if (r0 == 0) goto La
            r0.dismiss()
            r0 = 0
            r1.modpackInstallDialog = r0
        La:
            return
    }

    private void dismissModpackVersionLoadingDialog() {
            r1 = this;
            androidx.appcompat.app.AlertDialog r0 = r1.modpackVersionLoadingDialog
            if (r0 == 0) goto La
            r0.dismiss()
            r0 = 0
            r1.modpackVersionLoadingDialog = r0
        La:
            return
    }

    private java.lang.String displayLoader(java.lang.String r5) {
            r4 = this;
            if (r5 == 0) goto L33
            java.lang.String r0 = r5.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto L33
        Ld:
            java.lang.String r5 = r5.trim()
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
        L33:
            java.lang.String r5 = "Vanilla"
            return r5
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
            r6.addParsedVersionNumberPart(r0, r4)
            r1.setLength(r2)
        L30:
            int r3 = r3 + 1
            goto Lc
        L33:
            int r7 = r1.length()
            if (r7 <= 0) goto L40
            java.lang.String r7 = r1.toString()
            r6.addParsedVersionNumberPart(r0, r7)
        L40:
            return r0
    }

    private java.lang.String fetchCurseForgeProjectIconUrl(ca.dnamobile.javalauncher.modmanager.ModrinthProject r6) throws java.lang.Exception {
            r5 = this;
            java.lang.String r0 = r6.projectId
            java.lang.String r1 = ""
            if (r0 != 0) goto L8
            r6 = r1
            goto Le
        L8:
            java.lang.String r6 = r6.projectId
            java.lang.String r6 = r6.trim()
        Le:
            boolean r0 = r6.isEmpty()
            r2 = 0
            if (r0 == 0) goto L16
            return r2
        L16:
            java.lang.String r0 = ca.dnamobile.javalauncher.modmanager.CurseForgeApiKeyProvider.resolve()
            if (r0 == 0) goto L6e
            java.lang.String r3 = r0.trim()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L27
            goto L6e
        L27:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "https://api.curseforge.com/v1/mods/"
            r3.<init>(r4)
            java.lang.StringBuilder r6 = r3.append(r6)
            java.lang.String r6 = r6.toString()
            java.lang.String r0 = r0.trim()
            java.lang.String r6 = r5.httpGet(r6, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r6)
            java.lang.String r6 = "data"
            org.json.JSONObject r6 = r0.optJSONObject(r6)
            if (r6 != 0) goto L4c
            return r2
        L4c:
            java.lang.String r0 = "logo"
            org.json.JSONObject r6 = r6.optJSONObject(r0)
            if (r6 == 0) goto L6e
            java.lang.String r0 = "thumbnailUrl"
            java.lang.String r0 = r6.optString(r0, r1)
            java.lang.String r0 = r5.normalizeImageUrl(r0)
            if (r0 == 0) goto L61
            return r0
        L61:
            java.lang.String r0 = "url"
            java.lang.String r6 = r6.optString(r0, r1)
            java.lang.String r6 = r5.normalizeImageUrl(r6)
            if (r6 == 0) goto L6e
            return r6
        L6e:
            return r2
    }

    private java.lang.String fetchModrinthProjectIconUrl(ca.dnamobile.javalauncher.modmanager.ModrinthProject r7) throws java.lang.Exception {
            r6 = this;
            java.lang.String r0 = r7.projectId
            java.lang.String r1 = ""
            if (r0 != 0) goto L8
            r0 = r1
            goto Le
        L8:
            java.lang.String r0 = r7.projectId
            java.lang.String r0 = r0.trim()
        Le:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L21
            java.lang.String r0 = r7.slug
            if (r0 != 0) goto L1a
            r0 = r1
            goto L21
        L1a:
            java.lang.String r7 = r7.slug
            java.lang.String r7 = r7.trim()
            r0 = r7
        L21:
            boolean r7 = r0.isEmpty()
            r2 = 0
            if (r7 == 0) goto L29
            return r2
        L29:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r3 = "https://api.modrinth.com/v2/project/"
            r7.<init>(r3)
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.String r7 = r6.httpGet(r7, r2)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r7)
            java.lang.String r7 = "icon_url"
            java.lang.String r7 = r0.optString(r7, r1)
            java.lang.String r7 = r6.normalizeImageUrl(r7)
            if (r7 == 0) goto L4e
            return r7
        L4e:
            java.lang.String r7 = "gallery"
            org.json.JSONArray r7 = r0.optJSONArray(r7)
            if (r7 == 0) goto L7a
            r0 = 0
        L57:
            int r3 = r7.length()
            if (r0 >= r3) goto L7a
            org.json.JSONObject r3 = r7.optJSONObject(r0)
            if (r3 != 0) goto L64
            goto L77
        L64:
            java.lang.String r4 = "url"
            java.lang.String r4 = r3.optString(r4, r1)
            java.lang.String r5 = "raw_url"
            java.lang.String r3 = r3.optString(r5, r4)
            java.lang.String r3 = r6.normalizeImageUrl(r3)
            if (r3 == 0) goto L77
            return r3
        L77:
            int r0 = r0 + 1
            goto L57
        L7a:
            return r2
    }

    private java.lang.String fetchProjectIconUrl(ca.dnamobile.javalauncher.modmanager.ModrinthProject r3) throws java.lang.Exception {
            r2 = this;
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = r3.source
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r1 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.CURSEFORGE
            if (r0 != r1) goto Lb
            java.lang.String r3 = r2.fetchCurseForgeProjectIconUrl(r3)
            return r3
        Lb:
            java.lang.String r3 = r2.fetchModrinthProjectIconUrl(r3)
            return r3
    }

    private java.util.ArrayList<java.lang.String> fetchReleaseMinecraftVersions() throws java.lang.Exception {
            r7 = this;
            java.lang.String r0 = "https://launchermeta.mojang.com/mc/game/version_manifest_v2.json"
            r1 = 0
            java.lang.String r0 = r7.httpGet(r0, r1)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r0)
            java.lang.String r0 = "versions"
            org.json.JSONArray r0 = r1.optJSONArray(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
        L18:
            if (r0 == 0) goto L5f
            int r3 = r0.length()
            if (r2 >= r3) goto L5f
            org.json.JSONObject r3 = r0.optJSONObject(r2)
            if (r3 != 0) goto L27
            goto L5c
        L27:
            java.lang.String r4 = "type"
            java.lang.String r5 = ""
            java.lang.String r4 = r3.optString(r4, r5)
            java.lang.String r4 = r4.trim()
            java.lang.String r6 = "id"
            java.lang.String r3 = r3.optString(r6, r5)
            java.lang.String r3 = r3.trim()
            java.lang.String r5 = "release"
            boolean r4 = r5.equalsIgnoreCase(r4)
            if (r4 != 0) goto L46
            goto L5c
        L46:
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L5c
            boolean r4 = r7.isSnapshotMinecraftVersion(r3)
            if (r4 != 0) goto L5c
            boolean r4 = r7.containsIgnoreCase(r1, r3)
            if (r4 == 0) goto L59
            goto L5c
        L59:
            r1.add(r3)
        L5c:
            int r2 = r2 + 1
            goto L18
        L5f:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L6c
            java.util.ArrayList r0 = r7.buildFallbackReleaseMinecraftVersions()
            r1.addAll(r0)
        L6c:
            return r1
    }

    private void forceScrollTop() {
            r4 = this;
            androidx.core.widget.NestedScrollView r0 = r4.scrollRoot
            if (r0 != 0) goto L5
            return
        L5:
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda41 r1 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda41
            r1.<init>(r4)
            r0.post(r1)
            androidx.core.widget.NestedScrollView r0 = r4.scrollRoot
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda42 r1 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda42
            r1.<init>(r4)
            r2 = 120(0x78, double:5.93E-322)
            r0.postDelayed(r1, r2)
            return
    }

    private java.lang.String formatMinecraftVersionTitle(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "Unknown Minecraft version"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L9
            return r3
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Minecraft "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            return r3
    }

    private java.lang.String formatNumber(long r4) {
            r3 = this;
            r0 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L1f
            java.util.Locale r0 = java.util.Locale.US
            double r4 = (double) r4
            r1 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r4 = r4 / r1
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r5 = "%.1fB"
            java.lang.String r4 = java.lang.String.format(r0, r5, r4)
            return r4
        L1f:
            r0 = 1000000(0xf4240, double:4.940656E-318)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L3e
            java.util.Locale r0 = java.util.Locale.US
            double r4 = (double) r4
            r1 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r4 = r4 / r1
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r5 = "%.1fM"
            java.lang.String r4 = java.lang.String.format(r0, r5, r4)
            return r4
        L3e:
            r0 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L5c
            java.util.Locale r0 = java.util.Locale.US
            double r4 = (double) r4
            r1 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r4 = r4 / r1
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r5 = "%.1fK"
            java.lang.String r4 = java.lang.String.format(r0, r5, r4)
            return r4
        L5c:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            return r4
    }

    private java.lang.String formatTag(java.lang.String r5) {
            r4 = this;
            r0 = 45
            r1 = 32
            java.lang.String r0 = r5.replace(r0, r1)
            r2 = 95
            java.lang.String r0 = r0.replace(r2, r1)
            java.lang.String r0 = r0.trim()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L19
            return r5
        L19:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r1 = 0
            r2 = 1
            java.lang.String r1 = r0.substring(r1, r2)
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r1 = r1.toUpperCase(r3)
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.String r0 = r0.substring(r2)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            return r5
    }

    private java.lang.String formatTags(java.util.List<java.lang.String> r5) {
            r4 = this;
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto Ld
            int r5 = ca.dnamobile.javalauncher.R.string.content_browser_tag_unknown
            java.lang.String r5 = r4.getString(r5)
            return r5
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 2
            int r2 = r5.size()
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
        L1c:
            if (r2 >= r1) goto L39
            int r3 = r0.length()
            if (r3 <= 0) goto L29
            java.lang.String r3 = "  "
            r0.append(r3)
        L29:
            java.lang.Object r3 = r5.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = r4.formatTag(r3)
            r0.append(r3)
            int r2 = r2 + 1
            goto L1c
        L39:
            int r2 = r5.size()
            if (r2 <= r1) goto L4d
            java.lang.String r2 = "  +"
            java.lang.StringBuilder r2 = r0.append(r2)
            int r5 = r5.size()
            int r5 = r5 - r1
            r2.append(r5)
        L4d:
            java.lang.String r5 = r0.toString()
            return r5
    }

    private java.lang.String getEffectiveModpackGameVersionFilter(ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort r2) {
            r1 = this;
            ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort r0 = ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort.VERSIONS
            if (r2 != r0) goto Lb
            java.lang.String r2 = r1.selectedModpackMinecraftVersionFilter
            java.lang.String r2 = r2.trim()
            return r2
        Lb:
            java.lang.String r2 = r1.gameVersionId
            if (r2 != 0) goto L12
            java.lang.String r2 = ""
            goto L16
        L12:
            java.lang.String r2 = r2.trim()
        L16:
            return r2
    }

    private int getFallbackIcon(ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2) {
            r1 = this;
            int[] r0 = ca.dnamobile.javalauncher.ContentBrowserActivity.AnonymousClass5.$SwitchMap$ca$dnamobile$javalauncher$modmanager$ModManagerContentType
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L1a
            r0 = 2
            if (r2 == r0) goto L17
            r0 = 3
            if (r2 == r0) goto L14
            int r2 = ca.dnamobile.javalauncher.R.drawable.ic_content_mod_24
            return r2
        L14:
            int r2 = ca.dnamobile.javalauncher.R.drawable.ic_content_shaderpack_24
            return r2
        L17:
            int r2 = ca.dnamobile.javalauncher.R.drawable.ic_content_resourcepack_24
            return r2
        L1a:
            int r2 = ca.dnamobile.javalauncher.R.drawable.ic_content_mod_24
            return r2
    }

    private java.lang.String getImmediateProjectImageUrl(ca.dnamobile.javalauncher.modmanager.ModrinthProject r3) {
            r2 = this;
            java.lang.String r0 = r2.buildProjectIconCacheKey(r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.resolvedProjectIconUrls
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r2.normalizeImageUrl(r0)
            if (r0 == 0) goto L13
            return r0
        L13:
            java.lang.String r0 = r3.iconUrl
            java.lang.String r0 = r2.normalizeImageUrl(r0)
            if (r0 == 0) goto L1c
            return r0
        L1c:
            java.util.ArrayList<java.lang.String> r3 = r3.galleryUrls
            java.util.Iterator r3 = r3.iterator()
        L22:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r2.normalizeImageUrl(r0)
            if (r0 == 0) goto L22
            return r0
        L35:
            r3 = 0
            return r3
    }

    private ca.dnamobile.javalauncher.modmanager.ModManagerSource getInstalledSource(ca.dnamobile.javalauncher.modmanager.ModrinthProject r4) {
            r3 = this;
            java.lang.String r0 = r3.gameDirectoryPath
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L34
            java.lang.String r0 = r4.projectId
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L19
            goto L34
        L19:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r3.gameDirectoryPath
            r0.<init>(r1)
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = r3.selectedType
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r2 = r4.source
            java.lang.String r4 = r4.projectId
            org.json.JSONObject r4 = ca.dnamobile.javalauncher.modmanager.ModManagerManifest.getInstalledEntryForProject(r0, r1, r2, r4)
            if (r4 != 0) goto L2f
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r4 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.UNKNOWN
            goto L33
        L2f:
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r4 = ca.dnamobile.javalauncher.modmanager.ModManagerManifest.getSource(r4)
        L33:
            return r4
        L34:
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r4 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.UNKNOWN
            return r4
    }

    private java.lang.String getNewestPublishedDate(java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice> r5) {
            r4 = this;
            java.util.Iterator r5 = r5.iterator()
            java.lang.String r0 = ""
            r1 = r0
        L7:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r5.next()
            ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$ModpackVersionChoice r2 = (ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice) r2
            java.lang.String r3 = r2.datePublished
            if (r3 != 0) goto L19
            r2 = r0
            goto L1f
        L19:
            java.lang.String r2 = r2.datePublished
            java.lang.String r2 = r2.trim()
        L1f:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L26
            goto L7
        L26:
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L32
            int r3 = r2.compareToIgnoreCase(r1)
            if (r3 <= 0) goto L7
        L32:
            r1 = r2
            goto L7
        L34:
            boolean r5 = r1.isEmpty()
            if (r5 == 0) goto L3b
            return r0
        L3b:
            r5 = 10
            int r0 = r1.length()
            int r5 = java.lang.Math.min(r5, r0)
            r0 = 0
            java.lang.String r5 = r1.substring(r0, r5)
            return r5
    }

    private java.lang.String getPluralLabel(ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2) {
            r1 = this;
            int[] r0 = ca.dnamobile.javalauncher.ContentBrowserActivity.AnonymousClass5.$SwitchMap$ca$dnamobile$javalauncher$modmanager$ModManagerContentType
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L26
            r0 = 2
            if (r2 == r0) goto L1f
            r0 = 3
            if (r2 == r0) goto L18
            int r2 = ca.dnamobile.javalauncher.R.string.content_browser_mods_plural
            java.lang.String r2 = r1.getString(r2)
            return r2
        L18:
            int r2 = ca.dnamobile.javalauncher.R.string.content_browser_shaders_plural
            java.lang.String r2 = r1.getString(r2)
            return r2
        L1f:
            int r2 = ca.dnamobile.javalauncher.R.string.content_browser_resourcepacks_plural
            java.lang.String r2 = r1.getString(r2)
            return r2
        L26:
            java.lang.String r2 = "modpacks"
            return r2
    }

    private int getPrereleaseWeight(java.lang.String r2) {
            r1 = this;
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r0)
            java.lang.String r0 = "snapshot"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L10
            r2 = 0
            return r2
        L10:
            java.lang.String r0 = "alpha"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L1a
            r2 = 1
            return r2
        L1a:
            java.lang.String r0 = "beta"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L24
            r2 = 2
            return r2
        L24:
            java.lang.String r0 = "rc"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L37
            java.lang.String r0 = "release-candidate"
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L35
            goto L37
        L35:
            r2 = 4
            return r2
        L37:
            r2 = 3
            return r2
    }

    private java.lang.String getPrimaryGameVersion(ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice r2) {
            r1 = this;
            java.util.ArrayList<java.lang.String> r0 = r2.gameVersions
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L12
            java.util.ArrayList<java.lang.String> r2 = r2.gameVersions
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            return r2
        L12:
            java.lang.String r2 = "Unknown Minecraft version"
            return r2
    }

    private java.lang.String getSearchHint(ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2) {
            r1 = this;
            int[] r0 = ca.dnamobile.javalauncher.ContentBrowserActivity.AnonymousClass5.$SwitchMap$ca$dnamobile$javalauncher$modmanager$ModManagerContentType
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L26
            r0 = 2
            if (r2 == r0) goto L1f
            r0 = 3
            if (r2 == r0) goto L18
            int r2 = ca.dnamobile.javalauncher.R.string.content_browser_search_mods
            java.lang.String r2 = r1.getString(r2)
            return r2
        L18:
            int r2 = ca.dnamobile.javalauncher.R.string.content_browser_search_shaders
            java.lang.String r2 = r1.getString(r2)
            return r2
        L1f:
            int r2 = ca.dnamobile.javalauncher.R.string.content_browser_search_resourcepacks
            java.lang.String r2 = r1.getString(r2)
            return r2
        L26:
            java.lang.String r2 = "Search modpacks"
            return r2
    }

    private java.lang.String getSelectedSourceLabel() {
            r2 = this;
            ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSource r0 = r2.selectedSource
            ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSource r1 = ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSource.CURSEFORGE
            if (r0 != r1) goto L9
            int r0 = ca.dnamobile.javalauncher.R.string.content_browser_source_curseforge
            goto Lb
        L9:
            int r0 = ca.dnamobile.javalauncher.R.string.content_browser_source_modrinth
        Lb:
            java.lang.String r0 = r2.getString(r0)
            return r0
    }

    private java.lang.String getTabTitle(ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2) {
            r1 = this;
            int[] r0 = ca.dnamobile.javalauncher.ContentBrowserActivity.AnonymousClass5.$SwitchMap$ca$dnamobile$javalauncher$modmanager$ModManagerContentType
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L26
            r0 = 2
            if (r2 == r0) goto L1f
            r0 = 3
            if (r2 == r0) goto L18
            int r2 = ca.dnamobile.javalauncher.R.string.content_browser_tab_mods
            java.lang.String r2 = r1.getString(r2)
            return r2
        L18:
            int r2 = ca.dnamobile.javalauncher.R.string.content_browser_tab_shaders
            java.lang.String r2 = r1.getString(r2)
            return r2
        L1f:
            int r2 = ca.dnamobile.javalauncher.R.string.content_browser_tab_resourcepacks
            java.lang.String r2 = r1.getString(r2)
            return r2
        L26:
            java.lang.String r2 = "Modpacks"
            return r2
    }

    private int getTotalPages(int r5) {
            r4 = this;
            if (r5 > 0) goto L4
            r5 = 1
            return r5
        L4:
            double r0 = (double) r5
            r2 = 4626322717216342016(0x4034000000000000, double:20.0)
            double r0 = r0 / r2
            double r0 = java.lang.Math.ceil(r0)
            int r5 = (int) r0
            return r5
    }

    private java.util.LinkedHashMap<java.lang.String, java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice>> groupModpackVersionsByMinecraftVersion(java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice> r7) {
            r6 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L9:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L42
            java.lang.Object r1 = r7.next()
            ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$ModpackVersionChoice r1 = (ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice) r1
            java.util.ArrayList<java.lang.String> r2 = r1.gameVersions
            boolean r3 = r2.isEmpty()
            java.lang.String r4 = "Unknown Minecraft version"
            if (r3 == 0) goto L23
            r6.addModpackVersionToGroup(r0, r4, r1)
            goto L9
        L23:
            java.util.Iterator r2 = r2.iterator()
        L27:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L9
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = r6.normalizeMinecraftVersionKey(r3)
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L3e
            r3 = r4
        L3e:
            r6.addModpackVersionToGroup(r0, r3, r1)
            goto L27
        L42:
            java.util.ArrayList r7 = new java.util.ArrayList
            java.util.Set r1 = r0.keySet()
            r7.<init>(r1)
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda15 r1 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda15
            r1.<init>(r6)
            java.util.Collections.sort(r7, r1)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Iterator r7 = r7.iterator()
        L5c:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L7e
            java.lang.Object r2 = r7.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r0.get(r2)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            if (r3 == 0) goto L5c
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L77
            goto L5c
        L77:
            r6.sortModpackVersionsNewestFirst(r3)
            r1.put(r2, r3)
            goto L5c
        L7e:
            return r1
    }

    private boolean hasSearchText() {
            r1 = this;
            com.google.android.material.textfield.TextInputEditText r0 = r1.editSearch
            if (r0 == 0) goto L20
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L20
            com.google.android.material.textfield.TextInputEditText r0 = r1.editSearch
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            int r0 = r0.length()
            if (r0 <= 0) goto L20
            r0 = 1
            goto L21
        L20:
            r0 = 0
        L21:
            return r0
    }

    private void hideSearchKeyboardAndClearFocus() {
            r3 = this;
            com.google.android.material.textfield.TextInputEditText r0 = r3.editSearch
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r0 = "input_method"
            java.lang.Object r0 = r3.getSystemService(r0)     // Catch: java.lang.Throwable -> L19
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L19
            com.google.android.material.textfield.TextInputEditText r1 = r3.editSearch     // Catch: java.lang.Throwable -> L19
            android.os.IBinder r1 = r1.getWindowToken()     // Catch: java.lang.Throwable -> L19
            r2 = 0
            r0.hideSoftInputFromWindow(r1, r2)     // Catch: java.lang.Throwable -> L19
        L19:
            com.google.android.material.textfield.TextInputEditText r0 = r3.editSearch
            r0.clearFocus()
            return
    }

    private java.lang.String httpGet(java.lang.String r9, java.lang.String r10) throws java.lang.Exception {
            r8 = this;
            java.net.URL r0 = new java.net.URL
            r0.<init>(r9)
            java.net.URLConnection r9 = r0.openConnection()
            java.net.HttpURLConnection r9 = (java.net.HttpURLConnection) r9
            r0 = 15000(0x3a98, float:2.102E-41)
            r9.setConnectTimeout(r0)
            r0 = 20000(0x4e20, float:2.8026E-41)
            r9.setReadTimeout(r0)
            java.lang.String r0 = "Accept"
            java.lang.String r1 = "application/json"
            r9.setRequestProperty(r0, r1)
            java.lang.String r0 = "User-Agent"
            java.lang.String r1 = "JavaLauncher/1.0"
            r9.setRequestProperty(r0, r1)
            if (r10 == 0) goto L38
            java.lang.String r0 = r10.trim()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L38
            java.lang.String r0 = "x-api-key"
            java.lang.String r10 = r10.trim()
            r9.setRequestProperty(r0, r10)
        L38:
            int r10 = r9.getResponseCode()
            r0 = 300(0x12c, float:4.2E-43)
            r1 = 200(0xc8, float:2.8E-43)
            if (r10 < r1) goto L49
            if (r10 >= r0) goto L49
            java.io.InputStream r2 = r9.getInputStream()
            goto L4d
        L49:
            java.io.InputStream r2 = r9.getErrorStream()
        L4d:
            java.lang.String r3 = "HTTP "
            if (r2 == 0) goto Lb8
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> La7
            r4.<init>()     // Catch: java.lang.Throwable -> La7
            r5 = 16384(0x4000, float:2.2959E-41)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L9d
        L5a:
            int r6 = r2.read(r5)     // Catch: java.lang.Throwable -> L9d
            r7 = -1
            if (r6 == r7) goto L66
            r7 = 0
            r4.write(r5, r7, r6)     // Catch: java.lang.Throwable -> L9d
            goto L5a
        L66:
            java.lang.String r5 = "UTF-8"
            java.lang.String r5 = r4.toString(r5)     // Catch: java.lang.Throwable -> L9d
            if (r10 < r1) goto L7c
            if (r10 >= r0) goto L7c
            r4.close()     // Catch: java.lang.Throwable -> La7
            if (r2 == 0) goto L78
            r2.close()     // Catch: java.lang.Throwable -> Lb3
        L78:
            r9.disconnect()
            return r5
        L7c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L9d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9d
            r1.<init>()     // Catch: java.lang.Throwable -> L9d
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> L9d
            java.lang.StringBuilder r10 = r1.append(r10)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r1 = ": "
            java.lang.StringBuilder r10 = r10.append(r1)     // Catch: java.lang.Throwable -> L9d
            java.lang.StringBuilder r10 = r10.append(r5)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L9d
            r0.<init>(r10)     // Catch: java.lang.Throwable -> L9d
            throw r0     // Catch: java.lang.Throwable -> L9d
        L9d:
            r10 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> La2
            goto La6
        La2:
            r0 = move-exception
            r10.addSuppressed(r0)     // Catch: java.lang.Throwable -> La7
        La6:
            throw r10     // Catch: java.lang.Throwable -> La7
        La7:
            r10 = move-exception
            if (r2 == 0) goto Lb2
            r2.close()     // Catch: java.lang.Throwable -> Lae
            goto Lb2
        Lae:
            r0 = move-exception
            r10.addSuppressed(r0)     // Catch: java.lang.Throwable -> Lb3
        Lb2:
            throw r10     // Catch: java.lang.Throwable -> Lb3
        Lb3:
            r10 = move-exception
            r9.disconnect()
            throw r10
        Lb8:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            java.lang.StringBuilder r10 = r0.append(r10)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
    }

    private void installModpackProject(ca.dnamobile.javalauncher.modmanager.ModrinthProject r4, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice r5) {
            r3 = this;
            java.lang.String r0 = r4.title
            r3.showModpackInstallDialog(r0)
            ca.dnamobile.javalauncher.ContentBrowserActivity$4 r0 = new ca.dnamobile.javalauncher.ContentBrowserActivity$4
            r0.<init>(r3)
            java.lang.Thread r1 = new java.lang.Thread
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda0 r2 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda0
            r2.<init>(r3, r5, r4, r0)
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r4 = r4.source
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r5 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.CURSEFORGE
            if (r4 != r5) goto L1a
            java.lang.String r4 = "CurseForgeModpackInstall"
            goto L1c
        L1a:
            java.lang.String r4 = "ModrinthModpackInstall"
        L1c:
            r1.<init>(r2, r4)
            r1.start()
            return
    }

    private void installProject(ca.dnamobile.javalauncher.modmanager.ModrinthProject r5) {
            r4 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r4.gameDirectoryPath
            r0.<init>(r1)
            int r1 = ca.dnamobile.javalauncher.R.string.content_browser_install_started
            java.lang.String r2 = r5.title
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = r4.getString(r1, r2)
            r2 = 0
            android.widget.Toast r1 = android.widget.Toast.makeText(r4, r1, r2)
            r1.show()
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = r4.selectedType
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODPACKS
            if (r1 != r2) goto L25
            r4.showModpackVersionPicker(r5)
            return
        L25:
            ca.dnamobile.javalauncher.ContentBrowserActivity$3 r1 = new ca.dnamobile.javalauncher.ContentBrowserActivity$3
            r1.<init>(r4)
            java.lang.Thread r2 = new java.lang.Thread
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda16 r3 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda16
            r3.<init>(r4, r5, r0, r1)
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r5 = r5.source
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.CURSEFORGE
            if (r5 != r0) goto L3a
            java.lang.String r5 = "CurseForgeInstall"
            goto L3c
        L3a:
            java.lang.String r5 = "ModrinthInstall"
        L3c:
            r2.<init>(r3, r5)
            r2.start()
            return
    }

    private boolean isBrowseModpacksOnlyMode() {
            r2 = this;
            java.lang.String r0 = r2.gameDirectoryPath
            if (r0 == 0) goto Le
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L24
        Le:
            java.lang.String r0 = r2.instanceId
            if (r0 == 0) goto L1c
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L24
        L1c:
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = r2.selectedType
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODPACKS
            if (r0 != r1) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            return r0
    }

    private boolean isGlobalBrowserMode() {
            r1 = this;
            java.lang.String r0 = r1.gameDirectoryPath
            if (r0 == 0) goto L11
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            goto L12
        L11:
            r0 = 1
        L12:
            return r0
    }

    private boolean isOptiMobileModpack(ca.dnamobile.javalauncher.modmanager.ModrinthProject r5) {
            r4 = this;
            java.lang.String r0 = r5.title
            java.lang.String r1 = ""
            if (r0 != 0) goto L8
            r0 = r1
            goto L14
        L8:
            java.lang.String r0 = r5.title
            java.lang.String r0 = r0.trim()
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r2)
        L14:
            java.lang.String r2 = r5.slug
            if (r2 != 0) goto L1a
            r2 = r1
            goto L26
        L1a:
            java.lang.String r2 = r5.slug
            java.lang.String r2 = r2.trim()
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r3)
        L26:
            java.lang.String r3 = r5.projectId
            if (r3 != 0) goto L2b
            goto L37
        L2b:
            java.lang.String r5 = r5.projectId
            java.lang.String r5 = r5.trim()
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r1 = r5.toLowerCase(r1)
        L37:
            java.lang.String r5 = "optimobile"
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L4e
            boolean r0 = r2.contains(r5)
            if (r0 != 0) goto L4e
            boolean r5 = r1.contains(r5)
            if (r5 == 0) goto L4c
            goto L4e
        L4c:
            r5 = 0
            goto L4f
        L4e:
            r5 = 1
        L4f:
            return r5
    }

    private boolean isProjectInstalled(ca.dnamobile.javalauncher.modmanager.ModrinthProject r4) {
            r3 = this;
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = r3.selectedType
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODPACKS
            r2 = 0
            if (r0 != r1) goto L8
            return r2
        L8:
            java.lang.String r0 = r3.gameDirectoryPath
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L37
            java.lang.String r0 = r4.projectId
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L21
            goto L37
        L21:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r3.gameDirectoryPath
            r0.<init>(r1)
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = r3.selectedType
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r2 = r4.source
            java.lang.String r2 = r2.getId()
            java.lang.String r4 = r4.projectId
            boolean r4 = ca.dnamobile.javalauncher.modmanager.ModManagerManifest.isProjectInstalled(r0, r1, r2, r4)
            return r4
        L37:
            return r2
    }

    private boolean isSnapshotMinecraftVersion(java.lang.String r3) {
            r2 = this;
            java.lang.String r3 = r3.trim()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = r3.toLowerCase(r0)
            boolean r0 = r3.isEmpty()
            r1 = 1
            if (r0 == 0) goto L12
            return r1
        L12:
            java.lang.String r0 = "snapshot"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L4e
            java.lang.String r0 = "pre"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L4e
            java.lang.String r0 = "rc"
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L2b
            goto L4e
        L2b:
            java.lang.String r0 = "\\d{2}w\\d{2}[a-z]"
            boolean r0 = r3.matches(r0)
            if (r0 == 0) goto L34
            return r1
        L34:
            java.lang.String r0 = "combat"
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L4e
            java.lang.String r0 = "pending"
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L4e
            java.lang.String r0 = "experimental"
            boolean r3 = r3.startsWith(r0)
            if (r3 == 0) goto L4d
            goto L4e
        L4d:
            r1 = 0
        L4e:
            return r1
    }

    private java.lang.String joinShortList(java.util.ArrayList<java.lang.String> r4, int r5) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r4.size()
            r2 = 1
            int r5 = java.lang.Math.max(r2, r5)
            int r5 = java.lang.Math.min(r1, r5)
            r1 = 0
        L13:
            if (r1 >= r5) goto L2c
            int r2 = r0.length()
            if (r2 <= 0) goto L20
            java.lang.String r2 = ", "
            r0.append(r2)
        L20:
            java.lang.Object r2 = r4.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            int r1 = r1 + 1
            goto L13
        L2c:
            int r1 = r4.size()
            if (r1 <= r5) goto L40
            java.lang.String r1 = " +"
            java.lang.StringBuilder r1 = r0.append(r1)
            int r4 = r4.size()
            int r4 = r4 - r5
            r1.append(r4)
        L40:
            java.lang.String r4 = r0.toString()
            return r4
    }

    private /* synthetic */ int lambda$applyClientSideSortIfNeeded$18(ca.dnamobile.javalauncher.modmanager.ModrinthProject r1, ca.dnamobile.javalauncher.modmanager.ModrinthProject r2) {
            r0 = this;
            java.lang.String r1 = r1.title
            java.lang.String r1 = r0.safeSortText(r1)
            java.lang.String r2 = r2.title
            java.lang.String r2 = r0.safeSortText(r2)
            int r1 = r1.compareToIgnoreCase(r2)
            return r1
    }

    private /* synthetic */ int lambda$applyClientSideSortIfNeeded$19(ca.dnamobile.javalauncher.modmanager.ModrinthProject r1, ca.dnamobile.javalauncher.modmanager.ModrinthProject r2) {
            r0 = this;
            java.lang.String r2 = r2.dateModified
            java.lang.String r2 = r0.safeSortText(r2)
            java.lang.String r1 = r1.dateModified
            java.lang.String r1 = r0.safeSortText(r1)
            int r1 = r2.compareToIgnoreCase(r1)
            return r1
    }

    static /* synthetic */ int lambda$applyClientSideSortIfNeeded$20(ca.dnamobile.javalauncher.modmanager.ModrinthProject r2, ca.dnamobile.javalauncher.modmanager.ModrinthProject r3) {
            long r0 = r3.followers
            long r2 = r2.followers
            int r2 = java.lang.Long.compare(r0, r2)
            return r2
    }

    static /* synthetic */ int lambda$applyClientSideSortIfNeeded$21(ca.dnamobile.javalauncher.modmanager.ModrinthProject r2, ca.dnamobile.javalauncher.modmanager.ModrinthProject r3) {
            long r0 = r3.downloads
            long r2 = r2.downloads
            int r2 = java.lang.Long.compare(r0, r2)
            return r2
    }

    private /* synthetic */ void lambda$bindViews$0(android.view.View r1) {
            r0 = this;
            r0.finish()
            return
    }

    private /* synthetic */ boolean lambda$configureSearchClearButton$9(android.view.View r5, android.view.MotionEvent r6) {
            r4 = this;
            int r5 = r6.getAction()
            r0 = 0
            r1 = 1
            if (r5 == r1) goto L9
            return r0
        L9:
            boolean r5 = r4.hasSearchText()
            if (r5 != 0) goto L10
            return r0
        L10:
            com.google.android.material.textfield.TextInputEditText r5 = r4.editSearch
            android.graphics.drawable.Drawable[] r5 = r5.getCompoundDrawablesRelative()
            r2 = 2
            r5 = r5[r2]
            if (r5 != 0) goto L1c
            return r0
        L1c:
            com.google.android.material.textfield.TextInputEditText r2 = r4.editSearch
            int r2 = r2.getWidth()
            com.google.android.material.textfield.TextInputEditText r3 = r4.editSearch
            int r3 = r3.getPaddingEnd()
            int r2 = r2 - r3
            android.graphics.Rect r5 = r5.getBounds()
            int r5 = r5.width()
            int r2 = r2 - r5
            r5 = 16
            int r5 = r4.dp(r5)
            int r2 = r2 - r5
            float r5 = r6.getX()
            float r6 = (float) r2
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L43
            return r0
        L43:
            r4.clearPendingSearch()
            com.google.android.material.textfield.TextInputEditText r5 = r4.editSearch
            java.lang.String r6 = ""
            r5.setText(r6)
            r4.clearPendingSearch()
            r4.updateSearchClearButtonVisibility()
            r4.loadContent(r1, r1)
            return r1
    }

    private /* synthetic */ void lambda$confirmInstall$23(ca.dnamobile.javalauncher.modmanager.ModrinthProject r1, android.content.DialogInterface r2, int r3) {
            r0 = this;
            r0.installProject(r1)
            return
    }

    private /* synthetic */ void lambda$confirmInstall$24(android.content.DialogInterface r1) {
            r0 = this;
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r0)
            return
    }

    private /* synthetic */ void lambda$confirmInstallModpackVersion$37(ca.dnamobile.javalauncher.modmanager.ModrinthProject r1, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice r2, android.content.DialogInterface r3, int r4) {
            r0 = this;
            r0.installModpackProject(r1, r2)
            return
    }

    private /* synthetic */ void lambda$confirmInstallModpackVersion$38(android.content.DialogInterface r1) {
            r0 = this;
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r0)
            return
    }

    private /* synthetic */ void lambda$forceScrollTop$13() {
            r2 = this;
            androidx.core.widget.NestedScrollView r0 = r2.scrollRoot
            r1 = 33
            r0.fullScroll(r1)
            androidx.core.widget.NestedScrollView r0 = r2.scrollRoot
            r1 = 0
            r0.scrollTo(r1, r1)
            return
    }

    private /* synthetic */ void lambda$forceScrollTop$14() {
            r2 = this;
            androidx.core.widget.NestedScrollView r0 = r2.scrollRoot
            r1 = 33
            r0.fullScroll(r1)
            androidx.core.widget.NestedScrollView r0 = r2.scrollRoot
            r1 = 0
            r0.scrollTo(r1, r1)
            return
    }

    private /* synthetic */ void lambda$installModpackProject$26(ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice r10, ca.dnamobile.javalauncher.modmanager.ModrinthProject r11, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener r12) {
            r9 = this;
            if (r10 == 0) goto L13
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r1 = r11.source
            java.lang.String r2 = r11.projectId
            java.lang.String r3 = r11.slug
            java.lang.String r4 = r11.title
            java.lang.String r5 = r11.iconUrl
            r0 = r9
            r6 = r10
            r7 = r12
            ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.installFromProjectVersion(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L26
        L13:
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r1 = r11.source
            java.lang.String r2 = r11.projectId
            java.lang.String r3 = r11.slug
            java.lang.String r4 = r11.title
            java.lang.String r5 = r11.iconUrl
            java.lang.String r6 = r9.gameVersionId
            java.lang.String r7 = r9.loader
            r0 = r9
            r8 = r12
            ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.installFromProject(r0, r1, r2, r3, r4, r5, r6, r7, r8)
        L26:
            return
    }

    private /* synthetic */ void lambda$installProject$25(ca.dnamobile.javalauncher.modmanager.ModrinthProject r8, java.io.File r9, ca.dnamobile.javalauncher.modmanager.ModrinthInstallManager.Listener r10) {
            r7 = this;
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = r8.source
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r1 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.CURSEFORGE
            if (r0 != r1) goto L18
            ca.dnamobile.javalauncher.modmanager.CurseForgeApiClient r0 = new ca.dnamobile.javalauncher.modmanager.CurseForgeApiClient
            r0.<init>(r7)
            java.lang.String r2 = r7.gameVersionId
            java.lang.String r3 = r7.loader
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r4 = r7.selectedType
            r1 = r9
            r5 = r8
            r6 = r10
            ca.dnamobile.javalauncher.modmanager.CurseForgeInstallManager.installLatestCompatible(r0, r1, r2, r3, r4, r5, r6)
            goto L24
        L18:
            java.lang.String r1 = r7.gameVersionId
            java.lang.String r2 = r7.loader
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r3 = r7.selectedType
            r0 = r9
            r4 = r8
            r5 = r10
            ca.dnamobile.javalauncher.modmanager.ModrinthInstallManager.installLatestCompatible(r0, r1, r2, r3, r4, r5)
        L24:
            return
    }

    private /* synthetic */ void lambda$loadContent$15(int r2, int r3, java.util.ArrayList r4, boolean r5) {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.requestGeneration
            int r0 = r0.get()
            if (r2 == r0) goto L9
            return
        L9:
            r1.totalHits = r3
            ca.dnamobile.javalauncher.ContentBrowserActivity$ContentProjectAdapter r2 = r1.adapter
            r2.submit(r4)
            r1.updatePaginationControls()
            r1.updateResultSummary()
            if (r5 == 0) goto L25
            com.google.android.material.textfield.TextInputEditText r2 = r1.editSearch
            if (r2 == 0) goto L22
            boolean r2 = r2.hasFocus()
            if (r2 != 0) goto L25
        L22:
            r1.forceScrollTop()
        L25:
            return
    }

    private /* synthetic */ void lambda$loadContent$16(int r3, java.lang.Throwable r4) {
            r2 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r2.requestGeneration
            int r0 = r0.get()
            if (r3 == r0) goto L9
            return
        L9:
            ca.dnamobile.javalauncher.ContentBrowserActivity$ContentProjectAdapter r3 = r2.adapter
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.submit(r0)
            r3 = 0
            r2.totalHits = r3
            r2.updatePaginationControls()
            android.widget.TextView r3 = r2.textResultSummary
            int r0 = ca.dnamobile.javalauncher.R.string.content_browser_load_failed
            java.lang.String r1 = r4.getMessage()
            if (r1 == 0) goto L28
            java.lang.String r4 = r4.getMessage()
            goto L30
        L28:
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
        L30:
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r4 = r2.getString(r0, r4)
            r3.setText(r4)
            return
    }

    private /* synthetic */ void lambda$loadContent$17(ca.dnamobile.javalauncher.modmanager.ModManagerContentType r12, ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSource r13, java.lang.String r14, java.lang.String r15, int r16, ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort r17, int r18, boolean r19) {
            r11 = this;
            r9 = r11
            r0 = r12
            r1 = r13
            r10 = r17
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODPACKS     // Catch: java.lang.Throwable -> L89
            if (r0 != r2) goto L2c
            ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSource r2 = ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSource.CURSEFORGE     // Catch: java.lang.Throwable -> L89
            if (r1 != r2) goto L10
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r1 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.CURSEFORGE     // Catch: java.lang.Throwable -> L89
            goto L12
        L10:
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r1 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.MODRINTH     // Catch: java.lang.Throwable -> L89
        L12:
            r2 = r1
            java.lang.String r5 = r9.loader     // Catch: java.lang.Throwable -> L89
            java.lang.String r8 = r10.apiKey     // Catch: java.lang.Throwable -> L89
            r6 = 20
            r1 = r11
            r3 = r14
            r4 = r15
            r7 = r16
            ca.dnamobile.javalauncher.modmanager.ModpackSearchApiClient$SearchResult r1 = ca.dnamobile.javalauncher.modmanager.ModpackSearchApiClient.search(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L89
            java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModrinthProject> r2 = r1.hits     // Catch: java.lang.Throwable -> L89
            int r1 = r1.totalHits     // Catch: java.lang.Throwable -> L89
            r11.applyClientSideSortIfNeeded(r2, r12, r10)     // Catch: java.lang.Throwable -> L89
            r0 = r1
            r1 = r2
            goto L77
        L2c:
            ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSource r2 = ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSource.CURSEFORGE     // Catch: java.lang.Throwable -> L89
            java.lang.String r3 = "downloads"
            if (r1 != r2) goto L55
            ca.dnamobile.javalauncher.modmanager.CurseForgeApiClient r1 = new ca.dnamobile.javalauncher.modmanager.CurseForgeApiClient     // Catch: java.lang.Throwable -> L89
            r1.<init>(r11)     // Catch: java.lang.Throwable -> L89
            java.lang.String r4 = r9.gameVersionId     // Catch: java.lang.Throwable -> L89
            java.lang.String r5 = r9.loader     // Catch: java.lang.Throwable -> L89
            boolean r2 = r14.isEmpty()     // Catch: java.lang.Throwable -> L89
            if (r2 == 0) goto L43
            r8 = r3
            goto L46
        L43:
            java.lang.String r2 = "popularity"
            r8 = r2
        L46:
            r6 = 20
            r2 = r14
            r3 = r12
            r7 = r16
            ca.dnamobile.javalauncher.modmanager.CurseForgeApiClient$SearchResult r0 = r1.searchProjects(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L89
            java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModrinthProject> r1 = r0.hits     // Catch: java.lang.Throwable -> L89
            int r0 = r0.totalHits     // Catch: java.lang.Throwable -> L89
            goto L77
        L55:
            ca.dnamobile.javalauncher.modmanager.ModrinthApiClient r1 = new ca.dnamobile.javalauncher.modmanager.ModrinthApiClient     // Catch: java.lang.Throwable -> L89
            r1.<init>()     // Catch: java.lang.Throwable -> L89
            java.lang.String r4 = r9.gameVersionId     // Catch: java.lang.Throwable -> L89
            java.lang.String r5 = r9.loader     // Catch: java.lang.Throwable -> L89
            boolean r2 = r14.isEmpty()     // Catch: java.lang.Throwable -> L89
            if (r2 == 0) goto L66
            r8 = r3
            goto L69
        L66:
            java.lang.String r2 = "relevance"
            r8 = r2
        L69:
            r6 = 20
            r2 = r14
            r3 = r12
            r7 = r16
            ca.dnamobile.javalauncher.modmanager.ModrinthApiClient$SearchResult r0 = r1.searchProjects(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L89
            java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModrinthProject> r1 = r0.hits     // Catch: java.lang.Throwable -> L89
            int r0 = r0.totalHits     // Catch: java.lang.Throwable -> L89
        L77:
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda1 r2 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda1     // Catch: java.lang.Throwable -> L89
            r12 = r2
            r13 = r11
            r14 = r18
            r15 = r0
            r16 = r1
            r17 = r19
            r12.<init>(r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L89
            r11.runOnUiThread(r2)     // Catch: java.lang.Throwable -> L89
            goto L94
        L89:
            r0 = move-exception
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda2 r1 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda2
            r2 = r18
            r1.<init>(r11, r2, r0)
            r11.runOnUiThread(r1)
        L94:
            return
    }

    static /* synthetic */ void lambda$resolveProjectIconUrlAsync$39(android.widget.ImageView r1, java.lang.String r2, java.lang.String r3, int r4) {
            java.lang.Object r0 = r1.getTag()
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto Ld
            ca.dnamobile.javalauncher.modmanager.NetworkImageLoader.load(r1, r3, r4)
        Ld:
            return
    }

    private /* synthetic */ void lambda$resolveProjectIconUrlAsync$40(ca.dnamobile.javalauncher.modmanager.ModrinthProject r2, java.lang.String r3, android.widget.ImageView r4, int r5) {
            r1 = this;
            r0 = 0
            java.lang.String r2 = r1.fetchProjectIconUrl(r2)     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = r1.normalizeImageUrl(r2)     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L10
            java.util.Map<java.lang.String, java.lang.String> r2 = r1.resolvedProjectIconUrls     // Catch: java.lang.Throwable -> L10
            r2.put(r3, r0)     // Catch: java.lang.Throwable -> L10
        L10:
            java.util.Set<java.lang.String> r2 = r1.resolvingProjectIconUrls
            r2.remove(r3)
            if (r0 != 0) goto L18
            return
        L18:
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda11 r2 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda11
            r2.<init>(r4, r3, r0, r5)
            r1.runOnUiThread(r2)
            return
    }

    private /* synthetic */ void lambda$scheduleSearchFromTyping$10() {
            r2 = this;
            r0 = 0
            r2.pendingSearchRunnable = r0
            r0 = 1
            r1 = 0
            r2.loadContent(r0, r1)
            return
    }

    private /* synthetic */ void lambda$setupPagination$11(android.view.View r1) {
            r0 = this;
            int r1 = r0.currentPage
            if (r1 > 0) goto L5
            return
        L5:
            r0.clearPendingSearch()
            int r1 = r0.currentPage
            int r1 = r1 + (-1)
            r0.currentPage = r1
            r1 = 0
            r0.loadContent(r1)
            return
    }

    private /* synthetic */ void lambda$setupPagination$12(android.view.View r2) {
            r1 = this;
            int r2 = r1.totalHits
            int r2 = r1.getTotalPages(r2)
            int r0 = r1.currentPage
            int r0 = r0 + 1
            if (r0 < r2) goto Ld
            return
        Ld:
            r1.clearPendingSearch()
            int r2 = r1.currentPage
            int r2 = r2 + 1
            r1.currentPage = r2
            r2 = 0
            r1.loadContent(r2)
            return
    }

    private /* synthetic */ boolean lambda$setupSearch$2(android.widget.TextView r4, int r5, android.view.KeyEvent r6) {
            r3 = this;
            r4 = 3
            r0 = 0
            r1 = 1
            if (r5 != r4) goto L7
            r4 = r1
            goto L8
        L7:
            r4 = r0
        L8:
            if (r6 == 0) goto L1a
            int r5 = r6.getKeyCode()
            r2 = 66
            if (r5 != r2) goto L1a
            int r5 = r6.getAction()
            if (r5 != r1) goto L1a
            r5 = r1
            goto L1b
        L1a:
            r5 = r0
        L1b:
            if (r4 != 0) goto L21
            if (r5 == 0) goto L20
            goto L21
        L20:
            return r0
        L21:
            r3.runSearchNow()
            return r1
    }

    private /* synthetic */ void lambda$setupSortDropdown$3(android.view.View r1) {
            r0 = this;
            r0.showSortDialog()
            return
    }

    private /* synthetic */ void lambda$setupSourceToggle$1(com.google.android.material.button.MaterialButtonToggleGroup r1, int r2, boolean r3) {
            r0 = this;
            if (r3 != 0) goto L3
            return
        L3:
            int r1 = ca.dnamobile.javalauncher.R.id.buttonSourceCurseForge
            if (r2 != r1) goto La
            ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSource r1 = ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSource.CURSEFORGE
            goto Lc
        La:
            ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSource r1 = ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSource.MODRINTH
        Lc:
            r0.selectedSource = r1
            r0.updateSortButtonLabel()
            r0.clearPendingSearch()
            r1 = 1
            r0.loadContent(r1)
            return
    }

    private /* synthetic */ void lambda$showMinecraftVersionFilterDialog$5(java.util.ArrayList r1) {
            r0 = this;
            r0.dismissMinecraftVersionLoadingDialog()
            r0.cachedReleaseMinecraftVersions = r1
            r0.showMinecraftVersionFilterDialog(r1)
            return
    }

    private /* synthetic */ void lambda$showMinecraftVersionFilterDialog$6(java.lang.Throwable r3) {
            r2 = this;
            r2.dismissMinecraftVersionLoadingDialog()
            java.lang.String r0 = r3.getMessage()
            if (r0 == 0) goto Le
            java.lang.String r3 = r3.getMessage()
            goto L16
        Le:
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getSimpleName()
        L16:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to load Minecraft versions: "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r0 = 1
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r0)
            r3.show()
            java.util.ArrayList r3 = r2.buildFallbackReleaseMinecraftVersions()
            r2.showMinecraftVersionFilterDialog(r3)
            return
    }

    private /* synthetic */ void lambda$showMinecraftVersionFilterDialog$7() {
            r2 = this;
            java.util.ArrayList r0 = r2.fetchReleaseMinecraftVersions()     // Catch: java.lang.Throwable -> Ld
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda19 r1 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda19     // Catch: java.lang.Throwable -> Ld
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> Ld
            r2.runOnUiThread(r1)     // Catch: java.lang.Throwable -> Ld
            goto L16
        Ld:
            r0 = move-exception
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda20 r1 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda20
            r1.<init>(r2, r0)
            r2.runOnUiThread(r1)
        L16:
            return
    }

    private /* synthetic */ void lambda$showMinecraftVersionFilterDialog$8(java.util.ArrayList r1, android.content.DialogInterface r2, int r3) {
            r0 = this;
            r2.dismiss()
            ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort r2 = ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort.VERSIONS
            r0.selectedSort = r2
            if (r3 != 0) goto Lc
            java.lang.String r1 = ""
            goto L12
        Lc:
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
        L12:
            r0.selectedModpackMinecraftVersionFilter = r1
            r0.updateSortButtonLabel()
            r0.clearPendingSearch()
            r1 = 1
            r0.loadContent(r1)
            return
    }

    private /* synthetic */ void lambda$showMinecraftVersionPickerDialog$30(ca.dnamobile.javalauncher.modmanager.ModrinthProject r2, java.util.LinkedHashMap r3, ca.dnamobile.javalauncher.ContentBrowserActivity.ModpackMinecraftVersionGroup r4) {
            r1 = this;
            androidx.appcompat.app.AlertDialog r0 = r1.currentModpackVersionDialog
            if (r0 == 0) goto L7
            r0.dismiss()
        L7:
            java.lang.String r0 = r4.minecraftVersion
            java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$ModpackVersionChoice> r4 = r4.versions
            r1.showModpackVersionsForMinecraftDialog(r2, r3, r0, r4)
            return
    }

    private /* synthetic */ void lambda$showMinecraftVersionPickerDialog$31(androidx.appcompat.app.AlertDialog r1, android.content.DialogInterface r2) {
            r0 = this;
            androidx.appcompat.app.AlertDialog r2 = r0.currentModpackVersionDialog
            if (r2 != r1) goto L7
            r1 = 0
            r0.currentModpackVersionDialog = r1
        L7:
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r0)
            return
    }

    private /* synthetic */ void lambda$showMinecraftVersionPickerDialog$32(androidx.appcompat.app.AlertDialog r1, android.content.DialogInterface r2) {
            r0 = this;
            ca.dnamobile.javalauncher.ui.LauncherDialogStyle.styleDialogChrome(r0, r1)
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r0)
            return
    }

    private /* synthetic */ void lambda$showModpackVersionPicker$27(java.util.ArrayList r2, ca.dnamobile.javalauncher.modmanager.ModrinthProject r3) {
            r1 = this;
            r1.dismissModpackVersionLoadingDialog()
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L29
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "No installable modpack versions were found for "
            r2.<init>(r0)
            java.lang.String r3 = r3.title
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 1
            android.widget.Toast r2 = android.widget.Toast.makeText(r1, r2, r3)
            r2.show()
            return
        L29:
            r1.showModpackVersionSelectionDialog(r3, r2)
            return
    }

    private /* synthetic */ void lambda$showModpackVersionPicker$28(java.lang.Throwable r3) {
            r2 = this;
            r2.dismissModpackVersionLoadingDialog()
            java.lang.String r0 = r3.getMessage()
            if (r0 == 0) goto Le
            java.lang.String r3 = r3.getMessage()
            goto L16
        Le:
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getSimpleName()
        L16:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to load modpack versions: "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r0 = 1
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r0)
            r3.show()
            return
    }

    private /* synthetic */ void lambda$showModpackVersionPicker$29(ca.dnamobile.javalauncher.modmanager.ModrinthProject r4) {
            r3 = this;
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = r4.source     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = r4.projectId     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = r4.slug     // Catch: java.lang.Throwable -> L13
            java.util.ArrayList r0 = ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.listProjectVersions(r3, r0, r1, r2)     // Catch: java.lang.Throwable -> L13
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda13 r1 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda13     // Catch: java.lang.Throwable -> L13
            r1.<init>(r3, r0, r4)     // Catch: java.lang.Throwable -> L13
            r3.runOnUiThread(r1)     // Catch: java.lang.Throwable -> L13
            goto L1c
        L13:
            r4 = move-exception
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda14 r0 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda14
            r0.<init>(r3, r4)
            r3.runOnUiThread(r0)
        L1c:
            return
    }

    private /* synthetic */ void lambda$showModpackVersionsForMinecraftDialog$33(ca.dnamobile.javalauncher.modmanager.ModrinthProject r2, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice r3) {
            r1 = this;
            androidx.appcompat.app.AlertDialog r0 = r1.currentModpackVersionDialog
            if (r0 == 0) goto L7
            r0.dismiss()
        L7:
            r1.confirmInstallModpackVersion(r2, r3)
            return
    }

    private /* synthetic */ void lambda$showModpackVersionsForMinecraftDialog$34(androidx.appcompat.app.AlertDialog r1, android.content.DialogInterface r2) {
            r0 = this;
            androidx.appcompat.app.AlertDialog r2 = r0.currentModpackVersionDialog
            if (r2 != r1) goto L7
            r1 = 0
            r0.currentModpackVersionDialog = r1
        L7:
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r0)
            return
    }

    private /* synthetic */ void lambda$showModpackVersionsForMinecraftDialog$35(androidx.appcompat.app.AlertDialog r1, android.content.DialogInterface r2) {
            r0 = this;
            ca.dnamobile.javalauncher.ui.LauncherDialogStyle.styleDialogChrome(r0, r1)
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r0)
            return
    }

    private /* synthetic */ void lambda$showModpackVersionsForMinecraftDialog$36(androidx.appcompat.app.AlertDialog r1, ca.dnamobile.javalauncher.modmanager.ModrinthProject r2, java.util.LinkedHashMap r3, android.view.View r4) {
            r0 = this;
            r1.dismiss()
            r0.showMinecraftVersionPickerDialog(r2, r3)
            return
    }

    private /* synthetic */ boolean lambda$showProjectMenu$22(ca.dnamobile.javalauncher.modmanager.ModrinthProject r4, android.view.MenuItem r5) {
            r3 = this;
            int r0 = r5.getItemId()
            r1 = 1
            if (r0 != r1) goto Lb
            r3.confirmInstall(r4)
            return r1
        Lb:
            int r0 = r5.getItemId()
            r2 = 2
            if (r0 != r2) goto L16
            r3.openProjectDetails(r4)
            return r1
        L16:
            int r5 = r5.getItemId()
            r0 = 3
            if (r5 != r0) goto L21
            r3.openProjectWebsite(r4)
            return r1
        L21:
            r4 = 0
            return r4
    }

    private /* synthetic */ void lambda$showSortDialog$4(java.util.ArrayList r1, android.content.DialogInterface r2, int r3) {
            r0 = this;
            r2.dismiss()
            java.lang.Object r1 = r1.get(r3)
            ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort r1 = (ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort) r1
            ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort r2 = ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort.VERSIONS
            if (r1 != r2) goto L17
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2 = r0.selectedType
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r3 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODPACKS
            if (r2 != r3) goto L17
            r0.showMinecraftVersionFilterDialog()
            return
        L17:
            ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort r2 = r0.selectedSort
            r3 = 1
            if (r2 != r1) goto L2b
            java.lang.String r2 = r0.selectedModpackMinecraftVersionFilter
            java.lang.String r2 = r2.trim()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L29
            goto L2b
        L29:
            r2 = 0
            goto L2c
        L2b:
            r2 = r3
        L2c:
            r0.selectedSort = r1
            java.lang.String r1 = ""
            r0.selectedModpackMinecraftVersionFilter = r1
            r0.updateSortButtonLabel()
            if (r2 == 0) goto L3d
            r0.clearPendingSearch()
            r0.loadContent(r3)
        L3d:
            return
    }

    private /* synthetic */ int lambda$sortModpackVersionsNewestFirst$41(ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice r3, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice r4) {
            r2 = this;
            java.lang.String r0 = r3.datePublished
            java.lang.String r1 = r4.datePublished
            int r0 = r2.compareNullableIsoDatesDescending(r0, r1)
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.lang.String r0 = r3.versionNumber
            java.lang.String r1 = r4.versionNumber
            int r0 = r2.compareVersionLabelsDescending(r0, r1)
            if (r0 == 0) goto L16
            return r0
        L16:
            java.lang.String r0 = r3.versionName
            java.lang.String r1 = r4.versionName
            int r0 = r2.compareVersionLabelsDescending(r0, r1)
            if (r0 == 0) goto L21
            return r0
        L21:
            java.lang.String r4 = r4.getDisplayTitle()
            java.lang.String r3 = r3.getDisplayTitle()
            int r3 = r4.compareToIgnoreCase(r3)
            return r3
    }

    private void loadContent(boolean r2) {
            r1 = this;
            r0 = 1
            r1.loadContent(r2, r0)
            return
    }

    private void loadContent(boolean r13, boolean r14) {
            r12 = this;
            r12.normalizeSortForSelectedType()
            com.google.android.material.textfield.TextInputEditText r0 = r12.editSearch
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = r12.selectedType
            java.lang.String r1 = r12.getSearchHint(r1)
            r0.setHint(r1)
            r12.updateSearchClearButtonVisibility()
            android.widget.TextView r0 = r12.textContentTitle
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = r12.selectedType
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODPACKS
            if (r1 != r2) goto L1c
            java.lang.String r1 = "Browse Modpacks"
            goto L22
        L1c:
            int r1 = ca.dnamobile.javalauncher.R.string.content_browser_install_title
            java.lang.String r1 = r12.getString(r1)
        L22:
            r0.setText(r1)
            r12.updateFilterChips()
            r12.pruneInstalledManifestForCurrentTab()
            if (r13 == 0) goto L30
            r13 = 0
            r12.currentPage = r13
        L30:
            java.util.concurrent.atomic.AtomicInteger r13 = r12.requestGeneration
            int r8 = r13.incrementAndGet()
            com.google.android.material.textfield.TextInputEditText r13 = r12.editSearch
            android.text.Editable r13 = r13.getText()
            if (r13 != 0) goto L41
            java.lang.String r13 = ""
            goto L4f
        L41:
            com.google.android.material.textfield.TextInputEditText r13 = r12.editSearch
            android.text.Editable r13 = r13.getText()
            java.lang.String r13 = r13.toString()
            java.lang.String r13 = r13.trim()
        L4f:
            r4 = r13
            int r13 = r12.currentPage
            int r6 = r13 * 20
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2 = r12.selectedType
            ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSource r13 = r12.selectedSource
            ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort r7 = r12.selectedSort
            java.lang.String r5 = r12.getEffectiveModpackGameVersionFilter(r7)
            android.widget.TextView r0 = r12.textResultSummary
            int r1 = ca.dnamobile.javalauncher.R.string.content_browser_loading_source
            java.lang.String r3 = r12.getSelectedSourceLabel()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r1 = r12.getString(r1, r3)
            r0.setText(r1)
            r12.updatePaginationControls()
            java.lang.Thread r10 = new java.lang.Thread
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda22 r11 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda22
            r0 = r11
            r1 = r12
            r3 = r13
            r9 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSource r14 = ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSource.CURSEFORGE
            if (r13 != r14) goto L86
            java.lang.String r13 = "CurseForgeSearch"
            goto L88
        L86:
            java.lang.String r13 = "ModrinthSearch"
        L88:
            r10.<init>(r11, r13)
            r10.start()
            return
    }

    private java.lang.String normalizeImageUrl(java.lang.String r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.String r4 = r4.trim()
            java.lang.String r1 = "\""
            boolean r2 = r4.startsWith(r1)
            if (r2 == 0) goto L16
            boolean r1 = r4.endsWith(r1)
            if (r1 != 0) goto L24
        L16:
            java.lang.String r1 = "'"
            boolean r2 = r4.startsWith(r1)
            if (r2 == 0) goto L32
            boolean r1 = r4.endsWith(r1)
            if (r1 == 0) goto L32
        L24:
            int r1 = r4.length()
            r2 = 1
            int r1 = r1 - r2
            java.lang.String r4 = r4.substring(r2, r1)
            java.lang.String r4 = r4.trim()
        L32:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L6c
            java.lang.String r1 = "null"
            boolean r1 = r1.equalsIgnoreCase(r4)
            if (r1 == 0) goto L41
            goto L6c
        L41:
            java.lang.String r1 = "//"
            boolean r1 = r4.startsWith(r1)
            if (r1 == 0) goto L59
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "https:"
            r0.<init>(r1)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            return r4
        L59:
            java.lang.String r1 = "http://"
            boolean r1 = r4.startsWith(r1)
            if (r1 != 0) goto L6b
            java.lang.String r1 = "https://"
            boolean r1 = r4.startsWith(r1)
            if (r1 == 0) goto L6a
            goto L6b
        L6a:
            return r0
        L6b:
            return r4
        L6c:
            return r0
    }

    private java.lang.String normalizeMinecraftVersionKey(java.lang.String r3) {
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

    private void normalizeSortForSelectedType() {
            r3 = this;
            ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort r0 = r3.selectedSort
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = r3.selectedType
            boolean r0 = r0.isAvailableFor(r1)
            java.lang.String r1 = ""
            if (r0 != 0) goto L12
            ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort r0 = ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort.DOWNLOADS
            r3.selectedSort = r0
            r3.selectedModpackMinecraftVersionFilter = r1
        L12:
            ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort r0 = r3.selectedSort
            ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort r2 = ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort.VERSIONS
            if (r0 == r2) goto L1a
            r3.selectedModpackMinecraftVersionFilter = r1
        L1a:
            r3.updateSortButtonLabel()
            return
    }

    private void openInstalledModpackInstance(ca.dnamobile.javalauncher.instance.LauncherInstance r1) {
            r0 = this;
            if (r1 != 0) goto L6
            r0.finish()
            return
        L6:
            android.content.Intent r1 = ca.dnamobile.javalauncher.InstanceDetailsActivity.createIntent(r0, r1)
            r0.startActivity(r1)
            r0.finish()
            return
    }

    private void openProjectDetails(ca.dnamobile.javalauncher.modmanager.ModrinthProject r4) {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<ca.dnamobile.javalauncher.ContentProjectDetailsActivity> r1 = ca.dnamobile.javalauncher.ContentProjectDetailsActivity.class
            r0.<init>(r3, r1)
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.INSTANCE_ID"
            java.lang.String r2 = r3.instanceId
            r0.putExtra(r1, r2)
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.INSTANCE_NAME"
            java.lang.String r2 = r3.instanceName
            r0.putExtra(r1, r2)
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.INSTANCE_LOADER"
            java.lang.String r2 = r3.loader
            r0.putExtra(r1, r2)
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.BASE_VERSION_ID"
            java.lang.String r2 = r3.baseVersionId
            r0.putExtra(r1, r2)
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.MINECRAFT_VERSION_ID"
            java.lang.String r2 = r3.gameVersionId
            r0.putExtra(r1, r2)
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.GAME_DIRECTORY"
            java.lang.String r2 = r3.gameDirectoryPath
            r0.putExtra(r1, r2)
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = r3.selectedType
            java.lang.String r1 = r1.getIntentValue()
            java.lang.String r2 = "ca.dnamobile.javalauncher.extra.CONTENT_CATEGORY"
            r0.putExtra(r2, r1)
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.PROJECT_ID"
            java.lang.String r2 = r4.projectId
            r0.putExtra(r1, r2)
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.PROJECT_SLUG"
            java.lang.String r2 = r4.slug
            r0.putExtra(r1, r2)
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.PROJECT_TITLE"
            java.lang.String r2 = r4.title
            r0.putExtra(r1, r2)
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = r3.selectedType
            java.lang.String r1 = r1.getIntentValue()
            java.lang.String r2 = "ca.dnamobile.javalauncher.extra.PROJECT_TYPE"
            r0.putExtra(r2, r1)
            java.lang.String r1 = r4.iconUrl
            if (r1 != 0) goto L63
            java.lang.String r1 = ""
            goto L65
        L63:
            java.lang.String r1 = r4.iconUrl
        L65:
            java.lang.String r2 = "ca.dnamobile.javalauncher.extra.PROJECT_ICON_URL"
            r0.putExtra(r2, r1)
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r4 = r4.source
            java.lang.String r4 = r4.getId()
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.PROJECT_SOURCE"
            r0.putExtra(r1, r4)
            r3.startActivity(r0)
            return
    }

    private void openProjectWebsite(ca.dnamobile.javalauncher.modmanager.ModrinthProject r4) {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent     // Catch: android.content.ActivityNotFoundException -> L13
            java.lang.String r1 = "android.intent.action.VIEW"
            java.lang.String r2 = r4.getWebsiteUrl()     // Catch: android.content.ActivityNotFoundException -> L13
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: android.content.ActivityNotFoundException -> L13
            r0.<init>(r1, r2)     // Catch: android.content.ActivityNotFoundException -> L13
            r3.startActivity(r0)     // Catch: android.content.ActivityNotFoundException -> L13
            goto L1f
        L13:
            java.lang.String r4 = r4.getWebsiteUrl()
            r0 = 1
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r0)
            r4.show()
        L1f:
            return
    }

    private void pinOptiMobileFirst(java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModrinthProject> r5) {
            r4 = this;
            int r0 = r5.size()
            r1 = 2
            if (r0 >= r1) goto L8
            return
        L8:
            int r0 = r5.size()
            int r0 = r0 + (-1)
            r1 = 0
        Lf:
            if (r0 < 0) goto L27
            java.lang.Object r2 = r5.get(r0)
            ca.dnamobile.javalauncher.modmanager.ModrinthProject r2 = (ca.dnamobile.javalauncher.modmanager.ModrinthProject) r2
            boolean r3 = r4.isOptiMobileModpack(r2)
            if (r3 != 0) goto L1e
            goto L24
        L1e:
            if (r1 != 0) goto L21
            r1 = r2
        L21:
            r5.remove(r0)
        L24:
            int r0 = r0 + (-1)
            goto Lf
        L27:
            if (r1 == 0) goto L2d
            r0 = 0
            r5.add(r0, r1)
        L2d:
            return
    }

    private void prepareTopFocus() {
            r2 = this;
            androidx.core.widget.NestedScrollView r0 = r2.scrollRoot
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 1
            r0.setFocusableInTouchMode(r1)
            androidx.core.widget.NestedScrollView r0 = r2.scrollRoot
            r1 = 131072(0x20000, float:1.83671E-40)
            r0.setDescendantFocusability(r1)
            androidx.core.widget.NestedScrollView r0 = r2.scrollRoot
            r0.requestFocus()
            com.google.android.material.textfield.TextInputEditText r0 = r2.editSearch
            if (r0 == 0) goto L1c
            r0.clearFocus()
        L1c:
            return
    }

    private void pruneInstalledManifestForCurrentTab() {
            r2 = this;
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = r2.selectedType
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODPACKS
            if (r0 != r1) goto L7
            return
        L7:
            java.lang.String r0 = r2.gameDirectoryPath
            if (r0 == 0) goto L22
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L16
            goto L22
        L16:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r2.gameDirectoryPath
            r0.<init>(r1)
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = r2.selectedType
            ca.dnamobile.javalauncher.modmanager.ModManagerManifest.pruneMissingFiles(r0, r1)
        L22:
            return
    }

    private void readExtras() {
            r3 = this;
            java.lang.String r0 = "ca.dnamobile.javalauncher.extra.INSTANCE_ID"
            java.lang.String r1 = ""
            java.lang.String r0 = r3.safeExtra(r0, r1)
            r3.instanceId = r0
            java.lang.String r0 = "ca.dnamobile.javalauncher.extra.INSTANCE_NAME"
            java.lang.String r2 = "Unknown instance"
            java.lang.String r0 = r3.safeExtra(r0, r2)
            r3.instanceName = r0
            java.lang.String r0 = "ca.dnamobile.javalauncher.extra.INSTANCE_LOADER"
            java.lang.String r2 = "Vanilla"
            java.lang.String r0 = r3.safeExtra(r0, r2)
            r3.loader = r0
            java.lang.String r0 = "ca.dnamobile.javalauncher.extra.BASE_VERSION_ID"
            java.lang.String r0 = r3.safeExtra(r0, r1)
            r3.baseVersionId = r0
            java.lang.String r0 = "ca.dnamobile.javalauncher.extra.MINECRAFT_VERSION_ID"
            java.lang.String r0 = r3.safeExtra(r0, r1)
            r3.gameVersionId = r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L3c
            java.lang.String r0 = r3.baseVersionId
            java.lang.String r0 = ca.dnamobile.javalauncher.modmanager.ModManagerVersionResolver.resolveGameVersionForContent(r0)
            r3.gameVersionId = r0
        L3c:
            java.lang.String r0 = "ca.dnamobile.javalauncher.extra.ICON_FILE"
            java.lang.String r0 = r3.safeExtra(r0, r1)
            r3.iconPath = r0
            java.lang.String r0 = "ca.dnamobile.javalauncher.extra.GAME_DIRECTORY"
            java.lang.String r0 = r3.safeExtra(r0, r1)
            r3.gameDirectoryPath = r0
            java.lang.String r0 = "ca.dnamobile.javalauncher.extra.CONTENT_CATEGORY"
            java.lang.String r1 = "mods"
            java.lang.String r0 = r3.safeExtra(r0, r1)
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.fromValue(r0)
            r3.selectedType = r0
            java.lang.String r0 = r3.gameDirectoryPath
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L6f
            java.lang.String r0 = r3.instanceId
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L6f
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODPACKS
            r3.selectedType = r0
            goto L79
        L6f:
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = r3.selectedType
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODPACKS
            if (r0 != r1) goto L79
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODS
            r3.selectedType = r0
        L79:
            return
    }

    private ca.dnamobile.javalauncher.modmanager.ModManagerContentType resolveProjectDisplayType(ca.dnamobile.javalauncher.modmanager.ModrinthProject r5, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r6) {
            r4 = this;
            java.lang.String r0 = r5.projectType
            if (r0 != 0) goto L7
            java.lang.String r0 = ""
            goto L13
        L7:
            java.lang.String r0 = r5.projectType
            java.lang.String r0 = r0.trim()
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r1)
        L13:
            java.lang.String r1 = "modpack"
            boolean r2 = r1.equals(r0)
            if (r2 != 0) goto L81
            boolean r1 = r4.categoryContains(r5, r1)
            if (r1 != 0) goto L81
            java.lang.String r1 = "modpacks"
            boolean r1 = r4.categoryContains(r5, r1)
            if (r1 == 0) goto L2a
            goto L81
        L2a:
            java.lang.String r1 = "resourcepack"
            boolean r2 = r1.equals(r0)
            if (r2 != 0) goto L7e
            java.lang.String r2 = "resourcepacks"
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L7e
            boolean r1 = r4.categoryContains(r5, r1)
            if (r1 != 0) goto L7e
            boolean r1 = r4.categoryContains(r5, r2)
            if (r1 == 0) goto L47
            goto L7e
        L47:
            java.lang.String r1 = "shader"
            boolean r2 = r1.equals(r0)
            if (r2 != 0) goto L7b
            java.lang.String r2 = "shaderpack"
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L7b
            java.lang.String r3 = "shaderpacks"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L7b
            boolean r0 = r4.categoryContains(r5, r1)
            if (r0 != 0) goto L7b
            java.lang.String r0 = "shaders"
            boolean r0 = r4.categoryContains(r5, r0)
            if (r0 != 0) goto L7b
            boolean r0 = r4.categoryContains(r5, r2)
            if (r0 != 0) goto L7b
            boolean r5 = r4.categoryContains(r5, r3)
            if (r5 == 0) goto L7a
            goto L7b
        L7a:
            return r6
        L7b:
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r5 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.SHADERPACKS
            return r5
        L7e:
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r5 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.RESOURCEPACKS
            return r5
        L81:
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r5 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODPACKS
            return r5
    }

    private void resolveProjectIconUrlAsync(android.widget.ImageView r9, ca.dnamobile.javalauncher.modmanager.ModrinthProject r10, java.lang.String r11, int r12) {
            r8 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r8.resolvedProjectIconUrls
            java.lang.Object r0 = r0.get(r11)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r8.normalizeImageUrl(r0)
            if (r0 == 0) goto L1c
            java.lang.Object r10 = r9.getTag()
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L1b
            ca.dnamobile.javalauncher.modmanager.NetworkImageLoader.load(r9, r0, r12)
        L1b:
            return
        L1c:
            java.util.Set<java.lang.String> r0 = r8.resolvingProjectIconUrls
            boolean r0 = r0.add(r11)
            if (r0 != 0) goto L25
            return
        L25:
            java.lang.Thread r0 = new java.lang.Thread
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda21 r7 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda21
            r1 = r7
            r2 = r8
            r3 = r10
            r4 = r11
            r5 = r9
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.String r9 = "ResolveContentIcon"
            r0.<init>(r7, r9)
            r0.start()
            return
    }

    private int resolveSelectableItemBackground() {
            r4 = this;
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r2 = 16843534(0x101030e, float:2.369575E-38)
            r3 = 1
            boolean r1 = r1.resolveAttribute(r2, r0, r3)
            if (r1 == 0) goto L16
            int r0 = r0.resourceId
            return r0
        L16:
            r0 = 0
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

    private void runSearchNow() {
            r1 = this;
            r1.clearPendingSearch()
            r1.hideSearchKeyboardAndClearFocus()
            r0 = 1
            r1.loadContent(r0, r0)
            return
    }

    private java.lang.String safeExtra(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            android.content.Intent r0 = r1.getIntent()
            java.lang.String r2 = r0.getStringExtra(r2)
            if (r2 == 0) goto L19
            java.lang.String r0 = r2.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L15
            goto L19
        L15:
            java.lang.String r3 = r2.trim()
        L19:
            return r3
    }

    private java.lang.String safeSortText(java.lang.String r1) {
            r0 = this;
            if (r1 != 0) goto L5
            java.lang.String r1 = ""
            goto L9
        L5:
            java.lang.String r1 = r1.trim()
        L9:
            return r1
    }

    private void scheduleSearchFromTyping() {
            r4 = this;
            r4.clearPendingSearch()
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda31 r0 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda31
            r0.<init>(r4)
            r4.pendingSearchRunnable = r0
            android.os.Handler r1 = r4.searchHandler
            r2 = 350(0x15e, double:1.73E-321)
            r1.postDelayed(r0, r2)
            return
    }

    private void setupHeader() {
            r5 = this;
            boolean r0 = r5.isBrowseModpacksOnlyMode()
            java.lang.String r1 = "Browse Modpacks"
            if (r0 == 0) goto L15
            android.widget.TextView r0 = r5.textInstanceName
            r0.setText(r1)
            android.widget.TextView r0 = r5.textInstanceMeta
            java.lang.String r2 = "Install modpacks as new launcher instances"
            r0.setText(r2)
            goto L42
        L15:
            android.widget.TextView r0 = r5.textInstanceName
            java.lang.String r2 = r5.instanceName
            r0.setText(r2)
            android.widget.TextView r0 = r5.textInstanceMeta
            int r2 = ca.dnamobile.javalauncher.R.string.content_browser_instance_meta
            java.lang.String r3 = r5.loader
            java.lang.String r3 = r5.displayLoader(r3)
            java.lang.String r4 = r5.gameVersionId
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L35
            int r4 = ca.dnamobile.javalauncher.R.string.content_browser_unknown_version
            java.lang.String r4 = r5.getString(r4)
            goto L37
        L35:
            java.lang.String r4 = r5.gameVersionId
        L37:
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}
            java.lang.String r2 = r5.getString(r2, r3)
            r0.setText(r2)
        L42:
            java.lang.String r0 = r5.iconPath
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L69
            java.io.File r0 = new java.io.File
            java.lang.String r2 = r5.iconPath
            r0.<init>(r2)
            boolean r2 = r0.isFile()
            if (r2 == 0) goto L61
            android.widget.ImageView r2 = r5.imageInstanceIcon
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            r2.setImageURI(r0)
            goto L70
        L61:
            android.widget.ImageView r0 = r5.imageInstanceIcon
            int r2 = ca.dnamobile.javalauncher.R.mipmap.ic_launcher
            r0.setImageResource(r2)
            goto L70
        L69:
            android.widget.ImageView r0 = r5.imageInstanceIcon
            int r2 = ca.dnamobile.javalauncher.R.mipmap.ic_launcher
            r0.setImageResource(r2)
        L70:
            android.widget.TextView r0 = r5.textContentTitle
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2 = r5.selectedType
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r3 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODPACKS
            if (r2 != r3) goto L79
            goto L7f
        L79:
            int r1 = ca.dnamobile.javalauncher.R.string.content_browser_install_title
            java.lang.String r1 = r5.getString(r1)
        L7f:
            r0.setText(r1)
            r5.updateFilterChips()
            return
    }

    private void setupPagination() {
            r2 = this;
            com.google.android.material.button.MaterialButton r0 = r2.buttonPagePrevious
            r1 = 0
            r0.setFocusable(r1)
            com.google.android.material.button.MaterialButton r0 = r2.buttonPageNext
            r0.setFocusable(r1)
            com.google.android.material.button.MaterialButton r0 = r2.buttonPagePrevious
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda37 r1 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda37
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            com.google.android.material.button.MaterialButton r0 = r2.buttonPageNext
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda38 r1 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda38
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    private void setupRecycler() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.recyclerContentProjects
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r2.recyclerContentProjects
            r1 = 0
            r0.setNestedScrollingEnabled(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r2.recyclerContentProjects
            r0.setFocusable(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r2.recyclerContentProjects
            r0.setHasFixedSize(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r2.recyclerContentProjects
            ca.dnamobile.javalauncher.ContentBrowserActivity$ContentProjectAdapter r1 = r2.adapter
            r0.setAdapter(r1)
            return
    }

    private void setupSearch() {
            r2 = this;
            com.google.android.material.textfield.TextInputEditText r0 = r2.editSearch
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = r2.selectedType
            java.lang.String r1 = r2.getSearchHint(r1)
            r0.setHint(r1)
            com.google.android.material.textfield.TextInputEditText r0 = r2.editSearch
            r1 = 3
            r0.setImeOptions(r1)
            com.google.android.material.textfield.TextInputEditText r0 = r2.editSearch
            r1 = 1
            r0.setSingleLine(r1)
            r2.configureSearchClearButton()
            com.google.android.material.textfield.TextInputEditText r0 = r2.editSearch
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda25 r1 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda25
            r1.<init>(r2)
            r0.setOnEditorActionListener(r1)
            com.google.android.material.textfield.TextInputEditText r0 = r2.editSearch
            ca.dnamobile.javalauncher.ContentBrowserActivity$2 r1 = new ca.dnamobile.javalauncher.ContentBrowserActivity$2
            r1.<init>(r2)
            r0.addTextChangedListener(r1)
            return
    }

    private void setupSortDropdown() {
            r2 = this;
            r2.normalizeSortForSelectedType()
            r2.updateSortButtonLabel()
            com.google.android.material.button.MaterialButton r0 = r2.buttonSortContent
            if (r0 != 0) goto Lb
            return
        Lb:
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda30 r1 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda30
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    private void setupSourceToggle() {
            r2 = this;
            com.google.android.material.button.MaterialButtonToggleGroup r0 = r2.sourceToggleGroup
            int r1 = ca.dnamobile.javalauncher.R.id.buttonSourceModrinth
            r0.check(r1)
            com.google.android.material.button.MaterialButtonToggleGroup r0 = r2.sourceToggleGroup
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda18 r1 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda18
            r1.<init>(r2)
            r0.addOnButtonCheckedListener(r1)
            return
    }

    private void setupTabs() {
            r6 = this;
            com.google.android.material.tabs.TabLayout r0 = r6.tabContentTypes
            r0.removeAllTabs()
            java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModManagerContentType> r0 = r6.visibleTabTypes
            r0.clear()
            boolean r0 = r6.isBrowseModpacksOnlyMode()
            if (r0 == 0) goto L1c
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODPACKS
            r6.selectedType = r0
            java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModManagerContentType> r0 = r6.visibleTabTypes
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODPACKS
            r0.add(r1)
            goto L45
        L1c:
            java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModManagerContentType> r0 = r6.visibleTabTypes
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODS
            r0.add(r1)
            java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModManagerContentType> r0 = r6.visibleTabTypes
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.RESOURCEPACKS
            r0.add(r1)
            java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModManagerContentType> r0 = r6.visibleTabTypes
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.SHADERPACKS
            r0.add(r1)
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = r6.selectedType
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODPACKS
            if (r0 == r1) goto L41
            java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModManagerContentType> r0 = r6.visibleTabTypes
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = r6.selectedType
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L45
        L41:
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODS
            r6.selectedType = r0
        L45:
            r0 = 0
            r1 = r0
        L47:
            java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModManagerContentType> r2 = r6.visibleTabTypes
            int r2 = r2.size()
            if (r0 >= r2) goto L70
            java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModManagerContentType> r2 = r6.visibleTabTypes
            java.lang.Object r2 = r2.get(r0)
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2 = (ca.dnamobile.javalauncher.modmanager.ModManagerContentType) r2
            com.google.android.material.tabs.TabLayout r3 = r6.tabContentTypes
            com.google.android.material.tabs.TabLayout$Tab r4 = r3.newTab()
            java.lang.String r5 = r6.getTabTitle(r2)
            com.google.android.material.tabs.TabLayout$Tab r4 = r4.setText(r5)
            r3.addTab(r4)
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r3 = r6.selectedType
            if (r2 != r3) goto L6d
            r1 = r0
        L6d:
            int r0 = r0 + 1
            goto L47
        L70:
            com.google.android.material.tabs.TabLayout r0 = r6.tabContentTypes
            com.google.android.material.tabs.TabLayout$Tab r0 = r0.getTabAt(r1)
            if (r0 == 0) goto L7b
            r0.select()
        L7b:
            com.google.android.material.tabs.TabLayout r0 = r6.tabContentTypes
            ca.dnamobile.javalauncher.ContentBrowserActivity$1 r1 = new ca.dnamobile.javalauncher.ContentBrowserActivity$1
            r1.<init>(r6)
            r0.addOnTabSelectedListener(r1)
            return
    }

    private void showMinecraftVersionFilterDialog() {
            r3 = this;
            java.util.ArrayList<java.lang.String> r0 = r3.cachedReleaseMinecraftVersions
            if (r0 == 0) goto L10
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L10
            java.util.ArrayList<java.lang.String> r0 = r3.cachedReleaseMinecraftVersions
            r3.showMinecraftVersionFilterDialog(r0)
            return
        L10:
            r3.showMinecraftVersionLoadingDialog()
            java.lang.Thread r0 = new java.lang.Thread
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda3 r1 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda3
            r1.<init>(r3)
            java.lang.String r2 = "LoadMinecraftReleaseVersions"
            r0.<init>(r1, r2)
            r0.start()
            return
    }

    private void showMinecraftVersionFilterDialog(java.util.ArrayList<java.lang.String> r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "All Minecraft versions"
            r0.add(r1)
            java.util.Iterator r5 = r5.iterator()
        Le:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L1f
            java.lang.String r1 = ""
            goto L23
        L1f:
            java.lang.String r1 = r1.trim()
        L23:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto Le
            boolean r2 = r4.isSnapshotMinecraftVersion(r1)
            if (r2 != 0) goto Le
            boolean r2 = r4.containsIgnoreCase(r0, r1)
            if (r2 == 0) goto L36
            goto Le
        L36:
            r0.add(r1)
            goto Le
        L3a:
            int r5 = r0.size()
            r1 = 1
            if (r5 != r1) goto L4b
            java.lang.String r5 = "No release Minecraft versions were found."
            android.widget.Toast r5 = android.widget.Toast.makeText(r4, r5, r1)
            r5.show()
            return
        L4b:
            java.lang.String r5 = r4.selectedModpackMinecraftVersionFilter
            java.lang.String r5 = r5.trim()
            boolean r5 = r5.isEmpty()
            r2 = 0
            if (r5 != 0) goto L74
        L58:
            int r5 = r0.size()
            if (r1 >= r5) goto L74
            java.lang.Object r5 = r0.get(r1)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r3 = r4.selectedModpackMinecraftVersionFilter
            java.lang.String r3 = r3.trim()
            boolean r5 = r5.equalsIgnoreCase(r3)
            if (r5 == 0) goto L71
            goto L75
        L71:
            int r1 = r1 + 1
            goto L58
        L74:
            r1 = r2
        L75:
            java.lang.String[] r5 = new java.lang.String[r2]
            java.lang.Object[] r5 = r0.toArray(r5)
            java.lang.String[] r5 = (java.lang.String[]) r5
            androidx.appcompat.app.AlertDialog$Builder r2 = new androidx.appcompat.app.AlertDialog$Builder
            r2.<init>(r4)
            java.lang.String r3 = "Minecraft Version"
            androidx.appcompat.app.AlertDialog$Builder r2 = r2.setTitle(r3)
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda26 r3 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda26
            r3.<init>(r4, r0)
            androidx.appcompat.app.AlertDialog$Builder r5 = r2.setSingleChoiceItems(r5, r1, r3)
            r0 = 17039360(0x1040000, float:2.424457E-38)
            r1 = 0
            androidx.appcompat.app.AlertDialog$Builder r5 = r5.setNegativeButton(r0, r1)
            r5.show()
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r4)
            return
    }

    private void showMinecraftVersionLoadingDialog() {
            r2 = this;
            r2.dismissMinecraftVersionLoadingDialog()
            androidx.appcompat.app.AlertDialog$Builder r0 = new androidx.appcompat.app.AlertDialog$Builder
            r0.<init>(r2)
            java.lang.String r1 = "Loading Minecraft Versions"
            androidx.appcompat.app.AlertDialog$Builder r0 = r0.setTitle(r1)
            java.lang.String r1 = "Fetching release versions..."
            androidx.appcompat.app.AlertDialog$Builder r0 = r0.setMessage(r1)
            r1 = 1
            androidx.appcompat.app.AlertDialog$Builder r0 = r0.setCancelable(r1)
            androidx.appcompat.app.AlertDialog r0 = r0.create()
            r2.minecraftVersionLoadingDialog = r0
            r0.show()
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r2)
            return
    }

    private void showMinecraftVersionPickerDialog(ca.dnamobile.javalauncher.modmanager.ModrinthProject r7, java.util.LinkedHashMap<java.lang.String, java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice>> r8) {
            r6 = this;
            java.lang.String r0 = "Pick Minecraft Version"
            java.lang.String r1 = "Choose the Minecraft version first. The next screen will show every pack version available for that Minecraft version."
            android.widget.LinearLayout r0 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.createDialogRoot(r6, r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Set r2 = r8.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L15:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L36
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            ca.dnamobile.javalauncher.ContentBrowserActivity$ModpackMinecraftVersionGroup r4 = new ca.dnamobile.javalauncher.ContentBrowserActivity$ModpackMinecraftVersionGroup
            java.lang.Object r5 = r3.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r3 = r3.getValue()
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r4.<init>(r5, r3)
            r1.add(r4)
            goto L15
        L36:
            androidx.recyclerview.widget.RecyclerView r2 = new androidx.recyclerview.widget.RecyclerView
            r2.<init>(r6)
            androidx.recyclerview.widget.LinearLayoutManager r3 = new androidx.recyclerview.widget.LinearLayoutManager
            r3.<init>(r6)
            r2.setLayoutManager(r3)
            r3 = 0
            r2.setNestedScrollingEnabled(r3)
            r2.setClipToPadding(r3)
            r4 = 8
            int r4 = r6.dp(r4)
            r5 = 12
            int r5 = r6.dp(r5)
            r2.setPadding(r3, r4, r3, r5)
            ca.dnamobile.javalauncher.ContentBrowserActivity$ModpackMinecraftVersionDialogAdapter r3 = new ca.dnamobile.javalauncher.ContentBrowserActivity$ModpackMinecraftVersionDialogAdapter
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda27 r4 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda27
            r4.<init>(r6, r7, r8)
            r3.<init>(r6, r1, r4)
            r2.setAdapter(r3)
            android.content.res.Resources r7 = r6.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            int r7 = r7.heightPixels
            r8 = 240(0xf0, float:3.36E-43)
            int r8 = r6.dp(r8)
            r1 = 300(0x12c, float:4.2E-43)
            int r1 = r6.dp(r1)
            int r7 = r7 - r1
            int r7 = java.lang.Math.max(r8, r7)
            r8 = 460(0x1cc, float:6.45E-43)
            int r8 = r6.dp(r8)
            int r7 = java.lang.Math.min(r7, r8)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r1 = -1
            r8.<init>(r1, r7)
            r7 = 4
            int r7 = r6.dp(r7)
            r8.topMargin = r7
            r0.addView(r2, r8)
            androidx.appcompat.app.AlertDialog$Builder r7 = new androidx.appcompat.app.AlertDialog$Builder
            r7.<init>(r6)
            androidx.appcompat.app.AlertDialog$Builder r7 = r7.setView(r0)
            r8 = 17039360(0x1040000, float:2.424457E-38)
            r0 = 0
            androidx.appcompat.app.AlertDialog$Builder r7 = r7.setNegativeButton(r8, r0)
            androidx.appcompat.app.AlertDialog r7 = r7.create()
            r6.currentModpackVersionDialog = r7
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda28 r8 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda28
            r8.<init>(r6, r7)
            r7.setOnDismissListener(r8)
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda29 r8 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda29
            r8.<init>(r6, r7)
            r7.setOnShowListener(r8)
            r7.show()
            ca.dnamobile.javalauncher.ui.LauncherDialogStyle.styleDialogChrome(r6, r7)
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r6)
            return
    }

    private void showModpackInstallDialog(java.lang.String r2) {
            r1 = this;
            r1.dismissModpackInstallDialog()
            ca.dnamobile.javalauncher.ui.ModpackInstallProgressDialog r0 = new ca.dnamobile.javalauncher.ui.ModpackInstallProgressDialog
            r0.<init>(r1)
            r1.modpackInstallDialog = r0
            r0.show(r2)
            return
    }

    private void showModpackVersionLoadingDialog(java.lang.String r4) {
            r3 = this;
            r3.dismissModpackVersionLoadingDialog()
            androidx.appcompat.app.AlertDialog$Builder r0 = new androidx.appcompat.app.AlertDialog$Builder
            r0.<init>(r3)
            java.lang.String r1 = "Loading Versions"
            androidx.appcompat.app.AlertDialog$Builder r0 = r0.setTitle(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fetching available versions for "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = "..."
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            androidx.appcompat.app.AlertDialog$Builder r4 = r0.setMessage(r4)
            r0 = 1
            androidx.appcompat.app.AlertDialog$Builder r4 = r4.setCancelable(r0)
            androidx.appcompat.app.AlertDialog r4 = r4.create()
            r3.modpackVersionLoadingDialog = r4
            r4.show()
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r3)
            return
    }

    private void showModpackVersionPicker(ca.dnamobile.javalauncher.modmanager.ModrinthProject r4) {
            r3 = this;
            java.lang.String r0 = r4.title
            r3.showModpackVersionLoadingDialog(r0)
            java.lang.Thread r0 = new java.lang.Thread
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda33 r1 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda33
            r1.<init>(r3, r4)
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r4 = r4.source
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r2 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.CURSEFORGE
            if (r4 != r2) goto L15
            java.lang.String r4 = "CurseForgeModpackVersions"
            goto L17
        L15:
            java.lang.String r4 = "ModrinthModpackVersions"
        L17:
            r0.<init>(r1, r4)
            r0.start()
            return
    }

    private void showModpackVersionSelectionDialog(ca.dnamobile.javalauncher.modmanager.ModrinthProject r2, java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice> r3) {
            r1 = this;
            java.util.LinkedHashMap r3 = r1.groupModpackVersionsByMinecraftVersion(r3)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L2a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "No installable modpack versions were found for "
            r3.<init>(r0)
            java.lang.String r2 = r2.title
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r3 = "."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 1
            android.widget.Toast r2 = android.widget.Toast.makeText(r1, r2, r3)
            r2.show()
            return
        L2a:
            r1.showMinecraftVersionPickerDialog(r2, r3)
            return
    }

    private void showModpackVersionsForMinecraftDialog(ca.dnamobile.javalauncher.modmanager.ModrinthProject r5, java.util.LinkedHashMap<java.lang.String, java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice>> r6, java.lang.String r7, java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice> r8) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            r4.sortModpackVersionsNewestFirst(r0)
            java.lang.String r7 = r4.formatMinecraftVersionTitle(r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "Choose which "
            r8.<init>(r1)
            java.lang.String r1 = r5.title
            java.lang.StringBuilder r8 = r8.append(r1)
            java.lang.String r1 = " version to install. Newest pack versions are listed first."
            java.lang.StringBuilder r8 = r8.append(r1)
            java.lang.String r8 = r8.toString()
            android.widget.LinearLayout r7 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.createDialogRoot(r4, r7, r8)
            androidx.recyclerview.widget.RecyclerView r8 = new androidx.recyclerview.widget.RecyclerView
            r8.<init>(r4)
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            r1.<init>(r4)
            r8.setLayoutManager(r1)
            r1 = 0
            r8.setNestedScrollingEnabled(r1)
            r8.setClipToPadding(r1)
            r2 = 8
            int r2 = r4.dp(r2)
            r3 = 12
            int r3 = r4.dp(r3)
            r8.setPadding(r1, r2, r1, r3)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L53:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L67
            java.lang.Object r2 = r0.next()
            ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$ModpackVersionChoice r2 = (ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice) r2
            ca.dnamobile.javalauncher.ContentBrowserActivity$ModpackVersionDialogRow r2 = ca.dnamobile.javalauncher.ContentBrowserActivity.ModpackVersionDialogRow.version(r2)
            r1.add(r2)
            goto L53
        L67:
            ca.dnamobile.javalauncher.ContentBrowserActivity$ModpackVersionDialogAdapter r0 = new ca.dnamobile.javalauncher.ContentBrowserActivity$ModpackVersionDialogAdapter
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda4 r2 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda4
            r2.<init>(r4, r5)
            r0.<init>(r4, r1, r2)
            r8.setAdapter(r0)
            android.content.res.Resources r0 = r4.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.heightPixels
            r1 = 260(0x104, float:3.64E-43)
            int r1 = r4.dp(r1)
            r2 = 300(0x12c, float:4.2E-43)
            int r2 = r4.dp(r2)
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r1, r0)
            r1 = 540(0x21c, float:7.57E-43)
            int r1 = r4.dp(r1)
            int r0 = java.lang.Math.min(r0, r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = -1
            r1.<init>(r2, r0)
            r0 = 4
            int r0 = r4.dp(r0)
            r1.topMargin = r0
            r7.addView(r8, r1)
            androidx.appcompat.app.AlertDialog$Builder r8 = new androidx.appcompat.app.AlertDialog$Builder
            r8.<init>(r4)
            androidx.appcompat.app.AlertDialog$Builder r7 = r8.setView(r7)
            r8 = 17039360(0x1040000, float:2.424457E-38)
            r0 = 0
            androidx.appcompat.app.AlertDialog$Builder r7 = r7.setNegativeButton(r8, r0)
            java.lang.String r8 = "Minecraft Versions"
            androidx.appcompat.app.AlertDialog$Builder r7 = r7.setNeutralButton(r8, r0)
            androidx.appcompat.app.AlertDialog r7 = r7.create()
            r4.currentModpackVersionDialog = r7
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda5 r8 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda5
            r8.<init>(r4, r7)
            r7.setOnDismissListener(r8)
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda6 r8 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda6
            r8.<init>(r4, r7)
            r7.setOnShowListener(r8)
            r7.show()
            ca.dnamobile.javalauncher.ui.LauncherDialogStyle.styleDialogChrome(r4, r7)
            r8 = -3
            android.widget.Button r8 = r7.getButton(r8)
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda7 r0 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda7
            r0.<init>(r4, r7, r5, r6)
            r8.setOnClickListener(r0)
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r4)
            return
    }

    private void showProjectMenu(android.view.View r6, ca.dnamobile.javalauncher.modmanager.ModrinthProject r7) {
            r5 = this;
            androidx.appcompat.widget.PopupMenu r0 = new androidx.appcompat.widget.PopupMenu
            r0.<init>(r5, r6)
            android.view.Menu r6 = r0.getMenu()
            int r1 = ca.dnamobile.javalauncher.R.string.content_browser_install
            r2 = 0
            r3 = 1
            r6.add(r2, r3, r2, r1)
            android.view.Menu r6 = r0.getMenu()
            java.lang.String r1 = "View Details"
            r4 = 2
            r6.add(r2, r4, r3, r1)
            android.view.Menu r6 = r0.getMenu()
            r1 = 3
            int r3 = ca.dnamobile.javalauncher.R.string.content_browser_open_website
            r6.add(r2, r1, r4, r3)
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda24 r6 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda24
            r6.<init>(r5, r7)
            r0.setOnMenuItemClickListener(r6)
            r0.show()
            return
    }

    private void showSortDialog() {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort[] r1 = ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort.values()
            int r2 = r1.length
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L1e
            r5 = r1[r4]
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r6 = r7.selectedType
            boolean r6 = r5.isAvailableFor(r6)
            if (r6 == 0) goto L1b
            r0.add(r5)
        L1b:
            int r4 = r4 + 1
            goto Lc
        L1e:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L25
            return
        L25:
            int r1 = r0.size()
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = r3
        L2c:
            int r4 = r0.size()
            if (r3 >= r4) goto L44
            java.lang.Object r4 = r0.get(r3)
            ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort r4 = (ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort) r4
            java.lang.String r5 = r4.label
            r1[r3] = r5
            ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort r5 = r7.selectedSort
            if (r4 != r5) goto L41
            r2 = r3
        L41:
            int r3 = r3 + 1
            goto L2c
        L44:
            androidx.appcompat.app.AlertDialog$Builder r3 = new androidx.appcompat.app.AlertDialog$Builder
            r3.<init>(r7)
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r4 = r7.selectedType
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r5 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODPACKS
            if (r4 != r5) goto L52
            java.lang.String r4 = "Sort Modpacks"
            goto L54
        L52:
            java.lang.String r4 = "Sort Content"
        L54:
            androidx.appcompat.app.AlertDialog$Builder r3 = r3.setTitle(r4)
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda23 r4 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda23
            r4.<init>(r7, r0)
            androidx.appcompat.app.AlertDialog$Builder r0 = r3.setSingleChoiceItems(r1, r2, r4)
            r1 = 17039360(0x1040000, float:2.424457E-38)
            r2 = 0
            androidx.appcompat.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            r0.show()
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r7)
            return
    }

    private void sortModpackVersionsNewestFirst(java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice> r2) {
            r1 = this;
            ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda8 r0 = new ca.dnamobile.javalauncher.ContentBrowserActivity$$ExternalSyntheticLambda8
            r0.<init>(r1)
            java.util.Collections.sort(r2, r0)
            return
    }

    private void updateFilterChips() {
            r5 = this;
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = r5.selectedType
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODPACKS
            r2 = 0
            java.lang.String r3 = "Modpacks"
            r4 = 8
            if (r0 != r1) goto L33
            ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort r0 = r5.selectedSort
            ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort r1 = ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort.VERSIONS
            if (r0 != r1) goto L33
            java.lang.String r0 = r5.selectedModpackMinecraftVersionFilter
            java.lang.String r0 = r0.trim()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L23
            android.widget.TextView r0 = r5.textVersionChip
            r0.setVisibility(r4)
            goto L2d
        L23:
            android.widget.TextView r1 = r5.textVersionChip
            r1.setVisibility(r2)
            android.widget.TextView r1 = r5.textVersionChip
            r1.setText(r0)
        L2d:
            android.widget.TextView r0 = r5.textLoaderChip
            r0.setText(r3)
            return
        L33:
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = r5.selectedType
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODPACKS
            if (r0 != r1) goto L4a
            boolean r0 = r5.isBrowseModpacksOnlyMode()
            if (r0 == 0) goto L4a
            android.widget.TextView r0 = r5.textVersionChip
            r0.setVisibility(r4)
            android.widget.TextView r0 = r5.textLoaderChip
            r0.setText(r3)
            return
        L4a:
            java.lang.String r0 = r5.gameVersionId
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L58
            android.widget.TextView r0 = r5.textVersionChip
            r0.setVisibility(r4)
            goto L64
        L58:
            android.widget.TextView r0 = r5.textVersionChip
            r0.setVisibility(r2)
            android.widget.TextView r0 = r5.textVersionChip
            java.lang.String r1 = r5.gameVersionId
            r0.setText(r1)
        L64:
            android.widget.TextView r0 = r5.textLoaderChip
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = r5.selectedType
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODPACKS
            if (r1 != r2) goto L6d
            goto L73
        L6d:
            java.lang.String r1 = r5.loader
            java.lang.String r3 = r5.displayLoader(r1)
        L73:
            r0.setText(r3)
            return
    }

    private void updateModpackInstallDialog(java.lang.String r2, int r3, int r4) {
            r1 = this;
            ca.dnamobile.javalauncher.ui.ModpackInstallProgressDialog r0 = r1.modpackInstallDialog
            if (r0 != 0) goto L5
            return
        L5:
            if (r2 == 0) goto La
            r0.setStatus(r2)
        La:
            ca.dnamobile.javalauncher.ui.ModpackInstallProgressDialog r2 = r1.modpackInstallDialog
            r2.setProgress(r3, r4)
            return
    }

    private void updatePaginationControls() {
            r5 = this;
            int r0 = r5.totalHits
            int r0 = r5.getTotalPages(r0)
            com.google.android.material.button.MaterialButton r1 = r5.buttonPagePrevious
            int r2 = r5.currentPage
            r3 = 0
            r4 = 1
            if (r2 <= 0) goto L10
            r2 = r4
            goto L11
        L10:
            r2 = r3
        L11:
            r1.setEnabled(r2)
            com.google.android.material.button.MaterialButton r1 = r5.buttonPageNext
            int r2 = r5.currentPage
            int r2 = r2 + r4
            if (r2 >= r0) goto L1c
            r3 = r4
        L1c:
            r1.setEnabled(r3)
            android.widget.TextView r1 = r5.textPageIndicator
            int r2 = ca.dnamobile.javalauncher.R.string.content_browser_page_indicator
            int r3 = r5.currentPage
            int r3 = r3 + r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0}
            java.lang.String r0 = r5.getString(r2, r0)
            r1.setText(r0)
            return
    }

    private void updateResultSummary() {
            r5 = this;
            android.widget.TextView r0 = r5.textResultSummary
            int r1 = ca.dnamobile.javalauncher.R.string.content_browser_result_summary
            int r2 = r5.totalHits
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r3 = r5.selectedType
            java.lang.String r3 = r5.getPluralLabel(r3)
            java.lang.String r4 = r5.getSelectedSourceLabel()
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4}
            java.lang.String r1 = r5.getString(r1, r2)
            r0.setText(r1)
            return
    }

    private void updateSearchClearButtonVisibility() {
            r3 = this;
            com.google.android.material.textfield.TextInputEditText r0 = r3.editSearch
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r3.hasSearchText()
            r1 = 0
            if (r0 == 0) goto Lf
            android.graphics.drawable.Drawable r0 = r3.searchClearDrawable
            goto L10
        Lf:
            r0 = r1
        L10:
            com.google.android.material.textfield.TextInputEditText r2 = r3.editSearch
            r2.setCompoundDrawablesRelative(r1, r1, r0, r1)
            return
    }

    private void updateSortButtonLabel() {
            r4 = this;
            com.google.android.material.button.MaterialButton r0 = r4.buttonSortContent
            if (r0 != 0) goto L5
            return
        L5:
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = r4.selectedType
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODPACKS
            if (r0 != r1) goto L35
            ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort r0 = r4.selectedSort
            ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort r1 = ca.dnamobile.javalauncher.ContentBrowserActivity.ContentSort.VERSIONS
            if (r0 != r1) goto L35
            java.lang.String r0 = r4.selectedModpackMinecraftVersionFilter
            java.lang.String r0 = r0.trim()
            com.google.android.material.button.MaterialButton r1 = r4.buttonSortContent
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L22
            java.lang.String r0 = "Versions: All"
            goto L31
        L22:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Versions: "
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
        L31:
            r1.setText(r0)
            return
        L35:
            com.google.android.material.button.MaterialButton r0 = r4.buttonSortContent
            ca.dnamobile.javalauncher.ContentBrowserActivity$ContentSort r1 = r4.selectedSort
            java.lang.String r1 = r1.label
            r0.setText(r1)
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r0)
            int r1 = ca.dnamobile.javalauncher.R.layout.activity_content_browser
            r0.setContentView(r1)
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r0)
            r0.readExtras()
            r0.bindViews()
            r0.setupHeader()
            r0.setupSourceToggle()
            r0.setupTabs()
            r0.setupSearch()
            r0.setupSortDropdown()
            r0.setupRecycler()
            r0.setupPagination()
            r0.prepareTopFocus()
            r1 = 1
            r0.loadContent(r1)
            r0.forceScrollTop()
            return
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
            r1 = this;
            r1.clearPendingSearch()
            r1.dismissModpackVersionLoadingDialog()
            r1.dismissMinecraftVersionLoadingDialog()
            androidx.appcompat.app.AlertDialog r0 = r1.currentModpackVersionDialog
            if (r0 == 0) goto L13
            r0.dismiss()
            r0 = 0
            r1.currentModpackVersionDialog = r0
        L13:
            r1.dismissModpackInstallDialog()
            super.onDestroy()
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
            r1 = this;
            super.onResume()
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r1)
            r1.pruneInstalledManifestForCurrentTab()
            ca.dnamobile.javalauncher.ContentBrowserActivity$ContentProjectAdapter r0 = r1.adapter
            r0.notifyDataSetChanged()
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
