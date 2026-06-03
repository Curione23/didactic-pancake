package net.sourceforge.prograde.policy;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/pro-grade.jar:net/sourceforge/prograde/policy/ProGradePolicy.class */
public class ProGradePolicy extends java.security.Policy {
    private net.sourceforge.prograde.type.Priority priority;
    private java.util.List<net.sourceforge.prograde.policy.ProGradePolicyEntry> allGrantEntries;
    private java.util.List<net.sourceforge.prograde.policy.ProGradePolicyEntry> allDenyEntries;
    private final boolean debug;
    private final boolean expandProperties;
    private final java.io.File file;
    private final boolean skipDefaultPolicies;

    public ProGradePolicy() {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = 0
            r6 = r0
            java.lang.String r0 = "java.security.debug"
            java.lang.String r0 = net.sourceforge.prograde.policy.SecurityActions.getSystemProperty(r0)     // Catch: java.security.AccessControlException -> Lf
            r6 = r0
            goto L1c
        Lf:
            r7 = move-exception
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "Unable to check if policy debugging is enabled."
            r0.println(r1)
            r0 = r7
            r0.printStackTrace()
        L1c:
            r0 = 0
            r7 = r0
            r0 = r6
            if (r0 == 0) goto L66
            r0 = r6
            java.lang.String r1 = ","
            java.lang.String[] r0 = r0.split(r1)
            r8 = r0
            r0 = 0
            r9 = r0
        L2c:
            r0 = r9
            r1 = r8
            int r1 = r1.length
            if (r0 >= r1) goto L66
            r0 = r8
            r1 = r9
            r0 = r0[r1]
            java.lang.String r0 = r0.trim()
            r10 = r0
            r0 = r10
            java.lang.String r1 = "\""
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replaceAll(r1, r2)
            r10 = r0
            r0 = r10
            java.lang.String r1 = "all"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5b
            r0 = r10
            java.lang.String r1 = "policy"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L60
        L5b:
            r0 = 1
            r7 = r0
            goto L66
        L60:
            int r9 = r9 + 1
            goto L2c
        L66:
            r0 = r5
            r1 = r7
            r0.debug = r1
            r0 = r5
            java.lang.String r1 = "policy.expandProperties"
            java.lang.String r1 = net.sourceforge.prograde.policy.SecurityActions.getSecurityProperty(r1)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            r0.expandProperties = r1
            java.lang.String r0 = "java.security.policy"
            java.lang.String r0 = net.sourceforge.prograde.policy.SecurityActions.getSystemProperty(r0)
            r8 = r0
            r0 = r8
            if (r0 == 0) goto La7
            r0 = r5
            r1 = r8
            java.lang.String r2 = "="
            boolean r1 = r1.startsWith(r2)
            r0.skipDefaultPolicies = r1
            r0 = r5
            boolean r0 = r0.skipDefaultPolicies
            if (r0 == 0) goto L98
            r0 = r8
            r1 = 1
            java.lang.String r0 = r0.substring(r1)
            r8 = r0
        L98:
            r0 = r5
            java.io.File r1 = new java.io.File
            r2 = r1
            r3 = r8
            r2.<init>(r3)
            r0.file = r1
            goto Lb1
        La7:
            r0 = r5
            r1 = 0
            r0.skipDefaultPolicies = r1
            r0 = r5
            r1 = 0
            r0.file = r1
        Lb1:
            r0 = r5
            r0.refresh()
            return
    }

    @Override // java.security.Policy
    public void refresh() {
            r4 = this;
            r0 = 0
            r5 = r0
            r0 = r4
            java.io.File r0 = r0.file
            if (r0 == 0) goto L41
            java.io.FileReader r0 = new java.io.FileReader     // Catch: java.lang.Exception -> L18
            r1 = r0
            r2 = r4
            java.io.File r2 = r2.file     // Catch: java.lang.Exception -> L18
            r1.<init>(r2)     // Catch: java.lang.Exception -> L18
            r5 = r0
            goto L41
        L18:
            r6 = move-exception
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Unable to read policy file "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r4
            java.io.File r2 = r2.file
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ": "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            java.lang.String r2 = r2.getMessage()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
        L41:
            r0 = r4
            r1 = r5
            r2 = r4
            boolean r2 = r2.skipDefaultPolicies
            r0.loadPolicy(r1, r2)
            return
    }

    protected void loadPolicy(java.io.Reader r7, boolean r8) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r9 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r10 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r11 = r0
            r0 = 0
            r12 = r0
            r0 = r7
            if (r0 == 0) goto L8b
            r0 = r9
            net.sourceforge.prograde.policyparser.Parser r1 = new net.sourceforge.prograde.policyparser.Parser     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L78 java.lang.Throwable -> L1f1
            r2 = r1
            r3 = r6
            boolean r3 = r3.debug     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L78 java.lang.Throwable -> L1f1
            r2.<init>(r3)     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L78 java.lang.Throwable -> L1f1
            r2 = r7
            net.sourceforge.prograde.policyparser.ParsedPolicy r1 = r1.parse(r2)     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L78 java.lang.Throwable -> L1f1
            boolean r0 = r0.add(r1)     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L78 java.lang.Throwable -> L1f1
            r0 = r7
            r0.close()     // Catch: java.io.IOException -> L3e java.lang.Throwable -> L1f1
            goto L8b
        L3e:
            r13 = move-exception
            r0 = r13
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L1f1
            goto L8b
        L48:
            r13 = move-exception
            java.io.PrintStream r0 = java.lang.System.err     // Catch: java.lang.Throwable -> L78 java.lang.Throwable -> L1f1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L78 java.lang.Throwable -> L1f1
            r2 = r1
            r2.<init>()     // Catch: java.lang.Throwable -> L78 java.lang.Throwable -> L1f1
            java.lang.String r2 = "Unbale to parse policy. Exception message: "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L78 java.lang.Throwable -> L1f1
            r2 = r13
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L78 java.lang.Throwable -> L1f1
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L78 java.lang.Throwable -> L1f1
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L78 java.lang.Throwable -> L1f1
            r0.println(r1)     // Catch: java.lang.Throwable -> L78 java.lang.Throwable -> L1f1
            r0 = r7
            r0.close()     // Catch: java.io.IOException -> L6e java.lang.Throwable -> L1f1
            goto L8b
        L6e:
            r13 = move-exception
            r0 = r13
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L1f1
            goto L8b
        L78:
            r14 = move-exception
            r0 = r7
            r0.close()     // Catch: java.io.IOException -> L81 java.lang.Throwable -> L1f1
            goto L88
        L81:
            r15 = move-exception
            r0 = r15
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L1f1
        L88:
            r0 = r14
            throw r0     // Catch: java.lang.Throwable -> L1f1
        L8b:
            r0 = r8
            if (r0 != 0) goto Lbc
            r0 = r9
            r1 = r6
            java.util.List r1 = r1.getJavaPolicies()     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> L1f1
            boolean r0 = r0.addAll(r1)     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> L1f1
            goto Lbc
        L9d:
            r13 = move-exception
            java.io.PrintStream r0 = java.lang.System.err     // Catch: java.lang.Throwable -> L1f1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f1
            r2 = r1
            r2.<init>()     // Catch: java.lang.Throwable -> L1f1
            java.lang.String r2 = "Static policy wasn't successfully loaded! Exception message: "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L1f1
            r2 = r13
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L1f1
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L1f1
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1f1
            r0.println(r1)     // Catch: java.lang.Throwable -> L1f1
        Lbc:
            r0 = r8
            if (r0 != 0) goto Lf4
            r0 = r9
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L1f1
            if (r0 == 0) goto Lf4
            r0 = r6
            r1 = r10
            r0.initializeStaticPolicy(r1)     // Catch: java.lang.Exception -> Ld2 java.lang.Throwable -> L1f1
            goto L1dc
        Ld2:
            r13 = move-exception
            java.io.PrintStream r0 = java.lang.System.err     // Catch: java.lang.Throwable -> L1f1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f1
            r2 = r1
            r2.<init>()     // Catch: java.lang.Throwable -> L1f1
            java.lang.String r2 = "Static policy wasn't successfully loaded! Exception message: "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L1f1
            r2 = r13
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L1f1
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L1f1
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1f1
            r0.println(r1)     // Catch: java.lang.Throwable -> L1f1
            goto L1dc
        Lf4:
            r0 = r9
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1f1
            if (r0 == 0) goto L107
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1f1
            r1 = r0
            java.lang.String r2 = "Policy wasn't initialized!"
            r1.<init>(r2)     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1f1
            throw r0     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1f1
        L107:
            r0 = 0
            r12 = r0
            r0 = r9
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1f1
            r13 = r0
        L112:
            r0 = r13
            boolean r0 = r0.hasNext()     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1f1
            if (r0 == 0) goto L13a
            r0 = r13
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1f1
            net.sourceforge.prograde.policyparser.ParsedPolicy r0 = (net.sourceforge.prograde.policyparser.ParsedPolicy) r0     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1f1
            r14 = r0
            r0 = r14
            net.sourceforge.prograde.type.Priority r0 = r0.getPriority()     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1f1
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L137
            goto L13a
        L137:
            goto L112
        L13a:
            r0 = r12
            if (r0 != 0) goto L144
            net.sourceforge.prograde.type.Priority r0 = net.sourceforge.prograde.type.Priority.DEFAULT     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1f1
            r12 = r0
        L144:
            r0 = r9
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1f1
            r13 = r0
        L14c:
            r0 = r13
            boolean r0 = r0.hasNext()     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1f1
            if (r0 == 0) goto L1ba
            r0 = r13
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1f1
            net.sourceforge.prograde.policyparser.ParsedPolicy r0 = (net.sourceforge.prograde.policyparser.ParsedPolicy) r0     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1f1
            r14 = r0
            r0 = 0
            r15 = r0
            r0 = r6
            r1 = r14
            net.sourceforge.prograde.policyparser.ParsedKeystoreEntry r1 = r1.getKeystore()     // Catch: java.lang.Exception -> L17c java.lang.Exception -> L1bd java.lang.Throwable -> L1f1
            r2 = r14
            java.lang.String r2 = r2.getKeystorePasswordURL()     // Catch: java.lang.Exception -> L17c java.lang.Exception -> L1bd java.lang.Throwable -> L1f1
            r3 = r6
            java.io.File r3 = r3.file     // Catch: java.lang.Exception -> L17c java.lang.Exception -> L1bd java.lang.Throwable -> L1f1
            java.security.KeyStore r0 = r0.createKeystore(r1, r2, r3)     // Catch: java.lang.Exception -> L17c java.lang.Exception -> L1bd java.lang.Throwable -> L1f1
            r15 = r0
            goto L19b
        L17c:
            r16 = move-exception
            java.io.PrintStream r0 = java.lang.System.err     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1f1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1f1
            r2 = r1
            r2.<init>()     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1f1
            java.lang.String r2 = "Keystore wasn't successfully initialized! Exception message: "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1f1
            r2 = r16
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1f1
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1f1
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1f1
            r0.println(r1)     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1f1
        L19b:
            r0 = r6
            r1 = r14
            java.util.List r1 = r1.getGrantEntries()     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1f1
            r2 = r10
            r3 = r15
            r4 = 1
            r0.addParsedPolicyEntries(r1, r2, r3, r4)     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1f1
            r0 = r6
            r1 = r14
            java.util.List r1 = r1.getDenyEntries()     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1f1
            r2 = r11
            r3 = r15
            r4 = 0
            r0.addParsedPolicyEntries(r1, r2, r3, r4)     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1f1
            goto L14c
        L1ba:
            goto L1dc
        L1bd:
            r13 = move-exception
            java.io.PrintStream r0 = java.lang.System.err     // Catch: java.lang.Throwable -> L1f1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f1
            r2 = r1
            r2.<init>()     // Catch: java.lang.Throwable -> L1f1
            java.lang.String r2 = "Policy wasn't successfully initialized! Exception message: "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L1f1
            r2 = r13
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L1f1
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L1f1
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1f1
            r0.println(r1)     // Catch: java.lang.Throwable -> L1f1
        L1dc:
            r0 = r6
            r1 = r10
            r0.allGrantEntries = r1
            r0 = r6
            r1 = r11
            r0.allDenyEntries = r1
            r0 = r6
            r1 = r12
            r0.priority = r1
            goto L208
        L1f1:
            r17 = move-exception
            r0 = r6
            r1 = r10
            r0.allGrantEntries = r1
            r0 = r6
            r1 = r11
            r0.allDenyEntries = r1
            r0 = r6
            r1 = r12
            r0.priority = r1
            r0 = r17
            throw r0
        L208:
            return
    }

    private void addParsedPolicyEntries(java.util.List<net.sourceforge.prograde.policyparser.ParsedPolicyEntry> r7, java.util.List<net.sourceforge.prograde.policy.ProGradePolicyEntry> r8, java.security.KeyStore r9, boolean r10) throws java.lang.Exception {
            r6 = this;
            r0 = r7
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
        L8:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L53
            r0 = r11
            java.lang.Object r0 = r0.next()
            net.sourceforge.prograde.policyparser.ParsedPolicyEntry r0 = (net.sourceforge.prograde.policyparser.ParsedPolicyEntry) r0
            r12 = r0
            r0 = r8
            r1 = r6
            r2 = r12
            r3 = r9
            r4 = r10
            net.sourceforge.prograde.policy.ProGradePolicyEntry r1 = r1.initializePolicyEntry(r2, r3, r4)     // Catch: java.lang.Exception -> L31
            boolean r0 = r0.add(r1)     // Catch: java.lang.Exception -> L31
            goto L50
        L31:
            r13 = move-exception
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Unable to initialize policy entry: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r13
            java.lang.String r2 = r2.getMessage()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
        L50:
            goto L8
        L53:
            return
    }

    private net.sourceforge.prograde.policy.ProGradePolicyEntry initializePolicyEntry(net.sourceforge.prograde.policyparser.ParsedPolicyEntry r9, java.security.KeyStore r10, boolean r11) throws java.lang.Exception {
            r8 = this;
            net.sourceforge.prograde.policy.ProGradePolicyEntry r0 = new net.sourceforge.prograde.policy.ProGradePolicyEntry
            r1 = r0
            r2 = r11
            r3 = r8
            boolean r3 = r3.debug
            r1.<init>(r2, r3)
            r12 = r0
            r0 = r9
            java.lang.String r0 = r0.getCodebase()
            if (r0 != 0) goto L1c
            r0 = r9
            java.lang.String r0 = r0.getSignedBy()
            if (r0 == 0) goto L3c
        L1c:
            r0 = r8
            r1 = r9
            r2 = r10
            java.security.CodeSource r0 = r0.createCodeSource(r1, r2)
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L33
            r0 = r12
            r1 = r13
            r0.setCodeSource(r1)
            goto L3c
        L33:
            r0 = r12
            r1 = 1
            r0.setNeverImplies(r1)
            r0 = r12
            return r0
        L3c:
            r0 = r9
            java.util.List r0 = r0.getPrincipals()
            java.util.Iterator r0 = r0.iterator()
            r13 = r0
        L47:
            r0 = r13
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Lc2
            r0 = r13
            java.lang.Object r0 = r0.next()
            net.sourceforge.prograde.policyparser.ParsedPrincipal r0 = (net.sourceforge.prograde.policyparser.ParsedPrincipal) r0
            r14 = r0
            r0 = r14
            boolean r0 = r0.hasAlias()
            if (r0 == 0) goto L9b
            r0 = r8
            r1 = r8
            r2 = r14
            java.lang.String r2 = r2.getAlias()
            java.lang.String r1 = r1.expandStringWithProperty(r2)
            r2 = r10
            java.lang.String r0 = r0.gainPrincipalFromAlias(r1, r2)
            r15 = r0
            r0 = r15
            if (r0 == 0) goto L8f
            r0 = r12
            net.sourceforge.prograde.policy.ProGradePrincipal r1 = new net.sourceforge.prograde.policy.ProGradePrincipal
            r2 = r1
            java.lang.String r3 = "javax.security.auth.x500.X500Principal"
            r4 = r15
            r5 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6)
            r0.addPrincipal(r1)
            goto L98
        L8f:
            r0 = r12
            r1 = 1
            r0.setNeverImplies(r1)
            r0 = r12
            return r0
        L98:
            goto Lbf
        L9b:
            r0 = r12
            net.sourceforge.prograde.policy.ProGradePrincipal r1 = new net.sourceforge.prograde.policy.ProGradePrincipal
            r2 = r1
            r3 = r14
            java.lang.String r3 = r3.getPrincipalClass()
            r4 = r8
            r5 = r14
            java.lang.String r5 = r5.getPrincipalName()
            java.lang.String r4 = r4.expandStringWithProperty(r5)
            r5 = r14
            boolean r5 = r5.hasClassWildcard()
            r6 = r14
            boolean r6 = r6.hasNameWildcard()
            r2.<init>(r3, r4, r5, r6)
            r0.addPrincipal(r1)
        Lbf:
            goto L47
        Lc2:
            r0 = r9
            java.util.List r0 = r0.getPermissions()
            java.util.Iterator r0 = r0.iterator()
            r13 = r0
        Lcd:
            r0 = r13
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Lfb
            r0 = r13
            java.lang.Object r0 = r0.next()
            net.sourceforge.prograde.policyparser.ParsedPermission r0 = (net.sourceforge.prograde.policyparser.ParsedPermission) r0
            r14 = r0
            r0 = r8
            r1 = r14
            r2 = r10
            java.security.Permission r0 = r0.createPermission(r1, r2)
            r15 = r0
            r0 = r15
            if (r0 == 0) goto Lf8
            r0 = r12
            r1 = r15
            r0.addPermission(r1)
        Lf8:
            goto Lcd
        Lfb:
            r0 = r12
            return r0
    }

    @Override // java.security.Policy
    public boolean implies(java.security.ProtectionDomain r5, java.security.Permission r6) {
            r4 = this;
            r0 = r5
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r5
            java.security.CodeSource r0 = r0.getCodeSource()
            if (r0 != 0) goto Lf
            r0 = 1
            return r0
        Lf:
            net.sourceforge.prograde.type.Priority r0 = net.sourceforge.prograde.type.Priority.GRANT
            r1 = r4
            net.sourceforge.prograde.type.Priority r1 = r1.priority
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L8a
            r0 = r4
            boolean r0 = r0.debug
            if (r0 == 0) goto L3e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "Searching for granting for permission: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " ..."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
        L3e:
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = r0.grantEntriesImplies(r1, r2)
            if (r0 == 0) goto L55
            r0 = r4
            boolean r0 = r0.debug
            if (r0 == 0) goto L53
            java.lang.String r0 = "Granting permission found, grant access."
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
        L53:
            r0 = 1
            return r0
        L55:
            r0 = r4
            boolean r0 = r0.debug
            if (r0 == 0) goto L61
            java.lang.String r0 = "Granting permission wasn't found, searching for denying..."
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
        L61:
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = r0.denyEntriesImplies(r1, r2)
            if (r0 != 0) goto L6e
            r0 = 1
            goto L6f
        L6e:
            r0 = 0
        L6f:
            r7 = r0
            r0 = r4
            boolean r0 = r0.debug
            if (r0 == 0) goto L88
            r0 = r7
            if (r0 == 0) goto L83
            java.lang.String r0 = "Denying permission wasn't found, grant access."
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
            goto L88
        L83:
            java.lang.String r0 = "Denying permission found, deny access."
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
        L88:
            r0 = r7
            return r0
        L8a:
            r0 = r4
            boolean r0 = r0.debug
            if (r0 == 0) goto Lac
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "Searching for denying for permission: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " ..."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
        Lac:
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = r0.denyEntriesImplies(r1, r2)
            if (r0 == 0) goto Lc3
            r0 = r4
            boolean r0 = r0.debug
            if (r0 == 0) goto Lc1
            java.lang.String r0 = "Denying permission found, deny access."
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
        Lc1:
            r0 = 0
            return r0
        Lc3:
            r0 = r4
            boolean r0 = r0.debug
            if (r0 == 0) goto Lcf
            java.lang.String r0 = "Denying permission wasn't found, searching for granting..."
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
        Lcf:
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = r0.grantEntriesImplies(r1, r2)
            r7 = r0
            r0 = r4
            boolean r0 = r0.debug
            if (r0 == 0) goto Lee
            r0 = r7
            if (r0 == 0) goto Le9
            java.lang.String r0 = "Granting permission found, grant access."
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
            goto Lee
        Le9:
            java.lang.String r0 = "Granting permission wasn't found, deny access."
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
        Lee:
            r0 = r7
            return r0
    }

    private boolean grantEntriesImplies(java.security.ProtectionDomain r6, java.security.Permission r7) {
            r5 = this;
            r0 = r5
            r1 = r5
            java.util.List<net.sourceforge.prograde.policy.ProGradePolicyEntry> r1 = r1.allGrantEntries
            r2 = r6
            r3 = r7
            boolean r0 = r0.entriesImplyPermission(r1, r2, r3)
            return r0
    }

    private boolean denyEntriesImplies(java.security.ProtectionDomain r6, java.security.Permission r7) {
            r5 = this;
            r0 = r5
            r1 = r5
            java.util.List<net.sourceforge.prograde.policy.ProGradePolicyEntry> r1 = r1.allDenyEntries
            r2 = r6
            r3 = r7
            boolean r0 = r0.entriesImplyPermission(r1, r2, r3)
            return r0
    }

    private boolean entriesImplyPermission(java.util.List<net.sourceforge.prograde.policy.ProGradePolicyEntry> r5, java.security.ProtectionDomain r6, java.security.Permission r7) {
            r4 = this;
            r0 = r5
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
        L8:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L2d
            r0 = r8
            java.lang.Object r0 = r0.next()
            net.sourceforge.prograde.policy.ProGradePolicyEntry r0 = (net.sourceforge.prograde.policy.ProGradePolicyEntry) r0
            r9 = r0
            r0 = r9
            r1 = r6
            r2 = r7
            boolean r0 = r0.implies(r1, r2)
            if (r0 == 0) goto L2a
            r0 = 1
            return r0
        L2a:
            goto L8
        L2d:
            r0 = 0
            return r0
    }

    private java.security.Permission createPermission(net.sourceforge.prograde.policyparser.ParsedPermission r8, java.security.KeyStore r9) throws java.lang.Exception {
            r7 = this;
            r0 = r8
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r7
            r1 = r8
            java.lang.String r1 = r1.getPermissionName()
            java.lang.String r0 = r0.expandStringWithProperty(r1)
            r10 = r0
            r0 = r7
            r1 = r8
            java.lang.String r1 = r1.getActions()
            java.lang.String r0 = r0.expandStringWithProperty(r1)
            r11 = r0
            r0 = r8
            java.lang.String r0 = r0.getPermissionType()     // Catch: java.lang.ClassNotFoundException -> L25
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L25
            r12 = r0
            goto L7f
        L25:
            r13 = move-exception
            r0 = r7
            r1 = r7
            r2 = r8
            java.lang.String r2 = r2.getSignedBy()
            java.lang.String r1 = r1.expandStringWithProperty(r2)
            r2 = r9
            java.security.cert.Certificate[] r0 = r0.getCertificates(r1, r2)
            r14 = r0
            r0 = r8
            java.lang.String r0 = r0.getSignedBy()
            if (r0 == 0) goto L6e
            r0 = r14
            if (r0 != 0) goto L6e
            r0 = r7
            boolean r0 = r0.debug
            if (r0 == 0) goto L6c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "Permission with signedBy "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r8
            java.lang.String r1 = r1.getSignedBy()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " is ignored. Certificate wasn't successfully found or loaded "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "from keystore"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
        L6c:
            r0 = 0
            return r0
        L6e:
            java.security.UnresolvedPermission r0 = new java.security.UnresolvedPermission
            r1 = r0
            r2 = r8
            java.lang.String r2 = r2.getPermissionType()
            r3 = r10
            r4 = r11
            r5 = r14
            r1.<init>(r2, r3, r4, r5)
            return r0
        L7f:
            r0 = r12
            java.lang.Class<java.io.FilePermission> r1 = java.io.FilePermission.class
            boolean r0 = r0.equals(r1)     // Catch: java.lang.IllegalArgumentException -> L174
            if (r0 == 0) goto L95
            java.io.FilePermission r0 = new java.io.FilePermission     // Catch: java.lang.IllegalArgumentException -> L174
            r1 = r0
            r2 = r10
            r3 = r11
            r1.<init>(r2, r3)     // Catch: java.lang.IllegalArgumentException -> L174
            return r0
        L95:
            r0 = r12
            java.lang.Class<java.net.SocketPermission> r1 = java.net.SocketPermission.class
            boolean r0 = r0.equals(r1)     // Catch: java.lang.IllegalArgumentException -> L174
            if (r0 == 0) goto Lab
            java.net.SocketPermission r0 = new java.net.SocketPermission     // Catch: java.lang.IllegalArgumentException -> L174
            r1 = r0
            r2 = r10
            r3 = r11
            r1.<init>(r2, r3)     // Catch: java.lang.IllegalArgumentException -> L174
            return r0
        Lab:
            r0 = r12
            java.lang.Class<java.util.PropertyPermission> r1 = java.util.PropertyPermission.class
            boolean r0 = r0.equals(r1)     // Catch: java.lang.IllegalArgumentException -> L174
            if (r0 == 0) goto Lc1
            java.util.PropertyPermission r0 = new java.util.PropertyPermission     // Catch: java.lang.IllegalArgumentException -> L174
            r1 = r0
            r2 = r10
            r3 = r11
            r1.<init>(r2, r3)     // Catch: java.lang.IllegalArgumentException -> L174
            return r0
        Lc1:
            r0 = r12
            java.lang.Class<java.lang.RuntimePermission> r1 = java.lang.RuntimePermission.class
            boolean r0 = r0.equals(r1)     // Catch: java.lang.IllegalArgumentException -> L174
            if (r0 == 0) goto Ld7
            java.lang.RuntimePermission r0 = new java.lang.RuntimePermission     // Catch: java.lang.IllegalArgumentException -> L174
            r1 = r0
            r2 = r10
            r3 = r11
            r1.<init>(r2, r3)     // Catch: java.lang.IllegalArgumentException -> L174
            return r0
        Ld7:
            r0 = r12
            java.lang.Class<java.awt.AWTPermission> r1 = java.awt.AWTPermission.class
            boolean r0 = r0.equals(r1)     // Catch: java.lang.IllegalArgumentException -> L174
            if (r0 == 0) goto Led
            java.awt.AWTPermission r0 = new java.awt.AWTPermission     // Catch: java.lang.IllegalArgumentException -> L174
            r1 = r0
            r2 = r10
            r3 = r11
            r1.<init>(r2, r3)     // Catch: java.lang.IllegalArgumentException -> L174
            return r0
        Led:
            r0 = r12
            java.lang.Class<java.net.NetPermission> r1 = java.net.NetPermission.class
            boolean r0 = r0.equals(r1)     // Catch: java.lang.IllegalArgumentException -> L174
            if (r0 == 0) goto L103
            java.net.NetPermission r0 = new java.net.NetPermission     // Catch: java.lang.IllegalArgumentException -> L174
            r1 = r0
            r2 = r10
            r3 = r11
            r1.<init>(r2, r3)     // Catch: java.lang.IllegalArgumentException -> L174
            return r0
        L103:
            r0 = r12
            java.lang.Class<java.lang.reflect.ReflectPermission> r1 = java.lang.reflect.ReflectPermission.class
            boolean r0 = r0.equals(r1)     // Catch: java.lang.IllegalArgumentException -> L174
            if (r0 == 0) goto L119
            java.lang.reflect.ReflectPermission r0 = new java.lang.reflect.ReflectPermission     // Catch: java.lang.IllegalArgumentException -> L174
            r1 = r0
            r2 = r10
            r3 = r11
            r1.<init>(r2, r3)     // Catch: java.lang.IllegalArgumentException -> L174
            return r0
        L119:
            r0 = r12
            java.lang.Class<java.io.SerializablePermission> r1 = java.io.SerializablePermission.class
            boolean r0 = r0.equals(r1)     // Catch: java.lang.IllegalArgumentException -> L174
            if (r0 == 0) goto L12f
            java.io.SerializablePermission r0 = new java.io.SerializablePermission     // Catch: java.lang.IllegalArgumentException -> L174
            r1 = r0
            r2 = r10
            r3 = r11
            r1.<init>(r2, r3)     // Catch: java.lang.IllegalArgumentException -> L174
            return r0
        L12f:
            r0 = r12
            java.lang.Class<java.security.SecurityPermission> r1 = java.security.SecurityPermission.class
            boolean r0 = r0.equals(r1)     // Catch: java.lang.IllegalArgumentException -> L174
            if (r0 == 0) goto L145
            java.security.SecurityPermission r0 = new java.security.SecurityPermission     // Catch: java.lang.IllegalArgumentException -> L174
            r1 = r0
            r2 = r10
            r3 = r11
            r1.<init>(r2, r3)     // Catch: java.lang.IllegalArgumentException -> L174
            return r0
        L145:
            r0 = r12
            java.lang.Class<java.security.AllPermission> r1 = java.security.AllPermission.class
            boolean r0 = r0.equals(r1)     // Catch: java.lang.IllegalArgumentException -> L174
            if (r0 == 0) goto L15b
            java.security.AllPermission r0 = new java.security.AllPermission     // Catch: java.lang.IllegalArgumentException -> L174
            r1 = r0
            r2 = r10
            r3 = r11
            r1.<init>(r2, r3)     // Catch: java.lang.IllegalArgumentException -> L174
            return r0
        L15b:
            r0 = r12
            java.lang.Class<javax.security.auth.AuthPermission> r1 = javax.security.auth.AuthPermission.class
            boolean r0 = r0.equals(r1)     // Catch: java.lang.IllegalArgumentException -> L174
            if (r0 == 0) goto L171
            javax.security.auth.AuthPermission r0 = new javax.security.auth.AuthPermission     // Catch: java.lang.IllegalArgumentException -> L174
            r1 = r0
            r2 = r10
            r3 = r11
            r1.<init>(r2, r3)     // Catch: java.lang.IllegalArgumentException -> L174
            return r0
        L171:
            goto L1ac
        L174:
            r13 = move-exception
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "IllegalArgumentException in permission: ["
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r8
            java.lang.String r2 = r2.getPermissionType()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r10
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r11
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "]"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = 0
            return r0
        L1ac:
            r0 = r12
            java.lang.ClassLoader r0 = r0.getClassLoader()
            if (r0 == 0) goto L242
            r0 = r12
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r1 = r12
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.ClassLoader r1 = r1.getParent()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L242
            r0 = r8
            java.lang.String r0 = r0.getSignedBy()
            if (r0 == 0) goto L242
            r0 = r12
            java.lang.Object[] r0 = r0.getSigners()
            java.security.cert.Certificate[] r0 = (java.security.cert.Certificate[]) r0
            java.security.cert.Certificate[] r0 = (java.security.cert.Certificate[]) r0
            r13 = r0
            r0 = r13
            if (r0 != 0) goto L1e2
            r0 = 0
            return r0
        L1e2:
            r0 = r7
            r1 = r7
            r2 = r8
            java.lang.String r2 = r2.getSignedBy()
            java.lang.String r1 = r1.expandStringWithProperty(r2)
            r2 = r9
            java.security.cert.Certificate[] r0 = r0.getCertificates(r1, r2)
            r14 = r0
            r0 = r14
            if (r0 != 0) goto L1f8
            r0 = 0
            return r0
        L1f8:
            r0 = 0
            r15 = r0
        L1fb:
            r0 = r15
            r1 = r14
            int r1 = r1.length
            if (r0 >= r1) goto L242
            r0 = r14
            r1 = r15
            r0 = r0[r1]
            r16 = r0
            r0 = 0
            r17 = r0
            r0 = 0
            r18 = r0
        L210:
            r0 = r18
            r1 = r13
            int r1 = r1.length
            if (r0 >= r1) goto L235
            r0 = r13
            r1 = r18
            r0 = r0[r1]
            r19 = r0
            r0 = r16
            r1 = r19
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L22f
            r0 = 1
            r17 = r0
            goto L235
        L22f:
            int r18 = r18 + 1
            goto L210
        L235:
            r0 = r17
            if (r0 != 0) goto L23c
            r0 = 0
            return r0
        L23c:
            int r15 = r15 + 1
            goto L1fb
        L242:
            r0 = r12
            r1 = 2
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L26f
            r2 = r1
            r3 = 0
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r2[r3] = r4     // Catch: java.lang.NoSuchMethodException -> L26f
            r2 = r1
            r3 = 1
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r2[r3] = r4     // Catch: java.lang.NoSuchMethodException -> L26f
            java.lang.reflect.Constructor r0 = r0.getConstructor(r1)     // Catch: java.lang.NoSuchMethodException -> L26f
            r13 = r0
            r0 = r13
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.NoSuchMethodException -> L26f
            r2 = r1
            r3 = 0
            r4 = r10
            r2[r3] = r4     // Catch: java.lang.NoSuchMethodException -> L26f
            r2 = r1
            r3 = 1
            r4 = r11
            r2[r3] = r4     // Catch: java.lang.NoSuchMethodException -> L26f
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.NoSuchMethodException -> L26f
            java.security.Permission r0 = (java.security.Permission) r0     // Catch: java.lang.NoSuchMethodException -> L26f
            return r0
        L26f:
            r13 = move-exception
            r0 = r12
            r1 = 1
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L293
            r2 = r1
            r3 = 0
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r2[r3] = r4     // Catch: java.lang.NoSuchMethodException -> L293
            java.lang.reflect.Constructor r0 = r0.getConstructor(r1)     // Catch: java.lang.NoSuchMethodException -> L293
            r14 = r0
            r0 = r14
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.NoSuchMethodException -> L293
            r2 = r1
            r3 = 0
            r4 = r10
            r2[r3] = r4     // Catch: java.lang.NoSuchMethodException -> L293
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.NoSuchMethodException -> L293
            java.security.Permission r0 = (java.security.Permission) r0     // Catch: java.lang.NoSuchMethodException -> L293
            return r0
        L293:
            r14 = move-exception
            r0 = r12
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.reflect.Constructor r0 = r0.getConstructor(r1)
            r15 = r0
            r0 = r15
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r0 = r0.newInstance(r1)
            java.security.Permission r0 = (java.security.Permission) r0
            return r0
    }

    private java.lang.String expandStringWithProperty(java.lang.String r5) throws java.lang.Exception {
            r4 = this;
            r0 = r4
            boolean r0 = r0.expandProperties
            if (r0 != 0) goto L9
            r0 = r5
            return r0
        L9:
            r0 = r5
            if (r0 == 0) goto L17
            r0 = r5
            java.lang.String r1 = "${"
            int r0 = r0.indexOf(r1)
            r1 = -1
            if (r0 != r1) goto L19
        L17:
            r0 = r5
            return r0
        L19:
            java.lang.String r0 = ""
            r6 = r0
            r0 = r5
            java.lang.String r1 = "${"
            java.lang.String r1 = java.util.regex.Pattern.quote(r1)
            java.lang.String[] r0 = r0.split(r1)
            r7 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r7
            r2 = 0
            r1 = r1[r2]
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6 = r0
            r0 = 1
            r8 = r0
        L3e:
            r0 = r8
            r1 = r7
            int r1 = r1.length
            if (r0 >= r1) goto Le5
            r0 = r7
            r1 = r8
            r0 = r0[r1]
            r9 = r0
            r0 = r9
            java.lang.String r1 = "{"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "${"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6 = r0
            goto Ldf
        L71:
            r0 = r9
            java.lang.String r1 = "}"
            r2 = 2
            java.lang.String[] r0 = r0.split(r1, r2)
            r10 = r0
            r0 = r10
            int r0 = r0.length
            r1 = 2
            if (r0 >= r1) goto L8c
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            java.lang.String r2 = "ER001: Expand property without end } or inner property expansion!"
            r1.<init>(r2)
            throw r0
        L8c:
            r0 = r10
            r1 = 0
            r0 = r0[r1]
            java.lang.String r1 = "/"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = java.io.File.separator
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6 = r0
            goto Lc9
        Lb0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r10
            r2 = 0
            r1 = r1[r2]
            java.lang.String r1 = net.sourceforge.prograde.policy.SecurityActions.getSystemProperty(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6 = r0
        Lc9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r10
            r2 = 1
            r1 = r1[r2]
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6 = r0
        Ldf:
            int r8 = r8 + 1
            goto L3e
        Le5:
            r0 = r6
            return r0
    }

    private java.security.CodeSource createCodeSource(net.sourceforge.prograde.policyparser.ParsedPolicyEntry r6, java.security.KeyStore r7) throws java.lang.Exception {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.String r1 = r1.getCodebase()
            java.lang.String r0 = r0.expandStringWithProperty(r1)
            r8 = r0
            r0 = r5
            r1 = r6
            java.lang.String r1 = r1.getSignedBy()
            java.lang.String r0 = r0.expandStringWithProperty(r1)
            r9 = r0
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            r10 = r0
            r0 = r9
            if (r0 == 0) goto L27
            r0 = r9
            java.lang.String r1 = ","
            java.lang.String[] r0 = r0.split(r1)
            r10 = r0
        L27:
            r0 = r10
            int r0 = r0.length
            if (r0 <= 0) goto L3b
            r0 = r7
            if (r0 != 0) goto L3b
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            java.lang.String r2 = "ER002: Keystore must be defined if signedBy is used"
            r1.<init>(r2)
            throw r0
        L3b:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r11 = r0
            r0 = 0
            r12 = r0
        L47:
            r0 = r12
            r1 = r10
            int r1 = r1.length
            if (r0 >= r1) goto L74
            r0 = r7
            r1 = r10
            r2 = r12
            r1 = r1[r2]
            java.security.cert.Certificate r0 = r0.getCertificate(r1)
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L6c
            r0 = r11
            r1 = r13
            boolean r0 = r0.add(r1)
            goto L6e
        L6c:
            r0 = 0
            return r0
        L6e:
            int r12 = r12 + 1
            goto L47
        L74:
            r0 = r11
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L84
            r0 = 0
            r12 = r0
            goto L9a
        L84:
            r0 = r11
            int r0 = r0.size()
            java.security.cert.Certificate[] r0 = new java.security.cert.Certificate[r0]
            r12 = r0
            r0 = r11
            r1 = r12
            java.lang.Object[] r0 = r0.toArray(r1)
        L9a:
            r0 = r8
            if (r0 != 0) goto La4
            r0 = 0
            r13 = r0
            goto Lae
        La4:
            java.net.URL r0 = new java.net.URL
            r1 = r0
            r2 = r8
            r1.<init>(r2)
            r13 = r0
        Lae:
            java.security.CodeSource r0 = new java.security.CodeSource
            r1 = r0
            r2 = r5
            r3 = r13
            java.net.URL r2 = r2.adaptURL(r3)
            r3 = r12
            r1.<init>(r2, r3)
            r14 = r0
            r0 = r14
            return r0
    }

    private java.net.URL adaptURL(java.net.URL r5) throws java.lang.Exception {
            r4 = this;
            r0 = r5
            if (r0 == 0) goto L22
            r0 = r5
            java.lang.String r0 = r0.getProtocol()
            java.lang.String r1 = "file"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L22
            java.net.URL r0 = new java.net.URL
            r1 = r0
            r2 = r5
            java.net.URI r2 = r2.toURI()
            java.lang.String r2 = r2.toASCIIString()
            java.lang.String r2 = fixEncodedURI(r2)
            r1.<init>(r2)
            r5 = r0
        L22:
            r0 = r5
            return r0
    }

    private java.security.KeyStore createKeystore(net.sourceforge.prograde.policyparser.ParsedKeystoreEntry r6, java.lang.String r7, java.io.File r8) throws java.lang.Exception {
            r5 = this;
            r0 = r6
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r5
            r1 = r6
            java.lang.String r1 = r1.getKeystoreURL()
            java.lang.String r0 = r0.expandStringWithProperty(r1)
            r10 = r0
            r0 = r5
            r1 = r6
            java.lang.String r1 = r1.getKeystoreType()
            java.lang.String r0 = r0.expandStringWithProperty(r1)
            r11 = r0
            r0 = r5
            r1 = r6
            java.lang.String r1 = r1.getKeystoreProvider()
            java.lang.String r0 = r0.expandStringWithProperty(r1)
            r12 = r0
            r0 = r10
            if (r0 != 0) goto L33
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            java.lang.String r2 = "ER003: Null keystore url!"
            r1.<init>(r2)
            throw r0
        L33:
            r0 = r11
            if (r0 != 0) goto L3d
            java.lang.String r0 = java.security.KeyStore.getDefaultType()
            r11 = r0
        L3d:
            r0 = r12
            if (r0 != 0) goto L4c
            r0 = r11
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)
            r9 = r0
            goto L55
        L4c:
            r0 = r11
            r1 = r12
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0, r1)
            r9 = r0
        L55:
            r0 = 0
            r13 = r0
            r0 = r7
            if (r0 == 0) goto L68
            r0 = r5
            r1 = r5
            r2 = r7
            java.lang.String r1 = r1.expandStringWithProperty(r2)
            r2 = r8
            char[] r0 = r0.readKeystorePassword(r1, r2)
            r13 = r0
        L68:
            r0 = r5
            r1 = r8
            java.lang.String r0 = r0.getPolicyFileHome(r1)
            r14 = r0
            r0 = 0
            r15 = r0
            r0 = r14
            if (r0 == 0) goto L84
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r14
            r3 = r10
            r1.<init>(r2, r3)
            r15 = r0
        L84:
            r0 = r15
            if (r0 == 0) goto L91
            r0 = r15
            boolean r0 = r0.exists()
            if (r0 != 0) goto Lae
        L91:
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            r15 = r0
            r0 = r15
            boolean r0 = r0.exists()
            if (r0 != 0) goto Lae
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            java.lang.String r2 = "ER004: KeyStore doesn't exists!"
            r1.<init>(r2)
            throw r0
        Lae:
            r0 = 0
            r16 = r0
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Ld2
            r1 = r0
            r2 = r15
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Ld2
            r16 = r0
            r0 = r9
            r1 = r16
            r2 = r13
            r0.load(r1, r2)     // Catch: java.lang.Throwable -> Ld2
            r0 = r16
            if (r0 == 0) goto Le1
            r0 = r16
            r0.close()
            goto Le1
        Ld2:
            r17 = move-exception
            r0 = r16
            if (r0 == 0) goto Lde
            r0 = r16
            r0.close()
        Lde:
            r0 = r17
            throw r0
        Le1:
            r0 = r9
            return r0
    }

    private char[] readKeystorePassword(java.lang.String r6, java.io.File r7) throws java.lang.Exception {
            r5 = this;
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r5
            r3 = r7
            java.lang.String r2 = r2.getPolicyFileHome(r3)
            r3 = r6
            r1.<init>(r2, r3)
            r8 = r0
            r0 = r8
            boolean r0 = r0.exists()
            if (r0 != 0) goto L2f
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r8 = r0
            r0 = r8
            boolean r0 = r0.exists()
            if (r0 != 0) goto L2f
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            java.lang.String r2 = "ER005: File on keystorePasswordURL doesn't exists!"
            r1.<init>(r2)
            throw r0
        L2f:
            java.io.FileReader r0 = new java.io.FileReader
            r1 = r0
            r2 = r8
            r1.<init>(r2)
            r9 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = 64
            char[] r0 = new char[r0]
            r11 = r0
        L48:
            r0 = r9
            r1 = r11
            int r0 = r0.read(r1)
            r1 = r0
            r12 = r1
            if (r0 <= 0) goto L63
            r0 = r10
            r1 = r11
            r2 = 0
            r3 = r12
            java.lang.StringBuilder r0 = r0.append(r1, r2, r3)
            goto L48
        L63:
            r0 = r9
            r0.close()
            r0 = r10
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            char[] r0 = r0.toCharArray()
            return r0
    }

    private java.lang.String gainPrincipalFromAlias(java.lang.String r5, java.security.KeyStore r6) throws java.lang.Exception {
            r4 = this;
            r0 = r6
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r6
            r1 = r5
            boolean r0 = r0.containsAlias(r1)
            if (r0 != 0) goto L10
            r0 = 0
            return r0
        L10:
            r0 = r6
            r1 = r5
            java.security.cert.Certificate r0 = r0.getCertificate(r1)
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L21
            r0 = r7
            boolean r0 = r0 instanceof java.security.cert.X509Certificate
            if (r0 != 0) goto L23
        L21:
            r0 = 0
            return r0
        L23:
            r0 = r7
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            r8 = r0
            javax.security.auth.x500.X500Principal r0 = new javax.security.auth.x500.X500Principal
            r1 = r0
            r2 = r8
            javax.security.auth.x500.X500Principal r2 = r2.getSubjectX500Principal()
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            r9 = r0
            r0 = r9
            java.lang.String r0 = r0.getName()
            return r0
    }

    private java.lang.String getPolicyFileHome(java.io.File r3) {
            r2 = this;
            r0 = r3
            if (r0 == 0) goto Lb
            r0 = r3
            boolean r0 = r0.exists()
            if (r0 != 0) goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = r3
            java.io.File r0 = r0.getAbsoluteFile()
            java.lang.String r0 = r0.getParent()
            return r0
    }

    private java.util.List<net.sourceforge.prograde.policyparser.ParsedPolicy> getJavaPolicies() {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = 1
            r8 = r0
            r0 = 0
            r9 = r0
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "policy.url."
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = net.sourceforge.prograde.policy.SecurityActions.getSecurityProperty(r0)
            r1 = r0
            r9 = r1
            if (r0 == 0) goto L14b
            r0 = r6
            r1 = r9
            java.lang.String r0 = r0.expandStringWithProperty(r1)     // Catch: java.lang.Exception -> L30
            r9 = r0
            goto L67
        L30:
            r10 = move-exception
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Expanding filepath in policy policy.url."
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r8
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "="
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r9
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " failed. Exception message: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r10
            java.lang.String r2 = r2.getMessage()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            int r8 = r8 + 1
            goto Lc
        L67:
            r0 = 0
            r10 = r0
            r0 = 0
            r11 = r0
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> Le4 java.lang.Throwable -> L12c
            r1 = r0
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Exception -> Le4 java.lang.Throwable -> L12c
            r3 = r2
            r4 = r9
            r3.<init>(r4)     // Catch: java.lang.Exception -> Le4 java.lang.Throwable -> L12c
            java.io.InputStream r2 = r2.openStream()     // Catch: java.lang.Exception -> Le4 java.lang.Throwable -> L12c
            java.lang.String r3 = "UTF-8"
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> Le4 java.lang.Throwable -> L12c
            r11 = r0
            net.sourceforge.prograde.policyparser.Parser r0 = new net.sourceforge.prograde.policyparser.Parser     // Catch: java.lang.Exception -> Le4 java.lang.Throwable -> L12c
            r1 = r0
            r2 = r6
            boolean r2 = r2.debug     // Catch: java.lang.Exception -> Le4 java.lang.Throwable -> L12c
            r1.<init>(r2)     // Catch: java.lang.Exception -> Le4 java.lang.Throwable -> L12c
            r1 = r11
            net.sourceforge.prograde.policyparser.ParsedPolicy r0 = r0.parse(r1)     // Catch: java.lang.Exception -> Le4 java.lang.Throwable -> L12c
            r10 = r0
            r0 = r10
            if (r0 == 0) goto La6
            r0 = r7
            r1 = r10
            boolean r0 = r0.add(r1)     // Catch: java.lang.Exception -> Le4 java.lang.Throwable -> L12c
            goto Lcd
        La6:
            java.io.PrintStream r0 = java.lang.System.err     // Catch: java.lang.Exception -> Le4 java.lang.Throwable -> L12c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Le4 java.lang.Throwable -> L12c
            r2 = r1
            r2.<init>()     // Catch: java.lang.Exception -> Le4 java.lang.Throwable -> L12c
            java.lang.String r2 = "Parsed policy policy.url."
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Exception -> Le4 java.lang.Throwable -> L12c
            r2 = r8
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Exception -> Le4 java.lang.Throwable -> L12c
            java.lang.String r2 = "="
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Exception -> Le4 java.lang.Throwable -> L12c
            r2 = r9
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Exception -> Le4 java.lang.Throwable -> L12c
            java.lang.String r2 = " is null"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Exception -> Le4 java.lang.Throwable -> L12c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> Le4 java.lang.Throwable -> L12c
            r0.println(r1)     // Catch: java.lang.Exception -> Le4 java.lang.Throwable -> L12c
        Lcd:
            r0 = r11
            if (r0 == 0) goto L145
            r0 = r11
            r0.close()     // Catch: java.io.IOException -> Lda
            goto L145
        Lda:
            r12 = move-exception
            r0 = r12
            r0.printStackTrace()
            goto L145
        Le4:
            r12 = move-exception
            java.io.PrintStream r0 = java.lang.System.err     // Catch: java.lang.Throwable -> L12c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12c
            r2 = r1
            r2.<init>()     // Catch: java.lang.Throwable -> L12c
            java.lang.String r2 = "Policy policy.url."
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L12c
            r2 = r8
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L12c
            java.lang.String r2 = "="
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L12c
            r2 = r9
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L12c
            java.lang.String r2 = " wasn't successfully parsed. Exception message: "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L12c
            r2 = r12
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L12c
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L12c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L12c
            r0.println(r1)     // Catch: java.lang.Throwable -> L12c
            r0 = r11
            if (r0 == 0) goto L145
            r0 = r11
            r0.close()     // Catch: java.io.IOException -> L122
            goto L145
        L122:
            r12 = move-exception
            r0 = r12
            r0.printStackTrace()
            goto L145
        L12c:
            r13 = move-exception
            r0 = r11
            if (r0 == 0) goto L142
            r0 = r11
            r0.close()     // Catch: java.io.IOException -> L13b
            goto L142
        L13b:
            r14 = move-exception
            r0 = r14
            r0.printStackTrace()
        L142:
            r0 = r13
            throw r0
        L145:
            int r8 = r8 + 1
            goto Lc
        L14b:
            r0 = r7
            return r0
    }

    private void initializeStaticPolicy(java.util.List<net.sourceforge.prograde.policy.ProGradePolicyEntry> r7) throws java.lang.Exception {
            r6 = this;
            net.sourceforge.prograde.policy.ProGradePolicyEntry r0 = new net.sourceforge.prograde.policy.ProGradePolicyEntry
            r1 = r0
            r2 = 1
            r3 = r6
            boolean r3 = r3.debug
            r1.<init>(r2, r3)
            r8 = r0
            r0 = 0
            r9 = r0
            java.net.URL r0 = new java.net.URL
            r1 = r0
            r2 = r6
            java.lang.String r3 = "file:${{java.ext.dirs}}/*"
            java.lang.String r2 = r2.expandStringWithProperty(r3)
            r1.<init>(r2)
            r10 = r0
            java.security.CodeSource r0 = new java.security.CodeSource
            r1 = r0
            r2 = r6
            r3 = r10
            java.net.URL r2 = r2.adaptURL(r3)
            r3 = r9
            r1.<init>(r2, r3)
            r11 = r0
            r0 = r8
            r1 = r11
            r0.setCodeSource(r1)
            r0 = r8
            java.security.AllPermission r1 = new java.security.AllPermission
            r2 = r1
            r2.<init>()
            r0.addPermission(r1)
            r0 = r7
            r1 = r8
            boolean r0 = r0.add(r1)
            net.sourceforge.prograde.policy.ProGradePolicyEntry r0 = new net.sourceforge.prograde.policy.ProGradePolicyEntry
            r1 = r0
            r2 = 1
            r3 = r6
            boolean r3 = r3.debug
            r1.<init>(r2, r3)
            r12 = r0
            r0 = r12
            java.lang.RuntimePermission r1 = new java.lang.RuntimePermission
            r2 = r1
            java.lang.String r3 = "stopThread"
            r2.<init>(r3)
            r0.addPermission(r1)
            r0 = r12
            java.net.SocketPermission r1 = new java.net.SocketPermission
            r2 = r1
            java.lang.String r3 = "localhost:1024-"
            java.lang.String r4 = "listen"
            r2.<init>(r3, r4)
            r0.addPermission(r1)
            r0 = r12
            java.util.PropertyPermission r1 = new java.util.PropertyPermission
            r2 = r1
            java.lang.String r3 = "java.version"
            java.lang.String r4 = "read"
            r2.<init>(r3, r4)
            r0.addPermission(r1)
            r0 = r12
            java.util.PropertyPermission r1 = new java.util.PropertyPermission
            r2 = r1
            java.lang.String r3 = "java.vendor"
            java.lang.String r4 = "read"
            r2.<init>(r3, r4)
            r0.addPermission(r1)
            r0 = r12
            java.util.PropertyPermission r1 = new java.util.PropertyPermission
            r2 = r1
            java.lang.String r3 = "java.vendor.url"
            java.lang.String r4 = "read"
            r2.<init>(r3, r4)
            r0.addPermission(r1)
            r0 = r12
            java.util.PropertyPermission r1 = new java.util.PropertyPermission
            r2 = r1
            java.lang.String r3 = "java.class.version"
            java.lang.String r4 = "read"
            r2.<init>(r3, r4)
            r0.addPermission(r1)
            r0 = r12
            java.util.PropertyPermission r1 = new java.util.PropertyPermission
            r2 = r1
            java.lang.String r3 = "os.name"
            java.lang.String r4 = "read"
            r2.<init>(r3, r4)
            r0.addPermission(r1)
            r0 = r12
            java.util.PropertyPermission r1 = new java.util.PropertyPermission
            r2 = r1
            java.lang.String r3 = "os.version"
            java.lang.String r4 = "read"
            r2.<init>(r3, r4)
            r0.addPermission(r1)
            r0 = r12
            java.util.PropertyPermission r1 = new java.util.PropertyPermission
            r2 = r1
            java.lang.String r3 = "os.arch"
            java.lang.String r4 = "read"
            r2.<init>(r3, r4)
            r0.addPermission(r1)
            r0 = r12
            java.util.PropertyPermission r1 = new java.util.PropertyPermission
            r2 = r1
            java.lang.String r3 = "file.separator"
            java.lang.String r4 = "read"
            r2.<init>(r3, r4)
            r0.addPermission(r1)
            r0 = r12
            java.util.PropertyPermission r1 = new java.util.PropertyPermission
            r2 = r1
            java.lang.String r3 = "path.separator"
            java.lang.String r4 = "read"
            r2.<init>(r3, r4)
            r0.addPermission(r1)
            r0 = r12
            java.util.PropertyPermission r1 = new java.util.PropertyPermission
            r2 = r1
            java.lang.String r3 = "line.separator"
            java.lang.String r4 = "read"
            r2.<init>(r3, r4)
            r0.addPermission(r1)
            r0 = r12
            java.util.PropertyPermission r1 = new java.util.PropertyPermission
            r2 = r1
            java.lang.String r3 = "java.specification.version"
            java.lang.String r4 = "read"
            r2.<init>(r3, r4)
            r0.addPermission(r1)
            r0 = r12
            java.util.PropertyPermission r1 = new java.util.PropertyPermission
            r2 = r1
            java.lang.String r3 = "java.specification.vendor"
            java.lang.String r4 = "read"
            r2.<init>(r3, r4)
            r0.addPermission(r1)
            r0 = r12
            java.util.PropertyPermission r1 = new java.util.PropertyPermission
            r2 = r1
            java.lang.String r3 = "java.specification.name"
            java.lang.String r4 = "read"
            r2.<init>(r3, r4)
            r0.addPermission(r1)
            r0 = r12
            java.util.PropertyPermission r1 = new java.util.PropertyPermission
            r2 = r1
            java.lang.String r3 = "java.vm.specification.version"
            java.lang.String r4 = "read"
            r2.<init>(r3, r4)
            r0.addPermission(r1)
            r0 = r12
            java.util.PropertyPermission r1 = new java.util.PropertyPermission
            r2 = r1
            java.lang.String r3 = "java.vm.specification.vendor"
            java.lang.String r4 = "read"
            r2.<init>(r3, r4)
            r0.addPermission(r1)
            r0 = r12
            java.util.PropertyPermission r1 = new java.util.PropertyPermission
            r2 = r1
            java.lang.String r3 = "java.vm.specification.name"
            java.lang.String r4 = "read"
            r2.<init>(r3, r4)
            r0.addPermission(r1)
            r0 = r12
            java.util.PropertyPermission r1 = new java.util.PropertyPermission
            r2 = r1
            java.lang.String r3 = "java.vm.version"
            java.lang.String r4 = "read"
            r2.<init>(r3, r4)
            r0.addPermission(r1)
            r0 = r12
            java.util.PropertyPermission r1 = new java.util.PropertyPermission
            r2 = r1
            java.lang.String r3 = "java.vm.vendor"
            java.lang.String r4 = "read"
            r2.<init>(r3, r4)
            r0.addPermission(r1)
            r0 = r12
            java.util.PropertyPermission r1 = new java.util.PropertyPermission
            r2 = r1
            java.lang.String r3 = "java.vm.name"
            java.lang.String r4 = "read"
            r2.<init>(r3, r4)
            r0.addPermission(r1)
            r0 = r7
            r1 = r12
            boolean r0 = r0.add(r1)
            return
    }

    private static java.lang.String fixEncodedURI(java.lang.String r4) {
            r0 = r4
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = -3
            r6 = r0
            r0 = 0
            r7 = r0
            r0 = r4
            int r0 = r0.length()
            r8 = r0
        L19:
            r0 = r7
            r1 = r8
            if (r0 >= r1) goto L5f
            r0 = r4
            r1 = r7
            char r0 = r0.charAt(r1)
            r9 = r0
            r0 = r9
            r1 = 37
            if (r0 != r1) goto L32
            r0 = r7
            r6 = r0
            goto L52
        L32:
            r0 = r6
            r1 = r7
            r2 = 2
            int r1 = r1 - r2
            if (r0 < r1) goto L52
            r0 = r9
            r1 = 65
            if (r0 < r1) goto L52
            r0 = r9
            r1 = 70
            if (r0 > r1) goto L52
            r0 = r9
            r1 = 65
            int r0 = r0 - r1
            r1 = 97
            int r0 = r0 + r1
            char r0 = (char) r0
            r9 = r0
        L52:
            r0 = r5
            r1 = r9
            java.lang.StringBuilder r0 = r0.append(r1)
            int r7 = r7 + 1
            goto L19
        L5f:
            r0 = r5
            java.lang.String r0 = r0.toString()
            return r0
    }

    private java.security.cert.Certificate[] getCertificates(java.lang.String r5, java.security.KeyStore r6) throws java.lang.Exception {
            r4 = this;
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            r7 = r0
            r0 = r5
            if (r0 == 0) goto L10
            r0 = r5
            java.lang.String r1 = ","
            java.lang.String[] r0 = r0.split(r1)
            r7 = r0
        L10:
            r0 = r7
            int r0 = r0.length
            if (r0 <= 0) goto L24
            r0 = r6
            if (r0 != 0) goto L24
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            java.lang.String r2 = "ER006: Keystore must be defined if signedBy is used"
            r1.<init>(r2)
            throw r0
        L24:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = 0
            r9 = r0
        L30:
            r0 = r9
            r1 = r7
            int r1 = r1.length
            if (r0 >= r1) goto L5b
            r0 = r6
            r1 = r7
            r2 = r9
            r1 = r1[r2]
            java.security.cert.Certificate r0 = r0.getCertificate(r1)
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L53
            r0 = r8
            r1 = r10
            boolean r0 = r0.add(r1)
            goto L55
        L53:
            r0 = 0
            return r0
        L55:
            int r9 = r9 + 1
            goto L30
        L5b:
            r0 = r8
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L6b
            r0 = 0
            r9 = r0
            goto L81
        L6b:
            r0 = r8
            int r0 = r0.size()
            java.security.cert.Certificate[] r0 = new java.security.cert.Certificate[r0]
            r9 = r0
            r0 = r8
            r1 = r9
            java.lang.Object[] r0 = r0.toArray(r1)
        L81:
            r0 = r9
            return r0
    }
}
