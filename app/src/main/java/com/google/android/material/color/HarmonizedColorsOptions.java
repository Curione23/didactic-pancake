package com.google.android.material.color;

/* JADX INFO: loaded from: classes.dex */
public class HarmonizedColorsOptions {
    private final int colorAttributeToHarmonizeWith;
    private final com.google.android.material.color.HarmonizedColorAttributes colorAttributes;
    private final int[] colorResourceIds;

    /* JADX INFO: renamed from: com.google.android.material.color.HarmonizedColorsOptions$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder {
        private int colorAttributeToHarmonizeWith;
        private com.google.android.material.color.HarmonizedColorAttributes colorAttributes;
        private int[] colorResourceIds;

        public Builder() {
                r1 = this;
                r1.<init>()
                r0 = 0
                int[] r0 = new int[r0]
                r1.colorResourceIds = r0
                int r0 = com.google.android.material.R.attr.colorPrimary
                r1.colorAttributeToHarmonizeWith = r0
                return
        }

        static /* synthetic */ int[] access$000(com.google.android.material.color.HarmonizedColorsOptions.Builder r0) {
                int[] r0 = r0.colorResourceIds
                return r0
        }

        static /* synthetic */ com.google.android.material.color.HarmonizedColorAttributes access$100(com.google.android.material.color.HarmonizedColorsOptions.Builder r0) {
                com.google.android.material.color.HarmonizedColorAttributes r0 = r0.colorAttributes
                return r0
        }

        static /* synthetic */ int access$200(com.google.android.material.color.HarmonizedColorsOptions.Builder r0) {
                int r0 = r0.colorAttributeToHarmonizeWith
                return r0
        }

        public com.google.android.material.color.HarmonizedColorsOptions build() {
                r2 = this;
                com.google.android.material.color.HarmonizedColorsOptions r0 = new com.google.android.material.color.HarmonizedColorsOptions
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public com.google.android.material.color.HarmonizedColorsOptions.Builder setColorAttributeToHarmonizeWith(int r1) {
                r0 = this;
                r0.colorAttributeToHarmonizeWith = r1
                return r0
        }

        public com.google.android.material.color.HarmonizedColorsOptions.Builder setColorAttributes(com.google.android.material.color.HarmonizedColorAttributes r1) {
                r0 = this;
                r0.colorAttributes = r1
                return r0
        }

        public com.google.android.material.color.HarmonizedColorsOptions.Builder setColorResourceIds(int[] r1) {
                r0 = this;
                r0.colorResourceIds = r1
                return r0
        }
    }

    private HarmonizedColorsOptions(com.google.android.material.color.HarmonizedColorsOptions.Builder r2) {
            r1 = this;
            r1.<init>()
            int[] r0 = com.google.android.material.color.HarmonizedColorsOptions.Builder.access$000(r2)
            r1.colorResourceIds = r0
            com.google.android.material.color.HarmonizedColorAttributes r0 = com.google.android.material.color.HarmonizedColorsOptions.Builder.access$100(r2)
            r1.colorAttributes = r0
            int r2 = com.google.android.material.color.HarmonizedColorsOptions.Builder.access$200(r2)
            r1.colorAttributeToHarmonizeWith = r2
            return
    }

    /* synthetic */ HarmonizedColorsOptions(com.google.android.material.color.HarmonizedColorsOptions.Builder r1, com.google.android.material.color.HarmonizedColorsOptions.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static com.google.android.material.color.HarmonizedColorsOptions createMaterialDefaults() {
            com.google.android.material.color.HarmonizedColorsOptions$Builder r0 = new com.google.android.material.color.HarmonizedColorsOptions$Builder
            r0.<init>()
            com.google.android.material.color.HarmonizedColorAttributes r1 = com.google.android.material.color.HarmonizedColorAttributes.createMaterialDefaults()
            com.google.android.material.color.HarmonizedColorsOptions$Builder r0 = r0.setColorAttributes(r1)
            com.google.android.material.color.HarmonizedColorsOptions r0 = r0.build()
            return r0
    }

    public int getColorAttributeToHarmonizeWith() {
            r1 = this;
            int r0 = r1.colorAttributeToHarmonizeWith
            return r0
    }

    public com.google.android.material.color.HarmonizedColorAttributes getColorAttributes() {
            r1 = this;
            com.google.android.material.color.HarmonizedColorAttributes r0 = r1.colorAttributes
            return r0
    }

    public int[] getColorResourceIds() {
            r1 = this;
            int[] r0 = r1.colorResourceIds
            return r0
    }

    int getThemeOverlayResourceId(int r2) {
            r1 = this;
            com.google.android.material.color.HarmonizedColorAttributes r0 = r1.colorAttributes
            if (r0 == 0) goto L10
            int r0 = r0.getThemeOverlay()
            if (r0 == 0) goto L10
            com.google.android.material.color.HarmonizedColorAttributes r2 = r1.colorAttributes
            int r2 = r2.getThemeOverlay()
        L10:
            return r2
    }
}
