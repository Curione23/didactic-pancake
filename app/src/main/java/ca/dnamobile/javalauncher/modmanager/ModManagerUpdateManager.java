package ca.dnamobile.javalauncher.modmanager;

/* JADX INFO: loaded from: classes.dex */
public final class ModManagerUpdateManager {


    public interface Listener {
        void onProgress(int r1, int r2);

        void onStatus(java.lang.String r1);
    }

    public static final class UpdateCandidate {
        public final ca.dnamobile.javalauncher.modmanager.ModManagerContentType contentType;
        public final java.lang.String currentVersionId;
        public final java.lang.String currentVersionNumber;
        public final org.json.JSONObject entry;
        public final ca.dnamobile.javalauncher.modmanager.ModrinthVersion latestVersion;
        public final ca.dnamobile.javalauncher.modmanager.ModrinthProject project;
        public final ca.dnamobile.javalauncher.modmanager.ModManagerSource source;

        UpdateCandidate(org.json.JSONObject r1, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2, ca.dnamobile.javalauncher.modmanager.ModManagerSource r3, ca.dnamobile.javalauncher.modmanager.ModrinthProject r4, ca.dnamobile.javalauncher.modmanager.ModrinthVersion r5, java.lang.String r6, java.lang.String r7) {
                r0 = this;
                r0.<init>()
                r0.entry = r1
                r0.contentType = r2
                r0.source = r3
                r0.project = r4
                r0.latestVersion = r5
                r0.currentVersionId = r6
                r0.currentVersionNumber = r7
                return
        }

        public java.lang.String getDisplayName() {
                r3 = this;
                org.json.JSONObject r0 = r3.entry
                java.lang.String r1 = "title"
                java.lang.String r2 = ""
                java.lang.String r0 = r0.optString(r1, r2)
                java.lang.String r0 = r0.trim()
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L18
                ca.dnamobile.javalauncher.modmanager.ModrinthProject r0 = r3.project
                java.lang.String r0 = r0.title
            L18:
                return r0
        }

        public java.lang.String getProjectId() {
                r3 = this;
                org.json.JSONObject r0 = r3.entry
                java.lang.String r1 = "platformProjectId"
                java.lang.String r2 = ""
                java.lang.String r0 = r0.optString(r1, r2)
                java.lang.String r0 = r0.trim()
                boolean r1 = r0.isEmpty()
                if (r1 != 0) goto L15
                return r0
            L15:
                org.json.JSONObject r0 = r3.entry
                java.lang.String r1 = "projectId"
                java.lang.String r0 = r0.optString(r1, r2)
                java.lang.String r0 = r0.trim()
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L2b
                ca.dnamobile.javalauncher.modmanager.ModrinthProject r0 = r3.project
                java.lang.String r0 = r0.projectId
            L2b:
                return r0
        }
    }

    private ModManagerUpdateManager() {
            r0 = this;
            r0.<init>()
            return
    }

    public static ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.UpdateCandidate checkUpdateForEntry(android.content.Context r17, java.io.File r18, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r19, org.json.JSONObject r20, java.lang.String r21, java.lang.String r22) throws java.lang.Exception {
            r1 = r20
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r3 = ca.dnamobile.javalauncher.modmanager.ModManagerManifest.getSource(r20)
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.MODRINTH
            r2 = 0
            if (r3 == r0) goto L10
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.CURSEFORGE
            if (r3 == r0) goto L10
            return r2
        L10:
            java.lang.String r0 = "platformProjectId"
            java.lang.String r4 = ""
            java.lang.String r0 = r1.optString(r0, r4)
            java.lang.String r0 = r0.trim()
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L2c
            java.lang.String r0 = "projectId"
            java.lang.String r0 = r1.optString(r0, r4)
            java.lang.String r0 = r0.trim()
        L2c:
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L33
            return r2
        L33:
            java.lang.String r5 = "platformVersionId"
            java.lang.String r5 = r1.optString(r5, r4)
            java.lang.String r5 = r5.trim()
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L4d
            java.lang.String r5 = "versionId"
            java.lang.String r5 = r1.optString(r5, r4)
            java.lang.String r5 = r5.trim()
        L4d:
            r6 = r5
            java.lang.String r5 = "versionNumber"
            java.lang.String r5 = r1.optString(r5, r4)
            java.lang.String r7 = r5.trim()
            java.lang.String r5 = "sha1"
            java.lang.String r5 = r1.optString(r5, r4)
            java.lang.String r5 = r5.trim()
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r5 = r5.toLowerCase(r8)
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r8 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.CURSEFORGE
            if (r3 != r8) goto L84
            ca.dnamobile.javalauncher.modmanager.CurseForgeApiClient r8 = new ca.dnamobile.javalauncher.modmanager.CurseForgeApiClient
            r9 = r17
            r8.<init>(r9)
            ca.dnamobile.javalauncher.modmanager.ModrinthProject r0 = r8.getProject(r0)
            java.lang.String r9 = r0.projectId
            r15 = r19
            r13 = r21
            r14 = r22
            java.util.ArrayList r8 = r8.getProjectVersions(r9, r15, r13, r14)
            goto La2
        L84:
            r15 = r19
            r13 = r21
            r14 = r22
            ca.dnamobile.javalauncher.modmanager.ModrinthApiClient r10 = new ca.dnamobile.javalauncher.modmanager.ModrinthApiClient
            r10.<init>()
            java.lang.String r8 = "slug"
            java.lang.String r8 = r1.optString(r8, r4)
            ca.dnamobile.javalauncher.modmanager.ModrinthProject r0 = r10.getProjectWithFallback(r0, r8)
            r8 = 0
            r11 = r0
            r12 = r19
            r15 = r8
            java.util.ArrayList r8 = r10.getProjectVersionsWithFallback(r11, r12, r13, r14, r15)
        La2:
            r16 = r8
            r8 = r0
            r0 = r16
            boolean r9 = r0.isEmpty()
            if (r9 == 0) goto Lae
            return r2
        Lae:
            r9 = 0
            java.lang.Object r0 = r0.get(r9)
            r10 = r0
            ca.dnamobile.javalauncher.modmanager.ModrinthVersion r10 = (ca.dnamobile.javalauncher.modmanager.ModrinthVersion) r10
            ca.dnamobile.javalauncher.modmanager.ModrinthFile r0 = r10.getPrimaryFile()
            if (r0 == 0) goto Lcc
            java.lang.String r11 = r0.sha1
            if (r11 == 0) goto Lcc
            java.lang.String r0 = r0.sha1
            java.lang.String r0 = r0.trim()
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r4 = r0.toLowerCase(r4)
        Lcc:
            boolean r0 = r6.isEmpty()
            r11 = 1
            if (r0 != 0) goto Ldd
            java.lang.String r0 = r10.id
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Ldd
            r0 = r11
            goto Lde
        Ldd:
            r0 = r9
        Lde:
            boolean r12 = r5.isEmpty()
            if (r12 != 0) goto Lf1
            boolean r12 = r4.isEmpty()
            if (r12 != 0) goto Lf1
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto Lf1
            r9 = r11
        Lf1:
            if (r0 != 0) goto L103
            if (r9 == 0) goto Lf6
            goto L103
        Lf6:
            ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager$UpdateCandidate r9 = new ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager$UpdateCandidate
            r0 = r9
            r1 = r20
            r2 = r19
            r4 = r8
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L103:
            return r2
    }

    public static java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.UpdateCandidate> checkUpdates(android.content.Context r12, java.io.File r13, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r14, java.lang.String r15, java.lang.String r16, ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.Listener r17) throws java.lang.Exception {
            r0 = r17
            java.util.ArrayList r1 = ca.dnamobile.javalauncher.modmanager.ModManagerManifest.getInstalledEntries(r13, r14)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r1.size()
            r4 = 0
        L10:
            int r5 = r1.size()
            if (r4 >= r5) goto L63
            java.lang.Object r5 = r1.get(r4)
            r9 = r5
            org.json.JSONObject r9 = (org.json.JSONObject) r9
            if (r0 == 0) goto L29
            int r5 = r4 + 1
            r6 = 1
            int r6 = java.lang.Math.max(r6, r3)
            r0.onProgress(r5, r6)
        L29:
            java.lang.String r5 = "fileName"
            java.lang.String r6 = "content"
            java.lang.String r5 = r9.optString(r5, r6)
            java.lang.String r6 = "title"
            java.lang.String r5 = r9.optString(r6, r5)
            if (r0 == 0) goto L51
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Checking "
            r6.<init>(r7)
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.String r6 = "..."
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r0.onStatus(r5)
        L51:
            r6 = r12
            r7 = r13
            r8 = r14
            r10 = r15
            r11 = r16
            ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager$UpdateCandidate r5 = checkUpdateForEntry(r6, r7, r8, r9, r10, r11)
            if (r5 == 0) goto L60
            r2.add(r5)
        L60:
            int r4 = r4 + 1
            goto L10
        L63:
            if (r0 == 0) goto L88
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L6e
            java.lang.String r1 = "No updates found."
            goto L85
        L6e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r3 = r2.size()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r3 = " update(s) available."
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
        L85:
            r0.onStatus(r1)
        L88:
            return r2
    }

    public static void updateAll(android.content.Context r9, java.io.File r10, java.lang.String r11, java.lang.String r12, java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.UpdateCandidate> r13, ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.Listener r14) throws java.lang.Exception {
            r0 = 0
        L1:
            int r1 = r13.size()
            if (r0 >= r1) goto La3
            java.lang.Object r1 = r13.get(r0)
            ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager$UpdateCandidate r1 = (ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.UpdateCandidate) r1
            if (r14 == 0) goto L39
            int r2 = r0 + 1
            int r3 = r13.size()
            r4 = 1
            int r3 = java.lang.Math.max(r4, r3)
            r14.onProgress(r2, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Updating "
            r2.<init>(r3)
            java.lang.String r3 = r1.getDisplayName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "..."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r14.onStatus(r2)
        L39:
            java.util.concurrent.atomic.AtomicReference r8 = new java.util.concurrent.atomic.AtomicReference
            r8.<init>()
            ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager$1 r7 = new ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager$1
            r7.<init>(r14, r8)
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r1
            updateCandidate(r2, r3, r4, r5, r6, r7)
            java.lang.Object r2 = r8.get()
            if (r2 == 0) goto L9f
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Failed to update "
            r10.<init>(r11)
            java.lang.String r11 = r1.getDisplayName()
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r11 = ": "
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.Object r11 = r8.get()
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            java.lang.String r11 = r11.getMessage()
            if (r11 == 0) goto L7f
            java.lang.Object r11 = r8.get()
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            java.lang.String r11 = r11.getMessage()
            goto L8d
        L7f:
            java.lang.Object r11 = r8.get()
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            java.lang.Class r11 = r11.getClass()
            java.lang.String r11 = r11.getSimpleName()
        L8d:
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.Object r11 = r8.get()
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            r9.<init>(r10, r11)
            throw r9
        L9f:
            int r0 = r0 + 1
            goto L1
        La3:
            return
    }

    public static void updateCandidate(android.content.Context r17, java.io.File r18, java.lang.String r19, java.lang.String r20, ca.dnamobile.javalauncher.modmanager.ModManagerUpdateManager.UpdateCandidate r21, ca.dnamobile.javalauncher.modmanager.ModrinthInstallManager.Listener r22) {
            r0 = r21
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r1 = r0.source
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r2 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.CURSEFORGE
            if (r1 != r2) goto L21
            ca.dnamobile.javalauncher.modmanager.CurseForgeApiClient r3 = new ca.dnamobile.javalauncher.modmanager.CurseForgeApiClient
            r1 = r17
            r3.<init>(r1)
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r7 = r0.contentType
            ca.dnamobile.javalauncher.modmanager.ModrinthProject r8 = r0.project
            ca.dnamobile.javalauncher.modmanager.ModrinthVersion r9 = r0.latestVersion
            r4 = r18
            r5 = r19
            r6 = r20
            r10 = r22
            ca.dnamobile.javalauncher.modmanager.CurseForgeInstallManager.installSpecificVersion(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L32
        L21:
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r13 = r0.contentType
            ca.dnamobile.javalauncher.modmanager.ModrinthProject r14 = r0.project
            ca.dnamobile.javalauncher.modmanager.ModrinthVersion r15 = r0.latestVersion
            r10 = r18
            r11 = r19
            r12 = r20
            r16 = r22
            ca.dnamobile.javalauncher.modmanager.ModrinthInstallManager.installSpecificVersion(r10, r11, r12, r13, r14, r15, r16)
        L32:
            return
    }
}
