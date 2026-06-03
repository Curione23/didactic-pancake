package com.mio.libpatcher;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:com/mio/libpatcher/MainAgent.class */
public class MainAgent {
    private static final java.util.List<java.lang.String> classList = null;

    public MainAgent() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void premain(java.lang.String r3, java.lang.instrument.Instrumentation r4) {
            java.lang.String r0 = "MioPatcher is running!"
            com.mio.libpatcher.util.LogUtil.info(r0)
            r0 = r4
            r1 = 0
            addTransformer(r0, r1)
            return
    }

    public static void agentmain(java.lang.String r3, java.lang.instrument.Instrumentation r4) {
            r0 = r4
            r1 = 1
            addTransformer(r0, r1)
            return
    }

    private static void addTransformer(java.lang.instrument.Instrumentation r6, boolean r7) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r8
            com.mio.libpatcher.transformer.TTSTransformer r1 = new com.mio.libpatcher.transformer.TTSTransformer
            r2 = r1
            r2.<init>()
            boolean r0 = r0.add(r1)
            r0 = r8
            com.mio.libpatcher.transformer.LibraryTransformer r1 = new com.mio.libpatcher.transformer.LibraryTransformer
            r2 = r1
            r2.<init>()
            boolean r0 = r0.add(r1)
            r0 = r8
            com.mio.libpatcher.transformer.SystemInfoTransformer r1 = new com.mio.libpatcher.transformer.SystemInfoTransformer
            r2 = r1
            r2.<init>()
            boolean r0 = r0.add(r1)
            r0 = r8
            com.mio.libpatcher.transformer.RandomPatchesTransformer r1 = new com.mio.libpatcher.transformer.RandomPatchesTransformer
            r2 = r1
            r2.<init>()
            boolean r0 = r0.add(r1)
            r0 = r8
            com.mio.libpatcher.transformer.oshi.ProcessorIdentifierTransformer r1 = new com.mio.libpatcher.transformer.oshi.ProcessorIdentifierTransformer
            r2 = r1
            r2.<init>()
            boolean r0 = r0.add(r1)
            r0 = r8
            com.mio.libpatcher.transformer.oshi.CentralProcessor r1 = new com.mio.libpatcher.transformer.oshi.CentralProcessor
            r2 = r1
            r2.<init>()
            boolean r0 = r0.add(r1)
            r0 = r8
            com.mio.libpatcher.transformer.SodiumLikeModTransformer r1 = new com.mio.libpatcher.transformer.SodiumLikeModTransformer
            r2 = r1
            r2.<init>()
            boolean r0 = r0.add(r1)
            r0 = r8
            com.mio.libpatcher.transformer.SQLTransformer r1 = new com.mio.libpatcher.transformer.SQLTransformer
            r2 = r1
            r2.<init>()
            boolean r0 = r0.add(r1)
            r0 = r8
            com.mio.libpatcher.transformer.FabricLoaderTransformer r1 = new com.mio.libpatcher.transformer.FabricLoaderTransformer
            r2 = r1
            r2.<init>()
            boolean r0 = r0.add(r1)
            r0 = r8
            com.mio.libpatcher.transformer.ForgeModDirTransformer r1 = new com.mio.libpatcher.transformer.ForgeModDirTransformer
            r2 = r1
            r2.<init>()
            boolean r0 = r0.add(r1)
            r0 = r8
            com.mio.libpatcher.transformer.CreateTransformer r1 = new com.mio.libpatcher.transformer.CreateTransformer
            r2 = r1
            r2.<init>()
            boolean r0 = r0.add(r1)
            r0 = r8
            com.mio.libpatcher.transformer.SableRapierLibTransformer r1 = new com.mio.libpatcher.transformer.SableRapierLibTransformer
            r2 = r1
            r2.<init>()
            boolean r0 = r0.add(r1)
            r0 = r8
            r1 = r6
            r2 = r7
            void r1 = (v2) -> { // java.util.function.Consumer.accept(java.lang.Object):void
                lambda$addTransformer$0(r1, r2, v2);
            }
            r0.forEach(r1)
            r0 = r7
            if (r0 == 0) goto L130
            r0 = r6
            java.lang.Class[] r0 = r0.getAllLoadedClasses()
            r9 = r0
            r0 = r9
            r10 = r0
            r0 = r10
            int r0 = r0.length
            r11 = r0
            r0 = 0
            r12 = r0
        Ld3:
            r0 = r12
            r1 = r11
            if (r0 >= r1) goto L130
            r0 = r10
            r1 = r12
            r0 = r0[r1]
            r13 = r0
            java.util.List<java.lang.String> r0 = com.mio.libpatcher.MainAgent.classList
            r1 = r13
            java.lang.String r1 = r1.getName()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L12a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "Transform class:"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r13
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.mio.libpatcher.util.LogUtil.info(r0)
            r0 = r6
            r1 = 1
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.instrument.UnmodifiableClassException -> L11d
            r2 = r1
            r3 = 0
            r4 = r13
            r2[r3] = r4     // Catch: java.lang.instrument.UnmodifiableClassException -> L11d
            r0.retransformClasses(r1)     // Catch: java.lang.instrument.UnmodifiableClassException -> L11d
            goto L130
        L11d:
            r14 = move-exception
            r0 = r14
            java.lang.String r0 = r0.toString()
            com.mio.libpatcher.util.LogUtil.error(r0)
            goto L130
        L12a:
            int r12 = r12 + 1
            goto Ld3
        L130:
            return
    }

    private static /* synthetic */ void lambda$addTransformer$0(java.lang.instrument.Instrumentation r4, boolean r5, com.mio.libpatcher.transformer.BaseTransformer r6) {
            r0 = r4
            r1 = r6
            r2 = 1
            r0.addTransformer(r1, r2)
            r0 = r5
            if (r0 == 0) goto L36
            r0 = r6
            java.lang.String r0 = r0.getTargetClassName()
            r7 = r0
            r0 = r7
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L27
            java.util.List<java.lang.String> r0 = com.mio.libpatcher.MainAgent.classList
            r1 = r7
            boolean r0 = r0.add(r1)
            goto L36
        L27:
            java.util.List<java.lang.String> r0 = com.mio.libpatcher.MainAgent.classList
            r1 = r6
            java.util.List r1 = r1.getTargetClassNames()
            boolean r0 = r0.addAll(r1)
        L36:
            return
    }

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            com.mio.libpatcher.MainAgent.classList = r0
            return
    }
}
