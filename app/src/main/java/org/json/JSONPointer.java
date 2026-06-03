package org.json;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/forge_installer.jar:org/json/JSONPointer.class */
public class JSONPointer {
    private static final java.lang.String ENCODING = "utf-8";
    private final java.util.List<java.lang.String> refTokens;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/forge_installer.jar:org/json/JSONPointer$Builder.class */
    public static class Builder {
        private final java.util.List<java.lang.String> refTokens;

        public Builder() {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = r1
                r2.<init>()
                r0.refTokens = r1
                return
        }

        public org.json.JSONPointer build() {
                r4 = this;
                org.json.JSONPointer r0 = new org.json.JSONPointer
                r1 = r0
                r2 = r4
                java.util.List<java.lang.String> r2 = r2.refTokens
                r1.<init>(r2)
                return r0
        }

        public org.json.JSONPointer.Builder append(java.lang.String r5) {
                r4 = this;
                r0 = r5
                if (r0 != 0) goto Le
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                r1 = r0
                java.lang.String r2 = "token cannot be null"
                r1.<init>(r2)
                throw r0
            Le:
                r0 = r4
                java.util.List<java.lang.String> r0 = r0.refTokens
                r1 = r5
                boolean r0 = r0.add(r1)
                r0 = r4
                return r0
        }

        public org.json.JSONPointer.Builder append(int r4) {
                r3 = this;
                r0 = r3
                java.util.List<java.lang.String> r0 = r0.refTokens
                r1 = r4
                java.lang.String r1 = java.lang.String.valueOf(r1)
                boolean r0 = r0.add(r1)
                r0 = r3
                return r0
        }
    }

    public static org.json.JSONPointer.Builder builder() {
            org.json.JSONPointer$Builder r0 = new org.json.JSONPointer$Builder
            r1 = r0
            r1.<init>()
            return r0
    }

    public JSONPointer(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r5
            if (r0 != 0) goto L12
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            java.lang.String r2 = "pointer cannot be null"
            r1.<init>(r2)
            throw r0
        L12:
            r0 = r5
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L22
            r0 = r5
            java.lang.String r1 = "#"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2a
        L22:
            r0 = r4
            java.util.List r1 = java.util.Collections.emptyList()
            r0.refTokens = r1
            return
        L2a:
            r0 = r5
            java.lang.String r1 = "#/"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L4d
            r0 = r5
            r1 = 2
            java.lang.String r0 = r0.substring(r1)
            r6 = r0
            r0 = r6
            java.lang.String r1 = "utf-8"
            java.lang.String r0 = java.net.URLDecoder.decode(r0, r1)     // Catch: java.io.UnsupportedEncodingException -> L43
            r6 = r0
            goto L69
        L43:
            r7 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            throw r0
        L4d:
            r0 = r5
            java.lang.String r1 = "/"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L5f
            r0 = r5
            r1 = 1
            java.lang.String r0 = r0.substring(r1)
            r6 = r0
            goto L69
        L5f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "a JSON pointer should start with '/' or '#/'"
            r1.<init>(r2)
            throw r0
        L69:
            r0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.refTokens = r1
            r0 = -1
            r7 = r0
            r0 = 0
            r8 = r0
        L79:
            r0 = r7
            r1 = 1
            int r0 = r0 + r1
            r8 = r0
            r0 = r6
            r1 = 47
            r2 = r8
            int r0 = r0.indexOf(r1, r2)
            r7 = r0
            r0 = r8
            r1 = r7
            if (r0 == r1) goto L96
            r0 = r8
            r1 = r6
            int r1 = r1.length()
            if (r0 != r1) goto La5
        L96:
            r0 = r4
            java.util.List<java.lang.String> r0 = r0.refTokens
            java.lang.String r1 = ""
            boolean r0 = r0.add(r1)
            goto Ldb
        La5:
            r0 = r7
            if (r0 < 0) goto Lc4
            r0 = r6
            r1 = r8
            r2 = r7
            java.lang.String r0 = r0.substring(r1, r2)
            r9 = r0
            r0 = r4
            java.util.List<java.lang.String> r0 = r0.refTokens
            r1 = r9
            java.lang.String r1 = unescape(r1)
            boolean r0 = r0.add(r1)
            goto Ldb
        Lc4:
            r0 = r6
            r1 = r8
            java.lang.String r0 = r0.substring(r1)
            r9 = r0
            r0 = r4
            java.util.List<java.lang.String> r0 = r0.refTokens
            r1 = r9
            java.lang.String r1 = unescape(r1)
            boolean r0 = r0.add(r1)
        Ldb:
            r0 = r7
            if (r0 >= 0) goto L79
            return
    }

    public JSONPointer(java.util.List<java.lang.String> r6) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            r0.refTokens = r1
            return
    }

    private static java.lang.String unescape(java.lang.String r4) {
            r0 = r4
            java.lang.String r1 = "~1"
            java.lang.String r2 = "/"
            java.lang.String r0 = r0.replace(r1, r2)
            java.lang.String r1 = "~0"
            java.lang.String r2 = "~"
            java.lang.String r0 = r0.replace(r1, r2)
            return r0
    }

    public java.lang.Object queryFrom(java.lang.Object r9) throws org.json.JSONPointerException {
            r8 = this;
            r0 = r8
            java.util.List<java.lang.String> r0 = r0.refTokens
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Le
            r0 = r9
            return r0
        Le:
            r0 = r9
            r10 = r0
            r0 = r8
            java.util.List<java.lang.String> r0 = r0.refTokens
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
        L1a:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L73
            r0 = r11
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r12 = r0
            r0 = r10
            boolean r0 = r0 instanceof org.json.JSONObject
            if (r0 == 0) goto L45
            r0 = r10
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            r1 = r12
            java.lang.String r1 = unescape(r1)
            java.lang.Object r0 = r0.opt(r1)
            r10 = r0
            goto L70
        L45:
            r0 = r10
            boolean r0 = r0 instanceof org.json.JSONArray
            if (r0 == 0) goto L56
            r0 = r10
            r1 = r12
            java.lang.Object r0 = readByIndexToken(r0, r1)
            r10 = r0
            goto L70
        L56:
            org.json.JSONPointerException r0 = new org.json.JSONPointerException
            r1 = r0
            java.lang.String r2 = "value [%s] is not an array or object therefore its key %s cannot be resolved"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r10
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = r12
            r4[r5] = r6
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r1.<init>(r2)
            throw r0
        L70:
            goto L1a
        L73:
            r0 = r10
            return r0
    }

    private static java.lang.Object readByIndexToken(java.lang.Object r8, java.lang.String r9) throws org.json.JSONPointerException {
            r0 = r9
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L56
            r10 = r0
            r0 = r8
            org.json.JSONArray r0 = (org.json.JSONArray) r0     // Catch: java.lang.NumberFormatException -> L56
            r11 = r0
            r0 = r10
            r1 = r11
            int r1 = r1.length()     // Catch: java.lang.NumberFormatException -> L56
            if (r0 < r1) goto L31
            org.json.JSONPointerException r0 = new org.json.JSONPointerException     // Catch: java.lang.NumberFormatException -> L56
            r1 = r0
            java.lang.String r2 = "index %s is out of bounds - the array has %d elements"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.NumberFormatException -> L56
            r4 = r3
            r5 = 0
            r6 = r9
            r4[r5] = r6     // Catch: java.lang.NumberFormatException -> L56
            r4 = r3
            r5 = 1
            r6 = r11
            int r6 = r6.length()     // Catch: java.lang.NumberFormatException -> L56
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.NumberFormatException -> L56
            r4[r5] = r6     // Catch: java.lang.NumberFormatException -> L56
            java.lang.String r2 = java.lang.String.format(r2, r3)     // Catch: java.lang.NumberFormatException -> L56
            r1.<init>(r2)     // Catch: java.lang.NumberFormatException -> L56
            throw r0     // Catch: java.lang.NumberFormatException -> L56
        L31:
            r0 = r11
            r1 = r10
            java.lang.Object r0 = r0.get(r1)     // Catch: org.json.JSONException -> L37 java.lang.NumberFormatException -> L56
            return r0
        L37:
            r12 = move-exception
            org.json.JSONPointerException r0 = new org.json.JSONPointerException     // Catch: java.lang.NumberFormatException -> L56
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L56
            r3 = r2
            r3.<init>()     // Catch: java.lang.NumberFormatException -> L56
            java.lang.String r3 = "Error reading value at index position "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.NumberFormatException -> L56
            r3 = r10
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.NumberFormatException -> L56
            java.lang.String r2 = r2.toString()     // Catch: java.lang.NumberFormatException -> L56
            r3 = r12
            r1.<init>(r2, r3)     // Catch: java.lang.NumberFormatException -> L56
            throw r0     // Catch: java.lang.NumberFormatException -> L56
        L56:
            r10 = move-exception
            org.json.JSONPointerException r0 = new org.json.JSONPointerException
            r1 = r0
            java.lang.String r2 = "%s is not an array index"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r9
            r4[r5] = r6
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r3 = r10
            r1.<init>(r2, r3)
            throw r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = ""
            r1.<init>(r2)
            r5 = r0
            r0 = r4
            java.util.List<java.lang.String> r0 = r0.refTokens
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
        L14:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L38
            r0 = r6
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r7 = r0
            r0 = r5
            r1 = 47
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r7
            java.lang.String r1 = escape(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L14
        L38:
            r0 = r5
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static java.lang.String escape(java.lang.String r4) {
            r0 = r4
            java.lang.String r1 = "~"
            java.lang.String r2 = "~0"
            java.lang.String r0 = r0.replace(r1, r2)
            java.lang.String r1 = "/"
            java.lang.String r2 = "~1"
            java.lang.String r0 = r0.replace(r1, r2)
            return r0
    }

    public java.lang.String toURIFragment() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.UnsupportedEncodingException -> L3f
            r1 = r0
            java.lang.String r2 = "#"
            r1.<init>(r2)     // Catch: java.io.UnsupportedEncodingException -> L3f
            r5 = r0
            r0 = r4
            java.util.List<java.lang.String> r0 = r0.refTokens     // Catch: java.io.UnsupportedEncodingException -> L3f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.io.UnsupportedEncodingException -> L3f
            r6 = r0
        L14:
            r0 = r6
            boolean r0 = r0.hasNext()     // Catch: java.io.UnsupportedEncodingException -> L3f
            if (r0 == 0) goto L3a
            r0 = r6
            java.lang.Object r0 = r0.next()     // Catch: java.io.UnsupportedEncodingException -> L3f
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.io.UnsupportedEncodingException -> L3f
            r7 = r0
            r0 = r5
            r1 = 47
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.io.UnsupportedEncodingException -> L3f
            r1 = r7
            java.lang.String r2 = "utf-8"
            java.lang.String r1 = java.net.URLEncoder.encode(r1, r2)     // Catch: java.io.UnsupportedEncodingException -> L3f
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.io.UnsupportedEncodingException -> L3f
            goto L14
        L3a:
            r0 = r5
            java.lang.String r0 = r0.toString()     // Catch: java.io.UnsupportedEncodingException -> L3f
            return r0
        L3f:
            r5 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            throw r0
    }
}
