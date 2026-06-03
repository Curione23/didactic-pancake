package com.nide8.login2.internal.org.objectweb.asm;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/nide8auth.jar:com/nide8/login2/internal/org/objectweb/asm/Edge.class */
final class Edge {
    static final int JUMP = 0;
    static final int EXCEPTION = Integer.MAX_VALUE;
    final int info;
    final com.nide8.login2.internal.org.objectweb.asm.Label successor;
    com.nide8.login2.internal.org.objectweb.asm.Edge nextEdge;

    Edge(int r4, com.nide8.login2.internal.org.objectweb.asm.Label r5, com.nide8.login2.internal.org.objectweb.asm.Edge r6) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.info = r1
            r0 = r3
            r1 = r5
            r0.successor = r1
            r0 = r3
            r1 = r6
            r0.nextEdge = r1
            return
    }
}
