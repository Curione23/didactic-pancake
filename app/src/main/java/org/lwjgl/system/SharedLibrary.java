package org.lwjgl.system;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/SharedLibrary.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/SharedLibrary.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/SharedLibrary.class */
public interface SharedLibrary extends org.lwjgl.system.FunctionProvider, org.lwjgl.system.NativeResource, org.lwjgl.system.Pointer {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/SharedLibrary$Default.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/SharedLibrary$Default.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/SharedLibrary$Default.class */
    public static abstract class Default extends org.lwjgl.system.Pointer.Default implements org.lwjgl.system.SharedLibrary {
        private final java.lang.String name;

        protected Default(java.lang.String r5, long r6) {
                r4 = this;
                r0 = r4
                r1 = r6
                r0.<init>(r1)
                r0 = r4
                r1 = r5
                r0.name = r1
                return
        }

        @Override // org.lwjgl.system.SharedLibrary
        public java.lang.String getName() {
                r2 = this;
                r0 = r2
                java.lang.String r0 = r0.name
                return r0
        }
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/SharedLibrary$Delegate.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/SharedLibrary$Delegate.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/SharedLibrary$Delegate.class */
    public static abstract class Delegate implements org.lwjgl.system.SharedLibrary {
        protected final org.lwjgl.system.SharedLibrary library;

        protected Delegate(org.lwjgl.system.SharedLibrary r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.library = r1
                return
        }

        @Override // org.lwjgl.system.SharedLibrary
        public java.lang.String getName() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.SharedLibrary r0 = r0.library
                java.lang.String r0 = r0.getName()
                return r0
        }

        @Override // org.lwjgl.system.SharedLibrary
        @javax.annotation.Nullable
        public java.lang.String getPath() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.SharedLibrary r0 = r0.library
                java.lang.String r0 = r0.getPath()
                return r0
        }

        @Override // org.lwjgl.system.Pointer
        public long address() {
                r3 = this;
                r0 = r3
                org.lwjgl.system.SharedLibrary r0 = r0.library
                long r0 = r0.address()
                return r0
        }

        @Override // org.lwjgl.system.NativeResource
        public void free() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.SharedLibrary r0 = r0.library
                r0.free()
                return
        }
    }

    java.lang.String getName();

    @javax.annotation.Nullable
    java.lang.String getPath();
}
