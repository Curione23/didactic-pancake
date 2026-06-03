package moe.yushi.authlibinjector.util;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/util/WeakIdentityHashMap.class */
public class WeakIdentityHashMap<K, V> implements java.util.Map<K, V> {
    private final java.lang.ref.ReferenceQueue<K> queue;
    private java.util.Map<moe.yushi.authlibinjector.util.WeakIdentityHashMap<K, V>.IdentityWeakReference, V> backingStore;


    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/util/WeakIdentityHashMap$IdentityWeakReference.class */
    class IdentityWeakReference extends java.lang.ref.WeakReference<K> {
        int hash;
        final /* synthetic */ moe.yushi.authlibinjector.util.WeakIdentityHashMap this$0;

        IdentityWeakReference(moe.yushi.authlibinjector.util.WeakIdentityHashMap r5, java.lang.Object r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r0.this$0 = r1
                r0 = r4
                r1 = r6
                r2 = r5
                java.lang.ref.ReferenceQueue r2 = moe.yushi.authlibinjector.util.WeakIdentityHashMap.access$000(r2)
                r0.<init>(r1, r2)
                r0 = r4
                r1 = r6
                int r1 = java.lang.System.identityHashCode(r1)
                r0.hash = r1
                return
        }

        public int hashCode() {
                r2 = this;
                r0 = r2
                int r0 = r0.hash
                return r0
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                if (r0 != r1) goto L7
                r0 = 1
                return r0
            L7:
                r0 = r4
                boolean r0 = r0 instanceof moe.yushi.authlibinjector.util.WeakIdentityHashMap.IdentityWeakReference
                if (r0 != 0) goto L10
                r0 = 0
                return r0
            L10:
                r0 = r4
                moe.yushi.authlibinjector.util.WeakIdentityHashMap$IdentityWeakReference r0 = (moe.yushi.authlibinjector.util.WeakIdentityHashMap.IdentityWeakReference) r0
                r5 = r0
                r0 = r3
                java.lang.Object r0 = r0.get()
                r1 = r5
                java.lang.Object r1 = r1.get()
                if (r0 != r1) goto L22
                r0 = 1
                return r0
            L22:
                r0 = 0
                return r0
        }
    }

    public WeakIdentityHashMap() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            java.lang.ref.ReferenceQueue r1 = new java.lang.ref.ReferenceQueue
            r2 = r1
            r2.<init>()
            r0.queue = r1
            r0 = r4
            java.util.HashMap r1 = new java.util.HashMap
            r2 = r1
            r2.<init>()
            r0.backingStore = r1
            return
    }

    @Override // java.util.Map
    public void clear() {
            r2 = this;
            r0 = r2
            java.util.Map<moe.yushi.authlibinjector.util.WeakIdentityHashMap<K, V>$IdentityWeakReference, V> r0 = r0.backingStore
            r0.clear()
            r0 = r2
            r0.reap()
            return
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object r7) {
            r6 = this;
            r0 = r6
            r0.reap()
            r0 = r6
            java.util.Map<moe.yushi.authlibinjector.util.WeakIdentityHashMap<K, V>$IdentityWeakReference, V> r0 = r0.backingStore
            moe.yushi.authlibinjector.util.WeakIdentityHashMap$IdentityWeakReference r1 = new moe.yushi.authlibinjector.util.WeakIdentityHashMap$IdentityWeakReference
            r2 = r1
            r3 = r6
            r4 = r7
            r2.<init>(r3, r4)
            boolean r0 = r0.containsKey(r1)
            return r0
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object r4) {
            r3 = this;
            r0 = r3
            r0.reap()
            r0 = r3
            java.util.Map<moe.yushi.authlibinjector.util.WeakIdentityHashMap<K, V>$IdentityWeakReference, V> r0 = r0.backingStore
            r1 = r4
            boolean r0 = r0.containsValue(r1)
            return r0
    }

    @Override // java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r6 = this;
            r0 = r6
            r0.reap()
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r6
            java.util.Map<moe.yushi.authlibinjector.util.WeakIdentityHashMap<K, V>$IdentityWeakReference, V> r0 = r0.backingStore
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
        L1b:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L5e
            r0 = r8
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r9 = r0
            r0 = r9
            java.lang.Object r0 = r0.getKey()
            moe.yushi.authlibinjector.util.WeakIdentityHashMap$IdentityWeakReference r0 = (moe.yushi.authlibinjector.util.WeakIdentityHashMap.IdentityWeakReference) r0
            java.lang.Object r0 = r0.get()
            r10 = r0
            r0 = r9
            java.lang.Object r0 = r0.getValue()
            r11 = r0
            moe.yushi.authlibinjector.util.WeakIdentityHashMap$1 r0 = new moe.yushi.authlibinjector.util.WeakIdentityHashMap$1
            r1 = r0
            r2 = r6
            r3 = r10
            r4 = r11
            r1.<init>(r2, r3, r4)
            r12 = r0
            r0 = r7
            r1 = r12
            boolean r0 = r0.add(r1)
            goto L1b
        L5e:
            r0 = r7
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
    }

    @Override // java.util.Map
    public java.util.Set<K> keySet() {
            r3 = this;
            r0 = r3
            r0.reap()
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r3
            java.util.Map<moe.yushi.authlibinjector.util.WeakIdentityHashMap<K, V>$IdentityWeakReference, V> r0 = r0.backingStore
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
        L1b:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L3c
            r0 = r5
            java.lang.Object r0 = r0.next()
            moe.yushi.authlibinjector.util.WeakIdentityHashMap$IdentityWeakReference r0 = (moe.yushi.authlibinjector.util.WeakIdentityHashMap.IdentityWeakReference) r0
            r6 = r0
            r0 = r4
            r1 = r6
            java.lang.Object r1 = r1.get()
            boolean r0 = r0.add(r1)
            goto L1b
        L3c:
            r0 = r4
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof moe.yushi.authlibinjector.util.WeakIdentityHashMap
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            r0 = r3
            java.util.Map<moe.yushi.authlibinjector.util.WeakIdentityHashMap<K, V>$IdentityWeakReference, V> r0 = r0.backingStore
            r1 = r4
            moe.yushi.authlibinjector.util.WeakIdentityHashMap r1 = (moe.yushi.authlibinjector.util.WeakIdentityHashMap) r1
            java.util.Map<moe.yushi.authlibinjector.util.WeakIdentityHashMap<K, V>$IdentityWeakReference, V> r1 = r1.backingStore
            boolean r0 = r0.equals(r1)
            return r0
    }

    @Override // java.util.Map
    public V get(java.lang.Object r7) {
            r6 = this;
            r0 = r6
            r0.reap()
            r0 = r6
            java.util.Map<moe.yushi.authlibinjector.util.WeakIdentityHashMap<K, V>$IdentityWeakReference, V> r0 = r0.backingStore
            moe.yushi.authlibinjector.util.WeakIdentityHashMap$IdentityWeakReference r1 = new moe.yushi.authlibinjector.util.WeakIdentityHashMap$IdentityWeakReference
            r2 = r1
            r3 = r6
            r4 = r7
            r2.<init>(r3, r4)
            java.lang.Object r0 = r0.get(r1)
            return r0
    }

    @Override // java.util.Map
    public V put(K r7, V r8) {
            r6 = this;
            r0 = r6
            r0.reap()
            r0 = r6
            java.util.Map<moe.yushi.authlibinjector.util.WeakIdentityHashMap<K, V>$IdentityWeakReference, V> r0 = r0.backingStore
            moe.yushi.authlibinjector.util.WeakIdentityHashMap$IdentityWeakReference r1 = new moe.yushi.authlibinjector.util.WeakIdentityHashMap$IdentityWeakReference
            r2 = r1
            r3 = r6
            r4 = r7
            r2.<init>(r3, r4)
            r2 = r8
            java.lang.Object r0 = r0.put(r1, r2)
            return r0
    }

    @Override // java.util.Map
    public int hashCode() {
            r2 = this;
            r0 = r2
            r0.reap()
            r0 = r2
            java.util.Map<moe.yushi.authlibinjector.util.WeakIdentityHashMap<K, V>$IdentityWeakReference, V> r0 = r0.backingStore
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.Map
    public boolean isEmpty() {
            r2 = this;
            r0 = r2
            r0.reap()
            r0 = r2
            java.util.Map<moe.yushi.authlibinjector.util.WeakIdentityHashMap<K, V>$IdentityWeakReference, V> r0 = r0.backingStore
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> r4) {
            r3 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @Override // java.util.Map
    public V remove(java.lang.Object r7) {
            r6 = this;
            r0 = r6
            r0.reap()
            r0 = r6
            java.util.Map<moe.yushi.authlibinjector.util.WeakIdentityHashMap<K, V>$IdentityWeakReference, V> r0 = r0.backingStore
            moe.yushi.authlibinjector.util.WeakIdentityHashMap$IdentityWeakReference r1 = new moe.yushi.authlibinjector.util.WeakIdentityHashMap$IdentityWeakReference
            r2 = r1
            r3 = r6
            r4 = r7
            r2.<init>(r3, r4)
            java.lang.Object r0 = r0.remove(r1)
            return r0
    }

    @Override // java.util.Map
    public int size() {
            r2 = this;
            r0 = r2
            r0.reap()
            r0 = r2
            java.util.Map<moe.yushi.authlibinjector.util.WeakIdentityHashMap<K, V>$IdentityWeakReference, V> r0 = r0.backingStore
            int r0 = r0.size()
            return r0
    }

    @Override // java.util.Map
    public java.util.Collection<V> values() {
            r2 = this;
            r0 = r2
            r0.reap()
            r0 = r2
            java.util.Map<moe.yushi.authlibinjector.util.WeakIdentityHashMap<K, V>$IdentityWeakReference, V> r0 = r0.backingStore
            java.util.Collection r0 = r0.values()
            return r0
    }

    private synchronized void reap() {
            r3 = this;
            r0 = r3
            java.lang.ref.ReferenceQueue<K> r0 = r0.queue
            java.lang.ref.Reference r0 = r0.poll()
            r4 = r0
        L8:
            r0 = r4
            if (r0 == 0) goto L27
            r0 = r4
            moe.yushi.authlibinjector.util.WeakIdentityHashMap$IdentityWeakReference r0 = (moe.yushi.authlibinjector.util.WeakIdentityHashMap.IdentityWeakReference) r0
            r5 = r0
            r0 = r3
            java.util.Map<moe.yushi.authlibinjector.util.WeakIdentityHashMap<K, V>$IdentityWeakReference, V> r0 = r0.backingStore
            r1 = r5
            java.lang.Object r0 = r0.remove(r1)
            r0 = r3
            java.lang.ref.ReferenceQueue<K> r0 = r0.queue
            java.lang.ref.Reference r0 = r0.poll()
            r4 = r0
            goto L8
        L27:
            return
    }

    static /* synthetic */ java.lang.ref.ReferenceQueue access$000(moe.yushi.authlibinjector.util.WeakIdentityHashMap r2) {
            r0 = r2
            java.lang.ref.ReferenceQueue<K> r0 = r0.queue
            return r0
    }
}
