package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class TooltipCompat {

    static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void setTooltipText(android.view.View r0, java.lang.CharSequence r1) {
                r0.setTooltipText(r1)
                return
        }
    }

    private TooltipCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void setTooltipText(android.view.View r0, java.lang.CharSequence r1) {
            androidx.appcompat.widget.TooltipCompat.Api26Impl.setTooltipText(r0, r1)
            return
    }
}
