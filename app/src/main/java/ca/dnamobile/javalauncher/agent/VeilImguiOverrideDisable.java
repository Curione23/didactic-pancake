package ca.dnamobile.javalauncher.agent;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/methods_injector_agent/methods_injector_agent.jar:ca/dnamobile/javalauncher/agent/VeilImguiOverrideDisable.class */
public final class VeilImguiOverrideDisable {
    public static final java.lang.String TARGET_INTERNAL_NAME = "foundry/veil/impl/client/imgui/VeilImGuiImpl";
    private static final java.lang.String TARGET_METHOD_NAME = "setImGuiPath";
    private static final java.lang.String TARGET_METHOD_DESC = "()V";

    private VeilImguiOverrideDisable() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static byte[] patch(byte[] r5) {
            org.objectweb.asm.ClassReader r0 = new org.objectweb.asm.ClassReader
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r6 = r0
            org.objectweb.asm.tree.ClassNode r0 = new org.objectweb.asm.tree.ClassNode
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r6
            r1 = r7
            r2 = 0
            r0.accept(r1, r2)
            r0 = 0
            r8 = r0
            r0 = r7
            java.util.List r0 = r0.methods
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
        L24:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Lb0
            r0 = r9
            java.lang.Object r0 = r0.next()
            org.objectweb.asm.tree.MethodNode r0 = (org.objectweb.asm.tree.MethodNode) r0
            r10 = r0
            java.lang.String r0 = "setImGuiPath"
            r1 = r10
            java.lang.String r1 = r1.name
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L24
            java.lang.String r0 = "()V"
            r1 = r10
            java.lang.String r1 = r1.desc
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L57
            goto L24
        L57:
            org.objectweb.asm.tree.InsnList r0 = new org.objectweb.asm.tree.InsnList
            r1 = r0
            r1.<init>()
            r11 = r0
            r0 = r11
            org.objectweb.asm.tree.InsnNode r1 = new org.objectweb.asm.tree.InsnNode
            r2 = r1
            r3 = 177(0xb1, float:2.48E-43)
            r2.<init>(r3)
            r0.add(r1)
            r0 = r10
            org.objectweb.asm.tree.InsnList r0 = r0.instructions
            r0.clear()
            r0 = r10
            org.objectweb.asm.tree.InsnList r0 = r0.instructions
            r1 = r11
            r0.add(r1)
            r0 = r10
            java.util.List r0 = r0.tryCatchBlocks
            if (r0 == 0) goto L93
            r0 = r10
            java.util.List r0 = r0.tryCatchBlocks
            r0.clear()
        L93:
            r0 = r10
            java.util.List r0 = r0.localVariables
            if (r0 == 0) goto La5
            r0 = r10
            java.util.List r0 = r0.localVariables
            r0.clear()
        La5:
            r0 = r10
            r1 = 0
            r0.maxStack = r1
            r0 = 1
            r8 = r0
            goto L24
        Lb0:
            r0 = r8
            if (r0 != 0) goto Lf7
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "JavaLauncher Agent: VeilImGuiImpl found, but setImGuiPath()V was not found"
            r0.println(r1)
            r0 = r7
            java.util.List r0 = r0.methods
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
        Lc7:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Lf5
            r0 = r9
            java.lang.Object r0 = r0.next()
            org.objectweb.asm.tree.MethodNode r0 = (org.objectweb.asm.tree.MethodNode) r0
            r10 = r0
            java.io.PrintStream r0 = java.lang.System.out
            r1 = r10
            java.lang.String r1 = r1.name
            r2 = r10
            java.lang.String r2 = r2.desc
            java.lang.String r1 = "JavaLauncher Agent: Veil method: " + r1 + r2
            r0.println(r1)
            goto Lc7
        Lf5:
            r0 = 0
            return r0
        Lf7:
            org.objectweb.asm.ClassWriter r0 = new org.objectweb.asm.ClassWriter
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            r9 = r0
            r0 = r7
            r1 = r9
            r0.accept(r1)
            r0 = r9
            byte[] r0 = r0.toByteArray()
            return r0
    }
}
