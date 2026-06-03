package org.json;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/forge_installer.jar:org/json/Cookie.class */
public class Cookie {
    public Cookie() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static java.lang.String escape(java.lang.String r4) {
            r0 = r4
            java.lang.String r0 = r0.trim()
            r6 = r0
            r0 = r6
            int r0 = r0.length()
            r7 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            r8 = r0
            r0 = 0
            r9 = r0
        L17:
            r0 = r9
            r1 = r7
            if (r0 >= r1) goto L7c
            r0 = r6
            r1 = r9
            char r0 = r0.charAt(r1)
            r5 = r0
            r0 = r5
            r1 = 32
            if (r0 < r1) goto L42
            r0 = r5
            r1 = 43
            if (r0 == r1) goto L42
            r0 = r5
            r1 = 37
            if (r0 == r1) goto L42
            r0 = r5
            r1 = 61
            if (r0 == r1) goto L42
            r0 = r5
            r1 = 59
            if (r0 != r1) goto L6f
        L42:
            r0 = r8
            r1 = 37
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            r1 = r5
            r2 = 4
            int r1 = r1 >>> r2
            r2 = 15
            r1 = r1 & r2
            char r1 = (char) r1
            r2 = 16
            char r1 = java.lang.Character.forDigit(r1, r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            r1 = r5
            r2 = 15
            r1 = r1 & r2
            char r1 = (char) r1
            r2 = 16
            char r1 = java.lang.Character.forDigit(r1, r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L76
        L6f:
            r0 = r8
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
        L76:
            int r9 = r9 + 1
            goto L17
        L7c:
            r0 = r8
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static org.json.JSONObject toJSONObject(java.lang.String r5) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r1 = r0
            r1.<init>()
            r6 = r0
            org.json.JSONTokener r0 = new org.json.JSONTokener
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r9 = r0
            r0 = r9
            r1 = 61
            java.lang.String r0 = r0.nextTo(r1)
            java.lang.String r0 = r0.trim()
            java.lang.String r0 = unescape(r0)
            r7 = r0
            java.lang.String r0 = ""
            r1 = r7
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L33
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.String r2 = "Cookies must have a 'name'"
            r1.<init>(r2)
            throw r0
        L33:
            r0 = r6
            java.lang.String r1 = "name"
            r2 = r7
            org.json.JSONObject r0 = r0.put(r1, r2)
            r0 = r9
            r1 = 61
            char r0 = r0.next(r1)
            r0 = r6
            java.lang.String r1 = "value"
            r2 = r9
            r3 = 59
            java.lang.String r2 = r2.nextTo(r3)
            java.lang.String r2 = unescape(r2)
            java.lang.String r2 = r2.trim()
            org.json.JSONObject r0 = r0.put(r1, r2)
            r0 = r9
            char r0 = r0.next()
        L5d:
            r0 = r9
            boolean r0 = r0.more()
            if (r0 == 0) goto Le0
            r0 = r9
            java.lang.String r1 = "=;"
            java.lang.String r0 = r0.nextTo(r1)
            java.lang.String r0 = unescape(r0)
            java.lang.String r0 = r0.trim()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            r7 = r0
            java.lang.String r0 = "name"
            r1 = r7
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L8c
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.String r2 = "Illegal attribute name: 'name'"
            r1.<init>(r2)
            throw r0
        L8c:
            java.lang.String r0 = "value"
            r1 = r7
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L9f
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.String r2 = "Illegal attribute name: 'value'"
            r1.<init>(r2)
            throw r0
        L9f:
            r0 = r9
            char r0 = r0.next()
            r1 = 61
            if (r0 == r1) goto Lb0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r8 = r0
            goto Lc4
        Lb0:
            r0 = r9
            r1 = 59
            java.lang.String r0 = r0.nextTo(r1)
            java.lang.String r0 = unescape(r0)
            java.lang.String r0 = r0.trim()
            r8 = r0
            r0 = r9
            char r0 = r0.next()
        Lc4:
            java.lang.String r0 = ""
            r1 = r7
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5d
            java.lang.String r0 = ""
            r1 = r8
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5d
            r0 = r6
            r1 = r7
            r2 = r8
            org.json.JSONObject r0 = r0.put(r1, r2)
            goto L5d
        Le0:
            r0 = r6
            return r0
    }

    public static java.lang.String toString(org.json.JSONObject r4) throws org.json.JSONException {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = 0
            r6 = r0
            r0 = 0
            r7 = r0
            r0 = r4
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
        L17:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L63
            r0 = r8
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r9 = r0
            java.lang.String r0 = "name"
            r1 = r9
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L41
            r0 = r4
            r1 = r9
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r0 = r0.trim()
            r6 = r0
        L41:
            java.lang.String r0 = "value"
            r1 = r9
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L55
            r0 = r4
            r1 = r9
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r0 = r0.trim()
            r7 = r0
        L55:
            r0 = r6
            if (r0 == 0) goto L60
            r0 = r7
            if (r0 == 0) goto L60
            goto L63
        L60:
            goto L17
        L63:
            r0 = r6
            if (r0 == 0) goto L73
            java.lang.String r0 = ""
            r1 = r6
            java.lang.String r1 = r1.trim()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7d
        L73:
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.String r2 = "Cookie does not have a name"
            r1.<init>(r2)
            throw r0
        L7d:
            r0 = r7
            if (r0 != 0) goto L84
            java.lang.String r0 = ""
            r7 = r0
        L84:
            r0 = r5
            r1 = r6
            java.lang.String r1 = escape(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r1 = "="
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r7
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = escape(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
        Lab:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L123
            r0 = r8
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r9 = r0
            java.lang.String r0 = "name"
            r1 = r9
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "value"
            r1 = r9
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto Ld8
            goto Lab
        Ld8:
            r0 = r4
            r1 = r9
            java.lang.Object r0 = r0.opt(r1)
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof java.lang.Boolean
            if (r0 == 0) goto L102
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1 = r7
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L120
            r0 = r5
            r1 = 59
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            java.lang.String r1 = escape(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L120
        L102:
            r0 = r5
            r1 = 59
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            java.lang.String r1 = escape(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 61
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r7
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = escape(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
        L120:
            goto Lab
        L123:
            r0 = r5
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String unescape(java.lang.String r4) {
            r0 = r4
            int r0 = r0.length()
            r5 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r6 = r0
            r0 = 0
            r7 = r0
        L10:
            r0 = r7
            r1 = r5
            if (r0 >= r1) goto L75
            r0 = r4
            r1 = r7
            char r0 = r0.charAt(r1)
            r8 = r0
            r0 = r8
            r1 = 43
            if (r0 != r1) goto L2a
            r0 = 32
            r8 = r0
            goto L68
        L2a:
            r0 = r8
            r1 = 37
            if (r0 != r1) goto L68
            r0 = r7
            r1 = 2
            int r0 = r0 + r1
            r1 = r5
            if (r0 >= r1) goto L68
            r0 = r4
            r1 = r7
            r2 = 1
            int r1 = r1 + r2
            char r0 = r0.charAt(r1)
            int r0 = org.json.JSONTokener.dehexchar(r0)
            r9 = r0
            r0 = r4
            r1 = r7
            r2 = 2
            int r1 = r1 + r2
            char r0 = r0.charAt(r1)
            int r0 = org.json.JSONTokener.dehexchar(r0)
            r10 = r0
            r0 = r9
            if (r0 < 0) goto L68
            r0 = r10
            if (r0 < 0) goto L68
            r0 = r9
            r1 = 16
            int r0 = r0 * r1
            r1 = r10
            int r0 = r0 + r1
            char r0 = (char) r0
            r8 = r0
            int r7 = r7 + 2
        L68:
            r0 = r6
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
            int r7 = r7 + 1
            goto L10
        L75:
            r0 = r6
            java.lang.String r0 = r0.toString()
            return r0
    }
}
