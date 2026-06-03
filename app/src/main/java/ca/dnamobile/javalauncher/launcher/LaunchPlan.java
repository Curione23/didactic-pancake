package ca.dnamobile.javalauncher.launcher;

/* JADX INFO: loaded from: classes.dex */
public final class LaunchPlan {
    private final java.lang.String classPath;
    private final java.util.ArrayList<java.lang.String> gameArgs;
    private final java.io.File gameDirectory;
    private final java.io.File javaBinary;
    private final java.util.ArrayList<java.lang.String> jvmArgs;
    private final java.io.File lwjglNativeDirectory;
    private final java.lang.String mainClass;
    private final java.io.File runtimeDirectory;
    private final java.lang.String versionId;

    LaunchPlan(java.lang.String r1, java.lang.String r2, java.io.File r3, java.io.File r4, java.io.File r5, java.io.File r6, java.lang.String r7, java.util.List<java.lang.String> r8, java.util.List<java.lang.String> r9) {
            r0 = this;
            r0.<init>()
            r0.versionId = r1
            r0.mainClass = r2
            r0.gameDirectory = r3
            r0.runtimeDirectory = r4
            r0.javaBinary = r5
            r0.lwjglNativeDirectory = r6
            r0.classPath = r7
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r8)
            r0.jvmArgs = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r9)
            r0.gameArgs = r1
            return
    }

    ca.dnamobile.javalauncher.launcher.LaunchPlan copyWithGameArgs(java.util.List<java.lang.String> r12) {
            r11 = this;
            ca.dnamobile.javalauncher.launcher.LaunchPlan r10 = new ca.dnamobile.javalauncher.launcher.LaunchPlan
            java.lang.String r1 = r11.versionId
            java.lang.String r2 = r11.mainClass
            java.io.File r3 = r11.gameDirectory
            java.io.File r4 = r11.runtimeDirectory
            java.io.File r5 = r11.javaBinary
            java.io.File r6 = r11.lwjglNativeDirectory
            java.lang.String r7 = r11.classPath
            java.util.ArrayList<java.lang.String> r8 = r11.jvmArgs
            r0 = r10
            r9 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    ca.dnamobile.javalauncher.launcher.LaunchPlan copyWithJvmArgs(java.util.List<java.lang.String> r12) {
            r11 = this;
            ca.dnamobile.javalauncher.launcher.LaunchPlan r10 = new ca.dnamobile.javalauncher.launcher.LaunchPlan
            java.lang.String r1 = r11.versionId
            java.lang.String r2 = r11.mainClass
            java.io.File r3 = r11.gameDirectory
            java.io.File r4 = r11.runtimeDirectory
            java.io.File r5 = r11.javaBinary
            java.io.File r6 = r11.lwjglNativeDirectory
            java.lang.String r7 = r11.classPath
            java.util.ArrayList<java.lang.String> r9 = r11.gameArgs
            r0 = r10
            r8 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    public java.lang.String getClassPath() {
            r1 = this;
            java.lang.String r0 = r1.classPath
            return r0
    }

    public java.util.List<java.lang.String> getGameArgs() {
            r1 = this;
            java.util.ArrayList<java.lang.String> r0 = r1.gameArgs
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    public java.io.File getGameDirectory() {
            r1 = this;
            java.io.File r0 = r1.gameDirectory
            return r0
    }

    public java.io.File getJavaBinary() {
            r1 = this;
            java.io.File r0 = r1.javaBinary
            return r0
    }

    public java.util.List<java.lang.String> getJvmArgs() {
            r1 = this;
            java.util.ArrayList<java.lang.String> r0 = r1.jvmArgs
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    public java.io.File getLwjglNativeDirectory() {
            r1 = this;
            java.io.File r0 = r1.lwjglNativeDirectory
            return r0
    }

    public java.lang.String getMainClass() {
            r1 = this;
            java.lang.String r0 = r1.mainClass
            return r0
    }

    public java.io.File getRuntimeDirectory() {
            r1 = this;
            java.io.File r0 = r1.runtimeDirectory
            return r0
    }

    public java.lang.String getVersionId() {
            r1 = this;
            java.lang.String r0 = r1.versionId
            return r0
    }
}
