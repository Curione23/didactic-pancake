package ca.dnamobile.javalauncher.launcher;

/* JADX INFO: loaded from: classes.dex */
public class JavaLaunch extends androidx.appcompat.app.AppCompatActivity {
    private static final int COLOR_ACCENT = 0;
    private static final int COLOR_CARD_BG = 0;
    private static final int COLOR_CARD_STROKE = 0;
    private static final int COLOR_DIALOG_BG = 0;
    private static final int COLOR_TEXT_MUTED = 0;
    private static final int COLOR_TEXT_PRIMARY = 0;
    private static final int COLOR_TEXT_SECONDARY = 0;
    private static final java.lang.String FILTER_ALL = "all";
    private static final java.lang.String FILTER_MODIFIED = "modified";
    private static final java.lang.String FILTER_RECENT = "recent";
    private static final java.lang.String FILTER_SHARED = "shared";
    private static final java.lang.String FILTER_SNAPSHOT = "snapshot";
    private static final java.lang.String FILTER_VANILLA = "vanilla";
    private static final int INSTALL_NOTIFICATION_PROGRESS_STEP = 2;
    private static final long INSTALL_NOTIFICATION_UPDATE_INTERVAL_MS = 1000;
    private static final long INSTALL_UI_MESSAGE_UPDATE_INTERVAL_MS = 850;
    private static final long INSTALL_UI_UPDATE_INTERVAL_MS = 350;
    private static final int REQUEST_ADD_STORAGE_LOCATION = 8032;
    private static final int REQUEST_IMPORT_MODPACK = 8033;
    private static final int REQUEST_PICK_INSTANCE_ICON = 8021;
    private static final java.lang.String TAG_BROWSE_CONTENT_MAIN_BUTTON = "browse_content_main_button_dynamic";
    private static final java.lang.String TAG_IMPORT_MODPACK_MAIN_BUTTON = "import_modpack_main_button_dynamic";
    private static final java.lang.String TYPE_INSTALLED = "installed";
    private ca.dnamobile.javalauncher.data.AccountStore accountStore;
    private java.lang.String activeInstallMessage;
    private int activeInstallProgress;
    private java.lang.String activeInstallTitle;
    private final java.util.ArrayList<ca.dnamobile.javalauncher.data.model.MinecraftVersion> allVersions;
    private boolean appIntegrityBlocked;
    private ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal authManager;
    private ca.dnamobile.javalauncher.databinding.ActivityMainBinding binding;
    private ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog createInstanceDialog;
    private final java.lang.Runnable hideStatusRunnable;
    private androidx.appcompat.app.AlertDialog installDialog;
    private android.widget.CheckBox installDialogForegroundCheck;
    private android.widget.TextView installDialogMessage;
    private android.widget.ProgressBar installDialogProgress;
    private boolean installPermissionPromptShownThisSession;
    private boolean installSessionActive;
    private final java.util.Set<java.lang.String> installedBaseVersionIds;
    private final java.util.ArrayList<ca.dnamobile.javalauncher.instance.LauncherInstance> installedInstances;
    private ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter instanceAdapter;
    private int lastInstallNotificationProgress;
    private long lastInstallNotificationUpdateMs;
    private java.lang.String lastInstallUiDispatchMessage;
    private long lastInstallUiDispatchMs;
    private int lastInstallUiDispatchProgress;
    private androidx.appcompat.app.AlertDialog launchPrepareDialog;
    private android.widget.TextView launchPrepareMessage;
    private android.widget.TextView launchPreparePercent;
    private android.widget.ProgressBar launchPrepareProgress;
    private final android.os.Handler mainHandler;
    private androidx.activity.result.ActivityResultLauncher<java.lang.String> notificationPermissionLauncher;
    private java.lang.Runnable pendingAfterMicrosoftSignIn;
    private java.lang.String selectedFilter;
    private ca.dnamobile.javalauncher.instance.LauncherInstance selectedInstance;


    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.launcher.JavaLaunch$2, reason: invalid class name */
    class AnonymousClass2 implements ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter.Listener {
        final /* synthetic */ ca.dnamobile.javalauncher.launcher.JavaLaunch this$0;

        /* JADX INFO: renamed from: $r8$lambda$-NV7lntZ0nfe3XM46iDBIAi6AS4, reason: not valid java name */
        public static /* synthetic */ void m538$r8$lambda$NV7lntZ0nfe3XM46iDBIAi6AS4(ca.dnamobile.javalauncher.launcher.JavaLaunch.AnonymousClass2 r0, ca.dnamobile.javalauncher.instance.LauncherInstance r1) {
                r0.lambda$onInstanceSelected$0(r1)
                return
        }

        AnonymousClass2(ca.dnamobile.javalauncher.launcher.JavaLaunch r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        private /* synthetic */ void lambda$onInstanceSelected$0(ca.dnamobile.javalauncher.instance.LauncherInstance r2) {
                r1 = this;
                ca.dnamobile.javalauncher.launcher.JavaLaunch r0 = r1.this$0
                ca.dnamobile.javalauncher.launcher.JavaLaunch.m530$$Nest$mselectAndOpenInstance(r0, r2)
                return
        }

        @Override // ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter.Listener
        public void onInstanceDeleteRequested(ca.dnamobile.javalauncher.instance.LauncherInstance r2) {
                r1 = this;
                ca.dnamobile.javalauncher.launcher.JavaLaunch r0 = r1.this$0
                ca.dnamobile.javalauncher.launcher.JavaLaunch.m534$$Nest$mshowDeleteInstanceDialog(r0, r2)
                return
        }

        @Override // ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter.Listener
        public void onInstanceQuickPlayRequested(ca.dnamobile.javalauncher.instance.LauncherInstance r2) {
                r1 = this;
                ca.dnamobile.javalauncher.launcher.JavaLaunch r0 = r1.this$0
                ca.dnamobile.javalauncher.launcher.JavaLaunch.m525$$Nest$mquickLaunchInstance(r0, r2)
                return
        }

        @Override // ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter.Listener
        public void onInstanceSelected(ca.dnamobile.javalauncher.instance.LauncherInstance r3) {
                r2 = this;
                ca.dnamobile.javalauncher.launcher.JavaLaunch r0 = r2.this$0
                ca.dnamobile.javalauncher.launcher.JavaLaunch$2$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$2$$ExternalSyntheticLambda0
                r1.<init>(r2, r3)
                boolean r0 = ca.dnamobile.javalauncher.launcher.JavaLaunch.m528$$Nest$mrequireMicrosoftLoginHistoryBeforeLaunch(r0, r1)
                if (r0 == 0) goto L22
                ca.dnamobile.javalauncher.launcher.JavaLaunch r3 = r2.this$0
                r0 = 0
                ca.dnamobile.javalauncher.launcher.JavaLaunch.m517$$Nest$fputselectedInstance(r3, r0)
                ca.dnamobile.javalauncher.launcher.JavaLaunch r3 = r2.this$0
                ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter r3 = ca.dnamobile.javalauncher.launcher.JavaLaunch.m512$$Nest$fgetinstanceAdapter(r3)
                r3.clearSelectedInstance()
                ca.dnamobile.javalauncher.launcher.JavaLaunch r3 = r2.this$0
                ca.dnamobile.javalauncher.launcher.JavaLaunch.m537$$Nest$mupdateSelectedInstanceCard(r3)
                return
            L22:
                ca.dnamobile.javalauncher.launcher.JavaLaunch r0 = r2.this$0
                ca.dnamobile.javalauncher.launcher.JavaLaunch.m530$$Nest$mselectAndOpenInstance(r0, r3)
                return
        }
    }


    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.launcher.JavaLaunch$4, reason: invalid class name */
    class AnonymousClass4 implements ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener {
        final /* synthetic */ ca.dnamobile.javalauncher.launcher.JavaLaunch this$0;

        public static /* synthetic */ void $r8$lambda$ISIXQMVxCux3WASkq7yUG2n1tfs(ca.dnamobile.javalauncher.launcher.JavaLaunch.AnonymousClass4 r0, java.lang.Throwable r1) {
                r0.lambda$onError$1(r1)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$Whl--iDxkL292J89Da3U2BDgln0, reason: not valid java name */
        public static /* synthetic */ void m539$r8$lambda$WhliDxkL292J89Da3U2BDgln0(ca.dnamobile.javalauncher.launcher.JavaLaunch.AnonymousClass4 r0, java.lang.String r1, ca.dnamobile.javalauncher.instance.LauncherInstance r2) {
                r0.lambda$onComplete$0(r1, r2)
                return
        }

        AnonymousClass4(ca.dnamobile.javalauncher.launcher.JavaLaunch r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        private /* synthetic */ void lambda$onComplete$0(java.lang.String r3, ca.dnamobile.javalauncher.instance.LauncherInstance r4) {
                r2 = this;
                ca.dnamobile.javalauncher.launcher.JavaLaunch r0 = r2.this$0
                r1 = 0
                ca.dnamobile.javalauncher.launcher.JavaLaunch.m532$$Nest$msetLoading(r0, r1)
                ca.dnamobile.javalauncher.launcher.JavaLaunch r0 = r2.this$0
                ca.dnamobile.javalauncher.launcher.JavaLaunch.m522$$Nest$mfinishInstallSession(r0)
                ca.dnamobile.javalauncher.launcher.JavaLaunch r0 = r2.this$0
                ca.dnamobile.javalauncher.launcher.JavaLaunch.m520$$Nest$mdismissInstallDialog(r0)
                ca.dnamobile.javalauncher.launcher.JavaLaunch r0 = r2.this$0
                ca.dnamobile.javalauncher.launcher.JavaLaunch.m527$$Nest$mrefreshInstancesAndRebind(r0, r1)
                ca.dnamobile.javalauncher.launcher.JavaLaunch r0 = r2.this$0
                java.lang.String r1 = "all"
                ca.dnamobile.javalauncher.launcher.JavaLaunch.m516$$Nest$fputselectedFilter(r0, r1)
                ca.dnamobile.javalauncher.launcher.JavaLaunch r0 = r2.this$0
                ca.dnamobile.javalauncher.launcher.JavaLaunch.m531$$Nest$mselectTabByFilter(r0, r1)
                ca.dnamobile.javalauncher.launcher.JavaLaunch r0 = r2.this$0
                ca.dnamobile.javalauncher.launcher.JavaLaunch.m533$$Nest$msetStatus(r0, r3)
                ca.dnamobile.javalauncher.launcher.JavaLaunch r0 = r2.this$0
                r1 = 1
                android.widget.Toast r3 = android.widget.Toast.makeText(r0, r3, r1)
                r3.show()
                if (r4 == 0) goto L3b
                ca.dnamobile.javalauncher.launcher.JavaLaunch r3 = r2.this$0
                android.content.Intent r4 = ca.dnamobile.javalauncher.InstanceDetailsActivity.createIntent(r3, r4)
                r3.startActivity(r4)
            L3b:
                return
        }

        private /* synthetic */ void lambda$onError$1(java.lang.Throwable r4) {
                r3 = this;
                ca.dnamobile.javalauncher.launcher.JavaLaunch r0 = r3.this$0
                r1 = 0
                ca.dnamobile.javalauncher.launcher.JavaLaunch.m532$$Nest$msetLoading(r0, r1)
                ca.dnamobile.javalauncher.launcher.JavaLaunch r0 = r3.this$0
                ca.dnamobile.javalauncher.launcher.JavaLaunch.m522$$Nest$mfinishInstallSession(r0)
                ca.dnamobile.javalauncher.launcher.JavaLaunch r0 = r3.this$0
                ca.dnamobile.javalauncher.launcher.JavaLaunch.m520$$Nest$mdismissInstallDialog(r0)
                java.lang.String r0 = r4.getMessage()
                if (r0 == 0) goto L1b
                java.lang.String r4 = r4.getMessage()
                goto L23
            L1b:
                java.lang.Class r4 = r4.getClass()
                java.lang.String r4 = r4.getSimpleName()
            L23:
                ca.dnamobile.javalauncher.launcher.JavaLaunch r0 = r3.this$0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Modpack import failed: "
                r1.<init>(r2)
                java.lang.StringBuilder r1 = r1.append(r4)
                java.lang.String r1 = r1.toString()
                ca.dnamobile.javalauncher.launcher.JavaLaunch.m533$$Nest$msetStatus(r0, r1)
                ca.dnamobile.javalauncher.launcher.JavaLaunch r0 = r3.this$0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r2)
                java.lang.StringBuilder r4 = r1.append(r4)
                java.lang.String r4 = r4.toString()
                r1 = 1
                android.widget.Toast r4 = android.widget.Toast.makeText(r0, r4, r1)
                r4.show()
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
                ca.dnamobile.javalauncher.launcher.JavaLaunch r0 = r2.this$0
                ca.dnamobile.javalauncher.launcher.JavaLaunch$4$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$4$$ExternalSyntheticLambda0
                r1.<init>(r2, r3, r4)
                r0.runOnUiThread(r1)
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                ca.dnamobile.javalauncher.launcher.JavaLaunch r0 = r2.this$0
                ca.dnamobile.javalauncher.launcher.JavaLaunch$4$$ExternalSyntheticLambda1 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$4$$ExternalSyntheticLambda1
                r1.<init>(r2, r3)
                r0.runOnUiThread(r1)
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener
        public void onProgress(int r6, int r7) {
                r5 = this;
                r0 = 0
                if (r7 <= 0) goto L14
                long r1 = (long) r6
                r3 = 100
                long r1 = r1 * r3
                long r6 = (long) r7
                long r1 = r1 / r6
                int r6 = (int) r1
                r7 = 100
                int r6 = java.lang.Math.min(r7, r6)
                int r0 = java.lang.Math.max(r0, r6)
            L14:
                ca.dnamobile.javalauncher.launcher.JavaLaunch r6 = r5.this$0
                java.lang.String r7 = ca.dnamobile.javalauncher.launcher.JavaLaunch.m510$$Nest$fgetactiveInstallMessage(r6)
                ca.dnamobile.javalauncher.launcher.JavaLaunch.m521$$Nest$mdispatchInstallProgress(r6, r0, r7)
                return
        }

        @Override // ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener
        public void onStatus(java.lang.String r3) {
                r2 = this;
                ca.dnamobile.javalauncher.launcher.JavaLaunch r0 = r2.this$0
                int r1 = ca.dnamobile.javalauncher.launcher.JavaLaunch.m511$$Nest$fgetactiveInstallProgress(r0)
                ca.dnamobile.javalauncher.launcher.JavaLaunch.m521$$Nest$mdispatchInstallProgress(r0, r1, r3)
                return
        }
    }



    /* JADX INFO: renamed from: $r8$lambda$-L_OX2UxP1gazhL01EUJdJs3VZI, reason: not valid java name */
    public static /* synthetic */ void m487$r8$lambda$L_OX2UxP1gazhL01EUJdJs3VZI(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, android.view.View r1) {
            r0.lambda$setupMainPlayerHeadButton$6(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$-nLBp7DmY3GGIFejNpE3DJWXDk0, reason: not valid java name */
    public static /* synthetic */ void m488$r8$lambda$nLBp7DmY3GGIFejNpE3DJWXDk0(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, java.lang.Throwable r1, java.lang.Runnable r2) {
            r0.lambda$restoreScopedStorageForInstanceDetails$49(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$0HYid-k5TeQhaEJQ2wg4cNv__6M, reason: not valid java name */
    public static /* synthetic */ void m489$r8$lambda$0HYidk5TeQhaEJQ2wg4cNv__6M(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, java.util.List r1, boolean r2) {
            r0.lambda$loadVersions$19(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$0VCS8xO8OeXovWaszrzE5Oa_9So(ca.dnamobile.javalauncher.launcher.JavaLaunch r0) {
            r0.openGlobalContentBrowser()
            return
    }

    public static /* synthetic */ void $r8$lambda$54WhHfbW3KCXiHjzl9zgmPT2cpo(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, ca.dnamobile.javalauncher.instance.LauncherInstance r1) {
            r0.lambda$selectAndOpenInstance$45(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$5HfW13A33XDxwgSyyRX18pjbieo(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, android.view.View r1) {
            r0.lambda$setupInstanceUi$11(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$5PXsI_t650wPRgdg9Y5hwVJBkkY(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, ca.dnamobile.javalauncher.instance.LauncherInstance r1, android.content.DialogInterface r2, int r3) {
            r0.lambda$showDeleteInstanceDialog$41(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$61xA3YEen_pTj3lNvwhbjFYDAEo(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, android.view.View r1) {
            r0.lambda$setupInstanceUi$12(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$8Qyx8OUsirLb1eByVoMULNjRr6I(ca.dnamobile.javalauncher.launcher.JavaLaunch r0) {
            r0.launchSelectedInstance()
            return
    }

    public static /* synthetic */ void $r8$lambda$9Dqvr36T_54u4uaPoOSLo7z8maI(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, java.lang.Throwable r1, java.lang.String r2, boolean r3) {
            r0.lambda$refreshStorageLocationForAdapter$29(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$9KKZNVRuNAE5mjSo32kJ1sbsGyE(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.InstallProgressListener r1, ca.dnamobile.javalauncher.data.model.MinecraftVersion r2, ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog.Request r3) {
            r0.lambda$createInstanceFromRequest$35(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$A3rdZ24Y-2kcfFoYDdPULx-AbF8, reason: not valid java name */
    public static /* synthetic */ void m490$r8$lambda$A3rdZ24Y2kcfFoYDdPULxAbF8(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, java.lang.String r1) {
            r0.lambda$createInstanceFromRequest$32(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$B7wSRMq82AKaDs7bfap96X6CB7I(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, boolean r1) {
            r0.lambda$loadVersions$21(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$C5IcY1agF6M_LvdNhmC9SWSqS34(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, androidx.appcompat.app.AlertDialog r1, android.content.DialogInterface r2) {
            r0.lambda$maybeShowRequiredLegalAcceptanceDialog$3(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$CCR4e3oo28HixBXAvFnZSEylKuc(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, android.view.View r1) {
            r0.lambda$setupAccountUi$4(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$COtX2XVaIDx4Shx-JNpou3J0v38, reason: not valid java name */
    public static /* synthetic */ void m491$r8$lambda$COtX2XVaIDx4ShxJNpou3J0v38(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, java.lang.Runnable r1) {
            r0.lambda$requireMicrosoftLoginHistoryBeforeLaunch$9(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$CsrpJyr1lt9UJiWvzXIJevjWbOg(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, java.lang.Runnable r1) {
            r0.lambda$requireActiveMicrosoftAccountBeforeCreateInstance$8(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$DGJXeu7yu9oH-iJRi11e8HEBcLY, reason: not valid java name */
    public static /* synthetic */ void m492$r8$lambda$DGJXeu7yu9oHiJRi11e8HEBcLY(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, int r1, java.lang.String r2) {
            r0.lambda$dispatchInstallProgress$39(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$DkwzaWdo2jqBsgItcSQsi_Zy5Eo(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, java.lang.Boolean r1) {
            r0.lambda$registerNotificationPermissionLauncher$37(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$F5WiGbl9Mo2YzcVNd0XskymAqhQ(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, android.view.View r1) {
            r0.lambda$setupInstanceUi$13(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$H8-ZLLZCTjuSWgN9TMFPvDr0_es, reason: not valid java name */
    public static /* synthetic */ void m493$r8$lambda$H8ZLLZCTjuSWgN9TMFPvDr0_es(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, android.view.View r1) {
            r0.lambda$setupInstanceUi$10(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$HfA9GdaNaumrRkje7rII8HkV-UM, reason: not valid java name */
    public static /* synthetic */ void m494$r8$lambda$HfA9GdaNaumrRkje7rII8HkVUM(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, android.view.View r1) {
            r0.lambda$setupInstanceUi$14(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$IQJDYYdea_cJpxe_zbbd2XxYruY(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, ca.dnamobile.javalauncher.instance.LauncherInstance r1, java.lang.Runnable r2) {
            r0.lambda$restoreScopedStorageForInstanceDetails$50(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$Ij_JaZLmLh0pcCKbwnHJ1JubSx8(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, java.lang.String r1, int r2) {
            r0.lambda$restoreScopedStorageForLaunchIfNeeded$51(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$Iq7S4FDY_Q7ge-EwRclAV8fPlYg, reason: not valid java name */
    public static /* synthetic */ void m495$r8$lambda$Iq7S4FDY_Q7geEwRclAV8fPlYg(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, android.view.View r1) {
            r0.lambda$setupStorageLocationsButton$26(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$Jgmx2i7t-aw_QuB9mWRfrr8n2js, reason: not valid java name */
    public static /* synthetic */ void m496$r8$lambda$Jgmx2i7taw_QuB9mWRfrr8n2js(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, android.content.DialogInterface r1, int r2) {
            r0.lambda$maybeShowNotificationPermissionLaunchPrompt$38(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$MNXcDmbe3doV_NEsQgTQD5j9te0(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, ca.dnamobile.javalauncher.instance.LauncherInstance r1) {
            r0.lambda$quickLaunchInstance$47(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$Mk64hN-_xSem6roLT4JwMBg1TI4, reason: not valid java name */
    public static /* synthetic */ void m497$r8$lambda$Mk64hN_xSem6roLT4JwMBg1TI4(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, android.widget.CompoundButton r1, boolean r2) {
            r0.lambda$showInstallDialog$40(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$NclrUHc5Q-2K8TDiXtzwqS5Z1X4, reason: not valid java name */
    public static /* synthetic */ void m498$r8$lambda$NclrUHc5Q2K8TDiXtzwqS5Z1X4(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, android.net.Uri r1, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener r2) {
            r0.lambda$importModpackFromUri$25(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$QBEnPqRhD5b-sOaY7eoRG5RVCfQ, reason: not valid java name */
    public static /* synthetic */ void m499$r8$lambda$QBEnPqRhD5bsOaY7eoRG5RVCfQ(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, android.view.View r1) {
            r0.lambda$setupAccountUi$5(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$R0SWfIV7AZ3rg5n7hNUoEHvq-8s, reason: not valid java name */
    public static /* synthetic */ void m500$r8$lambda$R0SWfIV7AZ3rg5n7hNUoEHvq8s(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, android.view.View r1) {
            r0.lambda$setupMainContentButtons$23(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$USFPnwkhx6CtVrvctswahQead1s(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, java.lang.Throwable r1, java.lang.Runnable r2) {
            r0.lambda$restoreScopedStorageForLaunchIfNeeded$53(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$V-2q_dE7SAyL1A2_VV0ru3J4FBI, reason: not valid java name */
    public static /* synthetic */ void m501$r8$lambda$V2q_dE7SAyL1A2_VV0ru3J4FBI(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, android.content.DialogInterface r1, int r2) {
            r0.lambda$showSignOutConfirmationDialog$7(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$X5Eb7VVHvt47TwXkfe-NnRjGC9w, reason: not valid java name */
    public static /* synthetic */ void m502$r8$lambda$X5Eb7VVHvt47TwXkfeNnRjGC9w(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, ca.dnamobile.javalauncher.instance.LauncherInstance r1) {
            r0.lambda$deleteInstance$44(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$YxqMdeTmy5W5ydfJ1sLtAKIpXxQ(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog.Request r1) {
            r0.lambda$createInstanceFromRequest$31(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$_jX1JcguwDBDwLqtuWPqHhwE6wY(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, android.widget.CompoundButton r1, boolean r2) {
            r0.lambda$setupRenderSurfaceUi$17(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$a-MRHbd-nK6MK_IHnae6T_b9Xy0, reason: not valid java name */
    public static /* synthetic */ void m503$r8$lambda$aMRHbdnK6MK_IHnae6T_b9Xy0(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, android.view.View r1) {
            r0.lambda$setupMainContentButtons$24(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$bV_bb9jfBuf6aruF9S_KtP5SL04(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, boolean r1, java.lang.Throwable r2) {
            r0.lambda$loadVersions$20(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$dfiOGcg3gw4x28kDbEwncY25gIY(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, int r1, java.lang.String r2) {
            r0.dispatchInstallProgress(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$eAxoJ7cmVyxrZcHFDDaFTN1fiXE(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, android.view.View r1) {
            r0.lambda$setupInstanceUi$16(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$fBKuq-g2tZbsy8FUhrmgUbpbqOs, reason: not valid java name */
    public static /* synthetic */ void m504$r8$lambda$fBKuqg2tZbsy8FUhrmgUbpbqOs(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, ca.dnamobile.javalauncher.instance.LauncherInstance r1) {
            r0.lambda$createInstanceFromRequest$33(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$gX-cJdVc6W4WU2HU8mGmqbSWlgA, reason: not valid java name */
    public static /* synthetic */ void m505$r8$lambda$gXcJdVc6W4WU2HU8mGmqbSWlgA(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, androidx.appcompat.app.AlertDialog r1, android.view.View r2) {
            r0.lambda$maybeShowRequiredLegalAcceptanceDialog$2(r1, r2)
            return
    }

    public static /* synthetic */ int $r8$lambda$gaxEgM_H9jEBzpme78kZ4v6SHeI(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, ca.dnamobile.javalauncher.instance.LauncherInstance r1, ca.dnamobile.javalauncher.instance.LauncherInstance r2) {
            int r0 = r0.lambda$applyInstanceFilter$22(r1, r2)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$hzCJ2wqlot1oJZ4cwxThq7GdR10(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, java.lang.Throwable r1) {
            r0.lambda$createInstanceFromRequest$34(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$iF1WYjxJ_iImDy4eioIt3NZgd-U, reason: not valid java name */
    public static /* synthetic */ void m506$r8$lambda$iF1WYjxJ_iImDy4eioIt3NZgdU(ca.dnamobile.javalauncher.launcher.JavaLaunch r0) {
            r0.showCreateInstanceDialog()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$icQREzG1MnDKM4AffK-xt6WXNAo, reason: not valid java name */
    public static /* synthetic */ void m507$r8$lambda$icQREzG1MnDKM4AffKxt6WXNAo(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, ca.dnamobile.javalauncher.instance.LauncherInstance r1) {
            r0.lambda$quickLaunchInstance$46(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$iujnlVrhVte5LD9f_IRmmSQFGFM(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, android.widget.CompoundButton r1, boolean r2) {
            r0.lambda$setupInstanceUi$15(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$jdgo4s4HYfOlOYr0sGQWpCnCr1o(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, android.view.View r1) {
            r0.lambda$maybeShowRequiredLegalAcceptanceDialog$1(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$na2y13MzcgnvxuzP41DOvLCQAGI(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, ca.dnamobile.javalauncher.instance.LauncherInstance r1) {
            r0.lambda$launchSelectedInstance$48(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$okxg1wMgnUay_DMs2_hlEAmB85U(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, int r1, java.lang.String r2) {
            r0.lambda$restoreScopedStorageForLaunchIfNeeded$52(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$t4DXN2XWmHm908PRkGzlO0Qbfts(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, ca.dnamobile.javalauncher.storage.StorageLocation r1, android.content.DialogInterface r2, int r3) {
            r0.lambda$showDeleteStorageLocationDialog$28(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$t9sWCAEbrMLVhO20vnchKjFa4NM(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, android.widget.CompoundButton r1, boolean r2) {
            r0.lambda$setupSharedInstallsUi$18(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$tBf00S-hbCwRU6Fh4eY1kyrYbLg, reason: not valid java name */
    public static /* synthetic */ void m508$r8$lambda$tBf00ShbCwRU6Fh4eY1kyrYbLg(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, android.content.DialogInterface r1, int r2) {
            r0.lambda$showDeleteStorageLocationDialog$27(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$usrk99JtPAc4PUleAAr3z9qgVho(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, java.lang.Runnable r1) {
            r0.lambda$restoreScopedStorageForLaunchIfNeeded$54(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$v-eXvkaBYeB-sFL9_HXP0sUJJ5A, reason: not valid java name */
    public static /* synthetic */ void m509$r8$lambda$veXvkaBYeBsFL9_HXP0sUJJ5A(ca.dnamobile.javalauncher.launcher.JavaLaunch r0) {
            r0.lambda$new$0()
            return
    }

    public static /* synthetic */ void $r8$lambda$woKmPq6clTgWhdcwUAdCa5EnuRY(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, java.lang.String r1, boolean r2) {
            r0.lambda$refreshStorageLocationForAdapter$30(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$x6OB1DDiMqvuZoEyzibEwgRbeik(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, java.lang.Throwable r1, ca.dnamobile.javalauncher.instance.LauncherInstance r2) {
            r0.lambda$deleteInstance$43(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$xf6A3PXUeHoLjEKmR_NEj146Yhg(ca.dnamobile.javalauncher.launcher.JavaLaunch r0) {
            r0.openModpackImportPicker()
            return
    }

    public static /* synthetic */ void $r8$lambda$ykr8PDDUqt5UkKrSOI3YTO21KS8(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, ca.dnamobile.javalauncher.instance.LauncherInstance r1) {
            r0.lambda$deleteInstance$42(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$fgetactiveInstallMessage, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m510$$Nest$fgetactiveInstallMessage(ca.dnamobile.javalauncher.launcher.JavaLaunch r0) {
            java.lang.String r0 = r0.activeInstallMessage
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgetactiveInstallProgress, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m511$$Nest$fgetactiveInstallProgress(ca.dnamobile.javalauncher.launcher.JavaLaunch r0) {
            int r0 = r0.activeInstallProgress
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgetinstanceAdapter, reason: not valid java name */
    static /* bridge */ /* synthetic */ ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter m512$$Nest$fgetinstanceAdapter(ca.dnamobile.javalauncher.launcher.JavaLaunch r0) {
            ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter r0 = r0.instanceAdapter
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgetpendingAfterMicrosoftSignIn, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.Runnable m513$$Nest$fgetpendingAfterMicrosoftSignIn(ca.dnamobile.javalauncher.launcher.JavaLaunch r0) {
            java.lang.Runnable r0 = r0.pendingAfterMicrosoftSignIn
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgetselectedFilter, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m514$$Nest$fgetselectedFilter(ca.dnamobile.javalauncher.launcher.JavaLaunch r0) {
            java.lang.String r0 = r0.selectedFilter
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fputpendingAfterMicrosoftSignIn, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m515$$Nest$fputpendingAfterMicrosoftSignIn(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, java.lang.Runnable r1) {
            r0.pendingAfterMicrosoftSignIn = r1
            return
    }

    /* JADX INFO: renamed from: -$$Nest$fputselectedFilter, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m516$$Nest$fputselectedFilter(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, java.lang.String r1) {
            r0.selectedFilter = r1
            return
    }

    /* JADX INFO: renamed from: -$$Nest$fputselectedInstance, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m517$$Nest$fputselectedInstance(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, ca.dnamobile.javalauncher.instance.LauncherInstance r1) {
            r0.selectedInstance = r1
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mapplyInstanceFilter, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m518$$Nest$mapplyInstanceFilter(ca.dnamobile.javalauncher.launcher.JavaLaunch r0) {
            r0.applyInstanceFilter()
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mcreateInstanceFromRequest, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m519$$Nest$mcreateInstanceFromRequest(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog.Request r1) {
            r0.createInstanceFromRequest(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mdismissInstallDialog, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m520$$Nest$mdismissInstallDialog(ca.dnamobile.javalauncher.launcher.JavaLaunch r0) {
            r0.dismissInstallDialog()
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mdispatchInstallProgress, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m521$$Nest$mdispatchInstallProgress(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, int r1, java.lang.String r2) {
            r0.dispatchInstallProgress(r1, r2)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mfinishInstallSession, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m522$$Nest$mfinishInstallSession(ca.dnamobile.javalauncher.launcher.JavaLaunch r0) {
            r0.finishInstallSession()
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mopenStorageLocationPicker, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m523$$Nest$mopenStorageLocationPicker(ca.dnamobile.javalauncher.launcher.JavaLaunch r0) {
            r0.openStorageLocationPicker()
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mpickInstanceIcon, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m524$$Nest$mpickInstanceIcon(ca.dnamobile.javalauncher.launcher.JavaLaunch r0) {
            r0.pickInstanceIcon()
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mquickLaunchInstance, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m525$$Nest$mquickLaunchInstance(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, ca.dnamobile.javalauncher.instance.LauncherInstance r1) {
            r0.quickLaunchInstance(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mrefreshAfterStorageLocationSelection, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m526$$Nest$mrefreshAfterStorageLocationSelection(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, java.lang.String r1, boolean r2) {
            r0.refreshAfterStorageLocationSelection(r1, r2)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mrefreshInstancesAndRebind, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m527$$Nest$mrefreshInstancesAndRebind(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, boolean r1) {
            r0.refreshInstancesAndRebind(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mrequireMicrosoftLoginHistoryBeforeLaunch, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m528$$Nest$mrequireMicrosoftLoginHistoryBeforeLaunch(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, java.lang.Runnable r1) {
            boolean r0 = r0.requireMicrosoftLoginHistoryBeforeLaunch(r1)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$msanitizeSavedFilter, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m529$$Nest$msanitizeSavedFilter(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, java.lang.String r1) {
            java.lang.String r0 = r0.sanitizeSavedFilter(r1)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mselectAndOpenInstance, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m530$$Nest$mselectAndOpenInstance(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, ca.dnamobile.javalauncher.instance.LauncherInstance r1) {
            r0.selectAndOpenInstance(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mselectTabByFilter, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m531$$Nest$mselectTabByFilter(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, java.lang.String r1) {
            r0.selectTabByFilter(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$msetLoading, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m532$$Nest$msetLoading(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, boolean r1) {
            r0.setLoading(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$msetStatus, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m533$$Nest$msetStatus(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, java.lang.String r1) {
            r0.setStatus(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mshowDeleteInstanceDialog, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m534$$Nest$mshowDeleteInstanceDialog(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, ca.dnamobile.javalauncher.instance.LauncherInstance r1) {
            r0.showDeleteInstanceDialog(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mshowDeleteStorageLocationDialog, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m535$$Nest$mshowDeleteStorageLocationDialog(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, ca.dnamobile.javalauncher.storage.StorageLocation r1) {
            r0.showDeleteStorageLocationDialog(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mupdateAccountStatus, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m536$$Nest$mupdateAccountStatus(ca.dnamobile.javalauncher.launcher.JavaLaunch r0, ca.dnamobile.javalauncher.data.AccountStore.Account r1) {
            r0.updateAccountStatus(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mupdateSelectedInstanceCard, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m537$$Nest$mupdateSelectedInstanceCard(ca.dnamobile.javalauncher.launcher.JavaLaunch r0) {
            r0.updateSelectedInstanceCard()
            return
    }

    static {
            r0 = 34
            r1 = 42
            r2 = 30
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.launcher.JavaLaunch.COLOR_DIALOG_BG = r0
            r0 = 43
            r1 = 53
            r2 = 38
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.launcher.JavaLaunch.COLOR_CARD_BG = r0
            r0 = 61
            r1 = 74
            r2 = 54
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.launcher.JavaLaunch.COLOR_CARD_STROKE = r0
            r0 = 241(0xf1, float:3.38E-43)
            r1 = 248(0xf8, float:3.48E-43)
            r2 = 238(0xee, float:3.34E-43)
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.launcher.JavaLaunch.COLOR_TEXT_PRIMARY = r0
            r0 = 204(0xcc, float:2.86E-43)
            r1 = 216(0xd8, float:3.03E-43)
            r2 = 198(0xc6, float:2.77E-43)
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.launcher.JavaLaunch.COLOR_TEXT_SECONDARY = r0
            r0 = 159(0x9f, float:2.23E-43)
            r1 = 176(0xb0, float:2.47E-43)
            r2 = 150(0x96, float:2.1E-43)
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.launcher.JavaLaunch.COLOR_TEXT_MUTED = r0
            r0 = 211(0xd3, float:2.96E-43)
            r1 = 128(0x80, float:1.8E-43)
            r2 = 37
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.launcher.JavaLaunch.COLOR_ACCENT = r0
            return
    }

    public JavaLaunch() {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "all"
            r2.selectedFilter = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.mainHandler = r0
            java.lang.String r0 = "Installing Minecraft"
            r2.activeInstallTitle = r0
            java.lang.String r0 = "Preparing installation..."
            r2.activeInstallMessage = r0
            r0 = -1
            r2.lastInstallUiDispatchProgress = r0
            java.lang.String r1 = ""
            r2.lastInstallUiDispatchMessage = r1
            r2.lastInstallNotificationProgress = r0
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda57 r0 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda57
            r0.<init>(r2)
            r2.hideStatusRunnable = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.allVersions = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.installedInstances = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.installedBaseVersionIds = r0
            return
    }

    private void addInstanceNameForDuplicateCheck(java.util.ArrayList<java.lang.String> r3, java.util.HashSet<java.lang.String> r4, java.lang.String r5) {
            r2 = this;
            java.lang.String r0 = normalizeInstanceNameKey(r5)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L18
            boolean r4 = r4.add(r0)
            if (r4 != 0) goto L11
            goto L18
        L11:
            java.lang.String r4 = r5.trim()
            r3.add(r4)
        L18:
            return
    }

    private void addInstanceTab(java.lang.String r2, java.lang.String r3, boolean r4) {
            r1 = this;
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r1.binding
            com.google.android.material.tabs.TabLayout r0 = r0.tabVersionTypes
            com.google.android.material.tabs.TabLayout$Tab r0 = r0.newTab()
            r0.setText(r2)
            r0.setTag(r3)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r2 = r1.binding
            com.google.android.material.tabs.TabLayout r2 = r2.tabVersionTypes
            r2.addTab(r0, r4)
            return
    }

    private void addInstanceTabs() {
            r3 = this;
            int r0 = ca.dnamobile.javalauncher.R.string.instance_tab_all
            java.lang.String r0 = r3.getString(r0)
            java.lang.String r1 = r3.selectedFilter
            java.lang.String r2 = "all"
            boolean r1 = r2.equals(r1)
            r3.addInstanceTab(r0, r2, r1)
            int r0 = ca.dnamobile.javalauncher.R.string.instance_tab_recent
            java.lang.String r0 = r3.getString(r0)
            java.lang.String r1 = r3.selectedFilter
            java.lang.String r2 = "recent"
            boolean r1 = r2.equals(r1)
            r3.addInstanceTab(r0, r2, r1)
            int r0 = ca.dnamobile.javalauncher.R.string.instance_tab_vanilla
            java.lang.String r0 = r3.getString(r0)
            java.lang.String r1 = r3.selectedFilter
            java.lang.String r2 = "vanilla"
            boolean r1 = r2.equals(r1)
            r3.addInstanceTab(r0, r2, r1)
            int r0 = ca.dnamobile.javalauncher.R.string.instance_tab_modified
            java.lang.String r0 = r3.getString(r0)
            java.lang.String r1 = r3.selectedFilter
            java.lang.String r2 = "modified"
            boolean r1 = r2.equals(r1)
            r3.addInstanceTab(r0, r2, r1)
            int r0 = ca.dnamobile.javalauncher.R.string.instance_tab_snapshot
            java.lang.String r0 = r3.getString(r0)
            java.lang.String r1 = r3.selectedFilter
            java.lang.String r2 = "snapshot"
            boolean r1 = r2.equals(r1)
            r3.addInstanceTab(r0, r2, r1)
            int r0 = ca.dnamobile.javalauncher.R.string.instance_tab_shared
            java.lang.String r0 = r3.getString(r0)
            java.lang.String r1 = r3.selectedFilter
            java.lang.String r2 = "shared"
            boolean r1 = r2.equals(r1)
            r3.addInstanceTab(r0, r2, r1)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r3.binding
            com.google.android.material.tabs.TabLayout r0 = r0.tabVersionTypes
            ca.dnamobile.javalauncher.launcher.JavaLaunch$3 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$3
            r1.<init>(r3)
            r0.addOnTabSelectedListener(r1)
            return
    }

    private void addSharedInstalledVersions(java.util.List<ca.dnamobile.javalauncher.instance.LauncherInstance> r10) {
            r9 = this;
            boolean r0 = ca.dnamobile.javalauncher.settings.LauncherPreferences.isShowSharedInstalls(r9)
            if (r0 != 0) goto L7
            return
        L7:
            java.util.HashSet r10 = r9.collectVersionsRequiredByIsolatedInstances(r10)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.List r1 = ca.dnamobile.javalauncher.storage.StorageLocationStore.getVisibleMinecraftHomes(r9)
            java.util.Iterator r1 = r1.iterator()
        L18:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L74
            java.lang.Object r2 = r1.next()
            java.io.File r2 = (java.io.File) r2
            java.util.List r3 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.findInstalledVersions(r2)
            java.util.Iterator r3 = r3.iterator()
        L2c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L18
            java.lang.Object r4 = r3.next()
            ca.dnamobile.javalauncher.data.model.MinecraftVersion r4 = (ca.dnamobile.javalauncher.data.model.MinecraftVersion) r4
            java.lang.String r5 = r4.getId()
            boolean r5 = r10.contains(r5)
            if (r5 == 0) goto L43
            goto L2c
        L43:
            java.lang.String r5 = r4.getId()
            java.lang.String r5 = ca.dnamobile.javalauncher.instance.LauncherInstance.sharedInstanceId(r5, r2)
            boolean r5 = r0.add(r5)
            if (r5 != 0) goto L52
            goto L2c
        L52:
            java.util.ArrayList<ca.dnamobile.javalauncher.instance.LauncherInstance> r5 = r9.installedInstances
            java.lang.String r6 = r4.getId()
            java.lang.String r7 = r4.getType()
            java.lang.String r7 = r9.normalizeInstalledVersionType(r7)
            java.lang.String r8 = r4.getReleaseTime()
            java.lang.String r4 = r4.getId()
            java.lang.String r4 = r9.inferLoaderNameFromVersionId(r4)
            ca.dnamobile.javalauncher.instance.LauncherInstance r4 = ca.dnamobile.javalauncher.instance.LauncherInstance.sharedInstalledVersion(r6, r7, r2, r8, r4)
            r5.add(r4)
            goto L2c
        L74:
            return
    }

    private void applyInstanceFilter() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList<ca.dnamobile.javalauncher.instance.LauncherInstance> r1 = r4.installedInstances
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()
            ca.dnamobile.javalauncher.instance.LauncherInstance r2 = (ca.dnamobile.javalauncher.instance.LauncherInstance) r2
            boolean r3 = r4.matchesFilter(r2)
            if (r3 == 0) goto Lb
            r0.add(r2)
            goto Lb
        L21:
            java.lang.String r1 = "recent"
            java.lang.String r2 = r4.selectedFilter
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L33
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda58 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda58
            r1.<init>(r4)
            r0.sort(r1)
        L33:
            ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter r1 = r4.instanceAdapter
            r1.submitList(r0)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r1 = r4.binding
            android.widget.TextView r1 = r1.textVersionCount
            int r2 = ca.dnamobile.javalauncher.R.string.instance_count_value
            int r3 = r0.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r2 = r4.getString(r2, r3)
            r1.setText(r2)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L5f
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r4.binding
            androidx.recyclerview.widget.RecyclerView r0 = r0.recyclerVersions
            r1 = 0
            r0.scrollToPosition(r1)
        L5f:
            return
    }

    private void beginInstallSession(java.lang.String r5) {
            r4 = this;
            r0 = 1
            r4.installSessionActive = r0
            r1 = 0
            r4.installPermissionPromptShownThisSession = r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Installing "
            r2.<init>(r3)
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r5 = r5.toString()
            r4.activeInstallTitle = r5
            java.lang.String r5 = "Preparing installation..."
            r4.activeInstallMessage = r5
            r4.activeInstallProgress = r1
            r4.resetInstallProgressThrottles()
            android.view.Window r5 = r4.getWindow()
            r1 = 128(0x80, float:1.8E-43)
            r5.addFlags(r1)
            r4.startOrUpdateInstallForegroundService(r0)
            return
    }

    private java.util.ArrayList<java.lang.String> collectExistingInstanceNamesForDialog() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList<ca.dnamobile.javalauncher.instance.LauncherInstance> r2 = r4.installedInstances
            java.util.Iterator r2 = r2.iterator()
        L10:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L24
            java.lang.Object r3 = r2.next()
            ca.dnamobile.javalauncher.instance.LauncherInstance r3 = (ca.dnamobile.javalauncher.instance.LauncherInstance) r3
            java.lang.String r3 = r3.getName()
            r4.addInstanceNameForDuplicateCheck(r0, r1, r3)
            goto L10
        L24:
            return r0
    }

    private void collectInheritedVersionIds(java.lang.String r5, java.util.HashSet<java.lang.String> r6, java.util.HashSet<java.lang.String> r7) {
            r4 = this;
            boolean r0 = r7.add(r5)
            if (r0 != 0) goto L7
            return
        L7:
            java.io.File r0 = new java.io.File
            java.io.File r1 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getVersionDirectory(r5)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r3 = ".json"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r1, r2)
            boolean r1 = r0.isFile()
            if (r1 != 0) goto L2a
            return
        L2a:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = readFile(r0)     // Catch: java.lang.Throwable -> L50
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = "inheritsFrom"
            java.lang.String r2 = ""
            java.lang.String r0 = r1.optString(r0, r2)     // Catch: java.lang.Throwable -> L50
            if (r0 == 0) goto L4f
            java.lang.String r1 = r0.trim()     // Catch: java.lang.Throwable -> L50
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L48
            goto L4f
        L48:
            r6.add(r0)     // Catch: java.lang.Throwable -> L50
            r4.collectInheritedVersionIds(r0, r6, r7)     // Catch: java.lang.Throwable -> L50
            goto L73
        L4f:
            return
        L50:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Unable to inspect inherited version for "
            r7.<init>(r0)
            java.lang.StringBuilder r5 = r7.append(r5)
            java.lang.String r7 = ": "
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.String r6 = r6.getMessage()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "MainActivity"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r6, r5)
        L73:
            return
    }

    private java.util.HashSet<java.lang.String> collectVersionsRequiredByIsolatedInstances(java.util.List<ca.dnamobile.javalauncher.instance.LauncherInstance> r5) {
            r4 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L9:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r5.next()
            ca.dnamobile.javalauncher.instance.LauncherInstance r1 = (ca.dnamobile.javalauncher.instance.LauncherInstance) r1
            java.lang.String r2 = r1.getBaseVersionId()
            if (r2 == 0) goto L30
            java.lang.String r3 = r2.trim()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L30
            r0.add(r2)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r4.collectInheritedVersionIds(r2, r0, r3)
        L30:
            java.lang.String r1 = r1.getMinecraftVersionId()
            if (r1 == 0) goto L9
            java.lang.String r2 = r1.trim()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L9
            r0.add(r1)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r4.collectInheritedVersionIds(r1, r0, r2)
            goto L9
        L4c:
            return r0
    }

    private void createInstanceFromRequest(ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog.Request r5) {
            r4 = this;
            boolean r0 = ca.dnamobile.javalauncher.controls.ControlsMain.toastAndBlockIfInvalidSignature(r4)
            if (r0 == 0) goto L7
            return
        L7:
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda6 r0 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda6
            r0.<init>(r4, r5)
            boolean r0 = r4.requireActiveMicrosoftAccountBeforeCreateInstance(r0)
            if (r0 == 0) goto L13
            return
        L13:
            boolean r0 = r5.isolatedInstance
            r1 = 1
            if (r0 == 0) goto L29
            java.lang.String r0 = r5.name
            boolean r0 = r4.isolatedInstanceNameExists(r0)
            if (r0 == 0) goto L29
            java.lang.String r5 = r5.name
            r4.showDuplicateInstanceNameMessage(r5)
            r4.refreshInstancesAndRebind(r1)
            return
        L29:
            java.lang.String r0 = r5.minecraftVersionId
            ca.dnamobile.javalauncher.data.model.MinecraftVersion r0 = r4.findManifestVersionById(r0)
            if (r0 != 0) goto L3b
            int r5 = ca.dnamobile.javalauncher.R.string.create_instance_version_missing
            android.widget.Toast r5 = android.widget.Toast.makeText(r4, r5, r1)
            r5.show()
            return
        L3b:
            r4.setLoading(r1)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r1 = r4.binding
            com.google.android.material.button.MaterialButton r1 = r1.buttonLaunchVersion
            r2 = 0
            r1.setEnabled(r2)
            boolean r1 = r5.isolatedInstance
            if (r1 == 0) goto L4d
            java.lang.String r1 = r5.name
            goto L4f
        L4d:
            java.lang.String r1 = r5.minecraftVersionId
        L4f:
            r4.showInstallDialog(r1)
            r4.beginInstallSession(r1)
            boolean r1 = r5.isolatedInstance
            if (r1 == 0) goto L5c
            int r1 = ca.dnamobile.javalauncher.R.string.create_instance_installing
            goto L5e
        L5c:
            int r1 = ca.dnamobile.javalauncher.R.string.create_instance_installing_shared
        L5e:
            boolean r2 = r5.isolatedInstance
            if (r2 == 0) goto L65
            java.lang.String r2 = r5.name
            goto L67
        L65:
            java.lang.String r2 = r5.minecraftVersionId
        L67:
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = r4.getString(r1, r2)
            r4.setStatus(r1)
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda7 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda7
            r1.<init>(r4)
            java.lang.Thread r2 = new java.lang.Thread
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda8 r3 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda8
            r3.<init>(r4, r1, r0, r5)
            java.lang.String r5 = "Create Launcher Instance"
            r2.<init>(r3, r5)
            r2.start()
            return
    }

    private void deleteInstance(ca.dnamobile.javalauncher.instance.LauncherInstance r3) {
            r2 = this;
            r0 = 1
            r2.setLoading(r0)
            int r0 = ca.dnamobile.javalauncher.R.string.delete_instance_deleting
            java.lang.String r1 = r3.getName()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r0 = r2.getString(r0, r1)
            r2.setStatus(r0)
            java.lang.Thread r0 = new java.lang.Thread
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda26 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda26
            r1.<init>(r2, r3)
            java.lang.String r3 = "Delete Launcher Instance"
            r0.<init>(r1, r3)
            r0.start()
            return
    }

    private void dismissInstallDialog() {
            r2 = this;
            androidx.appcompat.app.AlertDialog r0 = r2.installDialog
            r1 = 0
            if (r0 == 0) goto La
            r0.dismiss()
            r2.installDialog = r1
        La:
            r2.installDialogProgress = r1
            r2.installDialogMessage = r1
            r2.installDialogForegroundCheck = r1
            return
    }

    private void dismissLaunchPrepareDialog() {
            r2 = this;
            androidx.appcompat.app.AlertDialog r0 = r2.launchPrepareDialog
            r1 = 0
            if (r0 == 0) goto La
            r0.dismiss()
            r2.launchPrepareDialog = r1
        La:
            r2.launchPrepareMessage = r1
            r2.launchPreparePercent = r1
            r2.launchPrepareProgress = r1
            return
    }

    private void dispatchInstallProgress(int r13, java.lang.String r14) {
            r12 = this;
            r0 = 100
            int r13 = java.lang.Math.min(r0, r13)
            r1 = 0
            int r13 = java.lang.Math.max(r1, r13)
            java.lang.String r2 = r14.trim()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L17
            java.lang.String r14 = r12.activeInstallMessage
        L17:
            long r2 = android.os.SystemClock.uptimeMillis()
            java.lang.String r4 = r12.lastInstallUiDispatchMessage
            boolean r4 = r14.equals(r4)
            r5 = 1
            if (r13 <= 0) goto L44
            if (r13 >= r0) goto L44
            int r0 = r12.lastInstallUiDispatchProgress
            int r0 = r13 - r0
            int r0 = java.lang.Math.abs(r0)
            if (r0 >= r5) goto L44
            long r6 = r12.lastInstallUiDispatchMs
            long r8 = r2 - r6
            r10 = 350(0x15e, double:1.73E-321)
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 >= 0) goto L44
            if (r4 != 0) goto L45
            long r6 = r2 - r6
            r8 = 850(0x352, double:4.2E-321)
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 < 0) goto L45
        L44:
            r1 = r5
        L45:
            r12.activeInstallProgress = r13
            r12.activeInstallMessage = r14
            if (r1 != 0) goto L4c
            return
        L4c:
            r12.lastInstallUiDispatchMs = r2
            r12.lastInstallUiDispatchProgress = r13
            r12.lastInstallUiDispatchMessage = r14
            android.os.Handler r0 = r12.mainHandler
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda18 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda18
            r1.<init>(r12, r13, r14)
            r0.post(r1)
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

    private void ensureMainPlayerHeadBesideShareLogs() {
            r6 = this;
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r6.binding
            if (r0 == 0) goto L58
            android.widget.ImageView r0 = r0.imageMainPlayerHead
            if (r0 == 0) goto L58
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r6.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonShareLatestLog
            if (r0 != 0) goto Lf
            goto L58
        Lf:
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r6.binding
            android.widget.ImageView r0 = r0.imageMainPlayerHead
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r1 = r6.binding
            com.google.android.material.button.MaterialButton r1 = r1.buttonShareLatestLog
            android.view.ViewParent r2 = r1.getParent()
            boolean r3 = r2 instanceof android.widget.LinearLayout
            if (r3 != 0) goto L20
            return
        L20:
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            android.view.ViewParent r3 = r0.getParent()
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 == 0) goto L2f
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r3.removeView(r0)
        L2f:
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = 1110441984(0x42300000, float:44.0)
            int r5 = r6.dp(r4)
            int r4 = r6.dp(r4)
            r3.<init>(r5, r4)
            r4 = 1092616192(0x41200000, float:10.0)
            int r4 = r6.dp(r4)
            r3.rightMargin = r4
            r0.setLayoutParams(r3)
            int r1 = r2.indexOfChild(r1)
            r4 = 0
            int r1 = java.lang.Math.max(r4, r1)
            r2.addView(r0, r1, r3)
            r0.setVisibility(r4)
        L58:
            return
    }

    private void ensureModsDirectoryForLoader(java.lang.String r2, ca.dnamobile.javalauncher.instance.LauncherInstance r3) {
            r1 = this;
            java.lang.String r0 = "Fabric"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L19
            java.lang.String r0 = "Forge"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L19
            java.lang.String r0 = "NeoForge"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 != 0) goto L19
            return
        L19:
            java.lang.String r2 = "mods"
            if (r3 == 0) goto L27
            java.io.File r0 = new java.io.File
            java.io.File r3 = r3.getGameDirectory()
            r0.<init>(r3, r2)
            goto L2e
        L27:
            java.io.File r0 = new java.io.File
            java.lang.String r3 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            r0.<init>(r3, r2)
        L2e:
            boolean r2 = r0.exists()
            if (r2 != 0) goto L52
            boolean r2 = r0.mkdirs()
            if (r2 != 0) goto L52
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to create mods folder: "
            r2.<init>(r3)
            java.lang.String r3 = r0.getAbsolutePath()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "CreateInstance"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r2)
        L52:
            return
    }

    private ca.dnamobile.javalauncher.instance.LauncherInstance findInstanceById(java.lang.String r4) {
            r3 = this;
            java.util.ArrayList<ca.dnamobile.javalauncher.instance.LauncherInstance> r0 = r3.installedInstances
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            ca.dnamobile.javalauncher.instance.LauncherInstance r1 = (ca.dnamobile.javalauncher.instance.LauncherInstance) r1
            java.lang.String r2 = r1.getId()
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L6
            return r1
        L1d:
            r4 = 0
            return r4
    }

    private ca.dnamobile.javalauncher.instance.LauncherInstance findInstanceBySelectionKey(java.lang.String r4) {
            r3 = this;
            java.util.ArrayList<ca.dnamobile.javalauncher.instance.LauncherInstance> r0 = r3.installedInstances
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            ca.dnamobile.javalauncher.instance.LauncherInstance r1 = (ca.dnamobile.javalauncher.instance.LauncherInstance) r1
            java.lang.String r2 = ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter.getSelectionKey(r1)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L6
            return r1
        L1d:
            r4 = 0
            return r4
    }

    private android.view.View findMainActionButton(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r3.binding
            if (r0 == 0) goto L4e
            android.widget.FrameLayout r0 = r0.getRoot()
            if (r0 != 0) goto Lb
            goto L4e
        Lb:
            android.content.res.Resources r0 = r3.getResources()
            java.lang.String r1 = "id"
            java.lang.String r2 = r3.getPackageName()
            int r4 = r0.getIdentifier(r4, r1, r2)
            if (r4 == 0) goto L28
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r3.binding
            android.widget.FrameLayout r0 = r0.getRoot()
            android.view.View r4 = r0.findViewById(r4)
            if (r4 == 0) goto L28
            return r4
        L28:
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r4 = r3.binding
            com.google.android.material.button.MaterialButton r4 = r4.buttonRefreshVersions
            android.view.ViewParent r4 = r4.getParent()
            boolean r4 = r4 instanceof android.view.ViewGroup
            if (r4 == 0) goto L43
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r4 = r3.binding
            com.google.android.material.button.MaterialButton r4 = r4.buttonRefreshVersions
            android.view.ViewParent r4 = r4.getParent()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            android.view.View r4 = r4.findViewWithTag(r5)
            return r4
        L43:
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r4 = r3.binding
            android.widget.FrameLayout r4 = r4.getRoot()
            android.view.View r4 = r4.findViewWithTag(r5)
            return r4
        L4e:
            r4 = 0
            return r4
    }

    private ca.dnamobile.javalauncher.data.model.MinecraftVersion findManifestVersionById(java.lang.String r4) {
            r3 = this;
            java.util.ArrayList<ca.dnamobile.javalauncher.data.model.MinecraftVersion> r0 = r3.allVersions
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            ca.dnamobile.javalauncher.data.model.MinecraftVersion r1 = (ca.dnamobile.javalauncher.data.model.MinecraftVersion) r1
            java.lang.String r2 = r1.getId()
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L6
            return r1
        L1d:
            r4 = 0
            return r4
    }

    private android.view.View findOrCreateMainActionButton(java.lang.String r3, java.lang.String r4, java.lang.String r5, android.view.View.OnClickListener r6, boolean r7) {
            r2 = this;
            android.view.View r3 = r2.findMainActionButton(r3, r4)
            if (r3 == 0) goto La
            r3.setOnClickListener(r6)
            return r3
        La:
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r3 = r2.binding
            com.google.android.material.button.MaterialButton r3 = r3.buttonRefreshVersions
            android.view.ViewParent r3 = r3.getParent()
            boolean r3 = r3 instanceof android.view.ViewGroup
            if (r3 != 0) goto L2c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Unable to add main action button because refresh parent is unavailable: "
            r3.<init>(r4)
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MainActivity"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r4, r3)
            r3 = 0
            return r3
        L2c:
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r3 = r2.binding
            com.google.android.material.button.MaterialButton r3 = r3.buttonRefreshVersions
            android.view.ViewParent r3 = r3.getParent()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            com.google.android.material.button.MaterialButton r0 = new com.google.android.material.button.MaterialButton
            r0.<init>(r2)
            r0.setTag(r4)
            r0.setText(r5)
            java.lang.String r5 = "browse_content_main_button_dynamic"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L4f
            int r4 = ca.dnamobile.javalauncher.R.drawable.ic_browse_modpacks_24
            r0.setIconResource(r4)
            goto L5c
        L4f:
            java.lang.String r5 = "import_modpack_main_button_dynamic"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L5c
            int r4 = ca.dnamobile.javalauncher.R.drawable.ic_import_modpack_24
            r0.setIconResource(r4)
        L5c:
            r4 = 2
            r0.setIconGravity(r4)
            r4 = 1090519040(0x41000000, float:8.0)
            int r5 = r2.dp(r4)
            r0.setIconPadding(r5)
            r5 = 1
            r0.setSingleLine(r5)
            r5 = 0
            r0.setAllCaps(r5)
            r1 = 1109393408(0x42200000, float:40.0)
            int r1 = r2.dp(r1)
            r0.setMinHeight(r1)
            r1 = 1119879168(0x42c00000, float:96.0)
            int r1 = r2.dp(r1)
            r0.setMinWidth(r1)
            r0.setOnClickListener(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r1 = -2
            r6.<init>(r1, r1)
            int r4 = r2.dp(r4)
            r6.leftMargin = r4
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r4 = r2.binding
            com.google.android.material.button.MaterialButton r4 = r4.buttonRefreshVersions
            int r4 = r3.indexOfChild(r4)
            if (r7 == 0) goto L9f
            if (r4 < 0) goto L9f
            goto La8
        L9f:
            if (r4 < 0) goto La4
            int r4 = r4 + 1
            goto La8
        La4:
            int r4 = r3.getChildCount()
        La8:
            int r7 = r3.getChildCount()
            int r4 = java.lang.Math.min(r4, r7)
            int r4 = java.lang.Math.max(r5, r4)
            r3.addView(r0, r4, r6)
            return r0
    }

    private void finishInstallSession() {
            r2 = this;
            r0 = 0
            r2.installSessionActive = r0
            r2.installPermissionPromptShownThisSession = r0
            android.view.Window r0 = r2.getWindow()
            r1 = 128(0x80, float:1.8E-43)
            r0.clearFlags(r1)
            ca.dnamobile.javalauncher.installation.InstallationForegroundService.stop(r2)
            r2.resetInstallProgressThrottles()
            return
    }

    private int getInstanceGridSpanCount() {
            r2 = this;
            android.content.res.Resources r0 = r2.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            r1 = 2
            if (r0 != r1) goto Le
            goto Lf
        Le:
            r1 = 1
        Lf:
            return r1
    }

    private boolean hasActiveMicrosoftAccount() {
            r1 = this;
            ca.dnamobile.javalauncher.data.AccountStore r0 = r1.accountStore
            boolean r0 = ca.dnamobile.javalauncher.modmanager.ModManagerTools.hasActiveMicrosoftAccount(r0)
            return r0
    }

    private boolean hasCompletedMicrosoftLoginOnce() {
            r1 = this;
            ca.dnamobile.javalauncher.data.AccountStore r0 = r1.accountStore
            boolean r0 = ca.dnamobile.javalauncher.modmanager.ModManagerTools.hasCompletedMicrosoftLoginOnce(r0)
            return r0
    }

    private void importModpackFromUri(android.net.Uri r4) {
            r3 = this;
            boolean r0 = ca.dnamobile.javalauncher.controls.ControlsMain.toastAndBlockIfInvalidSignature(r3)
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 1
            r3.setLoading(r0)
            java.lang.String r0 = "Modpack"
            r3.showInstallDialog(r0)
            r3.beginInstallSession(r0)
            ca.dnamobile.javalauncher.launcher.JavaLaunch$4 r0 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$4
            r0.<init>(r3)
            java.lang.Thread r1 = new java.lang.Thread
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda25 r2 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda25
            r2.<init>(r3, r4, r0)
            java.lang.String r4 = "Import Modpack"
            r1.<init>(r2, r4)
            r1.start()
            return
    }

    private java.lang.String inferLoaderNameFromVersionId(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller.inferLoaderNameFromVersionId(r4)
            java.lang.String r1 = "Vanilla"
            boolean r2 = r1.equalsIgnoreCase(r0)
            if (r2 != 0) goto Ld
            return r0
        Ld:
            java.lang.String r0 = ca.dnamobile.javalauncher.ui.version.ForgeInstaller.inferLoaderNameFromVersionId(r4)
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 != 0) goto L18
            return r0
        L18:
            java.lang.String r4 = ca.dnamobile.javalauncher.ui.version.FabricInstaller.inferLoaderNameFromVersionId(r4)
            return r4
    }

    private static boolean isNullOrBlank(java.lang.String r0) {
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
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

    private boolean isolatedInstanceNameExists(java.lang.String r5) {
            r4 = this;
            java.lang.String r5 = normalizeInstanceNameKey(r5)
            boolean r0 = r5.isEmpty()
            r1 = 0
            if (r0 == 0) goto Lc
            return r1
        Lc:
            java.util.ArrayList<ca.dnamobile.javalauncher.instance.LauncherInstance> r0 = r4.installedInstances
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r0.next()
            ca.dnamobile.javalauncher.instance.LauncherInstance r2 = (ca.dnamobile.javalauncher.instance.LauncherInstance) r2
            boolean r3 = r2.isIsolated()
            if (r3 == 0) goto L12
            java.lang.String r2 = r2.getName()
            java.lang.String r2 = normalizeInstanceNameKey(r2)
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L12
            r5 = 1
            return r5
        L34:
            return r1
    }

    private /* synthetic */ int lambda$applyInstanceFilter$22(ca.dnamobile.javalauncher.instance.LauncherInstance r3, ca.dnamobile.javalauncher.instance.LauncherInstance r4) {
            r2 = this;
            java.lang.String r4 = r4.getId()
            long r0 = ca.dnamobile.javalauncher.settings.LauncherPreferences.getInstanceLastPlayed(r2, r4)
            java.lang.String r3 = r3.getId()
            long r3 = ca.dnamobile.javalauncher.settings.LauncherPreferences.getInstanceLastPlayed(r2, r3)
            int r3 = java.lang.Long.compare(r0, r3)
            return r3
    }

    private /* synthetic */ void lambda$createInstanceFromRequest$31(ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog.Request r1) {
            r0 = this;
            r0.createInstanceFromRequest(r1)
            return
    }

    private /* synthetic */ void lambda$createInstanceFromRequest$32(java.lang.String r4) {
            r3 = this;
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r3.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchShowSharedInstalls
            if (r0 == 0) goto Le
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r3.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchShowSharedInstalls
            r1 = 1
            r0.setChecked(r1)
        Le:
            r0 = 0
            r3.refreshInstancesAndRebind(r0)
            java.lang.String r1 = "shared"
            r3.selectedFilter = r1
            r3.selectTabByFilter(r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            r1.<init>(r2)
            java.lang.String r1 = ca.dnamobile.javalauncher.instance.LauncherInstance.sharedInstanceId(r4, r1)
            ca.dnamobile.javalauncher.instance.LauncherInstance r1 = r3.findInstanceById(r1)
            r3.selectedInstance = r1
            ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter r2 = r3.instanceAdapter
            r2.setSelectedInstance(r1)
            r3.applyInstanceFilter()
            r3.updateSelectedInstanceCard()
            r3.setLoading(r0)
            r3.finishInstallSession()
            r3.dismissInstallDialog()
            int r1 = ca.dnamobile.javalauncher.R.string.create_instance_shared_complete
            java.lang.Object[] r2 = new java.lang.Object[]{r4}
            java.lang.String r1 = r3.getString(r1, r2)
            r3.setStatus(r1)
            int r1 = ca.dnamobile.javalauncher.R.string.create_instance_shared_complete
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r4 = r3.getString(r1, r4)
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r0)
            r4.show()
            return
    }

    private /* synthetic */ void lambda$createInstanceFromRequest$33(ca.dnamobile.javalauncher.instance.LauncherInstance r4) {
            r3 = this;
            r0 = 0
            r3.refreshInstancesAndRebind(r0)
            java.lang.String r1 = "all"
            r3.selectedFilter = r1
            r3.selectTabByFilter(r1)
            r3.selectedInstance = r4
            ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter r1 = r3.instanceAdapter
            r1.setSelectedInstance(r4)
            r3.applyInstanceFilter()
            r3.updateSelectedInstanceCard()
            r3.setLoading(r0)
            r3.finishInstallSession()
            r3.dismissInstallDialog()
            int r1 = ca.dnamobile.javalauncher.R.string.create_instance_complete
            java.lang.String r2 = r4.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = r3.getString(r1, r2)
            r3.setStatus(r1)
            int r1 = ca.dnamobile.javalauncher.R.string.create_instance_complete
            java.lang.String r4 = r4.getName()
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r4 = r3.getString(r1, r4)
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r0)
            r4.show()
            return
    }

    private /* synthetic */ void lambda$createInstanceFromRequest$34(java.lang.Throwable r3) {
            r2 = this;
            r0 = 0
            r2.setLoading(r0)
            r2.finishInstallSession()
            r2.dismissInstallDialog()
            r2.updateSelectedInstanceCard()
            int r0 = ca.dnamobile.javalauncher.R.string.msg_version_install_failed
            java.lang.String r1 = r3.getMessage()
            if (r1 == 0) goto L1a
            java.lang.String r3 = r3.getMessage()
            goto L22
        L1a:
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getSimpleName()
        L22:
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r3 = r2.getString(r0, r3)
            r2.setStatus(r3)
            return
    }

    private /* synthetic */ void lambda$createInstanceFromRequest$35(ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.InstallProgressListener r8, ca.dnamobile.javalauncher.data.model.MinecraftVersion r9, ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog.Request r10) {
            r7 = this;
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r7)     // Catch: java.lang.Throwable -> L8f
            boolean r0 = ca.dnamobile.javalauncher.storage.StorageLocationStore.isSelectedScopedStorage(r7)     // Catch: java.lang.Throwable -> L8f
            r1 = 1
            if (r0 == 0) goto Lf
            java.lang.String r0 = "Using scoped-storage compatibility mirror..."
            r8.onProgress(r1, r0)     // Catch: java.lang.Throwable -> L8f
        Lf:
            ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.installVanillaVersion(r7, r9, r8)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = r9.getId()     // Catch: java.lang.Throwable -> L8f
            java.lang.String r2 = r10.loader     // Catch: java.lang.Throwable -> L8f
            java.lang.String r3 = "Fabric"
            boolean r3 = r3.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> L8f
            if (r3 == 0) goto L2c
            java.lang.String r0 = r10.loaderVersion     // Catch: java.lang.Throwable -> L8f
            ca.dnamobile.javalauncher.ui.version.FabricInstaller$InstallResult r9 = ca.dnamobile.javalauncher.ui.version.FabricInstaller.installFabricVersion(r7, r9, r0, r8)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = r9.getFabricVersionId()     // Catch: java.lang.Throwable -> L8f
        L2a:
            r3 = r0
            goto L56
        L2c:
            java.lang.String r3 = "Forge"
            boolean r3 = r3.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> L8f
            if (r3 == 0) goto L41
            java.lang.String r0 = r10.name     // Catch: java.lang.Throwable -> L8f
            java.lang.String r2 = r10.loaderVersion     // Catch: java.lang.Throwable -> L8f
            ca.dnamobile.javalauncher.ui.version.ForgeInstaller$InstallResult r9 = ca.dnamobile.javalauncher.ui.version.ForgeInstaller.installForgeVersion(r7, r9, r0, r2, r8)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = r9.getForgeVersionId()     // Catch: java.lang.Throwable -> L8f
            goto L2a
        L41:
            java.lang.String r3 = "NeoForge"
            boolean r2 = r3.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> L8f
            if (r2 == 0) goto L2a
            java.lang.String r0 = r10.name     // Catch: java.lang.Throwable -> L8f
            java.lang.String r2 = r10.loaderVersion     // Catch: java.lang.Throwable -> L8f
            ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller$InstallResult r9 = ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller.installNeoForgeVersion(r7, r9, r0, r2, r8)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = r9.getNeoForgeVersionId()     // Catch: java.lang.Throwable -> L8f
            goto L2a
        L56:
            boolean r9 = r10.isolatedInstance     // Catch: java.lang.Throwable -> L8f
            if (r9 != 0) goto L6f
            java.lang.String r9 = r10.loader     // Catch: java.lang.Throwable -> L8f
            r10 = 0
            r7.ensureModsDirectoryForLoader(r9, r10)     // Catch: java.lang.Throwable -> L8f
            r7.syncSelectedStorageMirrorToTree(r8)     // Catch: java.lang.Throwable -> L8f
            ca.dnamobile.javalauncher.settings.LauncherPreferences.setShowSharedInstalls(r7, r1)     // Catch: java.lang.Throwable -> L8f
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda2 r8 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda2     // Catch: java.lang.Throwable -> L8f
            r8.<init>(r7, r3)     // Catch: java.lang.Throwable -> L8f
            r7.runOnUiThread(r8)     // Catch: java.lang.Throwable -> L8f
            return
        L6f:
            java.lang.String r1 = r10.name     // Catch: java.lang.Throwable -> L8f
            java.lang.String r2 = r10.loader     // Catch: java.lang.Throwable -> L8f
            java.lang.String r4 = r10.minecraftVersionId     // Catch: java.lang.Throwable -> L8f
            java.lang.String r5 = r10.versionType     // Catch: java.lang.Throwable -> L8f
            android.net.Uri r6 = r10.iconUri     // Catch: java.lang.Throwable -> L8f
            r0 = r7
            ca.dnamobile.javalauncher.instance.LauncherInstance r9 = ca.dnamobile.javalauncher.instance.LauncherInstanceManager.createInstance(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r10 = r10.loader     // Catch: java.lang.Throwable -> L8f
            r7.ensureModsDirectoryForLoader(r10, r9)     // Catch: java.lang.Throwable -> L8f
            r7.syncSelectedStorageMirrorToTree(r8)     // Catch: java.lang.Throwable -> L8f
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda3 r8 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda3     // Catch: java.lang.Throwable -> L8f
            r8.<init>(r7, r9)     // Catch: java.lang.Throwable -> L8f
            r7.runOnUiThread(r8)     // Catch: java.lang.Throwable -> L8f
            goto L9f
        L8f:
            r8 = move-exception
            java.lang.String r9 = "CreateInstance"
            java.lang.String r10 = "Unable to create launcher instance"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r9, r10, r8)
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda4 r9 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda4
            r9.<init>(r7, r8)
            r7.runOnUiThread(r9)
        L9f:
            return
    }

    private /* synthetic */ void lambda$deleteInstance$42(ca.dnamobile.javalauncher.instance.LauncherInstance r4) {
            r3 = this;
            ca.dnamobile.javalauncher.instance.LauncherInstance r0 = r3.selectedInstance
            if (r0 == 0) goto L15
            java.lang.String r0 = r0.getId()
            java.lang.String r1 = r4.getId()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L15
            r0 = 0
            r3.selectedInstance = r0
        L15:
            r0 = 0
            r3.refreshInstancesAndRebind(r0)
            r3.setLoading(r0)
            int r1 = ca.dnamobile.javalauncher.R.string.delete_instance_deleted
            java.lang.String r2 = r4.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = r3.getString(r1, r2)
            r3.setStatus(r1)
            int r1 = ca.dnamobile.javalauncher.R.string.delete_instance_deleted
            java.lang.String r4 = r4.getName()
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r4 = r3.getString(r1, r4)
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r0)
            r4.show()
            return
    }

    private /* synthetic */ void lambda$deleteInstance$43(java.lang.Throwable r3, ca.dnamobile.javalauncher.instance.LauncherInstance r4) {
            r2 = this;
            r0 = 0
            r2.setLoading(r0)
            java.lang.String r0 = r3.getMessage()
            if (r0 == 0) goto Lf
            java.lang.String r3 = r3.getMessage()
            goto L17
        Lf:
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getSimpleName()
        L17:
            int r0 = ca.dnamobile.javalauncher.R.string.delete_instance_failed
            java.lang.String r1 = r4.getName()
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r3}
            java.lang.String r0 = r2.getString(r0, r1)
            r2.setStatus(r0)
            int r0 = ca.dnamobile.javalauncher.R.string.delete_instance_failed
            java.lang.String r4 = r4.getName()
            java.lang.Object[] r3 = new java.lang.Object[]{r4, r3}
            java.lang.String r3 = r2.getString(r0, r3)
            r4 = 1
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r4)
            r3.show()
            return
    }

    private /* synthetic */ void lambda$deleteInstance$44(ca.dnamobile.javalauncher.instance.LauncherInstance r4) {
            r3 = this;
            ca.dnamobile.javalauncher.instance.LauncherInstanceManager.deleteInstance(r3, r4)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = r4.getId()     // Catch: java.lang.Throwable -> L13
            ca.dnamobile.javalauncher.settings.LauncherPreferences.clearInstancePlayed(r3, r0)     // Catch: java.lang.Throwable -> L13
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda33 r0 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda33     // Catch: java.lang.Throwable -> L13
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L13
            r3.runOnUiThread(r0)     // Catch: java.lang.Throwable -> L13
            goto L34
        L13:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to delete instance "
            r1.<init>(r2)
            java.lang.String r2 = r4.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "DeleteInstance"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r2, r1, r0)
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda34 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda34
            r1.<init>(r3, r0, r4)
            r3.runOnUiThread(r1)
        L34:
            return
    }

    private /* synthetic */ void lambda$dispatchInstallProgress$39(int r1, java.lang.String r2) {
            r0 = this;
            r0.updateInstallProgress(r1, r2)
            return
    }

    private /* synthetic */ void lambda$importModpackFromUri$25(android.net.Uri r1, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener r2) {
            r0 = this;
            ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.importFromUri(r0, r1, r2)
            return
    }

    private /* synthetic */ void lambda$launchSelectedInstance$48(ca.dnamobile.javalauncher.instance.LauncherInstance r1) {
            r0 = this;
            r0.startGameActivity(r1)
            return
    }

    private /* synthetic */ void lambda$loadVersions$19(java.util.List r2, boolean r3) {
            r1 = this;
            java.util.ArrayList<ca.dnamobile.javalauncher.data.model.MinecraftVersion> r0 = r1.allVersions
            r0.clear()
            java.util.ArrayList<ca.dnamobile.javalauncher.data.model.MinecraftVersion> r0 = r1.allVersions
            r0.addAll(r2)
            if (r3 == 0) goto L25
            r3 = 0
            r1.setLoading(r3)
            int r3 = ca.dnamobile.javalauncher.R.string.msg_versions_loaded
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r2 = r1.getString(r3, r2)
            r1.setStatus(r2)
        L25:
            return
    }

    private /* synthetic */ void lambda$loadVersions$20(boolean r2, java.lang.Throwable r3) {
            r1 = this;
            if (r2 == 0) goto L6
            r2 = 0
            r1.setLoading(r2)
        L6:
            int r2 = ca.dnamobile.javalauncher.R.string.msg_versions_failed
            java.lang.String r0 = r3.getMessage()
            if (r0 == 0) goto L13
            java.lang.String r3 = r3.getMessage()
            goto L1b
        L13:
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getSimpleName()
        L1b:
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r2 = r1.getString(r2, r3)
            r1.setStatus(r2)
            return
    }

    private /* synthetic */ void lambda$loadVersions$21(boolean r4) {
            r3 = this;
            java.util.List r0 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionManifestClient.loadVersions(r3)     // Catch: java.lang.Throwable -> Ld
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda30 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda30     // Catch: java.lang.Throwable -> Ld
            r1.<init>(r3, r0, r4)     // Catch: java.lang.Throwable -> Ld
            r3.runOnUiThread(r1)     // Catch: java.lang.Throwable -> Ld
            goto L1d
        Ld:
            r0 = move-exception
            java.lang.String r1 = "VersionManifest"
            java.lang.String r2 = "Unable to load Minecraft version manifest"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r2, r0)
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda31 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda31
            r1.<init>(r3, r4, r0)
            r3.runOnUiThread(r1)
        L1d:
            return
    }

    private /* synthetic */ void lambda$maybeShowNotificationPermissionLaunchPrompt$38(android.content.DialogInterface r1, int r2) {
            r0 = this;
            r0.requestNotificationPermissionIfPossible()
            return
    }

    private /* synthetic */ void lambda$maybeShowRequiredLegalAcceptanceDialog$1(android.view.View r1) {
            r0 = this;
            java.lang.String r1 = "https://www.minecraft.net/en-us/eula"
            ca.dnamobile.javalauncher.legal.LegalLinks.open(r0, r1)
            return
    }

    private /* synthetic */ void lambda$maybeShowRequiredLegalAcceptanceDialog$2(androidx.appcompat.app.AlertDialog r1, android.view.View r2) {
            r0 = this;
            ca.dnamobile.javalauncher.legal.LegalConsentStore.markCurrentTermsAccepted(r0)
            r1.dismiss()
            r0.maybeShowNotificationPermissionLaunchPrompt()
            ca.dnamobile.javalauncher.update.LauncherUpdateDialogs.checkOnStartup(r0)
            return
    }

    private /* synthetic */ void lambda$maybeShowRequiredLegalAcceptanceDialog$3(androidx.appcompat.app.AlertDialog r2, android.content.DialogInterface r3) {
            r1 = this;
            r3 = -1
            android.widget.Button r3 = r2.getButton(r3)
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda11 r0 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda11
            r0.<init>(r1, r2)
            r3.setOnClickListener(r0)
            return
    }

    private /* synthetic */ void lambda$new$0() {
            r2 = this;
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r2.binding
            if (r0 == 0) goto L11
            android.widget.TextView r0 = r0.textStatus
            if (r0 == 0) goto L11
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r2.binding
            android.widget.TextView r0 = r0.textStatus
            r1 = 8
            r0.setVisibility(r1)
        L11:
            return
    }

    private /* synthetic */ void lambda$quickLaunchInstance$46(ca.dnamobile.javalauncher.instance.LauncherInstance r1) {
            r0 = this;
            r0.quickLaunchInstance(r1)
            return
    }

    private /* synthetic */ void lambda$quickLaunchInstance$47(ca.dnamobile.javalauncher.instance.LauncherInstance r1) {
            r0 = this;
            r0.startGameActivity(r1)
            return
    }

    private /* synthetic */ void lambda$refreshStorageLocationForAdapter$29(java.lang.Throwable r4, java.lang.String r5, boolean r6) {
            r3 = this;
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r3)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r3.binding
            android.widget.TextView r0 = r0.textFolder
            int r1 = ca.dnamobile.javalauncher.R.string.launcher_folder_value
            java.lang.String r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = r3.getString(r1, r2)
            r0.setText(r1)
            r0 = 0
            r3.refreshInstancesAndRebind(r0)
            r3.setLoading(r0)
            if (r4 == 0) goto L45
            java.lang.String r5 = r4.getMessage()
            if (r5 == 0) goto L2a
            java.lang.String r4 = r4.getMessage()
            goto L32
        L2a:
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
        L32:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Storage selected, but metadata read failed: "
            r5.<init>(r0)
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r4 = r4.toString()
            r3.setStatus(r4)
            goto L4a
        L45:
            if (r5 == 0) goto L4a
            r3.setStatus(r5)
        L4a:
            if (r6 == 0) goto L4f
            r3.showStorageLocationsDialog()
        L4f:
            return
    }

    private /* synthetic */ void lambda$refreshStorageLocationForAdapter$30(java.lang.String r4, boolean r5) {
            r3 = this;
            r0 = 0
            ca.dnamobile.javalauncher.storage.StorageLocationStore.syncSelectedTreeMetadataToMirror(r3, r0)     // Catch: java.lang.Throwable -> L5
            goto L1e
        L5:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to read scoped-storage metadata: "
            r1.<init>(r2)
            java.lang.String r2 = r0.getMessage()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "ScopedStorage"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r1)
        L1e:
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda38 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda38
            r1.<init>(r3, r0, r4, r5)
            r3.runOnUiThread(r1)
            return
    }

    private /* synthetic */ void lambda$registerNotificationPermissionLauncher$37(java.lang.Boolean r3) {
            r2 = this;
            boolean r3 = r3.booleanValue()
            r0 = 1
            r1 = 0
            if (r3 == 0) goto L2c
            ca.dnamobile.javalauncher.notifications.LauncherNotificationPermissionHelper.setBackgroundInstallNotificationsEnabled(r2, r0)
            boolean r3 = r2.installSessionActive
            if (r3 == 0) goto L22
            android.widget.CheckBox r3 = r2.installDialogForegroundCheck
            if (r3 == 0) goto L22
            boolean r3 = r3.isChecked()
            if (r3 == 0) goto L22
            int r3 = r2.activeInstallProgress
            if (r3 > 0) goto L1e
            goto L1f
        L1e:
            r0 = r1
        L1f:
            r2.startOrUpdateInstallForegroundService(r0)
        L22:
            int r3 = ca.dnamobile.javalauncher.R.string.notification_permission_enabled_toast
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r1)
            r3.show()
            goto L43
        L2c:
            ca.dnamobile.javalauncher.notifications.LauncherNotificationPermissionHelper.setBackgroundInstallNotificationsEnabled(r2, r1)
            boolean r3 = r2.installSessionActive
            if (r3 == 0) goto L3a
            android.widget.CheckBox r3 = r2.installDialogForegroundCheck
            if (r3 == 0) goto L3a
            r3.setChecked(r1)
        L3a:
            int r3 = ca.dnamobile.javalauncher.R.string.notification_permission_denied_toast
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r0)
            r3.show()
        L43:
            return
    }

    private /* synthetic */ void lambda$requireActiveMicrosoftAccountBeforeCreateInstance$8(java.lang.Runnable r1) {
            r0 = this;
            r0.signInWithMicrosoftThen(r1)
            return
    }

    private /* synthetic */ void lambda$requireMicrosoftLoginHistoryBeforeLaunch$9(java.lang.Runnable r1) {
            r0 = this;
            r0.signInWithMicrosoftThen(r1)
            return
    }

    private /* synthetic */ void lambda$restoreScopedStorageForInstanceDetails$49(java.lang.Throwable r4, java.lang.Runnable r5) {
            r3 = this;
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r3)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r3.binding
            android.widget.TextView r0 = r0.textFolder
            int r1 = ca.dnamobile.javalauncher.R.string.launcher_folder_value
            java.lang.String r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = r3.getString(r1, r2)
            r0.setText(r1)
            r0 = 0
            r3.setLoading(r0)
            if (r4 == 0) goto L56
            java.lang.String r0 = r4.getMessage()
            if (r0 == 0) goto L27
            java.lang.String r4 = r4.getMessage()
            goto L2f
        L27:
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
        L2f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Instance files could not be fully read: "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            r3.setStatus(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            r0 = 1
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r0)
            r4.show()
        L56:
            r5.run()
            return
    }

    private /* synthetic */ void lambda$restoreScopedStorageForInstanceDetails$50(ca.dnamobile.javalauncher.instance.LauncherInstance r3, java.lang.Runnable r4) {
            r2 = this;
            java.io.File r3 = r3.getRootDirectory()     // Catch: java.lang.Throwable -> L9
            r0 = 0
            ca.dnamobile.javalauncher.storage.StorageLocationStore.syncSelectedLocalPathFromTree(r2, r3, r0)     // Catch: java.lang.Throwable -> L9
            goto L23
        L9:
            r3 = move-exception
            r0 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to restore instance folder before details: "
            r3.<init>(r1)
            java.lang.String r1 = r0.getMessage()
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r1 = "ScopedStorage"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r3)
        L23:
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda45 r3 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda45
            r3.<init>(r2, r0, r4)
            r2.runOnUiThread(r3)
            return
    }

    private /* synthetic */ void lambda$restoreScopedStorageForLaunchIfNeeded$51(java.lang.String r2, int r3) {
            r1 = this;
            if (r2 == 0) goto L12
            java.lang.String r0 = r2.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto L12
        Ld:
            java.lang.String r2 = r2.trim()
            goto L14
        L12:
            java.lang.String r2 = "Preparing game files..."
        L14:
            r1.updateLaunchPrepareProgress(r3, r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Launching game: "
            r3.<init>(r0)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            r1.setStatus(r2)
            return
    }

    private /* synthetic */ void lambda$restoreScopedStorageForLaunchIfNeeded$52(int r3, java.lang.String r4) {
            r2 = this;
            android.os.Handler r0 = r2.mainHandler
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda21 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda21
            r1.<init>(r2, r4, r3)
            r0.post(r1)
            return
    }

    private /* synthetic */ void lambda$restoreScopedStorageForLaunchIfNeeded$53(java.lang.Throwable r4, java.lang.Runnable r5) {
            r3 = this;
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r3)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r3.binding
            android.widget.TextView r0 = r0.textFolder
            int r1 = ca.dnamobile.javalauncher.R.string.launcher_folder_value
            java.lang.String r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = r3.getString(r1, r2)
            r0.setText(r1)
            r0 = 1
            r3.refreshInstancesAndRebind(r0)
            r1 = 0
            r3.setLoading(r1)
            if (r4 == 0) goto L5d
            r3.dismissLaunchPrepareDialog()
            java.lang.String r5 = r4.getMessage()
            if (r5 == 0) goto L2e
            java.lang.String r4 = r4.getMessage()
            goto L36
        L2e:
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
        L36:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to prepare scoped storage files: "
            r5.<init>(r1)
            java.lang.StringBuilder r5 = r5.append(r4)
            java.lang.String r5 = r5.toString()
            r3.setStatus(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r4 = r4.toString()
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r0)
            r4.show()
            return
        L5d:
            r4 = 100
            java.lang.String r0 = "Starting Minecraft..."
            r3.updateLaunchPrepareProgress(r4, r0)
            r3.dismissLaunchPrepareDialog()
            r5.run()
            return
    }

    private /* synthetic */ void lambda$restoreScopedStorageForLaunchIfNeeded$54(java.lang.Runnable r4) {
            r3 = this;
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda39 r0 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda39     // Catch: java.lang.Throwable -> La
            r0.<init>(r3)     // Catch: java.lang.Throwable -> La
            ca.dnamobile.javalauncher.storage.StorageLocationStore.syncSelectedTreeToMirror(r3, r0)     // Catch: java.lang.Throwable -> La
            r0 = 0
            goto L23
        La:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to restore scoped storage before launch: "
            r1.<init>(r2)
            java.lang.String r2 = r0.getMessage()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "ScopedStorage"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r1)
        L23:
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda40 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda40
            r1.<init>(r3, r0, r4)
            r3.runOnUiThread(r1)
            return
    }

    private /* synthetic */ void lambda$selectAndOpenInstance$45(ca.dnamobile.javalauncher.instance.LauncherInstance r1) {
            r0 = this;
            r0.openInstanceDetails(r1)
            return
    }

    private /* synthetic */ void lambda$setupAccountUi$4(android.view.View r1) {
            r0 = this;
            r1 = 0
            r0.signInWithMicrosoftThen(r1)
            return
    }

    private /* synthetic */ void lambda$setupAccountUi$5(android.view.View r1) {
            r0 = this;
            r0.showSignOutConfirmationDialog()
            return
    }

    private /* synthetic */ void lambda$setupInstanceUi$10(android.view.View r1) {
            r0 = this;
            r1 = 1
            r0.refreshInstancesAndRebind(r1)
            r0.loadVersions(r1)
            return
    }

    private /* synthetic */ void lambda$setupInstanceUi$11(android.view.View r1) {
            r0 = this;
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda17 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda17
            r1.<init>(r0)
            boolean r1 = r0.requireActiveMicrosoftAccountBeforeCreateInstance(r1)
            if (r1 == 0) goto Lc
            return
        Lc:
            r0.showCreateInstanceDialog()
            return
    }

    private /* synthetic */ void lambda$setupInstanceUi$12(android.view.View r1) {
            r0 = this;
            r0.launchSelectedInstance()
            return
    }

    private /* synthetic */ void lambda$setupInstanceUi$13(android.view.View r1) {
            r0 = this;
            r0.showSelectedInstanceFolder()
            return
    }

    private /* synthetic */ void lambda$setupInstanceUi$14(android.view.View r2) {
            r1 = this;
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<ca.dnamobile.javalauncher.LauncherSettingsActivity> r0 = ca.dnamobile.javalauncher.LauncherSettingsActivity.class
            r2.<init>(r1, r0)
            r1.startActivity(r2)
            return
    }

    private /* synthetic */ void lambda$setupInstanceUi$15(android.widget.CompoundButton r1, boolean r2) {
            r0 = this;
            ca.dnamobile.javalauncher.logs.LauncherLogManager.setKeepLogHistoryEnabled(r0, r2)
            if (r2 == 0) goto L8
            int r1 = ca.dnamobile.javalauncher.R.string.log_history_enabled
            goto La
        L8:
            int r1 = ca.dnamobile.javalauncher.R.string.log_history_disabled
        La:
            java.lang.String r1 = r0.getString(r1)
            r0.setStatus(r1)
            return
    }

    private /* synthetic */ void lambda$setupInstanceUi$16(android.view.View r1) {
            r0 = this;
            ca.dnamobile.javalauncher.logs.LauncherLogManager.shareLatestLog(r0)
            return
    }

    private /* synthetic */ void lambda$setupMainContentButtons$23(android.view.View r1) {
            r0 = this;
            boolean r1 = r0.hasActiveMicrosoftAccount()
            if (r1 != 0) goto Lf
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda32 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda32
            r1.<init>(r0)
            r0.signInWithMicrosoftThen(r1)
            return
        Lf:
            r0.openGlobalContentBrowser()
            return
    }

    private /* synthetic */ void lambda$setupMainContentButtons$24(android.view.View r1) {
            r0 = this;
            boolean r1 = r0.hasActiveMicrosoftAccount()
            if (r1 != 0) goto Lf
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda1 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda1
            r1.<init>(r0)
            r0.signInWithMicrosoftThen(r1)
            return
        Lf:
            r0.openModpackImportPicker()
            return
    }

    private /* synthetic */ void lambda$setupMainPlayerHeadButton$6(android.view.View r2) {
            r1 = this;
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<ca.dnamobile.javalauncher.LauncherSettingsActivity> r0 = ca.dnamobile.javalauncher.LauncherSettingsActivity.class
            r2.<init>(r1, r0)
            r1.startActivity(r2)
            return
    }

    private /* synthetic */ void lambda$setupRenderSurfaceUi$17(android.widget.CompoundButton r1, boolean r2) {
            r0 = this;
            ca.dnamobile.javalauncher.settings.LauncherPreferences.setUseNativeSurfaceView(r0, r2)
            r0.updateRenderSurfaceSwitchText(r2)
            int r1 = ca.dnamobile.javalauncher.R.string.render_surface_mode_status
            if (r2 == 0) goto Ld
            int r2 = ca.dnamobile.javalauncher.R.string.render_surface_surface_view
            goto Lf
        Ld:
            int r2 = ca.dnamobile.javalauncher.R.string.render_surface_texture_view
        Lf:
            java.lang.String r2 = r0.getString(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = r0.getString(r1, r2)
            r0.setStatus(r1)
            return
    }

    private /* synthetic */ void lambda$setupSharedInstallsUi$18(android.widget.CompoundButton r1, boolean r2) {
            r0 = this;
            ca.dnamobile.javalauncher.settings.LauncherPreferences.setShowSharedInstalls(r0, r2)
            r0.updateSharedInstallsSwitchText(r2)
            r1 = 1
            r0.refreshInstancesAndRebind(r1)
            if (r2 == 0) goto Lf
            int r1 = ca.dnamobile.javalauncher.R.string.shared_installs_shown
            goto L11
        Lf:
            int r1 = ca.dnamobile.javalauncher.R.string.shared_installs_hidden
        L11:
            java.lang.String r1 = r0.getString(r1)
            r0.setStatus(r1)
            return
    }

    private /* synthetic */ void lambda$setupStorageLocationsButton$26(android.view.View r1) {
            r0 = this;
            r0.showStorageLocationsDialog()
            return
    }

    private /* synthetic */ void lambda$showDeleteInstanceDialog$41(ca.dnamobile.javalauncher.instance.LauncherInstance r1, android.content.DialogInterface r2, int r3) {
            r0 = this;
            r0.deleteInstance(r1)
            return
    }

    private /* synthetic */ void lambda$showDeleteStorageLocationDialog$27(android.content.DialogInterface r1, int r2) {
            r0 = this;
            r0.showStorageLocationsDialog()
            return
    }

    private /* synthetic */ void lambda$showDeleteStorageLocationDialog$28(ca.dnamobile.javalauncher.storage.StorageLocation r1, android.content.DialogInterface r2, int r3) {
            r0 = this;
            java.lang.String r2 = r1.getId()
            boolean r2 = ca.dnamobile.javalauncher.storage.StorageLocationStore.removeLocation(r0, r2)
            if (r2 != 0) goto L18
            int r1 = ca.dnamobile.javalauncher.R.string.storage_location_delete_failed
            r2 = 1
            android.widget.Toast r1 = android.widget.Toast.makeText(r0, r1, r2)
            r1.show()
            r0.showStorageLocationsDialog()
            return
        L18:
            r0.refreshAfterStorageLocationChange()
            int r2 = ca.dnamobile.javalauncher.R.string.storage_location_deleted
            java.lang.String r3 = r1.getDisplayName()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r2 = r0.getString(r2, r3)
            r0.setStatus(r2)
            int r2 = ca.dnamobile.javalauncher.R.string.storage_location_deleted
            java.lang.String r1 = r1.getDisplayName()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r1 = r0.getString(r2, r1)
            r2 = 0
            android.widget.Toast r1 = android.widget.Toast.makeText(r0, r1, r2)
            r1.show()
            r0.showStorageLocationsDialog()
            return
    }

    private /* synthetic */ void lambda$showInstallDialog$40(android.widget.CompoundButton r1, boolean r2) {
            r0 = this;
            ca.dnamobile.javalauncher.notifications.LauncherNotificationPermissionHelper.setBackgroundInstallNotificationsEnabled(r0, r2)
            boolean r1 = r0.installSessionActive
            if (r1 != 0) goto L8
            return
        L8:
            if (r2 == 0) goto L15
            int r1 = r0.activeInstallProgress
            if (r1 > 0) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            r0.startOrUpdateInstallForegroundService(r1)
            goto L18
        L15:
            ca.dnamobile.javalauncher.installation.InstallationForegroundService.stop(r0)
        L18:
            return
    }

    private /* synthetic */ void lambda$showSignOutConfirmationDialog$7(android.content.DialogInterface r1, int r2) {
            r0 = this;
            r0.performMicrosoftSignOut()
            return
    }

    static /* synthetic */ void lambda$syncSelectedStorageMirrorToTree$36(ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.InstallProgressListener r1, int r2, java.lang.String r3) {
            r0 = 99
            int r2 = java.lang.Math.min(r0, r2)
            r0 = 98
            int r2 = java.lang.Math.max(r0, r2)
            r1.onProgress(r2, r3)
            return
    }

    private void launchSelectedInstance() {
            r2 = this;
            boolean r0 = ca.dnamobile.javalauncher.controls.ControlsMain.toastAndBlockIfInvalidSignature(r2)
            if (r0 == 0) goto L7
            return
        L7:
            ca.dnamobile.javalauncher.instance.LauncherInstance r0 = r2.selectedInstance
            if (r0 != 0) goto L16
            int r0 = ca.dnamobile.javalauncher.R.string.hint_select_instance
            r1 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
            return
        L16:
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda36 r0 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda36
            r0.<init>(r2)
            boolean r0 = r2.requireMicrosoftLoginHistoryBeforeLaunch(r0)
            if (r0 == 0) goto L22
            return
        L22:
            ca.dnamobile.javalauncher.instance.LauncherInstance r0 = r2.selectedInstance
            java.io.File r0 = r0.getGameDirectory()
            boolean r0 = ca.dnamobile.javalauncher.modcompat.SimpleVoiceChatCompat.ensureMicrophoneReadyBeforeLaunch(r2, r0)
            if (r0 != 0) goto L2f
            return
        L2f:
            ca.dnamobile.javalauncher.instance.LauncherInstance r0 = r2.selectedInstance
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda37 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda37
            r1.<init>(r2, r0)
            r2.restoreScopedStorageForLaunchIfNeeded(r0, r1)
            return
    }

    private void loadVersions(boolean r3) {
            r2 = this;
            if (r3 == 0) goto Lf
            r0 = 1
            r2.setLoading(r0)
            int r0 = ca.dnamobile.javalauncher.R.string.msg_fetching_versions
            java.lang.String r0 = r2.getString(r0)
            r2.setStatus(r0)
        Lf:
            java.lang.Thread r0 = new java.lang.Thread
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda27 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda27
            r1.<init>(r2, r3)
            java.lang.String r3 = "Minecraft Version Manifest"
            r0.<init>(r1, r3)
            r0.start()
            return
    }

    private boolean matchesFilter(ca.dnamobile.javalauncher.instance.LauncherInstance r10) {
            r9 = this;
            java.lang.String r0 = r9.selectedFilter
            int r1 = r0.hashCode()
            java.lang.String r2 = "snapshot"
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 0
            java.lang.String r7 = "vanilla"
            r8 = 1
            switch(r1) {
                case -934918565: goto L41;
                case -903566235: goto L37;
                case -615513399: goto L2d;
                case 96673: goto L23;
                case 233102203: goto L1b;
                case 284874180: goto L13;
                default: goto L12;
            }
        L12:
            goto L4b
        L13:
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L4b
            r0 = r4
            goto L4c
        L1b:
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L4b
            r0 = r8
            goto L4c
        L23:
            java.lang.String r1 = "all"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4b
            r0 = 5
            goto L4c
        L2d:
            java.lang.String r1 = "modified"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4b
            r0 = r5
            goto L4c
        L37:
            java.lang.String r1 = "shared"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4b
            r0 = r3
            goto L4c
        L41:
            java.lang.String r1 = "recent"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4b
            r0 = r6
            goto L4c
        L4b:
            r0 = -1
        L4c:
            if (r0 == 0) goto L81
            if (r0 == r8) goto L78
            if (r0 == r5) goto L6e
            if (r0 == r4) goto L65
            if (r0 == r3) goto L57
            return r8
        L57:
            boolean r0 = ca.dnamobile.javalauncher.settings.LauncherPreferences.isShowSharedInstalls(r9)
            if (r0 == 0) goto L64
            boolean r10 = r10.isIsolated()
            if (r10 != 0) goto L64
            r6 = r8
        L64:
            return r6
        L65:
            java.lang.String r10 = r10.getVersionType()
            boolean r10 = r2.equalsIgnoreCase(r10)
            return r10
        L6e:
            java.lang.String r10 = r10.getLoader()
            boolean r10 = r7.equalsIgnoreCase(r10)
            r10 = r10 ^ r8
            return r10
        L78:
            java.lang.String r10 = r10.getLoader()
            boolean r10 = r7.equalsIgnoreCase(r10)
            return r10
        L81:
            java.lang.String r10 = r10.getId()
            long r0 = ca.dnamobile.javalauncher.settings.LauncherPreferences.getInstanceLastPlayed(r9, r10)
            r2 = 0
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 <= 0) goto L90
            r6 = r8
        L90:
            return r6
    }

    private void maybeShowNotificationPermissionLaunchPrompt() {
            r3 = this;
            boolean r0 = ca.dnamobile.javalauncher.notifications.LauncherNotificationPermissionHelper.shouldShowLaunchPrompt(r3)
            if (r0 != 0) goto L7
            return
        L7:
            ca.dnamobile.javalauncher.notifications.LauncherNotificationPermissionHelper.markLaunchPromptShown(r3)
            androidx.appcompat.app.AlertDialog$Builder r0 = new androidx.appcompat.app.AlertDialog$Builder
            r0.<init>(r3)
            int r1 = ca.dnamobile.javalauncher.R.string.notification_permission_launch_title
            androidx.appcompat.app.AlertDialog$Builder r0 = r0.setTitle(r1)
            int r1 = ca.dnamobile.javalauncher.R.string.notification_permission_launch_message
            androidx.appcompat.app.AlertDialog$Builder r0 = r0.setMessage(r1)
            int r1 = ca.dnamobile.javalauncher.R.string.notification_permission_not_now
            r2 = 0
            androidx.appcompat.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            int r1 = ca.dnamobile.javalauncher.R.string.notification_permission_allow
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda54 r2 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda54
            r2.<init>(r3)
            androidx.appcompat.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)
            r0.show()
            return
    }

    private void maybeShowRequiredLegalAcceptanceDialog() {
            r6 = this;
            boolean r0 = ca.dnamobile.javalauncher.legal.LegalConsentStore.hasAcceptedCurrentTerms(r6)
            if (r0 == 0) goto Ld
            r6.maybeShowNotificationPermissionLaunchPrompt()
            ca.dnamobile.javalauncher.update.LauncherUpdateDialogs.checkOnStartup(r6)
            return
        Ld:
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r6)
            r1 = 1
            r0.setOrientation(r1)
            r1 = 1102053376(0x41b00000, float:22.0)
            int r1 = r6.dp(r1)
            r2 = 0
            r0.setPadding(r1, r2, r1, r2)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r6)
            java.lang.String r3 = "Before using DroidBridge Launcher, you must accept that your use of Minecraft is subject to the Minecraft End User License Agreement (EULA) and Minecraft Usage Guidelines.\n\nYou do not have to read the EULA here before continuing, but the link is provided below for review. Press Accept to start using the launcher."
            r1.setText(r3)
            r3 = 16974320(0x10301f0, float:2.406229E-38)
            r1.setTextAppearance(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = -1
            r5 = -2
            r3.<init>(r4, r5)
            r0.addView(r1, r3)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r6)
            java.lang.String r3 = "Open Minecraft EULA"
            r1.setText(r3)
            r3 = 16974331(0x10301fb, float:2.406232E-38)
            r1.setTextAppearance(r3)
            r3 = -14776091(0xffffffffff1e88e5, float:-2.1072882E38)
            r1.setTextColor(r3)
            r3 = 1096810496(0x41600000, float:14.0)
            int r3 = r6.dp(r3)
            r1.setPadding(r2, r3, r2, r2)
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda12 r3 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda12
            r3.<init>(r6)
            r1.setOnClickListener(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r4, r5)
            r0.addView(r1, r3)
            androidx.appcompat.app.AlertDialog$Builder r1 = new androidx.appcompat.app.AlertDialog$Builder
            r1.<init>(r6)
            java.lang.String r3 = "Minecraft EULA"
            androidx.appcompat.app.AlertDialog$Builder r1 = r1.setTitle(r3)
            androidx.appcompat.app.AlertDialog$Builder r0 = r1.setView(r0)
            androidx.appcompat.app.AlertDialog$Builder r0 = r0.setCancelable(r2)
            java.lang.String r1 = "Accept"
            r2 = 0
            androidx.appcompat.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)
            androidx.appcompat.app.AlertDialog r0 = r0.create()
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda13 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda13
            r1.<init>(r6, r0)
            r0.setOnShowListener(r1)
            r0.show()
            return
    }

    private java.lang.String normalizeInstalledVersionType(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L12
            boolean r0 = ca.dnamobile.javalauncher.MainActivity$$ExternalSyntheticBackport0.m(r2)
            if (r0 != 0) goto L12
            java.lang.String r0 = "installed"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L11
            goto L12
        L11:
            return r2
        L12:
            java.lang.String r2 = "release"
            return r2
    }

    private static java.lang.String normalizeInstanceNameKey(java.lang.String r1) {
            if (r1 != 0) goto L5
            java.lang.String r1 = ""
            return r1
        L5:
            java.lang.String r1 = r1.trim()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r0)
            return r1
    }

    private void openGlobalContentBrowser() {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<ca.dnamobile.javalauncher.ContentBrowserActivity> r1 = ca.dnamobile.javalauncher.ContentBrowserActivity.class
            r0.<init>(r3, r1)
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.CONTENT_CATEGORY"
            java.lang.String r2 = "modpacks"
            r0.putExtra(r1, r2)
            r3.startActivity(r0)
            return
    }

    private void openInstanceDetails(ca.dnamobile.javalauncher.instance.LauncherInstance r1) {
            r0 = this;
            android.content.Intent r1 = ca.dnamobile.javalauncher.InstanceDetailsActivity.createIntent(r0, r1)
            r0.startActivity(r1)
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
            r1 = 8033(0x1f61, float:1.1257E-41)
            r5.startActivityForResult(r0, r1)     // Catch: android.content.ActivityNotFoundException -> L3c
            goto L45
        L3c:
            java.lang.String r0 = "No file picker is available."
            android.widget.Toast r0 = android.widget.Toast.makeText(r5, r0, r3)
            r0.show()
        L45:
            return
    }

    private void openStorageLocationPicker() {
            r2 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.OPEN_DOCUMENT_TREE"
            r0.<init>(r1)
            r1 = 195(0xc3, float:2.73E-43)
            r0.addFlags(r1)
            r1 = 8032(0x1f60, float:1.1255E-41)
            r2.startActivityForResult(r0, r1)     // Catch: android.content.ActivityNotFoundException -> L12
            goto L1b
        L12:
            int r0 = ca.dnamobile.javalauncher.R.string.storage_picker_unavailable
            java.lang.String r0 = r2.getString(r0)
            r2.setStatus(r0)
        L1b:
            return
    }

    private void performMicrosoftSignOut() {
            r2 = this;
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal r0 = r2.authManager
            if (r0 == 0) goto L2b
            ca.dnamobile.javalauncher.data.AccountStore r1 = r2.accountStore
            if (r1 != 0) goto L9
            goto L2b
        L9:
            r1 = 0
            r2.pendingAfterMicrosoftSignIn = r1
            r0.signOut()
            ca.dnamobile.javalauncher.data.AccountStore r0 = r2.accountStore
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r0.load()
            r2.updateAccountStatus(r0)
            int r0 = ca.dnamobile.javalauncher.R.string.msg_sign_out_success
            java.lang.String r0 = r2.getString(r0)
            r2.setStatus(r0)
            int r0 = ca.dnamobile.javalauncher.R.string.msg_sign_out_success
            r1 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
        L2b:
            return
    }

    private void pickInstanceIcon() {
            r2 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.OPEN_DOCUMENT"
            r0.<init>(r1)
            java.lang.String r1 = "image/*"
            r0.setType(r1)
            java.lang.String r1 = "android.intent.category.OPENABLE"
            r0.addCategory(r1)
            r1 = 65
            r0.addFlags(r1)
            r1 = 8021(0x1f55, float:1.124E-41)
            r2.startActivityForResult(r0, r1)     // Catch: android.content.ActivityNotFoundException -> L1c
            goto L26
        L1c:
            int r0 = ca.dnamobile.javalauncher.R.string.create_instance_icon_picker_missing
            r1 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
        L26:
            return
    }

    private void quickLaunchInstance(ca.dnamobile.javalauncher.instance.LauncherInstance r2) {
            r1 = this;
            boolean r0 = ca.dnamobile.javalauncher.controls.ControlsMain.toastAndBlockIfInvalidSignature(r1)
            if (r0 == 0) goto L7
            return
        L7:
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda59 r0 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda59
            r0.<init>(r1, r2)
            boolean r0 = r1.requireMicrosoftLoginHistoryBeforeLaunch(r0)
            if (r0 == 0) goto L13
            return
        L13:
            r1.selectedInstance = r2
            ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter r0 = r1.instanceAdapter
            if (r0 == 0) goto L1c
            r0.setSelectedInstance(r2)
        L1c:
            r1.updateSelectedInstanceCard()
            java.io.File r0 = r2.getGameDirectory()
            boolean r0 = ca.dnamobile.javalauncher.modcompat.SimpleVoiceChatCompat.ensureMicrophoneReadyBeforeLaunch(r1, r0)
            if (r0 != 0) goto L2a
            return
        L2a:
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda0 r0 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda0
            r0.<init>(r1, r2)
            r1.restoreScopedStorageForLaunchIfNeeded(r2, r0)
            return
    }

    private static java.lang.String readFile(java.io.File r1) throws java.lang.Exception {
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
            java.lang.String r1 = net.kdt.pojavlaunch.Tools.read(r0)     // Catch: java.lang.Throwable -> Ld
            r0.close()
            return r1
        Ld:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L12
            goto L16
        L12:
            r0 = move-exception
            r1.addSuppressed(r0)
        L16:
            throw r1
    }

    private void refreshAccountUiFromStore() {
            r3 = this;
            ca.dnamobile.javalauncher.data.AccountStore r0 = r3.accountStore
            if (r0 == 0) goto L19
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r1 = r3.binding
            if (r1 != 0) goto L9
            goto L19
        L9:
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r0.load()     // Catch: java.lang.Throwable -> L11
            r3.updateAccountStatus(r0)     // Catch: java.lang.Throwable -> L11
            goto L19
        L11:
            r0 = move-exception
            java.lang.String r1 = "MainActivity"
            java.lang.String r2 = "Unable to refresh account UI"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r2, r0)
        L19:
            return
    }

    private void refreshAfterStorageLocationChange() {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.refreshAfterStorageLocationChange(r0, r1)
            return
    }

    private void refreshAfterStorageLocationChange(java.lang.String r1, boolean r2) {
            r0 = this;
            r0.refreshStorageLocationForAdapter(r1, r2)
            return
    }

    private void refreshAfterStorageLocationSelection(java.lang.String r1, boolean r2) {
            r0 = this;
            r0.refreshStorageLocationForAdapter(r1, r2)
            return
    }

    private void refreshInstalledBaseVersions() {
            r3 = this;
            java.util.Set<java.lang.String> r0 = r3.installedBaseVersionIds
            r0.clear()
            java.util.List r0 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.findInstalledVersions()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            ca.dnamobile.javalauncher.data.model.MinecraftVersion r1 = (ca.dnamobile.javalauncher.data.model.MinecraftVersion) r1
            java.util.Set<java.lang.String> r2 = r3.installedBaseVersionIds
            java.lang.String r1 = r1.getId()
            r2.add(r1)
            goto Ld
        L23:
            return
    }

    private void refreshInstancesAndRebind(boolean r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto Lc
            ca.dnamobile.javalauncher.instance.LauncherInstance r4 = r3.selectedInstance
            if (r4 == 0) goto Lc
            java.lang.String r4 = ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter.getSelectionKey(r4)
            goto Ld
        Lc:
            r4 = r0
        Ld:
            r3.refreshInstalledBaseVersions()
            java.util.ArrayList<ca.dnamobile.javalauncher.instance.LauncherInstance> r1 = r3.installedInstances
            r1.clear()
            java.util.ArrayList r1 = ca.dnamobile.javalauncher.instance.LauncherInstanceManager.findInstances(r3)
            java.util.ArrayList<ca.dnamobile.javalauncher.instance.LauncherInstance> r2 = r3.installedInstances
            r2.addAll(r1)
            r3.addSharedInstalledVersions(r1)
            if (r4 == 0) goto L2a
            ca.dnamobile.javalauncher.instance.LauncherInstance r4 = r3.findInstanceBySelectionKey(r4)
            r3.selectedInstance = r4
            goto L2c
        L2a:
            r3.selectedInstance = r0
        L2c:
            ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter r4 = r3.instanceAdapter
            if (r4 == 0) goto L38
            ca.dnamobile.javalauncher.instance.LauncherInstance r0 = r3.selectedInstance
            r4.setSelectedInstance(r0)
            r3.applyInstanceFilter()
        L38:
            r3.updateSelectedInstanceCard()
            return
    }

    private void refreshStorageLocationForAdapter(java.lang.String r4, boolean r5) {
            r3 = this;
            r0 = 0
            r3.selectedInstance = r0
            ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter r0 = r3.instanceAdapter
            if (r0 == 0) goto La
            r0.clearSelectedInstance()
        La:
            boolean r0 = ca.dnamobile.javalauncher.storage.StorageLocationStore.isSelectedScopedStorage(r3)
            if (r0 != 0) goto L35
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r3)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r3.binding
            android.widget.TextView r0 = r0.textFolder
            int r1 = ca.dnamobile.javalauncher.R.string.launcher_folder_value
            java.lang.String r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = r3.getString(r1, r2)
            r0.setText(r1)
            r0 = 0
            r3.refreshInstancesAndRebind(r0)
            if (r4 == 0) goto L2f
            r3.setStatus(r4)
        L2f:
            if (r5 == 0) goto L34
            r3.showStorageLocationsDialog()
        L34:
            return
        L35:
            r0 = 1
            r3.setLoading(r0)
            java.lang.String r0 = "Reading launcher metadata..."
            r3.setStatus(r0)
            java.lang.Thread r0 = new java.lang.Thread
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda14 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda14
            r1.<init>(r3, r4, r5)
            java.lang.String r4 = "ScopedStorageMetadataRefresh"
            r0.<init>(r1, r4)
            r0.start()
            return
    }

    private void registerNotificationPermissionLauncher() {
            r2 = this;
            androidx.activity.result.contract.ActivityResultContracts$RequestPermission r0 = new androidx.activity.result.contract.ActivityResultContracts$RequestPermission
            r0.<init>()
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda10 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda10
            r1.<init>(r2)
            androidx.activity.result.ActivityResultLauncher r0 = r2.registerForActivityResult(r0, r1)
            r2.notificationPermissionLauncher = r0
            return
    }

    private void requestNotificationPermissionIfPossible() {
            r1 = this;
            androidx.activity.result.ActivityResultLauncher<java.lang.String> r0 = r1.notificationPermissionLauncher
            if (r0 != 0) goto L5
            return
        L5:
            ca.dnamobile.javalauncher.notifications.LauncherNotificationPermissionHelper.requestPostNotificationsPermission(r0)
            return
    }

    private boolean requireActiveMicrosoftAccountBeforeCreateInstance(java.lang.Runnable r3) {
            r2 = this;
            ca.dnamobile.javalauncher.data.AccountStore r0 = r2.accountStore
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda28 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda28
            r1.<init>(r2, r3)
            boolean r3 = ca.dnamobile.javalauncher.modmanager.ModManagerTools.requireActiveMicrosoftAccountBeforeInstall(r2, r0, r1)
            return r3
    }

    private boolean requireMicrosoftLoginHistoryBeforeLaunch(java.lang.Runnable r3) {
            r2 = this;
            ca.dnamobile.javalauncher.data.AccountStore r0 = r2.accountStore
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda41 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda41
            r1.<init>(r2, r3)
            boolean r3 = ca.dnamobile.javalauncher.modmanager.ModManagerTools.requireMicrosoftLoginHistoryBeforeLaunch(r2, r0, r1)
            return r3
    }

    private void resetInstallProgressThrottles() {
            r4 = this;
            r0 = 0
            r4.lastInstallUiDispatchMs = r0
            r2 = -1
            r4.lastInstallUiDispatchProgress = r2
            java.lang.String r3 = ""
            r4.lastInstallUiDispatchMessage = r3
            r4.lastInstallNotificationUpdateMs = r0
            r4.lastInstallNotificationProgress = r2
            return
    }

    private void restoreScopedStorageForInstanceDetails(ca.dnamobile.javalauncher.instance.LauncherInstance r3, java.lang.Runnable r4) {
            r2 = this;
            boolean r0 = ca.dnamobile.javalauncher.storage.StorageLocationStore.isSelectedScopedStorage(r2)
            if (r0 != 0) goto La
            r4.run()
            return
        La:
            r0 = 1
            r2.setLoading(r0)
            java.lang.String r0 = "Reading instance files..."
            r2.setStatus(r0)
            java.lang.Thread r0 = new java.lang.Thread
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda42 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda42
            r1.<init>(r2, r3, r4)
            java.lang.String r3 = "ScopedStorageInstanceDetails"
            r0.<init>(r1, r3)
            r0.start()
            return
    }

    private void restoreScopedStorageForLaunchIfNeeded(ca.dnamobile.javalauncher.instance.LauncherInstance r3, java.lang.Runnable r4) {
            r2 = this;
            java.io.File r0 = r3.getRootDirectory()
            java.lang.String r1 = r3.getBaseVersionId()
            boolean r0 = ca.dnamobile.javalauncher.storage.StorageLocationStore.needsSelectedTreeRestoreForLaunch(r2, r0, r1)
            if (r0 != 0) goto L12
            r4.run()
            return
        L12:
            r0 = 1
            r2.setLoading(r0)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r2.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonLaunchVersion
            r1 = 0
            r0.setEnabled(r1)
            java.lang.String r0 = "Preparing game files..."
            r2.setStatus(r0)
            r2.showLaunchPrepareDialog(r3)
            java.lang.Thread r3 = new java.lang.Thread
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda56 r0 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda56
            r0.<init>(r2, r4)
            java.lang.String r4 = "ScopedStorageLaunchRestore"
            r3.<init>(r0, r4)
            r3.start()
            return
    }

    private android.graphics.drawable.GradientDrawable roundedDrawable(int r2, int r3, int r4) {
            r1 = this;
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r0.setColor(r2)
            float r2 = (float) r4
            int r2 = r1.dp(r2)
            float r2 = (float) r2
            r0.setCornerRadius(r2)
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = r1.dp(r2)
            r0.setStroke(r2, r3)
            return r0
    }

    private java.lang.String sanitizeSavedFilter(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "all"
            if (r4 != 0) goto L5
            return r0
        L5:
            r4.hashCode()
            int r1 = r4.hashCode()
            r2 = -1
            switch(r1) {
                case -934918565: goto L46;
                case -903566235: goto L3b;
                case -615513399: goto L30;
                case 96673: goto L27;
                case 233102203: goto L1c;
                case 284874180: goto L11;
                default: goto L10;
            }
        L10:
            goto L50
        L11:
            java.lang.String r1 = "snapshot"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L1a
            goto L50
        L1a:
            r2 = 5
            goto L50
        L1c:
            java.lang.String r1 = "vanilla"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L25
            goto L50
        L25:
            r2 = 4
            goto L50
        L27:
            boolean r1 = r4.equals(r0)
            if (r1 != 0) goto L2e
            goto L50
        L2e:
            r2 = 3
            goto L50
        L30:
            java.lang.String r1 = "modified"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L39
            goto L50
        L39:
            r2 = 2
            goto L50
        L3b:
            java.lang.String r1 = "shared"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L44
            goto L50
        L44:
            r2 = 1
            goto L50
        L46:
            java.lang.String r1 = "recent"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L4f
            goto L50
        L4f:
            r2 = 0
        L50:
            switch(r2) {
                case 0: goto L54;
                case 1: goto L54;
                case 2: goto L54;
                case 3: goto L54;
                case 4: goto L54;
                case 5: goto L54;
                default: goto L53;
            }
        L53:
            return r0
        L54:
            return r4
    }

    private void selectAndOpenInstance(ca.dnamobile.javalauncher.instance.LauncherInstance r2) {
            r1 = this;
            r1.selectedInstance = r2
            ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter r0 = r1.instanceAdapter
            if (r0 == 0) goto L9
            r0.setSelectedInstance(r2)
        L9:
            r1.updateSelectedInstanceCard()
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda43 r0 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda43
            r0.<init>(r1, r2)
            r1.restoreScopedStorageForInstanceDetails(r2, r0)
            return
    }

    private void selectTabByFilter(java.lang.String r4) {
            r3 = this;
            java.lang.String r4 = r3.sanitizeSavedFilter(r4)
            r3.selectedFilter = r4
            ca.dnamobile.javalauncher.settings.LauncherPreferences.setSelectedInstanceFilter(r3, r4)
            r0 = 0
        La:
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r1 = r3.binding
            com.google.android.material.tabs.TabLayout r1 = r1.tabVersionTypes
            int r1 = r1.getTabCount()
            if (r0 >= r1) goto L2f
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r1 = r3.binding
            com.google.android.material.tabs.TabLayout r1 = r1.tabVersionTypes
            com.google.android.material.tabs.TabLayout$Tab r1 = r1.getTabAt(r0)
            if (r1 == 0) goto L2c
            java.lang.Object r2 = r1.getTag()
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L2c
            r1.select()
            return
        L2c:
            int r0 = r0 + 1
            goto La
        L2f:
            return
    }

    private void setLoading(boolean r3) {
            r2 = this;
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r2.binding
            android.widget.ProgressBar r0 = r0.progressVersions
            r0.setIndeterminate(r3)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r2.binding
            android.widget.ProgressBar r0 = r0.progressVersions
            if (r3 == 0) goto Lf
            r1 = 0
            goto L11
        Lf:
            r1 = 8
        L11:
            r0.setVisibility(r1)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r2.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonRefreshVersions
            r1 = r3 ^ 1
            r0.setEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r2.binding
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r0.fabCreateInstance
            r1 = r3 ^ 1
            r0.setEnabled(r1)
            if (r3 != 0) goto L2b
            r2.updateSelectedInstanceCard()
        L2b:
            return
    }

    private void setStatus(java.lang.String r4) {
            r3 = this;
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r3.binding
            if (r0 == 0) goto L3f
            android.widget.TextView r0 = r0.textStatus
            if (r0 != 0) goto L9
            goto L3f
        L9:
            android.os.Handler r0 = r3.mainHandler
            java.lang.Runnable r1 = r3.hideStatusRunnable
            r0.removeCallbacks(r1)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r3.binding
            android.widget.TextView r0 = r0.textStatus
            r1 = 0
            r0.setVisibility(r1)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r3.binding
            android.widget.TextView r0 = r0.textStatus
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L28
            boolean r0 = r4.contentEquals(r0)
            if (r0 != 0) goto L2f
        L28:
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r3.binding
            android.widget.TextView r0 = r0.textStatus
            r0.setText(r4)
        L2f:
            android.os.Handler r4 = r3.mainHandler
            java.lang.Runnable r0 = r3.hideStatusRunnable
            boolean r1 = r3.installSessionActive
            if (r1 == 0) goto L3a
            r1 = 5000(0x1388, double:2.4703E-320)
            goto L3c
        L3a:
            r1 = 2600(0xa28, double:1.2846E-320)
        L3c:
            r4.postDelayed(r0, r1)
        L3f:
            return
    }

    private void setupAccountUi() {
            r3 = this;
            ca.dnamobile.javalauncher.data.AccountStore r0 = new ca.dnamobile.javalauncher.data.AccountStore     // Catch: java.lang.Throwable -> L22
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L22
            r3.accountStore = r0     // Catch: java.lang.Throwable -> L22
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal r0 = new ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal     // Catch: java.lang.Throwable -> L22
            ca.dnamobile.javalauncher.data.AccountStore r1 = r3.accountStore     // Catch: java.lang.Throwable -> L22
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L22
            r3.authManager = r0     // Catch: java.lang.Throwable -> L22
            ca.dnamobile.javalauncher.launcher.JavaLaunch$1 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$1     // Catch: java.lang.Throwable -> L22
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L22
            r0.setListener(r1)     // Catch: java.lang.Throwable -> L22
            ca.dnamobile.javalauncher.data.AccountStore r0 = r3.accountStore     // Catch: java.lang.Throwable -> L22
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r0.load()     // Catch: java.lang.Throwable -> L22
            r3.updateAccountStatus(r0)     // Catch: java.lang.Throwable -> L22
            goto L42
        L22:
            r0 = move-exception
            java.lang.String r1 = "MainActivity"
            java.lang.String r2 = "Microsoft account UI initialization failed"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r2, r0)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r3.binding
            android.widget.TextView r0 = r0.textAccountStatus
            int r1 = ca.dnamobile.javalauncher.R.string.status_signed_out
            r0.setText(r1)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonSignIn
            r1 = 0
            r0.setEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonSignOut
            r0.setEnabled(r1)
        L42:
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonSignIn
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda23 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda23
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonSignOut
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda24 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda24
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            r3.setupMainPlayerHeadButton()
            return
    }

    private void setupInstanceUi() {
            r3 = this;
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r3.binding
            android.widget.TextView r0 = r0.textFolder
            int r1 = ca.dnamobile.javalauncher.R.string.launcher_folder_value
            java.lang.String r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = r3.getString(r1, r2)
            r0.setText(r1)
            r3.setupRenderSurfaceUi()
            r3.setupSharedInstallsUi()
            ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter r0 = new ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter
            ca.dnamobile.javalauncher.launcher.JavaLaunch$2 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$2
            r1.<init>(r3)
            r0.<init>(r3, r1)
            r3.instanceAdapter = r0
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r3.binding
            androidx.recyclerview.widget.RecyclerView r0 = r0.recyclerVersions
            androidx.recyclerview.widget.GridLayoutManager r1 = new androidx.recyclerview.widget.GridLayoutManager
            int r2 = r3.getInstanceGridSpanCount()
            r1.<init>(r3, r2)
            r0.setLayoutManager(r1)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r3.binding
            androidx.recyclerview.widget.RecyclerView r0 = r0.recyclerVersions
            ca.dnamobile.javalauncher.ui.instance.LauncherInstanceAdapter r1 = r3.instanceAdapter
            r0.setAdapter(r1)
            r3.addInstanceTabs()
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonRefreshVersions
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda46 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda46
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            r3.setupStorageLocationsButton()
            r3.setupMainContentButtons()
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r3.binding
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r0.fabCreateInstance
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda47 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda47
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonLaunchVersion
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda48 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda48
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonOpenFolder
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda49 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda49
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonOpenSettings
            if (r0 == 0) goto L89
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonOpenSettings
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda50 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda50
            r1.<init>(r3)
            r0.setOnClickListener(r1)
        L89:
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r3.binding
            android.widget.CheckBox r0 = r0.checkKeepLogs
            boolean r1 = ca.dnamobile.javalauncher.logs.LauncherLogManager.isKeepLogHistoryEnabled(r3)
            r0.setChecked(r1)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r3.binding
            android.widget.CheckBox r0 = r0.checkKeepLogs
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda51 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda51
            r1.<init>(r3)
            r0.setOnCheckedChangeListener(r1)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonShareLatestLog
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda52 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda52
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonLaunchVersion
            r1 = 0
            r0.setEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonOpenFolder
            r0.setEnabled(r1)
            r3.updateSelectedInstanceCard()
            return
    }

    private void setupMainContentButtons() {
            r8 = this;
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda53 r6 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda53
            r6.<init>(r8)
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda55 r7 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda55
            r7.<init>(r8)
            java.lang.String r3 = "Browse Modpacks"
            r5 = 1
            java.lang.String r1 = "buttonBrowseContentMain"
            java.lang.String r2 = "browse_content_main_button_dynamic"
            r0 = r8
            r4 = r6
            android.view.View r0 = r0.findOrCreateMainActionButton(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L23
            r0.setOnClickListener(r6)
            java.lang.String r1 = "Browse Modpacks"
            int r2 = ca.dnamobile.javalauncher.R.drawable.ic_browse_modpacks_24
            r8.styleMainActionButton(r0, r1, r2)
        L23:
            java.lang.String r3 = "Import Modpack"
            r5 = 1
            java.lang.String r1 = "buttonImportModpackMain"
            java.lang.String r2 = "import_modpack_main_button_dynamic"
            r0 = r8
            r4 = r7
            android.view.View r0 = r0.findOrCreateMainActionButton(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L3c
            r0.setOnClickListener(r7)
            java.lang.String r1 = "Import Modpack"
            int r2 = ca.dnamobile.javalauncher.R.drawable.ic_import_modpack_24
            r8.styleMainActionButton(r0, r1, r2)
        L3c:
            boolean r0 = r8.hasActiveMicrosoftAccount()
            r8.updateMainContentButtonVisibility(r0)
            return
    }

    private void setupMainPlayerHeadButton() {
            r2 = this;
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r2.binding
            if (r0 == 0) goto L18
            android.widget.ImageView r0 = r0.imageMainPlayerHead
            if (r0 != 0) goto L9
            goto L18
        L9:
            r2.ensureMainPlayerHeadBesideShareLogs()
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r2.binding
            android.widget.ImageView r0 = r0.imageMainPlayerHead
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda29 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda29
            r1.<init>(r2)
            r0.setOnClickListener(r1)
        L18:
            return
    }

    private void setupRenderSurfaceUi() {
            r2 = this;
            boolean r0 = ca.dnamobile.javalauncher.settings.LauncherPreferences.isUseNativeSurfaceView(r2)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r1 = r2.binding
            com.google.android.material.switchmaterial.SwitchMaterial r1 = r1.switchUseNativeSurface
            r1.setChecked(r0)
            r2.updateRenderSurfaceSwitchText(r0)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r2.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchUseNativeSurface
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda9 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda9
            r1.<init>(r2)
            r0.setOnCheckedChangeListener(r1)
            return
    }

    private void setupSharedInstallsUi() {
            r2 = this;
            boolean r0 = ca.dnamobile.javalauncher.settings.LauncherPreferences.isShowSharedInstalls(r2)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r1 = r2.binding
            com.google.android.material.switchmaterial.SwitchMaterial r1 = r1.switchShowSharedInstalls
            r1.setChecked(r0)
            r2.updateSharedInstallsSwitchText(r0)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r2.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchShowSharedInstalls
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda22 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda22
            r1.<init>(r2)
            r0.setOnCheckedChangeListener(r1)
            return
    }

    private void setupStorageLocationsButton() {
            r5 = this;
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda19 r0 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda19
            r0.<init>(r5)
            android.content.res.Resources r1 = r5.getResources()
            java.lang.String r2 = "id"
            java.lang.String r3 = r5.getPackageName()
            java.lang.String r4 = "buttonStorageLocations"
            int r1 = r1.getIdentifier(r4, r2, r3)
            if (r1 == 0) goto L27
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r2 = r5.binding
            android.widget.FrameLayout r2 = r2.getRoot()
            android.view.View r1 = r2.findViewById(r1)
            if (r1 == 0) goto L27
            r1.setOnClickListener(r0)
            return
        L27:
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r1 = r5.binding
            com.google.android.material.button.MaterialButton r1 = r1.buttonRefreshVersions
            android.view.ViewParent r1 = r1.getParent()
            boolean r1 = r1 instanceof android.view.ViewGroup
            if (r1 != 0) goto L3b
            java.lang.String r0 = "MainActivity"
            java.lang.String r1 = "Storage location button missing and refresh parent is unavailable"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r1)
            return
        L3b:
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r1 = r5.binding
            com.google.android.material.button.MaterialButton r1 = r1.buttonRefreshVersions
            android.view.ViewParent r1 = r1.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            java.lang.String r2 = "storage_locations_button_dynamic"
            android.view.View r3 = r1.findViewWithTag(r2)
            if (r3 == 0) goto L51
            r3.setOnClickListener(r0)
            return
        L51:
            com.google.android.material.button.MaterialButton r3 = new com.google.android.material.button.MaterialButton
            r3.<init>(r5)
            r3.setTag(r2)
            java.lang.String r2 = ""
            r3.setText(r2)
            int r2 = ca.dnamobile.javalauncher.R.drawable.ic_folder_24
            r3.setIconResource(r2)
            r2 = 0
            r3.setIconPadding(r2)
            int r4 = ca.dnamobile.javalauncher.R.string.storage_locations_title
            java.lang.String r4 = r5.getString(r4)
            r3.setContentDescription(r4)
            r4 = 1111490560(0x42400000, float:48.0)
            int r4 = r5.dp(r4)
            r3.setMinWidth(r4)
            r4 = 1109393408(0x42200000, float:40.0)
            int r4 = r5.dp(r4)
            r3.setMinHeight(r4)
            r3.setOnClickListener(r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r4 = -2
            r0.<init>(r4, r4)
            r4 = 1090519040(0x41000000, float:8.0)
            int r4 = r5.dp(r4)
            r0.rightMargin = r4
            r1.addView(r3, r2, r0)
            return
    }

    private void showCreateInstanceDialog() {
            r3 = this;
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda17 r0 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda17
            r0.<init>(r3)
            boolean r0 = r3.requireActiveMicrosoftAccountBeforeCreateInstance(r0)
            if (r0 == 0) goto Lc
            return
        Lc:
            java.util.ArrayList<ca.dnamobile.javalauncher.data.model.MinecraftVersion> r0 = r3.allVersions
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L23
            int r0 = ca.dnamobile.javalauncher.R.string.msg_fetching_versions
            r1 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r1)
            r0.show()
            r0 = 1
            r3.loadVersions(r0)
            return
        L23:
            ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog r0 = new ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog
            java.util.ArrayList<ca.dnamobile.javalauncher.data.model.MinecraftVersion> r1 = r3.allVersions
            ca.dnamobile.javalauncher.launcher.JavaLaunch$6 r2 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$6
            r2.<init>(r3)
            r0.<init>(r3, r1, r2)
            r3.createInstanceDialog = r0
            java.util.ArrayList r1 = r3.collectExistingInstanceNamesForDialog()
            r0.setExistingInstanceNames(r1)
            ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog r0 = r3.createInstanceDialog
            r0.show()
            return
    }

    private void showDeleteInstanceDialog(ca.dnamobile.javalauncher.instance.LauncherInstance r7) {
            r6 = this;
            boolean r0 = r7.isIsolated()
            r1 = 0
            if (r0 != 0) goto L4d
            java.lang.String r0 = r7.getBaseVersionId()
            java.util.ArrayList r0 = ca.dnamobile.javalauncher.instance.LauncherInstanceManager.findSharedVersionDependents(r6, r0)
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L4d
            androidx.appcompat.app.AlertDialog$Builder r2 = new androidx.appcompat.app.AlertDialog$Builder
            r2.<init>(r6)
            int r3 = ca.dnamobile.javalauncher.R.string.delete_shared_instance_blocked_title
            java.lang.String r4 = r7.getName()
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r3 = r6.getString(r3, r4)
            androidx.appcompat.app.AlertDialog$Builder r2 = r2.setTitle(r3)
            int r3 = ca.dnamobile.javalauncher.R.string.delete_shared_instance_blocked_message
            java.lang.String r7 = r7.getName()
            java.lang.String r0 = ca.dnamobile.javalauncher.instance.LauncherInstanceManager.formatDependentVersionList(r0)
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r0}
            java.lang.String r7 = r6.getString(r3, r7)
            androidx.appcompat.app.AlertDialog$Builder r7 = r2.setMessage(r7)
            r0 = 17039370(0x104000a, float:2.42446E-38)
            androidx.appcompat.app.AlertDialog$Builder r7 = r7.setPositiveButton(r0, r1)
            r7.show()
            return
        L4d:
            java.io.File r0 = ca.dnamobile.javalauncher.instance.LauncherInstanceManager.getDeleteTargetDirectory(r7)     // Catch: java.lang.Throwable -> L56
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L56
            goto L5e
        L56:
            java.io.File r0 = r7.getRootDirectory()
            java.lang.String r0 = r0.getAbsolutePath()
        L5e:
            boolean r2 = r7.isIsolated()
            if (r2 == 0) goto L67
            int r2 = ca.dnamobile.javalauncher.R.string.delete_instance_message
            goto L69
        L67:
            int r2 = ca.dnamobile.javalauncher.R.string.delete_shared_instance_message
        L69:
            androidx.appcompat.app.AlertDialog$Builder r3 = new androidx.appcompat.app.AlertDialog$Builder
            r3.<init>(r6)
            int r4 = ca.dnamobile.javalauncher.R.string.delete_instance_title
            java.lang.String r5 = r7.getName()
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r4 = r6.getString(r4, r5)
            androidx.appcompat.app.AlertDialog$Builder r3 = r3.setTitle(r4)
            java.lang.String r4 = r7.getName()
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r0}
            java.lang.String r0 = r6.getString(r2, r0)
            androidx.appcompat.app.AlertDialog$Builder r0 = r3.setMessage(r0)
            r2 = 17039360(0x1040000, float:2.424457E-38)
            androidx.appcompat.app.AlertDialog$Builder r0 = r0.setNegativeButton(r2, r1)
            int r1 = ca.dnamobile.javalauncher.R.string.button_delete_forever
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda20 r2 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda20
            r2.<init>(r6, r7)
            androidx.appcompat.app.AlertDialog$Builder r7 = r0.setPositiveButton(r1, r2)
            r7.show()
            return
    }

    private void showDeleteStorageLocationDialog(ca.dnamobile.javalauncher.storage.StorageLocation r4) {
            r3 = this;
            boolean r0 = r4.isDefaultLocation()
            if (r0 == 0) goto L14
            int r4 = ca.dnamobile.javalauncher.R.string.storage_location_default_cannot_delete
            r0 = 0
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r0)
            r4.show()
            r3.showStorageLocationsDialog()
            return
        L14:
            androidx.appcompat.app.AlertDialog$Builder r0 = new androidx.appcompat.app.AlertDialog$Builder
            r0.<init>(r3)
            int r1 = ca.dnamobile.javalauncher.R.string.storage_location_delete_title
            java.lang.String r2 = r4.getDisplayName()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = r3.getString(r1, r2)
            androidx.appcompat.app.AlertDialog$Builder r0 = r0.setTitle(r1)
            int r1 = ca.dnamobile.javalauncher.R.string.storage_location_delete_message
            java.lang.String r2 = r4.getDisplayName()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = r3.getString(r1, r2)
            androidx.appcompat.app.AlertDialog$Builder r0 = r0.setMessage(r1)
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda15 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda15
            r1.<init>(r3)
            r2 = 17039360(0x1040000, float:2.424457E-38)
            androidx.appcompat.app.AlertDialog$Builder r0 = r0.setNegativeButton(r2, r1)
            int r1 = ca.dnamobile.javalauncher.R.string.storage_location_delete_confirm
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda16 r2 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda16
            r2.<init>(r3, r4)
            androidx.appcompat.app.AlertDialog$Builder r4 = r0.setPositiveButton(r1, r2)
            r4.show()
            return
    }

    private void showDuplicateInstanceNameMessage(java.lang.String r2) {
            r1 = this;
            int r0 = ca.dnamobile.javalauncher.R.string.create_instance_name_already_exists
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r2 = r1.getString(r0, r2)
            r1.setStatus(r2)
            r0 = 1
            android.widget.Toast r2 = android.widget.Toast.makeText(r1, r2, r0)
            r2.show()
            return
    }

    private void showInstallDialog(java.lang.String r6) {
            r5 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r5)
            android.content.res.Resources r1 = r5.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            r2 = 1103101952(0x41c00000, float:24.0)
            float r1 = r1 * r2
            int r1 = (int) r1
            r2 = 1
            r0.setOrientation(r2)
            int r3 = r1 / 2
            r4 = 0
            r0.setPadding(r1, r3, r1, r4)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r5)
            r5.installDialogMessage = r1
            int r3 = ca.dnamobile.javalauncher.R.string.create_instance_installing
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r6 = r5.getString(r3, r6)
            r1.setText(r6)
            android.widget.ProgressBar r6 = new android.widget.ProgressBar
            r1 = 0
            r3 = 16842872(0x1010078, float:2.3693894E-38)
            r6.<init>(r5, r1, r3)
            r5.installDialogProgress = r6
            r1 = 100
            r6.setMax(r1)
            android.widget.ProgressBar r6 = r5.installDialogProgress
            r6.setProgress(r4)
            android.widget.ProgressBar r6 = r5.installDialogProgress
            r6.setIndeterminate(r2)
            android.widget.CheckBox r6 = new android.widget.CheckBox
            r6.<init>(r5)
            r5.installDialogForegroundCheck = r6
            int r1 = ca.dnamobile.javalauncher.R.string.install_dialog_background_notifications
            r6.setText(r1)
            android.widget.CheckBox r6 = r5.installDialogForegroundCheck
            boolean r1 = ca.dnamobile.javalauncher.notifications.LauncherNotificationPermissionHelper.isBackgroundInstallNotificationsEnabled(r5)
            r6.setChecked(r1)
            android.widget.CheckBox r6 = r5.installDialogForegroundCheck
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda5 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda5
            r1.<init>(r5)
            r6.setOnCheckedChangeListener(r1)
            android.widget.TextView r6 = r5.installDialogMessage
            r0.addView(r6)
            android.widget.ProgressBar r6 = r5.installDialogProgress
            r0.addView(r6)
            android.widget.CheckBox r6 = r5.installDialogForegroundCheck
            r0.addView(r6)
            androidx.appcompat.app.AlertDialog$Builder r6 = new androidx.appcompat.app.AlertDialog$Builder
            r6.<init>(r5)
            int r1 = ca.dnamobile.javalauncher.R.string.create_instance_install_dialog_title
            androidx.appcompat.app.AlertDialog$Builder r6 = r6.setTitle(r1)
            androidx.appcompat.app.AlertDialog$Builder r6 = r6.setView(r0)
            androidx.appcompat.app.AlertDialog$Builder r6 = r6.setCancelable(r4)
            androidx.appcompat.app.AlertDialog r6 = r6.create()
            r5.installDialog = r6
            r6.show()
            return
    }

    private void showLaunchPrepareDialog(ca.dnamobile.javalauncher.instance.LauncherInstance r15) {
            r14 = this;
            r14.dismissLaunchPrepareDialog()
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r14)
            r1 = 1
            r0.setOrientation(r1)
            int r2 = ca.dnamobile.javalauncher.launcher.JavaLaunch.COLOR_DIALOG_BG
            r0.setBackgroundColor(r2)
            r2 = 1099956224(0x41900000, float:18.0)
            int r3 = r14.dp(r2)
            r4 = 1092616192(0x41200000, float:10.0)
            int r5 = r14.dp(r4)
            r0.setPadding(r3, r3, r3, r5)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r14)
            java.lang.String r5 = "Launching game"
            r3.setText(r5)
            r5 = 1103101952(0x41c00000, float:24.0)
            r3.setTextSize(r5)
            android.graphics.Typeface r5 = android.graphics.Typeface.DEFAULT_BOLD
            r3.setTypeface(r5)
            int r5 = ca.dnamobile.javalauncher.launcher.JavaLaunch.COLOR_TEXT_PRIMARY
            r3.setTextColor(r5)
            r6 = 1073741824(0x40000000, float:2.0)
            int r7 = r14.dp(r6)
            int r8 = r14.dp(r6)
            r9 = 1086324736(0x40c00000, float:6.0)
            int r9 = r14.dp(r9)
            r10 = 0
            r3.setPadding(r7, r10, r8, r9)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r8 = -1
            r9 = -2
            r7.<init>(r8, r9)
            r0.addView(r3, r7)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r14)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r11 = "Preparing local game files for "
            r7.<init>(r11)
            java.lang.String r15 = r15.getName()
            java.lang.StringBuilder r15 = r7.append(r15)
            java.lang.String r7 = ". This usually only happens after reinstalling the app or choosing a scoped storage folder."
            java.lang.StringBuilder r15 = r15.append(r7)
            java.lang.String r15 = r15.toString()
            r3.setText(r15)
            r15 = 1096810496(0x41600000, float:14.0)
            r3.setTextSize(r15)
            int r7 = ca.dnamobile.javalauncher.launcher.JavaLaunch.COLOR_TEXT_SECONDARY
            r3.setTextColor(r7)
            int r11 = r14.dp(r6)
            int r6 = r14.dp(r6)
            r12 = 1094713344(0x41400000, float:12.0)
            int r13 = r14.dp(r12)
            r3.setPadding(r11, r10, r6, r13)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r6.<init>(r8, r9)
            r0.addView(r3, r6)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r14)
            r3.setOrientation(r1)
            int r15 = r14.dp(r15)
            r3.setPadding(r15, r15, r15, r15)
            int r15 = ca.dnamobile.javalauncher.launcher.JavaLaunch.COLOR_CARD_BG
            int r6 = ca.dnamobile.javalauncher.launcher.JavaLaunch.COLOR_CARD_STROKE
            r11 = 18
            android.graphics.drawable.GradientDrawable r15 = r14.roundedDrawable(r15, r6, r11)
            r3.setBackground(r15)
            android.widget.LinearLayout$LayoutParams r15 = new android.widget.LinearLayout$LayoutParams
            r15.<init>(r8, r9)
            int r6 = r14.dp(r12)
            r15.setMargins(r10, r10, r10, r6)
            r0.addView(r3, r15)
            android.widget.TextView r15 = new android.widget.TextView
            r15.<init>(r14)
            java.lang.String r6 = "Restoring scoped storage"
            r15.setText(r6)
            r15.setTextSize(r2)
            android.graphics.Typeface r2 = android.graphics.Typeface.DEFAULT_BOLD
            r15.setTypeface(r2)
            r15.setTextColor(r5)
            r2 = 1090519040(0x41000000, float:8.0)
            int r2 = r14.dp(r2)
            r15.setPadding(r10, r10, r10, r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r8, r9)
            r3.addView(r15, r2)
            android.widget.TextView r15 = new android.widget.TextView
            r15.<init>(r14)
            r14.launchPrepareMessage = r15
            java.lang.String r2 = "Checking game files..."
            r15.setText(r2)
            android.widget.TextView r15 = r14.launchPrepareMessage
            r5 = 1095761920(0x41500000, float:13.0)
            r15.setTextSize(r5)
            android.widget.TextView r15 = r14.launchPrepareMessage
            r15.setTextColor(r7)
            android.widget.TextView r15 = r14.launchPrepareMessage
            int r6 = r14.dp(r4)
            r15.setPadding(r10, r10, r10, r6)
            android.widget.TextView r15 = r14.launchPrepareMessage
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r6.<init>(r8, r9)
            r3.addView(r15, r6)
            android.widget.LinearLayout r15 = new android.widget.LinearLayout
            r15.<init>(r14)
            r15.setOrientation(r10)
            r6 = 16
            r15.setGravity(r6)
            r6 = 1082130432(0x40800000, float:4.0)
            int r6 = r14.dp(r6)
            r15.setPadding(r10, r10, r10, r6)
            android.widget.TextView r6 = new android.widget.TextView
            r6.<init>(r14)
            java.lang.String r7 = "Progress"
            r6.setText(r7)
            r6.setTextSize(r5)
            int r7 = ca.dnamobile.javalauncher.launcher.JavaLaunch.COLOR_TEXT_MUTED
            r6.setTextColor(r7)
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            r13 = 1065353216(0x3f800000, float:1.0)
            r11.<init>(r10, r9, r13)
            r15.addView(r6, r11)
            android.widget.TextView r6 = new android.widget.TextView
            r6.<init>(r14)
            r14.launchPreparePercent = r6
            java.lang.String r11 = "Loading..."
            r6.setText(r11)
            android.widget.TextView r6 = r14.launchPreparePercent
            r6.setTextSize(r5)
            android.widget.TextView r5 = r14.launchPreparePercent
            android.graphics.Typeface r6 = android.graphics.Typeface.DEFAULT_BOLD
            r5.setTypeface(r6)
            android.widget.TextView r5 = r14.launchPreparePercent
            int r6 = ca.dnamobile.javalauncher.launcher.JavaLaunch.COLOR_ACCENT
            r5.setTextColor(r6)
            android.widget.TextView r5 = r14.launchPreparePercent
            r6 = 8388613(0x800005, float:1.175495E-38)
            r5.setGravity(r6)
            android.widget.TextView r5 = r14.launchPreparePercent
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r6.<init>(r9, r9)
            r15.addView(r5, r6)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r8, r9)
            r3.addView(r15, r5)
            android.widget.ProgressBar r15 = new android.widget.ProgressBar
            r5 = 0
            r6 = 16842872(0x1010078, float:2.3693894E-38)
            r15.<init>(r14, r5, r6)
            r14.launchPrepareProgress = r15
            r15.setIndeterminate(r1)
            android.widget.ProgressBar r15 = r14.launchPrepareProgress
            r5 = 100
            r15.setMax(r5)
            android.widget.ProgressBar r15 = r14.launchPrepareProgress
            r15.setProgress(r10)
            android.widget.ProgressBar r15 = r14.launchPrepareProgress
            r14.tintProgressBar(r15)
            android.widget.ProgressBar r15 = r14.launchPrepareProgress
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r8, r9)
            r3.addView(r15, r5)
            android.widget.TextView r15 = new android.widget.TextView
            r15.<init>(r14)
            java.lang.String r5 = "Please keep this screen open and do not press Play again. The next launch should be much faster."
            r15.setText(r5)
            r15.setTextSize(r12)
            r15.setTextColor(r7)
            int r4 = r14.dp(r4)
            r15.setPadding(r10, r4, r10, r10)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r4.<init>(r8, r9)
            r3.addView(r15, r4)
            androidx.appcompat.app.AlertDialog$Builder r15 = new androidx.appcompat.app.AlertDialog$Builder
            r15.<init>(r14)
            androidx.appcompat.app.AlertDialog$Builder r15 = r15.setView(r0)
            androidx.appcompat.app.AlertDialog$Builder r15 = r15.setCancelable(r10)
            androidx.appcompat.app.AlertDialog r15 = r15.create()
            r14.launchPrepareDialog = r15
            r15.show()
            androidx.appcompat.app.AlertDialog r15 = r14.launchPrepareDialog
            r14.styleLaunchPrepareDialogChrome(r15)
            r14.updateLaunchPrepareProgress(r1, r2)
            return
    }

    private void showSelectedInstanceFolder() {
            r3 = this;
            ca.dnamobile.javalauncher.instance.LauncherInstance r0 = r3.selectedInstance
            if (r0 != 0) goto Lf
            int r0 = ca.dnamobile.javalauncher.R.string.hint_select_instance
            r1 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r1)
            r0.show()
            return
        Lf:
            java.io.File r0 = r0.getGameDirectory()
            java.lang.String r0 = r0.getAbsolutePath()
            int r1 = ca.dnamobile.javalauncher.R.string.msg_instance_folder_location
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r1 = r3.getString(r1, r2)
            r3.setStatus(r1)
            r1 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r1)
            r0.show()
            return
    }

    private void showSignOutConfirmationDialog() {
            r3 = this;
            androidx.appcompat.app.AlertDialog$Builder r0 = new androidx.appcompat.app.AlertDialog$Builder
            r0.<init>(r3)
            int r1 = ca.dnamobile.javalauncher.R.string.sign_out_confirm_title
            androidx.appcompat.app.AlertDialog$Builder r0 = r0.setTitle(r1)
            int r1 = ca.dnamobile.javalauncher.R.string.sign_out_confirm_message
            androidx.appcompat.app.AlertDialog$Builder r0 = r0.setMessage(r1)
            r1 = 17039360(0x1040000, float:2.424457E-38)
            r2 = 0
            androidx.appcompat.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            int r1 = ca.dnamobile.javalauncher.R.string.button_sign_out
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda35 r2 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda35
            r2.<init>(r3)
            androidx.appcompat.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)
            r0.show()
            return
    }

    private void showStorageLocationsDialog() {
            r1 = this;
            ca.dnamobile.javalauncher.launcher.JavaLaunch$5 r0 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$5
            r0.<init>(r1)
            ca.dnamobile.javalauncher.storage.StorageLocationDialog.show(r1, r0)
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

    private void startGameActivity(ca.dnamobile.javalauncher.instance.LauncherInstance r3) {
            r2 = this;
            java.lang.String r0 = r3.getId()
            ca.dnamobile.javalauncher.settings.LauncherPreferences.recordInstancePlayed(r2, r0)
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<ca.dnamobile.javalauncher.GameActivity> r1 = ca.dnamobile.javalauncher.GameActivity.class
            r0.<init>(r2, r1)
            boolean r1 = r3.isIsolated()
            if (r1 == 0) goto L19
            java.lang.String r3 = r3.getName()
            goto L1d
        L19:
            java.lang.String r3 = r3.getBaseVersionId()
        L1d:
            java.lang.String r1 = "ca.dnamobile.javalauncher.extra.VERSION_ID"
            r0.putExtra(r1, r3)
            r2.startActivity(r0)
            return
    }

    private void startOrUpdateInstallForegroundService(boolean r4) {
            r3 = this;
            boolean r0 = r3.installSessionActive
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.CheckBox r0 = r3.installDialogForegroundCheck
            if (r0 == 0) goto L10
            boolean r0 = r0.isChecked()
            if (r0 != 0) goto L10
            return
        L10:
            boolean r0 = ca.dnamobile.javalauncher.notifications.LauncherNotificationPermissionHelper.isBackgroundInstallNotificationsEnabled(r3)
            if (r0 != 0) goto L17
            return
        L17:
            boolean r0 = ca.dnamobile.javalauncher.notifications.LauncherNotificationPermissionHelper.hasPostNotificationsPermission(r3)
            if (r0 != 0) goto L28
            boolean r4 = r3.installPermissionPromptShownThisSession
            if (r4 != 0) goto L27
            r4 = 1
            r3.installPermissionPromptShownThisSession = r4
            r3.requestNotificationPermissionIfPossible()
        L27:
            return
        L28:
            java.lang.String r0 = r3.activeInstallTitle
            java.lang.String r1 = r3.activeInstallMessage
            int r2 = r3.activeInstallProgress
            ca.dnamobile.javalauncher.installation.InstallationForegroundService.update(r3, r0, r1, r2, r4)
            return
    }

    private void startOrUpdateInstallForegroundServiceThrottled(boolean r7) {
            r6 = this;
            long r0 = android.os.SystemClock.uptimeMillis()
            if (r7 != 0) goto L24
            int r2 = r6.activeInstallProgress
            if (r2 <= 0) goto L24
            r3 = 100
            if (r2 >= r3) goto L24
            int r3 = r6.lastInstallNotificationProgress
            int r2 = r2 - r3
            int r2 = java.lang.Math.abs(r2)
            r3 = 2
            if (r2 >= r3) goto L24
            long r2 = r6.lastInstallNotificationUpdateMs
            long r2 = r0 - r2
            r4 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L23
            goto L24
        L23:
            return
        L24:
            r6.lastInstallNotificationUpdateMs = r0
            int r0 = r6.activeInstallProgress
            r6.lastInstallNotificationProgress = r0
            r6.startOrUpdateInstallForegroundService(r7)
            return
    }

    private void styleLaunchPrepareDialogChrome(androidx.appcompat.app.AlertDialog r3) {
            r2 = this;
            android.view.Window r3 = r3.getWindow()
            if (r3 != 0) goto L7
            return
        L7:
            int r0 = ca.dnamobile.javalauncher.launcher.JavaLaunch.COLOR_DIALOG_BG
            r1 = 22
            android.graphics.drawable.GradientDrawable r0 = r2.roundedDrawable(r0, r0, r1)
            r3.setBackgroundDrawable(r0)
            r0 = 1058306785(0x3f147ae1, float:0.58)
            r3.setDimAmount(r0)
            return
    }

    private void styleMainActionButton(android.view.View r2, java.lang.String r3, int r4) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.material.button.MaterialButton
            if (r0 == 0) goto L2b
            com.google.android.material.button.MaterialButton r2 = (com.google.android.material.button.MaterialButton) r2
            r2.setText(r3)
            r3 = 1
            r2.setSingleLine(r3)
            r3 = 0
            r2.setAllCaps(r3)
            r2.setIconResource(r4)
            r3 = 2
            r2.setIconGravity(r3)
            r3 = 1090519040(0x41000000, float:8.0)
            int r3 = r1.dp(r3)
            r2.setIconPadding(r3)
            r3 = 1110441984(0x42300000, float:44.0)
            int r3 = r1.dp(r3)
            r2.setMinHeight(r3)
            return
        L2b:
            boolean r4 = r2 instanceof android.widget.TextView
            if (r4 == 0) goto L34
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.setText(r3)
        L34:
            return
    }

    private void syncSelectedStorageMirrorToTree(ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.InstallProgressListener r3) throws java.lang.Exception {
            r2 = this;
            boolean r0 = ca.dnamobile.javalauncher.storage.StorageLocationStore.isSelectedScopedStorage(r2)
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 98
            java.lang.String r1 = "Saving files to selected folder..."
            r3.onProgress(r0, r1)
            ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda44 r0 = new ca.dnamobile.javalauncher.launcher.JavaLaunch$$ExternalSyntheticLambda44
            r0.<init>(r3)
            ca.dnamobile.javalauncher.storage.StorageLocationStore.syncSelectedMirrorToTree(r2, r0)
            return
    }

    private void tintProgressBar(android.widget.ProgressBar r3) {
            r2 = this;
            int r0 = ca.dnamobile.javalauncher.launcher.JavaLaunch.COLOR_ACCENT
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r0)
            r3.setProgressTintList(r1)
            int r1 = ca.dnamobile.javalauncher.launcher.JavaLaunch.COLOR_CARD_STROKE
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r3.setProgressBackgroundTintList(r1)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r3.setIndeterminateTintList(r0)
            return
    }

    private void updateAccountStatus(ca.dnamobile.javalauncher.data.AccountStore.Account r6) {
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = r0
        L6:
            r5.updateMainContentButtonVisibility(r1)
            r5.updateMainPlayerHead(r6, r1)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r2 = r5.binding
            com.google.android.material.button.MaterialButton r2 = r2.buttonSignIn
            r3 = 8
            if (r1 == 0) goto L16
            r4 = r3
            goto L17
        L16:
            r4 = r0
        L17:
            r2.setVisibility(r4)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r2 = r5.binding
            com.google.android.material.button.MaterialButton r2 = r2.buttonSignIn
            r4 = r1 ^ 1
            r2.setEnabled(r4)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r2 = r5.binding
            com.google.android.material.button.MaterialButton r2 = r2.buttonSignOut
            if (r1 == 0) goto L2a
            goto L2b
        L2a:
            r0 = r3
        L2b:
            r2.setVisibility(r0)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r5.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonSignOut
            r0.setEnabled(r1)
            if (r6 != 0) goto L51
            boolean r6 = r5.hasCompletedMicrosoftLoginOnce()
            if (r6 == 0) goto L47
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r6 = r5.binding
            android.widget.TextView r6 = r6.textAccountStatus
            int r0 = ca.dnamobile.javalauncher.R.string.status_signed_out_offline_unlocked
            r6.setText(r0)
            goto L50
        L47:
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r6 = r5.binding
            android.widget.TextView r6 = r6.textAccountStatus
            int r0 = ca.dnamobile.javalauncher.R.string.status_signed_out
            r6.setText(r0)
        L50:
            return
        L51:
            java.lang.String r0 = r6.displayName
            boolean r1 = isNullOrBlank(r0)
            if (r1 == 0) goto L5b
            java.lang.String r0 = r6.minecraftName
        L5b:
            boolean r1 = isNullOrBlank(r0)
            if (r1 == 0) goto L63
            java.lang.String r0 = r6.email
        L63:
            boolean r6 = isNullOrBlank(r0)
            if (r6 == 0) goto L6b
            java.lang.String r0 = "Microsoft Player"
        L6b:
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r6 = r5.binding
            android.widget.TextView r6 = r6.textAccountStatus
            int r1 = ca.dnamobile.javalauncher.R.string.status_signed_in
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r5.getString(r1, r0)
            r6.setText(r0)
            return
    }

    private void updateInstallDialog(int r3, java.lang.String r4) {
            r2 = this;
            android.widget.TextView r0 = r2.installDialogMessage
            if (r0 == 0) goto L7
            r0.setText(r4)
        L7:
            android.widget.ProgressBar r4 = r2.installDialogProgress
            if (r4 == 0) goto L1e
            r0 = 0
            r4.setIndeterminate(r0)
            android.widget.ProgressBar r4 = r2.installDialogProgress
            r1 = 100
            int r3 = java.lang.Math.min(r1, r3)
            int r3 = java.lang.Math.max(r0, r3)
            r4.setProgress(r3)
        L1e:
            return
    }

    private void updateInstallProgress(int r4, java.lang.String r5) {
            r3 = this;
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r3.binding
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 100
            int r4 = java.lang.Math.min(r0, r4)
            r1 = 0
            int r4 = java.lang.Math.max(r1, r4)
            r3.activeInstallProgress = r4
            r3.activeInstallMessage = r5
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r2 = r3.binding
            android.widget.ProgressBar r2 = r2.progressVersions
            r2.setIndeterminate(r1)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r2 = r3.binding
            android.widget.ProgressBar r2 = r2.progressVersions
            r2.setMax(r0)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r3.binding
            android.widget.ProgressBar r0 = r0.progressVersions
            r0.setProgress(r4)
            r3.updateInstallDialog(r4, r5)
            r3.setStatus(r5)
            boolean r4 = r3.installSessionActive
            if (r4 == 0) goto L36
            r3.startOrUpdateInstallForegroundServiceThrottled(r1)
        L36:
            return
    }

    private void updateLaunchPrepareProgress(int r3, java.lang.String r4) {
            r2 = this;
            java.lang.String r0 = r4.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            java.lang.String r4 = "Preparing game files..."
            goto L11
        Ld:
            java.lang.String r4 = r4.trim()
        L11:
            android.widget.TextView r0 = r2.launchPrepareMessage
            if (r0 == 0) goto L18
            r0.setText(r4)
        L18:
            android.widget.TextView r4 = r2.launchPreparePercent
            r0 = 100
            if (r4 == 0) goto L2b
            if (r3 < r0) goto L26
            java.lang.String r1 = "Done"
            r4.setText(r1)
            goto L2b
        L26:
            java.lang.String r1 = "Loading..."
            r4.setText(r1)
        L2b:
            android.widget.ProgressBar r4 = r2.launchPrepareProgress
            if (r4 == 0) goto L3f
            if (r3 < r0) goto L3b
            r3 = 0
            r4.setIndeterminate(r3)
            android.widget.ProgressBar r3 = r2.launchPrepareProgress
            r3.setProgress(r0)
            goto L3f
        L3b:
            r3 = 1
            r4.setIndeterminate(r3)
        L3f:
            return
    }

    private void updateMainContentButtonVisibility(boolean r5) {
            r4 = this;
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r4.binding
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r0 = "buttonBrowseContentMain"
            java.lang.String r1 = "browse_content_main_button_dynamic"
            android.view.View r0 = r4.findMainActionButton(r0, r1)
            r1 = 0
            r2 = 8
            if (r0 == 0) goto L1d
            if (r5 == 0) goto L16
            r3 = r1
            goto L17
        L16:
            r3 = r2
        L17:
            r0.setVisibility(r3)
            r0.setEnabled(r5)
        L1d:
            java.lang.String r0 = "buttonImportModpackMain"
            java.lang.String r3 = "import_modpack_main_button_dynamic"
            android.view.View r0 = r4.findMainActionButton(r0, r3)
            if (r0 == 0) goto L31
            if (r5 == 0) goto L2a
            goto L2b
        L2a:
            r1 = r2
        L2b:
            r0.setVisibility(r1)
            r0.setEnabled(r5)
        L31:
            return
    }

    private void updateMainPlayerHead(ca.dnamobile.javalauncher.data.AccountStore.Account r3, boolean r4) {
            r2 = this;
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r2.binding
            if (r0 == 0) goto L41
            android.widget.ImageView r0 = r0.imageMainPlayerHead
            if (r0 != 0) goto L9
            goto L41
        L9:
            r2.ensureMainPlayerHeadBesideShareLogs()
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r2.binding
            android.widget.ImageView r0 = r0.imageMainPlayerHead
            r1 = 0
            r0.setVisibility(r1)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r2.binding
            android.widget.ImageView r0 = r0.imageMainPlayerHead
            r1 = 0
            ca.dnamobile.javalauncher.skin.PlayerHeadLoader.loadInto(r2, r0, r3, r1)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r3 = r2.binding
            android.widget.ImageView r3 = r3.imageMainPlayerHead
            if (r4 == 0) goto L25
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L28
        L25:
            r0 = 1058977874(0x3f1eb852, float:0.62)
        L28:
            r3.setAlpha(r0)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r3 = r2.binding
            android.widget.ImageView r3 = r3.imageMainPlayerHead
            if (r4 == 0) goto L38
            int r4 = ca.dnamobile.javalauncher.R.string.main_player_head_signed_in
            java.lang.String r4 = r2.getString(r4)
            goto L3e
        L38:
            int r4 = ca.dnamobile.javalauncher.R.string.main_player_head_signed_out
            java.lang.String r4 = r2.getString(r4)
        L3e:
            r3.setContentDescription(r4)
        L41:
            return
    }

    private void updateRenderSurfaceSwitchText(boolean r2) {
            r1 = this;
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r1.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchUseNativeSurface
            if (r2 == 0) goto L9
            int r2 = ca.dnamobile.javalauncher.R.string.render_surface_surface_view
            goto Lb
        L9:
            int r2 = ca.dnamobile.javalauncher.R.string.render_surface_texture_view
        Lb:
            r0.setText(r2)
            return
    }

    private void updateSelectedInstanceCard() {
            r5 = this;
            ca.dnamobile.javalauncher.instance.LauncherInstance r0 = r5.selectedInstance
            if (r0 != 0) goto L1d
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r5.binding
            android.widget.TextView r0 = r0.textSelectedVersion
            int r1 = ca.dnamobile.javalauncher.R.string.selected_instance_empty
            r0.setText(r1)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r5.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonLaunchVersion
            r1 = 0
            r0.setEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r5.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonOpenFolder
            r0.setEnabled(r1)
            return
        L1d:
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r5.binding
            android.widget.TextView r0 = r0.textSelectedVersion
            int r1 = ca.dnamobile.javalauncher.R.string.selected_instance_value
            ca.dnamobile.javalauncher.instance.LauncherInstance r2 = r5.selectedInstance
            java.lang.String r2 = r2.getName()
            ca.dnamobile.javalauncher.instance.LauncherInstance r3 = r5.selectedInstance
            java.lang.String r3 = r3.getLoader()
            ca.dnamobile.javalauncher.instance.LauncherInstance r4 = r5.selectedInstance
            java.lang.String r4 = r4.getMinecraftVersionId()
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4}
            java.lang.String r1 = r5.getString(r1, r2)
            r0.setText(r1)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r5.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonLaunchVersion
            r1 = 1
            r0.setEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r5.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonOpenFolder
            r0.setEnabled(r1)
            return
    }

    private void updateSharedInstallsSwitchText(boolean r2) {
            r1 = this;
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r1.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchShowSharedInstalls
            if (r2 == 0) goto L9
            int r2 = ca.dnamobile.javalauncher.R.string.shared_installs_show
            goto Lb
        L9:
            int r2 = ca.dnamobile.javalauncher.R.string.shared_installs_hide
        Lb:
            r0.setText(r2)
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int r3, int r4, android.content.Intent r5) {
            r2 = this;
            super.onActivityResult(r3, r4, r5)
            boolean r0 = r2.appIntegrityBlocked
            if (r0 != 0) goto L8c
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r2.binding
            if (r0 != 0) goto Ld
            goto L8c
        Ld:
            r0 = 8033(0x1f61, float:1.1257E-41)
            r1 = -1
            if (r3 != r0) goto L24
            if (r4 != r1) goto L23
            if (r5 == 0) goto L23
            android.net.Uri r3 = r5.getData()
            if (r3 == 0) goto L23
            android.net.Uri r3 = r5.getData()
            r2.importModpackFromUri(r3)
        L23:
            return
        L24:
            r0 = 8032(0x1f60, float:1.1255E-41)
            if (r3 != r0) goto L62
            if (r4 != r1) goto L61
            if (r5 == 0) goto L61
            android.net.Uri r3 = r5.getData()
            if (r3 != 0) goto L33
            goto L61
        L33:
            android.net.Uri r3 = r5.getData()
            int r4 = r5.getFlags()
            r4 = r4 & 3
            android.content.ContentResolver r5 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L44
            r5.takePersistableUriPermission(r3, r4)     // Catch: java.lang.Throwable -> L44
        L44:
            ca.dnamobile.javalauncher.storage.StorageLocation r3 = ca.dnamobile.javalauncher.storage.StorageLocationStore.addTreeUri(r2, r3)
            java.lang.String r4 = r3.getId()
            ca.dnamobile.javalauncher.storage.StorageLocationStore.setSelectedLocationId(r2, r4)
            int r4 = ca.dnamobile.javalauncher.R.string.storage_location_added
            java.lang.String r3 = r3.getDisplayName()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r3 = r2.getString(r4, r3)
            r4 = 0
            r2.refreshAfterStorageLocationChange(r3, r4)
        L61:
            return
        L62:
            r0 = 8021(0x1f55, float:1.124E-41)
            if (r3 != r0) goto L8c
            if (r4 != r1) goto L8c
            if (r5 == 0) goto L8c
            android.net.Uri r3 = r5.getData()
            if (r3 != 0) goto L71
            goto L8c
        L71:
            android.net.Uri r3 = r5.getData()
            android.content.ContentResolver r4 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L7d
            r5 = 1
            r4.takePersistableUriPermission(r3, r5)     // Catch: java.lang.Throwable -> L7d
        L7d:
            ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog r4 = r2.createInstanceDialog
            if (r4 == 0) goto L8c
            boolean r4 = r4.isShowing()
            if (r4 == 0) goto L8c
            ca.dnamobile.javalauncher.ui.instance.CreateInstanceDialog r4 = r2.createInstanceDialog
            r4.setIconUri(r3)
        L8c:
            return
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            super.onConfigurationChanged(r2)
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r2 = r1.binding
            if (r2 == 0) goto L22
            androidx.recyclerview.widget.RecyclerView r2 = r2.recyclerVersions
            androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r2.getLayoutManager()
            boolean r2 = r2 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r2 == 0) goto L22
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r2 = r1.binding
            androidx.recyclerview.widget.RecyclerView r2 = r2.recyclerVersions
            androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r2.getLayoutManager()
            androidx.recyclerview.widget.GridLayoutManager r2 = (androidx.recyclerview.widget.GridLayoutManager) r2
            int r0 = r1.getInstanceGridSpanCount()
            r2.setSpanCount(r0)
        L22:
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)
            boolean r1 = ca.dnamobile.javalauncher.controls.ControlsMain.blockIfInvalidSignature(r0)
            r0.appIntegrityBlocked = r1
            if (r1 == 0) goto Lc
            return
        Lc:
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r0)
            java.lang.String r1 = "all"
            java.lang.String r1 = ca.dnamobile.javalauncher.settings.LauncherPreferences.getSelectedInstanceFilter(r0, r1)
            java.lang.String r1 = r0.sanitizeSavedFilter(r1)
            r0.selectedFilter = r1
            android.view.LayoutInflater r1 = r0.getLayoutInflater()
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r1 = ca.dnamobile.javalauncher.databinding.ActivityMainBinding.inflate(r1)
            r0.binding = r1
            android.widget.FrameLayout r1 = r1.getRoot()
            r0.setContentView(r1)
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r0)
            r0.registerNotificationPermissionLauncher()
            r0.setupAccountUi()
            r0.setupInstanceUi()
            r1 = 0
            r0.refreshInstancesAndRebind(r1)
            r0.loadVersions(r1)
            r0.maybeShowRequiredLegalAcceptanceDialog()
            return
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
            r2 = this;
            boolean r0 = r2.installSessionActive
            if (r0 == 0) goto Ld
            android.view.Window r0 = r2.getWindow()
            r1 = 128(0x80, float:1.8E-43)
            r0.clearFlags(r1)
        Ld:
            r2.dismissLaunchPrepareDialog()
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal r0 = r2.authManager
            if (r0 == 0) goto L1f
            boolean r0 = r2.isChangingConfigurations()
            if (r0 != 0) goto L1f
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal r0 = r2.authManager
            r0.dispose()
        L1f:
            android.os.Handler r0 = r2.mainHandler
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            super.onDestroy()
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
            r1 = this;
            super.onResume()
            boolean r0 = r1.appIntegrityBlocked
            if (r0 != 0) goto L1d
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r1.binding
            if (r0 != 0) goto Lc
            goto L1d
        Lc:
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r1)
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r1)
            r1.refreshAccountUiFromStore()
            boolean r0 = r1.installSessionActive
            if (r0 != 0) goto L1d
            r0 = 1
            r1.refreshInstancesAndRebind(r0)
        L1d:
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean r2) {
            r1 = this;
            super.onWindowFocusChanged(r2)
            boolean r0 = r1.appIntegrityBlocked
            if (r0 != 0) goto L11
            ca.dnamobile.javalauncher.databinding.ActivityMainBinding r0 = r1.binding
            if (r0 != 0) goto Lc
            goto L11
        Lc:
            if (r2 == 0) goto L11
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r1)
        L11:
            return
    }
}
