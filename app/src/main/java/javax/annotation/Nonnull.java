package javax.annotation;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:javax/annotation/Nonnull.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:javax/annotation/Nonnull.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:javax/annotation/Nonnull.class */
@javax.annotation.meta.TypeQualifier
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface Nonnull {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:javax/annotation/Nonnull$Checker.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:javax/annotation/Nonnull$Checker.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:javax/annotation/Nonnull$Checker.class */
    public static class Checker implements javax.annotation.meta.TypeQualifierValidator<javax.annotation.Nonnull> {
        public Checker() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        public javax.annotation.meta.When forConstantValue(javax.annotation.Nonnull r3, java.lang.Object r4) {
                r2 = this;
                r0 = r4
                if (r0 != 0) goto L8
                javax.annotation.meta.When r0 = javax.annotation.meta.When.NEVER
                return r0
            L8:
                javax.annotation.meta.When r0 = javax.annotation.meta.When.ALWAYS
                return r0
        }

        @Override // javax.annotation.meta.TypeQualifierValidator
        public /* bridge */ /* synthetic */ javax.annotation.meta.When forConstantValue(java.lang.annotation.Annotation r5, java.lang.Object r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                javax.annotation.Nonnull r1 = (javax.annotation.Nonnull) r1
                r2 = r6
                javax.annotation.meta.When r0 = r0.forConstantValue(r1, r2)
                return r0
        }
    }

    javax.annotation.meta.When when() default javax.annotation.meta.When.ALWAYS;
}
