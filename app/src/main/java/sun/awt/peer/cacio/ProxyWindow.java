package sun.awt.peer.cacio;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/ProxyWindow.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/ProxyWindow.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/ProxyWindow.class */
public class ProxyWindow extends java.awt.Window {
    private sun.awt.peer.cacio.CacioComponentPeer target;
    private static java.lang.reflect.Field dispatcherField;
    private static java.lang.reflect.Method dispatchMethod;

    ProxyWindow(sun.awt.peer.cacio.CacioComponentPeer r4, javax.swing.JComponent r5) {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            r0.target = r1
            r0 = r3
            r1 = r5
            java.awt.Component r0 = r0.add(r1)
            return
    }

    sun.awt.peer.cacio.CacioComponentPeer getTargetPeer() {
            r2 = this;
            r0 = r2
            sun.awt.peer.cacio.CacioComponentPeer r0 = r0.target
            return r0
    }

    void handleFocusEvent(java.awt.event.FocusEvent r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.processFocusEvent(r1)
            return
    }

    void handleKeyEvent(java.awt.event.KeyEvent r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.processKeyEvent(r1)
            return
    }

    void handleMouseEvent(java.awt.event.MouseEvent r16) {
            r15 = this;
            java.awt.event.MouseEvent r0 = new java.awt.event.MouseEvent
            r1 = r0
            r2 = r15
            r3 = r16
            int r3 = r3.getID()
            r4 = r16
            long r4 = r4.getWhen()
            r5 = r16
            int r5 = r5.getModifiers()
            r6 = r16
            int r6 = r6.getX()
            r7 = r16
            int r7 = r7.getY()
            r8 = r16
            int r8 = r8.getXOnScreen()
            r9 = r16
            int r9 = r9.getYOnScreen()
            r10 = r16
            int r10 = r10.getClickCount()
            r11 = r16
            boolean r11 = r11.isPopupTrigger()
            r12 = r16
            int r12 = r12.getButton()
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r17 = r0
            r0 = r15
            r1 = r16
            r0.doLightweightDispatching(r1)
            return
    }

    void handleMouseMotionEvent(java.awt.event.MouseEvent r16) {
            r15 = this;
            java.awt.event.MouseEvent r0 = new java.awt.event.MouseEvent
            r1 = r0
            r2 = r15
            r3 = r16
            int r3 = r3.getID()
            r4 = r16
            long r4 = r4.getWhen()
            r5 = r16
            int r5 = r5.getModifiers()
            r6 = r16
            int r6 = r6.getX()
            r7 = r16
            int r7 = r7.getY()
            r8 = r16
            int r8 = r8.getXOnScreen()
            r9 = r16
            int r9 = r9.getYOnScreen()
            r10 = r16
            int r10 = r10.getClickCount()
            r11 = r16
            boolean r11 = r11.isPopupTrigger()
            r12 = r16
            int r12 = r12.getButton()
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r17 = r0
            r0 = r15
            r1 = r16
            r0.doLightweightDispatching(r1)
            return
    }

    private static void initReflection() {
            java.lang.Class<java.awt.Container> r0 = java.awt.Container.class
            java.lang.String r1 = "dispatcher"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> L33
            sun.awt.peer.cacio.ProxyWindow.dispatcherField = r0     // Catch: java.lang.Exception -> L33
            java.lang.reflect.Field r0 = sun.awt.peer.cacio.ProxyWindow.dispatcherField     // Catch: java.lang.Exception -> L33
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> L33
            java.lang.String r0 = "java.awt.LightweightDispatcher"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L33
            r7 = r0
            r0 = r7
            java.lang.String r1 = "dispatchEvent"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L33
            r3 = r2
            r4 = 0
            java.lang.Class<java.awt.AWTEvent> r5 = java.awt.AWTEvent.class
            r3[r4] = r5     // Catch: java.lang.Exception -> L33
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Exception -> L33
            sun.awt.peer.cacio.ProxyWindow.dispatchMethod = r0     // Catch: java.lang.Exception -> L33
            java.lang.reflect.Method r0 = sun.awt.peer.cacio.ProxyWindow.dispatchMethod     // Catch: java.lang.Exception -> L33
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> L33
            goto L44
        L33:
            r7 = move-exception
            java.lang.InternalError r0 = new java.lang.InternalError
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r8
            r1 = r7
            java.lang.Throwable r0 = r0.initCause(r1)
            r0 = r8
            throw r0
        L44:
            return
    }

    private void doLightweightDispatching(java.awt.AWTEvent r8) {
            r7 = this;
            java.lang.reflect.Field r0 = sun.awt.peer.cacio.ProxyWindow.dispatcherField
            if (r0 != 0) goto L9
            initReflection()
        L9:
            java.lang.reflect.Field r0 = sun.awt.peer.cacio.ProxyWindow.dispatcherField     // Catch: java.lang.Exception -> L28
            r1 = r7
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L28
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L25
            java.lang.reflect.Method r0 = sun.awt.peer.cacio.ProxyWindow.dispatchMethod     // Catch: java.lang.Exception -> L28
            r1 = r9
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L28
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5     // Catch: java.lang.Exception -> L28
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L28
        L25:
            goto L39
        L28:
            r9 = move-exception
            java.lang.InternalError r0 = new java.lang.InternalError
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r10
            r1 = r9
            java.lang.Throwable r0 = r0.initCause(r1)
            r0 = r10
            throw r0
        L39:
            return
    }

    public boolean isShowing() {
            r2 = this;
            r0 = r2
            sun.awt.peer.cacio.CacioComponentPeer r0 = r0.target
            java.awt.Component r0 = r0.getAWTComponent()
            boolean r0 = r0.isShowing()
            return r0
    }
}
