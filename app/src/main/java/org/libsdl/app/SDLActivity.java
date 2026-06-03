package org.libsdl.app;

/* JADX INFO: loaded from: classes2.dex */
public class SDLActivity extends android.app.Activity implements android.view.View.OnSystemUiVisibilityChangeListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected static final int COMMAND_CHANGE_TITLE = 1;
    protected static final int COMMAND_CHANGE_WINDOW_STYLE = 2;
    protected static final int COMMAND_SET_KEEP_SCREEN_ON = 5;
    protected static final int COMMAND_TEXTEDIT_HIDE = 3;
    protected static final int COMMAND_USER = 32768;
    private static final int SDL_MAJOR_VERSION = 3;
    private static final int SDL_MICRO_VERSION = 20;
    private static final int SDL_MINOR_VERSION = 2;
    protected static final int SDL_ORIENTATION_LANDSCAPE = 1;
    protected static final int SDL_ORIENTATION_LANDSCAPE_FLIPPED = 2;
    protected static final int SDL_ORIENTATION_PORTRAIT = 3;
    protected static final int SDL_ORIENTATION_PORTRAIT_FLIPPED = 4;
    protected static final int SDL_ORIENTATION_UNKNOWN = 0;
    private static final int SDL_SYSTEM_CURSOR_ARROW = 0;
    private static final int SDL_SYSTEM_CURSOR_CROSSHAIR = 3;
    private static final int SDL_SYSTEM_CURSOR_HAND = 11;
    private static final int SDL_SYSTEM_CURSOR_IBEAM = 1;
    private static final int SDL_SYSTEM_CURSOR_NO = 10;
    private static final int SDL_SYSTEM_CURSOR_SIZEALL = 9;
    private static final int SDL_SYSTEM_CURSOR_SIZENESW = 6;
    private static final int SDL_SYSTEM_CURSOR_SIZENS = 8;
    private static final int SDL_SYSTEM_CURSOR_SIZENWSE = 5;
    private static final int SDL_SYSTEM_CURSOR_SIZEWE = 7;
    private static final int SDL_SYSTEM_CURSOR_WAIT = 2;
    private static final int SDL_SYSTEM_CURSOR_WAITARROW = 4;
    private static final int SDL_SYSTEM_CURSOR_WINDOW_BOTTOM = 17;
    private static final int SDL_SYSTEM_CURSOR_WINDOW_BOTTOMLEFT = 18;
    private static final int SDL_SYSTEM_CURSOR_WINDOW_BOTTOMRIGHT = 16;
    private static final int SDL_SYSTEM_CURSOR_WINDOW_LEFT = 19;
    private static final int SDL_SYSTEM_CURSOR_WINDOW_RIGHT = 15;
    private static final int SDL_SYSTEM_CURSOR_WINDOW_TOP = 13;
    private static final int SDL_SYSTEM_CURSOR_WINDOW_TOPLEFT = 12;
    private static final int SDL_SYSTEM_CURSOR_WINDOW_TOPRIGHT = 14;
    private static final java.lang.String TAG = "SDL";
    protected static boolean mActivityCreated;
    public static boolean mBrokenLibraries;
    protected static org.libsdl.app.SDLClipboardHandler mClipboardHandler;
    protected static java.util.Locale mCurrentLocale;
    public static org.libsdl.app.SDLActivity.NativeState mCurrentNativeState;
    protected static int mCurrentRotation;
    protected static java.util.Hashtable<java.lang.Integer, android.view.PointerIcon> mCursors;
    protected static boolean mDispatchingKeyEvent;
    private static org.libsdl.app.SDLActivity.SDLFileDialogState mFileDialogState;
    protected static boolean mFullscreenModeActive;
    protected static org.libsdl.app.HIDDeviceManager mHIDDeviceManager;
    public static boolean mHasFocus;
    public static final boolean mHasMultiWindow = false;
    public static boolean mIsResumedCalled;
    protected static int mLastCursorID;
    protected static android.view.ViewGroup mLayout;
    protected static org.libsdl.app.SDLGenericMotionListener_API14 mMotionListener;
    public static org.libsdl.app.SDLActivity.NativeState mNextNativeState;
    protected static boolean mSDLMainFinished;
    protected static java.lang.Thread mSDLThread;
    protected static boolean mScreenKeyboardShown;
    protected static org.libsdl.app.SDLActivity mSingleton;
    protected static org.libsdl.app.SDLSurface mSurface;
    protected static org.libsdl.app.SDLDummyEdit mTextEdit;
    android.os.Handler commandHandler;
    protected final int[] messageboxSelection;
    private final java.lang.Runnable rehideSystemUi;









    public enum NativeState extends java.lang.Enum<org.libsdl.app.SDLActivity.NativeState> {
        private static final /* synthetic */ org.libsdl.app.SDLActivity.NativeState[] $VALUES = null;
        public static final org.libsdl.app.SDLActivity.NativeState INIT = null;
        public static final org.libsdl.app.SDLActivity.NativeState PAUSED = null;
        public static final org.libsdl.app.SDLActivity.NativeState RESUMED = null;

        private static /* synthetic */ org.libsdl.app.SDLActivity.NativeState[] $values() {
                org.libsdl.app.SDLActivity$NativeState r0 = org.libsdl.app.SDLActivity.NativeState.INIT
                org.libsdl.app.SDLActivity$NativeState r1 = org.libsdl.app.SDLActivity.NativeState.RESUMED
                org.libsdl.app.SDLActivity$NativeState r2 = org.libsdl.app.SDLActivity.NativeState.PAUSED
                org.libsdl.app.SDLActivity$NativeState[] r0 = new org.libsdl.app.SDLActivity.NativeState[]{r0, r1, r2}
                return r0
        }

        static {
                org.libsdl.app.SDLActivity$NativeState r0 = new org.libsdl.app.SDLActivity$NativeState
                java.lang.String r1 = "INIT"
                r2 = 0
                r0.<init>(r1, r2)
                org.libsdl.app.SDLActivity.NativeState.INIT = r0
                org.libsdl.app.SDLActivity$NativeState r0 = new org.libsdl.app.SDLActivity$NativeState
                java.lang.String r1 = "RESUMED"
                r2 = 1
                r0.<init>(r1, r2)
                org.libsdl.app.SDLActivity.NativeState.RESUMED = r0
                org.libsdl.app.SDLActivity$NativeState r0 = new org.libsdl.app.SDLActivity$NativeState
                java.lang.String r1 = "PAUSED"
                r2 = 2
                r0.<init>(r1, r2)
                org.libsdl.app.SDLActivity.NativeState.PAUSED = r0
                org.libsdl.app.SDLActivity$NativeState[] r0 = $values()
                org.libsdl.app.SDLActivity.NativeState.$VALUES = r0
                return
        }

        NativeState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.libsdl.app.SDLActivity.NativeState valueOf(java.lang.String r1) {
                java.lang.Class<org.libsdl.app.SDLActivity$NativeState> r0 = org.libsdl.app.SDLActivity.NativeState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.libsdl.app.SDLActivity$NativeState r1 = (org.libsdl.app.SDLActivity.NativeState) r1
                return r1
        }

        public static org.libsdl.app.SDLActivity.NativeState[] values() {
                org.libsdl.app.SDLActivity$NativeState[] r0 = org.libsdl.app.SDLActivity.NativeState.$VALUES
                java.lang.Object r0 = r0.clone()
                org.libsdl.app.SDLActivity$NativeState[] r0 = (org.libsdl.app.SDLActivity.NativeState[]) r0
                return r0
        }
    }

    protected static class SDLCommandHandler extends android.os.Handler {
        protected SDLCommandHandler() {
                r0 = this;
                r0.<init>()
                return
        }

        public void handleMessage(android.os.Message r9) {
                r8 = this;
                android.content.Context r0 = org.libsdl.app.SDL.getContext()
                java.lang.String r1 = "SDL"
                if (r0 != 0) goto Le
                java.lang.String r9 = "error handling message, getContext() returned null"
                android.util.Log.e(r1, r9)
                return
            Le:
                int r2 = r9.arg1
                java.lang.String r3 = "error handling message, getContext() returned no Activity"
                r4 = 1
                if (r2 == r4) goto Lf8
                r5 = 2
                r6 = 3
                r7 = 0
                if (r2 == r5) goto L95
                if (r2 == r6) goto L6d
                r3 = 5
                if (r2 == r3) goto L45
                boolean r2 = r0 instanceof org.libsdl.app.SDLActivity
                if (r2 == 0) goto L109
                org.libsdl.app.SDLActivity r0 = (org.libsdl.app.SDLActivity) r0
                int r2 = r9.arg1
                java.lang.Object r3 = r9.obj
                boolean r0 = r0.onUnhandledMessage(r2, r3)
                if (r0 != 0) goto L109
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r2 = "error handling message, command is "
                r0.<init>(r2)
                int r9 = r9.arg1
                java.lang.StringBuilder r9 = r0.append(r9)
                java.lang.String r9 = r9.toString()
                android.util.Log.e(r1, r9)
                goto L109
            L45:
                boolean r1 = r0 instanceof android.app.Activity
                if (r1 == 0) goto L109
                android.app.Activity r0 = (android.app.Activity) r0
                android.view.Window r0 = r0.getWindow()
                if (r0 == 0) goto L109
                java.lang.Object r1 = r9.obj
                boolean r1 = r1 instanceof java.lang.Integer
                r2 = 128(0x80, float:1.8E-43)
                if (r1 == 0) goto L68
                java.lang.Object r9 = r9.obj
                java.lang.Integer r9 = (java.lang.Integer) r9
                int r9 = r9.intValue()
                if (r9 == 0) goto L68
                r0.addFlags(r2)
                goto L109
            L68:
                r0.clearFlags(r2)
                goto L109
            L6d:
                org.libsdl.app.SDLDummyEdit r9 = org.libsdl.app.SDLActivity.mTextEdit
                if (r9 == 0) goto L109
                org.libsdl.app.SDLDummyEdit r9 = org.libsdl.app.SDLActivity.mTextEdit
                android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
                r1.<init>(r7, r7)
                r9.setLayoutParams(r1)
                java.lang.String r9 = "input_method"
                java.lang.Object r9 = r0.getSystemService(r9)
                android.view.inputmethod.InputMethodManager r9 = (android.view.inputmethod.InputMethodManager) r9
                org.libsdl.app.SDLDummyEdit r0 = org.libsdl.app.SDLActivity.mTextEdit
                android.os.IBinder r0 = r0.getWindowToken()
                r9.hideSoftInputFromWindow(r0, r7)
                org.libsdl.app.SDLActivity.mScreenKeyboardShown = r7
                org.libsdl.app.SDLSurface r9 = org.libsdl.app.SDLActivity.mSurface
                r9.requestFocus()
                goto L109
            L95:
                boolean r2 = r0 instanceof android.app.Activity
                if (r2 == 0) goto Lf4
                android.app.Activity r0 = (android.app.Activity) r0
                android.view.Window r0 = r0.getWindow()
                if (r0 == 0) goto L109
                java.lang.Object r1 = r9.obj
                boolean r1 = r1 instanceof java.lang.Integer
                r2 = 1024(0x400, float:1.435E-42)
                r3 = 2048(0x800, float:2.87E-42)
                if (r1 == 0) goto Lc7
                java.lang.Object r9 = r9.obj
                java.lang.Integer r9 = (java.lang.Integer) r9
                int r9 = r9.intValue()
                if (r9 == 0) goto Lc7
                r9 = 5894(0x1706, float:8.259E-42)
                android.view.View r1 = r0.getDecorView()
                r1.setSystemUiVisibility(r9)
                r0.addFlags(r2)
                r0.clearFlags(r3)
                org.libsdl.app.SDLActivity.mFullscreenModeActive = r4
                goto Ld8
            Lc7:
                r9 = 256(0x100, float:3.59E-43)
                android.view.View r1 = r0.getDecorView()
                r1.setSystemUiVisibility(r9)
                r0.addFlags(r3)
                r0.clearFlags(r2)
                org.libsdl.app.SDLActivity.mFullscreenModeActive = r7
            Ld8:
                int r9 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r9 < r1) goto Le4
                android.view.WindowManager$LayoutParams r9 = r0.getAttributes()
                r9.layoutInDisplayCutoutMode = r6
            Le4:
                int r9 = android.os.Build.VERSION.SDK_INT
                r0 = 30
                if (r9 < r0) goto L109
                int r9 = android.os.Build.VERSION.SDK_INT
                r0 = 35
                if (r9 >= r0) goto L109
                org.libsdl.app.SDLActivity.onNativeInsetsChanged(r7, r7, r7, r7)
                goto L109
            Lf4:
                android.util.Log.e(r1, r3)
                goto L109
            Lf8:
                boolean r2 = r0 instanceof android.app.Activity
                if (r2 == 0) goto L106
                android.app.Activity r0 = (android.app.Activity) r0
                java.lang.Object r9 = r9.obj
                java.lang.String r9 = (java.lang.String) r9
                r0.setTitle(r9)
                goto L109
            L106:
                android.util.Log.e(r1, r3)
            L109:
                return
        }
    }

    static class SDLFileDialogState {
        boolean multipleChoice;
        int requestCode;

        SDLFileDialogState() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static class ShowTextInputTask implements java.lang.Runnable {
        static final int HEIGHT_PADDING = 15;
        public int h;
        public int input_type;
        public int w;
        public int x;
        public int y;

        public ShowTextInputTask(int r1, int r2, int r3, int r4, int r5) {
                r0 = this;
                r0.<init>()
                r0.input_type = r1
                r0.x = r2
                r0.y = r3
                r0.w = r4
                r0.h = r5
                if (r4 > 0) goto L12
                r1 = 1
                r0.w = r1
            L12:
                int r5 = r5 + 15
                if (r5 > 0) goto L1a
                r1 = -14
                r0.h = r1
            L1a:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
                int r1 = r3.w
                int r2 = r3.h
                int r2 = r2 + 15
                r0.<init>(r1, r2)
                int r1 = r3.x
                r0.leftMargin = r1
                int r1 = r3.y
                r0.topMargin = r1
                org.libsdl.app.SDLDummyEdit r1 = org.libsdl.app.SDLActivity.mTextEdit
                if (r1 != 0) goto L2a
                org.libsdl.app.SDLDummyEdit r1 = new org.libsdl.app.SDLDummyEdit
                android.content.Context r2 = org.libsdl.app.SDL.getContext()
                r1.<init>(r2)
                org.libsdl.app.SDLActivity.mTextEdit = r1
                android.view.ViewGroup r1 = org.libsdl.app.SDLActivity.mLayout
                org.libsdl.app.SDLDummyEdit r2 = org.libsdl.app.SDLActivity.mTextEdit
                r1.addView(r2, r0)
                goto L2f
            L2a:
                org.libsdl.app.SDLDummyEdit r1 = org.libsdl.app.SDLActivity.mTextEdit
                r1.setLayoutParams(r0)
            L2f:
                org.libsdl.app.SDLDummyEdit r0 = org.libsdl.app.SDLActivity.mTextEdit
                int r1 = r3.input_type
                r0.setInputType(r1)
                org.libsdl.app.SDLDummyEdit r0 = org.libsdl.app.SDLActivity.mTextEdit
                r1 = 0
                r0.setVisibility(r1)
                org.libsdl.app.SDLDummyEdit r0 = org.libsdl.app.SDLActivity.mTextEdit
                r0.requestFocus()
                android.content.Context r0 = org.libsdl.app.SDL.getContext()
                java.lang.String r2 = "input_method"
                java.lang.Object r0 = r0.getSystemService(r2)
                android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
                org.libsdl.app.SDLDummyEdit r2 = org.libsdl.app.SDLActivity.mTextEdit
                r0.showSoftInput(r2, r1)
                r0 = 1
                org.libsdl.app.SDLActivity.mScreenKeyboardShown = r0
                return
        }
    }

    static {
            r0 = 1
            org.libsdl.app.SDLActivity.mHasMultiWindow = r0
            org.libsdl.app.SDLActivity.mBrokenLibraries = r0
            r0 = 0
            org.libsdl.app.SDLActivity.mSDLMainFinished = r0
            org.libsdl.app.SDLActivity.mActivityCreated = r0
            r1 = 0
            org.libsdl.app.SDLActivity.mFileDialogState = r1
            org.libsdl.app.SDLActivity.mDispatchingKeyEvent = r0
            return
    }

    public SDLActivity() {
            r1 = this;
            r1.<init>()
            org.libsdl.app.SDLActivity$SDLCommandHandler r0 = new org.libsdl.app.SDLActivity$SDLCommandHandler
            r0.<init>()
            r1.commandHandler = r0
            r0 = 1
            int[] r0 = new int[r0]
            r1.messageboxSelection = r0
            org.libsdl.app.SDLActivity$7 r0 = new org.libsdl.app.SDLActivity$7
            r0.<init>(r1)
            r1.rehideSystemUi = r0
            return
    }

    public static java.lang.String clipboardGetText() {
            org.libsdl.app.SDLClipboardHandler r0 = org.libsdl.app.SDLActivity.mClipboardHandler
            java.lang.String r0 = r0.clipboardGetText()
            return r0
    }

    public static boolean clipboardHasText() {
            org.libsdl.app.SDLClipboardHandler r0 = org.libsdl.app.SDLActivity.mClipboardHandler
            boolean r0 = r0.clipboardHasText()
            return r0
    }

    public static void clipboardSetText(java.lang.String r1) {
            org.libsdl.app.SDLClipboardHandler r0 = org.libsdl.app.SDLActivity.mClipboardHandler
            r0.clipboardSetText(r1)
            return
    }

    public static int createCustomCursor(int[] r1, int r2, int r3, int r4, int r5) {
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r2, r3, r0)
            int r2 = org.libsdl.app.SDLActivity.mLastCursorID
            int r2 = r2 + 1
            org.libsdl.app.SDLActivity.mLastCursorID = r2
            java.util.Hashtable<java.lang.Integer, android.view.PointerIcon> r2 = org.libsdl.app.SDLActivity.mCursors     // Catch: java.lang.Exception -> L20
            int r3 = org.libsdl.app.SDLActivity.mLastCursorID     // Catch: java.lang.Exception -> L20
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L20
            float r4 = (float) r4     // Catch: java.lang.Exception -> L20
            float r5 = (float) r5     // Catch: java.lang.Exception -> L20
            android.view.PointerIcon r1 = android.view.PointerIcon.create(r1, r4, r5)     // Catch: java.lang.Exception -> L20
            r2.put(r3, r1)     // Catch: java.lang.Exception -> L20
            int r1 = org.libsdl.app.SDLActivity.mLastCursorID
            return r1
        L20:
            r1 = 0
            return r1
    }

    public static void destroyCustomCursor(int r1) {
            java.util.Hashtable<java.lang.Integer, android.view.PointerIcon> r0 = org.libsdl.app.SDLActivity.mCursors     // Catch: java.lang.Exception -> L9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> L9
            r0.remove(r1)     // Catch: java.lang.Exception -> L9
        L9:
            return
    }

    public static boolean dispatchingKeyEvent() {
            boolean r0 = org.libsdl.app.SDLActivity.mDispatchingKeyEvent
            return r0
    }

    public static java.lang.String formatLocale(java.util.Locale r3) {
            java.lang.String r0 = r3.getLanguage()
            java.lang.String r1 = "in"
            java.lang.String r2 = ""
            if (r0 != r1) goto Ld
            java.lang.String r0 = "id"
            goto L1a
        Ld:
            java.lang.String r0 = r3.getLanguage()
            if (r0 != r2) goto L16
            java.lang.String r0 = "und"
            goto L1a
        L16:
            java.lang.String r0 = r3.getLanguage()
        L1a:
            java.lang.String r1 = r3.getCountry()
            if (r1 != r2) goto L21
            goto L3c
        L21:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "_"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r3 = r3.getCountry()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = r3.toString()
        L3c:
            return r0
    }

    public static android.view.View getContentView() {
            android.view.ViewGroup r0 = org.libsdl.app.SDLActivity.mLayout
            return r0
    }

    public static android.content.Context getContext() {
            android.content.Context r0 = org.libsdl.app.SDL.getContext()
            return r0
    }

    public static int getCurrentRotation() {
            android.content.Context r0 = getContext()
            android.app.Activity r0 = (android.app.Activity) r0
            r1 = 0
            if (r0 == 0) goto L29
            android.view.WindowManager r0 = r0.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            int r0 = r0.getRotation()
            if (r0 == 0) goto L29
            r2 = 1
            if (r0 == r2) goto L27
            r2 = 2
            if (r0 == r2) goto L24
            r2 = 3
            if (r0 == r2) goto L21
            goto L29
        L21:
            r1 = 270(0x10e, float:3.78E-43)
            goto L29
        L24:
            r1 = 180(0xb4, float:2.52E-43)
            goto L29
        L27:
            r1 = 90
        L29:
            return r1
    }

    public static double getDiagonal() {
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            android.content.Context r1 = getContext()
            android.app.Activity r1 = (android.app.Activity) r1
            if (r1 != 0) goto L10
            r0 = 0
            return r0
        L10:
            android.view.WindowManager r1 = r1.getWindowManager()
            android.view.Display r1 = r1.getDefaultDisplay()
            r1.getMetrics(r0)
            int r1 = r0.widthPixels
            double r1 = (double) r1
            float r3 = r0.xdpi
            double r3 = (double) r3
            double r1 = r1 / r3
            int r3 = r0.heightPixels
            double r3 = (double) r3
            float r0 = r0.ydpi
            double r5 = (double) r0
            double r3 = r3 / r5
            double r1 = r1 * r1
            double r3 = r3 * r3
            double r1 = r1 + r3
            double r0 = java.lang.Math.sqrt(r1)
            return r0
    }

    public static boolean getManifestEnvironmentVariables() {
            r0 = 0
            android.content.Context r1 = getContext()     // Catch: java.lang.Exception -> L55
            if (r1 != 0) goto L8
            return r0
        L8:
            android.content.Context r1 = getContext()     // Catch: java.lang.Exception -> L55
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Exception -> L55
            android.content.Context r2 = getContext()     // Catch: java.lang.Exception -> L55
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Exception -> L55
            r3 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo(r2, r3)     // Catch: java.lang.Exception -> L55
            android.os.Bundle r1 = r1.metaData     // Catch: java.lang.Exception -> L55
            if (r1 != 0) goto L23
            return r0
        L23:
            java.lang.String r2 = "SDL_ENV."
            int r3 = r2.length()     // Catch: java.lang.Exception -> L55
            java.util.Set r4 = r1.keySet()     // Catch: java.lang.Exception -> L55
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Exception -> L55
        L31:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Exception -> L55
            if (r5 == 0) goto L53
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Exception -> L55
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L55
            boolean r6 = r5.startsWith(r2)     // Catch: java.lang.Exception -> L55
            if (r6 == 0) goto L31
            java.lang.String r6 = r5.substring(r3)     // Catch: java.lang.Exception -> L55
            java.lang.Object r5 = r1.get(r5)     // Catch: java.lang.Exception -> L55
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L55
            nativeSetenv(r6, r5)     // Catch: java.lang.Exception -> L55
            goto L31
        L53:
            r0 = 1
            return r0
        L55:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "exception "
            r2.<init>(r3)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "SDL"
            android.util.Log.v(r2, r1)
            return r0
    }

    protected static org.libsdl.app.SDLGenericMotionListener_API14 getMotionListener() {
            org.libsdl.app.SDLGenericMotionListener_API14 r0 = org.libsdl.app.SDLActivity.mMotionListener
            if (r0 != 0) goto Lb
            org.libsdl.app.SDLGenericMotionListener_API26 r0 = new org.libsdl.app.SDLGenericMotionListener_API26
            r0.<init>()
            org.libsdl.app.SDLActivity.mMotionListener = r0
        Lb:
            org.libsdl.app.SDLGenericMotionListener_API14 r0 = org.libsdl.app.SDLActivity.mMotionListener
            return r0
    }

    public static android.view.Surface getNativeSurface() {
            org.libsdl.app.SDLSurface r0 = org.libsdl.app.SDLActivity.mSurface
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.view.Surface r0 = r0.getNativeSurface()
            return r0
    }

    public static int getNaturalOrientation() {
            android.content.Context r0 = getContext()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 == 0) goto L32
            java.lang.Object r1 = r0.invokeMethod(r0, r0)
            android.content.res.Configuration r1 = r1.getConfiguration()
            android.view.WindowManager r0 = r0.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            int r0 = r0.getRotation()
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L22
            if (r0 != r2) goto L26
        L22:
            int r4 = r1.orientation
            if (r4 == r2) goto L33
        L26:
            r2 = 3
            if (r0 == r3) goto L2b
            if (r0 != r2) goto L30
        L2b:
            int r0 = r1.orientation
            if (r0 != r3) goto L30
            goto L33
        L30:
            r3 = r2
            goto L33
        L32:
            r3 = 0
        L33:
            return r3
    }

    public static java.lang.String getPreferredLocales() {
            android.os.LocaleList r0 = android.os.LocaleList.getAdjustedDefault()
            java.lang.String r1 = ""
            r2 = 0
        L7:
            int r3 = r0.size()
            if (r2 >= r3) goto L3e
            if (r2 == 0) goto L22
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r3 = ","
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
        L22:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r1 = r3.append(r1)
            java.util.Locale r3 = r0.get(r2)
            java.lang.String r3 = formatLocale(r3)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            int r2 = r2 + 1
            goto L7
        L3e:
            return r1
    }

    public static boolean handleKeyEvent(android.view.View r3, int r4, android.view.KeyEvent r5, android.view.inputmethod.InputConnection r6) {
            int r3 = r5.getDeviceId()
            int r0 = r5.getSource()
            if (r0 != 0) goto L14
            android.view.InputDevice r1 = android.view.InputDevice.getDevice(r3)
            if (r1 == 0) goto L14
            int r0 = r1.getSources()
        L14:
            boolean r1 = org.libsdl.app.SDLControllerManager.isDeviceSDLJoystick(r3)
            r2 = 1
            if (r1 == 0) goto L35
            int r1 = r5.getAction()
            if (r1 != 0) goto L28
            boolean r3 = org.libsdl.app.SDLControllerManager.onNativePadDown(r3, r4)
            if (r3 == 0) goto L35
            return r2
        L28:
            int r1 = r5.getAction()
            if (r1 != r2) goto L35
            boolean r3 = org.libsdl.app.SDLControllerManager.onNativePadUp(r3, r4)
            if (r3 == 0) goto L35
            return r2
        L35:
            r3 = 8194(0x2002, float:1.1482E-41)
            r0 = r0 & r3
            if (r0 != r3) goto L52
            boolean r3 = isVRHeadset()
            if (r3 == 0) goto L41
            goto L52
        L41:
            r3 = 4
            if (r4 == r3) goto L48
            r3 = 125(0x7d, float:1.75E-43)
            if (r4 != r3) goto L52
        L48:
            int r3 = r5.getAction()
            if (r3 == 0) goto L51
            if (r3 == r2) goto L51
            goto L52
        L51:
            return r2
        L52:
            int r3 = r5.getAction()
            if (r3 != 0) goto L7d
            onNativeKeyDown(r4)
            boolean r3 = isTextInputEvent(r5)
            if (r3 == 0) goto L7c
            if (r6 == 0) goto L70
            int r3 = r5.getUnicodeChar()
            char r3 = (char) r3
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r6.commitText(r3, r2)
            goto L7c
        L70:
            int r3 = r5.getUnicodeChar()
            char r3 = (char) r3
            java.lang.String r3 = java.lang.String.valueOf(r3)
            org.libsdl.app.SDLInputConnection.nativeCommitText(r3, r2)
        L7c:
            return r2
        L7d:
            int r3 = r5.getAction()
            if (r3 != r2) goto L87
            onNativeKeyUp(r4)
            return r2
        L87:
            r3 = 0
            return r3
    }

    public static void handleNativeState() {
            org.libsdl.app.SDLActivity$NativeState r0 = org.libsdl.app.SDLActivity.mNextNativeState
            org.libsdl.app.SDLActivity$NativeState r1 = org.libsdl.app.SDLActivity.mCurrentNativeState
            if (r0 != r1) goto L7
            return
        L7:
            org.libsdl.app.SDLActivity$NativeState r1 = org.libsdl.app.SDLActivity.NativeState.INIT
            if (r0 != r1) goto L10
            org.libsdl.app.SDLActivity$NativeState r0 = org.libsdl.app.SDLActivity.mNextNativeState
            org.libsdl.app.SDLActivity.mCurrentNativeState = r0
            return
        L10:
            org.libsdl.app.SDLActivity$NativeState r0 = org.libsdl.app.SDLActivity.mNextNativeState
            org.libsdl.app.SDLActivity$NativeState r1 = org.libsdl.app.SDLActivity.NativeState.PAUSED
            if (r0 != r1) goto L29
            java.lang.Thread r0 = org.libsdl.app.SDLActivity.mSDLThread
            if (r0 == 0) goto L1d
            nativePause()
        L1d:
            org.libsdl.app.SDLSurface r0 = org.libsdl.app.SDLActivity.mSurface
            if (r0 == 0) goto L24
            r0.handlePause()
        L24:
            org.libsdl.app.SDLActivity$NativeState r0 = org.libsdl.app.SDLActivity.mNextNativeState
            org.libsdl.app.SDLActivity.mCurrentNativeState = r0
            return
        L29:
            org.libsdl.app.SDLActivity$NativeState r0 = org.libsdl.app.SDLActivity.mNextNativeState
            org.libsdl.app.SDLActivity$NativeState r1 = org.libsdl.app.SDLActivity.NativeState.RESUMED
            if (r0 != r1) goto L6b
            org.libsdl.app.SDLSurface r0 = org.libsdl.app.SDLActivity.mSurface
            boolean r0 = r0.mIsSurfaceReady
            if (r0 == 0) goto L6b
            boolean r0 = org.libsdl.app.SDLActivity.mHasFocus
            if (r0 != 0) goto L3d
            boolean r0 = org.libsdl.app.SDLActivity.mHasMultiWindow
            if (r0 == 0) goto L6b
        L3d:
            boolean r0 = org.libsdl.app.SDLActivity.mIsResumedCalled
            if (r0 == 0) goto L6b
            java.lang.Thread r0 = org.libsdl.app.SDLActivity.mSDLThread
            if (r0 != 0) goto L5f
            java.lang.Thread r0 = new java.lang.Thread
            org.libsdl.app.SDLMain r1 = new org.libsdl.app.SDLMain
            r1.<init>()
            java.lang.String r2 = "SDLThread"
            r0.<init>(r1, r2)
            org.libsdl.app.SDLActivity.mSDLThread = r0
            org.libsdl.app.SDLSurface r0 = org.libsdl.app.SDLActivity.mSurface
            r1 = 1
            r0.enableSensor(r1, r1)
            java.lang.Thread r0 = org.libsdl.app.SDLActivity.mSDLThread
            r0.start()
            goto L62
        L5f:
            nativeResume()
        L62:
            org.libsdl.app.SDLSurface r0 = org.libsdl.app.SDLActivity.mSurface
            r0.handleResume()
            org.libsdl.app.SDLActivity$NativeState r0 = org.libsdl.app.SDLActivity.mNextNativeState
            org.libsdl.app.SDLActivity.mCurrentNativeState = r0
        L6b:
            return
    }

    public static void initTouch() {
            int[] r0 = android.view.InputDevice.getDeviceIds()
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L2d
            r3 = r0[r2]
            android.view.InputDevice r3 = android.view.InputDevice.getDevice(r3)
            if (r3 == 0) goto L2a
            int r4 = r3.getSources()
            r5 = 4098(0x1002, float:5.743E-42)
            r4 = r4 & r5
            if (r4 == r5) goto L1f
            boolean r4 = r3.isVirtual()
            if (r4 == 0) goto L2a
        L1f:
            int r4 = r3.getId()
            java.lang.String r3 = r3.getName()
            nativeAddTouch(r4, r3)
        L2a:
            int r2 = r2 + 1
            goto L6
        L2d:
            return
    }

    public static void initialize() {
            r0 = 0
            org.libsdl.app.SDLActivity.mSingleton = r0
            org.libsdl.app.SDLActivity.mSurface = r0
            org.libsdl.app.SDLActivity.mTextEdit = r0
            org.libsdl.app.SDLActivity.mLayout = r0
            org.libsdl.app.SDLActivity.mClipboardHandler = r0
            java.util.Hashtable r1 = new java.util.Hashtable
            r1.<init>()
            org.libsdl.app.SDLActivity.mCursors = r1
            r1 = 0
            org.libsdl.app.SDLActivity.mLastCursorID = r1
            org.libsdl.app.SDLActivity.mSDLThread = r0
            org.libsdl.app.SDLActivity.mIsResumedCalled = r1
            r0 = 1
            org.libsdl.app.SDLActivity.mHasFocus = r0
            org.libsdl.app.SDLActivity$NativeState r0 = org.libsdl.app.SDLActivity.NativeState.INIT
            org.libsdl.app.SDLActivity.mNextNativeState = r0
            org.libsdl.app.SDLActivity$NativeState r0 = org.libsdl.app.SDLActivity.NativeState.INIT
            org.libsdl.app.SDLActivity.mCurrentNativeState = r0
            return
    }

    public static boolean isAndroidTV() {
            android.content.Context r0 = getContext()
            java.lang.String r1 = "uimode"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.UiModeManager r0 = (android.app.UiModeManager) r0
            int r0 = r0.getCurrentModeType()
            r1 = 4
            r2 = 1
            if (r0 != r1) goto L15
            return r2
        L15:
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "MINIX"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2a
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "NEO-U1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2a
            return r2
        L2a:
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "Amlogic"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3f
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r3 = "X96-W"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L3f
            return r2
        L3f:
            java.lang.String r0 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L52
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "TV"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L52
            return r2
        L52:
            r0 = 0
            return r0
    }

    public static boolean isChromebook() {
            android.content.Context r0 = getContext()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            android.content.Context r0 = getContext()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.String r1 = "org.chromium.arc.device_management"
            boolean r0 = r0.hasSystemFeature(r1)
            return r0
    }

    public static boolean isDeXMode() {
            r0 = 0
            android.content.Context r1 = getContext()     // Catch: java.lang.Exception -> L28
            android.content.res.Resources r1 = r1.getResources()     // Catch: java.lang.Exception -> L28
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Exception -> L28
            java.lang.Class r2 = r1.getClass()     // Catch: java.lang.Exception -> L28
            java.lang.String r3 = "SEM_DESKTOP_MODE_ENABLED"
            java.lang.reflect.Field r3 = r2.getField(r3)     // Catch: java.lang.Exception -> L28
            int r3 = r3.getInt(r2)     // Catch: java.lang.Exception -> L28
            java.lang.String r4 = "semDesktopModeEnabled"
            java.lang.reflect.Field r2 = r2.getField(r4)     // Catch: java.lang.Exception -> L28
            int r1 = r2.getInt(r1)     // Catch: java.lang.Exception -> L28
            if (r3 != r1) goto L28
            r0 = 1
        L28:
            return r0
    }

    public static boolean isScreenKeyboardShown() {
            org.libsdl.app.SDLDummyEdit r0 = org.libsdl.app.SDLActivity.mTextEdit
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = org.libsdl.app.SDLActivity.mScreenKeyboardShown
            if (r0 != 0) goto Lb
            return r1
        Lb:
            android.content.Context r0 = org.libsdl.app.SDL.getContext()
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            boolean r0 = r0.isAcceptingText()
            return r0
    }

    public static boolean isTablet() {
            double r0 = getDiagonal()
            r2 = 4619567317775286272(0x401c000000000000, double:7.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public static boolean isTextInputEvent(android.view.KeyEvent r2) {
            boolean r0 = r2.isCtrlPressed()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r2.isPrintingKey()
            if (r0 != 0) goto L16
            int r2 = r2.getKeyCode()
            r0 = 62
            if (r2 != r0) goto L17
        L16:
            r1 = 1
        L17:
            return r1
    }

    public static boolean isVRHeadset() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "Oculus"
            boolean r0 = r0.equals(r1)
            r1 = 1
            if (r0 == 0) goto L16
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r2 = "Quest"
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L16
            return r1
        L16:
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r2 = "Pico"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L21
            return r1
        L21:
            r0 = 0
            return r0
    }

    public static void manualBackButton() {
            org.libsdl.app.SDLActivity r0 = org.libsdl.app.SDLActivity.mSingleton
            r0.pressBackButton()
            return
    }

    public static void minimizeWindow() {
            org.libsdl.app.SDLActivity r0 = org.libsdl.app.SDLActivity.mSingleton
            if (r0 != 0) goto L5
            return
        L5:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.MAIN"
            r0.<init>(r1)
            java.lang.String r1 = "android.intent.category.HOME"
            r0.addCategory(r1)
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.setFlags(r1)
            org.libsdl.app.SDLActivity r1 = org.libsdl.app.SDLActivity.mSingleton
            r1.startActivity(r0)
            return
    }

    public static native void nativeAddTouch(int r0, java.lang.String r1);

    public static native boolean nativeAllowRecreateActivity();

    public static native int nativeCheckSDLThreadCounter();

    public static native void nativeCleanupMainThread();

    public static native void nativeFocusChanged(boolean r0);

    public static native java.lang.String nativeGetHint(java.lang.String r0);

    public static native boolean nativeGetHintBoolean(java.lang.String r0, boolean r1);

    public static native java.lang.String nativeGetVersion();

    public static native void nativeInitMainThread();

    public static native void nativeLowMemory();

    public static native void nativePause();

    public static native void nativePermissionResult(int r0, boolean r1);

    public static native void nativeQuit();

    public static native void nativeResume();

    public static native int nativeRunMain(java.lang.String r0, java.lang.String r1, java.lang.Object r2);

    public static native void nativeSendQuit();

    public static native void nativeSetNaturalOrientation(int r0);

    public static native void nativeSetScreenResolution(int r0, int r1, int r2, int r3, float r4, float r5);

    public static native void nativeSetenv(java.lang.String r0, java.lang.String r1);

    public static native int nativeSetupJNI();

    public static native void onNativeAccel(float r0, float r1, float r2);

    public static native void onNativeClipboardChanged();

    public static native void onNativeDarkModeChanged(boolean r0);

    public static native void onNativeDropFile(java.lang.String r0);

    public static native void onNativeFileDialog(int r0, java.lang.String[] r1, int r2);

    public static native void onNativeInsetsChanged(int r0, int r1, int r2, int r3);

    public static native void onNativeKeyDown(int r0);

    public static native void onNativeKeyUp(int r0);

    public static native void onNativeKeyboardFocusLost();

    public static native void onNativeLocaleChanged();

    public static native void onNativeMouse(int r0, int r1, float r2, float r3, boolean r4);

    public static native void onNativePen(int r0, int r1, int r2, float r3, float r4, float r5);

    public static native void onNativeResize();

    public static native void onNativeRotationChanged(int r0);

    public static native boolean onNativeSoftReturnKey();

    public static native void onNativeSurfaceChanged();

    public static native void onNativeSurfaceCreated();

    public static native void onNativeSurfaceDestroyed();

    public static native void onNativeTouch(int r0, int r1, int r2, float r3, float r4, float r5);

    public static int openFileDescriptor(java.lang.String r2, java.lang.String r3) throws java.lang.Exception {
            org.libsdl.app.SDLActivity r0 = org.libsdl.app.SDLActivity.mSingleton
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.io.FileNotFoundException -> L19
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.io.FileNotFoundException -> L19
            android.os.ParcelFileDescriptor r2 = r0.openFileDescriptor(r2, r3)     // Catch: java.io.FileNotFoundException -> L19
            if (r2 == 0) goto L18
            int r1 = r2.detachFd()     // Catch: java.io.FileNotFoundException -> L19
        L18:
            return r1
        L19:
            r2 = move-exception
            r2.printStackTrace()
            return r1
    }

    public static boolean openURL(java.lang.String r2) {
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> L1a
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1)     // Catch: java.lang.Exception -> L1a
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Exception -> L1a
            r0.setData(r2)     // Catch: java.lang.Exception -> L1a
            r2 = 1208483840(0x48080000, float:139264.0)
            r0.addFlags(r2)     // Catch: java.lang.Exception -> L1a
            org.libsdl.app.SDLActivity r2 = org.libsdl.app.SDLActivity.mSingleton     // Catch: java.lang.Exception -> L1a
            r2.startActivity(r0)     // Catch: java.lang.Exception -> L1a
            r2 = 1
            return r2
        L1a:
            r2 = 0
            return r2
    }

    public static void requestPermission(java.lang.String r3, int r4) {
            android.content.Context r0 = getContext()
            android.app.Activity r0 = (android.app.Activity) r0
            void r1 = r0.<init>()
            r2 = 1
            if (r1 == 0) goto L16
            java.lang.String[] r1 = new java.lang.String[r2]
            r2 = 0
            r1[r2] = r3
            r0.requestPermissions(r1, r4)
            goto L19
        L16:
            nativePermissionResult(r4, r2)
        L19:
            return
    }

    public static boolean sendMessage(int r1, int r2) {
            org.libsdl.app.SDLActivity r0 = org.libsdl.app.SDLActivity.mSingleton
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r1 = r0.sendCommand(r1, r2)
            return r1
    }

    public static boolean setActivityTitle(java.lang.String r2) {
            org.libsdl.app.SDLActivity r0 = org.libsdl.app.SDLActivity.mSingleton
            r1 = 1
            boolean r2 = r0.sendCommand(r1, r2)
            return r2
    }

    public static boolean setCustomCursor(int r2) {
            org.libsdl.app.SDLSurface r0 = org.libsdl.app.SDLActivity.mSurface     // Catch: java.lang.Exception -> L13
            java.util.Hashtable<java.lang.Integer, android.view.PointerIcon> r1 = org.libsdl.app.SDLActivity.mCursors     // Catch: java.lang.Exception -> L13
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L13
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Exception -> L13
            android.view.PointerIcon r2 = (android.view.PointerIcon) r2     // Catch: java.lang.Exception -> L13
            r0.setPointerIcon(r2)     // Catch: java.lang.Exception -> L13
            r2 = 1
            return r2
        L13:
            r2 = 0
            return r2
    }

    public static void setOrientation(int r1, int r2, boolean r3, java.lang.String r4) {
            org.libsdl.app.SDLActivity r0 = org.libsdl.app.SDLActivity.mSingleton
            if (r0 == 0) goto L7
            r0.setOrientationBis(r1, r2, r3, r4)
        L7:
            return
    }

    public static boolean setRelativeMouseEnabled(boolean r1) {
            if (r1 == 0) goto La
            boolean r0 = supportsRelativeMouse()
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            org.libsdl.app.SDLGenericMotionListener_API14 r0 = getMotionListener()
            boolean r1 = r0.setRelativeMouseEnabled(r1)
            return r1
    }

    public static boolean setSystemCursor(int r6) {
            r0 = 1004(0x3ec, float:1.407E-42)
            r1 = 1015(0x3f7, float:1.422E-42)
            r2 = 1014(0x3f6, float:1.421E-42)
            r3 = 1016(0x3f8, float:1.424E-42)
            r4 = 1017(0x3f9, float:1.425E-42)
            r5 = 0
            switch(r6) {
                case 0: goto L27;
                case 1: goto L24;
                case 2: goto L29;
                case 3: goto L21;
                case 4: goto L29;
                case 5: goto L1f;
                case 6: goto L1d;
                case 7: goto L1b;
                case 8: goto L19;
                case 9: goto L16;
                case 10: goto L13;
                case 11: goto L10;
                case 12: goto L1f;
                case 13: goto L19;
                case 14: goto L1d;
                case 15: goto L1b;
                case 16: goto L1f;
                case 17: goto L19;
                case 18: goto L1d;
                case 19: goto L1b;
                default: goto Le;
            }
        Le:
            r0 = r5
            goto L29
        L10:
            r0 = 1002(0x3ea, float:1.404E-42)
            goto L29
        L13:
            r0 = 1012(0x3f4, float:1.418E-42)
            goto L29
        L16:
            r0 = 1020(0x3fc, float:1.43E-42)
            goto L29
        L19:
            r0 = r1
            goto L29
        L1b:
            r0 = r2
            goto L29
        L1d:
            r0 = r3
            goto L29
        L1f:
            r0 = r4
            goto L29
        L21:
            r0 = 1007(0x3ef, float:1.411E-42)
            goto L29
        L24:
            r0 = 1008(0x3f0, float:1.413E-42)
            goto L29
        L27:
            r0 = 1000(0x3e8, float:1.401E-42)
        L29:
            org.libsdl.app.SDLSurface r6 = org.libsdl.app.SDLActivity.mSurface     // Catch: java.lang.Exception -> L38
            android.content.Context r1 = org.libsdl.app.SDL.getContext()     // Catch: java.lang.Exception -> L38
            android.view.PointerIcon r0 = android.view.PointerIcon.getSystemIcon(r1, r0)     // Catch: java.lang.Exception -> L38
            r6.setPointerIcon(r0)     // Catch: java.lang.Exception -> L38
            r6 = 1
            return r6
        L38:
            return r5
    }

    public static void setWindowStyle(boolean r2) {
            org.libsdl.app.SDLActivity r0 = org.libsdl.app.SDLActivity.mSingleton
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1 = 2
            r0.sendCommand(r1, r2)
            return
    }

    public static boolean shouldMinimizeOnFocusLoss() {
            r0 = 0
            return r0
    }

    public static boolean showFileDialog(java.lang.String[] r11, boolean r12, boolean r13, int r14) {
            org.libsdl.app.SDLActivity r0 = org.libsdl.app.SDLActivity.mSingleton
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            if (r13 == 0) goto L9
            r12 = r1
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.webkit.MimeTypeMap r2 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r3 = "*/*"
            r4 = 1
            if (r11 == 0) goto L49
            int r5 = r11.length
            r6 = r1
        L19:
            if (r6 >= r5) goto L49
            r7 = r11[r6]
            java.lang.String r8 = ";"
            java.lang.String[] r7 = r7.split(r8)
            int r8 = r7.length
            if (r8 != r4) goto L34
            r8 = r7[r1]
            java.lang.String r9 = "*"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L34
            r0.add(r3)
            goto L46
        L34:
            int r8 = r7.length
            r9 = r1
        L36:
            if (r9 >= r8) goto L46
            r10 = r7[r9]
            java.lang.String r10 = r2.getMimeTypeFromExtension(r10)
            if (r10 == 0) goto L43
            r0.add(r10)
        L43:
            int r9 = r9 + 1
            goto L36
        L46:
            int r6 = r6 + 1
            goto L19
        L49:
            android.content.Intent r11 = new android.content.Intent
            if (r13 == 0) goto L50
            java.lang.String r13 = "android.intent.action.CREATE_DOCUMENT"
            goto L52
        L50:
            java.lang.String r13 = "android.intent.action.OPEN_DOCUMENT"
        L52:
            r11.<init>(r13)
            java.lang.String r13 = "android.intent.category.OPENABLE"
            r11.addCategory(r13)
            java.lang.String r13 = "android.intent.extra.ALLOW_MULTIPLE"
            r11.putExtra(r13, r12)
            int r13 = r0.size()
            if (r13 == 0) goto L82
            if (r13 == r4) goto L78
            r11.setType(r3)
            java.lang.String[] r13 = new java.lang.String[r1]
            java.lang.Object[] r13 = r0.toArray(r13)
            java.lang.String[] r13 = (java.lang.String[]) r13
            java.lang.String r0 = "android.intent.extra.MIME_TYPES"
            r11.putExtra(r0, r13)
            goto L85
        L78:
            java.lang.Object r13 = r0.get(r1)
            java.lang.String r13 = (java.lang.String) r13
            r11.setType(r13)
            goto L85
        L82:
            r11.setType(r3)
        L85:
            org.libsdl.app.SDLActivity r13 = org.libsdl.app.SDLActivity.mSingleton     // Catch: android.content.ActivityNotFoundException -> L98
            r13.startActivityForResult(r11, r14)     // Catch: android.content.ActivityNotFoundException -> L98
            org.libsdl.app.SDLActivity$SDLFileDialogState r11 = new org.libsdl.app.SDLActivity$SDLFileDialogState
            r11.<init>()
            org.libsdl.app.SDLActivity.mFileDialogState = r11
            r11.requestCode = r14
            org.libsdl.app.SDLActivity$SDLFileDialogState r11 = org.libsdl.app.SDLActivity.mFileDialogState
            r11.multipleChoice = r12
            return r4
        L98:
            r11 = move-exception
            java.lang.String r12 = "SDL"
            java.lang.String r13 = "Unable to open file dialog."
            android.util.Log.e(r12, r13, r11)
            return r1
    }

    public static boolean showTextInput(int r8, int r9, int r10, int r11, int r12) {
            org.libsdl.app.SDLActivity r0 = org.libsdl.app.SDLActivity.mSingleton
            android.os.Handler r0 = r0.commandHandler
            org.libsdl.app.SDLActivity$ShowTextInputTask r7 = new org.libsdl.app.SDLActivity$ShowTextInputTask
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            boolean r8 = r0.post(r7)
            return r8
    }

    public static boolean showToast(java.lang.String r9, int r10, int r11, int r12, int r13) {
            org.libsdl.app.SDLActivity r0 = org.libsdl.app.SDLActivity.mSingleton
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            org.libsdl.app.SDLActivity$1OneShotTask r8 = new org.libsdl.app.SDLActivity$1OneShotTask     // Catch: java.lang.Exception -> L16
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L16
            r0.runOnUiThread(r8)     // Catch: java.lang.Exception -> L16
            r9 = 1
            return r9
        L16:
            return r1
    }

    public static boolean supportsRelativeMouse() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 >= r1) goto Le
            boolean r0 = isDeXMode()
            if (r0 == 0) goto Le
            r0 = 0
            return r0
        Le:
            org.libsdl.app.SDLGenericMotionListener_API14 r0 = getMotionListener()
            boolean r0 = r0.supportsRelativeMouse()
            return r0
    }

    protected org.libsdl.app.SDLSurface createSDLSurface(android.content.Context r2) {
            r1 = this;
            org.libsdl.app.SDLSurface r0 = new org.libsdl.app.SDLSurface
            r0.<init>(r2)
            return r0
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r4) {
            r3 = this;
            boolean r0 = org.libsdl.app.SDLActivity.mBrokenLibraries
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            int r0 = r4.getKeyCode()
            r2 = 25
            if (r0 == r2) goto L29
            r2 = 24
            if (r0 == r2) goto L29
            r2 = 27
            if (r0 == r2) goto L29
            r2 = 168(0xa8, float:2.35E-43)
            if (r0 == r2) goto L29
            r2 = 169(0xa9, float:2.37E-43)
            if (r0 != r2) goto L1f
            goto L29
        L1f:
            r0 = 1
            org.libsdl.app.SDLActivity.mDispatchingKeyEvent = r0
            boolean r4 = super.dispatchKeyEvent(r4)
            org.libsdl.app.SDLActivity.mDispatchingKeyEvent = r1
            return r4
        L29:
            return r1
    }

    protected java.lang.String[] getArguments() {
            r1 = this;
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            return r0
    }

    protected java.lang.String[] getLibraries() {
            r3 = this;
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "SDL3"
            r0[r1] = r2
            r1 = 1
            java.lang.String r2 = "main"
            r0[r1] = r2
            return r0
    }

    protected java.lang.String getMainFunction() {
            r1 = this;
            java.lang.String r0 = "SDL_main"
            return r0
    }

    protected java.lang.String getMainSharedObject() {
            r3 = this;
            org.libsdl.app.SDLActivity r0 = org.libsdl.app.SDLActivity.mSingleton
            java.lang.String[] r0 = r0.getLibraries()
            int r1 = r0.length
            if (r1 <= 0) goto L24
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "lib"
            r1.<init>(r2)
            int r2 = r0.length
            int r2 = r2 + (-1)
            r0 = r0[r2]
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = ".so"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L26
        L24:
            java.lang.String r0 = "libmain.so"
        L26:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            android.content.Context r2 = getContext()
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            java.lang.String r2 = r2.nativeLibraryDir
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "/"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void loadLibraries() {
            r4 = this;
            java.lang.String[] r0 = r4.getLibraries()
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L10
            r3 = r0[r2]
            org.libsdl.app.SDL.loadLibrary(r3, r4)
            int r2 = r2 + 1
            goto L6
        L10:
            return
    }

    protected void main() {
            r5 = this;
            org.libsdl.app.SDLActivity r0 = org.libsdl.app.SDLActivity.mSingleton
            java.lang.String r0 = r0.getMainSharedObject()
            org.libsdl.app.SDLActivity r1 = org.libsdl.app.SDLActivity.mSingleton
            java.lang.String r1 = r1.getMainFunction()
            org.libsdl.app.SDLActivity r2 = org.libsdl.app.SDLActivity.mSingleton
            java.lang.String[] r2 = r2.getArguments()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Running main function "
            r3.<init>(r4)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r4 = " from library "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "SDL"
            android.util.Log.v(r4, r3)
            nativeRunMain(r0, r1, r2)
            java.lang.String r0 = "Finished main function"
            android.util.Log.v(r4, r0)
            return
    }

    protected void messageboxCreateAndShow(android.os.Bundle r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = "colors"
            int[] r2 = r1.getIntArray(r2)
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L1c
            r6 = r2[r5]
            r7 = r2[r4]
            r8 = r2[r3]
            r8 = 3
            r8 = r2[r8]
            r9 = 4
            r2 = r2[r9]
            goto L1f
        L1c:
            r6 = r5
            r7 = r6
            r8 = r7
        L1f:
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            r2.<init>(r0)
            android.app.AlertDialog r2 = r2.create()
            java.lang.String r9 = "title"
            java.lang.String r9 = r1.getString(r9)
            r2.setTitle(r9)
            r2.setCancelable(r5)
            org.libsdl.app.SDLActivity$4 r9 = new org.libsdl.app.SDLActivity$4
            r9.<init>(r0)
            r2.setOnDismissListener(r9)
            android.widget.TextView r9 = new android.widget.TextView
            r9.<init>(r0)
            r10 = 17
            r9.setGravity(r10)
            java.lang.String r11 = "message"
            java.lang.String r11 = r1.getString(r11)
            r9.setText(r11)
            if (r7 == 0) goto L54
            r9.setTextColor(r7)
        L54:
            java.lang.String r11 = "buttonFlags"
            int[] r11 = r1.getIntArray(r11)
            java.lang.String r12 = "buttonIds"
            int[] r12 = r1.getIntArray(r12)
            java.lang.String r13 = "buttonTexts"
            java.lang.String[] r1 = r1.getStringArray(r13)
            android.util.SparseArray r13 = new android.util.SparseArray
            r13.<init>()
            android.widget.LinearLayout r14 = new android.widget.LinearLayout
            r14.<init>(r0)
            r14.setOrientation(r5)
            r14.setGravity(r10)
        L76:
            int r10 = r1.length
            if (r5 >= r10) goto Lc1
            android.widget.Button r10 = new android.widget.Button
            r10.<init>(r0)
            r15 = r12[r5]
            org.libsdl.app.SDLActivity$5 r4 = new org.libsdl.app.SDLActivity$5
            r4.<init>(r0, r15, r2)
            r10.setOnClickListener(r4)
            r4 = r11[r5]
            if (r4 == 0) goto L9f
            r4 = r4 & 1
            if (r4 == 0) goto L95
            r4 = 66
            r13.put(r4, r10)
        L95:
            r4 = r11[r5]
            r4 = r4 & r3
            if (r4 == 0) goto L9f
            r4 = 111(0x6f, float:1.56E-43)
            r13.put(r4, r10)
        L9f:
            r4 = r1[r5]
            r10.setText(r4)
            if (r7 == 0) goto La9
            r10.setTextColor(r7)
        La9:
            if (r8 == 0) goto Lba
            android.graphics.drawable.Drawable r4 = r10.getBackground()
            if (r4 != 0) goto Lb5
            r10.setBackgroundColor(r8)
            goto Lba
        Lb5:
            android.graphics.PorterDuff$Mode r15 = android.graphics.PorterDuff.Mode.MULTIPLY
            r4.setColorFilter(r8, r15)
        Lba:
            r14.addView(r10)
            int r5 = r5 + 1
            r4 = 1
            goto L76
        Lc1:
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r0)
            r3 = 1
            r1.setOrientation(r3)
            r1.addView(r9)
            r1.addView(r14)
            if (r6 == 0) goto Ld5
            r1.setBackgroundColor(r6)
        Ld5:
            r2.setView(r1)
            org.libsdl.app.SDLActivity$6 r1 = new org.libsdl.app.SDLActivity$6
            r1.<init>(r0, r13)
            r2.setOnKeyListener(r1)
            r2.show()
            return
    }

    public int messageboxShowMessageBox(int r5, java.lang.String r6, java.lang.String r7, int[] r8, int[] r9, java.lang.String[] r10, int[] r11) {
            r4 = this;
            int[] r0 = r4.messageboxSelection
            r1 = 0
            r2 = -1
            r0[r1] = r2
            int r0 = r8.length
            int r3 = r9.length
            if (r0 == r3) goto Lf
            int r0 = r9.length
            int r3 = r10.length
            if (r0 == r3) goto Lf
            return r2
        Lf:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r3 = "flags"
            r0.putInt(r3, r5)
            java.lang.String r5 = "title"
            r0.putString(r5, r6)
            java.lang.String r5 = "message"
            r0.putString(r5, r7)
            java.lang.String r5 = "buttonFlags"
            r0.putIntArray(r5, r8)
            java.lang.String r5 = "buttonIds"
            r0.putIntArray(r5, r9)
            java.lang.String r5 = "buttonTexts"
            r0.putStringArray(r5, r10)
            java.lang.String r5 = "colors"
            r0.putIntArray(r5, r11)
            org.libsdl.app.SDLActivity$3 r5 = new org.libsdl.app.SDLActivity$3
            r5.<init>(r4, r0)
            r4.runOnUiThread(r5)
            int[] r5 = r4.messageboxSelection
            monitor-enter(r5)
            int[] r6 = r4.messageboxSelection     // Catch: java.lang.Throwable -> L4d java.lang.InterruptedException -> L4f
            r6.wait()     // Catch: java.lang.Throwable -> L4d java.lang.InterruptedException -> L4f
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4d
            int[] r5 = r4.messageboxSelection
            r5 = r5[r1]
            return r5
        L4d:
            r6 = move-exception
            goto L55
        L4f:
            r6 = move-exception
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4d
            return r2
        L55:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4d
            throw r6
    }

    @Override // android.app.Activity
    protected void onActivityResult(int r4, int r5, android.content.Intent r6) {
            r3 = this;
            super.onActivityResult(r4, r5, r6)
            org.libsdl.app.SDLActivity$SDLFileDialogState r5 = org.libsdl.app.SDLActivity.mFileDialogState
            if (r5 == 0) goto L44
            int r5 = r5.requestCode
            if (r5 != r4) goto L44
            r5 = 0
            if (r6 == 0) goto L3b
            android.net.Uri r0 = r6.getData()
            if (r0 != 0) goto L31
            android.content.ClipData r6 = r6.getClipData()
            int r0 = r6.getItemCount()
            java.lang.String[] r1 = new java.lang.String[r0]
        L1e:
            if (r5 >= r0) goto L3d
            android.content.ClipData$Item r2 = r6.getItemAt(r5)
            android.net.Uri r2 = r2.getUri()
            java.lang.String r2 = r2.toString()
            r1[r5] = r2
            int r5 = r5 + 1
            goto L1e
        L31:
            r6 = 1
            java.lang.String[] r1 = new java.lang.String[r6]
            java.lang.String r6 = r0.toString()
            r1[r5] = r6
            goto L3d
        L3b:
            java.lang.String[] r1 = new java.lang.String[r5]
        L3d:
            r5 = -1
            onNativeFileDialog(r4, r1, r5)
            r4 = 0
            org.libsdl.app.SDLActivity.mFileDialogState = r4
        L44:
            return
    }

    @Override // android.app.Activity
    public void onBackPressed() {
            r2 = this;
            java.lang.String r0 = "SDL_ANDROID_TRAP_BACK_BUTTON"
            r1 = 0
            boolean r0 = nativeGetHintBoolean(r0, r1)
            if (r0 == 0) goto La
            return
        La:
            boolean r0 = r2.isFinishing()
            if (r0 != 0) goto L13
            super.onBackPressed()
        L13:
            return
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r3) {
            r2 = this;
            java.lang.String r0 = "SDL"
            java.lang.String r1 = "onConfigurationChanged()"
            android.util.Log.v(r0, r1)
            super.onConfigurationChanged(r3)
            boolean r0 = org.libsdl.app.SDLActivity.mBrokenLibraries
            if (r0 == 0) goto Lf
            return
        Lf:
            java.util.Locale r0 = org.libsdl.app.SDLActivity.mCurrentLocale
            if (r0 == 0) goto L1b
            java.util.Locale r1 = r3.locale
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L22
        L1b:
            java.util.Locale r0 = r3.locale
            org.libsdl.app.SDLActivity.mCurrentLocale = r0
            onNativeLocaleChanged()
        L22:
            int r3 = r3.uiMode
            r3 = r3 & 48
            r0 = 16
            if (r3 == r0) goto L34
            r0 = 32
            if (r3 == r0) goto L2f
            goto L38
        L2f:
            r3 = 1
            onNativeDarkModeChanged(r3)
            goto L38
        L34:
            r3 = 0
            onNativeDarkModeChanged(r3)
        L38:
            return
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle r7) {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Manufacturer: "
            r0.<init>(r1)
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "SDL"
            android.util.Log.v(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Device: "
            r0.<init>(r2)
            java.lang.String r2 = android.os.Build.DEVICE
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Model: "
            r0.<init>(r2)
            java.lang.String r2 = android.os.Build.MODEL
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r1, r0)
            java.lang.String r0 = "onCreate()"
            android.util.Log.v(r1, r0)
            super/*net.java.openjdk.cacio.ctc.FCMInternalWrapper*/.invokeMethod(r7, r0, r0, r0)
            boolean r7 = org.libsdl.app.SDLActivity.mSDLMainFinished
            r0 = 0
            if (r7 != 0) goto L4f
            boolean r7 = org.libsdl.app.SDLActivity.mActivityCreated
            if (r7 == 0) goto L63
        L4f:
            boolean r7 = nativeAllowRecreateActivity()
            boolean r2 = org.libsdl.app.SDLActivity.mSDLMainFinished
            if (r2 == 0) goto L5c
            java.lang.String r2 = "SDL main() finished"
            android.util.Log.v(r1, r2)
        L5c:
            if (r7 == 0) goto L241
            java.lang.String r7 = "activity re-created"
            android.util.Log.v(r1, r7)
        L63:
            r7 = 1
            org.libsdl.app.SDLActivity.mActivityCreated = r7
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Exception -> L70
            java.lang.String r3 = "SDLActivity"
            r2.setName(r3)     // Catch: java.lang.Exception -> L70
            goto L87
        L70:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "modify thread properties failed "
            r3.<init>(r4)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r1, r2)
        L87:
            r6.loadLibraries()     // Catch: java.lang.Exception -> L8f java.lang.UnsatisfiedLinkError -> La0
            org.libsdl.app.SDLActivity.mBrokenLibraries = r0     // Catch: java.lang.Exception -> L8f java.lang.UnsatisfiedLinkError -> La0
            java.lang.String r2 = ""
            goto Lb0
        L8f:
            r2 = move-exception
            java.io.PrintStream r3 = java.lang.System.err
            java.lang.String r4 = r2.getMessage()
            r3.println(r4)
            org.libsdl.app.SDLActivity.mBrokenLibraries = r7
            java.lang.String r2 = r2.getMessage()
            goto Lb0
        La0:
            r2 = move-exception
            java.io.PrintStream r3 = java.lang.System.err
            java.lang.String r4 = r2.getMessage()
            r3.println(r4)
            org.libsdl.app.SDLActivity.mBrokenLibraries = r7
            java.lang.String r2 = r2.getMessage()
        Lb0:
            boolean r3 = org.libsdl.app.SDLActivity.mBrokenLibraries
            if (r3 != 0) goto L10e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 3
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = "."
            java.lang.StringBuilder r3 = r3.append(r4)
            r5 = 2
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.StringBuilder r3 = r3.append(r4)
            r4 = 20
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = nativeGetVersion()
            boolean r5 = r4.equals(r3)
            if (r5 != 0) goto L10e
            org.libsdl.app.SDLActivity.mBrokenLibraries = r7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "SDL C/Java version mismatch (expected "
            r2.<init>(r5)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ", got "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r3 = ")"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
        L10e:
            boolean r3 = org.libsdl.app.SDLActivity.mBrokenLibraries
            if (r3 == 0) goto L15d
            org.libsdl.app.SDLActivity.mSingleton = r6
            android.app.AlertDialog$Builder r7 = new android.app.AlertDialog$Builder
            r7.<init>(r6)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "An error occurred while trying to start the application. Please try again and/or reinstall."
            r1.<init>(r3)
            java.lang.String r3 = "line.separator"
            java.lang.String r4 = java.lang.System.getProperty(r3)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r3 = java.lang.System.getProperty(r3)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r3 = "Error: "
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r7.setMessage(r1)
            java.lang.String r1 = "SDL Error"
            r7.setTitle(r1)
            org.libsdl.app.SDLActivity$1 r1 = new org.libsdl.app.SDLActivity$1
            r1.<init>(r6)
            java.lang.String r2 = "Exit"
            r7.setPositiveButton(r2, r1)
            r7.setCancelable(r0)
            android.app.AlertDialog r7 = r7.create()
            r7.show()
            return
        L15d:
            int r2 = nativeCheckSDLThreadCounter()
            if (r2 == 0) goto L192
            boolean r3 = nativeAllowRecreateActivity()
            if (r3 == 0) goto L17c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "activity re-created // run_count: "
            r3.<init>(r4)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r1, r2)
            goto L192
        L17c:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r3 = "activity finished // run_count: "
            r7.<init>(r3)
            java.lang.StringBuilder r7 = r7.append(r2)
            java.lang.String r7 = r7.toString()
            android.util.Log.v(r1, r7)
            java.lang.System.exit(r0)
            return
        L192:
            org.libsdl.app.SDL.setupJNI()
            org.libsdl.app.SDL.initialize()
            org.libsdl.app.SDLActivity.mSingleton = r6
            org.libsdl.app.SDL.setContext(r6)
            org.libsdl.app.SDLClipboardHandler r2 = new org.libsdl.app.SDLClipboardHandler
            r2.<init>()
            org.libsdl.app.SDLActivity.mClipboardHandler = r2
            org.libsdl.app.HIDDeviceManager r2 = org.libsdl.app.HIDDeviceManager.acquire(r6)
            org.libsdl.app.SDLActivity.mHIDDeviceManager = r2
            org.libsdl.app.SDLSurface r2 = r6.createSDLSurface(r6)
            org.libsdl.app.SDLActivity.mSurface = r2
            android.widget.RelativeLayout r2 = new android.widget.RelativeLayout
            r2.<init>(r6)
            org.libsdl.app.SDLActivity.mLayout = r2
            org.libsdl.app.SDLSurface r3 = org.libsdl.app.SDLActivity.mSurface
            r2.addView(r3)
            int r2 = getNaturalOrientation()
            nativeSetNaturalOrientation(r2)
            int r2 = getCurrentRotation()
            org.libsdl.app.SDLActivity.mCurrentRotation = r2
            onNativeRotationChanged(r2)
            android.content.Context r2 = getContext()     // Catch: java.lang.Exception -> L1e2
            android.content.res.Resources r2 = r2.getResources()     // Catch: java.lang.Exception -> L1e2
            android.content.res.Configuration r2 = r2.getConfiguration()     // Catch: java.lang.Exception -> L1e2
            android.os.LocaleList r2 = r2.getLocales()     // Catch: java.lang.Exception -> L1e2
            java.util.Locale r2 = r2.get(r0)     // Catch: java.lang.Exception -> L1e2
            org.libsdl.app.SDLActivity.mCurrentLocale = r2     // Catch: java.lang.Exception -> L1e2
        L1e2:
            android.content.Context r2 = getContext()
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.uiMode
            r2 = r2 & 48
            r3 = 16
            if (r2 == r3) goto L1ff
            r3 = 32
            if (r2 == r3) goto L1fb
            goto L202
        L1fb:
            onNativeDarkModeChanged(r7)
            goto L202
        L1ff:
            onNativeDarkModeChanged(r0)
        L202:
            android.view.ViewGroup r7 = org.libsdl.app.SDLActivity.mLayout
            r6.setContentView(r7)
            setWindowStyle(r0)
            android.view.Window r7 = r6.getWindow()
            android.view.View r7 = r7.getDecorView()
            r7.setOnSystemUiVisibilityChangeListener(r6)
            android.content.Intent r7 = r6.getIntent()
            if (r7 == 0) goto L240
            android.net.Uri r0 = r7.getData()
            if (r0 == 0) goto L240
            android.net.Uri r7 = r7.getData()
            java.lang.String r7 = r7.getPath()
            if (r7 == 0) goto L240
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Got filename: "
            r0.<init>(r2)
            java.lang.StringBuilder r0 = r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r1, r0)
            onNativeDropFile(r7)
        L240:
            return
        L241:
            java.lang.String r7 = "activity finished"
            android.util.Log.v(r1, r7)
            java.lang.System.exit(r0)
            return
    }

    @Override // android.app.Activity
    protected void onDestroy() {
            r4 = this;
            java.lang.String r0 = "onDestroy()"
            java.lang.String r1 = "SDL"
            android.util.Log.v(r1, r0)
            org.libsdl.app.HIDDeviceManager r0 = org.libsdl.app.SDLActivity.mHIDDeviceManager
            if (r0 == 0) goto L11
            org.libsdl.app.HIDDeviceManager.release(r0)
            r0 = 0
            org.libsdl.app.SDLActivity.mHIDDeviceManager = r0
        L11:
            org.libsdl.app.SDLAudioManager.release(r4)
            boolean r0 = org.libsdl.app.SDLActivity.mBrokenLibraries
            if (r0 == 0) goto L1c
            super.getClass()
            return
        L1c:
            java.lang.Thread r0 = org.libsdl.app.SDLActivity.mSDLThread
            if (r0 == 0) goto L3e
            nativeSendQuit()
            java.lang.Thread r0 = org.libsdl.app.SDLActivity.mSDLThread     // Catch: java.lang.Exception -> L2b
            r2 = 1000(0x3e8, double:4.94E-321)
            r0.join(r2)     // Catch: java.lang.Exception -> L2b
            goto L3e
        L2b:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Problem stopping SDLThread: "
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r1, r0)
        L3e:
            nativeQuit()
            super.getClass()
            return
    }

    @Override // android.app.Activity
    protected void onPause() {
            r2 = this;
            java.lang.String r0 = "SDL"
            java.lang.String r1 = "onPause()"
            android.util.Log.v(r0, r1)
            super/*java.lang.Class*/.getDeclaredMethod(r0, r0)
            org.libsdl.app.HIDDeviceManager r0 = org.libsdl.app.SDLActivity.mHIDDeviceManager
            if (r0 == 0) goto L12
            r1 = 1
            r0.setFrozen(r1)
        L12:
            boolean r0 = org.libsdl.app.SDLActivity.mHasMultiWindow
            if (r0 != 0) goto L19
            r2.pauseNativeThread()
        L19:
            return
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int r2, java.lang.String[] r3, int[] r4) {
            r1 = this;
            int r3 = r4.length
            r0 = 0
            if (r3 <= 0) goto L9
            r3 = r4[r0]
            if (r3 != 0) goto L9
            r0 = 1
        L9:
            nativePermissionResult(r2, r0)
            return
    }

    @Override // android.app.Activity
    protected void onResume() {
            r2 = this;
            java.lang.String r0 = "SDL"
            java.lang.String r1 = "onResume()"
            android.util.Log.v(r0, r1)
            super/*java.lang.reflect.Method*/.setAccessible(r0)
            org.libsdl.app.HIDDeviceManager r0 = org.libsdl.app.SDLActivity.mHIDDeviceManager
            if (r0 == 0) goto L12
            r1 = 0
            r0.setFrozen(r1)
        L12:
            boolean r0 = org.libsdl.app.SDLActivity.mHasMultiWindow
            if (r0 != 0) goto L19
            r2.resumeNativeThread()
        L19:
            return
    }

    @Override // android.app.Activity
    protected void onStart() {
            r2 = this;
            java.lang.String r0 = "SDL"
            java.lang.String r1 = "onStart()"
            android.util.Log.v(r0, r1)
            super/*java.lang.reflect.Method*/.invoke(r0, r0)
            boolean r0 = org.libsdl.app.SDLActivity.mHasMultiWindow
            if (r0 == 0) goto L11
            r2.resumeNativeThread()
        L11:
            return
    }

    @Override // android.app.Activity
    protected void onStop() {
            r2 = this;
            java.lang.String r0 = "SDL"
            java.lang.String r1 = "onStop()"
            android.util.Log.v(r0, r1)
            super.onStop()
            boolean r0 = org.libsdl.app.SDLActivity.mHasMultiWindow
            if (r0 == 0) goto L11
            r2.pauseNativeThread()
        L11:
            return
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public void onSystemUiVisibilityChange(int r4) {
            r3 = this;
            boolean r0 = org.libsdl.app.SDLActivity.mFullscreenModeActive
            if (r0 == 0) goto L26
            r0 = r4 & 4
            if (r0 == 0) goto Lc
            r4 = r4 & 2
            if (r4 != 0) goto L26
        Lc:
            android.view.Window r4 = r3.getWindow()
            android.view.View r4 = r4.getDecorView()
            android.os.Handler r4 = r4.getHandler()
            if (r4 == 0) goto L26
            java.lang.Runnable r0 = r3.rehideSystemUi
            r4.removeCallbacks(r0)
            java.lang.Runnable r0 = r3.rehideSystemUi
            r1 = 2000(0x7d0, double:9.88E-321)
            r4.postDelayed(r0, r1)
        L26:
            return
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int r3) {
            r2 = this;
            java.lang.String r0 = "SDL"
            java.lang.String r1 = "onTrimMemory()"
            android.util.Log.v(r0, r1)
            super.onTrimMemory(r3)
            boolean r3 = org.libsdl.app.SDLActivity.mBrokenLibraries
            if (r3 == 0) goto Lf
            return
        Lf:
            nativeLowMemory()
            return
    }

    protected boolean onUnhandledMessage(int r1, java.lang.Object r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean r3) {
            r2 = this;
            super/*java.lang.RuntimeException*/.<init>(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onWindowFocusChanged(): "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "SDL"
            android.util.Log.v(r1, r0)
            boolean r0 = org.libsdl.app.SDLActivity.mBrokenLibraries
            if (r0 == 0) goto L1c
            return
        L1c:
            org.libsdl.app.SDLActivity.mHasFocus = r3
            if (r3 == 0) goto L33
            org.libsdl.app.SDLActivity$NativeState r3 = org.libsdl.app.SDLActivity.NativeState.RESUMED
            org.libsdl.app.SDLActivity.mNextNativeState = r3
            org.libsdl.app.SDLGenericMotionListener_API14 r3 = getMotionListener()
            r3.reclaimRelativeMouseModeIfNeeded()
            handleNativeState()
            r3 = 1
            nativeFocusChanged(r3)
            goto L42
        L33:
            r3 = 0
            nativeFocusChanged(r3)
            boolean r3 = org.libsdl.app.SDLActivity.mHasMultiWindow
            if (r3 != 0) goto L42
            org.libsdl.app.SDLActivity$NativeState r3 = org.libsdl.app.SDLActivity.NativeState.PAUSED
            org.libsdl.app.SDLActivity.mNextNativeState = r3
            handleNativeState()
        L42:
            return
    }

    protected void pauseNativeThread() {
            r1 = this;
            org.libsdl.app.SDLActivity$NativeState r0 = org.libsdl.app.SDLActivity.NativeState.PAUSED
            org.libsdl.app.SDLActivity.mNextNativeState = r0
            r0 = 0
            org.libsdl.app.SDLActivity.mIsResumedCalled = r0
            boolean r0 = org.libsdl.app.SDLActivity.mBrokenLibraries
            if (r0 == 0) goto Lc
            return
        Lc:
            handleNativeState()
            return
    }

    public void pressBackButton() {
            r1 = this;
            org.libsdl.app.SDLActivity$2 r0 = new org.libsdl.app.SDLActivity$2
            r0.<init>(r1)
            r1.runOnUiThread(r0)
            return
    }

    protected void resumeNativeThread() {
            r1 = this;
            org.libsdl.app.SDLActivity$NativeState r0 = org.libsdl.app.SDLActivity.NativeState.RESUMED
            org.libsdl.app.SDLActivity.mNextNativeState = r0
            r0 = 1
            org.libsdl.app.SDLActivity.mIsResumedCalled = r0
            boolean r0 = org.libsdl.app.SDLActivity.mBrokenLibraries
            if (r0 == 0) goto Lc
            return
        Lc:
            handleNativeState()
            return
    }

    protected boolean sendCommand(int r6, java.lang.Object r7) {
            r5 = this;
            android.os.Handler r0 = r5.commandHandler
            android.os.Message r0 = r0.obtainMessage()
            r0.arg1 = r6
            r0.obj = r7
            android.os.Handler r1 = r5.commandHandler
            boolean r0 = r1.sendMessage(r0)
            r1 = 2
            if (r6 != r1) goto L6d
            boolean r6 = r7 instanceof java.lang.Integer
            r1 = 0
            if (r6 == 0) goto L4c
            java.lang.String r6 = "window"
            java.lang.Object r6 = r5.getSystemService(r6)
            android.view.WindowManager r6 = (android.view.WindowManager) r6
            android.view.Display r6 = r6.getDefaultDisplay()
            android.util.DisplayMetrics r2 = new android.util.DisplayMetrics
            r2.<init>()
            r6.getRealMetrics(r2)
            int r6 = r2.widthPixels
            org.libsdl.app.SDLSurface r3 = org.libsdl.app.SDLActivity.mSurface
            int r3 = r3.getWidth()
            r4 = 1
            if (r6 != r3) goto L42
            int r6 = r2.heightPixels
            org.libsdl.app.SDLSurface r2 = org.libsdl.app.SDLActivity.mSurface
            int r2 = r2.getHeight()
            if (r6 != r2) goto L42
            r1 = r4
        L42:
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r6 = r7.intValue()
            if (r6 != r4) goto L4c
            r1 = r1 ^ 1
        L4c:
            if (r1 == 0) goto L6d
            android.content.Context r6 = getContext()
            if (r6 == 0) goto L6d
            android.content.Context r6 = getContext()
            monitor-enter(r6)
            android.content.Context r7 = getContext()     // Catch: java.lang.Throwable -> L63 java.lang.InterruptedException -> L65
            r1 = 500(0x1f4, double:2.47E-321)
            r7.wait(r1)     // Catch: java.lang.Throwable -> L63 java.lang.InterruptedException -> L65
            goto L69
        L63:
            r7 = move-exception
            goto L6b
        L65:
            r7 = move-exception
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L63
        L69:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L63
            goto L6d
        L6b:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L63
            throw r7
        L6d:
            return r0
    }

    public void setOrientationBis(int r8, int r9, boolean r10, java.lang.String r11) {
            r7 = this;
            java.lang.String r0 = "LandscapeRight"
            boolean r1 = r11.contains(r0)
            java.lang.String r2 = "LandscapeLeft"
            r3 = 0
            r4 = -1
            if (r1 == 0) goto L15
            boolean r1 = r11.contains(r2)
            if (r1 == 0) goto L15
            r0 = 11
            goto L27
        L15:
            boolean r1 = r11.contains(r2)
            if (r1 == 0) goto L1d
            r0 = r3
            goto L27
        L1d:
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto L26
            r0 = 8
            goto L27
        L26:
            r0 = r4
        L27:
            java.lang.String r1 = "Portrait "
            boolean r1 = r11.contains(r1)
            r2 = 1
            if (r1 != 0) goto L3b
            java.lang.String r1 = "Portrait"
            boolean r1 = r11.endsWith(r1)
            if (r1 == 0) goto L39
            goto L3b
        L39:
            r1 = r3
            goto L3c
        L3b:
            r1 = r2
        L3c:
            java.lang.String r5 = "PortraitUpsideDown"
            if (r1 == 0) goto L49
            boolean r6 = r11.contains(r5)
            if (r6 == 0) goto L49
            r1 = 12
            goto L57
        L49:
            if (r1 == 0) goto L4d
            r1 = r2
            goto L57
        L4d:
            boolean r1 = r11.contains(r5)
            if (r1 == 0) goto L56
            r1 = 9
            goto L57
        L56:
            r1 = r4
        L57:
            if (r0 == r4) goto L5b
            r5 = r2
            goto L5c
        L5b:
            r5 = r3
        L5c:
            if (r1 == r4) goto L5f
            r3 = r2
        L5f:
            r2 = 13
            if (r3 != 0) goto L6e
            if (r5 != 0) goto L6e
            if (r10 == 0) goto L68
            goto L84
        L68:
            if (r8 <= r9) goto L6c
            r0 = 6
            goto L83
        L6c:
            r0 = 7
            goto L83
        L6e:
            if (r10 == 0) goto L7a
            if (r3 == 0) goto L75
            if (r5 == 0) goto L75
            goto L84
        L75:
            if (r5 == 0) goto L78
            goto L83
        L78:
            r0 = r1
            goto L83
        L7a:
            if (r3 == 0) goto L81
            if (r5 == 0) goto L81
            if (r8 <= r9) goto L78
            goto L83
        L81:
            if (r5 == 0) goto L78
        L83:
            r2 = r0
        L84:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setOrientation() requestedOrientation="
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r1 = " width="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r8 = r0.append(r8)
            java.lang.String r0 = " height="
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r9 = " resizable="
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r8 = r8.append(r10)
            java.lang.String r9 = " hint="
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r8 = r8.append(r11)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "SDL"
            android.util.Log.v(r9, r8)
            org.libsdl.app.SDLActivity r8 = org.libsdl.app.SDLActivity.mSingleton
            r8.setRequestedOrientation(r2)
            return
    }

    public void superOnBackPressed() {
            r0 = this;
            super.onBackPressed()
            return
    }
}
