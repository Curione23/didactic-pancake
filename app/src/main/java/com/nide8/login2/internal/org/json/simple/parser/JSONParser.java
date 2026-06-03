package com.nide8.login2.internal.org.json.simple.parser;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/nide8auth.jar:com/nide8/login2/internal/org/json/simple/parser/JSONParser.class */
public class JSONParser {
    public static final int S_INIT = 0;
    public static final int S_IN_FINISHED_VALUE = 1;
    public static final int S_IN_OBJECT = 2;
    public static final int S_IN_ARRAY = 3;
    public static final int S_PASSED_PAIR_KEY = 4;
    public static final int S_IN_PAIR_VALUE = 5;
    public static final int S_END = 6;
    public static final int S_IN_ERROR = -1;
    private java.util.LinkedList<java.lang.Integer> handlerStatusStack;
    private com.nide8.login2.internal.org.json.simple.parser.Yylex lexer;
    private com.nide8.login2.internal.org.json.simple.parser.Yytoken token;
    private int status;

    public JSONParser() {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            com.nide8.login2.internal.org.json.simple.parser.Yylex r1 = new com.nide8.login2.internal.org.json.simple.parser.Yylex
            r2 = r1
            r3 = 0
            java.io.Reader r3 = (java.io.Reader) r3
            r2.<init>(r3)
            r0.lexer = r1
            r0 = r5
            r1 = 0
            r0.token = r1
            r0 = r5
            r1 = 0
            r0.status = r1
            return
    }

    private int peekStatus(java.util.LinkedList<java.lang.Integer> r3) {
            r2 = this;
            r0 = r3
            int r0 = r0.size()
            if (r0 != 0) goto L9
            r0 = -1
            return r0
        L9:
            r0 = r3
            java.lang.Object r0 = r0.getFirst()
            java.lang.Integer r0 = (java.lang.Integer) r0
            r4 = r0
            r0 = r4
            int r0 = r0.intValue()
            return r0
    }

    public void reset() {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.token = r1
            r0 = r3
            r1 = 0
            r0.status = r1
            r0 = r3
            r1 = 0
            r0.handlerStatusStack = r1
            return
    }

    public void reset(java.io.Reader r4) {
            r3 = this;
            r0 = r3
            com.nide8.login2.internal.org.json.simple.parser.Yylex r0 = r0.lexer
            r1 = r4
            r0.yyreset(r1)
            r0 = r3
            r0.reset()
            return
    }

    public int getPosition() {
            r2 = this;
            r0 = r2
            com.nide8.login2.internal.org.json.simple.parser.Yylex r0 = r0.lexer
            int r0 = r0.getPosition()
            return r0
    }

    public java.lang.Object parse(java.lang.String r5) throws com.nide8.login2.internal.org.json.simple.parser.ParseException {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 0
            com.nide8.login2.internal.org.json.simple.parser.ContainerFactory r2 = (com.nide8.login2.internal.org.json.simple.parser.ContainerFactory) r2
            java.lang.Object r0 = r0.parse(r1, r2)
            return r0
    }

    public java.lang.Object parse(java.lang.String r7, com.nide8.login2.internal.org.json.simple.parser.ContainerFactory r8) throws com.nide8.login2.internal.org.json.simple.parser.ParseException {
            r6 = this;
            java.io.StringReader r0 = new java.io.StringReader
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            r9 = r0
            r0 = r6
            r1 = r9
            r2 = r8
            java.lang.Object r0 = r0.parse(r1, r2)     // Catch: java.io.IOException -> L10
            return r0
        L10:
            r10 = move-exception
            com.nide8.login2.internal.org.json.simple.parser.ParseException r0 = new com.nide8.login2.internal.org.json.simple.parser.ParseException
            r1 = r0
            r2 = -1
            r3 = 2
            r4 = r10
            r1.<init>(r2, r3, r4)
            throw r0
    }

    public java.lang.Object parse(java.io.Reader r5) throws java.io.IOException, com.nide8.login2.internal.org.json.simple.parser.ParseException {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 0
            com.nide8.login2.internal.org.json.simple.parser.ContainerFactory r2 = (com.nide8.login2.internal.org.json.simple.parser.ContainerFactory) r2
            java.lang.Object r0 = r0.parse(r1, r2)
            return r0
    }

    public java.lang.Object parse(java.io.Reader r7, com.nide8.login2.internal.org.json.simple.parser.ContainerFactory r8) throws java.io.IOException, com.nide8.login2.internal.org.json.simple.parser.ParseException {
            r6 = this;
            r0 = r6
            r1 = r7
            r0.reset(r1)
            java.util.LinkedList r0 = new java.util.LinkedList
            r1 = r0
            r1.<init>()
            r9 = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r1 = r0
            r1.<init>()
            r10 = r0
        L16:
            r0 = r6
            r0.nextToken()     // Catch: java.io.IOException -> L3a1
            r0 = r6
            int r0 = r0.status     // Catch: java.io.IOException -> L3a1
            switch(r0) {
                case -1: goto L369;
                case 0: goto L44;
                case 1: goto Lc9;
                case 2: goto Leb;
                case 3: goto L281;
                case 4: goto L182;
                default: goto L37a;
            }     // Catch: java.io.IOException -> L3a1
        L44:
            r0 = r6
            com.nide8.login2.internal.org.json.simple.parser.Yytoken r0 = r0.token     // Catch: java.io.IOException -> L3a1
            int r0 = r0.type     // Catch: java.io.IOException -> L3a1
            switch(r0) {
                case 0: goto L68;
                case 1: goto L87;
                case 2: goto Lc1;
                case 3: goto La4;
                default: goto Lc1;
            }     // Catch: java.io.IOException -> L3a1
        L68:
            r0 = r6
            r1 = 1
            r0.status = r1     // Catch: java.io.IOException -> L3a1
            r0 = r9
            r1 = r6
            int r1 = r1.status     // Catch: java.io.IOException -> L3a1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.io.IOException -> L3a1
            r0.addFirst(r1)     // Catch: java.io.IOException -> L3a1
            r0 = r10
            r1 = r6
            com.nide8.login2.internal.org.json.simple.parser.Yytoken r1 = r1.token     // Catch: java.io.IOException -> L3a1
            java.lang.Object r1 = r1.value     // Catch: java.io.IOException -> L3a1
            r0.addFirst(r1)     // Catch: java.io.IOException -> L3a1
            goto L37a
        L87:
            r0 = r6
            r1 = 2
            r0.status = r1     // Catch: java.io.IOException -> L3a1
            r0 = r9
            r1 = r6
            int r1 = r1.status     // Catch: java.io.IOException -> L3a1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.io.IOException -> L3a1
            r0.addFirst(r1)     // Catch: java.io.IOException -> L3a1
            r0 = r10
            r1 = r6
            r2 = r8
            java.util.Map r1 = r1.createObjectContainer(r2)     // Catch: java.io.IOException -> L3a1
            r0.addFirst(r1)     // Catch: java.io.IOException -> L3a1
            goto L37a
        La4:
            r0 = r6
            r1 = 3
            r0.status = r1     // Catch: java.io.IOException -> L3a1
            r0 = r9
            r1 = r6
            int r1 = r1.status     // Catch: java.io.IOException -> L3a1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.io.IOException -> L3a1
            r0.addFirst(r1)     // Catch: java.io.IOException -> L3a1
            r0 = r10
            r1 = r6
            r2 = r8
            java.util.List r1 = r1.createArrayContainer(r2)     // Catch: java.io.IOException -> L3a1
            r0.addFirst(r1)     // Catch: java.io.IOException -> L3a1
            goto L37a
        Lc1:
            r0 = r6
            r1 = -1
            r0.status = r1     // Catch: java.io.IOException -> L3a1
            goto L37a
        Lc9:
            r0 = r6
            com.nide8.login2.internal.org.json.simple.parser.Yytoken r0 = r0.token     // Catch: java.io.IOException -> L3a1
            int r0 = r0.type     // Catch: java.io.IOException -> L3a1
            r1 = -1
            if (r0 != r1) goto Lda
            r0 = r10
            java.lang.Object r0 = r0.removeFirst()     // Catch: java.io.IOException -> L3a1
            return r0
        Lda:
            com.nide8.login2.internal.org.json.simple.parser.ParseException r0 = new com.nide8.login2.internal.org.json.simple.parser.ParseException     // Catch: java.io.IOException -> L3a1
            r1 = r0
            r2 = r6
            int r2 = r2.getPosition()     // Catch: java.io.IOException -> L3a1
            r3 = 1
            r4 = r6
            com.nide8.login2.internal.org.json.simple.parser.Yytoken r4 = r4.token     // Catch: java.io.IOException -> L3a1
            r1.<init>(r2, r3, r4)     // Catch: java.io.IOException -> L3a1
            throw r0     // Catch: java.io.IOException -> L3a1
        Leb:
            r0 = r6
            com.nide8.login2.internal.org.json.simple.parser.Yytoken r0 = r0.token     // Catch: java.io.IOException -> L3a1
            int r0 = r0.type     // Catch: java.io.IOException -> L3a1
            switch(r0) {
                case 0: goto L117;
                case 2: goto L152;
                case 5: goto L114;
                default: goto L17a;
            }     // Catch: java.io.IOException -> L3a1
        L114:
            goto L37a
        L117:
            r0 = r6
            com.nide8.login2.internal.org.json.simple.parser.Yytoken r0 = r0.token     // Catch: java.io.IOException -> L3a1
            java.lang.Object r0 = r0.value     // Catch: java.io.IOException -> L3a1
            boolean r0 = r0 instanceof java.lang.String     // Catch: java.io.IOException -> L3a1
            if (r0 == 0) goto L14a
            r0 = r6
            com.nide8.login2.internal.org.json.simple.parser.Yytoken r0 = r0.token     // Catch: java.io.IOException -> L3a1
            java.lang.Object r0 = r0.value     // Catch: java.io.IOException -> L3a1
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.io.IOException -> L3a1
            r11 = r0
            r0 = r10
            r1 = r11
            r0.addFirst(r1)     // Catch: java.io.IOException -> L3a1
            r0 = r6
            r1 = 4
            r0.status = r1     // Catch: java.io.IOException -> L3a1
            r0 = r9
            r1 = r6
            int r1 = r1.status     // Catch: java.io.IOException -> L3a1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.io.IOException -> L3a1
            r0.addFirst(r1)     // Catch: java.io.IOException -> L3a1
            goto L37a
        L14a:
            r0 = r6
            r1 = -1
            r0.status = r1     // Catch: java.io.IOException -> L3a1
            goto L37a
        L152:
            r0 = r10
            int r0 = r0.size()     // Catch: java.io.IOException -> L3a1
            r1 = 1
            if (r0 <= r1) goto L172
            r0 = r9
            java.lang.Object r0 = r0.removeFirst()     // Catch: java.io.IOException -> L3a1
            r0 = r10
            java.lang.Object r0 = r0.removeFirst()     // Catch: java.io.IOException -> L3a1
            r0 = r6
            r1 = r6
            r2 = r9
            int r1 = r1.peekStatus(r2)     // Catch: java.io.IOException -> L3a1
            r0.status = r1     // Catch: java.io.IOException -> L3a1
            goto L37a
        L172:
            r0 = r6
            r1 = 1
            r0.status = r1     // Catch: java.io.IOException -> L3a1
            goto L37a
        L17a:
            r0 = r6
            r1 = -1
            r0.status = r1     // Catch: java.io.IOException -> L3a1
            goto L37a
        L182:
            r0 = r6
            com.nide8.login2.internal.org.json.simple.parser.Yytoken r0 = r0.token     // Catch: java.io.IOException -> L3a1
            int r0 = r0.type     // Catch: java.io.IOException -> L3a1
            switch(r0) {
                case 0: goto L1b7;
                case 1: goto L233;
                case 2: goto L279;
                case 3: goto L1ed;
                case 4: goto L279;
                case 5: goto L279;
                case 6: goto L1b4;
                default: goto L279;
            }     // Catch: java.io.IOException -> L3a1
        L1b4:
            goto L37a
        L1b7:
            r0 = r9
            java.lang.Object r0 = r0.removeFirst()     // Catch: java.io.IOException -> L3a1
            r0 = r10
            java.lang.Object r0 = r0.removeFirst()     // Catch: java.io.IOException -> L3a1
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.io.IOException -> L3a1
            r11 = r0
            r0 = r10
            java.lang.Object r0 = r0.getFirst()     // Catch: java.io.IOException -> L3a1
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.io.IOException -> L3a1
            r12 = r0
            r0 = r12
            r1 = r11
            r2 = r6
            com.nide8.login2.internal.org.json.simple.parser.Yytoken r2 = r2.token     // Catch: java.io.IOException -> L3a1
            java.lang.Object r2 = r2.value     // Catch: java.io.IOException -> L3a1
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.io.IOException -> L3a1
            r0 = r6
            r1 = r6
            r2 = r9
            int r1 = r1.peekStatus(r2)     // Catch: java.io.IOException -> L3a1
            r0.status = r1     // Catch: java.io.IOException -> L3a1
            goto L37a
        L1ed:
            r0 = r9
            java.lang.Object r0 = r0.removeFirst()     // Catch: java.io.IOException -> L3a1
            r0 = r10
            java.lang.Object r0 = r0.removeFirst()     // Catch: java.io.IOException -> L3a1
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.io.IOException -> L3a1
            r11 = r0
            r0 = r10
            java.lang.Object r0 = r0.getFirst()     // Catch: java.io.IOException -> L3a1
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.io.IOException -> L3a1
            r12 = r0
            r0 = r6
            r1 = r8
            java.util.List r0 = r0.createArrayContainer(r1)     // Catch: java.io.IOException -> L3a1
            r13 = r0
            r0 = r12
            r1 = r11
            r2 = r13
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.io.IOException -> L3a1
            r0 = r6
            r1 = 3
            r0.status = r1     // Catch: java.io.IOException -> L3a1
            r0 = r9
            r1 = r6
            int r1 = r1.status     // Catch: java.io.IOException -> L3a1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.io.IOException -> L3a1
            r0.addFirst(r1)     // Catch: java.io.IOException -> L3a1
            r0 = r10
            r1 = r13
            r0.addFirst(r1)     // Catch: java.io.IOException -> L3a1
            goto L37a
        L233:
            r0 = r9
            java.lang.Object r0 = r0.removeFirst()     // Catch: java.io.IOException -> L3a1
            r0 = r10
            java.lang.Object r0 = r0.removeFirst()     // Catch: java.io.IOException -> L3a1
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.io.IOException -> L3a1
            r11 = r0
            r0 = r10
            java.lang.Object r0 = r0.getFirst()     // Catch: java.io.IOException -> L3a1
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.io.IOException -> L3a1
            r12 = r0
            r0 = r6
            r1 = r8
            java.util.Map r0 = r0.createObjectContainer(r1)     // Catch: java.io.IOException -> L3a1
            r13 = r0
            r0 = r12
            r1 = r11
            r2 = r13
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.io.IOException -> L3a1
            r0 = r6
            r1 = 2
            r0.status = r1     // Catch: java.io.IOException -> L3a1
            r0 = r9
            r1 = r6
            int r1 = r1.status     // Catch: java.io.IOException -> L3a1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.io.IOException -> L3a1
            r0.addFirst(r1)     // Catch: java.io.IOException -> L3a1
            r0 = r10
            r1 = r13
            r0.addFirst(r1)     // Catch: java.io.IOException -> L3a1
            goto L37a
        L279:
            r0 = r6
            r1 = -1
            r0.status = r1     // Catch: java.io.IOException -> L3a1
            goto L37a
        L281:
            r0 = r6
            com.nide8.login2.internal.org.json.simple.parser.Yytoken r0 = r0.token     // Catch: java.io.IOException -> L3a1
            int r0 = r0.type     // Catch: java.io.IOException -> L3a1
            switch(r0) {
                case 0: goto L2b3;
                case 1: goto L2f7;
                case 2: goto L361;
                case 3: goto L32c;
                case 4: goto L2cf;
                case 5: goto L2b0;
                default: goto L361;
            }     // Catch: java.io.IOException -> L3a1
        L2b0:
            goto L37a
        L2b3:
            r0 = r10
            java.lang.Object r0 = r0.getFirst()     // Catch: java.io.IOException -> L3a1
            java.util.List r0 = (java.util.List) r0     // Catch: java.io.IOException -> L3a1
            r11 = r0
            r0 = r11
            r1 = r6
            com.nide8.login2.internal.org.json.simple.parser.Yytoken r1 = r1.token     // Catch: java.io.IOException -> L3a1
            java.lang.Object r1 = r1.value     // Catch: java.io.IOException -> L3a1
            boolean r0 = r0.add(r1)     // Catch: java.io.IOException -> L3a1
            goto L37a
        L2cf:
            r0 = r10
            int r0 = r0.size()     // Catch: java.io.IOException -> L3a1
            r1 = 1
            if (r0 <= r1) goto L2ef
            r0 = r9
            java.lang.Object r0 = r0.removeFirst()     // Catch: java.io.IOException -> L3a1
            r0 = r10
            java.lang.Object r0 = r0.removeFirst()     // Catch: java.io.IOException -> L3a1
            r0 = r6
            r1 = r6
            r2 = r9
            int r1 = r1.peekStatus(r2)     // Catch: java.io.IOException -> L3a1
            r0.status = r1     // Catch: java.io.IOException -> L3a1
            goto L37a
        L2ef:
            r0 = r6
            r1 = 1
            r0.status = r1     // Catch: java.io.IOException -> L3a1
            goto L37a
        L2f7:
            r0 = r10
            java.lang.Object r0 = r0.getFirst()     // Catch: java.io.IOException -> L3a1
            java.util.List r0 = (java.util.List) r0     // Catch: java.io.IOException -> L3a1
            r11 = r0
            r0 = r6
            r1 = r8
            java.util.Map r0 = r0.createObjectContainer(r1)     // Catch: java.io.IOException -> L3a1
            r12 = r0
            r0 = r11
            r1 = r12
            boolean r0 = r0.add(r1)     // Catch: java.io.IOException -> L3a1
            r0 = r6
            r1 = 2
            r0.status = r1     // Catch: java.io.IOException -> L3a1
            r0 = r9
            r1 = r6
            int r1 = r1.status     // Catch: java.io.IOException -> L3a1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.io.IOException -> L3a1
            r0.addFirst(r1)     // Catch: java.io.IOException -> L3a1
            r0 = r10
            r1 = r12
            r0.addFirst(r1)     // Catch: java.io.IOException -> L3a1
            goto L37a
        L32c:
            r0 = r10
            java.lang.Object r0 = r0.getFirst()     // Catch: java.io.IOException -> L3a1
            java.util.List r0 = (java.util.List) r0     // Catch: java.io.IOException -> L3a1
            r11 = r0
            r0 = r6
            r1 = r8
            java.util.List r0 = r0.createArrayContainer(r1)     // Catch: java.io.IOException -> L3a1
            r12 = r0
            r0 = r11
            r1 = r12
            boolean r0 = r0.add(r1)     // Catch: java.io.IOException -> L3a1
            r0 = r6
            r1 = 3
            r0.status = r1     // Catch: java.io.IOException -> L3a1
            r0 = r9
            r1 = r6
            int r1 = r1.status     // Catch: java.io.IOException -> L3a1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.io.IOException -> L3a1
            r0.addFirst(r1)     // Catch: java.io.IOException -> L3a1
            r0 = r10
            r1 = r12
            r0.addFirst(r1)     // Catch: java.io.IOException -> L3a1
            goto L37a
        L361:
            r0 = r6
            r1 = -1
            r0.status = r1     // Catch: java.io.IOException -> L3a1
            goto L37a
        L369:
            com.nide8.login2.internal.org.json.simple.parser.ParseException r0 = new com.nide8.login2.internal.org.json.simple.parser.ParseException     // Catch: java.io.IOException -> L3a1
            r1 = r0
            r2 = r6
            int r2 = r2.getPosition()     // Catch: java.io.IOException -> L3a1
            r3 = 1
            r4 = r6
            com.nide8.login2.internal.org.json.simple.parser.Yytoken r4 = r4.token     // Catch: java.io.IOException -> L3a1
            r1.<init>(r2, r3, r4)     // Catch: java.io.IOException -> L3a1
            throw r0     // Catch: java.io.IOException -> L3a1
        L37a:
            r0 = r6
            int r0 = r0.status     // Catch: java.io.IOException -> L3a1
            r1 = -1
            if (r0 != r1) goto L393
            com.nide8.login2.internal.org.json.simple.parser.ParseException r0 = new com.nide8.login2.internal.org.json.simple.parser.ParseException     // Catch: java.io.IOException -> L3a1
            r1 = r0
            r2 = r6
            int r2 = r2.getPosition()     // Catch: java.io.IOException -> L3a1
            r3 = 1
            r4 = r6
            com.nide8.login2.internal.org.json.simple.parser.Yytoken r4 = r4.token     // Catch: java.io.IOException -> L3a1
            r1.<init>(r2, r3, r4)     // Catch: java.io.IOException -> L3a1
            throw r0     // Catch: java.io.IOException -> L3a1
        L393:
            r0 = r6
            com.nide8.login2.internal.org.json.simple.parser.Yytoken r0 = r0.token     // Catch: java.io.IOException -> L3a1
            int r0 = r0.type     // Catch: java.io.IOException -> L3a1
            r1 = -1
            if (r0 != r1) goto L16
            goto L3a6
        L3a1:
            r11 = move-exception
            r0 = r11
            throw r0
        L3a6:
            com.nide8.login2.internal.org.json.simple.parser.ParseException r0 = new com.nide8.login2.internal.org.json.simple.parser.ParseException
            r1 = r0
            r2 = r6
            int r2 = r2.getPosition()
            r3 = 1
            r4 = r6
            com.nide8.login2.internal.org.json.simple.parser.Yytoken r4 = r4.token
            r1.<init>(r2, r3, r4)
            throw r0
    }

    private void nextToken() throws com.nide8.login2.internal.org.json.simple.parser.ParseException, java.io.IOException {
            r6 = this;
            r0 = r6
            r1 = r6
            com.nide8.login2.internal.org.json.simple.parser.Yylex r1 = r1.lexer
            com.nide8.login2.internal.org.json.simple.parser.Yytoken r1 = r1.yylex()
            r0.token = r1
            r0 = r6
            com.nide8.login2.internal.org.json.simple.parser.Yytoken r0 = r0.token
            if (r0 != 0) goto L1f
            r0 = r6
            com.nide8.login2.internal.org.json.simple.parser.Yytoken r1 = new com.nide8.login2.internal.org.json.simple.parser.Yytoken
            r2 = r1
            r3 = -1
            r4 = 0
            r2.<init>(r3, r4)
            r0.token = r1
        L1f:
            return
    }

    private java.util.Map<java.lang.String, java.lang.Object> createObjectContainer(com.nide8.login2.internal.org.json.simple.parser.ContainerFactory r4) {
            r3 = this;
            r0 = r4
            if (r0 != 0) goto Lc
            com.nide8.login2.internal.org.json.simple.JSONObject r0 = new com.nide8.login2.internal.org.json.simple.JSONObject
            r1 = r0
            r1.<init>()
            return r0
        Lc:
            r0 = r4
            java.util.Map r0 = r0.createObjectContainer()
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L1f
            com.nide8.login2.internal.org.json.simple.JSONObject r0 = new com.nide8.login2.internal.org.json.simple.JSONObject
            r1 = r0
            r1.<init>()
            return r0
        L1f:
            r0 = r5
            return r0
    }

    private java.util.List<java.lang.Object> createArrayContainer(com.nide8.login2.internal.org.json.simple.parser.ContainerFactory r4) {
            r3 = this;
            r0 = r4
            if (r0 != 0) goto Lc
            com.nide8.login2.internal.org.json.simple.JSONArray r0 = new com.nide8.login2.internal.org.json.simple.JSONArray
            r1 = r0
            r1.<init>()
            return r0
        Lc:
            r0 = r4
            java.util.List r0 = r0.creatArrayContainer()
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L1f
            com.nide8.login2.internal.org.json.simple.JSONArray r0 = new com.nide8.login2.internal.org.json.simple.JSONArray
            r1 = r0
            r1.<init>()
            return r0
        L1f:
            r0 = r5
            return r0
    }

    public void parse(java.lang.String r6, com.nide8.login2.internal.org.json.simple.parser.ContentHandler r7) throws com.nide8.login2.internal.org.json.simple.parser.ParseException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = 0
            r0.parse(r1, r2, r3)
            return
    }

    public void parse(java.lang.String r7, com.nide8.login2.internal.org.json.simple.parser.ContentHandler r8, boolean r9) throws com.nide8.login2.internal.org.json.simple.parser.ParseException {
            r6 = this;
            java.io.StringReader r0 = new java.io.StringReader
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            r10 = r0
            r0 = r6
            r1 = r10
            r2 = r8
            r3 = r9
            r0.parse(r1, r2, r3)     // Catch: java.io.IOException -> L15
            goto L23
        L15:
            r11 = move-exception
            com.nide8.login2.internal.org.json.simple.parser.ParseException r0 = new com.nide8.login2.internal.org.json.simple.parser.ParseException
            r1 = r0
            r2 = -1
            r3 = 2
            r4 = r11
            r1.<init>(r2, r3, r4)
            throw r0
        L23:
            return
    }

    public void parse(java.io.Reader r6, com.nide8.login2.internal.org.json.simple.parser.ContentHandler r7) throws java.io.IOException, com.nide8.login2.internal.org.json.simple.parser.ParseException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = 0
            r0.parse(r1, r2, r3)
            return
    }

    public void parse(java.io.Reader r7, com.nide8.login2.internal.org.json.simple.parser.ContentHandler r8, boolean r9) throws java.io.IOException, com.nide8.login2.internal.org.json.simple.parser.ParseException {
            r6 = this;
            r0 = r9
            if (r0 != 0) goto L17
            r0 = r6
            r1 = r7
            r0.reset(r1)
            r0 = r6
            java.util.LinkedList r1 = new java.util.LinkedList
            r2 = r1
            r2.<init>()
            r0.handlerStatusStack = r1
            goto L30
        L17:
            r0 = r6
            java.util.LinkedList<java.lang.Integer> r0 = r0.handlerStatusStack
            if (r0 != 0) goto L30
            r0 = 0
            r9 = r0
            r0 = r6
            r1 = r7
            r0.reset(r1)
            r0 = r6
            java.util.LinkedList r1 = new java.util.LinkedList
            r2 = r1
            r2.<init>()
            r0.handlerStatusStack = r1
        L30:
            r0 = r6
            java.util.LinkedList<java.lang.Integer> r0 = r0.handlerStatusStack
            r10 = r0
        L36:
            r0 = r6
            int r0 = r0.status     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            switch(r0) {
                case -1: goto L356;
                case 0: goto L68;
                case 1: goto Lf8;
                case 2: goto L12a;
                case 3: goto L2a8;
                case 4: goto L1cf;
                case 5: goto L28e;
                case 6: goto L355;
                default: goto L367;
            }     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
        L68:
            r0 = r8
            r0.startJSON()     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0 = r6
            r0.nextToken()     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0 = r6
            com.nide8.login2.internal.org.json.simple.parser.Yytoken r0 = r0.token     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            int r0 = r0.type     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            switch(r0) {
                case 0: goto L98;
                case 1: goto Lba;
                case 2: goto Lf0;
                case 3: goto Ld5;
                default: goto Lf0;
            }     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
        L98:
            r0 = r6
            r1 = 1
            r0.status = r1     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0 = r10
            r1 = r6
            int r1 = r1.status     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0.addFirst(r1)     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0 = r8
            r1 = r6
            com.nide8.login2.internal.org.json.simple.parser.Yytoken r1 = r1.token     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            java.lang.Object r1 = r1.value     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            boolean r0 = r0.primitive(r1)     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            if (r0 != 0) goto L367
            return
        Lba:
            r0 = r6
            r1 = 2
            r0.status = r1     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0 = r10
            r1 = r6
            int r1 = r1.status     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0.addFirst(r1)     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0 = r8
            boolean r0 = r0.startObject()     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            if (r0 != 0) goto L367
            return
        Ld5:
            r0 = r6
            r1 = 3
            r0.status = r1     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0 = r10
            r1 = r6
            int r1 = r1.status     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0.addFirst(r1)     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0 = r8
            boolean r0 = r0.startArray()     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            if (r0 != 0) goto L367
            return
        Lf0:
            r0 = r6
            r1 = -1
            r0.status = r1     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            goto L367
        Lf8:
            r0 = r6
            r0.nextToken()     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0 = r6
            com.nide8.login2.internal.org.json.simple.parser.Yytoken r0 = r0.token     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            int r0 = r0.type     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r1 = -1
            if (r0 != r1) goto L114
            r0 = r8
            r0.endJSON()     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0 = r6
            r1 = 6
            r0.status = r1     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            return
        L114:
            r0 = r6
            r1 = -1
            r0.status = r1     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            com.nide8.login2.internal.org.json.simple.parser.ParseException r0 = new com.nide8.login2.internal.org.json.simple.parser.ParseException     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r1 = r0
            r2 = r6
            int r2 = r2.getPosition()     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r3 = 1
            r4 = r6
            com.nide8.login2.internal.org.json.simple.parser.Yytoken r4 = r4.token     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r1.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            throw r0     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
        L12a:
            r0 = r6
            r0.nextToken()     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0 = r6
            com.nide8.login2.internal.org.json.simple.parser.Yytoken r0 = r0.token     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            int r0 = r0.type     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            switch(r0) {
                case 0: goto L15b;
                case 2: goto L19c;
                case 5: goto L158;
                default: goto L1c7;
            }     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
        L158:
            goto L367
        L15b:
            r0 = r6
            com.nide8.login2.internal.org.json.simple.parser.Yytoken r0 = r0.token     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            java.lang.Object r0 = r0.value     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            boolean r0 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            if (r0 == 0) goto L194
            r0 = r6
            com.nide8.login2.internal.org.json.simple.parser.Yytoken r0 = r0.token     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            java.lang.Object r0 = r0.value     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r11 = r0
            r0 = r6
            r1 = 4
            r0.status = r1     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0 = r10
            r1 = r6
            int r1 = r1.status     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0.addFirst(r1)     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0 = r8
            r1 = r11
            boolean r0 = r0.startObjectEntry(r1)     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            if (r0 != 0) goto L191
            return
        L191:
            goto L367
        L194:
            r0 = r6
            r1 = -1
            r0.status = r1     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            goto L367
        L19c:
            r0 = r10
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r1 = 1
            if (r0 <= r1) goto L1b8
            r0 = r10
            java.lang.Object r0 = r0.removeFirst()     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0 = r6
            r1 = r6
            r2 = r10
            int r1 = r1.peekStatus(r2)     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0.status = r1     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            goto L1bd
        L1b8:
            r0 = r6
            r1 = 1
            r0.status = r1     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
        L1bd:
            r0 = r8
            boolean r0 = r0.endObject()     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            if (r0 != 0) goto L367
            return
        L1c7:
            r0 = r6
            r1 = -1
            r0.status = r1     // Catch: java.lang.Throwable -> L38e
            goto L367
        L1cf:
            r0 = r6
            r0.nextToken()     // Catch: java.lang.Throwable -> L38e
            r0 = r6
            com.nide8.login2.internal.org.json.simple.parser.Yytoken r0 = r0.token     // Catch: java.lang.Throwable -> L38e
            int r0 = r0.type     // Catch: java.lang.Throwable -> L38e
            switch(r0) {
                case 0: goto L207;
                case 1: goto L25c;
                case 2: goto L286;
                case 3: goto L232;
                case 4: goto L286;
                case 5: goto L286;
                case 6: goto L204;
                default: goto L286;
            }     // Catch: java.lang.Throwable -> L38e
        L204:
            goto L367
        L207:
            r0 = r10
            java.lang.Object r0 = r0.removeFirst()     // Catch: java.lang.Throwable -> L38e
            r0 = r6
            r1 = r6
            r2 = r10
            int r1 = r1.peekStatus(r2)     // Catch: java.lang.Throwable -> L38e
            r0.status = r1     // Catch: java.lang.Throwable -> L38e
            r0 = r8
            r1 = r6
            com.nide8.login2.internal.org.json.simple.parser.Yytoken r1 = r1.token     // Catch: java.lang.Throwable -> L38e
            java.lang.Object r1 = r1.value     // Catch: java.lang.Throwable -> L38e
            boolean r0 = r0.primitive(r1)     // Catch: java.lang.Throwable -> L38e
            if (r0 != 0) goto L228
            return
        L228:
            r0 = r8
            boolean r0 = r0.endObjectEntry()     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            if (r0 != 0) goto L367
            return
        L232:
            r0 = r10
            java.lang.Object r0 = r0.removeFirst()     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0 = r10
            r1 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0.addFirst(r1)     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0 = r6
            r1 = 3
            r0.status = r1     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0 = r10
            r1 = r6
            int r1 = r1.status     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0.addFirst(r1)     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0 = r8
            boolean r0 = r0.startArray()     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            if (r0 != 0) goto L367
            return
        L25c:
            r0 = r10
            java.lang.Object r0 = r0.removeFirst()     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0 = r10
            r1 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0.addFirst(r1)     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0 = r6
            r1 = 2
            r0.status = r1     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0 = r10
            r1 = r6
            int r1 = r1.status     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0.addFirst(r1)     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0 = r8
            boolean r0 = r0.startObject()     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            if (r0 != 0) goto L367
            return
        L286:
            r0 = r6
            r1 = -1
            r0.status = r1     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            goto L367
        L28e:
            r0 = r10
            java.lang.Object r0 = r0.removeFirst()     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0 = r6
            r1 = r6
            r2 = r10
            int r1 = r1.peekStatus(r2)     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0.status = r1     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0 = r8
            boolean r0 = r0.endObjectEntry()     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            if (r0 != 0) goto L367
            return
        L2a8:
            r0 = r6
            r0.nextToken()     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0 = r6
            com.nide8.login2.internal.org.json.simple.parser.Yytoken r0 = r0.token     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            int r0 = r0.type     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            switch(r0) {
                case 0: goto L2db;
                case 1: goto L317;
                case 2: goto L34d;
                case 3: goto L332;
                case 4: goto L2ec;
                case 5: goto L2d8;
                default: goto L34d;
            }     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
        L2d8:
            goto L367
        L2db:
            r0 = r8
            r1 = r6
            com.nide8.login2.internal.org.json.simple.parser.Yytoken r1 = r1.token     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            java.lang.Object r1 = r1.value     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            boolean r0 = r0.primitive(r1)     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            if (r0 != 0) goto L367
            return
        L2ec:
            r0 = r10
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r1 = 1
            if (r0 <= r1) goto L308
            r0 = r10
            java.lang.Object r0 = r0.removeFirst()     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0 = r6
            r1 = r6
            r2 = r10
            int r1 = r1.peekStatus(r2)     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0.status = r1     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            goto L30d
        L308:
            r0 = r6
            r1 = 1
            r0.status = r1     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
        L30d:
            r0 = r8
            boolean r0 = r0.endArray()     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            if (r0 != 0) goto L367
            return
        L317:
            r0 = r6
            r1 = 2
            r0.status = r1     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0 = r10
            r1 = r6
            int r1 = r1.status     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0.addFirst(r1)     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0 = r8
            boolean r0 = r0.startObject()     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            if (r0 != 0) goto L367
            return
        L332:
            r0 = r6
            r1 = 3
            r0.status = r1     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0 = r10
            r1 = r6
            int r1 = r1.status     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0.addFirst(r1)     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r0 = r8
            boolean r0 = r0.startArray()     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            if (r0 != 0) goto L367
            return
        L34d:
            r0 = r6
            r1 = -1
            r0.status = r1     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            goto L367
        L355:
            return
        L356:
            com.nide8.login2.internal.org.json.simple.parser.ParseException r0 = new com.nide8.login2.internal.org.json.simple.parser.ParseException     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r1 = r0
            r2 = r6
            int r2 = r2.getPosition()     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r3 = 1
            r4 = r6
            com.nide8.login2.internal.org.json.simple.parser.Yytoken r4 = r4.token     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r1.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            throw r0     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
        L367:
            r0 = r6
            int r0 = r0.status     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r1 = -1
            if (r0 != r1) goto L380
            com.nide8.login2.internal.org.json.simple.parser.ParseException r0 = new com.nide8.login2.internal.org.json.simple.parser.ParseException     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r1 = r0
            r2 = r6
            int r2 = r2.getPosition()     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r3 = 1
            r4 = r6
            com.nide8.login2.internal.org.json.simple.parser.Yytoken r4 = r4.token     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r1.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            throw r0     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
        L380:
            r0 = r6
            com.nide8.login2.internal.org.json.simple.parser.Yytoken r0 = r0.token     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            int r0 = r0.type     // Catch: java.lang.Throwable -> L38e java.lang.Throwable -> L38e
            r1 = -1
            if (r0 != r1) goto L36
            goto L398
        L38e:
            r11 = move-exception
            r0 = r6
            r1 = -1
            r0.status = r1
            r0 = r11
            throw r0
        L398:
            r0 = r6
            r1 = -1
            r0.status = r1
            com.nide8.login2.internal.org.json.simple.parser.ParseException r0 = new com.nide8.login2.internal.org.json.simple.parser.ParseException
            r1 = r0
            r2 = r6
            int r2 = r2.getPosition()
            r3 = 1
            r4 = r6
            com.nide8.login2.internal.org.json.simple.parser.Yytoken r4 = r4.token
            r1.<init>(r2, r3, r4)
            throw r0
    }
}
