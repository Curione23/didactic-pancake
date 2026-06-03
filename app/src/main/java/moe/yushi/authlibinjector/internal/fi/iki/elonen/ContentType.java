package moe.yushi.authlibinjector.internal.fi.iki.elonen;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/internal/fi/iki/elonen/ContentType.class */
class ContentType {
    private static final java.lang.String ASCII_ENCODING = "US-ASCII";
    private static final java.lang.String MULTIPART_FORM_DATA_HEADER = "multipart/form-data";
    private static final java.lang.String CONTENT_REGEX = "[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)";
    private static final java.util.regex.Pattern MIME_PATTERN = null;
    private static final java.lang.String CHARSET_REGEX = "[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?";
    private static final java.util.regex.Pattern CHARSET_PATTERN = null;
    private static final java.lang.String BOUNDARY_REGEX = "[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?";
    private static final java.util.regex.Pattern BOUNDARY_PATTERN = null;
    private final java.lang.String contentTypeHeader;
    private final java.lang.String contentType;
    private final java.lang.String encoding;
    private final java.lang.String boundary;

    public ContentType(java.lang.String r8) {
            r7 = this;
            r0 = r7
            r0.<init>()
            r0 = r7
            r1 = r8
            r0.contentTypeHeader = r1
            r0 = r8
            if (r0 == 0) goto L2d
            r0 = r7
            r1 = r7
            r2 = r8
            java.util.regex.Pattern r3 = moe.yushi.authlibinjector.internal.fi.iki.elonen.ContentType.MIME_PATTERN
            java.lang.String r4 = ""
            r5 = 1
            java.lang.String r1 = r1.getDetailFromContentHeader(r2, r3, r4, r5)
            r0.contentType = r1
            r0 = r7
            r1 = r7
            r2 = r8
            java.util.regex.Pattern r3 = moe.yushi.authlibinjector.internal.fi.iki.elonen.ContentType.CHARSET_PATTERN
            r4 = 0
            r5 = 2
            java.lang.String r1 = r1.getDetailFromContentHeader(r2, r3, r4, r5)
            r0.encoding = r1
            goto L39
        L2d:
            r0 = r7
            java.lang.String r1 = ""
            r0.contentType = r1
            r0 = r7
            java.lang.String r1 = "UTF-8"
            r0.encoding = r1
        L39:
            java.lang.String r0 = "multipart/form-data"
            r1 = r7
            java.lang.String r1 = r1.contentType
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L56
            r0 = r7
            r1 = r7
            r2 = r8
            java.util.regex.Pattern r3 = moe.yushi.authlibinjector.internal.fi.iki.elonen.ContentType.BOUNDARY_PATTERN
            r4 = 0
            r5 = 2
            java.lang.String r1 = r1.getDetailFromContentHeader(r2, r3, r4, r5)
            r0.boundary = r1
            goto L5b
        L56:
            r0 = r7
            r1 = 0
            r0.boundary = r1
        L5b:
            return
    }

    private java.lang.String getDetailFromContentHeader(java.lang.String r4, java.util.regex.Pattern r5, java.lang.String r6, int r7) {
            r3 = this;
            r0 = r5
            r1 = r4
            java.util.regex.Matcher r0 = r0.matcher(r1)
            r8 = r0
            r0 = r8
            boolean r0 = r0.find()
            if (r0 == 0) goto L19
            r0 = r8
            r1 = r7
            java.lang.String r0 = r0.group(r1)
            goto L1a
        L19:
            r0 = r6
        L1a:
            return r0
    }

    public java.lang.String getContentTypeHeader() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.contentTypeHeader
            return r0
    }

    public java.lang.String getContentType() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.contentType
            return r0
    }

    public java.lang.String getEncoding() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.encoding
            if (r0 != 0) goto Lc
            java.lang.String r0 = "US-ASCII"
            goto L10
        Lc:
            r0 = r2
            java.lang.String r0 = r0.encoding
        L10:
            return r0
    }

    public java.lang.String getBoundary() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.boundary
            return r0
    }

    public boolean isMultipart() {
            r3 = this;
            java.lang.String r0 = "multipart/form-data"
            r1 = r3
            java.lang.String r1 = r1.contentType
            boolean r0 = r0.equalsIgnoreCase(r1)
            return r0
    }

    public moe.yushi.authlibinjector.internal.fi.iki.elonen.ContentType tryUTF8() {
            r5 = this;
            r0 = r5
            java.lang.String r0 = r0.encoding
            if (r0 != 0) goto L25
            moe.yushi.authlibinjector.internal.fi.iki.elonen.ContentType r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.ContentType
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            r3 = r5
            java.lang.String r3 = r3.contentTypeHeader
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "; charset=UTF-8"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            return r0
        L25:
            r0 = r5
            return r0
    }

    static {
            java.lang.String r0 = "[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)"
            r1 = 2
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.ContentType.MIME_PATTERN = r0
            java.lang.String r0 = "[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?"
            r1 = 2
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.ContentType.CHARSET_PATTERN = r0
            java.lang.String r0 = "[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?"
            r1 = 2
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.ContentType.BOUNDARY_PATTERN = r0
            return
    }
}
