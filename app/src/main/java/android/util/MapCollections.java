package android.util;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:android/util/MapCollections.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:android/util/MapCollections.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:android/util/MapCollections.class */
abstract class MapCollections<K, V> {
    android.util.MapCollections<K, V>.EntrySet mEntrySet;
    android.util.MapCollections<K, V>.KeySet mKeySet;
    android.util.MapCollections<K, V>.ValuesCollection mValues;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:android/util/MapCollections$ArrayIterator.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:android/util/MapCollections$ArrayIterator.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:android/util/MapCollections$ArrayIterator.class */
    final class ArrayIterator<T> implements java.util.Iterator<T> {
        final int mOffset;
        int mSize;
        int mIndex;
        boolean mCanRemove;
        final /* synthetic */ android.util.MapCollections this$0;

        ArrayIterator(android.util.MapCollections r4, int r5) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.this$0 = r1
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = 0
                r0.mCanRemove = r1
                r0 = r3
                r1 = r5
                r0.mOffset = r1
                r0 = r3
                r1 = r4
                int r1 = r1.colGetSize()
                r0.mSize = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r3 = this;
                r0 = r3
                int r0 = r0.mIndex
                r1 = r3
                int r1 = r1.mSize
                if (r0 >= r1) goto Lf
                r0 = 1
                goto L10
            Lf:
                r0 = 0
            L10:
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r4 = this;
                r0 = r4
                android.util.MapCollections r0 = r0.this$0
                r1 = r4
                int r1 = r1.mIndex
                r2 = r4
                int r2 = r2.mOffset
                java.lang.Object r0 = r0.colGetEntry(r1, r2)
                r5 = r0
                r0 = r4
                r1 = r0
                int r1 = r1.mIndex
                r2 = 1
                int r1 = r1 + r2
                r0.mIndex = r1
                r0 = r4
                r1 = 1
                r0.mCanRemove = r1
                r0 = r5
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r4 = this;
                r0 = r4
                boolean r0 = r0.mCanRemove
                if (r0 != 0) goto Lf
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                r1.<init>()
                throw r0
            Lf:
                r0 = r4
                r1 = r0
                int r1 = r1.mIndex
                r2 = 1
                int r1 = r1 - r2
                r0.mIndex = r1
                r0 = r4
                r1 = r0
                int r1 = r1.mSize
                r2 = 1
                int r1 = r1 - r2
                r0.mSize = r1
                r0 = r4
                r1 = 0
                r0.mCanRemove = r1
                r0 = r4
                android.util.MapCollections r0 = r0.this$0
                r1 = r4
                int r1 = r1.mIndex
                r0.colRemoveAt(r1)
                return
        }
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:android/util/MapCollections$EntrySet.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:android/util/MapCollections$EntrySet.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:android/util/MapCollections$EntrySet.class */
    final class EntrySet implements java.util.Set<java.util.Map.Entry<K, V>> {
        final /* synthetic */ android.util.MapCollections this$0;

        EntrySet(android.util.MapCollections r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.this$0 = r1
                r0 = r3
                r0.<init>()
                return
        }

        public boolean add(java.util.Map.Entry<K, V> r4) {
                r3 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r1 = r0
                r1.<init>()
                throw r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(java.util.Collection<? extends java.util.Map.Entry<K, V>> r5) {
                r4 = this;
                r0 = r4
                android.util.MapCollections r0 = r0.this$0
                int r0 = r0.colGetSize()
                r6 = r0
                r0 = r5
                java.util.Iterator r0 = r0.iterator()
                r7 = r0
            Lf:
                r0 = r7
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L3b
                r0 = r7
                java.lang.Object r0 = r0.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                r8 = r0
                r0 = r4
                android.util.MapCollections r0 = r0.this$0
                r1 = r8
                java.lang.Object r1 = r1.getKey()
                r2 = r8
                java.lang.Object r2 = r2.getValue()
                r0.colPut(r1, r2)
                goto Lf
            L3b:
                r0 = r6
                r1 = r4
                android.util.MapCollections r1 = r1.this$0
                int r1 = r1.colGetSize()
                if (r0 == r1) goto L4a
                r0 = 1
                goto L4b
            L4a:
                r0 = 0
            L4b:
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
                r2 = this;
                r0 = r2
                android.util.MapCollections r0 = r0.this$0
                r0.colClear()
                return
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(java.lang.Object r5) {
                r4 = this;
                r0 = r5
                boolean r0 = r0 instanceof java.util.Map.Entry
                if (r0 != 0) goto L9
                r0 = 0
                return r0
            L9:
                r0 = r5
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                r6 = r0
                r0 = r4
                android.util.MapCollections r0 = r0.this$0
                r1 = r6
                java.lang.Object r1 = r1.getKey()
                int r0 = r0.colIndexOfKey(r1)
                r7 = r0
                r0 = r7
                if (r0 >= 0) goto L22
                r0 = 0
                return r0
            L22:
                r0 = r4
                android.util.MapCollections r0 = r0.this$0
                r1 = r7
                r2 = 1
                java.lang.Object r0 = r0.colGetEntry(r1, r2)
                r8 = r0
                r0 = r8
                r1 = r6
                java.lang.Object r1 = r1.getValue()
                boolean r0 = android.util.Objects.equal(r0, r1)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(java.util.Collection<?> r4) {
                r3 = this;
                r0 = r4
                java.util.Iterator r0 = r0.iterator()
                r5 = r0
            L7:
                r0 = r5
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L1f
                r0 = r3
                r1 = r5
                java.lang.Object r1 = r1.next()
                boolean r0 = r0.contains(r1)
                if (r0 != 0) goto L7
                r0 = 0
                return r0
            L1f:
                r0 = 1
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
                r2 = this;
                r0 = r2
                android.util.MapCollections r0 = r0.this$0
                int r0 = r0.colGetSize()
                if (r0 != 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                r4 = this;
                android.util.MapCollections$MapIterator r0 = new android.util.MapCollections$MapIterator
                r1 = r0
                r2 = r4
                android.util.MapCollections r2 = r2.this$0
                r1.<init>(r2)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(java.lang.Object r4) {
                r3 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r1 = r0
                r1.<init>()
                throw r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(java.util.Collection<?> r4) {
                r3 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r1 = r0
                r1.<init>()
                throw r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(java.util.Collection<?> r4) {
                r3 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r1 = r0
                r1.<init>()
                throw r0
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
                r2 = this;
                r0 = r2
                android.util.MapCollections r0 = r0.this$0
                int r0 = r0.colGetSize()
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public java.lang.Object[] toArray() {
                r3 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r1 = r0
                r1.<init>()
                throw r0
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] r4) {
                r3 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r1 = r0
                r1.<init>()
                throw r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(java.lang.Object r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                boolean r0 = android.util.MapCollections.equalsSetHelper(r0, r1)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
                r4 = this;
                r0 = 0
                r5 = r0
                r0 = r4
                android.util.MapCollections r0 = r0.this$0
                int r0 = r0.colGetSize()
                r1 = 1
                int r0 = r0 - r1
                r6 = r0
            Lc:
                r0 = r6
                if (r0 < 0) goto L49
                r0 = r4
                android.util.MapCollections r0 = r0.this$0
                r1 = r6
                r2 = 0
                java.lang.Object r0 = r0.colGetEntry(r1, r2)
                r7 = r0
                r0 = r4
                android.util.MapCollections r0 = r0.this$0
                r1 = r6
                r2 = 1
                java.lang.Object r0 = r0.colGetEntry(r1, r2)
                r8 = r0
                r0 = r5
                r1 = r7
                if (r1 != 0) goto L2e
                r1 = 0
                goto L32
            L2e:
                r1 = r7
                int r1 = r1.hashCode()
            L32:
                r2 = r8
                if (r2 != 0) goto L3b
                r2 = 0
                goto L40
            L3b:
                r2 = r8
                int r2 = r2.hashCode()
            L40:
                r1 = r1 ^ r2
                int r0 = r0 + r1
                r5 = r0
                int r6 = r6 + (-1)
                goto Lc
            L49:
                r0 = r5
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(java.lang.Object r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                boolean r0 = r0.add(r1)
                return r0
        }
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:android/util/MapCollections$KeySet.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:android/util/MapCollections$KeySet.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:android/util/MapCollections$KeySet.class */
    final class KeySet implements java.util.Set<K> {
        final /* synthetic */ android.util.MapCollections this$0;

        KeySet(android.util.MapCollections r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.this$0 = r1
                r0 = r3
                r0.<init>()
                return
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K r4) {
                r3 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r1 = r0
                r1.<init>()
                throw r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(java.util.Collection<? extends K> r4) {
                r3 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r1 = r0
                r1.<init>()
                throw r0
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
                r2 = this;
                r0 = r2
                android.util.MapCollections r0 = r0.this$0
                r0.colClear()
                return
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(java.lang.Object r4) {
                r3 = this;
                r0 = r3
                android.util.MapCollections r0 = r0.this$0
                r1 = r4
                int r0 = r0.colIndexOfKey(r1)
                if (r0 < 0) goto Lf
                r0 = 1
                goto L10
            Lf:
                r0 = 0
            L10:
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(java.util.Collection<?> r4) {
                r3 = this;
                r0 = r3
                android.util.MapCollections r0 = r0.this$0
                java.util.Map r0 = r0.colGetMap()
                r1 = r4
                boolean r0 = android.util.MapCollections.containsAllHelper(r0, r1)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
                r2 = this;
                r0 = r2
                android.util.MapCollections r0 = r0.this$0
                int r0 = r0.colGetSize()
                if (r0 != 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<K> iterator() {
                r5 = this;
                android.util.MapCollections$ArrayIterator r0 = new android.util.MapCollections$ArrayIterator
                r1 = r0
                r2 = r5
                android.util.MapCollections r2 = r2.this$0
                r3 = 0
                r1.<init>(r2, r3)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(java.lang.Object r4) {
                r3 = this;
                r0 = r3
                android.util.MapCollections r0 = r0.this$0
                r1 = r4
                int r0 = r0.colIndexOfKey(r1)
                r5 = r0
                r0 = r5
                if (r0 < 0) goto L17
                r0 = r3
                android.util.MapCollections r0 = r0.this$0
                r1 = r5
                r0.colRemoveAt(r1)
                r0 = 1
                return r0
            L17:
                r0 = 0
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(java.util.Collection<?> r4) {
                r3 = this;
                r0 = r3
                android.util.MapCollections r0 = r0.this$0
                java.util.Map r0 = r0.colGetMap()
                r1 = r4
                boolean r0 = android.util.MapCollections.removeAllHelper(r0, r1)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(java.util.Collection<?> r4) {
                r3 = this;
                r0 = r3
                android.util.MapCollections r0 = r0.this$0
                java.util.Map r0 = r0.colGetMap()
                r1 = r4
                boolean r0 = android.util.MapCollections.retainAllHelper(r0, r1)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
                r2 = this;
                r0 = r2
                android.util.MapCollections r0 = r0.this$0
                int r0 = r0.colGetSize()
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public java.lang.Object[] toArray() {
                r3 = this;
                r0 = r3
                android.util.MapCollections r0 = r0.this$0
                r1 = 0
                java.lang.Object[] r0 = r0.toArrayHelper(r1)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] r5) {
                r4 = this;
                r0 = r4
                android.util.MapCollections r0 = r0.this$0
                r1 = r5
                r2 = 0
                java.lang.Object[] r0 = r0.toArrayHelper(r1, r2)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(java.lang.Object r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                boolean r0 = android.util.MapCollections.equalsSetHelper(r0, r1)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
                r4 = this;
                r0 = 0
                r5 = r0
                r0 = r4
                android.util.MapCollections r0 = r0.this$0
                int r0 = r0.colGetSize()
                r1 = 1
                int r0 = r0 - r1
                r6 = r0
            Lc:
                r0 = r6
                if (r0 < 0) goto L2f
                r0 = r4
                android.util.MapCollections r0 = r0.this$0
                r1 = r6
                r2 = 0
                java.lang.Object r0 = r0.colGetEntry(r1, r2)
                r7 = r0
                r0 = r5
                r1 = r7
                if (r1 != 0) goto L23
                r1 = 0
                goto L27
            L23:
                r1 = r7
                int r1 = r1.hashCode()
            L27:
                int r0 = r0 + r1
                r5 = r0
                int r6 = r6 + (-1)
                goto Lc
            L2f:
                r0 = r5
                return r0
        }
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:android/util/MapCollections$MapIterator.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:android/util/MapCollections$MapIterator.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:android/util/MapCollections$MapIterator.class */
    final class MapIterator implements java.util.Iterator<java.util.Map.Entry<K, V>>, java.util.Map.Entry<K, V> {
        int mEnd;
        int mIndex;
        boolean mEntryValid;
        final /* synthetic */ android.util.MapCollections this$0;

        MapIterator(android.util.MapCollections r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                r0.this$0 = r1
                r0 = r4
                r0.<init>()
                r0 = r4
                r1 = 0
                r0.mEntryValid = r1
                r0 = r4
                r1 = r5
                int r1 = r1.colGetSize()
                r2 = 1
                int r1 = r1 - r2
                r0.mEnd = r1
                r0 = r4
                r1 = -1
                r0.mIndex = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r3 = this;
                r0 = r3
                int r0 = r0.mIndex
                r1 = r3
                int r1 = r1.mEnd
                if (r0 >= r1) goto Lf
                r0 = 1
                goto L10
            Lf:
                r0 = 0
            L10:
                return r0
        }

        @Override // java.util.Iterator
        public java.util.Map.Entry<K, V> next() {
                r4 = this;
                r0 = r4
                r1 = r0
                int r1 = r1.mIndex
                r2 = 1
                int r1 = r1 + r2
                r0.mIndex = r1
                r0 = r4
                r1 = 1
                r0.mEntryValid = r1
                r0 = r4
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r4 = this;
                r0 = r4
                boolean r0 = r0.mEntryValid
                if (r0 != 0) goto Lf
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                r1.<init>()
                throw r0
            Lf:
                r0 = r4
                android.util.MapCollections r0 = r0.this$0
                r1 = r4
                int r1 = r1.mIndex
                r0.colRemoveAt(r1)
                r0 = r4
                r1 = r0
                int r1 = r1.mIndex
                r2 = 1
                int r1 = r1 - r2
                r0.mIndex = r1
                r0 = r4
                r1 = r0
                int r1 = r1.mEnd
                r2 = 1
                int r1 = r1 - r2
                r0.mEnd = r1
                r0 = r4
                r1 = 0
                r0.mEntryValid = r1
                return
        }

        @Override // java.util.Map.Entry
        public K getKey() {
                r4 = this;
                r0 = r4
                boolean r0 = r0.mEntryValid
                if (r0 != 0) goto L11
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "This container does not support retaining Map.Entry objects"
                r1.<init>(r2)
                throw r0
            L11:
                r0 = r4
                android.util.MapCollections r0 = r0.this$0
                r1 = r4
                int r1 = r1.mIndex
                r2 = 0
                java.lang.Object r0 = r0.colGetEntry(r1, r2)
                return r0
        }

        @Override // java.util.Map.Entry
        public V getValue() {
                r4 = this;
                r0 = r4
                boolean r0 = r0.mEntryValid
                if (r0 != 0) goto L11
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "This container does not support retaining Map.Entry objects"
                r1.<init>(r2)
                throw r0
            L11:
                r0 = r4
                android.util.MapCollections r0 = r0.this$0
                r1 = r4
                int r1 = r1.mIndex
                r2 = 1
                java.lang.Object r0 = r0.colGetEntry(r1, r2)
                return r0
        }

        @Override // java.util.Map.Entry
        public V setValue(V r5) {
                r4 = this;
                r0 = r4
                boolean r0 = r0.mEntryValid
                if (r0 != 0) goto L11
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "This container does not support retaining Map.Entry objects"
                r1.<init>(r2)
                throw r0
            L11:
                r0 = r4
                android.util.MapCollections r0 = r0.this$0
                r1 = r4
                int r1 = r1.mIndex
                r2 = r5
                java.lang.Object r0 = r0.colSetValue(r1, r2)
                return r0
        }

        @Override // java.util.Map.Entry
        public final boolean equals(java.lang.Object r6) {
                r5 = this;
                r0 = r5
                boolean r0 = r0.mEntryValid
                if (r0 != 0) goto L11
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "This container does not support retaining Map.Entry objects"
                r1.<init>(r2)
                throw r0
            L11:
                r0 = r6
                boolean r0 = r0 instanceof java.util.Map.Entry
                if (r0 != 0) goto L1a
                r0 = 0
                return r0
            L1a:
                r0 = r6
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                r7 = r0
                r0 = r7
                java.lang.Object r0 = r0.getKey()
                r1 = r5
                android.util.MapCollections r1 = r1.this$0
                r2 = r5
                int r2 = r2.mIndex
                r3 = 0
                java.lang.Object r1 = r1.colGetEntry(r2, r3)
                boolean r0 = android.util.Objects.equal(r0, r1)
                if (r0 == 0) goto L53
                r0 = r7
                java.lang.Object r0 = r0.getValue()
                r1 = r5
                android.util.MapCollections r1 = r1.this$0
                r2 = r5
                int r2 = r2.mIndex
                r3 = 1
                java.lang.Object r1 = r1.colGetEntry(r2, r3)
                boolean r0 = android.util.Objects.equal(r0, r1)
                if (r0 == 0) goto L53
                r0 = 1
                goto L54
            L53:
                r0 = 0
            L54:
                return r0
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
                r4 = this;
                r0 = r4
                boolean r0 = r0.mEntryValid
                if (r0 != 0) goto L11
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "This container does not support retaining Map.Entry objects"
                r1.<init>(r2)
                throw r0
            L11:
                r0 = r4
                android.util.MapCollections r0 = r0.this$0
                r1 = r4
                int r1 = r1.mIndex
                r2 = 0
                java.lang.Object r0 = r0.colGetEntry(r1, r2)
                r5 = r0
                r0 = r4
                android.util.MapCollections r0 = r0.this$0
                r1 = r4
                int r1 = r1.mIndex
                r2 = 1
                java.lang.Object r0 = r0.colGetEntry(r1, r2)
                r6 = r0
                r0 = r5
                if (r0 != 0) goto L33
                r0 = 0
                goto L37
            L33:
                r0 = r5
                int r0 = r0.hashCode()
            L37:
                r1 = r6
                if (r1 != 0) goto L3f
                r1 = 0
                goto L43
            L3f:
                r1 = r6
                int r1 = r1.hashCode()
            L43:
                r0 = r0 ^ r1
                return r0
        }

        public final java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r1.<init>()
                r1 = r3
                java.lang.Object r1 = r1.getKey()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "="
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = r3
                java.lang.Object r1 = r1.getValue()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r2 = this;
                r0 = r2
                java.util.Map$Entry r0 = r0.next()
                return r0
        }
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:android/util/MapCollections$ValuesCollection.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:android/util/MapCollections$ValuesCollection.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:android/util/MapCollections$ValuesCollection.class */
    final class ValuesCollection implements java.util.Collection<V> {
        final /* synthetic */ android.util.MapCollections this$0;

        ValuesCollection(android.util.MapCollections r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.this$0 = r1
                r0 = r3
                r0.<init>()
                return
        }

        @Override // java.util.Collection
        public boolean add(V r4) {
                r3 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r1 = r0
                r1.<init>()
                throw r0
        }

        @Override // java.util.Collection
        public boolean addAll(java.util.Collection<? extends V> r4) {
                r3 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r1 = r0
                r1.<init>()
                throw r0
        }

        @Override // java.util.Collection
        public void clear() {
                r2 = this;
                r0 = r2
                android.util.MapCollections r0 = r0.this$0
                r0.colClear()
                return
        }

        @Override // java.util.Collection
        public boolean contains(java.lang.Object r4) {
                r3 = this;
                r0 = r3
                android.util.MapCollections r0 = r0.this$0
                r1 = r4
                int r0 = r0.colIndexOfValue(r1)
                if (r0 < 0) goto Lf
                r0 = 1
                goto L10
            Lf:
                r0 = 0
            L10:
                return r0
        }

        @Override // java.util.Collection
        public boolean containsAll(java.util.Collection<?> r4) {
                r3 = this;
                r0 = r4
                java.util.Iterator r0 = r0.iterator()
                r5 = r0
            L7:
                r0 = r5
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L1f
                r0 = r3
                r1 = r5
                java.lang.Object r1 = r1.next()
                boolean r0 = r0.contains(r1)
                if (r0 != 0) goto L7
                r0 = 0
                return r0
            L1f:
                r0 = 1
                return r0
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
                r2 = this;
                r0 = r2
                android.util.MapCollections r0 = r0.this$0
                int r0 = r0.colGetSize()
                if (r0 != 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @Override // java.util.Collection, java.lang.Iterable
        public java.util.Iterator<V> iterator() {
                r5 = this;
                android.util.MapCollections$ArrayIterator r0 = new android.util.MapCollections$ArrayIterator
                r1 = r0
                r2 = r5
                android.util.MapCollections r2 = r2.this$0
                r3 = 1
                r1.<init>(r2, r3)
                return r0
        }

        @Override // java.util.Collection
        public boolean remove(java.lang.Object r4) {
                r3 = this;
                r0 = r3
                android.util.MapCollections r0 = r0.this$0
                r1 = r4
                int r0 = r0.colIndexOfValue(r1)
                r5 = r0
                r0 = r5
                if (r0 < 0) goto L17
                r0 = r3
                android.util.MapCollections r0 = r0.this$0
                r1 = r5
                r0.colRemoveAt(r1)
                r0 = 1
                return r0
            L17:
                r0 = 0
                return r0
        }

        @Override // java.util.Collection
        public boolean removeAll(java.util.Collection<?> r5) {
                r4 = this;
                r0 = r4
                android.util.MapCollections r0 = r0.this$0
                int r0 = r0.colGetSize()
                r6 = r0
                r0 = 0
                r7 = r0
                r0 = 0
                r8 = r0
            Ld:
                r0 = r8
                r1 = r6
                if (r0 >= r1) goto L41
                r0 = r4
                android.util.MapCollections r0 = r0.this$0
                r1 = r8
                r2 = 1
                java.lang.Object r0 = r0.colGetEntry(r1, r2)
                r9 = r0
                r0 = r5
                r1 = r9
                boolean r0 = r0.contains(r1)
                if (r0 == 0) goto L3b
                r0 = r4
                android.util.MapCollections r0 = r0.this$0
                r1 = r8
                r0.colRemoveAt(r1)
                int r8 = r8 + (-1)
                int r6 = r6 + (-1)
                r0 = 1
                r7 = r0
            L3b:
                int r8 = r8 + 1
                goto Ld
            L41:
                r0 = r7
                return r0
        }

        @Override // java.util.Collection
        public boolean retainAll(java.util.Collection<?> r5) {
                r4 = this;
                r0 = r4
                android.util.MapCollections r0 = r0.this$0
                int r0 = r0.colGetSize()
                r6 = r0
                r0 = 0
                r7 = r0
                r0 = 0
                r8 = r0
            Ld:
                r0 = r8
                r1 = r6
                if (r0 >= r1) goto L41
                r0 = r4
                android.util.MapCollections r0 = r0.this$0
                r1 = r8
                r2 = 1
                java.lang.Object r0 = r0.colGetEntry(r1, r2)
                r9 = r0
                r0 = r5
                r1 = r9
                boolean r0 = r0.contains(r1)
                if (r0 != 0) goto L3b
                r0 = r4
                android.util.MapCollections r0 = r0.this$0
                r1 = r8
                r0.colRemoveAt(r1)
                int r8 = r8 + (-1)
                int r6 = r6 + (-1)
                r0 = 1
                r7 = r0
            L3b:
                int r8 = r8 + 1
                goto Ld
            L41:
                r0 = r7
                return r0
        }

        @Override // java.util.Collection
        public int size() {
                r2 = this;
                r0 = r2
                android.util.MapCollections r0 = r0.this$0
                int r0 = r0.colGetSize()
                return r0
        }

        @Override // java.util.Collection
        public java.lang.Object[] toArray() {
                r3 = this;
                r0 = r3
                android.util.MapCollections r0 = r0.this$0
                r1 = 1
                java.lang.Object[] r0 = r0.toArrayHelper(r1)
                return r0
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] r5) {
                r4 = this;
                r0 = r4
                android.util.MapCollections r0 = r0.this$0
                r1 = r5
                r2 = 1
                java.lang.Object[] r0 = r0.toArrayHelper(r1, r2)
                return r0
        }
    }

    MapCollections() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static <K, V> boolean containsAllHelper(java.util.Map<K, V> r3, java.util.Collection<?> r4) {
            r0 = r4
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
        L7:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L21
            r0 = r3
            r1 = r5
            java.lang.Object r1 = r1.next()
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L7
            r0 = 0
            return r0
        L21:
            r0 = 1
            return r0
    }

    public static <K, V> boolean removeAllHelper(java.util.Map<K, V> r3, java.util.Collection<?> r4) {
            r0 = r3
            int r0 = r0.size()
            r5 = r0
            r0 = r4
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
        Le:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L27
            r0 = r3
            r1 = r6
            java.lang.Object r1 = r1.next()
            java.lang.Object r0 = r0.remove(r1)
            goto Le
        L27:
            r0 = r5
            r1 = r3
            int r1 = r1.size()
            if (r0 == r1) goto L35
            r0 = 1
            goto L36
        L35:
            r0 = 0
        L36:
            return r0
    }

    public static <K, V> boolean retainAllHelper(java.util.Map<K, V> r3, java.util.Collection<?> r4) {
            r0 = r3
            int r0 = r0.size()
            r5 = r0
            r0 = r3
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
        L13:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L34
            r0 = r4
            r1 = r6
            java.lang.Object r1 = r1.next()
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L13
            r0 = r6
            r0.remove()
            goto L13
        L34:
            r0 = r5
            r1 = r3
            int r1 = r1.size()
            if (r0 == r1) goto L42
            r0 = 1
            goto L43
        L42:
            r0 = 0
        L43:
            return r0
    }

    public java.lang.Object[] toArrayHelper(int r7) {
            r6 = this;
            r0 = r6
            int r0 = r0.colGetSize()
            r8 = r0
            r0 = r8
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r9 = r0
            r0 = 0
            r10 = r0
        Ld:
            r0 = r10
            r1 = r8
            if (r0 >= r1) goto L24
            r0 = r9
            r1 = r10
            r2 = r6
            r3 = r10
            r4 = r7
            java.lang.Object r2 = r2.colGetEntry(r3, r4)
            r0[r1] = r2
            int r10 = r10 + 1
            goto Ld
        L24:
            r0 = r9
            return r0
    }

    public <T> T[] toArrayHelper(T[] r7, int r8) {
            r6 = this;
            r0 = r6
            int r0 = r0.colGetSize()
            r9 = r0
            r0 = r7
            int r0 = r0.length
            r1 = r9
            if (r0 >= r1) goto L1e
            r0 = r7
            java.lang.Class r0 = r0.getClass()
            java.lang.Class r0 = r0.getComponentType()
            r1 = r9
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r10 = r0
            r0 = r10
            r7 = r0
        L1e:
            r0 = 0
            r10 = r0
        L21:
            r0 = r10
            r1 = r9
            if (r0 >= r1) goto L38
            r0 = r7
            r1 = r10
            r2 = r6
            r3 = r10
            r4 = r8
            java.lang.Object r2 = r2.colGetEntry(r3, r4)
            r0[r1] = r2
            int r10 = r10 + 1
            goto L21
        L38:
            r0 = r7
            int r0 = r0.length
            r1 = r9
            if (r0 <= r1) goto L42
            r0 = r7
            r1 = r9
            r2 = 0
            r0[r1] = r2
        L42:
            r0 = r7
            return r0
    }

    public static <T> boolean equalsSetHelper(java.util.Set<T> r3, java.lang.Object r4) {
            r0 = r3
            r1 = r4
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = r4
            boolean r0 = r0 instanceof java.util.Set
            if (r0 == 0) goto L38
            r0 = r4
            java.util.Set r0 = (java.util.Set) r0
            r5 = r0
            r0 = r3
            int r0 = r0.size()     // Catch: java.lang.NullPointerException -> L32 java.lang.ClassCastException -> L35
            r1 = r5
            int r1 = r1.size()     // Catch: java.lang.NullPointerException -> L32 java.lang.ClassCastException -> L35
            if (r0 != r1) goto L30
            r0 = r3
            r1 = r5
            boolean r0 = r0.containsAll(r1)     // Catch: java.lang.NullPointerException -> L32 java.lang.ClassCastException -> L35
            if (r0 == 0) goto L30
            r0 = 1
            goto L31
        L30:
            r0 = 0
        L31:
            return r0
        L32:
            r6 = move-exception
            r0 = 0
            return r0
        L35:
            r6 = move-exception
            r0 = 0
            return r0
        L38:
            r0 = 0
            return r0
    }

    public java.util.Set<java.util.Map.Entry<K, V>> getEntrySet() {
            r5 = this;
            r0 = r5
            android.util.MapCollections<K, V>$EntrySet r0 = r0.mEntrySet
            if (r0 != 0) goto L13
            r0 = r5
            android.util.MapCollections$EntrySet r1 = new android.util.MapCollections$EntrySet
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            r0.mEntrySet = r1
        L13:
            r0 = r5
            android.util.MapCollections<K, V>$EntrySet r0 = r0.mEntrySet
            return r0
    }

    public java.util.Set<K> getKeySet() {
            r5 = this;
            r0 = r5
            android.util.MapCollections<K, V>$KeySet r0 = r0.mKeySet
            if (r0 != 0) goto L13
            r0 = r5
            android.util.MapCollections$KeySet r1 = new android.util.MapCollections$KeySet
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            r0.mKeySet = r1
        L13:
            r0 = r5
            android.util.MapCollections<K, V>$KeySet r0 = r0.mKeySet
            return r0
    }

    public java.util.Collection<V> getValues() {
            r5 = this;
            r0 = r5
            android.util.MapCollections<K, V>$ValuesCollection r0 = r0.mValues
            if (r0 != 0) goto L13
            r0 = r5
            android.util.MapCollections$ValuesCollection r1 = new android.util.MapCollections$ValuesCollection
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            r0.mValues = r1
        L13:
            r0 = r5
            android.util.MapCollections<K, V>$ValuesCollection r0 = r0.mValues
            return r0
    }

    protected abstract int colGetSize();

    protected abstract java.lang.Object colGetEntry(int r1, int r2);

    protected abstract int colIndexOfKey(java.lang.Object r1);

    protected abstract int colIndexOfValue(java.lang.Object r1);

    protected abstract java.util.Map<K, V> colGetMap();

    protected abstract void colPut(K r1, V r2);

    protected abstract V colSetValue(int r1, V r2);

    protected abstract void colRemoveAt(int r1);

    protected abstract void colClear();
}
