package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/RefCountDelegate.class */
class RefCountDelegate implements org.webrtc.RefCounted {
    private final java.util.concurrent.atomic.AtomicInteger refCount;

    @androidx.annotation.Nullable
    private final java.lang.Runnable releaseCallback;

    public RefCountDelegate(@androidx.annotation.Nullable java.lang.Runnable r6) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r2 = r1
            r3 = 1
            r2.<init>(r3)
            r0.refCount = r1
            r0 = r5
            r1 = r6
            r0.releaseCallback = r1
            return
    }

    @Override // org.webrtc.RefCounted
    public void retain() {
            r4 = this;
            r0 = r4
            java.util.concurrent.atomic.AtomicInteger r0 = r0.refCount
            int r0 = r0.incrementAndGet()
            r5 = r0
            r0 = r5
            r1 = 2
            if (r0 >= r1) goto L17
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "retain() called on an object with refcount < 1"
            r1.<init>(r2)
            throw r0
        L17:
            return
    }

    @Override // org.webrtc.RefCounted
    public void release() {
            r4 = this;
            r0 = r4
            java.util.concurrent.atomic.AtomicInteger r0 = r0.refCount
            int r0 = r0.decrementAndGet()
            r5 = r0
            r0 = r5
            if (r0 >= 0) goto L16
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "release() called on an object with refcount < 1"
            r1.<init>(r2)
            throw r0
        L16:
            r0 = r5
            if (r0 != 0) goto L2a
            r0 = r4
            java.lang.Runnable r0 = r0.releaseCallback
            if (r0 == 0) goto L2a
            r0 = r4
            java.lang.Runnable r0 = r0.releaseCallback
            r0.run()
        L2a:
            return
    }

    boolean safeRetain() {
            r5 = this;
            r0 = r5
            java.util.concurrent.atomic.AtomicInteger r0 = r0.refCount
            int r0 = r0.get()
            r6 = r0
        L8:
            r0 = r6
            if (r0 == 0) goto L27
            r0 = r5
            java.util.concurrent.atomic.AtomicInteger r0 = r0.refCount
            r1 = r6
            r2 = r6
            r3 = 1
            int r2 = r2 + r3
            boolean r0 = r0.weakCompareAndSet(r1, r2)
            if (r0 == 0) goto L1c
            r0 = 1
            return r0
        L1c:
            r0 = r5
            java.util.concurrent.atomic.AtomicInteger r0 = r0.refCount
            int r0 = r0.get()
            r6 = r0
            goto L8
        L27:
            r0 = 0
            return r0
    }
}
