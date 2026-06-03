package ca.dnamobile.javalauncher.instance;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultMinecraftOptionsInstaller {
    private static final java.lang.String ASSET_BETA_LEGACY = "minecraft_defaults/options-beta-legacy-optional.txt";
    private static final java.lang.String ASSET_MODERN_1_17_PLUS = "minecraft_defaults/options-modern-1.17-plus.txt";
    private static final java.lang.String ASSET_RELEASE_1_8_TO_1_16 = "minecraft_defaults/options-release-1.8-to-1.16.txt";
    private static final java.util.regex.Pattern NUMBER_PATTERN = null;
    private static final java.lang.String TAG = "DefaultOptions";

    private enum OptionsPreset extends java.lang.Enum<ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller.OptionsPreset> {
        private static final /* synthetic */ ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller.OptionsPreset[] $VALUES = null;
        public static final ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller.OptionsPreset BETA_LEGACY = null;
        public static final ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller.OptionsPreset MODERN_1_17_PLUS = null;
        public static final ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller.OptionsPreset RELEASE_1_8_TO_1_16 = null;
        public static final ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller.OptionsPreset SKIP_UNKNOWN = null;
        final java.lang.String assetPath;
        final java.lang.String logName;

        private static /* synthetic */ ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller.OptionsPreset[] $values() {
                ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller$OptionsPreset r0 = ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller.OptionsPreset.SKIP_UNKNOWN
                ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller$OptionsPreset r1 = ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller.OptionsPreset.BETA_LEGACY
                ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller$OptionsPreset r2 = ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller.OptionsPreset.RELEASE_1_8_TO_1_16
                ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller$OptionsPreset r3 = ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller.OptionsPreset.MODERN_1_17_PLUS
                ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller$OptionsPreset[] r0 = new ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller.OptionsPreset[]{r0, r1, r2, r3}
                return r0
        }

        static {
                ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller$OptionsPreset r0 = new ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller$OptionsPreset
                java.lang.String r1 = "skip"
                java.lang.String r2 = ""
                java.lang.String r3 = "SKIP_UNKNOWN"
                r4 = 0
                r0.<init>(r3, r4, r1, r2)
                ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller.OptionsPreset.SKIP_UNKNOWN = r0
                ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller$OptionsPreset r0 = new ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller$OptionsPreset
                java.lang.String r1 = "beta-legacy"
                java.lang.String r2 = "minecraft_defaults/options-beta-legacy-optional.txt"
                java.lang.String r3 = "BETA_LEGACY"
                r4 = 1
                r0.<init>(r3, r4, r1, r2)
                ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller.OptionsPreset.BETA_LEGACY = r0
                ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller$OptionsPreset r0 = new ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller$OptionsPreset
                java.lang.String r1 = "release-1.8-to-1.16"
                java.lang.String r2 = "minecraft_defaults/options-release-1.8-to-1.16.txt"
                java.lang.String r3 = "RELEASE_1_8_TO_1_16"
                r4 = 2
                r0.<init>(r3, r4, r1, r2)
                ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller.OptionsPreset.RELEASE_1_8_TO_1_16 = r0
                ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller$OptionsPreset r0 = new ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller$OptionsPreset
                java.lang.String r1 = "modern-1.17-plus"
                java.lang.String r2 = "minecraft_defaults/options-modern-1.17-plus.txt"
                java.lang.String r3 = "MODERN_1_17_PLUS"
                r4 = 3
                r0.<init>(r3, r4, r1, r2)
                ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller.OptionsPreset.MODERN_1_17_PLUS = r0
                ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller$OptionsPreset[] r0 = $values()
                ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller.OptionsPreset.$VALUES = r0
                return
        }

        OptionsPreset(java.lang.String r1, int r2, java.lang.String r3, java.lang.String r4) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.logName = r3
                r0.assetPath = r4
                return
        }

        public static ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller.OptionsPreset valueOf(java.lang.String r1) {
                java.lang.Class<ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller$OptionsPreset> r0 = ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller.OptionsPreset.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller$OptionsPreset r1 = (ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller.OptionsPreset) r1
                return r1
        }

        public static ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller.OptionsPreset[] values() {
                ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller$OptionsPreset[] r0 = ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller.OptionsPreset.$VALUES
                java.lang.Object r0 = r0.clone()
                ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller$OptionsPreset[] r0 = (ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller.OptionsPreset[]) r0
                return r0
        }
    }

    static {
            java.lang.String r0 = "(\\d+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller.NUMBER_PATTERN = r0
            return
    }

    private DefaultMinecraftOptionsInstaller() {
            r0 = this;
            r0.<init>()
            return
    }

    private static ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller.OptionsPreset choosePreset(java.lang.String r3) {
            if (r3 != 0) goto L5
            ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller$OptionsPreset r3 = ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller.OptionsPreset.SKIP_UNKNOWN
            return r3
        L5:
            java.lang.String r3 = r3.trim()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = r3.toLowerCase(r0)
            int r0 = r3.length()
            if (r0 != 0) goto L18
            ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller$OptionsPreset r3 = ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller.OptionsPreset.SKIP_UNKNOWN
            return r3
        L18:
            java.lang.String r0 = "b"
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L98
            java.lang.String r0 = "a"
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L98
            java.lang.String r0 = "rd"
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L98
            java.lang.String r0 = "c0"
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L98
            java.lang.String r0 = "beta"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L98
            java.lang.String r0 = "alpha"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L98
            java.lang.String r0 = "classic"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L98
            java.lang.String r0 = "infdev"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L98
            java.lang.String r0 = "indev"
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L61
            goto L98
        L61:
            java.lang.String r0 = "^\\d{2}w\\d{2}[a-z].*"
            boolean r0 = r3.matches(r0)
            if (r0 == 0) goto L6c
            ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller$OptionsPreset r3 = ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller.OptionsPreset.MODERN_1_17_PLUS
            return r3
        L6c:
            int[] r3 = extractFirstThreeNumbers(r3)
            r0 = 0
            r0 = r3[r0]
            r1 = 1
            r3 = r3[r1]
            if (r0 >= 0) goto L7b
            ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller$OptionsPreset r3 = ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller.OptionsPreset.SKIP_UNKNOWN
            return r3
        L7b:
            r2 = 26
            if (r0 < r2) goto L82
            ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller$OptionsPreset r3 = ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller.OptionsPreset.MODERN_1_17_PLUS
            return r3
        L82:
            if (r0 != r1) goto L95
            r0 = 17
            if (r3 < r0) goto L8b
            ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller$OptionsPreset r3 = ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller.OptionsPreset.MODERN_1_17_PLUS
            return r3
        L8b:
            r0 = 8
            if (r3 < r0) goto L92
            ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller$OptionsPreset r3 = ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller.OptionsPreset.RELEASE_1_8_TO_1_16
            return r3
        L92:
            ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller$OptionsPreset r3 = ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller.OptionsPreset.BETA_LEGACY
            return r3
        L95:
            ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller$OptionsPreset r3 = ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller.OptionsPreset.SKIP_UNKNOWN
            return r3
        L98:
            ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller$OptionsPreset r3 = ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller.OptionsPreset.BETA_LEGACY
            return r3
    }

    private static int[] extractFirstThreeNumbers(java.lang.String r6) {
            r0 = 3
            int[] r1 = new int[r0]
            r2 = 0
            r3 = -1
            r1[r2] = r3
            r4 = 1
            r1[r4] = r3
            r5 = 2
            r1[r5] = r3
            java.util.regex.Pattern r5 = ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller.NUMBER_PATTERN
            java.util.regex.Matcher r6 = r5.matcher(r6)
        L13:
            boolean r5 = r6.find()
            if (r5 == 0) goto L2b
            if (r2 >= r0) goto L2b
            java.lang.String r5 = r6.group(r4)     // Catch: java.lang.NumberFormatException -> L26
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.NumberFormatException -> L26
            r1[r2] = r5     // Catch: java.lang.NumberFormatException -> L26
            goto L28
        L26:
            r1[r2] = r3
        L28:
            int r2 = r2 + 1
            goto L13
        L2b:
            return r1
    }

    public static void installIfMissingForNewInstance(android.content.Context r1, java.io.File r2) {
            r0 = 0
            installIfMissingForNewInstance(r1, r2, r0)
            return
    }

    public static void installIfMissingForNewInstance(android.content.Context r7, java.io.File r8, java.lang.String r9) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "options.txt"
            r0.<init>(r8, r1)
            boolean r8 = r0.exists()
            java.lang.String r1 = "DefaultOptions"
            if (r8 == 0) goto L26
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "options.txt already exists, not overwriting: "
            r7.<init>(r8)
            java.lang.String r8 = r0.getAbsolutePath()
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r7)
            return
        L26:
            ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller$OptionsPreset r8 = choosePreset(r9)
            ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller$OptionsPreset r2 = ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller.OptionsPreset.SKIP_UNKNOWN
            if (r8 != r2) goto L45
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Skipping default options.txt for unknown Minecraft version: "
            r7.<init>(r8)
            java.lang.String r8 = java.lang.String.valueOf(r9)
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r7)
            return
        L45:
            java.io.File r2 = r0.getParentFile()
            if (r2 == 0) goto L6e
            boolean r3 = r2.exists()
            if (r3 != 0) goto L6e
            boolean r3 = r2.mkdirs()
            if (r3 != 0) goto L6e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Unable to create game directory for default options: "
            r7.<init>(r8)
            java.lang.String r8 = r2.getAbsolutePath()
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r7)
            return
        L6e:
            android.content.res.AssetManager r7 = r7.getAssets()     // Catch: java.lang.Throwable -> Le3
            java.lang.String r2 = r8.assetPath     // Catch: java.lang.Throwable -> Le3
            java.io.InputStream r7 = r7.open(r2)     // Catch: java.lang.Throwable -> Le3
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Ld7
            r3 = 0
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> Ld7
            r4 = 16384(0x4000, float:2.2959E-41)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> Lcd
        L82:
            int r5 = r7.read(r4)     // Catch: java.lang.Throwable -> Lcd
            r6 = -1
            if (r5 == r6) goto L8d
            r2.write(r4, r3, r5)     // Catch: java.lang.Throwable -> Lcd
            goto L82
        L8d:
            r2.flush()     // Catch: java.lang.Throwable -> Lcd
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcd
            r3.<init>()     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r4 = "Seeded "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r4 = r8.logName     // Catch: java.lang.Throwable -> Lcd
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r4 = " options.txt for "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> Lcd
            java.lang.StringBuilder r9 = r3.append(r9)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r3 = ": "
            java.lang.StringBuilder r9 = r9.append(r3)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r3 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> Lcd
            java.lang.StringBuilder r9 = r9.append(r3)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> Lcd
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r9)     // Catch: java.lang.Throwable -> Lcd
            r2.close()     // Catch: java.lang.Throwable -> Ld7
            if (r7 == 0) goto L106
            r7.close()     // Catch: java.lang.Throwable -> Le3
            goto L106
        Lcd:
            r9 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> Ld2
            goto Ld6
        Ld2:
            r2 = move-exception
            r9.addSuppressed(r2)     // Catch: java.lang.Throwable -> Ld7
        Ld6:
            throw r9     // Catch: java.lang.Throwable -> Ld7
        Ld7:
            r9 = move-exception
            if (r7 == 0) goto Le2
            r7.close()     // Catch: java.lang.Throwable -> Lde
            goto Le2
        Lde:
            r7 = move-exception
            r9.addSuppressed(r7)     // Catch: java.lang.Throwable -> Le3
        Le2:
            throw r9     // Catch: java.lang.Throwable -> Le3
        Le3:
            r7 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to seed default options.txt from asset "
            r9.<init>(r2)
            java.lang.String r8 = r8.assetPath
            java.lang.StringBuilder r8 = r9.append(r8)
            java.lang.String r9 = " to "
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r9 = r0.getAbsolutePath()
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r8, r7)
        L106:
            return
    }
}
