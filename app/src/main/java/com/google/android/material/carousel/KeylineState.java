package com.google.android.material.carousel;

/* JADX INFO: loaded from: classes.dex */
final class KeylineState {
    private final int firstFocalKeylineIndex;
    private final float itemSize;
    private final java.util.List<com.google.android.material.carousel.KeylineState.Keyline> keylines;
    private final int lastFocalKeylineIndex;

    /* JADX INFO: renamed from: com.google.android.material.carousel.KeylineState$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder {
        private static final int NO_INDEX = -1;
        private static final float UNKNOWN_LOC = Float.MIN_VALUE;
        private final float availableSpace;
        private int firstFocalKeylineIndex;
        private final float itemSize;
        private int lastFocalKeylineIndex;
        private float lastKeylineMaskedSize;
        private int latestAnchorKeylineIndex;
        private com.google.android.material.carousel.KeylineState.Keyline tmpFirstFocalKeyline;
        private final java.util.List<com.google.android.material.carousel.KeylineState.Keyline> tmpKeylines;
        private com.google.android.material.carousel.KeylineState.Keyline tmpLastFocalKeyline;

        Builder(float r3, float r4) {
                r2 = this;
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.tmpKeylines = r0
                r0 = -1
                r2.firstFocalKeylineIndex = r0
                r2.lastFocalKeylineIndex = r0
                r1 = 0
                r2.lastKeylineMaskedSize = r1
                r2.latestAnchorKeylineIndex = r0
                r2.itemSize = r3
                r2.availableSpace = r4
                return
        }

        private static float calculateKeylineLocationForItemPosition(float r0, float r1, int r2, int r3) {
                float r2 = (float) r2
                float r2 = r2 * r1
                float r0 = r0 - r2
                float r2 = (float) r3
                float r2 = r2 * r1
                float r0 = r0 + r2
                return r0
        }

        com.google.android.material.carousel.KeylineState.Builder addAnchorKeyline(float r7, float r8, float r9) {
                r6 = this;
                r4 = 0
                r5 = 1
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                com.google.android.material.carousel.KeylineState$Builder r7 = r0.addKeyline(r1, r2, r3, r4, r5)
                return r7
        }

        com.google.android.material.carousel.KeylineState.Builder addKeyline(float r2, float r3, float r4) {
                r1 = this;
                r0 = 0
                com.google.android.material.carousel.KeylineState$Builder r2 = r1.addKeyline(r2, r3, r4, r0)
                return r2
        }

        com.google.android.material.carousel.KeylineState.Builder addKeyline(float r7, float r8, float r9, boolean r10) {
                r6 = this;
                r5 = 0
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                com.google.android.material.carousel.KeylineState$Builder r7 = r0.addKeyline(r1, r2, r3, r4, r5)
                return r7
        }

        com.google.android.material.carousel.KeylineState.Builder addKeyline(float r9, float r10, float r11, boolean r12, boolean r13) {
                r8 = this;
                r0 = 1073741824(0x40000000, float:2.0)
                float r0 = r11 / r0
                float r1 = r9 - r0
                float r0 = r0 + r9
                float r2 = r8.availableSpace
                int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r3 <= 0) goto L19
                float r1 = r0 - r11
                float r1 = java.lang.Math.max(r1, r2)
                float r0 = r0 - r1
                float r0 = java.lang.Math.abs(r0)
                goto L29
            L19:
                r0 = 0
                int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                if (r2 >= 0) goto L29
                float r2 = r1 + r11
                float r0 = java.lang.Math.min(r2, r0)
                float r1 = r1 - r0
                float r0 = java.lang.Math.abs(r1)
            L29:
                r7 = r0
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                r5 = r12
                r6 = r13
                com.google.android.material.carousel.KeylineState$Builder r9 = r1.addKeyline(r2, r3, r4, r5, r6, r7)
                return r9
        }

        com.google.android.material.carousel.KeylineState.Builder addKeyline(float r10, float r11, float r12, boolean r13, boolean r14, float r15) {
                r9 = this;
                r7 = 0
                r8 = 0
                r0 = r9
                r1 = r10
                r2 = r11
                r3 = r12
                r4 = r13
                r5 = r14
                r6 = r15
                com.google.android.material.carousel.KeylineState$Builder r10 = r0.addKeyline(r1, r2, r3, r4, r5, r6, r7, r8)
                return r10
        }

        com.google.android.material.carousel.KeylineState.Builder addKeyline(float r13, float r14, float r15, boolean r16, boolean r17, float r18, float r19, float r20) {
                r12 = this;
                r0 = r12
                r1 = 0
                int r1 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
                if (r1 > 0) goto L7
                return r0
            L7:
                r10 = -1
                if (r17 == 0) goto L2c
                if (r16 != 0) goto L24
                int r1 = r0.latestAnchorKeylineIndex
                if (r1 == r10) goto L1b
                if (r1 != 0) goto L13
                goto L1b
            L13:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Anchor keylines must be either the first or last keyline."
                r1.<init>(r2)
                throw r1
            L1b:
                java.util.List<com.google.android.material.carousel.KeylineState$Keyline> r1 = r0.tmpKeylines
                int r1 = r1.size()
                r0.latestAnchorKeylineIndex = r1
                goto L2c
            L24:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Anchor keylines cannot be focal."
                r1.<init>(r2)
                throw r1
            L2c:
                com.google.android.material.carousel.KeylineState$Keyline r11 = new com.google.android.material.carousel.KeylineState$Keyline
                r2 = 1
                r1 = r11
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r17
                r7 = r18
                r8 = r19
                r9 = r20
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
                if (r16 == 0) goto L82
                com.google.android.material.carousel.KeylineState$Keyline r1 = r0.tmpFirstFocalKeyline
                if (r1 != 0) goto L4e
                r0.tmpFirstFocalKeyline = r11
                java.util.List<com.google.android.material.carousel.KeylineState$Keyline> r1 = r0.tmpKeylines
                int r1 = r1.size()
                r0.firstFocalKeylineIndex = r1
            L4e:
                int r1 = r0.lastFocalKeylineIndex
                if (r1 == r10) goto L67
                java.util.List<com.google.android.material.carousel.KeylineState$Keyline> r1 = r0.tmpKeylines
                int r1 = r1.size()
                int r2 = r0.lastFocalKeylineIndex
                int r1 = r1 - r2
                r2 = 1
                if (r1 > r2) goto L5f
                goto L67
            L5f:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines."
                r1.<init>(r2)
                throw r1
            L67:
                com.google.android.material.carousel.KeylineState$Keyline r1 = r0.tmpFirstFocalKeyline
                float r1 = r1.maskedItemSize
                int r1 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
                if (r1 != 0) goto L7a
                r0.tmpLastFocalKeyline = r11
                java.util.List<com.google.android.material.carousel.KeylineState$Keyline> r1 = r0.tmpKeylines
                int r1 = r1.size()
                r0.lastFocalKeylineIndex = r1
                goto Lac
            L7a:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Keylines that are marked as focal must all have the same masked item size."
                r1.<init>(r2)
                throw r1
            L82:
                com.google.android.material.carousel.KeylineState$Keyline r1 = r0.tmpFirstFocalKeyline
                if (r1 != 0) goto L97
                float r1 = r11.maskedItemSize
                float r2 = r0.lastKeylineMaskedSize
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 < 0) goto L8f
                goto L97
            L8f:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Keylines before the first focal keyline must be ordered by incrementing masked item size."
                r1.<init>(r2)
                throw r1
            L97:
                com.google.android.material.carousel.KeylineState$Keyline r1 = r0.tmpLastFocalKeyline
                if (r1 == 0) goto Lac
                float r1 = r11.maskedItemSize
                float r2 = r0.lastKeylineMaskedSize
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 > 0) goto La4
                goto Lac
            La4:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Keylines after the last focal keyline must be ordered by decreasing masked item size."
                r1.<init>(r2)
                throw r1
            Lac:
                float r1 = r11.maskedItemSize
                r0.lastKeylineMaskedSize = r1
                java.util.List<com.google.android.material.carousel.KeylineState$Keyline> r1 = r0.tmpKeylines
                r1.add(r11)
                return r0
        }

        com.google.android.material.carousel.KeylineState.Builder addKeylineRange(float r7, float r8, float r9, int r10) {
                r6 = this;
                r5 = 0
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                com.google.android.material.carousel.KeylineState$Builder r7 = r0.addKeylineRange(r1, r2, r3, r4, r5)
                return r7
        }

        com.google.android.material.carousel.KeylineState.Builder addKeylineRange(float r3, float r4, float r5, int r6, boolean r7) {
                r2 = this;
                if (r6 <= 0) goto L14
                r0 = 0
                int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r0 > 0) goto L8
                goto L14
            L8:
                r0 = 0
            L9:
                if (r0 >= r6) goto L14
                float r1 = (float) r0
                float r1 = r1 * r5
                float r1 = r1 + r3
                r2.addKeyline(r1, r4, r5, r7)
                int r0 = r0 + 1
                goto L9
            L14:
                return r2
        }

        com.google.android.material.carousel.KeylineState build() {
                r13 = this;
                com.google.android.material.carousel.KeylineState$Keyline r0 = r13.tmpFirstFocalKeyline
                if (r0 == 0) goto L4e
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r0 = 0
            La:
                java.util.List<com.google.android.material.carousel.KeylineState$Keyline> r1 = r13.tmpKeylines
                int r1 = r1.size()
                if (r0 >= r1) goto L40
                java.util.List<com.google.android.material.carousel.KeylineState$Keyline> r1 = r13.tmpKeylines
                java.lang.Object r1 = r1.get(r0)
                com.google.android.material.carousel.KeylineState$Keyline r1 = (com.google.android.material.carousel.KeylineState.Keyline) r1
                com.google.android.material.carousel.KeylineState$Keyline r2 = new com.google.android.material.carousel.KeylineState$Keyline
                com.google.android.material.carousel.KeylineState$Keyline r4 = r13.tmpFirstFocalKeyline
                float r4 = r4.locOffset
                float r5 = r13.itemSize
                int r6 = r13.firstFocalKeylineIndex
                float r5 = calculateKeylineLocationForItemPosition(r4, r5, r6, r0)
                float r6 = r1.locOffset
                float r7 = r1.mask
                float r8 = r1.maskedItemSize
                boolean r9 = r1.isAnchor
                float r10 = r1.cutoff
                float r11 = r1.leftOrTopPaddingShift
                float r12 = r1.rightOrBottomPaddingShift
                r4 = r2
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
                r3.add(r2)
                int r0 = r0 + 1
                goto La
            L40:
                com.google.android.material.carousel.KeylineState r0 = new com.google.android.material.carousel.KeylineState
                float r2 = r13.itemSize
                int r4 = r13.firstFocalKeylineIndex
                int r5 = r13.lastFocalKeylineIndex
                r6 = 0
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6)
                return r0
            L4e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "There must be a keyline marked as focal."
                r0.<init>(r1)
                throw r0
        }
    }

    static final class Keyline {
        final float cutoff;
        final boolean isAnchor;
        final float leftOrTopPaddingShift;
        final float loc;
        final float locOffset;
        final float mask;
        final float maskedItemSize;
        final float rightOrBottomPaddingShift;

        Keyline(float r10, float r11, float r12, float r13) {
                r9 = this;
                r7 = 0
                r8 = 0
                r5 = 0
                r6 = 0
                r0 = r9
                r1 = r10
                r2 = r11
                r3 = r12
                r4 = r13
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return
        }

        Keyline(float r1, float r2, float r3, float r4, boolean r5, float r6, float r7, float r8) {
                r0 = this;
                r0.<init>()
                r0.loc = r1
                r0.locOffset = r2
                r0.mask = r3
                r0.maskedItemSize = r4
                r0.isAnchor = r5
                r0.cutoff = r6
                r0.leftOrTopPaddingShift = r7
                r0.rightOrBottomPaddingShift = r8
                return
        }

        static com.google.android.material.carousel.KeylineState.Keyline lerp(com.google.android.material.carousel.KeylineState.Keyline r5, com.google.android.material.carousel.KeylineState.Keyline r6, float r7) {
                com.google.android.material.carousel.KeylineState$Keyline r0 = new com.google.android.material.carousel.KeylineState$Keyline
                float r1 = r5.loc
                float r2 = r6.loc
                float r1 = com.google.android.material.animation.AnimationUtils.lerp(r1, r2, r7)
                float r2 = r5.locOffset
                float r3 = r6.locOffset
                float r2 = com.google.android.material.animation.AnimationUtils.lerp(r2, r3, r7)
                float r3 = r5.mask
                float r4 = r6.mask
                float r3 = com.google.android.material.animation.AnimationUtils.lerp(r3, r4, r7)
                float r5 = r5.maskedItemSize
                float r6 = r6.maskedItemSize
                float r5 = com.google.android.material.animation.AnimationUtils.lerp(r5, r6, r7)
                r0.<init>(r1, r2, r3, r5)
                return r0
        }
    }

    private KeylineState(float r1, java.util.List<com.google.android.material.carousel.KeylineState.Keyline> r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.itemSize = r1
            java.util.List r1 = java.util.Collections.unmodifiableList(r2)
            r0.keylines = r1
            r0.firstFocalKeylineIndex = r3
            r0.lastFocalKeylineIndex = r4
            return
    }

    /* synthetic */ KeylineState(float r1, java.util.List r2, int r3, int r4, com.google.android.material.carousel.KeylineState.AnonymousClass1 r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    static com.google.android.material.carousel.KeylineState lerp(com.google.android.material.carousel.KeylineState r6, com.google.android.material.carousel.KeylineState r7, float r8) {
            float r0 = r6.getItemSize()
            float r1 = r7.getItemSize()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L6e
            java.util.List r0 = r6.getKeylines()
            java.util.List r1 = r7.getKeylines()
            int r2 = r0.size()
            int r3 = r1.size()
            if (r2 != r3) goto L66
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
        L24:
            java.util.List r4 = r6.getKeylines()
            int r4 = r4.size()
            if (r3 >= r4) goto L44
            java.lang.Object r4 = r0.get(r3)
            com.google.android.material.carousel.KeylineState$Keyline r4 = (com.google.android.material.carousel.KeylineState.Keyline) r4
            java.lang.Object r5 = r1.get(r3)
            com.google.android.material.carousel.KeylineState$Keyline r5 = (com.google.android.material.carousel.KeylineState.Keyline) r5
            com.google.android.material.carousel.KeylineState$Keyline r4 = com.google.android.material.carousel.KeylineState.Keyline.lerp(r4, r5, r8)
            r2.add(r4)
            int r3 = r3 + 1
            goto L24
        L44:
            int r0 = r6.getFirstFocalKeylineIndex()
            int r1 = r7.getFirstFocalKeylineIndex()
            int r0 = com.google.android.material.animation.AnimationUtils.lerp(r0, r1, r8)
            int r1 = r6.getLastFocalKeylineIndex()
            int r7 = r7.getLastFocalKeylineIndex()
            int r7 = com.google.android.material.animation.AnimationUtils.lerp(r1, r7, r8)
            com.google.android.material.carousel.KeylineState r8 = new com.google.android.material.carousel.KeylineState
            float r6 = r6.getItemSize()
            r8.<init>(r6, r2, r0, r7)
            return r8
        L66:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Keylines being linearly interpolated must have the same number of keylines."
            r6.<init>(r7)
            throw r6
        L6e:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Keylines being linearly interpolated must have the same item size."
            r6.<init>(r7)
            throw r6
    }

    static com.google.android.material.carousel.KeylineState reverse(com.google.android.material.carousel.KeylineState r11, float r12) {
            com.google.android.material.carousel.KeylineState$Builder r6 = new com.google.android.material.carousel.KeylineState$Builder
            float r0 = r11.getItemSize()
            r6.<init>(r0, r12)
            com.google.android.material.carousel.KeylineState$Keyline r0 = r11.getLastKeyline()
            float r0 = r0.locOffset
            float r12 = r12 - r0
            com.google.android.material.carousel.KeylineState$Keyline r0 = r11.getLastKeyline()
            float r0 = r0.maskedItemSize
            r7 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r7
            float r12 = r12 - r0
            java.util.List r0 = r11.getKeylines()
            int r0 = r0.size()
            r8 = 1
            int r0 = r0 - r8
            r9 = r0
        L25:
            if (r9 < 0) goto L57
            java.util.List r0 = r11.getKeylines()
            java.lang.Object r0 = r0.get(r9)
            r10 = r0
            com.google.android.material.carousel.KeylineState$Keyline r10 = (com.google.android.material.carousel.KeylineState.Keyline) r10
            float r0 = r10.maskedItemSize
            float r0 = r0 / r7
            float r1 = r12 + r0
            int r0 = r11.getFirstFocalKeylineIndex()
            if (r9 < r0) goto L45
            int r0 = r11.getLastFocalKeylineIndex()
            if (r9 > r0) goto L45
            r4 = r8
            goto L47
        L45:
            r0 = 0
            r4 = r0
        L47:
            float r2 = r10.mask
            float r3 = r10.maskedItemSize
            boolean r5 = r10.isAnchor
            r0 = r6
            r0.addKeyline(r1, r2, r3, r4, r5)
            float r0 = r10.maskedItemSize
            float r12 = r12 + r0
            int r9 = r9 + (-1)
            goto L25
        L57:
            com.google.android.material.carousel.KeylineState r11 = r6.build()
            return r11
    }

    com.google.android.material.carousel.KeylineState.Keyline getFirstFocalKeyline() {
            r2 = this;
            java.util.List<com.google.android.material.carousel.KeylineState$Keyline> r0 = r2.keylines
            int r1 = r2.firstFocalKeylineIndex
            java.lang.Object r0 = r0.get(r1)
            com.google.android.material.carousel.KeylineState$Keyline r0 = (com.google.android.material.carousel.KeylineState.Keyline) r0
            return r0
    }

    int getFirstFocalKeylineIndex() {
            r1 = this;
            int r0 = r1.firstFocalKeylineIndex
            return r0
    }

    com.google.android.material.carousel.KeylineState.Keyline getFirstKeyline() {
            r2 = this;
            java.util.List<com.google.android.material.carousel.KeylineState$Keyline> r0 = r2.keylines
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.google.android.material.carousel.KeylineState$Keyline r0 = (com.google.android.material.carousel.KeylineState.Keyline) r0
            return r0
    }

    com.google.android.material.carousel.KeylineState.Keyline getFirstNonAnchorKeyline() {
            r3 = this;
            r0 = 0
        L1:
            java.util.List<com.google.android.material.carousel.KeylineState$Keyline> r1 = r3.keylines
            int r1 = r1.size()
            if (r0 >= r1) goto L19
            java.util.List<com.google.android.material.carousel.KeylineState$Keyline> r1 = r3.keylines
            java.lang.Object r1 = r1.get(r0)
            com.google.android.material.carousel.KeylineState$Keyline r1 = (com.google.android.material.carousel.KeylineState.Keyline) r1
            boolean r2 = r1.isAnchor
            if (r2 != 0) goto L16
            return r1
        L16:
            int r0 = r0 + 1
            goto L1
        L19:
            r0 = 0
            return r0
    }

    java.util.List<com.google.android.material.carousel.KeylineState.Keyline> getFocalKeylines() {
            r3 = this;
            java.util.List<com.google.android.material.carousel.KeylineState$Keyline> r0 = r3.keylines
            int r1 = r3.firstFocalKeylineIndex
            int r2 = r3.lastFocalKeylineIndex
            int r2 = r2 + 1
            java.util.List r0 = r0.subList(r1, r2)
            return r0
    }

    float getItemSize() {
            r1 = this;
            float r0 = r1.itemSize
            return r0
    }

    java.util.List<com.google.android.material.carousel.KeylineState.Keyline> getKeylines() {
            r1 = this;
            java.util.List<com.google.android.material.carousel.KeylineState$Keyline> r0 = r1.keylines
            return r0
    }

    com.google.android.material.carousel.KeylineState.Keyline getLastFocalKeyline() {
            r2 = this;
            java.util.List<com.google.android.material.carousel.KeylineState$Keyline> r0 = r2.keylines
            int r1 = r2.lastFocalKeylineIndex
            java.lang.Object r0 = r0.get(r1)
            com.google.android.material.carousel.KeylineState$Keyline r0 = (com.google.android.material.carousel.KeylineState.Keyline) r0
            return r0
    }

    int getLastFocalKeylineIndex() {
            r1 = this;
            int r0 = r1.lastFocalKeylineIndex
            return r0
    }

    com.google.android.material.carousel.KeylineState.Keyline getLastKeyline() {
            r2 = this;
            java.util.List<com.google.android.material.carousel.KeylineState$Keyline> r0 = r2.keylines
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            com.google.android.material.carousel.KeylineState$Keyline r0 = (com.google.android.material.carousel.KeylineState.Keyline) r0
            return r0
    }

    com.google.android.material.carousel.KeylineState.Keyline getLastNonAnchorKeyline() {
            r3 = this;
            java.util.List<com.google.android.material.carousel.KeylineState$Keyline> r0 = r3.keylines
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L1a
            java.util.List<com.google.android.material.carousel.KeylineState$Keyline> r1 = r3.keylines
            java.lang.Object r1 = r1.get(r0)
            com.google.android.material.carousel.KeylineState$Keyline r1 = (com.google.android.material.carousel.KeylineState.Keyline) r1
            boolean r2 = r1.isAnchor
            if (r2 != 0) goto L17
            return r1
        L17:
            int r0 = r0 + (-1)
            goto L8
        L1a:
            r0 = 0
            return r0
    }

    int getNumberOfNonAnchorKeylines() {
            r3 = this;
            java.util.List<com.google.android.material.carousel.KeylineState$Keyline> r0 = r3.keylines
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1a
            java.lang.Object r2 = r0.next()
            com.google.android.material.carousel.KeylineState$Keyline r2 = (com.google.android.material.carousel.KeylineState.Keyline) r2
            boolean r2 = r2.isAnchor
            if (r2 == 0) goto L7
            int r1 = r1 + 1
            goto L7
        L1a:
            java.util.List<com.google.android.material.carousel.KeylineState$Keyline> r0 = r3.keylines
            int r0 = r0.size()
            int r0 = r0 - r1
            return r0
    }
}
