package moe.yushi.authlibinjector.internal.org.json.simple;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/internal/org/json/simple/JSONObject.class */
public class JSONObject extends java.util.LinkedHashMap<java.lang.String, java.lang.Object> implements moe.yushi.authlibinjector.internal.org.json.simple.JSONAware, moe.yushi.authlibinjector.internal.org.json.simple.JSONStreamAware {
    public JSONObject() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public JSONObject(java.util.Map<java.lang.String, ?> r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    public static void writeJSONString(java.util.Map<java.lang.String, ?> r3, java.io.Writer r4) throws java.io.IOException {
            r0 = r3
            if (r0 != 0) goto Lb
            r0 = r4
            java.lang.String r1 = "null"
            r0.write(r1)
            return
        Lb:
            r0 = 1
            r5 = r0
            r0 = r3
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
            r0 = r4
            r1 = 123(0x7b, float:1.72E-43)
            r0.write(r1)
        L1f:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L73
            r0 = r5
            if (r0 == 0) goto L31
            r0 = 0
            r5 = r0
            goto L37
        L31:
            r0 = r4
            r1 = 44
            r0.write(r1)
        L37:
            r0 = r6
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r7 = r0
            r0 = r4
            r1 = 34
            r0.write(r1)
            r0 = r4
            r1 = r7
            java.lang.Object r1 = r1.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = moe.yushi.authlibinjector.internal.org.json.simple.JSONValue.escape(r1)
            r0.write(r1)
            r0 = r4
            r1 = 34
            r0.write(r1)
            r0 = r4
            r1 = 58
            r0.write(r1)
            r0 = r7
            java.lang.Object r0 = r0.getValue()
            r1 = r4
            moe.yushi.authlibinjector.internal.org.json.simple.JSONValue.writeJSONString(r0, r1)
            goto L1f
        L73:
            r0 = r4
            r1 = 125(0x7d, float:1.75E-43)
            r0.write(r1)
            return
    }

    @Override // moe.yushi.authlibinjector.internal.org.json.simple.JSONStreamAware
    public void writeJSONString(java.io.Writer r4) throws java.io.IOException {
            r3 = this;
            r0 = r3
            r1 = r4
            writeJSONString(r0, r1)
            return
    }

    public static java.lang.String toJSONString(java.util.Map<java.lang.String, ?> r4) {
            java.io.StringWriter r0 = new java.io.StringWriter
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r4
            r1 = r5
            writeJSONString(r0, r1)     // Catch: java.io.IOException -> L12
            r0 = r5
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L12
            return r0
        L12:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            throw r0
    }

    @Override // moe.yushi.authlibinjector.internal.org.json.simple.JSONAware
    public java.lang.String toJSONString() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = toJSONString(r0)
            return r0
    }

    @Override // java.util.AbstractMap
    public java.lang.String toString() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.toJSONString()
            return r0
    }

    public static java.lang.String toString(java.lang.String r3, java.lang.Object r4) {
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r5
            r1 = 34
            java.lang.StringBuffer r0 = r0.append(r1)
            r0 = r3
            if (r0 != 0) goto L1d
            r0 = r5
            java.lang.String r1 = "null"
            java.lang.StringBuffer r0 = r0.append(r1)
            goto L22
        L1d:
            r0 = r3
            r1 = r5
            moe.yushi.authlibinjector.internal.org.json.simple.JSONValue.escape(r0, r1)
        L22:
            r0 = r5
            r1 = 34
            java.lang.StringBuffer r0 = r0.append(r1)
            r1 = 58
            java.lang.StringBuffer r0 = r0.append(r1)
            r0 = r5
            r1 = r4
            java.lang.String r1 = moe.yushi.authlibinjector.internal.org.json.simple.JSONValue.toJSONString(r1)
            java.lang.StringBuffer r0 = r0.append(r1)
            r0 = r5
            java.lang.String r0 = r0.toString()
            return r0
    }
}
