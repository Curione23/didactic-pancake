package ca.dnamobile.javalauncher.renderer;

/* JADX INFO: loaded from: classes.dex */
public final class Driver {
    private final java.lang.String name;
    private final java.io.File nativeLibraryDir;
    private final java.lang.String packageName;
    private final ca.dnamobile.javalauncher.renderer.Driver.Type type;
    private final java.io.File vulkanLibrary;

    public enum Type extends java.lang.Enum<ca.dnamobile.javalauncher.renderer.Driver.Type> {
        private static final /* synthetic */ ca.dnamobile.javalauncher.renderer.Driver.Type[] $VALUES = null;
        public static final ca.dnamobile.javalauncher.renderer.Driver.Type DEFAULT_MESA = null;
        public static final ca.dnamobile.javalauncher.renderer.Driver.Type SYSTEM_VULKAN = null;
        public static final ca.dnamobile.javalauncher.renderer.Driver.Type TURNIP = null;

        private static /* synthetic */ ca.dnamobile.javalauncher.renderer.Driver.Type[] $values() {
                ca.dnamobile.javalauncher.renderer.Driver$Type r0 = ca.dnamobile.javalauncher.renderer.Driver.Type.DEFAULT_MESA
                ca.dnamobile.javalauncher.renderer.Driver$Type r1 = ca.dnamobile.javalauncher.renderer.Driver.Type.SYSTEM_VULKAN
                ca.dnamobile.javalauncher.renderer.Driver$Type r2 = ca.dnamobile.javalauncher.renderer.Driver.Type.TURNIP
                ca.dnamobile.javalauncher.renderer.Driver$Type[] r0 = new ca.dnamobile.javalauncher.renderer.Driver.Type[]{r0, r1, r2}
                return r0
        }

        static {
                ca.dnamobile.javalauncher.renderer.Driver$Type r0 = new ca.dnamobile.javalauncher.renderer.Driver$Type
                java.lang.String r1 = "DEFAULT_MESA"
                r2 = 0
                r0.<init>(r1, r2)
                ca.dnamobile.javalauncher.renderer.Driver.Type.DEFAULT_MESA = r0
                ca.dnamobile.javalauncher.renderer.Driver$Type r0 = new ca.dnamobile.javalauncher.renderer.Driver$Type
                java.lang.String r1 = "SYSTEM_VULKAN"
                r2 = 1
                r0.<init>(r1, r2)
                ca.dnamobile.javalauncher.renderer.Driver.Type.SYSTEM_VULKAN = r0
                ca.dnamobile.javalauncher.renderer.Driver$Type r0 = new ca.dnamobile.javalauncher.renderer.Driver$Type
                java.lang.String r1 = "TURNIP"
                r2 = 2
                r0.<init>(r1, r2)
                ca.dnamobile.javalauncher.renderer.Driver.Type.TURNIP = r0
                ca.dnamobile.javalauncher.renderer.Driver$Type[] r0 = $values()
                ca.dnamobile.javalauncher.renderer.Driver.Type.$VALUES = r0
                return
        }

        Type(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static ca.dnamobile.javalauncher.renderer.Driver.Type valueOf(java.lang.String r1) {
                java.lang.Class<ca.dnamobile.javalauncher.renderer.Driver$Type> r0 = ca.dnamobile.javalauncher.renderer.Driver.Type.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                ca.dnamobile.javalauncher.renderer.Driver$Type r1 = (ca.dnamobile.javalauncher.renderer.Driver.Type) r1
                return r1
        }

        public static ca.dnamobile.javalauncher.renderer.Driver.Type[] values() {
                ca.dnamobile.javalauncher.renderer.Driver$Type[] r0 = ca.dnamobile.javalauncher.renderer.Driver.Type.$VALUES
                java.lang.Object r0 = r0.clone()
                ca.dnamobile.javalauncher.renderer.Driver$Type[] r0 = (ca.dnamobile.javalauncher.renderer.Driver.Type[]) r0
                return r0
        }
    }

    public Driver(java.lang.String r1, ca.dnamobile.javalauncher.renderer.Driver.Type r2, java.lang.String r3, java.io.File r4, java.io.File r5) {
            r0 = this;
            r0.<init>()
            r0.name = r1
            r0.type = r2
            r0.packageName = r3
            r0.nativeLibraryDir = r4
            r0.vulkanLibrary = r5
            return
    }

    public java.lang.String getDescription() {
            r3 = this;
            ca.dnamobile.javalauncher.renderer.Driver$Type r0 = r3.type
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == r1) goto L2a
            r1 = 2
            if (r0 == r1) goto Lf
            java.lang.String r0 = "Uses JavaLauncher's default Mesa/Vulkan setup without forcing a custom Turnip ICD."
            return r0
        Lf:
            java.io.File r0 = r3.vulkanLibrary
            if (r0 == 0) goto L18
            java.lang.String r0 = r0.getAbsolutePath()
            goto L1a
        L18:
            java.lang.String r0 = "not found"
        L1a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Uses a Turnip/Adreno Vulkan driver through VK_ICD_FILENAMES. Driver library: "
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            return r0
        L2a:
            java.lang.String r0 = "Uses Android's system Vulkan driver. Best for Mali/PowerVR/other non-Adreno devices, and for Adreno when Turnip is not desired."
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public java.io.File getNativeLibraryDir() {
            r1 = this;
            java.io.File r0 = r1.nativeLibraryDir
            return r0
    }

    public java.lang.String getPackageName() {
            r1 = this;
            java.lang.String r0 = r1.packageName
            return r0
    }

    public ca.dnamobile.javalauncher.renderer.Driver.Type getType() {
            r1 = this;
            ca.dnamobile.javalauncher.renderer.Driver$Type r0 = r1.type
            return r0
    }

    public java.io.File getVulkanLibrary() {
            r1 = this;
            java.io.File r0 = r1.vulkanLibrary
            return r0
    }

    public boolean hasNativeLibraryDir() {
            r1 = this;
            java.io.File r0 = r1.nativeLibraryDir
            if (r0 == 0) goto Lc
            boolean r0 = r0.isDirectory()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }
}
