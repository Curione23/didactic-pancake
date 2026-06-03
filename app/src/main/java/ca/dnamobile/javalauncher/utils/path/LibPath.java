package ca.dnamobile.javalauncher.utils.path;

/* JADX INFO: loaded from: classes.dex */
public final class LibPath {
    public static java.io.File AUTHLIB_INJECTOR;
    public static java.io.File CACIO_17;
    public static java.io.File CACIO_17_AGENT;
    public static java.io.File CACIO_8;
    private static java.io.File COMPONENTS_DIR;
    public static java.io.File FORGE_INSTALLER;
    public static java.io.File JAVA_SANDBOX_POLICY;
    public static java.io.File LOG4J_XML_1_12;
    public static java.io.File LOG4J_XML_1_7;
    public static java.io.File MIO_FABRIC_AGENT;
    public static java.io.File MIO_LIB_PATCHER;
    public static java.io.File NIDE_8_AUTH;
    public static java.io.File OPTIFINE_RENAMER;
    private static java.io.File OTHER_LOGIN_DIR;
    public static java.io.File PRO_GRADE;
    private static java.io.File SUPPORT_COMPONENTS_DIR;

    static {
            refresh()
            return
    }

    private LibPath() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void refresh() {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = safeDataDir()
            java.lang.String r2 = "components"
            r0.<init>(r1, r2)
            ca.dnamobile.javalauncher.utils.path.LibPath.COMPONENTS_DIR = r0
            java.io.File r0 = safeFilesDir()
            ca.dnamobile.javalauncher.utils.path.LibPath.SUPPORT_COMPONENTS_DIR = r0
            java.io.File r0 = new java.io.File
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.LibPath.SUPPORT_COMPONENTS_DIR
            java.lang.String r2 = "other_login"
            r0.<init>(r1, r2)
            ca.dnamobile.javalauncher.utils.path.LibPath.OTHER_LOGIN_DIR = r0
            java.io.File r0 = new java.io.File
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.LibPath.SUPPORT_COMPONENTS_DIR
            java.lang.String r2 = "caciocavallo"
            r0.<init>(r1, r2)
            ca.dnamobile.javalauncher.utils.path.LibPath.CACIO_8 = r0
            java.io.File r0 = new java.io.File
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.LibPath.SUPPORT_COMPONENTS_DIR
            java.lang.String r2 = "caciocavallo17"
            r0.<init>(r1, r2)
            ca.dnamobile.javalauncher.utils.path.LibPath.CACIO_17 = r0
            java.io.File r0 = new java.io.File
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.LibPath.CACIO_17
            java.lang.String r2 = "cacio-agent.jar"
            r0.<init>(r1, r2)
            ca.dnamobile.javalauncher.utils.path.LibPath.CACIO_17_AGENT = r0
            java.io.File r0 = new java.io.File
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.LibPath.COMPONENTS_DIR
            java.lang.String r2 = "forge_installer.jar"
            r0.<init>(r1, r2)
            ca.dnamobile.javalauncher.utils.path.LibPath.FORGE_INSTALLER = r0
            java.io.File r0 = new java.io.File
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.LibPath.COMPONENTS_DIR
            java.lang.String r2 = "MioFabricAgent.jar"
            r0.<init>(r1, r2)
            ca.dnamobile.javalauncher.utils.path.LibPath.MIO_FABRIC_AGENT = r0
            java.io.File r0 = new java.io.File
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.LibPath.COMPONENTS_DIR
            java.lang.String r2 = "MioLibPatcher.jar"
            r0.<init>(r1, r2)
            ca.dnamobile.javalauncher.utils.path.LibPath.MIO_LIB_PATCHER = r0
            java.io.File r0 = new java.io.File
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.LibPath.COMPONENTS_DIR
            java.lang.String r2 = "OptiFineRenamer.jar"
            r0.<init>(r1, r2)
            ca.dnamobile.javalauncher.utils.path.LibPath.OPTIFINE_RENAMER = r0
            java.io.File r0 = new java.io.File
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.LibPath.OTHER_LOGIN_DIR
            java.lang.String r2 = "authlib-injector.jar"
            r0.<init>(r1, r2)
            ca.dnamobile.javalauncher.utils.path.LibPath.AUTHLIB_INJECTOR = r0
            java.io.File r0 = new java.io.File
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.LibPath.OTHER_LOGIN_DIR
            java.lang.String r2 = "nide8auth.jar"
            r0.<init>(r1, r2)
            ca.dnamobile.javalauncher.utils.path.LibPath.NIDE_8_AUTH = r0
            java.io.File r0 = new java.io.File
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.LibPath.COMPONENTS_DIR
            java.lang.String r2 = "java_sandbox.policy"
            r0.<init>(r1, r2)
            ca.dnamobile.javalauncher.utils.path.LibPath.JAVA_SANDBOX_POLICY = r0
            java.io.File r0 = new java.io.File
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.LibPath.COMPONENTS_DIR
            java.lang.String r2 = "log4j-rce-patch-1.7.xml"
            r0.<init>(r1, r2)
            ca.dnamobile.javalauncher.utils.path.LibPath.LOG4J_XML_1_7 = r0
            java.io.File r0 = new java.io.File
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.LibPath.COMPONENTS_DIR
            java.lang.String r2 = "log4j-rce-patch-1.12.xml"
            r0.<init>(r1, r2)
            ca.dnamobile.javalauncher.utils.path.LibPath.LOG4J_XML_1_12 = r0
            java.io.File r0 = new java.io.File
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.LibPath.COMPONENTS_DIR
            java.lang.String r2 = "pro-grade.jar"
            r0.<init>(r1, r2)
            ca.dnamobile.javalauncher.utils.path.LibPath.PRO_GRADE = r0
            return
    }

    private static java.lang.String safeDataDir() {
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_DATA
            if (r0 == 0) goto L13
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_DATA
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L13
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_DATA
            goto L15
        L13:
            java.lang.String r0 = "."
        L15:
            return r0
    }

    private static java.io.File safeFilesDir() {
            java.io.File r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_FILE
            if (r0 == 0) goto L7
            java.io.File r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_FILE
            return r0
        L7:
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_DATA
            java.lang.String r1 = "files"
            if (r0 == 0) goto L21
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_DATA
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L21
            java.io.File r0 = new java.io.File
            java.lang.String r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_DATA
            r0.<init>(r2, r1)
            return r0
        L21:
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            return r0
    }
}
