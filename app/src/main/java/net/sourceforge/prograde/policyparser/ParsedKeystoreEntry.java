package net.sourceforge.prograde.policyparser;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/pro-grade.jar:net/sourceforge/prograde/policyparser/ParsedKeystoreEntry.class */
public class ParsedKeystoreEntry {
    private java.lang.String keystoreURL;
    private java.lang.String keystoreType;
    private java.lang.String keystoreProvider;

    public ParsedKeystoreEntry(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.keystoreURL = r1
            r0 = r3
            r1 = r5
            r0.keystoreType = r1
            r0 = r3
            r1 = r6
            r0.keystoreProvider = r1
            return
    }

    public java.lang.String getKeystoreURL() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.keystoreURL
            return r0
    }

    public java.lang.String getKeystoreType() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.keystoreType
            return r0
    }

    public java.lang.String getKeystoreProvider() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.keystoreProvider
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = ""
            r4 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "KeyStore file: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.String r1 = r1.keystoreURL
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4 = r0
            r0 = r3
            java.lang.String r0 = r0.keystoreType
            if (r0 == 0) goto L62
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.String r1 = r1.keystoreType
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4 = r0
            r0 = r3
            java.lang.String r0 = r0.keystoreProvider
            if (r0 == 0) goto L62
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.String r1 = r1.keystoreProvider
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4 = r0
        L62:
            r0 = r4
            return r0
    }
}
