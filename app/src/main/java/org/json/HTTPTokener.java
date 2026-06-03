package org.json;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/forge_installer.jar:org/json/HTTPTokener.class */
public class HTTPTokener extends org.json.JSONTokener {
    public HTTPTokener(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    public java.lang.String nextToken() throws org.json.JSONException {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r6 = r0
        L8:
            r0 = r3
            char r0 = r0.next()
            r4 = r0
            r0 = r4
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 != 0) goto L8
            r0 = r4
            r1 = 34
            if (r0 == r1) goto L20
            r0 = r4
            r1 = 39
            if (r0 != r1) goto L47
        L20:
            r0 = r4
            r5 = r0
        L22:
            r0 = r3
            char r0 = r0.next()
            r4 = r0
            r0 = r4
            r1 = 32
            if (r0 >= r1) goto L34
            r0 = r3
            java.lang.String r1 = "Unterminated string."
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L34:
            r0 = r4
            r1 = r5
            if (r0 != r1) goto L3e
            r0 = r6
            java.lang.String r0 = r0.toString()
            return r0
        L3e:
            r0 = r6
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L22
        L47:
            r0 = r4
            if (r0 == 0) goto L52
            r0 = r4
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 == 0) goto L57
        L52:
            r0 = r6
            java.lang.String r0 = r0.toString()
            return r0
        L57:
            r0 = r6
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r3
            char r0 = r0.next()
            r4 = r0
            goto L47
    }
}
