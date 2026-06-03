package javassist.compiler;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/ProceedHandler.class */
public interface ProceedHandler {
    void doit(javassist.compiler.JvstCodeGen r1, javassist.bytecode.Bytecode r2, javassist.compiler.ast.ASTList r3) throws javassist.compiler.CompileError;

    void setReturnType(javassist.compiler.JvstTypeChecker r1, javassist.compiler.ast.ASTList r2) throws javassist.compiler.CompileError;
}
