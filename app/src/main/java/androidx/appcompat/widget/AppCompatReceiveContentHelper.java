package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
final class AppCompatReceiveContentHelper {
    private static final java.lang.String LOG_TAG = "ReceiveContent";

    private static final class OnDropApi24Impl {
        private OnDropApi24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean onDropForTextView(android.view.DragEvent r1, android.widget.TextView r2, android.app.Activity r3) {
                r3.requestDragAndDropPermissions(r1)
                float r3 = r1.getX()
                float r0 = r1.getY()
                int r3 = r2.getOffsetForPosition(r3, r0)
                r2.beginBatchEdit()
                java.lang.CharSequence r0 = r2.getText()     // Catch: java.lang.Throwable -> L31
                android.text.Spannable r0 = (android.text.Spannable) r0     // Catch: java.lang.Throwable -> L31
                android.text.Selection.setSelection(r0, r3)     // Catch: java.lang.Throwable -> L31
                androidx.core.view.ContentInfoCompat$Builder r3 = new androidx.core.view.ContentInfoCompat$Builder     // Catch: java.lang.Throwable -> L31
                android.content.ClipData r1 = r1.getClipData()     // Catch: java.lang.Throwable -> L31
                r0 = 3
                r3.<init>(r1, r0)     // Catch: java.lang.Throwable -> L31
                androidx.core.view.ContentInfoCompat r1 = r3.build()     // Catch: java.lang.Throwable -> L31
                androidx.core.view.ViewCompat.performReceiveContent(r2, r1)     // Catch: java.lang.Throwable -> L31
                r2.endBatchEdit()
                r1 = 1
                return r1
            L31:
                r1 = move-exception
                r2.endBatchEdit()
                throw r1
        }

        static boolean onDropForView(android.view.DragEvent r1, android.view.View r2, android.app.Activity r3) {
                r3.requestDragAndDropPermissions(r1)
                androidx.core.view.ContentInfoCompat$Builder r3 = new androidx.core.view.ContentInfoCompat$Builder
                android.content.ClipData r1 = r1.getClipData()
                r0 = 3
                r3.<init>(r1, r0)
                androidx.core.view.ContentInfoCompat r1 = r3.build()
                androidx.core.view.ViewCompat.performReceiveContent(r2, r1)
                r1 = 1
                return r1
        }
    }

    private AppCompatReceiveContentHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean maybeHandleDragEventViaPerformReceiveContent(android.view.View r4, android.view.DragEvent r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            r2 = 0
            if (r0 >= r1) goto L51
            java.lang.Object r0 = r5.getLocalState()
            if (r0 != 0) goto L51
            java.lang.String[] r0 = androidx.core.view.ViewCompat.getOnReceiveContentMimeTypes(r4)
            if (r0 != 0) goto L14
            goto L51
        L14:
            android.app.Activity r0 = tryGetActivity(r4)
            if (r0 != 0) goto L2f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Can't handle drop: no activity: view="
            r5.<init>(r0)
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "ReceiveContent"
            android.util.Log.i(r5, r4)
            return r2
        L2f:
            int r1 = r5.getAction()
            r3 = 1
            if (r1 != r3) goto L3a
            boolean r4 = r4 instanceof android.widget.TextView
            r4 = r4 ^ r3
            return r4
        L3a:
            int r1 = r5.getAction()
            r3 = 3
            if (r1 != r3) goto L51
            boolean r1 = r4 instanceof android.widget.TextView
            if (r1 == 0) goto L4c
            android.widget.TextView r4 = (android.widget.TextView) r4
            boolean r4 = androidx.appcompat.widget.AppCompatReceiveContentHelper.OnDropApi24Impl.onDropForTextView(r5, r4, r0)
            goto L50
        L4c:
            boolean r4 = androidx.appcompat.widget.AppCompatReceiveContentHelper.OnDropApi24Impl.onDropForView(r5, r4, r0)
        L50:
            return r4
        L51:
            return r2
    }

    static boolean maybeHandleMenuActionViaPerformReceiveContent(android.widget.TextView r5, int r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            r2 = 0
            if (r0 >= r1) goto L4a
            java.lang.String[] r0 = androidx.core.view.ViewCompat.getOnReceiveContentMimeTypes(r5)
            if (r0 == 0) goto L4a
            r0 = 16908322(0x1020022, float:2.3877324E-38)
            if (r6 == r0) goto L18
            r1 = 16908337(0x1020031, float:2.3877366E-38)
            if (r6 == r1) goto L18
            goto L4a
        L18:
            android.content.Context r1 = r5.getContext()
            java.lang.String r3 = "clipboard"
            java.lang.Object r1 = r1.getSystemService(r3)
            android.content.ClipboardManager r1 = (android.content.ClipboardManager) r1
            if (r1 != 0) goto L28
            r1 = 0
            goto L2c
        L28:
            android.content.ClipData r1 = r1.getPrimaryClip()
        L2c:
            r3 = 1
            if (r1 == 0) goto L49
            int r4 = r1.getItemCount()
            if (r4 <= 0) goto L49
            androidx.core.view.ContentInfoCompat$Builder r4 = new androidx.core.view.ContentInfoCompat$Builder
            r4.<init>(r1, r3)
            if (r6 != r0) goto L3d
            goto L3e
        L3d:
            r2 = r3
        L3e:
            androidx.core.view.ContentInfoCompat$Builder r6 = r4.setFlags(r2)
            androidx.core.view.ContentInfoCompat r6 = r6.build()
            androidx.core.view.ViewCompat.performReceiveContent(r5, r6)
        L49:
            return r3
        L4a:
            return r2
    }

    static android.app.Activity tryGetActivity(android.view.View r1) {
            android.content.Context r1 = r1.getContext()
        L4:
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L16
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto Lf
            android.app.Activity r1 = (android.app.Activity) r1
            return r1
        Lf:
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            goto L4
        L16:
            r1 = 0
            return r1
    }
}
