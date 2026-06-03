package ca.dnamobile.javalauncher.ui.view;

/* JADX INFO: loaded from: classes.dex */
public final class RoundedClipFrameLayout extends android.widget.FrameLayout {
    private float radiusPx;


    /* JADX INFO: renamed from: -$$Nest$fgetradiusPx, reason: not valid java name */
    static /* bridge */ /* synthetic */ float m584$$Nest$fgetradiusPx(ca.dnamobile.javalauncher.ui.view.RoundedClipFrameLayout r0) {
            float r0 = r0.radiusPx
            return r0
    }

    public RoundedClipFrameLayout(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r0.init()
            return
    }

    public RoundedClipFrameLayout(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.init()
            return
    }

    public RoundedClipFrameLayout(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.init()
            return
    }

    private void init() {
            r2 = this;
            android.content.res.Resources r0 = r2.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r1 = 1105199104(0x41e00000, float:28.0)
            float r0 = r0 * r1
            r2.radiusPx = r0
            r0 = 1
            r2.setClipChildren(r0)
            r2.setClipToPadding(r0)
            r2.setClipToOutline(r0)
            ca.dnamobile.javalauncher.ui.view.RoundedClipFrameLayout$1 r0 = new ca.dnamobile.javalauncher.ui.view.RoundedClipFrameLayout$1
            r0.<init>(r2)
            r2.setOutlineProvider(r0)
            return
    }
}
