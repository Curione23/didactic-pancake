package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/Predicate.class */
public interface Predicate<T> {




    boolean test(T r1);

    default org.webrtc.Predicate<T> or(org.webrtc.Predicate<? super T> r6) {
            r5 = this;
            org.webrtc.Predicate$1 r0 = new org.webrtc.Predicate$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    default org.webrtc.Predicate<T> and(org.webrtc.Predicate<? super T> r6) {
            r5 = this;
            org.webrtc.Predicate$2 r0 = new org.webrtc.Predicate$2
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    default org.webrtc.Predicate<T> negate() {
            r4 = this;
            org.webrtc.Predicate$3 r0 = new org.webrtc.Predicate$3
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            return r0
    }
}
