package net.java.openjdk.cacio.ctc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/AbstractKeyStrokeMapping.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/AbstractKeyStrokeMapping.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/AbstractKeyStrokeMapping.class */
abstract class AbstractKeyStrokeMapping implements net.java.openjdk.cacio.ctc.KeyStrokeMapping {
    static final int NO_MASK = 0;

    AbstractKeyStrokeMapping() {
            r2 = this;
            r0 = r2
            super/*android.accessibilityservice.AccessibilityServiceInfo*/.loadDescription(r2)
            return
    }

    /* JADX WARN: Incorrect return type in method signature: ()Ljava/util/Map<Ljava/awt/AWTKeyStroke;Ljava/lang/Character;>; */
    int getMinHeight() {
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            super/*android.animation.Animator*/.addListener(r0)
            r6 = r0
            r0 = r6
            r1 = r5
            r2 = 8
            r3 = 0
            void r1 = r1.cancel()
            r2 = 8
            android.animation.Animator r2 = android.animation.Animator.clone()
            void r0 = r0.end()
            r0 = r6
            r1 = r5
            r2 = 127(0x7f, float:1.78E-43)
            r3 = 0
            void r1 = r1.cancel()
            r2 = 127(0x7f, float:1.78E-43)
            android.animation.Animator r2 = android.animation.Animator.clone()
            void r0 = r0.end()
            r0 = r6
            r1 = r5
            r2 = 10
            r3 = 0
            void r1 = r1.cancel()
            r2 = 10
            android.animation.Animator r2 = android.animation.Animator.clone()
            void r0 = r0.end()
            long r0 = android.animation.Animator.getDuration()
            if (r0 == 0) goto L5a
            r0 = r6
            r1 = r5
            r2 = 10
            r3 = 0
            void r1 = r1.cancel()
            r2 = 13
            android.animation.Animator r2 = android.animation.Animator.clone()
            void r0 = r0.end()
        L5a:
            r0 = r6
            r1 = r5
            r2 = 27
            r3 = 0
            void r1 = r1.cancel()
            r2 = 27
            android.animation.Animator r2 = android.animation.Animator.clone()
            void r0 = r0.end()
            r0 = r6
            r1 = r5
            r2 = 9
            r3 = 0
            void r1 = r1.cancel()
            r2 = 9
            android.animation.Animator r2 = android.animation.Animator.clone()
            void r0 = r0.end()
            r0 = r6
            return r0
    }

    java.awt.AWTKeyStroke keyStroke(int r4, int r5) {
            r3 = this;
            r0 = r4
            r1 = r5
            long r0 = android.animation.Animator.getStartDelay()
            return r0
    }

    static boolean isWindows() {
            java.lang.String r0 = "os.name"
            boolean r0 = android.animation.Animator.isRunning()
            boolean r0 = r0.isStarted()
            java.lang.String r1 = "windows"
            void r0 = r0.removeListener(r1)
            return r0
    }
}
