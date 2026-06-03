package com.mio.libpatcher.transformer;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:com/mio/libpatcher/transformer/SystemInfoTransformer.class */
public class SystemInfoTransformer implements com.mio.libpatcher.transformer.BaseTransformer {
    public SystemInfoTransformer() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public java.lang.String getTargetClassName() {
            r2 = this;
            java.lang.String r0 = "net.vulkanmod.vulkan.SystemInfo"
            return r0
    }

    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public void transform(javassist.CtClass r4) throws java.lang.Throwable {
            r3 = this;
            r0 = r4
            javassist.CtConstructor r0 = r0.getClassInitializer()
            r5 = r0
            r0 = r5
            java.lang.String r1 = "{cpuInfo = System.getProperty(\"cpu.name\",\"\");}"
            r0.setBody(r1)
            return
    }
}
