package androidx.core.view.inputmethod;

/* JADX INFO: loaded from: classes.dex */
public final class InputConnectionCompat {
    private static final java.lang.String COMMIT_CONTENT_ACTION = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    private static final java.lang.String COMMIT_CONTENT_CONTENT_URI_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    private static final java.lang.String COMMIT_CONTENT_CONTENT_URI_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    private static final java.lang.String COMMIT_CONTENT_DESCRIPTION_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    private static final java.lang.String COMMIT_CONTENT_DESCRIPTION_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    private static final java.lang.String COMMIT_CONTENT_FLAGS_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    private static final java.lang.String COMMIT_CONTENT_FLAGS_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    private static final java.lang.String COMMIT_CONTENT_INTEROP_ACTION = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    private static final java.lang.String COMMIT_CONTENT_LINK_URI_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    private static final java.lang.String COMMIT_CONTENT_LINK_URI_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    private static final java.lang.String COMMIT_CONTENT_OPTS_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    private static final java.lang.String COMMIT_CONTENT_OPTS_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    private static final java.lang.String COMMIT_CONTENT_RESULT_INTEROP_RECEIVER_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    private static final java.lang.String COMMIT_CONTENT_RESULT_RECEIVER_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    private static final java.lang.String EXTRA_INPUT_CONTENT_INFO = "androidx.core.view.extra.INPUT_CONTENT_INFO";
    public static final int INPUT_CONTENT_GRANT_READ_URI_PERMISSION = 1;
    private static final java.lang.String LOG_TAG = "InputConnectionCompat";


    /* JADX INFO: renamed from: androidx.core.view.inputmethod.InputConnectionCompat$2, reason: invalid class name */
    class AnonymousClass2 extends android.view.inputmethod.InputConnectionWrapper {
        final /* synthetic */ androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener val$listener;

        AnonymousClass2(android.view.inputmethod.InputConnection r1, boolean r2, androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener r3) {
                r0 = this;
                r0.val$listener = r3
                r0.<init>(r1, r2)
                return
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(java.lang.String r2, android.os.Bundle r3) {
                r1 = this;
                androidx.core.view.inputmethod.InputConnectionCompat$OnCommitContentListener r0 = r1.val$listener
                boolean r0 = androidx.core.view.inputmethod.InputConnectionCompat.handlePerformPrivateCommand(r2, r3, r0)
                if (r0 == 0) goto La
                r2 = 1
                return r2
            La:
                boolean r2 = super.performPrivateCommand(r2, r3)
                return r2
        }
    }

    static class Api25Impl {
        private Api25Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean commitContent(android.view.inputmethod.InputConnection r0, android.view.inputmethod.InputContentInfo r1, int r2, android.os.Bundle r3) {
                boolean r0 = r0.commitContent(r1, r2, r3)
                return r0
        }
    }

    public interface OnCommitContentListener {
        boolean onCommitContent(androidx.core.view.inputmethod.InputContentInfoCompat r1, int r2, android.os.Bundle r3);
    }

    @java.lang.Deprecated
    public InputConnectionCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean commitContent(android.view.inputmethod.InputConnection r0, android.view.inputmethod.EditorInfo r1, androidx.core.view.inputmethod.InputContentInfoCompat r2, int r3, android.os.Bundle r4) {
            java.lang.Object r1 = r2.unwrap()
            android.view.inputmethod.InputContentInfo r1 = (android.view.inputmethod.InputContentInfo) r1
            boolean r0 = androidx.core.view.inputmethod.InputConnectionCompat.Api25Impl.commitContent(r0, r1, r3, r4)
            return r0
    }

    private static androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener createOnCommitContentListenerUsingPerformReceiveContent(android.view.View r1) {
            androidx.core.util.Preconditions.checkNotNull(r1)
            androidx.core.view.inputmethod.InputConnectionCompat$$ExternalSyntheticLambda0 r0 = new androidx.core.view.inputmethod.InputConnectionCompat$$ExternalSyntheticLambda0
            r0.<init>(r1)
            return r0
    }

    public static android.view.inputmethod.InputConnection createWrapper(android.view.View r0, android.view.inputmethod.InputConnection r1, android.view.inputmethod.EditorInfo r2) {
            androidx.core.view.inputmethod.InputConnectionCompat$OnCommitContentListener r0 = createOnCommitContentListenerUsingPerformReceiveContent(r0)
            android.view.inputmethod.InputConnection r0 = createWrapper(r1, r2, r0)
            return r0
    }

    @java.lang.Deprecated
    public static android.view.inputmethod.InputConnection createWrapper(android.view.inputmethod.InputConnection r1, android.view.inputmethod.EditorInfo r2, androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener r3) {
            java.lang.String r0 = "inputConnection must be non-null"
            androidx.core.util.ObjectsCompat.requireNonNull(r1, r0)
            java.lang.String r0 = "editorInfo must be non-null"
            androidx.core.util.ObjectsCompat.requireNonNull(r2, r0)
            java.lang.String r2 = "onCommitContentListener must be non-null"
            androidx.core.util.ObjectsCompat.requireNonNull(r3, r2)
            androidx.core.view.inputmethod.InputConnectionCompat$1 r2 = new androidx.core.view.inputmethod.InputConnectionCompat$1
            r0 = 0
            r2.<init>(r1, r0, r3)
            return r2
    }

    static boolean handlePerformPrivateCommand(java.lang.String r7, android.os.Bundle r8, androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener r9) {
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r1 = android.text.TextUtils.equals(r1, r7)
            if (r1 == 0) goto Le
            r7 = r0
            goto L17
        Le:
            java.lang.String r1 = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r7 = android.text.TextUtils.equals(r1, r7)
            if (r7 == 0) goto L81
            r7 = 1
        L17:
            r1 = 0
            if (r7 == 0) goto L1d
            java.lang.String r2 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
            goto L1f
        L1d:
            java.lang.String r2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
        L1f:
            android.os.Parcelable r2 = r8.getParcelable(r2)     // Catch: java.lang.Throwable -> L79
            android.os.ResultReceiver r2 = (android.os.ResultReceiver) r2     // Catch: java.lang.Throwable -> L79
            if (r7 == 0) goto L2a
            java.lang.String r3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI"
            goto L2c
        L2a:
            java.lang.String r3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI"
        L2c:
            android.os.Parcelable r3 = r8.getParcelable(r3)     // Catch: java.lang.Throwable -> L77
            android.net.Uri r3 = (android.net.Uri) r3     // Catch: java.lang.Throwable -> L77
            if (r7 == 0) goto L37
            java.lang.String r4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
            goto L39
        L37:
            java.lang.String r4 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
        L39:
            android.os.Parcelable r4 = r8.getParcelable(r4)     // Catch: java.lang.Throwable -> L77
            android.content.ClipDescription r4 = (android.content.ClipDescription) r4     // Catch: java.lang.Throwable -> L77
            if (r7 == 0) goto L44
            java.lang.String r5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
            goto L46
        L44:
            java.lang.String r5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
        L46:
            android.os.Parcelable r5 = r8.getParcelable(r5)     // Catch: java.lang.Throwable -> L77
            android.net.Uri r5 = (android.net.Uri) r5     // Catch: java.lang.Throwable -> L77
            if (r7 == 0) goto L51
            java.lang.String r6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
            goto L53
        L51:
            java.lang.String r6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
        L53:
            int r6 = r8.getInt(r6)     // Catch: java.lang.Throwable -> L77
            if (r7 == 0) goto L5c
            java.lang.String r7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
            goto L5e
        L5c:
            java.lang.String r7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
        L5e:
            android.os.Parcelable r7 = r8.getParcelable(r7)     // Catch: java.lang.Throwable -> L77
            android.os.Bundle r7 = (android.os.Bundle) r7     // Catch: java.lang.Throwable -> L77
            if (r3 == 0) goto L71
            if (r4 == 0) goto L71
            androidx.core.view.inputmethod.InputContentInfoCompat r8 = new androidx.core.view.inputmethod.InputContentInfoCompat     // Catch: java.lang.Throwable -> L77
            r8.<init>(r3, r4, r5)     // Catch: java.lang.Throwable -> L77
            boolean r0 = r9.onCommitContent(r8, r6, r7)     // Catch: java.lang.Throwable -> L77
        L71:
            if (r2 == 0) goto L76
            r2.send(r0, r1)
        L76:
            return r0
        L77:
            r7 = move-exception
            goto L7b
        L79:
            r7 = move-exception
            r2 = r1
        L7b:
            if (r2 == 0) goto L80
            r2.send(r0, r1)
        L80:
            throw r7
        L81:
            return r0
    }

    static /* synthetic */ boolean lambda$createOnCommitContentListenerUsingPerformReceiveContent$0(android.view.View r5, androidx.core.view.inputmethod.InputContentInfoCompat r6, int r7, android.os.Bundle r8) {
            r0 = 1
            r7 = r7 & r0
            r1 = 0
            if (r7 == 0) goto L2b
            r6.requestPermission()     // Catch: java.lang.Exception -> L22
            java.lang.Object r7 = r6.unwrap()
            android.os.Parcelable r7 = (android.os.Parcelable) r7
            if (r8 != 0) goto L16
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            goto L1c
        L16:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>(r8)
            r8 = r2
        L1c:
            java.lang.String r2 = "androidx.core.view.extra.INPUT_CONTENT_INFO"
            r8.putParcelable(r2, r7)
            goto L2b
        L22:
            r5 = move-exception
            java.lang.String r6 = "InputConnectionCompat"
            java.lang.String r7 = "Can't insert content from IME; requestPermission() failed"
            android.util.Log.w(r6, r7, r5)
            return r1
        L2b:
            android.content.ClipData r7 = new android.content.ClipData
            android.content.ClipDescription r2 = r6.getDescription()
            android.content.ClipData$Item r3 = new android.content.ClipData$Item
            android.net.Uri r4 = r6.getContentUri()
            r3.<init>(r4)
            r7.<init>(r2, r3)
            androidx.core.view.ContentInfoCompat$Builder r2 = new androidx.core.view.ContentInfoCompat$Builder
            r3 = 2
            r2.<init>(r7, r3)
            android.net.Uri r6 = r6.getLinkUri()
            androidx.core.view.ContentInfoCompat$Builder r6 = r2.setLinkUri(r6)
            androidx.core.view.ContentInfoCompat$Builder r6 = r6.setExtras(r8)
            androidx.core.view.ContentInfoCompat r6 = r6.build()
            androidx.core.view.ContentInfoCompat r5 = androidx.core.view.ViewCompat.performReceiveContent(r5, r6)
            if (r5 != 0) goto L5a
            goto L5b
        L5a:
            r0 = r1
        L5b:
            return r0
    }
}
