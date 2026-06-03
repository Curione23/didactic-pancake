package org.apache.commons.lang3.text.translate;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class LookupTranslator extends org.apache.commons.lang3.text.translate.CharSequenceTranslator {
    private final int longest;
    private final java.util.HashMap<java.lang.String, java.lang.String> lookupMap;
    private final java.util.HashSet<java.lang.Character> prefixSet;
    private final int shortest;

    public LookupTranslator(java.lang.CharSequence[]... r10) {
            r9 = this;
            r9.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r9.lookupMap = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r9.prefixSet = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = 0
            if (r10 == 0) goto L4f
            int r2 = r10.length
            r3 = r1
            r4 = r3
        L1a:
            if (r3 >= r2) goto L4e
            r5 = r10[r3]
            java.util.HashMap<java.lang.String, java.lang.String> r6 = r9.lookupMap
            r7 = r5[r1]
            java.lang.String r7 = r7.toString()
            r8 = 1
            r8 = r5[r8]
            java.lang.String r8 = r8.toString()
            r6.put(r7, r8)
            java.util.HashSet<java.lang.Character> r6 = r9.prefixSet
            r7 = r5[r1]
            char r7 = r7.charAt(r1)
            java.lang.Character r7 = java.lang.Character.valueOf(r7)
            r6.add(r7)
            r5 = r5[r1]
            int r5 = r5.length()
            if (r5 >= r0) goto L48
            r0 = r5
        L48:
            if (r5 <= r4) goto L4b
            r4 = r5
        L4b:
            int r3 = r3 + 1
            goto L1a
        L4e:
            r1 = r4
        L4f:
            r9.shortest = r0
            r9.longest = r1
            return
    }

    @Override // org.apache.commons.lang3.text.translate.CharSequenceTranslator
    public int translate(java.lang.CharSequence r4, int r5, java.io.Writer r6) throws java.io.IOException {
            r3 = this;
            java.util.HashSet<java.lang.Character> r0 = r3.prefixSet
            char r1 = r4.charAt(r5)
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L3e
            int r0 = r3.longest
            int r1 = r5 + r0
            int r2 = r4.length()
            if (r1 <= r2) goto L1f
            int r0 = r4.length()
            int r0 = r0 - r5
        L1f:
            int r1 = r3.shortest
            if (r0 < r1) goto L3e
            int r1 = r5 + r0
            java.lang.CharSequence r1 = r4.subSequence(r5, r1)
            java.util.HashMap<java.lang.String, java.lang.String> r2 = r3.lookupMap
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r2.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L3b
            r6.write(r1)
            return r0
        L3b:
            int r0 = r0 + (-1)
            goto L1f
        L3e:
            r4 = 0
            return r4
    }
}
