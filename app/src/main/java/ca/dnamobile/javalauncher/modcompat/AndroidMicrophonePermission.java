package ca.dnamobile.javalauncher.modcompat;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidMicrophonePermission {
    public static final int REQUEST_CODE_RECORD_AUDIO = 20764;

    private AndroidMicrophonePermission() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isGranted(android.content.Context r1) {
            java.lang.String r0 = "android.permission.RECORD_AUDIO"
            int r1 = r1.checkSelfPermission(r0)
            if (r1 != 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    static /* synthetic */ void lambda$showRequestDialog$0(android.app.Activity r0, android.content.DialogInterface r1, int r2) {
            request(r0)
            return
    }

    public static void openAppSettings(android.content.Context r3) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "package:"
            r1.<init>(r2)
            java.lang.String r2 = r3.getPackageName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r0.setData(r1)
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r1)
            r3.startActivity(r0)
            return
    }

    public static void request(android.app.Activity r3) {
            boolean r0 = isGranted(r3)
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "android.permission.RECORD_AUDIO"
            r0[r1] = r2
            r1 = 20764(0x511c, float:2.9097E-41)
            r3.requestPermissions(r0, r1)
            return
    }

    public static void showAlreadyGrantedDialog(android.app.Activity r2) {
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r2)
            java.lang.String r2 = "Microphone enabled"
            android.app.AlertDialog$Builder r2 = r0.setTitle(r2)
            java.lang.String r0 = "Android microphone permission is already granted for JavaLauncher."
            android.app.AlertDialog$Builder r2 = r2.setMessage(r0)
            r0 = 17039370(0x104000a, float:2.42446E-38)
            r1 = 0
            android.app.AlertDialog$Builder r2 = r2.setPositiveButton(r0, r1)
            r2.show()
            return
    }

    public static void showRequestDialog(android.app.Activity r2) {
            boolean r0 = isGranted(r2)
            if (r0 == 0) goto La
            showAlreadyGrantedDialog(r2)
            return
        La:
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r2)
            java.lang.String r1 = "Enable microphone"
            android.app.AlertDialog$Builder r0 = r0.setTitle(r1)
            java.lang.String r1 = "Simple Voice Chat needs Android microphone permission before Minecraft can use your mic. This only enables microphone access for mods that request it while the game is running."
            android.app.AlertDialog$Builder r0 = r0.setMessage(r1)
            ca.dnamobile.javalauncher.modcompat.AndroidMicrophonePermission$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.modcompat.AndroidMicrophonePermission$$ExternalSyntheticLambda0
            r1.<init>(r2)
            java.lang.String r2 = "Allow"
            android.app.AlertDialog$Builder r2 = r0.setPositiveButton(r2, r1)
            r0 = 17039360(0x1040000, float:2.424457E-38)
            r1 = 0
            android.app.AlertDialog$Builder r2 = r2.setNegativeButton(r0, r1)
            r2.show()
            return
    }

    public static boolean wasGrantedFromResult(int r3, java.lang.String[] r4, int[] r5) {
            r0 = 20764(0x511c, float:2.9097E-41)
            r1 = 0
            if (r3 == r0) goto L6
            return r1
        L6:
            r3 = r1
        L7:
            int r0 = r4.length
            if (r3 >= r0) goto L20
            java.lang.String r0 = "android.permission.RECORD_AUDIO"
            r2 = r4[r3]
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1d
            int r4 = r5.length
            if (r3 >= r4) goto L1c
            r3 = r5[r3]
            if (r3 != 0) goto L1c
            r1 = 1
        L1c:
            return r1
        L1d:
            int r3 = r3 + 1
            goto L7
        L20:
            return r1
    }
}
