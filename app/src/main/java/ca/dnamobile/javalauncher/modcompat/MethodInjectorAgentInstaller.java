package ca.dnamobile.javalauncher.modcompat;

/* JADX INFO: loaded from: classes.dex */
public final class MethodInjectorAgentInstaller {
    private static final java.lang.String ASSET_PATH = "components/methods_injector_agent/methods_injector_agent.jar";
    private static final java.lang.String OUTPUT_DIR = "methods_injector_agent";
    private static final java.lang.String OUTPUT_JAR = "methods_injector_agent.jar";

    private MethodInjectorAgentInstaller() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean addJavaAgentArg(android.content.Context r6, java.util.List<java.lang.String> r7) {
            java.io.File r6 = install(r6)
            r0 = 0
            if (r6 != 0) goto Ld
            java.lang.String r6 = "MethodInjectorAgent: disabled because jar could not be installed"
            log(r6)
            return r0
        Ld:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "-javaagent:"
            r1.<init>(r2)
            java.lang.String r6 = r6.getAbsolutePath()
            java.lang.StringBuilder r6 = r1.append(r6)
            java.lang.String r6 = r6.toString()
            int r1 = r7.size()
            r3 = 1
            int r1 = r1 - r3
        L26:
            if (r1 < 0) goto L44
            java.lang.Object r4 = r7.get(r1)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L41
            boolean r5 = r4.startsWith(r2)
            if (r5 == 0) goto L41
            java.lang.String r5 = "methods_injector_agent.jar"
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L41
            r7.remove(r1)
        L41:
            int r1 = r1 + (-1)
            goto L26
        L44:
            r7.add(r0, r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "MethodInjectorAgent: enabled "
            r7.<init>(r0)
            java.lang.StringBuilder r6 = r7.append(r6)
            java.lang.String r6 = r6.toString()
            log(r6)
            return r3
    }

    private static void copyAssetToFile(java.io.InputStream r6, java.io.File r7) throws java.io.IOException {
            java.io.File r0 = r7.getParentFile()
            if (r0 == 0) goto L90
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r7.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ".tmp"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r0, r2)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r2 = 0
            r0.<init>(r1, r2)
            r3 = 8192(0x2000, float:1.148E-41)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L86
        L2c:
            int r4 = r6.read(r3)     // Catch: java.lang.Throwable -> L86
            r5 = -1
            if (r4 == r5) goto L37
            r0.write(r3, r2, r4)     // Catch: java.lang.Throwable -> L86
            goto L2c
        L37:
            r0.flush()     // Catch: java.lang.Throwable -> L86
            r0.close()
            boolean r6 = r7.exists()
            if (r6 == 0) goto L63
            boolean r6 = r7.delete()
            if (r6 == 0) goto L4a
            goto L63
        L4a:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to replace old agent jar: "
            r0.<init>(r1)
            java.lang.String r7 = r7.getAbsolutePath()
            java.lang.StringBuilder r7 = r0.append(r7)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L63:
            boolean r6 = r1.renameTo(r7)
            if (r6 == 0) goto L6a
            return
        L6a:
            r1.delete()
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to move temp agent jar to: "
            r0.<init>(r1)
            java.lang.String r7 = r7.getAbsolutePath()
            java.lang.StringBuilder r7 = r0.append(r7)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L86:
            r6 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L8b
            goto L8f
        L8b:
            r7 = move-exception
            r6.addSuppressed(r7)
        L8f:
            throw r6
        L90:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Output file has no parent: "
            r0.<init>(r1)
            java.lang.StringBuilder r7 = r0.append(r7)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
    }

    public static java.io.File install(android.content.Context r9) {
            java.lang.String r0 = "MethodInjectorAgent: installed "
            java.lang.String r1 = "MethodInjectorAgent: copied jar is missing or empty: "
            java.io.File r2 = new java.io.File
            java.io.File r3 = r9.getFilesDir()
            java.lang.String r4 = "methods_injector_agent"
            r2.<init>(r3, r4)
            boolean r3 = r2.isDirectory()
            r4 = 0
            if (r3 != 0) goto L33
            boolean r3 = r2.mkdirs()
            if (r3 != 0) goto L33
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "MethodInjectorAgent: failed to create directory: "
            r9.<init>(r0)
            java.lang.String r0 = r2.getAbsolutePath()
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.String r9 = r9.toString()
            log(r9)
            return r4
        L33:
            java.io.File r3 = new java.io.File
            java.lang.String r5 = "methods_injector_agent.jar"
            r3.<init>(r2, r5)
            android.content.res.AssetManager r9 = r9.getAssets()     // Catch: java.lang.Throwable -> Lac java.io.IOException -> Lc0
            java.lang.String r2 = "components/methods_injector_agent/methods_injector_agent.jar"
            java.io.InputStream r9 = r9.open(r2)     // Catch: java.lang.Throwable -> Lac java.io.IOException -> Lc0
            copyAssetToFile(r9, r3)     // Catch: java.lang.Throwable -> La0
            boolean r2 = r3.isFile()     // Catch: java.lang.Throwable -> La0
            if (r2 == 0) goto L86
            long r5 = r3.length()     // Catch: java.lang.Throwable -> La0
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 > 0) goto L58
            goto L86
        L58:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La0
            r1.<init>(r0)     // Catch: java.lang.Throwable -> La0
            java.lang.String r0 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> La0
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Throwable -> La0
            java.lang.String r1 = " ("
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> La0
            long r1 = r3.length()     // Catch: java.lang.Throwable -> La0
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> La0
            java.lang.String r1 = " bytes)"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> La0
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> La0
            log(r0)     // Catch: java.lang.Throwable -> La0
            if (r9 == 0) goto L85
            r9.close()     // Catch: java.lang.Throwable -> Lac java.io.IOException -> Lc0
        L85:
            return r3
        L86:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> La0
            java.lang.String r1 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> La0
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> La0
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> La0
            log(r0)     // Catch: java.lang.Throwable -> La0
            if (r9 == 0) goto L9f
            r9.close()     // Catch: java.lang.Throwable -> Lac java.io.IOException -> Lc0
        L9f:
            return r4
        La0:
            r0 = move-exception
            if (r9 == 0) goto Lab
            r9.close()     // Catch: java.lang.Throwable -> La7
            goto Lab
        La7:
            r9 = move-exception
            r0.addSuppressed(r9)     // Catch: java.lang.Throwable -> Lac java.io.IOException -> Lc0
        Lab:
            throw r0     // Catch: java.lang.Throwable -> Lac java.io.IOException -> Lc0
        Lac:
            r9 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MethodInjectorAgent: unexpected install failure: "
            r0.<init>(r1)
            java.lang.StringBuilder r9 = r0.append(r9)
            java.lang.String r9 = r9.toString()
            log(r9)
            return r4
        Lc0:
            r9 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MethodInjectorAgent: failed to install asset components/methods_injector_agent/methods_injector_agent.jar: "
            r0.<init>(r1)
            java.lang.StringBuilder r9 = r0.append(r9)
            java.lang.String r9 = r9.toString()
            log(r9)
            return r4
    }

    private static void log(java.lang.String r2) {
            java.lang.String r0 = "\n"
            boolean r1 = r2.endsWith(r0)     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto La
            r0 = r2
            goto L1b
        La:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f
            r1.<init>()     // Catch: java.lang.Throwable -> L1f
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L1f
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1f
        L1b:
            net.kdt.pojavlaunch.Logger.appendToLog(r0)     // Catch: java.lang.Throwable -> L1f
            goto L24
        L1f:
            java.lang.String r0 = "MethodInjectorAgent"
            android.util.Log.i(r0, r2)
        L24:
            return
    }
}
