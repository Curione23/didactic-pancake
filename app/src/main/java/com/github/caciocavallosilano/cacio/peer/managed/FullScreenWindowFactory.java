package com.github.caciocavallosilano.cacio.peer.managed;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/managed/FullScreenWindowFactory.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/managed/FullScreenWindowFactory.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/managed/FullScreenWindowFactory.class */
public class FullScreenWindowFactory implements com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory {
    private static final java.awt.Dimension screenSize = null;
    private final com.github.caciocavallosilano.cacio.peer.managed.PlatformScreenSelector selector;
    private final java.util.Map<com.github.caciocavallosilano.cacio.peer.managed.PlatformScreen, com.github.caciocavallosilano.cacio.peer.managed.ScreenManagedWindowContainer> screenMap;
    private com.github.caciocavallosilano.cacio.peer.CacioEventSource eventSource;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/managed/FullScreenWindowFactory$1.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/managed/FullScreenWindowFactory$1.class
     */
    /* JADX INFO: renamed from: com.github.caciocavallosilano.cacio.peer.managed.FullScreenWindowFactory$1, reason: invalid class name */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/managed/FullScreenWindowFactory$1.class */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/managed/FullScreenWindowFactory$DefaultScreenSelector.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/managed/FullScreenWindowFactory$DefaultScreenSelector.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/managed/FullScreenWindowFactory$DefaultScreenSelector.class */
    private static final class DefaultScreenSelector implements com.github.caciocavallosilano.cacio.peer.managed.PlatformScreenSelector {
        com.github.caciocavallosilano.cacio.peer.managed.PlatformScreen screen;

        DefaultScreenSelector(com.github.caciocavallosilano.cacio.peer.managed.PlatformScreen r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = 0
                r0.screen = r1
                r0 = r3
                r1 = r4
                r0.screen = r1
                return
        }

        @Override // com.github.caciocavallosilano.cacio.peer.managed.PlatformScreenSelector
        public com.github.caciocavallosilano.cacio.peer.managed.PlatformScreen getPlatformScreen(java.awt.GraphicsConfiguration r3) {
                r2 = this;
                r0 = r2
                com.github.caciocavallosilano.cacio.peer.managed.PlatformScreen r0 = r0.screen
                return r0
        }

        @Override // com.github.caciocavallosilano.cacio.peer.managed.PlatformScreenSelector
        public com.github.caciocavallosilano.cacio.peer.managed.PlatformScreen getPlatformScreen(com.github.caciocavallosilano.cacio.peer.CacioComponent r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                java.awt.Component r1 = r1.getAWTComponent()
                java.awt.GraphicsConfiguration r1 = r1.getGraphicsConfiguration()
                com.github.caciocavallosilano.cacio.peer.managed.PlatformScreen r0 = r0.getPlatformScreen(r1)
                return r0
        }
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/managed/FullScreenWindowFactory$FullScreenEventSource.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/managed/FullScreenWindowFactory$FullScreenEventSource.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/managed/FullScreenWindowFactory$FullScreenEventSource.class */
    private class FullScreenEventSource implements com.github.caciocavallosilano.cacio.peer.CacioEventSource {
        final /* synthetic */ com.github.caciocavallosilano.cacio.peer.managed.FullScreenWindowFactory this$0;

        private FullScreenEventSource(com.github.caciocavallosilano.cacio.peer.managed.FullScreenWindowFactory r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.this$0 = r1
                r0 = r3
                r0.<init>()
                return
        }

        @Override // com.github.caciocavallosilano.cacio.peer.CacioEventSource
        public com.github.caciocavallosilano.cacio.peer.managed.EventData getNextEvent() throws java.lang.InterruptedException {
                r4 = this;
                r0 = r4
                com.github.caciocavallosilano.cacio.peer.managed.FullScreenWindowFactory r0 = r0.this$0
                com.github.caciocavallosilano.cacio.peer.CacioEventSource r0 = com.github.caciocavallosilano.cacio.peer.managed.FullScreenWindowFactory.access$000(r0)
                com.github.caciocavallosilano.cacio.peer.managed.EventData r0 = r0.getNextEvent()
                r5 = r0
                r0 = r5
                java.lang.Object r0 = r0.getSource()
                com.github.caciocavallosilano.cacio.peer.managed.PlatformScreen r0 = (com.github.caciocavallosilano.cacio.peer.managed.PlatformScreen) r0
                r6 = r0
                r0 = r5
                r1 = r4
                com.github.caciocavallosilano.cacio.peer.managed.FullScreenWindowFactory r1 = r1.this$0
                java.util.Map r1 = com.github.caciocavallosilano.cacio.peer.managed.FullScreenWindowFactory.access$100(r1)
                r2 = r6
                java.lang.Object r1 = r1.get(r2)
                r0.setSource(r1)
                r0 = r5
                return r0
        }

        /* synthetic */ FullScreenEventSource(com.github.caciocavallosilano.cacio.peer.managed.FullScreenWindowFactory r4, com.github.caciocavallosilano.cacio.peer.managed.FullScreenWindowFactory.AnonymousClass1 r5) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
                return
        }
    }

    public FullScreenWindowFactory(com.github.caciocavallosilano.cacio.peer.managed.PlatformScreen r6, com.github.caciocavallosilano.cacio.peer.CacioEventSource r7) {
            r5 = this;
            r0 = r5
            com.github.caciocavallosilano.cacio.peer.managed.FullScreenWindowFactory$DefaultScreenSelector r1 = new com.github.caciocavallosilano.cacio.peer.managed.FullScreenWindowFactory$DefaultScreenSelector
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            r2 = r7
            r0.<init>(r1, r2)
            return
    }

    public FullScreenWindowFactory(com.github.caciocavallosilano.cacio.peer.managed.PlatformScreenSelector r5, com.github.caciocavallosilano.cacio.peer.CacioEventSource r6) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = r5
            r0.selector = r1
            r0 = r4
            r1 = r6
            r0.eventSource = r1
            r0 = r4
            java.util.HashMap r1 = new java.util.HashMap
            r2 = r1
            r2.<init>()
            java.util.Map r1 = java.util.Collections.synchronizedMap(r1)
            r0.screenMap = r1
            return
    }

    @Override // com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory
    public final com.github.caciocavallosilano.cacio.peer.PlatformWindow createPlatformWindow(com.github.caciocavallosilano.cacio.peer.CacioComponent r6, com.github.caciocavallosilano.cacio.peer.PlatformWindow r7) {
            r5 = this;
            r0 = r7
            if (r0 != 0) goto Le
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "parent cannot be null"
            r1.<init>(r2)
            throw r0
        Le:
            r0 = r7
            com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow r0 = (com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow) r0
            r8 = r0
            com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow r0 = new com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow
            r1 = r0
            r2 = r8
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    @Override // com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory
    public final com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow createPlatformToplevelWindow(com.github.caciocavallosilano.cacio.peer.CacioComponent r6) {
            r5 = this;
            r0 = r5
            com.github.caciocavallosilano.cacio.peer.managed.PlatformScreenSelector r0 = r0.selector
            r1 = r6
            com.github.caciocavallosilano.cacio.peer.managed.PlatformScreen r0 = r0.getPlatformScreen(r1)
            r7 = r0
            r0 = r5
            java.util.Map<com.github.caciocavallosilano.cacio.peer.managed.PlatformScreen, com.github.caciocavallosilano.cacio.peer.managed.ScreenManagedWindowContainer> r0 = r0.screenMap
            r1 = r7
            java.lang.Object r0 = r0.get(r1)
            com.github.caciocavallosilano.cacio.peer.managed.ScreenManagedWindowContainer r0 = (com.github.caciocavallosilano.cacio.peer.managed.ScreenManagedWindowContainer) r0
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L32
            com.github.caciocavallosilano.cacio.peer.managed.ScreenManagedWindowContainer r0 = new com.github.caciocavallosilano.cacio.peer.managed.ScreenManagedWindowContainer
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            r8 = r0
            r0 = r5
            java.util.Map<com.github.caciocavallosilano.cacio.peer.managed.PlatformScreen, com.github.caciocavallosilano.cacio.peer.managed.ScreenManagedWindowContainer> r0 = r0.screenMap
            r1 = r7
            r2 = r8
            java.lang.Object r0 = r0.put(r1, r2)
        L32:
            com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow r0 = new com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow
            r1 = r0
            r2 = r8
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    @Override // com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory
    public com.github.caciocavallosilano.cacio.peer.PlatformWindow createPlatformToplevelWindow(com.github.caciocavallosilano.cacio.peer.CacioComponent r4, com.github.caciocavallosilano.cacio.peer.PlatformWindow r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow r0 = r0.createPlatformToplevelWindow(r1)
            return r0
    }

    @Override // com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory
    public com.github.caciocavallosilano.cacio.peer.CacioEventPump<?> createEventPump() {
            r5 = this;
            com.github.caciocavallosilano.cacio.peer.managed.FullScreenWindowFactory$FullScreenEventSource r0 = new com.github.caciocavallosilano.cacio.peer.managed.FullScreenWindowFactory$FullScreenEventSource
            r1 = r0
            r2 = r5
            r3 = 0
            r1.<init>(r2, r3)
            r6 = r0
            com.github.caciocavallosilano.cacio.peer.managed.FullScreenEventPump r0 = new com.github.caciocavallosilano.cacio.peer.managed.FullScreenEventPump
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            return r0
    }

    public static java.awt.Dimension getScreenDimension() {
            java.awt.Dimension r0 = com.github.caciocavallosilano.cacio.peer.managed.FullScreenWindowFactory.screenSize
            return r0
    }

    public com.github.caciocavallosilano.cacio.peer.managed.ScreenManagedWindowContainer getScreenManagedWindowContainer(com.github.caciocavallosilano.cacio.peer.managed.PlatformScreen r4) {
            r3 = this;
            r0 = r3
            java.util.Map<com.github.caciocavallosilano.cacio.peer.managed.PlatformScreen, com.github.caciocavallosilano.cacio.peer.managed.ScreenManagedWindowContainer> r0 = r0.screenMap
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            com.github.caciocavallosilano.cacio.peer.managed.ScreenManagedWindowContainer r0 = (com.github.caciocavallosilano.cacio.peer.managed.ScreenManagedWindowContainer) r0
            return r0
    }

    private static /* synthetic */ java.lang.String lambda$static$0() {
            java.lang.String r0 = "cacio.managed.screensize"
            java.lang.String r1 = "1714x864"
            java.lang.String r0 = java.lang.System.getProperty(r0, r1)
            return r0
    }

    static /* synthetic */ com.github.caciocavallosilano.cacio.peer.CacioEventSource access$000(com.github.caciocavallosilano.cacio.peer.managed.FullScreenWindowFactory r2) {
            r0 = r2
            com.github.caciocavallosilano.cacio.peer.CacioEventSource r0 = r0.eventSource
            return r0
    }

    static /* synthetic */ java.util.Map access$100(com.github.caciocavallosilano.cacio.peer.managed.FullScreenWindowFactory r2) {
            r0 = r2
            java.util.Map<com.github.caciocavallosilano.cacio.peer.managed.PlatformScreen, com.github.caciocavallosilano.cacio.peer.managed.ScreenManagedWindowContainer> r0 = r0.screenMap
            return r0
    }

    static {
            void r0 = () -> { // java.security.PrivilegedAction.run():java.lang.Object
                return lambda$static$0();
            }
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            java.lang.String r0 = (java.lang.String) r0
            r5 = r0
            r0 = r5
            r1 = 120(0x78, float:1.68E-43)
            int r0 = r0.indexOf(r1)
            r6 = r0
            r0 = r5
            r1 = 0
            r2 = r6
            java.lang.String r0 = r0.substring(r1, r2)
            int r0 = java.lang.Integer.parseInt(r0)
            r7 = r0
            r0 = r5
            r1 = r6
            r2 = 1
            int r1 = r1 + r2
            java.lang.String r0 = r0.substring(r1)
            int r0 = java.lang.Integer.parseInt(r0)
            r8 = r0
            java.awt.Dimension r0 = new java.awt.Dimension
            r1 = r0
            r2 = r7
            r3 = r8
            r1.<init>(r2, r3)
            com.github.caciocavallosilano.cacio.peer.managed.FullScreenWindowFactory.screenSize = r0
            return
    }
}
