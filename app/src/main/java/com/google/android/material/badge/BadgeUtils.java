package com.google.android.material.badge;

/* JADX INFO: loaded from: classes.dex */
public class BadgeUtils {
    private static final java.lang.String LOG_TAG = "BadgeUtils";
    public static final boolean USE_COMPAT_PARENT = false;





    static {
            r0 = 0
            com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT = r0
            return
    }

    private BadgeUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void access$000(com.google.android.material.badge.BadgeDrawable r0, android.view.View r1) {
            attachBadgeContentDescription(r0, r1)
            return
    }

    private static void attachBadgeContentDescription(com.google.android.material.badge.BadgeDrawable r2, android.view.View r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L19
            boolean r0 = androidx.core.view.ViewCompat.hasAccessibilityDelegate(r3)
            if (r0 == 0) goto L19
            com.google.android.material.badge.BadgeUtils$2 r0 = new com.google.android.material.badge.BadgeUtils$2
            android.view.View$AccessibilityDelegate r1 = r3.getAccessibilityDelegate()
            r0.<init>(r1, r2)
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r3, r0)
            goto L21
        L19:
            com.google.android.material.badge.BadgeUtils$3 r0 = new com.google.android.material.badge.BadgeUtils$3
            r0.<init>(r2)
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r3, r0)
        L21:
            return
    }

    public static void attachBadgeDrawable(com.google.android.material.badge.BadgeDrawable r1, android.view.View r2) {
            r0 = 0
            attachBadgeDrawable(r1, r2, r0)
            return
    }

    public static void attachBadgeDrawable(com.google.android.material.badge.BadgeDrawable r0, android.view.View r1, android.widget.FrameLayout r2) {
            setBadgeDrawableBounds(r0, r1, r2)
            android.widget.FrameLayout r2 = r0.getCustomBadgeParent()
            if (r2 == 0) goto L11
            android.widget.FrameLayout r1 = r0.getCustomBadgeParent()
            r1.setForeground(r0)
            goto L1c
        L11:
            boolean r2 = com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT
            if (r2 != 0) goto L1d
            android.view.ViewOverlay r1 = r1.getOverlay()
            r1.add(r0)
        L1c:
            return
        L1d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Trying to reference null customBadgeParent"
            r0.<init>(r1)
            throw r0
    }

    public static void attachBadgeDrawable(com.google.android.material.badge.BadgeDrawable r1, androidx.appcompat.widget.Toolbar r2, int r3) {
            r0 = 0
            attachBadgeDrawable(r1, r2, r3, r0)
            return
    }

    public static void attachBadgeDrawable(com.google.android.material.badge.BadgeDrawable r1, androidx.appcompat.widget.Toolbar r2, int r3, android.widget.FrameLayout r4) {
            com.google.android.material.badge.BadgeUtils$1 r0 = new com.google.android.material.badge.BadgeUtils$1
            r0.<init>(r2, r3, r1, r4)
            r2.post(r0)
            return
    }

    public static android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> createBadgeDrawablesFromSavedStates(android.content.Context r4, com.google.android.material.internal.ParcelableSparseArray r5) {
            android.util.SparseArray r0 = new android.util.SparseArray
            int r1 = r5.size()
            r0.<init>(r1)
            r1 = 0
        La:
            int r2 = r5.size()
            if (r1 >= r2) goto L28
            int r2 = r5.keyAt(r1)
            java.lang.Object r3 = r5.valueAt(r1)
            com.google.android.material.badge.BadgeState$State r3 = (com.google.android.material.badge.BadgeState.State) r3
            if (r3 == 0) goto L21
            com.google.android.material.badge.BadgeDrawable r3 = com.google.android.material.badge.BadgeDrawable.createFromSavedState(r4, r3)
            goto L22
        L21:
            r3 = 0
        L22:
            r0.put(r2, r3)
            int r1 = r1 + 1
            goto La
        L28:
            return r0
    }

    public static com.google.android.material.internal.ParcelableSparseArray createParcelableBadgeStates(android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> r4) {
            com.google.android.material.internal.ParcelableSparseArray r0 = new com.google.android.material.internal.ParcelableSparseArray
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r4.size()
            if (r1 >= r2) goto L24
            int r2 = r4.keyAt(r1)
            java.lang.Object r3 = r4.valueAt(r1)
            com.google.android.material.badge.BadgeDrawable r3 = (com.google.android.material.badge.BadgeDrawable) r3
            if (r3 == 0) goto L1d
            com.google.android.material.badge.BadgeState$State r3 = r3.getSavedState()
            goto L1e
        L1d:
            r3 = 0
        L1e:
            r0.put(r2, r3)
            int r1 = r1 + 1
            goto L6
        L24:
            return r0
    }

    private static void detachBadgeContentDescription(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L19
            boolean r0 = androidx.core.view.ViewCompat.hasAccessibilityDelegate(r2)
            if (r0 == 0) goto L19
            com.google.android.material.badge.BadgeUtils$4 r0 = new com.google.android.material.badge.BadgeUtils$4
            android.view.View$AccessibilityDelegate r1 = r2.getAccessibilityDelegate()
            r0.<init>(r1)
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r2, r0)
            goto L1d
        L19:
            r0 = 0
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r2, r0)
        L1d:
            return
    }

    public static void detachBadgeDrawable(com.google.android.material.badge.BadgeDrawable r1, android.view.View r2) {
            if (r1 != 0) goto L3
            return
        L3:
            boolean r0 = com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT
            if (r0 != 0) goto L16
            android.widget.FrameLayout r0 = r1.getCustomBadgeParent()
            if (r0 == 0) goto Le
            goto L16
        Le:
            android.view.ViewOverlay r2 = r2.getOverlay()
            r2.remove(r1)
            goto L1e
        L16:
            android.widget.FrameLayout r1 = r1.getCustomBadgeParent()
            r2 = 0
            r1.setForeground(r2)
        L1e:
            return
    }

    public static void detachBadgeDrawable(com.google.android.material.badge.BadgeDrawable r0, androidx.appcompat.widget.Toolbar r1, int r2) {
            if (r0 != 0) goto L3
            return
        L3:
            androidx.appcompat.view.menu.ActionMenuItemView r1 = com.google.android.material.internal.ToolbarUtils.getActionMenuItemView(r1, r2)
            if (r1 == 0) goto L13
            removeToolbarOffset(r0)
            detachBadgeDrawable(r0, r1)
            detachBadgeContentDescription(r1)
            goto L27
        L13:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Trying to remove badge from a null menuItemView: "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BadgeUtils"
            android.util.Log.w(r1, r0)
        L27:
            return
    }

    static void removeToolbarOffset(com.google.android.material.badge.BadgeDrawable r1) {
            r0 = 0
            r1.setAdditionalHorizontalOffset(r0)
            r1.setAdditionalVerticalOffset(r0)
            return
    }

    public static void setBadgeDrawableBounds(com.google.android.material.badge.BadgeDrawable r1, android.view.View r2, android.widget.FrameLayout r3) {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.getDrawingRect(r0)
            r1.setBounds(r0)
            r1.updateBadgeCoordinates(r2, r3)
            return
    }

    static void setToolbarOffset(com.google.android.material.badge.BadgeDrawable r1, android.content.res.Resources r2) {
            int r0 = com.google.android.material.R.dimen.mtrl_badge_toolbar_action_menu_item_horizontal_offset
            int r0 = r2.getDimensionPixelOffset(r0)
            r1.setAdditionalHorizontalOffset(r0)
            int r0 = com.google.android.material.R.dimen.mtrl_badge_toolbar_action_menu_item_vertical_offset
            int r2 = r2.getDimensionPixelOffset(r0)
            r1.setAdditionalVerticalOffset(r2)
            return
    }

    public static void updateBadgeBounds(android.graphics.Rect r2, float r3, float r4, float r5, float r6) {
            float r0 = r3 - r5
            int r0 = (int) r0
            float r1 = r4 - r6
            int r1 = (int) r1
            float r3 = r3 + r5
            int r3 = (int) r3
            float r4 = r4 + r6
            int r4 = (int) r4
            r2.set(r0, r1, r3, r4)
            return
    }
}
