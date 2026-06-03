package com.github.caciocavallosilano.cacio.peer;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/KFMHelper.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/KFMHelper.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/KFMHelper.class */
class KFMHelper {
    KFMHelper() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    static boolean processSynchronousLightweightTransfer(java.awt.Component r8, java.awt.Component r9, boolean r10, boolean r11, long r12) {
            sun.awt.AWTAccessor$KeyboardFocusManagerAccessor r0 = sun.awt.AWTAccessor.getKeyboardFocusManagerAccessor()
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            boolean r0 = r0.processSynchronousLightweightTransfer(r1, r2, r3, r4, r5)
            return r0
    }

    static int shouldNativelyFocusHeavyweight(java.awt.Component r9, java.awt.Component r10, boolean r11, boolean r12, long r13, java.awt.event.FocusEvent.Cause r15) {
            sun.awt.AWTAccessor$KeyboardFocusManagerAccessor r0 = sun.awt.AWTAccessor.getKeyboardFocusManagerAccessor()
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r15
            int r0 = r0.shouldNativelyFocusHeavyweight(r1, r2, r3, r4, r5, r6)
            return r0
    }
}
