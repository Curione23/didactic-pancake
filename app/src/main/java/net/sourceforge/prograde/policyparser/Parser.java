package net.sourceforge.prograde.policyparser;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/pro-grade.jar:net/sourceforge/prograde/policyparser/Parser.class */
public class Parser {
    private int lookahead;
    private java.io.StreamTokenizer st;
    private java.util.List<net.sourceforge.prograde.policyparser.ParsedPolicyEntry> grantEntries;
    private java.util.List<net.sourceforge.prograde.policyparser.ParsedPolicyEntry> denyEntries;
    private net.sourceforge.prograde.policyparser.ParsedKeystoreEntry keystoreEntry;
    private java.lang.String keystorePasswordURL;
    private net.sourceforge.prograde.type.Priority priority;
    private boolean debug;

    public Parser() {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.<init>(r1)
            return
    }

    public Parser(boolean r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = 0
            r0.debug = r1
            r0 = r3
            r1 = r4
            r0.debug = r1
            return
    }

    public net.sourceforge.prograde.policyparser.ParsedPolicy parse(java.io.File r7) throws java.lang.Exception {
            r6 = this;
            r0 = r7
            if (r0 == 0) goto Lb
            r0 = r7
            boolean r0 = r0.exists()
            if (r0 != 0) goto L4d
        Lb:
            r0 = r6
            boolean r0 = r0.debug
            if (r0 == 0) goto L43
            r0 = r7
            if (r0 != 0) goto L1e
            java.lang.String r0 = "Given File is null"
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
            goto L43
        L1e:
            r0 = r7
            boolean r0 = r0.exists()
            if (r0 != 0) goto L43
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "Policy file "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r7
            java.lang.String r1 = r1.getCanonicalPath()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " doesn't exists."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
        L43:
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            java.lang.String r2 = "ER007: File with policy doesn't exists!"
            r1.<init>(r2)
            throw r0
        L4d:
            r0 = r6
            boolean r0 = r0.debug
            if (r0 == 0) goto L6d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "Parsing policy "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r7
            java.lang.String r1 = r1.getCanonicalPath()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
        L6d:
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r1 = r0
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r3 = r2
            r4 = r7
            r3.<init>(r4)
            java.lang.String r3 = "UTF-8"
            r1.<init>(r2, r3)
            r8 = r0
            r0 = r6
            r1 = r8
            net.sourceforge.prograde.policyparser.ParsedPolicy r0 = r0.parse(r1)     // Catch: java.lang.Throwable -> L8b
            r9 = r0
            r0 = r8
            r0.close()
            r0 = r9
            return r0
        L8b:
            r10 = move-exception
            r0 = r8
            r0.close()
            r0 = r10
            throw r0
    }

    public net.sourceforge.prograde.policyparser.ParsedPolicy parse(java.io.Reader r9) throws java.lang.Exception {
            r8 = this;
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            r10 = r0
            r0 = r8
            java.io.StreamTokenizer r1 = new java.io.StreamTokenizer
            r2 = r1
            r3 = r10
            r2.<init>(r3)
            r0.st = r1
            r0 = r8
            java.io.StreamTokenizer r0 = r0.st
            r0.resetSyntax()
            r0 = r8
            java.io.StreamTokenizer r0 = r0.st
            r1 = 97
            r2 = 122(0x7a, float:1.71E-43)
            r0.wordChars(r1, r2)
            r0 = r8
            java.io.StreamTokenizer r0 = r0.st
            r1 = 65
            r2 = 90
            r0.wordChars(r1, r2)
            r0 = r8
            java.io.StreamTokenizer r0 = r0.st
            r1 = 46
            r2 = 46
            r0.wordChars(r1, r2)
            r0 = r8
            java.io.StreamTokenizer r0 = r0.st
            r1 = 48
            r2 = 57
            r0.wordChars(r1, r2)
            r0 = r8
            java.io.StreamTokenizer r0 = r0.st
            r1 = 95
            r2 = 95
            r0.wordChars(r1, r2)
            r0 = r8
            java.io.StreamTokenizer r0 = r0.st
            r1 = 36
            r2 = 36
            r0.wordChars(r1, r2)
            r0 = r8
            java.io.StreamTokenizer r0 = r0.st
            r1 = 160(0xa0, float:2.24E-43)
            r2 = 255(0xff, float:3.57E-43)
            r0.wordChars(r1, r2)
            r0 = r8
            java.io.StreamTokenizer r0 = r0.st
            r1 = 0
            r2 = 32
            r0.whitespaceChars(r1, r2)
            r0 = r8
            java.io.StreamTokenizer r0 = r0.st
            r1 = 47
            r0.commentChar(r1)
            r0 = r8
            java.io.StreamTokenizer r0 = r0.st
            r1 = 39
            r0.quoteChar(r1)
            r0 = r8
            java.io.StreamTokenizer r0 = r0.st
            r1 = 34
            r0.quoteChar(r1)
            r0 = r8
            java.io.StreamTokenizer r0 = r0.st
            r1 = 0
            r0.lowerCaseMode(r1)
            r0 = r8
            java.io.StreamTokenizer r0 = r0.st
            r1 = 47
            r0.ordinaryChar(r1)
            r0 = r8
            java.io.StreamTokenizer r0 = r0.st
            r1 = 1
            r0.slashSlashComments(r1)
            r0 = r8
            java.io.StreamTokenizer r0 = r0.st
            r1 = 1
            r0.slashStarComments(r1)
            r0 = r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.grantEntries = r1
            r0 = r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.denyEntries = r1
            r0 = r8
            r1 = r8
            java.io.StreamTokenizer r1 = r1.st
            int r1 = r1.nextToken()
            r0.lookahead = r1
        Ld2:
            r0 = r8
            int r0 = r0.lookahead
            r1 = -1
            if (r0 == r1) goto L19c
            r0 = r8
            int r0 = r0.lookahead
            switch(r0) {
                case -3: goto Lf8;
                case 59: goto L181;
                default: goto L184;
            }
        Lf8:
            r0 = r8
            java.io.StreamTokenizer r0 = r0.st
            java.lang.String r0 = r0.sval
            r11 = r0
            r0 = r11
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "grant"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L114
            r0 = r8
            r1 = 1
            r0.parseGrantOrDenyEntry(r1)
            goto L18e
        L114:
            r0 = r11
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "deny"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L128
            r0 = r8
            r1 = 0
            r0.parseGrantOrDenyEntry(r1)
            goto L18e
        L128:
            r0 = r11
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "keystore"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L13b
            r0 = r8
            r0.parseKeystore()
            goto L18e
        L13b:
            r0 = r11
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "keystorepasswordurl"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L14e
            r0 = r8
            r0.parseKeystorePassword()
            goto L18e
        L14e:
            r0 = r11
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "priority"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L161
            r0 = r8
            r0.parsePriority()
            goto L18e
        L161:
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "ER008: grant, deny, keystore or keystorePasswordURL expected, but was ["
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r11
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "]"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L181:
            goto L18e
        L184:
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            java.lang.String r2 = "ER009: some of keyword expected!"
            r1.<init>(r2)
            throw r0
        L18e:
            r0 = r8
            r1 = r8
            java.io.StreamTokenizer r1 = r1.st
            int r1 = r1.nextToken()
            r0.lookahead = r1
            goto Ld2
        L19c:
            r0 = r8
            boolean r0 = r0.debug
            if (r0 == 0) goto L263
            r0 = r8
            java.util.List<net.sourceforge.prograde.policyparser.ParsedPolicyEntry> r0 = r0.grantEntries
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
        L1ad:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L1d1
            r0 = r11
            java.lang.Object r0 = r0.next()
            net.sourceforge.prograde.policyparser.ParsedPolicyEntry r0 = (net.sourceforge.prograde.policyparser.ParsedPolicyEntry) r0
            r12 = r0
            java.lang.String r0 = "Adding following grant entry:"
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
            r0 = r12
            java.lang.String r0 = r0.toString()
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
            goto L1ad
        L1d1:
            r0 = r8
            java.util.List<net.sourceforge.prograde.policyparser.ParsedPolicyEntry> r0 = r0.denyEntries
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
        L1db:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L1ff
            r0 = r11
            java.lang.Object r0 = r0.next()
            net.sourceforge.prograde.policyparser.ParsedPolicyEntry r0 = (net.sourceforge.prograde.policyparser.ParsedPolicyEntry) r0
            r12 = r0
            java.lang.String r0 = "Adding following deny entry:"
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
            r0 = r12
            java.lang.String r0 = r0.toString()
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
            goto L1db
        L1ff:
            r0 = r8
            net.sourceforge.prograde.policyparser.ParsedKeystoreEntry r0 = r0.keystoreEntry
            if (r0 != 0) goto L20e
            java.lang.String r0 = "KeyStore isn't set"
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
            goto L21d
        L20e:
            java.lang.String r0 = "Adding following keystore:"
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
            r0 = r8
            net.sourceforge.prograde.policyparser.ParsedKeystoreEntry r0 = r0.keystoreEntry
            java.lang.String r0 = r0.toString()
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
        L21d:
            r0 = r8
            java.lang.String r0 = r0.keystorePasswordURL
            if (r0 != 0) goto L22c
            java.lang.String r0 = "KeystorePasswordURL isn't set"
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
            goto L245
        L22c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "Adding following keystorePasswordURL: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r8
            java.lang.String r1 = r1.keystorePasswordURL
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
        L245:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "Adding following priority: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r8
            net.sourceforge.prograde.type.Priority r1 = r1.priority
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
        L263:
            net.sourceforge.prograde.policyparser.ParsedPolicy r0 = new net.sourceforge.prograde.policyparser.ParsedPolicy
            r1 = r0
            r2 = r8
            java.util.List<net.sourceforge.prograde.policyparser.ParsedPolicyEntry> r2 = r2.grantEntries
            r3 = r8
            java.util.List<net.sourceforge.prograde.policyparser.ParsedPolicyEntry> r3 = r3.denyEntries
            r4 = r8
            net.sourceforge.prograde.policyparser.ParsedKeystoreEntry r4 = r4.keystoreEntry
            r5 = r8
            java.lang.String r5 = r5.keystorePasswordURL
            r6 = r8
            net.sourceforge.prograde.type.Priority r6 = r6.priority
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
    }

    private void parseGrantOrDenyEntry(boolean r5) throws java.lang.Exception {
            r4 = this;
            net.sourceforge.prograde.policyparser.ParsedPolicyEntry r0 = new net.sourceforge.prograde.policyparser.ParsedPolicyEntry
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = 1
            r7 = r0
            r0 = r4
            r1 = r4
            java.io.StreamTokenizer r1 = r1.st
            int r1 = r1.nextToken()
            r0.lookahead = r1
        L15:
            r0 = r4
            int r0 = r0.lookahead
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 == r1) goto L128
            r0 = r4
            int r0 = r0.lookahead
            switch(r0) {
                case -3: goto L3c;
                case 44: goto Lfd;
                default: goto L110;
            }
        L3c:
            r0 = r4
            java.io.StreamTokenizer r0 = r0.st
            java.lang.String r0 = r0.sval
            r8 = r0
            r0 = 1
            r7 = r0
            r0 = r8
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "codebase"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L91
            r0 = r6
            java.lang.String r0 = r0.getCodebase()
            if (r0 == 0) goto L65
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            java.lang.String r2 = "ER010: More codebase expression!"
            r1.<init>(r2)
            throw r0
        L65:
            r0 = r4
            r1 = r4
            java.io.StreamTokenizer r1 = r1.st
            int r1 = r1.nextToken()
            r0.lookahead = r1
            r0 = r4
            int r0 = r0.lookahead
            r1 = 34
            if (r0 != r1) goto L87
            r0 = r6
            r1 = r4
            java.io.StreamTokenizer r1 = r1.st
            java.lang.String r1 = r1.sval
            r0.setCodebase(r1)
            goto L11a
        L87:
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            java.lang.String r2 = "ER011: Codebase parameter have to start with \"."
            r1.<init>(r2)
            throw r0
        L91:
            r0 = r8
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "signedby"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Ldb
            r0 = r6
            java.lang.String r0 = r0.getSignedBy()
            if (r0 == 0) goto Laf
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            java.lang.String r2 = "ER012: More signedBy expression!"
            r1.<init>(r2)
            throw r0
        Laf:
            r0 = r4
            r1 = r4
            java.io.StreamTokenizer r1 = r1.st
            int r1 = r1.nextToken()
            r0.lookahead = r1
            r0 = r4
            int r0 = r0.lookahead
            r1 = 34
            if (r0 != r1) goto Ld1
            r0 = r6
            r1 = r4
            java.io.StreamTokenizer r1 = r1.st
            java.lang.String r1 = r1.sval
            r0.setSignedBy(r1)
            goto L11a
        Ld1:
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            java.lang.String r2 = "ER013: SignedBy parameter have to start with \"."
            r1.<init>(r2)
            throw r0
        Ldb:
            r0 = r8
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "principal"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lf3
            r0 = r6
            r1 = r4
            net.sourceforge.prograde.policyparser.ParsedPrincipal r1 = r1.parsePrincipal()
            r0.addPrincipal(r1)
            goto L11a
        Lf3:
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            java.lang.String r2 = "ER014: Codebase, signedBy or principal expected."
            r1.<init>(r2)
            throw r0
        Lfd:
            r0 = r7
            if (r0 != 0) goto L10b
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            java.lang.String r2 = "ER015: Some of keywords expected, but there was [,,] instead."
            r1.<init>(r2)
            throw r0
        L10b:
            r0 = 0
            r7 = r0
            goto L11a
        L110:
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            java.lang.String r2 = "ER016: Some of keywords or '{' expected."
            r1.<init>(r2)
            throw r0
        L11a:
            r0 = r4
            r1 = r4
            java.io.StreamTokenizer r1 = r1.st
            int r1 = r1.nextToken()
            r0.lookahead = r1
            goto L15
        L128:
            r0 = r7
            if (r0 != 0) goto L136
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            java.lang.String r2 = "ER017: Some of keywords expected, but there was [,{] instead."
            r1.<init>(r2)
            throw r0
        L136:
            r0 = r4
            r1 = r4
            java.io.StreamTokenizer r1 = r1.st
            int r1 = r1.nextToken()
            r0.lookahead = r1
        L141:
            r0 = r4
            int r0 = r0.lookahead
            r1 = 125(0x7d, float:1.75E-43)
            if (r0 == r1) goto L176
            r0 = r4
            java.io.StreamTokenizer r0 = r0.st
            java.lang.String r0 = r0.sval
            r8 = r0
            r0 = r8
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "permission"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L168
            r0 = r6
            r1 = r4
            net.sourceforge.prograde.policyparser.ParsedPermission r1 = r1.parsePermission()
            r0.addPermission(r1)
        L168:
            r0 = r4
            r1 = r4
            java.io.StreamTokenizer r1 = r1.st
            int r1 = r1.nextToken()
            r0.lookahead = r1
            goto L141
        L176:
            r0 = r5
            if (r0 == 0) goto L188
            r0 = r4
            java.util.List<net.sourceforge.prograde.policyparser.ParsedPolicyEntry> r0 = r0.grantEntries
            r1 = r6
            boolean r0 = r0.add(r1)
            goto L193
        L188:
            r0 = r4
            java.util.List<net.sourceforge.prograde.policyparser.ParsedPolicyEntry> r0 = r0.denyEntries
            r1 = r6
            boolean r0 = r0.add(r1)
        L193:
            return
    }

    private net.sourceforge.prograde.policyparser.ParsedPrincipal parsePrincipal() throws java.lang.Exception {
            r5 = this;
            r0 = r5
            r1 = r5
            java.io.StreamTokenizer r1 = r1.st
            int r1 = r1.nextToken()
            r0.lookahead = r1
            r0 = r5
            int r0 = r0.lookahead
            switch(r0) {
                case -3: goto L67;
                case 34: goto L58;
                case 42: goto L30;
                default: goto Lbc;
            }
        L30:
            r0 = r5
            r1 = r5
            java.io.StreamTokenizer r1 = r1.st
            int r1 = r1.nextToken()
            r0.lookahead = r1
            r0 = r5
            int r0 = r0.lookahead
            r1 = 42
            if (r0 != r1) goto L4e
            net.sourceforge.prograde.policyparser.ParsedPrincipal r0 = new net.sourceforge.prograde.policyparser.ParsedPrincipal
            r1 = r0
            r2 = 0
            r3 = 0
            r1.<init>(r2, r3)
            return r0
        L4e:
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            java.lang.String r2 = "ER018: There have to be name wildcard after type wildcard."
            r1.<init>(r2)
            throw r0
        L58:
            net.sourceforge.prograde.policyparser.ParsedPrincipal r0 = new net.sourceforge.prograde.policyparser.ParsedPrincipal
            r1 = r0
            r2 = r5
            java.io.StreamTokenizer r2 = r2.st
            java.lang.String r2 = r2.sval
            r1.<init>(r2)
            return r0
        L67:
            r0 = r5
            java.io.StreamTokenizer r0 = r0.st
            java.lang.String r0 = r0.sval
            r6 = r0
            r0 = r5
            r1 = r5
            java.io.StreamTokenizer r1 = r1.st
            int r1 = r1.nextToken()
            r0.lookahead = r1
            r0 = r5
            int r0 = r0.lookahead
            switch(r0) {
                case 34: goto La2;
                case 42: goto L98;
                default: goto Lb2;
            }
        L98:
            net.sourceforge.prograde.policyparser.ParsedPrincipal r0 = new net.sourceforge.prograde.policyparser.ParsedPrincipal
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
        La2:
            net.sourceforge.prograde.policyparser.ParsedPrincipal r0 = new net.sourceforge.prograde.policyparser.ParsedPrincipal
            r1 = r0
            r2 = r6
            r3 = r5
            java.io.StreamTokenizer r3 = r3.st
            java.lang.String r3 = r3.sval
            r1.<init>(r2, r3)
            return r0
        Lb2:
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            java.lang.String r2 = "ER019: Principal name or * expected."
            r1.<init>(r2)
            throw r0
        Lbc:
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            java.lang.String r2 = "ER020: Principal type, *, or keystore alias expected."
            r1.<init>(r2)
            throw r0
    }

    private net.sourceforge.prograde.policyparser.ParsedPermission parsePermission() throws java.lang.Exception {
            r5 = this;
            net.sourceforge.prograde.policyparser.ParsedPermission r0 = new net.sourceforge.prograde.policyparser.ParsedPermission
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r5
            r1 = r5
            java.io.StreamTokenizer r1 = r1.st
            int r1 = r1.nextToken()
            r0.lookahead = r1
            r0 = r5
            int r0 = r0.lookahead
            r1 = -3
            if (r0 != r1) goto L2a
            r0 = r6
            r1 = r5
            java.io.StreamTokenizer r1 = r1.st
            java.lang.String r1 = r1.sval
            r0.setPermissionType(r1)
            goto L34
        L2a:
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            java.lang.String r2 = "ER021: Permission type expected."
            r1.<init>(r2)
            throw r0
        L34:
            r0 = r5
            r1 = r5
            java.io.StreamTokenizer r1 = r1.st
            int r1 = r1.nextToken()
            r0.lookahead = r1
            r0 = r5
            int r0 = r0.lookahead
            r1 = 34
            if (r0 != r1) goto L56
            r0 = r6
            r1 = r5
            java.io.StreamTokenizer r1 = r1.st
            java.lang.String r1 = r1.sval
            r0.setPermissionName(r1)
            goto L6b
        L56:
            r0 = r5
            int r0 = r0.lookahead
            r1 = 59
            if (r0 != r1) goto L61
            r0 = r6
            return r0
        L61:
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            java.lang.String r2 = "ER022: Permission name or or [;] expected."
            r1.<init>(r2)
            throw r0
        L6b:
            r0 = r5
            r1 = r5
            java.io.StreamTokenizer r1 = r1.st
            int r1 = r1.nextToken()
            r0.lookahead = r1
            r0 = r5
            int r0 = r0.lookahead
            r1 = 44
            if (r0 != r1) goto L177
            r0 = r5
            r1 = r5
            java.io.StreamTokenizer r1 = r1.st
            int r1 = r1.nextToken()
            r0.lookahead = r1
            r0 = 0
            r7 = r0
            r0 = r5
            int r0 = r0.lookahead
            r1 = 34
            if (r0 != r1) goto Le8
            r0 = r5
            java.io.StreamTokenizer r0 = r0.st
            java.lang.String r0 = r0.sval
            r8 = r0
            r0 = r6
            r1 = r8
            r0.setActions(r1)
            r0 = r5
            r1 = r5
            java.io.StreamTokenizer r1 = r1.st
            int r1 = r1.nextToken()
            r0.lookahead = r1
            r0 = r5
            int r0 = r0.lookahead
            switch(r0) {
                case 44: goto Lcc;
                case 59: goto Ld1;
                default: goto Ld3;
            }
        Lcc:
            r0 = 1
            r7 = r0
            goto Ldd
        Ld1:
            r0 = r6
            return r0
        Ld3:
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            java.lang.String r2 = "ER023: Unexpected symbol, expected [,] or [;]."
            r1.<init>(r2)
            throw r0
        Ldd:
            r0 = r5
            r1 = r5
            java.io.StreamTokenizer r1 = r1.st
            int r1 = r1.nextToken()
            r0.lookahead = r1
        Le8:
            r0 = r5
            int r0 = r0.lookahead
            r1 = -3
            if (r0 != r1) goto L128
            r0 = r5
            java.io.StreamTokenizer r0 = r0.st
            java.lang.String r0 = r0.sval
            r8 = r0
            r0 = r8
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "signedby"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L125
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "ER024: [signedBy] expected but was ["
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r8
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "]."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L125:
            goto L140
        L128:
            r0 = r7
            if (r0 == 0) goto L136
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            java.lang.String r2 = "ER025: [signedBy] expected after [,]."
            r1.<init>(r2)
            throw r0
        L136:
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            java.lang.String r2 = "ER026: Actions or [signedBy] expected after [,]."
            r1.<init>(r2)
            throw r0
        L140:
            r0 = r5
            r1 = r5
            java.io.StreamTokenizer r1 = r1.st
            int r1 = r1.nextToken()
            r0.lookahead = r1
            r0 = r5
            int r0 = r0.lookahead
            r1 = 34
            if (r0 != r1) goto L162
            r0 = r6
            r1 = r5
            java.io.StreamTokenizer r1 = r1.st
            java.lang.String r1 = r1.sval
            r0.setSignedBy(r1)
            goto L16c
        L162:
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            java.lang.String r2 = "ER027: signedBy attribute expected."
            r1.<init>(r2)
            throw r0
        L16c:
            r0 = r5
            r1 = r5
            java.io.StreamTokenizer r1 = r1.st
            int r1 = r1.nextToken()
            r0.lookahead = r1
        L177:
            r0 = r5
            int r0 = r0.lookahead
            r1 = 59
            if (r0 != r1) goto L182
            r0 = r6
            return r0
        L182:
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            java.lang.String r2 = "ER028: [;] expected."
            r1.<init>(r2)
            throw r0
    }

    private void parseKeystore() throws java.lang.Exception {
            r7 = this;
            r0 = 0
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = r7
            r1 = r7
            java.io.StreamTokenizer r1 = r1.st
            int r1 = r1.nextToken()
            r0.lookahead = r1
            r0 = r7
            int r0 = r0.lookahead
            r1 = 34
            if (r0 != r1) goto L25
            r0 = r7
            java.io.StreamTokenizer r0 = r0.st
            java.lang.String r0 = r0.sval
            r8 = r0
            goto L2f
        L25:
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            java.lang.String r2 = "ER029: [\"keystore_URL\"] expected."
            r1.<init>(r2)
            throw r0
        L2f:
            r0 = r7
            r1 = r7
            java.io.StreamTokenizer r1 = r1.st
            int r1 = r1.nextToken()
            r0.lookahead = r1
            r0 = r7
            int r0 = r0.lookahead
            r1 = 44
            if (r0 != r1) goto Lb4
            r0 = r7
            r1 = r7
            java.io.StreamTokenizer r1 = r1.st
            int r1 = r1.nextToken()
            r0.lookahead = r1
            r0 = r7
            int r0 = r0.lookahead
            r1 = 34
            if (r0 != r1) goto L62
            r0 = r7
            java.io.StreamTokenizer r0 = r0.st
            java.lang.String r0 = r0.sval
            r9 = r0
            goto L6c
        L62:
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            java.lang.String r2 = "ER030: [\"keystore_type\"] expected."
            r1.<init>(r2)
            throw r0
        L6c:
            r0 = r7
            r1 = r7
            java.io.StreamTokenizer r1 = r1.st
            int r1 = r1.nextToken()
            r0.lookahead = r1
            r0 = r7
            int r0 = r0.lookahead
            r1 = 44
            if (r0 != r1) goto Lb4
            r0 = r7
            r1 = r7
            java.io.StreamTokenizer r1 = r1.st
            int r1 = r1.nextToken()
            r0.lookahead = r1
            r0 = r7
            int r0 = r0.lookahead
            r1 = 34
            if (r0 != r1) goto L9f
            r0 = r7
            java.io.StreamTokenizer r0 = r0.st
            java.lang.String r0 = r0.sval
            r10 = r0
            goto La9
        L9f:
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            java.lang.String r2 = "ER031: [\"keystore_provider\"] expected."
            r1.<init>(r2)
            throw r0
        La9:
            r0 = r7
            r1 = r7
            java.io.StreamTokenizer r1 = r1.st
            int r1 = r1.nextToken()
            r0.lookahead = r1
        Lb4:
            r0 = r7
            int r0 = r0.lookahead
            r1 = 59
            if (r0 != r1) goto Ld5
            r0 = r7
            net.sourceforge.prograde.policyparser.ParsedKeystoreEntry r0 = r0.keystoreEntry
            if (r0 != 0) goto Ldf
            r0 = r7
            net.sourceforge.prograde.policyparser.ParsedKeystoreEntry r1 = new net.sourceforge.prograde.policyparser.ParsedKeystoreEntry
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r10
            r2.<init>(r3, r4, r5)
            r0.keystoreEntry = r1
            goto Ldf
        Ld5:
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            java.lang.String r2 = "ER032: [;] expected at the end of keystore entry."
            r1.<init>(r2)
            throw r0
        Ldf:
            return
    }

    private void parseKeystorePassword() throws java.lang.Exception {
            r4 = this;
            r0 = r4
            r1 = r4
            java.io.StreamTokenizer r1 = r1.st
            int r1 = r1.nextToken()
            r0.lookahead = r1
            r0 = r4
            int r0 = r0.lookahead
            r1 = 34
            if (r0 != r1) goto L29
            r0 = r4
            java.lang.String r0 = r0.keystorePasswordURL
            if (r0 != 0) goto L33
            r0 = r4
            r1 = r4
            java.io.StreamTokenizer r1 = r1.st
            java.lang.String r1 = r1.sval
            r0.keystorePasswordURL = r1
            goto L33
        L29:
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            java.lang.String r2 = "ER033: [\"keystore_password\"] expected."
            r1.<init>(r2)
            throw r0
        L33:
            r0 = r4
            r1 = r4
            java.io.StreamTokenizer r1 = r1.st
            int r1 = r1.nextToken()
            r0.lookahead = r1
            r0 = r4
            int r0 = r0.lookahead
            r1 = 59
            if (r0 != r1) goto L48
            return
        L48:
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            java.lang.String r2 = "ER034: [;] expected at the end of keystorePasswordURL entry."
            r1.<init>(r2)
            throw r0
    }

    private void parsePriority() throws java.lang.Exception {
            r4 = this;
            r0 = r4
            r1 = r4
            java.io.StreamTokenizer r1 = r1.st
            int r1 = r1.nextToken()
            r0.lookahead = r1
            r0 = r4
            int r0 = r0.lookahead
            r1 = 34
            if (r0 != r1) goto L5c
            r0 = r4
            net.sourceforge.prograde.type.Priority r0 = r0.priority
            if (r0 != 0) goto L66
            r0 = r4
            java.io.StreamTokenizer r0 = r0.st
            java.lang.String r0 = r0.sval
            r5 = r0
            r0 = r5
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "grant"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L39
            r0 = r4
            net.sourceforge.prograde.type.Priority r1 = net.sourceforge.prograde.type.Priority.GRANT
            r0.priority = r1
            goto L59
        L39:
            r0 = r5
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "deny"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4f
            r0 = r4
            net.sourceforge.prograde.type.Priority r1 = net.sourceforge.prograde.type.Priority.DENY
            r0.priority = r1
            goto L59
        L4f:
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            java.lang.String r2 = "ER035: grant or deny priority expected."
            r1.<init>(r2)
            throw r0
        L59:
            goto L66
        L5c:
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            java.lang.String r2 = "ER036: quotes expected after priority keyword."
            r1.<init>(r2)
            throw r0
        L66:
            r0 = r4
            r1 = r4
            java.io.StreamTokenizer r1 = r1.st
            int r1 = r1.nextToken()
            r0.lookahead = r1
            r0 = r4
            int r0 = r0.lookahead
            r1 = 59
            if (r0 != r1) goto L7b
            return
        L7b:
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            java.lang.String r2 = "ER037: [;] expected at the end of priority entry."
            r1.<init>(r2)
            throw r0
    }
}
