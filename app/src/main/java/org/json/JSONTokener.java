package org.json;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/forge_installer.jar:org/json/JSONTokener.class */
public class JSONTokener {
    private long character;
    private boolean eof;
    private long index;
    private long line;
    private char previous;
    private final java.io.Reader reader;
    private boolean usePrevious;
    private long characterPreviousLine;

    public JSONTokener(java.io.Reader r6) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            r1 = r6
            boolean r1 = r1.markSupported()
            if (r1 == 0) goto L10
            r1 = r6
            goto L18
        L10:
            java.io.BufferedReader r1 = new java.io.BufferedReader
            r2 = r1
            r3 = r6
            r2.<init>(r3)
        L18:
            r0.reader = r1
            r0 = r5
            r1 = 0
            r0.eof = r1
            r0 = r5
            r1 = 0
            r0.usePrevious = r1
            r0 = r5
            r1 = 0
            r0.previous = r1
            r0 = r5
            r1 = 0
            r0.index = r1
            r0 = r5
            r1 = 1
            r0.character = r1
            r0 = r5
            r1 = 0
            r0.characterPreviousLine = r1
            r0 = r5
            r1 = 1
            r0.line = r1
            return
    }

    public JSONTokener(java.io.InputStream r7) {
            r6 = this;
            r0 = r6
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            r2 = r1
            r3 = r7
            java.lang.String r4 = "UTF-8"
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)
            r2.<init>(r3, r4)
            r0.<init>(r1)
            return
    }

    public JSONTokener(java.lang.String r6) {
            r5 = this;
            r0 = r5
            java.io.StringReader r1 = new java.io.StringReader
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            r0.<init>(r1)
            return
    }

    public void back() throws org.json.JSONException {
            r5 = this;
            r0 = r5
            boolean r0 = r0.usePrevious
            if (r0 != 0) goto L10
            r0 = r5
            long r0 = r0.index
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L1a
        L10:
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.String r2 = "Stepping back two steps is not supported"
            r1.<init>(r2)
            throw r0
        L1a:
            r0 = r5
            r0.decrementIndexes()
            r0 = r5
            r1 = 1
            r0.usePrevious = r1
            r0 = r5
            r1 = 0
            r0.eof = r1
            return
    }

    private void decrementIndexes() {
            r6 = this;
            r0 = r6
            r1 = r0
            long r1 = r1.index
            r2 = 1
            long r1 = r1 - r2
            r0.index = r1
            r0 = r6
            char r0 = r0.previous
            r1 = 13
            if (r0 == r1) goto L1c
            r0 = r6
            char r0 = r0.previous
            r1 = 10
            if (r0 != r1) goto L31
        L1c:
            r0 = r6
            r1 = r0
            long r1 = r1.line
            r2 = 1
            long r1 = r1 - r2
            r0.line = r1
            r0 = r6
            r1 = r6
            long r1 = r1.characterPreviousLine
            r0.character = r1
            goto L44
        L31:
            r0 = r6
            long r0 = r0.character
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L44
            r0 = r6
            r1 = r0
            long r1 = r1.character
            r2 = 1
            long r1 = r1 - r2
            r0.character = r1
        L44:
            return
    }

    public static int dehexchar(char r3) {
            r0 = r3
            r1 = 48
            if (r0 < r1) goto L11
            r0 = r3
            r1 = 57
            if (r0 > r1) goto L11
            r0 = r3
            r1 = 48
            int r0 = r0 - r1
            return r0
        L11:
            r0 = r3
            r1 = 65
            if (r0 < r1) goto L22
            r0 = r3
            r1 = 70
            if (r0 > r1) goto L22
            r0 = r3
            r1 = 55
            int r0 = r0 - r1
            return r0
        L22:
            r0 = r3
            r1 = 97
            if (r0 < r1) goto L33
            r0 = r3
            r1 = 102(0x66, float:1.43E-43)
            if (r0 > r1) goto L33
            r0 = r3
            r1 = 87
            int r0 = r0 - r1
            return r0
        L33:
            r0 = -1
            return r0
    }

    public boolean end() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.eof
            if (r0 == 0) goto L12
            r0 = r2
            boolean r0 = r0.usePrevious
            if (r0 != 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    public boolean more() throws org.json.JSONException {
            r5 = this;
            r0 = r5
            boolean r0 = r0.usePrevious
            if (r0 == 0) goto L9
            r0 = 1
            return r0
        L9:
            r0 = r5
            java.io.Reader r0 = r0.reader     // Catch: java.io.IOException -> L14
            r1 = 1
            r0.mark(r1)     // Catch: java.io.IOException -> L14
            goto L20
        L14:
            r6 = move-exception
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.String r2 = "Unable to preserve stream position"
            r3 = r6
            r1.<init>(r2, r3)
            throw r0
        L20:
            r0 = r5
            java.io.Reader r0 = r0.reader     // Catch: java.io.IOException -> L3b
            int r0 = r0.read()     // Catch: java.io.IOException -> L3b
            if (r0 > 0) goto L31
            r0 = r5
            r1 = 1
            r0.eof = r1     // Catch: java.io.IOException -> L3b
            r0 = 0
            return r0
        L31:
            r0 = r5
            java.io.Reader r0 = r0.reader     // Catch: java.io.IOException -> L3b
            r0.reset()     // Catch: java.io.IOException -> L3b
            goto L47
        L3b:
            r6 = move-exception
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.String r2 = "Unable to read the next character from the stream"
            r3 = r6
            r1.<init>(r2, r3)
            throw r0
        L47:
            r0 = 1
            return r0
    }

    public char next() throws org.json.JSONException {
            r4 = this;
            r0 = r4
            boolean r0 = r0.usePrevious
            if (r0 == 0) goto L14
            r0 = r4
            r1 = 0
            r0.usePrevious = r1
            r0 = r4
            char r0 = r0.previous
            r5 = r0
            goto L29
        L14:
            r0 = r4
            java.io.Reader r0 = r0.reader     // Catch: java.io.IOException -> L1f
            int r0 = r0.read()     // Catch: java.io.IOException -> L1f
            r5 = r0
            goto L29
        L1f:
            r6 = move-exception
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            throw r0
        L29:
            r0 = r5
            if (r0 > 0) goto L34
            r0 = r4
            r1 = 1
            r0.eof = r1
            r0 = 0
            return r0
        L34:
            r0 = r4
            r1 = r5
            r0.incrementIndexes(r1)
            r0 = r4
            r1 = r5
            char r1 = (char) r1
            r0.previous = r1
            r0 = r4
            char r0 = r0.previous
            return r0
    }

    protected char getPrevious() {
            r2 = this;
            r0 = r2
            char r0 = r0.previous
            return r0
    }

    private void incrementIndexes(int r7) {
            r6 = this;
            r0 = r7
            if (r0 <= 0) goto L61
            r0 = r6
            r1 = r0
            long r1 = r1.index
            r2 = 1
            long r1 = r1 + r2
            r0.index = r1
            r0 = r7
            r1 = 13
            if (r0 != r1) goto L2e
            r0 = r6
            r1 = r0
            long r1 = r1.line
            r2 = 1
            long r1 = r1 + r2
            r0.line = r1
            r0 = r6
            r1 = r6
            long r1 = r1.character
            r0.characterPreviousLine = r1
            r0 = r6
            r1 = 0
            r0.character = r1
            goto L61
        L2e:
            r0 = r7
            r1 = 10
            if (r0 != r1) goto L57
            r0 = r6
            char r0 = r0.previous
            r1 = 13
            if (r0 == r1) goto L4f
            r0 = r6
            r1 = r0
            long r1 = r1.line
            r2 = 1
            long r1 = r1 + r2
            r0.line = r1
            r0 = r6
            r1 = r6
            long r1 = r1.character
            r0.characterPreviousLine = r1
        L4f:
            r0 = r6
            r1 = 0
            r0.character = r1
            goto L61
        L57:
            r0 = r6
            r1 = r0
            long r1 = r1.character
            r2 = 1
            long r1 = r1 + r2
            r0.character = r1
        L61:
            return
    }

    public char next(char r5) throws org.json.JSONException {
            r4 = this;
            r0 = r4
            char r0 = r0.next()
            r6 = r0
            r0 = r6
            r1 = r5
            if (r0 == r1) goto L51
            r0 = r6
            if (r0 <= 0) goto L34
            r0 = r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Expected '"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r5
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "' and instead saw '"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "'"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L34:
            r0 = r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Expected '"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r5
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "' and instead saw ''"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L51:
            r0 = r6
            return r0
    }

    public java.lang.String next(int r5) throws org.json.JSONException {
            r4 = this;
            r0 = r5
            if (r0 != 0) goto L7
            java.lang.String r0 = ""
            return r0
        L7:
            r0 = r5
            char[] r0 = new char[r0]
            r6 = r0
            r0 = 0
            r7 = r0
        Ld:
            r0 = r7
            r1 = r5
            if (r0 >= r1) goto L2d
            r0 = r6
            r1 = r7
            r2 = r4
            char r2 = r2.next()
            r0[r1] = r2
            r0 = r4
            boolean r0 = r0.end()
            if (r0 == 0) goto L27
            r0 = r4
            java.lang.String r1 = "Substring bounds error"
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L27:
            int r7 = r7 + 1
            goto Ld
        L2d:
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            return r0
    }

    public char nextClean() throws org.json.JSONException {
            r3 = this;
        L0:
            r0 = r3
            char r0 = r0.next()
            r4 = r0
            r0 = r4
            if (r0 == 0) goto Lf
            r0 = r4
            r1 = 32
            if (r0 <= r1) goto L11
        Lf:
            r0 = r4
            return r0
        L11:
            goto L0
    }

    public java.lang.String nextString(char r5) throws org.json.JSONException {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r7 = r0
        L8:
            r0 = r4
            char r0 = r0.next()
            r6 = r0
            r0 = r6
            switch(r0) {
                case 0: goto L38;
                case 10: goto L38;
                case 13: goto L38;
                case 92: goto L3f;
                default: goto L100;
            }
        L38:
            r0 = r4
            java.lang.String r1 = "Unterminated string"
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L3f:
            r0 = r4
            char r0 = r0.next()
            r6 = r0
            r0 = r6
            switch(r0) {
                case 34: goto Lf0;
                case 39: goto Lf0;
                case 47: goto Lf0;
                case 92: goto Lf0;
                case 98: goto La0;
                case 102: goto Lbe;
                case 110: goto Lb4;
                case 114: goto Lc8;
                case 116: goto Laa;
                case 117: goto Ld2;
                default: goto Lf9;
            }
        La0:
            r0 = r7
            r1 = 8
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L8
        Laa:
            r0 = r7
            r1 = 9
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L8
        Lb4:
            r0 = r7
            r1 = 10
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L8
        Lbe:
            r0 = r7
            r1 = 12
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L8
        Lc8:
            r0 = r7
            r1 = 13
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L8
        Ld2:
            r0 = r7
            r1 = r4
            r2 = 4
            java.lang.String r1 = r1.next(r2)     // Catch: java.lang.NumberFormatException -> Le5
            r2 = 16
            int r1 = java.lang.Integer.parseInt(r1, r2)     // Catch: java.lang.NumberFormatException -> Le5
            char r1 = (char) r1     // Catch: java.lang.NumberFormatException -> Le5
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.NumberFormatException -> Le5
            goto L8
        Le5:
            r8 = move-exception
            r0 = r4
            java.lang.String r1 = "Illegal escape."
            r2 = r8
            org.json.JSONException r0 = r0.syntaxError(r1, r2)
            throw r0
        Lf0:
            r0 = r7
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L8
        Lf9:
            r0 = r4
            java.lang.String r1 = "Illegal escape."
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L100:
            r0 = r6
            r1 = r5
            if (r0 != r1) goto L10a
            r0 = r7
            java.lang.String r0 = r0.toString()
            return r0
        L10a:
            r0 = r7
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L8
    }

    public java.lang.String nextTo(char r4) throws org.json.JSONException {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r5 = r0
        L8:
            r0 = r3
            char r0 = r0.next()
            r6 = r0
            r0 = r6
            r1 = r4
            if (r0 == r1) goto L22
            r0 = r6
            if (r0 == 0) goto L22
            r0 = r6
            r1 = 10
            if (r0 == r1) goto L22
            r0 = r6
            r1 = 13
            if (r0 != r1) goto L32
        L22:
            r0 = r6
            if (r0 == 0) goto L2a
            r0 = r3
            r0.back()
        L2a:
            r0 = r5
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            return r0
        L32:
            r0 = r5
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L8
    }

    public java.lang.String nextTo(java.lang.String r4) throws org.json.JSONException {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r6 = r0
        L8:
            r0 = r3
            char r0 = r0.next()
            r5 = r0
            r0 = r4
            r1 = r5
            int r0 = r0.indexOf(r1)
            if (r0 >= 0) goto L25
            r0 = r5
            if (r0 == 0) goto L25
            r0 = r5
            r1 = 10
            if (r0 == r1) goto L25
            r0 = r5
            r1 = 13
            if (r0 != r1) goto L35
        L25:
            r0 = r5
            if (r0 == 0) goto L2d
            r0 = r3
            r0.back()
        L2d:
            r0 = r6
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            return r0
        L35:
            r0 = r6
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L8
    }

    public java.lang.Object nextValue() throws org.json.JSONException {
            r5 = this;
            r0 = r5
            char r0 = r0.nextClean()
            r6 = r0
            r0 = r6
            switch(r0) {
                case 34: goto L30;
                case 39: goto L30;
                case 91: goto L4f;
                case 123: goto L36;
                default: goto L68;
            }
        L30:
            r0 = r5
            r1 = r6
            java.lang.String r0 = r0.nextString(r1)
            return r0
        L36:
            r0 = r5
            r0.back()
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.StackOverflowError -> L43
            r1 = r0
            r2 = r5
            r1.<init>(r2)     // Catch: java.lang.StackOverflowError -> L43
            return r0
        L43:
            r8 = move-exception
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.String r2 = "JSON Array or Object depth too large to process."
            r3 = r8
            r1.<init>(r2, r3)
            throw r0
        L4f:
            r0 = r5
            r0.back()
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.StackOverflowError -> L5c
            r1 = r0
            r2 = r5
            r1.<init>(r2)     // Catch: java.lang.StackOverflowError -> L5c
            return r0
        L5c:
            r8 = move-exception
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.String r2 = "JSON Array or Object depth too large to process."
            r3 = r8
            r1.<init>(r2, r3)
            throw r0
        L68:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r8 = r0
        L70:
            r0 = r6
            r1 = 32
            if (r0 < r1) goto L8d
            java.lang.String r0 = ",:]}/\\\"[{;=#"
            r1 = r6
            int r0 = r0.indexOf(r1)
            if (r0 >= 0) goto L8d
            r0 = r8
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            char r0 = r0.next()
            r6 = r0
            goto L70
        L8d:
            r0 = r5
            boolean r0 = r0.eof
            if (r0 != 0) goto L98
            r0 = r5
            r0.back()
        L98:
            r0 = r8
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            r7 = r0
            java.lang.String r0 = ""
            r1 = r7
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb0
            r0 = r5
            java.lang.String r1 = "Missing value"
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        Lb0:
            r0 = r7
            java.lang.Object r0 = org.json.JSONObject.stringToValue(r0)
            return r0
    }

    public char skipTo(char r5) throws org.json.JSONException {
            r4 = this;
            r0 = r4
            long r0 = r0.index     // Catch: java.io.IOException -> L4d
            r7 = r0
            r0 = r4
            long r0 = r0.character     // Catch: java.io.IOException -> L4d
            r9 = r0
            r0 = r4
            long r0 = r0.line     // Catch: java.io.IOException -> L4d
            r11 = r0
            r0 = r4
            java.io.Reader r0 = r0.reader     // Catch: java.io.IOException -> L4d
            r1 = 1000000(0xf4240, float:1.401298E-39)
            r0.mark(r1)     // Catch: java.io.IOException -> L4d
        L1a:
            r0 = r4
            char r0 = r0.next()     // Catch: java.io.IOException -> L4d
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L3d
            r0 = r4
            java.io.Reader r0 = r0.reader     // Catch: java.io.IOException -> L4d
            r0.reset()     // Catch: java.io.IOException -> L4d
            r0 = r4
            r1 = r7
            r0.index = r1     // Catch: java.io.IOException -> L4d
            r0 = r4
            r1 = r9
            r0.character = r1     // Catch: java.io.IOException -> L4d
            r0 = r4
            r1 = r11
            r0.line = r1     // Catch: java.io.IOException -> L4d
            r0 = 0
            return r0
        L3d:
            r0 = r6
            r1 = r5
            if (r0 != r1) goto L1a
            r0 = r4
            java.io.Reader r0 = r0.reader     // Catch: java.io.IOException -> L4d
            r1 = 1
            r0.mark(r1)     // Catch: java.io.IOException -> L4d
            goto L57
        L4d:
            r7 = move-exception
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            throw r0
        L57:
            r0 = r4
            r0.back()
            r0 = r6
            return r0
    }

    public org.json.JSONException syntaxError(java.lang.String r6) {
            r5 = this;
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            return r0
    }

    public org.json.JSONException syntaxError(java.lang.String r6, java.lang.Throwable r7) {
            r5 = this;
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = " at "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            long r1 = r1.index
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " [character "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            long r1 = r1.character
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " line "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            long r1 = r1.line
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void close() throws java.io.IOException {
            r2 = this;
            r0 = r2
            java.io.Reader r0 = r0.reader
            if (r0 == 0) goto Le
            r0 = r2
            java.io.Reader r0 = r0.reader
            r0.close()
        Le:
            return
    }
}
