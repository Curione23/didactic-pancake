package com.nide8.login2.internal.org.objectweb.asm;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/nide8auth.jar:com/nide8/login2/internal/org/objectweb/asm/CurrentFrame.class */
final class CurrentFrame extends com.nide8.login2.internal.org.objectweb.asm.Frame {
    CurrentFrame(com.nide8.login2.internal.org.objectweb.asm.Label r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // com.nide8.login2.internal.org.objectweb.asm.Frame
    void execute(int r7, int r8, com.nide8.login2.internal.org.objectweb.asm.Symbol r9, com.nide8.login2.internal.org.objectweb.asm.SymbolTable r10) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            super.execute(r1, r2, r3, r4)
            com.nide8.login2.internal.org.objectweb.asm.Frame r0 = new com.nide8.login2.internal.org.objectweb.asm.Frame
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            r11 = r0
            r0 = r6
            r1 = r10
            r2 = r11
            r3 = 0
            boolean r0 = r0.merge(r1, r2, r3)
            r0 = r6
            r1 = r11
            r0.copyFrom(r1)
            return
    }
}
