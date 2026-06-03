package ca.dnamobile.javalauncher;

/* JADX INFO: loaded from: classes.dex */
public final class LauncherSettingsActivity extends androidx.appcompat.app.AppCompatActivity {
    private static final int COLOR_ACCENT = 0;
    private static final int COLOR_ACCENT_MUTED = 0;
    private static final int COLOR_CARD_BG = 0;
    private static final int COLOR_CARD_BG_PRESSED = 0;
    private static final int COLOR_CARD_STROKE = 0;
    private static final int COLOR_DIALOG_BG = 0;
    private static final int COLOR_TEXT_MUTED = 0;
    private static final int COLOR_TEXT_PRIMARY = 0;
    private static final int COLOR_TEXT_SECONDARY = 0;
    private static final float DIALOG_DIM_NORMAL = 0.58f;
    private static final java.lang.String JAR_EXECUTION_LAST_SUMMARY_KEY = "last_summary";
    private static final java.lang.String JAR_EXECUTION_PREFS = "jar_execution";
    private static final java.lang.String RENDERER_DOWNLOAD_URL = "https://github.com/MobileGL-Dev/MobileGlues-release/releases";
    private static final java.lang.String SETTINGS_DEFAULTS_APPLIED_KEY = "settings_defaults_applied_2026_04_instances";
    private static final java.lang.String SETTINGS_DEFAULTS_PREFS = "launcher_settings_defaults";
    private ca.dnamobile.javalauncher.data.AccountStore accountStore;
    private ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal authManager;
    private final java.util.List<ca.dnamobile.javalauncher.renderer.Driver> availableDrivers;
    private final java.util.List<ca.dnamobile.javalauncher.renderer.RendererInterface> availableRenderers;
    private ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding binding;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> customSkinPickerLauncher;
    private ca.dnamobile.javalauncher.skin.CustomSkinStore customSkinStore;
    private boolean driverSpinnerReady;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> droidBridgeBackupFolderPickerLauncher;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> droidBridgeRestoreZipPickerLauncher;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> jarExecutionPickerLauncher;
    private androidx.activity.result.ActivityResultLauncher<java.lang.String> microphonePermissionLauncher;
    private android.app.AlertDialog microsoftAccountsDialog;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> microsoftSkinPickerLauncher;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> mobileGluesFolderPickerLauncher;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> mouseCursorIconPickerLauncher;
    private androidx.activity.result.ActivityResultLauncher<java.lang.String> notificationPermissionLauncher;
    private android.app.AlertDialog offlineAccountsDialog;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> offlineSkinPickerLauncher;
    private android.widget.TextView pendingOfflineSkinLabel;
    private android.widget.ImageView pendingOfflineSkinPreview;
    private android.net.Uri pendingOfflineSkinUri;
    private int playerModelCapeLoadGeneration;
    private boolean rendererSpinnerReady;
    private volatile boolean runtimeComponentsReinstalling;
    private android.widget.SeekBar sliderHardwareMouseDpiScale;
    private android.widget.TextView textHardwareMouseDpiScale;










    private final class JarGuiCompatibility {
        final java.io.File cacioAndroid;
        final java.io.File cacioDir;
        final java.io.File cacioShared;
        final java.io.File javaExecutable;
        final java.io.File proGradeJar;
        final java.io.File resConfHack;
        final java.io.File sandboxPolicy;
        final /* synthetic */ ca.dnamobile.javalauncher.LauncherSettingsActivity this$0;

        JarGuiCompatibility(ca.dnamobile.javalauncher.LauncherSettingsActivity r1, java.io.File r2, java.io.File r3, java.io.File r4, java.io.File r5, java.io.File r6, java.io.File r7, java.io.File r8) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.javaExecutable = r2
                r0.cacioDir = r3
                r0.resConfHack = r4
                r0.cacioAndroid = r5
                r0.cacioShared = r6
                r0.proGradeJar = r7
                r0.sandboxPolicy = r8
                return
        }

        java.lang.String buildBootClasspath() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.io.File r1 = r2.resConfHack
                java.lang.String r1 = r1.getAbsolutePath()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = java.io.File.pathSeparator
                java.lang.StringBuilder r0 = r0.append(r1)
                java.io.File r1 = r2.cacioAndroid
                java.lang.String r1 = r1.getAbsolutePath()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = java.io.File.pathSeparator
                java.lang.StringBuilder r0 = r0.append(r1)
                java.io.File r1 = r2.cacioShared
                java.lang.String r1 = r1.getAbsolutePath()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    private static final class RuntimeTaskEntry {
        final java.lang.String name;
        final ca.dnamobile.javalauncher.feature.unpack.AbstractUnpackTask task;

        RuntimeTaskEntry(java.lang.String r1, ca.dnamobile.javalauncher.feature.unpack.AbstractUnpackTask r2) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                r0.task = r2
                return
        }
    }

    private interface StyledDialogItemCallback {
        void onItemSelected(int r1);
    }

    /* JADX INFO: renamed from: $r8$lambda$--i3ARIPa5pVfG9YUYHOsrwMhCA, reason: not valid java name */
    public static /* synthetic */ void m258$r8$lambda$i3ARIPa5pVfG9YUYHOsrwMhCA(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.net.Uri r1, java.io.File r2) {
            r0.lambda$startDroidBridgeRestore$69(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$-wM0wkIUUrw3K_kfOsDPsoBLxbI, reason: not valid java name */
    public static /* synthetic */ void m259$r8$lambda$wM0wkIUUrw3K_kfOsDPsoBLxbI(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, ca.dnamobile.javalauncher.data.AccountStore.Account r1, android.content.DialogInterface r2, int r3) {
            r0.lambda$confirmRemoveMicrosoftAccount$110(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$0-dRcYuTnyknw9JiXzZXrLaE5sU, reason: not valid java name */
    public static /* synthetic */ void m260$r8$lambda$0dRcYuTnyknw9JiXzZXrLaE5sU(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.app.AlertDialog r1, android.widget.EditText r2, android.content.DialogInterface r3) {
            r0.lambda$openMemoryInputDialog$103(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$04Rs6FnNgIlut60Knb7heAyq6Vw(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, ca.dnamobile.javalauncher.data.AccountStore.Account r1, android.view.View r2) {
            r0.lambda$buildMicrosoftAccountRow$107(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$0g4PmhQACwkn2RSDLX_WNs1LNCo(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.view.View r1) {
            r0.lambda$setupMemorySettings$101(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$151R3a_3XQOLr1BrXqWBzDbc0ao(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.app.AlertDialog r1, android.content.DialogInterface r2) {
            r0.lambda$showOfflineAccountsDialog$112(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$1XMmtf14LpAjw-YEFD87Ke1gMHs, reason: not valid java name */
    public static /* synthetic */ void m261$r8$lambda$1XMmtf14LpAjwYEFD87Ke1gMHs(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, ca.dnamobile.javalauncher.data.AccountStore.Account r1, android.view.View r2) {
            r0.lambda$buildOfflineAccountRow$116(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$2hGkd1UFCSrAknOpc_VgqgTIwoo(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.widget.EditText r1, android.app.AlertDialog r2, android.view.View r3) {
            r0.lambda$openResolutionScaleInputDialog$37(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$3LHcrzmB6b9Vemy4sRiBg5dYuwU(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.view.View r1) {
            r0.lambda$setupAccountUi$7(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$3zQpNayfrDIY34mqbxLoF1mYqUw(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.widget.CompoundButton r1, boolean r2) {
            r0.lambda$bindForceFullscreenSwitch$34(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$4HejoGIMajqSjCrH-dOD8GCTVc0, reason: not valid java name */
    public static /* synthetic */ void m262$r8$lambda$4HejoGIMajqSjCrHdOD8GCTVc0(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.widget.EditText r1, android.app.AlertDialog r2, android.view.View r3) {
            r0.lambda$openMemoryInputDialog$102(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$4KNh4AMRvYtFh_QoKt9VOgzHvBk(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.app.AlertDialog r1, android.view.View r2) {
            r0.lambda$showMouseCursorIconDialog$50(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$4f3iMEJ8Mza4zNE4aHUYN7TfBLo(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.app.AlertDialog r1, android.view.View r2) {
            r0.lambda$showRuntimeComponentsReinstallDialog$90(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$6DoDTskAXC_0FSlOcDCqNOtD0Y4(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.view.View r1) {
            r0.lambda$setupAccountUi$5(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$6HXdCt3zHwzkoEPuO1xc6HwKWt4(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.view.View r1) {
            r0.lambda$setupRendererSettings$23(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$7NhgpmnkPf0z-qnqEcCgH745D9M, reason: not valid java name */
    public static /* synthetic */ void m263$r8$lambda$7NhgpmnkPf0zqnqEcCgH745D9M(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, ca.dnamobile.javalauncher.data.AccountStore.Account r1, java.io.File r2, ca.dnamobile.javalauncher.skin.SkinModelType r3) {
            r0.lambda$uploadMicrosoftAccountSkin$145(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$7S1kTU5WAAmr6riM5Y7w4y3ltwY(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, int[] r1, java.lang.String[] r2, java.lang.String[] r3, android.widget.ImageView r4, int[] r5, android.widget.RadioGroup r6, int r7) {
            r0.lambda$showMouseCursorIconDialog$49(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static /* synthetic */ void $r8$lambda$7dqbyXESvuXDwm4aWI0qBh3GW1k(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, int r1, java.lang.String r2) {
            r0.lambda$refreshActiveCapeIntoPlayerModel$123(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$8AgXXeNTsu1kj3S3ElZINJhjqLA(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, java.lang.String r1, int r2) {
            r0.lambda$startJarExecution$85(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$8RIAD1yzpVLZJiljdR_wsRFtZwE(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, androidx.activity.result.ActivityResult r1) {
            r0.lambda$registerDroidBridgeRestoreZipPickerLauncher$59(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$8dOVJF7GGwn-aqoUqBrea61vYng, reason: not valid java name */
    public static /* synthetic */ void m264$r8$lambda$8dOVJF7GGwnaqoUqBrea61vYng(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.widget.CompoundButton r1, boolean r2) {
            r0.lambda$setupRendererSettings$26(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$9jRxD3vu_ARi1uu4SXnEDI6pkTI(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, androidx.activity.result.ActivityResult r1) {
            r0.lambda$registerMouseCursorIconPickerLauncher$48(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$9ogL4-a3SrvNZ5Po89daYsoJrZI, reason: not valid java name */
    public static /* synthetic */ void m265$r8$lambda$9ogL4a3SrvNZ5Po89daYsoJrZI(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager.RestoreResult r1) {
            r0.lambda$startDroidBridgeRestore$67(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$Aj5km43RedbEzte1AyAaXAYwT-Y, reason: not valid java name */
    public static /* synthetic */ void m266$r8$lambda$Aj5km43RedbEzte1AyAaXAYwTY(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, java.lang.Boolean r1) {
            r0.lambda$registerMicrophonePermissionLauncher$56(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$BWv3Elk_f4ye8UYR0WNqqA3sj2Y(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.app.AlertDialog r1, ca.dnamobile.javalauncher.data.AccountStore.Account r2, java.lang.String[] r3, android.app.AlertDialog[] r4, android.view.View r5) {
            r0.lambda$showMicrosoftCapePickerDialog$132(r1, r2, r3, r4, r5)
            return
    }

    public static /* synthetic */ void $r8$lambda$C1gWXVM1FX0f_IsnS5cBueLk1RE(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.view.View r1) {
            r0.lambda$setupAccountUi$6(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$CTNYvq-4PewkIqVxRkkJxnGUmNU, reason: not valid java name */
    public static /* synthetic */ void m267$r8$lambda$CTNYvq4PewkIqVxRkkJxnGUmNU(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.view.View r1) {
            r0.lambda$setupControllerSettings$41(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$CU3JhJbv6s9rAFtU1mT-cWqif_Y, reason: not valid java name */
    public static /* synthetic */ void m268$r8$lambda$CU3JhJbv6s9rAFtU1mTcWqif_Y(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.view.View r1) {
            r0.lambda$showEditOfflineAccountDialog$117(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$DeHJNrRq0--URudx-R0o9p4sNtE, reason: not valid java name */
    public static /* synthetic */ void m269$r8$lambda$DeHJNrRq0URudxR0o9p4sNtE(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.view.View r1) {
            r0.lambda$setupRendererSettings$24(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$DnHiuGkglplPKmcB7dwF0d-2ebs, reason: not valid java name */
    public static /* synthetic */ void m270$r8$lambda$DnHiuGkglplPKmcB7dwF0d2ebs(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.app.AlertDialog r1, android.widget.EditText r2, ca.dnamobile.javalauncher.data.AccountStore.Account r3, boolean[] r4, android.content.DialogInterface r5) {
            r0.lambda$showEditOfflineAccountDialog$120(r1, r2, r3, r4, r5)
            return
    }

    public static /* synthetic */ void $r8$lambda$EM73acE6UdMyZli5rVw1ms3O8Ns(ca.dnamobile.javalauncher.LauncherSettingsActivity r0) {
            r0.lambda$setupControllerSettings$39()
            return
    }

    public static /* synthetic */ void $r8$lambda$EgjNd2VE7QxXfAfagVTCpDsybe4(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.widget.CompoundButton r1, boolean r2) {
            r0.lambda$updateMinecraftTouchGestureSettingsUi$46(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$FiiiCf_mA0aOH4UzNKojbaCJvrI(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.app.AlertDialog r1, android.view.View r2) {
            r0.lambda$showOfflineAccountsDialog$111(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$FyKJo0ASdI5pjG_kCVPh2wMolEE(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.content.DialogInterface r1, int r2) {
            r0.lambda$showDroidBridgeRestoreDialog$62(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$GMdd0xPT6E1EmFfr9XjJMRbAzvk(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, ca.dnamobile.javalauncher.data.AccountStore.Account r1, java.lang.Throwable r2) {
            r0.lambda$showChangeMicrosoftCapeDialog$126(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$He8P2iXGUF43XP_vx-yIgTcNh2Y, reason: not valid java name */
    public static /* synthetic */ boolean m271$r8$lambda$He8P2iXGUF43XP_vxyIgTcNh2Y(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.view.View r1, android.view.MotionEvent r2) {
            boolean r0 = r0.lambda$setupRendererSettings$21(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$IADD9g3yq-0iDuooIsLg55rMQKw, reason: not valid java name */
    public static /* synthetic */ void m272$r8$lambda$IADD9g3yq0iDuooIsLg55rMQKw(ca.dnamobile.javalauncher.LauncherSettingsActivity r0) {
            r0.lambda$startRuntimeComponentsReinstall$94()
            return
    }

    public static /* synthetic */ void $r8$lambda$JunhMzwZNRFL2NTT1CL5FMusjVM(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, java.io.File r1, android.content.DialogInterface r2, int r3) {
            r0.lambda$showDroidBridgeBackupDialog$61(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$KQ8VuZR7U5SLf5t0Qr9ziUYogwA(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.content.DialogInterface r1, int r2) {
            r0.lambda$showSignOutConfirmationDialog$11(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$LEDK1mDtq6H7NIoVjQv3uOAfvOY(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.content.DialogInterface r1, int r2) {
            r0.lambda$showSimpleVoiceChatPermissionDeniedDialog$76(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$L_Ll5ZljvEDVA7Wu8_6BVigft6A(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.view.View r1) {
            r0.lambda$setupAccountUi$8(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$Lv9lj7_2RNNz4c88Ryw_YBFetYc(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, androidx.activity.result.ActivityResult r1) {
            r0.lambda$registerMobileGluesFolderPickerLauncher$57(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$MTNmFnVwxHefRPwd2ExSzILV_fg(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.view.View r1) {
            r0.lambda$scrollToSettingsSection$1(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$MTj-q0SG-fq3sN6G5RpAJVSf2Ek, reason: not valid java name */
    public static /* synthetic */ void m273$r8$lambda$MTjq0SGfq3sN6G5RpAJVSf2Ek(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.widget.CompoundButton r1, boolean r2) {
            r0.lambda$setupRendererSettings$27(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$NLW2no84aINZObj19pOu-FosHSY, reason: not valid java name */
    public static /* synthetic */ void m274$r8$lambda$NLW2no84aINZObj19pOuFosHSY(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.widget.CompoundButton r1, boolean r2) {
            r0.lambda$refreshControllerSettingsValues$44(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$NYw1j-WNEyVW14KJs4Q1e9sIx78, reason: not valid java name */
    public static /* synthetic */ void m275$r8$lambda$NYw1jWNEyVW14KJs4Q1e9sIx78(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, java.lang.Runnable r1, java.util.ArrayList r2, java.util.ArrayList r3, android.widget.RadioButton r4, android.widget.LinearLayout r5, android.view.View r6) {
            r0.lambda$addCapeOptionRow$134(r1, r2, r3, r4, r5, r6)
            return
    }

    public static /* synthetic */ void $r8$lambda$O79qCmGNmLA06lm8Vg8IueAbKVE(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.view.View r1) {
            r0.lambda$setupGameDisplaySettings$33(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$P5qPRNqH5ZfR3X3a4XMoAhbil_E(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, ca.dnamobile.javalauncher.data.AccountStore.Account r1, android.view.View r2) {
            r0.lambda$buildOfflineAccountRow$114(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$P83Y4y43q6sgjjUENGosUqV4-oE, reason: not valid java name */
    public static /* synthetic */ void m276$r8$lambda$P83Y4y43q6sgjjUENGosUqV4oE(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, java.lang.String r1, int r2) {
            r0.lambda$refreshActiveCapeIntoPlayerModel$124(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$PYn-ZCppuYJp_G_t5EIxsoEbp0A, reason: not valid java name */
    public static /* synthetic */ void m277$r8$lambda$PYnZCppuYJp_G_t5EIxsoEbp0A(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, java.lang.Throwable r1) {
            r0.lambda$startDroidBridgeRestore$68(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$PbchrNro_iMpCX6BqkPPm6ruCO4(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, int r1) {
            r0.lambda$showVulkanDriverPickerDialog$31(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$PfwRH1aK7zIuhi_4j1PG4WTY4Wg(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, androidx.activity.result.ActivityResult r1) {
            r0.lambda$registerJarExecutionPickerLauncher$81(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$Q-m0uxGaKWGHVYD_6naoEaUz61Y, reason: not valid java name */
    public static /* synthetic */ void m278$r8$lambda$Qm0uxGaKWGHVYD_6naoEaUz61Y(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.view.View r1) {
            r0.lambda$setupAccountUi$3(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$Q1gtDTaMTceU_0TQ6dy4cmA9rGM(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.content.DialogInterface r1) {
            r0.lambda$showEditOfflineAccountDialog$121(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$QclmkY-Lw1d0oGq1ogdCL4qjIK4, reason: not valid java name */
    public static /* synthetic */ void m279$r8$lambda$QclmkYLw1d0oGq1ogdCL4qjIK4(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, java.lang.String r1) {
            r0.lambda$startDroidBridgeBackup$71(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$QyP1l9gwFJsKS057efMvMtSZj3Q(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.app.AlertDialog r1, android.content.DialogInterface r2) {
            r0.lambda$showStyledSingleChoiceDialog$147(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$S67EWvUbZY-x9AKBnBKqkPVi5xk, reason: not valid java name */
    public static /* synthetic */ void m280$r8$lambda$S67EWvUbZYx9AKBnBKqkPVi5xk(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.app.AlertDialog r1, android.view.View r2) {
            r0.lambda$showDownloadRenderersDialog$28(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$SLHYy5Lz6CFdGEarsKKamyUFZ84(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.app.AlertDialog r1, android.content.DialogInterface r2) {
            r0.lambda$showDownloadRenderersDialog$29(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$SMw2P-TWi7EPPz0vo5JfRC2zgcU, reason: not valid java name */
    public static /* synthetic */ void m281$r8$lambda$SMw2PTWi7EPPz0vo5JfRC2zgcU(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.widget.CompoundButton r1, boolean r2) {
            r0.lambda$setupLauncherSettings$78(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$SZGA_E_CBdRK2-DR2sYx837JnbI, reason: not valid java name */
    public static /* synthetic */ void m282$r8$lambda$SZGA_E_CBdRK2DR2sYx837JnbI(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.app.AlertDialog r1, android.widget.EditText r2, android.net.Uri r3, java.lang.String r4, android.content.DialogInterface r5) {
            r0.lambda$confirmExecuteJarFile$84(r1, r2, r3, r4, r5)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$T-PchupC9MKBENDI-Yhe4RYG5hs, reason: not valid java name */
    public static /* synthetic */ void m283$r8$lambda$TPchupC9MKBENDIYhe4RYG5hs(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.view.View r1) {
            r0.lambda$setupRuntimeComponentsReinstallSettings$89(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$TFK1c-_glAYrpnSkuyx_ZDss7pI, reason: not valid java name */
    public static /* synthetic */ void m284$r8$lambda$TFK1c_glAYrpnSkuyx_ZDss7pI(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, ca.dnamobile.javalauncher.data.AccountStore.Account r1, android.view.View r2) {
            r0.lambda$buildOfflineAccountRow$115(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$TMHKobznL9NTFoKcD6zNMC90hv8(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.widget.EditText r1, ca.dnamobile.javalauncher.data.AccountStore.Account r2, boolean[] r3, android.app.AlertDialog r4, android.view.View r5) {
            r0.lambda$showEditOfflineAccountDialog$119(r1, r2, r3, r4, r5)
            return
    }

    public static /* synthetic */ void $r8$lambda$TRyD_e_LBZnYafzsWUS7BX2OsiI(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, ca.dnamobile.javalauncher.data.AccountStore.Account r1, android.view.View r2) {
            r0.lambda$buildMicrosoftAccountRow$109(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$UD3p7C73FTMaB18JAhGKvLZ_V7E(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, java.lang.String[] r1, android.app.AlertDialog r2, int[] r3, android.view.View r4) {
            r0.lambda$showMouseCursorIconDialog$51(r1, r2, r3, r4)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$UKHjSoOAkB-AoIAibGdTjt3RP-c, reason: not valid java name */
    public static /* synthetic */ void m285$r8$lambda$UKHjSoOAkBAoIAibGdTjt3RPc(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.view.View r1) {
            r0.lambda$setupInstanceSettings$16(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$UZYXFaJUmcJHA-enrBKHujkkoD0, reason: not valid java name */
    public static /* synthetic */ void m286$r8$lambda$UZYXFaJUmcJHAenrBKHujkkoD0(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.content.DialogInterface r1, int r2) {
            r0.lambda$showNotificationDeniedSettingsDialog$55(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$V5d16xBo7q7R6GDzmCMDj4y0Yas(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.widget.CompoundButton r1, boolean r2) {
            r0.lambda$updateInstallNotificationSettingsUi$54(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$Voa1lLLtmvxlsYWhuhppa9PacYE(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, java.lang.String r1) {
            r0.lambda$updateRuntimeComponentsReinstallSummary$95(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$WiPG7K_33XHhPw6FxT-19bBfPg0, reason: not valid java name */
    public static /* synthetic */ void m287$r8$lambda$WiPG7K_33XHhPw6FxT19bBfPg0(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.view.View r1) {
            r0.lambda$setupJarExecutionSettings$82(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$WtPoTT41eYW6S68QhOwqvy08IK0(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, java.lang.String r1) {
            r0.lambda$startJarExecution$86(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$WxqrByghD2kvBk6r_MCnd7swSgQ(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.app.AlertDialog r1, android.view.View r2) {
            r0.lambda$showMicrosoftAccountsDialog$104(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$X5OX5z9VZrBLaIz9_qe3WeIwv-U, reason: not valid java name */
    public static /* synthetic */ boolean m288$r8$lambda$X5OX5z9VZrBLaIz9_qe3WeIwvU(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.view.View r1, android.view.MotionEvent r2) {
            boolean r0 = r0.lambda$setupRendererSettings$19(r1, r2)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$XAxuw9SAkVG_dxEo2CzJCjxNQLk(ca.dnamobile.javalauncher.LauncherSettingsActivity r0) {
            r0.lambda$setupControllerSettings$40()
            return
    }

    public static /* synthetic */ void $r8$lambda$XJRcHWzZDGiL1TzW3BAsCGLlKAM(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.view.View r1) {
            r0.lambda$setupRendererSettings$22(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$XQyspwCWLcqGZgPNeW0T4Fpg9Po(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.view.View r1) {
            r0.lambda$setupControllerSettings$43(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$YL7uRoADo6nCyVOV2CBknidaT7A(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.content.DialogInterface r1, int r2) {
            r0.lambda$showChangeMicrosoftSkinDialog$140(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$YXCNBqngV4SEVXeulHfWJ5U0rtk(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, java.lang.Boolean r1) {
            r0.lambda$registerNotificationPermissionLauncher$53(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$YiyMH3pCr3j6L-7Iq8JBCv7VJrU, reason: not valid java name */
    public static /* synthetic */ void m289$r8$lambda$YiyMH3pCr3j6L7Iq8JBCv7VJrU(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.view.View r1) {
            r0.lambda$setupChangeMicrosoftSkinButton$9(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$Z_XMDRi7VnBwah4zNCVASCPiJL8(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, java.lang.String r1, android.net.Uri r2, java.lang.String r3) {
            r0.lambda$startJarExecution$87(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$ZzrEtN4y71k94o2I3hYcNWYNxFg(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, boolean r1, java.lang.String r2, java.lang.String r3, android.view.View r4) {
            r0.lambda$setupLegalLinkButton$100(r1, r2, r3, r4)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$_Dh4Y4M9-LSG2PE1LnQYCIlHLZA, reason: not valid java name */
    public static /* synthetic */ void m290$r8$lambda$_Dh4Y4M9LSG2PE1LnQYCIlHLZA(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, androidx.activity.result.ActivityResult r1) {
            r0.lambda$registerOfflineSkinPickerLauncher$14(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$_FTi6ImqIv89RTlkUBhQLm0e89c(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.widget.CompoundButton r1, boolean r2) {
            r0.lambda$setupInstanceSettings$17(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$_zliCcwQxK_b6gQyByZSpFkOUP8(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.view.View r1) {
            r0.lambda$setupInstanceSettings$15(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$aqomohlOOKHOQXw7mcYOfA3zYeo(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, java.io.File r1, ca.dnamobile.javalauncher.skin.SkinModelType[] r2, android.content.DialogInterface r3, int r4) {
            r0.lambda$showConfirmMicrosoftSkinUploadDialog$142(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void $r8$lambda$bl4IFSNrrj9XZV_8KQmZlAIJMZ4(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, androidx.activity.result.ActivityResult r1) {
            r0.lambda$registerDroidBridgeBackupFolderPickerLauncher$58(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$cHj7kt2vRenG7s2cycBqRGouLiI(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.widget.CompoundButton r1, boolean r2) {
            r0.lambda$setupLauncherSettings$79(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$cQcRX1dt4dbXwwpQJGcqa1kDs0I(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, int r1) {
            r0.lambda$showRendererPickerDialog$30(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$cx9Y3C4pO4782GEAVZniMSZYL1o(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, java.io.File r1, android.net.Uri r2) {
            r0.lambda$startDroidBridgeBackup$74(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$cy60vMluCJxUymwkP4do32fdSVc(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.view.View r1) {
            r0.lambda$setupUpdateCheckerSettings$99(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$cz6k98otDPbTiiziR2diYFOfs-E, reason: not valid java name */
    public static /* synthetic */ void m291$r8$lambda$cz6k98otDPbTiiziR2diYFOfsE(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.widget.CompoundButton r1, boolean r2) {
            r0.lambda$setupInstanceSettings$18(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$d6Hy1iKc-gOMz3ZKfDzJ_qZne3c, reason: not valid java name */
    public static /* synthetic */ void m292$r8$lambda$d6Hy1iKcgOMz3ZKfDzJ_qZne3c(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, java.lang.Throwable r1) {
            r0.lambda$startDroidBridgeBackup$73(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$eI_UJ-nhNSCMHUaFtzGcDVtdvKc, reason: not valid java name */
    public static /* synthetic */ void m293$r8$lambda$eI_UJnhNSCMHUaFtzGcDVtdvKc(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.app.AlertDialog r1, ca.dnamobile.javalauncher.data.AccountStore.Account r2, java.lang.String[] r3, android.app.AlertDialog[] r4, android.content.DialogInterface r5) {
            r0.lambda$showMicrosoftCapePickerDialog$133(r1, r2, r3, r4, r5)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$epvE62hxSvYmITLHNj-a_x5ZM0Q, reason: not valid java name */
    public static /* synthetic */ void m294$r8$lambda$epvE62hxSvYmITLHNja_x5ZM0Q(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.widget.CompoundButton r1, boolean r2) {
            r0.lambda$updateMinecraftTouchGestureSettingsUi$47(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$exnfE0J1gmjqOltw0KTivxtNmYs(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, ca.dnamobile.javalauncher.data.AccountStore.Account r1, android.content.DialogInterface r2, int r3) {
            r0.lambda$confirmDeleteOfflineAccount$122(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$fI7CO7cmuMNapJfhGK0J-jOGh_0, reason: not valid java name */
    public static /* synthetic */ void m295$r8$lambda$fI7CO7cmuMNapJfhGK0JjOGh_0(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, java.lang.String r1) {
            r0.lambda$startDroidBridgeRestore$66(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$fN6rfoy6GPkWsMywEgJu-gshsHY, reason: not valid java name */
    public static /* synthetic */ void m296$r8$lambda$fN6rfoy6GPkWsMywEgJugshsHY(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.widget.CompoundButton r1, boolean r2) {
            r0.lambda$bindAvoidRoundedCornersSwitch$36(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$gJbpH2ey1ZCNztvZj2T1WUaItQk(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, ca.dnamobile.javalauncher.data.AccountStore.Account r1) {
            r0.lambda$showChangeMicrosoftCapeDialog$127(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$gbxSmMRNByr4ZrXO1aa4FzNId98(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.widget.CompoundButton r1, boolean r2) {
            r0.lambda$bindIgnoreDisplayCutoutSwitch$35(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$gkEMyLllu3Frye5mYu77NEZSlTY(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.view.View r1) {
            r0.lambda$setupControllerSettings$42(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$h3lNYfDgheaPS92Gn8I4J9PkI_8(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, boolean[] r1, android.widget.ImageView r2, android.widget.TextView r3, android.view.View r4) {
            r0.lambda$showEditOfflineAccountDialog$118(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void $r8$lambda$hkhIJJKJesgeDVpzD9qeONG_vbo(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.content.DialogInterface r1, int r2) {
            r0.lambda$showDroidBridgeBackupDialog$60(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$iIWjO38Hh7zkTj-uq_6BOfU4uiM, reason: not valid java name */
    public static /* synthetic */ void m297$r8$lambda$iIWjO38Hh7zkTjuq_6BOfU4uiM(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.view.View r1) {
            r0.lambda$setupChangeMicrosoftCapeButton$10(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$ie7mrPbVH-g4ljyWRu-KG-u8QVA, reason: not valid java name */
    public static /* synthetic */ void m298$r8$lambda$ie7mrPbVHg4ljyWRuKGu8QVA(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager.Result r1) {
            r0.lambda$startDroidBridgeBackup$72(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$itf90T3ogCwStKNo0pyI6IO9lqg(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, ca.dnamobile.javalauncher.data.AccountStore.Account r1, ca.dnamobile.javalauncher.skin.MicrosoftCapeService.Profile r2) {
            r0.lambda$showChangeMicrosoftCapeDialog$125(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$ixrFNLD7SN952AQs1Kgp84jprC8(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, java.lang.String r1) {
            r0.lambda$startDroidBridgeBackup$70(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$jw7SBdHRM_aXPizN9hWXLNV71Vc(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.app.AlertDialog r1, android.content.DialogInterface r2) {
            r0.lambda$showMicrosoftAccountsDialog$106(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$kHHCOYb1oRYQmklrHVIOCJ0kI4Q(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.widget.CompoundButton r1, boolean r2) {
            r0.lambda$setupRenderSurfaceSettings$32(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$kMax0e4xsEwg70zPKvU-QtVmShk, reason: not valid java name */
    public static /* synthetic */ void m299$r8$lambda$kMax0e4xsEwg70zPKvUQtVmShk(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, com.google.android.material.switchmaterial.SwitchMaterial r1, android.widget.CompoundButton r2, boolean r3) {
            r0.lambda$setupFloatingGameOverlaySettings$96(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$kubpmh9E81e1mmNul4YMLXUE0fA(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.app.AlertDialog r1, java.lang.String[] r2, int[] r3, android.content.DialogInterface r4) {
            r0.lambda$showMouseCursorIconDialog$52(r1, r2, r3, r4)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$la5hAMObZ-b_u6HAdxoEPFav6fk, reason: not valid java name */
    public static /* synthetic */ void m300$r8$lambda$la5hAMObZb_u6HAdxoEPFav6fk(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.view.View r1) {
            r0.lambda$setupLauncherSettings$80(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$mFiWL7Pddn-98bLRxm7TPJkDtSs, reason: not valid java name */
    public static /* synthetic */ void m301$r8$lambda$mFiWL7Pddn98bLRxm7TPJkDtSs(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.app.AlertDialog r1, android.content.DialogInterface r2) {
            r0.lambda$showMicrosoftAccountsDialog$105(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$mYc1oebcr6gJ135YDWopjHc6hkU(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.net.Uri r1, android.content.DialogInterface r2, int r3) {
            r0.lambda$confirmDroidBridgeRestore$64(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$nzc6wME7wD70PDRjOTMGpimPoxw(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, java.lang.String r1) {
            r0.lambda$updateJarExecutionSummary$88(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$o4Q18tTHvSIQFCJwosPrRkLBNCw(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.widget.CompoundButton r1, boolean r2) {
            r0.lambda$setupLauncherSettings$77(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$oadMZYeagifHxibU-4VyOFoxRXc, reason: not valid java name */
    public static /* synthetic */ void m302$r8$lambda$oadMZYeagifHxibU4VyOFoxRXc(ca.dnamobile.javalauncher.LauncherSettingsActivity r0) {
            r0.lambda$uploadMicrosoftAccountSkin$143()
            return
    }

    public static /* synthetic */ void $r8$lambda$opZbJGXH5M6IO4G4HqrzBtl2S0Y(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, androidx.activity.result.ActivityResult r1) {
            r0.lambda$registerMicrosoftSkinPickerLauncher$13(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$p1wEZ9W2lMIintTU8pfwYv20ixM(ca.dnamobile.javalauncher.LauncherSettingsActivity r0) {
            r0.lambda$startRuntimeComponentsReinstall$92()
            return
    }

    public static /* synthetic */ void $r8$lambda$p6JjWKAHPjCvGKF0sRdhPc6EDVM(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.app.AlertDialog r1, android.content.DialogInterface r2) {
            r0.lambda$showRuntimeComponentsReinstallDialog$91(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$pN70nrmVen-r4UkzMuv6DPy0O8E, reason: not valid java name */
    public static /* synthetic */ void m303$r8$lambda$pN70nrmVenr4UkzMuv6DPy0O8E(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, ca.dnamobile.javalauncher.data.AccountStore.Account r1, android.view.View r2) {
            r0.lambda$buildMicrosoftAccountRow$108(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$qKepJKKbpP_voggncG1vVl4gmJw(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.view.View r1) {
            r0.lambda$setupRendererSettings$20(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$qLTpeN8xyWZjUwk9LojRkmQw2JE(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, java.io.File r1, android.content.DialogInterface r2, int r3) {
            r0.lambda$showDroidBridgeRestoreDialog$63(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$qy6GVL9NhLcZJCnH2-uOPuRtCUo, reason: not valid java name */
    public static /* synthetic */ void m304$r8$lambda$qy6GVL9NhLcZJCnH2uOPuRtCUo(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.view.View r1) {
            r0.lambda$setupAccountUi$2(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$qzTtsj3Tp0RDposCUdE79b0v4tM(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.widget.CompoundButton r1, boolean r2) {
            r0.lambda$setupUpdateCheckerSettings$98(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$r0KJOQx3qH7Rk_mL3TJyNNejhss(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, java.lang.Throwable r1) {
            r0.lambda$uploadMicrosoftAccountSkin$144(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$sxgfDdozx9vC1_7TBxctAHPlMwM(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.app.AlertDialog r1, android.content.DialogInterface r2) {
            r0.lambda$showOfflineAccountsDialog$113(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$tJfWethCl3WWwv8XEqe62MZ1J-w, reason: not valid java name */
    public static /* synthetic */ void m305$r8$lambda$tJfWethCl3WWwv8XEqe62MZ1Jw(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.view.View r1) {
            r0.lambda$setupFloatingGameOverlaySettings$97(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$tl6lwqxpLYEVFPtK4uPkN6F--rc, reason: not valid java name */
    public static /* synthetic */ void m306$r8$lambda$tl6lwqxpLYEVFPtK4uPkN6Frc(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.app.AlertDialog r1, android.widget.EditText r2, android.content.DialogInterface r3) {
            r0.lambda$openResolutionScaleInputDialog$38(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$uX6PInXumCWwP6mak42oKDCy9qE(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.widget.CompoundButton r1, boolean r2) {
            r0.lambda$refreshControllerSettingsValues$45(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$uqPdUrFIIk1purNFXXjG3-w2ybA, reason: not valid java name */
    public static /* synthetic */ void m307$r8$lambda$uqPdUrFIIk1purNFXXjG3w2ybA(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, ca.dnamobile.javalauncher.data.AccountStore.Account r1, java.lang.Throwable r2, java.lang.Runnable r3) {
            r0.lambda$applyMicrosoftCapeSelection$138(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$v24DS_1PhbXcRlxj_gBOegOWIxs(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, java.lang.String r1) {
            r0.lambda$startDroidBridgeRestore$65(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$vh76nH9XOXy4693uvs-CWoS2o4Q, reason: not valid java name */
    public static /* synthetic */ void m308$r8$lambda$vh76nH9XOXy4693uvsCWoS2o4Q(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, java.lang.String r1, ca.dnamobile.javalauncher.data.AccountStore.Account r2, java.lang.Runnable r3, java.lang.Runnable r4) {
            r0.lambda$applyMicrosoftCapeSelection$139(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void $r8$lambda$vtKsDxcHCWx5LM820LrB1IiO20I(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.widget.EditText r1, android.app.AlertDialog r2, android.net.Uri r3, java.lang.String r4, android.view.View r5) {
            r0.lambda$confirmExecuteJarFile$83(r1, r2, r3, r4, r5)
            return
    }

    public static /* synthetic */ void $r8$lambda$wW_SJUEv7ukhFGSwUIik0n0_lTY(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, java.lang.Throwable r1) {
            r0.lambda$startRuntimeComponentsReinstall$93(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$xmbeo7_6xgAD0A6jEvgC1rfVJ-c, reason: not valid java name */
    public static /* synthetic */ void m309$r8$lambda$xmbeo7_6xgAD0A6jEvgC1rfVJc(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.view.View r1) {
            r0.lambda$setupSimpleVoiceChatSettings$75(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$xrH7xA03421rdVcplYUfGZExLgw(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.view.View r1) {
            r0.lambda$setupAccountUi$4(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$xxx98iOd7t2kFj3x31uRQMjMZ-Y, reason: not valid java name */
    public static /* synthetic */ void m310$r8$lambda$xxx98iOd7t2kFj3x31uRQMjMZY(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.view.View r1) {
            r0.lambda$setupRendererSettings$25(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$yCZY6u34LS36hWtWlMmqjqK-Ilc, reason: not valid java name */
    public static /* synthetic */ void m311$r8$lambda$yCZY6u34LS36hWtWlMmqjqKIlc(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, java.lang.String r1, android.widget.ImageView r2) {
            r0.lambda$loadCapePreviewInto$136(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$yeTu6AUJ4tfIKh9q-3onYkg1B5M, reason: not valid java name */
    public static /* synthetic */ void m312$r8$lambda$yeTu6AUJ4tfIKh9q3onYkg1B5M(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.view.View r1) {
            r0.lambda$onCreate$0(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$zGjNmQnK1zUdD-qthj0qN0Uv8dw, reason: not valid java name */
    public static /* synthetic */ void m313$r8$lambda$zGjNmQnK1zUdDqthj0qN0Uv8dw(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, ca.dnamobile.javalauncher.data.AccountStore.Account r1, java.lang.Runnable r2) {
            r0.lambda$applyMicrosoftCapeSelection$137(r1, r2)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$fgetbinding, reason: not valid java name */
    static /* bridge */ /* synthetic */ ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding m314$$Nest$fgetbinding(ca.dnamobile.javalauncher.LauncherSettingsActivity r0) {
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r0.binding
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgetdriverSpinnerReady, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m315$$Nest$fgetdriverSpinnerReady(ca.dnamobile.javalauncher.LauncherSettingsActivity r0) {
            boolean r0 = r0.driverSpinnerReady
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgetrendererSpinnerReady, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m316$$Nest$fgetrendererSpinnerReady(ca.dnamobile.javalauncher.LauncherSettingsActivity r0) {
            boolean r0 = r0.rendererSpinnerReady
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mapplyRendererSelection, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m317$$Nest$mapplyRendererSelection(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, int r1) {
            r0.applyRendererSelection(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mapplyVulkanDriverSelection, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m318$$Nest$mapplyVulkanDriverSelection(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, int r1) {
            r0.applyVulkanDriverSelection(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mmemoryFromSeekBarProgress, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m319$$Nest$mmemoryFromSeekBarProgress(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, int r1) {
            int r0 = r0.memoryFromSeekBarProgress(r1)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mscrollToSettingsSection, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m320$$Nest$mscrollToSettingsSection(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, int r1) {
            r0.scrollToSettingsSection(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mupdateAccountStatus, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m321$$Nest$mupdateAccountStatus(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, ca.dnamobile.javalauncher.data.AccountStore.Account r1) {
            r0.updateAccountStatus(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mupdateChangeMicrosoftCapeButtonState, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m322$$Nest$mupdateChangeMicrosoftCapeButtonState(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, ca.dnamobile.javalauncher.data.AccountStore.Account r1) {
            r0.updateChangeMicrosoftCapeButtonState(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mupdateChangeMicrosoftSkinButtonState, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m323$$Nest$mupdateChangeMicrosoftSkinButtonState(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, ca.dnamobile.javalauncher.data.AccountStore.Account r1) {
            r0.updateChangeMicrosoftSkinButtonState(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mupdateHardwareMouseDpiScaleText, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m324$$Nest$mupdateHardwareMouseDpiScaleText(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, int r1) {
            r0.updateHardwareMouseDpiScaleText(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mupdateHardwareMouseDpiScaleUi, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m325$$Nest$mupdateHardwareMouseDpiScaleUi(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, int r1) {
            r0.updateHardwareMouseDpiScaleUi(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mupdateMemorySlider, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m326$$Nest$mupdateMemorySlider(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, int r1) {
            r0.updateMemorySlider(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mupdateMemoryText, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m327$$Nest$mupdateMemoryText(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, int r1) {
            r0.updateMemoryText(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mupdateMouseCursorIconPreview, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m328$$Nest$mupdateMouseCursorIconPreview(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, android.widget.ImageView r1, java.lang.String r2, int r3) {
            r0.updateMouseCursorIconPreview(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mupdateResolutionScaleText, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m329$$Nest$mupdateResolutionScaleText(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, int r1) {
            r0.updateResolutionScaleText(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mupdateResolutionScaleUi, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m330$$Nest$mupdateResolutionScaleUi(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, int r1) {
            r0.updateResolutionScaleUi(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mupdateSkinUi, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m331$$Nest$mupdateSkinUi(ca.dnamobile.javalauncher.LauncherSettingsActivity r0, ca.dnamobile.javalauncher.data.AccountStore.Account r1) {
            r0.updateSkinUi(r1)
            return
    }

    static {
            r0 = 34
            r1 = 42
            r2 = 30
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_DIALOG_BG = r0
            r0 = 53
            r1 = 38
            r2 = 43
            int r0 = android.graphics.Color.rgb(r1, r2, r0)
            ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_CARD_BG = r0
            r0 = 49
            r1 = 60
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_CARD_BG_PRESSED = r0
            r0 = 61
            r1 = 74
            r2 = 54
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_CARD_STROKE = r0
            r0 = 241(0xf1, float:3.38E-43)
            r1 = 248(0xf8, float:3.48E-43)
            r2 = 238(0xee, float:3.34E-43)
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_TEXT_PRIMARY = r0
            r0 = 204(0xcc, float:2.86E-43)
            r1 = 216(0xd8, float:3.03E-43)
            r2 = 198(0xc6, float:2.77E-43)
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_TEXT_SECONDARY = r0
            r0 = 159(0x9f, float:2.23E-43)
            r1 = 176(0xb0, float:2.47E-43)
            r2 = 150(0x96, float:2.1E-43)
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_TEXT_MUTED = r0
            r0 = 211(0xd3, float:2.96E-43)
            r1 = 128(0x80, float:1.8E-43)
            r2 = 37
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_ACCENT = r0
            r0 = 135(0x87, float:1.89E-43)
            r1 = 110(0x6e, float:1.54E-43)
            r2 = 86
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_ACCENT_MUTED = r0
            return
    }

    public LauncherSettingsActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.availableRenderers = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.availableDrivers = r0
            return
    }

    private void addButtonWithTopMargin(android.widget.LinearLayout r4, android.view.View r5, int r6) {
            r3 = this;
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
            r0.topMargin = r6
            r4.addView(r5, r0)
            return
    }

    private void addCapeOptionRow(android.widget.LinearLayout r14, java.util.ArrayList<android.widget.RadioButton> r15, java.util.ArrayList<android.widget.LinearLayout> r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, boolean r20, java.lang.Runnable r21) {
            r13 = this;
            r7 = r13
            r0 = r20
            android.widget.LinearLayout r8 = new android.widget.LinearLayout
            r8.<init>(r13)
            r1 = 0
            r8.setOrientation(r1)
            r2 = 16
            r8.setGravity(r2)
            r3 = 1115947008(0x42840000, float:66.0)
            int r3 = r13.dp(r3)
            r8.setMinimumHeight(r3)
            r3 = 1094713344(0x41400000, float:12.0)
            int r4 = r13.dp(r3)
            r9 = 1090519040(0x41000000, float:8.0)
            int r5 = r13.dp(r9)
            r6 = 1092616192(0x41200000, float:10.0)
            int r6 = r13.dp(r6)
            int r10 = r13.dp(r9)
            r8.setPadding(r4, r5, r6, r10)
            r4 = 1
            r8.setClickable(r4)
            r8.setFocusable(r4)
            if (r0 == 0) goto L3f
            int r5 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_CARD_BG_PRESSED
            goto L41
        L3f:
            int r5 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_CARD_BG
        L41:
            if (r0 == 0) goto L46
            int r6 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_ACCENT_MUTED
            goto L48
        L46:
            int r6 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_CARD_STROKE
        L48:
            r10 = 14
            android.graphics.drawable.GradientDrawable r5 = r13.roundedDrawable(r5, r6, r10)
            r8.setBackground(r5)
            android.widget.ImageView r5 = new android.widget.ImageView
            r5.<init>(r13)
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.CENTER_CROP
            r5.setScaleType(r6)
            int r6 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_DIALOG_BG
            int r10 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_CARD_STROKE
            r11 = 10
            android.graphics.drawable.GradientDrawable r6 = r13.roundedDrawable(r6, r10, r11)
            r5.setBackground(r6)
            r6 = 1082130432(0x40800000, float:4.0)
            int r10 = r13.dp(r6)
            int r11 = r13.dp(r6)
            int r12 = r13.dp(r6)
            int r6 = r13.dp(r6)
            r5.setPadding(r10, r11, r12, r6)
            boolean r6 = isNullOrBlank(r19)
            if (r6 == 0) goto L89
            int r6 = ca.dnamobile.javalauncher.R.drawable.ic_no_cape_24
            r5.setImageResource(r6)
            goto L8e
        L89:
            r6 = r19
            r13.loadCapePreviewInto(r5, r6)
        L8e:
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r10 = 1109917696(0x42280000, float:42.0)
            int r10 = r13.dp(r10)
            r11 = 1113063424(0x42580000, float:54.0)
            int r11 = r13.dp(r11)
            r6.<init>(r10, r11)
            int r10 = r13.dp(r3)
            r6.rightMargin = r10
            r8.addView(r5, r6)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r13)
            r5.setOrientation(r4)
            r5.setGravity(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r4 = 1065353216(0x3f800000, float:1.0)
            r10 = -2
            r2.<init>(r1, r10, r4)
            r8.addView(r5, r2)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r13)
            r4 = r17
            r2.setText(r4)
            int r4 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_TEXT_PRIMARY
            r2.setTextColor(r4)
            r4 = 1097859072(0x41700000, float:15.0)
            r2.setTextSize(r4)
            android.graphics.Typeface r4 = android.graphics.Typeface.DEFAULT_BOLD
            r2.setTypeface(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r11 = -1
            r4.<init>(r11, r10)
            r5.addView(r2, r4)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r13)
            r4 = r18
            r2.setText(r4)
            int r4 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_TEXT_SECONDARY
            r2.setTextColor(r4)
            r2.setTextSize(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r11, r10)
            r4 = 1073741824(0x40000000, float:2.0)
            int r4 = r13.dp(r4)
            r3.topMargin = r4
            r5.addView(r2, r3)
            android.widget.RadioButton r5 = new android.widget.RadioButton
            r5.<init>(r13)
            r5.setChecked(r0)
            r5.setClickable(r1)
            r5.setFocusable(r1)
            r13.styleDialogRadioButton(r5)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r10, r10)
            r8.addView(r5, r0)
            r3 = r15
            r15.add(r5)
            r4 = r16
            r4.add(r8)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda118 r12 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda118
            r0 = r12
            r1 = r13
            r2 = r21
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.setOnClickListener(r12)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r11, r10)
            int r1 = r13.dp(r9)
            r0.bottomMargin = r1
            r1 = r14
            r14.addView(r8, r0)
            return
    }

    private void addExistingDirectory(java.util.ArrayList<java.lang.String> r2, java.io.File r3) {
            r1 = this;
            if (r3 == 0) goto L16
            boolean r0 = r3.isDirectory()
            if (r0 != 0) goto L9
            goto L16
        L9:
            java.lang.String r3 = r3.getAbsolutePath()
            boolean r0 = r2.contains(r3)
            if (r0 != 0) goto L16
            r2.add(r3)
        L16:
            return
    }

    private void addGuiJarCompatibilityArguments(java.util.ArrayList<java.lang.String> r3, ca.dnamobile.javalauncher.LauncherSettingsActivity.JarGuiCompatibility r4) {
            r2 = this;
            java.lang.String r0 = "-Xint"
            r3.add(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "-Djava.io.tmpdir="
            r0.<init>(r1)
            java.io.File r1 = r2.getCacheDir()
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.add(r0)
            java.lang.String r0 = "-Djava.awt.headless=false"
            r3.add(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "-Dcacio.managed.screensize="
            r0.<init>(r1)
            java.lang.String r1 = r2.getJarGuiCompatibilityScreenSize()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.add(r0)
            java.lang.String r0 = "-Dcacio.font.fontmanager=sun.awt.X11FontManager"
            r3.add(r0)
            java.lang.String r0 = "-Dcacio.font.fontscaler=sun.font.FreetypeFontScaler"
            r3.add(r0)
            java.lang.String r0 = "-Dswing.defaultlaf=javax.swing.plaf.nimbus.NimbusLookAndFeel"
            r3.add(r0)
            java.lang.String r0 = "-Dawt.toolkit=net.java.openjdk.cacio.ctc.CTCToolkit"
            r3.add(r0)
            java.lang.String r0 = "-Djava.awt.graphicsenv=net.java.openjdk.cacio.ctc.CTCGraphicsEnvironment"
            r3.add(r0)
            java.io.File r0 = r4.sandboxPolicy
            if (r0 == 0) goto L74
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "-Djava.security.policy="
            r0.<init>(r1)
            java.io.File r1 = r4.sandboxPolicy
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.add(r0)
            java.lang.String r0 = "-Djava.security.manager=net.sourceforge.prograde.sm.ProGradeJSM"
            r3.add(r0)
        L74:
            java.io.File r0 = r4.proGradeJar
            if (r0 == 0) goto L90
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "-Xbootclasspath/a:"
            r0.<init>(r1)
            java.io.File r1 = r4.proGradeJar
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.add(r0)
        L90:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "-Xbootclasspath/p:"
            r0.<init>(r1)
            java.lang.String r4 = r4.buildBootClasspath()
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            r3.add(r4)
            return
    }

    private void addJava8RuntimeCandidates(java.util.ArrayList<java.io.File> r3, java.io.File r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "runtimes/Internal-8/bin/java"
            r0.<init>(r4, r1)
            r3.add(r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "runtimes/Internal-8/bin/java.real"
            r0.<init>(r4, r1)
            r3.add(r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "runtime/Internal-8/bin/java"
            r0.<init>(r4, r1)
            r3.add(r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "runtime/Internal-8/bin/java.real"
            r0.<init>(r4, r1)
            r3.add(r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "jre-8/bin/java"
            r0.<init>(r4, r1)
            r3.add(r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "Internal-8/bin/java"
            r0.<init>(r4, r1)
            r3.add(r0)
            return
    }

    private void addJavaExecutablesFromRuntimeDirectory(java.util.ArrayList<java.io.File> r6, java.io.File r7) {
            r5 = this;
            if (r7 == 0) goto L36
            boolean r0 = r7.isDirectory()
            if (r0 != 0) goto L9
            goto L36
        L9:
            java.io.File[] r7 = r7.listFiles()
            if (r7 != 0) goto L10
            return
        L10:
            int r0 = r7.length
            r1 = 0
        L12:
            if (r1 >= r0) goto L36
            r2 = r7[r1]
            if (r2 == 0) goto L33
            boolean r3 = r2.isDirectory()
            if (r3 != 0) goto L1f
            goto L33
        L1f:
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "bin/java"
            r3.<init>(r2, r4)
            r6.add(r3)
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "bin/java.real"
            r3.<init>(r2, r4)
            r6.add(r3)
        L33:
            int r1 = r1 + 1
            goto L12
        L36:
            return
    }

    private void addJavaRuntimeCandidates(java.util.ArrayList<java.io.File> r6, java.io.File r7) {
            r5 = this;
            if (r7 != 0) goto L3
            return
        L3:
            r0 = 28
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = "runtimes/Internal-17/bin/java"
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "runtimes/Internal-21/bin/java"
            r4 = 1
            r1[r4] = r2
            r2 = 2
            java.lang.String r4 = "runtimes/Internal-25/bin/java"
            r1[r2] = r4
            r2 = 3
            java.lang.String r4 = "runtimes/Internal-8/bin/java"
            r1[r2] = r4
            r2 = 4
            java.lang.String r4 = "runtimes/Internal-17/bin/java.real"
            r1[r2] = r4
            r2 = 5
            java.lang.String r4 = "runtimes/Internal-21/bin/java.real"
            r1[r2] = r4
            r2 = 6
            java.lang.String r4 = "runtimes/Internal-25/bin/java.real"
            r1[r2] = r4
            r2 = 7
            java.lang.String r4 = "runtimes/Internal-8/bin/java.real"
            r1[r2] = r4
            r2 = 8
            java.lang.String r4 = "runtime/Internal-17/bin/java"
            r1[r2] = r4
            r2 = 9
            java.lang.String r4 = "runtime/Internal-21/bin/java"
            r1[r2] = r4
            r2 = 10
            java.lang.String r4 = "runtime/Internal-25/bin/java"
            r1[r2] = r4
            r2 = 11
            java.lang.String r4 = "runtime/Internal-8/bin/java"
            r1[r2] = r4
            r2 = 12
            java.lang.String r4 = "runtime/java/bin/java"
            r1[r2] = r4
            r2 = 13
            java.lang.String r4 = "runtime/jre/bin/java"
            r1[r2] = r4
            r2 = 14
            java.lang.String r4 = "runtime/jre-17/bin/java"
            r1[r2] = r4
            r2 = 15
            java.lang.String r4 = "runtime/jre-21/bin/java"
            r1[r2] = r4
            r2 = 16
            java.lang.String r4 = "runtime/jre-8/bin/java"
            r1[r2] = r4
            r2 = 17
            java.lang.String r4 = "runtime/jre-25/bin/java"
            r1[r2] = r4
            r2 = 18
            java.lang.String r4 = "jre/bin/java"
            r1[r2] = r4
            r2 = 19
            java.lang.String r4 = "jre-17/bin/java"
            r1[r2] = r4
            r2 = 20
            java.lang.String r4 = "jre-21/bin/java"
            r1[r2] = r4
            r2 = 21
            java.lang.String r4 = "jre-8/bin/java"
            r1[r2] = r4
            r2 = 22
            java.lang.String r4 = "jre-25/bin/java"
            r1[r2] = r4
            r2 = 23
            java.lang.String r4 = "Internal-17/bin/java"
            r1[r2] = r4
            r2 = 24
            java.lang.String r4 = "Internal-21/bin/java"
            r1[r2] = r4
            r2 = 25
            java.lang.String r4 = "Internal-8/bin/java"
            r1[r2] = r4
            r2 = 26
            java.lang.String r4 = "Internal-25/bin/java"
            r1[r2] = r4
            r2 = 27
            java.lang.String r4 = "components/jre/bin/java"
            r1[r2] = r4
        La7:
            if (r3 >= r0) goto Lb6
            r2 = r1[r3]
            java.io.File r4 = new java.io.File
            r4.<init>(r7, r2)
            r6.add(r4)
            int r3 = r3 + 1
            goto La7
        Lb6:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "runtimes"
            r0.<init>(r7, r1)
            r5.addJavaExecutablesFromRuntimeDirectory(r6, r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "runtime"
            r0.<init>(r7, r1)
            r5.addJavaExecutablesFromRuntimeDirectory(r6, r0)
            return
    }

    private void addSettingsSectionTab(int r2) {
            r1 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r1.binding
            com.google.android.material.tabs.TabLayout r0 = r0.settingsSectionTabs
            com.google.android.material.tabs.TabLayout$Tab r0 = r0.newTab()
            r0.setText(r2)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r2 = r1.binding
            com.google.android.material.tabs.TabLayout r2 = r2.settingsSectionTabs
            r2.addTab(r0)
            return
    }

    private void addSettingsSectionTab(java.lang.String r2) {
            r1 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r1.binding
            com.google.android.material.tabs.TabLayout r0 = r0.settingsSectionTabs
            com.google.android.material.tabs.TabLayout$Tab r0 = r0.newTab()
            r0.setText(r2)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r2 = r1.binding
            com.google.android.material.tabs.TabLayout r2 = r2.settingsSectionTabs
            r2.addTab(r0)
            return
    }

    private android.widget.LinearLayout addStyledDialogCard(android.widget.LinearLayout r5) {
            r4 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r4)
            r1 = 1
            r0.setOrientation(r1)
            r1 = 1096810496(0x41600000, float:14.0)
            int r1 = r4.dp(r1)
            r0.setPadding(r1, r1, r1, r1)
            int r1 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_CARD_BG
            int r2 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_CARD_STROKE
            r3 = 18
            android.graphics.drawable.GradientDrawable r1 = r4.roundedDrawable(r1, r2, r3)
            r0.setBackground(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = -1
            r3 = -2
            r1.<init>(r2, r3)
            r2 = 1094713344(0x41400000, float:12.0)
            int r2 = r4.dp(r2)
            r3 = 0
            r1.setMargins(r3, r3, r3, r2)
            r5.addView(r0, r1)
            return r0
    }

    private void addStyledDialogCardTitle(android.widget.LinearLayout r4, java.lang.String r5) {
            r3 = this;
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r3)
            r0.setText(r5)
            r5 = 1099956224(0x41900000, float:18.0)
            r0.setTextSize(r5)
            android.graphics.Typeface r5 = android.graphics.Typeface.DEFAULT_BOLD
            r0.setTypeface(r5)
            int r5 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_TEXT_PRIMARY
            r0.setTextColor(r5)
            r5 = 1090519040(0x41000000, float:8.0)
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

    private void addStyledDialogInfoText(android.widget.LinearLayout r4, java.lang.String r5) {
            r3 = this;
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r3)
            r0.setText(r5)
            r5 = 1095761920(0x41500000, float:13.0)
            r0.setTextSize(r5)
            int r5 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_TEXT_SECONDARY
            r0.setTextColor(r5)
            r5 = 1090519040(0x41000000, float:8.0)
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

    private void addStyledSingleChoiceRow(android.widget.LinearLayout r10, java.lang.String r11, boolean r12, java.lang.Runnable r13) {
            r9 = this;
            java.lang.String r0 = "•"
            boolean r0 = r11.contains(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L18
            java.lang.String r0 = r11.toLowerCase()
            java.lang.String r3 = "plugin"
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L18
            r0 = r1
            goto L19
        L18:
            r0 = r2
        L19:
            java.lang.String r3 = "  •  Plugin"
            java.lang.String r4 = ""
            java.lang.String r11 = r11.replace(r3, r4)
            java.lang.String r3 = " • Plugin"
            java.lang.String r11 = r11.replace(r3, r4)
            java.lang.String r11 = r11.trim()
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r9)
            r3.setOrientation(r2)
            r4 = 16
            r3.setGravity(r4)
            r5 = 1114112000(0x42680000, float:58.0)
            int r5 = r9.dp(r5)
            r3.setMinimumHeight(r5)
            r5 = 1096810496(0x41600000, float:14.0)
            int r5 = r9.dp(r5)
            r6 = 1090519040(0x41000000, float:8.0)
            int r7 = r9.dp(r6)
            r8 = 1092616192(0x41200000, float:10.0)
            int r8 = r9.dp(r8)
            int r6 = r9.dp(r6)
            r3.setPadding(r5, r7, r8, r6)
            r3.setClickable(r1)
            r3.setFocusable(r1)
            if (r12 == 0) goto L65
            int r5 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_CARD_BG_PRESSED
            goto L67
        L65:
            int r5 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_CARD_BG
        L67:
            if (r12 == 0) goto L6c
            int r6 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_ACCENT_MUTED
            goto L6e
        L6c:
            int r6 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_CARD_BG
        L6e:
            r7 = 14
            android.graphics.drawable.GradientDrawable r5 = r9.roundedDrawable(r5, r6, r7)
            r3.setBackground(r5)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r9)
            r5.setOrientation(r1)
            r5.setGravity(r4)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r9)
            r1.setText(r11)
            int r11 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_TEXT_PRIMARY
            r1.setTextColor(r11)
            r11 = 1097859072(0x41700000, float:15.0)
            r1.setTextSize(r11)
            android.graphics.Typeface r11 = android.graphics.Typeface.DEFAULT_BOLD
            r1.setTypeface(r11)
            r1.setSingleLine(r2)
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            r4 = -1
            r6 = -2
            r11.<init>(r4, r6)
            r5.addView(r1, r11)
            if (r0 == 0) goto Lcd
            android.widget.TextView r11 = new android.widget.TextView
            r11.<init>(r9)
            java.lang.String r0 = "Plugin renderer"
            r11.setText(r0)
            int r0 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_ACCENT
            r11.setTextColor(r0)
            r0 = 1094713344(0x41400000, float:12.0)
            r11.setTextSize(r0)
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = r9.dp(r0)
            r11.setPadding(r2, r0, r2, r2)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r4, r6)
            r5.addView(r11, r0)
        Lcd:
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            r0 = 1065353216(0x3f800000, float:1.0)
            r11.<init>(r2, r6, r0)
            r3.addView(r5, r11)
            android.widget.RadioButton r11 = new android.widget.RadioButton
            r11.<init>(r9)
            r11.setChecked(r12)
            r11.setClickable(r2)
            r11.setFocusable(r2)
            r11.setFocusableInTouchMode(r2)
            r9.styleDialogRadioButton(r11)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r12.<init>(r6, r6)
            r3.addView(r11, r12)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda79 r11 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda79
            r11.<init>(r13)
            r3.setOnClickListener(r11)
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            r11.<init>(r4, r6)
            r12 = 1086324736(0x40c00000, float:6.0)
            int r12 = r9.dp(r12)
            r11.setMargins(r2, r2, r2, r12)
            r10.addView(r3, r11)
            return
    }

    private void applyMicrosoftCapeSelection(ca.dnamobile.javalauncher.data.AccountStore.Account r9, java.lang.String r10, java.lang.Runnable r11, java.lang.Runnable r12) {
            r8 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r8.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonChangeMicrosoftCape
            r1 = 0
            r0.setEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r8.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonChangeMicrosoftCape
            int r1 = ca.dnamobile.javalauncher.R.string.microsoft_cape_saving_button
            r0.setText(r1)
            java.lang.Thread r0 = new java.lang.Thread
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda21 r7 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda21
            r1 = r7
            r2 = r8
            r3 = r10
            r4 = r9
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.String r9 = "Microsoft Cape Save"
            r0.<init>(r7, r9)
            r0.start()
            return
    }

    private void applyRendererSelection(int r3) {
            r2 = this;
            if (r3 < 0) goto L2b
            java.util.List<ca.dnamobile.javalauncher.renderer.RendererInterface> r0 = r2.availableRenderers
            int r0 = r0.size()
            if (r3 < r0) goto Lb
            goto L2b
        Lb:
            java.util.List<ca.dnamobile.javalauncher.renderer.RendererInterface> r0 = r2.availableRenderers
            java.lang.Object r3 = r0.get(r3)
            ca.dnamobile.javalauncher.renderer.RendererInterface r3 = (ca.dnamobile.javalauncher.renderer.RendererInterface) r3
            java.lang.String r0 = r3.getUniqueIdentifier()
            ca.dnamobile.javalauncher.settings.LauncherPreferences.setSelectedRendererIdentifier(r2, r0)
            java.lang.String r0 = r3.getUniqueIdentifier()
            r1 = 1
            ca.dnamobile.javalauncher.renderer.Renderers.setCurrentRenderer(r2, r0, r1)
            r2.updateRendererDescription(r3)
            r2.updateRendererPluginButtons(r3)
            r2.updateVulkanDriverSettings(r3)
        L2b:
            return
    }

    private void applySettingsDefaultsOnce() {
            r4 = this;
            java.lang.String r0 = "launcher_settings_defaults"
            r1 = 0
            android.content.SharedPreferences r0 = r4.getSharedPreferences(r0, r1)
            java.lang.String r2 = "settings_defaults_applied_2026_04_instances"
            boolean r3 = r0.getBoolean(r2, r1)
            if (r3 == 0) goto L10
            return
        L10:
            ca.dnamobile.javalauncher.settings.LauncherPreferences.setShowSharedInstalls(r4, r1)
            ca.dnamobile.javalauncher.settings.LauncherPreferences.setRemoveInheritedVanillaAfterLoaderInstall(r4, r1)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r1 = 1
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r2, r1)
            r0.apply()
            return
    }

    private void applyVulkanDriverSelection(int r2) {
            r1 = this;
            if (r2 < 0) goto L1d
            java.util.List<ca.dnamobile.javalauncher.renderer.Driver> r0 = r1.availableDrivers
            int r0 = r0.size()
            if (r2 < r0) goto Lb
            goto L1d
        Lb:
            java.util.List<ca.dnamobile.javalauncher.renderer.Driver> r0 = r1.availableDrivers
            java.lang.Object r2 = r0.get(r2)
            ca.dnamobile.javalauncher.renderer.Driver r2 = (ca.dnamobile.javalauncher.renderer.Driver) r2
            java.lang.String r0 = r2.getName()
            ca.dnamobile.javalauncher.settings.LauncherPreferences.setSelectedVulkanDriverName(r1, r0)
            r1.updateVulkanDriverDescription(r2)
        L1d:
            return
    }

    private void bindAvoidRoundedCornersSwitch() {
            r3 = this;
            boolean r0 = ca.dnamobile.javalauncher.settings.LauncherPreferences.isAvoidRoundedDisplayCorners(r3)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r3.binding
            com.google.android.material.switchmaterial.SwitchMaterial r1 = r1.switchAvoidRoundedCorners
            r2 = 0
            r1.setOnCheckedChangeListener(r2)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r3.binding
            com.google.android.material.switchmaterial.SwitchMaterial r1 = r1.switchAvoidRoundedCorners
            r1.setChecked(r0)
            r3.updateAvoidRoundedCornersSwitchText(r0)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchAvoidRoundedCorners
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda16 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda16
            r1.<init>(r3)
            r0.setOnCheckedChangeListener(r1)
            return
    }

    private void bindForceFullscreenSwitch() {
            r3 = this;
            boolean r0 = ca.dnamobile.javalauncher.settings.LauncherPreferences.isForceFullscreenMode(r3)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r3.binding
            com.google.android.material.switchmaterial.SwitchMaterial r1 = r1.switchForceFullscreenMode
            r2 = 0
            r1.setOnCheckedChangeListener(r2)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r3.binding
            com.google.android.material.switchmaterial.SwitchMaterial r1 = r1.switchForceFullscreenMode
            r1.setChecked(r0)
            r3.updateForceFullscreenSwitchText(r0)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchForceFullscreenMode
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda80 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda80
            r1.<init>(r3)
            r0.setOnCheckedChangeListener(r1)
            return
    }

    private void bindIgnoreDisplayCutoutSwitch() {
            r3 = this;
            boolean r0 = ca.dnamobile.javalauncher.settings.LauncherPreferences.isIgnoreDisplayCutout(r3)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r3.binding
            com.google.android.material.switchmaterial.SwitchMaterial r1 = r1.switchIgnoreDisplayCutout
            r2 = 0
            r1.setOnCheckedChangeListener(r2)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r3.binding
            com.google.android.material.switchmaterial.SwitchMaterial r1 = r1.switchIgnoreDisplayCutout
            r1.setChecked(r0)
            r3.updateIgnoreDisplayCutoutSwitchText(r0)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchIgnoreDisplayCutout
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda0
            r1.<init>(r3)
            r0.setOnCheckedChangeListener(r1)
            return
    }

    private com.google.android.material.button.MaterialButton buildCompactDialogButton(int r4) {
            r3 = this;
            com.google.android.material.button.MaterialButton r0 = new com.google.android.material.button.MaterialButton
            r1 = 0
            int r2 = com.google.android.material.R.attr.materialButtonOutlinedStyle
            r0.<init>(r3, r1, r2)
            r0.setText(r4)
            r4 = 0
            r0.setAllCaps(r4)
            r0.setMinHeight(r4)
            r0.setMinWidth(r4)
            r0.setMinimumHeight(r4)
            r0.setMinimumWidth(r4)
            r0.setInsetTop(r4)
            r0.setInsetBottom(r4)
            r1 = 1094713344(0x41400000, float:12.0)
            int r2 = r3.dp(r1)
            int r1 = r3.dp(r1)
            r0.setPadding(r2, r4, r1, r4)
            return r0
    }

    private java.lang.String buildDefaultJarArguments(java.lang.String r2) {
            r1 = this;
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r0)
            java.lang.String r0 = "fabric-installer"
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L2c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "client -dir \""
            r2.<init>(r0)
            java.io.File r0 = r1.resolveJarExecutionWorkingDirectory()
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r0 = "\""
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
        L2c:
            java.lang.String r2 = ""
            return r2
    }

    private android.view.View buildDialogHeader(int r7, int r8, int r9) {
            r6 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r6)
            r1 = 0
            r0.setOrientation(r1)
            r2 = 16
            r0.setGravity(r2)
            android.widget.ImageView r2 = new android.widget.ImageView
            r2.<init>(r6)
            r2.setImageResource(r7)
            int r7 = ca.dnamobile.javalauncher.R.drawable.bg_player_head_preview
            r2.setBackgroundResource(r7)
            r7 = 1092616192(0x41200000, float:10.0)
            int r3 = r6.dp(r7)
            int r4 = r6.dp(r7)
            int r5 = r6.dp(r7)
            int r7 = r6.dp(r7)
            r2.setPadding(r3, r4, r5, r7)
            android.widget.ImageView$ScaleType r7 = android.widget.ImageView.ScaleType.FIT_CENTER
            r2.setScaleType(r7)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r3 = 1116733440(0x42900000, float:72.0)
            int r4 = r6.dp(r3)
            int r3 = r6.dp(r3)
            r7.<init>(r4, r3)
            r3 = 1098907648(0x41800000, float:16.0)
            int r3 = r6.dp(r3)
            r7.rightMargin = r3
            r0.addView(r2, r7)
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r6)
            r2 = 1
            r7.setOrientation(r2)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = -2
            r3.<init>(r1, r5, r4)
            r0.addView(r7, r3)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r6)
            r1.setText(r8)
            r8 = 16974329(0x10301f9, float:2.4062315E-38)
            r1.setTextAppearance(r8)
            android.graphics.Typeface r8 = r1.getTypeface()
            r1.setTypeface(r8, r2)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r2 = -1
            r8.<init>(r2, r5)
            r7.addView(r1, r8)
            android.widget.TextView r8 = new android.widget.TextView
            r8.<init>(r6)
            r8.setText(r9)
            r9 = 16974342(0x1030206, float:2.4062352E-38)
            r8.setTextAppearance(r9)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r9.<init>(r2, r5)
            r1 = 1082130432(0x40800000, float:4.0)
            int r1 = r6.dp(r1)
            r9.topMargin = r1
            r7.addView(r8, r9)
            return r0
    }

    private android.view.View buildEmptyOfflineAccountCard() {
            r7 = this;
            com.google.android.material.card.MaterialCardView r0 = new com.google.android.material.card.MaterialCardView
            r0.<init>(r7)
            r1 = 1099956224(0x41900000, float:18.0)
            int r2 = r7.dp(r1)
            float r2 = (float) r2
            r0.setRadius(r2)
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = r7.dp(r2)
            float r3 = (float) r3
            r0.setCardElevation(r3)
            int r2 = r7.dp(r2)
            r0.setStrokeWidth(r2)
            r2 = 570425344(0x22000000, float:1.7347235E-18)
            r0.setStrokeColor(r2)
            r2 = -1
            r0.setCardBackgroundColor(r2)
            r3 = 1
            r0.setUseCompatPadding(r3)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r7)
            int r4 = ca.dnamobile.javalauncher.R.string.offline_accounts_empty
            r3.setText(r4)
            r4 = 17
            r3.setGravity(r4)
            int r4 = r7.dp(r1)
            r5 = 1102053376(0x41b00000, float:22.0)
            int r6 = r7.dp(r5)
            int r1 = r7.dp(r1)
            int r5 = r7.dp(r5)
            r3.setPadding(r4, r6, r1, r5)
            r1 = 16974342(0x1030206, float:2.4062352E-38)
            r3.setTextAppearance(r1)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r4 = -2
            r1.<init>(r2, r4)
            r0.addView(r3, r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r2, r4)
            r2 = 1092616192(0x41200000, float:10.0)
            int r2 = r7.dp(r2)
            r1.topMargin = r2
            r0.setLayoutParams(r1)
            return r0
    }

    private java.lang.String buildFriendlyRendererDescription(ca.dnamobile.javalauncher.renderer.RendererInterface r5) {
            r4 = this;
            java.lang.String r0 = r5.getRendererName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r5.getRendererName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r3 = r5.getRendererId()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r3 = r5.getUniqueIdentifier()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r5.getRendererLibrary()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toLowerCase()
            java.lang.String r2 = "mobileglues"
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto Lf8
            java.lang.String r2 = "mobile glues"
            boolean r2 = r1.contains(r2)
            if (r2 == 0) goto L51
            goto Lf8
        L51:
            java.lang.String r2 = "vulkan"
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto Le4
            java.lang.String r2 = "zink"
            boolean r2 = r1.contains(r2)
            if (r2 == 0) goto L63
            goto Le4
        L63:
            java.lang.String r2 = "gl4es"
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto Ld0
            java.lang.String r2 = "opengles"
            boolean r2 = r1.contains(r2)
            if (r2 == 0) goto L74
            goto Ld0
        L74:
            java.lang.String r2 = "virgl"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L90
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r0 = "\nCompatibility renderer for specific devices and setups. Try this if the recommended renderer does not work correctly."
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            return r5
        L90:
            java.lang.String r5 = r5.getRendererDescription()
            if (r5 == 0) goto Lbc
            java.lang.String r1 = r5.trim()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto Lbc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r5 = r5.trim()
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            return r5
        Lbc:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r0 = "\nRuns Minecraft using this renderer."
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            return r5
        Ld0:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r0 = "\nClassic OpenGL ES compatibility renderer. Useful for older Minecraft versions or devices that do not work well with Vulkan."
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            return r5
        Le4:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r0 = "\nUses Vulkan/Zink rendering. Best for devices with strong Vulkan support, and useful for newer Minecraft versions or Vulkan-focused testing."
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            return r5
        Lf8:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r0 = "\nRecommended for most Android devices. Good balance of compatibility and performance for modern Minecraft versions."
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            return r5
    }

    private java.lang.String buildJarArgumentsHint(java.lang.String r3) {
            r2 = this;
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = r3.toLowerCase(r0)
            java.lang.String r0 = "fabric-installer"
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L2c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "client -dir \""
            r3.<init>(r0)
            java.io.File r0 = r2.resolveJarExecutionWorkingDirectory()
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r0 = "\" -mcversion 1.20.1"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
        L2c:
            java.lang.String r0 = "quilt-installer"
            boolean r0 = r3.contains(r0)
            java.lang.String r1 = "\""
            if (r0 == 0) goto L52
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "install client --install-dir \""
            r3.<init>(r0)
            java.io.File r0 = r2.resolveJarExecutionWorkingDirectory()
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            return r3
        L52:
            java.lang.String r0 = "forge"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L71
            java.lang.String r0 = "neoforge"
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L63
            goto L71
        L63:
            java.lang.String r0 = "optifine"
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L6e
            java.lang.String r3 = "Leave empty. OptiFine's installer needs Cacio/Caciocavallo GUI compatibility or a native extractor."
            return r3
        L6e:
            java.lang.String r3 = "Optional command-line arguments for this jar"
            return r3
        L71:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "--installClient \""
            r3.<init>(r0)
            java.io.File r0 = r2.resolveJarExecutionWorkingDirectory()
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            return r3
    }

    private java.lang.String buildJarExecutionFinalSummary(int r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r4 = this;
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r6 = r6.toLowerCase(r0)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r8.toLowerCase(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Jar finished with exit code "
            java.lang.StringBuilder r2 = r1.append(r2)
            java.lang.StringBuilder r2 = r2.append(r5)
            r3 = 46
            r2.append(r3)
            java.lang.String r2 = "headlessexception"
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L6f
            java.lang.String r2 = "java.awt.window"
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L6f
            java.lang.String r2 = "javax.swing"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L39
            goto L6f
        L39:
            java.lang.String r0 = "fabric-installer"
            boolean r6 = r6.contains(r0)
            if (r6 == 0) goto L65
            java.lang.String r6 = r7.trim()
            java.lang.String r7 = "--installClient"
            boolean r6 = r6.startsWith(r7)
            if (r6 == 0) goto L65
            java.lang.String r5 = "\n\nFabric installer does not use --installClient here. Use this syntax instead:\nclient -dir \""
            java.lang.StringBuilder r5 = r1.append(r5)
            java.io.File r6 = r4.resolveJarExecutionWorkingDirectory()
            java.lang.String r6 = r6.getAbsolutePath()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = "\" -mcversion <version>"
            r5.append(r6)
            goto L81
        L65:
            r6 = 134(0x86, float:1.88E-43)
            if (r5 != r6) goto L81
            java.lang.String r5 = "\n\nThe Java VM aborted with exit code 134. DroidBridge now runs jar tools with Internal-17 first and -Xint to avoid the Java 21 inline-cache/JIT crash seen in logcat. Re-test this same jar with this patch."
            r1.append(r5)
            goto L81
        L6f:
            java.lang.String r5 = "\n\nThis jar tried to open a desktop Swing/AWT window. Android cannot display that installer window from DroidBridge. Use a command-line mode if the jar provides one, or add a launcher-native installer/extractor path for this specific jar type."
            r1.append(r5)
            java.lang.String r5 = "optifine"
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L81
            java.lang.String r5 = "\n\nOptiFine's normal installer jar is GUI-first, so this button can execute it but cannot make the Swing installer usable on Android by itself."
            r1.append(r5)
        L81:
            boolean r5 = r8.isEmpty()
            java.lang.String r6 = "\n\n"
            if (r5 != 0) goto L91
            java.lang.StringBuilder r5 = r1.append(r6)
            r5.append(r8)
            goto L9c
        L91:
            int r5 = r1.indexOf(r6)
            if (r5 >= 0) goto L9c
            java.lang.String r5 = "\n\nNo text output was produced. If this was a loader installer jar, it may require command-line arguments or it may be trying to open a desktop GUI that Android cannot show."
            r1.append(r5)
        L9c:
            java.lang.String r5 = r1.toString()
            return r5
    }

    private android.view.View buildMicrosoftAccountRow(ca.dnamobile.javalauncher.data.AccountStore.Account r10, ca.dnamobile.javalauncher.data.AccountStore.Account r11) {
            r9 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r9)
            r1 = 1
            r0.setOrientation(r1)
            r2 = 1096810496(0x41600000, float:14.0)
            int r3 = r9.dp(r2)
            r4 = 1094713344(0x41400000, float:12.0)
            int r5 = r9.dp(r4)
            int r2 = r9.dp(r2)
            int r6 = r9.dp(r4)
            r0.setPadding(r3, r5, r2, r6)
            int r2 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_CARD_BG
            int r3 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_CARD_STROKE
            r5 = 18
            android.graphics.drawable.GradientDrawable r2 = r9.roundedDrawable(r2, r3, r5)
            r0.setBackground(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = -1
            r5 = -2
            r2.<init>(r3, r5)
            int r4 = r9.dp(r4)
            r6 = 0
            r2.setMargins(r6, r6, r6, r4)
            r0.setLayoutParams(r2)
            boolean r11 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAccountRegistry.isSameAccount(r10, r11)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r9)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = r10.getBestDisplayName()
            java.lang.StringBuilder r4 = r4.append(r7)
            if (r11 == 0) goto L5a
            java.lang.String r7 = "  •  Active"
            goto L5c
        L5a:
            java.lang.String r7 = ""
        L5c:
            java.lang.StringBuilder r4 = r4.append(r7)
            java.lang.String r4 = r4.toString()
            r2.setText(r4)
            int r4 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_TEXT_PRIMARY
            r2.setTextColor(r4)
            r4 = 1099431936(0x41880000, float:17.0)
            r2.setTextSize(r4)
            android.graphics.Typeface r4 = android.graphics.Typeface.DEFAULT_BOLD
            r2.setTypeface(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r4.<init>(r3, r5)
            r0.addView(r2, r4)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r9)
            java.lang.String r4 = r10.minecraftUuid
            boolean r4 = isNullOrBlank(r4)
            if (r4 != 0) goto L8e
            java.lang.String r4 = r10.minecraftUuid
            goto L90
        L8e:
            java.lang.String r4 = "No UUID saved"
        L90:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Minecraft: "
            r7.<init>(r8)
            java.lang.String r8 = r10.minecraftName
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r8 = "\nUUID: "
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r4 = r7.append(r4)
            java.lang.String r4 = r4.toString()
            r2.setText(r4)
            int r4 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_TEXT_SECONDARY
            r2.setTextColor(r4)
            r4 = 1095237632(0x41480000, float:12.5)
            r2.setTextSize(r4)
            r4 = 1082130432(0x40800000, float:4.0)
            int r4 = r9.dp(r4)
            r7 = 1090519040(0x41000000, float:8.0)
            int r7 = r9.dp(r7)
            r2.setPadding(r6, r4, r6, r7)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r4.<init>(r3, r5)
            r0.addView(r2, r4)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r9)
            r2.setOrientation(r6)
            r4 = 8388613(0x800005, float:1.175495E-38)
            r2.setGravity(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r4.<init>(r3, r5)
            r0.addView(r2, r4)
            if (r11 == 0) goto Lea
            java.lang.String r3 = "Using"
            goto Lec
        Lea:
            java.lang.String r3 = "Use"
        Lec:
            com.google.android.material.button.MaterialButton r3 = r9.buildSmallAccountButton(r3)
            r11 = r11 ^ r1
            r3.setEnabled(r11)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda25 r11 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda25
            r11.<init>(r9, r10)
            r3.setOnClickListener(r11)
            r2.addView(r3)
            java.lang.String r11 = "Refresh"
            com.google.android.material.button.MaterialButton r11 = r9.buildSmallAccountButton(r11)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda26 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda26
            r1.<init>(r9, r10)
            r11.setOnClickListener(r1)
            r2.addView(r11)
            java.lang.String r11 = "Remove"
            com.google.android.material.button.MaterialButton r11 = r9.buildSmallAccountButton(r11)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda27 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda27
            r1.<init>(r9, r10)
            r11.setOnClickListener(r1)
            r2.addView(r11)
            return r0
    }

    private android.view.View buildOfflineAccountRow(ca.dnamobile.javalauncher.data.AccountStore.Account r17, ca.dnamobile.javalauncher.data.AccountStore.Account r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L1c
            boolean r5 = r18.isOfflineAccount()
            if (r5 == 0) goto L1c
            java.lang.String r5 = r1.accountId
            java.lang.String r2 = r2.accountId
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L1c
            r2 = r4
            goto L1d
        L1c:
            r2 = r3
        L1d:
            com.google.android.material.card.MaterialCardView r5 = new com.google.android.material.card.MaterialCardView
            r5.<init>(r0)
            r6 = 1099956224(0x41900000, float:18.0)
            int r6 = r0.dp(r6)
            float r6 = (float) r6
            r5.setRadius(r6)
            r6 = 1065353216(0x3f800000, float:1.0)
            int r7 = r0.dp(r6)
            float r7 = (float) r7
            r5.setCardElevation(r7)
            int r7 = r0.dp(r6)
            r5.setStrokeWidth(r7)
            if (r2 == 0) goto L43
            r7 = -9909867(0xffffffffff68c995, float:-3.0942757E38)
            goto L45
        L43:
            r7 = 570425344(0x22000000, float:1.7347235E-18)
        L45:
            r5.setStrokeColor(r7)
            r7 = -1
            if (r2 == 0) goto L4f
            r8 = -1443601(0xffffffffffe9f8ef, float:NaN)
            goto L50
        L4f:
            r8 = r7
        L50:
            r5.setCardBackgroundColor(r8)
            r5.setUseCompatPadding(r4)
            android.widget.LinearLayout r8 = new android.widget.LinearLayout
            r8.<init>(r0)
            r8.setOrientation(r3)
            r9 = 16
            r8.setGravity(r9)
            r10 = 1096810496(0x41600000, float:14.0)
            int r11 = r0.dp(r10)
            r12 = 1094713344(0x41400000, float:12.0)
            int r13 = r0.dp(r12)
            int r14 = r0.dp(r10)
            int r15 = r0.dp(r12)
            r8.setPadding(r11, r13, r14, r15)
            android.widget.FrameLayout$LayoutParams r11 = new android.widget.FrameLayout$LayoutParams
            r13 = -2
            r11.<init>(r7, r13)
            r5.addView(r8, r11)
            android.widget.ImageView r11 = new android.widget.ImageView
            r11.<init>(r0)
            r11.setAdjustViewBounds(r4)
            android.widget.ImageView$ScaleType r14 = android.widget.ImageView.ScaleType.FIT_CENTER
            r11.setScaleType(r14)
            int r14 = ca.dnamobile.javalauncher.R.drawable.bg_player_head_preview
            r11.setBackgroundResource(r14)
            r14 = 1082130432(0x40800000, float:4.0)
            int r15 = r0.dp(r14)
            int r12 = r0.dp(r14)
            int r7 = r0.dp(r14)
            int r3 = r0.dp(r14)
            r11.setPadding(r15, r12, r7, r3)
            int r3 = ca.dnamobile.javalauncher.R.drawable.ic_player_head_placeholder
            r11.setImageResource(r3)
            r3 = 0
            ca.dnamobile.javalauncher.skin.PlayerHeadLoader.loadInto(r0, r11, r1, r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r7 = 1114112000(0x42680000, float:58.0)
            int r12 = r0.dp(r7)
            int r7 = r0.dp(r7)
            r3.<init>(r12, r7)
            int r7 = r0.dp(r10)
            r3.rightMargin = r7
            r8.addView(r11, r3)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r0)
            r3.setOrientation(r4)
            r3.setGravity(r9)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r10 = 0
            r7.<init>(r10, r13, r6)
            r8.addView(r3, r7)
            android.widget.TextView r6 = new android.widget.TextView
            r6.<init>(r0)
            java.lang.String r7 = r17.getBestDisplayName()
            r6.setText(r7)
            r7 = 16974331(0x10301fb, float:2.406232E-38)
            r6.setTextAppearance(r7)
            android.graphics.Typeface r7 = r6.getTypeface()
            r6.setTypeface(r7, r4)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r10 = -1
            r7.<init>(r10, r13)
            r3.addView(r6, r7)
            android.widget.TextView r6 = new android.widget.TextView
            r6.<init>(r0)
            boolean r7 = r17.hasOfflineSkin()
            if (r7 == 0) goto L119
            int r7 = ca.dnamobile.javalauncher.R.string.offline_account_row_skin
            java.lang.String r10 = r1.offlineSkinModel
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.String r7 = r0.getString(r7, r10)
            goto L11f
        L119:
            int r7 = ca.dnamobile.javalauncher.R.string.offline_account_row_no_skin
            java.lang.String r7 = r0.getString(r7)
        L11f:
            r6.setText(r7)
            r7 = 16974342(0x1030206, float:2.4062352E-38)
            r6.setTextAppearance(r7)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r11 = -1
            r10.<init>(r11, r13)
            r11 = 1073741824(0x40000000, float:2.0)
            int r11 = r0.dp(r11)
            r10.topMargin = r11
            r3.addView(r6, r10)
            if (r2 == 0) goto L164
            android.widget.TextView r6 = new android.widget.TextView
            r6.<init>(r0)
            int r10 = ca.dnamobile.javalauncher.R.string.offline_account_active_badge
            r6.setText(r10)
            r6.setTextAppearance(r7)
            r7 = -15300023(0xffffffffff168a49, float:-2.0010222E38)
            r6.setTextColor(r7)
            android.graphics.Typeface r7 = r6.getTypeface()
            r6.setTypeface(r7, r4)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r10 = -1
            r7.<init>(r10, r13)
            int r10 = r0.dp(r14)
            r7.topMargin = r10
            r3.addView(r6, r7)
        L164:
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r0)
            r3.setOrientation(r4)
            r3.setGravity(r9)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r6.<init>(r13, r13)
            r7 = 1094713344(0x41400000, float:12.0)
            int r7 = r0.dp(r7)
            r6.leftMargin = r7
            r8.addView(r3, r6)
            if (r2 == 0) goto L184
            int r6 = ca.dnamobile.javalauncher.R.string.offline_account_active_button
            goto L186
        L184:
            int r6 = ca.dnamobile.javalauncher.R.string.offline_account_use
        L186:
            com.google.android.material.button.MaterialButton r6 = r0.buildCompactDialogButton(r6)
            r2 = r2 ^ r4
            r6.setEnabled(r2)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda140 r2 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda140
            r2.<init>(r0, r1)
            r6.setOnClickListener(r2)
            r2 = 0
            r0.addButtonWithTopMargin(r3, r6, r2)
            int r2 = ca.dnamobile.javalauncher.R.string.offline_account_edit_button
            com.google.android.material.button.MaterialButton r2 = r0.buildCompactDialogButton(r2)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda141 r4 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda141
            r4.<init>(r0, r1)
            r2.setOnClickListener(r4)
            r4 = 1086324736(0x40c00000, float:6.0)
            int r6 = r0.dp(r4)
            r0.addButtonWithTopMargin(r3, r2, r6)
            int r2 = ca.dnamobile.javalauncher.R.string.offline_account_delete_button
            com.google.android.material.button.MaterialButton r2 = r0.buildCompactDialogButton(r2)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda142 r6 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda142
            r6.<init>(r0, r1)
            r2.setOnClickListener(r6)
            int r1 = r0.dp(r4)
            r0.addButtonWithTopMargin(r3, r2, r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = -1
            r1.<init>(r2, r13)
            r2 = 1092616192(0x41200000, float:10.0)
            int r2 = r0.dp(r2)
            r1.topMargin = r2
            r5.setLayoutParams(r1)
            return r5
    }

    private java.util.List<ca.dnamobile.javalauncher.LauncherSettingsActivity.RuntimeTaskEntry> buildRuntimeComponentReinstallTasks() {
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            ca.dnamobile.javalauncher.feature.unpack.Components[] r1 = ca.dnamobile.javalauncher.feature.unpack.Components.values()
            int r2 = r1.length
            r3 = 0
            r4 = r3
        Lc:
            java.lang.String r5 = "LauncherSettings"
            if (r4 >= r2) goto L31
            r6 = r1[r4]
            ca.dnamobile.javalauncher.feature.unpack.UnpackComponentsTask r7 = new ca.dnamobile.javalauncher.feature.unpack.UnpackComponentsTask     // Catch: java.lang.Throwable -> L28
            r7.<init>(r9, r6)     // Catch: java.lang.Throwable -> L28
            boolean r8 = r7.isCheckFailed()     // Catch: java.lang.Throwable -> L28
            if (r8 != 0) goto L2e
            ca.dnamobile.javalauncher.LauncherSettingsActivity$RuntimeTaskEntry r8 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$RuntimeTaskEntry     // Catch: java.lang.Throwable -> L28
            java.lang.String r6 = r6.displayName     // Catch: java.lang.Throwable -> L28
            r8.<init>(r6, r7)     // Catch: java.lang.Throwable -> L28
            r0.add(r8)     // Catch: java.lang.Throwable -> L28
            goto L2e
        L28:
            r6 = move-exception
            java.lang.String r7 = "Skipping component reinstall task"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r5, r7, r6)
        L2e:
            int r4 = r4 + 1
            goto Lc
        L31:
            ca.dnamobile.javalauncher.feature.unpack.Jre[] r1 = ca.dnamobile.javalauncher.feature.unpack.Jre.values()
            int r2 = r1.length
        L36:
            if (r3 >= r2) goto L68
            r4 = r1[r3]
            ca.dnamobile.javalauncher.feature.unpack.UnpackJreTask r6 = new ca.dnamobile.javalauncher.feature.unpack.UnpackJreTask     // Catch: java.lang.Throwable -> L50
            r6.<init>(r9, r4)     // Catch: java.lang.Throwable -> L50
            boolean r7 = r6.isCheckFailed()     // Catch: java.lang.Throwable -> L50
            if (r7 != 0) goto L65
            ca.dnamobile.javalauncher.LauncherSettingsActivity$RuntimeTaskEntry r7 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$RuntimeTaskEntry     // Catch: java.lang.Throwable -> L50
            java.lang.String r8 = r4.jreName     // Catch: java.lang.Throwable -> L50
            r7.<init>(r8, r6)     // Catch: java.lang.Throwable -> L50
            r0.add(r7)     // Catch: java.lang.Throwable -> L50
            goto L65
        L50:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Skipping JRE reinstall task: "
            r7.<init>(r8)
            java.lang.String r4 = r4.jreName
            java.lang.StringBuilder r4 = r7.append(r4)
            java.lang.String r4 = r4.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.e(r5, r4, r6)
        L65:
            int r3 = r3 + 1
            goto L36
        L68:
            return r0
    }

    private com.google.android.material.button.MaterialButton buildSmallAccountButton(java.lang.String r7) {
            r6 = this;
            com.google.android.material.button.MaterialButton r0 = new com.google.android.material.button.MaterialButton
            r1 = 0
            int r2 = com.google.android.material.R.attr.materialButtonOutlinedStyle
            r0.<init>(r6, r1, r2)
            r0.setText(r7)
            r7 = 0
            r0.setAllCaps(r7)
            r0.setMinHeight(r7)
            r0.setMinimumHeight(r7)
            r1 = 1092616192(0x41200000, float:10.0)
            int r2 = r6.dp(r1)
            r3 = 1086324736(0x40c00000, float:6.0)
            int r4 = r6.dp(r3)
            int r1 = r6.dp(r1)
            int r5 = r6.dp(r3)
            r0.setPadding(r2, r4, r1, r5)
            r6.styleDialogOutlinedButton(r0)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = -2
            r1.<init>(r2, r2)
            int r2 = r6.dp(r3)
            r1.setMargins(r2, r7, r7, r7)
            r0.setLayoutParams(r1)
            return r0
    }

    private void clearRendererPluginCache() {
            r0 = this;
            ca.dnamobile.javalauncher.renderer.RendererPluginManager.clearImportedAndCachedRendererPlugins(r0)
            ca.dnamobile.javalauncher.renderer.Renderers.reload(r0)
            r0.refreshRendererList()
            return
    }

    private java.util.ArrayList<java.lang.String> collectPathManagerStringFields() {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Class<ca.dnamobile.javalauncher.utils.path.PathManager> r1 = ca.dnamobile.javalauncher.utils.path.PathManager.class
            java.lang.reflect.Field[] r1 = r1.getDeclaredFields()     // Catch: java.lang.Throwable -> L2f
            int r2 = r1.length     // Catch: java.lang.Throwable -> L2f
            r3 = 0
        Ld:
            if (r3 >= r2) goto L37
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L2f
            java.lang.Class r5 = r4.getType()     // Catch: java.lang.Throwable -> L2f
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            if (r5 == r6) goto L1a
            goto L2c
        L1a:
            r5 = 1
            r4.setAccessible(r5)     // Catch: java.lang.Throwable -> L2f
            r5 = 0
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L2f
            boolean r5 = r4 instanceof java.lang.String     // Catch: java.lang.Throwable -> L2f
            if (r5 == 0) goto L2c
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L2f
            r0.add(r4)     // Catch: java.lang.Throwable -> L2f
        L2c:
            int r3 = r3 + 1
            goto Ld
        L2f:
            r1 = move-exception
            java.lang.String r2 = "LauncherSettings"
            java.lang.String r3 = "Unable to inspect PathManager Java paths"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r2, r3, r1)
        L37:
            return r0
    }

    private void configureJarExecutionEnvironment(java.lang.ProcessBuilder r6, java.io.File r7, java.io.File r8) {
            r5 = this;
            java.io.File r7 = r5.resolveJavaHome(r7)
            if (r7 != 0) goto L7
            return
        L7:
            java.util.Map r6 = r6.environment()
            java.lang.String r0 = "JAVA_HOME"
            java.lang.String r1 = r7.getAbsolutePath()
            r6.put(r0, r1)
            java.io.File r8 = r5.resolveJarExecutionUserHome(r8)
            java.lang.String r8 = r8.getAbsolutePath()
            java.lang.String r0 = "HOME"
            r6.put(r0, r8)
            java.io.File r8 = r5.getCacheDir()
            java.lang.String r8 = r8.getAbsolutePath()
            java.lang.String r0 = "TMPDIR"
            r6.put(r0, r8)
            java.lang.String r8 = "PATH"
            java.lang.Object r0 = r6.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "bin"
            r1.<init>(r7, r2)
            java.lang.String r1 = r1.getAbsolutePath()
            boolean r2 = isNullOrBlank(r0)
            java.lang.String r3 = ":"
            if (r2 == 0) goto L4a
            goto L5f
        L4a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = r0.toString()
        L5f:
            r6.put(r8, r1)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "lib/server"
            r0.<init>(r7, r1)
            r5.addExistingDirectory(r8, r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "lib"
            r0.<init>(r7, r1)
            r5.addExistingDirectory(r8, r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "lib/aarch64/jli"
            r0.<init>(r7, r1)
            r5.addExistingDirectory(r8, r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "lib/aarch64/server"
            r0.<init>(r7, r1)
            r5.addExistingDirectory(r8, r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "lib/aarch64"
            r0.<init>(r7, r1)
            r5.addExistingDirectory(r8, r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "lib/arm64/jli"
            r0.<init>(r7, r1)
            r5.addExistingDirectory(r8, r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "lib/arm64/server"
            r0.<init>(r7, r1)
            r5.addExistingDirectory(r8, r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "lib/arm64"
            r0.<init>(r7, r1)
            r5.addExistingDirectory(r8, r0)
            java.io.File r7 = new java.io.File
            android.content.pm.ApplicationInfo r0 = r5.getApplicationInfo()
            java.lang.String r0 = r0.dataDir
            java.lang.String r1 = "app_runtime_mod"
            r7.<init>(r0, r1)
            r5.addExistingDirectory(r8, r7)
            java.io.File r0 = new java.io.File
            android.content.pm.ApplicationInfo r1 = r5.getApplicationInfo()
            java.lang.String r1 = r1.nativeLibraryDir
            r0.<init>(r1)
            r5.addExistingDirectory(r8, r0)
            java.lang.String r1 = "LD_LIBRARY_PATH"
            java.lang.Object r2 = r6.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r8 = r5.joinPathList(r8)
            boolean r4 = isNullOrBlank(r8)
            if (r4 != 0) goto L106
            boolean r4 = isNullOrBlank(r2)
            if (r4 == 0) goto Lee
            goto L103
        Lee:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r8 = r4.append(r8)
            java.lang.StringBuilder r8 = r8.append(r3)
            java.lang.StringBuilder r8 = r8.append(r2)
            java.lang.String r8 = r8.toString()
        L103:
            r6.put(r1, r8)
        L106:
            boolean r8 = r7.isDirectory()
            if (r8 == 0) goto L115
            java.lang.String r8 = "MOD_ANDROID_RUNTIME"
            java.lang.String r7 = r7.getAbsolutePath()
            r6.put(r8, r7)
        L115:
            boolean r7 = r0.isDirectory()
            if (r7 == 0) goto L12d
            java.lang.String r7 = "POJAV_NATIVEDIR"
            java.lang.String r8 = r0.getAbsolutePath()
            r6.put(r7, r8)
            java.lang.String r7 = "DRIVER_PATH"
            java.lang.String r8 = r0.getAbsolutePath()
            r6.put(r7, r8)
        L12d:
            java.lang.String r7 = "FORCE_VSYNC"
            java.lang.String r8 = "false"
            r6.put(r7, r8)
            return
    }

    private void configureJarGuiCompatibilityEnvironment(java.lang.ProcessBuilder r3, ca.dnamobile.javalauncher.LauncherSettingsActivity.JarGuiCompatibility r4, java.io.File r5) {
            r2 = this;
            java.util.Map r3 = r3.environment()
            android.content.res.Resources r4 = r2.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            java.io.File r0 = r2.getCacheDir()
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.String r1 = "TMPDIR"
            r3.put(r1, r0)
            java.io.File r5 = r2.resolveJarExecutionUserHome(r5)
            java.lang.String r5 = r5.getAbsolutePath()
            java.lang.String r0 = "HOME"
            r3.put(r0, r5)
            int r5 = r4.widthPixels
            r0 = 1
            int r5 = java.lang.Math.max(r0, r5)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "AWTSTUB_WIDTH"
            r3.put(r1, r5)
            int r4 = r4.heightPixels
            int r4 = java.lang.Math.max(r0, r4)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = "AWTSTUB_HEIGHT"
            r3.put(r5, r4)
            java.io.File r4 = new java.io.File
            android.content.pm.ApplicationInfo r5 = r2.getApplicationInfo()
            java.lang.String r5 = r5.nativeLibraryDir
            r4.<init>(r5)
            boolean r5 = r4.isDirectory()
            if (r5 == 0) goto L68
            java.lang.String r5 = "POJAV_NATIVEDIR"
            java.lang.String r0 = r4.getAbsolutePath()
            r3.put(r5, r0)
            java.lang.String r5 = "DRIVER_PATH"
            java.lang.String r4 = r4.getAbsolutePath()
            r3.put(r5, r4)
        L68:
            java.lang.String r4 = "FORCE_VSYNC"
            java.lang.String r5 = "false"
            r3.put(r4, r5)
            return
    }

    private void confirmDeleteOfflineAccount(ca.dnamobile.javalauncher.data.AccountStore.Account r4) {
            r3 = this;
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r3)
            int r1 = ca.dnamobile.javalauncher.R.string.offline_account_delete_title
            java.lang.String r2 = r4.getBestDisplayName()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = r3.getString(r1, r2)
            android.app.AlertDialog$Builder r0 = r0.setTitle(r1)
            int r1 = ca.dnamobile.javalauncher.R.string.offline_account_delete_message
            android.app.AlertDialog$Builder r0 = r0.setMessage(r1)
            r1 = 17039360(0x1040000, float:2.424457E-38)
            r2 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            int r1 = ca.dnamobile.javalauncher.R.string.offline_account_delete_button
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda6 r2 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda6
            r2.<init>(r3, r4)
            android.app.AlertDialog$Builder r4 = r0.setPositiveButton(r1, r2)
            r4.show()
            return
    }

    private void confirmDroidBridgeRestore(android.net.Uri r5) {
            r4 = this;
            java.io.File r0 = r4.resolveCurrentLauncherHome()
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r4)
            java.lang.String r2 = "Restore this backup?"
            android.app.AlertDialog$Builder r1 = r1.setTitle(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "DroidBridge will restore this backup into:\n\n"
            r2.<init>(r3)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = "\n\nThe current data folder will be moved aside first, so you can recover it manually if needed. Do not launch Minecraft while restore is running."
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.app.AlertDialog$Builder r0 = r1.setMessage(r0)
            r1 = 17039360(0x1040000, float:2.424457E-38)
            r2 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda9 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda9
            r1.<init>(r4, r5)
            java.lang.String r5 = "Restore"
            android.app.AlertDialog$Builder r5 = r0.setPositiveButton(r5, r1)
            r5.show()
            return
    }

    private void confirmExecuteJarFile(android.net.Uri r14) {
            r13 = this;
            java.lang.String r5 = r13.getJarDisplayName(r14)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r5.toLowerCase(r0)
            java.lang.String r1 = ".jar"
            boolean r0 = r0.endsWith(r1)
            r1 = 1
            if (r0 != 0) goto L1d
            java.lang.String r14 = "Choose a .jar file."
            android.widget.Toast r14 = android.widget.Toast.makeText(r13, r14, r1)
            r14.show()
            return
        L1d:
            android.widget.ScrollView r0 = new android.widget.ScrollView
            r0.<init>(r13)
            r2 = 0
            r0.setFillViewport(r2)
            int r3 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_DIALOG_BG
            r0.setBackgroundColor(r3)
            r0.setVerticalScrollBarEnabled(r1)
            r0.setScrollbarFadingEnabled(r2)
            java.lang.String r3 = "Execute Java .jar"
            java.lang.String r4 = "Run a trusted Java .jar with DroidBridge's internal Java runtime."
            android.widget.LinearLayout r3 = r13.createStyledDialogRoot(r0, r3, r4)
            java.lang.String r4 = r13.buildDefaultJarArguments(r5)
            java.lang.String r6 = r13.buildJarArgumentsHint(r5)
            android.widget.LinearLayout r3 = r13.addStyledDialogCard(r3)
            r13.addStyledDialogCardTitle(r3, r5)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "This runs the jar as: java -Xint -Djava.awt.headless=true -jar "
            r7.<init>(r8)
            java.lang.StringBuilder r7 = r7.append(r5)
            java.lang.String r8 = " [optional arguments]\n\nUse this for trusted loader installer jars or Java tools. DroidBridge copies the jar to a temporary app folder first so Android storage permissions do not break Java file access. Fabric and similar command-line installers can run here. Desktop Swing/AWT installers, like OptiFine's normal installer, require a bundled Cacio/Caciocavallo GUI compatibility pack. If that compatibility pack and Internal-8 are present, DroidBridge will automatically try the GUI-compatible mode; otherwise it will explain that the jar needs launcher-native support."
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            r13.addStyledDialogInfoText(r3, r7)
            android.widget.TextView r7 = new android.widget.TextView
            r7.<init>(r13)
            java.lang.String r8 = "Optional arguments"
            r7.setText(r8)
            int r8 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_TEXT_PRIMARY
            r7.setTextColor(r8)
            r9 = 1096810496(0x41600000, float:14.0)
            r7.setTextSize(r9)
            android.graphics.Typeface r9 = android.graphics.Typeface.DEFAULT_BOLD
            r7.setTypeface(r9)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r10 = -1
            r11 = -2
            r9.<init>(r10, r11)
            r12 = 1094713344(0x41400000, float:12.0)
            int r12 = r13.dp(r12)
            r9.topMargin = r12
            r3.addView(r7, r9)
            android.widget.EditText r7 = new android.widget.EditText
            r7.<init>(r13)
            r7.setSingleLine(r2)
            r7.setMinLines(r1)
            r2 = 4
            r7.setMaxLines(r2)
            r7.setHint(r6)
            r7.setText(r4)
            r7.setSelectAllOnFocus(r1)
            r7.setTextColor(r8)
            int r1 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_TEXT_MUTED
            r7.setHintTextColor(r1)
            r1 = 655361(0xa0001, float:9.18356E-40)
            r7.setInputType(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r10, r11)
            r2 = 1082130432(0x40800000, float:4.0)
            int r2 = r13.dp(r2)
            r1.topMargin = r2
            r3.addView(r7, r1)
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r13)
            android.app.AlertDialog$Builder r0 = r1.setView(r0)
            r1 = 17039360(0x1040000, float:2.424457E-38)
            r2 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            java.lang.String r1 = "Run jar"
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)
            android.app.AlertDialog r6 = r0.create()
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda50 r8 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda50
            r0 = r8
            r1 = r13
            r2 = r6
            r3 = r7
            r4 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r6.setOnShowListener(r8)
            r6.show()
            return
    }

    private void confirmRemoveMicrosoftAccount(ca.dnamobile.javalauncher.data.AccountStore.Account r4) {
            r3 = this;
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r3)
            java.lang.String r1 = "Remove Microsoft account?"
            android.app.AlertDialog$Builder r0 = r0.setTitle(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Remove "
            r1.<init>(r2)
            java.lang.String r2 = r4.getBestDisplayName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " from DroidBridge's saved account list?"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.app.AlertDialog$Builder r0 = r0.setMessage(r1)
            r1 = 17039360(0x1040000, float:2.424457E-38)
            r2 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda64 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda64
            r1.<init>(r3, r4)
            java.lang.String r4 = "Remove"
            android.app.AlertDialog$Builder r4 = r0.setPositiveButton(r4, r1)
            r4.show()
            return
    }

    private java.io.File copyJarUriForGuiLauncher(android.net.Uri r4, java.lang.String r5) throws java.lang.Exception {
            r3 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r3.getCacheDir()
            java.lang.String r2 = "jar_execution"
            r0.<init>(r1, r2)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L20
            boolean r1 = r0.mkdirs()
            if (r1 == 0) goto L18
            goto L20
        L18:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Could not create temporary jar execution folder."
            r4.<init>(r5)
            throw r4
        L20:
            java.io.File r1 = new java.io.File
            java.lang.String r5 = r3.sanitizeJarFileName(r5)
            r1.<init>(r0, r5)
            r3.copyUriToFile(r4, r1)
            return r1
    }

    private void copyUriToFile(android.net.Uri r4, java.io.File r5) throws java.lang.Exception {
            r3 = this;
            android.content.ContentResolver r0 = r3.getContentResolver()
            java.io.InputStream r4 = r0.openInputStream(r4)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L3b
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L3b
            if (r4 == 0) goto L2a
            r5 = 8192(0x2000, float:1.148E-41)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L28
        L13:
            int r1 = r4.read(r5)     // Catch: java.lang.Throwable -> L28
            r2 = -1
            if (r1 == r2) goto L1f
            r2 = 0
            r0.write(r5, r2, r1)     // Catch: java.lang.Throwable -> L28
            goto L13
        L1f:
            r0.close()     // Catch: java.lang.Throwable -> L3b
            if (r4 == 0) goto L27
            r4.close()
        L27:
            return
        L28:
            r5 = move-exception
            goto L32
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = "Could not open selected file."
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L28
            throw r5     // Catch: java.lang.Throwable -> L28
        L32:
            r0.close()     // Catch: java.lang.Throwable -> L36
            goto L3a
        L36:
            r0 = move-exception
            r5.addSuppressed(r0)     // Catch: java.lang.Throwable -> L3b
        L3a:
            throw r5     // Catch: java.lang.Throwable -> L3b
        L3b:
            r5 = move-exception
            if (r4 == 0) goto L46
            r4.close()     // Catch: java.lang.Throwable -> L42
            goto L46
        L42:
            r4 = move-exception
            r5.addSuppressed(r4)
        L46:
            throw r5
    }

    private static android.graphics.Bitmap createCapePanelBitmap(android.graphics.Bitmap r9) {
            r0 = 0
            if (r9 == 0) goto L66
            boolean r1 = r9.isRecycled()
            if (r1 == 0) goto La
            goto L66
        La:
            int r1 = r9.getWidth()
            int r2 = r9.getHeight()
            r3 = 22
            if (r1 < r3) goto L66
            r3 = 17
            if (r2 >= r3) goto L1b
            goto L66
        L1b:
            int r3 = r1 + (-1)
            float r4 = (float) r1
            r5 = 1015021568(0x3c800000, float:0.015625)
            float r5 = r5 * r4
            int r5 = java.lang.Math.round(r5)
            int r3 = java.lang.Math.min(r3, r5)
            r5 = 0
            int r3 = java.lang.Math.max(r5, r3)
            int r6 = r2 + (-1)
            float r7 = (float) r2
            r8 = 1023410176(0x3d000000, float:0.03125)
            float r8 = r8 * r7
            int r8 = java.lang.Math.round(r8)
            int r6 = java.lang.Math.min(r6, r8)
            int r5 = java.lang.Math.max(r5, r6)
            int r1 = r1 - r3
            r6 = 1042284544(0x3e200000, float:0.15625)
            float r4 = r4 * r6
            int r4 = java.lang.Math.round(r4)
            int r1 = java.lang.Math.min(r1, r4)
            r4 = 1
            int r1 = java.lang.Math.max(r4, r1)
            int r2 = r2 - r5
            r6 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 * r6
            int r6 = java.lang.Math.round(r7)
            int r2 = java.lang.Math.min(r2, r6)
            int r2 = java.lang.Math.max(r4, r2)
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r9, r3, r5, r1, r2)     // Catch: java.lang.Throwable -> L66
            return r9
        L66:
            return r0
    }

    private android.widget.LinearLayout createStyledDialogRoot(android.widget.ScrollView r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            android.widget.LinearLayout r4 = r2.createStyledDialogRoot(r4, r5)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r0 = -1
            r1 = -2
            r5.<init>(r0, r1)
            r3.addView(r4, r5)
            return r4
    }

    private android.widget.LinearLayout createStyledDialogRoot(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r6)
            r1 = 1
            r0.setOrientation(r1)
            int r1 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_DIALOG_BG
            r0.setBackgroundColor(r1)
            r1 = 1099956224(0x41900000, float:18.0)
            int r1 = r6.dp(r1)
            r2 = 1090519040(0x41000000, float:8.0)
            int r2 = r6.dp(r2)
            r0.setPadding(r1, r1, r1, r2)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r6)
            r1.setText(r7)
            r7 = 1103101952(0x41c00000, float:24.0)
            r1.setTextSize(r7)
            android.graphics.Typeface r7 = android.graphics.Typeface.DEFAULT_BOLD
            r1.setTypeface(r7)
            int r7 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_TEXT_PRIMARY
            r1.setTextColor(r7)
            r7 = 1073741824(0x40000000, float:2.0)
            int r2 = r6.dp(r7)
            int r3 = r6.dp(r7)
            r4 = 1086324736(0x40c00000, float:6.0)
            int r4 = r6.dp(r4)
            r5 = 0
            r1.setPadding(r2, r5, r3, r4)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = -1
            r4 = -2
            r2.<init>(r3, r4)
            r0.addView(r1, r2)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r6)
            r1.setText(r8)
            r8 = 1096810496(0x41600000, float:14.0)
            r1.setTextSize(r8)
            int r8 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_TEXT_SECONDARY
            r1.setTextColor(r8)
            int r8 = r6.dp(r7)
            int r7 = r6.dp(r7)
            r2 = 1094713344(0x41400000, float:12.0)
            int r2 = r6.dp(r2)
            r1.setPadding(r8, r5, r7, r2)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r7.<init>(r3, r4)
            r0.addView(r1, r7)
            return r0
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

    private java.io.File findCacioCavalloDirectory() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.io.File r2 = r5.getExternalFilesDir(r1)
            java.lang.String r3 = "caciocavallo"
            if (r2 == 0) goto L16
            java.io.File r4 = new java.io.File
            r4.<init>(r2, r3)
            r0.add(r4)
        L16:
            java.io.File r2 = new java.io.File
            android.content.pm.ApplicationInfo r4 = r5.getApplicationInfo()
            java.lang.String r4 = r4.dataDir
            r2.<init>(r4, r3)
            r0.add(r2)
            java.io.File r2 = new java.io.File
            java.io.File r4 = r5.getFilesDir()
            r2.<init>(r4, r3)
            r0.add(r2)
            java.io.File r2 = new java.io.File
            java.io.File r4 = r5.getCacheDir()
            r2.<init>(r4, r3)
            r0.add(r2)
            java.io.File r2 = new java.io.File
            java.lang.String r4 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            r2.<init>(r4)
            java.io.File r2 = r2.getParentFile()
            if (r2 == 0) goto L51
            java.io.File r4 = new java.io.File
            r4.<init>(r2, r3)
            r0.add(r4)
        L51:
            java.util.Iterator r0 = r0.iterator()
        L55:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L92
            java.lang.Object r2 = r0.next()
            java.io.File r2 = (java.io.File) r2
            if (r2 == 0) goto L55
            boolean r3 = r2.isDirectory()
            if (r3 != 0) goto L6a
            goto L55
        L6a:
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "ResConfHack.jar"
            r3.<init>(r2, r4)
            boolean r3 = r3.isFile()
            if (r3 == 0) goto L55
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "cacio-androidnw-1.10-SNAPSHOT.jar"
            r3.<init>(r2, r4)
            boolean r3 = r3.isFile()
            if (r3 == 0) goto L55
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "cacio-shared-1.10-SNAPSHOT.jar"
            r3.<init>(r2, r4)
            boolean r3 = r3.isFile()
            if (r3 == 0) goto L55
            return r2
        L92:
            return r1
    }

    private java.io.File findComponentsDirectory() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.io.File r1 = new java.io.File
            android.content.pm.ApplicationInfo r2 = r5.getApplicationInfo()
            java.lang.String r2 = r2.dataDir
            java.lang.String r3 = "components"
            r1.<init>(r2, r3)
            r0.add(r1)
            java.io.File r1 = new java.io.File
            java.io.File r2 = r5.getFilesDir()
            r1.<init>(r2, r3)
            r0.add(r1)
            r1 = 0
            java.io.File r2 = r5.getExternalFilesDir(r1)
            if (r2 == 0) goto L30
            java.io.File r4 = new java.io.File
            r4.<init>(r2, r3)
            r0.add(r4)
        L30:
            java.io.File r2 = new java.io.File
            java.lang.String r4 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            r2.<init>(r4)
            java.io.File r2 = r2.getParentFile()
            if (r2 == 0) goto L45
            java.io.File r4 = new java.io.File
            r4.<init>(r2, r3)
            r0.add(r4)
        L45:
            java.util.Iterator r0 = r0.iterator()
        L49:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L5e
            java.lang.Object r2 = r0.next()
            java.io.File r2 = (java.io.File) r2
            if (r2 == 0) goto L49
            boolean r3 = r2.isDirectory()
            if (r3 == 0) goto L49
            return r2
        L5e:
            return r1
    }

    private ca.dnamobile.javalauncher.LauncherSettingsActivity.JarGuiCompatibility findJarGuiCompatibility() {
            r10 = this;
            java.io.File r2 = r10.findJava8ExecutableForJarExecution()
            r0 = 0
            if (r2 == 0) goto L7b
            boolean r1 = r2.isFile()
            if (r1 != 0) goto Lf
            goto L7b
        Lf:
            java.io.File r3 = r10.findCacioCavalloDirectory()
            if (r3 == 0) goto L7b
            boolean r1 = r3.isDirectory()
            if (r1 != 0) goto L1d
            goto L7b
        L1d:
            java.io.File r4 = new java.io.File
            java.lang.String r1 = "ResConfHack.jar"
            r4.<init>(r3, r1)
            java.io.File r5 = new java.io.File
            java.lang.String r1 = "cacio-androidnw-1.10-SNAPSHOT.jar"
            r5.<init>(r3, r1)
            java.io.File r6 = new java.io.File
            java.lang.String r1 = "cacio-shared-1.10-SNAPSHOT.jar"
            r6.<init>(r3, r1)
            boolean r1 = r4.isFile()
            if (r1 == 0) goto L7b
            boolean r1 = r5.isFile()
            if (r1 == 0) goto L7b
            boolean r1 = r6.isFile()
            if (r1 != 0) goto L45
            goto L7b
        L45:
            java.io.File r1 = r10.findComponentsDirectory()
            if (r1 == 0) goto L53
            java.io.File r7 = new java.io.File
            java.lang.String r8 = "pro-grade.jar"
            r7.<init>(r1, r8)
            goto L54
        L53:
            r7 = r0
        L54:
            if (r1 == 0) goto L5e
            java.io.File r8 = new java.io.File
            java.lang.String r9 = "java_sandbox.policy"
            r8.<init>(r1, r9)
            goto L5f
        L5e:
            r8 = r0
        L5f:
            ca.dnamobile.javalauncher.LauncherSettingsActivity$JarGuiCompatibility r9 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$JarGuiCompatibility
            if (r7 == 0) goto L6a
            boolean r1 = r7.isFile()
            if (r1 == 0) goto L6a
            goto L6b
        L6a:
            r7 = r0
        L6b:
            if (r8 == 0) goto L74
            boolean r1 = r8.isFile()
            if (r1 == 0) goto L74
            goto L75
        L74:
            r8 = r0
        L75:
            r0 = r9
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
        L7b:
            return r0
    }

    private java.io.File findJava8ExecutableForJarExecution() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.io.File r1 = r3.getDataDir()
            r3.addJava8RuntimeCandidates(r0, r1)
            java.io.File r1 = new java.io.File
            android.content.pm.ApplicationInfo r2 = r3.getApplicationInfo()
            java.lang.String r2 = r2.dataDir
            r1.<init>(r2)
            r3.addJava8RuntimeCandidates(r0, r1)
            java.io.File r1 = r3.getFilesDir()
            r3.addJava8RuntimeCandidates(r0, r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            r1.<init>(r2)
            r3.addJava8RuntimeCandidates(r0, r1)
            java.io.File r1 = r1.getParentFile()
            r3.addJava8RuntimeCandidates(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        L36:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L60
            java.lang.Object r1 = r0.next()
            java.io.File r1 = (java.io.File) r1
            if (r1 == 0) goto L36
            boolean r2 = r1.isFile()
            if (r2 != 0) goto L4b
            goto L36
        L4b:
            r2 = 1
            r1.setExecutable(r2, r2)
            boolean r2 = r1.canExecute()
            if (r2 != 0) goto L5f
            java.lang.String r2 = r1.getName()
            boolean r2 = r3.isJavaExecutableName(r2)
            if (r2 == 0) goto L36
        L5f:
            return r1
        L60:
            r0 = 0
            return r0
    }

    private java.io.File findJavaExecutableForJarExecution() {
            r5 = this;
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r5)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.io.File r1 = r5.getDataDir()
            r5.addJavaRuntimeCandidates(r0, r1)
            java.io.File r1 = new java.io.File
            android.content.pm.ApplicationInfo r2 = r5.getApplicationInfo()
            java.lang.String r2 = r2.dataDir
            r1.<init>(r2)
            r5.addJavaRuntimeCandidates(r0, r1)
            java.io.File r1 = r5.getFilesDir()
            r5.addJavaRuntimeCandidates(r0, r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            r1.<init>(r2)
            r5.addJavaRuntimeCandidates(r0, r1)
            java.io.File r1 = r1.getParentFile()
            r5.addJavaRuntimeCandidates(r0, r1)
            java.util.ArrayList r1 = r5.collectPathManagerStringFields()
            java.util.Iterator r1 = r1.iterator()
        L3d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L86
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = isNullOrBlank(r2)
            if (r3 == 0) goto L50
            goto L3d
        L50:
            java.io.File r3 = new java.io.File
            r3.<init>(r2)
            boolean r2 = r3.isFile()
            if (r2 == 0) goto L68
            java.lang.String r2 = r3.getName()
            boolean r2 = r5.isJavaExecutableName(r2)
            if (r2 == 0) goto L68
            r0.add(r3)
        L68:
            boolean r2 = r3.isDirectory()
            if (r2 == 0) goto L3d
            java.io.File r2 = new java.io.File
            java.lang.String r4 = "bin/java"
            r2.<init>(r3, r4)
            r0.add(r2)
            java.io.File r2 = new java.io.File
            java.lang.String r4 = "bin/java.real"
            r2.<init>(r3, r4)
            r0.add(r2)
            r5.addJavaRuntimeCandidates(r0, r3)
            goto L3d
        L86:
            java.util.Iterator r0 = r0.iterator()
        L8a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc2
            java.lang.Object r1 = r0.next()
            java.io.File r1 = (java.io.File) r1
            if (r1 == 0) goto L8a
            boolean r2 = r1.isFile()
            if (r2 != 0) goto L9f
            goto L8a
        L9f:
            r2 = 1
            r1.setExecutable(r2, r2)
            boolean r2 = r1.canExecute()
            if (r2 != 0) goto Lc1
            java.lang.String r2 = "java"
            java.lang.String r3 = r1.getName()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lc1
            java.lang.String r2 = "java.real"
            java.lang.String r3 = r1.getName()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L8a
        Lc1:
            return r1
        Lc2:
            r0 = 0
            return r0
    }

    private java.lang.String getJarDisplayName(android.net.Uri r10) {
            r9 = this;
            java.lang.String r0 = "_display_name"
            r1 = 1
            r2 = 0
            android.content.ContentResolver r3 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L2e
            java.lang.String[] r5 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L2e
            r4 = 0
            r5[r4] = r0     // Catch: java.lang.Throwable -> L2e
            r7 = 0
            r8 = 0
            r6 = 0
            r4 = r10
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L28
            boolean r4 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L28
            int r0 = r3.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L2f
            if (r0 < 0) goto L28
            java.lang.String r0 = r3.getString(r0)     // Catch: java.lang.Throwable -> L2f
            r2 = r0
        L28:
            if (r3 == 0) goto L32
        L2a:
            r3.close()
            goto L32
        L2e:
            r3 = r2
        L2f:
            if (r3 == 0) goto L32
            goto L2a
        L32:
            boolean r0 = isNullOrBlank(r2)
            if (r0 == 0) goto L50
            java.lang.String r10 = r10.getLastPathSegment()
            boolean r0 = isNullOrBlank(r10)
            if (r0 != 0) goto L50
            r0 = 47
            int r0 = r10.lastIndexOf(r0)
            if (r0 < 0) goto L4f
            int r0 = r0 + r1
            java.lang.String r10 = r10.substring(r0)
        L4f:
            r2 = r10
        L50:
            boolean r10 = isNullOrBlank(r2)
            if (r10 == 0) goto L58
            java.lang.String r2 = "selected.jar"
        L58:
            java.lang.String r10 = r9.sanitizeJarFileName(r2)
            return r10
    }

    private java.lang.String getJarGuiCompatibilityScreenSize() {
            r4 = this;
            android.content.res.Resources r0 = r4.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r0.widthPixels
            r3 = 1
            int r2 = java.lang.Math.max(r3, r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "x"
            java.lang.StringBuilder r1 = r1.append(r2)
            int r0 = r0.heightPixels
            int r0 = java.lang.Math.max(r3, r0)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            return r0
    }

    private java.util.ArrayList<ca.dnamobile.javalauncher.data.AccountStore.Account> getMicrosoftAccountsForDialog() {
            r3 = this;
            java.util.ArrayList r0 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAccountRegistry.list(r3)
            ca.dnamobile.javalauncher.data.AccountStore r1 = r3.accountStore
            if (r1 == 0) goto L37
            ca.dnamobile.javalauncher.data.AccountStore$Account r1 = r1.load()     // Catch: java.lang.Throwable -> L1f
            boolean r2 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAccountRegistry.isUsableMicrosoftAccount(r1)     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L1f
            boolean r2 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAccountRegistry.containsSame(r0, r1)     // Catch: java.lang.Throwable -> L1f
            if (r2 != 0) goto L1f
            r2 = 0
            r0.add(r2, r1)     // Catch: java.lang.Throwable -> L1f
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAccountRegistry.save(r3, r1)     // Catch: java.lang.Throwable -> L1f
        L1f:
            ca.dnamobile.javalauncher.data.AccountStore r1 = r3.accountStore     // Catch: java.lang.Throwable -> L37
            ca.dnamobile.javalauncher.data.AccountStore$Account r1 = r1.loadLastMicrosoftAccount()     // Catch: java.lang.Throwable -> L37
            boolean r2 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAccountRegistry.isUsableMicrosoftAccount(r1)     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto L37
            boolean r2 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAccountRegistry.containsSame(r0, r1)     // Catch: java.lang.Throwable -> L37
            if (r2 != 0) goto L37
            r0.add(r1)     // Catch: java.lang.Throwable -> L37
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAccountRegistry.save(r3, r1)     // Catch: java.lang.Throwable -> L37
        L37:
            return r0
    }

    private ca.dnamobile.javalauncher.data.AccountStore.Account getMicrosoftSkinTargetAccount(ca.dnamobile.javalauncher.data.AccountStore.Account r3) {
            r2 = this;
            if (r3 == 0) goto Lf
            boolean r0 = r3.isMicrosoftAccount()
            if (r0 == 0) goto Lf
            boolean r0 = r3.hasMinecraftSession()
            if (r0 == 0) goto Lf
            return r3
        Lf:
            ca.dnamobile.javalauncher.data.AccountStore r3 = r2.accountStore
            r0 = 0
            if (r3 != 0) goto L15
            return r0
        L15:
            ca.dnamobile.javalauncher.data.AccountStore$Account r3 = r3.loadLastMicrosoftAccount()
            if (r3 == 0) goto L28
            boolean r1 = r3.isMicrosoftAccount()
            if (r1 == 0) goto L28
            boolean r1 = r3.hasMinecraftSession()
            if (r1 == 0) goto L28
            return r3
        L28:
            return r0
    }

    private ca.dnamobile.javalauncher.data.AccountStore.Account getPreferredRememberedMicrosoftAccount() {
            r3 = this;
            ca.dnamobile.javalauncher.data.AccountStore r0 = r3.accountStore
            if (r0 == 0) goto L1c
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r0.loadLastMicrosoftAccount()     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L1c
            boolean r1 = r0.isMicrosoftAccount()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L1c
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAccountRegistry.save(r3, r0)     // Catch: java.lang.Throwable -> L14
            return r0
        L14:
            r0 = move-exception
            java.lang.String r1 = "LauncherSettings"
            java.lang.String r2 = "Unable to load remembered Microsoft account"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r2, r0)
        L1c:
            java.util.ArrayList r0 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAccountRegistry.list(r3)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L28
            r0 = 0
            goto L2f
        L28:
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = (ca.dnamobile.javalauncher.data.AccountStore.Account) r0
        L2f:
            return r0
    }

    private ca.dnamobile.javalauncher.renderer.RendererInterface getSelectedRendererFromSpinner() {
            r2 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            android.widget.Spinner r0 = r0.spinnerRenderer
            int r0 = r0.getSelectedItemPosition()
            if (r0 < 0) goto L1c
            java.util.List<ca.dnamobile.javalauncher.renderer.RendererInterface> r1 = r2.availableRenderers
            int r1 = r1.size()
            if (r0 < r1) goto L13
            goto L1c
        L13:
            java.util.List<ca.dnamobile.javalauncher.renderer.RendererInterface> r1 = r2.availableRenderers
            java.lang.Object r0 = r1.get(r0)
            ca.dnamobile.javalauncher.renderer.RendererInterface r0 = (ca.dnamobile.javalauncher.renderer.RendererInterface) r0
            return r0
        L1c:
            r0 = 0
            return r0
    }

    private void handleCustomSkinResult(android.net.Uri r1) {
            r0 = this;
            r0.pendingOfflineSkinUri = r1
            return
    }

    private void importCustomMouseCursorIcon(android.net.Uri r4) {
            r3 = this;
            java.io.File r0 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getCustomMouseCursorFile(r3)
            java.io.File r1 = r0.getParentFile()
            if (r1 == 0) goto L13
            boolean r2 = r1.exists()
            if (r2 != 0) goto L13
            r1.mkdirs()
        L13:
            r1 = 1
            r3.copyUriToFile(r4, r0)     // Catch: java.lang.Throwable -> L48
            java.lang.String r4 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L48
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeFile(r4)     // Catch: java.lang.Throwable -> L48
            if (r4 != 0) goto L2e
            r0.delete()     // Catch: java.lang.Throwable -> L48
            java.lang.String r4 = "That image could not be used as a cursor icon."
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r1)     // Catch: java.lang.Throwable -> L48
            r4.show()     // Catch: java.lang.Throwable -> L48
            return
        L2e:
            java.lang.String r4 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L48
            ca.dnamobile.javalauncher.controls.ControlsPreferences.setCustomMouseCursorPath(r3, r4)     // Catch: java.lang.Throwable -> L48
            java.lang.String r4 = "custom"
            ca.dnamobile.javalauncher.controls.ControlsPreferences.setMouseCursorStyle(r3, r4)     // Catch: java.lang.Throwable -> L48
            r3.updateMouseCursorIconSettingsSummary()     // Catch: java.lang.Throwable -> L48
            java.lang.String r4 = "Custom mouse cursor saved."
            r0 = 0
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r0)     // Catch: java.lang.Throwable -> L48
            r4.show()     // Catch: java.lang.Throwable -> L48
            goto L5f
        L48:
            r4 = move-exception
            java.lang.String r0 = r4.getMessage()
            if (r0 == 0) goto L54
            java.lang.String r4 = r4.getMessage()
            goto L58
        L54:
            java.lang.String r4 = r4.toString()
        L58:
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r1)
            r4.show()
        L5f:
            return
    }

    private boolean isJavaExecutableName(java.lang.String r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "java"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L14
            java.lang.String r1 = "java.real"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L15
        L14:
            r0 = 1
        L15:
            return r0
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

    private static boolean isValidOfflineName(java.lang.String r1) {
            if (r1 == 0) goto Lc
            java.lang.String r0 = "[A-Za-z0-9_]{3,16}"
            boolean r1 = r1.matches(r0)
            if (r1 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }

    private java.lang.String joinCommandForDisplay(java.util.List<java.lang.String> r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L9:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r0.length()
            if (r2 <= 0) goto L20
            r2 = 32
            r0.append(r2)
        L20:
            java.lang.String r1 = r3.quoteCommandPartForDisplay(r1)
            r0.append(r1)
            goto L9
        L28:
            java.lang.String r4 = r0.toString()
            return r4
    }

    private java.lang.String joinPathList(java.util.ArrayList<java.lang.String> r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L9:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = isNullOrBlank(r1)
            if (r2 == 0) goto L1c
            goto L9
        L1c:
            int r2 = r0.length()
            if (r2 <= 0) goto L27
            r2 = 58
            r0.append(r2)
        L27:
            r0.append(r1)
            goto L9
        L2b:
            java.lang.String r4 = r0.toString()
            return r4
    }

    private /* synthetic */ void lambda$addCapeOptionRow$134(java.lang.Runnable r2, java.util.ArrayList r3, java.util.ArrayList r4, android.widget.RadioButton r5, android.widget.LinearLayout r6, android.view.View r7) {
            r1 = this;
            r2.run()
            java.util.Iterator r2 = r3.iterator()
        L7:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L18
            java.lang.Object r3 = r2.next()
            android.widget.RadioButton r3 = (android.widget.RadioButton) r3
            r7 = 0
            r3.setChecked(r7)
            goto L7
        L18:
            java.util.Iterator r2 = r4.iterator()
        L1c:
            boolean r3 = r2.hasNext()
            r4 = 14
            if (r3 == 0) goto L36
            java.lang.Object r3 = r2.next()
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            int r7 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_CARD_BG
            int r0 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_CARD_STROKE
            android.graphics.drawable.GradientDrawable r4 = r1.roundedDrawable(r7, r0, r4)
            r3.setBackground(r4)
            goto L1c
        L36:
            r2 = 1
            r5.setChecked(r2)
            int r2 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_CARD_BG_PRESSED
            int r3 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_ACCENT_MUTED
            android.graphics.drawable.GradientDrawable r2 = r1.roundedDrawable(r2, r3, r4)
            r6.setBackground(r2)
            return
    }

    static /* synthetic */ void lambda$addStyledSingleChoiceRow$148(java.lang.Runnable r0, android.view.View r1) {
            r0.run()
            return
    }

    private /* synthetic */ void lambda$applyMicrosoftCapeSelection$137(ca.dnamobile.javalauncher.data.AccountStore.Account r3, java.lang.Runnable r4) {
            r2 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonChangeMicrosoftCape
            int r1 = ca.dnamobile.javalauncher.R.string.microsoft_cape_change_button
            r0.setText(r1)
            r2.updateChangeMicrosoftCapeButtonState(r3)
            int r0 = ca.dnamobile.javalauncher.R.string.microsoft_cape_save_success
            r1 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
            r2.refreshActiveCapeIntoPlayerModel(r3)
            r3 = 0
            r2.refreshMicrosoftAccountAndSkin(r3)
            r4.run()
            return
    }

    private /* synthetic */ void lambda$applyMicrosoftCapeSelection$138(ca.dnamobile.javalauncher.data.AccountStore.Account r3, java.lang.Throwable r4, java.lang.Runnable r5) {
            r2 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonChangeMicrosoftCape
            int r1 = ca.dnamobile.javalauncher.R.string.microsoft_cape_change_button
            r0.setText(r1)
            r2.updateChangeMicrosoftCapeButtonState(r3)
            java.lang.String r3 = r4.getMessage()
            if (r3 == 0) goto L17
            java.lang.String r3 = r4.getMessage()
            goto L1b
        L17:
            java.lang.String r3 = r4.toString()
        L1b:
            int r4 = ca.dnamobile.javalauncher.R.string.microsoft_cape_save_failed
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r3 = r2.getString(r4, r3)
            r4 = 1
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r4)
            r3.show()
            r5.run()
            return
    }

    private /* synthetic */ void lambda$applyMicrosoftCapeSelection$139(java.lang.String r2, ca.dnamobile.javalauncher.data.AccountStore.Account r3, java.lang.Runnable r4, java.lang.Runnable r5) {
            r1 = this;
            boolean r0 = isNullOrBlank(r2)     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto Lc
            java.lang.String r2 = r3.minecraftAccessToken     // Catch: java.lang.Throwable -> L1a
            ca.dnamobile.javalauncher.skin.MicrosoftCapeService.hideActiveCape(r2)     // Catch: java.lang.Throwable -> L1a
            goto L11
        Lc:
            java.lang.String r0 = r3.minecraftAccessToken     // Catch: java.lang.Throwable -> L1a
            ca.dnamobile.javalauncher.skin.MicrosoftCapeService.activateCape(r0, r2)     // Catch: java.lang.Throwable -> L1a
        L11:
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda130 r2 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda130     // Catch: java.lang.Throwable -> L1a
            r2.<init>(r1, r3, r4)     // Catch: java.lang.Throwable -> L1a
            r1.runOnUiThread(r2)     // Catch: java.lang.Throwable -> L1a
            goto L23
        L1a:
            r2 = move-exception
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda131 r4 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda131
            r4.<init>(r1, r3, r2, r5)
            r1.runOnUiThread(r4)
        L23:
            return
    }

    private /* synthetic */ void lambda$bindAvoidRoundedCornersSwitch$36(android.widget.CompoundButton r1, boolean r2) {
            r0 = this;
            ca.dnamobile.javalauncher.settings.LauncherPreferences.setAvoidRoundedDisplayCorners(r0, r2)
            r0.updateAvoidRoundedCornersSwitchText(r2)
            if (r2 == 0) goto L12
            boolean r1 = ca.dnamobile.javalauncher.settings.LauncherPreferences.isIgnoreDisplayCutout(r0)
            if (r1 == 0) goto L12
            r1 = 0
            r0.setIgnoreDisplayCutoutQuietly(r1)
        L12:
            return
    }

    private /* synthetic */ void lambda$bindForceFullscreenSwitch$34(android.widget.CompoundButton r1, boolean r2) {
            r0 = this;
            ca.dnamobile.javalauncher.settings.LauncherPreferences.setForceFullscreenMode(r0, r2)
            r0.updateForceFullscreenSwitchText(r2)
            if (r2 != 0) goto L12
            boolean r1 = ca.dnamobile.javalauncher.settings.LauncherPreferences.isIgnoreDisplayCutout(r0)
            if (r1 == 0) goto L12
            r1 = 0
            r0.setIgnoreDisplayCutoutQuietly(r1)
        L12:
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r0)
            return
    }

    private /* synthetic */ void lambda$bindIgnoreDisplayCutoutSwitch$35(android.widget.CompoundButton r1, boolean r2) {
            r0 = this;
            ca.dnamobile.javalauncher.settings.LauncherPreferences.setIgnoreDisplayCutout(r0, r2)
            r0.updateIgnoreDisplayCutoutSwitchText(r2)
            if (r2 == 0) goto L10
            r1 = 1
            r0.setForceFullscreenQuietly(r1)
            r1 = 0
            r0.setAvoidRoundedCornersQuietly(r1)
        L10:
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r0)
            return
    }

    private /* synthetic */ void lambda$buildMicrosoftAccountRow$107(ca.dnamobile.javalauncher.data.AccountStore.Account r1, android.view.View r2) {
            r0 = this;
            r0.useMicrosoftAccount(r1)
            return
    }

    private /* synthetic */ void lambda$buildMicrosoftAccountRow$108(ca.dnamobile.javalauncher.data.AccountStore.Account r1, android.view.View r2) {
            r0 = this;
            r0.refreshSpecificMicrosoftAccount(r1)
            return
    }

    private /* synthetic */ void lambda$buildMicrosoftAccountRow$109(ca.dnamobile.javalauncher.data.AccountStore.Account r1, android.view.View r2) {
            r0 = this;
            r0.confirmRemoveMicrosoftAccount(r1)
            return
    }

    private /* synthetic */ void lambda$buildOfflineAccountRow$114(ca.dnamobile.javalauncher.data.AccountStore.Account r2, android.view.View r3) {
            r1 = this;
            android.app.AlertDialog r3 = r1.offlineAccountsDialog
            if (r3 == 0) goto L7
            r3.dismiss()
        L7:
            ca.dnamobile.javalauncher.data.AccountStore r3 = r1.accountStore
            java.lang.String r0 = r2.accountId
            r3.activateOfflineAccount(r0)
            ca.dnamobile.javalauncher.data.AccountStore r3 = r1.accountStore
            ca.dnamobile.javalauncher.data.AccountStore$Account r3 = r3.load()
            r1.updateAccountStatus(r3)
            r1.updateSkinUi(r3)
            int r3 = ca.dnamobile.javalauncher.R.string.offline_account_enabled
            java.lang.String r2 = r2.getBestDisplayName()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r2 = r1.getString(r3, r2)
            r3 = 0
            android.widget.Toast r2 = android.widget.Toast.makeText(r1, r2, r3)
            r2.show()
            return
    }

    private /* synthetic */ void lambda$buildOfflineAccountRow$115(ca.dnamobile.javalauncher.data.AccountStore.Account r1, android.view.View r2) {
            r0 = this;
            android.app.AlertDialog r2 = r0.offlineAccountsDialog
            if (r2 == 0) goto L7
            r2.dismiss()
        L7:
            r0.showEditOfflineAccountDialog(r1)
            return
    }

    private /* synthetic */ void lambda$buildOfflineAccountRow$116(ca.dnamobile.javalauncher.data.AccountStore.Account r1, android.view.View r2) {
            r0 = this;
            android.app.AlertDialog r2 = r0.offlineAccountsDialog
            if (r2 == 0) goto L7
            r2.dismiss()
        L7:
            r0.confirmDeleteOfflineAccount(r1)
            return
    }

    private /* synthetic */ void lambda$confirmDeleteOfflineAccount$122(ca.dnamobile.javalauncher.data.AccountStore.Account r1, android.content.DialogInterface r2, int r3) {
            r0 = this;
            ca.dnamobile.javalauncher.data.AccountStore r2 = r0.accountStore
            java.lang.String r1 = r1.accountId
            r2.deleteOfflineAccount(r1)
            ca.dnamobile.javalauncher.data.AccountStore r1 = r0.accountStore
            ca.dnamobile.javalauncher.data.AccountStore$Account r1 = r1.load()
            r0.updateAccountStatus(r1)
            r0.updateSkinUi(r1)
            r0.showOfflineAccountsDialog()
            return
    }

    private /* synthetic */ void lambda$confirmDroidBridgeRestore$64(android.net.Uri r1, android.content.DialogInterface r2, int r3) {
            r0 = this;
            r0.startDroidBridgeRestore(r1)
            return
    }

    private /* synthetic */ void lambda$confirmExecuteJarFile$83(android.widget.EditText r1, android.app.AlertDialog r2, android.net.Uri r3, java.lang.String r4, android.view.View r5) {
            r0 = this;
            android.text.Editable r5 = r1.getText()
            if (r5 != 0) goto L9
            java.lang.String r1 = ""
            goto L11
        L9:
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
        L11:
            r2.dismiss()
            r0.startJarExecution(r3, r4, r1)
            return
    }

    private /* synthetic */ void lambda$confirmExecuteJarFile$84(android.app.AlertDialog r8, android.widget.EditText r9, android.net.Uri r10, java.lang.String r11, android.content.DialogInterface r12) {
            r7 = this;
            r7.styleLauncherDialogChrome(r8)
            r12 = -1
            android.widget.Button r12 = r8.getButton(r12)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda104 r6 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda104
            r0 = r6
            r1 = r7
            r2 = r9
            r3 = r8
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r12.setOnClickListener(r6)
            return
    }

    private /* synthetic */ void lambda$confirmRemoveMicrosoftAccount$110(ca.dnamobile.javalauncher.data.AccountStore.Account r1, android.content.DialogInterface r2, int r3) {
            r0 = this;
            r0.removeMicrosoftAccount(r1)
            return
    }

    static /* synthetic */ void lambda$loadCapePreviewInto$135(android.graphics.Bitmap r1, android.widget.ImageView r2, android.graphics.Bitmap r3) {
            if (r1 == 0) goto Lc
            boolean r0 = r1.isRecycled()
            if (r0 != 0) goto Lc
            r2.setImageBitmap(r1)
            goto L17
        Lc:
            if (r3 == 0) goto L17
            boolean r1 = r3.isRecycled()
            if (r1 != 0) goto L17
            r2.setImageBitmap(r3)
        L17:
            return
    }

    private /* synthetic */ void lambda$loadCapePreviewInto$136(java.lang.String r6, android.widget.ImageView r7) {
            r5 = this;
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L57
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L57
            java.net.URLConnection r6 = r1.openConnection()     // Catch: java.lang.Throwable -> L57
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch: java.lang.Throwable -> L57
            r1 = 12000(0x2ee0, float:1.6816E-41)
            r6.setConnectTimeout(r1)     // Catch: java.lang.Throwable -> L53
            r1 = 15000(0x3a98, float:2.102E-41)
            r6.setReadTimeout(r1)     // Catch: java.lang.Throwable -> L53
            r1 = 1
            r6.setUseCaches(r1)     // Catch: java.lang.Throwable -> L53
            int r1 = r6.getResponseCode()     // Catch: java.lang.Throwable -> L53
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 < r2) goto L4d
            int r1 = r6.getResponseCode()     // Catch: java.lang.Throwable -> L53
            r2 = 300(0x12c, float:4.2E-43)
            if (r1 >= r2) goto L4d
            java.io.InputStream r1 = r6.getInputStream()     // Catch: java.lang.Throwable -> L53
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L41
            r2.<init>()     // Catch: java.lang.Throwable -> L41
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L41
            r2.inPreferredConfig = r3     // Catch: java.lang.Throwable -> L41
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r1, r0, r2)     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L4d
            r1.close()     // Catch: java.lang.Throwable -> L53
            goto L4d
        L41:
            r2 = move-exception
            if (r1 == 0) goto L4c
            r1.close()     // Catch: java.lang.Throwable -> L48
            goto L4c
        L48:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch: java.lang.Throwable -> L53
        L4c:
            throw r2     // Catch: java.lang.Throwable -> L53
        L4d:
            if (r6 == 0) goto L5e
            r6.disconnect()
            goto L5e
        L53:
            r4 = r0
            r0 = r6
            r6 = r4
            goto L58
        L57:
            r6 = r0
        L58:
            if (r0 == 0) goto L5d
            r0.disconnect()
        L5d:
            r0 = r6
        L5e:
            android.graphics.Bitmap r6 = createCapePanelBitmap(r0)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda136 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda136
            r1.<init>(r6, r7, r0)
            r5.runOnUiThread(r1)
            return
    }

    private /* synthetic */ void lambda$onCreate$0(android.view.View r1) {
            r0 = this;
            r0.finish()
            return
    }

    private /* synthetic */ void lambda$openMemoryInputDialog$102(android.widget.EditText r1, android.app.AlertDialog r2, android.view.View r3) {
            r0 = this;
            android.text.Editable r3 = r1.getText()
            if (r3 != 0) goto L9
            java.lang.String r1 = ""
            goto L11
        L9:
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
        L11:
            int r1 = r0.parseMemoryInput(r1)
            int r1 = ca.dnamobile.javalauncher.settings.MemoryAllocationUtils.clampToAllowedRam(r0, r1)
            ca.dnamobile.javalauncher.settings.LauncherPreferences.setAllocatedMemoryMb(r0, r1)
            r0.updateMemorySlider(r1)
            r2.dismiss()
            return
    }

    private /* synthetic */ void lambda$openMemoryInputDialog$103(android.app.AlertDialog r2, android.widget.EditText r3, android.content.DialogInterface r4) {
            r1 = this;
            r4 = -1
            android.widget.Button r4 = r2.getButton(r4)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda86 r0 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda86
            r0.<init>(r1, r3, r2)
            r4.setOnClickListener(r0)
            return
    }

    private /* synthetic */ void lambda$openResolutionScaleInputDialog$37(android.widget.EditText r1, android.app.AlertDialog r2, android.view.View r3) {
            r0 = this;
            android.text.Editable r3 = r1.getText()
            if (r3 != 0) goto L9
            java.lang.String r1 = ""
            goto L11
        L9:
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
        L11:
            int r1 = r0.parseResolutionScaleInput(r1)
            int r1 = ca.dnamobile.javalauncher.settings.LauncherPreferences.clampGameResolutionScalePercent(r1)
            ca.dnamobile.javalauncher.settings.LauncherPreferences.setGameResolutionScalePercent(r0, r1)
            r0.updateResolutionScaleUi(r1)
            r2.dismiss()
            return
    }

    private /* synthetic */ void lambda$openResolutionScaleInputDialog$38(android.app.AlertDialog r2, android.widget.EditText r3, android.content.DialogInterface r4) {
            r1 = this;
            r4 = -1
            android.widget.Button r4 = r2.getButton(r4)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda23 r0 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda23
            r0.<init>(r1, r3, r2)
            r4.setOnClickListener(r0)
            return
    }

    private /* synthetic */ void lambda$refreshActiveCapeIntoPlayerModel$123(int r2, java.lang.String r3) {
            r1 = this;
            int r0 = r1.playerModelCapeLoadGeneration
            if (r2 != r0) goto L14
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r2 = r1.binding
            if (r2 == 0) goto L14
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView r2 = r2.modelPlayerPreview
            if (r2 != 0) goto Ld
            goto L14
        Ld:
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r2 = r1.binding
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView r2 = r2.modelPlayerPreview
            r2.setCapeUrl(r3)
        L14:
            return
    }

    private /* synthetic */ void lambda$refreshActiveCapeIntoPlayerModel$124(java.lang.String r4, int r5) {
            r3 = this;
            r0 = 0
            ca.dnamobile.javalauncher.skin.MicrosoftCapeService$Profile r4 = ca.dnamobile.javalauncher.skin.MicrosoftCapeService.fetchProfile(r4)     // Catch: java.lang.Throwable -> L17
            ca.dnamobile.javalauncher.skin.MicrosoftCapeService$CapeEntry r4 = r4.getActiveCape()     // Catch: java.lang.Throwable -> L17
            if (r4 == 0) goto L30
            java.lang.String r1 = r4.url     // Catch: java.lang.Throwable -> L17
            boolean r1 = isNullOrBlank(r1)     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L30
            java.lang.String r4 = r4.url     // Catch: java.lang.Throwable -> L17
            r0 = r4
            goto L30
        L17:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to load active cape preview: "
            r1.<init>(r2)
            java.lang.String r4 = r4.getMessage()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            java.lang.String r1 = "LauncherSettings"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r4)
        L30:
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda117 r4 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda117
            r4.<init>(r3, r5, r0)
            r3.runOnUiThread(r4)
            return
    }

    private /* synthetic */ void lambda$refreshControllerSettingsValues$44(android.widget.CompoundButton r1, boolean r2) {
            r0 = this;
            ca.dnamobile.javalauncher.controls.ControlsPreferences.setTouchControlsEnabled(r0, r2)
            r0.updateTouchControlsSwitchText(r2)
            return
    }

    private /* synthetic */ void lambda$refreshControllerSettingsValues$45(android.widget.CompoundButton r1, boolean r2) {
            r0 = this;
            ca.dnamobile.javalauncher.settings.LauncherPreferences.setForceSdlControllerBridge(r0, r2)
            r0.updateForceSdlControllerBridgeSwitchText(r2)
            return
    }

    private /* synthetic */ void lambda$registerDroidBridgeBackupFolderPickerLauncher$58(androidx.activity.result.ActivityResult r3) {
            r2 = this;
            int r0 = r3.getResultCode()
            r1 = -1
            if (r0 != r1) goto L2d
            android.content.Intent r0 = r3.getData()
            if (r0 != 0) goto Le
            goto L2d
        Le:
            android.content.Intent r0 = r3.getData()
            android.net.Uri r0 = r0.getData()
            if (r0 != 0) goto L19
            return
        L19:
            android.content.Intent r3 = r3.getData()     // Catch: java.lang.Throwable -> L2a
            int r3 = r3.getFlags()     // Catch: java.lang.Throwable -> L2a
            r3 = r3 & 3
            android.content.ContentResolver r1 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L2a
            r1.takePersistableUriPermission(r0, r3)     // Catch: java.lang.Throwable -> L2a
        L2a:
            r2.startDroidBridgeBackup(r0)
        L2d:
            return
    }

    private /* synthetic */ void lambda$registerDroidBridgeRestoreZipPickerLauncher$59(androidx.activity.result.ActivityResult r3) {
            r2 = this;
            int r0 = r3.getResultCode()
            r1 = -1
            if (r0 != r1) goto L2d
            android.content.Intent r0 = r3.getData()
            if (r0 != 0) goto Le
            goto L2d
        Le:
            android.content.Intent r0 = r3.getData()
            android.net.Uri r0 = r0.getData()
            if (r0 != 0) goto L19
            return
        L19:
            android.content.Intent r3 = r3.getData()     // Catch: java.lang.Throwable -> L2a
            int r3 = r3.getFlags()     // Catch: java.lang.Throwable -> L2a
            r3 = r3 & 1
            android.content.ContentResolver r1 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L2a
            r1.takePersistableUriPermission(r0, r3)     // Catch: java.lang.Throwable -> L2a
        L2a:
            r2.confirmDroidBridgeRestore(r0)
        L2d:
            return
    }

    private /* synthetic */ void lambda$registerJarExecutionPickerLauncher$81(androidx.activity.result.ActivityResult r3) {
            r2 = this;
            int r0 = r3.getResultCode()
            r1 = -1
            if (r0 != r1) goto L1c
            android.content.Intent r0 = r3.getData()
            if (r0 != 0) goto Le
            goto L1c
        Le:
            android.content.Intent r3 = r3.getData()
            android.net.Uri r3 = r3.getData()
            if (r3 != 0) goto L19
            return
        L19:
            r2.confirmExecuteJarFile(r3)
        L1c:
            return
    }

    private /* synthetic */ void lambda$registerMicrophonePermissionLauncher$56(java.lang.Boolean r3) {
            r2 = this;
            r2.updateSimpleVoiceChatPermissionUi()
            boolean r0 = r3.booleanValue()
            if (r0 == 0) goto Lc
            int r0 = ca.dnamobile.javalauncher.R.string.simple_voice_chat_permission_granted_toast
            goto Le
        Lc:
            int r0 = ca.dnamobile.javalauncher.R.string.simple_voice_chat_permission_denied_toast
        Le:
            boolean r1 = r3.booleanValue()
            r1 = r1 ^ 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L24
            r2.showSimpleVoiceChatPermissionDeniedDialog()
        L24:
            return
    }

    private /* synthetic */ void lambda$registerMicrosoftSkinPickerLauncher$13(androidx.activity.result.ActivityResult r3) {
            r2 = this;
            int r0 = r3.getResultCode()
            r1 = -1
            if (r0 != r1) goto L1c
            android.content.Intent r0 = r3.getData()
            if (r0 != 0) goto Le
            goto L1c
        Le:
            android.content.Intent r3 = r3.getData()
            android.net.Uri r3 = r3.getData()
            if (r3 != 0) goto L19
            return
        L19:
            r2.prepareMicrosoftSkinUpload(r3)
        L1c:
            return
    }

    private /* synthetic */ void lambda$registerMobileGluesFolderPickerLauncher$57(androidx.activity.result.ActivityResult r3) {
            r2 = this;
            int r0 = r3.getResultCode()
            r1 = -1
            if (r0 != r1) goto L42
            android.content.Intent r0 = r3.getData()
            if (r0 != 0) goto Le
            goto L42
        Le:
            android.content.Intent r0 = r3.getData()
            android.net.Uri r0 = r0.getData()
            if (r0 != 0) goto L19
            return
        L19:
            android.content.Intent r3 = r3.getData()     // Catch: java.lang.Throwable -> L2a
            int r3 = r3.getFlags()     // Catch: java.lang.Throwable -> L2a
            r3 = r3 & 3
            android.content.ContentResolver r1 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L2a
            r1.takePersistableUriPermission(r0, r3)     // Catch: java.lang.Throwable -> L2a
        L2a:
            ca.dnamobile.javalauncher.renderer.MobileGluesConfigHelper$SelectionResult r3 = ca.dnamobile.javalauncher.renderer.MobileGluesConfigHelper.setSelectedConfigTreeUri(r2, r0)
            ca.dnamobile.javalauncher.renderer.RendererInterface r0 = r2.getSelectedRendererFromSpinner()
            r2.updateMobileGluesConfigSummary(r0)
            java.lang.String r0 = r3.message
            boolean r3 = r3.success
            r3 = r3 ^ 1
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r0, r3)
            r3.show()
        L42:
            return
    }

    private /* synthetic */ void lambda$registerMouseCursorIconPickerLauncher$48(androidx.activity.result.ActivityResult r3) {
            r2 = this;
            int r0 = r3.getResultCode()
            r1 = -1
            if (r0 != r1) goto L1c
            android.content.Intent r0 = r3.getData()
            if (r0 != 0) goto Le
            goto L1c
        Le:
            android.content.Intent r3 = r3.getData()
            android.net.Uri r3 = r3.getData()
            if (r3 != 0) goto L19
            return
        L19:
            r2.importCustomMouseCursorIcon(r3)
        L1c:
            return
    }

    private /* synthetic */ void lambda$registerNotificationPermissionLauncher$53(java.lang.Boolean r3) {
            r2 = this;
            boolean r0 = r3.booleanValue()
            ca.dnamobile.javalauncher.notifications.LauncherNotificationPermissionHelper.setBackgroundInstallNotificationsEnabled(r2, r0)
            r2.updateInstallNotificationSettingsUi()
            boolean r0 = r3.booleanValue()
            if (r0 == 0) goto L13
            int r0 = ca.dnamobile.javalauncher.R.string.notification_permission_enabled_toast
            goto L15
        L13:
            int r0 = ca.dnamobile.javalauncher.R.string.notification_permission_denied_toast
        L15:
            boolean r1 = r3.booleanValue()
            r1 = r1 ^ 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L31
            boolean r3 = ca.dnamobile.javalauncher.notifications.LauncherNotificationPermissionHelper.requiresRuntimePermission()
            if (r3 == 0) goto L31
            r2.showNotificationDeniedSettingsDialog()
        L31:
            return
    }

    private /* synthetic */ void lambda$registerOfflineSkinPickerLauncher$14(androidx.activity.result.ActivityResult r3) {
            r2 = this;
            int r0 = r3.getResultCode()
            r1 = -1
            if (r0 != r1) goto L2b
            android.content.Intent r0 = r3.getData()
            if (r0 != 0) goto Le
            goto L2b
        Le:
            android.content.Intent r3 = r3.getData()
            android.net.Uri r3 = r3.getData()
            if (r3 != 0) goto L19
            return
        L19:
            r2.pendingOfflineSkinUri = r3
            android.widget.ImageView r0 = r2.pendingOfflineSkinPreview
            if (r0 == 0) goto L22
            r2.updatePendingOfflineSkinPreview(r3)
        L22:
            android.widget.TextView r3 = r2.pendingOfflineSkinLabel
            if (r3 == 0) goto L2b
            int r0 = ca.dnamobile.javalauncher.R.string.offline_account_skin_selected
            r3.setText(r0)
        L2b:
            return
    }

    static /* synthetic */ void lambda$registerSkinPickerLauncher$12(androidx.activity.result.ActivityResult r0) {
            return
    }

    private /* synthetic */ void lambda$scrollToSettingsSection$1(android.view.View r3) {
            r2 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            android.widget.ScrollView r0 = r0.settingsScrollView
            int r3 = r3.getTop()
            r1 = 1090519040(0x41000000, float:8.0)
            int r1 = r2.dp(r1)
            int r3 = r3 - r1
            r1 = 0
            int r3 = java.lang.Math.max(r1, r3)
            r0.smoothScrollTo(r1, r3)
            return
    }

    private /* synthetic */ void lambda$setupAccountUi$2(android.view.View r1) {
            r0 = this;
            r1 = 0
            r0.startMicrosoftSignInFlow(r1)
            return
    }

    private /* synthetic */ void lambda$setupAccountUi$3(android.view.View r1) {
            r0 = this;
            r1 = 1
            r0.startMicrosoftSignInFlow(r1)
            return
    }

    private /* synthetic */ void lambda$setupAccountUi$4(android.view.View r1) {
            r0 = this;
            r0.showMicrosoftAccountsDialog()
            return
    }

    private /* synthetic */ void lambda$setupAccountUi$5(android.view.View r1) {
            r0 = this;
            r0.showSignOutConfirmationDialog()
            return
    }

    private /* synthetic */ void lambda$setupAccountUi$6(android.view.View r1) {
            r0 = this;
            r0.useRememberedMicrosoftAccount()
            return
    }

    private /* synthetic */ void lambda$setupAccountUi$7(android.view.View r1) {
            r0 = this;
            r0.showOfflineAccountsDialog()
            return
    }

    private /* synthetic */ void lambda$setupAccountUi$8(android.view.View r1) {
            r0 = this;
            r1 = 1
            r0.refreshMicrosoftAccountAndSkin(r1)
            return
    }

    private /* synthetic */ void lambda$setupChangeMicrosoftCapeButton$10(android.view.View r1) {
            r0 = this;
            r0.showChangeMicrosoftCapeDialog()
            return
    }

    private /* synthetic */ void lambda$setupChangeMicrosoftSkinButton$9(android.view.View r1) {
            r0 = this;
            r0.showChangeMicrosoftSkinDialog()
            return
    }

    private /* synthetic */ void lambda$setupControllerSettings$39() {
            r0 = this;
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r0)
            return
    }

    private /* synthetic */ void lambda$setupControllerSettings$40() {
            r1 = this;
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda99 r0 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda99
            r0.<init>(r1)
            r1.runOnUiThread(r0)
            return
    }

    private /* synthetic */ void lambda$setupControllerSettings$41(android.view.View r1) {
            r0 = this;
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda114 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda114
            r1.<init>(r0)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog.show(r0, r1)
            return
    }

    private /* synthetic */ void lambda$setupControllerSettings$42(android.view.View r2) {
            r1 = this;
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<ca.dnamobile.javalauncher.controls.ControlsActivity> r0 = ca.dnamobile.javalauncher.controls.ControlsActivity.class
            r2.<init>(r1, r0)
            r1.startActivity(r2)
            return
    }

    private /* synthetic */ void lambda$setupControllerSettings$43(android.view.View r1) {
            r0 = this;
            r0.showMouseCursorIconDialog()
            return
    }

    private /* synthetic */ void lambda$setupFloatingGameOverlaySettings$96(com.google.android.material.switchmaterial.SwitchMaterial r1, android.widget.CompoundButton r2, boolean r3) {
            r0 = this;
            ca.dnamobile.javalauncher.settings.GameOverlayPreferences.setShowGameFpsCounter(r0, r3)
            r0.updateFloatingFpsSwitchText(r1, r3)
            return
    }

    private /* synthetic */ void lambda$setupFloatingGameOverlaySettings$97(android.view.View r1) {
            r0 = this;
            ca.dnamobile.javalauncher.settings.GameOverlayPreferences.resetGameSettingsButtonCustomPosition(r0)
            return
    }

    private /* synthetic */ void lambda$setupGameDisplaySettings$33(android.view.View r1) {
            r0 = this;
            r0.openResolutionScaleInputDialog()
            return
    }

    private /* synthetic */ void lambda$setupInstanceSettings$15(android.view.View r1) {
            r0 = this;
            r0.showDroidBridgeBackupDialog()
            return
    }

    private /* synthetic */ void lambda$setupInstanceSettings$16(android.view.View r1) {
            r0 = this;
            r0.showDroidBridgeRestoreDialog()
            return
    }

    private /* synthetic */ void lambda$setupInstanceSettings$17(android.widget.CompoundButton r1, boolean r2) {
            r0 = this;
            ca.dnamobile.javalauncher.settings.LauncherPreferences.setShowSharedInstalls(r0, r2)
            r0.updateSharedInstallsSwitchText(r2)
            return
    }

    private /* synthetic */ void lambda$setupInstanceSettings$18(android.widget.CompoundButton r1, boolean r2) {
            r0 = this;
            ca.dnamobile.javalauncher.settings.LauncherPreferences.setRemoveInheritedVanillaAfterLoaderInstall(r0, r2)
            r0.updateRemoveInheritedVanillaSwitchText(r2)
            return
    }

    private /* synthetic */ void lambda$setupJarExecutionSettings$82(android.view.View r1) {
            r0 = this;
            r0.openJarExecutionPicker()
            return
    }

    private /* synthetic */ void lambda$setupLauncherSettings$77(android.widget.CompoundButton r1, boolean r2) {
            r0 = this;
            ca.dnamobile.javalauncher.logs.LauncherLogManager.setKeepLogHistoryEnabled(r0, r2)
            return
    }

    private /* synthetic */ void lambda$setupLauncherSettings$78(android.widget.CompoundButton r1, boolean r2) {
            r0 = this;
            ca.dnamobile.javalauncher.settings.LauncherPreferences.setShowInGameSettingsButton(r0, r2)
            r0.updateInGameSettingsButtonSwitchText(r2)
            return
    }

    private /* synthetic */ void lambda$setupLauncherSettings$79(android.widget.CompoundButton r1, boolean r2) {
            r0 = this;
            ca.dnamobile.javalauncher.settings.LauncherPreferences.setShowGameLogOverlay(r0, r2)
            r0.updateGameLogOverlaySwitchText(r2)
            return
    }

    private /* synthetic */ void lambda$setupLauncherSettings$80(android.view.View r1) {
            r0 = this;
            ca.dnamobile.javalauncher.logs.LauncherLogManager.shareLatestLog(r0)
            return
    }

    private /* synthetic */ void lambda$setupLegalLinkButton$100(boolean r1, java.lang.String r2, java.lang.String r3, android.view.View r4) {
            r0 = this;
            if (r1 == 0) goto L8
            boolean r1 = ca.dnamobile.javalauncher.legal.LegalLinks.open(r0, r2)
            if (r1 != 0) goto L10
        L8:
            r1 = 1
            android.widget.Toast r1 = android.widget.Toast.makeText(r0, r3, r1)
            r1.show()
        L10:
            return
    }

    private /* synthetic */ void lambda$setupMemorySettings$101(android.view.View r1) {
            r0 = this;
            r0.openMemoryInputDialog()
            return
    }

    private /* synthetic */ void lambda$setupRenderSurfaceSettings$32(android.widget.CompoundButton r1, boolean r2) {
            r0 = this;
            ca.dnamobile.javalauncher.settings.LauncherPreferences.setUseNativeSurfaceView(r0, r2)
            r0.updateRenderSurfaceSwitchText(r2)
            return
    }

    private /* synthetic */ boolean lambda$setupRendererSettings$19(android.view.View r1, android.view.MotionEvent r2) {
            r0 = this;
            int r1 = r2.getAction()
            r2 = 1
            if (r1 != r2) goto La
            r0.showRendererPickerDialog()
        La:
            return r2
    }

    private /* synthetic */ void lambda$setupRendererSettings$20(android.view.View r1) {
            r0 = this;
            r0.showDownloadRenderersDialog()
            return
    }

    private /* synthetic */ boolean lambda$setupRendererSettings$21(android.view.View r1, android.view.MotionEvent r2) {
            r0 = this;
            int r1 = r2.getAction()
            r2 = 1
            if (r1 != r2) goto La
            r0.showVulkanDriverPickerDialog()
        La:
            return r2
    }

    private /* synthetic */ void lambda$setupRendererSettings$22(android.view.View r1) {
            r0 = this;
            r0.openSelectedRendererPluginSettings()
            return
    }

    private /* synthetic */ void lambda$setupRendererSettings$23(android.view.View r1) {
            r0 = this;
            r0.openJavaLauncherStorageAccessSettings()
            return
    }

    private /* synthetic */ void lambda$setupRendererSettings$24(android.view.View r1) {
            r0 = this;
            r0.clearRendererPluginCache()
            return
    }

    private /* synthetic */ void lambda$setupRendererSettings$25(android.view.View r1) {
            r0 = this;
            ca.dnamobile.javalauncher.renderer.Renderers.reload(r0)
            ca.dnamobile.javalauncher.renderer.DriverPluginManager.reload(r0)
            r0.refreshRendererList()
            return
    }

    private /* synthetic */ void lambda$setupRendererSettings$26(android.widget.CompoundButton r1, boolean r2) {
            r0 = this;
            ca.dnamobile.javalauncher.settings.LauncherPreferences.setUseSystemVulkanDriver(r0, r2)
            r0.updateSystemVulkanDriverSwitchText(r2)
            ca.dnamobile.javalauncher.renderer.RendererInterface r1 = r0.getSelectedRendererFromSpinner()
            r0.updateVulkanDriverSettings(r1)
            return
    }

    private /* synthetic */ void lambda$setupRendererSettings$27(android.widget.CompoundButton r1, boolean r2) {
            r0 = this;
            ca.dnamobile.javalauncher.settings.LauncherPreferences.setUseOpenGlForMinecraft26Plus(r0, r2)
            r0.updateOpenGl26PlusSwitchText(r2)
            return
    }

    private /* synthetic */ void lambda$setupRuntimeComponentsReinstallSettings$89(android.view.View r1) {
            r0 = this;
            r0.showRuntimeComponentsReinstallDialog()
            return
    }

    private /* synthetic */ void lambda$setupSimpleVoiceChatSettings$75(android.view.View r2) {
            r1 = this;
            boolean r2 = ca.dnamobile.javalauncher.modcompat.AndroidMicrophonePermission.isGranted(r1)
            if (r2 == 0) goto La
            r1.showSimpleVoiceChatPermissionGrantedDialog()
            return
        La:
            androidx.activity.result.ActivityResultLauncher<java.lang.String> r2 = r1.microphonePermissionLauncher
            if (r2 == 0) goto L14
            java.lang.String r0 = "android.permission.RECORD_AUDIO"
            r2.launch(r0)
            goto L17
        L14:
            ca.dnamobile.javalauncher.modcompat.AndroidMicrophonePermission.showRequestDialog(r1)
        L17:
            return
    }

    private /* synthetic */ void lambda$setupUpdateCheckerSettings$98(android.widget.CompoundButton r1, boolean r2) {
            r0 = this;
            ca.dnamobile.javalauncher.update.LauncherUpdatePreferences.setAutoCheckEnabled(r0, r2)
            return
    }

    private /* synthetic */ void lambda$setupUpdateCheckerSettings$99(android.view.View r1) {
            r0 = this;
            ca.dnamobile.javalauncher.update.LauncherUpdateDialogs.checkManually(r0)
            return
    }

    private /* synthetic */ void lambda$showChangeMicrosoftCapeDialog$125(ca.dnamobile.javalauncher.data.AccountStore.Account r3, ca.dnamobile.javalauncher.skin.MicrosoftCapeService.Profile r4) {
            r2 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonChangeMicrosoftCape
            int r1 = ca.dnamobile.javalauncher.R.string.microsoft_cape_change_button
            r0.setText(r1)
            r2.updateChangeMicrosoftCapeButtonState(r3)
            r2.showMicrosoftCapePickerDialog(r3, r4)
            return
    }

    private /* synthetic */ void lambda$showChangeMicrosoftCapeDialog$126(ca.dnamobile.javalauncher.data.AccountStore.Account r3, java.lang.Throwable r4) {
            r2 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonChangeMicrosoftCape
            int r1 = ca.dnamobile.javalauncher.R.string.microsoft_cape_change_button
            r0.setText(r1)
            r2.updateChangeMicrosoftCapeButtonState(r3)
            java.lang.String r3 = r4.getMessage()
            if (r3 == 0) goto L17
            java.lang.String r3 = r4.getMessage()
            goto L1b
        L17:
            java.lang.String r3 = r4.toString()
        L1b:
            int r4 = ca.dnamobile.javalauncher.R.string.microsoft_cape_load_failed
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r3 = r2.getString(r4, r3)
            r4 = 1
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r4)
            r3.show()
            return
    }

    private /* synthetic */ void lambda$showChangeMicrosoftCapeDialog$127(ca.dnamobile.javalauncher.data.AccountStore.Account r3) {
            r2 = this;
            java.lang.String r0 = r3.minecraftAccessToken     // Catch: java.lang.Throwable -> Lf
            ca.dnamobile.javalauncher.skin.MicrosoftCapeService$Profile r0 = ca.dnamobile.javalauncher.skin.MicrosoftCapeService.fetchProfile(r0)     // Catch: java.lang.Throwable -> Lf
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda14 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda14     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r2, r3, r0)     // Catch: java.lang.Throwable -> Lf
            r2.runOnUiThread(r1)     // Catch: java.lang.Throwable -> Lf
            goto L18
        Lf:
            r0 = move-exception
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda15 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda15
            r1.<init>(r2, r3, r0)
            r2.runOnUiThread(r1)
        L18:
            return
    }

    private /* synthetic */ void lambda$showChangeMicrosoftSkinDialog$140(android.content.DialogInterface r1, int r2) {
            r0 = this;
            r0.openMicrosoftSkinPicker()
            return
    }

    static /* synthetic */ void lambda$showConfirmMicrosoftSkinUploadDialog$141(ca.dnamobile.javalauncher.skin.SkinModelType[] r0, android.content.DialogInterface r1, int r2) {
            r1 = 1
            if (r2 != r1) goto L6
            ca.dnamobile.javalauncher.skin.SkinModelType r1 = ca.dnamobile.javalauncher.skin.SkinModelType.SLIM
            goto L8
        L6:
            ca.dnamobile.javalauncher.skin.SkinModelType r1 = ca.dnamobile.javalauncher.skin.SkinModelType.CLASSIC
        L8:
            r2 = 0
            r0[r2] = r1
            return
    }

    private /* synthetic */ void lambda$showConfirmMicrosoftSkinUploadDialog$142(java.io.File r1, ca.dnamobile.javalauncher.skin.SkinModelType[] r2, android.content.DialogInterface r3, int r4) {
            r0 = this;
            r3 = 0
            r2 = r2[r3]
            r0.uploadMicrosoftAccountSkin(r1, r2)
            return
    }

    private /* synthetic */ void lambda$showDownloadRenderersDialog$28(android.app.AlertDialog r1, android.view.View r2) {
            r0 = this;
            r0.openRendererDownloadSite()
            r1.dismiss()
            return
    }

    private /* synthetic */ void lambda$showDownloadRenderersDialog$29(android.app.AlertDialog r2, android.content.DialogInterface r3) {
            r1 = this;
            r1.styleLauncherDialogChrome(r2)
            r3 = -1
            android.widget.Button r3 = r2.getButton(r3)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda56 r0 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda56
            r0.<init>(r1, r2)
            r3.setOnClickListener(r0)
            return
    }

    private /* synthetic */ void lambda$showDroidBridgeBackupDialog$60(android.content.DialogInterface r1, int r2) {
            r0 = this;
            r0.openDroidBridgeBackupFolderPicker()
            return
    }

    private /* synthetic */ void lambda$showDroidBridgeBackupDialog$61(java.io.File r1, android.content.DialogInterface r2, int r3) {
            r0 = this;
            java.lang.String r1 = r1.getAbsolutePath()
            r2 = 1
            android.widget.Toast r1 = android.widget.Toast.makeText(r0, r1, r2)
            r1.show()
            return
    }

    private /* synthetic */ void lambda$showDroidBridgeRestoreDialog$62(android.content.DialogInterface r1, int r2) {
            r0 = this;
            r0.openDroidBridgeRestoreZipPicker()
            return
    }

    private /* synthetic */ void lambda$showDroidBridgeRestoreDialog$63(java.io.File r1, android.content.DialogInterface r2, int r3) {
            r0 = this;
            java.lang.String r1 = r1.getAbsolutePath()
            r2 = 1
            android.widget.Toast r1 = android.widget.Toast.makeText(r0, r1, r2)
            r1.show()
            return
    }

    private /* synthetic */ void lambda$showEditOfflineAccountDialog$117(android.view.View r1) {
            r0 = this;
            r0.openOfflineSkinPicker()
            return
    }

    private /* synthetic */ void lambda$showEditOfflineAccountDialog$118(boolean[] r2, android.widget.ImageView r3, android.widget.TextView r4, android.view.View r5) {
            r1 = this;
            r5 = 0
            r1.pendingOfflineSkinUri = r5
            r5 = 0
            r0 = 1
            r2[r5] = r0
            int r2 = ca.dnamobile.javalauncher.R.drawable.ic_player_head_placeholder
            r3.setImageResource(r2)
            int r2 = ca.dnamobile.javalauncher.R.string.offline_account_skin_none
            r4.setText(r2)
            return
    }

    private /* synthetic */ void lambda$showEditOfflineAccountDialog$119(android.widget.EditText r4, ca.dnamobile.javalauncher.data.AccountStore.Account r5, boolean[] r6, android.app.AlertDialog r7, android.view.View r8) {
            r3 = this;
            android.text.Editable r8 = r4.getText()
            if (r8 != 0) goto L9
            java.lang.String r8 = ""
            goto L11
        L9:
            android.text.Editable r8 = r4.getText()
            java.lang.String r8 = r8.toString()
        L11:
            java.lang.String r8 = sanitizeOfflineName(r8)
            boolean r0 = isValidOfflineName(r8)
            if (r0 != 0) goto L25
            int r5 = ca.dnamobile.javalauncher.R.string.offline_account_invalid
            java.lang.String r5 = r3.getString(r5)
            r4.setError(r5)
            return
        L25:
            ca.dnamobile.javalauncher.data.AccountStore r0 = r3.accountStore     // Catch: java.lang.Throwable -> L55
            if (r5 == 0) goto L2c
            java.lang.String r5 = r5.accountId     // Catch: java.lang.Throwable -> L55
            goto L2d
        L2c:
            r5 = 0
        L2d:
            android.net.Uri r1 = r3.pendingOfflineSkinUri     // Catch: java.lang.Throwable -> L55
            r2 = 0
            boolean r6 = r6[r2]     // Catch: java.lang.Throwable -> L55
            ca.dnamobile.javalauncher.data.AccountStore$Account r5 = r0.saveOrUpdateOfflineAccount(r5, r8, r1, r6)     // Catch: java.lang.Throwable -> L55
            r3.updateAccountStatus(r5)     // Catch: java.lang.Throwable -> L55
            r3.updateSkinUi(r5)     // Catch: java.lang.Throwable -> L55
            int r6 = ca.dnamobile.javalauncher.R.string.offline_account_enabled     // Catch: java.lang.Throwable -> L55
            java.lang.String r5 = r5.getBestDisplayName()     // Catch: java.lang.Throwable -> L55
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L55
            java.lang.String r5 = r3.getString(r6, r5)     // Catch: java.lang.Throwable -> L55
            android.widget.Toast r5 = android.widget.Toast.makeText(r3, r5, r2)     // Catch: java.lang.Throwable -> L55
            r5.show()     // Catch: java.lang.Throwable -> L55
            r7.dismiss()     // Catch: java.lang.Throwable -> L55
            goto L68
        L55:
            r5 = move-exception
            java.lang.String r6 = r5.getMessage()
            if (r6 == 0) goto L61
            java.lang.String r5 = r5.getMessage()
            goto L65
        L61:
            java.lang.String r5 = r5.toString()
        L65:
            r4.setError(r5)
        L68:
            return
    }

    private /* synthetic */ void lambda$showEditOfflineAccountDialog$120(android.app.AlertDialog r8, android.widget.EditText r9, ca.dnamobile.javalauncher.data.AccountStore.Account r10, boolean[] r11, android.content.DialogInterface r12) {
            r7 = this;
            r12 = -1
            android.widget.Button r12 = r8.getButton(r12)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda5 r6 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda5
            r0 = r6
            r1 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r12.setOnClickListener(r6)
            return
    }

    private /* synthetic */ void lambda$showEditOfflineAccountDialog$121(android.content.DialogInterface r1) {
            r0 = this;
            r1 = 0
            r0.pendingOfflineSkinUri = r1
            r0.pendingOfflineSkinPreview = r1
            r0.pendingOfflineSkinLabel = r1
            return
    }

    private /* synthetic */ void lambda$showMicrosoftAccountsDialog$104(android.app.AlertDialog r1, android.view.View r2) {
            r0 = this;
            r1.dismiss()
            r1 = 1
            r0.startMicrosoftSignInFlow(r1)
            return
    }

    private /* synthetic */ void lambda$showMicrosoftAccountsDialog$105(android.app.AlertDialog r2, android.content.DialogInterface r3) {
            r1 = this;
            r1.styleLauncherDialogChrome(r2)
            r3 = -1
            android.widget.Button r3 = r2.getButton(r3)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda65 r0 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda65
            r0.<init>(r1, r2)
            r3.setOnClickListener(r0)
            return
    }

    private /* synthetic */ void lambda$showMicrosoftAccountsDialog$106(android.app.AlertDialog r1, android.content.DialogInterface r2) {
            r0 = this;
            android.app.AlertDialog r2 = r0.microsoftAccountsDialog
            if (r2 != r1) goto L7
            r1 = 0
            r0.microsoftAccountsDialog = r1
        L7:
            return
    }

    static /* synthetic */ void lambda$showMicrosoftCapePickerDialog$128(java.lang.String[] r2) {
            r0 = 0
            r1 = 0
            r2[r0] = r1
            return
    }

    static /* synthetic */ void lambda$showMicrosoftCapePickerDialog$129(java.lang.String[] r1, ca.dnamobile.javalauncher.skin.MicrosoftCapeService.CapeEntry r2) {
            r0 = 0
            java.lang.String r2 = r2.id
            r1[r0] = r2
            return
    }

    static /* synthetic */ void lambda$showMicrosoftCapePickerDialog$130(android.app.AlertDialog[] r1) {
            r0 = 0
            r1 = r1[r0]
            if (r1 == 0) goto L8
            r1.dismiss()
        L8:
            return
    }

    static /* synthetic */ void lambda$showMicrosoftCapePickerDialog$131(android.app.AlertDialog r1) {
            r0 = -1
            android.widget.Button r1 = r1.getButton(r0)
            r0 = 1
            r1.setEnabled(r0)
            return
    }

    private /* synthetic */ void lambda$showMicrosoftCapePickerDialog$132(android.app.AlertDialog r2, ca.dnamobile.javalauncher.data.AccountStore.Account r3, java.lang.String[] r4, android.app.AlertDialog[] r5, android.view.View r6) {
            r1 = this;
            r6 = -1
            android.widget.Button r6 = r2.getButton(r6)
            r0 = 0
            r6.setEnabled(r0)
            r4 = r4[r0]
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda17 r6 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda17
            r6.<init>(r5)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda18 r5 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda18
            r5.<init>(r2)
            r1.applyMicrosoftCapeSelection(r3, r4, r6, r5)
            return
    }

    private /* synthetic */ void lambda$showMicrosoftCapePickerDialog$133(android.app.AlertDialog r8, ca.dnamobile.javalauncher.data.AccountStore.Account r9, java.lang.String[] r10, android.app.AlertDialog[] r11, android.content.DialogInterface r12) {
            r7 = this;
            r7.styleLauncherDialogChrome(r8)
            r12 = -1
            android.widget.Button r12 = r8.getButton(r12)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda135 r6 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda135
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r12.setOnClickListener(r6)
            return
    }

    private /* synthetic */ void lambda$showMouseCursorIconDialog$49(int[] r3, java.lang.String[] r4, java.lang.String[] r5, android.widget.ImageView r6, int[] r7, android.widget.RadioGroup r8, int r9) {
            r2 = this;
            r8 = 0
            r0 = r8
        L2:
            int r1 = r3.length
            if (r0 >= r1) goto L16
            r1 = r3[r0]
            if (r1 != r9) goto L13
            r3 = r5[r0]
            r4[r8] = r3
            r4 = r7[r8]
            r2.updateMouseCursorIconPreview(r6, r3, r4)
            return
        L13:
            int r0 = r0 + 1
            goto L2
        L16:
            return
    }

    private /* synthetic */ void lambda$showMouseCursorIconDialog$50(android.app.AlertDialog r1, android.view.View r2) {
            r0 = this;
            r0.openMouseCursorIconPicker()
            r1.dismiss()
            return
    }

    private /* synthetic */ void lambda$showMouseCursorIconDialog$51(java.lang.String[] r3, android.app.AlertDialog r4, int[] r5, android.view.View r6) {
            r2 = this;
            r6 = 0
            r0 = r3[r6]
            java.lang.String r1 = "custom"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L21
            boolean r0 = ca.dnamobile.javalauncher.controls.ControlsPreferences.hasCustomMouseCursorIcon(r2)
            if (r0 != 0) goto L21
            java.lang.String r3 = "Choose a custom cursor image first."
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r6)
            r3.show()
            r2.openMouseCursorIconPicker()
            r4.dismiss()
            return
        L21:
            r3 = r3[r6]
            ca.dnamobile.javalauncher.controls.ControlsPreferences.setMouseCursorStyle(r2, r3)
            r3 = r5[r6]
            ca.dnamobile.javalauncher.controls.ControlsPreferences.setMouseCursorSizePercent(r2, r3)
            r2.updateMouseCursorIconSettingsSummary()
            java.lang.String r3 = "Mouse cursor settings saved."
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r6)
            r3.show()
            r4.dismiss()
            return
    }

    private /* synthetic */ void lambda$showMouseCursorIconDialog$52(android.app.AlertDialog r2, java.lang.String[] r3, int[] r4, android.content.DialogInterface r5) {
            r1 = this;
            r1.styleLauncherDialogChrome(r2)
            r5 = -1
            android.widget.Button r5 = r2.getButton(r5)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda84 r0 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda84
            r0.<init>(r1, r3, r2, r4)
            r5.setOnClickListener(r0)
            return
    }

    private /* synthetic */ void lambda$showNotificationDeniedSettingsDialog$55(android.content.DialogInterface r1, int r2) {
            r0 = this;
            ca.dnamobile.javalauncher.notifications.LauncherNotificationPermissionHelper.openAppNotificationSettings(r0)
            return
    }

    private /* synthetic */ void lambda$showOfflineAccountsDialog$111(android.app.AlertDialog r1, android.view.View r2) {
            r0 = this;
            r1.dismiss()
            r1 = 0
            r0.showEditOfflineAccountDialog(r1)
            return
    }

    private /* synthetic */ void lambda$showOfflineAccountsDialog$112(android.app.AlertDialog r2, android.content.DialogInterface r3) {
            r1 = this;
            r3 = -1
            android.widget.Button r3 = r2.getButton(r3)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda34 r0 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda34
            r0.<init>(r1, r2)
            r3.setOnClickListener(r0)
            return
    }

    private /* synthetic */ void lambda$showOfflineAccountsDialog$113(android.app.AlertDialog r1, android.content.DialogInterface r2) {
            r0 = this;
            android.app.AlertDialog r2 = r0.offlineAccountsDialog
            if (r2 != r1) goto L7
            r1 = 0
            r0.offlineAccountsDialog = r1
        L7:
            return
    }

    private /* synthetic */ void lambda$showRendererPickerDialog$30(int r3) {
            r2 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            android.widget.Spinner r0 = r0.spinnerRenderer
            r1 = 0
            r0.setSelection(r3, r1)
            r2.applyRendererSelection(r3)
            return
    }

    private /* synthetic */ void lambda$showRuntimeComponentsReinstallDialog$90(android.app.AlertDialog r1, android.view.View r2) {
            r0 = this;
            r1.dismiss()
            r0.startRuntimeComponentsReinstall()
            return
    }

    private /* synthetic */ void lambda$showRuntimeComponentsReinstallDialog$91(android.app.AlertDialog r2, android.content.DialogInterface r3) {
            r1 = this;
            r1.styleLauncherDialogChrome(r2)
            r3 = -1
            android.widget.Button r3 = r2.getButton(r3)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda143 r0 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda143
            r0.<init>(r1, r2)
            r3.setOnClickListener(r0)
            return
    }

    private /* synthetic */ void lambda$showSignOutConfirmationDialog$11(android.content.DialogInterface r1, int r2) {
            r0 = this;
            r0.performMicrosoftSignOut()
            return
    }

    private /* synthetic */ void lambda$showSimpleVoiceChatPermissionDeniedDialog$76(android.content.DialogInterface r1, int r2) {
            r0 = this;
            ca.dnamobile.javalauncher.modcompat.AndroidMicrophonePermission.openAppSettings(r0)
            return
    }

    static /* synthetic */ void lambda$showStyledSingleChoiceDialog$146(ca.dnamobile.javalauncher.LauncherSettingsActivity.StyledDialogItemCallback r0, int r1, android.app.AlertDialog[] r2) {
            r0.onItemSelected(r1)
            r0 = 0
            r0 = r2[r0]
            if (r0 == 0) goto Lb
            r0.dismiss()
        Lb:
            return
    }

    private /* synthetic */ void lambda$showStyledSingleChoiceDialog$147(android.app.AlertDialog r1, android.content.DialogInterface r2) {
            r0 = this;
            r0.styleLauncherDialogChrome(r1)
            return
    }

    private /* synthetic */ void lambda$showVulkanDriverPickerDialog$31(int r3) {
            r2 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            android.widget.Spinner r0 = r0.spinnerVulkanDriver
            r1 = 0
            r0.setSelection(r3, r1)
            r2.applyVulkanDriverSelection(r3)
            return
    }

    private /* synthetic */ void lambda$startDroidBridgeBackup$70(java.lang.String r1) {
            r0 = this;
            r0.updateDroidBridgeBackupSummary(r1)
            return
    }

    private /* synthetic */ void lambda$startDroidBridgeBackup$71(java.lang.String r2) {
            r1 = this;
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda35 r0 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda35
            r0.<init>(r1, r2)
            r1.runOnUiThread(r0)
            return
    }

    private /* synthetic */ void lambda$startDroidBridgeBackup$72(ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager.Result r5) {
            r4 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r4.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonBackupDroidBridgeData
            r1 = 1
            r0.setEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r4.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonRestoreDroidBridgeData
            r0.setEnabled(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Backup complete: "
            r0.<init>(r2)
            java.lang.String r2 = r5.fileName
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r2 = " • "
            java.lang.StringBuilder r0 = r0.append(r2)
            int r2 = r5.fileCount
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r2 = " files • "
            java.lang.StringBuilder r0 = r0.append(r2)
            long r2 = r5.byteCount
            java.lang.String r5 = ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager.formatBytes(r2)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            r4.updateDroidBridgeBackupSummary(r5)
            java.lang.String r5 = "DroidBridge backup created."
            android.widget.Toast r5 = android.widget.Toast.makeText(r4, r5, r1)
            r5.show()
            return
    }

    private /* synthetic */ void lambda$startDroidBridgeBackup$73(java.lang.Throwable r4) {
            r3 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonBackupDroidBridgeData
            r1 = 1
            r0.setEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonRestoreDroidBridgeData
            r0.setEnabled(r1)
            java.lang.String r0 = r4.getMessage()
            if (r0 == 0) goto L1a
            java.lang.String r4 = r4.getMessage()
            goto L1e
        L1a:
            java.lang.String r4 = r4.toString()
        L1e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Backup failed: "
            r0.<init>(r2)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            r3.updateDroidBridgeBackupSummary(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r1)
            r4.show()
            return
    }

    private /* synthetic */ void lambda$startDroidBridgeBackup$74(java.io.File r3, android.net.Uri r4) {
            r2 = this;
            android.content.Context r0 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L16
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda67 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda67     // Catch: java.lang.Throwable -> L16
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L16
            ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager$Result r3 = ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager.createBackup(r0, r3, r4, r1)     // Catch: java.lang.Throwable -> L16
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda68 r4 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda68     // Catch: java.lang.Throwable -> L16
            r4.<init>(r2, r3)     // Catch: java.lang.Throwable -> L16
            r2.runOnUiThread(r4)     // Catch: java.lang.Throwable -> L16
            goto L1f
        L16:
            r3 = move-exception
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda69 r4 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda69
            r4.<init>(r2, r3)
            r2.runOnUiThread(r4)
        L1f:
            return
    }

    private /* synthetic */ void lambda$startDroidBridgeRestore$65(java.lang.String r1) {
            r0 = this;
            r0.updateDroidBridgeBackupSummary(r1)
            return
    }

    private /* synthetic */ void lambda$startDroidBridgeRestore$66(java.lang.String r2) {
            r1 = this;
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda139 r0 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda139
            r0.<init>(r1, r2)
            r1.runOnUiThread(r0)
            return
    }

    private /* synthetic */ void lambda$startDroidBridgeRestore$67(ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager.RestoreResult r5) {
            r4 = this;
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r4)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r4.binding
            android.widget.TextView r0 = r0.textFolder
            int r1 = ca.dnamobile.javalauncher.R.string.launcher_folder_value
            java.lang.String r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = r4.getString(r1, r2)
            r0.setText(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r4.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonBackupDroidBridgeData
            r1 = 1
            r0.setEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r4.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonRestoreDroidBridgeData
            r0.setEnabled(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Restore complete: "
            r0.<init>(r2)
            int r2 = r5.fileCount
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r2 = " files • "
            java.lang.StringBuilder r0 = r0.append(r2)
            long r2 = r5.byteCount
            java.lang.String r2 = ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager.formatBytes(r2)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = r5.previousDataPath
            if (r2 == 0) goto L6f
            java.lang.String r2 = r5.previousDataPath
            java.lang.String r2 = r2.trim()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L6f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = "\nPrevious data moved to: "
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r5 = r5.previousDataPath
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r0 = r5.toString()
        L6f:
            r4.updateDroidBridgeBackupSummary(r0)
            java.lang.String r5 = "DroidBridge backup restored."
            android.widget.Toast r5 = android.widget.Toast.makeText(r4, r5, r1)
            r5.show()
            return
    }

    private /* synthetic */ void lambda$startDroidBridgeRestore$68(java.lang.Throwable r4) {
            r3 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonBackupDroidBridgeData
            r1 = 1
            r0.setEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonRestoreDroidBridgeData
            r0.setEnabled(r1)
            java.lang.String r0 = r4.getMessage()
            if (r0 == 0) goto L1a
            java.lang.String r4 = r4.getMessage()
            goto L1e
        L1a:
            java.lang.String r4 = r4.toString()
        L1e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Restore failed: "
            r0.<init>(r2)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            r3.updateDroidBridgeBackupSummary(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r1)
            r4.show()
            return
    }

    private /* synthetic */ void lambda$startDroidBridgeRestore$69(android.net.Uri r3, java.io.File r4) {
            r2 = this;
            android.content.Context r0 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L16
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda147 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda147     // Catch: java.lang.Throwable -> L16
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L16
            ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager$RestoreResult r3 = ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager.restoreBackup(r0, r3, r4, r1)     // Catch: java.lang.Throwable -> L16
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda1 r4 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda1     // Catch: java.lang.Throwable -> L16
            r4.<init>(r2, r3)     // Catch: java.lang.Throwable -> L16
            r2.runOnUiThread(r4)     // Catch: java.lang.Throwable -> L16
            goto L1f
        L16:
            r3 = move-exception
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda2 r4 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda2
            r4.<init>(r2, r3)
            r2.runOnUiThread(r4)
        L1f:
            return
    }

    private /* synthetic */ void lambda$startJarExecution$85(java.lang.String r2, int r3) {
            r1 = this;
            r1.resetJarExecutionButton()
            r1.updateJarExecutionSummary(r2)
            if (r3 != 0) goto Lb
            java.lang.String r2 = "Jar execution complete."
            goto L20
        Lb:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "Jar finished with exit code "
            r2.<init>(r0)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
        L20:
            r3 = 1
            android.widget.Toast r2 = android.widget.Toast.makeText(r1, r2, r3)
            r2.show()
            return
    }

    private /* synthetic */ void lambda$startJarExecution$86(java.lang.String r3) {
            r2 = this;
            r2.resetJarExecutionButton()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Jar execution failed: "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.updateJarExecutionSummary(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r0 = 1
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r0)
            r3.show()
            return
    }

    private /* synthetic */ void lambda$startJarExecution$87(java.lang.String r11, android.net.Uri r12, java.lang.String r13) {
            r10 = this;
            java.lang.String r0 = "LauncherSettings"
            java.lang.String r1 = "Running jar...\n"
            java.lang.String r2 = "Starting jar execution: "
            java.lang.String r3 = "-Djava.io.tmpdir="
            boolean r4 = r10.shouldAttemptGuiJarCompatibility(r11)     // Catch: java.lang.Throwable -> L183
            if (r4 == 0) goto L13
            ca.dnamobile.javalauncher.LauncherSettingsActivity$JarGuiCompatibility r4 = r10.findJarGuiCompatibility()     // Catch: java.lang.Throwable -> L183
            goto L14
        L13:
            r4 = 0
        L14:
            if (r4 == 0) goto L19
            java.io.File r5 = r4.javaExecutable     // Catch: java.lang.Throwable -> L183
            goto L1d
        L19:
            java.io.File r5 = r10.findJavaExecutableForJarExecution()     // Catch: java.lang.Throwable -> L183
        L1d:
            if (r5 == 0) goto L16d
            boolean r6 = r5.isFile()     // Catch: java.lang.Throwable -> L183
            if (r6 != 0) goto L27
            goto L16d
        L27:
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L183
            java.io.File r7 = r10.getCacheDir()     // Catch: java.lang.Throwable -> L183
            java.lang.String r8 = "jar_execution"
            r6.<init>(r7, r8)     // Catch: java.lang.Throwable -> L183
            boolean r7 = r6.exists()     // Catch: java.lang.Throwable -> L183
            if (r7 != 0) goto L47
            boolean r7 = r6.mkdirs()     // Catch: java.lang.Throwable -> L183
            if (r7 == 0) goto L3f
            goto L47
        L3f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L183
            java.lang.String r12 = "Could not create temporary jar execution folder."
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L183
            throw r11     // Catch: java.lang.Throwable -> L183
        L47:
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L183
            java.lang.String r8 = r10.sanitizeJarFileName(r11)     // Catch: java.lang.Throwable -> L183
            r7.<init>(r6, r8)     // Catch: java.lang.Throwable -> L183
            r10.copyUriToFile(r12, r7)     // Catch: java.lang.Throwable -> L183
            java.io.File r12 = r10.resolveJarExecutionWorkingDirectory()     // Catch: java.lang.Throwable -> L183
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L183
            r6.<init>()     // Catch: java.lang.Throwable -> L183
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L183
            r8.<init>()     // Catch: java.lang.Throwable -> L183
            java.lang.String r9 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L183
            r8.add(r9)     // Catch: java.lang.Throwable -> L183
            if (r4 == 0) goto L6e
            r10.addGuiJarCompatibilityArguments(r8, r4)     // Catch: java.lang.Throwable -> L183
            goto L90
        L6e:
            java.lang.String r9 = "-Xint"
            r8.add(r9)     // Catch: java.lang.Throwable -> L183
            java.lang.String r9 = "-Djava.awt.headless=true"
            r8.add(r9)     // Catch: java.lang.Throwable -> L183
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L183
            r9.<init>(r3)     // Catch: java.lang.Throwable -> L183
            java.io.File r3 = r10.getCacheDir()     // Catch: java.lang.Throwable -> L183
            java.lang.String r3 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L183
            java.lang.StringBuilder r3 = r9.append(r3)     // Catch: java.lang.Throwable -> L183
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L183
            r8.add(r3)     // Catch: java.lang.Throwable -> L183
        L90:
            java.lang.String r3 = "-jar"
            r8.add(r3)     // Catch: java.lang.Throwable -> L183
            java.lang.String r3 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> L183
            r8.add(r3)     // Catch: java.lang.Throwable -> L183
            java.util.ArrayList r3 = r10.splitCommandLineArguments(r13)     // Catch: java.lang.Throwable -> L183
            r8.addAll(r3)     // Catch: java.lang.Throwable -> L183
            java.lang.String r3 = r10.joinCommandForDisplay(r8)     // Catch: java.lang.Throwable -> L183
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L183
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L183
            java.lang.StringBuilder r2 = r7.append(r3)     // Catch: java.lang.Throwable -> L183
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L183
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r2)     // Catch: java.lang.Throwable -> L183
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L183
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L183
            java.lang.StringBuilder r1 = r2.append(r3)     // Catch: java.lang.Throwable -> L183
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L183
            r10.updateJarExecutionSummary(r1)     // Catch: java.lang.Throwable -> L183
            java.lang.ProcessBuilder r1 = new java.lang.ProcessBuilder     // Catch: java.lang.Throwable -> L183
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L183
            r1.directory(r12)     // Catch: java.lang.Throwable -> L183
            r2 = 1
            r1.redirectErrorStream(r2)     // Catch: java.lang.Throwable -> L183
            r10.configureJarExecutionEnvironment(r1, r5, r12)     // Catch: java.lang.Throwable -> L183
            if (r4 == 0) goto Ldb
            r10.configureJarGuiCompatibilityEnvironment(r1, r4, r12)     // Catch: java.lang.Throwable -> L183
        Ldb:
            java.lang.Process r12 = r1.start()     // Catch: java.lang.Throwable -> L183
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L183
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L183
            java.io.InputStream r3 = r12.getInputStream()     // Catch: java.lang.Throwable -> L183
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L183
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L183
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L183
        Lef:
            java.lang.String r2 = r1.readLine()     // Catch: java.lang.Throwable -> L163
            if (r2 == 0) goto L120
            int r3 = r6.length()     // Catch: java.lang.Throwable -> L163
            r4 = 12000(0x2ee0, float:1.6816E-41)
            if (r3 >= r4) goto L106
            java.lang.StringBuilder r3 = r6.append(r2)     // Catch: java.lang.Throwable -> L163
            r4 = 10
            r3.append(r4)     // Catch: java.lang.Throwable -> L163
        L106:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L163
            r3.<init>()     // Catch: java.lang.Throwable -> L163
            java.lang.String r4 = "Jar output: "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L163
            java.lang.StringBuilder r3 = r3.append(r2)     // Catch: java.lang.Throwable -> L163
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L163
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r3)     // Catch: java.lang.Throwable -> L163
            r10.updateJarExecutionSummary(r2)     // Catch: java.lang.Throwable -> L163
            goto Lef
        L120:
            r1.close()     // Catch: java.lang.Throwable -> L183
            int r12 = r12.waitFor()     // Catch: java.lang.Throwable -> L183
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L183
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L183
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L183
            r3 = 3500(0xdac, float:4.905E-42)
            if (r2 <= r3) goto L140
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L183
            int r2 = r2 - r3
            java.lang.String r1 = r1.substring(r2)     // Catch: java.lang.Throwable -> L183
        L140:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L183
            r2.<init>()     // Catch: java.lang.Throwable -> L183
            java.lang.String r3 = "Jar execution finished with exit code "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L183
            java.lang.StringBuilder r2 = r2.append(r12)     // Catch: java.lang.Throwable -> L183
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L183
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r2)     // Catch: java.lang.Throwable -> L183
            java.lang.String r11 = r10.buildJarExecutionFinalSummary(r12, r11, r13, r1)     // Catch: java.lang.Throwable -> L183
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda42 r13 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda42     // Catch: java.lang.Throwable -> L183
            r13.<init>(r10, r11, r12)     // Catch: java.lang.Throwable -> L183
            r10.runOnUiThread(r13)     // Catch: java.lang.Throwable -> L183
            goto L1a0
        L163:
            r11 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L168
            goto L16c
        L168:
            r12 = move-exception
            r11.addSuppressed(r12)     // Catch: java.lang.Throwable -> L183
        L16c:
            throw r11     // Catch: java.lang.Throwable -> L183
        L16d:
            boolean r11 = r10.shouldAttemptGuiJarCompatibility(r11)     // Catch: java.lang.Throwable -> L183
            if (r11 == 0) goto L17b
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L183
            java.lang.String r12 = "This jar uses a desktop Swing/AWT installer. DroidBridge can only show that installer if Internal-8 plus the Cacio/Caciocavallo compatibility jars are bundled. Fabric-style command-line jars still work without that pack."
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L183
            throw r11     // Catch: java.lang.Throwable -> L183
        L17b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L183
            java.lang.String r12 = "No bundled Java executable was found. Reinstall components and JREs, then try again."
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L183
            throw r11     // Catch: java.lang.Throwable -> L183
        L183:
            r11 = move-exception
            java.lang.String r12 = "Jar execution failed"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r12, r11)
            java.lang.String r12 = r11.getMessage()
            if (r12 == 0) goto L194
            java.lang.String r11 = r11.getMessage()
            goto L198
        L194:
            java.lang.String r11 = r11.toString()
        L198:
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda43 r12 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda43
            r12.<init>(r10, r11)
            r10.runOnUiThread(r12)
        L1a0:
            return
    }

    private /* synthetic */ void lambda$startRuntimeComponentsReinstall$92() {
            r4 = this;
            r0 = 0
            r4.runtimeComponentsReinstalling = r0
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r4)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r4.binding
            r1 = 1
            if (r0 == 0) goto L32
            com.google.android.material.button.MaterialButton r0 = r0.buttonReinstallRuntimeComponents
            r0.setEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r4.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonReinstallRuntimeComponents
            java.lang.String r2 = "Reinstall components and JREs"
            r0.setText(r2)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r4.binding
            android.widget.TextView r0 = r0.textFolder
            if (r0 == 0) goto L32
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r4.binding
            android.widget.TextView r0 = r0.textFolder
            int r2 = ca.dnamobile.javalauncher.R.string.launcher_folder_value
            java.lang.String r3 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r2 = r4.getString(r2, r3)
            r0.setText(r2)
        L32:
            java.lang.String r0 = "Reinstall complete. Restart DroidBridge before launching Minecraft again."
            r4.updateRuntimeComponentsReinstallSummary(r0)
            java.lang.String r0 = "Runtime components reinstalled. Restart DroidBridge before launching Minecraft."
            android.widget.Toast r0 = android.widget.Toast.makeText(r4, r0, r1)
            r0.show()
            return
    }

    private /* synthetic */ void lambda$startRuntimeComponentsReinstall$93(java.lang.Throwable r4) {
            r3 = this;
            r0 = 0
            r3.runtimeComponentsReinstalling = r0
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            r1 = 1
            if (r0 == 0) goto L1c
            com.google.android.material.button.MaterialButton r0 = r0.buttonReinstallRuntimeComponents
            if (r0 == 0) goto L1c
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonReinstallRuntimeComponents
            r0.setEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonReinstallRuntimeComponents
            java.lang.String r2 = "Reinstall components and JREs"
            r0.setText(r2)
        L1c:
            java.lang.String r0 = r4.getMessage()
            if (r0 == 0) goto L27
            java.lang.String r4 = r4.getMessage()
            goto L2b
        L27:
            java.lang.String r4 = r4.toString()
        L2b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Reinstall failed: "
            r0.<init>(r2)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            r3.updateRuntimeComponentsReinstallSummary(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r1)
            r4.show()
            return
    }

    private /* synthetic */ void lambda$startRuntimeComponentsReinstall$94() {
            r9 = this;
            java.lang.String r0 = "LauncherSettings"
            android.content.Context r1 = r9.getApplicationContext()     // Catch: java.lang.Throwable -> L98
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r1)     // Catch: java.lang.Throwable -> L98
            java.util.List r1 = r9.buildRuntimeComponentReinstallTasks()     // Catch: java.lang.Throwable -> L98
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L98
            int r2 = r2 + 1
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L98
            r3 = 0
        L18:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L98
            java.lang.String r5 = ")..."
            java.lang.String r6 = "/"
            if (r4 == 0) goto L61
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L98
            ca.dnamobile.javalauncher.LauncherSettingsActivity$RuntimeTaskEntry r4 = (ca.dnamobile.javalauncher.LauncherSettingsActivity.RuntimeTaskEntry) r4     // Catch: java.lang.Throwable -> L98
            int r3 = r3 + 1
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L98
            r7.<init>()     // Catch: java.lang.Throwable -> L98
            java.lang.String r8 = "Reinstalling "
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Throwable -> L98
            java.lang.String r8 = r4.name     // Catch: java.lang.Throwable -> L98
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Throwable -> L98
            java.lang.String r8 = " ("
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Throwable -> L98
            java.lang.StringBuilder r7 = r7.append(r3)     // Catch: java.lang.Throwable -> L98
            java.lang.StringBuilder r6 = r7.append(r6)     // Catch: java.lang.Throwable -> L98
            java.lang.StringBuilder r6 = r6.append(r2)     // Catch: java.lang.Throwable -> L98
            java.lang.StringBuilder r5 = r6.append(r5)     // Catch: java.lang.Throwable -> L98
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L98
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r5)     // Catch: java.lang.Throwable -> L98
            r9.updateRuntimeComponentsReinstallSummary(r5)     // Catch: java.lang.Throwable -> L98
            ca.dnamobile.javalauncher.feature.unpack.AbstractUnpackTask r4 = r4.task     // Catch: java.lang.Throwable -> L98
            r4.run()     // Catch: java.lang.Throwable -> L98
            goto L18
        L61:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L98
            r1.<init>()     // Catch: java.lang.Throwable -> L98
            java.lang.String r3 = "Finalizing single launcher files ("
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> L98
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L98
            java.lang.StringBuilder r1 = r1.append(r6)     // Catch: java.lang.Throwable -> L98
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L98
            java.lang.StringBuilder r1 = r1.append(r5)     // Catch: java.lang.Throwable -> L98
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L98
            r9.updateRuntimeComponentsReinstallSummary(r1)     // Catch: java.lang.Throwable -> L98
            ca.dnamobile.javalauncher.feature.unpack.UnpackSingleFilesTask r1 = new ca.dnamobile.javalauncher.feature.unpack.UnpackSingleFilesTask     // Catch: java.lang.Throwable -> L98
            android.content.Context r2 = r9.getApplicationContext()     // Catch: java.lang.Throwable -> L98
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L98
            r1.run()     // Catch: java.lang.Throwable -> L98
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda124 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda124     // Catch: java.lang.Throwable -> L98
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L98
            r9.runOnUiThread(r1)     // Catch: java.lang.Throwable -> L98
            goto La6
        L98:
            r1 = move-exception
            java.lang.String r2 = "Runtime/component reinstall failed"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r2, r1)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda125 r0 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda125
            r0.<init>(r9, r1)
            r9.runOnUiThread(r0)
        La6:
            return
    }

    private /* synthetic */ void lambda$updateInstallNotificationSettingsUi$54(android.widget.CompoundButton r1, boolean r2) {
            r0 = this;
            if (r2 != 0) goto La
            r1 = 0
            ca.dnamobile.javalauncher.notifications.LauncherNotificationPermissionHelper.setBackgroundInstallNotificationsEnabled(r0, r1)
            r0.updateInstallNotificationSettingsUi()
            return
        La:
            boolean r1 = ca.dnamobile.javalauncher.notifications.LauncherNotificationPermissionHelper.hasPostNotificationsPermission(r0)
            r2 = 1
            if (r1 == 0) goto L18
            ca.dnamobile.javalauncher.notifications.LauncherNotificationPermissionHelper.setBackgroundInstallNotificationsEnabled(r0, r2)
            r0.updateInstallNotificationSettingsUi()
            return
        L18:
            ca.dnamobile.javalauncher.notifications.LauncherNotificationPermissionHelper.setBackgroundInstallNotificationsEnabled(r0, r2)
            androidx.activity.result.ActivityResultLauncher<java.lang.String> r1 = r0.notificationPermissionLauncher
            if (r1 == 0) goto L22
            ca.dnamobile.javalauncher.notifications.LauncherNotificationPermissionHelper.requestPostNotificationsPermission(r1)
        L22:
            return
    }

    private /* synthetic */ void lambda$updateJarExecutionSummary$88(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "jar_execution"
            r1 = 0
            android.content.SharedPreferences r0 = r2.getSharedPreferences(r0, r1)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "last_summary"
            android.content.SharedPreferences$Editor r0 = r0.putString(r1, r3)
            r0.apply()
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            if (r0 == 0) goto L23
            android.widget.TextView r0 = r0.textJarExecutionSummary
            if (r0 == 0) goto L23
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            android.widget.TextView r0 = r0.textJarExecutionSummary
            r0.setText(r3)
        L23:
            return
    }

    private /* synthetic */ void lambda$updateMinecraftTouchGestureSettingsUi$46(android.widget.CompoundButton r1, boolean r2) {
            r0 = this;
            ca.dnamobile.javalauncher.controls.ControlsPreferences.setMinecraftTouchGesturesEnabled(r0, r2)
            r0.updateMinecraftTouchGesturesSwitchText(r2)
            r0.updateDoubleTapToDropEnabledState(r2)
            return
    }

    private /* synthetic */ void lambda$updateMinecraftTouchGestureSettingsUi$47(android.widget.CompoundButton r1, boolean r2) {
            r0 = this;
            ca.dnamobile.javalauncher.controls.ControlsPreferences.setDoubleTapToDropEnabled(r0, r2)
            r0.updateDoubleTapToDropSwitchText(r2)
            return
    }

    private /* synthetic */ void lambda$updateRuntimeComponentsReinstallSummary$95(java.lang.String r2) {
            r1 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r1.binding
            if (r0 == 0) goto Lf
            android.widget.TextView r0 = r0.textRuntimeComponentsSummary
            if (r0 == 0) goto Lf
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r1.binding
            android.widget.TextView r0 = r0.textRuntimeComponentsSummary
            r0.setText(r2)
        Lf:
            return
    }

    private /* synthetic */ void lambda$uploadMicrosoftAccountSkin$143() {
            r2 = this;
            int r0 = ca.dnamobile.javalauncher.R.string.microsoft_skin_upload_success
            r1 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
            r0 = 0
            r2.refreshMicrosoftAccountAndSkin(r0)
            return
    }

    private /* synthetic */ void lambda$uploadMicrosoftAccountSkin$144(java.lang.Throwable r5) {
            r4 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r4.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonChangeMicrosoftSkin
            r1 = 1
            r0.setEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r4.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonRefreshMicrosoftSkin
            r0.setEnabled(r1)
            java.lang.String r0 = r5.getMessage()
            if (r0 == 0) goto L1a
            java.lang.String r5 = r5.getMessage()
            goto L1e
        L1a:
            java.lang.String r5 = r5.toString()
        L1e:
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r4.binding
            android.widget.TextView r0 = r0.textSkinStatus
            int r2 = ca.dnamobile.javalauncher.R.string.microsoft_skin_upload_failed
            java.lang.Object[] r3 = new java.lang.Object[]{r5}
            java.lang.String r2 = r4.getString(r2, r3)
            r0.setText(r2)
            int r0 = ca.dnamobile.javalauncher.R.string.microsoft_skin_upload_failed
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r5 = r4.getString(r0, r5)
            android.widget.Toast r5 = android.widget.Toast.makeText(r4, r5, r1)
            r5.show()
            return
    }

    private /* synthetic */ void lambda$uploadMicrosoftAccountSkin$145(ca.dnamobile.javalauncher.data.AccountStore.Account r1, java.io.File r2, ca.dnamobile.javalauncher.skin.SkinModelType r3) {
            r0 = this;
            java.lang.String r1 = r1.minecraftAccessToken     // Catch: java.lang.Throwable -> Le
            ca.dnamobile.javalauncher.skin.MicrosoftSkinUploader.uploadSkin(r1, r2, r3)     // Catch: java.lang.Throwable -> Le
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda7 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda7     // Catch: java.lang.Throwable -> Le
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Le
            r0.runOnUiThread(r1)     // Catch: java.lang.Throwable -> Le
            goto L17
        Le:
            r1 = move-exception
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda8 r2 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda8
            r2.<init>(r0, r1)
            r0.runOnUiThread(r2)
        L17:
            return
    }

    private void loadCapePreviewInto(android.widget.ImageView r3, java.lang.String r4) {
            r2 = this;
            int r0 = ca.dnamobile.javalauncher.R.drawable.ic_cape_placeholder_24
            r3.setImageResource(r0)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            r3.setScaleType(r0)
            java.lang.String r4 = normalizeMinecraftTextureUrl(r4)
            boolean r0 = isNullOrBlank(r4)
            if (r0 == 0) goto L15
            return
        L15:
            java.lang.Thread r0 = new java.lang.Thread
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda100 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda100
            r1.<init>(r2, r4, r3)
            java.lang.String r3 = "Microsoft Cape Preview"
            r0.<init>(r1, r3)
            r0.start()
            return
    }

    private int memoryFromSeekBarProgress(int r3) {
            r2 = this;
            int r0 = ca.dnamobile.javalauncher.settings.MemoryAllocationUtils.getMaxAllocatableMemoryMb(r2)
            int r0 = ca.dnamobile.javalauncher.settings.MemoryAllocationUtils.getMinimumMemoryMb(r0)
            r1 = 0
            int r3 = java.lang.Math.max(r1, r3)
            int r3 = r3 * 256
            int r0 = r0 + r3
            int r3 = ca.dnamobile.javalauncher.settings.MemoryAllocationUtils.clampToAllowedRam(r2, r0)
            return r3
    }

    private static java.lang.String normalizeMinecraftTextureUrl(java.lang.String r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r3 = r3.trim()
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto Lf
            return r0
        Lf:
            java.lang.String r0 = "//"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "https:"
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            return r3
        L27:
            java.lang.String r0 = "http://textures.minecraft.net/"
            boolean r1 = r3.startsWith(r0)
            if (r1 == 0) goto L46
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "https://textures.minecraft.net/"
            r1.<init>(r2)
            int r0 = r0.length()
            java.lang.String r3 = r3.substring(r0)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
        L46:
            return r3
    }

    private void openCustomSkinPicker() {
            r0 = this;
            r0.showOfflineAccountsDialog()
            return
    }

    private void openDroidBridgeBackupFolderPicker() {
            r2 = this;
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r0 = r2.droidBridgeBackupFolderPickerLauncher
            if (r0 != 0) goto L5
            return
        L5:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.OPEN_DOCUMENT_TREE"
            r0.<init>(r1)
            r1 = 1
            r0.addFlags(r1)
            r1 = 2
            r0.addFlags(r1)
            r1 = 64
            r0.addFlags(r1)
            r1 = 128(0x80, float:1.8E-43)
            r0.addFlags(r1)
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r1 = r2.droidBridgeBackupFolderPickerLauncher
            r1.launch(r0)
            return
    }

    private void openDroidBridgeRestoreZipPicker() {
            r5 = this;
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r0 = r5.droidBridgeRestoreZipPickerLauncher
            if (r0 != 0) goto L5
            return
        L5:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.OPEN_DOCUMENT"
            r0.<init>(r1)
            java.lang.String r1 = "android.intent.category.OPENABLE"
            r0.addCategory(r1)
            java.lang.String r1 = "*/*"
            r0.setType(r1)
            r1 = 3
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            java.lang.String r3 = "application/zip"
            r1[r2] = r3
            java.lang.String r2 = "application/octet-stream"
            r3 = 1
            r1[r3] = r2
            r2 = 2
            java.lang.String r4 = "application/x-zip-compressed"
            r1[r2] = r4
            java.lang.String r2 = "android.intent.extra.MIME_TYPES"
            r0.putExtra(r2, r1)
            r0.addFlags(r3)
            r1 = 64
            r0.addFlags(r1)
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r1 = r5.droidBridgeRestoreZipPickerLauncher
            r1.launch(r0)
            return
    }

    private void openJarExecutionPicker() {
            r5 = this;
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r0 = r5.jarExecutionPickerLauncher
            if (r0 != 0) goto L5
            return
        L5:
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
            java.lang.String r3 = "application/java-archive"
            r1[r2] = r3
            java.lang.String r2 = "application/x-java-archive"
            r3 = 1
            r1[r3] = r2
            r2 = 2
            java.lang.String r4 = "application/octet-stream"
            r1[r2] = r4
            r2 = 3
            java.lang.String r4 = "application/zip"
            r1[r2] = r4
            java.lang.String r2 = "android.intent.extra.MIME_TYPES"
            r0.putExtra(r2, r1)
            r0.addFlags(r3)
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r1 = r5.jarExecutionPickerLauncher
            r1.launch(r0)
            return
    }

    private boolean openJavaGuiLauncherActivityIfAvailable(android.net.Uri r11, java.lang.String r12, java.lang.String r13) {
            r10 = this;
            r0 = 3
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = "ca.dnamobile.javalauncher.JavaGUILauncherActivity"
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "ca.dnamobile.javalauncher.gui.JavaGUILauncherActivity"
            r4 = 1
            r1[r4] = r2
            r2 = 2
            java.lang.String r5 = "net.kdt.pojavlaunch.JavaGUILauncherActivity"
            r1[r2] = r5
            r2 = r3
        L13:
            if (r2 >= r0) goto Ld5
            r5 = r1[r2]
            java.lang.Class r6 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> La7 java.lang.ClassNotFoundException -> Ld1
            android.content.Intent r7 = new android.content.Intent     // Catch: java.lang.Throwable -> La7 java.lang.ClassNotFoundException -> Ld1
            r7.<init>(r10, r6)     // Catch: java.lang.Throwable -> La7 java.lang.ClassNotFoundException -> Ld1
            java.lang.String r6 = "modUri"
            r7.putExtra(r6, r11)     // Catch: java.lang.Throwable -> La7 java.lang.ClassNotFoundException -> Ld1
            java.lang.String r6 = "forceShowLog"
            r7.putExtra(r6, r4)     // Catch: java.lang.Throwable -> La7 java.lang.ClassNotFoundException -> Ld1
            java.lang.String r6 = "openLogOutput"
            r7.putExtra(r6, r4)     // Catch: java.lang.Throwable -> La7 java.lang.ClassNotFoundException -> Ld1
            java.lang.String r6 = "subscribe_jvm_exit_event"
            r7.putExtra(r6, r4)     // Catch: java.lang.Throwable -> La7 java.lang.ClassNotFoundException -> Ld1
            java.lang.String r6 = "jre_name"
            java.lang.String r8 = "Internal-8"
            r7.putExtra(r6, r8)     // Catch: java.lang.Throwable -> La7 java.lang.ClassNotFoundException -> Ld1
            boolean r6 = isNullOrBlank(r13)     // Catch: java.lang.Throwable -> La7 java.lang.ClassNotFoundException -> Ld1
            if (r6 != 0) goto L73
            java.lang.String r6 = "javaArgs"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La7 java.lang.ClassNotFoundException -> Ld1
            r8.<init>()     // Catch: java.lang.Throwable -> La7 java.lang.ClassNotFoundException -> Ld1
            java.lang.String r9 = "-jar "
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: java.lang.Throwable -> La7 java.lang.ClassNotFoundException -> Ld1
            java.io.File r9 = r10.copyJarUriForGuiLauncher(r11, r12)     // Catch: java.lang.Throwable -> La7 java.lang.ClassNotFoundException -> Ld1
            java.lang.String r9 = r9.getAbsolutePath()     // Catch: java.lang.Throwable -> La7 java.lang.ClassNotFoundException -> Ld1
            java.lang.String r9 = r10.quoteCommandPartForDisplay(r9)     // Catch: java.lang.Throwable -> La7 java.lang.ClassNotFoundException -> Ld1
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: java.lang.Throwable -> La7 java.lang.ClassNotFoundException -> Ld1
            java.lang.String r9 = " "
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: java.lang.Throwable -> La7 java.lang.ClassNotFoundException -> Ld1
            java.lang.String r9 = r13.trim()     // Catch: java.lang.Throwable -> La7 java.lang.ClassNotFoundException -> Ld1
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: java.lang.Throwable -> La7 java.lang.ClassNotFoundException -> Ld1
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> La7 java.lang.ClassNotFoundException -> Ld1
            r7.putExtra(r6, r8)     // Catch: java.lang.Throwable -> La7 java.lang.ClassNotFoundException -> Ld1
        L73:
            r7.addFlags(r4)     // Catch: java.lang.Throwable -> La7 java.lang.ClassNotFoundException -> Ld1
            android.content.ContentResolver r6 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L7d
            r6.takePersistableUriPermission(r11, r4)     // Catch: java.lang.Throwable -> L7d
        L7d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La7 java.lang.ClassNotFoundException -> Ld1
            r6.<init>()     // Catch: java.lang.Throwable -> La7 java.lang.ClassNotFoundException -> Ld1
            java.lang.String r8 = "Opening Java GUI launcher for "
            java.lang.StringBuilder r6 = r6.append(r8)     // Catch: java.lang.Throwable -> La7 java.lang.ClassNotFoundException -> Ld1
            java.lang.StringBuilder r6 = r6.append(r12)     // Catch: java.lang.Throwable -> La7 java.lang.ClassNotFoundException -> Ld1
            java.lang.String r8 = " using "
            java.lang.StringBuilder r6 = r6.append(r8)     // Catch: java.lang.Throwable -> La7 java.lang.ClassNotFoundException -> Ld1
            java.lang.StringBuilder r5 = r6.append(r5)     // Catch: java.lang.Throwable -> La7 java.lang.ClassNotFoundException -> Ld1
            java.lang.String r6 = "..."
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> La7 java.lang.ClassNotFoundException -> Ld1
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> La7 java.lang.ClassNotFoundException -> Ld1
            r10.updateJarExecutionSummary(r5)     // Catch: java.lang.Throwable -> La7 java.lang.ClassNotFoundException -> Ld1
            r10.startActivity(r7)     // Catch: java.lang.Throwable -> La7 java.lang.ClassNotFoundException -> Ld1
            return r4
        La7:
            r11 = move-exception
            java.lang.String r12 = "LauncherSettings"
            java.lang.String r13 = "Unable to open Java GUI launcher Activity"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r12, r13, r11)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Java GUI launcher Activity was found but could not be opened: "
            r12.<init>(r13)
            java.lang.String r13 = r11.getMessage()
            if (r13 == 0) goto Lc1
            java.lang.String r11 = r11.getMessage()
            goto Lc5
        Lc1:
            java.lang.String r11 = r11.toString()
        Lc5:
            java.lang.StringBuilder r11 = r12.append(r11)
            java.lang.String r11 = r11.toString()
            r10.updateJarExecutionSummary(r11)
            return r4
        Ld1:
            int r2 = r2 + 1
            goto L13
        Ld5:
            return r3
    }

    private void openJavaLauncherStorageAccessSettings() {
            r2 = this;
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r0 = r2.mobileGluesFolderPickerLauncher
            if (r0 != 0) goto L5
            return
        L5:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.OPEN_DOCUMENT_TREE"
            r0.<init>(r1)
            r1 = 1
            r0.addFlags(r1)
            r1 = 2
            r0.addFlags(r1)
            r1 = 64
            r0.addFlags(r1)
            r1 = 128(0x80, float:1.8E-43)
            r0.addFlags(r1)
            ca.dnamobile.javalauncher.renderer.MobileGluesConfigHelper.addMgPickerHints(r0)
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r1 = r2.mobileGluesFolderPickerLauncher
            r1.launch(r0)
            return
    }

    private void openMemoryInputDialog() {
            r4 = this;
            int r0 = ca.dnamobile.javalauncher.settings.MemoryAllocationUtils.getMaxAllocatableMemoryMb(r4)
            int r1 = ca.dnamobile.javalauncher.settings.MemoryAllocationUtils.resolveAllocatedMemoryMb(r4)
            android.widget.EditText r2 = new android.widget.EditText
            r2.<init>(r4)
            r3 = 2
            r2.setInputType(r3)
            r3 = 1
            r2.setSingleLine(r3)
            r2.setSelectAllOnFocus(r3)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2.setText(r1)
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r4)
            int r3 = ca.dnamobile.javalauncher.R.string.memory_dialog_title
            android.app.AlertDialog$Builder r1 = r1.setTitle(r3)
            int r3 = ca.dnamobile.javalauncher.R.string.memory_dialog_message
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r4.getString(r3, r0)
            android.app.AlertDialog$Builder r0 = r1.setMessage(r0)
            android.app.AlertDialog$Builder r0 = r0.setView(r2)
            r1 = 17039360(0x1040000, float:2.424457E-38)
            r3 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r3)
            r1 = 17039370(0x104000a, float:2.42446E-38)
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r3)
            android.app.AlertDialog r0 = r0.create()
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda24 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda24
            r1.<init>(r4, r0, r2)
            r0.setOnShowListener(r1)
            r0.show()
            return
    }

    private void openMicrosoftSkinPicker() {
            r2 = this;
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r0 = r2.microsoftSkinPickerLauncher
            if (r0 != 0) goto L5
            return
        L5:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.OPEN_DOCUMENT"
            r0.<init>(r1)
            java.lang.String r1 = "android.intent.category.OPENABLE"
            r0.addCategory(r1)
            java.lang.String r1 = "image/png"
            r0.setType(r1)
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r1 = r2.microsoftSkinPickerLauncher
            r1.launch(r0)
            return
    }

    private void openMouseCursorIconPicker() {
            r2 = this;
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r0 = r2.mouseCursorIconPickerLauncher
            if (r0 != 0) goto L5
            return
        L5:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.OPEN_DOCUMENT"
            r0.<init>(r1)
            java.lang.String r1 = "android.intent.category.OPENABLE"
            r0.addCategory(r1)
            java.lang.String r1 = "image/*"
            r0.setType(r1)
            r1 = 1
            r0.addFlags(r1)
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r1 = r2.mouseCursorIconPickerLauncher
            r1.launch(r0)
            return
    }

    private void openOfflineSkinPicker() {
            r2 = this;
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r0 = r2.offlineSkinPickerLauncher
            if (r0 != 0) goto L5
            return
        L5:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.OPEN_DOCUMENT"
            r0.<init>(r1)
            java.lang.String r1 = "android.intent.category.OPENABLE"
            r0.addCategory(r1)
            java.lang.String r1 = "image/png"
            r0.setType(r1)
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r1 = r2.offlineSkinPickerLauncher
            r1.launch(r0)
            return
    }

    private void openRendererDownloadSite() {
            r4 = this;
            java.lang.String r0 = "https://github.com/MobileGL-Dev/MobileGlues-release/releases"
            boolean r1 = isNullOrBlank(r0)
            r2 = 1
            if (r1 == 0) goto L13
            java.lang.String r0 = "Renderer download site is not configured."
            android.widget.Toast r0 = android.widget.Toast.makeText(r4, r0, r2)
            r0.show()
            return
        L13:
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = "android.intent.action.VIEW"
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> L27
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = "android.intent.category.BROWSABLE"
            r1.addCategory(r0)     // Catch: java.lang.Throwable -> L27
            r4.startActivity(r1)     // Catch: java.lang.Throwable -> L27
            goto L30
        L27:
            java.lang.String r0 = "Unable to open renderer download site."
            android.widget.Toast r0 = android.widget.Toast.makeText(r4, r0, r2)
            r0.show()
        L30:
            return
    }

    private void openResolutionScaleInputDialog() {
            r5 = this;
            int r0 = ca.dnamobile.javalauncher.settings.LauncherPreferences.getGameResolutionScalePercent(r5)
            android.widget.EditText r1 = new android.widget.EditText
            r1.<init>(r5)
            r2 = 2
            r1.setInputType(r2)
            r2 = 1
            r1.setSingleLine(r2)
            r1.setSelectAllOnFocus(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.setText(r0)
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r5)
            int r2 = ca.dnamobile.javalauncher.R.string.settings_renderer_resolution_scale_title
            android.app.AlertDialog$Builder r0 = r0.setTitle(r2)
            int r2 = ca.dnamobile.javalauncher.R.string.settings_renderer_resolution_scale_dialog_message
            r3 = 25
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}
            java.lang.String r2 = r5.getString(r2, r3)
            android.app.AlertDialog$Builder r0 = r0.setMessage(r2)
            android.app.AlertDialog$Builder r0 = r0.setView(r1)
            r2 = 17039360(0x1040000, float:2.424457E-38)
            r3 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r2, r3)
            r2 = 17039370(0x104000a, float:2.42446E-38)
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r2, r3)
            android.app.AlertDialog r0 = r0.create()
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda102 r2 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda102
            r2.<init>(r5, r0, r1)
            r0.setOnShowListener(r2)
            r0.show()
            return
    }

    private void openSelectedRendererPluginSettings() {
            r2 = this;
            ca.dnamobile.javalauncher.renderer.RendererInterface r0 = r2.getSelectedRendererFromSpinner()
            if (r0 == 0) goto L10
            boolean r1 = r0.isExternalPlugin()
            if (r1 != 0) goto Ld
            goto L10
        Ld:
            ca.dnamobile.javalauncher.renderer.RendererPluginManager.openPluginApp(r2, r0)
        L10:
            return
    }

    private int parseMemoryInput(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L9
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
            int r1 = ca.dnamobile.javalauncher.settings.MemoryAllocationUtils.resolveAllocatedMemoryMb(r0)
            return r1
    }

    private int parseResolutionScaleInput(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L9
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
            int r1 = ca.dnamobile.javalauncher.settings.LauncherPreferences.getGameResolutionScalePercent(r0)
            return r1
    }

    private void performMicrosoftSignOut() {
            r4 = this;
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal r0 = r4.authManager
            if (r0 == 0) goto L54
            ca.dnamobile.javalauncher.data.AccountStore r1 = r4.accountStore
            if (r1 != 0) goto L9
            goto L54
        L9:
            r0.signOut()
            ca.dnamobile.javalauncher.data.AccountStore r0 = r4.accountStore
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r0.load()
            r4.updateAccountStatus(r0)
            r4.updateSkinUi(r0)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r4.binding
            com.google.android.material.button.MaterialButton r1 = r1.buttonRefreshMicrosoftSkin
            r2 = 0
            if (r1 == 0) goto L26
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r4.binding
            com.google.android.material.button.MaterialButton r1 = r1.buttonRefreshMicrosoftSkin
            r1.setEnabled(r2)
        L26:
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r4.binding
            com.google.android.material.button.MaterialButton r1 = r1.buttonAddMicrosoftAccount
            if (r1 == 0) goto L34
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r4.binding
            com.google.android.material.button.MaterialButton r1 = r1.buttonAddMicrosoftAccount
            r3 = 1
            r1.setEnabled(r3)
        L34:
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r4.binding
            com.google.android.material.button.MaterialButton r1 = r1.buttonManageMicrosoftAccounts
            if (r1 == 0) goto L45
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r4.binding
            com.google.android.material.button.MaterialButton r1 = r1.buttonManageMicrosoftAccounts
            boolean r3 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAccountRegistry.hasAny(r4)
            r1.setEnabled(r3)
        L45:
            r4.updateChangeMicrosoftSkinButtonState(r0)
            r4.updateChangeMicrosoftCapeButtonState(r0)
            int r0 = ca.dnamobile.javalauncher.R.string.msg_sign_out_success
            android.widget.Toast r0 = android.widget.Toast.makeText(r4, r0, r2)
            r0.show()
        L54:
            return
    }

    private void prepareMicrosoftSkinUpload(android.net.Uri r4) {
            r3 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r3.getCacheDir()
            java.lang.String r2 = "pending_microsoft_account_skin.png"
            r0.<init>(r1, r2)
            r1 = 1
            r3.copyUriToFile(r4, r0)     // Catch: java.lang.Throwable -> L2a
            boolean r4 = ca.dnamobile.javalauncher.skin.CustomSkinStore.isSkinValid(r0)     // Catch: java.lang.Throwable -> L2a
            if (r4 != 0) goto L22
            r0.delete()     // Catch: java.lang.Throwable -> L2a
            int r4 = ca.dnamobile.javalauncher.R.string.microsoft_skin_invalid     // Catch: java.lang.Throwable -> L2a
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r1)     // Catch: java.lang.Throwable -> L2a
            r4.show()     // Catch: java.lang.Throwable -> L2a
            return
        L22:
            ca.dnamobile.javalauncher.skin.SkinModelType r4 = ca.dnamobile.javalauncher.skin.CustomSkinStore.getSkinModel(r0)     // Catch: java.lang.Throwable -> L2a
            r3.showConfirmMicrosoftSkinUploadDialog(r0, r4)     // Catch: java.lang.Throwable -> L2a
            goto L41
        L2a:
            r4 = move-exception
            java.lang.String r0 = r4.getMessage()
            if (r0 == 0) goto L36
            java.lang.String r4 = r4.getMessage()
            goto L3a
        L36:
            java.lang.String r4 = r4.toString()
        L3a:
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r1)
            r4.show()
        L41:
            return
    }

    private int progressFromMemory(int r2) {
            r1 = this;
            int r0 = ca.dnamobile.javalauncher.settings.MemoryAllocationUtils.getMaxAllocatableMemoryMb(r1)
            int r0 = ca.dnamobile.javalauncher.settings.MemoryAllocationUtils.getMinimumMemoryMb(r0)
            int r2 = ca.dnamobile.javalauncher.settings.MemoryAllocationUtils.clampToAllowedRam(r1, r2)
            int r2 = r2 - r0
            int r2 = r2 / 256
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            return r2
    }

    private java.lang.String quoteCommandPartForDisplay(java.lang.String r6) {
            r5 = this;
            r0 = 32
            int r0 = r6.indexOf(r0)
            r1 = 34
            if (r0 >= 0) goto L19
            r0 = 9
            int r0 = r6.indexOf(r0)
            if (r0 >= 0) goto L19
            int r0 = r6.indexOf(r1)
            if (r0 >= 0) goto L19
            return r6
        L19:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "\""
            r0.<init>(r2)
            java.lang.String r3 = "\\"
            java.lang.String r4 = "\\\\"
            java.lang.String r6 = r6.replace(r3, r4)
            java.lang.String r3 = "\\\""
            java.lang.String r6 = r6.replace(r2, r3)
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r6 = r6.toString()
            return r6
    }

    private void refreshAccountUiFromStore() {
            r3 = this;
            ca.dnamobile.javalauncher.data.AccountStore r0 = r3.accountStore
            if (r0 == 0) goto L1f
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r3.binding
            if (r1 != 0) goto L9
            goto L1f
        L9:
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r0.load()     // Catch: java.lang.Throwable -> L17
            r3.updateAccountStatus(r0)     // Catch: java.lang.Throwable -> L17
            r3.updateSkinUi(r0)     // Catch: java.lang.Throwable -> L17
            r3.updateChangeMicrosoftSkinButtonState(r0)     // Catch: java.lang.Throwable -> L17
            goto L1f
        L17:
            r0 = move-exception
            java.lang.String r1 = "LauncherSettings"
            java.lang.String r2 = "Unable to refresh account UI"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r2, r0)
        L1f:
            return
    }

    private void refreshActiveCapeIntoPlayerModel(ca.dnamobile.javalauncher.data.AccountStore.Account r4) {
            r3 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            if (r0 == 0) goto L3e
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView r0 = r0.modelPlayerPreview
            if (r0 != 0) goto L9
            goto L3e
        L9:
            int r0 = r3.playerModelCapeLoadGeneration
            int r0 = r0 + 1
            r3.playerModelCapeLoadGeneration = r0
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r3.binding
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView r1 = r1.modelPlayerPreview
            r2 = 0
            r1.setCapeUrl(r2)
            if (r4 == 0) goto L3e
            boolean r1 = r4.isMicrosoftAccount()
            if (r1 == 0) goto L3e
            boolean r1 = r4.hasMinecraftSession()
            if (r1 != 0) goto L26
            goto L3e
        L26:
            java.lang.String r4 = r4.minecraftAccessToken
            boolean r1 = isNullOrBlank(r4)
            if (r1 == 0) goto L2f
            return
        L2f:
            java.lang.Thread r1 = new java.lang.Thread
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda39 r2 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda39
            r2.<init>(r3, r4, r0)
            java.lang.String r4 = "DroidBridgeActiveCapePreview"
            r1.<init>(r2, r4)
            r1.start()
        L3e:
            return
    }

    private void refreshControllerSettingsValues() {
            r3 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = ca.dnamobile.javalauncher.controls.ControlsPreferences.isTouchControlsEnabled(r3)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r3.binding
            com.google.android.material.switchmaterial.SwitchMaterial r1 = r1.switchTouchControlsEnabled
            r2 = 0
            r1.setOnCheckedChangeListener(r2)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r3.binding
            com.google.android.material.switchmaterial.SwitchMaterial r1 = r1.switchTouchControlsEnabled
            r1.setChecked(r0)
            r3.updateTouchControlsSwitchText(r0)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchTouchControlsEnabled
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda112 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda112
            r1.<init>(r3)
            r0.setOnCheckedChangeListener(r1)
            r3.updateMinecraftTouchGestureSettingsUi()
            r3.updateMouseCursorIconSettingsSummary()
            ca.dnamobile.javalauncher.input.GamepadMappingStore r0 = ca.dnamobile.javalauncher.input.GamepadMappingStore.get(r3)
            int r0 = r0.getHardwareMouseDpiScale()
            r3.updateHardwareMouseDpiScaleUi(r0)
            boolean r0 = ca.dnamobile.javalauncher.settings.LauncherPreferences.isForceSdlControllerBridge(r3)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r3.binding
            com.google.android.material.switchmaterial.SwitchMaterial r1 = r1.switchForceSdlControllerBridge
            r1.setOnCheckedChangeListener(r2)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r3.binding
            com.google.android.material.switchmaterial.SwitchMaterial r1 = r1.switchForceSdlControllerBridge
            r1.setChecked(r0)
            r3.updateForceSdlControllerBridgeSwitchText(r0)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchForceSdlControllerBridge
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda113 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda113
            r1.<init>(r3)
            r0.setOnCheckedChangeListener(r1)
            return
    }

    private void refreshGameDisplaySettingsValues() {
            r1 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r1.binding
            if (r0 == 0) goto L16
            android.widget.SeekBar r0 = r0.sliderGameResolutionScale
            if (r0 == 0) goto L16
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r1.binding
            android.widget.TextView r0 = r0.textGameResolutionScale
            if (r0 != 0) goto Lf
            goto L16
        Lf:
            int r0 = ca.dnamobile.javalauncher.settings.LauncherPreferences.getGameResolutionScalePercent(r1)
            r1.updateResolutionScaleUi(r0)
        L16:
            return
    }

    private void refreshMicrosoftAccountAndSkin(boolean r4) {
            r3 = this;
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal r0 = r3.authManager
            if (r0 != 0) goto L5
            return
        L5:
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonRefreshMicrosoftSkin
            r1 = 0
            r0.setEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            android.widget.TextView r0 = r0.textSkinStatus
            int r2 = ca.dnamobile.javalauncher.R.string.microsoft_skin_refreshing
            r0.setText(r2)
            if (r4 == 0) goto L21
            int r4 = ca.dnamobile.javalauncher.R.string.microsoft_skin_refreshing
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r1)
            r4.show()
        L21:
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal r4 = r3.authManager
            r4.refreshMicrosoftAccount()
            return
    }

    private void refreshRendererList() {
            r6 = this;
            r0 = 0
            r6.rendererSpinnerReady = r0
            java.util.List<ca.dnamobile.javalauncher.renderer.RendererInterface> r1 = r6.availableRenderers
            r1.clear()
            java.util.List<ca.dnamobile.javalauncher.renderer.RendererInterface> r1 = r6.availableRenderers
            java.util.List r2 = ca.dnamobile.javalauncher.renderer.Renderers.getCompatibleRenderers(r6)
            r1.addAll(r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List<ca.dnamobile.javalauncher.renderer.RendererInterface> r2 = r6.availableRenderers
            java.util.Iterator r2 = r2.iterator()
        L1c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4c
            java.lang.Object r3 = r2.next()
            ca.dnamobile.javalauncher.renderer.RendererInterface r3 = (ca.dnamobile.javalauncher.renderer.RendererInterface) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r3.getRendererName()
            java.lang.StringBuilder r4 = r4.append(r5)
            boolean r3 = r3.isExternalPlugin()
            if (r3 == 0) goto L3e
            java.lang.String r3 = "  •  Plugin"
            goto L40
        L3e:
            java.lang.String r3 = ""
        L40:
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            r1.add(r3)
            goto L1c
        L4c:
            android.widget.ArrayAdapter r2 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r2.<init>(r6, r3, r1)
            r1 = 17367049(0x1090009, float:2.516295E-38)
            r2.setDropDownViewResource(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r6.binding
            android.widget.Spinner r1 = r1.spinnerRenderer
            r1.setAdapter(r2)
            java.util.List<ca.dnamobile.javalauncher.renderer.RendererInterface> r1 = r6.availableRenderers
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L74
            r0 = 0
            r6.updateRendererPluginButtons(r0)
            r6.updateMobileGluesConfigSummary(r0)
            r6.updateVulkanDriverSettings(r0)
            return
        L74:
            java.util.List<ca.dnamobile.javalauncher.renderer.RendererInterface> r1 = r6.availableRenderers
            java.lang.String r2 = ca.dnamobile.javalauncher.settings.LauncherPreferences.getSelectedRendererIdentifier(r6)
            int r1 = ca.dnamobile.javalauncher.renderer.Renderers.indexOfRenderer(r1, r2)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r2 = r6.binding
            android.widget.Spinner r2 = r2.spinnerRenderer
            r2.setSelection(r1, r0)
            java.util.List<ca.dnamobile.javalauncher.renderer.RendererInterface> r0 = r6.availableRenderers
            java.lang.Object r0 = r0.get(r1)
            ca.dnamobile.javalauncher.renderer.RendererInterface r0 = (ca.dnamobile.javalauncher.renderer.RendererInterface) r0
            r6.updateRendererDescription(r0)
            java.util.List<ca.dnamobile.javalauncher.renderer.RendererInterface> r0 = r6.availableRenderers
            java.lang.Object r0 = r0.get(r1)
            ca.dnamobile.javalauncher.renderer.RendererInterface r0 = (ca.dnamobile.javalauncher.renderer.RendererInterface) r0
            r6.updateRendererPluginButtons(r0)
            java.util.List<ca.dnamobile.javalauncher.renderer.RendererInterface> r0 = r6.availableRenderers
            java.lang.Object r0 = r0.get(r1)
            ca.dnamobile.javalauncher.renderer.RendererInterface r0 = (ca.dnamobile.javalauncher.renderer.RendererInterface) r0
            r6.updateVulkanDriverSettings(r0)
            r0 = 1
            r6.rendererSpinnerReady = r0
            return
    }

    private void refreshSpecificMicrosoftAccount(ca.dnamobile.javalauncher.data.AccountStore.Account r4) {
            r3 = this;
            java.lang.String r0 = "Refreshing "
            ca.dnamobile.javalauncher.data.AccountStore r1 = r3.accountStore
            if (r1 == 0) goto L5e
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal r2 = r3.authManager
            if (r2 != 0) goto Lb
            goto L5e
        Lb:
            r1.saveMicrosoftAccount(r4)     // Catch: java.lang.Throwable -> L46
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAccountRegistry.save(r3, r4)     // Catch: java.lang.Throwable -> L46
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r3.binding     // Catch: java.lang.Throwable -> L46
            android.widget.TextView r1 = r1.textSkinStatus     // Catch: java.lang.Throwable -> L46
            int r2 = ca.dnamobile.javalauncher.R.string.microsoft_skin_refreshing     // Catch: java.lang.Throwable -> L46
            r1.setText(r2)     // Catch: java.lang.Throwable -> L46
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r3.binding     // Catch: java.lang.Throwable -> L46
            com.google.android.material.button.MaterialButton r1 = r1.buttonRefreshMicrosoftSkin     // Catch: java.lang.Throwable -> L46
            r2 = 0
            r1.setEnabled(r2)     // Catch: java.lang.Throwable -> L46
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L46
            java.lang.String r4 = r4.getBestDisplayName()     // Catch: java.lang.Throwable -> L46
            java.lang.StringBuilder r4 = r1.append(r4)     // Catch: java.lang.Throwable -> L46
            java.lang.String r0 = "..."
            java.lang.StringBuilder r4 = r4.append(r0)     // Catch: java.lang.Throwable -> L46
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L46
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r2)     // Catch: java.lang.Throwable -> L46
            r4.show()     // Catch: java.lang.Throwable -> L46
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal r4 = r3.authManager     // Catch: java.lang.Throwable -> L46
            r4.refreshMicrosoftAccount()     // Catch: java.lang.Throwable -> L46
            goto L5e
        L46:
            r4 = move-exception
            java.lang.String r0 = r4.getMessage()
            if (r0 == 0) goto L52
            java.lang.String r4 = r4.getMessage()
            goto L56
        L52:
            java.lang.String r4 = r4.toString()
        L56:
            r0 = 1
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r0)
            r4.show()
        L5e:
            return
    }

    private void refreshVulkanDriverList() {
            r4 = this;
            r0 = 0
            r4.driverSpinnerReady = r0
            java.util.List<ca.dnamobile.javalauncher.renderer.Driver> r1 = r4.availableDrivers
            r1.clear()
            java.util.List<ca.dnamobile.javalauncher.renderer.Driver> r1 = r4.availableDrivers
            java.util.List r2 = ca.dnamobile.javalauncher.renderer.DriverPluginManager.getDrivers(r4)
            r1.addAll(r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List<ca.dnamobile.javalauncher.renderer.Driver> r2 = r4.availableDrivers
            java.util.Iterator r2 = r2.iterator()
        L1c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L30
            java.lang.Object r3 = r2.next()
            ca.dnamobile.javalauncher.renderer.Driver r3 = (ca.dnamobile.javalauncher.renderer.Driver) r3
            java.lang.String r3 = r3.getName()
            r1.add(r3)
            goto L1c
        L30:
            android.widget.ArrayAdapter r2 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r2.<init>(r4, r3, r1)
            r1 = 17367049(0x1090009, float:2.516295E-38)
            r2.setDropDownViewResource(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r4.binding
            android.widget.Spinner r1 = r1.spinnerVulkanDriver
            r1.setAdapter(r2)
            java.util.List<ca.dnamobile.javalauncher.renderer.Driver> r1 = r4.availableDrivers
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L57
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r4.binding
            android.widget.TextView r0 = r0.textVulkanDriverDescription
            java.lang.String r1 = ""
            r0.setText(r1)
            return
        L57:
            java.lang.String r1 = ca.dnamobile.javalauncher.settings.LauncherPreferences.getSelectedVulkanDriverName(r4)
            int r1 = ca.dnamobile.javalauncher.renderer.DriverPluginManager.indexOfDriver(r4, r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r2 = r4.binding
            android.widget.Spinner r2 = r2.spinnerVulkanDriver
            r2.setSelection(r1, r0)
            java.util.List<ca.dnamobile.javalauncher.renderer.Driver> r0 = r4.availableDrivers
            java.lang.Object r0 = r0.get(r1)
            ca.dnamobile.javalauncher.renderer.Driver r0 = (ca.dnamobile.javalauncher.renderer.Driver) r0
            r4.updateVulkanDriverDescription(r0)
            r0 = 1
            r4.driverSpinnerReady = r0
            return
    }

    private void registerDroidBridgeBackupFolderPickerLauncher() {
            r2 = this;
            androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult r0 = new androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult
            r0.<init>()
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda19 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda19
            r1.<init>(r2)
            androidx.activity.result.ActivityResultLauncher r0 = r2.registerForActivityResult(r0, r1)
            r2.droidBridgeBackupFolderPickerLauncher = r0
            return
    }

    private void registerDroidBridgeRestoreZipPickerLauncher() {
            r2 = this;
            androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult r0 = new androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult
            r0.<init>()
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda134 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda134
            r1.<init>(r2)
            androidx.activity.result.ActivityResultLauncher r0 = r2.registerForActivityResult(r0, r1)
            r2.droidBridgeRestoreZipPickerLauncher = r0
            return
    }

    private void registerJarExecutionPickerLauncher() {
            r2 = this;
            androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult r0 = new androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult
            r0.<init>()
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda38 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda38
            r1.<init>(r2)
            androidx.activity.result.ActivityResultLauncher r0 = r2.registerForActivityResult(r0, r1)
            r2.jarExecutionPickerLauncher = r0
            return
    }

    private void registerMicrophonePermissionLauncher() {
            r2 = this;
            androidx.activity.result.contract.ActivityResultContracts$RequestPermission r0 = new androidx.activity.result.contract.ActivityResultContracts$RequestPermission
            r0.<init>()
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda10 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda10
            r1.<init>(r2)
            androidx.activity.result.ActivityResultLauncher r0 = r2.registerForActivityResult(r0, r1)
            r2.microphonePermissionLauncher = r0
            return
    }

    private void registerMicrosoftSkinPickerLauncher() {
            r2 = this;
            androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult r0 = new androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult
            r0.<init>()
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda37 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda37
            r1.<init>(r2)
            androidx.activity.result.ActivityResultLauncher r0 = r2.registerForActivityResult(r0, r1)
            r2.microsoftSkinPickerLauncher = r0
            return
    }

    private void registerMobileGluesFolderPickerLauncher() {
            r2 = this;
            androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult r0 = new androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult
            r0.<init>()
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda93 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda93
            r1.<init>(r2)
            androidx.activity.result.ActivityResultLauncher r0 = r2.registerForActivityResult(r0, r1)
            r2.mobileGluesFolderPickerLauncher = r0
            return
    }

    private void registerMouseCursorIconPickerLauncher() {
            r2 = this;
            androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult r0 = new androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult
            r0.<init>()
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda144 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda144
            r1.<init>(r2)
            androidx.activity.result.ActivityResultLauncher r0 = r2.registerForActivityResult(r0, r1)
            r2.mouseCursorIconPickerLauncher = r0
            return
    }

    private void registerNotificationPermissionLauncher() {
            r2 = this;
            androidx.activity.result.contract.ActivityResultContracts$RequestPermission r0 = new androidx.activity.result.contract.ActivityResultContracts$RequestPermission
            r0.<init>()
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda77 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda77
            r1.<init>(r2)
            androidx.activity.result.ActivityResultLauncher r0 = r2.registerForActivityResult(r0, r1)
            r2.notificationPermissionLauncher = r0
            return
    }

    private void registerOfflineSkinPickerLauncher() {
            r2 = this;
            androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult r0 = new androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult
            r0.<init>()
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda54 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda54
            r1.<init>(r2)
            androidx.activity.result.ActivityResultLauncher r0 = r2.registerForActivityResult(r0, r1)
            r2.offlineSkinPickerLauncher = r0
            return
    }

    private void registerSkinPickerLauncher() {
            r2 = this;
            androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult r0 = new androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult
            r0.<init>()
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda51 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda51
            r1.<init>()
            androidx.activity.result.ActivityResultLauncher r0 = r2.registerForActivityResult(r0, r1)
            r2.customSkinPickerLauncher = r0
            return
    }

    private void removeMicrosoftAccount(ca.dnamobile.javalauncher.data.AccountStore.Account r5) {
            r4 = this;
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAccountRegistry.remove(r4, r5)
            r0 = 0
            r1 = 0
            ca.dnamobile.javalauncher.data.AccountStore r2 = r4.accountStore     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto Le
            ca.dnamobile.javalauncher.data.AccountStore$Account r2 = r2.load()     // Catch: java.lang.Throwable -> L33
            goto Lf
        Le:
            r2 = r1
        Lf:
            boolean r5 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAccountRegistry.isSameAccount(r5, r2)     // Catch: java.lang.Throwable -> L33
            if (r5 == 0) goto L3b
            java.util.ArrayList r5 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAccountRegistry.list(r4)     // Catch: java.lang.Throwable -> L33
            boolean r2 = r5.isEmpty()     // Catch: java.lang.Throwable -> L33
            if (r2 != 0) goto L2b
            ca.dnamobile.javalauncher.data.AccountStore r2 = r4.accountStore     // Catch: java.lang.Throwable -> L33
            java.lang.Object r5 = r5.get(r0)     // Catch: java.lang.Throwable -> L33
            ca.dnamobile.javalauncher.data.AccountStore$Account r5 = (ca.dnamobile.javalauncher.data.AccountStore.Account) r5     // Catch: java.lang.Throwable -> L33
            r2.saveMicrosoftAccount(r5)     // Catch: java.lang.Throwable -> L33
            goto L3b
        L2b:
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal r5 = r4.authManager     // Catch: java.lang.Throwable -> L33
            if (r5 == 0) goto L3b
            r5.signOut()     // Catch: java.lang.Throwable -> L33
            goto L3b
        L33:
            r5 = move-exception
            java.lang.String r2 = "LauncherSettings"
            java.lang.String r3 = "Unable to update active Microsoft account after removal"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r2, r3, r5)
        L3b:
            ca.dnamobile.javalauncher.data.AccountStore r5 = r4.accountStore
            if (r5 == 0) goto L43
            ca.dnamobile.javalauncher.data.AccountStore$Account r1 = r5.load()
        L43:
            r4.updateAccountStatus(r1)
            r4.updateSkinUi(r1)
            java.lang.String r5 = "Microsoft account removed."
            android.widget.Toast r5 = android.widget.Toast.makeText(r4, r5, r0)
            r5.show()
            r4.showMicrosoftAccountsDialog()
            return
    }

    private void resetJarExecutionButton() {
            r2 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            if (r0 == 0) goto L19
            com.google.android.material.button.MaterialButton r0 = r0.buttonExecuteJarFile
            if (r0 == 0) goto L19
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonExecuteJarFile
            r1 = 1
            r0.setEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonExecuteJarFile
            java.lang.String r1 = "Execute .jar file"
            r0.setText(r1)
        L19:
            return
    }

    private java.io.File resolveCurrentLauncherHome() {
            r3 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            r0.<init>(r1)
            java.io.File r1 = r0.getParentFile()
            if (r1 == 0) goto L14
            boolean r2 = r1.isDirectory()
            if (r2 == 0) goto L14
            return r1
        L14:
            return r0
    }

    private java.io.File resolveJarExecutionUserHome(java.io.File r3) {
            r2 = this;
            r0 = 0
            java.io.File r0 = r2.getExternalFilesDir(r0)
            if (r0 == 0) goto Le
            boolean r1 = r0.isDirectory()
            if (r1 == 0) goto Le
            return r0
        Le:
            return r3
    }

    private java.io.File resolveJarExecutionWorkingDirectory() {
            r2 = this;
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r2)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L13
            r0.mkdirs()
        L13:
            boolean r1 = r0.isDirectory()
            if (r1 == 0) goto L1a
            goto L1e
        L1a:
            java.io.File r0 = r2.getFilesDir()
        L1e:
            return r0
    }

    private java.io.File resolveJavaHome(java.io.File r3) {
            r2 = this;
            java.io.File r3 = r3.getParentFile()
            r0 = 0
            if (r3 != 0) goto L8
            return r0
        L8:
            java.io.File r3 = r3.getParentFile()
            if (r3 == 0) goto L15
            boolean r1 = r3.isDirectory()
            if (r1 == 0) goto L15
            r0 = r3
        L15:
            return r0
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
            r4 = 1
            int r2 = java.lang.Math.max(r4, r2)
            r0.setStroke(r2, r3)
            return r0
    }

    private java.lang.String sanitizeJarFileName(java.lang.String r3) {
            r2 = this;
            java.lang.String r3 = r3.trim()
            java.lang.String r0 = "[^A-Za-z0-9._-]"
            java.lang.String r1 = "_"
            java.lang.String r3 = r3.replaceAll(r0, r1)
            int r0 = r3.length()
            if (r0 != 0) goto L14
            java.lang.String r3 = "selected.jar"
        L14:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r3.toLowerCase(r0)
            java.lang.String r1 = ".jar"
            boolean r0 = r0.endsWith(r1)
            if (r0 != 0) goto L33
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
        L33:
            return r3
    }

    private static java.lang.String sanitizeOfflineName(java.lang.String r3) {
            java.lang.String r0 = "Player"
            if (r3 != 0) goto L5
            return r0
        L5:
            java.lang.String r3 = r3.trim()
            java.lang.String r1 = "[^A-Za-z0-9_]"
            java.lang.String r2 = ""
            java.lang.String r3 = r3.replaceAll(r1, r2)
            int r1 = r3.length()
            r2 = 16
            if (r1 <= r2) goto L1e
            r1 = 0
            java.lang.String r3 = r3.substring(r1, r2)
        L1e:
            int r1 = r3.length()
            if (r1 != 0) goto L25
            goto L26
        L25:
            r0 = r3
        L26:
            return r0
    }

    private void scrollToSettingsSection(int r3) {
            r2 = this;
            if (r3 == 0) goto L2b
            r0 = 1
            if (r3 == r0) goto L26
            r0 = 2
            if (r3 == r0) goto L21
            r0 = 3
            if (r3 == r0) goto L1c
            r0 = 4
            if (r3 == r0) goto L17
            r0 = 5
            if (r3 == r0) goto L12
            return
        L12:
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r3 = r2.binding
            com.google.android.material.card.MaterialCardView r3 = r3.cardPrivacyPolicySettings
            goto L2f
        L17:
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r3 = r2.binding
            com.google.android.material.card.MaterialCardView r3 = r3.cardInstanceSettings
            goto L2f
        L1c:
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r3 = r2.binding
            com.google.android.material.card.MaterialCardView r3 = r3.cardLauncherSettings
            goto L2f
        L21:
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r3 = r2.binding
            com.google.android.material.card.MaterialCardView r3 = r3.cardControllerSettings
            goto L2f
        L26:
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r3 = r2.binding
            com.google.android.material.card.MaterialCardView r3 = r3.cardRendererSettings
            goto L2f
        L2b:
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r3 = r2.binding
            com.google.android.material.card.MaterialCardView r3 = r3.cardAccountSettings
        L2f:
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            android.widget.ScrollView r0 = r0.settingsScrollView
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda62 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda62
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    private void setAvoidRoundedCornersQuietly(boolean r3) {
            r2 = this;
            ca.dnamobile.javalauncher.settings.LauncherPreferences.setAvoidRoundedDisplayCorners(r2, r3)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchAvoidRoundedCorners
            r1 = 0
            r0.setOnCheckedChangeListener(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchAvoidRoundedCorners
            r0.setChecked(r3)
            r2.updateAvoidRoundedCornersSwitchText(r3)
            r2.bindAvoidRoundedCornersSwitch()
            return
    }

    private void setForceFullscreenQuietly(boolean r3) {
            r2 = this;
            ca.dnamobile.javalauncher.settings.LauncherPreferences.setForceFullscreenMode(r2, r3)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchForceFullscreenMode
            r1 = 0
            r0.setOnCheckedChangeListener(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchForceFullscreenMode
            r0.setChecked(r3)
            r2.updateForceFullscreenSwitchText(r3)
            r2.bindForceFullscreenSwitch()
            return
    }

    private void setIgnoreDisplayCutoutQuietly(boolean r3) {
            r2 = this;
            ca.dnamobile.javalauncher.settings.LauncherPreferences.setIgnoreDisplayCutout(r2, r3)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchIgnoreDisplayCutout
            r1 = 0
            r0.setOnCheckedChangeListener(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchIgnoreDisplayCutout
            r0.setChecked(r3)
            r2.updateIgnoreDisplayCutoutSwitchText(r3)
            r2.bindIgnoreDisplayCutoutSwitch()
            return
    }

    private void setupAccountUi() {
            r3 = this;
            ca.dnamobile.javalauncher.data.AccountStore r0 = new ca.dnamobile.javalauncher.data.AccountStore     // Catch: java.lang.Throwable -> L2c
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L2c
            r3.accountStore = r0     // Catch: java.lang.Throwable -> L2c
            ca.dnamobile.javalauncher.skin.CustomSkinStore r0 = new ca.dnamobile.javalauncher.skin.CustomSkinStore     // Catch: java.lang.Throwable -> L2c
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L2c
            r3.customSkinStore = r0     // Catch: java.lang.Throwable -> L2c
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal r0 = new ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal     // Catch: java.lang.Throwable -> L2c
            ca.dnamobile.javalauncher.data.AccountStore r1 = r3.accountStore     // Catch: java.lang.Throwable -> L2c
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L2c
            r3.authManager = r0     // Catch: java.lang.Throwable -> L2c
            ca.dnamobile.javalauncher.LauncherSettingsActivity$2 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$2     // Catch: java.lang.Throwable -> L2c
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L2c
            r0.setListener(r1)     // Catch: java.lang.Throwable -> L2c
            ca.dnamobile.javalauncher.data.AccountStore r0 = r3.accountStore     // Catch: java.lang.Throwable -> L2c
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r0.load()     // Catch: java.lang.Throwable -> L2c
            r3.updateAccountStatus(r0)     // Catch: java.lang.Throwable -> L2c
            r3.updateSkinUi(r0)     // Catch: java.lang.Throwable -> L2c
            goto L76
        L2c:
            r0 = move-exception
            java.lang.String r1 = "LauncherSettings"
            java.lang.String r2 = "Microsoft account UI initialization failed"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r2, r0)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            android.widget.TextView r0 = r0.textAccountStatus
            int r1 = ca.dnamobile.javalauncher.R.string.status_signed_out
            r0.setText(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonSignIn
            r1 = 0
            r0.setEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonAddMicrosoftAccount
            r0.setEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonManageMicrosoftAccounts
            r0.setEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonSignOut
            r0.setEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonManageOfflineAccounts
            r0.setEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonUseMicrosoftAccount
            r0.setEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonRefreshMicrosoftSkin
            r0.setEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonChangeMicrosoftCape
            r0.setEnabled(r1)
        L76:
            r3.setupChangeMicrosoftSkinButton()
            r3.setupChangeMicrosoftCapeButton()
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonSignIn
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda115 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda115
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonAddMicrosoftAccount
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda126 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda126
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonManageMicrosoftAccounts
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda137 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda137
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonSignOut
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda148 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda148
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonUseMicrosoftAccount
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda11 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda11
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonManageOfflineAccounts
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda22 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda22
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonRefreshMicrosoftSkin
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda33 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda33
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            ca.dnamobile.javalauncher.data.AccountStore r0 = r3.accountStore
            r1 = 0
            if (r0 == 0) goto Lda
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r0.load()
            goto Ldb
        Lda:
            r0 = r1
        Ldb:
            r3.updateChangeMicrosoftSkinButtonState(r0)
            ca.dnamobile.javalauncher.data.AccountStore r0 = r3.accountStore
            if (r0 == 0) goto Le6
            ca.dnamobile.javalauncher.data.AccountStore$Account r1 = r0.load()
        Le6:
            r3.updateChangeMicrosoftCapeButtonState(r1)
            return
    }

    private void setupChangeMicrosoftCapeButton() {
            r2 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.material.button.MaterialButton r0 = r0.buttonChangeMicrosoftCape
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda36 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda36
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    private void setupChangeMicrosoftSkinButton() {
            r2 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.material.button.MaterialButton r0 = r0.buttonChangeMicrosoftSkin
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda20 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda20
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    private void setupControllerSettings() {
            r2 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonEditBuiltInController
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda107 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda107
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonManageTouchControls
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda108 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda108
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonMouseCursorIconSettings
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda109 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda109
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            r2.updateMouseCursorIconSettingsSummary()
            r2.setupHardwareMouseDpiScaleSettings()
            r2.refreshControllerSettingsValues()
            return
    }

    private void setupFloatingGameOverlaySettings() {
            r11 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r11.binding
            if (r0 == 0) goto L170
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchShowInGameSettingsButton
            if (r0 != 0) goto La
            goto L170
        La:
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r11.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchShowInGameSettingsButton
            android.view.ViewParent r0 = r0.getParent()
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 != 0) goto L17
            return
        L17:
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r11.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchShowInGameSettingsButton
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            java.lang.String r1 = "floating_game_overlay_settings"
            android.view.View r2 = r0.findViewWithTag(r1)
            if (r2 == 0) goto L2a
            return
        L2a:
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r11)
            r2.setTag(r1)
            r1 = 1
            r2.setOrientation(r1)
            r3 = 1094713344(0x41400000, float:12.0)
            int r4 = r11.dp(r3)
            r5 = 0
            r2.setPadding(r5, r4, r5, r5)
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            r6 = -1
            r7 = -2
            r4.<init>(r6, r7)
            r0.addView(r2, r4)
            android.view.View r0 = new android.view.View
            r0.<init>(r11)
            r4 = 855638016(0x33000000, float:2.9802322E-8)
            r0.setBackgroundColor(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            int r8 = r11.dp(r8)
            int r8 = java.lang.Math.max(r1, r8)
            r4.<init>(r6, r8)
            r2.addView(r0, r4)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r11)
            java.lang.String r4 = "In-game overlay"
            r0.setText(r4)
            r4 = 1098907648(0x41800000, float:16.0)
            r0.setTextSize(r4)
            android.graphics.Typeface r4 = r0.getTypeface()
            r0.setTypeface(r4, r1)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r4.<init>(r6, r7)
            int r8 = r11.dp(r3)
            r4.topMargin = r8
            r2.addView(r0, r4)
            com.google.android.material.switchmaterial.SwitchMaterial r0 = new com.google.android.material.switchmaterial.SwitchMaterial
            r0.<init>(r11)
            boolean r4 = ca.dnamobile.javalauncher.settings.GameOverlayPreferences.isShowGameFpsCounter(r11)
            r0.setChecked(r4)
            boolean r4 = r0.isChecked()
            r11.updateFloatingFpsSwitchText(r0, r4)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda81 r4 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda81
            r4.<init>(r11, r0)
            r0.setOnCheckedChangeListener(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r4.<init>(r6, r7)
            r2.addView(r0, r4)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r11)
            java.lang.String r4 = "Shows real-time FPS on the floating settings button while Minecraft is running."
            r0.setText(r4)
            r4 = 1095761920(0x41500000, float:13.0)
            r0.setTextSize(r4)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r8.<init>(r6, r7)
            r9 = 1073741824(0x40000000, float:2.0)
            int r10 = r11.dp(r9)
            r8.topMargin = r10
            r2.addView(r0, r8)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r11)
            java.lang.String r8 = "Floating settings button position"
            r0.setText(r8)
            r8 = 1097859072(0x41700000, float:15.0)
            r0.setTextSize(r8)
            android.graphics.Typeface r8 = r0.getTypeface()
            r0.setTypeface(r8, r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r6, r7)
            int r3 = r11.dp(r3)
            r1.topMargin = r3
            r2.addView(r0, r1)
            android.widget.Spinner r0 = new android.widget.Spinner
            r0.<init>(r11)
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            java.lang.String[] r8 = ca.dnamobile.javalauncher.settings.GameOverlayPreferences.getPlacementLabels()
            r1.<init>(r11, r3, r8)
            r3 = 17367049(0x1090009, float:2.516295E-38)
            r1.setDropDownViewResource(r3)
            r0.setAdapter(r1)
            java.lang.String r1 = ca.dnamobile.javalauncher.settings.GameOverlayPreferences.getGameSettingsButtonPlacement(r11)
            int r1 = ca.dnamobile.javalauncher.settings.GameOverlayPreferences.indexOfPlacement(r1)
            r0.setSelection(r1, r5)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$8 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$8
            r1.<init>(r11)
            r0.setOnItemSelectedListener(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r6, r7)
            r3 = 1086324736(0x40c00000, float:6.0)
            int r3 = r11.dp(r3)
            r1.topMargin = r3
            r2.addView(r0, r1)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r11)
            java.lang.String r1 = "This controls the default corner. Dragging the button in game saves a custom position until you reset it or pick a new corner."
            r0.setText(r1)
            r0.setTextSize(r4)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r6, r7)
            int r3 = r11.dp(r9)
            r1.topMargin = r3
            r2.addView(r0, r1)
            com.google.android.material.button.MaterialButton r0 = new com.google.android.material.button.MaterialButton
            r1 = 0
            int r3 = com.google.android.material.R.attr.materialButtonOutlinedStyle
            r0.<init>(r11, r1, r3)
            java.lang.String r1 = "Reset floating button position"
            r0.setText(r1)
            r0.setAllCaps(r5)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda83 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda83
            r1.<init>(r11)
            r0.setOnClickListener(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r7, r7)
            r3 = 1090519040(0x41000000, float:8.0)
            int r3 = r11.dp(r3)
            r1.topMargin = r3
            r2.addView(r0, r1)
        L170:
            return
    }

    private void setupGameDisplaySettings() {
            r3 = this;
            int r0 = ca.dnamobile.javalauncher.settings.LauncherPreferences.getGameResolutionScalePercent(r3)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r3.binding
            android.widget.SeekBar r1 = r1.sliderGameResolutionScale
            r2 = 175(0xaf, float:2.45E-43)
            r1.setMax(r2)
            r3.updateResolutionScaleUi(r0)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            android.widget.SeekBar r0 = r0.sliderGameResolutionScale
            ca.dnamobile.javalauncher.LauncherSettingsActivity$5 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$5
            r1.<init>(r3)
            r0.setOnSeekBarChangeListener(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            android.widget.TextView r0 = r0.textGameResolutionScale
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda138 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda138
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            r3.bindForceFullscreenSwitch()
            r3.bindIgnoreDisplayCutoutSwitch()
            r3.bindAvoidRoundedCornersSwitch()
            return
    }

    private void setupHardwareMouseDpiScaleSettings() {
            r8 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r8.binding
            if (r0 == 0) goto Ldc
            android.widget.LinearLayout r0 = r0.layoutControllerSettings
            if (r0 != 0) goto La
            goto Ldc
        La:
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r8.binding
            android.widget.LinearLayout r0 = r0.layoutControllerSettings
            java.lang.String r1 = "hardware_mouse_dpi_scale"
            android.view.View r0 = r0.findViewWithTag(r1)
            if (r0 == 0) goto L17
            return
        L17:
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r8)
            r0.setTag(r1)
            r1 = 1
            r0.setOrientation(r1)
            r2 = 1096810496(0x41600000, float:14.0)
            int r3 = r8.dp(r2)
            r4 = 0
            r0.setPadding(r4, r3, r4, r4)
            android.view.View r3 = new android.view.View
            r3.<init>(r8)
            r4 = 855638016(0x33000000, float:2.9802322E-8)
            r3.setBackgroundColor(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = 1065353216(0x3f800000, float:1.0)
            int r5 = r8.dp(r5)
            int r5 = java.lang.Math.max(r1, r5)
            r6 = -1
            r4.<init>(r6, r5)
            r0.addView(r3, r4)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r8)
            java.lang.String r4 = "Hardware mouse DPI scale"
            r3.setText(r4)
            r4 = 1098907648(0x41800000, float:16.0)
            r3.setTextSize(r4)
            android.graphics.Typeface r4 = r3.getTypeface()
            r3.setTypeface(r4, r1)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = -2
            r4.<init>(r6, r5)
            r7 = 1094713344(0x41400000, float:12.0)
            int r7 = r8.dp(r7)
            r4.topMargin = r7
            r0.addView(r3, r4)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r8)
            java.lang.String r4 = "Adjusts real mouse / captured-pointer speed using a relative pointer multiplier. Touch camera movement, hotbar taps, and absolute menu taps are not scaled."
            r3.setText(r4)
            r4 = 1095761920(0x41500000, float:13.0)
            r3.setTextSize(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r4.<init>(r6, r5)
            r7 = 1073741824(0x40000000, float:2.0)
            int r7 = r8.dp(r7)
            r4.topMargin = r7
            r0.addView(r3, r4)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r8)
            r8.textHardwareMouseDpiScale = r3
            r3.setTextSize(r2)
            android.widget.TextView r2 = r8.textHardwareMouseDpiScale
            android.graphics.Typeface r3 = r2.getTypeface()
            r2.setTypeface(r3, r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r6, r5)
            r2 = 1090519040(0x41000000, float:8.0)
            int r2 = r8.dp(r2)
            r1.topMargin = r2
            android.widget.TextView r2 = r8.textHardwareMouseDpiScale
            r0.addView(r2, r1)
            android.widget.SeekBar r1 = new android.widget.SeekBar
            r1.<init>(r8)
            r8.sliderHardwareMouseDpiScale = r1
            r2 = 275(0x113, float:3.85E-43)
            r1.setMax(r2)
            android.widget.SeekBar r1 = r8.sliderHardwareMouseDpiScale
            ca.dnamobile.javalauncher.LauncherSettingsActivity$6 r2 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$6
            r2.<init>(r8)
            r1.setOnSeekBarChangeListener(r2)
            android.widget.SeekBar r1 = r8.sliderHardwareMouseDpiScale
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r6, r5)
            r0.addView(r1, r2)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r8.binding
            android.widget.LinearLayout r1 = r1.layoutControllerSettings
            r1.addView(r0)
        Ldc:
            return
    }

    private void setupInstallNotificationSettings() {
            r0 = this;
            r0.updateInstallNotificationSettingsUi()
            return
    }

    private void setupInstanceSettings() {
            r3 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            android.widget.TextView r0 = r0.textFolder
            int r1 = ca.dnamobile.javalauncher.R.string.launcher_folder_value
            java.lang.String r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = r3.getString(r1, r2)
            r0.setText(r1)
            r3.updateDroidBridgeBackupSummary()
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonBackupDroidBridgeData
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda73 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda73
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonRestoreDroidBridgeData
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda74 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda74
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            boolean r0 = ca.dnamobile.javalauncher.settings.LauncherPreferences.isShowSharedInstalls(r3)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r3.binding
            com.google.android.material.switchmaterial.SwitchMaterial r1 = r1.switchShowSharedInstalls
            r1.setChecked(r0)
            r3.updateSharedInstallsSwitchText(r0)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchShowSharedInstalls
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda75 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda75
            r1.<init>(r3)
            r0.setOnCheckedChangeListener(r1)
            boolean r0 = ca.dnamobile.javalauncher.settings.LauncherPreferences.isRemoveInheritedVanillaAfterLoaderInstall(r3)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r3.binding
            com.google.android.material.switchmaterial.SwitchMaterial r1 = r1.switchRemoveInheritedVanilla
            r1.setChecked(r0)
            r3.updateRemoveInheritedVanillaSwitchText(r0)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchRemoveInheritedVanilla
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda76 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda76
            r1.<init>(r3)
            r0.setOnCheckedChangeListener(r1)
            return
    }

    private void setupJarExecutionSettings() {
            r3 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            if (r0 == 0) goto L2e
            com.google.android.material.button.MaterialButton r0 = r0.buttonExecuteJarFile
            if (r0 != 0) goto L9
            goto L2e
        L9:
            java.lang.String r0 = "jar_execution"
            r1 = 0
            android.content.SharedPreferences r0 = r3.getSharedPreferences(r0, r1)
            java.lang.String r1 = "last_summary"
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            boolean r1 = isNullOrBlank(r0)
            if (r1 == 0) goto L1f
            java.lang.String r0 = "Choose a .jar file to run with DroidBridge's bundled Java runtime. Useful for loader installer jars and other trusted Java tools."
        L1f:
            r3.updateJarExecutionSummary(r0)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonExecuteJarFile
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda40 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda40
            r1.<init>(r3)
            r0.setOnClickListener(r1)
        L2e:
            return
    }

    private void setupLauncherSettings() {
            r2 = this;
            r2.setupMemorySettings()
            r2.setupInstallNotificationSettings()
            r2.setupSimpleVoiceChatSettings()
            r2.setupRuntimeComponentsReinstallSettings()
            r2.setupJarExecutionSettings()
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            android.widget.CheckBox r0 = r0.checkKeepLogs
            boolean r1 = ca.dnamobile.javalauncher.logs.LauncherLogManager.isKeepLogHistoryEnabled(r2)
            r0.setChecked(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            android.widget.CheckBox r0 = r0.checkKeepLogs
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda29 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda29
            r1.<init>(r2)
            r0.setOnCheckedChangeListener(r1)
            boolean r0 = ca.dnamobile.javalauncher.settings.LauncherPreferences.isShowInGameSettingsButton(r2)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r2.binding
            com.google.android.material.switchmaterial.SwitchMaterial r1 = r1.switchShowInGameSettingsButton
            r1.setChecked(r0)
            r2.updateInGameSettingsButtonSwitchText(r0)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchShowInGameSettingsButton
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda30 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda30
            r1.<init>(r2)
            r0.setOnCheckedChangeListener(r1)
            boolean r0 = ca.dnamobile.javalauncher.settings.LauncherPreferences.isShowGameLogOverlay(r2)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r2.binding
            com.google.android.material.switchmaterial.SwitchMaterial r1 = r1.switchShowGameLogOverlay
            r1.setChecked(r0)
            r2.updateGameLogOverlaySwitchText(r0)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchShowGameLogOverlay
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda31 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda31
            r1.<init>(r2)
            r0.setOnCheckedChangeListener(r1)
            r2.setupFloatingGameOverlaySettings()
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonShareLatestLog
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda32 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda32
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            r2.setupUpdateCheckerSettings()
            return
    }

    private void setupLegalLinkButton(com.google.android.material.button.MaterialButton r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            boolean r0 = isNullOrBlank(r4)
            r0 = r0 ^ 1
            r3.setEnabled(r0)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda119 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda119
            r1.<init>(r2, r0, r4, r5)
            r3.setOnClickListener(r1)
            return
    }

    private void setupMemorySettings() {
            r2 = this;
            int r0 = ca.dnamobile.javalauncher.settings.MemoryAllocationUtils.getMaxAllocatableMemoryMb(r2)
            int r1 = ca.dnamobile.javalauncher.settings.MemoryAllocationUtils.resolveAllocatedMemoryMb(r2)
            r2.updateMemorySeekBarBounds(r1)
            r2.updateMemoryText(r1)
            r2.updateAvailableMemorySummary(r0)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            android.widget.SeekBar r0 = r0.sliderAllocatedRam
            ca.dnamobile.javalauncher.LauncherSettingsActivity$9 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$9
            r1.<init>(r2)
            r0.setOnSeekBarChangeListener(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            android.widget.TextView r0 = r0.textAllocatedRam
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda44 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda44
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    private void setupPrivacyPolicySettings() {
            r3 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonOpenMinecraftEula
            java.lang.String r1 = "https://www.minecraft.net/en-us/eula"
            java.lang.String r2 = "Minecraft EULA link is not configured."
            r3.setupLegalLinkButton(r0, r1, r2)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonOpenPrivacyPolicy
            java.lang.String r1 = "https://dnamobilegaming.com/privacy"
            java.lang.String r2 = "Privacy Policy link is not available yet."
            r3.setupLegalLinkButton(r0, r1, r2)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonOpenDroidBridgeTerms
            java.lang.String r1 = "https://www.dnamobilegaming.com/terms"
            java.lang.String r2 = "DroidBridge Terms of Service link is not available yet."
            r3.setupLegalLinkButton(r0, r1, r2)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonOpenDroidBridgeLicense
            java.lang.String r1 = "https://www.dnamobilegaming.com/license"
            r3.setupLegalLinkButton(r0, r1, r2)
            return
    }

    private void setupRenderSurfaceSettings() {
            r2 = this;
            boolean r0 = ca.dnamobile.javalauncher.settings.LauncherPreferences.isUseNativeSurfaceView(r2)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r2.binding
            com.google.android.material.switchmaterial.SwitchMaterial r1 = r1.switchUseNativeSurface
            r1.setChecked(r0)
            r2.updateRenderSurfaceSwitchText(r0)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchUseNativeSurface
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda66 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda66
            r1.<init>(r2)
            r0.setOnCheckedChangeListener(r1)
            r2.setupGameDisplaySettings()
            return
    }

    private void setupRendererSettings() {
            r2 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            android.widget.Spinner r0 = r0.spinnerRenderer
            ca.dnamobile.javalauncher.LauncherSettingsActivity$3 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$3
            r1.<init>(r2)
            r0.setOnItemSelectedListener(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            android.widget.Spinner r0 = r0.spinnerRenderer
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda87 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda87
            r1.<init>(r2)
            r0.setOnTouchListener(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonDownloadRenderers
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda88 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda88
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            android.widget.Spinner r0 = r0.spinnerVulkanDriver
            ca.dnamobile.javalauncher.LauncherSettingsActivity$4 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$4
            r1.<init>(r2)
            r0.setOnItemSelectedListener(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            android.widget.Spinner r0 = r0.spinnerVulkanDriver
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda89 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda89
            r1.<init>(r2)
            r0.setOnTouchListener(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonImportRendererPlugin
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda90 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda90
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonGrantRendererStorageAccess
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda91 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda91
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonClearRendererPluginCache
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda92 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda92
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonRefreshRenderers
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda94 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda94
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            boolean r0 = ca.dnamobile.javalauncher.settings.LauncherPreferences.isUseSystemVulkanDriver(r2)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r2.binding
            com.google.android.material.switchmaterial.SwitchMaterial r1 = r1.switchUseSystemVulkanDriver
            r1.setChecked(r0)
            r2.updateSystemVulkanDriverSwitchText(r0)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchUseSystemVulkanDriver
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda95 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda95
            r1.<init>(r2)
            r0.setOnCheckedChangeListener(r1)
            boolean r0 = ca.dnamobile.javalauncher.settings.LauncherPreferences.isUseOpenGlForMinecraft26Plus(r2)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r2.binding
            com.google.android.material.switchmaterial.SwitchMaterial r1 = r1.switchUseOpenGlFor26Plus
            r1.setChecked(r0)
            r2.updateOpenGl26PlusSwitchText(r0)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchUseOpenGlFor26Plus
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda96 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda96
            r1.<init>(r2)
            r0.setOnCheckedChangeListener(r1)
            ca.dnamobile.javalauncher.renderer.Renderers.reload(r2)
            r2.refreshRendererList()
            return
    }

    private void setupRuntimeComponentsReinstallSettings() {
            r2 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            if (r0 == 0) goto L1a
            com.google.android.material.button.MaterialButton r0 = r0.buttonReinstallRuntimeComponents
            if (r0 != 0) goto L9
            goto L1a
        L9:
            java.lang.String r0 = "Use this if the first launch setup was interrupted or a runtime/component looks incomplete."
            r2.updateRuntimeComponentsReinstallSummary(r0)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonReinstallRuntimeComponents
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda123 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda123
            r1.<init>(r2)
            r0.setOnClickListener(r1)
        L1a:
            return
    }

    private void setupSettingsSectionTabs() {
            r2 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            com.google.android.material.tabs.TabLayout r0 = r0.settingsSectionTabs
            r0.removeAllTabs()
            int r0 = ca.dnamobile.javalauncher.R.string.settings_account_title
            r2.addSettingsSectionTab(r0)
            int r0 = ca.dnamobile.javalauncher.R.string.renderer_settings_title
            r2.addSettingsSectionTab(r0)
            int r0 = ca.dnamobile.javalauncher.R.string.controller_settings_title
            r2.addSettingsSectionTab(r0)
            int r0 = ca.dnamobile.javalauncher.R.string.settings_launcher_title
            r2.addSettingsSectionTab(r0)
            int r0 = ca.dnamobile.javalauncher.R.string.settings_instance_title
            r2.addSettingsSectionTab(r0)
            java.lang.String r0 = "Privacy Policy"
            r2.addSettingsSectionTab(r0)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            com.google.android.material.tabs.TabLayout r0 = r0.settingsSectionTabs
            ca.dnamobile.javalauncher.LauncherSettingsActivity$1 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$1
            r1.<init>(r2)
            r0.addOnTabSelectedListener(r1)
            return
    }

    private void setupSimpleVoiceChatSettings() {
            r2 = this;
            r2.updateSimpleVoiceChatPermissionUi()
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonSimpleVoiceChatMicrophonePermission
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda41 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda41
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    private void setupUpdateCheckerSettings() {
            r8 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r8.binding
            if (r0 == 0) goto Ld1
            com.google.android.material.button.MaterialButton r0 = r0.buttonShareLatestLog
            if (r0 != 0) goto La
            goto Ld1
        La:
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r8.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonShareLatestLog
            android.view.ViewParent r0 = r0.getParent()
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 != 0) goto L17
            return
        L17:
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r8.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonShareLatestLog
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            java.lang.String r1 = "update_checker_settings"
            android.view.View r2 = r0.findViewWithTag(r1)
            if (r2 == 0) goto L2a
            return
        L2a:
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r8)
            r2.setTag(r1)
            r1 = 1
            r2.setOrientation(r1)
            r1 = 1094713344(0x41400000, float:12.0)
            int r1 = r8.dp(r1)
            r3 = 0
            r2.setPadding(r3, r1, r3, r3)
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r4 = -1
            r5 = -2
            r1.<init>(r4, r5)
            r0.addView(r2, r1)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r8)
            java.lang.String r1 = "Launcher updates"
            r0.setText(r1)
            r1 = 1098907648(0x41800000, float:16.0)
            r0.setTextSize(r1)
            r1 = 8388611(0x800003, float:1.1754948E-38)
            r0.setGravity(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r4, r5)
            r2.addView(r0, r1)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r8)
            java.lang.String r1 = "Checks GitHub releases for newer DroidBridge builds."
            r0.setText(r1)
            r1 = 1095761920(0x41500000, float:13.0)
            r0.setTextSize(r1)
            r1 = 1073741824(0x40000000, float:2.0)
            int r1 = r8.dp(r1)
            r6 = 1086324736(0x40c00000, float:6.0)
            int r7 = r8.dp(r6)
            r0.setPadding(r3, r1, r3, r7)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r4, r5)
            r2.addView(r0, r1)
            android.widget.CheckBox r0 = new android.widget.CheckBox
            r0.<init>(r8)
            java.lang.String r1 = "Check for updates on startup"
            r0.setText(r1)
            boolean r1 = ca.dnamobile.javalauncher.update.LauncherUpdatePreferences.isAutoCheckEnabled(r8)
            r0.setChecked(r1)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda97 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda97
            r1.<init>(r8)
            r0.setOnCheckedChangeListener(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r4, r5)
            r2.addView(r0, r1)
            com.google.android.material.button.MaterialButton r0 = new com.google.android.material.button.MaterialButton
            r0.<init>(r8)
            java.lang.String r1 = "Check for updates"
            r0.setText(r1)
            r0.setAllCaps(r3)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda98 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda98
            r1.<init>(r8)
            r0.setOnClickListener(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r4, r5)
            int r3 = r8.dp(r6)
            r1.topMargin = r3
            r2.addView(r0, r1)
        Ld1:
            return
    }

    private boolean shouldAttemptGuiJarCompatibility(java.lang.String r2) {
            r1 = this;
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r0)
            java.lang.String r0 = "optifine"
            boolean r2 = r2.contains(r0)
            return r2
    }

    private boolean shouldUseJavaGuiLauncherActivity(java.lang.String r2) {
            r1 = this;
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r0)
            java.lang.String r0 = "optifine"
            boolean r2 = r2.contains(r0)
            return r2
    }

    private void showChangeMicrosoftCapeDialog() {
            r4 = this;
            ca.dnamobile.javalauncher.data.AccountStore r0 = r4.accountStore
            if (r0 == 0) goto L9
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r0.load()
            goto La
        L9:
            r0 = 0
        La:
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r4.getMicrosoftSkinTargetAccount(r0)
            if (r0 != 0) goto L1b
            int r0 = ca.dnamobile.javalauncher.R.string.microsoft_cape_requires_account
            r1 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r4, r0, r1)
            r0.show()
            return
        L1b:
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r4.binding
            com.google.android.material.button.MaterialButton r1 = r1.buttonChangeMicrosoftCape
            r2 = 0
            r1.setEnabled(r2)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r4.binding
            com.google.android.material.button.MaterialButton r1 = r1.buttonChangeMicrosoftCape
            int r3 = ca.dnamobile.javalauncher.R.string.microsoft_cape_loading_button
            r1.setText(r3)
            int r1 = ca.dnamobile.javalauncher.R.string.microsoft_cape_loading
            android.widget.Toast r1 = android.widget.Toast.makeText(r4, r1, r2)
            r1.show()
            java.lang.Thread r1 = new java.lang.Thread
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda60 r2 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda60
            r2.<init>(r4, r0)
            java.lang.String r0 = "Microsoft Cape List"
            r1.<init>(r2, r0)
            r1.start()
            return
    }

    private void showChangeMicrosoftSkinDialog() {
            r4 = this;
            ca.dnamobile.javalauncher.data.AccountStore r0 = r4.accountStore
            r1 = 0
            if (r0 == 0) goto La
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r0.load()
            goto Lb
        La:
            r0 = r1
        Lb:
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r4.getMicrosoftSkinTargetAccount(r0)
            if (r0 != 0) goto L1c
            int r0 = ca.dnamobile.javalauncher.R.string.microsoft_skin_requires_account
            r1 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r4, r0, r1)
            r0.show()
            return
        L1c:
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            r2.<init>(r4)
            int r3 = ca.dnamobile.javalauncher.R.string.microsoft_skin_change_title
            android.app.AlertDialog$Builder r2 = r2.setTitle(r3)
            int r3 = ca.dnamobile.javalauncher.R.string.microsoft_skin_change_message
            java.lang.String r0 = r0.getBestDisplayName()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r4.getString(r3, r0)
            android.app.AlertDialog$Builder r0 = r2.setMessage(r0)
            r2 = 17039360(0x1040000, float:2.424457E-38)
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r2, r1)
            int r1 = ca.dnamobile.javalauncher.R.string.microsoft_skin_pick
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda78 r2 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda78
            r2.<init>(r4)
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)
            r0.show()
            return
    }

    private void showConfirmMicrosoftSkinUploadDialog(java.io.File r6, ca.dnamobile.javalauncher.skin.SkinModelType r7) {
            r5 = this;
            r0 = 1
            ca.dnamobile.javalauncher.skin.SkinModelType[] r1 = new ca.dnamobile.javalauncher.skin.SkinModelType[r0]
            ca.dnamobile.javalauncher.skin.SkinModelType r2 = ca.dnamobile.javalauncher.skin.SkinModelType.SLIM
            if (r7 != r2) goto La
            ca.dnamobile.javalauncher.skin.SkinModelType r7 = ca.dnamobile.javalauncher.skin.SkinModelType.SLIM
            goto Lc
        La:
            ca.dnamobile.javalauncher.skin.SkinModelType r7 = ca.dnamobile.javalauncher.skin.SkinModelType.CLASSIC
        Lc:
            r2 = 0
            r1[r2] = r7
            r7 = 2
            java.lang.String[] r7 = new java.lang.String[r7]
            int r3 = ca.dnamobile.javalauncher.R.string.microsoft_skin_variant_classic
            java.lang.String r3 = r5.getString(r3)
            r7[r2] = r3
            int r3 = ca.dnamobile.javalauncher.R.string.microsoft_skin_variant_slim
            java.lang.String r3 = r5.getString(r3)
            r7[r0] = r3
            r3 = r1[r2]
            ca.dnamobile.javalauncher.skin.SkinModelType r4 = ca.dnamobile.javalauncher.skin.SkinModelType.SLIM
            if (r3 != r4) goto L29
            goto L2a
        L29:
            r0 = r2
        L2a:
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            r2.<init>(r5)
            int r3 = ca.dnamobile.javalauncher.R.string.microsoft_skin_upload_title
            android.app.AlertDialog$Builder r2 = r2.setTitle(r3)
            int r3 = ca.dnamobile.javalauncher.R.string.microsoft_skin_upload_message
            android.app.AlertDialog$Builder r2 = r2.setMessage(r3)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda52 r3 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda52
            r3.<init>(r1)
            android.app.AlertDialog$Builder r7 = r2.setSingleChoiceItems(r7, r0, r3)
            r0 = 17039360(0x1040000, float:2.424457E-38)
            r2 = 0
            android.app.AlertDialog$Builder r7 = r7.setNegativeButton(r0, r2)
            int r0 = ca.dnamobile.javalauncher.R.string.microsoft_skin_upload
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda53 r2 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda53
            r2.<init>(r5, r6, r1)
            android.app.AlertDialog$Builder r6 = r7.setPositiveButton(r0, r2)
            r6.show()
            return
    }

    private void showDownloadRenderersDialog() {
            r3 = this;
            android.widget.ScrollView r0 = new android.widget.ScrollView
            r0.<init>(r3)
            r1 = 0
            r0.setFillViewport(r1)
            int r2 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_DIALOG_BG
            r0.setBackgroundColor(r2)
            r2 = 1
            r0.setVerticalScrollBarEnabled(r2)
            r0.setScrollbarFadingEnabled(r1)
            java.lang.String r1 = "Download renderers"
            java.lang.String r2 = "DroidBridge Launcher can use extra renderer plugins from compatible renderer packages."
            android.widget.LinearLayout r1 = r3.createStyledDialogRoot(r0, r1, r2)
            android.widget.LinearLayout r1 = r3.addStyledDialogCard(r1)
            java.lang.String r2 = "Open renderer download site"
            r3.addStyledDialogCardTitle(r1, r2)
            java.lang.String r2 = "You will be brought to a download renderer site to get other renderers for DroidBridge Launcher. Only install renderer APKs from sources you trust."
            r3.addStyledDialogInfoText(r1, r2)
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r3)
            android.app.AlertDialog$Builder r0 = r1.setView(r0)
            r1 = 17039360(0x1040000, float:2.424457E-38)
            r2 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            java.lang.String r1 = "Open site"
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)
            android.app.AlertDialog r0 = r0.create()
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda45 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda45
            r1.<init>(r3, r0)
            r0.setOnShowListener(r1)
            r0.show()
            return
    }

    private void showDroidBridgeBackupDialog() {
            r4 = this;
            java.io.File r0 = r4.resolveCurrentLauncherHome()
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r4)
            java.lang.String r2 = "Back up DroidBridge data"
            android.app.AlertDialog$Builder r1 = r1.setTitle(r2)
            java.lang.String r2 = "Choose a folder where DroidBridge will create a portable .zip backup of the current data folder. This can include instances, saves, versions, libraries, assets, mods, configs, logs, and account/session files, so choose a private location."
            android.app.AlertDialog$Builder r1 = r1.setMessage(r2)
            r2 = 17039360(0x1040000, float:2.424457E-38)
            r3 = 0
            android.app.AlertDialog$Builder r1 = r1.setNegativeButton(r2, r3)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda132 r2 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda132
            r2.<init>(r4)
            java.lang.String r3 = "Choose folder"
            android.app.AlertDialog$Builder r1 = r1.setPositiveButton(r3, r2)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda133 r2 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda133
            r2.<init>(r4, r0)
            java.lang.String r0 = "View current folder"
            android.app.AlertDialog$Builder r0 = r1.setNeutralButton(r0, r2)
            r0.show()
            return
    }

    private void showDroidBridgeRestoreDialog() {
            r4 = this;
            java.io.File r0 = r4.resolveCurrentLauncherHome()
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r4)
            java.lang.String r2 = "Restore DroidBridge data"
            android.app.AlertDialog$Builder r1 = r1.setTitle(r2)
            java.lang.String r2 = "Choose a DroidBridge backup .zip to restore into the current data folder. This replaces the current DroidBridge data folder and moves the previous data aside as a .before_restore folder."
            android.app.AlertDialog$Builder r1 = r1.setMessage(r2)
            r2 = 17039360(0x1040000, float:2.424457E-38)
            r3 = 0
            android.app.AlertDialog$Builder r1 = r1.setNegativeButton(r2, r3)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda70 r2 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda70
            r2.<init>(r4)
            java.lang.String r3 = "Choose backup"
            android.app.AlertDialog$Builder r1 = r1.setPositiveButton(r3, r2)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda72 r2 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda72
            r2.<init>(r4, r0)
            java.lang.String r0 = "View current folder"
            android.app.AlertDialog$Builder r0 = r1.setNeutralButton(r0, r2)
            r0.show()
            return
    }

    private void showEditOfflineAccountDialog(ca.dnamobile.javalauncher.data.AccountStore.Account r17) {
            r16 = this;
            r6 = r16
            r4 = r17
            ca.dnamobile.javalauncher.data.AccountStore r0 = r6.accountStore
            if (r0 != 0) goto L9
            return
        L9:
            r0 = 0
            r6.pendingOfflineSkinUri = r0
            r6.pendingOfflineSkinPreview = r0
            r6.pendingOfflineSkinLabel = r0
            android.widget.ScrollView r1 = new android.widget.ScrollView
            r1.<init>(r6)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r6)
            r3 = 1
            r2.setOrientation(r3)
            r5 = 1103101952(0x41c00000, float:24.0)
            int r7 = r6.dp(r5)
            r8 = 1099956224(0x41900000, float:18.0)
            int r9 = r6.dp(r8)
            int r5 = r6.dp(r5)
            r10 = 1082130432(0x40800000, float:4.0)
            int r10 = r6.dp(r10)
            r2.setPadding(r7, r9, r5, r10)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r7 = -1
            r9 = -2
            r5.<init>(r7, r9)
            r1.addView(r2, r5)
            int r5 = ca.dnamobile.javalauncher.R.drawable.ic_player_head_placeholder
            if (r4 != 0) goto L48
            int r10 = ca.dnamobile.javalauncher.R.string.offline_account_create_title
            goto L4a
        L48:
            int r10 = ca.dnamobile.javalauncher.R.string.offline_account_edit_title
        L4a:
            int r11 = ca.dnamobile.javalauncher.R.string.offline_account_edit_summary
            android.view.View r5 = r6.buildDialogHeader(r5, r10, r11)
            r2.addView(r5)
            com.google.android.material.card.MaterialCardView r5 = new com.google.android.material.card.MaterialCardView
            r5.<init>(r6)
            int r8 = r6.dp(r8)
            float r8 = (float) r8
            r5.setRadius(r8)
            r8 = 1065353216(0x3f800000, float:1.0)
            int r10 = r6.dp(r8)
            float r10 = (float) r10
            r5.setCardElevation(r10)
            int r10 = r6.dp(r8)
            r5.setStrokeWidth(r10)
            r10 = 570425344(0x22000000, float:1.7347235E-18)
            r5.setStrokeColor(r10)
            r5.setCardBackgroundColor(r7)
            r5.setUseCompatPadding(r3)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r10.<init>(r7, r9)
            r11 = 1098907648(0x41800000, float:16.0)
            int r11 = r6.dp(r11)
            r10.topMargin = r11
            r2.addView(r5, r10)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r6)
            r10 = 0
            r2.setOrientation(r10)
            r11 = 16
            r2.setGravity(r11)
            r11 = 1096810496(0x41600000, float:14.0)
            int r12 = r6.dp(r11)
            int r13 = r6.dp(r11)
            int r14 = r6.dp(r11)
            int r15 = r6.dp(r11)
            r2.setPadding(r12, r13, r14, r15)
            android.widget.FrameLayout$LayoutParams r12 = new android.widget.FrameLayout$LayoutParams
            r12.<init>(r7, r9)
            r5.addView(r2, r12)
            android.widget.ImageView r5 = new android.widget.ImageView
            r5.<init>(r6)
            r5.setAdjustViewBounds(r3)
            android.widget.ImageView$ScaleType r12 = android.widget.ImageView.ScaleType.FIT_CENTER
            r5.setScaleType(r12)
            int r12 = ca.dnamobile.javalauncher.R.drawable.bg_player_head_preview
            r5.setBackgroundResource(r12)
            r12 = 1086324736(0x40c00000, float:6.0)
            int r13 = r6.dp(r12)
            int r14 = r6.dp(r12)
            int r15 = r6.dp(r12)
            int r7 = r6.dp(r12)
            r5.setPadding(r13, r14, r15, r7)
            int r7 = ca.dnamobile.javalauncher.R.drawable.ic_player_head_placeholder
            r5.setImageResource(r7)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r13 = 1118830592(0x42b00000, float:88.0)
            int r14 = r6.dp(r13)
            int r13 = r6.dp(r13)
            r7.<init>(r14, r13)
            int r11 = r6.dp(r11)
            r7.rightMargin = r11
            r2.addView(r5, r7)
            r6.pendingOfflineSkinPreview = r5
            if (r4 == 0) goto L108
            boolean r7 = r17.hasOfflineSkin()
            if (r7 == 0) goto L108
            ca.dnamobile.javalauncher.skin.PlayerHeadLoader.loadInto(r6, r5, r4, r0)
        L108:
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r6)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            r11.<init>(r10, r9, r8)
            r2.addView(r7, r11)
            android.widget.EditText r11 = new android.widget.EditText
            r11.<init>(r6)
            r11.setInputType(r3)
            r11.setSingleLine(r3)
            r11.setSelectAllOnFocus(r3)
            int r2 = ca.dnamobile.javalauncher.R.string.offline_account_name_hint
            r11.setHint(r2)
            if (r4 == 0) goto L132
            java.lang.String r2 = r17.getBestDisplayName()
            goto L134
        L132:
            java.lang.String r2 = "Player"
        L134:
            r11.setText(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r13 = -1
            r2.<init>(r13, r9)
            r7.addView(r11, r2)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r6)
            if (r4 == 0) goto L15a
            boolean r13 = r17.hasOfflineSkin()
            if (r13 == 0) goto L15a
            int r13 = ca.dnamobile.javalauncher.R.string.offline_account_skin_current
            java.lang.String r14 = r4.offlineSkinModel
            java.lang.Object[] r14 = new java.lang.Object[]{r14}
            java.lang.String r13 = r6.getString(r13, r14)
            goto L160
        L15a:
            int r13 = ca.dnamobile.javalauncher.R.string.offline_account_skin_none
            java.lang.String r13 = r6.getString(r13)
        L160:
            r2.setText(r13)
            r13 = 16974342(0x1030206, float:2.4062352E-38)
            r2.setTextAppearance(r13)
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r14 = -1
            r13.<init>(r14, r9)
            int r12 = r6.dp(r12)
            r13.topMargin = r12
            r7.addView(r2, r13)
            r6.pendingOfflineSkinLabel = r2
            android.widget.LinearLayout r12 = new android.widget.LinearLayout
            r12.<init>(r6)
            r12.setOrientation(r10)
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r13.<init>(r14, r9)
            r14 = 1090519040(0x41000000, float:8.0)
            int r15 = r6.dp(r14)
            r13.topMargin = r15
            r7.addView(r12, r13)
            int r7 = ca.dnamobile.javalauncher.R.string.offline_account_choose_skin
            com.google.android.material.button.MaterialButton r7 = r6.buildCompactDialogButton(r7)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda57 r13 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda57
            r13.<init>(r6)
            r7.setOnClickListener(r13)
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r13.<init>(r10, r9, r8)
            r12.addView(r7, r13)
            boolean[] r7 = new boolean[r3]
            r7[r10] = r10
            int r3 = ca.dnamobile.javalauncher.R.string.offline_account_clear_skin
            com.google.android.material.button.MaterialButton r3 = r6.buildCompactDialogButton(r3)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda58 r13 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda58
            r13.<init>(r6, r7, r5, r2)
            r3.setOnClickListener(r13)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r10, r9, r8)
            int r5 = r6.dp(r14)
            r2.leftMargin = r5
            r12.addView(r3, r2)
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            r2.<init>(r6)
            android.app.AlertDialog$Builder r1 = r2.setView(r1)
            r2 = 17039360(0x1040000, float:2.424457E-38)
            android.app.AlertDialog$Builder r1 = r1.setNegativeButton(r2, r0)
            if (r4 != 0) goto L1dc
            int r2 = ca.dnamobile.javalauncher.R.string.offline_account_create
            goto L1de
        L1dc:
            int r2 = ca.dnamobile.javalauncher.R.string.offline_account_save
        L1de:
            android.app.AlertDialog$Builder r0 = r1.setPositiveButton(r2, r0)
            android.app.AlertDialog r8 = r0.create()
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda59 r9 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda59
            r0 = r9
            r1 = r16
            r2 = r8
            r3 = r11
            r4 = r17
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r8.setOnShowListener(r9)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda61 r0 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda61
            r0.<init>(r6)
            r8.setOnDismissListener(r0)
            r8.show()
            return
    }

    private void showMicrosoftAccountsDialog() {
            r6 = this;
            ca.dnamobile.javalauncher.data.AccountStore r0 = r6.accountStore
            if (r0 != 0) goto L5
            return
        L5:
            android.app.AlertDialog r0 = r6.microsoftAccountsDialog
            if (r0 == 0) goto L14
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L14
            android.app.AlertDialog r0 = r6.microsoftAccountsDialog
            r0.dismiss()
        L14:
            android.widget.ScrollView r0 = new android.widget.ScrollView
            r0.<init>(r6)
            r1 = 0
            r0.setFillViewport(r1)
            int r2 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_DIALOG_BG
            r0.setBackgroundColor(r2)
            r2 = 1
            r0.setVerticalScrollBarEnabled(r2)
            r0.setScrollbarFadingEnabled(r1)
            java.lang.String r1 = "Microsoft accounts"
            java.lang.String r2 = "Choose the account DroidBridge should use for launch, refresh a saved account, remove one, or add another Microsoft account."
            android.widget.LinearLayout r1 = r6.createStyledDialogRoot(r0, r1, r2)
            java.util.ArrayList r2 = r6.getMicrosoftAccountsForDialog()
            r3 = 0
            ca.dnamobile.javalauncher.data.AccountStore r4 = r6.accountStore     // Catch: java.lang.Throwable -> L3d
            ca.dnamobile.javalauncher.data.AccountStore$Account r4 = r4.load()     // Catch: java.lang.Throwable -> L3d
            goto L3e
        L3d:
            r4 = r3
        L3e:
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L53
            android.widget.LinearLayout r1 = r6.addStyledDialogCard(r1)
            java.lang.String r2 = "No Microsoft accounts saved"
            r6.addStyledDialogCardTitle(r1, r2)
            java.lang.String r2 = "Use Add another account to sign in and save a Microsoft account."
            r6.addStyledDialogInfoText(r1, r2)
            goto L6b
        L53:
            java.util.Iterator r2 = r2.iterator()
        L57:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L6b
            java.lang.Object r5 = r2.next()
            ca.dnamobile.javalauncher.data.AccountStore$Account r5 = (ca.dnamobile.javalauncher.data.AccountStore.Account) r5
            android.view.View r5 = r6.buildMicrosoftAccountRow(r5, r4)
            r1.addView(r5)
            goto L57
        L6b:
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r6)
            android.app.AlertDialog$Builder r0 = r1.setView(r0)
            r1 = 17039360(0x1040000, float:2.424457E-38)
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r3)
            java.lang.String r1 = "Add another"
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r3)
            android.app.AlertDialog r0 = r0.create()
            r6.microsoftAccountsDialog = r0
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda103 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda103
            r1.<init>(r6, r0)
            r0.setOnShowListener(r1)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda105 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda105
            r1.<init>(r6, r0)
            r0.setOnDismissListener(r1)
            r0.show()
            return
    }

    private void showMicrosoftCapePickerDialog(ca.dnamobile.javalauncher.data.AccountStore.Account r21, ca.dnamobile.javalauncher.skin.MicrosoftCapeService.Profile r22) {
            r20 = this;
            r9 = r20
            r10 = r22
            android.widget.ScrollView r11 = new android.widget.ScrollView
            r11.<init>(r9)
            r12 = 0
            r11.setFillViewport(r12)
            int r0 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_DIALOG_BG
            r11.setBackgroundColor(r0)
            r13 = 1
            r11.setVerticalScrollBarEnabled(r13)
            r11.setScrollbarFadingEnabled(r12)
            int r0 = ca.dnamobile.javalauncher.R.string.microsoft_cape_dialog_title
            java.lang.String r0 = r9.getString(r0)
            int r1 = ca.dnamobile.javalauncher.R.string.microsoft_cape_dialog_summary
            java.lang.String r2 = r21.getBestDisplayName()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = r9.getString(r1, r2)
            android.widget.LinearLayout r0 = r9.createStyledDialogRoot(r11, r0, r1)
            android.widget.LinearLayout r14 = r9.addStyledDialogCard(r0)
            int r0 = ca.dnamobile.javalauncher.R.string.microsoft_cape_owned_title
            java.lang.String r0 = r9.getString(r0)
            r9.addStyledDialogCardTitle(r14, r0)
            java.util.List<ca.dnamobile.javalauncher.skin.MicrosoftCapeService$CapeEntry> r0 = r10.capes
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L4f
            int r0 = ca.dnamobile.javalauncher.R.string.microsoft_cape_empty
            java.lang.String r0 = r9.getString(r0)
            r9.addStyledDialogInfoText(r14, r0)
        L4f:
            ca.dnamobile.javalauncher.skin.MicrosoftCapeService$CapeEntry r0 = r22.getActiveCape()
            java.lang.String[] r15 = new java.lang.String[r13]
            r8 = 0
            if (r0 == 0) goto L5b
            java.lang.String r0 = r0.id
            goto L5c
        L5b:
            r0 = r8
        L5c:
            r15[r12] = r0
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
            int r0 = ca.dnamobile.javalauncher.R.string.microsoft_cape_none_title
            java.lang.String r4 = r9.getString(r0)
            int r0 = ca.dnamobile.javalauncher.R.string.microsoft_cape_none_summary
            java.lang.String r5 = r9.getString(r0)
            r0 = r15[r12]
            if (r0 != 0) goto L7a
            r7 = r13
            goto L7b
        L7a:
            r7 = r12
        L7b:
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda47 r6 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda47
            r6.<init>(r15)
            r18 = 0
            r0 = r20
            r1 = r14
            r2 = r16
            r3 = r17
            r19 = r6
            r6 = r18
            r8 = r19
            r0.addCapeOptionRow(r1, r2, r3, r4, r5, r6, r7, r8)
            java.util.List<ca.dnamobile.javalauncher.skin.MicrosoftCapeService$CapeEntry> r0 = r10.capes
            java.util.Iterator r10 = r0.iterator()
        L98:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Ld6
            java.lang.Object r0 = r10.next()
            ca.dnamobile.javalauncher.skin.MicrosoftCapeService$CapeEntry r0 = (ca.dnamobile.javalauncher.skin.MicrosoftCapeService.CapeEntry) r0
            boolean r1 = r0.isActive()
            if (r1 == 0) goto Lb1
            int r1 = ca.dnamobile.javalauncher.R.string.microsoft_cape_active_badge
            java.lang.String r1 = r9.getString(r1)
            goto Lb7
        Lb1:
            int r1 = ca.dnamobile.javalauncher.R.string.microsoft_cape_inactive_badge
            java.lang.String r1 = r9.getString(r1)
        Lb7:
            r5 = r1
            java.lang.String r4 = r0.getDisplayName()
            java.lang.String r6 = r0.url
            java.lang.String r1 = r0.id
            r2 = r15[r12]
            boolean r7 = r1.equals(r2)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda48 r8 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda48
            r8.<init>(r15, r0)
            r0 = r20
            r1 = r14
            r2 = r16
            r3 = r17
            r0.addCapeOptionRow(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L98
        Ld6:
            android.app.AlertDialog[] r5 = new android.app.AlertDialog[r13]
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r9)
            android.app.AlertDialog$Builder r0 = r0.setView(r11)
            r1 = 17039360(0x1040000, float:2.424457E-38)
            r2 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            int r1 = ca.dnamobile.javalauncher.R.string.microsoft_cape_apply
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)
            android.app.AlertDialog r6 = r0.create()
            r5[r12] = r6
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda49 r7 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda49
            r0 = r7
            r1 = r20
            r2 = r6
            r3 = r21
            r4 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            r6.setOnShowListener(r7)
            r6.show()
            return
    }

    private void showMouseCursorIconDialog() {
            r18 = this;
            r7 = r18
            r0 = 4
            java.lang.String[] r4 = new java.lang.String[r0]
            java.lang.String r1 = "crosshair"
            r8 = 0
            r4[r8] = r1
            java.lang.String r1 = "dot"
            r2 = 1
            r4[r2] = r1
            r1 = 2
            java.lang.String r3 = "arrow"
            r4[r1] = r3
            r1 = 3
            java.lang.String r3 = "custom"
            r4[r1] = r3
            java.lang.String r1 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getMouseCursorStyle(r18)
            int r9 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getMouseCursorSizePercent(r18)
            android.widget.ScrollView r10 = new android.widget.ScrollView
            r10.<init>(r7)
            r10.setFillViewport(r8)
            int r5 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_DIALOG_BG
            r10.setBackgroundColor(r5)
            java.lang.String r5 = "Mouse cursor icon"
            java.lang.String r6 = "Choose the cursor used by the virtual mouse button and controller cursor mode in Minecraft menus. This cursor is not shown during normal grabbed gameplay."
            android.widget.LinearLayout r11 = r7.createStyledDialogRoot(r10, r5, r6)
            android.widget.LinearLayout r5 = r7.addStyledDialogCard(r11)
            java.lang.String r6 = "Preview"
            r7.addStyledDialogCardTitle(r5, r6)
            android.widget.ImageView r12 = new android.widget.ImageView
            r12.<init>(r7)
            r12.setAdjustViewBounds(r2)
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.FIT_CENTER
            r12.setScaleType(r6)
            r6 = 1092616192(0x41200000, float:10.0)
            int r13 = r7.dp(r6)
            int r14 = r7.dp(r6)
            int r15 = r7.dp(r6)
            int r6 = r7.dp(r6)
            r12.setPadding(r13, r14, r15, r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r13 = 1118830592(0x42b00000, float:88.0)
            int r14 = r7.dp(r13)
            int r13 = r7.dp(r13)
            r6.<init>(r14, r13)
            r6.gravity = r2
            r13 = 1086324736(0x40c00000, float:6.0)
            int r13 = r7.dp(r13)
            r6.topMargin = r13
            r5.addView(r12, r6)
            java.lang.String[] r13 = new java.lang.String[r2]
            r13[r8] = r1
            int[] r14 = new int[]{r9}
            android.widget.LinearLayout r15 = r7.addStyledDialogCard(r11)
            java.lang.String r5 = "Cursor style"
            r7.addStyledDialogCardTitle(r15, r5)
            java.lang.String r5 = "Use one of the built-in icons, or upload a custom image for the menu cursor."
            r7.addStyledDialogInfoText(r15, r5)
            android.widget.RadioGroup r6 = new android.widget.RadioGroup
            r6.<init>(r7)
            r6.setOrientation(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r5 = -1
            r8 = -2
            r2.<init>(r5, r8)
            r5 = 1082130432(0x40800000, float:4.0)
            int r5 = r7.dp(r5)
            r2.topMargin = r5
            r15.addView(r6, r2)
            int[] r2 = new int[r0]
            r5 = 0
        Lb0:
            if (r5 >= r0) goto L110
            r0 = r4[r5]
            android.widget.RadioButton r8 = new android.widget.RadioButton
            r8.<init>(r7)
            r16 = r10
            int r10 = android.view.View.generateViewId()
            r8.setId(r10)
            int r10 = r8.getId()
            r2[r5] = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r17 = r9
            java.lang.String r9 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getMouseCursorStyleLabel(r0)
            java.lang.StringBuilder r9 = r10.append(r9)
            boolean r10 = r3.equals(r0)
            if (r10 == 0) goto Le6
            boolean r10 = ca.dnamobile.javalauncher.controls.ControlsPreferences.hasCustomMouseCursorIcon(r18)
            if (r10 != 0) goto Le6
            java.lang.String r10 = " (upload required)"
            goto Le8
        Le6:
            java.lang.String r10 = ""
        Le8:
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.setText(r9)
            boolean r0 = r0.equals(r1)
            r8.setChecked(r0)
            r7.styleDialogRadioButton(r8)
            android.widget.RadioGroup$LayoutParams r0 = new android.widget.RadioGroup$LayoutParams
            r9 = -1
            r10 = -2
            r0.<init>(r9, r10)
            r6.addView(r8, r0)
            int r5 = r5 + 1
            r10 = r16
            r9 = r17
            r0 = 4
            r8 = -2
            goto Lb0
        L110:
            r17 = r9
            r16 = r10
            r9 = -1
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda120 r8 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda120
            r0 = r8
            r1 = r18
            r3 = r13
            r5 = r12
            r10 = r6
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r10.setOnCheckedChangeListener(r8)
            com.google.android.material.button.MaterialButton r6 = new com.google.android.material.button.MaterialButton
            int r0 = com.google.android.material.R.attr.materialButtonOutlinedStyle
            r8 = 0
            r6.<init>(r7, r8, r0)
            java.lang.String r0 = "Upload custom icon"
            r6.setText(r0)
            r0 = 0
            r6.setAllCaps(r0)
            r7.styleDialogOutlinedButton(r6)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            r1 = 1090519040(0x41000000, float:8.0)
            int r1 = r7.dp(r1)
            r0.topMargin = r1
            r15.addView(r6, r0)
            android.widget.LinearLayout r10 = r7.addStyledDialogCard(r11)
            java.lang.String r0 = "Cursor size"
            r7.addStyledDialogCardTitle(r10, r0)
            android.widget.TextView r11 = new android.widget.TextView
            r11.<init>(r7)
            int r0 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_TEXT_SECONDARY
            r11.setTextColor(r0)
            r0 = 1096810496(0x41600000, float:14.0)
            r11.setTextSize(r0)
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT_BOLD
            r11.setTypeface(r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r1 = -2
            r0.<init>(r9, r1)
            r1 = 1073741824(0x40000000, float:2.0)
            int r1 = r7.dp(r1)
            r0.topMargin = r1
            r10.addView(r11, r0)
            android.widget.SeekBar r15 = new android.widget.SeekBar
            r15.<init>(r7)
            r7.styleDialogSeekBar(r15)
            r0 = 150(0x96, float:2.1E-43)
            r15.setMax(r0)
            int r0 = r17 + (-50)
            r15.setProgress(r0)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$7 r5 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$7
            r0 = r5
            r1 = r18
            r2 = r14
            r3 = r11
            r4 = r12
            r8 = r5
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            r15.setOnSeekBarChangeListener(r8)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r1 = -2
            r0.<init>(r9, r1)
            r10.addView(r15, r0)
            r0 = 0
            r1 = r13[r0]
            r2 = r14[r0]
            r7.updateMouseCursorIconPreview(r12, r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cursor size: "
            r1.<init>(r2)
            r0 = r14[r0]
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "%"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r11.setText(r0)
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r7)
            r1 = r16
            android.app.AlertDialog$Builder r0 = r0.setView(r1)
            r1 = 17039360(0x1040000, float:2.424457E-38)
            r2 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            r1 = 17039370(0x104000a, float:2.42446E-38)
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)
            android.app.AlertDialog r0 = r0.create()
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda121 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda121
            r1.<init>(r7, r0)
            r6.setOnClickListener(r1)
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda122 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda122
            r1.<init>(r7, r0, r13, r14)
            r0.setOnShowListener(r1)
            r0.show()
            return
    }

    private void showNotificationDeniedSettingsDialog() {
            r3 = this;
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r3)
            int r1 = ca.dnamobile.javalauncher.R.string.notification_permission_denied_title
            android.app.AlertDialog$Builder r0 = r0.setTitle(r1)
            int r1 = ca.dnamobile.javalauncher.R.string.notification_permission_denied_message
            android.app.AlertDialog$Builder r0 = r0.setMessage(r1)
            r1 = 17039360(0x1040000, float:2.424457E-38)
            r2 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            int r1 = ca.dnamobile.javalauncher.R.string.notification_permission_open_settings
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda106 r2 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda106
            r2.<init>(r3)
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)
            r0.show()
            return
    }

    private void showOfflineAccountsDialog() {
            r10 = this;
            ca.dnamobile.javalauncher.data.AccountStore r0 = r10.accountStore
            r1 = 0
            if (r0 == 0) goto Ld1
            boolean r0 = r0.canUseOfflineMode()
            if (r0 != 0) goto Ld
            goto Ld1
        Ld:
            android.widget.ScrollView r0 = new android.widget.ScrollView
            r0.<init>(r10)
            r2 = 0
            r0.setFillViewport(r2)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r10)
            r3 = 1
            r2.setOrientation(r3)
            r4 = 1103101952(0x41c00000, float:24.0)
            int r4 = r10.dp(r4)
            r5 = 1099956224(0x41900000, float:18.0)
            int r6 = r10.dp(r5)
            r7 = 1082130432(0x40800000, float:4.0)
            int r7 = r10.dp(r7)
            r2.setPadding(r4, r6, r4, r7)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r6 = -1
            r7 = -2
            r4.<init>(r6, r7)
            r0.addView(r2, r4)
            int r4 = ca.dnamobile.javalauncher.R.drawable.ic_player_head_placeholder
            int r8 = ca.dnamobile.javalauncher.R.string.offline_accounts_title
            int r9 = ca.dnamobile.javalauncher.R.string.offline_accounts_dialog_summary
            android.view.View r4 = r10.buildDialogHeader(r4, r8, r9)
            r2.addView(r4)
            android.widget.TextView r4 = new android.widget.TextView
            r4.<init>(r10)
            int r8 = ca.dnamobile.javalauncher.R.string.offline_accounts_section_title
            r4.setText(r8)
            r8 = 16974331(0x10301fb, float:2.406232E-38)
            r4.setTextAppearance(r8)
            android.graphics.Typeface r8 = r4.getTypeface()
            r4.setTypeface(r8, r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r6, r7)
            int r5 = r10.dp(r5)
            r3.topMargin = r5
            r2.addView(r4, r3)
            ca.dnamobile.javalauncher.data.AccountStore r3 = r10.accountStore
            java.util.ArrayList r3 = r3.listOfflineAccounts()
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L84
            android.view.View r3 = r10.buildEmptyOfflineAccountCard()
            r2.addView(r3)
            goto La2
        L84:
            ca.dnamobile.javalauncher.data.AccountStore r4 = r10.accountStore
            ca.dnamobile.javalauncher.data.AccountStore$Account r4 = r4.load()
            java.util.Iterator r3 = r3.iterator()
        L8e:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto La2
            java.lang.Object r5 = r3.next()
            ca.dnamobile.javalauncher.data.AccountStore$Account r5 = (ca.dnamobile.javalauncher.data.AccountStore.Account) r5
            android.view.View r5 = r10.buildOfflineAccountRow(r5, r4)
            r2.addView(r5)
            goto L8e
        La2:
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            r2.<init>(r10)
            android.app.AlertDialog$Builder r0 = r2.setView(r0)
            r2 = 17039360(0x1040000, float:2.424457E-38)
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r2, r1)
            int r2 = ca.dnamobile.javalauncher.R.string.offline_account_add
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r2, r1)
            android.app.AlertDialog r0 = r0.create()
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda71 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda71
            r1.<init>(r10, r0)
            r0.setOnShowListener(r1)
            r10.offlineAccountsDialog = r0
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda82 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda82
            r1.<init>(r10, r0)
            r0.setOnDismissListener(r1)
            r0.show()
            return
        Ld1:
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r10)
            int r2 = ca.dnamobile.javalauncher.R.string.offline_locked_title
            android.app.AlertDialog$Builder r0 = r0.setTitle(r2)
            int r2 = ca.dnamobile.javalauncher.R.string.offline_locked_message
            android.app.AlertDialog$Builder r0 = r0.setMessage(r2)
            r2 = 17039370(0x104000a, float:2.42446E-38)
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r2, r1)
            r0.show()
            return
    }

    private void showRendererPickerDialog() {
            r7 = this;
            java.util.List<ca.dnamobile.javalauncher.renderer.RendererInterface> r0 = r7.availableRenderers
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L13
            int r0 = ca.dnamobile.javalauncher.R.string.renderer_none_found
            r1 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r7, r0, r1)
            r0.show()
            return
        L13:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List<ca.dnamobile.javalauncher.renderer.RendererInterface> r0 = r7.availableRenderers
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4e
            java.lang.Object r1 = r0.next()
            ca.dnamobile.javalauncher.renderer.RendererInterface r1 = (ca.dnamobile.javalauncher.renderer.RendererInterface) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r1.getRendererName()
            java.lang.StringBuilder r2 = r2.append(r3)
            boolean r1 = r1.isExternalPlugin()
            if (r1 == 0) goto L40
            java.lang.String r1 = "  •  Plugin"
            goto L42
        L40:
            java.lang.String r1 = ""
        L42:
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            r4.add(r1)
            goto L1e
        L4e:
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r7.binding
            android.widget.Spinner r0 = r0.spinnerRenderer
            int r5 = r0.getSelectedItemPosition()
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda101 r6 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda101
            r6.<init>(r7)
            java.lang.String r2 = "Renderer"
            java.lang.String r3 = "Choose the renderer Minecraft will use. Plugin renderers are marked in the list."
            r1 = r7
            r1.showStyledSingleChoiceDialog(r2, r3, r4, r5, r6)
            return
    }

    private void showRuntimeComponentsReinstallDialog() {
            r3 = this;
            boolean r0 = r3.runtimeComponentsReinstalling
            r1 = 0
            if (r0 == 0) goto Lf
            java.lang.String r0 = "Runtime/component reinstall is already running."
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r1)
            r0.show()
            return
        Lf:
            android.widget.ScrollView r0 = new android.widget.ScrollView
            r0.<init>(r3)
            r0.setFillViewport(r1)
            int r2 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_DIALOG_BG
            r0.setBackgroundColor(r2)
            r2 = 1
            r0.setVerticalScrollBarEnabled(r2)
            r0.setScrollbarFadingEnabled(r1)
            java.lang.String r1 = "Repair runtime components"
            java.lang.String r2 = "This reruns DroidBridge's bundled component and JRE setup. Use it when the first launch setup was closed early or a Java runtime is missing."
            android.widget.LinearLayout r1 = r3.createStyledDialogRoot(r0, r1, r2)
            android.widget.LinearLayout r1 = r3.addStyledDialogCard(r1)
            java.lang.String r2 = "Reinstall bundled files"
            r3.addStyledDialogCardTitle(r1, r2)
            java.lang.String r2 = "DroidBridge will reinstall bundled components, LWJGL files, support jars, and internal JRE runtimes from the APK. Keep the app open and do not launch Minecraft until this finishes."
            r3.addStyledDialogInfoText(r1, r2)
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r3)
            android.app.AlertDialog$Builder r0 = r1.setView(r0)
            r1 = 17039360(0x1040000, float:2.424457E-38)
            r2 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            java.lang.String r1 = "Reinstall"
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)
            android.app.AlertDialog r0 = r0.create()
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda3 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda3
            r1.<init>(r3, r0)
            r0.setOnShowListener(r1)
            r0.show()
            return
    }

    private void showSignOutConfirmationDialog() {
            r3 = this;
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r3)
            int r1 = ca.dnamobile.javalauncher.R.string.sign_out_confirm_title
            android.app.AlertDialog$Builder r0 = r0.setTitle(r1)
            int r1 = ca.dnamobile.javalauncher.R.string.sign_out_confirm_message
            android.app.AlertDialog$Builder r0 = r0.setMessage(r1)
            r1 = 17039360(0x1040000, float:2.424457E-38)
            r2 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            int r1 = ca.dnamobile.javalauncher.R.string.button_sign_out
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda28 r2 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda28
            r2.<init>(r3)
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)
            r0.show()
            return
    }

    private void showSimpleVoiceChatPermissionDeniedDialog() {
            r3 = this;
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r3)
            int r1 = ca.dnamobile.javalauncher.R.string.simple_voice_chat_microphone_title
            android.app.AlertDialog$Builder r0 = r0.setTitle(r1)
            int r1 = ca.dnamobile.javalauncher.R.string.simple_voice_chat_microphone_denied_message
            android.app.AlertDialog$Builder r0 = r0.setMessage(r1)
            r1 = 17039360(0x1040000, float:2.424457E-38)
            r2 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            int r1 = ca.dnamobile.javalauncher.R.string.simple_voice_chat_open_app_settings
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda129 r2 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda129
            r2.<init>(r3)
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)
            r0.show()
            return
    }

    private void showSimpleVoiceChatPermissionGrantedDialog() {
            r3 = this;
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r3)
            int r1 = ca.dnamobile.javalauncher.R.string.simple_voice_chat_microphone_title
            android.app.AlertDialog$Builder r0 = r0.setTitle(r1)
            int r1 = ca.dnamobile.javalauncher.R.string.simple_voice_chat_microphone_already_granted
            android.app.AlertDialog$Builder r0 = r0.setMessage(r1)
            r1 = 17039370(0x104000a, float:2.42446E-38)
            r2 = 0
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)
            r0.show()
            return
    }

    private void showStyledSingleChoiceDialog(java.lang.String r8, java.lang.String r9, java.util.List<java.lang.String> r10, int r11, ca.dnamobile.javalauncher.LauncherSettingsActivity.StyledDialogItemCallback r12) {
            r7 = this;
            android.widget.ScrollView r0 = new android.widget.ScrollView
            r0.<init>(r7)
            r1 = 0
            r0.setFillViewport(r1)
            int r2 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_DIALOG_BG
            r0.setBackgroundColor(r2)
            r2 = 1
            r0.setVerticalScrollBarEnabled(r2)
            r0.setScrollbarFadingEnabled(r1)
            android.widget.LinearLayout r8 = r7.createStyledDialogRoot(r0, r8, r9)
            android.widget.LinearLayout r8 = r7.addStyledDialogCard(r8)
            boolean r9 = r10.isEmpty()
            if (r9 == 0) goto L25
            r9 = -1
            goto L32
        L25:
            int r9 = r10.size()
            int r9 = r9 - r2
            int r9 = java.lang.Math.min(r11, r9)
            int r9 = java.lang.Math.max(r1, r9)
        L32:
            android.app.AlertDialog[] r11 = new android.app.AlertDialog[r2]
            r3 = r1
        L35:
            int r4 = r10.size()
            if (r3 >= r4) goto L51
            java.lang.Object r4 = r10.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            if (r3 != r9) goto L45
            r5 = r2
            goto L46
        L45:
            r5 = r1
        L46:
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda145 r6 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda145
            r6.<init>(r12, r3, r11)
            r7.addStyledSingleChoiceRow(r8, r4, r5, r6)
            int r3 = r3 + 1
            goto L35
        L51:
            android.app.AlertDialog$Builder r8 = new android.app.AlertDialog$Builder
            r8.<init>(r7)
            android.app.AlertDialog$Builder r8 = r8.setView(r0)
            r9 = 17039360(0x1040000, float:2.424457E-38)
            r10 = 0
            android.app.AlertDialog$Builder r8 = r8.setNegativeButton(r9, r10)
            android.app.AlertDialog r8 = r8.create()
            r11[r1] = r8
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda146 r9 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda146
            r9.<init>(r7, r8)
            r8.setOnShowListener(r9)
            r8.show()
            return
    }

    private void showVulkanDriverPickerDialog() {
            r7 = this;
            java.util.List<ca.dnamobile.javalauncher.renderer.Driver> r0 = r7.availableDrivers
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L13
            java.lang.String r0 = "No Vulkan drivers found."
            r1 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r7, r0, r1)
            r0.show()
            return
        L13:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List<ca.dnamobile.javalauncher.renderer.Driver> r0 = r7.availableDrivers
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r0.next()
            ca.dnamobile.javalauncher.renderer.Driver r1 = (ca.dnamobile.javalauncher.renderer.Driver) r1
            java.lang.String r1 = r1.getName()
            r4.add(r1)
            goto L1e
        L32:
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r7.binding
            android.widget.Spinner r0 = r0.spinnerVulkanDriver
            int r5 = r0.getSelectedItemPosition()
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda63 r6 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda63
            r6.<init>(r7)
            java.lang.String r2 = "Vulkan driver"
            java.lang.String r3 = "Choose the driver used when Vulkan/Zink is selected and the system Vulkan driver switch is off."
            r1 = r7
            r1.showStyledSingleChoiceDialog(r2, r3, r4, r5, r6)
            return
    }

    private java.util.ArrayList<java.lang.String> splitCommandLineArguments(java.lang.String r10) {
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r10 = r10.trim()
            boolean r1 = r10.isEmpty()
            if (r1 == 0) goto L10
            return r0
        L10:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
        L1a:
            int r7 = r10.length()
            r8 = 92
            if (r3 >= r7) goto L64
            char r7 = r10.charAt(r3)
            if (r4 == 0) goto L2d
            r1.append(r7)
            r4 = r2
            goto L61
        L2d:
            if (r7 != r8) goto L31
            r4 = 1
            goto L61
        L31:
            r8 = 39
            if (r7 != r8) goto L3a
            if (r5 != 0) goto L3a
            r6 = r6 ^ 1
            goto L61
        L3a:
            r8 = 34
            if (r7 != r8) goto L43
            if (r6 != 0) goto L43
            r5 = r5 ^ 1
            goto L61
        L43:
            boolean r8 = java.lang.Character.isWhitespace(r7)
            if (r8 == 0) goto L5e
            if (r6 != 0) goto L5e
            if (r5 != 0) goto L5e
            int r7 = r1.length()
            if (r7 <= 0) goto L61
            java.lang.String r7 = r1.toString()
            r0.add(r7)
            r1.setLength(r2)
            goto L61
        L5e:
            r1.append(r7)
        L61:
            int r3 = r3 + 1
            goto L1a
        L64:
            if (r4 == 0) goto L69
            r1.append(r8)
        L69:
            int r10 = r1.length()
            if (r10 <= 0) goto L76
            java.lang.String r10 = r1.toString()
            r0.add(r10)
        L76:
            return r0
    }

    private void startDroidBridgeBackup(android.net.Uri r4) {
            r3 = this;
            java.io.File r0 = r3.resolveCurrentLauncherHome()
            boolean r1 = r0.isDirectory()
            if (r1 != 0) goto L1a
            java.lang.String r4 = "DroidBridge data folder was not found."
            r0 = 1
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r0)
            r4.show()
            java.lang.String r4 = "Backup unavailable. Data folder was not found."
            r3.updateDroidBridgeBackupSummary(r4)
            return
        L1a:
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r3.binding
            com.google.android.material.button.MaterialButton r1 = r1.buttonBackupDroidBridgeData
            r2 = 0
            r1.setEnabled(r2)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r3.binding
            com.google.android.material.button.MaterialButton r1 = r1.buttonRestoreDroidBridgeData
            r1.setEnabled(r2)
            java.lang.String r1 = "Creating backup... Keep DroidBridge open until this finishes."
            r3.updateDroidBridgeBackupSummary(r1)
            java.lang.Thread r1 = new java.lang.Thread
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda85 r2 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda85
            r2.<init>(r3, r0, r4)
            java.lang.String r4 = "DroidBridgeBackup"
            r1.<init>(r2, r4)
            r1.start()
            return
    }

    private void startDroidBridgeRestore(android.net.Uri r4) {
            r3 = this;
            java.io.File r0 = r3.resolveCurrentLauncherHome()
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r3.binding
            com.google.android.material.button.MaterialButton r1 = r1.buttonBackupDroidBridgeData
            r2 = 0
            r1.setEnabled(r2)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r3.binding
            com.google.android.material.button.MaterialButton r1 = r1.buttonRestoreDroidBridgeData
            r1.setEnabled(r2)
            java.lang.String r1 = "Restoring backup... Keep DroidBridge open until this finishes."
            r3.updateDroidBridgeBackupSummary(r1)
            java.lang.Thread r1 = new java.lang.Thread
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda116 r2 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda116
            r2.<init>(r3, r4, r0)
            java.lang.String r4 = "DroidBridgeRestore"
            r1.<init>(r2, r4)
            r1.start()
            return
    }

    private void startJarExecution(android.net.Uri r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            if (r0 == 0) goto L64
            com.google.android.material.button.MaterialButton r0 = r0.buttonExecuteJarFile
            if (r0 != 0) goto L9
            goto L64
        L9:
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonExecuteJarFile
            r1 = 0
            r0.setEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonExecuteJarFile
            java.lang.String r1 = "Running jar..."
            r0.setText(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Preparing "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r1 = "..."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.updateJarExecutionSummary(r0)
            boolean r0 = r2.shouldUseJavaGuiLauncherActivity(r4)
            if (r0 == 0) goto L55
            boolean r3 = r2.openJavaGuiLauncherActivityIfAvailable(r3, r4, r5)
            if (r3 == 0) goto L42
            r2.resetJarExecutionButton()
            return
        L42:
            r2.resetJarExecutionButton()
            java.lang.String r3 = "This jar is a desktop Swing/AWT installer. DroidBridge's settings runner now blocks the direct ProcessBuilder path because Internal-8 is crashing in libjvm before Cacio starts on this device. Zalith does not run these jars this way; it opens a Java GUI launcher Activity with an AWT surface and starts the JVM through the JLI/VMLauncher bridge. Fabric-style command-line jars still run from this button. OptiFine needs the Java GUI launcher Activity port or a native OptiFine extractor."
            r2.updateJarExecutionSummary(r3)
            java.lang.String r3 = "OptiFine-style GUI jars need the Java GUI launcher bridge."
            r4 = 1
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r4)
            r3.show()
            return
        L55:
            java.lang.Thread r0 = new java.lang.Thread
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda4 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda4
            r1.<init>(r2, r4, r3, r5)
            java.lang.String r3 = "DroidBridgeJarExecution"
            r0.<init>(r1, r3)
            r0.start()
        L64:
            return
    }

    private void startMicrosoftSignInFlow(boolean r3) {
            r2 = this;
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal r0 = r2.authManager
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal.isConfigured()
            if (r0 != 0) goto L15
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r3 = r2.binding
            android.widget.TextView r3 = r3.textAccountStatus
            int r0 = ca.dnamobile.javalauncher.R.string.msg_configure_client_id
            r3.setText(r0)
            return
        L15:
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonSignIn
            r1 = 0
            r0.setEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonAddMicrosoftAccount
            r0.setEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonManageMicrosoftAccounts
            r0.setEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            android.widget.TextView r0 = r0.textAccountStatus
            if (r3 == 0) goto L34
            java.lang.String r3 = "Adding another Microsoft account..."
            goto L3a
        L34:
            int r3 = ca.dnamobile.javalauncher.R.string.status_signed_out
            java.lang.String r3 = r2.getString(r3)
        L3a:
            r0.setText(r3)
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal r3 = r2.authManager
            r3.signIn()
            return
    }

    private void startRuntimeComponentsReinstall() {
            r3 = this;
            boolean r0 = r3.runtimeComponentsReinstalling
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r3.runtimeComponentsReinstalling = r0
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonReinstallRuntimeComponents
            r1 = 0
            r0.setEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonReinstallRuntimeComponents
            java.lang.String r1 = "Reinstalling..."
            r0.setText(r1)
            java.lang.String r0 = "Starting runtime/component reinstall... Keep DroidBridge open."
            r3.updateRuntimeComponentsReinstallSummary(r0)
            java.lang.Thread r0 = new java.lang.Thread
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda12 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda12
            r1.<init>(r3)
            java.lang.String r2 = "DroidBridgeRuntimeComponentRepair"
            r0.<init>(r1, r2)
            r0.start()
            return
    }

    private void styleDialogOutlinedButton(com.google.android.material.button.MaterialButton r2) {
            r1 = this;
            int r0 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_ACCENT
            r2.setTextColor(r0)
            int r0 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_CARD_BG
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r2.setBackgroundTintList(r0)
            int r0 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_ACCENT_MUTED
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r2.setStrokeColor(r0)
            int r0 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_CARD_BG_PRESSED
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r2.setRippleColor(r0)
            return
    }

    private void styleDialogRadioButton(android.widget.RadioButton r4) {
            r3 = this;
            int r0 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_TEXT_SECONDARY
            r4.setTextColor(r0)
            r0 = 1097859072(0x41700000, float:15.0)
            r4.setTextSize(r0)
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = r3.dp(r0)
            int r0 = r3.dp(r0)
            r2 = 0
            r4.setPadding(r2, r1, r2, r0)
            r0 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r0 = new int[]{r0}
            r1 = -16842912(0xfffffffffefeff60, float:-1.6947495E38)
            int[] r1 = new int[]{r1}
            int[][] r0 = new int[][]{r0, r1}
            int r1 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_ACCENT
            int r2 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_TEXT_MUTED
            int[] r1 = new int[]{r1, r2}
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r0, r1)
            r4.setButtonTintList(r2)
            return
    }

    private void styleDialogSeekBar(android.widget.SeekBar r3) {
            r2 = this;
            int r0 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_ACCENT
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r0)
            r3.setThumbTintList(r1)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r3.setProgressTintList(r0)
            int r0 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_CARD_STROKE
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r3.setProgressBackgroundTintList(r0)
            return
    }

    private void styleLauncherDialogChrome(android.app.AlertDialog r4) {
            r3 = this;
            android.view.Window r0 = r4.getWindow()
            if (r0 == 0) goto L17
            int r1 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_DIALOG_BG
            r2 = 22
            android.graphics.drawable.GradientDrawable r1 = r3.roundedDrawable(r1, r1, r2)
            r0.setBackgroundDrawable(r1)
            r1 = 1058306785(0x3f147ae1, float:0.58)
            r0.setDimAmount(r1)
        L17:
            r0 = -1
            r3.tintLauncherDialogButton(r4, r0)
            r0 = -2
            r3.tintLauncherDialogButton(r4, r0)
            r0 = -3
            r3.tintLauncherDialogButton(r4, r0)
            return
    }

    private void tintLauncherDialogButton(android.app.AlertDialog r1, int r2) {
            r0 = this;
            android.widget.Button r1 = r1.getButton(r2)
            if (r1 == 0) goto Lb
            int r2 = ca.dnamobile.javalauncher.LauncherSettingsActivity.COLOR_ACCENT
            r1.setTextColor(r2)
        Lb:
            return
    }

    private void updateAccountStatus(ca.dnamobile.javalauncher.data.AccountStore.Account r11) {
            r10 = this;
            boolean r0 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAccountRegistry.isUsableMicrosoftAccount(r11)
            if (r0 == 0) goto L9
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAccountRegistry.save(r10, r11)
        L9:
            ca.dnamobile.javalauncher.data.AccountStore r0 = r10.accountStore
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L17
            boolean r0 = r0.hasStoredMicrosoftAccount()
            if (r0 == 0) goto L17
            r0 = r1
            goto L18
        L17:
            r0 = r2
        L18:
            boolean r3 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAccountRegistry.hasAny(r10)
            if (r0 != 0) goto L23
            if (r3 == 0) goto L21
            goto L23
        L21:
            r4 = r2
            goto L24
        L23:
            r4 = r1
        L24:
            ca.dnamobile.javalauncher.data.AccountStore r5 = r10.accountStore
            if (r5 == 0) goto L30
            boolean r5 = r5.canUseOfflineMode()
            if (r5 == 0) goto L30
            r5 = r1
            goto L31
        L30:
            r5 = r2
        L31:
            if (r11 == 0) goto L3b
            boolean r6 = r11.isOfflineAccount()
            if (r6 == 0) goto L3b
            r6 = r1
            goto L3c
        L3b:
            r6 = r2
        L3c:
            if (r11 == 0) goto L46
            boolean r7 = r11.isMicrosoftAccount()
            if (r7 == 0) goto L46
            r7 = r1
            goto L47
        L46:
            r7 = r2
        L47:
            int r8 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAccountRegistry.count(r10)
            if (r0 == 0) goto L51
            if (r3 != 0) goto L51
            r0 = r1
            goto L52
        L51:
            r0 = r2
        L52:
            int r8 = r8 + r0
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r10.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonSignIn
            r3 = 8
            if (r4 == 0) goto L5d
            r9 = r3
            goto L5e
        L5d:
            r9 = r2
        L5e:
            r0.setVisibility(r9)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r10.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonAddMicrosoftAccount
            if (r4 == 0) goto L69
            r9 = r2
            goto L6a
        L69:
            r9 = r3
        L6a:
            r0.setVisibility(r9)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r10.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonAddMicrosoftAccount
            r0.setEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r10.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonManageMicrosoftAccounts
            if (r4 == 0) goto L7c
            r9 = r2
            goto L7d
        L7c:
            r9 = r3
        L7d:
            r0.setVisibility(r9)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r10.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonManageMicrosoftAccounts
            r0.setEnabled(r4)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r10.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonSignOut
            if (r4 != 0) goto L92
            if (r11 == 0) goto L90
            goto L92
        L90:
            r9 = r3
            goto L93
        L92:
            r9 = r2
        L93:
            r0.setVisibility(r9)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r10.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonManageOfflineAccounts
            if (r5 == 0) goto L9e
            r9 = r2
            goto L9f
        L9e:
            r9 = r3
        L9f:
            r0.setVisibility(r9)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r10.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonManageOfflineAccounts
            r0.setEnabled(r5)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r10.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonUseMicrosoftAccount
            if (r4 == 0) goto Lb3
            if (r6 == 0) goto Lb3
            r9 = r2
            goto Lb4
        Lb3:
            r9 = r3
        Lb4:
            r0.setVisibility(r9)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r10.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonUseMicrosoftAccount
            if (r8 <= r1) goto Lc0
            java.lang.String r9 = "Choose Microsoft account"
            goto Lc6
        Lc0:
            int r9 = ca.dnamobile.javalauncher.R.string.button_use_microsoft_account
            java.lang.String r9 = r10.getString(r9)
        Lc6:
            r0.setText(r9)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r10.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonRefreshMicrosoftSkin
            if (r4 == 0) goto Ld0
            goto Ld1
        Ld0:
            r2 = r3
        Ld1:
            r0.setVisibility(r2)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r10.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonRefreshMicrosoftSkin
            r0.setEnabled(r4)
            if (r6 == 0) goto L106
            ca.dnamobile.javalauncher.data.AccountStore r0 = r10.accountStore
            if (r0 == 0) goto Le6
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r0.loadLastMicrosoftAccount()
            goto Le7
        Le6:
            r0 = 0
        Le7:
            if (r0 == 0) goto Lee
            java.lang.String r0 = r0.getBestDisplayName()
            goto Lf0
        Lee:
            java.lang.String r0 = "Microsoft account"
        Lf0:
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r10.binding
            android.widget.TextView r1 = r1.textAccountStatus
            int r2 = ca.dnamobile.javalauncher.R.string.status_offline_account_with_microsoft
            java.lang.String r11 = r11.getBestDisplayName()
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r0}
            java.lang.String r11 = r10.getString(r2, r11)
            r1.setText(r11)
            return
        L106:
            if (r7 == 0) goto L11e
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r10.binding
            android.widget.TextView r0 = r0.textAccountStatus
            int r1 = ca.dnamobile.javalauncher.R.string.status_signed_in
            java.lang.String r11 = r11.getBestDisplayName()
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            java.lang.String r11 = r10.getString(r1, r11)
            r0.setText(r11)
            return
        L11e:
            if (r4 == 0) goto L162
            ca.dnamobile.javalauncher.data.AccountStore$Account r11 = r10.getPreferredRememberedMicrosoftAccount()
            if (r11 == 0) goto L12b
            java.lang.String r11 = r11.getBestDisplayName()
            goto L12d
        L12b:
            java.lang.String r11 = "Microsoft Player"
        L12d:
            if (r8 <= r1) goto L150
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r10.binding
            android.widget.TextView r0 = r0.textAccountStatus
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Microsoft accounts saved: "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r8)
            java.lang.String r2 = " • Last used: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r11 = r1.append(r11)
            java.lang.String r11 = r11.toString()
            r0.setText(r11)
            goto L161
        L150:
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r10.binding
            android.widget.TextView r0 = r0.textAccountStatus
            int r1 = ca.dnamobile.javalauncher.R.string.status_microsoft_remembered
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            java.lang.String r11 = r10.getString(r1, r11)
            r0.setText(r11)
        L161:
            return
        L162:
            if (r5 == 0) goto L16e
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r11 = r10.binding
            android.widget.TextView r11 = r11.textAccountStatus
            int r0 = ca.dnamobile.javalauncher.R.string.status_signed_out_offline_unlocked
            r11.setText(r0)
            goto L177
        L16e:
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r11 = r10.binding
            android.widget.TextView r11 = r11.textAccountStatus
            int r0 = ca.dnamobile.javalauncher.R.string.status_signed_out
            r11.setText(r0)
        L177:
            return
    }

    private void updateAvailableMemorySummary(int r7) {
            r6 = this;
            int r0 = ca.dnamobile.javalauncher.settings.MemoryAllocationUtils.getTotalMemoryMb(r6)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r6.binding
            android.widget.TextView r1 = r1.textAvailableRamSummary
            int r2 = ca.dnamobile.javalauncher.R.string.memory_available_summary
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            float r7 = (float) r7
            r4 = 1149239296(0x44800000, float:1024.0)
            float r7 = r7 / r4
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            float r0 = (float) r0
            float r0 = r0 / r4
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object[] r7 = new java.lang.Object[]{r3, r7, r5, r0}
            java.lang.String r7 = r6.getString(r2, r7)
            r1.setText(r7)
            return
    }

    private void updateAvoidRoundedCornersSwitchText(boolean r2) {
            r1 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r1.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchAvoidRoundedCorners
            if (r2 == 0) goto L9
            int r2 = ca.dnamobile.javalauncher.R.string.settings_renderer_avoid_rounded_corners_on
            goto Lb
        L9:
            int r2 = ca.dnamobile.javalauncher.R.string.settings_renderer_avoid_rounded_corners_off
        Lb:
            r0.setText(r2)
            return
    }

    private void updateChangeMicrosoftCapeButtonState(ca.dnamobile.javalauncher.data.AccountStore.Account r3) {
            r2 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            if (r0 != 0) goto L5
            return
        L5:
            ca.dnamobile.javalauncher.data.AccountStore$Account r3 = r2.getMicrosoftSkinTargetAccount(r3)
            r0 = 0
            if (r3 == 0) goto L1a
            boolean r1 = r3.isMicrosoftAccount()
            if (r1 == 0) goto L1a
            boolean r3 = r3.hasMinecraftSession()
            if (r3 == 0) goto L1a
            r3 = 1
            goto L1b
        L1a:
            r3 = r0
        L1b:
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r2.binding
            com.google.android.material.button.MaterialButton r1 = r1.buttonChangeMicrosoftCape
            if (r3 == 0) goto L22
            goto L24
        L22:
            r0 = 8
        L24:
            r1.setVisibility(r0)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonChangeMicrosoftCape
            r0.setEnabled(r3)
            return
    }

    private void updateChangeMicrosoftSkinButtonState(ca.dnamobile.javalauncher.data.AccountStore.Account r3) {
            r2 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            if (r0 != 0) goto L5
            return
        L5:
            ca.dnamobile.javalauncher.data.AccountStore$Account r3 = r2.getMicrosoftSkinTargetAccount(r3)
            r0 = 0
            if (r3 == 0) goto L1a
            boolean r1 = r3.isMicrosoftAccount()
            if (r1 == 0) goto L1a
            boolean r3 = r3.hasMinecraftSession()
            if (r3 == 0) goto L1a
            r3 = 1
            goto L1b
        L1a:
            r3 = r0
        L1b:
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r2.binding
            com.google.android.material.button.MaterialButton r1 = r1.buttonChangeMicrosoftSkin
            if (r3 == 0) goto L22
            goto L24
        L22:
            r0 = 8
        L24:
            r1.setVisibility(r0)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonChangeMicrosoftSkin
            r0.setEnabled(r3)
            return
    }

    private void updateDoubleTapToDropEnabledState(boolean r2) {
            r1 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r1.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchDoubleTapToDrop
            r0.setEnabled(r2)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r1.binding
            android.widget.TextView r0 = r0.textDoubleTapToDropSummary
            if (r2 == 0) goto L10
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L13
        L10:
            r2 = 1057803469(0x3f0ccccd, float:0.55)
        L13:
            r0.setAlpha(r2)
            return
    }

    private void updateDoubleTapToDropSwitchText(boolean r2) {
            r1 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r1.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchDoubleTapToDrop
            if (r2 == 0) goto L9
            int r2 = ca.dnamobile.javalauncher.R.string.controller_double_tap_to_drop_on
            goto Lb
        L9:
            int r2 = ca.dnamobile.javalauncher.R.string.controller_double_tap_to_drop_off
        Lb:
            r0.setText(r2)
            return
    }

    private void updateDroidBridgeBackupSummary() {
            r3 = this;
            java.io.File r0 = r3.resolveCurrentLauncherHome()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Current data folder: "
            r1.<init>(r2)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r3.updateDroidBridgeBackupSummary(r0)
            return
    }

    private void updateDroidBridgeBackupSummary(java.lang.String r2) {
            r1 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r1.binding
            if (r0 == 0) goto Lf
            android.widget.TextView r0 = r0.textDroidBridgeBackupSummary
            if (r0 == 0) goto Lf
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r1.binding
            android.widget.TextView r0 = r0.textDroidBridgeBackupSummary
            r0.setText(r2)
        Lf:
            return
    }

    private void updateFloatingFpsSwitchText(android.widget.CompoundButton r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L5
            java.lang.String r2 = "Show FPS counter: On"
            goto L7
        L5:
            java.lang.String r2 = "Show FPS counter: Off"
        L7:
            r1.setText(r2)
            return
    }

    private void updateForceFullscreenSwitchText(boolean r2) {
            r1 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r1.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchForceFullscreenMode
            if (r2 == 0) goto L9
            int r2 = ca.dnamobile.javalauncher.R.string.settings_renderer_full_screen_on
            goto Lb
        L9:
            int r2 = ca.dnamobile.javalauncher.R.string.settings_renderer_full_screen_off
        Lb:
            r0.setText(r2)
            return
    }

    private void updateForceSdlControllerBridgeSwitchText(boolean r2) {
            r1 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r1.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchForceSdlControllerBridge
            if (r2 == 0) goto L9
            int r2 = ca.dnamobile.javalauncher.R.string.controller_force_sdl_on
            goto Lb
        L9:
            int r2 = ca.dnamobile.javalauncher.R.string.controller_force_sdl_off
        Lb:
            r0.setText(r2)
            return
    }

    private void updateGameLogOverlaySwitchText(boolean r2) {
            r1 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r1.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchShowGameLogOverlay
            if (r2 == 0) goto L9
            int r2 = ca.dnamobile.javalauncher.R.string.game_log_overlay_on
            goto Lb
        L9:
            int r2 = ca.dnamobile.javalauncher.R.string.game_log_overlay_off
        Lb:
            r0.setText(r2)
            return
    }

    private void updateHardwareMouseDpiScaleText(int r4) {
            r3 = this;
            android.widget.TextView r0 = r3.textHardwareMouseDpiScale
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Mouse DPI scale: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = "%"
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.setText(r4)
        L1c:
            return
    }

    private void updateHardwareMouseDpiScaleUi(int r3) {
            r2 = this;
            r0 = 300(0x12c, float:4.2E-43)
            int r3 = java.lang.Math.min(r0, r3)
            r0 = 25
            int r3 = java.lang.Math.max(r0, r3)
            android.widget.SeekBar r0 = r2.sliderHardwareMouseDpiScale
            if (r0 == 0) goto L15
            int r1 = r3 + (-25)
            r0.setProgress(r1)
        L15:
            r2.updateHardwareMouseDpiScaleText(r3)
            return
    }

    private void updateIgnoreDisplayCutoutSwitchText(boolean r2) {
            r1 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r1.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchIgnoreDisplayCutout
            if (r2 == 0) goto L9
            int r2 = ca.dnamobile.javalauncher.R.string.settings_renderer_ignore_notch_on
            goto Lb
        L9:
            int r2 = ca.dnamobile.javalauncher.R.string.settings_renderer_ignore_notch_off
        Lb:
            r0.setText(r2)
            return
    }

    private void updateInGameSettingsButtonSwitchText(boolean r2) {
            r1 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r1.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchShowInGameSettingsButton
            if (r2 == 0) goto L9
            int r2 = ca.dnamobile.javalauncher.R.string.game_settings_button_on
            goto Lb
        L9:
            int r2 = ca.dnamobile.javalauncher.R.string.game_settings_button_off
        Lb:
            r0.setText(r2)
            return
    }

    private void updateInstallNotificationSettingsUi() {
            r4 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r4.binding
            if (r0 == 0) goto L66
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchInstallNotifications
            if (r0 != 0) goto L9
            goto L66
        L9:
            boolean r0 = ca.dnamobile.javalauncher.notifications.LauncherNotificationPermissionHelper.hasPostNotificationsPermission(r4)
            boolean r1 = ca.dnamobile.javalauncher.notifications.LauncherNotificationPermissionHelper.isBackgroundInstallNotificationsEnabled(r4)
            if (r1 == 0) goto L17
            if (r0 == 0) goto L17
            r1 = 1
            goto L18
        L17:
            r1 = 0
        L18:
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r2 = r4.binding
            com.google.android.material.switchmaterial.SwitchMaterial r2 = r2.switchInstallNotifications
            r3 = 0
            r2.setOnCheckedChangeListener(r3)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r2 = r4.binding
            com.google.android.material.switchmaterial.SwitchMaterial r2 = r2.switchInstallNotifications
            r2.setChecked(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r2 = r4.binding
            com.google.android.material.switchmaterial.SwitchMaterial r2 = r2.switchInstallNotifications
            if (r1 == 0) goto L30
            int r1 = ca.dnamobile.javalauncher.R.string.install_notifications_on
            goto L32
        L30:
            int r1 = ca.dnamobile.javalauncher.R.string.install_notifications_off
        L32:
            r2.setText(r1)
            boolean r1 = ca.dnamobile.javalauncher.notifications.LauncherNotificationPermissionHelper.requiresRuntimePermission()
            if (r1 != 0) goto L45
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r4.binding
            android.widget.TextView r0 = r0.textInstallNotificationsSummary
            int r1 = ca.dnamobile.javalauncher.R.string.install_notifications_summary_old_android
            r0.setText(r1)
            goto L5a
        L45:
            if (r0 == 0) goto L51
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r4.binding
            android.widget.TextView r0 = r0.textInstallNotificationsSummary
            int r1 = ca.dnamobile.javalauncher.R.string.install_notifications_summary_enabled
            r0.setText(r1)
            goto L5a
        L51:
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r4.binding
            android.widget.TextView r0 = r0.textInstallNotificationsSummary
            int r1 = ca.dnamobile.javalauncher.R.string.install_notifications_summary_permission_needed
            r0.setText(r1)
        L5a:
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r4.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchInstallNotifications
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda13 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda13
            r1.<init>(r4)
            r0.setOnCheckedChangeListener(r1)
        L66:
            return
    }

    private void updateJarExecutionSummary(java.lang.String r2) {
            r1 = this;
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda111 r0 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda111
            r0.<init>(r1, r2)
            r1.runOnUiThread(r0)
            return
    }

    private void updateMemorySeekBarBounds(int r3) {
            r2 = this;
            int r0 = ca.dnamobile.javalauncher.settings.MemoryAllocationUtils.getMaxAllocatableMemoryMb(r2)
            int r1 = ca.dnamobile.javalauncher.settings.MemoryAllocationUtils.getMinimumMemoryMb(r0)
            int r3 = ca.dnamobile.javalauncher.settings.MemoryAllocationUtils.clampToAllowedRam(r2, r3)
            int r0 = r0 - r1
            int r0 = r0 / 256
            r1 = 1
            int r0 = java.lang.Math.max(r1, r0)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r2.binding
            android.widget.SeekBar r1 = r1.sliderAllocatedRam
            r1.setMax(r0)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            android.widget.SeekBar r0 = r0.sliderAllocatedRam
            int r3 = r2.progressFromMemory(r3)
            r0.setProgress(r3)
            return
    }

    private void updateMemorySlider(int r2) {
            r1 = this;
            int r0 = ca.dnamobile.javalauncher.settings.MemoryAllocationUtils.getMaxAllocatableMemoryMb(r1)
            int r2 = ca.dnamobile.javalauncher.settings.MemoryAllocationUtils.clampToAllowedRam(r1, r2)
            r1.updateMemorySeekBarBounds(r2)
            r1.updateMemoryText(r2)
            r1.updateAvailableMemorySummary(r0)
            return
    }

    private void updateMemoryText(int r5) {
            r4 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r4.binding
            android.widget.TextView r0 = r0.textAllocatedRam
            int r1 = ca.dnamobile.javalauncher.R.string.memory_allocated_value
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            float r5 = (float) r5
            r3 = 1149239296(0x44800000, float:1024.0)
            float r5 = r5 / r3
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r2, r5}
            java.lang.String r5 = r4.getString(r1, r5)
            r0.setText(r5)
            return
    }

    private void updateMinecraftTouchGestureSettingsUi() {
            r4 = this;
            boolean r0 = ca.dnamobile.javalauncher.controls.ControlsPreferences.isMinecraftTouchGesturesEnabled(r4)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r4.binding
            com.google.android.material.switchmaterial.SwitchMaterial r1 = r1.switchMinecraftTouchGestures
            r2 = 0
            r1.setOnCheckedChangeListener(r2)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r4.binding
            com.google.android.material.switchmaterial.SwitchMaterial r1 = r1.switchMinecraftTouchGestures
            r1.setChecked(r0)
            r4.updateMinecraftTouchGesturesSwitchText(r0)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r4.binding
            com.google.android.material.switchmaterial.SwitchMaterial r1 = r1.switchMinecraftTouchGestures
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda127 r3 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda127
            r3.<init>(r4)
            r1.setOnCheckedChangeListener(r3)
            boolean r1 = ca.dnamobile.javalauncher.controls.ControlsPreferences.isDoubleTapToDropEnabled(r4)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r3 = r4.binding
            com.google.android.material.switchmaterial.SwitchMaterial r3 = r3.switchDoubleTapToDrop
            r3.setOnCheckedChangeListener(r2)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r2 = r4.binding
            com.google.android.material.switchmaterial.SwitchMaterial r2 = r2.switchDoubleTapToDrop
            r2.setChecked(r1)
            r4.updateDoubleTapToDropSwitchText(r1)
            r4.updateDoubleTapToDropEnabledState(r0)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r4.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchDoubleTapToDrop
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda128 r1 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda128
            r1.<init>(r4)
            r0.setOnCheckedChangeListener(r1)
            return
    }

    private void updateMinecraftTouchGesturesSwitchText(boolean r2) {
            r1 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r1.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchMinecraftTouchGestures
            if (r2 == 0) goto L9
            int r2 = ca.dnamobile.javalauncher.R.string.controller_minecraft_touch_gestures_on
            goto Lb
        L9:
            int r2 = ca.dnamobile.javalauncher.R.string.controller_minecraft_touch_gestures_off
        Lb:
            r0.setText(r2)
            return
    }

    private void updateMobileGluesConfigSummary(ca.dnamobile.javalauncher.renderer.RendererInterface r3) {
            r2 = this;
            boolean r0 = ca.dnamobile.javalauncher.renderer.MobileGluesConfigHelper.isMobileGluesRenderer(r3)
            if (r0 != 0) goto L20
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r3 = r2.binding
            android.widget.TextView r3 = r3.textRendererPluginConfig
            java.lang.String r0 = ""
            r3.setText(r0)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r3 = r2.binding
            android.widget.TextView r3 = r3.textRendererPluginConfig
            r0 = 8
            r3.setVisibility(r0)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r3 = r2.binding
            com.google.android.material.button.MaterialButton r3 = r3.buttonGrantRendererStorageAccess
            r3.setVisibility(r0)
            return
        L20:
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            android.widget.TextView r0 = r0.textRendererPluginConfig
            java.lang.String r3 = ca.dnamobile.javalauncher.renderer.MobileGluesConfigHelper.buildSettingsSummary(r2, r3)
            r0.setText(r3)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r3 = r2.binding
            android.widget.TextView r3 = r3.textRendererPluginConfig
            r0 = 0
            r3.setVisibility(r0)
            boolean r3 = ca.dnamobile.javalauncher.renderer.MobileGluesConfigHelper.hasStorageAccess(r2)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r2.binding
            com.google.android.material.button.MaterialButton r1 = r1.buttonGrantRendererStorageAccess
            r1.setVisibility(r0)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonGrantRendererStorageAccess
            r1 = 1
            r0.setEnabled(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonGrantRendererStorageAccess
            if (r3 == 0) goto L4f
            java.lang.String r3 = "Choose MobileGlues folder again"
            goto L51
        L4f:
            java.lang.String r3 = "Choose MobileGlues folder"
        L51:
            r0.setText(r3)
            return
    }

    private void updateMouseCursorIconPreview(android.widget.ImageView r5, java.lang.String r6, int r7) {
            r4 = this;
            r0 = 200(0xc8, float:2.8E-43)
            int r7 = java.lang.Math.min(r0, r7)
            r0 = 50
            int r7 = java.lang.Math.max(r0, r7)
            r0 = 1118830592(0x42b00000, float:88.0)
            int r0 = r4.dp(r0)
            r1 = 1105199104(0x41e00000, float:28.0)
            int r1 = r4.dp(r1)
            int r7 = r7 * r0
            float r7 = (float) r7
            r2 = 1124204544(0x43020000, float:130.0)
            float r7 = r7 / r2
            int r7 = java.lang.Math.round(r7)
            int r7 = java.lang.Math.min(r0, r7)
            int r7 = java.lang.Math.max(r1, r7)
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            if (r1 == 0) goto L36
            r1.width = r0
            r1.height = r0
            r5.setLayoutParams(r1)
        L36:
            int r0 = r0 - r7
            int r0 = r0 / 2
            r7 = 0
            int r1 = java.lang.Math.max(r7, r0)
            int r2 = java.lang.Math.max(r7, r0)
            int r3 = java.lang.Math.max(r7, r0)
            int r7 = java.lang.Math.max(r7, r0)
            r5.setPadding(r1, r2, r3, r7)
            java.lang.String r7 = "custom"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L6e
            boolean r7 = ca.dnamobile.javalauncher.controls.ControlsPreferences.hasCustomMouseCursorIcon(r4)
            if (r7 == 0) goto L6e
            java.lang.String r7 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getCustomMouseCursorPath(r4)
            if (r7 == 0) goto L6e
            java.io.File r6 = new java.io.File
            r6.<init>(r7)
            android.net.Uri r6 = android.net.Uri.fromFile(r6)
            r5.setImageURI(r6)
            return
        L6e:
            android.content.res.Resources r7 = r4.getResources()
            java.lang.String r6 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getMouseCursorResourceName(r6)
            java.lang.String r0 = r4.getPackageName()
            java.lang.String r1 = "drawable"
            int r6 = r7.getIdentifier(r6, r1, r0)
            if (r6 != 0) goto L90
            android.content.res.Resources r6 = r4.getResources()
            java.lang.String r7 = "ic_gamepad_pointer"
            java.lang.String r0 = r4.getPackageName()
            int r6 = r6.getIdentifier(r7, r1, r0)
        L90:
            if (r6 == 0) goto L95
            r5.setImageResource(r6)
        L95:
            return
    }

    private void updateMouseCursorIconSettingsSummary() {
            r4 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r4.binding
            if (r0 == 0) goto L4b
            android.widget.TextView r0 = r0.textMouseCursorIconSummary
            if (r0 != 0) goto L9
            goto L4b
        L9:
            java.lang.String r0 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getMouseCursorStyle(r4)
            java.lang.String r1 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getMouseCursorStyleLabel(r0)
            java.lang.String r2 = "custom"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L21
            boolean r0 = ca.dnamobile.javalauncher.controls.ControlsPreferences.hasCustomMouseCursorIcon(r4)
            if (r0 != 0) goto L21
            java.lang.String r1 = "Custom image not selected"
        L21:
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r4.binding
            android.widget.TextView r0 = r0.textMouseCursorIconSummary
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Selected: "
            r2.<init>(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = " • Size: "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getMouseCursorSizePercent(r4)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "%"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
        L4b:
            return
    }

    private void updateOpenGl26PlusSwitchText(boolean r2) {
            r1 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r1.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchUseOpenGlFor26Plus
            if (r2 == 0) goto L9
            int r2 = ca.dnamobile.javalauncher.R.string.use_opengl_26_plus_on
            goto Lb
        L9:
            int r2 = ca.dnamobile.javalauncher.R.string.use_opengl_26_plus_off
        Lb:
            r0.setText(r2)
            return
    }

    private void updatePendingOfflineSkinPreview(android.net.Uri r6) {
            r5 = this;
            android.widget.ImageView r0 = r5.pendingOfflineSkinPreview
            if (r0 != 0) goto L5
            return
        L5:
            java.io.File r0 = new java.io.File
            java.io.File r1 = r5.getCacheDir()
            java.lang.String r2 = "pending_offline_skin_preview.png"
            r0.<init>(r1, r2)
            android.content.ContentResolver r1 = r5.getContentResolver()     // Catch: java.lang.Throwable -> L6a
            java.io.InputStream r6 = r1.openInputStream(r6)     // Catch: java.lang.Throwable -> L6a
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5e
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L5e
            if (r6 == 0) goto L4d
            r2 = 8192(0x2000, float:1.148E-41)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L4b
        L23:
            int r3 = r6.read(r2)     // Catch: java.lang.Throwable -> L4b
            r4 = -1
            if (r3 == r4) goto L2f
            r4 = 0
            r1.write(r2, r4, r3)     // Catch: java.lang.Throwable -> L4b
            goto L23
        L2f:
            android.graphics.Bitmap r0 = ca.dnamobile.javalauncher.skin.PlayerHeadLoader.loadHeadFromSkinFile(r0)     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L3b
            android.widget.ImageView r2 = r5.pendingOfflineSkinPreview     // Catch: java.lang.Throwable -> L4b
            r2.setImageBitmap(r0)     // Catch: java.lang.Throwable -> L4b
            goto L42
        L3b:
            android.widget.ImageView r0 = r5.pendingOfflineSkinPreview     // Catch: java.lang.Throwable -> L4b
            int r2 = ca.dnamobile.javalauncher.R.drawable.ic_player_head_placeholder     // Catch: java.lang.Throwable -> L4b
            r0.setImageResource(r2)     // Catch: java.lang.Throwable -> L4b
        L42:
            r1.close()     // Catch: java.lang.Throwable -> L5e
            if (r6 == 0) goto L71
            r6.close()     // Catch: java.lang.Throwable -> L6a
            goto L71
        L4b:
            r0 = move-exception
            goto L55
        L4d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4b
            java.lang.String r2 = "Unable to open selected skin."
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L4b
            throw r0     // Catch: java.lang.Throwable -> L4b
        L55:
            r1.close()     // Catch: java.lang.Throwable -> L59
            goto L5d
        L59:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch: java.lang.Throwable -> L5e
        L5d:
            throw r0     // Catch: java.lang.Throwable -> L5e
        L5e:
            r0 = move-exception
            if (r6 == 0) goto L69
            r6.close()     // Catch: java.lang.Throwable -> L65
            goto L69
        L65:
            r6 = move-exception
            r0.addSuppressed(r6)     // Catch: java.lang.Throwable -> L6a
        L69:
            throw r0     // Catch: java.lang.Throwable -> L6a
        L6a:
            android.widget.ImageView r6 = r5.pendingOfflineSkinPreview
            int r0 = ca.dnamobile.javalauncher.R.drawable.ic_player_head_placeholder
            r6.setImageResource(r0)
        L71:
            return
    }

    private void updatePlayerModelPreview(ca.dnamobile.javalauncher.data.AccountStore.Account r3) {
            r2 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            if (r0 == 0) goto L32
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView r0 = r0.modelPlayerPreview
            if (r0 != 0) goto L9
            goto L32
        L9:
            ca.dnamobile.javalauncher.data.AccountStore$Account r3 = r2.getMicrosoftSkinTargetAccount(r3)
            if (r3 == 0) goto L27
            boolean r0 = r3.isMicrosoftAccount()
            if (r0 == 0) goto L27
            java.lang.String r0 = r3.skinUrl
            boolean r0 = isNullOrBlank(r0)
            if (r0 != 0) goto L27
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView r0 = r0.modelPlayerPreview
            java.lang.String r1 = r3.skinUrl
            r0.setSkinUrl(r1)
            goto L2f
        L27:
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView r0 = r0.modelPlayerPreview
            r1 = 0
            r0.setSkinUrl(r1)
        L2f:
            r2.refreshActiveCapeIntoPlayerModel(r3)
        L32:
            return
    }

    private void updateRemoveInheritedVanillaSwitchText(boolean r2) {
            r1 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r1.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchRemoveInheritedVanilla
            if (r2 == 0) goto L9
            int r2 = ca.dnamobile.javalauncher.R.string.inherited_vanilla_remove_on
            goto Lb
        L9:
            int r2 = ca.dnamobile.javalauncher.R.string.inherited_vanilla_remove_off
        Lb:
            r0.setText(r2)
            return
    }

    private void updateRenderSurfaceSwitchText(boolean r2) {
            r1 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r1.binding
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

    private void updateRendererDescription(ca.dnamobile.javalauncher.renderer.RendererInterface r1) {
            r0 = this;
            r0.updateMobileGluesConfigSummary(r1)
            return
    }

    private void updateRendererPluginButtons(ca.dnamobile.javalauncher.renderer.RendererInterface r2) {
            r1 = this;
            if (r2 == 0) goto La
            boolean r2 = r2.isExternalPlugin()
            if (r2 == 0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r1.binding
            com.google.android.material.button.MaterialButton r0 = r0.buttonImportRendererPlugin
            r0.setEnabled(r2)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r2 = r1.binding
            com.google.android.material.button.MaterialButton r2 = r2.buttonClearRendererPluginCache
            boolean r0 = ca.dnamobile.javalauncher.renderer.RendererPluginManager.hasImportedOrCachedRendererPlugins(r1)
            r2.setEnabled(r0)
            return
    }

    private void updateResolutionScaleText(int r3) {
            r2 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            android.widget.TextView r0 = r0.textGameResolutionScale
            int r1 = ca.dnamobile.javalauncher.R.string.settings_renderer_resolution_scale_value
            int r3 = ca.dnamobile.javalauncher.settings.LauncherPreferences.clampGameResolutionScalePercent(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r3 = r2.getString(r1, r3)
            r0.setText(r3)
            return
    }

    private void updateResolutionScaleUi(int r3) {
            r2 = this;
            int r3 = ca.dnamobile.javalauncher.settings.LauncherPreferences.clampGameResolutionScalePercent(r3)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            android.widget.SeekBar r0 = r0.sliderGameResolutionScale
            int r1 = r3 + (-25)
            r0.setProgress(r1)
            r2.updateResolutionScaleText(r3)
            return
    }

    private void updateRuntimeComponentsReinstallSummary(java.lang.String r2) {
            r1 = this;
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda55 r0 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda55
            r0.<init>(r1, r2)
            r1.runOnUiThread(r0)
            return
    }

    private void updateSharedInstallsSwitchText(boolean r2) {
            r1 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r1.binding
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

    private void updateSimpleVoiceChatPermissionUi() {
            r3 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            if (r0 == 0) goto L2f
            com.google.android.material.button.MaterialButton r0 = r0.buttonSimpleVoiceChatMicrophonePermission
            if (r0 == 0) goto L2f
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r3.binding
            android.widget.TextView r0 = r0.textSimpleVoiceChatMicrophoneStatus
            if (r0 != 0) goto Lf
            goto L2f
        Lf:
            boolean r0 = ca.dnamobile.javalauncher.modcompat.AndroidMicrophonePermission.isGranted(r3)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r3.binding
            android.widget.TextView r1 = r1.textSimpleVoiceChatMicrophoneStatus
            if (r0 == 0) goto L1c
            int r2 = ca.dnamobile.javalauncher.R.string.simple_voice_chat_microphone_status_granted
            goto L1e
        L1c:
            int r2 = ca.dnamobile.javalauncher.R.string.simple_voice_chat_microphone_status_missing
        L1e:
            r1.setText(r2)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r3.binding
            com.google.android.material.button.MaterialButton r1 = r1.buttonSimpleVoiceChatMicrophonePermission
            if (r0 == 0) goto L2a
            int r0 = ca.dnamobile.javalauncher.R.string.simple_voice_chat_microphone_button_enabled
            goto L2c
        L2a:
            int r0 = ca.dnamobile.javalauncher.R.string.simple_voice_chat_microphone_button_enable
        L2c:
            r1.setText(r0)
        L2f:
            return
    }

    private void updateSkinUi(ca.dnamobile.javalauncher.data.AccountStore.Account r7) {
            r6 = this;
            ca.dnamobile.javalauncher.data.AccountStore r0 = r6.accountStore
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Le
            boolean r0 = r0.canUseOfflineMode()
            if (r0 == 0) goto Le
            r0 = r1
            goto Lf
        Le:
            r0 = r2
        Lf:
            if (r7 == 0) goto L1f
            boolean r3 = r7.isOfflineAccount()
            if (r3 == 0) goto L1f
            boolean r3 = r7.hasOfflineSkin()
            if (r3 == 0) goto L1f
            r3 = r1
            goto L20
        L1f:
            r3 = r2
        L20:
            if (r7 == 0) goto L32
            boolean r4 = r7.isMicrosoftAccount()
            if (r4 == 0) goto L32
            java.lang.String r4 = r7.skinUrl
            boolean r4 = isNullOrBlank(r4)
            if (r4 != 0) goto L32
            r4 = r1
            goto L33
        L32:
            r4 = r2
        L33:
            ca.dnamobile.javalauncher.data.AccountStore r5 = r6.accountStore
            if (r5 == 0) goto L44
            boolean r5 = r5.hasStoredMicrosoftAccount()
            if (r5 != 0) goto L45
            boolean r5 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAccountRegistry.hasAny(r6)
            if (r5 == 0) goto L44
            goto L45
        L44:
            r1 = r2
        L45:
            if (r3 == 0) goto L5d
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r6.binding
            android.widget.TextView r0 = r0.textSkinStatus
            int r1 = ca.dnamobile.javalauncher.R.string.offline_account_skin_active
            java.lang.String r2 = r7.getBestDisplayName()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = r6.getString(r1, r2)
            r0.setText(r1)
            goto L8a
        L5d:
            if (r4 == 0) goto L69
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r6.binding
            android.widget.TextView r0 = r0.textSkinStatus
            int r1 = ca.dnamobile.javalauncher.R.string.custom_skin_status_microsoft
            r0.setText(r1)
            goto L8a
        L69:
            if (r1 == 0) goto L75
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r6.binding
            android.widget.TextView r0 = r0.textSkinStatus
            int r1 = ca.dnamobile.javalauncher.R.string.microsoft_skin_needs_refresh
            r0.setText(r1)
            goto L8a
        L75:
            if (r0 != 0) goto L81
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r6.binding
            android.widget.TextView r0 = r0.textSkinStatus
            int r1 = ca.dnamobile.javalauncher.R.string.custom_skin_status_locked
            r0.setText(r1)
            goto L8a
        L81:
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r6.binding
            android.widget.TextView r0 = r0.textSkinStatus
            int r1 = ca.dnamobile.javalauncher.R.string.custom_skin_status_none
            r0.setText(r1)
        L8a:
            r6.updatePlayerModelPreview(r7)
            r6.updateChangeMicrosoftSkinButtonState(r7)
            r6.updateChangeMicrosoftCapeButtonState(r7)
            return
    }

    private void updateSystemVulkanDriverSwitchText(boolean r2) {
            r1 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r1.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchUseSystemVulkanDriver
            if (r2 == 0) goto L9
            int r2 = ca.dnamobile.javalauncher.R.string.use_system_vulkan_driver_on
            goto Lb
        L9:
            int r2 = ca.dnamobile.javalauncher.R.string.use_system_vulkan_driver_off
        Lb:
            r0.setText(r2)
            return
    }

    private void updateTouchControlsSwitchText(boolean r2) {
            r1 = this;
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r1.binding
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.switchTouchControlsEnabled
            if (r2 == 0) goto L9
            int r2 = ca.dnamobile.javalauncher.R.string.controller_touch_controls_enabled_on
            goto Lb
        L9:
            int r2 = ca.dnamobile.javalauncher.R.string.controller_touch_controls_enabled_off
        Lb:
            r0.setText(r2)
            return
    }

    private void updateVulkanDriverDescription(ca.dnamobile.javalauncher.renderer.Driver r4) {
            r3 = this;
            java.lang.String r0 = r4.getDescription()
            if (r0 == 0) goto L10
            java.lang.String r1 = r0.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L12
        L10:
            java.lang.String r0 = "Uses the selected Vulkan driver for Vulkan/Zink rendering."
        L12:
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r3.binding
            android.widget.TextView r1 = r1.textVulkanDriverDescription
            int r2 = ca.dnamobile.javalauncher.R.string.vulkan_driver_description_value
            java.lang.String r4 = r4.getName()
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r0}
            java.lang.String r4 = r3.getString(r2, r4)
            r1.setText(r4)
            return
    }

    private void updateVulkanDriverSettings(ca.dnamobile.javalauncher.renderer.RendererInterface r4) {
            r3 = this;
            boolean r4 = ca.dnamobile.javalauncher.renderer.DriverPluginManager.isVulkanZinkRenderer(r4)
            r0 = 0
            if (r4 == 0) goto Lf
            boolean r4 = ca.dnamobile.javalauncher.settings.LauncherPreferences.isUseSystemVulkanDriver(r3)
            if (r4 != 0) goto Lf
            r4 = 1
            goto L10
        Lf:
            r4 = r0
        L10:
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r3.binding
            android.widget.LinearLayout r1 = r1.layoutVulkanDriverSettings
            if (r4 == 0) goto L18
            r2 = r0
            goto L1a
        L18:
            r2 = 8
        L1a:
            r1.setVisibility(r2)
            if (r4 != 0) goto L38
            r3.driverSpinnerReady = r0
            java.util.List<ca.dnamobile.javalauncher.renderer.Driver> r4 = r3.availableDrivers
            r4.clear()
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r4 = r3.binding
            android.widget.Spinner r4 = r4.spinnerVulkanDriver
            r0 = 0
            r4.setAdapter(r0)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r4 = r3.binding
            android.widget.TextView r4 = r4.textVulkanDriverDescription
            java.lang.String r0 = ""
            r4.setText(r0)
            return
        L38:
            r3.refreshVulkanDriverList()
            return
    }

    private void uploadMicrosoftAccountSkin(java.io.File r4, ca.dnamobile.javalauncher.skin.SkinModelType r5) {
            r3 = this;
            ca.dnamobile.javalauncher.data.AccountStore r0 = r3.accountStore
            if (r0 == 0) goto L9
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r0.load()
            goto La
        L9:
            r0 = 0
        La:
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r3.getMicrosoftSkinTargetAccount(r0)
            if (r0 != 0) goto L1b
            int r4 = ca.dnamobile.javalauncher.R.string.microsoft_skin_requires_account
            r5 = 1
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r5)
            r4.show()
            return
        L1b:
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r3.binding
            com.google.android.material.button.MaterialButton r1 = r1.buttonChangeMicrosoftSkin
            r2 = 0
            r1.setEnabled(r2)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r3.binding
            com.google.android.material.button.MaterialButton r1 = r1.buttonRefreshMicrosoftSkin
            r1.setEnabled(r2)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r1 = r3.binding
            android.widget.TextView r1 = r1.textSkinStatus
            int r2 = ca.dnamobile.javalauncher.R.string.microsoft_skin_uploading
            r1.setText(r2)
            java.lang.Thread r1 = new java.lang.Thread
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda110 r2 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda110
            r2.<init>(r3, r0, r4, r5)
            java.lang.String r4 = "Microsoft Skin Upload"
            r1.<init>(r2, r4)
            r1.start()
            return
    }

    private void useMicrosoftAccount(ca.dnamobile.javalauncher.data.AccountStore.Account r3) {
            r2 = this;
            java.lang.String r0 = "Using Microsoft account: "
            ca.dnamobile.javalauncher.data.AccountStore r1 = r2.accountStore
            if (r1 != 0) goto L7
            return
        L7:
            r1.saveMicrosoftAccount(r3)     // Catch: java.lang.Throwable -> L42
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAccountRegistry.save(r2, r3)     // Catch: java.lang.Throwable -> L42
            ca.dnamobile.javalauncher.data.AccountStore r1 = r2.accountStore     // Catch: java.lang.Throwable -> L42
            ca.dnamobile.javalauncher.data.AccountStore$Account r1 = r1.load()     // Catch: java.lang.Throwable -> L42
            r2.updateAccountStatus(r1)     // Catch: java.lang.Throwable -> L42
            r2.updateSkinUi(r1)     // Catch: java.lang.Throwable -> L42
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L42
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = r3.getBestDisplayName()     // Catch: java.lang.Throwable -> L42
            java.lang.StringBuilder r3 = r1.append(r3)     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L42
            r0 = 0
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r0)     // Catch: java.lang.Throwable -> L42
            r3.show()     // Catch: java.lang.Throwable -> L42
            android.app.AlertDialog r3 = r2.microsoftAccountsDialog     // Catch: java.lang.Throwable -> L42
            if (r3 == 0) goto L5a
            boolean r3 = r3.isShowing()     // Catch: java.lang.Throwable -> L42
            if (r3 == 0) goto L5a
            android.app.AlertDialog r3 = r2.microsoftAccountsDialog     // Catch: java.lang.Throwable -> L42
            r3.dismiss()     // Catch: java.lang.Throwable -> L42
            goto L5a
        L42:
            r3 = move-exception
            java.lang.String r0 = r3.getMessage()
            if (r0 == 0) goto L4e
            java.lang.String r3 = r3.getMessage()
            goto L52
        L4e:
            java.lang.String r3 = r3.toString()
        L52:
            r0 = 1
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r0)
            r3.show()
        L5a:
            return
    }

    private void useRememberedMicrosoftAccount() {
            r3 = this;
            ca.dnamobile.javalauncher.data.AccountStore r0 = r3.accountStore
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAccountRegistry.count(r3)
            r1 = 1
            if (r0 <= r1) goto L10
            r3.showMicrosoftAccountsDialog()
            return
        L10:
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r3.getPreferredRememberedMicrosoftAccount()     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L22
            boolean r2 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAccountRegistry.isUsableMicrosoftAccount(r0)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L22
            ca.dnamobile.javalauncher.data.AccountStore r2 = r3.accountStore     // Catch: java.lang.Throwable -> L3e
            r2.saveMicrosoftAccount(r0)     // Catch: java.lang.Throwable -> L3e
            goto L27
        L22:
            ca.dnamobile.javalauncher.data.AccountStore r0 = r3.accountStore     // Catch: java.lang.Throwable -> L3e
            r0.useLastMicrosoftAccount()     // Catch: java.lang.Throwable -> L3e
        L27:
            ca.dnamobile.javalauncher.data.AccountStore r0 = r3.accountStore     // Catch: java.lang.Throwable -> L3e
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r0.load()     // Catch: java.lang.Throwable -> L3e
            r3.updateAccountStatus(r0)     // Catch: java.lang.Throwable -> L3e
            r3.updateSkinUi(r0)     // Catch: java.lang.Throwable -> L3e
            int r0 = ca.dnamobile.javalauncher.R.string.microsoft_account_restored     // Catch: java.lang.Throwable -> L3e
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r2)     // Catch: java.lang.Throwable -> L3e
            r0.show()     // Catch: java.lang.Throwable -> L3e
            goto L55
        L3e:
            r0 = move-exception
            java.lang.String r2 = r0.getMessage()
            if (r2 == 0) goto L4a
            java.lang.String r0 = r0.getMessage()
            goto L4e
        L4a:
            java.lang.String r0 = r0.toString()
        L4e:
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r1)
            r0.show()
        L55:
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r1)
            android.view.LayoutInflater r2 = r1.getLayoutInflater()
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r2 = ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding.inflate(r2)
            r1.binding = r2
            android.view.View r2 = r2.getRoot()
            r1.setContentView(r2)
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r1)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r2 = r1.binding
            com.google.android.material.button.MaterialButton r2 = r2.buttonSettingsBack
            ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda46 r0 = new ca.dnamobile.javalauncher.LauncherSettingsActivity$$ExternalSyntheticLambda46
            r0.<init>(r1)
            r2.setOnClickListener(r0)
            r1.applySettingsDefaultsOnce()
            r1.setupSettingsSectionTabs()
            r1.registerSkinPickerLauncher()
            r1.registerMicrosoftSkinPickerLauncher()
            r1.registerOfflineSkinPickerLauncher()
            r1.registerNotificationPermissionLauncher()
            r1.registerMicrophonePermissionLauncher()
            r1.registerMobileGluesFolderPickerLauncher()
            r1.registerDroidBridgeBackupFolderPickerLauncher()
            r1.registerDroidBridgeRestoreZipPickerLauncher()
            r1.registerMouseCursorIconPickerLauncher()
            r1.registerJarExecutionPickerLauncher()
            r1.setupAccountUi()
            r1.setupInstanceSettings()
            r1.setupRendererSettings()
            r1.setupRenderSurfaceSettings()
            r1.setupControllerSettings()
            r1.setupLauncherSettings()
            r1.setupPrivacyPolicySettings()
            return
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
            r1 = this;
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal r0 = r1.authManager
            if (r0 == 0) goto Lf
            boolean r0 = r1.isChangingConfigurations()
            if (r0 != 0) goto Lf
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal r0 = r1.authManager
            r0.dispose()
        Lf:
            super.onDestroy()
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
            r2 = this;
            super.onResume()
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r2)
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r0 = r2.binding
            if (r0 == 0) goto L2c
            ca.dnamobile.javalauncher.renderer.RendererInterface r0 = r2.getSelectedRendererFromSpinner()
            r2.updateMobileGluesConfigSummary(r0)
            boolean r1 = ca.dnamobile.javalauncher.renderer.DriverPluginManager.isVulkanZinkRenderer(r0)
            if (r1 == 0) goto L1d
            ca.dnamobile.javalauncher.renderer.DriverPluginManager.reload(r2)
            r2.updateVulkanDriverSettings(r0)
        L1d:
            r2.refreshControllerSettingsValues()
            r2.refreshGameDisplaySettingsValues()
            r2.updateInstallNotificationSettingsUi()
            r2.updateSimpleVoiceChatPermissionUi()
            r2.refreshAccountUiFromStore()
        L2c:
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
