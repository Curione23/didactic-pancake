package ca.dnamobile.javalauncher.modmanager;

/* JADX INFO: loaded from: classes.dex */
public final class ModrinthVersion {
    public final java.lang.String changelog;
    public final java.lang.String datePublished;
    public final java.util.List<ca.dnamobile.javalauncher.modmanager.ModrinthDependency> dependencies;
    public final long downloads;
    public final java.util.List<ca.dnamobile.javalauncher.modmanager.ModrinthFile> files;
    public final java.util.List<java.lang.String> gameVersions;
    public final java.lang.String id;
    public final java.util.List<java.lang.String> loaders;
    public final java.lang.String name;
    public final java.lang.String projectId;
    public final java.lang.String versionNumber;
    public final java.lang.String versionType;

    public ModrinthVersion(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, long r8, java.util.List<java.lang.String> r10, java.util.List<java.lang.String> r11, java.util.List<ca.dnamobile.javalauncher.modmanager.ModrinthDependency> r12, java.util.List<ca.dnamobile.javalauncher.modmanager.ModrinthFile> r13) {
            r0 = this;
            r0.<init>()
            r0.id = r1
            r0.projectId = r2
            r0.name = r3
            r0.versionNumber = r4
            r0.versionType = r5
            r0.datePublished = r6
            r0.changelog = r7
            r0.downloads = r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r10)
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r0.gameVersions = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r11)
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r0.loaders = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r12)
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r0.dependencies = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r13)
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r0.files = r1
            return
    }

    public ca.dnamobile.javalauncher.modmanager.ModrinthFile getPrimaryFile() {
            r3 = this;
            java.util.List<ca.dnamobile.javalauncher.modmanager.ModrinthFile> r0 = r3.files
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L17
            java.lang.Object r1 = r0.next()
            ca.dnamobile.javalauncher.modmanager.ModrinthFile r1 = (ca.dnamobile.javalauncher.modmanager.ModrinthFile) r1
            boolean r2 = r1.primary
            if (r2 == 0) goto L6
            return r1
        L17:
            java.util.List<ca.dnamobile.javalauncher.modmanager.ModrinthFile> r0 = r3.files
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L21
            r0 = 0
            goto L2a
        L21:
            java.util.List<ca.dnamobile.javalauncher.modmanager.ModrinthFile> r0 = r3.files
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            ca.dnamobile.javalauncher.modmanager.ModrinthFile r0 = (ca.dnamobile.javalauncher.modmanager.ModrinthFile) r0
        L2a:
            return r0
    }
}
