package androidx.core.content.pm;

/* JADX INFO: loaded from: classes.dex */
public class ShortcutManagerCompat {
    static final java.lang.String ACTION_INSTALL_SHORTCUT = "com.android.launcher.action.INSTALL_SHORTCUT";
    private static final int DEFAULT_MAX_ICON_DIMENSION_DP = 96;
    private static final int DEFAULT_MAX_ICON_DIMENSION_LOWRAM_DP = 48;
    public static final java.lang.String EXTRA_SHORTCUT_ID = "android.intent.extra.shortcut.ID";
    public static final int FLAG_MATCH_CACHED = 8;
    public static final int FLAG_MATCH_DYNAMIC = 2;
    public static final int FLAG_MATCH_MANIFEST = 1;
    public static final int FLAG_MATCH_PINNED = 4;
    static final java.lang.String INSTALL_SHORTCUT_PERMISSION = "com.android.launcher.permission.INSTALL_SHORTCUT";
    private static final java.lang.String SHORTCUT_LISTENER_INTENT_FILTER_ACTION = "androidx.core.content.pm.SHORTCUT_LISTENER";
    private static final java.lang.String SHORTCUT_LISTENER_META_DATA_KEY = "androidx.core.content.pm.shortcut_listener_impl";
    private static volatile java.util.List<androidx.core.content.pm.ShortcutInfoChangeListener> sShortcutInfoChangeListeners;
    private static volatile androidx.core.content.pm.ShortcutInfoCompatSaver<?> sShortcutInfoCompatSaver;

    /* JADX INFO: renamed from: androidx.core.content.pm.ShortcutManagerCompat$1, reason: invalid class name */
    class AnonymousClass1 extends android.content.BroadcastReceiver {
        final /* synthetic */ android.content.IntentSender val$callback;

        AnonymousClass1(android.content.IntentSender r1) {
                r0 = this;
                r0.val$callback = r1
                r0.<init>()
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r7, android.content.Intent r8) {
                r6 = this;
                android.content.IntentSender r0 = r6.val$callback     // Catch: android.content.IntentSender.SendIntentException -> La
                r4 = 0
                r5 = 0
                r2 = 0
                r3 = 0
                r1 = r7
                r0.sendIntent(r1, r2, r3, r4, r5)     // Catch: android.content.IntentSender.SendIntentException -> La
            La:
                return
        }
    }

    private static class Api25Impl {
        private Api25Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.lang.String getShortcutInfoWithLowestRank(java.util.List<android.content.pm.ShortcutInfo> r5) {
                java.util.Iterator r5 = r5.iterator()
                r0 = -1
                r1 = 0
            L6:
                boolean r2 = r5.hasNext()
                if (r2 == 0) goto L24
                java.lang.Object r2 = r5.next()
                android.content.pm.ShortcutInfo r2 = (android.content.pm.ShortcutInfo) r2
                int r3 = r2.getRank()
                if (r3 <= r0) goto L6
                java.lang.String r0 = r2.getId()
                int r1 = r2.getRank()
                r4 = r1
                r1 = r0
                r0 = r4
                goto L6
            L24:
                return r1
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ShortcutMatchFlags {
    }

    static {
            return
    }

    private ShortcutManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean addDynamicShortcuts(android.content.Context r5, java.util.List<androidx.core.content.pm.ShortcutInfoCompat> r6) {
            r0 = 1
            java.util.List r1 = removeShortcutsExcludedFromSurface(r6, r0)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 > r3) goto Le
            convertUriIconsToBitmapIcons(r5, r1)
        Le:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r1.iterator()
        L17:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2b
            java.lang.Object r4 = r3.next()
            androidx.core.content.pm.ShortcutInfoCompat r4 = (androidx.core.content.pm.ShortcutInfoCompat) r4
            android.content.pm.ShortcutInfo r4 = r4.toShortcutInfo()
            r2.add(r4)
            goto L17
        L2b:
            java.lang.Class<android.content.pm.ShortcutManager> r3 = android.content.pm.ShortcutManager.class
            java.lang.Object r3 = r5.getSystemService(r3)
            android.content.pm.ShortcutManager r3 = (android.content.pm.ShortcutManager) r3
            boolean r2 = r3.addDynamicShortcuts(r2)
            if (r2 != 0) goto L3b
            r5 = 0
            return r5
        L3b:
            androidx.core.content.pm.ShortcutInfoCompatSaver r2 = getShortcutInfoSaverInstance(r5)
            r2.addShortcuts(r1)
            java.util.List r5 = getShortcutInfoListeners(r5)
            java.util.Iterator r5 = r5.iterator()
        L4a:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L5a
            java.lang.Object r1 = r5.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r1 = (androidx.core.content.pm.ShortcutInfoChangeListener) r1
            r1.onShortcutAdded(r6)
            goto L4a
        L5a:
            return r0
    }

    static boolean convertUriIconToBitmapIcon(android.content.Context r5, androidx.core.content.pm.ShortcutInfoCompat r6) {
            androidx.core.graphics.drawable.IconCompat r0 = r6.mIcon
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            androidx.core.graphics.drawable.IconCompat r0 = r6.mIcon
            int r0 = r0.mType
            r2 = 1
            r3 = 6
            if (r0 == r3) goto L12
            r4 = 4
            if (r0 == r4) goto L12
            return r2
        L12:
            androidx.core.graphics.drawable.IconCompat r4 = r6.mIcon
            java.io.InputStream r5 = r4.getUriInputStream(r5)
            if (r5 != 0) goto L1b
            return r1
        L1b:
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r5)
            if (r5 != 0) goto L22
            return r1
        L22:
            if (r0 != r3) goto L29
            androidx.core.graphics.drawable.IconCompat r5 = androidx.core.graphics.drawable.IconCompat.createWithAdaptiveBitmap(r5)
            goto L2d
        L29:
            androidx.core.graphics.drawable.IconCompat r5 = androidx.core.graphics.drawable.IconCompat.createWithBitmap(r5)
        L2d:
            r6.mIcon = r5
            return r2
    }

    static void convertUriIconsToBitmapIcons(android.content.Context r3, java.util.List<androidx.core.content.pm.ShortcutInfoCompat> r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            androidx.core.content.pm.ShortcutInfoCompat r1 = (androidx.core.content.pm.ShortcutInfoCompat) r1
            boolean r2 = convertUriIconToBitmapIcon(r3, r1)
            if (r2 != 0) goto L9
            r4.remove(r1)
            goto L9
        L1f:
            return
    }

    public static android.content.Intent createShortcutResultIntent(android.content.Context r1, androidx.core.content.pm.ShortcutInfoCompat r2) {
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r1 = r1.getSystemService(r0)
            android.content.pm.ShortcutManager r1 = (android.content.pm.ShortcutManager) r1
            android.content.pm.ShortcutInfo r0 = r2.toShortcutInfo()
            android.content.Intent r1 = r1.createShortcutResultIntent(r0)
            if (r1 != 0) goto L17
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
        L17:
            android.content.Intent r1 = r2.addToIntent(r1)
            return r1
    }

    public static void disableShortcuts(android.content.Context r1, java.util.List<java.lang.String> r2, java.lang.CharSequence r3) {
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r1.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            r0.disableShortcuts(r2, r3)
            androidx.core.content.pm.ShortcutInfoCompatSaver r3 = getShortcutInfoSaverInstance(r1)
            r3.removeShortcuts(r2)
            java.util.List r1 = getShortcutInfoListeners(r1)
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r1.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r3 = (androidx.core.content.pm.ShortcutInfoChangeListener) r3
            r3.onShortcutRemoved(r2)
            goto L1a
        L2a:
            return
    }

    public static void enableShortcuts(android.content.Context r4, java.util.List<androidx.core.content.pm.ShortcutInfoCompat> r5) {
            r0 = 1
            java.util.List r0 = removeShortcutsExcludedFromSurface(r5, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r5.size()
            r1.<init>(r2)
            java.util.Iterator r2 = r0.iterator()
        L12:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L24
            java.lang.Object r3 = r2.next()
            androidx.core.content.pm.ShortcutInfoCompat r3 = (androidx.core.content.pm.ShortcutInfoCompat) r3
            java.lang.String r3 = r3.mId
            r1.add(r3)
            goto L12
        L24:
            java.lang.Class<android.content.pm.ShortcutManager> r2 = android.content.pm.ShortcutManager.class
            java.lang.Object r2 = r4.getSystemService(r2)
            android.content.pm.ShortcutManager r2 = (android.content.pm.ShortcutManager) r2
            r2.enableShortcuts(r1)
            androidx.core.content.pm.ShortcutInfoCompatSaver r1 = getShortcutInfoSaverInstance(r4)
            r1.addShortcuts(r0)
            java.util.List r4 = getShortcutInfoListeners(r4)
            java.util.Iterator r4 = r4.iterator()
        L3e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r4.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r0 = (androidx.core.content.pm.ShortcutInfoChangeListener) r0
            r0.onShortcutAdded(r5)
            goto L3e
        L4e:
            return
    }

    public static java.util.List<androidx.core.content.pm.ShortcutInfoCompat> getDynamicShortcuts(android.content.Context r4) {
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r4.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            java.util.List r0 = r0.getDynamicShortcuts()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r0.next()
            android.content.pm.ShortcutInfo r2 = (android.content.pm.ShortcutInfo) r2
            androidx.core.content.pm.ShortcutInfoCompat$Builder r3 = new androidx.core.content.pm.ShortcutInfoCompat$Builder
            r3.<init>(r4, r2)
            androidx.core.content.pm.ShortcutInfoCompat r2 = r3.build()
            r1.add(r2)
            goto L19
        L32:
            return r1
    }

    private static int getIconDimensionInternal(android.content.Context r2, boolean r3) {
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            r1 = 1
            if (r0 == 0) goto L14
            boolean r0 = r0.isLowRamDevice()
            if (r0 == 0) goto L12
            goto L14
        L12:
            r0 = 0
            goto L15
        L14:
            r0 = r1
        L15:
            if (r0 == 0) goto L1a
            r0 = 48
            goto L1c
        L1a:
            r0 = 96
        L1c:
            int r0 = java.lang.Math.max(r1, r0)
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            if (r3 == 0) goto L2d
            float r2 = r2.xdpi
            goto L2f
        L2d:
            float r2 = r2.ydpi
        L2f:
            r3 = 1126170624(0x43200000, float:160.0)
            float r2 = r2 / r3
            float r3 = (float) r0
            float r3 = r3 * r2
            int r2 = (int) r3
            return r2
    }

    public static int getIconMaxHeight(android.content.Context r1) {
            androidx.core.util.Preconditions.checkNotNull(r1)
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r1 = r1.getSystemService(r0)
            android.content.pm.ShortcutManager r1 = (android.content.pm.ShortcutManager) r1
            int r1 = r1.getIconMaxHeight()
            return r1
    }

    public static int getIconMaxWidth(android.content.Context r1) {
            androidx.core.util.Preconditions.checkNotNull(r1)
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r1 = r1.getSystemService(r0)
            android.content.pm.ShortcutManager r1 = (android.content.pm.ShortcutManager) r1
            int r1 = r1.getIconMaxWidth()
            return r1
    }

    public static int getMaxShortcutCountPerActivity(android.content.Context r1) {
            androidx.core.util.Preconditions.checkNotNull(r1)
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r1 = r1.getSystemService(r0)
            android.content.pm.ShortcutManager r1 = (android.content.pm.ShortcutManager) r1
            int r1 = r1.getMaxShortcutCountPerActivity()
            return r1
    }

    static java.util.List<androidx.core.content.pm.ShortcutInfoChangeListener> getShortcutInfoChangeListeners() {
            java.util.List<androidx.core.content.pm.ShortcutInfoChangeListener> r0 = androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoChangeListeners
            return r0
    }

    private static java.lang.String getShortcutInfoCompatWithLowestRank(java.util.List<androidx.core.content.pm.ShortcutInfoCompat> r5) {
            java.util.Iterator r5 = r5.iterator()
            r0 = -1
            r1 = 0
        L6:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r5.next()
            androidx.core.content.pm.ShortcutInfoCompat r2 = (androidx.core.content.pm.ShortcutInfoCompat) r2
            int r3 = r2.getRank()
            if (r3 <= r0) goto L6
            java.lang.String r0 = r2.getId()
            int r1 = r2.getRank()
            r4 = r1
            r1 = r0
            r0 = r4
            goto L6
        L24:
            return r1
    }

    private static java.util.List<androidx.core.content.pm.ShortcutInfoChangeListener> getShortcutInfoListeners(android.content.Context r7) {
            java.util.List<androidx.core.content.pm.ShortcutInfoChangeListener> r0 = androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoChangeListeners
            if (r0 != 0) goto L71
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.content.pm.PackageManager r1 = r7.getPackageManager()
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.core.content.pm.SHORTCUT_LISTENER"
            r2.<init>(r3)
            java.lang.String r3 = r7.getPackageName()
            r2.setPackage(r3)
            r3 = 128(0x80, float:1.8E-43)
            java.util.List r1 = r1.queryIntentActivities(r2, r3)
            java.util.Iterator r1 = r1.iterator()
        L25:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6b
            java.lang.Object r2 = r1.next()
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2
            android.content.pm.ActivityInfo r2 = r2.activityInfo
            if (r2 != 0) goto L36
            goto L25
        L36:
            android.os.Bundle r2 = r2.metaData
            if (r2 != 0) goto L3b
            goto L25
        L3b:
            java.lang.String r3 = "androidx.core.content.pm.shortcut_listener_impl"
            java.lang.String r2 = r2.getString(r3)
            if (r2 != 0) goto L44
            goto L25
        L44:
            java.lang.Class<androidx.core.content.pm.ShortcutManagerCompat> r3 = androidx.core.content.pm.ShortcutManagerCompat.class
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Exception -> L25
            r4 = 0
            java.lang.Class r2 = java.lang.Class.forName(r2, r4, r3)     // Catch: java.lang.Exception -> L25
            java.lang.String r3 = "getInstance"
            r5 = 1
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L25
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r5[r4] = r6     // Catch: java.lang.Exception -> L25
            java.lang.reflect.Method r2 = r2.getMethod(r3, r5)     // Catch: java.lang.Exception -> L25
            java.lang.Object[] r3 = new java.lang.Object[]{r7}     // Catch: java.lang.Exception -> L25
            r4 = 0
            java.lang.Object r2 = r2.invoke(r4, r3)     // Catch: java.lang.Exception -> L25
            androidx.core.content.pm.ShortcutInfoChangeListener r2 = (androidx.core.content.pm.ShortcutInfoChangeListener) r2     // Catch: java.lang.Exception -> L25
            r0.add(r2)     // Catch: java.lang.Exception -> L25
            goto L25
        L6b:
            java.util.List<androidx.core.content.pm.ShortcutInfoChangeListener> r7 = androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoChangeListeners
            if (r7 != 0) goto L71
            androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoChangeListeners = r0
        L71:
            java.util.List<androidx.core.content.pm.ShortcutInfoChangeListener> r7 = androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoChangeListeners
            return r7
    }

    private static androidx.core.content.pm.ShortcutInfoCompatSaver<?> getShortcutInfoSaverInstance(android.content.Context r5) {
            androidx.core.content.pm.ShortcutInfoCompatSaver<?> r0 = androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoCompatSaver
            if (r0 != 0) goto L36
            java.lang.Class<androidx.core.content.pm.ShortcutManagerCompat> r0 = androidx.core.content.pm.ShortcutManagerCompat.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = "androidx.sharetarget.ShortcutInfoCompatSaverImpl"
            r2 = 0
            java.lang.Class r0 = java.lang.Class.forName(r1, r2, r0)     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = "getInstance"
            r3 = 1
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L2b
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r3[r2] = r4     // Catch: java.lang.Exception -> L2b
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.Exception -> L2b
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Exception -> L2b
            r1 = 0
            java.lang.Object r5 = r0.invoke(r1, r5)     // Catch: java.lang.Exception -> L2b
            androidx.core.content.pm.ShortcutInfoCompatSaver r5 = (androidx.core.content.pm.ShortcutInfoCompatSaver) r5     // Catch: java.lang.Exception -> L2b
            androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoCompatSaver = r5     // Catch: java.lang.Exception -> L2b
        L2b:
            androidx.core.content.pm.ShortcutInfoCompatSaver<?> r5 = androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoCompatSaver
            if (r5 != 0) goto L36
            androidx.core.content.pm.ShortcutInfoCompatSaver$NoopImpl r5 = new androidx.core.content.pm.ShortcutInfoCompatSaver$NoopImpl
            r5.<init>()
            androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoCompatSaver = r5
        L36:
            androidx.core.content.pm.ShortcutInfoCompatSaver<?> r5 = androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoCompatSaver
            return r5
    }

    public static java.util.List<androidx.core.content.pm.ShortcutInfoCompat> getShortcuts(android.content.Context r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L17
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r3.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            java.util.List r4 = r0.getShortcuts(r4)
            java.util.List r3 = androidx.core.content.pm.ShortcutInfoCompat.fromShortcuts(r3, r4)
            return r3
        L17:
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r3.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = r4 & 1
            if (r2 == 0) goto L2f
            java.util.List r2 = r0.getManifestShortcuts()
            r1.addAll(r2)
        L2f:
            r2 = r4 & 2
            if (r2 == 0) goto L3a
            java.util.List r2 = r0.getDynamicShortcuts()
            r1.addAll(r2)
        L3a:
            r4 = r4 & 4
            if (r4 == 0) goto L45
            java.util.List r4 = r0.getPinnedShortcuts()
            r1.addAll(r4)
        L45:
            java.util.List r3 = androidx.core.content.pm.ShortcutInfoCompat.fromShortcuts(r3, r1)
            return r3
    }

    public static boolean isRateLimitingActive(android.content.Context r1) {
            androidx.core.util.Preconditions.checkNotNull(r1)
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r1 = r1.getSystemService(r0)
            android.content.pm.ShortcutManager r1 = (android.content.pm.ShortcutManager) r1
            boolean r1 = r1.isRateLimitingActive()
            return r1
    }

    public static boolean isRequestPinShortcutSupported(android.content.Context r1) {
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r1 = r1.getSystemService(r0)
            android.content.pm.ShortcutManager r1 = (android.content.pm.ShortcutManager) r1
            boolean r1 = r1.isRequestPinShortcutSupported()
            return r1
    }

    public static boolean pushDynamicShortcut(android.content.Context r6, androidx.core.content.pm.ShortcutInfoCompat r7) {
            androidx.core.util.Preconditions.checkNotNull(r6)
            androidx.core.util.Preconditions.checkNotNull(r7)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 32
            r2 = 1
            if (r0 > r1) goto L30
            boolean r0 = r7.isExcludedFromSurfaces(r2)
            if (r0 == 0) goto L30
            java.util.List r6 = getShortcutInfoListeners(r6)
            java.util.Iterator r6 = r6.iterator()
        L1b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r6.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r0 = (androidx.core.content.pm.ShortcutInfoChangeListener) r0
            java.util.List r1 = java.util.Collections.singletonList(r7)
            r0.onShortcutAdded(r1)
            goto L1b
        L2f:
            return r2
        L30:
            int r0 = getMaxShortcutCountPerActivity(r6)
            r1 = 0
            if (r0 != 0) goto L38
            return r1
        L38:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r3 > r4) goto L41
            convertUriIconToBitmapIcon(r6, r7)
        L41:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 30
            if (r3 < r4) goto L57
            java.lang.Class<android.content.pm.ShortcutManager> r3 = android.content.pm.ShortcutManager.class
            java.lang.Object r3 = r6.getSystemService(r3)
            android.content.pm.ShortcutManager r3 = (android.content.pm.ShortcutManager) r3
            android.content.pm.ShortcutInfo r4 = r7.toShortcutInfo()
            r3.pushDynamicShortcut(r4)
            goto L8e
        L57:
            java.lang.Class<android.content.pm.ShortcutManager> r3 = android.content.pm.ShortcutManager.class
            java.lang.Object r3 = r6.getSystemService(r3)
            android.content.pm.ShortcutManager r3 = (android.content.pm.ShortcutManager) r3
            boolean r4 = r3.isRateLimitingActive()
            if (r4 == 0) goto L66
            return r1
        L66:
            java.util.List r4 = r3.getDynamicShortcuts()
            int r5 = r4.size()
            if (r5 < r0) goto L7f
            java.lang.String[] r5 = new java.lang.String[r2]
            java.lang.String r4 = androidx.core.content.pm.ShortcutManagerCompat.Api25Impl.getShortcutInfoWithLowestRank(r4)
            r5[r1] = r4
            java.util.List r4 = java.util.Arrays.asList(r5)
            r3.removeDynamicShortcuts(r4)
        L7f:
            android.content.pm.ShortcutInfo[] r4 = new android.content.pm.ShortcutInfo[r2]
            android.content.pm.ShortcutInfo r5 = r7.toShortcutInfo()
            r4[r1] = r5
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.addDynamicShortcuts(r4)
        L8e:
            androidx.core.content.pm.ShortcutInfoCompatSaver r3 = getShortcutInfoSaverInstance(r6)
            java.util.List r4 = r3.getShortcuts()     // Catch: java.lang.Throwable -> Lda java.lang.Exception -> Lff
            int r5 = r4.size()     // Catch: java.lang.Throwable -> Lda java.lang.Exception -> Lff
            if (r5 < r0) goto Lab
            java.lang.String[] r0 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> Lda java.lang.Exception -> Lff
            java.lang.String r4 = getShortcutInfoCompatWithLowestRank(r4)     // Catch: java.lang.Throwable -> Lda java.lang.Exception -> Lff
            r0[r1] = r4     // Catch: java.lang.Throwable -> Lda java.lang.Exception -> Lff
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: java.lang.Throwable -> Lda java.lang.Exception -> Lff
            r3.removeShortcuts(r0)     // Catch: java.lang.Throwable -> Lda java.lang.Exception -> Lff
        Lab:
            androidx.core.content.pm.ShortcutInfoCompat[] r0 = new androidx.core.content.pm.ShortcutInfoCompat[r2]     // Catch: java.lang.Throwable -> Lda java.lang.Exception -> Lff
            r0[r1] = r7     // Catch: java.lang.Throwable -> Lda java.lang.Exception -> Lff
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: java.lang.Throwable -> Lda java.lang.Exception -> Lff
            r3.addShortcuts(r0)     // Catch: java.lang.Throwable -> Lda java.lang.Exception -> Lff
            java.util.List r0 = getShortcutInfoListeners(r6)
            java.util.Iterator r0 = r0.iterator()
        Lbe:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Ld2
            java.lang.Object r1 = r0.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r1 = (androidx.core.content.pm.ShortcutInfoChangeListener) r1
            java.util.List r3 = java.util.Collections.singletonList(r7)
            r1.onShortcutAdded(r3)
            goto Lbe
        Ld2:
            java.lang.String r7 = r7.getId()
            reportShortcutUsed(r6, r7)
            return r2
        Lda:
            r0 = move-exception
            java.util.List r1 = getShortcutInfoListeners(r6)
            java.util.Iterator r1 = r1.iterator()
        Le3:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lf7
            java.lang.Object r2 = r1.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r2 = (androidx.core.content.pm.ShortcutInfoChangeListener) r2
            java.util.List r3 = java.util.Collections.singletonList(r7)
            r2.onShortcutAdded(r3)
            goto Le3
        Lf7:
            java.lang.String r7 = r7.getId()
            reportShortcutUsed(r6, r7)
            throw r0
        Lff:
            java.util.List r0 = getShortcutInfoListeners(r6)
            java.util.Iterator r0 = r0.iterator()
        L107:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L11b
            java.lang.Object r2 = r0.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r2 = (androidx.core.content.pm.ShortcutInfoChangeListener) r2
            java.util.List r3 = java.util.Collections.singletonList(r7)
            r2.onShortcutAdded(r3)
            goto L107
        L11b:
            java.lang.String r7 = r7.getId()
            reportShortcutUsed(r6, r7)
            return r1
    }

    public static void removeAllDynamicShortcuts(android.content.Context r1) {
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r1.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            r0.removeAllDynamicShortcuts()
            androidx.core.content.pm.ShortcutInfoCompatSaver r0 = getShortcutInfoSaverInstance(r1)
            r0.removeAllShortcuts()
            java.util.List r1 = getShortcutInfoListeners(r1)
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r1.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r0 = (androidx.core.content.pm.ShortcutInfoChangeListener) r0
            r0.onAllShortcutsRemoved()
            goto L1a
        L2a:
            return
    }

    public static void removeDynamicShortcuts(android.content.Context r1, java.util.List<java.lang.String> r2) {
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r1.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            r0.removeDynamicShortcuts(r2)
            androidx.core.content.pm.ShortcutInfoCompatSaver r0 = getShortcutInfoSaverInstance(r1)
            r0.removeShortcuts(r2)
            java.util.List r1 = getShortcutInfoListeners(r1)
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r1.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r0 = (androidx.core.content.pm.ShortcutInfoChangeListener) r0
            r0.onShortcutRemoved(r2)
            goto L1a
        L2a:
            return
    }

    public static void removeLongLivedShortcuts(android.content.Context r2, java.util.List<java.lang.String> r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 >= r1) goto La
            removeDynamicShortcuts(r2, r3)
            return
        La:
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r2.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            r0.removeLongLivedShortcuts(r3)
            androidx.core.content.pm.ShortcutInfoCompatSaver r0 = getShortcutInfoSaverInstance(r2)
            r0.removeShortcuts(r3)
            java.util.List r2 = getShortcutInfoListeners(r2)
            java.util.Iterator r2 = r2.iterator()
        L24:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r2.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r0 = (androidx.core.content.pm.ShortcutInfoChangeListener) r0
            r0.onShortcutRemoved(r3)
            goto L24
        L34:
            return
    }

    private static java.util.List<androidx.core.content.pm.ShortcutInfoCompat> removeShortcutsExcludedFromSurface(java.util.List<androidx.core.content.pm.ShortcutInfoCompat> r3, int r4) {
            java.util.Objects.requireNonNull(r3)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 32
            if (r0 <= r1) goto La
            return r3
        La:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            java.util.Iterator r3 = r3.iterator()
        L13:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r3.next()
            androidx.core.content.pm.ShortcutInfoCompat r1 = (androidx.core.content.pm.ShortcutInfoCompat) r1
            boolean r2 = r1.isExcludedFromSurfaces(r4)
            if (r2 == 0) goto L13
            r0.remove(r1)
            goto L13
        L29:
            return r0
    }

    public static void reportShortcutUsed(android.content.Context r2, java.lang.String r3) {
            androidx.core.util.Preconditions.checkNotNull(r2)
            androidx.core.util.Preconditions.checkNotNull(r3)
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r2.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            r0.reportShortcutUsed(r3)
            java.util.List r2 = getShortcutInfoListeners(r2)
            java.util.Iterator r2 = r2.iterator()
        L19:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r2.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r0 = (androidx.core.content.pm.ShortcutInfoChangeListener) r0
            java.util.List r1 = java.util.Collections.singletonList(r3)
            r0.onShortcutUsageReported(r1)
            goto L19
        L2d:
            return
    }

    public static boolean requestPinShortcut(android.content.Context r2, androidx.core.content.pm.ShortcutInfoCompat r3, android.content.IntentSender r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 32
            if (r0 > r1) goto Lf
            r0 = 1
            boolean r0 = r3.isExcludedFromSurfaces(r0)
            if (r0 == 0) goto Lf
            r2 = 0
            return r2
        Lf:
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r2 = r2.getSystemService(r0)
            android.content.pm.ShortcutManager r2 = (android.content.pm.ShortcutManager) r2
            android.content.pm.ShortcutInfo r3 = r3.toShortcutInfo()
            boolean r2 = r2.requestPinShortcut(r3, r4)
            return r2
    }

    public static boolean setDynamicShortcuts(android.content.Context r5, java.util.List<androidx.core.content.pm.ShortcutInfoCompat> r6) {
            androidx.core.util.Preconditions.checkNotNull(r5)
            androidx.core.util.Preconditions.checkNotNull(r6)
            r0 = 1
            java.util.List r1 = removeShortcutsExcludedFromSurface(r6, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            r2.<init>(r3)
            java.util.Iterator r3 = r1.iterator()
        L18:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2c
            java.lang.Object r4 = r3.next()
            androidx.core.content.pm.ShortcutInfoCompat r4 = (androidx.core.content.pm.ShortcutInfoCompat) r4
            android.content.pm.ShortcutInfo r4 = r4.toShortcutInfo()
            r2.add(r4)
            goto L18
        L2c:
            java.lang.Class<android.content.pm.ShortcutManager> r3 = android.content.pm.ShortcutManager.class
            java.lang.Object r3 = r5.getSystemService(r3)
            android.content.pm.ShortcutManager r3 = (android.content.pm.ShortcutManager) r3
            boolean r2 = r3.setDynamicShortcuts(r2)
            if (r2 != 0) goto L3c
            r5 = 0
            return r5
        L3c:
            androidx.core.content.pm.ShortcutInfoCompatSaver r2 = getShortcutInfoSaverInstance(r5)
            r2.removeAllShortcuts()
            androidx.core.content.pm.ShortcutInfoCompatSaver r2 = getShortcutInfoSaverInstance(r5)
            r2.addShortcuts(r1)
            java.util.List r5 = getShortcutInfoListeners(r5)
            java.util.Iterator r5 = r5.iterator()
        L52:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L65
            java.lang.Object r1 = r5.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r1 = (androidx.core.content.pm.ShortcutInfoChangeListener) r1
            r1.onAllShortcutsRemoved()
            r1.onShortcutAdded(r6)
            goto L52
        L65:
            return r0
    }

    static void setShortcutInfoChangeListeners(java.util.List<androidx.core.content.pm.ShortcutInfoChangeListener> r0) {
            androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoChangeListeners = r0
            return
    }

    static void setShortcutInfoCompatSaver(androidx.core.content.pm.ShortcutInfoCompatSaver<java.lang.Void> r0) {
            androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoCompatSaver = r0
            return
    }

    public static boolean updateShortcuts(android.content.Context r5, java.util.List<androidx.core.content.pm.ShortcutInfoCompat> r6) {
            r0 = 1
            java.util.List r1 = removeShortcutsExcludedFromSurface(r6, r0)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 > r3) goto Le
            convertUriIconsToBitmapIcons(r5, r1)
        Le:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r1.iterator()
        L17:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2b
            java.lang.Object r4 = r3.next()
            androidx.core.content.pm.ShortcutInfoCompat r4 = (androidx.core.content.pm.ShortcutInfoCompat) r4
            android.content.pm.ShortcutInfo r4 = r4.toShortcutInfo()
            r2.add(r4)
            goto L17
        L2b:
            java.lang.Class<android.content.pm.ShortcutManager> r3 = android.content.pm.ShortcutManager.class
            java.lang.Object r3 = r5.getSystemService(r3)
            android.content.pm.ShortcutManager r3 = (android.content.pm.ShortcutManager) r3
            boolean r2 = r3.updateShortcuts(r2)
            if (r2 != 0) goto L3b
            r5 = 0
            return r5
        L3b:
            androidx.core.content.pm.ShortcutInfoCompatSaver r2 = getShortcutInfoSaverInstance(r5)
            r2.addShortcuts(r1)
            java.util.List r5 = getShortcutInfoListeners(r5)
            java.util.Iterator r5 = r5.iterator()
        L4a:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L5a
            java.lang.Object r1 = r5.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r1 = (androidx.core.content.pm.ShortcutInfoChangeListener) r1
            r1.onShortcutUpdated(r6)
            goto L4a
        L5a:
            return r0
    }
}
