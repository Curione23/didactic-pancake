package org.apache.commons.compress.harmony.pack200;

/* JADX INFO: loaded from: classes2.dex */
public class Pack200PackerAdapter extends org.apache.commons.compress.harmony.pack200.Pack200Adapter implements org.apache.commons.compress.java.util.jar.Pack200.Packer {
    private final org.apache.commons.compress.harmony.pack200.PackingOptions options;

    public Pack200PackerAdapter() {
            r1 = this;
            r1.<init>()
            org.apache.commons.compress.harmony.pack200.PackingOptions r0 = new org.apache.commons.compress.harmony.pack200.PackingOptions
            r0.<init>()
            r1.options = r0
            return
    }

    @Override // org.apache.commons.compress.harmony.pack200.Pack200Adapter
    protected void firePropertyChange(java.lang.String r3, java.lang.Object r4, java.lang.Object r5) throws java.io.IOException {
            r2 = this;
            super.firePropertyChange(r3, r4, r5)
            if (r5 == 0) goto Lfc
            boolean r0 = r5.equals(r4)
            if (r0 != 0) goto Lfc
            java.lang.String r0 = "pack.class.attribute."
            boolean r1 = r3.startsWith(r0)
            if (r1 == 0) goto L24
            int r4 = r0.length()
            java.lang.String r3 = r3.substring(r4)
            org.apache.commons.compress.harmony.pack200.PackingOptions r4 = r2.options
            java.lang.String r5 = (java.lang.String) r5
            r4.addClassAttributeAction(r3, r5)
            goto Lfc
        L24:
            java.lang.String r0 = "pack.code.attribute."
            boolean r1 = r3.startsWith(r0)
            if (r1 == 0) goto L3d
            int r4 = r0.length()
            java.lang.String r3 = r3.substring(r4)
            org.apache.commons.compress.harmony.pack200.PackingOptions r4 = r2.options
            java.lang.String r5 = (java.lang.String) r5
            r4.addCodeAttributeAction(r3, r5)
            goto Lfc
        L3d:
            java.lang.String r0 = "pack.deflate.hint"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L4e
            org.apache.commons.compress.harmony.pack200.PackingOptions r3 = r2.options
            java.lang.String r5 = (java.lang.String) r5
            r3.setDeflateHint(r5)
            goto Lfc
        L4e:
            java.lang.String r0 = "pack.effort"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L63
            org.apache.commons.compress.harmony.pack200.PackingOptions r3 = r2.options
            java.lang.String r5 = (java.lang.String) r5
            int r4 = org.apache.commons.compress.utils.ParsingUtils.parseIntValue(r5)
            r3.setEffort(r4)
            goto Lfc
        L63:
            java.lang.String r0 = "pack.field.attribute."
            boolean r1 = r3.startsWith(r0)
            if (r1 == 0) goto L7c
            int r4 = r0.length()
            java.lang.String r3 = r3.substring(r4)
            org.apache.commons.compress.harmony.pack200.PackingOptions r4 = r2.options
            java.lang.String r5 = (java.lang.String) r5
            r4.addFieldAttributeAction(r3, r5)
            goto Lfc
        L7c:
            java.lang.String r0 = "pack.keep.file.order"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L90
            org.apache.commons.compress.harmony.pack200.PackingOptions r3 = r2.options
            java.lang.String r5 = (java.lang.String) r5
            boolean r4 = java.lang.Boolean.parseBoolean(r5)
            r3.setKeepFileOrder(r4)
            goto Lfc
        L90:
            java.lang.String r0 = "pack.method.attribute."
            boolean r1 = r3.startsWith(r0)
            if (r1 == 0) goto La8
            int r4 = r0.length()
            java.lang.String r3 = r3.substring(r4)
            org.apache.commons.compress.harmony.pack200.PackingOptions r4 = r2.options
            java.lang.String r5 = (java.lang.String) r5
            r4.addMethodAttributeAction(r3, r5)
            goto Lfc
        La8:
            java.lang.String r0 = "pack.modification.time"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lb8
            org.apache.commons.compress.harmony.pack200.PackingOptions r3 = r2.options
            java.lang.String r5 = (java.lang.String) r5
            r3.setModificationTime(r5)
            goto Lfc
        Lb8:
            java.lang.String r0 = "pack.pass.file."
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto Ld9
            if (r4 == 0) goto Ld1
            java.lang.String r3 = ""
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto Ld1
            org.apache.commons.compress.harmony.pack200.PackingOptions r3 = r2.options
            java.lang.String r4 = (java.lang.String) r4
            r3.removePassFile(r4)
        Ld1:
            org.apache.commons.compress.harmony.pack200.PackingOptions r3 = r2.options
            java.lang.String r5 = (java.lang.String) r5
            r3.addPassFile(r5)
            goto Lfc
        Ld9:
            java.lang.String r4 = "pack.segment.limit"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto Led
            org.apache.commons.compress.harmony.pack200.PackingOptions r3 = r2.options
            java.lang.String r5 = (java.lang.String) r5
            long r4 = org.apache.commons.compress.utils.ParsingUtils.parseLongValue(r5)
            r3.setSegmentLimit(r4)
            goto Lfc
        Led:
            java.lang.String r4 = "pack.unknown.attribute"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto Lfc
            org.apache.commons.compress.harmony.pack200.PackingOptions r3 = r2.options
            java.lang.String r5 = (java.lang.String) r5
            r3.setUnknownAttributeAction(r5)
        Lfc:
            return
    }

    @Override // org.apache.commons.compress.java.util.jar.Pack200.Packer
    public void pack(java.util.jar.JarFile r3, java.io.OutputStream r4) throws java.io.IOException {
            r2 = this;
            if (r3 == 0) goto L2f
            if (r4 == 0) goto L2f
            r0 = 0
            r2.completed(r0)
            org.apache.commons.compress.harmony.pack200.Archive r0 = new org.apache.commons.compress.harmony.pack200.Archive     // Catch: org.apache.commons.compress.harmony.pack200.Pack200Exception -> L19
            org.apache.commons.compress.harmony.pack200.PackingOptions r1 = r2.options     // Catch: org.apache.commons.compress.harmony.pack200.Pack200Exception -> L19
            r0.<init>(r3, r4, r1)     // Catch: org.apache.commons.compress.harmony.pack200.Pack200Exception -> L19
            r0.pack()     // Catch: org.apache.commons.compress.harmony.pack200.Pack200Exception -> L19
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r2.completed(r3)
            return
        L19:
            r3 = move-exception
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to pack Jar:"
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L2f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Must specify both input and output streams"
            r3.<init>(r4)
            throw r3
    }

    @Override // org.apache.commons.compress.java.util.jar.Pack200.Packer
    public void pack(java.util.jar.JarInputStream r3, java.io.OutputStream r4) throws java.io.IOException {
            r2 = this;
            if (r3 == 0) goto L35
            if (r4 == 0) goto L35
            r0 = 0
            r2.completed(r0)
            org.apache.commons.compress.harmony.pack200.PackingOptions r0 = new org.apache.commons.compress.harmony.pack200.PackingOptions
            r0.<init>()
            org.apache.commons.compress.harmony.pack200.Archive r1 = new org.apache.commons.compress.harmony.pack200.Archive     // Catch: org.apache.commons.compress.harmony.pack200.Pack200Exception -> L1f
            r1.<init>(r3, r4, r0)     // Catch: org.apache.commons.compress.harmony.pack200.Pack200Exception -> L1f
            r1.pack()     // Catch: org.apache.commons.compress.harmony.pack200.Pack200Exception -> L1f
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r2.completed(r0)
            r3.close()
            return
        L1f:
            r3 = move-exception
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to pack Jar:"
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L35:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Must specify both input and output streams"
            r3.<init>(r4)
            throw r3
    }
}
