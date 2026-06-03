package com.mio.libpatcher.transformer;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:com/mio/libpatcher/transformer/SableRapierLibTransformer.class */
public class SableRapierLibTransformer implements com.mio.libpatcher.transformer.BaseTransformer {


    public SableRapierLibTransformer() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public java.lang.String getTargetClassName() {
            r2 = this;
            java.lang.String r0 = "dev.ryanhcode.sable.physics.impl.rapier.Rapier3D"
            return r0
    }

    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public void transform(javassist.CtClass r6) throws java.lang.Throwable {
            r5 = this;
            r0 = r6
            java.lang.String r1 = "loadLibrary"
            javassist.CtMethod r0 = r0.getDeclaredMethod(r1)
            r7 = r0
            r0 = r7
            com.mio.libpatcher.transformer.SableRapierLibTransformer$1 r1 = new com.mio.libpatcher.transformer.SableRapierLibTransformer$1
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            r0.instrument(r1)
            return
    }
}
