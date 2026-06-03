package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements androidx.startup.Initializer<java.lang.Boolean> {
    private static final long STARTUP_THREAD_CREATION_DELAY_MS = 500;
    private static final java.lang.String S_INITIALIZER_THREAD_NAME = "EmojiCompatInitializer";


    static class BackgroundDefaultConfig extends androidx.emoji2.text.EmojiCompat.Config {
        protected BackgroundDefaultConfig(android.content.Context r2) {
                r1 = this;
                androidx.emoji2.text.EmojiCompatInitializer$BackgroundDefaultLoader r0 = new androidx.emoji2.text.EmojiCompatInitializer$BackgroundDefaultLoader
                r0.<init>(r2)
                r1.<init>(r0)
                r2 = 1
                r1.setMetadataLoadStrategy(r2)
                return
        }
    }

    static class BackgroundDefaultLoader implements androidx.emoji2.text.EmojiCompat.MetadataRepoLoader {
        private final android.content.Context mContext;


        BackgroundDefaultLoader(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                android.content.Context r1 = r1.getApplicationContext()
                r0.mContext = r1
                return
        }

        void doLoad(androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback r3, java.util.concurrent.ThreadPoolExecutor r4) {
                r2 = this;
                android.content.Context r0 = r2.mContext     // Catch: java.lang.Throwable -> L20
                androidx.emoji2.text.FontRequestEmojiCompatConfig r0 = androidx.emoji2.text.DefaultEmojiCompatConfig.create(r0)     // Catch: java.lang.Throwable -> L20
                if (r0 == 0) goto L18
                r0.setLoadingExecutor(r4)     // Catch: java.lang.Throwable -> L20
                androidx.emoji2.text.EmojiCompat$MetadataRepoLoader r0 = r0.getMetadataRepoLoader()     // Catch: java.lang.Throwable -> L20
                androidx.emoji2.text.EmojiCompatInitializer$BackgroundDefaultLoader$1 r1 = new androidx.emoji2.text.EmojiCompatInitializer$BackgroundDefaultLoader$1     // Catch: java.lang.Throwable -> L20
                r1.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L20
                r0.load(r1)     // Catch: java.lang.Throwable -> L20
                goto L27
            L18:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L20
                java.lang.String r1 = "EmojiCompat font provider not available on this device."
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L20
                throw r0     // Catch: java.lang.Throwable -> L20
            L20:
                r0 = move-exception
                r3.onFailed(r0)
                r4.shutdown()
            L27:
                return
        }

        /* JADX INFO: renamed from: lambda$load$0$androidx-emoji2-text-EmojiCompatInitializer$BackgroundDefaultLoader, reason: not valid java name */
        /* synthetic */ void m51x5cc8028a(androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback r1, java.util.concurrent.ThreadPoolExecutor r2) {
                r0 = this;
                r0.doLoad(r1, r2)
                return
        }

        @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoader
        public void load(androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback r3) {
                r2 = this;
                java.lang.String r0 = "EmojiCompatInitializer"
                java.util.concurrent.ThreadPoolExecutor r0 = androidx.emoji2.text.ConcurrencyHelpers.createBackgroundPriorityExecutor(r0)
                androidx.emoji2.text.EmojiCompatInitializer$BackgroundDefaultLoader$$ExternalSyntheticLambda0 r1 = new androidx.emoji2.text.EmojiCompatInitializer$BackgroundDefaultLoader$$ExternalSyntheticLambda0
                r1.<init>(r2, r3, r0)
                r0.execute(r1)
                return
        }
    }

    static class LoadEmojiCompatRunnable implements java.lang.Runnable {
        LoadEmojiCompatRunnable() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                java.lang.String r0 = "EmojiCompat.EmojiCompatInitializer.run"
                androidx.core.os.TraceCompat.beginSection(r0)     // Catch: java.lang.Throwable -> L16
                boolean r0 = androidx.emoji2.text.EmojiCompat.isConfigured()     // Catch: java.lang.Throwable -> L16
                if (r0 == 0) goto L12
                androidx.emoji2.text.EmojiCompat r0 = androidx.emoji2.text.EmojiCompat.get()     // Catch: java.lang.Throwable -> L16
                r0.load()     // Catch: java.lang.Throwable -> L16
            L12:
                androidx.core.os.TraceCompat.endSection()
                return
            L16:
                r0 = move-exception
                androidx.core.os.TraceCompat.endSection()
                throw r0
        }
    }

    public EmojiCompatInitializer() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.startup.Initializer
    public java.lang.Boolean create(android.content.Context r2) {
            r1 = this;
            androidx.emoji2.text.EmojiCompatInitializer$BackgroundDefaultConfig r0 = new androidx.emoji2.text.EmojiCompatInitializer$BackgroundDefaultConfig
            r0.<init>(r2)
            androidx.emoji2.text.EmojiCompat.init(r0)
            r1.delayUntilFirstResume(r2)
            r2 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
    }

    @Override // androidx.startup.Initializer
    public /* bridge */ /* synthetic */ java.lang.Boolean create(android.content.Context r1) {
            r0 = this;
            java.lang.Boolean r1 = r0.create(r1)
            return r1
    }

    void delayUntilFirstResume(android.content.Context r2) {
            r1 = this;
            androidx.startup.AppInitializer r2 = androidx.startup.AppInitializer.getInstance(r2)
            java.lang.Class<androidx.lifecycle.ProcessLifecycleInitializer> r0 = androidx.lifecycle.ProcessLifecycleInitializer.class
            java.lang.Object r2 = r2.initializeComponent(r0)
            androidx.lifecycle.LifecycleOwner r2 = (androidx.lifecycle.LifecycleOwner) r2
            androidx.lifecycle.Lifecycle r2 = r2.getLifecycle()
            androidx.emoji2.text.EmojiCompatInitializer$1 r0 = new androidx.emoji2.text.EmojiCompatInitializer$1
            r0.<init>(r1, r2)
            r2.addObserver(r0)
            return
    }

    @Override // androidx.startup.Initializer
    public java.util.List<java.lang.Class<? extends androidx.startup.Initializer<?>>> dependencies() {
            r1 = this;
            java.lang.Class<androidx.lifecycle.ProcessLifecycleInitializer> r0 = androidx.lifecycle.ProcessLifecycleInitializer.class
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
    }

    void loadEmojiCompatAfterDelay() {
            r4 = this;
            android.os.Handler r0 = androidx.emoji2.text.ConcurrencyHelpers.mainHandlerAsync()
            androidx.emoji2.text.EmojiCompatInitializer$LoadEmojiCompatRunnable r1 = new androidx.emoji2.text.EmojiCompatInitializer$LoadEmojiCompatRunnable
            r1.<init>()
            r2 = 500(0x1f4, double:2.47E-321)
            r0.postDelayed(r1, r2)
            return
    }
}
