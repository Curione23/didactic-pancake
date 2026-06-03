package com.mio.libpatcher.transformer;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:com/mio/libpatcher/transformer/RandomPatchesTransformer.class */
public class RandomPatchesTransformer implements com.mio.libpatcher.transformer.BaseTransformer {
    public RandomPatchesTransformer() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public java.lang.String getTargetClassName() {
            r2 = this;
            java.lang.String r0 = "com.therandomlabs.randompatches.client.WindowIconHandler"
            return r0
    }

    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public void transform(javassist.CtClass r5) throws java.lang.Throwable {
            r4 = this;
            r0 = r5
            java.lang.String r1 = "setWindowIcon"
            r2 = 0
            javassist.CtClass[] r2 = new javassist.CtClass[r2]
            javassist.CtMethod r0 = r0.getDeclaredMethod(r1, r2)
            r6 = r0
            r0 = r6
            java.lang.String r1 = "{}"
            r0.setBody(r1)
            return
    }
}
