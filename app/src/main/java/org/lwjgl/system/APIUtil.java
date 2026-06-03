package org.lwjgl.system;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/APIUtil.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/APIUtil.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/APIUtil.class */
public final class APIUtil {
    public static final java.io.PrintStream DEBUG_STREAM = null;
    private static final java.util.regex.Pattern API_VERSION_PATTERN = null;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/APIUtil$1.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/APIUtil$1.class
     */
    /* JADX INFO: renamed from: org.lwjgl.system.APIUtil$1, reason: invalid class name */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/APIUtil$1.class */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$lwjgl$system$Platform = null;

        static {
                org.lwjgl.system.Platform[] r0 = org.lwjgl.system.Platform.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.lwjgl.system.APIUtil.AnonymousClass1.$SwitchMap$org$lwjgl$system$Platform = r0
                int[] r0 = org.lwjgl.system.APIUtil.AnonymousClass1.$SwitchMap$org$lwjgl$system$Platform     // Catch: java.lang.NoSuchFieldError -> L17
                org.lwjgl.system.Platform r1 = org.lwjgl.system.Platform.WINDOWS     // Catch: java.lang.NoSuchFieldError -> L17
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L17
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L17
                goto L18
            L17:
                r4 = move-exception
            L18:
                int[] r0 = org.lwjgl.system.APIUtil.AnonymousClass1.$SwitchMap$org$lwjgl$system$Platform     // Catch: java.lang.NoSuchFieldError -> L26
                org.lwjgl.system.Platform r1 = org.lwjgl.system.Platform.LINUX     // Catch: java.lang.NoSuchFieldError -> L26
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L26
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L26
                goto L27
            L26:
                r4 = move-exception
            L27:
                int[] r0 = org.lwjgl.system.APIUtil.AnonymousClass1.$SwitchMap$org$lwjgl$system$Platform     // Catch: java.lang.NoSuchFieldError -> L35
                org.lwjgl.system.Platform r1 = org.lwjgl.system.Platform.MACOSX     // Catch: java.lang.NoSuchFieldError -> L35
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L35
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L35
                goto L36
            L35:
                r4 = move-exception
            L36:
                return
        }
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/APIUtil$APIVersion.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/APIUtil$APIVersion.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/APIUtil$APIVersion.class */
    public static class APIVersion implements java.lang.Comparable<org.lwjgl.system.APIUtil.APIVersion> {
        public final int major;
        public final int minor;

        @javax.annotation.Nullable
        public final java.lang.String revision;

        @javax.annotation.Nullable
        public final java.lang.String implementation;

        public APIVersion(int r7, int r8) {
                r6 = this;
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = 0
                r4 = 0
                r0.<init>(r1, r2, r3, r4)
                return
        }

        public APIVersion(int r4, int r5, @javax.annotation.Nullable java.lang.String r6, @javax.annotation.Nullable java.lang.String r7) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.major = r1
                r0 = r3
                r1 = r5
                r0.minor = r1
                r0 = r3
                r1 = r6
                r0.revision = r1
                r0 = r3
                r1 = r7
                r0.implementation = r1
                return
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r2 = 16
                r1.<init>(r2)
                r5 = r0
                r0 = r5
                r1 = r4
                int r1 = r1.major
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 46
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = r4
                int r1 = r1.minor
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r4
                java.lang.String r0 = r0.revision
                if (r0 == 0) goto L34
                r0 = r5
                r1 = 46
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = r4
                java.lang.String r1 = r1.revision
                java.lang.StringBuilder r0 = r0.append(r1)
            L34:
                r0 = r4
                java.lang.String r0 = r0.implementation
                if (r0 == 0) goto L4e
                r0 = r5
                java.lang.String r1 = " ("
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = r4
                java.lang.String r1 = r1.implementation
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 41
                java.lang.StringBuilder r0 = r0.append(r1)
            L4e:
                r0 = r5
                java.lang.String r0 = r0.toString()
                return r0
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                if (r0 != r1) goto L7
                r0 = 1
                return r0
            L7:
                r0 = r4
                boolean r0 = r0 instanceof org.lwjgl.system.APIUtil.APIVersion
                if (r0 != 0) goto L10
                r0 = 0
                return r0
            L10:
                r0 = r4
                org.lwjgl.system.APIUtil$APIVersion r0 = (org.lwjgl.system.APIUtil.APIVersion) r0
                r5 = r0
                r0 = r3
                int r0 = r0.major
                r1 = r5
                int r1 = r1.major
                if (r0 != r1) goto L4b
                r0 = r3
                int r0 = r0.minor
                r1 = r5
                int r1 = r1.major
                if (r0 != r1) goto L4b
                r0 = r3
                java.lang.String r0 = r0.revision
                r1 = r5
                java.lang.String r1 = r1.revision
                boolean r0 = java.util.Objects.equals(r0, r1)
                if (r0 == 0) goto L4b
                r0 = r3
                java.lang.String r0 = r0.implementation
                r1 = r5
                java.lang.String r1 = r1.implementation
                boolean r0 = java.util.Objects.equals(r0, r1)
                if (r0 == 0) goto L4b
                r0 = 1
                goto L4c
            L4b:
                r0 = 0
            L4c:
                return r0
        }

        public int hashCode() {
                r3 = this;
                r0 = r3
                int r0 = r0.major
                r4 = r0
                r0 = 31
                r1 = r4
                int r0 = r0 * r1
                r1 = r3
                int r1 = r1.minor
                int r0 = r0 + r1
                r4 = r0
                r0 = 31
                r1 = r4
                int r0 = r0 * r1
                r1 = r3
                java.lang.String r1 = r1.revision
                if (r1 == 0) goto L24
                r1 = r3
                java.lang.String r1 = r1.revision
                int r1 = r1.hashCode()
                goto L25
            L24:
                r1 = 0
            L25:
                int r0 = r0 + r1
                r4 = r0
                r0 = 31
                r1 = r4
                int r0 = r0 * r1
                r1 = r3
                java.lang.String r1 = r1.implementation
                if (r1 == 0) goto L3c
                r1 = r3
                java.lang.String r1 = r1.implementation
                int r1 = r1.hashCode()
                goto L3d
            L3c:
                r1 = 0
            L3d:
                int r0 = r0 + r1
                r4 = r0
                r0 = r4
                return r0
        }

        /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(org.lwjgl.system.APIUtil.APIVersion r4) {
                r3 = this;
                r0 = r3
                int r0 = r0.major
                r1 = r4
                int r1 = r1.major
                if (r0 == r1) goto L17
                r0 = r3
                int r0 = r0.major
                r1 = r4
                int r1 = r1.major
                int r0 = java.lang.Integer.compare(r0, r1)
                return r0
            L17:
                r0 = r3
                int r0 = r0.minor
                r1 = r4
                int r1 = r1.minor
                if (r0 == r1) goto L2e
                r0 = r3
                int r0 = r0.minor
                r1 = r4
                int r1 = r1.minor
                int r0 = java.lang.Integer.compare(r0, r1)
                return r0
            L2e:
                r0 = 0
                return r0
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(org.lwjgl.system.APIUtil.APIVersion r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.system.APIUtil$APIVersion r1 = (org.lwjgl.system.APIUtil.APIVersion) r1
                int r0 = r0.compareTo2(r1)
                return r0
        }
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/APIUtil$Encoder.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/APIUtil$Encoder.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/APIUtil$Encoder.class */
    public interface Encoder {
        java.nio.ByteBuffer encode(java.lang.CharSequence r1, boolean r2);
    }

    private static java.io.PrintStream getDebugStream() {
            java.io.PrintStream r0 = java.lang.System.err
            r3 = r0
            org.lwjgl.system.Configuration<java.lang.Object> r0 = org.lwjgl.system.Configuration.DEBUG_STREAM
            java.lang.Object r0 = r0.get()
            r4 = r0
            r0 = r4
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L40
            r0 = r4
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L38
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L38
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L38
            java.lang.reflect.Constructor r0 = r0.getConstructor(r1)     // Catch: java.lang.Exception -> L38
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L38
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L38
            java.util.function.Supplier r0 = (java.util.function.Supplier) r0     // Catch: java.lang.Exception -> L38
            r5 = r0
            r0 = r5
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L38
            java.io.PrintStream r0 = (java.io.PrintStream) r0     // Catch: java.lang.Exception -> L38
            r3 = r0
            goto L63
        L38:
            r5 = move-exception
            r0 = r5
            r0.printStackTrace()
            goto L63
        L40:
            r0 = r4
            boolean r0 = r0 instanceof java.util.function.Supplier
            if (r0 == 0) goto L57
            r0 = r4
            java.util.function.Supplier r0 = (java.util.function.Supplier) r0
            java.lang.Object r0 = r0.get()
            java.io.PrintStream r0 = (java.io.PrintStream) r0
            r3 = r0
            goto L63
        L57:
            r0 = r4
            boolean r0 = r0 instanceof java.io.PrintStream
            if (r0 == 0) goto L63
            r0 = r4
            java.io.PrintStream r0 = (java.io.PrintStream) r0
            r3 = r0
        L63:
            r0 = r3
            return r0
    }

    private APIUtil() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void apiLog(java.lang.CharSequence r4) {
            boolean r0 = org.lwjgl.system.Checks.DEBUG
            if (r0 == 0) goto L24
            java.io.PrintStream r0 = org.lwjgl.system.APIUtil.DEBUG_STREAM
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "[LWJGL] "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r4
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "\n"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.print(r1)
        L24:
            return
    }

    public static void apiLogMore(java.lang.CharSequence r4) {
            boolean r0 = org.lwjgl.system.Checks.DEBUG
            if (r0 == 0) goto L24
            java.io.PrintStream r0 = org.lwjgl.system.APIUtil.DEBUG_STREAM
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "\t"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r4
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "\n"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.print(r1)
        L24:
            return
    }

    public static void apiLogMissing(java.lang.String r4, java.nio.ByteBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.DEBUG
            if (r0 == 0) goto L38
            r0 = r5
            r1 = r5
            int r1 = r1.remaining()
            r2 = 1
            int r1 = r1 - r2
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCII(r0, r1)
            r6 = r0
            java.io.PrintStream r0 = org.lwjgl.system.APIUtil.DEBUG_STREAM
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "[LWJGL] Failed to locate address for "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r4
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " function "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "\n"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.print(r1)
        L38:
            return
    }

    public static java.lang.String apiFindLibrary(java.lang.String r5, java.lang.String r6) {
            org.lwjgl.system.Platform r0 = org.lwjgl.system.Platform.get()
            r1 = r6
            java.lang.String r0 = r0.mapLibraryName(r1)
            r7 = r0
            r0 = r5
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch: java.io.IOException -> L98
            java.nio.file.Path r0 = java.nio.file.Paths.get(r0, r1)     // Catch: java.io.IOException -> L98
            java.nio.file.Path r0 = r0.toAbsolutePath()     // Catch: java.io.IOException -> L98
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = r7
            java.lang.String r2 = (v1, v2) -> { // java.util.function.BiPredicate.test(java.lang.Object, java.lang.Object):boolean
                return lambda$apiFindLibrary$0(r2, v1, v2);
            }     // Catch: java.io.IOException -> L98
            r3 = 0
            java.nio.file.FileVisitOption[] r3 = new java.nio.file.FileVisitOption[r3]     // Catch: java.io.IOException -> L98
            java.util.stream.Stream r0 = java.nio.file.Files.find(r0, r1, r2, r3)     // Catch: java.io.IOException -> L98
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = r8
            java.util.Optional r0 = r0.findFirst()     // Catch: java.lang.Throwable -> L66 java.lang.Throwable -> L6f java.io.IOException -> L98
            java.lang.String r1 = (v0) -> { // java.util.function.Function.apply(java.lang.Object):java.lang.Object
                return v0.toString();
            }     // Catch: java.lang.Throwable -> L66 java.lang.Throwable -> L6f java.io.IOException -> L98
            java.util.Optional r0 = r0.map(r1)     // Catch: java.lang.Throwable -> L66 java.lang.Throwable -> L6f java.io.IOException -> L98
            r1 = r6
            java.lang.Object r0 = r0.orElse(r1)     // Catch: java.lang.Throwable -> L66 java.lang.Throwable -> L6f java.io.IOException -> L98
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L66 java.lang.Throwable -> L6f java.io.IOException -> L98
            r10 = r0
            r0 = r8
            if (r0 == 0) goto L63
            r0 = r9
            if (r0 == 0) goto L5d
            r0 = r8
            r0.close()     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L98
            goto L63
        L51:
            r11 = move-exception
            r0 = r9
            r1 = r11
            r0.addSuppressed(r1)     // Catch: java.io.IOException -> L98
            goto L63
        L5d:
            r0 = r8
            r0.close()     // Catch: java.io.IOException -> L98
        L63:
            r0 = r10
            return r0
        L66:
            r10 = move-exception
            r0 = r10
            r9 = r0
            r0 = r10
            throw r0     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L98
        L6f:
            r12 = move-exception
            r0 = r8
            if (r0 == 0) goto L95
            r0 = r9
            if (r0 == 0) goto L8f
            r0 = r8
            r0.close()     // Catch: java.lang.Throwable -> L83 java.io.IOException -> L98
            goto L95
        L83:
            r13 = move-exception
            r0 = r9
            r1 = r13
            r0.addSuppressed(r1)     // Catch: java.io.IOException -> L98
            goto L95
        L8f:
            r0 = r8
            r0.close()     // Catch: java.io.IOException -> L98
        L95:
            r0 = r12
            throw r0     // Catch: java.io.IOException -> L98
        L98:
            r8 = move-exception
            r0 = r6
            return r0
    }

    public static org.lwjgl.system.SharedLibrary apiCreateLibrary(java.lang.String r4) {
            int[] r0 = org.lwjgl.system.APIUtil.AnonymousClass1.$SwitchMap$org$lwjgl$system$Platform
            org.lwjgl.system.Platform r1 = org.lwjgl.system.Platform.get()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L24;
                case 2: goto L2d;
                case 3: goto L36;
                default: goto L3b;
            }
        L24:
            org.lwjgl.system.windows.WindowsLibrary r0 = new org.lwjgl.system.windows.WindowsLibrary
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            return r0
        L2d:
            org.lwjgl.system.linux.LinuxLibrary r0 = new org.lwjgl.system.linux.LinuxLibrary
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            return r0
        L36:
            r0 = r4
            org.lwjgl.system.macosx.MacOSXLibrary r0 = org.lwjgl.system.macosx.MacOSXLibrary.create(r0)
            return r0
        L3b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static long apiGetFunctionAddress(org.lwjgl.system.FunctionProvider r5, java.lang.String r6) {
            r0 = r5
            r1 = r6
            long r0 = r0.getFunctionAddress(r1)
            r7 = r0
            r0 = r7
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L12
            r0 = r6
            requiredFunctionMissing(r0)
        L12:
            r0 = r7
            return r0
    }

    private static void requiredFunctionMissing(java.lang.String r5) {
            org.lwjgl.system.Configuration<java.lang.Boolean> r0 = org.lwjgl.system.Configuration.DISABLE_FUNCTION_CHECKS
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L2e
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "A required function is missing: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L2e:
            return
    }

    public static long apiGetFunctionAddressOptional(org.lwjgl.system.SharedLibrary r5, java.lang.String r6) {
            r0 = r5
            r1 = r6
            long r0 = r0.getFunctionAddress(r1)
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.DEBUG_FUNCTIONS
            if (r0 == 0) goto L19
            r0 = r7
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L19
            r0 = r5
            r1 = r6
            optionalFunctionMissing(r0, r1)
        L19:
            r0 = r7
            return r0
    }

    private static void optionalFunctionMissing(org.lwjgl.system.SharedLibrary r4, java.lang.String r5) {
            boolean r0 = org.lwjgl.system.Checks.DEBUG
            if (r0 == 0) goto L32
            java.io.PrintStream r0 = org.lwjgl.system.APIUtil.DEBUG_STREAM
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "[LWJGL] Failed to locate address for "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r4
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " function "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r5
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "\n"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.print(r1)
        L32:
            return
    }

    @javax.annotation.Nullable
    public static java.nio.ByteBuffer apiGetMappedBuffer(@javax.annotation.Nullable java.nio.ByteBuffer r5, long r6, int r8) {
            r0 = r5
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r6
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L17
            r0 = r5
            int r0 = r0.capacity()
            r1 = r8
            if (r0 != r1) goto L17
            r0 = r5
            return r0
        L17:
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L21
            r0 = 0
            goto L32
        L21:
            java.lang.Class<? extends java.nio.ByteBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_BYTE
            r1 = r6
            r2 = r8
            java.nio.Buffer r0 = org.lwjgl.system.MemoryUtil.wrap(r0, r1, r2)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.nio.ByteOrder r1 = org.lwjgl.system.MemoryUtil.NATIVE_ORDER
            java.nio.ByteBuffer r0 = r0.order(r1)
        L32:
            return r0
    }

    public static long apiGetBytes(int r5, int r6) {
            r0 = r5
            long r0 = (long) r0
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r1
            r1 = r6
            long r0 = r0 << r1
            return r0
    }

    public static long apiCheckAllocation(int r7, long r8, long r10) {
            boolean r0 = org.lwjgl.system.Checks.DEBUG
            if (r0 == 0) goto L2c
            r0 = r7
            if (r0 >= 0) goto L14
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Invalid number of elements"
            r1.<init>(r2)
            throw r0
        L14:
            r0 = r10
            r1 = -9223372036854775808
            long r0 = r0 + r1
            r1 = r8
            r2 = -9223372036854775808
            long r1 = r1 + r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L2c
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "The request allocation is too large"
            r1.<init>(r2)
            throw r0
        L2c:
            r0 = r8
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.APIUtil.APIVersion apiParseVersion(org.lwjgl.system.Configuration<?> r2) {
            r0 = r2
            java.lang.Object r0 = r0.get()
            r4 = r0
            r0 = r4
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L17
            r0 = r4
            java.lang.String r0 = (java.lang.String) r0
            org.lwjgl.system.APIUtil$APIVersion r0 = apiParseVersion(r0)
            r3 = r0
            goto L28
        L17:
            r0 = r4
            boolean r0 = r0 instanceof org.lwjgl.system.APIUtil.APIVersion
            if (r0 == 0) goto L26
            r0 = r4
            org.lwjgl.system.APIUtil$APIVersion r0 = (org.lwjgl.system.APIUtil.APIVersion) r0
            r3 = r0
            goto L28
        L26:
            r0 = 0
            r3 = r0
        L28:
            r0 = r3
            return r0
    }

    public static org.lwjgl.system.APIUtil.APIVersion apiParseVersion(java.lang.String r8) {
            java.util.regex.Pattern r0 = org.lwjgl.system.APIUtil.API_VERSION_PATTERN
            r1 = r8
            java.util.regex.Matcher r0 = r0.matcher(r1)
            r9 = r0
            r0 = r9
            boolean r0 = r0.matches()
            if (r0 != 0) goto L24
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Malformed API version string [%s]"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r8
            r4[r5] = r6
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r1.<init>(r2)
            throw r0
        L24:
            org.lwjgl.system.APIUtil$APIVersion r0 = new org.lwjgl.system.APIUtil$APIVersion
            r1 = r0
            r2 = r9
            r3 = 1
            java.lang.String r2 = r2.group(r3)
            int r2 = java.lang.Integer.parseInt(r2)
            r3 = r9
            r4 = 2
            java.lang.String r3 = r3.group(r4)
            int r3 = java.lang.Integer.parseInt(r3)
            r4 = r9
            r5 = 3
            java.lang.String r4 = r4.group(r5)
            r5 = r9
            r6 = 4
            java.lang.String r5 = r5.group(r6)
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    public static void apiFilterExtensions(java.util.Set<java.lang.String> r5, org.lwjgl.system.Configuration<java.lang.Object> r6) {
            r0 = r6
            java.lang.Object r0 = r0.get()
            r7 = r0
            r0 = r7
            if (r0 != 0) goto La
            return
        La:
            r0 = r7
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L74
            r0 = r7
            java.lang.String r0 = (java.lang.String) r0
            r8 = r0
            r0 = r8
            r1 = 46
            int r0 = r0.indexOf(r1)
            r1 = -1
            if (r0 == r1) goto L44
            r0 = r8
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L38
            java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.Exception -> L38
            java.util.function.Predicate r0 = (java.util.function.Predicate) r0     // Catch: java.lang.Exception -> L38
            r9 = r0
            r0 = r5
            r1 = r9
            boolean r0 = r0.removeIf(r1)     // Catch: java.lang.Exception -> L38
            goto L71
        L38:
            r9 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            throw r0
        L44:
            r0 = r8
            java.lang.String r1 = ","
            java.lang.String[] r0 = r0.split(r1)
            r9 = r0
            r0 = r9
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r11 = r0
        L54:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto L71
            r0 = r9
            r1 = r11
            r0 = r0[r1]
            r12 = r0
            r0 = r5
            r1 = r12
            boolean r0 = r0.remove(r1)
            int r11 = r11 + 1
            goto L54
        L71:
            goto Lc5
        L74:
            r0 = r7
            boolean r0 = r0 instanceof java.util.List
            if (r0 == 0) goto L8b
            r0 = r7
            java.util.List r0 = (java.util.List) r0
            r8 = r0
            r0 = r5
            r1 = r8
            boolean r0 = r0.removeAll(r1)
            goto Lc5
        L8b:
            r0 = r7
            boolean r0 = r0 instanceof java.util.function.Predicate
            if (r0 == 0) goto La2
            r0 = r7
            java.util.function.Predicate r0 = (java.util.function.Predicate) r0
            r8 = r0
            r0 = r5
            r1 = r8
            boolean r0 = r0.removeIf(r1)
            goto Lc5
        La2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Unsupported "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.String r3 = r3.getProperty()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " value specified."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        Lc5:
            return
    }

    public static java.lang.String apiUnknownToken(int r3) {
            java.lang.String r0 = "Unknown"
            r1 = r3
            java.lang.String r0 = apiUnknownToken(r0, r1)
            return r0
    }

    public static java.lang.String apiUnknownToken(java.lang.String r6, int r7) {
            java.lang.String r0 = "%s [0x%X]"
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r6
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r7
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r3] = r4
            java.lang.String r0 = java.lang.String.format(r0, r1)
            return r0
    }

    public static java.util.Map<java.lang.Integer, java.lang.String> apiClassTokens(@javax.annotation.Nullable java.util.function.BiPredicate<java.lang.reflect.Field, java.lang.Integer> r5, @javax.annotation.Nullable java.util.Map<java.lang.Integer, java.lang.String> r6, java.lang.Class<?>... r7) {
            r0 = r6
            if (r0 != 0) goto Le
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r2 = 64
            r1.<init>(r2)
            r6 = r0
        Le:
            r0 = 25
            r8 = r0
            r0 = r7
            r9 = r0
            r0 = r9
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r11 = r0
        L1c:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto Ld4
            r0 = r9
            r1 = r11
            r0 = r0[r1]
            r12 = r0
            r0 = r12
            if (r0 != 0) goto L32
            goto Lce
        L32:
            r0 = r12
            java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
            r13 = r0
            r0 = r13
            int r0 = r0.length
            r14 = r0
            r0 = 0
            r15 = r0
        L41:
            r0 = r15
            r1 = r14
            if (r0 >= r1) goto Lce
            r0 = r13
            r1 = r15
            r0 = r0[r1]
            r16 = r0
            r0 = r16
            int r0 = r0.getModifiers()
            r1 = r8
            r0 = r0 & r1
            r1 = r8
            if (r0 != r1) goto Lc8
            r0 = r16
            java.lang.Class r0 = r0.getType()
            java.lang.Class r1 = java.lang.Integer.TYPE
            if (r0 != r1) goto Lc8
            r0 = r16
            r1 = 0
            int r0 = r0.getInt(r1)     // Catch: java.lang.IllegalAccessException -> Lc6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.IllegalAccessException -> Lc6
            r17 = r0
            r0 = r5
            if (r0 == 0) goto L84
            r0 = r5
            r1 = r16
            r2 = r17
            boolean r0 = r0.test(r1, r2)     // Catch: java.lang.IllegalAccessException -> Lc6
            if (r0 != 0) goto L84
            goto Lc8
        L84:
            r0 = r6
            r1 = r17
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.IllegalAccessException -> Lc6
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.IllegalAccessException -> Lc6
            r18 = r0
            r0 = r6
            r1 = r17
            r2 = r18
            if (r2 != 0) goto La1
            r2 = r16
            java.lang.String r2 = r2.getName()     // Catch: java.lang.IllegalAccessException -> Lc6
            goto Lbd
        La1:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.IllegalAccessException -> Lc6
            r3 = r2
            r3.<init>()     // Catch: java.lang.IllegalAccessException -> Lc6
            r3 = r18
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.IllegalAccessException -> Lc6
            java.lang.String r3 = "|"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.IllegalAccessException -> Lc6
            r3 = r16
            java.lang.String r3 = r3.getName()     // Catch: java.lang.IllegalAccessException -> Lc6
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.IllegalAccessException -> Lc6
            java.lang.String r2 = r2.toString()     // Catch: java.lang.IllegalAccessException -> Lc6
        Lbd:
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.IllegalAccessException -> Lc6
            goto Lc8
        Lc6:
            r17 = move-exception
        Lc8:
            int r15 = r15 + 1
            goto L41
        Lce:
            int r11 = r11 + 1
            goto L1c
        Ld4:
            r0 = r6
            return r0
    }

    public static long apiArray(org.lwjgl.system.MemoryStack r5, long... r6) {
            r0 = r5
            int r1 = org.lwjgl.system.MemoryStack.POINTER_SIZE
            r2 = r6
            int r2 = r2.length
            int r3 = org.lwjgl.system.MemoryStack.POINTER_SHIFT
            int r2 = r2 << r3
            long r0 = r0.nmalloc(r1, r2)
            r1 = r6
            int r1 = r1.length
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBuffer(r0, r1)
            r7 = r0
            r0 = r6
            r8 = r0
            r0 = r8
            int r0 = r0.length
            r9 = r0
            r0 = 0
            r10 = r0
        L1c:
            r0 = r10
            r1 = r9
            if (r0 >= r1) goto L36
            r0 = r8
            r1 = r10
            r0 = r0[r1]
            r11 = r0
            r0 = r7
            r1 = r11
            org.lwjgl.PointerBuffer r0 = r0.put(r1)
            int r10 = r10 + 1
            goto L1c
        L36:
            r0 = r7
            long r0 = r0.address
            return r0
    }

    public static long apiArray(org.lwjgl.system.MemoryStack r5, java.nio.ByteBuffer... r6) {
            r0 = r5
            int r1 = org.lwjgl.system.MemoryStack.POINTER_SIZE
            r2 = r6
            int r2 = r2.length
            int r3 = org.lwjgl.system.MemoryStack.POINTER_SHIFT
            int r2 = r2 << r3
            long r0 = r0.nmalloc(r1, r2)
            r1 = r6
            int r1 = r1.length
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBuffer(r0, r1)
            r7 = r0
            r0 = r6
            r8 = r0
            r0 = r8
            int r0 = r0.length
            r9 = r0
            r0 = 0
            r10 = r0
        L1c:
            r0 = r10
            r1 = r9
            if (r0 >= r1) goto L36
            r0 = r8
            r1 = r10
            r0 = r0[r1]
            r11 = r0
            r0 = r7
            r1 = r11
            org.lwjgl.PointerBuffer r0 = r0.put(r1)
            int r10 = r10 + 1
            goto L1c
        L36:
            r0 = r7
            long r0 = r0.address
            return r0
    }

    public static long apiArrayp(org.lwjgl.system.MemoryStack r4, java.nio.ByteBuffer... r5) {
            r0 = r4
            r1 = r5
            long r0 = apiArray(r0, r1)
            r6 = r0
            r0 = r4
            r1 = r5
            int r1 = r1.length
            org.lwjgl.PointerBuffer r0 = r0.mallocPointer(r1)
            r8 = r0
            r0 = r5
            r9 = r0
            r0 = r9
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r11 = r0
        L19:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto L39
            r0 = r9
            r1 = r11
            r0 = r0[r1]
            r12 = r0
            r0 = r8
            r1 = r12
            int r1 = r1.remaining()
            long r1 = (long) r1
            org.lwjgl.PointerBuffer r0 = r0.put(r1)
            int r11 = r11 + 1
            goto L19
        L39:
            r0 = r6
            return r0
    }

    public static long apiArray(org.lwjgl.system.MemoryStack r5, org.lwjgl.system.APIUtil.Encoder r6, java.lang.CharSequence... r7) {
            r0 = r5
            r1 = r7
            int r1 = r1.length
            org.lwjgl.PointerBuffer r0 = r0.mallocPointer(r1)
            r8 = r0
            r0 = r7
            r9 = r0
            r0 = r9
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r11 = r0
        L12:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto L34
            r0 = r9
            r1 = r11
            r0 = r0[r1]
            r12 = r0
            r0 = r8
            r1 = r6
            r2 = r12
            r3 = 1
            java.nio.ByteBuffer r1 = r1.encode(r2, r3)
            org.lwjgl.PointerBuffer r0 = r0.put(r1)
            int r11 = r11 + 1
            goto L12
        L34:
            r0 = r8
            long r0 = r0.address
            return r0
    }

    public static long apiArrayi(org.lwjgl.system.MemoryStack r4, org.lwjgl.system.APIUtil.Encoder r5, java.lang.CharSequence... r6) {
            r0 = r4
            r1 = r6
            int r1 = r1.length
            org.lwjgl.PointerBuffer r0 = r0.mallocPointer(r1)
            r7 = r0
            r0 = r4
            r1 = r6
            int r1 = r1.length
            java.nio.IntBuffer r0 = r0.mallocInt(r1)
            r8 = r0
            r0 = r6
            r9 = r0
            r0 = r9
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r11 = r0
        L1a:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto L4b
            r0 = r9
            r1 = r11
            r0 = r0[r1]
            r12 = r0
            r0 = r5
            r1 = r12
            r2 = 0
            java.nio.ByteBuffer r0 = r0.encode(r1, r2)
            r13 = r0
            r0 = r7
            r1 = r13
            org.lwjgl.PointerBuffer r0 = r0.put(r1)
            r0 = r8
            r1 = r13
            int r1 = r1.capacity()
            java.nio.IntBuffer r0 = r0.put(r1)
            int r11 = r11 + 1
            goto L1a
        L4b:
            r0 = r7
            long r0 = r0.address
            return r0
    }

    public static long apiArrayp(org.lwjgl.system.MemoryStack r4, org.lwjgl.system.APIUtil.Encoder r5, java.lang.CharSequence... r6) {
            r0 = r4
            r1 = r6
            int r1 = r1.length
            org.lwjgl.PointerBuffer r0 = r0.mallocPointer(r1)
            r7 = r0
            r0 = r4
            r1 = r6
            int r1 = r1.length
            org.lwjgl.PointerBuffer r0 = r0.mallocPointer(r1)
            r8 = r0
            r0 = r6
            r9 = r0
            r0 = r9
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r11 = r0
        L1a:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto L4c
            r0 = r9
            r1 = r11
            r0 = r0[r1]
            r12 = r0
            r0 = r5
            r1 = r12
            r2 = 0
            java.nio.ByteBuffer r0 = r0.encode(r1, r2)
            r13 = r0
            r0 = r7
            r1 = r13
            org.lwjgl.PointerBuffer r0 = r0.put(r1)
            r0 = r8
            r1 = r13
            int r1 = r1.capacity()
            long r1 = (long) r1
            org.lwjgl.PointerBuffer r0 = r0.put(r1)
            int r11 = r11 + 1
            goto L1a
        L4c:
            r0 = r7
            long r0 = r0.address
            return r0
    }

    public static void apiArrayFree(long r7, int r9) {
            r0 = r9
            r10 = r0
        L2:
            int r10 = r10 + (-1)
            r0 = r10
            if (r0 < 0) goto L1d
            r0 = r7
            r1 = r10
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            int r2 = org.lwjgl.system.MemoryStack.POINTER_SIZE
            long r2 = (long) r2
            long r1 = r1 * r2
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.system.MemoryUtil.nmemFree(r0)
            goto L2
        L1d:
            return
    }

    public static org.lwjgl.system.libffi.FFIType apiCreateStruct(org.lwjgl.system.libffi.FFIType... r6) {
            org.lwjgl.system.MemoryUtil$MemoryAllocator r0 = org.lwjgl.system.MemoryUtil.getAllocator()
            r7 = r0
            r0 = r7
            r1 = r6
            int r1 = r1.length
            r2 = 1
            int r1 = r1 + r2
            int r2 = org.lwjgl.system.MemoryStack.POINTER_SIZE
            int r1 = r1 * r2
            long r1 = (long) r1
            long r0 = r0.malloc(r1)
            r1 = r6
            int r1 = r1.length
            r2 = 1
            int r1 = r1 + r2
            org.lwjgl.PointerBuffer r0 = org.lwjgl.PointerBuffer.create(r0, r1)
            r8 = r0
            r0 = 0
            r9 = r0
        L1d:
            r0 = r9
            r1 = r6
            int r1 = r1.length
            if (r0 >= r1) goto L32
            r0 = r8
            r1 = r9
            r2 = r6
            r3 = r9
            r2 = r2[r3]
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            int r9 = r9 + 1
            goto L1d
        L32:
            r0 = r8
            r1 = r6
            int r1 = r1.length
            r2 = 0
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            r0 = r7
            r1 = 1
            int r2 = org.lwjgl.system.libffi.FFIType.SIZEOF
            long r2 = (long) r2
            long r0 = r0.calloc(r1, r2)
            org.lwjgl.system.libffi.FFIType r0 = org.lwjgl.system.libffi.FFIType.create(r0)
            r1 = 13
            org.lwjgl.system.libffi.FFIType r0 = r0.type(r1)
            r1 = r8
            org.lwjgl.system.libffi.FFIType r0 = r0.elements(r1)
            return r0
    }

    private static org.lwjgl.system.libffi.FFIType prep(org.lwjgl.system.libffi.FFIType r5) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackPush()
            r6 = r0
            r0 = 0
            r7 = r0
            r0 = r6
            org.lwjgl.system.libffi.FFICIF r0 = org.lwjgl.system.libffi.FFICIF.calloc(r0)     // Catch: java.lang.Throwable -> L40 java.lang.Throwable -> L45
            r8 = r0
            r0 = r8
            int r1 = org.lwjgl.system.libffi.LibFFI.FFI_DEFAULT_ABI     // Catch: java.lang.Throwable -> L40 java.lang.Throwable -> L45
            r2 = r5
            r3 = 0
            int r0 = org.lwjgl.system.libffi.LibFFI.ffi_prep_cif(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L40 java.lang.Throwable -> L45
            if (r0 == 0) goto L21
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L40 java.lang.Throwable -> L45
            r1 = r0
            java.lang.String r2 = "Failed to prepare LibFFI type."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L40 java.lang.Throwable -> L45
            throw r0     // Catch: java.lang.Throwable -> L40 java.lang.Throwable -> L45
        L21:
            r0 = r6
            if (r0 == 0) goto L68
            r0 = r7
            if (r0 == 0) goto L39
            r0 = r6
            r0.close()     // Catch: java.lang.Throwable -> L30
            goto L68
        L30:
            r8 = move-exception
            r0 = r7
            r1 = r8
            r0.addSuppressed(r1)
            goto L68
        L39:
            r0 = r6
            r0.close()
            goto L68
        L40:
            r8 = move-exception
            r0 = r8
            r7 = r0
            r0 = r8
            throw r0     // Catch: java.lang.Throwable -> L45
        L45:
            r9 = move-exception
            r0 = r6
            if (r0 == 0) goto L65
            r0 = r7
            if (r0 == 0) goto L61
            r0 = r6
            r0.close()     // Catch: java.lang.Throwable -> L56
            goto L65
        L56:
            r10 = move-exception
            r0 = r7
            r1 = r10
            r0.addSuppressed(r1)
            goto L65
        L61:
            r0 = r6
            r0.close()
        L65:
            r0 = r9
            throw r0
        L68:
            r0 = r5
            return r0
    }

    public static org.lwjgl.system.libffi.FFIType apiCreateUnion(org.lwjgl.system.libffi.FFIType... r6) {
            org.lwjgl.system.MemoryUtil$MemoryAllocator r0 = org.lwjgl.system.MemoryUtil.getAllocator()
            r7 = r0
            r0 = r6
            r1 = 0
            r0 = r0[r1]
            org.lwjgl.system.libffi.FFIType r0 = prep(r0)
            r8 = r0
            r0 = r6
            r1 = 0
            r0 = r0[r1]
            short r0 = r0.alignment()
            r9 = r0
            r0 = 1
            r10 = r0
        L15:
            r0 = r10
            r1 = r6
            int r1 = r1.length
            if (r0 >= r1) goto L4a
            r0 = r6
            r1 = r10
            r0 = r0[r1]
            org.lwjgl.system.libffi.FFIType r0 = prep(r0)
            r11 = r0
            r0 = r8
            long r0 = r0.size()
            r1 = r11
            long r1 = r1.size()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L35
            r0 = r11
            r8 = r0
        L35:
            r0 = r9
            r1 = r11
            short r1 = r1.alignment()
            if (r0 >= r1) goto L44
            r0 = r11
            short r0 = r0.alignment()
            r9 = r0
        L44:
            int r10 = r10 + 1
            goto L15
        L4a:
            r0 = r7
            int r1 = org.lwjgl.system.libffi.FFIType.SIZEOF
            long r1 = (long) r1
            long r0 = r0.malloc(r1)
            org.lwjgl.system.libffi.FFIType r0 = org.lwjgl.system.libffi.FFIType.create(r0)
            r1 = r8
            long r1 = r1.size()
            org.lwjgl.system.libffi.FFIType r0 = r0.size(r1)
            r1 = r9
            org.lwjgl.system.libffi.FFIType r0 = r0.alignment(r1)
            r1 = 13
            org.lwjgl.system.libffi.FFIType r0 = r0.type(r1)
            r1 = r7
            r2 = 2
            int r3 = org.lwjgl.system.MemoryStack.POINTER_SIZE
            int r2 = r2 * r3
            long r2 = (long) r2
            long r1 = r1.malloc(r2)
            r2 = 2
            org.lwjgl.PointerBuffer r1 = org.lwjgl.PointerBuffer.create(r1, r2)
            r2 = 0
            r3 = r8
            org.lwjgl.PointerBuffer r1 = r1.put(r2, r3)
            r2 = 1
            r3 = 0
            org.lwjgl.PointerBuffer r1 = r1.put(r2, r3)
            org.lwjgl.system.libffi.FFIType r0 = r0.elements(r1)
            return r0
    }

    public static org.lwjgl.system.libffi.FFIType apiCreateArray(org.lwjgl.system.libffi.FFIType r6, int r7) {
            org.lwjgl.system.MemoryUtil$MemoryAllocator r0 = org.lwjgl.system.MemoryUtil.getAllocator()
            r8 = r0
            r0 = r8
            r1 = r7
            r2 = 1
            int r1 = r1 + r2
            int r2 = org.lwjgl.system.MemoryStack.POINTER_SIZE
            int r1 = r1 * r2
            long r1 = (long) r1
            long r0 = r0.malloc(r1)
            r1 = r7
            r2 = 1
            int r1 = r1 + r2
            org.lwjgl.PointerBuffer r0 = org.lwjgl.PointerBuffer.create(r0, r1)
            r9 = r0
            r0 = 0
            r10 = r0
        L1c:
            r0 = r10
            r1 = r7
            if (r0 >= r1) goto L30
            r0 = r9
            r1 = r10
            r2 = r6
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            int r10 = r10 + 1
            goto L1c
        L30:
            r0 = r9
            r1 = r7
            r2 = 0
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            r0 = r8
            r1 = 1
            int r2 = org.lwjgl.system.libffi.FFIType.SIZEOF
            long r2 = (long) r2
            long r0 = r0.calloc(r1, r2)
            org.lwjgl.system.libffi.FFIType r0 = org.lwjgl.system.libffi.FFIType.create(r0)
            r1 = 13
            org.lwjgl.system.libffi.FFIType r0 = r0.type(r1)
            r1 = r9
            org.lwjgl.system.libffi.FFIType r0 = r0.elements(r1)
            return r0
    }

    public static org.lwjgl.system.libffi.FFICIF apiCreateCIF(int r5, org.lwjgl.system.libffi.FFIType r6, org.lwjgl.system.libffi.FFIType... r7) {
            org.lwjgl.system.MemoryUtil$MemoryAllocator r0 = org.lwjgl.system.MemoryUtil.getAllocator()
            r8 = r0
            r0 = r8
            r1 = r7
            int r1 = r1.length
            int r2 = org.lwjgl.system.MemoryStack.POINTER_SIZE
            int r1 = r1 * r2
            long r1 = (long) r1
            long r0 = r0.malloc(r1)
            r1 = r7
            int r1 = r1.length
            org.lwjgl.PointerBuffer r0 = org.lwjgl.PointerBuffer.create(r0, r1)
            r9 = r0
            r0 = 0
            r10 = r0
        L1b:
            r0 = r10
            r1 = r7
            int r1 = r1.length
            if (r0 >= r1) goto L34
            r0 = r9
            r1 = r10
            r2 = r7
            r3 = r10
            r2 = r2[r3]
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            int r10 = r10 + 1
            goto L1b
        L34:
            r0 = r8
            int r1 = org.lwjgl.system.libffi.FFICIF.SIZEOF
            long r1 = (long) r1
            long r0 = r0.malloc(r1)
            org.lwjgl.system.libffi.FFICIF r0 = org.lwjgl.system.libffi.FFICIF.create(r0)
            r10 = r0
            r0 = r10
            r1 = r5
            r2 = r6
            r3 = r9
            int r0 = org.lwjgl.system.libffi.LibFFI.ffi_prep_cif(r0, r1, r2, r3)
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L6f
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Failed to prepare libffi CIF: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r11
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L6f:
            r0 = r10
            return r0
    }

    public static org.lwjgl.system.libffi.FFICIF apiCreateCIFVar(int r6, int r7, org.lwjgl.system.libffi.FFIType r8, org.lwjgl.system.libffi.FFIType... r9) {
            org.lwjgl.system.MemoryUtil$MemoryAllocator r0 = org.lwjgl.system.MemoryUtil.getAllocator()
            r10 = r0
            r0 = r10
            r1 = r9
            int r1 = r1.length
            int r2 = org.lwjgl.system.MemoryStack.POINTER_SIZE
            int r1 = r1 * r2
            long r1 = (long) r1
            long r0 = r0.malloc(r1)
            r1 = r9
            int r1 = r1.length
            org.lwjgl.PointerBuffer r0 = org.lwjgl.PointerBuffer.create(r0, r1)
            r11 = r0
            r0 = 0
            r12 = r0
        L1d:
            r0 = r12
            r1 = r9
            int r1 = r1.length
            if (r0 >= r1) goto L36
            r0 = r11
            r1 = r12
            r2 = r9
            r3 = r12
            r2 = r2[r3]
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            int r12 = r12 + 1
            goto L1d
        L36:
            r0 = r10
            int r1 = org.lwjgl.system.libffi.FFICIF.SIZEOF
            long r1 = (long) r1
            long r0 = r0.malloc(r1)
            org.lwjgl.system.libffi.FFICIF r0 = org.lwjgl.system.libffi.FFICIF.create(r0)
            r12 = r0
            r0 = r12
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r11
            int r0 = org.lwjgl.system.libffi.LibFFI.ffi_prep_cif_var(r0, r1, r2, r3, r4)
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L73
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Failed to prepare libffi var CIF: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r13
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L73:
            r0 = r12
            return r0
    }

    public static int apiStdcall() {
            org.lwjgl.system.Platform r0 = org.lwjgl.system.Platform.get()
            org.lwjgl.system.Platform r1 = org.lwjgl.system.Platform.WINDOWS
            if (r0 != r1) goto L15
            boolean r0 = org.lwjgl.system.Pointer.BITS32
            if (r0 == 0) goto L15
            int r0 = org.lwjgl.system.libffi.LibFFI.FFI_STDCALL
            goto L18
        L15:
            int r0 = org.lwjgl.system.libffi.LibFFI.FFI_DEFAULT_ABI
        L18:
            return r0
    }

    public static void apiClosureRet(long r5, boolean r7) {
            r0 = r5
            r1 = r7
            if (r1 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void apiClosureRet(long r7, byte r9) {
            r0 = r7
            r1 = r9
            long r1 = (long) r1
            r2 = 255(0xff, double:1.26E-321)
            long r1 = r1 & r2
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void apiClosureRet(long r7, short r9) {
            r0 = r7
            r1 = r9
            long r1 = (long) r1
            r2 = 65535(0xffff, double:3.23786E-319)
            long r1 = r1 & r2
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void apiClosureRet(long r7, int r9) {
            r0 = r7
            r1 = r9
            long r1 = (long) r1
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r2
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void apiClosureRetL(long r5, long r7) {
            r0 = r5
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void apiClosureRetP(long r5, long r7) {
            r0 = r5
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void apiClosureRet(long r4, float r6) {
            r0 = r4
            r1 = r6
            org.lwjgl.system.MemoryUtil.memPutFloat(r0, r1)
            return
    }

    public static void apiClosureRet(long r5, double r7) {
            r0 = r5
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutDouble(r0, r1)
            return
    }

    private static /* synthetic */ boolean lambda$apiFindLibrary$0(java.lang.String r3, java.nio.file.Path r4, java.nio.file.attribute.BasicFileAttributes r5) {
            r0 = r5
            boolean r0 = r0.isRegularFile()
            if (r0 == 0) goto L1f
            r0 = r4
            java.nio.file.Path r0 = r0.getFileName()
            java.lang.String r0 = r0.toString()
            r1 = r3
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            return r0
    }

    static {
            java.io.PrintStream r0 = getDebugStream()
            org.lwjgl.system.APIUtil.DEBUG_STREAM = r0
            java.lang.String r0 = "[^\\d\\n\\r]*"
            r3 = r0
            java.lang.String r0 = "(\\d+)[.](\\d+)(?:[.](\\S+))?"
            r4 = r0
            java.lang.String r0 = "(?:\\s+(.+?))?\\s*"
            r5 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "^"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "$"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 32
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            org.lwjgl.system.APIUtil.API_VERSION_PATTERN = r0
            return
    }
}
