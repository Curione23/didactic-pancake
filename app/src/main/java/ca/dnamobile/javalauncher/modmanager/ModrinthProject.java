package ca.dnamobile.javalauncher.modmanager;

/* JADX INFO: loaded from: classes.dex */
public class ModrinthProject {
    public java.lang.String author;
    public java.lang.String body;
    public java.util.ArrayList<java.lang.String> categories;
    public java.lang.String dateModified;
    public java.lang.String description;
    public long downloads;
    public long followers;
    public java.util.ArrayList<java.lang.String> galleryUrls;
    public java.util.ArrayList<java.lang.String> gameVersions;
    public java.lang.String iconUrl;
    public java.util.ArrayList<java.lang.String> loaders;
    public java.lang.String projectId;
    public java.lang.String projectType;
    public java.lang.String slug;
    public ca.dnamobile.javalauncher.modmanager.ModManagerSource source;
    public java.lang.String title;
    public java.lang.String websiteUrl;

    public ModrinthProject() {
            r4 = this;
            r4.<init>()
            java.lang.String r0 = ""
            r4.projectId = r0
            r4.slug = r0
            r4.title = r0
            r4.description = r0
            r1 = 0
            r4.author = r1
            r4.iconUrl = r1
            r4.body = r0
            java.lang.String r0 = "mod"
            r4.projectType = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.categories = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.galleryUrls = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.gameVersions = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.loaders = r0
            r2 = 0
            r4.downloads = r2
            r4.followers = r2
            r4.dateModified = r1
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.MODRINTH
            r4.source = r0
            r4.websiteUrl = r1
            return
    }

    public ModrinthProject(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, long r25, long r27, java.lang.String r29, java.util.ArrayList<java.lang.String> r30, java.util.ArrayList<java.lang.String> r31) {
            r16 = this;
            r14 = r16
            r15 = r31
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r13 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.MODRINTH
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r30
            r8 = r25
            r10 = r27
            r12 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r12, r13)
            java.lang.String r0 = safe(r23)
            r14.body = r0
            if (r15 == 0) goto L2c
            java.util.ArrayList<java.lang.String> r0 = r14.galleryUrls
            r0.addAll(r15)
        L2c:
            r0 = 5
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            r0[r1] = r22
            r1 = 1
            r0[r1] = r23
            r1 = 2
            r0[r1] = r24
            r1 = 3
            r0[r1] = r21
            java.util.ArrayList<java.lang.String> r1 = r14.galleryUrls
            java.lang.String r1 = firstGalleryUrl(r1)
            r2 = 4
            r0[r2] = r1
            java.lang.String r0 = firstImageUrl(r0)
            r14.iconUrl = r0
            java.lang.String r0 = normalizeProjectType(r24)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L56
            r14.projectType = r0
        L56:
            r16.inferProjectTypeFromCategories()
            return
    }

    public ModrinthProject(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, long r25, long r27, java.lang.String r29, java.util.ArrayList<java.lang.String> r30, java.util.ArrayList<java.lang.String> r31, ca.dnamobile.javalauncher.modmanager.ModManagerSource r32, java.lang.String r33) {
            r16 = this;
            r14 = r16
            r15 = r31
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r30
            r8 = r25
            r10 = r27
            r12 = r29
            r13 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r12, r13)
            java.lang.String r0 = safe(r23)
            r14.body = r0
            if (r15 == 0) goto L2c
            java.util.ArrayList<java.lang.String> r0 = r14.galleryUrls
            r0.addAll(r15)
        L2c:
            r0 = 5
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            r0[r1] = r22
            r1 = 1
            r0[r1] = r23
            r1 = 2
            r0[r1] = r24
            r1 = 3
            r0[r1] = r21
            java.util.ArrayList<java.lang.String> r1 = r14.galleryUrls
            java.lang.String r1 = firstGalleryUrl(r1)
            r2 = 4
            r0[r2] = r1
            java.lang.String r0 = firstImageUrl(r0)
            r14.iconUrl = r0
            java.lang.String r0 = normalizeProjectType(r24)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L56
            r14.projectType = r0
        L56:
            r0 = r33
            r14.websiteUrl = r0
            r16.inferProjectTypeFromCategories()
            return
    }

    public ModrinthProject(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.util.List<java.lang.String> r13, long r14, long r16, java.lang.String r18, ca.dnamobile.javalauncher.modmanager.ModManagerSource r19) {
            r6 = this;
            r0 = r6
            r1 = r13
            r6.<init>()
            java.lang.String r2 = ""
            r0.projectId = r2
            r0.slug = r2
            r0.title = r2
            r0.description = r2
            r3 = 0
            r0.author = r3
            r0.iconUrl = r3
            r0.body = r2
            java.lang.String r2 = "mod"
            r0.projectType = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.categories = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.galleryUrls = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.gameVersions = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.loaders = r2
            r4 = 0
            r0.downloads = r4
            r0.followers = r4
            r0.dateModified = r3
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r2 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.MODRINTH
            r0.source = r2
            r0.websiteUrl = r3
            java.lang.String r2 = safe(r7)
            r0.projectId = r2
            java.lang.String r2 = safe(r8)
            r0.slug = r2
            java.lang.String r2 = safe(r9)
            r0.title = r2
            java.lang.String r2 = safe(r10)
            r0.description = r2
            r2 = r11
            r0.author = r2
            java.lang.String r2 = normalizeIconUrl(r12)
            r0.iconUrl = r2
            if (r1 == 0) goto L6c
            java.util.ArrayList<java.lang.String> r2 = r0.categories
            r2.addAll(r13)
        L6c:
            r1 = r14
            r0.downloads = r1
            r1 = r16
            r0.followers = r1
            r1 = r18
            r0.dateModified = r1
            r1 = r19
            r0.source = r1
            r6.inferProjectTypeFromCategories()
            return
    }

    private boolean categoriesContain(java.lang.String r3) {
            r2 = this;
            java.util.ArrayList<java.lang.String> r0 = r2.categories
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L6
            java.lang.String r1 = r1.trim()
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 == 0) goto L6
            r3 = 1
            return r3
        L20:
            r3 = 0
            return r3
    }

    private static java.lang.String firstGalleryUrl(java.util.ArrayList<java.lang.String> r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.util.Iterator r2 = r2.iterator()
        L8:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = normalizeIconUrl(r1)
            if (r1 == 0) goto L8
            return r1
        L1b:
            return r0
    }

    private static java.lang.String firstImageUrl(java.lang.String... r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r4.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L14
            r3 = r4[r2]
            java.lang.String r3 = normalizeIconUrl(r3)
            if (r3 == 0) goto L11
            return r3
        L11:
            int r2 = r2 + 1
            goto L6
        L14:
            return r0
    }

    private void inferProjectTypeFromCategories() {
            r2 = this;
            java.lang.String r0 = "modpack"
            boolean r1 = r2.categoriesContain(r0)
            if (r1 != 0) goto L48
            java.lang.String r1 = "modpacks"
            boolean r1 = r2.categoriesContain(r1)
            if (r1 == 0) goto L11
            goto L48
        L11:
            java.lang.String r0 = "resourcepack"
            boolean r1 = r2.categoriesContain(r0)
            if (r1 != 0) goto L45
            java.lang.String r1 = "resourcepacks"
            boolean r1 = r2.categoriesContain(r1)
            if (r1 == 0) goto L22
            goto L45
        L22:
            java.lang.String r0 = "shader"
            boolean r0 = r2.categoriesContain(r0)
            java.lang.String r1 = "shaderpack"
            if (r0 != 0) goto L42
            java.lang.String r0 = "shaders"
            boolean r0 = r2.categoriesContain(r0)
            if (r0 != 0) goto L42
            boolean r0 = r2.categoriesContain(r1)
            if (r0 != 0) goto L42
            java.lang.String r0 = "shaderpacks"
            boolean r0 = r2.categoriesContain(r0)
            if (r0 == 0) goto L44
        L42:
            r2.projectType = r1
        L44:
            return
        L45:
            r2.projectType = r0
            return
        L48:
            r2.projectType = r0
            return
    }

    private static java.lang.String normalizeIconUrl(java.lang.String r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r3 = r3.trim()
            java.lang.String r1 = "\""
            boolean r2 = r3.startsWith(r1)
            if (r2 == 0) goto L16
            boolean r1 = r3.endsWith(r1)
            if (r1 != 0) goto L24
        L16:
            java.lang.String r1 = "'"
            boolean r2 = r3.startsWith(r1)
            if (r2 == 0) goto L32
            boolean r1 = r3.endsWith(r1)
            if (r1 == 0) goto L32
        L24:
            int r1 = r3.length()
            r2 = 1
            int r1 = r1 - r2
            java.lang.String r3 = r3.substring(r2, r1)
            java.lang.String r3 = r3.trim()
        L32:
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L6a
            java.lang.String r1 = "null"
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 == 0) goto L41
            goto L6a
        L41:
            java.lang.String r1 = "//"
            boolean r1 = r3.startsWith(r1)
            if (r1 == 0) goto L59
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "https:"
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            return r3
        L59:
            java.lang.String r1 = "http://"
            boolean r1 = r3.startsWith(r1)
            if (r1 != 0) goto L69
            java.lang.String r1 = "https://"
            boolean r1 = r3.startsWith(r1)
            if (r1 == 0) goto L6a
        L69:
            r0 = r3
        L6a:
            return r0
    }

    private static java.lang.String normalizeProjectType(java.lang.String r6) {
            java.lang.String r0 = ""
            if (r6 != 0) goto L5
            return r0
        L5:
            java.lang.String r6 = r6.trim()
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r6 = r6.toLowerCase(r1)
            r1 = 95
            r2 = 45
            java.lang.String r6 = r6.replace(r1, r2)
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto Lb0
            java.lang.String r1 = "http://"
            boolean r1 = r6.startsWith(r1)
            if (r1 != 0) goto Lb0
            java.lang.String r1 = "https://"
            boolean r1 = r6.startsWith(r1)
            if (r1 != 0) goto Lb0
            java.lang.String r1 = "null"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L37
            goto Lb0
        L37:
            java.lang.String r1 = "mods"
            boolean r1 = r1.equals(r6)
            java.lang.String r2 = "mod"
            if (r1 == 0) goto L42
            return r2
        L42:
            java.lang.String r1 = "modpacks"
            boolean r1 = r1.equals(r6)
            java.lang.String r3 = "modpack"
            if (r1 == 0) goto L4d
            return r3
        L4d:
            java.lang.String r1 = "resourcepacks"
            boolean r1 = r1.equals(r6)
            java.lang.String r4 = "resourcepack"
            if (r1 != 0) goto Laf
            java.lang.String r1 = "resource-pack"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto Laf
            java.lang.String r1 = "resource-packs"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L68
            goto Laf
        L68:
            java.lang.String r1 = "shader"
            boolean r1 = r1.equals(r6)
            java.lang.String r5 = "shaderpack"
            if (r1 != 0) goto Lae
            java.lang.String r1 = "shaders"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto Lae
            java.lang.String r1 = "shaderpacks"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto Lae
            java.lang.String r1 = "shader-pack"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto Lae
            java.lang.String r1 = "shader-packs"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L93
            goto Lae
        L93:
            boolean r1 = r2.equals(r6)
            if (r1 != 0) goto Lad
            boolean r1 = r3.equals(r6)
            if (r1 != 0) goto Lad
            boolean r1 = r4.equals(r6)
            if (r1 != 0) goto Lad
            boolean r1 = r5.equals(r6)
            if (r1 == 0) goto Lac
            goto Lad
        Lac:
            return r0
        Lad:
            return r6
        Lae:
            return r5
        Laf:
            return r4
        Lb0:
            return r0
    }

    private static java.lang.String safe(java.lang.String r0) {
            if (r0 != 0) goto L4
            java.lang.String r0 = ""
        L4:
            return r0
    }

    public java.lang.String getWebsiteUrl() {
            r5 = this;
            java.lang.String r0 = r5.websiteUrl
            if (r0 == 0) goto L15
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L15
            java.lang.String r0 = r5.websiteUrl
            java.lang.String r0 = r0.trim()
            return r0
        L15:
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = r5.source
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r1 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.CURSEFORGE
            java.lang.String r2 = "/"
            if (r0 != r1) goto L81
            java.lang.String r0 = r5.slug
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L36
            java.lang.String r0 = r5.slug
            java.lang.String r1 = "http"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L36
            java.lang.String r0 = r5.slug
            return r0
        L36:
            java.lang.String r0 = r5.slug
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L67
            boolean r0 = r5.isModpack()
            if (r0 == 0) goto L4b
            java.lang.String r0 = "modpacks"
            goto L4d
        L4b:
            java.lang.String r0 = "mc-mods"
        L4d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "https://www.curseforge.com/minecraft/"
            r1.<init>(r3)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r1 = r5.slug
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L67:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "https://www.curseforge.com/minecraft/search?search="
            r0.<init>(r1)
            java.lang.String r1 = r5.title
            r2 = 32
            r3 = 43
            java.lang.String r1 = r1.replace(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L81:
            java.lang.String r0 = r5.slug
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L90
            java.lang.String r0 = r5.slug
            goto L92
        L90:
            java.lang.String r0 = r5.projectId
        L92:
            boolean r1 = r5.isModpack()
            if (r1 == 0) goto L9b
            java.lang.String r1 = "modpack"
            goto L9d
        L9b:
            java.lang.String r1 = "mod"
        L9d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "https://modrinth.com/"
            r3.<init>(r4)
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public boolean isModpack() {
            r2 = this;
            java.lang.String r0 = r2.projectType
            java.lang.String r1 = "modpack"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L1b
            boolean r0 = r2.categoriesContain(r1)
            if (r0 != 0) goto L1b
            java.lang.String r0 = "modpacks"
            boolean r0 = r2.categoriesContain(r0)
            if (r0 == 0) goto L19
            goto L1b
        L19:
            r0 = 0
            goto L1c
        L1b:
            r0 = 1
        L1c:
            return r0
    }

    public java.lang.String normalizedTitleKey() {
            r2 = this;
            java.lang.String r0 = r2.title
            java.lang.String r0 = r0.trim()
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r1)
            return r0
    }
}
