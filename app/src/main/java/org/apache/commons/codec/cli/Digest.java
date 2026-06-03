package org.apache.commons.codec.cli;

/* JADX INFO: loaded from: classes2.dex */
public class Digest {
    private final java.lang.String algorithm;
    private final java.lang.String[] args;
    private final java.lang.String[] inputs;

    private Digest(java.lang.String[] r3) {
            r2 = this;
            r2.<init>()
            java.util.Objects.requireNonNull(r3)
            int r0 = r3.length
            if (r0 == 0) goto L20
            r2.args = r3
            r1 = 0
            r1 = r3[r1]
            r2.algorithm = r1
            r1 = 1
            if (r0 > r1) goto L17
            r3 = 0
            r2.inputs = r3
            goto L1f
        L17:
            java.lang.Object[] r3 = java.util.Arrays.copyOfRange(r3, r1, r0)
            java.lang.String[] r3 = (java.lang.String[]) r3
            r2.inputs = r3
        L1f:
            return
        L20:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.Class<org.apache.commons.codec.cli.Digest> r0 = org.apache.commons.codec.cli.Digest.class
            java.lang.String r0 = r0.getName()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "Usage: java %s [algorithm] [FILE|DIRECTORY|string] ..."
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r3.<init>(r0)
            throw r3
    }

    public static void main(java.lang.String[] r1) throws java.io.IOException {
            org.apache.commons.codec.cli.Digest r0 = new org.apache.commons.codec.cli.Digest
            r0.<init>(r1)
            r0.run()
            return
    }

    private void println(java.lang.String r2, byte[] r3) {
            r1 = this;
            r0 = 0
            r1.println(r2, r3, r0)
            return
    }

    private void println(java.lang.String r3, byte[] r4, java.lang.String r5) {
            r2 = this;
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r4 = org.apache.commons.codec.binary.Hex.encodeHexString(r4)
            java.lang.StringBuilder r3 = r3.append(r4)
            if (r5 == 0) goto L25
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "  "
            r4.<init>(r1)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            goto L27
        L25:
            java.lang.String r4 = ""
        L27:
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.println(r3)
            return
    }

    private void run() throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = r3.algorithm
            java.lang.String r1 = "ALL"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L34
            java.lang.String r0 = r3.algorithm
            java.lang.String r1 = "*"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L15
            goto L34
        L15:
            java.lang.String r0 = r3.algorithm
            r1 = 0
            java.security.MessageDigest r0 = org.apache.commons.codec.digest.DigestUtils.getDigest(r0, r1)
            java.lang.String r1 = ""
            if (r0 == 0) goto L24
            r3.run(r1, r0)
            goto L33
        L24:
            java.lang.String r0 = r3.algorithm
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r2)
            java.security.MessageDigest r0 = org.apache.commons.codec.digest.DigestUtils.getDigest(r0)
            r3.run(r1, r0)
        L33:
            return
        L34:
            java.lang.String[] r0 = org.apache.commons.codec.digest.MessageDigestAlgorithms.values()
            r3.run(r0)
            return
    }

    private void run(java.lang.String r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            java.security.MessageDigest r2 = org.apache.commons.codec.digest.DigestUtils.getDigest(r2)
            r0.run(r1, r2)
            return
    }

    private void run(java.lang.String r7, java.security.MessageDigest r8) throws java.io.IOException {
            r6 = this;
            java.lang.String[] r0 = r6.inputs
            if (r0 != 0) goto Le
            java.io.InputStream r0 = java.lang.System.in
            byte[] r8 = org.apache.commons.codec.digest.DigestUtils.digest(r8, r0)
            r6.println(r7, r8)
            return
        Le:
            int r1 = r0.length
            r2 = 0
        L10:
            if (r2 >= r1) goto L49
            r3 = r0[r2]
            java.io.File r4 = new java.io.File
            r4.<init>(r3)
            boolean r5 = r4.isFile()
            if (r5 == 0) goto L27
            byte[] r4 = org.apache.commons.codec.digest.DigestUtils.digest(r8, r4)
            r6.println(r7, r4, r3)
            goto L46
        L27:
            boolean r5 = r4.isDirectory()
            if (r5 == 0) goto L37
            java.io.File[] r3 = r4.listFiles()
            if (r3 == 0) goto L46
            r6.run(r7, r8, r3)
            goto L46
        L37:
            java.nio.charset.Charset r4 = java.nio.charset.Charset.defaultCharset()
            byte[] r3 = r3.getBytes(r4)
            byte[] r3 = org.apache.commons.codec.digest.DigestUtils.digest(r8, r3)
            r6.println(r7, r3)
        L46:
            int r2 = r2 + 1
            goto L10
        L49:
            return
    }

    private void run(java.lang.String r5, java.security.MessageDigest r6, java.io.File[] r7) throws java.io.IOException {
            r4 = this;
            int r0 = r7.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L1a
            r2 = r7[r1]
            boolean r3 = r2.isFile()
            if (r3 == 0) goto L17
            byte[] r3 = org.apache.commons.codec.digest.DigestUtils.digest(r6, r2)
            java.lang.String r2 = r2.getName()
            r4.println(r5, r3, r2)
        L17:
            int r1 = r1 + 1
            goto L2
        L1a:
            return
    }

    private void run(java.lang.String[] r6) throws java.io.IOException {
            r5 = this;
            int r0 = r6.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L25
            r2 = r6[r1]
            boolean r3 = org.apache.commons.codec.digest.DigestUtils.isAvailable(r2)
            if (r3 == 0) goto L22
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r4 = " "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r5.run(r3, r2)
        L22:
            int r1 = r1 + 1
            goto L2
        L25:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = super.toString()
            java.lang.String[] r1 = r2.args
            java.lang.String r1 = java.util.Arrays.toString(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "%s %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }
}
