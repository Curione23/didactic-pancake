package ca.dnamobile.javalauncher.modmanager;

/* JADX INFO: loaded from: classes.dex */
public final class CurseForgeInstallManager {
    private static final ca.dnamobile.javalauncher.modmanager.ModManagerSource SOURCE = null;

    static {
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.CURSEFORGE
            ca.dnamobile.javalauncher.modmanager.CurseForgeInstallManager.SOURCE = r0
            return
    }

    private CurseForgeInstallManager() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.io.File cacheProjectIcon(ca.dnamobile.javalauncher.modmanager.CurseForgeApiClient r5, java.io.File r6, ca.dnamobile.javalauncher.modmanager.ModrinthProject r7) {
            java.lang.String r0 = "curseforge-"
            java.lang.String r1 = r7.iconUrl
            r2 = 0
            if (r1 == 0) goto L65
            java.lang.String r1 = r7.iconUrl
            java.lang.String r1 = r1.trim()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L65
            java.lang.String r1 = r7.projectId
            java.lang.String r1 = r1.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L20
            goto L65
        L20:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L65
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L65
            java.lang.String r4 = ".javalauncher"
            r3.<init>(r6, r4)     // Catch: java.lang.Throwable -> L65
            java.lang.String r6 = "modmanager_icons"
            r1.<init>(r3, r6)     // Catch: java.lang.Throwable -> L65
            boolean r6 = r1.exists()     // Catch: java.lang.Throwable -> L65
            if (r6 != 0) goto L3b
            boolean r6 = r1.mkdirs()     // Catch: java.lang.Throwable -> L65
            if (r6 != 0) goto L3b
            return r2
        L3b:
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L65
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L65
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L65
            java.lang.String r0 = r7.projectId     // Catch: java.lang.Throwable -> L65
            java.lang.String r0 = sanitizeFileName(r0)     // Catch: java.lang.Throwable -> L65
            java.lang.StringBuilder r0 = r3.append(r0)     // Catch: java.lang.Throwable -> L65
            java.lang.String r3 = ".img"
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch: java.lang.Throwable -> L65
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L65
            r6.<init>(r1, r0)     // Catch: java.lang.Throwable -> L65
            java.lang.String r7 = r7.iconUrl     // Catch: java.lang.Throwable -> L65
            r5.downloadToFile(r7, r6)     // Catch: java.lang.Throwable -> L65
            boolean r5 = r6.isFile()     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L65
            r2 = r6
        L65:
            return r2
    }

    private static void installDependency(ca.dnamobile.javalauncher.modmanager.CurseForgeApiClient r11, java.io.File r12, java.lang.String r13, java.lang.String r14, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r15, ca.dnamobile.javalauncher.modmanager.ModrinthDependency r16, java.util.HashSet<java.lang.String> r17, java.util.HashSet<java.lang.String> r18, ca.dnamobile.javalauncher.modmanager.ModrinthInstallManager.Listener r19) throws java.lang.Exception {
            r0 = r16
            java.lang.String r1 = r0.projectId
            if (r1 == 0) goto L49
            java.lang.String r1 = r0.projectId
            java.lang.String r1 = r1.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L13
            goto L49
        L13:
            java.lang.String r0 = r0.projectId
            java.lang.String r0 = r0.trim()
            r2 = r12
            r5 = r15
            boolean r1 = isProjectAlreadyInstalled(r12, r15, r0)
            if (r1 == 0) goto L36
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Dependency already installed: "
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r10 = r19
            r10.onStatus(r0)
            return
        L36:
            r1 = r11
            r10 = r19
            ca.dnamobile.javalauncher.modmanager.ModrinthProject r6 = r11.getProject(r0)
            r7 = 1
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r8 = r17
            r9 = r18
            installProject(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L49:
            return
    }

    public static void installLatestCompatible(ca.dnamobile.javalauncher.modmanager.CurseForgeApiClient r12, java.io.File r13, java.lang.String r14, java.lang.String r15, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r16, ca.dnamobile.javalauncher.modmanager.ModrinthProject r17, ca.dnamobile.javalauncher.modmanager.ModrinthInstallManager.Listener r18) {
            r11 = r18
            java.lang.String r0 = "Installed "
            java.util.HashSet r8 = new java.util.HashSet     // Catch: java.lang.Throwable -> L37
            r8.<init>()     // Catch: java.lang.Throwable -> L37
            java.util.HashSet r9 = new java.util.HashSet     // Catch: java.lang.Throwable -> L37
            r9.<init>()     // Catch: java.lang.Throwable -> L37
            r7 = 0
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r10 = r18
            installProject(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L37
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L37
            r0 = r17
            java.lang.String r0 = r0.title     // Catch: java.lang.Throwable -> L37
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "."
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L37
            r11.onComplete(r0)     // Catch: java.lang.Throwable -> L37
            goto L3b
        L37:
            r0 = move-exception
            r11.onError(r0)
        L3b:
            return
    }

    private static void installProject(ca.dnamobile.javalauncher.modmanager.CurseForgeApiClient r11, java.io.File r12, java.lang.String r13, java.lang.String r14, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r15, ca.dnamobile.javalauncher.modmanager.ModrinthProject r16, boolean r17, java.util.HashSet<java.lang.String> r18, java.util.HashSet<java.lang.String> r19, ca.dnamobile.javalauncher.modmanager.ModrinthInstallManager.Listener r20) throws java.lang.Exception {
            r2 = r13
            r4 = r15
            r5 = r16
            r10 = r20
            java.lang.String r0 = r5.projectId
            r8 = r18
            boolean r0 = r8.add(r0)
            if (r0 != 0) goto L11
            return
        L11:
            if (r17 == 0) goto L31
            java.lang.String r0 = r5.projectId
            r1 = r12
            boolean r0 = isProjectAlreadyInstalled(r12, r15, r0)
            if (r0 == 0) goto L32
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Dependency already installed: "
            r0.<init>(r1)
            java.lang.String r1 = r5.title
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.onStatus(r0)
            return
        L31:
            r1 = r12
        L32:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r17 == 0) goto L3c
            java.lang.String r3 = "Installing CurseForge dependency "
            goto L3e
        L3c:
            java.lang.String r3 = "Finding CurseForge version for "
        L3e:
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r3 = r5.title
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r3 = "..."
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            r10.onStatus(r0)
            java.lang.String r0 = r5.projectId
            r3 = r11
            r6 = r14
            java.util.ArrayList r0 = r11.getProjectVersions(r0, r15, r13, r14)
            boolean r7 = r0.isEmpty()
            if (r7 != 0) goto L7f
            r7 = 0
            java.lang.Object r0 = r0.get(r7)
            r7 = r0
            ca.dnamobile.javalauncher.modmanager.ModrinthVersion r7 = (ca.dnamobile.javalauncher.modmanager.ModrinthVersion) r7
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r7
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            installVersion(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L7f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "No compatible CurseForge file found for "
            r1.<init>(r3)
            java.lang.String r3 = r5.title
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r3 = " (Minecraft "
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r13)
            java.lang.String r2 = ", "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = safeLoader(r14)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ")."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static void installSpecificVersion(ca.dnamobile.javalauncher.modmanager.CurseForgeApiClient r13, java.io.File r14, java.lang.String r15, java.lang.String r16, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r17, ca.dnamobile.javalauncher.modmanager.ModrinthProject r18, ca.dnamobile.javalauncher.modmanager.ModrinthVersion r19, ca.dnamobile.javalauncher.modmanager.ModrinthInstallManager.Listener r20) {
            r12 = r20
            java.lang.String r0 = "Installed "
            java.util.HashSet r9 = new java.util.HashSet     // Catch: java.lang.Throwable -> L48
            r9.<init>()     // Catch: java.lang.Throwable -> L48
            java.util.HashSet r10 = new java.util.HashSet     // Catch: java.lang.Throwable -> L48
            r10.<init>()     // Catch: java.lang.Throwable -> L48
            r8 = 0
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r11 = r20
            installVersion(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L48
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L48
            r0 = r18
            java.lang.String r0 = r0.title     // Catch: java.lang.Throwable -> L48
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L48
            r1 = r19
            java.lang.String r1 = r1.versionNumber     // Catch: java.lang.Throwable -> L48
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = "."
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L48
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L48
            r12.onComplete(r0)     // Catch: java.lang.Throwable -> L48
            goto L4c
        L48:
            r0 = move-exception
            r12.onError(r0)
        L4c:
            return
    }

    private static void installVersion(ca.dnamobile.javalauncher.modmanager.CurseForgeApiClient r17, java.io.File r18, java.lang.String r19, java.lang.String r20, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r21, ca.dnamobile.javalauncher.modmanager.ModrinthProject r22, ca.dnamobile.javalauncher.modmanager.ModrinthVersion r23, boolean r24, java.util.HashSet<java.lang.String> r25, java.util.HashSet<java.lang.String> r26, ca.dnamobile.javalauncher.modmanager.ModrinthInstallManager.Listener r27) throws java.lang.Exception {
            r9 = r17
            r10 = r18
            r11 = r21
            r12 = r22
            r13 = r23
            r14 = r27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r12.projectId
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ":"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r13.id
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r15 = r26
            boolean r0 = r15.add(r0)
            if (r0 != 0) goto L30
            return
        L30:
            if (r24 == 0) goto L4f
            java.lang.String r0 = r12.projectId
            boolean r0 = isProjectAlreadyInstalled(r10, r11, r0)
            if (r0 == 0) goto L4f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Dependency already installed: "
            r0.<init>(r1)
            java.lang.String r1 = r12.title
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.onStatus(r0)
            return
        L4f:
            boolean r0 = r21.supportsDependencies()
            if (r0 == 0) goto L83
            java.util.List<ca.dnamobile.javalauncher.modmanager.ModrinthDependency> r0 = r13.dependencies
            java.util.Iterator r16 = r0.iterator()
        L5b:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L83
            java.lang.Object r0 = r16.next()
            r5 = r0
            ca.dnamobile.javalauncher.modmanager.ModrinthDependency r5 = (ca.dnamobile.javalauncher.modmanager.ModrinthDependency) r5
            boolean r0 = r5.isRequired()
            if (r0 != 0) goto L6f
            goto L5b
        L6f:
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r6 = r25
            r7 = r26
            r8 = r27
            installDependency(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            goto L5b
        L83:
            ca.dnamobile.javalauncher.modmanager.ModrinthFile r5 = r23.getPrimaryFile()
            java.lang.String r0 = " "
            if (r5 == 0) goto L115
            java.lang.String r1 = r5.url
            java.lang.String r1 = r1.trim()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L115
            java.io.File r1 = r11.getTargetDirectory(r10)
            boolean r2 = r1.exists()
            if (r2 != 0) goto Lc1
            boolean r2 = r1.mkdirs()
            if (r2 == 0) goto La8
            goto Lc1
        La8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to create folder: "
            r2.<init>(r3)
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lc1:
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r2 = ca.dnamobile.javalauncher.modmanager.CurseForgeInstallManager.SOURCE
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
            java.lang.String r1 = " from CurseForge..."
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
        L115:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "No downloadable CurseForge file found for "
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
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = ca.dnamobile.javalauncher.modmanager.CurseForgeInstallManager.SOURCE
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
