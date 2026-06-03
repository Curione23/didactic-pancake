package ca.dnamobile.javalauncher.modmanager;

/* JADX INFO: loaded from: classes.dex */
public final class ModrinthDependency {
    public final java.lang.String dependencyType;
    public final java.lang.String fileName;
    public final java.lang.String projectId;
    public final java.lang.String versionId;

    public ModrinthDependency(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            java.lang.String r1 = emptyToNull(r1)
            r0.versionId = r1
            java.lang.String r1 = emptyToNull(r2)
            r0.projectId = r1
            java.lang.String r1 = emptyToNull(r3)
            r0.fileName = r1
            r0.dependencyType = r4
            return
    }

    private static java.lang.String emptyToNull(java.lang.String r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r2 = r2.trim()
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L18
            java.lang.String r1 = "null"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L17
            goto L18
        L17:
            return r2
        L18:
            return r0
    }

    public boolean isRequired() {
            r2 = this;
            java.lang.String r0 = "required"
            java.lang.String r1 = r2.dependencyType
            boolean r0 = r0.equalsIgnoreCase(r1)
            return r0
    }
}
