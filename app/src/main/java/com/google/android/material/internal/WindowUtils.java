package com.google.android.material.internal;

/* JADX INFO: loaded from: classes.dex */
public class WindowUtils {
    private static final java.lang.String TAG = "WindowUtils";

    private static class Api14Impl {
        private Api14Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.graphics.Rect getCurrentWindowBounds(android.view.WindowManager r3) {
                android.view.Display r3 = r3.getDefaultDisplay()
                android.graphics.Point r0 = getRealSizeForDisplay(r3)
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                int r2 = r0.x
                if (r2 == 0) goto L1f
                int r2 = r0.y
                if (r2 != 0) goto L16
                goto L1f
            L16:
                int r3 = r0.x
                r1.right = r3
                int r3 = r0.y
                r1.bottom = r3
                goto L22
            L1f:
                r3.getRectSize(r1)
            L22:
                return r1
        }

        private static android.graphics.Point getRealSizeForDisplay(android.view.Display r7) {
                android.graphics.Point r0 = new android.graphics.Point
                r0.<init>()
                java.lang.Class<android.view.Display> r1 = android.view.Display.class
                java.lang.String r2 = "getRealSize"
                r3 = 1
                java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L29 java.lang.NoSuchMethodException -> L32
                java.lang.Class<android.graphics.Point> r5 = android.graphics.Point.class
                r6 = 0
                r4[r6] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L29 java.lang.NoSuchMethodException -> L32
                java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L29 java.lang.NoSuchMethodException -> L32
                r1.setAccessible(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L29 java.lang.NoSuchMethodException -> L32
                java.lang.Object[] r2 = new java.lang.Object[]{r0}     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L29 java.lang.NoSuchMethodException -> L32
                r1.invoke(r7, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L29 java.lang.NoSuchMethodException -> L32
                goto L3a
            L20:
                r7 = move-exception
                java.lang.String r1 = com.google.android.material.internal.WindowUtils.access$000()
                android.util.Log.w(r1, r7)
                goto L3a
            L29:
                r7 = move-exception
                java.lang.String r1 = com.google.android.material.internal.WindowUtils.access$000()
                android.util.Log.w(r1, r7)
                goto L3a
            L32:
                r7 = move-exception
                java.lang.String r1 = com.google.android.material.internal.WindowUtils.access$000()
                android.util.Log.w(r1, r7)
            L3a:
                return r0
        }
    }

    private static class Api17Impl {
        private Api17Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.graphics.Rect getCurrentWindowBounds(android.view.WindowManager r2) {
                android.view.Display r2 = r2.getDefaultDisplay()
                android.graphics.Point r0 = new android.graphics.Point
                r0.<init>()
                r2.getRealSize(r0)
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                int r1 = r0.x
                r2.right = r1
                int r0 = r0.y
                r2.bottom = r0
                return r2
        }
    }

    private static class Api30Impl {
        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.graphics.Rect getCurrentWindowBounds(android.view.WindowManager r0) {
                android.view.WindowMetrics r0 = r0.getCurrentWindowMetrics()
                android.graphics.Rect r0 = r0.getBounds()
                return r0
        }
    }

    static {
            return
    }

    private WindowUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ java.lang.String access$000() {
            java.lang.String r0 = com.google.android.material.internal.WindowUtils.TAG
            return r0
    }

    public static android.graphics.Rect getCurrentWindowBounds(android.content.Context r2) {
            java.lang.String r0 = "window"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L13
            android.graphics.Rect r2 = com.google.android.material.internal.WindowUtils.Api30Impl.getCurrentWindowBounds(r2)
            return r2
        L13:
            android.graphics.Rect r2 = com.google.android.material.internal.WindowUtils.Api17Impl.getCurrentWindowBounds(r2)
            return r2
    }
}
