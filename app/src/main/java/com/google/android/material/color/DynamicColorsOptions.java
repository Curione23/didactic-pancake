package com.google.android.material.color;

/* JADX INFO: loaded from: classes.dex */
public class DynamicColorsOptions {
    private static final com.google.android.material.color.DynamicColors.Precondition ALWAYS_ALLOW = null;
    private static final com.google.android.material.color.DynamicColors.OnAppliedCallback NO_OP_CALLBACK = null;
    private java.lang.Integer contentBasedSeedColor;
    private final com.google.android.material.color.DynamicColors.OnAppliedCallback onAppliedCallback;
    private final com.google.android.material.color.DynamicColors.Precondition precondition;
    private final int themeOverlay;



    public static class Builder {
        private android.graphics.Bitmap contentBasedSourceBitmap;
        private java.lang.Integer contentBasedSourceColor;
        private com.google.android.material.color.DynamicColors.OnAppliedCallback onAppliedCallback;
        private com.google.android.material.color.DynamicColors.Precondition precondition;
        private int themeOverlay;

        public Builder() {
                r1 = this;
                r1.<init>()
                com.google.android.material.color.DynamicColors$Precondition r0 = com.google.android.material.color.DynamicColorsOptions.access$500()
                r1.precondition = r0
                com.google.android.material.color.DynamicColors$OnAppliedCallback r0 = com.google.android.material.color.DynamicColorsOptions.access$600()
                r1.onAppliedCallback = r0
                return
        }

        static /* synthetic */ int access$000(com.google.android.material.color.DynamicColorsOptions.Builder r0) {
                int r0 = r0.themeOverlay
                return r0
        }

        static /* synthetic */ com.google.android.material.color.DynamicColors.Precondition access$100(com.google.android.material.color.DynamicColorsOptions.Builder r0) {
                com.google.android.material.color.DynamicColors$Precondition r0 = r0.precondition
                return r0
        }

        static /* synthetic */ com.google.android.material.color.DynamicColors.OnAppliedCallback access$200(com.google.android.material.color.DynamicColorsOptions.Builder r0) {
                com.google.android.material.color.DynamicColors$OnAppliedCallback r0 = r0.onAppliedCallback
                return r0
        }

        static /* synthetic */ java.lang.Integer access$300(com.google.android.material.color.DynamicColorsOptions.Builder r0) {
                java.lang.Integer r0 = r0.contentBasedSourceColor
                return r0
        }

        static /* synthetic */ android.graphics.Bitmap access$400(com.google.android.material.color.DynamicColorsOptions.Builder r0) {
                android.graphics.Bitmap r0 = r0.contentBasedSourceBitmap
                return r0
        }

        public com.google.android.material.color.DynamicColorsOptions build() {
                r2 = this;
                com.google.android.material.color.DynamicColorsOptions r0 = new com.google.android.material.color.DynamicColorsOptions
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public com.google.android.material.color.DynamicColorsOptions.Builder setContentBasedSource(int r2) {
                r1 = this;
                r0 = 0
                r1.contentBasedSourceBitmap = r0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1.contentBasedSourceColor = r2
                return r1
        }

        public com.google.android.material.color.DynamicColorsOptions.Builder setContentBasedSource(android.graphics.Bitmap r1) {
                r0 = this;
                r0.contentBasedSourceBitmap = r1
                r1 = 0
                r0.contentBasedSourceColor = r1
                return r0
        }

        public com.google.android.material.color.DynamicColorsOptions.Builder setOnAppliedCallback(com.google.android.material.color.DynamicColors.OnAppliedCallback r1) {
                r0 = this;
                r0.onAppliedCallback = r1
                return r0
        }

        public com.google.android.material.color.DynamicColorsOptions.Builder setPrecondition(com.google.android.material.color.DynamicColors.Precondition r1) {
                r0 = this;
                r0.precondition = r1
                return r0
        }

        public com.google.android.material.color.DynamicColorsOptions.Builder setThemeOverlay(int r1) {
                r0 = this;
                r0.themeOverlay = r1
                return r0
        }
    }

    static {
            com.google.android.material.color.DynamicColorsOptions$1 r0 = new com.google.android.material.color.DynamicColorsOptions$1
            r0.<init>()
            com.google.android.material.color.DynamicColorsOptions.ALWAYS_ALLOW = r0
            com.google.android.material.color.DynamicColorsOptions$2 r0 = new com.google.android.material.color.DynamicColorsOptions$2
            r0.<init>()
            com.google.android.material.color.DynamicColorsOptions.NO_OP_CALLBACK = r0
            return
    }

    private DynamicColorsOptions(com.google.android.material.color.DynamicColorsOptions.Builder r2) {
            r1 = this;
            r1.<init>()
            int r0 = com.google.android.material.color.DynamicColorsOptions.Builder.access$000(r2)
            r1.themeOverlay = r0
            com.google.android.material.color.DynamicColors$Precondition r0 = com.google.android.material.color.DynamicColorsOptions.Builder.access$100(r2)
            r1.precondition = r0
            com.google.android.material.color.DynamicColors$OnAppliedCallback r0 = com.google.android.material.color.DynamicColorsOptions.Builder.access$200(r2)
            r1.onAppliedCallback = r0
            java.lang.Integer r0 = com.google.android.material.color.DynamicColorsOptions.Builder.access$300(r2)
            if (r0 == 0) goto L22
            java.lang.Integer r2 = com.google.android.material.color.DynamicColorsOptions.Builder.access$300(r2)
            r1.contentBasedSeedColor = r2
            goto L36
        L22:
            android.graphics.Bitmap r0 = com.google.android.material.color.DynamicColorsOptions.Builder.access$400(r2)
            if (r0 == 0) goto L36
            android.graphics.Bitmap r2 = com.google.android.material.color.DynamicColorsOptions.Builder.access$400(r2)
            int r2 = extractSeedColorFromImage(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.contentBasedSeedColor = r2
        L36:
            return
    }

    /* synthetic */ DynamicColorsOptions(com.google.android.material.color.DynamicColorsOptions.Builder r1, com.google.android.material.color.DynamicColorsOptions.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static /* synthetic */ com.google.android.material.color.DynamicColors.Precondition access$500() {
            com.google.android.material.color.DynamicColors$Precondition r0 = com.google.android.material.color.DynamicColorsOptions.ALWAYS_ALLOW
            return r0
    }

    static /* synthetic */ com.google.android.material.color.DynamicColors.OnAppliedCallback access$600() {
            com.google.android.material.color.DynamicColors$OnAppliedCallback r0 = com.google.android.material.color.DynamicColorsOptions.NO_OP_CALLBACK
            return r0
    }

    private static int extractSeedColorFromImage(android.graphics.Bitmap r9) {
            int r6 = r9.getWidth()
            int r7 = r9.getHeight()
            int r0 = r6 * r7
            int[] r8 = new int[r0]
            r4 = 0
            r5 = 0
            r2 = 0
            r0 = r9
            r1 = r8
            r3 = r6
            r0.getPixels(r1, r2, r3, r4, r5, r6, r7)
            r9 = 128(0x80, float:1.8E-43)
            java.util.Map r9 = com.google.android.material.color.utilities.QuantizerCelebi.quantize(r8, r9)
            java.util.List r9 = com.google.android.material.color.utilities.Score.score(r9)
            r0 = 0
            java.lang.Object r9 = r9.get(r0)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            return r9
    }

    public java.lang.Integer getContentBasedSeedColor() {
            r1 = this;
            java.lang.Integer r0 = r1.contentBasedSeedColor
            return r0
    }

    public com.google.android.material.color.DynamicColors.OnAppliedCallback getOnAppliedCallback() {
            r1 = this;
            com.google.android.material.color.DynamicColors$OnAppliedCallback r0 = r1.onAppliedCallback
            return r0
    }

    public com.google.android.material.color.DynamicColors.Precondition getPrecondition() {
            r1 = this;
            com.google.android.material.color.DynamicColors$Precondition r0 = r1.precondition
            return r0
    }

    public int getThemeOverlay() {
            r1 = this;
            int r0 = r1.themeOverlay
            return r0
    }
}
