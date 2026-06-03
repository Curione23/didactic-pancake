package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
public class Tailer implements java.lang.Runnable, java.lang.AutoCloseable {
    private static final java.nio.charset.Charset DEFAULT_CHARSET = null;
    private static final int DEFAULT_DELAY_MILLIS = 1000;
    private static final java.lang.String RAF_READ_ONLY_MODE = "r";
    private final java.nio.charset.Charset charset;
    private final java.time.Duration delayDuration;
    private final byte[] inbuf;
    private final org.apache.commons.io.input.TailerListener listener;
    private final boolean reOpen;
    private volatile boolean run;
    private final boolean tailAtEnd;
    private final org.apache.commons.io.input.Tailer.Tailable tailable;

    /* JADX INFO: renamed from: org.apache.commons.io.input.Tailer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder extends org.apache.commons.io.build.AbstractStreamBuilder<org.apache.commons.io.input.Tailer, org.apache.commons.io.input.Tailer.Builder> {
        private static final java.time.Duration DEFAULT_DELAY_DURATION = null;
        private java.time.Duration delayDuration;
        private java.util.concurrent.ExecutorService executorService;
        private boolean reOpen;
        private boolean startThread;
        private boolean tailFromEnd;
        private org.apache.commons.io.input.Tailer.Tailable tailable;
        private org.apache.commons.io.input.TailerListener tailerListener;

        public static /* synthetic */ java.lang.Thread $r8$lambda$CurvmOD3ezs9AmkMzRx1dwR90vU(java.lang.Runnable r0) {
                java.lang.Thread r0 = newDaemonThread(r0)
                return r0
        }

        static {
                r0 = 1000(0x3e8, double:4.94E-321)
                java.time.Duration r0 = java.time.Duration.ofMillis(r0)
                org.apache.commons.io.input.Tailer.Builder.DEFAULT_DELAY_DURATION = r0
                return
        }

        public Builder() {
                r1 = this;
                r1.<init>()
                java.time.Duration r0 = org.apache.commons.io.input.Tailer.Builder.DEFAULT_DELAY_DURATION
                r1.delayDuration = r0
                r0 = 1
                r1.startThread = r0
                org.apache.commons.io.input.Tailer$Builder$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.input.Tailer$Builder$$ExternalSyntheticLambda0
                r0.<init>()
                java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor(r0)
                r1.executorService = r0
                return
        }

        private static java.lang.Thread newDaemonThread(java.lang.Runnable r2) {
                java.lang.Thread r0 = new java.lang.Thread
                java.lang.String r1 = "commons-io-tailer"
                r0.<init>(r2, r1)
                r2 = 1
                r0.setDaemon(r2)
                return r0
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public /* bridge */ /* synthetic */ java.lang.Object get() throws java.io.IOException {
                r1 = this;
                org.apache.commons.io.input.Tailer r0 = r1.get()
                return r0
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public org.apache.commons.io.input.Tailer get() {
                r10 = this;
                org.apache.commons.io.input.Tailer r9 = new org.apache.commons.io.input.Tailer
                org.apache.commons.io.input.Tailer$Tailable r1 = r10.tailable
                java.nio.charset.Charset r2 = r10.getCharset()
                org.apache.commons.io.input.TailerListener r3 = r10.tailerListener
                java.time.Duration r4 = r10.delayDuration
                boolean r5 = r10.tailFromEnd
                boolean r6 = r10.reOpen
                int r7 = r10.getBufferSize()
                r8 = 0
                r0 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                boolean r0 = r10.startThread
                if (r0 == 0) goto L22
                java.util.concurrent.ExecutorService r0 = r10.executorService
                r0.submit(r9)
            L22:
                return r9
        }

        public org.apache.commons.io.input.Tailer.Builder setDelayDuration(java.time.Duration r1) {
                r0 = this;
                if (r1 == 0) goto L3
                goto L5
            L3:
                java.time.Duration r1 = org.apache.commons.io.input.Tailer.Builder.DEFAULT_DELAY_DURATION
            L5:
                r0.delayDuration = r1
                return r0
        }

        public org.apache.commons.io.input.Tailer.Builder setExecutorService(java.util.concurrent.ExecutorService r2) {
                r1 = this;
                java.lang.String r0 = "executorService"
                java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
                java.util.concurrent.ExecutorService r2 = (java.util.concurrent.ExecutorService) r2
                r1.executorService = r2
                return r1
        }

        @Override // org.apache.commons.io.build.AbstractOriginSupplier
        protected /* bridge */ /* synthetic */ org.apache.commons.io.build.AbstractOriginSupplier setOrigin(org.apache.commons.io.build.AbstractOrigin r1) {
                r0 = this;
                org.apache.commons.io.input.Tailer$Builder r1 = r0.setOrigin(r1)
                return r1
        }

        @Override // org.apache.commons.io.build.AbstractOriginSupplier
        protected org.apache.commons.io.input.Tailer.Builder setOrigin(org.apache.commons.io.build.AbstractOrigin<?, ?> r5) {
                r4 = this;
                org.apache.commons.io.input.Tailer$TailablePath r0 = new org.apache.commons.io.input.Tailer$TailablePath
                java.nio.file.Path r1 = r5.getPath()
                r2 = 0
                java.nio.file.LinkOption[] r2 = new java.nio.file.LinkOption[r2]
                r3 = 0
                r0.<init>(r1, r2, r3)
                r4.setTailable(r0)
                org.apache.commons.io.build.AbstractOriginSupplier r5 = super.setOrigin(r5)
                org.apache.commons.io.input.Tailer$Builder r5 = (org.apache.commons.io.input.Tailer.Builder) r5
                return r5
        }

        public org.apache.commons.io.input.Tailer.Builder setReOpen(boolean r1) {
                r0 = this;
                r0.reOpen = r1
                return r0
        }

        public org.apache.commons.io.input.Tailer.Builder setStartThread(boolean r1) {
                r0 = this;
                r0.startThread = r1
                return r0
        }

        public org.apache.commons.io.input.Tailer.Builder setTailFromEnd(boolean r1) {
                r0 = this;
                r0.tailFromEnd = r1
                return r0
        }

        public org.apache.commons.io.input.Tailer.Builder setTailable(org.apache.commons.io.input.Tailer.Tailable r2) {
                r1 = this;
                java.lang.String r0 = "tailable"
                java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
                org.apache.commons.io.input.Tailer$Tailable r2 = (org.apache.commons.io.input.Tailer.Tailable) r2
                r1.tailable = r2
                return r1
        }

        public org.apache.commons.io.input.Tailer.Builder setTailerListener(org.apache.commons.io.input.TailerListener r2) {
                r1 = this;
                java.lang.String r0 = "tailerListener"
                java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
                org.apache.commons.io.input.TailerListener r2 = (org.apache.commons.io.input.TailerListener) r2
                r1.tailerListener = r2
                return r1
        }
    }

    private static final class RandomAccessFileBridge implements org.apache.commons.io.input.Tailer.RandomAccessResourceBridge {
        private final java.io.RandomAccessFile randomAccessFile;

        private RandomAccessFileBridge(java.io.File r2, java.lang.String r3) throws java.io.FileNotFoundException {
                r1 = this;
                r1.<init>()
                java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
                r0.<init>(r2, r3)
                r1.randomAccessFile = r0
                return
        }

        /* synthetic */ RandomAccessFileBridge(java.io.File r1, java.lang.String r2, org.apache.commons.io.input.Tailer.AnonymousClass1 r3) throws java.io.FileNotFoundException {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r1 = this;
                java.io.RandomAccessFile r0 = r1.randomAccessFile
                r0.close()
                return
        }

        @Override // org.apache.commons.io.input.Tailer.RandomAccessResourceBridge
        public long getPointer() throws java.io.IOException {
                r2 = this;
                java.io.RandomAccessFile r0 = r2.randomAccessFile
                long r0 = r0.getFilePointer()
                return r0
        }

        @Override // org.apache.commons.io.input.Tailer.RandomAccessResourceBridge
        public int read(byte[] r2) throws java.io.IOException {
                r1 = this;
                java.io.RandomAccessFile r0 = r1.randomAccessFile
                int r2 = r0.read(r2)
                return r2
        }

        @Override // org.apache.commons.io.input.Tailer.RandomAccessResourceBridge
        public void seek(long r2) throws java.io.IOException {
                r1 = this;
                java.io.RandomAccessFile r0 = r1.randomAccessFile
                r0.seek(r2)
                return
        }
    }

    public interface RandomAccessResourceBridge extends java.io.Closeable {
        long getPointer() throws java.io.IOException;

        int read(byte[] r1) throws java.io.IOException;

        void seek(long r1) throws java.io.IOException;
    }

    public interface Tailable {
        org.apache.commons.io.input.Tailer.RandomAccessResourceBridge getRandomAccess(java.lang.String r1) throws java.io.FileNotFoundException;

        boolean isNewer(java.nio.file.attribute.FileTime r1) throws java.io.IOException;

        java.nio.file.attribute.FileTime lastModifiedFileTime() throws java.io.IOException;

        long size() throws java.io.IOException;
    }

    private static final class TailablePath implements org.apache.commons.io.input.Tailer.Tailable {
        private final java.nio.file.LinkOption[] linkOptions;
        private final java.nio.file.Path path;

        private TailablePath(java.nio.file.Path r2, java.nio.file.LinkOption... r3) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "path"
                java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
                java.nio.file.Path r2 = (java.nio.file.Path) r2
                r1.path = r2
                r1.linkOptions = r3
                return
        }

        /* synthetic */ TailablePath(java.nio.file.Path r1, java.nio.file.LinkOption[] r2, org.apache.commons.io.input.Tailer.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        java.nio.file.Path getPath() {
                r1 = this;
                java.nio.file.Path r0 = r1.path
                return r0
        }

        @Override // org.apache.commons.io.input.Tailer.Tailable
        public org.apache.commons.io.input.Tailer.RandomAccessResourceBridge getRandomAccess(java.lang.String r4) throws java.io.FileNotFoundException {
                r3 = this;
                org.apache.commons.io.input.Tailer$RandomAccessFileBridge r0 = new org.apache.commons.io.input.Tailer$RandomAccessFileBridge
                java.nio.file.Path r1 = r3.path
                java.io.File r1 = r1.toFile()
                r2 = 0
                r0.<init>(r1, r4, r2)
                return r0
        }

        @Override // org.apache.commons.io.input.Tailer.Tailable
        public boolean isNewer(java.nio.file.attribute.FileTime r3) throws java.io.IOException {
                r2 = this;
                java.nio.file.Path r0 = r2.path
                java.nio.file.LinkOption[] r1 = r2.linkOptions
                boolean r3 = org.apache.commons.io.file.PathUtils.isNewer(r0, r3, r1)
                return r3
        }

        @Override // org.apache.commons.io.input.Tailer.Tailable
        public java.nio.file.attribute.FileTime lastModifiedFileTime() throws java.io.IOException {
                r2 = this;
                java.nio.file.Path r0 = r2.path
                java.nio.file.LinkOption[] r1 = r2.linkOptions
                java.nio.file.attribute.FileTime r0 = java.nio.file.Files.getLastModifiedTime(r0, r1)
                return r0
        }

        @Override // org.apache.commons.io.input.Tailer.Tailable
        public long size() throws java.io.IOException {
                r2 = this;
                java.nio.file.Path r0 = r2.path
                long r0 = java.nio.file.Files.size(r0)
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "TailablePath [file="
                r0.<init>(r1)
                java.nio.file.Path r1 = r2.path
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", linkOptions="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.nio.file.LinkOption[] r1 = r2.linkOptions
                java.lang.String r1 = java.util.Arrays.toString(r1)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "]"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            org.apache.commons.io.input.Tailer.DEFAULT_CHARSET = r0
            return
    }

    @java.lang.Deprecated
    public Tailer(java.io.File r9, java.nio.charset.Charset r10, org.apache.commons.io.input.TailerListener r11, long r12, boolean r14, boolean r15, int r16) {
            r8 = this;
            org.apache.commons.io.input.Tailer$TailablePath r1 = new org.apache.commons.io.input.Tailer$TailablePath
            java.nio.file.Path r0 = r9.toPath()
            r2 = 0
            java.nio.file.LinkOption[] r2 = new java.nio.file.LinkOption[r2]
            r3 = 0
            r1.<init>(r0, r2, r3)
            java.time.Duration r4 = java.time.Duration.ofMillis(r12)
            r0 = r8
            r2 = r10
            r3 = r11
            r5 = r14
            r6 = r15
            r7 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @java.lang.Deprecated
    public Tailer(java.io.File r3, org.apache.commons.io.input.TailerListener r4) {
            r2 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.<init>(r3, r4, r0)
            return
    }

    @java.lang.Deprecated
    public Tailer(java.io.File r7, org.apache.commons.io.input.TailerListener r8, long r9) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r5)
            return
    }

    @java.lang.Deprecated
    public Tailer(java.io.File r8, org.apache.commons.io.input.TailerListener r9, long r10, boolean r12) {
            r7 = this;
            r6 = 8192(0x2000, float:1.148E-41)
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r12
            r0.<init>(r1, r2, r3, r5, r6)
            return
    }

    @java.lang.Deprecated
    public Tailer(java.io.File r9, org.apache.commons.io.input.TailerListener r10, long r11, boolean r13, int r14) {
            r8 = this;
            r6 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r5 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r5, r6, r7)
            return
    }

    @java.lang.Deprecated
    public Tailer(java.io.File r9, org.apache.commons.io.input.TailerListener r10, long r11, boolean r13, boolean r14) {
            r8 = this;
            r7 = 8192(0x2000, float:1.148E-41)
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r5 = r13
            r6 = r14
            r0.<init>(r1, r2, r3, r5, r6, r7)
            return
    }

    @java.lang.Deprecated
    public Tailer(java.io.File r10, org.apache.commons.io.input.TailerListener r11, long r12, boolean r14, boolean r15, int r16) {
            r9 = this;
            java.nio.charset.Charset r2 = org.apache.commons.io.input.Tailer.DEFAULT_CHARSET
            r0 = r9
            r1 = r10
            r3 = r11
            r4 = r12
            r6 = r14
            r7 = r15
            r8 = r16
            r0.<init>(r1, r2, r3, r4, r6, r7, r8)
            return
    }

    private Tailer(org.apache.commons.io.input.Tailer.Tailable r2, java.nio.charset.Charset r3, org.apache.commons.io.input.TailerListener r4, java.time.Duration r5, boolean r6, boolean r7, int r8) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.run = r0
            java.lang.String r0 = "tailable"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            org.apache.commons.io.input.Tailer$Tailable r2 = (org.apache.commons.io.input.Tailer.Tailable) r2
            r1.tailable = r2
            java.lang.String r2 = "listener"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r4, r2)
            org.apache.commons.io.input.TailerListener r2 = (org.apache.commons.io.input.TailerListener) r2
            r1.listener = r2
            r1.delayDuration = r5
            r1.tailAtEnd = r6
            byte[] r2 = org.apache.commons.io.IOUtils.byteArray(r8)
            r1.inbuf = r2
            r4.init(r1)
            r1.reOpen = r7
            r1.charset = r3
            return
    }

    /* synthetic */ Tailer(org.apache.commons.io.input.Tailer.Tailable r1, java.nio.charset.Charset r2, org.apache.commons.io.input.TailerListener r3, java.time.Duration r4, boolean r5, boolean r6, int r7, org.apache.commons.io.input.Tailer.AnonymousClass1 r8) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static org.apache.commons.io.input.Tailer.Builder builder() {
            org.apache.commons.io.input.Tailer$Builder r0 = new org.apache.commons.io.input.Tailer$Builder
            r0.<init>()
            return r0
    }

    @java.lang.Deprecated
    public static org.apache.commons.io.input.Tailer create(java.io.File r1, java.nio.charset.Charset r2, org.apache.commons.io.input.TailerListener r3, long r4, boolean r6, boolean r7, int r8) {
            org.apache.commons.io.input.Tailer$Builder r0 = builder()
            org.apache.commons.io.build.AbstractOriginSupplier r1 = r0.setFile(r1)
            org.apache.commons.io.input.Tailer$Builder r1 = (org.apache.commons.io.input.Tailer.Builder) r1
            org.apache.commons.io.input.Tailer$Builder r1 = r1.setTailerListener(r3)
            org.apache.commons.io.build.AbstractStreamBuilder r1 = r1.setCharset(r2)
            org.apache.commons.io.input.Tailer$Builder r1 = (org.apache.commons.io.input.Tailer.Builder) r1
            java.time.Duration r2 = java.time.Duration.ofMillis(r4)
            org.apache.commons.io.input.Tailer$Builder r1 = r1.setDelayDuration(r2)
            org.apache.commons.io.input.Tailer$Builder r1 = r1.setTailFromEnd(r6)
            org.apache.commons.io.input.Tailer$Builder r1 = r1.setReOpen(r7)
            org.apache.commons.io.build.AbstractStreamBuilder r1 = r1.setBufferSize(r8)
            org.apache.commons.io.input.Tailer$Builder r1 = (org.apache.commons.io.input.Tailer.Builder) r1
            org.apache.commons.io.input.Tailer r1 = r1.get()
            return r1
    }

    @java.lang.Deprecated
    public static org.apache.commons.io.input.Tailer create(java.io.File r1, org.apache.commons.io.input.TailerListener r2) {
            org.apache.commons.io.input.Tailer$Builder r0 = builder()
            org.apache.commons.io.build.AbstractOriginSupplier r1 = r0.setFile(r1)
            org.apache.commons.io.input.Tailer$Builder r1 = (org.apache.commons.io.input.Tailer.Builder) r1
            org.apache.commons.io.input.Tailer$Builder r1 = r1.setTailerListener(r2)
            org.apache.commons.io.input.Tailer r1 = r1.get()
            return r1
    }

    @java.lang.Deprecated
    public static org.apache.commons.io.input.Tailer create(java.io.File r1, org.apache.commons.io.input.TailerListener r2, long r3) {
            org.apache.commons.io.input.Tailer$Builder r0 = builder()
            org.apache.commons.io.build.AbstractOriginSupplier r1 = r0.setFile(r1)
            org.apache.commons.io.input.Tailer$Builder r1 = (org.apache.commons.io.input.Tailer.Builder) r1
            org.apache.commons.io.input.Tailer$Builder r1 = r1.setTailerListener(r2)
            java.time.Duration r2 = java.time.Duration.ofMillis(r3)
            org.apache.commons.io.input.Tailer$Builder r1 = r1.setDelayDuration(r2)
            org.apache.commons.io.input.Tailer r1 = r1.get()
            return r1
    }

    @java.lang.Deprecated
    public static org.apache.commons.io.input.Tailer create(java.io.File r1, org.apache.commons.io.input.TailerListener r2, long r3, boolean r5) {
            org.apache.commons.io.input.Tailer$Builder r0 = builder()
            org.apache.commons.io.build.AbstractOriginSupplier r1 = r0.setFile(r1)
            org.apache.commons.io.input.Tailer$Builder r1 = (org.apache.commons.io.input.Tailer.Builder) r1
            org.apache.commons.io.input.Tailer$Builder r1 = r1.setTailerListener(r2)
            java.time.Duration r2 = java.time.Duration.ofMillis(r3)
            org.apache.commons.io.input.Tailer$Builder r1 = r1.setDelayDuration(r2)
            org.apache.commons.io.input.Tailer$Builder r1 = r1.setTailFromEnd(r5)
            org.apache.commons.io.input.Tailer r1 = r1.get()
            return r1
    }

    @java.lang.Deprecated
    public static org.apache.commons.io.input.Tailer create(java.io.File r1, org.apache.commons.io.input.TailerListener r2, long r3, boolean r5, int r6) {
            org.apache.commons.io.input.Tailer$Builder r0 = builder()
            org.apache.commons.io.build.AbstractOriginSupplier r1 = r0.setFile(r1)
            org.apache.commons.io.input.Tailer$Builder r1 = (org.apache.commons.io.input.Tailer.Builder) r1
            org.apache.commons.io.input.Tailer$Builder r1 = r1.setTailerListener(r2)
            java.time.Duration r2 = java.time.Duration.ofMillis(r3)
            org.apache.commons.io.input.Tailer$Builder r1 = r1.setDelayDuration(r2)
            org.apache.commons.io.input.Tailer$Builder r1 = r1.setTailFromEnd(r5)
            org.apache.commons.io.build.AbstractStreamBuilder r1 = r1.setBufferSize(r6)
            org.apache.commons.io.input.Tailer$Builder r1 = (org.apache.commons.io.input.Tailer.Builder) r1
            org.apache.commons.io.input.Tailer r1 = r1.get()
            return r1
    }

    @java.lang.Deprecated
    public static org.apache.commons.io.input.Tailer create(java.io.File r1, org.apache.commons.io.input.TailerListener r2, long r3, boolean r5, boolean r6) {
            org.apache.commons.io.input.Tailer$Builder r0 = builder()
            org.apache.commons.io.build.AbstractOriginSupplier r1 = r0.setFile(r1)
            org.apache.commons.io.input.Tailer$Builder r1 = (org.apache.commons.io.input.Tailer.Builder) r1
            org.apache.commons.io.input.Tailer$Builder r1 = r1.setTailerListener(r2)
            java.time.Duration r2 = java.time.Duration.ofMillis(r3)
            org.apache.commons.io.input.Tailer$Builder r1 = r1.setDelayDuration(r2)
            org.apache.commons.io.input.Tailer$Builder r1 = r1.setTailFromEnd(r5)
            org.apache.commons.io.input.Tailer$Builder r1 = r1.setReOpen(r6)
            org.apache.commons.io.input.Tailer r1 = r1.get()
            return r1
    }

    @java.lang.Deprecated
    public static org.apache.commons.io.input.Tailer create(java.io.File r1, org.apache.commons.io.input.TailerListener r2, long r3, boolean r5, boolean r6, int r7) {
            org.apache.commons.io.input.Tailer$Builder r0 = builder()
            org.apache.commons.io.build.AbstractOriginSupplier r1 = r0.setFile(r1)
            org.apache.commons.io.input.Tailer$Builder r1 = (org.apache.commons.io.input.Tailer.Builder) r1
            org.apache.commons.io.input.Tailer$Builder r1 = r1.setTailerListener(r2)
            java.time.Duration r2 = java.time.Duration.ofMillis(r3)
            org.apache.commons.io.input.Tailer$Builder r1 = r1.setDelayDuration(r2)
            org.apache.commons.io.input.Tailer$Builder r1 = r1.setTailFromEnd(r5)
            org.apache.commons.io.input.Tailer$Builder r1 = r1.setReOpen(r6)
            org.apache.commons.io.build.AbstractStreamBuilder r1 = r1.setBufferSize(r7)
            org.apache.commons.io.input.Tailer$Builder r1 = (org.apache.commons.io.input.Tailer.Builder) r1
            org.apache.commons.io.input.Tailer r1 = r1.get()
            return r1
    }

    private long readLines(org.apache.commons.io.input.Tailer.RandomAccessResourceBridge r14) throws java.io.IOException {
            r13 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = 64
            r0.<init>(r1)
            long r1 = r14.getPointer()     // Catch: java.lang.Throwable -> L83
            r3 = 0
            r4 = r1
            r6 = r3
        Le:
            boolean r7 = r13.getRun()     // Catch: java.lang.Throwable -> L83
            if (r7 == 0) goto L71
            byte[] r7 = r13.inbuf     // Catch: java.lang.Throwable -> L83
            int r7 = r14.read(r7)     // Catch: java.lang.Throwable -> L83
            r8 = -1
            if (r7 == r8) goto L71
            r8 = r3
        L1e:
            if (r8 >= r7) goto L6c
            byte[] r9 = r13.inbuf     // Catch: java.lang.Throwable -> L83
            r9 = r9[r8]     // Catch: java.lang.Throwable -> L83
            r10 = 10
            r11 = 1
            if (r9 == r10) goto L52
            r10 = 13
            if (r9 == r10) goto L4b
            if (r6 == 0) goto L47
            org.apache.commons.io.input.TailerListener r1 = r13.listener     // Catch: java.lang.Throwable -> L83
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L83
            byte[] r6 = r0.toByteArray()     // Catch: java.lang.Throwable -> L83
            java.nio.charset.Charset r10 = r13.charset     // Catch: java.lang.Throwable -> L83
            r2.<init>(r6, r10)     // Catch: java.lang.Throwable -> L83
            r1.handle(r2)     // Catch: java.lang.Throwable -> L83
            r0.reset()     // Catch: java.lang.Throwable -> L83
            long r1 = (long) r8     // Catch: java.lang.Throwable -> L83
            long r1 = r1 + r4
            long r1 = r1 + r11
            r6 = r3
        L47:
            r0.write(r9)     // Catch: java.lang.Throwable -> L83
            goto L69
        L4b:
            if (r6 == 0) goto L50
            r0.write(r10)     // Catch: java.lang.Throwable -> L83
        L50:
            r6 = 1
            goto L69
        L52:
            org.apache.commons.io.input.TailerListener r1 = r13.listener     // Catch: java.lang.Throwable -> L83
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L83
            byte[] r6 = r0.toByteArray()     // Catch: java.lang.Throwable -> L83
            java.nio.charset.Charset r9 = r13.charset     // Catch: java.lang.Throwable -> L83
            r2.<init>(r6, r9)     // Catch: java.lang.Throwable -> L83
            r1.handle(r2)     // Catch: java.lang.Throwable -> L83
            r0.reset()     // Catch: java.lang.Throwable -> L83
            long r1 = (long) r8     // Catch: java.lang.Throwable -> L83
            long r1 = r1 + r4
            long r1 = r1 + r11
            r6 = r3
        L69:
            int r8 = r8 + 1
            goto L1e
        L6c:
            long r4 = r14.getPointer()     // Catch: java.lang.Throwable -> L83
            goto Le
        L71:
            r14.seek(r1)     // Catch: java.lang.Throwable -> L83
            org.apache.commons.io.input.TailerListener r14 = r13.listener     // Catch: java.lang.Throwable -> L83
            boolean r3 = r14 instanceof org.apache.commons.io.input.TailerListenerAdapter     // Catch: java.lang.Throwable -> L83
            if (r3 == 0) goto L7f
            org.apache.commons.io.input.TailerListenerAdapter r14 = (org.apache.commons.io.input.TailerListenerAdapter) r14     // Catch: java.lang.Throwable -> L83
            r14.endOfFileReached()     // Catch: java.lang.Throwable -> L83
        L7f:
            r0.close()
            return r1
        L83:
            r14 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L88
            goto L8c
        L88:
            r0 = move-exception
            r14.addSuppressed(r0)
        L8c:
            throw r14
    }

    @Override // java.lang.AutoCloseable
    public void close() {
            r1 = this;
            r0 = 0
            r1.run = r0
            return
    }

    @java.lang.Deprecated
    public long getDelay() {
            r2 = this;
            java.time.Duration r0 = r2.delayDuration
            long r0 = r0.toMillis()
            return r0
    }

    public java.time.Duration getDelayDuration() {
            r1 = this;
            java.time.Duration r0 = r1.delayDuration
            return r0
    }

    public java.io.File getFile() {
            r3 = this;
            org.apache.commons.io.input.Tailer$Tailable r0 = r3.tailable
            boolean r1 = r0 instanceof org.apache.commons.io.input.Tailer.TailablePath
            if (r1 == 0) goto L11
            org.apache.commons.io.input.Tailer$TailablePath r0 = (org.apache.commons.io.input.Tailer.TailablePath) r0
            java.nio.file.Path r0 = r0.getPath()
            java.io.File r0 = r0.toFile()
            return r0
        L11:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot extract java.io.File from "
            r1.<init>(r2)
            org.apache.commons.io.input.Tailer$Tailable r2 = r3.tailable
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    protected boolean getRun() {
            r1 = this;
            boolean r0 = r1.run
            return r0
    }

    public org.apache.commons.io.input.Tailer.Tailable getTailable() {
            r1 = this;
            org.apache.commons.io.input.Tailer$Tailable r0 = r1.tailable
            return r0
    }

    @Override // java.lang.Runnable
    public void run() {
            r10 = this;
            r0 = 0
            java.nio.file.attribute.FileTime r1 = org.apache.commons.io.file.attribute.FileTimes.EPOCH     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
            r2 = 0
            r4 = r2
        L6:
            boolean r6 = r10.getRun()     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
            java.lang.String r7 = "r"
            if (r6 == 0) goto L3a
            if (r0 != 0) goto L3a
            org.apache.commons.io.input.Tailer$Tailable r6 = r10.tailable     // Catch: java.io.FileNotFoundException -> L17 java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
            org.apache.commons.io.input.Tailer$RandomAccessResourceBridge r0 = r6.getRandomAccess(r7)     // Catch: java.io.FileNotFoundException -> L17 java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
            goto L1c
        L17:
            org.apache.commons.io.input.TailerListener r6 = r10.listener     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
            r6.fileNotFound()     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
        L1c:
            if (r0 != 0) goto L24
            java.time.Duration r6 = r10.delayDuration     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
            org.apache.commons.io.ThreadUtils.sleep(r6)     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
            goto L6
        L24:
            boolean r1 = r10.tailAtEnd     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
            if (r1 == 0) goto L2f
            org.apache.commons.io.input.Tailer$Tailable r1 = r10.tailable     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
            long r4 = r1.size()     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
            goto L30
        L2f:
            r4 = r2
        L30:
            org.apache.commons.io.input.Tailer$Tailable r1 = r10.tailable     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
            java.nio.file.attribute.FileTime r1 = r1.lastModifiedFileTime()     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
            r0.seek(r4)     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
            goto L6
        L3a:
            boolean r6 = r10.getRun()     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
            if (r6 == 0) goto Ld5
            org.apache.commons.io.input.Tailer$Tailable r6 = r10.tailable     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
            boolean r6 = r6.isNewer(r1)     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
            org.apache.commons.io.input.Tailer$Tailable r8 = r10.tailable     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
            long r8 = r8.size()     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 >= 0) goto L96
            org.apache.commons.io.input.TailerListener r6 = r10.listener     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
            r6.fileRotated()     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
            org.apache.commons.io.input.Tailer$Tailable r6 = r10.tailable     // Catch: java.lang.Throwable -> L72
            org.apache.commons.io.input.Tailer$RandomAccessResourceBridge r6 = r6.getRandomAccess(r7)     // Catch: java.lang.Throwable -> L72
            r10.readLines(r0)     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L61
            goto L67
        L5f:
            r8 = move-exception
            goto L74
        L61:
            r8 = move-exception
            org.apache.commons.io.input.TailerListener r9 = r10.listener     // Catch: java.lang.Throwable -> L5f
            r9.handle(r8)     // Catch: java.lang.Throwable -> L5f
        L67:
            if (r0 == 0) goto L6f
            r0.close()     // Catch: java.io.FileNotFoundException -> L6d java.lang.Throwable -> L7f java.lang.Exception -> L83 java.lang.InterruptedException -> L86
            goto L6f
        L6d:
            r4 = r2
            goto L8a
        L6f:
            r4 = r2
            r0 = r6
            goto L3a
        L72:
            r8 = move-exception
            r6 = r0
        L74:
            if (r0 == 0) goto L7e
            r0.close()     // Catch: java.lang.Throwable -> L7a
            goto L7e
        L7a:
            r0 = move-exception
            r8.addSuppressed(r0)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L83 java.lang.InterruptedException -> L86 java.io.FileNotFoundException -> L8a
        L7e:
            throw r8     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L83 java.lang.InterruptedException -> L86 java.io.FileNotFoundException -> L8a
        L7f:
            r1 = move-exception
            r0 = r6
            goto L105
        L83:
            r1 = move-exception
            r0 = r6
            goto Lde
        L86:
            r1 = move-exception
            r0 = r6
            goto Lf2
        L8a:
            r0 = r6
            org.apache.commons.io.input.TailerListener r6 = r10.listener     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
            r6.fileNotFound()     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
            java.time.Duration r6 = r10.delayDuration     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
            org.apache.commons.io.ThreadUtils.sleep(r6)     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
            goto L3a
        L96:
            if (r8 <= 0) goto La3
            long r4 = r10.readLines(r0)     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
            org.apache.commons.io.input.Tailer$Tailable r1 = r10.tailable     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
            java.nio.file.attribute.FileTime r1 = r1.lastModifiedFileTime()     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
            goto Lb2
        La3:
            if (r6 == 0) goto Lb2
            r0.seek(r2)     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
            long r4 = r10.readLines(r0)     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
            org.apache.commons.io.input.Tailer$Tailable r1 = r10.tailable     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
            java.nio.file.attribute.FileTime r1 = r1.lastModifiedFileTime()     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
        Lb2:
            boolean r6 = r10.reOpen     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
            if (r6 == 0) goto Lbb
            if (r0 == 0) goto Lbb
            r0.close()     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
        Lbb:
            java.time.Duration r6 = r10.delayDuration     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
            org.apache.commons.io.ThreadUtils.sleep(r6)     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
            boolean r6 = r10.getRun()     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
            if (r6 == 0) goto L3a
            boolean r6 = r10.reOpen     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
            if (r6 == 0) goto L3a
            org.apache.commons.io.input.Tailer$Tailable r6 = r10.tailable     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
            org.apache.commons.io.input.Tailer$RandomAccessResourceBridge r0 = r6.getRandomAccess(r7)     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
            r0.seek(r4)     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Ldd java.lang.InterruptedException -> Lf1
            goto L3a
        Ld5:
            org.apache.commons.io.IOUtils.close(r0)     // Catch: java.io.IOException -> Ld9
            goto Led
        Ld9:
            r0 = move-exception
            goto Le8
        Ldb:
            r1 = move-exception
            goto L105
        Ldd:
            r1 = move-exception
        Lde:
            org.apache.commons.io.input.TailerListener r2 = r10.listener     // Catch: java.lang.Throwable -> Ldb
            r2.handle(r1)     // Catch: java.lang.Throwable -> Ldb
            org.apache.commons.io.IOUtils.close(r0)     // Catch: java.io.IOException -> Le7
            goto Led
        Le7:
            r0 = move-exception
        Le8:
            org.apache.commons.io.input.TailerListener r1 = r10.listener
            r1.handle(r0)
        Led:
            r10.close()
            goto L104
        Lf1:
            r1 = move-exception
        Lf2:
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> Ldb
            r2.interrupt()     // Catch: java.lang.Throwable -> Ldb
            org.apache.commons.io.input.TailerListener r2 = r10.listener     // Catch: java.lang.Throwable -> Ldb
            r2.handle(r1)     // Catch: java.lang.Throwable -> Ldb
            org.apache.commons.io.IOUtils.close(r0)     // Catch: java.io.IOException -> L102
            goto Led
        L102:
            r0 = move-exception
            goto Le8
        L104:
            return
        L105:
            org.apache.commons.io.IOUtils.close(r0)     // Catch: java.io.IOException -> L109
            goto L10f
        L109:
            r0 = move-exception
            org.apache.commons.io.input.TailerListener r2 = r10.listener
            r2.handle(r0)
        L10f:
            r10.close()
            throw r1
    }

    @java.lang.Deprecated
    public void stop() {
            r0 = this;
            r0.close()
            return
    }
}
