package com.nide8.login2.internal.org.json.simple;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/nide8auth.jar:com/nide8/login2/internal/org/json/simple/JSONValue.class */
public class JSONValue {
    public JSONValue() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static java.lang.Object parse(java.io.Reader r3) throws java.io.IOException, com.nide8.login2.internal.org.json.simple.parser.ParseException {
            com.nide8.login2.internal.org.json.simple.parser.JSONParser r0 = new com.nide8.login2.internal.org.json.simple.parser.JSONParser
            r1 = r0
            r1.<init>()
            r1 = r3
            java.lang.Object r0 = r0.parse(r1)
            return r0
    }

    public static java.lang.Object parse(java.lang.String r3) throws com.nide8.login2.internal.org.json.simple.parser.ParseException {
            com.nide8.login2.internal.org.json.simple.parser.JSONParser r0 = new com.nide8.login2.internal.org.json.simple.parser.JSONParser
            r1 = r0
            r1.<init>()
            r1 = r3
            java.lang.Object r0 = r0.parse(r1)
            return r0
    }

    public static void writeJSONString(java.lang.Object r3, java.io.Writer r4) throws java.io.IOException {
            r0 = r3
            if (r0 != 0) goto Lb
            r0 = r4
            java.lang.String r1 = "null"
            r0.write(r1)
            return
        Lb:
            r0 = r3
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L2a
            r0 = r4
            r1 = 34
            r0.write(r1)
            r0 = r4
            r1 = r3
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = escape(r1)
            r0.write(r1)
            r0 = r4
            r1 = 34
            r0.write(r1)
            return
        L2a:
            r0 = r3
            boolean r0 = r0 instanceof java.lang.Double
            if (r0 == 0) goto L57
            r0 = r3
            java.lang.Double r0 = (java.lang.Double) r0
            boolean r0 = r0.isInfinite()
            if (r0 != 0) goto L45
            r0 = r3
            java.lang.Double r0 = (java.lang.Double) r0
            boolean r0 = r0.isNaN()
            if (r0 == 0) goto L4e
        L45:
            r0 = r4
            java.lang.String r1 = "null"
            r0.write(r1)
            goto L56
        L4e:
            r0 = r4
            r1 = r3
            java.lang.String r1 = r1.toString()
            r0.write(r1)
        L56:
            return
        L57:
            r0 = r3
            boolean r0 = r0 instanceof java.lang.Float
            if (r0 == 0) goto L84
            r0 = r3
            java.lang.Float r0 = (java.lang.Float) r0
            boolean r0 = r0.isInfinite()
            if (r0 != 0) goto L72
            r0 = r3
            java.lang.Float r0 = (java.lang.Float) r0
            boolean r0 = r0.isNaN()
            if (r0 == 0) goto L7b
        L72:
            r0 = r4
            java.lang.String r1 = "null"
            r0.write(r1)
            goto L83
        L7b:
            r0 = r4
            r1 = r3
            java.lang.String r1 = r1.toString()
            r0.write(r1)
        L83:
            return
        L84:
            r0 = r3
            boolean r0 = r0 instanceof java.lang.Number
            if (r0 == 0) goto L94
            r0 = r4
            r1 = r3
            java.lang.String r1 = r1.toString()
            r0.write(r1)
            return
        L94:
            r0 = r3
            boolean r0 = r0 instanceof java.lang.Boolean
            if (r0 == 0) goto La4
            r0 = r4
            r1 = r3
            java.lang.String r1 = r1.toString()
            r0.write(r1)
            return
        La4:
            r0 = r3
            boolean r0 = r0 instanceof com.nide8.login2.internal.org.json.simple.JSONStreamAware
            if (r0 == 0) goto Lb6
            r0 = r3
            com.nide8.login2.internal.org.json.simple.JSONStreamAware r0 = (com.nide8.login2.internal.org.json.simple.JSONStreamAware) r0
            r1 = r4
            r0.writeJSONString(r1)
            return
        Lb6:
            r0 = r3
            boolean r0 = r0 instanceof com.nide8.login2.internal.org.json.simple.JSONAware
            if (r0 == 0) goto Lcb
            r0 = r4
            r1 = r3
            com.nide8.login2.internal.org.json.simple.JSONAware r1 = (com.nide8.login2.internal.org.json.simple.JSONAware) r1
            java.lang.String r1 = r1.toJSONString()
            r0.write(r1)
            return
        Lcb:
            r0 = r3
            boolean r0 = r0 instanceof java.util.Map
            if (r0 == 0) goto Ldd
            r0 = r3
            java.util.Map r0 = (java.util.Map) r0
            r5 = r0
            r0 = r5
            r1 = r4
            com.nide8.login2.internal.org.json.simple.JSONObject.writeJSONString(r0, r1)
            return
        Ldd:
            r0 = r3
            boolean r0 = r0 instanceof java.util.Collection
            if (r0 == 0) goto Led
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = r4
            com.nide8.login2.internal.org.json.simple.JSONArray.writeJSONString(r0, r1)
            return
        Led:
            r0 = r3
            boolean r0 = r0 instanceof byte[]
            if (r0 == 0) goto L100
            r0 = r3
            byte[] r0 = (byte[]) r0
            byte[] r0 = (byte[]) r0
            r1 = r4
            com.nide8.login2.internal.org.json.simple.JSONArray.writeJSONString(r0, r1)
            return
        L100:
            r0 = r3
            boolean r0 = r0 instanceof short[]
            if (r0 == 0) goto L113
            r0 = r3
            short[] r0 = (short[]) r0
            short[] r0 = (short[]) r0
            r1 = r4
            com.nide8.login2.internal.org.json.simple.JSONArray.writeJSONString(r0, r1)
            return
        L113:
            r0 = r3
            boolean r0 = r0 instanceof int[]
            if (r0 == 0) goto L126
            r0 = r3
            int[] r0 = (int[]) r0
            int[] r0 = (int[]) r0
            r1 = r4
            com.nide8.login2.internal.org.json.simple.JSONArray.writeJSONString(r0, r1)
            return
        L126:
            r0 = r3
            boolean r0 = r0 instanceof long[]
            if (r0 == 0) goto L139
            r0 = r3
            long[] r0 = (long[]) r0
            long[] r0 = (long[]) r0
            r1 = r4
            com.nide8.login2.internal.org.json.simple.JSONArray.writeJSONString(r0, r1)
            return
        L139:
            r0 = r3
            boolean r0 = r0 instanceof float[]
            if (r0 == 0) goto L14c
            r0 = r3
            float[] r0 = (float[]) r0
            float[] r0 = (float[]) r0
            r1 = r4
            com.nide8.login2.internal.org.json.simple.JSONArray.writeJSONString(r0, r1)
            return
        L14c:
            r0 = r3
            boolean r0 = r0 instanceof double[]
            if (r0 == 0) goto L15f
            r0 = r3
            double[] r0 = (double[]) r0
            double[] r0 = (double[]) r0
            r1 = r4
            com.nide8.login2.internal.org.json.simple.JSONArray.writeJSONString(r0, r1)
            return
        L15f:
            r0 = r3
            boolean r0 = r0 instanceof boolean[]
            if (r0 == 0) goto L172
            r0 = r3
            boolean[] r0 = (boolean[]) r0
            boolean[] r0 = (boolean[]) r0
            r1 = r4
            com.nide8.login2.internal.org.json.simple.JSONArray.writeJSONString(r0, r1)
            return
        L172:
            r0 = r3
            boolean r0 = r0 instanceof char[]
            if (r0 == 0) goto L185
            r0 = r3
            char[] r0 = (char[]) r0
            char[] r0 = (char[]) r0
            r1 = r4
            com.nide8.login2.internal.org.json.simple.JSONArray.writeJSONString(r0, r1)
            return
        L185:
            r0 = r3
            boolean r0 = r0 instanceof java.lang.Object[]
            if (r0 == 0) goto L198
            r0 = r3
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r1 = r4
            com.nide8.login2.internal.org.json.simple.JSONArray.writeJSONString(r0, r1)
            return
        L198:
            r0 = r4
            r1 = r3
            java.lang.String r1 = r1.toString()
            r0.write(r1)
            return
    }

    public static java.lang.String toJSONString(java.lang.Object r4) {
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

    public static java.lang.String escape(java.lang.String r3) {
            r0 = r3
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r3
            r1 = r4
            escape(r0, r1)
            r0 = r4
            java.lang.String r0 = r0.toString()
            return r0
    }

    static void escape(java.lang.String r4, java.lang.StringBuffer r5) {
            r0 = r4
            int r0 = r0.length()
            r6 = r0
            r0 = 0
            r7 = r0
        L7:
            r0 = r7
            r1 = r6
            if (r0 >= r1) goto L11f
            r0 = r4
            r1 = r7
            char r0 = r0.charAt(r1)
            r8 = r0
            r0 = r8
            switch(r0) {
                case 8: goto L74;
                case 9: goto L9c;
                case 10: goto L88;
                case 12: goto L7e;
                case 13: goto L92;
                case 34: goto L60;
                case 47: goto La6;
                case 92: goto L6a;
                default: goto Lb0;
            }
        L60:
            r0 = r5
            java.lang.String r1 = "\\\""
            java.lang.StringBuffer r0 = r0.append(r1)
            goto L119
        L6a:
            r0 = r5
            java.lang.String r1 = "\\\\"
            java.lang.StringBuffer r0 = r0.append(r1)
            goto L119
        L74:
            r0 = r5
            java.lang.String r1 = "\\b"
            java.lang.StringBuffer r0 = r0.append(r1)
            goto L119
        L7e:
            r0 = r5
            java.lang.String r1 = "\\f"
            java.lang.StringBuffer r0 = r0.append(r1)
            goto L119
        L88:
            r0 = r5
            java.lang.String r1 = "\\n"
            java.lang.StringBuffer r0 = r0.append(r1)
            goto L119
        L92:
            r0 = r5
            java.lang.String r1 = "\\r"
            java.lang.StringBuffer r0 = r0.append(r1)
            goto L119
        L9c:
            r0 = r5
            java.lang.String r1 = "\\t"
            java.lang.StringBuffer r0 = r0.append(r1)
            goto L119
        La6:
            r0 = r5
            java.lang.String r1 = "\\/"
            java.lang.StringBuffer r0 = r0.append(r1)
            goto L119
        Lb0:
            r0 = r8
            if (r0 < 0) goto Lbc
            r0 = r8
            r1 = 31
            if (r0 <= r1) goto Ldb
        Lbc:
            r0 = r8
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 < r1) goto Lcb
            r0 = r8
            r1 = 159(0x9f, float:2.23E-43)
            if (r0 <= r1) goto Ldb
        Lcb:
            r0 = r8
            r1 = 8192(0x2000, float:1.148E-41)
            if (r0 < r1) goto L112
            r0 = r8
            r1 = 8447(0x20ff, float:1.1837E-41)
            if (r0 > r1) goto L112
        Ldb:
            r0 = r8
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r9 = r0
            r0 = r5
            java.lang.String r1 = "\\u"
            java.lang.StringBuffer r0 = r0.append(r1)
            r0 = 0
            r10 = r0
        Lec:
            r0 = r10
            r1 = 4
            r2 = r9
            int r2 = r2.length()
            int r1 = r1 - r2
            if (r0 >= r1) goto L105
            r0 = r5
            r1 = 48
            java.lang.StringBuffer r0 = r0.append(r1)
            int r10 = r10 + 1
            goto Lec
        L105:
            r0 = r5
            r1 = r9
            java.lang.String r1 = r1.toUpperCase()
            java.lang.StringBuffer r0 = r0.append(r1)
            goto L119
        L112:
            r0 = r5
            r1 = r8
            java.lang.StringBuffer r0 = r0.append(r1)
        L119:
            int r7 = r7 + 1
            goto L7
        L11f:
            return
    }
}
