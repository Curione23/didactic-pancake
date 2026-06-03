package net.sourceforge.prograde.generator;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/pro-grade.jar:net/sourceforge/prograde/generator/GeneratePolicyFromDeniedPermissions.class */
public final class GeneratePolicyFromDeniedPermissions implements net.sourceforge.prograde.generator.DeniedPermissionListener {
    public static final java.lang.String PROGRADE_GENERATED_POLICY = "prograde.generated.policy";
    private final java.security.PrivilegedAction<java.lang.Void> WRITE_TO_FILE_ACTION;
    private final java.util.Map<java.security.CodeSource, java.util.Set<java.security.Permission>> missingPermissions;
    private final java.io.File file;
    private boolean refreshed;
    private final java.io.FilePermission filePermissionToSkip;


    public GeneratePolicyFromDeniedPermissions() {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.<init>(r1)
            return
    }

    public GeneratePolicyFromDeniedPermissions(java.io.File r7) {
            r6 = this;
            r0 = r6
            r0.<init>()
            r0 = r6
            net.sourceforge.prograde.generator.GeneratePolicyFromDeniedPermissions$1 r1 = new net.sourceforge.prograde.generator.GeneratePolicyFromDeniedPermissions$1
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            r0.WRITE_TO_FILE_ACTION = r1
            r0 = r6
            java.util.TreeMap r1 = new java.util.TreeMap
            r2 = r1
            net.sourceforge.prograde.generator.CodesourceComparator r3 = new net.sourceforge.prograde.generator.CodesourceComparator
            r4 = r3
            r4.<init>()
            r2.<init>(r3)
            java.util.Map r1 = java.util.Collections.synchronizedMap(r1)
            r0.missingPermissions = r1
            r0 = r6
            r1 = 0
            r0.refreshed = r1
            r0 = r7
            if (r0 == 0) goto L36
            r0 = r6
            r1 = r7
            r0.file = r1
            goto L88
        L36:
            java.lang.String r0 = "prograde.generated.policy"
            java.lang.String r0 = net.sourceforge.prograde.generator.SecurityActions.getSystemProperty(r0)
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L4f
            r0 = r6
            java.io.File r1 = new java.io.File
            r2 = r1
            r3 = r8
            r2.<init>(r3)
            r0.file = r1
            goto L88
        L4f:
            r0 = r6
            java.lang.String r1 = "generated-"
            java.lang.String r2 = ".policy"
            java.io.File r1 = java.io.File.createTempFile(r1, r2)     // Catch: java.io.IOException -> L7c
            r0.file = r1     // Catch: java.io.IOException -> L7c
            java.io.PrintStream r0 = java.lang.System.err     // Catch: java.io.IOException -> L7c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L7c
            r2 = r1
            r2.<init>()     // Catch: java.io.IOException -> L7c
            java.lang.String r2 = "Writing policy to temporary file: "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.io.IOException -> L7c
            r2 = r6
            java.io.File r2 = r2.file     // Catch: java.io.IOException -> L7c
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.io.IOException -> L7c
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.io.IOException -> L7c
            java.lang.String r1 = r1.toString()     // Catch: java.io.IOException -> L7c
            r0.println(r1)     // Catch: java.io.IOException -> L7c
            goto L88
        L7c:
            r9 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "Unable to create a new policy file"
            r3 = r9
            r1.<init>(r2, r3)
            throw r0
        L88:
            r0 = r6
            java.io.FilePermission r1 = new java.io.FilePermission
            r2 = r1
            r3 = r6
            java.io.File r3 = r3.file
            java.lang.String r3 = r3.getPath()
            java.lang.String r4 = "write"
            r2.<init>(r3, r4)
            r0.filePermissionToSkip = r1
            return
    }

    @Override // net.sourceforge.prograde.generator.DeniedPermissionListener
    public void permissionDenied(java.security.ProtectionDomain r6, java.security.Permission r7) {
            r5 = this;
            r0 = r5
            java.io.FilePermission r0 = r0.filePermissionToSkip
            r1 = r7
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lc
            return
        Lc:
            r0 = r6
            java.security.CodeSource r0 = r0.getCodeSource()
            r8 = r0
            r0 = r5
            java.util.Map<java.security.CodeSource, java.util.Set<java.security.Permission>> r0 = r0.missingPermissions
            r1 = r8
            java.lang.Object r0 = r0.get(r1)
            java.util.Set r0 = (java.util.Set) r0
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L6f
            r0 = r5
            java.util.Map<java.security.CodeSource, java.util.Set<java.security.Permission>> r0 = r0.missingPermissions
            r1 = r0
            r10 = r1
            monitor-enter(r0)
            r0 = r5
            java.util.Map<java.security.CodeSource, java.util.Set<java.security.Permission>> r0 = r0.missingPermissions     // Catch: java.lang.Throwable -> L67
            r1 = r8
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L67
            java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.Throwable -> L67
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L61
            java.util.TreeSet r0 = new java.util.TreeSet     // Catch: java.lang.Throwable -> L67
            r1 = r0
            net.sourceforge.prograde.generator.PermissionComparator r2 = new net.sourceforge.prograde.generator.PermissionComparator     // Catch: java.lang.Throwable -> L67
            r3 = r2
            r3.<init>()     // Catch: java.lang.Throwable -> L67
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L67
            java.util.Set r0 = java.util.Collections.synchronizedSet(r0)     // Catch: java.lang.Throwable -> L67
            r9 = r0
            r0 = r5
            java.util.Map<java.security.CodeSource, java.util.Set<java.security.Permission>> r0 = r0.missingPermissions     // Catch: java.lang.Throwable -> L67
            r1 = r8
            r2 = r9
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.Throwable -> L67
        L61:
            r0 = r10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L67
            goto L6f
        L67:
            r11 = move-exception
            r0 = r10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L67
            r0 = r11
            throw r0
        L6f:
            r0 = r9
            r1 = r7
            boolean r0 = r0.add(r1)
            if (r0 == 0) goto L82
            r0 = r5
            java.security.PrivilegedAction<java.lang.Void> r0 = r0.WRITE_TO_FILE_ACTION
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
        L82:
            return
    }

    @Override // net.sourceforge.prograde.generator.DeniedPermissionListener
    public void policyRefreshed() {
            r3 = this;
            r0 = r3
            java.util.Map<java.security.CodeSource, java.util.Set<java.security.Permission>> r0 = r0.missingPermissions
            r1 = r0
            r4 = r1
            monitor-enter(r0)
            r0 = r3
            r1 = 1
            r0.refreshed = r1     // Catch: java.lang.Throwable -> L11
            r0 = r4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            goto L16
        L11:
            r5 = move-exception
            r0 = r4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            r0 = r5
            throw r0
        L16:
            r0 = r3
            java.security.PrivilegedAction<java.lang.Void> r0 = r0.WRITE_TO_FILE_ACTION
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            return
    }

    private void writeToFile() {
            r5 = this;
            r0 = 0
            r6 = r0
            r0 = r5
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r7 = r0
            r0 = r5
            java.util.Map<java.security.CodeSource, java.util.Set<java.security.Permission>> r0 = r0.missingPermissions
            r1 = r0
            r8 = r1
            monitor-enter(r0)
            java.io.PrintWriter r0 = new java.io.PrintWriter     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            r1 = r0
            r2 = r5
            java.io.File r2 = r2.file     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            java.lang.String r3 = "UTF-8"
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            r6 = r0
            r0 = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            r2 = r1
            r2.<init>()     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            java.lang.String r2 = "// "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            r2 = r7
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            java.lang.String r2 = " - timestamp: "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            java.util.Date r2 = new java.util.Date     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            r3 = r2
            r3.<init>()     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            r0.println(r1)     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            r0 = r5
            boolean r0 = r0.refreshed     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            if (r0 == 0) goto L55
            r0 = r6
            java.lang.String r1 = "// The policy was refreshed already."
            r0.println(r1)     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
        L55:
            r0 = r6
            r0.println()     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            r0 = r5
            java.util.Map<java.security.CodeSource, java.util.Set<java.security.Permission>> r0 = r0.missingPermissions     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            r9 = r0
        L69:
            r0 = r9
            boolean r0 = r0.hasNext()     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            if (r0 == 0) goto L15f
            r0 = r9
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            r10 = r0
            r0 = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            r2 = r1
            r2.<init>()     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            java.lang.String r2 = "grant codeBase \""
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            r2 = r10
            java.lang.Object r2 = r2.getKey()     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            java.security.CodeSource r2 = (java.security.CodeSource) r2     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            java.net.URL r2 = r2.getLocation()     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            java.lang.String r2 = "\" {"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            r0.println(r1)     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            r0 = r10
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            r11 = r0
        Lb8:
            r0 = r11
            boolean r0 = r0.hasNext()     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            if (r0 == 0) goto L152
            r0 = r11
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            java.security.Permission r0 = (java.security.Permission) r0     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            r12 = r0
            r0 = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            r2 = r1
            r2.<init>()     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            java.lang.String r2 = "  permission "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            r2 = r12
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            r0.print(r1)     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            r0 = r12
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            if (r0 == 0) goto L114
            r0 = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            r2 = r1
            r2.<init>()     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            java.lang.String r2 = " \""
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            r2 = r12
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            java.lang.String r2 = "\""
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            r0.print(r1)     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
        L114:
            r0 = r12
            java.lang.String r0 = r0.getActions()     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            if (r0 == 0) goto L149
            r0 = r12
            java.lang.String r0 = r0.getActions()     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            if (r0 != 0) goto L149
            r0 = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            r2 = r1
            r2.<init>()     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            java.lang.String r2 = ", \""
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            r2 = r12
            java.lang.String r2 = r2.getActions()     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            java.lang.String r2 = "\""
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            r0.print(r1)     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
        L149:
            r0 = r6
            java.lang.String r1 = ";"
            r0.println(r1)     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            goto Lb8
        L152:
            r0 = r6
            java.lang.String r1 = "};"
            r0.println(r1)     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            r0 = r6
            r0.println()     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            goto L69
        L15f:
            r0 = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            r2 = r1
            r2.<init>()     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            java.lang.String r2 = "// "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            r2 = r7
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            java.lang.String r2 = " - That's all"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            r0.println(r1)     // Catch: java.lang.Exception -> L190 java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            r0 = r6
            if (r0 == 0) goto L1c3
            r0 = r6
            r0.close()     // Catch: java.lang.Exception -> L186 java.lang.Throwable -> L1c8
            goto L1c3
        L186:
            r9 = move-exception
            r0 = r9
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L1c8
            goto L1c3
        L190:
            r9 = move-exception
            r0 = r9
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L1ac java.lang.Throwable -> L1c8
            r0 = r6
            if (r0 == 0) goto L1c3
            r0 = r6
            r0.close()     // Catch: java.lang.Exception -> L1a2 java.lang.Throwable -> L1c8
            goto L1c3
        L1a2:
            r9 = move-exception
            r0 = r9
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L1c8
            goto L1c3
        L1ac:
            r13 = move-exception
            r0 = r6
            if (r0 == 0) goto L1c0
            r0 = r6
            r0.close()     // Catch: java.lang.Exception -> L1b9 java.lang.Throwable -> L1c8
            goto L1c0
        L1b9:
            r14 = move-exception
            r0 = r14
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L1c8
        L1c0:
            r0 = r13
            throw r0     // Catch: java.lang.Throwable -> L1c8
        L1c3:
            r0 = r8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c8
            goto L1cf
        L1c8:
            r15 = move-exception
            r0 = r8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c8
            r0 = r15
            throw r0
        L1cf:
            return
    }

    static /* synthetic */ void access$000(net.sourceforge.prograde.generator.GeneratePolicyFromDeniedPermissions r2) {
            r0 = r2
            r0.writeToFile()
            return
    }
}
