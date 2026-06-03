package ca.dnamobile.javalauncher.modmanager;

/* JADX INFO: loaded from: classes.dex */
public final class ModManagerVersionResolver {
    private static final java.util.regex.Pattern NAMED_SNAPSHOT_PATTERN = null;
    private static final java.util.regex.Pattern RELEASE_VERSION_PATTERN = null;
    private static final java.util.regex.Pattern SNAPSHOT_VERSION_PATTERN = null;

    static {
            java.lang.String r0 = "(?<![0-9A-Za-z])([0-9]+(?:\\.[0-9]+){1,3})(?![0-9A-Za-z])"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            ca.dnamobile.javalauncher.modmanager.ModManagerVersionResolver.RELEASE_VERSION_PATTERN = r0
            java.lang.String r0 = "(?<![0-9A-Za-z])([0-9]{2}w[0-9]{2}[a-z])(?![0-9A-Za-z])"
            r1 = 2
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            ca.dnamobile.javalauncher.modmanager.ModManagerVersionResolver.SNAPSHOT_VERSION_PATTERN = r0
            java.lang.String r0 = "(?<![0-9A-Za-z])([0-9]+(?:\\.[0-9]+){1,3}-(?:pre|rc)[0-9]+)(?![0-9A-Za-z])"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            ca.dnamobile.javalauncher.modmanager.ModManagerVersionResolver.NAMED_SNAPSHOT_PATTERN = r0
            return
    }

    private ModManagerVersionResolver() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String findFirstMinecraftReleaseVersion(java.lang.String r2) {
            java.util.regex.Pattern r0 = ca.dnamobile.javalauncher.modmanager.ModManagerVersionResolver.RELEASE_VERSION_PATTERN
            java.util.regex.Matcher r2 = r0.matcher(r2)
        L6:
            boolean r0 = r2.find()
            if (r0 == 0) goto L18
            r0 = 1
            java.lang.String r0 = r2.group(r0)
            boolean r1 = isMinecraftReleaseVersion(r0)
            if (r1 == 0) goto L6
            return r0
        L18:
            java.lang.String r2 = ""
            return r2
    }

    private static java.lang.String findLastMinecraftReleaseVersion(java.lang.String r3) {
            java.util.regex.Pattern r0 = ca.dnamobile.javalauncher.modmanager.ModManagerVersionResolver.RELEASE_VERSION_PATTERN
            java.util.regex.Matcher r3 = r0.matcher(r3)
            java.lang.String r0 = ""
        L8:
            boolean r1 = r3.find()
            if (r1 == 0) goto L1b
            r1 = 1
            java.lang.String r1 = r3.group(r1)
            boolean r2 = isMinecraftReleaseVersion(r1)
            if (r2 == 0) goto L8
            r0 = r1
            goto L8
        L1b:
            return r0
    }

    private static java.lang.String findNamedSnapshotVersion(java.lang.String r1) {
            java.util.regex.Pattern r0 = ca.dnamobile.javalauncher.modmanager.ModManagerVersionResolver.NAMED_SNAPSHOT_PATTERN
            java.util.regex.Matcher r1 = r0.matcher(r1)
            boolean r0 = r1.find()
            if (r0 == 0) goto L12
            r0 = 1
            java.lang.String r1 = r1.group(r0)
            goto L14
        L12:
            java.lang.String r1 = ""
        L14:
            return r1
    }

    private static java.lang.String findWeeklySnapshotVersion(java.lang.String r1) {
            java.util.regex.Pattern r0 = ca.dnamobile.javalauncher.modmanager.ModManagerVersionResolver.SNAPSHOT_VERSION_PATTERN
            java.util.regex.Matcher r1 = r0.matcher(r1)
            boolean r0 = r1.find()
            if (r0 == 0) goto L12
            r0 = 1
            java.lang.String r1 = r1.group(r0)
            goto L14
        L12:
            java.lang.String r1 = ""
        L14:
            return r1
    }

    private static boolean isMinecraftReleaseVersion(java.lang.String r3) {
            r0 = 0
            if (r3 == 0) goto L30
            java.lang.String r1 = r3.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto Le
            goto L30
        Le:
            java.lang.String r3 = r3.trim()
            java.lang.String r1 = "\\."
            java.lang.String[] r3 = r3.split(r1)
            int r1 = r3.length
            r2 = 2
            if (r1 >= r2) goto L1d
            return r0
        L1d:
            r3 = r3[r0]     // Catch: java.lang.NumberFormatException -> L30
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L30
            r1 = 1
            if (r3 != r1) goto L27
            return r1
        L27:
            r2 = 20
            if (r3 < r2) goto L30
            r2 = 39
            if (r3 > r2) goto L30
            r0 = r1
        L30:
            return r0
    }

    public static java.lang.String resolveGameVersionForContent(java.lang.String r2) {
            java.lang.String r0 = ""
            if (r2 != 0) goto L5
            return r0
        L5:
            java.lang.String r2 = r2.trim()
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L10
            return r0
        L10:
            java.lang.String r0 = findNamedSnapshotVersion(r2)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L1b
            return r0
        L1b:
            java.lang.String r0 = findWeeklySnapshotVersion(r2)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L26
            return r0
        L26:
            java.lang.String r0 = resolveKnownProfileFormat(r2)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L37
            boolean r1 = isMinecraftReleaseVersion(r0)
            if (r1 == 0) goto L37
            return r0
        L37:
            java.lang.String r0 = findFirstMinecraftReleaseVersion(r2)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L42
            return r0
        L42:
            return r2
    }

    private static java.lang.String resolveKnownProfileFormat(java.lang.String r4) {
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r4.toLowerCase(r0)
            java.lang.String r1 = "fabric-loader-"
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L16
            java.lang.String r1 = "quilt-loader-"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L21
        L16:
            java.lang.String r1 = findLastMinecraftReleaseVersion(r4)
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L21
            return r1
        L21:
            java.lang.String r1 = "-forge-"
            int r1 = r0.indexOf(r1)
            r2 = 0
            if (r1 <= 0) goto L3d
            java.lang.String r1 = r4.substring(r2, r1)
            java.lang.String r1 = r1.trim()
            java.lang.String r1 = findFirstMinecraftReleaseVersion(r1)
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L3d
            return r1
        L3d:
            java.lang.String r1 = "-neoforge-"
            int r0 = r0.indexOf(r1)
            if (r0 <= 0) goto L58
            java.lang.String r4 = r4.substring(r2, r0)
            java.lang.String r4 = r4.trim()
            java.lang.String r4 = findFirstMinecraftReleaseVersion(r4)
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L58
            return r4
        L58:
            java.lang.String r4 = ""
            return r4
    }
}
