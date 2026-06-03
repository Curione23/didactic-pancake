package org.apache.commons.compress.harmony.pack200;

/* JADX INFO: loaded from: classes2.dex */
public class Archive {
    private static final byte[] EMPTY_BYTE_ARRAY = null;
    private long currentSegmentSize;
    private java.util.jar.JarFile jarFile;
    private final java.util.jar.JarInputStream jarInputStream;
    private final org.apache.commons.compress.harmony.pack200.PackingOptions options;
    private final java.io.OutputStream outputStream;

    static class PackingFile {
        private byte[] contents;
        private final boolean deflateHint;
        private final boolean isDirectory;
        private final long modtime;
        private final java.lang.String name;

        PackingFile(java.lang.String r1, byte[] r2, long r3) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                r0.contents = r2
                r0.modtime = r3
                r1 = 0
                r0.deflateHint = r1
                r0.isDirectory = r1
                return
        }

        PackingFile(byte[] r3, java.util.jar.JarEntry r4) {
                r2 = this;
                r2.<init>()
                java.lang.String r0 = r4.getName()
                r2.name = r0
                r2.contents = r3
                long r0 = r4.getTime()
                r2.modtime = r0
                int r3 = r4.getMethod()
                r0 = 8
                if (r3 != r0) goto L1b
                r3 = 1
                goto L1c
            L1b:
                r3 = 0
            L1c:
                r2.deflateHint = r3
                boolean r3 = r4.isDirectory()
                r2.isDirectory = r3
                return
        }

        static /* synthetic */ byte[] access$000(org.apache.commons.compress.harmony.pack200.Archive.PackingFile r0) {
                byte[] r0 = r0.contents
                return r0
        }

        static /* synthetic */ byte[] access$002(org.apache.commons.compress.harmony.pack200.Archive.PackingFile r0, byte[] r1) {
                r0.contents = r1
                return r1
        }

        public byte[] getContents() {
                r1 = this;
                byte[] r0 = r1.contents
                return r0
        }

        public long getModtime() {
                r2 = this;
                long r0 = r2.modtime
                return r0
        }

        public java.lang.String getName() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }

        public boolean isDefalteHint() {
                r1 = this;
                boolean r0 = r1.deflateHint
                return r0
        }

        public boolean isDirectory() {
                r1 = this;
                boolean r0 = r1.isDirectory
                return r0
        }

        public void setContents(byte[] r1) {
                r0 = this;
                r0.contents = r1
                return
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }
    }

    static class SegmentUnit {
        private int byteAmount;
        private final java.util.List<org.apache.commons.compress.harmony.pack200.Pack200ClassReader> classList;
        private final java.util.List<org.apache.commons.compress.harmony.pack200.Archive.PackingFile> fileList;
        private int packedByteAmount;

        SegmentUnit(java.util.List<org.apache.commons.compress.harmony.pack200.Pack200ClassReader> r2, java.util.List<org.apache.commons.compress.harmony.pack200.Archive.PackingFile> r3) {
                r1 = this;
                r1.<init>()
                r1.classList = r2
                r1.fileList = r3
                r0 = 0
                r1.byteAmount = r0
                java.util.stream.Stream r2 = r2.stream()
                org.apache.commons.compress.harmony.pack200.Archive$SegmentUnit$$ExternalSyntheticLambda0 r0 = new org.apache.commons.compress.harmony.pack200.Archive$SegmentUnit$$ExternalSyntheticLambda0
                r0.<init>()
                java.util.stream.IntStream r2 = r2.mapToInt(r0)
                int r2 = r2.sum()
                r1.byteAmount = r2
                java.util.stream.Stream r3 = r3.stream()
                org.apache.commons.compress.harmony.pack200.Archive$SegmentUnit$$ExternalSyntheticLambda1 r0 = new org.apache.commons.compress.harmony.pack200.Archive$SegmentUnit$$ExternalSyntheticLambda1
                r0.<init>()
                java.util.stream.IntStream r3 = r3.mapToInt(r0)
                int r3 = r3.sum()
                int r2 = r2 + r3
                r1.byteAmount = r2
                return
        }

        static /* synthetic */ int lambda$new$0(org.apache.commons.compress.harmony.pack200.Pack200ClassReader r0) {
                byte[] r0 = r0.b
                int r0 = r0.length
                return r0
        }

        static /* synthetic */ int lambda$new$1(org.apache.commons.compress.harmony.pack200.Archive.PackingFile r0) {
                byte[] r0 = org.apache.commons.compress.harmony.pack200.Archive.PackingFile.access$000(r0)
                int r0 = r0.length
                return r0
        }

        public void addPackedByteAmount(int r2) {
                r1 = this;
                int r0 = r1.packedByteAmount
                int r0 = r0 + r2
                r1.packedByteAmount = r0
                return
        }

        public int classListSize() {
                r1 = this;
                java.util.List<org.apache.commons.compress.harmony.pack200.Pack200ClassReader> r0 = r1.classList
                int r0 = r0.size()
                return r0
        }

        public int fileListSize() {
                r1 = this;
                java.util.List<org.apache.commons.compress.harmony.pack200.Archive$PackingFile> r0 = r1.fileList
                int r0 = r0.size()
                return r0
        }

        public int getByteAmount() {
                r1 = this;
                int r0 = r1.byteAmount
                return r0
        }

        public java.util.List<org.apache.commons.compress.harmony.pack200.Pack200ClassReader> getClassList() {
                r1 = this;
                java.util.List<org.apache.commons.compress.harmony.pack200.Pack200ClassReader> r0 = r1.classList
                return r0
        }

        public java.util.List<org.apache.commons.compress.harmony.pack200.Archive.PackingFile> getFileList() {
                r1 = this;
                java.util.List<org.apache.commons.compress.harmony.pack200.Archive$PackingFile> r0 = r1.fileList
                return r0
        }

        public int getPackedByteAmount() {
                r1 = this;
                int r0 = r1.packedByteAmount
                return r0
        }
    }

    static {
            r0 = 0
            byte[] r0 = new byte[r0]
            org.apache.commons.compress.harmony.pack200.Archive.EMPTY_BYTE_ARRAY = r0
            return
    }

    public Archive(java.util.jar.JarFile r2, java.io.OutputStream r3, org.apache.commons.compress.harmony.pack200.PackingOptions r4) throws java.io.IOException {
            r1 = this;
            r1.<init>()
            if (r4 != 0) goto La
            org.apache.commons.compress.harmony.pack200.PackingOptions r4 = new org.apache.commons.compress.harmony.pack200.PackingOptions
            r4.<init>()
        La:
            r1.options = r4
            boolean r0 = r4.isGzip()
            if (r0 == 0) goto L18
            java.util.zip.GZIPOutputStream r0 = new java.util.zip.GZIPOutputStream
            r0.<init>(r3)
            r3 = r0
        L18:
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream
            r0.<init>(r3)
            r1.outputStream = r0
            r1.jarFile = r2
            r2 = 0
            r1.jarInputStream = r2
            org.apache.commons.compress.harmony.pack200.PackingUtils.config(r4)
            return
    }

    public Archive(java.util.jar.JarInputStream r1, java.io.OutputStream r2, org.apache.commons.compress.harmony.pack200.PackingOptions r3) throws java.io.IOException {
            r0 = this;
            r0.<init>()
            r0.jarInputStream = r1
            if (r3 != 0) goto Lc
            org.apache.commons.compress.harmony.pack200.PackingOptions r3 = new org.apache.commons.compress.harmony.pack200.PackingOptions
            r3.<init>()
        Lc:
            r0.options = r3
            boolean r1 = r3.isGzip()
            if (r1 == 0) goto L1a
            java.util.zip.GZIPOutputStream r1 = new java.util.zip.GZIPOutputStream
            r1.<init>(r2)
            r2 = r1
        L1a:
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream
            r1.<init>(r2)
            r0.outputStream = r1
            org.apache.commons.compress.harmony.pack200.PackingUtils.config(r3)
            return
    }

    private boolean addJarEntry(org.apache.commons.compress.harmony.pack200.Archive.PackingFile r11, java.util.List<org.apache.commons.compress.harmony.pack200.Pack200ClassReader> r12, java.util.List<org.apache.commons.compress.harmony.pack200.Archive.PackingFile> r13) {
            r10 = this;
            org.apache.commons.compress.harmony.pack200.PackingOptions r0 = r10.options
            long r0 = r0.getSegmentLimit()
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L27
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L27
            long r4 = r10.estimateSize(r11)
            long r6 = r10.currentSegmentSize
            long r8 = r4 + r6
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 <= 0) goto L24
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto L24
            r11 = 0
            return r11
        L24:
            long r6 = r6 + r4
            r10.currentSegmentSize = r6
        L27:
            java.lang.String r0 = r11.getName()
            java.lang.String r1 = ".class"
            boolean r1 = r0.endsWith(r1)
            if (r1 == 0) goto L4f
            org.apache.commons.compress.harmony.pack200.PackingOptions r1 = r10.options
            boolean r1 = r1.isPassFile(r0)
            if (r1 != 0) goto L4f
            org.apache.commons.compress.harmony.pack200.Pack200ClassReader r1 = new org.apache.commons.compress.harmony.pack200.Pack200ClassReader
            byte[] r2 = org.apache.commons.compress.harmony.pack200.Archive.PackingFile.access$000(r11)
            r1.<init>(r2)
            r1.setFileName(r0)
            r12.add(r1)
            byte[] r12 = org.apache.commons.compress.harmony.pack200.Archive.EMPTY_BYTE_ARRAY
            org.apache.commons.compress.harmony.pack200.Archive.PackingFile.access$002(r11, r12)
        L4f:
            r13.add(r11)
            r11 = 1
            return r11
    }

    private void doNormalPack() throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r10 = this;
            java.lang.String r0 = "Start to perform a normal packing"
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.jar.JarInputStream r0 = r10.jarInputStream
            if (r0 == 0) goto L14
            org.apache.commons.compress.harmony.pack200.PackingOptions r1 = r10.options
            boolean r1 = r1.isKeepFileOrder()
            java.util.List r0 = org.apache.commons.compress.harmony.pack200.PackingUtils.getPackingFileListFromJar(r0, r1)
            goto L20
        L14:
            java.util.jar.JarFile r0 = r10.jarFile
            org.apache.commons.compress.harmony.pack200.PackingOptions r1 = r10.options
            boolean r1 = r1.isKeepFileOrder()
            java.util.List r0 = org.apache.commons.compress.harmony.pack200.PackingUtils.getPackingFileListFromJar(r0, r1)
        L20:
            java.util.List r1 = r10.splitIntoSegments(r0)
            int r2 = r1.size()
            r3 = 0
            r4 = r3
            r5 = r4
        L2b:
            if (r3 >= r2) goto L4c
            java.lang.Object r6 = r1.get(r3)
            org.apache.commons.compress.harmony.pack200.Archive$SegmentUnit r6 = (org.apache.commons.compress.harmony.pack200.Archive.SegmentUnit) r6
            org.apache.commons.compress.harmony.pack200.Segment r7 = new org.apache.commons.compress.harmony.pack200.Segment
            r7.<init>()
            java.io.OutputStream r8 = r10.outputStream
            org.apache.commons.compress.harmony.pack200.PackingOptions r9 = r10.options
            r7.pack(r6, r8, r9)
            int r7 = r6.getByteAmount()
            int r4 = r4 + r7
            int r6 = r6.getPackedByteAmount()
            int r5 = r5 + r6
            int r3 = r3 + 1
            goto L2b
        L4c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Total: Packed "
            r1.<init>(r3)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r3 = " input bytes of "
            java.lang.StringBuilder r1 = r1.append(r3)
            int r0 = r0.size()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = " files into "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r1 = " bytes in "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r1 = " segments"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.io.OutputStream r0 = r10.outputStream
            r0.close()
            return
    }

    private void doZeroEffortPack() throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "Start to perform a zero-effort packing"
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.jar.JarInputStream r0 = r2.jarInputStream
            if (r0 == 0) goto Lf
            java.io.OutputStream r1 = r2.outputStream
            org.apache.commons.compress.harmony.pack200.PackingUtils.copyThroughJar(r0, r1)
            goto L16
        Lf:
            java.util.jar.JarFile r0 = r2.jarFile
            java.io.OutputStream r1 = r2.outputStream
            org.apache.commons.compress.harmony.pack200.PackingUtils.copyThroughJar(r0, r1)
        L16:
            return
    }

    private long estimateSize(org.apache.commons.compress.harmony.pack200.Archive.PackingFile r7) {
            r6 = this;
            java.lang.String r0 = r7.getName()
            java.lang.String r1 = "META-INF"
            boolean r1 = r0.startsWith(r1)
            r2 = 0
            if (r1 != 0) goto L2d
            java.lang.String r1 = "/META-INF"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L17
            goto L2d
        L17:
            byte[] r7 = org.apache.commons.compress.harmony.pack200.Archive.PackingFile.access$000(r7)
            int r7 = r7.length
            long r4 = (long) r7
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 >= 0) goto L22
            goto L23
        L22:
            r2 = r4
        L23:
            int r7 = r0.length()
            long r0 = (long) r7
            long r0 = r0 + r2
            r2 = 5
            long r0 = r0 + r2
            return r0
        L2d:
            return r2
    }

    private java.util.List<org.apache.commons.compress.harmony.pack200.Archive.SegmentUnit> splitIntoSegments(java.util.List<org.apache.commons.compress.harmony.pack200.Archive.PackingFile> r12) {
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            org.apache.commons.compress.harmony.pack200.PackingOptions r3 = r11.options
            long r3 = r3.getSegmentLimit()
            int r5 = r12.size()
            r6 = 0
        L1a:
            if (r6 >= r5) goto L65
            java.lang.Object r7 = r12.get(r6)
            org.apache.commons.compress.harmony.pack200.Archive$PackingFile r7 = (org.apache.commons.compress.harmony.pack200.Archive.PackingFile) r7
            boolean r8 = r11.addJarEntry(r7, r1, r2)
            r9 = 0
            if (r8 != 0) goto L44
            org.apache.commons.compress.harmony.pack200.Archive$SegmentUnit r8 = new org.apache.commons.compress.harmony.pack200.Archive$SegmentUnit
            r8.<init>(r1, r2)
            r0.add(r8)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r11.currentSegmentSize = r9
            r11.addJarEntry(r7, r1, r2)
            r11.currentSegmentSize = r9
            goto L62
        L44:
            int r8 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r8 != 0) goto L62
            long r7 = r11.estimateSize(r7)
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 <= 0) goto L62
            org.apache.commons.compress.harmony.pack200.Archive$SegmentUnit r7 = new org.apache.commons.compress.harmony.pack200.Archive$SegmentUnit
            r7.<init>(r1, r2)
            r0.add(r7)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L62:
            int r6 = r6 + 1
            goto L1a
        L65:
            int r12 = r1.size()
            if (r12 > 0) goto L71
            int r12 = r2.size()
            if (r12 <= 0) goto L79
        L71:
            org.apache.commons.compress.harmony.pack200.Archive$SegmentUnit r12 = new org.apache.commons.compress.harmony.pack200.Archive$SegmentUnit
            r12.<init>(r1, r2)
            r0.add(r12)
        L79:
            return r0
    }

    public void pack() throws org.apache.commons.compress.harmony.pack200.Pack200Exception, java.io.IOException {
            r1 = this;
            org.apache.commons.compress.harmony.pack200.PackingOptions r0 = r1.options
            int r0 = r0.getEffort()
            if (r0 != 0) goto Lc
            r1.doZeroEffortPack()
            goto Lf
        Lc:
            r1.doNormalPack()
        Lf:
            return
    }
}
