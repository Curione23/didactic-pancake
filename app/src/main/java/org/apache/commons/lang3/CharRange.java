package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes2.dex */
final class CharRange implements java.lang.Iterable<java.lang.Character>, java.io.Serializable {
    static final org.apache.commons.lang3.CharRange[] EMPTY_ARRAY = null;
    private static final long serialVersionUID = 8270183163158333422L;
    private final char end;
    private transient java.lang.String iToString;
    private final boolean negated;
    private final char start;

    /* JADX INFO: renamed from: org.apache.commons.lang3.CharRange$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static final class CharacterIterator implements java.util.Iterator<java.lang.Character> {
        private char current;
        private boolean hasNext;
        private final org.apache.commons.lang3.CharRange range;

        private CharacterIterator(org.apache.commons.lang3.CharRange r5) {
                r4 = this;
                r4.<init>()
                r4.range = r5
                r0 = 1
                r4.hasNext = r0
                boolean r1 = org.apache.commons.lang3.CharRange.access$000(r5)
                if (r1 == 0) goto L2d
                char r1 = org.apache.commons.lang3.CharRange.access$100(r5)
                r2 = 0
                if (r1 != 0) goto L2a
                char r1 = org.apache.commons.lang3.CharRange.access$200(r5)
                r3 = 65535(0xffff, float:9.1834E-41)
                if (r1 != r3) goto L21
                r4.hasNext = r2
                goto L33
            L21:
                char r5 = org.apache.commons.lang3.CharRange.access$200(r5)
                int r5 = r5 + r0
                char r5 = (char) r5
                r4.current = r5
                goto L33
            L2a:
                r4.current = r2
                goto L33
            L2d:
                char r5 = org.apache.commons.lang3.CharRange.access$100(r5)
                r4.current = r5
            L33:
                return
        }

        /* synthetic */ CharacterIterator(org.apache.commons.lang3.CharRange r1, org.apache.commons.lang3.CharRange.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void prepareNext() {
                r4 = this;
                org.apache.commons.lang3.CharRange r0 = r4.range
                boolean r0 = org.apache.commons.lang3.CharRange.access$000(r0)
                r1 = 0
                if (r0 == 0) goto L3c
                char r0 = r4.current
                r2 = 65535(0xffff, float:9.1834E-41)
                if (r0 != r2) goto L13
                r4.hasNext = r1
                goto L50
            L13:
                int r0 = r0 + 1
                org.apache.commons.lang3.CharRange r3 = r4.range
                char r3 = org.apache.commons.lang3.CharRange.access$100(r3)
                if (r0 != r3) goto L34
                org.apache.commons.lang3.CharRange r0 = r4.range
                char r0 = org.apache.commons.lang3.CharRange.access$200(r0)
                if (r0 != r2) goto L28
                r4.hasNext = r1
                goto L50
            L28:
                org.apache.commons.lang3.CharRange r0 = r4.range
                char r0 = org.apache.commons.lang3.CharRange.access$200(r0)
                int r0 = r0 + 1
                char r0 = (char) r0
                r4.current = r0
                goto L50
            L34:
                char r0 = r4.current
                int r0 = r0 + 1
                char r0 = (char) r0
                r4.current = r0
                goto L50
            L3c:
                char r0 = r4.current
                org.apache.commons.lang3.CharRange r2 = r4.range
                char r2 = org.apache.commons.lang3.CharRange.access$200(r2)
                if (r0 >= r2) goto L4e
                char r0 = r4.current
                int r0 = r0 + 1
                char r0 = (char) r0
                r4.current = r0
                goto L50
            L4e:
                r4.hasNext = r1
            L50:
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                boolean r0 = r1.hasNext
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public java.lang.Character next() {
                r1 = this;
                boolean r0 = r1.hasNext
                if (r0 == 0) goto Le
                char r0 = r1.current
                r1.prepareNext()
                java.lang.Character r0 = java.lang.Character.valueOf(r0)
                return r0
            Le:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Character next() {
                r1 = this;
                java.lang.Character r0 = r1.next()
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

    static {
            r0 = 0
            org.apache.commons.lang3.CharRange[] r0 = new org.apache.commons.lang3.CharRange[r0]
            org.apache.commons.lang3.CharRange.EMPTY_ARRAY = r0
            return
    }

    private CharRange(char r2, char r3, boolean r4) {
            r1 = this;
            r1.<init>()
            if (r2 <= r3) goto L8
            r0 = r3
            r3 = r2
            r2 = r0
        L8:
            r1.start = r2
            r1.end = r3
            r1.negated = r4
            return
    }

    static /* synthetic */ boolean access$000(org.apache.commons.lang3.CharRange r0) {
            boolean r0 = r0.negated
            return r0
    }

    static /* synthetic */ char access$100(org.apache.commons.lang3.CharRange r0) {
            char r0 = r0.start
            return r0
    }

    static /* synthetic */ char access$200(org.apache.commons.lang3.CharRange r0) {
            char r0 = r0.end
            return r0
    }

    public static org.apache.commons.lang3.CharRange is(char r2) {
            org.apache.commons.lang3.CharRange r0 = new org.apache.commons.lang3.CharRange
            r1 = 0
            r0.<init>(r2, r2, r1)
            return r0
    }

    public static org.apache.commons.lang3.CharRange isIn(char r2, char r3) {
            org.apache.commons.lang3.CharRange r0 = new org.apache.commons.lang3.CharRange
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static org.apache.commons.lang3.CharRange isNot(char r2) {
            org.apache.commons.lang3.CharRange r0 = new org.apache.commons.lang3.CharRange
            r1 = 1
            r0.<init>(r2, r2, r1)
            return r0
    }

    public static org.apache.commons.lang3.CharRange isNotIn(char r2, char r3) {
            org.apache.commons.lang3.CharRange r0 = new org.apache.commons.lang3.CharRange
            r1 = 1
            r0.<init>(r2, r3, r1)
            return r0
    }

    public boolean contains(char r4) {
            r3 = this;
            char r0 = r3.start
            r1 = 1
            r2 = 0
            if (r4 < r0) goto Lc
            char r0 = r3.end
            if (r4 > r0) goto Lc
            r4 = r1
            goto Ld
        Lc:
            r4 = r2
        Ld:
            boolean r0 = r3.negated
            if (r4 == r0) goto L12
            goto L13
        L12:
            r1 = r2
        L13:
            return r1
    }

    public boolean contains(org.apache.commons.lang3.CharRange r5) {
            r4 = this;
            java.lang.String r0 = "range"
            java.util.Objects.requireNonNull(r5, r0)
            boolean r0 = r4.negated
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2d
            boolean r0 = r5.negated
            if (r0 == 0) goto L1e
            char r0 = r4.start
            char r3 = r5.start
            if (r0 < r3) goto L1c
            char r0 = r4.end
            char r5 = r5.end
            if (r0 > r5) goto L1c
            goto L1d
        L1c:
            r1 = r2
        L1d:
            return r1
        L1e:
            char r0 = r5.end
            char r3 = r4.start
            if (r0 < r3) goto L2c
            char r5 = r5.start
            char r0 = r4.end
            if (r5 <= r0) goto L2b
            goto L2c
        L2b:
            r1 = r2
        L2c:
            return r1
        L2d:
            boolean r0 = r5.negated
            if (r0 == 0) goto L3f
            char r5 = r4.start
            if (r5 != 0) goto L3d
            char r5 = r4.end
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r0) goto L3d
            goto L3e
        L3d:
            r1 = r2
        L3e:
            return r1
        L3f:
            char r0 = r4.start
            char r3 = r5.start
            if (r0 > r3) goto L4c
            char r0 = r4.end
            char r5 = r5.end
            if (r0 < r5) goto L4c
            goto L4d
        L4c:
            r1 = r2
        L4d:
            return r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof org.apache.commons.lang3.CharRange
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            org.apache.commons.lang3.CharRange r5 = (org.apache.commons.lang3.CharRange) r5
            char r1 = r4.start
            char r3 = r5.start
            if (r1 != r3) goto L1f
            char r1 = r4.end
            char r3 = r5.end
            if (r1 != r3) goto L1f
            boolean r1 = r4.negated
            boolean r5 = r5.negated
            if (r1 != r5) goto L1f
            goto L20
        L1f:
            r0 = r2
        L20:
            return r0
    }

    public char getEnd() {
            r1 = this;
            char r0 = r1.end
            return r0
    }

    public char getStart() {
            r1 = this;
            char r0 = r1.start
            return r0
    }

    public int hashCode() {
            r2 = this;
            char r0 = r2.start
            int r0 = r0 + 83
            char r1 = r2.end
            int r1 = r1 * 7
            int r0 = r0 + r1
            boolean r1 = r2.negated
            int r0 = r0 + r1
            return r0
    }

    public boolean isNegated() {
            r1 = this;
            boolean r0 = r1.negated
            return r0
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<java.lang.Character> iterator() {
            r2 = this;
            org.apache.commons.lang3.CharRange$CharacterIterator r0 = new org.apache.commons.lang3.CharRange$CharacterIterator
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = r3.iToString
            if (r0 != 0) goto L30
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 4
            r0.<init>(r1)
            boolean r1 = r3.isNegated()
            if (r1 == 0) goto L15
            r1 = 94
            r0.append(r1)
        L15:
            char r1 = r3.start
            r0.append(r1)
            char r1 = r3.start
            char r2 = r3.end
            if (r1 == r2) goto L2a
            r1 = 45
            r0.append(r1)
            char r1 = r3.end
            r0.append(r1)
        L2a:
            java.lang.String r0 = r0.toString()
            r3.iToString = r0
        L30:
            java.lang.String r0 = r3.iToString
            return r0
    }
}
