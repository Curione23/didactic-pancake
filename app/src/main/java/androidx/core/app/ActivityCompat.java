package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public class ActivityCompat extends androidx.core.content.ContextCompat {
    private static androidx.core.app.ActivityCompat.PermissionCompatDelegate sDelegate;

    /* JADX INFO: renamed from: androidx.core.app.ActivityCompat$1, reason: invalid class name */
    class AnonymousClass1 implements java.lang.Runnable {
        final /* synthetic */ android.app.Activity val$activity;
        final /* synthetic */ java.lang.String[] val$permissionsArray;
        final /* synthetic */ int val$requestCode;

        AnonymousClass1(java.lang.String[] r1, android.app.Activity r2, int r3) {
                r0 = this;
                r0.val$permissionsArray = r1
                r0.val$activity = r2
                r0.val$requestCode = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r6 = this;
                java.lang.String[] r0 = r6.val$permissionsArray
                int r0 = r0.length
                int[] r0 = new int[r0]
                android.app.Activity r1 = r6.val$activity
                android.content.pm.PackageManager r1 = r1.getPackageManager()
                android.app.Activity r2 = r6.val$activity
                java.lang.String r2 = r2.getPackageName()
                java.lang.String[] r3 = r6.val$permissionsArray
                int r3 = r3.length
                r4 = 0
            L15:
                if (r4 >= r3) goto L24
                java.lang.String[] r5 = r6.val$permissionsArray
                r5 = r5[r4]
                int r5 = r1.checkPermission(r5, r2)
                r0[r4] = r5
                int r4 = r4 + 1
                goto L15
            L24:
                android.app.Activity r1 = r6.val$activity
                androidx.core.app.ActivityCompat$OnRequestPermissionsResultCallback r1 = (androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback) r1
                int r2 = r6.val$requestCode
                java.lang.String[] r3 = r6.val$permissionsArray
                r1.onRequestPermissionsResult(r2, r3, r0)
                return
        }
    }

    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void finishAfterTransition(android.app.Activity r0) {
                r0.finishAfterTransition()
                return
        }

        static void postponeEnterTransition(android.app.Activity r0) {
                r0.postponeEnterTransition()
                return
        }

        static void setEnterSharedElementCallback(android.app.Activity r0, android.app.SharedElementCallback r1) {
                r0.setEnterSharedElementCallback(r1)
                return
        }

        static void setExitSharedElementCallback(android.app.Activity r0, android.app.SharedElementCallback r1) {
                r0.setExitSharedElementCallback(r1)
                return
        }

        static void startPostponedEnterTransition(android.app.Activity r0) {
                r0.startPostponedEnterTransition()
                return
        }
    }

    static class Api22Impl {
        private Api22Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.net.Uri getReferrer(android.app.Activity r0) {
                android.net.Uri r0 = r0.getReferrer()
                return r0
        }
    }

    static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void onSharedElementsReady(java.lang.Object r0) {
                android.app.SharedElementCallback$OnSharedElementsReadyListener r0 = (android.app.SharedElementCallback.OnSharedElementsReadyListener) r0
                r0.onSharedElementsReady()
                return
        }

        static void requestPermissions(android.app.Activity r0, java.lang.String[] r1, int r2) {
                r0.requestPermissions(r1, r2)
                return
        }

        static boolean shouldShowRequestPermissionRationale(android.app.Activity r0, java.lang.String r1) {
                boolean r0 = r0.shouldShowRequestPermissionRationale(r1)
                return r0
        }
    }

    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static <T> T requireViewById(android.app.Activity r0, int r1) {
                android.view.View r0 = r0.requireViewById(r1)
                return r0
        }
    }

    static class Api30Impl {
        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.view.Display getDisplay(android.content.ContextWrapper r0) {
                android.view.Display r0 = r0.getDisplay()
                return r0
        }

        static void setLocusContext(android.app.Activity r0, androidx.core.content.LocusIdCompat r1, android.os.Bundle r2) {
                if (r1 != 0) goto L4
                r1 = 0
                goto L8
            L4:
                android.content.LocusId r1 = r1.toLocusId()
            L8:
                r0.setLocusContext(r1, r2)
                return
        }
    }

    static class Api31Impl {
        private Api31Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean isLaunchedFromBubble(android.app.Activity r0) {
                boolean r0 = r0.isLaunchedFromBubble()
                return r0
        }

        static boolean shouldShowRequestPermissionRationale(android.app.Activity r6, java.lang.String r7) {
                android.app.Application r0 = r6.getApplication()     // Catch: java.lang.Throwable -> L27
                android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L27
                java.lang.Class<android.content.pm.PackageManager> r1 = android.content.pm.PackageManager.class
                java.lang.String r2 = "shouldShowRequestPermissionRationale"
                r3 = 1
                java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L27
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                r5 = 0
                r3[r5] = r4     // Catch: java.lang.Throwable -> L27
                java.lang.reflect.Method r1 = r1.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L27
                java.lang.Object[] r2 = new java.lang.Object[]{r7}     // Catch: java.lang.Throwable -> L27
                java.lang.Object r0 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L27
                java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L27
                boolean r6 = r0.booleanValue()     // Catch: java.lang.Throwable -> L27
                return r6
            L27:
                boolean r6 = r6.shouldShowRequestPermissionRationale(r7)
                return r6
        }
    }

    static class Api32Impl {
        private Api32Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean shouldShowRequestPermissionRationale(android.app.Activity r0, java.lang.String r1) {
                boolean r0 = r0.shouldShowRequestPermissionRationale(r1)
                return r0
        }
    }

    public interface OnRequestPermissionsResultCallback {
        void onRequestPermissionsResult(int r1, java.lang.String[] r2, int[] r3);
    }

    public interface PermissionCompatDelegate {
        boolean onActivityResult(android.app.Activity r1, int r2, int r3, android.content.Intent r4);

        boolean requestPermissions(android.app.Activity r1, java.lang.String[] r2, int r3);
    }

    public interface RequestPermissionsRequestCodeValidator {
        void validateRequestPermissionsRequestCode(int r1);
    }

    static class SharedElementCallback21Impl extends android.app.SharedElementCallback {
        private final androidx.core.app.SharedElementCallback mCallback;

        SharedElementCallback21Impl(androidx.core.app.SharedElementCallback r1) {
                r0 = this;
                r0.<init>()
                r0.mCallback = r1
                return
        }

        static /* synthetic */ void lambda$onSharedElementsArrived$0(android.app.SharedElementCallback.OnSharedElementsReadyListener r0) {
                androidx.core.app.ActivityCompat.Api23Impl.onSharedElementsReady(r0)
                return
        }

        @Override // android.app.SharedElementCallback
        public android.os.Parcelable onCaptureSharedElementSnapshot(android.view.View r2, android.graphics.Matrix r3, android.graphics.RectF r4) {
                r1 = this;
                androidx.core.app.SharedElementCallback r0 = r1.mCallback
                android.os.Parcelable r2 = r0.onCaptureSharedElementSnapshot(r2, r3, r4)
                return r2
        }

        @Override // android.app.SharedElementCallback
        public android.view.View onCreateSnapshotView(android.content.Context r2, android.os.Parcelable r3) {
                r1 = this;
                androidx.core.app.SharedElementCallback r0 = r1.mCallback
                android.view.View r2 = r0.onCreateSnapshotView(r2, r3)
                return r2
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(java.util.List<java.lang.String> r2, java.util.Map<java.lang.String, android.view.View> r3) {
                r1 = this;
                androidx.core.app.SharedElementCallback r0 = r1.mCallback
                r0.onMapSharedElements(r2, r3)
                return
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(java.util.List<android.view.View> r2) {
                r1 = this;
                androidx.core.app.SharedElementCallback r0 = r1.mCallback
                r0.onRejectSharedElements(r2)
                return
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(java.util.List<java.lang.String> r2, java.util.List<android.view.View> r3, java.util.List<android.view.View> r4) {
                r1 = this;
                androidx.core.app.SharedElementCallback r0 = r1.mCallback
                r0.onSharedElementEnd(r2, r3, r4)
                return
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(java.util.List<java.lang.String> r2, java.util.List<android.view.View> r3, java.util.List<android.view.View> r4) {
                r1 = this;
                androidx.core.app.SharedElementCallback r0 = r1.mCallback
                r0.onSharedElementStart(r2, r3, r4)
                return
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementsArrived(java.util.List<java.lang.String> r3, java.util.List<android.view.View> r4, android.app.SharedElementCallback.OnSharedElementsReadyListener r5) {
                r2 = this;
                androidx.core.app.SharedElementCallback r0 = r2.mCallback
                androidx.core.app.ActivityCompat$SharedElementCallback21Impl$$ExternalSyntheticLambda0 r1 = new androidx.core.app.ActivityCompat$SharedElementCallback21Impl$$ExternalSyntheticLambda0
                r1.<init>(r5)
                r0.onSharedElementsArrived(r3, r4, r1)
                return
        }
    }

    protected ActivityCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void finishAffinity(android.app.Activity r0) {
            r0.finishAffinity()
            return
    }

    public static void finishAfterTransition(android.app.Activity r0) {
            androidx.core.app.ActivityCompat.Api21Impl.finishAfterTransition(r0)
            return
    }

    public static androidx.core.app.ActivityCompat.PermissionCompatDelegate getPermissionCompatDelegate() {
            androidx.core.app.ActivityCompat$PermissionCompatDelegate r0 = androidx.core.app.ActivityCompat.sDelegate
            return r0
    }

    public static android.net.Uri getReferrer(android.app.Activity r0) {
            android.net.Uri r0 = androidx.core.app.ActivityCompat.Api22Impl.getReferrer(r0)
            return r0
    }

    @java.lang.Deprecated
    public static boolean invalidateOptionsMenu(android.app.Activity r0) {
            r0.invalidateOptionsMenu()
            r0 = 1
            return r0
    }

    public static boolean isLaunchedFromBubble(android.app.Activity r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lb
            boolean r4 = androidx.core.app.ActivityCompat.Api31Impl.isLaunchedFromBubble(r4)
            return r4
        Lb:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L26
            android.view.Display r0 = androidx.core.app.ActivityCompat.Api30Impl.getDisplay(r4)
            if (r0 == 0) goto L24
            android.view.Display r4 = androidx.core.app.ActivityCompat.Api30Impl.getDisplay(r4)
            int r4 = r4.getDisplayId()
            if (r4 == 0) goto L24
            goto L25
        L24:
            r2 = r3
        L25:
            return r2
        L26:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 != r1) goto L47
            android.view.WindowManager r0 = r4.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            if (r0 == 0) goto L45
            android.view.WindowManager r4 = r4.getWindowManager()
            android.view.Display r4 = r4.getDefaultDisplay()
            int r4 = r4.getDisplayId()
            if (r4 == 0) goto L45
            goto L46
        L45:
            r2 = r3
        L46:
            return r2
        L47:
            return r3
    }

    static /* synthetic */ void lambda$recreate$0(android.app.Activity r1) {
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto Lf
            boolean r0 = androidx.core.app.ActivityRecreator.recreate(r1)
            if (r0 != 0) goto Lf
            r1.recreate()
        Lf:
            return
    }

    public static void postponeEnterTransition(android.app.Activity r0) {
            androidx.core.app.ActivityCompat.Api21Impl.postponeEnterTransition(r0)
            return
    }

    public static void recreate(android.app.Activity r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto La
            r2.recreate()
            goto L1b
        La:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = r2.getMainLooper()
            r0.<init>(r1)
            androidx.core.app.ActivityCompat$$ExternalSyntheticLambda0 r1 = new androidx.core.app.ActivityCompat$$ExternalSyntheticLambda0
            r1.<init>(r2)
            r0.post(r1)
        L1b:
            return
    }

    public static androidx.core.view.DragAndDropPermissionsCompat requestDragAndDropPermissions(android.app.Activity r0, android.view.DragEvent r1) {
            androidx.core.view.DragAndDropPermissionsCompat r0 = androidx.core.view.DragAndDropPermissionsCompat.request(r0, r1)
            return r0
    }

    public static void requestPermissions(android.app.Activity r6, java.lang.String[] r7, int r8) {
            androidx.core.app.ActivityCompat$PermissionCompatDelegate r0 = androidx.core.app.ActivityCompat.sDelegate
            if (r0 == 0) goto Lb
            boolean r0 = r0.requestPermissions(r6, r7, r8)
            if (r0 == 0) goto Lb
            return
        Lb:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1 = 0
            r2 = r1
        L12:
            int r3 = r7.length
            if (r2 >= r3) goto L56
            r3 = r7[r2]
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L37
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 33
            if (r3 >= r4) goto L34
            r3 = r7[r2]
            java.lang.String r4 = "android.permission.POST_NOTIFICATIONS"
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 == 0) goto L34
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.add(r3)
        L34:
            int r2 = r2 + 1
            goto L12
        L37:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Permission request for permissions "
            r8.<init>(r0)
            java.lang.String r7 = java.util.Arrays.toString(r7)
            java.lang.StringBuilder r7 = r8.append(r7)
            java.lang.String r8 = " must not contain null or empty values"
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L56:
            int r2 = r0.size()
            if (r2 <= 0) goto L61
            int r3 = r7.length
            int r3 = r3 - r2
            java.lang.String[] r3 = new java.lang.String[r3]
            goto L62
        L61:
            r3 = r7
        L62:
            if (r2 <= 0) goto L80
            int r4 = r7.length
            if (r2 != r4) goto L68
            return
        L68:
            r2 = r1
        L69:
            int r4 = r7.length
            if (r1 >= r4) goto L80
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            boolean r4 = r0.contains(r4)
            if (r4 != 0) goto L7d
            int r4 = r2 + 1
            r5 = r7[r1]
            r3[r2] = r5
            r2 = r4
        L7d:
            int r1 = r1 + 1
            goto L69
        L80:
            boolean r0 = r6 instanceof androidx.core.app.ActivityCompat.RequestPermissionsRequestCodeValidator
            if (r0 == 0) goto L8a
            r0 = r6
            androidx.core.app.ActivityCompat$RequestPermissionsRequestCodeValidator r0 = (androidx.core.app.ActivityCompat.RequestPermissionsRequestCodeValidator) r0
            r0.validateRequestPermissionsRequestCode(r8)
        L8a:
            androidx.core.app.ActivityCompat.Api23Impl.requestPermissions(r6, r7, r8)
            return
    }

    public static <T extends android.view.View> T requireViewById(android.app.Activity r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            java.lang.Object r2 = androidx.core.app.ActivityCompat.Api28Impl.requireViewById(r2, r3)
            android.view.View r2 = (android.view.View) r2
            return r2
        Ld:
            android.view.View r2 = r2.findViewById(r3)
            if (r2 == 0) goto L14
            return r2
        L14:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "ID does not reference a View inside this Activity"
            r2.<init>(r3)
            throw r2
    }

    public static void setEnterSharedElementCallback(android.app.Activity r1, androidx.core.app.SharedElementCallback r2) {
            if (r2 == 0) goto L8
            androidx.core.app.ActivityCompat$SharedElementCallback21Impl r0 = new androidx.core.app.ActivityCompat$SharedElementCallback21Impl
            r0.<init>(r2)
            goto L9
        L8:
            r0 = 0
        L9:
            androidx.core.app.ActivityCompat.Api21Impl.setEnterSharedElementCallback(r1, r0)
            return
    }

    public static void setExitSharedElementCallback(android.app.Activity r1, androidx.core.app.SharedElementCallback r2) {
            if (r2 == 0) goto L8
            androidx.core.app.ActivityCompat$SharedElementCallback21Impl r0 = new androidx.core.app.ActivityCompat$SharedElementCallback21Impl
            r0.<init>(r2)
            goto L9
        L8:
            r0 = 0
        L9:
            androidx.core.app.ActivityCompat.Api21Impl.setExitSharedElementCallback(r1, r0)
            return
    }

    public static void setLocusContext(android.app.Activity r2, androidx.core.content.LocusIdCompat r3, android.os.Bundle r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L9
            androidx.core.app.ActivityCompat.Api30Impl.setLocusContext(r2, r3, r4)
        L9:
            return
    }

    public static void setPermissionCompatDelegate(androidx.core.app.ActivityCompat.PermissionCompatDelegate r0) {
            androidx.core.app.ActivityCompat.sDelegate = r0
            return
    }

    public static boolean shouldShowRequestPermissionRationale(android.app.Activity r2, java.lang.String r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 >= r1) goto L10
            java.lang.String r0 = "android.permission.POST_NOTIFICATIONS"
            boolean r0 = android.text.TextUtils.equals(r0, r3)
            if (r0 == 0) goto L10
            r2 = 0
            return r2
        L10:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 32
            if (r0 < r1) goto L1b
            boolean r2 = androidx.core.app.ActivityCompat.Api32Impl.shouldShowRequestPermissionRationale(r2, r3)
            return r2
        L1b:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 != r1) goto L26
            boolean r2 = androidx.core.app.ActivityCompat.Api31Impl.shouldShowRequestPermissionRationale(r2, r3)
            return r2
        L26:
            boolean r2 = androidx.core.app.ActivityCompat.Api23Impl.shouldShowRequestPermissionRationale(r2, r3)
            return r2
    }

    public static void startActivityForResult(android.app.Activity r0, android.content.Intent r1, int r2, android.os.Bundle r3) {
            r0.startActivityForResult(r1, r2, r3)
            return
    }

    public static void startIntentSenderForResult(android.app.Activity r0, android.content.IntentSender r1, int r2, android.content.Intent r3, int r4, int r5, int r6, android.os.Bundle r7) throws android.content.IntentSender.SendIntentException {
            r0.startIntentSenderForResult(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void startPostponedEnterTransition(android.app.Activity r0) {
            androidx.core.app.ActivityCompat.Api21Impl.startPostponedEnterTransition(r0)
            return
    }
}
