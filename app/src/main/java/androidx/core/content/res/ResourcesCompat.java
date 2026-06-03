package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
public final class ResourcesCompat {
    public static final int ID_NULL = 0;
    private static final java.lang.String TAG = "ResourcesCompat";
    private static final java.lang.Object sColorStateCacheLock = null;
    private static final java.util.WeakHashMap<androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey, android.util.SparseArray<androidx.core.content.res.ResourcesCompat.ColorStateListCacheEntry>> sColorStateCaches = null;
    private static final java.lang.ThreadLocal<android.util.TypedValue> sTempTypedValue = null;

    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.graphics.drawable.Drawable getDrawable(android.content.res.Resources r0, int r1, android.content.res.Resources.Theme r2) {
                android.graphics.drawable.Drawable r0 = r0.getDrawable(r1, r2)
                return r0
        }

        static android.graphics.drawable.Drawable getDrawableForDensity(android.content.res.Resources r0, int r1, int r2, android.content.res.Resources.Theme r3) {
                android.graphics.drawable.Drawable r0 = r0.getDrawableForDensity(r1, r2, r3)
                return r0
        }
    }

    static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getColor(android.content.res.Resources r0, int r1, android.content.res.Resources.Theme r2) {
                int r0 = r0.getColor(r1, r2)
                return r0
        }

        static android.content.res.ColorStateList getColorStateList(android.content.res.Resources r0, int r1, android.content.res.Resources.Theme r2) {
                android.content.res.ColorStateList r0 = r0.getColorStateList(r1, r2)
                return r0
        }
    }

    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static float getFloat(android.content.res.Resources r0, int r1) {
                float r0 = r0.getFloat(r1)
                return r0
        }
    }

    private static class ColorStateListCacheEntry {
        final android.content.res.Configuration mConfiguration;
        final int mThemeHash;
        final android.content.res.ColorStateList mValue;

        ColorStateListCacheEntry(android.content.res.ColorStateList r1, android.content.res.Configuration r2, android.content.res.Resources.Theme r3) {
                r0 = this;
                r0.<init>()
                r0.mValue = r1
                r0.mConfiguration = r2
                if (r3 != 0) goto Lb
                r1 = 0
                goto Lf
            Lb:
                int r1 = r3.hashCode()
            Lf:
                r0.mThemeHash = r1
                return
        }
    }

    private static final class ColorStateListCacheKey {
        final android.content.res.Resources mResources;
        final android.content.res.Resources.Theme mTheme;

        ColorStateListCacheKey(android.content.res.Resources r1, android.content.res.Resources.Theme r2) {
                r0 = this;
                r0.<init>()
                r0.mResources = r1
                r0.mTheme = r2
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L2b
                java.lang.Class r2 = r4.getClass()
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L12
                goto L2b
            L12:
                androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey r5 = (androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey) r5
                android.content.res.Resources r2 = r4.mResources
                android.content.res.Resources r3 = r5.mResources
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L29
                android.content.res.Resources$Theme r2 = r4.mTheme
                android.content.res.Resources$Theme r5 = r5.mTheme
                boolean r5 = androidx.core.util.ObjectsCompat.equals(r2, r5)
                if (r5 == 0) goto L29
                goto L2a
            L29:
                r0 = r1
            L2a:
                return r0
            L2b:
                return r1
        }

        public int hashCode() {
                r2 = this;
                android.content.res.Resources r0 = r2.mResources
                android.content.res.Resources$Theme r1 = r2.mTheme
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
                int r0 = androidx.core.util.ObjectsCompat.hash(r0)
                return r0
        }
    }

    public static abstract class FontCallback {
        public FontCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public static android.os.Handler getHandler(android.os.Handler r1) {
                if (r1 != 0) goto Lb
                android.os.Handler r1 = new android.os.Handler
                android.os.Looper r0 = android.os.Looper.getMainLooper()
                r1.<init>(r0)
            Lb:
                return r1
        }

        public final void callbackFailAsync(int r2, android.os.Handler r3) {
                r1 = this;
                android.os.Handler r3 = getHandler(r3)
                androidx.core.content.res.ResourcesCompat$FontCallback$$ExternalSyntheticLambda1 r0 = new androidx.core.content.res.ResourcesCompat$FontCallback$$ExternalSyntheticLambda1
                r0.<init>(r1, r2)
                r3.post(r0)
                return
        }

        public final void callbackSuccessAsync(android.graphics.Typeface r2, android.os.Handler r3) {
                r1 = this;
                android.os.Handler r3 = getHandler(r3)
                androidx.core.content.res.ResourcesCompat$FontCallback$$ExternalSyntheticLambda0 r0 = new androidx.core.content.res.ResourcesCompat$FontCallback$$ExternalSyntheticLambda0
                r0.<init>(r1, r2)
                r3.post(r0)
                return
        }

        /* JADX INFO: renamed from: lambda$callbackFailAsync$1$androidx-core-content-res-ResourcesCompat$FontCallback, reason: not valid java name */
        /* synthetic */ void m24xb24343b7(int r1) {
                r0 = this;
                r0.onFontRetrievalFailed(r1)
                return
        }

        /* JADX INFO: renamed from: lambda$callbackSuccessAsync$0$androidx-core-content-res-ResourcesCompat$FontCallback, reason: not valid java name */
        /* synthetic */ void m25x46c88379(android.graphics.Typeface r1) {
                r0 = this;
                r0.onFontRetrieved(r1)
                return
        }

        public abstract void onFontRetrievalFailed(int r1);

        public abstract void onFontRetrieved(android.graphics.Typeface r1);
    }

    public static final class ThemeCompat {

        static class Api23Impl {
            private static java.lang.reflect.Method sRebaseMethod;
            private static boolean sRebaseMethodFetched;
            private static final java.lang.Object sRebaseMethodLock = null;

            static {
                    java.lang.Object r0 = new java.lang.Object
                    r0.<init>()
                    androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.sRebaseMethodLock = r0
                    return
            }

            private Api23Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static void rebase(android.content.res.Resources.Theme r6) {
                    java.lang.Object r0 = androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.sRebaseMethodLock
                    monitor-enter(r0)
                    boolean r1 = androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.sRebaseMethodFetched     // Catch: java.lang.Throwable -> L3c
                    r2 = 0
                    if (r1 != 0) goto L23
                    r1 = 1
                    java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
                    java.lang.String r4 = "rebase"
                    java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.sRebaseMethod = r3     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    r3.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    goto L21
                L19:
                    r3 = move-exception
                    java.lang.String r4 = "ResourcesCompat"
                    java.lang.String r5 = "Failed to retrieve rebase() method"
                    android.util.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L3c
                L21:
                    androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.sRebaseMethodFetched = r1     // Catch: java.lang.Throwable -> L3c
                L23:
                    java.lang.reflect.Method r1 = androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.sRebaseMethod     // Catch: java.lang.Throwable -> L3c
                    if (r1 == 0) goto L3a
                    java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L2f java.lang.Throwable -> L3c
                    r1.invoke(r6, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L2f java.lang.Throwable -> L3c
                    goto L3a
                L2d:
                    r6 = move-exception
                    goto L30
                L2f:
                    r6 = move-exception
                L30:
                    java.lang.String r1 = "ResourcesCompat"
                    java.lang.String r2 = "Failed to invoke rebase() method via reflection"
                    android.util.Log.i(r1, r2, r6)     // Catch: java.lang.Throwable -> L3c
                    r6 = 0
                    androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.sRebaseMethod = r6     // Catch: java.lang.Throwable -> L3c
                L3a:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
                    return
                L3c:
                    r6 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
                    throw r6
            }
        }

        static class Api29Impl {
            private Api29Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static void rebase(android.content.res.Resources.Theme r0) {
                    r0.rebase()
                    return
            }
        }

        private ThemeCompat() {
                r0 = this;
                r0.<init>()
                return
        }

        public static void rebase(android.content.res.Resources.Theme r2) {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto La
                androidx.core.content.res.ResourcesCompat.ThemeCompat.Api29Impl.rebase(r2)
                goto Ld
            La:
                androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.rebase(r2)
            Ld:
                return
        }
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.core.content.res.ResourcesCompat.sTempTypedValue = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r1 = 0
            r0.<init>(r1)
            androidx.core.content.res.ResourcesCompat.sColorStateCaches = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.content.res.ResourcesCompat.sColorStateCacheLock = r0
            return
    }

    private ResourcesCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void addColorStateListToCache(androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey r3, int r4, android.content.res.ColorStateList r5, android.content.res.Resources.Theme r6) {
            java.lang.Object r0 = androidx.core.content.res.ResourcesCompat.sColorStateCacheLock
            monitor-enter(r0)
            java.util.WeakHashMap<androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey, android.util.SparseArray<androidx.core.content.res.ResourcesCompat$ColorStateListCacheEntry>> r1 = androidx.core.content.res.ResourcesCompat.sColorStateCaches     // Catch: java.lang.Throwable -> L25
            java.lang.Object r2 = r1.get(r3)     // Catch: java.lang.Throwable -> L25
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch: java.lang.Throwable -> L25
            if (r2 != 0) goto L15
            android.util.SparseArray r2 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L25
            r2.<init>()     // Catch: java.lang.Throwable -> L25
            r1.put(r3, r2)     // Catch: java.lang.Throwable -> L25
        L15:
            androidx.core.content.res.ResourcesCompat$ColorStateListCacheEntry r1 = new androidx.core.content.res.ResourcesCompat$ColorStateListCacheEntry     // Catch: java.lang.Throwable -> L25
            android.content.res.Resources r3 = r3.mResources     // Catch: java.lang.Throwable -> L25
            android.content.res.Configuration r3 = r3.getConfiguration()     // Catch: java.lang.Throwable -> L25
            r1.<init>(r5, r3, r6)     // Catch: java.lang.Throwable -> L25
            r2.append(r4, r1)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            return
        L25:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r3
    }

    public static void clearCachesForTheme(android.content.res.Resources.Theme r3) {
            java.lang.Object r0 = androidx.core.content.res.ResourcesCompat.sColorStateCacheLock
            monitor-enter(r0)
            java.util.WeakHashMap<androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey, android.util.SparseArray<androidx.core.content.res.ResourcesCompat$ColorStateListCacheEntry>> r1 = androidx.core.content.res.ResourcesCompat.sColorStateCaches     // Catch: java.lang.Throwable -> L29
            java.util.Set r1 = r1.keySet()     // Catch: java.lang.Throwable -> L29
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L29
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L29
            androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey r2 = (androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey) r2     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto Ld
            android.content.res.Resources$Theme r2 = r2.mTheme     // Catch: java.lang.Throwable -> L29
            boolean r2 = r3.equals(r2)     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto Ld
            r1.remove()     // Catch: java.lang.Throwable -> L29
            goto Ld
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            return
        L29:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r3
    }

    private static android.content.res.ColorStateList getCachedColorStateList(androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey r5, int r6) {
            java.lang.Object r0 = androidx.core.content.res.ResourcesCompat.sColorStateCacheLock
            monitor-enter(r0)
            java.util.WeakHashMap<androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey, android.util.SparseArray<androidx.core.content.res.ResourcesCompat$ColorStateListCacheEntry>> r1 = androidx.core.content.res.ResourcesCompat.sColorStateCaches     // Catch: java.lang.Throwable -> L49
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L49
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L49
            if (r1 == 0) goto L46
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L49
            if (r2 <= 0) goto L46
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L49
            androidx.core.content.res.ResourcesCompat$ColorStateListCacheEntry r2 = (androidx.core.content.res.ResourcesCompat.ColorStateListCacheEntry) r2     // Catch: java.lang.Throwable -> L49
            if (r2 == 0) goto L46
            android.content.res.Configuration r3 = r2.mConfiguration     // Catch: java.lang.Throwable -> L49
            android.content.res.Resources r4 = r5.mResources     // Catch: java.lang.Throwable -> L49
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> L49
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L49
            if (r3 == 0) goto L43
            android.content.res.Resources$Theme r3 = r5.mTheme     // Catch: java.lang.Throwable -> L49
            if (r3 != 0) goto L31
            int r3 = r2.mThemeHash     // Catch: java.lang.Throwable -> L49
            if (r3 == 0) goto L3f
        L31:
            android.content.res.Resources$Theme r3 = r5.mTheme     // Catch: java.lang.Throwable -> L49
            if (r3 == 0) goto L43
            int r3 = r2.mThemeHash     // Catch: java.lang.Throwable -> L49
            android.content.res.Resources$Theme r5 = r5.mTheme     // Catch: java.lang.Throwable -> L49
            int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L49
            if (r3 != r5) goto L43
        L3f:
            android.content.res.ColorStateList r5 = r2.mValue     // Catch: java.lang.Throwable -> L49
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            return r5
        L43:
            r1.remove(r6)     // Catch: java.lang.Throwable -> L49
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            r5 = 0
            return r5
        L49:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            throw r5
    }

    public static android.graphics.Typeface getCachedFont(android.content.Context r8, int r9) throws android.content.res.Resources.NotFoundException {
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto L8
            r8 = 0
            return r8
        L8:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r6 = 0
            r7 = 1
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r8
            r1 = r9
            android.graphics.Typeface r8 = loadFont(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static int getColor(android.content.res.Resources r0, int r1, android.content.res.Resources.Theme r2) throws android.content.res.Resources.NotFoundException {
            int r0 = androidx.core.content.res.ResourcesCompat.Api23Impl.getColor(r0, r1, r2)
            return r0
    }

    public static android.content.res.ColorStateList getColorStateList(android.content.res.Resources r2, int r3, android.content.res.Resources.Theme r4) throws android.content.res.Resources.NotFoundException {
            androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey r0 = new androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey
            r0.<init>(r2, r4)
            android.content.res.ColorStateList r1 = getCachedColorStateList(r0, r3)
            if (r1 == 0) goto Lc
            return r1
        Lc:
            android.content.res.ColorStateList r1 = inflateColorStateList(r2, r3, r4)
            if (r1 == 0) goto L16
            addColorStateListToCache(r0, r3, r1, r4)
            return r1
        L16:
            android.content.res.ColorStateList r2 = androidx.core.content.res.ResourcesCompat.Api23Impl.getColorStateList(r2, r3, r4)
            return r2
    }

    public static android.graphics.drawable.Drawable getDrawable(android.content.res.Resources r0, int r1, android.content.res.Resources.Theme r2) throws android.content.res.Resources.NotFoundException {
            android.graphics.drawable.Drawable r0 = androidx.core.content.res.ResourcesCompat.Api21Impl.getDrawable(r0, r1, r2)
            return r0
    }

    public static android.graphics.drawable.Drawable getDrawableForDensity(android.content.res.Resources r0, int r1, int r2, android.content.res.Resources.Theme r3) throws android.content.res.Resources.NotFoundException {
            android.graphics.drawable.Drawable r0 = androidx.core.content.res.ResourcesCompat.Api21Impl.getDrawableForDensity(r0, r1, r2, r3)
            return r0
    }

    public static float getFloat(android.content.res.Resources r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            float r3 = androidx.core.content.res.ResourcesCompat.Api29Impl.getFloat(r3, r4)
            return r3
        Lb:
            android.util.TypedValue r0 = getTypedValue()
            r1 = 1
            r3.getValue(r4, r0, r1)
            int r3 = r0.type
            r1 = 4
            if (r3 != r1) goto L1d
            float r3 = r0.getFloat()
            return r3
        L1d:
            android.content.res.Resources$NotFoundException r3 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Resource ID #0x"
            r1.<init>(r2)
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " type #0x"
            java.lang.StringBuilder r4 = r4.append(r1)
            int r0 = r0.type
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r0 = " is not valid"
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    public static android.graphics.Typeface getFont(android.content.Context r8, int r9) throws android.content.res.Resources.NotFoundException {
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto L8
            r8 = 0
            return r8
        L8:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r6 = 0
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r8
            r1 = r9
            android.graphics.Typeface r8 = loadFont(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static android.graphics.Typeface getFont(android.content.Context r8, int r9, android.util.TypedValue r10, int r11, androidx.core.content.res.ResourcesCompat.FontCallback r12) throws android.content.res.Resources.NotFoundException {
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto L8
            r8 = 0
            return r8
        L8:
            r6 = 1
            r7 = 0
            r5 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            android.graphics.Typeface r8 = loadFont(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static void getFont(android.content.Context r8, int r9, androidx.core.content.res.ResourcesCompat.FontCallback r10, android.os.Handler r11) throws android.content.res.Resources.NotFoundException {
            androidx.core.util.Preconditions.checkNotNull(r10)
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto Le
            r8 = -4
            r10.callbackFailAsync(r8, r11)
            return
        Le:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r6 = 0
            r7 = 0
            r3 = 0
            r0 = r8
            r1 = r9
            r4 = r10
            r5 = r11
            loadFont(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    private static android.util.TypedValue getTypedValue() {
            java.lang.ThreadLocal<android.util.TypedValue> r0 = androidx.core.content.res.ResourcesCompat.sTempTypedValue
            java.lang.Object r1 = r0.get()
            android.util.TypedValue r1 = (android.util.TypedValue) r1
            if (r1 != 0) goto L12
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            r0.set(r1)
        L12:
            return r1
    }

    private static android.content.res.ColorStateList inflateColorStateList(android.content.res.Resources r2, int r3, android.content.res.Resources.Theme r4) {
            boolean r0 = isColorInt(r2, r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            android.content.res.XmlResourceParser r3 = r2.getXml(r3)
            android.content.res.ColorStateList r2 = androidx.core.content.res.ColorStateListInflaterCompat.createFromXml(r2, r3, r4)     // Catch: java.lang.Exception -> L11
            return r2
        L11:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r4 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r4, r2)
            return r1
    }

    private static boolean isColorInt(android.content.res.Resources r2, int r3) {
            android.util.TypedValue r0 = getTypedValue()
            r1 = 1
            r2.getValue(r3, r0, r1)
            int r2 = r0.type
            r3 = 28
            if (r2 < r3) goto L15
            int r2 = r0.type
            r3 = 31
            if (r2 > r3) goto L15
            goto L16
        L15:
            r1 = 0
        L16:
            return r1
    }

    private static android.graphics.Typeface loadFont(android.content.Context r10, int r11, android.util.TypedValue r12, int r13, androidx.core.content.res.ResourcesCompat.FontCallback r14, android.os.Handler r15, boolean r16, boolean r17) {
            android.content.res.Resources r1 = r10.getResources()
            r0 = 1
            r9 = r11
            r2 = r12
            r1.getValue(r11, r12, r0)
            r0 = r10
            r3 = r11
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            android.graphics.Typeface r0 = loadFont(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 != 0) goto L3d
            if (r14 != 0) goto L3d
            if (r17 == 0) goto L1e
            goto L3d
        L1e:
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Font resource ID #0x"
            r1.<init>(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r11)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " could not be retrieved."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L3d:
            return r0
    }

    private static android.graphics.Typeface loadFont(android.content.Context r17, android.content.res.Resources r18, android.util.TypedValue r19, int r20, int r21, androidx.core.content.res.ResourcesCompat.FontCallback r22, android.os.Handler r23, boolean r24, boolean r25) {
            r0 = r18
            r1 = r19
            r4 = r20
            r11 = r22
            r12 = r23
            java.lang.String r13 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto Lb9
            java.lang.CharSequence r2 = r1.string
            java.lang.String r14 = r2.toString()
            java.lang.String r2 = "res/"
            boolean r2 = r14.startsWith(r2)
            r15 = -3
            r16 = 0
            if (r2 != 0) goto L27
            if (r11 == 0) goto L26
            r11.callbackFailAsync(r15, r12)
        L26:
            return r16
        L27:
            int r2 = r1.assetCookie
            r7 = r21
            android.graphics.Typeface r2 = androidx.core.graphics.TypefaceCompat.findFromCache(r0, r4, r14, r2, r7)
            if (r2 == 0) goto L37
            if (r11 == 0) goto L36
            r11.callbackSuccessAsync(r2, r12)
        L36:
            return r2
        L37:
            if (r25 == 0) goto L3a
            return r16
        L3a:
            java.lang.String r2 = r14.toLowerCase()     // Catch: java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> La0
            java.lang.String r3 = ".xml"
            boolean r2 = r2.endsWith(r3)     // Catch: java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> La0
            if (r2 == 0) goto L71
            android.content.res.XmlResourceParser r2 = r0.getXml(r4)     // Catch: java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> La0
            androidx.core.content.res.FontResourcesParserCompat$FamilyResourceEntry r2 = androidx.core.content.res.FontResourcesParserCompat.parse(r2, r0)     // Catch: java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> La0
            if (r2 != 0) goto L5b
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r13, r0)     // Catch: java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> La0
            if (r11 == 0) goto L5a
            r11.callbackFailAsync(r15, r12)     // Catch: java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> La0
        L5a:
            return r16
        L5b:
            int r6 = r1.assetCookie     // Catch: java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> La0
            r1 = r17
            r3 = r18
            r4 = r20
            r5 = r14
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            android.graphics.Typeface r0 = androidx.core.graphics.TypefaceCompat.createFromResourcesFamilyXml(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> La0
            return r0
        L71:
            int r5 = r1.assetCookie     // Catch: java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> La0
            r1 = r17
            r2 = r18
            r3 = r20
            r4 = r14
            r6 = r21
            android.graphics.Typeface r0 = androidx.core.graphics.TypefaceCompat.createFromResourcesFontFile(r1, r2, r3, r4, r5, r6)     // Catch: java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> La0
            if (r11 == 0) goto L8b
            if (r0 == 0) goto L88
            r11.callbackSuccessAsync(r0, r12)     // Catch: java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> La0
            goto L8b
        L88:
            r11.callbackFailAsync(r15, r12)     // Catch: java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> La0
        L8b:
            return r0
        L8c:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to read xml resource "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
            goto Lb3
        La0:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to parse xml resource "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
        Lb3:
            if (r11 == 0) goto Lb8
            r11.callbackFailAsync(r15, r12)
        Lb8:
            return r16
        Lb9:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Resource \""
            r3.<init>(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = "\" ("
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r20)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r3 = ") is not a Font: "
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
    }
}
