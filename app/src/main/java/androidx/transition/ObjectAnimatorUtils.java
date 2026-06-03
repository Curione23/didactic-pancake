package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
class ObjectAnimatorUtils {

    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static <T, V> android.animation.ObjectAnimator ofObject(T r1, android.util.Property<T, V> r2, android.graphics.Path r3) {
                r0 = 0
                android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofObject(r1, r2, r0, r3)
                return r1
        }
    }

    private ObjectAnimatorUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static <T> android.animation.ObjectAnimator ofPointF(T r0, android.util.Property<T, android.graphics.PointF> r1, android.graphics.Path r2) {
            android.animation.ObjectAnimator r0 = androidx.transition.ObjectAnimatorUtils.Api21Impl.ofObject(r0, r1, r2)
            return r0
    }
}
