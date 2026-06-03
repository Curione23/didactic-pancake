package androidx.browser.trusted.sharing;

/* JADX INFO: loaded from: classes.dex */
public final class ShareTarget {
    public static final java.lang.String ENCODING_TYPE_MULTIPART = "multipart/form-data";
    public static final java.lang.String ENCODING_TYPE_URL_ENCODED = "application/x-www-form-urlencoded";
    public static final java.lang.String KEY_ACTION = "androidx.browser.trusted.sharing.KEY_ACTION";
    public static final java.lang.String KEY_ENCTYPE = "androidx.browser.trusted.sharing.KEY_ENCTYPE";
    public static final java.lang.String KEY_METHOD = "androidx.browser.trusted.sharing.KEY_METHOD";
    public static final java.lang.String KEY_PARAMS = "androidx.browser.trusted.sharing.KEY_PARAMS";
    public static final java.lang.String METHOD_GET = "GET";
    public static final java.lang.String METHOD_POST = "POST";
    public final java.lang.String action;
    public final java.lang.String encodingType;
    public final java.lang.String method;
    public final androidx.browser.trusted.sharing.ShareTarget.Params params;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface EncodingType {
    }

    public static final class FileFormField {
        public static final java.lang.String KEY_ACCEPTED_TYPES = "androidx.browser.trusted.sharing.KEY_ACCEPTED_TYPES";
        public static final java.lang.String KEY_NAME = "androidx.browser.trusted.sharing.KEY_FILE_NAME";
        public final java.util.List<java.lang.String> acceptedTypes;
        public final java.lang.String name;

        public FileFormField(java.lang.String r1, java.util.List<java.lang.String> r2) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                java.util.List r1 = java.util.Collections.unmodifiableList(r2)
                r0.acceptedTypes = r1
                return
        }

        static androidx.browser.trusted.sharing.ShareTarget.FileFormField fromBundle(android.os.Bundle r3) {
                r0 = 0
                if (r3 != 0) goto L4
                return r0
            L4:
                java.lang.String r1 = "androidx.browser.trusted.sharing.KEY_FILE_NAME"
                java.lang.String r1 = r3.getString(r1)
                java.lang.String r2 = "androidx.browser.trusted.sharing.KEY_ACCEPTED_TYPES"
                java.util.ArrayList r3 = r3.getStringArrayList(r2)
                if (r1 == 0) goto L1a
                if (r3 != 0) goto L15
                goto L1a
            L15:
                androidx.browser.trusted.sharing.ShareTarget$FileFormField r0 = new androidx.browser.trusted.sharing.ShareTarget$FileFormField
                r0.<init>(r1, r3)
            L1a:
                return r0
        }

        android.os.Bundle toBundle() {
                r3 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "androidx.browser.trusted.sharing.KEY_FILE_NAME"
                java.lang.String r2 = r3.name
                r0.putString(r1, r2)
                java.util.ArrayList r1 = new java.util.ArrayList
                java.util.List<java.lang.String> r2 = r3.acceptedTypes
                r1.<init>(r2)
                java.lang.String r2 = "androidx.browser.trusted.sharing.KEY_ACCEPTED_TYPES"
                r0.putStringArrayList(r2, r1)
                return r0
        }
    }

    public static class Params {
        public static final java.lang.String KEY_FILES = "androidx.browser.trusted.sharing.KEY_FILES";
        public static final java.lang.String KEY_TEXT = "androidx.browser.trusted.sharing.KEY_TEXT";
        public static final java.lang.String KEY_TITLE = "androidx.browser.trusted.sharing.KEY_TITLE";
        public final java.util.List<androidx.browser.trusted.sharing.ShareTarget.FileFormField> files;
        public final java.lang.String text;
        public final java.lang.String title;

        public Params(java.lang.String r1, java.lang.String r2, java.util.List<androidx.browser.trusted.sharing.ShareTarget.FileFormField> r3) {
                r0 = this;
                r0.<init>()
                r0.title = r1
                r0.text = r2
                r0.files = r3
                return
        }

        static androidx.browser.trusted.sharing.ShareTarget.Params fromBundle(android.os.Bundle r4) {
                r0 = 0
                if (r4 != 0) goto L4
                return r0
            L4:
                java.lang.String r1 = "androidx.browser.trusted.sharing.KEY_FILES"
                java.util.ArrayList r1 = r4.getParcelableArrayList(r1)
                if (r1 == 0) goto L29
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.Iterator r1 = r1.iterator()
            L15:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L29
                java.lang.Object r2 = r1.next()
                android.os.Bundle r2 = (android.os.Bundle) r2
                androidx.browser.trusted.sharing.ShareTarget$FileFormField r2 = androidx.browser.trusted.sharing.ShareTarget.FileFormField.fromBundle(r2)
                r0.add(r2)
                goto L15
            L29:
                androidx.browser.trusted.sharing.ShareTarget$Params r1 = new androidx.browser.trusted.sharing.ShareTarget$Params
                java.lang.String r2 = "androidx.browser.trusted.sharing.KEY_TITLE"
                java.lang.String r2 = r4.getString(r2)
                java.lang.String r3 = "androidx.browser.trusted.sharing.KEY_TEXT"
                java.lang.String r4 = r4.getString(r3)
                r1.<init>(r2, r4, r0)
                return r1
        }

        android.os.Bundle toBundle() {
                r4 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "androidx.browser.trusted.sharing.KEY_TITLE"
                java.lang.String r2 = r4.title
                r0.putString(r1, r2)
                java.lang.String r1 = "androidx.browser.trusted.sharing.KEY_TEXT"
                java.lang.String r2 = r4.text
                r0.putString(r1, r2)
                java.util.List<androidx.browser.trusted.sharing.ShareTarget$FileFormField> r1 = r4.files
                if (r1 == 0) goto L3b
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.List<androidx.browser.trusted.sharing.ShareTarget$FileFormField> r2 = r4.files
                java.util.Iterator r2 = r2.iterator()
            L22:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L36
                java.lang.Object r3 = r2.next()
                androidx.browser.trusted.sharing.ShareTarget$FileFormField r3 = (androidx.browser.trusted.sharing.ShareTarget.FileFormField) r3
                android.os.Bundle r3 = r3.toBundle()
                r1.add(r3)
                goto L22
            L36:
                java.lang.String r2 = "androidx.browser.trusted.sharing.KEY_FILES"
                r0.putParcelableArrayList(r2, r1)
            L3b:
                return r0
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface RequestMethod {
    }

    public ShareTarget(java.lang.String r1, java.lang.String r2, java.lang.String r3, androidx.browser.trusted.sharing.ShareTarget.Params r4) {
            r0 = this;
            r0.<init>()
            r0.action = r1
            r0.method = r2
            r0.encodingType = r3
            r0.params = r4
            return
    }

    public static androidx.browser.trusted.sharing.ShareTarget fromBundle(android.os.Bundle r4) {
            java.lang.String r0 = "androidx.browser.trusted.sharing.KEY_ACTION"
            java.lang.String r0 = r4.getString(r0)
            java.lang.String r1 = "androidx.browser.trusted.sharing.KEY_METHOD"
            java.lang.String r1 = r4.getString(r1)
            java.lang.String r2 = "androidx.browser.trusted.sharing.KEY_ENCTYPE"
            java.lang.String r2 = r4.getString(r2)
            java.lang.String r3 = "androidx.browser.trusted.sharing.KEY_PARAMS"
            android.os.Bundle r4 = r4.getBundle(r3)
            androidx.browser.trusted.sharing.ShareTarget$Params r4 = androidx.browser.trusted.sharing.ShareTarget.Params.fromBundle(r4)
            if (r0 == 0) goto L27
            if (r4 != 0) goto L21
            goto L27
        L21:
            androidx.browser.trusted.sharing.ShareTarget r3 = new androidx.browser.trusted.sharing.ShareTarget
            r3.<init>(r0, r1, r2, r4)
            return r3
        L27:
            r4 = 0
            return r4
    }

    public android.os.Bundle toBundle() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "androidx.browser.trusted.sharing.KEY_ACTION"
            java.lang.String r2 = r3.action
            r0.putString(r1, r2)
            java.lang.String r1 = "androidx.browser.trusted.sharing.KEY_METHOD"
            java.lang.String r2 = r3.method
            r0.putString(r1, r2)
            java.lang.String r1 = "androidx.browser.trusted.sharing.KEY_ENCTYPE"
            java.lang.String r2 = r3.encodingType
            r0.putString(r1, r2)
            androidx.browser.trusted.sharing.ShareTarget$Params r1 = r3.params
            android.os.Bundle r1 = r1.toBundle()
            java.lang.String r2 = "androidx.browser.trusted.sharing.KEY_PARAMS"
            r0.putBundle(r2, r1)
            return r0
    }
}
