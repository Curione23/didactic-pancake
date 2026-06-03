package javax.annotation;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:javax/annotation/MatchesPattern.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:javax/annotation/MatchesPattern.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:javax/annotation/MatchesPattern.class */
@javax.annotation.meta.TypeQualifier(applicableTo = java.lang.String.class)
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface MatchesPattern {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:javax/annotation/MatchesPattern$Checker.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:javax/annotation/MatchesPattern$Checker.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:javax/annotation/MatchesPattern$Checker.class */
    public static class Checker implements javax.annotation.meta.TypeQualifierValidator<javax.annotation.MatchesPattern> {
        public Checker() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        public javax.annotation.meta.When forConstantValue(javax.annotation.MatchesPattern r4, java.lang.Object r5) {
                r3 = this;
                r0 = r4
                java.lang.String r0 = r0.value()
                r1 = r4
                int r1 = r1.flags()
                java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
                r6 = r0
                r0 = r6
                r1 = r5
                java.lang.String r1 = (java.lang.String) r1
                java.util.regex.Matcher r0 = r0.matcher(r1)
                boolean r0 = r0.matches()
                if (r0 == 0) goto L22
                javax.annotation.meta.When r0 = javax.annotation.meta.When.ALWAYS
                return r0
            L22:
                javax.annotation.meta.When r0 = javax.annotation.meta.When.NEVER
                return r0
        }

        @Override // javax.annotation.meta.TypeQualifierValidator
        public /* bridge */ /* synthetic */ javax.annotation.meta.When forConstantValue(java.lang.annotation.Annotation r5, java.lang.Object r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                javax.annotation.MatchesPattern r1 = (javax.annotation.MatchesPattern) r1
                r2 = r6
                javax.annotation.meta.When r0 = r0.forConstantValue(r1, r2)
                return r0
        }
    }

    @javax.annotation.RegEx
    java.lang.String value();

    int flags() default 0;
}
