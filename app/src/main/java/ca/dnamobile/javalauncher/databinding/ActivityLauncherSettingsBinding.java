package ca.dnamobile.javalauncher.databinding;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityLauncherSettingsBinding implements androidx.viewbinding.ViewBinding {
    public final com.google.android.material.button.MaterialButton buttonAddMicrosoftAccount;
    public final com.google.android.material.button.MaterialButton buttonBackupDroidBridgeData;
    public final com.google.android.material.button.MaterialButton buttonChangeMicrosoftCape;
    public final com.google.android.material.button.MaterialButton buttonChangeMicrosoftSkin;
    public final com.google.android.material.button.MaterialButton buttonClearRendererPluginCache;
    public final com.google.android.material.button.MaterialButton buttonDownloadRenderers;
    public final com.google.android.material.button.MaterialButton buttonEditBuiltInController;
    public final com.google.android.material.button.MaterialButton buttonExecuteJarFile;
    public final com.google.android.material.button.MaterialButton buttonGrantRendererStorageAccess;
    public final com.google.android.material.button.MaterialButton buttonImportRendererPlugin;
    public final com.google.android.material.button.MaterialButton buttonManageMicrosoftAccounts;
    public final com.google.android.material.button.MaterialButton buttonManageOfflineAccounts;
    public final com.google.android.material.button.MaterialButton buttonManageTouchControls;
    public final com.google.android.material.button.MaterialButton buttonMouseCursorIconSettings;
    public final com.google.android.material.button.MaterialButton buttonOpenDroidBridgeLicense;
    public final com.google.android.material.button.MaterialButton buttonOpenDroidBridgeTerms;
    public final com.google.android.material.button.MaterialButton buttonOpenMinecraftEula;
    public final com.google.android.material.button.MaterialButton buttonOpenPrivacyPolicy;
    public final com.google.android.material.button.MaterialButton buttonRefreshMicrosoftSkin;
    public final com.google.android.material.button.MaterialButton buttonRefreshRenderers;
    public final com.google.android.material.button.MaterialButton buttonReinstallRuntimeComponents;
    public final com.google.android.material.button.MaterialButton buttonRestoreDroidBridgeData;
    public final com.google.android.material.button.MaterialButton buttonSettingsBack;
    public final com.google.android.material.button.MaterialButton buttonShareLatestLog;
    public final com.google.android.material.button.MaterialButton buttonSignIn;
    public final com.google.android.material.button.MaterialButton buttonSignOut;
    public final com.google.android.material.button.MaterialButton buttonSimpleVoiceChatMicrophonePermission;
    public final com.google.android.material.button.MaterialButton buttonUseMicrosoftAccount;
    public final com.google.android.material.card.MaterialCardView cardAccountSettings;
    public final com.google.android.material.card.MaterialCardView cardControllerSettings;
    public final com.google.android.material.card.MaterialCardView cardInstanceSettings;
    public final com.google.android.material.card.MaterialCardView cardLauncherSettings;
    public final com.google.android.material.card.MaterialCardView cardPrivacyPolicySettings;
    public final com.google.android.material.card.MaterialCardView cardRendererSettings;
    public final com.google.android.material.card.MaterialCardView cardSettingsTabsHeader;
    public final android.widget.CheckBox checkKeepLogs;
    public final android.widget.LinearLayout layoutControllerSettings;
    public final android.widget.LinearLayout layoutRendererPickerRow;
    public final android.widget.LinearLayout layoutVulkanDriverSettings;
    public final ca.dnamobile.javalauncher.skin.PlayerModelPreviewView modelPlayerPreview;
    private final android.view.View rootView;
    public final android.widget.FrameLayout settingsContent;
    public final android.view.View settingsRoot;
    public final android.widget.ScrollView settingsScrollView;
    public final com.google.android.material.tabs.TabLayout settingsSectionTabs;
    public final android.widget.LinearLayout settingsTabsHeader;
    public final android.view.View settingsTopContentScrim;
    public final android.widget.SeekBar sliderAllocatedRam;
    public final android.widget.SeekBar sliderGameResolutionScale;
    public final android.widget.Spinner spinnerRenderer;
    public final android.widget.Spinner spinnerVulkanDriver;
    public final com.google.android.material.switchmaterial.SwitchMaterial switchAvoidRoundedCorners;
    public final com.google.android.material.switchmaterial.SwitchMaterial switchDoubleTapToDrop;
    public final com.google.android.material.switchmaterial.SwitchMaterial switchForceFullscreenMode;
    public final com.google.android.material.switchmaterial.SwitchMaterial switchForceSdlControllerBridge;
    public final com.google.android.material.switchmaterial.SwitchMaterial switchIgnoreDisplayCutout;
    public final com.google.android.material.switchmaterial.SwitchMaterial switchInstallNotifications;
    public final com.google.android.material.switchmaterial.SwitchMaterial switchMinecraftTouchGestures;
    public final com.google.android.material.switchmaterial.SwitchMaterial switchRemoveInheritedVanilla;
    public final com.google.android.material.switchmaterial.SwitchMaterial switchShowGameLogOverlay;
    public final com.google.android.material.switchmaterial.SwitchMaterial switchShowInGameSettingsButton;
    public final com.google.android.material.switchmaterial.SwitchMaterial switchShowSharedInstalls;
    public final com.google.android.material.switchmaterial.SwitchMaterial switchTouchControlsEnabled;
    public final com.google.android.material.switchmaterial.SwitchMaterial switchUseNativeSurface;
    public final com.google.android.material.switchmaterial.SwitchMaterial switchUseOpenGlFor26Plus;
    public final com.google.android.material.switchmaterial.SwitchMaterial switchUseSystemVulkanDriver;
    public final android.widget.TextView textAccountStatus;
    public final android.widget.TextView textAllocatedRam;
    public final android.widget.TextView textAvailableRamSummary;
    public final android.widget.TextView textDoubleTapToDropSummary;
    public final android.widget.TextView textDroidBridgeBackupSummary;
    public final android.widget.TextView textFolder;
    public final android.widget.TextView textGameResolutionScale;
    public final android.widget.TextView textGameResolutionScaleSummary;
    public final android.widget.TextView textInstallNotificationsSummary;
    public final android.widget.TextView textJarExecutionSummary;
    public final android.widget.TextView textMinecraftTouchGesturesSummary;
    public final android.widget.TextView textMouseCursorIconSummary;
    public final android.widget.TextView textPrivacyPolicySummary;
    public final android.widget.TextView textRendererPluginConfig;
    public final android.widget.TextView textRuntimeComponentsSummary;
    public final android.widget.TextView textSettingsHeaderTitle;
    public final android.widget.TextView textSimpleVoiceChatMicrophoneStatus;
    public final android.widget.TextView textSkinStatus;
    public final android.widget.TextView textVulkanDriverDescription;

    private ActivityLauncherSettingsBinding(android.view.View r3, com.google.android.material.button.MaterialButton r4, com.google.android.material.button.MaterialButton r5, com.google.android.material.button.MaterialButton r6, com.google.android.material.button.MaterialButton r7, com.google.android.material.button.MaterialButton r8, com.google.android.material.button.MaterialButton r9, com.google.android.material.button.MaterialButton r10, com.google.android.material.button.MaterialButton r11, com.google.android.material.button.MaterialButton r12, com.google.android.material.button.MaterialButton r13, com.google.android.material.button.MaterialButton r14, com.google.android.material.button.MaterialButton r15, com.google.android.material.button.MaterialButton r16, com.google.android.material.button.MaterialButton r17, com.google.android.material.button.MaterialButton r18, com.google.android.material.button.MaterialButton r19, com.google.android.material.button.MaterialButton r20, com.google.android.material.button.MaterialButton r21, com.google.android.material.button.MaterialButton r22, com.google.android.material.button.MaterialButton r23, com.google.android.material.button.MaterialButton r24, com.google.android.material.button.MaterialButton r25, com.google.android.material.button.MaterialButton r26, com.google.android.material.button.MaterialButton r27, com.google.android.material.button.MaterialButton r28, com.google.android.material.button.MaterialButton r29, com.google.android.material.button.MaterialButton r30, com.google.android.material.button.MaterialButton r31, com.google.android.material.card.MaterialCardView r32, com.google.android.material.card.MaterialCardView r33, com.google.android.material.card.MaterialCardView r34, com.google.android.material.card.MaterialCardView r35, com.google.android.material.card.MaterialCardView r36, com.google.android.material.card.MaterialCardView r37, com.google.android.material.card.MaterialCardView r38, android.widget.CheckBox r39, android.widget.LinearLayout r40, android.widget.LinearLayout r41, android.widget.LinearLayout r42, ca.dnamobile.javalauncher.skin.PlayerModelPreviewView r43, android.widget.FrameLayout r44, android.view.View r45, android.widget.ScrollView r46, com.google.android.material.tabs.TabLayout r47, android.widget.LinearLayout r48, android.view.View r49, android.widget.SeekBar r50, android.widget.SeekBar r51, android.widget.Spinner r52, android.widget.Spinner r53, com.google.android.material.switchmaterial.SwitchMaterial r54, com.google.android.material.switchmaterial.SwitchMaterial r55, com.google.android.material.switchmaterial.SwitchMaterial r56, com.google.android.material.switchmaterial.SwitchMaterial r57, com.google.android.material.switchmaterial.SwitchMaterial r58, com.google.android.material.switchmaterial.SwitchMaterial r59, com.google.android.material.switchmaterial.SwitchMaterial r60, com.google.android.material.switchmaterial.SwitchMaterial r61, com.google.android.material.switchmaterial.SwitchMaterial r62, com.google.android.material.switchmaterial.SwitchMaterial r63, com.google.android.material.switchmaterial.SwitchMaterial r64, com.google.android.material.switchmaterial.SwitchMaterial r65, com.google.android.material.switchmaterial.SwitchMaterial r66, com.google.android.material.switchmaterial.SwitchMaterial r67, com.google.android.material.switchmaterial.SwitchMaterial r68, android.widget.TextView r69, android.widget.TextView r70, android.widget.TextView r71, android.widget.TextView r72, android.widget.TextView r73, android.widget.TextView r74, android.widget.TextView r75, android.widget.TextView r76, android.widget.TextView r77, android.widget.TextView r78, android.widget.TextView r79, android.widget.TextView r80, android.widget.TextView r81, android.widget.TextView r82, android.widget.TextView r83, android.widget.TextView r84, android.widget.TextView r85, android.widget.TextView r86, android.widget.TextView r87) {
            r2 = this;
            r0 = r2
            r2.<init>()
            r1 = r3
            r0.rootView = r1
            r1 = r4
            r0.buttonAddMicrosoftAccount = r1
            r1 = r5
            r0.buttonBackupDroidBridgeData = r1
            r1 = r6
            r0.buttonChangeMicrosoftCape = r1
            r1 = r7
            r0.buttonChangeMicrosoftSkin = r1
            r1 = r8
            r0.buttonClearRendererPluginCache = r1
            r1 = r9
            r0.buttonDownloadRenderers = r1
            r1 = r10
            r0.buttonEditBuiltInController = r1
            r1 = r11
            r0.buttonExecuteJarFile = r1
            r1 = r12
            r0.buttonGrantRendererStorageAccess = r1
            r1 = r13
            r0.buttonImportRendererPlugin = r1
            r1 = r14
            r0.buttonManageMicrosoftAccounts = r1
            r1 = r15
            r0.buttonManageOfflineAccounts = r1
            r1 = r16
            r0.buttonManageTouchControls = r1
            r1 = r17
            r0.buttonMouseCursorIconSettings = r1
            r1 = r18
            r0.buttonOpenDroidBridgeLicense = r1
            r1 = r19
            r0.buttonOpenDroidBridgeTerms = r1
            r1 = r20
            r0.buttonOpenMinecraftEula = r1
            r1 = r21
            r0.buttonOpenPrivacyPolicy = r1
            r1 = r22
            r0.buttonRefreshMicrosoftSkin = r1
            r1 = r23
            r0.buttonRefreshRenderers = r1
            r1 = r24
            r0.buttonReinstallRuntimeComponents = r1
            r1 = r25
            r0.buttonRestoreDroidBridgeData = r1
            r1 = r26
            r0.buttonSettingsBack = r1
            r1 = r27
            r0.buttonShareLatestLog = r1
            r1 = r28
            r0.buttonSignIn = r1
            r1 = r29
            r0.buttonSignOut = r1
            r1 = r30
            r0.buttonSimpleVoiceChatMicrophonePermission = r1
            r1 = r31
            r0.buttonUseMicrosoftAccount = r1
            r1 = r32
            r0.cardAccountSettings = r1
            r1 = r33
            r0.cardControllerSettings = r1
            r1 = r34
            r0.cardInstanceSettings = r1
            r1 = r35
            r0.cardLauncherSettings = r1
            r1 = r36
            r0.cardPrivacyPolicySettings = r1
            r1 = r37
            r0.cardRendererSettings = r1
            r1 = r38
            r0.cardSettingsTabsHeader = r1
            r1 = r39
            r0.checkKeepLogs = r1
            r1 = r40
            r0.layoutControllerSettings = r1
            r1 = r41
            r0.layoutRendererPickerRow = r1
            r1 = r42
            r0.layoutVulkanDriverSettings = r1
            r1 = r43
            r0.modelPlayerPreview = r1
            r1 = r44
            r0.settingsContent = r1
            r1 = r45
            r0.settingsRoot = r1
            r1 = r46
            r0.settingsScrollView = r1
            r1 = r47
            r0.settingsSectionTabs = r1
            r1 = r48
            r0.settingsTabsHeader = r1
            r1 = r49
            r0.settingsTopContentScrim = r1
            r1 = r50
            r0.sliderAllocatedRam = r1
            r1 = r51
            r0.sliderGameResolutionScale = r1
            r1 = r52
            r0.spinnerRenderer = r1
            r1 = r53
            r0.spinnerVulkanDriver = r1
            r1 = r54
            r0.switchAvoidRoundedCorners = r1
            r1 = r55
            r0.switchDoubleTapToDrop = r1
            r1 = r56
            r0.switchForceFullscreenMode = r1
            r1 = r57
            r0.switchForceSdlControllerBridge = r1
            r1 = r58
            r0.switchIgnoreDisplayCutout = r1
            r1 = r59
            r0.switchInstallNotifications = r1
            r1 = r60
            r0.switchMinecraftTouchGestures = r1
            r1 = r61
            r0.switchRemoveInheritedVanilla = r1
            r1 = r62
            r0.switchShowGameLogOverlay = r1
            r1 = r63
            r0.switchShowInGameSettingsButton = r1
            r1 = r64
            r0.switchShowSharedInstalls = r1
            r1 = r65
            r0.switchTouchControlsEnabled = r1
            r1 = r66
            r0.switchUseNativeSurface = r1
            r1 = r67
            r0.switchUseOpenGlFor26Plus = r1
            r1 = r68
            r0.switchUseSystemVulkanDriver = r1
            r1 = r69
            r0.textAccountStatus = r1
            r1 = r70
            r0.textAllocatedRam = r1
            r1 = r71
            r0.textAvailableRamSummary = r1
            r1 = r72
            r0.textDoubleTapToDropSummary = r1
            r1 = r73
            r0.textDroidBridgeBackupSummary = r1
            r1 = r74
            r0.textFolder = r1
            r1 = r75
            r0.textGameResolutionScale = r1
            r1 = r76
            r0.textGameResolutionScaleSummary = r1
            r1 = r77
            r0.textInstallNotificationsSummary = r1
            r1 = r78
            r0.textJarExecutionSummary = r1
            r1 = r79
            r0.textMinecraftTouchGesturesSummary = r1
            r1 = r80
            r0.textMouseCursorIconSummary = r1
            r1 = r81
            r0.textPrivacyPolicySummary = r1
            r1 = r82
            r0.textRendererPluginConfig = r1
            r1 = r83
            r0.textRuntimeComponentsSummary = r1
            r1 = r84
            r0.textSettingsHeaderTitle = r1
            r1 = r85
            r0.textSimpleVoiceChatMicrophoneStatus = r1
            r1 = r86
            r0.textSkinStatus = r1
            r1 = r87
            r0.textVulkanDriverDescription = r1
            return
    }

    public static ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding bind(android.view.View r87) {
            r15 = r87
            int r0 = ca.dnamobile.javalauncher.R.id.buttonAddMicrosoftAccount
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r2 = r1
            com.google.android.material.button.MaterialButton r2 = (com.google.android.material.button.MaterialButton) r2
            if (r2 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.buttonBackupDroidBridgeData
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r3 = r1
            com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
            if (r3 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.buttonChangeMicrosoftCape
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r4 = r1
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            if (r4 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.buttonChangeMicrosoftSkin
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r5 = r1
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            if (r5 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.buttonClearRendererPluginCache
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r6 = r1
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            if (r6 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.buttonDownloadRenderers
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r7 = r1
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            if (r7 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.buttonEditBuiltInController
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r8 = r1
            com.google.android.material.button.MaterialButton r8 = (com.google.android.material.button.MaterialButton) r8
            if (r8 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.buttonExecuteJarFile
            android.view.View r0 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r9 = r0
            com.google.android.material.button.MaterialButton r9 = (com.google.android.material.button.MaterialButton) r9
            int r0 = ca.dnamobile.javalauncher.R.id.buttonGrantRendererStorageAccess
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r10 = r1
            com.google.android.material.button.MaterialButton r10 = (com.google.android.material.button.MaterialButton) r10
            if (r10 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.buttonImportRendererPlugin
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r11 = r1
            com.google.android.material.button.MaterialButton r11 = (com.google.android.material.button.MaterialButton) r11
            if (r11 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.buttonManageMicrosoftAccounts
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r12 = r1
            com.google.android.material.button.MaterialButton r12 = (com.google.android.material.button.MaterialButton) r12
            if (r12 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.buttonManageOfflineAccounts
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r13 = r1
            com.google.android.material.button.MaterialButton r13 = (com.google.android.material.button.MaterialButton) r13
            if (r13 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.buttonManageTouchControls
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r14 = r1
            com.google.android.material.button.MaterialButton r14 = (com.google.android.material.button.MaterialButton) r14
            if (r14 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.buttonMouseCursorIconSettings
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r16 = r1
            com.google.android.material.button.MaterialButton r16 = (com.google.android.material.button.MaterialButton) r16
            if (r16 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.buttonOpenDroidBridgeLicense
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r17 = r1
            com.google.android.material.button.MaterialButton r17 = (com.google.android.material.button.MaterialButton) r17
            if (r17 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.buttonOpenDroidBridgeTerms
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r18 = r1
            com.google.android.material.button.MaterialButton r18 = (com.google.android.material.button.MaterialButton) r18
            if (r18 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.buttonOpenMinecraftEula
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r19 = r1
            com.google.android.material.button.MaterialButton r19 = (com.google.android.material.button.MaterialButton) r19
            if (r19 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.buttonOpenPrivacyPolicy
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r20 = r1
            com.google.android.material.button.MaterialButton r20 = (com.google.android.material.button.MaterialButton) r20
            if (r20 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.buttonRefreshMicrosoftSkin
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r21 = r1
            com.google.android.material.button.MaterialButton r21 = (com.google.android.material.button.MaterialButton) r21
            if (r21 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.buttonRefreshRenderers
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r22 = r1
            com.google.android.material.button.MaterialButton r22 = (com.google.android.material.button.MaterialButton) r22
            if (r22 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.buttonReinstallRuntimeComponents
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r23 = r1
            com.google.android.material.button.MaterialButton r23 = (com.google.android.material.button.MaterialButton) r23
            if (r23 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.buttonRestoreDroidBridgeData
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r24 = r1
            com.google.android.material.button.MaterialButton r24 = (com.google.android.material.button.MaterialButton) r24
            if (r24 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.buttonSettingsBack
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r25 = r1
            com.google.android.material.button.MaterialButton r25 = (com.google.android.material.button.MaterialButton) r25
            if (r25 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.buttonShareLatestLog
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r26 = r1
            com.google.android.material.button.MaterialButton r26 = (com.google.android.material.button.MaterialButton) r26
            if (r26 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.buttonSignIn
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r27 = r1
            com.google.android.material.button.MaterialButton r27 = (com.google.android.material.button.MaterialButton) r27
            if (r27 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.buttonSignOut
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r28 = r1
            com.google.android.material.button.MaterialButton r28 = (com.google.android.material.button.MaterialButton) r28
            if (r28 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.buttonSimpleVoiceChatMicrophonePermission
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r29 = r1
            com.google.android.material.button.MaterialButton r29 = (com.google.android.material.button.MaterialButton) r29
            if (r29 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.buttonUseMicrosoftAccount
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r30 = r1
            com.google.android.material.button.MaterialButton r30 = (com.google.android.material.button.MaterialButton) r30
            if (r30 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.cardAccountSettings
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r31 = r1
            com.google.android.material.card.MaterialCardView r31 = (com.google.android.material.card.MaterialCardView) r31
            if (r31 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.cardControllerSettings
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r32 = r1
            com.google.android.material.card.MaterialCardView r32 = (com.google.android.material.card.MaterialCardView) r32
            if (r32 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.cardInstanceSettings
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r33 = r1
            com.google.android.material.card.MaterialCardView r33 = (com.google.android.material.card.MaterialCardView) r33
            if (r33 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.cardLauncherSettings
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r34 = r1
            com.google.android.material.card.MaterialCardView r34 = (com.google.android.material.card.MaterialCardView) r34
            if (r34 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.cardPrivacyPolicySettings
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r35 = r1
            com.google.android.material.card.MaterialCardView r35 = (com.google.android.material.card.MaterialCardView) r35
            if (r35 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.cardRendererSettings
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r36 = r1
            com.google.android.material.card.MaterialCardView r36 = (com.google.android.material.card.MaterialCardView) r36
            if (r36 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.cardSettingsTabsHeader
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r37 = r1
            com.google.android.material.card.MaterialCardView r37 = (com.google.android.material.card.MaterialCardView) r37
            if (r37 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.checkKeepLogs
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r38 = r1
            android.widget.CheckBox r38 = (android.widget.CheckBox) r38
            if (r38 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.layoutControllerSettings
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r39 = r1
            android.widget.LinearLayout r39 = (android.widget.LinearLayout) r39
            if (r39 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.layoutRendererPickerRow
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r40 = r1
            android.widget.LinearLayout r40 = (android.widget.LinearLayout) r40
            if (r40 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.layoutVulkanDriverSettings
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r41 = r1
            android.widget.LinearLayout r41 = (android.widget.LinearLayout) r41
            if (r41 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.modelPlayerPreview
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r42 = r1
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView r42 = (ca.dnamobile.javalauncher.skin.PlayerModelPreviewView) r42
            if (r42 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.settingsContent
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r43 = r1
            android.widget.FrameLayout r43 = (android.widget.FrameLayout) r43
            if (r43 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.settingsScrollView
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r44 = r1
            android.widget.ScrollView r44 = (android.widget.ScrollView) r44
            if (r44 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.settingsSectionTabs
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r45 = r1
            com.google.android.material.tabs.TabLayout r45 = (com.google.android.material.tabs.TabLayout) r45
            if (r45 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.settingsTabsHeader
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r46 = r1
            android.widget.LinearLayout r46 = (android.widget.LinearLayout) r46
            if (r46 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.settingsTopContentScrim
            android.view.View r47 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            if (r47 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.sliderAllocatedRam
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r48 = r1
            android.widget.SeekBar r48 = (android.widget.SeekBar) r48
            if (r48 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.sliderGameResolutionScale
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r49 = r1
            android.widget.SeekBar r49 = (android.widget.SeekBar) r49
            if (r49 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.spinnerRenderer
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r50 = r1
            android.widget.Spinner r50 = (android.widget.Spinner) r50
            if (r50 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.spinnerVulkanDriver
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r51 = r1
            android.widget.Spinner r51 = (android.widget.Spinner) r51
            if (r51 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.switchAvoidRoundedCorners
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r52 = r1
            com.google.android.material.switchmaterial.SwitchMaterial r52 = (com.google.android.material.switchmaterial.SwitchMaterial) r52
            if (r52 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.switchDoubleTapToDrop
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r53 = r1
            com.google.android.material.switchmaterial.SwitchMaterial r53 = (com.google.android.material.switchmaterial.SwitchMaterial) r53
            if (r53 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.switchForceFullscreenMode
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r54 = r1
            com.google.android.material.switchmaterial.SwitchMaterial r54 = (com.google.android.material.switchmaterial.SwitchMaterial) r54
            if (r54 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.switchForceSdlControllerBridge
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r55 = r1
            com.google.android.material.switchmaterial.SwitchMaterial r55 = (com.google.android.material.switchmaterial.SwitchMaterial) r55
            if (r55 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.switchIgnoreDisplayCutout
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r56 = r1
            com.google.android.material.switchmaterial.SwitchMaterial r56 = (com.google.android.material.switchmaterial.SwitchMaterial) r56
            if (r56 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.switchInstallNotifications
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r57 = r1
            com.google.android.material.switchmaterial.SwitchMaterial r57 = (com.google.android.material.switchmaterial.SwitchMaterial) r57
            if (r57 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.switchMinecraftTouchGestures
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r58 = r1
            com.google.android.material.switchmaterial.SwitchMaterial r58 = (com.google.android.material.switchmaterial.SwitchMaterial) r58
            if (r58 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.switchRemoveInheritedVanilla
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r59 = r1
            com.google.android.material.switchmaterial.SwitchMaterial r59 = (com.google.android.material.switchmaterial.SwitchMaterial) r59
            if (r59 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.switchShowGameLogOverlay
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r60 = r1
            com.google.android.material.switchmaterial.SwitchMaterial r60 = (com.google.android.material.switchmaterial.SwitchMaterial) r60
            if (r60 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.switchShowInGameSettingsButton
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r61 = r1
            com.google.android.material.switchmaterial.SwitchMaterial r61 = (com.google.android.material.switchmaterial.SwitchMaterial) r61
            if (r61 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.switchShowSharedInstalls
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r62 = r1
            com.google.android.material.switchmaterial.SwitchMaterial r62 = (com.google.android.material.switchmaterial.SwitchMaterial) r62
            if (r62 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.switchTouchControlsEnabled
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r63 = r1
            com.google.android.material.switchmaterial.SwitchMaterial r63 = (com.google.android.material.switchmaterial.SwitchMaterial) r63
            if (r63 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.switchUseNativeSurface
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r64 = r1
            com.google.android.material.switchmaterial.SwitchMaterial r64 = (com.google.android.material.switchmaterial.SwitchMaterial) r64
            if (r64 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.switchUseOpenGlFor26Plus
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r65 = r1
            com.google.android.material.switchmaterial.SwitchMaterial r65 = (com.google.android.material.switchmaterial.SwitchMaterial) r65
            if (r65 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.switchUseSystemVulkanDriver
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r66 = r1
            com.google.android.material.switchmaterial.SwitchMaterial r66 = (com.google.android.material.switchmaterial.SwitchMaterial) r66
            if (r66 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.textAccountStatus
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r67 = r1
            android.widget.TextView r67 = (android.widget.TextView) r67
            if (r67 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.textAllocatedRam
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r68 = r1
            android.widget.TextView r68 = (android.widget.TextView) r68
            if (r68 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.textAvailableRamSummary
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r69 = r1
            android.widget.TextView r69 = (android.widget.TextView) r69
            if (r69 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.textDoubleTapToDropSummary
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r70 = r1
            android.widget.TextView r70 = (android.widget.TextView) r70
            if (r70 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.textDroidBridgeBackupSummary
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r71 = r1
            android.widget.TextView r71 = (android.widget.TextView) r71
            if (r71 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.textFolder
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r72 = r1
            android.widget.TextView r72 = (android.widget.TextView) r72
            if (r72 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.textGameResolutionScale
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r73 = r1
            android.widget.TextView r73 = (android.widget.TextView) r73
            if (r73 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.textGameResolutionScaleSummary
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r74 = r1
            android.widget.TextView r74 = (android.widget.TextView) r74
            if (r74 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.textInstallNotificationsSummary
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r75 = r1
            android.widget.TextView r75 = (android.widget.TextView) r75
            if (r75 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.textJarExecutionSummary
            android.view.View r0 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r76 = r0
            android.widget.TextView r76 = (android.widget.TextView) r76
            int r0 = ca.dnamobile.javalauncher.R.id.textMinecraftTouchGesturesSummary
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r77 = r1
            android.widget.TextView r77 = (android.widget.TextView) r77
            if (r77 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.textMouseCursorIconSummary
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r78 = r1
            android.widget.TextView r78 = (android.widget.TextView) r78
            if (r78 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.textPrivacyPolicySummary
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r79 = r1
            android.widget.TextView r79 = (android.widget.TextView) r79
            if (r79 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.textRendererPluginConfig
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r80 = r1
            android.widget.TextView r80 = (android.widget.TextView) r80
            if (r80 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.textRuntimeComponentsSummary
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r81 = r1
            android.widget.TextView r81 = (android.widget.TextView) r81
            if (r81 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.textSettingsHeaderTitle
            android.view.View r0 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r82 = r0
            android.widget.TextView r82 = (android.widget.TextView) r82
            int r0 = ca.dnamobile.javalauncher.R.id.textSimpleVoiceChatMicrophoneStatus
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r83 = r1
            android.widget.TextView r83 = (android.widget.TextView) r83
            if (r83 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.textSkinStatus
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r84 = r1
            android.widget.TextView r84 = (android.widget.TextView) r84
            if (r84 == 0) goto L413
            int r0 = ca.dnamobile.javalauncher.R.id.textVulkanDriverDescription
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r15, r0)
            r85 = r1
            android.widget.TextView r85 = (android.widget.TextView) r85
            if (r85 == 0) goto L413
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r86 = new ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding
            r0 = r86
            r1 = r87
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r22
            r22 = r23
            r23 = r24
            r24 = r25
            r25 = r26
            r26 = r27
            r27 = r28
            r28 = r29
            r29 = r30
            r30 = r31
            r31 = r32
            r32 = r33
            r33 = r34
            r34 = r35
            r35 = r36
            r36 = r37
            r37 = r38
            r38 = r39
            r39 = r40
            r40 = r41
            r41 = r42
            r42 = r43
            r43 = r87
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85)
            return r86
        L413:
            android.content.res.Resources r1 = r87.getResources()
            java.lang.String r0 = r1.getResourceName(r0)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
    }

    public static ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding inflate(android.view.LayoutInflater r2) {
            r0 = 0
            r1 = 0
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r2 = inflate(r2, r0, r1)
            return r2
    }

    public static ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding inflate(android.view.LayoutInflater r2, android.view.ViewGroup r3, boolean r4) {
            int r0 = ca.dnamobile.javalauncher.R.layout.activity_launcher_settings
            r1 = 0
            android.view.View r2 = r2.inflate(r0, r3, r1)
            if (r4 == 0) goto Lc
            r3.addView(r2)
        Lc:
            ca.dnamobile.javalauncher.databinding.ActivityLauncherSettingsBinding r2 = bind(r2)
            return r2
    }

    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
            r1 = this;
            android.view.View r0 = r1.rootView
            return r0
    }
}
