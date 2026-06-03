package javax.annotation;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:javax/annotation/Syntax.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:javax/annotation/Syntax.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:javax/annotation/Syntax.class */
@javax.annotation.meta.TypeQualifier(applicableTo = java.lang.CharSequence.class)
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface Syntax {
    java.lang.String value();

    javax.annotation.meta.When when() default javax.annotation.meta.When.ALWAYS;
}
