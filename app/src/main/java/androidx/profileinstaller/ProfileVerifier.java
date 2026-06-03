package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
public final class ProfileVerifier {
    private static final java.lang.String CUR_PROFILES_BASE_DIR = "/data/misc/profiles/cur/0/";
    private static final java.lang.String PROFILE_FILE_NAME = "primary.prof";
    private static final java.lang.String PROFILE_INSTALLED_CACHE_FILE_NAME = "profileInstalled";
    private static final java.lang.String REF_PROFILES_BASE_DIR = "/data/misc/profiles/ref/";
    private static final java.lang.Object SYNC_OBJ = null;
    private static final java.lang.String TAG = "ProfileVerifier";
    private static androidx.profileinstaller.ProfileVerifier.CompilationStatus sCompilationStatus;
    private static final androidx.concurrent.futures.ResolvableFuture<androidx.profileinstaller.ProfileVerifier.CompilationStatus> sFuture = null;

    private static class Api33Impl {
        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.content.pm.PackageInfo getPackageInfo(android.content.pm.PackageManager r2, android.content.Context r3) throws android.content.pm.PackageManager.NameNotFoundException {
                java.lang.String r3 = r3.getPackageName()
                r0 = 0
                android.content.pm.PackageManager$PackageInfoFlags r0 = android.content.pm.PackageManager.PackageInfoFlags.of(r0)
                android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r0)
                return r2
        }
    }

    static class Cache {
        private static final int SCHEMA = 1;
        final long mInstalledCurrentProfileSize;
        final long mPackageLastUpdateTime;
        final int mResultCode;
        final int mSchema;

        Cache(int r1, int r2, long r3, long r5) {
                r0 = this;
                r0.<init>()
                r0.mSchema = r1
                r0.mResultCode = r2
                r0.mPackageLastUpdateTime = r3
                r0.mInstalledCurrentProfileSize = r5
                return
        }

        static androidx.profileinstaller.ProfileVerifier.Cache readFromFile(java.io.File r9) throws java.io.IOException {
                java.io.DataInputStream r0 = new java.io.DataInputStream
                java.io.FileInputStream r1 = new java.io.FileInputStream
                r1.<init>(r9)
                r0.<init>(r1)
                androidx.profileinstaller.ProfileVerifier$Cache r9 = new androidx.profileinstaller.ProfileVerifier$Cache     // Catch: java.lang.Throwable -> L24
                int r3 = r0.readInt()     // Catch: java.lang.Throwable -> L24
                int r4 = r0.readInt()     // Catch: java.lang.Throwable -> L24
                long r5 = r0.readLong()     // Catch: java.lang.Throwable -> L24
                long r7 = r0.readLong()     // Catch: java.lang.Throwable -> L24
                r2 = r9
                r2.<init>(r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L24
                r0.close()
                return r9
            L24:
                r9 = move-exception
                r0.close()     // Catch: java.lang.Throwable -> L29
                goto L2d
            L29:
                r0 = move-exception
                r9.addSuppressed(r0)
            L2d:
                throw r9
        }

        public boolean equals(java.lang.Object r7) {
                r6 = this;
                r0 = 1
                if (r6 != r7) goto L4
                return r0
            L4:
                r1 = 0
                if (r7 == 0) goto L2d
                boolean r2 = r7 instanceof androidx.profileinstaller.ProfileVerifier.Cache
                if (r2 != 0) goto Lc
                goto L2d
            Lc:
                androidx.profileinstaller.ProfileVerifier$Cache r7 = (androidx.profileinstaller.ProfileVerifier.Cache) r7
                int r2 = r6.mResultCode
                int r3 = r7.mResultCode
                if (r2 != r3) goto L2b
                long r2 = r6.mPackageLastUpdateTime
                long r4 = r7.mPackageLastUpdateTime
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 != 0) goto L2b
                int r2 = r6.mSchema
                int r3 = r7.mSchema
                if (r2 != r3) goto L2b
                long r2 = r6.mInstalledCurrentProfileSize
                long r4 = r7.mInstalledCurrentProfileSize
                int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r7 != 0) goto L2b
                goto L2c
            L2b:
                r0 = r1
            L2c:
                return r0
            L2d:
                return r1
        }

        public int hashCode() {
                r5 = this;
                int r0 = r5.mResultCode
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                long r1 = r5.mPackageLastUpdateTime
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                int r2 = r5.mSchema
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                long r3 = r5.mInstalledCurrentProfileSize
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2, r3}
                int r0 = java.util.Objects.hash(r0)
                return r0
        }

        void writeOnFile(java.io.File r4) throws java.io.IOException {
                r3 = this;
                r4.delete()
                java.io.DataOutputStream r0 = new java.io.DataOutputStream
                java.io.FileOutputStream r1 = new java.io.FileOutputStream
                r1.<init>(r4)
                r0.<init>(r1)
                int r4 = r3.mSchema     // Catch: java.lang.Throwable -> L25
                r0.writeInt(r4)     // Catch: java.lang.Throwable -> L25
                int r4 = r3.mResultCode     // Catch: java.lang.Throwable -> L25
                r0.writeInt(r4)     // Catch: java.lang.Throwable -> L25
                long r1 = r3.mPackageLastUpdateTime     // Catch: java.lang.Throwable -> L25
                r0.writeLong(r1)     // Catch: java.lang.Throwable -> L25
                long r1 = r3.mInstalledCurrentProfileSize     // Catch: java.lang.Throwable -> L25
                r0.writeLong(r1)     // Catch: java.lang.Throwable -> L25
                r0.close()
                return
            L25:
                r4 = move-exception
                r0.close()     // Catch: java.lang.Throwable -> L2a
                goto L2e
            L2a:
                r0 = move-exception
                r4.addSuppressed(r0)
            L2e:
                throw r4
        }
    }

    public static class CompilationStatus {
        public static final int RESULT_CODE_COMPILED_WITH_PROFILE = 1;
        public static final int RESULT_CODE_COMPILED_WITH_PROFILE_NON_MATCHING = 3;
        public static final int RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ = 131072;
        public static final int RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE = 196608;
        private static final int RESULT_CODE_ERROR_CODE_BIT_SHIFT = 16;
        public static final int RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST = 65536;
        public static final int RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION = 262144;
        public static final int RESULT_CODE_NO_PROFILE = 0;
        public static final int RESULT_CODE_PROFILE_ENQUEUED_FOR_COMPILATION = 2;
        private final boolean mHasCurrentProfile;
        private final boolean mHasReferenceProfile;
        final int mResultCode;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface ResultCode {
        }

        CompilationStatus(int r1, boolean r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.mResultCode = r1
                r0.mHasCurrentProfile = r3
                r0.mHasReferenceProfile = r2
                return
        }

        public int getProfileInstallResultCode() {
                r1 = this;
                int r0 = r1.mResultCode
                return r0
        }

        public boolean hasProfileEnqueuedForCompilation() {
                r1 = this;
                boolean r0 = r1.mHasCurrentProfile
                return r0
        }

        public boolean isCompiledWithProfile() {
                r1 = this;
                boolean r0 = r1.mHasReferenceProfile
                return r0
        }
    }

    static {
            androidx.concurrent.futures.ResolvableFuture r0 = androidx.concurrent.futures.ResolvableFuture.create()
            androidx.profileinstaller.ProfileVerifier.sFuture = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.profileinstaller.ProfileVerifier.SYNC_OBJ = r0
            r0 = 0
            androidx.profileinstaller.ProfileVerifier.sCompilationStatus = r0
            return
    }

    private ProfileVerifier() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.common.util.concurrent.ListenableFuture<androidx.profileinstaller.ProfileVerifier.CompilationStatus> getCompilationStatusAsync() {
            androidx.concurrent.futures.ResolvableFuture<androidx.profileinstaller.ProfileVerifier$CompilationStatus> r0 = androidx.profileinstaller.ProfileVerifier.sFuture
            return r0
    }

    private static long getPackageLastUpdateTime(android.content.Context r3) throws android.content.pm.PackageManager.NameNotFoundException {
            android.content.Context r0 = r3.getApplicationContext()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L15
            android.content.pm.PackageInfo r3 = androidx.profileinstaller.ProfileVerifier.Api33Impl.getPackageInfo(r0, r3)
            long r0 = r3.lastUpdateTime
            return r0
        L15:
            java.lang.String r3 = r3.getPackageName()
            r1 = 0
            android.content.pm.PackageInfo r3 = r0.getPackageInfo(r3, r1)
            long r0 = r3.lastUpdateTime
            return r0
    }

    private static androidx.profileinstaller.ProfileVerifier.CompilationStatus setCompilationStatus(int r1, boolean r2, boolean r3) {
            androidx.profileinstaller.ProfileVerifier$CompilationStatus r0 = new androidx.profileinstaller.ProfileVerifier$CompilationStatus
            r0.<init>(r1, r2, r3)
            androidx.profileinstaller.ProfileVerifier.sCompilationStatus = r0
            androidx.concurrent.futures.ResolvableFuture<androidx.profileinstaller.ProfileVerifier$CompilationStatus> r1 = androidx.profileinstaller.ProfileVerifier.sFuture
            r1.set(r0)
            androidx.profileinstaller.ProfileVerifier$CompilationStatus r1 = androidx.profileinstaller.ProfileVerifier.sCompilationStatus
            return r1
    }

    public static androidx.profileinstaller.ProfileVerifier.CompilationStatus writeProfileVerification(android.content.Context r1) {
            r0 = 0
            androidx.profileinstaller.ProfileVerifier$CompilationStatus r1 = writeProfileVerification(r1, r0)
            return r1
    }

    static androidx.profileinstaller.ProfileVerifier.CompilationStatus writeProfileVerification(android.content.Context r18, boolean r19) {
            if (r19 != 0) goto L7
            androidx.profileinstaller.ProfileVerifier$CompilationStatus r0 = androidx.profileinstaller.ProfileVerifier.sCompilationStatus
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.Object r1 = androidx.profileinstaller.ProfileVerifier.SYNC_OBJ
            monitor-enter(r1)
            if (r19 != 0) goto L12
            androidx.profileinstaller.ProfileVerifier$CompilationStatus r0 = androidx.profileinstaller.ProfileVerifier.sCompilationStatus     // Catch: java.lang.Throwable -> Le7
            if (r0 == 0) goto L12
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le7
            return r0
        L12:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Le7
            r2 = 28
            r3 = 0
            if (r0 < r2) goto Ldf
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Le7
            r2 = 30
            if (r0 != r2) goto L21
            goto Ldf
        L21:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> Le7
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> Le7
            java.lang.String r4 = "/data/misc/profiles/ref/"
            java.lang.String r5 = r18.getPackageName()     // Catch: java.lang.Throwable -> Le7
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> Le7
            java.lang.String r4 = "primary.prof"
            r0.<init>(r2, r4)     // Catch: java.lang.Throwable -> Le7
            long r4 = r0.length()     // Catch: java.lang.Throwable -> Le7
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> Le7
            r6 = 0
            r2 = 1
            if (r0 == 0) goto L46
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L46
            r0 = r2
            goto L47
        L46:
            r0 = r3
        L47:
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> Le7
            java.io.File r9 = new java.io.File     // Catch: java.lang.Throwable -> Le7
            java.lang.String r10 = "/data/misc/profiles/cur/0/"
            java.lang.String r11 = r18.getPackageName()     // Catch: java.lang.Throwable -> Le7
            r9.<init>(r10, r11)     // Catch: java.lang.Throwable -> Le7
            java.lang.String r10 = "primary.prof"
            r8.<init>(r9, r10)     // Catch: java.lang.Throwable -> Le7
            long r16 = r8.length()     // Catch: java.lang.Throwable -> Le7
            boolean r8 = r8.exists()     // Catch: java.lang.Throwable -> Le7
            if (r8 == 0) goto L69
            int r6 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r6 <= 0) goto L69
            r6 = r2
            goto L6a
        L69:
            r6 = r3
        L6a:
            long r14 = getPackageLastUpdateTime(r18)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ld7 java.lang.Throwable -> Le7
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> Le7
            java.io.File r8 = r18.getFilesDir()     // Catch: java.lang.Throwable -> Le7
            java.lang.String r9 = "profileInstalled"
            r7.<init>(r8, r9)     // Catch: java.lang.Throwable -> Le7
            boolean r8 = r7.exists()     // Catch: java.lang.Throwable -> Le7
            if (r8 == 0) goto L8c
            androidx.profileinstaller.ProfileVerifier$Cache r8 = androidx.profileinstaller.ProfileVerifier.Cache.readFromFile(r7)     // Catch: java.io.IOException -> L84 java.lang.Throwable -> Le7
            goto L8d
        L84:
            r2 = 131072(0x20000, float:1.83671E-40)
            androidx.profileinstaller.ProfileVerifier$CompilationStatus r0 = setCompilationStatus(r2, r0, r6)     // Catch: java.lang.Throwable -> Le7
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le7
            return r0
        L8c:
            r8 = 0
        L8d:
            r9 = 2
            if (r8 == 0) goto L9e
            long r10 = r8.mPackageLastUpdateTime     // Catch: java.lang.Throwable -> Le7
            int r10 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r10 != 0) goto L9e
            int r10 = r8.mResultCode     // Catch: java.lang.Throwable -> Le7
            if (r10 != r9) goto L9b
            goto L9e
        L9b:
            int r3 = r8.mResultCode     // Catch: java.lang.Throwable -> Le7
            goto La5
        L9e:
            if (r0 == 0) goto La2
            r3 = r2
            goto La5
        La2:
            if (r6 == 0) goto La5
            r3 = r9
        La5:
            if (r19 == 0) goto Lac
            if (r6 == 0) goto Lac
            if (r3 == r2) goto Lac
            r3 = r9
        Lac:
            if (r8 == 0) goto Lbb
            int r10 = r8.mResultCode     // Catch: java.lang.Throwable -> Le7
            if (r10 != r9) goto Lbb
            if (r3 != r2) goto Lbb
            long r9 = r8.mInstalledCurrentProfileSize     // Catch: java.lang.Throwable -> Le7
            int r2 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r2 >= 0) goto Lbb
            r3 = 3
        Lbb:
            androidx.profileinstaller.ProfileVerifier$Cache r2 = new androidx.profileinstaller.ProfileVerifier$Cache     // Catch: java.lang.Throwable -> Le7
            r12 = 1
            r11 = r2
            r13 = r3
            r11.<init>(r12, r13, r14, r16)     // Catch: java.lang.Throwable -> Le7
            if (r8 == 0) goto Lcb
            boolean r4 = r8.equals(r2)     // Catch: java.lang.Throwable -> Le7
            if (r4 != 0) goto Ld1
        Lcb:
            r2.writeOnFile(r7)     // Catch: java.io.IOException -> Lcf java.lang.Throwable -> Le7
            goto Ld1
        Lcf:
            r3 = 196608(0x30000, float:2.75506E-40)
        Ld1:
            androidx.profileinstaller.ProfileVerifier$CompilationStatus r0 = setCompilationStatus(r3, r0, r6)     // Catch: java.lang.Throwable -> Le7
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le7
            return r0
        Ld7:
            r2 = 65536(0x10000, float:9.1835E-41)
            androidx.profileinstaller.ProfileVerifier$CompilationStatus r0 = setCompilationStatus(r2, r0, r6)     // Catch: java.lang.Throwable -> Le7
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le7
            return r0
        Ldf:
            r0 = 262144(0x40000, float:3.67342E-40)
            androidx.profileinstaller.ProfileVerifier$CompilationStatus r0 = setCompilationStatus(r0, r3, r3)     // Catch: java.lang.Throwable -> Le7
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le7
            return r0
        Le7:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le7
            throw r0
    }
}
