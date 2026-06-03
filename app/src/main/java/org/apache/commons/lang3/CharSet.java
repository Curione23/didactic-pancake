package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes2.dex */
public class CharSet implements java.io.Serializable {
    public static final org.apache.commons.lang3.CharSet ASCII_ALPHA = null;
    public static final org.apache.commons.lang3.CharSet ASCII_ALPHA_LOWER = null;
    public static final org.apache.commons.lang3.CharSet ASCII_ALPHA_UPPER = null;
    public static final org.apache.commons.lang3.CharSet ASCII_NUMERIC = null;
    protected static final java.util.Map<java.lang.String, org.apache.commons.lang3.CharSet> COMMON = null;
    public static final org.apache.commons.lang3.CharSet EMPTY = null;
    private static final long serialVersionUID = 5947847346149275958L;
    private final java.util.Set<org.apache.commons.lang3.CharRange> set;

    static {
            org.apache.commons.lang3.CharSet r0 = new org.apache.commons.lang3.CharSet
            r1 = 1
            java.lang.String[] r2 = new java.lang.String[r1]
            r3 = 0
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            r4 = 0
            r2[r4] = r3
            r0.<init>(r2)
            org.apache.commons.lang3.CharSet.EMPTY = r0
            org.apache.commons.lang3.CharSet r2 = new org.apache.commons.lang3.CharSet
            java.lang.String[] r5 = new java.lang.String[r1]
            java.lang.String r6 = "a-zA-Z"
            r5[r4] = r6
            r2.<init>(r5)
            org.apache.commons.lang3.CharSet.ASCII_ALPHA = r2
            org.apache.commons.lang3.CharSet r5 = new org.apache.commons.lang3.CharSet
            java.lang.String[] r7 = new java.lang.String[r1]
            java.lang.String r8 = "a-z"
            r7[r4] = r8
            r5.<init>(r7)
            org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER = r5
            org.apache.commons.lang3.CharSet r7 = new org.apache.commons.lang3.CharSet
            java.lang.String[] r9 = new java.lang.String[r1]
            java.lang.String r10 = "A-Z"
            r9[r4] = r10
            r7.<init>(r9)
            org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER = r7
            org.apache.commons.lang3.CharSet r9 = new org.apache.commons.lang3.CharSet
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r11 = "0-9"
            r1[r4] = r11
            r9.<init>(r1)
            org.apache.commons.lang3.CharSet.ASCII_NUMERIC = r9
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Map r1 = java.util.Collections.synchronizedMap(r1)
            org.apache.commons.lang3.CharSet.COMMON = r1
            r1.put(r3, r0)
            java.lang.String r3 = ""
            r1.put(r3, r0)
            r1.put(r6, r2)
            java.lang.String r0 = "A-Za-z"
            r1.put(r0, r2)
            r1.put(r8, r5)
            r1.put(r10, r7)
            r1.put(r11, r9)
            return
    }

    protected CharSet(java.lang.String... r2) {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Set r0 = java.util.Collections.synchronizedSet(r0)
            r1.set = r0
            java.util.stream.Stream r2 = java.util.stream.Stream.of(r2)
            org.apache.commons.lang3.CharSet$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.CharSet$$ExternalSyntheticLambda0
            r0.<init>(r1)
            r2.forEach(r0)
            return
    }

    public static org.apache.commons.lang3.CharSet getInstance(java.lang.String... r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            int r0 = r2.length
            r1 = 1
            if (r0 != r1) goto L16
            java.util.Map<java.lang.String, org.apache.commons.lang3.CharSet> r0 = org.apache.commons.lang3.CharSet.COMMON
            r1 = 0
            r1 = r2[r1]
            java.lang.Object r0 = r0.get(r1)
            org.apache.commons.lang3.CharSet r0 = (org.apache.commons.lang3.CharSet) r0
            if (r0 == 0) goto L16
            return r0
        L16:
            org.apache.commons.lang3.CharSet r0 = new org.apache.commons.lang3.CharSet
            r0.<init>(r2)
            return r0
    }

    static /* synthetic */ boolean lambda$contains$0(char r0, org.apache.commons.lang3.CharRange r1) {
            boolean r0 = r1.contains(r0)
            return r0
    }

    protected void add(java.lang.String r7) {
            r6 = this;
            if (r7 != 0) goto L3
            return
        L3:
            int r0 = r7.length()
            r1 = 0
        L8:
            if (r1 >= r0) goto L85
            int r2 = r0 - r1
            r3 = 45
            r4 = 94
            r5 = 4
            if (r2 < r5) goto L39
            char r5 = r7.charAt(r1)
            if (r5 != r4) goto L39
            int r5 = r1 + 2
            char r5 = r7.charAt(r5)
            if (r5 != r3) goto L39
            java.util.Set<org.apache.commons.lang3.CharRange> r2 = r6.set
            int r3 = r1 + 1
            char r3 = r7.charAt(r3)
            int r4 = r1 + 3
            char r4 = r7.charAt(r4)
            org.apache.commons.lang3.CharRange r3 = org.apache.commons.lang3.CharRange.isNotIn(r3, r4)
            r2.add(r3)
            int r1 = r1 + 4
            goto L8
        L39:
            r5 = 3
            if (r2 < r5) goto L5a
            int r5 = r1 + 1
            char r5 = r7.charAt(r5)
            if (r5 != r3) goto L5a
            java.util.Set<org.apache.commons.lang3.CharRange> r2 = r6.set
            char r3 = r7.charAt(r1)
            int r4 = r1 + 2
            char r4 = r7.charAt(r4)
            org.apache.commons.lang3.CharRange r3 = org.apache.commons.lang3.CharRange.isIn(r3, r4)
            r2.add(r3)
            int r1 = r1 + 3
            goto L8
        L5a:
            r3 = 2
            if (r2 < r3) goto L75
            char r2 = r7.charAt(r1)
            if (r2 != r4) goto L75
            java.util.Set<org.apache.commons.lang3.CharRange> r2 = r6.set
            int r3 = r1 + 1
            char r3 = r7.charAt(r3)
            org.apache.commons.lang3.CharRange r3 = org.apache.commons.lang3.CharRange.isNot(r3)
            r2.add(r3)
            int r1 = r1 + 2
            goto L8
        L75:
            java.util.Set<org.apache.commons.lang3.CharRange> r2 = r6.set
            char r3 = r7.charAt(r1)
            org.apache.commons.lang3.CharRange r3 = org.apache.commons.lang3.CharRange.is(r3)
            r2.add(r3)
            int r1 = r1 + 1
            goto L8
        L85:
            return
    }

    public boolean contains(char r4) {
            r3 = this;
            java.util.Set<org.apache.commons.lang3.CharRange> r0 = r3.set
            monitor-enter(r0)
            java.util.Set<org.apache.commons.lang3.CharRange> r1 = r3.set     // Catch: java.lang.Throwable -> L14
            java.util.stream.Stream r1 = r1.stream()     // Catch: java.lang.Throwable -> L14
            org.apache.commons.lang3.CharSet$$ExternalSyntheticLambda1 r2 = new org.apache.commons.lang3.CharSet$$ExternalSyntheticLambda1     // Catch: java.lang.Throwable -> L14
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L14
            boolean r4 = r1.anyMatch(r2)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return r4
        L14:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r4
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof org.apache.commons.lang3.CharSet
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            org.apache.commons.lang3.CharSet r2 = (org.apache.commons.lang3.CharSet) r2
            java.util.Set<org.apache.commons.lang3.CharRange> r0 = r1.set
            java.util.Set<org.apache.commons.lang3.CharRange> r2 = r2.set
            boolean r2 = r0.equals(r2)
            return r2
    }

    org.apache.commons.lang3.CharRange[] getCharRanges() {
            r2 = this;
            java.util.Set<org.apache.commons.lang3.CharRange> r0 = r2.set
            org.apache.commons.lang3.CharRange[] r1 = org.apache.commons.lang3.CharRange.EMPTY_ARRAY
            java.lang.Object[] r0 = r0.toArray(r1)
            org.apache.commons.lang3.CharRange[] r0 = (org.apache.commons.lang3.CharRange[]) r0
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.util.Set<org.apache.commons.lang3.CharRange> r0 = r1.set
            int r0 = r0.hashCode()
            int r0 = r0 + 89
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.util.Set<org.apache.commons.lang3.CharRange> r0 = r1.set
            java.lang.String r0 = r0.toString()
            return r0
    }
}
