package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public class CommonStatusCodes {
    public static final int API_NOT_CONNECTED = 17;
    public static final int CANCELED = 16;
    public static final int CONNECTION_SUSPENDED_DURING_CALL = 20;
    public static final int DEVELOPER_ERROR = 10;
    public static final int ERROR = 13;
    public static final int INTERNAL_ERROR = 8;
    public static final int INTERRUPTED = 14;
    public static final int INVALID_ACCOUNT = 5;
    public static final int NETWORK_ERROR = 7;
    public static final int RECONNECTION_TIMED_OUT = 22;
    public static final int RECONNECTION_TIMED_OUT_DURING_UPDATE = 21;
    public static final int REMOTE_EXCEPTION = 19;
    public static final int RESOLUTION_REQUIRED = 6;

    @java.lang.Deprecated
    public static final int SERVICE_DISABLED = 3;

    @java.lang.Deprecated
    public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
    public static final int SIGN_IN_REQUIRED = 4;
    public static final int SUCCESS = 0;
    public static final int SUCCESS_CACHE = -1;
    public static final int TIMEOUT = 15;

    protected CommonStatusCodes() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getStatusCodeString(int r2) {
            switch(r2) {
                case -1: goto L58;
                case 0: goto L55;
                case 1: goto L3;
                case 2: goto L52;
                case 3: goto L4f;
                case 4: goto L4c;
                case 5: goto L49;
                case 6: goto L46;
                case 7: goto L43;
                case 8: goto L40;
                case 9: goto L3;
                case 10: goto L3d;
                case 11: goto L3;
                case 12: goto L3;
                case 13: goto L3a;
                case 14: goto L37;
                case 15: goto L34;
                case 16: goto L31;
                case 17: goto L2e;
                case 18: goto L2b;
                case 19: goto L28;
                case 20: goto L25;
                case 21: goto L22;
                case 22: goto L1f;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 21
            r1.<init>(r0)
            java.lang.String r0 = "unknown status code: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            goto L5a
        L1f:
            java.lang.String r2 = "RECONNECTION_TIMED_OUT"
            goto L5a
        L22:
            java.lang.String r2 = "RECONNECTION_TIMED_OUT_DURING_UPDATE"
            goto L5a
        L25:
            java.lang.String r2 = "CONNECTION_SUSPENDED_DURING_CALL"
            goto L5a
        L28:
            java.lang.String r2 = "REMOTE_EXCEPTION"
            goto L5a
        L2b:
            java.lang.String r2 = "DEAD_CLIENT"
            goto L5a
        L2e:
            java.lang.String r2 = "API_NOT_CONNECTED"
            goto L5a
        L31:
            java.lang.String r2 = "CANCELED"
            goto L5a
        L34:
            java.lang.String r2 = "TIMEOUT"
            goto L5a
        L37:
            java.lang.String r2 = "INTERRUPTED"
            goto L5a
        L3a:
            java.lang.String r2 = "ERROR"
            goto L5a
        L3d:
            java.lang.String r2 = "DEVELOPER_ERROR"
            goto L5a
        L40:
            java.lang.String r2 = "INTERNAL_ERROR"
            goto L5a
        L43:
            java.lang.String r2 = "NETWORK_ERROR"
            goto L5a
        L46:
            java.lang.String r2 = "RESOLUTION_REQUIRED"
            goto L5a
        L49:
            java.lang.String r2 = "INVALID_ACCOUNT"
            goto L5a
        L4c:
            java.lang.String r2 = "SIGN_IN_REQUIRED"
            goto L5a
        L4f:
            java.lang.String r2 = "SERVICE_DISABLED"
            goto L5a
        L52:
            java.lang.String r2 = "SERVICE_VERSION_UPDATE_REQUIRED"
            goto L5a
        L55:
            java.lang.String r2 = "SUCCESS"
            goto L5a
        L58:
            java.lang.String r2 = "SUCCESS_CACHE"
        L5a:
            return r2
    }
}
