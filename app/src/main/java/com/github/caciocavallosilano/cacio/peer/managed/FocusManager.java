package com.github.caciocavallosilano.cacio.peer.managed;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/managed/FocusManager.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/managed/FocusManager.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/managed/FocusManager.class */
public class FocusManager {
    private static java.util.logging.Logger logger;
    private static com.github.caciocavallosilano.cacio.peer.managed.FocusManager instance;
    private static final java.lang.Class focusManagerCls = null;
    private java.util.Stack<com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow> focusedWindowStack;

    static com.github.caciocavallosilano.cacio.peer.managed.FocusManager getInstance() {
            com.github.caciocavallosilano.cacio.peer.managed.FocusManager r0 = com.github.caciocavallosilano.cacio.peer.managed.FocusManager.instance
            if (r0 != 0) goto L22
            java.lang.Class r0 = com.github.caciocavallosilano.cacio.peer.managed.FocusManager.focusManagerCls     // Catch: java.lang.ReflectiveOperationException -> L15
            java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.ReflectiveOperationException -> L15
            com.github.caciocavallosilano.cacio.peer.managed.FocusManager r0 = (com.github.caciocavallosilano.cacio.peer.managed.FocusManager) r0     // Catch: java.lang.ReflectiveOperationException -> L15
            com.github.caciocavallosilano.cacio.peer.managed.FocusManager.instance = r0     // Catch: java.lang.ReflectiveOperationException -> L15
            goto L22
        L15:
            r5 = move-exception
            java.util.logging.Logger r0 = com.github.caciocavallosilano.cacio.peer.managed.FocusManager.logger
            java.util.logging.Level r1 = java.util.logging.Level.SEVERE
            java.lang.String r2 = "Unable to create FocusManager instance"
            r3 = r5
            r0.log(r1, r2, r3)
        L22:
            com.github.caciocavallosilano.cacio.peer.managed.FocusManager r0 = com.github.caciocavallosilano.cacio.peer.managed.FocusManager.instance
            com.github.caciocavallosilano.cacio.peer.managed.FocusManager r0 = r0.getContextInstance()
            return r0
    }

    public FocusManager() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            java.util.Stack r1 = new java.util.Stack
            r2 = r1
            r2.<init>()
            r0.focusedWindowStack = r1
            return
    }

    protected com.github.caciocavallosilano.cacio.peer.managed.FocusManager getContextInstance() {
            r2 = this;
            com.github.caciocavallosilano.cacio.peer.managed.FocusManager r0 = com.github.caciocavallosilano.cacio.peer.managed.FocusManager.instance
            return r0
    }

    com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow getFocusedWindow() {
            r2 = this;
            r0 = r2
            java.util.Stack<com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow> r0 = r0.focusedWindowStack
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lc
            r0 = 0
            return r0
        Lc:
            r0 = r2
            java.util.Stack<com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow> r0 = r0.focusedWindowStack
            java.lang.Object r0 = r0.lastElement()
            com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow r0 = (com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow) r0
            return r0
    }

    void setVisible(com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow r4, boolean r5) {
            r3 = this;
            r0 = r5
            if (r0 == 0) goto Lc
            r0 = r3
            r1 = r4
            r0.setFocusedWindow(r1)
            goto L11
        Lc:
            r0 = r3
            r1 = r4
            r0.hideWindow(r1)
        L11:
            return
    }

    private void hideWindow(com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow r5) {
            r4 = this;
            r0 = r4
            com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow r0 = r0.getFocusedWindow()
            r1 = r5
            if (r0 != r1) goto L34
            r0 = r4
            java.util.Stack<com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow> r0 = r0.focusedWindowStack
            int r0 = r0.size()
            r1 = 1
            if (r0 <= r1) goto L2f
            r0 = r4
            java.util.Stack<com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow> r0 = r0.focusedWindowStack
            r1 = r4
            java.util.Stack<com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow> r1 = r1.focusedWindowStack
            int r1 = r1.size()
            r2 = 2
            int r1 = r1 - r2
            java.lang.Object r0 = r0.get(r1)
            com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow r0 = (com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow) r0
            r6 = r0
            r0 = r4
            r1 = r6
            r0.setFocusedWindow(r1)
            goto L34
        L2f:
            r0 = r4
            r1 = 0
            r0.setFocusedWindow(r1)
        L34:
            r0 = r4
            java.util.Stack<com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow> r0 = r0.focusedWindowStack
            r1 = r5
            boolean r0 = r0.remove(r1)
            return
    }

    void mousePressed(com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow r1 = r1.getFocusedWindow()
            if (r0 == r1) goto Ld
            r0 = r3
            r1 = r4
            r0.setFocusedWindow(r1)
        Ld:
            return
    }

    void setFocusedWindow(com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow r5) {
            r4 = this;
            r0 = r5
            if (r0 == 0) goto L2d
            r0 = r5
            com.github.caciocavallosilano.cacio.peer.CacioComponent r0 = r0.getCacioComponent()
            if (r0 == 0) goto L17
            r0 = r5
            com.github.caciocavallosilano.cacio.peer.CacioComponent r0 = r0.getCacioComponent()
            boolean r0 = r0.isFocusable()
            if (r0 == 0) goto L2d
        L17:
            r0 = r4
            com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow r0 = r0.getFocusedWindow()
            r6 = r0
            r0 = r4
            r1 = r5
            r0.setFocusedWindowNoEvent(r1)
            r0 = r4
            r1 = r6
            r2 = r5
            r0.focusLost(r1, r2)
            r0 = r4
            r1 = r5
            r2 = r6
            r0.focusGained(r1, r2)
        L2d:
            return
    }

    void setFocusedWindowNoEvent(com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow r4) {
            r3 = this;
            r0 = r4
            if (r0 != 0) goto Lf
            r0 = r3
            java.util.Stack<com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow> r0 = r0.focusedWindowStack
            java.lang.Object r0 = r0.pop()
            goto L21
        Lf:
            r0 = r3
            java.util.Stack<com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow> r0 = r0.focusedWindowStack
            r1 = r4
            boolean r0 = r0.removeElement(r1)
            r0 = r3
            java.util.Stack<com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow> r0 = r0.focusedWindowStack
            r1 = r4
            java.lang.Object r0 = r0.push(r1)
        L21:
            return
    }

    private void focusLost(com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow r8, com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow r9) {
            r7 = this;
            r0 = r8
            if (r0 == 0) goto L31
            r0 = r8
            com.github.caciocavallosilano.cacio.peer.CacioComponent r0 = r0.getCacioComponent()
            r10 = r0
            r0 = r10
            java.awt.Component r0 = r0.getAWTComponent()
            r11 = r0
            r0 = r7
            r1 = r9
            java.awt.Component r0 = r0.getAWTComponent(r1)
            r12 = r0
            java.awt.event.FocusEvent r0 = new java.awt.event.FocusEvent
            r1 = r0
            r2 = r11
            r3 = 1005(0x3ed, float:1.408E-42)
            r4 = 0
            r5 = r12
            r1.<init>(r2, r3, r4, r5)
            r13 = r0
            r0 = r10
            r1 = r13
            r0.handlePeerEvent(r1)
        L31:
            return
    }

    private void focusGained(com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow r8, com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow r9) {
            r7 = this;
            r0 = r8
            if (r0 == 0) goto L31
            r0 = r8
            com.github.caciocavallosilano.cacio.peer.CacioComponent r0 = r0.getCacioComponent()
            r10 = r0
            r0 = r10
            java.awt.Component r0 = r0.getAWTComponent()
            r11 = r0
            r0 = r7
            r1 = r9
            java.awt.Component r0 = r0.getAWTComponent(r1)
            r12 = r0
            java.awt.event.FocusEvent r0 = new java.awt.event.FocusEvent
            r1 = r0
            r2 = r11
            r3 = 1004(0x3ec, float:1.407E-42)
            r4 = 0
            r5 = r12
            r1.<init>(r2, r3, r4, r5)
            r13 = r0
            r0 = r10
            r1 = r13
            r0.handlePeerEvent(r1)
        L31:
            return
    }

    private java.awt.Component getAWTComponent(com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow r3) {
            r2 = this;
            r0 = r3
            if (r0 == 0) goto L13
            r0 = r3
            com.github.caciocavallosilano.cacio.peer.CacioComponent r0 = r0.getCacioComponent()
            r5 = r0
            r0 = r5
            java.awt.Component r0 = r0.getAWTComponent()
            r4 = r0
            goto L15
        L13:
            r0 = 0
            r4 = r0
        L15:
            r0 = r4
            return r0
    }

    private static /* synthetic */ java.lang.String lambda$static$0() {
            java.lang.String r0 = "cacio.focusmgr"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            return r0
    }

    static {
            java.lang.Class<com.github.caciocavallosilano.cacio.peer.managed.FocusManager> r0 = com.github.caciocavallosilano.cacio.peer.managed.FocusManager.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.github.caciocavallosilano.cacio.peer.managed.FocusManager.logger = r0
            void r0 = () -> { // java.security.PrivilegedAction.run():java.lang.Object
                return lambda$static$0();
            }
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            java.lang.String r0 = (java.lang.String) r0
            r5 = r0
            java.lang.Class<com.github.caciocavallosilano.cacio.peer.managed.FocusManager> r0 = com.github.caciocavallosilano.cacio.peer.managed.FocusManager.class
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L23
            r0 = r5
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L26
            r6 = r0
        L23:
            goto L33
        L26:
            r7 = move-exception
            java.util.logging.Logger r0 = com.github.caciocavallosilano.cacio.peer.managed.FocusManager.logger
            java.util.logging.Level r1 = java.util.logging.Level.SEVERE
            java.lang.String r2 = "Unable to load FocusManager implementation"
            r3 = r7
            r0.log(r1, r2, r3)
        L33:
            r0 = r6
            com.github.caciocavallosilano.cacio.peer.managed.FocusManager.focusManagerCls = r0
            return
    }
}
