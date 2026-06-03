package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstaller {
    public static final int DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST = 2;
    public static final int DIAGNOSTIC_CURRENT_PROFILE_EXISTS = 1;
    public static final int DIAGNOSTIC_PROFILE_IS_COMPRESSED = 5;
    public static final int DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST = 4;
    public static final int DIAGNOSTIC_REF_PROFILE_EXISTS = 3;
    private static final androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback EMPTY_DIAGNOSTICS = null;
    static final androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback LOG_DIAGNOSTICS = null;
    private static final java.lang.String PROFILE_BASE_DIR = "/data/misc/profiles/cur/0";
    private static final java.lang.String PROFILE_FILE = "primary.prof";
    private static final java.lang.String PROFILE_INSTALLER_SKIP_FILE_NAME = "profileinstaller_profileWrittenFor_lastUpdateTime.dat";
    private static final java.lang.String PROFILE_META_LOCATION = "dexopt/baseline.profm";
    private static final java.lang.String PROFILE_SOURCE_LOCATION = "dexopt/baseline.prof";
    public static final int RESULT_ALREADY_INSTALLED = 2;
    public static final int RESULT_BASELINE_PROFILE_NOT_FOUND = 6;
    public static final int RESULT_BENCHMARK_OPERATION_FAILURE = 15;
    public static final int RESULT_BENCHMARK_OPERATION_SUCCESS = 14;
    public static final int RESULT_BENCHMARK_OPERATION_UNKNOWN = 16;
    public static final int RESULT_DELETE_SKIP_FILE_SUCCESS = 11;
    public static final int RESULT_DESIRED_FORMAT_UNSUPPORTED = 5;
    public static final int RESULT_INSTALL_SKIP_FILE_SUCCESS = 10;
    public static final int RESULT_INSTALL_SUCCESS = 1;
    public static final int RESULT_IO_EXCEPTION = 7;
    public static final int RESULT_META_FILE_REQUIRED_BUT_NOT_FOUND = 9;
    public static final int RESULT_NOT_WRITABLE = 4;
    public static final int RESULT_PARSE_EXCEPTION = 8;
    public static final int RESULT_SAVE_PROFILE_SIGNALLED = 12;
    public static final int RESULT_SAVE_PROFILE_SKIPPED = 13;
    public static final int RESULT_UNSUPPORTED_ART_VERSION = 3;
    private static final java.lang.String TAG = "ProfileInstaller";



    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface DiagnosticCode {
    }

    public interface DiagnosticsCallback {
        void onDiagnosticReceived(int r1, java.lang.Object r2);

        void onResultReceived(int r1, java.lang.Object r2);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ResultCode {
    }

    static {
            androidx.profileinstaller.ProfileInstaller$1 r0 = new androidx.profileinstaller.ProfileInstaller$1
            r0.<init>()
            androidx.profileinstaller.ProfileInstaller.EMPTY_DIAGNOSTICS = r0
            androidx.profileinstaller.ProfileInstaller$2 r0 = new androidx.profileinstaller.ProfileInstaller$2
            r0.<init>()
            androidx.profileinstaller.ProfileInstaller.LOG_DIAGNOSTICS = r0
            return
    }

    private ProfileInstaller() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean deleteProfileWrittenFor(java.io.File r2) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r0.<init>(r2, r1)
            boolean r2 = r0.delete()
            return r2
    }

    static void deleteSkipFile(android.content.Context r1, java.util.concurrent.Executor r2, androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback r3) {
            java.io.File r1 = r1.getFilesDir()
            deleteProfileWrittenFor(r1)
            r1 = 11
            r0 = 0
            result(r2, r3, r1, r0)
            return
    }

    static void diagnostic(java.util.concurrent.Executor r1, androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback r2, int r3, java.lang.Object r4) {
            androidx.profileinstaller.ProfileInstaller$$ExternalSyntheticLambda1 r0 = new androidx.profileinstaller.ProfileInstaller$$ExternalSyntheticLambda1
            r0.<init>(r2, r3, r4)
            r1.execute(r0)
            return
    }

    static boolean hasAlreadyWrittenProfileForThisInstall(android.content.pm.PackageInfo r4, java.io.File r5, androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback r6) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r0.<init>(r5, r1)
            boolean r5 = r0.exists()
            r1 = 0
            if (r5 != 0) goto Lf
            return r1
        Lf:
            java.io.DataInputStream r5 = new java.io.DataInputStream     // Catch: java.io.IOException -> L39
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.IOException -> L39
            r2.<init>(r0)     // Catch: java.io.IOException -> L39
            r5.<init>(r2)     // Catch: java.io.IOException -> L39
            long r2 = r5.readLong()     // Catch: java.lang.Throwable -> L2f
            r5.close()     // Catch: java.io.IOException -> L39
            long r4 = r4.lastUpdateTime
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 != 0) goto L27
            r1 = 1
        L27:
            if (r1 == 0) goto L2e
            r4 = 2
            r5 = 0
            r6.onResultReceived(r4, r5)
        L2e:
            return r1
        L2f:
            r4 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> L34
            goto L38
        L34:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch: java.io.IOException -> L39
        L38:
            throw r4     // Catch: java.io.IOException -> L39
        L39:
            return r1
    }

    static /* synthetic */ void lambda$diagnostic$1(androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback r0, int r1, java.lang.Object r2) {
            r0.onDiagnosticReceived(r1, r2)
            return
    }

    static /* synthetic */ void lambda$result$0(androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback r0, int r1, java.lang.Object r2) {
            r0.onResultReceived(r1, r2)
            return
    }

    static void noteProfileWrittenFor(android.content.pm.PackageInfo r2, java.io.File r3) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r0.<init>(r3, r1)
            java.io.DataOutputStream r3 = new java.io.DataOutputStream     // Catch: java.io.IOException -> L24
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L24
            r1.<init>(r0)     // Catch: java.io.IOException -> L24
            r3.<init>(r1)     // Catch: java.io.IOException -> L24
            long r0 = r2.lastUpdateTime     // Catch: java.lang.Throwable -> L1a
            r3.writeLong(r0)     // Catch: java.lang.Throwable -> L1a
            r3.close()     // Catch: java.io.IOException -> L24
            goto L24
        L1a:
            r2 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L1f
            goto L23
        L1f:
            r3 = move-exception
            r2.addSuppressed(r3)     // Catch: java.io.IOException -> L24
        L23:
            throw r2     // Catch: java.io.IOException -> L24
        L24:
            return
    }

    static void result(java.util.concurrent.Executor r1, androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback r2, int r3, java.lang.Object r4) {
            androidx.profileinstaller.ProfileInstaller$$ExternalSyntheticLambda0 r0 = new androidx.profileinstaller.ProfileInstaller$$ExternalSyntheticLambda0
            r0.<init>(r2, r3, r4)
            r1.execute(r0)
            return
    }

    private static boolean transcodeAndWrite(android.content.res.AssetManager r8, java.lang.String r9, android.content.pm.PackageInfo r10, java.io.File r11, java.lang.String r12, java.util.concurrent.Executor r13, androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback r14) {
            java.io.File r7 = new java.io.File
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/data/misc/profiles/cur/0"
            r0.<init>(r1, r9)
            java.lang.String r9 = "primary.prof"
            r7.<init>(r0, r9)
            androidx.profileinstaller.DeviceProfileWriter r9 = new androidx.profileinstaller.DeviceProfileWriter
            java.lang.String r5 = "dexopt/baseline.prof"
            java.lang.String r6 = "dexopt/baseline.profm"
            r0 = r9
            r1 = r8
            r2 = r13
            r3 = r14
            r4 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            boolean r8 = r9.deviceAllowsProfileInstallerAotWrites()
            if (r8 != 0) goto L24
            r8 = 0
            return r8
        L24:
            androidx.profileinstaller.DeviceProfileWriter r8 = r9.read()
            androidx.profileinstaller.DeviceProfileWriter r8 = r8.transcodeIfNeeded()
            boolean r8 = r8.write()
            if (r8 == 0) goto L35
            noteProfileWrittenFor(r10, r11)
        L35:
            return r8
    }

    public static void writeProfile(android.content.Context r2) {
            androidx.profileinstaller.ProfileInstallReceiver$$ExternalSyntheticLambda0 r0 = new androidx.profileinstaller.ProfileInstallReceiver$$ExternalSyntheticLambda0
            r0.<init>()
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r1 = androidx.profileinstaller.ProfileInstaller.EMPTY_DIAGNOSTICS
            writeProfile(r2, r0, r1)
            return
    }

    public static void writeProfile(android.content.Context r1, java.util.concurrent.Executor r2, androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback r3) {
            r0 = 0
            writeProfile(r1, r2, r3, r0)
            return
    }

    static void writeProfile(android.content.Context r9, java.util.concurrent.Executor r10, androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback r11, boolean r12) {
            android.content.Context r0 = r9.getApplicationContext()
            java.lang.String r2 = r0.getPackageName()
            android.content.pm.ApplicationInfo r1 = r0.getApplicationInfo()
            android.content.res.AssetManager r0 = r0.getAssets()
            java.io.File r3 = new java.io.File
            java.lang.String r1 = r1.sourceDir
            r3.<init>(r1)
            java.lang.String r5 = r3.getName()
            android.content.pm.PackageManager r1 = r9.getPackageManager()
            r8 = 0
            android.content.pm.PackageInfo r3 = r1.getPackageInfo(r2, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            java.io.File r4 = r9.getFilesDir()
            java.lang.String r1 = "ProfileInstaller"
            if (r12 != 0) goto L4d
            boolean r6 = hasAlreadyWrittenProfileForThisInstall(r3, r4, r11)
            if (r6 != 0) goto L33
            goto L4d
        L33:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Skipping profile installation for "
            r10.<init>(r11)
            java.lang.String r11 = r9.getPackageName()
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r10 = r10.toString()
            android.util.Log.d(r1, r10)
            androidx.profileinstaller.ProfileVerifier.writeProfileVerification(r9, r8)
            goto L72
        L4d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Installing profile for "
            r6.<init>(r7)
            java.lang.String r7 = r9.getPackageName()
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r1, r6)
            r1 = r0
            r6 = r10
            r7 = r11
            boolean r10 = transcodeAndWrite(r1, r2, r3, r4, r5, r6, r7)
            if (r10 == 0) goto L6f
            if (r12 == 0) goto L6f
            r8 = 1
        L6f:
            androidx.profileinstaller.ProfileVerifier.writeProfileVerification(r9, r8)
        L72:
            return
        L73:
            r10 = move-exception
            r12 = 7
            r11.onResultReceived(r12, r10)
            androidx.profileinstaller.ProfileVerifier.writeProfileVerification(r9, r8)
            return
    }

    static void writeSkipFile(android.content.Context r3, java.util.concurrent.Executor r4, androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback r5) {
            android.content.Context r0 = r3.getApplicationContext()
            java.lang.String r0 = r0.getPackageName()
            android.content.pm.PackageManager r1 = r3.getPackageManager()
            r2 = 0
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1f
            java.io.File r3 = r3.getFilesDir()
            noteProfileWrittenFor(r0, r3)
            r3 = 10
            r0 = 0
            result(r4, r5, r3, r0)
            return
        L1f:
            r3 = move-exception
            r0 = 7
            result(r4, r5, r0, r3)
            return
    }
}
