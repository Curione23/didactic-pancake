package net.java.openjdk.cacio.ctc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCClipboard.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCClipboard.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCClipboard.class */
public class CTCClipboard extends java.awt.datatransfer.Clipboard {
    public static final net.java.openjdk.cacio.ctc.CTCClipboard INSTANCE = null;
    private static final java.lang.Object sSyncLock = null;
    private static long lastClipboardCheckTime;

    private CTCClipboard() {
            r3 = this;
            r0 = r3
            java.lang.String r1 = "Android JNI clipboard (text-only)"
            r0.<init>(r1)
            return
    }

    public java.awt.datatransfer.DataFlavor[] getAvailableDataFlavors() {
            r2 = this;
            querySystemClipboard()
            r0 = r2
            java.awt.datatransfer.DataFlavor[] r0 = super.getAvailableDataFlavors()
            return r0
    }

    public java.awt.datatransfer.Transferable getContents(java.lang.Object r4) {
            r3 = this;
            querySystemClipboard()
            r0 = r3
            r1 = r4
            java.awt.datatransfer.Transferable r0 = super.getContents(r1)
            return r0
    }

    public java.lang.Object getData(java.awt.datatransfer.DataFlavor r4) throws java.awt.datatransfer.UnsupportedFlavorException, java.io.IOException {
            r3 = this;
            querySystemClipboard()
            r0 = r3
            r1 = r4
            java.lang.Object r0 = super.getData(r1)
            return r0
    }

    public boolean isDataFlavorAvailable(java.awt.datatransfer.DataFlavor r4) {
            r3 = this;
            querySystemClipboard()
            r0 = r3
            r1 = r4
            boolean r0 = super.isDataFlavorAvailable(r1)
            return r0
    }

    public void setContents(java.awt.datatransfer.Transferable r5, java.awt.datatransfer.ClipboardOwner r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            super.setContents(r1, r2)
            r0 = r5
            transferTextToOS(r0)
            return
    }

    private static void querySystemClipboard() {
            java.lang.Object r0 = net.java.openjdk.cacio.ctc.CTCClipboard.sSyncLock     // Catch: java.lang.InterruptedException -> L2d
            r1 = r0
            r5 = r1
            monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L2d
            long r0 = net.java.openjdk.cacio.ctc.CTCClipboard.lastClipboardCheckTime     // Catch: java.lang.Throwable -> L25 java.lang.InterruptedException -> L2d
            r1 = 300(0x12c, double:1.48E-321)
            long r0 = r0 + r1
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L25 java.lang.InterruptedException -> L2d
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L17
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25 java.lang.InterruptedException -> L2d
            return
        L17:
            nQuerySystemClipboard()     // Catch: java.lang.Throwable -> L25 java.lang.InterruptedException -> L2d
            java.lang.Object r0 = net.java.openjdk.cacio.ctc.CTCClipboard.sSyncLock     // Catch: java.lang.Throwable -> L25 java.lang.InterruptedException -> L2d
            r0.wait()     // Catch: java.lang.Throwable -> L25 java.lang.InterruptedException -> L2d
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25 java.lang.InterruptedException -> L2d
            goto L2a
        L25:
            r6 = move-exception
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25 java.lang.InterruptedException -> L2d
            r0 = r6
            throw r0     // Catch: java.lang.InterruptedException -> L2d
        L2a:
            goto L36
        L2d:
            r5 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r1.<init>()
            throw r0
        L36:
            return
    }

    private static void systemClipboardDataReceived(java.lang.String r6, java.lang.String r7) {
            java.lang.Object r0 = net.java.openjdk.cacio.ctc.CTCClipboard.sSyncLock
            r1 = r0
            r8 = r1
            monitor-enter(r0)
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L2e
            net.java.openjdk.cacio.ctc.CTCClipboard.lastClipboardCheckTime = r0     // Catch: java.lang.Throwable -> L2e
            r0 = r6
            if (r0 == 0) goto L23
            r0 = r7
            if (r0 == 0) goto L23
            net.java.openjdk.cacio.ctc.CTCClipboard r0 = net.java.openjdk.cacio.ctc.CTCClipboard.INSTANCE     // Catch: java.lang.Throwable -> L2e
            net.java.openjdk.cacio.ctc.CTCStringTransferable r1 = new net.java.openjdk.cacio.ctc.CTCStringTransferable     // Catch: java.lang.Throwable -> L2e
            r2 = r1
            r3 = r6
            r4 = r7
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L2e
            r0.contents = r1     // Catch: java.lang.Throwable -> L2e
        L23:
            java.lang.Object r0 = net.java.openjdk.cacio.ctc.CTCClipboard.sSyncLock     // Catch: java.lang.Throwable -> L2e
            r0.notifyAll()     // Catch: java.lang.Throwable -> L2e
            r0 = r8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            goto L33
        L2e:
            r9 = move-exception
            r0 = r8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            r0 = r9
            throw r0
        L33:
            return
    }

    private static void transferTextToOS(java.awt.datatransfer.Transferable r5) {
            r0 = r5
            java.awt.datatransfer.DataFlavor[] r0 = r0.getTransferDataFlavors()
            r6 = r0
            r0 = r6
            int r0 = r0.length
            r7 = r0
            r0 = 0
            r8 = r0
        Lc:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L280
            r0 = r6
            r1 = r8
            r0 = r0[r1]
            r9 = r0
            r0 = r9
            boolean r0 = r0.isFlavorTextType()
            if (r0 != 0) goto L21
            goto L27a
        L21:
            r0 = r9
            java.lang.String r0 = r0.getSubType()
            java.lang.String r1 = "html"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L33
            java.lang.String r0 = "text/html"
            goto L35
        L33:
            java.lang.String r0 = "text/plain"
        L35:
            r10 = r0
            java.lang.Class<java.lang.CharSequence> r0 = java.lang.CharSequence.class
            r1 = r9
            java.lang.Class r1 = r1.getRepresentationClass()     // Catch: java.lang.Throwable -> L273
            boolean r0 = r0.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> L273
            if (r0 == 0) goto L55
            r0 = r5
            r1 = r9
            java.lang.Object r0 = r0.getTransferData(r1)     // Catch: java.lang.Throwable -> L273
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L273
            r1 = r10
            nPutClipboardData(r0, r1)     // Catch: java.lang.Throwable -> L273
            return
        L55:
            r0 = r9
            boolean r0 = r0.isRepresentationClassCharBuffer()     // Catch: java.lang.Throwable -> L273 java.lang.Throwable -> L273
            if (r0 == 0) goto L7c
            r0 = r5
            r1 = r9
            java.lang.Object r0 = r0.getTransferData(r1)     // Catch: java.lang.Throwable -> L273 java.lang.Throwable -> L273
            java.nio.CharBuffer r0 = (java.nio.CharBuffer) r0     // Catch: java.lang.Throwable -> L273 java.lang.Throwable -> L273
            r11 = r0
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L273 java.lang.Throwable -> L273
            r1 = r0
            r2 = r11
            char[] r2 = r2.array()     // Catch: java.lang.Throwable -> L273 java.lang.Throwable -> L273
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L273 java.lang.Throwable -> L273
            r1 = r10
            nPutClipboardData(r0, r1)     // Catch: java.lang.Throwable -> L273 java.lang.Throwable -> L273
            return
        L7c:
            r0 = r9
            boolean r0 = r0.isRepresentationClassReader()     // Catch: java.lang.Throwable -> L273 java.lang.Throwable -> L273
            if (r0 == 0) goto L122
            r0 = r5
            r1 = r9
            java.lang.Object r0 = r0.getTransferData(r1)     // Catch: java.lang.Throwable -> L273 java.lang.Throwable -> L273
            java.io.Reader r0 = (java.io.Reader) r0     // Catch: java.lang.Throwable -> L273 java.lang.Throwable -> L273
            r11 = r0
            r0 = 0
            r12 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf0 java.lang.Throwable -> Lf9 java.lang.Throwable -> L273 java.lang.Throwable -> L273
            r1 = r0
            r1.<init>()     // Catch: java.lang.Throwable -> Lf0 java.lang.Throwable -> Lf9 java.lang.Throwable -> L273 java.lang.Throwable -> L273
            r13 = r0
            r0 = 128(0x80, float:1.8E-43)
            char[] r0 = new char[r0]     // Catch: java.lang.Throwable -> Lf0 java.lang.Throwable -> Lf9 java.lang.Throwable -> L273 java.lang.Throwable -> L273
            r14 = r0
        La4:
            r0 = r11
            r1 = r14
            int r0 = r0.read(r1)     // Catch: java.lang.Throwable -> Lf0 java.lang.Throwable -> Lf9 java.lang.Throwable -> L273 java.lang.Throwable -> L273
            r1 = r0
            r15 = r1
            r1 = -1
            if (r0 == r1) goto Lc0
            r0 = r13
            r1 = r14
            r2 = 0
            r3 = r15
            java.lang.StringBuilder r0 = r0.append(r1, r2, r3)     // Catch: java.lang.Throwable -> Lf0 java.lang.Throwable -> Lf9 java.lang.Throwable -> L273 java.lang.Throwable -> L273
            goto La4
        Lc0:
            r0 = r13
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lf0 java.lang.Throwable -> Lf9 java.lang.Throwable -> L273 java.lang.Throwable -> L273
            r1 = r10
            nPutClipboardData(r0, r1)     // Catch: java.lang.Throwable -> Lf0 java.lang.Throwable -> Lf9 java.lang.Throwable -> L273 java.lang.Throwable -> L273
            r0 = r11
            if (r0 == 0) goto L121
            r0 = r12
            if (r0 == 0) goto Le8
            r0 = r11
            r0.close()     // Catch: java.lang.Throwable -> Ldc java.lang.Throwable -> L273 java.lang.Throwable -> L273
            goto L121
        Ldc:
            r13 = move-exception
            r0 = r12
            r1 = r13
            r0.addSuppressed(r1)     // Catch: java.lang.Throwable -> L273 java.lang.Throwable -> L273
            goto L121
        Le8:
            r0 = r11
            r0.close()     // Catch: java.lang.Throwable -> L273 java.lang.Throwable -> L273
            goto L121
        Lf0:
            r13 = move-exception
            r0 = r13
            r12 = r0
            r0 = r13
            throw r0     // Catch: java.lang.Throwable -> Lf9 java.lang.Throwable -> L273 java.lang.Throwable -> L273
        Lf9:
            r16 = move-exception
            r0 = r11
            if (r0 == 0) goto L11e
            r0 = r12
            if (r0 == 0) goto L119
            r0 = r11
            r0.close()     // Catch: java.lang.Throwable -> L10d java.lang.Throwable -> L273 java.lang.Throwable -> L273
            goto L11e
        L10d:
            r17 = move-exception
            r0 = r12
            r1 = r17
            r0.addSuppressed(r1)     // Catch: java.lang.Throwable -> L273 java.lang.Throwable -> L273
            goto L11e
        L119:
            r0 = r11
            r0.close()     // Catch: java.lang.Throwable -> L273 java.lang.Throwable -> L273
        L11e:
            r0 = r16
            throw r0     // Catch: java.lang.Throwable -> L273 java.lang.Throwable -> L273
        L121:
            return
        L122:
            r0 = r9
            boolean r0 = r0.isRepresentationClassByteBuffer()     // Catch: java.lang.Throwable -> L273 java.lang.Throwable -> L273
            if (r0 == 0) goto L15d
            r0 = r9
            java.lang.String r1 = "charset"
            java.lang.String r0 = r0.getParameter(r1)     // Catch: java.lang.Throwable -> L273 java.lang.Throwable -> L273
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L13c
            java.lang.String r0 = "UTF-8"
            r11 = r0
        L13c:
            r0 = r5
            r1 = r9
            java.lang.Object r0 = r0.getTransferData(r1)     // Catch: java.lang.Throwable -> L273 java.lang.Throwable -> L273
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0     // Catch: java.lang.Throwable -> L273 java.lang.Throwable -> L273
            r12 = r0
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L273 java.lang.Throwable -> L273
            r1 = r0
            r2 = r12
            byte[] r2 = r2.array()     // Catch: java.lang.Throwable -> L273 java.lang.Throwable -> L273
            r3 = r11
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L273 java.lang.Throwable -> L273
            r1 = r10
            nPutClipboardData(r0, r1)     // Catch: java.lang.Throwable -> L273 java.lang.Throwable -> L273
            return
        L15d:
            r0 = r9
            boolean r0 = r0.isRepresentationClassInputStream()     // Catch: java.lang.Throwable -> L273 java.lang.Throwable -> L273
            if (r0 == 0) goto L270
            r0 = r9
            java.lang.String r1 = "charset"
            java.lang.String r0 = r0.getParameter(r1)     // Catch: java.lang.Throwable -> L273 java.lang.Throwable -> L273
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L177
            java.lang.String r0 = "UTF-8"
            r11 = r0
        L177:
            r0 = r5
            r1 = r9
            java.lang.Object r0 = r0.getTransferData(r1)     // Catch: java.lang.Throwable -> L273 java.lang.Throwable -> L273
            java.io.InputStream r0 = (java.io.InputStream) r0     // Catch: java.lang.Throwable -> L273 java.lang.Throwable -> L273
            r12 = r0
            r0 = 0
            r13 = r0
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L23e java.lang.Throwable -> L247 java.lang.Throwable -> L273 java.lang.Throwable -> L273
            r1 = r0
            r1.<init>()     // Catch: java.lang.Throwable -> L23e java.lang.Throwable -> L247 java.lang.Throwable -> L273 java.lang.Throwable -> L273
            r14 = r0
            r0 = 0
            r15 = r0
            r0 = 128(0x80, float:1.8E-43)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L1e7 java.lang.Throwable -> L1f0 java.lang.Throwable -> L23e java.lang.Throwable -> L247 java.lang.Throwable -> L273 java.lang.Throwable -> L273
            r16 = r0
        L19a:
            r0 = r12
            r1 = r16
            int r0 = r0.read(r1)     // Catch: java.lang.Throwable -> L1e7 java.lang.Throwable -> L1f0 java.lang.Throwable -> L23e java.lang.Throwable -> L247 java.lang.Throwable -> L273 java.lang.Throwable -> L273
            r1 = r0
            r17 = r1
            r1 = -1
            if (r0 == r1) goto L1b5
            r0 = r14
            r1 = r16
            r2 = 0
            r3 = r17
            r0.write(r1, r2, r3)     // Catch: java.lang.Throwable -> L1e7 java.lang.Throwable -> L1f0 java.lang.Throwable -> L23e java.lang.Throwable -> L247 java.lang.Throwable -> L273 java.lang.Throwable -> L273
            goto L19a
        L1b5:
            r0 = r14
            r1 = r11
            java.lang.String r0 = r0.toString(r1)     // Catch: java.lang.Throwable -> L1e7 java.lang.Throwable -> L1f0 java.lang.Throwable -> L23e java.lang.Throwable -> L247 java.lang.Throwable -> L273 java.lang.Throwable -> L273
            r1 = r10
            nPutClipboardData(r0, r1)     // Catch: java.lang.Throwable -> L1e7 java.lang.Throwable -> L1f0 java.lang.Throwable -> L23e java.lang.Throwable -> L247 java.lang.Throwable -> L273 java.lang.Throwable -> L273
            r0 = r14
            if (r0 == 0) goto L218
            r0 = r15
            if (r0 == 0) goto L1df
            r0 = r14
            r0.close()     // Catch: java.lang.Throwable -> L1d3 java.lang.Throwable -> L23e java.lang.Throwable -> L247 java.lang.Throwable -> L273 java.lang.Throwable -> L273
            goto L218
        L1d3:
            r16 = move-exception
            r0 = r15
            r1 = r16
            r0.addSuppressed(r1)     // Catch: java.lang.Throwable -> L23e java.lang.Throwable -> L247 java.lang.Throwable -> L273 java.lang.Throwable -> L273
            goto L218
        L1df:
            r0 = r14
            r0.close()     // Catch: java.lang.Throwable -> L23e java.lang.Throwable -> L247 java.lang.Throwable -> L273 java.lang.Throwable -> L273
            goto L218
        L1e7:
            r16 = move-exception
            r0 = r16
            r15 = r0
            r0 = r16
            throw r0     // Catch: java.lang.Throwable -> L1f0 java.lang.Throwable -> L23e java.lang.Throwable -> L247 java.lang.Throwable -> L273 java.lang.Throwable -> L273
        L1f0:
            r18 = move-exception
            r0 = r14
            if (r0 == 0) goto L215
            r0 = r15
            if (r0 == 0) goto L210
            r0 = r14
            r0.close()     // Catch: java.lang.Throwable -> L204 java.lang.Throwable -> L23e java.lang.Throwable -> L247 java.lang.Throwable -> L273 java.lang.Throwable -> L273
            goto L215
        L204:
            r19 = move-exception
            r0 = r15
            r1 = r19
            r0.addSuppressed(r1)     // Catch: java.lang.Throwable -> L23e java.lang.Throwable -> L247 java.lang.Throwable -> L273 java.lang.Throwable -> L273
            goto L215
        L210:
            r0 = r14
            r0.close()     // Catch: java.lang.Throwable -> L23e java.lang.Throwable -> L247 java.lang.Throwable -> L273 java.lang.Throwable -> L273
        L215:
            r0 = r18
            throw r0     // Catch: java.lang.Throwable -> L23e java.lang.Throwable -> L247 java.lang.Throwable -> L273 java.lang.Throwable -> L273
        L218:
            r0 = r12
            if (r0 == 0) goto L26f
            r0 = r13
            if (r0 == 0) goto L236
            r0 = r12
            r0.close()     // Catch: java.lang.Throwable -> L22a java.lang.Throwable -> L273 java.lang.Throwable -> L273
            goto L26f
        L22a:
            r14 = move-exception
            r0 = r13
            r1 = r14
            r0.addSuppressed(r1)     // Catch: java.lang.Throwable -> L273 java.lang.Throwable -> L273
            goto L26f
        L236:
            r0 = r12
            r0.close()     // Catch: java.lang.Throwable -> L273 java.lang.Throwable -> L273
            goto L26f
        L23e:
            r14 = move-exception
            r0 = r14
            r13 = r0
            r0 = r14
            throw r0     // Catch: java.lang.Throwable -> L247 java.lang.Throwable -> L273 java.lang.Throwable -> L273
        L247:
            r20 = move-exception
            r0 = r12
            if (r0 == 0) goto L26c
            r0 = r13
            if (r0 == 0) goto L267
            r0 = r12
            r0.close()     // Catch: java.lang.Throwable -> L25b java.lang.Throwable -> L273 java.lang.Throwable -> L273
            goto L26c
        L25b:
            r21 = move-exception
            r0 = r13
            r1 = r21
            r0.addSuppressed(r1)     // Catch: java.lang.Throwable -> L273 java.lang.Throwable -> L273
            goto L26c
        L267:
            r0 = r12
            r0.close()     // Catch: java.lang.Throwable -> L273 java.lang.Throwable -> L273
        L26c:
            r0 = r20
            throw r0     // Catch: java.lang.Throwable -> L273 java.lang.Throwable -> L273
        L26f:
            return
        L270:
            goto L27a
        L273:
            r11 = move-exception
            r0 = r11
            r0.printStackTrace()
        L27a:
            int r8 = r8 + 1
            goto Lc
        L280:
            return
    }

    private static native void nQuerySystemClipboard();

    private static native void nPutClipboardData(java.lang.String r0, java.lang.String r1);

    static {
            net.java.openjdk.cacio.ctc.CTCClipboard r0 = new net.java.openjdk.cacio.ctc.CTCClipboard
            r1 = r0
            r1.<init>()
            net.java.openjdk.cacio.ctc.CTCClipboard.INSTANCE = r0
            java.lang.Object r0 = new java.lang.Object
            r1 = r0
            r1.<init>()
            net.java.openjdk.cacio.ctc.CTCClipboard.sSyncLock = r0
            return
    }
}
