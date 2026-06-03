package moe.yushi.authlibinjector.internal.org.json.simple;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/internal/org/json/simple/JSONArray.class */
public class JSONArray extends java.util.ArrayList<java.lang.Object> implements moe.yushi.authlibinjector.internal.org.json.simple.JSONAware, moe.yushi.authlibinjector.internal.org.json.simple.JSONStreamAware {
    public JSONArray() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public JSONArray(java.util.Collection<?> r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    public static void writeJSONString(java.util.Collection<?> r3, java.io.Writer r4) throws java.io.IOException {
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
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
            r0 = r4
            r1 = 91
            r0.write(r1)
        L1a:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L51
            r0 = r5
            if (r0 == 0) goto L2c
            r0 = 0
            r5 = r0
            goto L32
        L2c:
            r0 = r4
            r1 = 44
            r0.write(r1)
        L32:
            r0 = r6
            java.lang.Object r0 = r0.next()
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L48
            r0 = r4
            java.lang.String r1 = "null"
            r0.write(r1)
            goto L1a
        L48:
            r0 = r7
            r1 = r4
            moe.yushi.authlibinjector.internal.org.json.simple.JSONValue.writeJSONString(r0, r1)
            goto L1a
        L51:
            r0 = r4
            r1 = 93
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

    public static java.lang.String toJSONString(java.util.Collection<?> r4) {
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

    public static void writeJSONString(byte[] r4, java.io.Writer r5) throws java.io.IOException {
            r0 = r4
            if (r0 != 0) goto Ld
            r0 = r5
            java.lang.String r1 = "null"
            r0.write(r1)
            goto L4f
        Ld:
            r0 = r4
            int r0 = r0.length
            if (r0 != 0) goto L1b
            r0 = r5
            java.lang.String r1 = "[]"
            r0.write(r1)
            goto L4f
        L1b:
            r0 = r5
            java.lang.String r1 = "["
            r0.write(r1)
            r0 = r5
            r1 = r4
            r2 = 0
            r1 = r1[r2]
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.write(r1)
            r0 = 1
            r6 = r0
        L2d:
            r0 = r6
            r1 = r4
            int r1 = r1.length
            if (r0 >= r1) goto L49
            r0 = r5
            java.lang.String r1 = ","
            r0.write(r1)
            r0 = r5
            r1 = r4
            r2 = r6
            r1 = r1[r2]
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.write(r1)
            int r6 = r6 + 1
            goto L2d
        L49:
            r0 = r5
            java.lang.String r1 = "]"
            r0.write(r1)
        L4f:
            return
    }

    public static java.lang.String toJSONString(byte[] r4) {
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

    public static void writeJSONString(short[] r4, java.io.Writer r5) throws java.io.IOException {
            r0 = r4
            if (r0 != 0) goto Ld
            r0 = r5
            java.lang.String r1 = "null"
            r0.write(r1)
            goto L4f
        Ld:
            r0 = r4
            int r0 = r0.length
            if (r0 != 0) goto L1b
            r0 = r5
            java.lang.String r1 = "[]"
            r0.write(r1)
            goto L4f
        L1b:
            r0 = r5
            java.lang.String r1 = "["
            r0.write(r1)
            r0 = r5
            r1 = r4
            r2 = 0
            short r1 = r1[r2]
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.write(r1)
            r0 = 1
            r6 = r0
        L2d:
            r0 = r6
            r1 = r4
            int r1 = r1.length
            if (r0 >= r1) goto L49
            r0 = r5
            java.lang.String r1 = ","
            r0.write(r1)
            r0 = r5
            r1 = r4
            r2 = r6
            short r1 = r1[r2]
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.write(r1)
            int r6 = r6 + 1
            goto L2d
        L49:
            r0 = r5
            java.lang.String r1 = "]"
            r0.write(r1)
        L4f:
            return
    }

    public static java.lang.String toJSONString(short[] r4) {
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

    public static void writeJSONString(int[] r4, java.io.Writer r5) throws java.io.IOException {
            r0 = r4
            if (r0 != 0) goto Ld
            r0 = r5
            java.lang.String r1 = "null"
            r0.write(r1)
            goto L4f
        Ld:
            r0 = r4
            int r0 = r0.length
            if (r0 != 0) goto L1b
            r0 = r5
            java.lang.String r1 = "[]"
            r0.write(r1)
            goto L4f
        L1b:
            r0 = r5
            java.lang.String r1 = "["
            r0.write(r1)
            r0 = r5
            r1 = r4
            r2 = 0
            r1 = r1[r2]
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.write(r1)
            r0 = 1
            r6 = r0
        L2d:
            r0 = r6
            r1 = r4
            int r1 = r1.length
            if (r0 >= r1) goto L49
            r0 = r5
            java.lang.String r1 = ","
            r0.write(r1)
            r0 = r5
            r1 = r4
            r2 = r6
            r1 = r1[r2]
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.write(r1)
            int r6 = r6 + 1
            goto L2d
        L49:
            r0 = r5
            java.lang.String r1 = "]"
            r0.write(r1)
        L4f:
            return
    }

    public static java.lang.String toJSONString(int[] r4) {
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

    public static void writeJSONString(long[] r4, java.io.Writer r5) throws java.io.IOException {
            r0 = r4
            if (r0 != 0) goto Ld
            r0 = r5
            java.lang.String r1 = "null"
            r0.write(r1)
            goto L4f
        Ld:
            r0 = r4
            int r0 = r0.length
            if (r0 != 0) goto L1b
            r0 = r5
            java.lang.String r1 = "[]"
            r0.write(r1)
            goto L4f
        L1b:
            r0 = r5
            java.lang.String r1 = "["
            r0.write(r1)
            r0 = r5
            r1 = r4
            r2 = 0
            r1 = r1[r2]
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.write(r1)
            r0 = 1
            r6 = r0
        L2d:
            r0 = r6
            r1 = r4
            int r1 = r1.length
            if (r0 >= r1) goto L49
            r0 = r5
            java.lang.String r1 = ","
            r0.write(r1)
            r0 = r5
            r1 = r4
            r2 = r6
            r1 = r1[r2]
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.write(r1)
            int r6 = r6 + 1
            goto L2d
        L49:
            r0 = r5
            java.lang.String r1 = "]"
            r0.write(r1)
        L4f:
            return
    }

    public static java.lang.String toJSONString(long[] r4) {
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

    public static void writeJSONString(float[] r4, java.io.Writer r5) throws java.io.IOException {
            r0 = r4
            if (r0 != 0) goto Ld
            r0 = r5
            java.lang.String r1 = "null"
            r0.write(r1)
            goto L4f
        Ld:
            r0 = r4
            int r0 = r0.length
            if (r0 != 0) goto L1b
            r0 = r5
            java.lang.String r1 = "[]"
            r0.write(r1)
            goto L4f
        L1b:
            r0 = r5
            java.lang.String r1 = "["
            r0.write(r1)
            r0 = r5
            r1 = r4
            r2 = 0
            r1 = r1[r2]
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.write(r1)
            r0 = 1
            r6 = r0
        L2d:
            r0 = r6
            r1 = r4
            int r1 = r1.length
            if (r0 >= r1) goto L49
            r0 = r5
            java.lang.String r1 = ","
            r0.write(r1)
            r0 = r5
            r1 = r4
            r2 = r6
            r1 = r1[r2]
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.write(r1)
            int r6 = r6 + 1
            goto L2d
        L49:
            r0 = r5
            java.lang.String r1 = "]"
            r0.write(r1)
        L4f:
            return
    }

    public static java.lang.String toJSONString(float[] r4) {
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

    public static void writeJSONString(double[] r4, java.io.Writer r5) throws java.io.IOException {
            r0 = r4
            if (r0 != 0) goto Ld
            r0 = r5
            java.lang.String r1 = "null"
            r0.write(r1)
            goto L4f
        Ld:
            r0 = r4
            int r0 = r0.length
            if (r0 != 0) goto L1b
            r0 = r5
            java.lang.String r1 = "[]"
            r0.write(r1)
            goto L4f
        L1b:
            r0 = r5
            java.lang.String r1 = "["
            r0.write(r1)
            r0 = r5
            r1 = r4
            r2 = 0
            r1 = r1[r2]
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.write(r1)
            r0 = 1
            r6 = r0
        L2d:
            r0 = r6
            r1 = r4
            int r1 = r1.length
            if (r0 >= r1) goto L49
            r0 = r5
            java.lang.String r1 = ","
            r0.write(r1)
            r0 = r5
            r1 = r4
            r2 = r6
            r1 = r1[r2]
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.write(r1)
            int r6 = r6 + 1
            goto L2d
        L49:
            r0 = r5
            java.lang.String r1 = "]"
            r0.write(r1)
        L4f:
            return
    }

    public static java.lang.String toJSONString(double[] r4) {
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

    public static void writeJSONString(boolean[] r4, java.io.Writer r5) throws java.io.IOException {
            r0 = r4
            if (r0 != 0) goto Ld
            r0 = r5
            java.lang.String r1 = "null"
            r0.write(r1)
            goto L4f
        Ld:
            r0 = r4
            int r0 = r0.length
            if (r0 != 0) goto L1b
            r0 = r5
            java.lang.String r1 = "[]"
            r0.write(r1)
            goto L4f
        L1b:
            r0 = r5
            java.lang.String r1 = "["
            r0.write(r1)
            r0 = r5
            r1 = r4
            r2 = 0
            r1 = r1[r2]
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.write(r1)
            r0 = 1
            r6 = r0
        L2d:
            r0 = r6
            r1 = r4
            int r1 = r1.length
            if (r0 >= r1) goto L49
            r0 = r5
            java.lang.String r1 = ","
            r0.write(r1)
            r0 = r5
            r1 = r4
            r2 = r6
            r1 = r1[r2]
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.write(r1)
            int r6 = r6 + 1
            goto L2d
        L49:
            r0 = r5
            java.lang.String r1 = "]"
            r0.write(r1)
        L4f:
            return
    }

    public static java.lang.String toJSONString(boolean[] r4) {
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

    public static void writeJSONString(char[] r4, java.io.Writer r5) throws java.io.IOException {
            r0 = r4
            if (r0 != 0) goto Ld
            r0 = r5
            java.lang.String r1 = "null"
            r0.write(r1)
            goto L4f
        Ld:
            r0 = r4
            int r0 = r0.length
            if (r0 != 0) goto L1b
            r0 = r5
            java.lang.String r1 = "[]"
            r0.write(r1)
            goto L4f
        L1b:
            r0 = r5
            java.lang.String r1 = "[\""
            r0.write(r1)
            r0 = r5
            r1 = r4
            r2 = 0
            char r1 = r1[r2]
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.write(r1)
            r0 = 1
            r6 = r0
        L2d:
            r0 = r6
            r1 = r4
            int r1 = r1.length
            if (r0 >= r1) goto L49
            r0 = r5
            java.lang.String r1 = "\",\""
            r0.write(r1)
            r0 = r5
            r1 = r4
            r2 = r6
            char r1 = r1[r2]
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.write(r1)
            int r6 = r6 + 1
            goto L2d
        L49:
            r0 = r5
            java.lang.String r1 = "\"]"
            r0.write(r1)
        L4f:
            return
    }

    public static java.lang.String toJSONString(char[] r4) {
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

    public static void writeJSONString(java.lang.Object[] r3, java.io.Writer r4) throws java.io.IOException {
            r0 = r3
            if (r0 != 0) goto Ld
            r0 = r4
            java.lang.String r1 = "null"
            r0.write(r1)
            goto L49
        Ld:
            r0 = r3
            int r0 = r0.length
            if (r0 != 0) goto L1b
            r0 = r4
            java.lang.String r1 = "[]"
            r0.write(r1)
            goto L49
        L1b:
            r0 = r4
            java.lang.String r1 = "["
            r0.write(r1)
            r0 = r3
            r1 = 0
            r0 = r0[r1]
            r1 = r4
            moe.yushi.authlibinjector.internal.org.json.simple.JSONValue.writeJSONString(r0, r1)
            r0 = 1
            r5 = r0
        L2a:
            r0 = r5
            r1 = r3
            int r1 = r1.length
            if (r0 >= r1) goto L43
            r0 = r4
            java.lang.String r1 = ","
            r0.write(r1)
            r0 = r3
            r1 = r5
            r0 = r0[r1]
            r1 = r4
            moe.yushi.authlibinjector.internal.org.json.simple.JSONValue.writeJSONString(r0, r1)
            int r5 = r5 + 1
            goto L2a
        L43:
            r0 = r4
            java.lang.String r1 = "]"
            r0.write(r1)
        L49:
            return
    }

    public static java.lang.String toJSONString(java.lang.Object[] r4) {
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

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.toJSONString()
            return r0
    }
}
