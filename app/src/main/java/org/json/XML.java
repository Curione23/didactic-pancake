package org.json;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/forge_installer.jar:org/json/XML.class */
public class XML {
    public static final java.lang.Character AMP = null;
    public static final java.lang.Character APOS = null;
    public static final java.lang.Character BANG = null;
    public static final java.lang.Character EQ = null;
    public static final java.lang.Character GT = null;
    public static final java.lang.Character LT = null;
    public static final java.lang.Character QUEST = null;
    public static final java.lang.Character QUOT = null;
    public static final java.lang.Character SLASH = null;
    public static final java.lang.String NULL_ATTR = "xsi:nil";
    public static final java.lang.String TYPE_ATTR = "xsi:type";


    public XML() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    private static java.lang.Iterable<java.lang.Integer> codePointIterator(java.lang.String r4) {
            org.json.XML$1 r0 = new org.json.XML$1
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            return r0
    }

    public static java.lang.String escape(java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r4
            int r2 = r2.length()
            r1.<init>(r2)
            r5 = r0
            r0 = r4
            java.lang.Iterable r0 = codePointIterator(r0)
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
        L16:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Lbc
            r0 = r6
            java.lang.Object r0 = r0.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r7 = r0
            r0 = r7
            switch(r0) {
                case 34: goto L7e;
                case 38: goto L60;
                case 39: goto L88;
                case 60: goto L6a;
                case 62: goto L74;
                default: goto L92;
            }
        L60:
            r0 = r5
            java.lang.String r1 = "&amp;"
            java.lang.StringBuilder r0 = r0.append(r1)
            goto Lb9
        L6a:
            r0 = r5
            java.lang.String r1 = "&lt;"
            java.lang.StringBuilder r0 = r0.append(r1)
            goto Lb9
        L74:
            r0 = r5
            java.lang.String r1 = "&gt;"
            java.lang.StringBuilder r0 = r0.append(r1)
            goto Lb9
        L7e:
            r0 = r5
            java.lang.String r1 = "&quot;"
            java.lang.StringBuilder r0 = r0.append(r1)
            goto Lb9
        L88:
            r0 = r5
            java.lang.String r1 = "&apos;"
            java.lang.StringBuilder r0 = r0.append(r1)
            goto Lb9
        L92:
            r0 = r7
            boolean r0 = mustEscape(r0)
            if (r0 == 0) goto Lb3
            r0 = r5
            java.lang.String r1 = "&#x"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r7
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = 59
            java.lang.StringBuilder r0 = r0.append(r1)
            goto Lb9
        Lb3:
            r0 = r5
            r1 = r7
            java.lang.StringBuilder r0 = r0.appendCodePoint(r1)
        Lb9:
            goto L16
        Lbc:
            r0 = r5
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static boolean mustEscape(int r3) {
            r0 = r3
            boolean r0 = java.lang.Character.isISOControl(r0)
            if (r0 == 0) goto L19
            r0 = r3
            r1 = 9
            if (r0 == r1) goto L19
            r0 = r3
            r1 = 10
            if (r0 == r1) goto L19
            r0 = r3
            r1 = 13
            if (r0 != r1) goto L3d
        L19:
            r0 = r3
            r1 = 32
            if (r0 < r1) goto L25
            r0 = r3
            r1 = 55295(0xd7ff, float:7.7485E-41)
            if (r0 <= r1) goto L41
        L25:
            r0 = r3
            r1 = 57344(0xe000, float:8.0356E-41)
            if (r0 < r1) goto L31
            r0 = r3
            r1 = 65533(0xfffd, float:9.1831E-41)
            if (r0 <= r1) goto L41
        L31:
            r0 = r3
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r0 < r1) goto L3d
            r0 = r3
            r1 = 1114111(0x10ffff, float:1.561202E-39)
            if (r0 <= r1) goto L41
        L3d:
            r0 = 1
            goto L42
        L41:
            r0 = 0
        L42:
            return r0
    }

    public static java.lang.String unescape(java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r4
            int r2 = r2.length()
            r1.<init>(r2)
            r5 = r0
            r0 = 0
            r6 = r0
            r0 = r4
            int r0 = r0.length()
            r7 = r0
        L13:
            r0 = r6
            r1 = r7
            if (r0 >= r1) goto L6e
            r0 = r4
            r1 = r6
            char r0 = r0.charAt(r1)
            r8 = r0
            r0 = r8
            r1 = 38
            if (r0 != r1) goto L61
            r0 = r4
            r1 = 59
            r2 = r6
            int r0 = r0.indexOf(r1, r2)
            r9 = r0
            r0 = r9
            r1 = r6
            if (r0 <= r1) goto L57
            r0 = r4
            r1 = r6
            r2 = 1
            int r1 = r1 + r2
            r2 = r9
            java.lang.String r0 = r0.substring(r1, r2)
            r10 = r0
            r0 = r5
            r1 = r10
            java.lang.String r1 = org.json.XMLTokener.unescapeEntity(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            r1 = r10
            int r1 = r1.length()
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0 + r1
            r6 = r0
            goto L5e
        L57:
            r0 = r5
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
        L5e:
            goto L68
        L61:
            r0 = r5
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
        L68:
            int r6 = r6 + 1
            goto L13
        L6e:
            r0 = r5
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static void noSpace(java.lang.String r5) throws org.json.JSONException {
            r0 = r5
            int r0 = r0.length()
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L13
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.String r2 = "Empty string."
            r1.<init>(r2)
            throw r0
        L13:
            r0 = 0
            r6 = r0
        L15:
            r0 = r6
            r1 = r7
            if (r0 >= r1) goto L4b
            r0 = r5
            r1 = r6
            char r0 = r0.charAt(r1)
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 == 0) goto L45
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "'"
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "' contains a space character."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L45:
            int r6 = r6 + 1
            goto L15
        L4b:
            return
    }

    private static boolean parse(org.json.XMLTokener r7, org.json.JSONObject r8, java.lang.String r9, org.json.XMLParserConfiguration r10, int r11) throws org.json.JSONException {
            r0 = 0
            r14 = r0
            r0 = r7
            java.lang.Object r0 = r0.nextToken()
            r17 = r0
            r0 = r17
            java.lang.Character r1 = org.json.XML.BANG
            if (r0 != r1) goto Lad
            r0 = r7
            char r0 = r0.next()
            r12 = r0
            r0 = r12
            r1 = 45
            if (r0 != r1) goto L36
            r0 = r7
            char r0 = r0.next()
            r1 = 45
            if (r0 != r1) goto L2f
            r0 = r7
            java.lang.String r1 = "-->"
            r0.skipPast(r1)
            r0 = 0
            return r0
        L2f:
            r0 = r7
            r0.back()
            goto L78
        L36:
            r0 = r12
            r1 = 91
            if (r0 != r1) goto L78
            r0 = r7
            java.lang.Object r0 = r0.nextToken()
            r17 = r0
            java.lang.String r0 = "CDATA"
            r1 = r17
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L71
            r0 = r7
            char r0 = r0.next()
            r1 = 91
            if (r0 != r1) goto L71
            r0 = r7
            java.lang.String r0 = r0.nextCDATA()
            r15 = r0
            r0 = r15
            int r0 = r0.length()
            if (r0 <= 0) goto L6f
            r0 = r8
            r1 = r10
            java.lang.String r1 = r1.getcDataTagName()
            r2 = r15
            org.json.JSONObject r0 = r0.accumulate(r1, r2)
        L6f:
            r0 = 0
            return r0
        L71:
            r0 = r7
            java.lang.String r1 = "Expected 'CDATA['"
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L78:
            r0 = 1
            r13 = r0
        L7b:
            r0 = r7
            java.lang.Object r0 = r0.nextMeta()
            r17 = r0
            r0 = r17
            if (r0 != 0) goto L8d
            r0 = r7
            java.lang.String r1 = "Missing '>' after '<!'."
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L8d:
            r0 = r17
            java.lang.Character r1 = org.json.XML.LT
            if (r0 != r1) goto L9b
            int r13 = r13 + 1
            goto La6
        L9b:
            r0 = r17
            java.lang.Character r1 = org.json.XML.GT
            if (r0 != r1) goto La6
            int r13 = r13 + (-1)
        La6:
            r0 = r13
            if (r0 > 0) goto L7b
            r0 = 0
            return r0
        Lad:
            r0 = r17
            java.lang.Character r1 = org.json.XML.QUEST
            if (r0 != r1) goto Lbd
            r0 = r7
            java.lang.String r1 = "?>"
            r0.skipPast(r1)
            r0 = 0
            return r0
        Lbd:
            r0 = r17
            java.lang.Character r1 = org.json.XML.SLASH
            if (r0 != r1) goto L126
            r0 = r7
            java.lang.Object r0 = r0.nextToken()
            r17 = r0
            r0 = r9
            if (r0 != 0) goto Le8
            r0 = r7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Mismatched close tag "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r17
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        Le8:
            r0 = r17
            r1 = r9
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L113
            r0 = r7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Mismatched "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r9
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " and "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r17
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L113:
            r0 = r7
            java.lang.Object r0 = r0.nextToken()
            java.lang.Character r1 = org.json.XML.GT
            if (r0 == r1) goto L124
            r0 = r7
            java.lang.String r1 = "Misshaped close tag"
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L124:
            r0 = 1
            return r0
        L126:
            r0 = r17
            boolean r0 = r0 instanceof java.lang.Character
            if (r0 == 0) goto L135
            r0 = r7
            java.lang.String r1 = "Misshaped tag"
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L135:
            r0 = r17
            java.lang.String r0 = (java.lang.String) r0
            r16 = r0
            r0 = 0
            r17 = r0
            org.json.JSONObject r0 = new org.json.JSONObject
            r1 = r0
            r1.<init>()
            r14 = r0
            r0 = 0
            r19 = r0
            r0 = 0
            r18 = r0
        L14e:
            r0 = r17
            if (r0 != 0) goto L159
            r0 = r7
            java.lang.Object r0 = r0.nextToken()
            r17 = r0
        L159:
            r0 = r17
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L214
            r0 = r17
            java.lang.String r0 = (java.lang.String) r0
            r15 = r0
            r0 = r7
            java.lang.Object r0 = r0.nextToken()
            r17 = r0
            r0 = r17
            java.lang.Character r1 = org.json.XML.EQ
            if (r0 != r1) goto L207
            r0 = r7
            java.lang.Object r0 = r0.nextToken()
            r17 = r0
            r0 = r17
            boolean r0 = r0 instanceof java.lang.String
            if (r0 != 0) goto L18b
            r0 = r7
            java.lang.String r1 = "Missing value"
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L18b:
            r0 = r10
            boolean r0 = r0.isConvertNilAttributeToNull()
            if (r0 == 0) goto L1ad
            java.lang.String r0 = "xsi:nil"
            r1 = r15
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1ad
            r0 = r17
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            if (r0 == 0) goto L1ad
            r0 = 1
            r19 = r0
            goto L201
        L1ad:
            r0 = r10
            java.util.Map r0 = r0.getXsiTypeMap()
            if (r0 == 0) goto L1dd
            r0 = r10
            java.util.Map r0 = r0.getXsiTypeMap()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1dd
            java.lang.String r0 = "xsi:type"
            r1 = r15
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1dd
            r0 = r10
            java.util.Map r0 = r0.getXsiTypeMap()
            r1 = r17
            java.lang.Object r0 = r0.get(r1)
            org.json.XMLXsiTypeConverter r0 = (org.json.XMLXsiTypeConverter) r0
            r18 = r0
            goto L201
        L1dd:
            r0 = r19
            if (r0 != 0) goto L201
            r0 = r14
            r1 = r15
            r2 = r10
            boolean r2 = r2.isKeepStrings()
            if (r2 == 0) goto L1f5
            r2 = r17
            java.lang.String r2 = (java.lang.String) r2
            goto L1fd
        L1f5:
            r2 = r17
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = stringToValue(r2)
        L1fd:
            org.json.JSONObject r0 = r0.accumulate(r1, r2)
        L201:
            r0 = 0
            r17 = r0
            goto L14e
        L207:
            r0 = r14
            r1 = r15
            java.lang.String r2 = ""
            org.json.JSONObject r0 = r0.accumulate(r1, r2)
            goto L14e
        L214:
            r0 = r17
            java.lang.Character r1 = org.json.XML.SLASH
            if (r0 != r1) goto L2a3
            r0 = r7
            java.lang.Object r0 = r0.nextToken()
            java.lang.Character r1 = org.json.XML.GT
            if (r0 == r1) goto L22d
            r0 = r7
            java.lang.String r1 = "Misshaped tag"
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L22d:
            r0 = r10
            java.util.Set r0 = r0.getForceList()
            r1 = r16
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L272
            r0 = r19
            if (r0 == 0) goto L24d
            r0 = r8
            r1 = r16
            java.lang.Object r2 = org.json.JSONObject.NULL
            org.json.JSONObject r0 = r0.append(r1, r2)
            goto L2a1
        L24d:
            r0 = r14
            int r0 = r0.length()
            if (r0 <= 0) goto L261
            r0 = r8
            r1 = r16
            r2 = r14
            org.json.JSONObject r0 = r0.append(r1, r2)
            goto L2a1
        L261:
            r0 = r8
            r1 = r16
            org.json.JSONArray r2 = new org.json.JSONArray
            r3 = r2
            r3.<init>()
            org.json.JSONObject r0 = r0.put(r1, r2)
            goto L2a1
        L272:
            r0 = r19
            if (r0 == 0) goto L284
            r0 = r8
            r1 = r16
            java.lang.Object r2 = org.json.JSONObject.NULL
            org.json.JSONObject r0 = r0.accumulate(r1, r2)
            goto L2a1
        L284:
            r0 = r14
            int r0 = r0.length()
            if (r0 <= 0) goto L298
            r0 = r8
            r1 = r16
            r2 = r14
            org.json.JSONObject r0 = r0.accumulate(r1, r2)
            goto L2a1
        L298:
            r0 = r8
            r1 = r16
            java.lang.String r2 = ""
            org.json.JSONObject r0 = r0.accumulate(r1, r2)
        L2a1:
            r0 = 0
            return r0
        L2a3:
            r0 = r17
            java.lang.Character r1 = org.json.XML.GT
            if (r0 != r1) goto L407
        L2ab:
            r0 = r7
            java.lang.Object r0 = r0.nextContent()
            r17 = r0
            r0 = r17
            if (r0 != 0) goto L2d6
            r0 = r16
            if (r0 == 0) goto L2d4
            r0 = r7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Unclosed tag "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r16
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L2d4:
            r0 = 0
            return r0
        L2d6:
            r0 = r17
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L324
            r0 = r17
            java.lang.String r0 = (java.lang.String) r0
            r15 = r0
            r0 = r15
            int r0 = r0.length()
            if (r0 <= 0) goto L2ab
            r0 = r18
            if (r0 == 0) goto L306
            r0 = r14
            r1 = r10
            java.lang.String r1 = r1.getcDataTagName()
            r2 = r15
            r3 = r18
            java.lang.Object r2 = stringToValue(r2, r3)
            org.json.JSONObject r0 = r0.accumulate(r1, r2)
            goto L2ab
        L306:
            r0 = r14
            r1 = r10
            java.lang.String r1 = r1.getcDataTagName()
            r2 = r10
            boolean r2 = r2.isKeepStrings()
            if (r2 == 0) goto L318
            r2 = r15
            goto L31d
        L318:
            r2 = r15
            java.lang.Object r2 = stringToValue(r2)
        L31d:
            org.json.JSONObject r0 = r0.accumulate(r1, r2)
            goto L2ab
        L324:
            r0 = r17
            java.lang.Character r1 = org.json.XML.LT
            if (r0 != r1) goto L2ab
            r0 = r11
            r1 = r10
            int r1 = r1.getMaxNestingDepth()
            if (r0 != r1) goto L355
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
        L355:
            r0 = r7
            r1 = r14
            r2 = r16
            r3 = r10
            r4 = r11
            r5 = 1
            int r4 = r4 + r5
            boolean r0 = parse(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L2ab
            r0 = r10
            java.util.Set r0 = r0.getForceList()
            r1 = r16
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L3c0
            r0 = r14
            int r0 = r0.length()
            if (r0 != 0) goto L38c
            r0 = r8
            r1 = r16
            org.json.JSONArray r2 = new org.json.JSONArray
            r3 = r2
            r3.<init>()
            org.json.JSONObject r0 = r0.put(r1, r2)
            goto L405
        L38c:
            r0 = r14
            int r0 = r0.length()
            r1 = 1
            if (r0 != r1) goto L3b4
            r0 = r14
            r1 = r10
            java.lang.String r1 = r1.getcDataTagName()
            java.lang.Object r0 = r0.opt(r1)
            if (r0 == 0) goto L3b4
            r0 = r8
            r1 = r16
            r2 = r14
            r3 = r10
            java.lang.String r3 = r3.getcDataTagName()
            java.lang.Object r2 = r2.opt(r3)
            org.json.JSONObject r0 = r0.append(r1, r2)
            goto L405
        L3b4:
            r0 = r8
            r1 = r16
            r2 = r14
            org.json.JSONObject r0 = r0.append(r1, r2)
            goto L405
        L3c0:
            r0 = r14
            int r0 = r0.length()
            if (r0 != 0) goto L3d4
            r0 = r8
            r1 = r16
            java.lang.String r2 = ""
            org.json.JSONObject r0 = r0.accumulate(r1, r2)
            goto L405
        L3d4:
            r0 = r14
            int r0 = r0.length()
            r1 = 1
            if (r0 != r1) goto L3fc
            r0 = r14
            r1 = r10
            java.lang.String r1 = r1.getcDataTagName()
            java.lang.Object r0 = r0.opt(r1)
            if (r0 == 0) goto L3fc
            r0 = r8
            r1 = r16
            r2 = r14
            r3 = r10
            java.lang.String r3 = r3.getcDataTagName()
            java.lang.Object r2 = r2.opt(r3)
            org.json.JSONObject r0 = r0.accumulate(r1, r2)
            goto L405
        L3fc:
            r0 = r8
            r1 = r16
            r2 = r14
            org.json.JSONObject r0 = r0.accumulate(r1, r2)
        L405:
            r0 = 0
            return r0
        L407:
            r0 = r7
            java.lang.String r1 = "Misshaped tag"
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
    }

    public static java.lang.Object stringToValue(java.lang.String r3, org.json.XMLXsiTypeConverter<?> r4) {
            r0 = r4
            if (r0 == 0) goto Lc
            r0 = r4
            r1 = r3
            java.lang.Object r0 = r0.convert(r1)
            return r0
        Lc:
            r0 = r3
            java.lang.Object r0 = stringToValue(r0)
            return r0
    }

    public static java.lang.Object stringToValue(java.lang.String r3) {
            java.lang.String r0 = ""
            r1 = r3
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb
            r0 = r3
            return r0
        Lb:
            java.lang.String r0 = "true"
            r1 = r3
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L18
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L18:
            java.lang.String r0 = "false"
            r1 = r3
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L25
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L25:
            java.lang.String r0 = "null"
            r1 = r3
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L32
            java.lang.Object r0 = org.json.JSONObject.NULL
            return r0
        L32:
            r0 = r3
            r1 = 0
            char r0 = r0.charAt(r1)
            r4 = r0
            r0 = r4
            r1 = 48
            if (r0 < r1) goto L44
            r0 = r4
            r1 = 57
            if (r0 <= r1) goto L4a
        L44:
            r0 = r4
            r1 = 45
            if (r0 != r1) goto L50
        L4a:
            r0 = r3
            java.lang.Number r0 = stringToNumber(r0)     // Catch: java.lang.Exception -> L4f
            return r0
        L4f:
            r5 = move-exception
        L50:
            r0 = r3
            return r0
    }

    private static java.lang.Number stringToNumber(java.lang.String r5) throws java.lang.NumberFormatException {
            r0 = r5
            r1 = 0
            char r0 = r0.charAt(r1)
            r6 = r0
            r0 = r6
            r1 = 48
            if (r0 < r1) goto L12
            r0 = r6
            r1 = 57
            if (r0 <= r1) goto L18
        L12:
            r0 = r6
            r1 = 45
            if (r0 != r1) goto L154
        L18:
            r0 = r5
            boolean r0 = isDecimalNotation(r0)
            if (r0 == 0) goto L98
            java.math.BigDecimal r0 = new java.math.BigDecimal     // Catch: java.lang.NumberFormatException -> L41
            r1 = r0
            r2 = r5
            r1.<init>(r2)     // Catch: java.lang.NumberFormatException -> L41
            r7 = r0
            r0 = r6
            r1 = 45
            if (r0 != r1) goto L3f
            java.math.BigDecimal r0 = java.math.BigDecimal.ZERO     // Catch: java.lang.NumberFormatException -> L41
            r1 = r7
            int r0 = r0.compareTo(r1)     // Catch: java.lang.NumberFormatException -> L41
            if (r0 != 0) goto L3f
            r0 = -9223372036854775808
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L41
            return r0
        L3f:
            r0 = r7
            return r0
        L41:
            r7 = move-exception
            r0 = r5
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L77
            r8 = r0
            r0 = r8
            boolean r0 = r0.isNaN()     // Catch: java.lang.NumberFormatException -> L77
            if (r0 != 0) goto L55
            r0 = r8
            boolean r0 = r0.isInfinite()     // Catch: java.lang.NumberFormatException -> L77
            if (r0 == 0) goto L75
        L55:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException     // Catch: java.lang.NumberFormatException -> L77
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L77
            r3 = r2
            r3.<init>()     // Catch: java.lang.NumberFormatException -> L77
            java.lang.String r3 = "val ["
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.NumberFormatException -> L77
            r3 = r5
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.NumberFormatException -> L77
            java.lang.String r3 = "] is not a valid number."
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.NumberFormatException -> L77
            java.lang.String r2 = r2.toString()     // Catch: java.lang.NumberFormatException -> L77
            r1.<init>(r2)     // Catch: java.lang.NumberFormatException -> L77
            throw r0     // Catch: java.lang.NumberFormatException -> L77
        L75:
            r0 = r8
            return r0
        L77:
            r8 = move-exception
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "val ["
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "] is not a valid number."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L98:
            r0 = r6
            r1 = 48
            if (r0 != r1) goto Ldb
            r0 = r5
            int r0 = r0.length()
            r1 = 1
            if (r0 <= r1) goto Ldb
            r0 = r5
            r1 = 1
            char r0 = r0.charAt(r1)
            r7 = r0
            r0 = r7
            r1 = 48
            if (r0 < r1) goto Ld8
            r0 = r7
            r1 = 57
            if (r0 > r1) goto Ld8
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "val ["
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "] is not a valid number."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        Ld8:
            goto L127
        Ldb:
            r0 = r6
            r1 = 45
            if (r0 != r1) goto L127
            r0 = r5
            int r0 = r0.length()
            r1 = 2
            if (r0 <= r1) goto L127
            r0 = r5
            r1 = 1
            char r0 = r0.charAt(r1)
            r7 = r0
            r0 = r5
            r1 = 2
            char r0 = r0.charAt(r1)
            r8 = r0
            r0 = r7
            r1 = 48
            if (r0 != r1) goto L127
            r0 = r8
            r1 = 48
            if (r0 < r1) goto L127
            r0 = r8
            r1 = 57
            if (r0 > r1) goto L127
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "val ["
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "] is not a valid number."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L127:
            java.math.BigInteger r0 = new java.math.BigInteger
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r7 = r0
            r0 = r7
            int r0 = r0.bitLength()
            r1 = 31
            if (r0 > r1) goto L141
            r0 = r7
            int r0 = r0.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L141:
            r0 = r7
            int r0 = r0.bitLength()
            r1 = 63
            if (r0 > r1) goto L152
            r0 = r7
            long r0 = r0.longValue()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L152:
            r0 = r7
            return r0
        L154:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "val ["
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "] is not a valid number."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    private static boolean isDecimalNotation(java.lang.String r3) {
            r0 = r3
            r1 = 46
            int r0 = r0.indexOf(r1)
            r1 = -1
            if (r0 > r1) goto L27
            r0 = r3
            r1 = 101(0x65, float:1.42E-43)
            int r0 = r0.indexOf(r1)
            r1 = -1
            if (r0 > r1) goto L27
            r0 = r3
            r1 = 69
            int r0 = r0.indexOf(r1)
            r1 = -1
            if (r0 > r1) goto L27
            java.lang.String r0 = "-0"
            r1 = r3
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2b
        L27:
            r0 = 1
            goto L2c
        L2b:
            r0 = 0
        L2c:
            return r0
    }

    public static org.json.JSONObject toJSONObject(java.lang.String r3) throws org.json.JSONException {
            r0 = r3
            org.json.XMLParserConfiguration r1 = org.json.XMLParserConfiguration.ORIGINAL
            org.json.JSONObject r0 = toJSONObject(r0, r1)
            return r0
    }

    public static org.json.JSONObject toJSONObject(java.io.Reader r3) throws org.json.JSONException {
            r0 = r3
            org.json.XMLParserConfiguration r1 = org.json.XMLParserConfiguration.ORIGINAL
            org.json.JSONObject r0 = toJSONObject(r0, r1)
            return r0
    }

    public static org.json.JSONObject toJSONObject(java.io.Reader r3, boolean r4) throws org.json.JSONException {
            r0 = r4
            if (r0 == 0) goto Lc
            r0 = r3
            org.json.XMLParserConfiguration r1 = org.json.XMLParserConfiguration.KEEP_STRINGS
            org.json.JSONObject r0 = toJSONObject(r0, r1)
            return r0
        Lc:
            r0 = r3
            org.json.XMLParserConfiguration r1 = org.json.XMLParserConfiguration.ORIGINAL
            org.json.JSONObject r0 = toJSONObject(r0, r1)
            return r0
    }

    public static org.json.JSONObject toJSONObject(java.io.Reader r6, org.json.XMLParserConfiguration r7) throws org.json.JSONException {
            org.json.JSONObject r0 = new org.json.JSONObject
            r1 = r0
            r1.<init>()
            r8 = r0
            org.json.XMLTokener r0 = new org.json.XMLTokener
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r9 = r0
        L11:
            r0 = r9
            boolean r0 = r0.more()
            if (r0 == 0) goto L31
            r0 = r9
            java.lang.String r1 = "<"
            r0.skipPast(r1)
            r0 = r9
            boolean r0 = r0.more()
            if (r0 == 0) goto L11
            r0 = r9
            r1 = r8
            r2 = 0
            r3 = r7
            r4 = 0
            boolean r0 = parse(r0, r1, r2, r3, r4)
            goto L11
        L31:
            r0 = r8
            return r0
    }

    public static org.json.JSONObject toJSONObject(java.lang.String r4, boolean r5) throws org.json.JSONException {
            java.io.StringReader r0 = new java.io.StringReader
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            r1 = r5
            org.json.JSONObject r0 = toJSONObject(r0, r1)
            return r0
    }

    public static org.json.JSONObject toJSONObject(java.lang.String r4, org.json.XMLParserConfiguration r5) throws org.json.JSONException {
            java.io.StringReader r0 = new java.io.StringReader
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            r1 = r5
            org.json.JSONObject r0 = toJSONObject(r0, r1)
            return r0
    }

    public static java.lang.String toString(java.lang.Object r4) throws org.json.JSONException {
            r0 = r4
            r1 = 0
            org.json.XMLParserConfiguration r2 = org.json.XMLParserConfiguration.ORIGINAL
            java.lang.String r0 = toString(r0, r1, r2)
            return r0
    }

    public static java.lang.String toString(java.lang.Object r4, java.lang.String r5) {
            r0 = r4
            r1 = r5
            org.json.XMLParserConfiguration r2 = org.json.XMLParserConfiguration.ORIGINAL
            java.lang.String r0 = toString(r0, r1, r2)
            return r0
    }

    public static java.lang.String toString(java.lang.Object r6, java.lang.String r7, org.json.XMLParserConfiguration r8) throws org.json.JSONException {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = 0
            r4 = 0
            java.lang.String r0 = toString(r0, r1, r2, r3, r4)
            return r0
    }

    private static java.lang.String toString(java.lang.Object r7, java.lang.String r8, org.json.XMLParserConfiguration r9, int r10, int r11) throws org.json.JSONException {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r12 = r0
            r0 = r7
            boolean r0 = r0 instanceof org.json.JSONObject
            if (r0 == 0) goto L21d
            r0 = r8
            if (r0 == 0) goto L48
            r0 = r12
            r1 = r11
            java.lang.String r1 = indent(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r12
            r1 = 60
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r12
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r12
            r1 = 62
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r10
            if (r0 <= 0) goto L48
            r0 = r12
            java.lang.String r1 = "\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r11
            r1 = r10
            int r0 = r0 + r1
            r11 = r0
        L48:
            r0 = r7
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            r14 = r0
            r0 = r14
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            r16 = r0
        L5a:
            r0 = r16
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L1e3
            r0 = r16
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r17 = r0
            r0 = r14
            r1 = r17
            java.lang.Object r0 = r0.opt(r1)
            r18 = r0
            r0 = r18
            if (r0 != 0) goto L85
            java.lang.String r0 = ""
            r18 = r0
            goto L9b
        L85:
            r0 = r18
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L9b
            org.json.JSONArray r0 = new org.json.JSONArray
            r1 = r0
            r2 = r18
            r1.<init>(r2)
            r18 = r0
        L9b:
            r0 = r17
            r1 = r9
            java.lang.String r1 = r1.getcDataTagName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L105
            r0 = r18
            boolean r0 = r0 instanceof org.json.JSONArray
            if (r0 == 0) goto Lf4
            r0 = r18
            org.json.JSONArray r0 = (org.json.JSONArray) r0
            r13 = r0
            r0 = r13
            int r0 = r0.length()
            r19 = r0
            r0 = 0
            r20 = r0
        Lc0:
            r0 = r20
            r1 = r19
            if (r0 >= r1) goto Lf1
            r0 = r20
            if (r0 <= 0) goto Ld4
            r0 = r12
            r1 = 10
            java.lang.StringBuilder r0 = r0.append(r1)
        Ld4:
            r0 = r13
            r1 = r20
            java.lang.Object r0 = r0.opt(r1)
            r21 = r0
            r0 = r12
            r1 = r21
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = escape(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            int r20 = r20 + 1
            goto Lc0
        Lf1:
            goto L1e0
        Lf4:
            r0 = r12
            r1 = r18
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = escape(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L1e0
        L105:
            r0 = r18
            boolean r0 = r0 instanceof org.json.JSONArray
            if (r0 == 0) goto L193
            r0 = r18
            org.json.JSONArray r0 = (org.json.JSONArray) r0
            r13 = r0
            r0 = r13
            int r0 = r0.length()
            r19 = r0
            r0 = 0
            r20 = r0
        L11e:
            r0 = r20
            r1 = r19
            if (r0 >= r1) goto L190
            r0 = r13
            r1 = r20
            java.lang.Object r0 = r0.opt(r1)
            r21 = r0
            r0 = r21
            boolean r0 = r0 instanceof org.json.JSONArray
            if (r0 == 0) goto L179
            r0 = r12
            r1 = 60
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r12
            r1 = r17
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r12
            r1 = 62
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r12
            r1 = r21
            r2 = 0
            r3 = r9
            r4 = r10
            r5 = r11
            java.lang.String r1 = toString(r1, r2, r3, r4, r5)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r12
            java.lang.String r1 = "</"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r12
            r1 = r17
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r12
            r1 = 62
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L18a
        L179:
            r0 = r12
            r1 = r21
            r2 = r17
            r3 = r9
            r4 = r10
            r5 = r11
            java.lang.String r1 = toString(r1, r2, r3, r4, r5)
            java.lang.StringBuilder r0 = r0.append(r1)
        L18a:
            int r20 = r20 + 1
            goto L11e
        L190:
            goto L1e0
        L193:
            java.lang.String r0 = ""
            r1 = r18
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1cf
            r0 = r12
            r1 = r11
            java.lang.String r1 = indent(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r12
            r1 = 60
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r12
            r1 = r17
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r12
            java.lang.String r1 = "/>"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r10
            if (r0 <= 0) goto L1e0
            r0 = r12
            java.lang.String r1 = "\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L1e0
        L1cf:
            r0 = r12
            r1 = r18
            r2 = r17
            r3 = r9
            r4 = r10
            r5 = r11
            java.lang.String r1 = toString(r1, r2, r3, r4, r5)
            java.lang.StringBuilder r0 = r0.append(r1)
        L1e0:
            goto L5a
        L1e3:
            r0 = r8
            if (r0 == 0) goto L217
            r0 = r12
            r1 = r11
            r2 = r10
            int r1 = r1 - r2
            java.lang.String r1 = indent(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r12
            java.lang.String r1 = "</"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r12
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r12
            r1 = 62
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r10
            if (r0 <= 0) goto L217
            r0 = r12
            java.lang.String r1 = "\n"
            java.lang.StringBuilder r0 = r0.append(r1)
        L217:
            r0 = r12
            java.lang.String r0 = r0.toString()
            return r0
        L21d:
            r0 = r7
            if (r0 == 0) goto L28e
            r0 = r7
            boolean r0 = r0 instanceof org.json.JSONArray
            if (r0 != 0) goto L232
            r0 = r7
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L28e
        L232:
            r0 = r7
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L249
            org.json.JSONArray r0 = new org.json.JSONArray
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            r13 = r0
            goto L24f
        L249:
            r0 = r7
            org.json.JSONArray r0 = (org.json.JSONArray) r0
            r13 = r0
        L24f:
            r0 = r13
            int r0 = r0.length()
            r16 = r0
            r0 = 0
            r17 = r0
        L259:
            r0 = r17
            r1 = r16
            if (r0 >= r1) goto L288
            r0 = r13
            r1 = r17
            java.lang.Object r0 = r0.opt(r1)
            r18 = r0
            r0 = r12
            r1 = r18
            r2 = r8
            if (r2 != 0) goto L276
            java.lang.String r2 = "array"
            goto L277
        L276:
            r2 = r8
        L277:
            r3 = r9
            r4 = r10
            r5 = r11
            java.lang.String r1 = toString(r1, r2, r3, r4, r5)
            java.lang.StringBuilder r0 = r0.append(r1)
            int r17 = r17 + 1
            goto L259
        L288:
            r0 = r12
            java.lang.String r0 = r0.toString()
            return r0
        L28e:
            r0 = r7
            if (r0 != 0) goto L297
            java.lang.String r0 = "null"
            goto L29e
        L297:
            r0 = r7
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = escape(r0)
        L29e:
            r15 = r0
            r0 = r8
            if (r0 != 0) goto L2d4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r11
            java.lang.String r1 = indent(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "\""
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r15
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "\""
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r10
            if (r1 <= 0) goto L2cb
            java.lang.String r1 = "\n"
            goto L2cd
        L2cb:
            java.lang.String r1 = ""
        L2cd:
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L2d4:
            r0 = r15
            int r0 = r0.length()
            if (r0 != 0) goto L30b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r11
            java.lang.String r1 = indent(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "<"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "/>"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r10
            if (r1 <= 0) goto L302
            java.lang.String r1 = "\n"
            goto L304
        L302:
            java.lang.String r1 = ""
        L304:
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L30b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r11
            java.lang.String r1 = indent(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "<"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ">"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r15
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "</"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ">"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r10
            if (r1 <= 0) goto L344
            java.lang.String r1 = "\n"
            goto L346
        L344:
            java.lang.String r1 = ""
        L346:
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String toString(java.lang.Object r5, int r6) {
            r0 = r5
            r1 = 0
            org.json.XMLParserConfiguration r2 = org.json.XMLParserConfiguration.ORIGINAL
            r3 = r6
            java.lang.String r0 = toString(r0, r1, r2, r3)
            return r0
    }

    public static java.lang.String toString(java.lang.Object r5, java.lang.String r6, int r7) {
            r0 = r5
            r1 = r6
            org.json.XMLParserConfiguration r2 = org.json.XMLParserConfiguration.ORIGINAL
            r3 = r7
            java.lang.String r0 = toString(r0, r1, r2, r3)
            return r0
    }

    public static java.lang.String toString(java.lang.Object r6, java.lang.String r7, org.json.XMLParserConfiguration r8, int r9) throws org.json.JSONException {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = 0
            java.lang.String r0 = toString(r0, r1, r2, r3, r4)
            return r0
    }

    private static final java.lang.String indent(int r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = 0
            r5 = r0
        La:
            r0 = r5
            r1 = r3
            if (r0 >= r1) goto L1c
            r0 = r4
            r1 = 32
            java.lang.StringBuilder r0 = r0.append(r1)
            int r5 = r5 + 1
            goto La
        L1c:
            r0 = r4
            java.lang.String r0 = r0.toString()
            return r0
    }

    static {
            r0 = 38
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            org.json.XML.AMP = r0
            r0 = 39
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            org.json.XML.APOS = r0
            r0 = 33
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            org.json.XML.BANG = r0
            r0 = 61
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            org.json.XML.EQ = r0
            r0 = 62
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            org.json.XML.GT = r0
            r0 = 60
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            org.json.XML.LT = r0
            r0 = 63
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            org.json.XML.QUEST = r0
            r0 = 34
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            org.json.XML.QUOT = r0
            r0 = 47
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            org.json.XML.SLASH = r0
            return
    }
}
