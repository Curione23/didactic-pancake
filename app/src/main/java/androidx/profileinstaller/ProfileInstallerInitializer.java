package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements androidx.startup.Initializer<androidx.profileinstaller.ProfileInstallerInitializer.Result> {
    private static final int DELAY_MS = 5000;

    private static class Choreographer16Impl {
        private Choreographer16Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ void lambda$postFrameCallback$0(java.lang.Runnable r0, long r1) {
                r0.run()
                return
        }

        public static void postFrameCallback(java.lang.Runnable r2) {
                android.view.Choreographer r0 = android.view.Choreographer.getInstance()
                androidx.profileinstaller.ProfileInstallerInitializer$Choreographer16Impl$$ExternalSyntheticLambda0 r1 = new androidx.profileinstaller.ProfileInstallerInitializer$Choreographer16Impl$$ExternalSyntheticLambda0
                r1.<init>(r2)
                r0.postFrameCallback(r1)
                return
        }
    }

    private static class Handler28Impl {
        private Handler28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static android.os.Handler createAsync(android.os.Looper r0) {
                android.os.Handler r0 = android.os.Handler.createAsync(r0)
                return r0
        }
    }

    public static class Result {
        public Result() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public ProfileInstallerInitializer() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void lambda$installAfterDelay$1(android.content.Context r0) {
            writeInBackground(r0)
            return
    }

    static /* synthetic */ void lambda$writeInBackground$2(android.content.Context r0) {
            androidx.profileinstaller.ProfileInstaller.writeProfile(r0)
            return
    }

    private static void writeInBackground(android.content.Context r8) {
            java.util.concurrent.ThreadPoolExecutor r7 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            r6.<init>()
            r1 = 0
            r2 = 1
            r3 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r5, r6)
            androidx.profileinstaller.ProfileInstallerInitializer$$ExternalSyntheticLambda2 r0 = new androidx.profileinstaller.ProfileInstallerInitializer$$ExternalSyntheticLambda2
            r0.<init>(r8)
            r7.execute(r0)
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.startup.Initializer
    public androidx.profileinstaller.ProfileInstallerInitializer.Result create(android.content.Context r1) {
            r0 = this;
            android.content.Context r1 = r1.getApplicationContext()
            r0.delayAfterFirstFrame(r1)
            androidx.profileinstaller.ProfileInstallerInitializer$Result r1 = new androidx.profileinstaller.ProfileInstallerInitializer$Result
            r1.<init>()
            return r1
    }

    @Override // androidx.startup.Initializer
    public /* bridge */ /* synthetic */ androidx.profileinstaller.ProfileInstallerInitializer.Result create(android.content.Context r1) {
            r0 = this;
            androidx.profileinstaller.ProfileInstallerInitializer$Result r1 = r0.create(r1)
            return r1
    }

    void delayAfterFirstFrame(android.content.Context r2) {
            r1 = this;
            androidx.profileinstaller.ProfileInstallerInitializer$$ExternalSyntheticLambda1 r0 = new androidx.profileinstaller.ProfileInstallerInitializer$$ExternalSyntheticLambda1
            r0.<init>(r1, r2)
            androidx.profileinstaller.ProfileInstallerInitializer.Choreographer16Impl.postFrameCallback(r0)
            return
    }

    @Override // androidx.startup.Initializer
    public java.util.List<java.lang.Class<? extends androidx.startup.Initializer<?>>> dependencies() {
            r1 = this;
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
    }

    void installAfterDelay(android.content.Context r6) {
            r5 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lf
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Handler r0 = androidx.profileinstaller.ProfileInstallerInitializer.Handler28Impl.createAsync(r0)
            goto L18
        Lf:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
        L18:
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            r2 = 1000(0x3e8, float:1.401E-42)
            r3 = 1
            int r2 = java.lang.Math.max(r2, r3)
            int r1 = r1.nextInt(r2)
            androidx.profileinstaller.ProfileInstallerInitializer$$ExternalSyntheticLambda0 r2 = new androidx.profileinstaller.ProfileInstallerInitializer$$ExternalSyntheticLambda0
            r2.<init>(r6)
            int r1 = r1 + 5000
            long r3 = (long) r1
            r0.postDelayed(r2, r3)
            return
    }

    /* JADX INFO: renamed from: lambda$delayAfterFirstFrame$0$androidx-profileinstaller-ProfileInstallerInitializer, reason: not valid java name */
    /* synthetic */ void m68xfbd6c934(android.content.Context r1) {
            r0 = this;
            r0.installAfterDelay(r1)
            return
    }
}
