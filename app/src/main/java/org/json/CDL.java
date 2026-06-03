package org.json;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/forge_installer.jar:org/json/CDL.class */
public class CDL {
    public CDL() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    private static java.lang.String getValue(org.json.JSONTokener r4) throws org.json.JSONException {
        L0:
            r0 = r4
            char r0 = r0.next()
            r5 = r0
            r0 = r5
            r1 = 32
            if (r0 == r1) goto L0
            r0 = r5
            r1 = 9
            if (r0 == r1) goto L0
            r0 = r5
            switch(r0) {
                case 0: goto L3c;
                case 34: goto L3e;
                case 39: goto L3e;
                case 44: goto La6;
                default: goto Lad;
            }
        L3c:
            r0 = 0
            return r0
        L3e:
            r0 = r5
            r6 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r7 = r0
        L48:
            r0 = r4
            char r0 = r0.next()
            r5 = r0
            r0 = r5
            r1 = r6
            if (r0 != r1) goto L6b
            r0 = r4
            char r0 = r0.next()
            r8 = r0
            r0 = r8
            r1 = 34
            if (r0 == r1) goto L6b
            r0 = r8
            if (r0 <= 0) goto La1
            r0 = r4
            r0.back()
            goto La1
        L6b:
            r0 = r5
            if (r0 == 0) goto L7b
            r0 = r5
            r1 = 10
            if (r0 == r1) goto L7b
            r0 = r5
            r1 = 13
            if (r0 != r1) goto L98
        L7b:
            r0 = r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Missing close quote '"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "'."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L98:
            r0 = r7
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L48
        La1:
            r0 = r7
            java.lang.String r0 = r0.toString()
            return r0
        La6:
            r0 = r4
            r0.back()
            java.lang.String r0 = ""
            return r0
        Lad:
            r0 = r4
            r0.back()
            r0 = r4
            r1 = 44
            java.lang.String r0 = r0.nextTo(r1)
            return r0
    }

    public static org.json.JSONArray rowToJSONArray(org.json.JSONTokener r4) throws org.json.JSONException {
            org.json.JSONArray r0 = new org.json.JSONArray
            r1 = r0
            r1.<init>()
            r5 = r0
        L8:
            r0 = r4
            java.lang.String r0 = getValue(r0)
            r6 = r0
            r0 = r4
            char r0 = r0.next()
            r7 = r0
            r0 = r6
            if (r0 == 0) goto L2a
            r0 = r5
            int r0 = r0.length()
            if (r0 != 0) goto L2c
            r0 = r6
            int r0 = r0.length()
            if (r0 != 0) goto L2c
            r0 = r7
            r1 = 44
            if (r0 == r1) goto L2c
        L2a:
            r0 = 0
            return r0
        L2c:
            r0 = r5
            r1 = r6
            org.json.JSONArray r0 = r0.put(r1)
        L32:
            r0 = r7
            r1 = 44
            if (r0 != r1) goto L3b
            goto L81
        L3b:
            r0 = r7
            r1 = 32
            if (r0 == r1) goto L79
            r0 = r7
            r1 = 10
            if (r0 == r1) goto L51
            r0 = r7
            r1 = 13
            if (r0 == r1) goto L51
            r0 = r7
            if (r0 != 0) goto L53
        L51:
            r0 = r5
            return r0
        L53:
            r0 = r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Bad character '"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r7
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "' ("
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r7
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ")."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L79:
            r0 = r4
            char r0 = r0.next()
            r7 = r0
            goto L32
        L81:
            goto L8
    }

    public static org.json.JSONObject rowToJSONObject(org.json.JSONArray r3, org.json.JSONTokener r4) throws org.json.JSONException {
            r0 = r4
            org.json.JSONArray r0 = rowToJSONArray(r0)
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L11
            r0 = r5
            r1 = r3
            org.json.JSONObject r0 = r0.toJSONObject(r1)
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    public static java.lang.String rowToString(org.json.JSONArray r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = 0
            r5 = r0
        La:
            r0 = r5
            r1 = r3
            int r1 = r1.length()
            if (r0 >= r1) goto Lba
            r0 = r5
            if (r0 <= 0) goto L1d
            r0 = r4
            r1 = 44
            java.lang.StringBuilder r0 = r0.append(r1)
        L1d:
            r0 = r3
            r1 = r5
            java.lang.Object r0 = r0.opt(r1)
            r6 = r0
            r0 = r6
            if (r0 == 0) goto Lb4
            r0 = r6
            java.lang.String r0 = r0.toString()
            r7 = r0
            r0 = r7
            int r0 = r0.length()
            if (r0 <= 0) goto Lad
            r0 = r7
            r1 = 44
            int r0 = r0.indexOf(r1)
            if (r0 >= 0) goto L67
            r0 = r7
            r1 = 10
            int r0 = r0.indexOf(r1)
            if (r0 >= 0) goto L67
            r0 = r7
            r1 = 13
            int r0 = r0.indexOf(r1)
            if (r0 >= 0) goto L67
            r0 = r7
            r1 = 0
            int r0 = r0.indexOf(r1)
            if (r0 >= 0) goto L67
            r0 = r7
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = 34
            if (r0 != r1) goto Lad
        L67:
            r0 = r4
            r1 = 34
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            int r0 = r0.length()
            r8 = r0
            r0 = 0
            r9 = r0
        L78:
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto La3
            r0 = r7
            r1 = r9
            char r0 = r0.charAt(r1)
            r10 = r0
            r0 = r10
            r1 = 32
            if (r0 < r1) goto L9d
            r0 = r10
            r1 = 34
            if (r0 == r1) goto L9d
            r0 = r4
            r1 = r10
            java.lang.StringBuilder r0 = r0.append(r1)
        L9d:
            int r9 = r9 + 1
            goto L78
        La3:
            r0 = r4
            r1 = 34
            java.lang.StringBuilder r0 = r0.append(r1)
            goto Lb4
        Lad:
            r0 = r4
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
        Lb4:
            int r5 = r5 + 1
            goto La
        Lba:
            r0 = r4
            r1 = 10
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static org.json.JSONArray toJSONArray(java.lang.String r4) throws org.json.JSONException {
            org.json.JSONTokener r0 = new org.json.JSONTokener
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            org.json.JSONArray r0 = toJSONArray(r0)
            return r0
    }

    public static org.json.JSONArray toJSONArray(org.json.JSONTokener r3) throws org.json.JSONException {
            r0 = r3
            org.json.JSONArray r0 = rowToJSONArray(r0)
            r1 = r3
            org.json.JSONArray r0 = toJSONArray(r0, r1)
            return r0
    }

    public static org.json.JSONArray toJSONArray(org.json.JSONArray r5, java.lang.String r6) throws org.json.JSONException {
            r0 = r5
            org.json.JSONTokener r1 = new org.json.JSONTokener
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            org.json.JSONArray r0 = toJSONArray(r0, r1)
            return r0
    }

    public static org.json.JSONArray toJSONArray(org.json.JSONArray r3, org.json.JSONTokener r4) throws org.json.JSONException {
            r0 = r3
            if (r0 == 0) goto Lb
            r0 = r3
            int r0 = r0.length()
            if (r0 != 0) goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            org.json.JSONArray r0 = new org.json.JSONArray
            r1 = r0
            r1.<init>()
            r5 = r0
        L15:
            r0 = r3
            r1 = r4
            org.json.JSONObject r0 = rowToJSONObject(r0, r1)
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L22
            goto L2b
        L22:
            r0 = r5
            r1 = r6
            org.json.JSONArray r0 = r0.put(r1)
            goto L15
        L2b:
            r0 = r5
            int r0 = r0.length()
            if (r0 != 0) goto L34
            r0 = 0
            return r0
        L34:
            r0 = r5
            return r0
    }

    public static java.lang.String toString(org.json.JSONArray r4) throws org.json.JSONException {
            r0 = r4
            r1 = 0
            org.json.JSONObject r0 = r0.optJSONObject(r1)
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L2d
            r0 = r5
            org.json.JSONArray r0 = r0.names()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L2d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r6
            java.lang.String r1 = rowToString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            r2 = r4
            java.lang.String r1 = toString(r1, r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L2d:
            r0 = 0
            return r0
    }

    public static java.lang.String toString(org.json.JSONArray r4, org.json.JSONArray r5) throws org.json.JSONException {
            r0 = r4
            if (r0 == 0) goto Lb
            r0 = r4
            int r0 = r0.length()
            if (r0 != 0) goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = 0
            r7 = r0
        L17:
            r0 = r7
            r1 = r5
            int r1 = r1.length()
            if (r0 >= r1) goto L3f
            r0 = r5
            r1 = r7
            org.json.JSONObject r0 = r0.optJSONObject(r1)
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L39
            r0 = r6
            r1 = r8
            r2 = r4
            org.json.JSONArray r1 = r1.toJSONArray(r2)
            java.lang.String r1 = rowToString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
        L39:
            int r7 = r7 + 1
            goto L17
        L3f:
            r0 = r6
            java.lang.String r0 = r0.toString()
            return r0
    }
}
