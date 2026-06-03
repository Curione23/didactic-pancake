package com.mio.libpatcher.transformer;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:com/mio/libpatcher/transformer/ForgeModDirTransformer.class */
public class ForgeModDirTransformer implements com.mio.libpatcher.transformer.BaseTransformer {
    public ForgeModDirTransformer() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public java.lang.String getTargetClassName() {
            r2 = this;
            java.lang.String r0 = "net.minecraftforge.fml.loading.ModDirTransformerDiscoverer"
            return r0
    }

    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public void transform(javassist.CtClass r4) throws java.lang.Throwable {
            r3 = this;
            r0 = r4
            java.lang.String r1 = "visitFile"
            javassist.CtMethod r0 = r0.getDeclaredMethod(r1)
            r5 = r0
            r0 = r5
            java.lang.String r1 = "{        String name =  $1.getFileName().toString();\n        if (name.endsWith(\".jar\")) {\n            System.out.println(\"Loading mod: \"+ name);\n        }}"
            r0.insertBefore(r1)
            return
    }
}
