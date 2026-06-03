package ca.dnamobile.javalauncher.modmanager;

/* JADX INFO: loaded from: classes.dex */
public final class ModJarMetadataExtractor {
    private static final int MAX_IMAGE_BYTES = 2097152;
    private static final int MAX_NESTED_JARS = 48;
    private static final int MAX_NESTED_JAR_BYTES = 12582912;
    private static final int MAX_RECURSION_DEPTH = 2;
    private static final int MAX_TEXT_BYTES = 1048576;

    private static final class Metadata {
        java.lang.String displayName;
        android.graphics.Bitmap icon;

        private Metadata() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ Metadata(ca.dnamobile.javalauncher.modmanager.ModJarMetadataExtractor.MetadataIA r1) {
                r0 = this;
                r0.<init>()
                return
        }

        boolean hasAny() {
                r1 = this;
                java.lang.String r0 = r1.displayName
                boolean r0 = ca.dnamobile.javalauncher.modmanager.ModJarMetadataExtractor.m541$$Nest$smisBlank(r0)
                if (r0 == 0) goto Lf
                android.graphics.Bitmap r0 = r1.icon
                if (r0 == 0) goto Ld
                goto Lf
            Ld:
                r0 = 0
                goto L10
            Lf:
                r0 = 1
            L10:
                return r0
        }

        boolean isComplete() {
                r1 = this;
                java.lang.String r0 = r1.displayName
                boolean r0 = ca.dnamobile.javalauncher.modmanager.ModJarMetadataExtractor.m541$$Nest$smisBlank(r0)
                if (r0 != 0) goto Le
                android.graphics.Bitmap r0 = r1.icon
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        void merge(ca.dnamobile.javalauncher.modmanager.ModJarMetadataExtractor.Metadata r2) {
                r1 = this;
                if (r2 != 0) goto L3
                return
            L3:
                java.lang.String r0 = r1.displayName
                boolean r0 = ca.dnamobile.javalauncher.modmanager.ModJarMetadataExtractor.m541$$Nest$smisBlank(r0)
                if (r0 == 0) goto L17
                java.lang.String r0 = r2.displayName
                boolean r0 = ca.dnamobile.javalauncher.modmanager.ModJarMetadataExtractor.m541$$Nest$smisBlank(r0)
                if (r0 != 0) goto L17
                java.lang.String r0 = r2.displayName
                r1.displayName = r0
            L17:
                android.graphics.Bitmap r0 = r1.icon
                if (r0 != 0) goto L21
                android.graphics.Bitmap r2 = r2.icon
                if (r2 == 0) goto L21
                r1.icon = r2
            L21:
                return
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.modmanager.ModJarMetadataExtractor$Metadata-IA, reason: invalid class name */
    /* JADX INFO: compiled from: D8$$SyntheticClass */
    public final /* synthetic */ class MetadataIA {
    }

    public static final class Result {
        private final java.lang.String displayName;
        private final android.graphics.Bitmap icon;

        private Result(java.lang.String r1, android.graphics.Bitmap r2) {
                r0 = this;
                r0.<init>()
                r0.displayName = r1
                r0.icon = r2
                return
        }

        /* synthetic */ Result(java.lang.String r1, android.graphics.Bitmap r2, ca.dnamobile.javalauncher.modmanager.ModJarMetadataExtractor.ResultIA r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public java.lang.String getDisplayName() {
                r1 = this;
                java.lang.String r0 = r1.displayName
                return r0
        }

        public android.graphics.Bitmap getIcon() {
                r1 = this;
                android.graphics.Bitmap r0 = r1.icon
                return r0
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.modmanager.ModJarMetadataExtractor$Result-IA, reason: invalid class name */
    /* JADX INFO: compiled from: D8$$SyntheticClass */
    public final /* synthetic */ class ResultIA {
    }

    /* JADX INFO: renamed from: -$$Nest$smisBlank, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m541$$Nest$smisBlank(java.lang.String r0) {
            boolean r0 = isBlank(r0)
            return r0
    }

    private ModJarMetadataExtractor() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.graphics.Bitmap decodeFirstLikelyIcon(java.util.zip.ZipFile r4) throws java.io.IOException {
            java.util.Enumeration r0 = r4.entries()
        L4:
            boolean r1 = r0.hasMoreElements()
            if (r1 == 0) goto L54
            java.lang.Object r1 = r0.nextElement()
            java.util.zip.ZipEntry r1 = (java.util.zip.ZipEntry) r1
            boolean r2 = r1.isDirectory()
            if (r2 == 0) goto L17
            goto L4
        L17:
            java.lang.String r2 = r1.getName()
            java.lang.String r2 = normalizeZipPath(r2)
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r3)
            boolean r3 = isImageEntry(r2)
            if (r3 == 0) goto L4
            boolean r2 = isLikelyIconName(r2)
            if (r2 != 0) goto L32
            goto L4
        L32:
            java.io.InputStream r1 = r4.getInputStream(r1)
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L42
            if (r1 == 0) goto L41
            r1.close()
        L41:
            return r2
        L42:
            if (r1 == 0) goto L4
            r1.close()
            goto L4
        L48:
            r4 = move-exception
            if (r1 == 0) goto L53
            r1.close()     // Catch: java.lang.Throwable -> L4f
            goto L53
        L4f:
            r0 = move-exception
            r4.addSuppressed(r0)
        L53:
            throw r4
        L54:
            r4 = 0
            return r4
    }

    private static android.graphics.Bitmap decodeFirstLikelyMemoryIcon(java.util.Map<java.lang.String, byte[]> r3) {
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = isLikelyIconName(r1)
            if (r1 != 0) goto L21
            goto L8
        L21:
            java.lang.Object r0 = r0.getValue()
            byte[] r0 = (byte[]) r0
            r1 = 0
            int r2 = r0.length
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r0, r1, r2)
            if (r0 == 0) goto L8
            return r0
        L30:
            r3 = 0
            return r3
    }

    private static android.graphics.Bitmap decodeMemoryBitmap(java.util.Map<java.lang.String, byte[]> r6, java.lang.String r7) {
            boolean r0 = isBlank(r7)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r7 = r7.trim()
            java.lang.String r7 = normalizeZipPath(r7)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r7 = r7.toLowerCase(r0)
        L16:
            java.lang.String r0 = "/"
            boolean r2 = r7.startsWith(r0)
            if (r2 == 0) goto L24
            r0 = 1
            java.lang.String r7 = r7.substring(r0)
            goto L16
        L24:
            java.lang.String r2 = "./"
            boolean r2 = r7.startsWith(r2)
            if (r2 == 0) goto L31
            r2 = 2
            java.lang.String r7 = r7.substring(r2)
        L31:
            java.lang.Object r2 = r6.get(r7)
            byte[] r2 = (byte[]) r2
            if (r2 != 0) goto L73
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L41:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L73
            java.lang.Object r3 = r6.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = r4.equals(r7)
            if (r5 != 0) goto L6c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r0)
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.String r5 = r5.toString()
            boolean r4 = r4.endsWith(r5)
            if (r4 == 0) goto L41
        L6c:
            java.lang.Object r6 = r3.getValue()
            r2 = r6
            byte[] r2 = (byte[]) r2
        L73:
            if (r2 != 0) goto L76
            goto L7c
        L76:
            r6 = 0
            int r7 = r2.length
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeByteArray(r2, r6, r7)
        L7c:
            return r1
    }

    private static android.graphics.Bitmap decodeZipBitmap(java.util.zip.ZipFile r3, java.lang.String r4) throws java.io.IOException {
            boolean r0 = isBlank(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r4 = r4.trim()
            java.lang.String r4 = normalizeZipPath(r4)
        L10:
            java.lang.String r0 = "/"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L1e
            r0 = 1
            java.lang.String r4 = r4.substring(r0)
            goto L10
        L1e:
            java.util.zip.ZipEntry r0 = r3.getEntry(r4)
            if (r0 != 0) goto L35
            java.lang.String r2 = "./"
            boolean r2 = r4.startsWith(r2)
            if (r2 == 0) goto L35
            r0 = 2
            java.lang.String r0 = r4.substring(r0)
            java.util.zip.ZipEntry r0 = r3.getEntry(r0)
        L35:
            if (r0 != 0) goto L3b
            java.util.zip.ZipEntry r0 = findZipEntryBySuffix(r3, r4)
        L3b:
            if (r0 == 0) goto L5e
            boolean r4 = r0.isDirectory()
            if (r4 == 0) goto L44
            goto L5e
        L44:
            java.io.InputStream r3 = r3.getInputStream(r0)
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r3)     // Catch: java.lang.Throwable -> L52
            if (r3 == 0) goto L51
            r3.close()
        L51:
            return r4
        L52:
            r4 = move-exception
            if (r3 == 0) goto L5d
            r3.close()     // Catch: java.lang.Throwable -> L59
            goto L5d
        L59:
            r3 = move-exception
            r4.addSuppressed(r3)
        L5d:
            throw r4
        L5e:
            return r1
    }

    private static java.lang.String extractJsonIconString(java.lang.String r3) {
            java.lang.String r0 = "icon"
            java.lang.String r0 = extractJsonString(r3, r0)
            boolean r1 = isBlank(r0)
            if (r1 != 0) goto Ld
            return r0
        Ld:
            r0 = 0
            if (r3 != 0) goto L11
            return r0
        L11:
            java.lang.String r1 = "\\\"icon\\\"\\s*:\\s*\\{([^}]+)\\}"
            r2 = 32
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1, r2)
            java.util.regex.Matcher r3 = r1.matcher(r3)
            boolean r1 = r3.find()
            if (r1 != 0) goto L24
            return r0
        L24:
            java.lang.String r1 = "\\\"[^\\\"]+\\\"\\s*:\\s*\\\"([^\\\"]+\\.(?:png|jpg|jpeg|webp))\\\""
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            r2 = 1
            java.lang.String r3 = r3.group(r2)
            java.util.regex.Matcher r3 = r1.matcher(r3)
            boolean r1 = r3.find()
            if (r1 == 0) goto L3d
            java.lang.String r0 = r3.group(r2)
        L3d:
            return r0
    }

    private static java.lang.String extractJsonString(java.lang.String r3, java.lang.String r4) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "\\\""
            r1.<init>(r2)
            java.lang.String r4 = java.util.regex.Pattern.quote(r4)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = "\\\"\\s*:\\s*\\\"([^\\\"]+)\\\""
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)
            java.util.regex.Matcher r3 = r4.matcher(r3)
            boolean r4 = r3.find()
            if (r4 == 0) goto L30
            r4 = 1
            java.lang.String r0 = r3.group(r4)
        L30:
            return r0
    }

    private static java.lang.String extractTomlString(java.lang.String r3, java.lang.String r4) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "(?m)^\\s*"
            r1.<init>(r2)
            java.lang.String r4 = java.util.regex.Pattern.quote(r4)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = "\\s*=\\s*(?:\\\"([^\\\"]+)\\\"|'([^']+)'|([^#\\r\\n]+))"
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)
            java.util.regex.Matcher r3 = r4.matcher(r3)
            boolean r4 = r3.find()
            if (r4 != 0) goto L2c
            return r0
        L2c:
            r4 = 1
            java.lang.String r4 = r3.group(r4)
            r1 = 2
            java.lang.String r1 = r3.group(r1)
            r2 = 3
            java.lang.String r3 = r3.group(r2)
            boolean r2 = isBlank(r4)
            if (r2 != 0) goto L42
            goto L4b
        L42:
            boolean r4 = isBlank(r1)
            if (r4 != 0) goto L4a
            r4 = r1
            goto L4b
        L4a:
            r4 = r3
        L4b:
            if (r4 != 0) goto L4e
            return r0
        L4e:
            r3 = 35
            int r3 = r4.indexOf(r3)
            if (r3 < 0) goto L5b
            r0 = 0
            java.lang.String r4 = r4.substring(r0, r3)
        L5b:
            java.lang.String r3 = r4.trim()
            return r3
    }

    private static java.util.zip.ZipEntry findZipEntryBySuffix(java.util.zip.ZipFile r4, java.lang.String r5) {
            java.lang.String r5 = normalizeZipPath(r5)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r5 = r5.toLowerCase(r0)
            java.util.Enumeration r4 = r4.entries()
        Le:
            boolean r0 = r4.hasMoreElements()
            if (r0 == 0) goto L4b
            java.lang.Object r0 = r4.nextElement()
            java.util.zip.ZipEntry r0 = (java.util.zip.ZipEntry) r0
            boolean r1 = r0.isDirectory()
            if (r1 == 0) goto L21
            goto Le
        L21:
            java.lang.String r1 = r0.getName()
            java.lang.String r1 = normalizeZipPath(r1)
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r2)
            boolean r2 = r1.equals(r5)
            if (r2 != 0) goto L4a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "/"
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            boolean r1 = r1.endsWith(r2)
            if (r1 == 0) goto Le
        L4a:
            return r0
        L4b:
            r4 = 0
            return r4
    }

    private static java.lang.String firstNonBlank(java.lang.String r1, java.lang.String r2) {
            boolean r0 = isBlank(r1)
            if (r0 != 0) goto L7
            goto L10
        L7:
            boolean r1 = isBlank(r2)
            if (r1 != 0) goto Lf
            r1 = r2
            goto L10
        Lf:
            r1 = 0
        L10:
            return r1
    }

    private static android.graphics.Bitmap firstNonNull(android.graphics.Bitmap r0, android.graphics.Bitmap r1) {
            if (r0 == 0) goto L3
            goto L4
        L3:
            r0 = r1
        L4:
            return r0
    }

    private static boolean isBlank(java.lang.String r0) {
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    private static boolean isImageEntry(java.lang.String r1) {
            java.lang.String r0 = ".png"
            boolean r0 = r1.endsWith(r0)
            if (r0 != 0) goto L23
            java.lang.String r0 = ".jpg"
            boolean r0 = r1.endsWith(r0)
            if (r0 != 0) goto L23
            java.lang.String r0 = ".jpeg"
            boolean r0 = r1.endsWith(r0)
            if (r0 != 0) goto L23
            java.lang.String r0 = ".webp"
            boolean r1 = r1.endsWith(r0)
            if (r1 == 0) goto L21
            goto L23
        L21:
            r1 = 0
            goto L24
        L23:
            r1 = 1
        L24:
            return r1
    }

    private static boolean isLikelyIconName(java.lang.String r3) {
            r0 = 47
            int r0 = r3.lastIndexOf(r0)
            r1 = 1
            if (r0 < 0) goto L14
            int r0 = r0 + r1
            int r2 = r3.length()
            if (r0 >= r2) goto L14
            java.lang.String r3 = r3.substring(r0)
        L14:
            java.lang.String r0 = "icon.png"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L5e
            java.lang.String r0 = "logo.png"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L5e
            java.lang.String r0 = "pack.png"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L5e
            java.lang.String r0 = "mod_icon.png"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L5e
            java.lang.String r0 = "modicon.png"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L5e
            java.lang.String r0 = "_icon.png"
            boolean r0 = r3.endsWith(r0)
            if (r0 != 0) goto L5e
            java.lang.String r0 = "-icon.png"
            boolean r0 = r3.endsWith(r0)
            if (r0 != 0) goto L5e
            java.lang.String r0 = "icon"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L5e
            java.lang.String r0 = "logo"
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L5d
            goto L5e
        L5d:
            r1 = 0
        L5e:
            return r1
    }

    private static boolean isMetadataEntry(java.lang.String r1) {
            java.lang.String r0 = "fabric.mod.json"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "quilt.mod.json"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "mcmod.info"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "meta-inf/mods.toml"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "meta-inf/neoforge.mods.toml"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L29
            goto L2b
        L29:
            r1 = 0
            goto L2c
        L2b:
            r1 = 1
        L2c:
            return r1
    }

    private static java.lang.String normalizeZipPath(java.lang.String r2) {
            r0 = 92
            r1 = 47
            java.lang.String r2 = r2.replace(r0, r1)
            return r2
    }

    public static ca.dnamobile.javalauncher.modmanager.ModJarMetadataExtractor.Result read(java.io.File r3) {
            ca.dnamobile.javalauncher.modmanager.ModJarMetadataExtractor$Metadata r3 = readMetadata(r3)
            r0 = 0
            if (r3 == 0) goto L18
            boolean r1 = r3.hasAny()
            if (r1 != 0) goto Le
            goto L18
        Le:
            ca.dnamobile.javalauncher.modmanager.ModJarMetadataExtractor$Result r1 = new ca.dnamobile.javalauncher.modmanager.ModJarMetadataExtractor$Result
            java.lang.String r2 = r3.displayName
            android.graphics.Bitmap r3 = r3.icon
            r1.<init>(r2, r3, r0)
            return r1
        L18:
            return r0
    }

    public static java.lang.String readDisplayName(java.io.File r0) {
            ca.dnamobile.javalauncher.modmanager.ModJarMetadataExtractor$Result r0 = read(r0)
            if (r0 != 0) goto L8
            r0 = 0
            goto Lc
        L8:
            java.lang.String r0 = r0.getDisplayName()
        Lc:
            return r0
    }

    public static android.graphics.Bitmap readIcon(java.io.File r0) {
            ca.dnamobile.javalauncher.modmanager.ModJarMetadataExtractor$Result r0 = read(r0)
            if (r0 != 0) goto L8
            r0 = 0
            goto Lc
        L8:
            android.graphics.Bitmap r0 = r0.getIcon()
        Lc:
            return r0
    }

    private static ca.dnamobile.javalauncher.modmanager.ModJarMetadataExtractor.Metadata readMemoryZipMetadata(byte[] r10, int r11) throws java.io.IOException {
            ca.dnamobile.javalauncher.modmanager.ModJarMetadataExtractor$Metadata r0 = new ca.dnamobile.javalauncher.modmanager.ModJarMetadataExtractor$Metadata
            r1 = 0
            r0.<init>(r1)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.zip.ZipInputStream r4 = new java.util.zip.ZipInputStream
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream
            r5.<init>(r10)
            r4.<init>(r5)
        L1f:
            java.util.zip.ZipEntry r10 = r4.getNextEntry()     // Catch: java.lang.Throwable -> L175
            if (r10 == 0) goto L84
            boolean r5 = r10.isDirectory()     // Catch: java.lang.Throwable -> L175
            if (r5 == 0) goto L2c
            goto L1f
        L2c:
            java.lang.String r10 = r10.getName()     // Catch: java.lang.Throwable -> L175
            java.lang.String r10 = normalizeZipPath(r10)     // Catch: java.lang.Throwable -> L175
            java.util.Locale r5 = java.util.Locale.US     // Catch: java.lang.Throwable -> L175
            java.lang.String r10 = r10.toLowerCase(r5)     // Catch: java.lang.Throwable -> L175
            boolean r5 = isMetadataEntry(r10)     // Catch: java.lang.Throwable -> L175
            if (r5 == 0) goto L53
            r5 = 1048576(0x100000, float:1.469368E-39)
            byte[] r5 = readStreamBytes(r4, r5)     // Catch: java.lang.Throwable -> L175
            if (r5 == 0) goto L1f
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L175
            java.lang.String r7 = "UTF-8"
            r6.<init>(r5, r7)     // Catch: java.lang.Throwable -> L175
            r1.put(r10, r6)     // Catch: java.lang.Throwable -> L175
            goto L1f
        L53:
            boolean r5 = isImageEntry(r10)     // Catch: java.lang.Throwable -> L175
            if (r5 == 0) goto L65
            r5 = 2097152(0x200000, float:2.938736E-39)
            byte[] r5 = readStreamBytes(r4, r5)     // Catch: java.lang.Throwable -> L175
            if (r5 == 0) goto L1f
            r2.put(r10, r5)     // Catch: java.lang.Throwable -> L175
            goto L1f
        L65:
            r5 = 2
            if (r11 >= r5) goto L1f
            java.lang.String r5 = ".jar"
            boolean r10 = r10.endsWith(r5)     // Catch: java.lang.Throwable -> L175
            if (r10 == 0) goto L1f
            r10 = 12582912(0xc00000, float:1.7632415E-38)
            byte[] r10 = readStreamBytes(r4, r10)     // Catch: java.lang.Throwable -> L175
            if (r10 == 0) goto L1f
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L175
            r6 = 48
            if (r5 >= r6) goto L1f
            r3.add(r10)     // Catch: java.lang.Throwable -> L175
            goto L1f
        L84:
            r4.close()
            java.lang.String r10 = "fabric.mod.json"
            java.lang.Object r10 = r1.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r4 = r0.displayName
            java.lang.String r5 = "name"
            java.lang.String r6 = extractJsonString(r10, r5)
            java.lang.String r4 = firstNonBlank(r4, r6)
            r0.displayName = r4
            android.graphics.Bitmap r4 = r0.icon
            java.lang.String r10 = extractJsonIconString(r10)
            android.graphics.Bitmap r10 = decodeMemoryBitmap(r2, r10)
            android.graphics.Bitmap r10 = firstNonNull(r4, r10)
            r0.icon = r10
            java.lang.String r10 = "quilt.mod.json"
            java.lang.Object r10 = r1.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r4 = r0.displayName
            java.lang.String r6 = extractJsonString(r10, r5)
            java.lang.String r4 = firstNonBlank(r4, r6)
            r0.displayName = r4
            android.graphics.Bitmap r4 = r0.icon
            java.lang.String r10 = extractJsonIconString(r10)
            android.graphics.Bitmap r10 = decodeMemoryBitmap(r2, r10)
            android.graphics.Bitmap r10 = firstNonNull(r4, r10)
            r0.icon = r10
            java.lang.String r10 = "meta-inf/mods.toml"
            java.lang.Object r10 = r1.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r4 = r0.displayName
            java.lang.String r6 = "displayName"
            java.lang.String r7 = extractTomlString(r10, r6)
            java.lang.String r4 = firstNonBlank(r4, r7)
            r0.displayName = r4
            android.graphics.Bitmap r4 = r0.icon
            java.lang.String r7 = "logoFile"
            java.lang.String r8 = extractTomlString(r10, r7)
            java.lang.String r9 = "catalogueImageIcon"
            java.lang.String r10 = extractTomlString(r10, r9)
            java.lang.String r10 = firstNonBlank(r8, r10)
            android.graphics.Bitmap r10 = decodeMemoryBitmap(r2, r10)
            android.graphics.Bitmap r10 = firstNonNull(r4, r10)
            r0.icon = r10
            java.lang.String r10 = "meta-inf/neoforge.mods.toml"
            java.lang.Object r10 = r1.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r4 = r0.displayName
            java.lang.String r6 = extractTomlString(r10, r6)
            java.lang.String r4 = firstNonBlank(r4, r6)
            r0.displayName = r4
            android.graphics.Bitmap r4 = r0.icon
            java.lang.String r6 = extractTomlString(r10, r7)
            java.lang.String r10 = extractTomlString(r10, r9)
            java.lang.String r10 = firstNonBlank(r6, r10)
            android.graphics.Bitmap r10 = decodeMemoryBitmap(r2, r10)
            android.graphics.Bitmap r10 = firstNonNull(r4, r10)
            r0.icon = r10
            java.lang.String r10 = "mcmod.info"
            java.lang.Object r10 = r1.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r1 = r0.displayName
            java.lang.String r10 = extractJsonString(r10, r5)
            java.lang.String r10 = firstNonBlank(r1, r10)
            r0.displayName = r10
            android.graphics.Bitmap r10 = r0.icon
            if (r10 != 0) goto L14d
            android.graphics.Bitmap r10 = decodeFirstLikelyMemoryIcon(r2)
            r0.icon = r10
        L14d:
            boolean r10 = r0.isComplete()
            if (r10 != 0) goto L174
            java.util.Iterator r10 = r3.iterator()
        L157:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L174
            java.lang.Object r1 = r10.next()
            byte[] r1 = (byte[]) r1
            boolean r2 = r0.isComplete()
            if (r2 == 0) goto L16a
            goto L174
        L16a:
            int r2 = r11 + 1
            ca.dnamobile.javalauncher.modmanager.ModJarMetadataExtractor$Metadata r1 = readMemoryZipMetadata(r1, r2)
            r0.merge(r1)
            goto L157
        L174:
            return r0
        L175:
            r10 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L17a
            goto L17e
        L17a:
            r11 = move-exception
            r10.addSuppressed(r11)
        L17e:
            throw r10
    }

    private static ca.dnamobile.javalauncher.modmanager.ModJarMetadataExtractor.Metadata readMetadata(java.io.File r3) {
            boolean r0 = r3.isFile()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            ca.dnamobile.javalauncher.modmanager.ModJarMetadataExtractor$Metadata r0 = new ca.dnamobile.javalauncher.modmanager.ModJarMetadataExtractor$Metadata
            r0.<init>(r1)
            java.util.zip.ZipFile r2 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L3b
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3b
            ca.dnamobile.javalauncher.modmanager.ModJarMetadataExtractor$Metadata r3 = readZipFileMetadata(r2)     // Catch: java.lang.Throwable -> L31
            r0.merge(r3)     // Catch: java.lang.Throwable -> L31
            boolean r3 = r0.isComplete()     // Catch: java.lang.Throwable -> L31
            if (r3 != 0) goto L26
            ca.dnamobile.javalauncher.modmanager.ModJarMetadataExtractor$Metadata r3 = readNestedJarMetadata(r2)     // Catch: java.lang.Throwable -> L31
            r0.merge(r3)     // Catch: java.lang.Throwable -> L31
        L26:
            r2.close()     // Catch: java.lang.Throwable -> L3b
            boolean r3 = r0.hasAny()
            if (r3 == 0) goto L30
            r1 = r0
        L30:
            return r1
        L31:
            r3 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L36
            goto L3a
        L36:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch: java.lang.Throwable -> L3b
        L3a:
            throw r3     // Catch: java.lang.Throwable -> L3b
        L3b:
            return r1
    }

    private static ca.dnamobile.javalauncher.modmanager.ModJarMetadataExtractor.Metadata readNestedJarMetadata(java.util.zip.ZipFile r8) throws java.io.IOException {
            ca.dnamobile.javalauncher.modmanager.ModJarMetadataExtractor$Metadata r0 = new ca.dnamobile.javalauncher.modmanager.ModJarMetadataExtractor$Metadata
            r1 = 0
            r0.<init>(r1)
            java.util.Enumeration r1 = r8.entries()
            r2 = 0
        Lb:
            boolean r3 = r1.hasMoreElements()
            if (r3 == 0) goto L62
            r3 = 48
            if (r2 >= r3) goto L62
            boolean r3 = r0.isComplete()
            if (r3 != 0) goto L62
            java.lang.Object r3 = r1.nextElement()
            java.util.zip.ZipEntry r3 = (java.util.zip.ZipEntry) r3
            boolean r4 = r3.isDirectory()
            if (r4 == 0) goto L28
            goto Lb
        L28:
            java.lang.String r4 = r3.getName()
            java.lang.String r4 = normalizeZipPath(r4)
            java.util.Locale r5 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r5)
            java.lang.String r5 = ".jar"
            boolean r4 = r4.endsWith(r5)
            if (r4 != 0) goto L3f
            goto Lb
        L3f:
            long r4 = r3.getSize()
            r6 = 12582912(0xc00000, double:6.2167845E-317)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L4b
            goto Lb
        L4b:
            r4 = 12582912(0xc00000, float:1.7632415E-38)
            byte[] r3 = readZipEntryBytes(r8, r3, r4)
            if (r3 == 0) goto Lb
            int r4 = r3.length
            if (r4 != 0) goto L57
            goto Lb
        L57:
            int r2 = r2 + 1
            r4 = 1
            ca.dnamobile.javalauncher.modmanager.ModJarMetadataExtractor$Metadata r3 = readMemoryZipMetadata(r3, r4)
            r0.merge(r3)
            goto Lb
        L62:
            return r0
    }

    private static byte[] readStreamBytes(java.io.InputStream r6, int r7) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 16384(0x4000, float:2.2959E-41)
            byte[] r1 = new byte[r1]
            r2 = 0
            r3 = r2
        Lb:
            int r4 = r6.read(r1)
            r5 = -1
            if (r4 == r5) goto L1b
            int r3 = r3 + r4
            if (r3 <= r7) goto L17
            r6 = 0
            return r6
        L17:
            r0.write(r1, r2, r4)
            goto Lb
        L1b:
            byte[] r6 = r0.toByteArray()
            return r6
    }

    private static byte[] readZipEntryBytes(java.util.zip.ZipFile r0, java.util.zip.ZipEntry r1, int r2) throws java.io.IOException {
            java.io.InputStream r0 = r0.getInputStream(r1)
            byte[] r1 = readStreamBytes(r0, r2)     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto Ld
            r0.close()
        Ld:
            return r1
        Le:
            r1 = move-exception
            if (r0 == 0) goto L19
            r0.close()     // Catch: java.lang.Throwable -> L15
            goto L19
        L15:
            r0 = move-exception
            r1.addSuppressed(r0)
        L19:
            throw r1
    }

    private static java.lang.String readZipEntryText(java.util.zip.ZipFile r2, java.lang.String r3) throws java.io.IOException {
            java.util.zip.ZipEntry r3 = r2.getEntry(r3)
            r0 = 0
            if (r3 == 0) goto L1e
            boolean r1 = r3.isDirectory()
            if (r1 == 0) goto Le
            goto L1e
        Le:
            r1 = 1048576(0x100000, float:1.469368E-39)
            byte[] r2 = readZipEntryBytes(r2, r3, r1)
            if (r2 != 0) goto L17
            goto L1e
        L17:
            java.lang.String r0 = new java.lang.String
            java.lang.String r3 = "UTF-8"
            r0.<init>(r2, r3)
        L1e:
            return r0
    }

    private static ca.dnamobile.javalauncher.modmanager.ModJarMetadataExtractor.Metadata readZipFileMetadata(java.util.zip.ZipFile r7) throws java.io.IOException {
            ca.dnamobile.javalauncher.modmanager.ModJarMetadataExtractor$Metadata r0 = new ca.dnamobile.javalauncher.modmanager.ModJarMetadataExtractor$Metadata
            r1 = 0
            r0.<init>(r1)
            java.lang.String r1 = "fabric.mod.json"
            java.lang.String r1 = readZipEntryText(r7, r1)
            java.lang.String r2 = r0.displayName
            java.lang.String r3 = "name"
            java.lang.String r4 = extractJsonString(r1, r3)
            java.lang.String r2 = firstNonBlank(r2, r4)
            r0.displayName = r2
            java.lang.String r1 = extractJsonIconString(r1)
            android.graphics.Bitmap r1 = decodeZipBitmap(r7, r1)
            android.graphics.Bitmap r2 = r0.icon
            if (r2 != 0) goto L28
            r0.icon = r1
        L28:
            java.lang.String r1 = "quilt.mod.json"
            java.lang.String r1 = readZipEntryText(r7, r1)
            java.lang.String r2 = r0.displayName
            java.lang.String r4 = extractJsonString(r1, r3)
            java.lang.String r2 = firstNonBlank(r2, r4)
            r0.displayName = r2
            java.lang.String r1 = extractJsonIconString(r1)
            android.graphics.Bitmap r1 = decodeZipBitmap(r7, r1)
            android.graphics.Bitmap r2 = r0.icon
            if (r2 != 0) goto L48
            r0.icon = r1
        L48:
            java.lang.String r1 = "META-INF/mods.toml"
            java.lang.String r1 = readZipEntryText(r7, r1)
            java.lang.String r2 = r0.displayName
            java.lang.String r4 = "displayName"
            java.lang.String r5 = extractTomlString(r1, r4)
            java.lang.String r2 = firstNonBlank(r2, r5)
            r0.displayName = r2
            java.lang.String r2 = "logoFile"
            java.lang.String r5 = extractTomlString(r1, r2)
            java.lang.String r6 = "catalogueImageIcon"
            java.lang.String r1 = extractTomlString(r1, r6)
            java.lang.String r1 = firstNonBlank(r5, r1)
            android.graphics.Bitmap r1 = decodeZipBitmap(r7, r1)
            android.graphics.Bitmap r5 = r0.icon
            if (r5 != 0) goto L76
            r0.icon = r1
        L76:
            java.lang.String r1 = "META-INF/neoforge.mods.toml"
            java.lang.String r1 = readZipEntryText(r7, r1)
            java.lang.String r5 = r0.displayName
            java.lang.String r4 = extractTomlString(r1, r4)
            java.lang.String r4 = firstNonBlank(r5, r4)
            r0.displayName = r4
            java.lang.String r2 = extractTomlString(r1, r2)
            java.lang.String r1 = extractTomlString(r1, r6)
            java.lang.String r1 = firstNonBlank(r2, r1)
            android.graphics.Bitmap r1 = decodeZipBitmap(r7, r1)
            android.graphics.Bitmap r2 = r0.icon
            if (r2 != 0) goto L9e
            r0.icon = r1
        L9e:
            java.lang.String r1 = "mcmod.info"
            java.lang.String r1 = readZipEntryText(r7, r1)
            java.lang.String r2 = r0.displayName
            java.lang.String r1 = extractJsonString(r1, r3)
            java.lang.String r1 = firstNonBlank(r2, r1)
            r0.displayName = r1
            android.graphics.Bitmap r1 = r0.icon
            if (r1 != 0) goto Lba
            android.graphics.Bitmap r7 = decodeFirstLikelyIcon(r7)
            r0.icon = r7
        Lba:
            return r0
    }
}
