package ca.dnamobile.javalauncher.renderer;

/* JADX INFO: loaded from: classes.dex */
public final class Renderers {
    public static final java.lang.String DEFAULT_RENDERER_ID = "e7b90ed6-e518-4d4e-93dc-5c7133cd5b31";
    private static final java.util.LinkedHashMap<java.lang.String, ca.dnamobile.javalauncher.renderer.RendererInterface> RENDERERS = null;
    private static final java.lang.String TAG = "Renderers";
    private static ca.dnamobile.javalauncher.renderer.RendererInterface currentRenderer;
    private static boolean initialized;

    static {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            ca.dnamobile.javalauncher.renderer.Renderers.RENDERERS = r0
            return
    }

    private Renderers() {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized boolean addRenderer(ca.dnamobile.javalauncher.renderer.RendererInterface r6) {
            java.lang.String r0 = "Renderer loaded: "
            java.lang.String r1 = "Skipping duplicate renderer: "
            java.lang.Class<ca.dnamobile.javalauncher.renderer.Renderers> r2 = ca.dnamobile.javalauncher.renderer.Renderers.class
            monitor-enter(r2)
            java.lang.String r3 = r6.getUniqueIdentifier()     // Catch: java.lang.Throwable -> L7a
            java.util.LinkedHashMap<java.lang.String, ca.dnamobile.javalauncher.renderer.RendererInterface> r4 = ca.dnamobile.javalauncher.renderer.Renderers.RENDERERS     // Catch: java.lang.Throwable -> L7a
            boolean r5 = r4.containsKey(r3)     // Catch: java.lang.Throwable -> L7a
            if (r5 == 0) goto L3c
            java.lang.String r0 = "Renderers"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r6 = r6.getRendererName()     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r6 = r4.append(r6)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = " ("
            java.lang.StringBuilder r6 = r6.append(r1)     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r6 = r6.append(r3)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = ")"
            java.lang.StringBuilder r6 = r6.append(r1)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L7a
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r6)     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r2)
            r6 = 0
            return r6
        L3c:
            r4.put(r3, r6)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = "Renderers"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = r6.getRendererName()     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r0 = r3.append(r0)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = " ("
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = r6.getRendererId()     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = " - "
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r6 = r6.getUniqueIdentifier()     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r6 = r0.append(r6)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = ")"
            java.lang.StringBuilder r6 = r6.append(r0)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L7a
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r6)     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r2)
            r6 = 1
            return r6
        L7a:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7a
            throw r6
    }

    public static synchronized void addRenderers(ca.dnamobile.javalauncher.renderer.RendererInterface... r4) {
            java.lang.Class<ca.dnamobile.javalauncher.renderer.Renderers> r0 = ca.dnamobile.javalauncher.renderer.Renderers.class
            monitor-enter(r0)
            int r1 = r4.length     // Catch: java.lang.Throwable -> L11
            r2 = 0
        L5:
            if (r2 >= r1) goto Lf
            r3 = r4[r2]     // Catch: java.lang.Throwable -> L11
            addRenderer(r3)     // Catch: java.lang.Throwable -> L11
            int r2 = r2 + 1
            goto L5
        Lf:
            monitor-exit(r0)
            return
        L11:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r4
    }

    public static synchronized void clearPluginCache(android.content.Context r3) {
            java.lang.Class<ca.dnamobile.javalauncher.renderer.Renderers> r0 = ca.dnamobile.javalauncher.renderer.Renderers.class
            monitor-enter(r0)
            ca.dnamobile.javalauncher.renderer.RendererPluginManager.clearImportedAndCachedRendererPlugins(r3)     // Catch: java.lang.Throwable -> L13
            reload(r3)     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = ca.dnamobile.javalauncher.settings.LauncherPreferences.getSelectedRendererIdentifier(r3)     // Catch: java.lang.Throwable -> L13
            r2 = 1
            setCurrentRenderer(r3, r1, r2)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)
            return
        L13:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r3
    }

    public static synchronized ca.dnamobile.javalauncher.renderer.RendererInterface findRenderer(android.content.Context r2, java.lang.String r3) {
            java.lang.Class<ca.dnamobile.javalauncher.renderer.Renderers> r0 = ca.dnamobile.javalauncher.renderer.Renderers.class
            monitor-enter(r0)
            if (r3 != 0) goto L8
            monitor-exit(r0)
            r2 = 0
            return r2
        L8:
            r1 = 0
            init(r2, r1)     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap<java.lang.String, ca.dnamobile.javalauncher.renderer.RendererInterface> r2 = ca.dnamobile.javalauncher.renderer.Renderers.RENDERERS     // Catch: java.lang.Throwable -> L16
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L16
            ca.dnamobile.javalauncher.renderer.RendererInterface r2 = (ca.dnamobile.javalauncher.renderer.RendererInterface) r2     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            return r2
        L16:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r2
    }

    public static synchronized java.util.List<ca.dnamobile.javalauncher.renderer.RendererInterface> getAllRenderers(android.content.Context r2) {
            java.lang.Class<ca.dnamobile.javalauncher.renderer.Renderers> r0 = ca.dnamobile.javalauncher.renderer.Renderers.class
            monitor-enter(r0)
            r1 = 0
            init(r2, r1)     // Catch: java.lang.Throwable -> L14
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L14
            java.util.LinkedHashMap<java.lang.String, ca.dnamobile.javalauncher.renderer.RendererInterface> r1 = ca.dnamobile.javalauncher.renderer.Renderers.RENDERERS     // Catch: java.lang.Throwable -> L14
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L14
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)
            return r2
        L14:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r2
    }

    public static synchronized java.util.List<ca.dnamobile.javalauncher.renderer.RendererInterface> getCompatibleRenderers(android.content.Context r8) {
            java.lang.Class<ca.dnamobile.javalauncher.renderer.Renderers> r0 = ca.dnamobile.javalauncher.renderer.Renderers.class
            monitor-enter(r0)
            r1 = 0
            init(r8, r1)     // Catch: java.lang.Throwable -> L6e
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L6e
            r2.<init>()     // Catch: java.lang.Throwable -> L6e
            boolean r8 = hasVulkan(r8)     // Catch: java.lang.Throwable -> L6e
            int r3 = net.kdt.pojavlaunch.Architecture.getDeviceArchitecture()     // Catch: java.lang.Throwable -> L6e
            r4 = 2
            if (r3 == r4) goto L18
            r1 = 1
        L18:
            java.util.LinkedHashMap<java.lang.String, ca.dnamobile.javalauncher.renderer.RendererInterface> r3 = ca.dnamobile.javalauncher.renderer.Renderers.RENDERERS     // Catch: java.lang.Throwable -> L6e
            java.util.Collection r3 = r3.values()     // Catch: java.lang.Throwable -> L6e
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L6e
        L22:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L6e
            if (r4 == 0) goto L6c
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L6e
            ca.dnamobile.javalauncher.renderer.RendererInterface r4 = (ca.dnamobile.javalauncher.renderer.RendererInterface) r4     // Catch: java.lang.Throwable -> L6e
            java.lang.String r5 = r4.getRendererId()     // Catch: java.lang.Throwable -> L6e
            java.util.Locale r6 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L6e
            java.lang.String r5 = r5.toLowerCase(r6)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r6 = r4.getUniqueIdentifier()     // Catch: java.lang.Throwable -> L6e
            java.util.Locale r7 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L6e
            java.lang.String r6 = r6.toLowerCase(r7)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r7 = "vulkan"
            boolean r7 = r5.contains(r7)     // Catch: java.lang.Throwable -> L6e
            if (r7 != 0) goto L5a
            java.lang.String r7 = "zink"
            boolean r7 = r5.contains(r7)     // Catch: java.lang.Throwable -> L6e
            if (r7 != 0) goto L5a
            java.lang.String r7 = "zink"
            boolean r6 = r6.contains(r7)     // Catch: java.lang.Throwable -> L6e
            if (r6 == 0) goto L5d
        L5a:
            if (r8 != 0) goto L5d
            goto L22
        L5d:
            java.lang.String r6 = "zink"
            boolean r5 = r5.contains(r6)     // Catch: java.lang.Throwable -> L6e
            if (r5 == 0) goto L68
            if (r1 != 0) goto L68
            goto L22
        L68:
            r2.add(r4)     // Catch: java.lang.Throwable -> L6e
            goto L22
        L6c:
            monitor-exit(r0)
            return r2
        L6e:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            throw r8
    }

    public static synchronized ca.dnamobile.javalauncher.renderer.RendererInterface getCurrentRenderer(android.content.Context r3) {
            java.lang.Class<ca.dnamobile.javalauncher.renderer.Renderers> r0 = ca.dnamobile.javalauncher.renderer.Renderers.class
            monitor-enter(r0)
            ca.dnamobile.javalauncher.renderer.RendererInterface r1 = ca.dnamobile.javalauncher.renderer.Renderers.currentRenderer     // Catch: java.lang.Throwable -> L1e
            if (r1 != 0) goto Lf
            java.lang.String r1 = ca.dnamobile.javalauncher.settings.LauncherPreferences.getSelectedRendererIdentifier(r3)     // Catch: java.lang.Throwable -> L1e
            r2 = 1
            setCurrentRenderer(r3, r1, r2)     // Catch: java.lang.Throwable -> L1e
        Lf:
            ca.dnamobile.javalauncher.renderer.RendererInterface r3 = ca.dnamobile.javalauncher.renderer.Renderers.currentRenderer     // Catch: java.lang.Throwable -> L1e
            if (r3 != 0) goto L1a
            ca.dnamobile.javalauncher.renderer.KryptonRenderer r3 = new ca.dnamobile.javalauncher.renderer.KryptonRenderer     // Catch: java.lang.Throwable -> L1e
            r3.<init>()     // Catch: java.lang.Throwable -> L1e
            ca.dnamobile.javalauncher.renderer.Renderers.currentRenderer = r3     // Catch: java.lang.Throwable -> L1e
        L1a:
            ca.dnamobile.javalauncher.renderer.RendererInterface r3 = ca.dnamobile.javalauncher.renderer.Renderers.currentRenderer     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)
            return r3
        L1e:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r3
    }

    public static synchronized ca.dnamobile.javalauncher.renderer.RenderersList getRenderersList(android.content.Context r5) {
            java.lang.Class<ca.dnamobile.javalauncher.renderer.Renderers> r0 = ca.dnamobile.javalauncher.renderer.Renderers.class
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L37
            r1.<init>()     // Catch: java.lang.Throwable -> L37
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L37
            r2.<init>()     // Catch: java.lang.Throwable -> L37
            java.util.List r5 = getCompatibleRenderers(r5)     // Catch: java.lang.Throwable -> L37
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L37
        L15:
            boolean r3 = r5.hasNext()     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L30
            java.lang.Object r3 = r5.next()     // Catch: java.lang.Throwable -> L37
            ca.dnamobile.javalauncher.renderer.RendererInterface r3 = (ca.dnamobile.javalauncher.renderer.RendererInterface) r3     // Catch: java.lang.Throwable -> L37
            java.lang.String r4 = r3.getUniqueIdentifier()     // Catch: java.lang.Throwable -> L37
            r1.add(r4)     // Catch: java.lang.Throwable -> L37
            java.lang.String r3 = r3.getRendererName()     // Catch: java.lang.Throwable -> L37
            r2.add(r3)     // Catch: java.lang.Throwable -> L37
            goto L15
        L30:
            ca.dnamobile.javalauncher.renderer.RenderersList r5 = new ca.dnamobile.javalauncher.renderer.RenderersList     // Catch: java.lang.Throwable -> L37
            r5.<init>(r1, r2)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r0)
            return r5
        L37:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r5
    }

    public static synchronized ca.dnamobile.javalauncher.renderer.RendererInterface getSelectedRenderer(android.content.Context r3) {
            java.lang.Class<ca.dnamobile.javalauncher.renderer.Renderers> r0 = ca.dnamobile.javalauncher.renderer.Renderers.class
            monitor-enter(r0)
            r1 = 0
            init(r3, r1)     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = ca.dnamobile.javalauncher.settings.LauncherPreferences.getSelectedRendererIdentifier(r3)     // Catch: java.lang.Throwable -> L15
            r2 = 1
            setCurrentRenderer(r3, r1, r2)     // Catch: java.lang.Throwable -> L15
            ca.dnamobile.javalauncher.renderer.RendererInterface r3 = getCurrentRenderer(r3)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)
            return r3
        L15:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r3
    }

    private static boolean hasVulkan(android.content.Context r3) {
            r0 = 1
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = "android.hardware.vulkan.version"
            boolean r1 = r1.hasSystemFeature(r2)     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L1b
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "android.hardware.vulkan.level"
            boolean r3 = r3.hasSystemFeature(r1)     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto L1a
            goto L1b
        L1a:
            r0 = 0
        L1b:
            return r0
    }

    @java.lang.Deprecated
    public static synchronized void importRendererApk(android.content.Context r2, android.net.Uri r3) throws java.lang.Exception {
            java.lang.Class<ca.dnamobile.javalauncher.renderer.Renderers> r0 = ca.dnamobile.javalauncher.renderer.Renderers.class
            monitor-enter(r0)
            ca.dnamobile.javalauncher.renderer.RendererInterface r3 = ca.dnamobile.javalauncher.renderer.RendererPluginManager.importRendererApk(r2, r3)     // Catch: java.lang.Throwable -> L1b
            reload(r2)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = r3.getUniqueIdentifier()     // Catch: java.lang.Throwable -> L1b
            ca.dnamobile.javalauncher.settings.LauncherPreferences.setSelectedRendererIdentifier(r2, r1)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r3 = r3.getUniqueIdentifier()     // Catch: java.lang.Throwable -> L1b
            r1 = 1
            setCurrentRenderer(r2, r3, r1)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)
            return
        L1b:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r2
    }

    public static synchronized int indexOfRenderer(java.util.List<ca.dnamobile.javalauncher.renderer.RendererInterface> r4, java.lang.String r5) {
            java.lang.Class<ca.dnamobile.javalauncher.renderer.Renderers> r0 = ca.dnamobile.javalauncher.renderer.Renderers.class
            monitor-enter(r0)
            r1 = 0
            if (r5 != 0) goto L8
            monitor-exit(r0)
            return r1
        L8:
            r2 = r1
        L9:
            int r3 = r4.size()     // Catch: java.lang.Throwable -> L26
            if (r2 >= r3) goto L24
            java.lang.Object r3 = r4.get(r2)     // Catch: java.lang.Throwable -> L26
            ca.dnamobile.javalauncher.renderer.RendererInterface r3 = (ca.dnamobile.javalauncher.renderer.RendererInterface) r3     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = r3.getUniqueIdentifier()     // Catch: java.lang.Throwable -> L26
            boolean r3 = r5.equals(r3)     // Catch: java.lang.Throwable -> L26
            if (r3 == 0) goto L21
            monitor-exit(r0)
            return r2
        L21:
            int r2 = r2 + 1
            goto L9
        L24:
            monitor-exit(r0)
            return r1
        L26:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r4
    }

    public static synchronized void init(android.content.Context r4, boolean r5) {
            java.lang.Class<ca.dnamobile.javalauncher.renderer.Renderers> r0 = ca.dnamobile.javalauncher.renderer.Renderers.class
            monitor-enter(r0)
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r4)     // Catch: java.lang.Throwable -> L68
            boolean r1 = ca.dnamobile.javalauncher.renderer.Renderers.initialized     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto Le
            if (r5 != 0) goto Le
            monitor-exit(r0)
            return
        Le:
            r5 = 1
            ca.dnamobile.javalauncher.renderer.Renderers.initialized = r5     // Catch: java.lang.Throwable -> L68
            java.util.LinkedHashMap<java.lang.String, ca.dnamobile.javalauncher.renderer.RendererInterface> r1 = ca.dnamobile.javalauncher.renderer.Renderers.RENDERERS     // Catch: java.lang.Throwable -> L68
            r1.clear()     // Catch: java.lang.Throwable -> L68
            r1 = 0
            ca.dnamobile.javalauncher.renderer.Renderers.currentRenderer = r1     // Catch: java.lang.Throwable -> L68
            r1 = 6
            ca.dnamobile.javalauncher.renderer.RendererInterface[] r1 = new ca.dnamobile.javalauncher.renderer.RendererInterface[r1]     // Catch: java.lang.Throwable -> L68
            ca.dnamobile.javalauncher.renderer.KryptonRenderer r2 = new ca.dnamobile.javalauncher.renderer.KryptonRenderer     // Catch: java.lang.Throwable -> L68
            r2.<init>()     // Catch: java.lang.Throwable -> L68
            r3 = 0
            r1[r3] = r2     // Catch: java.lang.Throwable -> L68
            ca.dnamobile.javalauncher.renderer.GL4ESRenderer r2 = new ca.dnamobile.javalauncher.renderer.GL4ESRenderer     // Catch: java.lang.Throwable -> L68
            r2.<init>()     // Catch: java.lang.Throwable -> L68
            r1[r5] = r2     // Catch: java.lang.Throwable -> L68
            ca.dnamobile.javalauncher.renderer.VulkanZinkRenderer r5 = new ca.dnamobile.javalauncher.renderer.VulkanZinkRenderer     // Catch: java.lang.Throwable -> L68
            r5.<init>()     // Catch: java.lang.Throwable -> L68
            r2 = 2
            r1[r2] = r5     // Catch: java.lang.Throwable -> L68
            ca.dnamobile.javalauncher.renderer.VirGLRenderer r5 = new ca.dnamobile.javalauncher.renderer.VirGLRenderer     // Catch: java.lang.Throwable -> L68
            r5.<init>()     // Catch: java.lang.Throwable -> L68
            r2 = 3
            r1[r2] = r5     // Catch: java.lang.Throwable -> L68
            ca.dnamobile.javalauncher.renderer.DroidBridgeNativeGlfwKgslRenderer r5 = new ca.dnamobile.javalauncher.renderer.DroidBridgeNativeGlfwKgslRenderer     // Catch: java.lang.Throwable -> L68
            r5.<init>()     // Catch: java.lang.Throwable -> L68
            r2 = 4
            r1[r2] = r5     // Catch: java.lang.Throwable -> L68
            ca.dnamobile.javalauncher.renderer.PanfrostRenderer r5 = new ca.dnamobile.javalauncher.renderer.PanfrostRenderer     // Catch: java.lang.Throwable -> L68
            r5.<init>()     // Catch: java.lang.Throwable -> L68
            r2 = 5
            r1[r2] = r5     // Catch: java.lang.Throwable -> L68
            addRenderers(r1)     // Catch: java.lang.Throwable -> L68
            java.util.List r4 = ca.dnamobile.javalauncher.renderer.RendererPluginManager.discoverPlugins(r4)     // Catch: java.lang.Throwable -> L68
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L68
        L56:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L68
            if (r5 == 0) goto L66
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L68
            ca.dnamobile.javalauncher.renderer.RendererInterface r5 = (ca.dnamobile.javalauncher.renderer.RendererInterface) r5     // Catch: java.lang.Throwable -> L68
            addRenderer(r5)     // Catch: java.lang.Throwable -> L68
            goto L56
        L66:
            monitor-exit(r0)
            return
        L68:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L68
            throw r4
    }

    public static synchronized void reload(android.content.Context r2) {
            java.lang.Class<ca.dnamobile.javalauncher.renderer.Renderers> r0 = ca.dnamobile.javalauncher.renderer.Renderers.class
            monitor-enter(r0)
            r1 = 1
            init(r2, r1)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)
            return
        L9:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    public static synchronized void setCurrentRenderer(android.content.Context r5, java.lang.String r6, boolean r7) {
            java.lang.Class<ca.dnamobile.javalauncher.renderer.Renderers> r0 = ca.dnamobile.javalauncher.renderer.Renderers.class
            monitor-enter(r0)
            java.util.List r1 = getCompatibleRenderers(r5)     // Catch: java.lang.Throwable -> L6c
            r2 = 0
            ca.dnamobile.javalauncher.renderer.Renderers.currentRenderer = r2     // Catch: java.lang.Throwable -> L6c
            if (r6 == 0) goto L34
            java.lang.String r2 = r6.trim()     // Catch: java.lang.Throwable -> L6c
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L6c
            if (r2 != 0) goto L34
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Throwable -> L6c
        L1a:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L6c
            if (r3 == 0) goto L34
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L6c
            ca.dnamobile.javalauncher.renderer.RendererInterface r3 = (ca.dnamobile.javalauncher.renderer.RendererInterface) r3     // Catch: java.lang.Throwable -> L6c
            java.lang.String r4 = r3.getUniqueIdentifier()     // Catch: java.lang.Throwable -> L6c
            boolean r4 = r4.equals(r6)     // Catch: java.lang.Throwable -> L6c
            if (r4 == 0) goto L1a
            ca.dnamobile.javalauncher.renderer.Renderers.currentRenderer = r3     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r0)
            return
        L34:
            if (r7 == 0) goto L6a
            boolean r6 = r1.isEmpty()     // Catch: java.lang.Throwable -> L6c
            if (r6 != 0) goto L6a
            r6 = 0
            java.lang.Object r6 = r1.get(r6)     // Catch: java.lang.Throwable -> L6c
            ca.dnamobile.javalauncher.renderer.RendererInterface r6 = (ca.dnamobile.javalauncher.renderer.RendererInterface) r6     // Catch: java.lang.Throwable -> L6c
            ca.dnamobile.javalauncher.renderer.Renderers.currentRenderer = r6     // Catch: java.lang.Throwable -> L6c
            java.lang.String r6 = r6.getUniqueIdentifier()     // Catch: java.lang.Throwable -> L6c
            ca.dnamobile.javalauncher.settings.LauncherPreferences.setSelectedRendererIdentifier(r5, r6)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r5 = "Renderers"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r6.<init>()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r7 = "Renderer fallback selected: "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> L6c
            ca.dnamobile.javalauncher.renderer.RendererInterface r7 = ca.dnamobile.javalauncher.renderer.Renderers.currentRenderer     // Catch: java.lang.Throwable -> L6c
            java.lang.String r7 = r7.getRendererName()     // Catch: java.lang.Throwable -> L6c
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L6c
            ca.dnamobile.javalauncher.feature.log.Logging.i(r5, r6)     // Catch: java.lang.Throwable -> L6c
        L6a:
            monitor-exit(r0)
            return
        L6c:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6c
            throw r5
    }
}
