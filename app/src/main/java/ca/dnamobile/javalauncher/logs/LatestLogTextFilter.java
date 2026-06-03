package ca.dnamobile.javalauncher.logs;

/* JADX INFO: loaded from: classes.dex */
public final class LatestLogTextFilter {
    private LatestLogTextFilter() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void addBlankLine(java.util.ArrayList<java.lang.String> r1) {
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L7
            return
        L7:
            int r0 = r1.size()
            int r0 = r0 + (-1)
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1e
            return
        L1e:
            java.lang.String r0 = ""
            r1.add(r0)
            return
    }

    private static void addLine(java.util.ArrayList<java.lang.String> r0, java.lang.String r1) {
            r0.add(r1)
            return
    }

    public static java.lang.String cleanLauncherLine(java.lang.String r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r2 = normalizeLauncherLine(r2)
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L11
            java.lang.String r2 = ""
            return r2
        L11:
            java.lang.String r1 = "Building launch arguments..."
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L1a
            return r0
        L1a:
            java.lang.String r1 = "Checking controller compatibility..."
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L23
            return r0
        L23:
            java.lang.String r1 = "Preparing launch for "
            boolean r1 = r2.startsWith(r1)
            if (r1 == 0) goto L2c
            return r0
        L2c:
            java.lang.String r1 = "LaunchGame: launch state reset"
            boolean r1 = r2.startsWith(r1)
            if (r1 == 0) goto L35
            return r0
        L35:
            return r2
    }

    public static java.lang.String cleanRealtimeLine(java.lang.String r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r2 = normalizeLauncherLine(r2)
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L11
            java.lang.String r2 = ""
            return r2
        L11:
            boolean r1 = isControlifyScanSpam(r2)
            if (r1 == 0) goto L18
            return r0
        L18:
            return r2
    }

    public static java.lang.String cleanWholeLog(java.lang.String r19) {
            r0 = r19
            if (r0 == 0) goto L15d
            boolean r1 = r19.isEmpty()
            if (r1 == 0) goto Lc
            goto L15d
        Lc:
            java.lang.String r1 = "\r\n"
            java.lang.String r2 = "\n"
            java.lang.String r0 = r0.replace(r1, r2)
            r1 = 13
            r3 = 10
            java.lang.String r0 = r0.replace(r1, r3)
            r1 = -1
            java.lang.String[] r0 = r0.split(r2, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.length
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L31:
            if (r5 >= r2) goto L111
            r16 = r0[r5]
            java.lang.String r4 = stripTrailingLineBreaks(r16)
            java.lang.String r3 = r4.trim()
            java.lang.String r15 = "--------- Start launching"
            boolean r15 = r3.startsWith(r15)
            if (r15 == 0) goto L48
            r10 = 0
            r11 = 0
            r14 = 0
        L48:
            if (r7 == 0) goto L58
            boolean r15 = isLikelyNewImportantLogLine(r3)
            if (r15 == 0) goto L52
            r7 = 0
            goto L58
        L52:
            r17 = r0
            r18 = r2
            goto L107
        L58:
            if (r8 == 0) goto L68
            boolean r15 = isLwjglMismatchContinuation(r3)
            if (r15 == 0) goto L66
            if (r9 != 0) goto L52
            addLine(r1, r4)
            goto L52
        L66:
            r8 = 0
            r9 = 1
        L68:
            boolean r15 = r3.isEmpty()
            if (r15 == 0) goto L7b
            flushJreDlopenSummary(r1, r6)
            addBlankLine(r1)
            r17 = r0
            r18 = r2
        L78:
            r6 = 0
            goto L107
        L7b:
            boolean r15 = isControlifyScanSpam(r3)
            if (r15 == 0) goto L82
            goto L52
        L82:
            boolean r15 = isDuplicateVulkanModLine(r3, r10, r11)
            r17 = r0
            java.lang.String r0 = "VulkanMod mitigation: finished"
            r18 = r2
            java.lang.String r2 = "VulkanMod mitigation: about to run on "
            if (r15 == 0) goto La2
            boolean r2 = r3.startsWith(r2)
            if (r2 == 0) goto L99
            r10 = 1
            goto L107
        L99:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L107
            r11 = 1
            goto L107
        La2:
            boolean r2 = r3.startsWith(r2)
            if (r2 == 0) goto Laa
            r10 = 1
            goto Lb1
        Laa:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Lb1
            r11 = 1
        Lb1:
            boolean r0 = isJreDlopenSuccess(r3)
            if (r0 == 0) goto Lba
            int r6 = r6 + 1
            goto L107
        Lba:
            flushJreDlopenSummary(r1, r6)
            boolean r0 = isLwjglMismatchStart(r3)
            if (r0 == 0) goto Ld7
            if (r9 != 0) goto Lc9
            addLine(r1, r4)
            goto Ld4
        Lc9:
            if (r13 != 0) goto Ld4
            java.lang.String r0 = "Warning: duplicate LWJGL Java/native version mismatch warnings suppressed."
            addLine(r1, r0)
            r6 = 0
            r8 = 1
            r13 = 1
            goto L107
        Ld4:
            r6 = 0
            r8 = 1
            goto L107
        Ld7:
            boolean r0 = isNarratorFliteStart(r3)
            if (r0 == 0) goto Le8
            if (r12 != 0) goto Le5
            java.lang.String r0 = "Info: Minecraft narrator native library is unavailable on Android; ignored."
            addLine(r1, r0)
            r12 = 1
        Le5:
            r6 = 0
            r7 = 1
            goto L107
        Le8:
            boolean r0 = isRendererSetupStart(r3)
            if (r0 == 0) goto Lf3
            addBlankLine(r1)
            r15 = 1
            goto L101
        Lf3:
            if (r14 == 0) goto L100
            boolean r0 = isMinecraftOrJvmOutputStart(r3)
            if (r0 == 0) goto L100
            addBlankLine(r1)
            r15 = 0
            goto L101
        L100:
            r15 = r14
        L101:
            addLine(r1, r4)
            r14 = r15
            goto L78
        L107:
            int r5 = r5 + 1
            r0 = r17
            r2 = r18
            r3 = 10
            goto L31
        L111:
            flushJreDlopenSummary(r1, r6)
        L114:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L139
            int r0 = r1.size()
            r2 = 1
            int r0 = r0 - r2
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L139
            int r0 = r1.size()
            int r0 = r0 - r2
            r1.remove(r0)
            goto L114
        L139:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L142:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L158
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r2 = r0.append(r2)
            r3 = 10
            r2.append(r3)
            goto L142
        L158:
            java.lang.String r0 = r0.toString()
            return r0
        L15d:
            java.lang.String r0 = ""
            return r0
    }

    private static void flushJreDlopenSummary(java.util.ArrayList<java.lang.String> r2, int r3) {
            if (r3 > 0) goto L3
            return
        L3:
            r0 = 1
            if (r3 != r0) goto Lc
            java.lang.String r3 = "Info: JRE native library loaded successfully."
            addLine(r2, r3)
            goto L24
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Info: JRE native libraries loaded successfully ("
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = " entries collapsed)."
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            addLine(r2, r3)
        L24:
            return
    }

    private static boolean isControlifyScanSpam(java.lang.String r1) {
            java.lang.String r0 = "ControlifySDL: scan "
            boolean r1 = r1.startsWith(r0)
            return r1
    }

    private static boolean isDuplicateVulkanModLine(java.lang.String r1, boolean r2, boolean r3) {
            java.lang.String r0 = "VulkanMod mitigation: about to run on "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L9
            return r2
        L9:
            java.lang.String r2 = "VulkanMod mitigation: finished"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L12
            return r3
        L12:
            r1 = 0
            return r1
    }

    private static boolean isJreDlopenSuccess(java.lang.String r1) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "d/jrelog"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L20
            java.lang.String r0 = "dlopen"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L20
            java.lang.String r0 = "success"
            boolean r1 = r1.endsWith(r0)
            if (r1 == 0) goto L20
            r1 = 1
            goto L21
        L20:
            r1 = 0
        L21:
            return r1
    }

    private static boolean isLikelyNewImportantLogLine(java.lang.String r2) {
            boolean r0 = r2.isEmpty()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = "["
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L68
            java.lang.String r0 = "EGLBridge:"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L68
            java.lang.String r0 = "OpenGL ES Version:"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L68
            java.lang.String r0 = "Registered forkAndExec"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L68
            java.lang.String r0 = "OSMDroid:"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L68
            java.lang.String r0 = "D/jrelog"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L68
            java.lang.String r0 = "E/jrelog"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L68
            java.lang.String r0 = "W/jrelog"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L68
            java.lang.String r0 = "WARNING:"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L68
            java.lang.String r0 = "Info:"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L68
            java.lang.String r0 = "VulkanMod mitigation:"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L68
            java.lang.String r0 = "---------"
            boolean r2 = r2.startsWith(r0)
            if (r2 == 0) goto L69
        L68:
            r1 = 1
        L69:
            return r1
    }

    private static boolean isLwjglMismatchContinuation(java.lang.String r2) {
            boolean r0 = r2.isEmpty()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r0)
            java.lang.String r0 = "possible reasons:"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L60
            java.lang.String r0 = "possible solutions:"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L60
            java.lang.String r0 = "a) "
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L60
            java.lang.String r0 = "b) "
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L60
            java.lang.String r0 = "sure the folder"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L60
            java.lang.String r0 = "check the classpath"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L60
            java.lang.String r0 = "-djava.library.path"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L60
            java.lang.String r0 = "shared libraries of an older lwjgl version"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L60
            java.lang.String r0 = "jar files of an older lwjgl version"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L60
            java.lang.String r0 = "jar files of the same lwjgl version"
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L5f
            goto L60
        L5f:
            r1 = 0
        L60:
            return r1
    }

    private static boolean isLwjglMismatchStart(java.lang.String r1) {
            java.lang.String r0 = "[LWJGL] [ERROR] Incompatible Java and native library versions detected."
            boolean r1 = r1.contains(r0)
            return r1
    }

    private static boolean isMinecraftOrJvmOutputStart(java.lang.String r2) {
            boolean r0 = r2.isEmpty()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = "^\\[\\d{2}:\\d{2}:\\d{2}\\] \\[.+"
            boolean r0 = r2.matches(r0)
            if (r0 != 0) goto L50
            java.lang.String r0 = "--------- beginning of main"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L50
            java.lang.String r0 = "D/jrelog"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L50
            java.lang.String r0 = "E/jrelog"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L50
            java.lang.String r0 = "W/jrelog"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L50
            java.lang.String r0 = "I/jrelog"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L50
            java.lang.String r0 = "WARNING:"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L50
            java.lang.String r0 = "^\\d{4}-\\d{2}-\\d{2}T.+"
            boolean r0 = r2.matches(r0)
            if (r0 != 0) goto L50
            java.lang.String r0 = "Registered forkAndExec"
            boolean r2 = r2.startsWith(r0)
            if (r2 == 0) goto L51
        L50:
            r1 = 1
        L51:
            return r1
    }

    private static boolean isNarratorFliteStart(java.lang.String r1) {
            java.lang.String r0 = "Error while loading the narrator"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L23
            java.lang.String r0 = "Failed to load library flite"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L23
            java.lang.String r0 = "Unable to load library 'flite'"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L23
            java.lang.String r0 = "Native library (linux-aarch64/libflite.so) not found in resource path"
            boolean r1 = r1.contains(r0)
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

    private static boolean isRendererSetupStart(java.lang.String r1) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "initializing mobileglues"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L59
            java.lang.String r0 = "initialising mobileglues"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L59
            java.lang.String r0 = "initializing krypton wrapper"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L59
            java.lang.String r0 = "initialising krypton wrapper"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L59
            java.lang.String r0 = "initializing gl4es"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L59
            java.lang.String r0 = "initialising gl4es"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L59
            java.lang.String r0 = "initializing virgl"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L59
            java.lang.String r0 = "initialising virgl"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L59
            java.lang.String r0 = "initializing renderer"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L59
            java.lang.String r0 = "initialising renderer"
            boolean r1 = r1.startsWith(r0)
            if (r1 == 0) goto L57
            goto L59
        L57:
            r1 = 0
            goto L5a
        L59:
            r1 = 1
        L5a:
            return r1
    }

    public static java.lang.String normalizeLauncherLine(java.lang.String r3) {
            if (r3 != 0) goto L5
            java.lang.String r3 = ""
            return r3
        L5:
            java.lang.String r0 = "\r\n"
            java.lang.String r1 = "\n"
            java.lang.String r3 = r3.replace(r0, r1)
            r0 = 13
            r2 = 10
            java.lang.String r3 = r3.replace(r0, r2)
        L15:
            boolean r0 = r3.endsWith(r1)
            if (r0 == 0) goto L27
            int r0 = r3.length()
            int r0 = r0 + (-1)
            r2 = 0
            java.lang.String r3 = r3.substring(r2, r0)
            goto L15
        L27:
            java.lang.String r3 = r3.trim()
            return r3
    }

    private static java.lang.String stripTrailingLineBreaks(java.lang.String r3) {
            int r0 = r3.length()
        L4:
            if (r0 <= 0) goto L18
            int r1 = r0 + (-1)
            char r1 = r3.charAt(r1)
            r2 = 10
            if (r1 == r2) goto L15
            r2 = 13
            if (r1 == r2) goto L15
            goto L18
        L15:
            int r0 = r0 + (-1)
            goto L4
        L18:
            int r1 = r3.length()
            if (r0 != r1) goto L1f
            goto L24
        L1f:
            r1 = 0
            java.lang.String r3 = r3.substring(r1, r0)
        L24:
            return r3
    }
}
