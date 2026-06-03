package com.mio.libpatcher.transformer;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:com/mio/libpatcher/transformer/LibraryTransformer.class */
public class LibraryTransformer implements com.mio.libpatcher.transformer.BaseTransformer {
    public LibraryTransformer() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public java.lang.String getTargetClassName() {
            r2 = this;
            java.lang.String r0 = "org.lwjgl.system.Library"
            return r0
    }

    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public void transform(javassist.CtClass r4) throws java.lang.Throwable {
            r3 = this;
            r0 = r4
            java.lang.String r1 = "checkHash"
            javassist.CtMethod r0 = r0.getDeclaredMethod(r1)
            r5 = r0
            r0 = r5
            java.lang.String r1 = "{}"
            r0.setBody(r1)
            return
    }
}
