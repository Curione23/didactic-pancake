package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class MenuItemCompat {

    @java.lang.Deprecated
    public static final int SHOW_AS_ACTION_ALWAYS = 2;

    @java.lang.Deprecated
    public static final int SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW = 8;

    @java.lang.Deprecated
    public static final int SHOW_AS_ACTION_IF_ROOM = 1;

    @java.lang.Deprecated
    public static final int SHOW_AS_ACTION_NEVER = 0;

    @java.lang.Deprecated
    public static final int SHOW_AS_ACTION_WITH_TEXT = 4;
    private static final java.lang.String TAG = "MenuItemCompat";


    static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getAlphabeticModifiers(android.view.MenuItem r0) {
                int r0 = r0.getAlphabeticModifiers()
                return r0
        }

        static java.lang.CharSequence getContentDescription(android.view.MenuItem r0) {
                java.lang.CharSequence r0 = r0.getContentDescription()
                return r0
        }

        static android.content.res.ColorStateList getIconTintList(android.view.MenuItem r0) {
                android.content.res.ColorStateList r0 = r0.getIconTintList()
                return r0
        }

        static android.graphics.PorterDuff.Mode getIconTintMode(android.view.MenuItem r0) {
                android.graphics.PorterDuff$Mode r0 = r0.getIconTintMode()
                return r0
        }

        static int getNumericModifiers(android.view.MenuItem r0) {
                int r0 = r0.getNumericModifiers()
                return r0
        }

        static java.lang.CharSequence getTooltipText(android.view.MenuItem r0) {
                java.lang.CharSequence r0 = r0.getTooltipText()
                return r0
        }

        static android.view.MenuItem setAlphabeticShortcut(android.view.MenuItem r0, char r1, int r2) {
                android.view.MenuItem r0 = r0.setAlphabeticShortcut(r1, r2)
                return r0
        }

        static android.view.MenuItem setContentDescription(android.view.MenuItem r0, java.lang.CharSequence r1) {
                android.view.MenuItem r0 = r0.setContentDescription(r1)
                return r0
        }

        static android.view.MenuItem setIconTintList(android.view.MenuItem r0, android.content.res.ColorStateList r1) {
                android.view.MenuItem r0 = r0.setIconTintList(r1)
                return r0
        }

        static android.view.MenuItem setIconTintMode(android.view.MenuItem r0, android.graphics.PorterDuff.Mode r1) {
                android.view.MenuItem r0 = r0.setIconTintMode(r1)
                return r0
        }

        static android.view.MenuItem setNumericShortcut(android.view.MenuItem r0, char r1, int r2) {
                android.view.MenuItem r0 = r0.setNumericShortcut(r1, r2)
                return r0
        }

        static android.view.MenuItem setShortcut(android.view.MenuItem r0, char r1, char r2, int r3, int r4) {
                android.view.MenuItem r0 = r0.setShortcut(r1, r2, r3, r4)
                return r0
        }

        static android.view.MenuItem setTooltipText(android.view.MenuItem r0, java.lang.CharSequence r1) {
                android.view.MenuItem r0 = r0.setTooltipText(r1)
                return r0
        }
    }

    @java.lang.Deprecated
    public interface OnActionExpandListener {
        boolean onMenuItemActionCollapse(android.view.MenuItem r1);

        boolean onMenuItemActionExpand(android.view.MenuItem r1);
    }

    private MenuItemCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static boolean collapseActionView(android.view.MenuItem r0) {
            boolean r0 = r0.collapseActionView()
            return r0
    }

    @java.lang.Deprecated
    public static boolean expandActionView(android.view.MenuItem r0) {
            boolean r0 = r0.expandActionView()
            return r0
    }

    public static androidx.core.view.ActionProvider getActionProvider(android.view.MenuItem r1) {
            boolean r0 = r1 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto Lb
            androidx.core.internal.view.SupportMenuItem r1 = (androidx.core.internal.view.SupportMenuItem) r1
            androidx.core.view.ActionProvider r1 = r1.getSupportActionProvider()
            return r1
        Lb:
            java.lang.String r1 = "MenuItemCompat"
            java.lang.String r0 = "getActionProvider: item does not implement SupportMenuItem; returning null"
            android.util.Log.w(r1, r0)
            r1 = 0
            return r1
    }

    @java.lang.Deprecated
    public static android.view.View getActionView(android.view.MenuItem r0) {
            android.view.View r0 = r0.getActionView()
            return r0
    }

    public static int getAlphabeticModifiers(android.view.MenuItem r1) {
            boolean r0 = r1 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto Lb
            androidx.core.internal.view.SupportMenuItem r1 = (androidx.core.internal.view.SupportMenuItem) r1
            int r1 = r1.getAlphabeticModifiers()
            return r1
        Lb:
            int r1 = androidx.core.view.MenuItemCompat.Api26Impl.getAlphabeticModifiers(r1)
            return r1
    }

    public static java.lang.CharSequence getContentDescription(android.view.MenuItem r1) {
            boolean r0 = r1 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto Lb
            androidx.core.internal.view.SupportMenuItem r1 = (androidx.core.internal.view.SupportMenuItem) r1
            java.lang.CharSequence r1 = r1.getContentDescription()
            return r1
        Lb:
            java.lang.CharSequence r1 = androidx.core.view.MenuItemCompat.Api26Impl.getContentDescription(r1)
            return r1
    }

    public static android.content.res.ColorStateList getIconTintList(android.view.MenuItem r1) {
            boolean r0 = r1 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto Lb
            androidx.core.internal.view.SupportMenuItem r1 = (androidx.core.internal.view.SupportMenuItem) r1
            android.content.res.ColorStateList r1 = r1.getIconTintList()
            return r1
        Lb:
            android.content.res.ColorStateList r1 = androidx.core.view.MenuItemCompat.Api26Impl.getIconTintList(r1)
            return r1
    }

    public static android.graphics.PorterDuff.Mode getIconTintMode(android.view.MenuItem r1) {
            boolean r0 = r1 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto Lb
            androidx.core.internal.view.SupportMenuItem r1 = (androidx.core.internal.view.SupportMenuItem) r1
            android.graphics.PorterDuff$Mode r1 = r1.getIconTintMode()
            return r1
        Lb:
            android.graphics.PorterDuff$Mode r1 = androidx.core.view.MenuItemCompat.Api26Impl.getIconTintMode(r1)
            return r1
    }

    public static int getNumericModifiers(android.view.MenuItem r1) {
            boolean r0 = r1 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto Lb
            androidx.core.internal.view.SupportMenuItem r1 = (androidx.core.internal.view.SupportMenuItem) r1
            int r1 = r1.getNumericModifiers()
            return r1
        Lb:
            int r1 = androidx.core.view.MenuItemCompat.Api26Impl.getNumericModifiers(r1)
            return r1
    }

    public static java.lang.CharSequence getTooltipText(android.view.MenuItem r1) {
            boolean r0 = r1 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto Lb
            androidx.core.internal.view.SupportMenuItem r1 = (androidx.core.internal.view.SupportMenuItem) r1
            java.lang.CharSequence r1 = r1.getTooltipText()
            return r1
        Lb:
            java.lang.CharSequence r1 = androidx.core.view.MenuItemCompat.Api26Impl.getTooltipText(r1)
            return r1
    }

    @java.lang.Deprecated
    public static boolean isActionViewExpanded(android.view.MenuItem r0) {
            boolean r0 = r0.isActionViewExpanded()
            return r0
    }

    public static android.view.MenuItem setActionProvider(android.view.MenuItem r1, androidx.core.view.ActionProvider r2) {
            boolean r0 = r1 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto Lb
            androidx.core.internal.view.SupportMenuItem r1 = (androidx.core.internal.view.SupportMenuItem) r1
            androidx.core.internal.view.SupportMenuItem r1 = r1.setSupportActionProvider(r2)
            return r1
        Lb:
            java.lang.String r2 = "MenuItemCompat"
            java.lang.String r0 = "setActionProvider: item does not implement SupportMenuItem; ignoring"
            android.util.Log.w(r2, r0)
            return r1
    }

    @java.lang.Deprecated
    public static android.view.MenuItem setActionView(android.view.MenuItem r0, int r1) {
            android.view.MenuItem r0 = r0.setActionView(r1)
            return r0
    }

    @java.lang.Deprecated
    public static android.view.MenuItem setActionView(android.view.MenuItem r0, android.view.View r1) {
            android.view.MenuItem r0 = r0.setActionView(r1)
            return r0
    }

    public static void setAlphabeticShortcut(android.view.MenuItem r1, char r2, int r3) {
            boolean r0 = r1 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto La
            androidx.core.internal.view.SupportMenuItem r1 = (androidx.core.internal.view.SupportMenuItem) r1
            r1.setAlphabeticShortcut(r2, r3)
            goto Ld
        La:
            androidx.core.view.MenuItemCompat.Api26Impl.setAlphabeticShortcut(r1, r2, r3)
        Ld:
            return
    }

    public static void setContentDescription(android.view.MenuItem r1, java.lang.CharSequence r2) {
            boolean r0 = r1 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto La
            androidx.core.internal.view.SupportMenuItem r1 = (androidx.core.internal.view.SupportMenuItem) r1
            r1.setContentDescription(r2)
            goto Ld
        La:
            androidx.core.view.MenuItemCompat.Api26Impl.setContentDescription(r1, r2)
        Ld:
            return
    }

    public static void setIconTintList(android.view.MenuItem r1, android.content.res.ColorStateList r2) {
            boolean r0 = r1 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto La
            androidx.core.internal.view.SupportMenuItem r1 = (androidx.core.internal.view.SupportMenuItem) r1
            r1.setIconTintList(r2)
            goto Ld
        La:
            androidx.core.view.MenuItemCompat.Api26Impl.setIconTintList(r1, r2)
        Ld:
            return
    }

    public static void setIconTintMode(android.view.MenuItem r1, android.graphics.PorterDuff.Mode r2) {
            boolean r0 = r1 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto La
            androidx.core.internal.view.SupportMenuItem r1 = (androidx.core.internal.view.SupportMenuItem) r1
            r1.setIconTintMode(r2)
            goto Ld
        La:
            androidx.core.view.MenuItemCompat.Api26Impl.setIconTintMode(r1, r2)
        Ld:
            return
    }

    public static void setNumericShortcut(android.view.MenuItem r1, char r2, int r3) {
            boolean r0 = r1 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto La
            androidx.core.internal.view.SupportMenuItem r1 = (androidx.core.internal.view.SupportMenuItem) r1
            r1.setNumericShortcut(r2, r3)
            goto Ld
        La:
            androidx.core.view.MenuItemCompat.Api26Impl.setNumericShortcut(r1, r2, r3)
        Ld:
            return
    }

    @java.lang.Deprecated
    public static android.view.MenuItem setOnActionExpandListener(android.view.MenuItem r1, androidx.core.view.MenuItemCompat.OnActionExpandListener r2) {
            androidx.core.view.MenuItemCompat$1 r0 = new androidx.core.view.MenuItemCompat$1
            r0.<init>(r2)
            android.view.MenuItem r1 = r1.setOnActionExpandListener(r0)
            return r1
    }

    public static void setShortcut(android.view.MenuItem r1, char r2, char r3, int r4, int r5) {
            boolean r0 = r1 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto La
            androidx.core.internal.view.SupportMenuItem r1 = (androidx.core.internal.view.SupportMenuItem) r1
            r1.setShortcut(r2, r3, r4, r5)
            goto Ld
        La:
            androidx.core.view.MenuItemCompat.Api26Impl.setShortcut(r1, r2, r3, r4, r5)
        Ld:
            return
    }

    @java.lang.Deprecated
    public static void setShowAsAction(android.view.MenuItem r0, int r1) {
            r0.setShowAsAction(r1)
            return
    }

    public static void setTooltipText(android.view.MenuItem r1, java.lang.CharSequence r2) {
            boolean r0 = r1 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto La
            androidx.core.internal.view.SupportMenuItem r1 = (androidx.core.internal.view.SupportMenuItem) r1
            r1.setTooltipText(r2)
            goto Ld
        La:
            androidx.core.view.MenuItemCompat.Api26Impl.setTooltipText(r1, r2)
        Ld:
            return
    }
}
