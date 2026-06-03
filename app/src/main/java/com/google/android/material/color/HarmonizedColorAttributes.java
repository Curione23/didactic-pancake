package com.google.android.material.color;

/* JADX INFO: loaded from: classes.dex */
public final class HarmonizedColorAttributes {
    private static final int[] HARMONIZED_MATERIAL_ATTRIBUTES = null;
    private final int[] attributes;
    private final int themeOverlay;

    static {
            int r0 = com.google.android.material.R.attr.colorError
            int r1 = com.google.android.material.R.attr.colorOnError
            int r2 = com.google.android.material.R.attr.colorErrorContainer
            int r3 = com.google.android.material.R.attr.colorOnErrorContainer
            int[] r0 = new int[]{r0, r1, r2, r3}
            com.google.android.material.color.HarmonizedColorAttributes.HARMONIZED_MATERIAL_ATTRIBUTES = r0
            return
    }

    private HarmonizedColorAttributes(int[] r2, int r3) {
            r1 = this;
            r1.<init>()
            if (r3 == 0) goto L11
            int r0 = r2.length
            if (r0 == 0) goto L9
            goto L11
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Theme overlay should be used with the accompanying int[] attributes."
            r2.<init>(r3)
            throw r2
        L11:
            r1.attributes = r2
            r1.themeOverlay = r3
            return
    }

    public static com.google.android.material.color.HarmonizedColorAttributes create(int[] r2) {
            com.google.android.material.color.HarmonizedColorAttributes r0 = new com.google.android.material.color.HarmonizedColorAttributes
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static com.google.android.material.color.HarmonizedColorAttributes create(int[] r1, int r2) {
            com.google.android.material.color.HarmonizedColorAttributes r0 = new com.google.android.material.color.HarmonizedColorAttributes
            r0.<init>(r1, r2)
            return r0
    }

    public static com.google.android.material.color.HarmonizedColorAttributes createMaterialDefaults() {
            int[] r0 = com.google.android.material.color.HarmonizedColorAttributes.HARMONIZED_MATERIAL_ATTRIBUTES
            int r1 = com.google.android.material.R.style.ThemeOverlay_Material3_HarmonizedColors
            com.google.android.material.color.HarmonizedColorAttributes r0 = create(r0, r1)
            return r0
    }

    public int[] getAttributes() {
            r1 = this;
            int[] r0 = r1.attributes
            return r0
    }

    public int getThemeOverlay() {
            r1 = this;
            int r0 = r1.themeOverlay
            return r0
    }
}
