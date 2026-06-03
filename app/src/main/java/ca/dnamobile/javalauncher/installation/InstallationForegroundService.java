package ca.dnamobile.javalauncher.installation;

/* JADX INFO: loaded from: classes.dex */
public final class InstallationForegroundService extends android.app.Service {
    private static final java.lang.String ACTION_START = "ca.dnamobile.javalauncher.installation.START";
    private static final java.lang.String ACTION_STOP = "ca.dnamobile.javalauncher.installation.STOP";
    private static final java.lang.String ACTION_UPDATE = "ca.dnamobile.javalauncher.installation.UPDATE";
    private static final java.lang.String CHANNEL_ID = "launcher_installation";
    private static final java.lang.String EXTRA_INDETERMINATE = "indeterminate";
    private static final java.lang.String EXTRA_MESSAGE = "message";
    private static final java.lang.String EXTRA_PROGRESS = "progress";
    private static final java.lang.String EXTRA_TITLE = "title";
    private static final int NOTIFICATION_ID = 4317;
    private static final java.lang.String TAG = "InstallForeground";
    private boolean foregroundStarted;
    private boolean indeterminate;
    private java.lang.String message;
    private int progress;
    private java.lang.String title;

    public InstallationForegroundService() {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "Installing Minecraft"
            r2.title = r0
            java.lang.String r0 = "Preparing installation..."
            r2.message = r0
            r0 = 0
            r2.progress = r0
            r1 = 1
            r2.indeterminate = r1
            r2.foregroundStarted = r0
            return
    }

    private android.app.Notification buildNotification() {
            r5 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<ca.dnamobile.javalauncher.launcher.JavaLaunch> r1 = ca.dnamobile.javalauncher.launcher.JavaLaunch.class
            r0.<init>(r5, r1)
            r1 = 603979776(0x24000000, float:2.7755576E-17)
            r0.addFlags(r1)
            r1 = 0
            r2 = 201326592(0xc000000, float:9.8607613E-32)
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r5, r1, r0, r2)
            android.app.Notification$Builder r1 = new android.app.Notification$Builder
            java.lang.String r2 = "launcher_installation"
            r1.<init>(r5, r2)
            r2 = 17301633(0x1080081, float:2.4979616E-38)
            android.app.Notification$Builder r2 = r1.setSmallIcon(r2)
            java.lang.String r3 = r5.title
            android.app.Notification$Builder r2 = r2.setContentTitle(r3)
            java.lang.String r3 = r5.message
            android.app.Notification$Builder r2 = r2.setContentText(r3)
            android.app.Notification$Builder r0 = r2.setContentIntent(r0)
            r2 = 1
            android.app.Notification$Builder r0 = r0.setOngoing(r2)
            android.app.Notification$Builder r0 = r0.setOnlyAlertOnce(r2)
            int r2 = r5.progress
            boolean r3 = r5.indeterminate
            r4 = 100
            r0.setProgress(r4, r2, r3)
            java.lang.String r0 = "progress"
            r1.setCategory(r0)
            android.app.Notification r0 = r1.build()
            return r0
    }

    private void createNotificationChannel() {
            r5 = this;
            java.lang.String r0 = "notification"
            java.lang.Object r0 = r5.getSystemService(r0)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            android.app.NotificationChannel r1 = new android.app.NotificationChannel
            java.lang.String r2 = "Installations"
            r3 = 2
            java.lang.String r4 = "launcher_installation"
            r1.<init>(r4, r2, r3)
            java.lang.String r2 = "Shows Minecraft, Fabric, Forge, and NeoForge installation progress."
            r1.setDescription(r2)
            r0.createNotificationChannel(r1)
            return
    }

    private static void putProgress(android.content.Intent r1, java.lang.String r2, java.lang.String r3, int r4, boolean r5) {
            java.lang.String r0 = "title"
            r1.putExtra(r0, r2)
            java.lang.String r2 = "message"
            r1.putExtra(r2, r3)
            r2 = 100
            int r2 = java.lang.Math.min(r2, r4)
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
            java.lang.String r3 = "progress"
            r1.putExtra(r3, r2)
            java.lang.String r2 = "indeterminate"
            r1.putExtra(r2, r5)
            return
    }

    private void readIntent(android.content.Intent r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "title"
            java.lang.String r1 = r3.getStringExtra(r0)
            if (r1 == 0) goto L10
            java.lang.String r0 = r3.getStringExtra(r0)
            goto L12
        L10:
            java.lang.String r0 = r2.title
        L12:
            r2.title = r0
            java.lang.String r0 = "message"
            java.lang.String r1 = r3.getStringExtra(r0)
            if (r1 == 0) goto L21
            java.lang.String r0 = r3.getStringExtra(r0)
            goto L23
        L21:
            java.lang.String r0 = r2.message
        L23:
            r2.message = r0
            java.lang.String r0 = "progress"
            int r1 = r2.progress
            int r0 = r3.getIntExtra(r0, r1)
            r1 = 100
            int r0 = java.lang.Math.min(r1, r0)
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            r2.progress = r0
            java.lang.String r0 = "indeterminate"
            boolean r1 = r2.indeterminate
            boolean r3 = r3.getBooleanExtra(r0, r1)
            r2.indeterminate = r3
            return
    }

    private static void safeStart(android.content.Context r1, android.content.Intent r2) {
            r1.startForegroundService(r2)     // Catch: java.lang.Throwable -> L4
            goto Lc
        L4:
            r1 = move-exception
            java.lang.String r2 = "InstallForeground"
            java.lang.String r0 = "Unable to start install foreground service"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r2, r0, r1)
        Lc:
            return
    }

    public static void start(android.content.Context r2, java.lang.String r3, java.lang.String r4, int r5, boolean r6) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<ca.dnamobile.javalauncher.installation.InstallationForegroundService> r1 = ca.dnamobile.javalauncher.installation.InstallationForegroundService.class
            r0.<init>(r2, r1)
            java.lang.String r1 = "ca.dnamobile.javalauncher.installation.START"
            r0.setAction(r1)
            putProgress(r0, r3, r4, r5, r6)
            safeStart(r2, r0)
            return
    }

    public static void stop(android.content.Context r2) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<ca.dnamobile.javalauncher.installation.InstallationForegroundService> r1 = ca.dnamobile.javalauncher.installation.InstallationForegroundService.class
            r0.<init>(r2, r1)
            java.lang.String r1 = "ca.dnamobile.javalauncher.installation.STOP"
            r0.setAction(r1)
            r2.startService(r0)     // Catch: java.lang.Throwable -> L10
            goto L29
        L10:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to stop install foreground service: "
            r0.<init>(r1)
            java.lang.String r2 = r2.getMessage()
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "InstallForeground"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r2)
        L29:
            return
    }

    private void stopForegroundCompat() {
            r1 = this;
            r0 = 1
            r1.stopForeground(r0)
            r0 = 0
            r1.foregroundStarted = r0
            return
    }

    public static void update(android.content.Context r2, java.lang.String r3, java.lang.String r4, int r5, boolean r6) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<ca.dnamobile.javalauncher.installation.InstallationForegroundService> r1 = ca.dnamobile.javalauncher.installation.InstallationForegroundService.class
            r0.<init>(r2, r1)
            java.lang.String r1 = "ca.dnamobile.javalauncher.installation.UPDATE"
            r0.setAction(r1)
            putProgress(r0, r3, r4, r5, r6)
            safeStart(r2, r0)
            return
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.app.Service
    public void onCreate() {
            r0 = this;
            super.onCreate()
            r0.createNotificationChannel()
            return
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent r2, int r3, int r4) {
            r1 = this;
            if (r2 == 0) goto L16
            java.lang.String r3 = "ca.dnamobile.javalauncher.installation.STOP"
            java.lang.String r4 = r2.getAction()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L16
            r1.stopForegroundCompat()
            r1.stopSelf()
            r2 = 2
            return r2
        L16:
            r1.readIntent(r2)
            android.app.Notification r2 = r1.buildNotification()
            boolean r3 = r1.foregroundStarted
            r4 = 1
            r0 = 4317(0x10dd, float:6.05E-42)
            if (r3 != 0) goto L2a
            r1.startForeground(r0, r2)
            r1.foregroundStarted = r4
            goto L37
        L2a:
            java.lang.String r3 = "notification"
            java.lang.Object r3 = r1.getSystemService(r3)
            android.app.NotificationManager r3 = (android.app.NotificationManager) r3
            if (r3 == 0) goto L37
            r3.notify(r0, r2)
        L37:
            return r4
    }
}
