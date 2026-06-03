package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public class DifferentialMotionFlingController {
    private final android.content.Context mContext;
    private final int[] mFlingVelocityThresholds;
    private float mLastFlingVelocity;
    private int mLastProcessedAxis;
    private int mLastProcessedDeviceId;
    private int mLastProcessedSource;
    private final androidx.core.view.DifferentialMotionFlingTarget mTarget;
    private final androidx.core.view.DifferentialMotionFlingController.DifferentialVelocityProvider mVelocityProvider;
    private final androidx.core.view.DifferentialMotionFlingController.FlingVelocityThresholdCalculator mVelocityThresholdCalculator;
    private android.view.VelocityTracker mVelocityTracker;

    interface DifferentialVelocityProvider {
        float getCurrentVelocity(android.view.VelocityTracker r1, android.view.MotionEvent r2, int r3);
    }

    interface FlingVelocityThresholdCalculator {
        void calculateFlingVelocityThresholds(android.content.Context r1, int[] r2, android.view.MotionEvent r3, int r4);
    }

    public static /* synthetic */ void $r8$lambda$lv23FpWloyumz6IvnMabmJR9BpE(android.content.Context r0, int[] r1, android.view.MotionEvent r2, int r3) {
            calculateFlingVelocityThresholds(r0, r1, r2, r3)
            return
    }

    public static /* synthetic */ float $r8$lambda$rCNQ1h5KBIaVcUXhwymI_1638W0(android.view.VelocityTracker r0, android.view.MotionEvent r1, int r2) {
            float r0 = getCurrentVelocity(r0, r1, r2)
            return r0
    }

    public DifferentialMotionFlingController(android.content.Context r3, androidx.core.view.DifferentialMotionFlingTarget r4) {
            r2 = this;
            androidx.core.view.DifferentialMotionFlingController$$ExternalSyntheticLambda0 r0 = new androidx.core.view.DifferentialMotionFlingController$$ExternalSyntheticLambda0
            r0.<init>()
            androidx.core.view.DifferentialMotionFlingController$$ExternalSyntheticLambda1 r1 = new androidx.core.view.DifferentialMotionFlingController$$ExternalSyntheticLambda1
            r1.<init>()
            r2.<init>(r3, r4, r0, r1)
            return
    }

    DifferentialMotionFlingController(android.content.Context r3, androidx.core.view.DifferentialMotionFlingTarget r4, androidx.core.view.DifferentialMotionFlingController.FlingVelocityThresholdCalculator r5, androidx.core.view.DifferentialMotionFlingController.DifferentialVelocityProvider r6) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.mLastProcessedAxis = r0
            r2.mLastProcessedSource = r0
            r2.mLastProcessedDeviceId = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = 0
            int[] r0 = new int[]{r0, r1}
            r2.mFlingVelocityThresholds = r0
            r2.mContext = r3
            r2.mTarget = r4
            r2.mVelocityThresholdCalculator = r5
            r2.mVelocityProvider = r6
            return
    }

    private static void calculateFlingVelocityThresholds(android.content.Context r3, int[] r4, android.view.MotionEvent r5, int r6) {
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r3)
            int r1 = r5.getDeviceId()
            int r2 = r5.getSource()
            int r1 = androidx.core.view.ViewConfigurationCompat.getScaledMinimumFlingVelocity(r3, r0, r1, r6, r2)
            r2 = 0
            r4[r2] = r1
            int r1 = r5.getDeviceId()
            int r5 = r5.getSource()
            int r3 = androidx.core.view.ViewConfigurationCompat.getScaledMaximumFlingVelocity(r3, r0, r1, r6, r5)
            r5 = 1
            r4[r5] = r3
            return
    }

    private boolean calculateFlingVelocityThresholds(android.view.MotionEvent r6, int r7) {
            r5 = this;
            int r0 = r6.getSource()
            int r1 = r6.getDeviceId()
            int r2 = r5.mLastProcessedSource
            if (r2 != r0) goto L17
            int r2 = r5.mLastProcessedDeviceId
            if (r2 != r1) goto L17
            int r2 = r5.mLastProcessedAxis
            if (r2 == r7) goto L15
            goto L17
        L15:
            r6 = 0
            return r6
        L17:
            androidx.core.view.DifferentialMotionFlingController$FlingVelocityThresholdCalculator r2 = r5.mVelocityThresholdCalculator
            android.content.Context r3 = r5.mContext
            int[] r4 = r5.mFlingVelocityThresholds
            r2.calculateFlingVelocityThresholds(r3, r4, r6, r7)
            r5.mLastProcessedSource = r0
            r5.mLastProcessedDeviceId = r1
            r5.mLastProcessedAxis = r7
            r6 = 1
            return r6
    }

    private float getCurrentVelocity(android.view.MotionEvent r3, int r4) {
            r2 = this;
            android.view.VelocityTracker r0 = r2.mVelocityTracker
            if (r0 != 0) goto La
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r2.mVelocityTracker = r0
        La:
            androidx.core.view.DifferentialMotionFlingController$DifferentialVelocityProvider r0 = r2.mVelocityProvider
            android.view.VelocityTracker r1 = r2.mVelocityTracker
            float r3 = r0.getCurrentVelocity(r1, r3, r4)
            return r3
    }

    private static float getCurrentVelocity(android.view.VelocityTracker r0, android.view.MotionEvent r1, int r2) {
            androidx.core.view.VelocityTrackerCompat.addMovement(r0, r1)
            r1 = 1000(0x3e8, float:1.401E-42)
            androidx.core.view.VelocityTrackerCompat.computeCurrentVelocity(r0, r1)
            float r0 = androidx.core.view.VelocityTrackerCompat.getAxisVelocity(r0, r2)
            return r0
    }

    public void onMotionEvent(android.view.MotionEvent r5, int r6) {
            r4 = this;
            boolean r0 = r4.calculateFlingVelocityThresholds(r5, r6)
            int[] r1 = r4.mFlingVelocityThresholds
            r2 = 0
            r1 = r1[r2]
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r3) goto L19
            android.view.VelocityTracker r5 = r4.mVelocityTracker
            if (r5 == 0) goto L18
            r5.recycle()
            r5 = 0
            r4.mVelocityTracker = r5
        L18:
            return
        L19:
            float r5 = r4.getCurrentVelocity(r5, r6)
            androidx.core.view.DifferentialMotionFlingTarget r6 = r4.mTarget
            float r6 = r6.getScaledScrollFactor()
            float r5 = r5 * r6
            float r6 = java.lang.Math.signum(r5)
            r1 = 0
            if (r0 != 0) goto L39
            float r0 = r4.mLastFlingVelocity
            float r0 = java.lang.Math.signum(r0)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 == 0) goto L3e
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 == 0) goto L3e
        L39:
            androidx.core.view.DifferentialMotionFlingTarget r6 = r4.mTarget
            r6.stopDifferentialMotionFling()
        L3e:
            float r6 = java.lang.Math.abs(r5)
            int[] r0 = r4.mFlingVelocityThresholds
            r2 = r0[r2]
            float r2 = (float) r2
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 >= 0) goto L4c
            return
        L4c:
            r6 = 1
            r6 = r0[r6]
            int r0 = -r6
            float r0 = (float) r0
            float r6 = (float) r6
            float r5 = java.lang.Math.min(r5, r6)
            float r5 = java.lang.Math.max(r0, r5)
            androidx.core.view.DifferentialMotionFlingTarget r6 = r4.mTarget
            boolean r6 = r6.startDifferentialMotionFling(r5)
            if (r6 == 0) goto L63
            r1 = r5
        L63:
            r4.mLastFlingVelocity = r1
            return
    }
}
