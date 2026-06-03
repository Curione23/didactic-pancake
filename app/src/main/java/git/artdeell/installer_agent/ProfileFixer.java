package git.artdeell.installer_agent;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/forge_installer.jar:git/artdeell/installer_agent/ProfileFixer.class */
public class ProfileFixer {
    private static final java.util.Random random = null;
    private static final java.nio.file.Path profilesPath = null;
    private static org.json.JSONObject oldProfile;

    public ProfileFixer() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void storeProfile(java.lang.String r7) {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L38
            r1 = r0
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L38
            r3 = r2
            java.nio.file.Path r4 = git.artdeell.installer_agent.ProfileFixer.profilesPath     // Catch: java.lang.Throwable -> L38
            byte[] r4 = java.nio.file.Files.readAllBytes(r4)     // Catch: java.lang.Throwable -> L38
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L38
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L38
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L38
            r8 = r0
            r0 = r8
            java.lang.String r1 = "profiles"
            org.json.JSONObject r0 = r0.getJSONObject(r1)     // Catch: java.lang.Throwable -> L38
            r9 = r0
            r0 = r7
            r1 = r9
            java.lang.String r0 = findProfileName(r0, r1)     // Catch: java.lang.Throwable -> L38
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L31
            r0 = r8
            r1 = r7
            org.json.JSONObject r0 = r0.getJSONObject(r1)     // Catch: java.lang.Throwable -> L38
            goto L32
        L31:
            r0 = 0
        L32:
            git.artdeell.installer_agent.ProfileFixer.oldProfile = r0     // Catch: java.lang.Throwable -> L38
            goto L52
        L38:
            r8 = move-exception
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Failed to store Forge profile: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r8
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
        L52:
            return
    }

    private static java.lang.String pickProfileName(java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r3
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.Random r1 = git.artdeell.installer_agent.ProfileFixer.random
            int r1 = r1.nextInt()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static void reinsertProfile(java.lang.String r7, java.lang.String r8, boolean r9) {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lae
            r1 = r0
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> Lae
            r3 = r2
            java.nio.file.Path r4 = git.artdeell.installer_agent.ProfileFixer.profilesPath     // Catch: java.lang.Throwable -> Lae
            byte[] r4 = java.nio.file.Files.readAllBytes(r4)     // Catch: java.lang.Throwable -> Lae
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> Lae
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> Lae
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lae
            r10 = r0
            r0 = r10
            java.lang.String r1 = "profiles"
            org.json.JSONObject r0 = r0.getJSONObject(r1)     // Catch: java.lang.Throwable -> Lae
            r11 = r0
            r0 = r7
            r1 = r11
            java.lang.String r0 = findProfileName(r0, r1)     // Catch: java.lang.Throwable -> Lae
            r7 = r0
            r0 = r8
            if (r0 == 0) goto L32
            r0 = r7
            r1 = r8
            r2 = r11
            fixupModpackProfile(r0, r1, r2)     // Catch: java.lang.Throwable -> Lae
        L32:
            org.json.JSONObject r0 = git.artdeell.installer_agent.ProfileFixer.oldProfile     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto L70
            r0 = r9
            if (r0 == 0) goto L49
            r0 = r11
            r1 = r7
            org.json.JSONObject r2 = git.artdeell.installer_agent.ProfileFixer.oldProfile     // Catch: java.lang.Throwable -> Lae
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lae
            goto L7b
        L49:
            r0 = r7
            java.lang.String r0 = pickProfileName(r0)     // Catch: java.lang.Throwable -> Lae
            r12 = r0
        L4f:
            r0 = r11
            r1 = r12
            boolean r0 = r0.has(r1)     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto L62
            r0 = r7
            java.lang.String r0 = pickProfileName(r0)     // Catch: java.lang.Throwable -> Lae
            r12 = r0
            goto L4f
        L62:
            r0 = r11
            r1 = r12
            org.json.JSONObject r2 = git.artdeell.installer_agent.ProfileFixer.oldProfile     // Catch: java.lang.Throwable -> Lae
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lae
            goto L7b
        L70:
            r0 = r9
            if (r0 == 0) goto L7b
            r0 = r11
            r1 = r7
            java.lang.Object r0 = r0.remove(r1)     // Catch: java.lang.Throwable -> Lae
        L7b:
            r0 = r10
            java.lang.String r1 = "profiles"
            r2 = r11
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lae
            java.nio.file.Path r0 = git.artdeell.installer_agent.ProfileFixer.profilesPath     // Catch: java.lang.Throwable -> Lae
            r1 = r10
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lae
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> Lae
            byte[] r1 = r1.getBytes(r2)     // Catch: java.lang.Throwable -> Lae
            r2 = 3
            java.nio.file.OpenOption[] r2 = new java.nio.file.OpenOption[r2]     // Catch: java.lang.Throwable -> Lae
            r3 = r2
            r4 = 0
            java.nio.file.StandardOpenOption r5 = java.nio.file.StandardOpenOption.WRITE     // Catch: java.lang.Throwable -> Lae
            r3[r4] = r5     // Catch: java.lang.Throwable -> Lae
            r3 = r2
            r4 = 1
            java.nio.file.StandardOpenOption r5 = java.nio.file.StandardOpenOption.TRUNCATE_EXISTING     // Catch: java.lang.Throwable -> Lae
            r3[r4] = r5     // Catch: java.lang.Throwable -> Lae
            r3 = r2
            r4 = 2
            java.nio.file.StandardOpenOption r5 = java.nio.file.StandardOpenOption.CREATE     // Catch: java.lang.Throwable -> Lae
            r3[r4] = r5     // Catch: java.lang.Throwable -> Lae
            java.nio.file.Path r0 = java.nio.file.Files.write(r0, r1, r2)     // Catch: java.lang.Throwable -> Lae
            goto Lc8
        Lae:
            r10 = move-exception
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Failed to restore old Forge profile: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r10
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
        Lc8:
            return
    }

    private static void fixupModpackProfile(java.lang.String r4, java.lang.String r5, org.json.JSONObject r6) {
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "Fixing up modpack profile version ID..."
            r0.println(r1)
            r0 = r6
            r1 = r4
            org.json.JSONObject r0 = r0.optJSONObject(r1)
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L32
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Failed to find the modloader profile, keys:"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            java.util.Set r2 = r2.keySet()
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            return
        L32:
            r0 = r7
            java.lang.String r1 = "lastVersionId"
            java.lang.String r0 = r0.optString(r1)
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L5f
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Failed to find the modloader profile version, keys:"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r7
            java.util.Set r2 = r2.keySet()
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            return
        L5f:
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Expected version ID: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r5
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " Modloader version ID: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r8
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = r5
            r1 = r8
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L8c
            return
        L8c:
            r0 = r6
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
        L97:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Lf9
            r0 = r9
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r10 = r0
            r0 = r10
            r1 = r4
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb9
            goto L97
        Lb9:
            r0 = r6
            r1 = r10
            org.json.JSONObject r0 = r0.getJSONObject(r1)
            r11 = r0
            r0 = r5
            r1 = r11
            java.lang.String r2 = "lastVersionId"
            java.lang.String r1 = r1.optString(r2)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Ld2
            goto L97
        Ld2:
            r0 = r11
            java.lang.String r1 = "lastVersionId"
            r2 = r8
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Replacing version ID in profile "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r10
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            goto L97
        Lf9:
            return
    }

    private static java.lang.String findProfileName(java.lang.String r3, org.json.JSONObject r4) {
            r0 = r4
            java.util.Set r0 = r0.keySet()
            r5 = r0
            r0 = r5
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
        Lc:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L2f
            r0 = r6
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r7 = r0
            r0 = r7
            r1 = r3
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L2c
            r0 = r7
            return r0
        L2c:
            goto Lc
        L2f:
            r0 = 0
            return r0
    }

    static {
            java.util.Random r0 = new java.util.Random
            r1 = r0
            r1.<init>()
            git.artdeell.installer_agent.ProfileFixer.random = r0
            java.lang.String r0 = "user.home"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r1 = 2
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = r1
            r3 = 0
            java.lang.String r4 = ".minecraft"
            r2[r3] = r4
            r2 = r1
            r3 = 1
            java.lang.String r4 = "launcher_profiles.json"
            r2[r3] = r4
            java.nio.file.Path r0 = java.nio.file.Paths.get(r0, r1)
            git.artdeell.installer_agent.ProfileFixer.profilesPath = r0
            r0 = 0
            git.artdeell.installer_agent.ProfileFixer.oldProfile = r0
            return
    }
}
