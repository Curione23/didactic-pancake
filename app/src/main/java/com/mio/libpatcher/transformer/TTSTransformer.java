package com.mio.libpatcher.transformer;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:com/mio/libpatcher/transformer/TTSTransformer.class */
public class TTSTransformer implements com.mio.libpatcher.transformer.BaseTransformer {
    public TTSTransformer() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public java.lang.String getTargetClassName() {
            r2 = this;
            java.lang.String r0 = "com.mojang.text2speech.Narrator"
            return r0
    }

    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public void transform(javassist.CtClass r4) throws java.lang.Throwable {
            r3 = this;
            r0 = r4
            java.lang.String r1 = "getNarrator"
            javassist.CtMethod r0 = r0.getDeclaredMethod(r1)
            r5 = r0
            r0 = r5
            java.lang.String r1 = "{ return new com.mojang.text2speech.NarratorDummy(); }"
            r0.setBody(r1)     // Catch: javassist.CannotCompileException -> L10
            goto L17
        L10:
            r6 = move-exception
            r0 = r5
            java.lang.String r1 = "{ return EMPTY; }"
            r0.setBody(r1)
        L17:
            return
    }
}
