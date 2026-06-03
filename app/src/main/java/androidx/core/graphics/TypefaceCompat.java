package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
public class TypefaceCompat {
    private static final androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> sTypefaceCache = null;
    private static final androidx.core.graphics.TypefaceCompatBaseImpl sTypefaceCompatImpl = null;

    public static class ResourcesCallbackAdapter extends androidx.core.provider.FontsContractCompat.FontRequestCallback {
        private androidx.core.content.res.ResourcesCompat.FontCallback mFontCallback;

        public ResourcesCallbackAdapter(androidx.core.content.res.ResourcesCompat.FontCallback r1) {
                r0 = this;
                r0.<init>()
                r0.mFontCallback = r1
                return
        }

        @Override // androidx.core.provider.FontsContractCompat.FontRequestCallback
        public void onTypefaceRequestFailed(int r2) {
                r1 = this;
                androidx.core.content.res.ResourcesCompat$FontCallback r0 = r1.mFontCallback
                if (r0 == 0) goto L7
                r0.onFontRetrievalFailed(r2)
            L7:
                return
        }

        @Override // androidx.core.provider.FontsContractCompat.FontRequestCallback
        public void onTypefaceRetrieved(android.graphics.Typeface r2) {
                r1 = this;
                androidx.core.content.res.ResourcesCompat$FontCallback r0 = r1.mFontCallback
                if (r0 == 0) goto L7
                r0.onFontRetrieved(r2)
            L7:
                return
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Le
            androidx.core.graphics.TypefaceCompatApi29Impl r0 = new androidx.core.graphics.TypefaceCompatApi29Impl
            r0.<init>()
            androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl = r0
            goto L23
        Le:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L1c
            androidx.core.graphics.TypefaceCompatApi28Impl r0 = new androidx.core.graphics.TypefaceCompatApi28Impl
            r0.<init>()
            androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl = r0
            goto L23
        L1c:
            androidx.core.graphics.TypefaceCompatApi26Impl r0 = new androidx.core.graphics.TypefaceCompatApi26Impl
            r0.<init>()
            androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl = r0
        L23:
            androidx.collection.LruCache r0 = new androidx.collection.LruCache
            r1 = 16
            r0.<init>(r1)
            androidx.core.graphics.TypefaceCompat.sTypefaceCache = r0
            return
    }

    private TypefaceCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void clearCache() {
            androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> r0 = androidx.core.graphics.TypefaceCompat.sTypefaceCache
            r0.evictAll()
            return
    }

    public static android.graphics.Typeface create(android.content.Context r0, android.graphics.Typeface r1, int r2) {
            if (r0 == 0) goto L7
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r1, r2)
            return r0
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Context cannot be null"
            r0.<init>(r1)
            throw r0
    }

    public static android.graphics.Typeface create(android.content.Context r3, android.graphics.Typeface r4, int r5, boolean r6) {
            if (r3 == 0) goto L15
            r0 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r1 = "weight"
            r2 = 1
            androidx.core.util.Preconditions.checkArgumentInRange(r5, r2, r0, r1)
            if (r4 != 0) goto Le
            android.graphics.Typeface r4 = android.graphics.Typeface.DEFAULT
        Le:
            androidx.core.graphics.TypefaceCompatBaseImpl r0 = androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl
            android.graphics.Typeface r3 = r0.createWeightStyle(r3, r4, r5, r6)
            return r3
        L15:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Context cannot be null"
            r3.<init>(r4)
            throw r3
    }

    public static android.graphics.Typeface createFromFontInfo(android.content.Context r1, android.os.CancellationSignal r2, androidx.core.provider.FontsContractCompat.FontInfo[] r3, int r4) {
            androidx.core.graphics.TypefaceCompatBaseImpl r0 = androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl
            android.graphics.Typeface r1 = r0.createFromFontInfo(r1, r2, r3, r4)
            return r1
    }

    @java.lang.Deprecated
    public static android.graphics.Typeface createFromResourcesFamilyXml(android.content.Context r10, androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry r11, android.content.res.Resources r12, int r13, int r14, androidx.core.content.res.ResourcesCompat.FontCallback r15, android.os.Handler r16, boolean r17) {
            r4 = 0
            r5 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            android.graphics.Typeface r0 = createFromResourcesFamilyXml(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
    }

    public static android.graphics.Typeface createFromResourcesFamilyXml(android.content.Context r13, androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry r14, android.content.res.Resources r15, int r16, java.lang.String r17, int r18, int r19, androidx.core.content.res.ResourcesCompat.FontCallback r20, android.os.Handler r21, boolean r22) {
            r0 = r14
            r1 = r20
            r2 = r21
            boolean r3 = r0 instanceof androidx.core.content.res.FontResourcesParserCompat.ProviderResourceEntry
            if (r3 == 0) goto L4c
            androidx.core.content.res.FontResourcesParserCompat$ProviderResourceEntry r0 = (androidx.core.content.res.FontResourcesParserCompat.ProviderResourceEntry) r0
            java.lang.String r3 = r0.getSystemFontFamilyName()
            android.graphics.Typeface r3 = getSystemFontFamily(r3)
            if (r3 == 0) goto L1b
            if (r1 == 0) goto L1a
            r1.callbackSuccessAsync(r3, r2)
        L1a:
            return r3
        L1b:
            r3 = 1
            r4 = 0
            if (r22 == 0) goto L26
            int r5 = r0.getFetchStrategy()
            if (r5 != 0) goto L2a
            goto L28
        L26:
            if (r1 != 0) goto L2a
        L28:
            r9 = r3
            goto L2b
        L2a:
            r9 = r4
        L2b:
            if (r22 == 0) goto L32
            int r3 = r0.getTimeout()
            goto L33
        L32:
            r3 = -1
        L33:
            r10 = r3
            android.os.Handler r11 = androidx.core.content.res.ResourcesCompat.FontCallback.getHandler(r21)
            androidx.core.graphics.TypefaceCompat$ResourcesCallbackAdapter r12 = new androidx.core.graphics.TypefaceCompat$ResourcesCallbackAdapter
            r12.<init>(r1)
            androidx.core.provider.FontRequest r7 = r0.getRequest()
            r6 = r13
            r8 = r19
            android.graphics.Typeface r0 = androidx.core.provider.FontsContractCompat.requestFont(r6, r7, r8, r9, r10, r11, r12)
            r5 = r15
            r6 = r19
            goto L64
        L4c:
            androidx.core.graphics.TypefaceCompatBaseImpl r3 = androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl
            androidx.core.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry r0 = (androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry) r0
            r4 = r13
            r5 = r15
            r6 = r19
            android.graphics.Typeface r0 = r3.createFromFontFamilyFilesResourceEntry(r13, r0, r15, r6)
            if (r1 == 0) goto L64
            if (r0 == 0) goto L60
            r1.callbackSuccessAsync(r0, r2)
            goto L64
        L60:
            r3 = -3
            r1.callbackFailAsync(r3, r2)
        L64:
            if (r0 == 0) goto L6f
            androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> r1 = androidx.core.graphics.TypefaceCompat.sTypefaceCache
            java.lang.String r2 = createResourceUid(r15, r16, r17, r18, r19)
            r1.put(r2, r0)
        L6f:
            return r0
    }

    @java.lang.Deprecated
    public static android.graphics.Typeface createFromResourcesFontFile(android.content.Context r6, android.content.res.Resources r7, int r8, java.lang.String r9, int r10) {
            r4 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            android.graphics.Typeface r6 = createFromResourcesFontFile(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static android.graphics.Typeface createFromResourcesFontFile(android.content.Context r6, android.content.res.Resources r7, int r8, java.lang.String r9, int r10, int r11) {
            androidx.core.graphics.TypefaceCompatBaseImpl r0 = androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r11
            android.graphics.Typeface r6 = r0.createFromResourcesFontFile(r1, r2, r3, r4, r5)
            if (r6 == 0) goto L16
            java.lang.String r7 = createResourceUid(r7, r8, r9, r10, r11)
            androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> r8 = androidx.core.graphics.TypefaceCompat.sTypefaceCache
            r8.put(r7, r6)
        L16:
            return r6
    }

    private static java.lang.String createResourceUid(android.content.res.Resources r1, int r2, java.lang.String r3, int r4, int r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r1.getResourcePackageName(r2)
            java.lang.StringBuilder r1 = r0.append(r1)
            r0 = 45
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r1 = r1.toString()
            return r1
    }

    @java.lang.Deprecated
    public static android.graphics.Typeface findFromCache(android.content.res.Resources r2, int r3, int r4) {
            r0 = 0
            r1 = 0
            android.graphics.Typeface r2 = findFromCache(r2, r3, r0, r1, r4)
            return r2
    }

    public static android.graphics.Typeface findFromCache(android.content.res.Resources r1, int r2, java.lang.String r3, int r4, int r5) {
            androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> r0 = androidx.core.graphics.TypefaceCompat.sTypefaceCache
            java.lang.String r1 = createResourceUid(r1, r2, r3, r4, r5)
            java.lang.Object r1 = r0.get(r1)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            return r1
    }

    private static android.graphics.Typeface getBestFontFromFamily(android.content.Context r2, android.graphics.Typeface r3, int r4) {
            androidx.core.graphics.TypefaceCompatBaseImpl r0 = androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl
            androidx.core.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry r3 = r0.getFontFamily(r3)
            if (r3 != 0) goto La
            r2 = 0
            return r2
        La:
            android.content.res.Resources r1 = r2.getResources()
            android.graphics.Typeface r2 = r0.createFromFontFamilyFilesResourceEntry(r2, r3, r1, r4)
            return r2
    }

    private static android.graphics.Typeface getSystemFontFamily(java.lang.String r3) {
            r0 = 0
            if (r3 == 0) goto L1e
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto La
            goto L1e
        La:
            r1 = 0
            android.graphics.Typeface r3 = android.graphics.Typeface.create(r3, r1)
            android.graphics.Typeface r2 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r2, r1)
            if (r3 == 0) goto L1e
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L1e
            r0 = r3
        L1e:
            return r0
    }
}
