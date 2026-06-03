package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
class PropertyValuesHolderUtils {

    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static <V> android.animation.PropertyValuesHolder ofObject(android.util.Property<?, V> r1, android.graphics.Path r2) {
                r0 = 0
                android.animation.PropertyValuesHolder r1 = android.animation.PropertyValuesHolder.ofObject(r1, r0, r2)
                return r1
        }
    }

    private PropertyValuesHolderUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static android.animation.PropertyValuesHolder ofPointF(android.util.Property<?, android.graphics.PointF> r0, android.graphics.Path r1) {
            android.animation.PropertyValuesHolder r0 = androidx.transition.PropertyValuesHolderUtils.Api21Impl.ofObject(r0, r1)
            return r0
    }
}
