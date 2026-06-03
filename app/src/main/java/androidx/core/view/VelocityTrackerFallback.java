package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
class VelocityTrackerFallback {
    private static final long ASSUME_POINTER_STOPPED_MS = 40;
    private static final int HISTORY_SIZE = 20;
    private static final long RANGE_MS = 100;
    private int mDataPointsBufferLastUsedIndex;
    private int mDataPointsBufferSize;
    private final long[] mEventTimes;
    private float mLastComputedVelocity;
    private final float[] mMovements;

    VelocityTrackerFallback() {
            r2 = this;
            r2.<init>()
            r0 = 20
            float[] r1 = new float[r0]
            r2.mMovements = r1
            long[] r0 = new long[r0]
            r2.mEventTimes = r0
            r0 = 0
            r2.mLastComputedVelocity = r0
            r0 = 0
            r2.mDataPointsBufferSize = r0
            r2.mDataPointsBufferLastUsedIndex = r0
            return
    }

    private void clear() {
            r1 = this;
            r0 = 0
            r1.mDataPointsBufferSize = r0
            r0 = 0
            r1.mLastComputedVelocity = r0
            return
    }

    private float getCurrentVelocity() {
            r14 = this;
            int r0 = r14.mDataPointsBufferSize
            r1 = 0
            r2 = 2
            if (r0 >= r2) goto L7
            return r1
        L7:
            int r3 = r14.mDataPointsBufferLastUsedIndex
            int r4 = r3 + 20
            r5 = 1
            int r0 = r0 - r5
            int r4 = r4 - r0
            int r4 = r4 % 20
            long[] r0 = r14.mEventTimes
            r6 = r0[r3]
        L14:
            long[] r0 = r14.mEventTimes
            r8 = r0[r4]
            long r10 = r6 - r8
            r12 = 100
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 <= 0) goto L2a
            int r0 = r14.mDataPointsBufferSize
            int r0 = r0 - r5
            r14.mDataPointsBufferSize = r0
            int r4 = r4 + 1
            int r4 = r4 % 20
            goto L14
        L2a:
            int r3 = r14.mDataPointsBufferSize
            if (r3 >= r2) goto L2f
            return r1
        L2f:
            if (r3 != r2) goto L43
            int r4 = r4 + r5
            int r4 = r4 % 20
            r2 = r0[r4]
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 != 0) goto L3b
            return r1
        L3b:
            float[] r0 = r14.mMovements
            r0 = r0[r4]
            long r2 = r2 - r8
            float r1 = (float) r2
            float r0 = r0 / r1
            return r0
        L43:
            r0 = 0
            r2 = r1
            r1 = r0
        L46:
            int r3 = r14.mDataPointsBufferSize
            int r3 = r3 - r5
            if (r0 >= r3) goto L7e
            int r3 = r0 + r4
            long[] r6 = r14.mEventTimes
            int r7 = r3 % 20
            r7 = r6[r7]
            int r3 = r3 + r5
            int r3 = r3 % 20
            r9 = r6[r3]
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 != 0) goto L5d
            goto L7b
        L5d:
            int r1 = r1 + 1
            float r6 = kineticEnergyToVelocity(r2)
            float[] r9 = r14.mMovements
            r9 = r9[r3]
            long[] r10 = r14.mEventTimes
            r11 = r10[r3]
            long r11 = r11 - r7
            float r3 = (float) r11
            float r9 = r9 / r3
            float r3 = r9 - r6
            float r6 = java.lang.Math.abs(r9)
            float r3 = r3 * r6
            float r2 = r2 + r3
            if (r1 != r5) goto L7b
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r3
        L7b:
            int r0 = r0 + 1
            goto L46
        L7e:
            float r0 = kineticEnergyToVelocity(r2)
            return r0
    }

    private static float kineticEnergyToVelocity(float r3) {
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L8
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto La
        L8:
            r0 = 1065353216(0x3f800000, float:1.0)
        La:
            r1 = 1073741824(0x40000000, float:2.0)
            float r3 = java.lang.Math.abs(r3)
            float r3 = r3 * r1
            double r1 = (double) r3
            double r1 = java.lang.Math.sqrt(r1)
            float r3 = (float) r1
            float r0 = r0 * r3
            return r0
    }

    void addMovement(android.view.MotionEvent r7) {
            r6 = this;
            long r0 = r7.getEventTime()
            int r2 = r6.mDataPointsBufferSize
            if (r2 == 0) goto L19
            long[] r2 = r6.mEventTimes
            int r3 = r6.mDataPointsBufferLastUsedIndex
            r3 = r2[r3]
            long r2 = r0 - r3
            r4 = 40
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L19
            r6.clear()
        L19:
            int r2 = r6.mDataPointsBufferLastUsedIndex
            int r2 = r2 + 1
            r3 = 20
            int r2 = r2 % r3
            r6.mDataPointsBufferLastUsedIndex = r2
            int r4 = r6.mDataPointsBufferSize
            if (r4 == r3) goto L2a
            int r4 = r4 + 1
            r6.mDataPointsBufferSize = r4
        L2a:
            float[] r3 = r6.mMovements
            r4 = 26
            float r7 = r7.getAxisValue(r4)
            r3[r2] = r7
            long[] r7 = r6.mEventTimes
            int r2 = r6.mDataPointsBufferLastUsedIndex
            r7[r2] = r0
            return
    }

    void computeCurrentVelocity(int r2) {
            r1 = this;
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r1.computeCurrentVelocity(r2, r0)
            return
    }

    void computeCurrentVelocity(int r2, float r3) {
            r1 = this;
            float r0 = r1.getCurrentVelocity()
            float r2 = (float) r2
            float r0 = r0 * r2
            r1.mLastComputedVelocity = r0
            float r2 = java.lang.Math.abs(r3)
            float r2 = -r2
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L19
            float r2 = java.lang.Math.abs(r3)
            float r2 = -r2
            r1.mLastComputedVelocity = r2
            goto L29
        L19:
            float r2 = r1.mLastComputedVelocity
            float r0 = java.lang.Math.abs(r3)
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 <= 0) goto L29
            float r2 = java.lang.Math.abs(r3)
            r1.mLastComputedVelocity = r2
        L29:
            return
    }

    float getAxisVelocity(int r2) {
            r1 = this;
            r0 = 26
            if (r2 == r0) goto L6
            r2 = 0
            return r2
        L6:
            float r2 = r1.mLastComputedVelocity
            return r2
    }
}
