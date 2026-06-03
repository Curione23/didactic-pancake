package org.apache.commons.compress.harmony.unpack200;

/* JADX INFO: loaded from: classes2.dex */
public class SegmentConstantPoolArrayCache {
    protected java.util.IdentityHashMap<java.lang.String[], org.apache.commons.compress.harmony.unpack200.SegmentConstantPoolArrayCache.CachedArray> knownArrays;
    protected java.lang.String[] lastArray;
    protected java.util.List<java.lang.Integer> lastIndexes;
    protected java.lang.String lastKey;

    protected class CachedArray {
        int lastKnownSize;
        java.lang.String[] primaryArray;
        java.util.HashMap<java.lang.String, java.util.List<java.lang.Integer>> primaryTable;
        final /* synthetic */ org.apache.commons.compress.harmony.unpack200.SegmentConstantPoolArrayCache this$0;

        public CachedArray(org.apache.commons.compress.harmony.unpack200.SegmentConstantPoolArrayCache r1, java.lang.String[] r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.primaryArray = r2
                int r1 = r2.length
                r0.lastKnownSize = r1
                java.util.HashMap r1 = new java.util.HashMap
                int r2 = r0.lastKnownSize
                r1.<init>(r2)
                r0.primaryTable = r1
                r0.cacheIndexes()
                return
        }

        static /* synthetic */ java.util.List lambda$cacheIndexes$0(java.lang.String r0) {
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                return r0
        }

        protected void cacheIndexes() {
                r4 = this;
                r0 = 0
            L1:
                java.lang.String[] r1 = r4.primaryArray
                int r2 = r1.length
                if (r0 >= r2) goto L1f
                r1 = r1[r0]
                java.util.HashMap<java.lang.String, java.util.List<java.lang.Integer>> r2 = r4.primaryTable
                org.apache.commons.compress.harmony.unpack200.SegmentConstantPoolArrayCache$CachedArray$$ExternalSyntheticLambda0 r3 = new org.apache.commons.compress.harmony.unpack200.SegmentConstantPoolArrayCache$CachedArray$$ExternalSyntheticLambda0
                r3.<init>()
                java.lang.Object r1 = r2.computeIfAbsent(r1, r3)
                java.util.List r1 = (java.util.List) r1
                java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
                r1.add(r2)
                int r0 = r0 + 1
                goto L1
            L1f:
                return
        }

        public java.util.List<java.lang.Integer> indexesForKey(java.lang.String r2) {
                r1 = this;
                java.util.HashMap<java.lang.String, java.util.List<java.lang.Integer>> r0 = r1.primaryTable
                java.lang.Object r2 = r0.get(r2)
                java.util.List r2 = (java.util.List) r2
                if (r2 == 0) goto Lb
                goto Lf
            Lb:
                java.util.List r2 = java.util.Collections.emptyList()
            Lf:
                return r2
        }

        public int lastKnownSize() {
                r1 = this;
                int r0 = r1.lastKnownSize
                return r0
        }
    }

    public SegmentConstantPoolArrayCache() {
            r2 = this;
            r2.<init>()
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.<init>(r1)
            r2.knownArrays = r0
            return
    }

    protected boolean arrayIsCached(java.lang.String[] r2) {
            r1 = this;
            java.util.IdentityHashMap<java.lang.String[], org.apache.commons.compress.harmony.unpack200.SegmentConstantPoolArrayCache$CachedArray> r0 = r1.knownArrays
            java.lang.Object r0 = r0.get(r2)
            org.apache.commons.compress.harmony.unpack200.SegmentConstantPoolArrayCache$CachedArray r0 = (org.apache.commons.compress.harmony.unpack200.SegmentConstantPoolArrayCache.CachedArray) r0
            if (r0 == 0) goto L13
            int r0 = r0.lastKnownSize()
            int r2 = r2.length
            if (r0 != r2) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            return r2
    }

    protected void cacheArray(java.lang.String[] r3) {
            r2 = this;
            boolean r0 = r2.arrayIsCached(r3)
            if (r0 != 0) goto L14
            java.util.IdentityHashMap<java.lang.String[], org.apache.commons.compress.harmony.unpack200.SegmentConstantPoolArrayCache$CachedArray> r0 = r2.knownArrays
            org.apache.commons.compress.harmony.unpack200.SegmentConstantPoolArrayCache$CachedArray r1 = new org.apache.commons.compress.harmony.unpack200.SegmentConstantPoolArrayCache$CachedArray
            r1.<init>(r2, r3)
            r0.put(r3, r1)
            r3 = 0
            r2.lastArray = r3
            return
        L14:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Trying to cache an array that already exists"
            r3.<init>(r0)
            throw r3
    }

    public java.util.List<java.lang.Integer> indexesForArrayKey(java.lang.String[] r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = r1.arrayIsCached(r2)
            if (r0 != 0) goto L9
            r1.cacheArray(r2)
        L9:
            java.lang.String[] r0 = r1.lastArray
            if (r0 != r2) goto L14
            java.lang.String r0 = r1.lastKey
            if (r0 != r3) goto L14
            java.util.List<java.lang.Integer> r2 = r1.lastIndexes
            return r2
        L14:
            r1.lastArray = r2
            r1.lastKey = r3
            java.util.IdentityHashMap<java.lang.String[], org.apache.commons.compress.harmony.unpack200.SegmentConstantPoolArrayCache$CachedArray> r0 = r1.knownArrays
            java.lang.Object r2 = r0.get(r2)
            org.apache.commons.compress.harmony.unpack200.SegmentConstantPoolArrayCache$CachedArray r2 = (org.apache.commons.compress.harmony.unpack200.SegmentConstantPoolArrayCache.CachedArray) r2
            java.util.List r2 = r2.indexesForKey(r3)
            r1.lastIndexes = r2
            return r2
    }
}
