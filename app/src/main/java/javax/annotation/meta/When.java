package javax.annotation.meta;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:javax/annotation/meta/When.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:javax/annotation/meta/When.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:javax/annotation/meta/When.class */
public enum When extends java.lang.Enum<javax.annotation.meta.When> {
    public static final javax.annotation.meta.When ALWAYS = null;
    public static final javax.annotation.meta.When UNKNOWN = null;
    public static final javax.annotation.meta.When MAYBE = null;
    public static final javax.annotation.meta.When NEVER = null;
    private static final /* synthetic */ javax.annotation.meta.When[] $VALUES = null;

    public static javax.annotation.meta.When[] values() {
            javax.annotation.meta.When[] r0 = javax.annotation.meta.When.$VALUES
            java.lang.Object r0 = r0.clone()
            javax.annotation.meta.When[] r0 = (javax.annotation.meta.When[]) r0
            return r0
    }

    public static javax.annotation.meta.When valueOf(java.lang.String r3) {
            java.lang.Class<javax.annotation.meta.When> r0 = javax.annotation.meta.When.class
            r1 = r3
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            javax.annotation.meta.When r0 = (javax.annotation.meta.When) r0
            return r0
    }

    When(java.lang.String r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
    }

    static {
            javax.annotation.meta.When r0 = new javax.annotation.meta.When
            r1 = r0
            java.lang.String r2 = "ALWAYS"
            r3 = 0
            r1.<init>(r2, r3)
            javax.annotation.meta.When.ALWAYS = r0
            javax.annotation.meta.When r0 = new javax.annotation.meta.When
            r1 = r0
            java.lang.String r2 = "UNKNOWN"
            r3 = 1
            r1.<init>(r2, r3)
            javax.annotation.meta.When.UNKNOWN = r0
            javax.annotation.meta.When r0 = new javax.annotation.meta.When
            r1 = r0
            java.lang.String r2 = "MAYBE"
            r3 = 2
            r1.<init>(r2, r3)
            javax.annotation.meta.When.MAYBE = r0
            javax.annotation.meta.When r0 = new javax.annotation.meta.When
            r1 = r0
            java.lang.String r2 = "NEVER"
            r3 = 3
            r1.<init>(r2, r3)
            javax.annotation.meta.When.NEVER = r0
            r0 = 4
            javax.annotation.meta.When[] r0 = new javax.annotation.meta.When[r0]
            r1 = r0
            r2 = 0
            javax.annotation.meta.When r3 = javax.annotation.meta.When.ALWAYS
            r1[r2] = r3
            r1 = r0
            r2 = 1
            javax.annotation.meta.When r3 = javax.annotation.meta.When.UNKNOWN
            r1[r2] = r3
            r1 = r0
            r2 = 2
            javax.annotation.meta.When r3 = javax.annotation.meta.When.MAYBE
            r1[r2] = r3
            r1 = r0
            r2 = 3
            javax.annotation.meta.When r3 = javax.annotation.meta.When.NEVER
            r1[r2] = r3
            javax.annotation.meta.When.$VALUES = r0
            return
    }
}
