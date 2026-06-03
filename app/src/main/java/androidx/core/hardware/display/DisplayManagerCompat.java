package androidx.core.hardware.display;

/* JADX INFO: loaded from: classes.dex */
public final class DisplayManagerCompat {
    public static final java.lang.String DISPLAY_CATEGORY_PRESENTATION = "android.hardware.display.category.PRESENTATION";
    private final android.content.Context mContext;

    private DisplayManagerCompat(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.mContext = r1
            return
    }

    public static androidx.core.hardware.display.DisplayManagerCompat getInstance(android.content.Context r1) {
            androidx.core.hardware.display.DisplayManagerCompat r0 = new androidx.core.hardware.display.DisplayManagerCompat
            r0.<init>(r1)
            return r0
    }

    public android.view.Display getDisplay(int r3) {
            r2 = this;
            android.content.Context r0 = r2.mContext
            java.lang.String r1 = "display"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.hardware.display.DisplayManager r0 = (android.hardware.display.DisplayManager) r0
            android.view.Display r3 = r0.getDisplay(r3)
            return r3
    }

    public android.view.Display[] getDisplays() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            java.lang.String r1 = "display"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.hardware.display.DisplayManager r0 = (android.hardware.display.DisplayManager) r0
            android.view.Display[] r0 = r0.getDisplays()
            return r0
    }

    public android.view.Display[] getDisplays(java.lang.String r2) {
            r1 = this;
            android.content.Context r2 = r1.mContext
            java.lang.String r0 = "display"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.hardware.display.DisplayManager r2 = (android.hardware.display.DisplayManager) r2
            android.view.Display[] r2 = r2.getDisplays()
            return r2
    }
}
