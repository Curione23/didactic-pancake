package org.json;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/forge_installer.jar:org/json/XMLTokener.class */
public class XMLTokener extends org.json.JSONTokener {
    public static final java.util.HashMap<java.lang.String, java.lang.Character> entity = null;

    public XMLTokener(java.io.Reader r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    public XMLTokener(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    public java.lang.String nextCDATA() throws org.json.JSONException {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r7 = r0
        L8:
            r0 = r4
            boolean r0 = r0.more()
            if (r0 == 0) goto L51
            r0 = r4
            char r0 = r0.next()
            r5 = r0
            r0 = r7
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            int r0 = r0.length()
            r1 = 3
            int r0 = r0 - r1
            r6 = r0
            r0 = r6
            if (r0 < 0) goto L8
            r0 = r7
            r1 = r6
            char r0 = r0.charAt(r1)
            r1 = 93
            if (r0 != r1) goto L8
            r0 = r7
            r1 = r6
            r2 = 1
            int r1 = r1 + r2
            char r0 = r0.charAt(r1)
            r1 = 93
            if (r0 != r1) goto L8
            r0 = r7
            r1 = r6
            r2 = 2
            int r1 = r1 + r2
            char r0 = r0.charAt(r1)
            r1 = 62
            if (r0 != r1) goto L8
            r0 = r7
            r1 = r6
            r0.setLength(r1)
            r0 = r7
            java.lang.String r0 = r0.toString()
            return r0
        L51:
            r0 = r4
            java.lang.String r1 = "Unclosed CDATA"
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
    }

    public java.lang.Object nextContent() throws org.json.JSONException {
            r4 = this;
        L0:
            r0 = r4
            char r0 = r0.next()
            r5 = r0
            r0 = r5
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 != 0) goto L0
            r0 = r5
            if (r0 != 0) goto L12
            r0 = 0
            return r0
        L12:
            r0 = r5
            r1 = 60
            if (r0 != r1) goto L1c
            java.lang.Character r0 = org.json.XML.LT
            return r0
        L1c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r6 = r0
        L24:
            r0 = r5
            if (r0 != 0) goto L30
            r0 = r6
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            return r0
        L30:
            r0 = r5
            r1 = 60
            if (r0 != r1) goto L42
            r0 = r4
            r0.back()
            r0 = r6
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            return r0
        L42:
            r0 = r5
            r1 = 38
            if (r0 != r1) goto L55
            r0 = r6
            r1 = r4
            r2 = r5
            java.lang.Object r1 = r1.nextEntity(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L5b
        L55:
            r0 = r6
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
        L5b:
            r0 = r4
            char r0 = r0.next()
            r5 = r0
            goto L24
    }

    public java.lang.Object nextEntity(char r5) throws org.json.JSONException {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r6 = r0
        L8:
            r0 = r4
            char r0 = r0.next()
            r7 = r0
            r0 = r7
            boolean r0 = java.lang.Character.isLetterOrDigit(r0)
            if (r0 != 0) goto L1a
            r0 = r7
            r1 = 35
            if (r0 != r1) goto L26
        L1a:
            r0 = r6
            r1 = r7
            char r1 = java.lang.Character.toLowerCase(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L47
        L26:
            r0 = r7
            r1 = 59
            if (r0 != r1) goto L2f
            goto L4a
        L2f:
            r0 = r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Missing ';' in XML entity: &"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L47:
            goto L8
        L4a:
            r0 = r6
            java.lang.String r0 = r0.toString()
            r7 = r0
            r0 = r7
            java.lang.String r0 = unescapeEntity(r0)
            return r0
    }

    static java.lang.String unescapeEntity(java.lang.String r7) {
            r0 = r7
            if (r0 == 0) goto Lb
            r0 = r7
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Le
        Lb:
            java.lang.String r0 = ""
            return r0
        Le:
            r0 = r7
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = 35
            if (r0 != r1) goto L54
            r0 = r7
            r1 = 1
            char r0 = r0.charAt(r1)
            r1 = 120(0x78, float:1.68E-43)
            if (r0 == r1) goto L2c
            r0 = r7
            r1 = 1
            char r0 = r0.charAt(r1)
            r1 = 88
            if (r0 != r1) goto L3a
        L2c:
            r0 = r7
            r1 = 2
            java.lang.String r0 = r0.substring(r1)
            r1 = 16
            int r0 = java.lang.Integer.parseInt(r0, r1)
            r8 = r0
            goto L43
        L3a:
            r0 = r7
            r1 = 1
            java.lang.String r0 = r0.substring(r1)
            int r0 = java.lang.Integer.parseInt(r0)
            r8 = r0
        L43:
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = 0
            r4 = 1
            r1.<init>(r2, r3, r4)
            return r0
        L54:
            java.util.HashMap<java.lang.String, java.lang.Character> r0 = org.json.XMLTokener.entity
            r1 = r7
            java.lang.Object r0 = r0.get(r1)
            java.lang.Character r0 = (java.lang.Character) r0
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L7c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = 38
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 59
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L7c:
            r0 = r8
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.Object nextMeta() throws org.json.JSONException {
            r3 = this;
        L0:
            r0 = r3
            char r0 = r0.next()
            r4 = r0
            r0 = r4
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 != 0) goto L0
            r0 = r4
            switch(r0) {
                case 0: goto L60;
                case 33: goto L77;
                case 34: goto L7f;
                case 39: goto L7f;
                case 47: goto L6f;
                case 60: goto L67;
                case 61: goto L73;
                case 62: goto L6b;
                case 63: goto L7b;
                default: goto L9a;
            }
        L60:
            r0 = r3
            java.lang.String r1 = "Misshaped meta tag"
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L67:
            java.lang.Character r0 = org.json.XML.LT
            return r0
        L6b:
            java.lang.Character r0 = org.json.XML.GT
            return r0
        L6f:
            java.lang.Character r0 = org.json.XML.SLASH
            return r0
        L73:
            java.lang.Character r0 = org.json.XML.EQ
            return r0
        L77:
            java.lang.Character r0 = org.json.XML.BANG
            return r0
        L7b:
            java.lang.Character r0 = org.json.XML.QUEST
            return r0
        L7f:
            r0 = r4
            r5 = r0
        L81:
            r0 = r3
            char r0 = r0.next()
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L91
            r0 = r3
            java.lang.String r1 = "Unterminated string"
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L91:
            r0 = r4
            r1 = r5
            if (r0 != r1) goto L81
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L9a:
            r0 = r3
            char r0 = r0.next()
            r4 = r0
            r0 = r4
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 == 0) goto Laa
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        Laa:
            r0 = r4
            switch(r0) {
                case 0: goto Lfc;
                case 33: goto L103;
                case 34: goto L103;
                case 39: goto L103;
                case 47: goto L103;
                case 60: goto L103;
                case 61: goto L103;
                case 62: goto L103;
                case 63: goto L103;
                default: goto L10b;
            }
        Lfc:
            r0 = r3
            java.lang.String r1 = "Unterminated string"
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L103:
            r0 = r3
            r0.back()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L10b:
            goto L9a
    }

    public java.lang.Object nextToken() throws org.json.JSONException {
            r4 = this;
        L0:
            r0 = r4
            char r0 = r0.next()
            r5 = r0
            r0 = r5
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 != 0) goto L0
            r0 = r5
            switch(r0) {
                case 0: goto L60;
                case 33: goto L7a;
                case 34: goto L82;
                case 39: goto L82;
                case 47: goto L72;
                case 60: goto L67;
                case 61: goto L76;
                case 62: goto L6e;
                case 63: goto L7e;
                default: goto Lc2;
            }
        L60:
            r0 = r4
            java.lang.String r1 = "Misshaped element"
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L67:
            r0 = r4
            java.lang.String r1 = "Misplaced '<'"
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L6e:
            java.lang.Character r0 = org.json.XML.GT
            return r0
        L72:
            java.lang.Character r0 = org.json.XML.SLASH
            return r0
        L76:
            java.lang.Character r0 = org.json.XML.EQ
            return r0
        L7a:
            java.lang.Character r0 = org.json.XML.BANG
            return r0
        L7e:
            java.lang.Character r0 = org.json.XML.QUEST
            return r0
        L82:
            r0 = r5
            r6 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r7 = r0
        L8c:
            r0 = r4
            char r0 = r0.next()
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L9c
            r0 = r4
            java.lang.String r1 = "Unterminated string"
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L9c:
            r0 = r5
            r1 = r6
            if (r0 != r1) goto La6
            r0 = r7
            java.lang.String r0 = r0.toString()
            return r0
        La6:
            r0 = r5
            r1 = 38
            if (r0 != r1) goto Lb9
            r0 = r7
            r1 = r4
            r2 = r5
            java.lang.Object r1 = r1.nextEntity(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L8c
        Lb9:
            r0 = r7
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L8c
        Lc2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r7 = r0
        Lca:
            r0 = r7
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            char r0 = r0.next()
            r5 = r0
            r0 = r5
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 == 0) goto Le1
            r0 = r7
            java.lang.String r0 = r0.toString()
            return r0
        Le1:
            r0 = r5
            switch(r0) {
                case 0: goto L144;
                case 33: goto L149;
                case 34: goto L152;
                case 39: goto L152;
                case 47: goto L149;
                case 60: goto L152;
                case 61: goto L149;
                case 62: goto L149;
                case 63: goto L149;
                case 91: goto L149;
                case 93: goto L149;
                default: goto L159;
            }
        L144:
            r0 = r7
            java.lang.String r0 = r0.toString()
            return r0
        L149:
            r0 = r4
            r0.back()
            r0 = r7
            java.lang.String r0 = r0.toString()
            return r0
        L152:
            r0 = r4
            java.lang.String r1 = "Bad character in a name"
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L159:
            goto Lca
    }

    public void skipPast(java.lang.String r5) {
            r4 = this;
            r0 = 0
            r10 = r0
            r0 = r5
            int r0 = r0.length()
            r11 = r0
            r0 = r11
            char[] r0 = new char[r0]
            r12 = r0
            r0 = 0
            r8 = r0
        L12:
            r0 = r8
            r1 = r11
            if (r0 >= r1) goto L2f
            r0 = r4
            char r0 = r0.next()
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L23
            return
        L23:
            r0 = r12
            r1 = r8
            r2 = r7
            r0[r1] = r2
            int r8 = r8 + 1
            goto L12
        L2f:
            r0 = r10
            r9 = r0
            r0 = 1
            r6 = r0
            r0 = 0
            r8 = r0
        L38:
            r0 = r8
            r1 = r11
            if (r0 >= r1) goto L69
            r0 = r12
            r1 = r9
            char r0 = r0[r1]
            r1 = r5
            r2 = r8
            char r1 = r1.charAt(r2)
            if (r0 == r1) goto L52
            r0 = 0
            r6 = r0
            goto L69
        L52:
            int r9 = r9 + 1
            r0 = r9
            r1 = r11
            if (r0 < r1) goto L63
            r0 = r9
            r1 = r11
            int r0 = r0 - r1
            r9 = r0
        L63:
            int r8 = r8 + 1
            goto L38
        L69:
            r0 = r6
            if (r0 == 0) goto L6e
            return
        L6e:
            r0 = r4
            char r0 = r0.next()
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L78
            return
        L78:
            r0 = r12
            r1 = r10
            r2 = r7
            r0[r1] = r2
            int r10 = r10 + 1
            r0 = r10
            r1 = r11
            if (r0 < r1) goto L2f
            r0 = r10
            r1 = r11
            int r0 = r0 - r1
            r10 = r0
            goto L2f
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r2 = 8
            r1.<init>(r2)
            org.json.XMLTokener.entity = r0
            java.util.HashMap<java.lang.String, java.lang.Character> r0 = org.json.XMLTokener.entity
            java.lang.String r1 = "amp"
            java.lang.Character r2 = org.json.XML.AMP
            java.lang.Object r0 = r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.Character> r0 = org.json.XMLTokener.entity
            java.lang.String r1 = "apos"
            java.lang.Character r2 = org.json.XML.APOS
            java.lang.Object r0 = r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.Character> r0 = org.json.XMLTokener.entity
            java.lang.String r1 = "gt"
            java.lang.Character r2 = org.json.XML.GT
            java.lang.Object r0 = r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.Character> r0 = org.json.XMLTokener.entity
            java.lang.String r1 = "lt"
            java.lang.Character r2 = org.json.XML.LT
            java.lang.Object r0 = r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.Character> r0 = org.json.XMLTokener.entity
            java.lang.String r1 = "quot"
            java.lang.Character r2 = org.json.XML.QUOT
            java.lang.Object r0 = r0.put(r1, r2)
            return
    }
}
