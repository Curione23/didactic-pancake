package com.google.crypto.tink.shaded.protobuf;

import java.lang.Comparable;

/* JADX INFO: loaded from: classes2.dex */
class SmallSortedMap<K extends java.lang.Comparable<K>, V> extends java.util.AbstractMap<K, V> {
    private java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>.Entry> entryList;
    private boolean isImmutable;
    private volatile com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>.DescendingEntrySet lazyDescendingEntrySet;
    private volatile com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>.EntrySet lazyEntrySet;
    private final int maxArraySize;
    private java.util.Map<K, V> overflowEntries;
    private java.util.Map<K, V> overflowEntriesDescending;


    private class DescendingEntryIterator implements java.util.Iterator<java.util.Map.Entry<K, V>> {
        private java.util.Iterator<java.util.Map.Entry<K, V>> lazyOverflowIterator;
        private int pos;
        final /* synthetic */ com.google.crypto.tink.shaded.protobuf.SmallSortedMap this$0;

        private DescendingEntryIterator(com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.util.List r1 = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.access$600(r1)
                int r1 = r1.size()
                r0.pos = r1
                return
        }

        /* synthetic */ DescendingEntryIterator(com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1, com.google.crypto.tink.shaded.protobuf.SmallSortedMap.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private java.util.Iterator<java.util.Map.Entry<K, V>> getOverflowIterator() {
                r1 = this;
                java.util.Iterator<java.util.Map$Entry<K extends java.lang.Comparable<K>, V>> r0 = r1.lazyOverflowIterator
                if (r0 != 0) goto L14
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = r1.this$0
                java.util.Map r0 = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.access$900(r0)
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                r1.lazyOverflowIterator = r0
            L14:
                java.util.Iterator<java.util.Map$Entry<K extends java.lang.Comparable<K>, V>> r0 = r1.lazyOverflowIterator
                return r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.pos
                if (r0 <= 0) goto L10
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1 = r2.this$0
                java.util.List r1 = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.access$600(r1)
                int r1 = r1.size()
                if (r0 <= r1) goto L1a
            L10:
                java.util.Iterator r0 = r2.getOverflowIterator()
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L1c
            L1a:
                r0 = 1
                goto L1d
            L1c:
                r0 = 0
            L1d:
                return r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                java.util.Map$Entry r0 = r1.next()
                return r0
        }

        @Override // java.util.Iterator
        public java.util.Map.Entry<K, V> next() {
                r2 = this;
                java.util.Iterator r0 = r2.getOverflowIterator()
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L15
                java.util.Iterator r0 = r2.getOverflowIterator()
                java.lang.Object r0 = r0.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                return r0
            L15:
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = r2.this$0
                java.util.List r0 = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.access$600(r0)
                int r1 = r2.pos
                int r1 = r1 + (-1)
                r2.pos = r1
                java.lang.Object r0 = r0.get(r1)
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }
    }

    private class DescendingEntrySet extends com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>.EntrySet {
        final /* synthetic */ com.google.crypto.tink.shaded.protobuf.SmallSortedMap this$0;

        private DescendingEntrySet(com.google.crypto.tink.shaded.protobuf.SmallSortedMap r2) {
                r1 = this;
                r1.this$0 = r2
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        /* synthetic */ DescendingEntrySet(com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1, com.google.crypto.tink.shaded.protobuf.SmallSortedMap.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.SmallSortedMap.EntrySet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                r3 = this;
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap$DescendingEntryIterator r0 = new com.google.crypto.tink.shaded.protobuf.SmallSortedMap$DescendingEntryIterator
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1 = r3.this$0
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }
    }

    private static class EmptySet {
        private static final java.lang.Iterable<java.lang.Object> ITERABLE = null;
        private static final java.util.Iterator<java.lang.Object> ITERATOR = null;



        static {
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap$EmptySet$1 r0 = new com.google.crypto.tink.shaded.protobuf.SmallSortedMap$EmptySet$1
                r0.<init>()
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap.EmptySet.ITERATOR = r0
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap$EmptySet$2 r0 = new com.google.crypto.tink.shaded.protobuf.SmallSortedMap$EmptySet$2
                r0.<init>()
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap.EmptySet.ITERABLE = r0
                return
        }

        private EmptySet() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ java.util.Iterator access$1000() {
                java.util.Iterator<java.lang.Object> r0 = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.EmptySet.ITERATOR
                return r0
        }

        static <T> java.lang.Iterable<T> iterable() {
                java.lang.Iterable<java.lang.Object> r0 = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.EmptySet.ITERABLE
                return r0
        }
    }

    private class Entry implements java.util.Map.Entry<K, V>, java.lang.Comparable<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>.Entry> {
        private final K key;
        final /* synthetic */ com.google.crypto.tink.shaded.protobuf.SmallSortedMap this$0;
        private V value;

        Entry(com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1, K r2, V r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.key = r2
                r0.value = r3
                return
        }

        Entry(com.google.crypto.tink.shaded.protobuf.SmallSortedMap r2, java.util.Map.Entry<K, V> r3) {
                r1 = this;
                java.lang.Object r0 = r3.getKey()
                java.lang.Comparable r0 = (java.lang.Comparable) r0
                java.lang.Object r3 = r3.getValue()
                r1.<init>(r2, r0, r3)
                return
        }

        private boolean equals(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                if (r1 != 0) goto L8
                if (r2 != 0) goto L6
                r1 = 1
                goto Lc
            L6:
                r1 = 0
                goto Lc
            L8:
                boolean r1 = r1.equals(r2)
            Lc:
                return r1
        }

        public int compareTo(com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>.Entry r2) {
                r1 = this;
                java.lang.Comparable r0 = r1.getKey()
                java.lang.Comparable r2 = r2.getKey()
                int r2 = r0.compareTo(r2)
                return r2
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap$Entry r1 = (com.google.crypto.tink.shaded.protobuf.SmallSortedMap.Entry) r1
                int r1 = r0.compareTo(r1)
                return r1
        }

        @Override // java.util.Map.Entry
        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r5 != r4) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof java.util.Map.Entry
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                java.util.Map$Entry r5 = (java.util.Map.Entry) r5
                K extends java.lang.Comparable<K> r1 = r4.key
                java.lang.Object r3 = r5.getKey()
                boolean r1 = r4.equals(r1, r3)
                if (r1 == 0) goto L25
                V r1 = r4.value
                java.lang.Object r5 = r5.getValue()
                boolean r5 = r4.equals(r1, r5)
                if (r5 == 0) goto L25
                goto L26
            L25:
                r0 = r2
            L26:
                return r0
        }

        @Override // java.util.Map.Entry
        public K getKey() {
                r1 = this;
                K extends java.lang.Comparable<K> r0 = r1.key
                return r0
        }

        @Override // java.util.Map.Entry
        public /* bridge */ /* synthetic */ java.lang.Object getKey() {
                r1 = this;
                java.lang.Comparable r0 = r1.getKey()
                return r0
        }

        @Override // java.util.Map.Entry
        public V getValue() {
                r1 = this;
                V r0 = r1.value
                return r0
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
                r3 = this;
                K extends java.lang.Comparable<K> r0 = r3.key
                r1 = 0
                if (r0 != 0) goto L7
                r0 = r1
                goto Lb
            L7:
                int r0 = r0.hashCode()
            Lb:
                V r2 = r3.value
                if (r2 != 0) goto L10
                goto L14
            L10:
                int r1 = r2.hashCode()
            L14:
                r0 = r0 ^ r1
                return r0
        }

        @Override // java.util.Map.Entry
        public V setValue(V r2) {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = r1.this$0
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap.access$300(r0)
                V r0 = r1.value
                r1.value = r2
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                K extends java.lang.Comparable<K> r1 = r2.key
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "="
                java.lang.StringBuilder r0 = r0.append(r1)
                V r1 = r2.value
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    private class EntryIterator implements java.util.Iterator<java.util.Map.Entry<K, V>> {
        private java.util.Iterator<java.util.Map.Entry<K, V>> lazyOverflowIterator;
        private boolean nextCalledBeforeRemove;
        private int pos;
        final /* synthetic */ com.google.crypto.tink.shaded.protobuf.SmallSortedMap this$0;

        private EntryIterator(com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = -1
                r0.pos = r1
                return
        }

        /* synthetic */ EntryIterator(com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1, com.google.crypto.tink.shaded.protobuf.SmallSortedMap.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private java.util.Iterator<java.util.Map.Entry<K, V>> getOverflowIterator() {
                r1 = this;
                java.util.Iterator<java.util.Map$Entry<K extends java.lang.Comparable<K>, V>> r0 = r1.lazyOverflowIterator
                if (r0 != 0) goto L14
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = r1.this$0
                java.util.Map r0 = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.access$700(r0)
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                r1.lazyOverflowIterator = r0
            L14:
                java.util.Iterator<java.util.Map$Entry<K extends java.lang.Comparable<K>, V>> r0 = r1.lazyOverflowIterator
                return r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r3 = this;
                int r0 = r3.pos
                r1 = 1
                int r0 = r0 + r1
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r2 = r3.this$0
                java.util.List r2 = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.access$600(r2)
                int r2 = r2.size()
                if (r0 < r2) goto L28
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = r3.this$0
                java.util.Map r0 = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.access$700(r0)
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L27
                java.util.Iterator r0 = r3.getOverflowIterator()
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L27
                goto L28
            L27:
                r1 = 0
            L28:
                return r1
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                java.util.Map$Entry r0 = r1.next()
                return r0
        }

        @Override // java.util.Iterator
        public java.util.Map.Entry<K, V> next() {
                r2 = this;
                r0 = 1
                r2.nextCalledBeforeRemove = r0
                int r1 = r2.pos
                int r1 = r1 + r0
                r2.pos = r1
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = r2.this$0
                java.util.List r0 = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.access$600(r0)
                int r0 = r0.size()
                if (r1 >= r0) goto L23
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = r2.this$0
                java.util.List r0 = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.access$600(r0)
                int r1 = r2.pos
                java.lang.Object r0 = r0.get(r1)
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                return r0
            L23:
                java.util.Iterator r0 = r2.getOverflowIterator()
                java.lang.Object r0 = r0.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r3 = this;
                boolean r0 = r3.nextCalledBeforeRemove
                if (r0 == 0) goto L2e
                r0 = 0
                r3.nextCalledBeforeRemove = r0
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = r3.this$0
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap.access$300(r0)
                int r0 = r3.pos
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1 = r3.this$0
                java.util.List r1 = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.access$600(r1)
                int r1 = r1.size()
                if (r0 >= r1) goto L26
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = r3.this$0
                int r1 = r3.pos
                int r2 = r1 + (-1)
                r3.pos = r2
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap.access$800(r0, r1)
                goto L2d
            L26:
                java.util.Iterator r0 = r3.getOverflowIterator()
                r0.remove()
            L2d:
                return
            L2e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "remove() was called before next()"
                r0.<init>(r1)
                throw r0
        }
    }

    private class EntrySet extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {
        final /* synthetic */ com.google.crypto.tink.shaded.protobuf.SmallSortedMap this$0;

        private EntrySet(com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ EntrySet(com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1, com.google.crypto.tink.shaded.protobuf.SmallSortedMap.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public /* bridge */ /* synthetic */ boolean add(java.lang.Object r1) {
                r0 = this;
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                boolean r1 = r0.add(r1)
                return r1
        }

        public boolean add(java.util.Map.Entry<K, V> r3) {
                r2 = this;
                boolean r0 = r2.contains(r3)
                if (r0 != 0) goto L17
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = r2.this$0
                java.lang.Object r1 = r3.getKey()
                java.lang.Comparable r1 = (java.lang.Comparable) r1
                java.lang.Object r3 = r3.getValue()
                r0.put(r1, r3)
                r3 = 1
                return r3
            L17:
                r3 = 0
                return r3
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = r1.this$0
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object r3) {
                r2 = this;
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = r2.this$0
                java.lang.Object r1 = r3.getKey()
                java.lang.Object r0 = r0.get(r1)
                java.lang.Object r3 = r3.getValue()
                if (r0 == r3) goto L1d
                if (r0 == 0) goto L1b
                boolean r3 = r0.equals(r3)
                if (r3 == 0) goto L1b
                goto L1d
            L1b:
                r3 = 0
                goto L1e
            L1d:
                r3 = 1
            L1e:
                return r3
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                r3 = this;
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap$EntryIterator r0 = new com.google.crypto.tink.shaded.protobuf.SmallSortedMap$EntryIterator
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1 = r3.this$0
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object r2) {
                r1 = this;
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                boolean r0 = r1.contains(r2)
                if (r0 == 0) goto L13
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = r1.this$0
                java.lang.Object r2 = r2.getKey()
                r0.remove(r2)
                r2 = 1
                return r2
            L13:
                r2 = 0
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = r1.this$0
                int r0 = r0.size()
                return r0
        }
    }

    private SmallSortedMap(int r1) {
            r0 = this;
            r0.<init>()
            r0.maxArraySize = r1
            java.util.List r1 = java.util.Collections.emptyList()
            r0.entryList = r1
            java.util.Map r1 = java.util.Collections.emptyMap()
            r0.overflowEntries = r1
            java.util.Map r1 = java.util.Collections.emptyMap()
            r0.overflowEntriesDescending = r1
            return
    }

    /* synthetic */ SmallSortedMap(int r1, com.google.crypto.tink.shaded.protobuf.SmallSortedMap.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static /* synthetic */ void access$300(com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0) {
            r0.checkMutable()
            return
    }

    static /* synthetic */ java.util.List access$600(com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0) {
            java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$Entry> r0 = r0.entryList
            return r0
    }

    static /* synthetic */ java.util.Map access$700(com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0) {
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r0.overflowEntries
            return r0
    }

    static /* synthetic */ java.lang.Object access$800(com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0, int r1) {
            java.lang.Object r0 = r0.removeArrayEntryAt(r1)
            return r0
    }

    static /* synthetic */ java.util.Map access$900(com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0) {
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r0.overflowEntriesDescending
            return r0
    }

    private int binarySearchInArray(K r5) {
            r4 = this;
            java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$Entry> r0 = r4.entryList
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L23
            java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$Entry> r2 = r4.entryList
            java.lang.Object r2 = r2.get(r1)
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap$Entry r2 = (com.google.crypto.tink.shaded.protobuf.SmallSortedMap.Entry) r2
            java.lang.Comparable r2 = r2.getKey()
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L20
            int r0 = r0 + 1
        L1e:
            int r5 = -r0
            return r5
        L20:
            if (r2 != 0) goto L23
            return r1
        L23:
            r0 = 0
        L24:
            if (r0 > r1) goto L47
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$Entry> r3 = r4.entryList
            java.lang.Object r3 = r3.get(r2)
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap$Entry r3 = (com.google.crypto.tink.shaded.protobuf.SmallSortedMap.Entry) r3
            java.lang.Comparable r3 = r3.getKey()
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L40
            int r2 = r2 + (-1)
            r1 = r2
            goto L24
        L40:
            if (r3 <= 0) goto L46
            int r2 = r2 + 1
            r0 = r2
            goto L24
        L46:
            return r2
        L47:
            int r0 = r0 + 1
            goto L1e
    }

    private void checkMutable() {
            r1 = this;
            boolean r0 = r1.isImmutable
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    private void ensureEntryArrayMutable() {
            r2 = this;
            r2.checkMutable()
            java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$Entry> r0 = r2.entryList
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1a
            java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$Entry> r0 = r2.entryList
            boolean r0 = r0 instanceof java.util.ArrayList
            if (r0 != 0) goto L1a
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.maxArraySize
            r0.<init>(r1)
            r2.entryList = r0
        L1a:
            return
    }

    private java.util.SortedMap<K, V> getOverflowEntriesMutable() {
            r2 = this;
            r2.checkMutable()
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r2.overflowEntries
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L21
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r2.overflowEntries
            boolean r0 = r0 instanceof java.util.TreeMap
            if (r0 != 0) goto L21
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            r2.overflowEntries = r0
            r1 = r0
            java.util.TreeMap r1 = (java.util.TreeMap) r1
            java.util.NavigableMap r0 = r0.descendingMap()
            r2.overflowEntriesDescending = r0
        L21:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r2.overflowEntries
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            return r0
    }

    static <FieldDescriptorType extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<FieldDescriptorType>> com.google.crypto.tink.shaded.protobuf.SmallSortedMap<FieldDescriptorType, java.lang.Object> newFieldMap(int r1) {
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap$1 r0 = new com.google.crypto.tink.shaded.protobuf.SmallSortedMap$1
            r0.<init>(r1)
            return r0
    }

    static <K extends java.lang.Comparable<K>, V> com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V> newInstanceForTest(int r1) {
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = new com.google.crypto.tink.shaded.protobuf.SmallSortedMap
            r0.<init>(r1)
            return r0
    }

    private V removeArrayEntryAt(int r5) {
            r4 = this;
            r4.checkMutable()
            java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$Entry> r0 = r4.entryList
            java.lang.Object r5 = r0.remove(r5)
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap$Entry r5 = (com.google.crypto.tink.shaded.protobuf.SmallSortedMap.Entry) r5
            java.lang.Object r5 = r5.getValue()
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r4.overflowEntries
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L36
            java.util.SortedMap r0 = r4.getOverflowEntriesMutable()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$Entry> r1 = r4.entryList
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap$Entry r2 = new com.google.crypto.tink.shaded.protobuf.SmallSortedMap$Entry
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            r2.<init>(r4, r3)
            r1.add(r2)
            r0.remove()
        L36:
            return r5
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
            r1 = this;
            r1.checkMutable()
            java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$Entry> r0 = r1.entryList
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L10
            java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$Entry> r0 = r1.entryList
            r0.clear()
        L10:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.overflowEntries
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1d
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.overflowEntries
            r0.clear()
        L1d:
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object r2) {
            r1 = this;
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r0 = r1.binarySearchInArray(r2)
            if (r0 >= 0) goto L13
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.overflowEntries
            boolean r2 = r0.containsKey(r2)
            if (r2 == 0) goto L11
            goto L13
        L11:
            r2 = 0
            goto L14
        L13:
            r2 = 1
        L14:
            return r2
    }

    java.util.Set<java.util.Map.Entry<K, V>> descendingEntrySet() {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$DescendingEntrySet r0 = r2.lazyDescendingEntrySet
            if (r0 != 0) goto Lc
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap$DescendingEntrySet r0 = new com.google.crypto.tink.shaded.protobuf.SmallSortedMap$DescendingEntrySet
            r1 = 0
            r0.<init>(r2, r1)
            r2.lazyDescendingEntrySet = r0
        Lc:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$DescendingEntrySet r0 = r2.lazyDescendingEntrySet
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$EntrySet r0 = r2.lazyEntrySet
            if (r0 != 0) goto Lc
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap$EntrySet r0 = new com.google.crypto.tink.shaded.protobuf.SmallSortedMap$EntrySet
            r1 = 0
            r0.<init>(r2, r1)
            r2.lazyEntrySet = r0
        Lc:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$EntrySet r0 = r2.lazyEntrySet
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.crypto.tink.shaded.protobuf.SmallSortedMap
            if (r1 != 0) goto Ld
            boolean r8 = super.equals(r8)
            return r8
        Ld:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap r8 = (com.google.crypto.tink.shaded.protobuf.SmallSortedMap) r8
            int r1 = r7.size()
            int r2 = r8.size()
            r3 = 0
            if (r1 == r2) goto L1b
            return r3
        L1b:
            int r2 = r7.getNumArrayEntries()
            int r4 = r8.getNumArrayEntries()
            if (r2 == r4) goto L32
            java.util.Set r0 = r7.entrySet()
            java.util.Set r8 = r8.entrySet()
            boolean r8 = r0.equals(r8)
            return r8
        L32:
            r4 = r3
        L33:
            if (r4 >= r2) goto L47
            java.util.Map$Entry r5 = r7.getArrayEntryAt(r4)
            java.util.Map$Entry r6 = r8.getArrayEntryAt(r4)
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L44
            return r3
        L44:
            int r4 = r4 + 1
            goto L33
        L47:
            if (r2 == r1) goto L52
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r7.overflowEntries
            java.util.Map<K extends java.lang.Comparable<K>, V> r8 = r8.overflowEntries
            boolean r8 = r0.equals(r8)
            return r8
        L52:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(java.lang.Object r2) {
            r1 = this;
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r0 = r1.binarySearchInArray(r2)
            if (r0 < 0) goto L15
            java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$Entry> r2 = r1.entryList
            java.lang.Object r2 = r2.get(r0)
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap$Entry r2 = (com.google.crypto.tink.shaded.protobuf.SmallSortedMap.Entry) r2
            java.lang.Object r2 = r2.getValue()
            return r2
        L15:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.overflowEntries
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    public java.util.Map.Entry<K, V> getArrayEntryAt(int r2) {
            r1 = this;
            java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$Entry> r0 = r1.entryList
            java.lang.Object r2 = r0.get(r2)
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            return r2
    }

    public int getNumArrayEntries() {
            r1 = this;
            java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$Entry> r0 = r1.entryList
            int r0 = r0.size()
            return r0
    }

    public int getNumOverflowEntries() {
            r1 = this;
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.overflowEntries
            int r0 = r0.size()
            return r0
    }

    public java.lang.Iterable<java.util.Map.Entry<K, V>> getOverflowEntries() {
            r1 = this;
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.overflowEntries
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            java.lang.Iterable r0 = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.EmptySet.iterable()
            goto L13
        Ld:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.overflowEntries
            java.util.Set r0 = r0.entrySet()
        L13:
            return r0
    }

    java.lang.Iterable<java.util.Map.Entry<K, V>> getOverflowEntriesDescending() {
            r1 = this;
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.overflowEntriesDescending
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            java.lang.Iterable r0 = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.EmptySet.iterable()
            goto L13
        Ld:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.overflowEntriesDescending
            java.util.Set r0 = r0.entrySet()
        L13:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
            r4 = this;
            int r0 = r4.getNumArrayEntries()
            r1 = 0
            r2 = r1
        L6:
            if (r1 >= r0) goto L18
            java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$Entry> r3 = r4.entryList
            java.lang.Object r3 = r3.get(r1)
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap$Entry r3 = (com.google.crypto.tink.shaded.protobuf.SmallSortedMap.Entry) r3
            int r3 = r3.hashCode()
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L6
        L18:
            int r0 = r4.getNumOverflowEntries()
            if (r0 <= 0) goto L25
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r4.overflowEntries
            int r0 = r0.hashCode()
            int r2 = r2 + r0
        L25:
            return r2
    }

    public boolean isImmutable() {
            r1 = this;
            boolean r0 = r1.isImmutable
            return r0
    }

    public void makeImmutable() {
            r1 = this;
            boolean r0 = r1.isImmutable
            if (r0 != 0) goto L31
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.overflowEntries
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L11
            java.util.Map r0 = java.util.Collections.emptyMap()
            goto L17
        L11:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.overflowEntries
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
        L17:
            r1.overflowEntries = r0
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.overflowEntriesDescending
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L26
            java.util.Map r0 = java.util.Collections.emptyMap()
            goto L2c
        L26:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.overflowEntriesDescending
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
        L2c:
            r1.overflowEntriesDescending = r0
            r0 = 1
            r1.isImmutable = r0
        L31:
            return
    }

    public V put(K r5, V r6) {
            r4 = this;
            r4.checkMutable()
            int r0 = r4.binarySearchInArray(r5)
            if (r0 < 0) goto L16
            java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$Entry> r5 = r4.entryList
            java.lang.Object r5 = r5.get(r0)
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap$Entry r5 = (com.google.crypto.tink.shaded.protobuf.SmallSortedMap.Entry) r5
            java.lang.Object r5 = r5.setValue(r6)
            return r5
        L16:
            r4.ensureEntryArrayMutable()
            int r0 = r0 + 1
            int r0 = -r0
            int r1 = r4.maxArraySize
            if (r0 < r1) goto L29
            java.util.SortedMap r0 = r4.getOverflowEntriesMutable()
            java.lang.Object r5 = r0.put(r5, r6)
            return r5
        L29:
            java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$Entry> r1 = r4.entryList
            int r1 = r1.size()
            int r2 = r4.maxArraySize
            if (r1 != r2) goto L4c
            java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$Entry> r1 = r4.entryList
            int r2 = r2 + (-1)
            java.lang.Object r1 = r1.remove(r2)
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap$Entry r1 = (com.google.crypto.tink.shaded.protobuf.SmallSortedMap.Entry) r1
            java.util.SortedMap r2 = r4.getOverflowEntriesMutable()
            java.lang.Comparable r3 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r2.put(r3, r1)
        L4c:
            java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$Entry> r1 = r4.entryList
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap$Entry r2 = new com.google.crypto.tink.shaded.protobuf.SmallSortedMap$Entry
            r2.<init>(r4, r5, r6)
            r1.add(r0, r2)
            r5 = 0
            return r5
    }

    @Override // java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Object r1 = r0.put(r1, r2)
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(java.lang.Object r2) {
            r1 = this;
            r1.checkMutable()
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r0 = r1.binarySearchInArray(r2)
            if (r0 < 0) goto L10
            java.lang.Object r2 = r1.removeArrayEntryAt(r0)
            return r2
        L10:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.overflowEntries
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1a
            r2 = 0
            return r2
        L1a:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.overflowEntries
            java.lang.Object r2 = r0.remove(r2)
            return r2
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
            r2 = this;
            java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$Entry> r0 = r2.entryList
            int r0 = r0.size()
            java.util.Map<K extends java.lang.Comparable<K>, V> r1 = r2.overflowEntries
            int r1 = r1.size()
            int r0 = r0 + r1
            return r0
    }
}
