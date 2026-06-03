package org.apache.commons.io;

/* JADX INFO: loaded from: classes2.dex */
public class FilenameUtils {
    private static final int BASE_16 = 16;
    private static final java.lang.String EMPTY_STRING = "";
    private static final java.lang.String[] EMPTY_STRING_ARRAY = null;
    public static final char EXTENSION_SEPARATOR = '.';
    public static final java.lang.String EXTENSION_SEPARATOR_STR = null;
    private static final int IPV4_MAX_OCTET_VALUE = 255;
    private static final java.util.regex.Pattern IPV4_PATTERN = null;
    private static final int IPV6_MAX_HEX_DIGITS_PER_GROUP = 4;
    private static final int IPV6_MAX_HEX_GROUPS = 8;
    private static final int MAX_UNSIGNED_SHORT = 65535;
    private static final int NOT_FOUND = -1;
    private static final char OTHER_SEPARATOR = 0;
    private static final java.util.regex.Pattern REG_NAME_PART_PATTERN = null;
    private static final char SYSTEM_NAME_SEPARATOR = 0;
    private static final char UNIX_NAME_SEPARATOR = '/';
    private static final char WINDOWS_NAME_SEPARATOR = '\\';

    public static /* synthetic */ boolean $r8$lambda$7lpm9zkoZuDoAjfOA0iYE2U94XQ(java.lang.String r0, java.lang.Object r1) {
            boolean r0 = r0.equals(r1)
            return r0
    }

    static {
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            org.apache.commons.io.FilenameUtils.EMPTY_STRING_ARRAY = r0
            r0 = 46
            java.lang.String r0 = java.lang.Character.toString(r0)
            org.apache.commons.io.FilenameUtils.EXTENSION_SEPARATOR_STR = r0
            char r0 = java.io.File.separatorChar
            org.apache.commons.io.FilenameUtils.SYSTEM_NAME_SEPARATOR = r0
            char r0 = flipSeparator(r0)
            org.apache.commons.io.FilenameUtils.OTHER_SEPARATOR = r0
            java.lang.String r0 = "^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            org.apache.commons.io.FilenameUtils.IPV4_PATTERN = r0
            java.lang.String r0 = "^[a-zA-Z0-9][a-zA-Z0-9-]*$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            org.apache.commons.io.FilenameUtils.REG_NAME_PART_PATTERN = r0
            return
    }

    @java.lang.Deprecated
    public FilenameUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String concat(java.lang.String r2, java.lang.String r3) {
            int r0 = getPrefixLength(r3)
            r1 = 0
            if (r0 >= 0) goto L8
            return r1
        L8:
            if (r0 <= 0) goto Lf
            java.lang.String r2 = normalize(r3)
            return r2
        Lf:
            if (r2 != 0) goto L12
            return r1
        L12:
            int r0 = r2.length()
            if (r0 != 0) goto L1d
            java.lang.String r2 = normalize(r3)
            return r2
        L1d:
            int r0 = r0 + (-1)
            char r0 = r2.charAt(r0)
            boolean r0 = isSeparator(r0)
            if (r0 == 0) goto L3f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = normalize(r2)
            return r2
        L3f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r2 = r0.append(r2)
            r0 = 47
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = normalize(r2)
            return r2
    }

    public static boolean directoryContains(java.lang.String r4, java.lang.String r5) {
            boolean r0 = isEmpty(r4)
            r1 = 0
            if (r0 != 0) goto L49
            boolean r0 = isEmpty(r5)
            if (r0 == 0) goto Le
            goto L49
        Le:
            org.apache.commons.io.IOCase r0 = org.apache.commons.io.IOCase.SYSTEM
            boolean r0 = r0.checkEquals(r4, r5)
            if (r0 == 0) goto L17
            return r1
        L17:
            char r0 = r4.charAt(r1)
            r2 = 47
            r3 = 1
            if (r0 != r2) goto L21
            r1 = r3
        L21:
            char r0 = toSeparator(r1)
            int r1 = r4.length()
            int r1 = r1 - r3
            char r1 = r4.charAt(r1)
            if (r1 != r0) goto L31
            goto L42
        L31:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
        L42:
            org.apache.commons.io.IOCase r0 = org.apache.commons.io.IOCase.SYSTEM
            boolean r4 = r0.checkStartsWith(r5, r4)
            return r4
        L49:
            return r1
    }

    private static java.lang.String doGetFullPath(java.lang.String r3, boolean r4) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int r1 = getPrefixLength(r3)
            if (r1 >= 0) goto Lb
            return r0
        Lb:
            int r0 = r3.length()
            if (r1 < r0) goto L18
            if (r4 == 0) goto L17
            java.lang.String r3 = getPrefix(r3)
        L17:
            return r3
        L18:
            int r0 = indexOfLastSeparator(r3)
            r2 = 0
            if (r0 >= 0) goto L24
            java.lang.String r3 = r3.substring(r2, r1)
            return r3
        L24:
            int r0 = r0 + r4
            if (r0 != 0) goto L29
            int r0 = r0 + 1
        L29:
            java.lang.String r3 = r3.substring(r2, r0)
            return r3
    }

    private static java.lang.String doGetPath(java.lang.String r3, int r4) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int r1 = getPrefixLength(r3)
            if (r1 >= 0) goto Lb
            return r0
        Lb:
            int r0 = indexOfLastSeparator(r3)
            int r4 = r4 + r0
            int r2 = r3.length()
            if (r1 >= r2) goto L24
            if (r0 < 0) goto L24
            if (r1 < r4) goto L1b
            goto L24
        L1b:
            java.lang.String r3 = r3.substring(r1, r4)
            java.lang.String r3 = requireNonNullChars(r3)
            return r3
        L24:
            java.lang.String r3 = ""
            return r3
    }

    private static java.lang.String doNormalize(java.lang.String r16, char r17, boolean r18) {
            r0 = r16
            r1 = r17
            r2 = 0
            if (r0 != 0) goto L8
            return r2
        L8:
            requireNonNullChars(r16)
            int r3 = r16.length()
            if (r3 != 0) goto L12
            return r0
        L12:
            int r4 = getPrefixLength(r16)
            if (r4 >= 0) goto L19
            return r2
        L19:
            int r5 = r3 + 2
            char[] r6 = new char[r5]
            int r7 = r16.length()
            r8 = 0
            r0.getChars(r8, r7, r6, r8)
            char r0 = flipSeparator(r17)
            r7 = r8
        L2a:
            if (r7 >= r5) goto L35
            char r9 = r6[r7]
            if (r9 != r0) goto L32
            r6[r7] = r1
        L32:
            int r7 = r7 + 1
            goto L2a
        L35:
            int r0 = r3 + (-1)
            char r0 = r6[r0]
            r5 = 1
            if (r0 == r1) goto L43
            int r0 = r3 + 1
            r6[r3] = r1
            r3 = r0
            r0 = r8
            goto L44
        L43:
            r0 = r5
        L44:
            if (r4 == 0) goto L48
            r7 = r4
            goto L49
        L48:
            r7 = r5
        L49:
            if (r7 >= r3) goto L60
            char r9 = r6[r7]
            if (r9 != r1) goto L5e
            int r9 = r7 + (-1)
            char r10 = r6[r9]
            if (r10 != r1) goto L5e
            int r10 = r3 - r7
            java.lang.System.arraycopy(r6, r7, r6, r9, r10)
            int r3 = r3 + (-1)
            int r7 = r7 + (-1)
        L5e:
            int r7 = r7 + r5
            goto L49
        L60:
            int r7 = r4 + 1
            r9 = r7
        L63:
            r10 = 46
            if (r9 >= r3) goto L8b
            char r11 = r6[r9]
            if (r11 != r1) goto L89
            int r11 = r9 + (-1)
            char r12 = r6[r11]
            if (r12 != r10) goto L89
            if (r9 == r7) goto L79
            int r10 = r9 + (-2)
            char r10 = r6[r10]
            if (r10 != r1) goto L89
        L79:
            int r10 = r3 + (-1)
            if (r9 != r10) goto L7e
            r0 = r5
        L7e:
            int r10 = r9 + 1
            int r12 = r3 - r9
            java.lang.System.arraycopy(r6, r10, r6, r11, r12)
            int r3 = r3 + (-2)
            int r9 = r9 + (-1)
        L89:
            int r9 = r9 + r5
            goto L63
        L8b:
            int r9 = r4 + 2
            r11 = r9
        L8e:
            if (r11 >= r3) goto Ld4
            char r12 = r6[r11]
            if (r12 != r1) goto Ld2
            int r12 = r11 + (-1)
            char r12 = r6[r12]
            if (r12 != r10) goto Ld2
            int r12 = r11 + (-2)
            char r12 = r6[r12]
            if (r12 != r10) goto Ld2
            if (r11 == r9) goto La8
            int r12 = r11 + (-3)
            char r12 = r6[r12]
            if (r12 != r1) goto Ld2
        La8:
            if (r11 != r9) goto Lab
            return r2
        Lab:
            int r12 = r3 + (-1)
            if (r11 != r12) goto Lb0
            r0 = r5
        Lb0:
            int r12 = r11 + (-4)
        Lb2:
            if (r12 < r4) goto Lc8
            char r13 = r6[r12]
            if (r13 != r1) goto Lc5
            int r13 = r11 + 1
            int r14 = r12 + 1
            int r15 = r3 - r11
            java.lang.System.arraycopy(r6, r13, r6, r14, r15)
            int r11 = r11 - r12
            int r3 = r3 - r11
            r11 = r14
            goto Ld2
        Lc5:
            int r12 = r12 + (-1)
            goto Lb2
        Lc8:
            int r12 = r11 + 1
            int r11 = r3 - r11
            java.lang.System.arraycopy(r6, r12, r6, r4, r11)
            int r12 = r12 - r4
            int r3 = r3 - r12
            r11 = r7
        Ld2:
            int r11 = r11 + r5
            goto L8e
        Ld4:
            if (r3 > 0) goto Ld9
            java.lang.String r0 = ""
            return r0
        Ld9:
            if (r3 > r4) goto Le1
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r8, r3)
            return r0
        Le1:
            if (r0 == 0) goto Leb
            if (r18 == 0) goto Leb
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r8, r3)
            return r0
        Leb:
            java.lang.String r0 = new java.lang.String
            int r3 = r3 - r5
            r0.<init>(r6, r8, r3)
            return r0
    }

    public static boolean equals(java.lang.String r2, java.lang.String r3) {
            r0 = 0
            org.apache.commons.io.IOCase r1 = org.apache.commons.io.IOCase.SENSITIVE
            boolean r2 = equals(r2, r3, r0, r1)
            return r2
    }

    public static boolean equals(java.lang.String r1, java.lang.String r2, boolean r3, org.apache.commons.io.IOCase r4) {
            r0 = 0
            if (r1 == 0) goto L21
            if (r2 != 0) goto L6
            goto L21
        L6:
            if (r3 == 0) goto L16
            java.lang.String r1 = normalize(r1)
            if (r1 != 0) goto Lf
            return r0
        Lf:
            java.lang.String r2 = normalize(r2)
            if (r2 != 0) goto L16
            return r0
        L16:
            org.apache.commons.io.IOCase r3 = org.apache.commons.io.IOCase.SENSITIVE
            org.apache.commons.io.IOCase r3 = org.apache.commons.io.IOCase.value(r4, r3)
            boolean r1 = r3.checkEquals(r1, r2)
            return r1
        L21:
            if (r1 != 0) goto L26
            if (r2 != 0) goto L26
            r0 = 1
        L26:
            return r0
    }

    public static boolean equalsNormalized(java.lang.String r2, java.lang.String r3) {
            r0 = 1
            org.apache.commons.io.IOCase r1 = org.apache.commons.io.IOCase.SENSITIVE
            boolean r2 = equals(r2, r3, r0, r1)
            return r2
    }

    public static boolean equalsNormalizedOnSystem(java.lang.String r2, java.lang.String r3) {
            r0 = 1
            org.apache.commons.io.IOCase r1 = org.apache.commons.io.IOCase.SYSTEM
            boolean r2 = equals(r2, r3, r0, r1)
            return r2
    }

    public static boolean equalsOnSystem(java.lang.String r2, java.lang.String r3) {
            r0 = 0
            org.apache.commons.io.IOCase r1 = org.apache.commons.io.IOCase.SYSTEM
            boolean r2 = equals(r2, r3, r0, r1)
            return r2
    }

    static char flipSeparator(char r2) {
            r0 = 92
            r1 = 47
            if (r2 != r1) goto L7
            return r0
        L7:
            if (r2 != r0) goto La
            return r1
        La:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.<init>(r2)
            throw r0
    }

    private static int getAdsCriticalOffset(java.lang.String r2) {
            char r0 = org.apache.commons.io.FilenameUtils.SYSTEM_NAME_SEPARATOR
            int r0 = r2.lastIndexOf(r0)
            char r1 = org.apache.commons.io.FilenameUtils.OTHER_SEPARATOR
            int r2 = r2.lastIndexOf(r1)
            r1 = -1
            if (r0 != r1) goto L16
            if (r2 != r1) goto L13
            r2 = 0
            return r2
        L13:
            int r2 = r2 + 1
            return r2
        L16:
            if (r2 != r1) goto L1b
            int r0 = r0 + 1
            return r0
        L1b:
            int r2 = java.lang.Math.max(r0, r2)
            int r2 = r2 + 1
            return r2
    }

    public static java.lang.String getBaseName(java.lang.String r0) {
            java.lang.String r0 = getName(r0)
            java.lang.String r0 = removeExtension(r0)
            return r0
    }

    public static java.lang.String getExtension(java.lang.String r2) throws java.lang.IllegalArgumentException {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            int r0 = indexOfExtension(r2)
            r1 = -1
            if (r0 != r1) goto Le
            java.lang.String r2 = ""
            return r2
        Le:
            int r0 = r0 + 1
            java.lang.String r2 = r2.substring(r0)
            return r2
    }

    public static java.lang.String getFullPath(java.lang.String r1) {
            r0 = 1
            java.lang.String r1 = doGetFullPath(r1, r0)
            return r1
    }

    public static java.lang.String getFullPathNoEndSeparator(java.lang.String r1) {
            r0 = 0
            java.lang.String r1 = doGetFullPath(r1, r0)
            return r1
    }

    public static java.lang.String getName(java.lang.String r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.lang.String r0 = requireNonNullChars(r1)
            int r1 = indexOfLastSeparator(r1)
            int r1 = r1 + 1
            java.lang.String r1 = r0.substring(r1)
            return r1
    }

    public static java.lang.String getPath(java.lang.String r1) {
            r0 = 1
            java.lang.String r1 = doGetPath(r1, r0)
            return r1
    }

    public static java.lang.String getPathNoEndSeparator(java.lang.String r1) {
            r0 = 0
            java.lang.String r1 = doGetPath(r1, r0)
            return r1
    }

    public static java.lang.String getPrefix(java.lang.String r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            int r1 = getPrefixLength(r2)
            if (r1 >= 0) goto Lb
            return r0
        Lb:
            int r0 = r2.length()
            if (r1 <= r0) goto L28
            requireNonNullChars(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r2 = r0.append(r2)
            r0 = 47
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
        L28:
            r0 = 0
            java.lang.String r2 = r2.substring(r0, r1)
            java.lang.String r2 = requireNonNullChars(r2)
            return r2
    }

    public static int getPrefixLength(java.lang.String r10) {
            r0 = -1
            if (r10 != 0) goto L4
            return r0
        L4:
            int r1 = r10.length()
            r2 = 0
            if (r1 != 0) goto Lc
            return r2
        Lc:
            char r3 = r10.charAt(r2)
            r4 = 58
            if (r3 != r4) goto L15
            return r0
        L15:
            r5 = 126(0x7e, float:1.77E-43)
            r6 = 1
            r7 = 2
            if (r1 != r6) goto L23
            if (r3 != r5) goto L1e
            return r7
        L1e:
            boolean r10 = isSeparator(r3)
            return r10
        L23:
            r8 = 92
            r9 = 47
            if (r3 != r5) goto L43
            int r2 = r10.indexOf(r9, r6)
            int r10 = r10.indexOf(r8, r6)
            if (r2 != r0) goto L37
            if (r10 != r0) goto L37
            int r1 = r1 + r6
            return r1
        L37:
            if (r2 != r0) goto L3a
            r2 = r10
        L3a:
            if (r10 != r0) goto L3d
            r10 = r2
        L3d:
            int r10 = java.lang.Math.min(r2, r10)
            int r10 = r10 + r6
            return r10
        L43:
            char r5 = r10.charAt(r6)
            if (r5 != r4) goto L76
            char r3 = java.lang.Character.toUpperCase(r3)
            r4 = 65
            if (r3 < r4) goto L72
            r4 = 90
            if (r3 > r4) goto L72
            if (r1 != r7) goto L62
            org.apache.commons.io.FileSystem r0 = org.apache.commons.io.FileSystem.getCurrent()
            boolean r0 = r0.supportsDriveLetter()
            if (r0 != 0) goto L62
            return r2
        L62:
            if (r1 == r7) goto L71
            char r10 = r10.charAt(r7)
            boolean r10 = isSeparator(r10)
            if (r10 != 0) goto L6f
            goto L71
        L6f:
            r10 = 3
            return r10
        L71:
            return r7
        L72:
            if (r3 != r9) goto L75
            return r6
        L75:
            return r0
        L76:
            boolean r1 = isSeparator(r3)
            if (r1 == 0) goto Lac
            boolean r1 = isSeparator(r5)
            if (r1 != 0) goto L83
            goto Lac
        L83:
            int r1 = r10.indexOf(r9, r7)
            int r2 = r10.indexOf(r8, r7)
            if (r1 != r0) goto L8f
            if (r2 == r0) goto Lab
        L8f:
            if (r1 == r7) goto Lab
            if (r2 != r7) goto L94
            goto Lab
        L94:
            if (r1 != r0) goto L97
            r1 = r2
        L97:
            if (r2 != r0) goto L9a
            r2 = r1
        L9a:
            int r1 = java.lang.Math.min(r1, r2)
            int r2 = r1 + 1
            java.lang.String r10 = r10.substring(r7, r1)
            boolean r10 = isValidHostName(r10)
            if (r10 == 0) goto Lab
            r0 = r2
        Lab:
            return r0
        Lac:
            boolean r10 = isSeparator(r3)
            return r10
    }

    public static int indexOfExtension(java.lang.String r3) throws java.lang.IllegalArgumentException {
            r0 = -1
            if (r3 != 0) goto L4
            return r0
        L4:
            boolean r1 = isSystemWindows()
            if (r1 == 0) goto L1f
            r1 = 58
            int r2 = getAdsCriticalOffset(r3)
            int r1 = r3.indexOf(r1, r2)
            if (r1 != r0) goto L17
            goto L1f
        L17:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "NTFS ADS separator (':') in file name is forbidden."
            r3.<init>(r0)
            throw r3
        L1f:
            r1 = 46
            int r1 = r3.lastIndexOf(r1)
            int r3 = indexOfLastSeparator(r3)
            if (r3 <= r1) goto L2c
            goto L2d
        L2c:
            r0 = r1
        L2d:
            return r0
    }

    public static int indexOfLastSeparator(java.lang.String r2) {
            if (r2 != 0) goto L4
            r2 = -1
            return r2
        L4:
            r0 = 47
            int r0 = r2.lastIndexOf(r0)
            r1 = 92
            int r2 = r2.lastIndexOf(r1)
            int r2 = java.lang.Math.max(r0, r2)
            return r2
    }

    private static boolean isEmpty(java.lang.String r0) {
            if (r0 == 0) goto Lb
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    public static boolean isExtension(java.lang.String r2, java.lang.String r3) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            requireNonNullChars(r2)
            boolean r1 = isEmpty(r3)
            if (r1 == 0) goto L16
            int r2 = indexOfExtension(r2)
            r3 = -1
            if (r2 != r3) goto L15
            r0 = 1
        L15:
            return r0
        L16:
            java.lang.String r2 = getExtension(r2)
            boolean r2 = r2.equals(r3)
            return r2
    }

    public static boolean isExtension(java.lang.String r2, java.util.Collection<java.lang.String> r3) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            requireNonNullChars(r2)
            if (r3 == 0) goto L19
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L10
            goto L19
        L10:
            java.lang.String r2 = getExtension(r2)
            boolean r2 = r3.contains(r2)
            return r2
        L19:
            int r2 = indexOfExtension(r2)
            r3 = -1
            if (r2 != r3) goto L21
            r0 = 1
        L21:
            return r0
    }

    public static boolean isExtension(java.lang.String r2, java.lang.String... r3) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            requireNonNullChars(r2)
            if (r3 == 0) goto L22
            int r1 = r3.length
            if (r1 != 0) goto Ld
            goto L22
        Ld:
            java.lang.String r2 = getExtension(r2)
            java.util.stream.Stream r3 = java.util.stream.Stream.of(r3)
            java.util.Objects.requireNonNull(r2)
            org.apache.commons.io.FilenameUtils$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.FilenameUtils$$ExternalSyntheticLambda0
            r0.<init>(r2)
            boolean r2 = r3.anyMatch(r0)
            return r2
        L22:
            int r2 = indexOfExtension(r2)
            r3 = -1
            if (r2 != r3) goto L2a
            r0 = 1
        L2a:
            return r0
    }

    private static boolean isIPv4Address(java.lang.String r7) {
            java.util.regex.Pattern r0 = org.apache.commons.io.FilenameUtils.IPV4_PATTERN
            java.util.regex.Matcher r7 = r0.matcher(r7)
            boolean r0 = r7.matches()
            r1 = 0
            if (r0 == 0) goto L39
            int r0 = r7.groupCount()
            r2 = 4
            if (r0 == r2) goto L15
            goto L39
        L15:
            r0 = 1
            r3 = r0
        L17:
            if (r3 > r2) goto L38
            java.lang.String r4 = r7.group(r3)
            int r5 = java.lang.Integer.parseInt(r4)
            r6 = 255(0xff, float:3.57E-43)
            if (r5 <= r6) goto L26
            return r1
        L26:
            int r5 = r4.length()
            if (r5 <= r0) goto L35
            java.lang.String r5 = "0"
            boolean r4 = r4.startsWith(r5)
            if (r4 == 0) goto L35
            return r1
        L35:
            int r3 = r3 + 1
            goto L17
        L38:
            return r0
        L39:
            return r1
    }

    private static boolean isIPv6Address(java.lang.String r9) {
            java.lang.String r0 = "::"
            boolean r1 = r9.contains(r0)
            r2 = 0
            if (r1 == 0) goto L14
            int r3 = r9.indexOf(r0)
            int r4 = r9.lastIndexOf(r0)
            if (r3 == r4) goto L14
            return r2
        L14:
            java.lang.String r3 = ":"
            boolean r4 = r9.startsWith(r3)
            if (r4 == 0) goto L22
            boolean r4 = r9.startsWith(r0)
            if (r4 == 0) goto L2e
        L22:
            boolean r4 = r9.endsWith(r3)
            if (r4 == 0) goto L2f
            boolean r4 = r9.endsWith(r0)
            if (r4 != 0) goto L2f
        L2e:
            return r2
        L2f:
            java.lang.String[] r3 = r9.split(r3)
            if (r1 == 0) goto L62
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.List r3 = java.util.Arrays.asList(r3)
            r4.<init>(r3)
            boolean r3 = r9.endsWith(r0)
            if (r3 == 0) goto L4a
            java.lang.String r9 = ""
            r4.add(r9)
            goto L59
        L4a:
            boolean r9 = r9.startsWith(r0)
            if (r9 == 0) goto L59
            boolean r9 = r4.isEmpty()
            if (r9 != 0) goto L59
            r4.remove(r2)
        L59:
            java.lang.String[] r9 = org.apache.commons.io.FilenameUtils.EMPTY_STRING_ARRAY
            java.lang.Object[] r9 = r4.toArray(r9)
            r3 = r9
            java.lang.String[] r3 = (java.lang.String[]) r3
        L62:
            int r9 = r3.length
            r0 = 8
            if (r9 <= r0) goto L68
            return r2
        L68:
            r9 = r2
            r4 = r9
            r5 = r4
        L6b:
            int r6 = r3.length
            r7 = 1
            if (r9 >= r6) goto Laf
            r6 = r3[r9]
            boolean r8 = r6.isEmpty()
            if (r8 == 0) goto L7b
            int r5 = r5 + r7
            if (r5 <= r7) goto La9
            return r2
        L7b:
            int r5 = r3.length
            int r5 = r5 - r7
            if (r9 != r5) goto L92
            java.lang.String r5 = "."
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L92
            boolean r5 = isIPv4Address(r6)
            if (r5 != 0) goto L8e
            return r2
        L8e:
            int r4 = r4 + 2
            r5 = r2
            goto Lab
        L92:
            int r5 = r6.length()
            r7 = 4
            if (r5 <= r7) goto L9a
            return r2
        L9a:
            r5 = 16
            int r5 = java.lang.Integer.parseInt(r6, r5)     // Catch: java.lang.NumberFormatException -> Lae
            if (r5 < 0) goto Lae
            r6 = 65535(0xffff, float:9.1834E-41)
            if (r5 <= r6) goto La8
            goto Lae
        La8:
            r5 = r2
        La9:
            int r4 = r4 + 1
        Lab:
            int r9 = r9 + 1
            goto L6b
        Lae:
            return r2
        Laf:
            if (r4 > r0) goto Lb6
            if (r4 >= r0) goto Lb5
            if (r1 == 0) goto Lb6
        Lb5:
            r2 = r7
        Lb6:
            return r2
    }

    private static boolean isRFC3986HostName(java.lang.String r4) {
            java.lang.String r0 = "\\."
            r1 = -1
            java.lang.String[] r4 = r4.split(r0, r1)
            r0 = 0
            r1 = r0
        L9:
            int r2 = r4.length
            r3 = 1
            if (r1 >= r2) goto L2d
            r2 = r4[r1]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L1b
            int r4 = r4.length
            int r4 = r4 - r3
            if (r1 != r4) goto L1a
            r0 = r3
        L1a:
            return r0
        L1b:
            java.util.regex.Pattern r2 = org.apache.commons.io.FilenameUtils.REG_NAME_PART_PATTERN
            r3 = r4[r1]
            java.util.regex.Matcher r2 = r2.matcher(r3)
            boolean r2 = r2.matches()
            if (r2 != 0) goto L2a
            return r0
        L2a:
            int r1 = r1 + 1
            goto L9
        L2d:
            return r3
    }

    private static boolean isSeparator(char r1) {
            r0 = 47
            if (r1 == r0) goto Lb
            r0 = 92
            if (r1 != r0) goto L9
            goto Lb
        L9:
            r1 = 0
            goto Lc
        Lb:
            r1 = 1
        Lc:
            return r1
    }

    static boolean isSystemWindows() {
            char r0 = org.apache.commons.io.FilenameUtils.SYSTEM_NAME_SEPARATOR
            r1 = 92
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    private static boolean isValidHostName(java.lang.String r1) {
            boolean r0 = isIPv6Address(r1)
            if (r0 != 0) goto Lf
            boolean r1 = isRFC3986HostName(r1)
            if (r1 == 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            goto L10
        Lf:
            r1 = 1
        L10:
            return r1
    }

    public static java.lang.String normalize(java.lang.String r2) {
            char r0 = org.apache.commons.io.FilenameUtils.SYSTEM_NAME_SEPARATOR
            r1 = 1
            java.lang.String r2 = doNormalize(r2, r0, r1)
            return r2
    }

    public static java.lang.String normalize(java.lang.String r1, boolean r2) {
            char r2 = toSeparator(r2)
            r0 = 1
            java.lang.String r1 = doNormalize(r1, r2, r0)
            return r1
    }

    public static java.lang.String normalizeNoEndSeparator(java.lang.String r2) {
            char r0 = org.apache.commons.io.FilenameUtils.SYSTEM_NAME_SEPARATOR
            r1 = 0
            java.lang.String r2 = doNormalize(r2, r0, r1)
            return r2
    }

    public static java.lang.String normalizeNoEndSeparator(java.lang.String r1, boolean r2) {
            char r2 = toSeparator(r2)
            r0 = 0
            java.lang.String r1 = doNormalize(r1, r2, r0)
            return r1
    }

    public static java.lang.String removeExtension(java.lang.String r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            requireNonNullChars(r2)
            int r0 = indexOfExtension(r2)
            r1 = -1
            if (r0 != r1) goto Lf
            return r2
        Lf:
            r1 = 0
            java.lang.String r2 = r2.substring(r1, r0)
            return r2
    }

    private static java.lang.String requireNonNullChars(java.lang.String r1) {
            r0 = 0
            int r0 = r1.indexOf(r0)
            if (r0 >= 0) goto L8
            return r1
        L8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Null character present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it"
            r1.<init>(r0)
            throw r1
    }

    public static java.lang.String separatorsToSystem(java.lang.String r1) {
            org.apache.commons.io.FileSystem r0 = org.apache.commons.io.FileSystem.getCurrent()
            java.lang.String r1 = r0.normalizeSeparators(r1)
            return r1
    }

    public static java.lang.String separatorsToUnix(java.lang.String r1) {
            org.apache.commons.io.FileSystem r0 = org.apache.commons.io.FileSystem.LINUX
            java.lang.String r1 = r0.normalizeSeparators(r1)
            return r1
    }

    public static java.lang.String separatorsToWindows(java.lang.String r1) {
            org.apache.commons.io.FileSystem r0 = org.apache.commons.io.FileSystem.WINDOWS
            java.lang.String r1 = r0.normalizeSeparators(r1)
            return r1
    }

    static java.lang.String[] splitOnTokens(java.lang.String r10) {
            r0 = 63
            int r1 = r10.indexOf(r0)
            r2 = 42
            r3 = 0
            r4 = -1
            if (r1 != r4) goto L18
            int r1 = r10.indexOf(r2)
            if (r1 != r4) goto L18
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r0[r3] = r10
            return r0
        L18:
            char[] r10 = r10.toCharArray()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r5 = r10.length
            r6 = r3
            r7 = r6
        L29:
            if (r6 >= r5) goto L59
            char r8 = r10[r6]
            if (r8 == r0) goto L36
            if (r8 != r2) goto L32
            goto L36
        L32:
            r4.append(r8)
            goto L55
        L36:
            int r9 = r4.length()
            if (r9 == 0) goto L46
            java.lang.String r9 = r4.toString()
            r1.add(r9)
            r4.setLength(r3)
        L46:
            if (r8 != r0) goto L4e
            java.lang.String r7 = "?"
            r1.add(r7)
            goto L55
        L4e:
            if (r7 == r2) goto L55
            java.lang.String r7 = "*"
            r1.add(r7)
        L55:
            int r6 = r6 + 1
            r7 = r8
            goto L29
        L59:
            int r10 = r4.length()
            if (r10 == 0) goto L66
            java.lang.String r10 = r4.toString()
            r1.add(r10)
        L66:
            java.lang.String[] r10 = org.apache.commons.io.FilenameUtils.EMPTY_STRING_ARRAY
            java.lang.Object[] r10 = r1.toArray(r10)
            java.lang.String[] r10 = (java.lang.String[]) r10
            return r10
    }

    private static char toSeparator(boolean r0) {
            if (r0 == 0) goto L5
            r0 = 47
            goto L7
        L5:
            r0 = 92
        L7:
            return r0
    }

    public static boolean wildcardMatch(java.lang.String r1, java.lang.String r2) {
            org.apache.commons.io.IOCase r0 = org.apache.commons.io.IOCase.SENSITIVE
            boolean r1 = wildcardMatch(r1, r2, r0)
            return r1
    }

    public static boolean wildcardMatch(java.lang.String r8, java.lang.String r9, org.apache.commons.io.IOCase r10) {
            r0 = 1
            if (r8 != 0) goto L6
            if (r9 != 0) goto L6
            return r0
        L6:
            r1 = 0
            if (r8 == 0) goto La0
            if (r9 != 0) goto Ld
            goto La0
        Ld:
            org.apache.commons.io.IOCase r2 = org.apache.commons.io.IOCase.SENSITIVE
            org.apache.commons.io.IOCase r10 = org.apache.commons.io.IOCase.value(r10, r2)
            java.lang.String[] r9 = splitOnTokens(r9)
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            int r3 = r9.length
            r2.<init>(r3)
            r3 = r1
            r4 = r3
            r5 = r4
        L20:
            boolean r6 = r2.isEmpty()
            if (r6 != 0) goto L31
            java.lang.Object r3 = r2.pop()
            int[] r3 = (int[]) r3
            r5 = r3[r1]
            r4 = r3[r0]
            r3 = r0
        L31:
            int r6 = r9.length
            if (r5 >= r6) goto L90
            r6 = r9[r5]
            java.lang.String r7 = "?"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L49
            int r4 = r4 + 1
            int r6 = r8.length()
            if (r4 <= r6) goto L47
            goto L90
        L47:
            r3 = r1
            goto L8d
        L49:
            r6 = r9[r5]
            java.lang.String r7 = "*"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L5e
            int r3 = r9.length
            int r3 = r3 - r0
            if (r5 != r3) goto L5c
            int r3 = r8.length()
            r4 = r3
        L5c:
            r3 = r0
            goto L8d
        L5e:
            if (r3 == 0) goto L7c
            r6 = r9[r5]
            int r4 = r10.checkIndexOf(r8, r4, r6)
            r6 = -1
            if (r4 != r6) goto L6a
            goto L90
        L6a:
            int r3 = r4 + 1
            r6 = r9[r5]
            int r3 = r10.checkIndexOf(r8, r3, r6)
            if (r3 < 0) goto L85
            int[] r3 = new int[]{r5, r3}
            r2.push(r3)
            goto L85
        L7c:
            r6 = r9[r5]
            boolean r6 = r10.checkRegionMatches(r8, r4, r6)
            if (r6 != 0) goto L85
            goto L90
        L85:
            r3 = r9[r5]
            int r3 = r3.length()
            int r4 = r4 + r3
            goto L47
        L8d:
            int r5 = r5 + 1
            goto L31
        L90:
            int r6 = r9.length
            if (r5 != r6) goto L9a
            int r6 = r8.length()
            if (r4 != r6) goto L9a
            return r0
        L9a:
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L20
        La0:
            return r1
    }

    public static boolean wildcardMatchOnSystem(java.lang.String r1, java.lang.String r2) {
            org.apache.commons.io.IOCase r0 = org.apache.commons.io.IOCase.SYSTEM
            boolean r1 = wildcardMatch(r1, r2, r0)
            return r1
    }
}
