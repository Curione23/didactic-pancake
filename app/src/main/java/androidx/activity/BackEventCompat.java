package androidx.activity;

/* JADX INFO: compiled from: BackEventCompat.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0002\u0015\u0016B\u000f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0003H\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006\u0017"}, d2 = {"Landroidx/activity/BackEventCompat;", "", "backEvent", "Landroid/window/BackEvent;", "(Landroid/window/BackEvent;)V", "touchX", "", "touchY", "progress", "swipeEdge", "", "(FFFI)V", "getProgress", "()F", "getSwipeEdge", "()I", "getTouchX", "getTouchY", "toBackEvent", "toString", "", "Companion", "SwipeEdge", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BackEventCompat {
    public static final androidx.activity.BackEventCompat.Companion Companion = null;
    public static final int EDGE_LEFT = 0;
    public static final int EDGE_RIGHT = 1;
    private final float progress;
    private final int swipeEdge;
    private final float touchX;
    private final float touchY;

    /* JADX INFO: compiled from: BackEventCompat.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/activity/BackEventCompat$Companion;", "", "()V", "EDGE_LEFT", "", "EDGE_RIGHT", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: compiled from: BackEventCompat.kt */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/activity/BackEventCompat$SwipeEdge;", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.TYPE})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
    public @interface SwipeEdge {
    }

    static {
            androidx.activity.BackEventCompat$Companion r0 = new androidx.activity.BackEventCompat$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.activity.BackEventCompat.Companion = r0
            return
    }

    public BackEventCompat(float r1, float r2, float r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.touchX = r1
            r0.touchY = r2
            r0.progress = r3
            r0.swipeEdge = r4
            return
    }

    public BackEventCompat(android.window.BackEvent r5) {
            r4 = this;
            java.lang.String r0 = "backEvent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            androidx.activity.Api34Impl r0 = androidx.activity.Api34Impl.INSTANCE
            float r0 = r0.touchX(r5)
            androidx.activity.Api34Impl r1 = androidx.activity.Api34Impl.INSTANCE
            float r1 = r1.touchY(r5)
            androidx.activity.Api34Impl r2 = androidx.activity.Api34Impl.INSTANCE
            float r2 = r2.progress(r5)
            androidx.activity.Api34Impl r3 = androidx.activity.Api34Impl.INSTANCE
            int r5 = r3.swipeEdge(r5)
            r4.<init>(r0, r1, r2, r5)
            return
    }

    public final float getProgress() {
            r1 = this;
            float r0 = r1.progress
            return r0
    }

    public final int getSwipeEdge() {
            r1 = this;
            int r0 = r1.swipeEdge
            return r0
    }

    public final float getTouchX() {
            r1 = this;
            float r0 = r1.touchX
            return r0
    }

    public final float getTouchY() {
            r1 = this;
            float r0 = r1.touchY
            return r0
    }

    public final android.window.BackEvent toBackEvent() {
            r5 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L15
            androidx.activity.Api34Impl r0 = androidx.activity.Api34Impl.INSTANCE
            float r1 = r5.touchX
            float r2 = r5.touchY
            float r3 = r5.progress
            int r4 = r5.swipeEdge
            android.window.BackEvent r0 = r0.createOnBackEvent(r1, r2, r3, r4)
            return r0
        L15:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This method is only supported on API level 34+"
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BackEventCompat{touchX="
            r0.<init>(r1)
            float r1 = r2.touchX
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", touchY="
            java.lang.StringBuilder r0 = r0.append(r1)
            float r1 = r2.touchY
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", progress="
            java.lang.StringBuilder r0 = r0.append(r1)
            float r1 = r2.progress
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", swipeEdge="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.swipeEdge
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
