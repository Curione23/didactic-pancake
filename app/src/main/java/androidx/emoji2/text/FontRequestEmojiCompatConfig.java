package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public class FontRequestEmojiCompatConfig extends androidx.emoji2.text.EmojiCompat.Config {
    private static final androidx.emoji2.text.FontRequestEmojiCompatConfig.FontProviderHelper DEFAULT_FONTS_CONTRACT = null;

    public static class ExponentialBackoffRetryPolicy extends androidx.emoji2.text.FontRequestEmojiCompatConfig.RetryPolicy {
        private long mRetryOrigin;
        private final long mTotalMs;

        public ExponentialBackoffRetryPolicy(long r1) {
                r0 = this;
                r0.<init>()
                r0.mTotalMs = r1
                return
        }

        @Override // androidx.emoji2.text.FontRequestEmojiCompatConfig.RetryPolicy
        public long getRetryDelay() {
                r6 = this;
                long r0 = r6.mRetryOrigin
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto Lf
                long r0 = android.os.SystemClock.uptimeMillis()
                r6.mRetryOrigin = r0
                return r2
            Lf:
                long r0 = android.os.SystemClock.uptimeMillis()
                long r2 = r6.mRetryOrigin
                long r0 = r0 - r2
                long r2 = r6.mTotalMs
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 <= 0) goto L1f
                r0 = -1
                return r0
            L1f:
                r2 = 1000(0x3e8, double:4.94E-321)
                long r2 = java.lang.Math.max(r0, r2)
                long r4 = r6.mTotalMs
                long r4 = r4 - r0
                long r0 = java.lang.Math.min(r2, r4)
                return r0
        }
    }

    public static class FontProviderHelper {
        public FontProviderHelper() {
                r0 = this;
                r0.<init>()
                return
        }

        public android.graphics.Typeface buildTypeface(android.content.Context r3, androidx.core.provider.FontsContractCompat.FontInfo r4) throws android.content.pm.PackageManager.NameNotFoundException {
                r2 = this;
                r0 = 1
                androidx.core.provider.FontsContractCompat$FontInfo[] r0 = new androidx.core.provider.FontsContractCompat.FontInfo[r0]
                r1 = 0
                r0[r1] = r4
                r4 = 0
                android.graphics.Typeface r3 = androidx.core.provider.FontsContractCompat.buildTypeface(r3, r4, r0)
                return r3
        }

        public androidx.core.provider.FontsContractCompat.FontFamilyResult fetchFonts(android.content.Context r2, androidx.core.provider.FontRequest r3) throws android.content.pm.PackageManager.NameNotFoundException {
                r1 = this;
                r0 = 0
                androidx.core.provider.FontsContractCompat$FontFamilyResult r2 = androidx.core.provider.FontsContractCompat.fetchFonts(r2, r0, r3)
                return r2
        }

        public void registerObserver(android.content.Context r2, android.net.Uri r3, android.database.ContentObserver r4) {
                r1 = this;
                android.content.ContentResolver r2 = r2.getContentResolver()
                r0 = 0
                r2.registerContentObserver(r3, r0, r4)
                return
        }

        public void unregisterObserver(android.content.Context r1, android.database.ContentObserver r2) {
                r0 = this;
                android.content.ContentResolver r1 = r1.getContentResolver()
                r1.unregisterContentObserver(r2)
                return
        }
    }

    private static class FontRequestMetadataLoader implements androidx.emoji2.text.EmojiCompat.MetadataRepoLoader {
        private static final java.lang.String S_TRACE_BUILD_TYPEFACE = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface";
        androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback mCallback;
        private final android.content.Context mContext;
        private java.util.concurrent.Executor mExecutor;
        private final androidx.emoji2.text.FontRequestEmojiCompatConfig.FontProviderHelper mFontProviderHelper;
        private final java.lang.Object mLock;
        private android.os.Handler mMainHandler;
        private java.lang.Runnable mMainHandlerLoadCallback;
        private java.util.concurrent.ThreadPoolExecutor mMyThreadPoolExecutor;
        private android.database.ContentObserver mObserver;
        private final androidx.core.provider.FontRequest mRequest;
        private androidx.emoji2.text.FontRequestEmojiCompatConfig.RetryPolicy mRetryPolicy;


        FontRequestMetadataLoader(android.content.Context r2, androidx.core.provider.FontRequest r3, androidx.emoji2.text.FontRequestEmojiCompatConfig.FontProviderHelper r4) {
                r1 = this;
                r1.<init>()
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                r1.mLock = r0
                java.lang.String r0 = "Context cannot be null"
                androidx.core.util.Preconditions.checkNotNull(r2, r0)
                java.lang.String r0 = "FontRequest cannot be null"
                androidx.core.util.Preconditions.checkNotNull(r3, r0)
                android.content.Context r2 = r2.getApplicationContext()
                r1.mContext = r2
                r1.mRequest = r3
                r1.mFontProviderHelper = r4
                return
        }

        private void cleanUp() {
                r5 = this;
                java.lang.Object r0 = r5.mLock
                monitor-enter(r0)
                r1 = 0
                r5.mCallback = r1     // Catch: java.lang.Throwable -> L2b
                android.database.ContentObserver r2 = r5.mObserver     // Catch: java.lang.Throwable -> L2b
                if (r2 == 0) goto L13
                androidx.emoji2.text.FontRequestEmojiCompatConfig$FontProviderHelper r3 = r5.mFontProviderHelper     // Catch: java.lang.Throwable -> L2b
                android.content.Context r4 = r5.mContext     // Catch: java.lang.Throwable -> L2b
                r3.unregisterObserver(r4, r2)     // Catch: java.lang.Throwable -> L2b
                r5.mObserver = r1     // Catch: java.lang.Throwable -> L2b
            L13:
                android.os.Handler r2 = r5.mMainHandler     // Catch: java.lang.Throwable -> L2b
                if (r2 == 0) goto L1c
                java.lang.Runnable r3 = r5.mMainHandlerLoadCallback     // Catch: java.lang.Throwable -> L2b
                r2.removeCallbacks(r3)     // Catch: java.lang.Throwable -> L2b
            L1c:
                r5.mMainHandler = r1     // Catch: java.lang.Throwable -> L2b
                java.util.concurrent.ThreadPoolExecutor r2 = r5.mMyThreadPoolExecutor     // Catch: java.lang.Throwable -> L2b
                if (r2 == 0) goto L25
                r2.shutdown()     // Catch: java.lang.Throwable -> L2b
            L25:
                r5.mExecutor = r1     // Catch: java.lang.Throwable -> L2b
                r5.mMyThreadPoolExecutor = r1     // Catch: java.lang.Throwable -> L2b
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
                return
            L2b:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
                throw r1
        }

        private androidx.core.provider.FontsContractCompat.FontInfo retrieveFontInfo() {
                r4 = this;
                androidx.emoji2.text.FontRequestEmojiCompatConfig$FontProviderHelper r0 = r4.mFontProviderHelper     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L44
                android.content.Context r1 = r4.mContext     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L44
                androidx.core.provider.FontRequest r2 = r4.mRequest     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L44
                androidx.core.provider.FontsContractCompat$FontFamilyResult r0 = r0.fetchFonts(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L44
                int r1 = r0.getStatusCode()
                if (r1 != 0) goto L25
                androidx.core.provider.FontsContractCompat$FontInfo[] r0 = r0.getFonts()
                if (r0 == 0) goto L1d
                int r1 = r0.length
                if (r1 == 0) goto L1d
                r1 = 0
                r0 = r0[r1]
                return r0
            L1d:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.String r1 = "fetchFonts failed (empty result)"
                r0.<init>(r1)
                throw r0
            L25:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "fetchFonts failed ("
                r2.<init>(r3)
                int r0 = r0.getStatusCode()
                java.lang.StringBuilder r0 = r2.append(r0)
                java.lang.String r2 = ")"
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            L44:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "provider not found"
                r1.<init>(r2, r0)
                throw r1
        }

        private void scheduleRetry(android.net.Uri r6, long r7) {
                r5 = this;
                java.lang.Object r0 = r5.mLock
                monitor-enter(r0)
                android.os.Handler r1 = r5.mMainHandler     // Catch: java.lang.Throwable -> L31
                if (r1 != 0) goto Ld
                android.os.Handler r1 = androidx.emoji2.text.ConcurrencyHelpers.mainHandlerAsync()     // Catch: java.lang.Throwable -> L31
                r5.mMainHandler = r1     // Catch: java.lang.Throwable -> L31
            Ld:
                android.database.ContentObserver r2 = r5.mObserver     // Catch: java.lang.Throwable -> L31
                if (r2 != 0) goto L1f
                androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader$1 r2 = new androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader$1     // Catch: java.lang.Throwable -> L31
                r2.<init>(r5, r1)     // Catch: java.lang.Throwable -> L31
                r5.mObserver = r2     // Catch: java.lang.Throwable -> L31
                androidx.emoji2.text.FontRequestEmojiCompatConfig$FontProviderHelper r3 = r5.mFontProviderHelper     // Catch: java.lang.Throwable -> L31
                android.content.Context r4 = r5.mContext     // Catch: java.lang.Throwable -> L31
                r3.registerObserver(r4, r6, r2)     // Catch: java.lang.Throwable -> L31
            L1f:
                java.lang.Runnable r6 = r5.mMainHandlerLoadCallback     // Catch: java.lang.Throwable -> L31
                if (r6 != 0) goto L2a
                androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader$$ExternalSyntheticLambda1 r6 = new androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader$$ExternalSyntheticLambda1     // Catch: java.lang.Throwable -> L31
                r6.<init>(r5)     // Catch: java.lang.Throwable -> L31
                r5.mMainHandlerLoadCallback = r6     // Catch: java.lang.Throwable -> L31
            L2a:
                java.lang.Runnable r6 = r5.mMainHandlerLoadCallback     // Catch: java.lang.Throwable -> L31
                r1.postDelayed(r6, r7)     // Catch: java.lang.Throwable -> L31
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
                return
            L31:
                r6 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
                throw r6
        }

        void createMetadata() {
                r8 = this;
                java.lang.String r0 = "fetchFonts result is not OK. ("
                java.lang.Object r1 = r8.mLock
                monitor-enter(r1)
                androidx.emoji2.text.EmojiCompat$MetadataRepoLoaderCallback r2 = r8.mCallback     // Catch: java.lang.Throwable -> La6
                if (r2 != 0) goto Lb
                monitor-exit(r1)     // Catch: java.lang.Throwable -> La6
                return
            Lb:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> La6
                androidx.core.provider.FontsContractCompat$FontInfo r1 = r8.retrieveFontInfo()     // Catch: java.lang.Throwable -> L93
                int r2 = r1.getResultCode()     // Catch: java.lang.Throwable -> L93
                r3 = 2
                if (r2 != r3) goto L36
                java.lang.Object r3 = r8.mLock     // Catch: java.lang.Throwable -> L93
                monitor-enter(r3)     // Catch: java.lang.Throwable -> L93
                androidx.emoji2.text.FontRequestEmojiCompatConfig$RetryPolicy r4 = r8.mRetryPolicy     // Catch: java.lang.Throwable -> L33
                if (r4 == 0) goto L31
                long r4 = r4.getRetryDelay()     // Catch: java.lang.Throwable -> L33
                r6 = 0
                int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r6 < 0) goto L31
                android.net.Uri r0 = r1.getUri()     // Catch: java.lang.Throwable -> L33
                r8.scheduleRetry(r0, r4)     // Catch: java.lang.Throwable -> L33
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L33
                return
            L31:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L33
                goto L36
            L33:
                r0 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L33
                throw r0     // Catch: java.lang.Throwable -> L93
            L36:
                if (r2 != 0) goto L7a
                java.lang.String r0 = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"
                androidx.core.os.TraceCompat.beginSection(r0)     // Catch: java.lang.Throwable -> L75
                androidx.emoji2.text.FontRequestEmojiCompatConfig$FontProviderHelper r0 = r8.mFontProviderHelper     // Catch: java.lang.Throwable -> L75
                android.content.Context r2 = r8.mContext     // Catch: java.lang.Throwable -> L75
                android.graphics.Typeface r0 = r0.buildTypeface(r2, r1)     // Catch: java.lang.Throwable -> L75
                android.content.Context r2 = r8.mContext     // Catch: java.lang.Throwable -> L75
                android.net.Uri r1 = r1.getUri()     // Catch: java.lang.Throwable -> L75
                r3 = 0
                java.nio.ByteBuffer r1 = androidx.core.graphics.TypefaceCompatUtil.mmap(r2, r3, r1)     // Catch: java.lang.Throwable -> L75
                if (r1 == 0) goto L6d
                if (r0 == 0) goto L6d
                androidx.emoji2.text.MetadataRepo r0 = androidx.emoji2.text.MetadataRepo.create(r0, r1)     // Catch: java.lang.Throwable -> L75
                androidx.core.os.TraceCompat.endSection()     // Catch: java.lang.Throwable -> L93
                java.lang.Object r1 = r8.mLock     // Catch: java.lang.Throwable -> L93
                monitor-enter(r1)     // Catch: java.lang.Throwable -> L93
                androidx.emoji2.text.EmojiCompat$MetadataRepoLoaderCallback r2 = r8.mCallback     // Catch: java.lang.Throwable -> L6a
                if (r2 == 0) goto L65
                r2.onLoaded(r0)     // Catch: java.lang.Throwable -> L6a
            L65:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L6a
                r8.cleanUp()     // Catch: java.lang.Throwable -> L93
                goto La2
            L6a:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L6a
                throw r0     // Catch: java.lang.Throwable -> L93
            L6d:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L75
                java.lang.String r1 = "Unable to open file."
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L75
                throw r0     // Catch: java.lang.Throwable -> L75
            L75:
                r0 = move-exception
                androidx.core.os.TraceCompat.endSection()     // Catch: java.lang.Throwable -> L93
                throw r0     // Catch: java.lang.Throwable -> L93
            L7a:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L93
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L93
                r3.<init>(r0)     // Catch: java.lang.Throwable -> L93
                java.lang.StringBuilder r0 = r3.append(r2)     // Catch: java.lang.Throwable -> L93
                java.lang.String r2 = ")"
                java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Throwable -> L93
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L93
                r1.<init>(r0)     // Catch: java.lang.Throwable -> L93
                throw r1     // Catch: java.lang.Throwable -> L93
            L93:
                r0 = move-exception
                java.lang.Object r2 = r8.mLock
                monitor-enter(r2)
                androidx.emoji2.text.EmojiCompat$MetadataRepoLoaderCallback r1 = r8.mCallback     // Catch: java.lang.Throwable -> La3
                if (r1 == 0) goto L9e
                r1.onFailed(r0)     // Catch: java.lang.Throwable -> La3
            L9e:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> La3
                r8.cleanUp()
            La2:
                return
            La3:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> La3
                throw r0
            La6:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> La6
                throw r0
        }

        @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoader
        public void load(androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback r2) {
                r1 = this;
                java.lang.String r0 = "LoaderCallback cannot be null"
                androidx.core.util.Preconditions.checkNotNull(r2, r0)
                java.lang.Object r0 = r1.mLock
                monitor-enter(r0)
                r1.mCallback = r2     // Catch: java.lang.Throwable -> Lf
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
                r1.loadInternal()
                return
            Lf:
                r2 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
                throw r2
        }

        void loadInternal() {
                r3 = this;
                java.lang.Object r0 = r3.mLock
                monitor-enter(r0)
                androidx.emoji2.text.EmojiCompat$MetadataRepoLoaderCallback r1 = r3.mCallback     // Catch: java.lang.Throwable -> L23
                if (r1 != 0) goto L9
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
                return
            L9:
                java.util.concurrent.Executor r1 = r3.mExecutor     // Catch: java.lang.Throwable -> L23
                if (r1 != 0) goto L17
                java.lang.String r1 = "emojiCompat"
                java.util.concurrent.ThreadPoolExecutor r1 = androidx.emoji2.text.ConcurrencyHelpers.createBackgroundPriorityExecutor(r1)     // Catch: java.lang.Throwable -> L23
                r3.mMyThreadPoolExecutor = r1     // Catch: java.lang.Throwable -> L23
                r3.mExecutor = r1     // Catch: java.lang.Throwable -> L23
            L17:
                java.util.concurrent.Executor r1 = r3.mExecutor     // Catch: java.lang.Throwable -> L23
                androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader$$ExternalSyntheticLambda0 r2 = new androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L23
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L23
                r1.execute(r2)     // Catch: java.lang.Throwable -> L23
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
                return
            L23:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
                throw r1
        }

        public void setExecutor(java.util.concurrent.Executor r2) {
                r1 = this;
                java.lang.Object r0 = r1.mLock
                monitor-enter(r0)
                r1.mExecutor = r2     // Catch: java.lang.Throwable -> L7
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r2 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                throw r2
        }

        public void setRetryPolicy(androidx.emoji2.text.FontRequestEmojiCompatConfig.RetryPolicy r2) {
                r1 = this;
                java.lang.Object r0 = r1.mLock
                monitor-enter(r0)
                r1.mRetryPolicy = r2     // Catch: java.lang.Throwable -> L7
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r2 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                throw r2
        }
    }

    public static abstract class RetryPolicy {
        public RetryPolicy() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract long getRetryDelay();
    }

    static {
            androidx.emoji2.text.FontRequestEmojiCompatConfig$FontProviderHelper r0 = new androidx.emoji2.text.FontRequestEmojiCompatConfig$FontProviderHelper
            r0.<init>()
            androidx.emoji2.text.FontRequestEmojiCompatConfig.DEFAULT_FONTS_CONTRACT = r0
            return
    }

    public FontRequestEmojiCompatConfig(android.content.Context r3, androidx.core.provider.FontRequest r4) {
            r2 = this;
            androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader r0 = new androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader
            androidx.emoji2.text.FontRequestEmojiCompatConfig$FontProviderHelper r1 = androidx.emoji2.text.FontRequestEmojiCompatConfig.DEFAULT_FONTS_CONTRACT
            r0.<init>(r3, r4, r1)
            r2.<init>(r0)
            return
    }

    public FontRequestEmojiCompatConfig(android.content.Context r2, androidx.core.provider.FontRequest r3, androidx.emoji2.text.FontRequestEmojiCompatConfig.FontProviderHelper r4) {
            r1 = this;
            androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader r0 = new androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader
            r0.<init>(r2, r3, r4)
            r1.<init>(r0)
            return
    }

    @java.lang.Deprecated
    public androidx.emoji2.text.FontRequestEmojiCompatConfig setHandler(android.os.Handler r1) {
            r0 = this;
            if (r1 != 0) goto L3
            return r0
        L3:
            java.util.concurrent.Executor r1 = androidx.emoji2.text.ConcurrencyHelpers.convertHandlerToExecutor(r1)
            r0.setLoadingExecutor(r1)
            return r0
    }

    public androidx.emoji2.text.FontRequestEmojiCompatConfig setLoadingExecutor(java.util.concurrent.Executor r2) {
            r1 = this;
            androidx.emoji2.text.EmojiCompat$MetadataRepoLoader r0 = r1.getMetadataRepoLoader()
            androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader r0 = (androidx.emoji2.text.FontRequestEmojiCompatConfig.FontRequestMetadataLoader) r0
            r0.setExecutor(r2)
            return r1
    }

    public androidx.emoji2.text.FontRequestEmojiCompatConfig setRetryPolicy(androidx.emoji2.text.FontRequestEmojiCompatConfig.RetryPolicy r2) {
            r1 = this;
            androidx.emoji2.text.EmojiCompat$MetadataRepoLoader r0 = r1.getMetadataRepoLoader()
            androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader r0 = (androidx.emoji2.text.FontRequestEmojiCompatConfig.FontRequestMetadataLoader) r0
            r0.setRetryPolicy(r2)
            return r1
    }
}
