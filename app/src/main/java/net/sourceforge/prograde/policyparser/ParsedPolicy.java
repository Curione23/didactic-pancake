package net.sourceforge.prograde.policyparser;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/pro-grade.jar:net/sourceforge/prograde/policyparser/ParsedPolicy.class */
public class ParsedPolicy {
    private java.util.List<net.sourceforge.prograde.policyparser.ParsedPolicyEntry> grantEntries;
    private java.util.List<net.sourceforge.prograde.policyparser.ParsedPolicyEntry> denyEntries;
    private java.lang.String keystorePasswordURL;
    private net.sourceforge.prograde.policyparser.ParsedKeystoreEntry keystore;
    private net.sourceforge.prograde.type.Priority priority;
    private java.net.URL policyURL;

    public ParsedPolicy(java.util.List<net.sourceforge.prograde.policyparser.ParsedPolicyEntry> r8, java.util.List<net.sourceforge.prograde.policyparser.ParsedPolicyEntry> r9, net.sourceforge.prograde.policyparser.ParsedKeystoreEntry r10, java.lang.String r11) {
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public ParsedPolicy(java.util.List<net.sourceforge.prograde.policyparser.ParsedPolicyEntry> r4, java.util.List<net.sourceforge.prograde.policyparser.ParsedPolicyEntry> r5, net.sourceforge.prograde.policyparser.ParsedKeystoreEntry r6, java.lang.String r7, net.sourceforge.prograde.type.Priority r8) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.grantEntries = r1
            r0 = r3
            r1 = r5
            r0.denyEntries = r1
            r0 = r3
            r1 = r6
            r0.keystore = r1
            r0 = r3
            r1 = r7
            r0.keystorePasswordURL = r1
            r0 = r3
            r1 = r8
            r0.priority = r1
            return
    }

    public java.util.List<net.sourceforge.prograde.policyparser.ParsedPolicyEntry> getGrantEntries() {
            r2 = this;
            r0 = r2
            java.util.List<net.sourceforge.prograde.policyparser.ParsedPolicyEntry> r0 = r0.grantEntries
            return r0
    }

    public java.util.List<net.sourceforge.prograde.policyparser.ParsedPolicyEntry> getDenyEntries() {
            r2 = this;
            r0 = r2
            java.util.List<net.sourceforge.prograde.policyparser.ParsedPolicyEntry> r0 = r0.denyEntries
            return r0
    }

    public java.lang.String getKeystorePasswordURL() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.keystorePasswordURL
            return r0
    }

    public net.sourceforge.prograde.policyparser.ParsedKeystoreEntry getKeystore() {
            r2 = this;
            r0 = r2
            net.sourceforge.prograde.policyparser.ParsedKeystoreEntry r0 = r0.keystore
            return r0
    }

    public net.sourceforge.prograde.type.Priority getPriority() {
            r2 = this;
            r0 = r2
            net.sourceforge.prograde.type.Priority r0 = r0.priority
            return r0
    }

    public java.net.URL getPolicyURL() {
            r2 = this;
            r0 = r2
            java.net.URL r0 = r0.policyURL
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "Grant entries:\n"
            r1.<init>(r2)
            r5 = r0
            r0 = r4
            java.util.List<net.sourceforge.prograde.policyparser.ParsedPolicyEntry> r0 = r0.grantEntries
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
        L14:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L3a
            r0 = r6
            java.lang.Object r0 = r0.next()
            net.sourceforge.prograde.policyparser.ParsedPolicyEntry r0 = (net.sourceforge.prograde.policyparser.ParsedPolicyEntry) r0
            r7 = r0
            r0 = r5
            r1 = r7
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r1 = "\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L14
        L3a:
            r0 = r5
            java.lang.String r1 = "Deny entries:\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            java.util.List<net.sourceforge.prograde.policyparser.ParsedPolicyEntry> r0 = r0.denyEntries
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
        L4b:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L71
            r0 = r6
            java.lang.Object r0 = r0.next()
            net.sourceforge.prograde.policyparser.ParsedPolicyEntry r0 = (net.sourceforge.prograde.policyparser.ParsedPolicyEntry) r0
            r7 = r0
            r0 = r5
            r1 = r7
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r1 = "\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L4b
        L71:
            r0 = r5
            java.lang.String r1 = "\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r1 = "Keystore: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            net.sourceforge.prograde.policyparser.ParsedKeystoreEntry r0 = r0.keystore
            if (r0 == 0) goto L95
            r0 = r5
            r1 = r4
            net.sourceforge.prograde.policyparser.ParsedKeystoreEntry r1 = r1.keystore
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L9c
        L95:
            r0 = r5
            java.lang.String r1 = "undefined"
            java.lang.StringBuilder r0 = r0.append(r1)
        L9c:
            r0 = r5
            java.lang.String r1 = "\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r1 = "Keystore Password URL: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            java.lang.String r0 = r0.keystorePasswordURL
            if (r0 == 0) goto Lc0
            r0 = r5
            r1 = r4
            java.lang.String r1 = r1.keystorePasswordURL
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            goto Lc7
        Lc0:
            r0 = r5
            java.lang.String r1 = "undefined"
            java.lang.StringBuilder r0 = r0.append(r1)
        Lc7:
            r0 = r5
            java.lang.String r1 = "\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r1 = "Priority: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r4
            net.sourceforge.prograde.type.Priority r1 = r1.priority
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r0 = r0.toString()
            return r0
    }
}
