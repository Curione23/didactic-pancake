package com.nide8.login2.internal.org.json.simple.parser;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/nide8auth.jar:com/nide8/login2/internal/org/json/simple/parser/ParseException.class */
public class ParseException extends java.lang.Exception {
    private static final long serialVersionUID = -7880698968187728547L;
    public static final int ERROR_UNEXPECTED_CHAR = 0;
    public static final int ERROR_UNEXPECTED_TOKEN = 1;
    public static final int ERROR_UNEXPECTED_EXCEPTION = 2;
    private int errorType;
    private java.lang.Object unexpectedObject;
    private int position;

    public ParseException(int r6) {
            r5 = this;
            r0 = r5
            r1 = -1
            r2 = r6
            r3 = 0
            r0.<init>(r1, r2, r3)
            return
    }

    public ParseException(int r6, java.lang.Object r7) {
            r5 = this;
            r0 = r5
            r1 = -1
            r2 = r6
            r3 = r7
            r0.<init>(r1, r2, r3)
            return
    }

    public ParseException(int r4, int r5, java.lang.Object r6) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.position = r1
            r0 = r3
            r1 = r5
            r0.errorType = r1
            r0 = r3
            r1 = r6
            r0.unexpectedObject = r1
            return
    }

    public int getErrorType() {
            r2 = this;
            r0 = r2
            int r0 = r0.errorType
            return r0
    }

    public void setErrorType(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.errorType = r1
            return
    }

    public int getPosition() {
            r2 = this;
            r0 = r2
            int r0 = r0.position
            return r0
    }

    public void setPosition(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.position = r1
            return
    }

    public java.lang.Object getUnexpectedObject() {
            r2 = this;
            r0 = r2
            java.lang.Object r0 = r0.unexpectedObject
            return r0
    }

    public void setUnexpectedObject(java.lang.Object r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.unexpectedObject = r1
            return
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
            r3 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r3
            int r0 = r0.errorType
            switch(r0) {
                case 0: goto L28;
                case 1: goto L4a;
                case 2: goto L6c;
                default: goto L89;
            }
        L28:
            r0 = r4
            java.lang.String r1 = "Unexpected character ("
            java.lang.StringBuffer r0 = r0.append(r1)
            r1 = r3
            java.lang.Object r1 = r1.unexpectedObject
            java.lang.StringBuffer r0 = r0.append(r1)
            java.lang.String r1 = ") at position "
            java.lang.StringBuffer r0 = r0.append(r1)
            r1 = r3
            int r1 = r1.position
            java.lang.StringBuffer r0 = r0.append(r1)
            java.lang.String r1 = "."
            java.lang.StringBuffer r0 = r0.append(r1)
            goto L9c
        L4a:
            r0 = r4
            java.lang.String r1 = "Unexpected token "
            java.lang.StringBuffer r0 = r0.append(r1)
            r1 = r3
            java.lang.Object r1 = r1.unexpectedObject
            java.lang.StringBuffer r0 = r0.append(r1)
            java.lang.String r1 = " at position "
            java.lang.StringBuffer r0 = r0.append(r1)
            r1 = r3
            int r1 = r1.position
            java.lang.StringBuffer r0 = r0.append(r1)
            java.lang.String r1 = "."
            java.lang.StringBuffer r0 = r0.append(r1)
            goto L9c
        L6c:
            r0 = r4
            java.lang.String r1 = "Unexpected exception at position "
            java.lang.StringBuffer r0 = r0.append(r1)
            r1 = r3
            int r1 = r1.position
            java.lang.StringBuffer r0 = r0.append(r1)
            java.lang.String r1 = ": "
            java.lang.StringBuffer r0 = r0.append(r1)
            r1 = r3
            java.lang.Object r1 = r1.unexpectedObject
            java.lang.StringBuffer r0 = r0.append(r1)
            goto L9c
        L89:
            r0 = r4
            java.lang.String r1 = "Unkown error at position "
            java.lang.StringBuffer r0 = r0.append(r1)
            r1 = r3
            int r1 = r1.position
            java.lang.StringBuffer r0 = r0.append(r1)
            java.lang.String r1 = "."
            java.lang.StringBuffer r0 = r0.append(r1)
        L9c:
            r0 = r4
            java.lang.String r0 = r0.toString()
            return r0
    }
}
