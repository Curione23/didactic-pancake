package ca.dnamobile.javalauncher.ui.instance;

/* JADX INFO: loaded from: classes.dex */
public final class InstanceIconResolver {
    private InstanceIconResolver() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getDefaultIcon(ca.dnamobile.javalauncher.instance.LauncherInstance r3) {
            java.lang.String r0 = r3.getLoader()
            java.lang.String r1 = r3.getBaseVersionId()
            java.lang.String r2 = r3.getMinecraftVersionId()
            java.lang.String r3 = r3.getName()
            int r3 = getDefaultIcon(r0, r1, r2, r3)
            return r3
    }

    public static int getDefaultIcon(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = normalize(r1)
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.String r0 = " "
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r2 = normalize(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r2 = normalize(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r2 = normalize(r4)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "neoforge"
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto L61
            java.lang.String r2 = "neo forge"
            boolean r2 = r1.contains(r2)
            if (r2 == 0) goto L48
            goto L61
        L48:
            java.lang.String r2 = "forge"
            boolean r2 = r1.contains(r2)
            if (r2 == 0) goto L53
            int r1 = ca.dnamobile.javalauncher.R.drawable.ic_forge
            return r1
        L53:
            java.lang.String r2 = "fabric"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L5e
            int r1 = ca.dnamobile.javalauncher.R.drawable.ic_fabric
            return r1
        L5e:
            int r1 = ca.dnamobile.javalauncher.R.drawable.ic_old_grass_block
            return r1
        L61:
            int r1 = ca.dnamobile.javalauncher.R.drawable.ic_neoforge
            return r1
    }

    private static java.lang.String normalize(java.lang.String r1) {
            if (r1 != 0) goto L5
            java.lang.String r1 = ""
            return r1
        L5:
            java.lang.String r1 = r1.trim()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r0)
            return r1
    }
}
