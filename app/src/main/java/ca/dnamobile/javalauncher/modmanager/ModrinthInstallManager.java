package ca.dnamobile.javalauncher.modmanager;

/* JADX INFO: loaded from: classes.dex */
public final class ModrinthInstallManager {
    private static final ca.dnamobile.javalauncher.modmanager.ModManagerSource SOURCE = null;

    public interface Listener {
        void onComplete(java.lang.String r1);

        void onError(java.lang.Throwable r1);

        void onStatus(java.lang.String r1);
    }

    static {
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.MODRINTH
            ca.dnamobile.javalauncher.modmanager.ModrinthInstallManager.SOURCE = r0
            return
    }

    private ModrinthInstallManager() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.io.File cacheProjectIcon(ca.dnamobile.javalauncher.modmanager.ModrinthApiClient r4, java.io.File r5, ca.dnamobile.javalauncher.modmanager.ModrinthProject r6) {
            java.lang.String r0 = r6.iconUrl
            r1 = 0
            if (r0 == 0) goto L63
            java.lang.String r0 = r6.iconUrl
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L63
            java.lang.String r0 = r6.projectId
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1e
            goto L63
        L1e:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L63
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L63
            java.lang.String r3 = ".javalauncher"
            r2.<init>(r5, r3)     // Catch: java.lang.Throwable -> L63
            java.lang.String r5 = "modmanager_icons"
            r0.<init>(r2, r5)     // Catch: java.lang.Throwable -> L63
            boolean r5 = r0.exists()     // Catch: java.lang.Throwable -> L63
            if (r5 != 0) goto L39
            boolean r5 = r0.mkdirs()     // Catch: java.lang.Throwable -> L63
            if (r5 != 0) goto L39
            return r1
        L39:
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L63
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63
            r2.<init>()     // Catch: java.lang.Throwable -> L63
            java.lang.String r3 = r6.projectId     // Catch: java.lang.Throwable -> L63
            java.lang.String r3 = sanitizeFileName(r3)     // Catch: java.lang.Throwable -> L63
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L63
            java.lang.String r3 = ".img"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L63
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L63
            r5.<init>(r0, r2)     // Catch: java.lang.Throwable -> L63
            java.lang.String r6 = r6.iconUrl     // Catch: java.lang.Throwable -> L63
            r4.downloadToFile(r6, r5)     // Catch: java.lang.Throwable -> L63
            boolean r4 = r5.isFile()     // Catch: java.lang.Throwable -> L63
            if (r4 == 0) goto L63
            r1 = r5
        L63:
            return r1
    }

    private static void installDependency(ca.dnamobile.javalauncher.modmanager.ModrinthApiClient r11, java.io.File r12, java.lang.String r13, java.lang.String r14, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r15, ca.dnamobile.javalauncher.modmanager.ModrinthDependency r16, java.util.HashSet<java.lang.String> r17, java.util.HashSet<java.lang.String> r18, ca.dnamobile.javalauncher.modmanager.ModrinthInstallManager.Listener r19) throws java.lang.Exception {
            r0 = r11
            r1 = r16
            java.lang.String r2 = r1.projectId
            if (r2 == 0) goto L4c
            java.lang.String r2 = r1.projectId
            java.lang.String r2 = r2.trim()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L4c
            java.lang.String r1 = r1.projectId
            java.lang.String r1 = r1.trim()
            r2 = r12
            r4 = r15
            boolean r3 = isProjectAlreadyInstalled(r12, r15, r1)
            if (r3 == 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Dependency already installed: "
            r0.<init>(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10 = r19
            r10.onStatus(r0)
            return
        L36:
            r10 = r19
            ca.dnamobile.javalauncher.modmanager.ModrinthProject r5 = r11.getProject(r1)
            r6 = 1
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r7 = r17
            r8 = r18
            r9 = r19
            installProject(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L4c:
            r2 = r12
            r4 = r15
            r10 = r19
            java.lang.String r3 = r1.versionId
            if (r3 == 0) goto L7f
            java.lang.String r3 = r1.versionId
            java.lang.String r3 = r3.trim()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L7f
            java.lang.String r1 = r1.versionId
            java.lang.String r1 = r1.trim()
            ca.dnamobile.javalauncher.modmanager.ModrinthVersion r6 = r11.getVersion(r1)
            java.lang.String r1 = r6.projectId
            ca.dnamobile.javalauncher.modmanager.ModrinthProject r5 = r11.getProject(r1)
            r7 = 1
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r8 = r17
            r9 = r18
            r10 = r19
            installVersion(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L7f:
            return
    }

    public static void installLatestCompatible(java.io.File r12, java.lang.String r13, java.lang.String r14, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r15, ca.dnamobile.javalauncher.modmanager.ModrinthProject r16, ca.dnamobile.javalauncher.modmanager.ModrinthInstallManager.Listener r17) {
            r11 = r17
            java.lang.String r0 = "Installed "
            ca.dnamobile.javalauncher.modmanager.ModrinthApiClient r1 = new ca.dnamobile.javalauncher.modmanager.ModrinthApiClient     // Catch: java.lang.Throwable -> L3a
            r1.<init>()     // Catch: java.lang.Throwable -> L3a
            java.util.HashSet r8 = new java.util.HashSet     // Catch: java.lang.Throwable -> L3a
            r8.<init>()     // Catch: java.lang.Throwable -> L3a
            java.util.HashSet r9 = new java.util.HashSet     // Catch: java.lang.Throwable -> L3a
            r9.<init>()     // Catch: java.lang.Throwable -> L3a
            r7 = 0
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r10 = r17
            installProject(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L3a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3a
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L3a
            r0 = r16
            java.lang.String r0 = r0.title     // Catch: java.lang.Throwable -> L3a
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r1 = "."
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L3a
            r11.onComplete(r0)     // Catch: java.lang.Throwable -> L3a
            goto L3e
        L3a:
            r0 = move-exception
            r11.onError(r0)
        L3e:
            return
    }

    private static void installProject(ca.dnamobile.javalauncher.modmanager.ModrinthApiClient r12, java.io.File r13, java.lang.String r14, java.lang.String r15, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r16, ca.dnamobile.javalauncher.modmanager.ModrinthProject r17, boolean r18, java.util.HashSet<java.lang.String> r19, java.util.HashSet<java.lang.String> r20, ca.dnamobile.javalauncher.modmanager.ModrinthInstallManager.Listener r21) throws java.lang.Exception {
            r6 = r17
            r10 = r21
            java.lang.String r0 = r6.projectId
            r8 = r19
            boolean r0 = r8.add(r0)
            if (r0 != 0) goto Lf
            return
        Lf:
            if (r18 == 0) goto L31
            java.lang.String r0 = r6.projectId
            r7 = r13
            r9 = r16
            boolean r0 = isProjectAlreadyInstalled(r13, r9, r0)
            if (r0 == 0) goto L34
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Dependency already installed: "
            r0.<init>(r1)
            java.lang.String r1 = r6.title
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.onStatus(r0)
            return
        L31:
            r7 = r13
            r9 = r16
        L34:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r18 == 0) goto L3e
            java.lang.String r1 = "Installing dependency "
            goto L40
        L3e:
            java.lang.String r1 = "Finding version for "
        L40:
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r6.title
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "..."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.onStatus(r0)
            r5 = 0
            r0 = r12
            r1 = r17
            r2 = r16
            r3 = r14
            r4 = r15
            java.util.ArrayList r0 = r0.getProjectVersionsWithFallback(r1, r2, r3, r4, r5)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L86
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            r11 = r0
            ca.dnamobile.javalauncher.modmanager.ModrinthVersion r11 = (ca.dnamobile.javalauncher.modmanager.ModrinthVersion) r11
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r11
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            installVersion(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L86:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No compatible Modrinth version found for "
            r1.<init>(r2)
            java.lang.String r2 = r6.title
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " (Minecraft "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r14
            java.lang.StringBuilder r1 = r1.append(r14)
            java.lang.String r2 = ", "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = safeLoader(r15)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ")."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static void installSpecificVersion(java.io.File r13, java.lang.String r14, java.lang.String r15, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r16, ca.dnamobile.javalauncher.modmanager.ModrinthProject r17, ca.dnamobile.javalauncher.modmanager.ModrinthVersion r18, ca.dnamobile.javalauncher.modmanager.ModrinthInstallManager.Listener r19) {
            r12 = r19
            java.lang.String r0 = "Installed "
            ca.dnamobile.javalauncher.modmanager.ModrinthApiClient r1 = new ca.dnamobile.javalauncher.modmanager.ModrinthApiClient     // Catch: java.lang.Throwable -> L4b
            r1.<init>()     // Catch: java.lang.Throwable -> L4b
            java.util.HashSet r9 = new java.util.HashSet     // Catch: java.lang.Throwable -> L4b
            r9.<init>()     // Catch: java.lang.Throwable -> L4b
            java.util.HashSet r10 = new java.util.HashSet     // Catch: java.lang.Throwable -> L4b
            r10.<init>()     // Catch: java.lang.Throwable -> L4b
            r8 = 0
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r11 = r19
            installVersion(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L4b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L4b
            r0 = r17
            java.lang.String r0 = r0.title     // Catch: java.lang.Throwable -> L4b
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L4b
            r1 = r18
            java.lang.String r1 = r1.versionNumber     // Catch: java.lang.Throwable -> L4b
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r1 = "."
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L4b
            r12.onComplete(r0)     // Catch: java.lang.Throwable -> L4b
            goto L4f
        L4b:
            r0 = move-exception
            r12.onError(r0)
        L4f:
            return
    }

    private static void installVersion(ca.dnamobile.javalauncher.modmanager.ModrinthApiClient r17, java.io.File r18, java.lang.String r19, java.lang.String r20, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r21, ca.dnamobile.javalauncher.modmanager.ModrinthProject r22, ca.dnamobile.javalauncher.modmanager.ModrinthVersion r23, boolean r24, java.util.HashSet<java.lang.String> r25, java.util.HashSet<java.lang.String> r26, ca.dnamobile.javalauncher.modmanager.ModrinthInstallManager.Listener r27) throws java.lang.Exception {
            r9 = r17
            r10 = r18
            r11 = r21
            r12 = r22
            r13 = r23
            r14 = r27
            java.lang.String r0 = r13.id
            r15 = r26
            boolean r0 = r15.add(r0)
            if (r0 != 0) goto L17
            return
        L17:
            if (r24 == 0) goto L36
            java.lang.String r0 = r12.projectId
            boolean r0 = isProjectAlreadyInstalled(r10, r11, r0)
            if (r0 == 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Dependency already installed: "
            r0.<init>(r1)
            java.lang.String r1 = r12.title
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.onStatus(r0)
            return
        L36:
            boolean r0 = r21.supportsDependencies()
            if (r0 == 0) goto L6a
            java.util.List<ca.dnamobile.javalauncher.modmanager.ModrinthDependency> r0 = r13.dependencies
            java.util.Iterator r16 = r0.iterator()
        L42:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L6a
            java.lang.Object r0 = r16.next()
            r5 = r0
            ca.dnamobile.javalauncher.modmanager.ModrinthDependency r5 = (ca.dnamobile.javalauncher.modmanager.ModrinthDependency) r5
            boolean r0 = r5.isRequired()
            if (r0 != 0) goto L56
            goto L42
        L56:
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r6 = r25
            r7 = r26
            r8 = r27
            installDependency(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            goto L42
        L6a:
            ca.dnamobile.javalauncher.modmanager.ModrinthFile r5 = r23.getPrimaryFile()
            java.lang.String r0 = " "
            if (r5 == 0) goto Lfc
            java.lang.String r1 = r5.url
            java.lang.String r1 = r1.trim()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto Lfc
            java.io.File r1 = r11.getTargetDirectory(r10)
            boolean r2 = r1.exists()
            if (r2 != 0) goto La8
            boolean r2 = r1.mkdirs()
            if (r2 == 0) goto L8f
            goto La8
        L8f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to create folder: "
            r2.<init>(r3)
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        La8:
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r2 = ca.dnamobile.javalauncher.modmanager.ModrinthInstallManager.SOURCE
            java.lang.String r3 = r12.projectId
            ca.dnamobile.javalauncher.modmanager.ModManagerManifest.removeKnownFilesForProject(r10, r11, r2, r3)
            java.lang.String r3 = r5.filename
            java.lang.String r3 = sanitizeFileName(r3)
            java.io.File r6 = uniqueTargetFile(r1, r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Downloading "
            r1.<init>(r3)
            java.lang.String r3 = r12.title
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = r13.versionNumber
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "..."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.onStatus(r0)
            java.lang.String r0 = r5.url
            r9.downloadToFile(r0, r6)
            java.io.File r14 = cacheProjectIcon(r9, r10, r12)
            java.lang.String r15 = r12.iconUrl
            r0 = r18
            r1 = r21
            r3 = r22
            r4 = r23
            r7 = r24
            r8 = r19
            r9 = r20
            r10 = r15
            r11 = r14
            ca.dnamobile.javalauncher.modmanager.ModManagerManifest.recordInstalled(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        Lfc:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "No downloadable file found for "
            r2.<init>(r3)
            java.lang.String r3 = r12.title
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = r13.versionNumber
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r2 = "."
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    private static boolean isProjectAlreadyInstalled(java.io.File r1, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2, java.lang.String r3) {
            if (r3 == 0) goto L1e
            java.lang.String r0 = r3.trim()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1e
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = ca.dnamobile.javalauncher.modmanager.ModrinthInstallManager.SOURCE
            java.lang.String r0 = r0.getId()
            java.lang.String r3 = r3.trim()
            boolean r1 = ca.dnamobile.javalauncher.modmanager.ModManagerManifest.isProjectInstalled(r1, r2, r0, r3)
            if (r1 == 0) goto L1e
            r1 = 1
            goto L1f
        L1e:
            r1 = 0
        L1f:
            return r1
    }

    private static java.lang.String safeLoader(java.lang.String r1) {
            if (r1 == 0) goto L18
            java.lang.String r0 = r1.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto L18
        Ld:
            java.lang.String r1 = r1.trim()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            goto L1a
        L18:
            java.lang.String r1 = "unknown loader"
        L1a:
            return r1
    }

    private static java.lang.String sanitizeFileName(java.lang.String r2) {
            java.lang.String r2 = r2.trim()
            r0 = 10
            r1 = 32
            java.lang.String r2 = r2.replace(r0, r1)
            r0 = 13
            java.lang.String r2 = r2.replace(r0, r1)
            java.lang.String r0 = "[\\\\/:*?\"<>|]"
            java.lang.String r1 = "_"
            java.lang.String r2 = r2.replaceAll(r0, r1)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L22
            java.lang.String r2 = "download.jar"
        L22:
            return r2
    }

    private static java.io.File uniqueTargetFile(java.io.File r5, java.lang.String r6) {
            java.io.File r0 = new java.io.File
            r0.<init>(r5, r6)
            boolean r1 = r0.exists()
            if (r1 != 0) goto Lc
            return r0
        Lc:
            r0 = 46
            int r0 = r6.lastIndexOf(r0)
            if (r0 <= 0) goto L20
            r1 = 0
            java.lang.String r1 = r6.substring(r1, r0)
            java.lang.String r6 = r6.substring(r0)
            r0 = r6
            r6 = r1
            goto L22
        L20:
            java.lang.String r0 = ""
        L22:
            r1 = 2
        L23:
            r2 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r3 = "-"
            if (r1 >= r2) goto L51
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r5, r3)
            boolean r3 = r2.exists()
            if (r3 != 0) goto L4e
            return r2
        L4e:
            int r1 = r1 + 1
            goto L23
        L51:
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r6 = r2.append(r6)
            java.lang.StringBuilder r6 = r6.append(r3)
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r6 = r6.append(r2)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            r1.<init>(r5, r6)
            return r1
    }
}
