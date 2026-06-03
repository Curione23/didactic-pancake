package org.json;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/forge_installer.jar:org/json/Property.class */
public class Property {
    public Property() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static org.json.JSONObject toJSONObject(java.util.Properties r5) throws org.json.JSONException {
            org.json.JSONObject r0 = new org.json.JSONObject
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L39
            r0 = r5
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L39
            r0 = r5
            java.util.Enumeration r0 = r0.propertyNames()
            r7 = r0
        L18:
            r0 = r7
            boolean r0 = r0.hasMoreElements()
            if (r0 == 0) goto L39
            r0 = r7
            java.lang.Object r0 = r0.nextElement()
            java.lang.String r0 = (java.lang.String) r0
            r8 = r0
            r0 = r6
            r1 = r8
            r2 = r5
            r3 = r8
            java.lang.String r2 = r2.getProperty(r3)
            org.json.JSONObject r0 = r0.put(r1, r2)
            goto L18
        L39:
            r0 = r6
            return r0
    }

    public static java.util.Properties toProperties(org.json.JSONObject r4) throws org.json.JSONException {
            java.util.Properties r0 = new java.util.Properties
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r4
            if (r0 == 0) goto L49
            r0 = r4
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
        L16:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L49
            r0 = r6
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r7 = r0
            r0 = r4
            r1 = r7
            java.lang.Object r0 = r0.opt(r1)
            r8 = r0
            java.lang.Object r0 = org.json.JSONObject.NULL
            r1 = r8
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L46
            r0 = r5
            r1 = r7
            r2 = r8
            java.lang.String r2 = r2.toString()
            java.lang.Object r0 = r0.put(r1, r2)
        L46:
            goto L16
        L49:
            r0 = r5
            return r0
    }
}
