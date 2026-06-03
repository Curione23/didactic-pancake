package org.apache.commons.compress.harmony.pack200;

/* JADX INFO: loaded from: classes2.dex */
public class IntList {
    private int[] array;
    private int firstIndex;
    private int lastIndex;
    private int modCount;

    public IntList() {
            r1 = this;
            r0 = 10
            r1.<init>(r0)
            return
    }

    public IntList(int r2) {
            r1 = this;
            r1.<init>()
            if (r2 < 0) goto Lf
            r0 = 0
            r1.lastIndex = r0
            r1.firstIndex = r0
            int[] r2 = new int[r2]
            r1.array = r2
            return
        Lf:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    private void growAtEnd(int r7) {
            r6 = this;
            int r0 = r6.lastIndex
            int r1 = r6.firstIndex
            int r2 = r0 - r1
            int[] r3 = r6.array
            int r4 = r3.length
            int r4 = r4 - r0
            int r4 = r7 - r4
            r5 = 0
            if (r1 < r4) goto L1a
            int r0 = r0 - r1
            if (r2 <= 0) goto L15
            java.lang.System.arraycopy(r3, r1, r3, r5, r2)
        L15:
            r6.firstIndex = r5
            r6.lastIndex = r0
            goto L33
        L1a:
            int r0 = r2 / 2
            if (r7 <= r0) goto L1f
            goto L20
        L1f:
            r7 = r0
        L20:
            r0 = 12
            if (r7 >= r0) goto L25
            r7 = r0
        L25:
            int r7 = r7 + r2
            int[] r7 = new int[r7]
            if (r2 <= 0) goto L31
            java.lang.System.arraycopy(r3, r1, r7, r5, r2)
            r6.firstIndex = r5
            r6.lastIndex = r2
        L31:
            r6.array = r7
        L33:
            return
    }

    private void growAtFront(int r6) {
            r5 = this;
            int r0 = r5.lastIndex
            int r1 = r5.firstIndex
            int r2 = r0 - r1
            int[] r3 = r5.array
            int r4 = r3.length
            int r4 = r4 - r0
            int r4 = r4 + r1
            if (r4 < r6) goto L1c
            int r6 = r3.length
            int r6 = r6 - r2
            if (r2 <= 0) goto L14
            java.lang.System.arraycopy(r3, r1, r3, r6, r2)
        L14:
            r5.firstIndex = r6
            int[] r6 = r5.array
            int r6 = r6.length
            r5.lastIndex = r6
            goto L39
        L1c:
            int r0 = r2 / 2
            if (r6 <= r0) goto L21
            goto L22
        L21:
            r6 = r0
        L22:
            r0 = 12
            if (r6 >= r0) goto L27
            r6 = r0
        L27:
            int r6 = r6 + r2
            int[] r0 = new int[r6]
            if (r2 <= 0) goto L31
            int r4 = r6 - r2
            java.lang.System.arraycopy(r3, r1, r0, r4, r2)
        L31:
            int r1 = r6 - r2
            r5.firstIndex = r1
            r5.lastIndex = r6
            r5.array = r0
        L39:
            return
    }

    private void growForInsert(int r8, int r9) {
            r7 = this;
            int r0 = r7.lastIndex
            int r1 = r7.firstIndex
            int r0 = r0 - r1
            int r2 = r0 / 2
            if (r9 <= r2) goto La
            r2 = r9
        La:
            r3 = 12
            if (r2 >= r3) goto Lf
            r2 = r3
        Lf:
            int r3 = r0 + r2
            int[] r4 = new int[r3]
            int r2 = r2 - r9
            int[] r5 = r7.array
            int r1 = r1 + r8
            int r6 = r2 + r8
            int r6 = r6 + r9
            int r0 = r0 - r8
            java.lang.System.arraycopy(r5, r1, r4, r6, r0)
            int[] r9 = r7.array
            int r0 = r7.firstIndex
            java.lang.System.arraycopy(r9, r0, r4, r2, r8)
            r7.firstIndex = r2
            r7.lastIndex = r3
            r7.array = r4
            return
    }

    public void add(int r7, int r8) {
            r6 = this;
            int r0 = r6.lastIndex
            int r1 = r6.firstIndex
            int r2 = r0 - r1
            r3 = 1
            if (r7 <= 0) goto L3f
            if (r7 >= r2) goto L3f
            if (r1 != 0) goto L16
            int[] r4 = r6.array
            int r4 = r4.length
            if (r0 != r4) goto L16
            r6.growForInsert(r7, r3)
            goto L37
        L16:
            int r4 = r2 / 2
            if (r7 >= r4) goto L1c
            if (r1 > 0) goto L21
        L1c:
            int[] r4 = r6.array
            int r5 = r4.length
            if (r0 != r5) goto L2b
        L21:
            int[] r0 = r6.array
            int r2 = r1 + (-1)
            r6.firstIndex = r2
            java.lang.System.arraycopy(r0, r1, r0, r2, r7)
            goto L37
        L2b:
            int r1 = r1 + r7
            int r0 = r1 + 1
            int r2 = r2 - r7
            java.lang.System.arraycopy(r4, r1, r4, r0, r2)
            int r0 = r6.lastIndex
            int r0 = r0 + r3
            r6.lastIndex = r0
        L37:
            int[] r0 = r6.array
            int r1 = r6.firstIndex
            int r7 = r7 + r1
            r0[r7] = r8
            goto L64
        L3f:
            if (r7 != 0) goto L50
            if (r1 != 0) goto L46
            r6.growAtFront(r3)
        L46:
            int[] r7 = r6.array
            int r0 = r6.firstIndex
            int r0 = r0 - r3
            r6.firstIndex = r0
            r7[r0] = r8
            goto L64
        L50:
            if (r7 != r2) goto L6a
            int[] r7 = r6.array
            int r7 = r7.length
            if (r0 != r7) goto L5a
            r6.growAtEnd(r3)
        L5a:
            int[] r7 = r6.array
            int r0 = r6.lastIndex
            int r1 = r0 + 1
            r6.lastIndex = r1
            r7[r0] = r8
        L64:
            int r7 = r6.modCount
            int r7 = r7 + r3
            r6.modCount = r7
            return
        L6a:
            java.lang.IndexOutOfBoundsException r7 = new java.lang.IndexOutOfBoundsException
            r7.<init>()
            throw r7
    }

    public boolean add(int r5) {
            r4 = this;
            int r0 = r4.lastIndex
            int[] r1 = r4.array
            int r1 = r1.length
            r2 = 1
            if (r0 != r1) goto Lb
            r4.growAtEnd(r2)
        Lb:
            int[] r0 = r4.array
            int r1 = r4.lastIndex
            int r3 = r1 + 1
            r4.lastIndex = r3
            r0[r1] = r5
            int r5 = r4.modCount
            int r5 = r5 + r2
            r4.modCount = r5
            return r2
    }

    public void addAll(org.apache.commons.compress.harmony.pack200.IntList r3) {
            r2 = this;
            int r0 = r3.size()
            r2.growAtEnd(r0)
            r0 = 0
        L8:
            int r1 = r3.size()
            if (r0 >= r1) goto L18
            int r1 = r3.get(r0)
            r2.add(r1)
            int r0 = r0 + 1
            goto L8
        L18:
            return
    }

    public void clear() {
            r4 = this;
            int r0 = r4.firstIndex
            int r1 = r4.lastIndex
            if (r0 == r1) goto L17
            int[] r2 = r4.array
            r3 = -1
            java.util.Arrays.fill(r2, r0, r1, r3)
            r0 = 0
            r4.lastIndex = r0
            r4.firstIndex = r0
            int r0 = r4.modCount
            int r0 = r0 + 1
            r4.modCount = r0
        L17:
            return
    }

    public int get(int r4) {
            r3 = this;
            if (r4 < 0) goto Lf
            int r0 = r3.lastIndex
            int r1 = r3.firstIndex
            int r0 = r0 - r1
            if (r4 >= r0) goto Lf
            int[] r0 = r3.array
            int r1 = r1 + r4
            r4 = r0[r1]
            return r4
        Lf:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ""
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public void increment(int r4) {
            r3 = this;
            if (r4 < 0) goto L13
            int r0 = r3.lastIndex
            int r1 = r3.firstIndex
            int r0 = r0 - r1
            if (r4 >= r0) goto L13
            int[] r0 = r3.array
            int r1 = r1 + r4
            r4 = r0[r1]
            int r4 = r4 + 1
            r0[r1] = r4
            return
        L13:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ""
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public boolean isEmpty() {
            r2 = this;
            int r0 = r2.lastIndex
            int r1 = r2.firstIndex
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public int remove(int r8) {
            r7 = this;
            int r0 = r7.lastIndex
            int r1 = r7.firstIndex
            int r2 = r0 - r1
            if (r8 < 0) goto L66
            if (r8 >= r2) goto L66
            int r3 = r2 + (-1)
            r4 = 0
            if (r8 != r3) goto L1a
            int[] r8 = r7.array
            int r0 = r0 + (-1)
            r7.lastIndex = r0
            r1 = r8[r0]
            r8[r0] = r4
            goto L55
        L1a:
            if (r8 != 0) goto L28
            int[] r8 = r7.array
            r0 = r8[r1]
            int r2 = r1 + 1
            r7.firstIndex = r2
            r8[r1] = r4
            r1 = r0
            goto L55
        L28:
            int r0 = r1 + r8
            int[] r3 = r7.array
            r5 = r3[r0]
            int r6 = r2 / 2
            if (r8 >= r6) goto L42
            int r0 = r1 + 1
            java.lang.System.arraycopy(r3, r1, r3, r0, r8)
            int[] r8 = r7.array
            int r0 = r7.firstIndex
            int r1 = r0 + 1
            r7.firstIndex = r1
            r8[r0] = r4
            goto L54
        L42:
            int r1 = r0 + 1
            int r2 = r2 - r8
            int r2 = r2 + (-1)
            java.lang.System.arraycopy(r3, r1, r3, r0, r2)
            int[] r8 = r7.array
            int r0 = r7.lastIndex
            int r0 = r0 + (-1)
            r7.lastIndex = r0
            r8[r0] = r4
        L54:
            r1 = r5
        L55:
            int r8 = r7.firstIndex
            int r0 = r7.lastIndex
            if (r8 != r0) goto L5f
            r7.lastIndex = r4
            r7.firstIndex = r4
        L5f:
            int r8 = r7.modCount
            int r8 = r8 + 1
            r7.modCount = r8
            return r1
        L66:
            java.lang.IndexOutOfBoundsException r8 = new java.lang.IndexOutOfBoundsException
            r8.<init>()
            throw r8
    }

    public int size() {
            r2 = this;
            int r0 = r2.lastIndex
            int r1 = r2.firstIndex
            int r0 = r0 - r1
            return r0
    }

    public int[] toArray() {
            r5 = this;
            int r0 = r5.lastIndex
            int r1 = r5.firstIndex
            int r0 = r0 - r1
            int[] r2 = new int[r0]
            int[] r3 = r5.array
            r4 = 0
            java.lang.System.arraycopy(r3, r1, r2, r4, r0)
            return r2
    }
}
