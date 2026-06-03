package org.lwjgl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/Version.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/Version.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/Version.class */
public final class Version {
    public static final int VERSION_MAJOR = 3;
    public static final int VERSION_MINOR = 3;
    public static final int VERSION_REVISION = 3;
    public static final org.lwjgl.Version.BuildType BUILD_TYPE = null;
    private static final java.lang.String versionPlain = null;
    private static final java.lang.String version = null;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/Version$BuildType.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/Version$BuildType.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/Version$BuildType.class */
    public enum BuildType extends java.lang.Enum<org.lwjgl.Version.BuildType> {
        public static final org.lwjgl.Version.BuildType ALPHA = null;
        public static final org.lwjgl.Version.BuildType BETA = null;
        public static final org.lwjgl.Version.BuildType STABLE = null;
        public final java.lang.String postfix;
        private static final /* synthetic */ org.lwjgl.Version.BuildType[] $VALUES = null;

        public static org.lwjgl.Version.BuildType[] values() {
                org.lwjgl.Version$BuildType[] r0 = org.lwjgl.Version.BuildType.$VALUES
                java.lang.Object r0 = r0.clone()
                org.lwjgl.Version$BuildType[] r0 = (org.lwjgl.Version.BuildType[]) r0
                return r0
        }

        public static org.lwjgl.Version.BuildType valueOf(java.lang.String r3) {
                java.lang.Class<org.lwjgl.Version$BuildType> r0 = org.lwjgl.Version.BuildType.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                org.lwjgl.Version$BuildType r0 = (org.lwjgl.Version.BuildType) r0
                return r0
        }

        BuildType(java.lang.String r5, int r6, java.lang.String r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                r0 = r4
                r1 = r7
                r0.postfix = r1
                return
        }

        static {
                org.lwjgl.Version$BuildType r0 = new org.lwjgl.Version$BuildType
                r1 = r0
                java.lang.String r2 = "ALPHA"
                r3 = 0
                java.lang.String r4 = "a"
                r1.<init>(r2, r3, r4)
                org.lwjgl.Version.BuildType.ALPHA = r0
                org.lwjgl.Version$BuildType r0 = new org.lwjgl.Version$BuildType
                r1 = r0
                java.lang.String r2 = "BETA"
                r3 = 1
                java.lang.String r4 = "b"
                r1.<init>(r2, r3, r4)
                org.lwjgl.Version.BuildType.BETA = r0
                org.lwjgl.Version$BuildType r0 = new org.lwjgl.Version$BuildType
                r1 = r0
                java.lang.String r2 = "STABLE"
                r3 = 2
                java.lang.String r4 = ""
                r1.<init>(r2, r3, r4)
                org.lwjgl.Version.BuildType.STABLE = r0
                r0 = 3
                org.lwjgl.Version$BuildType[] r0 = new org.lwjgl.Version.BuildType[r0]
                r1 = r0
                r2 = 0
                org.lwjgl.Version$BuildType r3 = org.lwjgl.Version.BuildType.ALPHA
                r1[r2] = r3
                r1 = r0
                r2 = 1
                org.lwjgl.Version$BuildType r3 = org.lwjgl.Version.BuildType.BETA
                r1[r2] = r3
                r1 = r0
                r2 = 2
                org.lwjgl.Version$BuildType r3 = org.lwjgl.Version.BuildType.STABLE
                r1[r2] = r3
                org.lwjgl.Version.BuildType.$VALUES = r0
                return
        }
    }

    private Version() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void main(java.lang.String[] r3) {
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = org.lwjgl.Version.version
            r0.println(r1)
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = org.lwjgl.Version.versionPlain
            r0.println(r1)
            return
    }

    public static java.lang.String getVersion() {
            java.lang.String r0 = org.lwjgl.Version.version
            return r0
    }

    static java.lang.String createImplementation(java.lang.String r4, java.lang.String r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "+"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            java.lang.String r2 = "build "
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L27
            r1 = 6
            r2 = r5
            int r2 = r2.length()
            if (r1 >= r2) goto L27
            r1 = r5
            r2 = 6
            java.lang.String r1 = r1.substring(r2)
            goto L28
        L27:
            r1 = r5
        L28:
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6 = r0
            r0 = r4
            java.lang.String r1 = "SNAPSHOT"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L41
            r0 = r4
            java.lang.String r1 = "snapshot"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L55
        L41:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "-snapshot"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L55:
            r0 = r6
            return r0
    }

    @javax.annotation.Nullable
    static java.lang.String findImplementationFromManifest() {
            java.lang.Class<org.lwjgl.Version> r0 = org.lwjgl.Version.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r3 = r0
            r0 = r3
            java.lang.String r1 = "org/lwjgl/Version.class"
            java.net.URL r0 = r0.getResource(r1)
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L74
            r0 = r4
            java.lang.String r0 = r0.toString()
            r5 = r0
            r0 = r5
            java.lang.String r1 = "jar:"
            boolean r0 = r0.startsWith(r1)     // Catch: java.lang.Exception -> L73
            if (r0 == 0) goto L3e
            java.lang.Class<org.lwjgl.Version> r0 = org.lwjgl.Version.class
            java.lang.String r1 = "/META-INF/MANIFEST.MF"
            java.net.URL r0 = r0.getResource(r1)     // Catch: java.lang.Exception -> L73
            r6 = r0
            r0 = r6
            java.lang.Object r0 = java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Exception -> L73
            java.net.URL r0 = (java.net.URL) r0     // Catch: java.lang.Exception -> L73
            java.lang.String r0 = readImplementationFromManifest(r0)     // Catch: java.lang.Exception -> L73
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L3b
            r0 = r7
            return r0
        L3b:
            goto L70
        L3e:
            r0 = r5
            java.lang.String r1 = "resource:"
            boolean r0 = r0.startsWith(r1)     // Catch: java.lang.Exception -> L73
            if (r0 == 0) goto L70
            r0 = r3
            java.lang.String r1 = "META-INF/MANIFEST.MF"
            java.util.Enumeration r0 = r0.getResources(r1)     // Catch: java.lang.Exception -> L73
            r6 = r0
        L4e:
            r0 = r6
            boolean r0 = r0.hasMoreElements()     // Catch: java.lang.Exception -> L73
            if (r0 == 0) goto L70
            r0 = r6
            java.lang.Object r0 = r0.nextElement()     // Catch: java.lang.Exception -> L73
            java.net.URL r0 = (java.net.URL) r0     // Catch: java.lang.Exception -> L73
            java.lang.String r0 = readImplementationFromManifest(r0)     // Catch: java.lang.Exception -> L73
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L6d
            r0 = r7
            return r0
        L6d:
            goto L4e
        L70:
            goto L74
        L73:
            r6 = move-exception
        L74:
            r0 = 0
            return r0
    }

    @javax.annotation.Nullable
    private static java.lang.String readImplementationFromManifest(java.net.URL r4) {
            r0 = r4
            java.io.InputStream r0 = r0.openStream()     // Catch: java.lang.Exception -> L10b
            r5 = r0
            r0 = 0
            r6 = r0
            java.util.jar.Manifest r0 = new java.util.jar.Manifest     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le8 java.lang.Exception -> L10b
            r1 = r0
            r2 = r5
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le8 java.lang.Exception -> L10b
            java.util.jar.Attributes r0 = r0.getMainAttributes()     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le8 java.lang.Exception -> L10b
            r7 = r0
            java.lang.String r0 = "lwjgl"
            r1 = r7
            java.util.jar.Attributes$Name r2 = java.util.jar.Attributes.Name.IMPLEMENTATION_TITLE     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le8 java.lang.Exception -> L10b
            java.lang.String r1 = r1.getValue(r2)     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le8 java.lang.Exception -> L10b
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le8 java.lang.Exception -> L10b
            if (r0 != 0) goto L46
            r0 = 0
            r8 = r0
            r0 = r5
            if (r0 == 0) goto L43
            r0 = r6
            if (r0 == 0) goto L3f
            r0 = r5
            r0.close()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L10b
            goto L43
        L34:
            r9 = move-exception
            r0 = r6
            r1 = r9
            r0.addSuppressed(r1)     // Catch: java.lang.Exception -> L10b
            goto L43
        L3f:
            r0 = r5
            r0.close()     // Catch: java.lang.Exception -> L10b
        L43:
            r0 = r8
            return r0
        L46:
            java.lang.String r0 = "lwjgl.org"
            r1 = r7
            java.util.jar.Attributes$Name r2 = java.util.jar.Attributes.Name.IMPLEMENTATION_VENDOR     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le8 java.lang.Exception -> L10b
            java.lang.String r1 = r1.getValue(r2)     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le8 java.lang.Exception -> L10b
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le8 java.lang.Exception -> L10b
            if (r0 != 0) goto L79
            r0 = 0
            r8 = r0
            r0 = r5
            if (r0 == 0) goto L76
            r0 = r6
            if (r0 == 0) goto L72
            r0 = r5
            r0.close()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L10b
            goto L76
        L67:
            r9 = move-exception
            r0 = r6
            r1 = r9
            r0.addSuppressed(r1)     // Catch: java.lang.Exception -> L10b
            goto L76
        L72:
            r0 = r5
            r0.close()     // Catch: java.lang.Exception -> L10b
        L76:
            r0 = r8
            return r0
        L79:
            r0 = r7
            java.util.jar.Attributes$Name r1 = java.util.jar.Attributes.Name.SPECIFICATION_VERSION     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le8 java.lang.Exception -> L10b
            java.lang.String r0 = r0.getValue(r1)     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le8 java.lang.Exception -> L10b
            r8 = r0
            r0 = r7
            java.util.jar.Attributes$Name r1 = java.util.jar.Attributes.Name.IMPLEMENTATION_VERSION     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le8 java.lang.Exception -> L10b
            java.lang.String r0 = r0.getValue(r1)     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le8 java.lang.Exception -> L10b
            r9 = r0
            r0 = r8
            if (r0 == 0) goto L95
            r0 = r9
            if (r0 != 0) goto Lb9
        L95:
            r0 = 0
            r10 = r0
            r0 = r5
            if (r0 == 0) goto Lb6
            r0 = r6
            if (r0 == 0) goto Lb2
            r0 = r5
            r0.close()     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> L10b
            goto Lb6
        La7:
            r11 = move-exception
            r0 = r6
            r1 = r11
            r0.addSuppressed(r1)     // Catch: java.lang.Exception -> L10b
            goto Lb6
        Lb2:
            r0 = r5
            r0.close()     // Catch: java.lang.Exception -> L10b
        Lb6:
            r0 = r10
            return r0
        Lb9:
            r0 = r8
            r1 = r9
            java.lang.String r0 = createImplementation(r0, r1)     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le8 java.lang.Exception -> L10b
            r10 = r0
            r0 = r5
            if (r0 == 0) goto Le0
            r0 = r6
            if (r0 == 0) goto Ldc
            r0 = r5
            r0.close()     // Catch: java.lang.Throwable -> Ld1 java.lang.Exception -> L10b
            goto Le0
        Ld1:
            r11 = move-exception
            r0 = r6
            r1 = r11
            r0.addSuppressed(r1)     // Catch: java.lang.Exception -> L10b
            goto Le0
        Ldc:
            r0 = r5
            r0.close()     // Catch: java.lang.Exception -> L10b
        Le0:
            r0 = r10
            return r0
        Le3:
            r7 = move-exception
            r0 = r7
            r6 = r0
            r0 = r7
            throw r0     // Catch: java.lang.Throwable -> Le8 java.lang.Exception -> L10b
        Le8:
            r12 = move-exception
            r0 = r5
            if (r0 == 0) goto L108
            r0 = r6
            if (r0 == 0) goto L104
            r0 = r5
            r0.close()     // Catch: java.lang.Throwable -> Lf9 java.lang.Exception -> L10b
            goto L108
        Lf9:
            r13 = move-exception
            r0 = r6
            r1 = r13
            r0.addSuppressed(r1)     // Catch: java.lang.Exception -> L10b
            goto L108
        L104:
            r0 = r5
            r0.close()     // Catch: java.lang.Exception -> L10b
        L108:
            r0 = r12
            throw r0     // Catch: java.lang.Exception -> L10b
        L10b:
            r5 = move-exception
            r0 = 0
            return r0
    }

    static {
            org.lwjgl.Version$BuildType r0 = org.lwjgl.Version.BuildType.STABLE
            org.lwjgl.Version.BUILD_TYPE = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = 3
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 46
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 3
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 46
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 3
            java.lang.StringBuilder r0 = r0.append(r1)
            org.lwjgl.Version$BuildType r1 = org.lwjgl.Version.BUILD_TYPE
            java.lang.String r1 = r1.postfix
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.lwjgl.Version.versionPlain = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = org.lwjgl.Version.versionPlain
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = org.lwjgl.VersionImpl.find()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.lwjgl.Version.version = r0
            return
    }
}
