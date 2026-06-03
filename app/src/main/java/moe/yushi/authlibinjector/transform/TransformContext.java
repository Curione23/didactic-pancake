package moe.yushi.authlibinjector.transform;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/transform/TransformContext.class */
public interface TransformContext {
    java.lang.String getClassName();

    boolean isInterface();

    void markModified();

    java.util.List<java.lang.String> getStringConstants();

    void invokeCallback(moe.yushi.authlibinjector.internal.org.objectweb.asm.MethodVisitor r1, java.lang.Class<?> r2, java.lang.String r3);

    void addGeneratedMethod(java.lang.String r1, java.util.function.Consumer<moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassVisitor> r2);
}
