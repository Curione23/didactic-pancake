package sun.awt.peer.cacio;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/BlitClipHelper.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/BlitClipHelper.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/BlitClipHelper.class */
public class BlitClipHelper {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/BlitClipHelper$Blitter.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/BlitClipHelper$Blitter.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/BlitClipHelper$Blitter.class */
    public interface Blitter {
        void doBlit(sun.java2d.SurfaceData r1, sun.java2d.SurfaceData r2, java.awt.Composite r3, int r4, int r5, int r6, int r7, int r8, int r9);
    }

    public BlitClipHelper() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void blitWithAnyClip(sun.awt.peer.cacio.BlitClipHelper.Blitter r15, sun.java2d.SurfaceData r16, sun.java2d.SurfaceData r17, java.awt.Composite r18, sun.java2d.pipe.Region r19, int r20, int r21, int r22, int r23, int r24, int r25) {
            r0 = r19
            if (r0 != 0) goto L1f
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = -1
            r5 = -1
            r6 = -1
            r7 = -1
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r12 = r24
            r13 = r25
            blitWithRectangularClip(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto Lb9
        L1f:
            r0 = r19
            boolean r0 = r0.isRectangular()
            if (r0 == 0) goto L61
            r0 = r19
            int r0 = r0.getLoX()
            r26 = r0
            r0 = r19
            int r0 = r0.getLoY()
            r27 = r0
            r0 = r19
            int r0 = r0.getWidth()
            r28 = r0
            r0 = r19
            int r0 = r0.getHeight()
            r29 = r0
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r26
            r5 = r27
            r6 = r28
            r7 = r29
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r12 = r24
            r13 = r25
            blitWithRectangularClip(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto Lb9
        L61:
            r0 = r19
            sun.java2d.pipe.SpanIterator r0 = r0.getSpanIterator()
            r26 = r0
            r0 = 4
            int[] r0 = new int[r0]
            r27 = r0
        L6d:
            r0 = r26
            r1 = r27
            boolean r0 = r0.nextSpan(r1)
            if (r0 == 0) goto Lb9
            r0 = r27
            r1 = 0
            r0 = r0[r1]
            r28 = r0
            r0 = r27
            r1 = 1
            r0 = r0[r1]
            r29 = r0
            r0 = r27
            r1 = 2
            r0 = r0[r1]
            r1 = r27
            r2 = 0
            r1 = r1[r2]
            int r0 = r0 - r1
            r30 = r0
            r0 = r27
            r1 = 3
            r0 = r0[r1]
            r1 = r27
            r2 = 1
            r1 = r1[r2]
            int r0 = r0 - r1
            r31 = r0
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r28
            r5 = r29
            r6 = r30
            r7 = r31
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r12 = r24
            r13 = r25
            blitWithRectangularClip(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L6d
        Lb9:
            return
    }

    private static void blitWithRectangularClip(sun.awt.peer.cacio.BlitClipHelper.Blitter r11, sun.java2d.SurfaceData r12, sun.java2d.SurfaceData r13, java.awt.Composite r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24) {
            r0 = r21
            r25 = r0
            r0 = r22
            r26 = r0
            r0 = r19
            r27 = r0
            r0 = r20
            r28 = r0
            r0 = r23
            r29 = r0
            r0 = r24
            r30 = r0
            r0 = r17
            r1 = -1
            if (r0 == r1) goto L9c
            r0 = r15
            r31 = r0
            r0 = r16
            r32 = r0
            r0 = r25
            r1 = r31
            int r0 = java.lang.Math.max(r0, r1)
            r25 = r0
            r0 = r26
            r1 = r32
            int r0 = java.lang.Math.max(r0, r1)
            r26 = r0
            r0 = r29
            r1 = r25
            r2 = r21
            int r1 = r1 - r2
            int r0 = r0 - r1
            r29 = r0
            r0 = r30
            r1 = r26
            r2 = r22
            int r1 = r1 - r2
            int r0 = r0 - r1
            r30 = r0
            r0 = r19
            r1 = r23
            int r0 = r0 + r1
            r1 = r29
            int r0 = r0 - r1
            r27 = r0
            r0 = r20
            r1 = r24
            int r0 = r0 + r1
            r1 = r30
            int r0 = r0 - r1
            r28 = r0
            r0 = r15
            r1 = r17
            int r0 = r0 + r1
            r33 = r0
            r0 = r16
            r1 = r18
            int r0 = r0 + r1
            r34 = r0
            r0 = r25
            r1 = r29
            int r0 = r0 + r1
            r35 = r0
            r0 = r26
            r1 = r30
            int r0 = r0 + r1
            r36 = r0
            r0 = r33
            r1 = r35
            int r0 = java.lang.Math.min(r0, r1)
            r35 = r0
            r0 = r34
            r1 = r36
            int r0 = java.lang.Math.min(r0, r1)
            r36 = r0
            r0 = r35
            r1 = r25
            int r0 = r0 - r1
            r29 = r0
            r0 = r36
            r1 = r26
            int r0 = r0 - r1
            r30 = r0
        L9c:
            r0 = r29
            if (r0 <= 0) goto La6
            r0 = r30
            if (r0 > 0) goto La7
        La6:
            return
        La7:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r27
            r5 = r28
            r6 = r25
            r7 = r26
            r8 = r29
            r9 = r30
            r0.doBlit(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }
}
