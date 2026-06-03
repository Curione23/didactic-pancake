package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes2.dex */
public class CharSetUtils {
    @java.lang.Deprecated
    public CharSetUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean containsAny(java.lang.String r4, java.lang.String... r5) {
            boolean r0 = org.apache.commons.lang3.StringUtils.isEmpty(r4)
            r1 = 0
            if (r0 != 0) goto L27
            boolean r0 = deepEmpty(r5)
            if (r0 == 0) goto Le
            goto L27
        Le:
            org.apache.commons.lang3.CharSet r5 = org.apache.commons.lang3.CharSet.getInstance(r5)
            char[] r4 = r4.toCharArray()
            int r0 = r4.length
            r2 = r1
        L18:
            if (r2 >= r0) goto L27
            char r3 = r4[r2]
            boolean r3 = r5.contains(r3)
            if (r3 == 0) goto L24
            r4 = 1
            return r4
        L24:
            int r2 = r2 + 1
            goto L18
        L27:
            return r1
    }

    public static int count(java.lang.String r4, java.lang.String... r5) {
            boolean r0 = org.apache.commons.lang3.StringUtils.isEmpty(r4)
            r1 = 0
            if (r0 != 0) goto L28
            boolean r0 = deepEmpty(r5)
            if (r0 == 0) goto Le
            goto L28
        Le:
            org.apache.commons.lang3.CharSet r5 = org.apache.commons.lang3.CharSet.getInstance(r5)
            char[] r4 = r4.toCharArray()
            int r0 = r4.length
            r2 = r1
        L18:
            if (r1 >= r0) goto L27
            char r3 = r4[r1]
            boolean r3 = r5.contains(r3)
            if (r3 == 0) goto L24
            int r2 = r2 + 1
        L24:
            int r1 = r1 + 1
            goto L18
        L27:
            return r2
        L28:
            return r1
    }

    private static boolean deepEmpty(java.lang.String[] r1) {
            java.util.stream.Stream r1 = org.apache.commons.lang3.stream.Streams.of(r1)
            org.apache.commons.lang3.CharSetUtils$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.CharSetUtils$$ExternalSyntheticLambda0
            r0.<init>()
            boolean r1 = r1.allMatch(r0)
            return r1
    }

    public static java.lang.String delete(java.lang.String r1, java.lang.String... r2) {
            boolean r0 = org.apache.commons.lang3.StringUtils.isEmpty(r1)
            if (r0 != 0) goto L12
            boolean r0 = deepEmpty(r2)
            if (r0 == 0) goto Ld
            goto L12
        Ld:
            r0 = 0
            java.lang.String r1 = modify(r1, r2, r0)
        L12:
            return r1
    }

    public static java.lang.String keep(java.lang.String r1, java.lang.String... r2) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L17
            boolean r0 = deepEmpty(r2)
            if (r0 == 0) goto L11
            goto L17
        L11:
            r0 = 1
            java.lang.String r1 = modify(r1, r2, r0)
            return r1
        L17:
            java.lang.String r1 = ""
            return r1
    }

    private static java.lang.String modify(java.lang.String r5, java.lang.String[] r6, boolean r7) {
            org.apache.commons.lang3.CharSet r6 = org.apache.commons.lang3.CharSet.getInstance(r6)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r5.length()
            r0.<init>(r1)
            char[] r5 = r5.toCharArray()
            int r1 = r5.length
            r2 = 0
        L13:
            if (r2 >= r1) goto L23
            char r3 = r5[r2]
            boolean r4 = r6.contains(r3)
            if (r4 != r7) goto L20
            r0.append(r3)
        L20:
            int r2 = r2 + 1
            goto L13
        L23:
            java.lang.String r5 = r0.toString()
            return r5
    }

    public static java.lang.String squeeze(java.lang.String r8, java.lang.String... r9) {
            boolean r0 = org.apache.commons.lang3.StringUtils.isEmpty(r8)
            if (r0 != 0) goto L59
            boolean r0 = deepEmpty(r9)
            if (r0 == 0) goto Ld
            goto L59
        Ld:
            org.apache.commons.lang3.CharSet r9 = org.apache.commons.lang3.CharSet.getInstance(r9)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r8.length()
            r0.<init>(r1)
            char[] r8 = r8.toCharArray()
            int r1 = r8.length
            r2 = 0
            char r2 = r8[r2]
            r0.append(r2)
            r3 = 1
            r4 = 0
            r5 = r4
        L28:
            if (r3 >= r1) goto L55
            char r6 = r8[r3]
            if (r6 != r2) goto L4e
            if (r4 == 0) goto L37
            char r7 = r4.charValue()
            if (r6 != r7) goto L37
            goto L52
        L37:
            if (r5 == 0) goto L3f
            char r7 = r5.charValue()
            if (r6 == r7) goto L4e
        L3f:
            boolean r7 = r9.contains(r6)
            if (r7 == 0) goto L4a
            java.lang.Character r4 = java.lang.Character.valueOf(r6)
            goto L52
        L4a:
            java.lang.Character r5 = java.lang.Character.valueOf(r6)
        L4e:
            r0.append(r6)
            r2 = r6
        L52:
            int r3 = r3 + 1
            goto L28
        L55:
            java.lang.String r8 = r0.toString()
        L59:
            return r8
    }
}
