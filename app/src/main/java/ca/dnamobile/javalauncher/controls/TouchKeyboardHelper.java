package ca.dnamobile.javalauncher.controls;

/* JADX INFO: loaded from: classes.dex */
final class TouchKeyboardHelper {
    private static final long CHAT_KEYBOARD_MODE_GRACE_MS = 10000;
    private static final int DEFAULT_CLEAR_BACKSPACES = 64;
    static final java.lang.String DEFAULT_WORLD_NAME_TEXT = "New World";
    private static final int GLFW_PRESS_KEY_BACKSPACE = 259;
    private static final int GLFW_PRESS_KEY_ENTER = 257;
    private static final int GLFW_PRESS_KEY_ESCAPE = 256;
    private static final java.lang.String TAG = "TouchKeyboardHelper";
    private static ca.dnamobile.javalauncher.controls.TouchKeyboardHelper.KeyboardInputOverlay activeOverlay;
    private static long lastChatKeyPressUptimeMs;

    private static final class KeyboardInputOverlay extends android.widget.FrameLayout {
        private boolean closing;
        private final android.os.Handler handler;
        private final android.widget.EditText input;
        private boolean internalChange;
        private java.lang.String lastText;
        private final android.widget.LinearLayout panel;
        private final android.widget.TextView preview;
        private final boolean submitSendsEnter;


        /* JADX INFO: renamed from: $r8$lambda$Lknb-iXHhVhXoZJGBe68I54DuZw, reason: not valid java name */
        public static /* synthetic */ void m435$r8$lambda$LknbiXHhVhXoZJGBe68I54DuZw(ca.dnamobile.javalauncher.controls.TouchKeyboardHelper.KeyboardInputOverlay r0) {
                r0.showSoftInputAgain()
                return
        }

        public static /* synthetic */ boolean $r8$lambda$NJqk34SvrBZpxM1JmTBOkkDXWBo(ca.dnamobile.javalauncher.controls.TouchKeyboardHelper.KeyboardInputOverlay r0, android.widget.TextView r1, int r2, android.view.KeyEvent r3) {
                boolean r0 = r0.lambda$new$3(r1, r2, r3)
                return r0
        }

        public static /* synthetic */ void $r8$lambda$nekmawezN94tS84VQuHcjaqQe58(ca.dnamobile.javalauncher.controls.TouchKeyboardHelper.KeyboardInputOverlay r0, android.view.View r1) {
                r0.lambda$new$0(r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$qKfWUeOPISQvuWxGLit86fDZCNc(ca.dnamobile.javalauncher.controls.TouchKeyboardHelper.KeyboardInputOverlay r0) {
                r0.lambda$rebaseAfterExternalMinecraftEdit$5()
                return
        }

        public static /* synthetic */ void $r8$lambda$qlZNv4ktXZ9KhfCzpxK6dmdCBNo(ca.dnamobile.javalauncher.controls.TouchKeyboardHelper.KeyboardInputOverlay r0, android.view.View r1) {
                r0.lambda$new$1(r1)
                return
        }

        /* JADX INFO: renamed from: -$$Nest$fgetclosing, reason: not valid java name */
        static /* bridge */ /* synthetic */ boolean m436$$Nest$fgetclosing(ca.dnamobile.javalauncher.controls.TouchKeyboardHelper.KeyboardInputOverlay r0) {
                boolean r0 = r0.closing
                return r0
        }

        /* JADX INFO: renamed from: -$$Nest$fgetinternalChange, reason: not valid java name */
        static /* bridge */ /* synthetic */ boolean m437$$Nest$fgetinternalChange(ca.dnamobile.javalauncher.controls.TouchKeyboardHelper.KeyboardInputOverlay r0) {
                boolean r0 = r0.internalChange
                return r0
        }

        /* JADX INFO: renamed from: -$$Nest$fgetlastText, reason: not valid java name */
        static /* bridge */ /* synthetic */ java.lang.String m438$$Nest$fgetlastText(ca.dnamobile.javalauncher.controls.TouchKeyboardHelper.KeyboardInputOverlay r0) {
                java.lang.String r0 = r0.lastText
                return r0
        }

        /* JADX INFO: renamed from: -$$Nest$fputlastText, reason: not valid java name */
        static /* bridge */ /* synthetic */ void m439$$Nest$fputlastText(ca.dnamobile.javalauncher.controls.TouchKeyboardHelper.KeyboardInputOverlay r0, java.lang.String r1) {
                r0.lastText = r1
                return
        }

        /* JADX INFO: renamed from: -$$Nest$mdispatchTextDelta, reason: not valid java name */
        static /* bridge */ /* synthetic */ void m440$$Nest$mdispatchTextDelta(ca.dnamobile.javalauncher.controls.TouchKeyboardHelper.KeyboardInputOverlay r0, java.lang.String r1, java.lang.String r2) {
                r0.dispatchTextDelta(r1, r2)
                return
        }

        /* JADX INFO: renamed from: -$$Nest$mupdatePreview, reason: not valid java name */
        static /* bridge */ /* synthetic */ void m441$$Nest$mupdatePreview(ca.dnamobile.javalauncher.controls.TouchKeyboardHelper.KeyboardInputOverlay r0, java.lang.String r1) {
                r0.updatePreview(r1)
                return
        }

        KeyboardInputOverlay(android.content.Context r11, boolean r12, java.lang.String r13, boolean r14) {
                r10 = this;
                r10.<init>(r11)
                android.os.Handler r0 = new android.os.Handler
                android.os.Looper r1 = android.os.Looper.getMainLooper()
                r0.<init>(r1)
                r10.handler = r0
                java.lang.String r0 = ""
                r10.lastText = r0
                r10.submitSendsEnter = r12
                r0 = 0
                r10.setClickable(r0)
                r10.setFocusable(r0)
                r10.setFocusableInTouchMode(r0)
                r10.setClipChildren(r0)
                r10.setClipToPadding(r0)
                android.widget.LinearLayout r1 = new android.widget.LinearLayout
                r1.<init>(r11)
                r10.panel = r1
                r2 = 1
                r1.setOrientation(r2)
                r3 = 1096810496(0x41600000, float:14.0)
                int r4 = r10.dp(r3)
                r5 = 1092616192(0x41200000, float:10.0)
                int r6 = r10.dp(r5)
                int r3 = r10.dp(r3)
                int r5 = r10.dp(r5)
                r1.setPadding(r4, r6, r3, r5)
                android.graphics.drawable.GradientDrawable r3 = r10.makePanelBackground()
                r1.setBackground(r3)
                r1.setClickable(r2)
                r1.setFocusable(r0)
                android.widget.TextView r3 = new android.widget.TextView
                r3.<init>(r11)
                java.lang.String r4 = "Android keyboard input"
                r3.setText(r4)
                r4 = -1
                r3.setTextColor(r4)
                r5 = 1095761920(0x41500000, float:13.0)
                r3.setTextSize(r5)
                android.graphics.Typeface r5 = android.graphics.Typeface.DEFAULT_BOLD
                r3.setTypeface(r5)
                android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
                r6 = -2
                r5.<init>(r4, r6)
                r1.addView(r3, r5)
                android.widget.TextView r3 = new android.widget.TextView
                r3.<init>(r11)
                r10.preview = r3
                java.lang.String r5 = "Type here…"
                r3.setText(r5)
                r5 = -2039584(0xffffffffffe0e0e0, float:NaN)
                r3.setTextColor(r5)
                r5 = 1099956224(0x41900000, float:18.0)
                r3.setTextSize(r5)
                r3.setSingleLine(r0)
                r3.setMinLines(r2)
                r5 = 2
                r3.setMaxLines(r5)
                r5 = 1086324736(0x40c00000, float:6.0)
                int r7 = r10.dp(r5)
                int r8 = r10.dp(r5)
                r3.setPadding(r0, r7, r0, r8)
                android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
                r7.<init>(r4, r6)
                r1.addView(r3, r7)
                ca.dnamobile.javalauncher.controls.TouchKeyboardHelper$MinecraftKeyboardEditText r3 = new ca.dnamobile.javalauncher.controls.TouchKeyboardHelper$MinecraftKeyboardEditText
                r3.<init>(r11)
                r10.input = r3
                r3.setSingleLine(r2)
                r3.setMinLines(r2)
                r3.setMaxLines(r2)
                r3.setTextColor(r4)
                r2 = -1426063361(0xffffffffaaffffff, float:-4.5474732E-13)
                r3.setHintTextColor(r2)
                r2 = 1098907648(0x41800000, float:16.0)
                r3.setTextSize(r2)
                java.lang.String r2 = "Text sent to Minecraft"
                r3.setHint(r2)
                r3.setSelectAllOnFocus(r0)
                r2 = 540673(0x84001, float:7.57644E-40)
                r3.setInputType(r2)
                if (r12 == 0) goto Lda
                r2 = 4
                goto Ldb
            Lda:
                r2 = 6
            Ldb:
                r7 = 268435456(0x10000000, float:2.524355E-29)
                r2 = r2 | r7
                r3.setImeOptions(r2)
                r2 = 570425344(0x22000000, float:1.7347235E-18)
                r3.setBackgroundColor(r2)
                r2 = 1090519040(0x41000000, float:8.0)
                int r7 = r10.dp(r2)
                int r8 = r10.dp(r5)
                int r9 = r10.dp(r2)
                int r5 = r10.dp(r5)
                r3.setPadding(r7, r8, r9, r5)
                android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
                r5.<init>(r4, r6)
                r1.addView(r3, r5)
                android.widget.LinearLayout r5 = new android.widget.LinearLayout
                r5.<init>(r11)
                r5.setOrientation(r0)
                r7 = 8388629(0x800015, float:1.1754973E-38)
                r5.setGravity(r7)
                int r2 = r10.dp(r2)
                r5.setPadding(r0, r2, r0, r0)
                java.lang.String r0 = "CLEAR"
                android.widget.TextView r0 = r10.actionText(r11, r0)
                ca.dnamobile.javalauncher.controls.TouchKeyboardHelper$KeyboardInputOverlay$$ExternalSyntheticLambda0 r2 = new ca.dnamobile.javalauncher.controls.TouchKeyboardHelper$KeyboardInputOverlay$$ExternalSyntheticLambda0
                r2.<init>(r10)
                r0.setOnClickListener(r2)
                r5.addView(r0)
                if (r12 == 0) goto L12e
                java.lang.String r12 = "ENTER"
                goto L130
            L12e:
                java.lang.String r12 = "DONE"
            L130:
                android.widget.TextView r12 = r10.actionText(r11, r12)
                ca.dnamobile.javalauncher.controls.TouchKeyboardHelper$KeyboardInputOverlay$$ExternalSyntheticLambda1 r0 = new ca.dnamobile.javalauncher.controls.TouchKeyboardHelper$KeyboardInputOverlay$$ExternalSyntheticLambda1
                r0.<init>(r10)
                r12.setOnClickListener(r0)
                r5.addView(r12)
                java.lang.String r12 = "CLOSE"
                android.widget.TextView r11 = r10.actionText(r11, r12)
                ca.dnamobile.javalauncher.controls.TouchKeyboardHelper$KeyboardInputOverlay$$ExternalSyntheticLambda2 r12 = new ca.dnamobile.javalauncher.controls.TouchKeyboardHelper$KeyboardInputOverlay$$ExternalSyntheticLambda2
                r12.<init>()
                r11.setOnClickListener(r12)
                r5.addView(r11)
                android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
                r11.<init>(r4, r6)
                r1.addView(r5, r11)
                android.widget.FrameLayout$LayoutParams r11 = new android.widget.FrameLayout$LayoutParams
                r12 = 49
                r11.<init>(r4, r6, r12)
                r12 = 1094713344(0x41400000, float:12.0)
                int r0 = r10.dp(r12)
                r11.leftMargin = r0
                int r0 = r10.dp(r12)
                r11.rightMargin = r0
                int r12 = r10.dp(r12)
                r11.topMargin = r12
                r10.addView(r1, r11)
                ca.dnamobile.javalauncher.controls.TouchKeyboardHelper$KeyboardInputOverlay$1 r11 = new ca.dnamobile.javalauncher.controls.TouchKeyboardHelper$KeyboardInputOverlay$1
                r11.<init>(r10)
                r3.addTextChangedListener(r11)
                ca.dnamobile.javalauncher.controls.TouchKeyboardHelper$KeyboardInputOverlay$$ExternalSyntheticLambda3 r11 = new ca.dnamobile.javalauncher.controls.TouchKeyboardHelper$KeyboardInputOverlay$$ExternalSyntheticLambda3
                r11.<init>(r10)
                r3.setOnEditorActionListener(r11)
                ca.dnamobile.javalauncher.controls.TouchKeyboardHelper$KeyboardInputOverlay$$ExternalSyntheticLambda4 r11 = new ca.dnamobile.javalauncher.controls.TouchKeyboardHelper$KeyboardInputOverlay$$ExternalSyntheticLambda4
                r11.<init>()
                r3.setOnKeyListener(r11)
                r10.seedInitialText(r13, r14)
                return
        }

        private android.widget.TextView actionText(android.content.Context r4, java.lang.String r5) {
                r3 = this;
                android.widget.TextView r0 = new android.widget.TextView
                r0.<init>(r4)
                r0.setText(r5)
                r4 = -8460409(0xffffffffff7ee787, float:-3.3882607E38)
                r0.setTextColor(r4)
                r4 = 1095761920(0x41500000, float:13.0)
                r0.setTextSize(r4)
                android.graphics.Typeface r4 = android.graphics.Typeface.DEFAULT_BOLD
                r0.setTypeface(r4)
                r4 = 17
                r0.setGravity(r4)
                r4 = 1096810496(0x41600000, float:14.0)
                int r5 = r3.dp(r4)
                r1 = 1090519040(0x41000000, float:8.0)
                int r2 = r3.dp(r1)
                int r4 = r3.dp(r4)
                int r1 = r3.dp(r1)
                r0.setPadding(r5, r2, r4, r1)
                return r0
        }

        private void dispatchTextDelta(java.lang.String r8, java.lang.String r9) {
                r7 = this;
                int r0 = r8.length()
                int r1 = r9.length()
                int r0 = java.lang.Math.min(r0, r1)
                r1 = 0
                r2 = r1
            Le:
                if (r2 >= r0) goto L1d
                char r3 = r8.charAt(r2)
                char r4 = r9.charAt(r2)
                if (r3 != r4) goto L1d
                int r2 = r2 + 1
                goto Le
            L1d:
                int r0 = r8.length()
                r3 = 1
                int r0 = r0 - r3
                int r4 = r9.length()
                int r4 = r4 - r3
            L28:
                if (r0 < r2) goto L3b
                if (r4 < r2) goto L3b
                char r5 = r8.charAt(r0)
                char r6 = r9.charAt(r4)
                if (r5 != r6) goto L3b
                int r0 = r0 + (-1)
                int r4 = r4 + (-1)
                goto L28
            L3b:
                int r0 = r0 - r2
                int r0 = r0 + r3
                r8 = r1
            L3e:
                if (r8 >= r0) goto L48
                r5 = 259(0x103, float:3.63E-43)
                ca.dnamobile.javalauncher.controls.TouchKeyboardHelper.m433$$Nest$smsendKeyTap(r5)
                int r8 = r8 + 1
                goto L3e
            L48:
                if (r4 < r2) goto L75
                int r4 = r4 + r3
                java.lang.String r8 = r9.substring(r2, r4)
            L4f:
                int r9 = r8.length()
                if (r1 >= r9) goto L75
                char r9 = r8.charAt(r1)
                r0 = 10
                if (r9 == r0) goto L66
                r0 = 13
                if (r9 != r0) goto L62
                goto L66
            L62:
                ca.dnamobile.javalauncher.controls.TouchKeyboardHelper.m432$$Nest$smsendChar(r9)
                goto L72
            L66:
                boolean r9 = r7.submitSendsEnter
                if (r9 == 0) goto L6f
                r9 = 257(0x101, float:3.6E-43)
                ca.dnamobile.javalauncher.controls.TouchKeyboardHelper.m433$$Nest$smsendKeyTap(r9)
            L6f:
                ca.dnamobile.javalauncher.controls.TouchKeyboardHelper.hideKeyboard(r3)
            L72:
                int r1 = r1 + 1
                goto L4f
            L75:
                return
        }

        private int dp(float r2) {
                r1 = this;
                android.content.res.Resources r0 = r1.getResources()
                android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
                float r0 = r0.density
                float r2 = r2 * r0
                int r2 = java.lang.Math.round(r2)
                return r2
        }

        private /* synthetic */ void lambda$new$0(android.view.View r2) {
                r1 = this;
                java.lang.String r2 = r1.lastText
                boolean r2 = r2.isEmpty()
                java.lang.String r0 = ""
                if (r2 == 0) goto L10
                r2 = 64
                ca.dnamobile.javalauncher.controls.TouchKeyboardHelper.m434$$Nest$smsendRepeatedBackspace(r2)
                goto L15
            L10:
                java.lang.String r2 = r1.lastText
                r1.dispatchTextDelta(r2, r0)
            L15:
                r2 = 1
                r1.internalChange = r2
                android.widget.EditText r2 = r1.input
                r2.setText(r0)
                r1.lastText = r0
                r2 = 0
                r1.internalChange = r2
                r1.updatePreview(r0)
                return
        }

        private /* synthetic */ void lambda$new$1(android.view.View r1) {
                r0 = this;
                r0.submitCurrentText()
                return
        }

        static /* synthetic */ void lambda$new$2(android.view.View r0) {
                r0 = 0
                ca.dnamobile.javalauncher.controls.TouchKeyboardHelper.hideKeyboard(r0)
                return
        }

        private /* synthetic */ boolean lambda$new$3(android.widget.TextView r4, int r5, android.view.KeyEvent r6) {
                r3 = this;
                r4 = 6
                r0 = 0
                r1 = 1
                if (r5 == r4) goto L10
                r4 = 4
                if (r5 == r4) goto L10
                r4 = 2
                if (r5 == r4) goto L10
                if (r5 != 0) goto Le
                goto L10
            Le:
                r4 = r0
                goto L11
            L10:
                r4 = r1
            L11:
                if (r6 == 0) goto L29
                int r5 = r6.getKeyCode()
                r2 = 66
                if (r5 != r2) goto L29
                int r5 = r6.getAction()
                if (r5 != 0) goto L29
                int r5 = r6.getRepeatCount()
                if (r5 != 0) goto L29
                r5 = r1
                goto L2a
            L29:
                r5 = r0
            L2a:
                if (r4 != 0) goto L30
                if (r5 == 0) goto L2f
                goto L30
            L2f:
                return r0
            L30:
                r3.submitCurrentText()
                return r1
        }

        static /* synthetic */ boolean lambda$new$4(android.view.View r0, int r1, android.view.KeyEvent r2) {
                r0 = 0
                if (r2 == 0) goto L11
                int r2 = r2.getAction()
                if (r2 == 0) goto La
                goto L11
            La:
                r2 = 4
                if (r1 != r2) goto L11
                ca.dnamobile.javalauncher.controls.TouchKeyboardHelper.hideKeyboard(r0)
                r0 = 1
            L11:
                return r0
        }

        private /* synthetic */ void lambda$rebaseAfterExternalMinecraftEdit$5() {
                r3 = this;
                boolean r0 = r3.closing
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r3.internalChange = r0
                android.widget.EditText r0 = r3.input
                java.lang.String r1 = ""
                r0.setText(r1)
                android.widget.EditText r0 = r3.input
                r2 = 0
                r0.setSelection(r2)
                r3.lastText = r1
                r3.internalChange = r2
                android.widget.TextView r0 = r3.preview
                java.lang.String r1 = "Minecraft chat updated from selection…"
                r0.setText(r1)
                android.widget.EditText r0 = r3.input
                r0.requestFocus()
                r3.showSoftInputAgain()
                return
        }

        private android.graphics.drawable.GradientDrawable makePanelBackground() {
                r3 = this;
                android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
                r0.<init>()
                r1 = -299884252(0xffffffffee202124, float:-1.2389417E28)
                r0.setColor(r1)
                r1 = 1069547520(0x3fc00000, float:1.5)
                int r1 = r3.dp(r1)
                r2 = 1
                int r1 = java.lang.Math.max(r2, r1)
                r2 = -1996488705(0xffffffff88ffffff, float:-1.5407439E-33)
                r0.setStroke(r1, r2)
                r1 = 1099956224(0x41900000, float:18.0)
                int r1 = r3.dp(r1)
                float r1 = (float) r1
                r0.setCornerRadius(r1)
                return r0
        }

        private void seedInitialText(java.lang.String r3, boolean r4) {
                r2 = this;
                if (r3 == 0) goto L2e
                boolean r0 = r3.isEmpty()
                if (r0 == 0) goto L9
                goto L2e
            L9:
                r0 = 1
                r2.internalChange = r0
                android.widget.EditText r0 = r2.input
                r0.setText(r3)
                r2.lastText = r3
                android.widget.EditText r0 = r2.input
                int r0 = r0.length()
                r1 = 0
                if (r4 == 0) goto L24
                if (r0 <= 0) goto L24
                android.widget.EditText r4 = r2.input     // Catch: java.lang.Throwable -> L29
                r4.setSelection(r1, r0)     // Catch: java.lang.Throwable -> L29
                goto L29
            L24:
                android.widget.EditText r4 = r2.input     // Catch: java.lang.Throwable -> L29
                r4.setSelection(r0)     // Catch: java.lang.Throwable -> L29
            L29:
                r2.internalChange = r1
                r2.updatePreview(r3)
            L2e:
                return
        }

        private void showSoftInputAgain() {
                r3 = this;
                android.content.Context r0 = r3.getContext()
                java.lang.String r1 = "input_method"
                java.lang.Object r0 = r0.getSystemService(r1)
                android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
                if (r0 == 0) goto L14
                android.widget.EditText r1 = r3.input
                r2 = 1
                r0.showSoftInput(r1, r2)
            L14:
                return
        }

        private void submitCurrentText() {
                r1 = this;
                boolean r0 = r1.submitSendsEnter
                if (r0 == 0) goto L9
                r0 = 257(0x101, float:3.6E-43)
                ca.dnamobile.javalauncher.controls.TouchKeyboardHelper.m433$$Nest$smsendKeyTap(r0)
            L9:
                r0 = 1
                ca.dnamobile.javalauncher.controls.TouchKeyboardHelper.hideKeyboard(r0)
                return
        }

        private void updatePreview(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = r3.trim()
                android.widget.TextView r1 = r2.preview
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto Le
                java.lang.String r3 = "Type here…"
            Le:
                r1.setText(r3)
                return
        }

        void close(boolean r4) {
                r3 = this;
                r0 = 1
                r3.closing = r0
                android.content.Context r0 = r3.getContext()
                java.lang.String r1 = "input_method"
                java.lang.Object r0 = r0.getSystemService(r1)
                android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
                if (r0 == 0) goto L1b
                android.widget.EditText r1 = r3.input
                android.os.IBinder r1 = r1.getWindowToken()
                r2 = 0
                r0.hideSoftInputFromWindow(r1, r2)
            L1b:
                if (r4 == 0) goto L24
                android.widget.EditText r4 = r3.input
                java.lang.String r0 = ""
                r4.setText(r0)
            L24:
                android.view.ViewParent r4 = r3.getParent()
                android.view.ViewGroup r4 = (android.view.ViewGroup) r4
                if (r4 == 0) goto L2f
                r4.removeView(r3)
            L2f:
                return
        }

        void openKeyboard() {
                r4 = this;
                android.widget.EditText r0 = r4.input
                r0.requestFocus()
                android.os.Handler r0 = r4.handler
                ca.dnamobile.javalauncher.controls.TouchKeyboardHelper$KeyboardInputOverlay$$ExternalSyntheticLambda5 r1 = new ca.dnamobile.javalauncher.controls.TouchKeyboardHelper$KeyboardInputOverlay$$ExternalSyntheticLambda5
                r1.<init>(r4)
                r2 = 80
                r0.postDelayed(r1, r2)
                return
        }

        void rebaseAfterExternalMinecraftEdit() {
                r2 = this;
                boolean r0 = r2.submitSendsEnter
                if (r0 == 0) goto L13
                boolean r0 = r2.closing
                if (r0 == 0) goto L9
                goto L13
            L9:
                android.os.Handler r0 = r2.handler
                ca.dnamobile.javalauncher.controls.TouchKeyboardHelper$KeyboardInputOverlay$$ExternalSyntheticLambda6 r1 = new ca.dnamobile.javalauncher.controls.TouchKeyboardHelper$KeyboardInputOverlay$$ExternalSyntheticLambda6
                r1.<init>(r2)
                r0.post(r1)
            L13:
                return
        }

        boolean submitsEnter() {
                r1 = this;
                boolean r0 = r1.submitSendsEnter
                return r0
        }
    }

    private static final class MinecraftKeyboardEditText extends android.widget.EditText {


        /* JADX INFO: renamed from: -$$Nest$misOverlayTextEmpty, reason: not valid java name */
        static /* bridge */ /* synthetic */ boolean m442$$Nest$misOverlayTextEmpty(ca.dnamobile.javalauncher.controls.TouchKeyboardHelper.MinecraftKeyboardEditText r0) {
                boolean r0 = r0.isOverlayTextEmpty()
                return r0
        }

        /* JADX INFO: renamed from: -$$Nest$mshouldForwardEmptyBackspace, reason: not valid java name */
        static /* bridge */ /* synthetic */ boolean m443$$Nest$mshouldForwardEmptyBackspace(ca.dnamobile.javalauncher.controls.TouchKeyboardHelper.MinecraftKeyboardEditText r0, int r1, int r2) {
                boolean r0 = r0.shouldForwardEmptyBackspace(r1, r2)
                return r0
        }

        MinecraftKeyboardEditText(android.content.Context r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private boolean isOverlayTextEmpty() {
                r1 = this;
                android.text.Editable r0 = r1.getText()
                if (r0 == 0) goto Lf
                int r0 = r0.length()
                if (r0 != 0) goto Ld
                goto Lf
            Ld:
                r0 = 0
                goto L10
            Lf:
                r0 = 1
            L10:
                return r0
        }

        private boolean shouldForwardEmptyBackspace(int r1, int r2) {
                r0 = this;
                if (r1 <= 0) goto Lc
                if (r2 != 0) goto Lc
                boolean r1 = r0.isOverlayTextEmpty()
                if (r1 == 0) goto Lc
                r1 = 1
                goto Ld
            Lc:
                r1 = 0
            Ld:
                return r1
        }

        @Override // android.widget.TextView, android.view.View
        public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r3) {
                r2 = this;
                android.view.inputmethod.InputConnection r3 = super.onCreateInputConnection(r3)
                if (r3 != 0) goto L8
                r3 = 0
                return r3
            L8:
                ca.dnamobile.javalauncher.controls.TouchKeyboardHelper$MinecraftKeyboardEditText$1 r0 = new ca.dnamobile.javalauncher.controls.TouchKeyboardHelper$MinecraftKeyboardEditText$1
                r1 = 1
                r0.<init>(r2, r3, r1)
                return r0
        }

        @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int r2, android.view.KeyEvent r3) {
                r1 = this;
                r0 = 67
                if (r2 != r0) goto L11
                boolean r0 = r1.isOverlayTextEmpty()
                if (r0 == 0) goto L11
                r2 = 259(0x103, float:3.63E-43)
                ca.dnamobile.javalauncher.controls.TouchKeyboardHelper.m433$$Nest$smsendKeyTap(r2)
                r2 = 1
                return r2
            L11:
                boolean r2 = super.onKeyDown(r2, r3)
                return r2
        }
    }

    /* JADX INFO: renamed from: -$$Nest$smsendChar, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m432$$Nest$smsendChar(char r0) {
            sendChar(r0)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$smsendKeyTap, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m433$$Nest$smsendKeyTap(int r0) {
            sendKeyTap(r0)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$smsendRepeatedBackspace, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m434$$Nest$smsendRepeatedBackspace(int r0) {
            sendRepeatedBackspace(r0)
            return
    }

    private TouchKeyboardHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.widget.FrameLayout findFrameLayout(android.view.View r2) {
            boolean r0 = r2 instanceof android.widget.FrameLayout
            if (r0 == 0) goto L7
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            return r2
        L7:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L22
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0 = 0
        Le:
            int r1 = r2.getChildCount()
            if (r0 >= r1) goto L22
            android.view.View r1 = r2.getChildAt(r0)
            android.widget.FrameLayout r1 = findFrameLayout(r1)
            if (r1 == 0) goto L1f
            return r1
        L1f:
            int r0 = r0 + 1
            goto Le
        L22:
            r2 = 0
            return r2
    }

    static void hideKeyboard(boolean r2) {
            ca.dnamobile.javalauncher.controls.TouchKeyboardHelper$KeyboardInputOverlay r0 = ca.dnamobile.javalauncher.controls.TouchKeyboardHelper.activeOverlay
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 0
            ca.dnamobile.javalauncher.controls.TouchKeyboardHelper.activeOverlay = r1
            r0.close(r2)
            return
    }

    static boolean isChatKeyboardShowing() {
            ca.dnamobile.javalauncher.controls.TouchKeyboardHelper$KeyboardInputOverlay r0 = ca.dnamobile.javalauncher.controls.TouchKeyboardHelper.activeOverlay
            if (r0 == 0) goto Lc
            boolean r0 = r0.submitsEnter()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    static boolean isKeyboardShowing() {
            ca.dnamobile.javalauncher.controls.TouchKeyboardHelper$KeyboardInputOverlay r0 = ca.dnamobile.javalauncher.controls.TouchKeyboardHelper.activeOverlay
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    private static int keyCodeForChar(char r2) {
            r0 = 97
            r1 = 32
            if (r2 < r0) goto Lc
            r0 = 122(0x7a, float:1.71E-43)
            if (r2 > r0) goto Lc
            int r2 = r2 - r1
            return r2
        Lc:
            r0 = 65
            if (r2 < r0) goto L15
            r0 = 90
            if (r2 > r0) goto L15
            return r2
        L15:
            r0 = 48
            if (r2 < r0) goto L1e
            r0 = 57
            if (r2 > r0) goto L1e
            return r2
        L1e:
            if (r2 != r1) goto L21
            return r1
        L21:
            r0 = 45
            if (r2 != r0) goto L26
            return r0
        L26:
            r0 = 61
            if (r2 != r0) goto L2b
            return r0
        L2b:
            r0 = 91
            if (r2 != r0) goto L30
            return r0
        L30:
            r0 = 93
            if (r2 != r0) goto L35
            return r0
        L35:
            r0 = 92
            if (r2 != r0) goto L3a
            return r0
        L3a:
            r0 = 59
            if (r2 != r0) goto L3f
            return r0
        L3f:
            r0 = 39
            if (r2 != r0) goto L44
            return r0
        L44:
            r0 = 44
            if (r2 != r0) goto L49
            return r0
        L49:
            r0 = 46
            if (r2 != r0) goto L4e
            return r0
        L4e:
            r0 = 47
            if (r2 != r0) goto L53
            return r0
        L53:
            r0 = 96
            if (r2 != r0) goto L58
            return r0
        L58:
            r2 = -1
            return r2
    }

    static void markChatKeyPressed() {
            long r0 = android.os.SystemClock.uptimeMillis()
            ca.dnamobile.javalauncher.controls.TouchKeyboardHelper.lastChatKeyPressUptimeMs = r0
            return
    }

    static void notifyMinecraftTextChangedExternally() {
            ca.dnamobile.javalauncher.controls.TouchKeyboardHelper$KeyboardInputOverlay r0 = ca.dnamobile.javalauncher.controls.TouchKeyboardHelper.activeOverlay
            if (r0 == 0) goto L7
            r0.rebaseAfterExternalMinecraftEdit()
        L7:
            return
    }

    private static void sendAsciiFallback(char r1) {
            r0 = 8
            if (r1 != r0) goto La
            r1 = 259(0x103, float:3.63E-43)
            sendKeyTap(r1)
            return
        La:
            r0 = 10
            if (r1 == r0) goto L27
            r0 = 13
            if (r1 != r0) goto L13
            goto L27
        L13:
            r0 = 27
            if (r1 != r0) goto L1d
            r1 = 256(0x100, float:3.59E-43)
            sendKeyTap(r1)
            return
        L1d:
            int r1 = keyCodeForChar(r1)
            if (r1 < 0) goto L26
            sendKeyTap(r1)
        L26:
            return
        L27:
            r1 = 257(0x101, float:3.6E-43)
            sendKeyTap(r1)
            return
    }

    private static void sendChar(char r1) {
            r0 = 1
            org.lwjgl.glfw.CallbackBridge.setInputReady(r0)
            boolean r0 = sendCharByReflection(r1)
            if (r0 == 0) goto Lb
            return
        Lb:
            sendAsciiFallback(r1)
            return
    }

    private static boolean sendCharByReflection(char r19) {
            java.lang.Class<org.lwjgl.glfw.CallbackBridge> r0 = org.lwjgl.glfw.CallbackBridge.class
            r1 = 2
            java.lang.Class[] r2 = new java.lang.Class[r1]
            java.lang.Class r3 = java.lang.Character.TYPE
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r2[r4] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r6 = 1
            r2[r6] = r3
            java.lang.Character r3 = java.lang.Character.valueOf(r19)
            int r7 = org.lwjgl.glfw.CallbackBridge.getCurrentMods()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r7}
            java.lang.String r7 = "sendChar"
            java.lang.Object[] r2 = new java.lang.Object[]{r7, r2, r3}
            java.lang.Class[] r3 = new java.lang.Class[r1]
            java.lang.Class r8 = java.lang.Character.TYPE
            r3[r4] = r8
            java.lang.Class r8 = java.lang.Integer.TYPE
            r3[r6] = r8
            java.lang.Character r8 = java.lang.Character.valueOf(r19)
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r5}
            java.lang.Object[] r3 = new java.lang.Object[]{r7, r3, r8}
            java.lang.Class[] r8 = new java.lang.Class[r6]
            java.lang.Class r9 = java.lang.Integer.TYPE
            r8[r4] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r19)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.Object[] r8 = new java.lang.Object[]{r7, r8, r9}
            java.lang.Class[] r9 = new java.lang.Class[r6]
            java.lang.Class r10 = java.lang.Character.TYPE
            r9[r4] = r10
            java.lang.Character r10 = java.lang.Character.valueOf(r19)
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r9, r10}
            java.lang.Class[] r9 = new java.lang.Class[r1]
            java.lang.Class r10 = java.lang.Integer.TYPE
            r9[r4] = r10
            java.lang.Class r10 = java.lang.Integer.TYPE
            r9[r6] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r19)
            int r11 = org.lwjgl.glfw.CallbackBridge.getCurrentMods()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r11}
            java.lang.String r11 = "sendCharMods"
            java.lang.Object[] r9 = new java.lang.Object[]{r11, r9, r10}
            java.lang.Class[] r10 = new java.lang.Class[r1]
            java.lang.Class r12 = java.lang.Character.TYPE
            r10[r4] = r12
            java.lang.Class r12 = java.lang.Integer.TYPE
            r10[r6] = r12
            java.lang.Character r12 = java.lang.Character.valueOf(r19)
            int r13 = org.lwjgl.glfw.CallbackBridge.getCurrentMods()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Object[] r12 = new java.lang.Object[]{r12, r13}
            java.lang.Object[] r10 = new java.lang.Object[]{r11, r10, r12}
            java.lang.Class[] r11 = new java.lang.Class[r6]
            java.lang.Class r12 = java.lang.Integer.TYPE
            r11[r4] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r19)
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            java.lang.String r13 = "putChar"
            java.lang.Object[] r11 = new java.lang.Object[]{r13, r11, r12}
            java.lang.Class[] r12 = new java.lang.Class[r6]
            java.lang.Class r13 = java.lang.Integer.TYPE
            r12[r4] = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r19)
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            java.lang.String r14 = "putCharEvent"
            java.lang.Object[] r12 = new java.lang.Object[]{r14, r12, r13}
            r13 = 5
            java.lang.Class[] r14 = new java.lang.Class[r13]
            java.lang.Class r15 = java.lang.Integer.TYPE
            r14[r4] = r15
            java.lang.Class r15 = java.lang.Character.TYPE
            r14[r6] = r15
            java.lang.Class r15 = java.lang.Integer.TYPE
            r14[r1] = r15
            java.lang.Class r15 = java.lang.Integer.TYPE
            r16 = 3
            r14[r16] = r15
            java.lang.Class r15 = java.lang.Boolean.TYPE
            r17 = 4
            r14[r17] = r15
            java.lang.Character r15 = java.lang.Character.valueOf(r19)
            int r18 = org.lwjgl.glfw.CallbackBridge.getCurrentMods()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r18)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r15, r5, r13, r1}
            java.lang.String r5 = "sendKeycode"
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r14, r1}
            r5 = 9
            java.lang.Object[][] r13 = new java.lang.Object[r5][]
            r13[r4] = r2
            r13[r6] = r3
            r2 = 2
            r13[r2] = r8
            r13[r16] = r7
            r13[r17] = r9
            r2 = 5
            r13[r2] = r10
            r2 = 6
            r13[r2] = r11
            r2 = 7
            r13[r2] = r12
            r2 = 8
            r13[r2] = r1
            r1 = r4
        L11b:
            if (r1 >= r5) goto L139
            r2 = r13[r1]
            r3 = r2[r4]     // Catch: java.lang.Throwable -> L135
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L135
            r7 = r2[r6]     // Catch: java.lang.Throwable -> L135
            java.lang.Class[] r7 = (java.lang.Class[]) r7     // Catch: java.lang.Throwable -> L135
            r8 = 2
            r2 = r2[r8]     // Catch: java.lang.Throwable -> L136
            java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch: java.lang.Throwable -> L136
            java.lang.reflect.Method r3 = r0.getMethod(r3, r7)     // Catch: java.lang.Throwable -> L136
            r7 = 0
            r3.invoke(r7, r2)     // Catch: java.lang.Throwable -> L136
            return r6
        L135:
            r8 = 2
        L136:
            int r1 = r1 + 1
            goto L11b
        L139:
            return r4
    }

    private static void sendKeyTap(int r3) {
            r0 = 1
            org.lwjgl.glfw.CallbackBridge.setInputReady(r0)     // Catch: java.lang.Throwable -> L1a
            int r1 = org.lwjgl.glfw.CallbackBridge.getCurrentMods()     // Catch: java.lang.Throwable -> L1a
            org.lwjgl.glfw.CallbackBridge.sendKeyPress(r3, r1, r0)     // Catch: java.lang.Throwable -> L1a
            org.lwjgl.glfw.CallbackBridge.setModifiers(r3, r0)     // Catch: java.lang.Throwable -> L1a
            int r0 = org.lwjgl.glfw.CallbackBridge.getCurrentMods()     // Catch: java.lang.Throwable -> L1a
            r1 = 0
            org.lwjgl.glfw.CallbackBridge.sendKeyPress(r3, r0, r1)     // Catch: java.lang.Throwable -> L1a
            org.lwjgl.glfw.CallbackBridge.setModifiers(r3, r1)     // Catch: java.lang.Throwable -> L1a
            goto L2f
        L1a:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to send keyboard key tap "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r1 = "TouchKeyboardHelper"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r3, r0)
        L2f:
            return
    }

    private static void sendRepeatedBackspace(int r2) {
            r0 = 64
            int r2 = java.lang.Math.min(r0, r2)
            r0 = 1
            int r2 = java.lang.Math.max(r0, r2)
            r0 = 0
        Lc:
            if (r0 >= r2) goto L16
            r1 = 259(0x103, float:3.63E-43)
            sendKeyTap(r1)
            int r0 = r0 + 1
            goto Lc
        L16:
            return
    }

    private static boolean shouldSubmitWithEnterByDefault() {
            boolean r0 = org.lwjgl.glfw.CallbackBridge.isGrabbing()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            long r2 = android.os.SystemClock.uptimeMillis()
            long r4 = ca.dnamobile.javalauncher.controls.TouchKeyboardHelper.lastChatKeyPressUptimeMs
            long r2 = r2 - r4
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L1c
            r4 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L1c
            goto L1d
        L1c:
            r1 = 0
        L1d:
            return r1
    }

    static void showChatKeyboard(android.view.View r3) {
            markChatKeyPressed()
            r0 = 0
            r1 = 0
            r2 = 1
            showKeyboard(r3, r2, r0, r1)
            return
    }

    static void showKeyboard(android.view.View r3) {
            boolean r0 = shouldSubmitWithEnterByDefault()
            r1 = 0
            r2 = 0
            showKeyboard(r3, r0, r1, r2)
            return
    }

    static void showKeyboard(android.view.View r2, boolean r3) {
            r0 = 0
            r1 = 0
            showKeyboard(r2, r3, r0, r1)
            return
    }

    private static void showKeyboard(android.view.View r2, boolean r3, java.lang.String r4, boolean r5) {
            r0 = 0
            hideKeyboard(r0)
            android.view.View r0 = r2.getRootView()
            if (r0 != 0) goto Lb
            r0 = r2
        Lb:
            android.widget.FrameLayout r0 = findFrameLayout(r0)
            if (r0 != 0) goto L27
            r2.requestFocus()
            android.content.Context r3 = r2.getContext()
            java.lang.String r4 = "input_method"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
            if (r3 == 0) goto L26
            r4 = 1
            r3.showSoftInput(r2, r4)
        L26:
            return
        L27:
            ca.dnamobile.javalauncher.controls.TouchKeyboardHelper$KeyboardInputOverlay r2 = new ca.dnamobile.javalauncher.controls.TouchKeyboardHelper$KeyboardInputOverlay
            android.content.Context r1 = r0.getContext()
            r2.<init>(r1, r3, r4, r5)
            ca.dnamobile.javalauncher.controls.TouchKeyboardHelper.activeOverlay = r2
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = -1
            r3.<init>(r4, r4)
            r0.addView(r2, r3)
            r2.openKeyboard()
            return
    }

    static void showMenuTextKeyboard(android.view.View r2) {
            r0 = 0
            r1 = 0
            showKeyboard(r2, r0, r1, r0)
            return
    }

    static void showWorldNameKeyboard(android.view.View r3) {
            java.lang.String r0 = "New World"
            r1 = 1
            r2 = 0
            showKeyboard(r3, r2, r0, r1)
            return
    }
}
