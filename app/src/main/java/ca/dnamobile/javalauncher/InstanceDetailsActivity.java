package ca.dnamobile.javalauncher;

/* JADX INFO: loaded from: classes.dex */
public final class InstanceDetailsActivity extends androidx.appcompat.app.AppCompatActivity {
    public static final java.lang.String EXTRA_BASE_VERSION_ID = "ca.dnamobile.javalauncher.extra.BASE_VERSION_ID";
    public static final java.lang.String EXTRA_CONTENT_CATEGORY = "ca.dnamobile.javalauncher.extra.CONTENT_CATEGORY";
    public static final java.lang.String EXTRA_GAME_DIRECTORY = "ca.dnamobile.javalauncher.extra.GAME_DIRECTORY";
    public static final java.lang.String EXTRA_ICON_FILE = "ca.dnamobile.javalauncher.extra.ICON_FILE";
    public static final java.lang.String EXTRA_INSTANCE_ID = "ca.dnamobile.javalauncher.extra.INSTANCE_ID";
    public static final java.lang.String EXTRA_INSTANCE_LOADER = "ca.dnamobile.javalauncher.extra.INSTANCE_LOADER";
    public static final java.lang.String EXTRA_INSTANCE_NAME = "ca.dnamobile.javalauncher.extra.INSTANCE_NAME";
    public static final java.lang.String EXTRA_ISOLATED = "ca.dnamobile.javalauncher.extra.ISOLATED";
    public static final java.lang.String EXTRA_MINECRAFT_VERSION_ID = "ca.dnamobile.javalauncher.extra.MINECRAFT_VERSION_ID";
    public static final java.lang.String EXTRA_ROOT_DIRECTORY = "ca.dnamobile.javalauncher.extra.ROOT_DIRECTORY";
    public static final java.lang.String EXTRA_VERSION_TYPE = "ca.dnamobile.javalauncher.extra.VERSION_TYPE";
    private static final int MENU_DELETE_INSTANCE = 2;
    private static final int MENU_EDIT_INSTANCE_ICON = 4;
    private static final int MENU_EDIT_INSTANCE_NAME = 3;
    private static final int MENU_EXPORT_MODPACK = 5;
    private static final int MENU_IMPORT_MODPACK = 8;
    private static final int MENU_PER_INSTANCE_SETTINGS = 9;
    private static final int MENU_REPAIR_INSTANCE = 10;
    private static final int MENU_UPDATE_LOADER = 7;
    private static final int MENU_UPDATE_MODPACK = 11;
    private static final int MENU_UPDATE_VERSION = 6;
    private static final int MENU_VIEW_FOLDER = 1;
    private static final int MODPACK_ACCENT = 0;
    private static final int MODPACK_CARD_BG = 0;
    private static final int MODPACK_CARD_BG_PRESSED = 0;
    private static final int MODPACK_CARD_STROKE = 0;
    private static final int MODPACK_DIALOG_BG = 0;
    private static final int MODPACK_TEXT_MUTED = 0;
    private static final int MODPACK_TEXT_PRIMARY = 0;
    private static final int MODPACK_TEXT_SECONDARY = 0;
    private static final int REQUEST_EXPORT_MODPACK = 9126;
    private static final int REQUEST_EXPORT_WORLD = 9128;
    private static final int REQUEST_IMPORT_MODPACK = 9127;
    private static final int REQUEST_PICK_CONTENT = 9124;
    private static final int REQUEST_PICK_INSTANCE_ICON = 9125;
    private static final int REQUEST_UPDATE_MODPACK = 9129;
    private static final java.lang.String TAG = "InstanceDetails";
    private ca.dnamobile.javalauncher.data.AccountStore accountStore;
    private final java.util.ArrayList<ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem> allContentItems;
    private ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal authManager;
    private java.lang.String baseVersionId;
    private ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding binding;
    private ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentAdapter contentAdapter;
    private final java.util.ArrayList<ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem> contentItems;
    private android.widget.TextView contentLoadingMessage;
    private android.view.View contentLoadingOverlay;
    private android.widget.TextView contentLoadingTitle;
    private final java.util.concurrent.ExecutorService contentOperationExecutor;
    private boolean contentOperationRunning;
    private final java.util.concurrent.ExecutorService contentRefreshExecutor;
    private int contentRefreshGeneration;
    private boolean contentRefreshRunning;
    private boolean contentSearchFilterApplyQueued;
    private final java.util.Map<java.lang.String, java.lang.String> contentSearchMetadata;
    private java.lang.String contentSearchQuery;
    private java.io.File gameDirectory;
    private final java.util.concurrent.ExecutorService iconExecutor;
    private java.io.File iconFile;
    private java.lang.String instanceId;
    private java.lang.String instanceName;
    private boolean isolated;
    private java.lang.String loader;
    private final android.os.Handler mainHandler;
    private java.lang.String minecraftVersionId;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> mobileGluesFolderPickerLauncher;
    private java.io.File modsDirectory;
    private java.lang.Runnable pendingAfterMicrosoftSignIn;
    private java.lang.Runnable pendingContentLoadingRunnable;
    private ca.dnamobile.javalauncher.modmanager.ModpackExportManager.ExportOptions pendingExportOptions;
    private ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform pendingExportPlatform;
    private ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory pendingImportCategory;
    private java.lang.Runnable pendingMetadataSearchFilterRunnable;
    private java.lang.String pendingMobileGluesQuickPlayWorldFolderName;
    private java.io.File pendingWorldExportDirectory;
    private java.io.File resourcepacksDirectory;
    private java.io.File rootDirectory;
    private ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory selectedCategory;
    private java.io.File shaderpacksDirectory;
    private boolean skipNextResumeContentRefresh;
    private final java.util.Map<java.lang.String, ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.UpdateCandidate> updateCandidates;
    private final java.util.Map<java.lang.String, java.lang.String> updateMessages;
    private android.widget.ProgressBar updateProgressBar;
    private android.app.AlertDialog updateProgressDialog;
    private android.widget.TextView updateProgressMessage;
    private final java.util.Map<java.lang.String, ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState> updateStates;
    private java.lang.String versionType;
    private java.io.File worldsDirectory;


    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.InstanceDetailsActivity$10, reason: invalid class name */
    class AnonymousClass10 implements ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.Listener {
        final /* synthetic */ ca.dnamobile.javalauncher.InstanceDetailsActivity this$0;

        public static /* synthetic */ void $r8$lambda$7WxOEsUCnc0NF4dzNBYwsA3ijiU(ca.dnamobile.javalauncher.InstanceDetailsActivity.AnonymousClass10 r0, int r1, int r2) {
                r0.lambda$onProgress$1(r1, r2)
                return
        }

        public static /* synthetic */ void $r8$lambda$lWvIA9Ft9X9at46ymvnbgJZJ6wY(ca.dnamobile.javalauncher.InstanceDetailsActivity.AnonymousClass10 r0, java.lang.String r1) {
                r0.lambda$onStatus$0(r1)
                return
        }

        AnonymousClass10(ca.dnamobile.javalauncher.InstanceDetailsActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        private /* synthetic */ void lambda$onProgress$1(int r2, int r3) {
                r1 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r1.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity.m243$$Nest$msetUpdateProgress(r0, r2, r3)
                return
        }

        private /* synthetic */ void lambda$onStatus$0(java.lang.String r2) {
                r1 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r1.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity.m244$$Nest$msetUpdateProgressMessage(r0, r2)
                return
        }

        @Override // ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.Listener
        public void onProgress(int r3, int r4) {
                r2 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity$10$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$10$$ExternalSyntheticLambda0
                r1.<init>(r2, r3, r4)
                r0.runOnUiThread(r1)
                return
        }

        @Override // ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.Listener
        public void onStatus(java.lang.String r3) {
                r2 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity$10$$ExternalSyntheticLambda1 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$10$$ExternalSyntheticLambda1
                r1.<init>(r2, r3)
                r0.runOnUiThread(r1)
                return
        }
    }



    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.InstanceDetailsActivity$13, reason: invalid class name */
    class AnonymousClass13 implements ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.Listener {
        final /* synthetic */ ca.dnamobile.javalauncher.InstanceDetailsActivity this$0;

        public static /* synthetic */ void $r8$lambda$Kl_vVLoVy4ZxSyAOKasX4bGTqk0(ca.dnamobile.javalauncher.InstanceDetailsActivity.AnonymousClass13 r0, java.lang.String r1) {
                r0.lambda$onStatus$0(r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$nu7Or3QIFJ3KAOlDS7uKEflunFc(ca.dnamobile.javalauncher.InstanceDetailsActivity.AnonymousClass13 r0, int r1, int r2) {
                r0.lambda$onProgress$1(r1, r2)
                return
        }

        AnonymousClass13(ca.dnamobile.javalauncher.InstanceDetailsActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        private /* synthetic */ void lambda$onProgress$1(int r2, int r3) {
                r1 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r1.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity.m243$$Nest$msetUpdateProgress(r0, r2, r3)
                return
        }

        private /* synthetic */ void lambda$onStatus$0(java.lang.String r2) {
                r1 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r1.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity.m244$$Nest$msetUpdateProgressMessage(r0, r2)
                return
        }

        @Override // ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.Listener
        public void onProgress(int r3, int r4) {
                r2 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity$13$$ExternalSyntheticLambda1 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$13$$ExternalSyntheticLambda1
                r1.<init>(r2, r3, r4)
                r0.runOnUiThread(r1)
                return
        }

        @Override // ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.Listener
        public void onStatus(java.lang.String r3) {
                r2 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity$13$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$13$$ExternalSyntheticLambda0
                r1.<init>(r2, r3)
                r0.runOnUiThread(r1)
                return
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.InstanceDetailsActivity$14, reason: invalid class name */
    class AnonymousClass14 implements ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.Listener {
        final /* synthetic */ ca.dnamobile.javalauncher.InstanceDetailsActivity this$0;

        /* JADX INFO: renamed from: $r8$lambda$l0HqVIyDzfwZNeUyuAoVd7QY-CU, reason: not valid java name */
        public static /* synthetic */ void m249$r8$lambda$l0HqVIyDzfwZNeUyuAoVd7QYCU(ca.dnamobile.javalauncher.InstanceDetailsActivity.AnonymousClass14 r0, int r1, int r2) {
                r0.lambda$onProgress$1(r1, r2)
                return
        }

        public static /* synthetic */ void $r8$lambda$ri4c0cFJtyncsZSgUHj69wVHpuM(ca.dnamobile.javalauncher.InstanceDetailsActivity.AnonymousClass14 r0, java.lang.String r1) {
                r0.lambda$onStatus$0(r1)
                return
        }

        AnonymousClass14(ca.dnamobile.javalauncher.InstanceDetailsActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        private /* synthetic */ void lambda$onProgress$1(int r2, int r3) {
                r1 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r1.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity.m243$$Nest$msetUpdateProgress(r0, r2, r3)
                return
        }

        private /* synthetic */ void lambda$onStatus$0(java.lang.String r2) {
                r1 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r1.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity.m244$$Nest$msetUpdateProgressMessage(r0, r2)
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.Listener
        public void onProgress(int r3, int r4) {
                r2 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity$14$$ExternalSyntheticLambda1 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$14$$ExternalSyntheticLambda1
                r1.<init>(r2, r3, r4)
                r0.runOnUiThread(r1)
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.Listener
        public void onStatus(java.lang.String r3) {
                r2 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity$14$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$14$$ExternalSyntheticLambda0
                r1.<init>(r2, r3)
                r0.runOnUiThread(r1)
                return
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.InstanceDetailsActivity$15, reason: invalid class name */
    class AnonymousClass15 implements ca.dnamobile.javalauncher.modmanager.ModrinthInstallManager.Listener {
        final /* synthetic */ ca.dnamobile.javalauncher.InstanceDetailsActivity this$0;
        final /* synthetic */ java.lang.Throwable[] val$error;

        public static /* synthetic */ void $r8$lambda$pcSLPjkP0BXHyun1WsZHD5nU_D4(ca.dnamobile.javalauncher.InstanceDetailsActivity.AnonymousClass15 r0, java.lang.String r1) {
                r0.lambda$onComplete$1(r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$wjVR3riY4W7dzEs8k9rNfbyjnNM(ca.dnamobile.javalauncher.InstanceDetailsActivity.AnonymousClass15 r0, java.lang.String r1) {
                r0.lambda$onStatus$0(r1)
                return
        }

        AnonymousClass15(ca.dnamobile.javalauncher.InstanceDetailsActivity r1, java.lang.Throwable[] r2) {
                r0 = this;
                r0.this$0 = r1
                r0.val$error = r2
                r0.<init>()
                return
        }

        private /* synthetic */ void lambda$onComplete$1(java.lang.String r2) {
                r1 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r1.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity.m244$$Nest$msetUpdateProgressMessage(r0, r2)
                return
        }

        private /* synthetic */ void lambda$onStatus$0(java.lang.String r2) {
                r1 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r1.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity.m244$$Nest$msetUpdateProgressMessage(r0, r2)
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModrinthInstallManager.Listener
        public void onComplete(java.lang.String r3) {
                r2 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity$15$$ExternalSyntheticLambda1 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$15$$ExternalSyntheticLambda1
                r1.<init>(r2, r3)
                r0.runOnUiThread(r1)
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModrinthInstallManager.Listener
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                java.lang.Throwable[] r0 = r2.val$error
                r1 = 0
                r0[r1] = r3
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModrinthInstallManager.Listener
        public void onStatus(java.lang.String r3) {
                r2 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity$15$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$15$$ExternalSyntheticLambda0
                r1.<init>(r2, r3)
                r0.runOnUiThread(r1)
                return
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.InstanceDetailsActivity$16, reason: invalid class name */
    class AnonymousClass16 implements ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.Listener {
        final /* synthetic */ ca.dnamobile.javalauncher.InstanceDetailsActivity this$0;

        public static /* synthetic */ void $r8$lambda$Uy5lVNZQF02JS44FWtrYlsQYxpg(ca.dnamobile.javalauncher.InstanceDetailsActivity.AnonymousClass16 r0, int r1, int r2) {
                r0.lambda$onProgress$1(r1, r2)
                return
        }

        public static /* synthetic */ void $r8$lambda$tPLS1p_yOHBZJe2wlodwXuqDuBY(ca.dnamobile.javalauncher.InstanceDetailsActivity.AnonymousClass16 r0, java.lang.String r1) {
                r0.lambda$onStatus$0(r1)
                return
        }

        AnonymousClass16(ca.dnamobile.javalauncher.InstanceDetailsActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        private /* synthetic */ void lambda$onProgress$1(int r2, int r3) {
                r1 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r1.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity.m243$$Nest$msetUpdateProgress(r0, r2, r3)
                return
        }

        private /* synthetic */ void lambda$onStatus$0(java.lang.String r2) {
                r1 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r1.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity.m244$$Nest$msetUpdateProgressMessage(r0, r2)
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.Listener
        public void onProgress(int r3, int r4) {
                r2 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity$16$$ExternalSyntheticLambda1 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$16$$ExternalSyntheticLambda1
                r1.<init>(r2, r3, r4)
                r0.runOnUiThread(r1)
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.Listener
        public void onStatus(java.lang.String r3) {
                r2 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity$16$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$16$$ExternalSyntheticLambda0
                r1.<init>(r2, r3)
                r0.runOnUiThread(r1)
                return
        }
    }



    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.InstanceDetailsActivity$4, reason: invalid class name */
    class AnonymousClass4 implements ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Listener {
        final /* synthetic */ ca.dnamobile.javalauncher.InstanceDetailsActivity this$0;

        public static /* synthetic */ void $r8$lambda$e3rGpRUN0q8aQO3Q_9rJloGBmG4(ca.dnamobile.javalauncher.InstanceDetailsActivity.AnonymousClass4 r0, java.lang.Throwable r1) {
                r0.lambda$onError$3(r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$sd8sWLUSWy4HYvE5F1pCVCOLbak(ca.dnamobile.javalauncher.InstanceDetailsActivity.AnonymousClass4 r0, java.lang.String r1) {
                r0.lambda$onStatus$0(r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$wHZ3MScZC52qPVfASKoDEspoTNA(ca.dnamobile.javalauncher.InstanceDetailsActivity.AnonymousClass4 r0, java.lang.String r1) {
                r0.lambda$onComplete$2(r1)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$zulMuWuS-fZ1U7cfns_uJU6sP3w, reason: not valid java name */
        public static /* synthetic */ void m250$r8$lambda$zulMuWuSfZ1U7cfns_uJU6sP3w(ca.dnamobile.javalauncher.InstanceDetailsActivity.AnonymousClass4 r0, int r1, int r2) {
                r0.lambda$onProgress$1(r1, r2)
                return
        }

        AnonymousClass4(ca.dnamobile.javalauncher.InstanceDetailsActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        private /* synthetic */ void lambda$onComplete$2(java.lang.String r3) {
                r2 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity.m226$$Nest$mdismissUpdateProgressDialog(r0)
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r2.this$0
                r1 = 1
                android.widget.Toast r3 = android.widget.Toast.makeText(r0, r3, r1)
                r3.show()
                return
        }

        private /* synthetic */ void lambda$onError$3(java.lang.Throwable r4) {
                r3 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r3.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity.m226$$Nest$mdismissUpdateProgressDialog(r0)
                java.lang.String r0 = r4.getMessage()
                if (r0 == 0) goto L10
                java.lang.String r4 = r4.getMessage()
                goto L18
            L10:
                java.lang.Class r4 = r4.getClass()
                java.lang.String r4 = r4.getSimpleName()
            L18:
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r3.this$0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Export failed: "
                r1.<init>(r2)
                java.lang.StringBuilder r4 = r1.append(r4)
                java.lang.String r4 = r4.toString()
                r1 = 1
                android.widget.Toast r4 = android.widget.Toast.makeText(r0, r4, r1)
                r4.show()
                return
        }

        private /* synthetic */ void lambda$onProgress$1(int r2, int r3) {
                r1 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r1.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity.m243$$Nest$msetUpdateProgress(r0, r2, r3)
                return
        }

        private /* synthetic */ void lambda$onStatus$0(java.lang.String r2) {
                r1 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r1.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity.m244$$Nest$msetUpdateProgressMessage(r0, r2)
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Listener
        public void onComplete(java.lang.String r3) {
                r2 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity$4$$ExternalSyntheticLambda3 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$4$$ExternalSyntheticLambda3
                r1.<init>(r2, r3)
                r0.runOnUiThread(r1)
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Listener
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity$4$$ExternalSyntheticLambda2 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$4$$ExternalSyntheticLambda2
                r1.<init>(r2, r3)
                r0.runOnUiThread(r1)
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Listener
        public void onProgress(int r3, int r4) {
                r2 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity$4$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$4$$ExternalSyntheticLambda0
                r1.<init>(r2, r3, r4)
                r0.runOnUiThread(r1)
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Listener
        public void onStatus(java.lang.String r3) {
                r2 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity$4$$ExternalSyntheticLambda1 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$4$$ExternalSyntheticLambda1
                r1.<init>(r2, r3)
                r0.runOnUiThread(r1)
                return
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.InstanceDetailsActivity$5, reason: invalid class name */
    class AnonymousClass5 implements ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener {
        final /* synthetic */ ca.dnamobile.javalauncher.InstanceDetailsActivity this$0;

        public static /* synthetic */ void $r8$lambda$DNoPMv9YFI1pbpGWj4l4enS8E5g(ca.dnamobile.javalauncher.InstanceDetailsActivity.AnonymousClass5 r0, java.lang.String r1) {
                r0.lambda$onComplete$2(r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$OkXzsV4X_146P8eNZ0k3G0JYuWM(ca.dnamobile.javalauncher.InstanceDetailsActivity.AnonymousClass5 r0, java.lang.Throwable r1) {
                r0.lambda$onError$3(r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$_c5bYewmxaeQWasCzWgGx4klW8E(ca.dnamobile.javalauncher.InstanceDetailsActivity.AnonymousClass5 r0, int r1, int r2) {
                r0.lambda$onProgress$1(r1, r2)
                return
        }

        public static /* synthetic */ void $r8$lambda$gcPrtvvlYsCc7_4dlcm_sDtpVw4(ca.dnamobile.javalauncher.InstanceDetailsActivity.AnonymousClass5 r0, java.lang.String r1) {
                r0.lambda$onStatus$0(r1)
                return
        }

        AnonymousClass5(ca.dnamobile.javalauncher.InstanceDetailsActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        private /* synthetic */ void lambda$onComplete$2(java.lang.String r3) {
                r2 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity.m226$$Nest$mdismissUpdateProgressDialog(r0)
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r2.this$0
                r1 = -1
                r0.setResult(r1)
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r2.this$0
                r1 = 1
                android.widget.Toast r3 = android.widget.Toast.makeText(r0, r3, r1)
                r3.show()
                return
        }

        private /* synthetic */ void lambda$onError$3(java.lang.Throwable r4) {
                r3 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r3.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity.m226$$Nest$mdismissUpdateProgressDialog(r0)
                java.lang.String r0 = r4.getMessage()
                if (r0 == 0) goto L10
                java.lang.String r4 = r4.getMessage()
                goto L18
            L10:
                java.lang.Class r4 = r4.getClass()
                java.lang.String r4 = r4.getSimpleName()
            L18:
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r3.this$0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Import failed: "
                r1.<init>(r2)
                java.lang.StringBuilder r4 = r1.append(r4)
                java.lang.String r4 = r4.toString()
                r1 = 1
                android.widget.Toast r4 = android.widget.Toast.makeText(r0, r4, r1)
                r4.show()
                return
        }

        private /* synthetic */ void lambda$onProgress$1(int r2, int r3) {
                r1 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r1.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity.m243$$Nest$msetUpdateProgress(r0, r2, r3)
                return
        }

        private /* synthetic */ void lambda$onStatus$0(java.lang.String r2) {
                r1 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r1.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity.m244$$Nest$msetUpdateProgressMessage(r0, r2)
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener
        public void onComplete(java.lang.String r3) {
                r2 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity$5$$ExternalSyntheticLambda3 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$5$$ExternalSyntheticLambda3
                r1.<init>(r2, r3)
                r0.runOnUiThread(r1)
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity$5$$ExternalSyntheticLambda1 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$5$$ExternalSyntheticLambda1
                r1.<init>(r2, r3)
                r0.runOnUiThread(r1)
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener
        public void onProgress(int r3, int r4) {
                r2 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity$5$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$5$$ExternalSyntheticLambda0
                r1.<init>(r2, r3, r4)
                r0.runOnUiThread(r1)
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener
        public void onStatus(java.lang.String r3) {
                r2 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity$5$$ExternalSyntheticLambda2 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$5$$ExternalSyntheticLambda2
                r1.<init>(r2, r3)
                r0.runOnUiThread(r1)
                return
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.InstanceDetailsActivity$6, reason: invalid class name */
    class AnonymousClass6 implements ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.Listener {
        final /* synthetic */ ca.dnamobile.javalauncher.InstanceDetailsActivity this$0;

        public static /* synthetic */ void $r8$lambda$xHCSVDv0V2LjF8yt_hqHtu3d0dY(ca.dnamobile.javalauncher.InstanceDetailsActivity.AnonymousClass6 r0, java.lang.String r1) {
                r0.lambda$onStatus$0(r1)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$yyRaOs_x3lC-FEMAOFNbLZ7Hk-Y, reason: not valid java name */
        public static /* synthetic */ void m251$r8$lambda$yyRaOs_x3lCFEMAOFNbLZ7HkY(ca.dnamobile.javalauncher.InstanceDetailsActivity.AnonymousClass6 r0, int r1, int r2) {
                r0.lambda$onProgress$1(r1, r2)
                return
        }

        AnonymousClass6(ca.dnamobile.javalauncher.InstanceDetailsActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        private /* synthetic */ void lambda$onProgress$1(int r2, int r3) {
                r1 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r1.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity.m243$$Nest$msetUpdateProgress(r0, r2, r3)
                return
        }

        private /* synthetic */ void lambda$onStatus$0(java.lang.String r2) {
                r1 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r1.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity.m244$$Nest$msetUpdateProgressMessage(r0, r2)
                return
        }

        @Override // ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.Listener
        public void onProgress(int r3, int r4) {
                r2 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity$6$$ExternalSyntheticLambda1 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$6$$ExternalSyntheticLambda1
                r1.<init>(r2, r3, r4)
                r0.runOnUiThread(r1)
                return
        }

        @Override // ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.Listener
        public void onStatus(java.lang.String r3) {
                r2 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity$6$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$6$$ExternalSyntheticLambda0
                r1.<init>(r2, r3)
                r0.runOnUiThread(r1)
                return
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.InstanceDetailsActivity$7, reason: invalid class name */
    class AnonymousClass7 implements ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Listener {
        final /* synthetic */ ca.dnamobile.javalauncher.InstanceDetailsActivity this$0;

        public static /* synthetic */ void $r8$lambda$kC5TyIVv4i4N5e277uvYe9VPF1w(ca.dnamobile.javalauncher.InstanceDetailsActivity.AnonymousClass7 r0, int r1, int r2) {
                r0.lambda$onProgress$1(r1, r2)
                return
        }

        public static /* synthetic */ void $r8$lambda$s2iF6REAHdUUT2wz9CvthNoPeOc(ca.dnamobile.javalauncher.InstanceDetailsActivity.AnonymousClass7 r0, java.lang.String r1) {
                r0.lambda$onStatus$0(r1)
                return
        }

        AnonymousClass7(ca.dnamobile.javalauncher.InstanceDetailsActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        private /* synthetic */ void lambda$onProgress$1(int r2, int r3) {
                r1 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r1.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity.m243$$Nest$msetUpdateProgress(r0, r2, r3)
                return
        }

        private /* synthetic */ void lambda$onStatus$0(java.lang.String r2) {
                r1 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r1.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity.m244$$Nest$msetUpdateProgressMessage(r0, r2)
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Listener
        public void onProgress(int r3, int r4) {
                r2 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity$7$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$7$$ExternalSyntheticLambda0
                r1.<init>(r2, r3, r4)
                r0.runOnUiThread(r1)
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Listener
        public void onStatus(java.lang.String r3) {
                r2 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity$7$$ExternalSyntheticLambda1 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$7$$ExternalSyntheticLambda1
                r1.<init>(r2, r3)
                r0.runOnUiThread(r1)
                return
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.InstanceDetailsActivity$8, reason: invalid class name */
    class AnonymousClass8 implements ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Listener {
        final /* synthetic */ ca.dnamobile.javalauncher.InstanceDetailsActivity this$0;

        public static /* synthetic */ void $r8$lambda$3ZP2eCHlBtmfotOZx7TDzS2Pq74(ca.dnamobile.javalauncher.InstanceDetailsActivity.AnonymousClass8 r0, int r1, int r2) {
                r0.lambda$onProgress$1(r1, r2)
                return
        }

        public static /* synthetic */ void $r8$lambda$KfDLsNcRz8t4Xh6lBVQ0Boyk6bQ(ca.dnamobile.javalauncher.InstanceDetailsActivity.AnonymousClass8 r0, java.lang.String r1) {
                r0.lambda$onStatus$0(r1)
                return
        }

        AnonymousClass8(ca.dnamobile.javalauncher.InstanceDetailsActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        private /* synthetic */ void lambda$onProgress$1(int r2, int r3) {
                r1 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r1.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity.m243$$Nest$msetUpdateProgress(r0, r2, r3)
                return
        }

        private /* synthetic */ void lambda$onStatus$0(java.lang.String r2) {
                r1 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r1.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity.m244$$Nest$msetUpdateProgressMessage(r0, r2)
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Listener
        public void onProgress(int r3, int r4) {
                r2 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity$8$$ExternalSyntheticLambda1 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$8$$ExternalSyntheticLambda1
                r1.<init>(r2, r3, r4)
                r0.runOnUiThread(r1)
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Listener
        public void onStatus(java.lang.String r3) {
                r2 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity$8$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$8$$ExternalSyntheticLambda0
                r1.<init>(r2, r3)
                r0.runOnUiThread(r1)
                return
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.InstanceDetailsActivity$9, reason: invalid class name */
    class AnonymousClass9 implements ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Listener {
        final /* synthetic */ ca.dnamobile.javalauncher.InstanceDetailsActivity this$0;

        public static /* synthetic */ void $r8$lambda$Qj1Bx7wEJ8f58ZV8wyL7LSUEmUY(ca.dnamobile.javalauncher.InstanceDetailsActivity.AnonymousClass9 r0, int r1, int r2) {
                r0.lambda$onProgress$1(r1, r2)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$VxMMFPVbv9KAMLS-6cq3C0dL2r0, reason: not valid java name */
        public static /* synthetic */ void m252$r8$lambda$VxMMFPVbv9KAMLS6cq3C0dL2r0(ca.dnamobile.javalauncher.InstanceDetailsActivity.AnonymousClass9 r0, java.lang.String r1) {
                r0.lambda$onStatus$0(r1)
                return
        }

        AnonymousClass9(ca.dnamobile.javalauncher.InstanceDetailsActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        private /* synthetic */ void lambda$onProgress$1(int r2, int r3) {
                r1 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r1.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity.m243$$Nest$msetUpdateProgress(r0, r2, r3)
                return
        }

        private /* synthetic */ void lambda$onStatus$0(java.lang.String r2) {
                r1 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r1.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity.m244$$Nest$msetUpdateProgressMessage(r0, r2)
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Listener
        public void onProgress(int r3, int r4) {
                r2 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity$9$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$9$$ExternalSyntheticLambda0
                r1.<init>(r2, r3, r4)
                r0.runOnUiThread(r1)
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Listener
        public void onStatus(java.lang.String r3) {
                r2 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity$9$$ExternalSyntheticLambda1 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$9$$ExternalSyntheticLambda1
                r1.<init>(r2, r3)
                r0.runOnUiThread(r1)
                return
        }
    }

    private final class InstanceContentAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentAdapter.ContentViewHolder> {
        private final java.util.Set<java.lang.String> loadingMetadata;
        private final java.util.Set<java.lang.String> loadingSource;
        private final java.util.Map<java.lang.String, ca.dnamobile.javalauncher.InstanceDetailsActivity.LoadedContentMetadata> metadataCache;
        private final java.util.Set<java.lang.String> missingMetadataCache;
        private final java.util.Map<java.lang.String, ca.dnamobile.javalauncher.modmanager.ModManagerSource> sourceCache;
        final /* synthetic */ ca.dnamobile.javalauncher.InstanceDetailsActivity this$0;

        final class ContentViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            final com.google.android.material.button.MaterialButton deleteButton;
            final com.google.android.material.switchmaterial.SwitchMaterial enabledSwitch;
            final android.widget.ImageView icon;
            final com.google.android.material.button.MaterialButton playWorldButton;
            final android.widget.ImageView sourceIcon;
            final android.widget.TextView subtitle;
            final /* synthetic */ ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentAdapter this$1;
            final android.widget.TextView title;
            final com.google.android.material.button.MaterialButton updateButton;

            ContentViewHolder(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentAdapter r1, android.view.View r2) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>(r2)
                    int r1 = ca.dnamobile.javalauncher.R.id.imageResourceIcon
                    android.view.View r1 = r2.findViewById(r1)
                    android.widget.ImageView r1 = (android.widget.ImageView) r1
                    r0.icon = r1
                    int r1 = ca.dnamobile.javalauncher.R.id.textResourceName
                    android.view.View r1 = r2.findViewById(r1)
                    android.widget.TextView r1 = (android.widget.TextView) r1
                    r0.title = r1
                    int r1 = ca.dnamobile.javalauncher.R.id.textResourceSubtitle
                    android.view.View r1 = r2.findViewById(r1)
                    android.widget.TextView r1 = (android.widget.TextView) r1
                    r0.subtitle = r1
                    int r1 = ca.dnamobile.javalauncher.R.id.imageResourceInstalledSource
                    android.view.View r1 = r2.findViewById(r1)
                    android.widget.ImageView r1 = (android.widget.ImageView) r1
                    r0.sourceIcon = r1
                    int r1 = ca.dnamobile.javalauncher.R.id.buttonPlayWorld
                    android.view.View r1 = r2.findViewById(r1)
                    com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
                    r0.playWorldButton = r1
                    int r1 = ca.dnamobile.javalauncher.R.id.buttonUpdateResource
                    android.view.View r1 = r2.findViewById(r1)
                    com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
                    r0.updateButton = r1
                    int r1 = ca.dnamobile.javalauncher.R.id.switchResourceEnabled
                    android.view.View r1 = r2.findViewById(r1)
                    com.google.android.material.switchmaterial.SwitchMaterial r1 = (com.google.android.material.switchmaterial.SwitchMaterial) r1
                    r0.enabledSwitch = r1
                    int r1 = ca.dnamobile.javalauncher.R.id.buttonDeleteResource
                    android.view.View r1 = r2.findViewById(r1)
                    com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
                    r0.deleteButton = r1
                    return
            }
        }

        /* JADX INFO: renamed from: $r8$lambda$5Wq-FP1Q9EcQWilXmq5bY8-3Ikw, reason: not valid java name */
        public static /* synthetic */ void m253$r8$lambda$5WqFP1Q9EcQWilXmq5bY83Ikw(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentAdapter r0, java.lang.String r1, ca.dnamobile.javalauncher.InstanceDetailsActivity.LoadedContentMetadata r2, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentAdapter.ContentViewHolder r3, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r4) {
                r0.lambda$loadMetadataAsync$10(r1, r2, r3, r4)
                return
        }

        public static /* synthetic */ void $r8$lambda$JLxCfEM0p_C2dwpZaxvCGJVsFOM(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentAdapter r0, java.lang.String r1, ca.dnamobile.javalauncher.modmanager.ModManagerSource r2, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentAdapter.ContentViewHolder r3) {
                r0.lambda$loadSourceAsync$3(r1, r2, r3)
                return
        }

        public static /* synthetic */ void $r8$lambda$MYzmz9x9xSBxY56byGpijowORYY(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentAdapter r0, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r1, android.view.View r2) {
                r0.lambda$bindUpdateButton$8(r1, r2)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$Mb9MnLTL-zfWGf8ZgXTTMCMWrxI, reason: not valid java name */
        public static /* synthetic */ void m254$r8$lambda$Mb9MnLTLzfWGf8ZgXTTMCMWrxI(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentAdapter r0, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r1, java.lang.String r2, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentAdapter.ContentViewHolder r3) {
                r0.lambda$loadMetadataAsync$11(r1, r2, r3)
                return
        }

        public static /* synthetic */ void $r8$lambda$PePuoORVgIfy6mXFGxoZptQ1whE(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentAdapter r0, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r1, android.widget.CompoundButton r2, boolean r3) {
                r0.lambda$onBindViewHolder$1(r1, r2, r3)
                return
        }

        public static /* synthetic */ void $r8$lambda$YVxT6h5NXgzmDwZcz4S00uk8nbg(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentAdapter r0, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r1, android.view.View r2) {
                r0.lambda$onBindViewHolder$2(r1, r2)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$aLDhgOiAAtELG3wUy-oPK2lyePk, reason: not valid java name */
        public static /* synthetic */ void m255$r8$lambda$aLDhgOiAAtELG3wUyoPK2lyePk(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentAdapter r0, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r1, android.view.View r2) {
                r0.lambda$bindWorldExportButton$5(r1, r2)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$b5eFQvtsjpoH8Qwr-VkmBlqq1ek, reason: not valid java name */
        public static /* synthetic */ void m256$r8$lambda$b5eFQvtsjpoH8QwrVkmBlqq1ek(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentAdapter r0, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r1, java.lang.String r2, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentAdapter.ContentViewHolder r3) {
                r0.lambda$loadSourceAsync$4(r1, r2, r3)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$ckNNZ4DAq9dQiHpzEhXs-XYB4ko, reason: not valid java name */
        public static /* synthetic */ void m257$r8$lambda$ckNNZ4DAq9dQiHpzEhXsXYB4ko(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentAdapter r0, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r1, android.view.View r2) {
                r0.lambda$bindUpdateButton$6(r1, r2)
                return
        }

        public static /* synthetic */ void $r8$lambda$mFQloHwiu6RQ9D55LZ27gIVjB_c(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentAdapter r0, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r1, android.view.View r2) {
                r0.lambda$onBindViewHolder$0(r1, r2)
                return
        }

        public static /* synthetic */ void $r8$lambda$xSbDtHsNup55v3BDte8aJpVO7mQ(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentAdapter r0, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r1, android.view.View r2) {
                r0.lambda$bindUpdateButton$9(r1, r2)
                return
        }

        public static /* synthetic */ void $r8$lambda$yNGRLyuYLbriIGaPXS5KY7kH4U0(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentAdapter r0, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r1, android.view.View r2) {
                r0.lambda$bindUpdateButton$7(r1, r2)
                return
        }

        InstanceContentAdapter(ca.dnamobile.javalauncher.InstanceDetailsActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
                r1.<init>()
                r0.metadataCache = r1
                java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
                r1.<init>()
                java.util.Set r1 = java.util.Collections.newSetFromMap(r1)
                r0.missingMetadataCache = r1
                java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
                r1.<init>()
                java.util.Set r1 = java.util.Collections.newSetFromMap(r1)
                r0.loadingMetadata = r1
                java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
                r1.<init>()
                r0.sourceCache = r1
                java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
                r1.<init>()
                java.util.Set r1 = java.util.Collections.newSetFromMap(r1)
                r0.loadingSource = r1
                r1 = 1
                r0.setHasStableIds(r1)
                return
        }

        private void applyFallbackIcon(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentAdapter.ContentViewHolder r7, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r8) {
                r6 = this;
                android.widget.ImageView r0 = r7.icon
                int r1 = ca.dnamobile.javalauncher.R.drawable.bg_instance_icon
                r0.setBackgroundResource(r1)
                android.widget.ImageView r0 = r7.icon
                ca.dnamobile.javalauncher.InstanceDetailsActivity r1 = r6.this$0
                r2 = 8
                int r1 = ca.dnamobile.javalauncher.InstanceDetailsActivity.m227$$Nest$mdp(r1, r2)
                ca.dnamobile.javalauncher.InstanceDetailsActivity r3 = r6.this$0
                int r3 = ca.dnamobile.javalauncher.InstanceDetailsActivity.m227$$Nest$mdp(r3, r2)
                ca.dnamobile.javalauncher.InstanceDetailsActivity r4 = r6.this$0
                int r4 = ca.dnamobile.javalauncher.InstanceDetailsActivity.m227$$Nest$mdp(r4, r2)
                ca.dnamobile.javalauncher.InstanceDetailsActivity r5 = r6.this$0
                int r2 = ca.dnamobile.javalauncher.InstanceDetailsActivity.m227$$Nest$mdp(r5, r2)
                r0.setPadding(r1, r3, r4, r2)
                android.widget.ImageView r0 = r7.icon
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY
                r0.setScaleType(r1)
                android.widget.ImageView r7 = r7.icon
                ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r8 = r8.category
                int r8 = r8.defaultIconRes
                r7.setImageResource(r8)
                return
        }

        private void applyLoadedIcon(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentAdapter.ContentViewHolder r7, android.graphics.Bitmap r8) {
                r6 = this;
                android.widget.ImageView r0 = r7.icon
                int r1 = ca.dnamobile.javalauncher.R.drawable.bg_instance_icon
                r0.setBackgroundResource(r1)
                android.widget.ImageView r0 = r7.icon
                ca.dnamobile.javalauncher.InstanceDetailsActivity r1 = r6.this$0
                r2 = 4
                int r1 = ca.dnamobile.javalauncher.InstanceDetailsActivity.m227$$Nest$mdp(r1, r2)
                ca.dnamobile.javalauncher.InstanceDetailsActivity r3 = r6.this$0
                int r3 = ca.dnamobile.javalauncher.InstanceDetailsActivity.m227$$Nest$mdp(r3, r2)
                ca.dnamobile.javalauncher.InstanceDetailsActivity r4 = r6.this$0
                int r4 = ca.dnamobile.javalauncher.InstanceDetailsActivity.m227$$Nest$mdp(r4, r2)
                ca.dnamobile.javalauncher.InstanceDetailsActivity r5 = r6.this$0
                int r2 = ca.dnamobile.javalauncher.InstanceDetailsActivity.m227$$Nest$mdp(r5, r2)
                r0.setPadding(r1, r3, r4, r2)
                android.widget.ImageView r0 = r7.icon
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY
                r0.setScaleType(r1)
                android.widget.ImageView r7 = r7.icon
                r7.setImageBitmap(r8)
                return
        }

        private void applyLoadedMetadata(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentAdapter.ContentViewHolder r3, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r4, java.lang.String r5, ca.dnamobile.javalauncher.InstanceDetailsActivity.LoadedContentMetadata r6) {
                r2 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r2.this$0
                java.lang.String r1 = r6.displayName
                ca.dnamobile.javalauncher.InstanceDetailsActivity.m238$$Nest$mrememberContentSearchMetadata(r0, r4, r1)
                android.view.View r0 = r3.itemView
                java.lang.Object r0 = r0.getTag()
                boolean r1 = r0 instanceof java.lang.String
                if (r1 == 0) goto L42
                boolean r5 = r5.equals(r0)
                if (r5 != 0) goto L18
                goto L42
            L18:
                ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r4 = r4.category
                ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r5 = ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory.MODS
                if (r4 != r5) goto L39
                java.lang.String r4 = r6.displayName
                if (r4 == 0) goto L39
                java.lang.String r4 = r6.displayName
                java.lang.String r4 = r4.trim()
                boolean r4 = r4.isEmpty()
                if (r4 != 0) goto L39
                android.widget.TextView r4 = r3.title
                java.lang.String r5 = r6.displayName
                java.lang.String r5 = r5.trim()
                r4.setText(r5)
            L39:
                android.graphics.Bitmap r4 = r6.icon
                if (r4 == 0) goto L42
                android.graphics.Bitmap r4 = r6.icon
                r2.applyLoadedIcon(r3, r4)
            L42:
                return
        }

        private void bindUpdateButton(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentAdapter.ContentViewHolder r6, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r7) {
                r5 = this;
                com.google.android.material.button.MaterialButton r0 = r6.updateButton
                r1 = 0
                r0.setVisibility(r1)
                com.google.android.material.button.MaterialButton r0 = r6.updateButton
                java.lang.String r2 = ""
                r0.setText(r2)
                com.google.android.material.button.MaterialButton r0 = r6.updateButton
                r2 = 1
                r0.setEnabled(r2)
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r5.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState r0 = ca.dnamobile.javalauncher.InstanceDetailsActivity.m231$$Nest$mgetUpdateStateForItem(r0, r7)
                ca.dnamobile.javalauncher.InstanceDetailsActivity r3 = r5.this$0
                java.lang.String r3 = ca.dnamobile.javalauncher.InstanceDetailsActivity.m230$$Nest$mgetUpdateMessageForItem(r3, r7)
                int r0 = r0.ordinal()
                r4 = 0
                if (r0 == r2) goto Ld3
                r2 = 2
                if (r0 == r2) goto Lb2
                r2 = 3
                if (r0 == r2) goto L91
                r1 = 4
                if (r0 == r1) goto L72
                r1 = 5
                if (r0 == r1) goto L51
                com.google.android.material.button.MaterialButton r0 = r6.updateButton
                int r1 = ca.dnamobile.javalauncher.R.drawable.ic_sync_24
                r0.setIconResource(r1)
                com.google.android.material.button.MaterialButton r0 = r6.updateButton
                ca.dnamobile.javalauncher.InstanceDetailsActivity r1 = r5.this$0
                int r2 = ca.dnamobile.javalauncher.R.string.instance_content_check_update_button
                java.lang.String r1 = r1.getString(r2)
                r0.setContentDescription(r1)
                com.google.android.material.button.MaterialButton r6 = r6.updateButton
                ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter$$ExternalSyntheticLambda8 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter$$ExternalSyntheticLambda8
                r0.<init>(r5, r7)
                r6.setOnClickListener(r0)
                return
            L51:
                com.google.android.material.button.MaterialButton r0 = r6.updateButton
                int r1 = ca.dnamobile.javalauncher.R.drawable.ic_sync_24
                r0.setIconResource(r1)
                com.google.android.material.button.MaterialButton r0 = r6.updateButton
                if (r3 != 0) goto L64
                ca.dnamobile.javalauncher.InstanceDetailsActivity r1 = r5.this$0
                int r2 = ca.dnamobile.javalauncher.R.string.instance_content_update_check_failed_short
                java.lang.String r3 = r1.getString(r2)
            L64:
                r0.setContentDescription(r3)
                com.google.android.material.button.MaterialButton r6 = r6.updateButton
                ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter$$ExternalSyntheticLambda7 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter$$ExternalSyntheticLambda7
                r0.<init>(r5, r7)
                r6.setOnClickListener(r0)
                return
            L72:
                com.google.android.material.button.MaterialButton r0 = r6.updateButton
                int r1 = ca.dnamobile.javalauncher.R.drawable.ic_check_24
                r0.setIconResource(r1)
                com.google.android.material.button.MaterialButton r0 = r6.updateButton
                ca.dnamobile.javalauncher.InstanceDetailsActivity r1 = r5.this$0
                int r2 = ca.dnamobile.javalauncher.R.string.instance_content_up_to_date
                java.lang.String r1 = r1.getString(r2)
                r0.setContentDescription(r1)
                com.google.android.material.button.MaterialButton r6 = r6.updateButton
                ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter$$ExternalSyntheticLambda6 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter$$ExternalSyntheticLambda6
                r0.<init>(r5, r7)
                r6.setOnClickListener(r0)
                return
            L91:
                com.google.android.material.button.MaterialButton r7 = r6.updateButton
                r7.setEnabled(r1)
                com.google.android.material.button.MaterialButton r7 = r6.updateButton
                int r0 = ca.dnamobile.javalauncher.R.drawable.ic_update_24
                r7.setIconResource(r0)
                com.google.android.material.button.MaterialButton r7 = r6.updateButton
                if (r3 != 0) goto La9
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r5.this$0
                int r1 = ca.dnamobile.javalauncher.R.string.instance_content_updating_title
                java.lang.String r3 = r0.getString(r1)
            La9:
                r7.setContentDescription(r3)
                com.google.android.material.button.MaterialButton r6 = r6.updateButton
                r6.setOnClickListener(r4)
                return
            Lb2:
                com.google.android.material.button.MaterialButton r0 = r6.updateButton
                int r1 = ca.dnamobile.javalauncher.R.drawable.ic_update_24
                r0.setIconResource(r1)
                com.google.android.material.button.MaterialButton r0 = r6.updateButton
                if (r3 != 0) goto Lc5
                ca.dnamobile.javalauncher.InstanceDetailsActivity r1 = r5.this$0
                int r2 = ca.dnamobile.javalauncher.R.string.instance_content_update_available
                java.lang.String r3 = r1.getString(r2)
            Lc5:
                r0.setContentDescription(r3)
                com.google.android.material.button.MaterialButton r6 = r6.updateButton
                ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter$$ExternalSyntheticLambda5 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter$$ExternalSyntheticLambda5
                r0.<init>(r5, r7)
                r6.setOnClickListener(r0)
                return
            Ld3:
                com.google.android.material.button.MaterialButton r7 = r6.updateButton
                r7.setEnabled(r1)
                com.google.android.material.button.MaterialButton r7 = r6.updateButton
                int r0 = ca.dnamobile.javalauncher.R.drawable.ic_sync_24
                r7.setIconResource(r0)
                com.google.android.material.button.MaterialButton r7 = r6.updateButton
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r5.this$0
                int r1 = ca.dnamobile.javalauncher.R.string.instance_content_checking_updates_short
                java.lang.String r0 = r0.getString(r1)
                r7.setContentDescription(r0)
                com.google.android.material.button.MaterialButton r6 = r6.updateButton
                r6.setOnClickListener(r4)
                return
        }

        private void bindWorldExportButton(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentAdapter.ContentViewHolder r3, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r4) {
                r2 = this;
                com.google.android.material.button.MaterialButton r0 = r3.updateButton
                r1 = 0
                r0.setVisibility(r1)
                com.google.android.material.button.MaterialButton r0 = r3.updateButton
                java.lang.String r1 = ""
                r0.setText(r1)
                com.google.android.material.button.MaterialButton r0 = r3.updateButton
                r1 = 1
                r0.setEnabled(r1)
                com.google.android.material.button.MaterialButton r0 = r3.updateButton
                int r1 = ca.dnamobile.javalauncher.R.drawable.ic_arrow_upward_24
                r0.setIconResource(r1)
                com.google.android.material.button.MaterialButton r0 = r3.updateButton
                java.lang.String r1 = "Export World"
                r0.setContentDescription(r1)
                com.google.android.material.button.MaterialButton r3 = r3.updateButton
                ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter$$ExternalSyntheticLambda1 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter$$ExternalSyntheticLambda1
                r0.<init>(r2, r4)
                r3.setOnClickListener(r0)
                return
        }

        private java.lang.String buildMetadataKey(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r5) {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.io.File r1 = r5.file
                java.lang.String r1 = r1.getAbsolutePath()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ":"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.io.File r2 = r5.file
                long r2 = r2.length()
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.io.File r2 = r5.file
                long r2 = r2.lastModified()
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.StringBuilder r0 = r0.append(r1)
                ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r5 = r5.category
                java.lang.String r5 = r5.name()
                java.lang.StringBuilder r5 = r0.append(r5)
                java.lang.String r5 = r5.toString()
                return r5
        }

        private /* synthetic */ void lambda$bindUpdateButton$6(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r1, android.view.View r2) {
                r0 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r2 = r0.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity.m248$$Nest$mupdateSingleContentItemFromRow(r2, r1)
                return
        }

        private /* synthetic */ void lambda$bindUpdateButton$7(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r1, android.view.View r2) {
                r0 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r2 = r0.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity.m225$$Nest$mcheckSingleContentUpdateFromRow(r2, r1)
                return
        }

        private /* synthetic */ void lambda$bindUpdateButton$8(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r1, android.view.View r2) {
                r0 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r2 = r0.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity.m225$$Nest$mcheckSingleContentUpdateFromRow(r2, r1)
                return
        }

        private /* synthetic */ void lambda$bindUpdateButton$9(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r1, android.view.View r2) {
                r0 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r2 = r0.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity.m225$$Nest$mcheckSingleContentUpdateFromRow(r2, r1)
                return
        }

        private /* synthetic */ void lambda$bindWorldExportButton$5(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r1, android.view.View r2) {
                r0 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r2 = r0.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity.m246$$Nest$mstartWorldExportFromRow(r2, r1)
                return
        }

        private /* synthetic */ void lambda$loadMetadataAsync$10(java.lang.String r2, ca.dnamobile.javalauncher.InstanceDetailsActivity.LoadedContentMetadata r3, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentAdapter.ContentViewHolder r4, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r5) {
                r1 = this;
                java.util.Set<java.lang.String> r0 = r1.loadingMetadata
                r0.remove(r2)
                boolean r0 = r3.hasAny()
                if (r0 == 0) goto L11
                java.util.Map<java.lang.String, ca.dnamobile.javalauncher.InstanceDetailsActivity$LoadedContentMetadata> r0 = r1.metadataCache
                r0.put(r2, r3)
                goto L16
            L11:
                java.util.Set<java.lang.String> r0 = r1.missingMetadataCache
                r0.add(r2)
            L16:
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r1.this$0
                ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = ca.dnamobile.javalauncher.InstanceDetailsActivity.m217$$Nest$fgetbinding(r0)
                if (r0 == 0) goto L32
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r1.this$0
                boolean r0 = r0.isFinishing()
                if (r0 != 0) goto L32
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r1.this$0
                boolean r0 = r0.isDestroyed()
                if (r0 == 0) goto L2f
                goto L32
            L2f:
                r1.applyLoadedMetadata(r4, r5, r2, r3)
            L32:
                return
        }

        private /* synthetic */ void lambda$loadMetadataAsync$11(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r9, java.lang.String r10, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentAdapter.ContentViewHolder r11) {
                r8 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r8.this$0     // Catch: java.lang.Throwable -> L7
                ca.dnamobile.javalauncher.InstanceDetailsActivity$LoadedContentMetadata r0 = ca.dnamobile.javalauncher.InstanceDetailsActivity.m234$$Nest$mloadContentMetadataForItem(r0, r9)     // Catch: java.lang.Throwable -> L7
                goto L28
            L7:
                r0 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Unable to resolve installed content metadata for "
                r1.<init>(r2)
                java.io.File r2 = r9.file
                java.lang.String r2 = r2.getName()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "InstanceDetails"
                ca.dnamobile.javalauncher.feature.log.Logging.e(r2, r1, r0)
                ca.dnamobile.javalauncher.InstanceDetailsActivity$LoadedContentMetadata r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$LoadedContentMetadata
                r1 = 0
                r0.<init>(r1, r1)
            L28:
                r5 = r0
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r8.this$0
                android.os.Handler r0 = ca.dnamobile.javalauncher.InstanceDetailsActivity.m220$$Nest$fgetmainHandler(r0)
                ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter$$ExternalSyntheticLambda11 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter$$ExternalSyntheticLambda11
                r2 = r1
                r3 = r8
                r4 = r10
                r6 = r11
                r7 = r9
                r2.<init>(r3, r4, r5, r6, r7)
                r0.post(r1)
                return
        }

        private /* synthetic */ void lambda$loadSourceAsync$3(java.lang.String r3, ca.dnamobile.javalauncher.modmanager.ModManagerSource r4, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentAdapter.ContentViewHolder r5) {
                r2 = this;
                java.util.Set<java.lang.String> r0 = r2.loadingSource
                r0.remove(r3)
                java.util.Map<java.lang.String, ca.dnamobile.javalauncher.modmanager.ModManagerSource> r0 = r2.sourceCache
                r0.put(r3, r4)
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r2.this$0
                ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = ca.dnamobile.javalauncher.InstanceDetailsActivity.m217$$Nest$fgetbinding(r0)
                if (r0 == 0) goto L67
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r2.this$0
                boolean r0 = r0.isFinishing()
                if (r0 != 0) goto L67
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r2.this$0
                boolean r0 = r0.isDestroyed()
                if (r0 == 0) goto L23
                goto L67
            L23:
                android.view.View r0 = r5.itemView
                java.lang.Object r0 = r0.getTag()
                boolean r1 = r0 instanceof java.lang.String
                if (r1 == 0) goto L67
                boolean r3 = r3.equals(r0)
                if (r3 != 0) goto L34
                goto L67
            L34:
                android.widget.ImageView r3 = r5.sourceIcon
                boolean r0 = r4.hasIcon()
                if (r0 == 0) goto L3e
                r0 = 0
                goto L40
            L3e:
                r0 = 8
            L40:
                r3.setVisibility(r0)
                boolean r3 = r4.hasIcon()
                if (r3 == 0) goto L67
                android.widget.ImageView r3 = r5.sourceIcon
                int r0 = r4.getIconRes()
                r3.setImageResource(r0)
                android.widget.ImageView r3 = r5.sourceIcon
                ca.dnamobile.javalauncher.InstanceDetailsActivity r5 = r2.this$0
                int r0 = ca.dnamobile.javalauncher.R.string.modmanager_installed_from
                java.lang.String r4 = r4.getDisplayName()
                java.lang.Object[] r4 = new java.lang.Object[]{r4}
                java.lang.String r4 = r5.getString(r0, r4)
                r3.setContentDescription(r4)
            L67:
                return
        }

        private /* synthetic */ void lambda$loadSourceAsync$4(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r4, java.lang.String r5, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentAdapter.ContentViewHolder r6) {
                r3 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r3.this$0     // Catch: java.lang.Throwable -> L7
                ca.dnamobile.javalauncher.modmanager.ModManagerSource r4 = ca.dnamobile.javalauncher.InstanceDetailsActivity.m229$$Nest$mgetInstalledSourceForItem(r0, r4)     // Catch: java.lang.Throwable -> L7
                goto L34
            L7:
                r0 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Unable to resolve installed source for "
                r1.<init>(r2)
                java.io.File r4 = r4.file
                java.lang.String r4 = r4.getName()
                java.lang.StringBuilder r4 = r1.append(r4)
                java.lang.String r1 = ": "
                java.lang.StringBuilder r4 = r4.append(r1)
                ca.dnamobile.javalauncher.InstanceDetailsActivity r1 = r3.this$0
                java.lang.String r0 = ca.dnamobile.javalauncher.InstanceDetailsActivity.m236$$Nest$mreadableError(r1, r0)
                java.lang.StringBuilder r4 = r4.append(r0)
                java.lang.String r4 = r4.toString()
                java.lang.String r0 = "InstanceDetails"
                ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r4)
                ca.dnamobile.javalauncher.modmanager.ModManagerSource r4 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.UNKNOWN
            L34:
                if (r4 != 0) goto L38
                ca.dnamobile.javalauncher.modmanager.ModManagerSource r4 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.UNKNOWN
            L38:
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r3.this$0
                android.os.Handler r0 = ca.dnamobile.javalauncher.InstanceDetailsActivity.m220$$Nest$fgetmainHandler(r0)
                ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter$$ExternalSyntheticLambda10 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter$$ExternalSyntheticLambda10
                r1.<init>(r3, r5, r4, r6)
                r0.post(r1)
                return
        }

        private /* synthetic */ void lambda$onBindViewHolder$0(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r1, android.view.View r2) {
                r0 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r2 = r0.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity.m235$$Nest$mprepareContentRowAction(r2)
                ca.dnamobile.javalauncher.InstanceDetailsActivity r2 = r0.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem r1 = ca.dnamobile.javalauncher.InstanceDetailsActivity.m240$$Nest$mresolveContentItemForAction(r2, r1)
                java.io.File r1 = r1.file
                java.lang.String r1 = r1.getName()
                ca.dnamobile.javalauncher.InstanceDetailsActivity.m233$$Nest$mlaunchInstance(r2, r1)
                return
        }

        private /* synthetic */ void lambda$onBindViewHolder$1(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r1, android.widget.CompoundButton r2, boolean r3) {
                r0 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r2 = r0.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity.m242$$Nest$msetContentItemEnabledFromRow(r2, r1, r3)
                return
        }

        private /* synthetic */ void lambda$onBindViewHolder$2(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r1, android.view.View r2) {
                r0 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r2 = r0.this$0
                ca.dnamobile.javalauncher.InstanceDetailsActivity.m245$$Nest$mshowDeleteContentItemDialogFromRow(r2, r1)
                return
        }

        private void loadMetadataAsync(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentAdapter.ContentViewHolder r3, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r4, java.lang.String r5) {
                r2 = this;
                java.util.Set<java.lang.String> r0 = r2.loadingMetadata
                boolean r0 = r0.add(r5)
                if (r0 != 0) goto L9
                return
            L9:
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r2.this$0
                java.util.concurrent.ExecutorService r0 = ca.dnamobile.javalauncher.InstanceDetailsActivity.m219$$Nest$fgeticonExecutor(r0)
                ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter$$ExternalSyntheticLambda9 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter$$ExternalSyntheticLambda9
                r1.<init>(r2, r4, r5, r3)
                r0.execute(r1)
                return
        }

        private void loadSourceAsync(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentAdapter.ContentViewHolder r3, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r4, java.lang.String r5) {
                r2 = this;
                java.util.Set<java.lang.String> r0 = r2.loadingSource
                boolean r0 = r0.add(r5)
                if (r0 != 0) goto L9
                return
            L9:
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r2.this$0
                java.util.concurrent.ExecutorService r0 = ca.dnamobile.javalauncher.InstanceDetailsActivity.m219$$Nest$fgeticonExecutor(r0)
                ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter$$ExternalSyntheticLambda2 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter$$ExternalSyntheticLambda2
                r1.<init>(r2, r4, r5, r3)
                r0.execute(r1)
                return
        }

        void clearTransientCachesForFile(java.lang.String r5) {
                r4 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.Map<java.lang.String, ca.dnamobile.javalauncher.InstanceDetailsActivity$LoadedContentMetadata> r1 = r4.metadataCache
                java.util.Set r1 = r1.keySet()
                r0.<init>(r1)
                java.util.Iterator r0 = r0.iterator()
            Lf:
                boolean r1 = r0.hasNext()
                java.lang.String r2 = ":"
                if (r1 == 0) goto L3a
                java.lang.Object r1 = r0.next()
                java.lang.String r1 = (java.lang.String) r1
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.StringBuilder r3 = r3.append(r5)
                java.lang.StringBuilder r2 = r3.append(r2)
                java.lang.String r2 = r2.toString()
                boolean r2 = r1.startsWith(r2)
                if (r2 == 0) goto Lf
                java.util.Map<java.lang.String, ca.dnamobile.javalauncher.InstanceDetailsActivity$LoadedContentMetadata> r2 = r4.metadataCache
                r2.remove(r1)
                goto Lf
            L3a:
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.Map<java.lang.String, ca.dnamobile.javalauncher.modmanager.ModManagerSource> r1 = r4.sourceCache
                java.util.Set r1 = r1.keySet()
                r0.<init>(r1)
                java.util.Iterator r0 = r0.iterator()
            L49:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L72
                java.lang.Object r1 = r0.next()
                java.lang.String r1 = (java.lang.String) r1
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.StringBuilder r3 = r3.append(r5)
                java.lang.StringBuilder r3 = r3.append(r2)
                java.lang.String r3 = r3.toString()
                boolean r3 = r1.startsWith(r3)
                if (r3 == 0) goto L49
                java.util.Map<java.lang.String, ca.dnamobile.javalauncher.modmanager.ModManagerSource> r3 = r4.sourceCache
                r3.remove(r1)
                goto L49
            L72:
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.Set<java.lang.String> r1 = r4.missingMetadataCache
                r0.<init>(r1)
                java.util.Iterator r0 = r0.iterator()
            L7d:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto La6
                java.lang.Object r1 = r0.next()
                java.lang.String r1 = (java.lang.String) r1
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.StringBuilder r3 = r3.append(r5)
                java.lang.StringBuilder r3 = r3.append(r2)
                java.lang.String r3 = r3.toString()
                boolean r3 = r1.startsWith(r3)
                if (r3 == 0) goto L7d
                java.util.Set<java.lang.String> r3 = r4.missingMetadataCache
                r3.remove(r1)
                goto L7d
            La6:
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
                r1 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r1.this$0
                java.util.ArrayList r0 = ca.dnamobile.javalauncher.InstanceDetailsActivity.m218$$Nest$fgetcontentItems(r0)
                int r0 = r0.size()
                return r0
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int r5) {
                r4 = this;
                if (r5 < 0) goto L34
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r4.this$0
                java.util.ArrayList r0 = ca.dnamobile.javalauncher.InstanceDetailsActivity.m218$$Nest$fgetcontentItems(r0)
                int r0 = r0.size()
                if (r5 < r0) goto Lf
                goto L34
            Lf:
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r4.this$0
                java.util.ArrayList r0 = ca.dnamobile.javalauncher.InstanceDetailsActivity.m218$$Nest$fgetcontentItems(r0)
                java.lang.Object r5 = r0.get(r5)
                ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem r5 = (ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem) r5
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r4.this$0
                java.io.File r1 = r5.file
                java.lang.String r0 = ca.dnamobile.javalauncher.InstanceDetailsActivity.m241$$Nest$msafeCanonicalPath(r0, r1)
                int r0 = r0.hashCode()
                long r0 = (long) r0
                r2 = 31
                long r0 = r0 * r2
                ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r5 = r5.category
                int r5 = r5.ordinal()
                long r2 = (long) r5
                long r0 = r0 + r2
                return r0
            L34:
                r0 = -1
                return r0
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
                r0 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter$ContentViewHolder r1 = (ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentAdapter.ContentViewHolder) r1
                r0.onBindViewHolder(r1, r2)
                return
        }

        public void onBindViewHolder(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentAdapter.ContentViewHolder r7, int r8) {
                r6 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity r0 = r6.this$0
                java.util.ArrayList r0 = ca.dnamobile.javalauncher.InstanceDetailsActivity.m218$$Nest$fgetcontentItems(r0)
                java.lang.Object r8 = r0.get(r8)
                ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem r8 = (ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem) r8
                java.lang.String r0 = r6.buildMetadataKey(r8)
                android.view.View r1 = r7.itemView
                r1.setTag(r0)
                android.widget.TextView r1 = r7.title
                java.lang.String r2 = r8.title
                r1.setText(r2)
                android.widget.TextView r1 = r7.subtitle
                ca.dnamobile.javalauncher.InstanceDetailsActivity r2 = r6.this$0
                java.lang.String r2 = ca.dnamobile.javalauncher.InstanceDetailsActivity.m228$$Nest$mformatSubtitle(r2, r8)
                r1.setText(r2)
                r6.applyFallbackIcon(r7, r8)
                java.util.Map<java.lang.String, ca.dnamobile.javalauncher.InstanceDetailsActivity$LoadedContentMetadata> r1 = r6.metadataCache
                java.lang.Object r1 = r1.get(r0)
                ca.dnamobile.javalauncher.InstanceDetailsActivity$LoadedContentMetadata r1 = (ca.dnamobile.javalauncher.InstanceDetailsActivity.LoadedContentMetadata) r1
                if (r1 == 0) goto L38
                r6.applyLoadedMetadata(r7, r8, r0, r1)
                goto L43
            L38:
                java.util.Set<java.lang.String> r1 = r6.missingMetadataCache
                boolean r1 = r1.contains(r0)
                if (r1 != 0) goto L43
                r6.loadMetadataAsync(r7, r8, r0)
            L43:
                java.util.Map<java.lang.String, ca.dnamobile.javalauncher.modmanager.ModManagerSource> r1 = r6.sourceCache
                java.lang.Object r1 = r1.get(r0)
                ca.dnamobile.javalauncher.modmanager.ModManagerSource r1 = (ca.dnamobile.javalauncher.modmanager.ModManagerSource) r1
                r2 = 8
                r3 = 0
                if (r1 != 0) goto L59
                android.widget.ImageView r1 = r7.sourceIcon
                r1.setVisibility(r2)
                r6.loadSourceAsync(r7, r8, r0)
                goto L8b
            L59:
                android.widget.ImageView r0 = r7.sourceIcon
                boolean r4 = r1.hasIcon()
                if (r4 == 0) goto L63
                r4 = r3
                goto L64
            L63:
                r4 = r2
            L64:
                r0.setVisibility(r4)
                boolean r0 = r1.hasIcon()
                if (r0 == 0) goto L8b
                android.widget.ImageView r0 = r7.sourceIcon
                int r4 = r1.getIconRes()
                r0.setImageResource(r4)
                android.widget.ImageView r0 = r7.sourceIcon
                ca.dnamobile.javalauncher.InstanceDetailsActivity r4 = r6.this$0
                int r5 = ca.dnamobile.javalauncher.R.string.modmanager_installed_from
                java.lang.String r1 = r1.getDisplayName()
                java.lang.Object[] r1 = new java.lang.Object[]{r1}
                java.lang.String r1 = r4.getString(r5, r1)
                r0.setContentDescription(r1)
            L8b:
                ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r0 = r8.category
                ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r1 = ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory.WORLDS
                r4 = 1
                if (r0 != r1) goto L9c
                java.io.File r0 = r8.file
                boolean r0 = r0.isDirectory()
                if (r0 == 0) goto L9c
                r0 = r4
                goto L9d
            L9c:
                r0 = r3
            L9d:
                com.google.android.material.button.MaterialButton r1 = r7.playWorldButton
                if (r0 == 0) goto La3
                r5 = r3
                goto La4
            La3:
                r5 = r2
            La4:
                r1.setVisibility(r5)
                com.google.android.material.button.MaterialButton r1 = r7.playWorldButton
                r5 = 0
                if (r0 == 0) goto Lb2
                ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter$$ExternalSyntheticLambda0 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter$$ExternalSyntheticLambda0
                r0.<init>(r6, r8)
                goto Lb3
            Lb2:
                r0 = r5
            Lb3:
                r1.setOnClickListener(r0)
                ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r0 = r8.category
                ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r1 = ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory.WORLDS
                if (r0 != r1) goto Lc8
                java.io.File r0 = r8.file
                boolean r0 = r0.isDirectory()
                if (r0 == 0) goto Lc8
                r6.bindWorldExportButton(r7, r8)
                goto Ldc
            Lc8:
                ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r0 = r8.category
                boolean r0 = r0.supportsUpdatePlaceholder
                if (r0 == 0) goto Ld2
                r6.bindUpdateButton(r7, r8)
                goto Ldc
            Ld2:
                com.google.android.material.button.MaterialButton r0 = r7.updateButton
                r0.setVisibility(r2)
                com.google.android.material.button.MaterialButton r0 = r7.updateButton
                r0.setOnClickListener(r5)
            Ldc:
                ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r0 = r8.category
                boolean r0 = r0.supportsDisableToggle
                if (r0 == 0) goto Leb
                java.io.File r0 = r8.file
                boolean r0 = r0.isFile()
                if (r0 == 0) goto Leb
                goto Lec
            Leb:
                r4 = r3
            Lec:
                com.google.android.material.switchmaterial.SwitchMaterial r0 = r7.enabledSwitch
                r0.setOnCheckedChangeListener(r5)
                com.google.android.material.switchmaterial.SwitchMaterial r0 = r7.enabledSwitch
                if (r4 == 0) goto Lf6
                r2 = r3
            Lf6:
                r0.setVisibility(r2)
                com.google.android.material.switchmaterial.SwitchMaterial r0 = r7.enabledSwitch
                ca.dnamobile.javalauncher.InstanceDetailsActivity r1 = r6.this$0
                java.io.File r2 = r8.file
                boolean r1 = ca.dnamobile.javalauncher.InstanceDetailsActivity.m232$$Nest$misContentItemEnabled(r1, r2)
                r0.setChecked(r1)
                if (r4 == 0) goto L112
                com.google.android.material.switchmaterial.SwitchMaterial r0 = r7.enabledSwitch
                ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter$$ExternalSyntheticLambda3 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter$$ExternalSyntheticLambda3
                r1.<init>(r6, r8)
                r0.setOnCheckedChangeListener(r1)
            L112:
                com.google.android.material.button.MaterialButton r0 = r7.deleteButton
                r0.setVisibility(r3)
                com.google.android.material.button.MaterialButton r7 = r7.deleteButton
                ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter$$ExternalSyntheticLambda4 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter$$ExternalSyntheticLambda4
                r0.<init>(r6, r8)
                r7.setOnClickListener(r0)
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r1, int r2) {
                r0 = this;
                ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter$ContentViewHolder r1 = r0.onCreateViewHolder(r1, r2)
                return r1
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentAdapter.ContentViewHolder onCreateViewHolder(android.view.ViewGroup r3, int r4) {
                r2 = this;
                android.content.Context r4 = r3.getContext()
                android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
                int r0 = ca.dnamobile.javalauncher.R.layout.item_instance_resource
                r1 = 0
                android.view.View r3 = r4.inflate(r0, r3, r1)
                ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter$ContentViewHolder r4 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter$ContentViewHolder
                r4.<init>(r2, r3)
                return r4
        }
    }

    private static final class InstanceContentItem {
        final ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory category;
        final java.io.File file;
        final java.lang.String title;

        InstanceContentItem(java.io.File r1, ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.file = r1
                r0.category = r2
                r0.title = r3
                return
        }
    }

    private static final class LoadedContentMetadata {
        final java.lang.String displayName;
        final android.graphics.Bitmap icon;

        LoadedContentMetadata(java.lang.String r1, android.graphics.Bitmap r2) {
                r0 = this;
                r0.<init>()
                r0.displayName = r1
                r0.icon = r2
                return
        }

        boolean hasAny() {
                r1 = this;
                java.lang.String r0 = r1.displayName
                if (r0 == 0) goto Le
                java.lang.String r0 = r0.trim()
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L12
            Le:
                android.graphics.Bitmap r0 = r1.icon
                if (r0 == 0) goto L14
            L12:
                r0 = 1
                goto L15
            L14:
                r0 = 0
            L15:
                return r0
        }
    }

    private enum ResourceCategory extends java.lang.Enum<ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory> {
        private static final /* synthetic */ ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory[] $VALUES = null;
        public static final ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory MODS = null;
        public static final ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory RESOURCEPACKS = null;
        public static final ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory SHADERPACKS = null;
        public static final ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory WORLDS = null;
        final int browseButtonTextRes;
        final java.lang.String defaultExtension;
        final int defaultIconRes;
        final java.lang.String mimeType;
        final java.lang.String[] mimeTypes;
        final int pickerTitleRes;
        final int pluralLabelRes;
        final boolean supportsBrowse;
        final boolean supportsDisableToggle;
        final boolean supportsUpdatePlaceholder;
        final int tabTitleRes;
        final int uploadButtonTextRes;

        private static /* synthetic */ ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory[] $values() {
                ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r0 = ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory.MODS
                ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r1 = ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory.SHADERPACKS
                ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r2 = ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory.RESOURCEPACKS
                ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r3 = ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory.WORLDS
                ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory[] r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory[]{r0, r1, r2, r3}
                return r0
        }

        static {
                ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r15 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory
                int r3 = ca.dnamobile.javalauncher.R.string.instance_tab_mods
                int r4 = ca.dnamobile.javalauncher.R.string.button_upload_mods
                int r5 = ca.dnamobile.javalauncher.R.string.button_browse_mods
                int r6 = ca.dnamobile.javalauncher.R.string.mods_picker_title
                int r7 = ca.dnamobile.javalauncher.R.string.instance_content_mods_plural
                int r8 = ca.dnamobile.javalauncher.R.drawable.ic_instance_mod_24
                r0 = 4
                java.lang.String[] r10 = new java.lang.String[r0]
                java.lang.String r0 = "application/java-archive"
                r16 = 0
                r10[r16] = r0
                java.lang.String r0 = "application/x-java-archive"
                r17 = 1
                r10[r17] = r0
                r14 = 2
                java.lang.String r18 = "application/zip"
                r10[r14] = r18
                r0 = 3
                java.lang.String r19 = "application/octet-stream"
                r10[r0] = r19
                r13 = 1
                r20 = 1
                java.lang.String r1 = "MODS"
                r2 = 0
                java.lang.String r9 = "*/*"
                java.lang.String r11 = ".jar"
                r12 = 1
                r0 = r15
                r14 = r20
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory.MODS = r15
                ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory
                int r25 = ca.dnamobile.javalauncher.R.string.instance_tab_shaderpacks
                int r26 = ca.dnamobile.javalauncher.R.string.button_upload_shaderpacks
                int r27 = ca.dnamobile.javalauncher.R.string.button_browse_shaderpacks
                int r28 = ca.dnamobile.javalauncher.R.string.shaderpacks_picker_title
                int r29 = ca.dnamobile.javalauncher.R.string.instance_content_shaderpacks_plural
                int r30 = ca.dnamobile.javalauncher.R.drawable.ic_instance_shaderpack_24
                r1 = 2
                java.lang.String[] r2 = new java.lang.String[r1]
                r2[r16] = r18
                r2[r17] = r19
                r35 = 1
                r36 = 1
                java.lang.String r23 = "SHADERPACKS"
                r24 = 1
                java.lang.String r31 = "*/*"
                java.lang.String r33 = ".zip"
                r34 = 1
                r22 = r0
                r32 = r2
                r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
                ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory.SHADERPACKS = r0
                ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory
                int r40 = ca.dnamobile.javalauncher.R.string.instance_tab_resourcepacks
                int r41 = ca.dnamobile.javalauncher.R.string.button_upload_resourcepacks
                int r42 = ca.dnamobile.javalauncher.R.string.button_browse_resourcepacks
                int r43 = ca.dnamobile.javalauncher.R.string.resourcepacks_picker_title
                int r44 = ca.dnamobile.javalauncher.R.string.instance_content_resourcepacks_plural
                int r45 = ca.dnamobile.javalauncher.R.drawable.ic_instance_resourcepack_24
                java.lang.String[] r2 = new java.lang.String[r1]
                r2[r16] = r18
                r2[r17] = r19
                r50 = 1
                r51 = 1
                java.lang.String r38 = "RESOURCEPACKS"
                r39 = 2
                java.lang.String r46 = "*/*"
                java.lang.String r48 = ".zip"
                r49 = 1
                r37 = r0
                r47 = r2
                r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)
                ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory.RESOURCEPACKS = r0
                ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory
                int r23 = ca.dnamobile.javalauncher.R.string.instance_tab_worlds
                int r24 = ca.dnamobile.javalauncher.R.string.button_upload_worlds
                int r26 = ca.dnamobile.javalauncher.R.string.worlds_picker_title
                int r27 = ca.dnamobile.javalauncher.R.string.instance_content_worlds_plural
                int r28 = ca.dnamobile.javalauncher.R.drawable.ic_instance_world_24
                java.lang.String[] r1 = new java.lang.String[r1]
                r1[r16] = r18
                r1[r17] = r19
                r33 = 0
                r34 = 0
                java.lang.String r21 = "WORLDS"
                r22 = 3
                r25 = 0
                java.lang.String r29 = "*/*"
                java.lang.String r31 = ".zip"
                r32 = 0
                r20 = r0
                r30 = r1
                r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
                ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory.WORLDS = r0
                ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory[] r0 = $values()
                ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory.$VALUES = r0
                return
        }

        ResourceCategory(java.lang.String r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, java.lang.String r9, java.lang.String[] r10, java.lang.String r11, boolean r12, boolean r13, boolean r14) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.tabTitleRes = r3
                r0.uploadButtonTextRes = r4
                r0.browseButtonTextRes = r5
                r0.pickerTitleRes = r6
                r0.pluralLabelRes = r7
                r0.defaultIconRes = r8
                r0.mimeType = r9
                r0.mimeTypes = r10
                r0.defaultExtension = r11
                r0.supportsUpdatePlaceholder = r12
                r0.supportsBrowse = r13
                r0.supportsDisableToggle = r14
                return
        }

        public static ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory valueOf(java.lang.String r1) {
                java.lang.Class<ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory> r0 = ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r1 = (ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory) r1
                return r1
        }

        public static ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory[] values() {
                ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory[] r0 = ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory.$VALUES
                java.lang.Object r0 = r0.clone()
                ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory[] r0 = (ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory[]) r0
                return r0
        }
    }

    private static final class UpdateCleanupPlan {
        final ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.UpdateCandidate candidate;
        final ca.dnamobile.javalauncher.modmanager.ModManagerContentType contentType;
        final long createdAt;
        boolean hadModpackMetadata;
        final java.lang.String key;
        final java.util.HashSet<java.lang.String> oldCanonicalPaths;
        final java.util.ArrayList<java.io.File> oldFiles;
        final java.lang.String projectId;
        final ca.dnamobile.javalauncher.modmanager.ModManagerSource source;

        UpdateCleanupPlan(ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.UpdateCandidate r2, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r3, ca.dnamobile.javalauncher.modmanager.ModManagerSource r4, java.lang.String r5, java.lang.String r6, long r7) {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.oldFiles = r0
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r1.oldCanonicalPaths = r0
                r1.candidate = r2
                r1.contentType = r3
                r1.source = r4
                r1.projectId = r5
                r1.key = r6
                r1.createdAt = r7
                return
        }
    }

    private enum UpdateState extends java.lang.Enum<ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState> {
        private static final /* synthetic */ ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState[] $VALUES = null;
        public static final ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState CHECKING = null;
        public static final ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState ERROR = null;
        public static final ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState UNKNOWN = null;
        public static final ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState UPDATE_AVAILABLE = null;
        public static final ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState UPDATING = null;
        public static final ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState UP_TO_DATE = null;

        private static /* synthetic */ ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState[] $values() {
                ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState r0 = ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState.UNKNOWN
                ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState r1 = ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState.CHECKING
                ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState r2 = ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState.UPDATE_AVAILABLE
                ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState r3 = ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState.UPDATING
                ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState r4 = ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState.UP_TO_DATE
                ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState r5 = ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState.ERROR
                ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState[] r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState[]{r0, r1, r2, r3, r4, r5}
                return r0
        }

        static {
                ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState
                java.lang.String r1 = "UNKNOWN"
                r2 = 0
                r0.<init>(r1, r2)
                ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState.UNKNOWN = r0
                ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState
                java.lang.String r1 = "CHECKING"
                r2 = 1
                r0.<init>(r1, r2)
                ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState.CHECKING = r0
                ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState
                java.lang.String r1 = "UPDATE_AVAILABLE"
                r2 = 2
                r0.<init>(r1, r2)
                ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState.UPDATE_AVAILABLE = r0
                ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState
                java.lang.String r1 = "UPDATING"
                r2 = 3
                r0.<init>(r1, r2)
                ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState.UPDATING = r0
                ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState
                java.lang.String r1 = "UP_TO_DATE"
                r2 = 4
                r0.<init>(r1, r2)
                ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState.UP_TO_DATE = r0
                ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState
                java.lang.String r1 = "ERROR"
                r2 = 5
                r0.<init>(r1, r2)
                ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState.ERROR = r0
                ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState[] r0 = $values()
                ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState.$VALUES = r0
                return
        }

        UpdateState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState valueOf(java.lang.String r1) {
                java.lang.Class<ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState> r0 = ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState r1 = (ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState) r1
                return r1
        }

        public static ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState[] values() {
                ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState[] r0 = ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState.$VALUES
                java.lang.Object r0 = r0.clone()
                ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState[] r0 = (ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState[]) r0
                return r0
        }
    }

    public static /* synthetic */ void $r8$lambda$01GEJXT25lZjDJWiduMf_Xrwsms(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, int r1, ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory r2, java.util.ArrayList r3, java.io.File r4) {
            r0.lambda$refreshContentList$82(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void $r8$lambda$02vBUUkgix1h1casN5gOGtpy6ws(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, android.app.AlertDialog r1, android.widget.EditText r2, int[] r3, boolean[] r4, com.google.android.material.switchmaterial.SwitchMaterial r5, android.widget.SeekBar r6, int r7, int r8, int r9, android.widget.TextView r10, int r11, android.content.DialogInterface r12) {
            r0.lambda$showPerInstanceRamInputDialog$119(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
    }

    public static /* synthetic */ void $r8$lambda$06kaC0pzbg8dIc9891ZTdFBVqck(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind r1, java.util.ArrayList r2) {
            r0.lambda$showUpdateLoaderDialog$45(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$0b06cgF8RW5vOdIIi9JPil68-z4, reason: not valid java name */
    public static /* synthetic */ void m179$r8$lambda$0b06cgF8RW5vOdIIi9JPil68z4(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.io.File r1, android.net.Uri r2) {
            r0.lambda$exportWorldToUri$117(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$14NtIEuF4YUgbkfNDSuTdWMsmPs(ca.dnamobile.javalauncher.InstanceDetailsActivity r0) {
            r0.finishDeleteAndClose()
            return
    }

    public static /* synthetic */ void $r8$lambda$1I4tB35ZZ8gADpLniNtnwydXGt8(ca.dnamobile.javalauncher.InstanceDetailsActivity r0) {
            r0.lambda$deleteInstance$76()
            return
    }

    public static /* synthetic */ void $r8$lambda$24jVGIJKn6X06qSxrX0PK2kpsBw(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.lang.Throwable r1) {
            r0.lambda$runRepairInstance$57(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$31TGbxXBNVEpV7KxAa2oD67iPnI(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.lang.String r1) {
            r0.lambda$runVersionUpdate$27(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$31kqs7TH9Z0jmE1Olc7PCJoNc5M(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.util.ArrayList r1, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.ProjectMatch r2, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo r3) {
            r0.lambda$loadModpackVersions$32(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$3Ttn1-D9DcqHOTMguKRAmIvqan4, reason: not valid java name */
    public static /* synthetic */ void m180$r8$lambda$3Ttn1D9DcqHOTMguKRAmIvqan4(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderVersion r1) {
            r0.lambda$runLoaderUpdate$52(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$3VaGDMnEhbkqxoVux4GDWXtlFo4(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.lang.Throwable r1) {
            r0.lambda$deleteInstance$75(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$3p-sTOG5GERVdnduU5eUydQO_x8, reason: not valid java name */
    public static /* synthetic */ void m181$r8$lambda$3psTOG5GERVdnduU5eUydQO_x8(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, android.view.View r1) {
            r0.lambda$setupActions$7(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$3yv_H7MebUMcqNi3fwod54RoBKY(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.lang.String r1, android.content.DialogInterface r2, int r3) {
            r0.lambda$showRendererPluginStorageDialog$63(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$4uCjk1gpslfRfeAnbaNgVII7HnM(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.lang.String r1, java.lang.Throwable r2, ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.UpdateCandidate r3) {
            r0.lambda$updateCandidate$104(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$6_mVYyS49tqZMfSpkXcZX9lB-Iw, reason: not valid java name */
    public static /* synthetic */ void m182$r8$lambda$6_mVYyS49tqZMfSpkXcZX9lBIw(ca.dnamobile.javalauncher.InstanceDetailsActivity r0) {
            r0.lambda$refreshContentList$80()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$7EBbnB_BvFfAy-7B_dnq0mOsDfs, reason: not valid java name */
    public static /* synthetic */ void m183$r8$lambda$7EBbnB_BvFfAy7B_dnq0mOsDfs(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, int r1, int r2) {
            r0.lambda$checkUpdatesForSelectedCategory$93(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$7LeJ3Lze3dUsrUQDDXRA2mEAgqo(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, int r1, int r2) {
            r0.lambda$checkUpdatesForSelectedCategory$94(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$7UfEi5_hfeh4PRVCSck7BNO_vnc(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo r1, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.ProjectMatch r2, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo r3) {
            r0.lambda$runModpackUpdate$43(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$7XDOUthxT_9b2dZyMpJoWgA-QFE, reason: not valid java name */
    public static /* synthetic */ void m184$r8$lambda$7XDOUthxT_9b2dZyMpJoWgAQFE(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.UpdateCandidate r1, ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateCleanupPlan r2, java.lang.String r3) {
            r0.lambda$updateCandidate$105(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$8ncUbjsiGgVxPo_ZU71GY0C4tMo(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, android.net.Uri r1) {
            r0.lambda$importModpackFromUri$18(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$900JvuEhCgHWoA8XjiWmSfXsAm4(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r1) {
            r0.lambda$deleteContentItem$89(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$96x8yHa_oWPbJeAYE9MjPlav_Mw(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.lang.Throwable r1) {
            r0.lambda$checkUpdatesForSelectedCategory$97(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$ATH5fIGyV-NxAhh2niWRzwiT64g, reason: not valid java name */
    public static /* synthetic */ void m185$r8$lambda$ATH5fIGyVNxAhh2niWRzwiT64g(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, androidx.activity.result.ActivityResult r1) {
            r0.lambda$registerMobileGluesFolderPickerLauncher$60(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$C3homXgnUkTOVI3A9slUrmSRufA(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.lang.String r1) {
            r0.lambda$runModpackUpdate$40(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$CcXQg6WQQUV3aXR5kbG1vQQxauw(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.lang.Throwable r1) {
            r0.lambda$runLoaderUpdate$51(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$CedlT-j2WhcnIdkHvS5oiUjhsxk, reason: not valid java name */
    public static /* synthetic */ void m186$r8$lambda$CedlTj2WhcnIdkHvS5oiUjhsxk(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo r1, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.ProjectMatch r2, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo r3, android.content.DialogInterface r4, int r5) {
            r0.lambda$showModpackBackupWarning$39(r1, r2, r3, r4, r5)
            return
    }

    public static /* synthetic */ void $r8$lambda$DwoVi6gVCidyUfZ6gzH00KANvB0(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, android.view.View r1) {
            r0.lambda$setupActions$6(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$DybIgasr70gEAE2m2qLttfjZEPY(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, int r1, java.lang.String r2) {
            r0.lambda$runRepairInstance$55(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$Efg4CWHcQclSK265HVczlQRmN1E(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1) {
            r0.lambda$checkUpdatesForSelectedCategory$98(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$G85ED94RHz3eMBEG8BZ5qOQhODI(ca.dnamobile.javalauncher.InstanceDetailsActivity r0) {
            r0.lambda$checkUpdatesForSelectedCategory$92()
            return
    }

    public static /* synthetic */ void $r8$lambda$H1pH_fW8_F3IDiXf1UDAf1URyl4(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.lang.String r1) {
            r0.lambda$launchInstance$59(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$HUyuh8idgEbnhr09Oe8n1ak0UHA(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1, java.io.File r2, ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory r3, int r4) {
            r0.lambda$refreshContentList$83(r1, r2, r3, r4)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$HblXFDe9CCbL3_R-dVveu88ii6w, reason: not valid java name */
    public static /* synthetic */ void m187$r8$lambda$HblXFDe9CCbL3_RdVveu88ii6w(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r1) {
            r0.lambda$deleteContentItem$87(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$IATmAD8jwxiXP0ipaDSQbUT43CY(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.UpdateCandidate r1, java.lang.String r2) {
            r0.lambda$checkSingleContentUpdate$99(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$IaY43iPXXyhcuqItLIwoKctX-Rw, reason: not valid java name */
    public static /* synthetic */ void m188$r8$lambda$IaY43iPXXyhcuqItLIwoKctXRw(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform r1, ca.dnamobile.javalauncher.modmanager.ModpackExportManager.ExportOptions r2) {
            r0.lambda$startModpackExport$16(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$J10M8Kepipc4yDciooVFg3d2QQ0(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, android.widget.PopupWindow r1, int r2, android.view.View r3) {
            r0.lambda$addInstanceSettingsMenuRow$11(r1, r2, r3)
            return
    }

    public static /* synthetic */ java.lang.String $r8$lambda$JPDhy5Fpg6vr6Gtic4SKzeyE4WY(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory r1, java.io.File r2) {
            java.lang.String r0 = r0.lambda$refreshContentList$79(r1, r2)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$Jvql5xe6pKVKI5ufnqyQQHenR0s(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.lang.String r1, android.content.DialogInterface r2, int r3) {
            r0.lambda$showFolderPathFallback$64(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$K6pRJonU2-5UDM3a8Qn4sJqWQV4, reason: not valid java name */
    public static /* synthetic */ void m189$r8$lambda$K6pRJonU25UDM3a8Qn4sJqWQV4(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.io.File r1, java.lang.String r2, android.app.AlertDialog r3) {
            r0.lambda$renameInstance$69(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$KUirDoRy8VmZ7mpAjkTFo2JMz9E(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo r1) {
            r0.lambda$showUpdateModpackDialog$30(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$Lqc5JkklhfcUbandEQr05oZTnjw(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory r1, java.lang.Throwable r2) {
            r0.lambda$importSelectedContent$113(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$MbGjFyNMBrmtvPjXADjoXfga1aQ(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r1, android.content.DialogInterface r2, int r3) {
            r0.lambda$showDeleteContentItemDialog$86(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$MfRK1luwrb17sVhR2aKWVEVR8WA(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, ca.dnamobile.javalauncher.instance.LauncherInstance r1, android.app.AlertDialog r2, java.lang.String r3) {
            r0.lambda$renameInstance$67(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$Mu189poP11_rukucM5rKdlFREEc(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.util.ArrayList r1) {
            r0.lambda$checkUpdatesForSelectedCategory$96(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$Mx1mdmrEhLfTaWnCKdS3ron7nik(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.lang.Throwable r1) {
            r0.lambda$showUpdateLoaderDialog$46(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$NHzpm_MbX08boILNKkYDzRzI7BA(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.lang.String r1, android.content.DialogInterface r2, int r3) {
            r0.lambda$confirmUpdateVersion$24(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$NXKbAymnSIy0Ji9nlx_sisQhQvo(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderVersion r1, android.content.DialogInterface r2, int r3) {
            r0.lambda$confirmUpdateLoader$49(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$NhklRRMaVFoT6ne3GwNbUaqCAuc(ca.dnamobile.javalauncher.InstanceDetailsActivity r0) {
            r0.lambda$showUpdateVersionDialog$21()
            return
    }

    public static /* synthetic */ void $r8$lambda$NvxvNVrkHn1ZyDoqlBEDmJ7dX1A(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, android.app.AlertDialog r1) {
            r0.lambda$showExportModpackPlatformDialog$12(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$O0ADe2HlI7dpa628DVD4b0-f2R0, reason: not valid java name */
    public static /* synthetic */ void m190$r8$lambda$O0ADe2HlI7dpa628DVD4b0f2R0(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.lang.Throwable r1, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r2) {
            r0.lambda$deleteContentItem$88(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$OA1lKlnpHGCy68ydBjM-YT3qdKg, reason: not valid java name */
    public static /* synthetic */ java.lang.String m191$r8$lambda$OA1lKlnpHGCy68ydBjMYT3qdKg(java.io.File r0) {
            java.lang.String r0 = r0.getName()
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$OPFnnYAAJ7DTVHVSe1H-oqwXVdw, reason: not valid java name */
    public static /* synthetic */ void m192$r8$lambda$OPFnnYAAJ7DTVHVSe1HoqwXVdw(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.UpdateResult r1) {
            r0.lambda$runVersionUpdate$25(r1)
            return
    }

    public static /* synthetic */ boolean $r8$lambda$P7lT0eDHu7VIfO99XvixuAU1RlY(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, android.widget.TextView r1, int r2, android.view.KeyEvent r3) {
            boolean r0 = r0.lambda$setupContentSearch$9(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$PZReTP1leKi2icEmuleCLVsAeyE(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, int[] r1, java.util.ArrayList r2, android.app.AlertDialog[] r3, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo r4, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.ProjectMatch r5, android.view.View r6) {
            r0.lambda$showModpackVersionChooser$37(r1, r2, r3, r4, r5, r6)
            return
    }

    public static /* synthetic */ void $r8$lambda$PhFcRscDxH2B55Z3dN0WPOTrpOE(ca.dnamobile.javalauncher.InstanceDetailsActivity r0) {
            r0.runQueuedContentSearchFilter()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$PtpZWcghkYcyoyaDV1Z-d-Hi5dI, reason: not valid java name */
    public static /* synthetic */ void m193$r8$lambda$PtpZWcghkYcyoyaDV1ZdHi5dI(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.lang.Throwable r1) {
            r0.lambda$showUpdateVersionDialog$20(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$Q3M83TCX0ZZHcunAa6riMICbHQ8(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, int r1, java.lang.String r2) {
            r0.lambda$runRepairInstance$54(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$Q7i19VmcwM4hhxqATnoxBnDdJZU(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.lang.Throwable r1) {
            r0.lambda$exportWorldToUri$116(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$QQaa818BlcqAMTV-uXXWqmg-Wxo, reason: not valid java name */
    public static /* synthetic */ void m194$r8$lambda$QQaa818BlcqAMTVuXXWqmgWxo(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.io.File r1, android.net.Uri r2) {
            r0.lambda$savePickedInstanceIcon$72(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$QamS5USgVj3GZHYsfcD6lWWJzn0(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.UpdateResult r1) {
            r0.lambda$runLoaderUpdate$50(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$R9gZ-U2Jy3LopAgXssIK6Ly98lI, reason: not valid java name */
    public static /* synthetic */ void m195$r8$lambda$R9gZU2Jy3LopAgXssIK6Ly98lI(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.util.ArrayList r1, ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory r2) {
            r0.lambda$onActivityResult$111(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$RhzH7y-tQYqarqNBjQqgU3cLMjU, reason: not valid java name */
    public static /* synthetic */ void m196$r8$lambda$RhzH7ytQYqarqNBjQqgU3cLMjU(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.util.ArrayList r1, int r2) {
            r0.lambda$updateAllCandidates$106(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$S31dxFzXInh5liyAMEebfL1hL2g(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, android.content.DialogInterface r1) {
            r0.lambda$showUpdateProgressDialog$110(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$T2eqTEGSNSW1yrTooJhdq0jqRms(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, int r1, ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory r2) {
            r0.lambda$refreshContentList$81(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$TpwiIN-E4ZtAY62cmdutA_YFdFY, reason: not valid java name */
    public static /* synthetic */ void m197$r8$lambda$TpwiINE4ZtAY62cmdutA_YFdFY(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, ca.dnamobile.javalauncher.renderer.RendererInterface r1, android.content.DialogInterface r2, int r3) {
            r0.lambda$showRendererPluginStorageDialog$62(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$UFKO3cc9UIAMsMTfJsmieKRmtBk(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.lang.Throwable r1) {
            r0.lambda$runVersionUpdate$26(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$UiWzV7HINnkK2aM9UcjXrcBdb7U(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform r1, android.net.Uri r2, ca.dnamobile.javalauncher.modmanager.ModpackExportManager.ExportOptions r3) {
            r0.lambda$exportModpackToUri$17(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$UxX2QZxamYfLvKD70mmCFBtRSdQ(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.lang.String r1) {
            r0.lambda$runRepairInstance$58(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$VIoCJtpBU_Bct5aRYtEVM8-_hNE, reason: not valid java name */
    public static /* synthetic */ void m198$r8$lambda$VIoCJtpBU_Bct5aRYtEVM8_hNE(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.lang.Throwable r1) {
            r0.lambda$deleteInstance$74(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$Wt-FL_iWB9ZzxAIW6AwsBW71sEk, reason: not valid java name */
    public static /* synthetic */ void m199$r8$lambda$WtFL_iWB9ZzxAIW6AwsBW71sEk(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.lang.String r1, java.lang.Throwable r2) {
            r0.lambda$checkSingleContentUpdate$100(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$X5gP0nf3joHrQ4VzOkfPryGiX6Y(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.util.ArrayList r1, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo r2) {
            r0.lambda$showUpdateModpackDialog$28(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$XTSYvnsvTAw5y5CVcTA0zIcFccs(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.util.ArrayList r1, android.content.DialogInterface r2, int r3) {
            r0.lambda$updateAllAvailableForSelectedCategory$102(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$XYYl_XnvrdCm-2M-X4Aq5Mixi6s, reason: not valid java name */
    public static /* synthetic */ void m200$r8$lambda$XYYl_XnvrdCm2MX4Aq5Mixi6s(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, android.content.DialogInterface r1, int r2) {
            r0.lambda$showDeleteInstanceDialog$73(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$X_0PlXB9METAGft_UZRYwLGndE0(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.util.ArrayList r1) {
            r0.lambda$showUpdateVersionDialog$19(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$YcmTM6XrWbkyPvpCrLKwDtBLzKY(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.lang.Throwable r1) {
            r0.lambda$savePickedInstanceIcon$71(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$_3GQpP0yKbWiUqKBYhRkswJxTXg(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, android.app.AlertDialog[] r1, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo r2, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.ProjectMatch r3) {
            r0.lambda$showModpackProjectChooser$31(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$ahKeaGmhlOHVrNocsNQ9RVCDesY(ca.dnamobile.javalauncher.InstanceDetailsActivity r0) {
            r0.enableFullscreen()
            return
    }

    public static /* synthetic */ void $r8$lambda$bD1nheAJvmunhWODRkEpqYEBZCs(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, android.app.AlertDialog r1) {
            r0.lambda$showExportModpackPlatformDialog$13(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$bI_yFMILSYFUSP0Yx_T6n6T4vGc(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, android.view.View r1) {
            r0.lambda$onCreate$0(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$cow7TFC8ir4mp-3TO-8p9T1poiw, reason: not valid java name */
    public static /* synthetic */ void m201$r8$lambda$cow7TFC8ir4mp3TO8p9T1poiw(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.io.File r1, java.io.File r2, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r3, java.lang.String r4, ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory r5, boolean r6, java.lang.String r7) {
            r0.lambda$setContentItemEnabled$91(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static /* synthetic */ void $r8$lambda$ddqi4JtO8qBvjujt68pTguFCNJc(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.lang.Throwable r1) {
            r0.lambda$runModpackUpdate$42(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$dlmmdsqy_roLK_X3OiKi2naOWx0(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.lang.Throwable r1) {
            r0.lambda$showUpdateModpackDialog$29(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$e8KLjf43_10lwcsp-KaVxY6T6dU, reason: not valid java name */
    public static /* synthetic */ void m202$r8$lambda$e8KLjf43_10lwcspKaVxY6T6dU(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.lang.Throwable r1) {
            r0.lambda$updateAllCandidates$107(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$eBbqml8Pg2WnncJA45Nbwst1PL0(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, int[] r1, int r2, android.widget.TextView r3, java.util.ArrayList r4, java.util.ArrayList r5) {
            r0.lambda$showModpackVersionChooser$35(r1, r2, r3, r4, r5)
            return
    }

    public static /* synthetic */ void $r8$lambda$e_Mwranrh1MhSJkTp3u08S67HWI(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, android.widget.EditText r1, android.app.AlertDialog r2, android.view.View r3) {
            r0.lambda$showEditInstanceNameDialog$65(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$ft3y88uivWTbzRTZOD3TgR9h-Os, reason: not valid java name */
    public static /* synthetic */ void m203$r8$lambda$ft3y88uivWTbzRTZOD3TgR9hOs(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.lang.Runnable r1) {
            r0.lambda$requireMicrosoftLoginHistoryBeforeLaunch$3(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$gtgVI0WK9_jqs-OitpoqJtQtjl8, reason: not valid java name */
    public static /* synthetic */ void m204$r8$lambda$gtgVI0WK9_jqsOitpoqJtQtjl8(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.io.File r1) {
            r0.lambda$exportWorldToUri$115(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$hep2I3-MmYYFFp6tR3QvWcSoIIg, reason: not valid java name */
    public static /* synthetic */ void m205$r8$lambda$hep2I3MmYYFFp6tR3QvWcSoIIg(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, android.view.View r1) {
            r0.lambda$setupActions$5(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$hinME_FTwWVv9p9KIQJCn0I0wr8(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, android.content.DialogInterface r1, int r2) {
            r0.lambda$showRepairInstanceDialog$53(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$hktlq4Bw-pa17rmh7_4dqqHdSjc, reason: not valid java name */
    public static /* synthetic */ boolean m206$r8$lambda$hktlq4Bwpa17rmh7_4dqqHdSjc(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, android.view.View r1, android.view.MotionEvent r2) {
            boolean r0 = r0.lambda$setupContentTabs$10(r1, r2)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$iJIotzw5MMzyyUYv6jSl9YsHLZk(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, android.content.DialogInterface r1) {
            r0.lambda$showFullscreenSafeDialog$1(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$iSFjopKdz7XCFH0llVwnSSt9s1s(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.lang.String r1, java.lang.String r2) {
            r0.lambda$showContentLoadingSoon$84(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$iSYK3vJp0Sd9yLWh7o06zNDGXxk(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, android.view.View r1) {
            r0.lambda$setupActions$4(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$ieRSU1xX55_yUAeZm8Zq7Z-MaDc, reason: not valid java name */
    public static /* synthetic */ void m207$r8$lambda$ieRSU1xX55_yUAeZm8Zq7ZMaDc(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.util.ArrayList r1, java.util.ArrayList r2) {
            r0.lambda$updateAllCandidates$108(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$jUHcUp_6OCxSq0ln38XKpRCpqwU(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.util.ArrayList r1, android.content.DialogInterface r2, int r3) {
            r0.lambda$showMinecraftReleaseSelector$22(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$lLiUxCAwAnRl6QtmwCaYDAOGzew(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, android.view.View r1) {
            r0.showInstanceSettingsMenu(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$ldUwVainHpYRIDRHSXhMxYQhvTY(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, android.view.View r1) {
            r0.lambda$setupActions$8(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$m3lwMzWf7s4qSxbaVvoZIOWuAjw(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.lang.Throwable r1) {
            r0.lambda$loadModpackVersions$33(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$nMo4nLtGDt3MXn28YZHdRQdhdh4(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.lang.String r1) {
            r0.lambda$runRepairInstance$56(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$oEHz4vJw5tqZeM8nkraFDoL_MAU(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.lang.String r1, ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.UpdateCandidate r2, int r3) {
            r0.lambda$updateCandidate$103(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$pP8-h-fafbbWz9JUtuwDqYQEzZ0, reason: not valid java name */
    public static /* synthetic */ boolean m208$r8$lambda$pP8hfafbbWz9JUtuwDqYQEzZ0(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory r1, java.io.File r2) {
            boolean r0 = r0.lambda$refreshContentList$77(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$qEjM3C-lxbs6Hz7MaIf6aZSmnAo, reason: not valid java name */
    public static /* synthetic */ void m209$r8$lambda$qEjM3Clxbs6Hz7MaIf6aZSmnAo(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, android.app.AlertDialog r1) {
            r0.lambda$showExportModpackPlatformDialog$14(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$qeLy8iMg07XWp4yKsfanp-8y7JE, reason: not valid java name */
    public static /* synthetic */ void m210$r8$lambda$qeLy8iMg07XWp4yKsfanp8y7JE(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.lang.Throwable r1) {
            r0.lambda$renameInstance$68(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$rUe9cIjmkTyO2fqSNEJAsmQkIfc(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind r1, java.lang.String r2) {
            r0.lambda$showUpdateLoaderDialog$47(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$rx9gt1ssEdptt3-ngDkLUaQcrn0, reason: not valid java name */
    public static /* synthetic */ void m211$r8$lambda$rx9gt1ssEdptt3ngDkLUaQcrn0(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, int r1, ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory r2) {
            r0.lambda$importSelectedContent$112(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$s59cDJPTimLYtA3UYFLtc_TyqrI(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, ca.dnamobile.javalauncher.instance.LauncherInstance r1) {
            r0.lambda$savePickedInstanceIcon$70(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$sDFZasS_7zxghZOHqsnaGKW42bI(ca.dnamobile.javalauncher.InstanceDetailsActivity r0) {
            r0.lambda$requestMetadataSearchFilter$85()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$tOvnU3CdRh3vUk-h56qLG3ZROKQ, reason: not valid java name */
    public static /* synthetic */ void m212$r8$lambda$tOvnU3CdRh3vUkh56qLG3ZROKQ(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, android.app.AlertDialog r1, android.widget.EditText r2, android.content.DialogInterface r3) {
            r0.lambda$showEditInstanceNameDialog$66(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$taLq7PKjQHlGprSMahwjiMVRus8(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, android.widget.EditText r1, int[] r2, boolean[] r3, com.google.android.material.switchmaterial.SwitchMaterial r4, android.widget.SeekBar r5, int r6, int r7, int r8, android.widget.TextView r9, int r10, android.app.AlertDialog r11, android.view.View r12) {
            r0.lambda$showPerInstanceRamInputDialog$118(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$tfH7wx1QU9-DegklH_jIes8KBR4, reason: not valid java name */
    public static /* synthetic */ void m213$r8$lambda$tfH7wx1QU9DegklH_jIes8KBR4(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, android.app.AlertDialog r1) {
            r0.lambda$showFullscreenSafeDialog$2(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$vC2alBrXgXwnCr9zcH_z8rrXock(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, int r1, int r2) {
            r0.lambda$checkUpdatesForSelectedCategory$95(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$vTTa97Zt1swjLn8E_rQrapymSIo(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1, org.json.JSONObject r2, java.lang.String r3) {
            r0.lambda$checkSingleContentUpdate$101(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$vbftG4Nn9YQpHIRlwHrbpOhssF8(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.UpdateResult r1, ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.UpdateResult r2) {
            r0.lambda$runModpackUpdate$41(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$vndCVfE-vszB09H6bdIYXFD6yi8, reason: not valid java name */
    public static /* synthetic */ void m214$r8$lambda$vndCVfEvszB09H6bdIYXFD6yi8(ca.dnamobile.javalauncher.InstanceDetailsActivity r0) {
            r0.enableFullscreen()
            return
    }

    public static /* synthetic */ void $r8$lambda$w4HbfWCnS1VpSAbvfoAtH_aoYTk(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.ProjectMatch r1, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo r2) {
            r0.lambda$loadModpackVersions$34(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$wWjhRJ-7u_Iha8oSWJr7Rir2XRE, reason: not valid java name */
    public static /* synthetic */ void m215$r8$lambda$wWjhRJ7u_Iha8oSWJr7Rir2XRE(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.lang.String r1, android.content.DialogInterface r2, int r3) {
            r0.lambda$showRendererPluginStorageDialog$61(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$xPA_RTlrRGRcOqrvTteb2SXD-M4, reason: not valid java name */
    public static /* synthetic */ void m216$r8$lambda$xPA_RTlrRGRcOqrvTteb2SXDM4(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, boolean r1, java.lang.Throwable r2, java.lang.String r3, java.io.File r4, ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory r5, boolean r6, java.lang.String r7, java.io.File r8) {
            r0.lambda$setContentItemEnabled$90(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static /* synthetic */ void $r8$lambda$yPyM5xhl8L8ikslIdRqTxYsC3fo(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, int r1, int r2) {
            r0.lambda$exportWorldToUri$114(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$yeMF8sWmUW3iHDkhhujB8QElZPs(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.util.ArrayList r1, java.lang.String r2, android.content.DialogInterface r3, int r4) {
            r0.lambda$showLoaderVersionSelector$48(r1, r2, r3, r4)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$fgetbinding, reason: not valid java name */
    static /* bridge */ /* synthetic */ ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding m217$$Nest$fgetbinding(ca.dnamobile.javalauncher.InstanceDetailsActivity r0) {
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r0.binding
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgetcontentItems, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.util.ArrayList m218$$Nest$fgetcontentItems(ca.dnamobile.javalauncher.InstanceDetailsActivity r0) {
            java.util.ArrayList<ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem> r0 = r0.contentItems
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgeticonExecutor, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.util.concurrent.ExecutorService m219$$Nest$fgeticonExecutor(ca.dnamobile.javalauncher.InstanceDetailsActivity r0) {
            java.util.concurrent.ExecutorService r0 = r0.iconExecutor
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgetmainHandler, reason: not valid java name */
    static /* bridge */ /* synthetic */ android.os.Handler m220$$Nest$fgetmainHandler(ca.dnamobile.javalauncher.InstanceDetailsActivity r0) {
            android.os.Handler r0 = r0.mainHandler
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgetpendingAfterMicrosoftSignIn, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.Runnable m221$$Nest$fgetpendingAfterMicrosoftSignIn(ca.dnamobile.javalauncher.InstanceDetailsActivity r0) {
            java.lang.Runnable r0 = r0.pendingAfterMicrosoftSignIn
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fputcontentSearchQuery, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m222$$Nest$fputcontentSearchQuery(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.lang.String r1) {
            r0.contentSearchQuery = r1
            return
    }

    /* JADX INFO: renamed from: -$$Nest$fputpendingAfterMicrosoftSignIn, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m223$$Nest$fputpendingAfterMicrosoftSignIn(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.lang.Runnable r1) {
            r0.pendingAfterMicrosoftSignIn = r1
            return
    }

    /* JADX INFO: renamed from: -$$Nest$fputselectedCategory, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m224$$Nest$fputselectedCategory(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory r1) {
            r0.selectedCategory = r1
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mcheckSingleContentUpdateFromRow, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m225$$Nest$mcheckSingleContentUpdateFromRow(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r1) {
            r0.checkSingleContentUpdateFromRow(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mdismissUpdateProgressDialog, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m226$$Nest$mdismissUpdateProgressDialog(ca.dnamobile.javalauncher.InstanceDetailsActivity r0) {
            r0.dismissUpdateProgressDialog()
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mdp, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m227$$Nest$mdp(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, int r1) {
            int r0 = r0.dp(r1)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mformatSubtitle, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m228$$Nest$mformatSubtitle(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r1) {
            java.lang.String r0 = r0.formatSubtitle(r1)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mgetInstalledSourceForItem, reason: not valid java name */
    static /* bridge */ /* synthetic */ ca.dnamobile.javalauncher.modmanager.ModManagerSource m229$$Nest$mgetInstalledSourceForItem(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r1) {
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = r0.getInstalledSourceForItem(r1)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mgetUpdateMessageForItem, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m230$$Nest$mgetUpdateMessageForItem(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r1) {
            java.lang.String r0 = r0.getUpdateMessageForItem(r1)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mgetUpdateStateForItem, reason: not valid java name */
    static /* bridge */ /* synthetic */ ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState m231$$Nest$mgetUpdateStateForItem(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r1) {
            ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState r0 = r0.getUpdateStateForItem(r1)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$misContentItemEnabled, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m232$$Nest$misContentItemEnabled(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.io.File r1) {
            boolean r0 = r0.isContentItemEnabled(r1)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mlaunchInstance, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m233$$Nest$mlaunchInstance(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.lang.String r1) {
            r0.launchInstance(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mloadContentMetadataForItem, reason: not valid java name */
    static /* bridge */ /* synthetic */ ca.dnamobile.javalauncher.InstanceDetailsActivity.LoadedContentMetadata m234$$Nest$mloadContentMetadataForItem(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r1) {
            ca.dnamobile.javalauncher.InstanceDetailsActivity$LoadedContentMetadata r0 = r0.loadContentMetadataForItem(r1)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mprepareContentRowAction, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m235$$Nest$mprepareContentRowAction(ca.dnamobile.javalauncher.InstanceDetailsActivity r0) {
            r0.prepareContentRowAction()
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mreadableError, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m236$$Nest$mreadableError(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.lang.Throwable r1) {
            java.lang.String r0 = r0.readableError(r1)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mrefreshContentList, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m237$$Nest$mrefreshContentList(ca.dnamobile.javalauncher.InstanceDetailsActivity r0) {
            r0.refreshContentList()
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mrememberContentSearchMetadata, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m238$$Nest$mrememberContentSearchMetadata(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r1, java.lang.String r2) {
            r0.rememberContentSearchMetadata(r1, r2)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mrequestContentSearchFilter, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m239$$Nest$mrequestContentSearchFilter(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, boolean r1) {
            r0.requestContentSearchFilter(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mresolveContentItemForAction, reason: not valid java name */
    static /* bridge */ /* synthetic */ ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem m240$$Nest$mresolveContentItemForAction(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r1) {
            ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem r0 = r0.resolveContentItemForAction(r1)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$msafeCanonicalPath, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m241$$Nest$msafeCanonicalPath(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.io.File r1) {
            java.lang.String r0 = r0.safeCanonicalPath(r1)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$msetContentItemEnabledFromRow, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m242$$Nest$msetContentItemEnabledFromRow(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r1, boolean r2) {
            r0.setContentItemEnabledFromRow(r1, r2)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$msetUpdateProgress, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m243$$Nest$msetUpdateProgress(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, int r1, int r2) {
            r0.setUpdateProgress(r1, r2)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$msetUpdateProgressMessage, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m244$$Nest$msetUpdateProgressMessage(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, java.lang.String r1) {
            r0.setUpdateProgressMessage(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mshowDeleteContentItemDialogFromRow, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m245$$Nest$mshowDeleteContentItemDialogFromRow(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r1) {
            r0.showDeleteContentItemDialogFromRow(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mstartWorldExportFromRow, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m246$$Nest$mstartWorldExportFromRow(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r1) {
            r0.startWorldExportFromRow(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mstyleModpackListText, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m247$$Nest$mstyleModpackListText(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, android.view.View r1) {
            r0.styleModpackListText(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mupdateSingleContentItemFromRow, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m248$$Nest$mupdateSingleContentItemFromRow(ca.dnamobile.javalauncher.InstanceDetailsActivity r0, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r1) {
            r0.updateSingleContentItemFromRow(r1)
            return
    }

    static {
            r0 = 34
            r1 = 42
            r2 = 30
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.InstanceDetailsActivity.MODPACK_DIALOG_BG = r0
            r0 = 53
            r1 = 38
            r2 = 43
            int r0 = android.graphics.Color.rgb(r1, r2, r0)
            ca.dnamobile.javalauncher.InstanceDetailsActivity.MODPACK_CARD_BG = r0
            r0 = 49
            r1 = 60
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.InstanceDetailsActivity.MODPACK_CARD_BG_PRESSED = r0
            r0 = 61
            r1 = 74
            r2 = 54
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.InstanceDetailsActivity.MODPACK_CARD_STROKE = r0
            r0 = 241(0xf1, float:3.38E-43)
            r1 = 248(0xf8, float:3.48E-43)
            r2 = 238(0xee, float:3.34E-43)
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.InstanceDetailsActivity.MODPACK_TEXT_PRIMARY = r0
            r0 = 204(0xcc, float:2.86E-43)
            r1 = 216(0xd8, float:3.03E-43)
            r2 = 198(0xc6, float:2.77E-43)
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.InstanceDetailsActivity.MODPACK_TEXT_SECONDARY = r0
            r0 = 159(0x9f, float:2.23E-43)
            r1 = 176(0xb0, float:2.47E-43)
            r2 = 150(0x96, float:2.1E-43)
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.InstanceDetailsActivity.MODPACK_TEXT_MUTED = r0
            r0 = 211(0xd3, float:2.96E-43)
            r1 = 128(0x80, float:1.8E-43)
            r2 = 37
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.InstanceDetailsActivity.MODPACK_ACCENT = r0
            return
    }

    public InstanceDetailsActivity() {
            r2 = this;
            r2.<init>()
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r0 = ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory.MODS
            r2.selectedCategory = r0
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r0 = ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory.MODS
            r2.pendingImportCategory = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.allContentItems = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.contentItems = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r2.contentSearchMetadata = r0
            java.lang.String r0 = ""
            r2.contentSearchQuery = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.mainHandler = r0
            r0 = 2
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r0)
            r2.iconExecutor = r0
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor()
            r2.contentRefreshExecutor = r0
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor()
            r2.contentOperationExecutor = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r2.updateCandidates = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r2.updateStates = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r2.updateMessages = r0
            return
    }

    private void addDocumentsUiBrowseAttempt(java.util.ArrayList<android.content.Intent> r4, android.net.Uri r5, java.lang.String r6, java.lang.String r7) {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1)
            java.lang.String r1 = "android.intent.category.DEFAULT"
            r0.addCategory(r1)
            java.lang.String r1 = "vnd.android.document/directory"
            r0.setDataAndType(r5, r1)
            r1 = 1
            r0.addFlags(r1)
            r2 = 2
            r0.addFlags(r2)
            r2 = 128(0x80, float:1.8E-43)
            r0.addFlags(r2)
            java.lang.String r2 = "android.content.extra.SHOW_ADVANCED"
            r0.putExtra(r2, r1)
            java.lang.String r1 = "android.provider.extra.INITIAL_URI"
            r0.putExtra(r1, r5)
            android.content.ContentResolver r1 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "Instance Folder"
            android.content.ClipData r5 = android.content.ClipData.newUri(r1, r2, r5)     // Catch: java.lang.Throwable -> L35
            r0.setClipData(r5)     // Catch: java.lang.Throwable -> L35
        L35:
            boolean r5 = r3.isBlank(r6)
            if (r5 != 0) goto L4a
            boolean r5 = r3.isBlank(r7)
            if (r5 != 0) goto L4a
            android.content.ComponentName r5 = new android.content.ComponentName
            r5.<init>(r6, r7)
            r0.setComponent(r5)
            goto L53
        L4a:
            boolean r5 = r3.isBlank(r6)
            if (r5 != 0) goto L53
            r0.setPackage(r6)
        L53:
            r4.add(r0)
            return
    }

    private void addExportPlatformRow(android.widget.LinearLayout r9, java.lang.String r10, java.lang.String r11, java.lang.Runnable r12) {
            r8 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r8)
            r1 = 1
            r0.setOrientation(r1)
            r2 = 16
            r0.setGravity(r2)
            r3 = 62
            int r3 = r8.dp(r3)
            r0.setMinimumHeight(r3)
            int r3 = r8.dp(r2)
            r4 = 8
            int r5 = r8.dp(r4)
            int r6 = r8.dp(r2)
            int r7 = r8.dp(r4)
            r0.setPadding(r3, r5, r6, r7)
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>()
            r5 = 16842801(0x1010031, float:2.3693695E-38)
            r6 = 0
            int r5 = r8.resolveThemeColor(r5, r6)
            r3.setColor(r5)
            int r5 = r8.dp(r1)
            r6 = 16842906(0x101009a, float:2.369399E-38)
            r7 = -12303292(0xffffffffff444444, float:-2.6088314E38)
            int r6 = r8.resolveThemeColor(r6, r7)
            r3.setStroke(r5, r6)
            int r2 = r8.dp(r2)
            float r2 = (float) r2
            r3.setCornerRadius(r2)
            r0.setBackground(r3)
            r0.setClickable(r1)
            r0.setFocusable(r1)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda106 r2 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda106
            r2.<init>(r12)
            r0.setOnClickListener(r2)
            android.widget.TextView r12 = new android.widget.TextView
            r12.<init>(r8)
            r12.setText(r10)
            r10 = 1098907648(0x41800000, float:16.0)
            r2 = 2
            r12.setTextSize(r2, r10)
            r10 = 16842806(0x1010036, float:2.369371E-38)
            r3 = -1
            int r10 = r8.resolveThemeColor(r10, r3)
            r12.setTextColor(r10)
            android.graphics.Typeface r10 = r12.getTypeface()
            r12.setTypeface(r10, r1)
            r12.setSingleLine(r1)
            android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.END
            r12.setEllipsize(r10)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r5 = -2
            r10.<init>(r3, r5)
            r0.addView(r12, r10)
            android.widget.TextView r10 = new android.widget.TextView
            r10.<init>(r8)
            r10.setText(r11)
            r11 = 1094713344(0x41400000, float:12.0)
            r10.setTextSize(r2, r11)
            r11 = 16842808(0x1010038, float:2.3693715E-38)
            r12 = -3355444(0xffffffffffcccccc, float:NaN)
            int r11 = r8.resolveThemeColor(r11, r12)
            r10.setTextColor(r11)
            r10.setSingleLine(r1)
            android.text.TextUtils$TruncateAt r11 = android.text.TextUtils.TruncateAt.END
            r10.setEllipsize(r11)
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            r11.<init>(r3, r5)
            int r12 = r8.dp(r2)
            r11.topMargin = r12
            r0.addView(r10, r11)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r10.<init>(r3, r5)
            int r11 = r8.dp(r4)
            r10.topMargin = r11
            r9.addView(r0, r10)
            return
    }

    private void addInstanceSettingsMenuRow(android.widget.LinearLayout r1, int r2, android.widget.PopupWindow r3, int r4) {
            r0 = this;
            java.lang.String r2 = r0.getString(r2)
            r0.addInstanceSettingsMenuRow(r1, r2, r3, r4)
            return
    }

    private void addInstanceSettingsMenuRow(android.widget.LinearLayout r5, java.lang.String r6, android.widget.PopupWindow r7, int r8) {
            r4 = this;
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r4)
            r0.setText(r6)
            r6 = 16
            r0.setGravity(r6)
            r6 = 48
            int r1 = r4.dp(r6)
            r0.setMinHeight(r1)
            r1 = 2
            r2 = 1097859072(0x41700000, float:15.0)
            r0.setTextSize(r1, r2)
            r1 = 16842806(0x1010036, float:2.369371E-38)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r1 = r4.resolveThemeColor(r1, r2)
            r0.setTextColor(r1)
            r1 = 20
            int r2 = r4.dp(r1)
            r3 = 0
            int r1 = r4.dp(r1)
            r0.setPadding(r2, r3, r1, r3)
            int r1 = r4.resolveSelectableItemBackground()
            if (r1 == 0) goto L3f
            r0.setBackgroundResource(r1)
        L3f:
            r1 = 1
            r0.setSingleLine(r1)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda67 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda67
            r1.<init>(r4, r7, r8)
            r0.setOnClickListener(r1)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r8 = -1
            int r6 = r4.dp(r6)
            r7.<init>(r8, r6)
            r5.addView(r0, r7)
            return
    }

    private void addModpackActionCard(android.widget.LinearLayout r7, java.lang.String r8, java.lang.String r9, java.lang.Runnable r10) {
            r6 = this;
            android.widget.LinearLayout r1 = r6.addModpackDialogCard(r7)
            r7 = 1
            r1.setClickable(r7)
            r1.setFocusable(r7)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda91 r7 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda91
            r7.<init>(r10)
            r1.setOnClickListener(r7)
            r6.addModpackCardTitle(r1, r8)
            int r3 = ca.dnamobile.javalauncher.InstanceDetailsActivity.MODPACK_TEXT_SECONDARY
            r4 = 13
            r5 = 0
            r0 = r6
            r2 = r9
            r0.addModpackCardText(r1, r2, r3, r4, r5)
            return
    }

    private void addModpackCardText(android.widget.LinearLayout r2, java.lang.String r3, int r4, int r5, boolean r6) {
            r1 = this;
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r1)
            r0.setText(r3)
            r3 = 2
            float r5 = (float) r5
            r0.setTextSize(r3, r5)
            r0.setTextColor(r4)
            if (r6 == 0) goto L1a
            android.graphics.Typeface r3 = r0.getTypeface()
            r4 = 1
            r0.setTypeface(r3, r4)
        L1a:
            r3 = 4
            int r3 = r1.dp(r3)
            r4 = 0
            r0.setPadding(r4, r4, r4, r3)
            r0.setSingleLine(r4)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = -1
            r5 = -2
            r3.<init>(r4, r5)
            r2.addView(r0, r3)
            return
    }

    private void addModpackCardTitle(android.widget.LinearLayout r4, java.lang.String r5) {
            r3 = this;
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r3)
            r0.setText(r5)
            r5 = 2
            r1 = 1099956224(0x41900000, float:18.0)
            r0.setTextSize(r5, r1)
            android.graphics.Typeface r5 = r0.getTypeface()
            r1 = 1
            r0.setTypeface(r5, r1)
            int r5 = ca.dnamobile.javalauncher.InstanceDetailsActivity.MODPACK_TEXT_PRIMARY
            r0.setTextColor(r5)
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

    private android.widget.LinearLayout addModpackDialogCard(android.widget.LinearLayout r5) {
            r4 = this;
            android.widget.LinearLayout r0 = r4.createModpackDialogCard()
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = -1
            r3 = -2
            r1.<init>(r2, r3)
            r2 = 12
            int r2 = r4.dp(r2)
            r3 = 0
            r1.setMargins(r3, r3, r3, r2)
            r5.addView(r0, r1)
            return r0
    }

    private android.view.View addModpackVersionRow(android.widget.LinearLayout r7, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo r8, boolean r9, java.lang.Runnable r10) {
            r6 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r6)
            r1 = 1
            r0.setOrientation(r1)
            r2 = 16
            r0.setGravity(r2)
            r2 = 76
            int r2 = r6.dp(r2)
            r0.setMinimumHeight(r2)
            r2 = 14
            int r3 = r6.dp(r2)
            r4 = 10
            int r5 = r6.dp(r4)
            int r2 = r6.dp(r2)
            int r4 = r6.dp(r4)
            r0.setPadding(r3, r5, r2, r4)
            r0.setClickable(r1)
            r0.setFocusable(r1)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda68 r2 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda68
            r2.<init>(r10)
            r0.setOnClickListener(r2)
            android.widget.TextView r10 = new android.widget.TextView
            r10.<init>(r6)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            if (r9 == 0) goto L4b
            java.lang.String r9 = "Latest available: "
            goto L4d
        L4b:
            java.lang.String r9 = ""
        L4d:
            java.lang.StringBuilder r9 = r2.append(r9)
            java.lang.String r2 = r8.versionLabel
            java.lang.StringBuilder r9 = r9.append(r2)
            java.lang.String r9 = r9.toString()
            r10.setText(r9)
            r9 = 1097859072(0x41700000, float:15.0)
            r2 = 2
            r10.setTextSize(r2, r9)
            android.graphics.Typeface r9 = r10.getTypeface()
            r10.setTypeface(r9, r1)
            int r9 = ca.dnamobile.javalauncher.InstanceDetailsActivity.MODPACK_TEXT_PRIMARY
            r10.setTextColor(r9)
            r9 = 0
            r10.setSingleLine(r9)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r3 = -1
            r4 = -2
            r1.<init>(r3, r4)
            r0.addView(r10, r1)
            android.widget.TextView r10 = new android.widget.TextView
            r10.<init>(r6)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "Minecraft "
            r1.<init>(r5)
            java.lang.String r5 = r8.getMinecraftVersionsLabel()
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r5 = " • "
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r5 = r8.getLoadersLabel()
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r1 = r1.toString()
            r10.setText(r1)
            r1 = 1094713344(0x41400000, float:12.0)
            r10.setTextSize(r2, r1)
            int r1 = ca.dnamobile.javalauncher.InstanceDetailsActivity.MODPACK_TEXT_SECONDARY
            r10.setTextColor(r1)
            r10.setSingleLine(r9)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r3, r4)
            int r5 = r6.dp(r2)
            r1.topMargin = r5
            r0.addView(r10, r1)
            java.lang.String r10 = r8.datePublished
            boolean r10 = r6.isBlank(r10)
            if (r10 != 0) goto Lef
            android.widget.TextView r10 = new android.widget.TextView
            r10.<init>(r6)
            java.lang.String r8 = r8.datePublished
            r10.setText(r8)
            r8 = 1093664768(0x41300000, float:11.0)
            r10.setTextSize(r2, r8)
            int r8 = ca.dnamobile.javalauncher.InstanceDetailsActivity.MODPACK_TEXT_MUTED
            r10.setTextColor(r8)
            r10.setSingleLine(r9)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r8.<init>(r3, r4)
            int r1 = r6.dp(r2)
            r8.topMargin = r1
            r0.addView(r10, r8)
        Lef:
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r8.<init>(r3, r4)
            r10 = 8
            int r10 = r6.dp(r10)
            r8.setMargins(r9, r9, r9, r10)
            r7.addView(r0, r8)
            return r0
    }

    private void addPerInstanceSettingsAlias(java.util.ArrayList<java.lang.String> r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = r1.isBlank(r3)
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.String r3 = ca.dnamobile.javalauncher.launcher.InstanceLaunchSettings.resolveInstanceKey(r3, r3)
            boolean r0 = r2.contains(r3)
            if (r0 != 0) goto L14
            r2.add(r3)
        L14:
            return
    }

    private java.lang.String appendDocumentIdPath(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            if (r6 != 0) goto L5
            java.lang.String r6 = ""
            goto L11
        L5:
            r0 = 92
            r1 = 47
            java.lang.String r6 = r6.replace(r0, r1)
            java.lang.String r6 = r6.trim()
        L11:
            java.lang.String r0 = "/"
            boolean r1 = r6.startsWith(r0)
            r2 = 1
            if (r1 == 0) goto L1f
            java.lang.String r6 = r6.substring(r2)
            goto L11
        L1f:
            boolean r1 = r6.endsWith(r0)
            if (r1 == 0) goto L30
            int r1 = r6.length()
            int r1 = r1 - r2
            r3 = 0
            java.lang.String r6 = r6.substring(r3, r1)
            goto L1f
        L30:
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L37
            return r5
        L37:
            java.lang.String r1 = ":"
            boolean r1 = r5.endsWith(r1)
            if (r1 != 0) goto L5c
            boolean r1 = r5.endsWith(r0)
            if (r1 == 0) goto L46
            goto L5c
        L46:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            return r5
        L5c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            return r5
    }

    private void applyContentSearchFilter(boolean r5) {
            r4 = this;
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r4.binding
            if (r0 != 0) goto L5
            return
        L5:
            if (r5 == 0) goto L1c
            androidx.recyclerview.widget.RecyclerView r0 = r0.recyclerResourceItems
            if (r0 == 0) goto L1c
            boolean r1 = r0.isComputingLayout()
            if (r1 != 0) goto L17
            int r0 = r0.getScrollState()
            if (r0 == 0) goto L1c
        L17:
            r5 = 1
            r4.requestContentSearchFilter(r5)
            return
        L1c:
            java.lang.String r0 = r4.contentSearchQuery
            if (r0 != 0) goto L23
            java.lang.String r0 = ""
            goto L27
        L23:
            java.lang.String r0 = r0.trim()
        L27:
            java.util.ArrayList<ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem> r1 = r4.contentItems
            r1.clear()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L3a
            java.util.ArrayList<ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem> r0 = r4.contentItems
            java.util.ArrayList<ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem> r1 = r4.allContentItems
            r0.addAll(r1)
            goto L58
        L3a:
            java.util.ArrayList<ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem> r1 = r4.allContentItems
            java.util.Iterator r1 = r1.iterator()
        L40:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L58
            java.lang.Object r2 = r1.next()
            ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem r2 = (ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem) r2
            boolean r3 = r4.matchesContentSearch(r2, r0)
            if (r3 == 0) goto L40
            java.util.ArrayList<ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem> r3 = r4.contentItems
            r3.add(r2)
            goto L40
        L58:
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r0 = r4.selectedCategory
            java.io.File r0 = r4.getDirectoryForCategory(r0)
            r4.updateContentHint(r0)
            r4.updateContentUpdateButtons()
            if (r5 == 0) goto L6d
            ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter r5 = r4.contentAdapter
            if (r5 == 0) goto L6d
            r5.notifyDataSetChanged()
        L6d:
            return
    }

    private void applyFullscreenToWindow(android.view.Window r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            android.view.View r0 = r3.getDecorView()
            int r1 = r2.getImmersiveSystemUiFlags()
            r0.setSystemUiVisibility(r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L2e
            r0 = 0
            r3.setDecorFitsSystemWindows(r0)
            android.view.WindowInsetsController r3 = r3.getInsetsController()
            if (r3 == 0) goto L2e
            int r0 = android.view.WindowInsets.Type.statusBars()
            int r1 = android.view.WindowInsets.Type.navigationBars()
            r0 = r0 | r1
            r3.hide(r0)
            r0 = 2
            r3.setSystemBarsBehavior(r0)
        L2e:
            return
    }

    private void applyModpackUpdateResult(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.UpdateResult r4, ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.UpdateResult r5) {
            r3 = this;
            if (r5 == 0) goto L18
            java.lang.String r0 = r5.loader
            r3.loader = r0
            java.lang.String r0 = r5.baseVersionId
            r3.baseVersionId = r0
            java.lang.String r0 = r5.minecraftVersionId
            r3.minecraftVersionId = r0
            java.lang.String r0 = r5.versionType
            r3.versionType = r0
            r3.updateIntentExtras()
            r3.bindHeader()
        L18:
            r3.dismissUpdateProgressDialog()
            r0 = 0
            r3.setVersionUpdateInProgress(r0)
            r3.refreshContentList()
            r0 = -1
            r3.setResult(r0)
            java.lang.String r0 = ""
            if (r5 != 0) goto L2b
            goto L66
        L2b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = " · Minecraft "
            r1.<init>(r2)
            java.lang.String r2 = r5.minecraftVersionId
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r5.loaderVersion
            boolean r2 = r3.isBlank(r2)
            if (r2 == 0) goto L41
            goto L5e
        L41:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = " · "
            r0.<init>(r2)
            java.lang.String r2 = r5.loader
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r2 = " "
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r5 = r5.loaderVersion
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r0 = r5.toString()
        L5e:
            java.lang.StringBuilder r5 = r1.append(r0)
            java.lang.String r0 = r5.toString()
        L66:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "Modpack updated to "
            r5.<init>(r1)
            java.lang.String r1 = r4.versionLabel
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.StringBuilder r5 = r5.append(r0)
            int r4 = r4.removedOldFiles
            java.lang.String r4 = r3.formatModpackUpdateRemovedSuffix(r4)
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r4 = r4.toString()
            r5 = 1
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r5)
            r4.show()
            return
    }

    private void applyUpdatedInstance(ca.dnamobile.javalauncher.instance.LauncherInstance r2) {
            r1 = this;
            java.lang.String r0 = r2.getId()
            r1.instanceId = r0
            java.lang.String r0 = r2.getName()
            r1.instanceName = r0
            java.lang.String r0 = r2.getLoader()
            r1.loader = r0
            java.lang.String r0 = r2.getBaseVersionId()
            r1.baseVersionId = r0
            java.lang.String r0 = r2.getMinecraftVersionId()
            r1.minecraftVersionId = r0
            java.lang.String r0 = r2.getVersionType()
            r1.versionType = r0
            java.io.File r0 = r2.getRootDirectory()
            r1.rootDirectory = r0
            java.io.File r0 = r2.getGameDirectory()
            r1.gameDirectory = r0
            java.io.File r0 = r2.getIconFile()
            r1.iconFile = r0
            boolean r2 = r2.isIsolated()
            r1.isolated = r2
            r1.resetContentDirectories()
            r1.updateIntentExtras()
            r1.bindHeader()
            r1.refreshContentList()
            return
    }

    private void applyVersionUpdateResult(ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.UpdateResult r3, java.lang.String r4) {
            r2 = this;
            java.lang.String r0 = r3.loader
            r2.loader = r0
            java.lang.String r0 = r3.baseVersionId
            r2.baseVersionId = r0
            java.lang.String r0 = r3.minecraftVersionId
            r2.minecraftVersionId = r0
            java.lang.String r0 = r3.versionType
            r2.versionType = r0
            r2.updateIntentExtras()
            r2.bindHeader()
            r2.refreshContentList()
            r2.dismissUpdateProgressDialog()
            r0 = 0
            r2.setVersionUpdateInProgress(r0)
            r0 = -1
            r2.setResult(r0)
            java.lang.String r0 = r3.loaderVersion
            if (r0 != 0) goto L2b
            java.lang.String r0 = ""
            goto L48
        L2b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = " · "
            r0.<init>(r1)
            java.lang.String r1 = r3.loader
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r3.loaderVersion
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
        L48:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = ": Minecraft "
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r3 = r3.minecraftVersionId
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r4 = 1
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r4)
            r3.show()
            return
    }

    private void beginModpackExport(ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform r4, ca.dnamobile.javalauncher.modmanager.ModpackExportManager.ExportOptions r5) {
            r3 = this;
            r3.pendingExportPlatform = r4
            r3.pendingExportOptions = r5
            ca.dnamobile.javalauncher.modmanager.ModpackExportManager$Platform r5 = ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform.MODRINTH
            if (r4 != r5) goto Lb
            java.lang.String r5 = ".mrpack"
            goto Ld
        Lb:
            java.lang.String r5 = ".zip"
        Ld:
            ca.dnamobile.javalauncher.modmanager.ModpackExportManager$Platform r0 = ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform.MODRINTH
            if (r4 != r0) goto L14
            java.lang.String r4 = "application/x-modrinth-modpack+zip"
            goto L16
        L14:
            java.lang.String r4 = "application/zip"
        L16:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.CREATE_DOCUMENT"
            r0.<init>(r1)
            java.lang.String r1 = "android.intent.category.OPENABLE"
            r0.addCategory(r1)
            r0.setType(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = r3.instanceName
            r2 = 0
            java.lang.String r1 = r3.sanitizeImportedFileName(r1, r2)
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "android.intent.extra.TITLE"
            r0.putExtra(r5, r4)
            r4 = 9126(0x23a6, float:1.2788E-41)
            r3.startActivityForResult(r0, r4)     // Catch: android.content.ActivityNotFoundException -> L48
            goto L56
        L48:
            r3.pendingExportPlatform = r2
            r3.pendingExportOptions = r2
            java.lang.String r4 = "No file picker is available for exporting."
            r5 = 1
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r5)
            r4.show()
        L56:
            return
    }

    private void bindHeader() {
            r5 = this;
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r5.binding
            android.widget.TextView r0 = r0.textInstanceName
            java.lang.String r1 = r5.instanceName
            r0.setText(r1)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r5.binding
            android.widget.TextView r0 = r0.textInstanceMeta
            int r1 = ca.dnamobile.javalauncher.R.string.instance_details_meta_value
            java.lang.String r2 = r5.loader
            java.lang.String r2 = r5.displayLoader(r2)
            java.lang.String r3 = r5.minecraftVersionId
            java.lang.String r4 = r5.versionType
            java.lang.String r4 = r5.displayVersionType(r4)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4}
            java.lang.String r1 = r5.getString(r1, r2)
            r0.setText(r1)
            r5.bindInstanceIcon()
            return
    }

    private void bindImportButtonForCategory(ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory r3) {
            r2 = this;
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r2.binding
            if (r0 == 0) goto L38
            com.google.android.material.button.MaterialButton r0 = r0.buttonAddMods
            if (r0 != 0) goto L9
            goto L38
        L9:
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r2.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonAddMods
            int r1 = r3.uploadButtonTextRes
            r0.setText(r1)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r0 = ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory.WORLDS
            if (r3 != r0) goto L29
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r3 = r2.binding
            com.google.android.material.button.MaterialButton r3 = r3.buttonAddMods
            int r0 = ca.dnamobile.javalauncher.R.drawable.ic_arrow_downward_24
            r3.setIconResource(r0)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r3 = r2.binding
            com.google.android.material.button.MaterialButton r3 = r3.buttonAddMods
            java.lang.String r0 = "Import World"
            r3.setContentDescription(r0)
            goto L38
        L29:
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r3 = r2.binding
            com.google.android.material.button.MaterialButton r3 = r3.buttonAddMods
            r0 = 0
            r3.setIcon(r0)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r3 = r2.binding
            com.google.android.material.button.MaterialButton r3 = r3.buttonAddMods
            r3.setContentDescription(r0)
        L38:
            return
    }

    private void bindInstanceIcon() {
            r5 = this;
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r5.binding
            if (r0 == 0) goto L5f
            android.widget.ImageView r0 = r0.imageInstanceIcon
            if (r0 != 0) goto L9
            goto L5f
        L9:
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r5.binding
            android.widget.ImageView r0 = r0.imageInstanceIcon
            r1 = 0
            r0.setImageDrawable(r1)
            java.io.File r0 = r5.iconFile
            if (r0 == 0) goto L4c
            boolean r0 = r0.isFile()
            if (r0 == 0) goto L4c
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r5.binding     // Catch: java.lang.Throwable -> L33
            android.widget.ImageView r0 = r0.imageInstanceIcon     // Catch: java.lang.Throwable -> L33
            java.io.File r1 = r5.iconFile     // Catch: java.lang.Throwable -> L33
            android.net.Uri r1 = android.net.Uri.fromFile(r1)     // Catch: java.lang.Throwable -> L33
            r0.setImageURI(r1)     // Catch: java.lang.Throwable -> L33
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r5.binding     // Catch: java.lang.Throwable -> L33
            android.widget.ImageView r0 = r0.imageInstanceIcon     // Catch: java.lang.Throwable -> L33
            android.graphics.drawable.Drawable r0 = r0.getDrawable()     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L4c
            return
        L33:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to load custom instance icon: "
            r1.<init>(r2)
            java.lang.String r0 = r5.readableError(r0)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "InstanceDetails"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r0)
        L4c:
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r5.binding
            android.widget.ImageView r0 = r0.imageInstanceIcon
            java.lang.String r1 = r5.loader
            java.lang.String r2 = r5.baseVersionId
            java.lang.String r3 = r5.minecraftVersionId
            java.lang.String r4 = r5.instanceName
            int r1 = ca.dnamobile.javalauncher.ui.instance.InstanceIconResolver.getDefaultIcon(r1, r2, r3, r4)
            r0.setImageResource(r1)
        L5f:
            return
    }

    private void browseSelectedContent() {
            r5 = this;
            boolean r0 = r5.canBrowseSelectedCategory()
            r1 = 1
            if (r0 != 0) goto L1d
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r0 = r5.selectedCategory
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r2 = ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory.MODS
            if (r0 != r2) goto L1c
            boolean r0 = r5.supportsMods()
            if (r0 != 0) goto L1c
            int r0 = ca.dnamobile.javalauncher.R.string.mods_vanilla_hint
            android.widget.Toast r0 = android.widget.Toast.makeText(r5, r0, r1)
            r0.show()
        L1c:
            return
        L1d:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<ca.dnamobile.javalauncher.ContentBrowserActivity> r2 = ca.dnamobile.javalauncher.ContentBrowserActivity.class
            r0.<init>(r5, r2)
            java.lang.String r2 = "ca.dnamobile.javalauncher.extra.INSTANCE_ID"
            java.lang.String r3 = r5.instanceId
            r0.putExtra(r2, r3)
            java.lang.String r2 = "ca.dnamobile.javalauncher.extra.INSTANCE_NAME"
            java.lang.String r3 = r5.instanceName
            r0.putExtra(r2, r3)
            java.lang.String r2 = "ca.dnamobile.javalauncher.extra.INSTANCE_LOADER"
            java.lang.String r3 = r5.loader
            r0.putExtra(r2, r3)
            java.lang.String r2 = "ca.dnamobile.javalauncher.extra.BASE_VERSION_ID"
            java.lang.String r3 = r5.baseVersionId
            r0.putExtra(r2, r3)
            java.lang.String r2 = "ca.dnamobile.javalauncher.extra.MINECRAFT_VERSION_ID"
            java.lang.String r3 = r5.minecraftVersionId
            r0.putExtra(r2, r3)
            java.lang.String r2 = "ca.dnamobile.javalauncher.extra.VERSION_TYPE"
            java.lang.String r3 = r5.versionType
            r0.putExtra(r2, r3)
            java.io.File r2 = r5.rootDirectory
            java.lang.String r3 = ""
            if (r2 == 0) goto L59
            java.lang.String r2 = r2.getAbsolutePath()
            goto L5a
        L59:
            r2 = r3
        L5a:
            java.lang.String r4 = "ca.dnamobile.javalauncher.extra.ROOT_DIRECTORY"
            r0.putExtra(r4, r2)
            java.io.File r2 = r5.gameDirectory
            if (r2 == 0) goto L68
            java.lang.String r2 = r2.getAbsolutePath()
            goto L69
        L68:
            r2 = r3
        L69:
            java.lang.String r4 = "ca.dnamobile.javalauncher.extra.GAME_DIRECTORY"
            r0.putExtra(r4, r2)
            java.io.File r2 = r5.iconFile
            if (r2 == 0) goto L76
            java.lang.String r3 = r2.getAbsolutePath()
        L76:
            java.lang.String r2 = "ca.dnamobile.javalauncher.extra.ICON_FILE"
            r0.putExtra(r2, r3)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r2 = r5.selectedCategory
            java.lang.String r2 = r2.name()
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r3)
            java.lang.String r3 = "ca.dnamobile.javalauncher.extra.CONTENT_CATEGORY"
            r0.putExtra(r3, r2)
            r5.startActivity(r0)     // Catch: android.content.ActivityNotFoundException -> L90
            goto La9
        L90:
            int r0 = ca.dnamobile.javalauncher.R.string.instance_content_browser_not_ready
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r2 = r5.selectedCategory
            int r2 = r2.tabTitleRes
            java.lang.String r2 = r5.getString(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r0 = r5.getString(r0, r2)
            android.widget.Toast r0 = android.widget.Toast.makeText(r5, r0, r1)
            r0.show()
        La9:
            return
    }

    private org.json.JSONObject buildFallbackUpdatedEntry(ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateCleanupPlan r11, java.io.File r12) {
            r10 = this;
            java.lang.String r0 = "downloadUrl"
            java.lang.String r1 = "fileId"
            java.lang.String r2 = "versionId"
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = "source"
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r5 = r11.source     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r5 = r5.getId()     // Catch: java.lang.Throwable -> Lbe
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r4 = "platform"
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r5 = r11.source     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r5 = r5.getId()     // Catch: java.lang.Throwable -> Lbe
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r4 = "modpackPlatform"
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r5 = r11.source     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r5 = r5.getId()     // Catch: java.lang.Throwable -> Lbe
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r4 = "contentType"
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r5 = r11.contentType     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r5 = r5.getIntentValue()     // Catch: java.lang.Throwable -> Lbe
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r4 = "type"
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r5 = r11.contentType     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r5 = r5.getIntentValue()     // Catch: java.lang.Throwable -> Lbe
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r4 = "platformProjectId"
            java.lang.String r5 = r11.projectId     // Catch: java.lang.Throwable -> Lbe
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r4 = "projectId"
            java.lang.String r5 = r11.projectId     // Catch: java.lang.Throwable -> Lbe
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r4 = "versionNumber"
            ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager$UpdateCandidate r5 = r11.candidate     // Catch: java.lang.Throwable -> Lbe
            ca.dnamobile.javalauncher.modmanager.ModrinthVersion r5 = r5.latestVersion     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r5 = r5.versionNumber     // Catch: java.lang.Throwable -> Lbe
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> Lbe
            ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager$UpdateCandidate r4 = r11.candidate     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r4 = r10.resolveLatestFileName(r4)     // Catch: java.lang.Throwable -> Lbe
            boolean r5 = r10.isBlank(r4)     // Catch: java.lang.Throwable -> Lbe
            if (r5 != 0) goto L6c
            java.lang.String r5 = "remoteFileName"
            r3.put(r5, r4)     // Catch: java.lang.Throwable -> Lbe
        L6c:
            ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager$UpdateCandidate r4 = r11.candidate     // Catch: java.lang.Throwable -> Lbe
            r5 = 2
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> Lbe
            r7 = 0
            r6[r7] = r2     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r8 = "id"
            r9 = 1
            r6[r9] = r8     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r4 = r10.readLatestVersionString(r4, r6)     // Catch: java.lang.Throwable -> Lbe
            boolean r6 = r10.isBlank(r4)     // Catch: java.lang.Throwable -> Lbe
            if (r6 != 0) goto L86
            r3.put(r2, r4)     // Catch: java.lang.Throwable -> Lbe
        L86:
            ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager$UpdateCandidate r2 = r11.candidate     // Catch: java.lang.Throwable -> Lbe
            r4 = 4
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> Lbe
            r4[r7] = r1     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r6 = "fileID"
            r4[r9] = r6     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r6 = "curseForgeFileId"
            r4[r5] = r6     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r6 = "curseforgeFileId"
            r8 = 3
            r4[r8] = r6     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r2 = r10.readLatestVersionString(r2, r4)     // Catch: java.lang.Throwable -> Lbe
            boolean r4 = r10.isBlank(r2)     // Catch: java.lang.Throwable -> Lbe
            if (r4 != 0) goto La7
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> Lbe
        La7:
            ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager$UpdateCandidate r1 = r11.candidate     // Catch: java.lang.Throwable -> Lbe
            java.lang.String[] r2 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> Lbe
            r2[r7] = r0     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r4 = "url"
            r2[r9] = r4     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r1 = r10.readLatestVersionString(r1, r2)     // Catch: java.lang.Throwable -> Lbe
            boolean r2 = r10.isBlank(r1)     // Catch: java.lang.Throwable -> Lbe
            if (r2 != 0) goto Lbe
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> Lbe
        Lbe:
            r10.normalizeUpdatedManifestEntry(r11, r3, r12)
            return r3
    }

    private android.net.Uri buildInitialUriForLocationRoot(android.net.Uri r6, java.lang.String r7, java.io.File r8) throws java.io.IOException {
            r5 = this;
            boolean r0 = r5.isBlank(r7)
            r1 = 0
            java.lang.String r2 = "InstanceDetails"
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "[OpenFolder] local root path is blank for treeUri="
            r7.<init>(r8)
            java.lang.StringBuilder r6 = r7.append(r6)
            java.lang.String r6 = r6.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r6)
            return r1
        L1c:
            java.io.File r0 = new java.io.File
            java.lang.String r7 = r7.trim()
            r0.<init>(r7)
            java.io.File r7 = r0.getCanonicalFile()
            boolean r0 = r5.isSameOrChild(r7, r8)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "[OpenFolder] checking localRoot="
            r3.<init>(r4)
            java.lang.String r4 = r7.getAbsolutePath()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " containsTarget="
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r4 = " target="
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = r8.getAbsolutePath()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " treeUri="
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r3 = r3.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r3)
            if (r0 != 0) goto L68
            return r1
        L68:
            java.lang.String r7 = r5.getRelativePathBetweenFiles(r7, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "[OpenFolder] relative path for selected tree="
            r8.<init>(r0)
            java.lang.StringBuilder r8 = r8.append(r7)
            java.lang.String r8 = r8.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r8)
            android.net.Uri r8 = ca.dnamobile.javalauncher.storage.SafMinecraftMirror.findRelativePathInTree(r5, r6, r7)
            if (r8 == 0) goto L97
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "[OpenFolder] SAF tree walk resolved URI="
            r6.<init>(r7)
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r6 = r6.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r6)
            return r8
        L97:
            android.net.Uri r6 = r5.buildTreeDocumentUriByAppendingPath(r6, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "[OpenFolder] SAF path append fallback URI="
            r7.<init>(r8)
            java.lang.StringBuilder r7 = r7.append(r6)
            java.lang.String r7 = r7.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r7)
            return r6
    }

    private android.net.Uri buildInitialUriForStorageLocation(ca.dnamobile.javalauncher.storage.StorageLocation r8, java.io.File r9, java.lang.String r10) {
            r7 = this;
            java.lang.String r0 = "[OpenFolder] trying "
            boolean r1 = r8.isDefaultLocation()
            r2 = 0
            java.lang.String r3 = "InstanceDetails"
            java.lang.String r4 = "[OpenFolder] "
            if (r1 == 0) goto L24
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r4)
            java.lang.StringBuilder r8 = r8.append(r10)
            java.lang.String r9 = " location is default; using launcher provider route"
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r8)
            return r2
        L24:
            java.lang.String r1 = r8.getUriString()
            boolean r5 = r7.isBlank(r1)
            if (r5 == 0) goto L4d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r4)
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r10 = " custom location has no tree uri: "
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r8 = r8.getId()
            java.lang.StringBuilder r8 = r9.append(r8)
            java.lang.String r8 = r8.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r8)
            return r2
        L4d:
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> Ldb
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch: java.lang.Throwable -> Ldb
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldb
            r5.<init>(r0)     // Catch: java.lang.Throwable -> Ldb
            java.lang.StringBuilder r5 = r5.append(r10)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r6 = " launcherHomePath mapping for "
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r6 = r8.getId()     // Catch: java.lang.Throwable -> Ldb
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Ldb
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r5)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r5 = r8.getLauncherHomePath()     // Catch: java.lang.Throwable -> Ldb
            android.net.Uri r5 = r7.buildInitialUriForLocationRoot(r1, r5, r9)     // Catch: java.lang.Throwable -> Ldb
            if (r5 == 0) goto L98
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldb
            r9.<init>(r4)     // Catch: java.lang.Throwable -> Ldb
            java.lang.StringBuilder r9 = r9.append(r10)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r0 = " launcherHomePath mapping succeeded: "
            java.lang.StringBuilder r9 = r9.append(r0)     // Catch: java.lang.Throwable -> Ldb
            java.lang.StringBuilder r9 = r9.append(r5)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> Ldb
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r9)     // Catch: java.lang.Throwable -> Ldb
            return r5
        L98:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldb
            r5.<init>(r0)     // Catch: java.lang.Throwable -> Ldb
            java.lang.StringBuilder r0 = r5.append(r10)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r5 = " minecraftHomePath mapping for "
            java.lang.StringBuilder r0 = r0.append(r5)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r5 = r8.getId()     // Catch: java.lang.Throwable -> Ldb
            java.lang.StringBuilder r0 = r0.append(r5)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Ldb
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r0)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r0 = r8.getMinecraftHomePath()     // Catch: java.lang.Throwable -> Ldb
            android.net.Uri r9 = r7.buildInitialUriForLocationRoot(r1, r0, r9)     // Catch: java.lang.Throwable -> Ldb
            if (r9 == 0) goto L10a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldb
            r0.<init>(r4)     // Catch: java.lang.Throwable -> Ldb
            java.lang.StringBuilder r0 = r0.append(r10)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r1 = " minecraftHomePath mapping succeeded: "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> Ldb
            java.lang.StringBuilder r0 = r0.append(r9)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Ldb
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r0)     // Catch: java.lang.Throwable -> Ldb
            return r9
        Ldb:
            r9 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[OpenFolder] unable to map "
            r0.<init>(r1)
            java.lang.StringBuilder r10 = r0.append(r10)
            java.lang.String r0 = " storage folder "
            java.lang.StringBuilder r10 = r10.append(r0)
            java.lang.String r8 = r8.getId()
            java.lang.StringBuilder r8 = r10.append(r8)
            java.lang.String r10 = ": "
            java.lang.StringBuilder r8 = r8.append(r10)
            java.lang.String r9 = r7.readableError(r9)
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r8)
        L10a:
            return r2
    }

    private android.net.Uri buildLauncherDocumentsProviderInitialUri(java.io.File r13) {
            r12 = this;
            java.lang.String r0 = "InstanceDetails"
            java.lang.String r1 = "[OpenFolder] provider tree URI was null, fallback document URI="
            java.lang.String r2 = "[OpenFolder] provider tree URI="
            java.lang.String r3 = "[OpenFolder] provider mapping target="
            java.lang.String r4 = "[OpenFolder] provider mapping root="
            java.lang.String r5 = "[OpenFolder] provider mapping defaultHome="
            java.lang.String r6 = "[OpenFolder] provider mapping authority="
            java.lang.String r7 = "[OpenFolder] provider mapping check package="
            r8 = 0
            java.io.File r9 = ca.dnamobile.javalauncher.storage.JavaLauncherDocumentsProvider.getRootDirectoryForContext(r12)     // Catch: java.lang.Throwable -> Lcc
            java.io.File r9 = r9.getCanonicalFile()     // Catch: java.lang.Throwable -> Lcc
            boolean r10 = r12.isSameOrChild(r9, r13)     // Catch: java.lang.Throwable -> Lcc
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcc
            r11.<init>(r7)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r7 = r12.getPackageName()     // Catch: java.lang.Throwable -> Lcc
            java.lang.StringBuilder r7 = r11.append(r7)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Lcc
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r7)     // Catch: java.lang.Throwable -> Lcc
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcc
            r7.<init>(r6)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r6 = ca.dnamobile.javalauncher.storage.JavaLauncherDocumentsProvider.getAuthority(r12)     // Catch: java.lang.Throwable -> Lcc
            java.lang.StringBuilder r6 = r7.append(r6)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Lcc
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r6)     // Catch: java.lang.Throwable -> Lcc
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcc
            r6.<init>(r5)     // Catch: java.lang.Throwable -> Lcc
            java.io.File r5 = ca.dnamobile.javalauncher.utils.path.PathManager.getDefaultLauncherHome(r12)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r5 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> Lcc
            java.lang.StringBuilder r5 = r6.append(r5)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Lcc
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r5)     // Catch: java.lang.Throwable -> Lcc
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcc
            r5.<init>(r4)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r4 = r9.getAbsolutePath()     // Catch: java.lang.Throwable -> Lcc
            java.lang.StringBuilder r4 = r5.append(r4)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lcc
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r4)     // Catch: java.lang.Throwable -> Lcc
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcc
            r4.<init>(r3)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r3 = r13.getAbsolutePath()     // Catch: java.lang.Throwable -> Lcc
            java.lang.StringBuilder r3 = r4.append(r3)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r4 = ", containsTarget="
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> Lcc
            java.lang.StringBuilder r3 = r3.append(r10)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lcc
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r3)     // Catch: java.lang.Throwable -> Lcc
            if (r10 != 0) goto L92
            return r8
        L92:
            android.net.Uri r3 = ca.dnamobile.javalauncher.storage.JavaLauncherDocumentsProvider.buildTreeUriForFile(r12, r13)     // Catch: java.lang.Throwable -> Lcc
            if (r3 == 0) goto Lb7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcc
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lcc
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r2 = ", documentId="
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r13 = ca.dnamobile.javalauncher.storage.JavaLauncherDocumentsProvider.getDocumentIdForFile(r12, r13)     // Catch: java.lang.Throwable -> Lcc
            java.lang.StringBuilder r13 = r1.append(r13)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> Lcc
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r13)     // Catch: java.lang.Throwable -> Lcc
            return r3
        Lb7:
            android.net.Uri r13 = ca.dnamobile.javalauncher.storage.JavaLauncherDocumentsProvider.buildDocumentUriForFile(r12, r13)     // Catch: java.lang.Throwable -> Lcc
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcc
            r2.<init>(r1)     // Catch: java.lang.Throwable -> Lcc
            java.lang.StringBuilder r1 = r2.append(r13)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lcc
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r1)     // Catch: java.lang.Throwable -> Lcc
            return r13
        Lcc:
            r13 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[OpenFolder] Unable to build launcher DocumentsProvider initial URI: "
            r1.<init>(r2)
            java.lang.String r13 = r12.readableError(r13)
            java.lang.StringBuilder r13 = r1.append(r13)
            java.lang.String r13 = r13.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r13)
            return r8
    }

    private android.widget.TextView buildPerInstanceDialogLabel(java.lang.String r3) {
            r2 = this;
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r2)
            r0.setText(r3)
            r3 = 2
            r1 = 1096810496(0x41600000, float:14.0)
            r0.setTextSize(r3, r1)
            android.graphics.Typeface r3 = r0.getTypeface()
            r1 = 1
            r0.setTypeface(r3, r1)
            r3 = 16842806(0x1010036, float:2.369371E-38)
            r1 = -1
            int r3 = r2.resolveThemeColor(r3, r1)
            r0.setTextColor(r3)
            return r0
    }

    private android.net.Uri buildSelectedStorageInitialUri(java.io.File r7) {
            r6 = this;
            ca.dnamobile.javalauncher.storage.StorageLocation r0 = ca.dnamobile.javalauncher.storage.StorageLocationStore.getSelectedLocation(r6)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[OpenFolder] selected location id="
            r1.<init>(r2)
            java.lang.String r2 = r0.getId()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", name="
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r0.getDisplayName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", default="
            java.lang.StringBuilder r1 = r1.append(r2)
            boolean r2 = r0.isDefaultLocation()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", usableForFileLaunch="
            java.lang.StringBuilder r1 = r1.append(r2)
            boolean r2 = r0.isUsableForFileLaunch()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "InstanceDetails"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "[OpenFolder] selected location uri="
            r1.<init>(r3)
            java.lang.String r3 = r0.getUriString()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "[OpenFolder] selected location launcherHomePath="
            r1.<init>(r3)
            java.lang.String r3 = r0.getLauncherHomePath()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "[OpenFolder] selected location minecraftHomePath="
            r1.<init>(r3)
            java.lang.String r3 = r0.getMinecraftHomePath()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r1)
            java.lang.String r1 = "selected"
            android.net.Uri r1 = r6.buildInitialUriForStorageLocation(r0, r7, r1)
            if (r1 == 0) goto L91
            return r1
        L91:
            java.util.List r1 = ca.dnamobile.javalauncher.storage.StorageLocationStore.getLocations(r6)
            java.util.Iterator r1 = r1.iterator()
        L99:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lc4
            java.lang.Object r3 = r1.next()
            ca.dnamobile.javalauncher.storage.StorageLocation r3 = (ca.dnamobile.javalauncher.storage.StorageLocation) r3
            boolean r4 = r3.isDefaultLocation()
            if (r4 == 0) goto Lac
            goto L99
        Lac:
            java.lang.String r4 = r3.getId()
            java.lang.String r5 = r0.getId()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto Lbb
            goto L99
        Lbb:
            java.lang.String r4 = "saved"
            android.net.Uri r3 = r6.buildInitialUriForStorageLocation(r3, r7, r4)
            if (r3 == 0) goto L99
            return r3
        Lc4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[OpenFolder] no custom storage location contained target "
            r0.<init>(r1)
            java.lang.String r7 = r7.getAbsolutePath()
            java.lang.StringBuilder r7 = r0.append(r7)
            java.lang.String r7 = r7.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r7)
            r7 = 0
            return r7
    }

    private android.net.Uri buildTreeDocumentUriByAppendingPath(android.net.Uri r7, java.lang.String r8) {
            r6 = this;
            java.lang.String r0 = "InstanceDetails"
            java.lang.String r1 = "[OpenFolder] built tree URI by appending path. treeDocumentId="
            java.lang.String r2 = "[OpenFolder] tree document id is blank for treeUri="
            r3 = 0
            java.lang.String r4 = android.provider.DocumentsContract.getTreeDocumentId(r7)     // Catch: java.lang.Throwable -> L59
            boolean r5 = r6.isBlank(r4)     // Catch: java.lang.Throwable -> L59
            if (r5 == 0) goto L22
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L59
            java.lang.StringBuilder r7 = r8.append(r7)     // Catch: java.lang.Throwable -> L59
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L59
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r7)     // Catch: java.lang.Throwable -> L59
            return r3
        L22:
            java.lang.String r2 = r6.appendDocumentIdPath(r4, r8)     // Catch: java.lang.Throwable -> L59
            android.net.Uri r7 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r7, r2)     // Catch: java.lang.Throwable -> L59
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L59
            java.lang.StringBuilder r1 = r5.append(r4)     // Catch: java.lang.Throwable -> L59
            java.lang.String r4 = ", relativePath="
            java.lang.StringBuilder r1 = r1.append(r4)     // Catch: java.lang.Throwable -> L59
            java.lang.StringBuilder r8 = r1.append(r8)     // Catch: java.lang.Throwable -> L59
            java.lang.String r1 = ", documentId="
            java.lang.StringBuilder r8 = r8.append(r1)     // Catch: java.lang.Throwable -> L59
            java.lang.StringBuilder r8 = r8.append(r2)     // Catch: java.lang.Throwable -> L59
            java.lang.String r1 = ", uri="
            java.lang.StringBuilder r8 = r8.append(r1)     // Catch: java.lang.Throwable -> L59
            java.lang.StringBuilder r8 = r8.append(r7)     // Catch: java.lang.Throwable -> L59
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L59
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r8)     // Catch: java.lang.Throwable -> L59
            return r7
        L59:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "[OpenFolder] unable to build tree document URI by path: "
            r8.<init>(r1)
            java.lang.String r7 = r6.readableError(r7)
            java.lang.StringBuilder r7 = r8.append(r7)
            java.lang.String r7 = r7.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r7)
            return r3
    }

    private java.lang.String buildUpdateKey(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r4) {
            r3 = this;
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r0 = r4.category
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = r3.toModManagerContentType(r0)
            java.lang.String r1 = ":file:"
            if (r0 == 0) goto L39
            java.io.File r2 = r3.gameDirectory
            if (r2 == 0) goto L39
            org.json.JSONObject r2 = r3.getInstalledEntryForItem(r4)
            if (r2 == 0) goto L19
            java.lang.String r4 = r3.buildUpdateKey(r0, r2)
            return r4
        L19:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = r0.name()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.io.File r4 = r4.file
            java.lang.String r4 = r3.safeCanonicalPath(r4)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            return r4
        L39:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r2 = r4.category
            java.lang.String r2 = r2.name()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.io.File r4 = r4.file
            java.lang.String r4 = r3.safeCanonicalPath(r4)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            return r4
    }

    private java.lang.String buildUpdateKey(ca.dnamobile.javalauncher.modmanager.ModManagerContentType r4, org.json.JSONObject r5) {
            r3 = this;
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = ca.dnamobile.javalauncher.modmanager.ModManagerManifest.getSource(r5)
            java.lang.String r1 = r3.getProjectIdFromEntry(r5)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L1a
            java.lang.String r1 = "fileName"
            java.lang.String r2 = "unknown"
            java.lang.String r5 = r5.optString(r1, r2)
            java.lang.String r1 = r5.trim()
        L1a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r4 = r4.name()
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r5 = ":"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r0 = r0.getId()
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            return r4
    }

    private java.lang.String buildUpdateKey(ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.UpdateCandidate r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = r4.contentType
            java.lang.String r1 = r1.name()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ":"
            java.lang.StringBuilder r0 = r0.append(r1)
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r2 = r4.source
            java.lang.String r2 = r2.getId()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r4 = r4.getProjectId()
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            return r4
    }

    private int calculatePerInstanceRamStepCount(int r1, int r2, int r3) {
            r0 = this;
            if (r2 > r1) goto L4
            r1 = 0
            return r1
        L4:
            int r2 = r2 - r1
            float r1 = (float) r2
            float r2 = (float) r3
            float r1 = r1 / r2
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            r2 = 1
            int r1 = java.lang.Math.max(r2, r1)
            return r1
    }

    private boolean canBrowseSelectedCategory() {
            r2 = this;
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r0 = r2.selectedCategory
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r1 = ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory.MODS
            if (r0 != r1) goto Lf
            boolean r0 = r2.supportsMods()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    private boolean canCheckUpdatesForSelectedCategory() {
            r1 = this;
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r0 = r1.selectedCategory
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = r1.toModManagerContentType(r0)
            if (r0 == 0) goto Le
            java.io.File r0 = r1.gameDirectory
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    private boolean canUploadSelectedCategory() {
            r2 = this;
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r0 = r2.selectedCategory
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r1 = ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory.MODS
            if (r0 != r1) goto Lf
            boolean r0 = r2.supportsMods()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    private void cancelPendingContentLoadingOverlay() {
            r2 = this;
            java.lang.Runnable r0 = r2.pendingContentLoadingRunnable
            if (r0 == 0) goto Lc
            android.os.Handler r1 = r2.mainHandler
            r1.removeCallbacks(r0)
            r0 = 0
            r2.pendingContentLoadingRunnable = r0
        Lc:
            return
    }

    private void cancelPendingMetadataSearchFilter() {
            r2 = this;
            java.lang.Runnable r0 = r2.pendingMetadataSearchFilterRunnable
            if (r0 != 0) goto L5
            return
        L5:
            android.os.Handler r1 = r2.mainHandler
            r1.removeCallbacks(r0)
            r0 = 0
            r2.pendingMetadataSearchFilterRunnable = r0
            return
    }

    private void checkSingleContentUpdate(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r5) {
            r4 = this;
            ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem r5 = r4.resolveContentItemForAction(r5)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r0 = r5.category
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = r4.toModManagerContentType(r0)
            if (r0 == 0) goto L64
            java.io.File r1 = r4.gameDirectory
            if (r1 != 0) goto L11
            goto L64
        L11:
            org.json.JSONObject r5 = r4.getInstalledEntryForItem(r5)
            r1 = 1
            if (r5 != 0) goto L22
            int r5 = ca.dnamobile.javalauncher.R.string.instance_content_update_missing_metadata
            android.widget.Toast r5 = android.widget.Toast.makeText(r4, r5, r1)
            r5.show()
            return
        L22:
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r2 = ca.dnamobile.javalauncher.modmanager.ModManagerManifest.getSource(r5)
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r3 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.MODRINTH
            if (r2 == r3) goto L38
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r3 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.CURSEFORGE
            if (r2 == r3) goto L38
            int r5 = ca.dnamobile.javalauncher.R.string.instance_content_update_manual_not_supported
            android.widget.Toast r5 = android.widget.Toast.makeText(r4, r5, r1)
            r5.show()
            return
        L38:
            java.lang.String r1 = r4.buildUpdateKey(r0, r5)
            java.util.Map<java.lang.String, ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState> r2 = r4.updateStates
            ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState r3 = ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState.CHECKING
            r2.put(r1, r3)
            java.util.Map<java.lang.String, java.lang.String> r2 = r4.updateMessages
            int r3 = ca.dnamobile.javalauncher.R.string.instance_content_checking_updates_short
            java.lang.String r3 = r4.getString(r3)
            r2.put(r1, r3)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter r2 = r4.contentAdapter
            if (r2 == 0) goto L55
            r2.notifyDataSetChanged()
        L55:
            java.lang.Thread r2 = new java.lang.Thread
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda44 r3 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda44
            r3.<init>(r4, r0, r5, r1)
            java.lang.String r5 = "Check Content Item Update"
            r2.<init>(r3, r5)
            r2.start()
        L64:
            return
    }

    private void checkSingleContentUpdateFromRow(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r1) {
            r0 = this;
            r0.prepareContentRowAction()
            ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem r1 = r0.resolveContentItemForAction(r1)
            r0.checkSingleContentUpdate(r1)
            return
    }

    private void checkUpdatesForSelectedCategory() {
            r8 = this;
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r0 = r8.selectedCategory
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = r8.toModManagerContentType(r0)
            if (r0 == 0) goto L30
            java.io.File r1 = r8.gameDirectory
            if (r1 != 0) goto Ld
            goto L30
        Ld:
            int r1 = ca.dnamobile.javalauncher.R.string.instance_content_checking_updates_title
            java.lang.String r3 = r8.getString(r1)
            int r1 = ca.dnamobile.javalauncher.R.string.instance_content_checking_updates_message
            java.lang.String r4 = r8.getString(r1)
            r6 = 1
            r7 = 1
            r5 = 1
            r2 = r8
            r2.showUpdateProgressDialog(r3, r4, r5, r6, r7)
            java.lang.Thread r1 = new java.lang.Thread
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda108 r2 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda108
            r2.<init>(r8, r0)
            java.lang.String r0 = "Check Instance Content Updates"
            r1.<init>(r2, r0)
            r1.start()
            return
        L30:
            int r0 = ca.dnamobile.javalauncher.R.string.instance_content_updates_not_supported
            r1 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r8, r0, r1)
            r0.show()
            return
    }

    private void clearPerInstanceSettingsAliases(java.lang.String r2) {
            r1 = this;
            java.util.ArrayList r2 = r1.collectPerInstanceSettingsAliasKeys(r2)
            java.util.Iterator r2 = r2.iterator()
        L8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            ca.dnamobile.javalauncher.launcher.InstanceLaunchSettings.clear(r1, r0)
            goto L8
        L18:
            return
    }

    private void collectFilesForWorldExport(java.io.File r3, java.util.ArrayList<java.io.File> r4) {
            r2 = this;
            boolean r0 = r3.isHidden()
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = r3.isFile()
            if (r0 == 0) goto L11
            r4.add(r3)
            return
        L11:
            java.io.File[] r3 = r3.listFiles()
            if (r3 != 0) goto L18
            return
        L18:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collections.addAll(r0, r3)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda97 r3 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda97
            r3.<init>()
            java.util.Comparator r1 = java.lang.String.CASE_INSENSITIVE_ORDER
            java.util.Comparator r3 = java.util.Comparator.comparing(r3, r1)
            r0.sort(r3)
            java.util.Iterator r3 = r0.iterator()
        L32:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L42
            java.lang.Object r0 = r3.next()
            java.io.File r0 = (java.io.File) r0
            r2.collectFilesForWorldExport(r0, r4)
            goto L32
        L42:
            return
    }

    private void collectOldFilesForUpdate(ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateCleanupPlan r4, java.util.ArrayList<org.json.JSONObject> r5) {
            r3 = this;
            java.util.Iterator r5 = r5.iterator()
        L4:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r5.next()
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = r4.contentType
            java.io.File r0 = r3.resolveFileForInstalledEntry(r0, r1)
            if (r0 != 0) goto L19
            goto L4
        L19:
            java.lang.String r1 = r3.safeCanonicalPath(r0)
            java.util.HashSet<java.lang.String> r2 = r4.oldCanonicalPaths
            boolean r1 = r2.add(r1)
            if (r1 != 0) goto L26
            goto L4
        L26:
            java.util.ArrayList<java.io.File> r1 = r4.oldFiles
            r1.add(r0)
            goto L4
        L2c:
            return
    }

    private java.util.ArrayList<java.lang.String> collectPerInstanceSettingsAliasKeys(java.lang.String r3) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.addPerInstanceSettingsAlias(r0, r3)
            java.lang.String r3 = r2.instanceId
            java.lang.String r1 = r2.instanceName
            java.lang.String r3 = ca.dnamobile.javalauncher.launcher.InstanceLaunchSettings.resolveInstanceKey(r3, r1)
            r2.addPerInstanceSettingsAlias(r0, r3)
            java.lang.String r3 = r2.instanceId
            r2.addPerInstanceSettingsAlias(r0, r3)
            java.lang.String r3 = r2.instanceName
            r2.addPerInstanceSettingsAlias(r0, r3)
            java.lang.String r3 = r2.baseVersionId
            r2.addPerInstanceSettingsAlias(r0, r3)
            boolean r3 = r2.isolated
            if (r3 == 0) goto L2c
            java.lang.String r3 = r2.instanceName
            r2.addPerInstanceSettingsAlias(r0, r3)
            goto L31
        L2c:
            java.lang.String r3 = r2.baseVersionId
            r2.addPerInstanceSettingsAlias(r0, r3)
        L31:
            return r0
    }

    private java.util.ArrayList<android.net.Uri> collectSelectedUris(android.content.Intent r4) {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.content.ClipData r1 = r4.getClipData()
            if (r1 == 0) goto L22
            r4 = 0
        Lc:
            int r2 = r1.getItemCount()
            if (r4 >= r2) goto L2f
            android.content.ClipData$Item r2 = r1.getItemAt(r4)
            android.net.Uri r2 = r2.getUri()
            if (r2 == 0) goto L1f
            r0.add(r2)
        L1f:
            int r4 = r4 + 1
            goto Lc
        L22:
            android.net.Uri r1 = r4.getData()
            if (r1 == 0) goto L2f
            android.net.Uri r4 = r4.getData()
            r0.add(r4)
        L2f:
            return r0
    }

    private void collectTrackedProjectFilesForCleanup(java.util.ArrayList<java.io.File> r3, java.util.HashSet<java.lang.String> r4, java.util.ArrayList<org.json.JSONObject> r5, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r6) {
            r2 = this;
            java.util.Iterator r5 = r5.iterator()
        L4:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r5.next()
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            java.io.File r0 = r2.resolveFileForInstalledEntry(r0, r6)
            if (r0 == 0) goto L4
            boolean r1 = r0.isFile()
            if (r1 != 0) goto L1d
            goto L4
        L1d:
            java.lang.String r1 = r2.safeCanonicalPath(r0)
            boolean r1 = r4.add(r1)
            if (r1 == 0) goto L4
            r3.add(r0)
            goto L4
        L2b:
            return
    }

    private void confirmUpdateLoader(ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderVersion r5, java.lang.String r6) {
            r4 = this;
            java.lang.String r0 = r5.displayVersion
            boolean r0 = ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.isSameLoaderVersion(r0, r6)
            if (r0 != 0) goto L13
            java.lang.String r0 = r5.installVersion
            boolean r6 = ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.isSameLoaderVersion(r0, r6)
            if (r6 == 0) goto L11
            goto L13
        L11:
            r6 = 0
            goto L14
        L13:
            r6 = 1
        L14:
            java.lang.String r0 = " for Minecraft "
            java.lang.String r1 = " "
            if (r6 == 0) goto L48
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "This instance is already using "
            r2.<init>(r3)
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind r3 = r5.kind
            java.lang.String r3 = r3.displayName
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = r5.displayVersion
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = r5.minecraftVersion
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L75
        L48:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Update this instance to "
            r2.<init>(r3)
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind r3 = r5.kind
            java.lang.String r3 = r3.displayName
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = r5.displayVersion
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = r5.minecraftVersion
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "?"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
        L75:
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r4)
            java.lang.String r2 = "Update Loader"
            android.app.AlertDialog$Builder r1 = r1.setTitle(r2)
            android.app.AlertDialog$Builder r0 = r1.setMessage(r0)
            r1 = 17039360(0x1040000, float:2.424457E-38)
            r2 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            if (r6 == 0) goto L94
            r5 = 17039370(0x104000a, float:2.42446E-38)
            r0.setPositiveButton(r5, r2)
            goto L9e
        L94:
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda16 r6 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda16
            r6.<init>(r4, r5)
            java.lang.String r5 = "Update"
            r0.setPositiveButton(r5, r6)
        L9e:
            r0.show()
            return
    }

    private void confirmUpdateVersion(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = r3.loader
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind r0 = ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.resolveLoaderKind(r0)
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind r1 = ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind.FABRIC
            if (r0 == r1) goto L29
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind r1 = ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind.FORGE
            if (r0 == r1) goto L29
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind r1 = ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind.NEOFORGE
            if (r0 != r1) goto L13
            goto L29
        L13:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Update this vanilla instance to Minecraft "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r1 = "?"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L4a
        L29:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Update this instance to Minecraft "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = "?\n\n"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r0.displayName
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = " will also be updated to the latest loader available for that Minecraft version."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
        L4a:
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r3)
            java.lang.String r2 = "Update Version"
            android.app.AlertDialog$Builder r1 = r1.setTitle(r2)
            android.app.AlertDialog$Builder r0 = r1.setMessage(r0)
            r1 = 17039360(0x1040000, float:2.424457E-38)
            r2 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda0
            r1.<init>(r3, r4)
            java.lang.String r4 = "Update"
            android.app.AlertDialog$Builder r4 = r0.setPositiveButton(r4, r1)
            r4.show()
            return
    }

    private void constrainResourceRecyclerHeightIfNeeded() {
            r4 = this;
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r4.binding
            if (r0 == 0) goto L3d
            androidx.recyclerview.widget.RecyclerView r0 = r0.recyclerResourceItems
            if (r0 != 0) goto L9
            goto L3d
        L9:
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r4.binding
            androidx.recyclerview.widget.RecyclerView r0 = r0.recyclerResourceItems
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 == 0) goto L3d
            int r1 = r0.height
            r2 = -2
            if (r1 == r2) goto L19
            goto L3d
        L19:
            android.content.res.Resources r1 = r4.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.heightPixels
            r2 = 180(0xb4, float:2.52E-43)
            int r2 = r4.dp(r2)
            r3 = 260(0x104, float:3.64E-43)
            int r3 = r4.dp(r3)
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r2, r1)
            r0.height = r1
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r1 = r4.binding
            androidx.recyclerview.widget.RecyclerView r1 = r1.recyclerResourceItems
            r1.setLayoutParams(r0)
        L3d:
            return
    }

    private boolean containsUpdateCandidate(java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.UpdateCandidate> r2, ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.UpdateCandidate r3) {
            r1 = this;
            java.lang.String r3 = r1.buildUpdateKey(r3)
            java.util.Iterator r2 = r2.iterator()
        L8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r2.next()
            ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager$UpdateCandidate r0 = (ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.UpdateCandidate) r0
            java.lang.String r0 = r1.buildUpdateKey(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L8
            r2 = 1
            return r2
        L20:
            r2 = 0
            return r2
    }

    private void continueLaunchInstance() {
            r3 = this;
            java.lang.String r0 = r3.instanceId
            ca.dnamobile.javalauncher.settings.LauncherPreferences.recordInstancePlayed(r3, r0)
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<ca.dnamobile.javalauncher.GameActivity> r1 = ca.dnamobile.javalauncher.GameActivity.class
            r0.<init>(r3, r1)
            boolean r1 = r3.isolated
            if (r1 == 0) goto L13
            java.lang.String r1 = r3.instanceName
            goto L15
        L13:
            java.lang.String r1 = r3.baseVersionId
        L15:
            java.lang.String r2 = "ca.dnamobile.javalauncher.extra.VERSION_ID"
            r0.putExtra(r2, r1)
            r3.startActivity(r0)
            return
    }

    private void continueLaunchInstance(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = r3.instanceId
            ca.dnamobile.javalauncher.settings.LauncherPreferences.recordInstancePlayed(r3, r0)
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<ca.dnamobile.javalauncher.GameActivity> r1 = ca.dnamobile.javalauncher.GameActivity.class
            r0.<init>(r3, r1)
            boolean r1 = r3.isolated
            if (r1 == 0) goto L13
            java.lang.String r1 = r3.instanceName
            goto L15
        L13:
            java.lang.String r1 = r3.baseVersionId
        L15:
            java.lang.String r2 = "ca.dnamobile.javalauncher.extra.VERSION_ID"
            r0.putExtra(r2, r1)
            if (r4 == 0) goto L2b
            java.lang.String r1 = r4.trim()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L2b
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.QUICK_PLAY_WORLD"
            r0.putExtra(r1, r4)
        L2b:
            r3.startActivity(r0)
            return
    }

    private void copyStream(java.io.InputStream r4, java.io.OutputStream r5) throws java.io.IOException {
            r3 = this;
            r0 = 32768(0x8000, float:4.5918E-41)
            byte[] r0 = new byte[r0]
        L5:
            int r1 = r4.read(r0)
            r2 = -1
            if (r1 == r2) goto L11
            r2 = 0
            r5.write(r0, r2, r1)
            goto L5
        L11:
            return
    }

    private void copyTextToClipboard(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "clipboard"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.content.ClipboardManager r0 = (android.content.ClipboardManager) r0
            if (r0 == 0) goto L21
            int r1 = ca.dnamobile.javalauncher.R.string.instance_settings_view_folder
            java.lang.String r1 = r2.getString(r1)
            android.content.ClipData r3 = android.content.ClipData.newPlainText(r1, r3)
            r0.setPrimaryClip(r3)
            int r3 = ca.dnamobile.javalauncher.R.string.instance_folder_path_copied
            r0 = 0
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r0)
            r3.show()
        L21:
            return
    }

    private void copyUriToFile(android.net.Uri r3, java.io.File r4) throws java.lang.Exception {
            r2 = this;
            android.content.ContentResolver r0 = r2.getContentResolver()
            java.io.InputStream r3 = r0.openInputStream(r3)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L2e
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L1d
            r2.copyStream(r3, r0)     // Catch: java.lang.Throwable -> L1b
            r0.close()     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L1a
            r3.close()
        L1a:
            return
        L1b:
            r4 = move-exception
            goto L25
        L1d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "Unable to open selected file."
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L1b
            throw r4     // Catch: java.lang.Throwable -> L1b
        L25:
            r0.close()     // Catch: java.lang.Throwable -> L29
            goto L2d
        L29:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.lang.Throwable -> L2e
        L2d:
            throw r4     // Catch: java.lang.Throwable -> L2e
        L2e:
            r4 = move-exception
            if (r3 == 0) goto L39
            r3.close()     // Catch: java.lang.Throwable -> L35
            goto L39
        L35:
            r3 = move-exception
            r4.addSuppressed(r3)
        L39:
            throw r4
    }

    private int countAvailableUpdatesForSelectedCategory() {
            r4 = this;
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r0 = r4.selectedCategory
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = r4.toModManagerContentType(r0)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = r0.name()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = ":"
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.util.Map<java.lang.String, ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager$UpdateCandidate> r2 = r4.updateCandidates
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L2b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L40
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r3.startsWith(r0)
            if (r3 == 0) goto L2b
            int r1 = r1 + 1
            goto L2b
        L40:
            return r1
    }

    public static android.content.Intent createIntent(android.content.Context r2, ca.dnamobile.javalauncher.instance.LauncherInstance r3) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<ca.dnamobile.javalauncher.InstanceDetailsActivity> r1 = ca.dnamobile.javalauncher.InstanceDetailsActivity.class
            r0.<init>(r2, r1)
            java.lang.String r2 = "ca.dnamobile.javalauncher.extra.INSTANCE_ID"
            java.lang.String r1 = r3.getId()
            r0.putExtra(r2, r1)
            java.lang.String r2 = "ca.dnamobile.javalauncher.extra.INSTANCE_NAME"
            java.lang.String r1 = r3.getName()
            r0.putExtra(r2, r1)
            java.lang.String r2 = "ca.dnamobile.javalauncher.extra.INSTANCE_LOADER"
            java.lang.String r1 = r3.getLoader()
            r0.putExtra(r2, r1)
            java.lang.String r2 = "ca.dnamobile.javalauncher.extra.BASE_VERSION_ID"
            java.lang.String r1 = r3.getBaseVersionId()
            r0.putExtra(r2, r1)
            java.lang.String r2 = "ca.dnamobile.javalauncher.extra.MINECRAFT_VERSION_ID"
            java.lang.String r1 = r3.getMinecraftVersionId()
            r0.putExtra(r2, r1)
            java.lang.String r2 = "ca.dnamobile.javalauncher.extra.VERSION_TYPE"
            java.lang.String r1 = r3.getVersionType()
            r0.putExtra(r2, r1)
            java.io.File r2 = r3.getRootDirectory()
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.ROOT_DIRECTORY"
            r0.putExtra(r1, r2)
            java.io.File r2 = r3.getGameDirectory()
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.GAME_DIRECTORY"
            r0.putExtra(r1, r2)
            java.io.File r2 = r3.getIconFile()
            if (r2 == 0) goto L66
            java.io.File r2 = r3.getIconFile()
            java.lang.String r2 = r2.getAbsolutePath()
            goto L68
        L66:
            java.lang.String r2 = ""
        L68:
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.ICON_FILE"
            r0.putExtra(r1, r2)
            java.lang.String r2 = "ca.dnamobile.javalauncher.extra.ISOLATED"
            boolean r3 = r3.isIsolated()
            r0.putExtra(r2, r3)
            return r0
    }

    private android.widget.ArrayAdapter<java.lang.String> createModpackDarkAdapter(java.lang.String[] r3) {
            r2 = this;
            ca.dnamobile.javalauncher.InstanceDetailsActivity$11 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$11
            r1 = 17367043(0x1090003, float:2.5162934E-38)
            r0.<init>(r2, r2, r1, r3)
            return r0
    }

    private android.widget.ArrayAdapter<java.lang.String> createModpackDarkChoiceAdapter(java.lang.String[] r3) {
            r2 = this;
            ca.dnamobile.javalauncher.InstanceDetailsActivity$12 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$12
            r1 = 17367055(0x109000f, float:2.5162968E-38)
            r0.<init>(r2, r2, r1, r3)
            return r0
    }

    private android.widget.LinearLayout createModpackDialogCard() {
            r4 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r4)
            r1 = 1
            r0.setOrientation(r1)
            r2 = 14
            int r2 = r4.dp(r2)
            r0.setPadding(r2, r2, r2, r2)
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            int r3 = ca.dnamobile.javalauncher.InstanceDetailsActivity.MODPACK_CARD_BG
            r2.setColor(r3)
            r3 = 18
            int r3 = r4.dp(r3)
            float r3 = (float) r3
            r2.setCornerRadius(r3)
            int r1 = r4.dp(r1)
            int r3 = ca.dnamobile.javalauncher.InstanceDetailsActivity.MODPACK_CARD_STROKE
            r2.setStroke(r1, r3)
            r0.setBackground(r2)
            return r0
    }

    private android.widget.LinearLayout createModpackDialogRoot(android.widget.ScrollView r8, java.lang.String r9, java.lang.String r10) {
            r7 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r7)
            r1 = 1
            r0.setOrientation(r1)
            int r2 = ca.dnamobile.javalauncher.InstanceDetailsActivity.MODPACK_DIALOG_BG
            r0.setBackgroundColor(r2)
            r2 = 18
            int r2 = r7.dp(r2)
            r3 = 8
            int r3 = r7.dp(r3)
            r0.setPadding(r2, r2, r2, r3)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = -1
            r4 = -2
            r2.<init>(r3, r4)
            r8.addView(r0, r2)
            android.widget.TextView r8 = new android.widget.TextView
            r8.<init>(r7)
            r8.setText(r9)
            r9 = 1103101952(0x41c00000, float:24.0)
            r2 = 2
            r8.setTextSize(r2, r9)
            android.graphics.Typeface r9 = r8.getTypeface()
            r8.setTypeface(r9, r1)
            int r9 = ca.dnamobile.javalauncher.InstanceDetailsActivity.MODPACK_TEXT_PRIMARY
            r8.setTextColor(r9)
            int r9 = r7.dp(r2)
            int r1 = r7.dp(r2)
            r5 = 6
            int r5 = r7.dp(r5)
            r6 = 0
            r8.setPadding(r9, r6, r1, r5)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r9.<init>(r3, r4)
            r0.addView(r8, r9)
            android.widget.TextView r8 = new android.widget.TextView
            r8.<init>(r7)
            r8.setText(r10)
            r9 = 1096810496(0x41600000, float:14.0)
            r8.setTextSize(r2, r9)
            int r9 = ca.dnamobile.javalauncher.InstanceDetailsActivity.MODPACK_TEXT_SECONDARY
            r8.setTextColor(r9)
            int r9 = r7.dp(r2)
            int r10 = r7.dp(r2)
            r1 = 12
            int r1 = r7.dp(r1)
            r8.setPadding(r9, r6, r10, r1)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r9.<init>(r3, r4)
            r0.addView(r8, r9)
            return r0
    }

    private android.widget.TextView createModpackFooterButton(java.lang.String r5, boolean r6) {
            r4 = this;
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r4)
            r0.setText(r5)
            r5 = 2
            r1 = 1096810496(0x41600000, float:14.0)
            r0.setTextSize(r5, r1)
            android.graphics.Typeface r5 = r0.getTypeface()
            r1 = 1
            r0.setTypeface(r5, r1)
            if (r6 == 0) goto L1b
            int r5 = ca.dnamobile.javalauncher.InstanceDetailsActivity.MODPACK_DIALOG_BG
            goto L1d
        L1b:
            int r5 = ca.dnamobile.javalauncher.InstanceDetailsActivity.MODPACK_ACCENT
        L1d:
            r0.setTextColor(r5)
            r5 = 17
            r0.setGravity(r5)
            r5 = 44
            int r5 = r4.dp(r5)
            r0.setMinHeight(r5)
            r5 = 18
            int r2 = r4.dp(r5)
            int r5 = r4.dp(r5)
            r3 = 0
            r0.setPadding(r2, r3, r5, r3)
            r0.setClickable(r1)
            r0.setFocusable(r1)
            android.graphics.drawable.GradientDrawable r5 = new android.graphics.drawable.GradientDrawable
            r5.<init>()
            r2 = 16
            int r2 = r4.dp(r2)
            float r2 = (float) r2
            r5.setCornerRadius(r2)
            if (r6 == 0) goto L55
            int r3 = ca.dnamobile.javalauncher.InstanceDetailsActivity.MODPACK_ACCENT
        L55:
            r5.setColor(r3)
            int r6 = r4.dp(r1)
            int r1 = ca.dnamobile.javalauncher.InstanceDetailsActivity.MODPACK_ACCENT
            r5.setStroke(r6, r1)
            r0.setBackground(r5)
            return r0
    }

    private ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateCleanupPlan createUpdateCleanupPlan(ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.UpdateCandidate r10) {
            r9 = this;
            ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateCleanupPlan r8 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateCleanupPlan
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2 = r10.contentType
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r3 = r10.source
            java.lang.String r0 = r10.getProjectId()
            java.lang.String r4 = r9.sanitizeProjectId(r0)
            java.lang.String r5 = r9.buildUpdateKey(r10)
            long r6 = java.lang.System.currentTimeMillis()
            r0 = r8
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r10 = r8.contentType
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = r8.source
            java.lang.String r1 = r8.projectId
            java.util.ArrayList r10 = r9.getInstalledManifestEntriesForProject(r10, r0, r1)
            r9.collectOldFilesForUpdate(r8, r10)
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r10 = r8.contentType
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = r8.source
            java.lang.String r1 = r8.projectId
            java.util.ArrayList r10 = r9.getModpackInstalledEntriesForProject(r10, r0, r1)
            boolean r0 = r10.isEmpty()
            r0 = r0 ^ 1
            r8.hadModpackMetadata = r0
            r9.collectOldFilesForUpdate(r8, r10)
            return r8
    }

    private android.graphics.Bitmap decodeFirstLikelyIcon(java.util.zip.ZipFile r6) throws java.io.IOException {
            r5 = this;
            java.util.Enumeration r0 = r6.entries()
        L4:
            boolean r1 = r0.hasMoreElements()
            if (r1 == 0) goto L69
            java.lang.Object r1 = r0.nextElement()
            java.util.zip.ZipEntry r1 = (java.util.zip.ZipEntry) r1
            boolean r2 = r1.isDirectory()
            if (r2 == 0) goto L17
            goto L4
        L17:
            java.lang.String r2 = r1.getName()
            java.lang.String r2 = r5.normalizeZipPath(r2)
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r3)
            r3 = 47
            int r3 = r2.lastIndexOf(r3)
            if (r3 < 0) goto L3a
            int r3 = r3 + 1
            int r4 = r2.length()
            if (r3 >= r4) goto L3a
            java.lang.String r3 = r2.substring(r3)
            goto L3b
        L3a:
            r3 = r2
        L3b:
            boolean r2 = r5.isLikelyIconPath(r2)
            if (r2 != 0) goto L47
            boolean r2 = r5.isLikelyIconFileName(r3)
            if (r2 == 0) goto L4
        L47:
            java.io.InputStream r1 = r6.getInputStream(r1)
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch: java.lang.Throwable -> L5d
            if (r2 == 0) goto L57
            if (r1 == 0) goto L56
            r1.close()
        L56:
            return r2
        L57:
            if (r1 == 0) goto L4
            r1.close()
            goto L4
        L5d:
            r6 = move-exception
            if (r1 == 0) goto L68
            r1.close()     // Catch: java.lang.Throwable -> L64
            goto L68
        L64:
            r0 = move-exception
            r6.addSuppressed(r0)
        L68:
            throw r6
        L69:
            r6 = 0
            return r6
    }

    private android.graphics.Bitmap decodeZipBitmap(java.util.zip.ZipFile r4, java.lang.String r5) throws java.io.IOException {
            r3 = this;
            boolean r0 = r3.isBlank(r5)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r5 = r5.trim()
            java.lang.String r5 = r3.normalizeZipPath(r5)
        L10:
            java.lang.String r0 = "/"
            boolean r0 = r5.startsWith(r0)
            if (r0 == 0) goto L1e
            r0 = 1
            java.lang.String r5 = r5.substring(r0)
            goto L10
        L1e:
            java.util.zip.ZipEntry r0 = r4.getEntry(r5)
            if (r0 != 0) goto L35
            java.lang.String r2 = "./"
            boolean r2 = r5.startsWith(r2)
            if (r2 == 0) goto L35
            r0 = 2
            java.lang.String r0 = r5.substring(r0)
            java.util.zip.ZipEntry r0 = r4.getEntry(r0)
        L35:
            if (r0 != 0) goto L3b
            java.util.zip.ZipEntry r0 = r3.findZipEntryBySuffix(r4, r5)
        L3b:
            if (r0 == 0) goto L5e
            boolean r5 = r0.isDirectory()
            if (r5 == 0) goto L44
            goto L5e
        L44:
            java.io.InputStream r4 = r4.getInputStream(r0)
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r4)     // Catch: java.lang.Throwable -> L52
            if (r4 == 0) goto L51
            r4.close()
        L51:
            return r5
        L52:
            r5 = move-exception
            if (r4 == 0) goto L5d
            r4.close()     // Catch: java.lang.Throwable -> L59
            goto L5d
        L59:
            r4 = move-exception
            r5.addSuppressed(r4)
        L5d:
            throw r5
        L5e:
            return r1
    }

    private void deleteContentItem(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r3) {
            r2 = this;
            ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem r3 = r2.resolveContentItemForAction(r3)
            java.lang.Thread r0 = new java.lang.Thread
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda118 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda118
            r1.<init>(r2, r3)
            java.lang.String r3 = "Delete Instance Content"
            r0.<init>(r1, r3)
            r0.start()
            return
    }

    private void deleteFileOrDirectory(java.io.File r5) throws java.io.IOException {
            r4 = this;
            boolean r0 = r5.exists()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r5.isDirectory()
            if (r0 == 0) goto L1f
            java.io.File[] r0 = r5.listFiles()
            if (r0 == 0) goto L1f
            int r1 = r0.length
            r2 = 0
        L15:
            if (r2 >= r1) goto L1f
            r3 = r0[r2]
            r4.deleteFileOrDirectory(r3)
            int r2 = r2 + 1
            goto L15
        L1f:
            boolean r0 = r5.delete()
            if (r0 != 0) goto L45
            boolean r0 = r5.exists()
            if (r0 != 0) goto L2c
            goto L45
        L2c:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to delete: "
            r1.<init>(r2)
            java.lang.String r5 = r5.getAbsolutePath()
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        L45:
            return
    }

    private void deleteInstance() {
            r3 = this;
            r0 = 1
            r3.setDeleteInProgress(r0)
            java.lang.Thread r0 = new java.lang.Thread
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda112 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda112
            r1.<init>(r3)
            java.lang.String r2 = "Delete Instance From Details"
            r0.<init>(r1, r2)
            r0.start()
            return
    }

    private void dismissUpdateProgressDialog() {
            r2 = this;
            android.app.AlertDialog r0 = r2.updateProgressDialog
            r1 = 0
            if (r0 == 0) goto La
            r0.dismiss()
            r2.updateProgressDialog = r1
        La:
            r2.updateProgressMessage = r1
            r2.updateProgressBar = r1
            android.view.Window r0 = r2.getWindow()
            r1 = 128(0x80, float:1.8E-43)
            r0.clearFlags(r1)
            return
    }

    private java.lang.String displayLoader(java.lang.String r5) {
            r4 = this;
            if (r5 == 0) goto L2f
            java.lang.String r0 = r5.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto L2f
        Ld:
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
        L2f:
            java.lang.String r5 = "Vanilla"
            return r5
    }

    private java.lang.String displayVersionType(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = "Release"
            if (r6 == 0) goto L7e
            java.lang.String r1 = r6.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L10
            goto L7e
        L10:
            r6.hashCode()
            int r1 = r6.hashCode()
            r2 = 0
            r3 = 1
            r4 = -1
            switch(r1) {
                case 198238472: goto L3f;
                case 284874180: goto L34;
                case 1090594823: goto L29;
                case 1849706822: goto L1e;
                default: goto L1d;
            }
        L1d:
            goto L49
        L1e:
            java.lang.String r1 = "old_alpha"
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L27
            goto L49
        L27:
            r4 = 3
            goto L49
        L29:
            java.lang.String r1 = "release"
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L32
            goto L49
        L32:
            r4 = 2
            goto L49
        L34:
            java.lang.String r1 = "snapshot"
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L3d
            goto L49
        L3d:
            r4 = r3
            goto L49
        L3f:
            java.lang.String r1 = "old_beta"
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L48
            goto L49
        L48:
            r4 = r2
        L49:
            switch(r4) {
                case 0: goto L7b;
                case 1: goto L78;
                case 2: goto L77;
                case 3: goto L74;
                default: goto L4c;
            }
        L4c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r6.substring(r2, r3)
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r1 = r1.toUpperCase(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r6 = r6.substring(r3)
            r1 = 95
            r2 = 32
            java.lang.String r6 = r6.replace(r1, r2)
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r6 = r6.toString()
            return r6
        L74:
            java.lang.String r6 = "Alpha"
            return r6
        L77:
            return r0
        L78:
            java.lang.String r6 = "Snapshot"
            return r6
        L7b:
            java.lang.String r6 = "Beta"
            return r6
        L7e:
            return r0
    }

    private android.graphics.Bitmap downloadAndCacheBitmap(java.lang.String r9, java.io.File r10, java.lang.String r11) {
            r8 = this;
            java.lang.String r0 = "InstanceDetails"
            java.lang.String r1 = "HTTP "
            java.lang.String r9 = r8.normalizeIconUrl(r9)
            boolean r2 = r8.isBlank(r9)
            r3 = 0
            if (r2 == 0) goto L10
            return r3
        L10:
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> Lea
            r2.<init>(r9)     // Catch: java.lang.Throwable -> Lea
            java.net.URLConnection r9 = r2.openConnection()     // Catch: java.lang.Throwable -> Lea
            java.net.HttpURLConnection r9 = (java.net.HttpURLConnection) r9     // Catch: java.lang.Throwable -> Lea
            r2 = 12000(0x2ee0, float:1.6816E-41)
            r9.setConnectTimeout(r2)     // Catch: java.lang.Throwable -> Le8
            r9.setReadTimeout(r2)     // Catch: java.lang.Throwable -> Le8
            java.lang.String r2 = "User-Agent"
            java.lang.String r4 = "JavaLauncher"
            r9.setRequestProperty(r2, r4)     // Catch: java.lang.Throwable -> Le8
            boolean r2 = r8.isBlank(r11)     // Catch: java.lang.Throwable -> Le8
            if (r2 != 0) goto L39
            java.lang.String r2 = "x-api-key"
            java.lang.String r11 = r11.trim()     // Catch: java.lang.Throwable -> Le8
            r9.setRequestProperty(r2, r11)     // Catch: java.lang.Throwable -> Le8
        L39:
            int r11 = r9.getResponseCode()     // Catch: java.lang.Throwable -> Le8
            r2 = 200(0xc8, float:2.8E-43)
            if (r11 < r2) goto Ld5
            r2 = 300(0x12c, float:4.2E-43)
            if (r11 >= r2) goto Ld5
            java.io.ByteArrayOutputStream r11 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> Le8
            r11.<init>()     // Catch: java.lang.Throwable -> Le8
            java.io.InputStream r1 = r9.getInputStream()     // Catch: java.lang.Throwable -> Le8
            r2 = 32768(0x8000, float:4.5918E-41)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> Lc9
            r4 = 0
            r5 = r4
        L55:
            int r6 = r1.read(r2)     // Catch: java.lang.Throwable -> Lc9
            r7 = -1
            if (r6 == r7) goto L6d
            int r5 = r5 + r6
            r7 = 4194304(0x400000, float:5.877472E-39)
            if (r5 > r7) goto L65
            r11.write(r2, r4, r6)     // Catch: java.lang.Throwable -> Lc9
            goto L55
        L65:
            java.io.IOException r10 = new java.io.IOException     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r11 = "Icon is too large"
            r10.<init>(r11)     // Catch: java.lang.Throwable -> Lc9
            throw r10     // Catch: java.lang.Throwable -> Lc9
        L6d:
            if (r1 == 0) goto L72
            r1.close()     // Catch: java.lang.Throwable -> Le8
        L72:
            byte[] r11 = r11.toByteArray()     // Catch: java.lang.Throwable -> Le8
            int r1 = r11.length     // Catch: java.lang.Throwable -> Le8
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeByteArray(r11, r4, r1)     // Catch: java.lang.Throwable -> Le8
            if (r1 != 0) goto L83
            if (r9 == 0) goto L82
            r9.disconnect()
        L82:
            return r3
        L83:
            java.io.File r2 = r10.getParentFile()     // Catch: java.lang.Throwable -> Le8
            if (r2 == 0) goto L92
            boolean r4 = r2.exists()     // Catch: java.lang.Throwable -> Le8
            if (r4 != 0) goto L92
            r2.mkdirs()     // Catch: java.lang.Throwable -> Le8
        L92:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> La8
            r2.<init>(r10)     // Catch: java.lang.Throwable -> La8
            r2.write(r11)     // Catch: java.lang.Throwable -> L9e
            r2.close()     // Catch: java.lang.Throwable -> La8
            goto Lc3
        L9e:
            r10 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> La3
            goto La7
        La3:
            r11 = move-exception
            r10.addSuppressed(r11)     // Catch: java.lang.Throwable -> La8
        La7:
            throw r10     // Catch: java.lang.Throwable -> La8
        La8:
            r10 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le8
            r11.<init>()     // Catch: java.lang.Throwable -> Le8
            java.lang.String r2 = "Unable to cache installed content icon: "
            java.lang.StringBuilder r11 = r11.append(r2)     // Catch: java.lang.Throwable -> Le8
            java.lang.String r10 = r10.getMessage()     // Catch: java.lang.Throwable -> Le8
            java.lang.StringBuilder r10 = r11.append(r10)     // Catch: java.lang.Throwable -> Le8
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> Le8
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r10)     // Catch: java.lang.Throwable -> Le8
        Lc3:
            if (r9 == 0) goto Lc8
            r9.disconnect()
        Lc8:
            return r1
        Lc9:
            r10 = move-exception
            if (r1 == 0) goto Ld4
            r1.close()     // Catch: java.lang.Throwable -> Ld0
            goto Ld4
        Ld0:
            r11 = move-exception
            r10.addSuppressed(r11)     // Catch: java.lang.Throwable -> Le8
        Ld4:
            throw r10     // Catch: java.lang.Throwable -> Le8
        Ld5:
            java.io.IOException r10 = new java.io.IOException     // Catch: java.lang.Throwable -> Le8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le8
            r2.<init>(r1)     // Catch: java.lang.Throwable -> Le8
            java.lang.StringBuilder r11 = r2.append(r11)     // Catch: java.lang.Throwable -> Le8
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> Le8
            r10.<init>(r11)     // Catch: java.lang.Throwable -> Le8
            throw r10     // Catch: java.lang.Throwable -> Le8
        Le8:
            r10 = move-exception
            goto Lec
        Lea:
            r10 = move-exception
            r9 = r3
        Lec:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10c
            r11.<init>()     // Catch: java.lang.Throwable -> L10c
            java.lang.String r1 = "Unable to download installed content icon: "
            java.lang.StringBuilder r11 = r11.append(r1)     // Catch: java.lang.Throwable -> L10c
            java.lang.String r10 = r8.readableError(r10)     // Catch: java.lang.Throwable -> L10c
            java.lang.StringBuilder r10 = r11.append(r10)     // Catch: java.lang.Throwable -> L10c
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L10c
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r10)     // Catch: java.lang.Throwable -> L10c
            if (r9 == 0) goto L10b
            r9.disconnect()
        L10b:
            return r3
        L10c:
            r10 = move-exception
            if (r9 == 0) goto L112
            r9.disconnect()
        L112:
            throw r10
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

    private void enableFullscreen() {
            r1 = this;
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r1)
            android.view.Window r0 = r1.getWindow()
            r1.applyFullscreenToWindow(r0)
            return
    }

    private void ensureContentLoadingOverlay() {
            r10 = this;
            android.view.View r0 = r10.contentLoadingOverlay
            if (r0 == 0) goto L5
            return
        L5:
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r10)
            r1 = 8
            r0.setVisibility(r1)
            r1 = 1
            r0.setClickable(r1)
            r0.setFocusable(r1)
            r2 = 24
            int r3 = r10.dp(r2)
            int r4 = r10.dp(r2)
            int r5 = r10.dp(r2)
            int r6 = r10.dp(r2)
            r0.setPadding(r3, r4, r5, r6)
            r3 = -1728053248(0xffffffff99000000, float:-6.617445E-24)
            r0.setBackgroundColor(r3)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r10)
            r3.setOrientation(r1)
            r3.setGravity(r1)
            r4 = 26
            int r5 = r10.dp(r4)
            r6 = 22
            int r7 = r10.dp(r6)
            int r4 = r10.dp(r4)
            int r6 = r10.dp(r6)
            r3.setPadding(r5, r7, r4, r6)
            android.graphics.drawable.GradientDrawable r4 = new android.graphics.drawable.GradientDrawable
            r4.<init>()
            r5 = 16842801(0x1010031, float:2.3693695E-38)
            r6 = -14670805(0xffffffffff20242b, float:-2.1286427E38)
            int r5 = r10.resolveThemeColor(r5, r6)
            r4.setColor(r5)
            int r2 = r10.dp(r2)
            float r2 = (float) r2
            r4.setCornerRadius(r2)
            r3.setBackground(r4)
            android.widget.ProgressBar r2 = new android.widget.ProgressBar
            r2.<init>(r10)
            r2.setIndeterminate(r1)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = 44
            int r6 = r10.dp(r5)
            int r5 = r10.dp(r5)
            r4.<init>(r6, r5)
            r3.addView(r2, r4)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r10)
            r10.contentLoadingTitle = r2
            r4 = 1099956224(0x41900000, float:18.0)
            r5 = 2
            r2.setTextSize(r5, r4)
            android.widget.TextView r2 = r10.contentLoadingTitle
            android.graphics.Typeface r4 = r2.getTypeface()
            r2.setTypeface(r4, r1)
            android.widget.TextView r1 = r10.contentLoadingTitle
            r2 = 16842806(0x1010036, float:2.369371E-38)
            r4 = -1
            int r2 = r10.resolveThemeColor(r2, r4)
            r1.setTextColor(r2)
            android.widget.TextView r1 = r10.contentLoadingTitle
            r2 = 17
            r1.setGravity(r2)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r6 = -2
            r1.<init>(r4, r6)
            r7 = 12
            int r7 = r10.dp(r7)
            r1.topMargin = r7
            android.widget.TextView r7 = r10.contentLoadingTitle
            r3.addView(r7, r1)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r10)
            r10.contentLoadingMessage = r1
            r7 = 1095761920(0x41500000, float:13.0)
            r1.setTextSize(r5, r7)
            android.widget.TextView r1 = r10.contentLoadingMessage
            r5 = 16842808(0x1010038, float:2.3693715E-38)
            r7 = -3355444(0xffffffffffcccccc, float:NaN)
            int r5 = r10.resolveThemeColor(r5, r7)
            r1.setTextColor(r5)
            android.widget.TextView r1 = r10.contentLoadingMessage
            r1.setGravity(r2)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r4, r6)
            r5 = 6
            int r5 = r10.dp(r5)
            r1.topMargin = r5
            android.widget.TextView r5 = r10.contentLoadingMessage
            r3.addView(r5, r1)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r5 = 360(0x168, float:5.04E-43)
            int r5 = r10.dp(r5)
            r7 = 260(0x104, float:3.64E-43)
            int r7 = r10.dp(r7)
            android.content.res.Resources r8 = r10.getResources()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            int r8 = r8.widthPixels
            r9 = 72
            int r9 = r10.dp(r9)
            int r8 = r8 - r9
            int r7 = java.lang.Math.max(r7, r8)
            int r5 = java.lang.Math.min(r5, r7)
            r1.<init>(r5, r6, r2)
            r0.addView(r3, r1)
            android.view.Window r1 = r10.getWindow()
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r2.<init>(r4, r4)
            r1.addContentView(r0, r2)
            r10.contentLoadingOverlay = r0
            return
    }

    private boolean entryMatchesProject(org.json.JSONObject r4, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r5, ca.dnamobile.javalauncher.modmanager.ModManagerSource r6, java.lang.String r7) {
            r3 = this;
            java.lang.String r0 = "type"
            java.lang.String r1 = ""
            java.lang.String r0 = r4.optString(r0, r1)
            java.lang.String r1 = "contentType"
            java.lang.String r0 = r4.optString(r1, r0)
            boolean r1 = r3.isBlank(r0)
            r2 = 0
            if (r1 != 0) goto L20
            java.lang.String r5 = r5.getIntentValue()
            boolean r5 = r5.equalsIgnoreCase(r0)
            if (r5 != 0) goto L20
            return r2
        L20:
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r5 = ca.dnamobile.javalauncher.modmanager.ModManagerManifest.getSource(r4)
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.UNKNOWN
            if (r5 == r0) goto L2b
            if (r5 == r6) goto L2b
            return r2
        L2b:
            java.lang.String r4 = r3.getProjectIdFromEntry(r4)
            boolean r5 = r3.isBlank(r7)
            if (r5 != 0) goto L3c
            boolean r4 = r7.equalsIgnoreCase(r4)
            if (r4 == 0) goto L3c
            r2 = 1
        L3c:
            return r2
    }

    private void exportModpackToUri(android.net.Uri r7, ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform r8, ca.dnamobile.javalauncher.modmanager.ModpackExportManager.ExportOptions r9) {
            r6 = this;
            r4 = 100
            r5 = 0
            java.lang.String r1 = "Export Modpack"
            java.lang.String r2 = "Preparing export..."
            r3 = 0
            r0 = r6
            r0.showUpdateProgressDialog(r1, r2, r3, r4, r5)
            java.lang.Thread r0 = new java.lang.Thread
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda93 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda93
            r1.<init>(r6, r8, r7, r9)
            java.lang.String r7 = "Export Modpack"
            r0.<init>(r1, r7)
            r0.start()
            return
    }

    private void exportWorldToUri(android.net.Uri r7, java.io.File r8) {
            r6 = this;
            r4 = 100
            r5 = 0
            java.lang.String r1 = "Export World"
            java.lang.String r2 = "Preparing world export..."
            r3 = 0
            r0 = r6
            r0.showUpdateProgressDialog(r1, r2, r3, r4, r5)
            java.lang.Thread r0 = new java.lang.Thread
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda98 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda98
            r1.<init>(r6, r8, r7)
            java.lang.String r7 = "Export World"
            r0.<init>(r1, r7)
            r0.start()
            return
    }

    private java.lang.String extractJsonIconString(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "icon"
            java.lang.String r0 = r3.extractJsonString(r4, r0)
            boolean r1 = r3.isBlank(r0)
            if (r1 != 0) goto Ld
            return r0
        Ld:
            r0 = 0
            if (r4 != 0) goto L11
            return r0
        L11:
            java.lang.String r1 = "\\\"icon\\\"\\s*:\\s*\\{([^}]+)\\}"
            r2 = 32
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1, r2)
            java.util.regex.Matcher r4 = r1.matcher(r4)
            boolean r1 = r4.find()
            if (r1 != 0) goto L24
            return r0
        L24:
            java.lang.String r1 = "\\\"[^\\\"]+\\\"\\s*:\\s*\\\"([^\\\"]+\\.(?:png|jpg|jpeg|webp))\\\""
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            r2 = 1
            java.lang.String r4 = r4.group(r2)
            java.util.regex.Matcher r4 = r1.matcher(r4)
            boolean r1 = r4.find()
            if (r1 == 0) goto L3d
            java.lang.String r0 = r4.group(r2)
        L3d:
            return r0
    }

    private java.lang.String extractJsonString(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "\\\""
            r1.<init>(r2)
            java.lang.String r5 = java.util.regex.Pattern.quote(r5)
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r1 = "\\\"\\s*:\\s*\\\"([^\\\"]+)\\\""
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.util.regex.Matcher r4 = r5.matcher(r4)
            boolean r5 = r4.find()
            if (r5 == 0) goto L30
            r5 = 1
            java.lang.String r0 = r4.group(r5)
        L30:
            return r0
    }

    private java.lang.String extractTomlString(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "(?m)^\\s*"
            r1.<init>(r2)
            java.lang.String r5 = java.util.regex.Pattern.quote(r5)
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r1 = "\\s*=\\s*(?:\"([^\"]+)\"|'([^']+)')"
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.util.regex.Matcher r4 = r5.matcher(r4)
            boolean r5 = r4.find()
            if (r5 != 0) goto L2c
            return r0
        L2c:
            r5 = 1
            java.lang.String r5 = r4.group(r5)
            r0 = 2
            java.lang.String r4 = r4.group(r0)
            boolean r0 = r3.isBlank(r5)
            if (r0 != 0) goto L3d
            goto L3e
        L3d:
            r5 = r4
        L3e:
            return r5
    }

    private void extractWorldZip(java.io.File r8, java.io.File r9, java.lang.String r10) throws java.lang.Exception {
            r7 = this;
            java.lang.String r0 = r9.getCanonicalPath()
            boolean r1 = r9.exists()
            if (r1 != 0) goto L2a
            boolean r1 = r9.mkdirs()
            if (r1 == 0) goto L11
            goto L2a
        L11:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Unable to create world folder: "
            r10.<init>(r0)
            java.lang.String r9 = r9.getAbsolutePath()
            java.lang.StringBuilder r9 = r10.append(r9)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L2a:
            if (r10 != 0) goto L2f
            java.lang.String r10 = ""
            goto L33
        L2f:
            java.lang.String r10 = r7.normalizeZipPath(r10)
        L33:
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile
            r1.<init>(r8)
            java.util.Enumeration r8 = r1.entries()     // Catch: java.lang.Throwable -> L127
        L3c:
            boolean r2 = r8.hasMoreElements()     // Catch: java.lang.Throwable -> L127
            if (r2 == 0) goto L123
            java.lang.Object r2 = r8.nextElement()     // Catch: java.lang.Throwable -> L127
            java.util.zip.ZipEntry r2 = (java.util.zip.ZipEntry) r2     // Catch: java.lang.Throwable -> L127
            boolean r3 = r2.isDirectory()     // Catch: java.lang.Throwable -> L127
            if (r3 == 0) goto L4f
            goto L3c
        L4f:
            java.lang.String r3 = r2.getName()     // Catch: java.lang.Throwable -> L127
            java.lang.String r3 = r7.normalizeZipPath(r3)     // Catch: java.lang.Throwable -> L127
            boolean r4 = r10.isEmpty()     // Catch: java.lang.Throwable -> L127
            if (r4 != 0) goto L6c
            boolean r4 = r3.startsWith(r10)     // Catch: java.lang.Throwable -> L127
            if (r4 != 0) goto L64
            goto L3c
        L64:
            int r4 = r10.length()     // Catch: java.lang.Throwable -> L127
            java.lang.String r3 = r3.substring(r4)     // Catch: java.lang.Throwable -> L127
        L6c:
            java.lang.String r4 = "/"
            boolean r4 = r3.startsWith(r4)     // Catch: java.lang.Throwable -> L127
            if (r4 == 0) goto L7a
            r4 = 1
            java.lang.String r3 = r3.substring(r4)     // Catch: java.lang.Throwable -> L127
            goto L6c
        L7a:
            boolean r4 = r7.isBlank(r3)     // Catch: java.lang.Throwable -> L127
            if (r4 == 0) goto L81
            goto L3c
        L81:
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L127
            r4.<init>(r9, r3)     // Catch: java.lang.Throwable -> L127
            java.lang.String r3 = r4.getCanonicalPath()     // Catch: java.lang.Throwable -> L127
            boolean r5 = r3.equals(r0)     // Catch: java.lang.Throwable -> L127
            if (r5 != 0) goto Lc7
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L127
            r5.<init>()     // Catch: java.lang.Throwable -> L127
            java.lang.StringBuilder r5 = r5.append(r0)     // Catch: java.lang.Throwable -> L127
            java.lang.String r6 = java.io.File.separator     // Catch: java.lang.Throwable -> L127
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L127
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L127
            boolean r3 = r3.startsWith(r5)     // Catch: java.lang.Throwable -> L127
            if (r3 == 0) goto Laa
            goto Lc7
        Laa:
            java.lang.SecurityException r8 = new java.lang.SecurityException     // Catch: java.lang.Throwable -> L127
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L127
            r9.<init>()     // Catch: java.lang.Throwable -> L127
            java.lang.String r10 = "Blocked unsafe zip entry: "
            java.lang.StringBuilder r9 = r9.append(r10)     // Catch: java.lang.Throwable -> L127
            java.lang.String r10 = r2.getName()     // Catch: java.lang.Throwable -> L127
            java.lang.StringBuilder r9 = r9.append(r10)     // Catch: java.lang.Throwable -> L127
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L127
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L127
            throw r8     // Catch: java.lang.Throwable -> L127
        Lc7:
            java.io.File r3 = r4.getParentFile()     // Catch: java.lang.Throwable -> L127
            if (r3 == 0) goto Lf7
            boolean r5 = r3.exists()     // Catch: java.lang.Throwable -> L127
            if (r5 != 0) goto Lf7
            boolean r5 = r3.mkdirs()     // Catch: java.lang.Throwable -> L127
            if (r5 == 0) goto Lda
            goto Lf7
        Lda:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L127
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L127
            r9.<init>()     // Catch: java.lang.Throwable -> L127
            java.lang.String r10 = "Unable to create folder: "
            java.lang.StringBuilder r9 = r9.append(r10)     // Catch: java.lang.Throwable -> L127
            java.lang.String r10 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L127
            java.lang.StringBuilder r9 = r9.append(r10)     // Catch: java.lang.Throwable -> L127
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L127
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L127
            throw r8     // Catch: java.lang.Throwable -> L127
        Lf7:
            java.io.InputStream r2 = r1.getInputStream(r2)     // Catch: java.lang.Throwable -> L127
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L117
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L117
            r7.copyStream(r2, r3)     // Catch: java.lang.Throwable -> L10d
            r3.close()     // Catch: java.lang.Throwable -> L117
            if (r2 == 0) goto L3c
            r2.close()     // Catch: java.lang.Throwable -> L127
            goto L3c
        L10d:
            r8 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L112
            goto L116
        L112:
            r9 = move-exception
            r8.addSuppressed(r9)     // Catch: java.lang.Throwable -> L117
        L116:
            throw r8     // Catch: java.lang.Throwable -> L117
        L117:
            r8 = move-exception
            if (r2 == 0) goto L122
            r2.close()     // Catch: java.lang.Throwable -> L11e
            goto L122
        L11e:
            r9 = move-exception
            r8.addSuppressed(r9)     // Catch: java.lang.Throwable -> L127
        L122:
            throw r8     // Catch: java.lang.Throwable -> L127
        L123:
            r1.close()
            return
        L127:
            r8 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L12c
            goto L130
        L12c:
            r9 = move-exception
            r8.addSuppressed(r9)
        L130:
            throw r8
    }

    private java.lang.String fetchCurseForgeProjectIconUrl(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "https://api.curseforge.com/v1/mods/"
            java.lang.String r2 = ca.dnamobile.javalauncher.modmanager.CurseForgeApiKeyProvider.resolve()     // Catch: java.lang.Throwable -> L59
            boolean r3 = r5.isBlank(r2)     // Catch: java.lang.Throwable -> L59
            if (r3 == 0) goto Lf
            return r0
        Lf:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L59
            java.lang.String r1 = android.net.Uri.encode(r6)     // Catch: java.lang.Throwable -> L59
            java.lang.StringBuilder r1 = r3.append(r1)     // Catch: java.lang.Throwable -> L59
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L59
            java.lang.String r1 = r5.readNetworkText(r1, r2)     // Catch: java.lang.Throwable -> L59
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L59
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L59
            java.lang.String r1 = "data"
            org.json.JSONObject r1 = r2.optJSONObject(r1)     // Catch: java.lang.Throwable -> L59
            if (r1 != 0) goto L32
            return r0
        L32:
            java.lang.String r2 = "logo"
            org.json.JSONObject r1 = r1.optJSONObject(r2)     // Catch: java.lang.Throwable -> L59
            if (r1 != 0) goto L3b
            return r0
        L3b:
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L59
            java.lang.String r3 = "thumbnailUrl"
            java.lang.String r3 = r1.optString(r3, r0)     // Catch: java.lang.Throwable -> L59
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Throwable -> L59
            java.lang.String r3 = "url"
            java.lang.String r1 = r1.optString(r3, r0)     // Catch: java.lang.Throwable -> L59
            r3 = 1
            r2[r3] = r1     // Catch: java.lang.Throwable -> L59
            java.lang.String r1 = r5.firstNonBlank(r2)     // Catch: java.lang.Throwable -> L59
            java.lang.String r6 = r5.normalizeIconUrl(r1)     // Catch: java.lang.Throwable -> L59
            return r6
        L59:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to resolve CurseForge project icon for "
            r2.<init>(r3)
            java.lang.StringBuilder r6 = r2.append(r6)
            java.lang.String r2 = ": "
            java.lang.StringBuilder r6 = r6.append(r2)
            java.lang.String r1 = r5.readableError(r1)
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.String r1 = "InstanceDetails"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r6)
            return r0
    }

    private java.lang.String fetchModrinthProjectIconUrl(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "https://api.modrinth.com/v2/project/"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = android.net.Uri.encode(r5)     // Catch: java.lang.Throwable -> L2a
            java.lang.StringBuilder r1 = r2.append(r1)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2a
            r2 = 0
            java.lang.String r1 = r4.readNetworkText(r1, r2)     // Catch: java.lang.Throwable -> L2a
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = "icon_url"
            java.lang.String r1 = r2.optString(r1, r0)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r5 = r4.normalizeIconUrl(r1)     // Catch: java.lang.Throwable -> L2a
            return r5
        L2a:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to resolve Modrinth project icon for "
            r2.<init>(r3)
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r2 = ": "
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.String r1 = r4.readableError(r1)
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r1 = "InstanceDetails"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r5)
            return r0
    }

    private java.lang.String filePathOrNull(java.io.File r1) {
            r0 = this;
            if (r1 != 0) goto L5
            java.lang.String r1 = "null"
            goto L9
        L5:
            java.lang.String r1 = r1.getAbsolutePath()
        L9:
            return r1
    }

    private int finalizeContentUpdateCleanup(java.util.List<ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateCleanupPlan> r6) {
            r5 = this;
            java.io.File r0 = r5.gameDirectory
            r1 = 0
            if (r0 == 0) goto L5f
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto Lc
            goto L5f
        Lc:
            java.util.Iterator r6 = r6.iterator()
        L10:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L5f
            java.lang.Object r0 = r6.next()
            ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateCleanupPlan r0 = (ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateCleanupPlan) r0
            java.io.File r2 = r5.findReplacementFileForUpdate(r0)     // Catch: java.lang.Throwable -> L39
            org.json.JSONObject r3 = r5.findReplacementEntryForUpdate(r0, r2)     // Catch: java.lang.Throwable -> L39
            int r4 = r5.removeOldFilesForUpdate(r0, r2)     // Catch: java.lang.Throwable -> L39
            int r1 = r1 + r4
            int r4 = r5.removeDuplicateTrackedFilesForProject(r0, r2)     // Catch: java.lang.Throwable -> L39
            int r1 = r1 + r4
            r5.syncModpackFilesManifestAfterUpdate(r0, r2, r3)     // Catch: java.lang.Throwable -> L39
            java.io.File r2 = r5.gameDirectory     // Catch: java.lang.Throwable -> L39
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r3 = r0.contentType     // Catch: java.lang.Throwable -> L39
            ca.dnamobile.javalauncher.modmanager.ModManagerManifest.pruneMissingFiles(r2, r3)     // Catch: java.lang.Throwable -> L39
            goto L10
        L39:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Unable to finish update cleanup for "
            r3.<init>(r4)
            java.lang.String r0 = r0.key
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = ": "
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r2 = r5.readableError(r2)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "InstanceDetails"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r0)
            goto L10
        L5f:
            return r1
    }

    private java.io.File findBestReplacementFileFromEntries(ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateCleanupPlan r4, java.util.ArrayList<org.json.JSONObject> r5) {
            r3 = this;
            java.util.Iterator r5 = r5.iterator()
        L4:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r5.next()
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = r4.contentType
            java.io.File r0 = r3.resolveFileForInstalledEntry(r0, r1)
            if (r0 == 0) goto L4
            boolean r1 = r0.isFile()
            if (r1 != 0) goto L1f
            goto L4
        L1f:
            java.util.HashSet<java.lang.String> r1 = r4.oldCanonicalPaths
            java.lang.String r2 = r3.safeCanonicalPath(r0)
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L4
            return r0
        L2c:
            r4 = 0
            return r4
    }

    private int findContentItemIndexByCanonicalPath(java.lang.String r2) {
            r1 = this;
            java.util.ArrayList<ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem> r0 = r1.contentItems
            int r2 = r1.findContentItemIndexByCanonicalPath(r0, r2)
            return r2
    }

    private int findContentItemIndexByCanonicalPath(java.util.ArrayList<ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem> r3, java.lang.String r4) {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r3.size()
            if (r0 >= r1) goto L1d
            java.lang.Object r1 = r3.get(r0)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem r1 = (ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem) r1
            java.io.File r1 = r1.file
            java.lang.String r1 = r2.safeCanonicalPath(r1)
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L1a
            return r0
        L1a:
            int r0 = r0 + 1
            goto L1
        L1d:
            r3 = -1
            return r3
    }

    private org.json.JSONObject findMatchingEntryForFile(java.util.ArrayList<org.json.JSONObject> r4, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r5, java.io.File r6) {
            r3 = this;
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L8
            r4 = 0
            return r4
        L8:
            if (r6 == 0) goto L2f
            java.lang.String r6 = r3.safeCanonicalPath(r6)
            java.util.Iterator r0 = r4.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r0.next()
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            java.io.File r2 = r3.resolveFileForInstalledEntry(r1, r5)
            if (r2 == 0) goto L12
            java.lang.String r2 = r3.safeCanonicalPath(r2)
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L12
            return r1
        L2f:
            r5 = 0
            java.lang.Object r4 = r4.get(r5)
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            return r4
    }

    private java.io.File findNewestNewFileInTargetDirectory(ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateCleanupPlan r11) {
            r10 = this;
            java.io.File r0 = r10.gameDirectory
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = r11.contentType
            java.io.File r2 = r10.gameDirectory
            java.io.File r0 = r0.getTargetDirectory(r2)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda45 r2 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda45
            r2.<init>()
            java.io.File[] r0 = r0.listFiles(r2)
            if (r0 != 0) goto L1a
            return r1
        L1a:
            long r2 = r11.createdAt
            r4 = 2000(0x7d0, double:9.88E-321)
            long r2 = r2 - r4
            int r4 = r0.length
            r5 = 0
        L21:
            if (r5 >= r4) goto L3f
            r6 = r0[r5]
            java.lang.String r7 = r10.safeCanonicalPath(r6)
            java.util.HashSet<java.lang.String> r8 = r11.oldCanonicalPaths
            boolean r7 = r8.contains(r7)
            if (r7 == 0) goto L32
            goto L3c
        L32:
            long r7 = r6.lastModified()
            int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r9 < 0) goto L3c
            r1 = r6
            r2 = r7
        L3c:
            int r5 = r5 + 1
            goto L21
        L3f:
            return r1
    }

    private java.io.File findNewestTrackedProjectFile(ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateCleanupPlan r9) {
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2 = r9.contentType
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r3 = r9.source
            java.lang.String r4 = r9.projectId
            java.util.ArrayList r2 = r8.getInstalledManifestEntriesForProject(r2, r3, r4)
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r3 = r9.contentType
            r8.collectTrackedProjectFilesForCleanup(r0, r1, r2, r3)
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2 = r9.contentType
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r3 = r9.source
            java.lang.String r4 = r9.projectId
            java.util.ArrayList r2 = r8.getModpackInstalledEntriesForProject(r2, r3, r4)
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r3 = r9.contentType
            r8.collectTrackedProjectFilesForCleanup(r0, r1, r2, r3)
            ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager$UpdateCandidate r9 = r9.candidate
            java.lang.String r9 = r8.resolveLatestFileName(r9)
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = -9223372036854775808
        L35:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L68
            java.lang.Object r4 = r0.next()
            java.io.File r4 = (java.io.File) r4
            if (r4 == 0) goto L35
            boolean r5 = r4.isFile()
            if (r5 != 0) goto L4a
            goto L35
        L4a:
            boolean r5 = r8.isBlank(r9)
            if (r5 != 0) goto L5b
            java.lang.String r5 = r4.getName()
            boolean r5 = r5.equalsIgnoreCase(r9)
            if (r5 == 0) goto L5b
            return r4
        L5b:
            long r5 = r4.lastModified()
            if (r1 == 0) goto L65
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 <= 0) goto L35
        L65:
            r1 = r4
            r2 = r5
            goto L35
        L68:
            return r1
    }

    private org.json.JSONObject findReplacementEntryForUpdate(ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateCleanupPlan r4, java.io.File r5) {
            r3 = this;
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = r4.contentType
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r1 = r4.source
            java.lang.String r2 = r4.projectId
            java.util.ArrayList r0 = r3.getInstalledManifestEntriesForProject(r0, r1, r2)
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = r4.contentType
            org.json.JSONObject r0 = r3.findMatchingEntryForFile(r0, r1, r5)
            if (r0 == 0) goto L13
            return r0
        L13:
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = r4.contentType
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r1 = r4.source
            java.lang.String r2 = r4.projectId
            java.util.ArrayList r0 = r3.getModpackInstalledEntriesForProject(r0, r1, r2)
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = r4.contentType
            org.json.JSONObject r0 = r3.findMatchingEntryForFile(r0, r1, r5)
            if (r0 == 0) goto L26
            return r0
        L26:
            if (r5 == 0) goto L33
            boolean r0 = r5.isFile()
            if (r0 == 0) goto L33
            org.json.JSONObject r4 = r3.buildFallbackUpdatedEntry(r4, r5)
            return r4
        L33:
            r4 = 0
            return r4
    }

    private java.io.File findReplacementFileForUpdate(ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateCleanupPlan r5) {
            r4 = this;
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = r5.contentType
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r1 = r5.source
            java.lang.String r2 = r5.projectId
            java.util.ArrayList r0 = r4.getInstalledManifestEntriesForProject(r0, r1, r2)
            java.io.File r0 = r4.findBestReplacementFileFromEntries(r5, r0)
            if (r0 == 0) goto L11
            return r0
        L11:
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = r5.contentType
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r1 = r5.source
            java.lang.String r2 = r5.projectId
            java.util.ArrayList r0 = r4.getModpackInstalledEntriesForProject(r0, r1, r2)
            java.io.File r0 = r4.findBestReplacementFileFromEntries(r5, r0)
            if (r0 == 0) goto L22
            return r0
        L22:
            ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager$UpdateCandidate r0 = r5.candidate
            java.lang.String r0 = r4.resolveLatestFileName(r0)
            boolean r1 = r4.isBlank(r0)
            if (r1 != 0) goto L65
            java.io.File r1 = r4.gameDirectory
            if (r1 == 0) goto L65
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = r5.contentType
            java.io.File r2 = r4.gameDirectory
            java.io.File r1 = r1.getTargetDirectory(r2)
            java.io.File r2 = new java.io.File
            r2.<init>(r1, r0)
            boolean r3 = r2.isFile()
            if (r3 == 0) goto L46
            return r2
        L46:
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = ".disabled"
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.<init>(r1, r0)
            boolean r0 = r2.isFile()
            if (r0 == 0) goto L65
            return r2
        L65:
            java.io.File r5 = r4.findNewestNewFileInTargetDirectory(r5)
            if (r5 == 0) goto L72
            boolean r0 = r5.isFile()
            if (r0 == 0) goto L72
            goto L73
        L72:
            r5 = 0
        L73:
            return r5
    }

    private java.lang.String findWorldRootPrefix(java.io.File r5) throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = "level.dat"
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile
            r1.<init>(r5)
            java.util.Enumeration r5 = r1.entries()     // Catch: java.lang.Throwable -> L43
        Lb:
            boolean r2 = r5.hasMoreElements()     // Catch: java.lang.Throwable -> L43
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r5.nextElement()     // Catch: java.lang.Throwable -> L43
            java.util.zip.ZipEntry r2 = (java.util.zip.ZipEntry) r2     // Catch: java.lang.Throwable -> L43
            boolean r3 = r2.isDirectory()     // Catch: java.lang.Throwable -> L43
            if (r3 == 0) goto L1e
            goto Lb
        L1e:
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = r4.normalizeZipPath(r2)     // Catch: java.lang.Throwable -> L43
            boolean r3 = r2.endsWith(r0)     // Catch: java.lang.Throwable -> L43
            if (r3 == 0) goto Lb
            int r5 = r2.length()     // Catch: java.lang.Throwable -> L43
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L43
            int r5 = r5 - r0
            r0 = 0
            java.lang.String r5 = r2.substring(r0, r5)     // Catch: java.lang.Throwable -> L43
            r1.close()
            return r5
        L3e:
            r1.close()
            r5 = 0
            return r5
        L43:
            r5 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L48
            goto L4c
        L48:
            r0 = move-exception
            r5.addSuppressed(r0)
        L4c:
            throw r5
    }

    private java.util.zip.ZipEntry findZipEntryBySuffix(java.util.zip.ZipFile r5, java.lang.String r6) {
            r4 = this;
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r6 = r6.toLowerCase(r0)
            java.util.Enumeration r5 = r5.entries()
        La:
            boolean r0 = r5.hasMoreElements()
            if (r0 == 0) goto L47
            java.lang.Object r0 = r5.nextElement()
            java.util.zip.ZipEntry r0 = (java.util.zip.ZipEntry) r0
            boolean r1 = r0.isDirectory()
            if (r1 == 0) goto L1d
            goto La
        L1d:
            java.lang.String r1 = r0.getName()
            java.lang.String r1 = r4.normalizeZipPath(r1)
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r2)
            boolean r2 = r1.equals(r6)
            if (r2 != 0) goto L46
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "/"
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r2 = r2.toString()
            boolean r1 = r1.endsWith(r2)
            if (r1 == 0) goto La
        L46:
            return r0
        L47:
            r5 = 0
            return r5
    }

    private void finishContentSearchInput(android.view.View r1) {
            r0 = this;
            r1.clearFocus()
            r0.hideKeyboardFromView(r1)
            return
    }

    private void finishDeleteAndClose() {
            r2 = this;
            int r0 = ca.dnamobile.javalauncher.R.string.delete_instance_deleted
            java.lang.String r1 = r2.instanceName
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r0 = r2.getString(r0, r1)
            r1 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
            r0 = -1
            r2.setResult(r0)
            r2.finish()
            return
    }

    private void finishDeleteInBackground(ca.dnamobile.javalauncher.instance.LauncherInstanceDeleteManager.DeleteJob r3) {
            r2 = this;
            ca.dnamobile.javalauncher.instance.LauncherInstanceDeleteManager.finishDeletion(r2, r3)     // Catch: java.lang.Throwable -> L4
            goto L1b
        L4:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Instance was hidden but background cleanup failed for "
            r0.<init>(r1)
            java.lang.String r1 = r2.instanceName
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "InstanceDetails"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r0, r3)
        L1b:
            return
    }

    private java.lang.String firstNonBlank(java.lang.String... r7) {
            r6 = this;
            java.lang.String r0 = ""
            if (r7 != 0) goto L5
            return r0
        L5:
            int r1 = r7.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L2b
            r3 = r7[r2]
            if (r3 == 0) goto L28
            java.lang.String r4 = r3.trim()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L28
            java.lang.String r4 = "null"
            java.lang.String r5 = r3.trim()
            boolean r4 = r4.equalsIgnoreCase(r5)
            if (r4 != 0) goto L28
            java.lang.String r7 = r3.trim()
            return r7
        L28:
            int r2 = r2 + 1
            goto L7
        L2b:
            return r0
    }

    private java.lang.String formatFileSize(long r7) {
            r6 = this;
            r0 = 1024(0x400, double:5.06E-321)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 >= 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r7 = r0.append(r7)
            java.lang.String r8 = " B"
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            return r7
        L1a:
            double r7 = (double) r7
            r0 = 4652218415073722368(0x4090000000000000, double:1024.0)
            double r7 = r7 / r0
            r2 = 3
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.String r3 = "KB"
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "MB"
            r5 = 1
            r2[r5] = r3
            java.lang.String r3 = "GB"
            r5 = 2
            r2[r5] = r3
        L30:
            int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r3 < 0) goto L3a
            if (r4 >= r5) goto L3a
            double r7 = r7 / r0
            int r4 = r4 + 1
            goto L30
        L3a:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            r8 = r2[r4]
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r8}
            java.lang.String r8 = "%.1f %s"
            java.lang.String r7 = java.lang.String.format(r0, r8, r7)
            return r7
    }

    private java.lang.String formatGb(int r3) {
            r2 = this;
            java.util.Locale r0 = java.util.Locale.US
            float r3 = (float) r3
            r1 = 1149239296(0x44800000, float:1024.0)
            float r3 = r3 / r1
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r1 = "%.1f"
            java.lang.String r3 = java.lang.String.format(r0, r1, r3)
            return r3
    }

    private java.lang.String formatModpackUpdateRemovedSuffix(int r3) {
            r2 = this;
            if (r3 > 0) goto L5
            java.lang.String r3 = ""
            return r3
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = " · removed "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = " old "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 1
            if (r3 != r1) goto L1c
            java.lang.String r3 = "file"
            goto L1e
        L1c:
            java.lang.String r3 = "files"
        L1e:
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            return r3
    }

    private java.lang.String formatSubtitle(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r5) {
            r4 = this;
            java.io.File r0 = r5.file
            boolean r0 = r0.isDirectory()
            if (r0 == 0) goto L19
            int r0 = ca.dnamobile.javalauncher.R.string.instance_content_folder_subtitle
            java.io.File r1 = r5.file
            java.lang.String r1 = r1.getName()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r0 = r4.getString(r0, r1)
            goto L33
        L19:
            int r0 = ca.dnamobile.javalauncher.R.string.instance_content_file_subtitle
            java.io.File r1 = r5.file
            java.lang.String r1 = r1.getName()
            java.io.File r2 = r5.file
            long r2 = r2.length()
            java.lang.String r2 = r4.formatFileSize(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r0 = r4.getString(r0, r1)
        L33:
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r1 = r5.category
            boolean r1 = r1.supportsDisableToggle
            if (r1 == 0) goto L5e
            java.io.File r5 = r5.file
            boolean r5 = r4.isContentItemEnabled(r5)
            if (r5 != 0) goto L5e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r0 = " · "
            java.lang.StringBuilder r5 = r5.append(r0)
            int r0 = ca.dnamobile.javalauncher.R.string.instance_content_disabled_label
            java.lang.String r0 = r4.getString(r0)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r0 = r5.toString()
        L5e:
            return r0
    }

    private java.lang.String formatUpdateCleanupSuffix(int r3) {
            r2 = this;
            if (r3 > 0) goto L5
            java.lang.String r3 = ""
            return r3
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = " · removed "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = " old "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 1
            if (r3 != r1) goto L1c
            java.lang.String r3 = "file"
            goto L1e
        L1c:
            java.lang.String r3 = "files"
        L1e:
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            return r3
    }

    private java.io.File getDirectoryForCategory(ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory r2) {
            r1 = this;
            int r2 = r2.ordinal()
            if (r2 == 0) goto L1b
            r0 = 1
            if (r2 == r0) goto L18
            r0 = 2
            if (r2 == r0) goto L15
            r0 = 3
            if (r2 == r0) goto L12
            java.io.File r2 = r1.gameDirectory
            return r2
        L12:
            java.io.File r2 = r1.worldsDirectory
            return r2
        L15:
            java.io.File r2 = r1.resourcepacksDirectory
            return r2
        L18:
            java.io.File r2 = r1.shaderpacksDirectory
            return r2
        L1b:
            java.io.File r2 = r1.modsDirectory
            return r2
    }

    private int getDropdownBottomSafePadding() {
            r4 = this;
            android.content.res.Resources r0 = r4.getResources()
            java.lang.String r1 = "dimen"
            java.lang.String r2 = "android"
            java.lang.String r3 = "navigation_bar_height"
            int r0 = r0.getIdentifier(r3, r1, r2)
            if (r0 <= 0) goto L19
            android.content.res.Resources r1 = r4.getResources()
            int r0 = r1.getDimensionPixelSize(r0)
            goto L1a
        L19:
            r0 = 0
        L1a:
            r1 = 16
            int r1 = r4.dp(r1)
            int r0 = java.lang.Math.max(r1, r0)
            return r0
    }

    private java.lang.String getGameVersionIdForContent() {
            r1 = this;
            java.lang.String r0 = r1.minecraftVersionId
            boolean r0 = r1.isBlank(r0)
            if (r0 == 0) goto Lf
            java.lang.String r0 = r1.baseVersionId
            java.lang.String r0 = ca.dnamobile.javalauncher.modmanager.ModManagerVersionResolver.resolveGameVersionForContent(r0)
            goto L11
        Lf:
            java.lang.String r0 = r1.minecraftVersionId
        L11:
            return r0
    }

    private int getImmersiveSystemUiFlags() {
            r1 = this;
            r0 = 5894(0x1706, float:8.259E-42)
            return r0
    }

    private java.io.File getInstalledContentIconCacheFile(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r8, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r9, org.json.JSONObject r10) {
            r7 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = new java.io.File
            java.io.File r2 = r7.gameDirectory
            java.lang.String r3 = ".javalauncher"
            r1.<init>(r2, r3)
            java.lang.String r2 = "content_icons"
            r0.<init>(r1, r2)
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r1 = ca.dnamobile.javalauncher.modmanager.ModManagerManifest.getSource(r10)
            java.lang.String r10 = r7.getProjectIdFromEntry(r10)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 2
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.String r1 = r1.getId()
            r5 = 0
            r4[r5] = r1
            java.lang.String r1 = "unknown"
            r6 = 1
            r4[r6] = r1
            java.lang.String r1 = r7.firstNonBlank(r4)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = "-"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String[] r3 = new java.lang.String[r3]
            r3[r5] = r10
            java.io.File r8 = r8.file
            java.lang.String r8 = r8.getName()
            java.lang.String r8 = r7.stripDisabledSuffix(r8)
            r3[r6] = r8
            java.lang.String r8 = r7.firstNonBlank(r3)
            java.lang.StringBuilder r8 = r1.append(r8)
            java.lang.String r8 = r8.toString()
            java.io.File r10 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r9 = r9.getIntentValue()
            java.lang.StringBuilder r9 = r3.append(r9)
            java.lang.StringBuilder r9 = r9.append(r2)
            java.lang.StringBuilder r8 = r9.append(r8)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r7.sanitizeCacheFileName(r8)
            java.lang.StringBuilder r8 = r1.append(r8)
            java.lang.String r9 = ".png"
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            r10.<init>(r0, r8)
            return r10
    }

    private org.json.JSONObject getInstalledEntryForItem(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r4) {
            r3 = this;
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r0 = r4.category
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = r3.toModManagerContentType(r0)
            if (r0 == 0) goto L1d
            java.io.File r1 = r3.gameDirectory
            if (r1 != 0) goto Ld
            goto L1d
        Ld:
            java.io.File r2 = r4.file
            org.json.JSONObject r1 = ca.dnamobile.javalauncher.modmanager.ModManagerManifest.getInstalledEntryForFile(r1, r0, r2)
            if (r1 == 0) goto L16
            return r1
        L16:
            java.io.File r4 = r4.file
            org.json.JSONObject r4 = r3.getModpackInstalledEntryForFile(r0, r4)
            return r4
        L1d:
            r4 = 0
            return r4
    }

    private java.util.ArrayList<org.json.JSONObject> getInstalledManifestEntriesForProject(ca.dnamobile.javalauncher.modmanager.ModManagerContentType r5, ca.dnamobile.javalauncher.modmanager.ModManagerSource r6, java.lang.String r7) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.io.File r1 = r4.gameDirectory
            if (r1 != 0) goto La
            return r0
        La:
            java.util.ArrayList r1 = ca.dnamobile.javalauncher.modmanager.ModManagerManifest.getInstalledEntries(r1, r5)
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L28
            java.lang.Object r2 = r1.next()
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            boolean r3 = r4.entryMatchesProject(r2, r5, r6, r7)
            if (r3 == 0) goto L12
            r0.add(r2)
            goto L12
        L28:
            return r0
    }

    private ca.dnamobile.javalauncher.modmanager.ModManagerSource getInstalledSourceForItem(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r4) {
            r3 = this;
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r0 = r4.category
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = r3.toModManagerContentType(r0)
            if (r0 == 0) goto L28
            java.io.File r1 = r3.gameDirectory
            if (r1 != 0) goto Ld
            goto L28
        Ld:
            java.io.File r2 = r4.file
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r1 = ca.dnamobile.javalauncher.modmanager.ModManagerManifest.getInstalledSourceForFile(r1, r0, r2)
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r2 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.UNKNOWN
            if (r1 == r2) goto L18
            return r1
        L18:
            java.io.File r4 = r4.file
            org.json.JSONObject r4 = r3.getModpackInstalledEntryForFile(r0, r4)
            if (r4 != 0) goto L23
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r4 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.UNKNOWN
            goto L27
        L23:
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r4 = ca.dnamobile.javalauncher.modmanager.ModManagerManifest.getSource(r4)
        L27:
            return r4
        L28:
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r4 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.UNKNOWN
            return r4
    }

    private java.io.File getModpackFilesManifestFile() {
            r4 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = new java.io.File
            java.io.File r2 = r4.gameDirectory
            java.lang.String r3 = ".javalauncher"
            r1.<init>(r2, r3)
            java.lang.String r2 = "modpack_files_manifest.json"
            r0.<init>(r1, r2)
            return r0
    }

    private java.util.ArrayList<org.json.JSONObject> getModpackInstalledEntriesForProject(ca.dnamobile.javalauncher.modmanager.ModManagerContentType r5, ca.dnamobile.javalauncher.modmanager.ModManagerSource r6, java.lang.String r7) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = r4.getModpackInstalledEntriesForType(r5)
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L23
            java.lang.Object r2 = r1.next()
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            boolean r3 = r4.entryMatchesProject(r2, r5, r6, r7)
            if (r3 == 0) goto Ld
            r0.add(r2)
            goto Ld
        L23:
            return r0
    }

    private java.util.ArrayList<org.json.JSONObject> getModpackInstalledEntriesForType(ca.dnamobile.javalauncher.modmanager.ModManagerContentType r8) {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.io.File r1 = r7.gameDirectory
            if (r1 != 0) goto La
            return r0
        La:
            java.io.File r1 = new java.io.File
            java.io.File r2 = new java.io.File
            java.io.File r3 = r7.gameDirectory
            java.lang.String r4 = ".javalauncher"
            r2.<init>(r3, r4)
            java.lang.String r3 = "modpack_files_manifest.json"
            r1.<init>(r2, r3)
            boolean r2 = r1.isFile()
            if (r2 != 0) goto L21
            return r0
        L21:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L60
            java.lang.String r1 = r7.readTextFile(r1)     // Catch: java.lang.Throwable -> L60
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L60
            java.lang.String r1 = "files"
            org.json.JSONArray r1 = r2.optJSONArray(r1)     // Catch: java.lang.Throwable -> L60
            if (r1 != 0) goto L33
            return r0
        L33:
            java.lang.String r8 = r8.getIntentValue()     // Catch: java.lang.Throwable -> L60
            r2 = 0
        L38:
            int r3 = r1.length()     // Catch: java.lang.Throwable -> L60
            if (r2 >= r3) goto L79
            org.json.JSONObject r3 = r1.optJSONObject(r2)     // Catch: java.lang.Throwable -> L60
            if (r3 != 0) goto L45
            goto L5d
        L45:
            java.lang.String r4 = "contentType"
            java.lang.String r5 = "type"
            java.lang.String r6 = ""
            java.lang.String r5 = r3.optString(r5, r6)     // Catch: java.lang.Throwable -> L60
            java.lang.String r4 = r3.optString(r4, r5)     // Catch: java.lang.Throwable -> L60
            boolean r4 = r8.equalsIgnoreCase(r4)     // Catch: java.lang.Throwable -> L60
            if (r4 != 0) goto L5a
            goto L5d
        L5a:
            r0.add(r3)     // Catch: java.lang.Throwable -> L60
        L5d:
            int r2 = r2 + 1
            goto L38
        L60:
            r8 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to read modpack installed-content metadata: "
            r1.<init>(r2)
            java.lang.String r8 = r7.readableError(r8)
            java.lang.StringBuilder r8 = r1.append(r8)
            java.lang.String r8 = r8.toString()
            java.lang.String r1 = "InstanceDetails"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r8)
        L79:
            return r0
    }

    private org.json.JSONObject getModpackInstalledEntryForFile(ca.dnamobile.javalauncher.modmanager.ModManagerContentType r3, java.io.File r4) {
            r2 = this;
            java.util.ArrayList r3 = r2.getModpackInstalledEntriesForType(r3)
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r3.next()
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            boolean r1 = r2.matchesInstalledContentEntry(r0, r4)
            if (r1 == 0) goto L8
            return r0
        L1b:
            r3 = 0
            return r3
    }

    private java.lang.String getPerInstanceSettingsKey() {
            r2 = this;
            java.lang.String r0 = r2.instanceId
            java.lang.String r1 = r2.instanceName
            java.lang.String r0 = ca.dnamobile.javalauncher.launcher.InstanceLaunchSettings.resolveInstanceKey(r0, r1)
            return r0
    }

    private java.lang.String getProjectIdFromEntry(org.json.JSONObject r4) {
            r3 = this;
            java.lang.String r0 = "platformProjectId"
            java.lang.String r1 = ""
            java.lang.String r0 = r4.optString(r0, r1)
            java.lang.String r0 = r0.trim()
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L1c
            java.lang.String r0 = "projectId"
            java.lang.String r0 = r4.optString(r0, r1)
            java.lang.String r0 = r0.trim()
        L1c:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L2c
            java.lang.String r0 = "modrinthProjectId"
            java.lang.String r0 = r4.optString(r0, r1)
            java.lang.String r0 = r0.trim()
        L2c:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L3c
            java.lang.String r0 = "modrinth_project_id"
            java.lang.String r0 = r4.optString(r0, r1)
            java.lang.String r0 = r0.trim()
        L3c:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L4c
            java.lang.String r0 = "curseForgeProjectId"
            java.lang.String r0 = r4.optString(r0, r1)
            java.lang.String r0 = r0.trim()
        L4c:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L5c
            java.lang.String r0 = "curseforgeProjectId"
            java.lang.String r0 = r4.optString(r0, r1)
            java.lang.String r0 = r0.trim()
        L5c:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L6c
            java.lang.String r0 = "curseForgeProjectID"
            java.lang.String r0 = r4.optString(r0, r1)
            java.lang.String r0 = r0.trim()
        L6c:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L7c
            java.lang.String r0 = "projectID"
            java.lang.String r4 = r4.optString(r0, r1)
            java.lang.String r0 = r4.trim()
        L7c:
            return r0
    }

    private java.lang.String getRelativePathBetweenFiles(java.io.File r4, java.io.File r5) throws java.io.IOException {
            r3 = this;
            java.lang.String r4 = r4.getCanonicalPath()
            java.lang.String r5 = r5.getCanonicalPath()
            boolean r0 = r5.equals(r4)
            java.lang.String r1 = ""
            if (r0 == 0) goto L11
            return r1
        L11:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r2 = java.io.File.separator
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            boolean r0 = r5.startsWith(r0)
            if (r0 == 0) goto L3d
            int r4 = r4.length()
            int r4 = r4 + 1
            java.lang.String r4 = r5.substring(r4)
            char r5 = java.io.File.separatorChar
            r0 = 47
            java.lang.String r4 = r4.replace(r5, r0)
            return r4
        L3d:
            return r1
    }

    private java.lang.String getRelativePathFromDirectory(java.io.File r4, java.io.File r5) throws java.io.IOException {
            r3 = this;
            java.lang.String r4 = r4.getCanonicalPath()
            java.lang.String r0 = r5.getCanonicalPath()
            boolean r1 = r0.equals(r4)
            if (r1 != 0) goto L41
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = java.io.File.separator
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L28
            goto L41
        L28:
            java.lang.SecurityException r4 = new java.lang.SecurityException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Blocked unsafe export path: "
            r0.<init>(r1)
            java.lang.String r5 = r5.getAbsolutePath()
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L41:
            boolean r5 = r0.equals(r4)
            if (r5 == 0) goto L4a
            java.lang.String r4 = ""
            return r4
        L4a:
            int r4 = r4.length()
            int r4 = r4 + 1
            java.lang.String r4 = r0.substring(r4)
            char r5 = java.io.File.separatorChar
            r0 = 47
            java.lang.String r4 = r4.replace(r5, r0)
            return r4
    }

    private java.lang.String getRelativePathFromGameDirectory(java.io.File r5) {
            r4 = this;
            java.io.File r0 = r4.gameDirectory
            if (r0 != 0) goto L9
            java.lang.String r5 = r5.getName()
            return r5
        L9:
            java.lang.String r0 = r4.safeCanonicalPath(r0)
            java.lang.String r1 = r4.safeCanonicalPath(r5)
            boolean r2 = r1.equals(r0)
            if (r2 == 0) goto L1a
            java.lang.String r5 = ""
            return r5
        L1a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r3 = java.io.File.separator
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L46
            int r5 = r0.length()
            int r5 = r5 + 1
            java.lang.String r5 = r1.substring(r5)
            char r0 = java.io.File.separatorChar
            r1 = 47
            java.lang.String r5 = r5.replace(r0, r1)
            return r5
        L46:
            java.lang.String r5 = r5.getName()
            return r5
    }

    private ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind getSupportedLoaderKind() {
            r2 = this;
            java.lang.String r0 = r2.loader
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind r0 = ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.resolveLoaderKind(r0)
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind r1 = ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind.FABRIC
            if (r0 == r1) goto L14
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind r1 = ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind.FORGE
            if (r0 == r1) goto L14
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind r1 = ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind.NEOFORGE
            if (r0 != r1) goto L13
            goto L14
        L13:
            r0 = 0
        L14:
            return r0
    }

    private java.lang.String getUpdateMessageForItem(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.updateMessages
            java.lang.String r2 = r1.buildUpdateKey(r2)
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    private ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState getUpdateStateForItem(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r2) {
            r1 = this;
            java.util.Map<java.lang.String, ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState> r0 = r1.updateStates
            java.lang.String r2 = r1.buildUpdateKey(r2)
            java.lang.Object r2 = r0.get(r2)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState r2 = (ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState) r2
            if (r2 != 0) goto L10
            ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState r2 = ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState.UNKNOWN
        L10:
            return r2
    }

    private void handleInstanceSettingsMenuItem(int r2) {
            r1 = this;
            r1.enableFullscreen()
            r0 = 1
            if (r2 != r0) goto La
            r1.showFolderLocation()
            return
        La:
            r0 = 2
            if (r2 != r0) goto L11
            r1.showDeleteInstanceDialog()
            return
        L11:
            r0 = 3
            if (r2 != r0) goto L18
            r1.showEditInstanceNameDialog()
            return
        L18:
            r0 = 4
            if (r2 != r0) goto L1f
            r1.pickInstanceIcon()
            return
        L1f:
            r0 = 6
            if (r2 != r0) goto L26
            r1.showUpdateVersionDialog()
            return
        L26:
            r0 = 11
            if (r2 != r0) goto L2e
            r1.showUpdateModpackDialog()
            return
        L2e:
            r0 = 7
            if (r2 != r0) goto L35
            r1.showUpdateLoaderDialog()
            return
        L35:
            r0 = 5
            if (r2 != r0) goto L3c
            r1.showExportModpackPlatformDialog()
            return
        L3c:
            r0 = 8
            if (r2 != r0) goto L44
            r1.openModpackImportPicker()
            return
        L44:
            r0 = 10
            if (r2 != r0) goto L4c
            r1.showRepairInstanceDialog()
            return
        L4c:
            r0 = 9
            if (r2 != r0) goto L53
            r1.showPerInstanceSettingsDialog()
        L53:
            return
    }

    private boolean hasAvailableUpdatesForSelectedCategory() {
            r1 = this;
            int r0 = r1.countAvailableUpdatesForSelectedCategory()
            if (r0 <= 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    private void hideContentLoadingOverlayIfIdle() {
            r2 = this;
            boolean r0 = r2.contentRefreshRunning
            if (r0 != 0) goto L12
            boolean r0 = r2.contentOperationRunning
            if (r0 == 0) goto L9
            goto L12
        L9:
            r2.cancelPendingContentLoadingOverlay()
            r0 = 0
            java.lang.String r1 = ""
            r2.setContentLoadingOverlayVisible(r0, r1, r1)
        L12:
            return
    }

    private void hideKeyboardFromView(android.view.View r4) {
            r3 = this;
            java.lang.String r0 = "input_method"
            java.lang.Object r0 = r3.getSystemService(r0)     // Catch: java.lang.Throwable -> L12
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L12
            android.os.IBinder r4 = r4.getWindowToken()     // Catch: java.lang.Throwable -> L12
            r1 = 0
            r0.hideSoftInputFromWindow(r4, r1)     // Catch: java.lang.Throwable -> L12
        L12:
            android.os.Handler r4 = r3.mainHandler
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda32 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda32
            r0.<init>(r3)
            r1 = 80
            r4.postDelayed(r0, r1)
            return
    }

    private void importModpackFromUri(android.net.Uri r7) {
            r6 = this;
            r4 = 100
            r5 = 0
            java.lang.String r1 = "Import Modpack"
            java.lang.String r2 = "Preparing import..."
            r3 = 0
            r0 = r6
            r0.showUpdateProgressDialog(r1, r2, r3, r4, r5)
            java.lang.Thread r0 = new java.lang.Thread
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda81 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda81
            r1.<init>(r6, r7)
            java.lang.String r7 = "Import Modpack"
            r0.<init>(r1, r7)
            r0.start()
            return
    }

    private void importSelectedContent(java.util.ArrayList<android.net.Uri> r6, ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory r7) {
            r5 = this;
            java.lang.String r0 = "Unable to create folder: "
            java.io.File r1 = r5.getDirectoryForCategory(r7)
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L60
            if (r2 != 0) goto L2a
            boolean r2 = r1.mkdirs()     // Catch: java.lang.Throwable -> L60
            if (r2 == 0) goto L13
            goto L2a
        L13:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L60
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L60
            java.lang.StringBuilder r0 = r2.append(r0)     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L60
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L60
            throw r6     // Catch: java.lang.Throwable -> L60
        L2a:
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L60
            r0 = 0
        L2f:
            boolean r2 = r6.hasNext()     // Catch: java.lang.Throwable -> L60
            if (r2 == 0) goto L57
            java.lang.Object r2 = r6.next()     // Catch: java.lang.Throwable -> L60
            android.net.Uri r2 = (android.net.Uri) r2     // Catch: java.lang.Throwable -> L60
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r3 = ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory.WORLDS     // Catch: java.lang.Throwable -> L60
            if (r7 != r3) goto L43
            r5.importWorldArchive(r2, r1)     // Catch: java.lang.Throwable -> L60
            goto L54
        L43:
            java.lang.String r3 = r5.resolveDisplayName(r2)     // Catch: java.lang.Throwable -> L60
            java.lang.String r4 = r7.defaultExtension     // Catch: java.lang.Throwable -> L60
            java.lang.String r3 = r5.sanitizeImportedFileName(r3, r4)     // Catch: java.lang.Throwable -> L60
            java.io.File r3 = r5.uniqueTargetFile(r1, r3)     // Catch: java.lang.Throwable -> L60
            r5.copyUriToFile(r2, r3)     // Catch: java.lang.Throwable -> L60
        L54:
            int r0 = r0 + 1
            goto L2f
        L57:
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda89 r6 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda89     // Catch: java.lang.Throwable -> L60
            r6.<init>(r5, r0, r7)     // Catch: java.lang.Throwable -> L60
            r5.runOnUiThread(r6)     // Catch: java.lang.Throwable -> L60
            goto L81
        L60:
            r6 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to import "
            r0.<init>(r1)
            java.lang.String r1 = r7.name()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "InstanceDetails"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r0, r6)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda90 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda90
            r0.<init>(r5, r7, r6)
            r5.runOnUiThread(r0)
        L81:
            return
    }

    private void importWorldArchive(android.net.Uri r5, java.io.File r6) throws java.lang.Exception {
            r4 = this;
            java.io.File r0 = r4.getCacheDir()
            java.lang.String r1 = "world-import-"
            java.lang.String r2 = ".zip"
            java.io.File r0 = java.io.File.createTempFile(r1, r2, r0)
            r4.copyUriToFile(r5, r0)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = r4.findWorldRootPrefix(r0)     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto L45
            java.lang.String r5 = r4.resolveDisplayName(r5)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r5 = r4.sanitizeImportedFileName(r5, r2)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r5 = r4.stripExtension(r5)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = r4.lastFolderName(r1)     // Catch: java.lang.Throwable -> L4d
            r3 = 0
            java.lang.String r2 = r4.sanitizeImportedFileName(r2, r3)     // Catch: java.lang.Throwable -> L4d
            boolean r3 = r4.isBlank(r2)     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L31
            goto L32
        L31:
            r5 = r2
        L32:
            boolean r2 = r4.isBlank(r5)     // Catch: java.lang.Throwable -> L4d
            if (r2 == 0) goto L3a
            java.lang.String r5 = "Imported World"
        L3a:
            java.io.File r5 = r4.uniqueTargetDirectory(r6, r5)     // Catch: java.lang.Throwable -> L4d
            r4.extractWorldZip(r0, r5, r1)     // Catch: java.lang.Throwable -> L4d
            r0.delete()
            return
        L45:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4d
            java.lang.String r6 = "Selected zip does not look like a Minecraft world. It must contain level.dat."
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L4d
            throw r5     // Catch: java.lang.Throwable -> L4d
        L4d:
            r5 = move-exception
            r0.delete()
            throw r5
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

    private boolean isContentItemCurrentlyVisible(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r2) {
            r1 = this;
            java.util.ArrayList<ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem> r0 = r1.contentItems
            java.io.File r2 = r2.file
            java.lang.String r2 = r1.safeCanonicalPath(r2)
            int r2 = r1.findContentItemIndexByCanonicalPath(r0, r2)
            if (r2 < 0) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            return r2
    }

    private boolean isContentItemEnabled(java.io.File r2) {
            r1 = this;
            java.lang.String r2 = r2.getName()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r0)
            java.lang.String r0 = ".disabled"
            boolean r2 = r2.endsWith(r0)
            r2 = r2 ^ 1
            return r2
    }

    private boolean isLikelyIconFileName(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "icon.png"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L5b
            java.lang.String r0 = "logo.png"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L5b
            java.lang.String r0 = "pack.png"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L5b
            java.lang.String r0 = "icon.jpg"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L5b
            java.lang.String r0 = "icon.jpeg"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L5b
            java.lang.String r0 = "icon.webp"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L5b
            java.lang.String r0 = "logo.jpg"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L5b
            java.lang.String r0 = "logo.jpeg"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L5b
            java.lang.String r0 = "logo.webp"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L5b
            java.lang.String r0 = "mod_icon.png"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L5b
            java.lang.String r0 = "modicon.png"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L59
            goto L5b
        L59:
            r2 = 0
            goto L5c
        L5b:
            r2 = 1
        L5c:
            return r2
    }

    private boolean isLikelyIconPath(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "/icon.png"
            boolean r0 = r2.endsWith(r0)
            if (r0 != 0) goto L53
            java.lang.String r0 = "/logo.png"
            boolean r0 = r2.endsWith(r0)
            if (r0 != 0) goto L53
            java.lang.String r0 = "/icon.jpg"
            boolean r0 = r2.endsWith(r0)
            if (r0 != 0) goto L53
            java.lang.String r0 = "/icon.jpeg"
            boolean r0 = r2.endsWith(r0)
            if (r0 != 0) goto L53
            java.lang.String r0 = "/icon.webp"
            boolean r0 = r2.endsWith(r0)
            if (r0 != 0) goto L53
            java.lang.String r0 = "/logo.jpg"
            boolean r0 = r2.endsWith(r0)
            if (r0 != 0) goto L53
            java.lang.String r0 = "/logo.jpeg"
            boolean r0 = r2.endsWith(r0)
            if (r0 != 0) goto L53
            java.lang.String r0 = "/logo.webp"
            boolean r0 = r2.endsWith(r0)
            if (r0 != 0) goto L53
            java.lang.String r0 = "/mod_icon.png"
            boolean r0 = r2.endsWith(r0)
            if (r0 != 0) goto L53
            java.lang.String r0 = "/modicon.png"
            boolean r2 = r2.endsWith(r0)
            if (r2 == 0) goto L51
            goto L53
        L51:
            r2 = 0
            goto L54
        L53:
            r2 = 1
        L54:
            return r2
    }

    private boolean isSameOrChild(java.io.File r2, java.io.File r3) throws java.io.IOException {
            r1 = this;
            java.lang.String r2 = r2.getCanonicalPath()
            java.lang.String r3 = r3.getCanonicalPath()
            boolean r0 = r3.equals(r2)
            if (r0 != 0) goto L2a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r0 = java.io.File.separator
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            boolean r2 = r3.startsWith(r2)
            if (r2 == 0) goto L28
            goto L2a
        L28:
            r2 = 0
            goto L2b
        L2a:
            r2 = 1
        L2b:
            return r2
    }

    static /* synthetic */ void lambda$addExportPlatformRow$15(java.lang.Runnable r0, android.view.View r1) {
            r0.run()
            return
    }

    private /* synthetic */ void lambda$addInstanceSettingsMenuRow$11(android.widget.PopupWindow r1, int r2, android.view.View r3) {
            r0 = this;
            r1.dismiss()
            r0.handleInstanceSettingsMenuItem(r2)
            return
    }

    static /* synthetic */ void lambda$addModpackActionCard$44(java.lang.Runnable r0, android.view.View r1) {
            r0.run()
            return
    }

    static /* synthetic */ void lambda$addModpackVersionRow$38(java.lang.Runnable r0, android.view.View r1) {
            r0.run()
            return
    }

    private /* synthetic */ void lambda$checkSingleContentUpdate$100(java.lang.String r3, java.lang.Throwable r4) {
            r2 = this;
            java.util.Map<java.lang.String, ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState> r0 = r2.updateStates
            ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState r1 = ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState.ERROR
            r0.put(r3, r1)
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.updateMessages
            java.lang.String r1 = r4.getMessage()
            if (r1 == 0) goto L14
            java.lang.String r4 = r4.getMessage()
            goto L1c
        L14:
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
        L1c:
            r0.put(r3, r4)
            int r4 = ca.dnamobile.javalauncher.R.string.instance_content_update_check_failed
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.updateMessages
            java.lang.Object r3 = r0.get(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r3 = r2.getString(r4, r3)
            r4 = 1
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r4)
            r3.show()
            ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter r3 = r2.contentAdapter
            if (r3 == 0) goto L3e
            r3.notifyDataSetChanged()
        L3e:
            return
    }

    private /* synthetic */ void lambda$checkSingleContentUpdate$101(ca.dnamobile.javalauncher.modmanager.ModManagerContentType r7, org.json.JSONObject r8, java.lang.String r9) {
            r6 = this;
            java.io.File r1 = r6.gameDirectory     // Catch: java.lang.Throwable -> L18
            java.lang.String r4 = r6.getGameVersionIdForContent()     // Catch: java.lang.Throwable -> L18
            java.lang.String r5 = r6.loader     // Catch: java.lang.Throwable -> L18
            r0 = r6
            r2 = r7
            r3 = r8
            ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager$UpdateCandidate r7 = ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.checkUpdateForEntry(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L18
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda124 r8 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda124     // Catch: java.lang.Throwable -> L18
            r8.<init>(r6, r7, r9)     // Catch: java.lang.Throwable -> L18
            r6.runOnUiThread(r8)     // Catch: java.lang.Throwable -> L18
            goto L28
        L18:
            r7 = move-exception
            java.lang.String r8 = "InstanceDetails"
            java.lang.String r0 = "Unable to check single content update"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r8, r0, r7)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda1 r8 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda1
            r8.<init>(r6, r9, r7)
            r6.runOnUiThread(r8)
        L28:
            return
    }

    private /* synthetic */ void lambda$checkSingleContentUpdate$99(ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.UpdateCandidate r4, java.lang.String r5) {
            r3 = this;
            if (r4 != 0) goto L24
            java.util.Map<java.lang.String, ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager$UpdateCandidate> r4 = r3.updateCandidates
            r4.remove(r5)
            java.util.Map<java.lang.String, ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState> r4 = r3.updateStates
            ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState r0 = ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState.UP_TO_DATE
            r4.put(r5, r0)
            java.util.Map<java.lang.String, java.lang.String> r4 = r3.updateMessages
            int r0 = ca.dnamobile.javalauncher.R.string.instance_content_up_to_date
            java.lang.String r0 = r3.getString(r0)
            r4.put(r5, r0)
            int r4 = ca.dnamobile.javalauncher.R.string.instance_content_up_to_date
            r5 = 0
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r5)
            r4.show()
            goto L5d
        L24:
            java.lang.String r5 = r3.buildUpdateKey(r4)
            java.util.Map<java.lang.String, ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager$UpdateCandidate> r0 = r3.updateCandidates
            r0.put(r5, r4)
            java.util.Map<java.lang.String, ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState> r0 = r3.updateStates
            ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState r1 = ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState.UPDATE_AVAILABLE
            r0.put(r5, r1)
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.updateMessages
            int r1 = ca.dnamobile.javalauncher.R.string.instance_content_update_available_value
            ca.dnamobile.javalauncher.modmanager.ModrinthVersion r2 = r4.latestVersion
            java.lang.String r2 = r2.versionNumber
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = r3.getString(r1, r2)
            r0.put(r5, r1)
            int r5 = ca.dnamobile.javalauncher.R.string.instance_content_update_available_for
            java.lang.String r4 = r4.getDisplayName()
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r4 = r3.getString(r5, r4)
            r5 = 1
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r5)
            r4.show()
        L5d:
            r3.updateContentUpdateButtons()
            ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter r4 = r3.contentAdapter
            if (r4 == 0) goto L67
            r4.notifyDataSetChanged()
        L67:
            return
    }

    private /* synthetic */ void lambda$checkUpdatesForSelectedCategory$92() {
            r1 = this;
            java.lang.String r0 = "Checking modpack-installed files..."
            r1.setUpdateProgressMessage(r0)
            return
    }

    private /* synthetic */ void lambda$checkUpdatesForSelectedCategory$93(int r1, int r2) {
            r0 = this;
            r0.setUpdateProgress(r1, r2)
            return
    }

    private /* synthetic */ void lambda$checkUpdatesForSelectedCategory$94(int r1, int r2) {
            r0 = this;
            r0.setUpdateProgress(r1, r2)
            return
    }

    private /* synthetic */ void lambda$checkUpdatesForSelectedCategory$95(int r1, int r2) {
            r0 = this;
            r0.setUpdateProgress(r1, r2)
            return
    }

    private /* synthetic */ void lambda$checkUpdatesForSelectedCategory$96(java.util.ArrayList r2) {
            r1 = this;
            r1.dismissUpdateProgressDialog()
            r1.updateContentUpdateButtons()
            ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter r0 = r1.contentAdapter
            if (r0 == 0) goto Ld
            r0.notifyDataSetChanged()
        Ld:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L1a
            int r2 = ca.dnamobile.javalauncher.R.string.instance_content_no_updates_found
            java.lang.String r2 = r1.getString(r2)
            goto L2c
        L1a:
            int r0 = ca.dnamobile.javalauncher.R.string.instance_content_updates_found
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r2 = r1.getString(r0, r2)
        L2c:
            r0 = 1
            android.widget.Toast r2 = android.widget.Toast.makeText(r1, r2, r0)
            r2.show()
            return
    }

    private /* synthetic */ void lambda$checkUpdatesForSelectedCategory$97(java.lang.Throwable r3) {
            r2 = this;
            r2.dismissUpdateProgressDialog()
            int r0 = ca.dnamobile.javalauncher.R.string.instance_content_update_check_failed
            java.lang.String r1 = r3.getMessage()
            if (r1 == 0) goto L10
            java.lang.String r3 = r3.getMessage()
            goto L18
        L10:
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getSimpleName()
        L18:
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r3 = r2.getString(r0, r3)
            r0 = 1
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r0)
            r3.show()
            return
    }

    private /* synthetic */ void lambda$checkUpdatesForSelectedCategory$98(ca.dnamobile.javalauncher.modmanager.ModManagerContentType r13) {
            r12 = this;
            java.lang.String r0 = "InstanceDetails"
            r12.markTrackedEntriesUpToDate(r13)     // Catch: java.lang.Throwable -> Lf3
            java.io.File r2 = r12.gameDirectory     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r4 = r12.getGameVersionIdForContent()     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r5 = r12.loader     // Catch: java.lang.Throwable -> Lf3
            ca.dnamobile.javalauncher.InstanceDetailsActivity$14 r6 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$14     // Catch: java.lang.Throwable -> Lf3
            r6.<init>(r12)     // Catch: java.lang.Throwable -> Lf3
            r1 = r12
            r3 = r13
            java.util.ArrayList r1 = ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.checkUpdates(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lf3
            java.util.ArrayList r2 = r12.getModpackInstalledEntriesForType(r13)     // Catch: java.lang.Throwable -> Lf3
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> Lf3
            if (r3 != 0) goto Lb3
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda51 r3 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda51     // Catch: java.lang.Throwable -> Lf3
            r3.<init>(r12)     // Catch: java.lang.Throwable -> Lf3
            r12.runOnUiThread(r3)     // Catch: java.lang.Throwable -> Lf3
            int r3 = r2.size()     // Catch: java.lang.Throwable -> Lf3
            r4 = 1
            int r3 = java.lang.Math.max(r4, r3)     // Catch: java.lang.Throwable -> Lf3
            r4 = 0
        L34:
            int r5 = r2.size()     // Catch: java.lang.Throwable -> Lf3
            if (r4 >= r5) goto Lb3
            java.lang.Object r5 = r2.get(r4)     // Catch: java.lang.Throwable -> Lf3
            r9 = r5
            org.json.JSONObject r9 = (org.json.JSONObject) r9     // Catch: java.lang.Throwable -> Lf3
            java.io.File r5 = r12.resolveFileForInstalledEntry(r9)     // Catch: java.lang.Throwable -> Lf3
            if (r5 == 0) goto L5a
            java.io.File r6 = r12.gameDirectory     // Catch: java.lang.Throwable -> Lf3
            org.json.JSONObject r5 = ca.dnamobile.javalauncher.modmanager.ModManagerManifest.getInstalledEntryForFile(r6, r13, r5)     // Catch: java.lang.Throwable -> Lf3
            if (r5 == 0) goto L5a
            int r5 = r4 + 1
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda52 r6 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda52     // Catch: java.lang.Throwable -> Lf3
            r6.<init>(r12, r5, r3)     // Catch: java.lang.Throwable -> Lf3
            r12.runOnUiThread(r6)     // Catch: java.lang.Throwable -> Lf3
            goto Lb0
        L5a:
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r5 = ca.dnamobile.javalauncher.modmanager.ModManagerManifest.getSource(r9)     // Catch: java.lang.Throwable -> Lf3
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r6 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.MODRINTH     // Catch: java.lang.Throwable -> Lf3
            if (r5 == r6) goto L71
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r6 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.CURSEFORGE     // Catch: java.lang.Throwable -> Lf3
            if (r5 == r6) goto L71
            int r5 = r4 + 1
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda53 r6 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda53     // Catch: java.lang.Throwable -> Lf3
            r6.<init>(r12, r5, r3)     // Catch: java.lang.Throwable -> Lf3
            r12.runOnUiThread(r6)     // Catch: java.lang.Throwable -> Lf3
            goto Lb0
        L71:
            java.io.File r7 = r12.gameDirectory     // Catch: java.lang.Throwable -> L8b
            java.lang.String r10 = r12.getGameVersionIdForContent()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r11 = r12.loader     // Catch: java.lang.Throwable -> L8b
            r6 = r12
            r8 = r13
            ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager$UpdateCandidate r5 = ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.checkUpdateForEntry(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L8b
            if (r5 == 0) goto La6
            boolean r6 = r12.containsUpdateCandidate(r1, r5)     // Catch: java.lang.Throwable -> L8b
            if (r6 != 0) goto La6
            r1.add(r5)     // Catch: java.lang.Throwable -> L8b
            goto La6
        L8b:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf3
            r6.<init>()     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r7 = "Unable to check modpack-installed file update: "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r5 = r12.readableError(r5)     // Catch: java.lang.Throwable -> Lf3
            java.lang.StringBuilder r5 = r6.append(r5)     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Lf3
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r5)     // Catch: java.lang.Throwable -> Lf3
        La6:
            int r5 = r4 + 1
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda54 r6 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda54     // Catch: java.lang.Throwable -> Lf3
            r6.<init>(r12, r5, r3)     // Catch: java.lang.Throwable -> Lf3
            r12.runOnUiThread(r6)     // Catch: java.lang.Throwable -> Lf3
        Lb0:
            int r4 = r4 + 1
            goto L34
        Lb3:
            r12.removeUpdateCandidatesForType(r13)     // Catch: java.lang.Throwable -> Lf3
            java.util.Iterator r13 = r1.iterator()     // Catch: java.lang.Throwable -> Lf3
        Lba:
            boolean r2 = r13.hasNext()     // Catch: java.lang.Throwable -> Lf3
            if (r2 == 0) goto Lea
            java.lang.Object r2 = r13.next()     // Catch: java.lang.Throwable -> Lf3
            ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager$UpdateCandidate r2 = (ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.UpdateCandidate) r2     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r3 = r12.buildUpdateKey(r2)     // Catch: java.lang.Throwable -> Lf3
            java.util.Map<java.lang.String, ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager$UpdateCandidate> r4 = r12.updateCandidates     // Catch: java.lang.Throwable -> Lf3
            r4.put(r3, r2)     // Catch: java.lang.Throwable -> Lf3
            java.util.Map<java.lang.String, ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState> r4 = r12.updateStates     // Catch: java.lang.Throwable -> Lf3
            ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState r5 = ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState.UPDATE_AVAILABLE     // Catch: java.lang.Throwable -> Lf3
            r4.put(r3, r5)     // Catch: java.lang.Throwable -> Lf3
            java.util.Map<java.lang.String, java.lang.String> r4 = r12.updateMessages     // Catch: java.lang.Throwable -> Lf3
            int r5 = ca.dnamobile.javalauncher.R.string.instance_content_update_available_value     // Catch: java.lang.Throwable -> Lf3
            ca.dnamobile.javalauncher.modmanager.ModrinthVersion r2 = r2.latestVersion     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r2 = r2.versionNumber     // Catch: java.lang.Throwable -> Lf3
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r2 = r12.getString(r5, r2)     // Catch: java.lang.Throwable -> Lf3
            r4.put(r3, r2)     // Catch: java.lang.Throwable -> Lf3
            goto Lba
        Lea:
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda55 r13 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda55     // Catch: java.lang.Throwable -> Lf3
            r13.<init>(r12, r1)     // Catch: java.lang.Throwable -> Lf3
            r12.runOnUiThread(r13)     // Catch: java.lang.Throwable -> Lf3
            goto L101
        Lf3:
            r13 = move-exception
            java.lang.String r1 = "Unable to check content updates"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r1, r13)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda56 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda56
            r0.<init>(r12, r13)
            r12.runOnUiThread(r0)
        L101:
            return
    }

    private /* synthetic */ void lambda$confirmUpdateLoader$49(ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderVersion r1, android.content.DialogInterface r2, int r3) {
            r0 = this;
            r0.runLoaderUpdate(r1)
            return
    }

    private /* synthetic */ void lambda$confirmUpdateVersion$24(java.lang.String r1, android.content.DialogInterface r2, int r3) {
            r0 = this;
            r0.runVersionUpdate(r1)
            return
    }

    private /* synthetic */ void lambda$deleteContentItem$87(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r2) {
            r1 = this;
            r1.refreshContentList()
            int r0 = ca.dnamobile.javalauncher.R.string.instance_content_delete_success
            java.lang.String r2 = r2.title
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r2 = r1.getString(r0, r2)
            r0 = 0
            android.widget.Toast r2 = android.widget.Toast.makeText(r1, r2, r0)
            r2.show()
            return
    }

    private /* synthetic */ void lambda$deleteContentItem$88(java.lang.Throwable r2, ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r3) {
            r1 = this;
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto Lb
            java.lang.String r2 = r2.getMessage()
            goto L13
        Lb:
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getSimpleName()
        L13:
            int r0 = ca.dnamobile.javalauncher.R.string.instance_content_delete_failed
            java.lang.String r3 = r3.title
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r2}
            java.lang.String r2 = r1.getString(r0, r2)
            r3 = 1
            android.widget.Toast r2 = android.widget.Toast.makeText(r1, r2, r3)
            r2.show()
            return
    }

    private /* synthetic */ void lambda$deleteContentItem$89(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r4) {
            r3 = this;
            java.io.File r0 = r4.file     // Catch: java.lang.Throwable -> L1f
            r3.deleteFileOrDirectory(r0)     // Catch: java.lang.Throwable -> L1f
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r0 = r4.category     // Catch: java.lang.Throwable -> L1f
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = r3.toModManagerContentType(r0)     // Catch: java.lang.Throwable -> L1f
            java.io.File r1 = r3.gameDirectory     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L16
            if (r0 == 0) goto L16
            java.io.File r2 = r4.file     // Catch: java.lang.Throwable -> L1f
            ca.dnamobile.javalauncher.modmanager.ModManagerManifest.removeEntryForFile(r1, r0, r2)     // Catch: java.lang.Throwable -> L1f
        L16:
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda42 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda42     // Catch: java.lang.Throwable -> L1f
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L1f
            r3.runOnUiThread(r0)     // Catch: java.lang.Throwable -> L1f
            goto L42
        L1f:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to delete content item "
            r1.<init>(r2)
            java.io.File r2 = r4.file
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "InstanceDetails"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r2, r1, r0)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda43 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda43
            r1.<init>(r3, r0, r4)
            r3.runOnUiThread(r1)
        L42:
            return
    }

    private /* synthetic */ void lambda$deleteInstance$74(java.lang.Throwable r3) {
            r2 = this;
            r0 = 0
            r2.setDeleteInProgress(r0)
            java.lang.String r0 = r3.getMessage()
            if (r0 == 0) goto Lf
            java.lang.String r3 = r3.getMessage()
            goto L17
        Lf:
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getSimpleName()
        L17:
            int r0 = ca.dnamobile.javalauncher.R.string.delete_instance_failed
            java.lang.String r1 = r2.instanceName
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3}
            java.lang.String r3 = r2.getString(r0, r3)
            r0 = 1
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r0)
            r3.show()
            return
    }

    private /* synthetic */ void lambda$deleteInstance$75(java.lang.Throwable r3) {
            r2 = this;
            r0 = 0
            r2.setDeleteInProgress(r0)
            java.lang.String r0 = r3.getMessage()
            if (r0 == 0) goto Lf
            java.lang.String r3 = r3.getMessage()
            goto L17
        Lf:
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getSimpleName()
        L17:
            int r0 = ca.dnamobile.javalauncher.R.string.delete_instance_failed
            java.lang.String r1 = r2.instanceName
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3}
            java.lang.String r3 = r2.getString(r0, r3)
            r0 = 1
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r0)
            r3.show()
            return
    }

    private /* synthetic */ void lambda$deleteInstance$76() {
            r5 = this;
            java.lang.String r0 = "InstanceDetails"
            java.lang.String r1 = r5.instanceId     // Catch: java.lang.Throwable -> L5a
            java.lang.String r2 = r5.baseVersionId     // Catch: java.lang.Throwable -> L5a
            java.io.File r3 = r5.rootDirectory     // Catch: java.lang.Throwable -> L5a
            boolean r4 = r5.isolated     // Catch: java.lang.Throwable -> L5a
            ca.dnamobile.javalauncher.instance.LauncherInstanceDeleteManager$DeleteJob r1 = ca.dnamobile.javalauncher.instance.LauncherInstanceDeleteManager.hideForDeletion(r5, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r2 = r5.instanceId     // Catch: java.lang.Throwable -> L5a
            ca.dnamobile.javalauncher.settings.LauncherPreferences.clearInstancePlayed(r5, r2)     // Catch: java.lang.Throwable -> L5a
            boolean r2 = r1.wasMovedOutOfVisibleList()
            if (r2 != 0) goto L4e
            java.io.File r2 = r1.getOriginalTarget()
            boolean r2 = r2.exists()
            if (r2 != 0) goto L24
            goto L4e
        L24:
            ca.dnamobile.javalauncher.instance.LauncherInstanceDeleteManager.finishDeletion(r5, r1)     // Catch: java.lang.Throwable -> L30
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda24 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda24     // Catch: java.lang.Throwable -> L30
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L30
            r5.runOnUiThread(r1)     // Catch: java.lang.Throwable -> L30
            goto L4d
        L30:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to delete instance "
            r2.<init>(r3)
            java.lang.String r3 = r5.instanceName
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r2, r1)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda25 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda25
            r0.<init>(r5, r1)
            r5.runOnUiThread(r0)
        L4d:
            return
        L4e:
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda24 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda24
            r0.<init>(r5)
            r5.runOnUiThread(r0)
            r5.finishDeleteInBackground(r1)
            return
        L5a:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to prepare delete for "
            r2.<init>(r3)
            java.lang.String r3 = r5.instanceName
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r2, r1)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda23 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda23
            r0.<init>(r5, r1)
            r5.runOnUiThread(r0)
            return
    }

    private /* synthetic */ void lambda$exportModpackToUri$17(ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform r12, android.net.Uri r13, ca.dnamobile.javalauncher.modmanager.ModpackExportManager.ExportOptions r14) {
            r11 = this;
            java.io.File r1 = r11.gameDirectory
            java.lang.String r2 = r11.instanceName
            java.lang.String r3 = r11.getGameVersionIdForContent()
            java.lang.String r4 = r11.loader
            java.lang.String r5 = r11.baseVersionId
            java.io.File r6 = r11.iconFile
            ca.dnamobile.javalauncher.InstanceDetailsActivity$4 r10 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$4
            r10.<init>(r11)
            r0 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            ca.dnamobile.javalauncher.modmanager.ModpackExportManager.exportToUri(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    private /* synthetic */ void lambda$exportWorldToUri$114(int r3, int r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Exporting "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = " of "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r1 = " files..."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.setUpdateProgressMessage(r0)
            r2.setUpdateProgress(r3, r4)
            return
    }

    private /* synthetic */ void lambda$exportWorldToUri$115(java.io.File r3) {
            r2 = this;
            r2.dismissUpdateProgressDialog()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "World exported: "
            r0.<init>(r1)
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r0 = 1
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r0)
            r3.show()
            return
    }

    private /* synthetic */ void lambda$exportWorldToUri$116(java.lang.Throwable r3) {
            r2 = this;
            r2.dismissUpdateProgressDialog()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "World export failed: "
            r0.<init>(r1)
            java.lang.String r3 = r2.readableError(r3)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r0 = 1
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r0)
            r3.show()
            return
    }

    private /* synthetic */ void lambda$exportWorldToUri$117(java.io.File r10, android.net.Uri r11) {
            r9 = this;
            boolean r0 = r10.isDirectory()     // Catch: java.lang.Throwable -> Led
            if (r0 == 0) goto Le5
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> Led
            java.lang.String r1 = "level.dat"
            r0.<init>(r10, r1)     // Catch: java.lang.Throwable -> Led
            boolean r0 = r0.isFile()     // Catch: java.lang.Throwable -> Led
            if (r0 == 0) goto Le5
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Led
            r0.<init>()     // Catch: java.lang.Throwable -> Led
            r9.collectFilesForWorldExport(r10, r0)     // Catch: java.lang.Throwable -> Led
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> Led
            if (r1 != 0) goto Ldd
            android.content.ContentResolver r1 = r9.getContentResolver()     // Catch: java.lang.Throwable -> Led
            java.io.OutputStream r11 = r1.openOutputStream(r11)     // Catch: java.lang.Throwable -> Led
            if (r11 == 0) goto Ld5
            java.util.zip.ZipOutputStream r1 = new java.util.zip.ZipOutputStream     // Catch: java.lang.Throwable -> Lc9
            r1.<init>(r11)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r2 = r10.getName()     // Catch: java.lang.Throwable -> Lbf
            r3 = 0
            java.lang.String r2 = r9.sanitizeImportedFileName(r2, r3)     // Catch: java.lang.Throwable -> Lbf
            boolean r3 = r9.isBlank(r2)     // Catch: java.lang.Throwable -> Lbf
            if (r3 == 0) goto L41
            java.lang.String r2 = "World"
        L41:
            r3 = 0
        L42:
            int r4 = r0.size()     // Catch: java.lang.Throwable -> Lbf
            if (r3 >= r4) goto Lae
            java.lang.Object r4 = r0.get(r3)     // Catch: java.lang.Throwable -> Lbf
            java.io.File r4 = (java.io.File) r4     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r5 = r9.getRelativePathFromDirectory(r10, r4)     // Catch: java.lang.Throwable -> Lbf
            boolean r6 = r9.isBlank(r5)     // Catch: java.lang.Throwable -> Lbf
            if (r6 == 0) goto L59
            goto La1
        L59:
            java.util.zip.ZipEntry r6 = new java.util.zip.ZipEntry     // Catch: java.lang.Throwable -> Lbf
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbf
            r7.<init>()     // Catch: java.lang.Throwable -> Lbf
            java.lang.StringBuilder r7 = r7.append(r2)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r8 = "/"
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Throwable -> Lbf
            java.lang.StringBuilder r5 = r7.append(r5)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Lbf
            r6.<init>(r5)     // Catch: java.lang.Throwable -> Lbf
            long r7 = r4.lastModified()     // Catch: java.lang.Throwable -> Lbf
            r6.setTime(r7)     // Catch: java.lang.Throwable -> Lbf
            r1.putNextEntry(r6)     // Catch: java.lang.Throwable -> Lbf
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Lbf
            r5.<init>(r4)     // Catch: java.lang.Throwable -> Lbf
            r9.copyStream(r5, r1)     // Catch: java.lang.Throwable -> La4
            r5.close()     // Catch: java.lang.Throwable -> Lbf
            r1.closeEntry()     // Catch: java.lang.Throwable -> Lbf
            int r4 = r3 + 1
            int r5 = r0.size()     // Catch: java.lang.Throwable -> Lbf
            if (r4 == r5) goto L99
            int r6 = r4 % 8
            if (r6 != 0) goto La1
        L99:
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda64 r6 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda64     // Catch: java.lang.Throwable -> Lbf
            r6.<init>(r9, r4, r5)     // Catch: java.lang.Throwable -> Lbf
            r9.runOnUiThread(r6)     // Catch: java.lang.Throwable -> Lbf
        La1:
            int r3 = r3 + 1
            goto L42
        La4:
            r0 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> La9
            goto Lad
        La9:
            r2 = move-exception
            r0.addSuppressed(r2)     // Catch: java.lang.Throwable -> Lbf
        Lad:
            throw r0     // Catch: java.lang.Throwable -> Lbf
        Lae:
            r1.close()     // Catch: java.lang.Throwable -> Lc9
            if (r11 == 0) goto Lb6
            r11.close()     // Catch: java.lang.Throwable -> Led
        Lb6:
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda65 r11 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda65     // Catch: java.lang.Throwable -> Led
            r11.<init>(r9, r10)     // Catch: java.lang.Throwable -> Led
            r9.runOnUiThread(r11)     // Catch: java.lang.Throwable -> Led
            goto L10e
        Lbf:
            r0 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> Lc4
            goto Lc8
        Lc4:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch: java.lang.Throwable -> Lc9
        Lc8:
            throw r0     // Catch: java.lang.Throwable -> Lc9
        Lc9:
            r0 = move-exception
            if (r11 == 0) goto Ld4
            r11.close()     // Catch: java.lang.Throwable -> Ld0
            goto Ld4
        Ld0:
            r11 = move-exception
            r0.addSuppressed(r11)     // Catch: java.lang.Throwable -> Led
        Ld4:
            throw r0     // Catch: java.lang.Throwable -> Led
        Ld5:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> Led
            java.lang.String r0 = "Unable to open export target."
            r11.<init>(r0)     // Catch: java.lang.Throwable -> Led
            throw r11     // Catch: java.lang.Throwable -> Led
        Ldd:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Led
            java.lang.String r0 = "World folder is empty."
            r11.<init>(r0)     // Catch: java.lang.Throwable -> Led
            throw r11     // Catch: java.lang.Throwable -> Led
        Le5:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Led
            java.lang.String r0 = "This folder does not look like a Minecraft world."
            r11.<init>(r0)     // Catch: java.lang.Throwable -> Led
            throw r11     // Catch: java.lang.Throwable -> Led
        Led:
            r11 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to export world "
            r0.<init>(r1)
            java.lang.String r10 = r10.getAbsolutePath()
            java.lang.StringBuilder r10 = r0.append(r10)
            java.lang.String r10 = r10.toString()
            java.lang.String r0 = "InstanceDetails"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r10, r11)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda66 r10 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda66
            r10.<init>(r9, r11)
            r9.runOnUiThread(r10)
        L10e:
            return
    }

    static /* synthetic */ boolean lambda$findNewestNewFileInTargetDirectory$109(java.io.File r1) {
            boolean r0 = r1.isFile()
            if (r0 == 0) goto Le
            boolean r1 = r1.isHidden()
            if (r1 != 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    private /* synthetic */ void lambda$importModpackFromUri$18(android.net.Uri r2) {
            r1 = this;
            ca.dnamobile.javalauncher.InstanceDetailsActivity$5 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$5
            r0.<init>(r1)
            ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.importFromUri(r1, r2, r0)
            return
    }

    private /* synthetic */ void lambda$importSelectedContent$112(int r2, ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory r3) {
            r1 = this;
            r1.refreshContentList()
            int r0 = ca.dnamobile.javalauncher.R.string.instance_content_imported_value
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r3.pluralLabelRes
            java.lang.String r3 = r1.getString(r3)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r2 = r1.getString(r0, r2)
            r3 = 0
            android.widget.Toast r2 = android.widget.Toast.makeText(r1, r2, r3)
            r2.show()
            return
    }

    private /* synthetic */ void lambda$importSelectedContent$113(ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory r3, java.lang.Throwable r4) {
            r2 = this;
            int r0 = ca.dnamobile.javalauncher.R.string.instance_content_import_failed
            int r3 = r3.pluralLabelRes
            java.lang.String r3 = r2.getString(r3)
            java.lang.String r1 = r4.getMessage()
            if (r1 == 0) goto L13
            java.lang.String r4 = r4.getMessage()
            goto L1b
        L13:
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
        L1b:
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}
            java.lang.String r3 = r2.getString(r0, r3)
            r4 = 1
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r4)
            r3.show()
            return
    }

    private /* synthetic */ void lambda$launchInstance$59(java.lang.String r1) {
            r0 = this;
            r0.launchInstance(r1)
            return
    }

    private /* synthetic */ void lambda$loadModpackVersions$32(java.util.ArrayList r2, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.ProjectMatch r3, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo r4) {
            r1 = this;
            r1.dismissUpdateProgressDialog()
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L29
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "No versions were returned for "
            r2.<init>(r4)
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
            r1.showModpackVersionChooser(r4, r3, r2)
            return
    }

    private /* synthetic */ void lambda$loadModpackVersions$33(java.lang.Throwable r3) {
            r2 = this;
            r2.dismissUpdateProgressDialog()
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

    private /* synthetic */ void lambda$loadModpackVersions$34(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.ProjectMatch r3, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo r4) {
            r2 = this;
            ca.dnamobile.javalauncher.InstanceDetailsActivity$8 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$8     // Catch: java.lang.Throwable -> L12
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L12
            java.util.ArrayList r0 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.loadVersions(r3, r0)     // Catch: java.lang.Throwable -> L12
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda48 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda48     // Catch: java.lang.Throwable -> L12
            r1.<init>(r2, r0, r3, r4)     // Catch: java.lang.Throwable -> L12
            r2.runOnUiThread(r1)     // Catch: java.lang.Throwable -> L12
            goto L22
        L12:
            r3 = move-exception
            java.lang.String r4 = "InstanceDetails"
            java.lang.String r0 = "Unable to load modpack versions"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r4, r0, r3)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda59 r4 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda59
            r4.<init>(r2, r3)
            r2.runOnUiThread(r4)
        L22:
            return
    }

    private /* synthetic */ void lambda$onActivityResult$111(java.util.ArrayList r1, ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory r2) {
            r0 = this;
            r0.importSelectedContent(r1, r2)
            return
    }

    private /* synthetic */ void lambda$onCreate$0(android.view.View r1) {
            r0 = this;
            r0.finish()
            return
    }

    private /* synthetic */ boolean lambda$refreshContentList$77(ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory r1, java.io.File r2) {
            r0 = this;
            boolean r1 = r0.shouldShowFileForCategory(r1, r2)
            return r1
    }

    static /* synthetic */ java.lang.Boolean lambda$refreshContentList$78(java.io.File r0) {
            boolean r0 = r0.isDirectory()
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    private /* synthetic */ java.lang.String lambda$refreshContentList$79(ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory r1, java.io.File r2) {
            r0 = this;
            java.lang.String r1 = r0.resolveDisplayTitle(r2, r1)
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r2)
            return r1
    }

    private /* synthetic */ void lambda$refreshContentList$80() {
            r1 = this;
            r0 = 0
            r1.contentRefreshRunning = r0
            r1.hideContentLoadingOverlayIfIdle()
            return
    }

    private /* synthetic */ void lambda$refreshContentList$81(int r2, ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory r3) {
            r1 = this;
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r1.binding
            if (r0 == 0) goto L2d
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L2d
            boolean r0 = r1.isDestroyed()
            if (r0 == 0) goto L11
            goto L2d
        L11:
            int r0 = r1.contentRefreshGeneration
            if (r2 != r0) goto L2d
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r2 = r1.selectedCategory
            if (r2 == r3) goto L1a
            goto L2d
        L1a:
            ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter r2 = r1.contentAdapter
            if (r2 == 0) goto L21
            r2.notifyDataSetChanged()
        L21:
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r2 = r1.binding
            androidx.recyclerview.widget.RecyclerView r2 = r2.recyclerResourceItems
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda122 r3 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda122
            r3.<init>(r1)
            r2.post(r3)
        L2d:
            return
    }

    private /* synthetic */ void lambda$refreshContentList$82(int r4, ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory r5, java.util.ArrayList r6, java.io.File r7) {
            r3 = this;
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r3.binding
            if (r0 == 0) goto L7a
            boolean r0 = r3.isFinishing()
            if (r0 != 0) goto L7a
            boolean r0 = r3.isDestroyed()
            if (r0 == 0) goto L11
            goto L7a
        L11:
            int r0 = r3.contentRefreshGeneration
            if (r4 != r0) goto L7a
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r0 = r3.selectedCategory
            if (r0 == r5) goto L1a
            goto L7a
        L1a:
            java.util.ArrayList<ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem> r0 = r3.allContentItems
            r0.clear()
            java.util.ArrayList<ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem> r0 = r3.allContentItems
            r0.addAll(r6)
            r6 = 0
            r3.applyContentSearchFilter(r6)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonBrowseContent
            r0.setVisibility(r6)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonBrowseContent
            int r1 = ca.dnamobile.javalauncher.R.string.button_browse_content
            r0.setText(r1)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonBrowseContent
            boolean r1 = r3.canBrowseSelectedCategory()
            r2 = 1
            if (r1 == 0) goto L49
            boolean r1 = r3.contentOperationRunning
            if (r1 != 0) goto L49
            r1 = r2
            goto L4a
        L49:
            r1 = r6
        L4a:
            r0.setEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonAddMods
            int r1 = r5.uploadButtonTextRes
            r0.setText(r1)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonAddMods
            boolean r1 = r3.canUploadSelectedCategory()
            if (r1 == 0) goto L65
            boolean r1 = r3.contentOperationRunning
            if (r1 != 0) goto L65
            r6 = r2
        L65:
            r0.setEnabled(r6)
            r3.updateContentHint(r7)
            r3.updateContentUpdateButtons()
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r6 = r3.binding
            androidx.recyclerview.widget.RecyclerView r6 = r6.recyclerResourceItems
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda76 r7 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda76
            r7.<init>(r3, r4, r5)
            r6.post(r7)
        L7a:
            return
    }

    private /* synthetic */ void lambda$refreshContentList$83(ca.dnamobile.javalauncher.modmanager.ModManagerContentType r8, java.io.File r9, ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory r10, int r11) {
            r7 = this;
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.String r0 = "InstanceDetails"
            if (r8 == 0) goto L26
            java.io.File r1 = r7.gameDirectory     // Catch: java.lang.Throwable -> Lf
            ca.dnamobile.javalauncher.modmanager.ModManagerManifest.pruneMissingFiles(r1, r8)     // Catch: java.lang.Throwable -> Lf
            goto L26
        Lf:
            r8 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to prune missing content metadata: "
            r1.<init>(r2)
            java.lang.String r8 = r7.readableError(r8)
            java.lang.StringBuilder r8 = r1.append(r8)
            java.lang.String r8 = r8.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r8)
        L26:
            boolean r8 = r9.exists()     // Catch: java.lang.Throwable -> L77
            if (r8 != 0) goto L32
            boolean r8 = r9.mkdirs()     // Catch: java.lang.Throwable -> L77
            if (r8 == 0) goto L8e
        L32:
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda46 r8 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda46     // Catch: java.lang.Throwable -> L77
            r8.<init>(r7, r10)     // Catch: java.lang.Throwable -> L77
            java.io.File[] r8 = r9.listFiles(r8)     // Catch: java.lang.Throwable -> L77
            if (r8 == 0) goto L8e
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L77
            r1.<init>()     // Catch: java.lang.Throwable -> L77
            java.util.Collections.addAll(r1, r8)     // Catch: java.lang.Throwable -> L77
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda47 r8 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda47     // Catch: java.lang.Throwable -> L77
            r8.<init>()     // Catch: java.lang.Throwable -> L77
            java.util.Comparator r8 = java.util.Comparator.comparing(r8)     // Catch: java.lang.Throwable -> L77
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda49 r2 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda49     // Catch: java.lang.Throwable -> L77
            r2.<init>(r7, r10)     // Catch: java.lang.Throwable -> L77
            java.util.Comparator r8 = r8.thenComparing(r2)     // Catch: java.lang.Throwable -> L77
            r1.sort(r8)     // Catch: java.lang.Throwable -> L77
            java.util.Iterator r8 = r1.iterator()     // Catch: java.lang.Throwable -> L77
        L5e:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Throwable -> L77
            if (r1 == 0) goto L8e
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Throwable -> L77
            java.io.File r1 = (java.io.File) r1     // Catch: java.lang.Throwable -> L77
            ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem r2 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem     // Catch: java.lang.Throwable -> L77
            java.lang.String r3 = r7.resolveDisplayTitle(r1, r10)     // Catch: java.lang.Throwable -> L77
            r2.<init>(r1, r10, r3)     // Catch: java.lang.Throwable -> L77
            r4.add(r2)     // Catch: java.lang.Throwable -> L77
            goto L5e
        L77:
            r8 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to scan instance content folder: "
            r1.<init>(r2)
            java.lang.String r2 = r9.getAbsolutePath()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r1, r8)
        L8e:
            android.os.Handler r8 = r7.mainHandler
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda50 r6 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda50
            r0 = r6
            r1 = r7
            r2 = r11
            r3 = r10
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r8.post(r6)
            return
    }

    private /* synthetic */ void lambda$registerMobileGluesFolderPickerLauncher$60(androidx.activity.result.ActivityResult r5) {
            r4 = this;
            java.lang.String r0 = r4.pendingMobileGluesQuickPlayWorldFolderName
            r1 = 0
            r4.pendingMobileGluesQuickPlayWorldFolderName = r1
            int r1 = r5.getResultCode()
            r2 = -1
            if (r1 != r2) goto L73
            android.content.Intent r1 = r5.getData()
            if (r1 != 0) goto L13
            goto L73
        L13:
            android.content.Intent r1 = r5.getData()
            android.net.Uri r1 = r1.getData()
            if (r1 != 0) goto L21
            r4.enableFullscreen()
            return
        L21:
            android.content.Intent r5 = r5.getData()     // Catch: java.lang.Throwable -> L35
            int r5 = r5.getFlags()     // Catch: java.lang.Throwable -> L35
            r5 = r5 & 3
            if (r5 == 0) goto L4e
            android.content.ContentResolver r2 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L35
            r2.takePersistableUriPermission(r1, r5)     // Catch: java.lang.Throwable -> L35
            goto L4e
        L35:
            r5 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to persist MobileGlues folder permission: "
            r2.<init>(r3)
            java.lang.String r5 = r4.readableError(r5)
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r5 = r5.toString()
            java.lang.String r2 = "InstanceDetails"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r5)
        L4e:
            ca.dnamobile.javalauncher.renderer.MobileGluesConfigHelper.setSelectedConfigTreeUri(r4, r1)
            boolean r5 = ca.dnamobile.javalauncher.renderer.MobileGluesConfigHelper.hasStorageAccess(r4)
            if (r5 == 0) goto L65
            java.lang.String r5 = "MobileGlues folder saved."
            r1 = 0
            android.widget.Toast r5 = android.widget.Toast.makeText(r4, r5, r1)
            r5.show()
            r4.continueLaunchInstance(r0)
            goto L72
        L65:
            java.lang.String r5 = "MobileGlues folder was selected, but storage access is still unavailable."
            r0 = 1
            android.widget.Toast r5 = android.widget.Toast.makeText(r4, r5, r0)
            r5.show()
            r4.enableFullscreen()
        L72:
            return
        L73:
            r4.enableFullscreen()
            return
    }

    private /* synthetic */ void lambda$renameInstance$67(ca.dnamobile.javalauncher.instance.LauncherInstance r3, android.app.AlertDialog r4, java.lang.String r5) {
            r2 = this;
            r2.applyUpdatedInstance(r3)
            r0 = 0
            r2.setInstanceEditInProgress(r0)
            r1 = -1
            r2.setResult(r1)
            r4.dismiss()
            int r4 = ca.dnamobile.javalauncher.R.string.instance_rename_success
            java.lang.String r3 = r3.getName()
            java.lang.Object[] r3 = new java.lang.Object[]{r5, r3}
            java.lang.String r3 = r2.getString(r4, r3)
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r0)
            r3.show()
            return
    }

    private /* synthetic */ void lambda$renameInstance$68(java.lang.Throwable r2) {
            r1 = this;
            r0 = 0
            r1.setInstanceEditInProgress(r0)
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto Lf
            java.lang.String r2 = r2.getMessage()
            goto L17
        Lf:
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getSimpleName()
        L17:
            int r0 = ca.dnamobile.javalauncher.R.string.instance_rename_failed
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r2 = r1.getString(r0, r2)
            r0 = 1
            android.widget.Toast r2 = android.widget.Toast.makeText(r1, r2, r0)
            r2.show()
            return
    }

    private /* synthetic */ void lambda$renameInstance$69(java.io.File r3, java.lang.String r4, android.app.AlertDialog r5) {
            r2 = this;
            java.lang.String r0 = r2.instanceName
            ca.dnamobile.javalauncher.instance.LauncherInstance r3 = ca.dnamobile.javalauncher.instance.LauncherInstanceManager.renameInstance(r2, r3, r4)     // Catch: java.lang.Throwable -> Lf
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda102 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda102     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r2, r3, r5, r0)     // Catch: java.lang.Throwable -> Lf
            r2.runOnUiThread(r1)     // Catch: java.lang.Throwable -> Lf
            goto L36
        Lf:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to rename instance "
            r5.<init>(r1)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r0 = " to "
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "InstanceDetails"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r5, r4, r3)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda104 r4 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda104
            r4.<init>(r2, r3)
            r2.runOnUiThread(r4)
        L36:
            return
    }

    private /* synthetic */ void lambda$requestMetadataSearchFilter$85() {
            r1 = this;
            r0 = 0
            r1.pendingMetadataSearchFilterRunnable = r0
            r0 = 1
            r1.requestContentSearchFilter(r0)
            return
    }

    private /* synthetic */ void lambda$requireMicrosoftLoginHistoryBeforeLaunch$3(java.lang.Runnable r1) {
            r0 = this;
            r0.signInWithMicrosoftThen(r1)
            return
    }

    private /* synthetic */ void lambda$runLoaderUpdate$50(ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.UpdateResult r2) {
            r1 = this;
            java.lang.String r0 = "Loader updated"
            r1.applyVersionUpdateResult(r2, r0)
            return
    }

    private /* synthetic */ void lambda$runLoaderUpdate$51(java.lang.Throwable r3) {
            r2 = this;
            r2.dismissUpdateProgressDialog()
            r0 = 0
            r2.setVersionUpdateInProgress(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Loader update failed: "
            r0.<init>(r1)
            java.lang.String r3 = r2.readableError(r3)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r0 = 1
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r0)
            r3.show()
            return
    }

    private /* synthetic */ void lambda$runLoaderUpdate$52(ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderVersion r7) {
            r6 = this;
            java.io.File r1 = r6.rootDirectory     // Catch: java.lang.Throwable -> L1a
            java.io.File r2 = r6.gameDirectory     // Catch: java.lang.Throwable -> L1a
            java.lang.String r3 = r6.instanceName     // Catch: java.lang.Throwable -> L1a
            ca.dnamobile.javalauncher.InstanceDetailsActivity$13 r5 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$13     // Catch: java.lang.Throwable -> L1a
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L1a
            r0 = r6
            r4 = r7
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$UpdateResult r7 = ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.updateInstanceLoader(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L1a
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda92 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda92     // Catch: java.lang.Throwable -> L1a
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> L1a
            r6.runOnUiThread(r0)     // Catch: java.lang.Throwable -> L1a
            goto L2a
        L1a:
            r7 = move-exception
            java.lang.String r0 = "InstanceDetails"
            java.lang.String r1 = "Unable to update instance loader"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r1, r7)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda103 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda103
            r0.<init>(r6, r7)
            r6.runOnUiThread(r0)
        L2a:
            return
    }

    private /* synthetic */ void lambda$runModpackUpdate$40(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Updating instance to Minecraft "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = "..."
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.setUpdateProgressMessage(r3)
            r3 = 0
            r0 = 4
            r2.setUpdateProgress(r3, r0)
            return
    }

    private /* synthetic */ void lambda$runModpackUpdate$41(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.UpdateResult r1, ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.UpdateResult r2) {
            r0 = this;
            r0.applyModpackUpdateResult(r1, r2)
            return
    }

    private /* synthetic */ void lambda$runModpackUpdate$42(java.lang.Throwable r3) {
            r2 = this;
            r2.dismissUpdateProgressDialog()
            r0 = 0
            r2.setVersionUpdateInProgress(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Modpack update failed: "
            r0.<init>(r1)
            java.lang.String r3 = r2.readableError(r3)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r0 = 1
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r0)
            r3.show()
            return
    }

    private /* synthetic */ void lambda$runModpackUpdate$43(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo r10, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.ProjectMatch r11, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo r12) {
            r9 = this;
            java.io.File r1 = r9.rootDirectory     // Catch: java.lang.Throwable -> L5e
            java.io.File r2 = r9.gameDirectory     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = r9.getGameVersionIdForContent()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = r9.loader     // Catch: java.lang.Throwable -> L5e
            ca.dnamobile.javalauncher.InstanceDetailsActivity$9 r8 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$9     // Catch: java.lang.Throwable -> L5e
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L5e
            r0 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$UpdateResult r10 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.updateInstalledModpack(r0, r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L5e
            boolean r11 = r9.shouldUpdateInstanceBaseForModpack(r10)     // Catch: java.lang.Throwable -> L5e
            if (r11 == 0) goto L54
            java.lang.String r11 = r10.loader     // Catch: java.lang.Throwable -> L5e
            boolean r11 = r9.isBlank(r11)     // Catch: java.lang.Throwable -> L5e
            if (r11 == 0) goto L28
            java.lang.String r11 = r9.loader     // Catch: java.lang.Throwable -> L5e
            goto L2a
        L28:
            java.lang.String r11 = r10.loader     // Catch: java.lang.Throwable -> L5e
        L2a:
            r4 = r11
            java.lang.String r11 = r10.minecraftVersion     // Catch: java.lang.Throwable -> L5e
            boolean r11 = r9.isBlank(r11)     // Catch: java.lang.Throwable -> L5e
            if (r11 == 0) goto L38
            java.lang.String r11 = r9.getGameVersionIdForContent()     // Catch: java.lang.Throwable -> L5e
            goto L3a
        L38:
            java.lang.String r11 = r10.minecraftVersion     // Catch: java.lang.Throwable -> L5e
        L3a:
            r5 = r11
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda99 r11 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda99     // Catch: java.lang.Throwable -> L5e
            r11.<init>(r9, r5)     // Catch: java.lang.Throwable -> L5e
            r9.runOnUiThread(r11)     // Catch: java.lang.Throwable -> L5e
            java.io.File r1 = r9.rootDirectory     // Catch: java.lang.Throwable -> L5e
            java.io.File r2 = r9.gameDirectory     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = r9.instanceName     // Catch: java.lang.Throwable -> L5e
            ca.dnamobile.javalauncher.InstanceDetailsActivity$10 r6 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$10     // Catch: java.lang.Throwable -> L5e
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L5e
            r0 = r9
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$UpdateResult r11 = ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.updateInstanceVersion(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L5e
            goto L55
        L54:
            r11 = 0
        L55:
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda100 r12 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda100     // Catch: java.lang.Throwable -> L5e
            r12.<init>(r9, r10, r11)     // Catch: java.lang.Throwable -> L5e
            r9.runOnUiThread(r12)     // Catch: java.lang.Throwable -> L5e
            goto L6e
        L5e:
            r10 = move-exception
            java.lang.String r11 = "InstanceDetails"
            java.lang.String r12 = "Unable to update modpack"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r11, r12, r10)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda101 r11 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda101
            r11.<init>(r9, r10)
            r9.runOnUiThread(r11)
        L6e:
            return
    }

    private /* synthetic */ void lambda$runRepairInstance$54(int r2, java.lang.String r3) {
            r1 = this;
            r0 = 100
            r1.setUpdateProgress(r2, r0)
            r1.setUpdateProgressMessage(r3)
            return
    }

    private /* synthetic */ void lambda$runRepairInstance$55(int r2, java.lang.String r3) {
            r1 = this;
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda71 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda71
            r0.<init>(r1, r2, r3)
            r1.runOnUiThread(r0)
            return
    }

    private /* synthetic */ void lambda$runRepairInstance$56(java.lang.String r3) {
            r2 = this;
            r2.dismissUpdateProgressDialog()
            r0 = 0
            r2.setVersionUpdateInProgress(r0)
            r0 = -1
            r2.setResult(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Repair complete for Minecraft "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = "."
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r0 = 1
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r0)
            r3.show()
            return
    }

    private /* synthetic */ void lambda$runRepairInstance$57(java.lang.Throwable r3) {
            r2 = this;
            r2.dismissUpdateProgressDialog()
            r0 = 0
            r2.setVersionUpdateInProgress(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Repair failed: "
            r0.<init>(r1)
            java.lang.String r3 = r2.readableError(r3)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r0 = 1
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r0)
            r3.show()
            return
    }

    private /* synthetic */ void lambda$runRepairInstance$58(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "No Mojang metadata URL found for "
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r3)     // Catch: java.lang.Throwable -> L41
            ca.dnamobile.javalauncher.data.model.MinecraftVersion r1 = r3.resolveRepairManifestVersion(r4)     // Catch: java.lang.Throwable -> L41
            java.lang.String r2 = r1.getMetadataUrl()     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L2e
            java.lang.String r2 = r1.getMetadataUrl()     // Catch: java.lang.Throwable -> L41
            java.lang.String r2 = r2.trim()     // Catch: java.lang.Throwable -> L41
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L41
            if (r2 != 0) goto L2e
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda94 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda94     // Catch: java.lang.Throwable -> L41
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L41
            ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.installVanillaVersion(r3, r1, r0)     // Catch: java.lang.Throwable -> L41
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda95 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda95     // Catch: java.lang.Throwable -> L41
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L41
            r3.runOnUiThread(r0)     // Catch: java.lang.Throwable -> L41
            goto L60
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L41
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L41
            java.lang.StringBuilder r4 = r2.append(r4)     // Catch: java.lang.Throwable -> L41
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L41
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L41
            throw r1     // Catch: java.lang.Throwable -> L41
        L41:
            r4 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to repair instance "
            r0.<init>(r1)
            java.lang.String r1 = r3.instanceName
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "InstanceDetails"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r0, r4)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda96 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda96
            r0.<init>(r3, r4)
            r3.runOnUiThread(r0)
        L60:
            return
    }

    private /* synthetic */ void lambda$runVersionUpdate$25(ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.UpdateResult r2) {
            r1 = this;
            java.lang.String r0 = "Version updated"
            r1.applyVersionUpdateResult(r2, r0)
            return
    }

    private /* synthetic */ void lambda$runVersionUpdate$26(java.lang.Throwable r3) {
            r2 = this;
            r2.dismissUpdateProgressDialog()
            r0 = 0
            r2.setVersionUpdateInProgress(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Version update failed: "
            r0.<init>(r1)
            java.lang.String r3 = r2.readableError(r3)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r0 = 1
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r0)
            r3.show()
            return
    }

    private /* synthetic */ void lambda$runVersionUpdate$27(java.lang.String r8) {
            r7 = this;
            java.io.File r1 = r7.rootDirectory     // Catch: java.lang.Throwable -> L1c
            java.io.File r2 = r7.gameDirectory     // Catch: java.lang.Throwable -> L1c
            java.lang.String r3 = r7.instanceName     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = r7.loader     // Catch: java.lang.Throwable -> L1c
            ca.dnamobile.javalauncher.InstanceDetailsActivity$6 r6 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$6     // Catch: java.lang.Throwable -> L1c
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L1c
            r0 = r7
            r5 = r8
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$UpdateResult r8 = ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.updateInstanceVersion(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L1c
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda35 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda35     // Catch: java.lang.Throwable -> L1c
            r0.<init>(r7, r8)     // Catch: java.lang.Throwable -> L1c
            r7.runOnUiThread(r0)     // Catch: java.lang.Throwable -> L1c
            goto L2c
        L1c:
            r8 = move-exception
            java.lang.String r0 = "InstanceDetails"
            java.lang.String r1 = "Unable to update instance version"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r1, r8)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda36 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda36
            r0.<init>(r7, r8)
            r7.runOnUiThread(r0)
        L2c:
            return
    }

    private /* synthetic */ void lambda$savePickedInstanceIcon$70(ca.dnamobile.javalauncher.instance.LauncherInstance r2) {
            r1 = this;
            r1.applyUpdatedInstance(r2)
            r1.bindInstanceIcon()
            r2 = 0
            r1.setInstanceEditInProgress(r2)
            r0 = -1
            r1.setResult(r0)
            int r0 = ca.dnamobile.javalauncher.R.string.instance_icon_update_success
            android.widget.Toast r2 = android.widget.Toast.makeText(r1, r0, r2)
            r2.show()
            return
    }

    private /* synthetic */ void lambda$savePickedInstanceIcon$71(java.lang.Throwable r2) {
            r1 = this;
            r0 = 0
            r1.setInstanceEditInProgress(r0)
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto Lf
            java.lang.String r2 = r2.getMessage()
            goto L17
        Lf:
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getSimpleName()
        L17:
            int r0 = ca.dnamobile.javalauncher.R.string.instance_icon_update_failed
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r2 = r1.getString(r0, r2)
            r0 = 1
            android.widget.Toast r2 = android.widget.Toast.makeText(r1, r2, r0)
            r2.show()
            return
    }

    private /* synthetic */ void lambda$savePickedInstanceIcon$72(java.io.File r2, android.net.Uri r3) {
            r1 = this;
            ca.dnamobile.javalauncher.instance.LauncherInstance r2 = ca.dnamobile.javalauncher.instance.LauncherInstanceManager.updateInstanceIcon(r1, r2, r3)     // Catch: java.lang.Throwable -> Ld
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda115 r3 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda115     // Catch: java.lang.Throwable -> Ld
            r3.<init>(r1, r2)     // Catch: java.lang.Throwable -> Ld
            r1.runOnUiThread(r3)     // Catch: java.lang.Throwable -> Ld
            goto L1d
        Ld:
            r2 = move-exception
            java.lang.String r3 = "InstanceDetails"
            java.lang.String r0 = "Unable to update instance icon"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r3, r0, r2)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda116 r3 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda116
            r3.<init>(r1, r2)
            r1.runOnUiThread(r3)
        L1d:
            return
    }

    private /* synthetic */ void lambda$setContentItemEnabled$90(boolean r2, java.lang.Throwable r3, java.lang.String r4, java.io.File r5, ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory r6, boolean r7, java.lang.String r8, java.io.File r9) {
            r1 = this;
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r1.binding
            if (r0 == 0) goto L6a
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L6a
            boolean r0 = r1.isDestroyed()
            if (r0 == 0) goto L11
            goto L6a
        L11:
            r0 = 0
            if (r2 == 0) goto L30
            if (r3 != 0) goto L30
            r1.replaceContentItemAfterToggle(r4, r5, r6)
            if (r7 == 0) goto L1e
            int r2 = ca.dnamobile.javalauncher.R.string.instance_content_enabled_success
            goto L20
        L1e:
            int r2 = ca.dnamobile.javalauncher.R.string.instance_content_disabled_success
        L20:
            java.lang.Object[] r3 = new java.lang.Object[]{r8}
            java.lang.String r2 = r1.getString(r2, r3)
            android.widget.Toast r2 = android.widget.Toast.makeText(r1, r2, r0)
            r2.show()
            goto L65
        L30:
            r1.notifyContentItemChangedByPath(r9)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r4 = ca.dnamobile.javalauncher.R.string.instance_content_toggle_failed
            java.lang.Object[] r5 = new java.lang.Object[]{r8}
            java.lang.String r4 = r1.getString(r4, r5)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r4 = ": "
            java.lang.StringBuilder r2 = r2.append(r4)
            if (r3 != 0) goto L51
            java.lang.String r3 = "Unknown error"
            goto L55
        L51:
            java.lang.String r3 = r1.readableError(r3)
        L55:
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 1
            android.widget.Toast r2 = android.widget.Toast.makeText(r1, r2, r3)
            r2.show()
        L65:
            java.lang.String r2 = ""
            r1.setContentOperationInProgress(r0, r2, r2)
        L6a:
            return
    }

    private /* synthetic */ void lambda$setContentItemEnabled$91(java.io.File r14, java.io.File r15, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r16, java.lang.String r17, ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory r18, boolean r19, java.lang.String r20) {
            r13 = this;
            r11 = r13
            r0 = r16
            java.lang.String r1 = "Unable to rename "
            java.lang.String r2 = "Target already exists: "
            java.lang.String r3 = "File no longer exists: "
            r4 = 0
            boolean r5 = r14.exists()     // Catch: java.lang.Throwable -> L7a
            if (r5 == 0) goto L5f
            boolean r3 = r15.exists()     // Catch: java.lang.Throwable -> L7a
            if (r3 != 0) goto L46
            boolean r2 = r14.renameTo(r15)     // Catch: java.lang.Throwable -> L7a
            if (r2 == 0) goto L2d
            r4 = 1
            java.io.File r1 = r11.gameDirectory     // Catch: java.lang.Throwable -> L7a
            if (r1 == 0) goto L29
            if (r0 == 0) goto L29
            r10 = r14
            r6 = r15
            ca.dnamobile.javalauncher.modmanager.ModManagerManifest.updateEntryFileTarget(r1, r0, r14, r15)     // Catch: java.lang.Throwable -> L78
            goto L2b
        L29:
            r10 = r14
            r6 = r15
        L2b:
            r0 = 0
            goto L95
        L2d:
            r10 = r14
            r6 = r15
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L78
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L78
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L78
            java.lang.String r1 = r14.getName()     // Catch: java.lang.Throwable -> L78
            java.lang.StringBuilder r1 = r2.append(r1)     // Catch: java.lang.Throwable -> L78
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L78
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L78
            throw r0     // Catch: java.lang.Throwable -> L78
        L46:
            r10 = r14
            r6 = r15
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L78
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L78
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L78
            java.lang.String r2 = r15.getName()     // Catch: java.lang.Throwable -> L78
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L78
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L78
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L78
            throw r0     // Catch: java.lang.Throwable -> L78
        L5f:
            r10 = r14
            r6 = r15
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L78
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L78
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L78
            java.lang.String r2 = r14.getName()     // Catch: java.lang.Throwable -> L78
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L78
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L78
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L78
            throw r0     // Catch: java.lang.Throwable -> L78
        L78:
            r0 = move-exception
            goto L7d
        L7a:
            r0 = move-exception
            r10 = r14
            r6 = r15
        L7d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to toggle content item "
            r1.<init>(r2)
            java.lang.String r2 = r14.getAbsolutePath()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "InstanceDetails"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r2, r1, r0)
        L95:
            r3 = r4
            r4 = r0
            android.os.Handler r0 = r11.mainHandler
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda105 r12 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda105
            r1 = r12
            r2 = r13
            r5 = r17
            r6 = r15
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0.post(r12)
            return
    }

    private /* synthetic */ void lambda$setupActions$4(android.view.View r1) {
            r0 = this;
            r0.launchInstance()
            return
    }

    private /* synthetic */ void lambda$setupActions$5(android.view.View r1) {
            r0 = this;
            r0.browseSelectedContent()
            return
    }

    private /* synthetic */ void lambda$setupActions$6(android.view.View r1) {
            r0 = this;
            r0.pickSelectedContent()
            return
    }

    private /* synthetic */ void lambda$setupActions$7(android.view.View r1) {
            r0 = this;
            r0.checkUpdatesForSelectedCategory()
            return
    }

    private /* synthetic */ void lambda$setupActions$8(android.view.View r1) {
            r0 = this;
            r0.updateAllAvailableForSelectedCategory()
            return
    }

    private /* synthetic */ boolean lambda$setupContentSearch$9(android.widget.TextView r4, int r5, android.view.KeyEvent r6) {
            r3 = this;
            r0 = 6
            r1 = 0
            r2 = 1
            if (r5 == r0) goto Le
            r0 = 3
            if (r5 == r0) goto Le
            r0 = 2
            if (r5 != r0) goto Lc
            goto Le
        Lc:
            r5 = r1
            goto Lf
        Le:
            r5 = r2
        Lf:
            if (r6 == 0) goto L21
            int r0 = r6.getAction()
            if (r0 != r2) goto L21
            int r6 = r6.getKeyCode()
            r0 = 66
            if (r6 != r0) goto L21
            r6 = r2
            goto L22
        L21:
            r6 = r1
        L22:
            if (r5 != 0) goto L28
            if (r6 == 0) goto L27
            goto L28
        L27:
            return r1
        L28:
            r3.finishContentSearchInput(r4)
            return r2
    }

    private /* synthetic */ boolean lambda$setupContentTabs$10(android.view.View r1, android.view.MotionEvent r2) {
            r0 = this;
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r1 = r0.binding
            com.google.android.material.textfield.TextInputEditText r1 = r1.editTextContentSearch
            boolean r1 = r1.hasFocus()
            if (r1 == 0) goto L11
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r1 = r0.binding
            com.google.android.material.textfield.TextInputEditText r1 = r1.editTextContentSearch
            r0.finishContentSearchInput(r1)
        L11:
            r1 = 0
            return r1
    }

    private /* synthetic */ void lambda$showContentLoadingSoon$84(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.pendingContentLoadingRunnable = r0
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r1.binding
            if (r0 == 0) goto L20
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L20
            boolean r0 = r1.isDestroyed()
            if (r0 == 0) goto L14
            goto L20
        L14:
            boolean r0 = r1.contentRefreshRunning
            if (r0 != 0) goto L1c
            boolean r0 = r1.contentOperationRunning
            if (r0 == 0) goto L20
        L1c:
            r0 = 1
            r1.setContentLoadingOverlayVisible(r0, r2, r3)
        L20:
            return
    }

    private /* synthetic */ void lambda$showDeleteContentItemDialog$86(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r1, android.content.DialogInterface r2, int r3) {
            r0 = this;
            r0.deleteContentItem(r1)
            return
    }

    private /* synthetic */ void lambda$showDeleteInstanceDialog$73(android.content.DialogInterface r1, int r2) {
            r0 = this;
            r0.deleteInstance()
            return
    }

    private /* synthetic */ void lambda$showEditInstanceNameDialog$65(android.widget.EditText r2, android.app.AlertDialog r3, android.view.View r4) {
            r1 = this;
            android.text.Editable r4 = r2.getText()
            if (r4 != 0) goto L9
            java.lang.String r4 = ""
            goto L11
        L9:
            android.text.Editable r4 = r2.getText()
            java.lang.String r4 = r4.toString()
        L11:
            java.lang.String r4 = r1.sanitizeInstanceName(r4)
            boolean r0 = r1.isBlank(r4)
            if (r0 == 0) goto L25
            int r3 = ca.dnamobile.javalauncher.R.string.instance_rename_empty
            java.lang.String r3 = r1.getString(r3)
            r2.setError(r3)
            return
        L25:
            java.lang.String r2 = r1.instanceName
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L31
            r3.dismiss()
            return
        L31:
            r1.renameInstance(r4, r3)
            return
    }

    private /* synthetic */ void lambda$showEditInstanceNameDialog$66(android.app.AlertDialog r2, android.widget.EditText r3, android.content.DialogInterface r4) {
            r1 = this;
            r4 = -1
            android.widget.Button r4 = r2.getButton(r4)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda123 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda123
            r0.<init>(r1, r3, r2)
            r4.setOnClickListener(r0)
            return
    }

    private /* synthetic */ void lambda$showExportModpackPlatformDialog$12(android.app.AlertDialog r1) {
            r0 = this;
            r1.dismiss()
            ca.dnamobile.javalauncher.modmanager.ModpackExportManager$Platform r1 = ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform.MODRINTH
            r0.startModpackExport(r1)
            return
    }

    private /* synthetic */ void lambda$showExportModpackPlatformDialog$13(android.app.AlertDialog r1) {
            r0 = this;
            r1.dismiss()
            ca.dnamobile.javalauncher.modmanager.ModpackExportManager$Platform r1 = ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform.CURSEFORGE
            r0.startModpackExport(r1)
            return
    }

    private /* synthetic */ void lambda$showExportModpackPlatformDialog$14(android.app.AlertDialog r1) {
            r0 = this;
            r1.dismiss()
            ca.dnamobile.javalauncher.modmanager.ModpackExportManager$Platform r1 = ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform.MULTIMC
            r0.startModpackExport(r1)
            return
    }

    private /* synthetic */ void lambda$showFolderPathFallback$64(java.lang.String r1, android.content.DialogInterface r2, int r3) {
            r0 = this;
            r0.copyTextToClipboard(r1)
            return
    }

    private /* synthetic */ void lambda$showFullscreenSafeDialog$1(android.content.DialogInterface r4) {
            r3 = this;
            android.os.Handler r4 = r3.mainHandler
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda32 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda32
            r0.<init>(r3)
            r1 = 80
            r4.postDelayed(r0, r1)
            return
    }

    private /* synthetic */ void lambda$showFullscreenSafeDialog$2(android.app.AlertDialog r1) {
            r0 = this;
            android.view.Window r1 = r1.getWindow()
            r0.applyFullscreenToWindow(r1)
            r0.enableFullscreen()
            return
    }

    private /* synthetic */ void lambda$showLoaderVersionSelector$48(java.util.ArrayList r1, java.lang.String r2, android.content.DialogInterface r3, int r4) {
            r0 = this;
            java.lang.Object r1 = r1.get(r4)
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderVersion r1 = (ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderVersion) r1
            r0.confirmUpdateLoader(r1, r2)
            return
    }

    private /* synthetic */ void lambda$showMinecraftReleaseSelector$22(java.util.ArrayList r1, android.content.DialogInterface r2, int r3) {
            r0 = this;
            java.lang.Object r1 = r1.get(r3)
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$MinecraftRelease r1 = (ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.MinecraftRelease) r1
            java.lang.String r1 = r1.id
            r0.confirmUpdateVersion(r1)
            return
    }

    private /* synthetic */ void lambda$showModpackBackupWarning$39(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo r1, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.ProjectMatch r2, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo r3, android.content.DialogInterface r4, int r5) {
            r0 = this;
            r0.runModpackUpdate(r1, r2, r3)
            return
    }

    private /* synthetic */ void lambda$showModpackProjectChooser$31(android.app.AlertDialog[] r2, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo r3, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.ProjectMatch r4) {
            r1 = this;
            r0 = 0
            r2 = r2[r0]
            if (r2 == 0) goto L8
            r2.dismiss()
        L8:
            r1.openModpackUpdateDetails(r3, r4)
            return
    }

    private /* synthetic */ void lambda$showModpackVersionChooser$35(int[] r2, int r3, android.widget.TextView r4, java.util.ArrayList r5, java.util.ArrayList r6) {
            r1 = this;
            r0 = 0
            r2[r0] = r3
            java.lang.Object r3 = r5.get(r3)
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo r3 = (ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo) r3
            r1.updateSelectedModpackVersionText(r4, r3)
            r2 = r2[r0]
            r1.updateModpackVersionRowSelection(r6, r2)
            return
    }

    static /* synthetic */ void lambda$showModpackVersionChooser$36(android.app.AlertDialog[] r0, android.view.View r1) {
            r1 = 0
            r0 = r0[r1]
            if (r0 == 0) goto L8
            r0.dismiss()
        L8:
            return
    }

    private /* synthetic */ void lambda$showModpackVersionChooser$37(int[] r2, java.util.ArrayList r3, android.app.AlertDialog[] r4, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo r5, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.ProjectMatch r6, android.view.View r7) {
            r1 = this;
            r7 = 0
            r2 = r2[r7]
            int r0 = r3.size()
            int r0 = r0 + (-1)
            int r2 = java.lang.Math.min(r2, r0)
            int r2 = java.lang.Math.max(r7, r2)
            java.lang.Object r2 = r3.get(r2)
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo r2 = (ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo) r2
            r3 = r4[r7]
            if (r3 == 0) goto L1e
            r3.dismiss()
        L1e:
            r1.showModpackBackupWarning(r5, r6, r2)
            return
    }

    private /* synthetic */ void lambda$showPerInstanceRamInputDialog$118(android.widget.EditText r1, int[] r2, boolean[] r3, com.google.android.material.switchmaterial.SwitchMaterial r4, android.widget.SeekBar r5, int r6, int r7, int r8, android.widget.TextView r9, int r10, android.app.AlertDialog r11, android.view.View r12) {
            r0 = this;
            android.text.Editable r12 = r1.getText()     // Catch: java.lang.Throwable -> L3b
            if (r12 != 0) goto L9
            java.lang.String r12 = ""
            goto L15
        L9:
            android.text.Editable r12 = r1.getText()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r12 = r12.trim()     // Catch: java.lang.Throwable -> L3b
        L15:
            int r1 = java.lang.Integer.parseInt(r12)     // Catch: java.lang.Throwable -> L3b
            int r1 = ca.dnamobile.javalauncher.settings.MemoryAllocationUtils.clampToAllowedRam(r0, r1)
            r12 = 0
            r2[r12] = r1
            r1 = 1
            r3[r12] = r1
            r4.setChecked(r1)
            r0.updatePerInstanceRamSliderState(r5, r1)
            r3 = r2[r12]
            int r3 = r0.perInstanceRamProgressFromMemory(r3, r6, r7, r8)
            r5.setProgress(r3)
            r2 = r2[r12]
            r0.updatePerInstanceRamText(r9, r1, r2, r10)
            r11.dismiss()
            return
        L3b:
            java.lang.String r2 = "Enter a number in MB."
            r1.setError(r2)
            return
    }

    private /* synthetic */ void lambda$showPerInstanceRamInputDialog$119(android.app.AlertDialog r16, android.widget.EditText r17, int[] r18, boolean[] r19, com.google.android.material.switchmaterial.SwitchMaterial r20, android.widget.SeekBar r21, int r22, int r23, int r24, android.widget.TextView r25, int r26, android.content.DialogInterface r27) {
            r15 = this;
            r0 = -1
            r13 = r16
            android.widget.Button r0 = r13.getButton(r0)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda18 r14 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda18
            r1 = r14
            r2 = r15
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r26
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0.setOnClickListener(r14)
            return
    }

    private /* synthetic */ void lambda$showRendererPluginStorageDialog$61(java.lang.String r1, android.content.DialogInterface r2, int r3) {
            r0 = this;
            r0.continueLaunchInstance(r1)
            return
    }

    private /* synthetic */ void lambda$showRendererPluginStorageDialog$62(ca.dnamobile.javalauncher.renderer.RendererInterface r1, android.content.DialogInterface r2, int r3) {
            r0 = this;
            ca.dnamobile.javalauncher.renderer.RendererPluginManager.openPluginApp(r0, r1)
            return
    }

    private /* synthetic */ void lambda$showRendererPluginStorageDialog$63(java.lang.String r1, android.content.DialogInterface r2, int r3) {
            r0 = this;
            r0.openMobileGluesFolderPicker(r1)
            return
    }

    private /* synthetic */ void lambda$showRepairInstanceDialog$53(android.content.DialogInterface r1, int r2) {
            r0 = this;
            r0.runRepairInstance()
            return
    }

    private /* synthetic */ void lambda$showUpdateLoaderDialog$45(ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind r1, java.util.ArrayList r2) {
            r0 = this;
            r0.dismissUpdateProgressDialog()
            r0.showLoaderVersionSelector(r1, r2)
            return
    }

    private /* synthetic */ void lambda$showUpdateLoaderDialog$46(java.lang.Throwable r3) {
            r2 = this;
            r2.dismissUpdateProgressDialog()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to load loader versions: "
            r0.<init>(r1)
            java.lang.String r3 = r2.readableError(r3)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r0 = 1
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r0)
            r3.show()
            return
    }

    private /* synthetic */ void lambda$showUpdateLoaderDialog$47(ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind r2, java.lang.String r3) {
            r1 = this;
            java.util.ArrayList r3 = ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.fetchLoaderVersions(r2, r3)     // Catch: java.lang.Throwable -> Ld
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda20 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda20     // Catch: java.lang.Throwable -> Ld
            r0.<init>(r1, r2, r3)     // Catch: java.lang.Throwable -> Ld
            r1.runOnUiThread(r0)     // Catch: java.lang.Throwable -> Ld
            goto L1d
        Ld:
            r2 = move-exception
            java.lang.String r3 = "InstanceDetails"
            java.lang.String r0 = "Unable to load loader versions"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r3, r0, r2)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda21 r3 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda21
            r3.<init>(r1, r2)
            r1.runOnUiThread(r3)
        L1d:
            return
    }

    private /* synthetic */ void lambda$showUpdateModpackDialog$28(java.util.ArrayList r2, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo r3) {
            r1 = this;
            r1.dismissUpdateProgressDialog()
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L29
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "No matching Modrinth or CurseForge modpack was found for "
            r2.<init>(r0)
            java.lang.String r3 = r3.displayTitle
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 1
            android.widget.Toast r2 = android.widget.Toast.makeText(r1, r2, r3)
            r2.show()
            return
        L29:
            r1.showModpackProjectChooser(r3, r2)
            return
    }

    private /* synthetic */ void lambda$showUpdateModpackDialog$29(java.lang.Throwable r3) {
            r2 = this;
            r2.dismissUpdateProgressDialog()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Modpack lookup failed: "
            r0.<init>(r1)
            java.lang.String r3 = r2.readableError(r3)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r0 = 1
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r0)
            r3.show()
            return
    }

    private /* synthetic */ void lambda$showUpdateModpackDialog$30(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo r3) {
            r2 = this;
            ca.dnamobile.javalauncher.InstanceDetailsActivity$7 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$7     // Catch: java.lang.Throwable -> L12
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L12
            java.util.ArrayList r0 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.findMatchingProjects(r2, r3, r0)     // Catch: java.lang.Throwable -> L12
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda8 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda8     // Catch: java.lang.Throwable -> L12
            r1.<init>(r2, r0, r3)     // Catch: java.lang.Throwable -> L12
            r2.runOnUiThread(r1)     // Catch: java.lang.Throwable -> L12
            goto L22
        L12:
            r3 = move-exception
            java.lang.String r0 = "InstanceDetails"
            java.lang.String r1 = "Unable to find matching modpack projects"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r1, r3)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda9 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda9
            r0.<init>(r2, r3)
            r2.runOnUiThread(r0)
        L22:
            return
    }

    private /* synthetic */ void lambda$showUpdateProgressDialog$110(android.content.DialogInterface r2) {
            r1 = this;
            android.view.Window r2 = r1.getWindow()
            r0 = 128(0x80, float:1.8E-43)
            r2.clearFlags(r0)
            return
    }

    private /* synthetic */ void lambda$showUpdateVersionDialog$19(java.util.ArrayList r1) {
            r0 = this;
            r0.dismissUpdateProgressDialog()
            r0.showMinecraftReleaseSelector(r1)
            return
    }

    private /* synthetic */ void lambda$showUpdateVersionDialog$20(java.lang.Throwable r3) {
            r2 = this;
            r2.dismissUpdateProgressDialog()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to load versions: "
            r0.<init>(r1)
            java.lang.String r3 = r2.readableError(r3)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r0 = 1
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r0)
            r3.show()
            return
    }

    private /* synthetic */ void lambda$showUpdateVersionDialog$21() {
            r3 = this;
            java.util.ArrayList r0 = ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.fetchMinecraftReleases()     // Catch: java.lang.Throwable -> Ld
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda33 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda33     // Catch: java.lang.Throwable -> Ld
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> Ld
            r3.runOnUiThread(r1)     // Catch: java.lang.Throwable -> Ld
            goto L1d
        Ld:
            r0 = move-exception
            java.lang.String r1 = "InstanceDetails"
            java.lang.String r2 = "Unable to load Minecraft release versions"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r2, r0)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda34 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda34
            r1.<init>(r3, r0)
            r3.runOnUiThread(r1)
        L1d:
            return
    }

    static /* synthetic */ void lambda$showVersionSelectionDialog$23(android.app.AlertDialog r0, android.content.DialogInterface.OnClickListener r1, android.widget.AdapterView r2, android.view.View r3, int r4, long r5) {
            r0.dismiss()
            r1.onClick(r0, r4)
            return
    }

    private /* synthetic */ void lambda$startModpackExport$16(ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform r1, ca.dnamobile.javalauncher.modmanager.ModpackExportManager.ExportOptions r2) {
            r0 = this;
            r0.beginModpackExport(r1, r2)
            return
    }

    private /* synthetic */ void lambda$updateAllAvailableForSelectedCategory$102(java.util.ArrayList r1, android.content.DialogInterface r2, int r3) {
            r0 = this;
            r0.updateAllCandidates(r1)
            return
    }

    private /* synthetic */ void lambda$updateAllCandidates$106(java.util.ArrayList r4, int r5) {
            r3 = this;
            r3.dismissUpdateProgressDialog()
            java.util.Iterator r0 = r4.iterator()
        L7:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r0.next()
            ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager$UpdateCandidate r1 = (ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.UpdateCandidate) r1
            java.lang.String r1 = r3.buildUpdateKey(r1)
            java.util.Map<java.lang.String, ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager$UpdateCandidate> r2 = r3.updateCandidates
            r2.remove(r1)
            java.util.Map<java.lang.String, ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState> r2 = r3.updateStates
            r2.remove(r1)
            java.util.Map<java.lang.String, java.lang.String> r2 = r3.updateMessages
            r2.remove(r1)
            goto L7
        L27:
            r3.refreshContentList()
            r0 = -1
            r3.setResult(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = ca.dnamobile.javalauncher.R.string.instance_content_update_all_success
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r4 = r3.getString(r1, r4)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r5 = r3.formatUpdateCleanupSuffix(r5)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r5 = 1
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r5)
            r4.show()
            return
    }

    private /* synthetic */ void lambda$updateAllCandidates$107(java.lang.Throwable r3) {
            r2 = this;
            r2.dismissUpdateProgressDialog()
            r2.refreshContentList()
            int r0 = ca.dnamobile.javalauncher.R.string.instance_content_update_all_failed
            java.lang.String r1 = r3.getMessage()
            if (r1 == 0) goto L13
            java.lang.String r3 = r3.getMessage()
            goto L1b
        L13:
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getSimpleName()
        L1b:
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r3 = r2.getString(r0, r3)
            r0 = 1
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r0)
            r3.show()
            return
    }

    private /* synthetic */ void lambda$updateAllCandidates$108(java.util.ArrayList r7, java.util.ArrayList r8) {
            r6 = this;
            java.io.File r1 = r6.gameDirectory     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = r6.getGameVersionIdForContent()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r3 = r6.loader     // Catch: java.lang.Throwable -> L1f
            ca.dnamobile.javalauncher.InstanceDetailsActivity$16 r5 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$16     // Catch: java.lang.Throwable -> L1f
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L1f
            r0 = r6
            r4 = r7
            ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.updateAll(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L1f
            int r8 = r6.finalizeContentUpdateCleanup(r8)     // Catch: java.lang.Throwable -> L1f
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda26 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda26     // Catch: java.lang.Throwable -> L1f
            r0.<init>(r6, r7, r8)     // Catch: java.lang.Throwable -> L1f
            r6.runOnUiThread(r0)     // Catch: java.lang.Throwable -> L1f
            goto L2f
        L1f:
            r7 = move-exception
            java.lang.String r8 = "InstanceDetails"
            java.lang.String r0 = "Unable to update all content"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r8, r0, r7)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda27 r8 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda27
            r8.<init>(r6, r7)
            r6.runOnUiThread(r8)
        L2f:
            return
    }

    private /* synthetic */ void lambda$updateCandidate$103(java.lang.String r2, ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.UpdateCandidate r3, int r4) {
            r1 = this;
            r1.dismissUpdateProgressDialog()
            java.util.Map<java.lang.String, ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager$UpdateCandidate> r0 = r1.updateCandidates
            r0.remove(r2)
            java.util.Map<java.lang.String, ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState> r0 = r1.updateStates
            r0.remove(r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.updateMessages
            r0.remove(r2)
            r1.refreshContentList()
            r2 = -1
            r1.setResult(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r0 = ca.dnamobile.javalauncher.R.string.instance_content_update_success
            java.lang.String r3 = r3.getDisplayName()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r3 = r1.getString(r0, r3)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r1.formatUpdateCleanupSuffix(r4)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 1
            android.widget.Toast r2 = android.widget.Toast.makeText(r1, r2, r3)
            r2.show()
            return
    }

    private /* synthetic */ void lambda$updateCandidate$104(java.lang.String r3, java.lang.Throwable r4, ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.UpdateCandidate r5) {
            r2 = this;
            r2.dismissUpdateProgressDialog()
            java.util.Map<java.lang.String, ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState> r0 = r2.updateStates
            ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState r1 = ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState.ERROR
            r0.put(r3, r1)
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.updateMessages
            java.lang.String r1 = r4.getMessage()
            if (r1 == 0) goto L17
            java.lang.String r4 = r4.getMessage()
            goto L1f
        L17:
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
        L1f:
            r0.put(r3, r4)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter r4 = r2.contentAdapter
            if (r4 == 0) goto L29
            r4.notifyDataSetChanged()
        L29:
            int r4 = ca.dnamobile.javalauncher.R.string.instance_content_update_failed
            java.lang.String r5 = r5.getDisplayName()
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.updateMessages
            java.lang.Object r3 = r0.get(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r5, r3}
            java.lang.String r3 = r2.getString(r4, r3)
            r4 = 1
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r4)
            r3.show()
            return
    }

    private /* synthetic */ void lambda$updateCandidate$105(ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.UpdateCandidate r8, ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateCleanupPlan r9, java.lang.String r10) {
            r7 = this;
            r0 = 1
            java.lang.Throwable[] r0 = new java.lang.Throwable[r0]     // Catch: java.lang.Throwable -> L2c
            java.io.File r2 = r7.gameDirectory     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = r7.getGameVersionIdForContent()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r4 = r7.loader     // Catch: java.lang.Throwable -> L2c
            ca.dnamobile.javalauncher.InstanceDetailsActivity$15 r6 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$15     // Catch: java.lang.Throwable -> L2c
            r6.<init>(r7, r0)     // Catch: java.lang.Throwable -> L2c
            r1 = r7
            r5 = r8
            ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.updateCandidate(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2c
            r1 = 0
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L2c
            if (r0 != 0) goto L2b
            java.util.List r9 = java.util.Collections.singletonList(r9)     // Catch: java.lang.Throwable -> L2c
            int r9 = r7.finalizeContentUpdateCleanup(r9)     // Catch: java.lang.Throwable -> L2c
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda29 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda29     // Catch: java.lang.Throwable -> L2c
            r0.<init>(r7, r10, r8, r9)     // Catch: java.lang.Throwable -> L2c
            r7.runOnUiThread(r0)     // Catch: java.lang.Throwable -> L2c
            goto L3c
        L2b:
            throw r0     // Catch: java.lang.Throwable -> L2c
        L2c:
            r9 = move-exception
            java.lang.String r0 = "InstanceDetails"
            java.lang.String r1 = "Unable to update content item"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r1, r9)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda30 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda30
            r0.<init>(r7, r10, r9, r8)
            r7.runOnUiThread(r0)
        L3c:
            return
    }

    private java.lang.String lastFolderName(java.lang.String r3) {
            r2 = this;
            java.lang.String r3 = r2.normalizeZipPath(r3)
        L4:
            java.lang.String r0 = "/"
            boolean r0 = r3.endsWith(r0)
            if (r0 == 0) goto L18
            int r0 = r3.length()
            int r0 = r0 + (-1)
            r1 = 0
            java.lang.String r3 = r3.substring(r1, r0)
            goto L4
        L18:
            r0 = 47
            int r0 = r3.lastIndexOf(r0)
            if (r0 < 0) goto L26
            int r0 = r0 + 1
            java.lang.String r3 = r3.substring(r0)
        L26:
            return r3
    }

    private void launchInstance() {
            r1 = this;
            r0 = 0
            r1.launchInstance(r0)
            return
    }

    private void launchInstance(java.lang.String r3) {
            r2 = this;
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda120 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda120
            r0.<init>(r2, r3)
            boolean r0 = r2.requireMicrosoftLoginHistoryBeforeLaunch(r0)
            if (r0 == 0) goto Lc
            return
        Lc:
            ca.dnamobile.javalauncher.renderer.Renderers.reload(r2)
            ca.dnamobile.javalauncher.renderer.RendererInterface r0 = ca.dnamobile.javalauncher.renderer.Renderers.getSelectedRenderer(r2)
            boolean r1 = ca.dnamobile.javalauncher.renderer.MobileGluesConfigHelper.isMobileGluesRenderer(r0)
            if (r1 == 0) goto L23
            boolean r1 = ca.dnamobile.javalauncher.renderer.MobileGluesConfigHelper.hasStorageAccess(r2)
            if (r1 != 0) goto L23
            r2.showRendererPluginStorageDialog(r0, r3)
            return
        L23:
            r2.continueLaunchInstance(r3)
            return
    }

    private ca.dnamobile.javalauncher.InstanceDetailsActivity.LoadedContentMetadata loadContentMetadataForItem(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r6) {
            r5 = this;
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r0 = r6.category
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r1 = ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory.MODS
            r2 = 0
            if (r0 != r1) goto L59
            java.io.File r0 = r6.file
            boolean r0 = r0.isFile()
            if (r0 == 0) goto L59
            java.io.File r0 = r6.file
            ca.dnamobile.javalauncher.modmanager.ModJarMetadataExtractor$Result r0 = ca.dnamobile.javalauncher.modmanager.ModJarMetadataExtractor.read(r0)
            if (r0 == 0) goto L23
            java.lang.String r2 = r0.getDisplayName()
            android.graphics.Bitmap r0 = r0.getIcon()
            r4 = r2
            r2 = r0
            r0 = r4
            goto L24
        L23:
            r0 = r2
        L24:
            if (r2 != 0) goto L4d
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L4d
            java.io.File r3 = r6.file     // Catch: java.lang.Throwable -> L4d
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L4d
            android.graphics.Bitmap r2 = r5.loadModIcon(r1)     // Catch: java.lang.Throwable -> L43
            if (r2 != 0) goto L39
            java.lang.String r3 = "pack.png"
            android.graphics.Bitmap r2 = r5.decodeZipBitmap(r1, r3)     // Catch: java.lang.Throwable -> L43
        L39:
            if (r2 != 0) goto L3f
            android.graphics.Bitmap r2 = r5.decodeFirstLikelyIcon(r1)     // Catch: java.lang.Throwable -> L43
        L3f:
            r1.close()     // Catch: java.lang.Throwable -> L4d
            goto L4d
        L43:
            r3 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L48
            goto L4c
        L48:
            r1 = move-exception
            r3.addSuppressed(r1)     // Catch: java.lang.Throwable -> L4d
        L4c:
            throw r3     // Catch: java.lang.Throwable -> L4d
        L4d:
            if (r2 != 0) goto L53
            android.graphics.Bitmap r2 = r5.loadManifestIconForItem(r6)
        L53:
            ca.dnamobile.javalauncher.InstanceDetailsActivity$LoadedContentMetadata r6 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$LoadedContentMetadata
            r6.<init>(r0, r2)
            return r6
        L59:
            android.graphics.Bitmap r6 = r5.loadIconForItem(r6)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$LoadedContentMetadata r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$LoadedContentMetadata
            r0.<init>(r2, r6)
            return r0
    }

    private android.graphics.Bitmap loadIconForItem(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r6) {
            r5 = this;
            java.io.File r0 = r6.file
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r1 = r6.category
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r2 = ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory.WORLDS
            java.lang.String r3 = "icon.png"
            if (r1 != r2) goto L20
            java.io.File r6 = new java.io.File
            r6.<init>(r0, r3)
            boolean r0 = r6.isFile()
            if (r0 == 0) goto L1e
            java.lang.String r6 = r6.getAbsolutePath()
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeFile(r6)
            return r6
        L1e:
            r6 = 0
            return r6
        L20:
            boolean r2 = r0.isDirectory()
            java.lang.String r4 = "pack.png"
            if (r2 == 0) goto L55
            java.io.File r1 = new java.io.File
            r1.<init>(r0, r4)
            boolean r2 = r1.isFile()
            if (r2 == 0) goto L3c
            java.lang.String r6 = r1.getAbsolutePath()
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeFile(r6)
            return r6
        L3c:
            java.io.File r1 = new java.io.File
            r1.<init>(r0, r3)
            boolean r0 = r1.isFile()
            if (r0 == 0) goto L50
            java.lang.String r6 = r1.getAbsolutePath()
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeFile(r6)
            return r6
        L50:
            android.graphics.Bitmap r6 = r5.loadManifestIconForItem(r6)
            return r6
        L55:
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r2 = ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory.MODS
            if (r1 != r2) goto L60
            android.graphics.Bitmap r2 = ca.dnamobile.javalauncher.modmanager.ModJarMetadataExtractor.readIcon(r0)
            if (r2 == 0) goto L60
            return r2
        L60:
            java.util.zip.ZipFile r2 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L99
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L99
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r0 = ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory.MODS     // Catch: java.lang.Throwable -> L8f
            if (r1 != r0) goto L73
            android.graphics.Bitmap r0 = r5.loadModIcon(r2)     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto L73
            r2.close()     // Catch: java.lang.Throwable -> L99
            return r0
        L73:
            android.graphics.Bitmap r0 = r5.decodeZipBitmap(r2, r4)     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto L7d
            r2.close()     // Catch: java.lang.Throwable -> L99
            return r0
        L7d:
            android.graphics.Bitmap r0 = r5.decodeFirstLikelyIcon(r2)     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto L87
            r2.close()     // Catch: java.lang.Throwable -> L99
            return r0
        L87:
            android.graphics.Bitmap r0 = r5.loadManifestIconForItem(r6)     // Catch: java.lang.Throwable -> L8f
            r2.close()     // Catch: java.lang.Throwable -> L99
            return r0
        L8f:
            r0 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L94
            goto L98
        L94:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch: java.lang.Throwable -> L99
        L98:
            throw r0     // Catch: java.lang.Throwable -> L99
        L99:
            android.graphics.Bitmap r6 = r5.loadManifestIconForItem(r6)
            return r6
    }

    private android.graphics.Bitmap loadIconFromInstalledMetadata(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r4, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r5, org.json.JSONObject r6) {
            r3 = this;
            java.io.File r0 = r3.resolveLocalIconFileFromEntry(r6)
            if (r0 == 0) goto L17
            boolean r1 = r0.isFile()
            if (r1 == 0) goto L17
            java.lang.String r0 = r0.getAbsolutePath()
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r0)
            if (r0 == 0) goto L17
            return r0
        L17:
            java.lang.String r0 = r3.resolveIconUrlFromEntry(r6)
            boolean r1 = r3.isBlank(r0)
            r2 = 0
            if (r1 == 0) goto L23
            return r2
        L23:
            java.io.File r4 = r3.getInstalledContentIconCacheFile(r4, r5, r6)
            boolean r5 = r4.isFile()
            if (r5 == 0) goto L36
            java.lang.String r5 = r4.getAbsolutePath()
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeFile(r5)
            goto L37
        L36:
            r5 = r2
        L37:
            if (r5 == 0) goto L3a
            return r5
        L3a:
            android.graphics.Bitmap r4 = r3.downloadAndCacheBitmap(r0, r4, r2)
            return r4
    }

    private android.graphics.Bitmap loadManifestIconForItem(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r5) {
            r4 = this;
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r0 = r5.category
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = r4.toModManagerContentType(r0)
            r1 = 0
            if (r0 == 0) goto L3a
            java.io.File r2 = r4.gameDirectory
            if (r2 != 0) goto Le
            goto L3a
        Le:
            java.io.File r3 = r5.file
            java.io.File r2 = ca.dnamobile.javalauncher.modmanager.ModManagerManifest.getInstalledIconFileForFile(r2, r0, r3)
            if (r2 == 0) goto L27
            boolean r3 = r2.isFile()
            if (r3 == 0) goto L27
            java.lang.String r2 = r2.getAbsolutePath()
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeFile(r2)
            if (r2 == 0) goto L27
            return r2
        L27:
            org.json.JSONObject r2 = r4.getInstalledEntryForItem(r5)
            if (r2 != 0) goto L2e
            return r1
        L2e:
            android.graphics.Bitmap r1 = r4.loadIconFromInstalledMetadata(r5, r0, r2)
            if (r1 == 0) goto L35
            return r1
        L35:
            android.graphics.Bitmap r5 = r4.loadPlatformProjectIconForEntry(r5, r0, r2)
            return r5
        L3a:
            return r1
    }

    private android.graphics.Bitmap loadModIcon(java.util.zip.ZipFile r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "fabric.mod.json"
            java.lang.String r0 = r2.readZipEntryText(r3, r0)
            java.lang.String r0 = r2.extractJsonIconString(r0)
            android.graphics.Bitmap r0 = r2.decodeZipBitmap(r3, r0)
            if (r0 == 0) goto L11
            return r0
        L11:
            java.lang.String r0 = "quilt.mod.json"
            java.lang.String r0 = r2.readZipEntryText(r3, r0)
            java.lang.String r0 = r2.extractJsonIconString(r0)
            android.graphics.Bitmap r0 = r2.decodeZipBitmap(r3, r0)
            if (r0 == 0) goto L22
            return r0
        L22:
            java.lang.String r0 = "META-INF/mods.toml"
            java.lang.String r0 = r2.readZipEntryText(r3, r0)
            java.lang.String r1 = "logoFile"
            java.lang.String r0 = r2.extractTomlString(r0, r1)
            android.graphics.Bitmap r0 = r2.decodeZipBitmap(r3, r0)
            if (r0 == 0) goto L35
            return r0
        L35:
            java.lang.String r0 = "META-INF/neoforge.mods.toml"
            java.lang.String r0 = r2.readZipEntryText(r3, r0)
            java.lang.String r0 = r2.extractTomlString(r0, r1)
            android.graphics.Bitmap r3 = r2.decodeZipBitmap(r3, r0)
            if (r3 == 0) goto L46
            return r3
        L46:
            r3 = 0
            return r3
    }

    private void loadModpackVersions(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo r8, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.ProjectMatch r9) {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Loading "
            r0.<init>(r1)
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r1 = r9.platform
            java.lang.String r1 = r1.displayName
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " versions..."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r3 = r0.toString()
            r5 = 1
            r6 = 1
            java.lang.String r2 = "Update Modpack"
            r4 = 1
            r1 = r7
            r1.showUpdateProgressDialog(r2, r3, r4, r5, r6)
            java.lang.Thread r0 = new java.lang.Thread
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda111 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda111
            r1.<init>(r7, r9, r8)
            java.lang.String r8 = "Load Modpack Versions"
            r0.<init>(r1, r8)
            r0.start()
            return
    }

    private android.graphics.Bitmap loadPlatformProjectIconForEntry(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r5, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r6, org.json.JSONObject r7) {
            r4 = this;
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = ca.dnamobile.javalauncher.modmanager.ModManagerManifest.getSource(r7)
            java.lang.String r1 = r4.getProjectIdFromEntry(r7)
            boolean r2 = r4.isBlank(r1)
            r3 = 0
            if (r2 == 0) goto L10
            return r3
        L10:
            java.io.File r5 = r4.getInstalledContentIconCacheFile(r5, r6, r7)
            boolean r6 = r5.isFile()
            if (r6 == 0) goto L23
            java.lang.String r6 = r5.getAbsolutePath()
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeFile(r6)
            goto L24
        L23:
            r6 = r3
        L24:
            if (r6 == 0) goto L27
            return r6
        L27:
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r6 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.MODRINTH
            if (r0 != r6) goto L30
            java.lang.String r6 = r4.fetchModrinthProjectIconUrl(r1)
            goto L3b
        L30:
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r6 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.CURSEFORGE
            if (r0 != r6) goto L39
            java.lang.String r6 = r4.fetchCurseForgeProjectIconUrl(r1)
            goto L3b
        L39:
            java.lang.String r6 = ""
        L3b:
            boolean r7 = r4.isBlank(r6)
            if (r7 == 0) goto L42
            return r3
        L42:
            android.graphics.Bitmap r5 = r4.downloadAndCacheBitmap(r6, r5, r3)
            return r5
    }

    private void logOpenFolderEnvironment(java.io.File r13) {
            r12 = this;
            java.lang.String r0 = "[OpenFolder] selectedLocationMinecraftHomePath="
            java.lang.String r1 = "[OpenFolder] selectedLocationLauncherHomePath="
            java.lang.String r2 = "[OpenFolder] selectedLocationUri="
            java.lang.String r3 = "[OpenFolder] providerRoot="
            java.lang.String r4 = "[OpenFolder] providerAuthority="
            java.lang.String r5 = "[OpenFolder] defaultHome="
            java.lang.String r6 = "[OpenFolder] selectedLocationId="
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "[OpenFolder] package="
            r7.<init>(r8)
            java.lang.String r8 = r12.getPackageName()
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r8 = ", applicationId=ca.dnamobile.javalauncher, debugBuild=false"
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "InstanceDetails"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r8, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r9 = "[OpenFolder] target canonical="
            r7.<init>(r9)
            java.lang.String r9 = r12.safeCanonicalPath(r13)
            java.lang.StringBuilder r7 = r7.append(r9)
            java.lang.String r9 = ", exists="
            java.lang.StringBuilder r7 = r7.append(r9)
            boolean r10 = r13.exists()
            java.lang.StringBuilder r7 = r7.append(r10)
            java.lang.String r10 = ", isDirectory="
            java.lang.StringBuilder r7 = r7.append(r10)
            boolean r10 = r13.isDirectory()
            java.lang.StringBuilder r7 = r7.append(r10)
            java.lang.String r10 = ", canRead="
            java.lang.StringBuilder r7 = r7.append(r10)
            boolean r11 = r13.canRead()
            java.lang.StringBuilder r7 = r7.append(r11)
            java.lang.String r11 = ", canWrite="
            java.lang.StringBuilder r7 = r7.append(r11)
            boolean r13 = r13.canWrite()
            java.lang.StringBuilder r13 = r7.append(r13)
            java.lang.String r13 = r13.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r8, r13)
            ca.dnamobile.javalauncher.storage.StorageLocation r13 = ca.dnamobile.javalauncher.storage.StorageLocationStore.getSelectedLocation(r12)     // Catch: java.lang.Throwable -> Lf9
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf9
            r7.<init>(r6)     // Catch: java.lang.Throwable -> Lf9
            java.lang.String r6 = r13.getId()     // Catch: java.lang.Throwable -> Lf9
            java.lang.StringBuilder r6 = r7.append(r6)     // Catch: java.lang.Throwable -> Lf9
            java.lang.String r7 = ", selectedLocationName="
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> Lf9
            java.lang.String r7 = r13.getDisplayName()     // Catch: java.lang.Throwable -> Lf9
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> Lf9
            java.lang.String r7 = ", selectedLocationDefault="
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> Lf9
            boolean r7 = r13.isDefaultLocation()     // Catch: java.lang.Throwable -> Lf9
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> Lf9
            java.lang.String r7 = ", selectedLocationUsableForFileLaunch="
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> Lf9
            boolean r7 = r13.isUsableForFileLaunch()     // Catch: java.lang.Throwable -> Lf9
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> Lf9
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Lf9
            ca.dnamobile.javalauncher.feature.log.Logging.i(r8, r6)     // Catch: java.lang.Throwable -> Lf9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf9
            r6.<init>(r2)     // Catch: java.lang.Throwable -> Lf9
            java.lang.String r2 = r13.getUriString()     // Catch: java.lang.Throwable -> Lf9
            java.lang.StringBuilder r2 = r6.append(r2)     // Catch: java.lang.Throwable -> Lf9
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lf9
            ca.dnamobile.javalauncher.feature.log.Logging.i(r8, r2)     // Catch: java.lang.Throwable -> Lf9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf9
            r2.<init>(r1)     // Catch: java.lang.Throwable -> Lf9
            java.lang.String r1 = r13.getLauncherHomePath()     // Catch: java.lang.Throwable -> Lf9
            java.lang.StringBuilder r1 = r2.append(r1)     // Catch: java.lang.Throwable -> Lf9
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lf9
            ca.dnamobile.javalauncher.feature.log.Logging.i(r8, r1)     // Catch: java.lang.Throwable -> Lf9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf9
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lf9
            java.lang.String r13 = r13.getMinecraftHomePath()     // Catch: java.lang.Throwable -> Lf9
            java.lang.StringBuilder r13 = r1.append(r13)     // Catch: java.lang.Throwable -> Lf9
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> Lf9
            ca.dnamobile.javalauncher.feature.log.Logging.i(r8, r13)     // Catch: java.lang.Throwable -> Lf9
            goto L110
        Lf9:
            r13 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[OpenFolder] unable to read selected storage location: "
            r0.<init>(r1)
            java.lang.String r13 = r12.readableError(r13)
            java.lang.StringBuilder r13 = r0.append(r13)
            java.lang.String r13 = r13.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r8, r13)
        L110:
            java.io.File r13 = ca.dnamobile.javalauncher.utils.path.PathManager.getDefaultLauncherHome(r12)     // Catch: java.lang.Throwable -> L14d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14d
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L14d
            java.lang.String r1 = r13.getAbsolutePath()     // Catch: java.lang.Throwable -> L14d
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L14d
            java.lang.StringBuilder r0 = r0.append(r9)     // Catch: java.lang.Throwable -> L14d
            boolean r1 = r13.exists()     // Catch: java.lang.Throwable -> L14d
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L14d
            java.lang.StringBuilder r0 = r0.append(r10)     // Catch: java.lang.Throwable -> L14d
            boolean r1 = r13.canRead()     // Catch: java.lang.Throwable -> L14d
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L14d
            java.lang.StringBuilder r0 = r0.append(r11)     // Catch: java.lang.Throwable -> L14d
            boolean r13 = r13.canWrite()     // Catch: java.lang.Throwable -> L14d
            java.lang.StringBuilder r13 = r0.append(r13)     // Catch: java.lang.Throwable -> L14d
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L14d
            ca.dnamobile.javalauncher.feature.log.Logging.i(r8, r13)     // Catch: java.lang.Throwable -> L14d
            goto L164
        L14d:
            r13 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[OpenFolder] unable to resolve defaultHome: "
            r0.<init>(r1)
            java.lang.String r13 = r12.readableError(r13)
            java.lang.StringBuilder r13 = r0.append(r13)
            java.lang.String r13 = r13.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r8, r13)
        L164:
            java.io.File r13 = ca.dnamobile.javalauncher.storage.JavaLauncherDocumentsProvider.getRootDirectoryForContext(r12)     // Catch: java.lang.Throwable -> L1b5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b5
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L1b5
            java.lang.String r1 = ca.dnamobile.javalauncher.storage.JavaLauncherDocumentsProvider.getAuthority(r12)     // Catch: java.lang.Throwable -> L1b5
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L1b5
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1b5
            ca.dnamobile.javalauncher.feature.log.Logging.i(r8, r0)     // Catch: java.lang.Throwable -> L1b5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b5
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L1b5
            java.lang.String r1 = r13.getAbsolutePath()     // Catch: java.lang.Throwable -> L1b5
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L1b5
            java.lang.StringBuilder r0 = r0.append(r9)     // Catch: java.lang.Throwable -> L1b5
            boolean r1 = r13.exists()     // Catch: java.lang.Throwable -> L1b5
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L1b5
            java.lang.StringBuilder r0 = r0.append(r10)     // Catch: java.lang.Throwable -> L1b5
            boolean r1 = r13.canRead()     // Catch: java.lang.Throwable -> L1b5
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L1b5
            java.lang.StringBuilder r0 = r0.append(r11)     // Catch: java.lang.Throwable -> L1b5
            boolean r13 = r13.canWrite()     // Catch: java.lang.Throwable -> L1b5
            java.lang.StringBuilder r13 = r0.append(r13)     // Catch: java.lang.Throwable -> L1b5
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L1b5
            ca.dnamobile.javalauncher.feature.log.Logging.i(r8, r13)     // Catch: java.lang.Throwable -> L1b5
            goto L1cc
        L1b5:
            r13 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[OpenFolder] unable to resolve provider root: "
            r0.<init>(r1)
            java.lang.String r13 = r12.readableError(r13)
            java.lang.StringBuilder r13 = r0.append(r13)
            java.lang.String r13 = r13.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r8, r13)
        L1cc:
            return
    }

    private void markTrackedEntriesUpToDate(ca.dnamobile.javalauncher.modmanager.ModManagerContentType r5) {
            r4 = this;
            java.io.File r0 = r4.gameDirectory
            if (r0 != 0) goto L5
            return
        L5:
            r4.removeUpdateCandidatesForType(r5)
            java.io.File r0 = r4.gameDirectory
            java.util.ArrayList r0 = ca.dnamobile.javalauncher.modmanager.ModManagerManifest.getInstalledEntries(r0, r5)
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L42
            java.lang.Object r1 = r0.next()
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r2 = ca.dnamobile.javalauncher.modmanager.ModManagerManifest.getSource(r1)
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r3 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.MODRINTH
            if (r2 == r3) goto L2b
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r3 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.CURSEFORGE
            if (r2 == r3) goto L2b
            goto L12
        L2b:
            java.lang.String r1 = r4.buildUpdateKey(r5, r1)
            java.util.Map<java.lang.String, ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState> r2 = r4.updateStates
            ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState r3 = ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState.UP_TO_DATE
            r2.put(r1, r3)
            java.util.Map<java.lang.String, java.lang.String> r2 = r4.updateMessages
            int r3 = ca.dnamobile.javalauncher.R.string.instance_content_up_to_date
            java.lang.String r3 = r4.getString(r3)
            r2.put(r1, r3)
            goto L12
        L42:
            java.util.ArrayList r0 = r4.getModpackInstalledEntriesForType(r5)
            java.util.Iterator r0 = r0.iterator()
        L4a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L7a
            java.lang.Object r1 = r0.next()
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r2 = ca.dnamobile.javalauncher.modmanager.ModManagerManifest.getSource(r1)
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r3 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.MODRINTH
            if (r2 == r3) goto L63
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r3 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.CURSEFORGE
            if (r2 == r3) goto L63
            goto L4a
        L63:
            java.lang.String r1 = r4.buildUpdateKey(r5, r1)
            java.util.Map<java.lang.String, ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState> r2 = r4.updateStates
            ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState r3 = ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState.UP_TO_DATE
            r2.put(r1, r3)
            java.util.Map<java.lang.String, java.lang.String> r2 = r4.updateMessages
            int r3 = ca.dnamobile.javalauncher.R.string.instance_content_up_to_date
            java.lang.String r3 = r4.getString(r3)
            r2.put(r1, r3)
            goto L4a
        L7a:
            return
    }

    private boolean matchesContentSearch(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r7, java.lang.String r8) {
            r6 = this;
            java.lang.String r8 = r6.normalizeSearchText(r8)
            boolean r0 = r8.isEmpty()
            r1 = 1
            if (r0 == 0) goto Lc
            return r1
        Lc:
            java.util.Map<java.lang.String, java.lang.String> r0 = r6.contentSearchMetadata
            java.io.File r2 = r7.file
            java.lang.String r2 = r6.safeCanonicalPath(r2)
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r7.title
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.io.File r4 = r7.file
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.io.File r4 = r7.file
            java.lang.String r4 = r4.getName()
            java.lang.String r4 = r6.stripExtension(r4)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r3)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r7 = r7.category
            java.lang.String r7 = r7.name()
            java.lang.StringBuilder r7 = r2.append(r7)
            java.lang.StringBuilder r7 = r7.append(r3)
            if (r0 != 0) goto L5d
            java.lang.String r0 = ""
        L5d:
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.String r7 = r6.normalizeSearchText(r7)
            java.lang.String[] r8 = r8.split(r3)
            int r0 = r8.length
            r2 = 0
            r3 = r2
        L70:
            if (r3 >= r0) goto L8d
            r4 = r8[r3]
            java.lang.String r5 = r4.trim()
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L7f
            goto L8a
        L7f:
            java.lang.String r4 = r4.trim()
            boolean r4 = r7.contains(r4)
            if (r4 != 0) goto L8a
            return r2
        L8a:
            int r3 = r3 + 1
            goto L70
        L8d:
            return r1
    }

    private boolean matchesInstalledContentEntry(org.json.JSONObject r9, java.io.File r10) {
            r8 = this;
            java.lang.String r0 = r8.safeCanonicalPath(r10)
            java.lang.String r1 = "canonicalPath"
            java.lang.String r2 = ""
            java.lang.String r1 = r9.optString(r1, r2)
            boolean r1 = r8.matchesPathValue(r0, r1)
            r3 = 1
            if (r1 == 0) goto L14
            return r3
        L14:
            java.lang.String r1 = "absolutePath"
            java.lang.String r1 = r9.optString(r1, r2)
            boolean r0 = r8.matchesPathValue(r0, r1)
            if (r0 == 0) goto L21
            return r3
        L21:
            java.lang.String r0 = r8.getRelativePathFromGameDirectory(r10)
            java.lang.String r1 = r8.stripDisabledSuffix(r0)
            java.lang.String r4 = "relativePath"
            java.lang.String r5 = r9.optString(r4, r2)
            boolean r5 = r8.matchesRelativePath(r0, r5)
            if (r5 == 0) goto L36
            return r3
        L36:
            java.lang.String r5 = "filePath"
            java.lang.String r6 = r9.optString(r5, r2)
            boolean r6 = r8.matchesRelativePath(r0, r6)
            if (r6 == 0) goto L43
            return r3
        L43:
            java.lang.String r6 = "path"
            java.lang.String r7 = r9.optString(r6, r2)
            boolean r0 = r8.matchesRelativePath(r0, r7)
            if (r0 == 0) goto L50
            return r3
        L50:
            java.lang.String r0 = r9.optString(r4, r2)
            boolean r0 = r8.matchesRelativePath(r1, r0)
            if (r0 == 0) goto L5b
            return r3
        L5b:
            java.lang.String r0 = r9.optString(r5, r2)
            boolean r0 = r8.matchesRelativePath(r1, r0)
            if (r0 == 0) goto L66
            return r3
        L66:
            java.lang.String r0 = r9.optString(r6, r2)
            boolean r0 = r8.matchesRelativePath(r1, r0)
            if (r0 == 0) goto L71
            return r3
        L71:
            java.lang.String r0 = "fileName"
            java.lang.String r9 = r9.optString(r0, r2)
            boolean r0 = r8.isBlank(r9)
            if (r0 != 0) goto L90
            java.lang.String r10 = r10.getName()
            java.lang.String r10 = r8.stripDisabledSuffix(r10)
            java.lang.String r9 = r8.stripDisabledSuffix(r9)
            boolean r9 = r10.equalsIgnoreCase(r9)
            if (r9 == 0) goto L90
            goto L91
        L90:
            r3 = 0
        L91:
            return r3
    }

    private boolean matchesPathValue(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = r1.isBlank(r3)
            if (r0 == 0) goto L8
            r2 = 0
            return r2
        L8:
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            java.lang.String r3 = r1.safeCanonicalPath(r0)
            boolean r2 = r2.equals(r3)
            return r2
    }

    private boolean matchesRelativePath(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = r1.isBlank(r3)
            if (r0 == 0) goto L8
            r2 = 0
            return r2
        L8:
            java.lang.String r2 = r1.normalizeContentPath(r2)
            java.lang.String r3 = r1.normalizeContentPath(r3)
            boolean r2 = r2.equals(r3)
            return r2
    }

    private java.lang.String normalizeContentPath(java.lang.String r3) {
            r2 = this;
            r0 = 92
            r1 = 47
            java.lang.String r3 = r3.replace(r0, r1)
            java.lang.String r3 = r3.trim()
        Lc:
            java.lang.String r0 = "/"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L1a
            r0 = 1
            java.lang.String r3 = r3.substring(r0)
            goto Lc
        L1a:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = r3.toLowerCase(r0)
            return r3
    }

    private java.lang.String normalizeIconUrl(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = ""
            if (r4 != 0) goto L5
            return r0
        L5:
            java.lang.String r4 = r4.trim()
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L41
            java.lang.String r1 = "null"
            boolean r1 = r1.equalsIgnoreCase(r4)
            if (r1 == 0) goto L18
            goto L41
        L18:
            java.lang.String r1 = "//"
            boolean r1 = r4.startsWith(r1)
            if (r1 == 0) goto L2f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "https:"
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
        L2f:
            java.lang.String r1 = "http://"
            boolean r1 = r4.startsWith(r1)
            if (r1 != 0) goto L40
            java.lang.String r1 = "https://"
            boolean r1 = r4.startsWith(r1)
            if (r1 != 0) goto L40
            return r0
        L40:
            return r4
        L41:
            return r0
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

    private java.lang.String normalizeSearchText(java.lang.String r3) {
            r2 = this;
            if (r3 != 0) goto L5
            java.lang.String r3 = ""
            return r3
        L5:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = r3.toLowerCase(r0)
            r0 = 95
            r1 = 32
            java.lang.String r3 = r3.replace(r0, r1)
            r0 = 45
            java.lang.String r3 = r3.replace(r0, r1)
            r0 = 46
            java.lang.String r3 = r3.replace(r0, r1)
            r0 = 43
            java.lang.String r3 = r3.replace(r0, r1)
            java.lang.String r3 = r3.trim()
        L29:
            java.lang.String r0 = "  "
            boolean r1 = r3.contains(r0)
            if (r1 == 0) goto L38
            java.lang.String r1 = " "
            java.lang.String r3 = r3.replace(r0, r1)
            goto L29
        L38:
            return r3
    }

    private void normalizeUpdatedManifestEntry(ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateCleanupPlan r5, org.json.JSONObject r6, java.io.File r7) {
            r4 = this;
            java.lang.String r0 = "versionNumber"
            java.lang.String r1 = "modpackPlatform"
            java.lang.String r2 = "source"
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r3 = r5.source     // Catch: java.lang.Throwable -> L99
            java.lang.String r3 = r3.getId()     // Catch: java.lang.Throwable -> L99
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> L99
            java.lang.String r2 = "platform"
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r3 = r5.source     // Catch: java.lang.Throwable -> L99
            java.lang.String r3 = r3.getId()     // Catch: java.lang.Throwable -> L99
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> L99
            boolean r2 = r6.has(r1)     // Catch: java.lang.Throwable -> L99
            if (r2 != 0) goto L29
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r2 = r5.source     // Catch: java.lang.Throwable -> L99
            java.lang.String r2 = r2.getId()     // Catch: java.lang.Throwable -> L99
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L99
        L29:
            java.lang.String r1 = "contentType"
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2 = r5.contentType     // Catch: java.lang.Throwable -> L99
            java.lang.String r2 = r2.getIntentValue()     // Catch: java.lang.Throwable -> L99
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L99
            java.lang.String r1 = "type"
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2 = r5.contentType     // Catch: java.lang.Throwable -> L99
            java.lang.String r2 = r2.getIntentValue()     // Catch: java.lang.Throwable -> L99
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L99
            java.lang.String r1 = "platformProjectId"
            java.lang.String r2 = r5.projectId     // Catch: java.lang.Throwable -> L99
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L99
            java.lang.String r1 = "projectId"
            java.lang.String r2 = r5.projectId     // Catch: java.lang.Throwable -> L99
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L99
            java.lang.String r1 = "fileName"
            java.lang.String r2 = r7.getName()     // Catch: java.lang.Throwable -> L99
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L99
            java.lang.String r1 = "relativePath"
            java.lang.String r2 = r4.getRelativePathFromGameDirectory(r7)     // Catch: java.lang.Throwable -> L99
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L99
            java.lang.String r1 = "filePath"
            java.lang.String r2 = r4.getRelativePathFromGameDirectory(r7)     // Catch: java.lang.Throwable -> L99
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L99
            java.lang.String r1 = "absolutePath"
            java.lang.String r2 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> L99
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L99
            java.lang.String r1 = "canonicalPath"
            java.lang.String r7 = r4.safeCanonicalPath(r7)     // Catch: java.lang.Throwable -> L99
            r6.put(r1, r7)     // Catch: java.lang.Throwable -> L99
            java.lang.String r7 = "installedAt"
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L99
            r6.put(r7, r1)     // Catch: java.lang.Throwable -> L99
            java.lang.String r7 = "updatedBy"
            java.lang.String r1 = "JavaLauncher"
            r6.put(r7, r1)     // Catch: java.lang.Throwable -> L99
            boolean r7 = r6.has(r0)     // Catch: java.lang.Throwable -> L99
            if (r7 != 0) goto L99
            ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager$UpdateCandidate r5 = r5.candidate     // Catch: java.lang.Throwable -> L99
            ca.dnamobile.javalauncher.modmanager.ModrinthVersion r5 = r5.latestVersion     // Catch: java.lang.Throwable -> L99
            java.lang.String r5 = r5.versionNumber     // Catch: java.lang.Throwable -> L99
            r6.put(r0, r5)     // Catch: java.lang.Throwable -> L99
        L99:
            return
    }

    private java.lang.String normalizeZipPath(java.lang.String r3) {
            r2 = this;
            r0 = 92
            r1 = 47
            java.lang.String r3 = r3.replace(r0, r1)
            return r3
    }

    private void notifyContentItemChangedByPath(java.io.File r2) {
            r1 = this;
            java.lang.String r2 = r1.safeCanonicalPath(r2)
            int r2 = r1.findContentItemIndexByCanonicalPath(r2)
            if (r2 < 0) goto L11
            ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter r0 = r1.contentAdapter
            if (r0 == 0) goto L11
            r0.notifyItemChanged(r2)
        L11:
            return
    }

    private boolean openFolderTreePickerFallback(android.net.Uri r7, java.io.File r8) {
            r6 = this;
            java.lang.String r0 = "InstanceDetails"
            java.lang.String r1 = "[OpenFolder] launching ACTION_OPEN_DOCUMENT_TREE fallback: "
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "android.intent.action.OPEN_DOCUMENT_TREE"
            r2.<init>(r3)
            r3 = 1
            r2.addFlags(r3)
            r4 = 2
            r2.addFlags(r4)
            r4 = 128(0x80, float:1.8E-43)
            r2.addFlags(r4)
            r4 = 64
            r2.addFlags(r4)
            java.lang.String r4 = "android.content.extra.SHOW_ADVANCED"
            r2.putExtra(r4, r3)
            java.lang.String r4 = "android.provider.extra.INITIAL_URI"
            r2.putExtra(r4, r7)
            android.content.ContentResolver r4 = r6.getContentResolver()     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = "Instance Folder"
            android.content.ClipData r4 = android.content.ClipData.newUri(r4, r5, r7)     // Catch: java.lang.Throwable -> L34
            r2.setClipData(r4)     // Catch: java.lang.Throwable -> L34
        L34:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L56
            java.lang.String r8 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L56
            java.lang.StringBuilder r8 = r4.append(r8)     // Catch: java.lang.Throwable -> L56
            java.lang.String r1 = " -> "
            java.lang.StringBuilder r8 = r8.append(r1)     // Catch: java.lang.Throwable -> L56
            java.lang.StringBuilder r7 = r8.append(r7)     // Catch: java.lang.Throwable -> L56
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L56
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r7)     // Catch: java.lang.Throwable -> L56
            r6.startActivity(r2)     // Catch: java.lang.Throwable -> L56
            return r3
        L56:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "[OpenFolder] ACTION_OPEN_DOCUMENT_TREE fallback failed: "
            r8.<init>(r1)
            java.lang.String r7 = r6.readableError(r7)
            java.lang.StringBuilder r7 = r8.append(r7)
            java.lang.String r7 = r7.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r7)
            r7 = 0
            return r7
    }

    private boolean openFolderViewAt(android.net.Uri r9, java.io.File r10) {
            r8 = this;
            java.lang.String r0 = ", package="
            java.lang.String r1 = ", component="
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            r8.addDocumentsUiBrowseAttempt(r2, r9, r3, r3)
            java.lang.String r4 = "com.google.android.documentsui"
            java.lang.String r5 = "com.android.documentsui.files.FilesActivity"
            r8.addDocumentsUiBrowseAttempt(r2, r9, r4, r5)
            java.lang.String r6 = "com.google.android.documentsui.files.FilesActivity"
            r8.addDocumentsUiBrowseAttempt(r2, r9, r4, r6)
            java.lang.String r6 = "com.android.documentsui.FilesActivity"
            r8.addDocumentsUiBrowseAttempt(r2, r9, r4, r6)
            java.lang.String r7 = "com.google.android.documentsui.FilesActivity"
            r8.addDocumentsUiBrowseAttempt(r2, r9, r4, r7)
            java.lang.String r4 = "com.android.documentsui"
            r8.addDocumentsUiBrowseAttempt(r2, r9, r4, r5)
            r8.addDocumentsUiBrowseAttempt(r2, r9, r4, r6)
            java.util.Iterator r2 = r2.iterator()
        L2f:
            boolean r4 = r2.hasNext()
            r5 = 1
            java.lang.String r6 = "InstanceDetails"
            if (r4 == 0) goto Ld1
            java.lang.Object r3 = r2.next()
            android.content.Intent r3 = (android.content.Intent) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9f
            r4.<init>()     // Catch: java.lang.Throwable -> L9f
            java.lang.String r7 = "[OpenFolder] launching folder view: "
            java.lang.StringBuilder r4 = r4.append(r7)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r7 = r10.getAbsolutePath()     // Catch: java.lang.Throwable -> L9f
            java.lang.StringBuilder r4 = r4.append(r7)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r7 = " -> "
            java.lang.StringBuilder r4 = r4.append(r7)     // Catch: java.lang.Throwable -> L9f
            java.lang.StringBuilder r4 = r4.append(r9)     // Catch: java.lang.Throwable -> L9f
            java.lang.StringBuilder r4 = r4.append(r1)     // Catch: java.lang.Throwable -> L9f
            android.content.ComponentName r7 = r3.getComponent()     // Catch: java.lang.Throwable -> L9f
            java.lang.StringBuilder r4 = r4.append(r7)     // Catch: java.lang.Throwable -> L9f
            java.lang.StringBuilder r4 = r4.append(r0)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r7 = r3.getPackage()     // Catch: java.lang.Throwable -> L9f
            java.lang.StringBuilder r4 = r4.append(r7)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r7 = ", type="
            java.lang.StringBuilder r4 = r4.append(r7)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r7 = r3.getType()     // Catch: java.lang.Throwable -> L9f
            java.lang.StringBuilder r4 = r4.append(r7)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r7 = ", data="
            java.lang.StringBuilder r4 = r4.append(r7)     // Catch: java.lang.Throwable -> L9f
            android.net.Uri r7 = r3.getData()     // Catch: java.lang.Throwable -> L9f
            java.lang.StringBuilder r4 = r4.append(r7)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L9f
            ca.dnamobile.javalauncher.feature.log.Logging.i(r6, r4)     // Catch: java.lang.Throwable -> L9f
            r8.startActivity(r3)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r4 = "[OpenFolder] folder view startActivity succeeded."
            ca.dnamobile.javalauncher.feature.log.Logging.i(r6, r4)     // Catch: java.lang.Throwable -> L9f
            return r5
        L9f:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "[OpenFolder] folder view attempt failed: "
            r5.<init>(r7)
            java.lang.String r7 = r8.readableError(r4)
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.StringBuilder r5 = r5.append(r1)
            android.content.ComponentName r7 = r3.getComponent()
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r3 = r3.getPackage()
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.String r3 = r3.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r6, r3)
            r3 = r4
            goto L2f
        Ld1:
            boolean r9 = r8.openFolderTreePickerFallback(r9, r10)
            if (r9 == 0) goto Ld8
            return r5
        Ld8:
            if (r3 == 0) goto Lf0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "[OpenFolder] unable to open instance folder browse view: "
            r9.<init>(r10)
            java.lang.String r10 = r8.readableError(r3)
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r6, r9)
        Lf0:
            r9 = 0
            return r9
    }

    private boolean openInstanceFolderInFilesApp(java.io.File r5) {
            r4 = this;
            java.io.File r5 = r5.getCanonicalFile()     // Catch: java.io.IOException -> L5
            goto L9
        L5:
            java.io.File r5 = r5.getAbsoluteFile()
        L9:
            r4.logOpenFolderEnvironment(r5)
            android.net.Uri r0 = r4.buildSelectedStorageInitialUri(r5)
            java.lang.String r1 = "InstanceDetails"
            if (r0 == 0) goto L27
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[OpenFolder] selected-storage route produced URI="
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r2)
            goto L44
        L27:
            java.lang.String r0 = "[OpenFolder] selected-storage route produced no URI; trying launcher provider"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r0)
            android.net.Uri r0 = r4.buildLauncherDocumentsProviderInitialUri(r5)
            if (r0 == 0) goto L44
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[OpenFolder] launcher-provider route produced URI="
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r2)
        L44:
            if (r0 != 0) goto L5e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "[OpenFolder] no document-tree initial URI for instance folder: "
            r0.<init>(r2)
            java.lang.String r5 = r5.getAbsolutePath()
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r5)
            r5 = 0
            return r5
        L5e:
            boolean r5 = r4.openFolderViewAt(r0, r5)
            return r5
    }

    private void openMobileGluesFolderPicker(java.lang.String r4) {
            r3 = this;
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r0 = r3.mobileGluesFolderPickerLauncher
            r1 = 1
            if (r0 != 0) goto Lf
            int r4 = ca.dnamobile.javalauncher.R.string.renderer_storage_access_open_failed
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r1)
            r4.show()
            return
        Lf:
            r3.pendingMobileGluesQuickPlayWorldFolderName = r4
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.OPEN_DOCUMENT_TREE"
            r4.<init>(r0)
            r4.addFlags(r1)
            r0 = 2
            r4.addFlags(r0)
            r0 = 64
            r4.addFlags(r0)
            r0 = 128(0x80, float:1.8E-43)
            r4.addFlags(r0)
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r0 = r3.mobileGluesFolderPickerLauncher     // Catch: java.lang.Throwable -> L2f
            r0.launch(r4)     // Catch: java.lang.Throwable -> L2f
            goto L43
        L2f:
            r4 = move-exception
            r0 = 0
            r3.pendingMobileGluesQuickPlayWorldFolderName = r0
            java.lang.String r0 = "InstanceDetails"
            java.lang.String r2 = "Unable to open MobileGlues folder picker"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r2, r4)
            int r4 = ca.dnamobile.javalauncher.R.string.renderer_storage_access_open_failed
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r1)
            r4.show()
        L43:
            return
    }

    private void openModpackImportPicker() {
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
            java.lang.String r3 = "application/zip"
            r1[r2] = r3
            java.lang.String r2 = "application/x-zip-compressed"
            r3 = 1
            r1[r3] = r2
            r2 = 2
            java.lang.String r4 = "application/x-modrinth-modpack+zip"
            r1[r2] = r4
            r2 = 3
            java.lang.String r4 = "application/octet-stream"
            r1[r2] = r4
            java.lang.String r2 = "android.intent.extra.MIME_TYPES"
            r0.putExtra(r2, r1)
            r0.addFlags(r3)
            java.lang.String r1 = "Import Modpack (.mrpack, CurseForge .zip, MultiMC/Prism .zip)"
            android.content.Intent r0 = android.content.Intent.createChooser(r0, r1)     // Catch: android.content.ActivityNotFoundException -> L3c
            r1 = 9127(0x23a7, float:1.279E-41)
            r5.startActivityForResult(r0, r1)     // Catch: android.content.ActivityNotFoundException -> L3c
            goto L45
        L3c:
            java.lang.String r0 = "No file picker is available."
            android.widget.Toast r0 = android.widget.Toast.makeText(r5, r0, r3)
            r0.show()
        L45:
            return
    }

    private void openModpackUpdateDetails(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo r19, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.ProjectMatch r20) {
            r18 = this;
            r11 = r18
            r0 = r20
            java.lang.String r1 = r11.instanceId
            java.lang.String r2 = r11.instanceName
            java.lang.String r3 = r11.loader
            java.lang.String r4 = r11.baseVersionId
            java.lang.String r5 = r18.getGameVersionIdForContent()
            java.lang.String r6 = r11.versionType
            java.io.File r7 = r11.rootDirectory
            java.io.File r8 = r11.gameDirectory
            java.io.File r9 = r11.iconFile
            boolean r10 = r11.isolated
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r12 = r0.platform
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r13 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform.CURSEFORGE
            if (r12 != r13) goto L23
            java.lang.String r12 = "curseforge"
            goto L25
        L23:
            java.lang.String r12 = "modrinth"
        L25:
            r17 = r12
            java.lang.String r12 = r0.projectId
            java.lang.String r13 = r0.slug
            java.lang.String r14 = r0.title
            java.lang.String r15 = r0.summary
            r0 = r19
            java.lang.String r0 = r0.currentVersionLabel
            r16 = r0
            r0 = r18
            r11 = r17
            android.content.Intent r0 = ca.dnamobile.javalauncher.ModpackUpdateDetailsActivity.createIntent(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = 9129(0x23a9, float:1.2792E-41)
            r2 = r18
            r2.startActivityForResult(r0, r1)     // Catch: android.content.ActivityNotFoundException -> L45
            goto L4f
        L45:
            java.lang.String r0 = "Modpack update details screen is not available."
            r1 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
        L4f:
            return
    }

    private int perInstanceRamMemoryFromProgress(int r5, int r6, int r7, int r8) {
            r4 = this;
            long r0 = (long) r6
            r6 = 0
            int r5 = java.lang.Math.max(r6, r5)
            long r5 = (long) r5
            long r2 = (long) r7
            long r5 = r5 * r2
            long r0 = r0 + r5
            long r5 = (long) r8
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 <= 0) goto L10
            r0 = r5
        L10:
            int r5 = (int) r0
            int r5 = ca.dnamobile.javalauncher.settings.MemoryAllocationUtils.clampToAllowedRam(r4, r5)
            return r5
    }

    private int perInstanceRamProgressFromMemory(int r1, int r2, int r3, int r4) {
            r0 = this;
            int r1 = ca.dnamobile.javalauncher.settings.MemoryAllocationUtils.clampToAllowedRam(r0, r1)
            int r1 = r1 - r2
            float r1 = (float) r1
            r2 = 1
            int r2 = java.lang.Math.max(r2, r3)
            float r2 = (float) r2
            float r1 = r1 / r2
            int r1 = java.lang.Math.round(r1)
            r2 = 0
            int r1 = java.lang.Math.min(r1, r4)
            int r1 = java.lang.Math.max(r2, r1)
            return r1
    }

    private void pickInstanceIcon() {
            r2 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.OPEN_DOCUMENT"
            r0.<init>(r1)
            java.lang.String r1 = "android.intent.category.OPENABLE"
            r0.addCategory(r1)
            java.lang.String r1 = "image/*"
            r0.setType(r1)
            r1 = 65
            r0.addFlags(r1)
            int r1 = ca.dnamobile.javalauncher.R.string.instance_icon_picker_title     // Catch: android.content.ActivityNotFoundException -> L26
            java.lang.String r1 = r2.getString(r1)     // Catch: android.content.ActivityNotFoundException -> L26
            android.content.Intent r0 = android.content.Intent.createChooser(r0, r1)     // Catch: android.content.ActivityNotFoundException -> L26
            r1 = 9125(0x23a5, float:1.2787E-41)
            r2.startActivityForResult(r0, r1)     // Catch: android.content.ActivityNotFoundException -> L26
            goto L30
        L26:
            int r0 = ca.dnamobile.javalauncher.R.string.instance_icon_picker_missing
            r1 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
        L30:
            return
    }

    private void pickSelectedContent() {
            r4 = this;
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r0 = r4.selectedCategory
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r1 = ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory.MODS
            r2 = 1
            if (r0 != r1) goto L17
            boolean r0 = r4.supportsMods()
            if (r0 != 0) goto L17
            int r0 = ca.dnamobile.javalauncher.R.string.mods_vanilla_hint
            android.widget.Toast r0 = android.widget.Toast.makeText(r4, r0, r2)
            r0.show()
            return
        L17:
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r0 = r4.selectedCategory
            r4.pendingImportCategory = r0
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.OPEN_DOCUMENT"
            r0.<init>(r1)
            java.lang.String r1 = "android.intent.category.OPENABLE"
            r0.addCategory(r1)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r1 = r4.pendingImportCategory
            java.lang.String r1 = r1.mimeType
            r0.setType(r1)
            java.lang.String r1 = "android.intent.extra.ALLOW_MULTIPLE"
            r0.putExtra(r1, r2)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r1 = r4.pendingImportCategory
            java.lang.String[] r1 = r1.mimeTypes
            int r1 = r1.length
            if (r1 <= 0) goto L43
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r1 = r4.pendingImportCategory
            java.lang.String[] r1 = r1.mimeTypes
            java.lang.String r3 = "android.intent.extra.MIME_TYPES"
            r0.putExtra(r3, r1)
        L43:
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r1 = r4.pendingImportCategory     // Catch: android.content.ActivityNotFoundException -> L55
            int r1 = r1.pickerTitleRes     // Catch: android.content.ActivityNotFoundException -> L55
            java.lang.String r1 = r4.getString(r1)     // Catch: android.content.ActivityNotFoundException -> L55
            android.content.Intent r0 = android.content.Intent.createChooser(r0, r1)     // Catch: android.content.ActivityNotFoundException -> L55
            r1 = 9124(0x23a4, float:1.2785E-41)
            r4.startActivityForResult(r0, r1)     // Catch: android.content.ActivityNotFoundException -> L55
            goto L5e
        L55:
            int r0 = ca.dnamobile.javalauncher.R.string.mods_picker_missing
            android.widget.Toast r0 = android.widget.Toast.makeText(r4, r0, r2)
            r0.show()
        L5e:
            return
    }

    private void prepareContentRowAction() {
            r1 = this;
            r1.cancelPendingMetadataSearchFilter()
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r1.binding
            if (r0 == 0) goto L1d
            com.google.android.material.textfield.TextInputEditText r0 = r0.editTextContentSearch
            if (r0 == 0) goto L1d
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r1.binding
            com.google.android.material.textfield.TextInputEditText r0 = r0.editTextContentSearch
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L1d
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r1.binding
            com.google.android.material.textfield.TextInputEditText r0 = r0.editTextContentSearch
            r1.finishContentSearchInput(r0)
            goto L20
        L1d:
            r1.enableFullscreen()
        L20:
            return
    }

    private boolean readExtras() {
            r6 = this;
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.INSTANCE_ID"
            java.lang.String r1 = r0.getStringExtra(r1)
            r6.instanceId = r1
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.INSTANCE_NAME"
            java.lang.String r1 = r0.getStringExtra(r1)
            r6.instanceName = r1
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.INSTANCE_LOADER"
            java.lang.String r1 = r0.getStringExtra(r1)
            r6.loader = r1
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.BASE_VERSION_ID"
            java.lang.String r1 = r0.getStringExtra(r1)
            r6.baseVersionId = r1
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.MINECRAFT_VERSION_ID"
            java.lang.String r1 = r0.getStringExtra(r1)
            r6.minecraftVersionId = r1
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.VERSION_TYPE"
            java.lang.String r1 = r0.getStringExtra(r1)
            r6.versionType = r1
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.ROOT_DIRECTORY"
            java.lang.String r1 = r0.getStringExtra(r1)
            java.lang.String r2 = "ca.dnamobile.javalauncher.extra.GAME_DIRECTORY"
            java.lang.String r2 = r0.getStringExtra(r2)
            java.lang.String r3 = "ca.dnamobile.javalauncher.extra.ICON_FILE"
            java.lang.String r3 = r0.getStringExtra(r3)
            java.lang.String r4 = "ca.dnamobile.javalauncher.extra.ISOLATED"
            r5 = 1
            boolean r0 = r0.getBooleanExtra(r4, r5)
            r6.isolated = r0
            java.lang.String r0 = r6.instanceName
            boolean r0 = r6.isBlank(r0)
            if (r0 != 0) goto Lce
            java.lang.String r0 = r6.baseVersionId
            boolean r0 = r6.isBlank(r0)
            if (r0 != 0) goto Lce
            boolean r0 = r6.isBlank(r2)
            if (r0 == 0) goto L66
            goto Lce
        L66:
            java.lang.String r0 = r6.instanceId
            boolean r0 = r6.isBlank(r0)
            if (r0 == 0) goto L72
            java.lang.String r0 = r6.instanceName
            r6.instanceId = r0
        L72:
            java.lang.String r0 = r6.loader
            boolean r0 = r6.isBlank(r0)
            if (r0 == 0) goto L7e
            java.lang.String r0 = "Vanilla"
            r6.loader = r0
        L7e:
            java.lang.String r0 = r6.minecraftVersionId
            boolean r0 = r6.isBlank(r0)
            if (r0 == 0) goto L8e
            java.lang.String r0 = r6.baseVersionId
            java.lang.String r0 = ca.dnamobile.javalauncher.modmanager.ModManagerVersionResolver.resolveGameVersionForContent(r0)
            r6.minecraftVersionId = r0
        L8e:
            java.lang.String r0 = r6.minecraftVersionId
            boolean r0 = r6.isBlank(r0)
            if (r0 == 0) goto L9a
            java.lang.String r0 = r6.baseVersionId
            r6.minecraftVersionId = r0
        L9a:
            java.lang.String r0 = r6.versionType
            boolean r0 = r6.isBlank(r0)
            if (r0 == 0) goto La6
            java.lang.String r0 = "release"
            r6.versionType = r0
        La6:
            java.io.File r0 = new java.io.File
            boolean r4 = r6.isBlank(r1)
            if (r4 == 0) goto Laf
            r1 = r2
        Laf:
            r0.<init>(r1)
            r6.rootDirectory = r0
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            r6.gameDirectory = r0
            boolean r0 = r6.isBlank(r3)
            if (r0 == 0) goto Lc3
            r0 = 0
            goto Lc8
        Lc3:
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
        Lc8:
            r6.iconFile = r0
            r6.resetContentDirectories()
            return r5
        Lce:
            r0 = 0
            return r0
    }

    private java.lang.String readLatestVersionString(ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.UpdateCandidate r1, java.lang.String... r2) {
            r0 = this;
            ca.dnamobile.javalauncher.modmanager.ModrinthVersion r1 = r1.latestVersion
            if (r1 != 0) goto L7
            java.lang.String r1 = ""
            return r1
        L7:
            java.lang.String r1 = r0.readObjectStringField(r1, r2)
            return r1
    }

    private java.lang.String readModName(java.io.File r4) {
            r3 = this;
            java.lang.String r0 = "name"
            java.lang.String r1 = ca.dnamobile.javalauncher.modmanager.ModJarMetadataExtractor.readDisplayName(r4)
            boolean r2 = r3.isBlank(r1)
            if (r2 != 0) goto Ld
            return r1
        Ld:
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L72
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L72
            java.lang.String r4 = "fabric.mod.json"
            java.lang.String r4 = r3.readZipEntryText(r1, r4)     // Catch: java.lang.Throwable -> L68
            java.lang.String r4 = r3.extractJsonString(r4, r0)     // Catch: java.lang.Throwable -> L68
            boolean r2 = r3.isBlank(r4)     // Catch: java.lang.Throwable -> L68
            if (r2 != 0) goto L26
            r1.close()     // Catch: java.lang.Throwable -> L72
            return r4
        L26:
            java.lang.String r4 = "quilt.mod.json"
            java.lang.String r4 = r3.readZipEntryText(r1, r4)     // Catch: java.lang.Throwable -> L68
            java.lang.String r4 = r3.extractJsonString(r4, r0)     // Catch: java.lang.Throwable -> L68
            boolean r2 = r3.isBlank(r4)     // Catch: java.lang.Throwable -> L68
            if (r2 != 0) goto L3a
            r1.close()     // Catch: java.lang.Throwable -> L72
            return r4
        L3a:
            java.lang.String r4 = "META-INF/mods.toml"
            java.lang.String r4 = r3.readZipEntryText(r1, r4)     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = "displayName"
            java.lang.String r4 = r3.extractTomlString(r4, r2)     // Catch: java.lang.Throwable -> L68
            boolean r2 = r3.isBlank(r4)     // Catch: java.lang.Throwable -> L68
            if (r2 != 0) goto L50
            r1.close()     // Catch: java.lang.Throwable -> L72
            return r4
        L50:
            java.lang.String r4 = "mcmod.info"
            java.lang.String r4 = r3.readZipEntryText(r1, r4)     // Catch: java.lang.Throwable -> L68
            java.lang.String r4 = r3.extractJsonString(r4, r0)     // Catch: java.lang.Throwable -> L68
            boolean r0 = r3.isBlank(r4)     // Catch: java.lang.Throwable -> L68
            if (r0 != 0) goto L64
            r1.close()     // Catch: java.lang.Throwable -> L72
            return r4
        L64:
            r1.close()     // Catch: java.lang.Throwable -> L72
            goto L72
        L68:
            r4 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L6d
            goto L71
        L6d:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.lang.Throwable -> L72
        L71:
            throw r4     // Catch: java.lang.Throwable -> L72
        L72:
            r4 = 0
            return r4
    }

    private java.lang.String readNetworkText(java.lang.String r7, java.lang.String r8) throws java.io.IOException {
            r6 = this;
            java.net.URL r0 = new java.net.URL
            r0.<init>(r7)
            java.net.URLConnection r7 = r0.openConnection()
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7
            r0 = 12000(0x2ee0, float:1.6816E-41)
            r7.setConnectTimeout(r0)
            r7.setReadTimeout(r0)
            java.lang.String r0 = "User-Agent"
            java.lang.String r1 = "JavaLauncher"
            r7.setRequestProperty(r0, r1)
            boolean r0 = r6.isBlank(r8)
            if (r0 != 0) goto L29
            java.lang.String r0 = "x-api-key"
            java.lang.String r8 = r8.trim()
            r7.setRequestProperty(r0, r8)
        L29:
            int r8 = r7.getResponseCode()
            r0 = 300(0x12c, float:4.2E-43)
            r1 = 200(0xc8, float:2.8E-43)
            if (r8 < r1) goto L3a
            if (r8 >= r0) goto L3a
            java.io.InputStream r2 = r7.getInputStream()
            goto L3e
        L3a:
            java.io.InputStream r2 = r7.getErrorStream()
        L3e:
            java.lang.String r3 = "HTTP "
            if (r2 == 0) goto L9c
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L8b
            r4.<init>()     // Catch: java.lang.Throwable -> L8b
            r6.copyStream(r2, r4)     // Catch: java.lang.Throwable -> L81
            java.lang.String r5 = "UTF-8"
            if (r8 < r1) goto L60
            if (r8 >= r0) goto L60
            java.lang.String r8 = r4.toString(r5)     // Catch: java.lang.Throwable -> L81
            r4.close()     // Catch: java.lang.Throwable -> L8b
            if (r2 == 0) goto L5c
            r2.close()     // Catch: java.lang.Throwable -> L97
        L5c:
            r7.disconnect()
            return r8
        L60:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L81
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L81
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L81
            java.lang.StringBuilder r8 = r1.append(r8)     // Catch: java.lang.Throwable -> L81
            java.lang.String r1 = ": "
            java.lang.StringBuilder r8 = r8.append(r1)     // Catch: java.lang.Throwable -> L81
            java.lang.String r1 = r4.toString(r5)     // Catch: java.lang.Throwable -> L81
            java.lang.StringBuilder r8 = r8.append(r1)     // Catch: java.lang.Throwable -> L81
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L81
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L81
            throw r0     // Catch: java.lang.Throwable -> L81
        L81:
            r8 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L86
            goto L8a
        L86:
            r0 = move-exception
            r8.addSuppressed(r0)     // Catch: java.lang.Throwable -> L8b
        L8a:
            throw r8     // Catch: java.lang.Throwable -> L8b
        L8b:
            r8 = move-exception
            if (r2 == 0) goto L96
            r2.close()     // Catch: java.lang.Throwable -> L92
            goto L96
        L92:
            r0 = move-exception
            r8.addSuppressed(r0)     // Catch: java.lang.Throwable -> L97
        L96:
            throw r8     // Catch: java.lang.Throwable -> L97
        L97:
            r8 = move-exception
            r7.disconnect()
            throw r8
        L9c:
            r7.disconnect()
            java.io.IOException r7 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            java.lang.StringBuilder r8 = r0.append(r8)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }

    private java.lang.String readObjectStringField(java.lang.Object r5, java.lang.String... r6) {
            r4 = this;
            int r0 = r6.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L2e
            r2 = r6[r1]
            java.lang.Class r3 = r5.getClass()     // Catch: java.lang.Throwable -> L2b
            java.lang.reflect.Field r2 = r3.getField(r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L2b
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = r2.trim()     // Catch: java.lang.Throwable -> L2b
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L2b
            if (r3 != 0) goto L2b
            java.lang.String r3 = "null"
            boolean r3 = r3.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> L2b
            if (r3 != 0) goto L2b
            return r2
        L2b:
            int r1 = r1 + 1
            goto L2
        L2e:
            java.lang.String r5 = ""
            return r5
    }

    private java.lang.String readTextFile(java.io.File r3) throws java.io.IOException {
            r2 = this;
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r3)
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L24
            r3.<init>()     // Catch: java.lang.Throwable -> L24
            r2.copyStream(r0, r3)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = "UTF-8"
            java.lang.String r1 = r3.toString(r1)     // Catch: java.lang.Throwable -> L1a
            r3.close()     // Catch: java.lang.Throwable -> L24
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L1f
            goto L23
        L1f:
            r3 = move-exception
            r1.addSuppressed(r3)     // Catch: java.lang.Throwable -> L24
        L23:
            throw r1     // Catch: java.lang.Throwable -> L24
        L24:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L29
            goto L2d
        L29:
            r0 = move-exception
            r3.addSuppressed(r0)
        L2d:
            throw r3
    }

    private java.lang.String readZipEntryText(java.util.zip.ZipFile r6, java.lang.String r7) throws java.io.IOException {
            r5 = this;
            java.util.zip.ZipEntry r7 = r6.getEntry(r7)
            r0 = 0
            if (r7 == 0) goto L4b
            boolean r1 = r7.isDirectory()
            if (r1 == 0) goto Le
            goto L4b
        Le:
            long r1 = r7.getSize()
            r3 = 1048576(0x100000, double:5.180654E-318)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L1a
            return r0
        L1a:
            java.io.InputStream r6 = r6.getInputStream(r7)
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L3f
            r7.<init>()     // Catch: java.lang.Throwable -> L3f
            r5.copyStream(r6, r7)     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = "UTF-8"
            java.lang.String r0 = r7.toString(r0)     // Catch: java.lang.Throwable -> L35
            r7.close()     // Catch: java.lang.Throwable -> L3f
            if (r6 == 0) goto L34
            r6.close()
        L34:
            return r0
        L35:
            r0 = move-exception
            r7.close()     // Catch: java.lang.Throwable -> L3a
            goto L3e
        L3a:
            r7 = move-exception
            r0.addSuppressed(r7)     // Catch: java.lang.Throwable -> L3f
        L3e:
            throw r0     // Catch: java.lang.Throwable -> L3f
        L3f:
            r7 = move-exception
            if (r6 == 0) goto L4a
            r6.close()     // Catch: java.lang.Throwable -> L46
            goto L4a
        L46:
            r6 = move-exception
            r7.addSuppressed(r6)
        L4a:
            throw r7
        L4b:
            return r0
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

    private void refreshContentList() {
            r13 = this;
            ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter r0 = r13.contentAdapter
            if (r0 == 0) goto L101
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r13.binding
            if (r0 == 0) goto L101
            java.io.File r0 = r13.gameDirectory
            if (r0 != 0) goto Le
            goto L101
        Le:
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r5 = r13.selectedCategory
            java.io.File r4 = r13.getDirectoryForCategory(r5)
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r3 = r13.toModManagerContentType(r5)
            int r0 = r13.contentRefreshGeneration
            r1 = 1
            int r6 = r0 + 1
            r13.contentRefreshGeneration = r6
            java.util.ArrayList<ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem> r0 = r13.contentItems
            int r0 = r0.size()
            r13.contentRefreshRunning = r1
            int r2 = r5.pluralLabelRes
            java.lang.String r2 = r13.getString(r2)
            java.lang.String r7 = "Loading "
            java.lang.String r8 = "Refreshing "
            java.lang.String r9 = "..."
            if (r0 != 0) goto L53
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r7)
            int r11 = r5.pluralLabelRes
            java.lang.String r11 = r13.getString(r11)
            java.util.Locale r12 = java.util.Locale.US
            java.lang.String r11 = r11.toLowerCase(r12)
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.StringBuilder r10 = r10.append(r9)
            java.lang.String r10 = r10.toString()
            goto L70
        L53:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r8)
            int r11 = r5.pluralLabelRes
            java.lang.String r11 = r13.getString(r11)
            java.util.Locale r12 = java.util.Locale.US
            java.lang.String r11 = r11.toLowerCase(r12)
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.StringBuilder r10 = r10.append(r9)
            java.lang.String r10 = r10.toString()
        L70:
            r13.setContentLoadingOverlayVisible(r1, r2, r10)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r2 = r13.binding
            com.google.android.material.button.MaterialButton r2 = r2.buttonBrowseContent
            r10 = 0
            r2.setVisibility(r10)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r2 = r13.binding
            com.google.android.material.button.MaterialButton r2 = r2.buttonBrowseContent
            int r11 = ca.dnamobile.javalauncher.R.string.button_browse_content
            r2.setText(r11)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r2 = r13.binding
            com.google.android.material.button.MaterialButton r2 = r2.buttonBrowseContent
            boolean r11 = r13.canBrowseSelectedCategory()
            if (r11 == 0) goto L94
            boolean r11 = r13.contentOperationRunning
            if (r11 != 0) goto L94
            r11 = r1
            goto L95
        L94:
            r11 = r10
        L95:
            r2.setEnabled(r11)
            r13.bindImportButtonForCategory(r5)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r2 = r13.binding
            com.google.android.material.button.MaterialButton r2 = r2.buttonAddMods
            boolean r11 = r13.canUploadSelectedCategory()
            if (r11 == 0) goto Laa
            boolean r11 = r13.contentOperationRunning
            if (r11 != 0) goto Laa
            goto Lab
        Laa:
            r1 = r10
        Lab:
            r2.setEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r1 = r13.binding
            android.widget.TextView r1 = r1.textModsHint
            if (r0 != 0) goto Ld2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r7)
            int r2 = r5.pluralLabelRes
            java.lang.String r2 = r13.getString(r2)
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r7)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r9)
            java.lang.String r0 = r0.toString()
            goto Lef
        Ld2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r8)
            int r2 = r5.pluralLabelRes
            java.lang.String r2 = r13.getString(r2)
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r7)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r9)
            java.lang.String r0 = r0.toString()
        Lef:
            r1.setText(r0)
            r13.updateContentUpdateButtons()
            java.util.concurrent.ExecutorService r0 = r13.contentRefreshExecutor
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda117 r7 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda117
            r1 = r7
            r2 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            r0.execute(r7)
        L101:
            return
    }

    private void registerMobileGluesFolderPickerLauncher() {
            r2 = this;
            androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult r0 = new androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult
            r0.<init>()
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda88 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda88
            r1.<init>(r2)
            androidx.activity.result.ActivityResultLauncher r0 = r2.registerForActivityResult(r0, r1)
            r2.mobileGluesFolderPickerLauncher = r0
            return
    }

    private java.io.File remapPathAfterDirectoryRename(java.io.File r4, java.io.File r5, java.io.File r6) {
            r3 = this;
            java.lang.String r4 = r3.safeCanonicalPath(r4)
            java.lang.String r0 = r3.safeCanonicalPath(r6)
            boolean r1 = r0.equals(r4)
            if (r1 == 0) goto Lf
            return r5
        Lf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = java.io.File.separator
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L37
            int r4 = r4.length()
            int r4 = r4 + 1
            java.lang.String r4 = r0.substring(r4)
            java.io.File r6 = new java.io.File
            r6.<init>(r5, r4)
        L37:
            return r6
    }

    private void rememberContentSearchMetadata(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = r2.isBlank(r4)
            if (r0 == 0) goto L7
            return
        L7:
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.contentSearchMetadata
            java.io.File r1 = r3.file
            java.lang.String r1 = r2.safeCanonicalPath(r1)
            java.lang.String r4 = r4.trim()
            r0.put(r1, r4)
            java.lang.String r4 = r2.contentSearchQuery
            boolean r4 = r2.isBlank(r4)
            if (r4 != 0) goto L27
            boolean r3 = r2.isContentItemCurrentlyVisible(r3)
            if (r3 != 0) goto L27
            r2.requestMetadataSearchFilter()
        L27:
            return
    }

    private java.lang.String removeDisabledSuffix(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = r0.stripDisabledSuffix(r1)
            return r1
    }

    private int removeDuplicateTrackedFilesForProject(ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateCleanupPlan r7, java.io.File r8) {
            r6 = this;
            java.io.File r0 = r6.gameDirectory
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            if (r8 == 0) goto Lf
            boolean r0 = r8.isFile()
            if (r0 == 0) goto Lf
            goto L13
        Lf:
            java.io.File r8 = r6.findNewestTrackedProjectFile(r7)
        L13:
            if (r8 == 0) goto La2
            boolean r0 = r8.isFile()
            if (r0 != 0) goto L1d
            goto La2
        L1d:
            java.lang.String r8 = r6.safeCanonicalPath(r8)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r3 = r7.contentType
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r4 = r7.source
            java.lang.String r5 = r7.projectId
            java.util.ArrayList r3 = r6.getInstalledManifestEntriesForProject(r3, r4, r5)
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r4 = r7.contentType
            r6.collectTrackedProjectFilesForCleanup(r2, r0, r3, r4)
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r3 = r7.contentType
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r4 = r7.source
            java.lang.String r5 = r7.projectId
            java.util.ArrayList r3 = r6.getModpackInstalledEntriesForProject(r3, r4, r5)
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r4 = r7.contentType
            r6.collectTrackedProjectFilesForCleanup(r2, r0, r3, r4)
            java.util.Iterator r0 = r2.iterator()
        L4d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto La2
            java.lang.Object r2 = r0.next()
            java.io.File r2 = (java.io.File) r2
            if (r2 == 0) goto L4d
            boolean r3 = r2.isFile()
            if (r3 != 0) goto L62
            goto L4d
        L62:
            java.lang.String r3 = r6.safeCanonicalPath(r2)
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L6d
            goto L4d
        L6d:
            java.io.File r3 = r6.gameDirectory     // Catch: java.lang.Throwable -> L74
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r4 = r7.contentType     // Catch: java.lang.Throwable -> L74
            ca.dnamobile.javalauncher.modmanager.ModManagerManifest.removeEntryForFile(r3, r4, r2)     // Catch: java.lang.Throwable -> L74
        L74:
            r6.deleteFileOrDirectory(r2)     // Catch: java.lang.Throwable -> L7a
            int r1 = r1 + 1
            goto L4d
        L7a:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Unable to delete duplicate updated file "
            r4.<init>(r5)
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r4 = ": "
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r3 = r6.readableError(r3)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "InstanceDetails"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r2)
            goto L4d
        La2:
            return r1
    }

    private int removeOldFilesForUpdate(ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateCleanupPlan r7, java.io.File r8) {
            r6 = this;
            java.io.File r0 = r6.gameDirectory
            r1 = 0
            if (r0 == 0) goto L6b
            if (r8 == 0) goto L6b
            boolean r0 = r8.isFile()
            if (r0 != 0) goto Le
            goto L6b
        Le:
            java.lang.String r8 = r6.safeCanonicalPath(r8)
            java.util.ArrayList<java.io.File> r0 = r7.oldFiles
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L6b
            java.lang.Object r2 = r0.next()
            java.io.File r2 = (java.io.File) r2
            java.lang.String r3 = r6.safeCanonicalPath(r2)
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L2f
            goto L18
        L2f:
            java.io.File r3 = r6.gameDirectory     // Catch: java.lang.Throwable -> L36
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r4 = r7.contentType     // Catch: java.lang.Throwable -> L36
            ca.dnamobile.javalauncher.modmanager.ModManagerManifest.removeEntryForFile(r3, r4, r2)     // Catch: java.lang.Throwable -> L36
        L36:
            boolean r3 = r2.exists()
            if (r3 != 0) goto L3d
            goto L18
        L3d:
            r6.deleteFileOrDirectory(r2)     // Catch: java.lang.Throwable -> L43
            int r1 = r1 + 1
            goto L18
        L43:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Unable to delete old updated file "
            r4.<init>(r5)
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r4 = ": "
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r3 = r6.readableError(r3)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "InstanceDetails"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r2)
            goto L18
        L6b:
            return r1
    }

    private void removeUpdateCandidatesForType(ca.dnamobile.javalauncher.modmanager.ModManagerContentType r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = r4.name()
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r0 = ":"
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Map<java.lang.String, ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager$UpdateCandidate> r1 = r3.updateCandidates
            java.util.Set r1 = r1.keySet()
            r0.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L26:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = r1.startsWith(r4)
            if (r2 == 0) goto L26
            java.util.Map<java.lang.String, ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager$UpdateCandidate> r2 = r3.updateCandidates
            r2.remove(r1)
            goto L26
        L3e:
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Map<java.lang.String, ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState> r1 = r3.updateStates
            java.util.Set r1 = r1.keySet()
            r0.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L4d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L65
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = r1.startsWith(r4)
            if (r2 == 0) goto L4d
            java.util.Map<java.lang.String, ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState> r2 = r3.updateStates
            r2.remove(r1)
            goto L4d
        L65:
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.updateMessages
            java.util.Set r1 = r1.keySet()
            r0.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L74:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8c
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = r1.startsWith(r4)
            if (r2 == 0) goto L74
            java.util.Map<java.lang.String, java.lang.String> r2 = r3.updateMessages
            r2.remove(r1)
            goto L74
        L8c:
            return
    }

    private void renameInstance(java.lang.String r4, android.app.AlertDialog r5) {
            r3 = this;
            java.io.File r0 = r3.rootDirectory
            r1 = 1
            if (r0 != 0) goto Lf
            int r4 = ca.dnamobile.javalauncher.R.string.instance_rename_failed_missing_root
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r1)
            r4.show()
            return
        Lf:
            r3.setInstanceEditInProgress(r1)
            java.lang.Thread r1 = new java.lang.Thread
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda63 r2 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda63
            r2.<init>(r3, r0, r4, r5)
            java.lang.String r4 = "Rename Instance"
            r1.<init>(r2, r4)
            r1.start()
            return
    }

    private void replaceContentItemAfterToggle(java.lang.String r3, java.io.File r4, ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory r5) {
            r2 = this;
            ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem
            java.lang.String r1 = r2.resolveDisplayTitle(r4, r5)
            r0.<init>(r4, r5, r1)
            java.util.ArrayList<ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem> r4 = r2.allContentItems
            int r4 = r2.findContentItemIndexByCanonicalPath(r4, r3)
            if (r4 < 0) goto L16
            java.util.ArrayList<ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem> r1 = r2.allContentItems
            r1.set(r4, r0)
        L16:
            java.util.ArrayList<ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem> r1 = r2.contentItems
            int r1 = r2.findContentItemIndexByCanonicalPath(r1, r3)
            if (r1 >= 0) goto L24
            if (r4 >= 0) goto L24
            r2.refreshContentList()
            return
        L24:
            java.util.Map<java.lang.String, java.lang.String> r4 = r2.contentSearchMetadata
            r4.remove(r3)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter r4 = r2.contentAdapter
            if (r4 == 0) goto L30
            r4.clearTransientCachesForFile(r3)
        L30:
            java.lang.String r3 = r2.contentSearchQuery
            boolean r3 = r2.isBlank(r3)
            if (r3 != 0) goto L3d
            r3 = 1
            r2.requestContentSearchFilter(r3)
            goto L55
        L3d:
            if (r1 < 0) goto L4b
            java.util.ArrayList<ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem> r3 = r2.contentItems
            r3.set(r1, r0)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter r3 = r2.contentAdapter
            if (r3 == 0) goto L4b
            r3.notifyItemChanged(r1)
        L4b:
            java.io.File r3 = r2.getDirectoryForCategory(r5)
            r2.updateContentHint(r3)
            r2.updateContentUpdateButtons()
        L55:
            return
    }

    private void requestContentSearchFilter(boolean r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r2 = 0
            r1.applyContentSearchFilter(r2)
            return
        L7:
            boolean r2 = r1.contentSearchFilterApplyQueued
            if (r2 == 0) goto Lc
            return
        Lc:
            r2 = 1
            r1.contentSearchFilterApplyQueued = r2
            android.os.Handler r2 = r1.mainHandler
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda109 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda109
            r0.<init>(r1)
            r2.post(r0)
            return
    }

    private void requestMetadataSearchFilter() {
            r4 = this;
            r4.cancelPendingMetadataSearchFilter()
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda37 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda37
            r0.<init>(r4)
            r4.pendingMetadataSearchFilterRunnable = r0
            android.os.Handler r1 = r4.mainHandler
            r2 = 250(0xfa, double:1.235E-321)
            r1.postDelayed(r0, r2)
            return
    }

    private boolean requireMicrosoftLoginHistoryBeforeLaunch(java.lang.Runnable r3) {
            r2 = this;
            ca.dnamobile.javalauncher.data.AccountStore r0 = r2.accountStore
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda7 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda7
            r1.<init>(r2, r3)
            boolean r3 = ca.dnamobile.javalauncher.modmanager.ModManagerTools.requireMicrosoftLoginHistoryBeforeLaunch(r2, r0, r1)
            return r3
    }

    private void resetContentDirectories() {
            r3 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r3.gameDirectory
            java.lang.String r2 = "mods"
            r0.<init>(r1, r2)
            r3.modsDirectory = r0
            java.io.File r0 = new java.io.File
            java.io.File r1 = r3.gameDirectory
            java.lang.String r2 = "shaderpacks"
            r0.<init>(r1, r2)
            r3.shaderpacksDirectory = r0
            java.io.File r0 = new java.io.File
            java.io.File r1 = r3.gameDirectory
            java.lang.String r2 = "resourcepacks"
            r0.<init>(r1, r2)
            r3.resourcepacksDirectory = r0
            java.io.File r0 = new java.io.File
            java.io.File r1 = r3.gameDirectory
            java.lang.String r2 = "saves"
            r0.<init>(r1, r2)
            r3.worldsDirectory = r0
            return
    }

    private ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem resolveContentItemForAction(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r3) {
            r2 = this;
            java.io.File r0 = r3.file
            java.lang.String r0 = r2.safeCanonicalPath(r0)
            java.util.ArrayList<ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem> r1 = r2.contentItems
            int r1 = r2.findContentItemIndexByCanonicalPath(r1, r0)
            if (r1 < 0) goto L17
            java.util.ArrayList<ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem> r3 = r2.contentItems
            java.lang.Object r3 = r3.get(r1)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem r3 = (ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem) r3
            return r3
        L17:
            java.util.ArrayList<ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem> r1 = r2.allContentItems
            int r0 = r2.findContentItemIndexByCanonicalPath(r1, r0)
            if (r0 < 0) goto L27
            java.util.ArrayList<ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem> r3 = r2.allContentItems
            java.lang.Object r3 = r3.get(r0)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem r3 = (ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem) r3
        L27:
            return r3
    }

    private ca.dnamobile.javalauncher.modmanager.ModManagerContentType resolveContentTypeFromEntry(org.json.JSONObject r3) {
            r2 = this;
            java.lang.String r0 = "type"
            java.lang.String r1 = ""
            java.lang.String r0 = r3.optString(r0, r1)
            java.lang.String r1 = "contentType"
            java.lang.String r3 = r3.optString(r1, r0)
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODS
            java.lang.String r0 = r0.getIntentValue()
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L1d
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r3 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODS
            return r3
        L1d:
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.RESOURCEPACKS
            java.lang.String r0 = r0.getIntentValue()
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L2c
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r3 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.RESOURCEPACKS
            return r3
        L2c:
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.SHADERPACKS
            java.lang.String r0 = r0.getIntentValue()
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L3b
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r3 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.SHADERPACKS
            return r3
        L3b:
            r3 = 0
            return r3
    }

    private java.lang.String resolveDisplayName(android.net.Uri r9) {
            r8 = this;
            java.lang.String r0 = "_display_name"
            java.lang.String r1 = r9.getLastPathSegment()
            if (r1 == 0) goto L12
            java.lang.String r2 = r1.trim()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L14
        L12:
            java.lang.String r1 = "file"
        L14:
            android.content.ContentResolver r2 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L5b
            r3 = 1
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L5b
            r3 = 0
            r4[r3] = r0     // Catch: java.lang.Throwable -> L5b
            r6 = 0
            r7 = 0
            r5 = 0
            r3 = r9
            android.database.Cursor r9 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L5b
            if (r9 == 0) goto L56
            boolean r2 = r9.moveToFirst()     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L56
            int r0 = r9.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L4a
            if (r0 < 0) goto L56
            java.lang.String r0 = r9.getString(r0)     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L56
            java.lang.String r2 = r0.trim()     // Catch: java.lang.Throwable -> L4a
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L4a
            if (r2 != 0) goto L56
            if (r9 == 0) goto L49
            r9.close()     // Catch: java.lang.Throwable -> L5b
        L49:
            return r0
        L4a:
            r0 = move-exception
            if (r9 == 0) goto L55
            r9.close()     // Catch: java.lang.Throwable -> L51
            goto L55
        L51:
            r9 = move-exception
            r0.addSuppressed(r9)     // Catch: java.lang.Throwable -> L5b
        L55:
            throw r0     // Catch: java.lang.Throwable -> L5b
        L56:
            if (r9 == 0) goto L5b
            r9.close()     // Catch: java.lang.Throwable -> L5b
        L5b:
            return r1
    }

    private java.lang.String resolveDisplayTitle(java.io.File r2, ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory r3) {
            r1 = this;
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r0 = ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory.WORLDS
            if (r3 != r0) goto L9
            java.lang.String r2 = r2.getName()
            return r2
        L9:
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r0 = ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory.MODS
            if (r3 != r0) goto L1c
            boolean r3 = r2.isFile()
            if (r3 == 0) goto L1c
            java.lang.String r2 = r2.getName()
            java.lang.String r2 = r1.stripExtension(r2)
            return r2
        L1c:
            java.lang.String r2 = r2.getName()
            java.lang.String r2 = r1.stripExtension(r2)
            return r2
    }

    private java.io.File resolveFileForInstalledEntry(org.json.JSONObject r9) {
            r8 = this;
            java.io.File r0 = r8.gameDirectory
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r0 = "path"
            java.lang.String r2 = ""
            java.lang.String r0 = r9.optString(r0, r2)
            java.lang.String r3 = "filePath"
            java.lang.String r0 = r9.optString(r3, r0)
            java.lang.String r3 = "relativePath"
            java.lang.String r0 = r9.optString(r3, r0)
            boolean r3 = r8.isBlank(r0)
            if (r3 != 0) goto L5d
            java.io.File r3 = new java.io.File
            java.io.File r4 = r8.gameDirectory
            char r5 = java.io.File.separatorChar
            r6 = 47
            java.lang.String r5 = r0.replace(r6, r5)
            r3.<init>(r4, r5)
            boolean r4 = r3.isFile()
            if (r4 == 0) goto L36
            return r3
        L36:
            java.io.File r3 = new java.io.File
            java.io.File r4 = r8.gameDirectory
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            char r7 = java.io.File.separatorChar
            java.lang.String r0 = r0.replace(r6, r7)
            java.lang.StringBuilder r0 = r5.append(r0)
            java.lang.String r5 = ".disabled"
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            r3.<init>(r4, r0)
            boolean r0 = r3.isFile()
            if (r0 == 0) goto L5d
            return r3
        L5d:
            java.lang.String r0 = "absolutePath"
            java.lang.String r9 = r9.optString(r0, r2)
            boolean r0 = r8.isBlank(r9)
            if (r0 != 0) goto L75
            java.io.File r0 = new java.io.File
            r0.<init>(r9)
            boolean r9 = r0.isFile()
            if (r9 == 0) goto L75
            return r0
        L75:
            return r1
    }

    private java.io.File resolveFileForInstalledEntry(org.json.JSONObject r5, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r6) {
            r4 = this;
            java.io.File r0 = r4.resolveFileForInstalledEntry(r5)
            if (r0 == 0) goto Ld
            boolean r1 = r0.isFile()
            if (r1 == 0) goto Ld
            return r0
        Ld:
            java.io.File r1 = r4.gameDirectory
            if (r1 != 0) goto L12
            return r0
        L12:
            java.lang.String r1 = "fileName"
            java.lang.String r2 = ""
            java.lang.String r5 = r5.optString(r1, r2)
            boolean r1 = r4.isBlank(r5)
            if (r1 != 0) goto L61
            java.io.File r1 = r4.gameDirectory
            java.io.File r6 = r6.getTargetDirectory(r1)
            java.io.File r1 = new java.io.File
            r1.<init>(r6, r5)
            boolean r2 = r1.isFile()
            if (r2 == 0) goto L32
            return r1
        L32:
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r3 = ".disabled"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r6, r2)
            boolean r2 = r1.isFile()
            if (r2 == 0) goto L51
            return r1
        L51:
            java.io.File r1 = new java.io.File
            java.lang.String r5 = r4.stripDisabledSuffix(r5)
            r1.<init>(r6, r5)
            boolean r5 = r1.isFile()
            if (r5 == 0) goto L61
            return r1
        L61:
            return r0
    }

    private java.io.File resolveIconTargetFile(android.net.Uri r5) throws java.lang.Exception {
            r4 = this;
            java.io.File r0 = r4.iconFile
            if (r0 == 0) goto L19
            java.io.File r0 = r0.getParentFile()
            if (r0 == 0) goto L19
            java.io.File r0 = r4.iconFile
            java.io.File r0 = r0.getParentFile()
            boolean r0 = r0.canWrite()
            if (r0 == 0) goto L19
            java.io.File r5 = r4.iconFile
            return r5
        L19:
            java.io.File r0 = r4.rootDirectory
            if (r0 == 0) goto L1e
            goto L20
        L1e:
            java.io.File r0 = r4.gameDirectory
        L20:
            if (r0 == 0) goto L61
            boolean r1 = r0.exists()
            if (r1 != 0) goto L48
            boolean r1 = r0.mkdirs()
            if (r1 == 0) goto L2f
            goto L48
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to create icon folder: "
            r1.<init>(r2)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L48:
            java.lang.String r5 = r4.resolveImageExtension(r5)
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "icon"
            r2.<init>(r3)
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r5 = r5.toString()
            r1.<init>(r0, r5)
            return r1
        L61:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Missing instance folder."
            r5.<init>(r0)
            throw r5
    }

    private java.lang.String resolveIconUrlFromEntry(org.json.JSONObject r11) {
            r10 = this;
            r0 = 15
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = "iconUrl"
            java.lang.String r2 = ""
            java.lang.String r1 = r11.optString(r1, r2)
            r3 = 0
            r0[r3] = r1
            java.lang.String r1 = "iconURL"
            java.lang.String r1 = r11.optString(r1, r2)
            r4 = 1
            r0[r4] = r1
            java.lang.String r1 = "icon_url"
            java.lang.String r1 = r11.optString(r1, r2)
            r5 = 2
            r0[r5] = r1
            java.lang.String r1 = "projectIconUrl"
            java.lang.String r1 = r11.optString(r1, r2)
            r6 = 3
            r0[r6] = r1
            java.lang.String r1 = "projectIconURL"
            java.lang.String r1 = r11.optString(r1, r2)
            r7 = 4
            r0[r7] = r1
            java.lang.String r1 = "project_icon_url"
            java.lang.String r1 = r11.optString(r1, r2)
            r8 = 5
            r0[r8] = r1
            java.lang.String r1 = "thumbnailUrl"
            java.lang.String r1 = r11.optString(r1, r2)
            r9 = 6
            r0[r9] = r1
            java.lang.String r1 = "thumbnailURL"
            java.lang.String r1 = r11.optString(r1, r2)
            r9 = 7
            r0[r9] = r1
            java.lang.String r1 = "thumbnail_url"
            java.lang.String r1 = r11.optString(r1, r2)
            r9 = 8
            r0[r9] = r1
            java.lang.String r1 = "logoUrl"
            java.lang.String r1 = r11.optString(r1, r2)
            r9 = 9
            r0[r9] = r1
            java.lang.String r1 = "logoURL"
            java.lang.String r1 = r11.optString(r1, r2)
            r9 = 10
            r0[r9] = r1
            java.lang.String r1 = "logo_url"
            java.lang.String r1 = r11.optString(r1, r2)
            r9 = 11
            r0[r9] = r1
            java.lang.String r1 = "imageUrl"
            java.lang.String r1 = r11.optString(r1, r2)
            r9 = 12
            r0[r9] = r1
            java.lang.String r1 = "imageURL"
            java.lang.String r1 = r11.optString(r1, r2)
            r9 = 13
            r0[r9] = r1
            java.lang.String r1 = "image_url"
            java.lang.String r1 = r11.optString(r1, r2)
            r2 = 14
            r0[r2] = r1
            java.lang.String r0 = r10.firstNonBlank(r0)
            boolean r1 = r10.isBlank(r0)
            if (r1 != 0) goto La3
            java.lang.String r11 = r10.normalizeIconUrl(r0)
            return r11
        La3:
            java.lang.String[] r0 = new java.lang.String[r8]
            java.lang.String r1 = "project"
            org.json.JSONObject r1 = r11.optJSONObject(r1)
            java.lang.String r1 = r10.resolveIconUrlFromObject(r1)
            r0[r3] = r1
            java.lang.String r1 = "modrinthProject"
            org.json.JSONObject r1 = r11.optJSONObject(r1)
            java.lang.String r1 = r10.resolveIconUrlFromObject(r1)
            r0[r4] = r1
            java.lang.String r1 = "curseForgeProject"
            org.json.JSONObject r1 = r11.optJSONObject(r1)
            java.lang.String r1 = r10.resolveIconUrlFromObject(r1)
            r0[r5] = r1
            java.lang.String r1 = "curseforgeProject"
            org.json.JSONObject r1 = r11.optJSONObject(r1)
            java.lang.String r1 = r10.resolveIconUrlFromObject(r1)
            r0[r6] = r1
            java.lang.String r1 = "data"
            org.json.JSONObject r11 = r11.optJSONObject(r1)
            java.lang.String r11 = r10.resolveIconUrlFromObject(r11)
            r0[r7] = r11
            java.lang.String r11 = r10.firstNonBlank(r0)
            java.lang.String r11 = r10.normalizeIconUrl(r11)
            return r11
    }

    private java.lang.String resolveIconUrlFromObject(org.json.JSONObject r12) {
            r11 = this;
            java.lang.String r0 = ""
            if (r12 != 0) goto L5
            return r0
        L5:
            r1 = 12
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r2 = "iconUrl"
            java.lang.String r2 = r12.optString(r2, r0)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "iconURL"
            java.lang.String r2 = r12.optString(r2, r0)
            r4 = 1
            r1[r4] = r2
            java.lang.String r2 = "icon_url"
            java.lang.String r2 = r12.optString(r2, r0)
            r5 = 2
            r1[r5] = r2
            java.lang.String r2 = "thumbnailUrl"
            java.lang.String r6 = r12.optString(r2, r0)
            r7 = 3
            r1[r7] = r6
            r6 = 4
            java.lang.String r8 = "thumbnailURL"
            java.lang.String r9 = r12.optString(r8, r0)
            r1[r6] = r9
            java.lang.String r6 = "thumbnail_url"
            java.lang.String r6 = r12.optString(r6, r0)
            r9 = 5
            r1[r9] = r6
            java.lang.String r6 = "logoUrl"
            java.lang.String r6 = r12.optString(r6, r0)
            r9 = 6
            r1[r9] = r6
            java.lang.String r6 = "logoURL"
            java.lang.String r6 = r12.optString(r6, r0)
            r9 = 7
            r1[r9] = r6
            java.lang.String r6 = "logo_url"
            java.lang.String r6 = r12.optString(r6, r0)
            r9 = 8
            r1[r9] = r6
            java.lang.String r6 = "imageUrl"
            java.lang.String r6 = r12.optString(r6, r0)
            r9 = 9
            r1[r9] = r6
            java.lang.String r6 = "imageURL"
            java.lang.String r6 = r12.optString(r6, r0)
            r9 = 10
            r1[r9] = r6
            java.lang.String r6 = "image_url"
            java.lang.String r6 = r12.optString(r6, r0)
            r9 = 11
            r1[r9] = r6
            java.lang.String r1 = r11.firstNonBlank(r1)
            boolean r6 = r11.isBlank(r1)
            if (r6 != 0) goto L84
            return r1
        L84:
            java.lang.String r6 = "logo"
            org.json.JSONObject r6 = r12.optJSONObject(r6)
            java.lang.String r9 = "url"
            if (r6 == 0) goto Lad
            java.lang.String[] r1 = new java.lang.String[r7]
            java.lang.String r10 = r6.optString(r2, r0)
            r1[r3] = r10
            java.lang.String r10 = r6.optString(r8, r0)
            r1[r4] = r10
            java.lang.String r6 = r6.optString(r9, r0)
            r1[r5] = r6
            java.lang.String r1 = r11.firstNonBlank(r1)
            boolean r6 = r11.isBlank(r1)
            if (r6 != 0) goto Lad
            return r1
        Lad:
            java.lang.String r6 = "icon"
            org.json.JSONObject r12 = r12.optJSONObject(r6)
            if (r12 == 0) goto Lcd
            java.lang.String[] r1 = new java.lang.String[r7]
            java.lang.String r2 = r12.optString(r2, r0)
            r1[r3] = r2
            java.lang.String r2 = r12.optString(r8, r0)
            r1[r4] = r2
            java.lang.String r12 = r12.optString(r9, r0)
            r1[r5] = r12
            java.lang.String r1 = r11.firstNonBlank(r1)
        Lcd:
            return r1
    }

    private java.lang.String resolveImageExtension(android.net.Uri r3) {
            r2 = this;
            java.lang.String r3 = r2.resolveDisplayName(r3)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = r3.toLowerCase(r0)
            java.lang.String r0 = ".jpg"
            boolean r1 = r3.endsWith(r0)
            if (r1 != 0) goto L30
            java.lang.String r1 = ".jpeg"
            boolean r1 = r3.endsWith(r1)
            if (r1 == 0) goto L1b
            goto L30
        L1b:
            java.lang.String r0 = ".webp"
            boolean r1 = r3.endsWith(r0)
            if (r1 == 0) goto L24
            return r0
        L24:
            java.lang.String r0 = ".gif"
            boolean r3 = r3.endsWith(r0)
            if (r3 == 0) goto L2d
            return r0
        L2d:
            java.lang.String r3 = ".png"
            return r3
        L30:
            return r0
    }

    private java.lang.String resolveLatestFileName(ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.UpdateCandidate r7) {
            r6 = this;
            r0 = 4
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = "fileName"
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "filename"
            r3 = 1
            r0[r3] = r1
            java.lang.String r1 = "primaryFileName"
            r4 = 2
            r0[r4] = r1
            r1 = 3
            java.lang.String r5 = "name"
            r0[r1] = r5
            java.lang.String r0 = r6.readLatestVersionString(r7, r0)
            boolean r1 = r6.isBlank(r0)
            if (r1 != 0) goto L22
            return r0
        L22:
            java.lang.String[] r0 = new java.lang.String[r4]
            java.lang.String r1 = "downloadUrl"
            r0[r2] = r1
            java.lang.String r1 = "url"
            r0[r3] = r1
            java.lang.String r7 = r6.readLatestVersionString(r7, r0)
            boolean r0 = r6.isBlank(r7)
            if (r0 == 0) goto L39
            java.lang.String r7 = ""
            return r7
        L39:
            r0 = 47
            int r0 = r7.lastIndexOf(r0)
            if (r0 < 0) goto L4c
            int r0 = r0 + r3
            int r1 = r7.length()
            if (r0 >= r1) goto L4c
            java.lang.String r7 = r7.substring(r0)
        L4c:
            r0 = 63
            int r0 = r7.indexOf(r0)
            if (r0 < 0) goto L58
            java.lang.String r7 = r7.substring(r2, r0)
        L58:
            java.lang.String r7 = r7.trim()
            return r7
    }

    private java.io.File resolveLocalIconFileFromEntry(org.json.JSONObject r6) {
            r5 = this;
            r0 = 6
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = "cachedIconPath"
            java.lang.String r2 = ""
            java.lang.String r1 = r6.optString(r1, r2)
            r3 = 0
            r0[r3] = r1
            java.lang.String r1 = "iconCachePath"
            java.lang.String r1 = r6.optString(r1, r2)
            r3 = 1
            r0[r3] = r1
            java.lang.String r1 = "installedIconPath"
            java.lang.String r1 = r6.optString(r1, r2)
            r3 = 2
            r0[r3] = r1
            java.lang.String r1 = "localIconPath"
            java.lang.String r1 = r6.optString(r1, r2)
            r3 = 3
            r0[r3] = r1
            java.lang.String r1 = "iconPath"
            java.lang.String r1 = r6.optString(r1, r2)
            r3 = 4
            r0[r3] = r1
            java.lang.String r1 = "iconFile"
            java.lang.String r6 = r6.optString(r1, r2)
            r1 = 5
            r0[r1] = r6
            java.lang.String r6 = r5.firstNonBlank(r0)
            boolean r0 = r5.isBlank(r6)
            r1 = 0
            if (r0 == 0) goto L47
            return r1
        L47:
            java.lang.String r0 = "http://"
            boolean r0 = r6.startsWith(r0)
            if (r0 != 0) goto L86
            java.lang.String r0 = "https://"
            boolean r0 = r6.startsWith(r0)
            if (r0 != 0) goto L86
            java.lang.String r0 = "//"
            boolean r0 = r6.startsWith(r0)
            if (r0 == 0) goto L60
            goto L86
        L60:
            java.io.File r0 = new java.io.File
            r0.<init>(r6)
            boolean r2 = r0.isFile()
            if (r2 == 0) goto L6c
            return r0
        L6c:
            java.io.File r0 = r5.gameDirectory
            if (r0 == 0) goto L86
            java.io.File r0 = new java.io.File
            java.io.File r2 = r5.gameDirectory
            r3 = 47
            char r4 = java.io.File.separatorChar
            java.lang.String r6 = r6.replace(r3, r4)
            r0.<init>(r2, r6)
            boolean r6 = r0.isFile()
            if (r6 == 0) goto L86
            return r0
        L86:
            return r1
    }

    private int resolveRendererSelectionIndex(java.util.ArrayList<ca.dnamobile.javalauncher.renderer.RendererInterface> r4, java.lang.String r5) {
            r3 = this;
            boolean r0 = r3.isBlank(r5)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = r1
        L9:
            int r2 = r4.size()
            if (r0 >= r2) goto L25
            java.lang.Object r2 = r4.get(r0)
            ca.dnamobile.javalauncher.renderer.RendererInterface r2 = (ca.dnamobile.javalauncher.renderer.RendererInterface) r2
            java.lang.String r2 = r2.getUniqueIdentifier()
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L22
            int r0 = r0 + 1
            return r0
        L22:
            int r0 = r0 + 1
            goto L9
        L25:
            return r1
    }

    private ca.dnamobile.javalauncher.data.model.MinecraftVersion resolveRepairManifestVersion(java.lang.String r4) throws java.lang.Exception {
            r3 = this;
            java.util.List r0 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionManifestClient.loadVersions(r3)
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            ca.dnamobile.javalauncher.data.model.MinecraftVersion r1 = (ca.dnamobile.javalauncher.data.model.MinecraftVersion) r1
            java.lang.String r2 = r1.getId()
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L8
            return r1
        L1f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Minecraft version not found in Mojang manifest: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
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

    private void runLoaderUpdate(ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderVersion r9) {
            r8 = this;
            java.io.File r0 = r8.rootDirectory
            r1 = 1
            if (r0 == 0) goto L28
            java.io.File r0 = r8.gameDirectory
            if (r0 != 0) goto La
            goto L28
        La:
            r8.setVersionUpdateInProgress(r1)
            r6 = 4
            r7 = 0
            java.lang.String r3 = "Update Loader"
            java.lang.String r4 = "Preparing loader update..."
            r5 = 0
            r2 = r8
            r2.showUpdateProgressDialog(r3, r4, r5, r6, r7)
            java.lang.Thread r0 = new java.lang.Thread
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda70 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda70
            r1.<init>(r8, r9)
            java.lang.String r9 = "Update Instance Loader"
            r0.<init>(r1, r9)
            r0.start()
            return
        L28:
            java.lang.String r9 = "Missing instance folder."
            android.widget.Toast r9 = android.widget.Toast.makeText(r8, r9, r1)
            r9.show()
            return
    }

    private void runModpackUpdate(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo r9, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.ProjectMatch r10, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo r11) {
            r8 = this;
            java.io.File r0 = r8.rootDirectory
            r1 = 1
            if (r0 == 0) goto L29
            java.io.File r0 = r8.gameDirectory
            if (r0 != 0) goto La
            goto L29
        La:
            r8.setVersionUpdateInProgress(r1)
            r6 = 100
            r7 = 0
            java.lang.String r3 = "Update Modpack"
            java.lang.String r4 = "Preparing modpack update..."
            r5 = 0
            r2 = r8
            r2.showUpdateProgressDialog(r3, r4, r5, r6, r7)
            java.lang.Thread r0 = new java.lang.Thread
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda114 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda114
            r1.<init>(r8, r9, r10, r11)
            java.lang.String r9 = "Update Modpack"
            r0.<init>(r1, r9)
            r0.start()
            return
        L29:
            java.lang.String r9 = "Missing instance folder."
            android.widget.Toast r9 = android.widget.Toast.makeText(r8, r9, r1)
            r9.show()
            return
    }

    private void runQueuedContentSearchFilter() {
            r4 = this;
            r0 = 0
            r4.contentSearchFilterApplyQueued = r0
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r4.binding
            if (r0 == 0) goto L37
            boolean r0 = r4.isFinishing()
            if (r0 != 0) goto L37
            boolean r0 = r4.isDestroyed()
            if (r0 == 0) goto L14
            goto L37
        L14:
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r4.binding
            androidx.recyclerview.widget.RecyclerView r0 = r0.recyclerResourceItems
            r1 = 1
            if (r0 == 0) goto L34
            boolean r2 = r0.isComputingLayout()
            if (r2 != 0) goto L27
            int r2 = r0.getScrollState()
            if (r2 == 0) goto L34
        L27:
            r4.contentSearchFilterApplyQueued = r1
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda109 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda109
            r1.<init>(r4)
            r2 = 64
            r0.postDelayed(r1, r2)
            return
        L34:
            r4.applyContentSearchFilter(r1)
        L37:
            return
    }

    private void runRepairInstance() {
            r7 = this;
            java.lang.String r0 = r7.getGameVersionIdForContent()
            boolean r1 = r7.isBlank(r0)
            r2 = 1
            if (r1 == 0) goto L15
            java.lang.String r0 = "Missing Minecraft version."
            android.widget.Toast r0 = android.widget.Toast.makeText(r7, r0, r2)
            r0.show()
            return
        L15:
            r7.setVersionUpdateInProgress(r2)
            r5 = 100
            r6 = 0
            java.lang.String r2 = "Repair Instance"
            java.lang.String r3 = "Preparing repair..."
            r4 = 0
            r1 = r7
            r1.showUpdateProgressDialog(r2, r3, r4, r5, r6)
            java.lang.Thread r1 = new java.lang.Thread
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda17 r2 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda17
            r2.<init>(r7, r0)
            java.lang.String r0 = "Repair Instance"
            r1.<init>(r2, r0)
            r1.start()
            return
    }

    private void runVersionUpdate(java.lang.String r9) {
            r8 = this;
            java.io.File r0 = r8.rootDirectory
            r1 = 1
            if (r0 == 0) goto L28
            java.io.File r0 = r8.gameDirectory
            if (r0 != 0) goto La
            goto L28
        La:
            r8.setVersionUpdateInProgress(r1)
            r6 = 4
            r7 = 0
            java.lang.String r3 = "Update Version"
            java.lang.String r4 = "Preparing update..."
            r5 = 0
            r2 = r8
            r2.showUpdateProgressDialog(r3, r4, r5, r6, r7)
            java.lang.Thread r0 = new java.lang.Thread
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda72 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda72
            r1.<init>(r8, r9)
            java.lang.String r9 = "Update Instance Version"
            r0.<init>(r1, r9)
            r0.start()
            return
        L28:
            java.lang.String r9 = "Missing instance folder."
            android.widget.Toast r9 = android.widget.Toast.makeText(r8, r9, r1)
            r9.show()
            return
    }

    private java.lang.String safeCanonicalPath(java.io.File r1) {
            r0 = this;
            java.lang.String r1 = r1.getCanonicalPath()     // Catch: java.io.IOException -> L5
            return r1
        L5:
            java.lang.String r1 = r1.getAbsolutePath()
            return r1
    }

    private java.lang.String sanitizeCacheFileName(java.lang.String r3) {
            r2 = this;
            java.lang.String r3 = r3.trim()
            java.lang.String r0 = "[^A-Za-z0-9._-]"
            java.lang.String r1 = "_"
            java.lang.String r3 = r3.replaceAll(r0, r1)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L14
            java.lang.String r3 = "icon"
        L14:
            int r0 = r3.length()
            r1 = 120(0x78, float:1.68E-43)
            if (r0 <= r1) goto L21
            r0 = 0
            java.lang.String r3 = r3.substring(r0, r1)
        L21:
            return r3
    }

    private java.lang.String sanitizeImportedFileName(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.lang.String r3 = r3.trim()
            r0 = 10
            r1 = 32
            java.lang.String r3 = r3.replace(r0, r1)
            r0 = 13
            java.lang.String r3 = r3.replace(r0, r1)
            java.lang.String r0 = "[\\\\/:*?\"<>|]"
            java.lang.String r1 = "_"
            java.lang.String r3 = r3.replaceAll(r0, r1)
        L1a:
            java.lang.String r0 = "  "
            boolean r1 = r3.contains(r0)
            if (r1 == 0) goto L29
            java.lang.String r1 = " "
            java.lang.String r3 = r3.replace(r0, r1)
            goto L1a
        L29:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L3f
            java.lang.String r0 = "."
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L3f
            java.lang.String r0 = ".."
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L41
        L3f:
            java.lang.String r3 = "file"
        L41:
            boolean r0 = r2.isBlank(r4)
            if (r0 != 0) goto L6a
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r3.toLowerCase(r0)
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r1 = r4.toLowerCase(r1)
            boolean r0 = r0.endsWith(r1)
            if (r0 != 0) goto L6a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
        L6a:
            return r3
    }

    private java.lang.String sanitizeInstanceName(java.lang.String r3) {
            r2 = this;
            java.lang.String r3 = r3.trim()
            r0 = 10
            r1 = 32
            java.lang.String r3 = r3.replace(r0, r1)
            r0 = 13
            java.lang.String r3 = r3.replace(r0, r1)
            java.lang.String r0 = "[\\\\/:*?\"<>|]"
            java.lang.String r1 = "_"
            java.lang.String r3 = r3.replaceAll(r0, r1)
        L1a:
            java.lang.String r0 = "  "
            boolean r1 = r3.contains(r0)
            if (r1 == 0) goto L29
            java.lang.String r1 = " "
            java.lang.String r3 = r3.replace(r0, r1)
            goto L1a
        L29:
            java.lang.String r0 = "."
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L3b
            java.lang.String r0 = ".."
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L3a
            goto L3b
        L3a:
            return r3
        L3b:
            java.lang.String r3 = ""
            return r3
    }

    private java.lang.String sanitizeProjectId(java.lang.String r1) {
            r0 = this;
            if (r1 != 0) goto L5
            java.lang.String r1 = ""
            goto L9
        L5:
            java.lang.String r1 = r1.trim()
        L9:
            return r1
    }

    private void savePerInstanceSettingsAliases(java.lang.String r2, ca.dnamobile.javalauncher.launcher.InstanceLaunchSettings.Settings r3) {
            r1 = this;
            java.util.ArrayList r2 = r1.collectPerInstanceSettingsAliasKeys(r2)
            java.util.Iterator r2 = r2.iterator()
        L8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            ca.dnamobile.javalauncher.launcher.InstanceLaunchSettings.save(r1, r0, r3)
            goto L8
        L18:
            return
    }

    private void savePickedInstanceIcon(android.net.Uri r4) {
            r3 = this;
            java.io.File r0 = r3.rootDirectory
            r1 = 1
            if (r0 != 0) goto Lf
            int r4 = ca.dnamobile.javalauncher.R.string.instance_rename_failed_missing_root
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r1)
            r4.show()
            return
        Lf:
            r3.setInstanceEditInProgress(r1)
            java.lang.Thread r1 = new java.lang.Thread
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda28 r2 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda28
            r2.<init>(r3, r0, r4)
            java.lang.String r4 = "Update Instance Icon"
            r1.<init>(r2, r4)
            r1.start()
            return
    }

    private void setContentItemEnabled(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r11, boolean r12) {
            r10 = this;
            ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem r11 = r10.resolveContentItemForAction(r11)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r0 = r11.category
            boolean r0 = r0.supportsDisableToggle
            if (r0 == 0) goto La1
            java.io.File r0 = r11.file
            boolean r0 = r0.isDirectory()
            if (r0 == 0) goto L14
            goto La1
        L14:
            boolean r0 = r10.contentOperationRunning
            if (r0 == 0) goto L19
            return
        L19:
            java.io.File r0 = r11.file
            boolean r0 = r10.isContentItemEnabled(r0)
            if (r0 != r12) goto L22
            return
        L22:
            java.io.File r0 = r11.file
            java.io.File r0 = r0.getParentFile()
            r1 = 1
            if (r0 != 0) goto L48
            int r12 = ca.dnamobile.javalauncher.R.string.instance_content_toggle_failed
            java.io.File r0 = r11.file
            java.lang.String r0 = r0.getName()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r12 = r10.getString(r12, r0)
            android.widget.Toast r12 = android.widget.Toast.makeText(r10, r12, r1)
            r12.show()
            java.io.File r11 = r11.file
            r10.notifyContentItemChangedByPath(r11)
            return
        L48:
            java.io.File r2 = r11.file
            if (r12 == 0) goto L5a
            java.io.File r3 = new java.io.File
            java.lang.String r4 = r2.getName()
            java.lang.String r4 = r10.removeDisabledSuffix(r4)
            r3.<init>(r0, r4)
            goto L76
        L5a:
            java.io.File r3 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r2.getName()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = ".disabled"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r0, r4)
        L76:
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r0 = r11.category
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r4 = r10.toModManagerContentType(r0)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r6 = r11.category
            java.lang.String r5 = r10.safeCanonicalPath(r2)
            java.lang.String r11 = r3.getName()
            java.lang.String r8 = r10.stripDisabledSuffix(r11)
            if (r12 == 0) goto L8f
            java.lang.String r11 = "Enabling content"
            goto L91
        L8f:
            java.lang.String r11 = "Disabling content"
        L91:
            r10.setContentOperationInProgress(r1, r11, r8)
            java.util.concurrent.ExecutorService r11 = r10.contentOperationExecutor
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda107 r9 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda107
            r0 = r9
            r1 = r10
            r7 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r11.execute(r9)
        La1:
            return
    }

    private void setContentItemEnabledFromRow(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r1, boolean r2) {
            r0 = this;
            r0.prepareContentRowAction()
            ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem r1 = r0.resolveContentItemForAction(r1)
            r0.setContentItemEnabled(r1, r2)
            return
    }

    private void setContentLoadingOverlayVisible(boolean r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            if (r2 == 0) goto L13
            r1.ensureContentLoadingOverlay()
            android.widget.TextView r0 = r1.contentLoadingTitle
            if (r0 == 0) goto Lc
            r0.setText(r3)
        Lc:
            android.widget.TextView r3 = r1.contentLoadingMessage
            if (r3 == 0) goto L13
            r3.setText(r4)
        L13:
            android.view.View r3 = r1.contentLoadingOverlay
            if (r3 == 0) goto L20
            if (r2 == 0) goto L1b
            r2 = 0
            goto L1d
        L1b:
            r2 = 8
        L1d:
            r3.setVisibility(r2)
        L20:
            return
    }

    private void setContentOperationInProgress(boolean r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            r2.contentOperationRunning = r3
            if (r3 == 0) goto L8
            r2.showContentOperationOverlay(r4, r5)
            goto Lb
        L8:
            r2.hideContentLoadingOverlayIfIdle()
        Lb:
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r4 = r2.binding
            if (r4 != 0) goto L10
            return
        L10:
            com.google.android.material.button.MaterialButton r4 = r4.buttonBrowseContent
            r5 = 1
            r0 = 0
            if (r3 != 0) goto L1e
            boolean r1 = r2.canBrowseSelectedCategory()
            if (r1 == 0) goto L1e
            r1 = r5
            goto L1f
        L1e:
            r1 = r0
        L1f:
            r4.setEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r4 = r2.binding
            com.google.android.material.button.MaterialButton r4 = r4.buttonAddMods
            if (r3 != 0) goto L30
            boolean r1 = r2.canUploadSelectedCategory()
            if (r1 == 0) goto L30
            r1 = r5
            goto L31
        L30:
            r1 = r0
        L31:
            r4.setEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r4 = r2.binding
            com.google.android.material.button.MaterialButton r4 = r4.buttonCheckContentUpdates
            if (r3 != 0) goto L42
            boolean r1 = r2.canCheckUpdatesForSelectedCategory()
            if (r1 == 0) goto L42
            r1 = r5
            goto L43
        L42:
            r1 = r0
        L43:
            r4.setEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r4 = r2.binding
            com.google.android.material.button.MaterialButton r4 = r4.buttonUpdateAllContent
            if (r3 != 0) goto L53
            boolean r1 = r2.hasAvailableUpdatesForSelectedCategory()
            if (r1 == 0) goto L53
            goto L54
        L53:
            r5 = r0
        L54:
            r4.setEnabled(r5)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r4 = r2.binding
            androidx.recyclerview.widget.RecyclerView r4 = r4.recyclerResourceItems
            if (r3 == 0) goto L61
            r3 = 1057803469(0x3f0ccccd, float:0.55)
            goto L63
        L61:
            r3 = 1065353216(0x3f800000, float:1.0)
        L63:
            r4.setAlpha(r3)
            return
    }

    private void setDeleteInProgress(boolean r5) {
            r4 = this;
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r4.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonPlay
            r1 = r5 ^ 1
            r0.setEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r4.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonInstanceSettings
            r1 = r5 ^ 1
            r0.setEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r4.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonBrowseContent
            r1 = 0
            r2 = 1
            if (r5 != 0) goto L22
            boolean r3 = r4.canBrowseSelectedCategory()
            if (r3 == 0) goto L22
            r3 = r2
            goto L23
        L22:
            r3 = r1
        L23:
            r0.setEnabled(r3)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r4.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonAddMods
            if (r5 != 0) goto L34
            boolean r3 = r4.canUploadSelectedCategory()
            if (r3 == 0) goto L34
            r3 = r2
            goto L35
        L34:
            r3 = r1
        L35:
            r0.setEnabled(r3)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r4.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonCheckContentUpdates
            if (r5 != 0) goto L46
            boolean r3 = r4.canCheckUpdatesForSelectedCategory()
            if (r3 == 0) goto L46
            r3 = r2
            goto L47
        L46:
            r3 = r1
        L47:
            r0.setEnabled(r3)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r4.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonUpdateAllContent
            if (r5 != 0) goto L57
            boolean r5 = r4.hasAvailableUpdatesForSelectedCategory()
            if (r5 == 0) goto L57
            r1 = r2
        L57:
            r0.setEnabled(r1)
            return
    }

    private void setInstanceEditInProgress(boolean r5) {
            r4 = this;
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r4.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonPlay
            r1 = r5 ^ 1
            r0.setEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r4.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonInstanceSettings
            r1 = r5 ^ 1
            r0.setEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r4.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonBrowseContent
            r1 = 0
            r2 = 1
            if (r5 != 0) goto L22
            boolean r3 = r4.canBrowseSelectedCategory()
            if (r3 == 0) goto L22
            r3 = r2
            goto L23
        L22:
            r3 = r1
        L23:
            r0.setEnabled(r3)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r4.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonAddMods
            if (r5 != 0) goto L34
            boolean r3 = r4.canUploadSelectedCategory()
            if (r3 == 0) goto L34
            r3 = r2
            goto L35
        L34:
            r3 = r1
        L35:
            r0.setEnabled(r3)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r4.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonCheckContentUpdates
            if (r5 != 0) goto L46
            boolean r3 = r4.canCheckUpdatesForSelectedCategory()
            if (r3 == 0) goto L46
            r3 = r2
            goto L47
        L46:
            r3 = r1
        L47:
            r0.setEnabled(r3)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r4.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonUpdateAllContent
            if (r5 != 0) goto L57
            boolean r5 = r4.hasAvailableUpdatesForSelectedCategory()
            if (r5 == 0) goto L57
            r1 = r2
        L57:
            r0.setEnabled(r1)
            return
    }

    private void setUpdateProgress(int r5, int r6) {
            r4 = this;
            android.widget.ProgressBar r0 = r4.updateProgressBar
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 0
            r0.setIndeterminate(r1)
            android.widget.ProgressBar r0 = r4.updateProgressBar
            r2 = 1
            int r3 = java.lang.Math.max(r2, r6)
            r0.setMax(r3)
            android.widget.ProgressBar r0 = r4.updateProgressBar
            int r6 = java.lang.Math.max(r2, r6)
            int r5 = java.lang.Math.min(r5, r6)
            int r5 = java.lang.Math.max(r1, r5)
            r0.setProgress(r5)
            return
    }

    private void setUpdateProgressMessage(java.lang.String r2) {
            r1 = this;
            android.widget.TextView r0 = r1.updateProgressMessage
            if (r0 == 0) goto L7
            r0.setText(r2)
        L7:
            return
    }

    private void setVersionUpdateInProgress(boolean r5) {
            r4 = this;
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r4.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonPlay
            r1 = r5 ^ 1
            r0.setEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r4.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonInstanceSettings
            r1 = r5 ^ 1
            r0.setEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r4.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonBrowseContent
            r1 = 0
            r2 = 1
            if (r5 != 0) goto L22
            boolean r3 = r4.canBrowseSelectedCategory()
            if (r3 == 0) goto L22
            r3 = r2
            goto L23
        L22:
            r3 = r1
        L23:
            r0.setEnabled(r3)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r4.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonAddMods
            if (r5 != 0) goto L34
            boolean r3 = r4.canUploadSelectedCategory()
            if (r3 == 0) goto L34
            r3 = r2
            goto L35
        L34:
            r3 = r1
        L35:
            r0.setEnabled(r3)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r4.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonCheckContentUpdates
            if (r5 != 0) goto L46
            boolean r3 = r4.canCheckUpdatesForSelectedCategory()
            if (r3 == 0) goto L46
            r3 = r2
            goto L47
        L46:
            r3 = r1
        L47:
            r0.setEnabled(r3)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r4.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonUpdateAllContent
            if (r5 != 0) goto L57
            boolean r5 = r4.hasAvailableUpdatesForSelectedCategory()
            if (r5 == 0) goto L57
            r1 = r2
        L57:
            r0.setEnabled(r1)
            return
    }

    private void setupAccountGate() {
            r3 = this;
            ca.dnamobile.javalauncher.data.AccountStore r0 = new ca.dnamobile.javalauncher.data.AccountStore     // Catch: java.lang.Throwable -> L19
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L19
            r3.accountStore = r0     // Catch: java.lang.Throwable -> L19
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal r0 = new ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal     // Catch: java.lang.Throwable -> L19
            ca.dnamobile.javalauncher.data.AccountStore r1 = r3.accountStore     // Catch: java.lang.Throwable -> L19
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L19
            r3.authManager = r0     // Catch: java.lang.Throwable -> L19
            ca.dnamobile.javalauncher.InstanceDetailsActivity$1 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$1     // Catch: java.lang.Throwable -> L19
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L19
            r0.setListener(r1)     // Catch: java.lang.Throwable -> L19
            goto L26
        L19:
            r0 = move-exception
            java.lang.String r1 = "InstanceDetails"
            java.lang.String r2 = "Microsoft account gate initialization failed"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r2, r0)
            r0 = 0
            r3.accountStore = r0
            r3.authManager = r0
        L26:
            return
    }

    private void setupActions() {
            r2 = this;
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r2.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonPlay
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda80 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda80
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r2.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonInstanceSettings
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda82 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda82
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r2.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonBrowseContent
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda83 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda83
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r2.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonAddMods
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda84 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda84
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r2.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonCheckContentUpdates
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda85 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda85
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r2.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonUpdateAllContent
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda86 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda86
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    private void setupContentSearch() {
            r2 = this;
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r2.binding
            com.google.android.material.textfield.TextInputEditText r0 = r0.editTextContentSearch
            if (r0 != 0) goto L7
            return
        L7:
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r2.binding
            com.google.android.material.textfield.TextInputEditText r0 = r0.editTextContentSearch
            ca.dnamobile.javalauncher.InstanceDetailsActivity$2 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$2
            r1.<init>(r2)
            r0.addTextChangedListener(r1)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r2.binding
            com.google.android.material.textfield.TextInputEditText r0 = r0.editTextContentSearch
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda87 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda87
            r1.<init>(r2)
            r0.setOnEditorActionListener(r1)
            return
    }

    private void setupContentTabs() {
            r6 = this;
            ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter
            r0.<init>(r6)
            r6.contentAdapter = r0
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r6.binding
            androidx.recyclerview.widget.RecyclerView r0 = r0.recyclerResourceItems
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            r1.<init>(r6)
            r0.setLayoutManager(r1)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r6.binding
            androidx.recyclerview.widget.RecyclerView r0 = r0.recyclerResourceItems
            r1 = 1
            r0.setNestedScrollingEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r6.binding
            androidx.recyclerview.widget.RecyclerView r0 = r0.recyclerResourceItems
            r1 = 8
            r0.setItemViewCacheSize(r1)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r6.binding
            androidx.recyclerview.widget.RecyclerView r0 = r0.recyclerResourceItems
            ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter r1 = r6.contentAdapter
            r0.setAdapter(r1)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r6.binding
            androidx.recyclerview.widget.RecyclerView r0 = r0.recyclerResourceItems
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda62 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda62
            r1.<init>(r6)
            r0.setOnTouchListener(r1)
            r6.constrainResourceRecyclerHeightIfNeeded()
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory[] r0 = ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory.values()
            int r1 = r0.length
            r2 = 0
        L42:
            if (r2 >= r1) goto L5e
            r3 = r0[r2]
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r4 = r6.binding
            com.google.android.material.tabs.TabLayout r4 = r4.tabResourceCategories
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r5 = r6.binding
            com.google.android.material.tabs.TabLayout r5 = r5.tabResourceCategories
            com.google.android.material.tabs.TabLayout$Tab r5 = r5.newTab()
            int r3 = r3.tabTitleRes
            com.google.android.material.tabs.TabLayout$Tab r3 = r5.setText(r3)
            r4.addTab(r3)
            int r2 = r2 + 1
            goto L42
        L5e:
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r6.binding
            com.google.android.material.tabs.TabLayout r0 = r0.tabResourceCategories
            ca.dnamobile.javalauncher.InstanceDetailsActivity$3 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$3
            r1.<init>(r6)
            r0.addOnTabSelectedListener(r1)
            return
    }

    private boolean shouldShowFileForCategory(ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory r7, java.io.File r8) {
            r6 = this;
            boolean r0 = r8.isHidden()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = r8.getName()
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r2)
            int r7 = r7.ordinal()
            r2 = 1
            if (r7 == 0) goto L6f
            java.lang.String r3 = ".zip.disabled"
            java.lang.String r4 = ".zip"
            if (r7 == r2) goto L55
            r5 = 2
            if (r7 == r5) goto L3b
            r0 = 3
            if (r7 == r0) goto L26
            return r1
        L26:
            boolean r7 = r8.isDirectory()
            if (r7 == 0) goto L3a
            java.io.File r7 = new java.io.File
            java.lang.String r0 = "level.dat"
            r7.<init>(r8, r0)
            boolean r7 = r7.isFile()
            if (r7 == 0) goto L3a
            r1 = r2
        L3a:
            return r1
        L3b:
            boolean r7 = r8.isDirectory()
            if (r7 != 0) goto L53
            boolean r7 = r8.isFile()
            if (r7 == 0) goto L54
            boolean r7 = r0.endsWith(r4)
            if (r7 != 0) goto L53
            boolean r7 = r0.endsWith(r3)
            if (r7 == 0) goto L54
        L53:
            r1 = r2
        L54:
            return r1
        L55:
            boolean r7 = r8.isDirectory()
            if (r7 != 0) goto L6d
            boolean r7 = r8.isFile()
            if (r7 == 0) goto L6e
            boolean r7 = r0.endsWith(r4)
            if (r7 != 0) goto L6d
            boolean r7 = r0.endsWith(r3)
            if (r7 == 0) goto L6e
        L6d:
            r1 = r2
        L6e:
            return r1
        L6f:
            boolean r7 = r8.isFile()
            if (r7 == 0) goto L86
            java.lang.String r7 = ".jar"
            boolean r7 = r0.endsWith(r7)
            if (r7 != 0) goto L85
            java.lang.String r7 = ".jar.disabled"
            boolean r7 = r0.endsWith(r7)
            if (r7 == 0) goto L86
        L85:
            r1 = r2
        L86:
            return r1
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
            java.lang.String r2 = r4.getGameVersionIdForContent()
            boolean r0 = r0.equalsIgnoreCase(r2)
            r2 = 1
            if (r0 != 0) goto L18
            return r2
        L18:
            java.lang.String r5 = r5.loader
            java.lang.String r5 = r4.normalizeLoaderNameForUpdate(r5)
            java.lang.String r0 = r4.loader
            java.lang.String r0 = r4.normalizeLoaderNameForUpdate(r0)
            boolean r3 = r4.isBlank(r5)
            if (r3 != 0) goto L31
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L31
            r1 = r2
        L31:
            return r1
    }

    private void showContentLoadingSoon(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            r3.cancelPendingContentLoadingOverlay()
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda40 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda40
            r0.<init>(r3, r4, r5)
            r3.pendingContentLoadingRunnable = r0
            android.os.Handler r4 = r3.mainHandler
            r1 = 60
            r4.postDelayed(r0, r1)
            return
    }

    private void showContentOperationOverlay(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r1.cancelPendingContentLoadingOverlay()
            r0 = 1
            r1.setContentLoadingOverlayVisible(r0, r2, r3)
            return
    }

    private void showDeleteContentItemDialog(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r4) {
            r3 = this;
            ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem r4 = r3.resolveContentItemForAction(r4)
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r3)
            int r1 = ca.dnamobile.javalauncher.R.string.instance_content_delete_title
            java.lang.String r2 = r4.title
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = r3.getString(r1, r2)
            android.app.AlertDialog$Builder r0 = r0.setTitle(r1)
            int r1 = ca.dnamobile.javalauncher.R.string.instance_content_delete_message
            java.io.File r2 = r4.file
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = r3.getString(r1, r2)
            android.app.AlertDialog$Builder r0 = r0.setMessage(r1)
            r1 = 17039360(0x1040000, float:2.424457E-38)
            r2 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            int r1 = ca.dnamobile.javalauncher.R.string.button_delete_forever
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda10 r2 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda10
            r2.<init>(r3, r4)
            android.app.AlertDialog$Builder r4 = r0.setPositiveButton(r1, r2)
            r4.show()
            return
    }

    private void showDeleteContentItemDialogFromRow(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r1) {
            r0 = this;
            r0.prepareContentRowAction()
            ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem r1 = r0.resolveContentItemForAction(r1)
            r0.showDeleteContentItemDialog(r1)
            return
    }

    private void showDeleteInstanceDialog() {
            r6 = this;
            boolean r0 = r6.isolated
            r1 = 0
            if (r0 != 0) goto L45
            java.lang.String r0 = r6.baseVersionId
            java.util.ArrayList r0 = ca.dnamobile.javalauncher.instance.LauncherInstanceManager.findSharedVersionDependents(r6, r0)
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L45
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            r2.<init>(r6)
            int r3 = ca.dnamobile.javalauncher.R.string.delete_shared_instance_blocked_title
            java.lang.String r4 = r6.instanceName
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r3 = r6.getString(r3, r4)
            android.app.AlertDialog$Builder r2 = r2.setTitle(r3)
            int r3 = ca.dnamobile.javalauncher.R.string.delete_shared_instance_blocked_message
            java.lang.String r4 = r6.instanceName
            java.lang.String r0 = ca.dnamobile.javalauncher.instance.LauncherInstanceManager.formatDependentVersionList(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r0}
            java.lang.String r0 = r6.getString(r3, r0)
            android.app.AlertDialog$Builder r0 = r2.setMessage(r0)
            r2 = 17039370(0x104000a, float:2.42446E-38)
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r2, r1)
            r0.show()
            return
        L45:
            java.lang.String r0 = r6.baseVersionId     // Catch: java.lang.Throwable -> L54
            java.io.File r2 = r6.rootDirectory     // Catch: java.lang.Throwable -> L54
            boolean r3 = r6.isolated     // Catch: java.lang.Throwable -> L54
            java.io.File r0 = ca.dnamobile.javalauncher.instance.LauncherInstanceManager.getDeleteTargetDirectory(r0, r2, r3)     // Catch: java.lang.Throwable -> L54
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L54
            goto L5a
        L54:
            java.io.File r0 = r6.rootDirectory
            java.lang.String r0 = r0.getAbsolutePath()
        L5a:
            boolean r2 = r6.isolated
            if (r2 == 0) goto L61
            int r2 = ca.dnamobile.javalauncher.R.string.delete_instance_message
            goto L63
        L61:
            int r2 = ca.dnamobile.javalauncher.R.string.delete_shared_instance_message
        L63:
            android.app.AlertDialog$Builder r3 = new android.app.AlertDialog$Builder
            r3.<init>(r6)
            int r4 = ca.dnamobile.javalauncher.R.string.delete_instance_title
            java.lang.String r5 = r6.instanceName
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r4 = r6.getString(r4, r5)
            android.app.AlertDialog$Builder r3 = r3.setTitle(r4)
            java.lang.String r4 = r6.instanceName
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r0}
            java.lang.String r0 = r6.getString(r2, r0)
            android.app.AlertDialog$Builder r0 = r3.setMessage(r0)
            r2 = 17039360(0x1040000, float:2.424457E-38)
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r2, r1)
            int r1 = ca.dnamobile.javalauncher.R.string.button_delete_forever
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda19 r2 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda19
            r2.<init>(r6)
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)
            r0.show()
            return
    }

    private void showEditInstanceNameDialog() {
            r5 = this;
            boolean r0 = r5.isolated
            r1 = 1
            if (r0 != 0) goto Lf
            int r0 = ca.dnamobile.javalauncher.R.string.instance_rename_shared_not_supported
            android.widget.Toast r0 = android.widget.Toast.makeText(r5, r0, r1)
            r0.show()
            return
        Lf:
            android.widget.EditText r0 = new android.widget.EditText
            r0.<init>(r5)
            r0.setSingleLine(r1)
            r0.setSelectAllOnFocus(r1)
            java.lang.String r1 = r5.instanceName
            r0.setText(r1)
            r1 = 8193(0x2001, float:1.1481E-41)
            r0.setInputType(r1)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r5)
            r2 = 20
            int r2 = r5.dp(r2)
            r3 = 8
            int r3 = r5.dp(r3)
            r4 = 0
            r1.setPadding(r2, r3, r2, r4)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = -1
            r4 = -2
            r2.<init>(r3, r4)
            r1.addView(r0, r2)
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            r2.<init>(r5)
            int r3 = ca.dnamobile.javalauncher.R.string.instance_settings_edit_name
            android.app.AlertDialog$Builder r2 = r2.setTitle(r3)
            android.app.AlertDialog$Builder r1 = r2.setView(r1)
            r2 = 17039360(0x1040000, float:2.424457E-38)
            r3 = 0
            android.app.AlertDialog$Builder r1 = r1.setNegativeButton(r2, r3)
            int r2 = ca.dnamobile.javalauncher.R.string.instance_settings_save_name
            android.app.AlertDialog$Builder r1 = r1.setPositiveButton(r2, r3)
            android.app.AlertDialog r1 = r1.create()
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda121 r2 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda121
            r2.<init>(r5, r1, r0)
            r1.setOnShowListener(r2)
            r1.show()
            return
    }

    private void showExportModpackPlatformDialog() {
            r9 = this;
            r9.enableFullscreen()
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r9)
            r1 = 1
            r0.setOrientation(r1)
            r2 = 22
            int r3 = r9.dp(r2)
            r4 = 4
            int r5 = r9.dp(r4)
            int r2 = r9.dp(r2)
            r6 = 0
            r0.setPadding(r3, r5, r2, r6)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r9)
            java.lang.String r3 = "Choose the export format."
            r2.setText(r3)
            r3 = 1098907648(0x41800000, float:16.0)
            r5 = 2
            r2.setTextSize(r5, r3)
            r3 = 16842806(0x1010036, float:2.369371E-38)
            r7 = -1
            int r3 = r9.resolveThemeColor(r3, r7)
            r2.setTextColor(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r8 = -2
            r3.<init>(r7, r8)
            r0.addView(r2, r3)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r9)
            java.lang.String r3 = "Sharing note: only upload a pack publicly when every included mod, resource pack, shader, config, and file is allowed on the platform you choose."
            r2.setText(r3)
            r3 = 1095761920(0x41500000, float:13.0)
            r2.setTextSize(r5, r3)
            r3 = 16842808(0x1010038, float:2.3693715E-38)
            r5 = -3355444(0xffffffffffcccccc, float:NaN)
            int r3 = r9.resolveThemeColor(r3, r5)
            r2.setTextColor(r3)
            r3 = 0
            r5 = 1065772646(0x3f866666, float:1.05)
            r2.setLineSpacing(r3, r5)
            r2.setMaxLines(r4)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r7, r8)
            r5 = 10
            int r5 = r9.dp(r5)
            r3.topMargin = r5
            r0.addView(r2, r3)
            android.widget.ScrollView r2 = new android.widget.ScrollView
            r2.<init>(r9)
            r2.setFillViewport(r6)
            r2.setClipToPadding(r6)
            int r3 = r9.dp(r4)
            r2.setPadding(r6, r6, r6, r3)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r9)
            r3.setOrientation(r1)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r7, r8)
            r2.addView(r3, r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r4 = 300(0x12c, float:4.2E-43)
            int r4 = r9.dp(r4)
            r5 = 190(0xbe, float:2.66E-43)
            int r5 = r9.dp(r5)
            android.content.res.Resources r6 = r9.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            int r6 = r6.heightPixels
            int r6 = r6 / 3
            int r5 = java.lang.Math.max(r5, r6)
            int r4 = java.lang.Math.min(r4, r5)
            r1.<init>(r7, r4)
            r4 = 12
            int r4 = r9.dp(r4)
            r1.topMargin = r4
            r0.addView(r2, r1)
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r9)
            java.lang.String r2 = "Export Modpack"
            android.app.AlertDialog$Builder r1 = r1.setTitle(r2)
            android.app.AlertDialog$Builder r0 = r1.setView(r0)
            r1 = 17039360(0x1040000, float:2.424457E-38)
            r2 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            android.app.AlertDialog r0 = r0.create()
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda125 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda125
            r1.<init>(r9, r0)
            java.lang.String r2 = "Modrinth"
            java.lang.String r4 = ".mrpack export · best for Modrinth publishing"
            r9.addExportPlatformRow(r3, r2, r4, r1)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda11 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda11
            r1.<init>(r9, r0)
            java.lang.String r2 = "CurseForge"
            java.lang.String r4 = ".zip export · best for CurseForge publishing"
            r9.addExportPlatformRow(r3, r2, r4, r1)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda22 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda22
            r1.<init>(r9, r0)
            java.lang.String r2 = "MultiMC / Prism"
            java.lang.String r4 = ".zip instance export · bundles .minecraft files directly"
            r9.addExportPlatformRow(r3, r2, r4, r1)
            r9.showFullscreenSafeDialog(r0)
            return
    }

    private void showFolderLocation() {
            r5 = this;
            java.io.File r0 = r5.gameDirectory
            if (r0 == 0) goto L5
            goto L7
        L5:
            java.io.File r0 = r5.rootDirectory
        L7:
            java.lang.String r1 = "InstanceDetails"
            if (r0 != 0) goto L34
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "[OpenFolder] clicked but folder is null. rootDirectory="
            r0.<init>(r2)
            java.io.File r2 = r5.rootDirectory
            java.lang.String r2 = r5.filePathOrNull(r2)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r2 = ", gameDirectory="
            java.lang.StringBuilder r0 = r0.append(r2)
            java.io.File r2 = r5.gameDirectory
            java.lang.String r2 = r5.filePathOrNull(r2)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r0)
            return
        L34:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[OpenFolder] clicked instanceId="
            r2.<init>(r3)
            java.lang.String r3 = r5.instanceId
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ", instanceName="
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r5.instanceName
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ", isolated="
            java.lang.StringBuilder r2 = r2.append(r3)
            boolean r3 = r5.isolated
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ", baseVersionId="
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r5.baseVersionId
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ", minecraftVersionId="
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r5.minecraftVersionId
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[OpenFolder] raw rootDirectory="
            r2.<init>(r3)
            java.io.File r3 = r5.rootDirectory
            java.lang.String r3 = r5.filePathOrNull(r3)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[OpenFolder] raw gameDirectory="
            r2.<init>(r3)
            java.io.File r3 = r5.gameDirectory
            java.lang.String r3 = r5.filePathOrNull(r3)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[OpenFolder] chosen folder="
            r2.<init>(r3)
            java.lang.String r3 = r0.getAbsolutePath()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ", exists="
            java.lang.StringBuilder r2 = r2.append(r3)
            boolean r3 = r0.exists()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ", isDirectory="
            java.lang.StringBuilder r2 = r2.append(r3)
            boolean r3 = r0.isDirectory()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ", canRead="
            java.lang.StringBuilder r2 = r2.append(r3)
            boolean r3 = r0.canRead()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ", canWrite="
            java.lang.StringBuilder r2 = r2.append(r3)
            boolean r3 = r0.canWrite()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r2)
            boolean r2 = r0.exists()
            if (r2 != 0) goto L155
            boolean r2 = r0.mkdirs()     // Catch: java.lang.Throwable -> L101
            goto L127
        L101:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "[OpenFolder] mkdirs threw for "
            r3.<init>(r4)
            java.lang.String r4 = r0.getAbsolutePath()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = ": "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r2 = r5.readableError(r2)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r2)
            r2 = 0
        L127:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "[OpenFolder] mkdirs result="
            r3.<init>(r4)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r3 = ", existsAfter="
            java.lang.StringBuilder r2 = r2.append(r3)
            boolean r3 = r0.exists()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ", path="
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r0.getAbsolutePath()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r2)
        L155:
            boolean r2 = r5.openInstanceFolderInFilesApp(r0)
            if (r2 == 0) goto L15c
            return
        L15c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[OpenFolder] all open attempts failed, showing copy-path fallback for "
            r2.<init>(r3)
            java.lang.String r3 = r0.getAbsolutePath()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r2)
            r5.showFolderPathFallback(r0)
            return
    }

    private void showFolderPathFallback(java.io.File r4) {
            r3 = this;
            java.lang.String r4 = r4.getAbsolutePath()
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r3)
            int r1 = ca.dnamobile.javalauncher.R.string.instance_folder_open_failed_title
            android.app.AlertDialog$Builder r0 = r0.setTitle(r1)
            int r1 = ca.dnamobile.javalauncher.R.string.instance_folder_open_failed_message
            java.lang.Object[] r2 = new java.lang.Object[]{r4}
            java.lang.String r1 = r3.getString(r1, r2)
            android.app.AlertDialog$Builder r0 = r0.setMessage(r1)
            r1 = 17039370(0x104000a, float:2.42446E-38)
            r2 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            int r1 = ca.dnamobile.javalauncher.R.string.instance_folder_copy_path
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda113 r2 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda113
            r2.<init>(r3, r4)
            android.app.AlertDialog$Builder r4 = r0.setPositiveButton(r1, r2)
            r4.show()
            return
    }

    private void showFullscreenSafeDialog(android.app.AlertDialog r5) {
            r4 = this;
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda2 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda2
            r0.<init>(r4)
            r5.setOnDismissListener(r0)
            r5.show()
            android.view.Window r0 = r5.getWindow()
            r4.applyFullscreenToWindow(r0)
            android.os.Handler r0 = r4.mainHandler
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda3 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda3
            r1.<init>(r4, r5)
            r2 = 120(0x78, double:5.93E-322)
            r0.postDelayed(r1, r2)
            return
    }

    private void showInstanceSettingsMenu(android.view.View r14) {
            r13 = this;
            r13.enableFullscreen()
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r13)
            r1 = 1
            r0.setOrientation(r1)
            r2 = 6
            int r3 = r13.dp(r2)
            int r4 = r13.dp(r2)
            int r5 = r13.getDropdownBottomSafePadding()
            int r4 = r4 + r5
            r5 = 0
            r0.setPadding(r5, r3, r5, r4)
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>()
            r4 = 16842801(0x1010031, float:2.3693695E-38)
            r6 = -1
            int r4 = r13.resolveThemeColor(r4, r6)
            r3.setColor(r4)
            r4 = 18
            int r4 = r13.dp(r4)
            float r4 = (float) r4
            r3.setCornerRadius(r4)
            r0.setBackground(r3)
            r3 = 280(0x118, float:3.92E-43)
            int r3 = r13.dp(r3)
            r4 = 220(0xdc, float:3.08E-43)
            int r7 = r13.dp(r4)
            android.content.res.Resources r8 = r13.getResources()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            int r8 = r8.widthPixels
            r9 = 32
            int r10 = r13.dp(r9)
            int r8 = r8 - r10
            int r7 = java.lang.Math.max(r7, r8)
            int r3 = java.lang.Math.min(r3, r7)
            android.widget.ScrollView r7 = new android.widget.ScrollView
            r7.<init>(r13)
            r7.setFillViewport(r5)
            r7.setOverScrollMode(r1)
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r10 = -2
            r8.<init>(r6, r10)
            r7.addView(r0, r8)
            android.widget.PopupWindow r6 = new android.widget.PopupWindow
            r6.<init>(r7, r3, r10, r5)
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>(r5)
            r6.setBackgroundDrawable(r7)
            r6.setOutsideTouchable(r1)
            r6.setClippingEnabled(r1)
            r7 = 2
            r6.setInputMethodMode(r7)
            r8 = 8
            int r10 = r13.dp(r8)
            float r10 = (float) r10
            r6.setElevation(r10)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda31 r10 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda31
            r10.<init>(r13)
            r6.setOnDismissListener(r10)
            int r10 = ca.dnamobile.javalauncher.R.string.instance_settings_view_folder
            r13.addInstanceSettingsMenuRow(r0, r10, r6, r1)
            int r10 = ca.dnamobile.javalauncher.R.string.button_delete_instance
            r13.addInstanceSettingsMenuRow(r0, r10, r6, r7)
            int r10 = ca.dnamobile.javalauncher.R.string.instance_settings_edit_name
            r11 = 3
            r13.addInstanceSettingsMenuRow(r0, r10, r6, r11)
            int r10 = ca.dnamobile.javalauncher.R.string.instance_settings_edit_icon
            r11 = 4
            r13.addInstanceSettingsMenuRow(r0, r10, r6, r11)
            java.lang.String r10 = "Per Instance Settings"
            r11 = 9
            r13.addInstanceSettingsMenuRow(r0, r10, r6, r11)
            java.lang.String r10 = "Update Version"
            r13.addInstanceSettingsMenuRow(r0, r10, r6, r2)
            java.io.File r2 = r13.rootDirectory
            java.io.File r10 = r13.gameDirectory
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$InstalledModpackInfo r2 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.readInstalledModpackInfo(r2, r10)
            if (r2 == 0) goto Ld0
            java.lang.String r2 = "Update Modpack"
            r10 = 11
            r13.addInstanceSettingsMenuRow(r0, r2, r6, r10)
        Ld0:
            java.lang.String r2 = "Repair Instance"
            r10 = 10
            r13.addInstanceSettingsMenuRow(r0, r2, r6, r10)
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind r2 = r13.getSupportedLoaderKind()
            if (r2 == 0) goto Le3
            java.lang.String r2 = "Update Loader"
            r10 = 7
            r13.addInstanceSettingsMenuRow(r0, r2, r6, r10)
        Le3:
            int r2 = ca.dnamobile.javalauncher.R.string.instance_settings_export_modpack
            r10 = 5
            r13.addInstanceSettingsMenuRow(r0, r2, r6, r10)
            java.lang.String r2 = "Import Modpack"
            r13.addInstanceSettingsMenuRow(r0, r2, r6, r8)
            android.content.res.Resources r2 = r13.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.content.res.Resources r10 = r13.getResources()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            int r10 = r10.heightPixels
            android.view.Window r11 = r13.getWindow()
            android.view.View r11 = r11.getDecorView()
            int r12 = r11.getWidth()
            if (r12 <= 0) goto L114
            int r2 = r11.getWidth()
        L114:
            int r12 = r11.getHeight()
            if (r12 <= 0) goto L11e
            int r10 = r11.getHeight()
        L11e:
            int r0 = r0.getChildCount()
            r12 = 48
            int r12 = r13.dp(r12)
            int r0 = r0 * r12
            r12 = 12
            int r12 = r13.dp(r12)
            int r0 = r0 + r12
            int r12 = r13.getDropdownBottomSafePadding()
            int r0 = r0 + r12
            int r4 = r13.dp(r4)
            int r9 = r13.dp(r9)
            int r9 = r10 - r9
            int r4 = java.lang.Math.max(r4, r9)
            int r0 = java.lang.Math.min(r0, r4)
            r6.setHeight(r0)
            int[] r4 = new int[r7]
            r14.getLocationOnScreen(r4)
            r5 = r4[r5]
            int r7 = r14.getWidth()
            int r5 = r5 + r7
            int r5 = r5 - r3
            int r7 = r13.dp(r8)
            int r2 = r2 - r3
            int r3 = r13.dp(r8)
            int r2 = r2 - r3
            int r2 = java.lang.Math.min(r5, r2)
            int r2 = java.lang.Math.max(r7, r2)
            r1 = r4[r1]
            int r14 = r14.getHeight()
            int r1 = r1 + r14
            int r14 = r13.dp(r8)
            int r1 = r1 + r14
            int r14 = r13.dp(r8)
            int r10 = r10 - r14
            int r14 = r1 + r0
            if (r14 <= r10) goto L187
            int r14 = r13.dp(r8)
            int r10 = r10 - r0
            int r1 = java.lang.Math.max(r14, r10)
        L187:
            r14 = 8388659(0x800033, float:1.1755015E-38)
            r6.showAtLocation(r11, r14, r2, r1)
            android.os.Handler r14 = r13.mainHandler
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda32 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda32
            r0.<init>(r13)
            r1 = 80
            r14.postDelayed(r0, r1)
            return
    }

    private void showLoaderVersionSelector(ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind r7, java.util.ArrayList<ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderVersion> r8) {
            r6 = this;
            boolean r0 = r8.isEmpty()
            java.lang.String r1 = "."
            if (r0 == 0) goto L34
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "No "
            r8.<init>(r0)
            java.lang.String r7 = r7.displayName
            java.lang.StringBuilder r7 = r8.append(r7)
            java.lang.String r8 = " versions found for Minecraft "
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r8 = r6.getGameVersionIdForContent()
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r7 = r7.append(r1)
            java.lang.String r7 = r7.toString()
            r8 = 1
            android.widget.Toast r7 = android.widget.Toast.makeText(r6, r7, r8)
            r7.show()
            return
        L34:
            java.lang.String r0 = r6.baseVersionId
            java.lang.String r2 = r6.getGameVersionIdForContent()
            java.lang.String r0 = ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.resolveCurrentLoaderVersion(r7, r0, r2)
            int r2 = r8.size()
            java.lang.String[] r2 = new java.lang.String[r2]
            r3 = 0
        L45:
            int r4 = r8.size()
            if (r3 >= r4) goto L5a
            java.lang.Object r4 = r8.get(r3)
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderVersion r4 = (ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderVersion) r4
            java.lang.String r4 = r4.getDisplayLabel(r0)
            r2[r3] = r4
            int r3 = r3 + 1
            goto L45
        L5a:
            boolean r3 = r6.isBlank(r0)
            if (r3 == 0) goto L63
            java.lang.String r3 = ""
            goto L7e
        L63:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "\n\nCurrent "
            r3.<init>(r4)
            java.lang.String r4 = r7.displayName
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " loader: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
        L7e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Pick the "
            r4.<init>(r5)
            java.lang.String r7 = r7.displayName
            java.lang.StringBuilder r7 = r4.append(r7)
            java.lang.String r4 = " loader version to install for Minecraft "
            java.lang.StringBuilder r7 = r7.append(r4)
            java.lang.String r4 = r6.getGameVersionIdForContent()
            java.lang.StringBuilder r7 = r7.append(r4)
            java.lang.StringBuilder r7 = r7.append(r1)
            java.lang.StringBuilder r7 = r7.append(r3)
            java.lang.String r7 = r7.toString()
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda13 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda13
            r1.<init>(r6, r8, r0)
            java.lang.String r8 = "Update Loader"
            r6.showVersionSelectionDialog(r8, r7, r2, r1)
            return
    }

    private void showMinecraftReleaseSelector(java.util.ArrayList<ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.MinecraftRelease> r6) {
            r5 = this;
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L11
            java.lang.String r6 = "No release versions found."
            r0 = 1
            android.widget.Toast r6 = android.widget.Toast.makeText(r5, r6, r0)
            r6.show()
            return
        L11:
            int r0 = r6.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = r5.getGameVersionIdForContent()
            r2 = 0
        L1c:
            int r3 = r6.size()
            if (r2 >= r3) goto L48
            java.lang.Object r3 = r6.get(r2)
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$MinecraftRelease r3 = (ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.MinecraftRelease) r3
            java.lang.String r3 = r3.id
            boolean r4 = r3.equals(r1)
            if (r4 == 0) goto L43
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r4 = " (current)"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
        L43:
            r0[r2] = r3
            int r2 = r2 + 1
            goto L1c
        L48:
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda69 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda69
            r1.<init>(r5, r6)
            java.lang.String r6 = "Update Version"
            java.lang.String r2 = "Pick the Minecraft release to update this instance to. Snapshots are hidden."
            r5.showVersionSelectionDialog(r6, r2, r0, r1)
            return
    }

    private void showModpackBackupWarning(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo r16, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.ProjectMatch r17, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo r18) {
            r15 = this;
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r15.enableFullscreen()
            android.widget.ScrollView r10 = new android.widget.ScrollView
            r10.<init>(r15)
            r0 = 0
            r10.setFillViewport(r0)
            int r0 = ca.dnamobile.javalauncher.InstanceDetailsActivity.MODPACK_DIALOG_BG
            r10.setBackgroundColor(r0)
            java.lang.String r0 = "Backup worlds first"
            java.lang.String r1 = "Updating a modpack can replace mods, configs, resource packs, shader packs, and other pack-managed files. A bad update can make worlds fail to load."
            android.widget.LinearLayout r11 = r15.createModpackDialogRoot(r10, r0, r1)
            android.widget.LinearLayout r12 = r15.addModpackDialogCard(r11)
            java.lang.String r0 = "Selected update"
            r15.addModpackCardTitle(r12, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r1 = r8.platform
            java.lang.String r1 = r1.displayName
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " • "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r8.title
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r2 = r0.toString()
            int r13 = ca.dnamobile.javalauncher.InstanceDetailsActivity.MODPACK_TEXT_SECONDARY
            r4 = 14
            r5 = 0
            r0 = r15
            r1 = r12
            r3 = r13
            r0.addModpackCardText(r1, r2, r3, r4, r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Current: "
            r0.<init>(r1)
            java.lang.String r1 = r7.currentVersionLabel
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r2 = r0.toString()
            int r14 = ca.dnamobile.javalauncher.InstanceDetailsActivity.MODPACK_TEXT_MUTED
            r4 = 12
            r0 = r15
            r1 = r12
            r3 = r14
            r0.addModpackCardText(r1, r2, r3, r4, r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Selected: "
            r0.<init>(r1)
            java.lang.String r1 = r9.versionLabel
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r2 = r0.toString()
            r0 = r15
            r1 = r12
            r0.addModpackCardText(r1, r2, r3, r4, r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Minecraft: "
            r0.<init>(r1)
            java.lang.String r1 = r18.getMinecraftVersionsLabel()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r2 = r0.toString()
            r0 = r15
            r1 = r12
            r0.addModpackCardText(r1, r2, r3, r4, r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Loader: "
            r0.<init>(r1)
            java.lang.String r1 = r18.getLoadersLabel()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r2 = r0.toString()
            r0 = r15
            r1 = r12
            r0.addModpackCardText(r1, r2, r3, r4, r5)
            android.widget.LinearLayout r1 = r15.addModpackDialogCard(r11)
            java.lang.String r0 = "World/saves behavior"
            r15.addModpackCardTitle(r1, r0)
            r4 = 13
            java.lang.String r2 = "DroidBridge keeps your existing saves folder. If the selected modpack includes saves, those saves are installed too. If a bundled world conflicts with an existing world folder, the bundled world is copied with a Pack World suffix instead of deleting your existing world."
            r0 = r15
            r3 = r13
            r0.addModpackCardText(r1, r2, r3, r4, r5)
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r15)
            android.app.AlertDialog$Builder r0 = r0.setView(r10)
            r1 = 17039360(0x1040000, float:2.424457E-38)
            r2 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda79 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda79
            r1.<init>(r15, r7, r8, r9)
            java.lang.String r2 = "Update"
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r2, r1)
            android.app.AlertDialog r0 = r0.create()
            r15.showStyledModpackDialog(r0)
            return
    }

    private void showModpackProjectChooser(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo r11, java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.ProjectMatch> r12) {
            r10 = this;
            r10.enableFullscreen()
            android.widget.ScrollView r0 = new android.widget.ScrollView
            r0.<init>(r10)
            r1 = 0
            r0.setFillViewport(r1)
            int r2 = ca.dnamobile.javalauncher.InstanceDetailsActivity.MODPACK_DIALOG_BG
            r0.setBackgroundColor(r2)
            java.lang.String r2 = "Update Modpack"
            java.lang.String r3 = "Choose which platform/project to update from. DroidBridge searches both Modrinth and CurseForge for the installed pack so you can switch platform when the same pack exists on both."
            android.widget.LinearLayout r2 = r10.createModpackDialogRoot(r0, r2, r3)
            android.widget.LinearLayout r9 = r10.addModpackDialogCard(r2)
            java.lang.String r3 = "Installed pack"
            r10.addModpackCardTitle(r9, r3)
            java.lang.String r5 = r11.displayTitle
            int r6 = ca.dnamobile.javalauncher.InstanceDetailsActivity.MODPACK_TEXT_SECONDARY
            r7 = 14
            r8 = 0
            r3 = r10
            r4 = r9
            r3.addModpackCardText(r4, r5, r6, r7, r8)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Current source: "
            r3.<init>(r4)
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r4 = r11.platform
            java.lang.String r4 = r4.displayName
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " • Current version: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = r11.currentVersionLabel
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r5 = r3.toString()
            int r6 = ca.dnamobile.javalauncher.InstanceDetailsActivity.MODPACK_TEXT_MUTED
            r7 = 12
            r3 = r10
            r4 = r9
            r3.addModpackCardText(r4, r5, r6, r7, r8)
            r3 = 1
            android.app.AlertDialog[] r3 = new android.app.AlertDialog[r3]
            java.util.Iterator r12 = r12.iterator()
        L5d:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto Lb2
            java.lang.Object r4 = r12.next()
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$ProjectMatch r4 = (ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.ProjectMatch) r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r6 = r4.platform
            java.lang.String r6 = r6.displayName
            java.lang.StringBuilder r5 = r5.append(r6)
            boolean r6 = r4.exactInstalledProject
            if (r6 == 0) goto L7d
            java.lang.String r6 = " • installed project"
            goto L7f
        L7d:
            java.lang.String r6 = " • matched by name"
        L7f:
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = r4.summary
            boolean r6 = r10.isBlank(r6)
            if (r6 == 0) goto L8e
            java.lang.String r6 = ""
            goto L9f
        L8e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "\n"
            r6.<init>(r7)
            java.lang.String r7 = r4.summary
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
        L9f:
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = r4.title
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda119 r7 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda119
            r7.<init>(r10, r3, r11, r4)
            r10.addModpackActionCard(r2, r6, r5, r7)
            goto L5d
        Lb2:
            android.app.AlertDialog$Builder r11 = new android.app.AlertDialog$Builder
            r11.<init>(r10)
            android.app.AlertDialog$Builder r11 = r11.setView(r0)
            r12 = 17039360(0x1040000, float:2.424457E-38)
            r0 = 0
            android.app.AlertDialog$Builder r11 = r11.setNegativeButton(r12, r0)
            android.app.AlertDialog r11 = r11.create()
            r3[r1] = r11
            r10.showStyledModpackDialog(r11)
            return
    }

    private void showModpackVersionChooser(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo r25, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.ProjectMatch r26, java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo> r27) {
            r24 = this;
            r7 = r24
            r8 = r27
            r24.enableFullscreen()
            android.content.res.Resources r0 = r24.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.heightPixels
            android.content.res.Resources r1 = r24.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.widthPixels
            r2 = 360(0x168, float:5.04E-43)
            int r2 = r7.dp(r2)
            r3 = 96
            int r3 = r7.dp(r3)
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
            r2 = 760(0x2f8, float:1.065E-42)
            int r2 = r7.dp(r2)
            int r0 = java.lang.Math.min(r0, r2)
            r2 = 340(0x154, float:4.76E-43)
            int r2 = r7.dp(r2)
            r3 = 72
            int r3 = r7.dp(r3)
            int r1 = r1 - r3
            r3 = 860(0x35c, float:1.205E-42)
            int r3 = r7.dp(r3)
            int r1 = java.lang.Math.min(r1, r3)
            int r9 = java.lang.Math.max(r2, r1)
            android.widget.FrameLayout r10 = new android.widget.FrameLayout
            r10.<init>(r7)
            int r1 = ca.dnamobile.javalauncher.InstanceDetailsActivity.MODPACK_DIALOG_BG
            r10.setBackgroundColor(r1)
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r2.<init>(r9, r0)
            r10.setLayoutParams(r2)
            android.widget.LinearLayout r11 = new android.widget.LinearLayout
            r11.<init>(r7)
            r12 = 1
            r11.setOrientation(r12)
            r11.setBackgroundColor(r1)
            r1 = 18
            int r1 = r7.dp(r1)
            r2 = 12
            int r3 = r7.dp(r2)
            r11.setPadding(r1, r1, r1, r3)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r13 = -1
            r1.<init>(r13, r0)
            r10.addView(r11, r1)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r7)
            r14 = r26
            java.lang.String r1 = r14.title
            r0.setText(r1)
            r1 = 1103101952(0x41c00000, float:24.0)
            r15 = 2
            r0.setTextSize(r15, r1)
            android.graphics.Typeface r1 = r0.getTypeface()
            r0.setTypeface(r1, r12)
            int r1 = ca.dnamobile.javalauncher.InstanceDetailsActivity.MODPACK_TEXT_PRIMARY
            r0.setTextColor(r1)
            r6 = 0
            r0.setSingleLine(r6)
            int r1 = r7.dp(r15)
            int r3 = r7.dp(r15)
            r5 = 6
            int r4 = r7.dp(r5)
            r0.setPadding(r1, r6, r3, r4)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r4 = -2
            r1.<init>(r13, r4)
            r11.addView(r0, r1)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r7)
            java.lang.String r1 = "Pick the latest version or any specific version of this modpack. The list is not locked to the current Minecraft version, so a 1.16.5 pack can migrate to a 1.20.1 pack when the project provides one."
            r0.setText(r1)
            r1 = 1096810496(0x41600000, float:14.0)
            r0.setTextSize(r15, r1)
            int r1 = ca.dnamobile.javalauncher.InstanceDetailsActivity.MODPACK_TEXT_SECONDARY
            r0.setTextColor(r1)
            int r3 = r7.dp(r15)
            int r5 = r7.dp(r15)
            int r2 = r7.dp(r2)
            r0.setPadding(r3, r6, r5, r2)
            r0.setSingleLine(r6)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r13, r4)
            r11.addView(r0, r2)
            android.widget.LinearLayout r0 = r7.addModpackDialogCard(r11)
            java.lang.String r2 = "Selected version"
            r7.addModpackCardTitle(r0, r2)
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r7)
            r2 = 1095761920(0x41500000, float:13.0)
            r5.setTextSize(r15, r2)
            r5.setTextColor(r1)
            r1 = 4
            int r1 = r7.dp(r1)
            r5.setPadding(r6, r6, r6, r1)
            r5.setSingleLine(r6)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r13, r4)
            r0.addView(r5, r1)
            android.widget.LinearLayout r3 = r24.createModpackDialogCard()
            java.lang.String r0 = "Available versions"
            r7.addModpackCardTitle(r3, r0)
            int r17 = ca.dnamobile.javalauncher.InstanceDetailsActivity.MODPACK_TEXT_MUTED
            r18 = 12
            r19 = 0
            java.lang.String r2 = "Tap a version, then press Install selected. The first row is the latest version returned by the platform."
            r0 = r24
            r1 = r3
            r15 = r3
            r3 = r17
            r4 = r18
            r13 = r5
            r5 = r19
            r0.addModpackCardText(r1, r2, r3, r4, r5)
            int[] r16 = new int[]{r6}
            java.lang.Object r0 = r8.get(r6)
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo r0 = (ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo) r0
            r7.updateSelectedModpackVersionText(r13, r0)
            android.widget.ScrollView r5 = new android.widget.ScrollView
            r5.<init>(r7)
            r5.setFillViewport(r6)
            r5.setClipToPadding(r6)
            r5.setOverScrollMode(r12)
            r0 = 6
            int r1 = r7.dp(r0)
            r4 = 8
            int r2 = r7.dp(r4)
            r5.setPadding(r6, r1, r6, r2)
            r5.setBackgroundColor(r6)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r7)
            r3.setOrientation(r12)
            int r0 = r7.dp(r0)
            r3.setPadding(r6, r6, r6, r0)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
            r5.addView(r3, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0 = r6
        L183:
            int r2 = r27.size()
            if (r0 >= r2) goto L1d0
            java.lang.Object r2 = r8.get(r0)
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo r2 = (ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo) r2
            if (r0 != 0) goto L192
            goto L193
        L192:
            r12 = r6
        L193:
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda73 r8 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda73
            r19 = r0
            r0 = r8
            r21 = r1
            r1 = r24
            r14 = r2
            r20 = r9
            r9 = -2
            r2 = r16
            r9 = r3
            r3 = r19
            r22 = r10
            r10 = r4
            r4 = r13
            r10 = r5
            r5 = r27
            r23 = r13
            r13 = r6
            r6 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6)
            android.view.View r0 = r7.addModpackVersionRow(r9, r14, r12, r8)
            r1 = r21
            r1.add(r0)
            int r0 = r19 + 1
            r14 = r26
            r8 = r27
            r3 = r9
            r5 = r10
            r6 = r13
            r9 = r20
            r10 = r22
            r13 = r23
            r4 = 8
            r12 = 1
            goto L183
        L1d0:
            r13 = r6
            r20 = r9
            r22 = r10
            r10 = r5
            r0 = r16[r13]
            r7.updateModpackVersionRowSelection(r1, r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = -1
            r0.<init>(r2, r13, r1)
            r15.addView(r10, r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r2, r13, r1)
            r1 = 10
            int r1 = r7.dp(r1)
            r0.setMargins(r13, r13, r13, r1)
            r11.addView(r15, r0)
            android.widget.LinearLayout r8 = new android.widget.LinearLayout
            r8.<init>(r7)
            r8.setOrientation(r13)
            r0 = 8388629(0x800015, float:1.1754973E-38)
            r8.setGravity(r0)
            r0 = 2
            int r0 = r7.dp(r0)
            r8.setPadding(r13, r0, r13, r13)
            r0 = 1
            android.app.AlertDialog[] r9 = new android.app.AlertDialog[r0]
            java.lang.String r1 = "Cancel"
            android.widget.TextView r10 = r7.createModpackFooterButton(r1, r13)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda74 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda74
            r1.<init>(r9)
            r10.setOnClickListener(r1)
            java.lang.String r1 = "Install selected"
            android.widget.TextView r12 = r7.createModpackFooterButton(r1, r0)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda75 r14 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda75
            r0 = r14
            r1 = r24
            r2 = r16
            r3 = r27
            r4 = r9
            r5 = r25
            r6 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r12.setOnClickListener(r14)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            r2 = 8
            int r2 = r7.dp(r2)
            r0.rightMargin = r2
            r8.addView(r10, r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r1, r1)
            r8.addView(r12, r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r2 = -1
            r0.<init>(r2, r1)
            r11.addView(r8, r0)
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r7)
            r2 = r22
            android.app.AlertDialog$Builder r0 = r0.setView(r2)
            android.app.AlertDialog r0 = r0.create()
            r9[r13] = r0
            r7.showStyledModpackDialog(r0)
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L279
            r2 = r20
            r0.setLayout(r2, r1)
        L279:
            return
    }

    private void showPerInstanceRamInputDialog(android.widget.TextView r17, android.widget.SeekBar r18, com.google.android.material.switchmaterial.SwitchMaterial r19, boolean[] r20, int[] r21, int r22, int r23, int r24, int r25) {
            r16 = this;
            r13 = r16
            android.widget.EditText r3 = new android.widget.EditText
            r3.<init>(r13)
            r0 = 2
            r3.setInputType(r0)
            r0 = 1
            r3.setSingleLine(r0)
            r3.setSelectAllOnFocus(r0)
            r0 = 0
            boolean r1 = r20[r0]
            if (r1 == 0) goto L1a
            r0 = r21[r0]
            goto L1e
        L1a:
            int r0 = ca.dnamobile.javalauncher.settings.MemoryAllocationUtils.resolveAllocatedMemoryMb(r16)
        L1e:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.setText(r0)
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r13)
            java.lang.String r1 = "Custom RAM"
            android.app.AlertDialog$Builder r0 = r0.setTitle(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Enter RAM in MB. Allowed range: "
            r1.<init>(r2)
            r8 = r22
            java.lang.StringBuilder r1 = r1.append(r8)
            java.lang.String r2 = " - "
            java.lang.StringBuilder r1 = r1.append(r2)
            r12 = r25
            java.lang.StringBuilder r1 = r1.append(r12)
            java.lang.String r2 = " MB."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.app.AlertDialog$Builder r0 = r0.setMessage(r1)
            android.app.AlertDialog$Builder r0 = r0.setView(r3)
            r1 = 17039360(0x1040000, float:2.424457E-38)
            r2 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            r1 = 17039370(0x104000a, float:2.42446E-38)
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)
            android.app.AlertDialog r14 = r0.create()
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda110 r15 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda110
            r0 = r15
            r1 = r16
            r2 = r14
            r4 = r21
            r5 = r20
            r6 = r19
            r7 = r18
            r9 = r23
            r10 = r24
            r11 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r14.setOnShowListener(r15)
            r13.showFullscreenSafeDialog(r14)
            return
    }

    private void showPerInstanceSettingsDialog() {
            r4 = this;
            r4.enableFullscreen()
            java.lang.String r0 = r4.getPerInstanceSettingsKey()
            ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog r1 = new ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog
            java.util.ArrayList r2 = r4.collectPerInstanceSettingsAliasKeys(r0)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda32 r3 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda32
            r3.<init>(r4)
            r1.<init>(r4, r0, r2, r3)
            r1.show()
            return
    }

    private void showRendererPluginStorageDialog(ca.dnamobile.javalauncher.renderer.RendererInterface r4, java.lang.String r5) {
            r3 = this;
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r3)
            int r1 = ca.dnamobile.javalauncher.R.string.renderer_plugin_storage_title
            android.app.AlertDialog$Builder r0 = r0.setTitle(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r4.getRendererName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " needs the MobileGlues folder selected before launch.\n\nPick the MG folder so the launcher can save the MobileGlues config here:\n"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.io.File r2 = ca.dnamobile.javalauncher.renderer.MobileGluesConfigHelper.getConfigFile()
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.app.AlertDialog$Builder r0 = r0.setMessage(r1)
            int r1 = ca.dnamobile.javalauncher.R.string.renderer_plugin_continue_anyway
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda57 r2 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda57
            r2.<init>(r3, r5)
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            int r1 = ca.dnamobile.javalauncher.R.string.renderer_plugin_open_settings
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda58 r2 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda58
            r2.<init>(r3, r4)
            android.app.AlertDialog$Builder r4 = r0.setNeutralButton(r1, r2)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda60 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda60
            r0.<init>(r3, r5)
            java.lang.String r5 = "Pick MG folder"
            android.app.AlertDialog$Builder r4 = r4.setPositiveButton(r5, r0)
            r4.show()
            return
    }

    private void showRepairInstanceDialog() {
            r4 = this;
            java.lang.String r0 = r4.getGameVersionIdForContent()
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Repair this instance for Minecraft "
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r3 = "?\n\nThis will redownload the vanilla game files, libraries, asset index, and missing assets needed by the current launcher storage location.\n\nActive launcher home:\n"
            r0.append(r3)
            if (r1 != 0) goto L1a
            java.lang.String r1 = "(unknown)"
        L1a:
            java.lang.StringBuilder r0 = r2.append(r1)
            java.lang.String r1 = "\n\nThis does not delete saves, mods, shaderpacks, or resource packs."
            r0.append(r1)
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r4)
            java.lang.String r1 = "Repair Instance"
            android.app.AlertDialog$Builder r0 = r0.setTitle(r1)
            java.lang.String r1 = r2.toString()
            android.app.AlertDialog$Builder r0 = r0.setMessage(r1)
            r1 = 17039360(0x1040000, float:2.424457E-38)
            r2 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda15 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda15
            r1.<init>(r4)
            java.lang.String r2 = "Repair"
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r2, r1)
            r0.show()
            return
    }

    private void showStyledModpackDialog(android.app.AlertDialog r1) {
            r0 = this;
            r0.showFullscreenSafeDialog(r1)
            r0.styleModpackDialogChrome(r1)
            return
    }

    private void showUpdateLoaderDialog() {
            r9 = this;
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind r0 = r9.getSupportedLoaderKind()
            if (r0 != 0) goto L11
            java.lang.String r0 = "Update Loader is only available for Fabric, Forge, and NeoForge instances."
            r1 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r9, r0, r1)
            r0.show()
            return
        L11:
            java.lang.String r1 = r9.getGameVersionIdForContent()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Loading "
            r2.<init>(r3)
            java.lang.String r3 = r0.displayName
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " versions"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r4 = r2.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Fetching loader versions for Minecraft "
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r3 = "..."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r5 = r2.toString()
            r7 = 1
            r8 = 1
            r6 = 1
            r3 = r9
            r3.showUpdateProgressDialog(r4, r5, r6, r7, r8)
            java.lang.Thread r2 = new java.lang.Thread
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda12 r3 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda12
            r3.<init>(r9, r0, r1)
            java.lang.String r0 = "Load Loader Versions"
            r2.<init>(r3, r0)
            r2.start()
            return
    }

    private void showUpdateModpackDialog() {
            r7 = this;
            java.io.File r0 = r7.rootDirectory
            java.io.File r1 = r7.gameDirectory
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$InstalledModpackInfo r0 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.readInstalledModpackInfo(r0, r1)
            if (r0 != 0) goto L15
            java.lang.String r0 = "This instance does not have modpack update metadata."
            r1 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r7, r0, r1)
            r0.show()
            return
        L15:
            r5 = 2
            r6 = 1
            java.lang.String r2 = "Update Modpack"
            java.lang.String r3 = "Finding matching Modrinth and CurseForge projects..."
            r4 = 1
            r1 = r7
            r1.showUpdateProgressDialog(r2, r3, r4, r5, r6)
            java.lang.Thread r1 = new java.lang.Thread
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda5 r2 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda5
            r2.<init>(r7, r0)
            java.lang.String r0 = "Find Modpack Projects"
            r1.<init>(r2, r0)
            r1.start()
            return
    }

    private void showUpdateProgressDialog(java.lang.String r8, java.lang.String r9, boolean r10, int r11, boolean r12) {
            r7 = this;
            r7.dismissUpdateProgressDialog()
            android.view.Window r0 = r7.getWindow()
            r1 = 128(0x80, float:1.8E-43)
            r0.addFlags(r1)
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r7)
            r1 = 1
            r0.setOrientation(r1)
            r2 = 22
            int r2 = r7.dp(r2)
            r3 = 6
            int r3 = r7.dp(r3)
            r4 = 0
            r0.setPadding(r2, r3, r2, r4)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r7)
            r7.updateProgressMessage = r2
            r2.setText(r9)
            android.widget.TextView r9 = r7.updateProgressMessage
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = -1
            r5 = -2
            r2.<init>(r3, r5)
            r0.addView(r9, r2)
            android.widget.ProgressBar r9 = new android.widget.ProgressBar
            r2 = 0
            r6 = 16842872(0x1010078, float:2.3693894E-38)
            r9.<init>(r7, r2, r6)
            r7.updateProgressBar = r9
            r9.setIndeterminate(r10)
            android.widget.ProgressBar r9 = r7.updateProgressBar
            int r10 = java.lang.Math.max(r1, r11)
            r9.setMax(r10)
            android.widget.ProgressBar r9 = r7.updateProgressBar
            r9.setProgress(r4)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r9.<init>(r3, r5)
            r10 = 12
            int r10 = r7.dp(r10)
            r9.topMargin = r10
            android.widget.ProgressBar r10 = r7.updateProgressBar
            r0.addView(r10, r9)
            android.app.AlertDialog$Builder r9 = new android.app.AlertDialog$Builder
            r9.<init>(r7)
            android.app.AlertDialog$Builder r8 = r9.setTitle(r8)
            android.app.AlertDialog$Builder r8 = r8.setView(r0)
            android.app.AlertDialog$Builder r8 = r8.setCancelable(r12)
            android.app.AlertDialog r8 = r8.create()
            r7.updateProgressDialog = r8
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda78 r9 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda78
            r9.<init>(r7)
            r8.setOnDismissListener(r9)
            android.app.AlertDialog r8 = r7.updateProgressDialog
            r8.show()
            return
    }

    private void showUpdateVersionDialog() {
            r6 = this;
            r4 = 1
            r5 = 1
            java.lang.String r1 = "Loading Minecraft versions"
            java.lang.String r2 = "Fetching release versions..."
            r3 = 1
            r0 = r6
            r0.showUpdateProgressDialog(r1, r2, r3, r4, r5)
            java.lang.Thread r0 = new java.lang.Thread
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda14 r1 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda14
            r1.<init>(r6)
            java.lang.String r2 = "Load Minecraft Releases"
            r0.<init>(r1, r2)
            r0.start()
            return
    }

    private void showVersionSelectionDialog(java.lang.String r8, java.lang.String r9, java.lang.String[] r10, android.content.DialogInterface.OnClickListener r11) {
            r7 = this;
            r7.enableFullscreen()
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r7)
            r1 = 1
            r0.setOrientation(r1)
            r2 = 24
            int r2 = r7.dp(r2)
            r3 = 4
            int r3 = r7.dp(r3)
            r4 = 0
            r0.setPadding(r2, r3, r2, r4)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r7)
            r2.setText(r9)
            r9 = 2
            r3 = 1097859072(0x41700000, float:15.0)
            r2.setTextSize(r9, r3)
            r9 = 16842806(0x1010036, float:2.369371E-38)
            r3 = -1
            int r9 = r7.resolveThemeColor(r9, r3)
            r2.setTextColor(r9)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r5 = -2
            r9.<init>(r3, r5)
            r0.addView(r2, r9)
            android.widget.ListView r9 = new android.widget.ListView
            r9.<init>(r7)
            android.widget.ArrayAdapter r2 = new android.widget.ArrayAdapter
            r5 = 17367043(0x1090003, float:2.5162934E-38)
            r2.<init>(r7, r5, r10)
            r9.setAdapter(r2)
            r9.setChoiceMode(r4)
            r9.setDividerHeight(r4)
            r9.setClipToPadding(r4)
            r2 = 8
            int r5 = r7.dp(r2)
            int r6 = r7.getDropdownBottomSafePadding()
            r9.setPadding(r4, r5, r4, r6)
            int r10 = r10.length
            int r10 = java.lang.Math.max(r10, r1)
            int r10 = java.lang.Math.min(r10, r2)
            r1 = 420(0x1a4, float:5.89E-43)
            int r1 = r7.dp(r1)
            r4 = 52
            int r4 = r7.dp(r4)
            int r10 = r10 * r4
            int r4 = r7.dp(r2)
            int r10 = r10 + r4
            int r4 = r7.getDropdownBottomSafePadding()
            int r10 = r10 + r4
            int r10 = java.lang.Math.min(r1, r10)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r3, r10)
            int r10 = r7.dp(r2)
            r1.topMargin = r10
            r0.addView(r9, r1)
            android.app.AlertDialog$Builder r10 = new android.app.AlertDialog$Builder
            r10.<init>(r7)
            android.app.AlertDialog$Builder r8 = r10.setTitle(r8)
            android.app.AlertDialog$Builder r8 = r8.setView(r0)
            r10 = 17039360(0x1040000, float:2.424457E-38)
            r0 = 0
            android.app.AlertDialog$Builder r8 = r8.setNegativeButton(r10, r0)
            android.app.AlertDialog r8 = r8.create()
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda77 r10 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda77
            r10.<init>(r8, r11)
            r9.setOnItemClickListener(r10)
            r7.showFullscreenSafeDialog(r8)
            return
    }

    private void signInWithMicrosoftThen(java.lang.Runnable r2) {
            r1 = this;
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal r0 = r1.authManager
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal.isConfigured()
            if (r0 != 0) goto L16
            int r2 = ca.dnamobile.javalauncher.R.string.msg_configure_client_id
            r0 = 1
            android.widget.Toast r2 = android.widget.Toast.makeText(r1, r2, r0)
            r2.show()
            return
        L16:
            r1.pendingAfterMicrosoftSignIn = r2
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal r2 = r1.authManager
            r2.signIn()
            return
    }

    private void startModpackExport(ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform r4) {
            r3 = this;
            java.io.File r0 = r3.gameDirectory
            java.io.File r1 = r3.iconFile
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda39 r2 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda39
            r2.<init>(r3, r4)
            ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog.show(r3, r0, r1, r4, r2)
            return
    }

    private void startWorldExport(java.io.File r4) {
            r3 = this;
            boolean r0 = r4.isDirectory()
            r1 = 1
            if (r0 == 0) goto L50
            java.io.File r0 = new java.io.File
            java.lang.String r2 = "level.dat"
            r0.<init>(r4, r2)
            boolean r0 = r0.isFile()
            if (r0 != 0) goto L15
            goto L50
        L15:
            r3.pendingWorldExportDirectory = r4
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.CREATE_DOCUMENT"
            r0.<init>(r2)
            java.lang.String r2 = "android.intent.category.OPENABLE"
            r0.addCategory(r2)
            java.lang.String r2 = "application/zip"
            r0.setType(r2)
            java.lang.String r4 = r4.getName()
            java.lang.String r2 = ".zip"
            java.lang.String r4 = r3.sanitizeImportedFileName(r4, r2)
            java.lang.String r2 = "android.intent.extra.TITLE"
            r0.putExtra(r2, r4)
            java.lang.String r4 = "Export World"
            android.content.Intent r4 = android.content.Intent.createChooser(r0, r4)     // Catch: android.content.ActivityNotFoundException -> L43
            r0 = 9128(0x23a8, float:1.2791E-41)
            r3.startActivityForResult(r4, r0)     // Catch: android.content.ActivityNotFoundException -> L43
            goto L4f
        L43:
            r4 = 0
            r3.pendingWorldExportDirectory = r4
            java.lang.String r4 = "No file picker is available for exporting."
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r1)
            r4.show()
        L4f:
            return
        L50:
            java.lang.String r4 = "This folder does not look like a Minecraft world."
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r1)
            r4.show()
            return
    }

    private void startWorldExportFromRow(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r1) {
            r0 = this;
            r0.prepareContentRowAction()
            ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem r1 = r0.resolveContentItemForAction(r1)
            java.io.File r1 = r1.file
            r0.startWorldExport(r1)
            return
    }

    private java.lang.String stripDisabledSuffix(java.lang.String r3) {
            r2 = this;
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r3.toLowerCase(r0)
            java.lang.String r1 = ".disabled"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L1c
            int r0 = r3.length()
            int r1 = r1.length()
            int r0 = r0 - r1
            r1 = 0
            java.lang.String r3 = r3.substring(r1, r0)
        L1c:
            return r3
    }

    private java.lang.String stripExtension(java.lang.String r3) {
            r2 = this;
            java.lang.String r3 = r2.stripDisabledSuffix(r3)
            r0 = 46
            int r0 = r3.lastIndexOf(r0)
            if (r0 <= 0) goto L11
            r1 = 0
            java.lang.String r3 = r3.substring(r1, r0)
        L11:
            return r3
    }

    private void styleModpackDialogChrome(android.app.AlertDialog r5) {
            r4 = this;
            android.view.Window r0 = r5.getWindow()
            if (r0 == 0) goto L2b
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>()
            int r2 = ca.dnamobile.javalauncher.InstanceDetailsActivity.MODPACK_DIALOG_BG
            r1.setColor(r2)
            r3 = 22
            int r3 = r4.dp(r3)
            float r3 = (float) r3
            r1.setCornerRadius(r3)
            r3 = 1
            int r3 = r4.dp(r3)
            r1.setStroke(r3, r2)
            r0.setBackgroundDrawable(r1)
            r1 = 1058306785(0x3f147ae1, float:0.58)
            r0.setDimAmount(r1)
        L2b:
            r0 = -1
            r4.tintModpackDialogButton(r5, r0)
            r0 = -2
            r4.tintModpackDialogButton(r5, r0)
            r0 = -3
            r4.tintModpackDialogButton(r5, r0)
            return
    }

    private void styleModpackListText(android.view.View r5) {
            r4 = this;
            int r0 = ca.dnamobile.javalauncher.InstanceDetailsActivity.MODPACK_CARD_BG_PRESSED
            r5.setBackgroundColor(r0)
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 == 0) goto L31
            android.widget.TextView r5 = (android.widget.TextView) r5
            int r0 = ca.dnamobile.javalauncher.InstanceDetailsActivity.MODPACK_TEXT_PRIMARY
            r5.setTextColor(r0)
            r0 = 2
            r1 = 1096810496(0x41600000, float:14.0)
            r5.setTextSize(r0, r1)
            r0 = 0
            r5.setSingleLine(r0)
            r0 = 14
            int r1 = r4.dp(r0)
            r2 = 10
            int r3 = r4.dp(r2)
            int r0 = r4.dp(r0)
            int r2 = r4.dp(r2)
            r5.setPadding(r1, r3, r0, r2)
        L31:
            return
    }

    private boolean supportsMods() {
            r2 = this;
            java.lang.String r0 = "vanilla"
            java.lang.String r1 = r2.loader
            boolean r0 = r0.equalsIgnoreCase(r1)
            r0 = r0 ^ 1
            return r0
    }

    private void syncModpackFilesManifestAfterUpdate(ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateCleanupPlan r13, java.io.File r14, org.json.JSONObject r15) throws java.lang.Exception {
            r12 = this;
            java.io.File r0 = r12.gameDirectory
            if (r0 != 0) goto L5
            return
        L5:
            java.io.File r0 = r12.getModpackFilesManifestFile()
            boolean r1 = r0.isFile()
            if (r1 != 0) goto L14
            boolean r2 = r13.hadModpackMetadata
            if (r2 != 0) goto L14
            return
        L14:
            if (r1 == 0) goto L20
            org.json.JSONObject r1 = new org.json.JSONObject
            java.lang.String r2 = r12.readTextFile(r0)
            r1.<init>(r2)
            goto L25
        L20:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
        L25:
            java.lang.String r2 = "files"
            org.json.JSONArray r3 = r1.optJSONArray(r2)
            if (r3 != 0) goto L32
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
        L32:
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            r5 = 0
            r6 = r5
        L39:
            int r7 = r3.length()
            if (r6 >= r7) goto L72
            org.json.JSONObject r7 = r3.optJSONObject(r6)
            if (r7 != 0) goto L46
            goto L6f
        L46:
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r8 = r12.resolveContentTypeFromEntry(r7)
            if (r8 != 0) goto L4e
            r8 = 0
            goto L52
        L4e:
            java.io.File r8 = r12.resolveFileForInstalledEntry(r7, r8)
        L52:
            if (r8 == 0) goto L5c
            boolean r8 = r8.isFile()
            if (r8 != 0) goto L5c
            r8 = 1
            goto L5d
        L5c:
            r8 = r5
        L5d:
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r9 = r13.contentType
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r10 = r13.source
            java.lang.String r11 = r13.projectId
            boolean r9 = r12.entryMatchesProject(r7, r9, r10, r11)
            if (r9 != 0) goto L6f
            if (r8 == 0) goto L6c
            goto L6f
        L6c:
            r4.put(r7)
        L6f:
            int r6 = r6 + 1
            goto L39
        L72:
            if (r14 == 0) goto L91
            boolean r3 = r14.isFile()
            if (r3 == 0) goto L91
            if (r15 != 0) goto L81
            org.json.JSONObject r15 = r12.buildFallbackUpdatedEntry(r13, r14)
            goto L8b
        L81:
            org.json.JSONObject r3 = new org.json.JSONObject
            java.lang.String r15 = r15.toString()
            r3.<init>(r15)
            r15 = r3
        L8b:
            r12.normalizeUpdatedManifestEntry(r13, r15, r14)
            r4.put(r15)
        L91:
            r1.put(r2, r4)
            r13 = 2
            java.lang.String r13 = r1.toString(r13)
            r12.writeTextFile(r0, r13)
            return
    }

    private void tintModpackDialogButton(android.app.AlertDialog r1, int r2) {
            r0 = this;
            android.widget.Button r1 = r1.getButton(r2)
            if (r1 == 0) goto Lb
            int r2 = ca.dnamobile.javalauncher.InstanceDetailsActivity.MODPACK_ACCENT
            r1.setTextColor(r2)
        Lb:
            return
    }

    private ca.dnamobile.javalauncher.modmanager.ModManagerContentType toModManagerContentType(ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory r2) {
            r1 = this;
            int r2 = r2.ordinal()
            if (r2 == 0) goto L14
            r0 = 1
            if (r2 == r0) goto L11
            r0 = 2
            if (r2 == r0) goto Le
            r2 = 0
            return r2
        Le:
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.RESOURCEPACKS
            return r2
        L11:
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.SHADERPACKS
            return r2
        L14:
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODS
            return r2
    }

    private android.widget.LinearLayout.LayoutParams topMarginParams(int r4) {
            r3 = this;
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
            r0.topMargin = r4
            return r0
    }

    private java.io.File uniqueTargetDirectory(java.io.File r5, java.lang.String r6) {
            r4 = this;
            r0 = 0
            java.lang.String r6 = r4.sanitizeImportedFileName(r6, r0)
            boolean r0 = r4.isBlank(r6)
            if (r0 == 0) goto Ld
            java.lang.String r6 = "Imported World"
        Ld:
            java.io.File r0 = new java.io.File
            r0.<init>(r5, r6)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L19
            return r0
        L19:
            r0 = 2
        L1a:
            r1 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r2 = "-"
            if (r0 >= r1) goto L44
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.<init>(r5, r2)
            boolean r2 = r1.exists()
            if (r2 != 0) goto L41
            return r1
        L41:
            int r0 = r0 + 1
            goto L1a
        L44:
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r6 = r1.append(r6)
            java.lang.StringBuilder r6 = r6.append(r2)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r6 = r6.toString()
            r0.<init>(r5, r6)
            return r0
    }

    private java.io.File uniqueTargetFile(java.io.File r6, java.lang.String r7) {
            r5 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r6, r7)
            boolean r1 = r0.exists()
            if (r1 != 0) goto Lc
            return r0
        Lc:
            r0 = 46
            int r0 = r7.lastIndexOf(r0)
            if (r0 <= 0) goto L20
            r1 = 0
            java.lang.String r1 = r7.substring(r1, r0)
            java.lang.String r7 = r7.substring(r0)
            r0 = r7
            r7 = r1
            goto L22
        L20:
            java.lang.String r0 = ""
        L22:
            r1 = 2
        L23:
            r2 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r3 = "-"
            if (r1 >= r2) goto L51
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r4 = r4.append(r7)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r6, r3)
            boolean r3 = r2.exists()
            if (r3 != 0) goto L4e
            return r2
        L4e:
            int r1 = r1 + 1
            goto L23
        L51:
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r7 = r2.append(r7)
            java.lang.StringBuilder r7 = r7.append(r3)
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r7 = r7.append(r2)
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r7 = r7.toString()
            r1.<init>(r6, r7)
            return r1
    }

    private void updateAllAvailableForSelectedCategory() {
            r5 = this;
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r0 = r5.selectedCategory
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = r5.toModManagerContentType(r0)
            if (r0 == 0) goto L9d
            java.io.File r1 = r5.gameDirectory
            if (r1 != 0) goto Le
            goto L9d
        Le:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = r0.name()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = ":"
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.util.Map<java.lang.String, ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager$UpdateCandidate> r2 = r5.updateCandidates
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L34:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L56
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r4.startsWith(r0)
            if (r4 == 0) goto L34
            java.lang.Object r3 = r3.getValue()
            ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager$UpdateCandidate r3 = (ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.UpdateCandidate) r3
            r1.add(r3)
            goto L34
        L56:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L67
            int r0 = ca.dnamobile.javalauncher.R.string.instance_content_no_updates_found
            r1 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r5, r0, r1)
            r0.show()
            return
        L67:
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r5)
            int r2 = ca.dnamobile.javalauncher.R.string.instance_content_update_all_title
            android.app.AlertDialog$Builder r0 = r0.setTitle(r2)
            int r2 = ca.dnamobile.javalauncher.R.string.instance_content_update_all_message
            int r3 = r1.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r2 = r5.getString(r2, r3)
            android.app.AlertDialog$Builder r0 = r0.setMessage(r2)
            r2 = 17039360(0x1040000, float:2.424457E-38)
            r3 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r2, r3)
            int r2 = ca.dnamobile.javalauncher.R.string.instance_content_update_all
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda4 r3 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda4
            r3.<init>(r5, r1)
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r2, r3)
            r0.show()
        L9d:
            return
    }

    private void updateAllCandidates(java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.UpdateCandidate> r9) {
            r8 = this;
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L84
            java.io.File r0 = r8.gameDirectory
            if (r0 != 0) goto Lc
            goto L84
        Lc:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r9.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r1.next()
            ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager$UpdateCandidate r2 = (ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.UpdateCandidate) r2
            ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateCleanupPlan r2 = r8.createUpdateCleanupPlan(r2)
            r0.add(r2)
            goto L15
        L29:
            int r1 = ca.dnamobile.javalauncher.R.string.instance_content_update_all_title
            java.lang.String r3 = r8.getString(r1)
            int r1 = ca.dnamobile.javalauncher.R.string.instance_content_update_all_wait
            java.lang.String r4 = r8.getString(r1)
            int r6 = r9.size()
            r7 = 0
            r5 = 0
            r2 = r8
            r2.showUpdateProgressDialog(r3, r4, r5, r6, r7)
            java.util.Iterator r1 = r9.iterator()
        L43:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6e
            java.lang.Object r2 = r1.next()
            ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager$UpdateCandidate r2 = (ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.UpdateCandidate) r2
            java.lang.String r3 = r8.buildUpdateKey(r2)
            java.util.Map<java.lang.String, ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState> r4 = r8.updateStates
            ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState r5 = ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState.UPDATING
            r4.put(r3, r5)
            java.util.Map<java.lang.String, java.lang.String> r4 = r8.updateMessages
            int r5 = ca.dnamobile.javalauncher.R.string.instance_content_updating_value
            ca.dnamobile.javalauncher.modmanager.ModrinthVersion r2 = r2.latestVersion
            java.lang.String r2 = r2.versionNumber
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r2 = r8.getString(r5, r2)
            r4.put(r3, r2)
            goto L43
        L6e:
            ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter r1 = r8.contentAdapter
            if (r1 == 0) goto L75
            r1.notifyDataSetChanged()
        L75:
            java.lang.Thread r1 = new java.lang.Thread
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda38 r2 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda38
            r2.<init>(r8, r9, r0)
            java.lang.String r9 = "Update All Instance Content"
            r1.<init>(r2, r9)
            r1.start()
        L84:
            return
    }

    private void updateCandidate(ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.UpdateCandidate r10) {
            r9 = this;
            java.lang.String r0 = r9.buildUpdateKey(r10)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateCleanupPlan r1 = r9.createUpdateCleanupPlan(r10)
            java.util.Map<java.lang.String, ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState> r2 = r9.updateStates
            ca.dnamobile.javalauncher.InstanceDetailsActivity$UpdateState r3 = ca.dnamobile.javalauncher.InstanceDetailsActivity.UpdateState.UPDATING
            r2.put(r0, r3)
            java.util.Map<java.lang.String, java.lang.String> r2 = r9.updateMessages
            int r3 = ca.dnamobile.javalauncher.R.string.instance_content_updating_value
            ca.dnamobile.javalauncher.modmanager.ModrinthVersion r4 = r10.latestVersion
            java.lang.String r4 = r4.versionNumber
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r3 = r9.getString(r3, r4)
            r2.put(r0, r3)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentAdapter r2 = r9.contentAdapter
            if (r2 == 0) goto L29
            r2.notifyDataSetChanged()
        L29:
            int r2 = ca.dnamobile.javalauncher.R.string.instance_content_updating_title
            java.lang.String r4 = r9.getString(r2)
            int r2 = ca.dnamobile.javalauncher.R.string.instance_content_updating_one
            java.lang.String r3 = r10.getDisplayName()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r5 = r9.getString(r2, r3)
            r7 = 1
            r8 = 0
            r6 = 1
            r3 = r9
            r3.showUpdateProgressDialog(r4, r5, r6, r7, r8)
            java.lang.Thread r2 = new java.lang.Thread
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda41 r3 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda41
            r3.<init>(r9, r10, r1, r0)
            java.lang.String r10 = "Update Instance Content Item"
            r2.<init>(r3, r10)
            r2.start()
            return
    }

    private void updateContentHint(java.io.File r4) {
            r3 = this;
            java.util.ArrayList<ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem> r4 = r3.allContentItems
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto Lb
            java.util.ArrayList<ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem> r4 = r3.contentItems
            goto Ld
        Lb:
            java.util.ArrayList<ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem> r4 = r3.allContentItems
        Ld:
            int r4 = r4.size()
            java.util.ArrayList<ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem> r0 = r3.contentItems
            int r0 = r0.size()
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r1 = r3.selectedCategory
            int r1 = r1.pluralLabelRes
            java.lang.String r1 = r3.getString(r1)
            java.lang.String r2 = r3.contentSearchQuery
            boolean r2 = r3.isBlank(r2)
            if (r2 != 0) goto L55
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = " of "
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r0 = " "
            java.lang.StringBuilder r4 = r4.append(r0)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r1.toLowerCase(r0)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r0 = " found"
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            goto L70
        L55:
            if (r0 != 0) goto L62
            int r4 = ca.dnamobile.javalauncher.R.string.instance_content_empty_value
            java.lang.Object[] r0 = new java.lang.Object[]{r1}
            java.lang.String r4 = r3.getString(r4, r0)
            goto L70
        L62:
            int r4 = ca.dnamobile.javalauncher.R.string.instance_content_count_value
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r4 = r3.getString(r4, r0)
        L70:
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r0 = r3.selectedCategory
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r1 = ca.dnamobile.javalauncher.InstanceDetailsActivity.ResourceCategory.MODS
            if (r0 != r1) goto L8a
            boolean r0 = r3.supportsMods()
            if (r0 != 0) goto L8a
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r4 = r3.binding
            android.widget.TextView r4 = r4.textModsHint
            int r0 = ca.dnamobile.javalauncher.R.string.mods_vanilla_hint
            java.lang.String r0 = r3.getString(r0)
            r4.setText(r0)
            goto L91
        L8a:
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r3.binding
            android.widget.TextView r0 = r0.textModsHint
            r0.setText(r4)
        L91:
            return
    }

    private void updateContentUpdateButtons() {
            r5 = this;
            boolean r0 = r5.canCheckUpdatesForSelectedCategory()
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r1 = r5.binding
            com.google.android.material.button.MaterialButton r1 = r1.buttonCheckContentUpdates
            r2 = 8
            r3 = 0
            if (r0 == 0) goto Lf
            r4 = r3
            goto L10
        Lf:
            r4 = r2
        L10:
            r1.setVisibility(r4)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r1 = r5.binding
            com.google.android.material.button.MaterialButton r1 = r1.buttonCheckContentUpdates
            r4 = 1
            if (r0 == 0) goto L20
            boolean r0 = r5.contentOperationRunning
            if (r0 != 0) goto L20
            r0 = r4
            goto L21
        L20:
            r0 = r3
        L21:
            r1.setEnabled(r0)
            boolean r0 = r5.hasAvailableUpdatesForSelectedCategory()
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r1 = r5.binding
            com.google.android.material.button.MaterialButton r1 = r1.buttonUpdateAllContent
            if (r0 == 0) goto L2f
            r2 = r3
        L2f:
            r1.setVisibility(r2)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r1 = r5.binding
            com.google.android.material.button.MaterialButton r1 = r1.buttonUpdateAllContent
            if (r0 == 0) goto L3d
            boolean r2 = r5.contentOperationRunning
            if (r2 != 0) goto L3d
            r3 = r4
        L3d:
            r1.setEnabled(r3)
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r1 = r5.binding
            com.google.android.material.button.MaterialButton r1 = r1.buttonUpdateAllContent
            if (r0 == 0) goto L59
            int r0 = ca.dnamobile.javalauncher.R.string.instance_content_update_all_count
            int r2 = r5.countAvailableUpdatesForSelectedCategory()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r0 = r5.getString(r0, r2)
            goto L5f
        L59:
            int r0 = ca.dnamobile.javalauncher.R.string.instance_content_update_all
            java.lang.String r0 = r5.getString(r0)
        L5f:
            r1.setText(r0)
            return
    }

    private void updateIntentExtras() {
            r4 = this;
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.INSTANCE_ID"
            java.lang.String r2 = r4.instanceId
            r0.putExtra(r1, r2)
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.INSTANCE_NAME"
            java.lang.String r2 = r4.instanceName
            r0.putExtra(r1, r2)
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.INSTANCE_LOADER"
            java.lang.String r2 = r4.loader
            r0.putExtra(r1, r2)
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.BASE_VERSION_ID"
            java.lang.String r2 = r4.baseVersionId
            r0.putExtra(r1, r2)
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.MINECRAFT_VERSION_ID"
            java.lang.String r2 = r4.minecraftVersionId
            r0.putExtra(r1, r2)
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.VERSION_TYPE"
            java.lang.String r2 = r4.versionType
            r0.putExtra(r1, r2)
            java.io.File r1 = r4.rootDirectory
            java.lang.String r2 = ""
            if (r1 == 0) goto L39
            java.lang.String r1 = r1.getAbsolutePath()
            goto L3a
        L39:
            r1 = r2
        L3a:
            java.lang.String r3 = "ca.dnamobile.javalauncher.extra.ROOT_DIRECTORY"
            r0.putExtra(r3, r1)
            java.io.File r1 = r4.gameDirectory
            if (r1 == 0) goto L48
            java.lang.String r1 = r1.getAbsolutePath()
            goto L49
        L48:
            r1 = r2
        L49:
            java.lang.String r3 = "ca.dnamobile.javalauncher.extra.GAME_DIRECTORY"
            r0.putExtra(r3, r1)
            java.io.File r1 = r4.iconFile
            if (r1 == 0) goto L56
            java.lang.String r2 = r1.getAbsolutePath()
        L56:
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.ICON_FILE"
            r0.putExtra(r1, r2)
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.ISOLATED"
            boolean r2 = r4.isolated
            r0.putExtra(r1, r2)
            return
    }

    private void updateModpackVersionRowSelection(java.util.ArrayList<android.view.View> r8, int r9) {
            r7 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r8.size()
            if (r1 >= r2) goto L44
            java.lang.Object r2 = r8.get(r1)
            android.view.View r2 = (android.view.View) r2
            r3 = 1
            if (r1 != r9) goto L13
            r4 = r3
            goto L14
        L13:
            r4 = r0
        L14:
            android.graphics.drawable.GradientDrawable r5 = new android.graphics.drawable.GradientDrawable
            r5.<init>()
            if (r4 == 0) goto L1e
            int r6 = ca.dnamobile.javalauncher.InstanceDetailsActivity.MODPACK_CARD_BG_PRESSED
            goto L20
        L1e:
            int r6 = ca.dnamobile.javalauncher.InstanceDetailsActivity.MODPACK_CARD_BG
        L20:
            r5.setColor(r6)
            r6 = 16
            int r6 = r7.dp(r6)
            float r6 = (float) r6
            r5.setCornerRadius(r6)
            if (r4 == 0) goto L30
            r3 = 2
        L30:
            int r3 = r7.dp(r3)
            if (r4 == 0) goto L39
            int r4 = ca.dnamobile.javalauncher.InstanceDetailsActivity.MODPACK_ACCENT
            goto L3b
        L39:
            int r4 = ca.dnamobile.javalauncher.InstanceDetailsActivity.MODPACK_CARD_STROKE
        L3b:
            r5.setStroke(r3, r4)
            r2.setBackground(r5)
            int r1 = r1 + 1
            goto L2
        L44:
            return
    }

    private void updatePerInstanceRamSliderState(android.widget.SeekBar r1, boolean r2) {
            r0 = this;
            r1.setEnabled(r2)
            if (r2 == 0) goto L8
            r2 = 1065353216(0x3f800000, float:1.0)
            goto Lb
        L8:
            r2 = 1055286886(0x3ee66666, float:0.45)
        Lb:
            r1.setAlpha(r2)
            return
    }

    private void updatePerInstanceRamText(android.widget.TextView r3, boolean r4, int r5, int r6) {
            r2 = this;
            java.lang.String r0 = " MB ("
            if (r4 != 0) goto L2d
            int r4 = ca.dnamobile.javalauncher.settings.MemoryAllocationUtils.resolveAllocatedMemoryMb(r2)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Using launcher default: "
            r5.<init>(r6)
            java.lang.StringBuilder r5 = r5.append(r4)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r4 = r2.formatGb(r4)
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r5 = " GB)"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.setText(r4)
            return
        L2d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "Custom RAM: "
            r4.<init>(r1)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r5 = r2.formatGb(r5)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = " GB) · Max recommended: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r5 = " MB"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.setText(r4)
            return
    }

    private void updateSelectedModpackVersionText(android.widget.TextView r4, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo r5) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.versionLabel
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "\nMinecraft "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r5.getMinecraftVersionsLabel()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " • "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r5.getLoadersLabel()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r5.datePublished
            boolean r1 = r3.isBlank(r1)
            if (r1 == 0) goto L32
            java.lang.String r5 = ""
            goto L43
        L32:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "\n"
            r1.<init>(r2)
            java.lang.String r5 = r5.datePublished
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r5 = r5.toString()
        L43:
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            r4.setText(r5)
            return
    }

    private void updateSingleContentItem(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r3) {
            r2 = this;
            ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem r3 = r2.resolveContentItemForAction(r3)
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r0 = r3.category
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = r2.toModManagerContentType(r0)
            if (r0 == 0) goto L37
            java.io.File r1 = r2.gameDirectory
            if (r1 != 0) goto L11
            goto L37
        L11:
            org.json.JSONObject r1 = r2.getInstalledEntryForItem(r3)
            if (r1 != 0) goto L22
            int r3 = ca.dnamobile.javalauncher.R.string.instance_content_update_missing_metadata
            r0 = 1
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r0)
            r3.show()
            return
        L22:
            java.lang.String r0 = r2.buildUpdateKey(r0, r1)
            java.util.Map<java.lang.String, ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager$UpdateCandidate> r1 = r2.updateCandidates
            java.lang.Object r0 = r1.get(r0)
            ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager$UpdateCandidate r0 = (ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.UpdateCandidate) r0
            if (r0 != 0) goto L34
            r2.checkSingleContentUpdate(r3)
            return
        L34:
            r2.updateCandidate(r0)
        L37:
            return
    }

    private void updateSingleContentItemFromRow(ca.dnamobile.javalauncher.InstanceDetailsActivity.InstanceContentItem r1) {
            r0 = this;
            r0.prepareContentRowAction()
            ca.dnamobile.javalauncher.InstanceDetailsActivity$InstanceContentItem r1 = r0.resolveContentItemForAction(r1)
            r0.updateSingleContentItem(r1)
            return
    }

    private void writeTextFile(java.io.File r3, java.lang.String r4) throws java.io.IOException {
            r2 = this;
            java.io.File r0 = r3.getParentFile()
            if (r0 == 0) goto L2c
            boolean r1 = r0.exists()
            if (r1 != 0) goto L2c
            boolean r1 = r0.mkdirs()
            if (r1 == 0) goto L13
            goto L2c
        L13:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to create folder: "
            r4.<init>(r1)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L2c:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r3)
            java.lang.String r3 = "UTF-8"
            byte[] r3 = r4.getBytes(r3)     // Catch: java.lang.Throwable -> L3e
            r0.write(r3)     // Catch: java.lang.Throwable -> L3e
            r0.close()
            return
        L3e:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L43
            goto L47
        L43:
            r4 = move-exception
            r3.addSuppressed(r4)
        L47:
            throw r3
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int r4, int r5, android.content.Intent r6) {
            r3 = this;
            super.onActivityResult(r4, r5, r6)
            r0 = 9129(0x23a9, float:1.2792E-41)
            r1 = -1
            if (r4 != r0) goto L51
            if (r5 != r1) goto L50
            if (r6 == 0) goto L4a
            java.lang.String r4 = "ca.dnamobile.javalauncher.extra.INSTANCE_LOADER"
            java.lang.String r4 = r6.getStringExtra(r4)
            java.lang.String r5 = "ca.dnamobile.javalauncher.extra.BASE_VERSION_ID"
            java.lang.String r5 = r6.getStringExtra(r5)
            java.lang.String r0 = "ca.dnamobile.javalauncher.extra.MINECRAFT_VERSION_ID"
            java.lang.String r0 = r6.getStringExtra(r0)
            java.lang.String r2 = "ca.dnamobile.javalauncher.extra.VERSION_TYPE"
            java.lang.String r6 = r6.getStringExtra(r2)
            boolean r2 = r3.isBlank(r4)
            if (r2 != 0) goto L2c
            r3.loader = r4
        L2c:
            boolean r4 = r3.isBlank(r5)
            if (r4 != 0) goto L34
            r3.baseVersionId = r5
        L34:
            boolean r4 = r3.isBlank(r0)
            if (r4 != 0) goto L3c
            r3.minecraftVersionId = r0
        L3c:
            boolean r4 = r3.isBlank(r6)
            if (r4 != 0) goto L44
            r3.versionType = r6
        L44:
            r3.updateIntentExtras()
            r3.bindHeader()
        L4a:
            r3.setResult(r1)
            r3.refreshContentList()
        L50:
            return
        L51:
            r0 = 9128(0x23a8, float:1.2791E-41)
            r2 = 0
            if (r4 != r0) goto L6e
            java.io.File r4 = r3.pendingWorldExportDirectory
            r3.pendingWorldExportDirectory = r2
            if (r5 != r1) goto L6d
            if (r6 == 0) goto L6d
            android.net.Uri r5 = r6.getData()
            if (r5 == 0) goto L6d
            if (r4 == 0) goto L6d
            android.net.Uri r5 = r6.getData()
            r3.exportWorldToUri(r5, r4)
        L6d:
            return
        L6e:
            r0 = 9126(0x23a6, float:1.2788E-41)
            if (r4 != r0) goto L94
            ca.dnamobile.javalauncher.modmanager.ModpackExportManager$Platform r4 = r3.pendingExportPlatform
            ca.dnamobile.javalauncher.modmanager.ModpackExportManager$ExportOptions r0 = r3.pendingExportOptions
            r3.pendingExportPlatform = r2
            r3.pendingExportOptions = r2
            if (r5 != r1) goto L93
            if (r6 == 0) goto L93
            android.net.Uri r5 = r6.getData()
            if (r5 == 0) goto L93
            if (r4 == 0) goto L93
            android.net.Uri r5 = r6.getData()
            if (r0 != 0) goto L90
            ca.dnamobile.javalauncher.modmanager.ModpackExportManager$ExportOptions r0 = ca.dnamobile.javalauncher.modmanager.ModpackExportManager.ExportOptions.defaultOptions()
        L90:
            r3.exportModpackToUri(r5, r4, r0)
        L93:
            return
        L94:
            r0 = 9127(0x23a7, float:1.279E-41)
            if (r4 != r0) goto Laa
            if (r5 != r1) goto La9
            if (r6 == 0) goto La9
            android.net.Uri r4 = r6.getData()
            if (r4 == 0) goto La9
            android.net.Uri r4 = r6.getData()
            r3.importModpackFromUri(r4)
        La9:
            return
        Laa:
            r0 = 9125(0x23a5, float:1.2787E-41)
            if (r4 != r0) goto Lc0
            if (r5 != r1) goto Lbf
            if (r6 == 0) goto Lbf
            android.net.Uri r4 = r6.getData()
            if (r4 == 0) goto Lbf
            android.net.Uri r4 = r6.getData()
            r3.savePickedInstanceIcon(r4)
        Lbf:
            return
        Lc0:
            r0 = 9124(0x23a4, float:1.2785E-41)
            if (r4 != r0) goto Le5
            if (r5 != r1) goto Le5
            if (r6 != 0) goto Lc9
            goto Le5
        Lc9:
            java.util.ArrayList r4 = r3.collectSelectedUris(r6)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto Ld4
            return
        Ld4:
            ca.dnamobile.javalauncher.InstanceDetailsActivity$ResourceCategory r5 = r3.pendingImportCategory
            java.lang.Thread r6 = new java.lang.Thread
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda61 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda61
            r0.<init>(r3, r4, r5)
            java.lang.String r4 = "Import Instance Content"
            r6.<init>(r0, r4)
            r6.start()
        Le5:
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r1)
            android.view.LayoutInflater r2 = r1.getLayoutInflater()
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r2 = ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding.inflate(r2)
            r1.binding = r2
            android.widget.LinearLayout r2 = r2.getRoot()
            r1.setContentView(r2)
            r1.enableFullscreen()
            r1.registerMobileGluesFolderPickerLauncher()
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r2 = r1.binding
            com.google.android.material.button.MaterialButton r2 = r2.buttonBackFromInstanceDetails
            ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda6 r0 = new ca.dnamobile.javalauncher.InstanceDetailsActivity$$ExternalSyntheticLambda6
            r0.<init>(r1)
            r2.setOnClickListener(r0)
            boolean r2 = r1.readExtras()
            if (r2 != 0) goto L3d
            int r2 = ca.dnamobile.javalauncher.R.string.hint_select_instance
            r0 = 0
            android.widget.Toast r2 = android.widget.Toast.makeText(r1, r2, r0)
            r2.show()
            r1.finish()
            return
        L3d:
            r1.setupAccountGate()
            r1.bindHeader()
            r1.setupActions()
            r1.setupContentSearch()
            r1.setupContentTabs()
            r1.refreshContentList()
            r2 = 1
            r1.skipNextResumeContentRefresh = r2
            return
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
            r1 = this;
            r1.cancelPendingContentLoadingOverlay()
            r1.cancelPendingMetadataSearchFilter()
            java.util.concurrent.ExecutorService r0 = r1.contentRefreshExecutor
            r0.shutdownNow()
            java.util.concurrent.ExecutorService r0 = r1.contentOperationExecutor
            r0.shutdownNow()
            java.util.concurrent.ExecutorService r0 = r1.iconExecutor
            r0.shutdownNow()
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal r0 = r1.authManager
            if (r0 == 0) goto L1c
            r0.dispose()
        L1c:
            super.onDestroy()
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
            r1 = this;
            super.onResume()
            r1.enableFullscreen()
            boolean r0 = r1.skipNextResumeContentRefresh
            if (r0 == 0) goto Le
            r0 = 0
            r1.skipNextResumeContentRefresh = r0
            return
        Le:
            ca.dnamobile.javalauncher.databinding.ActivityInstanceDetailsBinding r0 = r1.binding
            if (r0 == 0) goto L19
            java.io.File r0 = r1.gameDirectory
            if (r0 == 0) goto L19
            r1.refreshContentList()
        L19:
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean r1) {
            r0 = this;
            super.onWindowFocusChanged(r1)
            if (r1 == 0) goto L8
            r0.enableFullscreen()
        L8:
            return
    }
}
