package moe.yushi.authlibinjector.internal.fi.iki.elonen;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/internal/fi/iki/elonen/Status.class */
public enum Status extends java.lang.Enum<moe.yushi.authlibinjector.internal.fi.iki.elonen.Status> implements moe.yushi.authlibinjector.internal.fi.iki.elonen.IStatus {
    public static final moe.yushi.authlibinjector.internal.fi.iki.elonen.Status SWITCH_PROTOCOL = null;
    public static final moe.yushi.authlibinjector.internal.fi.iki.elonen.Status OK = null;
    public static final moe.yushi.authlibinjector.internal.fi.iki.elonen.Status CREATED = null;
    public static final moe.yushi.authlibinjector.internal.fi.iki.elonen.Status ACCEPTED = null;
    public static final moe.yushi.authlibinjector.internal.fi.iki.elonen.Status NO_CONTENT = null;
    public static final moe.yushi.authlibinjector.internal.fi.iki.elonen.Status PARTIAL_CONTENT = null;
    public static final moe.yushi.authlibinjector.internal.fi.iki.elonen.Status MULTI_STATUS = null;
    public static final moe.yushi.authlibinjector.internal.fi.iki.elonen.Status REDIRECT = null;

    @java.lang.Deprecated
    public static final moe.yushi.authlibinjector.internal.fi.iki.elonen.Status FOUND = null;
    public static final moe.yushi.authlibinjector.internal.fi.iki.elonen.Status REDIRECT_SEE_OTHER = null;
    public static final moe.yushi.authlibinjector.internal.fi.iki.elonen.Status NOT_MODIFIED = null;
    public static final moe.yushi.authlibinjector.internal.fi.iki.elonen.Status TEMPORARY_REDIRECT = null;
    public static final moe.yushi.authlibinjector.internal.fi.iki.elonen.Status BAD_REQUEST = null;
    public static final moe.yushi.authlibinjector.internal.fi.iki.elonen.Status UNAUTHORIZED = null;
    public static final moe.yushi.authlibinjector.internal.fi.iki.elonen.Status FORBIDDEN = null;
    public static final moe.yushi.authlibinjector.internal.fi.iki.elonen.Status NOT_FOUND = null;
    public static final moe.yushi.authlibinjector.internal.fi.iki.elonen.Status METHOD_NOT_ALLOWED = null;
    public static final moe.yushi.authlibinjector.internal.fi.iki.elonen.Status NOT_ACCEPTABLE = null;
    public static final moe.yushi.authlibinjector.internal.fi.iki.elonen.Status REQUEST_TIMEOUT = null;
    public static final moe.yushi.authlibinjector.internal.fi.iki.elonen.Status CONFLICT = null;
    public static final moe.yushi.authlibinjector.internal.fi.iki.elonen.Status GONE = null;
    public static final moe.yushi.authlibinjector.internal.fi.iki.elonen.Status LENGTH_REQUIRED = null;
    public static final moe.yushi.authlibinjector.internal.fi.iki.elonen.Status PRECONDITION_FAILED = null;
    public static final moe.yushi.authlibinjector.internal.fi.iki.elonen.Status PAYLOAD_TOO_LARGE = null;
    public static final moe.yushi.authlibinjector.internal.fi.iki.elonen.Status UNSUPPORTED_MEDIA_TYPE = null;
    public static final moe.yushi.authlibinjector.internal.fi.iki.elonen.Status RANGE_NOT_SATISFIABLE = null;
    public static final moe.yushi.authlibinjector.internal.fi.iki.elonen.Status EXPECTATION_FAILED = null;
    public static final moe.yushi.authlibinjector.internal.fi.iki.elonen.Status TOO_MANY_REQUESTS = null;
    public static final moe.yushi.authlibinjector.internal.fi.iki.elonen.Status INTERNAL_ERROR = null;
    public static final moe.yushi.authlibinjector.internal.fi.iki.elonen.Status NOT_IMPLEMENTED = null;
    public static final moe.yushi.authlibinjector.internal.fi.iki.elonen.Status BAD_GATEWAY = null;
    public static final moe.yushi.authlibinjector.internal.fi.iki.elonen.Status SERVICE_UNAVAILABLE = null;
    public static final moe.yushi.authlibinjector.internal.fi.iki.elonen.Status UNSUPPORTED_HTTP_VERSION = null;
    private final int requestStatus;
    private final java.lang.String description;
    private static final /* synthetic */ moe.yushi.authlibinjector.internal.fi.iki.elonen.Status[] $VALUES = null;

    public static moe.yushi.authlibinjector.internal.fi.iki.elonen.Status[] values() {
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status[] r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.$VALUES
            java.lang.Object r0 = r0.clone()
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status[] r0 = (moe.yushi.authlibinjector.internal.fi.iki.elonen.Status[]) r0
            return r0
    }

    public static moe.yushi.authlibinjector.internal.fi.iki.elonen.Status valueOf(java.lang.String r3) {
            java.lang.Class<moe.yushi.authlibinjector.internal.fi.iki.elonen.Status> r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.class
            r1 = r3
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = (moe.yushi.authlibinjector.internal.fi.iki.elonen.Status) r0
            return r0
    }

    Status(java.lang.String r5, int r6, int r7, java.lang.String r8) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r7
            r0.requestStatus = r1
            r0 = r4
            r1 = r8
            r0.description = r1
            return
    }

    public static moe.yushi.authlibinjector.internal.fi.iki.elonen.Status lookup(int r3) {
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status[] r0 = values()
            r4 = r0
            r0 = r4
            int r0 = r0.length
            r5 = r0
            r0 = 0
            r6 = r0
        L9:
            r0 = r6
            r1 = r5
            if (r0 >= r1) goto L25
            r0 = r4
            r1 = r6
            r0 = r0[r1]
            r7 = r0
            r0 = r7
            int r0 = r0.getRequestStatus()
            r1 = r3
            if (r0 != r1) goto L1f
            r0 = r7
            return r0
        L1f:
            int r6 = r6 + 1
            goto L9
        L25:
            r0 = 0
            return r0
    }

    @Override // moe.yushi.authlibinjector.internal.fi.iki.elonen.IStatus
    public java.lang.String getDescription() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = ""
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            int r1 = r1.requestStatus
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.String r1 = r1.description
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // moe.yushi.authlibinjector.internal.fi.iki.elonen.IStatus
    public int getRequestStatus() {
            r2 = this;
            r0 = r2
            int r0 = r0.requestStatus
            return r0
    }

    private static /* synthetic */ moe.yushi.authlibinjector.internal.fi.iki.elonen.Status[] $values() {
            r0 = 33
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status[] r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.Status[r0]
            r1 = r0
            r2 = 0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r3 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.SWITCH_PROTOCOL
            r1[r2] = r3
            r1 = r0
            r2 = 1
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r3 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.OK
            r1[r2] = r3
            r1 = r0
            r2 = 2
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r3 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.CREATED
            r1[r2] = r3
            r1 = r0
            r2 = 3
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r3 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.ACCEPTED
            r1[r2] = r3
            r1 = r0
            r2 = 4
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r3 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.NO_CONTENT
            r1[r2] = r3
            r1 = r0
            r2 = 5
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r3 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.PARTIAL_CONTENT
            r1[r2] = r3
            r1 = r0
            r2 = 6
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r3 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.MULTI_STATUS
            r1[r2] = r3
            r1 = r0
            r2 = 7
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r3 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.REDIRECT
            r1[r2] = r3
            r1 = r0
            r2 = 8
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r3 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.FOUND
            r1[r2] = r3
            r1 = r0
            r2 = 9
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r3 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.REDIRECT_SEE_OTHER
            r1[r2] = r3
            r1 = r0
            r2 = 10
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r3 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.NOT_MODIFIED
            r1[r2] = r3
            r1 = r0
            r2 = 11
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r3 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.TEMPORARY_REDIRECT
            r1[r2] = r3
            r1 = r0
            r2 = 12
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r3 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.BAD_REQUEST
            r1[r2] = r3
            r1 = r0
            r2 = 13
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r3 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.UNAUTHORIZED
            r1[r2] = r3
            r1 = r0
            r2 = 14
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r3 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.FORBIDDEN
            r1[r2] = r3
            r1 = r0
            r2 = 15
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r3 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.NOT_FOUND
            r1[r2] = r3
            r1 = r0
            r2 = 16
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r3 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.METHOD_NOT_ALLOWED
            r1[r2] = r3
            r1 = r0
            r2 = 17
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r3 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.NOT_ACCEPTABLE
            r1[r2] = r3
            r1 = r0
            r2 = 18
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r3 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.REQUEST_TIMEOUT
            r1[r2] = r3
            r1 = r0
            r2 = 19
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r3 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.CONFLICT
            r1[r2] = r3
            r1 = r0
            r2 = 20
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r3 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.GONE
            r1[r2] = r3
            r1 = r0
            r2 = 21
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r3 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.LENGTH_REQUIRED
            r1[r2] = r3
            r1 = r0
            r2 = 22
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r3 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.PRECONDITION_FAILED
            r1[r2] = r3
            r1 = r0
            r2 = 23
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r3 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.PAYLOAD_TOO_LARGE
            r1[r2] = r3
            r1 = r0
            r2 = 24
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r3 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.UNSUPPORTED_MEDIA_TYPE
            r1[r2] = r3
            r1 = r0
            r2 = 25
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r3 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.RANGE_NOT_SATISFIABLE
            r1[r2] = r3
            r1 = r0
            r2 = 26
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r3 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.EXPECTATION_FAILED
            r1[r2] = r3
            r1 = r0
            r2 = 27
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r3 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.TOO_MANY_REQUESTS
            r1[r2] = r3
            r1 = r0
            r2 = 28
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r3 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.INTERNAL_ERROR
            r1[r2] = r3
            r1 = r0
            r2 = 29
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r3 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.NOT_IMPLEMENTED
            r1[r2] = r3
            r1 = r0
            r2 = 30
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r3 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.BAD_GATEWAY
            r1[r2] = r3
            r1 = r0
            r2 = 31
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r3 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.SERVICE_UNAVAILABLE
            r1[r2] = r3
            r1 = r0
            r2 = 32
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r3 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.UNSUPPORTED_HTTP_VERSION
            r1[r2] = r3
            return r0
    }

    static {
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.Status
            r1 = r0
            java.lang.String r2 = "SWITCH_PROTOCOL"
            r3 = 0
            r4 = 101(0x65, float:1.42E-43)
            java.lang.String r5 = "Switching Protocols"
            r1.<init>(r2, r3, r4, r5)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.SWITCH_PROTOCOL = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.Status
            r1 = r0
            java.lang.String r2 = "OK"
            r3 = 1
            r4 = 200(0xc8, float:2.8E-43)
            java.lang.String r5 = "OK"
            r1.<init>(r2, r3, r4, r5)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.OK = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.Status
            r1 = r0
            java.lang.String r2 = "CREATED"
            r3 = 2
            r4 = 201(0xc9, float:2.82E-43)
            java.lang.String r5 = "Created"
            r1.<init>(r2, r3, r4, r5)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.CREATED = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.Status
            r1 = r0
            java.lang.String r2 = "ACCEPTED"
            r3 = 3
            r4 = 202(0xca, float:2.83E-43)
            java.lang.String r5 = "Accepted"
            r1.<init>(r2, r3, r4, r5)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.ACCEPTED = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.Status
            r1 = r0
            java.lang.String r2 = "NO_CONTENT"
            r3 = 4
            r4 = 204(0xcc, float:2.86E-43)
            java.lang.String r5 = "No Content"
            r1.<init>(r2, r3, r4, r5)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.NO_CONTENT = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.Status
            r1 = r0
            java.lang.String r2 = "PARTIAL_CONTENT"
            r3 = 5
            r4 = 206(0xce, float:2.89E-43)
            java.lang.String r5 = "Partial Content"
            r1.<init>(r2, r3, r4, r5)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.PARTIAL_CONTENT = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.Status
            r1 = r0
            java.lang.String r2 = "MULTI_STATUS"
            r3 = 6
            r4 = 207(0xcf, float:2.9E-43)
            java.lang.String r5 = "Multi-Status"
            r1.<init>(r2, r3, r4, r5)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.MULTI_STATUS = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.Status
            r1 = r0
            java.lang.String r2 = "REDIRECT"
            r3 = 7
            r4 = 301(0x12d, float:4.22E-43)
            java.lang.String r5 = "Moved Permanently"
            r1.<init>(r2, r3, r4, r5)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.REDIRECT = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.Status
            r1 = r0
            java.lang.String r2 = "FOUND"
            r3 = 8
            r4 = 302(0x12e, float:4.23E-43)
            java.lang.String r5 = "Found"
            r1.<init>(r2, r3, r4, r5)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.FOUND = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.Status
            r1 = r0
            java.lang.String r2 = "REDIRECT_SEE_OTHER"
            r3 = 9
            r4 = 303(0x12f, float:4.25E-43)
            java.lang.String r5 = "See Other"
            r1.<init>(r2, r3, r4, r5)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.REDIRECT_SEE_OTHER = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.Status
            r1 = r0
            java.lang.String r2 = "NOT_MODIFIED"
            r3 = 10
            r4 = 304(0x130, float:4.26E-43)
            java.lang.String r5 = "Not Modified"
            r1.<init>(r2, r3, r4, r5)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.NOT_MODIFIED = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.Status
            r1 = r0
            java.lang.String r2 = "TEMPORARY_REDIRECT"
            r3 = 11
            r4 = 307(0x133, float:4.3E-43)
            java.lang.String r5 = "Temporary Redirect"
            r1.<init>(r2, r3, r4, r5)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.TEMPORARY_REDIRECT = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.Status
            r1 = r0
            java.lang.String r2 = "BAD_REQUEST"
            r3 = 12
            r4 = 400(0x190, float:5.6E-43)
            java.lang.String r5 = "Bad Request"
            r1.<init>(r2, r3, r4, r5)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.BAD_REQUEST = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.Status
            r1 = r0
            java.lang.String r2 = "UNAUTHORIZED"
            r3 = 13
            r4 = 401(0x191, float:5.62E-43)
            java.lang.String r5 = "Unauthorized"
            r1.<init>(r2, r3, r4, r5)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.UNAUTHORIZED = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.Status
            r1 = r0
            java.lang.String r2 = "FORBIDDEN"
            r3 = 14
            r4 = 403(0x193, float:5.65E-43)
            java.lang.String r5 = "Forbidden"
            r1.<init>(r2, r3, r4, r5)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.FORBIDDEN = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.Status
            r1 = r0
            java.lang.String r2 = "NOT_FOUND"
            r3 = 15
            r4 = 404(0x194, float:5.66E-43)
            java.lang.String r5 = "Not Found"
            r1.<init>(r2, r3, r4, r5)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.NOT_FOUND = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.Status
            r1 = r0
            java.lang.String r2 = "METHOD_NOT_ALLOWED"
            r3 = 16
            r4 = 405(0x195, float:5.68E-43)
            java.lang.String r5 = "Method Not Allowed"
            r1.<init>(r2, r3, r4, r5)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.METHOD_NOT_ALLOWED = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.Status
            r1 = r0
            java.lang.String r2 = "NOT_ACCEPTABLE"
            r3 = 17
            r4 = 406(0x196, float:5.69E-43)
            java.lang.String r5 = "Not Acceptable"
            r1.<init>(r2, r3, r4, r5)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.NOT_ACCEPTABLE = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.Status
            r1 = r0
            java.lang.String r2 = "REQUEST_TIMEOUT"
            r3 = 18
            r4 = 408(0x198, float:5.72E-43)
            java.lang.String r5 = "Request Timeout"
            r1.<init>(r2, r3, r4, r5)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.REQUEST_TIMEOUT = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.Status
            r1 = r0
            java.lang.String r2 = "CONFLICT"
            r3 = 19
            r4 = 409(0x199, float:5.73E-43)
            java.lang.String r5 = "Conflict"
            r1.<init>(r2, r3, r4, r5)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.CONFLICT = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.Status
            r1 = r0
            java.lang.String r2 = "GONE"
            r3 = 20
            r4 = 410(0x19a, float:5.75E-43)
            java.lang.String r5 = "Gone"
            r1.<init>(r2, r3, r4, r5)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.GONE = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.Status
            r1 = r0
            java.lang.String r2 = "LENGTH_REQUIRED"
            r3 = 21
            r4 = 411(0x19b, float:5.76E-43)
            java.lang.String r5 = "Length Required"
            r1.<init>(r2, r3, r4, r5)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.LENGTH_REQUIRED = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.Status
            r1 = r0
            java.lang.String r2 = "PRECONDITION_FAILED"
            r3 = 22
            r4 = 412(0x19c, float:5.77E-43)
            java.lang.String r5 = "Precondition Failed"
            r1.<init>(r2, r3, r4, r5)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.PRECONDITION_FAILED = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.Status
            r1 = r0
            java.lang.String r2 = "PAYLOAD_TOO_LARGE"
            r3 = 23
            r4 = 413(0x19d, float:5.79E-43)
            java.lang.String r5 = "Payload Too Large"
            r1.<init>(r2, r3, r4, r5)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.PAYLOAD_TOO_LARGE = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.Status
            r1 = r0
            java.lang.String r2 = "UNSUPPORTED_MEDIA_TYPE"
            r3 = 24
            r4 = 415(0x19f, float:5.82E-43)
            java.lang.String r5 = "Unsupported Media Type"
            r1.<init>(r2, r3, r4, r5)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.UNSUPPORTED_MEDIA_TYPE = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.Status
            r1 = r0
            java.lang.String r2 = "RANGE_NOT_SATISFIABLE"
            r3 = 25
            r4 = 416(0x1a0, float:5.83E-43)
            java.lang.String r5 = "Requested Range Not Satisfiable"
            r1.<init>(r2, r3, r4, r5)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.RANGE_NOT_SATISFIABLE = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.Status
            r1 = r0
            java.lang.String r2 = "EXPECTATION_FAILED"
            r3 = 26
            r4 = 417(0x1a1, float:5.84E-43)
            java.lang.String r5 = "Expectation Failed"
            r1.<init>(r2, r3, r4, r5)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.EXPECTATION_FAILED = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.Status
            r1 = r0
            java.lang.String r2 = "TOO_MANY_REQUESTS"
            r3 = 27
            r4 = 429(0x1ad, float:6.01E-43)
            java.lang.String r5 = "Too Many Requests"
            r1.<init>(r2, r3, r4, r5)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.TOO_MANY_REQUESTS = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.Status
            r1 = r0
            java.lang.String r2 = "INTERNAL_ERROR"
            r3 = 28
            r4 = 500(0x1f4, float:7.0E-43)
            java.lang.String r5 = "Internal Server Error"
            r1.<init>(r2, r3, r4, r5)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.INTERNAL_ERROR = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.Status
            r1 = r0
            java.lang.String r2 = "NOT_IMPLEMENTED"
            r3 = 29
            r4 = 501(0x1f5, float:7.02E-43)
            java.lang.String r5 = "Not Implemented"
            r1.<init>(r2, r3, r4, r5)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.NOT_IMPLEMENTED = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.Status
            r1 = r0
            java.lang.String r2 = "BAD_GATEWAY"
            r3 = 30
            r4 = 502(0x1f6, float:7.03E-43)
            java.lang.String r5 = "Bad Gateway"
            r1.<init>(r2, r3, r4, r5)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.BAD_GATEWAY = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.Status
            r1 = r0
            java.lang.String r2 = "SERVICE_UNAVAILABLE"
            r3 = 31
            r4 = 503(0x1f7, float:7.05E-43)
            java.lang.String r5 = "Service Unavailable"
            r1.<init>(r2, r3, r4, r5)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.SERVICE_UNAVAILABLE = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.Status
            r1 = r0
            java.lang.String r2 = "UNSUPPORTED_HTTP_VERSION"
            r3 = 32
            r4 = 505(0x1f9, float:7.08E-43)
            java.lang.String r5 = "HTTP Version Not Supported"
            r1.<init>(r2, r3, r4, r5)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.UNSUPPORTED_HTTP_VERSION = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status[] r0 = $values()
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.$VALUES = r0
            return
    }
}
