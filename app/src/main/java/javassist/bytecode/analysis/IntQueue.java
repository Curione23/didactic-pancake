package javassist.bytecode.analysis;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/analysis/IntQueue.class */
class IntQueue {
    private javassist.bytecode.analysis.IntQueue.Entry head;
    private javassist.bytecode.analysis.IntQueue.Entry tail;

    /* JADX INFO: renamed from: javassist.bytecode.analysis.IntQueue$1, reason: invalid class name */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/analysis/IntQueue$1.class */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/analysis/IntQueue$Entry.class */
    private static class Entry {
        private javassist.bytecode.analysis.IntQueue.Entry next;
        private int value;

        private Entry(int r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.value = r1
                return
        }

        /* synthetic */ Entry(int r4, javassist.bytecode.analysis.IntQueue.AnonymousClass1 r5) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
                return
        }

        static /* synthetic */ javassist.bytecode.analysis.IntQueue.Entry access$102(javassist.bytecode.analysis.IntQueue.Entry r4, javassist.bytecode.analysis.IntQueue.Entry r5) {
                r0 = r4
                r1 = r5
                r2 = r1; r1 = r0; r0 = r2; 
                r1.next = r2
                return r0
        }

        static /* synthetic */ int access$200(javassist.bytecode.analysis.IntQueue.Entry r2) {
                r0 = r2
                int r0 = r0.value
                return r0
        }

        static /* synthetic */ javassist.bytecode.analysis.IntQueue.Entry access$100(javassist.bytecode.analysis.IntQueue.Entry r2) {
                r0 = r2
                javassist.bytecode.analysis.IntQueue$Entry r0 = r0.next
                return r0
        }
    }

    IntQueue() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    void add(int r6) {
            r5 = this;
            javassist.bytecode.analysis.IntQueue$Entry r0 = new javassist.bytecode.analysis.IntQueue$Entry
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            r7 = r0
            r0 = r5
            javassist.bytecode.analysis.IntQueue$Entry r0 = r0.tail
            if (r0 == 0) goto L1a
            r0 = r5
            javassist.bytecode.analysis.IntQueue$Entry r0 = r0.tail
            r1 = r7
            javassist.bytecode.analysis.IntQueue$Entry r0 = javassist.bytecode.analysis.IntQueue.Entry.access$102(r0, r1)
        L1a:
            r0 = r5
            r1 = r7
            r0.tail = r1
            r0 = r5
            javassist.bytecode.analysis.IntQueue$Entry r0 = r0.head
            if (r0 != 0) goto L2b
            r0 = r5
            r1 = r7
            r0.head = r1
        L2b:
            return
    }

    boolean isEmpty() {
            r2 = this;
            r0 = r2
            javassist.bytecode.analysis.IntQueue$Entry r0 = r0.head
            if (r0 != 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    int take() {
            r3 = this;
            r0 = r3
            javassist.bytecode.analysis.IntQueue$Entry r0 = r0.head
            if (r0 != 0) goto Lf
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r1 = r0
            r1.<init>()
            throw r0
        Lf:
            r0 = r3
            javassist.bytecode.analysis.IntQueue$Entry r0 = r0.head
            int r0 = javassist.bytecode.analysis.IntQueue.Entry.access$200(r0)
            r4 = r0
            r0 = r3
            r1 = r3
            javassist.bytecode.analysis.IntQueue$Entry r1 = r1.head
            javassist.bytecode.analysis.IntQueue$Entry r1 = javassist.bytecode.analysis.IntQueue.Entry.access$100(r1)
            r0.head = r1
            r0 = r3
            javassist.bytecode.analysis.IntQueue$Entry r0 = r0.head
            if (r0 != 0) goto L2e
            r0 = r3
            r1 = 0
            r0.tail = r1
        L2e:
            r0 = r4
            return r0
    }
}
