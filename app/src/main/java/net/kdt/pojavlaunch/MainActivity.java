package net.kdt.pojavlaunch;

/* JADX INFO: loaded from: classes2.dex */
public final class MainActivity {
    private static final java.lang.String TAG = "PojavMainActivityABI";
    private static java.lang.ref.WeakReference<android.app.Activity> currentActivity;

    static {
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r1 = 0
            r0.<init>(r1)
            net.kdt.pojavlaunch.MainActivity.currentActivity = r0
            return
    }

    private MainActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void clearCurrentActivity(android.app.Activity r1) {
            java.lang.ref.WeakReference<android.app.Activity> r0 = net.kdt.pojavlaunch.MainActivity.currentActivity
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 == 0) goto Lc
            if (r0 != r1) goto L11
        Lc:
            java.lang.ref.WeakReference<android.app.Activity> r1 = net.kdt.pojavlaunch.MainActivity.currentActivity
            r1.clear()
        L11:
            return
    }

    public static void openLink(java.lang.String r5) {
            if (r5 == 0) goto L4f
            java.lang.String r0 = r5.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto L4f
        Ld:
            java.lang.ref.WeakReference<android.app.Activity> r0 = net.kdt.pojavlaunch.MainActivity.currentActivity
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.String r1 = "PojavMainActivityABI"
            if (r0 != 0) goto L2c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "openLink ignored because no activity is active: "
            r0.<init>(r2)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            android.util.Log.w(r1, r5)
            return
        L2c:
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> L40 android.content.ActivityNotFoundException -> L47
            java.lang.String r3 = "android.intent.action.VIEW"
            android.net.Uri r4 = android.net.Uri.parse(r5)     // Catch: java.lang.Throwable -> L40 android.content.ActivityNotFoundException -> L47
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L40 android.content.ActivityNotFoundException -> L47
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r2.addFlags(r3)     // Catch: java.lang.Throwable -> L40 android.content.ActivityNotFoundException -> L47
            r0.startActivity(r2)     // Catch: java.lang.Throwable -> L40 android.content.ActivityNotFoundException -> L47
            goto L4f
        L40:
            r5 = move-exception
            java.lang.String r0 = "openLink failed"
            android.util.Log.e(r1, r0, r5)
            goto L4f
        L47:
            r1 = 1
            android.widget.Toast r5 = android.widget.Toast.makeText(r0, r5, r1)
            r5.show()
        L4f:
            return
    }

    public static void putClipboardData(java.lang.String r2, java.lang.String r3) {
            java.lang.ref.WeakReference<android.app.Activity> r0 = net.kdt.pojavlaunch.MainActivity.currentActivity
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.String r1 = "clipboard"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L30
            android.content.ClipboardManager r0 = (android.content.ClipboardManager) r0     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L16
            return
        L16:
            if (r3 == 0) goto L22
            java.lang.String r1 = r3.trim()     // Catch: java.lang.Throwable -> L30
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L24
        L22:
            java.lang.String r3 = "text/plain"
        L24:
            if (r2 != 0) goto L28
            java.lang.String r2 = ""
        L28:
            android.content.ClipData r2 = android.content.ClipData.newPlainText(r3, r2)     // Catch: java.lang.Throwable -> L30
            r0.setPrimaryClip(r2)     // Catch: java.lang.Throwable -> L30
            goto L38
        L30:
            r2 = move-exception
            java.lang.String r3 = "PojavMainActivityABI"
            java.lang.String r0 = "putClipboardData failed"
            android.util.Log.e(r3, r0, r2)
        L38:
            return
    }

    public static void querySystemClipboard() {
            java.lang.ref.WeakReference<android.app.Activity> r0 = net.kdt.pojavlaunch.MainActivity.currentActivity
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.String r1 = "clipboard"
            java.lang.Object r1 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L4f
            android.content.ClipboardManager r1 = (android.content.ClipboardManager) r1     // Catch: java.lang.Throwable -> L4f
            java.lang.String r2 = "text/plain"
            java.lang.String r3 = ""
            if (r1 == 0) goto L4b
            boolean r4 = r1.hasPrimaryClip()     // Catch: java.lang.Throwable -> L4f
            if (r4 == 0) goto L4b
            android.content.ClipData r4 = r1.getPrimaryClip()     // Catch: java.lang.Throwable -> L4f
            if (r4 != 0) goto L26
            goto L4b
        L26:
            android.content.ClipData r1 = r1.getPrimaryClip()     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L47
            int r4 = r1.getItemCount()     // Catch: java.lang.Throwable -> L4f
            if (r4 > 0) goto L33
            goto L47
        L33:
            r4 = 0
            android.content.ClipData$Item r1 = r1.getItemAt(r4)     // Catch: java.lang.Throwable -> L4f
            java.lang.CharSequence r0 = r1.coerceToText(r0)     // Catch: java.lang.Throwable -> L4f
            if (r0 != 0) goto L3f
            goto L43
        L3f:
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Throwable -> L4f
        L43:
            net.kdt.pojavlaunch.AWTInputBridge.nativeClipboardReceived(r3, r2)     // Catch: java.lang.Throwable -> L4f
            goto L57
        L47:
            net.kdt.pojavlaunch.AWTInputBridge.nativeClipboardReceived(r3, r2)     // Catch: java.lang.Throwable -> L4f
            return
        L4b:
            net.kdt.pojavlaunch.AWTInputBridge.nativeClipboardReceived(r3, r2)     // Catch: java.lang.Throwable -> L4f
            return
        L4f:
            r0 = move-exception
            java.lang.String r1 = "PojavMainActivityABI"
            java.lang.String r2 = "querySystemClipboard failed"
            android.util.Log.e(r1, r2, r0)
        L57:
            return
    }

    public static void setCurrentActivity(android.app.Activity r1) {
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            net.kdt.pojavlaunch.MainActivity.currentActivity = r0
            return
    }
}
