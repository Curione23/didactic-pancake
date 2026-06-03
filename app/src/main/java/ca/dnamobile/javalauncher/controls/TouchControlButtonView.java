package ca.dnamobile.javalauncher.controls;

/* JADX INFO: loaded from: classes.dex */
final class TouchControlButtonView extends android.widget.TextView {
    private static final float GAME_PRESS_FEEDBACK_ALPHA = 0.5f;
    private static final int GLFW_KEY_A = 65;
    private static final int GLFW_KEY_D = 68;
    private static final int GLFW_KEY_LEFT_CONTROL = 341;
    private static final int GLFW_KEY_S = 83;
    private static final int GLFW_KEY_SLASH = 47;
    private static final int GLFW_KEY_T = 84;
    private static final int GLFW_KEY_W = 87;
    private static final int GLFW_MOUSE_BUTTON_LEFT = 0;
    private static final int GLFW_MOUSE_BUTTON_MIDDLE = 2;
    private static final int GLFW_MOUSE_BUTTON_RIGHT = 1;
    private static final java.lang.String TAG = "TouchButton";
    private final ca.dnamobile.javalauncher.controls.TouchControlData data;
    private float downRawX;
    private float downRawY;
    private boolean editDragging;
    private java.lang.Runnable editLongPressRunnable;
    private boolean editLongPressTriggered;
    private boolean editMode;
    private boolean editResizing;
    private boolean joystickADown;
    private final android.graphics.Paint joystickBasePaint;
    private float joystickCenterX;
    private float joystickCenterY;
    private boolean joystickDDown;
    private boolean joystickForwardLockDown;
    private final android.graphics.Paint joystickGuidePaint;
    private final android.graphics.Paint joystickKnobPaint;
    private float joystickKnobX;
    private float joystickKnobY;
    private boolean joystickSDown;
    private final android.graphics.Paint joystickStrokePaint;
    private boolean joystickWDown;
    private final ca.dnamobile.javalauncher.controls.TouchControlButtonView.Listener listener;
    private final android.os.Handler mainHandler;
    private boolean pressedState;
    private final android.graphics.Paint resizeHandlePaint;
    private final android.graphics.Paint resizeHandleStrokePaint;
    private float resizeStartHeight;
    private float resizeStartRawX;
    private float resizeStartRawY;
    private float resizeStartWidth;
    private boolean touchFeedbackActive;
    private float touchOffsetX;
    private float touchOffsetY;
    private final int touchSlop;

    interface Listener {
        void onChanged();

        void onEditRequested(ca.dnamobile.javalauncher.controls.TouchControlButtonView r1, ca.dnamobile.javalauncher.controls.TouchControlData r2);

        void onKeySenderKeyboardRequested();

        void onMenuRequested();

        void onMoveRequested(ca.dnamobile.javalauncher.controls.TouchControlButtonView r1, ca.dnamobile.javalauncher.controls.TouchControlData r2, float r3, float r4);

        void onMoveStarted(ca.dnamobile.javalauncher.controls.TouchControlButtonView r1, ca.dnamobile.javalauncher.controls.TouchControlData r2);

        void onResizeRequested(ca.dnamobile.javalauncher.controls.TouchControlButtonView r1, ca.dnamobile.javalauncher.controls.TouchControlData r2, float r3, float r4);

        void onResizeStarted(ca.dnamobile.javalauncher.controls.TouchControlButtonView r1, ca.dnamobile.javalauncher.controls.TouchControlData r2);

        void onToggleControlsRequested();
    }

    public static /* synthetic */ void $r8$lambda$DhFvh3qKQbTHHnPtjWKGGJyKmr0(ca.dnamobile.javalauncher.controls.TouchControlButtonView r0) {
            r0.lambda$scheduleEditLongPress$0()
            return
    }

    public static /* synthetic */ void $r8$lambda$ylSDeMJQJLRZ12XORXP3EzzdofY(ca.dnamobile.javalauncher.controls.TouchControlButtonView r0) {
            r0.lambda$clearTouchFeedbackSoon$1()
            return
    }

    TouchControlButtonView(android.content.Context r3, ca.dnamobile.javalauncher.controls.TouchControlData r4, ca.dnamobile.javalauncher.controls.TouchControlButtonView.Listener r5) {
            r2 = this;
            r2.<init>(r3)
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.mainHandler = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 1
            r0.<init>(r1)
            r2.joystickBasePaint = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r1)
            r2.joystickStrokePaint = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r1)
            r2.joystickKnobPaint = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r1)
            r2.joystickGuidePaint = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r1)
            r2.resizeHandlePaint = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r1)
            r2.resizeHandleStrokePaint = r0
            r2.data = r4
            r2.listener = r5
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            int r3 = r3.getScaledTouchSlop()
            r2.touchSlop = r3
            r3 = 17
            r2.setGravity(r3)
            r3 = -1
            r2.setTextColor(r3)
            r3 = 1095761920(0x41500000, float:13.0)
            r2.setTextSize(r3)
            r3 = 0
            r2.setIncludeFontPadding(r3)
            r2.setSingleLine(r3)
            r2.setAllCaps(r3)
            java.lang.String r4 = r4.label
            r2.setText(r4)
            android.graphics.drawable.GradientDrawable r4 = r2.makeBackground(r3)
            r2.setBackground(r4)
            float r4 = r2.resolvedDisplayAlpha()
            r2.setAlpha(r4)
            r2.setLongClickable(r1)
            r2.setWillNotDraw(r3)
            r2.setupJoystickPaints()
            r2.setupResizeHandlePaints()
            r2.resetJoystickKnob()
            return
    }

    private void cancelEditLongPress() {
            r2 = this;
            java.lang.Runnable r0 = r2.editLongPressRunnable
            if (r0 == 0) goto Lc
            android.os.Handler r1 = r2.mainHandler
            r1.removeCallbacks(r0)
            r0 = 0
            r2.editLongPressRunnable = r0
        Lc:
            return
    }

    private void clearTouchFeedbackSoon() {
            r4 = this;
            android.os.Handler r0 = r4.mainHandler
            ca.dnamobile.javalauncher.controls.TouchControlButtonView$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.controls.TouchControlButtonView$$ExternalSyntheticLambda0
            r1.<init>(r4)
            r2 = 90
            r0.postDelayed(r1, r2)
            return
    }

    private void drawJoystick(android.graphics.Canvas r9) {
            r8 = this;
            int r0 = r8.getWidth()
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.max(r1, r0)
            int r2 = r8.getHeight()
            float r2 = (float) r2
            float r1 = java.lang.Math.max(r1, r2)
            r2 = 1073741824(0x40000000, float:2.0)
            float r3 = r0 / r2
            float r2 = r1 / r2
            float r4 = java.lang.Math.min(r0, r1)
            r5 = 1056293519(0x3ef5c28f, float:0.48)
            float r4 = r4 * r5
            float r5 = java.lang.Math.min(r0, r1)
            r6 = 1049582633(0x3e8f5c29, float:0.28)
            float r5 = r5 * r6
            android.content.res.Resources r6 = r8.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            r7 = 1092616192(0x41200000, float:10.0)
            float r6 = r6 * r7
            float r0 = java.lang.Math.min(r0, r1)
            r1 = 1043878380(0x3e3851ec, float:0.18)
            float r0 = r0 * r1
            float r0 = java.lang.Math.max(r6, r0)
            android.graphics.Paint r1 = r8.joystickBasePaint
            r9.drawCircle(r3, r2, r4, r1)
            android.graphics.Paint r1 = r8.joystickStrokePaint
            r9.drawCircle(r3, r2, r4, r1)
            android.graphics.Paint r1 = r8.joystickGuidePaint
            r9.drawCircle(r3, r2, r5, r1)
            float r1 = r8.joystickKnobX
            r4 = 0
            int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r5 <= 0) goto L5a
            r3 = r1
        L5a:
            float r1 = r8.joystickKnobY
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 <= 0) goto L61
            r2 = r1
        L61:
            android.graphics.Paint r1 = r8.joystickKnobPaint
            r9.drawCircle(r3, r2, r0, r1)
            android.graphics.Paint r1 = r8.joystickStrokePaint
            r9.drawCircle(r3, r2, r0, r1)
            return
    }

    private void drawResizeHandle(android.graphics.Canvas r14) {
            r13 = this;
            float r0 = r13.resizeHandleSize()
            int r1 = r13.getWidth()
            float r1 = (float) r1
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = java.lang.Math.max(r2, r1)
            int r3 = r13.getHeight()
            float r3 = (float) r3
            float r2 = java.lang.Math.max(r2, r3)
            android.graphics.Path r3 = new android.graphics.Path
            r3.<init>()
            float r4 = r2 - r0
            r3.moveTo(r1, r4)
            r3.lineTo(r1, r2)
            float r5 = r1 - r0
            r3.lineTo(r5, r2)
            r3.close()
            android.graphics.Paint r6 = r13.resizeHandlePaint
            r14.drawPath(r3, r6)
            android.graphics.Paint r6 = r13.resizeHandleStrokePaint
            r14.drawPath(r3, r6)
            r3 = 1046562734(0x3e6147ae, float:0.22)
            float r3 = r3 * r0
            r6 = 1077936128(0x40400000, float:3.0)
            float r3 = java.lang.Math.max(r6, r3)
            float r12 = r1 - r3
            float r8 = r4 + r3
            float r9 = r5 + r3
            float r3 = r2 - r3
            android.graphics.Paint r11 = r13.resizeHandleStrokePaint
            r6 = r14
            r7 = r12
            r10 = r3
            r6.drawLine(r7, r8, r9, r10, r11)
            r4 = 1058977874(0x3f1eb852, float:0.62)
            float r0 = r0 * r4
            float r8 = r2 - r0
            float r9 = r1 - r0
            android.graphics.Paint r11 = r13.resizeHandleStrokePaint
            r6.drawLine(r7, r8, r9, r10, r11)
            return
    }

    private boolean handleEditTouch(android.view.MotionEvent r7) {
            r6 = this;
            int r0 = r7.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lca
            if (r0 == r2) goto L9f
            r3 = 2
            if (r0 == r3) goto L2e
            r7 = 3
            if (r0 == r7) goto L11
            return r2
        L11:
            r6.cancelEditLongPress()
            r6.setPressed(r1)
            r6.requestParentDisallowIntercept(r1)
            boolean r7 = r6.editDragging
            if (r7 != 0) goto L22
            boolean r7 = r6.editResizing
            if (r7 == 0) goto L2b
        L22:
            boolean r7 = r6.editLongPressTriggered
            if (r7 != 0) goto L2b
            ca.dnamobile.javalauncher.controls.TouchControlButtonView$Listener r7 = r6.listener
            r7.onChanged()
        L2b:
            r6.editResizing = r1
            return r2
        L2e:
            boolean r0 = r6.editResizing
            if (r0 == 0) goto L4e
            float r0 = r6.resizeStartWidth
            float r1 = r7.getRawX()
            float r3 = r6.resizeStartRawX
            float r1 = r1 - r3
            float r0 = r0 + r1
            float r1 = r6.resizeStartHeight
            float r7 = r7.getRawY()
            float r3 = r6.resizeStartRawY
            float r7 = r7 - r3
            float r1 = r1 + r7
            ca.dnamobile.javalauncher.controls.TouchControlButtonView$Listener r7 = r6.listener
            ca.dnamobile.javalauncher.controls.TouchControlData r3 = r6.data
            r7.onResizeRequested(r6, r3, r0, r1)
            return r2
        L4e:
            boolean r0 = r6.editLongPressTriggered
            if (r0 == 0) goto L53
            return r2
        L53:
            float r0 = r7.getRawX()
            float r1 = r6.downRawX
            float r0 = r0 - r1
            float r1 = r7.getRawY()
            float r3 = r6.downRawY
            float r1 = r1 - r3
            boolean r3 = r6.editDragging
            if (r3 != 0) goto L7c
            float r0 = r0 * r0
            float r1 = r1 * r1
            float r0 = r0 + r1
            int r1 = r6.touchSlop
            int r1 = r1 * r1
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L7c
            r6.editDragging = r2
            r6.cancelEditLongPress()
            ca.dnamobile.javalauncher.controls.TouchControlButtonView$Listener r0 = r6.listener
            ca.dnamobile.javalauncher.controls.TouchControlData r1 = r6.data
            r0.onMoveStarted(r6, r1)
        L7c:
            boolean r0 = r6.editDragging
            if (r0 == 0) goto L9e
            ca.dnamobile.javalauncher.controls.TouchControlButtonView$Listener r0 = r6.listener
            ca.dnamobile.javalauncher.controls.TouchControlData r1 = r6.data
            float r3 = r7.getRawX()
            float r4 = r6.touchOffsetX
            float r3 = r3 - r4
            r4 = 0
            float r3 = java.lang.Math.max(r4, r3)
            float r7 = r7.getRawY()
            float r5 = r6.touchOffsetY
            float r7 = r7 - r5
            float r7 = java.lang.Math.max(r4, r7)
            r0.onMoveRequested(r6, r1, r3, r7)
        L9e:
            return r2
        L9f:
            r6.cancelEditLongPress()
            r6.setPressed(r1)
            r6.requestParentDisallowIntercept(r1)
            boolean r7 = r6.editDragging
            boolean r0 = r6.editResizing
            if (r7 != 0) goto Lc0
            if (r0 == 0) goto Lb1
            goto Lc0
        Lb1:
            boolean r7 = r6.editLongPressTriggered
            if (r7 != 0) goto Lc5
            r6.performClick()
            ca.dnamobile.javalauncher.controls.TouchControlButtonView$Listener r7 = r6.listener
            ca.dnamobile.javalauncher.controls.TouchControlData r0 = r6.data
            r7.onEditRequested(r6, r0)
            goto Lc5
        Lc0:
            ca.dnamobile.javalauncher.controls.TouchControlButtonView$Listener r7 = r6.listener
            r7.onChanged()
        Lc5:
            r6.editDragging = r1
            r6.editResizing = r1
            return r2
        Lca:
            r6.requestParentDisallowIntercept(r2)
            r6.setPressed(r2)
            r6.editLongPressTriggered = r1
            r6.editDragging = r1
            r6.editResizing = r1
            float r0 = r7.getRawX()
            float r1 = r6.getX()
            float r0 = r0 - r1
            r6.touchOffsetX = r0
            float r0 = r7.getRawY()
            float r1 = r6.getY()
            float r0 = r0 - r1
            r6.touchOffsetY = r0
            float r0 = r7.getRawX()
            r6.downRawX = r0
            float r0 = r7.getRawY()
            r6.downRawY = r0
            float r0 = r7.getX()
            float r1 = r7.getY()
            boolean r0 = r6.isInResizeHandle(r0, r1)
            if (r0 == 0) goto L129
            r6.editResizing = r2
            float r0 = r7.getRawX()
            r6.resizeStartRawX = r0
            float r7 = r7.getRawY()
            r6.resizeStartRawY = r7
            int r7 = r6.getWidth()
            float r7 = (float) r7
            r6.resizeStartWidth = r7
            int r7 = r6.getHeight()
            float r7 = (float) r7
            r6.resizeStartHeight = r7
            ca.dnamobile.javalauncher.controls.TouchControlButtonView$Listener r7 = r6.listener
            ca.dnamobile.javalauncher.controls.TouchControlData r0 = r6.data
            r7.onResizeStarted(r6, r0)
        L129:
            return r2
    }

    private boolean handleGameTouch(android.view.MotionEvent r3) {
            r2 = this;
            ca.dnamobile.javalauncher.controls.TouchControlData r0 = r2.data
            java.lang.String r0 = r0.action
            java.lang.String r1 = "joystick"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L11
            boolean r3 = r2.handleJoystickTouch(r3)
            return r3
        L11:
            int r3 = r3.getActionMasked()
            r0 = 1
            if (r3 == 0) goto L38
            if (r3 == r0) goto L1e
            r1 = 3
            if (r3 == r1) goto L1e
            return r0
        L1e:
            r3 = 0
            r2.setTouchFeedbackActive(r3)
            ca.dnamobile.javalauncher.controls.TouchControlData r1 = r2.data
            boolean r1 = r1.toggle
            if (r1 != 0) goto L34
            boolean r1 = r2.pressedState
            if (r1 == 0) goto L34
            r2.pressedState = r3
            r2.send(r3)
            r2.setActivated(r3)
        L34:
            r2.performClick()
            return r0
        L38:
            r2.setTouchFeedbackActive(r0)
            ca.dnamobile.javalauncher.controls.TouchControlData r3 = r2.data
            java.lang.String r3 = r3.action
            java.lang.String r1 = "menu"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L53
            ca.dnamobile.javalauncher.controls.TouchControlButtonView$Listener r3 = r2.listener
            r3.onMenuRequested()
            r2.performClick()
            r2.clearTouchFeedbackSoon()
            return r0
        L53:
            ca.dnamobile.javalauncher.controls.TouchControlData r3 = r2.data
            java.lang.String r3 = r3.action
            java.lang.String r1 = "toggle_controls"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L6b
            ca.dnamobile.javalauncher.controls.TouchControlButtonView$Listener r3 = r2.listener
            r3.onToggleControlsRequested()
            r2.performClick()
            r2.clearTouchFeedbackSoon()
            return r0
        L6b:
            ca.dnamobile.javalauncher.controls.TouchControlData r3 = r2.data
            java.lang.String r3 = r3.action
            java.lang.String r1 = "virtual_mouse"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L81
            r2.toggleVirtualMouse()
            r2.performClick()
            r2.clearTouchFeedbackSoon()
            return r0
        L81:
            ca.dnamobile.javalauncher.controls.TouchControlData r3 = r2.data
            java.lang.String r3 = r3.action
            java.lang.String r1 = "key_sender_keyboard"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L99
            ca.dnamobile.javalauncher.controls.TouchControlButtonView$Listener r3 = r2.listener
            r3.onKeySenderKeyboardRequested()
            r2.performClick()
            r2.clearTouchFeedbackSoon()
            return r0
        L99:
            ca.dnamobile.javalauncher.controls.TouchControlData r3 = r2.data
            boolean r3 = r3.toggle
            if (r3 == 0) goto La8
            boolean r3 = r2.pressedState
            r3 = r3 ^ r0
            r2.pressedState = r3
            r2.send(r3)
            goto Lad
        La8:
            r2.pressedState = r0
            r2.send(r0)
        Lad:
            boolean r3 = r2.pressedState
            r2.setActivated(r3)
            return r0
    }

    private boolean handleJoystickTouch(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 == r1) goto L1c
            r2 = 2
            if (r0 == r2) goto L10
            r4 = 3
            if (r0 == r4) goto L1c
            return r1
        L10:
            float r0 = r4.getX()
            float r4 = r4.getY()
            r3.updateJoystick(r0, r4)
            return r1
        L1c:
            r3.releaseJoystick()
            r4 = 0
            r3.setTouchFeedbackActive(r4)
            r3.pressedState = r4
            r3.setActivated(r4)
            r3.performClick()
            return r1
        L2c:
            r3.setTouchFeedbackActive(r1)
            r3.pressedState = r1
            r3.setActivated(r1)
            ca.dnamobile.javalauncher.controls.TouchControlData r0 = r3.data
            boolean r0 = r0.joystickAbsolute
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == 0) goto L41
            float r0 = r4.getX()
            goto L47
        L41:
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r0 = r0 / r2
        L47:
            r3.joystickCenterX = r0
            ca.dnamobile.javalauncher.controls.TouchControlData r0 = r3.data
            boolean r0 = r0.joystickAbsolute
            if (r0 == 0) goto L54
            float r0 = r4.getY()
            goto L5a
        L54:
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r0 = r0 / r2
        L5a:
            r3.joystickCenterY = r0
            float r0 = r4.getX()
            float r4 = r4.getY()
            r3.updateJoystick(r0, r4)
            return r1
    }

    private static boolean isChatOpenKey(int r1) {
            r0 = 84
            if (r1 == r0) goto Lb
            r0 = 47
            if (r1 != r0) goto L9
            goto Lb
        L9:
            r1 = 0
            goto Lc
        Lb:
            r1 = 1
        Lc:
            return r1
    }

    private boolean isInResizeHandle(float r3, float r4) {
            r2 = this;
            float r0 = r2.resizeHandleHitSize()
            boolean r1 = r2.editMode
            if (r1 == 0) goto L1e
            int r1 = r2.getWidth()
            float r1 = (float) r1
            float r1 = r1 - r0
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 < 0) goto L1e
            int r3 = r2.getHeight()
            float r3 = (float) r3
            float r3 = r3 - r0
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 < 0) goto L1e
            r3 = 1
            goto L1f
        L1e:
            r3 = 0
        L1f:
            return r3
    }

    private /* synthetic */ void lambda$clearTouchFeedbackSoon$1() {
            r1 = this;
            r0 = 0
            r1.setTouchFeedbackActive(r0)
            return
    }

    private /* synthetic */ void lambda$scheduleEditLongPress$0() {
            r2 = this;
            r0 = 0
            r2.editLongPressRunnable = r0
            boolean r0 = r2.isAttachedToWindow()
            if (r0 == 0) goto L1f
            boolean r0 = r2.editMode
            if (r0 != 0) goto Le
            goto L1f
        Le:
            r0 = 1
            r2.editLongPressTriggered = r0
            r0 = 0
            r2.setPressed(r0)
            r2.requestParentDisallowIntercept(r0)
            ca.dnamobile.javalauncher.controls.TouchControlButtonView$Listener r0 = r2.listener
            ca.dnamobile.javalauncher.controls.TouchControlData r1 = r2.data
            r0.onEditRequested(r2, r1)
        L1f:
            return
    }

    private android.graphics.drawable.GradientDrawable makeBackground(boolean r7) {
            r6 = this;
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            ca.dnamobile.javalauncher.controls.TouchControlData r1 = r6.data
            java.lang.String r1 = r1.action
            java.lang.String r2 = "joystick"
            boolean r1 = r2.equals(r1)
            r0.setShape(r1)
            if (r7 == 0) goto L18
            r2 = 1715425717(0x663f51b5, float:2.258698E23)
            goto L1c
        L18:
            ca.dnamobile.javalauncher.controls.TouchControlData r2 = r6.data
            int r2 = r2.backgroundColor
        L1c:
            r0.setColor(r2)
            if (r7 == 0) goto L23
            r2 = 3
            goto L24
        L23:
            r2 = 0
        L24:
            ca.dnamobile.javalauncher.controls.TouchControlData r3 = r6.data
            float r3 = r3.strokeWidth
            r4 = 0
            float r3 = java.lang.Math.max(r4, r3)
            android.content.res.Resources r5 = r6.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r3 = r3 * r5
            int r3 = java.lang.Math.round(r3)
            int r2 = java.lang.Math.max(r2, r3)
            if (r7 == 0) goto L44
            r7 = -1
            goto L48
        L44:
            ca.dnamobile.javalauncher.controls.TouchControlData r7 = r6.data
            int r7 = r7.strokeColor
        L48:
            if (r2 <= 0) goto L4d
            r0.setStroke(r2, r7)
        L4d:
            if (r1 == 0) goto L53
            r7 = 1176255488(0x461c3c00, float:9999.0)
            goto L66
        L53:
            ca.dnamobile.javalauncher.controls.TouchControlData r7 = r6.data
            float r7 = r7.cornerRadius
            float r7 = java.lang.Math.max(r4, r7)
            android.content.res.Resources r1 = r6.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r7 = r7 * r1
        L66:
            r0.setCornerRadius(r7)
            return r0
    }

    private void releaseJoystick() {
            r2 = this;
            r0 = 0
            r2.setJoystickKeyStates(r0, r0, r0, r0)
            r2.resetJoystickKnob()
            boolean r1 = r2.joystickForwardLockDown
            if (r1 == 0) goto L12
            r2.joystickForwardLockDown = r0
            r1 = 341(0x155, float:4.78E-43)
            r2.sendKey(r1, r0)
        L12:
            return
    }

    private void requestParentDisallowIntercept(boolean r2) {
            r1 = this;
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == 0) goto L9
            r0.requestDisallowInterceptTouchEvent(r2)
        L9:
            return
    }

    private void resetJoystickKnob() {
            r3 = this;
            int r0 = r3.getWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            r2 = 0
            if (r0 <= 0) goto L10
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r0 = r0 / r1
            goto L11
        L10:
            r0 = r2
        L11:
            r3.joystickKnobX = r0
            int r0 = r3.getHeight()
            if (r0 <= 0) goto L20
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r2 = r0 / r1
        L20:
            r3.joystickKnobY = r2
            r3.invalidate()
            return
    }

    private float resizeHandleHitSize() {
            r2 = this;
            android.content.res.Resources r0 = r2.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r1 = 1105199104(0x41e00000, float:28.0)
            float r0 = r0 * r1
            float r1 = r2.resizeHandleSize()
            float r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    private float resizeHandleSize() {
            r3 = this;
            android.content.res.Resources r0 = r3.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r1 = 1099956224(0x41900000, float:18.0)
            float r0 = r0 * r1
            int r1 = r3.getWidth()
            int r2 = r3.getHeight()
            int r1 = java.lang.Math.min(r1, r2)
            float r1 = (float) r1
            r2 = 1050924810(0x3ea3d70a, float:0.32)
            float r1 = r1 * r2
            float r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    private float resolvedDisplayAlpha() {
            r4 = this;
            ca.dnamobile.javalauncher.controls.TouchControlData r0 = r4.data
            float r0 = r0.opacity
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r1, r0)
            r2 = 0
            float r0 = java.lang.Math.max(r2, r0)
            android.content.Context r3 = r4.getContext()
            float r3 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getGlobalOpacity(r3)
            float r1 = java.lang.Math.min(r1, r3)
            float r1 = java.lang.Math.max(r2, r1)
            float r0 = r0 * r1
            boolean r1 = r4.editMode
            if (r1 == 0) goto L2a
            r1 = 1048576000(0x3e800000, float:0.25)
            float r0 = java.lang.Math.max(r1, r0)
        L2a:
            return r0
    }

    private void scheduleEditLongPress() {
            r4 = this;
            r4.cancelEditLongPress()
            ca.dnamobile.javalauncher.controls.TouchControlButtonView$$ExternalSyntheticLambda1 r0 = new ca.dnamobile.javalauncher.controls.TouchControlButtonView$$ExternalSyntheticLambda1
            r0.<init>(r4)
            r4.editLongPressRunnable = r0
            android.os.Handler r1 = r4.mainHandler
            int r2 = android.view.ViewConfiguration.getLongPressTimeout()
            long r2 = (long) r2
            r1.postDelayed(r0, r2)
            return
    }

    private void send(boolean r5) {
            r4 = this;
            r0 = 1
            org.lwjgl.glfw.CallbackBridge.setInputReady(r0)     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = "key"
            ca.dnamobile.javalauncher.controls.TouchControlData r1 = r4.data     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = r1.action     // Catch: java.lang.Throwable -> L76
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L23
            ca.dnamobile.javalauncher.controls.TouchControlData r0 = r4.data     // Catch: java.lang.Throwable -> L76
            int[] r0 = r0.normalizedKeyCodes()     // Catch: java.lang.Throwable -> L76
            int r1 = r0.length     // Catch: java.lang.Throwable -> L76
            r2 = 0
        L18:
            if (r2 >= r1) goto L22
            r3 = r0[r2]     // Catch: java.lang.Throwable -> L76
            r4.sendSlotBinding(r3, r5)     // Catch: java.lang.Throwable -> L76
            int r2 = r2 + 1
            goto L18
        L22:
            return
        L23:
            java.lang.String r0 = "mouse"
            ca.dnamobile.javalauncher.controls.TouchControlData r1 = r4.data     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = r1.action     // Catch: java.lang.Throwable -> L76
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L37
            ca.dnamobile.javalauncher.controls.TouchControlData r0 = r4.data     // Catch: java.lang.Throwable -> L76
            int r0 = r0.mouseButton     // Catch: java.lang.Throwable -> L76
            org.lwjgl.glfw.CallbackBridge.sendMouseButton(r0, r5)     // Catch: java.lang.Throwable -> L76
            return
        L37:
            java.lang.String r0 = "scroll"
            ca.dnamobile.javalauncher.controls.TouchControlData r1 = r4.data     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = r1.action     // Catch: java.lang.Throwable -> L76
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L50
            if (r5 != 0) goto L4f
            ca.dnamobile.javalauncher.controls.TouchControlData r5 = r4.data     // Catch: java.lang.Throwable -> L76
            int r5 = r5.scrollY     // Catch: java.lang.Throwable -> L76
            double r0 = (double) r5     // Catch: java.lang.Throwable -> L76
            r2 = 0
            org.lwjgl.glfw.CallbackBridge.sendScroll(r2, r0)     // Catch: java.lang.Throwable -> L76
        L4f:
            return
        L50:
            java.lang.String r0 = "keyboard"
            ca.dnamobile.javalauncher.controls.TouchControlData r1 = r4.data     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = r1.action     // Catch: java.lang.Throwable -> L76
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L62
            if (r5 == 0) goto L61
            ca.dnamobile.javalauncher.controls.TouchKeyboardHelper.showKeyboard(r4)     // Catch: java.lang.Throwable -> L76
        L61:
            return
        L62:
            java.lang.String r0 = "key_sender_keyboard"
            ca.dnamobile.javalauncher.controls.TouchControlData r1 = r4.data     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = r1.action     // Catch: java.lang.Throwable -> L76
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L7e
            if (r5 == 0) goto L7e
            ca.dnamobile.javalauncher.controls.TouchControlButtonView$Listener r5 = r4.listener     // Catch: java.lang.Throwable -> L76
            r5.onKeySenderKeyboardRequested()     // Catch: java.lang.Throwable -> L76
            goto L7e
        L76:
            r5 = move-exception
            java.lang.String r0 = "TouchButton"
            java.lang.String r1 = "Unable to send touch control input"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r1, r5)
        L7e:
            return
    }

    private void sendKey(int r2, boolean r3) {
            r1 = this;
            r0 = 1
            org.lwjgl.glfw.CallbackBridge.setInputReady(r0)
            if (r3 == 0) goto Lf
            boolean r0 = isChatOpenKey(r2)
            if (r0 == 0) goto Lf
            ca.dnamobile.javalauncher.controls.TouchKeyboardHelper.markChatKeyPressed()
        Lf:
            int r0 = org.lwjgl.glfw.CallbackBridge.getCurrentMods()
            org.lwjgl.glfw.CallbackBridge.sendKeyPress(r2, r0, r3)
            org.lwjgl.glfw.CallbackBridge.setModifiers(r2, r3)
            return
    }

    private void sendSlotBinding(int r3, boolean r4) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            r0 = 0
            switch(r3) {
                case -10: goto L49;
                case -9: goto L41;
                case -8: goto L39;
                case -7: goto L31;
                case -6: goto L2c;
                case -5: goto L26;
                case -4: goto L21;
                case -3: goto L1c;
                case -2: goto L14;
                case -1: goto Le;
                default: goto L8;
            }
        L8:
            if (r3 <= 0) goto L50
            r2.sendKey(r3, r4)
            goto L50
        Le:
            if (r4 == 0) goto L13
            ca.dnamobile.javalauncher.controls.TouchKeyboardHelper.showKeyboard(r2)
        L13:
            return
        L14:
            if (r4 == 0) goto L1b
            ca.dnamobile.javalauncher.controls.TouchControlButtonView$Listener r3 = r2.listener
            r3.onToggleControlsRequested()
        L1b:
            return
        L1c:
            r3 = 0
            org.lwjgl.glfw.CallbackBridge.sendMouseButton(r3, r4)
            return
        L21:
            r3 = 1
            org.lwjgl.glfw.CallbackBridge.sendMouseButton(r3, r4)
            return
        L26:
            if (r4 == 0) goto L2b
            r2.toggleVirtualMouse()
        L2b:
            return
        L2c:
            r3 = 2
            org.lwjgl.glfw.CallbackBridge.sendMouseButton(r3, r4)
            return
        L31:
            if (r4 != 0) goto L38
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            org.lwjgl.glfw.CallbackBridge.sendScroll(r0, r3)
        L38:
            return
        L39:
            if (r4 != 0) goto L40
            r3 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            org.lwjgl.glfw.CallbackBridge.sendScroll(r0, r3)
        L40:
            return
        L41:
            if (r4 == 0) goto L48
            ca.dnamobile.javalauncher.controls.TouchControlButtonView$Listener r3 = r2.listener
            r3.onMenuRequested()
        L48:
            return
        L49:
            if (r4 == 0) goto L50
            ca.dnamobile.javalauncher.controls.TouchControlButtonView$Listener r3 = r2.listener
            r3.onKeySenderKeyboardRequested()
        L50:
            return
    }

    private void setJoystickKeyStates(boolean r2, boolean r3, boolean r4, boolean r5) {
            r1 = this;
            boolean r0 = r1.joystickWDown
            if (r0 == r2) goto Lb
            r1.joystickWDown = r2
            r0 = 87
            r1.sendKey(r0, r2)
        Lb:
            boolean r2 = r1.joystickADown
            if (r2 == r3) goto L16
            r1.joystickADown = r3
            r2 = 65
            r1.sendKey(r2, r3)
        L16:
            boolean r2 = r1.joystickSDown
            if (r2 == r4) goto L21
            r1.joystickSDown = r4
            r2 = 83
            r1.sendKey(r2, r4)
        L21:
            boolean r2 = r1.joystickDDown
            if (r2 == r5) goto L2c
            r1.joystickDDown = r5
            r2 = 68
            r1.sendKey(r2, r5)
        L2c:
            return
    }

    private void setTouchFeedbackActive(boolean r2) {
            r1 = this;
            boolean r0 = r1.touchFeedbackActive
            if (r0 != r2) goto L5
            return
        L5:
            r1.touchFeedbackActive = r2
            r1.updateInteractionAlpha()
            return
    }

    private void setupJoystickPaints() {
            r3 = this;
            android.graphics.Paint r0 = r3.joystickBasePaint
            r1 = 855638016(0x33000000, float:2.9802322E-8)
            r0.setColor(r1)
            android.graphics.Paint r0 = r3.joystickBasePaint
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            android.graphics.Paint r0 = r3.joystickStrokePaint
            r1 = -1426063361(0xffffffffaaffffff, float:-4.5474732E-13)
            r0.setColor(r1)
            android.graphics.Paint r0 = r3.joystickStrokePaint
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r1)
            android.graphics.Paint r0 = r3.joystickStrokePaint
            android.content.res.Resources r1 = r3.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r2
            r0.setStrokeWidth(r1)
            android.graphics.Paint r0 = r3.joystickKnobPaint
            r1 = -1711276033(0xffffffff99ffffff, float:-2.6469778E-23)
            r0.setColor(r1)
            android.graphics.Paint r0 = r3.joystickKnobPaint
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            android.graphics.Paint r0 = r3.joystickGuidePaint
            r1 = 1728053247(0x66ffffff, float:6.0446287E23)
            r0.setColor(r1)
            android.graphics.Paint r0 = r3.joystickGuidePaint
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r1)
            android.graphics.Paint r0 = r3.joystickGuidePaint
            android.content.res.Resources r1 = r3.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            r2 = 1067450368(0x3fa00000, float:1.25)
            float r1 = r1 * r2
            r0.setStrokeWidth(r1)
            return
    }

    private void setupResizeHandlePaints() {
            r3 = this;
            android.graphics.Paint r0 = r3.resizeHandlePaint
            r1 = -1440361600(0xffffffffaa25d380, float:-1.4728323E-13)
            r0.setColor(r1)
            android.graphics.Paint r0 = r3.resizeHandlePaint
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            android.graphics.Paint r0 = r3.resizeHandleStrokePaint
            r1 = -1
            r0.setColor(r1)
            android.graphics.Paint r0 = r3.resizeHandleStrokePaint
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r1)
            android.graphics.Paint r0 = r3.resizeHandleStrokePaint
            android.content.res.Resources r1 = r3.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            r2 = 1069547520(0x3fc00000, float:1.5)
            float r1 = r1 * r2
            r0.setStrokeWidth(r1)
            return
    }

    private void toggleVirtualMouse() {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            boolean r0 = ca.dnamobile.javalauncher.controls.ControlsPreferences.isVirtualMouseEnabled(r0)
            r1 = r0 ^ 1
            android.content.Context r2 = r3.getContext()
            ca.dnamobile.javalauncher.controls.ControlsPreferences.setVirtualMouseEnabled(r2, r1)
            android.content.Context r1 = r3.getContext()
            if (r0 != 0) goto L1a
            java.lang.String r0 = "Virtual cursor shown"
            goto L1c
        L1a:
            java.lang.String r0 = "Virtual cursor hidden"
        L1c:
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r2)
            r0.show()
            return
    }

    private void updateInteractionAlpha() {
            r1 = this;
            boolean r0 = r1.editMode
            if (r0 != 0) goto Le
            boolean r0 = r1.touchFeedbackActive
            if (r0 == 0) goto Le
            r0 = 1056964608(0x3f000000, float:0.5)
            r1.setAlpha(r0)
            return
        Le:
            float r0 = r1.resolvedDisplayAlpha()
            r1.setAlpha(r0)
            return
    }

    private void updateJoystick(float r9, float r10) {
            r8 = this;
            float r0 = r8.joystickCenterX
            float r9 = r9 - r0
            float r0 = r8.joystickCenterY
            float r10 = r10 - r0
            int r0 = r8.getWidth()
            int r1 = r8.getHeight()
            int r0 = java.lang.Math.min(r0, r1)
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.max(r1, r0)
            r2 = 1054615798(0x3edc28f6, float:0.43)
            float r0 = r0 * r2
            float r0 = java.lang.Math.max(r1, r0)
            float r1 = r9 * r9
            float r2 = r10 * r10
            float r1 = r1 + r2
            double r1 = (double) r1
            double r1 = java.lang.Math.sqrt(r1)
            float r1 = (float) r1
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 <= 0) goto L33
            float r9 = r9 / r1
            goto L34
        L33:
            r9 = r2
        L34:
            if (r3 <= 0) goto L38
            float r2 = r10 / r1
        L38:
            float r10 = java.lang.Math.min(r1, r0)
            float r9 = r9 * r10
            float r2 = r2 * r10
            float r10 = r8.joystickCenterX
            float r10 = r10 + r9
            r8.joystickKnobX = r10
            float r10 = r8.joystickCenterY
            float r10 = r10 + r2
            r8.joystickKnobY = r10
            r8.invalidate()
            int r10 = r8.touchSlop
            float r10 = (float) r10
            r3 = 1042536202(0x3e23d70a, float:0.16)
            float r3 = r3 * r0
            float r10 = java.lang.Math.max(r10, r3)
            float r3 = -r10
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r4 >= 0) goto L5f
            r7 = r5
            goto L60
        L5f:
            r7 = r6
        L60:
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r3 >= 0) goto L66
            r3 = r5
            goto L67
        L66:
            r3 = r6
        L67:
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r2 <= 0) goto L6d
            r2 = r5
            goto L6e
        L6d:
            r2 = r6
        L6e:
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 <= 0) goto L74
            r9 = r5
            goto L75
        L74:
            r9 = r6
        L75:
            r8.setJoystickKeyStates(r7, r3, r2, r9)
            ca.dnamobile.javalauncher.controls.TouchControlData r9 = r8.data
            boolean r9 = r9.joystickForwardLock
            if (r9 == 0) goto L89
            if (r4 >= 0) goto L89
            r9 = 1063339950(0x3f6147ae, float:0.88)
            float r0 = r0 * r9
            int r9 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r9 <= 0) goto L89
            goto L8a
        L89:
            r5 = r6
        L8a:
            boolean r9 = r8.joystickForwardLockDown
            if (r5 == r9) goto L95
            r8.joystickForwardLockDown = r5
            r9 = 341(0x155, float:4.78E-43)
            r8.sendKey(r9, r5)
        L95:
            return
    }

    ca.dnamobile.javalauncher.controls.TouchControlData getData() {
            r1 = this;
            ca.dnamobile.javalauncher.controls.TouchControlData r0 = r1.data
            return r0
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
            r0 = this;
            r0.releaseInputState()
            super.onDetachedFromWindow()
            return
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(android.graphics.Canvas r3) {
            r2 = this;
            ca.dnamobile.javalauncher.controls.TouchControlData r0 = r2.data
            java.lang.String r0 = r0.action
            java.lang.String r1 = "joystick"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lf
            r2.drawJoystick(r3)
        Lf:
            super.onDraw(r3)
            boolean r0 = r2.editMode
            if (r0 == 0) goto L19
            r2.drawResizeHandle(r3)
        L19:
            return
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            ca.dnamobile.javalauncher.controls.TouchControlData r3 = r0.data
            java.lang.String r3 = r3.action
            java.lang.String r4 = "joystick"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L1d
            boolean r3 = r0.pressedState
            if (r3 != 0) goto L1d
            float r1 = (float) r1
            r3 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r3
            r0.joystickKnobX = r1
            float r1 = (float) r2
            float r1 = r1 / r3
            r0.joystickKnobY = r1
        L1d:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            boolean r0 = r1.editMode
            if (r0 == 0) goto L9
            boolean r2 = r1.handleEditTouch(r2)
            return r2
        L9:
            boolean r2 = r1.handleGameTouch(r2)
            return r2
    }

    @Override // android.view.View
    public boolean performClick() {
            r1 = this;
            super.performClick()
            r0 = 1
            return r0
    }

    void refreshVisualState() {
            r1 = this;
            ca.dnamobile.javalauncher.controls.TouchControlData r0 = r1.data
            java.lang.String r0 = r0.label
            r1.setText(r0)
            boolean r0 = r1.editMode
            android.graphics.drawable.GradientDrawable r0 = r1.makeBackground(r0)
            r1.setBackground(r0)
            r1.updateInteractionAlpha()
            r1.invalidate()
            return
    }

    void releaseInputState() {
            r2 = this;
            r2.cancelEditLongPress()
            r2.releaseJoystick()
            boolean r0 = r2.pressedState
            r1 = 0
            if (r0 == 0) goto L10
            r2.pressedState = r1
            r2.send(r1)
        L10:
            r2.editLongPressTriggered = r1
            r2.editDragging = r1
            r2.editResizing = r1
            r2.touchFeedbackActive = r1
            r2.setPressed(r1)
            r2.setActivated(r1)
            r2.updateInteractionAlpha()
            return
    }

    void setEditMode(boolean r1) {
            r0 = this;
            r0.editMode = r1
            r0.refreshVisualState()
            return
    }
}
