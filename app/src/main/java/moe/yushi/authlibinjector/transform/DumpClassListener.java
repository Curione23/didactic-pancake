package moe.yushi.authlibinjector.transform;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/transform/DumpClassListener.class */
public class DumpClassListener implements moe.yushi.authlibinjector.transform.ClassLoadingListener {
    private java.nio.file.Path outputPath;

    public DumpClassListener(java.nio.file.Path r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.outputPath = r1
            return
    }

    @Override // moe.yushi.authlibinjector.transform.ClassLoadingListener
    public void onClassLoading(java.lang.ClassLoader r8, java.lang.String r9, byte[] r10, java.util.List<moe.yushi.authlibinjector.transform.TransformUnit> r11) {
            r7 = this;
            r0 = r11
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L83
            r0 = r7
            java.nio.file.Path r0 = r0.outputPath
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            r2 = r9
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "_dump.class"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.nio.file.Path r0 = r0.resolve(r1)
            r12 = r0
            r0 = r12
            r1 = r10
            r2 = 2
            java.nio.file.OpenOption[] r2 = new java.nio.file.OpenOption[r2]     // Catch: java.io.IOException -> L61
            r3 = r2
            r4 = 0
            java.nio.file.StandardOpenOption r5 = java.nio.file.StandardOpenOption.CREATE     // Catch: java.io.IOException -> L61
            r3[r4] = r5     // Catch: java.io.IOException -> L61
            r3 = r2
            r4 = 1
            java.nio.file.StandardOpenOption r5 = java.nio.file.StandardOpenOption.TRUNCATE_EXISTING     // Catch: java.io.IOException -> L61
            r3[r4] = r5     // Catch: java.io.IOException -> L61
            java.nio.file.Path r0 = java.nio.file.Files.write(r0, r1, r2)     // Catch: java.io.IOException -> L61
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.INFO     // Catch: java.io.IOException -> L61
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L61
            r2 = r1
            r2.<init>()     // Catch: java.io.IOException -> L61
            java.lang.String r2 = "Transformed class is dumped to ["
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.io.IOException -> L61
            r2 = r12
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.io.IOException -> L61
            java.lang.String r2 = "]"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.io.IOException -> L61
            java.lang.String r1 = r1.toString()     // Catch: java.io.IOException -> L61
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)     // Catch: java.io.IOException -> L61
            goto L83
        L61:
            r13 = move-exception
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.WARNING
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Failed to dump class ["
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r9
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "]"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = r13
            moe.yushi.authlibinjector.util.Logging.log(r0, r1, r2)
        L83:
            return
    }
}
