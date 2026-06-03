package com.mio.libpatcher.transformer;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:com/mio/libpatcher/transformer/FabricLoaderTransformer.class */
public class FabricLoaderTransformer implements com.mio.libpatcher.transformer.BaseTransformer {
    public FabricLoaderTransformer() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public java.lang.String getTargetClassName() {
            r2 = this;
            java.lang.String r0 = "net.fabricmc.loader.impl.gui.FabricGuiEntry"
            return r0
    }

    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public void transform(javassist.CtClass r4) throws java.lang.Throwable {
            r3 = this;
            r0 = r4
            java.lang.String r1 = "displayError"
            javassist.CtMethod[] r0 = r0.getDeclaredMethods(r1)
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L2e
            r0 = r5
            r6 = r0
            r0 = r6
            int r0 = r0.length
            r7 = r0
            r0 = 0
            r8 = r0
        L14:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L2e
            r0 = r6
            r1 = r8
            r0 = r0[r1]
            r9 = r0
            r0 = r9
            java.lang.String r1 = "{System.exit(1);}"
            r0.setBody(r1)
            int r8 = r8 + 1
            goto L14
        L2e:
            return
    }
}
