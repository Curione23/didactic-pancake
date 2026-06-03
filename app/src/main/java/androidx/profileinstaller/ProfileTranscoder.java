package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
class ProfileTranscoder {
    private static final int HOT = 1;
    private static final int INLINE_CACHE_MEGAMORPHIC_ENCODING = 7;
    private static final int INLINE_CACHE_MISSING_TYPES_ENCODING = 6;
    static final byte[] MAGIC_PROF = null;
    static final byte[] MAGIC_PROFM = null;
    private static final int POST_STARTUP = 4;
    private static final int STARTUP = 2;

    static {
            r0 = 4
            byte[] r1 = new byte[r0]
            r1 = {x0010: FILL_ARRAY_DATA , data: [112, 114, 111, 0} // fill-array
            androidx.profileinstaller.ProfileTranscoder.MAGIC_PROF = r1
            byte[] r0 = new byte[r0]
            r0 = {x0016: FILL_ARRAY_DATA , data: [112, 114, 109, 0} // fill-array
            androidx.profileinstaller.ProfileTranscoder.MAGIC_PROFM = r0
            return
    }

    private ProfileTranscoder() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int computeMethodFlags(androidx.profileinstaller.DexProfileData r2) {
            java.util.TreeMap<java.lang.Integer, java.lang.Integer> r2 = r2.methods
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        Lb:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r2.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0 = r0 | r1
            goto Lb
        L23:
            return r0
    }

    private static byte[] createCompressibleBody(androidx.profileinstaller.DexProfileData[] r8, byte[] r9) throws java.io.IOException {
            int r0 = r8.length
            r1 = 0
            r2 = r1
            r3 = r2
        L4:
            if (r2 >= r0) goto L29
            r4 = r8[r2]
            java.lang.String r5 = r4.apkName
            java.lang.String r6 = r4.dexName
            java.lang.String r5 = generateDexKey(r5, r6, r9)
            int r5 = androidx.profileinstaller.Encoding.utf8Length(r5)
            int r5 = r5 + 16
            int r6 = r4.classSetSize
            int r6 = r6 * 2
            int r5 = r5 + r6
            int r6 = r4.hotMethodRegionSize
            int r5 = r5 + r6
            int r4 = r4.numMethodIds
            int r4 = getMethodBitmapStorageSize(r4)
            int r5 = r5 + r4
            int r3 = r3 + r5
            int r2 = r2 + 1
            goto L4
        L29:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>(r3)
            byte[] r2 = androidx.profileinstaller.ProfileVersion.V009_O_MR1
            boolean r2 = java.util.Arrays.equals(r9, r2)
            if (r2 == 0) goto L4c
            int r2 = r8.length
        L37:
            if (r1 >= r2) goto L6b
            r4 = r8[r1]
            java.lang.String r5 = r4.apkName
            java.lang.String r6 = r4.dexName
            java.lang.String r5 = generateDexKey(r5, r6, r9)
            writeLineHeader(r0, r4, r5)
            writeLineData(r0, r4)
            int r1 = r1 + 1
            goto L37
        L4c:
            int r2 = r8.length
            r4 = r1
        L4e:
            if (r4 >= r2) goto L60
            r5 = r8[r4]
            java.lang.String r6 = r5.apkName
            java.lang.String r7 = r5.dexName
            java.lang.String r6 = generateDexKey(r6, r7, r9)
            writeLineHeader(r0, r5, r6)
            int r4 = r4 + 1
            goto L4e
        L60:
            int r9 = r8.length
        L61:
            if (r1 >= r9) goto L6b
            r2 = r8[r1]
            writeLineData(r0, r2)
            int r1 = r1 + 1
            goto L61
        L6b:
            int r8 = r0.size()
            if (r8 != r3) goto L76
            byte[] r8 = r0.toByteArray()
            return r8
        L76:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "The bytes saved do not match expectation. actual="
            r8.<init>(r9)
            int r9 = r0.size()
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r9 = " expected="
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r8 = r8.append(r3)
            java.lang.String r8 = r8.toString()
            java.lang.RuntimeException r8 = androidx.profileinstaller.Encoding.error(r8)
            throw r8
    }

    private static androidx.profileinstaller.WritableFileSection createCompressibleClassSection(androidx.profileinstaller.DexProfileData[] r5) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            int r3 = r5.length     // Catch: java.lang.Throwable -> L57
            if (r1 >= r3) goto L21
            r3 = r5[r1]     // Catch: java.lang.Throwable -> L57
            androidx.profileinstaller.Encoding.writeUInt16(r0, r1)     // Catch: java.lang.Throwable -> L57
            int r2 = r2 + 4
            int r4 = r3.classSetSize     // Catch: java.lang.Throwable -> L57
            androidx.profileinstaller.Encoding.writeUInt16(r0, r4)     // Catch: java.lang.Throwable -> L57
            int r4 = r3.classSetSize     // Catch: java.lang.Throwable -> L57
            int r4 = r4 * 2
            int r2 = r2 + r4
            writeClasses(r0, r3)     // Catch: java.lang.Throwable -> L57
            int r1 = r1 + 1
            goto L7
        L21:
            byte[] r5 = r0.toByteArray()     // Catch: java.lang.Throwable -> L57
            int r1 = r5.length     // Catch: java.lang.Throwable -> L57
            if (r2 != r1) goto L34
            androidx.profileinstaller.WritableFileSection r1 = new androidx.profileinstaller.WritableFileSection     // Catch: java.lang.Throwable -> L57
            androidx.profileinstaller.FileSectionType r3 = androidx.profileinstaller.FileSectionType.CLASSES     // Catch: java.lang.Throwable -> L57
            r4 = 1
            r1.<init>(r3, r2, r5, r4)     // Catch: java.lang.Throwable -> L57
            r0.close()
            return r1
        L34:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r1.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = "Expected size "
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> L57
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = ", does not match actual size "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L57
            int r5 = r5.length     // Catch: java.lang.Throwable -> L57
            java.lang.StringBuilder r5 = r1.append(r5)     // Catch: java.lang.Throwable -> L57
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L57
            java.lang.RuntimeException r5 = androidx.profileinstaller.Encoding.error(r5)     // Catch: java.lang.Throwable -> L57
            throw r5     // Catch: java.lang.Throwable -> L57
        L57:
            r5 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L5c
            goto L60
        L5c:
            r0 = move-exception
            r5.addSuppressed(r0)
        L60:
            throw r5
    }

    private static androidx.profileinstaller.WritableFileSection createCompressibleMethodsSection(androidx.profileinstaller.DexProfileData[] r9) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            int r3 = r9.length     // Catch: java.lang.Throwable -> L69
            if (r1 >= r3) goto L33
            r3 = r9[r1]     // Catch: java.lang.Throwable -> L69
            int r4 = computeMethodFlags(r3)     // Catch: java.lang.Throwable -> L69
            byte[] r5 = createMethodBitmapRegion(r3)     // Catch: java.lang.Throwable -> L69
            byte[] r3 = createMethodsWithInlineCaches(r3)     // Catch: java.lang.Throwable -> L69
            androidx.profileinstaller.Encoding.writeUInt16(r0, r1)     // Catch: java.lang.Throwable -> L69
            int r6 = r5.length     // Catch: java.lang.Throwable -> L69
            int r6 = r6 + 2
            int r7 = r3.length     // Catch: java.lang.Throwable -> L69
            int r6 = r6 + r7
            int r2 = r2 + 6
            long r7 = (long) r6     // Catch: java.lang.Throwable -> L69
            androidx.profileinstaller.Encoding.writeUInt32(r0, r7)     // Catch: java.lang.Throwable -> L69
            androidx.profileinstaller.Encoding.writeUInt16(r0, r4)     // Catch: java.lang.Throwable -> L69
            r0.write(r5)     // Catch: java.lang.Throwable -> L69
            r0.write(r3)     // Catch: java.lang.Throwable -> L69
            int r2 = r2 + r6
            int r1 = r1 + 1
            goto L7
        L33:
            byte[] r9 = r0.toByteArray()     // Catch: java.lang.Throwable -> L69
            int r1 = r9.length     // Catch: java.lang.Throwable -> L69
            if (r2 != r1) goto L46
            androidx.profileinstaller.WritableFileSection r1 = new androidx.profileinstaller.WritableFileSection     // Catch: java.lang.Throwable -> L69
            androidx.profileinstaller.FileSectionType r3 = androidx.profileinstaller.FileSectionType.METHODS     // Catch: java.lang.Throwable -> L69
            r4 = 1
            r1.<init>(r3, r2, r9, r4)     // Catch: java.lang.Throwable -> L69
            r0.close()
            return r1
        L46:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r1.<init>()     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = "Expected size "
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = ", does not match actual size "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L69
            int r9 = r9.length     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r9 = r1.append(r9)     // Catch: java.lang.Throwable -> L69
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L69
            java.lang.RuntimeException r9 = androidx.profileinstaller.Encoding.error(r9)     // Catch: java.lang.Throwable -> L69
            throw r9     // Catch: java.lang.Throwable -> L69
        L69:
            r9 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L6e
            goto L72
        L6e:
            r0 = move-exception
            r9.addSuppressed(r0)
        L72:
            throw r9
    }

    private static byte[] createMethodBitmapRegion(androidx.profileinstaller.DexProfileData r1) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            writeMethodBitmap(r0, r1)     // Catch: java.lang.Throwable -> L10
            byte[] r1 = r0.toByteArray()     // Catch: java.lang.Throwable -> L10
            r0.close()
            return r1
        L10:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L15
            goto L19
        L15:
            r0 = move-exception
            r1.addSuppressed(r0)
        L19:
            throw r1
    }

    private static byte[] createMethodsWithInlineCaches(androidx.profileinstaller.DexProfileData r1) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            writeMethodsWithInlineCaches(r0, r1)     // Catch: java.lang.Throwable -> L10
            byte[] r1 = r0.toByteArray()     // Catch: java.lang.Throwable -> L10
            r0.close()
            return r1
        L10:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L15
            goto L19
        L15:
            r0 = move-exception
            r1.addSuppressed(r0)
        L19:
            throw r1
    }

    private static java.lang.String enforceSeparator(java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = "!"
            boolean r1 = r0.equals(r4)
            java.lang.String r2 = ":"
            if (r1 == 0) goto Lf
            java.lang.String r3 = r3.replace(r2, r0)
            return r3
        Lf:
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L19
            java.lang.String r3 = r3.replace(r0, r2)
        L19:
            return r3
    }

    private static java.lang.String extractKey(java.lang.String r1) {
            java.lang.String r0 = "!"
            int r0 = r1.indexOf(r0)
            if (r0 >= 0) goto Le
            java.lang.String r0 = ":"
            int r0 = r1.indexOf(r0)
        Le:
            if (r0 <= 0) goto L16
            int r0 = r0 + 1
            java.lang.String r1 = r1.substring(r0)
        L16:
            return r1
    }

    private static androidx.profileinstaller.DexProfileData findByDexName(androidx.profileinstaller.DexProfileData[] r3, java.lang.String r4) {
            int r0 = r3.length
            r1 = 0
            if (r0 > 0) goto L5
            return r1
        L5:
            java.lang.String r4 = extractKey(r4)
            r0 = 0
        La:
            int r2 = r3.length
            if (r0 >= r2) goto L1d
            r2 = r3[r0]
            java.lang.String r2 = r2.dexName
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L1a
            r3 = r3[r0]
            return r3
        L1a:
            int r0 = r0 + 1
            goto La
        L1d:
            return r1
    }

    private static java.lang.String generateDexKey(java.lang.String r2, java.lang.String r3, byte[] r4) {
            java.lang.String r0 = androidx.profileinstaller.ProfileVersion.dexKeySeparator(r4)
            int r1 = r2.length()
            if (r1 > 0) goto Lf
            java.lang.String r2 = enforceSeparator(r3, r0)
            return r2
        Lf:
            java.lang.String r1 = "classes.dex"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L18
            return r2
        L18:
            java.lang.String r1 = "!"
            boolean r1 = r3.contains(r1)
            if (r1 != 0) goto L4c
            java.lang.String r1 = ":"
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L29
            goto L4c
        L29:
            java.lang.String r0 = ".apk"
            boolean r0 = r3.endsWith(r0)
            if (r0 == 0) goto L32
            return r3
        L32:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r4 = androidx.profileinstaller.ProfileVersion.dexKeySeparator(r4)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
        L4c:
            java.lang.String r2 = enforceSeparator(r3, r0)
            return r2
    }

    private static int getMethodBitmapStorageSize(int r0) {
            int r0 = r0 * 2
            int r0 = roundUpToByte(r0)
            int r0 = r0 / 8
            return r0
    }

    private static int methodFlagBitmapIndex(int r1, int r2, int r3) {
            r0 = 1
            if (r1 == r0) goto L20
            r0 = 2
            if (r1 == r0) goto L1f
            r0 = 4
            if (r1 != r0) goto Lb
            int r2 = r2 + r3
            return r2
        Lb:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unexpected flag: "
            r2.<init>(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            java.lang.RuntimeException r1 = androidx.profileinstaller.Encoding.error(r1)
            throw r1
        L1f:
            return r2
        L20:
            java.lang.String r1 = "HOT methods are not stored in the bitmap"
            java.lang.RuntimeException r1 = androidx.profileinstaller.Encoding.error(r1)
            throw r1
    }

    private static int[] readClasses(java.io.InputStream r4, int r5) throws java.io.IOException {
            int[] r0 = new int[r5]
            r1 = 0
            r2 = r1
        L4:
            if (r1 >= r5) goto L10
            int r3 = androidx.profileinstaller.Encoding.readUInt16(r4)
            int r2 = r2 + r3
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L10:
            return r0
    }

    private static int readFlagsFromBitmap(java.util.BitSet r2, int r3, int r4) {
            r0 = 2
            int r1 = methodFlagBitmapIndex(r0, r3, r4)
            boolean r1 = r2.get(r1)
            if (r1 == 0) goto Lc
            goto Ld
        Lc:
            r0 = 0
        Ld:
            r1 = 4
            int r3 = methodFlagBitmapIndex(r1, r3, r4)
            boolean r2 = r2.get(r3)
            if (r2 == 0) goto L1a
            r0 = r0 | 4
        L1a:
            return r0
    }

    static byte[] readHeader(java.io.InputStream r1, byte[] r2) throws java.io.IOException {
            int r0 = r2.length
            byte[] r0 = androidx.profileinstaller.Encoding.read(r1, r0)
            boolean r2 = java.util.Arrays.equals(r2, r0)
            if (r2 == 0) goto L13
            byte[] r2 = androidx.profileinstaller.ProfileVersion.V010_P
            int r2 = r2.length
            byte[] r1 = androidx.profileinstaller.Encoding.read(r1, r2)
            return r1
        L13:
            java.lang.String r1 = "Invalid magic"
            java.lang.RuntimeException r1 = androidx.profileinstaller.Encoding.error(r1)
            throw r1
    }

    private static void readHotMethodRegion(java.io.InputStream r5, androidx.profileinstaller.DexProfileData r6) throws java.io.IOException {
            int r0 = r5.available()
            int r1 = r6.hotMethodRegionSize
            int r0 = r0 - r1
            r1 = 0
        L8:
            int r2 = r5.available()
            if (r2 <= r0) goto L2d
            int r2 = androidx.profileinstaller.Encoding.readUInt16(r5)
            int r1 = r1 + r2
            java.util.TreeMap<java.lang.Integer, java.lang.Integer> r2 = r6.methods
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r4 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.put(r3, r4)
            int r2 = androidx.profileinstaller.Encoding.readUInt16(r5)
        L25:
            if (r2 <= 0) goto L8
            skipInlineCache(r5)
            int r2 = r2 + (-1)
            goto L25
        L2d:
            int r5 = r5.available()
            if (r5 != r0) goto L34
            return
        L34:
            java.lang.String r5 = "Read too much data during profile line parse"
            java.lang.RuntimeException r5 = androidx.profileinstaller.Encoding.error(r5)
            throw r5
    }

    static androidx.profileinstaller.DexProfileData[] readMeta(java.io.InputStream r1, byte[] r2, byte[] r3, androidx.profileinstaller.DexProfileData[] r4) throws java.io.IOException {
            byte[] r0 = androidx.profileinstaller.ProfileVersion.METADATA_V001_N
            boolean r0 = java.util.Arrays.equals(r2, r0)
            if (r0 == 0) goto L1c
            byte[] r0 = androidx.profileinstaller.ProfileVersion.V015_S
            boolean r3 = java.util.Arrays.equals(r0, r3)
            if (r3 != 0) goto L15
            androidx.profileinstaller.DexProfileData[] r1 = readMetadata001(r1, r2, r4)
            return r1
        L15:
            java.lang.String r1 = "Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher"
            java.lang.RuntimeException r1 = androidx.profileinstaller.Encoding.error(r1)
            throw r1
        L1c:
            byte[] r0 = androidx.profileinstaller.ProfileVersion.METADATA_V002
            boolean r2 = java.util.Arrays.equals(r2, r0)
            if (r2 == 0) goto L29
            androidx.profileinstaller.DexProfileData[] r1 = readMetadataV002(r1, r3, r4)
            return r1
        L29:
            java.lang.String r1 = "Unsupported meta version"
            java.lang.RuntimeException r1 = androidx.profileinstaller.Encoding.error(r1)
            throw r1
    }

    static androidx.profileinstaller.DexProfileData[] readMetadata001(java.io.InputStream r4, byte[] r5, androidx.profileinstaller.DexProfileData[] r6) throws java.io.IOException {
            byte[] r0 = androidx.profileinstaller.ProfileVersion.METADATA_V001_N
            boolean r5 = java.util.Arrays.equals(r5, r0)
            if (r5 == 0) goto L3e
            int r5 = androidx.profileinstaller.Encoding.readUInt8(r4)
            long r0 = androidx.profileinstaller.Encoding.readUInt32(r4)
            long r2 = androidx.profileinstaller.Encoding.readUInt32(r4)
            int r2 = (int) r2
            int r0 = (int) r0
            byte[] r0 = androidx.profileinstaller.Encoding.readCompressed(r4, r2, r0)
            int r4 = r4.read()
            if (r4 > 0) goto L37
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
            r4.<init>(r0)
            androidx.profileinstaller.DexProfileData[] r5 = readMetadataForNBody(r4, r5, r6)     // Catch: java.lang.Throwable -> L2d
            r4.close()
            return r5
        L2d:
            r5 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L32
            goto L36
        L32:
            r4 = move-exception
            r5.addSuppressed(r4)
        L36:
            throw r5
        L37:
            java.lang.String r4 = "Content found after the end of file"
            java.lang.RuntimeException r4 = androidx.profileinstaller.Encoding.error(r4)
            throw r4
        L3e:
            java.lang.String r4 = "Unsupported meta version"
            java.lang.RuntimeException r4 = androidx.profileinstaller.Encoding.error(r4)
            throw r4
    }

    private static androidx.profileinstaller.DexProfileData[] readMetadataForNBody(java.io.InputStream r6, int r7, androidx.profileinstaller.DexProfileData[] r8) throws java.io.IOException {
            int r0 = r6.available()
            r1 = 0
            if (r0 != 0) goto La
            androidx.profileinstaller.DexProfileData[] r6 = new androidx.profileinstaller.DexProfileData[r1]
            return r6
        La:
            int r0 = r8.length
            if (r7 != r0) goto L4c
            java.lang.String[] r0 = new java.lang.String[r7]
            int[] r2 = new int[r7]
            r3 = r1
        L12:
            if (r3 >= r7) goto L27
            int r4 = androidx.profileinstaller.Encoding.readUInt16(r6)
            int r5 = androidx.profileinstaller.Encoding.readUInt16(r6)
            r2[r3] = r5
            java.lang.String r4 = androidx.profileinstaller.Encoding.readString(r6, r4)
            r0[r3] = r4
            int r3 = r3 + 1
            goto L12
        L27:
            if (r1 >= r7) goto L4b
            r3 = r8[r1]
            java.lang.String r4 = r3.dexName
            r5 = r0[r1]
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L44
            r4 = r2[r1]
            r3.classSetSize = r4
            int r4 = r3.classSetSize
            int[] r4 = readClasses(r6, r4)
            r3.classes = r4
            int r1 = r1 + 1
            goto L27
        L44:
            java.lang.String r6 = "Order of dexfiles in metadata did not match baseline"
            java.lang.RuntimeException r6 = androidx.profileinstaller.Encoding.error(r6)
            throw r6
        L4b:
            return r8
        L4c:
            java.lang.String r6 = "Mismatched number of dex files found in metadata"
            java.lang.RuntimeException r6 = androidx.profileinstaller.Encoding.error(r6)
            throw r6
    }

    static androidx.profileinstaller.DexProfileData[] readMetadataV002(java.io.InputStream r5, byte[] r6, androidx.profileinstaller.DexProfileData[] r7) throws java.io.IOException {
            int r0 = androidx.profileinstaller.Encoding.readUInt16(r5)
            long r1 = androidx.profileinstaller.Encoding.readUInt32(r5)
            long r3 = androidx.profileinstaller.Encoding.readUInt32(r5)
            int r3 = (int) r3
            int r1 = (int) r1
            byte[] r1 = androidx.profileinstaller.Encoding.readCompressed(r5, r3, r1)
            int r5 = r5.read()
            if (r5 > 0) goto L2f
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream
            r5.<init>(r1)
            androidx.profileinstaller.DexProfileData[] r6 = readMetadataV002Body(r5, r6, r0, r7)     // Catch: java.lang.Throwable -> L25
            r5.close()
            return r6
        L25:
            r6 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> L2a
            goto L2e
        L2a:
            r5 = move-exception
            r6.addSuppressed(r5)
        L2e:
            throw r6
        L2f:
            java.lang.String r5 = "Content found after the end of file"
            java.lang.RuntimeException r5 = androidx.profileinstaller.Encoding.error(r5)
            throw r5
    }

    private static androidx.profileinstaller.DexProfileData[] readMetadataV002Body(java.io.InputStream r6, byte[] r7, int r8, androidx.profileinstaller.DexProfileData[] r9) throws java.io.IOException {
            int r0 = r6.available()
            r1 = 0
            if (r0 != 0) goto La
            androidx.profileinstaller.DexProfileData[] r6 = new androidx.profileinstaller.DexProfileData[r1]
            return r6
        La:
            int r0 = r9.length
            if (r8 != r0) goto L52
        Ld:
            if (r1 >= r8) goto L51
            androidx.profileinstaller.Encoding.readUInt16(r6)
            int r0 = androidx.profileinstaller.Encoding.readUInt16(r6)
            java.lang.String r0 = androidx.profileinstaller.Encoding.readString(r6, r0)
            long r2 = androidx.profileinstaller.Encoding.readUInt32(r6)
            int r4 = androidx.profileinstaller.Encoding.readUInt16(r6)
            androidx.profileinstaller.DexProfileData r5 = findByDexName(r9, r0)
            if (r5 == 0) goto L3d
            r5.mTypeIdCount = r2
            int[] r0 = readClasses(r6, r4)
            byte[] r2 = androidx.profileinstaller.ProfileVersion.V001_N
            boolean r2 = java.util.Arrays.equals(r7, r2)
            if (r2 == 0) goto L3a
            r5.classSetSize = r4
            r5.classes = r0
        L3a:
            int r1 = r1 + 1
            goto Ld
        L3d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Missing profile key: "
            r6.<init>(r7)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.RuntimeException r6 = androidx.profileinstaller.Encoding.error(r6)
            throw r6
        L51:
            return r9
        L52:
            java.lang.String r6 = "Mismatched number of dex files found in metadata"
            java.lang.RuntimeException r6 = androidx.profileinstaller.Encoding.error(r6)
            throw r6
    }

    private static void readMethodBitmap(java.io.InputStream r6, androidx.profileinstaller.DexProfileData r7) throws java.io.IOException {
            int r0 = r7.numMethodIds
            int r0 = r0 * 2
            int r0 = androidx.profileinstaller.Encoding.bitsToBytes(r0)
            byte[] r6 = androidx.profileinstaller.Encoding.read(r6, r0)
            java.util.BitSet r6 = java.util.BitSet.valueOf(r6)
            r0 = 0
            r1 = r0
        L12:
            int r2 = r7.numMethodIds
            if (r1 >= r2) goto L45
            int r2 = r7.numMethodIds
            int r2 = readFlagsFromBitmap(r6, r1, r2)
            if (r2 == 0) goto L42
            java.util.TreeMap<java.lang.Integer, java.lang.Integer> r3 = r7.methods
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.lang.Object r3 = r3.get(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 != 0) goto L30
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L30:
            java.util.TreeMap<java.lang.Integer, java.lang.Integer> r4 = r7.methods
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            int r3 = r3.intValue()
            r2 = r2 | r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.put(r5, r2)
        L42:
            int r1 = r1 + 1
            goto L12
        L45:
            return
    }

    static androidx.profileinstaller.DexProfileData[] readProfile(java.io.InputStream r4, byte[] r5, java.lang.String r6) throws java.io.IOException {
            byte[] r0 = androidx.profileinstaller.ProfileVersion.V010_P
            boolean r5 = java.util.Arrays.equals(r5, r0)
            if (r5 == 0) goto L3e
            int r5 = androidx.profileinstaller.Encoding.readUInt8(r4)
            long r0 = androidx.profileinstaller.Encoding.readUInt32(r4)
            long r2 = androidx.profileinstaller.Encoding.readUInt32(r4)
            int r2 = (int) r2
            int r0 = (int) r0
            byte[] r0 = androidx.profileinstaller.Encoding.readCompressed(r4, r2, r0)
            int r4 = r4.read()
            if (r4 > 0) goto L37
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
            r4.<init>(r0)
            androidx.profileinstaller.DexProfileData[] r5 = readUncompressedBody(r4, r6, r5)     // Catch: java.lang.Throwable -> L2d
            r4.close()
            return r5
        L2d:
            r5 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L32
            goto L36
        L32:
            r4 = move-exception
            r5.addSuppressed(r4)
        L36:
            throw r5
        L37:
            java.lang.String r4 = "Content found after the end of file"
            java.lang.RuntimeException r4 = androidx.profileinstaller.Encoding.error(r4)
            throw r4
        L3e:
            java.lang.String r4 = "Unsupported version"
            java.lang.RuntimeException r4 = androidx.profileinstaller.Encoding.error(r4)
            throw r4
    }

    private static androidx.profileinstaller.DexProfileData[] readUncompressedBody(java.io.InputStream r19, java.lang.String r20, int r21) throws java.io.IOException {
            r0 = r19
            r1 = r21
            int r2 = r19.available()
            r3 = 0
            if (r2 != 0) goto Le
            androidx.profileinstaller.DexProfileData[] r0 = new androidx.profileinstaller.DexProfileData[r3]
            return r0
        Le:
            androidx.profileinstaller.DexProfileData[] r2 = new androidx.profileinstaller.DexProfileData[r1]
            r4 = r3
        L11:
            if (r4 >= r1) goto L46
            int r5 = androidx.profileinstaller.Encoding.readUInt16(r19)
            int r13 = androidx.profileinstaller.Encoding.readUInt16(r19)
            long r6 = androidx.profileinstaller.Encoding.readUInt32(r19)
            long r9 = androidx.profileinstaller.Encoding.readUInt32(r19)
            long r11 = androidx.profileinstaller.Encoding.readUInt32(r19)
            androidx.profileinstaller.DexProfileData r18 = new androidx.profileinstaller.DexProfileData
            java.lang.String r8 = androidx.profileinstaller.Encoding.readString(r0, r5)
            int r14 = (int) r6
            int r15 = (int) r11
            int[] r5 = new int[r13]
            java.util.TreeMap r17 = new java.util.TreeMap
            r17.<init>()
            r11 = 0
            r6 = r18
            r7 = r20
            r16 = r5
            r6.<init>(r7, r8, r9, r11, r13, r14, r15, r16, r17)
            r2[r4] = r18
            int r4 = r4 + 1
            goto L11
        L46:
            if (r3 >= r1) goto L5b
            r4 = r2[r3]
            readHotMethodRegion(r0, r4)
            int r5 = r4.classSetSize
            int[] r5 = readClasses(r0, r5)
            r4.classes = r5
            readMethodBitmap(r0, r4)
            int r3 = r3 + 1
            goto L46
        L5b:
            return r2
    }

    private static int roundUpToByte(int r0) {
            int r0 = r0 + 7
            r0 = r0 & (-8)
            return r0
    }

    private static void setMethodBitmapBit(byte[] r1, int r2, int r3, androidx.profileinstaller.DexProfileData r4) {
            int r4 = r4.numMethodIds
            int r2 = methodFlagBitmapIndex(r2, r3, r4)
            int r3 = r2 / 8
            r4 = r1[r3]
            r0 = 1
            int r2 = r2 % 8
            int r2 = r0 << r2
            r2 = r2 | r4
            byte r2 = (byte) r2
            r1[r3] = r2
            return
    }

    private static void skipInlineCache(java.io.InputStream r2) throws java.io.IOException {
            androidx.profileinstaller.Encoding.readUInt16(r2)
            int r0 = androidx.profileinstaller.Encoding.readUInt8(r2)
            r1 = 6
            if (r0 != r1) goto Lb
            return
        Lb:
            r1 = 7
            if (r0 != r1) goto Lf
            return
        Lf:
            if (r0 <= 0) goto L23
            androidx.profileinstaller.Encoding.readUInt8(r2)
            int r1 = androidx.profileinstaller.Encoding.readUInt8(r2)
        L18:
            if (r1 <= 0) goto L20
            androidx.profileinstaller.Encoding.readUInt16(r2)
            int r1 = r1 + (-1)
            goto L18
        L20:
            int r0 = r0 + (-1)
            goto Lf
        L23:
            return
    }

    static boolean transcodeAndWriteBody(java.io.OutputStream r2, byte[] r3, androidx.profileinstaller.DexProfileData[] r4) throws java.io.IOException {
            byte[] r0 = androidx.profileinstaller.ProfileVersion.V015_S
            boolean r0 = java.util.Arrays.equals(r3, r0)
            r1 = 1
            if (r0 == 0) goto Ld
            writeProfileForS(r2, r4)
            return r1
        Ld:
            byte[] r0 = androidx.profileinstaller.ProfileVersion.V010_P
            boolean r0 = java.util.Arrays.equals(r3, r0)
            if (r0 == 0) goto L19
            writeProfileForP(r2, r4)
            return r1
        L19:
            byte[] r0 = androidx.profileinstaller.ProfileVersion.V005_O
            boolean r0 = java.util.Arrays.equals(r3, r0)
            if (r0 == 0) goto L25
            writeProfileForO(r2, r4)
            return r1
        L25:
            byte[] r0 = androidx.profileinstaller.ProfileVersion.V009_O_MR1
            boolean r0 = java.util.Arrays.equals(r3, r0)
            if (r0 == 0) goto L31
            writeProfileForO_MR1(r2, r4)
            return r1
        L31:
            byte[] r0 = androidx.profileinstaller.ProfileVersion.V001_N
            boolean r3 = java.util.Arrays.equals(r3, r0)
            if (r3 == 0) goto L3d
            writeProfileForN(r2, r4)
            return r1
        L3d:
            r2 = 0
            return r2
    }

    private static void writeClasses(java.io.OutputStream r5, androidx.profileinstaller.DexProfileData r6) throws java.io.IOException {
            int[] r6 = r6.classes
            int r0 = r6.length
            r1 = 0
            r2 = r1
        L5:
            if (r1 >= r0) goto L1c
            r3 = r6[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r3.intValue()
            int r4 = r4 - r2
            androidx.profileinstaller.Encoding.writeUInt16(r5, r4)
            int r2 = r3.intValue()
            int r1 = r1 + 1
            goto L5
        L1c:
            return
    }

    private static androidx.profileinstaller.WritableFileSection writeDexFileSection(androidx.profileinstaller.DexProfileData[] r7) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            int r1 = r7.length     // Catch: java.lang.Throwable -> L70
            androidx.profileinstaller.Encoding.writeUInt16(r0, r1)     // Catch: java.lang.Throwable -> L70
            r1 = 0
            r2 = 2
            r3 = r1
        Lc:
            int r4 = r7.length     // Catch: java.lang.Throwable -> L70
            if (r3 >= r4) goto L3b
            r4 = r7[r3]     // Catch: java.lang.Throwable -> L70
            long r5 = r4.dexChecksum     // Catch: java.lang.Throwable -> L70
            androidx.profileinstaller.Encoding.writeUInt32(r0, r5)     // Catch: java.lang.Throwable -> L70
            long r5 = r4.mTypeIdCount     // Catch: java.lang.Throwable -> L70
            androidx.profileinstaller.Encoding.writeUInt32(r0, r5)     // Catch: java.lang.Throwable -> L70
            int r5 = r4.numMethodIds     // Catch: java.lang.Throwable -> L70
            long r5 = (long) r5     // Catch: java.lang.Throwable -> L70
            androidx.profileinstaller.Encoding.writeUInt32(r0, r5)     // Catch: java.lang.Throwable -> L70
            java.lang.String r5 = r4.apkName     // Catch: java.lang.Throwable -> L70
            java.lang.String r4 = r4.dexName     // Catch: java.lang.Throwable -> L70
            byte[] r6 = androidx.profileinstaller.ProfileVersion.V015_S     // Catch: java.lang.Throwable -> L70
            java.lang.String r4 = generateDexKey(r5, r4, r6)     // Catch: java.lang.Throwable -> L70
            int r2 = r2 + 14
            int r5 = androidx.profileinstaller.Encoding.utf8Length(r4)     // Catch: java.lang.Throwable -> L70
            androidx.profileinstaller.Encoding.writeUInt16(r0, r5)     // Catch: java.lang.Throwable -> L70
            int r2 = r2 + r5
            androidx.profileinstaller.Encoding.writeString(r0, r4)     // Catch: java.lang.Throwable -> L70
            int r3 = r3 + 1
            goto Lc
        L3b:
            byte[] r7 = r0.toByteArray()     // Catch: java.lang.Throwable -> L70
            int r3 = r7.length     // Catch: java.lang.Throwable -> L70
            if (r2 != r3) goto L4d
            androidx.profileinstaller.WritableFileSection r3 = new androidx.profileinstaller.WritableFileSection     // Catch: java.lang.Throwable -> L70
            androidx.profileinstaller.FileSectionType r4 = androidx.profileinstaller.FileSectionType.DEX_FILES     // Catch: java.lang.Throwable -> L70
            r3.<init>(r4, r2, r7, r1)     // Catch: java.lang.Throwable -> L70
            r0.close()
            return r3
        L4d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L70
            r1.<init>()     // Catch: java.lang.Throwable -> L70
            java.lang.String r3 = "Expected size "
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> L70
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L70
            java.lang.String r2 = ", does not match actual size "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L70
            int r7 = r7.length     // Catch: java.lang.Throwable -> L70
            java.lang.StringBuilder r7 = r1.append(r7)     // Catch: java.lang.Throwable -> L70
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L70
            java.lang.RuntimeException r7 = androidx.profileinstaller.Encoding.error(r7)     // Catch: java.lang.Throwable -> L70
            throw r7     // Catch: java.lang.Throwable -> L70
        L70:
            r7 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L75
            goto L79
        L75:
            r0 = move-exception
            r7.addSuppressed(r0)
        L79:
            throw r7
    }

    static void writeHeader(java.io.OutputStream r1, byte[] r2) throws java.io.IOException {
            byte[] r0 = androidx.profileinstaller.ProfileTranscoder.MAGIC_PROF
            r1.write(r0)
            r1.write(r2)
            return
    }

    private static void writeLineData(java.io.OutputStream r0, androidx.profileinstaller.DexProfileData r1) throws java.io.IOException {
            writeMethodsWithInlineCaches(r0, r1)
            writeClasses(r0, r1)
            writeMethodBitmap(r0, r1)
            return
    }

    private static void writeLineHeader(java.io.OutputStream r2, androidx.profileinstaller.DexProfileData r3, java.lang.String r4) throws java.io.IOException {
            int r0 = androidx.profileinstaller.Encoding.utf8Length(r4)
            androidx.profileinstaller.Encoding.writeUInt16(r2, r0)
            int r0 = r3.classSetSize
            androidx.profileinstaller.Encoding.writeUInt16(r2, r0)
            int r0 = r3.hotMethodRegionSize
            long r0 = (long) r0
            androidx.profileinstaller.Encoding.writeUInt32(r2, r0)
            long r0 = r3.dexChecksum
            androidx.profileinstaller.Encoding.writeUInt32(r2, r0)
            int r3 = r3.numMethodIds
            long r0 = (long) r3
            androidx.profileinstaller.Encoding.writeUInt32(r2, r0)
            androidx.profileinstaller.Encoding.writeString(r2, r4)
            return
    }

    private static void writeMethodBitmap(java.io.OutputStream r5, androidx.profileinstaller.DexProfileData r6) throws java.io.IOException {
            int r0 = r6.numMethodIds
            int r0 = getMethodBitmapStorageSize(r0)
            byte[] r0 = new byte[r0]
            java.util.TreeMap<java.lang.Integer, java.lang.Integer> r1 = r6.methods
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L43
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r2 = r2.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r4 = r2 & 2
            if (r4 == 0) goto L3a
            r4 = 2
            setMethodBitmapBit(r0, r4, r3, r6)
        L3a:
            r2 = r2 & 4
            if (r2 == 0) goto L12
            r2 = 4
            setMethodBitmapBit(r0, r2, r3, r6)
            goto L12
        L43:
            r5.write(r0)
            return
    }

    private static void writeMethodsWithInlineCaches(java.io.OutputStream r4, androidx.profileinstaller.DexProfileData r5) throws java.io.IOException {
            java.util.TreeMap<java.lang.Integer, java.lang.Integer> r5 = r5.methods
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
            r1 = r0
        Lc:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r2 = r2.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r2 = r2 & 1
            if (r2 != 0) goto L31
            goto Lc
        L31:
            int r1 = r3 - r1
            androidx.profileinstaller.Encoding.writeUInt16(r4, r1)
            androidx.profileinstaller.Encoding.writeUInt16(r4, r0)
            r1 = r3
            goto Lc
        L3b:
            return
    }

    private static void writeProfileForN(java.io.OutputStream r7, androidx.profileinstaller.DexProfileData[] r8) throws java.io.IOException {
            int r0 = r8.length
            androidx.profileinstaller.Encoding.writeUInt16(r7, r0)
            int r0 = r8.length
            r1 = 0
            r2 = r1
        L7:
            if (r2 >= r0) goto L62
            r3 = r8[r2]
            java.lang.String r4 = r3.apkName
            java.lang.String r5 = r3.dexName
            byte[] r6 = androidx.profileinstaller.ProfileVersion.V001_N
            java.lang.String r4 = generateDexKey(r4, r5, r6)
            int r5 = androidx.profileinstaller.Encoding.utf8Length(r4)
            androidx.profileinstaller.Encoding.writeUInt16(r7, r5)
            java.util.TreeMap<java.lang.Integer, java.lang.Integer> r5 = r3.methods
            int r5 = r5.size()
            androidx.profileinstaller.Encoding.writeUInt16(r7, r5)
            int[] r5 = r3.classes
            int r5 = r5.length
            androidx.profileinstaller.Encoding.writeUInt16(r7, r5)
            long r5 = r3.dexChecksum
            androidx.profileinstaller.Encoding.writeUInt32(r7, r5)
            androidx.profileinstaller.Encoding.writeString(r7, r4)
            java.util.TreeMap<java.lang.Integer, java.lang.Integer> r4 = r3.methods
            java.util.Set r4 = r4.keySet()
            java.util.Iterator r4 = r4.iterator()
        L3d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L51
            java.lang.Object r5 = r4.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            androidx.profileinstaller.Encoding.writeUInt16(r7, r5)
            goto L3d
        L51:
            int[] r3 = r3.classes
            int r4 = r3.length
            r5 = r1
        L55:
            if (r5 >= r4) goto L5f
            r6 = r3[r5]
            androidx.profileinstaller.Encoding.writeUInt16(r7, r6)
            int r5 = r5 + 1
            goto L55
        L5f:
            int r2 = r2 + 1
            goto L7
        L62:
            return
    }

    private static void writeProfileForO(java.io.OutputStream r8, androidx.profileinstaller.DexProfileData[] r9) throws java.io.IOException {
            int r0 = r9.length
            androidx.profileinstaller.Encoding.writeUInt8(r8, r0)
            int r0 = r9.length
            r1 = 0
            r2 = r1
        L7:
            if (r2 >= r0) goto L68
            r3 = r9[r2]
            java.util.TreeMap<java.lang.Integer, java.lang.Integer> r4 = r3.methods
            int r4 = r4.size()
            int r4 = r4 * 4
            java.lang.String r5 = r3.apkName
            java.lang.String r6 = r3.dexName
            byte[] r7 = androidx.profileinstaller.ProfileVersion.V005_O
            java.lang.String r5 = generateDexKey(r5, r6, r7)
            int r6 = androidx.profileinstaller.Encoding.utf8Length(r5)
            androidx.profileinstaller.Encoding.writeUInt16(r8, r6)
            int[] r6 = r3.classes
            int r6 = r6.length
            androidx.profileinstaller.Encoding.writeUInt16(r8, r6)
            long r6 = (long) r4
            androidx.profileinstaller.Encoding.writeUInt32(r8, r6)
            long r6 = r3.dexChecksum
            androidx.profileinstaller.Encoding.writeUInt32(r8, r6)
            androidx.profileinstaller.Encoding.writeString(r8, r5)
            java.util.TreeMap<java.lang.Integer, java.lang.Integer> r4 = r3.methods
            java.util.Set r4 = r4.keySet()
            java.util.Iterator r4 = r4.iterator()
        L40:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L57
            java.lang.Object r5 = r4.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            androidx.profileinstaller.Encoding.writeUInt16(r8, r5)
            androidx.profileinstaller.Encoding.writeUInt16(r8, r1)
            goto L40
        L57:
            int[] r3 = r3.classes
            int r4 = r3.length
            r5 = r1
        L5b:
            if (r5 >= r4) goto L65
            r6 = r3[r5]
            androidx.profileinstaller.Encoding.writeUInt16(r8, r6)
            int r5 = r5 + 1
            goto L5b
        L65:
            int r2 = r2 + 1
            goto L7
        L68:
            return
    }

    private static void writeProfileForO_MR1(java.io.OutputStream r1, androidx.profileinstaller.DexProfileData[] r2) throws java.io.IOException {
            byte[] r0 = androidx.profileinstaller.ProfileVersion.V009_O_MR1
            byte[] r0 = createCompressibleBody(r2, r0)
            int r2 = r2.length
            androidx.profileinstaller.Encoding.writeUInt8(r1, r2)
            androidx.profileinstaller.Encoding.writeCompressed(r1, r0)
            return
    }

    private static void writeProfileForP(java.io.OutputStream r1, androidx.profileinstaller.DexProfileData[] r2) throws java.io.IOException {
            byte[] r0 = androidx.profileinstaller.ProfileVersion.V010_P
            byte[] r0 = createCompressibleBody(r2, r0)
            int r2 = r2.length
            androidx.profileinstaller.Encoding.writeUInt8(r1, r2)
            androidx.profileinstaller.Encoding.writeCompressed(r1, r0)
            return
    }

    private static void writeProfileForS(java.io.OutputStream r0, androidx.profileinstaller.DexProfileData[] r1) throws java.io.IOException {
            writeProfileSections(r0, r1)
            return
    }

    private static void writeProfileSections(java.io.OutputStream r10, androidx.profileinstaller.DexProfileData[] r11) throws java.io.IOException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 3
            r0.<init>(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            androidx.profileinstaller.WritableFileSection r1 = writeDexFileSection(r11)
            r0.add(r1)
            androidx.profileinstaller.WritableFileSection r1 = createCompressibleClassSection(r11)
            r0.add(r1)
            androidx.profileinstaller.WritableFileSection r11 = createCompressibleMethodsSection(r11)
            r0.add(r11)
            byte[] r11 = androidx.profileinstaller.ProfileVersion.V015_S
            int r11 = r11.length
            long r3 = (long) r11
            byte[] r11 = androidx.profileinstaller.ProfileTranscoder.MAGIC_PROF
            int r11 = r11.length
            long r5 = (long) r11
            long r3 = r3 + r5
            r5 = 4
            long r3 = r3 + r5
            int r11 = r0.size()
            int r11 = r11 * 16
            long r5 = (long) r11
            long r3 = r3 + r5
            int r11 = r0.size()
            long r5 = (long) r11
            androidx.profileinstaller.Encoding.writeUInt32(r10, r5)
            r11 = 0
            r1 = r11
        L3e:
            int r5 = r0.size()
            if (r1 >= r5) goto L8a
            java.lang.Object r5 = r0.get(r1)
            androidx.profileinstaller.WritableFileSection r5 = (androidx.profileinstaller.WritableFileSection) r5
            androidx.profileinstaller.FileSectionType r6 = r5.mType
            long r6 = r6.getValue()
            androidx.profileinstaller.Encoding.writeUInt32(r10, r6)
            androidx.profileinstaller.Encoding.writeUInt32(r10, r3)
            boolean r6 = r5.mNeedsCompression
            if (r6 == 0) goto L71
            byte[] r6 = r5.mContents
            int r6 = r6.length
            long r6 = (long) r6
            byte[] r5 = r5.mContents
            byte[] r5 = androidx.profileinstaller.Encoding.compress(r5)
            r2.add(r5)
            int r8 = r5.length
            long r8 = (long) r8
            androidx.profileinstaller.Encoding.writeUInt32(r10, r8)
            androidx.profileinstaller.Encoding.writeUInt32(r10, r6)
            int r5 = r5.length
            goto L85
        L71:
            byte[] r6 = r5.mContents
            r2.add(r6)
            byte[] r6 = r5.mContents
            int r6 = r6.length
            long r6 = (long) r6
            androidx.profileinstaller.Encoding.writeUInt32(r10, r6)
            r6 = 0
            androidx.profileinstaller.Encoding.writeUInt32(r10, r6)
            byte[] r5 = r5.mContents
            int r5 = r5.length
        L85:
            long r5 = (long) r5
            long r3 = r3 + r5
            int r1 = r1 + 1
            goto L3e
        L8a:
            int r0 = r2.size()
            if (r11 >= r0) goto L9c
            java.lang.Object r0 = r2.get(r11)
            byte[] r0 = (byte[]) r0
            r10.write(r0)
            int r11 = r11 + 1
            goto L8a
        L9c:
            return
    }
}
