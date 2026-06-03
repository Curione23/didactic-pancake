package ca.dnamobile.javalauncher;

/* JADX INFO: loaded from: classes.dex */
public final class ContentProjectDetailsActivity extends androidx.appcompat.app.AppCompatActivity {
    private static final int TAB_DESCRIPTION = 0;
    private static final int TAB_GALLERY = 2;
    private static final int TAB_VERSIONS = 1;
    private static final java.lang.String VERSION_FILTER_ALL = "All Minecraft versions";
    private static final java.lang.String VERSION_FILTER_UNKNOWN = "Unknown Minecraft version";
    private static final int VERSION_PAGE_SIZE = 10;
    private final ca.dnamobile.javalauncher.ContentProjectDetailsActivity.VersionAdapter adapter;
    private final java.util.ArrayList<ca.dnamobile.javalauncher.ContentProjectDetailsActivity.VersionRow> allVersionRows;
    private java.lang.String baseVersionId;
    private com.google.android.material.button.MaterialButton buttonBack;
    private com.google.android.material.button.MaterialButton buttonOpenWebsite;
    private com.google.android.material.button.MaterialButton buttonVersionMinecraft;
    private com.google.android.material.button.MaterialButton buttonVersionPageNext;
    private com.google.android.material.button.MaterialButton buttonVersionPagePrevious;
    private ca.dnamobile.javalauncher.modmanager.ModManagerContentType contentType;
    private final java.util.ArrayList<ca.dnamobile.javalauncher.ContentProjectDetailsActivity.VersionRow> filteredVersionRows;
    private final ca.dnamobile.javalauncher.ContentProjectDetailsActivity.GalleryAdapter galleryAdapter;
    private java.lang.String gameDirectoryPath;
    private java.lang.String gameVersionId;
    private android.widget.ImageView imageDescriptionMain;
    private android.widget.ImageView imageProjectIcon;
    private java.lang.String instanceId;
    private java.lang.String instanceName;
    private java.lang.String loader;
    private ca.dnamobile.javalauncher.ui.ModpackInstallProgressDialog modpackInstallDialog;
    private ca.dnamobile.javalauncher.modmanager.ModrinthProject project;
    private java.lang.String projectId;
    private java.lang.String projectSlug;
    private androidx.recyclerview.widget.RecyclerView recyclerGallery;
    private androidx.recyclerview.widget.RecyclerView recyclerVersions;
    private android.view.View sectionDescription;
    private android.view.View sectionGallery;
    private android.view.View sectionVersions;
    private java.lang.String selectedMinecraftVersionFilter;
    private ca.dnamobile.javalauncher.modmanager.ModManagerSource source;
    private com.google.android.material.tabs.TabLayout tabSections;
    private android.widget.TextView textDescription;
    private android.widget.TextView textGallery;
    private android.widget.TextView textMeta;
    private android.widget.TextView textStatus;
    private android.widget.TextView textTitle;
    private android.widget.TextView textVersionFilterSummary;
    private android.widget.TextView textVersionPageIndicator;
    private int versionCurrentPage;
    private final java.util.ArrayList<java.lang.String> versionMinecraftFilters;


    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.ContentProjectDetailsActivity$2, reason: invalid class name */
    class AnonymousClass2 implements ca.dnamobile.javalauncher.modmanager.ModrinthInstallManager.Listener {
        final /* synthetic */ ca.dnamobile.javalauncher.ContentProjectDetailsActivity this$0;

        /* JADX INFO: renamed from: $r8$lambda$8ZuP9hZNgXAMScueD-KApNK7YWM, reason: not valid java name */
        public static /* synthetic */ void m144$r8$lambda$8ZuP9hZNgXAMScueDKApNK7YWM(ca.dnamobile.javalauncher.ContentProjectDetailsActivity.AnonymousClass2 r0, java.lang.String r1) {
                r0.lambda$onComplete$1(r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$WD_nFFdsK7kVz4UEV5bfUuTeDIk(ca.dnamobile.javalauncher.ContentProjectDetailsActivity.AnonymousClass2 r0, java.lang.Throwable r1) {
                r0.lambda$onError$2(r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$sANberpXkRiwiknzCkoAHiVryLM(ca.dnamobile.javalauncher.ContentProjectDetailsActivity.AnonymousClass2 r0, java.lang.String r1) {
                r0.lambda$onStatus$0(r1)
                return
        }

        AnonymousClass2(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        private /* synthetic */ void lambda$onComplete$1(java.lang.String r3) {
                r2 = this;
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0 = r2.this$0
                android.widget.TextView r0 = ca.dnamobile.javalauncher.ContentProjectDetailsActivity.m129$$Nest$fgettextStatus(r0)
                r0.setText(r3)
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0 = r2.this$0
                r1 = 1
                android.widget.Toast r3 = android.widget.Toast.makeText(r0, r3, r1)
                r3.show()
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r3 = r2.this$0
                r0 = -1
                r3.setResult(r0)
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
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0 = r4.this$0
                android.widget.TextView r0 = ca.dnamobile.javalauncher.ContentProjectDetailsActivity.m129$$Nest$fgettextStatus(r0)
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r1 = r4.this$0
                int r2 = ca.dnamobile.javalauncher.R.string.content_browser_install_failed
                java.lang.Object[] r3 = new java.lang.Object[]{r5}
                java.lang.String r1 = r1.getString(r2, r3)
                r0.setText(r1)
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0 = r4.this$0
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
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0 = r1.this$0
                android.widget.TextView r0 = ca.dnamobile.javalauncher.ContentProjectDetailsActivity.m129$$Nest$fgettextStatus(r0)
                r0.setText(r2)
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModrinthInstallManager.Listener
        public void onComplete(java.lang.String r3) {
                r2 = this;
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity$2$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$2$$ExternalSyntheticLambda0
                r1.<init>(r2, r3)
                r0.runOnUiThread(r1)
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModrinthInstallManager.Listener
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity$2$$ExternalSyntheticLambda1 r1 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$2$$ExternalSyntheticLambda1
                r1.<init>(r2, r3)
                r0.runOnUiThread(r1)
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModrinthInstallManager.Listener
        public void onStatus(java.lang.String r3) {
                r2 = this;
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity$2$$ExternalSyntheticLambda2 r1 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$2$$ExternalSyntheticLambda2
                r1.<init>(r2, r3)
                r0.runOnUiThread(r1)
                return
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.ContentProjectDetailsActivity$3, reason: invalid class name */
    class AnonymousClass3 implements ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener {
        final /* synthetic */ ca.dnamobile.javalauncher.ContentProjectDetailsActivity this$0;

        public static /* synthetic */ void $r8$lambda$MqOAWfVHfMhSpEit2TAaaQTREj0(ca.dnamobile.javalauncher.ContentProjectDetailsActivity.AnonymousClass3 r0, java.lang.String r1, ca.dnamobile.javalauncher.instance.LauncherInstance r2) {
                r0.lambda$onComplete$2(r1, r2)
                return
        }

        public static /* synthetic */ void $r8$lambda$bAlZ2HomHQDYnFWBzkLweBRqFZM(ca.dnamobile.javalauncher.ContentProjectDetailsActivity.AnonymousClass3 r0, int r1, int r2) {
                r0.lambda$onProgress$1(r1, r2)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$lpQmEG5-B0EsT5ciKQ0Bno0OilU, reason: not valid java name */
        public static /* synthetic */ void m145$r8$lambda$lpQmEG5B0EsT5ciKQ0Bno0OilU(ca.dnamobile.javalauncher.ContentProjectDetailsActivity.AnonymousClass3 r0, java.lang.Throwable r1) {
                r0.lambda$onError$3(r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$nNRcFKNQB7TtL5mx1dzl_TflTUY(ca.dnamobile.javalauncher.ContentProjectDetailsActivity.AnonymousClass3 r0, java.lang.String r1) {
                r0.lambda$onStatus$0(r1)
                return
        }

        AnonymousClass3(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        private /* synthetic */ void lambda$onComplete$2(java.lang.String r3, ca.dnamobile.javalauncher.instance.LauncherInstance r4) {
                r2 = this;
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity.m131$$Nest$mdismissModpackInstallDialog(r0)
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0 = r2.this$0
                android.widget.TextView r0 = ca.dnamobile.javalauncher.ContentProjectDetailsActivity.m129$$Nest$fgettextStatus(r0)
                r0.setText(r3)
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0 = r2.this$0
                r1 = 1
                android.widget.Toast r3 = android.widget.Toast.makeText(r0, r3, r1)
                r3.show()
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r3 = r2.this$0
                r0 = -1
                r3.setResult(r0)
                if (r4 == 0) goto L30
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r3 = r2.this$0
                android.content.Intent r3 = ca.dnamobile.javalauncher.InstanceDetailsActivity.createIntent(r3, r4)
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r4 = r2.this$0
                r4.startActivity(r3)
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r3 = r2.this$0
                r3.finish()
            L30:
                return
        }

        private /* synthetic */ void lambda$onError$3(java.lang.Throwable r5) {
                r4 = this;
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0 = r4.this$0
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity.m131$$Nest$mdismissModpackInstallDialog(r0)
                java.lang.String r0 = r5.getMessage()
                if (r0 == 0) goto L10
                java.lang.String r5 = r5.getMessage()
                goto L18
            L10:
                java.lang.Class r5 = r5.getClass()
                java.lang.String r5 = r5.getSimpleName()
            L18:
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0 = r4.this$0
                android.widget.TextView r0 = ca.dnamobile.javalauncher.ContentProjectDetailsActivity.m129$$Nest$fgettextStatus(r0)
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r1 = r4.this$0
                int r2 = ca.dnamobile.javalauncher.R.string.content_browser_install_failed
                java.lang.Object[] r3 = new java.lang.Object[]{r5}
                java.lang.String r1 = r1.getString(r2, r3)
                r0.setText(r1)
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0 = r4.this$0
                int r1 = ca.dnamobile.javalauncher.R.string.content_browser_install_failed
                java.lang.Object[] r5 = new java.lang.Object[]{r5}
                java.lang.String r5 = r0.getString(r1, r5)
                r1 = 1
                android.widget.Toast r5 = android.widget.Toast.makeText(r0, r5, r1)
                r5.show()
                return
        }

        private /* synthetic */ void lambda$onProgress$1(int r4, int r5) {
                r3 = this;
                if (r4 <= 0) goto L29
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0 = r3.this$0
                android.widget.TextView r0 = ca.dnamobile.javalauncher.ContentProjectDetailsActivity.m129$$Nest$fgettextStatus(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Installing "
                r1.<init>(r2)
                r2 = 0
                int r2 = java.lang.Math.max(r2, r5)
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = " / "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r1 = r1.append(r4)
                java.lang.String r1 = r1.toString()
                r0.setText(r1)
            L29:
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0 = r3.this$0
                r1 = 0
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity.m143$$Nest$mupdateModpackInstallDialog(r0, r1, r5, r4)
                return
        }

        private /* synthetic */ void lambda$onStatus$0(java.lang.String r3) {
                r2 = this;
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0 = r2.this$0
                android.widget.TextView r0 = ca.dnamobile.javalauncher.ContentProjectDetailsActivity.m129$$Nest$fgettextStatus(r0)
                r0.setText(r3)
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0 = r2.this$0
                r1 = -1
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity.m143$$Nest$mupdateModpackInstallDialog(r0, r3, r1, r1)
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
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity$3$$ExternalSyntheticLambda2 r1 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$3$$ExternalSyntheticLambda2
                r1.<init>(r2, r3, r4)
                r0.runOnUiThread(r1)
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity$3$$ExternalSyntheticLambda3 r1 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$3$$ExternalSyntheticLambda3
                r1.<init>(r2, r3)
                r0.runOnUiThread(r1)
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener
        public void onProgress(int r3, int r4) {
                r2 = this;
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity$3$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$3$$ExternalSyntheticLambda0
                r1.<init>(r2, r4, r3)
                r0.runOnUiThread(r1)
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener
        public void onStatus(java.lang.String r3) {
                r2 = this;
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity$3$$ExternalSyntheticLambda1 r1 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$3$$ExternalSyntheticLambda1
                r1.<init>(r2, r3)
                r0.runOnUiThread(r1)
                return
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.ContentProjectDetailsActivity$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$ca$dnamobile$javalauncher$modmanager$ModManagerContentType = null;

        static {
                ca.dnamobile.javalauncher.modmanager.ModManagerContentType[] r0 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity.AnonymousClass4.$SwitchMap$ca$dnamobile$javalauncher$modmanager$ModManagerContentType = r0
                ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODPACKS     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = ca.dnamobile.javalauncher.ContentProjectDetailsActivity.AnonymousClass4.$SwitchMap$ca$dnamobile$javalauncher$modmanager$ModManagerContentType     // Catch: java.lang.NoSuchFieldError -> L1d
                ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.RESOURCEPACKS     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = ca.dnamobile.javalauncher.ContentProjectDetailsActivity.AnonymousClass4.$SwitchMap$ca$dnamobile$javalauncher$modmanager$ModManagerContentType     // Catch: java.lang.NoSuchFieldError -> L28
                ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.SHADERPACKS     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = ca.dnamobile.javalauncher.ContentProjectDetailsActivity.AnonymousClass4.$SwitchMap$ca$dnamobile$javalauncher$modmanager$ModManagerContentType     // Catch: java.lang.NoSuchFieldError -> L33
                ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODS     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    private final class GalleryAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<ca.dnamobile.javalauncher.ContentProjectDetailsActivity.GalleryAdapter.ViewHolder> {
        private final java.util.ArrayList<java.lang.String> images;
        final /* synthetic */ ca.dnamobile.javalauncher.ContentProjectDetailsActivity this$0;

        final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            final android.widget.ImageView image;
            final android.widget.TextView index;
            final /* synthetic */ ca.dnamobile.javalauncher.ContentProjectDetailsActivity.GalleryAdapter this$1;

            ViewHolder(ca.dnamobile.javalauncher.ContentProjectDetailsActivity.GalleryAdapter r1, android.view.View r2) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>(r2)
                    int r1 = ca.dnamobile.javalauncher.R.id.imageGalleryScreenshot
                    android.view.View r1 = r2.findViewById(r1)
                    android.widget.ImageView r1 = (android.widget.ImageView) r1
                    r0.image = r1
                    int r1 = ca.dnamobile.javalauncher.R.id.textGalleryIndex
                    android.view.View r1 = r2.findViewById(r1)
                    android.widget.TextView r1 = (android.widget.TextView) r1
                    r0.index = r1
                    return
            }
        }

        public static /* synthetic */ void $r8$lambda$HvjHmoPgfuDT3Qw2_psfIA18KJM(ca.dnamobile.javalauncher.ContentProjectDetailsActivity.GalleryAdapter r0, java.lang.String r1, int r2, android.view.View r3) {
                r0.lambda$onBindViewHolder$0(r1, r2, r3)
                return
        }

        private GalleryAdapter(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.images = r1
                return
        }

        /* synthetic */ GalleryAdapter(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r1, ca.dnamobile.javalauncher.ContentProjectDetailsActivity.GalleryAdapterIA r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private /* synthetic */ void lambda$onBindViewHolder$0(java.lang.String r2, int r3, android.view.View r4) {
                r1 = this;
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r4 = r1.this$0
                java.util.ArrayList<java.lang.String> r0 = r1.images
                int r0 = r0.size()
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity.m140$$Nest$mshowScreenshotDialog(r4, r2, r3, r0)
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
                r1 = this;
                java.util.ArrayList<java.lang.String> r0 = r1.images
                int r0 = r0.size()
                return r0
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
                r0 = this;
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity$GalleryAdapter$ViewHolder r1 = (ca.dnamobile.javalauncher.ContentProjectDetailsActivity.GalleryAdapter.ViewHolder) r1
                r0.onBindViewHolder(r1, r2)
                return
        }

        public void onBindViewHolder(ca.dnamobile.javalauncher.ContentProjectDetailsActivity.GalleryAdapter.ViewHolder r4, int r5) {
                r3 = this;
                java.util.ArrayList<java.lang.String> r0 = r3.images
                java.lang.Object r0 = r0.get(r5)
                java.lang.String r0 = (java.lang.String) r0
                android.widget.TextView r1 = r4.index
                int r2 = r5 + 1
                java.lang.String r2 = java.lang.String.valueOf(r2)
                r1.setText(r2)
                android.widget.ImageView r1 = r4.image
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r2 = r3.this$0
                int r2 = ca.dnamobile.javalauncher.ContentProjectDetailsActivity.m134$$Nest$mgetFallbackIcon(r2)
                ca.dnamobile.javalauncher.modmanager.NetworkImageLoader.load(r1, r0, r2)
                android.view.View r4 = r4.itemView
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity$GalleryAdapter$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$GalleryAdapter$$ExternalSyntheticLambda0
                r1.<init>(r3, r0, r5)
                r4.setOnClickListener(r1)
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r1, int r2) {
                r0 = this;
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity$GalleryAdapter$ViewHolder r1 = r0.onCreateViewHolder(r1, r2)
                return r1
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public ca.dnamobile.javalauncher.ContentProjectDetailsActivity.GalleryAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup r3, int r4) {
                r2 = this;
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r4 = r2.this$0
                android.view.LayoutInflater r4 = r4.getLayoutInflater()
                int r0 = ca.dnamobile.javalauncher.R.layout.item_content_gallery_image
                r1 = 0
                android.view.View r3 = r4.inflate(r0, r3, r1)
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity$GalleryAdapter$ViewHolder r4 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$GalleryAdapter$ViewHolder
                r4.<init>(r2, r3)
                return r4
        }

        void submit(java.util.List<java.lang.String> r2) {
                r1 = this;
                java.util.ArrayList<java.lang.String> r0 = r1.images
                r0.clear()
                java.util.ArrayList<java.lang.String> r0 = r1.images
                r0.addAll(r2)
                r1.notifyDataSetChanged()
                return
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.ContentProjectDetailsActivity$GalleryAdapter-IA, reason: invalid class name */
    /* JADX INFO: compiled from: D8$$SyntheticClass */
    public final /* synthetic */ class GalleryAdapterIA {
    }

    private interface MinecraftVersionFilterClickListener {
        void onMinecraftVersionClicked(java.lang.String r1);
    }

    private final class MinecraftVersionFilterDialogAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<ca.dnamobile.javalauncher.ContentProjectDetailsActivity.MinecraftVersionFilterDialogAdapter.ViewHolder> {
        private final ca.dnamobile.javalauncher.ContentProjectDetailsActivity.MinecraftVersionFilterClickListener listener;
        private final java.lang.String selectedVersion;
        final /* synthetic */ ca.dnamobile.javalauncher.ContentProjectDetailsActivity this$0;
        private final java.util.ArrayList<java.lang.String> versions;

        final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            final android.widget.TextView subtitle;
            final /* synthetic */ ca.dnamobile.javalauncher.ContentProjectDetailsActivity.MinecraftVersionFilterDialogAdapter this$1;
            final android.widget.TextView title;

            ViewHolder(ca.dnamobile.javalauncher.ContentProjectDetailsActivity.MinecraftVersionFilterDialogAdapter r1, android.view.View r2, android.widget.TextView r3, android.widget.TextView r4) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>(r2)
                    r0.title = r3
                    r0.subtitle = r4
                    return
            }
        }

        /* JADX INFO: renamed from: $r8$lambda$Krx-aELLYra06c9lSQ8gq1RLfiU, reason: not valid java name */
        public static /* synthetic */ void m146$r8$lambda$KrxaELLYra06c9lSQ8gq1RLfiU(ca.dnamobile.javalauncher.ContentProjectDetailsActivity.MinecraftVersionFilterDialogAdapter r0, java.lang.String r1, android.view.View r2) {
                r0.lambda$onBindViewHolder$0(r1, r2)
                return
        }

        MinecraftVersionFilterDialogAdapter(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r1, java.util.ArrayList<java.lang.String> r2, java.lang.String r3, ca.dnamobile.javalauncher.ContentProjectDetailsActivity.MinecraftVersionFilterClickListener r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r2)
                r0.versions = r1
                r0.selectedVersion = r3
                r0.listener = r4
                return
        }

        private /* synthetic */ void lambda$onBindViewHolder$0(java.lang.String r1, android.view.View r2) {
                r0 = this;
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity$MinecraftVersionFilterClickListener r2 = r0.listener
                r2.onMinecraftVersionClicked(r1)
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
                r1 = this;
                java.util.ArrayList<java.lang.String> r0 = r1.versions
                int r0 = r0.size()
                return r0
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
                r0 = this;
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity$MinecraftVersionFilterDialogAdapter$ViewHolder r1 = (ca.dnamobile.javalauncher.ContentProjectDetailsActivity.MinecraftVersionFilterDialogAdapter.ViewHolder) r1
                r0.onBindViewHolder(r1, r2)
                return
        }

        public void onBindViewHolder(ca.dnamobile.javalauncher.ContentProjectDetailsActivity.MinecraftVersionFilterDialogAdapter.ViewHolder r6, int r7) {
                r5 = this;
                java.util.ArrayList<java.lang.String> r0 = r5.versions
                java.lang.Object r7 = r0.get(r7)
                java.lang.String r7 = (java.lang.String) r7
                java.lang.String r0 = r5.selectedVersion
                boolean r0 = r7.equalsIgnoreCase(r0)
                android.widget.TextView r1 = r6.title
                r1.setText(r7)
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r1 = r5.this$0
                int r1 = ca.dnamobile.javalauncher.ContentProjectDetailsActivity.m135$$Nest$mgetMinecraftVersionFilterCount(r1, r7)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.StringBuilder r3 = r2.append(r1)
                r4 = 1
                if (r1 != r4) goto L28
                java.lang.String r1 = " version"
                goto L2a
            L28:
                java.lang.String r1 = " versions"
            L2a:
                r3.append(r1)
                java.lang.String r1 = "All Minecraft versions"
                boolean r1 = r1.equals(r7)
                if (r1 == 0) goto L3a
                java.lang.String r1 = " · Show everything"
                r2.append(r1)
            L3a:
                if (r0 == 0) goto L41
                java.lang.String r1 = " · Selected"
                r2.append(r1)
            L41:
                android.widget.TextView r1 = r6.subtitle
                java.lang.String r2 = r2.toString()
                r1.setText(r2)
                android.view.View r1 = r6.itemView
                if (r0 == 0) goto L51
                r0 = 1065353216(0x3f800000, float:1.0)
                goto L54
            L51:
                r0 = 1064011039(0x3f6b851f, float:0.92)
            L54:
                r1.setAlpha(r0)
                android.view.View r6 = r6.itemView
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity$MinecraftVersionFilterDialogAdapter$$ExternalSyntheticLambda0 r0 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$MinecraftVersionFilterDialogAdapter$$ExternalSyntheticLambda0
                r0.<init>(r5, r7)
                r6.setOnClickListener(r0)
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r1, int r2) {
                r0 = this;
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity$MinecraftVersionFilterDialogAdapter$ViewHolder r1 = r0.onCreateViewHolder(r1, r2)
                return r1
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public ca.dnamobile.javalauncher.ContentProjectDetailsActivity.MinecraftVersionFilterDialogAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup r8, int r9) {
                r7 = this;
                android.widget.LinearLayout r9 = new android.widget.LinearLayout
                android.content.Context r0 = r8.getContext()
                r9.<init>(r0)
                r0 = 1
                r9.setOrientation(r0)
                r1 = 16
                r9.setGravity(r1)
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r2 = r7.this$0
                int r2 = ca.dnamobile.javalauncher.ContentProjectDetailsActivity.m132$$Nest$mdp(r2, r1)
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r3 = r7.this$0
                r4 = 12
                int r3 = ca.dnamobile.javalauncher.ContentProjectDetailsActivity.m132$$Nest$mdp(r3, r4)
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r5 = r7.this$0
                int r5 = ca.dnamobile.javalauncher.ContentProjectDetailsActivity.m132$$Nest$mdp(r5, r1)
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r6 = r7.this$0
                int r4 = ca.dnamobile.javalauncher.ContentProjectDetailsActivity.m132$$Nest$mdp(r6, r4)
                r9.setPadding(r2, r3, r5, r4)
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r2 = r7.this$0
                r3 = 72
                int r2 = ca.dnamobile.javalauncher.ContentProjectDetailsActivity.m132$$Nest$mdp(r2, r3)
                r9.setMinimumHeight(r2)
                android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
                r2.<init>()
                int r3 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.COLOR_CARD_BG
                r2.setColor(r3)
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r3 = r7.this$0
                int r1 = ca.dnamobile.javalauncher.ContentProjectDetailsActivity.m132$$Nest$mdp(r3, r1)
                float r1 = (float) r1
                r2.setCornerRadius(r1)
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r1 = r7.this$0
                int r1 = ca.dnamobile.javalauncher.ContentProjectDetailsActivity.m132$$Nest$mdp(r1, r0)
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
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r5 = r7.this$0
                r6 = 4
                int r5 = ca.dnamobile.javalauncher.ContentProjectDetailsActivity.m132$$Nest$mdp(r5, r6)
                r3.topMargin = r5
                r9.addView(r0, r3)
                androidx.recyclerview.widget.RecyclerView$LayoutParams r3 = new androidx.recyclerview.widget.RecyclerView$LayoutParams
                r3.<init>(r2, r4)
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r2 = r7.this$0
                r4 = 8
                int r2 = ca.dnamobile.javalauncher.ContentProjectDetailsActivity.m132$$Nest$mdp(r2, r4)
                r3.setMargins(r8, r8, r8, r2)
                r9.setLayoutParams(r3)
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity$MinecraftVersionFilterDialogAdapter$ViewHolder r8 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$MinecraftVersionFilterDialogAdapter$ViewHolder
                r8.<init>(r7, r9, r1, r0)
                return r8
        }
    }

    private final class VersionAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<ca.dnamobile.javalauncher.ContentProjectDetailsActivity.VersionAdapter.ViewHolder> {
        final /* synthetic */ ca.dnamobile.javalauncher.ContentProjectDetailsActivity this$0;
        private final java.util.ArrayList<ca.dnamobile.javalauncher.ContentProjectDetailsActivity.VersionRow> versions;

        final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            final com.google.android.material.button.MaterialButton install;
            final android.widget.TextView meta;
            final android.widget.TextView name;
            final /* synthetic */ ca.dnamobile.javalauncher.ContentProjectDetailsActivity.VersionAdapter this$1;

            ViewHolder(ca.dnamobile.javalauncher.ContentProjectDetailsActivity.VersionAdapter r1, android.view.View r2) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>(r2)
                    int r1 = ca.dnamobile.javalauncher.R.id.textVersionName
                    android.view.View r1 = r2.findViewById(r1)
                    android.widget.TextView r1 = (android.widget.TextView) r1
                    r0.name = r1
                    int r1 = ca.dnamobile.javalauncher.R.id.textVersionMeta
                    android.view.View r1 = r2.findViewById(r1)
                    android.widget.TextView r1 = (android.widget.TextView) r1
                    r0.meta = r1
                    int r1 = ca.dnamobile.javalauncher.R.id.buttonInstallVersion
                    android.view.View r1 = r2.findViewById(r1)
                    com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
                    r0.install = r1
                    r2 = 0
                    r1.setFocusable(r2)
                    r1.setFocusableInTouchMode(r2)
                    return
            }
        }

        public static /* synthetic */ void $r8$lambda$bCBFmx5eFIPWavGx_fhbPpgd5Bg(ca.dnamobile.javalauncher.ContentProjectDetailsActivity.VersionAdapter r0, ca.dnamobile.javalauncher.ContentProjectDetailsActivity.VersionRow r1, android.view.View r2) {
                r0.lambda$onBindViewHolder$0(r1, r2)
                return
        }

        private VersionAdapter(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.versions = r1
                return
        }

        /* synthetic */ VersionAdapter(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r1, ca.dnamobile.javalauncher.ContentProjectDetailsActivity.VersionAdapterIA r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void bindModpackVersion(ca.dnamobile.javalauncher.ContentProjectDetailsActivity.VersionAdapter.ViewHolder r4, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice r5) {
                r3 = this;
                android.widget.TextView r0 = r4.name
                java.lang.String r1 = r5.getDisplayTitle()
                r0.setText(r1)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.lang.String r1 = r5.getDisplaySubtitle()
                if (r1 == 0) goto L25
                java.lang.String r2 = r1.trim()
                boolean r2 = r2.isEmpty()
                if (r2 != 0) goto L25
                java.lang.String r1 = r1.trim()
                r0.add(r1)
            L25:
                java.lang.String r1 = r5.fileName
                if (r1 != 0) goto L2c
                java.lang.String r1 = ""
                goto L32
            L2c:
                java.lang.String r1 = r5.fileName
                java.lang.String r1 = r1.trim()
            L32:
                boolean r2 = r1.isEmpty()
                if (r2 != 0) goto L3b
                r0.add(r1)
            L3b:
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r1 = r3.this$0
                java.lang.String r1 = ca.dnamobile.javalauncher.ContentProjectDetailsActivity.m127$$Nest$fgetgameVersionId(r1)
                java.lang.String r1 = r1.trim()
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L62
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r1 = r3.this$0
                java.lang.String r1 = ca.dnamobile.javalauncher.ContentProjectDetailsActivity.m127$$Nest$fgetgameVersionId(r1)
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r2 = r3.this$0
                java.lang.String r2 = ca.dnamobile.javalauncher.ContentProjectDetailsActivity.m128$$Nest$fgetloader(r2)
                boolean r5 = r5.isCompatibleWith(r1, r2)
                if (r5 != 0) goto L62
                java.lang.String r5 = "Not filtered out: installs using this pack version's own Minecraft version and loader"
                r0.add(r5)
            L62:
                android.widget.TextView r4 = r4.meta
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r5 = r3.this$0
                java.lang.String r1 = "\n"
                java.lang.String r5 = ca.dnamobile.javalauncher.ContentProjectDetailsActivity.m136$$Nest$mjoinParts(r5, r0, r1)
                r4.setText(r5)
                return
        }

        private void bindNormalVersion(ca.dnamobile.javalauncher.ContentProjectDetailsActivity.VersionAdapter.ViewHolder r6, ca.dnamobile.javalauncher.modmanager.ModrinthVersion r7) {
                r5 = this;
                java.lang.String r0 = r7.name
                if (r0 == 0) goto L14
                java.lang.String r0 = r7.name
                java.lang.String r0 = r0.trim()
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L11
                goto L14
            L11:
                java.lang.String r0 = r7.name
                goto L16
            L14:
                java.lang.String r0 = r7.versionNumber
            L16:
                android.widget.TextView r1 = r6.name
                r1.setText(r0)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.lang.String r1 = r7.versionNumber
                if (r1 == 0) goto L39
                java.lang.String r1 = r7.versionNumber
                java.lang.String r1 = r1.trim()
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L39
                java.lang.String r1 = r7.versionNumber
                java.lang.String r1 = r1.trim()
                r0.add(r1)
            L39:
                java.lang.String r1 = r7.versionType
                if (r1 == 0) goto L54
                java.lang.String r1 = r7.versionType
                java.lang.String r1 = r1.trim()
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L54
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r1 = r5.this$0
                java.lang.String r2 = r7.versionType
                java.lang.String r1 = ca.dnamobile.javalauncher.ContentProjectDetailsActivity.m133$$Nest$mformatTag(r1, r2)
                r0.add(r1)
            L54:
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r1 = r5.this$0
                java.lang.String r2 = "gameVersions"
                java.util.ArrayList r1 = ca.dnamobile.javalauncher.ContentProjectDetailsActivity.m139$$Nest$mreflectedStringList(r1, r7, r2)
                boolean r2 = r1.isEmpty()
                if (r2 != 0) goto L7b
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Minecraft "
                r2.<init>(r3)
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r3 = r5.this$0
                r4 = 3
                java.lang.String r1 = ca.dnamobile.javalauncher.ContentProjectDetailsActivity.m137$$Nest$mjoinShortList(r3, r1, r4)
                java.lang.StringBuilder r1 = r2.append(r1)
                java.lang.String r1 = r1.toString()
                r0.add(r1)
            L7b:
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r1 = r5.this$0
                java.lang.String r2 = "loaders"
                java.util.ArrayList r1 = ca.dnamobile.javalauncher.ContentProjectDetailsActivity.m139$$Nest$mreflectedStringList(r1, r7, r2)
                boolean r2 = r1.isEmpty()
                if (r2 != 0) goto La2
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Loader "
                r2.<init>(r3)
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r3 = r5.this$0
                r4 = 2
                java.lang.String r1 = ca.dnamobile.javalauncher.ContentProjectDetailsActivity.m137$$Nest$mjoinShortList(r3, r1, r4)
                java.lang.StringBuilder r1 = r2.append(r1)
                java.lang.String r1 = r1.toString()
                r0.add(r1)
            La2:
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r1 = r5.this$0
                java.lang.String r2 = r7.datePublished
                java.lang.String r1 = ca.dnamobile.javalauncher.ContentProjectDetailsActivity.m142$$Nest$mtrimDate(r1, r2)
                boolean r2 = r1.isEmpty()
                if (r2 != 0) goto Lb3
                r0.add(r1)
            Lb3:
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r1 = r5.this$0
                java.lang.String r2 = "fileName"
                java.lang.String r7 = ca.dnamobile.javalauncher.ContentProjectDetailsActivity.m138$$Nest$mreflectedString(r1, r7, r2)
                boolean r1 = r7.isEmpty()
                if (r1 != 0) goto Lc4
                r0.add(r7)
            Lc4:
                android.widget.TextView r6 = r6.meta
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r7 = r5.this$0
                java.lang.String r1 = " · "
                java.lang.String r7 = ca.dnamobile.javalauncher.ContentProjectDetailsActivity.m136$$Nest$mjoinParts(r7, r0, r1)
                r6.setText(r7)
                return
        }

        private /* synthetic */ void lambda$onBindViewHolder$0(ca.dnamobile.javalauncher.ContentProjectDetailsActivity.VersionRow r1, android.view.View r2) {
                r0 = this;
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r2 = r0.this$0
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity.m130$$Nest$mconfirmInstallVersion(r2, r1)
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
                r1 = this;
                java.util.ArrayList<ca.dnamobile.javalauncher.ContentProjectDetailsActivity$VersionRow> r0 = r1.versions
                int r0 = r0.size()
                return r0
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
                r0 = this;
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity$VersionAdapter$ViewHolder r1 = (ca.dnamobile.javalauncher.ContentProjectDetailsActivity.VersionAdapter.ViewHolder) r1
                r0.onBindViewHolder(r1, r2)
                return
        }

        public void onBindViewHolder(ca.dnamobile.javalauncher.ContentProjectDetailsActivity.VersionAdapter.ViewHolder r2, int r3) {
                r1 = this;
                java.util.ArrayList<ca.dnamobile.javalauncher.ContentProjectDetailsActivity$VersionRow> r0 = r1.versions
                java.lang.Object r3 = r0.get(r3)
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity$VersionRow r3 = (ca.dnamobile.javalauncher.ContentProjectDetailsActivity.VersionRow) r3
                ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$ModpackVersionChoice r0 = r3.modpackVersion
                if (r0 == 0) goto L12
                ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$ModpackVersionChoice r0 = r3.modpackVersion
                r1.bindModpackVersion(r2, r0)
                goto L1b
            L12:
                ca.dnamobile.javalauncher.modmanager.ModrinthVersion r0 = r3.normalVersion
                if (r0 == 0) goto L1b
                ca.dnamobile.javalauncher.modmanager.ModrinthVersion r0 = r3.normalVersion
                r1.bindNormalVersion(r2, r0)
            L1b:
                com.google.android.material.button.MaterialButton r2 = r2.install
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity$VersionAdapter$$ExternalSyntheticLambda0 r0 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$VersionAdapter$$ExternalSyntheticLambda0
                r0.<init>(r1, r3)
                r2.setOnClickListener(r0)
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r1, int r2) {
                r0 = this;
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity$VersionAdapter$ViewHolder r1 = r0.onCreateViewHolder(r1, r2)
                return r1
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public ca.dnamobile.javalauncher.ContentProjectDetailsActivity.VersionAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup r3, int r4) {
                r2 = this;
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity r4 = r2.this$0
                android.view.LayoutInflater r4 = r4.getLayoutInflater()
                int r0 = ca.dnamobile.javalauncher.R.layout.item_content_version
                r1 = 0
                android.view.View r3 = r4.inflate(r0, r3, r1)
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity$VersionAdapter$ViewHolder r4 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$VersionAdapter$ViewHolder
                r4.<init>(r2, r3)
                return r4
        }

        void submit(java.util.List<ca.dnamobile.javalauncher.ContentProjectDetailsActivity.VersionRow> r2) {
                r1 = this;
                java.util.ArrayList<ca.dnamobile.javalauncher.ContentProjectDetailsActivity$VersionRow> r0 = r1.versions
                r0.clear()
                java.util.ArrayList<ca.dnamobile.javalauncher.ContentProjectDetailsActivity$VersionRow> r0 = r1.versions
                r0.addAll(r2)
                r1.notifyDataSetChanged()
                return
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.ContentProjectDetailsActivity$VersionAdapter-IA, reason: invalid class name */
    /* JADX INFO: compiled from: D8$$SyntheticClass */
    public final /* synthetic */ class VersionAdapterIA {
    }

    private static final class VersionRow {
        final ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice modpackVersion;
        final ca.dnamobile.javalauncher.modmanager.ModrinthVersion normalVersion;

        private VersionRow(ca.dnamobile.javalauncher.modmanager.ModrinthVersion r1, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice r2) {
                r0 = this;
                r0.<init>()
                r0.normalVersion = r1
                r0.modpackVersion = r2
                return
        }

        static ca.dnamobile.javalauncher.ContentProjectDetailsActivity.VersionRow modpack(ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice r2) {
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity$VersionRow r0 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$VersionRow
                r1 = 0
                r0.<init>(r1, r2)
                return r0
        }

        static ca.dnamobile.javalauncher.ContentProjectDetailsActivity.VersionRow normal(ca.dnamobile.javalauncher.modmanager.ModrinthVersion r2) {
                ca.dnamobile.javalauncher.ContentProjectDetailsActivity$VersionRow r0 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$VersionRow
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        private static java.util.ArrayList<java.lang.String> readStringList(java.lang.Object r2, java.lang.String r3) {
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.lang.Class r1 = r2.getClass()     // Catch: java.lang.Throwable -> L3a
                java.lang.reflect.Field r3 = r1.getField(r3)     // Catch: java.lang.Throwable -> L3a
                java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.Throwable -> L3a
                boolean r3 = r2 instanceof java.lang.Iterable     // Catch: java.lang.Throwable -> L3a
                if (r3 == 0) goto L3a
                java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.Throwable -> L3a
                java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L3a
            L1b:
                boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L3a
                if (r3 == 0) goto L3a
                java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L3a
                if (r3 != 0) goto L28
                goto L1b
            L28:
                java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L3a
                java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L3a
                boolean r1 = r3.isEmpty()     // Catch: java.lang.Throwable -> L3a
                if (r1 != 0) goto L1b
                r0.add(r3)     // Catch: java.lang.Throwable -> L3a
                goto L1b
            L3a:
                return r0
        }

        java.lang.String datePublished() {
                r1 = this;
                ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$ModpackVersionChoice r0 = r1.modpackVersion
                if (r0 == 0) goto L7
                java.lang.String r0 = r0.datePublished
                return r0
            L7:
                ca.dnamobile.javalauncher.modmanager.ModrinthVersion r0 = r1.normalVersion
                if (r0 == 0) goto L15
                java.lang.String r0 = r0.datePublished
                if (r0 != 0) goto L10
                goto L15
            L10:
                ca.dnamobile.javalauncher.modmanager.ModrinthVersion r0 = r1.normalVersion
                java.lang.String r0 = r0.datePublished
                goto L17
            L15:
                java.lang.String r0 = ""
            L17:
                return r0
        }

        java.util.ArrayList<java.lang.String> minecraftVersions() {
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$ModpackVersionChoice r1 = r3.modpackVersion
                if (r1 == 0) goto Lf
                java.util.ArrayList<java.lang.String> r1 = r1.gameVersions
                r0.addAll(r1)
                goto L1c
            Lf:
                ca.dnamobile.javalauncher.modmanager.ModrinthVersion r1 = r3.normalVersion
                if (r1 == 0) goto L1c
                java.lang.String r2 = "gameVersions"
                java.util.ArrayList r1 = readStringList(r1, r2)
                r0.addAll(r1)
            L1c:
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L27
                java.lang.String r1 = "Unknown Minecraft version"
                r0.add(r1)
            L27:
                return r0
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$-WEaW-q71VGtlUe9a2UxUftWNPU, reason: not valid java name */
    public static /* synthetic */ int m118$r8$lambda$WEaWq71VGtlUe9a2UxUftWNPU(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice r1, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice r2) {
            int r0 = r0.lambda$sortModpackVersionsNewestFirst$22(r1, r2)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$0KpgBakHB4_5tSZB1Q_fW9whHNs(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0, ca.dnamobile.javalauncher.modmanager.ModrinthProject r1, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice r2, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener r3) {
            r0.lambda$installModpackVersion$20(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$2OYcccGry5g-sQ5lRLmdTatAAPc, reason: not valid java name */
    public static /* synthetic */ int m119$r8$lambda$2OYcccGry5gsQ5lRLmdTatAAPc(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0, ca.dnamobile.javalauncher.ContentProjectDetailsActivity.VersionRow r1, ca.dnamobile.javalauncher.ContentProjectDetailsActivity.VersionRow r2) {
            int r0 = r0.lambda$sortRowsNewestFirst$21(r1, r2)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$3KFerfzSpbpm_erKs5iq5MpSMpg(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0, java.lang.String r1, android.view.View r2) {
            r0.lambda$bindDescriptionMainImage$11(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$4Fzs5KzZPt3WXLExQINKjDuiSpo(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0, android.content.DialogInterface r1) {
            r0.lambda$confirmInstallModpackVersion$18(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$5girZF76tgnfBl00o7kNCI0qYKQ(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0, android.content.DialogInterface r1) {
            r0.lambda$showMinecraftVersionFilterDialog$6(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$8BwY6I1NcYUYg9LyRWA_KMvsKes(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0, android.view.View r1) {
            r0.lambda$setupVersionControls$2(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$AjJscnT26B12ZD8D95lqrlXerqo(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0, androidx.appcompat.app.AlertDialog[] r1, java.lang.String r2) {
            r0.lambda$showMinecraftVersionFilterDialog$4(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$BHz_Z-gHfZP1Sb-bxBp2_Hkd1gU, reason: not valid java name */
    public static /* synthetic */ void m120$r8$lambda$BHz_ZgHfZP1SbbxBp2_Hkd1gU(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0, ca.dnamobile.javalauncher.modmanager.ModrinthProject r1, ca.dnamobile.javalauncher.modmanager.ModrinthVersion r2, android.content.DialogInterface r3, int r4) {
            r0.lambda$confirmInstallVersion$15(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void $r8$lambda$CwhiMDKVvmEsPM03YtC_7lxkInw(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0, java.lang.Throwable r1) {
            r0.lambda$loadProject$8(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$GC-puM_T7Ut9aiRZ411V1gW6no4, reason: not valid java name */
    public static /* synthetic */ int m121$r8$lambda$GCpuM_T7Ut9aiRZ411V1gW6no4(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0, java.lang.String r1, java.lang.String r2) {
            int r0 = r0.compareMinecraftVersionKeysDescending(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$GQUMCThjFA2P2XXG-B96DN8crHQ, reason: not valid java name */
    public static /* synthetic */ void m122$r8$lambda$GQUMCThjFA2P2XXGB96DN8crHQ(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0, android.view.View r1) {
            r0.lambda$setupViews$0(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$LWFebeSXdjYWY1iP7_T9_2yYzGk(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0, androidx.appcompat.app.AlertDialog r1, android.content.DialogInterface r2) {
            r0.lambda$showMinecraftVersionFilterDialog$5(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$Pz1Lpone2gDbz4CeBKjmEuglCj0(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0, android.content.DialogInterface r1) {
            r0.lambda$showScreenshotDialog$13(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$asYmrHCpSwZsxnaBaS1t9O0TcVQ(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0, ca.dnamobile.javalauncher.modmanager.ModrinthProject r1, java.io.File r2, ca.dnamobile.javalauncher.modmanager.ModrinthVersion r3, ca.dnamobile.javalauncher.modmanager.ModrinthInstallManager.Listener r4) {
            r0.lambda$installNormalVersion$19(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void $r8$lambda$bBB416b7jQHCs_9xNoqzOkC8HXc(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0, android.content.DialogInterface r1) {
            r0.lambda$showScreenshotDialog$14(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$eKco-JX8YjEhRCD4epaN2XAJVyE, reason: not valid java name */
    public static /* synthetic */ void m123$r8$lambda$eKcoJX8YjEhRCD4epaN2XAJVyE(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0) {
            r0.lambda$loadProject$9()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$eOKO8pz-oiLIl_WuATHj1frX41s, reason: not valid java name */
    public static /* synthetic */ void m124$r8$lambda$eOKO8pzoiLIl_WuATHj1frX41s(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0, ca.dnamobile.javalauncher.modmanager.ModrinthProject r1, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice r2, android.content.DialogInterface r3, int r4) {
            r0.lambda$confirmInstallModpackVersion$17(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void $r8$lambda$oj_JOVuyDGyUZ1t7w851c8nLAwI(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0, android.view.View r1) {
            r0.lambda$setupVersionControls$1(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$qe8l8uA4C6xJZ6EkJXho1ZJ5HlY(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0, android.view.View r1) {
            r0.lambda$setupVersionControls$3(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$uw15FK0At4FknzmPA9gVI-qYeBU, reason: not valid java name */
    public static /* synthetic */ void m125$r8$lambda$uw15FK0At4FknzmPA9gVIqYeBU(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0, ca.dnamobile.javalauncher.modmanager.ModrinthProject r1, java.util.ArrayList r2) {
            r0.lambda$loadProject$7(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$wElHyJW5_DNFC6P7r5TqN5ZQgYU(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0, android.content.DialogInterface r1) {
            r0.lambda$confirmInstallVersion$16(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$xPR_-30bWYdJfwhrkDh_ItK9ZwQ, reason: not valid java name */
    public static /* synthetic */ void m126$r8$lambda$xPR_30bWYdJfwhrkDh_ItK9ZwQ(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0, ca.dnamobile.javalauncher.modmanager.ModrinthProject r1, android.view.View r2) {
            r0.lambda$bindLoadedProject$10(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$yomU9OnW9HY6w5qdd0q_5_3pKlk(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0, java.lang.String r1, android.content.DialogInterface r2, int r3) {
            r0.lambda$showScreenshotDialog$12(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$fgetgameVersionId, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m127$$Nest$fgetgameVersionId(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0) {
            java.lang.String r0 = r0.gameVersionId
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgetloader, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m128$$Nest$fgetloader(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0) {
            java.lang.String r0 = r0.loader
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgettextStatus, reason: not valid java name */
    static /* bridge */ /* synthetic */ android.widget.TextView m129$$Nest$fgettextStatus(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0) {
            android.widget.TextView r0 = r0.textStatus
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mconfirmInstallVersion, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m130$$Nest$mconfirmInstallVersion(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0, ca.dnamobile.javalauncher.ContentProjectDetailsActivity.VersionRow r1) {
            r0.confirmInstallVersion(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mdismissModpackInstallDialog, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m131$$Nest$mdismissModpackInstallDialog(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0) {
            r0.dismissModpackInstallDialog()
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mdp, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m132$$Nest$mdp(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0, int r1) {
            int r0 = r0.dp(r1)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mformatTag, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m133$$Nest$mformatTag(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0, java.lang.String r1) {
            java.lang.String r0 = r0.formatTag(r1)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mgetFallbackIcon, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m134$$Nest$mgetFallbackIcon(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0) {
            int r0 = r0.getFallbackIcon()
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mgetMinecraftVersionFilterCount, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m135$$Nest$mgetMinecraftVersionFilterCount(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0, java.lang.String r1) {
            int r0 = r0.getMinecraftVersionFilterCount(r1)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mjoinParts, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m136$$Nest$mjoinParts(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0, java.util.List r1, java.lang.String r2) {
            java.lang.String r0 = r0.joinParts(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mjoinShortList, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m137$$Nest$mjoinShortList(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0, java.util.ArrayList r1, int r2) {
            java.lang.String r0 = r0.joinShortList(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mreflectedString, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m138$$Nest$mreflectedString(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0, java.lang.Object r1, java.lang.String r2) {
            java.lang.String r0 = r0.reflectedString(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mreflectedStringList, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.util.ArrayList m139$$Nest$mreflectedStringList(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0, java.lang.Object r1, java.lang.String r2) {
            java.util.ArrayList r0 = r0.reflectedStringList(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mshowScreenshotDialog, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m140$$Nest$mshowScreenshotDialog(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0, java.lang.String r1, int r2, int r3) {
            r0.showScreenshotDialog(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mshowSection, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m141$$Nest$mshowSection(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0, int r1) {
            r0.showSection(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mtrimDate, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m142$$Nest$mtrimDate(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0, java.lang.String r1) {
            java.lang.String r0 = r0.trimDate(r1)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mupdateModpackInstallDialog, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m143$$Nest$mupdateModpackInstallDialog(ca.dnamobile.javalauncher.ContentProjectDetailsActivity r0, java.lang.String r1, int r2, int r3) {
            r0.updateModpackInstallDialog(r1, r2, r3)
            return
    }

    public ContentProjectDetailsActivity() {
            r2 = this;
            r2.<init>()
            ca.dnamobile.javalauncher.ContentProjectDetailsActivity$VersionAdapter r0 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$VersionAdapter
            r1 = 0
            r0.<init>(r2, r1)
            r2.adapter = r0
            ca.dnamobile.javalauncher.ContentProjectDetailsActivity$GalleryAdapter r0 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$GalleryAdapter
            r0.<init>(r2, r1)
            r2.galleryAdapter = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.allVersionRows = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.filteredVersionRows = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.versionMinecraftFilters = r0
            r0 = 0
            r2.versionCurrentPage = r0
            java.lang.String r0 = "All Minecraft versions"
            r2.selectedMinecraftVersionFilter = r0
            java.lang.String r0 = ""
            r2.instanceId = r0
            r2.instanceName = r0
            r2.loader = r0
            r2.baseVersionId = r0
            r2.gameVersionId = r0
            r2.gameDirectoryPath = r0
            r2.projectId = r0
            r2.projectSlug = r0
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODS
            r2.contentType = r0
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.MODRINTH
            r2.source = r0
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

    private void applyVersionFilter() {
            r4 = this;
            java.util.ArrayList<ca.dnamobile.javalauncher.ContentProjectDetailsActivity$VersionRow> r0 = r4.filteredVersionRows
            r0.clear()
            java.lang.String r0 = r4.getSelectedMinecraftVersionFilter()
            java.util.ArrayList<ca.dnamobile.javalauncher.ContentProjectDetailsActivity$VersionRow> r1 = r4.allVersionRows
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()
            ca.dnamobile.javalauncher.ContentProjectDetailsActivity$VersionRow r2 = (ca.dnamobile.javalauncher.ContentProjectDetailsActivity.VersionRow) r2
            boolean r3 = r4.matchesMinecraftVersionFilter(r2, r0)
            if (r3 == 0) goto Lf
            java.util.ArrayList<ca.dnamobile.javalauncher.ContentProjectDetailsActivity$VersionRow> r3 = r4.filteredVersionRows
            r3.add(r2)
            goto Lf
        L27:
            r4.refreshVisibleVersionPage()
            return
    }

    private void bindDescriptionMainImage(java.lang.String r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L5
            r1 = r0
            goto Lb
        L5:
            r1 = 14
            int r1 = r2.dp(r1)
        Lb:
            r2.setDescriptionTextTopMargin(r1)
            if (r3 != 0) goto L1e
            android.widget.ImageView r3 = r2.imageDescriptionMain
            r0 = 8
            r3.setVisibility(r0)
            android.widget.ImageView r3 = r2.imageDescriptionMain
            r0 = 0
            r3.setOnClickListener(r0)
            return
        L1e:
            android.widget.ImageView r1 = r2.imageDescriptionMain
            r1.setVisibility(r0)
            android.widget.ImageView r0 = r2.imageDescriptionMain
            int r1 = r2.getFallbackIcon()
            ca.dnamobile.javalauncher.modmanager.NetworkImageLoader.load(r0, r3, r1)
            android.widget.ImageView r0 = r2.imageDescriptionMain
            ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda21 r1 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda21
            r1.<init>(r2, r3)
            r0.setOnClickListener(r1)
            return
    }

    private void bindGalleryStatus(int r3) {
            r2 = this;
            r0 = 0
            if (r3 > 0) goto L10
            android.widget.TextView r3 = r2.textGallery
            r3.setVisibility(r0)
            android.widget.TextView r3 = r2.textGallery
            java.lang.String r0 = "No screenshots were provided for this project."
            r3.setText(r0)
            return
        L10:
            android.widget.TextView r1 = r2.textGallery
            r1.setVisibility(r0)
            android.widget.TextView r0 = r2.textGallery
            r1 = 1
            if (r3 != r1) goto L1d
            java.lang.String r3 = "1 screenshot"
            goto L30
        L1d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = " screenshots"
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
        L30:
            r0.setText(r3)
            return
    }

    private void bindLoadedProject(ca.dnamobile.javalauncher.modmanager.ModrinthProject r6, java.util.ArrayList<ca.dnamobile.javalauncher.ContentProjectDetailsActivity.VersionRow> r7) {
            r5 = this;
            r5.project = r6
            android.widget.TextView r0 = r5.textTitle
            java.lang.String r1 = r6.title
            r0.setText(r1)
            android.widget.TextView r0 = r5.textMeta
            java.lang.String r1 = r5.buildProjectMetaText(r6)
            r0.setText(r1)
            java.lang.String r0 = r5.firstMainImageUrl(r6)
            r5.bindDescriptionMainImage(r0)
            android.widget.TextView r0 = r5.textDescription
            java.lang.String r1 = r5.buildDescriptionSectionText(r6)
            r0.setText(r1)
            android.widget.TextView r0 = r5.textStatus
            int r1 = r7.size()
            java.lang.String r1 = r5.buildVersionStatusText(r1)
            r0.setText(r1)
            java.util.ArrayList r0 = r5.buildGalleryUrls(r6)
            int r1 = r0.size()
            r5.bindGalleryStatus(r1)
            ca.dnamobile.javalauncher.ContentProjectDetailsActivity$GalleryAdapter r1 = r5.galleryAdapter
            r1.submit(r0)
            r1 = 0
            java.lang.String r2 = "Description"
            r5.setTabText(r1, r2)
            boolean r1 = r7.isEmpty()
            java.lang.String r2 = ")"
            if (r1 == 0) goto L50
            java.lang.String r1 = "Versions"
            goto L67
        L50:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Versions ("
            r1.<init>(r3)
            int r3 = r7.size()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
        L67:
            r3 = 1
            r5.setTabText(r3, r1)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L74
            java.lang.String r0 = "Gallery"
            goto L8b
        L74:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Gallery ("
            r1.<init>(r4)
            int r0 = r0.size()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
        L8b:
            r1 = 2
            r5.setTabText(r1, r0)
            android.widget.ImageView r0 = r5.imageProjectIcon
            java.lang.String r1 = r5.firstUsableImageUrl(r6)
            int r2 = r5.getFallbackIcon()
            ca.dnamobile.javalauncher.modmanager.NetworkImageLoader.load(r0, r1, r2)
            com.google.android.material.button.MaterialButton r0 = r5.buttonOpenWebsite
            r0.setEnabled(r3)
            com.google.android.material.button.MaterialButton r0 = r5.buttonOpenWebsite
            ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda2 r1 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda2
            r1.<init>(r5, r6)
            r0.setOnClickListener(r1)
            r5.submitVersionRows(r7)
            return
    }

    private void bindViews() {
            r1 = this;
            int r0 = ca.dnamobile.javalauncher.R.id.imageProjectDetailsIcon
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.imageProjectIcon = r0
            int r0 = ca.dnamobile.javalauncher.R.id.textProjectDetailsTitle
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.textTitle = r0
            int r0 = ca.dnamobile.javalauncher.R.id.textProjectDetailsMeta
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.textMeta = r0
            int r0 = ca.dnamobile.javalauncher.R.id.imageProjectDetailsMainImage
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.imageDescriptionMain = r0
            int r0 = ca.dnamobile.javalauncher.R.id.textProjectDetailsDescription
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.textDescription = r0
            int r0 = ca.dnamobile.javalauncher.R.id.textProjectDetailsGallery
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.textGallery = r0
            int r0 = ca.dnamobile.javalauncher.R.id.textProjectDetailsStatus
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.textStatus = r0
            int r0 = ca.dnamobile.javalauncher.R.id.tabProjectDetailsSections
            android.view.View r0 = r1.findViewById(r0)
            com.google.android.material.tabs.TabLayout r0 = (com.google.android.material.tabs.TabLayout) r0
            r1.tabSections = r0
            int r0 = ca.dnamobile.javalauncher.R.id.sectionProjectDescription
            android.view.View r0 = r1.findViewById(r0)
            r1.sectionDescription = r0
            int r0 = ca.dnamobile.javalauncher.R.id.sectionProjectVersions
            android.view.View r0 = r1.findViewById(r0)
            r1.sectionVersions = r0
            int r0 = ca.dnamobile.javalauncher.R.id.sectionProjectGallery
            android.view.View r0 = r1.findViewById(r0)
            r1.sectionGallery = r0
            int r0 = ca.dnamobile.javalauncher.R.id.recyclerProjectVersions
            android.view.View r0 = r1.findViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r1.recyclerVersions = r0
            int r0 = ca.dnamobile.javalauncher.R.id.recyclerProjectGallery
            android.view.View r0 = r1.findViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r1.recyclerGallery = r0
            int r0 = ca.dnamobile.javalauncher.R.id.buttonProjectDetailsMinecraftVersion
            android.view.View r0 = r1.findViewById(r0)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            r1.buttonVersionMinecraft = r0
            int r0 = ca.dnamobile.javalauncher.R.id.textProjectDetailsVersionFilterSummary
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.textVersionFilterSummary = r0
            int r0 = ca.dnamobile.javalauncher.R.id.textProjectDetailsVersionPageIndicator
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.textVersionPageIndicator = r0
            int r0 = ca.dnamobile.javalauncher.R.id.buttonProjectDetailsVersionPrevious
            android.view.View r0 = r1.findViewById(r0)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            r1.buttonVersionPagePrevious = r0
            int r0 = ca.dnamobile.javalauncher.R.id.buttonProjectDetailsVersionNext
            android.view.View r0 = r1.findViewById(r0)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            r1.buttonVersionPageNext = r0
            int r0 = ca.dnamobile.javalauncher.R.id.buttonOpenProjectWebsite
            android.view.View r0 = r1.findViewById(r0)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            r1.buttonOpenWebsite = r0
            int r0 = ca.dnamobile.javalauncher.R.id.buttonProjectDetailsBack
            android.view.View r0 = r1.findViewById(r0)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            r1.buttonBack = r0
            return
    }

    private java.lang.String buildDescriptionSectionText(ca.dnamobile.javalauncher.modmanager.ModrinthProject r3) {
            r2 = this;
            java.lang.String r0 = r2.buildDescriptionText(r3)
            java.lang.String r3 = r2.buildProjectDetailsLine(r3)
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto Lf
            return r0
        Lf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "\n\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            return r3
    }

    private java.lang.String buildDescriptionText(ca.dnamobile.javalauncher.modmanager.ModrinthProject r3) {
            r2 = this;
            java.lang.String r0 = r3.body
            java.lang.String r0 = r2.sanitizeDescriptionText(r0)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto Ld
            return r0
        Ld:
            java.lang.String r3 = r3.description
            java.lang.String r3 = r2.sanitizeDescriptionText(r3)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L1b
            java.lang.String r3 = "No description was provided for this project."
        L1b:
            return r3
    }

    private java.util.ArrayList<java.lang.String> buildGalleryUrls(ca.dnamobile.javalauncher.modmanager.ModrinthProject r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList<java.lang.String> r2 = r5.galleryUrls
            if (r2 == 0) goto L31
            java.util.ArrayList<java.lang.String> r5 = r5.galleryUrls
            java.util.Iterator r5 = r5.iterator()
        L14:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L31
            java.lang.Object r2 = r5.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r4.normalizeImageUrl(r2)
            if (r2 == 0) goto L14
            boolean r3 = r1.add(r2)
            if (r3 != 0) goto L2d
            goto L14
        L2d:
            r0.add(r2)
            goto L14
        L31:
            return r0
    }

    private java.lang.String buildInitialMetaLine() {
            r4 = this;
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = r4.contentType
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODPACKS
            if (r0 != r1) goto L4e
            java.lang.String r0 = r4.gameDirectoryPath
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            java.lang.String r1 = "Modpack · "
            if (r0 == 0) goto L2e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r1 = r4.source
            java.lang.String r1 = r1.getDisplayName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " · Installs to the selected launcher storage location"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L2e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r1 = r4.source
            java.lang.String r1 = r1.getDisplayName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " · Current instance: "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r4.instanceName
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L4e:
            int r0 = ca.dnamobile.javalauncher.R.string.content_project_details_instance_meta
            java.lang.String r1 = r4.instanceName
            java.lang.String r2 = r4.loader
            java.lang.String r2 = r4.displayLoader(r2)
            java.lang.String r3 = r4.gameVersionId
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L67
            int r3 = ca.dnamobile.javalauncher.R.string.content_browser_unknown_version
            java.lang.String r3 = r4.getString(r3)
            goto L69
        L67:
            java.lang.String r3 = r4.gameVersionId
        L69:
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r0 = r4.getString(r0, r1)
            return r0
    }

    private java.lang.String buildProjectDetailsLine(ca.dnamobile.javalauncher.modmanager.ModrinthProject r4) {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList<java.lang.String> r4 = r4.categories
            java.lang.String r4 = r3.formatTags(r4)
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L23
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Categories: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.add(r4)
        L23:
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r4 = r3.contentType
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODPACKS
            if (r4 != r1) goto L2f
            java.lang.String r4 = "Install target: selected launcher storage location"
            r0.add(r4)
            goto L4f
        L2f:
            java.lang.String r4 = r3.gameDirectoryPath
            java.lang.String r4 = r4.trim()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L4f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "Install target: "
            r4.<init>(r1)
            java.lang.String r1 = r3.gameDirectoryPath
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.add(r4)
        L4f:
            java.lang.String r4 = "\n"
            java.lang.String r4 = r3.joinParts(r0, r4)
            return r4
    }

    private java.lang.String buildProjectMetaText(ca.dnamobile.javalauncher.modmanager.ModrinthProject r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = r5.contentType
            java.lang.String r1 = r5.getContentTypeTitle(r1)
            r0.add(r1)
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r1 = r5.resolveSource(r6)
            java.lang.String r1 = r1.getDisplayName()
            r0.add(r1)
            java.lang.String r1 = r6.author
            if (r1 != 0) goto L20
            java.lang.String r1 = ""
            goto L26
        L20:
            java.lang.String r1 = r6.author
            java.lang.String r1 = r1.trim()
        L26:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L3e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "By "
            r2.<init>(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L3e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            long r2 = r6.downloads
            java.lang.String r2 = r5.formatNumber(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " downloads"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
            long r1 = r6.followers
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L7e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            long r2 = r6.followers
            java.lang.String r2 = r5.formatNumber(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " followers"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L7e:
            java.lang.String r6 = r6.dateModified
            java.lang.String r6 = r5.trimDate(r6)
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L9c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Updated "
            r1.<init>(r2)
            java.lang.StringBuilder r6 = r1.append(r6)
            java.lang.String r6 = r6.toString()
            r0.add(r6)
        L9c:
            java.lang.String r6 = " · "
            java.lang.String r6 = r5.joinParts(r0, r6)
            return r6
    }

    private java.lang.String buildVersionFilterSummary(int r4, int r5) {
            r3 = this;
            java.util.ArrayList<ca.dnamobile.javalauncher.ContentProjectDetailsActivity$VersionRow> r0 = r3.allVersionRows
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            java.lang.String r4 = "No versions were found for this project."
            return r4
        Lb:
            java.lang.String r0 = r3.getSelectedMinecraftVersionFilter()
            java.lang.String r1 = "All Minecraft versions"
            boolean r2 = r1.equals(r0)
            if (r2 == 0) goto L18
            goto L27
        L18:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Minecraft "
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = r0.toString()
        L27:
            java.util.ArrayList<ca.dnamobile.javalauncher.ContentProjectDetailsActivity$VersionRow> r0 = r3.filteredVersionRows
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L43
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r5 = " · No matching versions"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            return r4
        L43:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " · Showing "
            java.lang.StringBuilder r0 = r0.append(r1)
            int r4 = r4 + 1
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r0 = "-"
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = " of "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.util.ArrayList<ca.dnamobile.javalauncher.ContentProjectDetailsActivity$VersionRow> r5 = r3.filteredVersionRows
            int r5 = r5.size()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.util.ArrayList<ca.dnamobile.javalauncher.ContentProjectDetailsActivity$VersionRow> r5 = r3.allVersionRows
            int r5 = r5.size()
            java.util.ArrayList<ca.dnamobile.javalauncher.ContentProjectDetailsActivity$VersionRow> r0 = r3.filteredVersionRows
            int r0 = r0.size()
            if (r5 != r0) goto L83
            java.lang.String r5 = " versions"
            goto L85
        L83:
            java.lang.String r5 = " matching versions"
        L85:
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            return r4
    }

    private java.lang.String buildVersionStatusText(int r3) {
            r2 = this;
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = r2.contentType
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODPACKS
            if (r0 != r1) goto L20
            r0 = 1
            if (r3 != r0) goto Lc
            java.lang.String r3 = "1 installable modpack version"
            goto L1f
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = " installable modpack versions"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
        L1f:
            return r3
        L20:
            int r0 = ca.dnamobile.javalauncher.R.string.content_project_details_versions_value
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r3 = r2.getString(r0, r3)
            return r3
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
            java.lang.String r1 = "\n\nThis uses the launcher storage location currently selected in settings, including scoped storage if the user selected one."
            r0.append(r1)
            java.lang.String r1 = r8.gameVersionId
            java.lang.String r1 = r1.trim()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L46
            java.lang.String r1 = r8.gameVersionId
            java.lang.String r2 = r8.loader
            boolean r1 = r10.isCompatibleWith(r1, r2)
            if (r1 != 0) goto L46
            java.lang.String r1 = "\n\nThis modpack version does not match the current instance filter. It will still install using the pack's own Minecraft version and loader metadata."
            r0.append(r1)
        L46:
            java.lang.String r4 = r0.toString()
            int r0 = ca.dnamobile.javalauncher.R.string.content_browser_install
            java.lang.String r5 = r8.getString(r0)
            ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda22 r6 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda22
            r6.<init>(r8, r9, r10)
            r9 = 17039360(0x1040000, float:2.424457E-38)
            java.lang.String r7 = r8.getString(r9)
            java.lang.String r3 = "Install Modpack"
            r2 = r8
            androidx.appcompat.app.AlertDialog r9 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.showStyledMessageDialog(r2, r3, r4, r5, r6, r7)
            ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda23 r10 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda23
            r10.<init>(r8)
            r9.setOnDismissListener(r10)
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r8)
            return
    }

    private void confirmInstallVersion(ca.dnamobile.javalauncher.ContentProjectDetailsActivity.VersionRow r11) {
            r10 = this;
            ca.dnamobile.javalauncher.modmanager.ModrinthProject r0 = r10.project
            if (r0 != 0) goto L5
            return
        L5:
            ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$ModpackVersionChoice r1 = r11.modpackVersion
            if (r1 == 0) goto Lf
            ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$ModpackVersionChoice r11 = r11.modpackVersion
            r10.confirmInstallModpackVersion(r0, r11)
            return
        Lf:
            ca.dnamobile.javalauncher.modmanager.ModrinthVersion r1 = r11.normalVersion
            if (r1 != 0) goto L14
            return
        L14:
            ca.dnamobile.javalauncher.modmanager.ModrinthVersion r11 = r11.normalVersion
            java.lang.String r1 = r10.gameVersionId
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L25
            int r1 = ca.dnamobile.javalauncher.R.string.content_browser_unknown_version
            java.lang.String r1 = r10.getString(r1)
            goto L27
        L25:
            java.lang.String r1 = r10.gameVersionId
        L27:
            int r2 = ca.dnamobile.javalauncher.R.string.content_project_details_install_version_title
            java.lang.String r3 = r0.title
            java.lang.String r4 = r11.versionNumber
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}
            java.lang.String r5 = r10.getString(r2, r3)
            int r2 = ca.dnamobile.javalauncher.R.string.content_project_details_install_version_message
            java.lang.String r3 = r10.loader
            java.lang.String r3 = r10.displayLoader(r3)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r3}
            java.lang.String r6 = r10.getString(r2, r1)
            int r1 = ca.dnamobile.javalauncher.R.string.content_browser_install
            java.lang.String r7 = r10.getString(r1)
            ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda12 r8 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda12
            r8.<init>(r10, r0, r11)
            r11 = 17039360(0x1040000, float:2.424457E-38)
            java.lang.String r9 = r10.getString(r11)
            r4 = r10
            androidx.appcompat.app.AlertDialog r11 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.showStyledMessageDialog(r4, r5, r6, r7, r8, r9)
            ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda13 r0 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda13
            r0.<init>(r10)
            r11.setOnDismissListener(r0)
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r10)
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

    private java.lang.String firstMainImageUrl(ca.dnamobile.javalauncher.modmanager.ModrinthProject r3) {
            r2 = this;
            java.util.ArrayList<java.lang.String> r0 = r3.galleryUrls
            if (r0 == 0) goto L1d
            java.util.ArrayList<java.lang.String> r0 = r3.galleryUrls
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r2.normalizeImageUrl(r1)
            if (r1 == 0) goto La
            return r1
        L1d:
            java.lang.String r3 = r3.iconUrl
            java.lang.String r3 = r2.normalizeImageUrl(r3)
            return r3
    }

    private java.lang.String firstUsableImageUrl(ca.dnamobile.javalauncher.modmanager.ModrinthProject r2) {
            r1 = this;
            java.lang.String r0 = r2.iconUrl
            java.lang.String r0 = r1.normalizeImageUrl(r0)
            if (r0 == 0) goto L9
            return r0
        L9:
            java.util.ArrayList<java.lang.String> r0 = r2.galleryUrls
            if (r0 == 0) goto L26
            java.util.ArrayList<java.lang.String> r2 = r2.galleryUrls
            java.util.Iterator r2 = r2.iterator()
        L13:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r1.normalizeImageUrl(r0)
            if (r0 == 0) goto L13
            return r0
        L26:
            r2 = 0
            return r2
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

    private java.lang.String formatTags(java.util.List<java.lang.String> r7) {
            r6 = this;
            java.lang.String r0 = "Unknown"
            if (r7 == 0) goto L63
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto Lb
            goto L63
        Lb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 4
            int r3 = r7.size()
            int r2 = java.lang.Math.min(r2, r3)
            r3 = 0
        L1a:
            if (r3 >= r2) goto L44
            java.lang.Object r4 = r7.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L41
            java.lang.String r5 = r4.trim()
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L2f
            goto L41
        L2f:
            int r5 = r1.length()
            if (r5 <= 0) goto L3a
            java.lang.String r5 = ", "
            r1.append(r5)
        L3a:
            java.lang.String r4 = r6.formatTag(r4)
            r1.append(r4)
        L41:
            int r3 = r3 + 1
            goto L1a
        L44:
            int r3 = r7.size()
            if (r3 <= r2) goto L58
            java.lang.String r3 = " +"
            java.lang.StringBuilder r3 = r1.append(r3)
            int r7 = r7.size()
            int r7 = r7 - r2
            r3.append(r7)
        L58:
            int r7 = r1.length()
            if (r7 != 0) goto L5f
            goto L63
        L5f:
            java.lang.String r0 = r1.toString()
        L63:
            return r0
    }

    private java.lang.String getContentTypeTitle(ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2) {
            r1 = this;
            int[] r0 = ca.dnamobile.javalauncher.ContentProjectDetailsActivity.AnonymousClass4.$SwitchMap$ca$dnamobile$javalauncher$modmanager$ModManagerContentType
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L1a
            r0 = 2
            if (r2 == r0) goto L17
            r0 = 3
            if (r2 == r0) goto L14
            java.lang.String r2 = "Mod"
            return r2
        L14:
            java.lang.String r2 = "Shader Pack"
            return r2
        L17:
            java.lang.String r2 = "Resource Pack"
            return r2
        L1a:
            java.lang.String r2 = "Modpack"
            return r2
    }

    private int getDefaultMinecraftFilterIndex() {
            r4 = this;
            java.lang.String r0 = r4.gameVersionId
            java.lang.String r0 = r4.normalizeMinecraftVersionKey(r0)
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto Le
            return r2
        Le:
            r1 = 1
        Lf:
            java.util.ArrayList<java.lang.String> r3 = r4.versionMinecraftFilters
            int r3 = r3.size()
            if (r1 >= r3) goto L29
            java.util.ArrayList<java.lang.String> r3 = r4.versionMinecraftFilters
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r0.equalsIgnoreCase(r3)
            if (r3 == 0) goto L26
            return r1
        L26:
            int r1 = r1 + 1
            goto Lf
        L29:
            return r2
    }

    private int getFallbackIcon() {
            r2 = this;
            int[] r0 = ca.dnamobile.javalauncher.ContentProjectDetailsActivity.AnonymousClass4.$SwitchMap$ca$dnamobile$javalauncher$modmanager$ModManagerContentType
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = r2.contentType
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L1c
            r1 = 2
            if (r0 == r1) goto L19
            r1 = 3
            if (r0 == r1) goto L16
            int r0 = ca.dnamobile.javalauncher.R.drawable.ic_content_mod_24
            return r0
        L16:
            int r0 = ca.dnamobile.javalauncher.R.drawable.ic_content_shaderpack_24
            return r0
        L19:
            int r0 = ca.dnamobile.javalauncher.R.drawable.ic_content_resourcepack_24
            return r0
        L1c:
            int r0 = ca.dnamobile.javalauncher.R.drawable.ic_content_mod_24
            return r0
    }

    private int getGalleryColumnCount() {
            r2 = this;
            android.content.res.Resources r0 = r2.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenWidthDp
            r1 = 900(0x384, float:1.261E-42)
            if (r0 < r1) goto L10
            r0 = 4
            return r0
        L10:
            r1 = 600(0x258, float:8.41E-43)
            if (r0 < r1) goto L16
            r0 = 3
            return r0
        L16:
            r0 = 2
            return r0
    }

    private int getMinecraftVersionFilterCount(java.lang.String r4) {
            r3 = this;
            java.util.ArrayList<ca.dnamobile.javalauncher.ContentProjectDetailsActivity$VersionRow> r0 = r3.allVersionRows
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1c
            java.lang.Object r2 = r0.next()
            ca.dnamobile.javalauncher.ContentProjectDetailsActivity$VersionRow r2 = (ca.dnamobile.javalauncher.ContentProjectDetailsActivity.VersionRow) r2
            boolean r2 = r3.matchesMinecraftVersionFilter(r2, r4)
            if (r2 == 0) goto L7
            int r1 = r1 + 1
            goto L7
        L1c:
            return r1
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

    private java.lang.String getSelectedMinecraftVersionFilter() {
            r2 = this;
            java.lang.String r0 = r2.selectedMinecraftVersionFilter
            if (r0 != 0) goto L7
            java.lang.String r0 = ""
            goto Lb
        L7:
            java.lang.String r0 = r0.trim()
        Lb:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L13
            java.lang.String r0 = "All Minecraft versions"
        L13:
            return r0
    }

    private int getVersionPageCount(int r5) {
            r4 = this;
            if (r5 > 0) goto L4
            r5 = 1
            return r5
        L4:
            double r0 = (double) r5
            r2 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r0 = r0 / r2
            double r0 = java.lang.Math.ceil(r0)
            int r5 = (int) r0
            return r5
    }

    private void installModpackVersion(ca.dnamobile.javalauncher.modmanager.ModrinthProject r4, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice r5) {
            r3 = this;
            java.lang.String r0 = r4.title
            r3.showModpackInstallDialog(r0)
            android.widget.TextView r0 = r3.textStatus
            int r1 = ca.dnamobile.javalauncher.R.string.content_browser_install_started
            java.lang.String r2 = r4.title
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = r3.getString(r1, r2)
            r0.setText(r1)
            ca.dnamobile.javalauncher.ContentProjectDetailsActivity$3 r0 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$3
            r0.<init>(r3)
            java.lang.Thread r1 = new java.lang.Thread
            ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda7 r2 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda7
            r2.<init>(r3, r4, r5, r0)
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r4 = r3.resolveSource(r4)
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r5 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.CURSEFORGE
            if (r4 != r5) goto L2d
            java.lang.String r4 = "CurseForgeModpackInstallVersion"
            goto L2f
        L2d:
            java.lang.String r4 = "ModrinthModpackInstallVersion"
        L2f:
            r1.<init>(r2, r4)
            r1.start()
            return
    }

    private void installNormalVersion(ca.dnamobile.javalauncher.modmanager.ModrinthProject r9, ca.dnamobile.javalauncher.modmanager.ModrinthVersion r10) {
            r8 = this;
            java.lang.String r0 = r8.gameDirectoryPath
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L17
            int r9 = ca.dnamobile.javalauncher.R.string.content_browser_missing_game_dir
            r10 = 1
            android.widget.Toast r9 = android.widget.Toast.makeText(r8, r9, r10)
            r9.show()
            return
        L17:
            java.io.File r3 = new java.io.File
            java.lang.String r0 = r8.gameDirectoryPath
            r3.<init>(r0)
            android.widget.TextView r0 = r8.textStatus
            int r1 = ca.dnamobile.javalauncher.R.string.content_browser_install_started
            java.lang.String r2 = r9.title
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = r8.getString(r1, r2)
            r0.setText(r1)
            ca.dnamobile.javalauncher.ContentProjectDetailsActivity$2 r5 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$2
            r5.<init>(r8)
            java.lang.Thread r6 = new java.lang.Thread
            ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda1 r7 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda1
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r9 = r8.resolveSource(r9)
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r10 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.CURSEFORGE
            if (r9 != r10) goto L4a
            java.lang.String r9 = "CurseForgeInstallVersion"
            goto L4c
        L4a:
            java.lang.String r9 = "ModrinthInstallVersion"
        L4c:
            r6.<init>(r7, r9)
            r6.start()
            return
    }

    private boolean isStandaloneImageReference(java.lang.String r6) {
            r5 = this;
            boolean r0 = r6.isEmpty()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = r5.normalizeImageUrl(r6)
            r2 = 1
            if (r0 == 0) goto L16
            boolean r0 = r5.looksLikeImageUrl(r0)
            if (r0 == 0) goto L16
            return r2
        L16:
            java.lang.String r0 = "!["
            boolean r0 = r6.startsWith(r0)
            if (r0 == 0) goto L50
            java.lang.String r0 = "]("
            boolean r3 = r6.contains(r0)
            if (r3 == 0) goto L50
            java.lang.String r3 = ")"
            boolean r3 = r6.endsWith(r3)
            if (r3 == 0) goto L50
            int r0 = r6.indexOf(r0)
            r3 = 2
            int r0 = r0 + r3
            r4 = 41
            int r4 = r6.lastIndexOf(r4)
            if (r0 < r3) goto L50
            if (r4 <= r0) goto L50
            java.lang.String r6 = r6.substring(r0, r4)
            java.lang.String r6 = r5.normalizeImageUrl(r6)
            if (r6 == 0) goto L4f
            boolean r6 = r5.looksLikeImageUrl(r6)
            if (r6 == 0) goto L4f
            r1 = r2
        L4f:
            return r1
        L50:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r6 = r6.toLowerCase(r0)
            java.lang.String r0 = "<img "
            boolean r0 = r6.startsWith(r0)
            if (r0 == 0) goto L67
            java.lang.String r0 = "src="
            boolean r6 = r6.contains(r0)
            if (r6 == 0) goto L67
            r1 = r2
        L67:
            return r1
    }

    private java.lang.String joinParts(java.util.List<java.lang.String> r4, java.lang.String r5) {
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

    private /* synthetic */ void lambda$bindDescriptionMainImage$11(java.lang.String r2, android.view.View r3) {
            r1 = this;
            r3 = 0
            r0 = 1
            r1.showScreenshotDialog(r2, r3, r0)
            return
    }

    private /* synthetic */ void lambda$bindLoadedProject$10(ca.dnamobile.javalauncher.modmanager.ModrinthProject r1, android.view.View r2) {
            r0 = this;
            r0.openWebsite(r1)
            return
    }

    private /* synthetic */ void lambda$confirmInstallModpackVersion$17(ca.dnamobile.javalauncher.modmanager.ModrinthProject r1, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice r2, android.content.DialogInterface r3, int r4) {
            r0 = this;
            r0.installModpackVersion(r1, r2)
            return
    }

    private /* synthetic */ void lambda$confirmInstallModpackVersion$18(android.content.DialogInterface r1) {
            r0 = this;
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r0)
            return
    }

    private /* synthetic */ void lambda$confirmInstallVersion$15(ca.dnamobile.javalauncher.modmanager.ModrinthProject r1, ca.dnamobile.javalauncher.modmanager.ModrinthVersion r2, android.content.DialogInterface r3, int r4) {
            r0 = this;
            r0.installNormalVersion(r1, r2)
            return
    }

    private /* synthetic */ void lambda$confirmInstallVersion$16(android.content.DialogInterface r1) {
            r0 = this;
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r0)
            return
    }

    private /* synthetic */ void lambda$installModpackVersion$20(ca.dnamobile.javalauncher.modmanager.ModrinthProject r9, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice r10, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener r11) {
            r8 = this;
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r1 = r8.resolveSource(r9)
            java.lang.String r2 = r8.safeProjectId(r9)
            java.lang.String r3 = r8.safeProjectSlug(r9)
            java.lang.String r4 = r9.title
            java.lang.String r5 = r9.iconUrl
            r0 = r8
            r6 = r10
            r7 = r11
            ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.installFromProjectVersion(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    private /* synthetic */ void lambda$installNormalVersion$19(ca.dnamobile.javalauncher.modmanager.ModrinthProject r16, java.io.File r17, ca.dnamobile.javalauncher.modmanager.ModrinthVersion r18, ca.dnamobile.javalauncher.modmanager.ModrinthInstallManager.Listener r19) {
            r15 = this;
            r0 = r15
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r1 = r15.resolveSource(r16)
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r2 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.CURSEFORGE
            if (r1 != r2) goto L20
            ca.dnamobile.javalauncher.modmanager.CurseForgeApiClient r3 = new ca.dnamobile.javalauncher.modmanager.CurseForgeApiClient
            r3.<init>(r15)
            java.lang.String r5 = r0.gameVersionId
            java.lang.String r6 = r0.loader
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r7 = r0.contentType
            r4 = r17
            r8 = r16
            r9 = r18
            r10 = r19
            ca.dnamobile.javalauncher.modmanager.CurseForgeInstallManager.installSpecificVersion(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L31
        L20:
            java.lang.String r9 = r0.gameVersionId
            java.lang.String r10 = r0.loader
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r11 = r0.contentType
            r8 = r17
            r12 = r16
            r13 = r18
            r14 = r19
            ca.dnamobile.javalauncher.modmanager.ModrinthInstallManager.installSpecificVersion(r8, r9, r10, r11, r12, r13, r14)
        L31:
            return
    }

    private /* synthetic */ void lambda$loadProject$7(ca.dnamobile.javalauncher.modmanager.ModrinthProject r1, java.util.ArrayList r2) {
            r0 = this;
            r0.bindLoadedProject(r1, r2)
            return
    }

    private /* synthetic */ void lambda$loadProject$8(java.lang.Throwable r4) {
            r3 = this;
            android.widget.TextView r0 = r3.textStatus
            int r1 = ca.dnamobile.javalauncher.R.string.content_project_details_load_failed
            java.lang.String r2 = r4.getMessage()
            if (r2 == 0) goto Lf
            java.lang.String r4 = r4.getMessage()
            goto L17
        Lf:
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
        L17:
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r4 = r3.getString(r1, r4)
            r0.setText(r4)
            return
    }

    private /* synthetic */ void lambda$loadProject$9() {
            r8 = this;
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = r8.source     // Catch: java.lang.Throwable -> L61
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r1 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.CURSEFORGE     // Catch: java.lang.Throwable -> L61
            if (r0 != r1) goto L2d
            ca.dnamobile.javalauncher.modmanager.CurseForgeApiClient r0 = new ca.dnamobile.javalauncher.modmanager.CurseForgeApiClient     // Catch: java.lang.Throwable -> L61
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L61
            java.lang.String r1 = r8.projectId     // Catch: java.lang.Throwable -> L61
            ca.dnamobile.javalauncher.modmanager.ModrinthProject r1 = r0.getProject(r1)     // Catch: java.lang.Throwable -> L61
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2 = r8.contentType     // Catch: java.lang.Throwable -> L61
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r3 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODPACKS     // Catch: java.lang.Throwable -> L61
            if (r2 != r3) goto L1c
            java.util.ArrayList r0 = r8.loadModpackVersionRows(r1)     // Catch: java.lang.Throwable -> L61
            goto L58
        L1c:
            java.lang.String r2 = r8.projectId     // Catch: java.lang.Throwable -> L61
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r3 = r8.contentType     // Catch: java.lang.Throwable -> L61
            java.lang.String r4 = r8.gameVersionId     // Catch: java.lang.Throwable -> L61
            java.lang.String r5 = r8.loader     // Catch: java.lang.Throwable -> L61
            java.util.ArrayList r0 = r0.getProjectVersions(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L61
            java.util.ArrayList r0 = r8.loadNormalVersionRows(r0)     // Catch: java.lang.Throwable -> L61
            goto L58
        L2d:
            ca.dnamobile.javalauncher.modmanager.ModrinthApiClient r1 = new ca.dnamobile.javalauncher.modmanager.ModrinthApiClient     // Catch: java.lang.Throwable -> L61
            r1.<init>()     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = r8.projectId     // Catch: java.lang.Throwable -> L61
            java.lang.String r2 = r8.projectSlug     // Catch: java.lang.Throwable -> L61
            ca.dnamobile.javalauncher.modmanager.ModrinthProject r0 = r1.getProjectWithFallback(r0, r2)     // Catch: java.lang.Throwable -> L61
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2 = r8.contentType     // Catch: java.lang.Throwable -> L61
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r3 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODPACKS     // Catch: java.lang.Throwable -> L61
            if (r2 != r3) goto L45
            java.util.ArrayList r1 = r8.loadModpackVersionRows(r0)     // Catch: java.lang.Throwable -> L61
            goto L55
        L45:
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r3 = r8.contentType     // Catch: java.lang.Throwable -> L61
            java.lang.String r4 = r8.gameVersionId     // Catch: java.lang.Throwable -> L61
            java.lang.String r5 = r8.loader     // Catch: java.lang.Throwable -> L61
            r6 = 1
            r2 = r0
            java.util.ArrayList r1 = r1.getProjectVersionsWithFallback(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L61
            java.util.ArrayList r1 = r8.loadNormalVersionRows(r1)     // Catch: java.lang.Throwable -> L61
        L55:
            r7 = r1
            r1 = r0
            r0 = r7
        L58:
            ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda14 r2 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda14     // Catch: java.lang.Throwable -> L61
            r2.<init>(r8, r1, r0)     // Catch: java.lang.Throwable -> L61
            r8.runOnUiThread(r2)     // Catch: java.lang.Throwable -> L61
            goto L6a
        L61:
            r0 = move-exception
            ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda15 r1 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda15
            r1.<init>(r8, r0)
            r8.runOnUiThread(r1)
        L6a:
            return
    }

    private /* synthetic */ void lambda$setupVersionControls$1(android.view.View r1) {
            r0 = this;
            int r1 = r0.versionCurrentPage
            if (r1 > 0) goto L5
            return
        L5:
            int r1 = r1 + (-1)
            r0.versionCurrentPage = r1
            r0.refreshVisibleVersionPage()
            return
    }

    private /* synthetic */ void lambda$setupVersionControls$2(android.view.View r3) {
            r2 = this;
            java.util.ArrayList<ca.dnamobile.javalauncher.ContentProjectDetailsActivity$VersionRow> r3 = r2.filteredVersionRows
            int r3 = r3.size()
            int r3 = r2.getVersionPageCount(r3)
            int r0 = r2.versionCurrentPage
            int r1 = r0 + 1
            if (r1 < r3) goto L11
            return
        L11:
            int r0 = r0 + 1
            r2.versionCurrentPage = r0
            r2.refreshVisibleVersionPage()
            return
    }

    private /* synthetic */ void lambda$setupVersionControls$3(android.view.View r1) {
            r0 = this;
            r0.showMinecraftVersionFilterDialog()
            return
    }

    private /* synthetic */ void lambda$setupViews$0(android.view.View r1) {
            r0 = this;
            r0.finish()
            return
    }

    private /* synthetic */ void lambda$showMinecraftVersionFilterDialog$4(androidx.appcompat.app.AlertDialog[] r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r2 = r2[r0]
            if (r2 == 0) goto L8
            r2.dismiss()
        L8:
            r1.selectMinecraftVersionFilter(r3)
            return
    }

    private /* synthetic */ void lambda$showMinecraftVersionFilterDialog$5(androidx.appcompat.app.AlertDialog r1, android.content.DialogInterface r2) {
            r0 = this;
            ca.dnamobile.javalauncher.ui.LauncherDialogStyle.styleDialogChrome(r0, r1)
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r0)
            return
    }

    private /* synthetic */ void lambda$showMinecraftVersionFilterDialog$6(android.content.DialogInterface r1) {
            r0 = this;
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r0)
            return
    }

    private /* synthetic */ void lambda$showScreenshotDialog$12(java.lang.String r1, android.content.DialogInterface r2, int r3) {
            r0 = this;
            r0.openRawUrl(r1)
            return
    }

    private /* synthetic */ void lambda$showScreenshotDialog$13(android.content.DialogInterface r1) {
            r0 = this;
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r0)
            return
    }

    private /* synthetic */ void lambda$showScreenshotDialog$14(android.content.DialogInterface r1) {
            r0 = this;
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r0)
            return
    }

    private /* synthetic */ int lambda$sortModpackVersionsNewestFirst$22(ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice r3, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice r4) {
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

    private /* synthetic */ int lambda$sortRowsNewestFirst$21(ca.dnamobile.javalauncher.ContentProjectDetailsActivity.VersionRow r1, ca.dnamobile.javalauncher.ContentProjectDetailsActivity.VersionRow r2) {
            r0 = this;
            java.lang.String r1 = r1.datePublished()
            java.lang.String r2 = r2.datePublished()
            int r1 = r0.compareNullableIsoDatesDescending(r1, r2)
            return r1
    }

    private java.util.ArrayList<ca.dnamobile.javalauncher.ContentProjectDetailsActivity.VersionRow> loadModpackVersionRows(ca.dnamobile.javalauncher.modmanager.ModrinthProject r3) throws java.lang.Exception {
            r2 = this;
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = r2.source
            java.lang.String r1 = r2.safeProjectId(r3)
            java.lang.String r3 = r2.safeProjectSlug(r3)
            java.util.ArrayList r3 = ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.listProjectVersions(r2, r0, r1, r3)
            r2.sortModpackVersionsNewestFirst(r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r3.next()
            ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$ModpackVersionChoice r1 = (ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice) r1
            if (r1 == 0) goto L1a
            ca.dnamobile.javalauncher.ContentProjectDetailsActivity$VersionRow r1 = ca.dnamobile.javalauncher.ContentProjectDetailsActivity.VersionRow.modpack(r1)
            r0.add(r1)
            goto L1a
        L30:
            return r0
    }

    private java.util.ArrayList<ca.dnamobile.javalauncher.ContentProjectDetailsActivity.VersionRow> loadNormalVersionRows(java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModrinthVersion> r3) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r3.next()
            ca.dnamobile.javalauncher.modmanager.ModrinthVersion r1 = (ca.dnamobile.javalauncher.modmanager.ModrinthVersion) r1
            if (r1 == 0) goto L9
            ca.dnamobile.javalauncher.ContentProjectDetailsActivity$VersionRow r1 = ca.dnamobile.javalauncher.ContentProjectDetailsActivity.VersionRow.normal(r1)
            r0.add(r1)
            goto L9
        L1f:
            r2.sortRowsNewestFirst(r0)
            return r0
    }

    private void loadProject() {
            r4 = this;
            java.lang.String r0 = r4.projectId
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L20
            java.lang.String r0 = r4.projectSlug
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L20
            android.widget.TextView r0 = r4.textStatus
            int r1 = ca.dnamobile.javalauncher.R.string.content_project_details_missing_project
            r0.setText(r1)
            return
        L20:
            android.widget.TextView r0 = r4.textStatus
            int r1 = ca.dnamobile.javalauncher.R.string.content_project_details_loading
            r0.setText(r1)
            java.lang.Thread r0 = new java.lang.Thread
            ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda19 r1 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda19
            r1.<init>(r4)
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2 = r4.contentType
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r3 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODPACKS
            if (r2 != r3) goto L37
            java.lang.String r2 = "ModpackProjectDetails"
            goto L39
        L37:
            java.lang.String r2 = "ContentProjectDetails"
        L39:
            r0.<init>(r1, r2)
            r0.start()
            return
    }

    private boolean looksLikeImageUrl(java.lang.String r3) {
            r2 = this;
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = r3.toLowerCase(r0)
            r0 = 63
            int r0 = r3.indexOf(r0)
            r1 = 0
            if (r0 < 0) goto L13
            java.lang.String r3 = r3.substring(r1, r0)
        L13:
            r0 = 35
            int r0 = r3.indexOf(r0)
            if (r0 < 0) goto L1f
            java.lang.String r3 = r3.substring(r1, r0)
        L1f:
            java.lang.String r0 = ".png"
            boolean r0 = r3.endsWith(r0)
            if (r0 != 0) goto L47
            java.lang.String r0 = ".jpg"
            boolean r0 = r3.endsWith(r0)
            if (r0 != 0) goto L47
            java.lang.String r0 = ".jpeg"
            boolean r0 = r3.endsWith(r0)
            if (r0 != 0) goto L47
            java.lang.String r0 = ".webp"
            boolean r0 = r3.endsWith(r0)
            if (r0 != 0) goto L47
            java.lang.String r0 = ".gif"
            boolean r3 = r3.endsWith(r0)
            if (r3 == 0) goto L48
        L47:
            r1 = 1
        L48:
            return r1
    }

    private boolean matchesMinecraftVersionFilter(ca.dnamobile.javalauncher.ContentProjectDetailsActivity.VersionRow r4, java.lang.String r5) {
            r3 = this;
            java.lang.String r0 = "All Minecraft versions"
            boolean r0 = r0.equals(r5)
            r1 = 1
            if (r0 == 0) goto La
            return r1
        La:
            java.util.ArrayList r4 = r4.minecraftVersions()
            java.util.Iterator r4 = r4.iterator()
        L12:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L31
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r3.normalizeMinecraftVersionKey(r0)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L2a
            java.lang.String r0 = "Unknown Minecraft version"
        L2a:
            boolean r0 = r5.equalsIgnoreCase(r0)
            if (r0 == 0) goto L12
            return r1
        L31:
            r4 = 0
            return r4
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

    private void openRawUrl(java.lang.String r4) {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent     // Catch: android.content.ActivityNotFoundException -> Lf
            java.lang.String r1 = "android.intent.action.VIEW"
            android.net.Uri r2 = android.net.Uri.parse(r4)     // Catch: android.content.ActivityNotFoundException -> Lf
            r0.<init>(r1, r2)     // Catch: android.content.ActivityNotFoundException -> Lf
            r3.startActivity(r0)     // Catch: android.content.ActivityNotFoundException -> Lf
            goto L17
        Lf:
            r0 = 1
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r0)
            r4.show()
        L17:
            return
    }

    private void openWebsite(ca.dnamobile.javalauncher.modmanager.ModrinthProject r1) {
            r0 = this;
            java.lang.String r1 = r1.getWebsiteUrl()
            r0.openRawUrl(r1)
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
            java.lang.String r0 = "ca.dnamobile.javalauncher.extra.GAME_DIRECTORY"
            java.lang.String r0 = r3.safeExtra(r0, r1)
            r3.gameDirectoryPath = r0
            java.lang.String r0 = "ca.dnamobile.javalauncher.extra.PROJECT_ID"
            java.lang.String r0 = r3.safeExtra(r0, r1)
            r3.projectId = r0
            java.lang.String r0 = "ca.dnamobile.javalauncher.extra.PROJECT_SLUG"
            java.lang.String r0 = r3.safeExtra(r0, r1)
            r3.projectSlug = r0
            java.lang.String r0 = "ca.dnamobile.javalauncher.extra.CONTENT_CATEGORY"
            java.lang.String r0 = r3.safeExtra(r0, r1)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L68
            java.lang.String r0 = "ca.dnamobile.javalauncher.extra.PROJECT_TYPE"
            java.lang.String r1 = "mods"
            java.lang.String r0 = r3.safeExtra(r0, r1)
        L68:
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.fromValue(r0)
            r3.contentType = r0
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.MODRINTH
            java.lang.String r0 = r0.getId()
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.PROJECT_SOURCE"
            java.lang.String r0 = r3.safeExtra(r1, r0)
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.fromId(r0)
            r3.source = r0
            return
    }

    private java.lang.String reflectedString(java.lang.Object r3, java.lang.String r4) {
            r2 = this;
            java.lang.String r0 = ""
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L19
            java.lang.reflect.Field r4 = r1.getField(r4)     // Catch: java.lang.Throwable -> L19
            java.lang.Object r3 = r4.get(r3)     // Catch: java.lang.Throwable -> L19
            if (r3 != 0) goto L11
            goto L19
        L11:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = r3.trim()     // Catch: java.lang.Throwable -> L19
        L19:
            return r0
    }

    private java.util.ArrayList<java.lang.String> reflectedStringList(java.lang.Object r3, java.lang.String r4) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L3a
            java.lang.reflect.Field r4 = r1.getField(r4)     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r3 = r4.get(r3)     // Catch: java.lang.Throwable -> L3a
            boolean r4 = r3 instanceof java.lang.Iterable     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L3a
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch: java.lang.Throwable -> L3a
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L3a
        L1b:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L3a
            if (r4 != 0) goto L28
            goto L1b
        L28:
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = r4.trim()     // Catch: java.lang.Throwable -> L3a
            boolean r1 = r4.isEmpty()     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L1b
            r0.add(r4)     // Catch: java.lang.Throwable -> L3a
            goto L1b
        L3a:
            return r0
    }

    private void refreshVisibleVersionPage() {
            r7 = this;
            java.util.ArrayList<ca.dnamobile.javalauncher.ContentProjectDetailsActivity$VersionRow> r0 = r7.filteredVersionRows
            int r0 = r0.size()
            int r0 = r7.getVersionPageCount(r0)
            int r1 = r7.versionCurrentPage
            if (r1 < r0) goto L12
            int r1 = r0 + (-1)
            r7.versionCurrentPage = r1
        L12:
            int r1 = r7.versionCurrentPage
            r2 = 0
            if (r1 >= 0) goto L19
            r7.versionCurrentPage = r2
        L19:
            int r1 = r7.versionCurrentPage
            int r1 = r1 * 10
            int r3 = r1 + 10
            java.util.ArrayList<ca.dnamobile.javalauncher.ContentProjectDetailsActivity$VersionRow> r4 = r7.filteredVersionRows
            int r4 = r4.size()
            int r3 = java.lang.Math.min(r3, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r1 >= r3) goto L39
            java.util.ArrayList<ca.dnamobile.javalauncher.ContentProjectDetailsActivity$VersionRow> r5 = r7.filteredVersionRows
            java.util.List r5 = r5.subList(r1, r3)
            r4.addAll(r5)
        L39:
            ca.dnamobile.javalauncher.ContentProjectDetailsActivity$VersionAdapter r5 = r7.adapter
            r5.submit(r4)
            com.google.android.material.button.MaterialButton r4 = r7.buttonVersionPagePrevious
            int r5 = r7.versionCurrentPage
            r6 = 1
            if (r5 <= 0) goto L47
            r5 = r6
            goto L48
        L47:
            r5 = r2
        L48:
            r4.setEnabled(r5)
            com.google.android.material.button.MaterialButton r4 = r7.buttonVersionPageNext
            int r5 = r7.versionCurrentPage
            int r5 = r5 + r6
            if (r5 >= r0) goto L53
            r2 = r6
        L53:
            r4.setEnabled(r2)
            android.widget.TextView r2 = r7.textVersionPageIndicator
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Page "
            r4.<init>(r5)
            int r5 = r7.versionCurrentPage
            int r5 = r5 + r6
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = " of "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r0 = r4.append(r0)
            java.lang.String r0 = r0.toString()
            r2.setText(r0)
            android.widget.TextView r0 = r7.textVersionFilterSummary
            java.lang.String r1 = r7.buildVersionFilterSummary(r1, r3)
            r0.setText(r1)
            return
    }

    private ca.dnamobile.javalauncher.modmanager.ModManagerSource resolveSource(ca.dnamobile.javalauncher.modmanager.ModrinthProject r3) {
            r2 = this;
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = r3.source
            if (r0 == 0) goto Le
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = r3.source
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r1 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.UNKNOWN
            if (r0 != r1) goto Lb
            goto Le
        Lb:
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r3 = r3.source
            goto L10
        Le:
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r3 = r2.source
        L10:
            return r3
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

    private java.lang.String safeProjectId(ca.dnamobile.javalauncher.modmanager.ModrinthProject r2) {
            r1 = this;
            java.lang.String r0 = r2.projectId
            if (r0 != 0) goto L7
            java.lang.String r2 = ""
            goto Ld
        L7:
            java.lang.String r2 = r2.projectId
            java.lang.String r2 = r2.trim()
        Ld:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L15
            java.lang.String r2 = r1.projectId
        L15:
            return r2
    }

    private java.lang.String safeProjectSlug(ca.dnamobile.javalauncher.modmanager.ModrinthProject r2) {
            r1 = this;
            java.lang.String r0 = r2.slug
            if (r0 != 0) goto L7
            java.lang.String r2 = ""
            goto Ld
        L7:
            java.lang.String r2 = r2.slug
            java.lang.String r2 = r2.trim()
        Ld:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L15
            java.lang.String r2 = r1.projectSlug
        L15:
            return r2
    }

    private java.lang.String sanitizeDescriptionText(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = ""
            if (r7 != 0) goto L5
            return r0
        L5:
            java.lang.String r7 = r7.trim()
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L10
            return r0
        L10:
            java.lang.String r1 = "\\r?\\n"
            java.lang.String[] r7 = r7.split(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r7.length
            r3 = 0
        L1d:
            if (r3 >= r2) goto L41
            r4 = r7[r3]
            if (r4 != 0) goto L25
            r5 = r0
            goto L29
        L25:
            java.lang.String r5 = r4.trim()
        L29:
            boolean r5 = r6.isStandaloneImageReference(r5)
            if (r5 == 0) goto L30
            goto L3e
        L30:
            int r5 = r1.length()
            if (r5 <= 0) goto L3b
            r5 = 10
            r1.append(r5)
        L3b:
            r1.append(r4)
        L3e:
            int r3 = r3 + 1
            goto L1d
        L41:
            java.lang.String r7 = r1.toString()
            java.lang.String r7 = r7.trim()
            return r7
    }

    private void selectMinecraftVersionFilter(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r2.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            java.lang.String r2 = "All Minecraft versions"
            goto L11
        Ld:
            java.lang.String r2 = r2.trim()
        L11:
            r1.selectedMinecraftVersionFilter = r2
            r1.updateMinecraftVersionButtonText()
            r2 = 0
            r1.versionCurrentPage = r2
            r1.applyVersionFilter()
            return
    }

    private void setDescriptionTextTopMargin(int r3) {
            r2 = this;
            android.widget.TextView r0 = r2.textDescription
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r1 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L13
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            r0.topMargin = r3
            android.widget.TextView r3 = r2.textDescription
            r3.setLayoutParams(r0)
        L13:
            return
    }

    private void setTabText(int r2, java.lang.String r3) {
            r1 = this;
            com.google.android.material.tabs.TabLayout r0 = r1.tabSections
            com.google.android.material.tabs.TabLayout$Tab r2 = r0.getTabAt(r2)
            if (r2 == 0) goto Lb
            r2.setText(r3)
        Lb:
            return
    }

    private void setupMinecraftVersionFilter(java.util.ArrayList<ca.dnamobile.javalauncher.ContentProjectDetailsActivity.VersionRow> r6) {
            r5 = this;
            java.util.ArrayList<java.lang.String> r0 = r5.versionMinecraftFilters
            r0.clear()
            java.util.ArrayList<java.lang.String> r0 = r5.versionMinecraftFilters
            java.lang.String r1 = "All Minecraft versions"
            r0.add(r1)
            java.util.Iterator r0 = r6.iterator()
        L10:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4a
            java.lang.Object r2 = r0.next()
            ca.dnamobile.javalauncher.ContentProjectDetailsActivity$VersionRow r2 = (ca.dnamobile.javalauncher.ContentProjectDetailsActivity.VersionRow) r2
            java.util.ArrayList r2 = r2.minecraftVersions()
            java.util.Iterator r2 = r2.iterator()
        L24:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L10
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = r5.normalizeMinecraftVersionKey(r3)
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L3c
            java.lang.String r3 = "Unknown Minecraft version"
        L3c:
            java.util.ArrayList<java.lang.String> r4 = r5.versionMinecraftFilters
            boolean r4 = r5.containsIgnoreCase(r4, r3)
            if (r4 != 0) goto L24
            java.util.ArrayList<java.lang.String> r4 = r5.versionMinecraftFilters
            r4.add(r3)
            goto L24
        L4a:
            java.util.ArrayList<java.lang.String> r0 = r5.versionMinecraftFilters
            int r0 = r0.size()
            r2 = 2
            r3 = 1
            if (r0 <= r2) goto L7a
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.ArrayList<java.lang.String> r2 = r5.versionMinecraftFilters
            int r4 = r2.size()
            java.util.List r2 = r2.subList(r3, r4)
            r0.<init>(r2)
            ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda0 r2 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda0
            r2.<init>(r5)
            java.util.Collections.sort(r0, r2)
            java.util.ArrayList<java.lang.String> r2 = r5.versionMinecraftFilters
            r2.clear()
            java.util.ArrayList<java.lang.String> r2 = r5.versionMinecraftFilters
            r2.add(r1)
            java.util.ArrayList<java.lang.String> r1 = r5.versionMinecraftFilters
            r1.addAll(r0)
        L7a:
            int r0 = r5.getDefaultMinecraftFilterIndex()
            if (r0 < 0) goto L88
            java.util.ArrayList<java.lang.String> r1 = r5.versionMinecraftFilters
            int r1 = r1.size()
            if (r0 < r1) goto L89
        L88:
            r0 = 0
        L89:
            java.util.ArrayList<java.lang.String> r1 = r5.versionMinecraftFilters
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r5.selectedMinecraftVersionFilter = r0
            r5.updateMinecraftVersionButtonText()
            com.google.android.material.button.MaterialButton r0 = r5.buttonVersionMinecraft
            boolean r6 = r6.isEmpty()
            r6 = r6 ^ r3
            r0.setEnabled(r6)
            return
    }

    private void setupTabs() {
            r3 = this;
            com.google.android.material.tabs.TabLayout r0 = r3.tabSections
            r0.removeAllTabs()
            com.google.android.material.tabs.TabLayout r0 = r3.tabSections
            com.google.android.material.tabs.TabLayout$Tab r1 = r0.newTab()
            java.lang.String r2 = "Description"
            com.google.android.material.tabs.TabLayout$Tab r1 = r1.setText(r2)
            r0.addTab(r1)
            com.google.android.material.tabs.TabLayout r0 = r3.tabSections
            com.google.android.material.tabs.TabLayout$Tab r1 = r0.newTab()
            java.lang.String r2 = "Versions"
            com.google.android.material.tabs.TabLayout$Tab r1 = r1.setText(r2)
            r0.addTab(r1)
            com.google.android.material.tabs.TabLayout r0 = r3.tabSections
            com.google.android.material.tabs.TabLayout$Tab r1 = r0.newTab()
            java.lang.String r2 = "Gallery"
            com.google.android.material.tabs.TabLayout$Tab r1 = r1.setText(r2)
            r0.addTab(r1)
            com.google.android.material.tabs.TabLayout r0 = r3.tabSections
            ca.dnamobile.javalauncher.ContentProjectDetailsActivity$1 r1 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$1
            r1.<init>(r3)
            r0.addOnTabSelectedListener(r1)
            r0 = 0
            r3.showSection(r0)
            return
    }

    private void setupVersionControls() {
            r3 = this;
            com.google.android.material.button.MaterialButton r0 = r3.buttonVersionPagePrevious
            r1 = 0
            r0.setFocusable(r1)
            com.google.android.material.button.MaterialButton r0 = r3.buttonVersionPagePrevious
            r0.setFocusableInTouchMode(r1)
            com.google.android.material.button.MaterialButton r0 = r3.buttonVersionPageNext
            r0.setFocusable(r1)
            com.google.android.material.button.MaterialButton r0 = r3.buttonVersionPageNext
            r0.setFocusableInTouchMode(r1)
            com.google.android.material.button.MaterialButton r0 = r3.buttonVersionPagePrevious
            ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda8 r2 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda8
            r2.<init>(r3)
            r0.setOnClickListener(r2)
            com.google.android.material.button.MaterialButton r0 = r3.buttonVersionPageNext
            ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda9 r2 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda9
            r2.<init>(r3)
            r0.setOnClickListener(r2)
            com.google.android.material.button.MaterialButton r0 = r3.buttonVersionMinecraft
            r0.setFocusable(r1)
            com.google.android.material.button.MaterialButton r0 = r3.buttonVersionMinecraft
            r0.setFocusableInTouchMode(r1)
            com.google.android.material.button.MaterialButton r0 = r3.buttonVersionMinecraft
            r0.setEnabled(r1)
            com.google.android.material.button.MaterialButton r0 = r3.buttonVersionMinecraft
            java.lang.String r2 = "All Minecraft versions"
            r0.setText(r2)
            com.google.android.material.button.MaterialButton r0 = r3.buttonVersionMinecraft
            ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda10 r2 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda10
            r2.<init>(r3)
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r3.textVersionFilterSummary
            java.lang.String r2 = "Loading versions..."
            r0.setText(r2)
            android.widget.TextView r0 = r3.textVersionPageIndicator
            java.lang.String r2 = "Page 1 of 1"
            r0.setText(r2)
            com.google.android.material.button.MaterialButton r0 = r3.buttonVersionPagePrevious
            r0.setEnabled(r1)
            com.google.android.material.button.MaterialButton r0 = r3.buttonVersionPageNext
            r0.setEnabled(r1)
            return
    }

    private void setupViews() {
            r4 = this;
            com.google.android.material.button.MaterialButton r0 = r4.buttonBack
            ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda18 r1 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda18
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            com.google.android.material.button.MaterialButton r0 = r4.buttonOpenWebsite
            r1 = 0
            r0.setEnabled(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r4.recyclerVersions
            androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
            r2.<init>(r4)
            r0.setLayoutManager(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r4.recyclerVersions
            r0.setNestedScrollingEnabled(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r4.recyclerVersions
            ca.dnamobile.javalauncher.ContentProjectDetailsActivity$VersionAdapter r2 = r4.adapter
            r0.setAdapter(r2)
            r4.setupVersionControls()
            int r0 = r4.getGalleryColumnCount()
            androidx.recyclerview.widget.RecyclerView r2 = r4.recyclerGallery
            androidx.recyclerview.widget.GridLayoutManager r3 = new androidx.recyclerview.widget.GridLayoutManager
            r3.<init>(r4, r0)
            r2.setLayoutManager(r3)
            androidx.recyclerview.widget.RecyclerView r0 = r4.recyclerGallery
            r0.setNestedScrollingEnabled(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r4.recyclerGallery
            ca.dnamobile.javalauncher.ContentProjectDetailsActivity$GalleryAdapter r1 = r4.galleryAdapter
            r0.setAdapter(r1)
            r4.setupTabs()
            android.widget.TextView r0 = r4.textTitle
            int r1 = ca.dnamobile.javalauncher.R.string.content_project_details_loading
            java.lang.String r1 = r4.getString(r1)
            java.lang.String r2 = "ca.dnamobile.javalauncher.extra.PROJECT_TITLE"
            java.lang.String r1 = r4.safeExtra(r2, r1)
            r0.setText(r1)
            android.widget.TextView r0 = r4.textMeta
            java.lang.String r1 = r4.buildInitialMetaLine()
            r0.setText(r1)
            android.widget.ImageView r0 = r4.imageDescriptionMain
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r4.textDescription
            java.lang.String r1 = ""
            r0.setText(r1)
            android.widget.TextView r0 = r4.textGallery
            r0.setText(r1)
            android.widget.TextView r0 = r4.textStatus
            int r2 = ca.dnamobile.javalauncher.R.string.content_project_details_loading
            r0.setText(r2)
            java.lang.String r0 = "ca.dnamobile.javalauncher.extra.PROJECT_ICON_URL"
            java.lang.String r0 = r4.safeExtra(r0, r1)
            android.widget.ImageView r1 = r4.imageProjectIcon
            int r2 = r4.getFallbackIcon()
            ca.dnamobile.javalauncher.modmanager.NetworkImageLoader.load(r1, r0, r2)
            return
    }

    private void showMinecraftVersionFilterDialog() {
            r8 = this;
            java.util.ArrayList<java.lang.String> r0 = r8.versionMinecraftFilters
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            return
        L9:
            java.lang.String r0 = "Pick Minecraft Version"
            java.lang.String r1 = "Choose the Minecraft version to show. Versions are limited to 10 per page after this filter is applied."
            android.widget.LinearLayout r0 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.createDialogRoot(r8, r0, r1)
            androidx.recyclerview.widget.RecyclerView r1 = new androidx.recyclerview.widget.RecyclerView
            r1.<init>(r8)
            androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
            r2.<init>(r8)
            r1.setLayoutManager(r2)
            r2 = 1
            r1.setNestedScrollingEnabled(r2)
            r3 = 0
            r1.setClipToPadding(r3)
            r4 = 8
            int r4 = r8.dp(r4)
            r5 = 12
            int r5 = r8.dp(r5)
            r1.setPadding(r3, r4, r3, r5)
            androidx.appcompat.app.AlertDialog[] r2 = new androidx.appcompat.app.AlertDialog[r2]
            ca.dnamobile.javalauncher.ContentProjectDetailsActivity$MinecraftVersionFilterDialogAdapter r4 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$MinecraftVersionFilterDialogAdapter
            java.util.ArrayList<java.lang.String> r5 = r8.versionMinecraftFilters
            java.lang.String r6 = r8.getSelectedMinecraftVersionFilter()
            ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda11 r7 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda11
            r7.<init>(r8, r2)
            r4.<init>(r8, r5, r6, r7)
            r1.setAdapter(r4)
            android.content.res.Resources r4 = r8.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r4 = r4.heightPixels
            r5 = 260(0x104, float:3.64E-43)
            int r5 = r8.dp(r5)
            r6 = 300(0x12c, float:4.2E-43)
            int r6 = r8.dp(r6)
            int r4 = r4 - r6
            int r4 = java.lang.Math.max(r5, r4)
            r5 = 540(0x21c, float:7.57E-43)
            int r5 = r8.dp(r5)
            int r4 = java.lang.Math.min(r4, r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r6 = -1
            r5.<init>(r6, r4)
            r4 = 4
            int r4 = r8.dp(r4)
            r5.topMargin = r4
            r0.addView(r1, r5)
            androidx.appcompat.app.AlertDialog$Builder r1 = new androidx.appcompat.app.AlertDialog$Builder
            r1.<init>(r8)
            androidx.appcompat.app.AlertDialog$Builder r0 = r1.setView(r0)
            r1 = 17039360(0x1040000, float:2.424457E-38)
            r4 = 0
            androidx.appcompat.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r4)
            androidx.appcompat.app.AlertDialog r0 = r0.create()
            r2[r3] = r0
            ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda16 r1 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda16
            r1.<init>(r8, r0)
            r0.setOnShowListener(r1)
            ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda17 r1 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda17
            r1.<init>(r8)
            r0.setOnDismissListener(r1)
            r0.show()
            ca.dnamobile.javalauncher.ui.LauncherDialogStyle.styleDialogChrome(r8, r0)
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r8)
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

    private void showScreenshotDialog(java.lang.String r8, int r9, int r10) {
            r7 = this;
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r7)
            r1 = 12
            int r1 = r7.dp(r1)
            r2 = 0
            r0.setPadding(r1, r1, r1, r2)
            android.widget.ImageView r1 = new android.widget.ImageView
            r1.<init>(r7)
            r2 = 1
            r1.setAdjustViewBounds(r2)
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.FIT_CENTER
            r1.setScaleType(r3)
            r3 = 260(0x104, float:3.64E-43)
            int r4 = r7.dp(r3)
            android.content.res.Resources r5 = r7.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            int r5 = r5.heightPixels
            int r3 = r7.dp(r3)
            int r5 = r5 - r3
            int r3 = java.lang.Math.max(r4, r5)
            r4 = 620(0x26c, float:8.69E-43)
            int r4 = r7.dp(r4)
            int r3 = java.lang.Math.min(r3, r4)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r5 = -1
            r6 = 17
            r4.<init>(r5, r3, r6)
            r0.addView(r1, r4)
            int r3 = r7.getFallbackIcon()
            ca.dnamobile.javalauncher.modmanager.NetworkImageLoader.load(r1, r8, r3)
            androidx.appcompat.app.AlertDialog$Builder r1 = new androidx.appcompat.app.AlertDialog$Builder
            r1.<init>(r7)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Screenshot "
            r3.<init>(r4)
            int r9 = r9 + r2
            java.lang.StringBuilder r9 = r3.append(r9)
            java.lang.String r2 = " of "
            java.lang.StringBuilder r9 = r9.append(r2)
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            androidx.appcompat.app.AlertDialog$Builder r9 = r1.setTitle(r9)
            androidx.appcompat.app.AlertDialog$Builder r9 = r9.setView(r0)
            java.lang.String r10 = "Close"
            r0 = 0
            androidx.appcompat.app.AlertDialog$Builder r9 = r9.setNegativeButton(r10, r0)
            ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda3 r10 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda3
            r10.<init>(r7, r8)
            java.lang.String r8 = "Open image"
            androidx.appcompat.app.AlertDialog$Builder r8 = r9.setPositiveButton(r8, r10)
            androidx.appcompat.app.AlertDialog r8 = r8.create()
            ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda4 r9 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda4
            r9.<init>(r7)
            r8.setOnShowListener(r9)
            ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda5 r9 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda5
            r9.<init>(r7)
            r8.setOnDismissListener(r9)
            r8.show()
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r7)
            return
    }

    private void showSection(int r5) {
            r4 = this;
            android.view.View r0 = r4.sectionDescription
            r1 = 0
            r2 = 8
            if (r5 != 0) goto L9
            r3 = r1
            goto La
        L9:
            r3 = r2
        La:
            r0.setVisibility(r3)
            android.view.View r0 = r4.sectionVersions
            r3 = 1
            if (r5 != r3) goto L14
            r3 = r1
            goto L15
        L14:
            r3 = r2
        L15:
            r0.setVisibility(r3)
            android.view.View r0 = r4.sectionGallery
            r3 = 2
            if (r5 != r3) goto L1e
            goto L1f
        L1e:
            r1 = r2
        L1f:
            r0.setVisibility(r1)
            return
    }

    private void sortModpackVersionsNewestFirst(java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice> r2) {
            r1 = this;
            ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda20 r0 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda20
            r0.<init>(r1)
            java.util.Collections.sort(r2, r0)
            return
    }

    private void sortRowsNewestFirst(java.util.ArrayList<ca.dnamobile.javalauncher.ContentProjectDetailsActivity.VersionRow> r2) {
            r1 = this;
            ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda6 r0 = new ca.dnamobile.javalauncher.ContentProjectDetailsActivity$$ExternalSyntheticLambda6
            r0.<init>(r1)
            java.util.Collections.sort(r2, r0)
            return
    }

    private void submitVersionRows(java.util.ArrayList<ca.dnamobile.javalauncher.ContentProjectDetailsActivity.VersionRow> r2) {
            r1 = this;
            java.util.ArrayList<ca.dnamobile.javalauncher.ContentProjectDetailsActivity$VersionRow> r0 = r1.allVersionRows
            r0.clear()
            java.util.ArrayList<ca.dnamobile.javalauncher.ContentProjectDetailsActivity$VersionRow> r0 = r1.allVersionRows
            r0.addAll(r2)
            r0 = 0
            r1.versionCurrentPage = r0
            r1.setupMinecraftVersionFilter(r2)
            r1.applyVersionFilter()
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

    private void updateMinecraftVersionButtonText() {
            r2 = this;
            java.lang.String r0 = r2.getSelectedMinecraftVersionFilter()
            com.google.android.material.button.MaterialButton r1 = r2.buttonVersionMinecraft
            r1.setText(r0)
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

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r0)
            int r1 = ca.dnamobile.javalauncher.R.layout.activity_content_project_details
            r0.setContentView(r1)
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r0)
            r0.readExtras()
            r0.bindViews()
            r0.setupViews()
            r0.loadProject()
            return
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
            r0 = this;
            r0.dismissModpackInstallDialog()
            super.onDestroy()
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
