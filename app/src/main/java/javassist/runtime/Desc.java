package javassist.runtime;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/runtime/Desc.class */
public class Desc {
    public static boolean useContextClassLoader;
    private static final java.lang.ThreadLocal<java.lang.Boolean> USE_CONTEXT_CLASS_LOADER_LOCALLY = null;


    public Desc() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void setUseContextClassLoaderLocally() {
            java.lang.ThreadLocal<java.lang.Boolean> r0 = javassist.runtime.Desc.USE_CONTEXT_CLASS_LOADER_LOCALLY
            r1 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.set(r1)
            return
    }

    public static void resetUseContextClassLoaderLocally() {
            java.lang.ThreadLocal<java.lang.Boolean> r0 = javassist.runtime.Desc.USE_CONTEXT_CLASS_LOADER_LOCALLY
            r0.remove()
            return
    }

    private static java.lang.Class<?> getClassObject(java.lang.String r4) throws java.lang.ClassNotFoundException {
            boolean r0 = javassist.runtime.Desc.useContextClassLoader
            if (r0 != 0) goto L15
            java.lang.ThreadLocal<java.lang.Boolean> r0 = javassist.runtime.Desc.USE_CONTEXT_CLASS_LOADER_LOCALLY
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L21
        L15:
            r0 = r4
            r1 = 1
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r2 = r2.getContextClassLoader()
            java.lang.Class r0 = java.lang.Class.forName(r0, r1, r2)
            return r0
        L21:
            r0 = r4
            java.lang.Class r0 = java.lang.Class.forName(r0)
            return r0
    }

    public static java.lang.Class<?> getClazz(java.lang.String r5) {
            r0 = r5
            java.lang.Class r0 = getClassObject(r0)     // Catch: java.lang.ClassNotFoundException -> L5
            return r0
        L5:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "$class: internal error, could not find class '"
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "' (Desc.useContextClassLoader: "
            java.lang.StringBuilder r2 = r2.append(r3)
            boolean r3 = javassist.runtime.Desc.useContextClassLoader
            java.lang.String r3 = java.lang.Boolean.toString(r3)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ")"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r6
            r1.<init>(r2, r3)
            throw r0
    }

    public static java.lang.Class<?>[] getParams(java.lang.String r5) {
            r0 = r5
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = 40
            if (r0 == r1) goto L14
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "$sig: internal error"
            r1.<init>(r2)
            throw r0
        L14:
            r0 = r5
            r1 = r5
            int r1 = r1.length()
            r2 = 1
            r3 = 0
            java.lang.Class[] r0 = getType(r0, r1, r2, r3)
            return r0
    }

    public static java.lang.Class<?> getType(java.lang.String r5) {
            r0 = r5
            r1 = r5
            int r1 = r1.length()
            r2 = 0
            r3 = 0
            java.lang.Class[] r0 = getType(r0, r1, r2, r3)
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L15
            r0 = r6
            int r0 = r0.length
            r1 = 1
            if (r0 == r1) goto L1f
        L15:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "$type: internal error"
            r1.<init>(r2)
            throw r0
        L1f:
            r0 = r6
            r1 = 0
            r0 = r0[r1]
            return r0
    }

    private static java.lang.Class<?>[] getType(java.lang.String r6, int r7, int r8, int r9) {
            r0 = r8
            r1 = r7
            if (r0 < r1) goto La
            r0 = r9
            java.lang.Class[] r0 = new java.lang.Class[r0]
            return r0
        La:
            r0 = r6
            r1 = r8
            char r0 = r0.charAt(r1)
            r11 = r0
            r0 = r11
            switch(r0) {
                case 66: goto L98;
                case 67: goto L90;
                case 68: goto Lc0;
                case 69: goto Ld8;
                case 70: goto Lb8;
                case 71: goto Ld8;
                case 72: goto Ld8;
                case 73: goto La8;
                case 74: goto Lb0;
                case 75: goto Ld8;
                case 76: goto Ld0;
                case 77: goto Ld8;
                case 78: goto Ld8;
                case 79: goto Ld8;
                case 80: goto Ld8;
                case 81: goto Ld8;
                case 82: goto Ld8;
                case 83: goto La0;
                case 84: goto Ld8;
                case 85: goto Ld8;
                case 86: goto Lc8;
                case 87: goto Ld8;
                case 88: goto Ld8;
                case 89: goto Ld8;
                case 90: goto L88;
                case 91: goto Ld0;
                default: goto Ld8;
            }
        L88:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r10 = r0
            goto Ldd
        L90:
            java.lang.Class r0 = java.lang.Character.TYPE
            r10 = r0
            goto Ldd
        L98:
            java.lang.Class r0 = java.lang.Byte.TYPE
            r10 = r0
            goto Ldd
        La0:
            java.lang.Class r0 = java.lang.Short.TYPE
            r10 = r0
            goto Ldd
        La8:
            java.lang.Class r0 = java.lang.Integer.TYPE
            r10 = r0
            goto Ldd
        Lb0:
            java.lang.Class r0 = java.lang.Long.TYPE
            r10 = r0
            goto Ldd
        Lb8:
            java.lang.Class r0 = java.lang.Float.TYPE
            r10 = r0
            goto Ldd
        Lc0:
            java.lang.Class r0 = java.lang.Double.TYPE
            r10 = r0
            goto Ldd
        Lc8:
            java.lang.Class r0 = java.lang.Void.TYPE
            r10 = r0
            goto Ldd
        Ld0:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            java.lang.Class[] r0 = getClassType(r0, r1, r2, r3)
            return r0
        Ld8:
            r0 = r9
            java.lang.Class[] r0 = new java.lang.Class[r0]
            return r0
        Ldd:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = 1
            int r2 = r2 + r3
            r3 = r9
            r4 = 1
            int r3 = r3 + r4
            java.lang.Class[] r0 = getType(r0, r1, r2, r3)
            r12 = r0
            r0 = r12
            r1 = r9
            r2 = r10
            r0[r1] = r2
            r0 = r12
            return r0
    }

    private static java.lang.Class<?>[] getClassType(java.lang.String r6, int r7, int r8, int r9) {
            r0 = r8
            r10 = r0
        L3:
            r0 = r6
            r1 = r10
            char r0 = r0.charAt(r1)
            r1 = 91
            if (r0 != r1) goto L14
            int r10 = r10 + 1
            goto L3
        L14:
            r0 = r6
            r1 = r10
            char r0 = r0.charAt(r1)
            r1 = 76
            if (r0 != r1) goto L38
            r0 = r6
            r1 = 59
            r2 = r10
            int r0 = r0.indexOf(r1, r2)
            r10 = r0
            r0 = r10
            if (r0 >= 0) goto L38
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r1 = r0
            java.lang.String r2 = "bad descriptor"
            r1.<init>(r2)
            throw r0
        L38:
            r0 = r6
            r1 = r8
            char r0 = r0.charAt(r1)
            r1 = 76
            if (r0 != r1) goto L50
            r0 = r6
            r1 = r8
            r2 = 1
            int r1 = r1 + r2
            r2 = r10
            java.lang.String r0 = r0.substring(r1, r2)
            r11 = r0
            goto L5b
        L50:
            r0 = r6
            r1 = r8
            r2 = r10
            r3 = 1
            int r2 = r2 + r3
            java.lang.String r0 = r0.substring(r1, r2)
            r11 = r0
        L5b:
            r0 = r6
            r1 = r7
            r2 = r10
            r3 = 1
            int r2 = r2 + r3
            r3 = r9
            r4 = 1
            int r3 = r3 + r4
            java.lang.Class[] r0 = getType(r0, r1, r2, r3)
            r12 = r0
            r0 = r12
            r1 = r9
            r2 = r11
            r3 = 47
            r4 = 46
            java.lang.String r2 = r2.replace(r3, r4)     // Catch: java.lang.ClassNotFoundException -> L7c
            java.lang.Class r2 = getClassObject(r2)     // Catch: java.lang.ClassNotFoundException -> L7c
            r0[r1] = r2     // Catch: java.lang.ClassNotFoundException -> L7c
            goto L8b
        L7c:
            r13 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r13
            java.lang.String r2 = r2.getMessage()
            r1.<init>(r2)
            throw r0
        L8b:
            r0 = r12
            return r0
    }

    static {
            r0 = 0
            javassist.runtime.Desc.useContextClassLoader = r0
            javassist.runtime.Desc$1 r0 = new javassist.runtime.Desc$1
            r1 = r0
            r1.<init>()
            javassist.runtime.Desc.USE_CONTEXT_CLASS_LOADER_LOCALLY = r0
            return
    }
}
