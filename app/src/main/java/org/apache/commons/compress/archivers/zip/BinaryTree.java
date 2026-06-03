package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
final class BinaryTree {
    private static final int NODE = -2;
    private static final int UNDEFINED = -1;
    private final int[] tree;

    BinaryTree(int r5) {
            r4 = this;
            r4.<init>()
            if (r5 < 0) goto L1b
            r0 = 30
            if (r5 > r0) goto L1b
            int r5 = r5 + 1
            r0 = 1
            long r2 = r0 << r5
            long r2 = r2 - r0
            int r5 = (int) r2
            int[] r5 = new int[r5]
            r0 = -1
            int[] r5 = org.apache.commons.lang3.ArrayFill.fill(r5, r0)
            r4.tree = r5
            return
        L1b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "depth must be bigger than 0 and not bigger than 30 but is "
            r1.<init>(r2)
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
    }

    static org.apache.commons.compress.archivers.zip.BinaryTree decode(java.io.InputStream r11, int r12) throws java.io.IOException {
            if (r12 < 0) goto La8
            int r0 = r11.read()
            r1 = 1
            int r0 = r0 + r1
            if (r0 == 0) goto La0
            byte[] r11 = org.apache.commons.compress.utils.IOUtils.readRange(r11, r0)
            int r2 = r11.length
            if (r2 != r0) goto L9a
            int[] r0 = new int[r12]
            int r2 = r11.length
            r3 = 0
            r4 = r3
            r5 = r4
            r6 = r5
        L18:
            if (r4 >= r2) goto L42
            r7 = r11[r4]
            r8 = r7 & 240(0xf0, float:3.36E-43)
            int r8 = r8 >> 4
            int r8 = r8 + r1
            int r9 = r5 + r8
            if (r9 > r12) goto L3a
            r7 = r7 & 15
            int r7 = r7 + r1
            r9 = r3
        L29:
            if (r9 >= r8) goto L33
            int r10 = r5 + 1
            r0[r5] = r7
            int r9 = r9 + 1
            r5 = r10
            goto L29
        L33:
            int r6 = java.lang.Math.max(r6, r7)
            int r4 = r4 + 1
            goto L18
        L3a:
            java.io.IOException r11 = new java.io.IOException
            java.lang.String r12 = "Number of values exceeds given total number of values"
            r11.<init>(r12)
            throw r11
        L42:
            int[] r11 = new int[r12]
            r2 = r3
        L45:
            if (r2 >= r12) goto L4c
            r11[r2] = r2
            int r2 = r2 + 1
            goto L45
        L4c:
            int[] r2 = new int[r12]
            r4 = r3
            r5 = r4
        L50:
            if (r4 >= r12) goto L65
            r7 = r3
        L53:
            if (r7 >= r12) goto L62
            r8 = r0[r7]
            if (r8 != r4) goto L5f
            r2[r5] = r4
            r11[r5] = r7
            int r5 = r5 + 1
        L5f:
            int r7 = r7 + 1
            goto L53
        L62:
            int r4 = r4 + 1
            goto L50
        L65:
            int[] r4 = new int[r12]
            int r5 = r12 + (-1)
            r7 = r3
            r8 = r7
            r9 = r8
        L6c:
            if (r5 < 0) goto L7f
            int r7 = r7 + r8
            r10 = r2[r5]
            if (r10 == r9) goto L78
            int r8 = 16 - r10
            int r8 = r1 << r8
            r9 = r10
        L78:
            r10 = r11[r5]
            r4[r10] = r7
            int r5 = r5 + (-1)
            goto L6c
        L7f:
            org.apache.commons.compress.archivers.zip.BinaryTree r11 = new org.apache.commons.compress.archivers.zip.BinaryTree
            r11.<init>(r6)
            r1 = r3
        L85:
            if (r1 >= r12) goto L99
            r2 = r0[r1]
            if (r2 <= 0) goto L96
            r5 = r4[r1]
            int r5 = r5 << 16
            int r5 = java.lang.Integer.reverse(r5)
            r11.addLeaf(r3, r5, r2, r1)
        L96:
            int r1 = r1 + 1
            goto L85
        L99:
            return r11
        L9a:
            java.io.EOFException r11 = new java.io.EOFException
            r11.<init>()
            throw r11
        La0:
            java.io.IOException r11 = new java.io.IOException
            java.lang.String r12 = "Cannot read the size of the encoded tree, unexpected end of stream"
            r11.<init>(r12)
            throw r11
        La8:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "totalNumberOfValues must be bigger than 0, is "
            r0.<init>(r1)
            java.lang.StringBuilder r12 = r0.append(r12)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
    }

    public void addLeaf(int r3, int r4, int r5, int r6) {
            r2 = this;
            if (r5 != 0) goto L35
            int[] r4 = r2.tree
            r5 = r4[r3]
            r0 = -1
            if (r5 != r0) goto Lc
            r4[r3] = r6
            goto L48
        Lc:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Tree value at index "
            r5.<init>(r6)
            java.lang.StringBuilder r5 = r5.append(r3)
            java.lang.String r6 = " has already been assigned ("
            java.lang.StringBuilder r5 = r5.append(r6)
            int[] r6 = r2.tree
            r3 = r6[r3]
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.String r5 = ")"
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L35:
            int[] r0 = r2.tree
            r1 = -2
            r0[r3] = r1
            int r3 = r3 * 2
            int r3 = r3 + 1
            r0 = r4 & 1
            int r3 = r3 + r0
            int r4 = r4 >>> 1
            int r5 = r5 + (-1)
            r2.addLeaf(r3, r4, r5, r6)
        L48:
            return
    }

    public int read(org.apache.commons.compress.archivers.zip.BitStream r7) throws java.io.IOException {
            r6 = this;
            r0 = 0
        L1:
            int r1 = r7.nextBit()
            r2 = -1
            if (r1 != r2) goto L9
            return r2
        L9:
            int r3 = r0 * 2
            int r3 = r3 + 1
            int r3 = r3 + r1
            int[] r4 = r6.tree
            r4 = r4[r3]
            r5 = -2
            if (r4 != r5) goto L17
            r0 = r3
            goto L1
        L17:
            if (r4 == r2) goto L1a
            return r4
        L1a:
            java.io.IOException r7 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "The child "
            r2.<init>(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = " of node at index "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = " is not defined"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
    }
}
