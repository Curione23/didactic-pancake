package com.google.android.material.slider;

import com.google.android.material.slider.BaseOnChangeListener;
import com.google.android.material.slider.BaseOnSliderTouchListener;
import com.google.android.material.slider.BaseSlider;

/* JADX INFO: loaded from: classes.dex */
abstract class BaseSlider<S extends com.google.android.material.slider.BaseSlider<S, L, T>, L extends com.google.android.material.slider.BaseOnChangeListener<S>, T extends com.google.android.material.slider.BaseOnSliderTouchListener<S>> extends android.view.View {
    private static final int DEFAULT_LABEL_ANIMATION_ENTER_DURATION = 83;
    private static final int DEFAULT_LABEL_ANIMATION_EXIT_DURATION = 117;
    static final int DEF_STYLE_RES = 0;
    private static final java.lang.String EXCEPTION_ILLEGAL_DISCRETE_VALUE = "Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)";
    private static final java.lang.String EXCEPTION_ILLEGAL_MIN_SEPARATION = "minSeparation(%s) must be greater or equal to 0";
    private static final java.lang.String EXCEPTION_ILLEGAL_MIN_SEPARATION_STEP_SIZE = "minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)";
    private static final java.lang.String EXCEPTION_ILLEGAL_MIN_SEPARATION_STEP_SIZE_UNIT = "minSeparation(%s) cannot be set as a dimension when using stepSize(%s)";
    private static final java.lang.String EXCEPTION_ILLEGAL_STEP_SIZE = "The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range";
    private static final java.lang.String EXCEPTION_ILLEGAL_VALUE = "Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)";
    private static final java.lang.String EXCEPTION_ILLEGAL_VALUE_FROM = "valueFrom(%s) must be smaller than valueTo(%s)";
    private static final java.lang.String EXCEPTION_ILLEGAL_VALUE_TO = "valueTo(%s) must be greater than valueFrom(%s)";
    private static final int HALO_ALPHA = 63;
    private static final int LABEL_ANIMATION_ENTER_DURATION_ATTR = 0;
    private static final int LABEL_ANIMATION_ENTER_EASING_ATTR = 0;
    private static final int LABEL_ANIMATION_EXIT_DURATION_ATTR = 0;
    private static final int LABEL_ANIMATION_EXIT_EASING_ATTR = 0;
    private static final int MIN_TOUCH_TARGET_DP = 48;
    private static final java.lang.String TAG = "BaseSlider";
    private static final double THRESHOLD = 1.0E-4d;
    private static final float THUMB_WIDTH_PRESSED_RATIO = 0.5f;
    private static final int TIMEOUT_SEND_ACCESSIBILITY_EVENT = 200;
    static final int UNIT_PX = 0;
    static final int UNIT_VALUE = 1;
    private static final java.lang.String WARNING_FLOATING_POINT_ERROR = "Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.";
    private com.google.android.material.slider.BaseSlider<S, L, T>.AccessibilityEventSender accessibilityEventSender;
    private final com.google.android.material.slider.BaseSlider.AccessibilityHelper accessibilityHelper;
    private final android.view.accessibility.AccessibilityManager accessibilityManager;
    private int activeThumbIdx;
    private final android.graphics.Paint activeTicksPaint;
    private final android.graphics.Paint activeTrackPaint;
    private final java.util.List<L> changeListeners;
    private final android.graphics.RectF cornerRect;
    private android.graphics.drawable.Drawable customThumbDrawable;
    private java.util.List<android.graphics.drawable.Drawable> customThumbDrawablesForValues;
    private final com.google.android.material.shape.MaterialShapeDrawable defaultThumbDrawable;
    private int defaultThumbRadius;
    private int defaultThumbTrackGapSize;
    private int defaultThumbWidth;
    private int defaultTickActiveRadius;
    private int defaultTickInactiveRadius;
    private int defaultTrackHeight;
    private boolean dirtyConfig;
    private int focusedThumbIdx;
    private boolean forceDrawCompatHalo;
    private com.google.android.material.slider.LabelFormatter formatter;
    private android.content.res.ColorStateList haloColor;
    private final android.graphics.Paint haloPaint;
    private int haloRadius;
    private final android.graphics.Paint inactiveTicksPaint;
    private final android.graphics.Paint inactiveTrackPaint;
    private boolean isLongPress;
    private int labelBehavior;
    private int labelPadding;
    private int labelStyle;
    private final java.util.List<com.google.android.material.tooltip.TooltipDrawable> labels;
    private boolean labelsAreAnimatedIn;
    private android.animation.ValueAnimator labelsInAnimator;
    private android.animation.ValueAnimator labelsOutAnimator;
    private android.view.MotionEvent lastEvent;
    private int minTickSpacing;
    private int minTouchTargetSize;
    private int minTrackSidePadding;
    private int minWidgetHeight;
    private final android.view.ViewTreeObserver.OnScrollChangedListener onScrollChangedListener;
    private final int scaledTouchSlop;
    private int separationUnit;
    private float stepSize;
    private final android.graphics.Paint stopIndicatorPaint;
    private int thumbHeight;
    private boolean thumbIsPressed;
    private final android.graphics.Paint thumbPaint;
    private int thumbTrackGapSize;
    private int thumbWidth;
    private int tickActiveRadius;
    private android.content.res.ColorStateList tickColorActive;
    private android.content.res.ColorStateList tickColorInactive;
    private int tickInactiveRadius;
    private boolean tickVisible;
    private float[] ticksCoordinates;
    private float touchDownX;
    private final java.util.List<T> touchListeners;
    private float touchPosition;
    private android.content.res.ColorStateList trackColorActive;
    private android.content.res.ColorStateList trackColorInactive;
    private int trackHeight;
    private int trackInsideCornerSize;
    private final android.graphics.Path trackPath;
    private final android.graphics.RectF trackRect;
    private int trackSidePadding;
    private int trackStopIndicatorSize;
    private int trackWidth;
    private float valueFrom;
    private float valueTo;
    private java.util.ArrayList<java.lang.Float> values;
    private int widgetHeight;



    /* JADX INFO: renamed from: com.google.android.material.slider.BaseSlider$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection = null;

        static {
                com.google.android.material.slider.BaseSlider$FullCornerDirection[] r0 = com.google.android.material.slider.BaseSlider.FullCornerDirection.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.android.material.slider.BaseSlider.AnonymousClass3.$SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection = r0
                com.google.android.material.slider.BaseSlider$FullCornerDirection r1 = com.google.android.material.slider.BaseSlider.FullCornerDirection.NONE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.android.material.slider.BaseSlider.AnonymousClass3.$SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.android.material.slider.BaseSlider$FullCornerDirection r1 = com.google.android.material.slider.BaseSlider.FullCornerDirection.LEFT     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.android.material.slider.BaseSlider.AnonymousClass3.$SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.android.material.slider.BaseSlider$FullCornerDirection r1 = com.google.android.material.slider.BaseSlider.FullCornerDirection.RIGHT     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.android.material.slider.BaseSlider.AnonymousClass3.$SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.android.material.slider.BaseSlider$FullCornerDirection r1 = com.google.android.material.slider.BaseSlider.FullCornerDirection.BOTH     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    private class AccessibilityEventSender implements java.lang.Runnable {
        final /* synthetic */ com.google.android.material.slider.BaseSlider this$0;
        int virtualViewId;

        private AccessibilityEventSender(com.google.android.material.slider.BaseSlider r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = -1
                r0.virtualViewId = r1
                return
        }

        /* synthetic */ AccessibilityEventSender(com.google.android.material.slider.BaseSlider r1, com.google.android.material.slider.BaseSlider.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                com.google.android.material.slider.BaseSlider r0 = r3.this$0
                com.google.android.material.slider.BaseSlider$AccessibilityHelper r0 = com.google.android.material.slider.BaseSlider.access$200(r0)
                int r1 = r3.virtualViewId
                r2 = 4
                r0.sendEventForVirtualView(r1, r2)
                return
        }

        void setVirtualViewId(int r1) {
                r0 = this;
                r0.virtualViewId = r1
                return
        }
    }

    private static class AccessibilityHelper extends androidx.customview.widget.ExploreByTouchHelper {
        private final com.google.android.material.slider.BaseSlider<?, ?, ?> slider;
        final android.graphics.Rect virtualViewBounds;

        AccessibilityHelper(com.google.android.material.slider.BaseSlider<?, ?, ?> r2) {
                r1 = this;
                r1.<init>(r2)
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.virtualViewBounds = r0
                r1.slider = r2
                return
        }

        private java.lang.String startOrEndDescription(int r2) {
                r1 = this;
                com.google.android.material.slider.BaseSlider<?, ?, ?> r0 = r1.slider
                java.util.List r0 = r0.getValues()
                int r0 = r0.size()
                int r0 = r0 + (-1)
                if (r2 != r0) goto L1b
                com.google.android.material.slider.BaseSlider<?, ?, ?> r2 = r1.slider
                android.content.Context r2 = r2.getContext()
                int r0 = com.google.android.material.R.string.material_slider_range_end
                java.lang.String r2 = r2.getString(r0)
                return r2
            L1b:
                if (r2 != 0) goto L2a
                com.google.android.material.slider.BaseSlider<?, ?, ?> r2 = r1.slider
                android.content.Context r2 = r2.getContext()
                int r0 = com.google.android.material.R.string.material_slider_range_start
                java.lang.String r2 = r2.getString(r0)
                return r2
            L2a:
                java.lang.String r2 = ""
                return r2
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected int getVirtualViewAt(float r5, float r6) {
                r4 = this;
                r0 = 0
            L1:
                com.google.android.material.slider.BaseSlider<?, ?, ?> r1 = r4.slider
                java.util.List r1 = r1.getValues()
                int r1 = r1.size()
                if (r0 >= r1) goto L22
                com.google.android.material.slider.BaseSlider<?, ?, ?> r1 = r4.slider
                android.graphics.Rect r2 = r4.virtualViewBounds
                r1.updateBoundsForVirtualViewId(r0, r2)
                android.graphics.Rect r1 = r4.virtualViewBounds
                int r2 = (int) r5
                int r3 = (int) r6
                boolean r1 = r1.contains(r2, r3)
                if (r1 == 0) goto L1f
                return r0
            L1f:
                int r0 = r0 + 1
                goto L1
            L22:
                r5 = -1
                return r5
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected void getVisibleVirtualViews(java.util.List<java.lang.Integer> r3) {
                r2 = this;
                r0 = 0
            L1:
                com.google.android.material.slider.BaseSlider<?, ?, ?> r1 = r2.slider
                java.util.List r1 = r1.getValues()
                int r1 = r1.size()
                if (r0 >= r1) goto L17
                java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                r3.add(r1)
                int r0 = r0 + 1
                goto L1
            L17:
                return
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected boolean onPerformActionForVirtualView(int r5, int r6, android.os.Bundle r7) {
                r4 = this;
                com.google.android.material.slider.BaseSlider<?, ?, ?> r0 = r4.slider
                boolean r0 = r0.isEnabled()
                r1 = 0
                if (r0 != 0) goto La
                return r1
            La:
                r0 = 4096(0x1000, float:5.74E-42)
                r2 = 1
                r3 = 8192(0x2000, float:1.148E-41)
                if (r6 == r0) goto L3f
                if (r6 == r3) goto L3f
                r0 = 16908349(0x102003d, float:2.38774E-38)
                if (r6 == r0) goto L19
                return r1
            L19:
                if (r7 == 0) goto L3e
                java.lang.String r6 = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"
                boolean r0 = r7.containsKey(r6)
                if (r0 != 0) goto L24
                goto L3e
            L24:
                float r6 = r7.getFloat(r6)
                com.google.android.material.slider.BaseSlider<?, ?, ?> r7 = r4.slider
                boolean r6 = com.google.android.material.slider.BaseSlider.access$500(r7, r5, r6)
                if (r6 == 0) goto L3e
                com.google.android.material.slider.BaseSlider<?, ?, ?> r6 = r4.slider
                com.google.android.material.slider.BaseSlider.access$600(r6)
                com.google.android.material.slider.BaseSlider<?, ?, ?> r6 = r4.slider
                r6.postInvalidate()
                r4.invalidateVirtualView(r5)
                return r2
            L3e:
                return r1
            L3f:
                com.google.android.material.slider.BaseSlider<?, ?, ?> r7 = r4.slider
                r0 = 20
                float r7 = com.google.android.material.slider.BaseSlider.access$700(r7, r0)
                if (r6 != r3) goto L4a
                float r7 = -r7
            L4a:
                com.google.android.material.slider.BaseSlider<?, ?, ?> r6 = r4.slider
                boolean r6 = r6.isRtl()
                if (r6 == 0) goto L53
                float r7 = -r7
            L53:
                com.google.android.material.slider.BaseSlider<?, ?, ?> r6 = r4.slider
                java.util.List r6 = r6.getValues()
                java.lang.Object r6 = r6.get(r5)
                java.lang.Float r6 = (java.lang.Float) r6
                float r6 = r6.floatValue()
                float r6 = r6 + r7
                com.google.android.material.slider.BaseSlider<?, ?, ?> r7 = r4.slider
                float r7 = r7.getValueFrom()
                com.google.android.material.slider.BaseSlider<?, ?, ?> r0 = r4.slider
                float r0 = r0.getValueTo()
                float r6 = androidx.core.math.MathUtils.clamp(r6, r7, r0)
                com.google.android.material.slider.BaseSlider<?, ?, ?> r7 = r4.slider
                boolean r6 = com.google.android.material.slider.BaseSlider.access$500(r7, r5, r6)
                if (r6 == 0) goto L8a
                com.google.android.material.slider.BaseSlider<?, ?, ?> r6 = r4.slider
                com.google.android.material.slider.BaseSlider.access$600(r6)
                com.google.android.material.slider.BaseSlider<?, ?, ?> r6 = r4.slider
                r6.postInvalidate()
                r4.invalidateVirtualView(r5)
                return r2
            L8a:
                return r1
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected void onPopulateNodeForVirtualView(int r7, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r8) {
                r6 = this;
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SET_PROGRESS
                r8.addAction(r0)
                com.google.android.material.slider.BaseSlider<?, ?, ?> r0 = r6.slider
                java.util.List r0 = r0.getValues()
                java.lang.Object r1 = r0.get(r7)
                java.lang.Float r1 = (java.lang.Float) r1
                float r1 = r1.floatValue()
                com.google.android.material.slider.BaseSlider<?, ?, ?> r2 = r6.slider
                float r2 = r2.getValueFrom()
                com.google.android.material.slider.BaseSlider<?, ?, ?> r3 = r6.slider
                float r3 = r3.getValueTo()
                com.google.android.material.slider.BaseSlider<?, ?, ?> r4 = r6.slider
                boolean r4 = r4.isEnabled()
                if (r4 == 0) goto L3b
                int r4 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r4 <= 0) goto L32
                r4 = 8192(0x2000, float:1.148E-41)
                r8.addAction(r4)
            L32:
                int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r4 >= 0) goto L3b
                r4 = 4096(0x1000, float:5.74E-42)
                r8.addAction(r4)
            L3b:
                r4 = 1
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$RangeInfoCompat r2 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(r4, r2, r3, r1)
                r8.setRangeInfo(r2)
                java.lang.Class<android.widget.SeekBar> r2 = android.widget.SeekBar.class
                java.lang.String r2 = r2.getName()
                r8.setClassName(r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                com.google.android.material.slider.BaseSlider<?, ?, ?> r3 = r6.slider
                java.lang.CharSequence r3 = r3.getContentDescription()
                if (r3 == 0) goto L68
                com.google.android.material.slider.BaseSlider<?, ?, ?> r3 = r6.slider
                java.lang.CharSequence r3 = r3.getContentDescription()
                java.lang.StringBuilder r3 = r2.append(r3)
                java.lang.String r5 = ","
                r3.append(r5)
            L68:
                com.google.android.material.slider.BaseSlider<?, ?, ?> r3 = r6.slider
                java.lang.String r1 = com.google.android.material.slider.BaseSlider.access$400(r3, r1)
                com.google.android.material.slider.BaseSlider<?, ?, ?> r3 = r6.slider
                android.content.Context r3 = r3.getContext()
                int r5 = com.google.android.material.R.string.material_slider_value
                java.lang.String r3 = r3.getString(r5)
                int r0 = r0.size()
                if (r0 <= r4) goto L84
                java.lang.String r3 = r6.startOrEndDescription(r7)
            L84:
                java.util.Locale r0 = java.util.Locale.US
                java.lang.String r4 = "%s, %s"
                java.lang.Object[] r1 = new java.lang.Object[]{r3, r1}
                java.lang.String r0 = java.lang.String.format(r0, r4, r1)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r8.setContentDescription(r0)
                com.google.android.material.slider.BaseSlider<?, ?, ?> r0 = r6.slider
                android.graphics.Rect r1 = r6.virtualViewBounds
                r0.updateBoundsForVirtualViewId(r7, r1)
                android.graphics.Rect r7 = r6.virtualViewBounds
                r8.setBoundsInParent(r7)
                return
        }
    }

    private enum FullCornerDirection extends java.lang.Enum<com.google.android.material.slider.BaseSlider.FullCornerDirection> {
        private static final /* synthetic */ com.google.android.material.slider.BaseSlider.FullCornerDirection[] $VALUES = null;
        public static final com.google.android.material.slider.BaseSlider.FullCornerDirection BOTH = null;
        public static final com.google.android.material.slider.BaseSlider.FullCornerDirection LEFT = null;
        public static final com.google.android.material.slider.BaseSlider.FullCornerDirection NONE = null;
        public static final com.google.android.material.slider.BaseSlider.FullCornerDirection RIGHT = null;

        static {
                com.google.android.material.slider.BaseSlider$FullCornerDirection r0 = new com.google.android.material.slider.BaseSlider$FullCornerDirection
                java.lang.String r1 = "BOTH"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.android.material.slider.BaseSlider.FullCornerDirection.BOTH = r0
                com.google.android.material.slider.BaseSlider$FullCornerDirection r1 = new com.google.android.material.slider.BaseSlider$FullCornerDirection
                java.lang.String r2 = "LEFT"
                r3 = 1
                r1.<init>(r2, r3)
                com.google.android.material.slider.BaseSlider.FullCornerDirection.LEFT = r1
                com.google.android.material.slider.BaseSlider$FullCornerDirection r2 = new com.google.android.material.slider.BaseSlider$FullCornerDirection
                java.lang.String r3 = "RIGHT"
                r4 = 2
                r2.<init>(r3, r4)
                com.google.android.material.slider.BaseSlider.FullCornerDirection.RIGHT = r2
                com.google.android.material.slider.BaseSlider$FullCornerDirection r3 = new com.google.android.material.slider.BaseSlider$FullCornerDirection
                java.lang.String r4 = "NONE"
                r5 = 3
                r3.<init>(r4, r5)
                com.google.android.material.slider.BaseSlider.FullCornerDirection.NONE = r3
                com.google.android.material.slider.BaseSlider$FullCornerDirection[] r0 = new com.google.android.material.slider.BaseSlider.FullCornerDirection[]{r0, r1, r2, r3}
                com.google.android.material.slider.BaseSlider.FullCornerDirection.$VALUES = r0
                return
        }

        FullCornerDirection(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.android.material.slider.BaseSlider.FullCornerDirection valueOf(java.lang.String r1) {
                java.lang.Class<com.google.android.material.slider.BaseSlider$FullCornerDirection> r0 = com.google.android.material.slider.BaseSlider.FullCornerDirection.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.android.material.slider.BaseSlider$FullCornerDirection r1 = (com.google.android.material.slider.BaseSlider.FullCornerDirection) r1
                return r1
        }

        public static com.google.android.material.slider.BaseSlider.FullCornerDirection[] values() {
                com.google.android.material.slider.BaseSlider$FullCornerDirection[] r0 = com.google.android.material.slider.BaseSlider.FullCornerDirection.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.android.material.slider.BaseSlider$FullCornerDirection[] r0 = (com.google.android.material.slider.BaseSlider.FullCornerDirection[]) r0
                return r0
        }
    }

    static class SliderState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.slider.BaseSlider.SliderState> CREATOR = null;
        boolean hasFocus;
        float stepSize;
        float valueFrom;
        float valueTo;
        java.util.ArrayList<java.lang.Float> values;


        static {
                com.google.android.material.slider.BaseSlider$SliderState$1 r0 = new com.google.android.material.slider.BaseSlider$SliderState$1
                r0.<init>()
                com.google.android.material.slider.BaseSlider.SliderState.CREATOR = r0
                return
        }

        private SliderState(android.os.Parcel r3) {
                r2 = this;
                r2.<init>(r3)
                float r0 = r3.readFloat()
                r2.valueFrom = r0
                float r0 = r3.readFloat()
                r2.valueTo = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.values = r0
                java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
                java.lang.ClassLoader r1 = r1.getClassLoader()
                r3.readList(r0, r1)
                float r0 = r3.readFloat()
                r2.stepSize = r0
                boolean[] r3 = r3.createBooleanArray()
                r0 = 0
                boolean r3 = r3[r0]
                r2.hasFocus = r3
                return
        }

        /* synthetic */ SliderState(android.os.Parcel r1, com.google.android.material.slider.BaseSlider.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        SliderState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState
        public void writeToParcel(android.os.Parcel r3, int r4) {
                r2 = this;
                super.writeToParcel(r3, r4)
                float r4 = r2.valueFrom
                r3.writeFloat(r4)
                float r4 = r2.valueTo
                r3.writeFloat(r4)
                java.util.ArrayList<java.lang.Float> r4 = r2.values
                r3.writeList(r4)
                float r4 = r2.stepSize
                r3.writeFloat(r4)
                boolean r4 = r2.hasFocus
                r0 = 1
                boolean[] r0 = new boolean[r0]
                r1 = 0
                r0[r1] = r4
                r3.writeBooleanArray(r0)
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$WXiNVeXFM7RTh57Z9Tr5jBbN9l4(com.google.android.material.slider.BaseSlider r0) {
            r0.updateLabels()
            return
    }

    static {
            int r0 = com.google.android.material.R.style.Widget_MaterialComponents_Slider
            com.google.android.material.slider.BaseSlider.DEF_STYLE_RES = r0
            int r0 = com.google.android.material.R.attr.motionDurationMedium4
            com.google.android.material.slider.BaseSlider.LABEL_ANIMATION_ENTER_DURATION_ATTR = r0
            int r0 = com.google.android.material.R.attr.motionDurationShort3
            com.google.android.material.slider.BaseSlider.LABEL_ANIMATION_EXIT_DURATION_ATTR = r0
            int r0 = com.google.android.material.R.attr.motionEasingEmphasizedInterpolator
            com.google.android.material.slider.BaseSlider.LABEL_ANIMATION_ENTER_EASING_ATTR = r0
            int r0 = com.google.android.material.R.attr.motionEasingEmphasizedAccelerateInterpolator
            com.google.android.material.slider.BaseSlider.LABEL_ANIMATION_EXIT_EASING_ATTR = r0
            return
    }

    public BaseSlider(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public BaseSlider(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.sliderStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public BaseSlider(android.content.Context r6, android.util.AttributeSet r7, int r8) {
            r5 = this;
            int r0 = com.google.android.material.slider.BaseSlider.DEF_STYLE_RES
            android.content.Context r6 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r6, r7, r8, r0)
            r5.<init>(r6, r7, r8)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5.labels = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5.changeListeners = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5.touchListeners = r6
            r6 = 0
            r5.labelsAreAnimatedIn = r6
            r0 = -1
            r5.defaultThumbWidth = r0
            r5.defaultThumbTrackGapSize = r0
            r5.thumbIsPressed = r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.values = r1
            r5.activeThumbIdx = r0
            r5.focusedThumbIdx = r0
            r0 = 0
            r5.stepSize = r0
            r0 = 1
            r5.tickVisible = r0
            r5.isLongPress = r6
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r5.trackPath = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r5.trackRect = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r5.cornerRect = r1
            com.google.android.material.shape.MaterialShapeDrawable r1 = new com.google.android.material.shape.MaterialShapeDrawable
            r1.<init>()
            r5.defaultThumbDrawable = r1
            java.util.List r2 = java.util.Collections.emptyList()
            r5.customThumbDrawablesForValues = r2
            r5.separationUnit = r6
            com.google.android.material.slider.BaseSlider$$ExternalSyntheticLambda0 r6 = new com.google.android.material.slider.BaseSlider$$ExternalSyntheticLambda0
            r6.<init>(r5)
            r5.onScrollChangedListener = r6
            android.content.Context r6 = r5.getContext()
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r5.inactiveTrackPaint = r2
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r5.activeTrackPaint = r2
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>(r0)
            r5.thumbPaint = r2
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r2.setStyle(r3)
            android.graphics.PorterDuffXfermode r3 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.CLEAR
            r3.<init>(r4)
            r2.setXfermode(r3)
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>(r0)
            r5.haloPaint = r2
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r2.setStyle(r3)
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r5.inactiveTicksPaint = r2
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r2.setStyle(r3)
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.ROUND
            r2.setStrokeCap(r3)
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r5.activeTicksPaint = r2
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r2.setStyle(r3)
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.ROUND
            r2.setStrokeCap(r3)
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r5.stopIndicatorPaint = r2
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r2.setStyle(r3)
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.ROUND
            r2.setStrokeCap(r3)
            android.content.res.Resources r2 = r6.getResources()
            r5.loadResources(r2)
            r5.processAttributes(r6, r7, r8)
            r5.setFocusable(r0)
            r5.setClickable(r0)
            r7 = 2
            r1.setShadowCompatibilityMode(r7)
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            int r6 = r6.getScaledTouchSlop()
            r5.scaledTouchSlop = r6
            com.google.android.material.slider.BaseSlider$AccessibilityHelper r6 = new com.google.android.material.slider.BaseSlider$AccessibilityHelper
            r6.<init>(r5)
            r5.accessibilityHelper = r6
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r5, r6)
            android.content.Context r6 = r5.getContext()
            java.lang.String r7 = "accessibility"
            java.lang.Object r6 = r6.getSystemService(r7)
            android.view.accessibility.AccessibilityManager r6 = (android.view.accessibility.AccessibilityManager) r6
            r5.accessibilityManager = r6
            return
    }

    static /* synthetic */ java.util.List access$000(com.google.android.material.slider.BaseSlider r0) {
            java.util.List<com.google.android.material.tooltip.TooltipDrawable> r0 = r0.labels
            return r0
    }

    static /* synthetic */ com.google.android.material.slider.BaseSlider.AccessibilityHelper access$200(com.google.android.material.slider.BaseSlider r0) {
            com.google.android.material.slider.BaseSlider$AccessibilityHelper r0 = r0.accessibilityHelper
            return r0
    }

    static /* synthetic */ java.lang.String access$400(com.google.android.material.slider.BaseSlider r0, float r1) {
            java.lang.String r0 = r0.formatValue(r1)
            return r0
    }

    static /* synthetic */ boolean access$500(com.google.android.material.slider.BaseSlider r0, int r1, float r2) {
            boolean r0 = r0.snapThumbToValue(r1, r2)
            return r0
    }

    static /* synthetic */ void access$600(com.google.android.material.slider.BaseSlider r0) {
            r0.updateHaloHotspot()
            return
    }

    static /* synthetic */ float access$700(com.google.android.material.slider.BaseSlider r0, int r1) {
            float r0 = r0.calculateStepIncrement(r1)
            return r0
    }

    private void adjustCustomThumbDrawableBounds(android.graphics.drawable.Drawable r6) {
            r5 = this;
            int r0 = r6.getIntrinsicWidth()
            int r1 = r6.getIntrinsicHeight()
            r2 = 0
            r3 = -1
            if (r0 != r3) goto L16
            if (r1 != r3) goto L16
            int r0 = r5.thumbWidth
            int r1 = r5.thumbHeight
            r6.setBounds(r2, r2, r0, r1)
            goto L2e
        L16:
            int r3 = r5.thumbWidth
            int r4 = r5.thumbHeight
            int r3 = java.lang.Math.max(r3, r4)
            float r3 = (float) r3
            int r4 = java.lang.Math.max(r0, r1)
            float r4 = (float) r4
            float r3 = r3 / r4
            float r0 = (float) r0
            float r0 = r0 * r3
            int r0 = (int) r0
            float r1 = (float) r1
            float r1 = r1 * r3
            int r1 = (int) r1
            r6.setBounds(r2, r2, r0, r1)
        L2e:
            return
    }

    private void attachLabelToContentView(com.google.android.material.tooltip.TooltipDrawable r2) {
            r1 = this;
            android.view.ViewGroup r0 = com.google.android.material.internal.ViewUtils.getContentView(r1)
            r2.setRelativeToView(r0)
            return
    }

    private java.lang.Float calculateIncrementForKey(int r3) {
            r2 = this;
            boolean r0 = r2.isLongPress
            if (r0 == 0) goto Lb
            r0 = 20
            float r0 = r2.calculateStepIncrement(r0)
            goto Lf
        Lb:
            float r0 = r2.calculateStepIncrement()
        Lf:
            r1 = 21
            if (r3 == r1) goto L3c
            r1 = 22
            if (r3 == r1) goto L30
            r1 = 69
            if (r3 == r1) goto L2a
            r1 = 70
            if (r3 == r1) goto L25
            r1 = 81
            if (r3 == r1) goto L25
            r3 = 0
            return r3
        L25:
            java.lang.Float r3 = java.lang.Float.valueOf(r0)
            return r3
        L2a:
            float r3 = -r0
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            return r3
        L30:
            boolean r3 = r2.isRtl()
            if (r3 == 0) goto L37
            float r0 = -r0
        L37:
            java.lang.Float r3 = java.lang.Float.valueOf(r0)
            return r3
        L3c:
            boolean r3 = r2.isRtl()
            if (r3 == 0) goto L43
            goto L44
        L43:
            float r0 = -r0
        L44:
            java.lang.Float r3 = java.lang.Float.valueOf(r0)
            return r3
    }

    private float calculateStepIncrement() {
            r2 = this;
            float r0 = r2.stepSize
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L9
            r0 = 1065353216(0x3f800000, float:1.0)
        L9:
            return r0
    }

    private float calculateStepIncrement(int r4) {
            r3 = this;
            float r0 = r3.calculateStepIncrement()
            float r1 = r3.valueTo
            float r2 = r3.valueFrom
            float r1 = r1 - r2
            float r1 = r1 / r0
            float r4 = (float) r4
            int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r2 > 0) goto L10
            return r0
        L10:
            float r1 = r1 / r4
            int r4 = java.lang.Math.round(r1)
            float r4 = (float) r4
            float r4 = r4 * r0
            return r4
    }

    private int calculateTrackCenter() {
            r4 = this;
            int r0 = r4.widgetHeight
            int r0 = r0 / 2
            int r1 = r4.labelBehavior
            r2 = 1
            r3 = 0
            if (r1 == r2) goto L10
            boolean r1 = r4.shouldAlwaysShowLabel()
            if (r1 == 0) goto L1c
        L10:
            java.util.List<com.google.android.material.tooltip.TooltipDrawable> r1 = r4.labels
            java.lang.Object r1 = r1.get(r3)
            com.google.android.material.tooltip.TooltipDrawable r1 = (com.google.android.material.tooltip.TooltipDrawable) r1
            int r3 = r1.getIntrinsicHeight()
        L1c:
            int r0 = r0 + r3
            return r0
    }

    private android.animation.ValueAnimator createLabelAnimator(boolean r5) {
            r4 = this;
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto L7
            r2 = r0
            goto L8
        L7:
            r2 = r1
        L8:
            if (r5 == 0) goto Ld
            android.animation.ValueAnimator r3 = r4.labelsOutAnimator
            goto Lf
        Ld:
            android.animation.ValueAnimator r3 = r4.labelsInAnimator
        Lf:
            float r2 = getAnimatorCurrentValueOrDefault(r3, r2)
            if (r5 == 0) goto L16
            r0 = r1
        L16:
            r1 = 2
            float[] r1 = new float[r1]
            r3 = 0
            r1[r3] = r2
            r2 = 1
            r1[r2] = r0
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r1)
            if (r5 == 0) goto L3e
            android.content.Context r5 = r4.getContext()
            int r1 = com.google.android.material.slider.BaseSlider.LABEL_ANIMATION_ENTER_DURATION_ATTR
            r2 = 83
            int r5 = com.google.android.material.motion.MotionUtils.resolveThemeDuration(r5, r1, r2)
            android.content.Context r1 = r4.getContext()
            int r2 = com.google.android.material.slider.BaseSlider.LABEL_ANIMATION_ENTER_EASING_ATTR
            android.animation.TimeInterpolator r3 = com.google.android.material.animation.AnimationUtils.DECELERATE_INTERPOLATOR
            android.animation.TimeInterpolator r1 = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(r1, r2, r3)
            goto L56
        L3e:
            android.content.Context r5 = r4.getContext()
            int r1 = com.google.android.material.slider.BaseSlider.LABEL_ANIMATION_EXIT_DURATION_ATTR
            r2 = 117(0x75, float:1.64E-43)
            int r5 = com.google.android.material.motion.MotionUtils.resolveThemeDuration(r5, r1, r2)
            android.content.Context r1 = r4.getContext()
            int r2 = com.google.android.material.slider.BaseSlider.LABEL_ANIMATION_EXIT_EASING_ATTR
            android.animation.TimeInterpolator r3 = com.google.android.material.animation.AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR
            android.animation.TimeInterpolator r1 = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(r1, r2, r3)
        L56:
            long r2 = (long) r5
            r0.setDuration(r2)
            r0.setInterpolator(r1)
            com.google.android.material.slider.BaseSlider$1 r5 = new com.google.android.material.slider.BaseSlider$1
            r5.<init>(r4)
            r0.addUpdateListener(r5)
            return r0
    }

    private void createLabelPool() {
            r4 = this;
            java.util.List<com.google.android.material.tooltip.TooltipDrawable> r0 = r4.labels
            int r0 = r0.size()
            java.util.ArrayList<java.lang.Float> r1 = r4.values
            int r1 = r1.size()
            if (r0 <= r1) goto L3d
            java.util.List<com.google.android.material.tooltip.TooltipDrawable> r0 = r4.labels
            java.util.ArrayList<java.lang.Float> r1 = r4.values
            int r1 = r1.size()
            java.util.List<com.google.android.material.tooltip.TooltipDrawable> r2 = r4.labels
            int r2 = r2.size()
            java.util.List r0 = r0.subList(r1, r2)
            java.util.Iterator r1 = r0.iterator()
        L24:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r1.next()
            com.google.android.material.tooltip.TooltipDrawable r2 = (com.google.android.material.tooltip.TooltipDrawable) r2
            boolean r3 = androidx.core.view.ViewCompat.isAttachedToWindow(r4)
            if (r3 == 0) goto L24
            r4.detachLabelFromContentView(r2)
            goto L24
        L3a:
            r0.clear()
        L3d:
            java.util.List<com.google.android.material.tooltip.TooltipDrawable> r0 = r4.labels
            int r0 = r0.size()
            java.util.ArrayList<java.lang.Float> r1 = r4.values
            int r1 = r1.size()
            r2 = 0
            if (r0 >= r1) goto L66
            android.content.Context r0 = r4.getContext()
            r1 = 0
            int r3 = r4.labelStyle
            com.google.android.material.tooltip.TooltipDrawable r0 = com.google.android.material.tooltip.TooltipDrawable.createFromAttributes(r0, r1, r2, r3)
            java.util.List<com.google.android.material.tooltip.TooltipDrawable> r1 = r4.labels
            r1.add(r0)
            boolean r1 = androidx.core.view.ViewCompat.isAttachedToWindow(r4)
            if (r1 == 0) goto L3d
            r4.attachLabelToContentView(r0)
            goto L3d
        L66:
            java.util.List<com.google.android.material.tooltip.TooltipDrawable> r0 = r4.labels
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L70
            goto L71
        L70:
            r2 = r1
        L71:
            java.util.List<com.google.android.material.tooltip.TooltipDrawable> r0 = r4.labels
            java.util.Iterator r0 = r0.iterator()
        L77:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L88
            java.lang.Object r1 = r0.next()
            com.google.android.material.tooltip.TooltipDrawable r1 = (com.google.android.material.tooltip.TooltipDrawable) r1
            float r3 = (float) r2
            r1.setStrokeWidth(r3)
            goto L77
        L88:
            return
    }

    private void detachLabelFromContentView(com.google.android.material.tooltip.TooltipDrawable r2) {
            r1 = this;
            com.google.android.material.internal.ViewOverlayImpl r0 = com.google.android.material.internal.ViewUtils.getContentViewOverlay(r1)
            if (r0 == 0) goto L10
            r0.remove(r2)
            android.view.ViewGroup r0 = com.google.android.material.internal.ViewUtils.getContentView(r1)
            r2.detachView(r0)
        L10:
            return
    }

    private float dimenToValue(float r3) {
            r2 = this;
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 != 0) goto L6
            return r0
        L6:
            int r0 = r2.trackSidePadding
            float r0 = (float) r0
            float r3 = r3 - r0
            int r0 = r2.trackWidth
            float r0 = (float) r0
            float r3 = r3 / r0
            float r0 = r2.valueFrom
            float r1 = r2.valueTo
            float r1 = r0 - r1
            float r3 = r3 * r1
            float r3 = r3 + r0
            return r3
    }

    private void dispatchOnChangedFromUser(int r5) {
            r4 = this;
            java.util.List<L extends com.google.android.material.slider.BaseOnChangeListener<S>> r0 = r4.changeListeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            com.google.android.material.slider.BaseOnChangeListener r1 = (com.google.android.material.slider.BaseOnChangeListener) r1
            java.util.ArrayList<java.lang.Float> r2 = r4.values
            java.lang.Object r2 = r2.get(r5)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r3 = 1
            r1.onValueChange(r4, r2, r3)
            goto L6
        L23:
            android.view.accessibility.AccessibilityManager r0 = r4.accessibilityManager
            if (r0 == 0) goto L30
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L30
            r4.scheduleAccessibilityEventSender(r5)
        L30:
            return
    }

    private void dispatchOnChangedProgrammatically() {
            r5 = this;
            java.util.List<L extends com.google.android.material.slider.BaseOnChangeListener<S>> r0 = r5.changeListeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()
            com.google.android.material.slider.BaseOnChangeListener r1 = (com.google.android.material.slider.BaseOnChangeListener) r1
            java.util.ArrayList<java.lang.Float> r2 = r5.values
            java.util.Iterator r2 = r2.iterator()
        L18:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L6
            java.lang.Object r3 = r2.next()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r4 = 0
            r1.onValueChange(r5, r3, r4)
            goto L18
        L2d:
            return
    }

    private void drawActiveTrack(android.graphics.Canvas r12, int r13, int r14) {
            r11 = this;
            float[] r0 = r11.getActiveRange()
            int r1 = r11.trackSidePadding
            float r2 = (float) r1
            r3 = 1
            r4 = r0[r3]
            float r13 = (float) r13
            float r4 = r4 * r13
            float r8 = r2 + r4
            float r1 = (float) r1
            r2 = 0
            r0 = r0[r2]
            float r0 = r0 * r13
            float r6 = r1 + r0
            boolean r13 = r11.hasGapBetweenThumbAndTrack()
            if (r13 == 0) goto Lb8
            com.google.android.material.slider.BaseSlider$FullCornerDirection r13 = com.google.android.material.slider.BaseSlider.FullCornerDirection.NONE
            java.util.ArrayList<java.lang.Float> r0 = r11.values
            int r0 = r0.size()
            if (r0 != r3) goto L30
            boolean r13 = r11.isRtl()
            if (r13 == 0) goto L2e
            com.google.android.material.slider.BaseSlider$FullCornerDirection r13 = com.google.android.material.slider.BaseSlider.FullCornerDirection.RIGHT
            goto L30
        L2e:
            com.google.android.material.slider.BaseSlider$FullCornerDirection r13 = com.google.android.material.slider.BaseSlider.FullCornerDirection.LEFT
        L30:
            java.util.ArrayList<java.lang.Float> r0 = r11.values
            int r0 = r0.size()
            if (r2 >= r0) goto Lce
            java.util.ArrayList<java.lang.Float> r0 = r11.values
            int r0 = r0.size()
            if (r0 <= r3) goto L6e
            if (r2 <= 0) goto L54
            java.util.ArrayList<java.lang.Float> r0 = r11.values
            int r1 = r2 + (-1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            float r6 = r11.valueToX(r0)
        L54:
            java.util.ArrayList<java.lang.Float> r0 = r11.values
            java.lang.Object r0 = r0.get(r2)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            float r0 = r11.valueToX(r0)
            boolean r1 = r11.isRtl()
            if (r1 == 0) goto L6d
            r8 = r6
            r6 = r0
            goto L6e
        L6d:
            r8 = r0
        L6e:
            int[] r0 = com.google.android.material.slider.BaseSlider.AnonymousClass3.$SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection
            int r1 = r13.ordinal()
            r0 = r0[r1]
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r3) goto L93
            r4 = 2
            if (r0 == r4) goto L8b
            r4 = 3
            if (r0 == r4) goto L81
            goto L99
        L81:
            int r0 = r11.thumbTrackGapSize
            float r0 = (float) r0
            float r6 = r6 + r0
            int r0 = r11.trackHeight
            float r0 = (float) r0
            float r0 = r0 / r1
            float r8 = r8 + r0
            goto L99
        L8b:
            int r0 = r11.trackHeight
            float r0 = (float) r0
            float r0 = r0 / r1
            float r6 = r6 - r0
            int r0 = r11.thumbTrackGapSize
            goto L97
        L93:
            int r0 = r11.thumbTrackGapSize
            float r4 = (float) r0
            float r6 = r6 + r4
        L97:
            float r0 = (float) r0
            float r8 = r8 - r0
        L99:
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 < 0) goto L9e
            goto Lb4
        L9e:
            android.graphics.RectF r0 = r11.trackRect
            float r4 = (float) r14
            int r5 = r11.trackHeight
            float r7 = (float) r5
            float r7 = r7 / r1
            float r7 = r4 - r7
            float r5 = (float) r5
            float r5 = r5 / r1
            float r4 = r4 + r5
            r0.set(r6, r7, r8, r4)
            android.graphics.Paint r0 = r11.activeTrackPaint
            android.graphics.RectF r1 = r11.trackRect
            r11.updateTrack(r12, r0, r1, r13)
        Lb4:
            int r2 = r2 + 1
            goto L30
        Lb8:
            android.graphics.Paint r13 = r11.activeTrackPaint
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r13.setStyle(r0)
            android.graphics.Paint r13 = r11.activeTrackPaint
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            r13.setStrokeCap(r0)
            float r9 = (float) r14
            android.graphics.Paint r10 = r11.activeTrackPaint
            r5 = r12
            r7 = r9
            r5.drawLine(r6, r7, r8, r9, r10)
        Lce:
            return
    }

    private void drawInactiveTrack(android.graphics.Canvas r12, int r13, int r14) {
            r11 = this;
            float[] r0 = r11.getActiveRange()
            int r1 = r11.trackSidePadding
            float r2 = (float) r1
            r3 = 1
            r3 = r0[r3]
            float r4 = (float) r13
            float r3 = r3 * r4
            float r6 = r2 + r3
            int r1 = r1 + r13
            float r1 = (float) r1
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 >= 0) goto L5a
            boolean r1 = r11.hasGapBetweenThumbAndTrack()
            if (r1 == 0) goto L40
            android.graphics.RectF r1 = r11.trackRect
            int r3 = r11.thumbTrackGapSize
            float r3 = (float) r3
            float r6 = r6 + r3
            float r3 = (float) r14
            int r5 = r11.trackHeight
            float r7 = (float) r5
            float r7 = r7 / r2
            float r7 = r3 - r7
            int r8 = r11.trackSidePadding
            int r8 = r8 + r13
            float r13 = (float) r8
            float r8 = (float) r5
            float r8 = r8 / r2
            float r13 = r13 + r8
            float r5 = (float) r5
            float r5 = r5 / r2
            float r3 = r3 + r5
            r1.set(r6, r7, r13, r3)
            android.graphics.Paint r13 = r11.inactiveTrackPaint
            android.graphics.RectF r1 = r11.trackRect
            com.google.android.material.slider.BaseSlider$FullCornerDirection r3 = com.google.android.material.slider.BaseSlider.FullCornerDirection.RIGHT
            r11.updateTrack(r12, r13, r1, r3)
            goto L5a
        L40:
            android.graphics.Paint r1 = r11.inactiveTrackPaint
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r3)
            android.graphics.Paint r1 = r11.inactiveTrackPaint
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.ROUND
            r1.setStrokeCap(r3)
            float r9 = (float) r14
            int r1 = r11.trackSidePadding
            int r1 = r1 + r13
            float r8 = (float) r1
            android.graphics.Paint r10 = r11.inactiveTrackPaint
            r5 = r12
            r7 = r9
            r5.drawLine(r6, r7, r8, r9, r10)
        L5a:
            int r13 = r11.trackSidePadding
            float r1 = (float) r13
            r3 = 0
            r0 = r0[r3]
            float r0 = r0 * r4
            float r6 = r1 + r0
            float r13 = (float) r13
            int r13 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r13 <= 0) goto Laa
            boolean r13 = r11.hasGapBetweenThumbAndTrack()
            if (r13 == 0) goto L91
            android.graphics.RectF r13 = r11.trackRect
            int r0 = r11.trackSidePadding
            float r0 = (float) r0
            int r1 = r11.trackHeight
            float r3 = (float) r1
            float r3 = r3 / r2
            float r0 = r0 - r3
            float r14 = (float) r14
            float r3 = (float) r1
            float r3 = r3 / r2
            float r3 = r14 - r3
            int r4 = r11.thumbTrackGapSize
            float r4 = (float) r4
            float r6 = r6 - r4
            float r1 = (float) r1
            float r1 = r1 / r2
            float r14 = r14 + r1
            r13.set(r0, r3, r6, r14)
            android.graphics.Paint r13 = r11.inactiveTrackPaint
            android.graphics.RectF r14 = r11.trackRect
            com.google.android.material.slider.BaseSlider$FullCornerDirection r0 = com.google.android.material.slider.BaseSlider.FullCornerDirection.LEFT
            r11.updateTrack(r12, r13, r14, r0)
            goto Laa
        L91:
            android.graphics.Paint r13 = r11.inactiveTrackPaint
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r13.setStyle(r0)
            android.graphics.Paint r13 = r11.inactiveTrackPaint
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            r13.setStrokeCap(r0)
            int r13 = r11.trackSidePadding
            float r4 = (float) r13
            float r7 = (float) r14
            android.graphics.Paint r8 = r11.inactiveTrackPaint
            r3 = r12
            r5 = r7
            r3.drawLine(r4, r5, r6, r7, r8)
        Laa:
            return
    }

    private void drawThumbDrawable(android.graphics.Canvas r2, int r3, int r4, float r5, android.graphics.drawable.Drawable r6) {
            r1 = this;
            r2.save()
            int r0 = r1.trackSidePadding
            float r5 = r1.normalizeValue(r5)
            float r3 = (float) r3
            float r5 = r5 * r3
            int r3 = (int) r5
            int r0 = r0 + r3
            float r3 = (float) r0
            android.graphics.Rect r5 = r6.getBounds()
            int r5 = r5.width()
            float r5 = (float) r5
            r0 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r0
            float r3 = r3 - r5
            float r4 = (float) r4
            android.graphics.Rect r5 = r6.getBounds()
            int r5 = r5.height()
            float r5 = (float) r5
            float r5 = r5 / r0
            float r4 = r4 - r5
            r2.translate(r3, r4)
            r6.draw(r2)
            r2.restore()
            return
    }

    private void drawThumbs(android.graphics.Canvas r9, int r10, int r11) {
            r8 = this;
            r0 = 0
        L1:
            java.util.ArrayList<java.lang.Float> r1 = r8.values
            int r1 = r1.size()
            if (r0 >= r1) goto L61
            java.util.ArrayList<java.lang.Float> r1 = r8.values
            java.lang.Object r1 = r1.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            float r6 = r1.floatValue()
            android.graphics.drawable.Drawable r7 = r8.customThumbDrawable
            if (r7 == 0) goto L21
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r2.drawThumbDrawable(r3, r4, r5, r6, r7)
            goto L5e
        L21:
            java.util.List<android.graphics.drawable.Drawable> r1 = r8.customThumbDrawablesForValues
            int r1 = r1.size()
            if (r0 >= r1) goto L3a
            java.util.List<android.graphics.drawable.Drawable> r1 = r8.customThumbDrawablesForValues
            java.lang.Object r1 = r1.get(r0)
            r7 = r1
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r2.drawThumbDrawable(r3, r4, r5, r6, r7)
            goto L5e
        L3a:
            boolean r1 = r8.isEnabled()
            if (r1 != 0) goto L55
            int r1 = r8.trackSidePadding
            float r1 = (float) r1
            float r2 = r8.normalizeValue(r6)
            float r3 = (float) r10
            float r2 = r2 * r3
            float r1 = r1 + r2
            float r2 = (float) r11
            int r3 = r8.getThumbRadius()
            float r3 = (float) r3
            android.graphics.Paint r4 = r8.thumbPaint
            r9.drawCircle(r1, r2, r3, r4)
        L55:
            com.google.android.material.shape.MaterialShapeDrawable r7 = r8.defaultThumbDrawable
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r2.drawThumbDrawable(r3, r4, r5, r6, r7)
        L5e:
            int r0 = r0 + 1
            goto L1
        L61:
            return
    }

    private void ensureLabelsAdded() {
            r4 = this;
            boolean r0 = r4.labelsAreAnimatedIn
            if (r0 != 0) goto L13
            r0 = 1
            r4.labelsAreAnimatedIn = r0
            android.animation.ValueAnimator r0 = r4.createLabelAnimator(r0)
            r4.labelsInAnimator = r0
            r1 = 0
            r4.labelsOutAnimator = r1
            r0.start()
        L13:
            java.util.List<com.google.android.material.tooltip.TooltipDrawable> r0 = r4.labels
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L1a:
            java.util.ArrayList<java.lang.Float> r2 = r4.values
            int r2 = r2.size()
            if (r1 >= r2) goto L45
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L45
            int r2 = r4.focusedThumbIdx
            if (r1 != r2) goto L2d
            goto L42
        L2d:
            java.lang.Object r2 = r0.next()
            com.google.android.material.tooltip.TooltipDrawable r2 = (com.google.android.material.tooltip.TooltipDrawable) r2
            java.util.ArrayList<java.lang.Float> r3 = r4.values
            java.lang.Object r3 = r3.get(r1)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r4.setValueForLabel(r2, r3)
        L42:
            int r1 = r1 + 1
            goto L1a
        L45:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L63
            java.lang.Object r0 = r0.next()
            com.google.android.material.tooltip.TooltipDrawable r0 = (com.google.android.material.tooltip.TooltipDrawable) r0
            java.util.ArrayList<java.lang.Float> r1 = r4.values
            int r2 = r4.focusedThumbIdx
            java.lang.Object r1 = r1.get(r2)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r4.setValueForLabel(r0, r1)
            return
        L63:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.util.List<com.google.android.material.tooltip.TooltipDrawable> r1 = r4.labels
            int r1 = r1.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.ArrayList<java.lang.Float> r2 = r4.values
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r2 = "Not enough labels(%d) to display all the values(%d)"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
    }

    private void ensureLabelsRemoved() {
            r2 = this;
            boolean r0 = r2.labelsAreAnimatedIn
            if (r0 == 0) goto L1d
            r0 = 0
            r2.labelsAreAnimatedIn = r0
            android.animation.ValueAnimator r0 = r2.createLabelAnimator(r0)
            r2.labelsOutAnimator = r0
            r1 = 0
            r2.labelsInAnimator = r1
            com.google.android.material.slider.BaseSlider$2 r1 = new com.google.android.material.slider.BaseSlider$2
            r1.<init>(r2)
            r0.addListener(r1)
            android.animation.ValueAnimator r0 = r2.labelsOutAnimator
            r0.start()
        L1d:
            return
    }

    private void focusThumbOnFocusGained(int r4) {
            r3 = this;
            r0 = 1
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r0) goto L20
            r0 = 2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r0) goto L1c
            r0 = 17
            if (r4 == r0) goto L18
            r0 = 66
            if (r4 == r0) goto L14
            goto L23
        L14:
            r3.moveFocusInAbsoluteDirection(r2)
            goto L23
        L18:
            r3.moveFocusInAbsoluteDirection(r1)
            goto L23
        L1c:
            r3.moveFocus(r2)
            goto L23
        L20:
            r3.moveFocus(r1)
        L23:
            return
    }

    private java.lang.String formatValue(float r2) {
            r1 = this;
            boolean r0 = r1.hasLabelFormatter()
            if (r0 == 0) goto Ld
            com.google.android.material.slider.LabelFormatter r0 = r1.formatter
            java.lang.String r2 = r0.getFormattedValue(r2)
            return r2
        Ld:
            int r0 = (int) r2
            float r0 = (float) r0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L16
            java.lang.String r0 = "%.0f"
            goto L18
        L16:
            java.lang.String r0 = "%.2f"
        L18:
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r2 = java.lang.String.format(r0, r2)
            return r2
    }

    private float[] getActiveRange() {
            r6 = this;
            java.util.ArrayList<java.lang.Float> r0 = r6.values
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            java.util.ArrayList<java.lang.Float> r2 = r6.values
            int r3 = r2.size()
            r4 = 1
            int r3 = r3 - r4
            java.lang.Object r2 = r2.get(r3)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            java.util.ArrayList<java.lang.Float> r3 = r6.values
            int r3 = r3.size()
            if (r3 != r4) goto L29
            float r0 = r6.valueFrom
        L29:
            float r0 = r6.normalizeValue(r0)
            float r2 = r6.normalizeValue(r2)
            boolean r3 = r6.isRtl()
            r5 = 2
            if (r3 == 0) goto L3f
            float[] r3 = new float[r5]
            r3[r1] = r2
            r3[r4] = r0
            goto L45
        L3f:
            float[] r3 = new float[r5]
            r3[r1] = r0
            r3[r4] = r2
        L45:
            return r3
    }

    private static float getAnimatorCurrentValueOrDefault(android.animation.ValueAnimator r1, float r2) {
            if (r1 == 0) goto L15
            boolean r0 = r1.isRunning()
            if (r0 == 0) goto L15
            java.lang.Object r2 = r1.getAnimatedValue()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r1.cancel()
        L15:
            return r2
    }

    private float getClampedValue(int r4, float r5) {
            r3 = this;
            float r0 = r3.getMinSeparation()
            int r1 = r3.separationUnit
            if (r1 != 0) goto Lc
            float r0 = r3.dimenToValue(r0)
        Lc:
            boolean r1 = r3.isRtl()
            if (r1 == 0) goto L13
            float r0 = -r0
        L13:
            int r1 = r4 + 1
            java.util.ArrayList<java.lang.Float> r2 = r3.values
            int r2 = r2.size()
            if (r1 < r2) goto L20
            float r1 = r3.valueTo
            goto L2d
        L20:
            java.util.ArrayList<java.lang.Float> r2 = r3.values
            java.lang.Object r1 = r2.get(r1)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            float r1 = r1 - r0
        L2d:
            int r4 = r4 + (-1)
            if (r4 >= 0) goto L34
            float r4 = r3.valueFrom
            goto L41
        L34:
            java.util.ArrayList<java.lang.Float> r2 = r3.values
            java.lang.Object r4 = r2.get(r4)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            float r4 = r4 + r0
        L41:
            float r4 = androidx.core.math.MathUtils.clamp(r5, r4, r1)
            return r4
    }

    private int getColorForState(android.content.res.ColorStateList r3) {
            r2 = this;
            int[] r0 = r2.getDrawableState()
            int r1 = r3.getDefaultColor()
            int r3 = r3.getColorForState(r0, r1)
            return r3
    }

    private float[] getCornerRadii(float r3, float r4) {
            r2 = this;
            r0 = 8
            float[] r0 = new float[r0]
            r1 = 0
            r0[r1] = r3
            r1 = 1
            r0[r1] = r3
            r1 = 2
            r0[r1] = r4
            r1 = 3
            r0[r1] = r4
            r1 = 4
            r0[r1] = r4
            r1 = 5
            r0[r1] = r4
            r4 = 6
            r0[r4] = r3
            r4 = 7
            r0[r4] = r3
            return r0
    }

    private float getValueOfTouchPosition() {
            r6 = this;
            float r0 = r6.touchPosition
            double r0 = r6.snapPosition(r0)
            boolean r2 = r6.isRtl()
            if (r2 == 0) goto L10
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r2 - r0
        L10:
            float r2 = r6.valueTo
            float r3 = r6.valueFrom
            float r2 = r2 - r3
            double r4 = (double) r2
            double r0 = r0 * r4
            double r2 = (double) r3
            double r0 = r0 + r2
            float r0 = (float) r0
            return r0
    }

    private float getValueOfTouchPositionAbsolute() {
            r3 = this;
            float r0 = r3.touchPosition
            boolean r1 = r3.isRtl()
            if (r1 == 0) goto Lc
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r1 - r0
        Lc:
            float r1 = r3.valueTo
            float r2 = r3.valueFrom
            float r1 = r1 - r2
            float r0 = r0 * r1
            float r0 = r0 + r2
            return r0
    }

    private boolean hasGapBetweenThumbAndTrack() {
            r1 = this;
            int r0 = r1.thumbTrackGapSize
            if (r0 <= 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    private android.graphics.drawable.Drawable initializeCustomThumbDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            android.graphics.drawable.Drawable r1 = r1.mutate()
            android.graphics.drawable.Drawable$ConstantState r1 = r1.getConstantState()
            android.graphics.drawable.Drawable r1 = r1.newDrawable()
            r0.adjustCustomThumbDrawableBounds(r1)
            return r1
    }

    private void invalidateTrack() {
            r2 = this;
            android.graphics.Paint r0 = r2.inactiveTrackPaint
            int r1 = r2.trackHeight
            float r1 = (float) r1
            r0.setStrokeWidth(r1)
            android.graphics.Paint r0 = r2.activeTrackPaint
            int r1 = r2.trackHeight
            float r1 = (float) r1
            r0.setStrokeWidth(r1)
            return
    }

    private boolean isInVerticalScrollingContainer() {
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
        L4:
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L25
            r1 = r0
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r2 = 1
            boolean r3 = r1.canScrollVertically(r2)
            if (r3 != 0) goto L19
            r3 = -1
            boolean r3 = r1.canScrollVertically(r3)
            if (r3 == 0) goto L20
        L19:
            boolean r1 = r1.shouldDelayChildPressedState()
            if (r1 == 0) goto L20
            return r2
        L20:
            android.view.ViewParent r0 = r0.getParent()
            goto L4
        L25:
            r0 = 0
            return r0
    }

    private static boolean isMouseEvent(android.view.MotionEvent r2) {
            r0 = 0
            int r2 = r2.getToolType(r0)
            r1 = 3
            if (r2 != r1) goto L9
            r0 = 1
        L9:
            return r0
    }

    private boolean isMultipleOfStepSize(double r3) {
            r2 = this;
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r3 = java.lang.Double.toString(r3)
            r0.<init>(r3)
            java.math.BigDecimal r3 = new java.math.BigDecimal
            float r4 = r2.stepSize
            java.lang.String r4 = java.lang.Float.toString(r4)
            r3.<init>(r4)
            java.math.MathContext r4 = java.math.MathContext.DECIMAL64
            java.math.BigDecimal r3 = r0.divide(r3, r4)
            double r3 = r3.doubleValue()
            long r0 = java.lang.Math.round(r3)
            double r0 = (double) r0
            double r0 = r0 - r3
            double r3 = java.lang.Math.abs(r0)
            r0 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 >= 0) goto L33
            r3 = 1
            goto L34
        L33:
            r3 = 0
        L34:
            return r3
    }

    private boolean isPotentialVerticalScroll(android.view.MotionEvent r1) {
            r0 = this;
            boolean r1 = isMouseEvent(r1)
            if (r1 != 0) goto Le
            boolean r1 = r0.isInVerticalScrollingContainer()
            if (r1 == 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    private boolean isSliderVisibleOnScreen() {
            r2 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.view.ViewGroup r1 = com.google.android.material.internal.ViewUtils.getContentView(r2)
            r1.getHitRect(r0)
            boolean r0 = r2.getLocalVisibleRect(r0)
            return r0
    }

    private void loadResources(android.content.res.Resources r2) {
            r1 = this;
            int r0 = com.google.android.material.R.dimen.mtrl_slider_widget_height
            int r0 = r2.getDimensionPixelSize(r0)
            r1.minWidgetHeight = r0
            int r0 = com.google.android.material.R.dimen.mtrl_slider_track_side_padding
            int r0 = r2.getDimensionPixelOffset(r0)
            r1.minTrackSidePadding = r0
            r1.trackSidePadding = r0
            int r0 = com.google.android.material.R.dimen.mtrl_slider_thumb_radius
            int r0 = r2.getDimensionPixelSize(r0)
            r1.defaultThumbRadius = r0
            int r0 = com.google.android.material.R.dimen.mtrl_slider_track_height
            int r0 = r2.getDimensionPixelSize(r0)
            r1.defaultTrackHeight = r0
            int r0 = com.google.android.material.R.dimen.mtrl_slider_tick_radius
            int r0 = r2.getDimensionPixelSize(r0)
            r1.defaultTickActiveRadius = r0
            int r0 = com.google.android.material.R.dimen.mtrl_slider_tick_radius
            int r0 = r2.getDimensionPixelSize(r0)
            r1.defaultTickInactiveRadius = r0
            int r0 = com.google.android.material.R.dimen.mtrl_slider_tick_min_spacing
            int r0 = r2.getDimensionPixelSize(r0)
            r1.minTickSpacing = r0
            int r0 = com.google.android.material.R.dimen.mtrl_slider_label_padding
            int r2 = r2.getDimensionPixelSize(r0)
            r1.labelPadding = r2
            return
    }

    private void maybeCalculateTicksCoordinates() {
            r7 = this;
            float r0 = r7.stepSize
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L8
            return
        L8:
            r7.validateConfigurationIfDirty()
            float r0 = r7.valueTo
            float r1 = r7.valueFrom
            float r0 = r0 - r1
            float r1 = r7.stepSize
            float r0 = r0 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 + r1
            int r0 = (int) r0
            int r1 = r7.trackWidth
            int r2 = r7.minTickSpacing
            int r1 = r1 / r2
            int r1 = r1 + 1
            int r0 = java.lang.Math.min(r0, r1)
            float[] r1 = r7.ticksCoordinates
            if (r1 == 0) goto L2b
            int r1 = r1.length
            int r2 = r0 * 2
            if (r1 == r2) goto L31
        L2b:
            int r1 = r0 * 2
            float[] r1 = new float[r1]
            r7.ticksCoordinates = r1
        L31:
            int r1 = r7.trackWidth
            float r1 = (float) r1
            int r2 = r0 + (-1)
            float r2 = (float) r2
            float r1 = r1 / r2
            r2 = 0
        L39:
            int r3 = r0 * 2
            if (r2 >= r3) goto L56
            float[] r3 = r7.ticksCoordinates
            int r4 = r7.trackSidePadding
            float r4 = (float) r4
            float r5 = (float) r2
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r6
            float r5 = r5 * r1
            float r4 = r4 + r5
            r3[r2] = r4
            int r4 = r2 + 1
            int r5 = r7.calculateTrackCenter()
            float r5 = (float) r5
            r3[r4] = r5
            int r2 = r2 + 2
            goto L39
        L56:
            return
    }

    private void maybeDrawCompatHalo(android.graphics.Canvas r9, int r10, int r11) {
            r8 = this;
            boolean r0 = r8.shouldDrawCompatHalo()
            if (r0 == 0) goto L42
            int r0 = r8.trackSidePadding
            float r0 = (float) r0
            java.util.ArrayList<java.lang.Float> r1 = r8.values
            int r2 = r8.focusedThumbIdx
            java.lang.Object r1 = r1.get(r2)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            float r1 = r8.normalizeValue(r1)
            float r10 = (float) r10
            float r1 = r1 * r10
            float r0 = r0 + r1
            int r10 = (int) r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L38
            int r0 = r8.haloRadius
            int r1 = r10 - r0
            float r3 = (float) r1
            int r1 = r11 - r0
            float r4 = (float) r1
            int r1 = r10 + r0
            float r5 = (float) r1
            int r0 = r0 + r11
            float r6 = (float) r0
            android.graphics.Region$Op r7 = android.graphics.Region.Op.UNION
            r2 = r9
            r2.clipRect(r3, r4, r5, r6, r7)
        L38:
            float r10 = (float) r10
            float r11 = (float) r11
            int r0 = r8.haloRadius
            float r0 = (float) r0
            android.graphics.Paint r1 = r8.haloPaint
            r9.drawCircle(r10, r11, r0, r1)
        L42:
            return
    }

    private void maybeDrawStopIndicator(android.graphics.Canvas r5, int r6) {
            r4 = this;
            int r0 = r4.trackStopIndicatorSize
            if (r0 > 0) goto L5
            return
        L5:
            java.util.ArrayList<java.lang.Float> r0 = r4.values
            int r0 = r0.size()
            r1 = 1
            if (r0 < r1) goto L2f
            java.util.ArrayList<java.lang.Float> r0 = r4.values
            int r2 = r0.size()
            int r2 = r2 - r1
            java.lang.Object r0 = r0.get(r2)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            float r2 = r4.valueTo
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L2f
            float r0 = r4.valueToX(r2)
            float r2 = (float) r6
            android.graphics.Paint r3 = r4.stopIndicatorPaint
            r5.drawPoint(r0, r2, r3)
        L2f:
            java.util.ArrayList<java.lang.Float> r0 = r4.values
            int r0 = r0.size()
            if (r0 <= r1) goto L54
            java.util.ArrayList<java.lang.Float> r0 = r4.values
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            float r1 = r4.valueFrom
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L54
            float r0 = r4.valueToX(r1)
            float r6 = (float) r6
            android.graphics.Paint r1 = r4.stopIndicatorPaint
            r5.drawPoint(r0, r6, r1)
        L54:
            return
    }

    private void maybeDrawTicks(android.graphics.Canvas r8) {
            r7 = this;
            boolean r0 = r7.tickVisible
            if (r0 == 0) goto L5e
            float r0 = r7.stepSize
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto Lc
            goto L5e
        Lc:
            float[] r0 = r7.getActiveRange()
            r1 = 0
            r2 = r0[r1]
            float[] r3 = r7.ticksCoordinates
            int r3 = r3.length
            float r3 = (float) r3
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            r5 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 - r5
            float r2 = r2 * r3
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            r3 = 1
            r0 = r0[r3]
            float[] r6 = r7.ticksCoordinates
            int r6 = r6.length
            float r6 = (float) r6
            float r6 = r6 / r4
            float r6 = r6 - r5
            float r0 = r0 * r6
            double r4 = (double) r0
            double r4 = java.lang.Math.floor(r4)
            int r0 = (int) r4
            if (r2 <= 0) goto L3f
            float[] r4 = r7.ticksCoordinates
            int r5 = r2 * 2
            android.graphics.Paint r6 = r7.inactiveTicksPaint
            r8.drawPoints(r4, r1, r5, r6)
        L3f:
            if (r2 > r0) goto L4f
            float[] r1 = r7.ticksCoordinates
            int r4 = r2 * 2
            int r2 = r0 - r2
            int r2 = r2 + r3
            int r2 = r2 * 2
            android.graphics.Paint r5 = r7.activeTicksPaint
            r8.drawPoints(r1, r4, r2, r5)
        L4f:
            int r0 = r0 + r3
            int r0 = r0 * 2
            float[] r1 = r7.ticksCoordinates
            int r2 = r1.length
            if (r0 >= r2) goto L5e
            int r2 = r1.length
            int r2 = r2 - r0
            android.graphics.Paint r3 = r7.inactiveTicksPaint
            r8.drawPoints(r1, r0, r2, r3)
        L5e:
            return
    }

    private boolean maybeIncreaseTrackSidePadding() {
            r6 = this;
            int r0 = r6.thumbWidth
            int r0 = r0 / 2
            int r1 = r6.defaultThumbRadius
            int r0 = r0 - r1
            r1 = 0
            int r0 = java.lang.Math.max(r0, r1)
            int r2 = r6.trackHeight
            int r3 = r6.defaultTrackHeight
            int r2 = r2 - r3
            int r2 = r2 / 2
            int r2 = java.lang.Math.max(r2, r1)
            int r3 = r6.tickActiveRadius
            int r4 = r6.defaultTickActiveRadius
            int r3 = r3 - r4
            int r3 = java.lang.Math.max(r3, r1)
            int r4 = r6.tickInactiveRadius
            int r5 = r6.defaultTickInactiveRadius
            int r4 = r4 - r5
            int r4 = java.lang.Math.max(r4, r1)
            int r5 = r6.minTrackSidePadding
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = java.lang.Math.max(r3, r4)
            int r0 = java.lang.Math.max(r0, r2)
            int r5 = r5 + r0
            int r0 = r6.trackSidePadding
            if (r0 != r5) goto L3d
            return r1
        L3d:
            r6.trackSidePadding = r5
            boolean r0 = androidx.core.view.ViewCompat.isLaidOut(r6)
            if (r0 == 0) goto L4c
            int r0 = r6.getWidth()
            r6.updateTrackWidth(r0)
        L4c:
            r0 = 1
            return r0
    }

    private boolean maybeIncreaseWidgetHeight() {
            r3 = this;
            int r0 = r3.getPaddingTop()
            int r1 = r3.getPaddingBottom()
            int r0 = r0 + r1
            int r1 = r3.trackHeight
            int r1 = r1 + r0
            int r0 = r3.thumbHeight
            int r2 = r3.getPaddingTop()
            int r0 = r0 + r2
            int r2 = r3.getPaddingBottom()
            int r0 = r0 + r2
            int r2 = r3.minWidgetHeight
            int r0 = java.lang.Math.max(r1, r0)
            int r0 = java.lang.Math.max(r2, r0)
            int r1 = r3.widgetHeight
            if (r0 != r1) goto L28
            r0 = 0
            return r0
        L28:
            r3.widgetHeight = r0
            r0 = 1
            return r0
    }

    private boolean moveFocus(int r12) {
            r11 = this;
            int r0 = r11.focusedThumbIdx
            long r1 = (long) r0
            long r3 = (long) r12
            long r5 = r1 + r3
            java.util.ArrayList<java.lang.Float> r12 = r11.values
            int r12 = r12.size()
            r1 = 1
            int r12 = r12 - r1
            long r9 = (long) r12
            r7 = 0
            long r2 = androidx.core.math.MathUtils.clamp(r5, r7, r9)
            int r12 = (int) r2
            r11.focusedThumbIdx = r12
            if (r12 != r0) goto L1c
            r12 = 0
            return r12
        L1c:
            int r0 = r11.activeThumbIdx
            r2 = -1
            if (r0 == r2) goto L23
            r11.activeThumbIdx = r12
        L23:
            r11.updateHaloHotspot()
            r11.postInvalidate()
            return r1
    }

    private boolean moveFocusInAbsoluteDirection(int r2) {
            r1 = this;
            boolean r0 = r1.isRtl()
            if (r0 == 0) goto Lf
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 != r0) goto Le
            r2 = 2147483647(0x7fffffff, float:NaN)
            goto Lf
        Le:
            int r2 = -r2
        Lf:
            boolean r2 = r1.moveFocus(r2)
            return r2
    }

    private float normalizeValue(float r3) {
            r2 = this;
            float r0 = r2.valueFrom
            float r3 = r3 - r0
            float r1 = r2.valueTo
            float r1 = r1 - r0
            float r3 = r3 / r1
            boolean r0 = r2.isRtl()
            if (r0 == 0) goto L11
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r3
            return r0
        L11:
            return r3
    }

    private java.lang.Boolean onKeyDownNoActiveThumb(int r4, android.view.KeyEvent r5) {
            r3 = this;
            r0 = 61
            r1 = -1
            r2 = 1
            if (r4 == r0) goto L47
            r5 = 66
            if (r4 == r5) goto L3b
            r5 = 81
            if (r4 == r5) goto L33
            r5 = 69
            if (r4 == r5) goto L2b
            r5 = 70
            if (r4 == r5) goto L33
            switch(r4) {
                case 21: goto L23;
                case 22: goto L1b;
                case 23: goto L3b;
                default: goto L19;
            }
        L19:
            r4 = 0
            return r4
        L1b:
            r3.moveFocusInAbsoluteDirection(r2)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        L23:
            r3.moveFocusInAbsoluteDirection(r1)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        L2b:
            r3.moveFocus(r1)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        L33:
            r3.moveFocus(r2)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        L3b:
            int r4 = r3.focusedThumbIdx
            r3.activeThumbIdx = r4
            r3.postInvalidate()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        L47:
            boolean r4 = r5.hasNoModifiers()
            if (r4 == 0) goto L56
            boolean r4 = r3.moveFocus(r2)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L56:
            boolean r4 = r5.isShiftPressed()
            if (r4 == 0) goto L65
            boolean r4 = r3.moveFocus(r1)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L65:
            r4 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
    }

    private void onStartTrackingTouch() {
            r2 = this;
            java.util.List<T extends com.google.android.material.slider.BaseOnSliderTouchListener<S>> r0 = r2.touchListeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.google.android.material.slider.BaseOnSliderTouchListener r1 = (com.google.android.material.slider.BaseOnSliderTouchListener) r1
            r1.onStartTrackingTouch(r2)
            goto L6
        L16:
            return
    }

    private void onStopTrackingTouch() {
            r2 = this;
            java.util.List<T extends com.google.android.material.slider.BaseOnSliderTouchListener<S>> r0 = r2.touchListeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.google.android.material.slider.BaseOnSliderTouchListener r1 = (com.google.android.material.slider.BaseOnSliderTouchListener) r1
            r1.onStopTrackingTouch(r2)
            goto L6
        L16:
            return
    }

    private void positionLabel(com.google.android.material.tooltip.TooltipDrawable r4, float r5) {
            r3 = this;
            int r0 = r3.trackSidePadding
            float r5 = r3.normalizeValue(r5)
            int r1 = r3.trackWidth
            float r1 = (float) r1
            float r5 = r5 * r1
            int r5 = (int) r5
            int r0 = r0 + r5
            int r5 = r4.getIntrinsicWidth()
            int r5 = r5 / 2
            int r0 = r0 - r5
            int r5 = r3.calculateTrackCenter()
            int r1 = r3.labelPadding
            int r2 = r3.thumbHeight
            int r2 = r2 / 2
            int r1 = r1 + r2
            int r5 = r5 - r1
            int r1 = r4.getIntrinsicHeight()
            int r1 = r5 - r1
            int r2 = r4.getIntrinsicWidth()
            int r2 = r2 + r0
            r4.setBounds(r0, r1, r2, r5)
            android.graphics.Rect r5 = new android.graphics.Rect
            android.graphics.Rect r0 = r4.getBounds()
            r5.<init>(r0)
            android.view.ViewGroup r0 = com.google.android.material.internal.ViewUtils.getContentView(r3)
            com.google.android.material.internal.DescendantOffsetUtils.offsetDescendantRect(r0, r3, r5)
            r4.setBounds(r5)
            return
    }

    private void processAttributes(android.content.Context r8, android.util.AttributeSet r9, int r10) {
            r7 = this;
            int[] r2 = com.google.android.material.R.styleable.Slider
            int r4 = com.google.android.material.slider.BaseSlider.DEF_STYLE_RES
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r10 = com.google.android.material.R.styleable.Slider_labelStyle
            int r0 = com.google.android.material.R.style.Widget_MaterialComponents_Tooltip
            int r10 = r9.getResourceId(r10, r0)
            r7.labelStyle = r10
            int r10 = com.google.android.material.R.styleable.Slider_android_valueFrom
            r0 = 0
            float r10 = r9.getFloat(r10, r0)
            r7.valueFrom = r10
            int r10 = com.google.android.material.R.styleable.Slider_android_valueTo
            r1 = 1065353216(0x3f800000, float:1.0)
            float r10 = r9.getFloat(r10, r1)
            r7.valueTo = r10
            r10 = 1
            java.lang.Float[] r1 = new java.lang.Float[r10]
            float r2 = r7.valueFrom
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r1[r6] = r2
            r7.setValues(r1)
            int r1 = com.google.android.material.R.styleable.Slider_android_stepSize
            float r1 = r9.getFloat(r1, r0)
            r7.stepSize = r1
            android.content.Context r1 = r7.getContext()
            r2 = 48
            float r1 = com.google.android.material.internal.ViewUtils.dpToPx(r1, r2)
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            float r1 = (float) r1
            int r2 = com.google.android.material.R.styleable.Slider_minTouchTargetSize
            float r1 = r9.getDimension(r2, r1)
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            r7.minTouchTargetSize = r1
            int r1 = com.google.android.material.R.styleable.Slider_trackColor
            boolean r1 = r9.hasValue(r1)
            if (r1 == 0) goto L6a
            int r2 = com.google.android.material.R.styleable.Slider_trackColor
            goto L6c
        L6a:
            int r2 = com.google.android.material.R.styleable.Slider_trackColorInactive
        L6c:
            if (r1 == 0) goto L71
            int r1 = com.google.android.material.R.styleable.Slider_trackColor
            goto L73
        L71:
            int r1 = com.google.android.material.R.styleable.Slider_trackColorActive
        L73:
            android.content.res.ColorStateList r2 = com.google.android.material.resources.MaterialResources.getColorStateList(r8, r9, r2)
            if (r2 == 0) goto L7a
            goto L80
        L7a:
            int r2 = com.google.android.material.R.color.material_slider_inactive_track_color
            android.content.res.ColorStateList r2 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r8, r2)
        L80:
            r7.setTrackInactiveTintList(r2)
            android.content.res.ColorStateList r1 = com.google.android.material.resources.MaterialResources.getColorStateList(r8, r9, r1)
            if (r1 == 0) goto L8a
            goto L90
        L8a:
            int r1 = com.google.android.material.R.color.material_slider_active_track_color
            android.content.res.ColorStateList r1 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r8, r1)
        L90:
            r7.setTrackActiveTintList(r1)
            int r1 = com.google.android.material.R.styleable.Slider_thumbColor
            android.content.res.ColorStateList r1 = com.google.android.material.resources.MaterialResources.getColorStateList(r8, r9, r1)
            com.google.android.material.shape.MaterialShapeDrawable r2 = r7.defaultThumbDrawable
            r2.setFillColor(r1)
            int r1 = com.google.android.material.R.styleable.Slider_thumbStrokeColor
            boolean r1 = r9.hasValue(r1)
            if (r1 == 0) goto Laf
            int r1 = com.google.android.material.R.styleable.Slider_thumbStrokeColor
            android.content.res.ColorStateList r1 = com.google.android.material.resources.MaterialResources.getColorStateList(r8, r9, r1)
            r7.setThumbStrokeColor(r1)
        Laf:
            int r1 = com.google.android.material.R.styleable.Slider_thumbStrokeWidth
            float r1 = r9.getDimension(r1, r0)
            r7.setThumbStrokeWidth(r1)
            int r1 = com.google.android.material.R.styleable.Slider_haloColor
            android.content.res.ColorStateList r1 = com.google.android.material.resources.MaterialResources.getColorStateList(r8, r9, r1)
            if (r1 == 0) goto Lc1
            goto Lc7
        Lc1:
            int r1 = com.google.android.material.R.color.material_slider_halo_color
            android.content.res.ColorStateList r1 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r8, r1)
        Lc7:
            r7.setHaloTintList(r1)
            int r1 = com.google.android.material.R.styleable.Slider_tickVisible
            boolean r1 = r9.getBoolean(r1, r10)
            r7.tickVisible = r1
            int r1 = com.google.android.material.R.styleable.Slider_tickColor
            boolean r1 = r9.hasValue(r1)
            if (r1 == 0) goto Ldd
            int r2 = com.google.android.material.R.styleable.Slider_tickColor
            goto Ldf
        Ldd:
            int r2 = com.google.android.material.R.styleable.Slider_tickColorInactive
        Ldf:
            if (r1 == 0) goto Le4
            int r1 = com.google.android.material.R.styleable.Slider_tickColor
            goto Le6
        Le4:
            int r1 = com.google.android.material.R.styleable.Slider_tickColorActive
        Le6:
            android.content.res.ColorStateList r2 = com.google.android.material.resources.MaterialResources.getColorStateList(r8, r9, r2)
            if (r2 == 0) goto Led
            goto Lf3
        Led:
            int r2 = com.google.android.material.R.color.material_slider_inactive_tick_marks_color
            android.content.res.ColorStateList r2 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r8, r2)
        Lf3:
            r7.setTickInactiveTintList(r2)
            android.content.res.ColorStateList r1 = com.google.android.material.resources.MaterialResources.getColorStateList(r8, r9, r1)
            if (r1 == 0) goto Lfd
            goto L103
        Lfd:
            int r1 = com.google.android.material.R.color.material_slider_active_tick_marks_color
            android.content.res.ColorStateList r1 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r8, r1)
        L103:
            r7.setTickActiveTintList(r1)
            int r8 = com.google.android.material.R.styleable.Slider_thumbTrackGapSize
            int r8 = r9.getDimensionPixelSize(r8, r6)
            r7.setThumbTrackGapSize(r8)
            int r8 = com.google.android.material.R.styleable.Slider_trackStopIndicatorSize
            int r8 = r9.getDimensionPixelSize(r8, r6)
            r7.setTrackStopIndicatorSize(r8)
            int r8 = com.google.android.material.R.styleable.Slider_trackInsideCornerSize
            int r8 = r9.getDimensionPixelSize(r8, r6)
            r7.setTrackInsideCornerSize(r8)
            int r8 = com.google.android.material.R.styleable.Slider_thumbRadius
            int r8 = r9.getDimensionPixelSize(r8, r6)
            int r1 = com.google.android.material.R.styleable.Slider_thumbWidth
            int r8 = r8 * 2
            int r1 = r9.getDimensionPixelSize(r1, r8)
            int r2 = com.google.android.material.R.styleable.Slider_thumbHeight
            int r8 = r9.getDimensionPixelSize(r2, r8)
            r7.setThumbWidth(r1)
            r7.setThumbHeight(r8)
            int r8 = com.google.android.material.R.styleable.Slider_haloRadius
            int r8 = r9.getDimensionPixelSize(r8, r6)
            r7.setHaloRadius(r8)
            int r8 = com.google.android.material.R.styleable.Slider_thumbElevation
            float r8 = r9.getDimension(r8, r0)
            r7.setThumbElevation(r8)
            int r8 = com.google.android.material.R.styleable.Slider_trackHeight
            int r8 = r9.getDimensionPixelSize(r8, r6)
            r7.setTrackHeight(r8)
            int r8 = com.google.android.material.R.styleable.Slider_tickRadiusActive
            int r0 = r7.trackStopIndicatorSize
            int r0 = r0 / 2
            int r8 = r9.getDimensionPixelSize(r8, r0)
            r7.setTickActiveRadius(r8)
            int r8 = com.google.android.material.R.styleable.Slider_tickRadiusInactive
            int r0 = r7.trackStopIndicatorSize
            int r0 = r0 / 2
            int r8 = r9.getDimensionPixelSize(r8, r0)
            r7.setTickInactiveRadius(r8)
            int r8 = com.google.android.material.R.styleable.Slider_labelBehavior
            int r8 = r9.getInt(r8, r6)
            r7.setLabelBehavior(r8)
            int r8 = com.google.android.material.R.styleable.Slider_android_enabled
            boolean r8 = r9.getBoolean(r8, r10)
            if (r8 != 0) goto L184
            r7.setEnabled(r6)
        L184:
            r9.recycle()
            return
    }

    private void scheduleAccessibilityEventSender(int r3) {
            r2 = this;
            com.google.android.material.slider.BaseSlider<S, L, T>$AccessibilityEventSender r0 = r2.accessibilityEventSender
            if (r0 != 0) goto Ld
            com.google.android.material.slider.BaseSlider$AccessibilityEventSender r0 = new com.google.android.material.slider.BaseSlider$AccessibilityEventSender
            r1 = 0
            r0.<init>(r2, r1)
            r2.accessibilityEventSender = r0
            goto L10
        Ld:
            r2.removeCallbacks(r0)
        L10:
            com.google.android.material.slider.BaseSlider<S, L, T>$AccessibilityEventSender r0 = r2.accessibilityEventSender
            r0.setVirtualViewId(r3)
            com.google.android.material.slider.BaseSlider<S, L, T>$AccessibilityEventSender r3 = r2.accessibilityEventSender
            r0 = 200(0xc8, double:9.9E-322)
            r2.postDelayed(r3, r0)
            return
    }

    private void setValueForLabel(com.google.android.material.tooltip.TooltipDrawable r2, float r3) {
            r1 = this;
            java.lang.String r0 = r1.formatValue(r3)
            r2.setText(r0)
            r1.positionLabel(r2, r3)
            com.google.android.material.internal.ViewOverlayImpl r3 = com.google.android.material.internal.ViewUtils.getContentViewOverlay(r1)
            r3.add(r2)
            return
    }

    private void setValuesInternal(java.util.ArrayList<java.lang.Float> r3) {
            r2 = this;
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L33
            java.util.Collections.sort(r3)
            java.util.ArrayList<java.lang.Float> r0 = r2.values
            int r0 = r0.size()
            int r1 = r3.size()
            if (r0 != r1) goto L1e
            java.util.ArrayList<java.lang.Float> r0 = r2.values
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L1e
            return
        L1e:
            r2.values = r3
            r3 = 1
            r2.dirtyConfig = r3
            r3 = 0
            r2.focusedThumbIdx = r3
            r2.updateHaloHotspot()
            r2.createLabelPool()
            r2.dispatchOnChangedProgrammatically()
            r2.postInvalidate()
            return
        L33:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "At least one value must be set"
            r3.<init>(r0)
            throw r3
    }

    private boolean shouldAlwaysShowLabel() {
            r2 = this;
            int r0 = r2.labelBehavior
            r1 = 3
            if (r0 != r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    private boolean shouldDrawCompatHalo() {
            r1 = this;
            boolean r0 = r1.forceDrawCompatHalo
            if (r0 != 0) goto Lf
            android.graphics.drawable.Drawable r0 = r1.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.RippleDrawable
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

    private boolean snapActiveThumbToValue(float r2) {
            r1 = this;
            int r0 = r1.activeThumbIdx
            boolean r2 = r1.snapThumbToValue(r0, r2)
            return r2
    }

    private double snapPosition(float r6) {
            r5 = this;
            float r0 = r5.stepSize
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L18
            float r1 = r5.valueTo
            float r2 = r5.valueFrom
            float r1 = r1 - r2
            float r1 = r1 / r0
            int r0 = (int) r1
            float r1 = (float) r0
            float r6 = r6 * r1
            int r6 = java.lang.Math.round(r6)
            double r1 = (double) r6
            double r3 = (double) r0
            double r1 = r1 / r3
            return r1
        L18:
            double r0 = (double) r6
            return r0
    }

    private boolean snapThumbToValue(int r5, float r6) {
            r4 = this;
            r4.focusedThumbIdx = r5
            java.util.ArrayList<java.lang.Float> r0 = r4.values
            java.lang.Object r0 = r0.get(r5)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            float r0 = r6 - r0
            float r0 = java.lang.Math.abs(r0)
            double r0 = (double) r0
            r2 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L20
            r5 = 0
            return r5
        L20:
            float r6 = r4.getClampedValue(r5, r6)
            java.util.ArrayList<java.lang.Float> r0 = r4.values
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r0.set(r5, r6)
            r4.dispatchOnChangedFromUser(r5)
            r5 = 1
            return r5
    }

    private boolean snapTouchPosition() {
            r1 = this;
            float r0 = r1.getValueOfTouchPosition()
            boolean r0 = r1.snapActiveThumbToValue(r0)
            return r0
    }

    private void updateHaloHotspot() {
            r6 = this;
            boolean r0 = r6.shouldDrawCompatHalo()
            if (r0 != 0) goto L3e
            int r0 = r6.getMeasuredWidth()
            if (r0 <= 0) goto L3e
            android.graphics.drawable.Drawable r0 = r6.getBackground()
            boolean r1 = r0 instanceof android.graphics.drawable.RippleDrawable
            if (r1 == 0) goto L3e
            java.util.ArrayList<java.lang.Float> r1 = r6.values
            int r2 = r6.focusedThumbIdx
            java.lang.Object r1 = r1.get(r2)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            float r1 = r6.normalizeValue(r1)
            int r2 = r6.trackWidth
            float r2 = (float) r2
            float r1 = r1 * r2
            int r2 = r6.trackSidePadding
            float r2 = (float) r2
            float r1 = r1 + r2
            int r1 = (int) r1
            int r2 = r6.calculateTrackCenter()
            int r3 = r6.haloRadius
            int r4 = r1 - r3
            int r5 = r2 - r3
            int r1 = r1 + r3
            int r2 = r2 + r3
            androidx.core.graphics.drawable.DrawableCompat.setHotspotBounds(r0, r4, r5, r1, r2)
        L3e:
            return
    }

    private void updateLabels() {
            r3 = this;
            int r0 = r3.labelBehavior
            if (r0 == 0) goto L3c
            r1 = 1
            if (r0 == r1) goto L3c
            r1 = 2
            if (r0 == r1) goto L38
            r1 = 3
            if (r0 != r1) goto L21
            boolean r0 = r3.isEnabled()
            if (r0 == 0) goto L1d
            boolean r0 = r3.isSliderVisibleOnScreen()
            if (r0 == 0) goto L1d
            r3.ensureLabelsAdded()
            goto L4e
        L1d:
            r3.ensureLabelsRemoved()
            goto L4e
        L21:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected labelBehavior: "
            r1.<init>(r2)
            int r2 = r3.labelBehavior
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L38:
            r3.ensureLabelsRemoved()
            goto L4e
        L3c:
            int r0 = r3.activeThumbIdx
            r1 = -1
            if (r0 == r1) goto L4b
            boolean r0 = r3.isEnabled()
            if (r0 == 0) goto L4b
            r3.ensureLabelsAdded()
            goto L4e
        L4b:
            r3.ensureLabelsRemoved()
        L4e:
            return
    }

    private void updateTrack(android.graphics.Canvas r8, android.graphics.Paint r9, android.graphics.RectF r10, com.google.android.material.slider.BaseSlider.FullCornerDirection r11) {
            r7 = this;
            int r0 = r7.trackHeight
            float r1 = (float) r0
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            float r0 = (float) r0
            float r0 = r0 / r2
            int[] r3 = com.google.android.material.slider.BaseSlider.AnonymousClass3.$SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection
            int r4 = r11.ordinal()
            r3 = r3[r4]
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == r6) goto L21
            if (r3 == r5) goto L1e
            if (r3 == r4) goto L1a
            goto L25
        L1a:
            int r1 = r7.trackInsideCornerSize
            float r1 = (float) r1
            goto L25
        L1e:
            int r0 = r7.trackInsideCornerSize
            goto L24
        L21:
            int r0 = r7.trackInsideCornerSize
            float r1 = (float) r0
        L24:
            float r0 = (float) r0
        L25:
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r9.setStyle(r3)
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.BUTT
            r9.setStrokeCap(r3)
            r9.setAntiAlias(r6)
            android.graphics.Path r3 = r7.trackPath
            r3.reset()
            float r3 = r10.width()
            float r6 = r1 + r0
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 < 0) goto L52
            android.graphics.Path r11 = r7.trackPath
            float[] r0 = r7.getCornerRadii(r1, r0)
            android.graphics.Path$Direction r1 = android.graphics.Path.Direction.CW
            r11.addRoundRect(r10, r0, r1)
            android.graphics.Path r10 = r7.trackPath
            r8.drawPath(r10, r9)
            goto Lb0
        L52:
            float r3 = java.lang.Math.min(r1, r0)
            float r0 = java.lang.Math.max(r1, r0)
            r8.save()
            android.graphics.Path r1 = r7.trackPath
            android.graphics.Path$Direction r6 = android.graphics.Path.Direction.CW
            r1.addRoundRect(r10, r3, r3, r6)
            android.graphics.Path r1 = r7.trackPath
            r8.clipPath(r1)
            int[] r1 = com.google.android.material.slider.BaseSlider.AnonymousClass3.$SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection
            int r11 = r11.ordinal()
            r11 = r1[r11]
            if (r11 == r5) goto L99
            if (r11 == r4) goto L89
            android.graphics.RectF r11 = r7.cornerRect
            float r1 = r10.centerX()
            float r1 = r1 - r0
            float r2 = r10.top
            float r3 = r10.centerX()
            float r3 = r3 + r0
            float r10 = r10.bottom
            r11.set(r1, r2, r3, r10)
            goto La8
        L89:
            android.graphics.RectF r11 = r7.cornerRect
            float r1 = r10.right
            float r2 = r2 * r0
            float r1 = r1 - r2
            float r2 = r10.top
            float r3 = r10.right
            float r10 = r10.bottom
            r11.set(r1, r2, r3, r10)
            goto La8
        L99:
            android.graphics.RectF r11 = r7.cornerRect
            float r1 = r10.left
            float r3 = r10.top
            float r4 = r10.left
            float r2 = r2 * r0
            float r4 = r4 + r2
            float r10 = r10.bottom
            r11.set(r1, r3, r4, r10)
        La8:
            android.graphics.RectF r10 = r7.cornerRect
            r8.drawRoundRect(r10, r0, r0, r9)
            r8.restore()
        Lb0:
            return
    }

    private void updateTrackWidth(int r2) {
            r1 = this;
            int r0 = r1.trackSidePadding
            int r0 = r0 * 2
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r2, r0)
            r1.trackWidth = r2
            r1.maybeCalculateTicksCoordinates()
            return
    }

    private void updateWidgetLayout() {
            r2 = this;
            boolean r0 = r2.maybeIncreaseWidgetHeight()
            boolean r1 = r2.maybeIncreaseTrackSidePadding()
            if (r0 == 0) goto Le
            r2.requestLayout()
            goto L13
        Le:
            if (r1 == 0) goto L13
            r2.postInvalidate()
        L13:
            return
    }

    private void validateConfigurationIfDirty() {
            r1 = this;
            boolean r0 = r1.dirtyConfig
            if (r0 == 0) goto L19
            r1.validateValueFrom()
            r1.validateValueTo()
            r1.validateStepSize()
            r1.validateValues()
            r1.validateMinSeparation()
            r1.warnAboutFloatingPointError()
            r0 = 0
            r1.dirtyConfig = r0
        L19:
            return
    }

    private void validateMinSeparation() {
            r4 = this;
            float r0 = r4.getMinSeparation()
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 < 0) goto L5f
            float r2 = r4.stepSize
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 <= 0) goto L5e
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L5e
            int r1 = r4.separationUnit
            r3 = 1
            if (r1 != r3) goto L44
            int r1 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r1 < 0) goto L24
            double r1 = (double) r0
            boolean r1 = r4.isMultipleOfStepSize(r1)
            if (r1 == 0) goto L24
            goto L5e
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            float r2 = r4.stepSize
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            float r3 = r4.stepSize
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2, r3}
            java.lang.String r2 = "minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            r1.<init>(r0)
            throw r1
        L44:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            float r2 = r4.stepSize
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}
            java.lang.String r2 = "minSeparation(%s) cannot be set as a dimension when using stepSize(%s)"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            r1.<init>(r0)
            throw r1
        L5e:
            return
        L5f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "minSeparation(%s) must be greater or equal to 0"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            r1.<init>(r0)
            throw r1
    }

    private void validateStepSize() {
            r4 = this;
            float r0 = r4.stepSize
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L32
            float r0 = r4.valueTo
            boolean r0 = r4.valueLandsOnTick(r0)
            if (r0 == 0) goto L10
            goto L32
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            float r1 = r4.stepSize
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            float r2 = r4.valueFrom
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            float r3 = r4.valueTo
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r2 = "The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L32:
            return
    }

    private void validateValueFrom() {
            r3 = this;
            float r0 = r3.valueFrom
            float r1 = r3.valueTo
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L9
            return
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            float r1 = r3.valueFrom
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            float r2 = r3.valueTo
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r2 = "valueFrom(%s) must be smaller than valueTo(%s)"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
    }

    private void validateValueTo() {
            r3 = this;
            float r0 = r3.valueTo
            float r1 = r3.valueFrom
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L9
            return
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            float r1 = r3.valueTo
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            float r2 = r3.valueFrom
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r2 = "valueTo(%s) must be greater than valueFrom(%s)"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
    }

    private void validateValues() {
            r5 = this;
            java.util.ArrayList<java.lang.Float> r0 = r5.values
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L76
            java.lang.Object r1 = r0.next()
            java.lang.Float r1 = (java.lang.Float) r1
            float r2 = r1.floatValue()
            float r3 = r5.valueFrom
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L5a
            float r2 = r1.floatValue()
            float r3 = r5.valueTo
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L5a
            float r2 = r5.stepSize
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L6
            float r2 = r1.floatValue()
            boolean r2 = r5.valueLandsOnTick(r2)
            if (r2 == 0) goto L38
            goto L6
        L38:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            float r2 = r5.valueFrom
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            float r3 = r5.stepSize
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            float r4 = r5.stepSize
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3, r4}
            java.lang.String r2 = "Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L5a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            float r2 = r5.valueFrom
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            float r3 = r5.valueTo
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r2 = "Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L76:
            return
    }

    private boolean valueLandsOnTick(float r3) {
            r2 = this;
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r3 = java.lang.Float.toString(r3)
            r0.<init>(r3)
            java.math.BigDecimal r3 = new java.math.BigDecimal
            float r1 = r2.valueFrom
            java.lang.String r1 = java.lang.Float.toString(r1)
            r3.<init>(r1)
            java.math.MathContext r1 = java.math.MathContext.DECIMAL64
            java.math.BigDecimal r3 = r0.subtract(r3, r1)
            double r0 = r3.doubleValue()
            boolean r3 = r2.isMultipleOfStepSize(r0)
            return r3
    }

    private float valueToX(float r2) {
            r1 = this;
            float r2 = r1.normalizeValue(r2)
            int r0 = r1.trackWidth
            float r0 = (float) r0
            float r2 = r2 * r0
            int r0 = r1.trackSidePadding
            float r0 = (float) r0
            float r2 = r2 + r0
            return r2
    }

    private void warnAboutFloatingPointError() {
            r4 = this;
            float r0 = r4.stepSize
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L8
            return
        L8:
            int r1 = (int) r0
            float r1 = (float) r1
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            java.lang.String r2 = "Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly."
            if (r1 == 0) goto L23
            java.lang.String r1 = com.google.android.material.slider.BaseSlider.TAG
            java.lang.String r3 = "stepSize"
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0}
            java.lang.String r0 = java.lang.String.format(r2, r0)
            android.util.Log.w(r1, r0)
        L23:
            float r0 = r4.valueFrom
            int r1 = (int) r0
            float r1 = (float) r1
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 == 0) goto L3e
            java.lang.String r1 = com.google.android.material.slider.BaseSlider.TAG
            java.lang.String r3 = "valueFrom"
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0}
            java.lang.String r0 = java.lang.String.format(r2, r0)
            android.util.Log.w(r1, r0)
        L3e:
            float r0 = r4.valueTo
            int r1 = (int) r0
            float r1 = (float) r1
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 == 0) goto L59
            java.lang.String r1 = com.google.android.material.slider.BaseSlider.TAG
            java.lang.String r3 = "valueTo"
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0}
            java.lang.String r0 = java.lang.String.format(r2, r0)
            android.util.Log.w(r1, r0)
        L59:
            return
    }

    public void addOnChangeListener(L r2) {
            r1 = this;
            java.util.List<L extends com.google.android.material.slider.BaseOnChangeListener<S>> r0 = r1.changeListeners
            r0.add(r2)
            return
    }

    public void addOnSliderTouchListener(T r2) {
            r1 = this;
            java.util.List<T extends com.google.android.material.slider.BaseOnSliderTouchListener<S>> r0 = r1.touchListeners
            r0.add(r2)
            return
    }

    public void clearOnChangeListeners() {
            r1 = this;
            java.util.List<L extends com.google.android.material.slider.BaseOnChangeListener<S>> r0 = r1.changeListeners
            r0.clear()
            return
    }

    public void clearOnSliderTouchListeners() {
            r1 = this;
            java.util.List<T extends com.google.android.material.slider.BaseOnSliderTouchListener<S>> r0 = r1.touchListeners
            r0.clear()
            return
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(android.view.MotionEvent r2) {
            r1 = this;
            com.google.android.material.slider.BaseSlider$AccessibilityHelper r0 = r1.accessibilityHelper
            boolean r0 = r0.dispatchHoverEvent(r2)
            if (r0 != 0) goto L11
            boolean r2 = super.dispatchHoverEvent(r2)
            if (r2 == 0) goto Lf
            goto L11
        Lf:
            r2 = 0
            goto L12
        L11:
            r2 = 1
        L12:
            return r2
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent r1) {
            r0 = this;
            boolean r1 = super.dispatchKeyEvent(r1)
            return r1
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
            r3 = this;
            super.drawableStateChanged()
            android.graphics.Paint r0 = r3.inactiveTrackPaint
            android.content.res.ColorStateList r1 = r3.trackColorInactive
            int r1 = r3.getColorForState(r1)
            r0.setColor(r1)
            android.graphics.Paint r0 = r3.activeTrackPaint
            android.content.res.ColorStateList r1 = r3.trackColorActive
            int r1 = r3.getColorForState(r1)
            r0.setColor(r1)
            android.graphics.Paint r0 = r3.inactiveTicksPaint
            android.content.res.ColorStateList r1 = r3.tickColorInactive
            int r1 = r3.getColorForState(r1)
            r0.setColor(r1)
            android.graphics.Paint r0 = r3.activeTicksPaint
            android.content.res.ColorStateList r1 = r3.tickColorActive
            int r1 = r3.getColorForState(r1)
            r0.setColor(r1)
            android.graphics.Paint r0 = r3.stopIndicatorPaint
            android.content.res.ColorStateList r1 = r3.trackColorActive
            int r1 = r3.getColorForState(r1)
            r0.setColor(r1)
            java.util.List<com.google.android.material.tooltip.TooltipDrawable> r0 = r3.labels
            java.util.Iterator r0 = r0.iterator()
        L40:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5a
            java.lang.Object r1 = r0.next()
            com.google.android.material.tooltip.TooltipDrawable r1 = (com.google.android.material.tooltip.TooltipDrawable) r1
            boolean r2 = r1.isStateful()
            if (r2 == 0) goto L40
            int[] r2 = r3.getDrawableState()
            r1.setState(r2)
            goto L40
        L5a:
            com.google.android.material.shape.MaterialShapeDrawable r0 = r3.defaultThumbDrawable
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L6b
            com.google.android.material.shape.MaterialShapeDrawable r0 = r3.defaultThumbDrawable
            int[] r1 = r3.getDrawableState()
            r0.setState(r1)
        L6b:
            android.graphics.Paint r0 = r3.haloPaint
            android.content.res.ColorStateList r1 = r3.haloColor
            int r1 = r3.getColorForState(r1)
            r0.setColor(r1)
            android.graphics.Paint r0 = r3.haloPaint
            r1 = 63
            r0.setAlpha(r1)
            return
    }

    void forceDrawCompatHalo(boolean r1) {
            r0 = this;
            r0.forceDrawCompatHalo = r1
            return
    }

    @Override // android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
            r1 = this;
            java.lang.Class<android.widget.SeekBar> r0 = android.widget.SeekBar.class
            java.lang.String r0 = r0.getName()
            return r0
    }

    final int getAccessibilityFocusedVirtualViewId() {
            r1 = this;
            com.google.android.material.slider.BaseSlider$AccessibilityHelper r0 = r1.accessibilityHelper
            int r0 = r0.getAccessibilityFocusedVirtualViewId()
            return r0
    }

    public int getActiveThumbIndex() {
            r1 = this;
            int r0 = r1.activeThumbIdx
            return r0
    }

    public int getFocusedThumbIndex() {
            r1 = this;
            int r0 = r1.focusedThumbIdx
            return r0
    }

    public int getHaloRadius() {
            r1 = this;
            int r0 = r1.haloRadius
            return r0
    }

    public android.content.res.ColorStateList getHaloTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.haloColor
            return r0
    }

    public int getLabelBehavior() {
            r1 = this;
            int r0 = r1.labelBehavior
            return r0
    }

    protected float getMinSeparation() {
            r1 = this;
            r0 = 0
            return r0
    }

    public float getStepSize() {
            r1 = this;
            float r0 = r1.stepSize
            return r0
    }

    public float getThumbElevation() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.defaultThumbDrawable
            float r0 = r0.getElevation()
            return r0
    }

    public int getThumbHeight() {
            r1 = this;
            int r0 = r1.thumbHeight
            return r0
    }

    public int getThumbRadius() {
            r1 = this;
            int r0 = r1.thumbWidth
            int r0 = r0 / 2
            return r0
    }

    public android.content.res.ColorStateList getThumbStrokeColor() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.defaultThumbDrawable
            android.content.res.ColorStateList r0 = r0.getStrokeColor()
            return r0
    }

    public float getThumbStrokeWidth() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.defaultThumbDrawable
            float r0 = r0.getStrokeWidth()
            return r0
    }

    public android.content.res.ColorStateList getThumbTintList() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.defaultThumbDrawable
            android.content.res.ColorStateList r0 = r0.getFillColor()
            return r0
    }

    public int getThumbTrackGapSize() {
            r1 = this;
            int r0 = r1.thumbTrackGapSize
            return r0
    }

    public int getThumbWidth() {
            r1 = this;
            int r0 = r1.thumbWidth
            return r0
    }

    public int getTickActiveRadius() {
            r1 = this;
            int r0 = r1.tickActiveRadius
            return r0
    }

    public android.content.res.ColorStateList getTickActiveTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.tickColorActive
            return r0
    }

    public int getTickInactiveRadius() {
            r1 = this;
            int r0 = r1.tickInactiveRadius
            return r0
    }

    public android.content.res.ColorStateList getTickInactiveTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.tickColorInactive
            return r0
    }

    public android.content.res.ColorStateList getTickTintList() {
            r2 = this;
            android.content.res.ColorStateList r0 = r2.tickColorInactive
            android.content.res.ColorStateList r1 = r2.tickColorActive
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Ld
            android.content.res.ColorStateList r0 = r2.tickColorActive
            return r0
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead."
            r0.<init>(r1)
            throw r0
    }

    public android.content.res.ColorStateList getTrackActiveTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.trackColorActive
            return r0
    }

    public int getTrackHeight() {
            r1 = this;
            int r0 = r1.trackHeight
            return r0
    }

    public android.content.res.ColorStateList getTrackInactiveTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.trackColorInactive
            return r0
    }

    public int getTrackInsideCornerSize() {
            r1 = this;
            int r0 = r1.trackInsideCornerSize
            return r0
    }

    public int getTrackSidePadding() {
            r1 = this;
            int r0 = r1.trackSidePadding
            return r0
    }

    public int getTrackStopIndicatorSize() {
            r1 = this;
            int r0 = r1.trackStopIndicatorSize
            return r0
    }

    public android.content.res.ColorStateList getTrackTintList() {
            r2 = this;
            android.content.res.ColorStateList r0 = r2.trackColorInactive
            android.content.res.ColorStateList r1 = r2.trackColorActive
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Ld
            android.content.res.ColorStateList r0 = r2.trackColorActive
            return r0
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead."
            r0.<init>(r1)
            throw r0
    }

    public int getTrackWidth() {
            r1 = this;
            int r0 = r1.trackWidth
            return r0
    }

    public float getValueFrom() {
            r1 = this;
            float r0 = r1.valueFrom
            return r0
    }

    public float getValueTo() {
            r1 = this;
            float r0 = r1.valueTo
            return r0
    }

    java.util.List<java.lang.Float> getValues() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.ArrayList<java.lang.Float> r1 = r2.values
            r0.<init>(r1)
            return r0
    }

    public boolean hasLabelFormatter() {
            r1 = this;
            com.google.android.material.slider.LabelFormatter r0 = r1.formatter
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    final boolean isRtl() {
            r2 = this;
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r2)
            r1 = 1
            if (r0 != r1) goto L8
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    public boolean isTickVisible() {
            r1 = this;
            boolean r0 = r1.tickVisible
            return r0
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            android.view.ViewTreeObserver$OnScrollChangedListener r1 = r2.onScrollChangedListener
            r0.addOnScrollChangedListener(r1)
            java.util.List<com.google.android.material.tooltip.TooltipDrawable> r0 = r2.labels
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            com.google.android.material.tooltip.TooltipDrawable r1 = (com.google.android.material.tooltip.TooltipDrawable) r1
            r2.attachLabelToContentView(r1)
            goto L12
        L22:
            return
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
            r2 = this;
            com.google.android.material.slider.BaseSlider<S, L, T>$AccessibilityEventSender r0 = r2.accessibilityEventSender
            if (r0 == 0) goto L7
            r2.removeCallbacks(r0)
        L7:
            r0 = 0
            r2.labelsAreAnimatedIn = r0
            java.util.List<com.google.android.material.tooltip.TooltipDrawable> r0 = r2.labels
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            com.google.android.material.tooltip.TooltipDrawable r1 = (com.google.android.material.tooltip.TooltipDrawable) r1
            r2.detachLabelFromContentView(r1)
            goto L10
        L20:
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            android.view.ViewTreeObserver$OnScrollChangedListener r1 = r2.onScrollChangedListener
            r0.removeOnScrollChangedListener(r1)
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r6) {
            r5 = this;
            boolean r0 = r5.dirtyConfig
            if (r0 == 0) goto La
            r5.validateConfigurationIfDirty()
            r5.maybeCalculateTicksCoordinates()
        La:
            super.onDraw(r6)
            int r0 = r5.calculateTrackCenter()
            java.util.ArrayList<java.lang.Float> r1 = r5.values
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            java.util.ArrayList<java.lang.Float> r2 = r5.values
            int r3 = r2.size()
            r4 = 1
            int r3 = r3 - r4
            java.lang.Object r2 = r2.get(r3)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            float r3 = r5.valueTo
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 < 0) goto L44
            java.util.ArrayList<java.lang.Float> r3 = r5.values
            int r3 = r3.size()
            if (r3 <= r4) goto L49
            float r3 = r5.valueFrom
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L49
        L44:
            int r1 = r5.trackWidth
            r5.drawInactiveTrack(r6, r1, r0)
        L49:
            float r1 = r5.valueFrom
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 <= 0) goto L54
            int r1 = r5.trackWidth
            r5.drawActiveTrack(r6, r1, r0)
        L54:
            r5.maybeDrawTicks(r6)
            r5.maybeDrawStopIndicator(r6, r0)
            boolean r1 = r5.thumbIsPressed
            if (r1 != 0) goto L64
            boolean r1 = r5.isFocused()
            if (r1 == 0) goto L6f
        L64:
            boolean r1 = r5.isEnabled()
            if (r1 == 0) goto L6f
            int r1 = r5.trackWidth
            r5.maybeDrawCompatHalo(r6, r1, r0)
        L6f:
            r5.updateLabels()
            int r1 = r5.trackWidth
            r5.drawThumbs(r6, r1, r0)
            return
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean r1, int r2, android.graphics.Rect r3) {
            r0 = this;
            super.onFocusChanged(r1, r2, r3)
            if (r1 != 0) goto L10
            r1 = -1
            r0.activeThumbIdx = r1
            com.google.android.material.slider.BaseSlider$AccessibilityHelper r1 = r0.accessibilityHelper
            int r2 = r0.focusedThumbIdx
            r1.clearKeyboardFocusForVirtualView(r2)
            goto L1a
        L10:
            r0.focusThumbOnFocusGained(r2)
            com.google.android.material.slider.BaseSlider$AccessibilityHelper r1 = r0.accessibilityHelper
            int r2 = r0.focusedThumbIdx
            r1.requestKeyboardFocusForVirtualView(r2)
        L1a:
            return
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r6, android.view.KeyEvent r7) {
            r5 = this;
            boolean r0 = r5.isEnabled()
            if (r0 != 0) goto Lb
            boolean r6 = super.onKeyDown(r6, r7)
            return r6
        Lb:
            java.util.ArrayList<java.lang.Float> r0 = r5.values
            int r0 = r0.size()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L17
            r5.activeThumbIdx = r1
        L17:
            int r0 = r5.activeThumbIdx
            r3 = -1
            if (r0 != r3) goto L2c
            java.lang.Boolean r0 = r5.onKeyDownNoActiveThumb(r6, r7)
            if (r0 == 0) goto L27
            boolean r6 = r0.booleanValue()
            goto L2b
        L27:
            boolean r6 = super.onKeyDown(r6, r7)
        L2b:
            return r6
        L2c:
            boolean r0 = r5.isLongPress
            boolean r4 = r7.isLongPress()
            r0 = r0 | r4
            r5.isLongPress = r0
            java.lang.Float r0 = r5.calculateIncrementForKey(r6)
            if (r0 == 0) goto L5b
            java.util.ArrayList<java.lang.Float> r6 = r5.values
            int r7 = r5.activeThumbIdx
            java.lang.Object r6 = r6.get(r7)
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            float r7 = r0.floatValue()
            float r6 = r6 + r7
            boolean r6 = r5.snapActiveThumbToValue(r6)
            if (r6 == 0) goto L5a
            r5.updateHaloHotspot()
            r5.postInvalidate()
        L5a:
            return r2
        L5b:
            r0 = 23
            if (r6 == r0) goto L83
            r0 = 61
            if (r6 == r0) goto L6c
            r0 = 66
            if (r6 == r0) goto L83
            boolean r6 = super.onKeyDown(r6, r7)
            return r6
        L6c:
            boolean r6 = r7.hasNoModifiers()
            if (r6 == 0) goto L77
            boolean r6 = r5.moveFocus(r2)
            return r6
        L77:
            boolean r6 = r7.isShiftPressed()
            if (r6 == 0) goto L82
            boolean r6 = r5.moveFocus(r3)
            return r6
        L82:
            return r1
        L83:
            r5.activeThumbIdx = r3
            r5.postInvalidate()
            return r2
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int r2, android.view.KeyEvent r3) {
            r1 = this;
            r0 = 0
            r1.isLongPress = r0
            boolean r2 = super.onKeyUp(r2, r3)
            return r2
    }

    @Override // android.view.View
    protected void onMeasure(int r4, int r5) {
            r3 = this;
            int r5 = r3.widgetHeight
            int r0 = r3.labelBehavior
            r1 = 1
            r2 = 0
            if (r0 == r1) goto Le
            boolean r0 = r3.shouldAlwaysShowLabel()
            if (r0 == 0) goto L1a
        Le:
            java.util.List<com.google.android.material.tooltip.TooltipDrawable> r0 = r3.labels
            java.lang.Object r0 = r0.get(r2)
            com.google.android.material.tooltip.TooltipDrawable r0 = (com.google.android.material.tooltip.TooltipDrawable) r0
            int r2 = r0.getIntrinsicHeight()
        L1a:
            int r5 = r5 + r2
            r0 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r0)
            super.onMeasure(r4, r5)
            return
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            com.google.android.material.slider.BaseSlider$SliderState r2 = (com.google.android.material.slider.BaseSlider.SliderState) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            float r0 = r2.valueFrom
            r1.valueFrom = r0
            float r0 = r2.valueTo
            r1.valueTo = r0
            java.util.ArrayList<java.lang.Float> r0 = r2.values
            r1.setValuesInternal(r0)
            float r0 = r2.stepSize
            r1.stepSize = r0
            boolean r2 = r2.hasFocus
            if (r2 == 0) goto L21
            r1.requestFocus()
        L21:
            return
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
            r3 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            com.google.android.material.slider.BaseSlider$SliderState r1 = new com.google.android.material.slider.BaseSlider$SliderState
            r1.<init>(r0)
            float r0 = r3.valueFrom
            r1.valueFrom = r0
            float r0 = r3.valueTo
            r1.valueTo = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.ArrayList<java.lang.Float> r2 = r3.values
            r0.<init>(r2)
            r1.values = r0
            float r0 = r3.stepSize
            r1.stepSize = r0
            boolean r0 = r3.hasFocus()
            r1.hasFocus = r0
            return r1
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.updateTrackWidth(r1)
            r0.updateHaloHotspot()
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r6) {
            r5 = this;
            boolean r0 = r5.isEnabled()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            float r0 = r6.getX()
            int r2 = r5.trackSidePadding
            float r2 = (float) r2
            float r2 = r0 - r2
            int r3 = r5.trackWidth
            float r3 = (float) r3
            float r2 = r2 / r3
            r5.touchPosition = r2
            r3 = 0
            float r2 = java.lang.Math.max(r3, r2)
            r5.touchPosition = r2
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = java.lang.Math.min(r3, r2)
            r5.touchPosition = r2
            int r2 = r6.getActionMasked()
            r3 = 2
            r4 = 1
            if (r2 == 0) goto Lda
            if (r2 == r4) goto L6f
            if (r2 == r3) goto L37
            r0 = 3
            if (r2 == r0) goto L6f
            goto L125
        L37:
            boolean r2 = r5.thumbIsPressed
            if (r2 != 0) goto L5a
            boolean r2 = r5.isPotentialVerticalScroll(r6)
            if (r2 == 0) goto L50
            float r2 = r5.touchDownX
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            int r2 = r5.scaledTouchSlop
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L50
            return r1
        L50:
            android.view.ViewParent r0 = r5.getParent()
            r0.requestDisallowInterceptTouchEvent(r4)
            r5.onStartTrackingTouch()
        L5a:
            boolean r0 = r5.pickActiveThumb()
            if (r0 != 0) goto L62
            goto L125
        L62:
            r5.thumbIsPressed = r4
            r5.snapTouchPosition()
            r5.updateHaloHotspot()
            r5.invalidate()
            goto L125
        L6f:
            r5.thumbIsPressed = r1
            android.view.MotionEvent r0 = r5.lastEvent
            if (r0 == 0) goto Lb0
            int r0 = r0.getActionMasked()
            if (r0 != 0) goto Lb0
            android.view.MotionEvent r0 = r5.lastEvent
            float r0 = r0.getX()
            float r1 = r6.getX()
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r1 = r5.scaledTouchSlop
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto Lb0
            android.view.MotionEvent r0 = r5.lastEvent
            float r0 = r0.getY()
            float r1 = r6.getY()
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r1 = r5.scaledTouchSlop
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto Lb0
            boolean r0 = r5.pickActiveThumb()
            if (r0 == 0) goto Lb0
            r5.onStartTrackingTouch()
        Lb0:
            int r0 = r5.activeThumbIdx
            r1 = -1
            if (r0 == r1) goto Ld6
            r5.snapTouchPosition()
            r5.updateHaloHotspot()
            boolean r0 = r5.hasGapBetweenThumbAndTrack()
            if (r0 == 0) goto Ld1
            int r0 = r5.defaultThumbWidth
            if (r0 == r1) goto Ld1
            int r2 = r5.defaultThumbTrackGapSize
            if (r2 == r1) goto Ld1
            r5.setThumbWidth(r0)
            int r0 = r5.defaultThumbTrackGapSize
            r5.setThumbTrackGapSize(r0)
        Ld1:
            r5.activeThumbIdx = r1
            r5.onStopTrackingTouch()
        Ld6:
            r5.invalidate()
            goto L125
        Lda:
            r5.touchDownX = r0
            boolean r0 = r5.isPotentialVerticalScroll(r6)
            if (r0 == 0) goto Le3
            goto L125
        Le3:
            android.view.ViewParent r0 = r5.getParent()
            r0.requestDisallowInterceptTouchEvent(r4)
            boolean r0 = r5.pickActiveThumb()
            if (r0 != 0) goto Lf1
            goto L125
        Lf1:
            r5.requestFocus()
            r5.thumbIsPressed = r4
            r5.snapTouchPosition()
            r5.updateHaloHotspot()
            boolean r0 = r5.hasGapBetweenThumbAndTrack()
            if (r0 == 0) goto L11f
            int r0 = r5.thumbWidth
            r5.defaultThumbWidth = r0
            int r1 = r5.thumbTrackGapSize
            r5.defaultThumbTrackGapSize = r1
            float r0 = (float) r0
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            int r1 = r5.thumbWidth
            int r1 = r1 - r0
            r5.setThumbWidth(r0)
            int r0 = r5.thumbTrackGapSize
            int r1 = r1 / r3
            int r0 = r0 - r1
            r5.setThumbTrackGapSize(r0)
        L11f:
            r5.invalidate()
            r5.onStartTrackingTouch()
        L125:
            boolean r0 = r5.thumbIsPressed
            r5.setPressed(r0)
            android.view.MotionEvent r6 = android.view.MotionEvent.obtain(r6)
            r5.lastEvent = r6
            return r4
    }

    @Override // android.view.View
    protected void onVisibilityChanged(android.view.View r2, int r3) {
            r1 = this;
            super.onVisibilityChanged(r2, r3)
            if (r3 == 0) goto L22
            com.google.android.material.internal.ViewOverlayImpl r2 = com.google.android.material.internal.ViewUtils.getContentViewOverlay(r1)
            if (r2 != 0) goto Lc
            return
        Lc:
            java.util.List<com.google.android.material.tooltip.TooltipDrawable> r3 = r1.labels
            java.util.Iterator r3 = r3.iterator()
        L12:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r3.next()
            com.google.android.material.tooltip.TooltipDrawable r0 = (com.google.android.material.tooltip.TooltipDrawable) r0
            r2.remove(r0)
            goto L12
        L22:
            return
    }

    protected boolean pickActiveThumb() {
            r11 = this;
            int r0 = r11.activeThumbIdx
            r1 = 1
            r2 = -1
            if (r0 == r2) goto L7
            return r1
        L7:
            float r0 = r11.getValueOfTouchPositionAbsolute()
            float r3 = r11.valueToX(r0)
            r4 = 0
            r11.activeThumbIdx = r4
            java.util.ArrayList<java.lang.Float> r5 = r11.values
            java.lang.Object r5 = r5.get(r4)
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            float r5 = r5 - r0
            float r5 = java.lang.Math.abs(r5)
            r6 = r1
        L24:
            java.util.ArrayList<java.lang.Float> r7 = r11.values
            int r7 = r7.size()
            if (r6 >= r7) goto L91
            java.util.ArrayList<java.lang.Float> r7 = r11.values
            java.lang.Object r7 = r7.get(r6)
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            float r7 = r7 - r0
            float r7 = java.lang.Math.abs(r7)
            java.util.ArrayList<java.lang.Float> r8 = r11.values
            java.lang.Object r8 = r8.get(r6)
            java.lang.Float r8 = (java.lang.Float) r8
            float r8 = r8.floatValue()
            float r8 = r11.valueToX(r8)
            int r9 = java.lang.Float.compare(r7, r5)
            if (r9 <= 0) goto L54
            goto L91
        L54:
            boolean r9 = r11.isRtl()
            r10 = 0
            if (r9 == 0) goto L62
            float r9 = r8 - r3
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 <= 0) goto L6a
            goto L68
        L62:
            float r9 = r8 - r3
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 >= 0) goto L6a
        L68:
            r9 = r1
            goto L6b
        L6a:
            r9 = r4
        L6b:
            int r10 = java.lang.Float.compare(r7, r5)
            if (r10 >= 0) goto L74
            r11.activeThumbIdx = r6
            goto L8d
        L74:
            int r10 = java.lang.Float.compare(r7, r5)
            if (r10 != 0) goto L8e
            float r8 = r8 - r3
            float r8 = java.lang.Math.abs(r8)
            int r10 = r11.scaledTouchSlop
            float r10 = (float) r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 >= 0) goto L89
            r11.activeThumbIdx = r2
            return r4
        L89:
            if (r9 == 0) goto L8e
            r11.activeThumbIdx = r6
        L8d:
            r5 = r7
        L8e:
            int r6 = r6 + 1
            goto L24
        L91:
            int r0 = r11.activeThumbIdx
            if (r0 == r2) goto L96
            goto L97
        L96:
            r1 = r4
        L97:
            return r1
    }

    public void removeOnChangeListener(L r2) {
            r1 = this;
            java.util.List<L extends com.google.android.material.slider.BaseOnChangeListener<S>> r0 = r1.changeListeners
            r0.remove(r2)
            return
    }

    public void removeOnSliderTouchListener(T r2) {
            r1 = this;
            java.util.List<T extends com.google.android.material.slider.BaseOnSliderTouchListener<S>> r0 = r1.touchListeners
            r0.remove(r2)
            return
    }

    protected void setActiveThumbIndex(int r1) {
            r0 = this;
            r0.activeThumbIdx = r1
            return
    }

    void setCustomThumbDrawable(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r2)
            r1.setCustomThumbDrawable(r2)
            return
    }

    void setCustomThumbDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            android.graphics.drawable.Drawable r1 = r0.initializeCustomThumbDrawable(r1)
            r0.customThumbDrawable = r1
            java.util.List<android.graphics.drawable.Drawable> r1 = r0.customThumbDrawablesForValues
            r1.clear()
            r0.postInvalidate()
            return
    }

    void setCustomThumbDrawablesForValues(int... r5) {
            r4 = this;
            int r0 = r5.length
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[r0]
            r1 = 0
        L4:
            int r2 = r5.length
            if (r1 >= r2) goto L16
            android.content.res.Resources r2 = r4.getResources()
            r3 = r5[r1]
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L16:
            r4.setCustomThumbDrawablesForValues(r0)
            return
    }

    void setCustomThumbDrawablesForValues(android.graphics.drawable.Drawable... r5) {
            r4 = this;
            r0 = 0
            r4.customThumbDrawable = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.customThumbDrawablesForValues = r0
            int r0 = r5.length
            r1 = 0
        Lc:
            if (r1 >= r0) goto L1c
            r2 = r5[r1]
            java.util.List<android.graphics.drawable.Drawable> r3 = r4.customThumbDrawablesForValues
            android.graphics.drawable.Drawable r2 = r4.initializeCustomThumbDrawable(r2)
            r3.add(r2)
            int r1 = r1 + 1
            goto Lc
        L1c:
            r4.postInvalidate()
            return
    }

    @Override // android.view.View
    public void setEnabled(boolean r2) {
            r1 = this;
            super.setEnabled(r2)
            if (r2 == 0) goto L7
            r2 = 0
            goto L8
        L7:
            r2 = 2
        L8:
            r0 = 0
            r1.setLayerType(r2, r0)
            return
    }

    public void setFocusedThumbIndex(int r2) {
            r1 = this;
            if (r2 < 0) goto L15
            java.util.ArrayList<java.lang.Float> r0 = r1.values
            int r0 = r0.size()
            if (r2 >= r0) goto L15
            r1.focusedThumbIdx = r2
            com.google.android.material.slider.BaseSlider$AccessibilityHelper r0 = r1.accessibilityHelper
            r0.requestKeyboardFocusForVirtualView(r2)
            r1.postInvalidate()
            return
        L15:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "index out of range"
            r2.<init>(r0)
            throw r2
    }

    public void setHaloRadius(int r2) {
            r1 = this;
            int r0 = r1.haloRadius
            if (r2 != r0) goto L5
            return
        L5:
            r1.haloRadius = r2
            android.graphics.drawable.Drawable r2 = r1.getBackground()
            boolean r0 = r1.shouldDrawCompatHalo()
            if (r0 != 0) goto L1d
            boolean r0 = r2 instanceof android.graphics.drawable.RippleDrawable
            if (r0 == 0) goto L1d
            android.graphics.drawable.RippleDrawable r2 = (android.graphics.drawable.RippleDrawable) r2
            int r0 = r1.haloRadius
            com.google.android.material.drawable.DrawableUtils.setRippleDrawableRadius(r2, r0)
            return
        L1d:
            r1.postInvalidate()
            return
    }

    public void setHaloRadiusResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setHaloRadius(r2)
            return
    }

    public void setHaloTintList(android.content.res.ColorStateList r3) {
            r2 = this;
            android.content.res.ColorStateList r0 = r2.haloColor
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L9
            return
        L9:
            r2.haloColor = r3
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            boolean r1 = r2.shouldDrawCompatHalo()
            if (r1 != 0) goto L1f
            boolean r1 = r0 instanceof android.graphics.drawable.RippleDrawable
            if (r1 == 0) goto L1f
            android.graphics.drawable.RippleDrawable r0 = (android.graphics.drawable.RippleDrawable) r0
            r0.setColor(r3)
            return
        L1f:
            android.graphics.Paint r0 = r2.haloPaint
            int r3 = r2.getColorForState(r3)
            r0.setColor(r3)
            android.graphics.Paint r3 = r2.haloPaint
            r0 = 63
            r3.setAlpha(r0)
            r2.invalidate()
            return
    }

    public void setLabelBehavior(int r2) {
            r1 = this;
            int r0 = r1.labelBehavior
            if (r0 == r2) goto L9
            r1.labelBehavior = r2
            r1.requestLayout()
        L9:
            return
    }

    public void setLabelFormatter(com.google.android.material.slider.LabelFormatter r1) {
            r0 = this;
            r0.formatter = r1
            return
    }

    protected void setSeparationUnit(int r1) {
            r0 = this;
            r0.separationUnit = r1
            r1 = 1
            r0.dirtyConfig = r1
            r0.postInvalidate()
            return
    }

    public void setStepSize(float r4) {
            r3 = this;
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L14
            float r0 = r3.stepSize
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L13
            r3.stepSize = r4
            r4 = 1
            r3.dirtyConfig = r4
            r3.postInvalidate()
        L13:
            return
        L14:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            float r1 = r3.valueFrom
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            float r2 = r3.valueTo
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r1, r2}
            java.lang.String r1 = "The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range"
            java.lang.String r4 = java.lang.String.format(r1, r4)
            r0.<init>(r4)
            throw r0
    }

    public void setThumbElevation(float r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.defaultThumbDrawable
            r0.setElevation(r2)
            return
    }

    public void setThumbElevationResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            float r2 = r0.getDimension(r2)
            r1.setThumbElevation(r2)
            return
    }

    public void setThumbHeight(int r4) {
            r3 = this;
            int r0 = r3.thumbHeight
            if (r4 != r0) goto L5
            return
        L5:
            r3.thumbHeight = r4
            com.google.android.material.shape.MaterialShapeDrawable r0 = r3.defaultThumbDrawable
            int r1 = r3.thumbWidth
            r2 = 0
            r0.setBounds(r2, r2, r1, r4)
            android.graphics.drawable.Drawable r4 = r3.customThumbDrawable
            if (r4 == 0) goto L16
            r3.adjustCustomThumbDrawableBounds(r4)
        L16:
            java.util.List<android.graphics.drawable.Drawable> r4 = r3.customThumbDrawablesForValues
            java.util.Iterator r4 = r4.iterator()
        L1c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r4.next()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r3.adjustCustomThumbDrawableBounds(r0)
            goto L1c
        L2c:
            r3.updateWidgetLayout()
            return
    }

    public void setThumbHeightResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setThumbHeight(r2)
            return
    }

    public void setThumbRadius(int r1) {
            r0 = this;
            int r1 = r1 * 2
            r0.setThumbWidth(r1)
            r0.setThumbHeight(r1)
            return
    }

    public void setThumbRadiusResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setThumbRadius(r2)
            return
    }

    public void setThumbStrokeColor(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.defaultThumbDrawable
            r0.setStrokeColor(r2)
            r1.postInvalidate()
            return
    }

    public void setThumbStrokeColorResource(int r2) {
            r1 = this;
            if (r2 == 0) goto Ld
            android.content.Context r0 = r1.getContext()
            android.content.res.ColorStateList r2 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r0, r2)
            r1.setThumbStrokeColor(r2)
        Ld:
            return
    }

    public void setThumbStrokeWidth(float r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.defaultThumbDrawable
            r0.setStrokeWidth(r2)
            r1.postInvalidate()
            return
    }

    public void setThumbStrokeWidthResource(int r2) {
            r1 = this;
            if (r2 == 0) goto Ld
            android.content.res.Resources r0 = r1.getResources()
            float r2 = r0.getDimension(r2)
            r1.setThumbStrokeWidth(r2)
        Ld:
            return
    }

    public void setThumbTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.defaultThumbDrawable
            android.content.res.ColorStateList r0 = r0.getFillColor()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Ld
            return
        Ld:
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.defaultThumbDrawable
            r0.setFillColor(r2)
            r1.invalidate()
            return
    }

    public void setThumbTrackGapSize(int r2) {
            r1 = this;
            int r0 = r1.thumbTrackGapSize
            if (r0 != r2) goto L5
            return
        L5:
            r1.thumbTrackGapSize = r2
            r1.invalidate()
            return
    }

    public void setThumbWidth(int r4) {
            r3 = this;
            int r0 = r3.thumbWidth
            if (r4 != r0) goto L5
            return
        L5:
            r3.thumbWidth = r4
            com.google.android.material.shape.MaterialShapeDrawable r4 = r3.defaultThumbDrawable
            com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = com.google.android.material.shape.ShapeAppearanceModel.builder()
            int r1 = r3.thumbWidth
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            r2 = 0
            com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = r0.setAllCorners(r2, r1)
            com.google.android.material.shape.ShapeAppearanceModel r0 = r0.build()
            r4.setShapeAppearanceModel(r0)
            com.google.android.material.shape.MaterialShapeDrawable r4 = r3.defaultThumbDrawable
            int r0 = r3.thumbWidth
            int r1 = r3.thumbHeight
            r4.setBounds(r2, r2, r0, r1)
            android.graphics.drawable.Drawable r4 = r3.customThumbDrawable
            if (r4 == 0) goto L2f
            r3.adjustCustomThumbDrawableBounds(r4)
        L2f:
            java.util.List<android.graphics.drawable.Drawable> r4 = r3.customThumbDrawablesForValues
            java.util.Iterator r4 = r4.iterator()
        L35:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L45
            java.lang.Object r0 = r4.next()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r3.adjustCustomThumbDrawableBounds(r0)
            goto L35
        L45:
            r3.updateWidgetLayout()
            return
    }

    public void setThumbWidthResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setThumbWidth(r2)
            return
    }

    public void setTickActiveRadius(int r2) {
            r1 = this;
            int r0 = r1.tickActiveRadius
            if (r0 == r2) goto L11
            r1.tickActiveRadius = r2
            android.graphics.Paint r0 = r1.activeTicksPaint
            int r2 = r2 * 2
            float r2 = (float) r2
            r0.setStrokeWidth(r2)
            r1.updateWidgetLayout()
        L11:
            return
    }

    public void setTickActiveTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.tickColorActive
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            return
        L9:
            r1.tickColorActive = r2
            android.graphics.Paint r0 = r1.activeTicksPaint
            int r2 = r1.getColorForState(r2)
            r0.setColor(r2)
            r1.invalidate()
            return
    }

    public void setTickInactiveRadius(int r2) {
            r1 = this;
            int r0 = r1.tickInactiveRadius
            if (r0 == r2) goto L11
            r1.tickInactiveRadius = r2
            android.graphics.Paint r0 = r1.inactiveTicksPaint
            int r2 = r2 * 2
            float r2 = (float) r2
            r0.setStrokeWidth(r2)
            r1.updateWidgetLayout()
        L11:
            return
    }

    public void setTickInactiveTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.tickColorInactive
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            return
        L9:
            r1.tickColorInactive = r2
            android.graphics.Paint r0 = r1.inactiveTicksPaint
            int r2 = r1.getColorForState(r2)
            r0.setColor(r2)
            r1.invalidate()
            return
    }

    public void setTickTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.setTickInactiveTintList(r1)
            r0.setTickActiveTintList(r1)
            return
    }

    public void setTickVisible(boolean r2) {
            r1 = this;
            boolean r0 = r1.tickVisible
            if (r0 == r2) goto L9
            r1.tickVisible = r2
            r1.postInvalidate()
        L9:
            return
    }

    public void setTrackActiveTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.trackColorActive
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            return
        L9:
            r1.trackColorActive = r2
            android.graphics.Paint r0 = r1.activeTrackPaint
            int r2 = r1.getColorForState(r2)
            r0.setColor(r2)
            android.graphics.Paint r2 = r1.stopIndicatorPaint
            android.content.res.ColorStateList r0 = r1.trackColorActive
            int r0 = r1.getColorForState(r0)
            r2.setColor(r0)
            r1.invalidate()
            return
    }

    public void setTrackHeight(int r2) {
            r1 = this;
            int r0 = r1.trackHeight
            if (r0 == r2) goto Lc
            r1.trackHeight = r2
            r1.invalidateTrack()
            r1.updateWidgetLayout()
        Lc:
            return
    }

    public void setTrackInactiveTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.trackColorInactive
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            return
        L9:
            r1.trackColorInactive = r2
            android.graphics.Paint r0 = r1.inactiveTrackPaint
            int r2 = r1.getColorForState(r2)
            r0.setColor(r2)
            r1.invalidate()
            return
    }

    public void setTrackInsideCornerSize(int r2) {
            r1 = this;
            int r0 = r1.trackInsideCornerSize
            if (r0 != r2) goto L5
            return
        L5:
            r1.trackInsideCornerSize = r2
            r1.invalidate()
            return
    }

    public void setTrackStopIndicatorSize(int r2) {
            r1 = this;
            int r0 = r1.trackStopIndicatorSize
            if (r0 != r2) goto L5
            return
        L5:
            r1.trackStopIndicatorSize = r2
            android.graphics.Paint r0 = r1.stopIndicatorPaint
            float r2 = (float) r2
            r0.setStrokeWidth(r2)
            r1.invalidate()
            return
    }

    public void setTrackTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.setTrackInactiveTintList(r1)
            r0.setTrackActiveTintList(r1)
            return
    }

    public void setValueFrom(float r1) {
            r0 = this;
            r0.valueFrom = r1
            r1 = 1
            r0.dirtyConfig = r1
            r0.postInvalidate()
            return
    }

    public void setValueTo(float r1) {
            r0 = this;
            r0.valueTo = r1
            r1 = 1
            r0.dirtyConfig = r1
            r0.postInvalidate()
            return
    }

    void setValues(java.util.List<java.lang.Float> r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.setValuesInternal(r0)
            return
    }

    void setValues(java.lang.Float... r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collections.addAll(r0, r2)
            r1.setValuesInternal(r0)
            return
    }

    void updateBoundsForVirtualViewId(int r6, android.graphics.Rect r7) {
            r5 = this;
            int r0 = r5.trackSidePadding
            java.util.List r1 = r5.getValues()
            java.lang.Object r6 = r1.get(r6)
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            float r6 = r5.normalizeValue(r6)
            int r1 = r5.trackWidth
            float r1 = (float) r1
            float r6 = r6 * r1
            int r6 = (int) r6
            int r0 = r0 + r6
            int r6 = r5.calculateTrackCenter()
            int r1 = r5.thumbWidth
            int r1 = r1 / 2
            int r2 = r5.minTouchTargetSize
            int r2 = r2 / 2
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r5.thumbHeight
            int r2 = r2 / 2
            int r3 = r5.minTouchTargetSize
            int r3 = r3 / 2
            int r2 = java.lang.Math.max(r2, r3)
            int r3 = r0 - r1
            int r4 = r6 - r2
            int r0 = r0 + r1
            int r6 = r6 + r2
            r7.set(r3, r4, r0, r6)
            return
    }
}
