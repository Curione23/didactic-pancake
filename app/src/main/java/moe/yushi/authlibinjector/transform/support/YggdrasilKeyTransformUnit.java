package moe.yushi.authlibinjector.transform.support;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/transform/support/YggdrasilKeyTransformUnit.class */
public class YggdrasilKeyTransformUnit implements moe.yushi.authlibinjector.transform.TransformUnit {
    public static final java.util.List<java.security.PublicKey> PUBLIC_KEYS = null;




    public YggdrasilKeyTransformUnit() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    private static java.security.PublicKey loadMojangPublicKey() {
            java.lang.Class<moe.yushi.authlibinjector.transform.support.YggdrasilKeyTransformUnit> r0 = moe.yushi.authlibinjector.transform.support.YggdrasilKeyTransformUnit.class
            java.lang.String r1 = "/mojang_publickey.der"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)     // Catch: java.lang.Throwable -> L2e
            r5 = r0
            r0 = r5
            byte[] r0 = moe.yushi.authlibinjector.util.IOUtils.asBytes(r0)     // Catch: java.lang.Throwable -> L1a java.lang.Throwable -> L2e
            java.security.PublicKey r0 = moe.yushi.authlibinjector.util.KeyUtils.parseX509PublicKey(r0)     // Catch: java.lang.Throwable -> L1a java.lang.Throwable -> L2e
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L18
            r0 = r5
            r0.close()     // Catch: java.lang.Throwable -> L2e
        L18:
            r0 = r6
            return r0
        L1a:
            r6 = move-exception
            r0 = r5
            if (r0 == 0) goto L2c
            r0 = r5
            r0.close()     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L2e java.lang.Throwable -> L2e
            goto L2c
        L26:
            r7 = move-exception
            r0 = r6
            r1 = r7
            r0.addSuppressed(r1)     // Catch: java.lang.Throwable -> L2e java.lang.Throwable -> L2e
        L2c:
            r0 = r6
            throw r0     // Catch: java.lang.Throwable -> L2e java.lang.Throwable -> L2e
        L2e:
            r5 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "Failed to load Mojang public key"
            r3 = r5
            r1.<init>(r2, r3)
            throw r0
    }

    @moe.yushi.authlibinjector.transform.CallbackMethod
    public static boolean verifyPropertySignature(java.lang.Object r6) {
            java.lang.invoke.MethodHandles$Lookup r0 = java.lang.invoke.MethodHandles.publicLookup()     // Catch: java.lang.NoSuchMethodException -> L15 java.lang.Throwable -> L78
            r1 = r6
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.NoSuchMethodException -> L15 java.lang.Throwable -> L78
            java.lang.String r2 = "getValue"
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.invoke.MethodType r3 = java.lang.invoke.MethodType.methodType(r3)     // Catch: java.lang.NoSuchMethodException -> L15 java.lang.Throwable -> L78
            java.lang.invoke.MethodHandle r0 = r0.findVirtual(r1, r2, r3)     // Catch: java.lang.NoSuchMethodException -> L15 java.lang.Throwable -> L78
            r9 = r0
            goto L29
        L15:
            r10 = move-exception
            java.lang.invoke.MethodHandles$Lookup r0 = java.lang.invoke.MethodHandles.publicLookup()     // Catch: java.lang.Throwable -> L78
            r1 = r6
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Throwable -> L78
            java.lang.String r2 = "value"
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.invoke.MethodType r3 = java.lang.invoke.MethodType.methodType(r3)     // Catch: java.lang.Throwable -> L78
            java.lang.invoke.MethodHandle r0 = r0.findVirtual(r1, r2, r3)     // Catch: java.lang.Throwable -> L78
            r9 = r0
        L29:
            java.lang.invoke.MethodHandles$Lookup r0 = java.lang.invoke.MethodHandles.publicLookup()     // Catch: java.lang.NoSuchMethodException -> L3f java.lang.Throwable -> L78
            r1 = r6
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.NoSuchMethodException -> L3f java.lang.Throwable -> L78
            java.lang.String r2 = "getSignature"
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.invoke.MethodType r3 = java.lang.invoke.MethodType.methodType(r3)     // Catch: java.lang.NoSuchMethodException -> L3f java.lang.Throwable -> L78
            java.lang.invoke.MethodHandle r0 = r0.findVirtual(r1, r2, r3)     // Catch: java.lang.NoSuchMethodException -> L3f java.lang.Throwable -> L78
            r10 = r0
            goto L54
        L3f:
            r11 = move-exception
            java.lang.invoke.MethodHandles$Lookup r0 = java.lang.invoke.MethodHandles.publicLookup()     // Catch: java.lang.Throwable -> L78
            r1 = r6
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Throwable -> L78
            java.lang.String r2 = "signature"
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.invoke.MethodType r3 = java.lang.invoke.MethodType.methodType(r3)     // Catch: java.lang.Throwable -> L78
            java.lang.invoke.MethodHandle r0 = r0.findVirtual(r1, r2, r3)     // Catch: java.lang.Throwable -> L78
            r10 = r0
        L54:
            r0 = r10
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L78
            r2 = r1
            r3 = 0
            r4 = r6
            r2[r3] = r4     // Catch: java.lang.Throwable -> L78
            java.lang.Object r0 = r0.invokeWithArguments(r1)     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L78
            r7 = r0
            r0 = r9
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L78
            r2 = r1
            r3 = 0
            r4 = r6
            r2[r3] = r4     // Catch: java.lang.Throwable -> L78
            java.lang.Object r0 = r0.invokeWithArguments(r1)     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L78
            r8 = r0
            goto L84
        L78:
            r9 = move-exception
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.ERROR
            java.lang.String r1 = "Failed to get property attributes"
            r2 = r9
            moe.yushi.authlibinjector.util.Logging.log(r0, r1, r2)
            r0 = 0
            return r0
        L84:
            java.util.Base64$Decoder r0 = java.util.Base64.getDecoder()     // Catch: java.lang.IllegalArgumentException -> L8f
            r1 = r7
            byte[] r0 = r0.decode(r1)     // Catch: java.lang.IllegalArgumentException -> L8f
            r9 = r0
            goto Lb1
        L8f:
            r10 = move-exception
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.ERROR
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Malformed signature encoding on property "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = r10
            moe.yushi.authlibinjector.util.Logging.log(r0, r1, r2)
            r0 = 0
            return r0
        Lb1:
            r0 = r8
            byte[] r0 = r0.getBytes()
            r10 = r0
            java.util.List<java.security.PublicKey> r0 = moe.yushi.authlibinjector.transform.support.YggdrasilKeyTransformUnit.PUBLIC_KEYS
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
        Lc1:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L11b
            r0 = r11
            java.lang.Object r0 = r0.next()
            java.security.PublicKey r0 = (java.security.PublicKey) r0
            r12 = r0
            java.lang.String r0 = "SHA1withRSA"
            java.security.Signature r0 = java.security.Signature.getInstance(r0)     // Catch: java.security.GeneralSecurityException -> Lfa
            r13 = r0
            r0 = r13
            r1 = r12
            r0.initVerify(r1)     // Catch: java.security.GeneralSecurityException -> Lfa
            r0 = r13
            r1 = r10
            r0.update(r1)     // Catch: java.security.GeneralSecurityException -> Lfa
            r0 = r13
            r1 = r9
            boolean r0 = r0.verify(r1)     // Catch: java.security.GeneralSecurityException -> Lfa
            if (r0 == 0) goto Lf7
            r0 = 1
            return r0
        Lf7:
            goto L118
        Lfa:
            r13 = move-exception
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.DEBUG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Failed to verify signature with key "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r12
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = r13
            moe.yushi.authlibinjector.util.Logging.log(r0, r1, r2)
        L118:
            goto Lc1
        L11b:
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.WARNING
            java.lang.String r1 = "Failed to verify property signature"
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
            r0 = 0
            return r0
    }

    @moe.yushi.authlibinjector.transform.CallbackMethod
    public static java.security.Signature createDummySignature() {
            moe.yushi.authlibinjector.transform.support.YggdrasilKeyTransformUnit$1 r0 = new moe.yushi.authlibinjector.transform.support.YggdrasilKeyTransformUnit$1
            r1 = r0
            java.lang.String r2 = "authlib-injector-dummy-verify"
            r1.<init>(r2)
            r4 = r0
            r0 = r4
            r1 = 0
            java.security.PublicKey r1 = (java.security.PublicKey) r1     // Catch: java.security.InvalidKeyException -> L15
            r0.initVerify(r1)     // Catch: java.security.InvalidKeyException -> L15
            goto L1f
        L15:
            r5 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            throw r0
        L1f:
            r0 = r4
            return r0
    }

    @Override // moe.yushi.authlibinjector.transform.TransformUnit
    public java.util.Optional<moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassVisitor> transform(java.lang.ClassLoader r8, java.lang.String r9, moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassVisitor r10, moe.yushi.authlibinjector.transform.TransformContext r11) {
            r7 = this;
            java.lang.String r0 = "com.mojang.authlib.properties.Property"
            r1 = r9
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1c
            moe.yushi.authlibinjector.transform.support.YggdrasilKeyTransformUnit$2 r0 = new moe.yushi.authlibinjector.transform.support.YggdrasilKeyTransformUnit$2
            r1 = r0
            r2 = r7
            r3 = 589824(0x90000, float:8.2652E-40)
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5)
            java.util.Optional r0 = java.util.Optional.of(r0)
            return r0
        L1c:
            java.lang.String r0 = "com.mojang.authlib.yggdrasil.YggdrasilServicesKeyInfo"
            r1 = r9
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L38
            moe.yushi.authlibinjector.transform.support.YggdrasilKeyTransformUnit$3 r0 = new moe.yushi.authlibinjector.transform.support.YggdrasilKeyTransformUnit$3
            r1 = r0
            r2 = r7
            r3 = 589824(0x90000, float:8.2652E-40)
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5)
            java.util.Optional r0 = java.util.Optional.of(r0)
            return r0
        L38:
            java.util.Optional r0 = java.util.Optional.empty()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "Yggdrasil Public Key Transformer"
            return r0
    }

    static {
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r1 = r0
            r1.<init>()
            moe.yushi.authlibinjector.transform.support.YggdrasilKeyTransformUnit.PUBLIC_KEYS = r0
            java.util.List<java.security.PublicKey> r0 = moe.yushi.authlibinjector.transform.support.YggdrasilKeyTransformUnit.PUBLIC_KEYS
            java.security.PublicKey r1 = loadMojangPublicKey()
            boolean r0 = r0.add(r1)
            return
    }
}
