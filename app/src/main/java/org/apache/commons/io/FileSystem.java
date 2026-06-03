package org.apache.commons.io;

/* JADX INFO: loaded from: classes2.dex */
public enum FileSystem extends java.lang.Enum<org.apache.commons.io.FileSystem> {
    private static final /* synthetic */ org.apache.commons.io.FileSystem[] $VALUES = null;
    private static final org.apache.commons.io.FileSystem CURRENT = null;
    public static final org.apache.commons.io.FileSystem GENERIC = null;
    private static final boolean IS_OS_LINUX = false;
    private static final boolean IS_OS_MAC = false;
    private static final boolean IS_OS_WINDOWS = false;
    public static final org.apache.commons.io.FileSystem LINUX = null;
    public static final org.apache.commons.io.FileSystem MAC_OSX = null;
    private static final java.lang.String OS_NAME_WINDOWS_PREFIX = "Windows";
    public static final org.apache.commons.io.FileSystem WINDOWS = null;
    private final int blockSize;
    private final boolean casePreserving;
    private final boolean caseSensitive;
    private final int[] illegalFileNameChars;
    private final int maxFileNameLength;
    private final int maxPathLength;
    private final char nameSeparator;
    private final char nameSeparatorOther;
    private final java.lang.String[] reservedFileNames;
    private final boolean reservedFileNamesExtensions;
    private final boolean supportsDriveLetter;

    public static /* synthetic */ boolean $r8$lambda$kbJ6R4FYGPrxzqRzzr4AXRsbN0M(org.apache.commons.io.FileSystem r0, int r1) {
            boolean r0 = r0.isIllegalFileNameChar(r1)
            return r0
    }

    private static /* synthetic */ org.apache.commons.io.FileSystem[] $values() {
            org.apache.commons.io.FileSystem r0 = org.apache.commons.io.FileSystem.GENERIC
            org.apache.commons.io.FileSystem r1 = org.apache.commons.io.FileSystem.LINUX
            org.apache.commons.io.FileSystem r2 = org.apache.commons.io.FileSystem.MAC_OSX
            org.apache.commons.io.FileSystem r3 = org.apache.commons.io.FileSystem.WINDOWS
            org.apache.commons.io.FileSystem[] r0 = new org.apache.commons.io.FileSystem[]{r0, r1, r2, r3}
            return r0
    }

    static {
            org.apache.commons.io.FileSystem r13 = new org.apache.commons.io.FileSystem
            r14 = 0
            int[] r8 = new int[]{r14}
            java.lang.String[] r9 = new java.lang.String[r14]
            r11 = 0
            r12 = 47
            java.lang.String r1 = "GENERIC"
            r2 = 0
            r3 = 4096(0x1000, float:5.74E-42)
            r4 = 0
            r5 = 0
            r6 = 2147483647(0x7fffffff, float:NaN)
            r7 = 2147483647(0x7fffffff, float:NaN)
            r10 = 0
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            org.apache.commons.io.FileSystem.GENERIC = r13
            org.apache.commons.io.FileSystem r0 = new org.apache.commons.io.FileSystem
            r1 = 47
            int[] r23 = new int[]{r14, r1}
            java.lang.String[] r2 = new java.lang.String[r14]
            r26 = 0
            r27 = 47
            java.lang.String r16 = "LINUX"
            r17 = 1
            r18 = 8192(0x2000, float:1.148E-41)
            r19 = 1
            r20 = 1
            r21 = 255(0xff, float:3.57E-43)
            r22 = 4096(0x1000, float:5.74E-42)
            r25 = 0
            r15 = r0
            r24 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            org.apache.commons.io.FileSystem.LINUX = r0
            org.apache.commons.io.FileSystem r0 = new org.apache.commons.io.FileSystem
            r2 = 58
            int[] r36 = new int[]{r14, r1, r2}
            java.lang.String[] r1 = new java.lang.String[r14]
            r39 = 0
            r40 = 47
            java.lang.String r29 = "MAC_OSX"
            r30 = 2
            r31 = 4096(0x1000, float:5.74E-42)
            r32 = 1
            r33 = 1
            r34 = 255(0xff, float:3.57E-43)
            r35 = 1024(0x400, float:1.435E-42)
            r38 = 0
            r28 = r0
            r37 = r1
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            org.apache.commons.io.FileSystem.MAC_OSX = r0
            org.apache.commons.io.FileSystem r0 = new org.apache.commons.io.FileSystem
            r1 = 41
            int[] r1 = new int[r1]
            r1 = {x0140: FILL_ARRAY_DATA , data: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 34, 42, 47, 58, 60, 62, 63, 92, 124} // fill-array
            r2 = 24
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.String r3 = "AUX"
            r2[r14] = r3
            java.lang.String r3 = "COM1"
            r4 = 1
            r2[r4] = r3
            java.lang.String r3 = "COM2"
            r4 = 2
            r2[r4] = r3
            java.lang.String r3 = "COM3"
            r4 = 3
            r2[r4] = r3
            java.lang.String r3 = "COM4"
            r4 = 4
            r2[r4] = r3
            java.lang.String r3 = "COM5"
            r4 = 5
            r2[r4] = r3
            java.lang.String r3 = "COM6"
            r4 = 6
            r2[r4] = r3
            java.lang.String r3 = "COM7"
            r4 = 7
            r2[r4] = r3
            java.lang.String r3 = "COM8"
            r4 = 8
            r2[r4] = r3
            java.lang.String r3 = "COM9"
            r4 = 9
            r2[r4] = r3
            java.lang.String r3 = "CON"
            r4 = 10
            r2[r4] = r3
            java.lang.String r3 = "CONIN$"
            r4 = 11
            r2[r4] = r3
            java.lang.String r3 = "CONOUT$"
            r4 = 12
            r2[r4] = r3
            java.lang.String r3 = "LPT1"
            r4 = 13
            r2[r4] = r3
            java.lang.String r3 = "LPT2"
            r4 = 14
            r2[r4] = r3
            java.lang.String r3 = "LPT3"
            r4 = 15
            r2[r4] = r3
            java.lang.String r3 = "LPT4"
            r4 = 16
            r2[r4] = r3
            java.lang.String r3 = "LPT5"
            r4 = 17
            r2[r4] = r3
            java.lang.String r3 = "LPT6"
            r4 = 18
            r2[r4] = r3
            java.lang.String r3 = "LPT7"
            r4 = 19
            r2[r4] = r3
            r3 = 20
            java.lang.String r4 = "LPT8"
            r2[r3] = r4
            r3 = 21
            java.lang.String r4 = "LPT9"
            r2[r3] = r4
            r3 = 22
            java.lang.String r4 = "NUL"
            r2[r3] = r4
            r3 = 23
            java.lang.String r4 = "PRN"
            r2[r3] = r4
            r26 = 1
            r27 = 92
            java.lang.String r16 = "WINDOWS"
            r17 = 3
            r18 = 4096(0x1000, float:5.74E-42)
            r19 = 0
            r22 = 32000(0x7d00, float:4.4842E-41)
            r25 = 1
            r15 = r0
            r23 = r1
            r24 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            org.apache.commons.io.FileSystem.WINDOWS = r0
            org.apache.commons.io.FileSystem[] r0 = $values()
            org.apache.commons.io.FileSystem.$VALUES = r0
            java.lang.String r0 = "Linux"
            boolean r0 = getOsMatchesName(r0)
            org.apache.commons.io.FileSystem.IS_OS_LINUX = r0
            java.lang.String r0 = "Mac"
            boolean r0 = getOsMatchesName(r0)
            org.apache.commons.io.FileSystem.IS_OS_MAC = r0
            java.lang.String r0 = "Windows"
            boolean r0 = getOsMatchesName(r0)
            org.apache.commons.io.FileSystem.IS_OS_WINDOWS = r0
            org.apache.commons.io.FileSystem r0 = current()
            org.apache.commons.io.FileSystem.CURRENT = r0
            return
    }

    FileSystem(java.lang.String r1, int r2, int r3, boolean r4, boolean r5, int r6, int r7, int[] r8, java.lang.String[] r9, boolean r10, boolean r11, char r12) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.blockSize = r3
            r0.maxFileNameLength = r6
            r0.maxPathLength = r7
            java.lang.String r1 = "illegalFileNameChars"
            java.lang.Object r1 = java.util.Objects.requireNonNull(r8, r1)
            int[] r1 = (int[]) r1
            r0.illegalFileNameChars = r1
            java.lang.String r1 = "reservedFileNames"
            java.lang.Object r1 = java.util.Objects.requireNonNull(r9, r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            r0.reservedFileNames = r1
            r0.reservedFileNamesExtensions = r10
            r0.caseSensitive = r4
            r0.casePreserving = r5
            r0.supportsDriveLetter = r11
            r0.nameSeparator = r12
            char r1 = org.apache.commons.io.FilenameUtils.flipSeparator(r12)
            r0.nameSeparatorOther = r1
            return
    }

    private static org.apache.commons.io.FileSystem current() {
            boolean r0 = org.apache.commons.io.FileSystem.IS_OS_LINUX
            if (r0 == 0) goto L7
            org.apache.commons.io.FileSystem r0 = org.apache.commons.io.FileSystem.LINUX
            return r0
        L7:
            boolean r0 = org.apache.commons.io.FileSystem.IS_OS_MAC
            if (r0 == 0) goto Le
            org.apache.commons.io.FileSystem r0 = org.apache.commons.io.FileSystem.MAC_OSX
            return r0
        Le:
            boolean r0 = org.apache.commons.io.FileSystem.IS_OS_WINDOWS
            if (r0 == 0) goto L15
            org.apache.commons.io.FileSystem r0 = org.apache.commons.io.FileSystem.WINDOWS
            return r0
        L15:
            org.apache.commons.io.FileSystem r0 = org.apache.commons.io.FileSystem.GENERIC
            return r0
    }

    public static org.apache.commons.io.FileSystem getCurrent() {
            org.apache.commons.io.FileSystem r0 = org.apache.commons.io.FileSystem.CURRENT
            return r0
    }

    private static boolean getOsMatchesName(java.lang.String r1) {
            java.lang.String r0 = "os.name"
            java.lang.String r0 = getSystemProperty(r0)
            boolean r1 = isOsNameMatch(r0, r1)
            return r1
    }

    private static java.lang.String getSystemProperty(java.lang.String r3) {
            java.lang.String r3 = java.lang.System.getProperty(r3)     // Catch: java.lang.SecurityException -> L5
            return r3
        L5:
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Caught a SecurityException reading the system property '"
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = "'; the SystemUtils property value will default to null."
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            r0.println(r3)
            r3 = 0
            return r3
    }

    private static int indexOf(java.lang.CharSequence r8, int r9, int r10) {
            boolean r0 = r8 instanceof java.lang.String
            if (r0 == 0) goto Lb
            java.lang.String r8 = (java.lang.String) r8
            int r8 = r8.indexOf(r9, r10)
            return r8
        Lb:
            int r0 = r8.length()
            r1 = 0
            if (r10 >= 0) goto L13
            r10 = r1
        L13:
            r2 = 65536(0x10000, float:9.1835E-41)
            r3 = -1
            if (r9 >= r2) goto L25
        L18:
            if (r10 >= r0) goto L24
            char r1 = r8.charAt(r10)
            if (r1 != r9) goto L21
            return r10
        L21:
            int r10 = r10 + 1
            goto L18
        L24:
            return r3
        L25:
            r2 = 1114111(0x10ffff, float:1.561202E-39)
            if (r9 > r2) goto L48
            char[] r9 = java.lang.Character.toChars(r9)
        L2e:
            r2 = 1
            int r4 = r0 + (-1)
            if (r10 >= r4) goto L48
            char r4 = r8.charAt(r10)
            int r5 = r10 + 1
            char r6 = r8.charAt(r5)
            char r7 = r9[r1]
            if (r4 != r7) goto L46
            char r2 = r9[r2]
            if (r6 != r2) goto L46
            return r10
        L46:
            r10 = r5
            goto L2e
        L48:
            return r3
    }

    private boolean isIllegalFileNameChar(int r2) {
            r1 = this;
            int[] r0 = r1.illegalFileNameChars
            int r2 = java.util.Arrays.binarySearch(r0, r2)
            if (r2 < 0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            return r2
    }

    private static boolean isOsNameMatch(java.lang.String r1, java.lang.String r2) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toUpperCase(r0)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toUpperCase(r0)
            boolean r1 = r1.startsWith(r2)
            return r1
    }

    private static java.lang.String replace(java.lang.String r0, char r1, char r2) {
            if (r0 != 0) goto L4
            r0 = 0
            goto L8
        L4:
            java.lang.String r0 = r0.replace(r1, r2)
        L8:
            return r0
    }

    public static org.apache.commons.io.FileSystem valueOf(java.lang.String r1) {
            java.lang.Class<org.apache.commons.io.FileSystem> r0 = org.apache.commons.io.FileSystem.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            org.apache.commons.io.FileSystem r1 = (org.apache.commons.io.FileSystem) r1
            return r1
    }

    public static org.apache.commons.io.FileSystem[] values() {
            org.apache.commons.io.FileSystem[] r0 = org.apache.commons.io.FileSystem.$VALUES
            java.lang.Object r0 = r0.clone()
            org.apache.commons.io.FileSystem[] r0 = (org.apache.commons.io.FileSystem[]) r0
            return r0
    }

    public int getBlockSize() {
            r1 = this;
            int r0 = r1.blockSize
            return r0
    }

    public char[] getIllegalFileNameChars() {
            r4 = this;
            int[] r0 = r4.illegalFileNameChars
            int r0 = r0.length
            char[] r0 = new char[r0]
            r1 = 0
        L6:
            int[] r2 = r4.illegalFileNameChars
            int r3 = r2.length
            if (r1 >= r3) goto L13
            r2 = r2[r1]
            char r2 = (char) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto L6
        L13:
            return r0
    }

    public int[] getIllegalFileNameCodePoints() {
            r1 = this;
            int[] r0 = r1.illegalFileNameChars
            java.lang.Object r0 = r0.clone()
            int[] r0 = (int[]) r0
            return r0
    }

    public int getMaxFileNameLength() {
            r1 = this;
            int r0 = r1.maxFileNameLength
            return r0
    }

    public int getMaxPathLength() {
            r1 = this;
            int r0 = r1.maxPathLength
            return r0
    }

    public char getNameSeparator() {
            r1 = this;
            char r0 = r1.nameSeparator
            return r0
    }

    public java.lang.String[] getReservedFileNames() {
            r1 = this;
            java.lang.String[] r0 = r1.reservedFileNames
            java.lang.Object r0 = r0.clone()
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    public boolean isCasePreserving() {
            r1 = this;
            boolean r0 = r1.casePreserving
            return r0
    }

    public boolean isCaseSensitive() {
            r1 = this;
            boolean r0 = r1.caseSensitive
            return r0
    }

    public boolean isLegalFileName(java.lang.CharSequence r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L27
            int r1 = r4.length()
            if (r1 == 0) goto L27
            int r1 = r4.length()
            int r2 = r3.maxFileNameLength
            if (r1 <= r2) goto L12
            goto L27
        L12:
            boolean r1 = r3.isReservedFileName(r4)
            if (r1 == 0) goto L19
            return r0
        L19:
            java.util.stream.IntStream r4 = r4.chars()
            org.apache.commons.io.FileSystem$$ExternalSyntheticLambda1 r0 = new org.apache.commons.io.FileSystem$$ExternalSyntheticLambda1
            r0.<init>(r3)
            boolean r4 = r4.noneMatch(r0)
            return r4
        L27:
            return r0
    }

    public boolean isReservedFileName(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = r1.reservedFileNamesExtensions
            if (r0 == 0) goto L8
            java.lang.CharSequence r2 = r1.trimExtension(r2)
        L8:
            java.lang.String[] r0 = r1.reservedFileNames
            int r2 = java.util.Arrays.binarySearch(r0, r2)
            if (r2 < 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    /* JADX INFO: renamed from: lambda$toLegalFileName$0$org-apache-commons-io-FileSystem, reason: not valid java name */
    /* synthetic */ int m2570lambda$toLegalFileName$0$orgapachecommonsioFileSystem(char r2, int r3) {
            r1 = this;
            boolean r0 = r1.isIllegalFileNameChar(r3)
            if (r0 == 0) goto L7
            goto L8
        L7:
            r2 = r3
        L8:
            return r2
    }

    public java.lang.String normalizeSeparators(java.lang.String r3) {
            r2 = this;
            char r0 = r2.nameSeparatorOther
            char r1 = r2.nameSeparator
            java.lang.String r3 = replace(r3, r0, r1)
            return r3
    }

    public boolean supportsDriveLetter() {
            r1 = this;
            boolean r0 = r1.supportsDriveLetter
            return r0
    }

    public java.lang.String toLegalFileName(java.lang.String r4, char r5) {
            r3 = this;
            boolean r0 = r3.isIllegalFileNameChar(r5)
            if (r0 == 0) goto L29
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            if (r5 != 0) goto Ld
            java.lang.String r5 = "\\0"
            goto L11
        Ld:
            java.lang.Character r5 = java.lang.Character.valueOf(r5)
        L11:
            java.lang.String r0 = r3.name()
            int[] r1 = r3.illegalFileNameChars
            java.lang.String r1 = java.util.Arrays.toString(r1)
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r0, r1}
            java.lang.String r0 = "The replacement character '%s' cannot be one of the %s illegal characters: %s"
            java.lang.String r5 = java.lang.String.format(r0, r5)
            r4.<init>(r5)
            throw r4
        L29:
            int r0 = r4.length()
            int r1 = r3.maxFileNameLength
            r2 = 0
            if (r0 <= r1) goto L36
            java.lang.String r4 = r4.substring(r2, r1)
        L36:
            java.util.stream.IntStream r4 = r4.chars()
            org.apache.commons.io.FileSystem$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.FileSystem$$ExternalSyntheticLambda0
            r0.<init>(r3, r5)
            java.util.stream.IntStream r4 = r4.map(r0)
            int[] r4 = r4.toArray()
            java.lang.String r5 = new java.lang.String
            int r0 = r4.length
            r5.<init>(r4, r2, r0)
            return r5
    }

    java.lang.CharSequence trimExtension(java.lang.CharSequence r3) {
            r2 = this;
            r0 = 46
            r1 = 0
            int r0 = indexOf(r3, r0, r1)
            if (r0 >= 0) goto La
            goto Le
        La:
            java.lang.CharSequence r3 = r3.subSequence(r1, r0)
        Le:
            return r3
    }
}
