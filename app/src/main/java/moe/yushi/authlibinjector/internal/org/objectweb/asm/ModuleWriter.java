package moe.yushi.authlibinjector.internal.org.objectweb.asm;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/internal/org/objectweb/asm/ModuleWriter.class */
final class ModuleWriter extends moe.yushi.authlibinjector.internal.org.objectweb.asm.ModuleVisitor {
    private final moe.yushi.authlibinjector.internal.org.objectweb.asm.SymbolTable symbolTable;
    private final int moduleNameIndex;
    private final int moduleFlags;
    private final int moduleVersionIndex;
    private int requiresCount;
    private final moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector requires;
    private int exportsCount;
    private final moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector exports;
    private int opensCount;
    private final moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector opens;
    private int usesCount;
    private final moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector usesIndex;
    private int providesCount;
    private final moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector provides;
    private int packageCount;
    private final moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector packageIndex;
    private int mainClassIndex;

    ModuleWriter(moe.yushi.authlibinjector.internal.org.objectweb.asm.SymbolTable r5, int r6, int r7, int r8) {
            r4 = this;
            r0 = r4
            r1 = 589824(0x90000, float:8.2652E-40)
            r0.<init>(r1)
            r0 = r4
            r1 = r5
            r0.symbolTable = r1
            r0 = r4
            r1 = r6
            r0.moduleNameIndex = r1
            r0 = r4
            r1 = r7
            r0.moduleFlags = r1
            r0 = r4
            r1 = r8
            r0.moduleVersionIndex = r1
            r0 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r1 = new moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector
            r2 = r1
            r2.<init>()
            r0.requires = r1
            r0 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r1 = new moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector
            r2 = r1
            r2.<init>()
            r0.exports = r1
            r0 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r1 = new moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector
            r2 = r1
            r2.<init>()
            r0.opens = r1
            r0 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r1 = new moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector
            r2 = r1
            r2.<init>()
            r0.usesIndex = r1
            r0 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r1 = new moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector
            r2 = r1
            r2.<init>()
            r0.provides = r1
            r0 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r1 = new moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector
            r2 = r1
            r2.<init>()
            r0.packageIndex = r1
            return
    }

    @Override // moe.yushi.authlibinjector.internal.org.objectweb.asm.ModuleVisitor
    public void visitMainClass(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r5
            moe.yushi.authlibinjector.internal.org.objectweb.asm.Symbol r1 = r1.addConstantClass(r2)
            int r1 = r1.index
            r0.mainClassIndex = r1
            return
    }

    @Override // moe.yushi.authlibinjector.internal.org.objectweb.asm.ModuleVisitor
    public void visitPackage(java.lang.String r5) {
            r4 = this;
            r0 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.packageIndex
            r1 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r5
            moe.yushi.authlibinjector.internal.org.objectweb.asm.Symbol r1 = r1.addConstantPackage(r2)
            int r1 = r1.index
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r4
            r1 = r0
            int r1 = r1.packageCount
            r2 = 1
            int r1 = r1 + r2
            r0.packageCount = r1
            return
    }

    @Override // moe.yushi.authlibinjector.internal.org.objectweb.asm.ModuleVisitor
    public void visitRequire(java.lang.String r5, int r6, java.lang.String r7) {
            r4 = this;
            r0 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.requires
            r1 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r5
            moe.yushi.authlibinjector.internal.org.objectweb.asm.Symbol r1 = r1.addConstantModule(r2)
            int r1 = r1.index
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r6
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r7
            if (r1 != 0) goto L1e
            r1 = 0
            goto L26
        L1e:
            r1 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r7
            int r1 = r1.addConstantUtf8(r2)
        L26:
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r4
            r1 = r0
            int r1 = r1.requiresCount
            r2 = 1
            int r1 = r1 + r2
            r0.requiresCount = r1
            return
    }

    @Override // moe.yushi.authlibinjector.internal.org.objectweb.asm.ModuleVisitor
    public void visitExport(java.lang.String r5, int r6, java.lang.String... r7) {
            r4 = this;
            r0 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.exports
            r1 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r5
            moe.yushi.authlibinjector.internal.org.objectweb.asm.Symbol r1 = r1.addConstantPackage(r2)
            int r1 = r1.index
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r6
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r7
            if (r0 != 0) goto L27
            r0 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.exports
            r1 = 0
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            goto L64
        L27:
            r0 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.exports
            r1 = r7
            int r1 = r1.length
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r7
            r8 = r0
            r0 = r8
            int r0 = r0.length
            r9 = r0
            r0 = 0
            r10 = r0
        L3c:
            r0 = r10
            r1 = r9
            if (r0 >= r1) goto L64
            r0 = r8
            r1 = r10
            r0 = r0[r1]
            r11 = r0
            r0 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.exports
            r1 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r11
            moe.yushi.authlibinjector.internal.org.objectweb.asm.Symbol r1 = r1.addConstantModule(r2)
            int r1 = r1.index
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            int r10 = r10 + 1
            goto L3c
        L64:
            r0 = r4
            r1 = r0
            int r1 = r1.exportsCount
            r2 = 1
            int r1 = r1 + r2
            r0.exportsCount = r1
            return
    }

    @Override // moe.yushi.authlibinjector.internal.org.objectweb.asm.ModuleVisitor
    public void visitOpen(java.lang.String r5, int r6, java.lang.String... r7) {
            r4 = this;
            r0 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.opens
            r1 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r5
            moe.yushi.authlibinjector.internal.org.objectweb.asm.Symbol r1 = r1.addConstantPackage(r2)
            int r1 = r1.index
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r6
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r7
            if (r0 != 0) goto L27
            r0 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.opens
            r1 = 0
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            goto L64
        L27:
            r0 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.opens
            r1 = r7
            int r1 = r1.length
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r7
            r8 = r0
            r0 = r8
            int r0 = r0.length
            r9 = r0
            r0 = 0
            r10 = r0
        L3c:
            r0 = r10
            r1 = r9
            if (r0 >= r1) goto L64
            r0 = r8
            r1 = r10
            r0 = r0[r1]
            r11 = r0
            r0 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.opens
            r1 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r11
            moe.yushi.authlibinjector.internal.org.objectweb.asm.Symbol r1 = r1.addConstantModule(r2)
            int r1 = r1.index
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            int r10 = r10 + 1
            goto L3c
        L64:
            r0 = r4
            r1 = r0
            int r1 = r1.opensCount
            r2 = 1
            int r1 = r1 + r2
            r0.opensCount = r1
            return
    }

    @Override // moe.yushi.authlibinjector.internal.org.objectweb.asm.ModuleVisitor
    public void visitUse(java.lang.String r5) {
            r4 = this;
            r0 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.usesIndex
            r1 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r5
            moe.yushi.authlibinjector.internal.org.objectweb.asm.Symbol r1 = r1.addConstantClass(r2)
            int r1 = r1.index
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r4
            r1 = r0
            int r1 = r1.usesCount
            r2 = 1
            int r1 = r1 + r2
            r0.usesCount = r1
            return
    }

    @Override // moe.yushi.authlibinjector.internal.org.objectweb.asm.ModuleVisitor
    public void visitProvide(java.lang.String r5, java.lang.String... r6) {
            r4 = this;
            r0 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.provides
            r1 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r5
            moe.yushi.authlibinjector.internal.org.objectweb.asm.Symbol r1 = r1.addConstantClass(r2)
            int r1 = r1.index
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.provides
            r1 = r6
            int r1 = r1.length
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r6
            r7 = r0
            r0 = r7
            int r0 = r0.length
            r8 = r0
            r0 = 0
            r9 = r0
        L26:
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto L4d
            r0 = r7
            r1 = r9
            r0 = r0[r1]
            r10 = r0
            r0 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.provides
            r1 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r10
            moe.yushi.authlibinjector.internal.org.objectweb.asm.Symbol r1 = r1.addConstantClass(r2)
            int r1 = r1.index
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            int r9 = r9 + 1
            goto L26
        L4d:
            r0 = r4
            r1 = r0
            int r1 = r1.providesCount
            r2 = 1
            int r1 = r1 + r2
            r0.providesCount = r1
            return
    }

    @Override // moe.yushi.authlibinjector.internal.org.objectweb.asm.ModuleVisitor
    public void visitEnd() {
            r1 = this;
            return
    }

    int getAttributeCount() {
            r3 = this;
            r0 = 1
            r1 = r3
            int r1 = r1.packageCount
            if (r1 <= 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            int r0 = r0 + r1
            r1 = r3
            int r1 = r1.mainClassIndex
            if (r1 <= 0) goto L19
            r1 = 1
            goto L1a
        L19:
            r1 = 0
        L1a:
            int r0 = r0 + r1
            return r0
    }

    int computeAttributesSize() {
            r4 = this;
            r0 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            java.lang.String r1 = "Module"
            int r0 = r0.addConstantUtf8(r1)
            r0 = 22
            r1 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r1 = r1.requires
            int r1 = r1.length
            int r0 = r0 + r1
            r1 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r1 = r1.exports
            int r1 = r1.length
            int r0 = r0 + r1
            r1 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r1 = r1.opens
            int r1 = r1.length
            int r0 = r0 + r1
            r1 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r1 = r1.usesIndex
            int r1 = r1.length
            int r0 = r0 + r1
            r1 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r1 = r1.provides
            int r1 = r1.length
            int r0 = r0 + r1
            r5 = r0
            r0 = r4
            int r0 = r0.packageCount
            if (r0 <= 0) goto L53
            r0 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            java.lang.String r1 = "ModulePackages"
            int r0 = r0.addConstantUtf8(r1)
            r0 = r5
            r1 = 8
            r2 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r2 = r2.packageIndex
            int r2 = r2.length
            int r1 = r1 + r2
            int r0 = r0 + r1
            r5 = r0
        L53:
            r0 = r4
            int r0 = r0.mainClassIndex
            if (r0 <= 0) goto L67
            r0 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            java.lang.String r1 = "ModuleMainClass"
            int r0 = r0.addConstantUtf8(r1)
            int r5 = r5 + 8
        L67:
            r0 = r5
            return r0
    }

    void putAttributes(moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r6) {
            r5 = this;
            r0 = 16
            r1 = r5
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r1 = r1.requires
            int r1 = r1.length
            int r0 = r0 + r1
            r1 = r5
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r1 = r1.exports
            int r1 = r1.length
            int r0 = r0 + r1
            r1 = r5
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r1 = r1.opens
            int r1 = r1.length
            int r0 = r0 + r1
            r1 = r5
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r1 = r1.usesIndex
            int r1 = r1.length
            int r0 = r0 + r1
            r1 = r5
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r1 = r1.provides
            int r1 = r1.length
            int r0 = r0 + r1
            r7 = r0
            r0 = r6
            r1 = r5
            moe.yushi.authlibinjector.internal.org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            java.lang.String r2 = "Module"
            int r1 = r1.addConstantUtf8(r2)
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r7
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r5
            int r1 = r1.moduleNameIndex
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r5
            int r1 = r1.moduleFlags
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r5
            int r1 = r1.moduleVersionIndex
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r5
            int r1 = r1.requiresCount
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r5
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r1 = r1.requires
            byte[] r1 = r1.data
            r2 = 0
            r3 = r5
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r3 = r3.requires
            int r3 = r3.length
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
            r1 = r5
            int r1 = r1.exportsCount
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r5
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r1 = r1.exports
            byte[] r1 = r1.data
            r2 = 0
            r3 = r5
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r3 = r3.exports
            int r3 = r3.length
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
            r1 = r5
            int r1 = r1.opensCount
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r5
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r1 = r1.opens
            byte[] r1 = r1.data
            r2 = 0
            r3 = r5
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r3 = r3.opens
            int r3 = r3.length
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
            r1 = r5
            int r1 = r1.usesCount
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r5
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r1 = r1.usesIndex
            byte[] r1 = r1.data
            r2 = 0
            r3 = r5
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r3 = r3.usesIndex
            int r3 = r3.length
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
            r1 = r5
            int r1 = r1.providesCount
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r5
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r1 = r1.provides
            byte[] r1 = r1.data
            r2 = 0
            r3 = r5
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r3 = r3.provides
            int r3 = r3.length
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
            r0 = r5
            int r0 = r0.packageCount
            if (r0 <= 0) goto L109
            r0 = r6
            r1 = r5
            moe.yushi.authlibinjector.internal.org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            java.lang.String r2 = "ModulePackages"
            int r1 = r1.addConstantUtf8(r2)
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = 2
            r2 = r5
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r2 = r2.packageIndex
            int r2 = r2.length
            int r1 = r1 + r2
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r5
            int r1 = r1.packageCount
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r5
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r1 = r1.packageIndex
            byte[] r1 = r1.data
            r2 = 0
            r3 = r5
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r3 = r3.packageIndex
            int r3 = r3.length
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
        L109:
            r0 = r5
            int r0 = r0.mainClassIndex
            if (r0 <= 0) goto L129
            r0 = r6
            r1 = r5
            moe.yushi.authlibinjector.internal.org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            java.lang.String r2 = "ModuleMainClass"
            int r1 = r1.addConstantUtf8(r2)
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = 2
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r5
            int r1 = r1.mainClassIndex
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
        L129:
            return
    }
}
