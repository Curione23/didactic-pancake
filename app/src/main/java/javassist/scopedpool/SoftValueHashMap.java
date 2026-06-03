package javassist.scopedpool;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/scopedpool/SoftValueHashMap.class */
public class SoftValueHashMap<K, V> implements java.util.Map<K, V> {
    private java.util.Map<K, javassist.scopedpool.SoftValueHashMap.SoftValueRef<K, V>> hash;
    private java.lang.ref.ReferenceQueue<V> queue;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/scopedpool/SoftValueHashMap$SoftValueRef.class */
    private static class SoftValueRef<K, V> extends java.lang.ref.SoftReference<V> {
        public K key;

        private SoftValueRef(K r5, V r6, java.lang.ref.ReferenceQueue<V> r7) {
                r4 = this;
                r0 = r4
                r1 = r6
                r2 = r7
                r0.<init>(r1, r2)
                r0 = r4
                r1 = r5
                r0.key = r1
                return
        }

        private static <K, V> javassist.scopedpool.SoftValueHashMap.SoftValueRef<K, V> create(K r6, V r7, java.lang.ref.ReferenceQueue<V> r8) {
                r0 = r7
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                javassist.scopedpool.SoftValueHashMap$SoftValueRef r0 = new javassist.scopedpool.SoftValueHashMap$SoftValueRef
                r1 = r0
                r2 = r6
                r3 = r7
                r4 = r8
                r1.<init>(r2, r3, r4)
                return r0
        }

        static /* synthetic */ javassist.scopedpool.SoftValueHashMap.SoftValueRef access$000(java.lang.Object r4, java.lang.Object r5, java.lang.ref.ReferenceQueue r6) {
                r0 = r4
                r1 = r5
                r2 = r6
                javassist.scopedpool.SoftValueHashMap$SoftValueRef r0 = create(r0, r1, r2)
                return r0
        }
    }

    @Override // java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r6 = this;
            r0 = r6
            r0.processQueue()
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r6
            java.util.Map<K, javassist.scopedpool.SoftValueHashMap$SoftValueRef<K, V>> r0 = r0.hash
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
        L1b:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L51
            r0 = r8
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r9 = r0
            r0 = r7
            java.util.AbstractMap$SimpleImmutableEntry r1 = new java.util.AbstractMap$SimpleImmutableEntry
            r2 = r1
            r3 = r9
            java.lang.Object r3 = r3.getKey()
            r4 = r9
            java.lang.Object r4 = r4.getValue()
            javassist.scopedpool.SoftValueHashMap$SoftValueRef r4 = (javassist.scopedpool.SoftValueHashMap.SoftValueRef) r4
            java.lang.Object r4 = r4.get()
            r2.<init>(r3, r4)
            boolean r0 = r0.add(r1)
            goto L1b
        L51:
            r0 = r7
            return r0
    }

    private void processQueue() {
            r4 = this;
            r0 = r4
            java.util.Map<K, javassist.scopedpool.SoftValueHashMap$SoftValueRef<K, V>> r0 = r0.hash
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L46
        Lc:
            r0 = r4
            java.lang.ref.ReferenceQueue<V> r0 = r0.queue
            java.lang.ref.Reference r0 = r0.poll()
            r1 = r0
            r5 = r1
            if (r0 == 0) goto L46
            r0 = r5
            boolean r0 = r0 instanceof javassist.scopedpool.SoftValueHashMap.SoftValueRef
            if (r0 == 0) goto Lc
            r0 = r5
            javassist.scopedpool.SoftValueHashMap$SoftValueRef r0 = (javassist.scopedpool.SoftValueHashMap.SoftValueRef) r0
            r6 = r0
            r0 = r5
            r1 = r4
            java.util.Map<K, javassist.scopedpool.SoftValueHashMap$SoftValueRef<K, V>> r1 = r1.hash
            r2 = r6
            K r2 = r2.key
            java.lang.Object r1 = r1.get(r2)
            if (r0 != r1) goto L43
            r0 = r4
            java.util.Map<K, javassist.scopedpool.SoftValueHashMap$SoftValueRef<K, V>> r0 = r0.hash
            r1 = r6
            K r1 = r1.key
            java.lang.Object r0 = r0.remove(r1)
        L43:
            goto Lc
        L46:
            return
    }

    public SoftValueHashMap(int r7, float r8) {
            r6 = this;
            r0 = r6
            r0.<init>()
            r0 = r6
            java.lang.ref.ReferenceQueue r1 = new java.lang.ref.ReferenceQueue
            r2 = r1
            r2.<init>()
            r0.queue = r1
            r0 = r6
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r2 = r1
            r3 = r7
            r4 = r8
            r2.<init>(r3, r4)
            r0.hash = r1
            return
    }

    public SoftValueHashMap(int r6) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            java.lang.ref.ReferenceQueue r1 = new java.lang.ref.ReferenceQueue
            r2 = r1
            r2.<init>()
            r0.queue = r1
            r0 = r5
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            r0.hash = r1
            return
    }

    public SoftValueHashMap() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            java.lang.ref.ReferenceQueue r1 = new java.lang.ref.ReferenceQueue
            r2 = r1
            r2.<init>()
            r0.queue = r1
            r0 = r4
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r2 = r1
            r2.<init>()
            r0.hash = r1
            return
    }

    public SoftValueHashMap(java.util.Map<K, V> r5) {
            r4 = this;
            r0 = r4
            r1 = 2
            r2 = r5
            int r2 = r2.size()
            int r1 = r1 * r2
            r2 = 11
            int r1 = java.lang.Math.max(r1, r2)
            r2 = 1061158912(0x3f400000, float:0.75)
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r5
            r0.putAll(r1)
            return
    }

    @Override // java.util.Map
    public int size() {
            r2 = this;
            r0 = r2
            r0.processQueue()
            r0 = r2
            java.util.Map<K, javassist.scopedpool.SoftValueHashMap$SoftValueRef<K, V>> r0 = r0.hash
            int r0 = r0.size()
            return r0
    }

    @Override // java.util.Map
    public boolean isEmpty() {
            r2 = this;
            r0 = r2
            r0.processQueue()
            r0 = r2
            java.util.Map<K, javassist.scopedpool.SoftValueHashMap$SoftValueRef<K, V>> r0 = r0.hash
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object r4) {
            r3 = this;
            r0 = r3
            r0.processQueue()
            r0 = r3
            java.util.Map<K, javassist.scopedpool.SoftValueHashMap$SoftValueRef<K, V>> r0 = r0.hash
            r1 = r4
            boolean r0 = r0.containsKey(r1)
            return r0
    }

    @Override // java.util.Map
    public V get(java.lang.Object r5) {
            r4 = this;
            r0 = r4
            r0.processQueue()
            r0 = r4
            r1 = r4
            java.util.Map<K, javassist.scopedpool.SoftValueHashMap$SoftValueRef<K, V>> r1 = r1.hash
            r2 = r5
            java.lang.Object r1 = r1.get(r2)
            javassist.scopedpool.SoftValueHashMap$SoftValueRef r1 = (javassist.scopedpool.SoftValueHashMap.SoftValueRef) r1
            java.lang.Object r0 = r0.valueOrNull(r1)
            return r0
    }

    @Override // java.util.Map
    public V put(K r8, V r9) {
            r7 = this;
            r0 = r7
            r0.processQueue()
            r0 = r7
            r1 = r7
            java.util.Map<K, javassist.scopedpool.SoftValueHashMap$SoftValueRef<K, V>> r1 = r1.hash
            r2 = r8
            r3 = r8
            r4 = r9
            r5 = r7
            java.lang.ref.ReferenceQueue<V> r5 = r5.queue
            javassist.scopedpool.SoftValueHashMap$SoftValueRef r3 = javassist.scopedpool.SoftValueHashMap.SoftValueRef.access$000(r3, r4, r5)
            java.lang.Object r1 = r1.put(r2, r3)
            javassist.scopedpool.SoftValueHashMap$SoftValueRef r1 = (javassist.scopedpool.SoftValueHashMap.SoftValueRef) r1
            java.lang.Object r0 = r0.valueOrNull(r1)
            return r0
    }

    @Override // java.util.Map
    public V remove(java.lang.Object r5) {
            r4 = this;
            r0 = r4
            r0.processQueue()
            r0 = r4
            r1 = r4
            java.util.Map<K, javassist.scopedpool.SoftValueHashMap$SoftValueRef<K, V>> r1 = r1.hash
            r2 = r5
            java.lang.Object r1 = r1.remove(r2)
            javassist.scopedpool.SoftValueHashMap$SoftValueRef r1 = (javassist.scopedpool.SoftValueHashMap.SoftValueRef) r1
            java.lang.Object r0 = r0.valueOrNull(r1)
            return r0
    }

    @Override // java.util.Map
    public void clear() {
            r2 = this;
            r0 = r2
            r0.processQueue()
            r0 = r2
            java.util.Map<K, javassist.scopedpool.SoftValueHashMap$SoftValueRef<K, V>> r0 = r0.hash
            r0.clear()
            return
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object r4) {
            r3 = this;
            r0 = r3
            r0.processQueue()
            r0 = 0
            r1 = r4
            if (r0 != r1) goto Lb
            r0 = 0
            return r0
        Lb:
            r0 = r3
            java.util.Map<K, javassist.scopedpool.SoftValueHashMap$SoftValueRef<K, V>> r0 = r0.hash
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
        L1a:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L42
            r0 = r5
            java.lang.Object r0 = r0.next()
            javassist.scopedpool.SoftValueHashMap$SoftValueRef r0 = (javassist.scopedpool.SoftValueHashMap.SoftValueRef) r0
            r6 = r0
            r0 = 0
            r1 = r6
            if (r0 == r1) goto L3f
            r0 = r4
            r1 = r6
            java.lang.Object r1 = r1.get()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3f
            r0 = 1
            return r0
        L3f:
            goto L1a
        L42:
            r0 = 0
            return r0
    }

    @Override // java.util.Map
    public java.util.Set<K> keySet() {
            r2 = this;
            r0 = r2
            r0.processQueue()
            r0 = r2
            java.util.Map<K, javassist.scopedpool.SoftValueHashMap$SoftValueRef<K, V>> r0 = r0.hash
            java.util.Set r0 = r0.keySet()
            return r0
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> r6) {
            r5 = this;
            r0 = r5
            r0.processQueue()
            r0 = r6
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
        L10:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L30
            r0 = r7
            java.lang.Object r0 = r0.next()
            r8 = r0
            r0 = r5
            r1 = r8
            r2 = r6
            r3 = r8
            java.lang.Object r2 = r2.get(r3)
            java.lang.Object r0 = r0.put(r1, r2)
            goto L10
        L30:
            return
    }

    @Override // java.util.Map
    public java.util.Collection<V> values() {
            r3 = this;
            r0 = r3
            r0.processQueue()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r3
            java.util.Map<K, javassist.scopedpool.SoftValueHashMap$SoftValueRef<K, V>> r0 = r0.hash
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
        L1b:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L3c
            r0 = r5
            java.lang.Object r0 = r0.next()
            javassist.scopedpool.SoftValueHashMap$SoftValueRef r0 = (javassist.scopedpool.SoftValueHashMap.SoftValueRef) r0
            r6 = r0
            r0 = r4
            r1 = r6
            java.lang.Object r1 = r1.get()
            boolean r0 = r0.add(r1)
            goto L1b
        L3c:
            r0 = r4
            return r0
    }

    private V valueOrNull(javassist.scopedpool.SoftValueHashMap.SoftValueRef<K, V> r4) {
            r3 = this;
            r0 = 0
            r1 = r4
            if (r0 != r1) goto L7
            r0 = 0
            return r0
        L7:
            r0 = r4
            java.lang.Object r0 = r0.get()
            return r0
    }
}
