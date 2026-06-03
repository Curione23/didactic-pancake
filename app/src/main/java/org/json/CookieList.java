package org.json;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/forge_installer.jar:org/json/CookieList.class */
public class CookieList {
    public CookieList() {
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
            org.json.JSONTokener r0 = new org.json.JSONTokener
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r7 = r0
        L11:
            r0 = r7
            boolean r0 = r0.more()
            if (r0 == 0) goto L40
            r0 = r7
            r1 = 61
            java.lang.String r0 = r0.nextTo(r1)
            java.lang.String r0 = org.json.Cookie.unescape(r0)
            r8 = r0
            r0 = r7
            r1 = 61
            char r0 = r0.next(r1)
            r0 = r6
            r1 = r8
            r2 = r7
            r3 = 59
            java.lang.String r2 = r2.nextTo(r3)
            java.lang.String r2 = org.json.Cookie.unescape(r2)
            org.json.JSONObject r0 = r0.put(r1, r2)
            r0 = r7
            char r0 = r0.next()
            goto L11
        L40:
            r0 = r6
            return r0
    }

    public static java.lang.String toString(org.json.JSONObject r3) throws org.json.JSONException {
            r0 = 0
            r4 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r3
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
        L14:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L69
            r0 = r6
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r7 = r0
            r0 = r3
            r1 = r7
            java.lang.Object r0 = r0.opt(r1)
            r8 = r0
            java.lang.Object r0 = org.json.JSONObject.NULL
            r1 = r8
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L66
            r0 = r4
            if (r0 == 0) goto L46
            r0 = r5
            r1 = 59
            java.lang.StringBuilder r0 = r0.append(r1)
        L46:
            r0 = r5
            r1 = r7
            java.lang.String r1 = org.json.Cookie.escape(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r1 = "="
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r8
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = org.json.Cookie.escape(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = 1
            r4 = r0
        L66:
            goto L14
        L69:
            r0 = r5
            java.lang.String r0 = r0.toString()
            return r0
    }
}
