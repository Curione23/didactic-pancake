package net.java.openjdk.cacio.ctc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCFontManager.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCFontManager.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCFontManager.class */
public final class CTCFontManager extends sun.awt.FcFontManager {
    private static final int FOUNDRY_FIELD = 1;
    private static final int FAMILY_NAME_FIELD = 2;
    private static final int WEIGHT_NAME_FIELD = 3;
    private static final int SLANT_FIELD = 4;
    private static final int SETWIDTH_NAME_FIELD = 5;
    private static final int ADD_STYLE_NAME_FIELD = 6;
    private static final int PIXEL_SIZE_FIELD = 7;
    private static final int POINT_SIZE_FIELD = 8;
    private static final int RESOLUTION_X_FIELD = 9;
    private static final int RESOLUTION_Y_FIELD = 10;
    private static final int SPACING_FIELD = 11;
    private static final int AVERAGE_WIDTH_FIELD = 12;
    private static final int CHARSET_REGISTRY_FIELD = 13;
    private static final int CHARSET_ENCODING_FIELD = 14;
    private static java.util.Map fontNameMap;
    private static java.util.Map xlfdMap;
    private static java.util.Map xFontDirsMap;
    private static java.util.HashSet<java.lang.String> fontConfigDirs;
    java.util.HashMap<java.lang.String, java.lang.String> oblmap;
    private static java.util.HashMap registeredDirs;
    private static java.lang.String[] fontdirs;

    public CTCFontManager() {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = 0
            r0.oblmap = r1
            return
    }

    public static net.java.openjdk.cacio.ctc.CTCFontManager getInstance() {
            sun.font.SunFontManager r0 = sun.font.SunFontManager.getInstance()
            net.java.openjdk.cacio.ctc.CTCFontManager r0 = (net.java.openjdk.cacio.ctc.CTCFontManager) r0
            return r0
    }

    public java.lang.String getFileNameFromPlatformName(java.lang.String r6) {
            r5 = this;
            r0 = r6
            java.lang.String r1 = "/"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto Lb
            r0 = r6
            return r0
        Lb:
            r0 = 0
            r7 = r0
            r0 = r5
            r1 = r6
            java.lang.String r0 = r0.specificFontIDForName(r1)
            r8 = r0
            r0 = r5
            r1 = r6
            java.lang.String r0 = super.getFileNameFromPlatformName(r1)
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L9c
            r0 = r5
            boolean r0 = r0.isHeadless()
            if (r0 == 0) goto L2f
            r0 = r7
            java.lang.String r1 = "-"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L2f
            r0 = 0
            return r0
        L2f:
            r0 = r7
            java.lang.String r1 = "/"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L8b
            java.util.Map r0 = net.java.openjdk.cacio.ctc.CTCFontManager.xlfdMap
            r1 = r7
            java.lang.Object r0 = r0.get(r1)
            java.util.Vector r0 = (java.util.Vector) r0
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L7b
            r0 = r5
            sun.awt.FontConfiguration r0 = r0.getFontConfiguration()
            r1 = r7
            boolean r0 = r0.needToSearchForFile(r1)
            if (r0 == 0) goto L58
            r0 = 0
            r7 = r0
        L58:
            r0 = r7
            if (r0 == 0) goto L8b
            java.util.Vector r0 = new java.util.Vector
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r9
            r1 = r6
            boolean r0 = r0.add(r1)
            java.util.Map r0 = net.java.openjdk.cacio.ctc.CTCFontManager.xlfdMap
            r1 = r7
            r2 = r9
            java.lang.Object r0 = r0.put(r1, r2)
            goto L8b
        L7b:
            r0 = r9
            r1 = r6
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L8b
            r0 = r9
            r1 = r6
            boolean r0 = r0.add(r1)
        L8b:
            r0 = r7
            if (r0 == 0) goto L9c
            java.util.Map r0 = net.java.openjdk.cacio.ctc.CTCFontManager.fontNameMap
            r1 = r8
            r2 = r7
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            return r0
        L9c:
            r0 = r8
            if (r0 == 0) goto L19f
            java.util.Map r0 = net.java.openjdk.cacio.ctc.CTCFontManager.fontNameMap
            r1 = r8
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r7 = r0
            r0 = r7
            if (r0 != 0) goto Le1
            boolean r0 = sun.font.FontUtilities.isLinux
            if (r0 == 0) goto Le1
            boolean r0 = isOpenJDK()
            if (r0 != 0) goto Le1
            r0 = r5
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r0.oblmap
            if (r0 != 0) goto Lc8
            r0 = r5
            r0.initObliqueLucidaFontMap()
        Lc8:
            r0 = r5
            r1 = r8
            java.lang.String r0 = r0.getObliqueLucidaFontID(r1)
            r9 = r0
            r0 = r9
            if (r0 == 0) goto Le1
            r0 = r5
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r0.oblmap
            r1 = r9
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r7 = r0
        Le1:
            r0 = r5
            java.lang.String r0 = r0.fontPath
            if (r0 != 0) goto L169
            r0 = r7
            if (r0 == 0) goto Lf5
            r0 = r7
            java.lang.String r1 = "/"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L169
        Lf5:
            boolean r0 = sun.font.FontUtilities.debugFonts()
            if (r0 == 0) goto L114
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "** Registering all font paths because can't find file for "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
        L114:
            r0 = r5
            r1 = r5
            boolean r2 = net.java.openjdk.cacio.ctc.CTCFontManager.noType1Font
            java.lang.String r1 = r1.getPlatformFontPath(r2)
            r0.fontPath = r1
            r0 = r5
            java.lang.String r0 = r0.fontPath
            if (r0 != 0) goto L146
            r0 = r5
            java.lang.String r1 = "cacio.font.path"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "java.home"
            java.lang.String r3 = java.lang.System.getProperty(r3)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "/lib/fonts"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            r0.fontPath = r1
        L146:
            r0 = r5
            r1 = r5
            java.lang.String r1 = r1.fontPath
            r0.registerFontDirs(r1)
            boolean r0 = sun.font.FontUtilities.debugFonts()
            if (r0 == 0) goto L15c
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "** Finished registering all font paths"
            r0.println(r1)
        L15c:
            java.util.Map r0 = net.java.openjdk.cacio.ctc.CTCFontManager.fontNameMap
            r1 = r8
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r7 = r0
        L169:
            r0 = r7
            if (r0 != 0) goto L179
            r0 = r5
            boolean r0 = r0.isHeadless()
            if (r0 != 0) goto L179
            r0 = r6
            java.lang.String r0 = getCacioFontName(r0)
            r7 = r0
        L179:
            r0 = r7
            if (r0 != 0) goto L190
            r0 = r5
            r1 = r6
            java.lang.String r0 = r0.switchFontIDForName(r1)
            r8 = r0
            java.util.Map r0 = net.java.openjdk.cacio.ctc.CTCFontManager.fontNameMap
            r1 = r8
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r7 = r0
        L190:
            r0 = r7
            if (r0 == 0) goto L19f
            java.util.Map r0 = net.java.openjdk.cacio.ctc.CTCFontManager.fontNameMap
            r1 = r8
            r2 = r7
            java.lang.Object r0 = r0.put(r1, r2)
        L19f:
            r0 = r7
            return r0
    }

    protected java.lang.String[] getNativeNames(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            java.util.Map r0 = net.java.openjdk.cacio.ctc.CTCFontManager.xlfdMap
            r1 = r5
            java.lang.Object r0 = r0.get(r1)
            java.util.Vector r0 = (java.util.Vector) r0
            r1 = r0
            r7 = r1
            if (r0 != 0) goto L25
            r0 = r6
            if (r0 != 0) goto L17
            r0 = 0
            return r0
        L17:
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r8 = r0
            r0 = r8
            r1 = 0
            r2 = r6
            r0[r1] = r2
            r0 = r8
            return r0
        L25:
            r0 = r7
            int r0 = r0.size()
            r8 = r0
            r0 = r7
            r1 = r8
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    protected void registerFontDir(java.lang.String r6) {
            r5 = this;
            boolean r0 = sun.font.FontUtilities.debugFonts()
            if (r0 == 0) goto L1f
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "ParseFontDir "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
        L1f:
            java.io.File r0 = new java.io.File
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = java.io.File.separator
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "fonts.dir"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = r7
            boolean r0 = r0.canRead()     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            if (r0 == 0) goto L2e6
            java.io.FileReader r0 = new java.io.FileReader     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r1 = r0
            r2 = r7
            r1.<init>(r2)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r8 = r0
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r1 = r0
            r2 = r8
            r3 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r2, r3)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r9 = r0
            java.io.StreamTokenizer r0 = new java.io.StreamTokenizer     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r1 = r0
            r2 = r9
            r1.<init>(r2)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r10 = r0
            r0 = r10
            r1 = 1
            r0.eolIsSignificant(r1)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r0 = r10
            int r0 = r0.nextToken()     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r11 = r0
            r0 = r11
            r1 = -2
            if (r0 != r1) goto L2e2
            r0 = r10
            double r0 = r0.nval     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            int r0 = (int) r0     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r12 = r0
            r0 = r10
            int r0 = r0.nextToken()     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r11 = r0
            r0 = r11
            r1 = 10
            if (r0 != r1) goto L2e2
            r0 = r10
            r0.resetSyntax()     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r0 = r10
            r1 = 32
            r2 = 127(0x7f, float:1.78E-43)
            r0.wordChars(r1, r2)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r0 = r10
            r1 = 160(0xa0, float:2.24E-43)
            r2 = 255(0xff, float:3.57E-43)
            r0.wordChars(r1, r2)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r0 = r10
            r1 = 0
            r2 = 31
            r0.whitespaceChars(r1, r2)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r0 = 0
            r13 = r0
        Lb8:
            r0 = r13
            r1 = r12
            if (r0 >= r1) goto L2e2
            r0 = r10
            int r0 = r0.nextToken()     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r11 = r0
            r0 = r11
            r1 = -1
            if (r0 != r1) goto Lcf
            goto L2e2
        Lcf:
            r0 = r11
            r1 = -3
            if (r0 == r1) goto Ld9
            goto L2e2
        Ld9:
            r0 = r10
            java.lang.String r0 = r0.sval     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r1 = 32
            int r0 = r0.indexOf(r1)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r14 = r0
            r0 = r14
            if (r0 > 0) goto Lfe
            int r12 = r12 + 1
            r0 = r10
            int r0 = r0.nextToken()     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r11 = r0
            r0 = r11
            r1 = 10
            if (r0 == r1) goto L2dc
            goto L2e2
        Lfe:
            r0 = r10
            java.lang.String r0 = r0.sval     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r1 = 0
            char r0 = r0.charAt(r1)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r1 = 33
            if (r0 != r1) goto L120
            int r12 = r12 + 1
            r0 = r10
            int r0 = r0.nextToken()     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r11 = r0
            r0 = r11
            r1 = 10
            if (r0 == r1) goto L2dc
            goto L2e2
        L120:
            r0 = r10
            java.lang.String r0 = r0.sval     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r1 = 0
            r2 = r14
            java.lang.String r0 = r0.substring(r1, r2)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r15 = r0
            r0 = r15
            r1 = 58
            int r0 = r0.lastIndexOf(r1)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r16 = r0
            r0 = r16
            if (r0 <= 0) goto L155
            r0 = r16
            r1 = 1
            int r0 = r0 + r1
            r1 = r15
            int r1 = r1.length()     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            if (r0 < r1) goto L14a
            goto L2dc
        L14a:
            r0 = r15
            r1 = r16
            r2 = 1
            int r1 = r1 + r2
            java.lang.String r0 = r0.substring(r1)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r15 = r0
        L155:
            r0 = r10
            java.lang.String r0 = r0.sval     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r1 = r14
            r2 = 1
            int r1 = r1 + r2
            java.lang.String r0 = r0.substring(r1)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r17 = r0
            r0 = r5
            r1 = r17
            java.lang.String r0 = r0.specificFontIDForName(r1)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r18 = r0
            java.util.Map r0 = net.java.openjdk.cacio.ctc.CTCFontManager.fontNameMap     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r1 = r18
            java.lang.Object r0 = r0.get(r1)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r19 = r0
            boolean r0 = sun.font.FontUtilities.debugFonts()     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            if (r0 == 0) goto L1c8
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r2 = r1
            r2.<init>()     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            java.lang.String r2 = "file="
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r2 = r15
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            java.lang.String r2 = " xlfd="
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r2 = r17
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            java.lang.String r1 = r1.toString()     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r0.println(r1)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r2 = r1
            r2.<init>()     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            java.lang.String r2 = "fontID="
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r2 = r18
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            java.lang.String r2 = " sVal="
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r2 = r19
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            java.lang.String r1 = r1.toString()     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r0.println(r1)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
        L1c8:
            r0 = 0
            r20 = r0
            java.io.File r0 = new java.io.File     // Catch: java.io.IOException -> L1fd java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r1 = r0
            r2 = r6
            r3 = r15
            r1.<init>(r2, r3)     // Catch: java.io.IOException -> L1fd java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r21 = r0
            java.util.Map r0 = net.java.openjdk.cacio.ctc.CTCFontManager.xFontDirsMap     // Catch: java.io.IOException -> L1fd java.io.IOException -> L2f6 java.lang.Throwable -> L308
            if (r0 != 0) goto L1e7
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.io.IOException -> L1fd java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r1 = r0
            r1.<init>()     // Catch: java.io.IOException -> L1fd java.io.IOException -> L2f6 java.lang.Throwable -> L308
            net.java.openjdk.cacio.ctc.CTCFontManager.xFontDirsMap = r0     // Catch: java.io.IOException -> L1fd java.io.IOException -> L2f6 java.lang.Throwable -> L308
        L1e7:
            java.util.Map r0 = net.java.openjdk.cacio.ctc.CTCFontManager.xFontDirsMap     // Catch: java.io.IOException -> L1fd java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r1 = r18
            r2 = r6
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.io.IOException -> L1fd java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r0 = r21
            java.lang.String r0 = r0.getCanonicalPath()     // Catch: java.io.IOException -> L1fd java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r20 = r0
            goto L21a
        L1fd:
            r21 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r1 = r0
            r1.<init>()     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            java.lang.String r1 = java.io.File.separator     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r1 = r15
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r20 = r0
        L21a:
            java.util.Map r0 = net.java.openjdk.cacio.ctc.CTCFontManager.xlfdMap     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r1 = r20
            java.lang.Object r0 = r0.get(r1)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            java.util.Vector r0 = (java.util.Vector) r0     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r21 = r0
            boolean r0 = sun.font.FontUtilities.debugFonts()     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            if (r0 == 0) goto L253
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r2 = r1
            r2.<init>()     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            java.lang.String r2 = "fullPath="
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r2 = r20
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            java.lang.String r2 = " xVal="
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r2 = r21
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            java.lang.String r1 = r1.toString()     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r0.println(r1)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
        L253:
            r0 = r21
            if (r0 == 0) goto L262
            r0 = r21
            r1 = r17
            boolean r0 = r0.contains(r1)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            if (r0 != 0) goto L267
        L262:
            r0 = r19
            if (r0 == 0) goto L271
        L267:
            r0 = r19
            java.lang.String r1 = "/"
            boolean r0 = r0.startsWith(r1)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            if (r0 != 0) goto L2cb
        L271:
            boolean r0 = sun.font.FontUtilities.debugFonts()     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            if (r0 == 0) goto L29b
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r2 = r1
            r2.<init>()     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            java.lang.String r2 = "Map fontID:"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r2 = r18
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            java.lang.String r2 = "to file:"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r2 = r20
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            java.lang.String r1 = r1.toString()     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r0.println(r1)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
        L29b:
            java.util.Map r0 = net.java.openjdk.cacio.ctc.CTCFontManager.fontNameMap     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r1 = r18
            r2 = r20
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r0 = r21
            if (r0 != 0) goto L2c3
            java.util.Vector r0 = new java.util.Vector     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r1 = r0
            r1.<init>()     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r21 = r0
            java.util.Map r0 = net.java.openjdk.cacio.ctc.CTCFontManager.xlfdMap     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r1 = r20
            r2 = r21
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
        L2c3:
            r0 = r21
            r1 = r17
            boolean r0 = r0.add(r1)     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
        L2cb:
            r0 = r10
            int r0 = r0.nextToken()     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
            r11 = r0
            r0 = r11
            r1 = 10
            if (r0 == r1) goto L2dc
            goto L2e2
        L2dc:
            int r13 = r13 + 1
            goto Lb8
        L2e2:
            r0 = r8
            r0.close()     // Catch: java.io.IOException -> L2f6 java.lang.Throwable -> L308
        L2e6:
            r0 = r8
            if (r0 == 0) goto L31a
            r0 = r8
            r0.close()     // Catch: java.io.IOException -> L2f1
            goto L31a
        L2f1:
            r9 = move-exception
            goto L31a
        L2f6:
            r9 = move-exception
            r0 = r8
            if (r0 == 0) goto L31a
            r0 = r8
            r0.close()     // Catch: java.io.IOException -> L303
            goto L31a
        L303:
            r9 = move-exception
            goto L31a
        L308:
            r22 = move-exception
            r0 = r8
            if (r0 == 0) goto L317
            r0 = r8
            r0.close()     // Catch: java.io.IOException -> L315
            goto L317
        L315:
            r23 = move-exception
        L317:
            r0 = r22
            throw r0
        L31a:
            return
    }

    public void loadFonts() {
            r4 = this;
            r0 = r4
            super.loadFonts()
            r0 = 0
            net.java.openjdk.cacio.ctc.CTCFontManager.xFontDirsMap = r0
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r2 = 1
            r1.<init>(r2)
            net.java.openjdk.cacio.ctc.CTCFontManager.xlfdMap = r0
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r2 = 1
            r1.<init>(r2)
            net.java.openjdk.cacio.ctc.CTCFontManager.fontNameMap = r0
            return
    }

    private java.lang.String getObliqueLucidaFontID(java.lang.String r6) {
            r5 = this;
            r0 = r6
            java.lang.String r1 = "-lucidasans-medium-i-normal"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L24
            r0 = r6
            java.lang.String r1 = "-lucidasans-bold-i-normal"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L24
            r0 = r6
            java.lang.String r1 = "-lucidatypewriter-medium-i-normal"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L24
            r0 = r6
            java.lang.String r1 = "-lucidatypewriter-bold-i-normal"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L30
        L24:
            r0 = r6
            r1 = 0
            r2 = r6
            java.lang.String r3 = "-i-"
            int r2 = r2.indexOf(r3)
            java.lang.String r0 = r0.substring(r1, r2)
            return r0
        L30:
            r0 = 0
            return r0
    }

    private static java.lang.String getCacioFontName(java.lang.String r4) {
            r0 = r4
            java.lang.String r1 = "%d"
            java.lang.String r2 = "*"
            java.lang.String r0 = r0.replaceAll(r1, r2)
            r5 = r0
            r0 = r5
            boolean r0 = sun.font.NativeFont.fontExists(r0)
            if (r0 == 0) goto L12
            r0 = r5
            return r0
        L12:
            r0 = 0
            return r0
    }

    private void initObliqueLucidaFontMap() {
            r5 = this;
            r0 = r5
            java.util.HashMap r1 = new java.util.HashMap
            r2 = r1
            r2.<init>()
            r0.oblmap = r1
            r0 = r5
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r0.oblmap
            java.lang.String r1 = "-lucidasans-medium"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = net.java.openjdk.cacio.ctc.CTCFontManager.jreLibDirName
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "/fonts/LucidaSansRegular.ttf"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r5
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r0.oblmap
            java.lang.String r1 = "-lucidasans-bold"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = net.java.openjdk.cacio.ctc.CTCFontManager.jreLibDirName
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "/fonts/LucidaSansDemiBold.ttf"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r5
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r0.oblmap
            java.lang.String r1 = "-lucidatypewriter-medium"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = net.java.openjdk.cacio.ctc.CTCFontManager.jreLibDirName
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "/fonts/LucidaTypewriterRegular.ttf"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r5
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r0.oblmap
            java.lang.String r1 = "-lucidatypewriter-bold"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = net.java.openjdk.cacio.ctc.CTCFontManager.jreLibDirName
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "/fonts/LucidaTypewriterBold.ttf"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.Object r0 = r0.put(r1, r2)
            return
    }

    private boolean isHeadless() {
            r2 = this;
            r0 = 1
            return r0
    }

    private java.lang.String specificFontIDForName(java.lang.String r8) {
            r7 = this;
            r0 = 14
            int[] r0 = new int[r0]
            r9 = r0
            r0 = 1
            r10 = r0
            r0 = 1
            r11 = r0
        La:
            r0 = r11
            r1 = -1
            if (r0 == r1) goto L34
            r0 = r10
            r1 = 14
            if (r0 >= r1) goto L34
            r0 = r8
            r1 = 45
            r2 = r11
            int r0 = r0.indexOf(r1, r2)
            r11 = r0
            r0 = r11
            r1 = -1
            if (r0 == r1) goto La
            r0 = r9
            r1 = r10
            int r10 = r10 + 1
            r2 = r11
            r0[r1] = r2
            int r11 = r11 + 1
            goto La
        L34:
            r0 = r10
            r1 = 14
            if (r0 == r1) goto L5b
            boolean r0 = sun.font.FontUtilities.debugFonts()
            if (r0 == 0) goto L59
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Font Configuration Font ID is malformed:"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r8
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
        L59:
            r0 = r8
            return r0
        L5b:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = 1
            r3 = r3[r4]
            r4 = r9
            r5 = 5
            r4 = r4[r5]
            java.lang.String r2 = r2.substring(r3, r4)
            r1.<init>(r2)
            r12 = r0
            r0 = r12
            r1 = r8
            r2 = r9
            r3 = 12
            r2 = r2[r3]
            java.lang.String r1 = r1.substring(r2)
            java.lang.StringBuffer r0 = r0.append(r1)
            r0 = r12
            java.lang.String r0 = r0.toString()
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r0 = r0.toLowerCase(r1)
            r13 = r0
            r0 = r13
            return r0
    }

    private java.lang.String switchFontIDForName(java.lang.String r8) {
            r7 = this;
            r0 = 14
            int[] r0 = new int[r0]
            r9 = r0
            r0 = 1
            r10 = r0
            r0 = 1
            r11 = r0
        La:
            r0 = r11
            r1 = -1
            if (r0 == r1) goto L34
            r0 = r10
            r1 = 14
            if (r0 >= r1) goto L34
            r0 = r8
            r1 = 45
            r2 = r11
            int r0 = r0.indexOf(r1, r2)
            r11 = r0
            r0 = r11
            r1 = -1
            if (r0 == r1) goto La
            r0 = r9
            r1 = r10
            int r10 = r10 + 1
            r2 = r11
            r0[r1] = r2
            int r11 = r11 + 1
            goto La
        L34:
            r0 = r10
            r1 = 14
            if (r0 == r1) goto L5b
            boolean r0 = sun.font.FontUtilities.debugFonts()
            if (r0 == 0) goto L59
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Font Configuration Font ID is malformed:"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r8
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
        L59:
            r0 = r8
            return r0
        L5b:
            r0 = r8
            r1 = r9
            r2 = 3
            r1 = r1[r2]
            r2 = 1
            int r1 = r1 + r2
            r2 = r9
            r3 = 4
            r2 = r2[r3]
            java.lang.String r0 = r0.substring(r1, r2)
            r12 = r0
            r0 = r8
            r1 = r9
            r2 = 1
            r1 = r1[r2]
            r2 = 1
            int r1 = r1 + r2
            r2 = r9
            r3 = 2
            r2 = r2[r3]
            java.lang.String r0 = r0.substring(r1, r2)
            r13 = r0
            r0 = r8
            r1 = r9
            r2 = 12
            r1 = r1[r2]
            r2 = 1
            int r1 = r1 + r2
            r2 = r9
            r3 = 13
            r2 = r2[r3]
            java.lang.String r0 = r0.substring(r1, r2)
            r14 = r0
            r0 = r8
            r1 = r9
            r2 = 13
            r1 = r1[r2]
            r2 = 1
            int r1 = r1 + r2
            java.lang.String r0 = r0.substring(r1)
            r15 = r0
            r0 = r12
            java.lang.String r1 = "i"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto La4
            java.lang.String r0 = "o"
            r12 = r0
            goto Lb2
        La4:
            r0 = r12
            java.lang.String r1 = "o"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb2
            java.lang.String r0 = "i"
            r12 = r0
        Lb2:
            r0 = r13
            java.lang.String r1 = "itc zapfdingbats"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Ld4
            r0 = r14
            java.lang.String r1 = "sun"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Ld4
            r0 = r15
            java.lang.String r1 = "fontspecific"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Ld4
            java.lang.String r0 = "adobe"
            r14 = r0
        Ld4:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = 1
            r3 = r3[r4]
            r4 = r9
            r5 = 3
            r4 = r4[r5]
            r5 = 1
            int r4 = r4 + r5
            java.lang.String r2 = r2.substring(r3, r4)
            r1.<init>(r2)
            r16 = r0
            r0 = r16
            r1 = r12
            java.lang.StringBuffer r0 = r0.append(r1)
            r0 = r16
            r1 = r8
            r2 = r9
            r3 = 4
            r2 = r2[r3]
            r3 = r9
            r4 = 5
            r3 = r3[r4]
            r4 = 1
            int r3 = r3 + r4
            java.lang.String r1 = r1.substring(r2, r3)
            java.lang.StringBuffer r0 = r0.append(r1)
            r0 = r16
            r1 = r14
            java.lang.StringBuffer r0 = r0.append(r1)
            r0 = r16
            r1 = r8
            r2 = r9
            r3 = 13
            r2 = r2[r3]
            java.lang.String r1 = r1.substring(r2)
            java.lang.StringBuffer r0 = r0.append(r1)
            r0 = r16
            java.lang.String r0 = r0.toString()
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r0 = r0.toLowerCase(r1)
            r17 = r0
            r0 = r17
            return r0
    }

    public java.lang.String getFileNameFromXLFD(java.lang.String r4) {
            r3 = this;
            r0 = 0
            r5 = r0
            r0 = r3
            r1 = r4
            java.lang.String r0 = r0.specificFontIDForName(r1)
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L39
            java.util.Map r0 = net.java.openjdk.cacio.ctc.CTCFontManager.fontNameMap
            r1 = r6
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L30
            r0 = r3
            r1 = r4
            java.lang.String r0 = r0.switchFontIDForName(r1)
            r6 = r0
            java.util.Map r0 = net.java.openjdk.cacio.ctc.CTCFontManager.fontNameMap
            r1 = r6
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r5 = r0
        L30:
            r0 = r5
            if (r0 != 0) goto L39
            r0 = r3
            java.lang.String r0 = r0.getDefaultFontFile()
            r5 = r0
        L39:
            r0 = r5
            return r0
    }

    protected void registerFontDirs(java.lang.String r6) {
            r5 = this;
            java.util.StringTokenizer r0 = new java.util.StringTokenizer
            r1 = r0
            r2 = r6
            java.lang.String r3 = java.io.File.pathSeparator
            r1.<init>(r2, r3)
            r7 = r0
        Lc:
            r0 = r7
            boolean r0 = r0.hasMoreTokens()     // Catch: java.util.NoSuchElementException -> L3a
            if (r0 == 0) goto L37
            r0 = r7
            java.lang.String r0 = r0.nextToken()     // Catch: java.util.NoSuchElementException -> L3a
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L34
            java.util.HashMap r0 = net.java.openjdk.cacio.ctc.CTCFontManager.registeredDirs     // Catch: java.util.NoSuchElementException -> L3a
            r1 = r8
            boolean r0 = r0.containsKey(r1)     // Catch: java.util.NoSuchElementException -> L3a
            if (r0 != 0) goto L34
            java.util.HashMap r0 = net.java.openjdk.cacio.ctc.CTCFontManager.registeredDirs     // Catch: java.util.NoSuchElementException -> L3a
            r1 = r8
            r2 = 0
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.util.NoSuchElementException -> L3a
            r0 = r5
            r1 = r8
            r0.registerFontDir(r1)     // Catch: java.util.NoSuchElementException -> L3a
        L34:
            goto Lc
        L37:
            goto L3b
        L3a:
            r8 = move-exception
        L3b:
            return
    }

    protected void addFontToPlatformFontPath(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r0.getPlatformFontPathFromFontConfig()
            java.util.Map r0 = net.java.openjdk.cacio.ctc.CTCFontManager.xFontDirsMap
            if (r0 == 0) goto L29
            r0 = r3
            r1 = r4
            java.lang.String r0 = r0.specificFontIDForName(r1)
            r5 = r0
            java.util.Map r0 = net.java.openjdk.cacio.ctc.CTCFontManager.xFontDirsMap
            r1 = r5
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L29
            java.util.HashSet<java.lang.String> r0 = net.java.openjdk.cacio.ctc.CTCFontManager.fontConfigDirs
            r1 = r6
            boolean r0 = r0.add(r1)
        L29:
            return
    }

    private void getPlatformFontPathFromFontConfig() {
            r5 = this;
            java.util.HashSet<java.lang.String> r0 = net.java.openjdk.cacio.ctc.CTCFontManager.fontConfigDirs
            if (r0 != 0) goto L53
            r0 = r5
            sun.awt.FontConfiguration r0 = r0.getFontConfiguration()
            java.util.HashSet r0 = r0.getAWTFontPathSet()
            net.java.openjdk.cacio.ctc.CTCFontManager.fontConfigDirs = r0
            boolean r0 = sun.font.FontUtilities.debugFonts()
            if (r0 == 0) goto L53
            java.util.HashSet<java.lang.String> r0 = net.java.openjdk.cacio.ctc.CTCFontManager.fontConfigDirs
            if (r0 == 0) goto L53
            java.util.HashSet<java.lang.String> r0 = net.java.openjdk.cacio.ctc.CTCFontManager.fontConfigDirs
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r6 = r0
            r0 = 0
            r7 = r0
        L2c:
            r0 = r7
            r1 = r6
            int r1 = r1.length
            if (r0 >= r1) goto L53
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "awtfontpath : "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            r3 = r7
            r2 = r2[r3]
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            int r7 = r7 + 1
            goto L2c
        L53:
            return
    }

    protected void registerPlatformFontsUsedByFontConfiguration() {
            r4 = this;
            r0 = r4
            r0.getPlatformFontPathFromFontConfig()
            java.util.HashSet<java.lang.String> r0 = net.java.openjdk.cacio.ctc.CTCFontManager.fontConfigDirs
            if (r0 != 0) goto Lb
            return
        Lb:
            boolean r0 = sun.font.FontUtilities.isLinux
            if (r0 == 0) goto L33
            java.util.HashSet<java.lang.String> r0 = net.java.openjdk.cacio.ctc.CTCFontManager.fontConfigDirs
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = net.java.openjdk.cacio.ctc.CTCFontManager.jreLibDirName
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = java.io.File.separator
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "oblique-fonts"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.add(r1)
        L33:
            java.util.HashSet<java.lang.String> r0 = net.java.openjdk.cacio.ctc.CTCFontManager.fontConfigDirs
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.lang.String[] r0 = (java.lang.String[]) r0
            net.java.openjdk.cacio.ctc.CTCFontManager.fontdirs = r0
            return
    }

    protected sun.awt.FontConfiguration createFontConfiguration() {
            r4 = this;
            sun.awt.motif.MFontConfiguration r0 = new sun.awt.motif.MFontConfiguration
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            r5 = r0
            boolean r0 = sun.font.FontUtilities.isOpenSolaris
            if (r0 != 0) goto L30
            boolean r0 = sun.font.FontUtilities.isLinux
            if (r0 == 0) goto L23
            r0 = r5
            boolean r0 = r0.foundOsSpecificFile()
            if (r0 == 0) goto L30
            r0 = r5
            boolean r0 = r0.fontFilesArePresent()
            if (r0 == 0) goto L30
        L23:
            boolean r0 = sun.font.FontUtilities.isSolaris
            if (r0 == 0) goto L42
            r0 = r5
            boolean r0 = r0.fontFilesArePresent()
            if (r0 != 0) goto L42
        L30:
            sun.font.FcFontConfiguration r0 = new sun.font.FcFontConfiguration
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            r6 = r0
            r0 = r6
            boolean r0 = r0.init()
            if (r0 == 0) goto L42
            r0 = r6
            return r0
        L42:
            r0 = r5
            boolean r0 = r0.init()
            r0 = r5
            return r0
    }

    public sun.awt.FontConfiguration createFontConfiguration(boolean r7, boolean r8) {
            r6 = this;
            sun.awt.motif.MFontConfiguration r0 = new sun.awt.motif.MFontConfiguration
            r1 = r0
            r2 = r6
            r3 = r7
            r4 = r8
            r1.<init>(r2, r3, r4)
            return r0
    }

    protected synchronized java.lang.String getFontPath(boolean r5) {
            r4 = this;
            r0 = r4
            boolean r0 = r0.isHeadless()
            r0 = r4
            r1 = r5
            r2 = 1
            java.lang.String r0 = r0.getFontPathNative(r1, r2)
            return r0
    }

    protected javax.swing.plaf.FontUIResource getFontConfigFUIR(java.lang.String r7, int r8, int r9) {
            r6 = this;
            r0 = r6
            sun.font.FontConfigManager r0 = r0.getFontConfigManager()
            r1 = r7
            r2 = r8
            sun.font.CompositeFont r0 = r0.getFontConfigFont(r1, r2)
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L1b
            javax.swing.plaf.FontUIResource r0 = new javax.swing.plaf.FontUIResource
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r9
            r1.<init>(r2, r3, r4)
            return r0
        L1b:
            javax.swing.plaf.FontUIResource r0 = new javax.swing.plaf.FontUIResource
            r1 = r0
            r2 = r10
            r3 = 0
            java.lang.String r2 = r2.getFamilyName(r3)
            r3 = r8
            r4 = r9
            r1.<init>(r2, r3, r4)
            r11 = r0
            sun.font.FontAccess r0 = sun.font.FontAccess.getFontAccess()
            r1 = r11
            r2 = r10
            sun.font.Font2DHandle r2 = r2.handle
            r0.setFont2D(r1, r2)
            sun.font.FontAccess r0 = sun.font.FontAccess.getFontAccess()
            r1 = r11
            r0.setCreatedFont(r1)
            r0 = r11
            return r0
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            net.java.openjdk.cacio.ctc.CTCFontManager.fontNameMap = r0
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            net.java.openjdk.cacio.ctc.CTCFontManager.xlfdMap = r0
            r0 = 0
            net.java.openjdk.cacio.ctc.CTCFontManager.fontConfigDirs = r0
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            net.java.openjdk.cacio.ctc.CTCFontManager.registeredDirs = r0
            r0 = 0
            net.java.openjdk.cacio.ctc.CTCFontManager.fontdirs = r0
            return
    }
}
