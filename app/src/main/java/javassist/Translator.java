package javassist;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/Translator.class */
public interface Translator {
    void start(javassist.ClassPool r1) throws javassist.NotFoundException, javassist.CannotCompileException;

    void onLoad(javassist.ClassPool r1, java.lang.String r2) throws javassist.NotFoundException, javassist.CannotCompileException;
}
