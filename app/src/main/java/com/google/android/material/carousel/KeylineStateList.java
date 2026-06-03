package com.google.android.material.carousel;

/* JADX INFO: loaded from: classes.dex */
class KeylineStateList {
    private static final int NO_INDEX = -1;
    private final com.google.android.material.carousel.KeylineState defaultState;
    private final float endShiftRange;
    private final java.util.List<com.google.android.material.carousel.KeylineState> endStateSteps;
    private final float[] endStateStepsInterpolationPoints;
    private final float startShiftRange;
    private final java.util.List<com.google.android.material.carousel.KeylineState> startStateSteps;
    private final float[] startStateStepsInterpolationPoints;

    private KeylineStateList(com.google.android.material.carousel.KeylineState r4, java.util.List<com.google.android.material.carousel.KeylineState> r5, java.util.List<com.google.android.material.carousel.KeylineState> r6) {
            r3 = this;
            r3.<init>()
            r3.defaultState = r4
            java.util.List r0 = java.util.Collections.unmodifiableList(r5)
            r3.startStateSteps = r0
            java.util.List r0 = java.util.Collections.unmodifiableList(r6)
            r3.endStateSteps = r0
            int r0 = r5.size()
            r1 = 1
            int r0 = r0 - r1
            java.lang.Object r0 = r5.get(r0)
            com.google.android.material.carousel.KeylineState r0 = (com.google.android.material.carousel.KeylineState) r0
            com.google.android.material.carousel.KeylineState$Keyline r0 = r0.getFirstKeyline()
            float r0 = r0.loc
            com.google.android.material.carousel.KeylineState$Keyline r2 = r4.getFirstKeyline()
            float r2 = r2.loc
            float r0 = r0 - r2
            r3.startShiftRange = r0
            com.google.android.material.carousel.KeylineState$Keyline r4 = r4.getLastKeyline()
            float r4 = r4.loc
            int r2 = r6.size()
            int r2 = r2 - r1
            java.lang.Object r2 = r6.get(r2)
            com.google.android.material.carousel.KeylineState r2 = (com.google.android.material.carousel.KeylineState) r2
            com.google.android.material.carousel.KeylineState$Keyline r2 = r2.getLastKeyline()
            float r2 = r2.loc
            float r4 = r4 - r2
            r3.endShiftRange = r4
            float[] r5 = getStateStepInterpolationPoints(r0, r5, r1)
            r3.startStateStepsInterpolationPoints = r5
            r5 = 0
            float[] r4 = getStateStepInterpolationPoints(r4, r6, r5)
            r3.endStateStepsInterpolationPoints = r4
            return
    }

    private com.google.android.material.carousel.KeylineState closestStateStepFromInterpolation(java.util.List<com.google.android.material.carousel.KeylineState> r2, float r3, float[] r4) {
            r1 = this;
            float[] r3 = getStateStepsRange(r2, r3, r4)
            r4 = 0
            r4 = r3[r4]
            r0 = 1056964608(0x3f000000, float:0.5)
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 < 0) goto L18
            r4 = 2
            r3 = r3[r4]
            int r3 = (int) r3
            java.lang.Object r2 = r2.get(r3)
            com.google.android.material.carousel.KeylineState r2 = (com.google.android.material.carousel.KeylineState) r2
            return r2
        L18:
            r4 = 1
            r3 = r3[r4]
            int r3 = (int) r3
            java.lang.Object r2 = r2.get(r3)
            com.google.android.material.carousel.KeylineState r2 = (com.google.android.material.carousel.KeylineState) r2
            return r2
    }

    private static int findFirstIndexAfterLastFocalKeylineWithMask(com.google.android.material.carousel.KeylineState r2, float r3) {
            int r0 = r2.getLastFocalKeylineIndex()
        L4:
            java.util.List r1 = r2.getKeylines()
            int r1 = r1.size()
            if (r0 >= r1) goto L22
            java.util.List r1 = r2.getKeylines()
            java.lang.Object r1 = r1.get(r0)
            com.google.android.material.carousel.KeylineState$Keyline r1 = (com.google.android.material.carousel.KeylineState.Keyline) r1
            float r1 = r1.mask
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L1f
            return r0
        L1f:
            int r0 = r0 + 1
            goto L4
        L22:
            java.util.List r2 = r2.getKeylines()
            int r2 = r2.size()
            int r2 = r2 + (-1)
            return r2
    }

    private static int findFirstNonAnchorKeylineIndex(com.google.android.material.carousel.KeylineState r2) {
            r0 = 0
        L1:
            java.util.List r1 = r2.getKeylines()
            int r1 = r1.size()
            if (r0 >= r1) goto L1d
            java.util.List r1 = r2.getKeylines()
            java.lang.Object r1 = r1.get(r0)
            com.google.android.material.carousel.KeylineState$Keyline r1 = (com.google.android.material.carousel.KeylineState.Keyline) r1
            boolean r1 = r1.isAnchor
            if (r1 != 0) goto L1a
            return r0
        L1a:
            int r0 = r0 + 1
            goto L1
        L1d:
            r2 = -1
            return r2
    }

    private static int findLastIndexBeforeFirstFocalKeylineWithMask(com.google.android.material.carousel.KeylineState r2, float r3) {
            int r0 = r2.getFirstFocalKeylineIndex()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L1c
            java.util.List r1 = r2.getKeylines()
            java.lang.Object r1 = r1.get(r0)
            com.google.android.material.carousel.KeylineState$Keyline r1 = (com.google.android.material.carousel.KeylineState.Keyline) r1
            float r1 = r1.mask
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L19
            return r0
        L19:
            int r0 = r0 + (-1)
            goto L6
        L1c:
            r2 = 0
            return r2
    }

    private static int findLastNonAnchorKeylineIndex(com.google.android.material.carousel.KeylineState r2) {
            java.util.List r0 = r2.getKeylines()
            int r0 = r0.size()
            int r0 = r0 + (-1)
        La:
            if (r0 < 0) goto L1e
            java.util.List r1 = r2.getKeylines()
            java.lang.Object r1 = r1.get(r0)
            com.google.android.material.carousel.KeylineState$Keyline r1 = (com.google.android.material.carousel.KeylineState.Keyline) r1
            boolean r1 = r1.isAnchor
            if (r1 != 0) goto L1b
            return r0
        L1b:
            int r0 = r0 + (-1)
            goto La
        L1e:
            r2 = -1
            return r2
    }

    static com.google.android.material.carousel.KeylineStateList from(com.google.android.material.carousel.Carousel r1, com.google.android.material.carousel.KeylineState r2, float r3, float r4, float r5) {
            com.google.android.material.carousel.KeylineStateList r0 = new com.google.android.material.carousel.KeylineStateList
            java.util.List r4 = getStateStepsStart(r1, r2, r3, r4)
            java.util.List r1 = getStateStepsEnd(r1, r2, r3, r5)
            r0.<init>(r2, r4, r1)
            return r0
    }

    private static float[] getStateStepInterpolationPoints(float r6, java.util.List<com.google.android.material.carousel.KeylineState> r7, boolean r8) {
            int r0 = r7.size()
            float[] r1 = new float[r0]
            r2 = 1
        L7:
            if (r2 >= r0) goto L45
            int r3 = r2 + (-1)
            java.lang.Object r4 = r7.get(r3)
            com.google.android.material.carousel.KeylineState r4 = (com.google.android.material.carousel.KeylineState) r4
            java.lang.Object r5 = r7.get(r2)
            com.google.android.material.carousel.KeylineState r5 = (com.google.android.material.carousel.KeylineState) r5
            if (r8 == 0) goto L27
            com.google.android.material.carousel.KeylineState$Keyline r5 = r5.getFirstKeyline()
            float r5 = r5.loc
            com.google.android.material.carousel.KeylineState$Keyline r4 = r4.getFirstKeyline()
            float r4 = r4.loc
            float r5 = r5 - r4
            goto L35
        L27:
            com.google.android.material.carousel.KeylineState$Keyline r4 = r4.getLastKeyline()
            float r4 = r4.loc
            com.google.android.material.carousel.KeylineState$Keyline r5 = r5.getLastKeyline()
            float r5 = r5.loc
            float r5 = r4 - r5
        L35:
            float r5 = r5 / r6
            int r4 = r0 + (-1)
            if (r2 != r4) goto L3d
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L40
        L3d:
            r3 = r1[r3]
            float r3 = r3 + r5
        L40:
            r1[r2] = r3
            int r2 = r2 + 1
            goto L7
        L45:
            return r1
    }

    private static java.util.List<com.google.android.material.carousel.KeylineState> getStateStepsEnd(com.google.android.material.carousel.Carousel r18, com.google.android.material.carousel.KeylineState r19, float r20, float r21) {
            r0 = r19
            r1 = r20
            r2 = r21
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r3.add(r0)
            int r11 = findLastNonAnchorKeylineIndex(r19)
            boolean r4 = r18.isHorizontal()
            if (r4 == 0) goto L1d
            int r4 = r18.getContainerWidth()
            goto L21
        L1d:
            int r4 = r18.getContainerHeight()
        L21:
            float r4 = (float) r4
            r12 = r4
            boolean r4 = isLastFocalItemVisibleAtRightOfContainer(r18, r19)
            r14 = 0
            if (r4 != 0) goto Ld1
            r4 = -1
            if (r11 != r4) goto L2f
            goto Ld1
        L2f:
            int r4 = r19.getLastFocalKeylineIndex()
            int r15 = r11 - r4
            com.google.android.material.carousel.KeylineState$Keyline r4 = r19.getFirstKeyline()
            float r4 = r4.locOffset
            com.google.android.material.carousel.KeylineState$Keyline r5 = r19.getFirstKeyline()
            float r5 = r5.maskedItemSize
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r6
            float r16 = r4 - r5
            if (r15 > 0) goto L62
            com.google.android.material.carousel.KeylineState$Keyline r4 = r19.getLastFocalKeyline()
            float r4 = r4.cutoff
            int r4 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r4 <= 0) goto L62
            com.google.android.material.carousel.KeylineState$Keyline r1 = r19.getLastFocalKeyline()
            float r1 = r1.cutoff
            float r1 = r16 - r1
            com.google.android.material.carousel.KeylineState r0 = shiftKeylinesAndCreateKeylineState(r0, r1, r12)
            r3.add(r0)
            return r3
        L62:
            r4 = r14
            r10 = 0
        L64:
            if (r10 >= r15) goto Ld0
            int r5 = r3.size()
            int r5 = r5 + (-1)
            java.lang.Object r5 = r3.get(r5)
            com.google.android.material.carousel.KeylineState r5 = (com.google.android.material.carousel.KeylineState) r5
            int r6 = r11 - r10
            java.util.List r7 = r19.getKeylines()
            java.lang.Object r7 = r7.get(r6)
            com.google.android.material.carousel.KeylineState$Keyline r7 = (com.google.android.material.carousel.KeylineState.Keyline) r7
            float r7 = r7.cutoff
            float r17 = r4 + r7
            int r6 = r6 + 1
            java.util.List r4 = r19.getKeylines()
            int r4 = r4.size()
            if (r6 >= r4) goto La2
            java.util.List r4 = r19.getKeylines()
            java.lang.Object r4 = r4.get(r6)
            com.google.android.material.carousel.KeylineState$Keyline r4 = (com.google.android.material.carousel.KeylineState.Keyline) r4
            float r4 = r4.mask
            int r4 = findLastIndexBeforeFirstFocalKeylineWithMask(r5, r4)
            int r4 = r4 + 1
            r6 = r4
            goto La3
        La2:
            r6 = 0
        La3:
            int r4 = r19.getFirstFocalKeylineIndex()
            int r4 = r4 + r10
            int r8 = r4 + 1
            int r4 = r19.getLastFocalKeylineIndex()
            int r4 = r4 + r10
            int r9 = r4 + 1
            float r7 = r16 - r17
            r4 = r5
            r5 = r11
            r13 = r10
            r10 = r12
            com.google.android.material.carousel.KeylineState r4 = moveKeylineAndCreateKeylineState(r4, r5, r6, r7, r8, r9, r10)
            int r5 = r15 + (-1)
            if (r13 != r5) goto Lc8
            int r5 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r5 <= 0) goto Lc8
            r5 = 0
            com.google.android.material.carousel.KeylineState r4 = shiftKeylineStateForPadding(r4, r2, r12, r5, r1)
        Lc8:
            r3.add(r4)
            int r10 = r13 + 1
            r4 = r17
            goto L64
        Ld0:
            return r3
        Ld1:
            int r4 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r4 <= 0) goto Ldd
            r4 = 0
            com.google.android.material.carousel.KeylineState r0 = shiftKeylineStateForPadding(r0, r2, r12, r4, r1)
            r3.add(r0)
        Ldd:
            return r3
    }

    private static float[] getStateStepsRange(java.util.List<com.google.android.material.carousel.KeylineState> r7, float r8, float[] r9) {
            int r7 = r7.size()
            r0 = 0
            r1 = r9[r0]
            r2 = 1
            r3 = r2
        L9:
            r4 = 3
            if (r3 >= r7) goto L2b
            r5 = r9[r3]
            int r6 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r6 > 0) goto L27
            int r7 = r3 + (-1)
            r9 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            float r8 = com.google.android.material.animation.AnimationUtils.lerp(r6, r9, r1, r5, r8)
            float r7 = (float) r7
            float r9 = (float) r3
            float[] r1 = new float[r4]
            r1[r0] = r8
            r1[r2] = r7
            r7 = 2
            r1[r7] = r9
            return r1
        L27:
            int r3 = r3 + 1
            r1 = r5
            goto L9
        L2b:
            float[] r7 = new float[r4]
            r7 = {x0032: FILL_ARRAY_DATA , data: [0, 0, 0} // fill-array
            return r7
    }

    private static java.util.List<com.google.android.material.carousel.KeylineState> getStateStepsStart(com.google.android.material.carousel.Carousel r18, com.google.android.material.carousel.KeylineState r19, float r20, float r21) {
            r0 = r19
            r1 = r20
            r2 = r21
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r3.add(r0)
            int r11 = findFirstNonAnchorKeylineIndex(r19)
            boolean r4 = r18.isHorizontal()
            if (r4 == 0) goto L1d
            int r4 = r18.getContainerWidth()
            goto L21
        L1d:
            int r4 = r18.getContainerHeight()
        L21:
            float r4 = (float) r4
            r12 = r4
            boolean r4 = isFirstFocalItemAtLeftOfContainer(r19)
            r13 = 0
            r14 = 1
            if (r4 != 0) goto Ld2
            r4 = -1
            if (r11 != r4) goto L30
            goto Ld2
        L30:
            int r4 = r19.getFirstFocalKeylineIndex()
            int r15 = r4 - r11
            com.google.android.material.carousel.KeylineState$Keyline r4 = r19.getFirstKeyline()
            float r4 = r4.locOffset
            com.google.android.material.carousel.KeylineState$Keyline r5 = r19.getFirstKeyline()
            float r5 = r5.maskedItemSize
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r6
            float r16 = r4 - r5
            if (r15 > 0) goto L63
            com.google.android.material.carousel.KeylineState$Keyline r4 = r19.getFirstFocalKeyline()
            float r4 = r4.cutoff
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 <= 0) goto L63
            com.google.android.material.carousel.KeylineState$Keyline r1 = r19.getFirstFocalKeyline()
            float r1 = r1.cutoff
            float r1 = r16 + r1
            com.google.android.material.carousel.KeylineState r0 = shiftKeylinesAndCreateKeylineState(r0, r1, r12)
            r3.add(r0)
            return r3
        L63:
            r4 = 0
            r10 = r4
            r4 = r13
        L66:
            if (r10 >= r15) goto Ld1
            int r5 = r3.size()
            int r5 = r5 - r14
            java.lang.Object r5 = r3.get(r5)
            com.google.android.material.carousel.KeylineState r5 = (com.google.android.material.carousel.KeylineState) r5
            int r6 = r11 + r10
            java.util.List r7 = r19.getKeylines()
            int r7 = r7.size()
            int r7 = r7 - r14
            java.util.List r8 = r19.getKeylines()
            java.lang.Object r8 = r8.get(r6)
            com.google.android.material.carousel.KeylineState$Keyline r8 = (com.google.android.material.carousel.KeylineState.Keyline) r8
            float r8 = r8.cutoff
            float r17 = r4 + r8
            int r6 = r6 - r14
            if (r6 < 0) goto La2
            java.util.List r4 = r19.getKeylines()
            java.lang.Object r4 = r4.get(r6)
            com.google.android.material.carousel.KeylineState$Keyline r4 = (com.google.android.material.carousel.KeylineState.Keyline) r4
            float r4 = r4.mask
            int r4 = findFirstIndexAfterLastFocalKeylineWithMask(r5, r4)
            int r4 = r4 - r14
            r6 = r4
            goto La3
        La2:
            r6 = r7
        La3:
            int r4 = r19.getFirstFocalKeylineIndex()
            int r4 = r4 - r10
            int r8 = r4 + (-1)
            int r4 = r19.getLastFocalKeylineIndex()
            int r4 = r4 - r10
            int r9 = r4 + (-1)
            float r7 = r16 + r17
            r4 = r5
            r5 = r11
            r14 = r10
            r10 = r12
            com.google.android.material.carousel.KeylineState r4 = moveKeylineAndCreateKeylineState(r4, r5, r6, r7, r8, r9, r10)
            int r5 = r15 + (-1)
            if (r14 != r5) goto Lc8
            int r5 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r5 <= 0) goto Lc8
            r5 = 1
            com.google.android.material.carousel.KeylineState r4 = shiftKeylineStateForPadding(r4, r2, r12, r5, r1)
        Lc8:
            r3.add(r4)
            int r10 = r14 + 1
            r4 = r17
            r14 = 1
            goto L66
        Ld1:
            return r3
        Ld2:
            int r4 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r4 <= 0) goto Lde
            r4 = 1
            com.google.android.material.carousel.KeylineState r0 = shiftKeylineStateForPadding(r0, r2, r12, r4, r1)
            r3.add(r0)
        Lde:
            return r3
    }

    private static boolean isFirstFocalItemAtLeftOfContainer(com.google.android.material.carousel.KeylineState r3) {
            com.google.android.material.carousel.KeylineState$Keyline r0 = r3.getFirstFocalKeyline()
            float r0 = r0.locOffset
            com.google.android.material.carousel.KeylineState$Keyline r1 = r3.getFirstFocalKeyline()
            float r1 = r1.maskedItemSize
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            float r0 = r0 - r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L21
            com.google.android.material.carousel.KeylineState$Keyline r0 = r3.getFirstFocalKeyline()
            com.google.android.material.carousel.KeylineState$Keyline r3 = r3.getFirstNonAnchorKeyline()
            if (r0 != r3) goto L21
            r3 = 1
            goto L22
        L21:
            r3 = 0
        L22:
            return r3
    }

    private static boolean isLastFocalItemVisibleAtRightOfContainer(com.google.android.material.carousel.Carousel r3, com.google.android.material.carousel.KeylineState r4) {
            int r0 = r3.getContainerHeight()
            boolean r1 = r3.isHorizontal()
            if (r1 == 0) goto Le
            int r0 = r3.getContainerWidth()
        Le:
            com.google.android.material.carousel.KeylineState$Keyline r3 = r4.getLastFocalKeyline()
            float r3 = r3.locOffset
            com.google.android.material.carousel.KeylineState$Keyline r1 = r4.getLastFocalKeyline()
            float r1 = r1.maskedItemSize
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            float r3 = r3 + r1
            float r0 = (float) r0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 > 0) goto L2f
            com.google.android.material.carousel.KeylineState$Keyline r3 = r4.getLastFocalKeyline()
            com.google.android.material.carousel.KeylineState$Keyline r4 = r4.getLastNonAnchorKeyline()
            if (r3 != r4) goto L2f
            r3 = 1
            goto L30
        L2f:
            r3 = 0
        L30:
            return r3
    }

    private static com.google.android.material.carousel.KeylineState lerp(java.util.List<com.google.android.material.carousel.KeylineState> r1, float r2, float[] r3) {
            float[] r2 = getStateStepsRange(r1, r2, r3)
            r3 = 1
            r3 = r2[r3]
            int r3 = (int) r3
            java.lang.Object r3 = r1.get(r3)
            com.google.android.material.carousel.KeylineState r3 = (com.google.android.material.carousel.KeylineState) r3
            r0 = 2
            r0 = r2[r0]
            int r0 = (int) r0
            java.lang.Object r1 = r1.get(r0)
            com.google.android.material.carousel.KeylineState r1 = (com.google.android.material.carousel.KeylineState) r1
            r0 = 0
            r2 = r2[r0]
            com.google.android.material.carousel.KeylineState r1 = com.google.android.material.carousel.KeylineState.lerp(r3, r1, r2)
            return r1
    }

    private static com.google.android.material.carousel.KeylineState moveKeylineAndCreateKeylineState(com.google.android.material.carousel.KeylineState r8, int r9, int r10, float r11, int r12, int r13, float r14) {
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r8.getKeylines()
            r0.<init>(r1)
            java.lang.Object r9 = r0.remove(r9)
            com.google.android.material.carousel.KeylineState$Keyline r9 = (com.google.android.material.carousel.KeylineState.Keyline) r9
            r0.add(r10, r9)
            com.google.android.material.carousel.KeylineState$Builder r9 = new com.google.android.material.carousel.KeylineState$Builder
            float r8 = r8.getItemSize()
            r9.<init>(r8, r14)
            r8 = 0
            r10 = r8
        L1d:
            int r14 = r0.size()
            if (r10 >= r14) goto L4a
            java.lang.Object r14 = r0.get(r10)
            com.google.android.material.carousel.KeylineState$Keyline r14 = (com.google.android.material.carousel.KeylineState.Keyline) r14
            float r1 = r14.maskedItemSize
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            float r2 = r11 + r1
            if (r10 < r12) goto L37
            if (r10 > r13) goto L37
            r1 = 1
            r5 = r1
            goto L38
        L37:
            r5 = r8
        L38:
            float r3 = r14.mask
            float r4 = r14.maskedItemSize
            boolean r6 = r14.isAnchor
            float r7 = r14.cutoff
            r1 = r9
            r1.addKeyline(r2, r3, r4, r5, r6, r7)
            float r14 = r14.maskedItemSize
            float r11 = r11 + r14
            int r10 = r10 + 1
            goto L1d
        L4a:
            com.google.android.material.carousel.KeylineState r8 = r9.build()
            return r8
    }

    private static com.google.android.material.carousel.KeylineState shiftKeylineStateForPadding(com.google.android.material.carousel.KeylineState r18, float r19, float r20, boolean r21, float r22) {
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r18.getKeylines()
            r0.<init>(r1)
            com.google.android.material.carousel.KeylineState$Builder r1 = new com.google.android.material.carousel.KeylineState$Builder
            float r2 = r18.getItemSize()
            r3 = r20
            r1.<init>(r2, r3)
            int r2 = r18.getNumberOfNonAnchorKeylines()
            float r2 = (float) r2
            float r11 = r19 / r2
            r12 = 0
            if (r21 == 0) goto L21
            r2 = r19
            goto L22
        L21:
            r2 = r12
        L22:
            r13 = 0
            r14 = r2
            r15 = r13
        L25:
            int r2 = r0.size()
            if (r15 >= r2) goto L8c
            java.lang.Object r2 = r0.get(r15)
            com.google.android.material.carousel.KeylineState$Keyline r2 = (com.google.android.material.carousel.KeylineState.Keyline) r2
            boolean r3 = r2.isAnchor
            if (r3 == 0) goto L44
            float r3 = r2.locOffset
            float r4 = r2.mask
            float r5 = r2.maskedItemSize
            r7 = 1
            float r8 = r2.cutoff
            r6 = 0
            r2 = r1
            r2.addKeyline(r3, r4, r5, r6, r7, r8)
            goto L89
        L44:
            int r3 = r18.getFirstFocalKeylineIndex()
            if (r15 < r3) goto L53
            int r3 = r18.getLastFocalKeylineIndex()
            if (r15 > r3) goto L53
            r3 = 1
            r6 = r3
            goto L54
        L53:
            r6 = r13
        L54:
            float r3 = r2.maskedItemSize
            float r10 = r3 - r11
            float r3 = r18.getItemSize()
            r9 = r22
            float r4 = com.google.android.material.carousel.CarouselStrategy.getChildMaskPercentage(r10, r3, r9)
            r3 = 1073741824(0x40000000, float:2.0)
            float r3 = r10 / r3
            float r3 = r3 + r14
            float r5 = r2.locOffset
            float r5 = r3 - r5
            float r8 = r2.cutoff
            if (r21 == 0) goto L72
            r16 = r5
            goto L74
        L72:
            r16 = r12
        L74:
            if (r21 == 0) goto L79
            r17 = r12
            goto L7b
        L79:
            r17 = r5
        L7b:
            r7 = 0
            r2 = r1
            r5 = r10
            r9 = r16
            r16 = r10
            r10 = r17
            r2.addKeyline(r3, r4, r5, r6, r7, r8, r9, r10)
            float r14 = r14 + r16
        L89:
            int r15 = r15 + 1
            goto L25
        L8c:
            com.google.android.material.carousel.KeylineState r0 = r1.build()
            return r0
    }

    private static com.google.android.material.carousel.KeylineState shiftKeylinesAndCreateKeylineState(com.google.android.material.carousel.KeylineState r7, float r8, float r9) {
            int r4 = r7.getFirstFocalKeylineIndex()
            int r5 = r7.getLastFocalKeylineIndex()
            r1 = 0
            r2 = 0
            r0 = r7
            r3 = r8
            r6 = r9
            com.google.android.material.carousel.KeylineState r7 = moveKeylineAndCreateKeylineState(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    com.google.android.material.carousel.KeylineState getDefaultState() {
            r1 = this;
            com.google.android.material.carousel.KeylineState r0 = r1.defaultState
            return r0
    }

    com.google.android.material.carousel.KeylineState getEndState() {
            r2 = this;
            java.util.List<com.google.android.material.carousel.KeylineState> r0 = r2.endStateSteps
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            com.google.android.material.carousel.KeylineState r0 = (com.google.android.material.carousel.KeylineState) r0
            return r0
    }

    java.util.Map<java.lang.Integer, com.google.android.material.carousel.KeylineState> getKeylineStateForPositionMap(int r11, int r12, int r13, boolean r14) {
            r10 = this;
            com.google.android.material.carousel.KeylineState r0 = r10.defaultState
            float r0 = r0.getItemSize()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = 0
            r3 = r2
            r4 = r3
        Le:
            r5 = -1
            r6 = 1
            if (r3 >= r11) goto L50
            if (r14 == 0) goto L18
            int r7 = r11 - r3
            int r7 = r7 - r6
            goto L19
        L18:
            r7 = r3
        L19:
            float r8 = (float) r7
            float r8 = r8 * r0
            if (r14 == 0) goto L1e
            goto L1f
        L1e:
            r5 = r6
        L1f:
            float r5 = (float) r5
            float r8 = r8 * r5
            float r5 = (float) r13
            float r9 = r10.endShiftRange
            float r5 = r5 - r9
            int r5 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r5 > 0) goto L33
            java.util.List<com.google.android.material.carousel.KeylineState> r5 = r10.endStateSteps
            int r5 = r5.size()
            int r5 = r11 - r5
            if (r3 < r5) goto L4d
        L33:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            java.util.List<com.google.android.material.carousel.KeylineState> r7 = r10.endStateSteps
            int r8 = r7.size()
            int r8 = r8 - r6
            int r6 = androidx.core.math.MathUtils.clamp(r4, r2, r8)
            java.lang.Object r6 = r7.get(r6)
            com.google.android.material.carousel.KeylineState r6 = (com.google.android.material.carousel.KeylineState) r6
            r1.put(r5, r6)
            int r4 = r4 + 1
        L4d:
            int r3 = r3 + 1
            goto Le
        L50:
            int r13 = r11 + (-1)
            r3 = r2
        L53:
            if (r13 < 0) goto L92
            if (r14 == 0) goto L5b
            int r4 = r11 - r13
            int r4 = r4 - r6
            goto L5c
        L5b:
            r4 = r13
        L5c:
            float r7 = (float) r4
            float r7 = r7 * r0
            if (r14 == 0) goto L62
            r8 = r5
            goto L63
        L62:
            r8 = r6
        L63:
            float r8 = (float) r8
            float r7 = r7 * r8
            float r8 = (float) r12
            float r9 = r10.startShiftRange
            float r8 = r8 + r9
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 < 0) goto L75
            java.util.List<com.google.android.material.carousel.KeylineState> r7 = r10.startStateSteps
            int r7 = r7.size()
            if (r13 >= r7) goto L8f
        L75:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.List<com.google.android.material.carousel.KeylineState> r7 = r10.startStateSteps
            int r8 = r7.size()
            int r8 = r8 - r6
            int r8 = androidx.core.math.MathUtils.clamp(r3, r2, r8)
            java.lang.Object r7 = r7.get(r8)
            com.google.android.material.carousel.KeylineState r7 = (com.google.android.material.carousel.KeylineState) r7
            r1.put(r4, r7)
            int r3 = r3 + 1
        L8f:
            int r13 = r13 + (-1)
            goto L53
        L92:
            return r1
    }

    public com.google.android.material.carousel.KeylineState getShiftedState(float r2, float r3, float r4) {
            r1 = this;
            r0 = 0
            com.google.android.material.carousel.KeylineState r2 = r1.getShiftedState(r2, r3, r4, r0)
            return r2
    }

    com.google.android.material.carousel.KeylineState getShiftedState(float r6, float r7, float r8, boolean r9) {
            r5 = this;
            float r0 = r5.startShiftRange
            float r0 = r0 + r7
            float r1 = r5.endShiftRange
            float r1 = r8 - r1
            com.google.android.material.carousel.KeylineState r2 = r5.getStartState()
            com.google.android.material.carousel.KeylineState$Keyline r2 = r2.getFirstFocalKeyline()
            float r2 = r2.leftOrTopPaddingShift
            com.google.android.material.carousel.KeylineState r3 = r5.getEndState()
            com.google.android.material.carousel.KeylineState$Keyline r3 = r3.getLastFocalKeyline()
            float r3 = r3.rightOrBottomPaddingShift
            float r4 = r5.startShiftRange
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L22
            float r0 = r0 + r2
        L22:
            float r2 = r5.endShiftRange
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L29
            float r1 = r1 - r3
        L29:
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r2 >= 0) goto L39
            float r6 = com.google.android.material.animation.AnimationUtils.lerp(r4, r3, r7, r0, r6)
            java.util.List<com.google.android.material.carousel.KeylineState> r7 = r5.startStateSteps
            float[] r8 = r5.startStateStepsInterpolationPoints
            goto L45
        L39:
            int r7 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r7 <= 0) goto L51
            float r6 = com.google.android.material.animation.AnimationUtils.lerp(r3, r4, r1, r8, r6)
            java.util.List<com.google.android.material.carousel.KeylineState> r7 = r5.endStateSteps
            float[] r8 = r5.endStateStepsInterpolationPoints
        L45:
            if (r9 == 0) goto L4c
            com.google.android.material.carousel.KeylineState r6 = r5.closestStateStepFromInterpolation(r7, r6, r8)
            return r6
        L4c:
            com.google.android.material.carousel.KeylineState r6 = lerp(r7, r6, r8)
            return r6
        L51:
            com.google.android.material.carousel.KeylineState r6 = r5.defaultState
            return r6
    }

    com.google.android.material.carousel.KeylineState getStartState() {
            r2 = this;
            java.util.List<com.google.android.material.carousel.KeylineState> r0 = r2.startStateSteps
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            com.google.android.material.carousel.KeylineState r0 = (com.google.android.material.carousel.KeylineState) r0
            return r0
    }
}
