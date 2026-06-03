package org.json;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/forge_installer.jar:org/json/JSONML.class */
public class JSONML {
    public JSONML() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    private static java.lang.Object parse(org.json.XMLTokener r6, boolean r7, org.json.JSONArray r8, boolean r9, int r10) throws org.json.JSONException {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            if (r3 == 0) goto Ld
            org.json.JSONMLParserConfiguration r3 = org.json.JSONMLParserConfiguration.KEEP_STRINGS
            goto L10
        Ld:
            org.json.JSONMLParserConfiguration r3 = org.json.JSONMLParserConfiguration.ORIGINAL
        L10:
            r4 = r10
            java.lang.Object r0 = parse(r0, r1, r2, r3, r4)
            return r0
    }

    private static java.lang.Object parse(org.json.XMLTokener r7, boolean r8, org.json.JSONArray r9, org.json.JSONMLParserConfiguration r10, int r11) throws org.json.JSONException {
            r0 = 0
            r14 = r0
            r0 = 0
            r16 = r0
            r0 = 0
            r17 = r0
            r0 = 0
            r19 = r0
        Lc:
            r0 = r7
            boolean r0 = r0.more()
            if (r0 != 0) goto L1a
            r0 = r7
            java.lang.String r1 = "Bad XML"
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L1a:
            r0 = r7
            java.lang.Object r0 = r0.nextContent()
            r18 = r0
            r0 = r18
            java.lang.Character r1 = org.json.XML.LT
            if (r0 != r1) goto L324
            r0 = r7
            java.lang.Object r0 = r0.nextToken()
            r18 = r0
            r0 = r18
            boolean r0 = r0 instanceof java.lang.Character
            if (r0 == 0) goto L134
            r0 = r18
            java.lang.Character r1 = org.json.XML.SLASH
            if (r0 != r1) goto L81
            r0 = r7
            java.lang.Object r0 = r0.nextToken()
            r18 = r0
            r0 = r18
            boolean r0 = r0 instanceof java.lang.String
            if (r0 != 0) goto L6d
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Expected a closing name instead of '"
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r18
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "'."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L6d:
            r0 = r7
            java.lang.Object r0 = r0.nextToken()
            java.lang.Character r1 = org.json.XML.GT
            if (r0 == r1) goto L7e
            r0 = r7
            java.lang.String r1 = "Misshaped close tag"
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L7e:
            r0 = r18
            return r0
        L81:
            r0 = r18
            java.lang.Character r1 = org.json.XML.BANG
            if (r0 != r1) goto L11c
            r0 = r7
            char r0 = r0.next()
            r13 = r0
            r0 = r13
            r1 = 45
            if (r0 != r1) goto Laf
            r0 = r7
            char r0 = r0.next()
            r1 = 45
            if (r0 != r1) goto La8
            r0 = r7
            java.lang.String r1 = "-->"
            r0.skipPast(r1)
            goto Lc
        La8:
            r0 = r7
            r0.back()
            goto Lc
        Laf:
            r0 = r13
            r1 = 91
            if (r0 != r1) goto Le6
            r0 = r7
            java.lang.Object r0 = r0.nextToken()
            r18 = r0
            r0 = r18
            java.lang.String r1 = "CDATA"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Ldf
            r0 = r7
            char r0 = r0.next()
            r1 = 91
            if (r0 != r1) goto Ldf
            r0 = r9
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = r7
            java.lang.String r1 = r1.nextCDATA()
            org.json.JSONArray r0 = r0.put(r1)
            goto Lc
        Ldf:
            r0 = r7
            java.lang.String r1 = "Expected 'CDATA['"
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        Le6:
            r0 = 1
            r15 = r0
        Le9:
            r0 = r7
            java.lang.Object r0 = r0.nextMeta()
            r18 = r0
            r0 = r18
            if (r0 != 0) goto Lfb
            r0 = r7
            java.lang.String r1 = "Missing '>' after '<!'."
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        Lfb:
            r0 = r18
            java.lang.Character r1 = org.json.XML.LT
            if (r0 != r1) goto L109
            int r15 = r15 + 1
            goto L114
        L109:
            r0 = r18
            java.lang.Character r1 = org.json.XML.GT
            if (r0 != r1) goto L114
            int r15 = r15 + (-1)
        L114:
            r0 = r15
            if (r0 > 0) goto Le9
            goto Lc
        L11c:
            r0 = r18
            java.lang.Character r1 = org.json.XML.QUEST
            if (r0 != r1) goto L12d
            r0 = r7
            java.lang.String r1 = "?>"
            r0.skipPast(r1)
            goto Lc
        L12d:
            r0 = r7
            java.lang.String r1 = "Misshaped tag"
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L134:
            r0 = r18
            boolean r0 = r0 instanceof java.lang.String
            if (r0 != 0) goto L15a
            r0 = r7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Bad tagName '"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r18
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "'."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L15a:
            r0 = r18
            java.lang.String r0 = (java.lang.String) r0
            r19 = r0
            org.json.JSONArray r0 = new org.json.JSONArray
            r1 = r0
            r1.<init>()
            r16 = r0
            org.json.JSONObject r0 = new org.json.JSONObject
            r1 = r0
            r1.<init>()
            r17 = r0
            r0 = r8
            if (r0 == 0) goto L18d
            r0 = r16
            r1 = r19
            org.json.JSONArray r0 = r0.put(r1)
            r0 = r9
            if (r0 == 0) goto L1a2
            r0 = r9
            r1 = r16
            org.json.JSONArray r0 = r0.put(r1)
            goto L1a2
        L18d:
            r0 = r17
            java.lang.String r1 = "tagName"
            r2 = r19
            org.json.JSONObject r0 = r0.put(r1, r2)
            r0 = r9
            if (r0 == 0) goto L1a2
            r0 = r9
            r1 = r17
            org.json.JSONArray r0 = r0.put(r1)
        L1a2:
            r0 = 0
            r18 = r0
        L1a5:
            r0 = r18
            if (r0 != 0) goto L1b0
            r0 = r7
            java.lang.Object r0 = r0.nextToken()
            r18 = r0
        L1b0:
            r0 = r18
            if (r0 != 0) goto L1bc
            r0 = r7
            java.lang.String r1 = "Misshaped tag"
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L1bc:
            r0 = r18
            boolean r0 = r0 instanceof java.lang.String
            if (r0 != 0) goto L1c7
            goto L242
        L1c7:
            r0 = r18
            java.lang.String r0 = (java.lang.String) r0
            r12 = r0
            r0 = r8
            if (r0 != 0) goto L1ed
            java.lang.String r0 = "tagName"
            r1 = r12
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e6
            java.lang.String r0 = "childNode"
            r1 = r12
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1ed
        L1e6:
            r0 = r7
            java.lang.String r1 = "Reserved attribute."
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L1ed:
            r0 = r7
            java.lang.Object r0 = r0.nextToken()
            r18 = r0
            r0 = r18
            java.lang.Character r1 = org.json.XML.EQ
            if (r0 != r1) goto L235
            r0 = r7
            java.lang.Object r0 = r0.nextToken()
            r18 = r0
            r0 = r18
            boolean r0 = r0 instanceof java.lang.String
            if (r0 != 0) goto L210
            r0 = r7
            java.lang.String r1 = "Missing value"
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L210:
            r0 = r17
            r1 = r12
            r2 = r10
            boolean r2 = r2.isKeepStrings()
            if (r2 == 0) goto L223
            r2 = r18
            java.lang.String r2 = (java.lang.String) r2
            goto L22b
        L223:
            r2 = r18
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = org.json.XML.stringToValue(r2)
        L22b:
            org.json.JSONObject r0 = r0.accumulate(r1, r2)
            r0 = 0
            r18 = r0
            goto L1a5
        L235:
            r0 = r17
            r1 = r12
            java.lang.String r2 = ""
            org.json.JSONObject r0 = r0.accumulate(r1, r2)
            goto L1a5
        L242:
            r0 = r8
            if (r0 == 0) goto L256
            r0 = r17
            int r0 = r0.length()
            if (r0 <= 0) goto L256
            r0 = r16
            r1 = r17
            org.json.JSONArray r0 = r0.put(r1)
        L256:
            r0 = r18
            java.lang.Character r1 = org.json.XML.SLASH
            if (r0 != r1) goto L27d
            r0 = r7
            java.lang.Object r0 = r0.nextToken()
            java.lang.Character r1 = org.json.XML.GT
            if (r0 == r1) goto L26f
            r0 = r7
            java.lang.String r1 = "Misshaped tag"
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L26f:
            r0 = r9
            if (r0 != 0) goto Lc
            r0 = r8
            if (r0 == 0) goto L27a
            r0 = r16
            return r0
        L27a:
            r0 = r17
            return r0
        L27d:
            r0 = r18
            java.lang.Character r1 = org.json.XML.GT
            if (r0 == r1) goto L28c
            r0 = r7
            java.lang.String r1 = "Misshaped tag"
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L28c:
            r0 = r11
            r1 = r10
            int r1 = r1.getMaxNestingDepth()
            if (r0 != r1) goto L2b5
            r0 = r7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Maximum nesting depth of "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r10
            int r2 = r2.getMaxNestingDepth()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " reached"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L2b5:
            r0 = r7
            r1 = r8
            r2 = r16
            r3 = r10
            r4 = r11
            r5 = 1
            int r4 = r4 + r5
            java.lang.Object r0 = parse(r0, r1, r2, r3, r4)
            java.lang.String r0 = (java.lang.String) r0
            r14 = r0
            r0 = r14
            if (r0 == 0) goto Lc
            r0 = r14
            r1 = r19
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2fd
            r0 = r7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Mismatched '"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r19
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "' and '"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r14
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "'"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L2fd:
            r0 = 0
            r19 = r0
            r0 = r8
            if (r0 != 0) goto L316
            r0 = r16
            int r0 = r0.length()
            if (r0 <= 0) goto L316
            r0 = r17
            java.lang.String r1 = "childNodes"
            r2 = r16
            org.json.JSONObject r0 = r0.put(r1, r2)
        L316:
            r0 = r9
            if (r0 != 0) goto Lc
            r0 = r8
            if (r0 == 0) goto L321
            r0 = r16
            return r0
        L321:
            r0 = r17
            return r0
        L324:
            r0 = r9
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = r18
            boolean r1 = r1 instanceof java.lang.String
            if (r1 == 0) goto L34e
            r1 = r10
            boolean r1 = r1.isKeepStrings()
            if (r1 == 0) goto L343
            r1 = r18
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = org.json.XML.unescape(r1)
            goto L350
        L343:
            r1 = r18
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = org.json.XML.stringToValue(r1)
            goto L350
        L34e:
            r1 = r18
        L350:
            org.json.JSONArray r0 = r0.put(r1)
            goto Lc
    }

    public static org.json.JSONArray toJSONArray(java.lang.String r6) throws org.json.JSONException {
            org.json.XMLTokener r0 = new org.json.XMLTokener
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r1 = 1
            r2 = 0
            org.json.JSONMLParserConfiguration r3 = org.json.JSONMLParserConfiguration.ORIGINAL
            r4 = 0
            java.lang.Object r0 = parse(r0, r1, r2, r3, r4)
            org.json.JSONArray r0 = (org.json.JSONArray) r0
            return r0
    }

    public static org.json.JSONArray toJSONArray(java.lang.String r6, boolean r7) throws org.json.JSONException {
            org.json.XMLTokener r0 = new org.json.XMLTokener
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r1 = 1
            r2 = 0
            r3 = r7
            r4 = 0
            java.lang.Object r0 = parse(r0, r1, r2, r3, r4)
            org.json.JSONArray r0 = (org.json.JSONArray) r0
            return r0
    }

    public static org.json.JSONArray toJSONArray(java.lang.String r6, org.json.JSONMLParserConfiguration r7) throws org.json.JSONException {
            org.json.XMLTokener r0 = new org.json.XMLTokener
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r1 = 1
            r2 = 0
            r3 = r7
            r4 = 0
            java.lang.Object r0 = parse(r0, r1, r2, r3, r4)
            org.json.JSONArray r0 = (org.json.JSONArray) r0
            return r0
    }

    public static org.json.JSONArray toJSONArray(org.json.XMLTokener r6, org.json.JSONMLParserConfiguration r7) throws org.json.JSONException {
            r0 = r6
            r1 = 1
            r2 = 0
            r3 = r7
            r4 = 0
            java.lang.Object r0 = parse(r0, r1, r2, r3, r4)
            org.json.JSONArray r0 = (org.json.JSONArray) r0
            return r0
    }

    public static org.json.JSONArray toJSONArray(org.json.XMLTokener r6, boolean r7) throws org.json.JSONException {
            r0 = r6
            r1 = 1
            r2 = 0
            r3 = r7
            r4 = 0
            java.lang.Object r0 = parse(r0, r1, r2, r3, r4)
            org.json.JSONArray r0 = (org.json.JSONArray) r0
            return r0
    }

    public static org.json.JSONArray toJSONArray(org.json.XMLTokener r6) throws org.json.JSONException {
            r0 = r6
            r1 = 1
            r2 = 0
            r3 = 0
            r4 = 0
            java.lang.Object r0 = parse(r0, r1, r2, r3, r4)
            org.json.JSONArray r0 = (org.json.JSONArray) r0
            return r0
    }

    public static org.json.JSONObject toJSONObject(java.lang.String r6) throws org.json.JSONException {
            org.json.XMLTokener r0 = new org.json.XMLTokener
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            java.lang.Object r0 = parse(r0, r1, r2, r3, r4)
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            return r0
    }

    public static org.json.JSONObject toJSONObject(java.lang.String r6, boolean r7) throws org.json.JSONException {
            org.json.XMLTokener r0 = new org.json.XMLTokener
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r1 = 0
            r2 = 0
            r3 = r7
            r4 = 0
            java.lang.Object r0 = parse(r0, r1, r2, r3, r4)
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            return r0
    }

    public static org.json.JSONObject toJSONObject(java.lang.String r6, org.json.JSONMLParserConfiguration r7) throws org.json.JSONException {
            org.json.XMLTokener r0 = new org.json.XMLTokener
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r1 = 0
            r2 = 0
            r3 = r7
            r4 = 0
            java.lang.Object r0 = parse(r0, r1, r2, r3, r4)
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            return r0
    }

    public static org.json.JSONObject toJSONObject(org.json.XMLTokener r6) throws org.json.JSONException {
            r0 = r6
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            java.lang.Object r0 = parse(r0, r1, r2, r3, r4)
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            return r0
    }

    public static org.json.JSONObject toJSONObject(org.json.XMLTokener r6, boolean r7) throws org.json.JSONException {
            r0 = r6
            r1 = 0
            r2 = 0
            r3 = r7
            r4 = 0
            java.lang.Object r0 = parse(r0, r1, r2, r3, r4)
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            return r0
    }

    public static org.json.JSONObject toJSONObject(org.json.XMLTokener r6, org.json.JSONMLParserConfiguration r7) throws org.json.JSONException {
            r0 = r6
            r1 = 0
            r2 = 0
            r3 = r7
            r4 = 0
            java.lang.Object r0 = parse(r0, r1, r2, r3, r4)
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            return r0
    }

    public static java.lang.String toString(org.json.JSONArray r3) throws org.json.JSONException {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r3
            r1 = 0
            java.lang.String r0 = r0.getString(r1)
            r9 = r0
            r0 = r9
            org.json.XML.noSpace(r0)
            r0 = r9
            java.lang.String r0 = org.json.XML.escape(r0)
            r9 = r0
            r0 = r8
            r1 = 60
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            r1 = r9
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r3
            r1 = 1
            java.lang.Object r0 = r0.opt(r1)
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof org.json.JSONObject
            if (r0 == 0) goto Lb5
            r0 = 2
            r4 = r0
            r0 = r7
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            r5 = r0
            r0 = r5
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
        L4e:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Lb2
            r0 = r10
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r11 = r0
            r0 = r5
            r1 = r11
            java.lang.Object r0 = r0.opt(r1)
            r12 = r0
            r0 = r11
            org.json.XML.noSpace(r0)
            r0 = r12
            if (r0 == 0) goto Laf
            r0 = r8
            r1 = 32
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            r1 = r11
            java.lang.String r1 = org.json.XML.escape(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            r1 = 61
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            r1 = 34
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            r1 = r12
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = org.json.XML.escape(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            r1 = 34
            java.lang.StringBuilder r0 = r0.append(r1)
        Laf:
            goto L4e
        Lb2:
            goto Lb7
        Lb5:
            r0 = 1
            r4 = r0
        Lb7:
            r0 = r3
            int r0 = r0.length()
            r6 = r0
            r0 = r4
            r1 = r6
            if (r0 < r1) goto Ld4
            r0 = r8
            r1 = 47
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            r1 = 62
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L166
        Ld4:
            r0 = r8
            r1 = 62
            java.lang.StringBuilder r0 = r0.append(r1)
        Ldc:
            r0 = r3
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            r7 = r0
            int r4 = r4 + 1
            r0 = r7
            if (r0 == 0) goto L141
            r0 = r7
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L104
            r0 = r8
            r1 = r7
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = org.json.XML.escape(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L141
        L104:
            r0 = r7
            boolean r0 = r0 instanceof org.json.JSONObject
            if (r0 == 0) goto L11d
            r0 = r8
            r1 = r7
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            java.lang.String r1 = toString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L141
        L11d:
            r0 = r7
            boolean r0 = r0 instanceof org.json.JSONArray
            if (r0 == 0) goto L136
            r0 = r8
            r1 = r7
            org.json.JSONArray r1 = (org.json.JSONArray) r1
            java.lang.String r1 = toString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L141
        L136:
            r0 = r8
            r1 = r7
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
        L141:
            r0 = r4
            r1 = r6
            if (r0 < r1) goto Ldc
            r0 = r8
            r1 = 60
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            r1 = 47
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            r1 = r9
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            r1 = 62
            java.lang.StringBuilder r0 = r0.append(r1)
        L166:
            r0 = r8
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String toString(org.json.JSONObject r3) throws org.json.JSONException {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r3
            java.lang.String r1 = "tagName"
            java.lang.String r0 = r0.optString(r1)
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L1d
            r0 = r3
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = org.json.XML.escape(r0)
            return r0
        L1d:
            r0 = r9
            org.json.XML.noSpace(r0)
            r0 = r9
            java.lang.String r0 = org.json.XML.escape(r0)
            r9 = r0
            r0 = r4
            r1 = 60
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = r9
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r3
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
        L42:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Lb4
            r0 = r11
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r12 = r0
            java.lang.String r0 = "tagName"
            r1 = r12
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lb1
            java.lang.String r0 = "childNodes"
            r1 = r12
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lb1
            r0 = r12
            org.json.XML.noSpace(r0)
            r0 = r3
            r1 = r12
            java.lang.Object r0 = r0.opt(r1)
            r10 = r0
            r0 = r10
            if (r0 == 0) goto Lb1
            r0 = r4
            r1 = 32
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = r12
            java.lang.String r1 = org.json.XML.escape(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = 61
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = 34
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = r10
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = org.json.XML.escape(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = 34
            java.lang.StringBuilder r0 = r0.append(r1)
        Lb1:
            goto L42
        Lb4:
            r0 = r3
            java.lang.String r1 = "childNodes"
            org.json.JSONArray r0 = r0.optJSONArray(r1)
            r6 = r0
            r0 = r6
            if (r0 != 0) goto Ld0
            r0 = r4
            r1 = 47
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = 62
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L165
        Ld0:
            r0 = r4
            r1 = 62
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            int r0 = r0.length()
            r7 = r0
            r0 = 0
            r5 = r0
        Ldf:
            r0 = r5
            r1 = r7
            if (r0 >= r1) goto L149
            r0 = r6
            r1 = r5
            java.lang.Object r0 = r0.get(r1)
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L143
            r0 = r8
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L109
            r0 = r4
            r1 = r8
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = org.json.XML.escape(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L143
        L109:
            r0 = r8
            boolean r0 = r0 instanceof org.json.JSONObject
            if (r0 == 0) goto L121
            r0 = r4
            r1 = r8
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            java.lang.String r1 = toString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L143
        L121:
            r0 = r8
            boolean r0 = r0 instanceof org.json.JSONArray
            if (r0 == 0) goto L139
            r0 = r4
            r1 = r8
            org.json.JSONArray r1 = (org.json.JSONArray) r1
            java.lang.String r1 = toString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L143
        L139:
            r0 = r4
            r1 = r8
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
        L143:
            int r5 = r5 + 1
            goto Ldf
        L149:
            r0 = r4
            r1 = 60
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = 47
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = r9
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = 62
            java.lang.StringBuilder r0 = r0.append(r1)
        L165:
            r0 = r4
            java.lang.String r0 = r0.toString()
            return r0
    }
}
