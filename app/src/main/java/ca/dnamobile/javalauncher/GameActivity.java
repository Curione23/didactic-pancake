package ca.dnamobile.javalauncher;

/* JADX INFO: loaded from: classes.dex */
public class GameActivity extends androidx.appcompat.app.AppCompatActivity {
    private static final int COLOR_ACCENT = 0;
    private static final int COLOR_CARD_BG = 0;
    private static final int COLOR_CARD_BG_PRESSED = 0;
    private static final int COLOR_CARD_STROKE = 0;
    private static final int COLOR_DANGER = 0;
    private static final int COLOR_DIALOG_BG = 0;
    private static final int COLOR_TEXT_MUTED = 0;
    private static final int COLOR_TEXT_PRIMARY = 0;
    private static final int COLOR_TEXT_SECONDARY = 0;
    public static final java.lang.String EXTRA_QUICK_PLAY_WORLD = "ca.dnamobile.javalauncher.extra.QUICK_PLAY_WORLD";
    public static final java.lang.String EXTRA_VERSION_ID = "ca.dnamobile.javalauncher.extra.VERSION_ID";
    private static final java.lang.String REPLAY_MOD_FFMPEG_INFO_URL = "https://github.com/DNAMobileApplications/DroidBridgeLauncherFFMPEG/releases/";
    private ca.dnamobile.javalauncher.data.AccountStore accountStore;
    private ca.dnamobile.javalauncher.databinding.ActivityGameBinding binding;
    private boolean exiting;
    private ca.dnamobile.javalauncher.game.FloatingGameSettingsOverlayController floatingGameSettingsOverlayController;
    private ca.dnamobile.javalauncher.input.GameCursorOverlay gameCursorOverlay;
    private ca.dnamobile.javalauncher.input.GamepadInputController gamepadInputController;
    private android.app.AlertDialog inGameControlsDialog;
    private long lastLegacy4jFallbackProbeMs;
    private long lastLogOverlayLength;
    private long lastLogOverlayModified;
    private boolean launchStarted;
    private boolean legacy4jFallbackLogged;
    private boolean legacy4jGlfwFallbackAllowed;
    private android.os.Handler logOverlayHandler;
    private java.lang.Runnable logOverlayRunnable;
    private boolean microsoftAccountPreflightAcceptedAfterWarning;
    private boolean microsoftAccountPreflightCompleted;
    private boolean microsoftAccountPreflightPending;
    private ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal microsoftAuthManager;
    private java.lang.String quickPlayWorld;
    private boolean quitWatchdogForceScheduled;
    private android.os.Handler quitWatchdogHandler;
    private java.lang.Runnable quitWatchdogRunnable;
    private boolean replayModFfmpegWarningAccepted;
    private boolean replayModFfmpegWarningPending;
    private final android.os.Handler surfaceRefreshHandler;
    private ca.dnamobile.javalauncher.controls.TouchControlsOverlay touchControlsOverlay;
    private java.lang.String versionId;




    private static final class PreLaunchMicrosoftSessionResult {
        final java.lang.String message;
        final boolean ok;

        private PreLaunchMicrosoftSessionResult(boolean r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.ok = r1
                r0.message = r2
                return
        }

        static ca.dnamobile.javalauncher.GameActivity.PreLaunchMicrosoftSessionResult ok(java.lang.String r2) {
                ca.dnamobile.javalauncher.GameActivity$PreLaunchMicrosoftSessionResult r0 = new ca.dnamobile.javalauncher.GameActivity$PreLaunchMicrosoftSessionResult
                r1 = 1
                r0.<init>(r1, r2)
                return r0
        }

        static ca.dnamobile.javalauncher.GameActivity.PreLaunchMicrosoftSessionResult warning(java.lang.String r2) {
                ca.dnamobile.javalauncher.GameActivity$PreLaunchMicrosoftSessionResult r0 = new ca.dnamobile.javalauncher.GameActivity$PreLaunchMicrosoftSessionResult
                r1 = 0
                r0.<init>(r1, r2)
                return r0
        }
    }

    private static final class ReplayModFfmpegPreflight {
        final java.lang.String errorMessage;
        final java.io.File gameDirectory;
        final boolean shouldWarn;

        private ReplayModFfmpegPreflight(boolean r1, java.io.File r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.shouldWarn = r1
                r0.gameDirectory = r2
                r0.errorMessage = r3
                return
        }

        static ca.dnamobile.javalauncher.GameActivity.ReplayModFfmpegPreflight noWarning() {
                ca.dnamobile.javalauncher.GameActivity$ReplayModFfmpegPreflight r0 = new ca.dnamobile.javalauncher.GameActivity$ReplayModFfmpegPreflight
                r1 = 0
                r2 = 0
                r0.<init>(r1, r2, r2)
                return r0
        }

        static ca.dnamobile.javalauncher.GameActivity.ReplayModFfmpegPreflight warning(java.io.File r2, java.lang.String r3) {
                ca.dnamobile.javalauncher.GameActivity$ReplayModFfmpegPreflight r0 = new ca.dnamobile.javalauncher.GameActivity$ReplayModFfmpegPreflight
                r1 = 1
                r0.<init>(r1, r2, r3)
                return r0
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$-v9ujHb7yWAEapG-loiElEkLTZ0, reason: not valid java name */
    public static /* synthetic */ void m148$r8$lambda$v9ujHb7yWAEapGloiElEkLTZ0(ca.dnamobile.javalauncher.GameActivity r0, java.lang.String r1) {
            r0.lambda$runTokenValidationAfterRefreshFailure$34(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$0fQ6JpM6wyDqAy8fS27saZjTp1w(ca.dnamobile.javalauncher.GameActivity r0) {
            r0.startLaunchOnce()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$4np2VKcnvJu-EAJ07G2aJM6SVW8, reason: not valid java name */
    public static /* synthetic */ void m149$r8$lambda$4np2VKcnvJuEAJ07G2aJM6SVW8(ca.dnamobile.javalauncher.GameActivity r0, java.lang.String r1) {
            r0.lambda$startLaunchOnce$30(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$7EVx-hS2jJIpTZQ73kbb0svae04, reason: not valid java name */
    public static /* synthetic */ void m150$r8$lambda$7EVxhS2jJIpTZQ73kbb0svae04(ca.dnamobile.javalauncher.GameActivity r0, android.app.AlertDialog r1, android.view.View r2) {
            r0.lambda$showForceCloseGameDialog$19(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$7zyOzIwqW-d_l_8RdilkZX-5V6s, reason: not valid java name */
    public static /* synthetic */ void m151$r8$lambda$7zyOzIwqWd_l_8RdilkZX5V6s(ca.dnamobile.javalauncher.GameActivity r0) {
            r0.lambda$startLaunchOnce$27()
            return
    }

    public static /* synthetic */ void $r8$lambda$8E7PVxUYmdyQBmSAnYdEKI3iNPc(ca.dnamobile.javalauncher.GameActivity r0, android.content.DialogInterface r1) {
            r0.lambda$showForceCloseGameDialog$21(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$9i35EeWiPivrtC-xUPb8-bwBtQU, reason: not valid java name */
    public static /* synthetic */ void m152$r8$lambda$9i35EeWiPivrtCxUPb8bwBtQU(ca.dnamobile.javalauncher.GameActivity r0) {
            r0.lambda$openInGameButtonOverlay$7()
            return
    }

    public static /* synthetic */ void $r8$lambda$AaWH9STUEZeZm4xVKVCGH4reXls(ca.dnamobile.javalauncher.GameActivity r0, android.app.AlertDialog r1, android.content.DialogInterface r2) {
            r0.lambda$showMicrosoftAccountPreflightWarningDialog$38(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$BwAWrTM1lStn8PnaE-qnO6RnyiQ, reason: not valid java name */
    public static /* synthetic */ void m153$r8$lambda$BwAWrTM1lStn8PnaEqnO6RnyiQ(ca.dnamobile.javalauncher.GameActivity r0) {
            r0.lambda$scheduleMinecraftSurfaceRefresh$3()
            return
    }

    public static /* synthetic */ void $r8$lambda$D5swV1N8CgvN4d7E94QQUbuXxi0(ca.dnamobile.javalauncher.GameActivity r0) {
            r0.lambda$forceCloseGameAndReturnToLauncher$22()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$E-xLHTFetlDRRddEkuwbz52Kchc, reason: not valid java name */
    public static /* synthetic */ void m154$r8$lambda$ExLHTFetlDRRddEkuwbz52Kchc(ca.dnamobile.javalauncher.GameActivity r0, android.app.AlertDialog[] r1) {
            r0.lambda$openInGameButtonOverlay$10(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$Edl1Qdo8_W1aT74v4mWihhjDiKQ(ca.dnamobile.javalauncher.GameActivity r0, android.app.AlertDialog r1, android.view.View r2) {
            r0.lambda$showMicrosoftAccountPreflightWarningDialog$35(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$FRd_tTObAuw3e2KjSvtzOqkbP74(ca.dnamobile.javalauncher.GameActivity r0, android.app.AlertDialog r1, android.content.DialogInterface r2) {
            r0.lambda$openInGameButtonOverlay$14(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$OV-N59_QS0ztXlDexV2LhoXIuLM, reason: not valid java name */
    public static /* synthetic */ void m155$r8$lambda$OVN59_QS0ztXlDexV2LhoXIuLM(ca.dnamobile.javalauncher.GameActivity r0, android.content.DialogInterface r1) {
            r0.lambda$showMicrosoftAccountPreflightWarningDialog$39(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$QOnDPz9rKqFE9SP4IUpvxVO0gII(ca.dnamobile.javalauncher.GameActivity r0, java.lang.Throwable r1) {
            r0.lambda$startLaunchOnce$32(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$QXA9slmV57A0_lvyE0Wn8hN9nSU(ca.dnamobile.javalauncher.GameActivity r0, android.app.AlertDialog r1, android.view.View r2) {
            r0.lambda$showMicrosoftAccountPreflightWarningDialog$36(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$RRl7TRxpZM_3gzfqE49sYfR-vtc, reason: not valid java name */
    public static /* synthetic */ void m156$r8$lambda$RRl7TRxpZM_3gzfqE49sYfRvtc(ca.dnamobile.javalauncher.GameActivity r0) {
            r0.startLaunchOnce()
            return
    }

    public static /* synthetic */ void $r8$lambda$Xwnv5LqIl7qVJmzNVbEgbMNbL9A(ca.dnamobile.javalauncher.GameActivity r0, android.view.View r1) {
            r0.lambda$showReplayModFfmpegMissingDialog$42(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$ZThYns2o11-8ZNTP23p4OJc47ug, reason: not valid java name */
    public static /* synthetic */ void m157$r8$lambda$ZThYns2o118ZNTP23p4OJc47ug(ca.dnamobile.javalauncher.GameActivity r0) {
            r0.lambda$onCreate$1()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$ZTr0KGBwJP0O6Wb0-Qr0c5v3fHg, reason: not valid java name */
    public static /* synthetic */ void m158$r8$lambda$ZTr0KGBwJP0O6Wb0Qr0c5v3fHg(ca.dnamobile.javalauncher.GameActivity r0, android.app.AlertDialog r1, android.content.DialogInterface r2) {
            r0.lambda$showReplayModFfmpegMissingDialog$44(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$ZgzRFf2FezkopZc-jdNIYDz5fYk, reason: not valid java name */
    public static /* synthetic */ void m159$r8$lambda$ZgzRFf2FezkopZcjdNIYDz5fYk(ca.dnamobile.javalauncher.GameActivity r0) {
            r0.lambda$openInGameButtonOverlay$8()
            return
    }

    public static /* synthetic */ void $r8$lambda$_6gozwL0ClEhOTKQaurH8Q6iHQA(ca.dnamobile.javalauncher.GameActivity r0, int r1) {
            r0.lambda$startLaunchOnce$31(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$aA2ZY-cG_mqOd4EH0p2BXPYZG4U, reason: not valid java name */
    public static /* synthetic */ void m160$r8$lambda$aA2ZYcG_mqOd4EH0p2BXPYZG4U(ca.dnamobile.javalauncher.GameActivity r0, android.app.AlertDialog[] r1) {
            r0.lambda$openInGameButtonOverlay$13(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$aS9Tir2iorclkXMbMYNh0gQ0v5U(ca.dnamobile.javalauncher.GameActivity r0, android.app.AlertDialog r1, android.view.View r2) {
            r0.lambda$showMicrosoftAccountPreflightWarningDialog$37(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$b67V7UJupcD5vawnC4lkUxkKXdQ(ca.dnamobile.javalauncher.GameActivity r0, android.content.DialogInterface r1) {
            r0.lambda$showReplayModFfmpegMissingDialog$45(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$dC2sd_vQUsO5iWHHomLv8rgmcHg(ca.dnamobile.javalauncher.GameActivity r0, android.app.AlertDialog r1, android.content.DialogInterface r2) {
            r0.lambda$showForceCloseGameDialog$20(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$ddT8qmcUBvKQ8LqYN1q0IlAo-Ic, reason: not valid java name */
    public static /* synthetic */ void m161$r8$lambda$ddT8qmcUBvKQ8LqYN1q0IlAoIc(ca.dnamobile.javalauncher.GameActivity r0) {
            r0.lambda$openGamepadMappingDialogFromBackShortcut$15()
            return
    }

    public static /* synthetic */ boolean $r8$lambda$ddqlrdgF0RITCXNlrADpXPdBTZ0(ca.dnamobile.javalauncher.GameActivity r0, android.view.View r1, android.view.MotionEvent r2) {
            boolean r0 = r0.lambda$buildInGameDialogAction$18(r1, r2)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$dySRzLvZinIDQqrQuT1jtr8ndkw(ca.dnamobile.javalauncher.GameActivity r0) {
            r0.lambda$openGamepadMappingDialogFromBackShortcut$16()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$eJlIlsYuTx-riN0vkXdiTkbvfoQ, reason: not valid java name */
    public static /* synthetic */ void m162$r8$lambda$eJlIlsYuTxriN0vkXdiTkbvfoQ(ca.dnamobile.javalauncher.GameActivity r0, android.app.AlertDialog[] r1) {
            r0.lambda$openInGameButtonOverlay$12(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$ePnHSL6R98NYapx3LcayHjKFcbE(ca.dnamobile.javalauncher.GameActivity r0) {
            r0.lambda$onCreate$0()
            return
    }

    public static /* synthetic */ void $r8$lambda$fcVobnIR9aqAazvPeA5ilLC9zdo(ca.dnamobile.javalauncher.GameActivity r0) {
            r0.lambda$scheduleForcedGameProcessExit$26()
            return
    }

    public static /* synthetic */ void $r8$lambda$i3MTDOIZKhuU7tLFo9VFa7vtfhA(ca.dnamobile.javalauncher.GameActivity r0, android.view.View r1) {
            r0.lambda$configureInGameSettingsButton$6(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$j8PgS2QN-kYirZeimGKu14Uc9R4, reason: not valid java name */
    public static /* synthetic */ void m163$r8$lambda$j8PgS2QNkYirZeimGKu14Uc9R4(ca.dnamobile.javalauncher.GameActivity r0, android.app.AlertDialog[] r1) {
            r0.lambda$openInGameButtonOverlay$9(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$j8sJ-xKbA5x6mTrqBM7DwCWwznw, reason: not valid java name */
    public static /* synthetic */ void m164$r8$lambda$j8sJxKbA5x6mTrqBM7DwCWwznw(ca.dnamobile.javalauncher.GameActivity r0, android.view.View r1) {
            r0.lambda$configureLogOverlay$5(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$joSccVsD_CEFVozvAhPkhPe48Gc(ca.dnamobile.javalauncher.GameActivity r0) {
            r0.lambda$refreshLogOverlay$24()
            return
    }

    public static /* synthetic */ void $r8$lambda$mFoJZkF3FGOlQ3JLJMkbwvxmfIg(ca.dnamobile.javalauncher.GameActivity r0, android.app.AlertDialog r1, android.view.View r2) {
            r0.lambda$showReplayModFfmpegMissingDialog$43(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$n3nT-CVPrPQ2cQ_igIKyHOEATI0, reason: not valid java name */
    public static /* synthetic */ void m165$r8$lambda$n3nTCVPrPQ2cQ_igIKyHOEATI0(ca.dnamobile.javalauncher.GameActivity r0) {
            r0.finish()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$nsGMnguxOE7la8gdyR8p8Yb--0Y, reason: not valid java name */
    public static /* synthetic */ void m166$r8$lambda$nsGMnguxOE7la8gdyR8p8Yb0Y(ca.dnamobile.javalauncher.GameActivity r0) {
            r0.openInGameButtonOverlay()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$ptaGdwBK31O-xvjrAs-5cWnRUhk, reason: not valid java name */
    public static /* synthetic */ void m167$r8$lambda$ptaGdwBK31OxvjrAs5cWnRUhk(ca.dnamobile.javalauncher.GameActivity r0, ca.dnamobile.javalauncher.GameActivity.PreLaunchMicrosoftSessionResult r1) {
            r0.lambda$runTokenValidationAfterRefreshFailure$33(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$qIwWQJY7l0euedU0vvpqHZG8Fbo(ca.dnamobile.javalauncher.GameActivity r0, android.app.AlertDialog r1, android.view.View r2) {
            r0.lambda$showReplayModFfmpegMissingDialog$41(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$rMKYttbG4ZjUwMV4F3poYlrTyqk(ca.dnamobile.javalauncher.GameActivity r0) {
            r0.lambda$startLaunchOnce$28()
            return
    }

    public static /* synthetic */ void $r8$lambda$rn938urMShnW7_GRmia1DZV5Aqc(ca.dnamobile.javalauncher.GameActivity r0) {
            r0.openInGameButtonOverlay()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$rrW-3ZsstuBYh7zTDdSbBqz-9nk, reason: not valid java name */
    public static /* synthetic */ void m168$r8$lambda$rrW3ZsstuBYh7zTDdSbBqz9nk(ca.dnamobile.javalauncher.GameActivity r0, android.app.AlertDialog[] r1) {
            r0.lambda$openInGameButtonOverlay$11(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$sZ4k2M3tC_RX-q6r8bcTNjYNMhI, reason: not valid java name */
    public static /* synthetic */ void m169$r8$lambda$sZ4k2M3tC_RXq6r8bcTNjYNMhI(ca.dnamobile.javalauncher.GameActivity r0) {
            r0.lambda$scheduleForcedGameProcessExit$25()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$ssR6HIn-kPpYegisEnNtxPbMelE, reason: not valid java name */
    public static /* synthetic */ void m170$r8$lambda$ssR6HInkPpYegisEnNtxPbMelE(ca.dnamobile.javalauncher.GameActivity r0, java.lang.String r1) {
            r0.lambda$startLaunchOnce$29(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$tGGO1SFpcgdXxEpMqKkvEhHTgW8(ca.dnamobile.javalauncher.GameActivity r0) {
            r0.lambda$onCreate$2()
            return
    }

    public static /* synthetic */ void $r8$lambda$uQHyDlTTb2ZbcHoXgNrRlbMGwuY(ca.dnamobile.javalauncher.GameActivity r0) {
            r0.startMicrosoftAccountPreflightOnUiThread()
            return
    }

    public static /* synthetic */ void $r8$lambda$xKL2TTr72Xz0alH_V44Ug7m3xQg(ca.dnamobile.javalauncher.GameActivity r0, ca.dnamobile.javalauncher.GameActivity.ReplayModFfmpegPreflight r1) {
            r0.lambda$shouldPauseLaunchForReplayModFfmpegWarning$40(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$fgetbinding, reason: not valid java name */
    static /* bridge */ /* synthetic */ ca.dnamobile.javalauncher.databinding.ActivityGameBinding m171$$Nest$fgetbinding(ca.dnamobile.javalauncher.GameActivity r0) {
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r0.binding
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgetexiting, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m172$$Nest$fgetexiting(ca.dnamobile.javalauncher.GameActivity r0) {
            boolean r0 = r0.exiting
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgetlogOverlayHandler, reason: not valid java name */
    static /* bridge */ /* synthetic */ android.os.Handler m173$$Nest$fgetlogOverlayHandler(ca.dnamobile.javalauncher.GameActivity r0) {
            android.os.Handler r0 = r0.logOverlayHandler
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgetquitWatchdogHandler, reason: not valid java name */
    static /* bridge */ /* synthetic */ android.os.Handler m174$$Nest$fgetquitWatchdogHandler(ca.dnamobile.javalauncher.GameActivity r0) {
            android.os.Handler r0 = r0.quitWatchdogHandler
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mfinishMicrosoftAccountRefreshFailure, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m175$$Nest$mfinishMicrosoftAccountRefreshFailure(ca.dnamobile.javalauncher.GameActivity r0, java.lang.String r1) {
            r0.finishMicrosoftAccountRefreshFailure(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mfinishMicrosoftAccountRefreshSuccess, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m176$$Nest$mfinishMicrosoftAccountRefreshSuccess(ca.dnamobile.javalauncher.GameActivity r0, ca.dnamobile.javalauncher.data.AccountStore.Account r1) {
            r0.finishMicrosoftAccountRefreshSuccess(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mpollQuitWatchdog, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m177$$Nest$mpollQuitWatchdog(ca.dnamobile.javalauncher.GameActivity r0) {
            r0.pollQuitWatchdog()
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mrefreshLogOverlay, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m178$$Nest$mrefreshLogOverlay(ca.dnamobile.javalauncher.GameActivity r0) {
            r0.refreshLogOverlay()
            return
    }

    static {
            r0 = 34
            r1 = 42
            r2 = 30
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.GameActivity.COLOR_DIALOG_BG = r0
            r0 = 43
            r1 = 53
            r2 = 38
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.GameActivity.COLOR_CARD_BG = r0
            r0 = 51
            r1 = 63
            r2 = 45
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.GameActivity.COLOR_CARD_BG_PRESSED = r0
            r0 = 61
            r1 = 74
            r2 = 54
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.GameActivity.COLOR_CARD_STROKE = r0
            r0 = 241(0xf1, float:3.38E-43)
            r1 = 248(0xf8, float:3.48E-43)
            r2 = 238(0xee, float:3.34E-43)
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.GameActivity.COLOR_TEXT_PRIMARY = r0
            r0 = 204(0xcc, float:2.86E-43)
            r1 = 216(0xd8, float:3.03E-43)
            r2 = 198(0xc6, float:2.77E-43)
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.GameActivity.COLOR_TEXT_SECONDARY = r0
            r0 = 159(0x9f, float:2.23E-43)
            r1 = 176(0xb0, float:2.47E-43)
            r2 = 150(0x96, float:2.1E-43)
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.GameActivity.COLOR_TEXT_MUTED = r0
            r0 = 211(0xd3, float:2.96E-43)
            r1 = 128(0x80, float:1.8E-43)
            r2 = 37
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.GameActivity.COLOR_ACCENT = r0
            r0 = 255(0xff, float:3.57E-43)
            r1 = 108(0x6c, float:1.51E-43)
            int r0 = android.graphics.Color.rgb(r0, r1, r1)
            ca.dnamobile.javalauncher.GameActivity.COLOR_DANGER = r0
            return
    }

    public GameActivity() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.lastLogOverlayLength = r0
            r2.lastLogOverlayModified = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.surfaceRefreshHandler = r0
            return
    }

    private void addReplayModDirectoryCandidates(java.util.LinkedHashSet<java.io.File> r3, java.io.File r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            r3.add(r4)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "game"
            r0.<init>(r4, r1)
            r3.add(r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ".minecraft"
            r0.<init>(r4, r1)
            r3.add(r0)
            return
    }

    private void addReplayModInstanceCandidates(java.util.LinkedHashSet<java.io.File> r7, java.io.File r8) {
            r6 = this;
            if (r8 == 0) goto L56
            boolean r0 = r8.isDirectory()
            if (r0 != 0) goto L9
            goto L56
        L9:
            java.io.File[] r8 = r8.listFiles()
            if (r8 != 0) goto L10
            return
        L10:
            java.lang.String r0 = r6.versionId
            java.lang.String r0 = r6.normalizeReplayPreflightName(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L1d
            return
        L1d:
            int r1 = r8.length
            r2 = 0
        L1f:
            if (r2 >= r1) goto L56
            r3 = r8[r2]
            if (r3 == 0) goto L53
            boolean r4 = r3.isDirectory()
            if (r4 != 0) goto L2c
            goto L53
        L2c:
            java.lang.String r4 = r3.getName()
            java.lang.String r4 = r6.normalizeReplayPreflightName(r4)
            boolean r5 = r4.equals(r0)
            if (r5 != 0) goto L46
            boolean r5 = r4.contains(r0)
            if (r5 != 0) goto L46
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L53
        L46:
            r6.addReplayModDirectoryCandidates(r7, r3)
            java.io.File r4 = new java.io.File
            java.lang.String r5 = "game"
            r4.<init>(r3, r5)
            r6.addReplayModDirectoryCandidates(r7, r4)
        L53:
            int r2 = r2 + 1
            goto L1f
        L56:
            return
    }

    private void appendStatus(java.lang.String r4) {
            r3 = this;
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r3.binding
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.TextView r0 = r0.textStatus
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L28
            int r1 = r0.length()
            if (r1 != 0) goto L14
            goto L28
        L14:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L2a
        L28:
            java.lang.String r0 = ""
        L2a:
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r1 = r3.binding
            android.widget.TextView r1 = r1.textStatus
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            r1.setText(r4)
            return
    }

    private void applyEarlyMesaFreedrenoEnvironment(ca.dnamobile.javalauncher.renderer.RendererInterface r12) {
            r11 = this;
            java.io.File r0 = ca.dnamobile.javalauncher.renderer.DroidBridgeMesaSupport.resolveMesaNativeDir(r11)
            java.io.File r12 = ca.dnamobile.javalauncher.renderer.DroidBridgeMesaSupport.prepareMesaLibraryAliases(r11, r12)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "libEGL_mesa.so"
            r1.<init>(r0, r2)
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "libvulkan_freedreno.so"
            r3.<init>(r0, r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r0.getAbsolutePath()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = java.io.File.pathSeparator
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = r12.getAbsolutePath()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "POJAV_RENDERER"
            java.lang.String r5 = "freedreno_kgsl"
            r11.setEarlyEnv(r4, r5)
            java.lang.String r4 = "POJAV_RENDERER_MESA_MODE"
            r11.setEarlyEnv(r4, r5)
            java.lang.String r4 = "DROIDBRIDGE_MESA"
            java.lang.String r6 = "1"
            r11.setEarlyEnv(r4, r6)
            java.lang.String r4 = "MESA_PROCESS_NAME"
            java.lang.String r7 = "DroidBridge"
            r11.setEarlyEnv(r4, r7)
            java.lang.String r4 = "MESA_DRICONF_EXECUTABLE_OVERRIDE"
            r11.setEarlyEnv(r4, r7)
            java.lang.String r4 = "DROIDBRIDGE_MESA_MODE"
            r11.setEarlyEnv(r4, r5)
            java.lang.String r4 = "DROIDBRIDGE_MESA_DRIVER"
            java.lang.String r5 = "kgsl"
            r11.setEarlyEnv(r4, r5)
            java.lang.String r4 = "DROIDBRIDGE_MESA_NATIVE_DIR"
            java.lang.String r7 = r0.getAbsolutePath()
            r11.setEarlyEnv(r4, r7)
            java.lang.String r4 = "DROIDBRIDGE_MESA_ALIAS_DIR"
            java.lang.String r12 = r12.getAbsolutePath()
            r11.setEarlyEnv(r4, r12)
            java.lang.String r12 = "DROIDBRIDGE_MESA_NAMESPACE"
            r11.setEarlyEnv(r12, r6)
            java.lang.String r12 = "DROIDBRIDGE_MESA_NAMESPACE_PATH"
            r11.setEarlyEnv(r12, r3)
            java.lang.String r12 = "DROIDBRIDGE_MESA_EGL"
            java.lang.String r1 = r1.getAbsolutePath()
            r11.setEarlyEnv(r12, r1)
            java.lang.String r12 = "DROIDBRIDGE_MESA_EGL_SINGLE_INSTANCE"
            r11.setEarlyEnv(r12, r6)
            java.lang.String r12 = "POJAV_NATIVEDIR"
            java.lang.String r1 = r0.getAbsolutePath()
            r11.setEarlyEnv(r12, r1)
            java.lang.String r12 = "POJAVEXEC_EGL"
            r11.setEarlyEnv(r12, r2)
            java.lang.String r12 = "POJAV_EGL_LIBRARY"
            r11.setEarlyEnv(r12, r2)
            java.lang.String r12 = "POJAVEXEC_EGL_LIBRARY"
            r11.setEarlyEnv(r12, r2)
            java.lang.String r12 = "POJAV_RENDERER_LIBRARY"
            r11.setEarlyEnv(r12, r2)
            java.lang.String r12 = "POJAVEXEC_RENDERER"
            r11.setEarlyEnv(r12, r2)
            java.lang.String r12 = "LIB_MESA_NAME"
            r11.setEarlyEnv(r12, r2)
            java.lang.String r12 = "GALLIUM_DRIVER"
            java.lang.String r1 = ""
            r11.setEarlyEnv(r12, r1)
            java.lang.String r12 = "MESA_LOADER_DRIVER_OVERRIDE"
            r11.setEarlyEnv(r12, r5)
            java.lang.String r12 = "DROIDBRIDGE_PROP_MESA_LOADER_DRIVER_OVERRIDE"
            r11.setEarlyEnv(r12, r5)
            java.lang.String r12 = "DROIDBRIDGE_PROP_DEBUG_MESA_LOADER_DRIVER_OVERRIDE"
            r11.setEarlyEnv(r12, r5)
            java.lang.String r12 = "DROIDBRIDGE_PROP_GALLIUM_DRIVER"
            r11.setEarlyEnv(r12, r1)
            java.lang.String r12 = "DROIDBRIDGE_PROP_DEBUG_GALLIUM_DRIVER"
            r11.setEarlyEnv(r12, r1)
            java.lang.String r12 = "DROIDBRIDGE_PROP_MESA_GL_VERSION_OVERRIDE"
            java.lang.String r2 = "4.6COMPAT"
            r11.setEarlyEnv(r12, r2)
            java.lang.String r4 = "DROIDBRIDGE_PROP_MESA_GLSL_VERSION_OVERRIDE"
            java.lang.String r5 = "460"
            r11.setEarlyEnv(r4, r5)
            java.lang.String r7 = "DROIDBRIDGE_MESA_GL"
            r11.setEarlyEnv(r7, r1)
            java.lang.String r7 = "DROIDBRIDGE_MESA_DESKTOP_GL"
            r11.setEarlyEnv(r7, r1)
            java.lang.String r8 = "DROIDBRIDGE_MESA_SAFE_SWAPS"
            r11.setEarlyEnv(r8, r1)
            java.lang.String r8 = "DROIDBRIDGE_ZINK_V59_CLEAN_ALIAS"
            r11.setEarlyEnv(r8, r1)
            java.lang.String r8 = "DROIDBRIDGE_LEGACY_FREEDRENO_ALIAS_V59"
            r11.setEarlyEnv(r8, r1)
            java.lang.String r8 = "DROIDBRIDGE_MESA_EGL_PLATFORM_DISPLAY"
            r11.setEarlyEnv(r8, r1)
            java.lang.String r8 = "DROIDBRIDGE_EGL_RECOVER_CURRENT"
            r11.setEarlyEnv(r8, r1)
            java.lang.String r8 = "DROIDBRIDGE_MESA_EGL_SHIM"
            r11.setEarlyEnv(r8, r1)
            java.lang.String r8 = "MESA_EXTENSION_OVERRIDE"
            r11.setEarlyEnv(r8, r1)
            java.lang.String r9 = "mesa_glthread"
            r11.setEarlyEnv(r9, r1)
            java.lang.String r9 = "EGL_PLATFORM"
            java.lang.String r10 = "android"
            r11.setEarlyEnv(r9, r10)
            java.lang.String r9 = "LIBGL_ES"
            java.lang.String r10 = "2"
            r11.setEarlyEnv(r9, r10)
            java.lang.String r9 = "MESA_GL_VERSION_OVERRIDE"
            r11.setEarlyEnv(r9, r2)
            java.lang.String r9 = "MESA_GLSL_VERSION_OVERRIDE"
            r11.setEarlyEnv(r9, r5)
            r11.setEarlyEnv(r12, r2)
            r11.setEarlyEnv(r4, r5)
            java.lang.String r12 = "LIBGL_NOERROR"
            r11.setEarlyEnv(r12, r6)
            java.lang.String r12 = "LIBGL_NORMALIZE"
            r11.setEarlyEnv(r12, r6)
            java.lang.String r12 = "LIBGL_MIPMAP"
            java.lang.String r2 = "3"
            r11.setEarlyEnv(r12, r2)
            java.lang.String r12 = "LIBGL_NOINTOVLHACK"
            r11.setEarlyEnv(r12, r6)
            java.lang.String r12 = "allow_higher_compat_version"
            java.lang.String r2 = "true"
            r11.setEarlyEnv(r12, r2)
            java.lang.String r12 = "force_glsl_extensions_warn"
            r11.setEarlyEnv(r12, r2)
            java.lang.String r12 = "allow_glsl_extension_directive_midshader"
            r11.setEarlyEnv(r12, r2)
            r11.setEarlyEnv(r7, r6)
            java.lang.String r12 = "DROIDBRIDGE_EGL_FORCE_DESKTOP_GL"
            r11.setEarlyEnv(r12, r6)
            java.lang.String r12 = "DROIDBRIDGE_EGL_FORCE_RGBA8888"
            r11.setEarlyEnv(r12, r1)
            java.lang.String r12 = "DROIDBRIDGE_EGL_FORCE_RGBX8888"
            r11.setEarlyEnv(r12, r1)
            java.lang.String r12 = "DROIDBRIDGE_DIRECT_FREEDRENO_OPAQUE_RGBX8888"
            r11.setEarlyEnv(r12, r1)
            java.lang.String r12 = "DROIDBRIDGE_DIRECT_FREEDRENO_NATIVE_SURFACE_V69"
            r11.setEarlyEnv(r12, r1)
            java.lang.String r12 = "DROIDBRIDGE_DIRECT_FREEDRENO_TEXTUREVIEW_V70"
            r11.setEarlyEnv(r12, r6)
            java.lang.String r12 = "DROIDBRIDGE_DIRECT_FREEDRENO_TURNIP_ZINK_V68"
            r11.setEarlyEnv(r12, r1)
            java.lang.String r12 = "DROIDBRIDGE_ADRENO740_SAFE_GL_EXTENSIONS"
            r11.setEarlyEnv(r12, r1)
            r11.setEarlyEnv(r8, r1)
            java.lang.String r12 = "DROIDBRIDGE_EGL_NO_SYSTEM_FALLBACK"
            r11.setEarlyEnv(r12, r6)
            java.lang.String r12 = "LIBGL_DRIVERS_PATH"
            r11.setEarlyEnv(r12, r3)
            java.lang.String r12 = "EGL_DRIVERS_PATH"
            r11.setEarlyEnv(r12, r3)
            java.lang.String r12 = r0.getAbsolutePath()
            java.lang.String r2 = "DRIVER_PATH"
            r11.setEarlyEnv(r2, r12)
            java.lang.String r12 = "POJAV_LOAD_TURNIP"
            r11.setEarlyEnv(r12, r1)
            java.lang.String r12 = "DROIDBRIDGE_LOAD_TURNIP"
            r11.setEarlyEnv(r12, r1)
            java.lang.String r12 = "DROIDBRIDGE_USE_CUSTOM_TURNIP"
            r11.setEarlyEnv(r12, r1)
            java.lang.String r12 = "DROIDBRIDGE_DIRECT_FREEDRENO_LOAD_TURNIP"
            r11.setEarlyEnv(r12, r1)
            java.lang.String r12 = "POJAV_USE_SYSTEM_VULKAN"
            r11.setEarlyEnv(r12, r6)
            java.lang.String r12 = "DROIDBRIDGE_CUSTOM_VULKAN_DRIVER"
            r11.setEarlyEnv(r12, r1)
            java.lang.String r12 = "POJAV_CUSTOM_VULKAN_DRIVER"
            r11.setEarlyEnv(r12, r1)
            java.lang.String r12 = "VK_ICD_FILENAMES"
            r11.setEarlyEnv(r12, r1)
            java.lang.String r12 = "VK_DRIVER_FILES"
            r11.setEarlyEnv(r12, r1)
            java.lang.String r12 = r0.getAbsolutePath()
            r11.setEarlyEnv(r2, r12)
            return
    }

    private void applyEarlyMesaZinkTurnipEnvironment(ca.dnamobile.javalauncher.renderer.RendererInterface r11) {
            r10 = this;
            java.io.File r0 = ca.dnamobile.javalauncher.renderer.DroidBridgeMesaSupport.resolveMesaNativeDir(r10)
            java.io.File r11 = ca.dnamobile.javalauncher.renderer.DroidBridgeMesaSupport.prepareMesaLibraryAliases(r10, r11)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "libEGL_mesa.so"
            r1.<init>(r0, r2)
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "libvulkan_freedreno.so"
            r3.<init>(r0, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r0.getAbsolutePath()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = java.io.File.pathSeparator
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = r11.getAbsolutePath()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "POJAV_RENDERER"
            java.lang.String r6 = "opengles3"
            r10.setEarlyEnv(r5, r6)
            java.lang.String r5 = "POJAV_RENDERER_MESA_MODE"
            java.lang.String r6 = "zink_turnip"
            r10.setEarlyEnv(r5, r6)
            java.lang.String r5 = "DROIDBRIDGE_MESA"
            java.lang.String r7 = "1"
            r10.setEarlyEnv(r5, r7)
            java.lang.String r5 = "MESA_PROCESS_NAME"
            java.lang.String r8 = "DroidBridge"
            r10.setEarlyEnv(r5, r8)
            java.lang.String r5 = "DROIDBRIDGE_MESA_SAFE_SWAPS"
            java.lang.String r8 = ""
            r10.setEarlyEnv(r5, r8)
            java.lang.String r5 = "DROIDBRIDGE_MESA_MODE"
            r10.setEarlyEnv(r5, r6)
            java.lang.String r5 = "DROIDBRIDGE_MESA_DRIVER"
            java.lang.String r6 = "zink"
            r10.setEarlyEnv(r5, r6)
            java.lang.String r5 = "DROIDBRIDGE_MESA_NATIVE_DIR"
            java.lang.String r9 = r0.getAbsolutePath()
            r10.setEarlyEnv(r5, r9)
            java.lang.String r5 = "DROIDBRIDGE_MESA_ALIAS_DIR"
            java.lang.String r11 = r11.getAbsolutePath()
            r10.setEarlyEnv(r5, r11)
            java.lang.String r11 = "DROIDBRIDGE_MESA_NAMESPACE"
            r10.setEarlyEnv(r11, r7)
            java.lang.String r11 = "DROIDBRIDGE_MESA_NAMESPACE_PATH"
            r10.setEarlyEnv(r11, r4)
            java.lang.String r11 = "DROIDBRIDGE_MESA_EGL"
            java.lang.String r1 = r1.getAbsolutePath()
            r10.setEarlyEnv(r11, r1)
            java.lang.String r11 = "DROIDBRIDGE_MESA_EGL_SINGLE_INSTANCE"
            r10.setEarlyEnv(r11, r7)
            java.lang.String r11 = "DROIDBRIDGE_EGL_FORCE_DESKTOP_GL"
            r10.setEarlyEnv(r11, r7)
            java.lang.String r1 = "DROIDBRIDGE_EGL_NO_SYSTEM_FALLBACK"
            r10.setEarlyEnv(r1, r7)
            java.lang.String r5 = "POJAV_NATIVEDIR"
            java.lang.String r9 = r0.getAbsolutePath()
            r10.setEarlyEnv(r5, r9)
            java.lang.String r5 = "POJAVEXEC_EGL"
            r10.setEarlyEnv(r5, r2)
            java.lang.String r5 = "POJAV_EGL_LIBRARY"
            r10.setEarlyEnv(r5, r2)
            java.lang.String r5 = "POJAVEXEC_EGL_LIBRARY"
            r10.setEarlyEnv(r5, r2)
            java.lang.String r5 = "POJAV_RENDERER_LIBRARY"
            r10.setEarlyEnv(r5, r2)
            java.lang.String r5 = "POJAVEXEC_RENDERER"
            r10.setEarlyEnv(r5, r2)
            java.lang.String r5 = "LIB_MESA_NAME"
            r10.setEarlyEnv(r5, r2)
            java.lang.String r2 = "GALLIUM_DRIVER"
            r10.setEarlyEnv(r2, r6)
            java.lang.String r2 = "MESA_LOADER_DRIVER_OVERRIDE"
            r10.setEarlyEnv(r2, r6)
            java.lang.String r2 = "LIBGL_ES"
            r10.setEarlyEnv(r2, r8)
            r10.setEarlyEnv(r11, r7)
            r10.setEarlyEnv(r1, r7)
            java.lang.String r11 = "MESA_NO_ERROR"
            java.lang.String r1 = "0"
            r10.setEarlyEnv(r11, r1)
            java.lang.String r11 = "MESA_GL_VERSION_OVERRIDE"
            java.lang.String r2 = "4.6COMPAT"
            r10.setEarlyEnv(r11, r2)
            java.lang.String r11 = "MESA_GLSL_VERSION_OVERRIDE"
            java.lang.String r2 = "460"
            r10.setEarlyEnv(r11, r2)
            java.lang.String r11 = "MESA_EXTENSION_OVERRIDE"
            java.lang.String r2 = "-GL_ARB_buffer_storage -GL_ARB_direct_state_access -GL_ARB_vertex_attrib_binding -GL_EXT_direct_state_access -GL_ARB_multi_draw_indirect -GL_ARB_indirect_parameters -GL_ARB_shader_draw_parameters"
            r10.setEarlyEnv(r11, r2)
            java.lang.String r11 = "mesa_glthread"
            java.lang.String r2 = "false"
            r10.setEarlyEnv(r11, r2)
            java.lang.String r11 = "MESA_DEBUG"
            r10.setEarlyEnv(r11, r8)
            java.lang.String r11 = "MESA_VK_WSI_PRESENT_MODE"
            java.lang.String r2 = "mailbox"
            r10.setEarlyEnv(r11, r2)
            java.lang.String r11 = "LIBGL_DRIVERS_PATH"
            r10.setEarlyEnv(r11, r4)
            java.lang.String r11 = "EGL_DRIVERS_PATH"
            r10.setEarlyEnv(r11, r4)
            java.lang.String r11 = "DRIVER_PATH"
            java.lang.String r0 = r0.getAbsolutePath()
            r10.setEarlyEnv(r11, r0)
            java.lang.String r11 = "POJAV_USE_SYSTEM_VULKAN"
            r10.setEarlyEnv(r11, r1)
            java.lang.String r11 = "POJAV_LOAD_TURNIP"
            r10.setEarlyEnv(r11, r7)
            java.lang.String r11 = "DROIDBRIDGE_LOAD_TURNIP"
            r10.setEarlyEnv(r11, r7)
            java.lang.String r11 = "DROIDBRIDGE_USE_CUSTOM_TURNIP"
            r10.setEarlyEnv(r11, r7)
            boolean r11 = r3.isFile()
            java.lang.String r0 = "POJAV_CUSTOM_VULKAN_DRIVER"
            java.lang.String r1 = "DROIDBRIDGE_CUSTOM_VULKAN_DRIVER"
            if (r11 == 0) goto L143
            java.lang.String r11 = r3.getAbsolutePath()
            r10.setEarlyEnv(r1, r11)
            java.lang.String r11 = r3.getAbsolutePath()
            r10.setEarlyEnv(r0, r11)
            goto L149
        L143:
            r10.setEarlyEnv(r1, r8)
            r10.setEarlyEnv(r0, r8)
        L149:
            java.lang.String r11 = "VK_ICD_FILENAMES"
            r10.setEarlyEnv(r11, r8)
            java.lang.String r11 = "VK_DRIVER_FILES"
            r10.setEarlyEnv(r11, r8)
            java.lang.String r11 = "OSMESA_LIB"
            r10.setEarlyEnv(r11, r8)
            java.lang.String r11 = "POJAV_OSMESA_LIBRARY"
            r10.setEarlyEnv(r11, r8)
            java.lang.String r11 = "OSMESA_LIBRARY"
            r10.setEarlyEnv(r11, r8)
            java.lang.String r11 = "LIBGL_OSMESA"
            r10.setEarlyEnv(r11, r8)
            return
    }

    private void applyEarlyNativeGlfwKgslEnvironment(ca.dnamobile.javalauncher.renderer.RendererInterface r10) {
            r9 = this;
            java.io.File r0 = ca.dnamobile.javalauncher.renderer.DroidBridgeMesaSupport.resolveMesaNativeDir(r9)
            java.io.File r1 = ca.dnamobile.javalauncher.renderer.DroidBridgeMesaSupport.prepareMesaLibraryAliases(r9, r10)
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "libEGL_mesa.so"
            r2.<init>(r0, r3)
            java.io.File r4 = new java.io.File
            java.lang.String r5 = "libdroidbridge_native_glfw_v82.so"
            r4.<init>(r0, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r0.getAbsolutePath()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = java.io.File.pathSeparator
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = r1.getAbsolutePath()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.util.Map r10 = r10.getRendererEnv()
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L41:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L5d
            java.lang.Object r6 = r10.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r6.getValue()
            java.lang.String r6 = (java.lang.String) r6
            r9.setEarlyEnv(r7, r6)
            goto L41
        L5d:
            java.lang.String r10 = "DROIDBRIDGE_NATIVE_GLFW"
            java.lang.String r6 = "1"
            r9.setEarlyEnv(r10, r6)
            java.lang.String r10 = "DROIDBRIDGE_NATIVE_GLFW_KGSL"
            r9.setEarlyEnv(r10, r6)
            java.lang.String r10 = "DROIDBRIDGE_NATIVE_GLFW_DESKTOP_GL"
            r9.setEarlyEnv(r10, r6)
            java.lang.String r10 = "DROIDBRIDGE_NATIVE_GLFW_LIB"
            java.lang.String r7 = r4.getAbsolutePath()
            r9.setEarlyEnv(r10, r7)
            java.lang.String r10 = "DROIDBRIDGE_NATIVE_GLFW_EGL"
            java.lang.String r7 = r2.getAbsolutePath()
            r9.setEarlyEnv(r10, r7)
            java.lang.String r10 = "DROIDBRIDGE_NATIVE_GLFW_DRIVER"
            java.lang.String r7 = "kgsl"
            r9.setEarlyEnv(r10, r7)
            java.lang.String r10 = "POJAV_RENDERER"
            java.lang.String r8 = "freedreno_kgsl"
            r9.setEarlyEnv(r10, r8)
            java.lang.String r10 = "POJAV_RENDERER_MESA_MODE"
            r9.setEarlyEnv(r10, r8)
            java.lang.String r10 = "DROIDBRIDGE_MESA"
            r9.setEarlyEnv(r10, r6)
            java.lang.String r10 = "DROIDBRIDGE_MESA_MODE"
            r9.setEarlyEnv(r10, r8)
            java.lang.String r10 = "DROIDBRIDGE_MESA_DRIVER"
            r9.setEarlyEnv(r10, r7)
            java.lang.String r10 = "DROIDBRIDGE_MESA_NATIVE_DIR"
            java.lang.String r8 = r0.getAbsolutePath()
            r9.setEarlyEnv(r10, r8)
            java.lang.String r10 = "DROIDBRIDGE_MESA_ALIAS_DIR"
            java.lang.String r1 = r1.getAbsolutePath()
            r9.setEarlyEnv(r10, r1)
            java.lang.String r10 = "DROIDBRIDGE_MESA_NAMESPACE"
            r9.setEarlyEnv(r10, r6)
            java.lang.String r10 = "DROIDBRIDGE_MESA_NAMESPACE_PATH"
            r9.setEarlyEnv(r10, r5)
            java.lang.String r10 = "DROIDBRIDGE_MESA_EGL"
            java.lang.String r1 = r2.getAbsolutePath()
            r9.setEarlyEnv(r10, r1)
            java.lang.String r10 = "DROIDBRIDGE_MESA_EGL_SINGLE_INSTANCE"
            r9.setEarlyEnv(r10, r6)
            java.lang.String r10 = "DROIDBRIDGE_MESA_DESKTOP_GL"
            r9.setEarlyEnv(r10, r6)
            java.lang.String r10 = "POJAV_NATIVEDIR"
            java.lang.String r1 = r0.getAbsolutePath()
            r9.setEarlyEnv(r10, r1)
            java.lang.String r10 = "POJAVEXEC_EGL"
            r9.setEarlyEnv(r10, r3)
            java.lang.String r10 = "POJAV_EGL_LIBRARY"
            r9.setEarlyEnv(r10, r3)
            java.lang.String r10 = "POJAVEXEC_EGL_LIBRARY"
            r9.setEarlyEnv(r10, r3)
            java.lang.String r10 = "POJAV_RENDERER_LIBRARY"
            r9.setEarlyEnv(r10, r3)
            java.lang.String r10 = "POJAVEXEC_RENDERER"
            r9.setEarlyEnv(r10, r3)
            java.lang.String r10 = "LIB_MESA_NAME"
            r9.setEarlyEnv(r10, r3)
            java.lang.String r10 = "MESA_PROCESS_NAME"
            java.lang.String r1 = "DroidBridge"
            r9.setEarlyEnv(r10, r1)
            java.lang.String r10 = "MESA_DRICONF_EXECUTABLE_OVERRIDE"
            r9.setEarlyEnv(r10, r1)
            java.lang.String r10 = "GALLIUM_DRIVER"
            java.lang.String r1 = ""
            r9.setEarlyEnv(r10, r1)
            java.lang.String r10 = "MESA_LOADER_DRIVER_OVERRIDE"
            r9.setEarlyEnv(r10, r7)
            java.lang.String r10 = "EGL_PLATFORM"
            java.lang.String r3 = "android"
            r9.setEarlyEnv(r10, r3)
            java.lang.String r10 = "LIBGL_ES"
            java.lang.String r3 = "2"
            r9.setEarlyEnv(r10, r3)
            java.lang.String r10 = "MESA_GL_VERSION_OVERRIDE"
            java.lang.String r3 = "4.6COMPAT"
            r9.setEarlyEnv(r10, r3)
            java.lang.String r10 = "MESA_GLSL_VERSION_OVERRIDE"
            java.lang.String r3 = "460"
            r9.setEarlyEnv(r10, r3)
            java.lang.String r10 = "LIBGL_MIPMAP"
            java.lang.String r3 = "3"
            r9.setEarlyEnv(r10, r3)
            java.lang.String r10 = "LIBGL_NOINTOVLHACK"
            r9.setEarlyEnv(r10, r6)
            java.lang.String r10 = "LIBGL_NORMALIZE"
            r9.setEarlyEnv(r10, r6)
            java.lang.String r10 = "LIBGL_NOERROR"
            r9.setEarlyEnv(r10, r6)
            java.lang.String r10 = "allow_higher_compat_version"
            java.lang.String r3 = "true"
            r9.setEarlyEnv(r10, r3)
            java.lang.String r10 = "force_glsl_extensions_warn"
            r9.setEarlyEnv(r10, r3)
            java.lang.String r10 = "allow_glsl_extension_directive_midshader"
            r9.setEarlyEnv(r10, r3)
            java.lang.String r10 = "DROIDBRIDGE_EGL_FORCE_DESKTOP_GL"
            r9.setEarlyEnv(r10, r6)
            java.lang.String r10 = "DROIDBRIDGE_EGL_NO_SYSTEM_FALLBACK"
            r9.setEarlyEnv(r10, r6)
            java.lang.String r10 = "MESA_EXTENSION_OVERRIDE"
            r9.setEarlyEnv(r10, r1)
            java.lang.String r10 = "mesa_glthread"
            r9.setEarlyEnv(r10, r1)
            java.lang.String r10 = "LIBGL_DRIVERS_PATH"
            r9.setEarlyEnv(r10, r5)
            java.lang.String r10 = "EGL_DRIVERS_PATH"
            r9.setEarlyEnv(r10, r5)
            java.lang.String r10 = "DRIVER_PATH"
            java.lang.String r3 = r0.getAbsolutePath()
            r9.setEarlyEnv(r10, r3)
            java.lang.String r10 = "POJAV_LOAD_TURNIP"
            r9.setEarlyEnv(r10, r1)
            java.lang.String r10 = "DROIDBRIDGE_LOAD_TURNIP"
            r9.setEarlyEnv(r10, r1)
            java.lang.String r10 = "DROIDBRIDGE_USE_CUSTOM_TURNIP"
            r9.setEarlyEnv(r10, r1)
            java.lang.String r10 = "POJAV_USE_SYSTEM_VULKAN"
            r9.setEarlyEnv(r10, r6)
            java.lang.String r10 = "VK_ICD_FILENAMES"
            r9.setEarlyEnv(r10, r1)
            java.lang.String r10 = "VK_DRIVER_FILES"
            r9.setEarlyEnv(r10, r1)
            java.lang.String r10 = "VK_INSTANCE_LAYERS"
            r9.setEarlyEnv(r10, r1)
            java.lang.String r10 = "OSMESA_LIB"
            r9.setEarlyEnv(r10, r1)
            java.lang.String r10 = "POJAV_OSMESA_LIBRARY"
            r9.setEarlyEnv(r10, r1)
            java.lang.String r10 = "OSMESA_LIBRARY"
            r9.setEarlyEnv(r10, r1)
            java.lang.String r10 = "LIBGL_OSMESA"
            r9.setEarlyEnv(r10, r1)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r1 = "Native GLFW KGSL early env nativeDir="
            r10.<init>(r1)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r10 = r10.append(r0)
            java.lang.String r0 = " egl="
            java.lang.StringBuilder r10 = r10.append(r0)
            java.lang.String r0 = r2.getAbsolutePath()
            java.lang.StringBuilder r10 = r10.append(r0)
            java.lang.String r0 = " nativeGlfw="
            java.lang.StringBuilder r10 = r10.append(r0)
            java.lang.String r0 = r4.getAbsolutePath()
            java.lang.StringBuilder r10 = r10.append(r0)
            java.lang.String r0 = " nativeGlfwExists="
            java.lang.StringBuilder r10 = r10.append(r0)
            boolean r0 = r4.isFile()
            java.lang.StringBuilder r10 = r10.append(r0)
            java.lang.String r10 = r10.toString()
            java.lang.String r0 = "GameActivity"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r10)
            return
    }

    private void applyEarlyRendererBridgeAliases(ca.dnamobile.javalauncher.renderer.RendererInterface r17, java.lang.String r18) {
            r16 = this;
            r0 = r16
            r1 = r18
            java.lang.String r2 = r17.getRendererLibrary()
            java.lang.String r2 = r0.sanitizeLibraryName(r2)
            java.lang.String r3 = r16.rendererIdentity(r17)
            boolean r4 = r16.isLtwRenderer(r17)
            java.lang.String r5 = "MESA_LOADER_DRIVER_OVERRIDE"
            java.lang.String r6 = "GALLIUM_DRIVER"
            java.lang.String r7 = "3"
            java.lang.String r8 = "LIBGL_ES"
            java.lang.String r9 = "OSMESA_LIB"
            java.lang.String r10 = "POJAVEXEC_EGL"
            java.lang.String r11 = "POJAV_RENDERER"
            java.lang.String r12 = "POJAVEXEC_RENDERER"
            java.lang.String r13 = "POJAV_RENDERER_LIBRARY"
            java.lang.String r14 = "POJAVEXEC_EGL_LIBRARY"
            java.lang.String r15 = "POJAV_EGL_LIBRARY"
            if (r4 == 0) goto L7d
            java.lang.String r1 = "opengles3_ltw"
            r0.setEarlyEnv(r11, r1)
            java.lang.String r1 = "libltw.so"
            r0.setEarlyEnv(r10, r1)
            r0.setEarlyEnv(r15, r1)
            r0.setEarlyEnv(r14, r1)
            r0.setEarlyEnv(r13, r1)
            r0.setEarlyEnv(r12, r1)
            r0.setEarlyEnv(r8, r7)
            java.lang.String r1 = "POJAV_USE_SYSTEM_VULKAN"
            java.lang.String r2 = "1"
            r0.setEarlyEnv(r1, r2)
            java.lang.String r1 = "DRIVER_PATH"
            java.lang.String r2 = ""
            r0.setEarlyEnv(r1, r2)
            java.lang.String r1 = "VK_ICD_FILENAMES"
            r0.setEarlyEnv(r1, r2)
            java.lang.String r1 = "VK_DRIVER_FILES"
            r0.setEarlyEnv(r1, r2)
            java.lang.String r1 = "LIBGL_DRIVERS_PATH"
            r0.setEarlyEnv(r1, r2)
            java.lang.String r1 = "EGL_DRIVERS_PATH"
            r0.setEarlyEnv(r1, r2)
            r0.setEarlyEnv(r9, r2)
            r0.setEarlyEnv(r6, r2)
            r0.setEarlyEnv(r5, r2)
            java.lang.String r1 = "LTW_NEVER_FLUSH_BUFFERS"
            java.lang.String r2 = "0"
            r0.setEarlyEnv(r1, r2)
            java.lang.String r1 = "LTW_COHERENT_DYNAMIC_STORAGE"
            r0.setEarlyEnv(r1, r2)
            return
        L7d:
            boolean r4 = r16.isMobileGluesRenderer(r17)
            if (r4 == 0) goto L9d
            java.lang.String r1 = "mobileglues"
            r0.setEarlyEnv(r11, r1)
            java.lang.String r1 = "libmobileglues.so"
            r0.setEarlyEnv(r13, r1)
            r0.setEarlyEnv(r12, r1)
            r0.setEarlyEnv(r10, r1)
            r0.setEarlyEnv(r15, r1)
            r0.setEarlyEnv(r14, r1)
            r16.clearMesaAndVulkanDriverEnvironment()
            return
        L9d:
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto Lac
            r0.setEarlyEnv(r13, r2)
            r0.setEarlyEnv(r12, r2)
            r0.setEarlyEnv(r9, r2)
        Lac:
            boolean r4 = r18.isEmpty()
            if (r4 != 0) goto Lb8
            r0.setEarlyEnv(r15, r1)
            r0.setEarlyEnv(r14, r1)
        Lb8:
            java.lang.String r1 = "zink"
            boolean r4 = r3.contains(r1)
            if (r4 != 0) goto Lc8
            java.lang.String r4 = "osmesa"
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L104
        Lc8:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto Ld0
            java.lang.String r2 = "libOSMesa_8.so"
        Ld0:
            java.lang.String r3 = "vulkan_zink"
            r0.setEarlyEnv(r11, r3)
            r0.setEarlyEnv(r10, r2)
            r0.setEarlyEnv(r15, r2)
            r0.setEarlyEnv(r14, r2)
            r0.setEarlyEnv(r13, r2)
            r0.setEarlyEnv(r12, r2)
            java.lang.String r3 = "LIB_MESA_NAME"
            r0.setEarlyEnv(r3, r2)
            r0.setEarlyEnv(r9, r2)
            java.lang.String r3 = "POJAV_OSMESA_LIBRARY"
            r0.setEarlyEnv(r3, r2)
            java.lang.String r3 = "OSMESA_LIBRARY"
            r0.setEarlyEnv(r3, r2)
            java.lang.String r3 = "LIBGL_OSMESA"
            r0.setEarlyEnv(r3, r2)
            r0.setEarlyEnv(r8, r7)
            r0.setEarlyEnv(r5, r1)
            r0.setEarlyEnv(r6, r1)
        L104:
            return
    }

    private void applyGameDisplaySurfaceOptions() {
            r4 = this;
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r4.binding
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.FrameLayout r0 = r0.getRoot()
            r1 = 0
            r0.setFitsSystemWindows(r1)
            r0.setClipToOutline(r1)
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r2 = r4.binding
            net.kdt.pojavlaunch.MinecraftGLSurface r2 = r2.minecraftSurface
            r2.setFitsSystemWindows(r1)
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r2 = r4.binding
            net.kdt.pojavlaunch.MinecraftGLSurface r2 = r2.minecraftSurface
            r2.setClipToOutline(r1)
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L2b
            r2 = r0
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r2.setClipChildren(r1)
            r2.setClipToPadding(r1)
        L2b:
            boolean r2 = ca.dnamobile.javalauncher.settings.LauncherPreferences.isIgnoreDisplayCutout(r4)
            boolean r3 = ca.dnamobile.javalauncher.settings.LauncherPreferences.isAvoidRoundedDisplayCorners(r4)
            if (r3 == 0) goto L3d
            if (r2 != 0) goto L3d
            r1 = 10
            int r1 = r4.dpToPx(r1)
        L3d:
            r0.setPadding(r1, r1, r1, r1)
            r0.requestApplyInsets()     // Catch: java.lang.Throwable -> L4a
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r4.binding     // Catch: java.lang.Throwable -> L4a
            net.kdt.pojavlaunch.MinecraftGLSurface r0 = r0.minecraftSurface     // Catch: java.lang.Throwable -> L4a
            r0.requestApplyInsets()     // Catch: java.lang.Throwable -> L4a
        L4a:
            return
    }

    private void applyInGameOverlayPreferences() {
            r0 = this;
            r0.applyGameDisplaySurfaceOptions()
            r0.configureLogOverlay()
            r0.configureInGameSettingsButton()
            r0.configureWindow()
            r0.scheduleMinecraftSurfaceRefresh()
            return
    }

    private android.view.View buildInGameDialogAction(java.lang.String r7, java.lang.String r8, boolean r9, java.lang.Runnable r10) {
            r6 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r6)
            r1 = 1
            r0.setOrientation(r1)
            r2 = 16
            r0.setGravity(r2)
            r2 = 14
            int r3 = r6.dpToPx(r2)
            r4 = 12
            int r5 = r6.dpToPx(r4)
            int r2 = r6.dpToPx(r2)
            int r4 = r6.dpToPx(r4)
            r0.setPadding(r3, r5, r2, r4)
            int r2 = ca.dnamobile.javalauncher.GameActivity.COLOR_CARD_BG
            int r3 = ca.dnamobile.javalauncher.GameActivity.COLOR_CARD_STROKE
            r4 = 18
            android.graphics.drawable.GradientDrawable r2 = r6.roundedDrawable(r2, r3, r4)
            r0.setBackground(r2)
            r0.setClickable(r1)
            r0.setFocusable(r1)
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda2 r1 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda2
            r1.<init>(r10)
            r0.setOnClickListener(r1)
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda3 r10 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda3
            r10.<init>(r6)
            r0.setOnTouchListener(r10)
            android.widget.TextView r10 = new android.widget.TextView
            r10.<init>(r6)
            r10.setText(r7)
            if (r9 == 0) goto L55
            int r7 = ca.dnamobile.javalauncher.GameActivity.COLOR_DANGER
            goto L57
        L55:
            int r7 = ca.dnamobile.javalauncher.GameActivity.COLOR_TEXT_PRIMARY
        L57:
            r10.setTextColor(r7)
            r7 = 1098907648(0x41800000, float:16.0)
            r10.setTextSize(r7)
            android.graphics.Typeface r7 = android.graphics.Typeface.DEFAULT_BOLD
            r10.setTypeface(r7)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r9 = -1
            r1 = -2
            r7.<init>(r9, r1)
            r0.addView(r10, r7)
            android.widget.TextView r7 = new android.widget.TextView
            r7.<init>(r6)
            r7.setText(r8)
            int r8 = ca.dnamobile.javalauncher.GameActivity.COLOR_TEXT_SECONDARY
            r7.setTextColor(r8)
            r8 = 1095237632(0x41480000, float:12.5)
            r7.setTextSize(r8)
            r8 = 3
            int r8 = r6.dpToPx(r8)
            r10 = 0
            r7.setPadding(r10, r8, r10, r10)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r8.<init>(r9, r1)
            r0.addView(r7, r8)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r7.<init>(r9, r1)
            r8 = 10
            int r8 = r6.dpToPx(r8)
            r7.setMargins(r10, r10, r10, r8)
            r0.setLayoutParams(r7)
            return r0
    }

    private ca.dnamobile.javalauncher.GameActivity.PreLaunchMicrosoftSessionResult checkMicrosoftAccountSession(ca.dnamobile.javalauncher.data.AccountStore.Account r2) {
            r1 = this;
            if (r2 != 0) goto L9
            java.lang.String r2 = "Microsoft account check skipped: no active Microsoft launch account was loaded."
            ca.dnamobile.javalauncher.GameActivity$PreLaunchMicrosoftSessionResult r2 = ca.dnamobile.javalauncher.GameActivity.PreLaunchMicrosoftSessionResult.ok(r2)
            return r2
        L9:
            boolean r0 = r2.isMicrosoftAccount()
            if (r0 == 0) goto L2c
            boolean r0 = r2.hasMinecraftSession()
            if (r0 != 0) goto L16
            goto L2c
        L16:
            java.lang.String r0 = r2.minecraftAccessToken
            boolean r0 = isNullOrBlank(r0)
            if (r0 == 0) goto L25
            java.lang.String r2 = "The active Microsoft account does not have a Minecraft access token. Open Settings and use Refresh Microsoft account/skin, or continue anyway for local play."
            ca.dnamobile.javalauncher.GameActivity$PreLaunchMicrosoftSessionResult r2 = ca.dnamobile.javalauncher.GameActivity.PreLaunchMicrosoftSessionResult.warning(r2)
            return r2
        L25:
            java.lang.String r2 = r2.minecraftAccessToken
            ca.dnamobile.javalauncher.GameActivity$PreLaunchMicrosoftSessionResult r2 = r1.validateMinecraftProfileToken(r2)
            return r2
        L2c:
            java.lang.String r2 = "Microsoft account check skipped: active launch account is offline/local."
            ca.dnamobile.javalauncher.GameActivity$PreLaunchMicrosoftSessionResult r2 = ca.dnamobile.javalauncher.GameActivity.PreLaunchMicrosoftSessionResult.ok(r2)
            return r2
    }

    private ca.dnamobile.javalauncher.GameActivity.ReplayModFfmpegPreflight checkReplayModFfmpegPreflight() {
            r5 = this;
            java.lang.String r0 = "GameActivity"
            java.lang.String r1 = "Replay Mod FFmpeg preflight skipped; current instance does not contain Replay Mod: "
            java.io.File r2 = r5.findReplayModGameDirectoryForPreflight()     // Catch: java.lang.Throwable -> L4c
            if (r2 != 0) goto L14
            java.lang.String r1 = "Replay Mod FFmpeg preflight skipped; Replay Mod was not found in the current launch instance."
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r1)     // Catch: java.lang.Throwable -> L4c
            ca.dnamobile.javalauncher.GameActivity$ReplayModFfmpegPreflight r0 = ca.dnamobile.javalauncher.GameActivity.ReplayModFfmpegPreflight.noWarning()     // Catch: java.lang.Throwable -> L4c
            return r0
        L14:
            ca.dnamobile.javalauncher.modcompat.FFmpegPluginCompat$Result r3 = ca.dnamobile.javalauncher.modcompat.FFmpegPluginCompat.discoverForReplayMod(r5, r2)     // Catch: java.lang.Throwable -> L4c
            boolean r4 = r3.replayModPresent     // Catch: java.lang.Throwable -> L4c
            if (r4 != 0) goto L35
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r1 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L4c
            java.lang.StringBuilder r1 = r3.append(r1)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L4c
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r1)     // Catch: java.lang.Throwable -> L4c
            ca.dnamobile.javalauncher.GameActivity$ReplayModFfmpegPreflight r0 = ca.dnamobile.javalauncher.GameActivity.ReplayModFfmpegPreflight.noWarning()     // Catch: java.lang.Throwable -> L4c
            return r0
        L35:
            boolean r1 = r3.available     // Catch: java.lang.Throwable -> L4c
            if (r1 == 0) goto L3e
            ca.dnamobile.javalauncher.GameActivity$ReplayModFfmpegPreflight r0 = ca.dnamobile.javalauncher.GameActivity.ReplayModFfmpegPreflight.noWarning()     // Catch: java.lang.Throwable -> L4c
            return r0
        L3e:
            java.lang.String r1 = r3.errorMessage     // Catch: java.lang.Throwable -> L4c
            if (r1 == 0) goto L45
            java.lang.String r1 = r3.errorMessage     // Catch: java.lang.Throwable -> L4c
            goto L47
        L45:
            java.lang.String r1 = "JavaLauncher FFmpeg plugin is not installed."
        L47:
            ca.dnamobile.javalauncher.GameActivity$ReplayModFfmpegPreflight r0 = ca.dnamobile.javalauncher.GameActivity.ReplayModFfmpegPreflight.warning(r2, r1)     // Catch: java.lang.Throwable -> L4c
            return r0
        L4c:
            r1 = move-exception
            java.lang.String r2 = "Replay Mod FFmpeg preflight check failed"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r2, r1)
            ca.dnamobile.javalauncher.GameActivity$ReplayModFfmpegPreflight r0 = ca.dnamobile.javalauncher.GameActivity.ReplayModFfmpegPreflight.noWarning()
            return r0
    }

    private void clearEarlyRendererEnvAliases() {
            r2 = this;
            java.lang.String r0 = "POJAV_RENDERER"
            java.lang.String r1 = ""
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "POJAV_RENDERER_MESA_MODE"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "POJAV_RENDERER_LIBRARY"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "POJAVEXEC_RENDERER"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "POJAVEXEC_EGL"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "POJAV_EGL_LIBRARY"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "POJAVEXEC_EGL_LIBRARY"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "OSMESA_LIB"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "POJAV_OSMESA_LIBRARY"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "OSMESA_LIBRARY"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "LIBGL_OSMESA"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "GALLIUM_DRIVER"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "MESA_LOADER_DRIVER_OVERRIDE"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "LIBGL_ES"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_EGL_FORCE_DESKTOP_GL"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_EGL_NO_SYSTEM_FALLBACK"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "POJAV_USE_SYSTEM_VULKAN"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "POJAV_LOAD_TURNIP"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_LOAD_TURNIP"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_USE_CUSTOM_TURNIP"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_CUSTOM_VULKAN_DRIVER"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "POJAV_CUSTOM_VULKAN_DRIVER"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DRIVER_PATH"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "VK_ICD_FILENAMES"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "VK_DRIVER_FILES"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "LIBGL_DRIVERS_PATH"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "EGL_DRIVERS_PATH"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "LTW_NEVER_FLUSH_BUFFERS"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "LTW_COHERENT_DYNAMIC_STORAGE"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "MESA_PROCESS_NAME"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "MESA_DRICONF_EXECUTABLE_OVERRIDE"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_DRIVER"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_MODE"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_NATIVE_DIR"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_ALIAS_DIR"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_NAMESPACE"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_NAMESPACE_PATH"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_EGL"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_EGL_SINGLE_INSTANCE"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_PROP_MESA_LOADER_DRIVER_OVERRIDE"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_PROP_DEBUG_MESA_LOADER_DRIVER_OVERRIDE"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_PROP_GALLIUM_DRIVER"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_PROP_DEBUG_GALLIUM_DRIVER"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_PROP_MESA_GL_VERSION_OVERRIDE"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_PROP_MESA_GLSL_VERSION_OVERRIDE"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_GL"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_DESKTOP_GL"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_SAFE_SWAPS"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_ZINK_V59_CLEAN_ALIAS"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_LEGACY_FREEDRENO_ALIAS_V59"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_EGL_PLATFORM_DISPLAY"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_EGL_RECOVER_CURRENT"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_EGL_SHIM"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "MESA_EXTENSION_OVERRIDE"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "mesa_glthread"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_NATIVE_GLFW"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_NATIVE_GLFW_KGSL"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_NATIVE_GLFW_DESKTOP_GL"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_NATIVE_GLFW_LIB"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_NATIVE_GLFW_EGL"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_NATIVE_GLFW_DRIVER"
            r2.setEarlyEnv(r0, r1)
            return
    }

    private void clearMesaAndVulkanDriverEnvironment() {
            r2 = this;
            java.lang.String r0 = "OSMESA_LIB"
            java.lang.String r1 = ""
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "POJAV_OSMESA_LIBRARY"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "OSMESA_LIBRARY"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "LIBGL_OSMESA"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "LIB_MESA_NAME"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_MODE"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_DRIVER"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_EGL"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_NATIVE_DIR"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_ALIAS_DIR"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_NAMESPACE"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_NAMESPACE_PATH"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_EGL_SINGLE_INSTANCE"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_DESKTOP_GL"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_SAFE_SWAPS"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_EGL_FORCE_DESKTOP_GL"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_EGL_NO_SYSTEM_FALLBACK"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "MESA_PROCESS_NAME"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "MESA_DRICONF_EXECUTABLE_OVERRIDE"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "GALLIUM_DRIVER"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "MESA_LOADER_DRIVER_OVERRIDE"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "MESA_GL_VERSION_OVERRIDE"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "MESA_GLSL_VERSION_OVERRIDE"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "MESA_EXTENSION_OVERRIDE"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "MESA_NO_ERROR"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "MESA_DEBUG"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "mesa_glthread"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "EGL_PLATFORM"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "LIBGL_ES"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "LIBGL_DRIVERS_PATH"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "EGL_DRIVERS_PATH"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DRIVER_PATH"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "POJAV_LOAD_TURNIP"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_LOAD_TURNIP"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_USE_CUSTOM_TURNIP"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_CUSTOM_VULKAN_DRIVER"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "POJAV_CUSTOM_VULKAN_DRIVER"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "VK_ICD_FILENAMES"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "VK_DRIVER_FILES"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "VK_INSTANCE_LAYERS"
            r2.setEarlyEnv(r0, r1)
            java.lang.String r0 = "POJAV_USE_SYSTEM_VULKAN"
            java.lang.String r1 = "1"
            r2.setEarlyEnv(r0, r1)
            return
    }

    private void configureDroidBridgeRenderSpecAfterBridgeLoad() {
            r5 = this;
            java.lang.String r0 = "GameActivity"
            java.lang.String r1 = "Early DroidBridge RenderSpec configured="
            ca.dnamobile.javalauncher.renderer.Renderers.reload(r5)     // Catch: java.lang.Throwable -> L43
            ca.dnamobile.javalauncher.renderer.RendererInterface r2 = ca.dnamobile.javalauncher.renderer.Renderers.getSelectedRenderer(r5)     // Catch: java.lang.Throwable -> L43
            boolean r3 = ca.dnamobile.javalauncher.renderer.DroidBridgeMesaSupport.isDroidBridgeMesaRenderer(r2)     // Catch: java.lang.Throwable -> L43
            if (r3 != 0) goto L12
            return
        L12:
            boolean r3 = ca.dnamobile.javalauncher.renderer.DroidBridgeRenderSpec.configureForMesa(r5, r2)     // Catch: java.lang.Throwable -> L43
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L43
            java.lang.StringBuilder r1 = r4.append(r3)     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = " renderer="
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = r2.getRendererName()     // Catch: java.lang.Throwable -> L43
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = " rendererId="
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = r2.getRendererId()     // Catch: java.lang.Throwable -> L43
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L43
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L43
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r1)     // Catch: java.lang.Throwable -> L43
            goto L49
        L43:
            r1 = move-exception
            java.lang.String r2 = "Failed to configure early DroidBridge RenderSpec"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r2, r1)
        L49:
            return
    }

    private void configureInGameSettingsButton() {
            r2 = this;
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r2.binding
            if (r0 != 0) goto L5
            return
        L5:
            ca.dnamobile.javalauncher.game.FloatingGameSettingsOverlayController r0 = r2.floatingGameSettingsOverlayController
            if (r0 != 0) goto L17
            ca.dnamobile.javalauncher.game.FloatingGameSettingsOverlayController r0 = new ca.dnamobile.javalauncher.game.FloatingGameSettingsOverlayController
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r1 = r2.binding
            android.widget.ImageButton r1 = r1.buttonGameSettings
            r0.<init>(r2, r1)
            r2.floatingGameSettingsOverlayController = r0
            r0.attach()
        L17:
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r2.binding
            android.widget.ImageButton r0 = r0.buttonGameSettings
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda9 r1 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda9
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            ca.dnamobile.javalauncher.game.FloatingGameSettingsOverlayController r0 = r2.floatingGameSettingsOverlayController
            r0.refreshFromPreferences()
            ca.dnamobile.javalauncher.game.FloatingGameSettingsOverlayController r0 = r2.floatingGameSettingsOverlayController
            r0.bringToFront()
            return
    }

    private void configureInputBridgeForVersion(java.lang.String r4) {
            r3 = this;
            boolean r0 = shouldUseInputStackQueue(r4)
            org.lwjgl.glfw.CallbackBridge.setUseInputStackQueue(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Input stack queue for "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " = "
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "GameActivity"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r4)
            return
    }

    private void configureLogOverlay() {
            r4 = this;
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r4.binding
            if (r0 != 0) goto L5
            return
        L5:
            r4.stopLogOverlayTicker()
            boolean r0 = ca.dnamobile.javalauncher.settings.LauncherPreferences.isShowGameLogOverlay(r4)
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r1 = r4.binding
            android.widget.LinearLayout r1 = r1.layoutLogOverlay
            r2 = 0
            if (r0 == 0) goto L15
            r3 = r2
            goto L17
        L15:
            r3 = 8
        L17:
            r1.setVisibility(r3)
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r1 = r4.binding
            android.widget.LinearLayout r1 = r1.layoutLogOverlay
            r1.setEnabled(r2)
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r1 = r4.binding
            android.widget.ScrollView r1 = r1.scrollLogOverlay
            r1.setEnabled(r2)
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r1 = r4.binding
            android.widget.TextView r1 = r1.textLogOverlay
            r1.setEnabled(r2)
            if (r0 != 0) goto L32
            return
        L32:
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r4.binding
            android.widget.LinearLayout r0 = r0.layoutLogOverlay
            r0.bringToFront()
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r4.binding
            android.widget.LinearLayout r0 = r0.layoutLogOverlay
            r1 = 1175232512(0x460ca000, float:9000.0)
            r0.setElevation(r1)
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r4.binding
            android.widget.LinearLayout r0 = r0.layoutLogOverlay
            r0.setTranslationZ(r1)
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r4.binding
            android.widget.LinearLayout r0 = r0.layoutLogOverlay
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r4.binding
            android.widget.FrameLayout r0 = r0.getRoot()
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda46 r1 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda46
            r1.<init>(r4, r0)
            r0.post(r1)
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r4.binding
            android.widget.TextView r0 = r0.textLogOverlay
            int r0 = r0.length()
            if (r0 != 0) goto L74
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r4.binding
            android.widget.TextView r0 = r0.textLogOverlay
            java.lang.String r1 = "Waiting for log output..."
            r0.setText(r1)
        L74:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r4.logOverlayHandler = r0
            ca.dnamobile.javalauncher.GameActivity$1 r0 = new ca.dnamobile.javalauncher.GameActivity$1
            r0.<init>(r4)
            r4.logOverlayRunnable = r0
            android.os.Handler r1 = r4.logOverlayHandler
            r1.post(r0)
            return
    }

    private void configureWindow() {
            r2 = this;
            android.view.Window r0 = r2.getWindow()
            r1 = 128(0x80, float:1.8E-43)
            r0.addFlags(r1)
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r2)
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            r1 = 0
            if (r0 == 0) goto L20
            r0.setFitsSystemWindows(r1)
            r0.setClipToOutline(r1)
            r0.requestApplyInsets()     // Catch: java.lang.Throwable -> L20
        L20:
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r2.binding
            if (r0 == 0) goto L3c
            android.widget.FrameLayout r0 = r0.getRoot()
            r0.setFitsSystemWindows(r1)
            r0.setClipToOutline(r1)
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r2.binding
            net.kdt.pojavlaunch.MinecraftGLSurface r0 = r0.minecraftSurface
            r0.setFitsSystemWindows(r1)
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r2.binding
            net.kdt.pojavlaunch.MinecraftGLSurface r0 = r0.minecraftSurface
            r0.setClipToOutline(r1)
        L3c:
            return
    }

    private void continueLaunchAfterMicrosoftAccountPreflight() {
            r3 = this;
            boolean r0 = r3.exiting
            if (r0 != 0) goto L18
            boolean r0 = r3.launchStarted
            if (r0 == 0) goto L9
            goto L18
        L9:
            java.lang.Thread r0 = new java.lang.Thread
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda10 r1 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda10
            r1.<init>(r3)
            java.lang.String r2 = "JVM Main thread"
            r0.<init>(r1, r2)
            r0.start()
        L18:
            return
    }

    private void dismissDialog(android.app.AlertDialog r1) {
            r0 = this;
            if (r1 != 0) goto L3
            return
        L3:
            r1.dismiss()     // Catch: java.lang.Throwable -> L6
        L6:
            return
    }

    private int dpToPx(int r2) {
            r1 = this;
            float r2 = (float) r2
            android.content.res.Resources r0 = r1.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r2 = r2 * r0
            int r2 = java.lang.Math.round(r2)
            return r2
    }

    private java.io.File findReplayModGameDirectoryForPreflight() {
            r7 = this;
            java.lang.String r0 = "instances"
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r2 = 0
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME     // Catch: java.lang.Throwable -> L6f
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L6f
            boolean r4 = r7.isCurrentLaunchDirectoryForPreflight(r3)     // Catch: java.lang.Throwable -> L6f
            if (r4 == 0) goto L18
            r7.addReplayModDirectoryCandidates(r1, r3)     // Catch: java.lang.Throwable -> L6f
        L18:
            java.io.File r4 = r3.getParentFile()     // Catch: java.lang.Throwable -> L6f
            if (r4 == 0) goto L27
            boolean r5 = r7.isCurrentLaunchDirectoryForPreflight(r4)     // Catch: java.lang.Throwable -> L6f
            if (r5 == 0) goto L27
            r7.addReplayModDirectoryCandidates(r1, r4)     // Catch: java.lang.Throwable -> L6f
        L27:
            if (r4 == 0) goto L2e
            java.io.File r5 = r4.getParentFile()     // Catch: java.lang.Throwable -> L6f
            goto L2f
        L2e:
            r5 = r2
        L2f:
            if (r5 == 0) goto L3a
            boolean r6 = r7.isCurrentLaunchDirectoryForPreflight(r5)     // Catch: java.lang.Throwable -> L6f
            if (r6 == 0) goto L3a
            r7.addReplayModDirectoryCandidates(r1, r5)     // Catch: java.lang.Throwable -> L6f
        L3a:
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L6f
            r6.<init>(r3, r0)     // Catch: java.lang.Throwable -> L6f
            r7.addReplayModInstanceCandidates(r1, r6)     // Catch: java.lang.Throwable -> L6f
            if (r4 == 0) goto L4c
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L6f
            r3.<init>(r4, r0)     // Catch: java.lang.Throwable -> L6f
            r7.addReplayModInstanceCandidates(r1, r3)     // Catch: java.lang.Throwable -> L6f
        L4c:
            if (r5 == 0) goto L56
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L6f
            r3.<init>(r5, r0)     // Catch: java.lang.Throwable -> L6f
            r7.addReplayModInstanceCandidates(r1, r3)     // Catch: java.lang.Throwable -> L6f
        L56:
            java.util.Iterator r0 = r1.iterator()     // Catch: java.lang.Throwable -> L6f
        L5a:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L6f
            if (r1 == 0) goto L77
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L6f
            java.io.File r1 = (java.io.File) r1     // Catch: java.lang.Throwable -> L6f
            if (r1 == 0) goto L5a
            boolean r3 = ca.dnamobile.javalauncher.modcompat.FFmpegPluginCompat.hasReplayMod(r1)     // Catch: java.lang.Throwable -> L6f
            if (r3 == 0) goto L5a
            return r1
        L6f:
            r0 = move-exception
            java.lang.String r1 = "GameActivity"
            java.lang.String r3 = "Unable to resolve Replay Mod game directory for FFmpeg preflight"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r3, r0)
        L77:
            return r2
    }

    private void finishAfterExit() {
            r4 = this;
            r0 = 1
            r4.exiting = r0
            android.view.Window r0 = r4.getWindow()
            android.view.View r0 = r0.getDecorView()
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda8 r1 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda8
            r1.<init>(r4)
            r2 = 1000(0x3e8, double:4.94E-321)
            r0.postDelayed(r1, r2)
            return
    }

    private void finishMicrosoftAccountRefreshFailure(java.lang.String r3) {
            r2 = this;
            boolean r0 = r2.exiting
            if (r0 != 0) goto L2f
            boolean r0 = r2.isFinishing()
            if (r0 != 0) goto L2f
            boolean r0 = r2.isDestroyed()
            if (r0 == 0) goto L11
            goto L2f
        L11:
            java.lang.String r0 = "Microsoft account refresh failed; checking saved session..."
            r2.appendStatus(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Microsoft account refresh failed: "
            r0.<init>(r1)
            r1 = 700(0x2bc, float:9.81E-43)
            java.lang.String r3 = trimForDialog(r3, r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r2.runTokenValidationAfterRefreshFailure(r3)
            return
        L2f:
            r3 = 0
            r2.microsoftAccountPreflightPending = r3
            return
    }

    private void finishMicrosoftAccountRefreshSuccess(ca.dnamobile.javalauncher.data.AccountStore.Account r2) {
            r1 = this;
            boolean r2 = r1.exiting
            r0 = 0
            if (r2 != 0) goto L20
            boolean r2 = r1.isFinishing()
            if (r2 != 0) goto L20
            boolean r2 = r1.isDestroyed()
            if (r2 == 0) goto L12
            goto L20
        L12:
            r1.microsoftAccountPreflightPending = r0
            r2 = 1
            r1.microsoftAccountPreflightCompleted = r2
            java.lang.String r2 = "Microsoft account login refreshed. Continuing launch..."
            r1.appendStatus(r2)
            r1.continueLaunchAfterMicrosoftAccountPreflight()
            return
        L20:
            r1.microsoftAccountPreflightPending = r0
            return
    }

    private void finishMicrosoftAccountSessionPreflight(ca.dnamobile.javalauncher.GameActivity.PreLaunchMicrosoftSessionResult r2) {
            r1 = this;
            r0 = 0
            r1.microsoftAccountPreflightPending = r0
            boolean r0 = r1.exiting
            if (r0 != 0) goto L2f
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L2f
            boolean r0 = r1.isDestroyed()
            if (r0 == 0) goto L14
            goto L2f
        L14:
            boolean r0 = r2.ok
            if (r0 == 0) goto L2c
            r0 = 1
            r1.microsoftAccountPreflightCompleted = r0
            java.lang.String r0 = r2.message
            boolean r0 = isNullOrBlank(r0)
            if (r0 != 0) goto L28
            java.lang.String r2 = r2.message
            r1.appendStatus(r2)
        L28:
            r1.continueLaunchAfterMicrosoftAccountPreflight()
            return
        L2c:
            r1.showMicrosoftAccountPreflightWarningDialog(r2)
        L2f:
            return
    }

    private void forceCloseGameAndReturnToLauncher(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "GameActivity"
            java.lang.String r1 = "ForceClose: "
            boolean r2 = r3.exiting
            if (r2 == 0) goto L9
            return
        L9:
            r2 = 1
            r3.exiting = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L22
            java.lang.StringBuilder r4 = r2.append(r4)     // Catch: java.lang.Throwable -> L22
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L22
            ca.dnamobile.javalauncher.logs.LauncherLogManager.append(r4)     // Catch: java.lang.Throwable -> L22
            java.lang.String r4 = r3.versionId     // Catch: java.lang.Throwable -> L22
            ca.dnamobile.javalauncher.logs.LauncherLogManager.preserveLatestLogIfEnabled(r3, r4)     // Catch: java.lang.Throwable -> L22
            goto L28
        L22:
            r4 = move-exception
            java.lang.String r1 = "Failed to preserve latest log during force close"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r1, r4)
        L28:
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda21 r4 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda21
            r4.<init>(r3)
            r3.runOnUiThread(r4)
            r3.stopLogOverlayTicker()
            android.os.Handler r4 = r3.quitWatchdogHandler
            if (r4 == 0) goto L3e
            java.lang.Runnable r1 = r3.quitWatchdogRunnable
            if (r1 == 0) goto L3e
            r4.removeCallbacks(r1)
        L3e:
            r4 = 0
            r3.quitWatchdogRunnable = r4
            r3.quitWatchdogHandler = r4
            org.lwjgl.glfw.CallbackBridge.clearInputFocus()     // Catch: java.lang.Throwable -> L4a
            r1 = 0
            org.lwjgl.glfw.CallbackBridge.setInputReady(r1)     // Catch: java.lang.Throwable -> L4a
        L4a:
            ca.dnamobile.javalauncher.game.FloatingGameSettingsOverlayController r1 = r3.floatingGameSettingsOverlayController
            if (r1 == 0) goto L51
            r1.pause()
        L51:
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r1 = r3.binding
            if (r1 == 0) goto L5d
            net.kdt.pojavlaunch.MinecraftGLSurface r1 = r1.minecraftSurface     // Catch: java.lang.Throwable -> L5d
            r1.setSurfaceReadyListener(r4)     // Catch: java.lang.Throwable -> L5d
            r1.setOnRenderingStartedListener(r4)     // Catch: java.lang.Throwable -> L5d
        L5d:
            ca.dnamobile.javalauncher.modcompat.ControlifySDL.reset()
            ca.dnamobile.javalauncher.modcompat.ControllerModCompat.reset()
            ca.dnamobile.javalauncher.launcher.LaunchGame.resetLaunchState()
            android.content.Intent r4 = new android.content.Intent     // Catch: java.lang.Throwable -> L76
            java.lang.Class<ca.dnamobile.javalauncher.launcher.JavaLaunch> r1 = ca.dnamobile.javalauncher.launcher.JavaLaunch.class
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L76
            r1 = 872415232(0x34000000, float:1.1920929E-7)
            r4.addFlags(r1)     // Catch: java.lang.Throwable -> L76
            r3.startActivity(r4)     // Catch: java.lang.Throwable -> L76
            goto L7c
        L76:
            r4 = move-exception
            java.lang.String r1 = "Failed to reopen launcher after force close"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r1, r4)
        L7c:
            r3.finishAndRemoveTask()
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r4.<init>(r0)
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda23 r0 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda23
            r0.<init>()
            r1 = 250(0xfa, double:1.235E-321)
            r4.postDelayed(r0, r1)
            return
    }

    private static java.lang.String friendlyThrowableMessage(java.lang.Throwable r2) {
            if (r2 != 0) goto L5
            java.lang.String r2 = "Unknown error"
            return r2
        L5:
            java.lang.String r0 = r2.getMessage()
            boolean r1 = isNullOrBlank(r0)
            if (r1 != 0) goto L16
            r2 = 700(0x2bc, float:9.81E-43)
            java.lang.String r2 = trimForDialog(r0, r2)
            return r2
        L16:
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getSimpleName()
            return r2
    }

    private ca.dnamobile.javalauncher.data.AccountStore getAccountStoreForPreflight() {
            r3 = this;
            ca.dnamobile.javalauncher.data.AccountStore r0 = r3.accountStore
            if (r0 == 0) goto L5
            return r0
        L5:
            ca.dnamobile.javalauncher.data.AccountStore r0 = new ca.dnamobile.javalauncher.data.AccountStore     // Catch: java.lang.Throwable -> Ld
            r0.<init>(r3)     // Catch: java.lang.Throwable -> Ld
            r3.accountStore = r0     // Catch: java.lang.Throwable -> Ld
            return r0
        Ld:
            r0 = move-exception
            java.lang.String r1 = "GameActivity"
            java.lang.String r2 = "Unable to create AccountStore for preflight"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r2, r0)
            r0 = 0
            return r0
    }

    private java.io.File getReadableLatestLogFile() {
            r3 = this;
            java.io.File r0 = net.kdt.pojavlaunch.Logger.getCurrentLogFile()
            if (r0 == 0) goto Ld
            boolean r1 = r0.isFile()
            if (r1 == 0) goto Ld
            return r0
        Ld:
            java.io.File r0 = ca.dnamobile.javalauncher.logs.LauncherLogManager.getLatestLogFile(r3)     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.isFile()     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L20
            return r0
        L18:
            r0 = move-exception
            java.lang.String r1 = "GameActivity"
            java.lang.String r2 = "Failed to resolve latestlog.txt"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r2, r0)
        L20:
            r0 = 0
            return r0
    }

    private boolean handleInGameControlsBackShortcut(android.view.KeyEvent r3) {
            r2 = this;
            boolean r0 = r2.isInGameControlsBackShortcut(r3)
            if (r0 != 0) goto L8
            r3 = 0
            return r3
        L8:
            int r0 = r3.getAction()
            r1 = 1
            if (r0 != r1) goto L18
            boolean r3 = r3.isCanceled()
            if (r3 != 0) goto L18
            r2.openGamepadMappingDialogFromBackShortcut()
        L18:
            return r1
    }

    private java.lang.String inferPojavExecEgl(ca.dnamobile.javalauncher.renderer.RendererInterface r3) {
            r2 = this;
            java.lang.String r0 = r2.rendererIdentity(r3)
            boolean r1 = r2.isLtwRenderer(r3)
            if (r1 == 0) goto Ld
            java.lang.String r3 = "libltw.so"
            return r3
        Ld:
            boolean r1 = r2.isMobileGluesRenderer(r3)
            if (r1 == 0) goto L16
            java.lang.String r3 = "libmobileglues.so"
            return r3
        L16:
            java.lang.String r1 = "gl4es"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L74
            java.lang.String r1 = "opengles"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L74
            java.lang.String r1 = "krypton"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L74
            java.lang.String r1 = "ng_gl4es"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L37
            goto L74
        L37:
            java.lang.String r1 = "osmesa"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L6b
            java.lang.String r1 = "zink"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L6b
            java.lang.String r1 = "mesa"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L6b
            java.lang.String r1 = "virgl"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L6b
            java.lang.String r1 = "freedreno"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L6b
            java.lang.String r1 = "panfrost"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L68
            goto L6b
        L68:
            java.lang.String r3 = ""
            return r3
        L6b:
            java.lang.String r3 = r3.getRendererLibrary()
            java.lang.String r3 = r2.sanitizeLibraryName(r3)
            return r3
        L74:
            java.lang.String r3 = "libEGL.so"
            return r3
    }

    private void installCursorOverlay() {
            r5 = this;
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r5.binding
            android.widget.FrameLayout r0 = r0.getRoot()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 != 0) goto Lb
            return
        Lb:
            ca.dnamobile.javalauncher.input.GameCursorOverlay r1 = new ca.dnamobile.javalauncher.input.GameCursorOverlay
            r1.<init>(r5)
            r5.gameCursorOverlay = r1
            r2 = r0
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r4 = -1
            r3.<init>(r4, r4)
            r2.addView(r1, r3)
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda34 r1 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda34
            r1.<init>(r0)
            r0.post(r1)
            return
    }

    private void installTouchControlsOverlay() {
            r4 = this;
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r4.binding
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.FrameLayout r0 = r0.getRoot()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 != 0) goto Le
            return
        Le:
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay r1 = new ca.dnamobile.javalauncher.controls.TouchControlsOverlay
            r1.<init>(r4)
            r4.touchControlsOverlay = r1
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda15 r2 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda15
            r2.<init>(r4)
            r1.setAppMenuListener(r2)
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay r1 = r4.touchControlsOverlay
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r2 = r4.binding
            net.kdt.pojavlaunch.MinecraftGLSurface r2 = r2.minecraftSurface
            r1.setPassthroughTarget(r2)
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay r1 = r4.touchControlsOverlay
            r1.loadSelectedLayout()
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay r1 = r4.touchControlsOverlay
            boolean r2 = ca.dnamobile.javalauncher.controls.ControlsPreferences.isTouchControlsEnabled(r4)
            r1.setControlsVisible(r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay r1 = r4.touchControlsOverlay
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r3 = -1
            r2.<init>(r3, r3)
            r0.addView(r1, r2)
            return
    }

    private boolean isCurrentLaunchDirectoryForPreflight(java.io.File r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r3.versionId
            java.lang.String r1 = r3.normalizeReplayPreflightName(r1)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L11
            return r0
        L11:
            java.lang.String r4 = r4.getAbsolutePath()
            java.lang.String r4 = r3.normalizeReplayPreflightName(r4)
            boolean r4 = r4.contains(r1)
            return r4
    }

    private static boolean isGamepadKeyEvent(android.view.KeyEvent r4) {
            int r0 = r4.getDeviceId()
            r1 = 0
            if (r0 >= 0) goto L8
            return r1
        L8:
            int r4 = r4.getSource()
            r2 = r4 & 1025(0x401, float:1.436E-42)
            r3 = 1025(0x401, float:1.436E-42)
            if (r2 == r3) goto L1e
            r2 = 16777232(0x1000010, float:2.3509932E-38)
            r4 = r4 & r2
            if (r4 == r2) goto L1e
            boolean r4 = org.libsdl.app.SDLControllerManager.isDeviceSDLJoystick(r0)
            if (r4 == 0) goto L1f
        L1e:
            r1 = 1
        L1f:
            return r1
    }

    private static boolean isGamepadMotionEvent(android.view.MotionEvent r2) {
            int r2 = r2.getSource()
            r0 = 16777232(0x1000010, float:2.3509932E-38)
            r1 = r2 & r0
            if (r1 == r0) goto L13
            r0 = 1025(0x401, float:1.436E-42)
            r2 = r2 & r0
            if (r2 != r0) goto L11
            goto L13
        L11:
            r2 = 0
            goto L14
        L13:
            r2 = 1
        L14:
            return r2
    }

    private boolean isInGameControlsBackShortcut(android.view.KeyEvent r5) {
            r4 = this;
            int r0 = r5.getKeyCode()
            r1 = 4
            r2 = 1
            if (r0 != r1) goto L9
            return r2
        L9:
            boolean r1 = ca.dnamobile.javalauncher.controls.ControlsPreferences.isTouchControlsEnabled(r4)
            r3 = 0
            if (r1 != 0) goto L28
            boolean r1 = ca.dnamobile.javalauncher.settings.LauncherPreferences.isShowInGameSettingsButton(r4)
            if (r1 == 0) goto L17
            goto L28
        L17:
            boolean r5 = isGamepadKeyEvent(r5)
            if (r5 == 0) goto L28
            r5 = 109(0x6d, float:1.53E-43)
            if (r0 == r5) goto L27
            r5 = 82
            if (r0 != r5) goto L26
            goto L27
        L26:
            r2 = r3
        L27:
            return r2
        L28:
            return r3
    }

    private boolean isLegacy4JGlfwFallbackLikelyActive() {
            r8 = this;
            boolean r0 = r8.legacy4jGlfwFallbackAllowed
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.String r0 = r8.versionId
            if (r0 != 0) goto Ld
            java.lang.String r0 = ""
            goto L13
        Ld:
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r2)
        L13:
            java.lang.String r2 = "legacy4j"
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L93
            java.lang.String r2 = "legacy"
            boolean r3 = r0.equals(r2)
            if (r3 != 0) goto L93
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L2a
            goto L93
        L2a:
            long r2 = android.os.SystemClock.uptimeMillis()
            long r4 = r8.lastLegacy4jFallbackProbeMs
            long r4 = r2 - r4
            r6 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r4 = 0
            if (r0 >= 0) goto L3a
            return r4
        L3a:
            r8.lastLegacy4jFallbackProbeMs = r2
            java.io.File r0 = r8.getReadableLatestLogFile()     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L89
            boolean r2 = r0.isFile()     // Catch: java.lang.Throwable -> L8a
            if (r2 != 0) goto L49
            goto L89
        L49:
            r2 = 98304(0x18000, float:1.37753E-40)
            java.lang.String r0 = r8.readLogTail(r0, r2)     // Catch: java.lang.Throwable -> L8a
            java.util.Locale r2 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L8a
            java.lang.String r0 = r0.toLowerCase(r2)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = "controllermodcompat: legacy4j detected"
            boolean r2 = r0.contains(r2)     // Catch: java.lang.Throwable -> L8a
            if (r2 != 0) goto L86
            java.lang.String r2 = "sdl3 (isxander's libsdl4j)"
            boolean r2 = r0.contains(r2)     // Catch: java.lang.Throwable -> L8a
            if (r2 != 0) goto L86
            java.lang.String r2 = "glfw will be used instead"
            boolean r2 = r0.contains(r2)     // Catch: java.lang.Throwable -> L8a
            if (r2 != 0) goto L86
            java.lang.String r2 = "\n\t- legacy "
            boolean r2 = r0.contains(r2)     // Catch: java.lang.Throwable -> L8a
            if (r2 != 0) goto L86
            java.lang.String r2 = "\n- legacy "
            boolean r2 = r0.contains(r2)     // Catch: java.lang.Throwable -> L8a
            if (r2 != 0) goto L86
            java.lang.String r2 = " legacy 1."
            boolean r0 = r0.contains(r2)     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L92
        L86:
            r8.legacy4jGlfwFallbackAllowed = r1     // Catch: java.lang.Throwable -> L8a
            return r1
        L89:
            return r4
        L8a:
            r0 = move-exception
            java.lang.String r1 = "GameActivity"
            java.lang.String r2 = "Unable to inspect Legacy4J controller fallback status"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r2, r0)
        L92:
            return r4
        L93:
            r8.legacy4jGlfwFallbackAllowed = r1
            return r1
    }

    private boolean isLtwRenderer(ca.dnamobile.javalauncher.renderer.RendererInterface r2) {
            r1 = this;
            java.lang.String r2 = r1.rendererIdentity(r2)
            java.lang.String r0 = "ltw"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L17
            java.lang.String r0 = "libltw.so"
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L15
            goto L17
        L15:
            r2 = 0
            goto L18
        L17:
            r2 = 1
        L18:
            return r2
    }

    private boolean isMinecraft26_2OrNewer(java.lang.String r2) {
            r1 = this;
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r0)
            java.lang.String r2 = r2.trim()
            java.lang.String r0 = "^26\\.(2|[3-9]|[0-9]{2,}).*"
            boolean r2 = r2.matches(r0)
            return r2
    }

    private boolean isMobileGluesRenderer(ca.dnamobile.javalauncher.renderer.RendererInterface r2) {
            r1 = this;
            java.lang.String r2 = r1.rendererIdentity(r2)
            java.lang.String r0 = "mobileglues"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L1f
            java.lang.String r0 = "mobile glues"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L1f
            java.lang.String r0 = "com.fcl.plugin.mobileglues"
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L1d
            goto L1f
        L1d:
            r2 = 0
            goto L20
        L1f:
            r2 = 1
        L20:
            return r2
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

    private static boolean isProbablyKeyboardBackEvent(android.view.KeyEvent r6) {
            int r0 = r6.getKeyCode()
            r1 = 4
            r2 = 0
            if (r0 == r1) goto L9
            return r2
        L9:
            int r0 = r6.getFlags()
            r0 = r0 & 2
            if (r0 == 0) goto L12
            return r2
        L12:
            android.view.InputDevice r0 = r6.getDevice()     // Catch: java.lang.Throwable -> L17
            goto L18
        L17:
            r0 = 0
        L18:
            int r1 = r6.getSource()
            int r6 = r6.getScanCode()     // Catch: java.lang.Throwable -> L21
            goto L22
        L21:
            r6 = r2
        L22:
            r3 = r1 & 257(0x101, float:3.6E-43)
            r4 = 257(0x101, float:3.6E-43)
            r5 = 1
            if (r3 != r4) goto L2b
            r3 = r5
            goto L2c
        L2b:
            r3 = r2
        L2c:
            r4 = 513(0x201, float:7.19E-43)
            r1 = r1 & r4
            if (r1 != r4) goto L33
            r1 = r5
            goto L34
        L33:
            r1 = r2
        L34:
            if (r0 == 0) goto L3e
            int r0 = r0.getKeyboardType()
            if (r0 == 0) goto L3e
            r0 = r5
            goto L3f
        L3e:
            r0 = r2
        L3f:
            if (r6 == 0) goto L43
            r4 = r5
            goto L44
        L43:
            r4 = r2
        L44:
            if (r6 != r5) goto L48
            r6 = r5
            goto L49
        L48:
            r6 = r2
        L49:
            if (r3 != 0) goto L53
            if (r0 != 0) goto L53
            if (r6 != 0) goto L53
            if (r1 == 0) goto L54
            if (r4 == 0) goto L54
        L53:
            r2 = r5
        L54:
            return r2
    }

    static /* synthetic */ void lambda$buildInGameDialogAction$17(java.lang.Runnable r0, android.view.View r1) {
            r0.run()
            return
    }

    private /* synthetic */ boolean lambda$buildInGameDialogAction$18(android.view.View r4, android.view.MotionEvent r5) {
            r3 = this;
            int r0 = r5.getAction()
            r1 = 18
            if (r0 != 0) goto L14
            int r5 = ca.dnamobile.javalauncher.GameActivity.COLOR_CARD_BG_PRESSED
            int r0 = ca.dnamobile.javalauncher.GameActivity.COLOR_CARD_STROKE
            android.graphics.drawable.GradientDrawable r5 = r3.roundedDrawable(r5, r0, r1)
            r4.setBackground(r5)
            goto L2d
        L14:
            int r0 = r5.getAction()
            r2 = 1
            if (r0 == r2) goto L22
            int r5 = r5.getAction()
            r0 = 3
            if (r5 != r0) goto L2d
        L22:
            int r5 = ca.dnamobile.javalauncher.GameActivity.COLOR_CARD_BG
            int r0 = ca.dnamobile.javalauncher.GameActivity.COLOR_CARD_STROKE
            android.graphics.drawable.GradientDrawable r5 = r3.roundedDrawable(r5, r0, r1)
            r4.setBackground(r5)
        L2d:
            r4 = 0
            return r4
    }

    private /* synthetic */ void lambda$configureInGameSettingsButton$6(android.view.View r1) {
            r0 = this;
            r0.openInGameButtonOverlay()
            return
    }

    private /* synthetic */ void lambda$configureLogOverlay$5(android.view.View r4) {
            r3 = this;
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r3.binding
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 420(0x1a4, float:5.89E-43)
            int r0 = r3.dpToPx(r0)
            r1 = 260(0x104, float:3.64E-43)
            int r1 = r3.dpToPx(r1)
            int r4 = r4.getWidth()
            float r4 = (float) r4
            r2 = 1052938076(0x3ec28f5c, float:0.38)
            float r4 = r4 * r2
            int r4 = (int) r4
            int r4 = java.lang.Math.max(r1, r4)
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r1 = r3.binding
            android.widget.LinearLayout r1 = r1.layoutLogOverlay
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            int r4 = java.lang.Math.min(r0, r4)
            r1.width = r4
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r4 = r3.binding
            android.widget.LinearLayout r4 = r4.layoutLogOverlay
            r4.setLayoutParams(r1)
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r4 = r3.binding
            android.widget.LinearLayout r4 = r4.layoutLogOverlay
            r4.bringToFront()
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r4 = r3.binding
            android.widget.ImageButton r4 = r4.buttonGameSettings
            int r4 = r4.getVisibility()
            if (r4 != 0) goto L4c
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r4 = r3.binding
            android.widget.ImageButton r4 = r4.buttonGameSettings
            r4.bringToFront()
        L4c:
            return
    }

    private /* synthetic */ void lambda$forceCloseGameAndReturnToLauncher$22() {
            r1 = this;
            java.lang.String r0 = "Force closing Minecraft..."
            r1.appendStatus(r0)
            return
    }

    static /* synthetic */ void lambda$forceCloseGameAndReturnToLauncher$23() {
            java.lang.String r0 = "ForceClose: killing game process."
            ca.dnamobile.javalauncher.logs.LauncherLogManager.append(r0)
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
            return
    }

    static /* synthetic */ void lambda$installCursorOverlay$4(android.view.View r3) {
            int r0 = org.lwjgl.glfw.CallbackBridge.windowWidth
            r1 = 1
            if (r0 > r1) goto Lf
            int r0 = r3.getWidth()
            int r0 = java.lang.Math.max(r1, r0)
            org.lwjgl.glfw.CallbackBridge.windowWidth = r0
        Lf:
            int r0 = org.lwjgl.glfw.CallbackBridge.windowHeight
            if (r0 > r1) goto L1d
            int r0 = r3.getHeight()
            int r0 = java.lang.Math.max(r1, r0)
            org.lwjgl.glfw.CallbackBridge.windowHeight = r0
        L1d:
            int r0 = org.lwjgl.glfw.CallbackBridge.physicalWidth
            if (r0 > r1) goto L2b
            int r0 = r3.getWidth()
            int r0 = java.lang.Math.max(r1, r0)
            org.lwjgl.glfw.CallbackBridge.physicalWidth = r0
        L2b:
            int r0 = org.lwjgl.glfw.CallbackBridge.physicalHeight
            if (r0 > r1) goto L39
            int r3 = r3.getHeight()
            int r3 = java.lang.Math.max(r1, r3)
            org.lwjgl.glfw.CallbackBridge.physicalHeight = r3
        L39:
            org.lwjgl.glfw.CallbackBridge.setInputReady(r1)
            org.lwjgl.glfw.CallbackBridge.ensureInputFocus()
            float r3 = org.lwjgl.glfw.CallbackBridge.mouseX
            r0 = 0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto L61
            float r3 = org.lwjgl.glfw.CallbackBridge.mouseY
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto L61
            int r3 = org.lwjgl.glfw.CallbackBridge.windowWidth
            int r3 = java.lang.Math.max(r1, r3)
            float r3 = (float) r3
            r0 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r0
            int r2 = org.lwjgl.glfw.CallbackBridge.windowHeight
            int r1 = java.lang.Math.max(r1, r2)
            float r1 = (float) r1
            float r1 = r1 / r0
            org.lwjgl.glfw.CallbackBridge.sendCursorPos(r3, r1)
        L61:
            return
    }

    private /* synthetic */ void lambda$onCreate$0() {
            r1 = this;
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda47 r0 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda47
            r0.<init>(r1)
            r1.runOnUiThread(r0)
            return
    }

    private /* synthetic */ void lambda$onCreate$1() {
            r2 = this;
            r0 = 1
            org.lwjgl.glfw.CallbackBridge.setInputReady(r0)
            org.lwjgl.glfw.CallbackBridge.ensureInputFocus()
            int r0 = ca.dnamobile.javalauncher.R.string.game_status_rendering
            java.lang.String r0 = r2.getString(r0)
            r2.appendStatus(r0)
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r2.binding
            android.widget.TextView r0 = r0.textStatus
            r1 = 8
            r0.setVisibility(r1)
            return
    }

    private /* synthetic */ void lambda$onCreate$2() {
            r1 = this;
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda43 r0 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda43
            r0.<init>(r1)
            r1.runOnUiThread(r0)
            return
    }

    private /* synthetic */ void lambda$openGamepadMappingDialogFromBackShortcut$15() {
            r0 = this;
            r0.applyInGameOverlayPreferences()
            r0.reloadTouchControlsLayout()
            return
    }

    private /* synthetic */ void lambda$openGamepadMappingDialogFromBackShortcut$16() {
            r1 = this;
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda42 r0 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda42
            r0.<init>(r1)
            r1.runOnUiThread(r0)
            return
    }

    private /* synthetic */ void lambda$openInGameButtonOverlay$10(android.app.AlertDialog[] r2) {
            r1 = this;
            r0 = 0
            r2 = r2[r0]
            r1.dismissDialog(r2)
            boolean r2 = ca.dnamobile.javalauncher.controls.ControlsPreferences.isTouchControlsEnabled(r1)
            r2 = r2 ^ 1
            ca.dnamobile.javalauncher.controls.ControlsPreferences.setTouchControlsEnabled(r1, r2)
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay r0 = r1.touchControlsOverlay
            if (r0 == 0) goto L1b
            r0.setControlsVisible(r2)
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay r2 = r1.touchControlsOverlay
            r2.bringToFront()
        L1b:
            r1.applyInGameOverlayPreferences()
            return
    }

    private /* synthetic */ void lambda$openInGameButtonOverlay$11(android.app.AlertDialog[] r2) {
            r1 = this;
            r0 = 0
            r2 = r2[r0]
            r1.dismissDialog(r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<ca.dnamobile.javalauncher.controls.ControlsEditorActivity> r0 = ca.dnamobile.javalauncher.controls.ControlsEditorActivity.class
            r2.<init>(r1, r0)
            r1.startActivity(r2)
            return
    }

    private /* synthetic */ void lambda$openInGameButtonOverlay$12(android.app.AlertDialog[] r2) {
            r1 = this;
            r0 = 0
            r2 = r2[r0]
            r1.dismissDialog(r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<ca.dnamobile.javalauncher.controls.ControlsActivity> r0 = ca.dnamobile.javalauncher.controls.ControlsActivity.class
            r2.<init>(r1, r0)
            r1.startActivity(r2)
            return
    }

    private /* synthetic */ void lambda$openInGameButtonOverlay$13(android.app.AlertDialog[] r2) {
            r1 = this;
            r0 = 0
            r2 = r2[r0]
            r1.dismissDialog(r2)
            r1.showForceCloseGameDialog()
            return
    }

    private /* synthetic */ void lambda$openInGameButtonOverlay$14(android.app.AlertDialog r1, android.content.DialogInterface r2) {
            r0 = this;
            android.app.AlertDialog r2 = r0.inGameControlsDialog
            if (r2 != r1) goto L7
            r1 = 0
            r0.inGameControlsDialog = r1
        L7:
            r0.configureWindow()
            return
    }

    private /* synthetic */ void lambda$openInGameButtonOverlay$7() {
            r0 = this;
            r0.applyInGameOverlayPreferences()
            r0.reloadTouchControlsLayout()
            return
    }

    private /* synthetic */ void lambda$openInGameButtonOverlay$8() {
            r1 = this;
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda45 r0 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda45
            r0.<init>(r1)
            r1.runOnUiThread(r0)
            return
    }

    private /* synthetic */ void lambda$openInGameButtonOverlay$9(android.app.AlertDialog[] r2) {
            r1 = this;
            r0 = 0
            r2 = r2[r0]
            r1.dismissDialog(r2)
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda1 r2 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda1
            r2.<init>(r1)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog.show(r1, r2)
            return
    }

    private /* synthetic */ void lambda$refreshLogOverlay$24() {
            r2 = this;
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r2.binding
            if (r0 == 0) goto Lb
            android.widget.ScrollView r0 = r0.scrollLogOverlay
            r1 = 130(0x82, float:1.82E-43)
            r0.fullScroll(r1)
        Lb:
            return
    }

    private /* synthetic */ void lambda$runTokenValidationAfterRefreshFailure$33(ca.dnamobile.javalauncher.GameActivity.PreLaunchMicrosoftSessionResult r1) {
            r0 = this;
            r0.finishMicrosoftAccountSessionPreflight(r1)
            return
    }

    private /* synthetic */ void lambda$runTokenValidationAfterRefreshFailure$34(java.lang.String r4) {
            r3 = this;
            ca.dnamobile.javalauncher.data.AccountStore r0 = r3.getAccountStoreForPreflight()     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto Lb
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r0.load()     // Catch: java.lang.Throwable -> L55
            goto Lc
        Lb:
            r0 = 0
        Lc:
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r3.resolveMicrosoftAccountForPreflight(r0)     // Catch: java.lang.Throwable -> L55
            ca.dnamobile.javalauncher.GameActivity$PreLaunchMicrosoftSessionResult r1 = r3.checkMicrosoftAccountSession(r0)     // Catch: java.lang.Throwable -> L55
            boolean r2 = r1.ok     // Catch: java.lang.Throwable -> L55
            if (r2 == 0) goto L32
            if (r0 == 0) goto L32
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r0.<init>()     // Catch: java.lang.Throwable -> L55
            java.lang.StringBuilder r0 = r0.append(r4)     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = "\n\nThe saved Minecraft session still verified successfully, so launch can continue."
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L55
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L55
            ca.dnamobile.javalauncher.GameActivity$PreLaunchMicrosoftSessionResult r1 = ca.dnamobile.javalauncher.GameActivity.PreLaunchMicrosoftSessionResult.ok(r0)     // Catch: java.lang.Throwable -> L55
            goto L75
        L32:
            boolean r0 = r1.ok     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L37
            goto L75
        L37:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r0.<init>()     // Catch: java.lang.Throwable -> L55
            java.lang.StringBuilder r0 = r0.append(r4)     // Catch: java.lang.Throwable -> L55
            java.lang.String r2 = "\n\n"
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = r1.message     // Catch: java.lang.Throwable -> L55
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L55
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L55
            ca.dnamobile.javalauncher.GameActivity$PreLaunchMicrosoftSessionResult r1 = ca.dnamobile.javalauncher.GameActivity.PreLaunchMicrosoftSessionResult.warning(r0)     // Catch: java.lang.Throwable -> L55
            goto L75
        L55:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = "\n\nDroidBridge could not check the saved Microsoft session: "
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r0 = friendlyThrowableMessage(r0)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            ca.dnamobile.javalauncher.GameActivity$PreLaunchMicrosoftSessionResult r1 = ca.dnamobile.javalauncher.GameActivity.PreLaunchMicrosoftSessionResult.warning(r4)
        L75:
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda20 r4 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda20
            r4.<init>(r3, r1)
            r3.runOnUiThread(r4)
            return
    }

    private /* synthetic */ void lambda$scheduleForcedGameProcessExit$25() {
            r1 = this;
            java.lang.String r0 = "Minecraft quit detected; closing game process..."
            r1.appendStatus(r0)
            r1.configureWindow()
            return
    }

    private /* synthetic */ void lambda$scheduleForcedGameProcessExit$26() {
            r1 = this;
            boolean r0 = r1.exiting
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.String r0 = "QuitWatchdog: forcing GameActivity/game process exit."
            ca.dnamobile.javalauncher.logs.LauncherLogManager.append(r0)
            java.lang.String r0 = r1.versionId
            ca.dnamobile.javalauncher.logs.LauncherLogManager.preserveLatestLogIfEnabled(r1, r0)
            r0 = 1
            r1.exiting = r0
            r1.finishAndRemoveTask()
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
            return
    }

    private /* synthetic */ void lambda$scheduleMinecraftSurfaceRefresh$3() {
            r1 = this;
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r1.binding
            if (r0 == 0) goto L25
            net.kdt.pojavlaunch.MinecraftGLSurface r0 = r0.minecraftSurface
            if (r0 == 0) goto L25
            boolean r0 = r1.exiting
            if (r0 == 0) goto Ld
            goto L25
        Ld:
            r1.applyGameDisplaySurfaceOptions()
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r1.binding
            net.kdt.pojavlaunch.MinecraftGLSurface r0 = r0.minecraftSurface
            r0.refreshSize()
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r1.binding
            net.kdt.pojavlaunch.MinecraftGLSurface r0 = r0.minecraftSurface
            r0.requestLayout()
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r1.binding
            net.kdt.pojavlaunch.MinecraftGLSurface r0 = r0.minecraftSurface
            r0.invalidate()
        L25:
            return
    }

    private /* synthetic */ void lambda$shouldPauseLaunchForReplayModFfmpegWarning$40(ca.dnamobile.javalauncher.GameActivity.ReplayModFfmpegPreflight r1) {
            r0 = this;
            r0.showReplayModFfmpegMissingDialog(r1)
            return
    }

    private /* synthetic */ void lambda$showForceCloseGameDialog$19(android.app.AlertDialog r1, android.view.View r2) {
            r0 = this;
            r1.dismiss()
            java.lang.String r1 = "User requested force close from in-game controls"
            r0.forceCloseGameAndReturnToLauncher(r1)
            return
    }

    private /* synthetic */ void lambda$showForceCloseGameDialog$20(android.app.AlertDialog r3, android.content.DialogInterface r4) {
            r2 = this;
            r4 = -2
            android.widget.Button r4 = r3.getButton(r4)
            int r0 = ca.dnamobile.javalauncher.GameActivity.COLOR_ACCENT
            r4.setTextColor(r0)
            r4 = -1
            android.widget.Button r0 = r3.getButton(r4)
            int r1 = ca.dnamobile.javalauncher.GameActivity.COLOR_DANGER
            r0.setTextColor(r1)
            android.widget.Button r4 = r3.getButton(r4)
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda51 r0 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda51
            r0.<init>(r2, r3)
            r4.setOnClickListener(r0)
            return
    }

    private /* synthetic */ void lambda$showForceCloseGameDialog$21(android.content.DialogInterface r1) {
            r0 = this;
            r0.configureWindow()
            return
    }

    private /* synthetic */ void lambda$showMicrosoftAccountPreflightWarningDialog$35(android.app.AlertDialog r1, android.view.View r2) {
            r0 = this;
            r2 = 0
            r0.microsoftAccountPreflightPending = r2
            r0.microsoftAccountPreflightCompleted = r2
            r0.microsoftAccountPreflightAcceptedAfterWarning = r2
            java.lang.String r2 = "Launch canceled so the Microsoft account can be refreshed first."
            r0.appendStatus(r2)
            r1.dismiss()
            r0.configureWindow()
            return
    }

    private /* synthetic */ void lambda$showMicrosoftAccountPreflightWarningDialog$36(android.app.AlertDialog r1, android.view.View r2) {
            r0 = this;
            r1.dismiss()
            r0.openAccountSettingsAfterMicrosoftPreflightWarning()
            return
    }

    private /* synthetic */ void lambda$showMicrosoftAccountPreflightWarningDialog$37(android.app.AlertDialog r1, android.view.View r2) {
            r0 = this;
            r2 = 1
            r0.microsoftAccountPreflightAcceptedAfterWarning = r2
            r0.microsoftAccountPreflightCompleted = r2
            java.lang.String r2 = "Continuing launch with the saved Microsoft session."
            r0.appendStatus(r2)
            r1.dismiss()
            r0.continueLaunchAfterMicrosoftAccountPreflight()
            return
    }

    private /* synthetic */ void lambda$showMicrosoftAccountPreflightWarningDialog$38(android.app.AlertDialog r2, android.content.DialogInterface r3) {
            r1 = this;
            r1.styleDarkDialog(r2)
            r3 = -2
            android.widget.Button r3 = r2.getButton(r3)
            if (r3 == 0) goto L17
            int r0 = ca.dnamobile.javalauncher.GameActivity.COLOR_DANGER
            r3.setTextColor(r0)
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda5 r0 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda5
            r0.<init>(r1, r2)
            r3.setOnClickListener(r0)
        L17:
            r3 = -3
            android.widget.Button r3 = r2.getButton(r3)
            if (r3 == 0) goto L2b
            int r0 = ca.dnamobile.javalauncher.GameActivity.COLOR_ACCENT
            r3.setTextColor(r0)
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda6 r0 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda6
            r0.<init>(r1, r2)
            r3.setOnClickListener(r0)
        L2b:
            r3 = -1
            android.widget.Button r3 = r2.getButton(r3)
            if (r3 == 0) goto L3f
            int r0 = ca.dnamobile.javalauncher.GameActivity.COLOR_ACCENT
            r3.setTextColor(r0)
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda7 r0 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda7
            r0.<init>(r1, r2)
            r3.setOnClickListener(r0)
        L3f:
            return
    }

    private /* synthetic */ void lambda$showMicrosoftAccountPreflightWarningDialog$39(android.content.DialogInterface r1) {
            r0 = this;
            r0.configureWindow()
            return
    }

    private /* synthetic */ void lambda$showReplayModFfmpegMissingDialog$41(android.app.AlertDialog r1, android.view.View r2) {
            r0 = this;
            r2 = 1
            r0.replayModFfmpegWarningAccepted = r2
            r2 = 0
            r0.replayModFfmpegWarningPending = r2
            r1.dismiss()
            r0.startLaunchAfterReplayModFfmpegWarning()
            return
    }

    private /* synthetic */ void lambda$showReplayModFfmpegMissingDialog$42(android.view.View r1) {
            r0 = this;
            r0.openReplayModFfmpegInfoUrl()
            return
    }

    private /* synthetic */ void lambda$showReplayModFfmpegMissingDialog$43(android.app.AlertDialog r1, android.view.View r2) {
            r0 = this;
            r2 = 0
            r0.replayModFfmpegWarningPending = r2
            r2 = 1
            r0.exiting = r2
            r1.dismiss()
            r0.finish()
            return
    }

    private /* synthetic */ void lambda$showReplayModFfmpegMissingDialog$44(android.app.AlertDialog r2, android.content.DialogInterface r3) {
            r1 = this;
            r1.styleDarkDialog(r2)
            r3 = -1
            android.widget.Button r3 = r2.getButton(r3)
            if (r3 == 0) goto L17
            int r0 = ca.dnamobile.javalauncher.GameActivity.COLOR_ACCENT
            r3.setTextColor(r0)
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda17 r0 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda17
            r0.<init>(r1, r2)
            r3.setOnClickListener(r0)
        L17:
            r3 = -3
            android.widget.Button r3 = r2.getButton(r3)
            if (r3 == 0) goto L2b
            int r0 = ca.dnamobile.javalauncher.GameActivity.COLOR_ACCENT
            r3.setTextColor(r0)
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda18 r0 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda18
            r0.<init>(r1)
            r3.setOnClickListener(r0)
        L2b:
            r3 = -2
            android.widget.Button r3 = r2.getButton(r3)
            if (r3 == 0) goto L3f
            int r0 = ca.dnamobile.javalauncher.GameActivity.COLOR_DANGER
            r3.setTextColor(r0)
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda19 r0 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda19
            r0.<init>(r1, r2)
            r3.setOnClickListener(r0)
        L3f:
            return
    }

    private /* synthetic */ void lambda$showReplayModFfmpegMissingDialog$45(android.content.DialogInterface r1) {
            r0 = this;
            r0.configureWindow()
            return
    }

    private /* synthetic */ void lambda$startLaunchOnce$27() {
            r1 = this;
            int r0 = ca.dnamobile.javalauncher.R.string.game_status_surface_ready
            java.lang.String r0 = r1.getString(r0)
            r1.appendStatus(r0)
            return
    }

    private /* synthetic */ void lambda$startLaunchOnce$28() {
            r1 = this;
            int r0 = ca.dnamobile.javalauncher.R.string.game_status_starting_minecraft
            java.lang.String r0 = r1.getString(r0)
            r1.appendStatus(r0)
            return
    }

    private /* synthetic */ void lambda$startLaunchOnce$29(java.lang.String r1) {
            r0 = this;
            r0.appendStatus(r1)
            return
    }

    private /* synthetic */ void lambda$startLaunchOnce$30(java.lang.String r2) {
            r1 = this;
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda12 r0 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda12
            r0.<init>(r1, r2)
            r1.runOnUiThread(r0)
            return
    }

    private /* synthetic */ void lambda$startLaunchOnce$31(int r2) {
            r1 = this;
            int r0 = ca.dnamobile.javalauncher.R.string.msg_launch_finished
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r2 = r1.getString(r0, r2)
            r1.appendStatus(r2)
            r1.finishAfterExit()
            return
    }

    private /* synthetic */ void lambda$startLaunchOnce$32(java.lang.Throwable r3) {
            r2 = this;
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r2.binding
            android.widget.TextView r0 = r0.textStatus
            r1 = 0
            r0.setVisibility(r1)
            int r0 = ca.dnamobile.javalauncher.R.string.msg_launch_failed
            java.lang.String r1 = r3.getMessage()
            if (r1 == 0) goto L15
            java.lang.String r3 = r3.getMessage()
            goto L1d
        L15:
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getSimpleName()
        L1d:
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r3 = r2.getString(r0, r3)
            r2.appendStatus(r3)
            return
    }

    private java.lang.String normalizeReplayPreflightName(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = ""
            if (r3 != 0) goto L5
            return r0
        L5:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r1)
            java.lang.String r1 = "[^a-z0-9]+"
            java.lang.String r3 = r3.replaceAll(r1, r0)
            return r3
    }

    private void openAccountSettingsAfterMicrosoftPreflightWarning() {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L16
            java.lang.Class<ca.dnamobile.javalauncher.LauncherSettingsActivity> r1 = ca.dnamobile.javalauncher.LauncherSettingsActivity.class
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L16
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r0.addFlags(r1)     // Catch: java.lang.Throwable -> L16
            r3.startActivity(r0)     // Catch: java.lang.Throwable -> L16
            r0 = 1
            r3.exiting = r0
            r3.finish()
            return
        L16:
            r0 = move-exception
            java.lang.String r1 = "GameActivity"
            java.lang.String r2 = "Unable to open launcher settings after account preflight warning"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r2, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to open Settings: "
            r1.<init>(r2)
            java.lang.String r0 = friendlyThrowableMessage(r0)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r3.appendStatus(r0)
            r3.configureWindow()
            return
    }

    private void openGamepadMappingDialogFromBackShortcut() {
            r1 = this;
            boolean r0 = r1.exiting
            if (r0 != 0) goto L2e
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L2e
            boolean r0 = r1.isDestroyed()
            if (r0 == 0) goto L11
            goto L2e
        L11:
            android.app.AlertDialog r0 = r1.inGameControlsDialog
            if (r0 == 0) goto L23
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L23
            android.app.AlertDialog r0 = r1.inGameControlsDialog
            r1.dismissDialog(r0)
            r0 = 0
            r1.inGameControlsDialog = r0
        L23:
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda32 r0 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda32
            r0.<init>(r1)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog.show(r1, r0)
            r1.configureWindow()
        L2e:
            return
    }

    private void openInGameButtonOverlay() {
            r11 = this;
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r11.binding
            if (r0 == 0) goto L153
            boolean r0 = r11.exiting
            if (r0 == 0) goto La
            goto L153
        La:
            android.app.AlertDialog r0 = r11.inGameControlsDialog
            if (r0 == 0) goto L18
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L18
            r11.configureWindow()
            return
        L18:
            boolean r0 = ca.dnamobile.javalauncher.controls.ControlsPreferences.isTouchControlsEnabled(r11)
            android.widget.ScrollView r1 = new android.widget.ScrollView
            r1.<init>(r11)
            r2 = 0
            r1.setFillViewport(r2)
            int r3 = ca.dnamobile.javalauncher.GameActivity.COLOR_DIALOG_BG
            r1.setBackgroundColor(r3)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r11)
            r4 = 1
            r3.setOrientation(r4)
            r5 = 20
            int r6 = r11.dpToPx(r5)
            r7 = 18
            int r7 = r11.dpToPx(r7)
            int r5 = r11.dpToPx(r5)
            r8 = 10
            int r8 = r11.dpToPx(r8)
            r3.setPadding(r6, r7, r5, r8)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r6 = -1
            r7 = -2
            r5.<init>(r6, r7)
            r1.addView(r3, r5)
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r11)
            java.lang.String r8 = "In-game controls"
            r5.setText(r8)
            int r8 = ca.dnamobile.javalauncher.GameActivity.COLOR_TEXT_PRIMARY
            r5.setTextColor(r8)
            r8 = 1103101952(0x41c00000, float:24.0)
            r5.setTextSize(r8)
            android.graphics.Typeface r8 = android.graphics.Typeface.DEFAULT_BOLD
            r5.setTypeface(r8)
            r8 = 4
            int r8 = r11.dpToPx(r8)
            r5.setPadding(r2, r2, r2, r8)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r8.<init>(r6, r7)
            r3.addView(r5, r8)
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r11)
            java.lang.String r8 = "Quick controls, overlay settings, and recovery actions while Minecraft is running."
            r5.setText(r8)
            int r8 = ca.dnamobile.javalauncher.GameActivity.COLOR_TEXT_SECONDARY
            r5.setTextColor(r8)
            r8 = 1095761920(0x41500000, float:13.0)
            r5.setTextSize(r8)
            r8 = 12
            int r8 = r11.dpToPx(r8)
            r5.setPadding(r2, r2, r2, r8)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r8.<init>(r6, r7)
            r3.addView(r5, r8)
            android.app.AlertDialog[] r5 = new android.app.AlertDialog[r4]
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda26 r8 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda26
            r8.<init>(r11, r5)
            java.lang.String r9 = "Controller / gamepad overlay"
            java.lang.String r10 = "Edit controller mappings, cursor behavior, FPS, log overlay, and floating button placement."
            android.view.View r8 = r11.buildInGameDialogAction(r9, r10, r2, r8)
            r3.addView(r8)
            if (r0 == 0) goto Lbb
            java.lang.String r8 = "Hide touch controls"
            goto Lbd
        Lbb:
            java.lang.String r8 = "Show touch controls"
        Lbd:
            if (r0 == 0) goto Lc2
            java.lang.String r0 = "Temporarily hides the active touch layout without leaving the game."
            goto Lc4
        Lc2:
            java.lang.String r0 = "Shows the selected touch layout again."
        Lc4:
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda27 r9 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda27
            r9.<init>(r11, r5)
            android.view.View r0 = r11.buildInGameDialogAction(r8, r0, r2, r9)
            r3.addView(r0)
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda28 r0 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda28
            r0.<init>(r11, r5)
            java.lang.String r8 = "Edit touch controls"
            java.lang.String r9 = "Open the touch layout editor for the current control layout."
            android.view.View r0 = r11.buildInGameDialogAction(r8, r9, r2, r0)
            r3.addView(r0)
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda29 r0 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda29
            r0.<init>(r11, r5)
            java.lang.String r8 = "Manage / import touch layouts"
            java.lang.String r9 = "Choose, import, or manage touch control layouts."
            android.view.View r0 = r11.buildInGameDialogAction(r8, r9, r2, r0)
            r3.addView(r0)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r11)
            java.lang.String r8 = "Recovery"
            r0.setText(r8)
            int r8 = ca.dnamobile.javalauncher.GameActivity.COLOR_TEXT_MUTED
            r0.setTextColor(r8)
            r8 = 1094713344(0x41400000, float:12.0)
            r0.setTextSize(r8)
            android.graphics.Typeface r8 = android.graphics.Typeface.DEFAULT_BOLD
            r0.setTypeface(r8)
            r8 = 2
            int r8 = r11.dpToPx(r8)
            r9 = 8
            int r9 = r11.dpToPx(r9)
            r10 = 6
            int r10 = r11.dpToPx(r10)
            r0.setPadding(r8, r9, r2, r10)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r8.<init>(r6, r7)
            r3.addView(r0, r8)
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda30 r0 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda30
            r0.<init>(r11, r5)
            java.lang.String r6 = "Force close game"
            java.lang.String r7 = "Use this if Minecraft is frozen, crashed, or will not return to the launcher normally."
            android.view.View r0 = r11.buildInGameDialogAction(r6, r7, r4, r0)
            r3.addView(r0)
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r11)
            android.app.AlertDialog$Builder r0 = r0.setView(r1)
            android.app.AlertDialog r0 = r0.create()
            r5[r2] = r0
            r11.inGameControlsDialog = r0
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda31 r1 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda31
            r1.<init>(r11, r0)
            r0.setOnDismissListener(r1)
            r0.show()
            r11.styleDarkDialog(r0)
        L153:
            return
    }

    private void openReplayModFfmpegInfoUrl() {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = "android.intent.action.VIEW"
            java.lang.String r2 = "https://github.com/DNAMobileApplications/DroidBridgeLauncherFFMPEG/releases/"
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L16
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L16
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r1)     // Catch: java.lang.Throwable -> L16
            r3.startActivity(r0)     // Catch: java.lang.Throwable -> L16
            goto L23
        L16:
            r0 = move-exception
            java.lang.String r1 = "GameActivity"
            java.lang.String r2 = "Unable to open Replay Mod FFmpeg info URL"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r2, r0)
            java.lang.String r0 = "Unable to open FFmpeg plugin link."
            r3.appendStatus(r0)
        L23:
            return
    }

    private void pollQuitWatchdog() {
            r3 = this;
            boolean r0 = r3.exiting
            if (r0 != 0) goto L3b
            boolean r0 = r3.quitWatchdogForceScheduled
            if (r0 == 0) goto L9
            goto L3b
        L9:
            java.io.File r0 = r3.getReadableLatestLogFile()     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L32
            boolean r1 = r0.isFile()     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L16
            goto L32
        L16:
            r1 = 65536(0x10000, float:9.1835E-41)
            java.lang.String r0 = r3.readLogTail(r0, r1)     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = "Stopping!"
            boolean r1 = r0.contains(r1)     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = "EGLBridge: Terminating"
            boolean r0 = r0.contains(r2)     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L3b
            if (r0 == 0) goto L3b
            java.lang.String r0 = "Minecraft stop detected but JVM did not return"
            r3.scheduleForcedGameProcessExit(r0)     // Catch: java.lang.Throwable -> L33
            goto L3b
        L32:
            return
        L33:
            r0 = move-exception
            java.lang.String r1 = "GameActivity"
            java.lang.String r2 = "Quit watchdog failed"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r2, r0)
        L3b:
            return
    }

    private void prepareRendererEnvironmentBeforeBridgeLoad() {
            r6 = this;
            java.lang.String r0 = "GameActivity"
            java.lang.String r1 = " rendererId=vulkan_zink POJAVEXEC_EGL=libEGL_mesa.so"
            java.lang.String r2 = " rendererId=droidbridge_native_glfw_kgsl POJAVEXEC_EGL=libEGL_mesa.so"
            ca.dnamobile.javalauncher.renderer.Renderers.reload(r6)     // Catch: java.lang.Throwable -> L10f
            ca.dnamobile.javalauncher.renderer.RendererInterface r3 = ca.dnamobile.javalauncher.renderer.Renderers.getSelectedRenderer(r6)     // Catch: java.lang.Throwable -> L10f
            r6.clearEarlyRendererEnvAliases()     // Catch: java.lang.Throwable -> L10f
            boolean r4 = ca.dnamobile.javalauncher.renderer.DroidBridgeNativeGlfwKgslRenderer.isRenderer(r3)     // Catch: java.lang.Throwable -> L10f
            java.lang.String r5 = "Early renderer env prepared for "
            if (r4 == 0) goto L34
            r6.applyEarlyNativeGlfwKgslEnvironment(r3)     // Catch: java.lang.Throwable -> L10f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10f
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L10f
            java.lang.String r3 = r3.getRendererName()     // Catch: java.lang.Throwable -> L10f
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> L10f
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L10f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L10f
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r1)     // Catch: java.lang.Throwable -> L10f
            return
        L34:
            boolean r2 = ca.dnamobile.javalauncher.renderer.DroidBridgeMesaSupport.isMesaZinkTurnipRenderer(r3)     // Catch: java.lang.Throwable -> L10f
            if (r2 == 0) goto L56
            r6.applyEarlyMesaZinkTurnipEnvironment(r3)     // Catch: java.lang.Throwable -> L10f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10f
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L10f
            java.lang.String r3 = r3.getRendererName()     // Catch: java.lang.Throwable -> L10f
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L10f
            java.lang.StringBuilder r1 = r2.append(r1)     // Catch: java.lang.Throwable -> L10f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L10f
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r1)     // Catch: java.lang.Throwable -> L10f
            return
        L56:
            java.lang.String r1 = "POJAV_RENDERER"
            java.lang.String r2 = r6.resolveBridgeRendererId(r3)     // Catch: java.lang.Throwable -> L10f
            r6.setEarlyEnv(r1, r2)     // Catch: java.lang.Throwable -> L10f
            java.util.Map r1 = r3.getRendererEnv()     // Catch: java.lang.Throwable -> L10f
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L10f
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L10f
        L6b:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L10f
            if (r2 == 0) goto L87
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L10f
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L10f
            java.lang.Object r4 = r2.getKey()     // Catch: java.lang.Throwable -> L10f
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L10f
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L10f
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L10f
            r6.setEarlyEnv(r4, r2)     // Catch: java.lang.Throwable -> L10f
            goto L6b
        L87:
            boolean r1 = r6.shouldApplyDriverPluginEnvironment(r3)     // Catch: java.lang.Throwable -> L10f
            if (r1 == 0) goto Lb5
            java.util.Map r1 = ca.dnamobile.javalauncher.renderer.DriverPluginManager.buildEnvironment(r6, r3)     // Catch: java.lang.Throwable -> L10f
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L10f
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L10f
        L99:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L10f
            if (r2 == 0) goto Lb5
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L10f
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L10f
            java.lang.Object r4 = r2.getKey()     // Catch: java.lang.Throwable -> L10f
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L10f
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L10f
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L10f
            r6.setEarlyEnv(r4, r2)     // Catch: java.lang.Throwable -> L10f
            goto L99
        Lb5:
            java.lang.String r1 = r3.getRendererEGL()     // Catch: java.lang.Throwable -> L10f
            java.lang.String r1 = r6.sanitizeLibraryName(r1)     // Catch: java.lang.Throwable -> L10f
            boolean r2 = r6.isMobileGluesRenderer(r3)     // Catch: java.lang.Throwable -> L10f
            if (r2 == 0) goto Lc6
            java.lang.String r1 = "libmobileglues.so"
            goto Ld0
        Lc6:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L10f
            if (r2 == 0) goto Ld0
            java.lang.String r1 = r6.inferPojavExecEgl(r3)     // Catch: java.lang.Throwable -> L10f
        Ld0:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L10f
            if (r2 != 0) goto Ldb
            java.lang.String r2 = "POJAVEXEC_EGL"
            r6.setEarlyEnv(r2, r1)     // Catch: java.lang.Throwable -> L10f
        Ldb:
            r6.applyEarlyRendererBridgeAliases(r3, r1)     // Catch: java.lang.Throwable -> L10f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10f
            r2.<init>()     // Catch: java.lang.Throwable -> L10f
            java.lang.StringBuilder r2 = r2.append(r5)     // Catch: java.lang.Throwable -> L10f
            java.lang.String r4 = r3.getRendererName()     // Catch: java.lang.Throwable -> L10f
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch: java.lang.Throwable -> L10f
            java.lang.String r4 = " rendererId="
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch: java.lang.Throwable -> L10f
            java.lang.String r3 = r6.resolveBridgeRendererId(r3)     // Catch: java.lang.Throwable -> L10f
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L10f
            java.lang.String r3 = " POJAVEXEC_EGL="
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L10f
            java.lang.StringBuilder r1 = r2.append(r1)     // Catch: java.lang.Throwable -> L10f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L10f
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r1)     // Catch: java.lang.Throwable -> L10f
            goto L115
        L10f:
            r1 = move-exception
            java.lang.String r2 = "Failed to prepare early renderer env"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r2, r1)
        L115:
            return
    }

    private static java.lang.String readHttpErrorBody(java.net.HttpURLConnection r4) {
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L53
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L53
            java.io.InputStream r2 = r4.getErrorStream()     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto Lf
            java.io.InputStream r4 = r4.getErrorStream()     // Catch: java.lang.Throwable -> L53
            goto L13
        Lf:
            java.io.InputStream r4 = r4.getInputStream()     // Catch: java.lang.Throwable -> L53
        L13:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L53
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L53
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L53
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r4.<init>()     // Catch: java.lang.Throwable -> L49
        L20:
            java.lang.String r1 = r0.readLine()     // Catch: java.lang.Throwable -> L49
            r2 = 900(0x384, float:1.261E-42)
            if (r1 == 0) goto L3d
            int r3 = r4.length()     // Catch: java.lang.Throwable -> L49
            if (r3 >= r2) goto L3d
            int r2 = r4.length()     // Catch: java.lang.Throwable -> L49
            if (r2 <= 0) goto L39
            r2 = 10
            r4.append(r2)     // Catch: java.lang.Throwable -> L49
        L39:
            r4.append(r1)     // Catch: java.lang.Throwable -> L49
            goto L20
        L3d:
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = trimForDialog(r4, r2)     // Catch: java.lang.Throwable -> L49
            r0.close()     // Catch: java.lang.Throwable -> L53
            return r4
        L49:
            r4 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L4e
            goto L52
        L4e:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.lang.Throwable -> L53
        L52:
            throw r4     // Catch: java.lang.Throwable -> L53
        L53:
            java.lang.String r4 = ""
            return r4
    }

    private java.lang.String readLogTail(java.io.File r7, int r8) throws java.lang.Exception {
            r6 = this;
            long r0 = r7.length()
            long r2 = (long) r8
            long r2 = r0 - r2
            r4 = 0
            long r2 = java.lang.Math.max(r4, r2)
            long r0 = r0 - r2
            long r0 = java.lang.Math.max(r4, r0)
            int r8 = (int) r0
            byte[] r8 = new byte[r8]
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "r"
            r0.<init>(r7, r1)
            r0.seek(r2)     // Catch: java.lang.Throwable -> L68
            r0.readFully(r8)     // Catch: java.lang.Throwable -> L68
            r0.close()
            java.lang.String r7 = new java.lang.String
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            r7.<init>(r8, r0)
            java.lang.String r8 = "\r\n"
            java.lang.String r0 = "\n"
            java.lang.String r7 = r7.replace(r8, r0)
            r8 = 13
            r0 = 10
            java.lang.String r7 = r7.replace(r8, r0)
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 <= 0) goto L61
            int r8 = r7.indexOf(r0)
            if (r8 < 0) goto L61
            int r8 = r8 + 1
            int r0 = r7.length()
            if (r8 >= r0) goto L61
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "...\n"
            r0.<init>(r1)
            java.lang.String r7 = r7.substring(r8)
            java.lang.StringBuilder r7 = r0.append(r7)
            java.lang.String r7 = r7.toString()
        L61:
            r8 = 280(0x118, float:3.92E-43)
            java.lang.String r7 = r6.trimToLastLines(r7, r8)
            return r7
        L68:
            r7 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L6d
            goto L71
        L6d:
            r8 = move-exception
            r7.addSuppressed(r8)
        L71:
            throw r7
    }

    private void refreshLogOverlay() {
            r7 = this;
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r7.binding
            if (r0 == 0) goto L6b
            android.widget.LinearLayout r0 = r0.layoutLogOverlay
            int r0 = r0.getVisibility()
            if (r0 == 0) goto Ld
            goto L6b
        Ld:
            java.io.File r0 = r7.getReadableLatestLogFile()
            if (r0 == 0) goto L62
            boolean r1 = r0.isFile()
            if (r1 != 0) goto L1a
            goto L62
        L1a:
            long r1 = r0.length()
            long r3 = r0.lastModified()
            long r5 = r7.lastLogOverlayLength
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 != 0) goto L2f
            long r5 = r7.lastLogOverlayModified
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L2f
            return
        L2f:
            r7.lastLogOverlayLength = r1
            r7.lastLogOverlayModified = r3
            r1 = 98304(0x18000, float:1.37753E-40)
            java.lang.String r0 = r7.readLogTail(r0, r1)     // Catch: java.lang.Throwable -> L59
            java.lang.String r1 = r0.trim()     // Catch: java.lang.Throwable -> L59
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L59
            if (r1 == 0) goto L45
            return
        L45:
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r1 = r7.binding     // Catch: java.lang.Throwable -> L59
            android.widget.TextView r1 = r1.textLogOverlay     // Catch: java.lang.Throwable -> L59
            r1.setText(r0)     // Catch: java.lang.Throwable -> L59
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r7.binding     // Catch: java.lang.Throwable -> L59
            android.widget.ScrollView r0 = r0.scrollLogOverlay     // Catch: java.lang.Throwable -> L59
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda48 r1 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda48     // Catch: java.lang.Throwable -> L59
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L59
            r0.post(r1)     // Catch: java.lang.Throwable -> L59
            goto L61
        L59:
            r0 = move-exception
            java.lang.String r1 = "GameActivity"
            java.lang.String r2 = "Failed to refresh game log overlay"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r2, r0)
        L61:
            return
        L62:
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r7.binding
            android.widget.TextView r0 = r0.textLogOverlay
            java.lang.String r1 = "Waiting for latestlog.txt..."
            r0.setText(r1)
        L6b:
            return
    }

    private void refreshTouchControlsOverlay() {
            r2 = this;
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay r0 = r2.touchControlsOverlay
            if (r0 != 0) goto L5
            return
        L5:
            r0.loadSelectedLayout()
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay r0 = r2.touchControlsOverlay
            boolean r1 = ca.dnamobile.javalauncher.controls.ControlsPreferences.isTouchControlsEnabled(r2)
            r0.setControlsVisible(r1)
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay r0 = r2.touchControlsOverlay
            r0.bringToFront()
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r2.binding
            if (r0 == 0) goto L29
            android.widget.LinearLayout r0 = r0.layoutLogOverlay
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L29
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r2.binding
            android.widget.LinearLayout r0 = r0.layoutLogOverlay
            r0.bringToFront()
        L29:
            ca.dnamobile.javalauncher.game.FloatingGameSettingsOverlayController r0 = r2.floatingGameSettingsOverlayController
            if (r0 == 0) goto L31
            r0.bringToFront()
            goto L44
        L31:
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r2.binding
            if (r0 == 0) goto L44
            android.widget.ImageButton r0 = r0.buttonGameSettings
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L44
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r2.binding
            android.widget.ImageButton r0 = r0.buttonGameSettings
            r0.bringToFront()
        L44:
            return
    }

    private void reloadTouchControlsLayout() {
            r2 = this;
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay r0 = r2.touchControlsOverlay
            if (r0 != 0) goto L5
            return
        L5:
            r0.loadSelectedLayout()
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay r0 = r2.touchControlsOverlay
            boolean r1 = ca.dnamobile.javalauncher.controls.ControlsPreferences.isTouchControlsEnabled(r2)
            r0.setControlsVisible(r1)
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay r0 = r2.touchControlsOverlay
            r0.requestLayout()
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay r0 = r2.touchControlsOverlay
            r0.invalidate()
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay r0 = r2.touchControlsOverlay
            r0.bringToFront()
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r2.binding
            if (r0 == 0) goto L33
            android.widget.LinearLayout r0 = r0.layoutLogOverlay
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L33
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r2.binding
            android.widget.LinearLayout r0 = r0.layoutLogOverlay
            r0.bringToFront()
        L33:
            ca.dnamobile.javalauncher.game.FloatingGameSettingsOverlayController r0 = r2.floatingGameSettingsOverlayController
            if (r0 == 0) goto L3b
            r0.bringToFront()
            goto L4e
        L3b:
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r2.binding
            if (r0 == 0) goto L4e
            android.widget.ImageButton r0 = r0.buttonGameSettings
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L4e
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r2.binding
            android.widget.ImageButton r0 = r0.buttonGameSettings
            r0.bringToFront()
        L4e:
            return
    }

    private java.lang.String rendererIdentity(ca.dnamobile.javalauncher.renderer.RendererInterface r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r4.getRendererId()
            java.lang.String r1 = r3.safeLower(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r2 = r4.getRendererName()
            java.lang.String r2 = r3.safeLower(r2)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r2 = r4.getRendererLibrary()
            java.lang.String r2 = r3.safeLower(r2)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r2 = r4.getRendererEGL()
            java.lang.String r2 = r3.safeLower(r2)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r4 = r4.getUniqueIdentifier()
            java.lang.String r4 = r3.safeLower(r4)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            return r4
    }

    private java.lang.String resolveBridgeRendererId(ca.dnamobile.javalauncher.renderer.RendererInterface r2) {
            r1 = this;
            boolean r0 = r1.isLtwRenderer(r2)
            if (r0 == 0) goto L9
            java.lang.String r2 = "opengles3_ltw"
            return r2
        L9:
            boolean r0 = r1.isMobileGluesRenderer(r2)
            if (r0 == 0) goto L12
            java.lang.String r2 = "mobileglues"
            goto L16
        L12:
            java.lang.String r2 = r2.getRendererId()
        L16:
            return r2
    }

    private ca.dnamobile.javalauncher.data.AccountStore.Account resolveMicrosoftAccountForPreflight(ca.dnamobile.javalauncher.data.AccountStore.Account r2) {
            r1 = this;
            if (r2 == 0) goto Lf
            boolean r0 = r2.isMicrosoftAccount()
            if (r0 == 0) goto Lf
            boolean r0 = r2.hasMinecraftSession()
            if (r0 == 0) goto Lf
            return r2
        Lf:
            r2 = 0
            return r2
    }

    private android.graphics.drawable.GradientDrawable roundedDrawable(int r2, int r3, int r4) {
            r1 = this;
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r0.setColor(r2)
            int r2 = r1.dpToPx(r4)
            float r2 = (float) r2
            r0.setCornerRadius(r2)
            r2 = 1
            int r4 = r1.dpToPx(r2)
            int r2 = java.lang.Math.max(r2, r4)
            r0.setStroke(r2, r3)
            return r0
    }

    private boolean routePhysicalKeyboardEscapeToMinecraft(android.view.KeyEvent r4) {
            r3 = this;
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r3.binding
            r1 = 0
            if (r0 == 0) goto L27
            net.kdt.pojavlaunch.MinecraftGLSurface r0 = r0.minecraftSurface
            if (r0 != 0) goto La
            goto L27
        La:
            android.app.AlertDialog r0 = r3.inGameControlsDialog
            if (r0 == 0) goto L15
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L15
            return r1
        L15:
            int r0 = r4.getKeyCode()
            r2 = 111(0x6f, float:1.56E-43)
            if (r0 == r2) goto L1e
            return r1
        L1e:
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r3.binding
            net.kdt.pojavlaunch.MinecraftGLSurface r0 = r0.minecraftSurface
            boolean r4 = r0.handleKeyEventFromActivity(r4)
            return r4
        L27:
            return r1
    }

    private void runTokenValidationAfterRefreshFailure(java.lang.String r3) {
            r2 = this;
            java.lang.Thread r0 = new java.lang.Thread
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda4 r1 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda4
            r1.<init>(r2, r3)
            java.lang.String r3 = "DroidBridgeAccountPreflightValidation"
            r0.<init>(r1, r3)
            r3 = 1
            r0.setDaemon(r3)
            r0.start()
            return
    }

    private java.lang.String safeLower(java.lang.String r2) {
            r1 = this;
            if (r2 != 0) goto L5
            java.lang.String r2 = ""
            goto Lf
        L5:
            java.lang.String r2 = r2.trim()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r0)
        Lf:
            return r2
    }

    private java.lang.String sanitizeLibraryName(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = ""
            if (r3 != 0) goto L5
            return r0
        L5:
            java.lang.String r3 = r3.trim()
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L2a
            java.lang.String r1 = "null"
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 != 0) goto L2a
            java.lang.String r1 = "(null)"
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 == 0) goto L20
            goto L2a
        L20:
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            java.lang.String r3 = r0.getName()
            return r3
        L2a:
            return r0
    }

    private void scheduleForcedGameProcessExit(java.lang.String r4) {
            r3 = this;
            boolean r0 = r3.quitWatchdogForceScheduled
            if (r0 != 0) goto L47
            boolean r0 = r3.exiting
            if (r0 == 0) goto L9
            goto L47
        L9:
            r0 = 1
            r3.quitWatchdogForceScheduled = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "QuitWatchdog: "
            r0.<init>(r1)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r0 = "; closing game process soon."
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            ca.dnamobile.javalauncher.logs.LauncherLogManager.append(r4)
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda0 r4 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda0
            r4.<init>(r3)
            r3.runOnUiThread(r4)
            android.os.Handler r4 = r3.quitWatchdogHandler
            if (r4 != 0) goto L3b
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r4.<init>(r0)
            r3.quitWatchdogHandler = r4
        L3b:
            android.os.Handler r4 = r3.quitWatchdogHandler
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda11 r0 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda11
            r0.<init>(r3)
            r1 = 2500(0x9c4, double:1.235E-320)
            r4.postDelayed(r0, r1)
        L47:
            return
    }

    private void scheduleMinecraftSurfaceRefresh() {
            r4 = this;
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r4.binding
            if (r0 == 0) goto L29
            net.kdt.pojavlaunch.MinecraftGLSurface r0 = r0.minecraftSurface
            if (r0 != 0) goto L9
            goto L29
        L9:
            android.os.Handler r0 = r4.surfaceRefreshHandler
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda41 r0 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda41
            r0.<init>(r4)
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r1 = r4.binding
            net.kdt.pojavlaunch.MinecraftGLSurface r1 = r1.minecraftSurface
            r1.post(r0)
            android.os.Handler r1 = r4.surfaceRefreshHandler
            r2 = 120(0x78, double:5.93E-322)
            r1.postDelayed(r0, r2)
            android.os.Handler r1 = r4.surfaceRefreshHandler
            r2 = 350(0x15e, double:1.73E-321)
            r1.postDelayed(r0, r2)
        L29:
            return
    }

    private void setEarlyEnv(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto Ld
            android.system.Os.unsetenv(r3)     // Catch: java.lang.Throwable -> L12
            goto L27
        Ld:
            r0 = 1
            android.system.Os.setenv(r3, r4, r0)     // Catch: java.lang.Throwable -> L12
            goto L27
        L12:
            r4 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to update early env "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "GameActivity"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r3, r4)
        L27:
            return
    }

    private void setupMicrosoftAccountPreflightManager() {
            r3 = this;
            ca.dnamobile.javalauncher.data.AccountStore r0 = new ca.dnamobile.javalauncher.data.AccountStore     // Catch: java.lang.Throwable -> L19
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L19
            r3.accountStore = r0     // Catch: java.lang.Throwable -> L19
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal r0 = new ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal     // Catch: java.lang.Throwable -> L19
            ca.dnamobile.javalauncher.data.AccountStore r1 = r3.accountStore     // Catch: java.lang.Throwable -> L19
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L19
            r3.microsoftAuthManager = r0     // Catch: java.lang.Throwable -> L19
            ca.dnamobile.javalauncher.GameActivity$3 r1 = new ca.dnamobile.javalauncher.GameActivity$3     // Catch: java.lang.Throwable -> L19
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L19
            r0.setListener(r1)     // Catch: java.lang.Throwable -> L19
            goto L26
        L19:
            r0 = move-exception
            java.lang.String r1 = "GameActivity"
            java.lang.String r2 = "Microsoft account preflight manager initialization failed"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r2, r0)
            r0 = 0
            r3.accountStore = r0
            r3.microsoftAuthManager = r0
        L26:
            return
    }

    private boolean shouldApplyDriverPluginEnvironment(ca.dnamobile.javalauncher.renderer.RendererInterface r2) {
            r1 = this;
            boolean r0 = ca.dnamobile.javalauncher.renderer.DroidBridgeMesaSupport.isMesaZinkTurnipRenderer(r2)
            if (r0 != 0) goto Lf
            boolean r2 = ca.dnamobile.javalauncher.renderer.DriverPluginManager.isVulkanZinkRenderer(r2)
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            goto L10
        Lf:
            r2 = 1
        L10:
            return r2
    }

    private boolean shouldConsumeLauncherGamepadInput() {
            r1 = this;
            boolean r0 = ca.dnamobile.javalauncher.modcompat.ControllerModCompat.shouldSuppressLauncherGamepadInput()
            if (r0 == 0) goto Lc
            boolean r0 = net.kdt.pojavlaunch.MinecraftGLSurface.sdlEnabled
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    private boolean shouldPauseLaunchForMicrosoftAccountPreflight() {
            r2 = this;
            boolean r0 = r2.microsoftAccountPreflightCompleted
            if (r0 != 0) goto L1e
            boolean r0 = r2.microsoftAccountPreflightAcceptedAfterWarning
            if (r0 != 0) goto L1e
            boolean r0 = r2.exiting
            if (r0 == 0) goto Ld
            goto L1e
        Ld:
            boolean r0 = r2.microsoftAccountPreflightPending
            r1 = 1
            if (r0 == 0) goto L13
            return r1
        L13:
            r2.microsoftAccountPreflightPending = r1
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda40 r0 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda40
            r0.<init>(r2)
            r2.runOnUiThread(r0)
            return r1
        L1e:
            r0 = 0
            return r0
    }

    private boolean shouldPauseLaunchForReplayModFfmpegWarning() {
            r3 = this;
            boolean r0 = r3.replayModFfmpegWarningAccepted
            if (r0 != 0) goto L23
            boolean r0 = r3.replayModFfmpegWarningPending
            if (r0 != 0) goto L23
            boolean r0 = r3.exiting
            if (r0 == 0) goto Ld
            goto L23
        Ld:
            ca.dnamobile.javalauncher.GameActivity$ReplayModFfmpegPreflight r0 = r3.checkReplayModFfmpegPreflight()
            boolean r1 = r0.shouldWarn
            if (r1 != 0) goto L17
            r0 = 0
            return r0
        L17:
            r1 = 1
            r3.replayModFfmpegWarningPending = r1
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda16 r2 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda16
            r2.<init>(r3, r0)
            r3.runOnUiThread(r2)
            return r1
        L23:
            boolean r0 = r3.replayModFfmpegWarningPending
            return r0
    }

    private boolean shouldRouteGamepadToMinecraftFallback() {
            r3 = this;
            boolean r0 = ca.dnamobile.javalauncher.modcompat.ControllerModCompat.shouldSuppressLauncherGamepadInput()
            r1 = 0
            if (r0 == 0) goto L26
            boolean r0 = net.kdt.pojavlaunch.MinecraftGLSurface.sdlEnabled
            if (r0 == 0) goto Lc
            goto L26
        Lc:
            boolean r0 = r3.isLegacy4JGlfwFallbackLikelyActive()
            if (r0 != 0) goto L13
            return r1
        L13:
            boolean r0 = r3.legacy4jFallbackLogged
            r1 = 1
            if (r0 != 0) goto L26
            r3.legacy4jFallbackLogged = r1
            java.lang.String r0 = "ControllerModCompat: allowing Legacy4J/GLFW fallback to receive gamepad input"
            net.kdt.pojavlaunch.Logger.appendToLog(r0)
            java.lang.String r0 = "GameActivity"
            java.lang.String r2 = "Allowing Legacy4J/GLFW fallback to receive gamepad input"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r2)
        L26:
            return r1
    }

    private static boolean shouldUseInputStackQueue(java.lang.String r4) {
            java.lang.String r4 = r4.toLowerCase()
            java.lang.String r0 = "26"
            boolean r0 = r4.startsWith(r0)
            r1 = 1
            if (r0 != 0) goto L52
            java.lang.String r0 = "snapshot"
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L52
            java.lang.String r0 = "pre"
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L52
            java.lang.String r0 = "rc"
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L26
            goto L52
        L26:
            java.lang.String r0 = "1."
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L2f
            return r1
        L2f:
            java.lang.String r0 = "[^0-9]+"
            java.lang.String[] r4 = r4.split(r0)
            int r0 = r4.length
            r2 = 2
            r3 = 0
            if (r0 < r2) goto L51
            r0 = r4[r3]     // Catch: java.lang.NumberFormatException -> L51
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L51
            r4 = r4[r1]     // Catch: java.lang.NumberFormatException -> L51
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L51
            if (r0 > r1) goto L50
            if (r0 != r1) goto L4f
            r0 = 13
            if (r4 < r0) goto L4f
            goto L50
        L4f:
            r1 = r3
        L50:
            return r1
        L51:
            return r3
        L52:
            return r1
    }

    private void showForceCloseGameDialog() {
            r7 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r7)
            r1 = 1
            r0.setOrientation(r1)
            r1 = 22
            int r2 = r7.dpToPx(r1)
            r3 = 18
            int r3 = r7.dpToPx(r3)
            int r1 = r7.dpToPx(r1)
            r4 = 0
            r0.setPadding(r2, r3, r1, r4)
            int r1 = ca.dnamobile.javalauncher.GameActivity.COLOR_DIALOG_BG
            r0.setBackgroundColor(r1)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r7)
            java.lang.String r2 = "Force close game?"
            r1.setText(r2)
            int r2 = ca.dnamobile.javalauncher.GameActivity.COLOR_TEXT_PRIMARY
            r1.setTextColor(r2)
            r2 = 1102053376(0x41b00000, float:22.0)
            r1.setTextSize(r2)
            android.graphics.Typeface r2 = android.graphics.Typeface.DEFAULT_BOLD
            r1.setTypeface(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = -1
            r5 = -2
            r2.<init>(r3, r5)
            r0.addView(r1, r2)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r7)
            java.lang.String r2 = "This should only be used when Minecraft is frozen, crashed, or will not close normally. The launcher will save the latest log if log history is enabled, reset launcher-side game state, and close the game process."
            r1.setText(r2)
            int r2 = ca.dnamobile.javalauncher.GameActivity.COLOR_TEXT_SECONDARY
            r1.setTextColor(r2)
            r2 = 1096810496(0x41600000, float:14.0)
            r1.setTextSize(r2)
            r2 = 10
            int r2 = r7.dpToPx(r2)
            r6 = 2
            int r6 = r7.dpToPx(r6)
            r1.setPadding(r4, r2, r4, r6)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r3, r5)
            r0.addView(r1, r2)
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r7)
            android.app.AlertDialog$Builder r0 = r1.setView(r0)
            r1 = 17039360(0x1040000, float:2.424457E-38)
            r2 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            java.lang.String r1 = "Force close"
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)
            android.app.AlertDialog r0 = r0.create()
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda49 r1 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda49
            r1.<init>(r7, r0)
            r0.setOnShowListener(r1)
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda50 r1 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda50
            r1.<init>(r7)
            r0.setOnDismissListener(r1)
            r0.show()
            r7.styleDarkDialog(r0)
            return
    }

    private void showMicrosoftAccountPreflightWarningDialog(ca.dnamobile.javalauncher.GameActivity.PreLaunchMicrosoftSessionResult r3) {
            r2 = this;
            boolean r0 = r2.exiting
            if (r0 != 0) goto L64
            boolean r0 = r2.isFinishing()
            if (r0 != 0) goto L64
            boolean r0 = r2.isDestroyed()
            if (r0 == 0) goto L11
            goto L64
        L11:
            r2.configureWindow()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DroidBridge checked the saved Microsoft/Minecraft session before launching and found a possible login problem. This can cause servers or Realms to fail even if singleplayer still works.\n\n"
            r0.<init>(r1)
            java.lang.String r3 = r3.message
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = "\n\nYou can open Settings to use Refresh Microsoft account/skin, cancel launch, or continue anyway with the saved account."
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r2)
            java.lang.String r1 = "Microsoft account needs attention"
            android.app.AlertDialog$Builder r0 = r0.setTitle(r1)
            android.app.AlertDialog$Builder r3 = r0.setMessage(r3)
            java.lang.String r0 = "Cancel launch"
            r1 = 0
            android.app.AlertDialog$Builder r3 = r3.setNegativeButton(r0, r1)
            java.lang.String r0 = "Open Settings"
            android.app.AlertDialog$Builder r3 = r3.setNeutralButton(r0, r1)
            java.lang.String r0 = "Continue anyway"
            android.app.AlertDialog$Builder r3 = r3.setPositiveButton(r0, r1)
            android.app.AlertDialog r3 = r3.create()
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda13 r0 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda13
            r0.<init>(r2, r3)
            r3.setOnShowListener(r0)
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda14 r0 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda14
            r0.<init>(r2)
            r3.setOnDismissListener(r0)
            r3.show()
        L64:
            return
    }

    private void showReplayModFfmpegMissingDialog(ca.dnamobile.javalauncher.GameActivity.ReplayModFfmpegPreflight r15) {
            r14 = this;
            boolean r0 = r14.isFinishing()
            r1 = 0
            if (r0 != 0) goto L1c9
            boolean r0 = r14.isDestroyed()
            if (r0 != 0) goto L1c9
            boolean r0 = r14.exiting
            if (r0 == 0) goto L13
            goto L1c9
        L13:
            r14.configureWindow()
            android.widget.ScrollView r0 = new android.widget.ScrollView
            r0.<init>(r14)
            r0.setFillViewport(r1)
            int r2 = ca.dnamobile.javalauncher.GameActivity.COLOR_DIALOG_BG
            r0.setBackgroundColor(r2)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r14)
            r4 = 1
            r3.setOrientation(r4)
            r5 = 22
            int r6 = r14.dpToPx(r5)
            r7 = 18
            int r8 = r14.dpToPx(r7)
            int r5 = r14.dpToPx(r5)
            r9 = 8
            int r10 = r14.dpToPx(r9)
            r3.setPadding(r6, r8, r5, r10)
            r3.setBackgroundColor(r2)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r5 = -1
            r6 = -2
            r2.<init>(r5, r6)
            r0.addView(r3, r2)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r14)
            java.lang.String r8 = "Replay Mod FFmpeg missing"
            r2.setText(r8)
            int r8 = ca.dnamobile.javalauncher.GameActivity.COLOR_TEXT_PRIMARY
            r2.setTextColor(r8)
            r10 = 1102053376(0x41b00000, float:22.0)
            r2.setTextSize(r10)
            android.graphics.Typeface r10 = android.graphics.Typeface.DEFAULT_BOLD
            r2.setTypeface(r10)
            int r10 = r14.dpToPx(r9)
            r2.setPadding(r1, r1, r1, r10)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r10.<init>(r5, r6)
            r3.addView(r2, r10)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r14)
            java.lang.String r10 = "Replay Mod was detected, but the JavaLauncher FFmpeg plugin is not installed or could not be found. Replay Mod can still open without it, but video rendering/export may fail until FFmpeg is installed."
            r2.setText(r10)
            int r10 = ca.dnamobile.javalauncher.GameActivity.COLOR_TEXT_SECONDARY
            r2.setTextColor(r10)
            r11 = 1096810496(0x41600000, float:14.0)
            r2.setTextSize(r11)
            r11 = 12
            int r12 = r14.dpToPx(r11)
            r2.setPadding(r1, r1, r1, r12)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r12.<init>(r5, r6)
            r3.addView(r2, r12)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r14)
            r2.setOrientation(r4)
            r4 = 14
            int r12 = r14.dpToPx(r4)
            int r13 = r14.dpToPx(r11)
            int r4 = r14.dpToPx(r4)
            int r11 = r14.dpToPx(r11)
            r2.setPadding(r12, r13, r4, r11)
            int r4 = ca.dnamobile.javalauncher.GameActivity.COLOR_CARD_BG
            int r11 = ca.dnamobile.javalauncher.GameActivity.COLOR_CARD_STROKE
            android.graphics.drawable.GradientDrawable r4 = r14.roundedDrawable(r4, r11, r7)
            r2.setBackground(r4)
            android.widget.TextView r4 = new android.widget.TextView
            r4.<init>(r14)
            java.lang.String r7 = "What this means"
            r4.setText(r7)
            r4.setTextColor(r8)
            r7 = 1098907648(0x41800000, float:16.0)
            r4.setTextSize(r7)
            android.graphics.Typeface r7 = android.graphics.Typeface.DEFAULT_BOLD
            r4.setTypeface(r7)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r7.<init>(r5, r6)
            r2.addView(r4, r7)
            android.widget.TextView r4 = new android.widget.TextView
            r4.<init>(r14)
            java.lang.String r7 = "Install the FFmpeg companion APK, then launch this instance again. If you just installed it, Android may require reopening the launcher before package discovery updates."
            r4.setText(r7)
            r4.setTextColor(r10)
            r7 = 1095237632(0x41480000, float:12.5)
            r4.setTextSize(r7)
            r7 = 4
            int r7 = r14.dpToPx(r7)
            r4.setPadding(r1, r7, r1, r1)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r7.<init>(r5, r6)
            r2.addView(r4, r7)
            java.io.File r4 = r15.gameDirectory
            r7 = 1094189056(0x41380000, float:11.5)
            if (r4 == 0) goto L142
            android.widget.TextView r4 = new android.widget.TextView
            r4.<init>(r14)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "Detected in: "
            r8.<init>(r10)
            java.io.File r10 = r15.gameDirectory
            java.lang.String r10 = r10.getAbsolutePath()
            java.lang.StringBuilder r8 = r8.append(r10)
            java.lang.String r8 = r8.toString()
            r4.setText(r8)
            int r8 = ca.dnamobile.javalauncher.GameActivity.COLOR_TEXT_MUTED
            r4.setTextColor(r8)
            r4.setTextSize(r7)
            int r8 = r14.dpToPx(r9)
            r4.setPadding(r1, r8, r1, r1)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r8.<init>(r5, r6)
            r2.addView(r4, r8)
        L142:
            java.lang.String r4 = r15.errorMessage
            if (r4 == 0) goto L183
            java.lang.String r4 = r15.errorMessage
            java.lang.String r4 = r4.trim()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L183
            android.widget.TextView r4 = new android.widget.TextView
            r4.<init>(r14)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "Discovery status: "
            r8.<init>(r10)
            java.lang.String r15 = r15.errorMessage
            java.lang.StringBuilder r15 = r8.append(r15)
            java.lang.String r15 = r15.toString()
            r4.setText(r15)
            int r15 = ca.dnamobile.javalauncher.GameActivity.COLOR_TEXT_MUTED
            r4.setTextColor(r15)
            r4.setTextSize(r7)
            r15 = 6
            int r15 = r14.dpToPx(r15)
            r4.setPadding(r1, r15, r1, r1)
            android.widget.LinearLayout$LayoutParams r15 = new android.widget.LinearLayout$LayoutParams
            r15.<init>(r5, r6)
            r2.addView(r4, r15)
        L183:
            android.widget.LinearLayout$LayoutParams r15 = new android.widget.LinearLayout$LayoutParams
            r15.<init>(r5, r6)
            int r4 = r14.dpToPx(r9)
            r15.setMargins(r1, r1, r1, r4)
            r3.addView(r2, r15)
            android.app.AlertDialog$Builder r15 = new android.app.AlertDialog$Builder
            r15.<init>(r14)
            android.app.AlertDialog$Builder r15 = r15.setView(r0)
            java.lang.String r0 = "Launch anyway"
            r2 = 0
            android.app.AlertDialog$Builder r15 = r15.setPositiveButton(r0, r2)
            java.lang.String r0 = "Get FFmpeg plugin"
            android.app.AlertDialog$Builder r15 = r15.setNeutralButton(r0, r2)
            r0 = 17039360(0x1040000, float:2.424457E-38)
            android.app.AlertDialog$Builder r15 = r15.setNegativeButton(r0, r2)
            android.app.AlertDialog r15 = r15.create()
            r15.setCanceledOnTouchOutside(r1)
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda24 r0 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda24
            r0.<init>(r14, r15)
            r15.setOnShowListener(r0)
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda25 r0 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda25
            r0.<init>(r14)
            r15.setOnDismissListener(r0)
            r15.show()
            return
        L1c9:
            r14.replayModFfmpegWarningPending = r1
            return
    }

    private void startLaunchAfterReplayModFfmpegWarning() {
            r3 = this;
            java.lang.Thread r0 = new java.lang.Thread
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda10 r1 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda10
            r1.<init>(r3)
            java.lang.String r2 = "JVM Main thread"
            r0.<init>(r1, r2)
            r0.start()
            return
    }

    private void startLaunchOnce() {
            r9 = this;
            monitor-enter(r9)
            boolean r0 = r9.launchStarted     // Catch: java.lang.Throwable -> L94
            if (r0 != 0) goto L92
            boolean r0 = r9.exiting     // Catch: java.lang.Throwable -> L94
            if (r0 == 0) goto Lb
            goto L92
        Lb:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L94
            boolean r0 = r9.shouldPauseLaunchForReplayModFfmpegWarning()
            if (r0 == 0) goto L13
            return
        L13:
            boolean r0 = r9.shouldPauseLaunchForMicrosoftAccountPreflight()
            if (r0 == 0) goto L1a
            return
        L1a:
            monitor-enter(r9)
            boolean r0 = r9.launchStarted     // Catch: java.lang.Throwable -> L8f
            if (r0 != 0) goto L8d
            boolean r0 = r9.exiting     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto L24
            goto L8d
        L24:
            r0 = 1
            r9.launchStarted = r0     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r1 = r9.versionId
            r9.configureInputBridgeForVersion(r1)
            org.lwjgl.glfw.CallbackBridge.setInputReady(r0)
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda35 r1 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda35
            r1.<init>(r9)
            r9.runOnUiThread(r1)
            ca.dnamobile.javalauncher.data.AccountStore r1 = new ca.dnamobile.javalauncher.data.AccountStore     // Catch: java.lang.Throwable -> L42
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L42
            ca.dnamobile.javalauncher.data.AccountStore$Account r1 = r1.load()     // Catch: java.lang.Throwable -> L42
            goto L4b
        L42:
            r1 = move-exception
            java.lang.String r2 = "GameActivity"
            java.lang.String r3 = "Could not load saved account"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r2, r3, r1)     // Catch: java.lang.Throwable -> L7c
            r1 = 0
        L4b:
            r4 = r1
            java.lang.String r1 = "launch Minecraft"
            ca.dnamobile.javalauncher.security.LauncherSecurity.requireOfficialBuildAndMicrosoftSession(r9, r4, r1)     // Catch: java.lang.Throwable -> L7c
            int r1 = org.lwjgl.glfw.CallbackBridge.windowWidth     // Catch: java.lang.Throwable -> L7c
            int r5 = java.lang.Math.max(r0, r1)     // Catch: java.lang.Throwable -> L7c
            int r1 = org.lwjgl.glfw.CallbackBridge.windowHeight     // Catch: java.lang.Throwable -> L7c
            int r6 = java.lang.Math.max(r0, r1)     // Catch: java.lang.Throwable -> L7c
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda36 r0 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda36     // Catch: java.lang.Throwable -> L7c
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L7c
            r9.runOnUiThread(r0)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r3 = r9.versionId     // Catch: java.lang.Throwable -> L7c
            java.lang.String r7 = r9.quickPlayWorld     // Catch: java.lang.Throwable -> L7c
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda37 r8 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda37     // Catch: java.lang.Throwable -> L7c
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L7c
            r2 = r9
            int r0 = ca.dnamobile.javalauncher.launcher.LaunchGame.runGame(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L7c
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda38 r1 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda38     // Catch: java.lang.Throwable -> L7c
            r1.<init>(r9, r0)     // Catch: java.lang.Throwable -> L7c
            r9.runOnUiThread(r1)     // Catch: java.lang.Throwable -> L7c
            goto L8c
        L7c:
            r0 = move-exception
            java.lang.String r1 = "GameActivity"
            java.lang.String r2 = "Launch failed"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r2, r0)
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda39 r1 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda39
            r1.<init>(r9, r0)
            r9.runOnUiThread(r1)
        L8c:
            return
        L8d:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L8f
            return
        L8f:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L8f
            throw r0
        L92:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L94
            return
        L94:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L94
            throw r0
    }

    private void startMicrosoftAccountPreflightOnUiThread() {
            r3 = this;
            boolean r0 = r3.exiting
            r1 = 0
            if (r0 != 0) goto L96
            boolean r0 = r3.isFinishing()
            if (r0 != 0) goto L96
            boolean r0 = r3.isDestroyed()
            if (r0 == 0) goto L13
            goto L96
        L13:
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r3.binding
            if (r0 == 0) goto L1c
            android.widget.TextView r0 = r0.textStatus
            r0.setVisibility(r1)
        L1c:
            java.lang.String r0 = "Checking Microsoft account login before launch..."
            r3.appendStatus(r0)
            ca.dnamobile.javalauncher.data.AccountStore r0 = r3.getAccountStoreForPreflight()
            if (r0 != 0) goto L2d
            java.lang.String r0 = "DroidBridge could not open the saved account store."
            r3.runTokenValidationAfterRefreshFailure(r0)
            return
        L2d:
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r0.load()     // Catch: java.lang.Throwable -> L7a
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r3.resolveMicrosoftAccountForPreflight(r0)
            if (r0 != 0) goto L41
            java.lang.String r0 = "Microsoft account refresh skipped: active launch account is offline/local."
            ca.dnamobile.javalauncher.GameActivity$PreLaunchMicrosoftSessionResult r0 = ca.dnamobile.javalauncher.GameActivity.PreLaunchMicrosoftSessionResult.ok(r0)
            r3.finishMicrosoftAccountSessionPreflight(r0)
            return
        L41:
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal r0 = r3.microsoftAuthManager
            if (r0 != 0) goto L4b
            java.lang.String r0 = "DroidBridge could not initialize the Microsoft refresh helper."
            r3.runTokenValidationAfterRefreshFailure(r0)
            return
        L4b:
            boolean r0 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal.isConfigured()
            if (r0 != 0) goto L57
            java.lang.String r0 = "Microsoft client ID is not configured, so DroidBridge could not refresh the login automatically."
            r3.runTokenValidationAfterRefreshFailure(r0)
            return
        L57:
            java.lang.String r0 = "Refreshing Microsoft account session..."
            r3.appendStatus(r0)
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal r0 = r3.microsoftAuthManager     // Catch: java.lang.Throwable -> L62
            r0.refreshMicrosoftAccount()     // Catch: java.lang.Throwable -> L62
            goto L79
        L62:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Microsoft account refresh could not start: "
            r1.<init>(r2)
            java.lang.String r0 = friendlyThrowableMessage(r0)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r3.runTokenValidationAfterRefreshFailure(r0)
        L79:
            return
        L7a:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "DroidBridge could not load the saved account before launch: "
            r1.<init>(r2)
            java.lang.String r0 = friendlyThrowableMessage(r0)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            ca.dnamobile.javalauncher.GameActivity$PreLaunchMicrosoftSessionResult r0 = ca.dnamobile.javalauncher.GameActivity.PreLaunchMicrosoftSessionResult.warning(r0)
            r3.finishMicrosoftAccountSessionPreflight(r0)
            return
        L96:
            r3.microsoftAccountPreflightPending = r1
            return
    }

    private void startQuitWatchdog() {
            r4 = this;
            java.lang.String r0 = r4.versionId
            boolean r0 = r4.isMinecraft26_2OrNewer(r0)
            if (r0 != 0) goto L9
            return
        L9:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r4.quitWatchdogHandler = r0
            ca.dnamobile.javalauncher.GameActivity$2 r0 = new ca.dnamobile.javalauncher.GameActivity$2
            r0.<init>(r4)
            r4.quitWatchdogRunnable = r0
            android.os.Handler r1 = r4.quitWatchdogHandler
            r2 = 3000(0xbb8, double:1.482E-320)
            r1.postDelayed(r0, r2)
            return
    }

    private void stopLogOverlayTicker() {
            r2 = this;
            android.os.Handler r0 = r2.logOverlayHandler
            if (r0 == 0) goto Lb
            java.lang.Runnable r1 = r2.logOverlayRunnable
            if (r1 == 0) goto Lb
            r0.removeCallbacks(r1)
        Lb:
            r0 = 0
            r2.logOverlayRunnable = r0
            r2.logOverlayHandler = r0
            return
    }

    private void styleDarkDialog(android.app.AlertDialog r4) {
            r3 = this;
            android.view.Window r0 = r4.getWindow()
            if (r0 != 0) goto L7
            return
        L7:
            android.view.Window r0 = r4.getWindow()
            int r1 = ca.dnamobile.javalauncher.GameActivity.COLOR_DIALOG_BG
            r2 = 24
            android.graphics.drawable.GradientDrawable r1 = r3.roundedDrawable(r1, r1, r2)
            r0.setBackgroundDrawable(r1)
            android.view.Window r4 = r4.getWindow()
            r0 = 1058306785(0x3f147ae1, float:0.58)
            r4.setDimAmount(r0)
            return
    }

    private static java.lang.String trimForDialog(java.lang.String r2, int r3) {
            if (r2 != 0) goto L5
            java.lang.String r2 = ""
            return r2
        L5:
            java.lang.String r2 = r2.trim()
            int r0 = r2.length()
            if (r0 > r3) goto L10
            return r2
        L10:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r3 = r3 + (-1)
            r1 = 0
            int r3 = java.lang.Math.max(r1, r3)
            java.lang.String r2 = r2.substring(r1, r3)
            java.lang.String r2 = r2.trim()
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r3 = "…"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
    }

    private java.lang.String trimToLastLines(java.lang.String r3, int r4) {
            r2 = this;
            java.lang.String r0 = "\n"
            r1 = -1
            java.lang.String[] r0 = r3.split(r0, r1)
            int r1 = r0.length
            if (r1 > r4) goto Lb
            return r3
        Lb:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = "...\n"
            r3.<init>(r1)
            int r1 = r0.length
            int r1 = r1 - r4
        L14:
            int r4 = r0.length
            if (r1 >= r4) goto L27
            r4 = r0[r1]
            r3.append(r4)
            int r1 = r1 + 1
            int r4 = r0.length
            if (r1 >= r4) goto L14
            r4 = 10
            r3.append(r4)
            goto L14
        L27:
            java.lang.String r3 = r3.toString()
            return r3
    }

    private ca.dnamobile.javalauncher.GameActivity.PreLaunchMicrosoftSessionResult validateMinecraftProfileToken(java.lang.String r10) {
            r9 = this;
            java.lang.String r0 = "DroidBridge could not verify the saved Minecraft session before launch ("
            java.lang.String r1 = "The saved Minecraft session token looks expired or rejected ("
            java.lang.String r2 = "HTTP "
            java.lang.String r3 = "Bearer "
            java.lang.String r4 = "DroidBridge could not contact Minecraft services to verify the saved session. You can continue for local play, but servers/Realms may fail if the token is expired.\n\nIssue: "
            r5 = 0
            java.net.URL r6 = new java.net.URL     // Catch: java.lang.Throwable -> Le5
            java.lang.String r7 = "https://api.minecraftservices.com/minecraft/profile"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Le5
            java.net.URLConnection r6 = r6.openConnection()     // Catch: java.lang.Throwable -> Le5
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch: java.lang.Throwable -> Le5
            java.lang.String r5 = "GET"
            r6.setRequestMethod(r5)     // Catch: java.lang.Throwable -> Le2
            java.lang.String r5 = "Authorization"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le2
            r7.<init>(r3)     // Catch: java.lang.Throwable -> Le2
            java.lang.StringBuilder r10 = r7.append(r10)     // Catch: java.lang.Throwable -> Le2
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> Le2
            r6.setRequestProperty(r5, r10)     // Catch: java.lang.Throwable -> Le2
            java.lang.String r10 = "Accept"
            java.lang.String r3 = "application/json"
            r6.setRequestProperty(r10, r3)     // Catch: java.lang.Throwable -> Le2
            r10 = 8000(0x1f40, float:1.121E-41)
            r6.setConnectTimeout(r10)     // Catch: java.lang.Throwable -> Le2
            r6.setReadTimeout(r10)     // Catch: java.lang.Throwable -> Le2
            r10 = 0
            r6.setUseCaches(r10)     // Catch: java.lang.Throwable -> Le2
            int r10 = r6.getResponseCode()     // Catch: java.lang.Throwable -> Le2
            r3 = 200(0xc8, float:2.8E-43)
            if (r10 < r3) goto L5a
            r3 = 300(0x12c, float:4.2E-43)
            if (r10 >= r3) goto L5a
            java.lang.String r10 = "Microsoft account session verified."
            ca.dnamobile.javalauncher.GameActivity$PreLaunchMicrosoftSessionResult r10 = ca.dnamobile.javalauncher.GameActivity.PreLaunchMicrosoftSessionResult.ok(r10)     // Catch: java.lang.Throwable -> Le2
            if (r6 == 0) goto L59
            r6.disconnect()
        L59:
            return r10
        L5a:
            java.lang.String r3 = readHttpErrorBody(r6)     // Catch: java.lang.Throwable -> Le2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le2
            r5.<init>(r2)     // Catch: java.lang.Throwable -> Le2
            java.lang.StringBuilder r2 = r5.append(r10)     // Catch: java.lang.Throwable -> Le2
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Le2
            r5 = 401(0x191, float:5.62E-43)
            java.lang.String r7 = ""
            java.lang.String r8 = "\n\nServer response: "
            if (r10 == r5) goto Lad
            r5 = 403(0x193, float:5.65E-43)
            if (r10 != r5) goto L78
            goto Lad
        L78:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le2
            r10.<init>(r0)     // Catch: java.lang.Throwable -> Le2
            java.lang.StringBuilder r10 = r10.append(r2)     // Catch: java.lang.Throwable -> Le2
            java.lang.String r0 = "). You can continue, but multiplayer/Realms may not work correctly."
            java.lang.StringBuilder r10 = r10.append(r0)     // Catch: java.lang.Throwable -> Le2
            boolean r0 = isNullOrBlank(r3)     // Catch: java.lang.Throwable -> Le2
            if (r0 == 0) goto L8e
            goto L9b
        L8e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le2
            r0.<init>(r8)     // Catch: java.lang.Throwable -> Le2
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch: java.lang.Throwable -> Le2
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Throwable -> Le2
        L9b:
            java.lang.StringBuilder r10 = r10.append(r7)     // Catch: java.lang.Throwable -> Le2
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> Le2
            ca.dnamobile.javalauncher.GameActivity$PreLaunchMicrosoftSessionResult r10 = ca.dnamobile.javalauncher.GameActivity.PreLaunchMicrosoftSessionResult.warning(r10)     // Catch: java.lang.Throwable -> Le2
            if (r6 == 0) goto Lac
            r6.disconnect()
        Lac:
            return r10
        Lad:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le2
            r10.<init>(r1)     // Catch: java.lang.Throwable -> Le2
            java.lang.StringBuilder r10 = r10.append(r2)     // Catch: java.lang.Throwable -> Le2
            java.lang.String r0 = "). Servers and Realms may fail until the account is refreshed."
            java.lang.StringBuilder r10 = r10.append(r0)     // Catch: java.lang.Throwable -> Le2
            boolean r0 = isNullOrBlank(r3)     // Catch: java.lang.Throwable -> Le2
            if (r0 == 0) goto Lc3
            goto Ld0
        Lc3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le2
            r0.<init>(r8)     // Catch: java.lang.Throwable -> Le2
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch: java.lang.Throwable -> Le2
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Throwable -> Le2
        Ld0:
            java.lang.StringBuilder r10 = r10.append(r7)     // Catch: java.lang.Throwable -> Le2
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> Le2
            ca.dnamobile.javalauncher.GameActivity$PreLaunchMicrosoftSessionResult r10 = ca.dnamobile.javalauncher.GameActivity.PreLaunchMicrosoftSessionResult.warning(r10)     // Catch: java.lang.Throwable -> Le2
            if (r6 == 0) goto Le1
            r6.disconnect()
        Le1:
            return r10
        Le2:
            r10 = move-exception
            r5 = r6
            goto Le6
        Le5:
            r10 = move-exception
        Le6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L101
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L101
            java.lang.String r10 = friendlyThrowableMessage(r10)     // Catch: java.lang.Throwable -> L101
            java.lang.StringBuilder r10 = r0.append(r10)     // Catch: java.lang.Throwable -> L101
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L101
            ca.dnamobile.javalauncher.GameActivity$PreLaunchMicrosoftSessionResult r10 = ca.dnamobile.javalauncher.GameActivity.PreLaunchMicrosoftSessionResult.warning(r10)     // Catch: java.lang.Throwable -> L101
            if (r5 == 0) goto L100
            r5.disconnect()
        L100:
            return r10
        L101:
            r10 = move-exception
            if (r5 == 0) goto L107
            r5.disconnect()
        L107:
            throw r10
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent r5) {
            r4 = this;
            boolean r0 = isGamepadMotionEvent(r5)
            r1 = 1
            if (r0 == 0) goto L86
            boolean r0 = r4.shouldRouteGamepadToMinecraftFallback()
            if (r0 == 0) goto L15
            org.lwjgl.glfw.CallbackBridge.setInputReady(r1)
            boolean r5 = super.dispatchGenericMotionEvent(r5)
            return r5
        L15:
            boolean r0 = r4.shouldConsumeLauncherGamepadInput()
            if (r0 == 0) goto L1c
            return r1
        L1c:
            org.lwjgl.glfw.CallbackBridge.setInputReady(r1)
            boolean r0 = net.kdt.pojavlaunch.MinecraftGLSurface.sdlEnabled
            if (r0 == 0) goto L7b
            int r0 = r5.getSource()
            r2 = 16777232(0x1000010, float:2.3509932E-38)
            r0 = r0 & r2
            if (r0 != r2) goto L7b
            r0 = 0
            boolean r0 = org.libsdl.app.SDLControllerManager.handleJoystickMotionEvent(r5)     // Catch: java.lang.Throwable -> L35 java.lang.UnsatisfiedLinkError -> L61
            if (r0 == 0) goto L7b
            return r1
        L35:
            r5 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "SDL controller routing disabled after controller motion failure: "
            r2.<init>(r3)
            java.lang.Class r3 = r5.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ": "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r5 = r5.getMessage()
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r5 = r5.toString()
            net.kdt.pojavlaunch.Logger.appendToLog(r5)
            net.kdt.pojavlaunch.MinecraftGLSurface.sdlEnabled = r0
            return r1
        L61:
            r5 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "SDL controller routing disabled: SDLControllerManager native glue is missing: "
            r2.<init>(r3)
            java.lang.String r5 = r5.getMessage()
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r5 = r5.toString()
            net.kdt.pojavlaunch.Logger.appendToLog(r5)
            net.kdt.pojavlaunch.MinecraftGLSurface.sdlEnabled = r0
            return r1
        L7b:
            ca.dnamobile.javalauncher.input.GamepadInputController r0 = r4.gamepadInputController
            if (r0 == 0) goto L86
            boolean r0 = r0.handleMotionEvent(r5)
            if (r0 == 0) goto L86
            return r1
        L86:
            org.lwjgl.glfw.CallbackBridge.setInputReady(r1)
            boolean r5 = super.dispatchGenericMotionEvent(r5)
            return r5
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r6) {
            r5 = this;
            boolean r0 = r5.handleInGameControlsBackShortcut(r6)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r5.routePhysicalKeyboardEscapeToMinecraft(r6)
            if (r0 == 0) goto Lf
            return r1
        Lf:
            boolean r0 = isGamepadKeyEvent(r6)
            if (r0 == 0) goto Laa
            boolean r0 = r5.shouldRouteGamepadToMinecraftFallback()
            if (r0 == 0) goto L23
            org.lwjgl.glfw.CallbackBridge.setInputReady(r1)
            boolean r6 = super.dispatchKeyEvent(r6)
            return r6
        L23:
            boolean r0 = r5.shouldConsumeLauncherGamepadInput()
            if (r0 == 0) goto L2a
            return r1
        L2a:
            org.lwjgl.glfw.CallbackBridge.setInputReady(r1)
            boolean r0 = net.kdt.pojavlaunch.MinecraftGLSurface.sdlEnabled
            if (r0 == 0) goto L9f
            r0 = 0
            int r2 = r6.getDeviceId()     // Catch: java.lang.Throwable -> L59 java.lang.UnsatisfiedLinkError -> L85
            int r3 = r6.getKeyCode()     // Catch: java.lang.Throwable -> L59 java.lang.UnsatisfiedLinkError -> L85
            int r4 = r6.getAction()     // Catch: java.lang.Throwable -> L59 java.lang.UnsatisfiedLinkError -> L85
            if (r4 != 0) goto L47
            boolean r2 = org.libsdl.app.SDLControllerManager.onNativePadDown(r2, r3)     // Catch: java.lang.Throwable -> L59 java.lang.UnsatisfiedLinkError -> L85
            if (r2 == 0) goto L54
            return r1
        L47:
            int r4 = r6.getAction()     // Catch: java.lang.Throwable -> L59 java.lang.UnsatisfiedLinkError -> L85
            if (r4 != r1) goto L54
            boolean r2 = org.libsdl.app.SDLControllerManager.onNativePadUp(r2, r3)     // Catch: java.lang.Throwable -> L59 java.lang.UnsatisfiedLinkError -> L85
            if (r2 == 0) goto L54
            return r1
        L54:
            boolean r6 = super.dispatchKeyEvent(r6)     // Catch: java.lang.Throwable -> L59 java.lang.UnsatisfiedLinkError -> L85
            return r6
        L59:
            r6 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "SDL controller routing disabled after key failure: "
            r2.<init>(r3)
            java.lang.Class r3 = r6.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ": "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r6 = r6.getMessage()
            java.lang.StringBuilder r6 = r2.append(r6)
            java.lang.String r6 = r6.toString()
            net.kdt.pojavlaunch.Logger.appendToLog(r6)
            net.kdt.pojavlaunch.MinecraftGLSurface.sdlEnabled = r0
            return r1
        L85:
            r6 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "SDL controller routing disabled: SDLControllerManager key native glue is missing: "
            r2.<init>(r3)
            java.lang.String r6 = r6.getMessage()
            java.lang.StringBuilder r6 = r2.append(r6)
            java.lang.String r6 = r6.toString()
            net.kdt.pojavlaunch.Logger.appendToLog(r6)
            net.kdt.pojavlaunch.MinecraftGLSurface.sdlEnabled = r0
            return r1
        L9f:
            ca.dnamobile.javalauncher.input.GamepadInputController r0 = r5.gamepadInputController
            if (r0 == 0) goto Laa
            boolean r0 = r0.handleKeyEvent(r6)
            if (r0 == 0) goto Laa
            return r1
        Laa:
            org.lwjgl.glfw.CallbackBridge.setInputReady(r1)
            boolean r6 = super.dispatchKeyEvent(r6)
            return r6
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
            r0 = this;
            r0.openGamepadMappingDialogFromBackShortcut()
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(android.os.Bundle r3) {
            r2 = this;
            super.onCreate(r3)
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r2)
            r2.prepareRendererEnvironmentBeforeBridgeLoad()
            org.lwjgl.glfw.CallbackBridge.init(r2)
            r2.configureDroidBridgeRenderSpecAfterBridgeLoad()
            android.content.Intent r3 = r2.getIntent()
            java.lang.String r0 = "ca.dnamobile.javalauncher.extra.VERSION_ID"
            java.lang.String r3 = r3.getStringExtra(r0)
            r2.versionId = r3
            if (r3 == 0) goto La4
            java.lang.String r3 = r3.trim()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto La4
            android.content.Intent r3 = r2.getIntent()
            java.lang.String r0 = "ca.dnamobile.javalauncher.extra.QUICK_PLAY_WORLD"
            java.lang.String r3 = r3.getStringExtra(r0)
            r2.quickPlayWorld = r3
            java.lang.String r3 = r2.versionId
            r2.configureInputBridgeForVersion(r3)
            r3 = 1
            org.lwjgl.glfw.CallbackBridge.setInputReady(r3)
            r2.configureWindow()
            android.view.LayoutInflater r3 = r2.getLayoutInflater()
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r3 = ca.dnamobile.javalauncher.databinding.ActivityGameBinding.inflate(r3)
            r2.binding = r3
            android.widget.FrameLayout r3 = r3.getRoot()
            r2.setContentView(r3)
            r2.applyGameDisplaySurfaceOptions()
            r2.setupMicrosoftAccountPreflightManager()
            r2.installCursorOverlay()
            r2.installTouchControlsOverlay()
            r2.configureLogOverlay()
            r2.configureInGameSettingsButton()
            r2.startQuitWatchdog()
            ca.dnamobile.javalauncher.input.GamepadInputController r3 = new ca.dnamobile.javalauncher.input.GamepadInputController
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r0 = r2.binding
            android.widget.FrameLayout r0 = r0.getRoot()
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda22 r1 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda22
            r1.<init>(r2)
            r3.<init>(r0, r1)
            r2.gamepadInputController = r3
            r2.configureWindow()
            int r3 = ca.dnamobile.javalauncher.R.string.game_surface_waiting
            java.lang.String r3 = r2.getString(r3)
            r2.appendStatus(r3)
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r3 = r2.binding
            net.kdt.pojavlaunch.MinecraftGLSurface r3 = r3.minecraftSurface
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda33 r0 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda33
            r0.<init>(r2)
            r3.setOnRenderingStartedListener(r0)
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r3 = r2.binding
            net.kdt.pojavlaunch.MinecraftGLSurface r3 = r3.minecraftSurface
            ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda44 r0 = new ca.dnamobile.javalauncher.GameActivity$$ExternalSyntheticLambda44
            r0.<init>(r2)
            r3.setSurfaceReadyListener(r0)
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r3 = r2.binding
            net.kdt.pojavlaunch.MinecraftGLSurface r3 = r3.minecraftSurface
            r0 = 0
            r3.start(r0)
            return
        La4:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "No version id was provided to GameActivity."
            r3.<init>(r0)
            throw r3
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
            r3 = this;
            r0 = 1
            r3.exiting = r0
            android.app.AlertDialog r0 = r3.inGameControlsDialog
            r3.dismissDialog(r0)
            r0 = 0
            r3.inGameControlsDialog = r0
            r3.stopLogOverlayTicker()
            android.os.Handler r1 = r3.quitWatchdogHandler
            if (r1 == 0) goto L19
            java.lang.Runnable r2 = r3.quitWatchdogRunnable
            if (r2 == 0) goto L19
            r1.removeCallbacks(r2)
        L19:
            r3.quitWatchdogRunnable = r0
            r3.quitWatchdogHandler = r0
            org.lwjgl.glfw.CallbackBridge.clearInputFocus()
            r1 = 0
            org.lwjgl.glfw.CallbackBridge.setInputReady(r1)
            ca.dnamobile.javalauncher.input.GamepadInputController r1 = r3.gamepadInputController
            if (r1 == 0) goto L2d
            r1.removeSelf()
            r3.gamepadInputController = r0
        L2d:
            ca.dnamobile.javalauncher.input.GameCursorOverlay r1 = r3.gameCursorOverlay
            if (r1 == 0) goto L36
            r1.removeSelf()
            r3.gameCursorOverlay = r0
        L36:
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay r1 = r3.touchControlsOverlay
            if (r1 == 0) goto L49
            android.view.ViewParent r1 = r1.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L47
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay r2 = r3.touchControlsOverlay
            r1.removeView(r2)
        L47:
            r3.touchControlsOverlay = r0
        L49:
            ca.dnamobile.javalauncher.game.FloatingGameSettingsOverlayController r1 = r3.floatingGameSettingsOverlayController
            if (r1 == 0) goto L52
            r1.detach()
            r3.floatingGameSettingsOverlayController = r0
        L52:
            ca.dnamobile.javalauncher.databinding.ActivityGameBinding r1 = r3.binding
            if (r1 == 0) goto L5e
            net.kdt.pojavlaunch.MinecraftGLSurface r1 = r1.minecraftSurface
            r1.setSurfaceReadyListener(r0)
            r1.setOnRenderingStartedListener(r0)
        L5e:
            r3.binding = r0
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal r1 = r3.microsoftAuthManager
            if (r1 == 0) goto L69
            r1.dispose()
            r3.microsoftAuthManager = r0
        L69:
            r3.accountStore = r0
            ca.dnamobile.javalauncher.modcompat.ControlifySDL.reset()
            ca.dnamobile.javalauncher.modcompat.ControllerModCompat.reset()
            ca.dnamobile.javalauncher.launcher.LaunchGame.resetLaunchState()
            super.onDestroy()
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
            r1 = this;
            ca.dnamobile.javalauncher.game.FloatingGameSettingsOverlayController r0 = r1.floatingGameSettingsOverlayController
            if (r0 == 0) goto L7
            r0.pause()
        L7:
            org.lwjgl.glfw.CallbackBridge.clearInputFocus()
            super.onPause()
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
            r1 = this;
            super.onResume()
            r1.configureWindow()
            java.lang.String r0 = r1.versionId
            r1.configureInputBridgeForVersion(r0)
            r0 = 1
            org.lwjgl.glfw.CallbackBridge.setInputReady(r0)
            org.lwjgl.glfw.CallbackBridge.ensureInputFocus()
            r1.refreshTouchControlsOverlay()
            ca.dnamobile.javalauncher.game.FloatingGameSettingsOverlayController r0 = r1.floatingGameSettingsOverlayController
            if (r0 == 0) goto L1c
            r0.resume()
        L1c:
            r1.scheduleMinecraftSurfaceRefresh()
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean r1) {
            r0 = this;
            super.onWindowFocusChanged(r1)
            if (r1 == 0) goto Lb
            r0.configureWindow()
            r0.scheduleMinecraftSurfaceRefresh()
        Lb:
            return
    }
}
