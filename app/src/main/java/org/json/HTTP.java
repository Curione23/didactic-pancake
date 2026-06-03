package org.json;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/forge_installer.jar:org/json/HTTP.class */
public class HTTP {
    public static final java.lang.String CRLF = "\r\n";

    public HTTP() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static org.json.JSONObject toJSONObject(java.lang.String r5) throws org.json.JSONException {
            org.json.JSONObject r0 = new org.json.JSONObject
            r1 = r0
            r1.<init>()
            r6 = r0
            org.json.HTTPTokener r0 = new org.json.HTTPTokener
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r7 = r0
            r0 = r7
            java.lang.String r0 = r0.nextToken()
            r8 = r0
            r0 = r8
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r1)
            java.lang.String r1 = "HTTP"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L4c
            r0 = r6
            java.lang.String r1 = "HTTP-Version"
            r2 = r8
            org.json.JSONObject r0 = r0.put(r1, r2)
            r0 = r6
            java.lang.String r1 = "Status-Code"
            r2 = r7
            java.lang.String r2 = r2.nextToken()
            org.json.JSONObject r0 = r0.put(r1, r2)
            r0 = r6
            java.lang.String r1 = "Reason-Phrase"
            r2 = r7
            r3 = 0
            java.lang.String r2 = r2.nextTo(r3)
            org.json.JSONObject r0 = r0.put(r1, r2)
            r0 = r7
            char r0 = r0.next()
            goto L6a
        L4c:
            r0 = r6
            java.lang.String r1 = "Method"
            r2 = r8
            org.json.JSONObject r0 = r0.put(r1, r2)
            r0 = r6
            java.lang.String r1 = "Request-URI"
            r2 = r7
            java.lang.String r2 = r2.nextToken()
            org.json.JSONObject r0 = r0.put(r1, r2)
            r0 = r6
            java.lang.String r1 = "HTTP-Version"
            r2 = r7
            java.lang.String r2 = r2.nextToken()
            org.json.JSONObject r0 = r0.put(r1, r2)
        L6a:
            r0 = r7
            boolean r0 = r0.more()
            if (r0 == 0) goto L94
            r0 = r7
            r1 = 58
            java.lang.String r0 = r0.nextTo(r1)
            r9 = r0
            r0 = r7
            r1 = 58
            char r0 = r0.next(r1)
            r0 = r6
            r1 = r9
            r2 = r7
            r3 = 0
            java.lang.String r2 = r2.nextTo(r3)
            org.json.JSONObject r0 = r0.put(r1, r2)
            r0 = r7
            char r0 = r0.next()
            goto L6a
        L94:
            r0 = r6
            return r0
    }

    public static java.lang.String toString(org.json.JSONObject r4) throws org.json.JSONException {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r4
            java.lang.String r1 = "Status-Code"
            boolean r0 = r0.has(r1)
            if (r0 == 0) goto L4c
            r0 = r4
            java.lang.String r1 = "Reason-Phrase"
            boolean r0 = r0.has(r1)
            if (r0 == 0) goto L4c
            r0 = r5
            r1 = r4
            java.lang.String r2 = "HTTP-Version"
            java.lang.String r1 = r1.getString(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = 32
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r4
            java.lang.String r2 = "Status-Code"
            java.lang.String r1 = r1.getString(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = 32
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r4
            java.lang.String r2 = "Reason-Phrase"
            java.lang.String r1 = r1.getString(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            goto La8
        L4c:
            r0 = r4
            java.lang.String r1 = "Method"
            boolean r0 = r0.has(r1)
            if (r0 == 0) goto L9e
            r0 = r4
            java.lang.String r1 = "Request-URI"
            boolean r0 = r0.has(r1)
            if (r0 == 0) goto L9e
            r0 = r5
            r1 = r4
            java.lang.String r2 = "Method"
            java.lang.String r1 = r1.getString(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = 32
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = 34
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r4
            java.lang.String r2 = "Request-URI"
            java.lang.String r1 = r1.getString(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = 34
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = 32
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r4
            java.lang.String r2 = "HTTP-Version"
            java.lang.String r1 = r1.getString(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            goto La8
        L9e:
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.String r2 = "Not enough material for an HTTP header."
            r1.<init>(r2)
            throw r0
        La8:
            r0 = r5
            java.lang.String r1 = "\r\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
        Lb9:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L12c
            r0 = r6
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r7 = r0
            r0 = r4
            r1 = r7
            java.lang.String r0 = r0.optString(r1)
            r8 = r0
            java.lang.String r0 = "HTTP-Version"
            r1 = r7
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L129
            java.lang.String r0 = "Status-Code"
            r1 = r7
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L129
            java.lang.String r0 = "Reason-Phrase"
            r1 = r7
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L129
            java.lang.String r0 = "Method"
            r1 = r7
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L129
            java.lang.String r0 = "Request-URI"
            r1 = r7
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L129
            java.lang.Object r0 = org.json.JSONObject.NULL
            r1 = r8
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L129
            r0 = r5
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r1 = ": "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r4
            r2 = r7
            java.lang.String r1 = r1.optString(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r1 = "\r\n"
            java.lang.StringBuilder r0 = r0.append(r1)
        L129:
            goto Lb9
        L12c:
            r0 = r5
            java.lang.String r1 = "\r\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r0 = r0.toString()
            return r0
    }
}
