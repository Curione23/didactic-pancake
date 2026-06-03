package javax.annotation;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:javax/annotation/Nonnegative.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:javax/annotation/Nonnegative.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:javax/annotation/Nonnegative.class */
@javax.annotation.meta.TypeQualifier(applicableTo = java.lang.Number.class)
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface Nonnegative {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:javax/annotation/Nonnegative$Checker.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:javax/annotation/Nonnegative$Checker.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:javax/annotation/Nonnegative$Checker.class */
    public static class Checker implements javax.annotation.meta.TypeQualifierValidator<javax.annotation.Nonnegative> {
        public Checker() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        public javax.annotation.meta.When forConstantValue(javax.annotation.Nonnegative r6, java.lang.Object r7) {
                r5 = this;
                r0 = r7
                boolean r0 = r0 instanceof java.lang.Number
                if (r0 != 0) goto Lb
                javax.annotation.meta.When r0 = javax.annotation.meta.When.NEVER
                return r0
            Lb:
                r0 = r7
                java.lang.Number r0 = (java.lang.Number) r0
                r9 = r0
                r0 = r9
                boolean r0 = r0 instanceof java.lang.Long
                if (r0 == 0) goto L2c
                r0 = r9
                long r0 = r0.longValue()
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto L27
                r0 = 1
                goto L28
            L27:
                r0 = 0
            L28:
                r8 = r0
                goto L70
            L2c:
                r0 = r9
                boolean r0 = r0 instanceof java.lang.Double
                if (r0 == 0) goto L47
                r0 = r9
                double r0 = r0.doubleValue()
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto L42
                r0 = 1
                goto L43
            L42:
                r0 = 0
            L43:
                r8 = r0
                goto L70
            L47:
                r0 = r9
                boolean r0 = r0 instanceof java.lang.Float
                if (r0 == 0) goto L62
                r0 = r9
                float r0 = r0.floatValue()
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto L5d
                r0 = 1
                goto L5e
            L5d:
                r0 = 0
            L5e:
                r8 = r0
                goto L70
            L62:
                r0 = r9
                int r0 = r0.intValue()
                if (r0 >= 0) goto L6e
                r0 = 1
                goto L6f
            L6e:
                r0 = 0
            L6f:
                r8 = r0
            L70:
                r0 = r8
                if (r0 == 0) goto L78
                javax.annotation.meta.When r0 = javax.annotation.meta.When.NEVER
                return r0
            L78:
                javax.annotation.meta.When r0 = javax.annotation.meta.When.ALWAYS
                return r0
        }

        @Override // javax.annotation.meta.TypeQualifierValidator
        public /* bridge */ /* synthetic */ javax.annotation.meta.When forConstantValue(java.lang.annotation.Annotation r5, java.lang.Object r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                javax.annotation.Nonnegative r1 = (javax.annotation.Nonnegative) r1
                r2 = r6
                javax.annotation.meta.When r0 = r0.forConstantValue(r1, r2)
                return r0
        }
    }

    javax.annotation.meta.When when() default javax.annotation.meta.When.ALWAYS;
}
