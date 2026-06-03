package com.github.caciocavallosilano.cacio.ctc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCFontManager.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCFontManager.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCFontManager.class */
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

    public static com.github.caciocavallosilano.cacio.ctc.CTCFontManager getInstance() {
            sun.font.SunFontManager r0 = sun.font.SunFontManager.getInstance()
            com.github.caciocavallosilano.cacio.ctc.CTCFontManager r0 = (com.github.caciocavallosilano.cacio.ctc.CTCFontManager) r0
            return r0
    }

    public java.lang.String getFileNameFromPlatformName(java.lang.String r5) {
            r4 = this;
            r0 = r5
            java.lang.String r1 = "/"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto Lb
            r0 = r5
            return r0
        Lb:
            r0 = 0
            r6 = r0
            r0 = r4
            r1 = r5
            java.lang.String r0 = r0.specificFontIDForName(r1)
            r7 = r0
            r0 = r4
            r1 = r5
            java.lang.String r0 = super.getFileNameFromPlatformName(r1)
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L9c
            r0 = r4
            boolean r0 = r0.isHeadless()
            if (r0 == 0) goto L2f
            r0 = r6
            java.lang.String r1 = "-"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L2f
            r0 = 0
            return r0
        L2f:
            r0 = r6
            java.lang.String r1 = "/"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L8b
            java.util.Map r0 = com.github.caciocavallosilano.cacio.ctc.CTCFontManager.xlfdMap
            r1 = r6
            java.lang.Object r0 = r0.get(r1)
            java.util.Vector r0 = (java.util.Vector) r0
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L7b
            r0 = r4
            sun.awt.FontConfiguration r0 = r0.getFontConfiguration()
            r1 = r6
            boolean r0 = r0.needToSearchForFile(r1)
            if (r0 == 0) goto L58
            r0 = 0
            r6 = r0
        L58:
            r0 = r6
            if (r0 == 0) goto L8b
            java.util.Vector r0 = new java.util.Vector
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r8
            r1 = r5
            boolean r0 = r0.add(r1)
            java.util.Map r0 = com.github.caciocavallosilano.cacio.ctc.CTCFontManager.xlfdMap
            r1 = r6
            r2 = r8
            java.lang.Object r0 = r0.put(r1, r2)
            goto L8b
        L7b:
            r0 = r8
            r1 = r5
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L8b
            r0 = r8
            r1 = r5
            boolean r0 = r0.add(r1)
        L8b:
            r0 = r6
            if (r0 == 0) goto L9c
            java.util.Map r0 = com.github.caciocavallosilano.cacio.ctc.CTCFontManager.fontNameMap
            r1 = r7
            r2 = r6
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r6
            return r0
        L9c:
            r0 = r7
            if (r0 == 0) goto L151
            java.util.Map r0 = com.github.caciocavallosilano.cacio.ctc.CTCFontManager.fontNameMap
            r1 = r7
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r6 = r0
            r0 = r4
            java.lang.String r0 = r0.fontPath
            if (r0 != 0) goto L11b
            r0 = r6
            if (r0 == 0) goto Lc1
            r0 = r6
            java.lang.String r1 = "/"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L11b
        Lc1:
            boolean r0 = sun.font.FontUtilities.debugFonts()
            if (r0 == 0) goto Ld3
            java.io.PrintStream r0 = java.lang.System.out
            r1 = r5
            java.lang.String r1 = "** Registering all font paths because can't find file for " + r1
            r0.println(r1)
        Ld3:
            r0 = r4
            r1 = r4
            boolean r2 = com.github.caciocavallosilano.cacio.ctc.CTCFontManager.noType1Font
            java.lang.String r1 = r1.getPlatformFontPath(r2)
            r0.fontPath = r1
            r0 = r4
            java.lang.String r0 = r0.fontPath
            if (r0 != 0) goto Lf8
            r0 = r4
            java.lang.String r1 = "cacio.font.path"
            java.lang.String r2 = "java.home"
            java.lang.String r2 = java.lang.System.getProperty(r2)
            java.lang.String r2 = r2 + "/lib/fonts"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            r0.fontPath = r1
        Lf8:
            r0 = r4
            r1 = r4
            java.lang.String r1 = r1.fontPath
            r0.registerFontDirs(r1)
            boolean r0 = sun.font.FontUtilities.debugFonts()
            if (r0 == 0) goto L10e
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "** Finished registering all font paths"
            r0.println(r1)
        L10e:
            java.util.Map r0 = com.github.caciocavallosilano.cacio.ctc.CTCFontManager.fontNameMap
            r1 = r7
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r6 = r0
        L11b:
            r0 = r6
            if (r0 != 0) goto L12b
            r0 = r4
            boolean r0 = r0.isHeadless()
            if (r0 != 0) goto L12b
            r0 = r5
            java.lang.String r0 = getCacioFontName(r0)
            r6 = r0
        L12b:
            r0 = r6
            if (r0 != 0) goto L142
            r0 = r4
            r1 = r5
            java.lang.String r0 = r0.switchFontIDForName(r1)
            r7 = r0
            java.util.Map r0 = com.github.caciocavallosilano.cacio.ctc.CTCFontManager.fontNameMap
            r1 = r7
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r6 = r0
        L142:
            r0 = r6
            if (r0 == 0) goto L151
            java.util.Map r0 = com.github.caciocavallosilano.cacio.ctc.CTCFontManager.fontNameMap
            r1 = r7
            r2 = r6
            java.lang.Object r0 = r0.put(r1, r2)
        L151:
            r0 = r6
            return r0
    }

    protected java.lang.String[] getNativeNames(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            java.util.Map r0 = com.github.caciocavallosilano.cacio.ctc.CTCFontManager.xlfdMap
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
            return r0
    }

    protected void registerFontDir(java.lang.String r6) {
            r5 = this;
            boolean r0 = sun.font.FontUtilities.debugFonts()
            if (r0 == 0) goto L12
            java.io.PrintStream r0 = java.lang.System.out
            r1 = r6
            java.lang.String r1 = "ParseFontDir " + r1
            r0.println(r1)
        L12:
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r6
            java.lang.String r3 = java.io.File.separator
            java.lang.String r2 = r2 + r3 + "fonts.dir"
            r1.<init>(r2)
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = r7
            boolean r0 = r0.canRead()     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            if (r0 == 0) goto L26a
            java.io.FileReader r0 = new java.io.FileReader     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r1 = r0
            r2 = r7
            r1.<init>(r2)     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r8 = r0
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r1 = r0
            r2 = r8
            r3 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r2, r3)     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r9 = r0
            java.io.StreamTokenizer r0 = new java.io.StreamTokenizer     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r1 = r0
            r2 = r9
            r1.<init>(r2)     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r10 = r0
            r0 = r10
            r1 = 1
            r0.eolIsSignificant(r1)     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r0 = r10
            int r0 = r0.nextToken()     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r11 = r0
            r0 = r11
            r1 = -2
            if (r0 != r1) goto L266
            r0 = r10
            double r0 = r0.nval     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            int r0 = (int) r0     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r12 = r0
            r0 = r10
            int r0 = r0.nextToken()     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r11 = r0
            r0 = r11
            r1 = 10
            if (r0 != r1) goto L266
            r0 = r10
            r0.resetSyntax()     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r0 = r10
            r1 = 32
            r2 = 127(0x7f, float:1.78E-43)
            r0.wordChars(r1, r2)     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r0 = r10
            r1 = 160(0xa0, float:2.24E-43)
            r2 = 255(0xff, float:3.57E-43)
            r0.wordChars(r1, r2)     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r0 = r10
            r1 = 0
            r2 = 31
            r0.whitespaceChars(r1, r2)     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r0 = 0
            r13 = r0
        L9b:
            r0 = r13
            r1 = r12
            if (r0 >= r1) goto L266
            r0 = r10
            int r0 = r0.nextToken()     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r11 = r0
            r0 = r11
            r1 = -1
            if (r0 != r1) goto Lb2
            goto L266
        Lb2:
            r0 = r11
            r1 = -3
            if (r0 == r1) goto Lbc
            goto L266
        Lbc:
            r0 = r10
            java.lang.String r0 = r0.sval     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r1 = 32
            int r0 = r0.indexOf(r1)     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r14 = r0
            r0 = r14
            if (r0 > 0) goto Le1
            int r12 = r12 + 1
            r0 = r10
            int r0 = r0.nextToken()     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r11 = r0
            r0 = r11
            r1 = 10
            if (r0 == r1) goto L260
            goto L266
        Le1:
            r0 = r10
            java.lang.String r0 = r0.sval     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r1 = 0
            char r0 = r0.charAt(r1)     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r1 = 33
            if (r0 != r1) goto L103
            int r12 = r12 + 1
            r0 = r10
            int r0 = r0.nextToken()     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r11 = r0
            r0 = r11
            r1 = 10
            if (r0 == r1) goto L260
            goto L266
        L103:
            r0 = r10
            java.lang.String r0 = r0.sval     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r1 = 0
            r2 = r14
            java.lang.String r0 = r0.substring(r1, r2)     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r15 = r0
            r0 = r15
            r1 = 58
            int r0 = r0.lastIndexOf(r1)     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r16 = r0
            r0 = r16
            if (r0 <= 0) goto L138
            r0 = r16
            r1 = 1
            int r0 = r0 + r1
            r1 = r15
            int r1 = r1.length()     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            if (r0 < r1) goto L12d
            goto L260
        L12d:
            r0 = r15
            r1 = r16
            r2 = 1
            int r1 = r1 + r2
            java.lang.String r0 = r0.substring(r1)     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r15 = r0
        L138:
            r0 = r10
            java.lang.String r0 = r0.sval     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r1 = r14
            r2 = 1
            int r1 = r1 + r2
            java.lang.String r0 = r0.substring(r1)     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r17 = r0
            r0 = r5
            r1 = r17
            java.lang.String r0 = r0.specificFontIDForName(r1)     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r18 = r0
            java.util.Map r0 = com.github.caciocavallosilano.cacio.ctc.CTCFontManager.fontNameMap     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r1 = r18
            java.lang.Object r0 = r0.get(r1)     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r19 = r0
            boolean r0 = sun.font.FontUtilities.debugFonts()     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            if (r0 == 0) goto L181
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r1 = r15
            r2 = r17
            java.lang.String r1 = "file=" + r1 + " xlfd=" + r2     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r0.println(r1)     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r1 = r18
            r2 = r19
            java.lang.String r1 = "fontID=" + r1 + " sVal=" + r2     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r0.println(r1)     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
        L181:
            r0 = 0
            r20 = r0
            java.io.File r0 = new java.io.File     // Catch: java.io.IOException -> L1b6 java.io.IOException -> L27a java.lang.Throwable -> L28c
            r1 = r0
            r2 = r6
            r3 = r15
            r1.<init>(r2, r3)     // Catch: java.io.IOException -> L1b6 java.io.IOException -> L27a java.lang.Throwable -> L28c
            r21 = r0
            java.util.Map r0 = com.github.caciocavallosilano.cacio.ctc.CTCFontManager.xFontDirsMap     // Catch: java.io.IOException -> L1b6 java.io.IOException -> L27a java.lang.Throwable -> L28c
            if (r0 != 0) goto L1a0
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.io.IOException -> L1b6 java.io.IOException -> L27a java.lang.Throwable -> L28c
            r1 = r0
            r1.<init>()     // Catch: java.io.IOException -> L1b6 java.io.IOException -> L27a java.lang.Throwable -> L28c
            com.github.caciocavallosilano.cacio.ctc.CTCFontManager.xFontDirsMap = r0     // Catch: java.io.IOException -> L1b6 java.io.IOException -> L27a java.lang.Throwable -> L28c
        L1a0:
            java.util.Map r0 = com.github.caciocavallosilano.cacio.ctc.CTCFontManager.xFontDirsMap     // Catch: java.io.IOException -> L1b6 java.io.IOException -> L27a java.lang.Throwable -> L28c
            r1 = r18
            r2 = r6
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.io.IOException -> L1b6 java.io.IOException -> L27a java.lang.Throwable -> L28c
            r0 = r21
            java.lang.String r0 = r0.getCanonicalPath()     // Catch: java.io.IOException -> L1b6 java.io.IOException -> L27a java.lang.Throwable -> L28c
            r20 = r0
            goto L1c5
        L1b6:
            r21 = move-exception
            r0 = r6
            java.lang.String r1 = java.io.File.separator     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r2 = r15
            java.lang.String r0 = r0 + r1 + r2     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r20 = r0
        L1c5:
            java.util.Map r0 = com.github.caciocavallosilano.cacio.ctc.CTCFontManager.xlfdMap     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r1 = r20
            java.lang.Object r0 = r0.get(r1)     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            java.util.Vector r0 = (java.util.Vector) r0     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r21 = r0
            boolean r0 = sun.font.FontUtilities.debugFonts()     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            if (r0 == 0) goto L1ec
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r1 = r20
            r2 = r21
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            java.lang.String r1 = "fullPath=" + r1 + " xVal=" + r2     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r0.println(r1)     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
        L1ec:
            r0 = r21
            if (r0 == 0) goto L1fb
            r0 = r21
            r1 = r17
            boolean r0 = r0.contains(r1)     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            if (r0 != 0) goto L200
        L1fb:
            r0 = r19
            if (r0 == 0) goto L20a
        L200:
            r0 = r19
            java.lang.String r1 = "/"
            boolean r0 = r0.startsWith(r1)     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            if (r0 != 0) goto L24f
        L20a:
            boolean r0 = sun.font.FontUtilities.debugFonts()     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            if (r0 == 0) goto L21f
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r1 = r18
            r2 = r20
            java.lang.String r1 = "Map fontID:" + r1 + "to file:" + r2     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r0.println(r1)     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
        L21f:
            java.util.Map r0 = com.github.caciocavallosilano.cacio.ctc.CTCFontManager.fontNameMap     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r1 = r18
            r2 = r20
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r0 = r21
            if (r0 != 0) goto L247
            java.util.Vector r0 = new java.util.Vector     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r1 = r0
            r1.<init>()     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r21 = r0
            java.util.Map r0 = com.github.caciocavallosilano.cacio.ctc.CTCFontManager.xlfdMap     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r1 = r20
            r2 = r21
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
        L247:
            r0 = r21
            r1 = r17
            boolean r0 = r0.add(r1)     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
        L24f:
            r0 = r10
            int r0 = r0.nextToken()     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
            r11 = r0
            r0 = r11
            r1 = 10
            if (r0 == r1) goto L260
            goto L266
        L260:
            int r13 = r13 + 1
            goto L9b
        L266:
            r0 = r8
            r0.close()     // Catch: java.io.IOException -> L27a java.lang.Throwable -> L28c
        L26a:
            r0 = r8
            if (r0 == 0) goto L29e
            r0 = r8
            r0.close()     // Catch: java.io.IOException -> L275
            goto L29e
        L275:
            r9 = move-exception
            goto L29e
        L27a:
            r9 = move-exception
            r0 = r8
            if (r0 == 0) goto L29e
            r0 = r8
            r0.close()     // Catch: java.io.IOException -> L287
            goto L29e
        L287:
            r9 = move-exception
            goto L29e
        L28c:
            r22 = move-exception
            r0 = r8
            if (r0 == 0) goto L29b
            r0 = r8
            r0.close()     // Catch: java.io.IOException -> L299
            goto L29b
        L299:
            r23 = move-exception
        L29b:
            r0 = r22
            throw r0
        L29e:
            return
    }

    public void loadFonts() {
            r4 = this;
            r0 = r4
            super.loadFonts()
            r0 = 0
            com.github.caciocavallosilano.cacio.ctc.CTCFontManager.xFontDirsMap = r0
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r2 = 1
            r1.<init>(r2)
            com.github.caciocavallosilano.cacio.ctc.CTCFontManager.xlfdMap = r0
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r2 = 1
            r1.<init>(r2)
            com.github.caciocavallosilano.cacio.ctc.CTCFontManager.fontNameMap = r0
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
            if (r0 == 0) goto L31
        L24:
            r0 = r6
            r1 = 0
            r2 = r6
            java.lang.String r3 = "-i-"
            int r2 = r2.indexOf(r3)
            java.lang.String r0 = r0.substring(r1, r2)
            return r0
        L31:
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
            if (r0 == 0) goto L14
            r0 = r5
            return r0
        L14:
            r0 = 0
            return r0
    }

    private void initObliqueLucidaFontMap() {
            r4 = this;
            r0 = r4
            java.util.HashMap r1 = new java.util.HashMap
            r2 = r1
            r2.<init>()
            r0.oblmap = r1
            r0 = r4
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r0.oblmap
            java.lang.String r1 = "-lucidasans-medium"
            java.lang.String r2 = com.github.caciocavallosilano.cacio.ctc.CTCFontManager.jreLibDirName
            java.lang.String r2 = r2 + "/fonts/LucidaSansRegular.ttf"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r0.oblmap
            java.lang.String r1 = "-lucidasans-bold"
            java.lang.String r2 = com.github.caciocavallosilano.cacio.ctc.CTCFontManager.jreLibDirName
            java.lang.String r2 = r2 + "/fonts/LucidaSansDemiBold.ttf"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r0.oblmap
            java.lang.String r1 = "-lucidatypewriter-medium"
            java.lang.String r2 = com.github.caciocavallosilano.cacio.ctc.CTCFontManager.jreLibDirName
            java.lang.String r2 = r2 + "/fonts/LucidaTypewriterRegular.ttf"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r0.oblmap
            java.lang.String r1 = "-lucidatypewriter-bold"
            java.lang.String r2 = com.github.caciocavallosilano.cacio.ctc.CTCFontManager.jreLibDirName
            java.lang.String r2 = r2 + "/fonts/LucidaTypewriterBold.ttf"
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
            if (r0 == r1) goto L4e
            boolean r0 = sun.font.FontUtilities.debugFonts()
            if (r0 == 0) goto L4c
            java.io.PrintStream r0 = java.lang.System.out
            r1 = r8
            java.lang.String r1 = "Font Configuration Font ID is malformed:" + r1
            r0.println(r1)
        L4c:
            r0 = r8
            return r0
        L4e:
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
            if (r0 == r1) goto L4e
            boolean r0 = sun.font.FontUtilities.debugFonts()
            if (r0 == 0) goto L4c
            java.io.PrintStream r0 = java.lang.System.out
            r1 = r8
            java.lang.String r1 = "Font Configuration Font ID is malformed:" + r1
            r0.println(r1)
        L4c:
            r0 = r8
            return r0
        L4e:
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
            if (r0 == 0) goto L99
            java.lang.String r0 = "o"
            r12 = r0
            goto La9
        L99:
            r0 = r12
            java.lang.String r1 = "o"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto La9
            java.lang.String r0 = "i"
            r12 = r0
        La9:
            r0 = r13
            java.lang.String r1 = "itc zapfdingbats"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lcf
            r0 = r14
            java.lang.String r1 = "sun"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lcf
            r0 = r15
            java.lang.String r1 = "fontspecific"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lcf
            java.lang.String r0 = "adobe"
            r14 = r0
        Lcf:
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
            java.util.Map r0 = com.github.caciocavallosilano.cacio.ctc.CTCFontManager.fontNameMap
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
            java.util.Map r0 = com.github.caciocavallosilano.cacio.ctc.CTCFontManager.fontNameMap
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
            java.util.HashMap r0 = com.github.caciocavallosilano.cacio.ctc.CTCFontManager.registeredDirs     // Catch: java.util.NoSuchElementException -> L3a
            r1 = r8
            boolean r0 = r0.containsKey(r1)     // Catch: java.util.NoSuchElementException -> L3a
            if (r0 != 0) goto L34
            java.util.HashMap r0 = com.github.caciocavallosilano.cacio.ctc.CTCFontManager.registeredDirs     // Catch: java.util.NoSuchElementException -> L3a
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
            java.util.Map r0 = com.github.caciocavallosilano.cacio.ctc.CTCFontManager.xFontDirsMap
            if (r0 == 0) goto L29
            r0 = r3
            r1 = r4
            java.lang.String r0 = r0.specificFontIDForName(r1)
            r5 = r0
            java.util.Map r0 = com.github.caciocavallosilano.cacio.ctc.CTCFontManager.xFontDirsMap
            r1 = r5
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L29
            java.util.HashSet<java.lang.String> r0 = com.github.caciocavallosilano.cacio.ctc.CTCFontManager.fontConfigDirs
            r1 = r6
            boolean r0 = r0.add(r1)
        L29:
            return
    }

    private void getPlatformFontPathFromFontConfig() {
            r4 = this;
            java.util.HashSet<java.lang.String> r0 = com.github.caciocavallosilano.cacio.ctc.CTCFontManager.fontConfigDirs
            if (r0 != 0) goto L46
            r0 = r4
            sun.awt.FontConfiguration r0 = r0.getFontConfiguration()
            java.util.HashSet r0 = r0.getAWTFontPathSet()
            com.github.caciocavallosilano.cacio.ctc.CTCFontManager.fontConfigDirs = r0
            boolean r0 = sun.font.FontUtilities.debugFonts()
            if (r0 == 0) goto L46
            java.util.HashSet<java.lang.String> r0 = com.github.caciocavallosilano.cacio.ctc.CTCFontManager.fontConfigDirs
            if (r0 == 0) goto L46
            java.util.HashSet<java.lang.String> r0 = com.github.caciocavallosilano.cacio.ctc.CTCFontManager.fontConfigDirs
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r5 = r0
            r0 = 0
            r6 = r0
        L2c:
            r0 = r6
            r1 = r5
            int r1 = r1.length
            if (r0 >= r1) goto L46
            java.io.PrintStream r0 = java.lang.System.out
            r1 = r5
            r2 = r6
            r1 = r1[r2]
            java.lang.String r1 = "awtfontpath : " + r1
            r0.println(r1)
            int r6 = r6 + 1
            goto L2c
        L46:
            return
    }

    protected void registerPlatformFontsUsedByFontConfiguration() {
            r4 = this;
            r0 = r4
            r0.getPlatformFontPathFromFontConfig()
            java.util.HashSet<java.lang.String> r0 = com.github.caciocavallosilano.cacio.ctc.CTCFontManager.fontConfigDirs
            if (r0 != 0) goto Lb
            return
        Lb:
            boolean r0 = sun.font.FontUtilities.isLinux
            if (r0 == 0) goto L23
            java.util.HashSet<java.lang.String> r0 = com.github.caciocavallosilano.cacio.ctc.CTCFontManager.fontConfigDirs
            java.lang.String r1 = com.github.caciocavallosilano.cacio.ctc.CTCFontManager.jreLibDirName
            java.lang.String r2 = java.io.File.separator
            java.lang.String r1 = r1 + r2 + "oblique-fonts"
            boolean r0 = r0.add(r1)
        L23:
            java.util.HashSet<java.lang.String> r0 = com.github.caciocavallosilano.cacio.ctc.CTCFontManager.fontConfigDirs
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            com.github.caciocavallosilano.cacio.ctc.CTCFontManager.fontdirs = r0
            return
    }

    protected sun.awt.FontConfiguration createFontConfiguration() {
            r4 = this;
            sun.font.MFontConfiguration r0 = new sun.font.MFontConfiguration
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            r5 = r0
            boolean r0 = sun.font.FontUtilities.isLinux
            if (r0 == 0) goto L2f
            r0 = r5
            boolean r0 = r0.foundOsSpecificFile()
            if (r0 == 0) goto L1d
            r0 = r5
            boolean r0 = r0.fontFilesArePresent()
            if (r0 != 0) goto L2f
        L1d:
            sun.font.FcFontConfiguration r0 = new sun.font.FcFontConfiguration
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            r6 = r0
            r0 = r6
            boolean r0 = r0.init()
            if (r0 == 0) goto L2f
            r0 = r6
            return r0
        L2f:
            r0 = r5
            boolean r0 = r0.init()
            r0 = r5
            return r0
    }

    public sun.awt.FontConfiguration createFontConfiguration(boolean r7, boolean r8) {
            r6 = this;
            sun.font.MFontConfiguration r0 = new sun.font.MFontConfiguration
            r1 = r0
            r2 = r6
            r3 = r7
            r4 = r8
            r1.<init>(r2, r3, r4)
            return r0
    }

    protected synchronized java.lang.String getFontPath(boolean r4) {
            r3 = this;
            r0 = r3
            boolean r0 = r0.isHeadless()
            r0 = r3
            r1 = r4
            java.lang.String r0 = super.getFontPath(r1)
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
            com.github.caciocavallosilano.cacio.ctc.CTCFontManager.fontNameMap = r0
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            com.github.caciocavallosilano.cacio.ctc.CTCFontManager.xlfdMap = r0
            r0 = 0
            com.github.caciocavallosilano.cacio.ctc.CTCFontManager.fontConfigDirs = r0
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            com.github.caciocavallosilano.cacio.ctc.CTCFontManager.registeredDirs = r0
            r0 = 0
            com.github.caciocavallosilano.cacio.ctc.CTCFontManager.fontdirs = r0
            return
    }
}
