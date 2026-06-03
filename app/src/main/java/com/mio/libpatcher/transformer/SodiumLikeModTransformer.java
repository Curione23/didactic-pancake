package com.mio.libpatcher.transformer;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:com/mio/libpatcher/transformer/SodiumLikeModTransformer.class */
public class SodiumLikeModTransformer implements com.mio.libpatcher.transformer.BaseTransformer {
    public SodiumLikeModTransformer() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public java.lang.String getTargetClassName() {
            r2 = this;
            java.lang.String r0 = ""
            return r0
    }

    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public java.util.List<java.lang.String> getTargetClassNames() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r4
            java.lang.String r1 = "net.caffeinemc.mods.sodium.client.compatibility.checks.PostLaunchChecks"
            boolean r0 = r0.add(r1)
            r0 = r4
            java.lang.String r1 = "me.jellysquid.mods.sodium.client.compatibility.checks.PostLaunchChecks"
            boolean r0 = r0.add(r1)
            r0 = r4
            java.lang.String r1 = "org.embeddedt.embeddium.impl.compatibility.checks.LateDriverScanner"
            boolean r0 = r0.add(r1)
            r0 = r4
            java.lang.String r1 = "me.jellysquid.mods.sodium.client.compatibility.checks.LateDriverScanner"
            boolean r0 = r0.add(r1)
            r0 = r4
            return r0
    }

    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public void transform(javassist.CtClass r4) throws java.lang.Throwable {
            r3 = this;
            r0 = r4
            java.lang.String r1 = "isUsingPojavLauncher"
            javassist.CtMethod r0 = r0.getDeclaredMethod(r1)
            r5 = r0
            r0 = r5
            java.lang.String r1 = "{return false;}"
            r0.setBody(r1)
            return
    }
}
