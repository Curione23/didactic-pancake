package sun.awt.peer.cacio.managed;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/managed/FullScreenWindowFactory.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/managed/FullScreenWindowFactory.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/managed/FullScreenWindowFactory.class */
public class FullScreenWindowFactory implements sun.awt.peer.cacio.PlatformWindowFactory {
    private static final java.awt.Dimension screenSize = null;
    private final sun.awt.peer.cacio.managed.PlatformScreenSelector selector;
    private final java.util.Map<sun.awt.peer.cacio.managed.PlatformScreen, sun.awt.peer.cacio.managed.ScreenManagedWindowContainer> screenMap;
    private sun.awt.peer.cacio.CacioEventSource eventSource;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/managed/FullScreenWindowFactory$1.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/managed/FullScreenWindowFactory$1.class
     */
    /* JADX INFO: renamed from: sun.awt.peer.cacio.managed.FullScreenWindowFactory$1, reason: invalid class name */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/managed/FullScreenWindowFactory$1.class */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/managed/FullScreenWindowFactory$DefaultScreenSelector.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/managed/FullScreenWindowFactory$DefaultScreenSelector.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/managed/FullScreenWindowFactory$DefaultScreenSelector.class */
    private static final class DefaultScreenSelector implements sun.awt.peer.cacio.managed.PlatformScreenSelector {
        sun.awt.peer.cacio.managed.PlatformScreen screen;

        DefaultScreenSelector(sun.awt.peer.cacio.managed.PlatformScreen r4) {
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

        @Override // sun.awt.peer.cacio.managed.PlatformScreenSelector
        public sun.awt.peer.cacio.managed.PlatformScreen getPlatformScreen(java.awt.GraphicsConfiguration r3) {
                r2 = this;
                r0 = r2
                sun.awt.peer.cacio.managed.PlatformScreen r0 = r0.screen
                return r0
        }

        @Override // sun.awt.peer.cacio.managed.PlatformScreenSelector
        public sun.awt.peer.cacio.managed.PlatformScreen getPlatformScreen(sun.awt.peer.cacio.CacioComponent r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                java.awt.Component r1 = r1.getAWTComponent()
                java.awt.GraphicsConfiguration r1 = r1.getGraphicsConfiguration()
                sun.awt.peer.cacio.managed.PlatformScreen r0 = r0.getPlatformScreen(r1)
                return r0
        }
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/managed/FullScreenWindowFactory$FullScreenEventSource.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/managed/FullScreenWindowFactory$FullScreenEventSource.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/managed/FullScreenWindowFactory$FullScreenEventSource.class */
    private class FullScreenEventSource implements sun.awt.peer.cacio.CacioEventSource {
        final /* synthetic */ sun.awt.peer.cacio.managed.FullScreenWindowFactory this$0;

        private FullScreenEventSource(sun.awt.peer.cacio.managed.FullScreenWindowFactory r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.this$0 = r1
                r0 = r3
                r0.<init>()
                return
        }

        @Override // sun.awt.peer.cacio.CacioEventSource
        public sun.awt.peer.cacio.managed.EventData getNextEvent() throws java.lang.InterruptedException {
                r4 = this;
                r0 = r4
                sun.awt.peer.cacio.managed.FullScreenWindowFactory r0 = r0.this$0
                sun.awt.peer.cacio.CacioEventSource r0 = sun.awt.peer.cacio.managed.FullScreenWindowFactory.access$000(r0)
                sun.awt.peer.cacio.managed.EventData r0 = r0.getNextEvent()
                r5 = r0
                r0 = r5
                java.lang.Object r0 = r0.getSource()
                sun.awt.peer.cacio.managed.PlatformScreen r0 = (sun.awt.peer.cacio.managed.PlatformScreen) r0
                r6 = r0
                r0 = r5
                r1 = r4
                sun.awt.peer.cacio.managed.FullScreenWindowFactory r1 = r1.this$0
                java.util.Map r1 = sun.awt.peer.cacio.managed.FullScreenWindowFactory.access$100(r1)
                r2 = r6
                java.lang.Object r1 = r1.get(r2)
                r0.setSource(r1)
                r0 = r5
                return r0
        }

        /* synthetic */ FullScreenEventSource(sun.awt.peer.cacio.managed.FullScreenWindowFactory r4, sun.awt.peer.cacio.managed.FullScreenWindowFactory.AnonymousClass1 r5) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
                return
        }
    }

    public FullScreenWindowFactory(sun.awt.peer.cacio.managed.PlatformScreen r6, sun.awt.peer.cacio.CacioEventSource r7) {
            r5 = this;
            r0 = r5
            sun.awt.peer.cacio.managed.FullScreenWindowFactory$DefaultScreenSelector r1 = new sun.awt.peer.cacio.managed.FullScreenWindowFactory$DefaultScreenSelector
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            r2 = r7
            r0.<init>(r1, r2)
            return
    }

    public FullScreenWindowFactory(sun.awt.peer.cacio.managed.PlatformScreenSelector r5, sun.awt.peer.cacio.CacioEventSource r6) {
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

    @Override // sun.awt.peer.cacio.PlatformWindowFactory
    public final sun.awt.peer.cacio.PlatformWindow createPlatformWindow(sun.awt.peer.cacio.CacioComponent r6, sun.awt.peer.cacio.PlatformWindow r7) {
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
            sun.awt.peer.cacio.managed.ManagedWindow r0 = (sun.awt.peer.cacio.managed.ManagedWindow) r0
            r8 = r0
            sun.awt.peer.cacio.managed.ManagedWindow r0 = new sun.awt.peer.cacio.managed.ManagedWindow
            r1 = r0
            r2 = r8
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    @Override // sun.awt.peer.cacio.PlatformWindowFactory
    public final sun.awt.peer.cacio.PlatformToplevelWindow createPlatformToplevelWindow(sun.awt.peer.cacio.CacioComponent r6) {
            r5 = this;
            r0 = r5
            sun.awt.peer.cacio.managed.PlatformScreenSelector r0 = r0.selector
            r1 = r6
            sun.awt.peer.cacio.managed.PlatformScreen r0 = r0.getPlatformScreen(r1)
            r7 = r0
            r0 = r5
            java.util.Map<sun.awt.peer.cacio.managed.PlatformScreen, sun.awt.peer.cacio.managed.ScreenManagedWindowContainer> r0 = r0.screenMap
            r1 = r7
            java.lang.Object r0 = r0.get(r1)
            sun.awt.peer.cacio.managed.ScreenManagedWindowContainer r0 = (sun.awt.peer.cacio.managed.ScreenManagedWindowContainer) r0
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L32
            sun.awt.peer.cacio.managed.ScreenManagedWindowContainer r0 = new sun.awt.peer.cacio.managed.ScreenManagedWindowContainer
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            r8 = r0
            r0 = r5
            java.util.Map<sun.awt.peer.cacio.managed.PlatformScreen, sun.awt.peer.cacio.managed.ScreenManagedWindowContainer> r0 = r0.screenMap
            r1 = r7
            r2 = r8
            java.lang.Object r0 = r0.put(r1, r2)
        L32:
            sun.awt.peer.cacio.managed.ManagedWindow r0 = new sun.awt.peer.cacio.managed.ManagedWindow
            r1 = r0
            r2 = r8
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    @Override // sun.awt.peer.cacio.PlatformWindowFactory
    public sun.awt.peer.cacio.PlatformWindow createPlatformToplevelWindow(sun.awt.peer.cacio.CacioComponent r4, sun.awt.peer.cacio.PlatformWindow r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            sun.awt.peer.cacio.PlatformToplevelWindow r0 = r0.createPlatformToplevelWindow(r1)
            return r0
    }

    @Override // sun.awt.peer.cacio.PlatformWindowFactory
    public sun.awt.peer.cacio.CacioEventPump<?> createEventPump() {
            r5 = this;
            sun.awt.peer.cacio.managed.FullScreenWindowFactory$FullScreenEventSource r0 = new sun.awt.peer.cacio.managed.FullScreenWindowFactory$FullScreenEventSource
            r1 = r0
            r2 = r5
            r3 = 0
            r1.<init>(r2, r3)
            r6 = r0
            sun.awt.peer.cacio.managed.FullScreenEventPump r0 = new sun.awt.peer.cacio.managed.FullScreenEventPump
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            return r0
    }

    public static java.awt.Dimension getScreenDimension() {
            java.awt.Dimension r0 = sun.awt.peer.cacio.managed.FullScreenWindowFactory.screenSize
            return r0
    }

    public sun.awt.peer.cacio.managed.ScreenManagedWindowContainer getScreenManagedWindowContainer(sun.awt.peer.cacio.managed.PlatformScreen r4) {
            r3 = this;
            r0 = r3
            java.util.Map<sun.awt.peer.cacio.managed.PlatformScreen, sun.awt.peer.cacio.managed.ScreenManagedWindowContainer> r0 = r0.screenMap
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            sun.awt.peer.cacio.managed.ScreenManagedWindowContainer r0 = (sun.awt.peer.cacio.managed.ScreenManagedWindowContainer) r0
            return r0
    }

    static /* synthetic */ sun.awt.peer.cacio.CacioEventSource access$000(sun.awt.peer.cacio.managed.FullScreenWindowFactory r2) {
            r0 = r2
            sun.awt.peer.cacio.CacioEventSource r0 = r0.eventSource
            return r0
    }

    static /* synthetic */ java.util.Map access$100(sun.awt.peer.cacio.managed.FullScreenWindowFactory r2) {
            r0 = r2
            java.util.Map<sun.awt.peer.cacio.managed.PlatformScreen, sun.awt.peer.cacio.managed.ScreenManagedWindowContainer> r0 = r0.screenMap
            return r0
    }

    static {
            sun.security.action.GetPropertyAction r0 = new sun.security.action.GetPropertyAction
            r1 = r0
            java.lang.String r2 = "cacio.managed.screensize"
            java.lang.String r3 = "1024x768"
            r1.<init>(r2, r3)
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
            sun.awt.peer.cacio.managed.FullScreenWindowFactory.screenSize = r0
            return
    }
}
