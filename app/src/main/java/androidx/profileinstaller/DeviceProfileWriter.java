package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
public class DeviceProfileWriter {
    private final java.lang.String mApkName;
    private final android.content.res.AssetManager mAssetManager;
    private final java.io.File mCurProfile;
    private final byte[] mDesiredVersion;
    private boolean mDeviceSupportsAotProfile;
    private final androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback mDiagnostics;
    private final java.util.concurrent.Executor mExecutor;
    private androidx.profileinstaller.DexProfileData[] mProfile;
    private final java.lang.String mProfileMetaSourceLocation;
    private final java.lang.String mProfileSourceLocation;
    private byte[] mTranscodedProfile;

    public DeviceProfileWriter(android.content.res.AssetManager r2, java.util.concurrent.Executor r3, androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.io.File r8) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mDeviceSupportsAotProfile = r0
            r1.mAssetManager = r2
            r1.mExecutor = r3
            r1.mDiagnostics = r4
            r1.mApkName = r5
            r1.mProfileSourceLocation = r6
            r1.mProfileMetaSourceLocation = r7
            r1.mCurProfile = r8
            byte[] r2 = desiredVersion()
            r1.mDesiredVersion = r2
            return
    }

    private androidx.profileinstaller.DeviceProfileWriter addMetadata(androidx.profileinstaller.DexProfileData[] r4, byte[] r5) {
            r3 = this;
            r0 = 0
            android.content.res.AssetManager r1 = r3.mAssetManager     // Catch: java.lang.IllegalStateException -> L2f java.io.IOException -> L3a java.io.FileNotFoundException -> L42
            java.lang.String r2 = r3.mProfileMetaSourceLocation     // Catch: java.lang.IllegalStateException -> L2f java.io.IOException -> L3a java.io.FileNotFoundException -> L42
            java.io.InputStream r1 = r3.openStreamFromAssets(r1, r2)     // Catch: java.lang.IllegalStateException -> L2f java.io.IOException -> L3a java.io.FileNotFoundException -> L42
            if (r1 == 0) goto L29
            byte[] r2 = androidx.profileinstaller.ProfileTranscoder.MAGIC_PROFM     // Catch: java.lang.Throwable -> L1d
            byte[] r2 = androidx.profileinstaller.ProfileTranscoder.readHeader(r1, r2)     // Catch: java.lang.Throwable -> L1d
            androidx.profileinstaller.DexProfileData[] r4 = androidx.profileinstaller.ProfileTranscoder.readMeta(r1, r2, r5, r4)     // Catch: java.lang.Throwable -> L1d
            r3.mProfile = r4     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1c
            r1.close()     // Catch: java.lang.IllegalStateException -> L2f java.io.IOException -> L3a java.io.FileNotFoundException -> L42
        L1c:
            return r3
        L1d:
            r4 = move-exception
            if (r1 == 0) goto L28
            r1.close()     // Catch: java.lang.Throwable -> L24
            goto L28
        L24:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch: java.lang.IllegalStateException -> L2f java.io.IOException -> L3a java.io.FileNotFoundException -> L42
        L28:
            throw r4     // Catch: java.lang.IllegalStateException -> L2f java.io.IOException -> L3a java.io.FileNotFoundException -> L42
        L29:
            if (r1 == 0) goto L4a
            r1.close()     // Catch: java.lang.IllegalStateException -> L2f java.io.IOException -> L3a java.io.FileNotFoundException -> L42
            goto L4a
        L2f:
            r4 = move-exception
            r3.mProfile = r0
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r5 = r3.mDiagnostics
            r1 = 8
            r5.onResultReceived(r1, r4)
            goto L4a
        L3a:
            r4 = move-exception
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r5 = r3.mDiagnostics
            r1 = 7
            r5.onResultReceived(r1, r4)
            goto L4a
        L42:
            r4 = move-exception
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r5 = r3.mDiagnostics
            r1 = 9
            r5.onResultReceived(r1, r4)
        L4a:
            return r0
    }

    private void assertDeviceAllowsProfileInstallerAotWritesCalled() {
            r2 = this;
            boolean r0 = r2.mDeviceSupportsAotProfile
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This device doesn't support aot. Did you call deviceSupportsAotProfile()?"
            r0.<init>(r1)
            throw r0
    }

    private static byte[] desiredVersion() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            r2 = 0
            if (r0 <= r1) goto L8
            return r2
        L8:
            int r0 = android.os.Build.VERSION.SDK_INT
            switch(r0) {
                case 26: goto L17;
                case 27: goto L14;
                case 28: goto L11;
                case 29: goto L11;
                case 30: goto L11;
                case 31: goto Le;
                case 32: goto Le;
                case 33: goto Le;
                case 34: goto Le;
                default: goto Ld;
            }
        Ld:
            return r2
        Le:
            byte[] r0 = androidx.profileinstaller.ProfileVersion.V015_S
            return r0
        L11:
            byte[] r0 = androidx.profileinstaller.ProfileVersion.V010_P
            return r0
        L14:
            byte[] r0 = androidx.profileinstaller.ProfileVersion.V009_O_MR1
            return r0
        L17:
            byte[] r0 = androidx.profileinstaller.ProfileVersion.V005_O
            return r0
    }

    private java.io.InputStream getProfileInputStream(android.content.res.AssetManager r3) {
            r2 = this;
            java.lang.String r0 = r2.mProfileSourceLocation     // Catch: java.io.IOException -> L7 java.io.FileNotFoundException -> Lf
            java.io.InputStream r3 = r2.openStreamFromAssets(r3, r0)     // Catch: java.io.IOException -> L7 java.io.FileNotFoundException -> Lf
            goto L17
        L7:
            r3 = move-exception
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r0 = r2.mDiagnostics
            r1 = 7
            r0.onResultReceived(r1, r3)
            goto L16
        Lf:
            r3 = move-exception
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r0 = r2.mDiagnostics
            r1 = 6
            r0.onResultReceived(r1, r3)
        L16:
            r3 = 0
        L17:
            return r3
    }

    private java.io.InputStream openStreamFromAssets(android.content.res.AssetManager r2, java.lang.String r3) throws java.io.IOException {
            r1 = this;
            android.content.res.AssetFileDescriptor r2 = r2.openFd(r3)     // Catch: java.io.FileNotFoundException -> L9
            java.io.FileInputStream r2 = r2.createInputStream()     // Catch: java.io.FileNotFoundException -> L9
            goto L20
        L9:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            r3 = 0
            if (r2 == 0) goto L1f
            java.lang.String r0 = "compressed"
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L1f
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r2 = r1.mDiagnostics
            r0 = 5
            r2.onDiagnosticReceived(r0, r3)
        L1f:
            r2 = r3
        L20:
            return r2
    }

    private androidx.profileinstaller.DexProfileData[] readProfileInternal(java.io.InputStream r5) {
            r4 = this;
            r0 = 7
            byte[] r1 = androidx.profileinstaller.ProfileTranscoder.MAGIC_PROF     // Catch: java.lang.Throwable -> L18 java.lang.IllegalStateException -> L1a java.io.IOException -> L26
            byte[] r1 = androidx.profileinstaller.ProfileTranscoder.readHeader(r5, r1)     // Catch: java.lang.Throwable -> L18 java.lang.IllegalStateException -> L1a java.io.IOException -> L26
            java.lang.String r2 = r4.mApkName     // Catch: java.lang.Throwable -> L18 java.lang.IllegalStateException -> L1a java.io.IOException -> L26
            androidx.profileinstaller.DexProfileData[] r1 = androidx.profileinstaller.ProfileTranscoder.readProfile(r5, r1, r2)     // Catch: java.lang.Throwable -> L18 java.lang.IllegalStateException -> L1a java.io.IOException -> L26
            r5.close()     // Catch: java.io.IOException -> L11
            goto L37
        L11:
            r5 = move-exception
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r2 = r4.mDiagnostics
            r2.onResultReceived(r0, r5)
            goto L37
        L18:
            r1 = move-exception
            goto L38
        L1a:
            r1 = move-exception
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r2 = r4.mDiagnostics     // Catch: java.lang.Throwable -> L18
            r3 = 8
            r2.onResultReceived(r3, r1)     // Catch: java.lang.Throwable -> L18
            r5.close()     // Catch: java.io.IOException -> L30
            goto L36
        L26:
            r1 = move-exception
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r2 = r4.mDiagnostics     // Catch: java.lang.Throwable -> L18
            r2.onResultReceived(r0, r1)     // Catch: java.lang.Throwable -> L18
            r5.close()     // Catch: java.io.IOException -> L30
            goto L36
        L30:
            r5 = move-exception
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r1 = r4.mDiagnostics
            r1.onResultReceived(r0, r5)
        L36:
            r1 = 0
        L37:
            return r1
        L38:
            r5.close()     // Catch: java.io.IOException -> L3c
            goto L42
        L3c:
            r5 = move-exception
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r2 = r4.mDiagnostics
            r2.onResultReceived(r0, r5)
        L42:
            throw r1
    }

    private static boolean requiresMetadata() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            r2 = 0
            if (r0 <= r1) goto L8
            return r2
        L8:
            int r0 = android.os.Build.VERSION.SDK_INT
            switch(r0) {
                case 31: goto Le;
                case 32: goto Le;
                case 33: goto Le;
                case 34: goto Le;
                default: goto Ld;
            }
        Ld:
            return r2
        Le:
            r0 = 1
            return r0
    }

    private void result(int r3, java.lang.Object r4) {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.mExecutor
            androidx.profileinstaller.DeviceProfileWriter$$ExternalSyntheticLambda0 r1 = new androidx.profileinstaller.DeviceProfileWriter$$ExternalSyntheticLambda0
            r1.<init>(r2, r3, r4)
            r0.execute(r1)
            return
    }

    public boolean deviceAllowsProfileInstallerAotWrites() {
            r4 = this;
            byte[] r0 = r4.mDesiredVersion
            r1 = 0
            if (r0 != 0) goto L10
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 3
            r4.result(r2, r0)
            return r1
        L10:
            java.io.File r0 = r4.mCurProfile
            boolean r0 = r0.exists()
            r2 = 0
            r3 = 4
            if (r0 == 0) goto L26
            java.io.File r0 = r4.mCurProfile
            boolean r0 = r0.canWrite()
            if (r0 != 0) goto L2b
            r4.result(r3, r2)
            return r1
        L26:
            java.io.File r0 = r4.mCurProfile     // Catch: java.io.IOException -> L2f
            r0.createNewFile()     // Catch: java.io.IOException -> L2f
        L2b:
            r0 = 1
            r4.mDeviceSupportsAotProfile = r0
            return r0
        L2f:
            r4.result(r3, r2)
            return r1
    }

    /* JADX INFO: renamed from: lambda$result$0$androidx-profileinstaller-DeviceProfileWriter, reason: not valid java name */
    /* synthetic */ void m67lambda$result$0$androidxprofileinstallerDeviceProfileWriter(int r2, java.lang.Object r3) {
            r1 = this;
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r0 = r1.mDiagnostics
            r0.onResultReceived(r2, r3)
            return
    }

    public androidx.profileinstaller.DeviceProfileWriter read() {
            r2 = this;
            r2.assertDeviceAllowsProfileInstallerAotWritesCalled()
            byte[] r0 = r2.mDesiredVersion
            if (r0 != 0) goto L8
            return r2
        L8:
            android.content.res.AssetManager r0 = r2.mAssetManager
            java.io.InputStream r0 = r2.getProfileInputStream(r0)
            if (r0 == 0) goto L16
            androidx.profileinstaller.DexProfileData[] r0 = r2.readProfileInternal(r0)
            r2.mProfile = r0
        L16:
            androidx.profileinstaller.DexProfileData[] r0 = r2.mProfile
            if (r0 == 0) goto L29
            boolean r1 = requiresMetadata()
            if (r1 == 0) goto L29
            byte[] r1 = r2.mDesiredVersion
            androidx.profileinstaller.DeviceProfileWriter r0 = r2.addMetadata(r0, r1)
            if (r0 == 0) goto L29
            return r0
        L29:
            return r2
    }

    public androidx.profileinstaller.DeviceProfileWriter transcodeIfNeeded() {
            r4 = this;
            androidx.profileinstaller.DexProfileData[] r0 = r4.mProfile
            byte[] r1 = r4.mDesiredVersion
            if (r0 == 0) goto L4d
            if (r1 != 0) goto L9
            goto L4d
        L9:
            r4.assertDeviceAllowsProfileInstallerAotWritesCalled()
            r2 = 0
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.IllegalStateException -> L3b java.io.IOException -> L44
            r3.<init>()     // Catch: java.lang.IllegalStateException -> L3b java.io.IOException -> L44
            androidx.profileinstaller.ProfileTranscoder.writeHeader(r3, r1)     // Catch: java.lang.Throwable -> L31
            boolean r0 = androidx.profileinstaller.ProfileTranscoder.transcodeAndWriteBody(r3, r1, r0)     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L27
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r0 = r4.mDiagnostics     // Catch: java.lang.Throwable -> L31
            r1 = 5
            r0.onResultReceived(r1, r2)     // Catch: java.lang.Throwable -> L31
            r4.mProfile = r2     // Catch: java.lang.Throwable -> L31
            r3.close()     // Catch: java.lang.IllegalStateException -> L3b java.io.IOException -> L44
            return r4
        L27:
            byte[] r0 = r3.toByteArray()     // Catch: java.lang.Throwable -> L31
            r4.mTranscodedProfile = r0     // Catch: java.lang.Throwable -> L31
            r3.close()     // Catch: java.lang.IllegalStateException -> L3b java.io.IOException -> L44
            goto L4b
        L31:
            r0 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L36
            goto L3a
        L36:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch: java.lang.IllegalStateException -> L3b java.io.IOException -> L44
        L3a:
            throw r0     // Catch: java.lang.IllegalStateException -> L3b java.io.IOException -> L44
        L3b:
            r0 = move-exception
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r1 = r4.mDiagnostics
            r3 = 8
            r1.onResultReceived(r3, r0)
            goto L4b
        L44:
            r0 = move-exception
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r1 = r4.mDiagnostics
            r3 = 7
            r1.onResultReceived(r3, r0)
        L4b:
            r4.mProfile = r2
        L4d:
            return r4
    }

    public boolean write() {
            r5 = this;
            byte[] r0 = r5.mTranscodedProfile
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r5.assertDeviceAllowsProfileInstallerAotWritesCalled()
            r2 = 0
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e java.io.FileNotFoundException -> L44
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e java.io.FileNotFoundException -> L44
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L32
            java.io.File r4 = r5.mCurProfile     // Catch: java.lang.Throwable -> L32
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L32
            androidx.profileinstaller.Encoding.writeAll(r3, r0)     // Catch: java.lang.Throwable -> L28
            r4 = 1
            r5.result(r4, r2)     // Catch: java.lang.Throwable -> L28
            r0.close()     // Catch: java.lang.Throwable -> L32
            r3.close()     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e java.io.FileNotFoundException -> L44
            r5.mTranscodedProfile = r2
            r5.mProfile = r2
            return r4
        L28:
            r4 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L2d
            goto L31
        L2d:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.lang.Throwable -> L32
        L31:
            throw r4     // Catch: java.lang.Throwable -> L32
        L32:
            r0 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L37
            goto L3b
        L37:
            r3 = move-exception
            r0.addSuppressed(r3)     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e java.io.FileNotFoundException -> L44
        L3b:
            throw r0     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e java.io.FileNotFoundException -> L44
        L3c:
            r0 = move-exception
            goto L4e
        L3e:
            r0 = move-exception
            r3 = 7
            r5.result(r3, r0)     // Catch: java.lang.Throwable -> L3c
            goto L49
        L44:
            r0 = move-exception
            r3 = 6
            r5.result(r3, r0)     // Catch: java.lang.Throwable -> L3c
        L49:
            r5.mTranscodedProfile = r2
            r5.mProfile = r2
            return r1
        L4e:
            r5.mTranscodedProfile = r2
            r5.mProfile = r2
            throw r0
    }
}
