package com.google.android.material.color;

/* JADX INFO: loaded from: classes.dex */
public class HarmonizedColors {
    private static final java.lang.String TAG = "HarmonizedColors";

    static {
            return
    }

    private HarmonizedColors() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void addHarmonizedColorAttributesToReplacementMap(java.util.Map<java.lang.Integer, java.lang.Integer> r4, android.content.res.TypedArray r5, android.content.res.TypedArray r6, int r7) {
            if (r6 == 0) goto L3
            goto L4
        L3:
            r6 = r5
        L4:
            r0 = 0
            r1 = r0
        L6:
            int r2 = r5.getIndexCount()
            if (r1 >= r2) goto L38
            int r2 = r6.getResourceId(r1, r0)
            if (r2 == 0) goto L35
            boolean r3 = r5.hasValue(r1)
            if (r3 == 0) goto L35
            int r3 = r5.getType(r1)
            boolean r3 = com.google.android.material.color.ResourcesLoaderUtils.isColorResource(r3)
            if (r3 == 0) goto L35
            int r3 = r5.getColor(r1, r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = com.google.android.material.color.MaterialColors.harmonize(r3, r7)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.put(r2, r3)
        L35:
            int r1 = r1 + 1
            goto L6
        L38:
            return
    }

    public static void applyToContextIfAvailable(android.content.Context r2, com.google.android.material.color.HarmonizedColorsOptions r3) {
            boolean r0 = isHarmonizedColorAvailable()
            if (r0 != 0) goto L7
            return
        L7:
            java.util.Map r0 = createHarmonizedColorReplacementMap(r2, r3)
            r1 = 0
            int r3 = r3.getThemeOverlayResourceId(r1)
            boolean r0 = com.google.android.material.color.ResourcesLoaderUtils.addResourcesLoaderToContext(r2, r0)
            if (r0 == 0) goto L1b
            if (r3 == 0) goto L1b
            com.google.android.material.color.ThemeUtils.applyThemeOverlay(r2, r3)
        L1b:
            return
    }

    private static java.util.Map<java.lang.Integer, java.lang.Integer> createHarmonizedColorReplacementMap(android.content.Context r7, com.google.android.material.color.HarmonizedColorsOptions r8) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r8.getColorAttributeToHarmonizeWith()
            java.lang.String r2 = com.google.android.material.color.HarmonizedColors.TAG
            int r1 = com.google.android.material.color.MaterialColors.getColor(r7, r1, r2)
            int[] r2 = r8.getColorResourceIds()
            int r3 = r2.length
            r4 = 0
        L15:
            if (r4 >= r3) goto L2f
            r5 = r2[r4]
            int r6 = androidx.core.content.ContextCompat.getColor(r7, r5)
            int r6 = com.google.android.material.color.MaterialColors.harmonize(r6, r1)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0.put(r5, r6)
            int r4 = r4 + 1
            goto L15
        L2f:
            com.google.android.material.color.HarmonizedColorAttributes r8 = r8.getColorAttributes()
            if (r8 == 0) goto L5c
            int[] r2 = r8.getAttributes()
            int r3 = r2.length
            if (r3 <= 0) goto L5c
            int r8 = r8.getThemeOverlay()
            android.content.res.TypedArray r3 = r7.obtainStyledAttributes(r2)
            if (r8 == 0) goto L50
            android.view.ContextThemeWrapper r4 = new android.view.ContextThemeWrapper
            r4.<init>(r7, r8)
            android.content.res.TypedArray r7 = r4.obtainStyledAttributes(r2)
            goto L51
        L50:
            r7 = 0
        L51:
            addHarmonizedColorAttributesToReplacementMap(r0, r3, r7, r1)
            r3.recycle()
            if (r7 == 0) goto L5c
            r7.recycle()
        L5c:
            return r0
    }

    public static boolean isHarmonizedColorAvailable() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static android.content.Context wrapContextIfAvailable(android.content.Context r2, com.google.android.material.color.HarmonizedColorsOptions r3) {
            boolean r0 = isHarmonizedColorAvailable()
            if (r0 != 0) goto L7
            return r2
        L7:
            java.util.Map r0 = createHarmonizedColorReplacementMap(r2, r3)
            int r1 = com.google.android.material.R.style.ThemeOverlay_Material3_HarmonizedColors_Empty
            int r3 = r3.getThemeOverlayResourceId(r1)
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            r1.<init>(r2, r3)
            android.content.res.Configuration r3 = new android.content.res.Configuration
            r3.<init>()
            r1.applyOverrideConfiguration(r3)
            boolean r3 = com.google.android.material.color.ResourcesLoaderUtils.addResourcesLoaderToContext(r1, r0)
            if (r3 == 0) goto L25
            r2 = r1
        L25:
            return r2
    }
}
