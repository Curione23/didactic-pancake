package ca.dnamobile.javalauncher.controls;

/* JADX INFO: loaded from: classes.dex */
public final class TouchControlsOverlay extends android.widget.FrameLayout implements ca.dnamobile.javalauncher.controls.TouchControlButtonView.Listener {
    private static final int MAX_EDIT_HISTORY = 4;
    private static final int MOUSE_BUTTON_LEFT = 0;
    private static final int MOUSE_BUTTON_RIGHT = 1;
    private static final java.lang.String MOUSE_PASS_THROUGH_PREFS = "touch_control_mouse_pass_through";
    private static final int NO_POINTER_ID = -1;
    private static final long OPTIONS_FILE_RESOLVE_THROTTLE_MS = 1000;
    private static final java.lang.String SWIPE_GESTURE_PREFS = "touch_control_swipe_gesture";
    private static final java.lang.String TAG = "TouchControlsOverlay";
    private boolean androidPointerIconHidden;
    private ca.dnamobile.javalauncher.controls.TouchControlsOverlay.AppMenuListener appMenuListener;
    private java.io.File cachedMinecraftOptionsFile;
    private float cameraDownX;
    private float cameraDownY;
    private float cameraLastX;
    private float cameraLastY;
    private boolean cameraLongPressAttackActive;
    private java.lang.Runnable cameraLongPressRunnable;
    private boolean cameraMovedPastSlop;
    private int cameraPointerId;
    private final int cameraTouchSlop;
    private final android.util.SparseArray<ca.dnamobile.javalauncher.controls.TouchControlButtonView> controlPointerTargets;
    private boolean controlsVisible;
    private boolean editMode;
    private final android.os.Handler gestureHandler;
    private final android.graphics.Paint hotbarDebugFillPaint;
    private final android.graphics.Paint hotbarDebugSlotPaint;
    private final android.graphics.Paint hotbarDebugStrokePaint;
    private final android.graphics.Paint hotbarDebugTextPaint;
    private boolean hotbarDoubleTapConsumed;
    private int hotbarLastSlot;
    private int hotbarPointerId;
    private android.view.View keySenderKeyboardView;
    private boolean keySenderKeyboardVisible;
    private int lastHotbarTapSlot;
    private long lastHotbarTapTimeMs;
    private boolean lastKnownMouseGrabbed;
    private long lastMinecraftOptionsResolveAtMs;
    private boolean lastVirtualMousePreference;
    private ca.dnamobile.javalauncher.controls.TouchControlsLayoutData layoutData;
    private java.io.File layoutFile;
    private java.lang.String loadedVirtualCursorCustomPath;
    private int loadedVirtualCursorSizePercent;
    private java.lang.String loadedVirtualCursorStyle;
    private java.io.File minecraftOptionsFile;
    private final android.util.SparseArray<ca.dnamobile.javalauncher.controls.TouchControlsOverlay.MousePassThroughState> mousePassThroughPointers;
    private long passthroughDownTime;
    private float passthroughDownX;
    private float passthroughDownY;
    private boolean passthroughMovedPastSlop;
    private int passthroughPointerId;
    private android.view.View passthroughTarget;
    private boolean pointerIconReapplyPending;
    private boolean rebuildPending;
    private final java.util.ArrayDeque<java.lang.String> redoHistory;
    private final android.util.SparseArray<ca.dnamobile.javalauncher.controls.TouchControlsOverlay.SwipeGestureState> swipeGesturePointers;
    private android.view.PointerIcon transparentPointerIcon;
    private final java.util.ArrayDeque<java.lang.String> undoHistory;
    private android.graphics.Bitmap virtualCursorBitmap;
    private float virtualCursorBridgeX;
    private float virtualCursorBridgeY;
    private final android.graphics.Paint virtualCursorFillPaint;
    private boolean virtualCursorInitialized;
    private final android.graphics.Path virtualCursorPath;
    private final android.graphics.Paint virtualCursorShadowPaint;
    private final android.graphics.Paint virtualCursorStrokePaint;
    private float virtualMouseDownX;
    private float virtualMouseDownY;
    private float virtualMouseLastX;
    private float virtualMouseLastY;
    private boolean virtualMouseMovedPastSlop;
    private int virtualMousePointerId;







    public interface AppMenuListener {
        void onTouchControlsMenuRequested();
    }

    private static final class LayoutMetrics {
        final float formulaPixelScale;
        final float parentHeight;
        final float parentWidth;
        final boolean pixelCoordinates;
        final float sizeScale;
        final float sourceHeight;
        final float sourceWidth;
        final float xScale;
        final float yScale;

        LayoutMetrics(boolean r1, float r2, float r3, float r4, float r5, float r6, float r7, float r8, float r9) {
                r0 = this;
                r0.<init>()
                r0.pixelCoordinates = r1
                r1 = 1065353216(0x3f800000, float:1.0)
                float r2 = java.lang.Math.max(r1, r2)
                r0.parentWidth = r2
                float r2 = java.lang.Math.max(r1, r3)
                r0.parentHeight = r2
                float r2 = java.lang.Math.max(r1, r4)
                r0.sourceWidth = r2
                float r1 = java.lang.Math.max(r1, r5)
                r0.sourceHeight = r1
                r1 = 1036831949(0x3dcccccd, float:0.1)
                float r2 = java.lang.Math.max(r1, r6)
                r0.xScale = r2
                float r2 = java.lang.Math.max(r1, r7)
                r0.yScale = r2
                float r2 = java.lang.Math.max(r1, r8)
                r0.sizeScale = r2
                float r1 = java.lang.Math.max(r1, r9)
                r0.formulaPixelScale = r1
                return
        }

        private float centerMappedScreenX(float r4, float r5) {
                r3 = this;
                float r0 = r3.sourceWidth
                r1 = 1073741824(0x40000000, float:2.0)
                float r0 = r0 / r1
                float r4 = r4 - r0
                float r0 = r3.parentWidth
                float r0 = r0 / r1
                float r2 = r3.sizeScale
                float r4 = r4 * r2
                float r0 = r0 + r4
                float r5 = r5 / r1
                float r0 = r0 - r5
                return r0
        }

        private float centerMappedSourceX(float r3, float r4, float r5) {
                r2 = this;
                r0 = 1073741824(0x40000000, float:2.0)
                float r4 = r4 / r0
                float r3 = r3 + r4
                float r4 = r2.sourceWidth
                float r4 = r4 / r0
                float r1 = r2.parentWidth
                float r1 = r1 / r0
                float r3 = r3 - r1
                float r1 = r2.sizeScale
                float r3 = r3 / r1
                float r4 = r4 + r3
                float r5 = r5 / r0
                float r4 = r4 - r5
                return r4
        }

        private boolean isOutOfSourceBoundsX(ca.dnamobile.javalauncher.controls.TouchControlData r3, float r4) {
                r2 = this;
                float r0 = r3.x
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 < 0) goto L13
                float r3 = r3.x
                float r3 = r3 + r4
                float r4 = r2.sourceWidth
                int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r3 <= 0) goto L11
                goto L13
            L11:
                r3 = 0
                goto L14
            L13:
                r3 = 1
            L14:
                return r3
        }

        float fromScreenHeight(float r2) {
                r1 = this;
                float r0 = r1.sizeScale
                float r2 = r2 / r0
                return r2
        }

        float fromScreenWidth(float r2) {
                r1 = this;
                float r0 = r1.sizeScale
                float r2 = r2 / r0
                return r2
        }

        float fromScreenX(ca.dnamobile.javalauncher.controls.TouchControlData r6, float r7, float r8) {
                r5 = this;
                boolean r0 = r5.pixelCoordinates
                if (r0 != 0) goto L8
                float r6 = r5.xScale
                float r7 = r7 / r6
                return r7
            L8:
                r0 = 1065353216(0x3f800000, float:1.0)
                float r1 = r6.width
                float r0 = java.lang.Math.max(r0, r1)
                float r1 = r6.x
                r2 = 1073741824(0x40000000, float:2.0)
                float r2 = r0 / r2
                float r1 = r1 + r2
                float r2 = r5.sourceWidth
                r3 = 1058306785(0x3f147ae1, float:0.58)
                float r3 = r3 * r2
                r4 = 1054280253(0x3ed70a3d, float:0.42)
                float r2 = r2 * r4
                boolean r6 = r5.isOutOfSourceBoundsX(r6, r0)
                if (r6 == 0) goto L2c
                float r6 = r5.centerMappedSourceX(r7, r8, r0)
                return r6
            L2c:
                int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r6 < 0) goto L41
                float r6 = r5.parentWidth
                float r6 = r6 - r7
                float r6 = r6 - r8
                r7 = 0
                float r6 = java.lang.Math.max(r7, r6)
                float r7 = r5.sourceWidth
                float r8 = r5.sizeScale
                float r6 = r6 / r8
                float r7 = r7 - r6
                float r7 = r7 - r0
                return r7
            L41:
                int r6 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r6 > 0) goto L49
                float r6 = r5.sizeScale
                float r7 = r7 / r6
                return r7
            L49:
                float r6 = r5.centerMappedSourceX(r7, r8, r0)
                return r6
        }

        float fromScreenY(float r2) {
                r1 = this;
                boolean r0 = r1.pixelCoordinates
                if (r0 == 0) goto L7
                float r0 = r1.sizeScale
                goto L9
            L7:
                float r0 = r1.yScale
            L9:
                float r2 = r2 / r0
                return r2
        }

        float maxLayoutXUnits() {
                r2 = this;
                boolean r0 = r2.pixelCoordinates
                if (r0 == 0) goto L7
                float r0 = r2.sourceWidth
                goto Lc
            L7:
                float r0 = r2.parentWidth
                float r1 = r2.xScale
                float r0 = r0 / r1
            Lc:
                return r0
        }

        float maxLayoutYUnits() {
                r2 = this;
                boolean r0 = r2.pixelCoordinates
                if (r0 == 0) goto L7
                float r0 = r2.sourceHeight
                goto Lc
            L7:
                float r0 = r2.parentHeight
                float r1 = r2.yScale
                float r0 = r0 / r1
            Lc:
                return r0
        }

        int toScreenHeight(float r2) {
                r1 = this;
                r0 = 1065353216(0x3f800000, float:1.0)
                float r2 = java.lang.Math.max(r0, r2)
                float r0 = r1.sizeScale
                float r2 = r2 * r0
                int r2 = java.lang.Math.round(r2)
                r0 = 32
                int r2 = java.lang.Math.max(r0, r2)
                return r2
        }

        int toScreenWidth(float r2) {
                r1 = this;
                r0 = 1065353216(0x3f800000, float:1.0)
                float r2 = java.lang.Math.max(r0, r2)
                float r0 = r1.sizeScale
                float r2 = r2 * r0
                int r2 = java.lang.Math.round(r2)
                r0 = 32
                int r2 = java.lang.Math.max(r0, r2)
                return r2
        }

        float toScreenX(ca.dnamobile.javalauncher.controls.TouchControlData r6, float r7) {
                r5 = this;
                boolean r0 = r5.pixelCoordinates
                if (r0 != 0) goto La
                float r6 = r6.x
                float r7 = r5.xScale
            L8:
                float r6 = r6 * r7
                return r6
            La:
                r0 = 1065353216(0x3f800000, float:1.0)
                float r1 = r6.width
                float r0 = java.lang.Math.max(r0, r1)
                float r1 = r6.x
                r2 = 1073741824(0x40000000, float:2.0)
                float r2 = r0 / r2
                float r1 = r1 + r2
                float r2 = r5.sourceWidth
                r3 = 1058306785(0x3f147ae1, float:0.58)
                float r3 = r3 * r2
                r4 = 1054280253(0x3ed70a3d, float:0.42)
                float r2 = r2 * r4
                boolean r4 = r5.isOutOfSourceBoundsX(r6, r0)
                if (r4 == 0) goto L2e
                float r6 = r5.centerMappedScreenX(r1, r7)
                return r6
            L2e:
                int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r3 < 0) goto L45
                float r1 = r5.sourceWidth
                float r6 = r6.x
                float r1 = r1 - r6
                float r1 = r1 - r0
                r6 = 0
                float r6 = java.lang.Math.max(r6, r1)
                float r0 = r5.parentWidth
                float r1 = r5.sizeScale
                float r6 = r6 * r1
                float r0 = r0 - r6
                float r0 = r0 - r7
                return r0
            L45:
                int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r0 > 0) goto L4e
                float r6 = r6.x
                float r7 = r5.sizeScale
                goto L8
            L4e:
                float r6 = r5.centerMappedScreenX(r1, r7)
                return r6
        }

        float toScreenY(ca.dnamobile.javalauncher.controls.TouchControlData r1, float r2) {
                r0 = this;
                boolean r2 = r0.pixelCoordinates
                if (r2 != 0) goto La
                float r1 = r1.y
                float r2 = r0.yScale
            L8:
                float r1 = r1 * r2
                return r1
            La:
                float r1 = r1.y
                float r2 = r0.sizeScale
                goto L8
        }
    }

    private static final class MousePassThroughState {
        final float downX;
        final float downY;
        float lastX;
        float lastY;
        boolean movedPastSlop;

        MousePassThroughState(float r1, float r2) {
                r0 = this;
                r0.<init>()
                r0.downX = r1
                r0.downY = r2
                r0.lastX = r1
                r0.lastY = r2
                return
        }
    }

    private static final class SwipeGestureState {
        ca.dnamobile.javalauncher.controls.TouchControlButtonView activeSwipeControl;
        final ca.dnamobile.javalauncher.controls.TouchControlButtonView primaryControl;

        SwipeGestureState(ca.dnamobile.javalauncher.controls.TouchControlButtonView r1) {
                r0 = this;
                r0.<init>()
                r0.primaryControl = r1
                return
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$-5omjNS9FLdGBlYJsVK2xPeiIEg, reason: not valid java name */
    public static /* synthetic */ void m413$r8$lambda$5omjNS9FLdGBlYJsVK2xPeiIEg(ca.dnamobile.javalauncher.controls.TouchControlsOverlay r0, android.content.Context r1, android.widget.CompoundButton r2, boolean r3) {
            r0.lambda$showEditDialog$7(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$5BRo5aUirrz6f-6vh_zOGzbWq1U, reason: not valid java name */
    public static /* synthetic */ void m414$r8$lambda$5BRo5aUirrz6f6vh_zOGzbWq1U(ca.dnamobile.javalauncher.controls.TouchControlsOverlay r0, android.widget.Spinner[] r1, int r2, android.widget.EditText r3, android.widget.TextView r4, ca.dnamobile.javalauncher.controls.TouchInputBinding.Option[] r5, android.view.View r6) {
            r0.lambda$showEditDialog$6(r1, r2, r3, r4, r5, r6)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$9PXkT0_FqONuAOU3UQx-NB7Tm_Y, reason: not valid java name */
    public static /* synthetic */ void m415$r8$lambda$9PXkT0_FqONuAOU3UQxNB7Tm_Y(ca.dnamobile.javalauncher.controls.TouchControlsOverlay r0, android.content.Context r1, int r2, android.widget.Spinner[] r3, android.widget.EditText r4, android.widget.TextView r5, ca.dnamobile.javalauncher.controls.TouchInputBinding.Option[] r6, android.view.View r7) {
            r0.lambda$showEditDialog$5(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$EyQJ88_vahPKLBCddr-bUM_HR0s, reason: not valid java name */
    public static /* synthetic */ void m416$r8$lambda$EyQJ88_vahPKLBCddrbUM_HR0s(ca.dnamobile.javalauncher.controls.TouchControlsOverlay r0, boolean[] r1, android.widget.EditText r2, android.widget.SeekBar r3) {
            r0.lambda$showEditDialog$12(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$JRIcxoNQe87TATQ0aekX0ioT2CU(ca.dnamobile.javalauncher.controls.TouchControlsOverlay r0, boolean[] r1, android.widget.EditText r2, android.widget.SeekBar r3) {
            r0.lambda$showEditDialog$10(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$Q3N4bfo6Fz5E_shuhbl7fox3cxo(ca.dnamobile.javalauncher.controls.TouchControlsOverlay r0, boolean[] r1, android.widget.EditText r2, android.widget.SeekBar r3) {
            r0.lambda$showEditDialog$14(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$QR2RT74f1O4D4dNiHK5LmC7X_ms(ca.dnamobile.javalauncher.controls.TouchControlsOverlay r0, java.lang.String r1, boolean[] r2, ca.dnamobile.javalauncher.controls.TouchControlData r3, android.app.AlertDialog r4, android.view.View r5) {
            r0.lambda$showEditDialog$17(r1, r2, r3, r4, r5)
            return
    }

    public static /* synthetic */ void $r8$lambda$R8hRgqo5Z9izrszxdLtSRTYR4r0(ca.dnamobile.javalauncher.controls.TouchControlsOverlay r0) {
            r0.lambda$schedulePointerIconReapply$3()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$SyBCdP5-toJfrQtXhgrIjGvHwSY, reason: not valid java name */
    public static /* synthetic */ void m417$r8$lambda$SyBCdP5toJfrQtXhgrIjGvHwSY(ca.dnamobile.javalauncher.controls.TouchControlsOverlay r0) {
            r0.lambda$onAttachedToWindow$1()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$WvG7AOH2xeMV9PxAc8dG2r-pyCQ, reason: not valid java name */
    public static /* synthetic */ void m418$r8$lambda$WvG7AOH2xeMV9PxAc8dG2rpyCQ(ca.dnamobile.javalauncher.controls.TouchControlsOverlay r0, android.app.AlertDialog r1, boolean[] r2, boolean[] r3, ca.dnamobile.javalauncher.controls.TouchControlData r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, int r8, int[] r9, int[] r10, int r11, int r12, float r13, float r14, float r15, float r16, float r17, float r18, float r19, float r20, int r21, int r22, boolean r23, boolean r24, boolean r25, boolean r26, java.lang.String r27, java.lang.String r28, android.content.DialogInterface r29) {
            r0.lambda$showEditDialog$20(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$XBAzB1pAGVUkClU-EieyaSH9BPA, reason: not valid java name */
    public static /* synthetic */ void m419$r8$lambda$XBAzB1pAGVUkClUEieyaSH9BPA(ca.dnamobile.javalauncher.controls.TouchControlsOverlay r0) {
            r0.lambda$schedulePointerIconReapply$4()
            return
    }

    public static /* synthetic */ void $r8$lambda$Zbv_UyIRzwgewzM_D1HPCZRMdw4(ca.dnamobile.javalauncher.controls.TouchControlsOverlay r0, android.app.AlertDialog r1, java.lang.String r2, boolean[] r3, ca.dnamobile.javalauncher.controls.TouchControlData r4, java.lang.String r5, android.widget.EditText r6, android.widget.Spinner r7, java.lang.String[] r8, ca.dnamobile.javalauncher.controls.TouchInputBinding.Option[][] r9, android.widget.Spinner r10, android.widget.Spinner[] r11, ca.dnamobile.javalauncher.controls.TouchInputBinding.Option[] r12, android.widget.EditText r13, android.widget.CheckBox r14, android.widget.CheckBox r15, android.widget.EditText r16, android.widget.EditText r17, android.widget.EditText r18, android.widget.EditText r19, float[] r20, android.widget.EditText r21, android.widget.EditText r22, android.widget.EditText r23, android.widget.EditText r24, android.widget.CheckBox r25, android.widget.CheckBox r26, android.widget.CheckBox r27, android.widget.CheckBox r28, boolean[] r29, android.content.DialogInterface r30) {
            r0.lambda$showEditDialog$19(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return
    }

    public static /* synthetic */ boolean $r8$lambda$cp1CGVVyybm8vGaH0v9YxW_MqUA(ca.dnamobile.javalauncher.controls.TouchControlsOverlay r0, android.widget.Spinner r1, android.widget.EditText r2, android.widget.TextView r3, android.widget.Spinner[] r4, ca.dnamobile.javalauncher.controls.TouchInputBinding.Option[] r5, int r6) {
            boolean r0 = r0.lambda$showKeyboardKeyPickerDialog$21(r1, r2, r3, r4, r5, r6)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$griSvUvUBoEJKDx30CPEjaVMd-I, reason: not valid java name */
    public static /* synthetic */ void m420$r8$lambda$griSvUvUBoEJKDx30CPEjaVMdI(ca.dnamobile.javalauncher.controls.TouchControlsOverlay r0, ca.dnamobile.javalauncher.controls.TouchControlData r1, android.widget.EditText r2, android.widget.EditText r3, android.widget.EditText r4, android.widget.EditText r5, android.widget.EditText r6, android.widget.EditText r7, android.widget.EditText r8, android.widget.EditText r9, android.widget.EditText r10, android.widget.TextView r11, ca.dnamobile.javalauncher.controls.TouchControlButtonView r12) {
            r0.lambda$showEditDialog$8(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$izZQTto0ZWZSWbj6Mrq03Vkn-wg, reason: not valid java name */
    public static /* synthetic */ void m421$r8$lambda$izZQTto0ZWZSWbj6Mrq03Vknwg(ca.dnamobile.javalauncher.controls.TouchControlsOverlay r0, boolean[] r1, android.widget.EditText r2, android.widget.SeekBar r3) {
            r0.lambda$showEditDialog$11(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$nRL-BsXliorWLjbJtYjHpHf_vUM, reason: not valid java name */
    public static /* synthetic */ void m422$r8$lambda$nRLBsXliorWLjbJtYjHpHf_vUM(ca.dnamobile.javalauncher.controls.TouchControlsOverlay r0, boolean[] r1, android.widget.EditText r2, android.widget.SeekBar r3) {
            r0.lambda$showEditDialog$9(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$nyhdTtd9Wdk5VfCG6FYjERYGQ20(ca.dnamobile.javalauncher.controls.TouchControlsOverlay r0) {
            r0.lambda$scheduleCameraLongPressAttack$22()
            return
    }

    public static /* synthetic */ void $r8$lambda$pdjMrzb4fzbz2PSdaWmXOfB43vc(ca.dnamobile.javalauncher.controls.TouchControlsOverlay r0, java.lang.String r1, ca.dnamobile.javalauncher.controls.TouchControlData r2, boolean[] r3, android.content.Context r4, android.app.AlertDialog r5, android.view.View r6) {
            r0.lambda$showEditDialog$16(r1, r2, r3, r4, r5, r6)
            return
    }

    public static /* synthetic */ void $r8$lambda$sW2h5dInmwz76a_YtoZGephGjQE(ca.dnamobile.javalauncher.controls.TouchControlsOverlay r0, java.lang.String r1, java.lang.String r2, android.widget.EditText r3, android.widget.Spinner r4, java.lang.String[] r5, ca.dnamobile.javalauncher.controls.TouchInputBinding.Option[][] r6, android.widget.Spinner r7, ca.dnamobile.javalauncher.controls.TouchControlData r8, android.widget.Spinner[] r9, ca.dnamobile.javalauncher.controls.TouchInputBinding.Option[] r10, android.widget.EditText r11, android.widget.CheckBox r12, android.widget.CheckBox r13, android.widget.EditText r14, android.widget.EditText r15, android.widget.EditText r16, android.widget.EditText r17, float[] r18, android.widget.EditText r19, android.widget.EditText r20, android.widget.EditText r21, android.widget.EditText r22, android.widget.CheckBox r23, android.widget.CheckBox r24, android.widget.CheckBox r25, android.widget.CheckBox r26, boolean[] r27, android.app.AlertDialog r28, android.view.View r29) {
            r0.lambda$showEditDialog$18(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return
    }

    public static /* synthetic */ void $r8$lambda$urPreFSjSwFTC_KMwQoUBlYdI2U(ca.dnamobile.javalauncher.controls.TouchControlsOverlay r0, boolean[] r1, android.widget.EditText r2, android.widget.SeekBar r3) {
            r0.lambda$showEditDialog$15(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$vvQEnUcK3nlIWZY527iRn2mlzFM(ca.dnamobile.javalauncher.controls.TouchControlsOverlay r0) {
            r0.lambda$rebuildWhenSized$0()
            return
    }

    public static /* synthetic */ void $r8$lambda$wgLpEdtIIuy47L91uvBbLDR_XJA(ca.dnamobile.javalauncher.controls.TouchControlsOverlay r0) {
            r0.lambda$onSizeChanged$2()
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mhideKeySenderKeyboard, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m423$$Nest$mhideKeySenderKeyboard(ca.dnamobile.javalauncher.controls.TouchControlsOverlay r0) {
            r0.hideKeySenderKeyboard()
            return
    }

    /* JADX INFO: renamed from: -$$Nest$msendQueuedKeySenderInputs, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m424$$Nest$msendQueuedKeySenderInputs(ca.dnamobile.javalauncher.controls.TouchControlsOverlay r0, java.util.List r1) {
            r0.sendQueuedKeySenderInputs(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$msetEditDialogPreviewAlpha, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m425$$Nest$msetEditDialogPreviewAlpha(ca.dnamobile.javalauncher.controls.TouchControlsOverlay r0, android.app.AlertDialog r1, boolean r2) {
            r0.setEditDialogPreviewAlpha(r1, r2)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$msetSliderProgress, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m426$$Nest$msetSliderProgress(ca.dnamobile.javalauncher.controls.TouchControlsOverlay r0, android.widget.SeekBar r1, int r2) {
            r0.setSliderProgress(r1, r2)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mupdateKeySlotSummary, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m427$$Nest$mupdateKeySlotSummary(ca.dnamobile.javalauncher.controls.TouchControlsOverlay r0, android.widget.EditText r1, android.widget.TextView r2, android.widget.Spinner[] r3, ca.dnamobile.javalauncher.controls.TouchInputBinding.Option[] r4) {
            r0.updateKeySlotSummary(r1, r2, r3, r4)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$smclamp, reason: not valid java name */
    static /* bridge */ /* synthetic */ float m428$$Nest$smclamp(float r0, float r1, float r2) {
            float r0 = clamp(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$smparseFloat, reason: not valid java name */
    static /* bridge */ /* synthetic */ float m429$$Nest$smparseFloat(android.widget.EditText r0, float r1) {
            float r0 = parseFloat(r0, r1)
            return r0
    }

    public TouchControlsOverlay(android.content.Context r12) {
            r11 = this;
            r11.<init>(r12)
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r11.undoHistory = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r11.redoHistory = r0
            r0 = 1
            r11.controlsVisible = r0
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r1 = ca.dnamobile.javalauncher.controls.TouchControlsLayoutData.defaultLayout()
            r11.layoutData = r1
            r11.lastKnownMouseGrabbed = r0
            java.lang.String r1 = ""
            r11.loadedVirtualCursorStyle = r1
            r1 = -1
            r11.loadedVirtualCursorSizePercent = r1
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            r11.gestureHandler = r2
            r11.cameraPointerId = r1
            r11.passthroughPointerId = r1
            r11.virtualMousePointerId = r1
            r11.hotbarPointerId = r1
            r11.hotbarLastSlot = r1
            r11.lastHotbarTapSlot = r1
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r11.controlPointerTargets = r2
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r11.mousePassThroughPointers = r2
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r11.swipeGesturePointers = r2
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>(r0)
            r11.hotbarDebugFillPaint = r2
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>(r0)
            r11.hotbarDebugStrokePaint = r3
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>(r0)
            r11.hotbarDebugSlotPaint = r4
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>(r0)
            r11.hotbarDebugTextPaint = r5
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>(r0)
            r11.virtualCursorFillPaint = r6
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>(r0)
            r11.virtualCursorStrokePaint = r7
            android.graphics.Paint r8 = new android.graphics.Paint
            r8.<init>(r0)
            r11.virtualCursorShadowPaint = r8
            android.graphics.Path r9 = new android.graphics.Path
            r9.<init>()
            r11.virtualCursorPath = r9
            r9 = 0
            r11.setClipChildren(r9)
            r11.setClipToPadding(r9)
            r11.setFocusable(r9)
            r11.setFocusableInTouchMode(r9)
            r11.setClickable(r0)
            r11.setMotionEventSplittingEnabled(r0)
            r11.setWillNotDraw(r9)
            r10 = 1157622587(0x44ffeb3b, float:2047.351)
            r2.setColor(r10)
            android.graphics.Paint$Style r10 = android.graphics.Paint.Style.FILL
            r2.setStyle(r10)
            r2 = -256(0xffffffffffffff00, float:NaN)
            r3.setColor(r2)
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r3.setStyle(r2)
            android.content.res.Resources r2 = r11.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r10 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 * r10
            r3.setStrokeWidth(r2)
            r2 = -855664640(0xffffffffccff9800, float:-1.3400474E8)
            r4.setColor(r2)
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r4.setStyle(r2)
            android.content.res.Resources r2 = r11.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r3 = 1069547520(0x3fc00000, float:1.5)
            float r2 = r2 * r3
            r4.setStrokeWidth(r2)
            r5.setColor(r1)
            android.graphics.Paint$Align r2 = android.graphics.Paint.Align.CENTER
            r5.setTextAlign(r2)
            android.content.res.Resources r2 = r11.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.scaledDensity
            r3 = 1094713344(0x41400000, float:12.0)
            float r2 = r2 * r3
            r5.setTextSize(r2)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3 = 1077936128(0x40400000, float:3.0)
            r4 = 0
            r5.setShadowLayer(r3, r4, r4, r2)
            r6.setColor(r1)
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r6.setStyle(r1)
            android.graphics.Paint$Join r1 = android.graphics.Paint.Join.ROUND
            r6.setStrokeJoin(r1)
            android.graphics.Paint$Cap r1 = android.graphics.Paint.Cap.ROUND
            r6.setStrokeCap(r1)
            android.content.res.Resources r1 = r11.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r1 = r1 * r10
            r6.setStrokeWidth(r1)
            r1 = -15658735(0xffffffffff111111, float:-1.9282667E38)
            r7.setColor(r1)
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r7.setStyle(r1)
            android.graphics.Paint$Join r1 = android.graphics.Paint.Join.ROUND
            r7.setStrokeJoin(r1)
            android.graphics.Paint$Cap r1 = android.graphics.Paint.Cap.ROUND
            r7.setStrokeCap(r1)
            android.content.res.Resources r1 = r11.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            r2 = 1082549862(0x40866666, float:4.2)
            float r1 = r1 * r2
            r7.setStrokeWidth(r1)
            r8.setColor(r9)
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r8.setStyle(r1)
            android.graphics.Paint$Join r1 = android.graphics.Paint.Join.ROUND
            r8.setStrokeJoin(r1)
            android.graphics.Paint$Cap r1 = android.graphics.Paint.Cap.ROUND
            r8.setStrokeCap(r1)
            r8.setStrokeWidth(r4)
            r11.reloadVirtualCursorBitmapIfNeeded(r0)
            android.view.ViewConfiguration r12 = android.view.ViewConfiguration.get(r12)
            int r12 = r12.getScaledTouchSlop()
            r11.cameraTouchSlop = r12
            return
    }

    private void addFieldRow(android.widget.LinearLayout r6, java.lang.String r7, android.widget.EditText r8) {
            r5 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            android.content.Context r1 = r5.getContext()
            r0.<init>(r1)
            r1 = 0
            r0.setOrientation(r1)
            r2 = 16
            r0.setGravity(r2)
            r2 = 1082130432(0x40800000, float:4.0)
            int r3 = r5.dp(r2)
            int r2 = r5.dp(r2)
            r0.setPadding(r1, r3, r1, r2)
            android.widget.TextView r2 = new android.widget.TextView
            android.content.Context r3 = r5.getContext()
            r2.<init>(r3)
            r2.setText(r7)
            r7 = -2039584(0xffffffffffe0e0e0, float:NaN)
            r2.setTextColor(r7)
            r7 = 1095761920(0x41500000, float:13.0)
            r2.setTextSize(r7)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r3 = 1062836634(0x3f59999a, float:0.85)
            r4 = -2
            r7.<init>(r1, r4, r3)
            r0.addView(r2, r7)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r2 = 1072064102(0x3fe66666, float:1.8)
            r7.<init>(r1, r4, r2)
            r0.addView(r8, r7)
            r6.addView(r0)
            return
    }

    private static void addOptionsCandidate(java.util.ArrayList<java.io.File> r2, java.io.File r3) {
            if (r3 != 0) goto L3
            return
        L3:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "options.txt"
            r0.<init>(r3, r1)
            r2.add(r0)
            return
    }

    private void addPreviewSliderListener(android.widget.SeekBar r2, android.app.AlertDialog[] r3, java.lang.Runnable r4) {
            r1 = this;
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$5 r0 = new ca.dnamobile.javalauncher.controls.TouchControlsOverlay$5
            r0.<init>(r1, r4, r3)
            r2.setOnSeekBarChangeListener(r0)
            return
    }

    private void addSectionHeader(android.widget.LinearLayout r4, java.lang.String r5, java.lang.String r6) {
            r3 = this;
            android.widget.TextView r0 = new android.widget.TextView
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r0.setText(r5)
            r5 = -1
            r0.setTextColor(r5)
            r5 = 1098907648(0x41800000, float:16.0)
            r0.setTextSize(r5)
            r5 = 1096810496(0x41600000, float:14.0)
            int r5 = r3.dp(r5)
            r1 = 1073741824(0x40000000, float:2.0)
            int r1 = r3.dp(r1)
            r2 = 0
            r0.setPadding(r2, r5, r2, r1)
            r4.addView(r0)
            if (r6 == 0) goto L57
            java.lang.String r5 = r6.trim()
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L57
            android.widget.TextView r5 = new android.widget.TextView
            android.content.Context r0 = r3.getContext()
            r5.<init>(r0)
            r5.setText(r6)
            r6 = -4342339(0xffffffffffbdbdbd, float:NaN)
            r5.setTextColor(r6)
            r6 = 1094713344(0x41400000, float:12.0)
            r5.setTextSize(r6)
            r6 = 1086324736(0x40c00000, float:6.0)
            int r6 = r3.dp(r6)
            r5.setPadding(r2, r2, r2, r6)
            r4.addView(r5)
        L57:
            return
    }

    private android.widget.SeekBar addSlider(android.widget.LinearLayout r3, int r4, int r5) {
            r2 = this;
            android.widget.SeekBar r0 = new android.widget.SeekBar
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r1 = 1
            int r4 = java.lang.Math.max(r1, r4)
            r0.setMax(r4)
            r2.setSliderProgress(r0, r5)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = -1
            r1 = -2
            r4.<init>(r5, r1)
            r3.addView(r0, r4)
            return r0
    }

    private void addSpinnerRow(android.widget.LinearLayout r6, java.lang.String r7, android.widget.Spinner r8) {
            r5 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            android.content.Context r1 = r5.getContext()
            r0.<init>(r1)
            r1 = 0
            r0.setOrientation(r1)
            r2 = 16
            r0.setGravity(r2)
            r2 = 1082130432(0x40800000, float:4.0)
            int r3 = r5.dp(r2)
            int r2 = r5.dp(r2)
            r0.setPadding(r1, r3, r1, r2)
            android.widget.TextView r2 = new android.widget.TextView
            android.content.Context r3 = r5.getContext()
            r2.<init>(r3)
            r2.setText(r7)
            r7 = -2039584(0xffffffffffe0e0e0, float:NaN)
            r2.setTextColor(r7)
            r7 = 1095761920(0x41500000, float:13.0)
            r2.setTextSize(r7)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r3 = 1062836634(0x3f59999a, float:0.85)
            r4 = -2
            r7.<init>(r1, r4, r3)
            r0.addView(r2, r7)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r2 = 1072064102(0x3fe66666, float:1.8)
            r7.<init>(r1, r4, r2)
            r0.addView(r8, r7)
            r6.addView(r0)
            return
    }

    private java.lang.String appendKeyCodeText(java.lang.String r5, int r6) {
            r4 = this;
            java.lang.String r5 = r5.trim()
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto Lf
            java.lang.String r5 = java.lang.String.valueOf(r6)
            return r5
        Lf:
            java.lang.String r0 = "[,\\s]+"
            java.lang.String[] r0 = r5.split(r0)
            int r1 = r0.length
            r2 = 0
        L17:
            if (r2 >= r1) goto L29
            r3 = r0[r2]
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L26
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Throwable -> L26
            if (r3 != r6) goto L26
            return r5
        L26:
            int r2 = r2 + 1
            goto L17
        L29:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r0 = ", "
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            return r5
    }

    private void applyAndroidPointerIconPolicy(boolean r2) {
            r1 = this;
            r0 = 0
            r1.applyAndroidPointerIconPolicy(r2, r0)
            return
    }

    private void applyAndroidPointerIconPolicy(boolean r2, boolean r3) {
            r1 = this;
            r0 = 1
            r1.applyAndroidPointerIconPolicy(r2, r3, r0)
            return
    }

    private void applyAndroidPointerIconPolicy(boolean r3, boolean r4, boolean r5) {
            r2 = this;
            if (r3 != 0) goto L9
            if (r4 != 0) goto L9
            boolean r4 = r2.androidPointerIconHidden
            if (r4 != 0) goto L9
            return
        L9:
            if (r3 == 0) goto L10
            android.view.PointerIcon r4 = r2.invisiblePointerIcon()     // Catch: java.lang.Throwable -> L40
            goto L1a
        L10:
            android.content.Context r4 = r2.getContext()     // Catch: java.lang.Throwable -> L40
            r0 = 1000(0x3e8, float:1.401E-42)
            android.view.PointerIcon r4 = android.view.PointerIcon.getSystemIcon(r4, r0)     // Catch: java.lang.Throwable -> L40
        L1a:
            android.view.View r0 = r2.getRootView()     // Catch: java.lang.Throwable -> L40
            r2.applyPointerIconToViewTree(r0, r4)     // Catch: java.lang.Throwable -> L40
            r2.applyPointerIconToViewTree(r2, r4)     // Catch: java.lang.Throwable -> L40
            android.view.View r0 = r2.passthroughTarget     // Catch: java.lang.Throwable -> L40
            r2.applyPointerIconToViewTree(r0, r4)     // Catch: java.lang.Throwable -> L40
            android.view.ViewParent r0 = r2.getParent()     // Catch: java.lang.Throwable -> L40
            boolean r1 = r0 instanceof android.view.View     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L36
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> L40
            r2.applyPointerIconToViewTree(r0, r4)     // Catch: java.lang.Throwable -> L40
        L36:
            r2.androidPointerIconHidden = r3     // Catch: java.lang.Throwable -> L40
            if (r3 == 0) goto L48
            if (r5 == 0) goto L48
            r2.schedulePointerIconReapply()     // Catch: java.lang.Throwable -> L40
            goto L48
        L40:
            r3 = move-exception
            java.lang.String r4 = "TouchControlsOverlay"
            java.lang.String r5 = "Unable to update Android pointer icon"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r4, r5, r3)
        L48:
            return
    }

    private void applyControlPreview(ca.dnamobile.javalauncher.controls.TouchControlButtonView r6, ca.dnamobile.javalauncher.controls.TouchControlData r7) {
            r5 = this;
            int r0 = r5.getWidth()
            float r0 = (float) r0
            int r1 = r5.getHeight()
            float r1 = (float) r1
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$LayoutMetrics r0 = r5.layoutMetrics(r0, r1)
            float r1 = r7.width
            int r1 = r0.toScreenWidth(r1)
            float r2 = r7.height
            int r2 = r0.toScreenHeight(r2)
            int r3 = r5.getWidth()
            r4 = 1
            int r3 = java.lang.Math.max(r4, r3)
            int r1 = java.lang.Math.min(r1, r3)
            int r3 = r5.getHeight()
            int r3 = java.lang.Math.max(r4, r3)
            int r2 = java.lang.Math.min(r2, r3)
            android.view.ViewGroup$LayoutParams r3 = r6.getLayoutParams()
            if (r3 == 0) goto L40
            r3.width = r1
            r3.height = r2
            r6.setLayoutParams(r3)
        L40:
            float r3 = (float) r1
            float r3 = r0.toScreenX(r7, r3)
            int r4 = r5.getWidth()
            int r4 = r4 - r1
            float r1 = (float) r4
            r4 = 0
            float r1 = java.lang.Math.max(r4, r1)
            float r1 = clamp(r3, r4, r1)
            r6.setX(r1)
            float r1 = (float) r2
            float r0 = r0.toScreenY(r7, r1)
            int r1 = r5.getHeight()
            int r1 = r1 - r2
            float r1 = (float) r1
            float r1 = java.lang.Math.max(r4, r1)
            float r0 = clamp(r0, r4, r1)
            r6.setY(r0)
            java.lang.String r0 = r7.label
            r6.setText(r0)
            float r7 = r7.opacity
            r0 = 1065353216(0x3f800000, float:1.0)
            float r7 = clamp(r7, r4, r0)
            android.content.Context r1 = r5.getContext()
            float r1 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getGlobalOpacity(r1)
            float r0 = clamp(r1, r4, r0)
            float r7 = r7 * r0
            r6.setAlpha(r7)
            r6.refreshVisualState()
            r6.requestLayout()
            r6.invalidate()
            return
    }

    private void applyControlsVisualState() {
            r1 = this;
            boolean r0 = isMouseGrabbed()
            r1.applyControlsVisualStateForGrabState(r0)
            return
    }

    private void applyControlsVisualStateForGrabState(boolean r5) {
            r4 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r4.getChildCount()
            if (r1 >= r2) goto L29
            android.view.View r2 = r4.getChildAt(r1)
            boolean r3 = r2 instanceof ca.dnamobile.javalauncher.controls.TouchControlButtonView
            if (r3 == 0) goto L26
            r3 = r2
            ca.dnamobile.javalauncher.controls.TouchControlButtonView r3 = (ca.dnamobile.javalauncher.controls.TouchControlButtonView) r3
            r3.refreshVisualState()
            ca.dnamobile.javalauncher.controls.TouchControlData r3 = r3.getData()
            boolean r3 = r4.shouldShowControlButton(r3, r5)
            if (r3 == 0) goto L22
            r3 = r0
            goto L23
        L22:
            r3 = 4
        L23:
            r2.setVisibility(r3)
        L26:
            int r1 = r1 + 1
            goto L2
        L29:
            r4.postInvalidateOnAnimation()
            return
    }

    private void applyPointerIconToViewTree(android.view.View r3, android.view.PointerIcon r4) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            r3.setPointerIcon(r4)     // Catch: java.lang.Throwable -> L6
        L6:
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L1d
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r0 = 0
        Ld:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L1d
            android.view.View r1 = r3.getChildAt(r0)
            r2.applyPointerIconToViewTree(r1, r4)
            int r0 = r0 + 1
            goto Ld
        L1d:
            return
    }

    private void attachKeySenderKeyboardView() {
            r3 = this;
            boolean r0 = r3.keySenderKeyboardVisible
            if (r0 == 0) goto L2b
            boolean r0 = r3.editMode
            if (r0 == 0) goto L9
            goto L2b
        L9:
            android.view.View r0 = r3.keySenderKeyboardView
            if (r0 == 0) goto L19
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != r3) goto L19
            android.view.View r0 = r3.keySenderKeyboardView
            r0.bringToFront()
            return
        L19:
            android.view.View r0 = r3.createKeySenderKeyboardView()
            r3.keySenderKeyboardView = r0
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = -1
            r1.<init>(r2, r2)
            r3.addView(r0, r1)
            r0.bringToFront()
        L2b:
            return
    }

    private float bridgeCursorToViewX(float r5) {
            r4 = this;
            int r0 = org.lwjgl.glfw.CallbackBridge.windowWidth
            float r0 = (float) r0
            float r0 = maxCursorCoordinate(r0)
            int r1 = r4.getWidth()
            float r1 = (float) r1
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r2
            r2 = 0
            float r1 = java.lang.Math.max(r2, r1)
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 <= 0) goto L24
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 > 0) goto L1d
            goto L24
        L1d:
            float r5 = clamp(r5, r2, r0)
            float r5 = r5 * r1
            float r5 = r5 / r0
            return r5
        L24:
            return r2
    }

    private float bridgeCursorToViewY(float r5) {
            r4 = this;
            int r0 = org.lwjgl.glfw.CallbackBridge.windowHeight
            float r0 = (float) r0
            float r0 = maxCursorCoordinate(r0)
            int r1 = r4.getHeight()
            float r1 = (float) r1
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r2
            r2 = 0
            float r1 = java.lang.Math.max(r2, r1)
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 <= 0) goto L24
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 > 0) goto L1d
            goto L24
        L1d:
            float r5 = clamp(r5, r2, r0)
            float r5 = r5 * r1
            float r5 = r5 / r0
            return r5
        L24:
            return r2
    }

    private void cancelAllMousePassThroughPointers() {
            r1 = this;
            android.util.SparseArray<ca.dnamobile.javalauncher.controls.TouchControlsOverlay$MousePassThroughState> r0 = r1.mousePassThroughPointers
            r0.clear()
            return
    }

    private void cancelAllSwipeGesturePointers(android.view.MotionEvent r4) {
            r3 = this;
            r0 = 0
        L1:
            android.util.SparseArray<ca.dnamobile.javalauncher.controls.TouchControlsOverlay$SwipeGestureState> r1 = r3.swipeGesturePointers
            int r1 = r1.size()
            if (r0 >= r1) goto L25
            android.util.SparseArray<ca.dnamobile.javalauncher.controls.TouchControlsOverlay$SwipeGestureState> r1 = r3.swipeGesturePointers
            int r1 = r1.keyAt(r0)
            int r1 = r4.findPointerIndex(r1)
            android.util.SparseArray<ca.dnamobile.javalauncher.controls.TouchControlsOverlay$SwipeGestureState> r2 = r3.swipeGesturePointers
            java.lang.Object r2 = r2.valueAt(r0)
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$SwipeGestureState r2 = (ca.dnamobile.javalauncher.controls.TouchControlsOverlay.SwipeGestureState) r2
            if (r1 < 0) goto L22
            if (r2 == 0) goto L22
            r3.releaseActiveSwipeGestureControl(r4, r1, r2)
        L22:
            int r0 = r0 + 1
            goto L1
        L25:
            android.util.SparseArray<ca.dnamobile.javalauncher.controls.TouchControlsOverlay$SwipeGestureState> r4 = r3.swipeGesturePointers
            r4.clear()
            return
    }

    private void cancelCameraLongPressAttack(boolean r3) {
            r2 = this;
            java.lang.Runnable r0 = r2.cameraLongPressRunnable
            if (r0 == 0) goto Lc
            android.os.Handler r1 = r2.gestureHandler
            r1.removeCallbacks(r0)
            r0 = 0
            r2.cameraLongPressRunnable = r0
        Lc:
            if (r3 == 0) goto L18
            boolean r3 = r2.cameraLongPressAttackActive
            if (r3 == 0) goto L18
            r3 = 0
            r2.sendLeftMouse(r3)
            r2.cameraLongPressAttackActive = r3
        L18:
            return
    }

    private void cancelCameraPointer(boolean r2) {
            r1 = this;
            r0 = 0
            if (r2 == 0) goto La
            boolean r2 = r1.cameraLongPressAttackActive
            if (r2 == 0) goto La
            r1.sendLeftMouse(r0)
        La:
            r2 = 1
            r1.cancelCameraLongPressAttack(r2)
            r1.cameraLongPressAttackActive = r0
            r2 = -1
            r1.cameraPointerId = r2
            r1.cameraMovedPastSlop = r0
            return
    }

    private void cancelRuntimeTouchRoutingForLauncherDialog() {
            r1 = this;
            android.util.SparseArray<ca.dnamobile.javalauncher.controls.TouchControlButtonView> r0 = r1.controlPointerTargets
            r0.clear()
            android.util.SparseArray<ca.dnamobile.javalauncher.controls.TouchControlsOverlay$SwipeGestureState> r0 = r1.swipeGesturePointers
            r0.clear()
            r1.cancelAllMousePassThroughPointers()
            r0 = 1
            r1.cancelCameraPointer(r0)
            r1.cancelVirtualMousePointer()
            r1.clearRuntimeTouchRouting()
            return
    }

    private void cancelVirtualMousePointer() {
            r1 = this;
            r0 = -1
            r1.virtualMousePointerId = r0
            r0 = 0
            r1.virtualMouseLastY = r0
            r1.virtualMouseLastX = r0
            r1.virtualMouseDownY = r0
            r1.virtualMouseDownX = r0
            r0 = 0
            r1.virtualMouseMovedPastSlop = r0
            return
    }

    private static float clamp(float r0, float r1, float r2) {
            float r0 = java.lang.Math.min(r2, r0)
            float r0 = java.lang.Math.max(r1, r0)
            return r0
    }

    private void clearEditHistory() {
            r1 = this;
            java.util.ArrayDeque<java.lang.String> r0 = r1.undoHistory
            r0.clear()
            java.util.ArrayDeque<java.lang.String> r0 = r1.redoHistory
            r0.clear()
            return
    }

    private void clearLastHotbarTap() {
            r2 = this;
            r0 = -1
            r2.lastHotbarTapSlot = r0
            r0 = 0
            r2.lastHotbarTapTimeMs = r0
            return
    }

    private void clearRuntimeTouchRouting() {
            r3 = this;
            r0 = 1
            r3.cancelCameraPointer(r0)
            android.util.SparseArray<ca.dnamobile.javalauncher.controls.TouchControlsOverlay$SwipeGestureState> r0 = r3.swipeGesturePointers
            r0.clear()
            r3.cancelAllMousePassThroughPointers()
            r0 = 0
            r3.finishHotbarPointer(r0)
            r3.cancelVirtualMousePointer()
            r1 = -1
            r3.passthroughPointerId = r1
            r1 = 0
            r3.passthroughDownTime = r1
            r1 = 0
            r3.passthroughDownX = r1
            r3.passthroughDownY = r1
            r3.passthroughMovedPastSlop = r0
            android.util.SparseArray<ca.dnamobile.javalauncher.controls.TouchControlButtonView> r0 = r3.controlPointerTargets
            r0.clear()
            return
    }

    private boolean containsGameCursorOverlay(android.view.View r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L28
            if (r5 != r4) goto L6
            goto L28
        L6:
            boolean r1 = r5 instanceof ca.dnamobile.javalauncher.input.GameCursorOverlay
            r2 = 1
            if (r1 == 0) goto Lc
            return r2
        Lc:
            boolean r1 = r5 instanceof android.view.ViewGroup
            if (r1 != 0) goto L11
            return r0
        L11:
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r1 = r0
        L14:
            int r3 = r5.getChildCount()
            if (r1 >= r3) goto L28
            android.view.View r3 = r5.getChildAt(r1)
            boolean r3 = r4.containsGameCursorOverlay(r3)
            if (r3 == 0) goto L25
            return r2
        L25:
            int r1 = r1 + 1
            goto L14
        L28:
            return r0
    }

    private android.view.View createKeySenderKeyboardView() {
            r3 = this;
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView r0 = new ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView
            android.content.Context r1 = r3.getContext()
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$6 r2 = new ca.dnamobile.javalauncher.controls.TouchControlsOverlay$6
            r2.<init>(r3)
            r0.<init>(r1, r2)
            return r0
    }

    private static java.lang.String debugOptionsFileName(java.io.File r3) {
            if (r3 != 0) goto L5
            java.lang.String r3 = "none"
            return r3
        L5:
            java.lang.String r0 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r1.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r2 = java.io.File.separator     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r2 = "instances"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r2 = java.io.File.separator     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L5c
            int r1 = r0.lastIndexOf(r1)     // Catch: java.lang.Throwable -> L5c
            if (r1 < 0) goto L31
            int r1 = r1 + 1
            java.lang.String r3 = r0.substring(r1)     // Catch: java.lang.Throwable -> L5c
            return r3
        L31:
            java.io.File r0 = r3.getParentFile()     // Catch: java.lang.Throwable -> L5c
            if (r0 != 0) goto L3c
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L5c
            goto L5b
        L3c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r1.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r1 = java.io.File.separator     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r1 = r3.getName()     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Throwable -> L5c
        L5b:
            return r3
        L5c:
            java.lang.String r3 = r3.getName()
            return r3
    }

    private void dispatchActiveCameraPointer(android.view.MotionEvent r5) {
            r4 = this;
            int r0 = r4.cameraPointerId
            r1 = -1
            if (r0 != r1) goto L6
            return
        L6:
            int r0 = r5.findPointerIndex(r0)
            if (r0 >= 0) goto Ld
            return
        Ld:
            float r1 = r5.getX(r0)
            float r5 = r5.getY(r0)
            float r0 = r4.cameraLastX
            float r0 = r1 - r0
            float r2 = r4.cameraLastY
            float r2 = r5 - r2
            r4.cameraLastX = r1
            r4.cameraLastY = r5
            float r3 = r4.cameraDownX
            float r1 = r1 - r3
            float r3 = r4.cameraDownY
            float r5 = r5 - r3
            boolean r3 = r4.cameraMovedPastSlop
            if (r3 != 0) goto L3d
            float r1 = r1 * r1
            float r5 = r5 * r5
            float r1 = r1 + r5
            int r5 = r4.cameraTouchSlop
            int r5 = r5 * r5
            float r5 = (float) r5
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 <= 0) goto L3d
            r5 = 1
            r4.cameraMovedPastSlop = r5
            r5 = 0
            r4.cancelCameraLongPressAttack(r5)
        L3d:
            r5 = 0
            int r1 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r1 != 0) goto L47
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 != 0) goto L47
            return
        L47:
            r4.sendRelativeCameraDelta(r0, r2)
            return
    }

    private void dispatchActiveControlPointers(android.view.MotionEvent r4, int r5) {
            r3 = this;
            r0 = 0
        L1:
            android.util.SparseArray<ca.dnamobile.javalauncher.controls.TouchControlButtonView> r1 = r3.controlPointerTargets
            int r1 = r1.size()
            if (r0 >= r1) goto L25
            android.util.SparseArray<ca.dnamobile.javalauncher.controls.TouchControlButtonView> r1 = r3.controlPointerTargets
            int r1 = r1.keyAt(r0)
            int r1 = r4.findPointerIndex(r1)
            android.util.SparseArray<ca.dnamobile.javalauncher.controls.TouchControlButtonView> r2 = r3.controlPointerTargets
            java.lang.Object r2 = r2.valueAt(r0)
            ca.dnamobile.javalauncher.controls.TouchControlButtonView r2 = (ca.dnamobile.javalauncher.controls.TouchControlButtonView) r2
            if (r1 < 0) goto L22
            if (r2 == 0) goto L22
            r3.dispatchSinglePointerToControl(r4, r1, r5, r2)
        L22:
            int r0 = r0 + 1
            goto L1
        L25:
            return
    }

    private void dispatchActiveHotbarPointer(android.view.MotionEvent r3) {
            r2 = this;
            int r0 = r2.hotbarPointerId
            r1 = -1
            if (r0 != r1) goto L6
            return
        L6:
            int r0 = r3.findPointerIndex(r0)
            if (r0 >= 0) goto Ld
            return
        Ld:
            float r1 = r3.getX(r0)
            float r3 = r3.getY(r0)
            int r3 = r2.hotbarSlotForTouch(r1, r3)
            if (r3 < 0) goto L2a
            int r0 = r2.hotbarLastSlot
            if (r3 != r0) goto L20
            goto L2a
        L20:
            r2.hotbarLastSlot = r3
            r0 = 0
            r2.hotbarDoubleTapConsumed = r0
            int r3 = r3 + 49
            r2.sendKeyTap(r3)
        L2a:
            return
    }

    private void dispatchActiveMousePassThroughPointers(android.view.MotionEvent r4) {
            r3 = this;
            android.util.SparseArray<ca.dnamobile.javalauncher.controls.TouchControlsOverlay$MousePassThroughState> r0 = r3.mousePassThroughPointers
            int r0 = r0.size()
            if (r0 > 0) goto L9
            return
        L9:
            boolean r0 = r3.updateMouseGrabState()
            if (r0 != 0) goto L13
            r3.cancelAllMousePassThroughPointers()
            return
        L13:
            r0 = 0
        L14:
            android.util.SparseArray<ca.dnamobile.javalauncher.controls.TouchControlsOverlay$MousePassThroughState> r1 = r3.mousePassThroughPointers
            int r1 = r1.size()
            if (r0 >= r1) goto L37
            android.util.SparseArray<ca.dnamobile.javalauncher.controls.TouchControlsOverlay$MousePassThroughState> r1 = r3.mousePassThroughPointers
            int r1 = r1.keyAt(r0)
            int r1 = r4.findPointerIndex(r1)
            if (r1 >= 0) goto L29
            goto L34
        L29:
            android.util.SparseArray<ca.dnamobile.javalauncher.controls.TouchControlsOverlay$MousePassThroughState> r2 = r3.mousePassThroughPointers
            java.lang.Object r2 = r2.valueAt(r0)
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$MousePassThroughState r2 = (ca.dnamobile.javalauncher.controls.TouchControlsOverlay.MousePassThroughState) r2
            r3.dispatchMousePassThroughPointerMove(r4, r1, r2)
        L34:
            int r0 = r0 + 1
            goto L14
        L37:
            return
    }

    private boolean dispatchActivePassthroughPointer(android.view.MotionEvent r4, int r5) {
            r3 = this;
            int r0 = r3.passthroughPointerId
            r1 = -1
            r2 = 0
            if (r0 != r1) goto L7
            return r2
        L7:
            int r0 = r4.findPointerIndex(r0)
            if (r0 >= 0) goto Le
            return r2
        Le:
            r1 = 2
            if (r5 != r1) goto L14
            r3.updatePassthroughMoveState(r4, r0)
        L14:
            boolean r4 = r3.dispatchSinglePointerToPassthrough(r4, r0, r5)
            return r4
    }

    private void dispatchActiveSwipeGesturePointers(android.view.MotionEvent r4) {
            r3 = this;
            android.util.SparseArray<ca.dnamobile.javalauncher.controls.TouchControlsOverlay$SwipeGestureState> r0 = r3.swipeGesturePointers
            int r0 = r0.size()
            if (r0 > 0) goto L9
            return
        L9:
            boolean r0 = r3.updateMouseGrabState()
            if (r0 != 0) goto L13
            r3.cancelAllSwipeGesturePointers(r4)
            return
        L13:
            r0 = 0
        L14:
            android.util.SparseArray<ca.dnamobile.javalauncher.controls.TouchControlsOverlay$SwipeGestureState> r1 = r3.swipeGesturePointers
            int r1 = r1.size()
            if (r0 >= r1) goto L37
            android.util.SparseArray<ca.dnamobile.javalauncher.controls.TouchControlsOverlay$SwipeGestureState> r1 = r3.swipeGesturePointers
            int r1 = r1.keyAt(r0)
            int r1 = r4.findPointerIndex(r1)
            if (r1 >= 0) goto L29
            goto L34
        L29:
            android.util.SparseArray<ca.dnamobile.javalauncher.controls.TouchControlsOverlay$SwipeGestureState> r2 = r3.swipeGesturePointers
            java.lang.Object r2 = r2.valueAt(r0)
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$SwipeGestureState r2 = (ca.dnamobile.javalauncher.controls.TouchControlsOverlay.SwipeGestureState) r2
            r3.dispatchSwipeGesturePointerMove(r4, r1, r2)
        L34:
            int r0 = r0 + 1
            goto L14
        L37:
            return
    }

    private void dispatchActiveVirtualMousePointer(android.view.MotionEvent r5) {
            r4 = this;
            int r0 = r4.virtualMousePointerId
            r1 = -1
            if (r0 != r1) goto L6
            return
        L6:
            boolean r0 = r4.updateMouseGrabState()
            if (r0 == 0) goto L10
            r4.cancelVirtualMousePointer()
            return
        L10:
            int r0 = r4.virtualMousePointerId
            int r0 = r5.findPointerIndex(r0)
            if (r0 >= 0) goto L19
            return
        L19:
            float r1 = r5.getX(r0)
            float r5 = r5.getY(r0)
            float r0 = r4.virtualMouseLastX
            float r0 = r1 - r0
            float r2 = r4.virtualMouseLastY
            float r2 = r5 - r2
            r4.virtualMouseLastX = r1
            r4.virtualMouseLastY = r5
            float r3 = r4.virtualMouseDownX
            float r1 = r1 - r3
            float r3 = r4.virtualMouseDownY
            float r5 = r5 - r3
            boolean r3 = r4.virtualMouseMovedPastSlop
            if (r3 != 0) goto L45
            float r1 = r1 * r1
            float r5 = r5 * r5
            float r1 = r1 + r5
            int r5 = r4.cameraTouchSlop
            int r5 = r5 * r5
            float r5 = (float) r5
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 <= 0) goto L45
            r5 = 1
            r4.virtualMouseMovedPastSlop = r5
        L45:
            r5 = 0
            int r1 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r1 != 0) goto L52
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 != 0) goto L52
            r4.postInvalidateOnAnimation()
            return
        L52:
            r4.sendVirtualMouseDelta(r0, r2)
            return
    }

    private void dispatchCancelToControlPointers(android.view.MotionEvent r5) {
            r4 = this;
            r0 = 0
        L1:
            android.util.SparseArray<ca.dnamobile.javalauncher.controls.TouchControlButtonView> r1 = r4.controlPointerTargets
            int r1 = r1.size()
            if (r0 >= r1) goto L26
            android.util.SparseArray<ca.dnamobile.javalauncher.controls.TouchControlButtonView> r1 = r4.controlPointerTargets
            int r1 = r1.keyAt(r0)
            int r1 = r5.findPointerIndex(r1)
            android.util.SparseArray<ca.dnamobile.javalauncher.controls.TouchControlButtonView> r2 = r4.controlPointerTargets
            java.lang.Object r2 = r2.valueAt(r0)
            ca.dnamobile.javalauncher.controls.TouchControlButtonView r2 = (ca.dnamobile.javalauncher.controls.TouchControlButtonView) r2
            if (r1 < 0) goto L23
            if (r2 == 0) goto L23
            r3 = 3
            r4.dispatchSinglePointerToControl(r5, r1, r3, r2)
        L23:
            int r0 = r0 + 1
            goto L1
        L26:
            return
    }

    private boolean dispatchKeySenderKeyboardTouch(android.view.MotionEvent r3) {
            r2 = this;
            boolean r0 = r2.keySenderKeyboardVisible
            if (r0 == 0) goto L1d
            android.view.View r0 = r2.keySenderKeyboardView
            if (r0 == 0) goto L1d
            int r0 = r0.getVisibility()
            if (r0 == 0) goto Lf
            goto L1d
        Lf:
            super.dispatchTouchEvent(r3)     // Catch: java.lang.Throwable -> L13
            goto L1b
        L13:
            r3 = move-exception
            java.lang.String r0 = "TouchControlsOverlay"
            java.lang.String r1 = "Unable to dispatch key sender keyboard touch"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r1, r3)
        L1b:
            r3 = 1
            return r3
        L1d:
            r3 = 0
            return r3
    }

    private void dispatchMousePassThroughPointerMove(android.view.MotionEvent r4, int r5, ca.dnamobile.javalauncher.controls.TouchControlsOverlay.MousePassThroughState r6) {
            r3 = this;
            if (r5 < 0) goto L46
            int r0 = r4.getPointerCount()
            if (r5 < r0) goto L9
            goto L46
        L9:
            float r0 = r4.getX(r5)
            float r4 = r4.getY(r5)
            float r5 = r6.lastX
            float r5 = r0 - r5
            float r1 = r6.lastY
            float r1 = r4 - r1
            r6.lastX = r0
            r6.lastY = r4
            float r2 = r6.downX
            float r0 = r0 - r2
            float r2 = r6.downY
            float r4 = r4 - r2
            boolean r2 = r6.movedPastSlop
            if (r2 != 0) goto L35
            float r0 = r0 * r0
            float r4 = r4 * r4
            float r0 = r0 + r4
            int r4 = r3.cameraTouchSlop
            int r4 = r4 * r4
            float r4 = (float) r4
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 <= 0) goto L35
            r4 = 1
            r6.movedPastSlop = r4
        L35:
            boolean r4 = r6.movedPastSlop
            if (r4 == 0) goto L46
            r4 = 0
            int r6 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r6 != 0) goto L43
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L43
            goto L46
        L43:
            r3.sendRelativeCameraDelta(r5, r1)
        L46:
            return
    }

    private void dispatchSinglePointerToControl(android.view.MotionEvent r11, int r12, int r13, ca.dnamobile.javalauncher.controls.TouchControlButtonView r14) {
            r10 = this;
            if (r12 < 0) goto L3a
            int r0 = r11.getPointerCount()
            if (r12 < r0) goto L9
            goto L3a
        L9:
            float r0 = r11.getX(r12)
            float r1 = r14.getX()
            float r7 = r0 - r1
            float r12 = r11.getY(r12)
            float r0 = r14.getY()
            float r8 = r12 - r0
            long r2 = r11.getDownTime()
            long r4 = r11.getEventTime()
            int r9 = r11.getMetaState()
            r6 = r13
            android.view.MotionEvent r11 = android.view.MotionEvent.obtain(r2, r4, r6, r7, r8, r9)
            r14.dispatchTouchEvent(r11)     // Catch: java.lang.Throwable -> L35
            r11.recycle()
            return
        L35:
            r12 = move-exception
            r11.recycle()
            throw r12
        L3a:
            return
    }

    private boolean dispatchSinglePointerToPassthrough(android.view.MotionEvent r13, int r14, int r15) {
            r12 = this;
            r0 = 0
            if (r14 < 0) goto L6e
            int r1 = r13.getPointerCount()
            if (r14 < r1) goto La
            goto L6e
        La:
            net.kdt.pojavlaunch.MinecraftGLSurface r1 = r12.findMinecraftSurfaceTarget()
            if (r1 != 0) goto L15
            android.view.View r2 = r12.passthroughTarget
            if (r2 != 0) goto L15
            return r0
        L15:
            long r2 = r12.passthroughDownTime
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L1e
            goto L22
        L1e:
            long r2 = r13.getDownTime()
        L22:
            r4 = r2
            long r6 = r13.getEventTime()
            float r9 = r13.getX(r14)
            float r10 = r13.getY(r14)
            int r11 = r13.getMetaState()
            r8 = r15
            android.view.MotionEvent r14 = android.view.MotionEvent.obtain(r4, r6, r8, r9, r10, r11)
            int r13 = r13.getSource()
            if (r13 == 0) goto L3f
            goto L41
        L3f:
            r13 = 4098(0x1002, float:5.743E-42)
        L41:
            r14.setSource(r13)
            if (r1 == 0) goto L4e
            boolean r13 = r1.handleTouchFromOverlay(r14)     // Catch: java.lang.Throwable -> L5d
            r14.recycle()
            return r13
        L4e:
            android.view.View r13 = r12.passthroughTarget     // Catch: java.lang.Throwable -> L5d
            if (r13 == 0) goto L59
            boolean r13 = r13.dispatchTouchEvent(r14)     // Catch: java.lang.Throwable -> L5d
            if (r13 == 0) goto L59
            r0 = 1
        L59:
            r14.recycle()
            return r0
        L5d:
            r13 = move-exception
            java.lang.String r15 = "TouchControlsOverlay"
            java.lang.String r1 = "Unable to dispatch passthrough touch event"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r15, r1, r13)     // Catch: java.lang.Throwable -> L69
            r14.recycle()
            return r0
        L69:
            r13 = move-exception
            r14.recycle()
            throw r13
        L6e:
            return r0
    }

    private void dispatchSwipeGesturePointerMove(android.view.MotionEvent r4, int r5, ca.dnamobile.javalauncher.controls.TouchControlsOverlay.SwipeGestureState r6) {
            r3 = this;
            if (r5 < 0) goto L2d
            int r0 = r4.getPointerCount()
            if (r5 < r0) goto L9
            goto L2d
        L9:
            float r0 = r4.getX(r5)
            float r1 = r4.getY(r5)
            ca.dnamobile.javalauncher.controls.TouchControlButtonView r2 = r6.primaryControl
            ca.dnamobile.javalauncher.controls.TouchControlButtonView r0 = r3.findSwipeGestureTargetUnder(r0, r1, r2)
            ca.dnamobile.javalauncher.controls.TouchControlButtonView r1 = r6.activeSwipeControl
            if (r0 != r1) goto L22
            if (r0 == 0) goto L21
            r6 = 2
            r3.dispatchSinglePointerToControl(r4, r5, r6, r0)
        L21:
            return
        L22:
            r3.releaseActiveSwipeGestureControl(r4, r5, r6)
            if (r0 == 0) goto L2d
            r6.activeSwipeControl = r0
            r6 = 0
            r3.dispatchSinglePointerToControl(r4, r5, r6, r0)
        L2d:
            return
    }

    private boolean dispatchWholeGenericEventToPassthrough(android.view.MotionEvent r5) {
            r4 = this;
            net.kdt.pojavlaunch.MinecraftGLSurface r0 = r4.findMinecraftSurfaceTarget()
            r1 = 0
            if (r0 != 0) goto Lc
            android.view.View r2 = r4.passthroughTarget
            if (r2 != 0) goto Lc
            return r1
        Lc:
            android.view.MotionEvent r5 = android.view.MotionEvent.obtain(r5)
            if (r0 == 0) goto L17
            boolean r1 = r0.dispatchGenericMotionEvent(r5)     // Catch: java.lang.Throwable -> L26
            goto L22
        L17:
            android.view.View r0 = r4.passthroughTarget     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L22
            boolean r0 = r0.dispatchGenericMotionEvent(r5)     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L22
            r1 = 1
        L22:
            r5.recycle()
            return r1
        L26:
            r0 = move-exception
            java.lang.String r2 = "TouchControlsOverlay"
            java.lang.String r3 = "Unable to dispatch hardware pointer passthrough event"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r2, r3, r0)     // Catch: java.lang.Throwable -> L32
            r5.recycle()
            return r1
        L32:
            r0 = move-exception
            r5.recycle()
            throw r0
    }

    private boolean dispatchWholeTouchEventToPassthrough(android.view.MotionEvent r5) {
            r4 = this;
            net.kdt.pojavlaunch.MinecraftGLSurface r0 = r4.findMinecraftSurfaceTarget()
            r1 = 0
            if (r0 != 0) goto Lc
            android.view.View r2 = r4.passthroughTarget
            if (r2 != 0) goto Lc
            return r1
        Lc:
            android.view.MotionEvent r5 = android.view.MotionEvent.obtain(r5)
            int r2 = r5.getSource()     // Catch: java.lang.Throwable -> L31
            if (r2 != 0) goto L1b
            r2 = 4098(0x1002, float:5.743E-42)
            r5.setSource(r2)     // Catch: java.lang.Throwable -> L31
        L1b:
            if (r0 == 0) goto L22
            boolean r1 = r0.handleTouchFromOverlay(r5)     // Catch: java.lang.Throwable -> L31
            goto L2d
        L22:
            android.view.View r0 = r4.passthroughTarget     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L2d
            boolean r0 = r0.dispatchTouchEvent(r5)     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L2d
            r1 = 1
        L2d:
            r5.recycle()
            return r1
        L31:
            r0 = move-exception
            java.lang.String r2 = "TouchControlsOverlay"
            java.lang.String r3 = "Unable to dispatch whole passthrough touch event"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r2, r3, r0)     // Catch: java.lang.Throwable -> L3d
            r5.recycle()
            return r1
        L3d:
            r0 = move-exception
            r5.recycle()
            throw r0
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

    private void drawHotbarHitboxDebug(android.graphics.Canvas r15) {
            r14 = this;
            android.content.Context r0 = r14.getContext()
            boolean r0 = ca.dnamobile.javalauncher.controls.ControlsPreferences.isHotbarHitboxDebugEnabled(r0)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.io.File r0 = r14.resolveMinecraftOptionsFile()
            android.content.Context r1 = r14.getContext()
            int r2 = r14.getWidth()
            float r3 = (float) r2
            int r2 = r14.getHeight()
            float r4 = (float) r2
            float r5 = r14.resolveGameBufferWidth()
            float r6 = r14.resolveGameBufferHeight()
            r2 = r0
            ca.dnamobile.javalauncher.controls.TouchHotbarHitbox$Result r1 = ca.dnamobile.javalauncher.controls.TouchHotbarHitbox.calculate(r1, r2, r3, r4, r5, r6)
            android.graphics.RectF r2 = r1.touchBounds
            android.graphics.RectF r3 = r1.hotbarBounds
            android.graphics.Paint r4 = r14.hotbarDebugFillPaint
            r15.drawRect(r2, r4)
            android.graphics.Paint r4 = r14.hotbarDebugStrokePaint
            r15.drawRect(r2, r4)
            r4 = 0
            r5 = r4
        L3a:
            r6 = 9
            if (r5 > r6) goto L54
            float r6 = r3.left
            float r7 = (float) r5
            float r8 = r1.slotWidth
            float r7 = r7 * r8
            float r11 = r6 + r7
            float r10 = r2.top
            float r12 = r2.bottom
            android.graphics.Paint r13 = r14.hotbarDebugSlotPaint
            r8 = r15
            r9 = r11
            r8.drawLine(r9, r10, r11, r12, r13)
            int r5 = r5 + 1
            goto L3a
        L54:
            float r5 = r2.top
            android.content.res.Resources r7 = r14.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            r8 = 1086324736(0x40c00000, float:6.0)
            float r7 = r7 * r8
            float r5 = r5 - r7
            android.graphics.Paint r7 = r14.hotbarDebugTextPaint
            float r7 = r7.getTextSize()
            r9 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 + r9
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 >= 0) goto L7d
            float r5 = r2.bottom
            android.graphics.Paint r7 = r14.hotbarDebugTextPaint
            float r7 = r7.getTextSize()
            float r5 = r5 + r7
            r7 = 1082130432(0x40800000, float:4.0)
            float r5 = r5 + r7
        L7d:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r10 = "Hotbar hitbox  scale="
            r7.<init>(r10)
            float r10 = r1.scale
            java.lang.String r10 = formatScale(r10)
            java.lang.StringBuilder r7 = r7.append(r10)
            java.lang.String r10 = "  src="
            java.lang.StringBuilder r7 = r7.append(r10)
            java.lang.String r10 = r1.scaleSourceLabel()
            java.lang.StringBuilder r7 = r7.append(r10)
            java.lang.String r10 = "  mcGui="
            java.lang.StringBuilder r7 = r7.append(r10)
            int r10 = r1.minecraftGuiScale
            java.lang.StringBuilder r7 = r7.append(r10)
            java.lang.String r10 = "  override="
            java.lang.StringBuilder r7 = r7.append(r10)
            int r10 = r1.overrideScale
            java.lang.StringBuilder r7 = r7.append(r10)
            java.lang.String r7 = r7.toString()
            float r10 = r3.centerX()
            android.graphics.Paint r11 = r14.hotbarDebugTextPaint
            r15.drawText(r7, r10, r5, r11)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r10 = "render="
            r7.<init>(r10)
            float r10 = r1.renderScaleX
            java.lang.String r10 = formatScale(r10)
            java.lang.StringBuilder r7 = r7.append(r10)
            java.lang.String r10 = "x/"
            java.lang.StringBuilder r7 = r7.append(r10)
            float r10 = r1.renderScaleY
            java.lang.String r10 = formatScale(r10)
            java.lang.StringBuilder r7 = r7.append(r10)
            java.lang.String r10 = "  res="
            java.lang.StringBuilder r7 = r7.append(r10)
            int r10 = r1.resolutionScalePercent
            java.lang.StringBuilder r7 = r7.append(r10)
            java.lang.String r10 = "%  buffer="
            java.lang.StringBuilder r7 = r7.append(r10)
            float r10 = r1.gameBufferWidth
            int r10 = java.lang.Math.round(r10)
            java.lang.StringBuilder r7 = r7.append(r10)
            java.lang.String r10 = "x"
            java.lang.StringBuilder r7 = r7.append(r10)
            float r10 = r1.gameBufferHeight
            int r10 = java.lang.Math.round(r10)
            java.lang.StringBuilder r7 = r7.append(r10)
            java.lang.String r7 = r7.toString()
            float r10 = r3.centerX()
            android.graphics.Paint r11 = r14.hotbarDebugTextPaint
            float r11 = r11.getTextSize()
            float r11 = r11 + r5
            android.content.res.Resources r12 = r14.getResources()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            r13 = 1077936128(0x40400000, float:3.0)
            float r12 = r12 * r13
            float r11 = r11 + r12
            android.graphics.Paint r12 = r14.hotbarDebugTextPaint
            r15.drawText(r7, r10, r11, r12)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r10 = "options="
            r7.<init>(r10)
            java.lang.String r0 = debugOptionsFileName(r0)
            java.lang.StringBuilder r0 = r7.append(r0)
            java.lang.String r0 = r0.toString()
            float r7 = r3.centerX()
            android.graphics.Paint r10 = r14.hotbarDebugTextPaint
            float r10 = r10.getTextSize()
            float r10 = r10 * r9
            float r5 = r5 + r10
            android.content.res.Resources r10 = r14.getResources()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = r10.density
            float r10 = r10 * r8
            float r5 = r5 + r10
            android.graphics.Paint r8 = r14.hotbarDebugTextPaint
            r15.drawText(r0, r7, r5, r8)
        L160:
            if (r4 >= r6) goto L185
            float r0 = r3.left
            float r5 = (float) r4
            float r7 = r1.slotWidth
            float r5 = r5 * r7
            float r0 = r0 + r5
            float r5 = r1.slotWidth
            float r5 = r5 / r9
            float r0 = r0 + r5
            int r4 = r4 + 1
            java.lang.String r5 = java.lang.String.valueOf(r4)
            float r7 = r2.centerY()
            android.graphics.Paint r8 = r14.hotbarDebugTextPaint
            float r8 = r8.getTextSize()
            float r8 = r8 / r13
            float r7 = r7 + r8
            android.graphics.Paint r8 = r14.hotbarDebugTextPaint
            r15.drawText(r5, r0, r7, r8)
            goto L160
        L185:
            r14.postInvalidateOnAnimation()
            return
    }

    private void drawVirtualCursorCrosshair(android.graphics.Canvas r7, float r8, float r9, float r10, float r11, float r12, android.graphics.Paint r13) {
            r6 = this;
            float r1 = r8 - r10
            float r3 = r8 - r11
            r0 = r7
            r2 = r9
            r4 = r9
            r5 = r13
            r0.drawLine(r1, r2, r3, r4, r5)
            float r1 = r8 + r11
            float r3 = r8 + r10
            r0.drawLine(r1, r2, r3, r4, r5)
            float r2 = r9 - r10
            float r4 = r9 - r11
            r1 = r8
            r3 = r8
            r0.drawLine(r1, r2, r3, r4, r5)
            float r2 = r9 + r11
            float r4 = r9 + r10
            r0.drawLine(r1, r2, r3, r4, r5)
            r7.drawCircle(r8, r9, r12, r13)
            return
    }

    private void drawVirtualMouseCursor(android.graphics.Canvas r15) {
            r14 = this;
            boolean r0 = r14.hasGameCursorOverlayInViewTree()
            if (r0 == 0) goto Le
            boolean r15 = r14.shouldUseLauncherVirtualCursorNoPolicy()
            r14.applyAndroidPointerIconPolicy(r15)
            return
        Le:
            boolean r0 = r14.shouldDrawLauncherVirtualCursor()
            if (r0 != 0) goto L15
            return
        L15:
            r0 = 0
            r14.reloadVirtualCursorBitmapIfNeeded(r0)
            r14.ensureVirtualMouseCursorInBounds()
            float r0 = r14.virtualCursorBridgeX
            float r0 = r14.bridgeCursorToViewX(r0)
            float r1 = r14.virtualCursorBridgeY
            float r1 = r14.bridgeCursorToViewY(r1)
            boolean r2 = java.lang.Float.isNaN(r0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r2 != 0) goto L36
            boolean r2 = java.lang.Float.isInfinite(r0)
            if (r2 == 0) goto L3c
        L36:
            int r0 = r14.getWidth()
            float r0 = (float) r0
            float r0 = r0 / r3
        L3c:
            boolean r2 = java.lang.Float.isNaN(r1)
            if (r2 != 0) goto L48
            boolean r2 = java.lang.Float.isInfinite(r1)
            if (r2 == 0) goto L4e
        L48:
            int r1 = r14.getHeight()
            float r1 = (float) r1
            float r1 = r1 / r3
        L4e:
            int r2 = r14.getWidth()
            float r2 = (float) r2
            r4 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r4
            r5 = 0
            float r2 = java.lang.Math.max(r5, r2)
            float r0 = clamp(r0, r5, r2)
            int r2 = r14.getHeight()
            float r2 = (float) r2
            float r2 = r2 - r4
            float r2 = java.lang.Math.max(r5, r2)
            float r1 = clamp(r1, r5, r2)
            android.graphics.Bitmap r2 = r14.virtualCursorBitmap
            if (r2 == 0) goto La2
            boolean r4 = r2.isRecycled()
            if (r4 != 0) goto La2
            android.content.res.Resources r4 = r14.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            r5 = 1104150528(0x41d00000, float:26.0)
            float r4 = r4 * r5
            android.content.Context r5 = r14.getContext()
            int r5 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getMouseCursorSizePercent(r5)
            float r5 = (float) r5
            float r4 = r4 * r5
            r5 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 / r5
            android.graphics.RectF r5 = new android.graphics.RectF
            float r4 = r4 / r3
            float r3 = r0 - r4
            float r6 = r1 - r4
            float r0 = r0 + r4
            float r1 = r1 + r4
            r5.<init>(r3, r6, r0, r1)
            r0 = 0
            r15.drawBitmap(r2, r0, r5, r0)
            return
        La2:
            android.content.res.Resources r2 = r14.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r3 = 1095761920(0x41500000, float:13.0)
            float r3 = r3 * r2
            r4 = 1082130432(0x40800000, float:4.0)
            float r4 = r4 * r2
            r5 = 1089470464(0x40f00000, float:7.5)
            float r2 = r2 * r5
            android.graphics.Paint r13 = r14.virtualCursorStrokePaint
            r6 = r14
            r7 = r15
            r8 = r0
            r9 = r1
            r10 = r3
            r11 = r4
            r12 = r2
            r6.drawVirtualCursorCrosshair(r7, r8, r9, r10, r11, r12, r13)
            android.graphics.Paint r13 = r14.virtualCursorFillPaint
            r6.drawVirtualCursorCrosshair(r7, r8, r9, r10, r11, r12, r13)
            return
    }

    private void ensureVirtualMouseCursorInBounds() {
            r4 = this;
            int r0 = org.lwjgl.glfw.CallbackBridge.windowWidth     // Catch: java.lang.Throwable -> L4a
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L4a
            float r0 = maxCursorCoordinate(r0)     // Catch: java.lang.Throwable -> L4a
            int r1 = org.lwjgl.glfw.CallbackBridge.windowHeight     // Catch: java.lang.Throwable -> L4a
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L4a
            float r1 = maxCursorCoordinate(r1)     // Catch: java.lang.Throwable -> L4a
            boolean r2 = r4.virtualCursorInitialized     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L45
            float r2 = r4.virtualCursorBridgeX     // Catch: java.lang.Throwable -> L4a
            boolean r2 = java.lang.Float.isNaN(r2)     // Catch: java.lang.Throwable -> L4a
            if (r2 != 0) goto L45
            float r2 = r4.virtualCursorBridgeX     // Catch: java.lang.Throwable -> L4a
            boolean r2 = java.lang.Float.isInfinite(r2)     // Catch: java.lang.Throwable -> L4a
            if (r2 != 0) goto L45
            float r2 = r4.virtualCursorBridgeY     // Catch: java.lang.Throwable -> L4a
            boolean r2 = java.lang.Float.isNaN(r2)     // Catch: java.lang.Throwable -> L4a
            if (r2 != 0) goto L45
            float r2 = r4.virtualCursorBridgeY     // Catch: java.lang.Throwable -> L4a
            boolean r2 = java.lang.Float.isInfinite(r2)     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L33
            goto L45
        L33:
            float r2 = r4.virtualCursorBridgeX     // Catch: java.lang.Throwable -> L4a
            r3 = 0
            float r0 = clamp(r2, r3, r0)     // Catch: java.lang.Throwable -> L4a
            r4.virtualCursorBridgeX = r0     // Catch: java.lang.Throwable -> L4a
            float r0 = r4.virtualCursorBridgeY     // Catch: java.lang.Throwable -> L4a
            float r0 = clamp(r0, r3, r1)     // Catch: java.lang.Throwable -> L4a
            r4.virtualCursorBridgeY = r0     // Catch: java.lang.Throwable -> L4a
            goto L52
        L45:
            r0 = 0
            r4.resetVirtualMouseCursorToCenter(r0)     // Catch: java.lang.Throwable -> L4a
            return
        L4a:
            r0 = move-exception
            java.lang.String r1 = "TouchControlsOverlay"
            java.lang.String r2 = "Unable to prepare virtual mouse cursor"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r2, r0)
        L52:
            return
    }

    private java.io.File findBestMinecraftOptionsFile() {
            r8 = this;
            java.lang.String r0 = "instances"
            java.lang.String r1 = "game"
            r2 = 0
            java.lang.String r3 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME     // Catch: java.lang.Throwable -> L70
            if (r3 == 0) goto L70
            java.lang.String r4 = r3.trim()     // Catch: java.lang.Throwable -> L70
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L70
            if (r4 == 0) goto L14
            goto L70
        L14:
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L70
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L70
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L70
            r3.<init>()     // Catch: java.lang.Throwable -> L70
            addOptionsCandidate(r3, r4)     // Catch: java.lang.Throwable -> L70
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L70
            r5.<init>(r4, r1)     // Catch: java.lang.Throwable -> L70
            addOptionsCandidate(r3, r5)     // Catch: java.lang.Throwable -> L70
            java.io.File r5 = r4.getParentFile()     // Catch: java.lang.Throwable -> L70
            if (r5 == 0) goto L3a
            addOptionsCandidate(r3, r5)     // Catch: java.lang.Throwable -> L70
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L70
            r6.<init>(r5, r1)     // Catch: java.lang.Throwable -> L70
            addOptionsCandidate(r3, r6)     // Catch: java.lang.Throwable -> L70
        L3a:
            if (r5 != 0) goto L3e
            r6 = r2
            goto L42
        L3e:
            java.io.File r6 = r5.getParentFile()     // Catch: java.lang.Throwable -> L70
        L42:
            if (r6 == 0) goto L4f
            addOptionsCandidate(r3, r6)     // Catch: java.lang.Throwable -> L70
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L70
            r7.<init>(r6, r1)     // Catch: java.lang.Throwable -> L70
            addOptionsCandidate(r3, r7)     // Catch: java.lang.Throwable -> L70
        L4f:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L70
            r1.<init>(r4, r0)     // Catch: java.lang.Throwable -> L70
            scanInstancesDirectory(r3, r1)     // Catch: java.lang.Throwable -> L70
            if (r5 == 0) goto L61
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L70
            r1.<init>(r5, r0)     // Catch: java.lang.Throwable -> L70
            scanInstancesDirectory(r3, r1)     // Catch: java.lang.Throwable -> L70
        L61:
            if (r6 == 0) goto L6b
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L70
            r1.<init>(r6, r0)     // Catch: java.lang.Throwable -> L70
            scanInstancesDirectory(r3, r1)     // Catch: java.lang.Throwable -> L70
        L6b:
            java.io.File r0 = newestReadableOptionsFile(r3)     // Catch: java.lang.Throwable -> L70
            return r0
        L70:
            return r2
    }

    private ca.dnamobile.javalauncher.controls.TouchControlButtonView findControlUnder(float r5, float r6) {
            r4 = this;
            int r0 = r4.getChildCount()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L4a
            android.view.View r1 = r4.getChildAt(r0)
            boolean r2 = r1 instanceof ca.dnamobile.javalauncher.controls.TouchControlButtonView
            if (r2 != 0) goto L11
            goto L47
        L11:
            int r2 = r1.getVisibility()
            if (r2 == 0) goto L18
            goto L47
        L18:
            float r2 = r1.getX()
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 < 0) goto L47
            float r2 = r1.getX()
            int r3 = r1.getWidth()
            float r3 = (float) r3
            float r2 = r2 + r3
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 > 0) goto L47
            float r2 = r1.getY()
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 < 0) goto L47
            float r2 = r1.getY()
            int r3 = r1.getHeight()
            float r3 = (float) r3
            float r2 = r2 + r3
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 > 0) goto L47
            ca.dnamobile.javalauncher.controls.TouchControlButtonView r1 = (ca.dnamobile.javalauncher.controls.TouchControlButtonView) r1
            return r1
        L47:
            int r0 = r0 + (-1)
            goto L6
        L4a:
            r5 = 0
            return r5
    }

    private net.kdt.pojavlaunch.MinecraftGLSurface findMinecraftSurfaceInTree(android.view.View r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L29
            if (r4 != r3) goto L6
            goto L29
        L6:
            boolean r1 = r4 instanceof net.kdt.pojavlaunch.MinecraftGLSurface
            if (r1 == 0) goto Ld
            net.kdt.pojavlaunch.MinecraftGLSurface r4 = (net.kdt.pojavlaunch.MinecraftGLSurface) r4
            return r4
        Ld:
            boolean r1 = r4 instanceof android.view.ViewGroup
            if (r1 != 0) goto L12
            return r0
        L12:
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r1 = 0
        L15:
            int r2 = r4.getChildCount()
            if (r1 >= r2) goto L29
            android.view.View r2 = r4.getChildAt(r1)
            net.kdt.pojavlaunch.MinecraftGLSurface r2 = r3.findMinecraftSurfaceInTree(r2)
            if (r2 == 0) goto L26
            return r2
        L26:
            int r1 = r1 + 1
            goto L15
        L29:
            return r0
    }

    private net.kdt.pojavlaunch.MinecraftGLSurface findMinecraftSurfaceTarget() {
            r3 = this;
            android.view.View r0 = r3.passthroughTarget
        L2:
            r1 = 0
            if (r0 == 0) goto L19
            boolean r2 = r0 instanceof net.kdt.pojavlaunch.MinecraftGLSurface
            if (r2 == 0) goto Lc
            net.kdt.pojavlaunch.MinecraftGLSurface r0 = (net.kdt.pojavlaunch.MinecraftGLSurface) r0
            return r0
        Lc:
            android.view.ViewParent r0 = r0.getParent()
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L17
            android.view.View r0 = (android.view.View) r0
            goto L2
        L17:
            r0 = r1
            goto L2
        L19:
            android.view.View r0 = r3.getRootView()
            net.kdt.pojavlaunch.MinecraftGLSurface r0 = r3.findMinecraftSurfaceInTree(r0)
            if (r0 == 0) goto L24
            return r0
        L24:
            android.view.ViewParent r0 = r3.getParent()
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L32
            android.view.View r0 = (android.view.View) r0
            net.kdt.pojavlaunch.MinecraftGLSurface r1 = r3.findMinecraftSurfaceInTree(r0)
        L32:
            return r1
    }

    private ca.dnamobile.javalauncher.controls.TouchControlButtonView findSwipeGestureTargetUnder(float r6, float r7, ca.dnamobile.javalauncher.controls.TouchControlButtonView r8) {
            r5 = this;
            int r0 = r5.getChildCount()
            int r0 = r0 + (-1)
        L6:
            r1 = 0
            if (r0 < 0) goto L59
            android.view.View r2 = r5.getChildAt(r0)
            boolean r3 = r2 instanceof ca.dnamobile.javalauncher.controls.TouchControlButtonView
            if (r3 != 0) goto L12
            goto L56
        L12:
            if (r2 != r8) goto L15
            goto L56
        L15:
            int r3 = r2.getVisibility()
            if (r3 == 0) goto L1c
            goto L56
        L1c:
            float r3 = r2.getX()
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 < 0) goto L56
            float r3 = r2.getX()
            int r4 = r2.getWidth()
            float r4 = (float) r4
            float r3 = r3 + r4
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 > 0) goto L56
            float r3 = r2.getY()
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 < 0) goto L56
            float r3 = r2.getY()
            int r4 = r2.getHeight()
            float r4 = (float) r4
            float r3 = r3 + r4
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 > 0) goto L56
            ca.dnamobile.javalauncher.controls.TouchControlButtonView r2 = (ca.dnamobile.javalauncher.controls.TouchControlButtonView) r2
            ca.dnamobile.javalauncher.controls.TouchControlData r6 = r2.getData()
            boolean r6 = r5.shouldUseSwipeGesture(r6)
            if (r6 == 0) goto L55
            r1 = r2
        L55:
            return r1
        L56:
            int r0 = r0 + (-1)
            goto L6
        L59:
            return r1
    }

    private void finishCameraPointer(android.view.MotionEvent r2, int r3, boolean r4) {
            r1 = this;
            if (r3 < 0) goto Ld
            int r0 = r2.getPointerCount()
            if (r3 >= r0) goto Ld
            if (r4 != 0) goto Ld
            r1.dispatchActiveCameraPointer(r2)
        Ld:
            r1.cancelCameraLongPressAttack(r4)
            r2 = 0
            if (r4 != 0) goto L1b
            boolean r3 = r1.cameraLongPressAttackActive
            if (r3 == 0) goto L1b
            r1.sendLeftMouse(r2)
            goto L32
        L1b:
            if (r4 != 0) goto L32
            boolean r3 = r1.cameraMovedPastSlop
            if (r3 != 0) goto L32
            android.content.Context r3 = r1.getContext()
            boolean r3 = ca.dnamobile.javalauncher.controls.ControlsPreferences.isMinecraftTouchGesturesEnabled(r3)
            if (r3 == 0) goto L32
            r3 = 1
            r1.sendRightMouse(r3)
            r1.sendRightMouse(r2)
        L32:
            r1.cameraLongPressAttackActive = r2
            r3 = -1
            r1.cameraPointerId = r3
            r3 = 0
            r1.cameraLastY = r3
            r1.cameraLastX = r3
            r1.cameraDownY = r3
            r1.cameraDownX = r3
            r1.cameraMovedPastSlop = r2
            return
    }

    private void finishHotbarPointer(boolean r3) {
            r2 = this;
            if (r3 == 0) goto L12
            boolean r3 = r2.hotbarDoubleTapConsumed
            if (r3 != 0) goto L12
            int r3 = r2.hotbarLastSlot
            if (r3 < 0) goto L12
            r2.lastHotbarTapSlot = r3
            long r0 = android.os.SystemClock.uptimeMillis()
            r2.lastHotbarTapTimeMs = r0
        L12:
            r3 = -1
            r2.hotbarPointerId = r3
            r2.hotbarLastSlot = r3
            r3 = 0
            r2.hotbarDoubleTapConsumed = r3
            return
    }

    private void finishMousePassThroughPointer(android.view.MotionEvent r3, int r4, boolean r5) {
            r2 = this;
            if (r4 < 0) goto L28
            int r0 = r3.getPointerCount()
            if (r4 < r0) goto L9
            goto L28
        L9:
            int r0 = r3.getPointerId(r4)
            android.util.SparseArray<ca.dnamobile.javalauncher.controls.TouchControlsOverlay$MousePassThroughState> r1 = r2.mousePassThroughPointers
            java.lang.Object r1 = r1.get(r0)
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$MousePassThroughState r1 = (ca.dnamobile.javalauncher.controls.TouchControlsOverlay.MousePassThroughState) r1
            if (r1 != 0) goto L18
            return
        L18:
            if (r5 != 0) goto L23
            boolean r5 = r2.updateMouseGrabState()
            if (r5 == 0) goto L23
            r2.dispatchMousePassThroughPointerMove(r3, r4, r1)
        L23:
            android.util.SparseArray<ca.dnamobile.javalauncher.controls.TouchControlsOverlay$MousePassThroughState> r3 = r2.mousePassThroughPointers
            r3.remove(r0)
        L28:
            return
    }

    private void finishSwipeGesturePointer(android.view.MotionEvent r3, int r4, boolean r5) {
            r2 = this;
            if (r4 < 0) goto L2b
            int r0 = r3.getPointerCount()
            if (r4 < r0) goto L9
            goto L2b
        L9:
            int r0 = r3.getPointerId(r4)
            android.util.SparseArray<ca.dnamobile.javalauncher.controls.TouchControlsOverlay$SwipeGestureState> r1 = r2.swipeGesturePointers
            java.lang.Object r1 = r1.get(r0)
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$SwipeGestureState r1 = (ca.dnamobile.javalauncher.controls.TouchControlsOverlay.SwipeGestureState) r1
            if (r1 != 0) goto L18
            return
        L18:
            if (r5 != 0) goto L23
            boolean r5 = r2.updateMouseGrabState()
            if (r5 == 0) goto L23
            r2.dispatchSwipeGesturePointerMove(r3, r4, r1)
        L23:
            r2.releaseActiveSwipeGestureControl(r3, r4, r1)
            android.util.SparseArray<ca.dnamobile.javalauncher.controls.TouchControlsOverlay$SwipeGestureState> r3 = r2.swipeGesturePointers
            r3.remove(r0)
        L2b:
            return
    }

    private void finishVirtualMousePointer(android.view.MotionEvent r2, int r3, boolean r4) {
            r1 = this;
            if (r3 < 0) goto Ld
            int r0 = r2.getPointerCount()
            if (r3 >= r0) goto Ld
            if (r4 != 0) goto Ld
            r1.dispatchActiveVirtualMousePointer(r2)
        Ld:
            if (r4 != 0) goto L1e
            boolean r2 = r1.virtualMouseMovedPastSlop
            if (r2 != 0) goto L1e
            r1.sendVirtualMouseCursorPosition()
            r2 = 1
            r1.sendLeftMouse(r2)
            r2 = 0
            r1.sendLeftMouse(r2)
        L1e:
            r1.cancelVirtualMousePointer()
            r1.postInvalidateOnAnimation()
            return
    }

    private void flushKeySenderChord(java.util.ArrayList<java.lang.Integer> r2) {
            r1 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L7
            return
        L7:
            r1.sendKeyChord(r2)
            r2.clear()
            return
    }

    private static java.lang.String formatColor(int r2) {
            java.util.Locale r0 = java.util.Locale.US
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = "#%08X"
            java.lang.String r2 = java.lang.String.format(r0, r1, r2)
            return r2
    }

    private static java.lang.String formatScale(float r3) {
            int r0 = java.lang.Math.round(r3)
            float r1 = (float) r0
            float r1 = r3 - r1
            float r1 = java.lang.Math.abs(r1)
            r2 = 1008981770(0x3c23d70a, float:0.01)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L17
            java.lang.String r3 = java.lang.String.valueOf(r0)
            return r3
        L17:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r1 = "%.2f"
            java.lang.String r3 = java.lang.String.format(r0, r1, r3)
            return r3
    }

    private boolean hasActiveTouchRoute() {
            r2 = this;
            int r0 = r2.cameraPointerId
            r1 = -1
            if (r0 != r1) goto L2c
            int r0 = r2.hotbarPointerId
            if (r0 != r1) goto L2c
            int r0 = r2.virtualMousePointerId
            if (r0 != r1) goto L2c
            int r0 = r2.passthroughPointerId
            if (r0 != r1) goto L2c
            android.util.SparseArray<ca.dnamobile.javalauncher.controls.TouchControlsOverlay$SwipeGestureState> r0 = r2.swipeGesturePointers
            int r0 = r0.size()
            if (r0 > 0) goto L2c
            android.util.SparseArray<ca.dnamobile.javalauncher.controls.TouchControlsOverlay$MousePassThroughState> r0 = r2.mousePassThroughPointers
            int r0 = r0.size()
            if (r0 > 0) goto L2c
            android.util.SparseArray<ca.dnamobile.javalauncher.controls.TouchControlButtonView> r0 = r2.controlPointerTargets
            int r0 = r0.size()
            if (r0 <= 0) goto L2a
            goto L2c
        L2a:
            r0 = 0
            goto L2d
        L2c:
            r0 = 1
        L2d:
            return r0
    }

    private boolean hasGameCursorOverlayInViewTree() {
            r4 = this;
            r0 = 0
            android.view.View r1 = r4.getRootView()     // Catch: java.lang.Throwable -> L1e
            boolean r1 = r4.containsGameCursorOverlay(r1)     // Catch: java.lang.Throwable -> L1e
            r2 = 1
            if (r1 == 0) goto Ld
            return r2
        Ld:
            android.view.ViewParent r1 = r4.getParent()     // Catch: java.lang.Throwable -> L1e
            boolean r3 = r1 instanceof android.view.View     // Catch: java.lang.Throwable -> L1e
            if (r3 == 0) goto L1e
            android.view.View r1 = (android.view.View) r1     // Catch: java.lang.Throwable -> L1e
            boolean r1 = r4.containsGameCursorOverlay(r1)     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L1e
            r0 = r2
        L1e:
            return r0
    }

    private boolean hasUnstablePixelCoordinates() {
            r9 = this;
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r0 = r9.layoutData
            int r1 = r9.getWidth()
            float r1 = (float) r1
            float r0 = r0.resolvedSourceWidth(r1)
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r1 = r9.layoutData
            int r2 = r9.getHeight()
            float r2 = (float) r2
            float r1 = r1.resolvedSourceHeight(r2)
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r2 = r9.layoutData
            java.util.List<ca.dnamobile.javalauncher.controls.TouchControlData> r2 = r2.controls
            java.util.Iterator r2 = r2.iterator()
        L1e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5f
            java.lang.Object r3 = r2.next()
            ca.dnamobile.javalauncher.controls.TouchControlData r3 = (ca.dnamobile.javalauncher.controls.TouchControlData) r3
            java.lang.String r4 = r3.rawX
            r5 = 1
            if (r4 != 0) goto L5e
            java.lang.String r4 = r3.rawY
            if (r4 == 0) goto L34
            goto L5e
        L34:
            float r4 = r3.width
            r6 = 1065353216(0x3f800000, float:1.0)
            float r4 = java.lang.Math.max(r6, r4)
            float r7 = r3.height
            float r6 = java.lang.Math.max(r6, r7)
            float r7 = r3.x
            r8 = 0
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 < 0) goto L5e
            float r7 = r3.y
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L50
            goto L5e
        L50:
            float r7 = r3.x
            float r7 = r7 + r4
            int r4 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r4 > 0) goto L5e
            float r3 = r3.y
            float r3 = r3 + r6
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 <= 0) goto L1e
        L5e:
            return r5
        L5f:
            r0 = 0
            return r0
    }

    private void hideKeySenderKeyboard() {
            r2 = this;
            r0 = 0
            r2.keySenderKeyboardVisible = r0
            android.view.View r0 = r2.keySenderKeyboardView
            r1 = 0
            r2.keySenderKeyboardView = r1
            if (r0 == 0) goto L13
            android.view.ViewParent r1 = r0.getParent()
            if (r1 != r2) goto L13
            r2.removeView(r0)
        L13:
            return
    }

    private int hotbarSlotForTouch(float r9, float r10) {
            r8 = this;
            android.content.Context r0 = r8.getContext()
            java.io.File r1 = r8.resolveMinecraftOptionsFile()
            int r2 = r8.getWidth()
            float r2 = (float) r2
            int r3 = r8.getHeight()
            float r3 = (float) r3
            float r4 = r8.resolveGameBufferWidth()
            float r5 = r8.resolveGameBufferHeight()
            r6 = r9
            r7 = r10
            int r9 = ca.dnamobile.javalauncher.controls.TouchHotbarHitbox.slotForTouch(r0, r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    private android.view.PointerIcon invisiblePointerIcon() {
            r2 = this;
            android.view.PointerIcon r0 = r2.transparentPointerIcon     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L12
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L17
            r1 = 1
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r1, r1, r0)     // Catch: java.lang.Throwable -> L17
            r1 = 0
            android.view.PointerIcon r0 = android.view.PointerIcon.create(r0, r1, r1)     // Catch: java.lang.Throwable -> L17
            r2.transparentPointerIcon = r0     // Catch: java.lang.Throwable -> L17
        L12:
            android.view.PointerIcon r0 = r2.transparentPointerIcon     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L17
            return r0
        L17:
            android.content.Context r0 = r2.getContext()
            r1 = 0
            android.view.PointerIcon r0 = android.view.PointerIcon.getSystemIcon(r0, r1)
            return r0
    }

    private static boolean isHardwarePointerEvent(android.view.MotionEvent r5) {
            int r0 = r5.getSource()
            r1 = r0 & 8194(0x2002, float:1.1482E-41)
            r2 = 1
            r3 = 8194(0x2002, float:1.1482E-41)
            if (r1 == r3) goto L2d
            r1 = 131076(0x20004, float:1.83677E-40)
            r3 = r0 & r1
            if (r3 == r1) goto L2d
            r1 = 1048584(0x100008, float:1.469379E-39)
            r0 = r0 & r1
            if (r0 != r1) goto L19
            goto L2d
        L19:
            r0 = 0
            r1 = r0
        L1b:
            int r3 = r5.getPointerCount()
            if (r1 >= r3) goto L2c
            int r3 = r5.getToolType(r1)
            r4 = 3
            if (r3 != r4) goto L29
            return r2
        L29:
            int r1 = r1 + 1
            goto L1b
        L2c:
            return r0
        L2d:
            return r2
    }

    private boolean isHotbarDoubleTap(int r8) {
            r7 = this;
            r0 = 0
            if (r8 < 0) goto L25
            int r1 = r7.lastHotbarTapSlot
            if (r8 != r1) goto L25
            long r1 = r7.lastHotbarTapTimeMs
            r3 = 0
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 > 0) goto L10
            goto L25
        L10:
            long r1 = android.os.SystemClock.uptimeMillis()
            long r5 = r7.lastHotbarTapTimeMs
            long r1 = r1 - r5
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 < 0) goto L25
            int r8 = android.view.ViewConfiguration.getDoubleTapTimeout()
            long r3 = (long) r8
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 > 0) goto L25
            r0 = 1
        L25:
            return r0
    }

    private static boolean isMouseGrabbed() {
            boolean r0 = org.lwjgl.glfw.CallbackBridge.isGrabbing()     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = 1
            return r0
    }

    private boolean isMousePassThroughEnabled(ca.dnamobile.javalauncher.controls.TouchControlData r3) {
            r2 = this;
            boolean r0 = readMousePassThroughDataFlag(r3)
            if (r0 == 0) goto L8
            r3 = 1
            return r3
        L8:
            android.content.SharedPreferences r0 = r2.mousePassThroughPrefs()
            java.lang.String r3 = mousePassThroughPreferenceKey(r3)
            r1 = 0
            boolean r3 = r0.getBoolean(r3, r1)
            return r3
    }

    private boolean isPlainGlfwKeyboardKey(int r1) {
            r0 = this;
            if (r1 <= 0) goto L4
            r1 = 1
            goto L5
        L4:
            r1 = 0
        L5:
            return r1
    }

    private boolean isSwipeGestureEnabled(ca.dnamobile.javalauncher.controls.TouchControlData r3) {
            r2 = this;
            boolean r0 = readSwipeGestureDataFlag(r3)
            if (r0 == 0) goto L8
            r3 = 1
            return r3
        L8:
            android.content.SharedPreferences r0 = r2.swipeGesturePrefs()
            java.lang.String r3 = swipeGesturePreferenceKey(r3)
            r1 = 0
            boolean r3 = r0.getBoolean(r3, r1)
            return r3
    }

    private java.lang.String joinKeyCodes(int[] r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r4.length
            if (r1 >= r2) goto L18
            if (r1 <= 0) goto L10
            java.lang.String r2 = ", "
            r0.append(r2)
        L10:
            r2 = r4[r1]
            r0.append(r2)
            int r1 = r1 + 1
            goto L6
        L18:
            java.lang.String r4 = r0.toString()
            return r4
    }

    private static android.widget.TextView labelView(android.content.Context r1, java.lang.String r2) {
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r1)
            r0.setText(r2)
            r1 = 1095761920(0x41500000, float:13.0)
            r0.setTextSize(r1)
            r1 = 0
            r2 = 12
            r0.setPadding(r1, r2, r1, r1)
            return r0
    }

    private /* synthetic */ void lambda$onAttachedToWindow$1() {
            r2 = this;
            boolean r0 = r2.shouldUseLauncherVirtualCursorNoPolicy()
            r1 = 1
            r2.applyAndroidPointerIconPolicy(r0, r1)
            return
    }

    private /* synthetic */ void lambda$onSizeChanged$2() {
            r2 = this;
            boolean r0 = r2.shouldUseLauncherVirtualCursorNoPolicy()
            r1 = 1
            r2.applyAndroidPointerIconPolicy(r0, r1)
            return
    }

    private /* synthetic */ void lambda$rebuildWhenSized$0() {
            r2 = this;
            r0 = 0
            r2.rebuildPending = r0
            int r0 = r2.getWidth()
            r1 = 1
            if (r0 <= r1) goto L13
            int r0 = r2.getHeight()
            if (r0 <= r1) goto L13
            r2.rebuild()
        L13:
            return
    }

    private /* synthetic */ void lambda$scheduleCameraLongPressAttack$22() {
            r2 = this;
            int r0 = r2.cameraPointerId
            r1 = -1
            if (r0 == r1) goto L14
            boolean r0 = r2.cameraMovedPastSlop
            if (r0 != 0) goto L14
            boolean r0 = r2.cameraLongPressAttackActive
            if (r0 == 0) goto Le
            goto L14
        Le:
            r0 = 1
            r2.cameraLongPressAttackActive = r0
            r2.sendLeftMouse(r0)
        L14:
            return
    }

    private /* synthetic */ void lambda$schedulePointerIconReapply$3() {
            r1 = this;
            r0 = 0
            r1.reapplyHiddenPointerIconIfNeeded(r0)
            return
    }

    private /* synthetic */ void lambda$schedulePointerIconReapply$4() {
            r1 = this;
            r0 = 1
            r1.reapplyHiddenPointerIconIfNeeded(r0)
            return
    }

    private /* synthetic */ void lambda$showEditDialog$10(boolean[] r2, android.widget.EditText r3, android.widget.SeekBar r4) {
            r1 = this;
            r0 = 0
            boolean r2 = r2[r0]
            if (r2 != 0) goto L8
            r1.setTextFromSlider(r3, r4)
        L8:
            return
    }

    private /* synthetic */ void lambda$showEditDialog$11(boolean[] r2, android.widget.EditText r3, android.widget.SeekBar r4) {
            r1 = this;
            r0 = 0
            boolean r2 = r2[r0]
            if (r2 != 0) goto L8
            r1.setTextFromSlider(r3, r4)
        L8:
            return
    }

    private /* synthetic */ void lambda$showEditDialog$12(boolean[] r2, android.widget.EditText r3, android.widget.SeekBar r4) {
            r1 = this;
            r0 = 0
            boolean r2 = r2[r0]
            if (r2 != 0) goto L8
            r1.setTextFromSlider(r3, r4)
        L8:
            return
    }

    static /* synthetic */ void lambda$showEditDialog$13(boolean[] r1, boolean[] r2, android.widget.EditText r3, android.widget.SeekBar r4, java.lang.Runnable r5) {
            r0 = 0
            boolean r1 = r1[r0]
            if (r1 != 0) goto L1c
            r1 = 1
            r2[r0] = r1
            int r1 = r4.getProgress()
            float r1 = (float) r1
            r4 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r4
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r3.setText(r1)
            r2[r0] = r0
            r5.run()
        L1c:
            return
    }

    private /* synthetic */ void lambda$showEditDialog$14(boolean[] r2, android.widget.EditText r3, android.widget.SeekBar r4) {
            r1 = this;
            r0 = 0
            boolean r2 = r2[r0]
            if (r2 != 0) goto L8
            r1.setTextFromSlider(r3, r4)
        L8:
            return
    }

    private /* synthetic */ void lambda$showEditDialog$15(boolean[] r2, android.widget.EditText r3, android.widget.SeekBar r4) {
            r1 = this;
            r0 = 0
            boolean r2 = r2[r0]
            if (r2 != 0) goto L8
            r1.setTextFromSlider(r3, r4)
        L8:
            return
    }

    private /* synthetic */ void lambda$showEditDialog$16(java.lang.String r2, ca.dnamobile.javalauncher.controls.TouchControlData r3, boolean[] r4, android.content.Context r5, android.app.AlertDialog r6, android.view.View r7) {
            r1 = this;
            r1.pushUndoSnapshot(r2)
            ca.dnamobile.javalauncher.controls.TouchControlData r2 = r3.copy()
            java.util.UUID r7 = java.util.UUID.randomUUID()
            java.lang.String r7 = r7.toString()
            r2.id = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = r3.label
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r0 = " Copy"
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r7 = r7.toString()
            r2.label = r7
            float r7 = r3.x
            r0 = 1103101952(0x41c00000, float:24.0)
            float r7 = r7 + r0
            r2.x = r7
            float r7 = r3.y
            float r7 = r7 + r0
            r2.y = r7
            boolean r7 = r1.isMousePassThroughEnabled(r3)
            r0 = 1
            if (r7 == 0) goto L3e
            r1.setMousePassThroughEnabled(r2, r0)
        L3e:
            boolean r7 = r1.isSwipeGestureEnabled(r3)
            if (r7 == 0) goto L47
            r1.setSwipeGestureEnabled(r2, r0)
        L47:
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r7 = r1.layoutData
            java.util.List<ca.dnamobile.javalauncher.controls.TouchControlData> r7 = r7.controls
            r7.add(r2)
            r2 = 0
            r4[r2] = r0
            r1.saveLayout()
            r1.rebuildWhenSized()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = "Copied "
            r4.<init>(r7)
            java.lang.String r3 = r3.label
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            android.widget.Toast r2 = android.widget.Toast.makeText(r5, r3, r2)
            r2.show()
            r6.dismiss()
            return
    }

    private /* synthetic */ void lambda$showEditDialog$17(java.lang.String r1, boolean[] r2, ca.dnamobile.javalauncher.controls.TouchControlData r3, android.app.AlertDialog r4, android.view.View r5) {
            r0 = this;
            r0.pushUndoSnapshot(r1)
            r1 = 1
            r5 = 0
            r2[r5] = r1
            r0.setMousePassThroughEnabled(r3, r5)
            r0.setSwipeGestureEnabled(r3, r5)
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r1 = r0.layoutData
            java.util.List<ca.dnamobile.javalauncher.controls.TouchControlData> r1 = r1.controls
            r1.remove(r3)
            r0.saveLayout()
            r0.rebuildWhenSized()
            r4.dismiss()
            return
    }

    private /* synthetic */ void lambda$showEditDialog$18(java.lang.String r10, java.lang.String r11, android.widget.EditText r12, android.widget.Spinner r13, java.lang.String[] r14, ca.dnamobile.javalauncher.controls.TouchInputBinding.Option[][] r15, android.widget.Spinner r16, ca.dnamobile.javalauncher.controls.TouchControlData r17, android.widget.Spinner[] r18, ca.dnamobile.javalauncher.controls.TouchInputBinding.Option[] r19, android.widget.EditText r20, android.widget.CheckBox r21, android.widget.CheckBox r22, android.widget.EditText r23, android.widget.EditText r24, android.widget.EditText r25, android.widget.EditText r26, float[] r27, android.widget.EditText r28, android.widget.EditText r29, android.widget.EditText r30, android.widget.EditText r31, android.widget.CheckBox r32, android.widget.CheckBox r33, android.widget.CheckBox r34, android.widget.CheckBox r35, boolean[] r36, android.app.AlertDialog r37, android.view.View r38) {
            r9 = this;
            r0 = r9
            r1 = r14
            r2 = r17
            r9.pushUndoSnapshot(r10)
            android.text.Editable r3 = r12.getText()
            if (r3 != 0) goto Lf
            r3 = r11
            goto L1b
        Lf:
            android.text.Editable r3 = r12.getText()
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r3.trim()
        L1b:
            int r4 = r13.getSelectedItemPosition()
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            int r6 = r1.length
            r7 = 1
            int r6 = r6 - r7
            int r4 = java.lang.Math.min(r4, r6)
            r1 = r1[r4]
            r4 = r15[r5]
            if (r4 == 0) goto L32
            goto L36
        L32:
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option[] r4 = ca.dnamobile.javalauncher.controls.TouchInputBinding.optionsForAction(r1)
        L36:
            int r6 = r16.getSelectedItemPosition()
            int r6 = java.lang.Math.max(r5, r6)
            int r8 = r4.length
            int r8 = r8 - r7
            int r6 = java.lang.Math.min(r6, r8)
            r4 = r4[r6]
            ca.dnamobile.javalauncher.controls.TouchInputBinding.applyOption(r2, r1, r4)
            java.lang.String r4 = "key"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L5c
            r1 = r18
            r4 = r19
            int[] r1 = r9.readKeySlotsFromSpinners(r1, r4)
            r2.setKeySlots(r1)
        L5c:
            android.text.Editable r1 = r20.getText()
            java.lang.String r4 = ""
            if (r1 != 0) goto L66
            r1 = r4
            goto L6e
        L66:
            android.text.Editable r1 = r20.getText()
            java.lang.String r1 = r1.toString()
        L6e:
            java.lang.String r1 = r9.safeControlId(r1)
            r2.id = r1
            boolean r1 = r21.isChecked()
            r9.setMousePassThroughEnabled(r2, r1)
            boolean r1 = r22.isChecked()
            r9.setSwipeGestureEnabled(r2, r1)
            java.lang.String r1 = r3.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L8f
            java.lang.String r1 = "Button"
            goto L93
        L8f:
            java.lang.String r1 = r3.trim()
        L93:
            r2.label = r1
            float r1 = r2.x
            r3 = r23
            float r1 = parseFloat(r3, r1)
            r2.x = r1
            float r1 = r2.y
            r3 = r24
            float r1 = parseFloat(r3, r1)
            r2.y = r1
            float r1 = r2.width
            r3 = r25
            float r1 = parseFloat(r3, r1)
            r3 = 1103101952(0x41c00000, float:24.0)
            float r1 = java.lang.Math.max(r3, r1)
            r2.width = r1
            float r1 = r2.height
            r6 = r26
            float r1 = parseFloat(r6, r1)
            float r1 = java.lang.Math.max(r3, r1)
            r2.height = r1
            r1 = r27[r5]
            r3 = 1106247680(0x41f00000, float:30.0)
            r6 = 1132068864(0x437a0000, float:250.0)
            float r1 = clamp(r1, r3, r6)
            r2.sizePercent = r1
            float r1 = r2.opacity
            r3 = r28
            float r1 = parseFloat(r3, r1)
            r3 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            float r1 = clamp(r1, r6, r3)
            r2.opacity = r1
            float r1 = r2.cornerRadius
            r3 = r29
            float r1 = parseFloat(r3, r1)
            float r1 = java.lang.Math.max(r6, r1)
            r2.cornerRadius = r1
            float r1 = r2.strokeWidth
            r3 = r30
            float r1 = parseFloat(r3, r1)
            float r1 = java.lang.Math.max(r6, r1)
            r2.strokeWidth = r1
            android.text.Editable r1 = r31.getText()
            if (r1 != 0) goto L107
            goto L10f
        L107:
            android.text.Editable r1 = r31.getText()
            java.lang.String r4 = r1.toString()
        L10f:
            int r1 = r2.strokeColor
            int r1 = parseColorValue(r4, r1)
            r2.strokeColor = r1
            boolean r1 = r32.isChecked()
            r2.toggle = r1
            boolean r1 = r33.isChecked()
            r2.visibleInGame = r1
            boolean r1 = r34.isChecked()
            r2.visibleInMenu = r1
            boolean r1 = r35.isChecked()
            if (r1 != 0) goto L13a
            java.lang.String r1 = r2.action
            boolean r1 = ca.dnamobile.javalauncher.controls.TouchControlData.shouldStayVisibleWhenControlsHiddenByDefault(r1)
            if (r1 == 0) goto L138
            goto L13a
        L138:
            r1 = r5
            goto L13b
        L13a:
            r1 = r7
        L13b:
            r2.visibleWhenControlsHidden = r1
            r1 = 0
            r2.rawX = r1
            r2.rawY = r1
            r36[r5] = r7
            r9.saveLayout()
            r9.rebuildWhenSized()
            r37.dismiss()
            return
    }

    private /* synthetic */ void lambda$showEditDialog$19(android.app.AlertDialog r34, java.lang.String r35, boolean[] r36, ca.dnamobile.javalauncher.controls.TouchControlData r37, java.lang.String r38, android.widget.EditText r39, android.widget.Spinner r40, java.lang.String[] r41, ca.dnamobile.javalauncher.controls.TouchInputBinding.Option[][] r42, android.widget.Spinner r43, android.widget.Spinner[] r44, ca.dnamobile.javalauncher.controls.TouchInputBinding.Option[] r45, android.widget.EditText r46, android.widget.CheckBox r47, android.widget.CheckBox r48, android.widget.EditText r49, android.widget.EditText r50, android.widget.EditText r51, android.widget.EditText r52, float[] r53, android.widget.EditText r54, android.widget.EditText r55, android.widget.EditText r56, android.widget.EditText r57, android.widget.CheckBox r58, android.widget.CheckBox r59, android.widget.CheckBox r60, android.widget.CheckBox r61, boolean[] r62, android.content.DialogInterface r63) {
            r33 = this;
            r0 = r34
            r1 = r33
            r29 = r34
            r2 = r35
            r9 = r37
            r3 = r38
            r4 = r39
            r5 = r40
            r6 = r41
            r7 = r42
            r8 = r43
            r10 = r44
            r11 = r45
            r12 = r46
            r13 = r47
            r14 = r48
            r15 = r49
            r16 = r50
            r17 = r51
            r18 = r52
            r19 = r53
            r20 = r54
            r21 = r55
            r22 = r56
            r23 = r57
            r24 = r58
            r25 = r59
            r26 = r60
            r27 = r61
            r28 = r62
            r33.styleDialogWindow(r34)
            r63 = r1
            r1 = -3
            android.widget.Button r1 = r0.getButton(r1)
            r30 = r2
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda12 r2 = new ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda12
            r38 = r2
            r39 = r33
            r40 = r35
            r41 = r36
            r42 = r37
            r43 = r34
            r38.<init>(r39, r40, r41, r42, r43)
            r1.setOnClickListener(r2)
            r1 = -1
            android.widget.Button r1 = r0.getButton(r1)
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda13 r2 = new ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda13
            r0 = r2
            r31 = r1
            r32 = r2
            r2 = r30
            r1 = r63
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r0 = r31
            r1 = r32
            r0.setOnClickListener(r1)
            return
    }

    private /* synthetic */ void lambda$showEditDialog$20(android.app.AlertDialog r5, boolean[] r6, boolean[] r7, ca.dnamobile.javalauncher.controls.TouchControlData r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12, int[] r13, int[] r14, int r15, int r16, float r17, float r18, float r19, float r20, float r21, float r22, float r23, float r24, int r25, int r26, boolean r27, boolean r28, boolean r29, boolean r30, java.lang.String r31, java.lang.String r32, android.content.DialogInterface r33) {
            r4 = this;
            r0 = r8
            r1 = 0
            r2 = r4
            r3 = r5
            r4.setEditDialogPreviewAlpha(r5, r1)
            boolean r3 = r6[r1]
            if (r3 != 0) goto L6b
            boolean r1 = r7[r1]
            if (r1 != 0) goto L6b
            r1 = r9
            r0.id = r1
            r1 = r10
            r0.label = r1
            r1 = r11
            r0.action = r1
            r1 = r12
            r0.keyCode = r1
            r1 = r13
            r0.keyCodes = r1
            r1 = r14
            r0.keySlots = r1
            r1 = r15
            r0.mouseButton = r1
            r1 = r16
            r0.scrollY = r1
            r1 = r17
            r0.x = r1
            r1 = r18
            r0.y = r1
            r1 = r19
            r0.width = r1
            r1 = r20
            r0.height = r1
            r1 = r21
            r0.sizePercent = r1
            r1 = r22
            r0.opacity = r1
            r1 = r23
            r0.cornerRadius = r1
            r1 = r24
            r0.strokeWidth = r1
            r1 = r25
            r0.strokeColor = r1
            r1 = r26
            r0.backgroundColor = r1
            r1 = r27
            r0.toggle = r1
            r1 = r28
            r0.visibleInGame = r1
            r1 = r29
            r0.visibleInMenu = r1
            r1 = r30
            r0.visibleWhenControlsHidden = r1
            r1 = r31
            r0.rawX = r1
            r1 = r32
            r0.rawY = r1
            r4.rebuildWhenSized()
        L6b:
            return
    }

    private /* synthetic */ void lambda$showEditDialog$5(android.content.Context r9, int r10, android.widget.Spinner[] r11, android.widget.EditText r12, android.widget.TextView r13, ca.dnamobile.javalauncher.controls.TouchInputBinding.Option[] r14, android.view.View r15) {
            r8 = this;
            r3 = r11[r10]
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r11
            r7 = r14
            r0.showKeyboardKeyPickerDialog(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    private /* synthetic */ void lambda$showEditDialog$6(android.widget.Spinner[] r1, int r2, android.widget.EditText r3, android.widget.TextView r4, ca.dnamobile.javalauncher.controls.TouchInputBinding.Option[] r5, android.view.View r6) {
            r0 = this;
            r2 = r1[r2]
            r6 = 0
            int r6 = ca.dnamobile.javalauncher.controls.TouchInputBinding.selectedKeyOptionIndex(r6)
            r2.setSelection(r6)
            r0.updateKeySlotSummary(r3, r4, r1, r5)
            return
    }

    private /* synthetic */ void lambda$showEditDialog$7(android.content.Context r1, android.widget.CompoundButton r2, boolean r3) {
            r0 = this;
            ca.dnamobile.javalauncher.controls.ControlsPreferences.setVirtualMouseEnabled(r1, r3)
            r0.postInvalidateOnAnimation()
            return
    }

    private /* synthetic */ void lambda$showEditDialog$8(ca.dnamobile.javalauncher.controls.TouchControlData r2, android.widget.EditText r3, android.widget.EditText r4, android.widget.EditText r5, android.widget.EditText r6, android.widget.EditText r7, android.widget.EditText r8, android.widget.EditText r9, android.widget.EditText r10, android.widget.EditText r11, android.widget.TextView r12, ca.dnamobile.javalauncher.controls.TouchControlButtonView r13) {
            r1 = this;
            android.text.Editable r0 = r3.getText()
            if (r0 != 0) goto L9
            java.lang.String r3 = r2.label
            goto L15
        L9:
            android.text.Editable r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r3.trim()
        L15:
            r2.label = r3
            java.lang.String r3 = r2.label
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L23
            java.lang.String r3 = "Button"
            r2.label = r3
        L23:
            float r3 = r2.x
            float r3 = parseFloat(r4, r3)
            r2.x = r3
            float r3 = r2.y
            float r3 = parseFloat(r5, r3)
            r2.y = r3
            float r3 = r2.width
            float r3 = parseFloat(r6, r3)
            r4 = 1103101952(0x41c00000, float:24.0)
            float r3 = java.lang.Math.max(r4, r3)
            r2.width = r3
            float r3 = r2.height
            float r3 = parseFloat(r7, r3)
            float r3 = java.lang.Math.max(r4, r3)
            r2.height = r3
            float r3 = r2.opacity
            float r3 = parseFloat(r8, r3)
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            float r3 = clamp(r3, r5, r4)
            r2.opacity = r3
            float r3 = r2.cornerRadius
            float r3 = parseFloat(r9, r3)
            float r3 = java.lang.Math.max(r5, r3)
            r2.cornerRadius = r3
            float r3 = r2.strokeWidth
            float r3 = parseFloat(r10, r3)
            float r3 = java.lang.Math.max(r5, r3)
            r2.strokeWidth = r3
            android.text.Editable r3 = r11.getText()
            if (r3 != 0) goto L7d
            java.lang.String r3 = ""
            goto L85
        L7d:
            android.text.Editable r3 = r11.getText()
            java.lang.String r3 = r3.toString()
        L85:
            int r4 = r2.strokeColor
            int r3 = parseColorValue(r3, r4)
            r2.strokeColor = r3
            r3 = 0
            r2.rawX = r3
            r2.rawY = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Editing: "
            r3.<init>(r4)
            java.lang.String r4 = r2.label
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r12.setText(r3)
            r1.applyControlPreview(r13, r2)
            return
    }

    private /* synthetic */ void lambda$showEditDialog$9(boolean[] r2, android.widget.EditText r3, android.widget.SeekBar r4) {
            r1 = this;
            r0 = 0
            boolean r2 = r2[r0]
            if (r2 != 0) goto L8
            r1.setTextFromSlider(r3, r4)
        L8:
            return
    }

    private /* synthetic */ boolean lambda$showKeyboardKeyPickerDialog$21(android.widget.Spinner r2, android.widget.EditText r3, android.widget.TextView r4, android.widget.Spinner[] r5, ca.dnamobile.javalauncher.controls.TouchInputBinding.Option[] r6, int r7) {
            r1 = this;
            int r7 = ca.dnamobile.javalauncher.controls.TouchInputBinding.selectedKeyOptionIndex(r7)
            r0 = 0
            r2.setSelection(r7, r0)
            r1.updateKeySlotSummary(r3, r4, r5, r6)
            r2 = 1
            return r2
    }

    private ca.dnamobile.javalauncher.controls.TouchControlsOverlay.LayoutMetrics layoutMetrics(float r13, float r14) {
            r12 = this;
            android.content.res.Resources r0 = r12.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r1 = 1036831949(0x3dcccccd, float:0.1)
            float r11 = java.lang.Math.max(r1, r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r13 = java.lang.Math.max(r0, r13)
            float r14 = java.lang.Math.max(r0, r14)
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r1 = r12.layoutData
            boolean r1 = r1.usesPixelCoordinates()
            if (r1 == 0) goto Lbf
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r1 = r12.layoutData
            float r5 = r1.resolvedSourceWidth(r13)
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r1 = r12.layoutData
            float r6 = r1.resolvedSourceHeight(r14)
            float[] r1 = r12.realDisplaySize(r13, r14)
            float r2 = java.lang.Math.max(r0, r5)
            float r2 = r13 / r2
            float r3 = java.lang.Math.max(r0, r6)
            float r3 = r14 / r3
            float r2 = java.lang.Math.min(r2, r3)
            r3 = 0
            r4 = r1[r3]
            float r7 = java.lang.Math.max(r0, r5)
            float r4 = r4 / r7
            r7 = 1
            r8 = r1[r7]
            float r9 = java.lang.Math.max(r0, r6)
            float r8 = r8 / r9
            float r4 = java.lang.Math.min(r4, r8)
            float r8 = r5 - r13
            float r8 = java.lang.Math.abs(r8)
            r9 = 1028443341(0x3d4ccccd, float:0.05)
            float r10 = r13 * r9
            r11 = 1082130432(0x40800000, float:4.0)
            float r10 = java.lang.Math.max(r11, r10)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 > 0) goto L7c
            float r8 = r6 - r14
            float r8 = java.lang.Math.abs(r8)
            float r9 = r9 * r14
            float r9 = java.lang.Math.max(r11, r9)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 > 0) goto L7c
            goto L80
        L7c:
            float r2 = java.lang.Math.max(r2, r4)
        L80:
            r4 = 1148190720(0x44700000, float:960.0)
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 > 0) goto Lb1
            r4 = 1141309440(0x44070000, float:540.0)
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 > 0) goto Lb1
            r3 = r1[r3]
            float r3 = java.lang.Math.max(r13, r3)
            r4 = 1155596288(0x44e10000, float:1800.0)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 < 0) goto Lb1
            r1 = r1[r7]
            float r1 = java.lang.Math.max(r14, r1)
            r3 = 1147207680(0x44610000, float:900.0)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto Lb1
            r1 = 1149698048(0x44870000, float:1080.0)
            float r0 = java.lang.Math.max(r0, r6)
            float r1 = r1 / r0
            float r0 = java.lang.Math.max(r2, r1)
            r10 = r0
            goto Lb2
        Lb1:
            r10 = r2
        Lb2:
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$LayoutMetrics r0 = new ca.dnamobile.javalauncher.controls.TouchControlsOverlay$LayoutMetrics
            r2 = 1
            r1 = r0
            r3 = r13
            r4 = r14
            r7 = r10
            r8 = r10
            r9 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        Lbf:
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$LayoutMetrics r0 = new ca.dnamobile.javalauncher.controls.TouchControlsOverlay$LayoutMetrics
            float r6 = r13 / r11
            float r7 = r14 / r11
            r3 = 0
            r2 = r0
            r4 = r13
            r5 = r14
            r8 = r11
            r9 = r11
            r10 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
    }

    private android.graphics.Bitmap loadVirtualCursorBitmap(android.content.Context r6, java.lang.String r7, java.lang.String r8) {
            r5 = this;
            java.lang.String r0 = "custom"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L2a
            if (r8 == 0) goto L2a
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L2a
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L2a
            boolean r8 = r0.isFile()     // Catch: java.lang.Throwable -> L2a
            if (r8 == 0) goto L2a
            long r1 = r0.length()     // Catch: java.lang.Throwable -> L2a
            r3 = 0
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 <= 0) goto L2a
            java.lang.String r8 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L2a
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeFile(r8)     // Catch: java.lang.Throwable -> L2a
            if (r8 == 0) goto L2a
            return r8
        L2a:
            r8 = 0
            android.content.res.Resources r0 = r6.getResources()     // Catch: java.lang.Throwable -> L48
            java.lang.String r7 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getMouseCursorResourceName(r7)     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = "drawable"
            java.lang.String r2 = r6.getPackageName()     // Catch: java.lang.Throwable -> L48
            int r7 = r0.getIdentifier(r7, r1, r2)     // Catch: java.lang.Throwable -> L48
            if (r7 == 0) goto L47
            android.content.res.Resources r6 = r6.getResources()     // Catch: java.lang.Throwable -> L48
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeResource(r6, r7)     // Catch: java.lang.Throwable -> L48
        L47:
            return r8
        L48:
            r6 = move-exception
            java.lang.String r7 = "TouchControlsOverlay"
            java.lang.String r0 = "Unable to load virtual mouse cursor image"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r7, r0, r6)
            return r8
    }

    private android.graphics.drawable.GradientDrawable makeDialogBackground() {
            r3 = this;
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r1 = -299884252(0xffffffffee202124, float:-1.2389417E28)
            r0.setColor(r1)
            r1 = 1102053376(0x41b00000, float:22.0)
            int r1 = r3.dp(r1)
            float r1 = (float) r1
            r0.setCornerRadius(r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = r3.dp(r1)
            r2 = 1
            int r1 = java.lang.Math.max(r2, r1)
            r2 = 1157627903(0x44ffffff, float:2047.9999)
            r0.setStroke(r1, r2)
            return r0
    }

    private static float maxCursorCoordinate(float r1) {
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r0
            r0 = 0
            float r1 = java.lang.Math.max(r0, r1)
            return r1
    }

    private static java.lang.String mousePassThroughPreferenceKey(ca.dnamobile.javalauncher.controls.TouchControlData r2) {
            java.lang.String r0 = r2.id
            if (r0 != 0) goto L7
            java.lang.String r0 = ""
            goto Ld
        L7:
            java.lang.String r0 = r2.id
            java.lang.String r0 = r0.trim()
        Ld:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L1b
            java.lang.String r1 = "null"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L29
        L1b:
            java.lang.String r0 = r2.label
            if (r0 != 0) goto L22
            java.lang.String r2 = "button"
            goto L28
        L22:
            java.lang.String r2 = r2.label
            java.lang.String r2 = r2.trim()
        L28:
            r0 = r2
        L29:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r1 = "button."
            r2.<init>(r1)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
    }

    private android.content.SharedPreferences mousePassThroughPrefs() {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            java.lang.String r1 = "touch_control_mouse_pass_through"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            return r0
    }

    private static java.io.File newestReadableOptionsFile(java.util.ArrayList<java.io.File> r7) {
            java.util.Iterator r7 = r7.iterator()
            r0 = 0
            r1 = -9223372036854775808
        L7:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L2c
            java.lang.Object r3 = r7.next()
            java.io.File r3 = (java.io.File) r3
            if (r3 == 0) goto L7
            boolean r4 = r3.isFile()
            if (r4 != 0) goto L1c
            goto L7
        L1c:
            long r4 = r3.lastModified()     // Catch: java.lang.Throwable -> L21
            goto L23
        L21:
            r4 = 0
        L23:
            if (r0 == 0) goto L29
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 <= 0) goto L7
        L29:
            r0 = r3
            r1 = r4
            goto L7
        L2c:
            return r0
    }

    private void normalizeUnstablePixelLayoutBeforeSave() {
            r11 = this;
            boolean r0 = r11.editMode
            if (r0 == 0) goto La5
            int r0 = r11.getWidth()
            r1 = 1
            if (r0 <= r1) goto La5
            int r0 = r11.getHeight()
            if (r0 > r1) goto L13
            goto La5
        L13:
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r0 = r11.layoutData
            boolean r0 = r0.usesPixelCoordinates()
            if (r0 != 0) goto L1c
            return
        L1c:
            boolean r0 = r11.hasUnstablePixelCoordinates()
            if (r0 != 0) goto L23
            return
        L23:
            int r0 = r11.getWidth()
            int r0 = java.lang.Math.max(r1, r0)
            int r2 = r11.getHeight()
            int r2 = java.lang.Math.max(r1, r2)
            r3 = 0
        L34:
            int r4 = r11.getChildCount()
            if (r3 >= r4) goto L8a
            android.view.View r4 = r11.getChildAt(r3)
            boolean r5 = r4 instanceof ca.dnamobile.javalauncher.controls.TouchControlButtonView
            if (r5 != 0) goto L43
            goto L87
        L43:
            ca.dnamobile.javalauncher.controls.TouchControlButtonView r4 = (ca.dnamobile.javalauncher.controls.TouchControlButtonView) r4
            ca.dnamobile.javalauncher.controls.TouchControlData r5 = r4.getData()
            int r6 = r4.getWidth()
            int r6 = java.lang.Math.max(r1, r6)
            int r7 = r4.getHeight()
            int r7 = java.lang.Math.max(r1, r7)
            float r8 = r4.getX()
            int r9 = r0 - r6
            float r9 = (float) r9
            r10 = 0
            float r9 = java.lang.Math.max(r10, r9)
            float r8 = clamp(r8, r10, r9)
            r5.x = r8
            float r4 = r4.getY()
            int r8 = r2 - r7
            float r8 = (float) r8
            float r8 = java.lang.Math.max(r10, r8)
            float r4 = clamp(r4, r10, r8)
            r5.y = r4
            float r4 = (float) r6
            r5.width = r4
            float r4 = (float) r7
            r5.height = r4
            r4 = 0
            r5.rawX = r4
            r5.rawY = r4
        L87:
            int r3 = r3 + 1
            goto L34
        L8a:
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r1 = r11.layoutData
            java.lang.String r3 = "px"
            r1.coordinateUnit = r3
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r1 = r11.layoutData
            float r0 = (float) r0
            r1.sourceWidth = r0
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r0 = r11.layoutData
            float r1 = (float) r2
            r0.sourceHeight = r1
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r0 = r11.layoutData
            int r1 = r0.version
            r2 = 4
            int r1 = java.lang.Math.max(r1, r2)
            r0.version = r1
        La5:
            return
    }

    private static int parseColorValue(java.lang.String r4, int r5) {
            java.lang.String r0 = "#"
            java.lang.String r4 = r4.trim()
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto Ld
            return r5
        Ld:
            boolean r1 = r4.startsWith(r0)     // Catch: java.lang.Throwable -> L51
            if (r1 != 0) goto L20
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L51
            java.lang.StringBuilder r4 = r1.append(r4)     // Catch: java.lang.Throwable -> L51
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L51
        L20:
            int r0 = r4.length()     // Catch: java.lang.Throwable -> L51
            r1 = 7
            r2 = 16
            r3 = 1
            if (r0 != r1) goto L3a
            java.lang.String r4 = r4.substring(r3)     // Catch: java.lang.Throwable -> L51
            long r4 = java.lang.Long.parseLong(r4, r2)     // Catch: java.lang.Throwable -> L51
            r0 = 4278190080(0xff000000, double:2.113706745E-314)
            long r4 = r4 | r0
            int r4 = (int) r4     // Catch: java.lang.Throwable -> L51
            return r4
        L3a:
            int r0 = r4.length()     // Catch: java.lang.Throwable -> L51
            r1 = 9
            if (r0 != r1) goto L4c
            java.lang.String r4 = r4.substring(r3)     // Catch: java.lang.Throwable -> L51
            long r4 = java.lang.Long.parseLong(r4, r2)     // Catch: java.lang.Throwable -> L51
            int r4 = (int) r4     // Catch: java.lang.Throwable -> L51
            return r4
        L4c:
            int r4 = android.graphics.Color.parseColor(r4)     // Catch: java.lang.Throwable -> L51
            return r4
        L51:
            return r5
    }

    private static float parseFloat(android.widget.EditText r1, float r2) {
            android.text.Editable r0 = r1.getText()     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L9
            java.lang.String r1 = ""
            goto L15
        L9:
            android.text.Editable r1 = r1.getText()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L1a
        L15:
            float r1 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.Throwable -> L1a
            return r1
        L1a:
            return r2
    }

    private int[] parseKeyCodes(java.lang.String r7, int r8) {
            r6 = this;
            java.lang.String r0 = "[,\\s]+"
            java.lang.String[] r7 = r7.split(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r7.length
            r2 = 0
            r3 = r2
        Le:
            if (r3 >= r1) goto L31
            r4 = r7[r3]
            if (r4 == 0) goto L2e
            java.lang.String r5 = r4.trim()
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L1f
            goto L2e
        L1f:
            java.lang.String r4 = r4.trim()     // Catch: java.lang.Throwable -> L2e
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L2e
            r0.add(r4)     // Catch: java.lang.Throwable -> L2e
        L2e:
            int r3 = r3 + 1
            goto Le
        L31:
            boolean r7 = r0.isEmpty()
            if (r7 == 0) goto L3c
            int[] r7 = new int[]{r8}
            return r7
        L3c:
            int r7 = r0.size()
            int[] r7 = new int[r7]
        L42:
            int r8 = r0.size()
            if (r2 >= r8) goto L57
            java.lang.Object r8 = r0.get(r2)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r7[r2] = r8
            int r2 = r2 + 1
            goto L42
        L57:
            return r7
    }

    private boolean positionOverlapsAnotherControl(android.view.View r16, float r17, float r18, int r19, int r20) {
            r15 = this;
            r0 = 1
            r1 = r19
            int r1 = java.lang.Math.max(r0, r1)
            float r1 = (float) r1
            float r1 = r17 + r1
            r2 = r20
            int r2 = java.lang.Math.max(r0, r2)
            float r2 = (float) r2
            float r10 = r18 + r2
            r11 = 0
            r12 = r11
        L15:
            int r2 = r15.getChildCount()
            if (r12 >= r2) goto L63
            r13 = r15
            android.view.View r2 = r15.getChildAt(r12)
            r14 = r16
            if (r2 == r14) goto L60
            int r3 = r2.getVisibility()
            if (r3 == 0) goto L2b
            goto L60
        L2b:
            boolean r3 = r2 instanceof ca.dnamobile.javalauncher.controls.TouchControlButtonView
            if (r3 != 0) goto L30
            goto L60
        L30:
            int r3 = r2.getWidth()
            if (r3 <= 0) goto L60
            int r3 = r2.getHeight()
            if (r3 > 0) goto L3d
            goto L60
        L3d:
            float r6 = r2.getX()
            float r7 = r2.getY()
            int r3 = r2.getWidth()
            float r3 = (float) r3
            float r8 = r6 + r3
            int r2 = r2.getHeight()
            float r2 = (float) r2
            float r9 = r7 + r2
            r2 = r17
            r3 = r18
            r4 = r1
            r5 = r10
            boolean r2 = rectanglesOverlap(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r2 == 0) goto L60
            return r0
        L60:
            int r12 = r12 + 1
            goto L15
        L63:
            r13 = r15
            return r11
    }

    private void pushBounded(java.util.ArrayDeque<java.lang.String> r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L11
            java.lang.Object r0 = r2.peekLast()
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L11
            return
        L11:
            r2.addLast(r3)
        L14:
            int r3 = r2.size()
            r0 = 4
            if (r3 <= r0) goto L1f
            r2.removeFirst()
            goto L14
        L1f:
            return
    }

    private void pushUndoSnapshot() {
            r1 = this;
            java.lang.String r0 = r1.snapshotLayoutSafely()
            r1.pushUndoSnapshot(r0)
            return
    }

    private void pushUndoSnapshot(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L2c
            java.lang.String r0 = r2.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto L2c
        Ld:
            java.util.ArrayDeque<java.lang.String> r0 = r1.redoHistory
            r0.clear()
            java.util.ArrayDeque<java.lang.String> r0 = r1.undoHistory
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L27
            java.util.ArrayDeque<java.lang.String> r0 = r1.undoHistory
            java.lang.Object r0 = r0.peekLast()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L27
            return
        L27:
            java.util.ArrayDeque<java.lang.String> r0 = r1.undoHistory
            r1.pushBounded(r0, r2)
        L2c:
            return
    }

    private int[] readKeySlotsFromSpinners(android.widget.Spinner[] r7, ca.dnamobile.javalauncher.controls.TouchInputBinding.Option[] r8) {
            r6 = this;
            r0 = 4
            int[] r1 = new int[r0]
            r2 = 0
            r3 = r2
        L5:
            if (r3 >= r0) goto L2d
            int r4 = r7.length
            if (r3 >= r4) goto L2d
            r4 = r7[r3]
            if (r4 == 0) goto L28
            int r5 = r8.length
            if (r5 != 0) goto L12
            goto L28
        L12:
            int r4 = r4.getSelectedItemPosition()
            int r5 = r8.length
            int r5 = r5 + (-1)
            int r4 = java.lang.Math.min(r4, r5)
            int r4 = java.lang.Math.max(r2, r4)
            r4 = r8[r4]
            int r4 = r4.value
            r1[r3] = r4
            goto L2a
        L28:
            r1[r3] = r2
        L2a:
            int r3 = r3 + 1
            goto L5
        L2d:
            return r1
    }

    private static boolean readMousePassThroughDataFlag(ca.dnamobile.javalauncher.controls.TouchControlData r2) {
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = "mousePassThrough"
            java.lang.reflect.Field r0 = r0.getField(r1)     // Catch: java.lang.Throwable -> Lf
            boolean r2 = r0.getBoolean(r2)     // Catch: java.lang.Throwable -> Lf
            return r2
        Lf:
            r2 = 0
            return r2
    }

    private static boolean readSwipeGestureDataFlag(ca.dnamobile.javalauncher.controls.TouchControlData r2) {
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = "swipeGesture"
            java.lang.reflect.Field r0 = r0.getField(r1)     // Catch: java.lang.Throwable -> Lf
            boolean r2 = r0.getBoolean(r2)     // Catch: java.lang.Throwable -> Lf
            return r2
        Lf:
            r2 = 0
            return r2
    }

    private float[] realDisplaySize(float r7, float r8) {
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = java.lang.Math.max(r0, r7)
            float r0 = java.lang.Math.max(r0, r8)
            android.content.Context r2 = r6.getContext()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r3 = "window"
            java.lang.Object r2 = r2.getSystemService(r3)     // Catch: java.lang.Throwable -> L6b
            android.view.WindowManager r2 = (android.view.WindowManager) r2     // Catch: java.lang.Throwable -> L6b
            if (r2 == 0) goto L6b
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L6b
            r4 = 30
            if (r3 < r4) goto L51
            android.view.WindowMetrics r3 = r2.getCurrentWindowMetrics()     // Catch: java.lang.Throwable -> L6b
            android.graphics.Rect r3 = r3.getBounds()     // Catch: java.lang.Throwable -> L6b
            android.view.WindowMetrics r2 = r2.getMaximumWindowMetrics()     // Catch: java.lang.Throwable -> L6b
            android.graphics.Rect r2 = r2.getBounds()     // Catch: java.lang.Throwable -> L6b
            int r4 = r3.width()     // Catch: java.lang.Throwable -> L6b
            int r5 = r2.width()     // Catch: java.lang.Throwable -> L6b
            int r4 = java.lang.Math.max(r4, r5)     // Catch: java.lang.Throwable -> L6b
            float r4 = (float) r4     // Catch: java.lang.Throwable -> L6b
            float r1 = java.lang.Math.max(r1, r4)     // Catch: java.lang.Throwable -> L6b
            int r3 = r3.height()     // Catch: java.lang.Throwable -> L6b
            int r2 = r2.height()     // Catch: java.lang.Throwable -> L6b
            int r2 = java.lang.Math.max(r3, r2)     // Catch: java.lang.Throwable -> L6b
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L6b
            float r0 = java.lang.Math.max(r0, r2)     // Catch: java.lang.Throwable -> L6b
            goto L6b
        L51:
            android.util.DisplayMetrics r3 = new android.util.DisplayMetrics     // Catch: java.lang.Throwable -> L6b
            r3.<init>()     // Catch: java.lang.Throwable -> L6b
            android.view.Display r2 = r2.getDefaultDisplay()     // Catch: java.lang.Throwable -> L6b
            r2.getRealMetrics(r3)     // Catch: java.lang.Throwable -> L6b
            int r2 = r3.widthPixels     // Catch: java.lang.Throwable -> L6b
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L6b
            float r1 = java.lang.Math.max(r1, r2)     // Catch: java.lang.Throwable -> L6b
            int r2 = r3.heightPixels     // Catch: java.lang.Throwable -> L6b
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L6b
            float r0 = java.lang.Math.max(r0, r2)     // Catch: java.lang.Throwable -> L6b
        L6b:
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            r8 = 1
            r2 = 0
            if (r7 < 0) goto L73
            r7 = r8
            goto L74
        L73:
            r7 = r2
        L74:
            float r3 = java.lang.Math.max(r1, r0)
            float r0 = java.lang.Math.min(r1, r0)
            r1 = 2
            if (r7 == 0) goto L86
            float[] r7 = new float[r1]
            r7[r2] = r3
            r7[r8] = r0
            goto L8c
        L86:
            float[] r7 = new float[r1]
            r7[r2] = r0
            r7[r8] = r3
        L8c:
            return r7
    }

    private void reapplyHiddenPointerIconIfNeeded(boolean r3) {
            r2 = this;
            boolean r0 = r2.shouldUseLauncherVirtualCursorNoPolicy()
            r1 = 0
            if (r0 == 0) goto Lb
            r0 = 1
            r2.applyAndroidPointerIconPolicy(r0, r0, r1)
        Lb:
            if (r3 == 0) goto Lf
            r2.pointerIconReapplyPending = r1
        Lf:
            return
    }

    private void rebuild() {
            r26 = this;
            r0 = r26
            int r1 = r26.getWidth()
            r2 = 1
            if (r1 <= r2) goto L127
            int r1 = r26.getHeight()
            if (r1 > r2) goto L11
            goto L127
        L11:
            r26.removeAllViews()
            int r1 = r26.getWidth()
            int r1 = java.lang.Math.max(r2, r1)
            int r3 = r26.getHeight()
            int r2 = java.lang.Math.max(r2, r3)
            float r3 = (float) r1
            float r4 = (float) r2
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$LayoutMetrics r12 = r0.layoutMetrics(r3, r4)
            android.content.res.Resources r3 = r26.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r13 = r3.density
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r3 = r0.layoutData
            java.util.List<ca.dnamobile.javalauncher.controls.TouchControlData> r3 = r3.controls
            java.util.Iterator r14 = r3.iterator()
        L3c:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L11b
            java.lang.Object r3 = r14.next()
            r15 = r3
            ca.dnamobile.javalauncher.controls.TouchControlData r15 = (ca.dnamobile.javalauncher.controls.TouchControlData) r15
            boolean r3 = r0.editMode
            if (r3 != 0) goto L54
            boolean r3 = r0.shouldCreateControlButton(r15)
            if (r3 != 0) goto L54
            goto L3c
        L54:
            ca.dnamobile.javalauncher.controls.TouchControlButtonView r11 = new ca.dnamobile.javalauncher.controls.TouchControlButtonView
            android.content.Context r3 = r26.getContext()
            r11.<init>(r3, r15, r0)
            boolean r3 = r0.editMode
            r11.setEditMode(r3)
            boolean r3 = r0.shouldShowControlButton(r15)
            r10 = 0
            if (r3 == 0) goto L6b
            r3 = r10
            goto L6c
        L6b:
            r3 = 4
        L6c:
            r11.setVisibility(r3)
            float r3 = r15.width
            int r3 = r12.toScreenWidth(r3)
            int r9 = java.lang.Math.min(r3, r1)
            float r3 = r15.height
            int r3 = r12.toScreenHeight(r3)
            int r8 = java.lang.Math.min(r3, r2)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r3.<init>(r9, r8)
            r0.addView(r11, r3)
            float r7 = (float) r9
            float r4 = r12.toScreenX(r15, r7)
            float r6 = (float) r8
            float r16 = r12.toScreenY(r15, r6)
            java.lang.String r3 = r15.rawX
            if (r3 != 0) goto La8
            r19 = r6
            r20 = r7
            r21 = r8
            r22 = r9
            r24 = r11
            r23 = r14
            r11 = r4
            r14 = r10
            goto Lcd
        La8:
            java.lang.String r3 = r15.rawX
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r5 = r0.layoutData
            float r5 = r5.preferredScale
            r17 = r11
            float r11 = r12.formulaPixelScale
            r18 = r5
            r5 = r1
            r19 = r6
            r6 = r2
            r20 = r7
            r21 = r8
            r8 = r19
            r22 = r9
            r9 = r13
            r23 = r14
            r14 = r10
            r10 = r18
            r24 = r17
            float r4 = ca.dnamobile.javalauncher.controls.ExpressionResolver.resolve(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r11 = r4
        Lcd:
            java.lang.String r3 = r15.rawY
            if (r3 != 0) goto Ld4
            r25 = r11
            goto Lec
        Ld4:
            java.lang.String r3 = r15.rawY
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r4 = r0.layoutData
            float r10 = r4.preferredScale
            float r15 = r12.formulaPixelScale
            r4 = r16
            r5 = r1
            r6 = r2
            r7 = r20
            r8 = r19
            r9 = r13
            r25 = r11
            r11 = r15
            float r16 = ca.dnamobile.javalauncher.controls.ExpressionResolver.resolve(r3, r4, r5, r6, r7, r8, r9, r10, r11)
        Lec:
            r3 = r16
            int r4 = r1 - r22
            int r4 = java.lang.Math.max(r14, r4)
            float r4 = (float) r4
            r5 = r25
            float r4 = java.lang.Math.min(r4, r5)
            r5 = 0
            float r4 = java.lang.Math.max(r5, r4)
            int r6 = r2 - r21
            int r6 = java.lang.Math.max(r14, r6)
            float r6 = (float) r6
            float r3 = java.lang.Math.min(r6, r3)
            float r3 = java.lang.Math.max(r5, r3)
            r5 = r24
            r5.setX(r4)
            r5.setY(r3)
            r14 = r23
            goto L3c
        L11b:
            boolean r1 = r0.keySenderKeyboardVisible
            if (r1 == 0) goto L126
            boolean r1 = r0.editMode
            if (r1 != 0) goto L126
            r26.attachKeySenderKeyboardView()
        L126:
            return
        L127:
            r26.rebuildWhenSized()
            return
    }

    private void rebuildWhenSized() {
            r2 = this;
            int r0 = r2.getWidth()
            r1 = 1
            if (r0 <= r1) goto L12
            int r0 = r2.getHeight()
            if (r0 > r1) goto Le
            goto L12
        Le:
            r2.rebuild()
            return
        L12:
            boolean r0 = r2.rebuildPending
            if (r0 != 0) goto L20
            r2.rebuildPending = r1
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda9 r0 = new ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda9
            r0.<init>(r2)
            r2.post(r0)
        L20:
            return
    }

    private static boolean rectanglesOverlap(float r0, float r1, float r2, float r3, float r4, float r5, float r6, float r7) {
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 >= 0) goto L12
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L12
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 >= 0) goto L12
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    private void releaseActiveSwipeGestureControl(android.view.MotionEvent r3, int r4, ca.dnamobile.javalauncher.controls.TouchControlsOverlay.SwipeGestureState r5) {
            r2 = this;
            ca.dnamobile.javalauncher.controls.TouchControlButtonView r0 = r5.activeSwipeControl
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 1
            r2.dispatchSinglePointerToControl(r3, r4, r1, r0)
            r3 = 0
            r5.activeSwipeControl = r3
            return
    }

    private void reloadVirtualCursorBitmapIfNeeded(boolean r9) {
            r8 = this;
            android.content.Context r0 = r8.getContext()
            java.lang.String r0 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getMouseCursorStyle(r0)
            android.content.Context r1 = r8.getContext()
            java.lang.String r1 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getCustomMouseCursorPath(r1)
            android.content.Context r2 = r8.getContext()
            int r2 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getMouseCursorSizePercent(r2)
            java.lang.String r3 = r8.loadedVirtualCursorStyle
            boolean r3 = r0.equals(r3)
            r4 = 1
            r5 = 0
            if (r1 != 0) goto L2a
            java.lang.String r6 = r8.loadedVirtualCursorCustomPath
            if (r6 != 0) goto L28
            r6 = r4
            goto L30
        L28:
            r6 = r5
            goto L30
        L2a:
            java.lang.String r6 = r8.loadedVirtualCursorCustomPath
            boolean r6 = r1.equals(r6)
        L30:
            int r7 = r8.loadedVirtualCursorSizePercent
            if (r2 != r7) goto L35
            goto L36
        L35:
            r4 = r5
        L36:
            if (r9 != 0) goto L3f
            if (r3 == 0) goto L3f
            if (r6 == 0) goto L3f
            if (r4 == 0) goto L3f
            return
        L3f:
            r8.loadedVirtualCursorStyle = r0
            r8.loadedVirtualCursorCustomPath = r1
            r8.loadedVirtualCursorSizePercent = r2
            android.content.Context r9 = r8.getContext()
            android.graphics.Bitmap r9 = r8.loadVirtualCursorBitmap(r9, r0, r1)
            r8.virtualCursorBitmap = r9
            r8.postInvalidateOnAnimation()
            return
    }

    private void resetVirtualMouseCursorToCenter(boolean r4) {
            r3 = this;
            int r0 = org.lwjgl.glfw.CallbackBridge.windowWidth     // Catch: java.lang.Throwable -> L1f
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L1f
            float r0 = maxCursorCoordinate(r0)     // Catch: java.lang.Throwable -> L1f
            int r1 = org.lwjgl.glfw.CallbackBridge.windowHeight     // Catch: java.lang.Throwable -> L1f
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L1f
            float r1 = maxCursorCoordinate(r1)     // Catch: java.lang.Throwable -> L1f
            r2 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r2
            r3.virtualCursorBridgeX = r0     // Catch: java.lang.Throwable -> L1f
            float r1 = r1 / r2
            r3.virtualCursorBridgeY = r1     // Catch: java.lang.Throwable -> L1f
            r0 = 1
            r3.virtualCursorInitialized = r0     // Catch: java.lang.Throwable -> L1f
            if (r4 == 0) goto L27
            r3.sendVirtualMouseCursorPosition()     // Catch: java.lang.Throwable -> L1f
            goto L27
        L1f:
            r4 = move-exception
            java.lang.String r0 = "TouchControlsOverlay"
            java.lang.String r1 = "Unable to reset virtual mouse cursor"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r1, r4)
        L27:
            return
    }

    private float[] resolveDraggedPosition(android.view.View r31, float r32, float r33) {
            r30 = this;
            int r0 = r31.getWidth()
            r1 = 1
            int r0 = java.lang.Math.max(r1, r0)
            int r2 = r31.getHeight()
            int r8 = java.lang.Math.max(r1, r2)
            int r2 = r30.getWidth()
            int r2 = r2 - r0
            float r2 = (float) r2
            r9 = 0
            float r10 = java.lang.Math.max(r9, r2)
            int r2 = r30.getHeight()
            int r2 = r2 - r8
            float r2 = (float) r2
            float r11 = java.lang.Math.max(r9, r2)
            r2 = r32
            float r12 = clamp(r2, r9, r10)
            r2 = r33
            float r13 = clamp(r2, r9, r11)
            android.content.Context r2 = r30.getContext()
            boolean r2 = ca.dnamobile.javalauncher.controls.ControlsPreferences.isSnapControlsEnabled(r2)
            r14 = 2
            r15 = 0
            if (r2 != 0) goto L45
            float[] r0 = new float[r14]
            r0[r15] = r12
            r0[r1] = r13
            return r0
        L45:
            android.content.res.Resources r2 = r30.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r3 = 1094713344(0x41400000, float:12.0)
            float r16 = r2 * r3
            r2 = 1065353216(0x3f800000, float:1.0)
            float r17 = r16 + r2
            r18 = 1073741824(0x40000000, float:2.0)
            float r2 = r10 / r18
            r7 = 3
            float[] r6 = new float[r7]
            r6[r15] = r9
            r6[r1] = r2
            r6[r14] = r10
            r20 = r12
            r5 = r15
            r19 = r17
        L69:
            if (r5 >= r7) goto La4
            r2 = r6[r5]
            float r21 = clamp(r2, r9, r10)
            float r2 = r12 - r21
            float r22 = java.lang.Math.abs(r2)
            int r2 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r2 > 0) goto L98
            int r2 = (r22 > r19 ? 1 : (r22 == r19 ? 0 : -1))
            if (r2 >= 0) goto L98
            r2 = r30
            r3 = r31
            r4 = r21
            r23 = r5
            r5 = r13
            r24 = r6
            r6 = r0
            r14 = r7
            r7 = r8
            boolean r2 = r2.positionOverlapsAnotherControl(r3, r4, r5, r6, r7)
            if (r2 != 0) goto L9d
            r20 = r21
            r19 = r22
            goto L9d
        L98:
            r23 = r5
            r24 = r6
            r14 = r7
        L9d:
            int r5 = r23 + 1
            r7 = r14
            r6 = r24
            r14 = 2
            goto L69
        La4:
            r14 = r7
            float r2 = r11 / r18
            float[] r7 = new float[r14]
            r7[r15] = r9
            r7[r1] = r2
            r2 = 2
            r7[r2] = r11
            r21 = r13
            r6 = r15
        Lb3:
            if (r6 >= r14) goto Leb
            r2 = r7[r6]
            float r22 = clamp(r2, r9, r11)
            float r2 = r13 - r22
            float r23 = java.lang.Math.abs(r2)
            int r2 = (r23 > r16 ? 1 : (r23 == r16 ? 0 : -1))
            if (r2 > 0) goto Le2
            int r2 = (r23 > r17 ? 1 : (r23 == r17 ? 0 : -1))
            if (r2 >= 0) goto Le2
            r2 = r30
            r3 = r31
            r4 = r20
            r5 = r22
            r24 = r6
            r6 = r0
            r25 = r7
            r7 = r8
            boolean r2 = r2.positionOverlapsAnotherControl(r3, r4, r5, r6, r7)
            if (r2 != 0) goto Le6
            r21 = r22
            r17 = r23
            goto Le6
        Le2:
            r24 = r6
            r25 = r7
        Le6:
            int r6 = r24 + 1
            r7 = r25
            goto Lb3
        Leb:
            r6 = r15
            r2 = r20
            r7 = r21
        Lf0:
            int r3 = r30.getChildCount()
            if (r6 >= r3) goto L206
            r5 = r30
            android.view.View r3 = r5.getChildAt(r6)
            r4 = r31
            if (r3 == r4) goto L1f3
            int r20 = r3.getVisibility()
            if (r20 == 0) goto L108
            goto L1f3
        L108:
            boolean r9 = r3 instanceof ca.dnamobile.javalauncher.controls.TouchControlButtonView
            if (r9 != 0) goto L10e
            goto L1f3
        L10e:
            int r9 = r3.getWidth()
            if (r9 <= 0) goto L1f3
            int r9 = r3.getHeight()
            if (r9 > 0) goto L11c
            goto L1f3
        L11c:
            float r9 = r3.getX()
            float r21 = r3.getY()
            int r14 = r3.getWidth()
            float r14 = (float) r14
            float r14 = r14 + r9
            int r1 = r3.getHeight()
            float r1 = (float) r1
            float r1 = r21 + r1
            int r15 = r3.getWidth()
            float r15 = (float) r15
            float r15 = r15 / r18
            float r15 = r15 + r9
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r3 = r3 / r18
            float r24 = r21 + r3
            float r3 = (float) r0
            float r25 = r9 - r3
            float r26 = r14 - r3
            float r3 = r3 / r18
            float r15 = r15 - r3
            r3 = 5
            r27 = r13
            float[] r13 = new float[r3]
            r28 = 0
            r13[r28] = r25
            r23 = 1
            r13[r23] = r14
            r14 = 2
            r13[r14] = r9
            r9 = 3
            r13[r9] = r26
            r9 = 4
            r13[r9] = r15
            r15 = r2
            r14 = 0
        L162:
            if (r14 >= r3) goto L1a4
            r2 = r13[r14]
            r3 = 0
            float r26 = clamp(r2, r3, r10)
            float r2 = r12 - r26
            float r28 = java.lang.Math.abs(r2)
            int r2 = (r28 > r16 ? 1 : (r28 == r16 ? 0 : -1))
            if (r2 > 0) goto L192
            int r2 = (r28 > r19 ? 1 : (r28 == r19 ? 0 : -1))
            if (r2 >= 0) goto L192
            r2 = r30
            r9 = 5
            r3 = r31
            r4 = r26
            r5 = r7
            r25 = r6
            r6 = r0
            r29 = r7
            r7 = r8
            boolean r2 = r2.positionOverlapsAnotherControl(r3, r4, r5, r6, r7)
            if (r2 != 0) goto L197
            r15 = r26
            r19 = r28
            goto L197
        L192:
            r25 = r6
            r29 = r7
            r9 = 5
        L197:
            int r14 = r14 + 1
            r5 = r30
            r4 = r31
            r3 = r9
            r6 = r25
            r7 = r29
            r9 = 4
            goto L162
        L1a4:
            r9 = r3
            r25 = r6
            r29 = r7
            float r2 = (float) r8
            float r3 = r21 - r2
            float r4 = r1 - r2
            float r2 = r2 / r18
            float r24 = r24 - r2
            float[] r13 = new float[r9]
            r2 = 0
            r13[r2] = r3
            r2 = 1
            r13[r2] = r1
            r1 = 2
            r13[r1] = r21
            r1 = 3
            r13[r1] = r4
            r2 = 4
            r13[r2] = r24
            r14 = 0
        L1c4:
            if (r14 >= r9) goto L1f1
            r2 = r13[r14]
            r3 = 0
            float r21 = clamp(r2, r3, r11)
            float r2 = r27 - r21
            float r22 = java.lang.Math.abs(r2)
            int r2 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r2 > 0) goto L1ee
            int r2 = (r22 > r17 ? 1 : (r22 == r17 ? 0 : -1))
            if (r2 >= 0) goto L1ee
            r2 = r30
            r3 = r31
            r4 = r15
            r5 = r21
            r6 = r0
            r7 = r8
            boolean r2 = r2.positionOverlapsAnotherControl(r3, r4, r5, r6, r7)
            if (r2 != 0) goto L1ee
            r29 = r21
            r17 = r22
        L1ee:
            int r14 = r14 + 1
            goto L1c4
        L1f1:
            r2 = r15
            goto L1fa
        L1f3:
            r25 = r6
            r29 = r7
            r27 = r13
            r1 = r14
        L1fa:
            r7 = r29
            int r6 = r25 + 1
            r14 = r1
            r13 = r27
            r1 = 1
            r9 = 0
            r15 = 0
            goto Lf0
        L206:
            r29 = r7
            r3 = r9
            float r0 = clamp(r2, r3, r10)
            float r1 = clamp(r7, r3, r11)
            r2 = 2
            float[] r2 = new float[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            return r2
    }

    private float resolveGameBufferHeight() {
            r2 = this;
            int r0 = org.lwjgl.glfw.CallbackBridge.windowHeight     // Catch: java.lang.Throwable -> L11
            r1 = 1
            if (r0 <= r1) goto L9
            int r0 = org.lwjgl.glfw.CallbackBridge.windowHeight     // Catch: java.lang.Throwable -> L11
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L11
            return r0
        L9:
            int r0 = org.lwjgl.glfw.CallbackBridge.physicalHeight     // Catch: java.lang.Throwable -> L11
            if (r0 <= r1) goto L11
            int r0 = org.lwjgl.glfw.CallbackBridge.physicalHeight     // Catch: java.lang.Throwable -> L11
            float r0 = (float) r0
            return r0
        L11:
            int r0 = r2.getHeight()
            float r0 = (float) r0
            return r0
    }

    private float resolveGameBufferWidth() {
            r2 = this;
            int r0 = org.lwjgl.glfw.CallbackBridge.windowWidth     // Catch: java.lang.Throwable -> L11
            r1 = 1
            if (r0 <= r1) goto L9
            int r0 = org.lwjgl.glfw.CallbackBridge.windowWidth     // Catch: java.lang.Throwable -> L11
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L11
            return r0
        L9:
            int r0 = org.lwjgl.glfw.CallbackBridge.physicalWidth     // Catch: java.lang.Throwable -> L11
            if (r0 <= r1) goto L11
            int r0 = org.lwjgl.glfw.CallbackBridge.physicalWidth     // Catch: java.lang.Throwable -> L11
            float r0 = (float) r0
            return r0
        L11:
            int r0 = r2.getWidth()
            float r0 = (float) r0
            return r0
    }

    private java.io.File resolveMinecraftOptionsFile() {
            r6 = this;
            java.io.File r0 = r6.minecraftOptionsFile
            if (r0 == 0) goto Ld
            boolean r0 = r0.isFile()
            if (r0 == 0) goto Ld
            java.io.File r0 = r6.minecraftOptionsFile
            return r0
        Ld:
            long r0 = android.os.SystemClock.uptimeMillis()
            java.io.File r2 = r6.cachedMinecraftOptionsFile
            if (r2 == 0) goto L28
            boolean r2 = r2.isFile()
            if (r2 == 0) goto L28
            long r2 = r6.lastMinecraftOptionsResolveAtMs
            long r2 = r0 - r2
            r4 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L28
            java.io.File r0 = r6.cachedMinecraftOptionsFile
            return r0
        L28:
            java.io.File r2 = r6.findBestMinecraftOptionsFile()
            r6.cachedMinecraftOptionsFile = r2
            r6.lastMinecraftOptionsResolveAtMs = r0
            return r2
    }

    private boolean routePointerDown(android.view.MotionEvent r9, int r10) {
            r8 = this;
            r0 = 0
            if (r10 < 0) goto L8c
            int r1 = r9.getPointerCount()
            if (r10 < r1) goto Lb
            goto L8c
        Lb:
            int r1 = r9.getPointerId(r10)
            float r2 = r9.getX(r10)
            float r3 = r9.getY(r10)
            boolean r4 = r8.updateMouseGrabState()
            r5 = 1
            if (r4 == 0) goto L28
            int r6 = r8.hotbarSlotForTouch(r2, r3)
            if (r6 < 0) goto L28
            r8.startHotbarPointer(r1, r6)
            return r5
        L28:
            ca.dnamobile.javalauncher.controls.TouchControlButtonView r6 = r8.findControlUnder(r2, r3)
            if (r6 == 0) goto L49
            android.util.SparseArray<ca.dnamobile.javalauncher.controls.TouchControlButtonView> r2 = r8.controlPointerTargets
            r2.put(r1, r6)
            r8.dispatchSinglePointerToControl(r9, r10, r0, r6)
            if (r4 == 0) goto L48
            r8.startSwipeGesturePointer(r1, r6)
            ca.dnamobile.javalauncher.controls.TouchControlData r0 = r6.getData()
            boolean r0 = r8.shouldUseMousePassThrough(r0)
            if (r0 == 0) goto L48
            r8.startMousePassThroughPointer(r9, r10, r1)
        L48:
            return r5
        L49:
            r6 = -1
            if (r4 == 0) goto L59
            int r0 = r8.cameraPointerId
            if (r0 != r6) goto L54
            r8.startCameraPointer(r9, r10, r1)
            return r5
        L54:
            boolean r9 = r8.hasActiveTouchRoute()
            return r9
        L59:
            if (r4 != 0) goto L72
            android.content.Context r4 = r8.getContext()
            boolean r4 = ca.dnamobile.javalauncher.controls.ControlsPreferences.isVirtualMouseEnabled(r4)
            if (r4 == 0) goto L72
            int r0 = r8.virtualMousePointerId
            if (r0 != r6) goto L6d
            r8.startVirtualMousePointer(r9, r10, r1)
            return r5
        L6d:
            boolean r9 = r8.hasActiveTouchRoute()
            return r9
        L72:
            int r4 = r8.passthroughPointerId
            if (r4 != r6) goto L8c
            android.view.View r4 = r8.passthroughTarget
            if (r4 == 0) goto L8c
            r8.passthroughPointerId = r1
            long r6 = r9.getEventTime()
            r8.passthroughDownTime = r6
            r8.passthroughDownX = r2
            r8.passthroughDownY = r3
            r8.passthroughMovedPastSlop = r0
            r8.dispatchSinglePointerToPassthrough(r9, r10, r0)
            return r5
        L8c:
            return r0
    }

    private void routePointerUp(android.view.MotionEvent r7, int r8, boolean r9) {
            r6 = this;
            if (r8 < 0) goto L57
            int r0 = r7.getPointerCount()
            if (r8 < r0) goto L9
            goto L57
        L9:
            int r0 = r7.getPointerId(r8)
            int r1 = r6.cameraPointerId
            r2 = 0
            if (r0 != r1) goto L15
            r6.finishCameraPointer(r7, r8, r2)
        L15:
            int r1 = r6.hotbarPointerId
            r3 = 1
            if (r0 != r1) goto L1d
            r6.finishHotbarPointer(r3)
        L1d:
            int r1 = r6.virtualMousePointerId
            if (r0 != r1) goto L24
            r6.finishVirtualMousePointer(r7, r8, r2)
        L24:
            r6.finishSwipeGesturePointer(r7, r8, r2)
            r6.finishMousePassThroughPointer(r7, r8, r2)
            int r1 = r6.passthroughPointerId
            if (r0 != r1) goto L3f
            r6.dispatchSinglePointerToPassthrough(r7, r8, r3)
            r1 = -1
            r6.passthroughPointerId = r1
            r4 = 0
            r6.passthroughDownTime = r4
            r1 = 0
            r6.passthroughDownX = r1
            r6.passthroughDownY = r1
            r6.passthroughMovedPastSlop = r2
        L3f:
            android.util.SparseArray<ca.dnamobile.javalauncher.controls.TouchControlButtonView> r1 = r6.controlPointerTargets
            java.lang.Object r1 = r1.get(r0)
            ca.dnamobile.javalauncher.controls.TouchControlButtonView r1 = (ca.dnamobile.javalauncher.controls.TouchControlButtonView) r1
            if (r1 == 0) goto L51
            r6.dispatchSinglePointerToControl(r7, r8, r3, r1)
            android.util.SparseArray<ca.dnamobile.javalauncher.controls.TouchControlButtonView> r7 = r6.controlPointerTargets
            r7.remove(r0)
        L51:
            if (r9 == 0) goto L56
            r6.clearRuntimeTouchRouting()
        L56:
            return
        L57:
            if (r9 == 0) goto L5c
            r6.clearRuntimeTouchRouting()
        L5c:
            return
    }

    private java.lang.String safeControlId(java.lang.String r2) {
            r1 = this;
            java.lang.String r2 = r2.trim()
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L12
            java.lang.String r0 = "null"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L1a
        L12:
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
        L1a:
            return r2
    }

    private static void scanInstancesDirectory(java.util.ArrayList<java.io.File> r5, java.io.File r6) {
            if (r6 == 0) goto L3b
            boolean r0 = r6.isDirectory()
            if (r0 != 0) goto L9
            goto L3b
        L9:
            java.io.File[] r6 = r6.listFiles()     // Catch: java.lang.Throwable -> Le
            goto Lf
        Le:
            r6 = 0
        Lf:
            if (r6 != 0) goto L12
            return
        L12:
            int r0 = r6.length
            r1 = 0
        L14:
            if (r1 >= r0) goto L3b
            r2 = r6[r1]
            if (r2 == 0) goto L38
            boolean r3 = r2.isDirectory()
            if (r3 != 0) goto L21
            goto L38
        L21:
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "game"
            r3.<init>(r2, r4)
            addOptionsCandidate(r5, r3)
            addOptionsCandidate(r5, r2)
            java.io.File r3 = new java.io.File
            java.lang.String r4 = ".minecraft"
            r3.<init>(r2, r4)
            addOptionsCandidate(r5, r3)
        L38:
            int r1 = r1 + 1
            goto L14
        L3b:
            return
    }

    private void scheduleCameraLongPressAttack() {
            r4 = this;
            r0 = 0
            r4.cancelCameraLongPressAttack(r0)
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda8 r0 = new ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda8
            r0.<init>(r4)
            r4.cameraLongPressRunnable = r0
            android.os.Handler r1 = r4.gestureHandler
            int r2 = android.view.ViewConfiguration.getLongPressTimeout()
            long r2 = (long) r2
            r1.postDelayed(r0, r2)
            return
    }

    private void schedulePointerIconReapply() {
            r3 = this;
            boolean r0 = r3.pointerIconReapplyPending
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r3.pointerIconReapplyPending = r0
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda0 r0 = new ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda0
            r0.<init>(r3)
            r1 = 90
            r3.postDelayed(r0, r1)
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda11 r0 = new ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda11
            r0.<init>(r3)
            r1 = 320(0x140, double:1.58E-321)
            r3.postDelayed(r0, r1)
            return
    }

    private void sendAbsoluteCursor(float r4, float r5) {
            r3 = this;
            r0 = 1
            org.lwjgl.glfw.CallbackBridge.setInputReady(r0)     // Catch: java.lang.Throwable -> L27
            int r1 = org.lwjgl.glfw.CallbackBridge.windowWidth     // Catch: java.lang.Throwable -> L27
            int r1 = java.lang.Math.max(r0, r1)     // Catch: java.lang.Throwable -> L27
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L27
            r2 = 0
            float r4 = clamp(r4, r2, r1)     // Catch: java.lang.Throwable -> L27
            org.lwjgl.glfw.CallbackBridge.mouseX = r4     // Catch: java.lang.Throwable -> L27
            int r4 = org.lwjgl.glfw.CallbackBridge.windowHeight     // Catch: java.lang.Throwable -> L27
            int r4 = java.lang.Math.max(r0, r4)     // Catch: java.lang.Throwable -> L27
            float r4 = (float) r4     // Catch: java.lang.Throwable -> L27
            float r4 = clamp(r5, r2, r4)     // Catch: java.lang.Throwable -> L27
            org.lwjgl.glfw.CallbackBridge.mouseY = r4     // Catch: java.lang.Throwable -> L27
            float r4 = org.lwjgl.glfw.CallbackBridge.mouseX     // Catch: java.lang.Throwable -> L27
            float r5 = org.lwjgl.glfw.CallbackBridge.mouseY     // Catch: java.lang.Throwable -> L27
            org.lwjgl.glfw.CallbackBridge.sendCursorPos(r4, r5)     // Catch: java.lang.Throwable -> L27
            goto L2f
        L27:
            r4 = move-exception
            java.lang.String r5 = "TouchControlsOverlay"
            java.lang.String r0 = "Unable to send virtual mouse cursor"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r5, r0, r4)
        L2f:
            return
    }

    private void sendKeyChord(java.util.List<java.lang.Integer> r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 1
            org.lwjgl.glfw.CallbackBridge.setInputReady(r2)     // Catch: java.lang.Throwable -> L60
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L60
        Le:
            boolean r3 = r6.hasNext()     // Catch: java.lang.Throwable -> L60
            if (r3 == 0) goto L42
            java.lang.Object r3 = r6.next()     // Catch: java.lang.Throwable -> L60
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L60
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L60
            boolean r4 = r5.isPlainGlfwKeyboardKey(r3)     // Catch: java.lang.Throwable -> L60
            if (r4 != 0) goto L25
            goto Le
        L25:
            r4 = 84
            if (r3 == r4) goto L2d
            r4 = 47
            if (r3 != r4) goto L30
        L2d:
            ca.dnamobile.javalauncher.controls.TouchKeyboardHelper.markChatKeyPressed()     // Catch: java.lang.Throwable -> L60
        L30:
            int r4 = org.lwjgl.glfw.CallbackBridge.getCurrentMods()     // Catch: java.lang.Throwable -> L60
            org.lwjgl.glfw.CallbackBridge.sendKeyPress(r3, r4, r2)     // Catch: java.lang.Throwable -> L60
            org.lwjgl.glfw.CallbackBridge.setModifiers(r3, r2)     // Catch: java.lang.Throwable -> L60
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L60
            r0.add(r3)     // Catch: java.lang.Throwable -> L60
            goto Le
        L42:
            int r6 = r0.size()     // Catch: java.lang.Throwable -> L60
            int r6 = r6 - r2
        L47:
            if (r6 < 0) goto L86
            java.lang.Object r3 = r0.get(r6)     // Catch: java.lang.Throwable -> L60
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L60
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L60
            int r4 = org.lwjgl.glfw.CallbackBridge.getCurrentMods()     // Catch: java.lang.Throwable -> L60
            org.lwjgl.glfw.CallbackBridge.sendKeyPress(r3, r4, r1)     // Catch: java.lang.Throwable -> L60
            org.lwjgl.glfw.CallbackBridge.setModifiers(r3, r1)     // Catch: java.lang.Throwable -> L60
            int r6 = r6 + (-1)
            goto L47
        L60:
            r6 = move-exception
            java.lang.String r3 = "TouchControlsOverlay"
            java.lang.String r4 = "Unable to send key keyboard chord"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r3, r4, r6)
            int r6 = r0.size()
            int r6 = r6 - r2
        L6d:
            if (r6 < 0) goto L86
            java.lang.Object r2 = r0.get(r6)     // Catch: java.lang.Throwable -> L83
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L83
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L83
            int r3 = org.lwjgl.glfw.CallbackBridge.getCurrentMods()     // Catch: java.lang.Throwable -> L83
            org.lwjgl.glfw.CallbackBridge.sendKeyPress(r2, r3, r1)     // Catch: java.lang.Throwable -> L83
            org.lwjgl.glfw.CallbackBridge.setModifiers(r2, r1)     // Catch: java.lang.Throwable -> L83
        L83:
            int r6 = r6 + (-1)
            goto L6d
        L86:
            return
    }

    private void sendKeySenderInput(int r4) {
            r3 = this;
            java.lang.String r0 = "Unable to send middle mouse from key keyboard"
            r1 = 0
            r2 = 1
            switch(r4) {
                case -10: goto L41;
                case -9: goto L3b;
                case -8: goto L35;
                case -7: goto L2f;
                case -6: goto L27;
                case -5: goto L23;
                case -4: goto L1c;
                case -3: goto L15;
                case -2: goto L11;
                case -1: goto Ld;
                default: goto L7;
            }
        L7:
            if (r4 <= 0) goto L49
            r3.sendKeyTap(r4)     // Catch: java.lang.Throwable -> L3f
            goto L49
        Ld:
            ca.dnamobile.javalauncher.controls.TouchKeyboardHelper.showKeyboard(r3)     // Catch: java.lang.Throwable -> L3f
            return
        L11:
            r3.toggleControlVisible()     // Catch: java.lang.Throwable -> L3f
            return
        L15:
            r3.sendLeftMouse(r2)     // Catch: java.lang.Throwable -> L3f
            r3.sendLeftMouse(r1)     // Catch: java.lang.Throwable -> L3f
            return
        L1c:
            r3.sendRightMouse(r2)     // Catch: java.lang.Throwable -> L3f
            r3.sendRightMouse(r1)     // Catch: java.lang.Throwable -> L3f
            return
        L23:
            r3.toggleVirtualMouseFromKeySender()     // Catch: java.lang.Throwable -> L3f
            return
        L27:
            r4 = 2
            r3.sendMouseButton(r4, r2, r0)     // Catch: java.lang.Throwable -> L3f
            r3.sendMouseButton(r4, r1, r0)     // Catch: java.lang.Throwable -> L3f
            return
        L2f:
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r3.sendScrollFromKeySender(r0)     // Catch: java.lang.Throwable -> L3f
            return
        L35:
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r3.sendScrollFromKeySender(r0)     // Catch: java.lang.Throwable -> L3f
            return
        L3b:
            r3.onMenuRequested()     // Catch: java.lang.Throwable -> L3f
            return
        L3f:
            r4 = move-exception
            goto L42
        L41:
            return
        L42:
            java.lang.String r0 = "TouchControlsOverlay"
            java.lang.String r1 = "Unable to send queued key keyboard input"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r1, r4)
        L49:
            return
    }

    private void sendKeyTap(int r3) {
            r2 = this;
            r0 = 1
            org.lwjgl.glfw.CallbackBridge.setInputReady(r0)     // Catch: java.lang.Throwable -> L25
            r1 = 84
            if (r3 == r1) goto Lc
            r1 = 47
            if (r3 != r1) goto Lf
        Lc:
            ca.dnamobile.javalauncher.controls.TouchKeyboardHelper.markChatKeyPressed()     // Catch: java.lang.Throwable -> L25
        Lf:
            int r1 = org.lwjgl.glfw.CallbackBridge.getCurrentMods()     // Catch: java.lang.Throwable -> L25
            org.lwjgl.glfw.CallbackBridge.sendKeyPress(r3, r1, r0)     // Catch: java.lang.Throwable -> L25
            org.lwjgl.glfw.CallbackBridge.setModifiers(r3, r0)     // Catch: java.lang.Throwable -> L25
            int r0 = org.lwjgl.glfw.CallbackBridge.getCurrentMods()     // Catch: java.lang.Throwable -> L25
            r1 = 0
            org.lwjgl.glfw.CallbackBridge.sendKeyPress(r3, r0, r1)     // Catch: java.lang.Throwable -> L25
            org.lwjgl.glfw.CallbackBridge.setModifiers(r3, r1)     // Catch: java.lang.Throwable -> L25
            goto L2d
        L25:
            r3 = move-exception
            java.lang.String r0 = "TouchControlsOverlay"
            java.lang.String r1 = "Unable to send key tap"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r1, r3)
        L2d:
            return
    }

    private void sendLeftMouse(boolean r3) {
            r2 = this;
            r0 = 0
            java.lang.String r1 = "Unable to send touch attack"
            r2.sendMouseButton(r0, r3, r1)
            return
    }

    private void sendMouseButton(int r2, boolean r3, java.lang.String r4) {
            r1 = this;
            r0 = 1
            org.lwjgl.glfw.CallbackBridge.setInputReady(r0)     // Catch: java.lang.Throwable -> L8
            org.lwjgl.glfw.CallbackBridge.sendMouseButton(r2, r3)     // Catch: java.lang.Throwable -> L8
            goto Le
        L8:
            r2 = move-exception
            java.lang.String r3 = "TouchControlsOverlay"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r3, r4, r2)
        Le:
            return
    }

    private void sendQueuedKeySenderInputs(java.util.List<java.lang.Integer> r4) {
            r3 = this;
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L15
            android.content.Context r4 = r3.getContext()
            java.lang.String r0 = "Pick at least one key first."
            r1 = 0
            android.widget.Toast r4 = android.widget.Toast.makeText(r4, r0, r1)
            r4.show()
            return
        L15:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4a
            r0.<init>()     // Catch: java.lang.Throwable -> L4a
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L4a
        L1e:
            boolean r1 = r4.hasNext()     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L43
            java.lang.Object r1 = r4.next()     // Catch: java.lang.Throwable -> L4a
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L4a
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L4a
            boolean r2 = r3.isPlainGlfwKeyboardKey(r1)     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L3c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L4a
            r0.add(r1)     // Catch: java.lang.Throwable -> L4a
            goto L1e
        L3c:
            r3.flushKeySenderChord(r0)     // Catch: java.lang.Throwable -> L4a
            r3.sendKeySenderInput(r1)     // Catch: java.lang.Throwable -> L4a
            goto L1e
        L43:
            r3.flushKeySenderChord(r0)     // Catch: java.lang.Throwable -> L4a
            r3.hideKeySenderKeyboard()
            return
        L4a:
            r4 = move-exception
            r3.hideKeySenderKeyboard()
            throw r4
    }

    private void sendRelativeCameraDelta(float r2, float r3) {
            r1 = this;
            r0 = 1
            org.lwjgl.glfw.CallbackBridge.setInputReady(r0)     // Catch: java.lang.Throwable -> L16
            float r0 = org.lwjgl.glfw.CallbackBridge.mouseX     // Catch: java.lang.Throwable -> L16
            float r0 = r0 + r2
            org.lwjgl.glfw.CallbackBridge.mouseX = r0     // Catch: java.lang.Throwable -> L16
            float r2 = org.lwjgl.glfw.CallbackBridge.mouseY     // Catch: java.lang.Throwable -> L16
            float r2 = r2 + r3
            org.lwjgl.glfw.CallbackBridge.mouseY = r2     // Catch: java.lang.Throwable -> L16
            float r2 = org.lwjgl.glfw.CallbackBridge.mouseX     // Catch: java.lang.Throwable -> L16
            float r3 = org.lwjgl.glfw.CallbackBridge.mouseY     // Catch: java.lang.Throwable -> L16
            org.lwjgl.glfw.CallbackBridge.sendCursorPos(r2, r3)     // Catch: java.lang.Throwable -> L16
            goto L1e
        L16:
            r2 = move-exception
            java.lang.String r3 = "TouchControlsOverlay"
            java.lang.String r0 = "Unable to send camera touch delta"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r3, r0, r2)
        L1e:
            return
    }

    private void sendRightMouse(boolean r3) {
            r2 = this;
            r0 = 1
            java.lang.String r1 = "Unable to send touch use/place"
            r2.sendMouseButton(r0, r3, r1)
            return
    }

    private void sendScrollFromKeySender(double r3) {
            r2 = this;
            r0 = 1
            org.lwjgl.glfw.CallbackBridge.setInputReady(r0)     // Catch: java.lang.Throwable -> La
            r0 = 0
            org.lwjgl.glfw.CallbackBridge.sendScroll(r0, r3)     // Catch: java.lang.Throwable -> La
            goto L12
        La:
            r3 = move-exception
            java.lang.String r4 = "TouchControlsOverlay"
            java.lang.String r0 = "Unable to send scroll from key keyboard"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r4, r0, r3)
        L12:
            return
    }

    private void sendVirtualMouseCursorPosition() {
            r3 = this;
            r3.ensureVirtualMouseCursorInBounds()     // Catch: java.lang.Throwable -> L17
            r0 = 1
            org.lwjgl.glfw.CallbackBridge.setInputReady(r0)     // Catch: java.lang.Throwable -> L17
            float r0 = r3.virtualCursorBridgeX     // Catch: java.lang.Throwable -> L17
            org.lwjgl.glfw.CallbackBridge.mouseX = r0     // Catch: java.lang.Throwable -> L17
            float r0 = r3.virtualCursorBridgeY     // Catch: java.lang.Throwable -> L17
            org.lwjgl.glfw.CallbackBridge.mouseY = r0     // Catch: java.lang.Throwable -> L17
            float r0 = org.lwjgl.glfw.CallbackBridge.mouseX     // Catch: java.lang.Throwable -> L17
            float r1 = org.lwjgl.glfw.CallbackBridge.mouseY     // Catch: java.lang.Throwable -> L17
            org.lwjgl.glfw.CallbackBridge.sendCursorPos(r0, r1)     // Catch: java.lang.Throwable -> L17
            goto L1f
        L17:
            r0 = move-exception
            java.lang.String r1 = "TouchControlsOverlay"
            java.lang.String r2 = "Unable to send virtual mouse cursor"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r2, r0)
        L1f:
            return
    }

    private void sendVirtualMouseDelta(float r3, float r4) {
            r2 = this;
            r2.ensureVirtualMouseCursorInBounds()     // Catch: java.lang.Throwable -> L33
            float r0 = r2.virtualCursorBridgeX     // Catch: java.lang.Throwable -> L33
            float r3 = r2.viewDeltaToBridgeX(r3)     // Catch: java.lang.Throwable -> L33
            float r0 = r0 + r3
            int r3 = org.lwjgl.glfw.CallbackBridge.windowWidth     // Catch: java.lang.Throwable -> L33
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L33
            float r3 = maxCursorCoordinate(r3)     // Catch: java.lang.Throwable -> L33
            r1 = 0
            float r3 = clamp(r0, r1, r3)     // Catch: java.lang.Throwable -> L33
            r2.virtualCursorBridgeX = r3     // Catch: java.lang.Throwable -> L33
            float r3 = r2.virtualCursorBridgeY     // Catch: java.lang.Throwable -> L33
            float r4 = r2.viewDeltaToBridgeY(r4)     // Catch: java.lang.Throwable -> L33
            float r3 = r3 + r4
            int r4 = org.lwjgl.glfw.CallbackBridge.windowHeight     // Catch: java.lang.Throwable -> L33
            float r4 = (float) r4     // Catch: java.lang.Throwable -> L33
            float r4 = maxCursorCoordinate(r4)     // Catch: java.lang.Throwable -> L33
            float r3 = clamp(r3, r1, r4)     // Catch: java.lang.Throwable -> L33
            r2.virtualCursorBridgeY = r3     // Catch: java.lang.Throwable -> L33
            r2.sendVirtualMouseCursorPosition()     // Catch: java.lang.Throwable -> L33
            r2.postInvalidateOnAnimation()     // Catch: java.lang.Throwable -> L33
            goto L3b
        L33:
            r3 = move-exception
            java.lang.String r4 = "TouchControlsOverlay"
            java.lang.String r0 = "Unable to move virtual mouse cursor"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r4, r0, r3)
        L3b:
            return
    }

    private void setEditDialogPreviewAlpha(android.app.AlertDialog r3, boolean r4) {
            r2 = this;
            if (r3 == 0) goto L2c
            android.view.Window r0 = r3.getWindow()
            if (r0 != 0) goto L9
            goto L2c
        L9:
            android.view.Window r0 = r3.getWindow()
            if (r4 == 0) goto L13
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            goto L16
        L13:
            r1 = 1050924810(0x3ea3d70a, float:0.32)
        L16:
            r0.setDimAmount(r1)
            android.view.Window r3 = r3.getWindow()
            android.view.View r3 = r3.getDecorView()
            if (r4 == 0) goto L27
            r4 = 1039516303(0x3df5c28f, float:0.12)
            goto L29
        L27:
            r4 = 1065353216(0x3f800000, float:1.0)
        L29:
            r3.setAlpha(r4)
        L2c:
            return
    }

    private void setMousePassThroughEnabled(ca.dnamobile.javalauncher.controls.TouchControlData r2, boolean r3) {
            r1 = this;
            writeMousePassThroughDataFlag(r2, r3)
            android.content.SharedPreferences r0 = r1.mousePassThroughPrefs()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r2 = mousePassThroughPreferenceKey(r2)
            if (r3 == 0) goto L16
            r3 = 1
            r0.putBoolean(r2, r3)
            goto L19
        L16:
            r0.remove(r2)
        L19:
            r0.apply()
            return
    }

    private void setSliderProgress(android.widget.SeekBar r2, int r3) {
            r1 = this;
            int r0 = r2.getMax()
            int r3 = java.lang.Math.min(r0, r3)
            r0 = 0
            int r3 = java.lang.Math.max(r0, r3)
            int r0 = r2.getProgress()
            if (r0 == r3) goto L16
            r2.setProgress(r3)
        L16:
            return
    }

    private void setSwipeGestureEnabled(ca.dnamobile.javalauncher.controls.TouchControlData r2, boolean r3) {
            r1 = this;
            writeSwipeGestureDataFlag(r2, r3)
            android.content.SharedPreferences r0 = r1.swipeGesturePrefs()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r2 = swipeGesturePreferenceKey(r2)
            if (r3 == 0) goto L16
            r3 = 1
            r0.putBoolean(r2, r3)
            goto L19
        L16:
            r0.remove(r2)
        L19:
            r0.apply()
            return
    }

    private void setTextFromSlider(android.widget.EditText r1, android.widget.SeekBar r2) {
            r0 = this;
            int r2 = r2.getProgress()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.setText(r2)
            return
    }

    private boolean shouldCreateControlButton(ca.dnamobile.javalauncher.controls.TouchControlData r2) {
            r1 = this;
            boolean r0 = r2.visibleInGame
            if (r0 != 0) goto L17
            boolean r0 = r2.visibleInMenu
            if (r0 != 0) goto L17
            boolean r0 = r2.visibleWhenControlsHidden
            if (r0 != 0) goto L17
            java.lang.String r2 = r2.action
            boolean r2 = ca.dnamobile.javalauncher.controls.TouchControlData.shouldStayVisibleWhenControlsHiddenByDefault(r2)
            if (r2 == 0) goto L15
            goto L17
        L15:
            r2 = 0
            goto L18
        L17:
            r2 = 1
        L18:
            return r2
    }

    private boolean shouldDrawLauncherVirtualCursor() {
            r3 = this;
            boolean r0 = r3.editMode
            r1 = 0
            if (r0 == 0) goto L9
            r3.applyAndroidPointerIconPolicy(r1)
            return r1
        L9:
            android.content.Context r0 = r3.getContext()
            boolean r0 = ca.dnamobile.javalauncher.controls.ControlsPreferences.isVirtualMouseEnabled(r0)
            boolean r2 = r3.updateMouseGrabState()
            r3.updateVirtualMousePreferenceState(r0, r2)
            if (r0 == 0) goto L1d
            if (r2 != 0) goto L1d
            r1 = 1
        L1d:
            r3.applyAndroidPointerIconPolicy(r1)
            return r1
    }

    private boolean shouldShowControlButton(ca.dnamobile.javalauncher.controls.TouchControlData r2) {
            r1 = this;
            boolean r0 = isMouseGrabbed()
            boolean r2 = r1.shouldShowControlButton(r2, r0)
            return r2
    }

    private boolean shouldShowControlButton(ca.dnamobile.javalauncher.controls.TouchControlData r3, boolean r4) {
            r2 = this;
            boolean r0 = r2.editMode
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            if (r4 == 0) goto Lb
            boolean r4 = r3.visibleInGame
            goto Ld
        Lb:
            boolean r4 = r3.visibleInMenu
        Ld:
            r0 = 0
            if (r4 != 0) goto L11
            return r0
        L11:
            boolean r4 = r2.controlsVisible
            if (r4 == 0) goto L16
            return r1
        L16:
            boolean r4 = r3.visibleWhenControlsHidden
            if (r4 != 0) goto L24
            java.lang.String r3 = r3.action
            boolean r3 = ca.dnamobile.javalauncher.controls.TouchControlData.shouldStayVisibleWhenControlsHiddenByDefault(r3)
            if (r3 == 0) goto L23
            goto L24
        L23:
            r1 = r0
        L24:
            return r1
    }

    private boolean shouldUseLauncherVirtualCursorNoPolicy() {
            r1 = this;
            boolean r0 = r1.editMode
            if (r0 != 0) goto L16
            android.content.Context r0 = r1.getContext()
            boolean r0 = ca.dnamobile.javalauncher.controls.ControlsPreferences.isVirtualMouseEnabled(r0)
            if (r0 == 0) goto L16
            boolean r0 = r1.updateMouseGrabState()
            if (r0 != 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    private boolean shouldUseMousePassThrough(ca.dnamobile.javalauncher.controls.TouchControlData r2) {
            r1 = this;
            boolean r0 = r1.isMousePassThroughEnabled(r2)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            java.lang.String r0 = "joystick"
            java.lang.String r2 = r2.action
            boolean r2 = r0.equals(r2)
            r2 = r2 ^ 1
            return r2
    }

    private boolean shouldUseSwipeGesture(ca.dnamobile.javalauncher.controls.TouchControlData r2) {
            r1 = this;
            boolean r0 = r1.isSwipeGestureEnabled(r2)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            java.lang.String r0 = "joystick"
            java.lang.String r2 = r2.action
            boolean r2 = r0.equals(r2)
            r2 = r2 ^ 1
            return r2
    }

    private void showEditDialog(ca.dnamobile.javalauncher.controls.TouchControlButtonView r112, ca.dnamobile.javalauncher.controls.TouchControlData r113) {
            r111 = this;
            r15 = r111
            r0 = r113
            android.content.Context r14 = r111.getContext()
            java.lang.String r13 = r0.id
            java.lang.String r12 = r0.label
            java.lang.String r11 = r0.action
            int r10 = r0.keyCode
            int[] r1 = r113.normalizedKeyCodes()
            java.lang.Object r1 = r1.clone()
            r76 = r1
            int[] r76 = (int[]) r76
            int[] r1 = r113.normalizedKeySlots()
            java.lang.Object r1 = r1.clone()
            r77 = r1
            int[] r77 = (int[]) r77
            int r9 = r0.mouseButton
            int r8 = r0.scrollY
            float r7 = r0.x
            float r6 = r0.y
            float r5 = r0.width
            float r4 = r0.height
            float r3 = r0.sizePercent
            java.lang.String r38 = r111.snapshotLayoutSafely()
            float r2 = r0.opacity
            float r1 = r0.cornerRadius
            r16 = r13
            float r13 = r0.strokeWidth
            r20 = r13
            int r13 = r0.strokeColor
            r21 = r13
            int r13 = r0.backgroundColor
            r22 = r13
            boolean r13 = r0.toggle
            r23 = r13
            boolean r13 = r0.visibleInGame
            r24 = r13
            boolean r13 = r0.visibleInMenu
            r25 = r13
            boolean r13 = r0.visibleWhenControlsHidden
            r26 = r13
            java.lang.String r13 = r0.rawX
            r27 = r13
            java.lang.String r13 = r0.rawY
            r17 = r1
            int r1 = r111.getWidth()
            float r1 = (float) r1
            r18 = r2
            int r2 = r111.getHeight()
            float r2 = (float) r2
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$LayoutMetrics r1 = r15.layoutMetrics(r1, r2)
            float r2 = r1.maxLayoutXUnits()
            int r2 = java.lang.Math.round(r2)
            r28 = r13
            r13 = 1
            int r2 = java.lang.Math.max(r13, r2)
            float r19 = r1.maxLayoutYUnits()
            r29 = r2
            int r2 = java.lang.Math.round(r19)
            int r2 = java.lang.Math.max(r13, r2)
            java.lang.String r13 = r0.rawX
            if (r13 != 0) goto L9a
            float r13 = r0.x
            r19 = r2
            goto La9
        L9a:
            float r13 = r112.getX()
            r19 = r2
            int r2 = r112.getWidth()
            float r2 = (float) r2
            float r13 = r1.fromScreenX(r0, r13, r2)
        La9:
            java.lang.String r2 = r0.rawY
            if (r2 != 0) goto Lb0
            float r1 = r0.y
            goto Lb8
        Lb0:
            float r2 = r112.getY()
            float r1 = r1.fromScreenY(r2)
        Lb8:
            r31 = r1
            android.widget.ScrollView r2 = new android.widget.ScrollView
            r2.<init>(r14)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r14)
            r32 = r3
            r3 = 1
            r1.setOrientation(r3)
            r3 = 1099956224(0x41900000, float:18.0)
            int r3 = r15.dp(r3)
            r33 = r4
            r4 = 1090519040(0x41000000, float:8.0)
            int r4 = r15.dp(r4)
            r34 = r5
            r5 = 1092616192(0x41200000, float:10.0)
            r35 = r6
            int r6 = r15.dp(r5)
            r1.setPadding(r3, r4, r3, r6)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r6 = -1
            r4 = -2
            r3.<init>(r6, r4)
            r2.addView(r1, r3)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r14)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Editing: "
            r4.<init>(r6)
            java.lang.String r6 = r0.label
            if (r6 == 0) goto L113
            java.lang.String r6 = r0.label
            java.lang.String r6 = r6.trim()
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L10c
            goto L113
        L10c:
            java.lang.String r6 = r0.label
            java.lang.String r6 = r6.trim()
            goto L115
        L113:
            java.lang.String r6 = "Button"
        L115:
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.setText(r4)
            r6 = -2039584(0xffffffffffe0e0e0, float:NaN)
            r3.setTextColor(r6)
            r4 = 1097859072(0x41700000, float:15.0)
            r3.setTextSize(r4)
            int r4 = r15.dp(r5)
            r5 = 0
            r3.setPadding(r5, r5, r5, r4)
            r1.addView(r3)
            java.lang.String r4 = "Identity"
            java.lang.String r6 = "Set the display name, action, ID, and optional key combo."
            r15.addSectionHeader(r1, r4, r6)
            java.lang.String r4 = "Button label"
            java.lang.String r6 = r0.label
            android.widget.EditText r6 = textField(r14, r4, r6, r5)
            java.lang.String r4 = "Label"
            r15.addFieldRow(r1, r4, r6)
            java.lang.String r4 = "Stable button ID"
            r40 = r2
            java.lang.String r2 = r0.id
            android.widget.EditText r4 = textField(r14, r4, r2, r5)
            java.lang.String r2 = "Button ID"
            r15.addFieldRow(r1, r2, r4)
            java.lang.String[] r2 = ca.dnamobile.javalauncher.controls.TouchInputBinding.actionLabels()
            java.lang.String[] r44 = ca.dnamobile.javalauncher.controls.TouchInputBinding.actionValues()
            android.widget.Spinner r5 = new android.widget.Spinner
            r5.<init>(r14)
            r42 = r3
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r43 = r9
            r9 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r14, r9, r2)
            r2 = 17367049(0x1090009, float:2.516295E-38)
            r3.setDropDownViewResource(r2)
            r5.setAdapter(r3)
            java.lang.String r3 = r0.action
            int r3 = ca.dnamobile.javalauncher.controls.TouchInputBinding.actionIndex(r3)
            r5.setSelection(r3)
            java.lang.String r3 = "Action"
            r15.addSpinnerRow(r1, r3, r5)
            android.widget.Spinner r3 = new android.widget.Spinner
            r3.<init>(r14)
            java.lang.String r2 = "Binding"
            r15.addSpinnerRow(r1, r2, r3)
            r2 = 1
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option[][] r9 = new ca.dnamobile.javalauncher.controls.TouchInputBinding.Option[r2][]
            int[] r2 = r113.normalizedKeySlots()
            java.lang.String r2 = r15.joinKeyCodes(r2)
            r47 = r3
            java.lang.String r3 = "Internal key slots"
            r48 = r4
            r4 = 0
            android.widget.EditText r3 = textField(r14, r3, r2, r4)
            r2 = 8
            r3.setVisibility(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r49 = r6
            r6 = -1
            r2.<init>(r6, r4)
            r1.addView(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Bound buttons: "
            r2.<init>(r4)
            int[] r4 = r113.normalizedKeyCodes()
            java.lang.String r4 = ca.dnamobile.javalauncher.controls.TouchInputBinding.friendlyKeyCombo(r4)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            android.widget.TextView r4 = r15.valueLabel(r14, r2)
            r1.addView(r4)
            java.lang.String r2 = "Set up to 4 button positions. Each position can be a keyboard key, mouse click, or wheel action and can be changed or cleared without touching the others."
            android.widget.TextView r2 = r15.valueLabel(r14, r2)
            r1.addView(r2)
            java.lang.String r37 = "key"
            r52 = r12
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option[] r12 = ca.dnamobile.javalauncher.controls.TouchInputBinding.optionsForAction(r37)
            r37 = r10
            r10 = 4
            android.widget.Spinner[] r0 = new android.widget.Spinner[r10]
            r50 = r11
            android.widget.LinearLayout[] r11 = new android.widget.LinearLayout[r10]
            r51 = r13
            int[] r13 = r113.normalizedKeySlots()
            r53 = r9
            r9 = 0
        L1fa:
            if (r9 >= r10) goto L35f
            android.widget.LinearLayout r10 = new android.widget.LinearLayout
            r10.<init>(r14)
            r6 = 0
            r10.setOrientation(r6)
            r6 = 16
            r10.setGravity(r6)
            r6 = 1073741824(0x40000000, float:2.0)
            r56 = r1
            int r1 = r15.dp(r6)
            int r6 = r15.dp(r6)
            r57 = r2
            r2 = 0
            r10.setPadding(r2, r1, r2, r6)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r14)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "Position "
            r2.<init>(r6)
            java.lang.StringBuilder r2 = r2.append(r9)
            java.lang.String r2 = r2.toString()
            r1.setText(r2)
            r6 = -2039584(0xffffffffffe0e0e0, float:NaN)
            r1.setTextColor(r6)
            r2 = 1095761920(0x41500000, float:13.0)
            r1.setTextSize(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r6 = 1061158912(0x3f400000, float:0.75)
            r58 = r3
            r59 = r4
            r3 = -2
            r4 = 0
            r2.<init>(r4, r3, r6)
            r10.addView(r1, r2)
            android.widget.Spinner r6 = new android.widget.Spinner
            r6.<init>(r14)
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            java.lang.String[] r2 = ca.dnamobile.javalauncher.controls.TouchInputBinding.optionLabels(r12)
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r14, r4, r2)
            r2 = 17367049(0x1090009, float:2.516295E-38)
            r1.setDropDownViewResource(r2)
            r6.setAdapter(r1)
            int r1 = r13.length
            if (r9 >= r1) goto L26e
            r1 = r13[r9]
            goto L26f
        L26e:
            r1 = 0
        L26f:
            int r1 = ca.dnamobile.javalauncher.controls.TouchInputBinding.selectedKeyOptionIndex(r1)
            r3 = 0
            r6.setSelection(r1, r3)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = 1066611507(0x3f933333, float:1.15)
            r4 = -2
            r1.<init>(r3, r4, r2)
            r10.addView(r6, r1)
            android.widget.Button r2 = new android.widget.Button
            r2.<init>(r14)
            java.lang.String r1 = "Pick"
            r2.setText(r1)
            r2.setAllCaps(r3)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r36 = r5
            r5 = 1057803469(0x3f0ccccd, float:0.55)
            r1.<init>(r3, r4, r5)
            r10.addView(r2, r1)
            android.widget.Button r5 = new android.widget.Button
            r5.<init>(r14)
            java.lang.String r1 = "Clear"
            r5.setText(r1)
            r5.setAllCaps(r3)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r41 = r2
            r2 = 1058642330(0x3f19999a, float:0.6)
            r1.<init>(r3, r4, r2)
            r10.addView(r5, r1)
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda16 r2 = new ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda16
            r86 = r17
            r17 = r13
            r13 = r56
            r1 = r2
            r85 = r18
            r97 = r19
            r96 = r29
            r98 = r40
            r15 = r41
            r18 = r57
            r29 = 17367049(0x1090009, float:2.516295E-38)
            r19 = r11
            r11 = r2
            r2 = r111
            r40 = r3
            r84 = r32
            r32 = r42
            r57 = r47
            r3 = r14
            r42 = r14
            r83 = r33
            r33 = r59
            r41 = 17367048(0x1090008, float:2.5162948E-38)
            r14 = r4
            r59 = r48
            r4 = r9
            r14 = r5
            r82 = r34
            r99 = r36
            r5 = r0
            r34 = r10
            r81 = r35
            r55 = r49
            r13 = -1
            r10 = r6
            r6 = r58
            r80 = r7
            r7 = r33
            r79 = r8
            r8 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r15.setOnClickListener(r11)
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda21 r8 = new ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda21
            r1 = r8
            r3 = r0
            r5 = r58
            r6 = r33
            r7 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r14.setOnClickListener(r8)
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$1 r7 = new ca.dnamobile.javalauncher.controls.TouchControlsOverlay$1
            r1 = r7
            r3 = r58
            r4 = r33
            r5 = r0
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r10.setOnItemSelectedListener(r7)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = -2
            r1.<init>(r13, r2)
            r2 = r34
            r14 = r56
            r14.addView(r2, r1)
            r0[r9] = r10
            r19[r9] = r2
            int r9 = r9 + 1
            r15 = r111
            r6 = r13
            r1 = r14
            r13 = r17
            r2 = r18
            r11 = r19
            r14 = r42
            r8 = r79
            r7 = r80
            r34 = r82
            r33 = r83
            r18 = r85
            r17 = r86
            r29 = r96
            r19 = r97
            r40 = r98
            r5 = r99
            r10 = 4
            r42 = r32
            r32 = r84
            goto L1fa
        L35f:
            r9 = r4
            r99 = r5
            r13 = r6
            r80 = r7
            r79 = r8
            r86 = r17
            r85 = r18
            r97 = r19
            r96 = r29
            r84 = r32
            r83 = r33
            r82 = r34
            r81 = r35
            r98 = r40
            r32 = r42
            r57 = r47
            r59 = r48
            r55 = r49
            r18 = r2
            r8 = r3
            r19 = r11
            r42 = r14
            r14 = r1
            r15.updateKeySlotSummary(r8, r9, r0, r12)
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$2 r11 = new ca.dnamobile.javalauncher.controls.TouchControlsOverlay$2
            r1 = r11
            r2 = r111
            r3 = r44
            r4 = r53
            r5 = r42
            r6 = r57
            r7 = r113
            r78 = r43
            r75 = r37
            r10 = r18
            r13 = r11
            r74 = r50
            r11 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r11 = r99
            r11.setOnItemSelectedListener(r13)
            int r48 = r11.getSelectedItemPosition()
            r49 = 0
            r45 = r13
            r46 = r11
            r47 = r11
            r45.onItemSelected(r46, r47, r48, r49)
            java.lang.String r1 = "Position"
            java.lang.String r2 = "X/Y use the same layout units as Width/Height."
            r15.addSectionHeader(r14, r1, r2)
            int r1 = java.lang.Math.round(r51)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "X position"
            r13 = r42
            r3 = 1
            android.widget.EditText r10 = textField(r13, r2, r1, r3)
            java.lang.String r1 = "X"
            r15.addFieldRow(r14, r1, r10)
            int r1 = java.lang.Math.round(r51)
            r2 = r96
            android.widget.SeekBar r9 = r15.addSlider(r14, r2, r1)
            int r1 = java.lang.Math.round(r31)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Y position"
            android.widget.EditText r8 = textField(r13, r2, r1, r3)
            java.lang.String r1 = "Y"
            r15.addFieldRow(r14, r1, r8)
            int r1 = java.lang.Math.round(r31)
            r2 = r97
            android.widget.SeekBar r7 = r15.addSlider(r14, r2, r1)
            java.lang.String r1 = "Size"
            java.lang.String r2 = "Resize both dimensions together or tune width and height separately."
            r15.addSectionHeader(r14, r1, r2)
            r47 = r0
            r0 = r113
            float r1 = r0.width
            int r1 = java.lang.Math.round(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Width"
            r3 = 1
            android.widget.EditText r6 = textField(r13, r2, r1, r3)
            r15.addFieldRow(r14, r2, r6)
            float r1 = r0.width
            int r1 = java.lang.Math.round(r1)
            r2 = 400(0x190, float:5.6E-43)
            android.widget.SeekBar r5 = r15.addSlider(r14, r2, r1)
            float r1 = r0.height
            int r1 = java.lang.Math.round(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r4 = "Height"
            android.widget.EditText r1 = textField(r13, r4, r1, r3)
            r15.addFieldRow(r14, r4, r1)
            float r3 = r0.height
            int r3 = java.lang.Math.round(r3)
            android.widget.SeekBar r4 = r15.addSlider(r14, r2, r3)
            float r2 = r0.sizePercent
            r3 = 1106247680(0x41f00000, float:30.0)
            r29 = r1
            r1 = 1132068864(0x437a0000, float:250.0)
            float r1 = clamp(r2, r3, r1)
            int r1 = java.lang.Math.round(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Button size: "
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r3 = "%"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.widget.TextView r3 = r15.valueLabel(r13, r2)
            r14.addView(r3)
            r2 = 250(0xfa, float:3.5E-43)
            android.widget.SeekBar r2 = r15.addSlider(r14, r2, r1)
            r31 = r2
            java.lang.String r2 = "Appearance"
            r33 = r3
            java.lang.String r3 = "Adjust opacity, rounded corners, and stroke width."
            r15.addSectionHeader(r14, r2, r3)
            float r2 = r0.opacity
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "Opacity 0.0 - 1.0"
            r34 = r12
            r12 = 0
            android.widget.EditText r3 = textField(r13, r3, r2, r12)
            java.lang.String r2 = "Opacity"
            r15.addFieldRow(r14, r2, r3)
            float r2 = r0.opacity
            r12 = 0
            r35 = r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = clamp(r2, r12, r3)
            r12 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 * r12
            int r2 = java.lang.Math.round(r2)
            r3 = 100
            android.widget.SeekBar r2 = r15.addSlider(r14, r3, r2)
            float r12 = r0.cornerRadius
            int r12 = java.lang.Math.round(r12)
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r3 = "Corner radius"
            r41 = r2
            r2 = 1
            android.widget.EditText r12 = textField(r13, r3, r12, r2)
            r15.addFieldRow(r14, r3, r12)
            float r3 = r0.cornerRadius
            int r3 = java.lang.Math.round(r3)
            r2 = 100
            android.widget.SeekBar r3 = r15.addSlider(r14, r2, r3)
            float r2 = r0.strokeWidth
            int r2 = java.lang.Math.round(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r42 = r3
            java.lang.String r3 = "Stroke width"
            r43 = r4
            r4 = 1
            android.widget.EditText r3 = textField(r13, r3, r2, r4)
            java.lang.String r2 = "Stroke"
            r15.addFieldRow(r14, r2, r3)
            float r2 = r0.strokeWidth
            int r2 = java.lang.Math.round(r2)
            r4 = 20
            android.widget.SeekBar r4 = r15.addSlider(r14, r4, r2)
            int r2 = r0.strokeColor
            java.lang.String r2 = formatColor(r2)
            r45 = r3
            java.lang.String r3 = "#AARRGGBB or #RRGGBB"
            r46 = r4
            r4 = 0
            android.widget.EditText r3 = textField(r13, r3, r2, r4)
            java.lang.String r2 = "Border colour"
            r15.addFieldRow(r14, r2, r3)
            android.widget.CheckBox r4 = new android.widget.CheckBox
            r4.<init>(r13)
            java.lang.String r2 = "Toggle button"
            r4.setText(r2)
            r2 = -2039584(0xffffffffffe0e0e0, float:NaN)
            r4.setTextColor(r2)
            boolean r2 = r0.toggle
            r4.setChecked(r2)
            r14.addView(r4)
            android.widget.CheckBox r2 = new android.widget.CheckBox
            r2.<init>(r13)
            r48 = r3
            java.lang.String r3 = "Visible in game"
            r2.setText(r3)
            r3 = -2039584(0xffffffffffe0e0e0, float:NaN)
            r2.setTextColor(r3)
            boolean r3 = r0.visibleInGame
            r2.setChecked(r3)
            r14.addView(r2)
            android.widget.CheckBox r3 = new android.widget.CheckBox
            r3.<init>(r13)
            r49 = r2
            java.lang.String r2 = "Visible in menu"
            r3.setText(r2)
            r2 = -2039584(0xffffffffffe0e0e0, float:NaN)
            r3.setTextColor(r2)
            boolean r2 = r0.visibleInMenu
            r3.setChecked(r2)
            r14.addView(r3)
            android.widget.CheckBox r2 = new android.widget.CheckBox
            r2.<init>(r13)
            r54 = r3
            java.lang.String r3 = "Stay visible when touch controls are hidden"
            r2.setText(r3)
            r3 = -2039584(0xffffffffffe0e0e0, float:NaN)
            r2.setTextColor(r3)
            boolean r3 = r0.visibleWhenControlsHidden
            if (r3 != 0) goto L57d
            java.lang.String r3 = r0.action
            boolean r3 = ca.dnamobile.javalauncher.controls.TouchControlData.shouldStayVisibleWhenControlsHiddenByDefault(r3)
            if (r3 == 0) goto L57b
            goto L57d
        L57b:
            r3 = 0
            goto L57e
        L57d:
            r3 = 1
        L57e:
            r2.setChecked(r3)
            r14.addView(r2)
            android.widget.CheckBox r3 = new android.widget.CheckBox
            r50 = r3
            r3.<init>(r13)
            r58 = r2
            java.lang.String r2 = "Mouse pass through"
            r3.setText(r2)
            r2 = -2039584(0xffffffffffe0e0e0, float:NaN)
            r3.setTextColor(r2)
            boolean r2 = r15.isMousePassThroughEnabled(r0)
            r3.setChecked(r2)
            r14.addView(r3)
            java.lang.String r2 = "When enabled, dragging on this button also moves the in-game camera while the button stays pressed. Useful for Jump, Sneak, Sprint, or Use."
            android.widget.TextView r2 = r15.valueLabel(r13, r2)
            r14.addView(r2)
            android.widget.CheckBox r2 = new android.widget.CheckBox
            r51 = r2
            r2.<init>(r13)
            java.lang.String r3 = "Swipeable gesture"
            r2.setText(r3)
            r3 = -2039584(0xffffffffffe0e0e0, float:NaN)
            r2.setTextColor(r3)
            boolean r3 = r15.isSwipeGestureEnabled(r0)
            r2.setChecked(r3)
            r14.addView(r2)
            java.lang.String r2 = "When enabled, sliding a finger from another held control onto this button presses it until the finger leaves. Useful for W + A/D strafing layouts."
            android.widget.TextView r2 = r15.valueLabel(r13, r2)
            r14.addView(r2)
            android.widget.CheckBox r2 = new android.widget.CheckBox
            r2.<init>(r13)
            java.lang.String r3 = "Show virtual cursor"
            r2.setText(r3)
            r3 = -2039584(0xffffffffffe0e0e0, float:NaN)
            r2.setTextColor(r3)
            boolean r3 = ca.dnamobile.javalauncher.controls.ControlsPreferences.isVirtualMouseEnabled(r13)
            r2.setChecked(r3)
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda22 r3 = new ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda22
            r3.<init>(r15, r13)
            r2.setOnCheckedChangeListener(r3)
            r14.addView(r2)
            android.widget.Button r3 = new android.widget.Button
            r3.<init>(r13)
            java.lang.String r2 = "Copy button"
            r3.setText(r2)
            r2 = 0
            r3.setAllCaps(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r60 = r4
            r36 = r5
            r4 = -1
            r5 = -2
            r2.<init>(r4, r5)
            r14.addView(r3, r2)
            r14 = 1
            boolean[] r5 = new boolean[r14]
            r17 = r5
            r2 = 0
            r5[r2] = r2
            boolean[] r4 = new boolean[r14]
            r19 = r4
            r4[r2] = r2
            boolean[] r2 = new boolean[r14]
            r69 = r2
            r65 = r2
            r30 = 0
            r2[r30] = r30
            r37 = r2
            boolean[] r2 = new boolean[r14]
            r70 = r2
            r39 = r2
            r2[r30] = r30
            android.app.AlertDialog[] r2 = new android.app.AlertDialog[r14]
            float r1 = (float) r1
            float[] r15 = new float[r14]
            r56 = r15
            r15[r30] = r1
            float r14 = r0.width
            r40 = 1120403456(0x42c80000, float:100.0)
            float r14 = r14 * r40
            r62 = r2
            r2 = 1065353216(0x3f800000, float:1.0)
            float r18 = java.lang.Math.max(r2, r1)
            float r14 = r14 / r18
            r2 = 1103101952(0x41c00000, float:24.0)
            float r63 = java.lang.Math.max(r2, r14)
            float r14 = r0.height
            float r14 = r14 * r40
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = java.lang.Math.max(r2, r1)
            float r14 = r14 / r1
            r1 = 1103101952(0x41c00000, float:24.0)
            float r40 = java.lang.Math.max(r1, r14)
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda1 r64 = new ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda1
            r18 = r64
            r14 = r29
            r1 = r64
            r29 = r30
            r66 = r58
            r0 = r62
            r62 = r49
            r49 = r37
            r37 = r31
            r2 = r111
            r102 = r3
            r58 = r35
            r67 = r45
            r71 = r48
            r72 = r54
            r35 = r33
            r3 = r113
            r45 = r43
            r73 = r60
            r43 = r0
            r0 = r4
            r4 = r55
            r48 = r36
            r36 = r5
            r5 = r10
            r54 = r6
            r6 = r8
            r60 = r7
            r7 = r54
            r93 = r8
            r8 = r14
            r68 = r9
            r9 = r58
            r94 = r10
            r10 = r12
            r95 = r11
            r11 = r67
            r97 = r12
            r96 = r52
            r52 = r34
            r12 = r71
            r99 = r16
            r100 = r20
            r101 = r21
            r103 = r22
            r104 = r23
            r105 = r24
            r106 = r25
            r107 = r26
            r108 = r27
            r109 = r28
            r16 = r13
            r13 = r32
            r61 = r14
            r110 = r16
            r14 = r112
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$3 r1 = new ca.dnamobile.javalauncher.controls.TouchControlsOverlay$3
            r13 = r111
            r3 = r15
            r15 = r1
            r16 = r111
            r20 = r68
            r21 = r94
            r22 = r113
            r23 = r60
            r24 = r93
            r25 = r48
            r26 = r54
            r27 = r45
            r28 = r61
            r29 = r41
            r30 = r58
            r31 = r42
            r32 = r97
            r33 = r46
            r34 = r67
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r14 = r55
            r14.addTextChangedListener(r1)
            r15 = r94
            r15.addTextChangedListener(r1)
            r12 = r93
            r12.addTextChangedListener(r1)
            r11 = r54
            r11.addTextChangedListener(r1)
            r10 = r61
            r10.addTextChangedListener(r1)
            r9.addTextChangedListener(r1)
            r8 = r97
            r8.addTextChangedListener(r1)
            r7 = r67
            r7.addTextChangedListener(r1)
            r6 = r71
            r6.addTextChangedListener(r1)
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda2 r1 = new ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda2
            r2 = r68
            r1.<init>(r13, r0, r15, r2)
            r5 = r43
            r13.addPreviewSliderListener(r2, r5, r1)
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda3 r1 = new ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda3
            r2 = r60
            r1.<init>(r13, r0, r12, r2)
            r13.addPreviewSliderListener(r2, r5, r1)
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda4 r1 = new ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda4
            r2 = r48
            r1.<init>(r13, r0, r11, r2)
            r13.addPreviewSliderListener(r2, r5, r1)
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda5 r1 = new ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda5
            r2 = r45
            r1.<init>(r13, r0, r10, r2)
            r13.addPreviewSliderListener(r2, r5, r1)
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda6 r1 = new ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda6
            r87 = r1
            r88 = r0
            r89 = r36
            r90 = r9
            r91 = r41
            r92 = r64
            r87.<init>(r88, r89, r90, r91, r92)
            r2 = r41
            r13.addPreviewSliderListener(r2, r5, r1)
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda7 r1 = new ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda7
            r2 = r42
            r1.<init>(r13, r0, r8, r2)
            r13.addPreviewSliderListener(r2, r5, r1)
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda17 r1 = new ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda17
            r2 = r46
            r1.<init>(r13, r0, r7, r2)
            r13.addPreviewSliderListener(r2, r5, r1)
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$4 r0 = new ca.dnamobile.javalauncher.controls.TouchControlsOverlay$4
            r1 = r0
            r2 = r111
            r4 = r113
            r16 = r5
            r5 = r35
            r17 = r6
            r6 = r36
            r18 = r7
            r7 = r11
            r19 = r8
            r8 = r63
            r20 = r9
            r9 = r10
            r21 = r10
            r10 = r40
            r22 = r11
            r11 = r64
            r23 = r12
            r12 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = r37
            r1.setOnSeekBarChangeListener(r0)
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r8 = r110
            r0.<init>(r8)
            java.lang.String r1 = "Edit touch button"
            android.app.AlertDialog$Builder r0 = r0.setTitle(r1)
            r1 = r98
            android.app.AlertDialog$Builder r0 = r0.setView(r1)
            r1 = 17039360(0x1040000, float:2.424457E-38)
            r2 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            java.lang.String r1 = "Delete"
            android.app.AlertDialog$Builder r0 = r0.setNeutralButton(r1, r2)
            r1 = 17039370(0x104000a, float:2.42446E-38)
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)
            android.app.AlertDialog r9 = r0.create()
            r68 = r9
            r37 = r9
            r10 = 0
            r16[r10] = r9
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda18 r0 = new ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda18
            r1 = r0
            r2 = r111
            r3 = r38
            r5 = r49
            r6 = r8
            r7 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r1 = r102
            r1.setOnClickListener(r0)
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda19 r0 = new ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda19
            r35 = r0
            r36 = r111
            r40 = r113
            r41 = r96
            r42 = r14
            r43 = r95
            r45 = r53
            r46 = r57
            r48 = r52
            r49 = r59
            r52 = r15
            r53 = r23
            r54 = r22
            r55 = r21
            r57 = r20
            r58 = r19
            r59 = r18
            r60 = r17
            r61 = r73
            r63 = r72
            r64 = r66
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65)
            r9.setOnShowListener(r0)
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda20 r0 = new ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda20
            r66 = r0
            r67 = r111
            r71 = r113
            r72 = r99
            r73 = r96
            r87 = r100
            r88 = r101
            r89 = r103
            r90 = r104
            r91 = r105
            r92 = r106
            r93 = r107
            r94 = r108
            r95 = r109
            r66.<init>(r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95)
            r9.setOnDismissListener(r0)
            boolean r0 = r111.isAttachedToWindow()     // Catch: java.lang.Throwable -> L84b
            if (r0 != 0) goto L847
            return
        L847:
            r9.show()     // Catch: java.lang.Throwable -> L84b
            goto L860
        L84b:
            r0 = move-exception
            java.lang.String r1 = "TouchControlsOverlay"
            java.lang.String r2 = "Unable to show touch control editor"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r2, r0)
            r13.setEditDialogPreviewAlpha(r9, r10)
            java.lang.String r0 = "Unable to open touch editor."
            r1 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r8, r0, r1)
            r0.show()
        L860:
            return
    }

    private void showKeySenderKeyboard() {
            r1 = this;
            boolean r0 = r1.editMode
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.keySenderKeyboardVisible = r0
            r1.attachKeySenderKeyboardView()
            return
    }

    private void showKeyboardKeyPickerDialog(android.content.Context r9, int r10, android.widget.Spinner r11, android.widget.EditText r12, android.widget.TextView r13, android.widget.Spinner[] r14, ca.dnamobile.javalauncher.controls.TouchInputBinding.Option[] r15) {
            r8 = this;
            if (r11 != 0) goto L3
            return
        L3:
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda14 r7 = new ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda14
            r0 = r7
            r1 = r8
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog.showPicker(r9, r10, r7)
            return
    }

    private java.lang.String snapshotLayout() throws java.lang.Exception {
            r1 = this;
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r0 = r1.layoutData
            org.json.JSONObject r0 = r0.toJson()
            java.lang.String r0 = r0.toString()
            return r0
    }

    private java.lang.String snapshotLayoutSafely() {
            r3 = this;
            java.lang.String r0 = r3.snapshotLayout()     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = move-exception
            java.lang.String r1 = "TouchControlsOverlay"
            java.lang.String r2 = "Unable to snapshot touch layout"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r2, r0)
            r0 = 0
            return r0
    }

    private void startCameraPointer(android.view.MotionEvent r2, int r3, int r4) {
            r1 = this;
            if (r3 < 0) goto L2f
            int r0 = r2.getPointerCount()
            if (r3 < r0) goto L9
            goto L2f
        L9:
            r1.cameraPointerId = r4
            float r4 = r2.getX(r3)
            r1.cameraDownX = r4
            float r2 = r2.getY(r3)
            r1.cameraDownY = r2
            float r3 = r1.cameraDownX
            r1.cameraLastX = r3
            r1.cameraLastY = r2
            r2 = 0
            r1.cameraMovedPastSlop = r2
            r1.cameraLongPressAttackActive = r2
            android.content.Context r2 = r1.getContext()
            boolean r2 = ca.dnamobile.javalauncher.controls.ControlsPreferences.isMinecraftTouchGesturesEnabled(r2)
            if (r2 == 0) goto L2f
            r1.scheduleCameraLongPressAttack()
        L2f:
            return
    }

    private void startHotbarPointer(int r1, int r2) {
            r0 = this;
            r0.hotbarPointerId = r1
            r0.hotbarLastSlot = r2
            r1 = 0
            r0.hotbarDoubleTapConsumed = r1
            boolean r1 = r0.isHotbarDoubleTap(r2)
            int r2 = r2 + 49
            r0.sendKeyTap(r2)
            if (r1 == 0) goto L1d
            r1 = 1
            r0.hotbarDoubleTapConsumed = r1
            r0.clearLastHotbarTap()
            r1 = 70
            r0.sendKeyTap(r1)
        L1d:
            return
    }

    private void startMousePassThroughPointer(android.view.MotionEvent r3, int r4, int r5) {
            r2 = this;
            if (r4 < 0) goto L1b
            int r0 = r3.getPointerCount()
            if (r4 < r0) goto L9
            goto L1b
        L9:
            float r0 = r3.getX(r4)
            float r3 = r3.getY(r4)
            android.util.SparseArray<ca.dnamobile.javalauncher.controls.TouchControlsOverlay$MousePassThroughState> r4 = r2.mousePassThroughPointers
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$MousePassThroughState r1 = new ca.dnamobile.javalauncher.controls.TouchControlsOverlay$MousePassThroughState
            r1.<init>(r0, r3)
            r4.put(r5, r1)
        L1b:
            return
    }

    private void startSwipeGesturePointer(int r3, ca.dnamobile.javalauncher.controls.TouchControlButtonView r4) {
            r2 = this;
            android.util.SparseArray<ca.dnamobile.javalauncher.controls.TouchControlsOverlay$SwipeGestureState> r0 = r2.swipeGesturePointers
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$SwipeGestureState r1 = new ca.dnamobile.javalauncher.controls.TouchControlsOverlay$SwipeGestureState
            r1.<init>(r4)
            r0.put(r3, r1)
            return
    }

    private void startVirtualMousePointer(android.view.MotionEvent r2, int r3, int r4) {
            r1 = this;
            if (r3 < 0) goto L29
            int r0 = r2.getPointerCount()
            if (r3 < r0) goto L9
            goto L29
        L9:
            r1.virtualMousePointerId = r4
            float r4 = r2.getX(r3)
            r1.virtualMouseDownX = r4
            float r2 = r2.getY(r3)
            r1.virtualMouseDownY = r2
            float r3 = r1.virtualMouseDownX
            r1.virtualMouseLastX = r3
            r1.virtualMouseLastY = r2
            r2 = 0
            r1.virtualMouseMovedPastSlop = r2
            r1.ensureVirtualMouseCursorInBounds()
            r1.sendVirtualMouseCursorPosition()
            r1.postInvalidateOnAnimation()
        L29:
            return
    }

    private void styleDialogWindow(android.app.AlertDialog r2) {
            r1 = this;
            android.view.Window r0 = r2.getWindow()
            if (r0 != 0) goto L7
            return
        L7:
            android.view.Window r2 = r2.getWindow()
            android.graphics.drawable.GradientDrawable r0 = r1.makeDialogBackground()
            r2.setBackgroundDrawable(r0)
            return
    }

    private static java.lang.String swipeGesturePreferenceKey(ca.dnamobile.javalauncher.controls.TouchControlData r2) {
            java.lang.String r0 = r2.id
            if (r0 != 0) goto L7
            java.lang.String r0 = ""
            goto Ld
        L7:
            java.lang.String r0 = r2.id
            java.lang.String r0 = r0.trim()
        Ld:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L1b
            java.lang.String r1 = "null"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L29
        L1b:
            java.lang.String r0 = r2.label
            if (r0 != 0) goto L22
            java.lang.String r2 = "button"
            goto L28
        L22:
            java.lang.String r2 = r2.label
            java.lang.String r2 = r2.trim()
        L28:
            r0 = r2
        L29:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r1 = "button."
            r2.<init>(r1)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
    }

    private android.content.SharedPreferences swipeGesturePrefs() {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            java.lang.String r1 = "touch_control_swipe_gesture"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            return r0
    }

    private static android.widget.EditText textField(android.content.Context r1, java.lang.String r2, java.lang.String r3, boolean r4) {
            android.widget.EditText r0 = new android.widget.EditText
            r0.<init>(r1)
            r0.setHint(r2)
            r1 = 1
            r0.setSingleLine(r1)
            r0.setText(r3)
            if (r4 == 0) goto L16
            r1 = 12290(0x3002, float:1.7222E-41)
            r0.setInputType(r1)
        L16:
            return r0
    }

    private void toggleVirtualMouseFromKeySender() {
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
            r3.postInvalidateOnAnimation()
            return
    }

    private void updateKeySlotSummary(android.widget.EditText r6, android.widget.TextView r7, android.widget.Spinner[] r8, ca.dnamobile.javalauncher.controls.TouchInputBinding.Option[] r9) {
            r5 = this;
            int[] r8 = r5.readKeySlotsFromSpinners(r8, r9)
            java.lang.String r9 = r5.joinKeyCodes(r8)
            r6.setText(r9)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r0 = 0
            r1 = r0
        L17:
            int r2 = r8.length
            if (r1 >= r2) goto L45
            r2 = r8[r1]
            if (r2 != 0) goto L1f
            goto L42
        L1f:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r6.add(r3)
            int r3 = r9.length()
            if (r3 <= 0) goto L31
            java.lang.String r3 = "  •  "
            r9.append(r3)
        L31:
            java.lang.StringBuilder r3 = r9.append(r1)
            java.lang.String r4 = ": "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r2 = ca.dnamobile.javalauncher.controls.TouchInputBinding.labelForKeyCode(r2)
            r3.append(r2)
        L42:
            int r1 = r1 + 1
            goto L17
        L45:
            int r8 = r6.size()
            int[] r8 = new int[r8]
        L4b:
            int r1 = r6.size()
            if (r0 >= r1) goto L60
            java.lang.Object r1 = r6.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r8[r0] = r1
            int r0 = r0 + 1
            goto L4b
        L60:
            int r6 = r9.length()
            if (r6 != 0) goto L69
            java.lang.String r6 = "Bound buttons: No bindings"
            goto L86
        L69:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Bound buttons: "
            r6.<init>(r0)
            java.lang.String r8 = ca.dnamobile.javalauncher.controls.TouchInputBinding.friendlyKeyCombo(r8)
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r8 = "\nSlots: "
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.StringBuilder r6 = r6.append(r9)
            java.lang.String r6 = r6.toString()
        L86:
            r7.setText(r6)
            return
    }

    private boolean updateMouseGrabState() {
            r2 = this;
            boolean r0 = isMouseGrabbed()
            boolean r1 = r2.lastKnownMouseGrabbed
            if (r0 == r1) goto L2a
            r2.lastKnownMouseGrabbed = r0
            if (r0 != 0) goto L1b
            android.content.Context r1 = r2.getContext()
            boolean r1 = ca.dnamobile.javalauncher.controls.ControlsPreferences.isVirtualMouseEnabled(r1)
            if (r1 == 0) goto L1b
            r1 = 1
            r2.resetVirtualMouseCursorToCenter(r1)
            goto L24
        L1b:
            if (r0 == 0) goto L24
            r2.cancelVirtualMousePointer()
            r1 = 0
            r2.applyAndroidPointerIconPolicy(r1)
        L24:
            r2.applyControlsVisualStateForGrabState(r0)
            r2.postInvalidateOnAnimation()
        L2a:
            return r0
    }

    private void updatePassthroughMoveState(android.view.MotionEvent r3, int r4) {
            r2 = this;
            if (r4 < 0) goto L25
            int r0 = r3.getPointerCount()
            if (r4 < r0) goto L9
            goto L25
        L9:
            float r0 = r3.getX(r4)
            float r1 = r2.passthroughDownX
            float r0 = r0 - r1
            float r3 = r3.getY(r4)
            float r4 = r2.passthroughDownY
            float r3 = r3 - r4
            float r0 = r0 * r0
            float r3 = r3 * r3
            float r0 = r0 + r3
            int r3 = r2.cameraTouchSlop
            int r3 = r3 * r3
            float r3 = (float) r3
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 <= 0) goto L25
            r3 = 1
            r2.passthroughMovedPastSlop = r3
        L25:
            return
    }

    private void updateVirtualMousePreferenceState(boolean r2, boolean r3) {
            r1 = this;
            boolean r0 = r1.lastVirtualMousePreference
            if (r2 != r0) goto L5
            return
        L5:
            r1.lastVirtualMousePreference = r2
            r0 = 0
            if (r2 == 0) goto L14
            if (r3 != 0) goto L11
            r2 = 1
            r1.resetVirtualMouseCursorToCenter(r2)
            goto L19
        L11:
            r1.virtualCursorInitialized = r0
            goto L19
        L14:
            r1.virtualCursorInitialized = r0
            r1.applyAndroidPointerIconPolicy(r0)
        L19:
            return
    }

    private android.widget.TextView valueLabel(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r3)
            r0.setText(r4)
            r3 = -2039584(0xffffffffffe0e0e0, float:NaN)
            r0.setTextColor(r3)
            r3 = 1095761920(0x41500000, float:13.0)
            r0.setTextSize(r3)
            r3 = 1082130432(0x40800000, float:4.0)
            int r3 = r2.dp(r3)
            r4 = 1073741824(0x40000000, float:2.0)
            int r4 = r2.dp(r4)
            r1 = 0
            r0.setPadding(r1, r3, r1, r4)
            return r0
    }

    private float viewDeltaToBridgeX(float r5) {
            r4 = this;
            int r0 = org.lwjgl.glfw.CallbackBridge.windowWidth
            float r0 = (float) r0
            float r0 = maxCursorCoordinate(r0)
            int r1 = r4.getWidth()
            float r1 = (float) r1
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r2
            r2 = 0
            float r1 = java.lang.Math.max(r2, r1)
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 <= 0) goto L1f
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 > 0) goto L1d
            goto L1f
        L1d:
            float r5 = r5 * r0
            float r5 = r5 / r1
        L1f:
            return r5
    }

    private float viewDeltaToBridgeY(float r5) {
            r4 = this;
            int r0 = org.lwjgl.glfw.CallbackBridge.windowHeight
            float r0 = (float) r0
            float r0 = maxCursorCoordinate(r0)
            int r1 = r4.getHeight()
            float r1 = (float) r1
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r2
            r2 = 0
            float r1 = java.lang.Math.max(r2, r1)
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 <= 0) goto L1f
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 > 0) goto L1d
            goto L1f
        L1d:
            float r5 = r5 * r0
            float r5 = r5 / r1
        L1f:
            return r5
    }

    private static void writeMousePassThroughDataFlag(ca.dnamobile.javalauncher.controls.TouchControlData r2, boolean r3) {
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r1 = "mousePassThrough"
            java.lang.reflect.Field r0 = r0.getField(r1)     // Catch: java.lang.Throwable -> Ld
            r0.setBoolean(r2, r3)     // Catch: java.lang.Throwable -> Ld
        Ld:
            return
    }

    private static void writeSwipeGestureDataFlag(ca.dnamobile.javalauncher.controls.TouchControlData r2, boolean r3) {
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r1 = "swipeGesture"
            java.lang.reflect.Field r0 = r0.getField(r1)     // Catch: java.lang.Throwable -> Ld
            r0.setBoolean(r2, r3)     // Catch: java.lang.Throwable -> Ld
        Ld:
            return
    }

    public void addControl(ca.dnamobile.javalauncher.controls.TouchControlData r2) {
            r1 = this;
            r1.pushUndoSnapshot()
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r0 = r1.layoutData
            java.util.List<ca.dnamobile.javalauncher.controls.TouchControlData> r0 = r0.controls
            r0.add(r2)
            r1.saveLayout()
            r1.rebuildWhenSized()
            return
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent r2) {
            r1 = this;
            boolean r0 = r1.editMode
            if (r0 != 0) goto L1b
            boolean r0 = isHardwarePointerEvent(r2)
            if (r0 == 0) goto L1b
            boolean r0 = r1.dispatchWholeGenericEventToPassthrough(r2)
            if (r0 != 0) goto L19
            boolean r2 = super.dispatchGenericMotionEvent(r2)
            if (r2 == 0) goto L17
            goto L19
        L17:
            r2 = 0
            goto L1a
        L19:
            r2 = 1
        L1a:
            return r2
        L1b:
            boolean r2 = super.dispatchGenericMotionEvent(r2)
            return r2
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent r4) {
            r3 = this;
            boolean r0 = r3.editMode
            r1 = 4
            r2 = 1
            if (r0 != 0) goto L1a
            boolean r0 = r3.keySenderKeyboardVisible
            if (r0 == 0) goto L1a
            int r0 = r4.getKeyCode()
            if (r0 != r1) goto L1a
            int r4 = r4.getAction()
            if (r4 != r2) goto L19
            r3.hideKeySenderKeyboard()
        L19:
            return r2
        L1a:
            boolean r0 = r3.editMode
            if (r0 != 0) goto L54
            int r0 = r4.getKeyCode()
            if (r0 != r1) goto L54
            boolean r0 = net.kdt.pojavlaunch.MinecraftGLSurface.shouldRouteBackKeyToMinecraft(r4)
            if (r0 == 0) goto L42
            net.kdt.pojavlaunch.MinecraftGLSurface r0 = r3.findMinecraftSurfaceTarget()
            if (r0 == 0) goto L37
            boolean r0 = r0.handleKeyEventFromActivity(r4)
            if (r0 == 0) goto L37
            return r2
        L37:
            android.view.View r0 = r3.passthroughTarget
            if (r0 == 0) goto L42
            boolean r0 = r0.dispatchKeyEvent(r4)
            if (r0 == 0) goto L42
            return r2
        L42:
            int r0 = r4.getAction()
            if (r0 != r2) goto L4f
            boolean r0 = r3.openLauncherInGameDialogFromBack()
            if (r0 == 0) goto L54
            return r2
        L4f:
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$AppMenuListener r0 = r3.appMenuListener
            if (r0 == 0) goto L54
            return r2
        L54:
            boolean r0 = r3.editMode
            if (r0 != 0) goto L76
            boolean r0 = net.kdt.pojavlaunch.MinecraftGLSurface.shouldRouteBackKeyToMinecraft(r4)
            if (r0 == 0) goto L76
            net.kdt.pojavlaunch.MinecraftGLSurface r0 = r3.findMinecraftSurfaceTarget()
            if (r0 == 0) goto L6b
            boolean r0 = r0.handleKeyEventFromActivity(r4)
            if (r0 == 0) goto L6b
            return r2
        L6b:
            android.view.View r0 = r3.passthroughTarget
            if (r0 == 0) goto L76
            boolean r0 = r0.dispatchKeyEvent(r4)
            if (r0 == 0) goto L76
            return r2
        L76:
            boolean r4 = super.dispatchKeyEvent(r4)
            return r4
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent r7) {
            r6 = this;
            boolean r0 = r6.editMode
            if (r0 == 0) goto L9
            boolean r7 = super.dispatchTouchEvent(r7)
            return r7
        L9:
            boolean r0 = r6.dispatchKeySenderKeyboardTouch(r7)
            r1 = 1
            if (r0 == 0) goto L11
            return r1
        L11:
            boolean r0 = isHardwarePointerEvent(r7)
            r2 = 0
            if (r0 == 0) goto L27
            boolean r0 = r6.dispatchWholeTouchEventToPassthrough(r7)
            if (r0 != 0) goto L26
            boolean r7 = super.dispatchTouchEvent(r7)
            if (r7 == 0) goto L25
            goto L26
        L25:
            r1 = r2
        L26:
            return r1
        L27:
            int r0 = r7.getActionMasked()
            int r3 = r7.getActionIndex()
            android.content.Context r4 = r6.getContext()
            boolean r4 = ca.dnamobile.javalauncher.controls.ControlsPreferences.isHotbarHitboxDebugEnabled(r4)
            if (r4 == 0) goto L3c
            r6.invalidate()
        L3c:
            if (r0 == 0) goto L8c
            if (r0 == r1) goto L88
            r4 = 2
            if (r0 == r4) goto L72
            r5 = 3
            if (r0 == r5) goto L5c
            r5 = 5
            if (r0 == r5) goto L54
            r5 = 6
            if (r0 == r5) goto L50
            r6.dispatchActivePassthroughPointer(r7, r4)
            return r1
        L50:
            r6.routePointerUp(r7, r3, r2)
            return r1
        L54:
            r6.routePointerDown(r7, r3)
            boolean r7 = r6.hasActiveTouchRoute()
            return r7
        L5c:
            r6.dispatchCancelToControlPointers(r7)
            r6.cancelAllSwipeGesturePointers(r7)
            r6.cancelAllMousePassThroughPointers()
            r6.cancelCameraPointer(r1)
            r6.cancelVirtualMousePointer()
            r6.dispatchActivePassthroughPointer(r7, r5)
            r6.clearRuntimeTouchRouting()
            return r1
        L72:
            r6.dispatchActiveControlPointers(r7, r4)
            r6.dispatchActiveSwipeGesturePointers(r7)
            r6.dispatchActiveMousePassThroughPointers(r7)
            r6.dispatchActiveHotbarPointer(r7)
            r6.dispatchActiveCameraPointer(r7)
            r6.dispatchActiveVirtualMousePointer(r7)
            r6.dispatchActivePassthroughPointer(r7, r4)
            return r1
        L88:
            r6.routePointerUp(r7, r3, r1)
            return r1
        L8c:
            r6.clearRuntimeTouchRouting()
            boolean r7 = r6.routePointerDown(r7, r3)
            return r7
    }

    public ca.dnamobile.javalauncher.controls.TouchControlsLayoutData getLayoutData() {
            r1 = this;
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r0 = r1.layoutData
            return r0
    }

    public boolean isEditMode() {
            r1 = this;
            boolean r0 = r1.editMode
            return r0
    }

    public void loadLayout(java.io.File r2) {
            r1 = this;
            r1.layoutFile = r2
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r0 = ca.dnamobile.javalauncher.controls.TouchControlsStore.loadLayout(r2)
            r1.layoutData = r0
            android.content.Context r0 = r1.getContext()
            java.lang.String r2 = r2.getAbsolutePath()
            ca.dnamobile.javalauncher.controls.ControlsPreferences.setSelectedLayoutPath(r0, r2)
            r1.clearEditHistory()
            r1.rebuildWhenSized()
            return
    }

    public void loadSelectedLayout() {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            java.io.File r0 = ca.dnamobile.javalauncher.controls.TouchControlsStore.getSelectedLayoutFile(r0)
            r1.layoutFile = r0
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r0 = ca.dnamobile.javalauncher.controls.TouchControlsStore.loadLayout(r0)
            r1.layoutData = r0
            r1.clearEditHistory()
            r1.rebuildWhenSized()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            r1.rebuildWhenSized()
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda15 r0 = new ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda15
            r0.<init>(r1)
            r1.post(r0)
            return
    }

    @Override // ca.dnamobile.javalauncher.controls.TouchControlButtonView.Listener
    public void onChanged() {
            r0 = this;
            r0.saveLayout()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r2 = this;
            r2.hideKeySenderKeyboard()
            r2.clearRuntimeTouchRouting()
            r0 = 0
            r1 = 1
            r2.applyAndroidPointerIconPolicy(r0, r1)
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r1) {
            r0 = this;
            super.onDraw(r1)
            r0.drawVirtualMouseCursor(r1)
            r0.drawHotbarHitboxDebug(r1)
            return
    }

    @Override // ca.dnamobile.javalauncher.controls.TouchControlButtonView.Listener
    public void onEditRequested(ca.dnamobile.javalauncher.controls.TouchControlButtonView r2, ca.dnamobile.javalauncher.controls.TouchControlData r3) {
            r1 = this;
            boolean r0 = r1.isAttachedToWindow()
            if (r0 != 0) goto L7
            return
        L7:
            r1.showEditDialog(r2, r3)
            return
    }

    @Override // ca.dnamobile.javalauncher.controls.TouchControlButtonView.Listener
    public void onKeySenderKeyboardRequested() {
            r0 = this;
            r0.showKeySenderKeyboard()
            return
    }

    @Override // ca.dnamobile.javalauncher.controls.TouchControlButtonView.Listener
    public void onMenuRequested() {
            r1 = this;
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$AppMenuListener r0 = r1.appMenuListener
            if (r0 == 0) goto L7
            r0.onTouchControlsMenuRequested()
        L7:
            return
    }

    @Override // ca.dnamobile.javalauncher.controls.TouchControlButtonView.Listener
    public void onMoveRequested(ca.dnamobile.javalauncher.controls.TouchControlButtonView r4, ca.dnamobile.javalauncher.controls.TouchControlData r5, float r6, float r7) {
            r3 = this;
            float[] r6 = r3.resolveDraggedPosition(r4, r6, r7)
            int r7 = r3.getWidth()
            float r7 = (float) r7
            int r0 = r3.getHeight()
            float r0 = (float) r0
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$LayoutMetrics r7 = r3.layoutMetrics(r7, r0)
            r0 = 0
            r1 = r6[r0]
            int r2 = r4.getWidth()
            float r2 = (float) r2
            float r1 = r7.fromScreenX(r5, r1, r2)
            r5.x = r1
            r1 = 1
            r2 = r6[r1]
            float r7 = r7.fromScreenY(r2)
            r5.y = r7
            r7 = 0
            r5.rawX = r7
            r5.rawY = r7
            r5 = r6[r0]
            r4.setX(r5)
            r5 = r6[r1]
            r4.setY(r5)
            return
    }

    @Override // ca.dnamobile.javalauncher.controls.TouchControlButtonView.Listener
    public void onMoveStarted(ca.dnamobile.javalauncher.controls.TouchControlButtonView r1, ca.dnamobile.javalauncher.controls.TouchControlData r2) {
            r0 = this;
            r0.pushUndoSnapshot()
            return
    }

    @Override // ca.dnamobile.javalauncher.controls.TouchControlButtonView.Listener
    public void onResizeRequested(ca.dnamobile.javalauncher.controls.TouchControlButtonView r6, ca.dnamobile.javalauncher.controls.TouchControlData r7, float r8, float r9) {
            r5 = this;
            int r0 = r5.getWidth()
            r1 = 1
            if (r0 <= r1) goto Lce
            int r0 = r5.getHeight()
            if (r0 > r1) goto Lf
            goto Lce
        Lf:
            float r0 = r6.getX()
            float r1 = r6.getY()
            r2 = 1107296256(0x42000000, float:32.0)
            int r3 = r5.dp(r2)
            android.content.res.Resources r4 = r5.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r2
            int r2 = java.lang.Math.round(r4)
            int r2 = java.lang.Math.max(r3, r2)
            int r3 = r5.getWidth()
            float r3 = (float) r3
            float r3 = r3 - r0
            int r0 = java.lang.Math.round(r3)
            int r0 = java.lang.Math.max(r2, r0)
            int r3 = r5.getHeight()
            float r3 = (float) r3
            float r3 = r3 - r1
            int r1 = java.lang.Math.round(r3)
            int r1 = java.lang.Math.max(r2, r1)
            int r8 = java.lang.Math.round(r8)
            int r8 = java.lang.Math.min(r0, r8)
            int r8 = java.lang.Math.max(r2, r8)
            int r9 = java.lang.Math.round(r9)
            int r9 = java.lang.Math.min(r1, r9)
            int r9 = java.lang.Math.max(r2, r9)
            int r0 = r5.getWidth()
            float r0 = (float) r0
            int r1 = r5.getHeight()
            float r1 = (float) r1
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$LayoutMetrics r0 = r5.layoutMetrics(r0, r1)
            int r1 = r6.getWidth()
            float r1 = (float) r1
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = java.lang.Math.max(r2, r1)
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r2 = java.lang.Math.max(r2, r3)
            float r3 = (float) r8
            float r1 = r3 / r1
            float r4 = (float) r9
            float r2 = r4 / r2
            float r1 = java.lang.Math.min(r1, r2)
            float r2 = r0.fromScreenWidth(r3)
            r3 = 1103101952(0x41c00000, float:24.0)
            float r2 = java.lang.Math.max(r3, r2)
            r7.width = r2
            float r0 = r0.fromScreenHeight(r4)
            float r0 = java.lang.Math.max(r3, r0)
            r7.height = r0
            float r0 = r7.sizePercent
            float r0 = r0 * r1
            r1 = 1106247680(0x41f00000, float:30.0)
            r2 = 1132068864(0x437a0000, float:250.0)
            float r0 = clamp(r0, r1, r2)
            r7.sizePercent = r0
            r0 = 0
            r7.rawX = r0
            r7.rawY = r0
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            if (r7 == 0) goto Lc5
            r7.width = r8
            r7.height = r9
            r6.setLayoutParams(r7)
        Lc5:
            r6.refreshVisualState()
            r6.requestLayout()
            r6.invalidate()
        Lce:
            return
    }

    @Override // ca.dnamobile.javalauncher.controls.TouchControlButtonView.Listener
    public void onResizeStarted(ca.dnamobile.javalauncher.controls.TouchControlButtonView r1, ca.dnamobile.javalauncher.controls.TouchControlData r2) {
            r0 = this;
            r0.pushUndoSnapshot()
            return
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            if (r1 != r3) goto L7
            if (r2 == r4) goto La
        L7:
            r0.rebuildWhenSized()
        La:
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda10 r1 = new ca.dnamobile.javalauncher.controls.TouchControlsOverlay$$ExternalSyntheticLambda10
            r1.<init>(r0)
            r0.post(r1)
            return
    }

    @Override // ca.dnamobile.javalauncher.controls.TouchControlButtonView.Listener
    public void onToggleControlsRequested() {
            r0 = this;
            r0.toggleControlVisible()
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            boolean r0 = r1.editMode
            if (r0 == 0) goto Lc
            boolean r2 = super.onTouchEvent(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    public boolean openLauncherInGameDialogFromBack() {
            r1 = this;
            boolean r0 = r1.editMode
            if (r0 != 0) goto L16
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$AppMenuListener r0 = r1.appMenuListener
            if (r0 != 0) goto L9
            goto L16
        L9:
            r1.hideKeySenderKeyboard()
            r1.cancelRuntimeTouchRoutingForLauncherDialog()
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay$AppMenuListener r0 = r1.appMenuListener
            r0.onTouchControlsMenuRequested()
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    public boolean redoLastChange() {
            r4 = this;
            java.util.ArrayDeque<java.lang.String> r0 = r4.redoHistory
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            java.lang.String r0 = r4.snapshotLayout()     // Catch: java.lang.Throwable -> L2e
            java.util.ArrayDeque<java.lang.String> r2 = r4.redoHistory     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r2 = r2.removeLast()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L2e
            java.util.ArrayDeque<java.lang.String> r3 = r4.undoHistory     // Catch: java.lang.Throwable -> L2e
            r4.pushBounded(r3, r0)     // Catch: java.lang.Throwable -> L2e
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2e
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L2e
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r0 = ca.dnamobile.javalauncher.controls.TouchControlsLayoutData.fromJson(r0)     // Catch: java.lang.Throwable -> L2e
            r4.layoutData = r0     // Catch: java.lang.Throwable -> L2e
            r4.saveLayout()     // Catch: java.lang.Throwable -> L2e
            r4.rebuildWhenSized()     // Catch: java.lang.Throwable -> L2e
            r0 = 1
            return r0
        L2e:
            r0 = move-exception
            java.lang.String r2 = "TouchControlsOverlay"
            java.lang.String r3 = "Unable to redo touch layout change"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r2, r3, r0)
            return r1
    }

    public void refreshButtonVisuals() {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L17
            android.view.View r1 = r3.getChildAt(r0)
            boolean r2 = r1 instanceof ca.dnamobile.javalauncher.controls.TouchControlButtonView
            if (r2 == 0) goto L14
            ca.dnamobile.javalauncher.controls.TouchControlButtonView r1 = (ca.dnamobile.javalauncher.controls.TouchControlButtonView) r1
            r1.refreshVisualState()
        L14:
            int r0 = r0 + 1
            goto L1
        L17:
            r3.postInvalidateOnAnimation()
            return
    }

    public void saveLayout() {
            r4 = this;
            r4.normalizeUnstablePixelLayoutBeforeSave()     // Catch: java.lang.Throwable -> L18
            java.io.File r0 = r4.layoutFile     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L8
            goto L10
        L8:
            android.content.Context r0 = r4.getContext()     // Catch: java.lang.Throwable -> L18
            java.io.File r0 = ca.dnamobile.javalauncher.controls.TouchControlsStore.getSelectedLayoutFile(r0)     // Catch: java.lang.Throwable -> L18
        L10:
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r1 = r4.layoutData     // Catch: java.lang.Throwable -> L18
            ca.dnamobile.javalauncher.controls.TouchControlsStore.saveLayout(r0, r1)     // Catch: java.lang.Throwable -> L18
            r4.layoutFile = r0     // Catch: java.lang.Throwable -> L18
            goto L53
        L18:
            r0 = move-exception
            java.lang.String r1 = "TouchControlsOverlay"
            java.lang.String r2 = "Unable to save touch controls"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r2, r0)
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto L30
            java.lang.String r2 = r1.trim()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L38
        L30:
            java.lang.Class r0 = r0.getClass()
            java.lang.String r1 = r0.getSimpleName()
        L38:
            android.content.Context r0 = r4.getContext()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to save touch controls: "
            r2.<init>(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            r2 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
        L53:
            return
    }

    public void setAppMenuListener(ca.dnamobile.javalauncher.controls.TouchControlsOverlay.AppMenuListener r1) {
            r0 = this;
            r0.appMenuListener = r1
            return
    }

    public void setControlsVisible(boolean r1) {
            r0 = this;
            r0.controlsVisible = r1
            r1 = 0
            r0.setVisibility(r1)
            r0.applyControlsVisualState()
            return
    }

    public void setEditMode(boolean r1) {
            r0 = this;
            r0.editMode = r1
            if (r1 == 0) goto L7
            r0.hideKeySenderKeyboard()
        L7:
            r0.rebuildWhenSized()
            return
    }

    public void setMinecraftOptionsFile(java.io.File r3) {
            r2 = this;
            r2.minecraftOptionsFile = r3
            if (r3 == 0) goto Lb
            boolean r0 = r3.isFile()
            if (r0 == 0) goto Lb
            goto Lc
        Lb:
            r3 = 0
        Lc:
            r2.cachedMinecraftOptionsFile = r3
            r0 = 0
            r2.lastMinecraftOptionsResolveAtMs = r0
            ca.dnamobile.javalauncher.controls.MinecraftGuiScaleResolver.clearCache()
            r2.invalidate()
            return
    }

    public void setPassthroughTarget(android.view.View r2) {
            r1 = this;
            r1.passthroughTarget = r2
            boolean r2 = r1.shouldDrawLauncherVirtualCursor()
            r0 = r2 ^ 1
            r1.androidPointerIconHidden = r0
            r0 = 1
            r1.applyAndroidPointerIconPolicy(r2, r0)
            return
    }

    public void toggleControlVisible() {
            r2 = this;
            boolean r0 = r2.controlsVisible
            r0 = r0 ^ 1
            r2.setControlsVisible(r0)
            android.content.Context r0 = r2.getContext()
            boolean r1 = r2.controlsVisible
            ca.dnamobile.javalauncher.controls.ControlsPreferences.setTouchControlsEnabled(r0, r1)
            return
    }

    public boolean undoLastChange() {
            r4 = this;
            java.util.ArrayDeque<java.lang.String> r0 = r4.undoHistory
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            java.lang.String r0 = r4.snapshotLayout()     // Catch: java.lang.Throwable -> L2e
            java.util.ArrayDeque<java.lang.String> r2 = r4.undoHistory     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r2 = r2.removeLast()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L2e
            java.util.ArrayDeque<java.lang.String> r3 = r4.redoHistory     // Catch: java.lang.Throwable -> L2e
            r4.pushBounded(r3, r0)     // Catch: java.lang.Throwable -> L2e
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2e
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L2e
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r0 = ca.dnamobile.javalauncher.controls.TouchControlsLayoutData.fromJson(r0)     // Catch: java.lang.Throwable -> L2e
            r4.layoutData = r0     // Catch: java.lang.Throwable -> L2e
            r4.saveLayout()     // Catch: java.lang.Throwable -> L2e
            r4.rebuildWhenSized()     // Catch: java.lang.Throwable -> L2e
            r0 = 1
            return r0
        L2e:
            r0 = move-exception
            java.lang.String r2 = "TouchControlsOverlay"
            java.lang.String r3 = "Unable to undo touch layout change"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r2, r3, r0)
            return r1
    }
}
