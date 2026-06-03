package net.java.openjdk.cacio.ctc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCStringTransferable.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCStringTransferable.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCStringTransferable.class */
public class CTCStringTransferable implements java.awt.datatransfer.Transferable {
    private static final java.awt.datatransfer.DataFlavor[] STRING_DATA_FLAVORS = null;
    private static final java.awt.datatransfer.DataFlavor[] HTML_DATA_FLAVORS = null;
    private final java.lang.String data;
    private final boolean isHtml;

    public CTCStringTransferable(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = r5
            r0.data = r1
            r0 = r4
            r1 = r6
            java.lang.String r2 = "html"
            boolean r1 = r1.endsWith(r2)
            r0.isHtml = r1
            return
    }

    public java.awt.datatransfer.DataFlavor[] getTransferDataFlavors() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.isHtml
            if (r0 == 0) goto Ld
            java.awt.datatransfer.DataFlavor[] r0 = net.java.openjdk.cacio.ctc.CTCStringTransferable.HTML_DATA_FLAVORS
            goto L10
        Ld:
            java.awt.datatransfer.DataFlavor[] r0 = net.java.openjdk.cacio.ctc.CTCStringTransferable.STRING_DATA_FLAVORS
        L10:
            return r0
    }

    public boolean isDataFlavorSupported(java.awt.datatransfer.DataFlavor r3) {
            r2 = this;
            r0 = r3
            boolean r0 = r0.isFlavorTextType()
            return r0
    }

    public java.lang.Object getTransferData(java.awt.datatransfer.DataFlavor r6) throws java.awt.datatransfer.UnsupportedFlavorException, java.io.IOException {
            r5 = this;
            r0 = r6
            boolean r0 = r0.isFlavorTextType()
            if (r0 != 0) goto L10
            java.awt.datatransfer.UnsupportedFlavorException r0 = new java.awt.datatransfer.UnsupportedFlavorException
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            throw r0
        L10:
            java.lang.Class<java.lang.CharSequence> r0 = java.lang.CharSequence.class
            r1 = r6
            java.lang.Class r1 = r1.getRepresentationClass()
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L21
            r0 = r5
            java.lang.String r0 = r0.data
            return r0
        L21:
            r0 = r6
            boolean r0 = r0.isRepresentationClassByteBuffer()
            if (r0 == 0) goto L36
            r0 = r5
            java.lang.String r0 = r0.data
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r0 = r0.getBytes(r1)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            return r0
        L36:
            r0 = r6
            boolean r0 = r0.isRepresentationClassCharBuffer()
            if (r0 == 0) goto L45
            r0 = r5
            java.lang.String r0 = r0.data
            java.nio.CharBuffer r0 = java.nio.CharBuffer.wrap(r0)
            return r0
        L45:
            r0 = r6
            boolean r0 = r0.isRepresentationClassInputStream()
            if (r0 == 0) goto L5e
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r1 = r0
            r2 = r5
            java.lang.String r2 = r2.data
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r2 = r2.getBytes(r3)
            r1.<init>(r2)
            return r0
        L5e:
            r0 = r6
            boolean r0 = r0.isRepresentationClassReader()
            if (r0 == 0) goto L71
            java.io.StringReader r0 = new java.io.StringReader
            r1 = r0
            r2 = r5
            java.lang.String r2 = r2.data
            r1.<init>(r2)
            return r0
        L71:
            java.awt.datatransfer.UnsupportedFlavorException r0 = new java.awt.datatransfer.UnsupportedFlavorException
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            throw r0
    }

    public static void generateSupportedFlavorsChar(java.util.List<java.awt.datatransfer.DataFlavor> r6, java.lang.String r7) throws java.lang.ClassNotFoundException {
            r0 = r6
            java.awt.datatransfer.DataFlavor r1 = new java.awt.datatransfer.DataFlavor
            r2 = r1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r3
            r4.<init>()
            r4 = r7
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = "; class=java.io.Reader; charset=Unicode"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            boolean r0 = r0.add(r1)
            r0 = r6
            java.awt.datatransfer.DataFlavor r1 = new java.awt.datatransfer.DataFlavor
            r2 = r1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r3
            r4.<init>()
            r4 = r7
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = "; class=java.lang.String; charset=Unicode"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            boolean r0 = r0.add(r1)
            r0 = r6
            java.awt.datatransfer.DataFlavor r1 = new java.awt.datatransfer.DataFlavor
            r2 = r1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r3
            r4.<init>()
            r4 = r7
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = "; class=java.nio.CharBuffer; charset=Unicode"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            boolean r0 = r0.add(r1)
            r0 = r6
            java.awt.datatransfer.DataFlavor r1 = new java.awt.datatransfer.DataFlavor
            r2 = r1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r3
            r4.<init>()
            r4 = r7
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = "; class=\"[C\"; charset=Unicode"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            boolean r0 = r0.add(r1)
            return
    }

    public static void generateSupportedFlavorsBinary(java.util.List<java.awt.datatransfer.DataFlavor> r6, java.lang.String r7, java.lang.String r8, boolean r9) throws java.lang.ClassNotFoundException {
            r0 = r6
            java.awt.datatransfer.DataFlavor r1 = new java.awt.datatransfer.DataFlavor
            r2 = r1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r3
            r4.<init>()
            r4 = r7
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = "; class=java.io.InputStream; charset="
            java.lang.StringBuilder r3 = r3.append(r4)
            r4 = r8
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            boolean r0 = r0.add(r1)
            r0 = r9
            if (r0 == 0) goto L4a
            r0 = r6
            java.awt.datatransfer.DataFlavor r1 = new java.awt.datatransfer.DataFlavor
            r2 = r1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r3
            r4.<init>()
            r4 = r7
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = "; class=java.io.InputStream"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            boolean r0 = r0.add(r1)
        L4a:
            r0 = r6
            java.awt.datatransfer.DataFlavor r1 = new java.awt.datatransfer.DataFlavor
            r2 = r1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r3
            r4.<init>()
            r4 = r7
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = "; class=java.nio.ByteBuffer; charset="
            java.lang.StringBuilder r3 = r3.append(r4)
            r4 = r8
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            boolean r0 = r0.add(r1)
            r0 = r6
            java.awt.datatransfer.DataFlavor r1 = new java.awt.datatransfer.DataFlavor
            r2 = r1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r3
            r4.<init>()
            r4 = r7
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = "; class=\"[B\"; charset="
            java.lang.StringBuilder r3 = r3.append(r4)
            r4 = r8
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            boolean r0 = r0.add(r1)
            return
    }

    public static void generateSupportedFlavorsForMimeType(java.util.List<java.awt.datatransfer.DataFlavor> r6, java.lang.String r7) throws java.lang.ClassNotFoundException {
            r0 = r6
            r1 = r7
            generateSupportedFlavorsChar(r0, r1)
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r0 = r0.name()
            r8 = r0
            java.util.SortedMap r0 = java.nio.charset.Charset.availableCharsets()
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
        L1a:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L3e
            r0 = r9
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r10 = r0
            r0 = r6
            r1 = r7
            r2 = r10
            r3 = r8
            r4 = r10
            boolean r3 = r3.equals(r4)
            generateSupportedFlavorsBinary(r0, r1, r2, r3)
            goto L1a
        L3e:
            return
    }

    public static void generateSupportedFlavorTypes(java.util.List<java.awt.datatransfer.DataFlavor> r5) throws java.lang.ClassNotFoundException {
            r0 = r5
            java.awt.datatransfer.DataFlavor r1 = java.awt.datatransfer.DataFlavor.stringFlavor
            boolean r0 = r0.add(r1)
            r0 = r5
            java.lang.String r1 = "text/plain"
            generateSupportedFlavorsForMimeType(r0, r1)
            r0 = r5
            java.lang.String r1 = "text/x-java"
            generateSupportedFlavorsForMimeType(r0, r1)
            r0 = r5
            java.awt.datatransfer.DataFlavor r1 = new java.awt.datatransfer.DataFlavor
            r2 = r1
            java.lang.String r3 = "application/x-java-jvm-local-objectref; class=java.lang.String"
            r2.<init>(r3)
            boolean r0 = r0.add(r1)
            return
    }

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r3 = r0
            r0 = r3
            generateSupportedFlavorTypes(r0)     // Catch: java.lang.Exception -> Lf
            goto L14
        Lf:
            r4 = move-exception
            r0 = r4
            r0.printStackTrace()
        L14:
            r0 = r3
            r1 = 0
            java.awt.datatransfer.DataFlavor[] r1 = new java.awt.datatransfer.DataFlavor[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.awt.datatransfer.DataFlavor[] r0 = (java.awt.datatransfer.DataFlavor[]) r0
            net.java.openjdk.cacio.ctc.CTCStringTransferable.STRING_DATA_FLAVORS = r0
            r0 = r3
            java.lang.String r1 = "text/html"
            generateSupportedFlavorsForMimeType(r0, r1)     // Catch: java.lang.Exception -> L2b
            goto L30
        L2b:
            r4 = move-exception
            r0 = r4
            r0.printStackTrace()
        L30:
            r0 = r3
            r1 = 0
            java.awt.datatransfer.DataFlavor[] r1 = new java.awt.datatransfer.DataFlavor[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.awt.datatransfer.DataFlavor[] r0 = (java.awt.datatransfer.DataFlavor[]) r0
            net.java.openjdk.cacio.ctc.CTCStringTransferable.HTML_DATA_FLAVORS = r0
            return
    }
}
