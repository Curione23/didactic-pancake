package org.lwjgl.system;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/JNI.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/JNI.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/JNI.class */
public final class JNI {
    private JNI() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static native byte invokePB(long r0, long r2);

    public static native short invokeC(long r0);

    public static native short invokeC(int r0, long r1);

    public static native short invokePC(long r0, long r2);

    public static native short invokeCC(int r0, short r1, long r2);

    public static native short invokeCC(short r0, boolean r1, long r2);

    public static native short invokeJC(int r0, int r1, long r2, long r4);

    public static native short invokeCUC(short r0, byte r1, long r2);

    public static native short invokePCC(long r0, short r2, long r3);

    public static native short invokeCCC(short r0, short r1, boolean r2, long r3);

    public static native short invokePCC(int r0, long r1, short r3, long r4);

    public static native short invokePCC(long r0, int r2, short r3, long r4);

    public static native short invokeUPC(byte r0, long r1, boolean r3, long r4);

    public static native short invokeCJC(int r0, boolean r1, short r2, int r3, long r4, long r6);

    public static native short invokeCPCC(short r0, long r1, short r3, long r4);

    public static native short invokePPCC(long r0, long r2, short r4, long r5);

    public static native short invokeCCJC(short r0, short r1, int r2, long r3, long r5);

    public static native short invokePCCC(long r0, short r2, short r3, int r4, int r5, long r6);

    public static native short invokeCCCCC(short r0, short r1, short r2, short r3, long r4);

    public static native short invokePJUPC(long r0, long r2, byte r4, long r5, long r7);

    public static native short invokeCCJPC(short r0, boolean r1, short r2, int r3, long r4, long r6, long r8);

    public static native short invokePCCCCC(long r0, short r2, short r3, short r4, short r5, long r6);

    public static native short invokeCCCJPC(short r0, short r1, short r2, boolean r3, int r4, long r5, long r7, long r9);

    public static native short invokeCCCJPC(short r0, short r1, boolean r2, short r3, int r4, long r5, long r7, long r9);

    public static native double invokeD(long r0);

    public static native double invokeD(int r0, long r1);

    public static native double invokePD(long r0, long r2);

    public static native double invokePD(long r0, int r2, long r3);

    public static native double invokePD(long r0, int r2, int r3, long r4);

    public static native double invokePPD(long r0, long r2, long r4);

    public static native float invokeF(int r0, long r1);

    public static native float invokePF(long r0, long r2);

    public static native float invokePF(long r0, int r2, long r3);

    public static native float invokePF(long r0, float r2, float r3, long r4);

    public static native float invokePF(long r0, int r2, int r3, long r4);

    public static native float invokePPF(long r0, long r2, long r4);

    public static native float invokePPF(long r0, int r2, long r3, long r5);

    public static native float invokePPF(long r0, float r2, long r3, int r5, long r6);

    public static native int invokeI(long r0);

    public static native int invokeI(int r0, long r1);

    public static native int invokeI(boolean r0, long r1);

    public static native int invokeI(int r0, int r1, long r2);

    public static native int invokeI(int r0, boolean r1, long r2);

    public static native int invokeI(int r0, int r1, int r2, long r3);

    public static native int invokePI(long r0, long r2);

    public static native int invokeCI(int r0, short r1, long r2);

    public static native int invokePI(int r0, long r1, long r3);

    public static native int invokePI(long r0, int r2, long r3);

    public static native int invokePI(long r0, int r2, int r3, long r4);

    public static native int invokePI(long r0, int r2, boolean r3, long r4);

    public static native int invokePI(long r0, int r2, int r3, int r4, long r5);

    public static native int invokeCPI(short r0, long r1, long r3);

    public static native int invokePCI(long r0, short r2, long r3);

    public static native int invokePJI(long r0, long r2, long r4);

    public static native int invokePNI(long r0, long r2, long r4);

    public static native int invokePPI(long r0, long r2, long r4);

    public static native int invokePJI(long r0, long r2, int r4, long r5);

    public static native int invokePNI(long r0, int r2, long r3, long r5);

    public static native int invokePNI(long r0, long r2, int r4, long r5);

    public static native int invokePPI(int r0, long r1, long r3, long r5);

    public static native int invokePPI(long r0, int r2, long r3, long r5);

    public static native int invokePPI(long r0, long r2, float r4, long r5);

    public static native int invokePPI(long r0, long r2, int r4, long r5);

    public static native int invokePPI(long r0, long r2, boolean r4, long r5);

    public static native int invokePPI(long r0, boolean r2, long r3, long r5);

    public static native int invokePPI(long r0, int r2, int r3, long r4, long r6);

    public static native int invokePPI(long r0, int r2, long r3, int r5, long r6);

    public static native int invokePPI(long r0, int r2, long r3, boolean r5, long r6);

    public static native int invokePPI(long r0, int r2, boolean r3, long r4, long r6);

    public static native int invokePPI(long r0, long r2, int r4, int r5, long r6);

    public static native int invokePPI(long r0, long r2, boolean r4, boolean r5, long r6);

    public static native int invokePPI(long r0, int r2, int r3, int r4, long r5, long r7);

    public static native int invokePPI(long r0, int r2, int r3, long r4, int r6, long r7);

    public static native int invokePPI(long r0, int r2, long r3, int r5, int r6, long r7);

    public static native int invokePPI(int r0, long r1, int r3, long r4, int r6, boolean r7, long r8);

    public static native int invokePPI(long r0, int r2, int r3, int r4, int r5, long r6, long r8);

    public static native int invokePPI(long r0, int r2, int r3, int r4, int r5, long r6, int r8, long r9);

    public static native int invokeCPUI(short r0, long r1, byte r3, long r4);

    public static native int invokePCPI(long r0, short r2, long r3, long r5);

    public static native int invokePNNI(long r0, long r2, long r4, long r6);

    public static native int invokePNPI(long r0, long r2, long r4, long r6);

    public static native int invokePPCI(long r0, long r2, short r4, long r5);

    public static native int invokePPJI(long r0, long r2, long r4, long r6);

    public static native int invokePPNI(long r0, long r2, long r4, long r6);

    public static native int invokePPPI(long r0, long r2, long r4, long r6);

    public static native int invokePNPI(long r0, long r2, int r4, long r5, long r7);

    public static native int invokePNPI(long r0, long r2, long r4, int r6, long r7);

    public static native int invokePPNI(long r0, int r2, long r3, long r5, long r7);

    public static native int invokePPPI(long r0, int r2, long r3, long r5, long r7);

    public static native int invokePPPI(long r0, long r2, int r4, long r5, long r7);

    public static native int invokePPPI(long r0, long r2, long r4, int r6, long r7);

    public static native int invokePNNI(long r0, long r2, long r4, int r6, int r7, long r8);

    public static native int invokePPPI(long r0, int r2, int r3, long r4, long r6, long r8);

    public static native int invokePPPI(long r0, int r2, long r3, int r5, long r6, long r8);

    public static native int invokePPPI(long r0, int r2, long r3, long r5, int r7, long r8);

    public static native int invokePPPI(long r0, long r2, int r4, int r5, long r6, long r8);

    public static native int invokePPPI(long r0, long r2, int r4, long r5, int r7, long r8);

    public static native int invokePPPI(long r0, long r2, long r4, int r6, int r7, long r8);

    public static native int invokePPPI(long r0, int r2, int r3, int r4, long r5, long r7, long r9);

    public static native int invokePPPI(long r0, int r2, long r3, int r5, long r6, int r8, long r9);

    public static native int invokePPPI(long r0, long r2, int r4, long r5, int r7, int r8, long r9);

    public static native int invokePPPI(long r0, long r2, long r4, int r6, boolean r7, float r8, long r9);

    public static native int invokePPPI(long r0, int r2, int r3, int r4, int r5, long r6, long r8, long r10);

    public static native int invokePPPI(long r0, int r2, int r3, int r4, long r5, long r7, int r9, long r10);

    public static native int invokePPPI(long r0, int r2, int r3, long r4, int r6, long r7, int r9, int r10, long r11);

    public static native int invokePNPPI(long r0, long r2, long r4, long r6, long r8);

    public static native int invokePPNNI(long r0, long r2, long r4, long r6, long r8);

    public static native int invokePPNPI(long r0, long r2, long r4, long r6, long r8);

    public static native int invokePPPNI(long r0, long r2, long r4, long r6, long r8);

    public static native int invokePPPPI(long r0, long r2, long r4, long r6, long r8);

    public static native int invokePNNPI(long r0, long r2, int r4, long r5, long r7, long r9);

    public static native int invokePPPNI(long r0, long r2, int r4, long r5, long r7, long r9);

    public static native int invokePPPPI(long r0, int r2, long r3, long r5, long r7, long r9);

    public static native int invokePPPPI(long r0, long r2, int r4, long r5, long r7, long r9);

    public static native int invokePPPPI(long r0, long r2, long r4, int r6, long r7, long r9);

    public static native int invokePPPPI(long r0, long r2, long r4, long r6, int r8, long r9);

    public static native int invokePPPPI(long r0, int r2, int r3, long r4, long r6, long r8, long r10);

    public static native int invokePPPPI(long r0, long r2, int r4, int r5, long r6, long r8, long r10);

    public static native int invokePPPPI(long r0, long r2, int r4, long r5, int r7, long r8, long r10);

    public static native int invokePPPPI(long r0, long r2, int r4, long r5, long r7, int r9, long r10);

    public static native int invokePPPPI(long r0, long r2, long r4, int r6, int r7, long r8, long r10);

    public static native int invokePPPPI(long r0, long r2, long r4, long r6, int r8, int r9, long r10);

    public static native int invokePPPPI(long r0, int r2, int r3, int r4, long r5, long r7, long r9, long r11);

    public static native int invokePPPPI(long r0, int r2, int r3, long r4, long r6, long r8, int r10, long r11);

    public static native int invokePPPPI(long r0, long r2, long r4, long r6, int r8, int r9, int r10, int r11, long r12);

    public static native int invokePPPPI(long r0, int r2, int r3, long r4, int r6, long r7, long r9, int r11, int r12, long r13);

    public static native int invokePNNPPI(long r0, long r2, long r4, long r6, long r8, long r10);

    public static native int invokePPNNPI(long r0, long r2, long r4, long r6, long r8, long r10);

    public static native int invokePPPNNI(long r0, long r2, long r4, long r6, long r8, long r10);

    public static native int invokePPPPNI(long r0, long r2, long r4, long r6, long r8, long r10);

    public static native int invokePPPPPI(long r0, long r2, long r4, long r6, long r8, long r10);

    public static native int invokePJPPNI(long r0, int r2, long r3, long r5, long r7, long r9, long r11);

    public static native int invokePPNPPI(long r0, int r2, long r3, long r5, long r7, long r9, long r11);

    public static native int invokePPNPPI(long r0, long r2, long r4, int r6, long r7, long r9, long r11);

    public static native int invokePPPNJI(long r0, int r2, long r3, long r5, long r7, long r9, long r11);

    public static native int invokePPPNNI(long r0, int r2, long r3, long r5, long r7, long r9, long r11);

    public static native int invokePPPNPI(long r0, int r2, long r3, long r5, long r7, long r9, long r11);

    public static native int invokePPPPNI(long r0, int r2, long r3, long r5, long r7, long r9, long r11);

    public static native int invokePPPPNI(long r0, long r2, int r4, long r5, long r7, long r9, long r11);

    public static native int invokePPPPPI(long r0, int r2, long r3, long r5, long r7, long r9, long r11);

    public static native int invokePPPPPI(long r0, long r2, int r4, long r5, long r7, long r9, long r11);

    public static native int invokePPPPPI(long r0, long r2, long r4, int r6, long r7, long r9, long r11);

    public static native int invokePPPPPI(long r0, long r2, long r4, long r6, long r8, int r10, long r11);

    public static native int invokePNPPPI(long r0, int r2, int r3, long r4, long r6, long r8, long r10, long r12);

    public static native int invokePPPPPI(long r0, long r2, int r4, int r5, long r6, long r8, long r10, long r12);

    public static native int invokePPPPPI(long r0, long r2, int r4, long r5, int r7, long r8, int r10, long r11, long r13);

    public static native int invokePPPPPI(long r0, long r2, long r4, int r6, long r7, int r9, int r10, long r11, long r13);

    public static native int invokePPPPPI(long r0, long r2, long r4, int r6, int r7, int r8, float r9, long r10, long r12, long r14);

    public static native int invokePPPPPPI(long r0, long r2, long r4, long r6, long r8, long r10, long r12);

    public static native int invokePJJJJPI(long r0, long r2, long r4, long r6, long r8, int r10, long r11, long r13);

    public static native int invokePPNPPPI(long r0, int r2, long r3, long r5, long r7, long r9, long r11, long r13);

    public static native int invokePPPPPPI(long r0, int r2, long r3, long r5, long r7, long r9, long r11, long r13);

    public static native int invokePPPPPPI(long r0, long r2, long r4, long r6, long r8, long r10, int r12, long r13);

    public static native int invokePNNPPPI(long r0, long r2, long r4, int r6, int r7, long r8, long r10, long r12, long r14);

    public static native int invokePPPPPPI(long r0, int r2, int r3, long r4, long r6, long r8, long r10, long r12, long r14);

    public static native int invokePPPPPPPI(long r0, long r2, long r4, int r6, long r7, float r9, float r10, long r11, long r13, long r15, long r17);

    public static native int invokePPPPPPPI(long r0, long r2, long r4, int r6, int r7, long r8, long r10, int r12, long r13, int r15, long r16, int r18, long r19);

    public static native int invokePPPPPPPPI(long r0, int r2, int r3, long r4, long r6, long r8, long r10, long r12, long r14, long r16, long r18);

    public static native long invokeJ(long r0);

    public static native long invokePJ(long r0, long r2);

    public static native long invokePJ(long r0, int r2, long r3);

    public static native long invokePJJ(long r0, long r2, long r4);

    public static native long invokePPJ(long r0, long r2, long r4);

    public static native long invokePPJ(long r0, long r2, int r4, long r5);

    public static native long invokeNN(long r0, long r2);

    public static native long invokePN(long r0, long r2);

    public static native long invokePN(long r0, int r2, long r3);

    public static native long invokeNNN(long r0, long r2, long r4);

    public static native long invokePPN(long r0, long r2, long r4);

    public static native long invokeNNNN(long r0, long r2, long r4, long r6);

    public static native long invokePNPN(long r0, long r2, long r4, long r6);

    public static native long invokePNPN(long r0, long r2, long r4, int r6, long r7);

    public static native long invokePPNN(long r0, int r2, int r3, long r4, long r6, long r8);

    public static native long invokePNPNN(long r0, long r2, long r4, long r6, long r8);

    public static native long invokePNPNPN(long r0, long r2, int r4, int r5, int r6, int r7, int r8, int r9, int r10, long r11, long r13, long r15, long r17);

    public static native long invokeP(long r0);

    public static native long invokeP(int r0, long r1);

    public static native long invokeP(boolean r0, long r1);

    public static native long invokeP(int r0, int r1, long r2);

    public static native long invokeCP(short r0, long r1);

    public static native long invokePP(long r0, long r2);

    public static native long invokePP(int r0, long r1, long r3);

    public static native long invokePP(long r0, double r2, long r4);

    public static native long invokePP(long r0, int r2, long r3);

    public static native long invokePP(int r0, int r1, long r2, long r4);

    public static native long invokePP(long r0, int r2, int r3, long r4);

    public static native long invokePP(int r0, int r1, int r2, long r3, long r5);

    public static native long invokePP(long r0, int r2, int r3, int r4, long r5);

    public static native long invokePP(long r0, float r2, int r3, float r4, int r5, long r6);

    public static native long invokePP(long r0, int r2, int r3, int r4, int r5, int r6, long r7);

    public static native long invokeCPP(short r0, long r1, long r3);

    public static native long invokePJP(long r0, long r2, long r4);

    public static native long invokePNP(long r0, long r2, long r4);

    public static native long invokePPP(long r0, long r2, long r4);

    public static native long invokePUP(long r0, byte r2, long r3);

    public static native long invokeCPP(int r0, short r1, long r2, long r4);

    public static native long invokePCP(long r0, short r2, boolean r3, long r4);

    public static native long invokePJP(long r0, int r2, long r3, long r5);

    public static native long invokePJP(long r0, long r2, int r4, long r5);

    public static native long invokePPP(int r0, long r1, long r3, long r5);

    public static native long invokePPP(long r0, int r2, long r3, long r5);

    public static native long invokePPP(long r0, long r2, int r4, long r5);

    public static native long invokePPP(long r0, int r2, int r3, long r4, long r6);

    public static native long invokePPP(long r0, int r2, long r3, int r5, long r6);

    public static native long invokePPP(long r0, long r2, int r4, int r5, long r6);

    public static native long invokePPP(long r0, long r2, boolean r4, boolean r5, long r6);

    public static native long invokePPP(long r0, boolean r2, boolean r3, long r4, long r6);

    public static native long invokePPP(long r0, int r2, int r3, int r4, long r5, long r7);

    public static native long invokePPP(int r0, int r1, int r2, int r3, long r4, long r6, long r8);

    public static native long invokePUP(long r0, int r2, byte r3, int r4, boolean r5, boolean r6, long r7);

    public static native long invokePPP(int r0, int r1, int r2, int r3, long r4, int r6, long r7, long r9);

    public static native long invokePJJP(long r0, long r2, long r4, long r6);

    public static native long invokePPPP(long r0, long r2, long r4, long r6);

    public static native long invokePPUP(long r0, long r2, byte r4, long r5);

    public static native long invokePPPP(int r0, long r1, long r3, long r5, long r7);

    public static native long invokePPPP(long r0, int r2, long r3, long r5, long r7);

    public static native long invokePPPP(long r0, long r2, int r4, long r5, long r7);

    public static native long invokePPPP(long r0, long r2, long r4, int r6, long r7);

    public static native long invokePPUP(long r0, long r2, int r4, byte r5, long r6);

    public static native long invokePPPP(int r0, int r1, long r2, long r4, long r6, long r8);

    public static native long invokePPPP(long r0, int r2, int r3, long r4, long r6, long r8);

    public static native long invokePPPP(long r0, long r2, int r4, int r5, long r6, long r8);

    public static native long invokePPPP(long r0, long r2, int r4, long r5, int r7, long r8);

    public static native long invokePPPP(long r0, long r2, long r4, int r6, int r7, long r8);

    public static native long invokeJPPP(int r0, int r1, int r2, long r3, long r5, long r7, long r9);

    public static native long invokePPPP(long r0, int r2, long r3, long r5, int r7, int r8, long r9);

    public static native long invokePPPP(long r0, long r2, int r4, int r5, int r6, long r7, long r9);

    public static native long invokePPPP(long r0, long r2, int r4, int r5, long r6, int r8, long r9);

    public static native long invokePPPP(int r0, int r1, int r2, long r3, long r5, int r7, long r8, long r10);

    public static native long invokePPPP(long r0, long r2, int r4, int r5, long r6, int r8, int r9, long r10);

    public static native long invokePBPPP(long r0, byte r2, long r3, long r5, long r7);

    public static native long invokePNNPP(long r0, long r2, long r4, long r6, long r8);

    public static native long invokePPJPP(long r0, long r2, long r4, long r6, long r8);

    public static native long invokePPNNP(long r0, long r2, long r4, long r6, long r8);

    public static native long invokePPPPP(long r0, long r2, long r4, long r6, long r8);

    public static native long invokePPPJP(int r0, long r1, long r3, long r5, long r7, long r9);

    public static native long invokePPPJP(long r0, long r2, long r4, long r6, int r8, long r9);

    public static native long invokePPPPP(long r0, int r2, long r3, long r5, long r7, long r9);

    public static native long invokePPPPP(long r0, long r2, int r4, long r5, long r7, long r9);

    public static native long invokePPPPP(long r0, long r2, long r4, int r6, long r7, long r9);

    public static native long invokePPPPP(long r0, long r2, long r4, long r6, int r8, long r9);

    public static native long invokePJPPP(long r0, int r2, int r3, long r4, long r6, long r8, long r10);

    public static native long invokePJPPP(long r0, long r2, int r4, long r5, long r7, int r9, long r10);

    public static native long invokePPPJP(long r0, long r2, long r4, long r6, int r8, int r9, long r10);

    public static native long invokePPPPP(long r0, long r2, int r4, long r5, int r7, long r8, long r10);

    public static native long invokePPPPP(long r0, long r2, long r4, int r6, long r7, int r9, long r10);

    public static native long invokePPPPP(long r0, long r2, long r4, int r6, int r7, int r8, long r9, long r11);

    public static native long invokePPPPP(long r0, long r2, long r4, int r6, long r7, int r9, int r10, long r11);

    public static native long invokePPPPP(long r0, long r2, long r4, long r6, int r8, int r9, int r10, long r11);

    public static native long invokePPPPP(int r0, int r1, int r2, long r3, long r5, long r7, int r9, long r10, long r12);

    public static native long invokePJPJPP(long r0, long r2, long r4, long r6, long r8, long r10);

    public static native long invokePNNNPP(long r0, long r2, long r4, long r6, long r8, long r10);

    public static native long invokePPBPPP(long r0, long r2, byte r4, long r5, long r7, long r9);

    public static native long invokePPPPPP(long r0, long r2, long r4, long r6, long r8, long r10);

    public static native long invokeCCCUJP(short r0, short r1, short r2, byte r3, int r4, long r5, long r7);

    public static native long invokePPPPNP(long r0, long r2, int r4, long r5, long r7, long r9, long r11);

    public static native long invokePPPPPP(long r0, long r2, long r4, int r6, long r7, long r9, long r11);

    public static native long invokePPPPPP(long r0, long r2, long r4, long r6, int r8, long r9, long r11);

    public static native long invokePPPPPP(long r0, long r2, long r4, long r6, long r8, int r10, long r11);

    public static native long invokePPJPPP(long r0, long r2, long r4, int r6, int r7, long r8, long r10, long r12);

    public static native long invokePPPPPP(long r0, long r2, long r4, int r6, long r7, int r9, long r10, long r12);

    public static native long invokePPPPPP(long r0, long r2, long r4, long r6, int r8, long r9, int r11, long r12);

    public static native long invokePPPPPP(long r0, long r2, long r4, long r6, long r8, int r10, int r11, int r12, int r13, long r14);

    public static native long invokePPJJPPP(long r0, long r2, long r4, long r6, long r8, long r10, long r12);

    public static native long invokePPPPPPP(long r0, long r2, long r4, long r6, long r8, long r10, long r12);

    public static native long invokePSSCCPP(long r0, short r2, short r3, short r4, short r5, long r6, long r8);

    public static native long invokePPPPPPP(long r0, long r2, long r4, int r6, long r7, long r9, long r11, long r13);

    public static native long invokePPPPPPP(long r0, long r2, long r4, long r6, int r8, long r9, long r11, long r13);

    public static native long invokePPPPPPP(long r0, long r2, long r4, long r6, long r8, long r10, int r12, long r13);

    public static native long invokePPPPPPP(long r0, long r2, int r4, int r5, long r6, long r8, long r10, long r12, long r14);

    public static native long invokePPPPPPP(long r0, long r2, long r4, int r6, long r7, int r9, long r10, long r12, long r14);

    public static native long invokePPPPPPP(long r0, long r2, long r4, long r6, long r8, int r10, long r11, int r13, long r14);

    public static native long invokePPPPPPP(long r0, long r2, long r4, long r6, int r8, long r9, int r11, long r12, int r14, int r15, long r16);

    public static native long invokePPPPPPP(long r0, long r2, long r4, long r6, long r8, int r10, long r11, int r13, int r14, int r15, long r16);

    public static native long invokePPPPPPPP(long r0, long r2, long r4, long r6, int r8, long r9, long r11, long r13, long r15);

    public static native long invokePPPPPPPP(long r0, long r2, long r4, long r6, int r8, long r9, long r11, long r13, int r15, long r16);

    public static native long invokePPPPPPPP(long r0, long r2, long r4, long r6, long r8, int r10, long r11, int r13, long r14, int r16, long r17);

    public static native long invokePPPPPPPPP(long r0, long r2, long r4, long r6, long r8, long r10, long r12, long r14, long r16);

    public static native long invokePPPPPPPPP(long r0, long r2, long r4, long r6, long r8, long r10, long r12, int r14, long r15, long r17);

    public static native long invokePPPPJJPPP(long r0, long r2, long r4, long r6, int r8, long r9, int r11, long r12, int r14, long r15, long r17, long r19);

    public static native long invokePPPPPJJPP(long r0, long r2, long r4, long r6, long r8, int r10, long r11, int r13, long r14, int r16, long r17, long r19);

    public static native long invokePPPPPJPPP(long r0, long r2, long r4, long r6, long r8, int r10, long r11, int r13, long r14, int r16, long r17, long r19);

    public static native long invokePPPPPJPPP(long r0, int r2, long r3, long r5, long r7, long r9, int r11, int r12, long r13, int r15, long r16, long r18, long r20);

    public static native long invokePPPPPJPPP(long r0, int r2, long r3, long r5, long r7, long r9, int r11, int r12, long r13, int r15, int r16, long r17, long r19, long r21);

    public static native long invokePPPPPPPPP(long r0, long r2, long r4, long r6, long r8, long r10, long r12, int r14, long r15, int r17, int r18, int r19, int r20, int r21, long r22);

    public static native long invokePPPPPJJJPP(long r0, long r2, long r4, long r6, long r8, int r10, long r11, long r13, long r15, int r17, long r18, long r20);

    public static native long invokePPPPPPPPPP(long r0, long r2, long r4, long r6, int r8, long r9, long r11, long r13, long r15, int r17, long r18, long r20);

    public static native long invokePPPPPPPPPP(long r0, long r2, long r4, long r6, long r8, long r10, long r12, int r14, long r15, int r17, long r18, int r20, long r21);

    public static native long invokePPPPPJPPPP(long r0, long r2, long r4, long r6, long r8, int r10, long r11, int r13, int r14, long r15, int r17, int r18, long r19, long r21, long r23);

    public static native long invokePPPPPPPPPPP(long r0, long r2, long r4, long r6, long r8, long r10, long r12, long r14, long r16, long r18, long r20);

    public static native long invokePPPPPPPPPPP(long r0, long r2, long r4, long r6, long r8, long r10, long r12, int r14, long r15, int r17, long r18, long r20, int r22, long r23);

    public static native long invokePPPPPJPPPPPP(long r0, long r2, long r4, long r6, long r8, int r10, long r11, int r13, int r14, long r15, long r17, int r19, int r20, long r21, long r23, long r25, long r27);

    public static native long invokePPPPPPPPPPPPP(long r0, int r2, long r3, long r5, long r7, int r9, long r10, long r12, int r14, long r15, long r17, int r19, int r20, int r21, int r22, long r23, long r25, long r27, long r29, long r31);

    public static native long invokePPPPPJJPPPPPPP(long r0, long r2, long r4, long r6, long r8, int r10, long r11, int r13, long r14, int r16, long r17, long r19, int r21, long r22, long r24, long r26, long r28, long r30);

    public static native byte invokeU(int r0, long r1);

    public static native byte invokeUPU(byte r0, long r1, long r3);

    public static native void invokeV(long r0);

    public static native void invokeV(double r0, long r2);

    public static native void invokeV(float r0, long r1);

    public static native void invokeV(int r0, long r1);

    public static native void invokeV(int r0, float r1, long r2);

    public static native void invokeV(int r0, int r1, long r2);

    public static native void invokeV(int r0, int r1, double r2, long r4);

    public static native void invokeV(int r0, int r1, float r2, long r3);

    public static native void invokeV(int r0, int r1, int r2, long r3);

    public static native void invokeV(int r0, float r1, float r2, float r3, long r4);

    public static native void invokeV(int r0, int r1, int r2, int r3, long r4);

    public static native void invokeV(int r0, int r1, double r2, double r4, double r6, long r8);

    public static native void invokeV(int r0, int r1, float r2, float r3, float r4, long r5);

    public static native void invokeV(int r0, int r1, int r2, int r3, int r4, long r5);

    public static native void invokeCV(short r0, long r1);

    public static native void invokePV(long r0, long r2);

    public static native void invokeUV(byte r0, long r1);

    public static native void invokeCV(int r0, short r1, long r2);

    public static native void invokeCV(short r0, int r1, long r2);

    public static native void invokeCV(short r0, boolean r1, long r2);

    public static native void invokeJV(int r0, long r1, long r3);

    public static native void invokeJV(long r0, int r2, long r3);

    public static native void invokePV(int r0, long r1, long r3);

    public static native void invokePV(long r0, float r2, long r3);

    public static native void invokePV(long r0, int r2, long r3);

    public static native void invokePV(long r0, boolean r2, long r3);

    public static native void invokeUV(byte r0, int r1, long r2);

    public static native void invokeUV(byte r0, boolean r1, long r2);

    public static native void invokeCV(short r0, int r1, int r2, long r3);

    public static native void invokeJV(int r0, int r1, long r2, long r4);

    public static native void invokePV(int r0, int r1, long r2, long r4);

    public static native void invokePV(int r0, long r1, boolean r3, long r4);

    public static native void invokePV(long r0, double r2, double r4, long r6);

    public static native void invokePV(long r0, float r2, float r3, long r4);

    public static native void invokePV(long r0, int r2, double r3, long r5);

    public static native void invokePV(long r0, int r2, float r3, long r4);

    public static native void invokePV(long r0, int r2, int r3, long r4);

    public static native void invokePV(long r0, int r2, boolean r3, long r4);

    public static native void invokePV(long r0, float r2, float r3, float r4, long r5);

    public static native void invokePV(long r0, float r2, float r3, int r4, long r5);

    public static native void invokePV(long r0, int r2, int r3, double r4, long r6);

    public static native void invokePV(long r0, int r2, int r3, float r4, long r5);

    public static native void invokePV(long r0, int r2, int r3, int r4, long r5);

    public static native void invokePV(int r0, int r1, long r2, int r4, int r5, long r6);

    public static native void invokePV(long r0, int r2, int r3, int r4, int r5, long r6);

    public static native void invokePV(int r0, int r1, int r2, int r3, int r4, long r5, long r7);

    public static native void invokePV(long r0, int r2, int r3, int r4, int r5, boolean r6, long r7);

    public static native void invokePV(int r0, int r1, int r2, int r3, int r4, int r5, long r6, long r8);

    public static native void invokeCCV(short r0, short r1, long r2);

    public static native void invokeCPV(short r0, long r1, long r3);

    public static native void invokePCV(long r0, short r2, long r3);

    public static native void invokePJV(long r0, long r2, long r4);

    public static native void invokePNV(long r0, long r2, long r4);

    public static native void invokePPV(long r0, long r2, long r4);

    public static native void invokePUV(long r0, byte r2, long r3);

    public static native void invokeUPV(byte r0, long r1, long r3);

    public static native void invokeCPV(short r0, int r1, long r2, long r4);

    public static native void invokeCPV(short r0, long r1, int r3, long r4);

    public static native void invokePCV(long r0, int r2, short r3, long r4);

    public static native void invokePCV(long r0, short r2, boolean r3, long r4);

    public static native void invokePJV(int r0, long r1, long r3, long r5);

    public static native void invokePJV(long r0, int r2, long r3, long r5);

    public static native void invokePJV(long r0, long r2, int r4, long r5);

    public static native void invokePPV(int r0, long r1, long r3, long r5);

    public static native void invokePPV(long r0, int r2, long r3, long r5);

    public static native void invokePPV(long r0, long r2, float r4, long r5);

    public static native void invokePPV(long r0, long r2, int r4, long r5);

    public static native void invokePPV(long r0, long r2, boolean r4, long r5);

    public static native void invokeUCV(byte r0, short r1, int r2, long r3);

    public static native void invokePBV(long r0, int r2, int r3, byte r4, long r5);

    public static native void invokePCV(long r0, int r2, int r3, short r4, long r5);

    public static native void invokePCV(long r0, short r2, int r3, int r4, long r5);

    public static native void invokePPV(int r0, int r1, long r2, long r4, long r6);

    public static native void invokePPV(long r0, int r2, int r3, long r4, long r6);

    public static native void invokePPV(long r0, int r2, long r3, int r5, long r6);

    public static native void invokePPV(long r0, long r2, int r4, int r5, long r6);

    public static native void invokePSV(long r0, int r2, int r3, short r4, long r5);

    public static native void invokePUV(long r0, int r2, int r3, byte r4, long r5);

    public static native void invokeUCV(byte r0, short r1, int r2, int r3, long r4);

    public static native void invokeUPV(byte r0, long r1, int r3, int r4, long r5);

    public static native void invokePCV(long r0, short r2, int r3, int r4, int r5, long r6);

    public static native void invokePPV(int r0, int r1, int r2, long r3, long r5, long r7);

    public static native void invokePPV(long r0, float r2, long r3, int r5, int r6, long r7);

    public static native void invokePPV(long r0, int r2, int r3, int r4, long r5, long r7);

    public static native void invokePPV(long r0, long r2, int r4, int r5, int r6, long r7);

    public static native void invokePPV(int r0, int r1, int r2, int r3, long r4, long r6, long r8);

    public static native void invokePPV(long r0, int r2, int r3, int r4, int r5, long r6, long r8);

    public static native void invokePPV(long r0, long r2, float r4, float r5, float r6, float r7, long r8);

    public static native void invokePPV(long r0, long r2, int r4, int r5, int r6, int r7, int r8, long r9);

    public static native void invokePPV(long r0, long r2, float r4, float r5, float r6, float r7, float r8, float r9, long r10);

    public static native void invokeCCPV(short r0, short r1, long r2, long r4);

    public static native void invokeCPCV(short r0, long r1, short r3, long r4);

    public static native void invokeCPPV(short r0, long r1, long r3, long r5);

    public static native void invokePNNV(long r0, long r2, long r4, long r6);

    public static native void invokePNPV(long r0, long r2, long r4, long r6);

    public static native void invokePPNV(long r0, long r2, long r4, long r6);

    public static native void invokePPPV(long r0, long r2, long r4, long r6);

    public static native void invokeCCCV(short r0, short r1, short r2, int r3, long r4);

    public static native void invokeCCUV(short r0, short r1, int r2, byte r3, long r4);

    public static native void invokePJPV(long r0, long r2, long r4, int r6, long r7);

    public static native void invokePPPV(int r0, long r1, long r3, long r5, long r7);

    public static native void invokePPPV(long r0, int r2, long r3, long r5, long r7);

    public static native void invokePPPV(long r0, long r2, int r4, long r5, long r7);

    public static native void invokePPPV(long r0, long r2, long r4, float r6, long r7);

    public static native void invokePPPV(long r0, long r2, long r4, int r6, long r7);

    public static native void invokePUCV(long r0, byte r2, short r3, int r4, long r5);

    public static native void invokeUCCV(byte r0, short r1, short r2, int r3, long r4);

    public static native void invokeCCUV(short r0, short r1, int r2, float r3, byte r4, long r5);

    public static native void invokeJJJV(int r0, int r1, long r2, long r4, long r6, long r8);

    public static native void invokePNNV(long r0, long r2, int r4, int r5, long r6, long r8);

    public static native void invokePPPV(int r0, int r1, long r2, long r4, long r6, long r8);

    public static native void invokePPPV(long r0, int r2, int r3, long r4, long r6, long r8);

    public static native void invokePPPV(long r0, int r2, long r3, long r5, int r7, long r8);

    public static native void invokePPPV(long r0, long r2, int r4, int r5, long r6, long r8);

    public static native void invokePPPV(long r0, long r2, int r4, long r5, int r7, long r8);

    public static native void invokePPPV(long r0, long r2, long r4, float r6, float r7, long r8);

    public static native void invokePPPV(long r0, long r2, long r4, boolean r6, boolean r7, long r8);

    public static native void invokePUCV(long r0, byte r2, short r3, int r4, int r5, long r6);

    public static native void invokePUPV(long r0, byte r2, long r3, int r5, int r6, long r7);

    public static native void invokeUCCV(byte r0, short r1, int r2, int r3, short r4, long r5);

    public static native void invokeUCUV(byte r0, short r1, byte r2, int r3, int r4, long r5);

    public static native void invokeUPCV(byte r0, long r1, int r3, int r4, short r5, long r6);

    public static native void invokeCCUV(short r0, short r1, int r2, int r3, int r4, byte r5, long r6);

    public static native void invokePPPV(long r0, int r2, int r3, int r4, long r5, long r7, long r9);

    public static native void invokePPPV(long r0, int r2, long r3, int r5, long r6, int r8, long r9);

    public static native void invokePPPV(long r0, int r2, long r3, long r5, int r7, int r8, long r9);

    public static native void invokePPPV(long r0, long r2, long r4, int r6, boolean r7, boolean r8, long r9);

    public static native void invokePPPV(long r0, boolean r2, int r3, long r4, long r6, int r8, long r9);

    public static native void invokePPPV(long r0, int r2, int r3, long r4, int r6, long r7, int r9, long r10);

    public static native void invokePPPV(long r0, long r2, float r4, float r5, float r6, float r7, long r8, long r10);

    public static native void invokePPPV(long r0, long r2, long r4, float r6, float r7, float r8, float r9, long r10);

    public static native void invokePPPV(long r0, long r2, int r4, int r5, int r6, long r7, int r9, boolean r10, long r11);

    public static native void invokePPPV(long r0, long r2, float r4, float r5, float r6, float r7, float r8, float r9, long r10, long r12);

    public static native void invokePPPV(long r0, long r2, long r4, float r6, float r7, float r8, float r9, float r10, float r11, long r12);

    public static native void invokeCCUPV(short r0, short r1, byte r2, long r3, long r5);

    public static native void invokePCPCV(long r0, short r2, long r3, short r5, long r6);

    public static native void invokePNPPV(long r0, long r2, long r4, long r6, long r8);

    public static native void invokePPPPV(long r0, long r2, long r4, long r6, long r8);

    public static native void invokeCCCUV(short r0, short r1, short r2, int r3, byte r4, long r5);

    public static native void invokePCCUV(long r0, short r2, short r3, int r4, byte r5, long r6);

    public static native void invokePJJPV(long r0, int r2, long r3, long r5, long r7, long r9);

    public static native void invokePPCPV(long r0, long r2, short r4, int r5, long r6, long r8);

    public static native void invokePPPCV(long r0, long r2, int r4, long r5, short r7, long r8);

    public static native void invokePPPPV(long r0, int r2, long r3, long r5, long r7, long r9);

    public static native void invokePPPPV(long r0, long r2, int r4, long r5, long r7, long r9);

    public static native void invokePPPPV(long r0, long r2, long r4, int r6, long r7, long r9);

    public static native void invokePPPPV(long r0, long r2, long r4, long r6, int r8, long r9);

    public static native void invokePUCCV(long r0, byte r2, short r3, short r4, int r5, long r6);

    public static native void invokePPPPV(long r0, long r2, long r4, float r6, float r7, long r8, long r10);

    public static native void invokePUCCV(long r0, byte r2, short r3, int r4, int r5, short r6, long r7);

    public static native void invokePUCUV(long r0, byte r2, short r3, byte r4, int r5, int r6, long r7);

    public static native void invokePUPCV(long r0, byte r2, long r3, int r5, int r6, short r7, long r8);

    public static native void invokePCCUV(long r0, short r2, short r3, int r4, int r5, int r6, byte r7, long r8);

    public static native void invokePPPPV(long r0, long r2, long r4, float r6, float r7, float r8, float r9, long r10, long r12);

    public static native void invokePPPPV(long r0, long r2, long r4, int r6, int r7, int r8, float r9, long r10, long r12);

    public static native void invokePPPPV(long r0, long r2, long r4, float r6, float r7, float r8, float r9, float r10, float r11, long r12, long r14);

    public static native void invokeCCCCCV(short r0, short r1, short r2, short r3, short r4, long r5);

    public static native void invokeCCUPPV(short r0, short r1, byte r2, long r3, long r5, long r7);

    public static native void invokePPCPPV(long r0, long r2, short r4, long r5, long r7, long r9);

    public static native void invokePPPPPV(long r0, long r2, long r4, long r6, long r8, long r10);

    public static native void invokePCCCUV(long r0, short r2, short r3, short r4, int r5, byte r6, long r7);

    public static native void invokePPPPPV(int r0, long r1, long r3, long r5, long r7, long r9, long r11);

    public static native void invokePPPPPV(long r0, int r2, long r3, long r5, long r7, long r9, long r11);

    public static native void invokePPPPPV(long r0, long r2, int r4, long r5, long r7, long r9, long r11);

    public static native void invokePPPPPV(long r0, int r2, int r3, long r4, long r6, long r8, long r10, long r12);

    public static native void invokePCCCCV(long r0, short r2, short r3, short r4, boolean r5, boolean r6, short r7, int r8, long r9);

    public static native void invokePPPPPV(long r0, long r2, int r4, long r5, int r7, long r8, int r10, long r11, long r13);

    public static native void invokePPPPPV(long r0, long r2, int r4, long r5, long r7, int r9, int r10, long r11, long r13);

    public static native void invokePPPPPV(int r0, long r1, int r3, long r4, long r6, long r8, int r10, long r11, int r13, boolean r14, long r15);

    public static native void invokeCCCCCUV(short r0, short r1, short r2, short r3, short r4, byte r5, long r6);

    public static native void invokeCCCCPCV(short r0, short r1, short r2, short r3, long r4, short r6, long r7);

    public static native void invokePPPPPPV(long r0, long r2, long r4, long r6, long r8, long r10, long r12);

    public static native void invokeCCCCCUV(short r0, short r1, short r2, short r3, short r4, int r5, byte r6, long r7);

    public static native void invokePCCCCUV(long r0, short r2, int r3, short r4, short r5, short r6, byte r7, long r8);

    public static native void invokePCCCCCUV(long r0, short r2, short r3, short r4, short r5, short r6, byte r7, long r8);

    public static native void invokePPPPPPPV(long r0, long r2, long r4, long r6, long r8, long r10, long r12, long r14);

    public static native void invokePCCCCCUV(long r0, short r2, short r3, short r4, short r5, short r6, int r7, byte r8, long r9);

    public static native void invokePPPPPPPV(long r0, int r2, long r3, long r5, long r7, long r9, long r11, long r13, long r15);

    public static native void invokeCCCCCCUV(short r0, short r1, short r2, short r3, short r4, int r5, short r6, int r7, byte r8, long r9);

    public static native void invokePCCCCCCUV(long r0, short r2, short r3, short r4, short r5, short r6, int r7, short r8, int r9, byte r10, long r11);

    public static native void invokeCCUCCCCPCV(short r0, short r1, byte r2, short r3, short r4, short r5, short r6, long r7, short r9, long r10);

    public static native void invokeCUCCCCCCPV(short r0, byte r1, short r2, short r3, short r4, short r5, short r6, short r7, long r8, long r10);

    public static native void invokeCCUUCCCCPCV(short r0, short r1, byte r2, byte r3, short r4, short r5, short r6, short r7, long r8, short r10, long r11);

    public static native void invokeCCUUUUUUUUUV(short r0, short r1, float r2, byte r3, byte r4, byte r5, byte r6, byte r7, byte r8, byte r9, byte r10, byte r11, long r12);

    public static native void invokeCCUCCCCUCCCCCCV(short r0, short r1, byte r2, short r3, short r4, short r5, short r6, byte r7, short r8, short r9, short r10, short r11, short r12, short r13, long r14);

    public static native void invokePCCUCCCCUCCCCCCV(long r0, short r2, short r3, byte r4, short r5, short r6, short r7, short r8, byte r9, short r10, short r11, short r12, short r13, short r14, short r15, long r16);

    public static native boolean invokeZ(long r0);

    public static native boolean invokeZ(int r0, long r1);

    public static native boolean invokePZ(long r0, long r2);

    public static native boolean invokePZ(long r0, int r2, long r3);

    public static native boolean invokePZ(long r0, boolean r2, long r3);

    public static native boolean invokePZ(long r0, int r2, int r3, long r4);

    public static native boolean invokePZ(long r0, int r2, int r3, int r4, long r5);

    public static native boolean invokePPZ(long r0, long r2, long r4);

    public static native boolean invokeUPZ(byte r0, long r1, long r3);

    public static native boolean invokePPZ(long r0, int r2, long r3, long r5);

    public static native boolean invokePPZ(long r0, int r2, int r3, long r4, long r6);

    public static native boolean invokePPPZ(long r0, long r2, long r4, long r6);

    public static native boolean invokePJPZ(long r0, long r2, long r4, int r6, long r7);

    public static native boolean invokePPPZ(long r0, long r2, long r4, int r6, long r7);

    public static native boolean invokeCCJZ(short r0, boolean r1, short r2, int r3, long r4, long r6);

    public static native boolean invokePPPZ(long r0, long r2, long r4, boolean r6, int r7, long r8);

    public static native boolean invokePPPZ(long r0, long r2, int r4, long r5, int r7, boolean r8, long r9);

    public static native boolean invokePPPPZ(long r0, long r2, long r4, long r6, long r8);

    public static native boolean invokePPPPZ(long r0, int r2, long r3, long r5, long r7, long r9);

    public static native boolean invokePPPUPZ(long r0, long r2, long r4, byte r6, long r7, long r9);

    public static native boolean invokePPPPPZ(long r0, long r2, long r4, long r6, long r8, int r10, long r11);

    public static native boolean invokePPPPPZ(long r0, long r2, long r4, long r6, long r8, boolean r10, int r11, long r12);

    public static native short callC(int r0, long r1);

    public static native float callF(long r0);

    public static native float callF(int r0, int r1, int r2, long r3);

    public static native float callPF(long r0, float r2, long r3);

    public static native float callPF(int r0, int r1, long r2, long r4);

    public static native float callPPPF(long r0, long r2, long r4, long r6);

    public static native int callI(long r0);

    public static native int callI(int r0, long r1);

    public static native int callI(int r0, float r1, long r2);

    public static native int callI(int r0, int r1, long r2);

    public static native int callI(int r0, int r1, int r2, long r3);

    public static native int callJI(long r0, long r2);

    public static native int callPI(long r0, long r2);

    public static native int callJI(long r0, float r2, long r3);

    public static native int callJI(long r0, int r2, long r3);

    public static native int callPI(int r0, long r1, long r3);

    public static native int callPI(long r0, float r2, long r3);

    public static native int callPI(long r0, int r2, long r3);

    public static native int callPI(long r0, boolean r2, long r3);

    public static native int callJI(long r0, int r2, boolean r3, long r4);

    public static native int callPI(int r0, int r1, long r2, long r4);

    public static native int callPI(int r0, long r1, int r3, long r4);

    public static native int callPI(long r0, float r2, float r3, long r4);

    public static native int callPI(long r0, float r2, int r3, long r4);

    public static native int callPI(long r0, int r2, float r3, long r4);

    public static native int callPI(long r0, int r2, int r3, long r4);

    public static native int callJI(int r0, long r1, int r3, int r4, long r5);

    public static native int callJI(long r0, float r2, float r3, float r4, long r5);

    public static native int callPI(int r0, int r1, int r2, long r3, long r5);

    public static native int callPI(int r0, int r1, long r2, int r4, long r5);

    public static native int callPI(int r0, long r1, int r3, int r4, long r5);

    public static native int callPI(long r0, float r2, float r3, float r4, long r5);

    public static native int callPI(long r0, int r2, float r3, float r4, long r5);

    public static native int callPI(long r0, int r2, int r3, int r4, long r5);

    public static native int callPI(long r0, int r2, int r3, boolean r4, long r5);

    public static native int callPI(int r0, int r1, int r2, int r3, long r4, long r6);

    public static native int callPI(long r0, int r2, float r3, float r4, int r5, long r6);

    public static native int callPI(long r0, int r2, int r3, int r4, int r5, long r6);

    public static native int callPI(int r0, int r1, int r2, float r3, float r4, long r5, long r7);

    public static native int callPI(int r0, int r1, int r2, int r3, int r4, long r5, long r7);

    public static native int callPI(int r0, long r1, int r3, int r4, float r5, int r6, long r7);

    public static native int callPI(long r0, int r2, int r3, int r4, int r5, int r6, long r7);

    public static native int callPI(long r0, int r2, int r3, int r4, int r5, int r6, int r7, long r8);

    public static native int callPI(int r0, int r1, long r2, int r4, int r5, int r6, int r7, float r8, long r9);

    public static native int callPI(long r0, float r2, float r3, float r4, float r5, float r6, float r7, float r8, float r9, long r10);

    public static native int callJJI(long r0, long r2, long r4);

    public static native int callJPI(long r0, long r2, long r4);

    public static native int callPJI(long r0, long r2, long r4);

    public static native int callPPI(long r0, long r2, long r4);

    public static native int callJPI(long r0, int r2, long r3, long r5);

    public static native int callJPI(long r0, long r2, int r4, long r5);

    public static native int callPJI(long r0, int r2, long r3, long r5);

    public static native int callPJI(long r0, long r2, float r4, long r5);

    public static native int callPJI(long r0, long r2, int r4, long r5);

    public static native int callPPI(int r0, long r1, long r3, long r5);

    public static native int callPPI(long r0, float r2, long r3, long r5);

    public static native int callPPI(long r0, int r2, long r3, long r5);

    public static native int callPPI(long r0, long r2, float r4, long r5);

    public static native int callPPI(long r0, long r2, int r4, long r5);

    public static native int callJPI(long r0, int r2, long r3, int r5, long r6);

    public static native int callJPI(long r0, long r2, int r4, int r5, long r6);

    public static native int callPJI(long r0, int r2, int r3, long r4, long r6);

    public static native int callPPI(int r0, int r1, long r2, long r4, long r6);

    public static native int callPPI(int r0, long r1, long r3, int r5, long r6);

    public static native int callPPI(long r0, int r2, float r3, long r4, long r6);

    public static native int callPPI(long r0, int r2, int r3, long r4, long r6);

    public static native int callPPI(long r0, int r2, long r3, int r5, long r6);

    public static native int callPPI(long r0, long r2, float r4, float r5, long r6);

    public static native int callPPI(long r0, long r2, float r4, int r5, long r6);

    public static native int callPPI(long r0, long r2, int r4, int r5, long r6);

    public static native int callJPI(long r0, int r2, int r3, long r4, int r6, long r7);

    public static native int callJPI(long r0, long r2, int r4, int r5, int r6, long r7);

    public static native int callPPI(int r0, int r1, int r2, long r3, long r5, long r7);

    public static native int callPPI(int r0, int r1, long r2, int r4, long r5, long r7);

    public static native int callPPI(long r0, int r2, float r3, float r4, long r5, long r7);

    public static native int callPPI(long r0, int r2, int r3, int r4, long r5, long r7);

    public static native int callPPI(long r0, int r2, int r3, long r4, int r6, long r7);

    public static native int callPPI(long r0, long r2, int r4, int r5, int r6, long r7);

    public static native int callPPI(long r0, long r2, int r4, int r5, boolean r6, long r7);

    public static native int callJJI(long r0, float r2, float r3, float r4, float r5, long r6, long r8);

    public static native int callPPI(int r0, int r1, int r2, long r3, int r5, long r6, long r8);

    public static native int callPPI(int r0, long r1, int r3, int r4, float r5, long r6, long r8);

    public static native int callPPI(long r0, int r2, float r3, float r4, float r5, long r6, long r8);

    public static native int callPPI(long r0, long r2, int r4, int r5, int r6, int r7, long r8);

    public static native int callPPI(long r0, int r2, float r3, float r4, float r5, int r6, long r7, long r9);

    public static native int callPPI(long r0, int r2, int r3, int r4, int r5, int r6, long r7, long r9);

    public static native int callPPI(long r0, int r2, float r3, float r4, float r5, float r6, int r7, long r8, long r10);

    public static native int callPPI(long r0, int r2, int r3, int r4, int r5, int r6, int r7, long r8, long r10);

    public static native int callPPI(int r0, int r1, long r2, long r4, int r6, int r7, int r8, int r9, float r10, long r11);

    public static native int callPPI(long r0, int r2, float r3, float r4, float r5, float r6, float r7, int r8, long r9, long r11);

    public static native int callPPI(long r0, int r2, int r3, float r4, float r5, float r6, float r7, float r8, int r9, long r10, int r12, long r13);

    public static native int callPPI(long r0, int r2, int r3, int r4, int r5, int r6, int r7, long r8, int r10, int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, long r19);

    public static native int callJPPI(long r0, long r2, long r4, long r6);

    public static native int callPCPI(long r0, short r2, long r3, long r5);

    public static native int callPJJI(long r0, long r2, long r4, long r6);

    public static native int callPJPI(long r0, long r2, long r4, long r6);

    public static native int callPPJI(long r0, long r2, long r4, long r6);

    public static native int callPPPI(long r0, long r2, long r4, long r6);

    public static native int callPUPI(long r0, byte r2, long r3, long r5);

    public static native int callJJPI(long r0, long r2, long r4, int r6, long r7);

    public static native int callJPJI(long r0, long r2, int r4, long r5, long r7);

    public static native int callJPPI(long r0, int r2, long r3, long r5, long r7);

    public static native int callJPPI(long r0, long r2, int r4, long r5, long r7);

    public static native int callJPPI(long r0, long r2, long r4, int r6, long r7);

    public static native int callPJJI(long r0, long r2, int r4, long r5, long r7);

    public static native int callPJJI(long r0, long r2, long r4, float r6, long r7);

    public static native int callPJJI(long r0, long r2, long r4, int r6, long r7);

    public static native int callPJJI(long r0, long r2, long r4, boolean r6, long r7);

    public static native int callPJPI(long r0, int r2, long r3, long r5, long r7);

    public static native int callPJPI(long r0, long r2, int r4, long r5, long r7);

    public static native int callPPJI(long r0, int r2, long r3, long r5, long r7);

    public static native int callPPJI(long r0, long r2, int r4, long r5, long r7);

    public static native int callPPJI(long r0, long r2, long r4, int r6, long r7);

    public static native int callPPNI(long r0, int r2, long r3, long r5, long r7);

    public static native int callPPPI(int r0, long r1, long r3, long r5, long r7);

    public static native int callPPPI(long r0, int r2, long r3, long r5, long r7);

    public static native int callPPPI(long r0, long r2, int r4, long r5, long r7);

    public static native int callPPPI(long r0, long r2, long r4, int r6, long r7);

    public static native int callJPJI(long r0, int r2, long r3, int r5, long r6, long r8);

    public static native int callJPPI(long r0, int r2, long r3, int r5, long r6, long r8);

    public static native int callJPPI(long r0, int r2, long r3, long r5, int r7, long r8);

    public static native int callJPPI(long r0, long r2, int r4, int r5, long r6, long r8);

    public static native int callJPPI(long r0, long r2, long r4, int r6, int r7, long r8);

    public static native int callPJJI(long r0, long r2, int r4, long r5, int r7, long r8);

    public static native int callPJPI(long r0, int r2, long r3, long r5, int r7, long r8);

    public static native int callPPJI(long r0, int r2, long r3, int r5, long r6, long r8);

    public static native int callPPPI(int r0, int r1, long r2, long r4, long r6, long r8);

    public static native int callPPPI(int r0, long r1, int r3, long r4, long r6, long r8);

    public static native int callPPPI(long r0, int r2, int r3, long r4, long r6, long r8);

    public static native int callPPPI(long r0, int r2, long r3, int r5, long r6, long r8);

    public static native int callPPPI(long r0, int r2, long r3, long r5, int r7, long r8);

    public static native int callPPPI(long r0, long r2, int r4, long r5, int r7, long r8);

    public static native int callPPPI(long r0, long r2, long r4, int r6, int r7, long r8);

    public static native int callJPJI(long r0, int r2, float r3, long r4, int r6, long r7, long r9);

    public static native int callJPPI(long r0, int r2, long r3, int r5, long r6, int r8, long r9);

    public static native int callPPPI(long r0, int r2, int r3, int r4, long r5, long r7, long r9);

    public static native int callPPPI(long r0, int r2, int r3, long r4, int r6, long r7, long r9);

    public static native int callPPPI(long r0, int r2, long r3, long r5, int r7, int r8, long r9);

    public static native int callPPPI(long r0, long r2, int r4, int r5, int r6, long r7, long r9);

    public static native int callPPPI(long r0, long r2, long r4, int r6, int r7, int r8, long r9);

    public static native int callPPPI(long r0, float r2, float r3, int r4, int r5, long r6, long r8, long r10);

    public static native int callPPPI(long r0, int r2, int r3, int r4, int r5, long r6, long r8, long r10);

    public static native int callPPPI(long r0, int r2, long r3, long r5, int r7, int r8, int r9, long r10);

    public static native int callPPPI(long r0, long r2, int r4, int r5, int r6, int r7, long r8, long r10);

    public static native int callJPPI(int r0, int r1, int r2, int r3, int r4, long r5, long r7, long r9, long r11);

    public static native int callPPJI(int r0, int r1, int r2, long r3, int r5, long r6, boolean r8, long r9, long r11);

    public static native int callPPPI(long r0, int r2, int r3, int r4, int r5, int r6, int r7, int r8, long r9, long r11, long r13);

    public static native int callJJPPI(long r0, long r2, long r4, long r6, long r8);

    public static native int callJPPPI(long r0, long r2, long r4, long r6, long r8);

    public static native int callPCPPI(long r0, short r2, long r3, long r5, long r7);

    public static native int callPJJJI(long r0, long r2, long r4, long r6, long r8);

    public static native int callPJJPI(long r0, long r2, long r4, long r6, long r8);

    public static native int callPJPPI(long r0, long r2, long r4, long r6, long r8);

    public static native int callPPJPI(long r0, long r2, long r4, long r6, long r8);

    public static native int callPPNPI(long r0, long r2, long r4, long r6, long r8);

    public static native int callPPPJI(long r0, long r2, long r4, long r6, long r8);

    public static native int callPPPPI(long r0, long r2, long r4, long r6, long r8);

    public static native int callPUPPI(long r0, byte r2, long r3, long r5, long r7);

    public static native int callJPPPI(long r0, long r2, int r4, long r5, long r7, long r9);

    public static native int callPJJJI(long r0, int r2, long r3, long r5, long r7, long r9);

    public static native int callPJPPI(long r0, long r2, int r4, long r5, long r7, long r9);

    public static native int callPPJPI(long r0, long r2, int r4, long r5, long r7, long r9);

    public static native int callPPPJI(long r0, long r2, long r4, int r6, long r7, long r9);

    public static native int callPPPPI(long r0, int r2, long r3, long r5, long r7, long r9);

    public static native int callPPPPI(long r0, long r2, int r4, long r5, long r7, long r9);

    public static native int callPPPPI(long r0, long r2, long r4, int r6, long r7, long r9);

    public static native int callPPPPI(long r0, long r2, long r4, long r6, int r8, long r9);

    public static native int callJPPPI(long r0, int r2, long r3, long r5, long r7, int r9, long r10);

    public static native int callPJPPI(long r0, long r2, int r4, int r5, long r6, long r8, long r10);

    public static native int callPPPPI(int r0, long r1, long r3, int r5, long r6, long r8, long r10);

    public static native int callPPPPI(long r0, int r2, int r3, long r4, long r6, long r8, long r10);

    public static native int callPPPPI(long r0, int r2, long r3, int r5, long r6, long r8, long r10);

    public static native int callPPPPI(long r0, int r2, long r3, long r5, int r7, long r8, long r10);

    public static native int callPPPPI(long r0, int r2, long r3, long r5, long r7, int r9, long r10);

    public static native int callPPPPI(long r0, long r2, int r4, int r5, long r6, long r8, long r10);

    public static native int callPPPPI(long r0, long r2, int r4, long r5, int r7, long r8, long r10);

    public static native int callPPPPI(long r0, long r2, long r4, int r6, int r7, long r8, long r10);

    public static native int callPPPPI(long r0, long r2, long r4, int r6, long r7, int r9, long r10);

    public static native int callPJPPI(long r0, long r2, int r4, int r5, int r6, long r7, long r9, long r11);

    public static native int callPPPPI(long r0, int r2, int r3, int r4, long r5, long r7, long r9, long r11);

    public static native int callPPPPI(long r0, int r2, long r3, int r5, int r6, long r7, long r9, long r11);

    public static native int callJPPJI(long r0, int r2, int r3, int r4, long r5, int r7, long r8, boolean r10, long r11, long r13);

    public static native int callPPPPI(long r0, int r2, int r3, int r4, int r5, int r6, int r7, int r8, long r9, long r11, long r13, long r15);

    public static native int callPPPPI(int r0, long r1, long r3, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, long r23, long r25, long r27);

    public static native int callJPPPJI(long r0, long r2, long r4, long r6, long r8, long r10);

    public static native int callPJJPPI(long r0, long r2, long r4, long r6, long r8, long r10);

    public static native int callPJPPPI(long r0, long r2, long r4, long r6, long r8, long r10);

    public static native int callPPCPPI(long r0, long r2, short r4, long r5, long r7, long r9);

    public static native int callPPJPPI(long r0, long r2, long r4, long r6, long r8, long r10);

    public static native int callPPPJJI(long r0, long r2, long r4, long r6, long r8, long r10);

    public static native int callPPPPJI(long r0, long r2, long r4, long r6, long r8, long r10);

    public static native int callPPPPPI(long r0, long r2, long r4, long r6, long r8, long r10);

    public static native int callPPUPPI(long r0, long r2, byte r4, long r5, long r7, long r9);

    public static native int callPJJJPI(long r0, long r2, long r4, long r6, int r8, long r9, long r11);

    public static native int callPJPPPI(long r0, long r2, int r4, long r5, long r7, long r9, long r11);

    public static native int callPPPPPI(long r0, int r2, long r3, long r5, long r7, long r9, long r11);

    public static native int callPPPPPI(long r0, long r2, int r4, long r5, long r7, long r9, long r11);

    public static native int callPPPPPI(long r0, long r2, long r4, int r6, long r7, long r9, long r11);

    public static native int callPPPPPI(long r0, long r2, long r4, long r6, int r8, long r9, long r11);

    public static native int callPPPPPI(long r0, long r2, long r4, long r6, long r8, int r10, long r11);

    public static native int callJJPPPI(long r0, long r2, int r4, long r5, int r7, long r8, long r10, long r12);

    public static native int callPPJPPI(long r0, int r2, long r3, long r5, int r7, long r8, long r10, long r12);

    public static native int callPPJPPI(long r0, long r2, int r4, long r5, int r7, long r8, long r10, long r12);

    public static native int callPPPPPI(int r0, int r1, long r2, long r4, long r6, long r8, long r10, long r12);

    public static native int callPPPPPI(long r0, int r2, int r3, long r4, long r6, long r8, long r10, long r12);

    public static native int callPPPPPI(long r0, int r2, long r3, int r5, long r6, long r8, long r10, long r12);

    public static native int callPPPPPI(long r0, int r2, long r3, long r5, int r7, long r8, long r10, long r12);

    public static native int callPPPPPI(long r0, long r2, long r4, long r6, long r8, int r10, int r11, long r12);

    public static native int callJPPPPI(int r0, int r1, long r2, long r4, int r6, long r7, long r9, long r11, long r13);

    public static native int callPJPPJI(long r0, long r2, int r4, int r5, long r6, long r8, long r10, int r12, long r13);

    public static native int callPPPPPI(long r0, int r2, long r3, int r5, long r6, int r8, long r9, long r11, long r13);

    public static native int callJPJPPJI(long r0, long r2, long r4, long r6, long r8, long r10, long r12);

    public static native int callPJJJJPI(long r0, long r2, long r4, long r6, long r8, long r10, long r12);

    public static native int callPPCPPPI(long r0, long r2, short r4, long r5, long r7, long r9, long r11);

    public static native int callPPPPJPI(long r0, long r2, long r4, long r6, long r8, long r10, long r12);

    public static native int callPPPPPPI(long r0, long r2, long r4, long r6, long r8, long r10, long r12);

    public static native int callPPUPPPI(long r0, long r2, byte r4, long r5, long r7, long r9, long r11);

    public static native int callPJJPPPI(long r0, long r2, long r4, int r6, long r7, long r9, long r11, long r13);

    public static native int callPJPPPPI(long r0, int r2, long r3, long r5, long r7, long r9, long r11, long r13);

    public static native int callPPPJPPI(long r0, long r2, long r4, long r6, int r8, long r9, long r11, long r13);

    public static native int callPJPPPPI(long r0, int r2, long r3, long r5, long r7, int r9, long r10, long r12, long r14);

    public static native int callPPPJPPI(long r0, int r2, long r3, long r5, long r7, int r9, long r10, long r12, long r14);

    public static native int callPPPPPPI(int r0, int r1, long r2, long r4, long r6, long r8, long r10, long r12, long r14);

    public static native int callPPPPPPI(long r0, int r2, long r3, int r5, long r6, long r8, long r10, long r12, long r14);

    public static native int callPPPPPPI(long r0, int r2, long r3, long r5, long r7, int r9, long r10, long r12, long r14);

    public static native int callPPPPPPI(long r0, long r2, long r4, long r6, int r8, long r9, long r11, int r13, long r14);

    public static native int callPPPPPPI(long r0, int r2, int r3, long r4, long r6, long r8, long r10, long r12, int r14, int r15, int r16, int r17, long r18);

    public static native int callPPPPPPPI(long r0, long r2, int r4, long r5, long r7, long r9, long r11, long r13, long r15);

    public static native int callPPPPPPPI(long r0, long r2, long r4, long r6, int r8, long r9, long r11, long r13, long r15);

    public static native int callPPPPPPPI(long r0, long r2, long r4, long r6, long r8, int r10, long r11, long r13, long r15);

    public static native int callPPPPPPPI(long r0, long r2, long r4, long r6, long r8, long r10, long r12, int r14, long r15);

    public static native int callPPPPPPPI(long r0, int r2, long r3, int r5, long r6, long r8, long r10, long r12, long r14, long r16);

    public static native int callPPPPPPPI(long r0, int r2, long r3, long r5, int r7, long r8, long r10, long r12, long r14, long r16);

    public static native int callPPPPPPPI(long r0, long r2, int r4, long r5, long r7, long r9, int r11, long r12, long r14, long r16);

    public static native int callPPPPPPPI(long r0, long r2, long r4, int r6, long r7, long r9, int r11, long r12, long r14, long r16);

    public static native int callPPPPPPPI(long r0, int r2, int r3, long r4, long r6, long r8, long r10, long r12, int r14, int r15, long r16, int r18, int r19, int r20, int r21, long r22);

    public static native int callPPPPPJPPI(long r0, long r2, long r4, long r6, long r8, long r10, long r12, long r14, long r16);

    public static native int callPPJPPPPPI(long r0, long r2, long r4, long r6, long r8, int r10, long r11, long r13, long r15, long r17);

    public static native int callPPPPPPPPI(long r0, long r2, long r4, long r6, long r8, long r10, int r12, long r13, long r15, long r17);

    public static native int callPPPPPPPPI(long r0, long r2, long r4, long r6, int r8, long r9, long r11, int r13, long r14, long r16, long r18);

    public static native int callPPPPPPPPI(long r0, int r2, int r3, long r4, long r6, long r8, long r10, int r12, long r13, long r15, long r17, long r19);

    public static native int callJPPPPPPPPI(long r0, long r2, long r4, long r6, long r8, long r10, long r12, long r14, long r16, long r18);

    public static native int callPPPPPPPPPI(long r0, long r2, long r4, long r6, long r8, long r10, int r12, long r13, long r15, long r17, long r19);

    public static native int callPPPPPPPPPI(long r0, long r2, int r4, long r5, long r7, long r9, long r11, long r13, int r15, long r16, long r18, long r20);

    public static native int callPPPPPPPPPPI(long r0, long r2, long r4, long r6, long r8, long r10, long r12, int r14, long r15, long r17, long r19, long r21);

    public static native int callPPPPPPPPPPI(long r0, long r2, long r4, long r6, int r8, long r9, long r11, long r13, int r15, long r16, long r18, long r20, long r22);

    public static native int callPPPPPPPPPPPPI(long r0, long r2, long r4, long r6, long r8, long r10, long r12, long r14, long r16, long r18, int r20, long r21, long r23, long r25);

    public static native int callPPPPPPPPPPPPI(long r0, long r2, int r4, long r5, long r7, long r9, long r11, long r13, long r15, long r17, long r19, int r21, long r22, long r24, long r26);

    public static native int callPPPPPPPPPPPPPPI(long r0, long r2, long r4, long r6, long r8, long r10, long r12, long r14, long r16, long r18, long r20, int r22, long r23, long r25, long r27, long r29);

    public static native long callJ(long r0);

    public static native long callJ(int r0, long r1);

    public static native long callJ(int r0, int r1, long r2);

    public static native long callJ(int r0, int r1, boolean r2, int r3, int r4, long r5);

    public static native long callJJ(long r0, long r2);

    public static native long callPJ(long r0, long r2);

    public static native long callPJ(int r0, int r1, long r2, long r4);

    public static native long callPPJ(long r0, long r2, long r4);

    public static native long callPPJ(long r0, int r2, long r3, long r5);

    public static native long callPJJ(long r0, long r2, int r4, int r5, long r6);

    public static native long callPN(long r0, long r2);

    public static native long callP(long r0);

    public static native long callP(int r0, long r1);

    public static native long callP(int r0, int r1, long r2);

    public static native long callP(int r0, float r1, float r2, float r3, long r4);

    public static native long callPP(long r0, long r2);

    public static native long callPP(int r0, long r1, long r3);

    public static native long callPP(long r0, int r2, long r3);

    public static native long callPP(int r0, int r1, long r2, long r4);

    public static native long callPP(int r0, long r1, int r3, long r4);

    public static native long callPP(long r0, int r2, int r3, long r4);

    public static native long callPP(int r0, int r1, long r2, int r4, long r5);

    public static native long callPNP(long r0, long r2, long r4);

    public static native long callPPP(long r0, long r2, long r4);

    public static native long callPPP(int r0, long r1, long r3, long r5);

    public static native long callPPP(long r0, int r2, long r3, long r5);

    public static native long callPPP(long r0, long r2, int r4, long r5);

    public static native long callPPP(int r0, long r1, long r3, int r5, long r6);

    public static native long callPPP(long r0, int r2, int r3, long r4, long r6);

    public static native long callPPP(int r0, int r1, int r2, long r3, long r5, long r7);

    public static native long callPPP(long r0, int r2, int r3, int r4, long r5, long r7);

    public static native long callPPP(long r0, long r2, int r4, int r5, int r6, long r7);

    public static native long callPPNP(long r0, long r2, long r4, long r6);

    public static native long callPPPP(long r0, long r2, long r4, long r6);

    public static native long callPJPP(long r0, long r2, int r4, long r5, long r7);

    public static native long callPJPP(long r0, long r2, long r4, int r6, long r7);

    public static native long callPPPP(int r0, long r1, long r3, long r5, long r7);

    public static native long callPPPP(long r0, int r2, long r3, long r5, long r7);

    public static native long callPPPP(long r0, long r2, int r4, long r5, long r7);

    public static native long callPPPP(long r0, long r2, long r4, int r6, long r7);

    public static native long callPPPP(long r0, long r2, int r4, int r5, long r6, long r8);

    public static native long callPPPP(long r0, long r2, int r4, long r5, int r7, long r8);

    public static native long callPJPP(long r0, long r2, int r4, int r5, int r6, long r7, long r9);

    public static native long callPPJPP(long r0, long r2, long r4, long r6, long r8);

    public static native long callPPNPP(long r0, long r2, long r4, long r6, long r8);

    public static native long callPPPPP(long r0, long r2, long r4, long r6, long r8);

    public static native long callPJPPP(long r0, long r2, int r4, long r5, long r7, long r9);

    public static native long callPJPPP(long r0, long r2, long r4, int r6, long r7, long r9);

    public static native long callPPPPP(long r0, int r2, long r3, long r5, long r7, long r9);

    public static native long callPPPPP(long r0, long r2, int r4, long r5, long r7, long r9);

    public static native long callPPPPP(long r0, long r2, long r4, int r6, long r7, long r9);

    public static native long callPPPPP(long r0, long r2, long r4, long r6, int r8, long r9);

    public static native long callPJPPP(long r0, long r2, int r4, int r5, long r6, long r8, long r10);

    public static native long callPJPPPP(long r0, long r2, long r4, long r6, long r8, long r10);

    public static native long callPPPJPP(long r0, long r2, long r4, long r6, long r8, long r10);

    public static native long callPPPPPP(long r0, int r2, long r3, long r5, long r7, long r9, long r11);

    public static native long callPPPPPP(long r0, long r2, long r4, long r6, int r8, long r9, long r11);

    public static native long callPJJPPPP(long r0, long r2, long r4, long r6, long r8, long r10, long r12);

    public static native long callPJPPPPP(long r0, long r2, long r4, long r6, long r8, long r10, long r12);

    public static native long callPPJPPPP(long r0, long r2, long r4, long r6, long r8, long r10, long r12);

    public static native long callPPPJPPP(long r0, long r2, long r4, long r6, long r8, long r10, long r12);

    public static native long callPPPPPPP(long r0, int r2, long r3, long r5, long r7, long r9, long r11, long r13);

    public static native long callPPJPPPPP(long r0, long r2, long r4, long r6, long r8, long r10, long r12, long r14);

    public static native long callPPPPJPPP(long r0, long r2, long r4, long r6, long r8, long r10, long r12, long r14);

    public static native long callPPPPPPPP(long r0, int r2, long r3, long r5, int r7, long r8, long r10, long r12, long r14, long r16);

    public static native long callPPPPPPPP(int r0, long r1, long r3, int r5, int r6, int r7, int r8, long r9, long r11, long r13, int r15, long r16, long r18, long r20);

    public static native long callPJPPPPPPP(long r0, long r2, long r4, long r6, long r8, long r10, long r12, long r14, long r16);

    public static native long callPPJPPPPPP(long r0, long r2, int r4, long r5, long r7, long r9, int r11, long r12, long r14, long r16, long r18);

    public static native long callPJPPPPPPPPP(long r0, long r2, long r4, long r6, long r8, long r10, long r12, long r14, long r16, long r18, long r20);

    public static native long callPPJPPPPPPPP(long r0, long r2, int r4, long r5, long r7, long r9, long r11, long r13, int r15, long r16, long r18, long r20, long r22);

    public static native short callS(int r0, long r1);

    public static native short callPS(long r0, long r2);

    public static native short callPCS(long r0, short r2, long r3);

    public static native short callPPS(long r0, long r2, long r4);

    public static native short callPSS(long r0, short r2, long r3);

    public static native short callSPS(short r0, long r1, long r3);

    public static native short callPPS(long r0, long r2, int r4, long r5);

    public static native short callPPS(long r0, int r2, long r3, int r5, long r6);

    public static native short callPCPS(long r0, short r2, long r3, long r5);

    public static native short callPPCS(long r0, long r2, short r4, long r5);

    public static native short callPPPS(long r0, long r2, long r4, long r6);

    public static native short callPPSS(long r0, long r2, short r4, long r5);

    public static native short callPSPS(long r0, short r2, long r3, long r5);

    public static native short callSPPS(short r0, long r1, long r3, long r5);

    public static native short callSPSS(short r0, long r1, short r3, long r4);

    public static native short callPPPS(long r0, int r2, long r3, int r5, long r6, long r8);

    public static native short callPJCCS(long r0, long r2, short r4, short r5, long r6);

    public static native short callPPSPS(long r0, long r2, short r4, long r5, long r7);

    public static native short callPSSPS(long r0, short r2, short r3, long r4, int r6, long r7);

    public static native short callPPPPS(long r0, long r2, int r4, long r5, int r7, long r8, long r10);

    public static native short callPCPPPS(long r0, short r2, long r3, long r5, long r7, long r9);

    public static native short callPCPSPS(long r0, short r2, long r3, short r5, long r6, long r8);

    public static native short callPSSPPS(long r0, short r2, short r3, long r4, int r6, long r7, long r9);

    public static native short callPCPPPPS(long r0, short r2, long r3, long r5, long r7, long r9, long r11);

    public static native short callPCSPPPS(long r0, short r2, short r3, long r4, long r6, long r8, long r10);

    public static native short callPPSPSPS(long r0, long r2, short r4, long r5, short r7, long r8, long r10);

    public static native short callPCCPSPPS(long r0, short r2, short r3, long r4, short r6, long r7, long r9, long r11);

    public static native short callPPSPSPSS(long r0, long r2, short r4, long r5, short r7, long r8, short r10, long r11);

    public static native short callSPSSPSPS(short r0, long r1, short r3, short r4, long r5, short r7, long r8, long r10);

    public static native short callPCPSPPSPS(long r0, short r2, long r3, short r5, long r6, long r8, short r10, long r11, long r13);

    public static native short callPPPSPSPCS(long r0, long r2, long r4, short r6, long r7, short r9, long r10, short r12, long r13);

    public static native short callSPSPPPSPS(short r0, long r1, short r3, long r4, long r6, long r8, short r10, long r11, long r13);

    public static native short callPCPSPPPPPS(long r0, short r2, long r3, short r5, long r6, long r8, long r10, long r12, long r14, long r16);

    public static native short callPPSPSPSCCS(long r0, long r2, short r4, long r5, short r7, long r8, short r10, short r11, short r12, long r13);

    public static native short callPPSPSPSPSS(long r0, long r2, short r4, long r5, short r7, long r8, short r10, long r11, short r13, long r14);

    public static native short callPCPSPSPSCCS(long r0, short r2, long r3, short r5, long r6, short r8, long r9, short r11, short r12, short r13, long r14);

    public static native short callPCSSSPSPPPS(long r0, short r2, short r3, short r4, short r5, long r6, short r8, long r9, long r11, long r13, long r15);

    public static native short callPSSSPSSPPPS(long r0, short r2, short r3, short r4, long r5, short r7, short r8, long r9, long r11, long r13, long r15);

    public static native short callPSPSPPPPPPPS(long r0, short r2, long r3, short r5, long r6, long r8, long r10, long r12, long r14, long r16, long r18, long r20);

    public static native short callPPSPSPSPSPSPSS(long r0, long r2, short r4, long r5, short r7, long r8, short r10, long r11, short r13, long r14, short r16, long r17, short r19, long r20);

    public static native void callV(long r0);

    public static native void callV(double r0, long r2);

    public static native void callV(float r0, long r1);

    public static native void callV(int r0, long r1);

    public static native void callV(boolean r0, long r1);

    public static native void callV(double r0, double r2, long r4);

    public static native void callV(float r0, float r1, long r2);

    public static native void callV(float r0, boolean r1, long r2);

    public static native void callV(int r0, double r1, long r3);

    public static native void callV(int r0, float r1, long r2);

    public static native void callV(int r0, int r1, long r2);

    public static native void callV(int r0, boolean r1, long r2);

    public static native void callV(double r0, double r2, double r4, long r6);

    public static native void callV(float r0, float r1, float r2, long r3);

    public static native void callV(int r0, double r1, double r3, long r5);

    public static native void callV(int r0, float r1, float r2, long r3);

    public static native void callV(int r0, int r1, double r2, long r4);

    public static native void callV(int r0, int r1, float r2, long r3);

    public static native void callV(int r0, int r1, int r2, long r3);

    public static native void callV(int r0, int r1, boolean r2, long r3);

    public static native void callV(double r0, double r2, double r4, double r6, long r8);

    public static native void callV(float r0, float r1, float r2, float r3, long r4);

    public static native void callV(int r0, double r1, double r3, double r5, long r7);

    public static native void callV(int r0, float r1, float r2, float r3, long r4);

    public static native void callV(int r0, int r1, double r2, double r4, long r6);

    public static native void callV(int r0, int r1, float r2, float r3, long r4);

    public static native void callV(int r0, int r1, float r2, int r3, long r4);

    public static native void callV(int r0, int r1, int r2, double r3, long r5);

    public static native void callV(int r0, int r1, int r2, float r3, long r4);

    public static native void callV(int r0, int r1, int r2, int r3, long r4);

    public static native void callV(int r0, int r1, int r2, boolean r3, long r4);

    public static native void callV(int r0, int r1, boolean r2, int r3, long r4);

    public static native void callV(boolean r0, boolean r1, boolean r2, boolean r3, long r4);

    public static native void callV(int r0, double r1, double r3, double r5, double r7, long r9);

    public static native void callV(int r0, float r1, float r2, float r3, float r4, long r5);

    public static native void callV(int r0, int r1, double r2, double r4, double r6, long r8);

    public static native void callV(int r0, int r1, float r2, float r3, float r4, long r5);

    public static native void callV(int r0, int r1, int r2, float r3, int r4, long r5);

    public static native void callV(int r0, int r1, int r2, int r3, int r4, long r5);

    public static native void callV(int r0, int r1, int r2, boolean r3, int r4, long r5);

    public static native void callV(int r0, boolean r1, boolean r2, boolean r3, boolean r4, long r5);

    public static native void callV(double r0, double r2, double r4, double r6, double r8, double r10, long r12);

    public static native void callV(float r0, float r1, float r2, float r3, float r4, boolean r5, long r6);

    public static native void callV(int r0, double r1, double r3, int r5, double r6, double r8, long r10);

    public static native void callV(int r0, float r1, float r2, int r3, float r4, float r5, long r6);

    public static native void callV(int r0, int r1, double r2, double r4, double r6, double r8, long r10);

    public static native void callV(int r0, int r1, float r2, float r3, float r4, float r5, long r6);

    public static native void callV(int r0, int r1, int r2, int r3, int r4, int r5, long r6);

    public static native void callV(int r0, int r1, int r2, int r3, int r4, boolean r5, long r6);

    public static native void callV(int r0, int r1, int r2, int r3, boolean r4, int r5, long r6);

    public static native void callV(int r0, double r1, double r3, double r5, double r7, double r9, double r11, long r13);

    public static native void callV(int r0, int r1, int r2, double r3, double r5, double r7, double r9, long r11);

    public static native void callV(int r0, int r1, int r2, float r3, float r4, float r5, float r6, long r7);

    public static native void callV(int r0, int r1, int r2, int r3, int r4, int r5, int r6, long r7);

    public static native void callV(int r0, int r1, int r2, int r3, int r4, int r5, boolean r6, long r7);

    public static native void callV(int r0, int r1, int r2, boolean r3, int r4, int r5, int r6, long r7);

    public static native void callV(float r0, float r1, float r2, float r3, float r4, float r5, float r6, float r7, long r8);

    public static native void callV(int r0, int r1, int r2, float r3, float r4, float r5, float r6, float r7, long r8);

    public static native void callV(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, long r8);

    public static native void callV(int r0, int r1, int r2, int r3, int r4, int r5, int r6, boolean r7, long r8);

    public static native void callV(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, long r9);

    public static native void callV(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, boolean r8, long r9);

    public static native void callV(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, long r10);

    public static native void callV(int r0, int r1, float r2, float r3, float r4, float r5, float r6, float r7, float r8, float r9, float r10, long r11);

    public static native void callV(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, long r12);

    public static native void callV(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, long r15);

    public static native void callV(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15, int r16, long r17);

    public static native void callJV(long r0, long r2);

    public static native void callPV(long r0, long r2);

    public static native void callSV(short r0, long r1);

    public static native void callUV(byte r0, long r1);

    public static native void callCV(int r0, short r1, long r2);

    public static native void callJV(int r0, long r1, long r3);

    public static native void callJV(long r0, int r2, long r3);

    public static native void callPV(int r0, long r1, long r3);

    public static native void callPV(long r0, float r2, long r3);

    public static native void callPV(long r0, int r2, long r3);

    public static native void callSV(int r0, short r1, long r2);

    public static native void callCV(int r0, int r1, short r2, long r3);

    public static native void callJV(int r0, int r1, long r2, long r4);

    public static native void callPV(int r0, int r1, long r2, long r4);

    public static native void callPV(int r0, long r1, int r3, long r4);

    public static native void callPV(long r0, float r2, float r3, long r4);

    public static native void callPV(long r0, int r2, int r3, long r4);

    public static native void callJV(int r0, long r1, int r3, int r4, long r5);

    public static native void callNV(long r0, int r2, int r3, int r4, long r5);

    public static native void callPV(int r0, float r1, long r2, int r4, long r5);

    public static native void callPV(int r0, int r1, int r2, long r3, long r5);

    public static native void callPV(int r0, int r1, long r2, int r4, long r5);

    public static native void callPV(int r0, int r1, boolean r2, long r3, long r5);

    public static native void callPV(int r0, long r1, int r3, int r4, long r5);

    public static native void callPV(long r0, float r2, float r3, float r4, long r5);

    public static native void callPV(long r0, int r2, int r3, int r4, long r5);

    public static native void callPV(int r0, int r1, int r2, int r3, long r4, long r6);

    public static native void callPV(int r0, int r1, int r2, long r3, int r5, long r6);

    public static native void callPV(int r0, int r1, int r2, long r3, boolean r5, long r6);

    public static native void callPV(int r0, int r1, int r2, boolean r3, long r4, long r6);

    public static native void callPV(int r0, int r1, long r2, int r4, int r5, long r6);

    public static native void callPV(int r0, long r1, int r3, int r4, int r5, long r6);

    public static native void callPV(int r0, boolean r1, int r2, int r3, long r4, long r6);

    public static native void callPV(long r0, int r2, int r3, int r4, int r5, long r6);

    public static native void callJV(int r0, int r1, int r2, int r3, int r4, long r5, long r7);

    public static native void callPV(int r0, double r1, double r3, int r5, int r6, long r7, long r9);

    public static native void callPV(int r0, float r1, float r2, int r3, int r4, long r5, long r7);

    public static native void callPV(int r0, int r1, int r2, int r3, int r4, long r5, long r7);

    public static native void callPV(int r0, int r1, int r2, int r3, long r4, boolean r6, long r7);

    public static native void callPV(int r0, int r1, int r2, long r3, int r5, int r6, long r7);

    public static native void callPV(int r0, int r1, int r2, boolean r3, int r4, long r5, long r7);

    public static native void callPV(int r0, int r1, long r2, int r4, int r5, int r6, long r7);

    public static native void callPV(int r0, boolean r1, int r2, int r3, int r4, long r5, long r7);

    public static native void callPV(long r0, int r2, int r3, int r4, int r5, int r6, long r7);

    public static native void callJV(int r0, int r1, int r2, int r3, int r4, int r5, long r6, long r8);

    public static native void callPV(int r0, int r1, float r2, float r3, float r4, float r5, long r6, long r8);

    public static native void callPV(int r0, int r1, int r2, int r3, int r4, int r5, long r6, long r8);

    public static native void callPV(int r0, int r1, int r2, int r3, int r4, long r5, int r7, long r8);

    public static native void callPV(int r0, int r1, int r2, long r3, int r5, int r6, int r7, long r8);

    public static native void callPV(int r0, int r1, long r2, int r4, int r5, int r6, int r7, long r8);

    public static native void callPV(long r0, int r2, int r3, int r4, int r5, int r6, int r7, long r8);

    public static native void callJV(int r0, int r1, int r2, int r3, int r4, int r5, int r6, long r7, long r9);

    public static native void callJV(int r0, int r1, int r2, int r3, int r4, boolean r5, int r6, long r7, long r9);

    public static native void callPV(int r0, int r1, int r2, int r3, int r4, int r5, int r6, long r7, long r9);

    public static native void callPV(int r0, int r1, int r2, int r3, int r4, boolean r5, int r6, long r7, long r9);

    public static native void callJV(int r0, int r1, int r2, int r3, int r4, int r5, boolean r6, int r7, long r8, long r10);

    public static native void callPV(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, long r8, long r10);

    public static native void callPV(int r0, int r1, long r2, int r4, int r5, int r6, int r7, int r8, float r9, long r10);

    public static native void callPV(int r0, double r1, double r3, int r5, int r6, double r7, double r9, int r11, int r12, long r13, long r15);

    public static native void callPV(int r0, float r1, float r2, int r3, int r4, float r5, float r6, int r7, int r8, long r9, long r11);

    public static native void callPV(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, long r9, long r11);

    public static native void callJV(long r0, int r2, float r3, float r4, float r5, float r6, float r7, float r8, float r9, float r10, float r11, long r12);

    public static native void callPV(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, long r10, long r12);

    public static native void callPV(long r0, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, long r12);

    public static native void callJV(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, long r10, boolean r12, long r13);

    public static native void callPV(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, long r11, long r13);

    public static native void callJPV(long r0, long r2, long r4);

    public static native void callPJV(long r0, long r2, long r4);

    public static native void callPPV(long r0, long r2, long r4);

    public static native void callSSV(short r0, short r1, long r2);

    public static native void callJJV(int r0, long r1, long r3, long r5);

    public static native void callPCV(long r0, int r2, short r3, long r4);

    public static native void callPJV(long r0, int r2, long r3, long r5);

    public static native void callPJV(long r0, long r2, float r4, long r5);

    public static native void callPJV(long r0, long r2, int r4, long r5);

    public static native void callPPV(int r0, long r1, long r3, long r5);

    public static native void callPPV(long r0, int r2, long r3, long r5);

    public static native void callPPV(long r0, long r2, int r4, long r5);

    public static native void callSSV(int r0, short r1, short r2, long r3);

    public static native void callJJV(int r0, int r1, long r2, long r4, long r6);

    public static native void callJPV(int r0, int r1, long r2, long r4, long r6);

    public static native void callJPV(int r0, long r1, int r3, long r4, long r6);

    public static native void callPJV(int r0, long r1, int r3, long r4, long r6);

    public static native void callPJV(long r0, int r2, long r3, int r5, long r6);

    public static native void callPJV(long r0, long r2, int r4, int r5, long r6);

    public static native void callPPV(int r0, int r1, long r2, long r4, long r6);

    public static native void callPPV(int r0, long r1, int r3, long r4, long r6);

    public static native void callPPV(int r0, long r1, long r3, int r5, long r6);

    public static native void callPPV(int r0, long r1, long r3, boolean r5, long r6);

    public static native void callPPV(long r0, int r2, float r3, long r4, long r6);

    public static native void callPPV(long r0, int r2, int r3, long r4, long r6);

    public static native void callPPV(long r0, long r2, int r4, int r5, long r6);

    public static native void callPJV(long r0, long r2, int r4, int r5, int r6, long r7);

    public static native void callPPV(int r0, int r1, int r2, long r3, long r5, long r7);

    public static native void callPPV(int r0, int r1, long r2, int r4, long r5, long r7);

    public static native void callPPV(int r0, int r1, long r2, long r4, int r6, long r7);

    public static native void callPPV(int r0, long r1, int r3, long r4, int r6, long r7);

    public static native void callPPV(int r0, long r1, long r3, int r5, int r6, long r7);

    public static native void callPPV(long r0, int r2, int r3, int r4, long r5, long r7);

    public static native void callPPV(int r0, int r1, int r2, int r3, long r4, long r6, long r8);

    public static native void callPPV(int r0, int r1, long r2, int r4, int r5, long r6, long r8);

    public static native void callPPV(int r0, int r1, long r2, long r4, int r6, int r7, long r8);

    public static native void callPPV(int r0, long r1, long r3, int r5, int r6, int r7, long r8);

    public static native void callPPV(long r0, int r2, long r3, int r5, int r6, int r7, long r8);

    public static native void callPPV(int r0, int r1, int r2, int r3, int r4, long r5, long r7, long r9);

    public static native void callPPV(int r0, int r1, int r2, long r3, int r5, int r6, long r7, long r9);

    public static native void callPPV(int r0, int r1, long r2, int r4, int r5, int r6, long r7, long r9);

    public static native void callPPV(int r0, int r1, long r2, long r4, int r6, int r7, int r8, long r9);

    public static native void callPPV(int r0, int r1, int r2, int r3, int r4, int r5, long r6, long r8, long r10);

    public static native void callPPV(int r0, int r1, int r2, int r3, long r4, int r6, int r7, long r8, long r10);

    public static native void callPPV(int r0, int r1, long r2, int r4, int r5, int r6, int r7, long r8, long r10);

    public static native void callPPV(int r0, int r1, int r2, long r3, int r5, float r6, float r7, int r8, long r9, long r11);

    public static native void callPPV(int r0, int r1, long r2, int r4, int r5, int r6, int r7, int r8, long r9, long r11);

    public static native void callPPV(int r0, int r1, long r2, int r4, int r5, int r6, long r7, int r9, int r10, float r11, long r12);

    public static native void callBBBV(byte r0, byte r1, byte r2, long r3);

    public static native void callCCCV(short r0, short r1, short r2, long r3);

    public static native void callPJJV(long r0, long r2, long r4, long r6);

    public static native void callPJPV(long r0, long r2, long r4, long r6);

    public static native void callPPNV(long r0, long r2, long r4, long r6);

    public static native void callPPPV(long r0, long r2, long r4, long r6);

    public static native void callSSSV(short r0, short r1, short r2, long r3);

    public static native void callUUUV(byte r0, byte r1, byte r2, long r3);

    public static native void callJJJV(int r0, long r1, long r3, long r5, long r7);

    public static native void callPJJV(long r0, long r2, long r4, int r6, long r7);

    public static native void callPJPV(long r0, long r2, int r4, long r5, long r7);

    public static native void callPPPV(int r0, long r1, long r3, long r5, long r7);

    public static native void callPPPV(long r0, int r2, long r3, long r5, long r7);

    public static native void callPPPV(long r0, long r2, float r4, long r5, long r7);

    public static native void callPPPV(long r0, long r2, int r4, long r5, long r7);

    public static native void callPPPV(long r0, long r2, long r4, int r6, long r7);

    public static native void callPPPV(long r0, long r2, boolean r4, long r5, long r7);

    public static native void callSSSV(int r0, short r1, short r2, short r3, long r4);

    public static native void callJJJV(int r0, int r1, long r2, long r4, long r6, long r8);

    public static native void callPJJV(long r0, int r2, long r3, long r5, int r7, long r8);

    public static native void callPJJV(long r0, long r2, long r4, int r6, int r7, long r8);

    public static native void callPPPV(int r0, int r1, long r2, long r4, long r6, long r8);

    public static native void callPPPV(int r0, long r1, int r3, long r4, long r6, long r8);

    public static native void callPPPV(int r0, long r1, long r3, int r5, long r6, long r8);

    public static native void callPPPV(int r0, long r1, long r3, long r5, int r7, long r8);

    public static native void callPPPV(long r0, int r2, int r3, long r4, long r6, long r8);

    public static native void callPPPV(long r0, int r2, long r3, int r5, long r6, long r8);

    public static native void callPJPV(long r0, int r2, long r3, int r5, int r6, long r7, long r9);

    public static native void callPJPV(long r0, long r2, int r4, int r5, int r6, long r7, long r9);

    public static native void callPPJV(int r0, long r1, long r3, int r5, long r6, boolean r8, long r9);

    public static native void callPPJV(long r0, int r2, long r3, int r5, long r6, int r8, long r9);

    public static native void callPPPV(int r0, int r1, int r2, long r3, long r5, long r7, long r9);

    public static native void callPPPV(int r0, int r1, long r2, int r4, long r5, long r7, long r9);

    public static native void callPPPV(int r0, long r1, int r3, long r4, int r6, long r7, long r9);

    public static native void callPJJV(long r0, int r2, int r3, long r4, long r6, int r8, int r9, long r10);

    public static native void callPPPV(int r0, int r1, int r2, int r3, long r4, long r6, long r8, long r10);

    public static native void callPPPV(int r0, int r1, long r2, long r4, int r6, int r7, long r8, long r10);

    public static native void callPPPV(long r0, int r2, long r3, int r5, int r6, int r7, long r8, long r10);

    public static native void callPPPV(int r0, int r1, int r2, int r3, long r4, int r6, long r7, long r9, long r11);

    public static native void callPPPV(long r0, int r2, int r3, int r4, int r5, int r6, long r7, long r9, long r11);

    public static native void callPPPV(long r0, long r2, int r4, int r5, int r6, int r7, int r8, int r9, long r10, int r12, int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, long r21);

    public static native void callBBBBV(byte r0, byte r1, byte r2, byte r3, long r4);

    public static native void callCCCCV(short r0, short r1, short r2, short r3, long r4);

    public static native void callPJJPV(long r0, long r2, long r4, long r6, long r8);

    public static native void callPJPPV(long r0, long r2, long r4, long r6, long r8);

    public static native void callPPPNV(long r0, long r2, long r4, long r6, long r8);

    public static native void callPPPPV(long r0, long r2, long r4, long r6, long r8);

    public static native void callSSSSV(short r0, short r1, short r2, short r3, long r4);

    public static native void callUUUUV(byte r0, byte r1, byte r2, byte r3, long r4);

    public static native void callJJJJV(int r0, long r1, long r3, long r5, long r7, long r9);

    public static native void callPJJJV(long r0, long r2, long r4, long r6, int r8, long r9);

    public static native void callPJJPV(long r0, int r2, long r3, long r5, long r7, long r9);

    public static native void callPJJPV(long r0, long r2, long r4, int r6, long r7, long r9);

    public static native void callPPPPV(int r0, long r1, long r3, long r5, long r7, long r9);

    public static native void callPPPPV(long r0, int r2, long r3, long r5, long r7, long r9);

    public static native void callPPPPV(long r0, long r2, long r4, int r6, long r7, long r9);

    public static native void callPPPPV(long r0, long r2, long r4, long r6, int r8, long r9);

    public static native void callSSSSV(int r0, short r1, short r2, short r3, short r4, long r5);

    public static native void callUUUUV(int r0, byte r1, byte r2, byte r3, byte r4, long r5);

    public static native void callJJJJV(int r0, int r1, long r2, long r4, long r6, long r8, long r10);

    public static native void callPJJPV(long r0, long r2, int r4, long r5, int r7, long r8, long r10);

    public static native void callPJJPV(long r0, long r2, long r4, int r6, int r7, long r8, long r10);

    public static native void callPJPPV(long r0, long r2, int r4, long r5, int r7, long r8, long r10);

    public static native void callPPPPV(int r0, long r1, int r3, long r4, long r6, long r8, long r10);

    public static native void callPPPPV(int r0, long r1, long r3, long r5, long r7, int r9, long r10);

    public static native void callPPPPV(long r0, int r2, int r3, long r4, long r6, long r8, long r10);

    public static native void callPJJPV(long r0, long r2, int r4, int r5, long r6, int r8, long r9, long r11);

    public static native void callPJJPV(long r0, long r2, int r4, long r5, int r7, int r8, long r9, long r11);

    public static native void callPJPPV(long r0, int r2, long r3, int r5, int r6, long r7, long r9, long r11);

    public static native void callPPPPV(int r0, int r1, int r2, long r3, long r5, long r7, long r9, long r11);

    public static native void callPPPPV(int r0, int r1, long r2, long r4, long r6, long r8, int r10, long r11);

    public static native void callPJJPV(long r0, long r2, int r4, long r5, int r7, int r8, long r9, int r11, long r12);

    public static native void callPJPPV(long r0, int r2, long r3, int r5, int r6, long r7, int r9, long r10, long r12);

    public static native void callPPPPV(long r0, int r2, int r3, int r4, int r5, long r6, int r8, long r9, int r11, long r12, long r14);

    public static native void callPJJJPV(long r0, long r2, long r4, long r6, long r8, long r10);

    public static native void callPPPPPV(long r0, int r2, long r3, long r5, long r7, long r9, long r11);

    public static native void callPJJJJV(long r0, long r2, long r4, long r6, long r8, int r10, int r11, long r12);

    public static native void callPPPPPV(int r0, int r1, long r2, long r4, long r6, long r8, long r10, long r12);

    public static native void callPPPPPV(long r0, int r2, int r3, long r4, long r6, long r8, long r10, long r12);

    public static native void callPJJJJV(long r0, long r2, int r4, int r5, long r6, long r8, long r10, int r12, long r13);

    public static native void callPJPPPV(long r0, int r2, int r3, long r4, long r6, int r8, long r9, long r11, long r13);

    public static native void callPPPPPV(long r0, long r2, long r4, long r6, long r8, int r10, int r11, int r12, long r13);

    public static native void callPPPPPV(long r0, int r2, long r3, int r5, int r6, int r7, long r8, int r10, long r11, int r13, long r14, long r16);

    public static native void callPPPPPJV(long r0, long r2, long r4, long r6, long r8, long r10, long r12);

    public static native void callPPPPPPV(long r0, long r2, long r4, int r6, int r7, long r8, long r10, long r12, long r14);

    public static native void callPPPPPPPV(int r0, int r1, int r2, long r3, int r5, long r6, long r8, long r10, long r12, long r14, long r16, long r18);

    public static native void callPPJJJJJJV(long r0, long r2, long r4, long r6, int r8, long r9, long r11, long r13, long r15, long r17);

    public static native void callPJJJJJJJJJJJV(long r0, long r2, long r4, long r6, long r8, long r10, long r12, long r14, long r16, long r18, long r20, long r22, int r24, int r25, int r26, long r27);

    public static native boolean callZ(long r0);

    public static native boolean callZ(int r0, long r1);

    public static native boolean callZ(boolean r0, long r1);

    public static native boolean callZ(int r0, int r1, long r2);

    public static native boolean callZ(int r0, float r1, float r2, long r3);

    public static native boolean callZ(int r0, int r1, float r2, float r3, long r4);

    public static native boolean callJZ(long r0, long r2);

    public static native boolean callPZ(long r0, long r2);

    public static native boolean callJZ(int r0, long r1, long r3);

    public static native boolean callPZ(int r0, long r1, long r3);

    public static native boolean callPZ(long r0, int r2, long r3);

    public static native boolean callJZ(int r0, long r1, int r3, long r4);

    public static native boolean callPZ(int r0, int r1, long r2, long r4);

    public static native boolean callPZ(int r0, long r1, int r3, long r4);

    public static native boolean callPZ(int r0, float r1, float r2, long r3, long r5);

    public static native boolean callPPZ(long r0, long r2, long r4);

    public static native boolean callJPZ(long r0, long r2, int r4, long r5);

    public static native boolean callPPZ(int r0, long r1, long r3, long r5);

    public static native boolean callPPZ(long r0, int r2, long r3, long r5);

    public static native boolean callPPZ(long r0, long r2, int r4, long r5);

    public static native boolean callPPZ(int r0, long r1, int r3, long r4, long r6);

    public static native boolean callPPZ(int r0, int r1, long r2, int r4, long r5, long r7);

    public static native boolean callJPPZ(long r0, long r2, long r4, long r6);

    public static native boolean callPPPZ(long r0, long r2, long r4, long r6);

    public static native boolean callPPPPZ(int r0, int r1, int r2, float r3, long r4, long r6, long r8, long r10, long r12);

    public static native boolean callPPJPPZ(long r0, long r2, long r4, long r6, long r8, long r10);

    public static native boolean callPPPPPZ(long r0, long r2, long r4, long r6, long r8, long r10);

    public static native short invokeUPC(byte r0, @javax.annotation.Nullable short[] r1, boolean r2, long r3);

    public static native short invokeCPCC(short r0, @javax.annotation.Nullable short[] r1, short r2, long r3);

    public static native int invokeCPI(short r0, @javax.annotation.Nullable int[] r1, long r2);

    public static native int invokePCI(@javax.annotation.Nullable float[] r0, short r1, long r2);

    public static native int invokePPI(int r0, long r1, @javax.annotation.Nullable int[] r3, long r4);

    public static native int invokePPI(int r0, @javax.annotation.Nullable int[] r1, int r2, @javax.annotation.Nullable int[] r3, int r4, boolean r5, long r6);

    public static native int invokePPI(int r0, @javax.annotation.Nullable short[] r1, int r2, @javax.annotation.Nullable short[] r3, int r4, boolean r5, long r6);

    public static native int invokeCPUI(short r0, @javax.annotation.Nullable float[] r1, byte r2, long r3);

    public static native int invokeCPUI(short r0, @javax.annotation.Nullable int[] r1, byte r2, long r3);

    public static native int invokeCPUI(short r0, @javax.annotation.Nullable short[] r1, byte r2, long r3);

    public static native int invokePPCI(long r0, @javax.annotation.Nullable float[] r2, short r3, long r4);

    public static native int invokePPPI(@javax.annotation.Nullable int[] r0, long r1, long r3, int r5, boolean r6, float r7, long r8);

    public static native int invokePPPI(@javax.annotation.Nullable short[] r0, long r1, long r3, int r5, boolean r6, float r7, long r8);

    public static native int invokePPPPI(long r0, long r2, long r4, @javax.annotation.Nullable long[] r6, long r7);

    public static native int invokePPPPI(long r0, long r2, int r4, int r5, @javax.annotation.Nullable float[] r6, @javax.annotation.Nullable int[] r7, long r8);

    public static native int invokePPPPI(long r0, long r2, int r4, int r5, @javax.annotation.Nullable int[] r6, @javax.annotation.Nullable int[] r7, long r8);

    public static native int invokePPPPPI(long r0, @javax.annotation.Nullable int[] r2, @javax.annotation.Nullable int[] r3, @javax.annotation.Nullable int[] r4, long r5, long r7);

    public static native int invokePNNPPPI(long r0, long r2, long r4, int r6, int r7, @javax.annotation.Nullable int[] r8, @javax.annotation.Nullable int[] r9, long r10, long r12);

    public static native int invokePPPPPPPPI(long r0, int r2, int r3, long r4, @javax.annotation.Nullable int[] r6, @javax.annotation.Nullable int[] r7, @javax.annotation.Nullable float[] r8, @javax.annotation.Nullable int[] r9, @javax.annotation.Nullable int[] r10, @javax.annotation.Nullable int[] r11, long r12);

    public static native long invokePP(@javax.annotation.Nullable double[] r0, int r1, long r2);

    public static native long invokePP(@javax.annotation.Nullable float[] r0, int r1, long r2);

    public static native long invokePP(@javax.annotation.Nullable int[] r0, int r1, long r2);

    public static native long invokePP(@javax.annotation.Nullable long[] r0, int r1, long r2);

    public static native long invokePP(@javax.annotation.Nullable short[] r0, int r1, long r2);

    public static native long invokePPP(long r0, @javax.annotation.Nullable int[] r2, long r3);

    public static native byte invokeUPU(byte r0, @javax.annotation.Nullable int[] r1, long r2);

    public static native void invokePV(int r0, @javax.annotation.Nullable double[] r1, long r2);

    public static native void invokePV(int r0, @javax.annotation.Nullable float[] r1, long r2);

    public static native void invokePV(int r0, @javax.annotation.Nullable int[] r1, long r2);

    public static native void invokePV(int r0, int r1, @javax.annotation.Nullable double[] r2, long r3);

    public static native void invokePV(int r0, int r1, @javax.annotation.Nullable float[] r2, long r3);

    public static native void invokePV(int r0, int r1, @javax.annotation.Nullable int[] r2, long r3);

    public static native void invokePV(int r0, int r1, @javax.annotation.Nullable long[] r2, long r3);

    public static native void invokePV(int r0, @javax.annotation.Nullable int[] r1, boolean r2, long r3);

    public static native void invokePV(int r0, int r1, @javax.annotation.Nullable float[] r2, int r3, int r4, long r5);

    public static native void invokePV(int r0, int r1, @javax.annotation.Nullable int[] r2, int r3, int r4, long r5);

    public static native void invokePV(int r0, int r1, @javax.annotation.Nullable short[] r2, int r3, int r4, long r5);

    public static native void invokePV(int r0, int r1, int r2, int r3, int r4, @javax.annotation.Nullable double[] r5, long r6);

    public static native void invokePV(int r0, int r1, int r2, int r3, int r4, @javax.annotation.Nullable float[] r5, long r6);

    public static native void invokePV(int r0, int r1, int r2, int r3, int r4, @javax.annotation.Nullable int[] r5, long r6);

    public static native void invokePV(int r0, int r1, int r2, int r3, int r4, @javax.annotation.Nullable short[] r5, long r6);

    public static native void invokePV(int r0, int r1, int r2, int r3, int r4, int r5, @javax.annotation.Nullable double[] r6, long r7);

    public static native void invokePV(int r0, int r1, int r2, int r3, int r4, int r5, @javax.annotation.Nullable float[] r6, long r7);

    public static native void invokePV(int r0, int r1, int r2, int r3, int r4, int r5, @javax.annotation.Nullable int[] r6, long r7);

    public static native void invokePV(int r0, int r1, int r2, int r3, int r4, int r5, @javax.annotation.Nullable short[] r6, long r7);

    public static native void invokeUPV(byte r0, @javax.annotation.Nullable float[] r1, long r2);

    public static native void invokePJV(int r0, @javax.annotation.Nullable int[] r1, long r2, long r4);

    public static native void invokePPV(long r0, @javax.annotation.Nullable float[] r2, int r3, long r4);

    public static native void invokePPV(long r0, @javax.annotation.Nullable int[] r2, int r3, long r4);

    public static native void invokePPV(long r0, @javax.annotation.Nullable short[] r2, int r3, long r4);

    public static native void invokePPV(long r0, int r2, int r3, @javax.annotation.Nullable int[] r4, long r5);

    public static native void invokePPV(long r0, int r2, int r3, @javax.annotation.Nullable long[] r4, long r5);

    public static native void invokeCCPV(short r0, short r1, @javax.annotation.Nullable short[] r2, long r3);

    public static native void invokeCPCV(short r0, @javax.annotation.Nullable double[] r1, short r2, long r3);

    public static native void invokeCPCV(short r0, @javax.annotation.Nullable float[] r1, short r2, long r3);

    public static native void invokeCPCV(short r0, @javax.annotation.Nullable int[] r1, short r2, long r3);

    public static native void invokeCPCV(short r0, @javax.annotation.Nullable long[] r1, short r2, long r3);

    public static native void invokeCPCV(short r0, @javax.annotation.Nullable short[] r1, short r2, long r3);

    public static native void invokeCPPV(short r0, @javax.annotation.Nullable float[] r1, @javax.annotation.Nullable float[] r2, long r3);

    public static native void invokePNPV(long r0, long r2, @javax.annotation.Nullable short[] r4, long r5);

    public static native void invokePPPV(long r0, @javax.annotation.Nullable double[] r2, @javax.annotation.Nullable double[] r3, long r4);

    public static native void invokePPPV(long r0, @javax.annotation.Nullable float[] r2, @javax.annotation.Nullable float[] r3, long r4);

    public static native void invokePPPV(long r0, @javax.annotation.Nullable int[] r2, @javax.annotation.Nullable int[] r3, long r4);

    public static native void invokePPPV(@javax.annotation.Nullable int[] r0, @javax.annotation.Nullable int[] r1, @javax.annotation.Nullable int[] r2, long r3);

    public static native void invokePPPV(int r0, @javax.annotation.Nullable float[] r1, @javax.annotation.Nullable float[] r2, @javax.annotation.Nullable float[] r3, long r4);

    public static native void invokePPPV(int r0, int r1, @javax.annotation.Nullable double[] r2, @javax.annotation.Nullable double[] r3, @javax.annotation.Nullable double[] r4, long r5);

    public static native void invokePPPV(int r0, int r1, @javax.annotation.Nullable float[] r2, @javax.annotation.Nullable float[] r3, @javax.annotation.Nullable float[] r4, long r5);

    public static native void invokePPPV(int r0, int r1, @javax.annotation.Nullable long[] r2, @javax.annotation.Nullable long[] r3, @javax.annotation.Nullable long[] r4, long r5);

    public static native void invokePPPV(@javax.annotation.Nullable float[] r0, int r1, long r2, long r4, int r6, long r7);

    public static native void invokePPPV(@javax.annotation.Nullable float[] r0, boolean r1, int r2, long r3, long r5, int r7, long r8);

    public static native void invokePCPCV(long r0, short r2, @javax.annotation.Nullable double[] r3, short r4, long r5);

    public static native void invokePCPCV(long r0, short r2, @javax.annotation.Nullable float[] r3, short r4, long r5);

    public static native void invokePCPCV(long r0, short r2, @javax.annotation.Nullable int[] r3, short r4, long r5);

    public static native void invokePCPCV(long r0, short r2, @javax.annotation.Nullable long[] r3, short r4, long r5);

    public static native void invokePCPCV(long r0, short r2, @javax.annotation.Nullable short[] r3, short r4, long r5);

    public static native void invokePNPPV(long r0, long r2, long r4, @javax.annotation.Nullable short[] r6, long r7);

    public static native void invokePPPPPV(long r0, long r2, long r4, @javax.annotation.Nullable float[] r6, long r7, long r9);

    public static native void invokePPPPPV(long r0, @javax.annotation.Nullable int[] r2, @javax.annotation.Nullable int[] r3, @javax.annotation.Nullable int[] r4, @javax.annotation.Nullable int[] r5, long r6);

    public static native void invokePPPPPV(long r0, int r2, long r3, @javax.annotation.Nullable int[] r5, long r6, long r8, long r10);

    public static native void invokePPPPPV(int r0, long r1, int r3, @javax.annotation.Nullable float[] r4, @javax.annotation.Nullable float[] r5, long r6, int r8, long r9, int r11, boolean r12, long r13);

    public static native void invokePPPPPV(int r0, @javax.annotation.Nullable int[] r1, int r2, @javax.annotation.Nullable float[] r3, @javax.annotation.Nullable float[] r4, long r5, int r7, @javax.annotation.Nullable int[] r8, int r9, boolean r10, long r11);

    public static native void invokePPPPPV(int r0, @javax.annotation.Nullable short[] r1, int r2, @javax.annotation.Nullable float[] r3, @javax.annotation.Nullable float[] r4, long r5, int r7, @javax.annotation.Nullable short[] r8, int r9, boolean r10, long r11);

    public static native boolean invokePPZ(long r0, @javax.annotation.Nullable int[] r2, long r3);

    public static native boolean invokePPPZ(long r0, long r2, @javax.annotation.Nullable int[] r4, long r5);

    public static native int callPI(@javax.annotation.Nullable int[] r0, long r1);

    public static native int callPI(int r0, @javax.annotation.Nullable int[] r1, long r2);

    public static native int callPI(@javax.annotation.Nullable int[] r0, int r1, long r2);

    public static native int callPI(int r0, int r1, @javax.annotation.Nullable int[] r2, long r3);

    public static native int callPI(int r0, @javax.annotation.Nullable int[] r1, int r2, long r3);

    public static native int callPI(int r0, int r1, int r2, @javax.annotation.Nullable int[] r3, long r4);

    public static native int callPI(int r0, int r1, int r2, int r3, @javax.annotation.Nullable float[] r4, long r5);

    public static native int callPI(int r0, int r1, int r2, int r3, @javax.annotation.Nullable int[] r4, long r5);

    public static native int callPPI(long r0, @javax.annotation.Nullable int[] r2, long r3);

    public static native int callPPI(long r0, @javax.annotation.Nullable long[] r2, long r3);

    public static native int callPPI(@javax.annotation.Nullable int[] r0, long r1, long r3);

    public static native int callPPI(int r0, long r1, @javax.annotation.Nullable int[] r3, long r4);

    public static native int callPPI(long r0, int r2, @javax.annotation.Nullable double[] r3, long r4);

    public static native int callPPI(long r0, int r2, @javax.annotation.Nullable float[] r3, long r4);

    public static native int callPPI(long r0, int r2, @javax.annotation.Nullable int[] r3, long r4);

    public static native int callPPI(long r0, int r2, @javax.annotation.Nullable long[] r3, long r4);

    public static native int callPPI(long r0, int r2, @javax.annotation.Nullable short[] r3, long r4);

    public static native int callPPI(long r0, int r2, int r3, @javax.annotation.Nullable int[] r4, long r5);

    public static native int callPPI(long r0, int r2, int r3, @javax.annotation.Nullable long[] r4, long r5);

    public static native int callPPI(int r0, long r1, int r3, int r4, float r5, @javax.annotation.Nullable int[] r6, long r7);

    public static native int callPJPI(long r0, long r2, @javax.annotation.Nullable int[] r4, long r5);

    public static native int callPJPI(long r0, long r2, @javax.annotation.Nullable long[] r4, long r5);

    public static native int callPPPI(long r0, long r2, @javax.annotation.Nullable int[] r4, long r5);

    public static native int callPPPI(long r0, long r2, @javax.annotation.Nullable long[] r4, long r5);

    public static native int callPPPI(long r0, @javax.annotation.Nullable int[] r2, long r3, long r5);

    public static native int callPPPI(long r0, @javax.annotation.Nullable int[] r2, @javax.annotation.Nullable int[] r3, long r4);

    public static native int callPPPI(long r0, @javax.annotation.Nullable long[] r2, @javax.annotation.Nullable long[] r3, long r4);

    public static native int callPPPI(@javax.annotation.Nullable int[] r0, long r1, @javax.annotation.Nullable int[] r3, long r4);

    public static native int callPJPI(long r0, int r2, long r3, @javax.annotation.Nullable int[] r5, long r6);

    public static native int callPJPI(long r0, long r2, int r4, @javax.annotation.Nullable long[] r5, long r6);

    public static native int callPPPI(long r0, int r2, long r3, @javax.annotation.Nullable double[] r5, long r6);

    public static native int callPPPI(long r0, int r2, long r3, @javax.annotation.Nullable float[] r5, long r6);

    public static native int callPPPI(long r0, int r2, long r3, @javax.annotation.Nullable int[] r5, long r6);

    public static native int callPPPI(long r0, int r2, long r3, @javax.annotation.Nullable long[] r5, long r6);

    public static native int callPPPI(long r0, int r2, long r3, @javax.annotation.Nullable short[] r5, long r6);

    public static native int callPPPI(long r0, int r2, @javax.annotation.Nullable int[] r3, @javax.annotation.Nullable int[] r4, long r5);

    public static native int callPPPI(long r0, int r2, @javax.annotation.Nullable int[] r3, @javax.annotation.Nullable long[] r4, long r5);

    public static native int callPPPI(long r0, long r2, int r4, @javax.annotation.Nullable int[] r5, long r6);

    public static native int callPPPI(long r0, long r2, int r4, @javax.annotation.Nullable long[] r5, long r6);

    public static native int callPPPI(long r0, long r2, @javax.annotation.Nullable int[] r4, int r5, long r6);

    public static native int callPPJI(long r0, int r2, @javax.annotation.Nullable long[] r3, int r4, long r5, long r7);

    public static native int callPPPI(long r0, int r2, int r3, long r4, @javax.annotation.Nullable int[] r6, long r7);

    public static native int callPPPI(long r0, int r2, int r3, int r4, @javax.annotation.Nullable int[] r5, @javax.annotation.Nullable float[] r6, long r7);

    public static native int callPPPI(long r0, int r2, int r3, int r4, @javax.annotation.Nullable int[] r5, @javax.annotation.Nullable int[] r6, long r7);

    public static native int callPJPPI(long r0, long r2, long r4, @javax.annotation.Nullable int[] r6, long r7);

    public static native int callPJPPI(long r0, long r2, long r4, @javax.annotation.Nullable long[] r6, long r7);

    public static native int callPJPPI(long r0, long r2, @javax.annotation.Nullable int[] r4, long r5, long r7);

    public static native int callPJPPI(long r0, long r2, @javax.annotation.Nullable int[] r4, @javax.annotation.Nullable int[] r5, long r6);

    public static native int callPJPPI(long r0, long r2, @javax.annotation.Nullable int[] r4, @javax.annotation.Nullable long[] r5, long r6);

    public static native int callPPNPI(long r0, long r2, long r4, @javax.annotation.Nullable long[] r6, long r7);

    public static native int callPPPPI(long r0, long r2, long r4, @javax.annotation.Nullable long[] r6, long r7);

    public static native int callPPPPI(long r0, long r2, @javax.annotation.Nullable int[] r4, long r5, long r7);

    public static native int callPPPPI(long r0, long r2, @javax.annotation.Nullable int[] r4, @javax.annotation.Nullable int[] r5, long r6);

    public static native int callPJPPI(long r0, long r2, int r4, long r5, @javax.annotation.Nullable int[] r7, long r8);

    public static native int callPPPPI(long r0, int r2, long r3, long r5, @javax.annotation.Nullable long[] r7, long r8);

    public static native int callPPPPI(long r0, int r2, long r3, @javax.annotation.Nullable int[] r5, long r6, long r8);

    public static native int callPPPPI(long r0, int r2, long r3, @javax.annotation.Nullable long[] r5, long r6, long r8);

    public static native int callPPPPI(long r0, int r2, long r3, @javax.annotation.Nullable long[] r5, @javax.annotation.Nullable long[] r6, long r7);

    public static native int callPPPPI(long r0, int r2, @javax.annotation.Nullable int[] r3, long r4, long r6, long r8);

    public static native int callPPPPI(long r0, long r2, int r4, long r5, @javax.annotation.Nullable int[] r7, long r8);

    public static native int callPPPPI(long r0, long r2, int r4, @javax.annotation.Nullable long[] r5, long r6, long r8);

    public static native int callPPPPI(long r0, long r2, long r4, int r6, @javax.annotation.Nullable int[] r7, long r8);

    public static native int callPPPPI(long r0, @javax.annotation.Nullable int[] r2, long r3, int r5, @javax.annotation.Nullable int[] r6, long r7);

    public static native int callPPPPI(long r0, @javax.annotation.Nullable long[] r2, int r3, long r4, @javax.annotation.Nullable int[] r6, long r7);

    public static native int callPJPPI(long r0, long r2, int r4, int r5, long r6, @javax.annotation.Nullable int[] r8, long r9);

    public static native int callPJPPI(long r0, long r2, int r4, int r5, @javax.annotation.Nullable int[] r6, @javax.annotation.Nullable int[] r7, long r8);

    public static native int callPPPPI(long r0, int r2, int r3, long r4, @javax.annotation.Nullable int[] r6, long r7, long r9);

    public static native int callPPPPI(long r0, int r2, int r3, long r4, @javax.annotation.Nullable long[] r6, long r7, long r9);

    public static native int callPPPPI(long r0, int r2, int r3, @javax.annotation.Nullable long[] r4, @javax.annotation.Nullable int[] r5, @javax.annotation.Nullable int[] r6, long r7);

    public static native int callPJPPI(long r0, long r2, int r4, int r5, int r6, long r7, @javax.annotation.Nullable int[] r9, long r10);

    public static native int callPPPPI(long r0, int r2, long r3, int r5, int r6, long r7, @javax.annotation.Nullable int[] r9, long r10);

    public static native int callPPPPI(int r0, @javax.annotation.Nullable int[] r1, @javax.annotation.Nullable long[] r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, @javax.annotation.Nullable int[] r21, @javax.annotation.Nullable long[] r22, long r23);

    public static native int callPJPPPI(long r0, long r2, long r4, long r6, @javax.annotation.Nullable long[] r8, long r9);

    public static native int callPPJPPI(long r0, long r2, long r4, @javax.annotation.Nullable int[] r6, long r7, long r9);

    public static native int callPPPPPI(long r0, long r2, @javax.annotation.Nullable int[] r4, @javax.annotation.Nullable int[] r5, @javax.annotation.Nullable int[] r6, long r7);

    public static native int callPPPPPI(long r0, long r2, @javax.annotation.Nullable int[] r4, @javax.annotation.Nullable int[] r5, @javax.annotation.Nullable long[] r6, long r7);

    public static native int callPPPPPI(long r0, @javax.annotation.Nullable int[] r2, @javax.annotation.Nullable int[] r3, @javax.annotation.Nullable int[] r4, long r5, long r7);

    public static native int callPJPPPI(long r0, long r2, int r4, long r5, long r7, @javax.annotation.Nullable long[] r9, long r10);

    public static native int callPPPPPI(long r0, long r2, int r4, long r5, @javax.annotation.Nullable int[] r7, long r8, long r10);

    public static native int callPPPPPI(long r0, long r2, int r4, long r5, @javax.annotation.Nullable long[] r7, long r8, long r10);

    public static native int callPPPPPI(long r0, long r2, int r4, @javax.annotation.Nullable int[] r5, @javax.annotation.Nullable int[] r6, long r7, long r9);

    public static native int callPPPPPI(long r0, long r2, long r4, @javax.annotation.Nullable int[] r6, int r7, @javax.annotation.Nullable int[] r8, long r9);

    public static native int callPPPPPI(long r0, @javax.annotation.Nullable int[] r2, @javax.annotation.Nullable float[] r3, int r4, @javax.annotation.Nullable int[] r5, @javax.annotation.Nullable int[] r6, long r7);

    public static native int callPPPPPI(int r0, int r1, @javax.annotation.Nullable int[] r2, @javax.annotation.Nullable int[] r3, @javax.annotation.Nullable int[] r4, @javax.annotation.Nullable int[] r5, long r6, long r8);

    public static native int callPPPPPI(long r0, int r2, long r3, @javax.annotation.Nullable long[] r5, int r6, long r7, long r9, long r11);

    public static native int callPPPPPI(long r0, int r2, @javax.annotation.Nullable long[] r3, int r4, long r5, long r7, long r9, long r11);

    public static native int callPJPPJI(long r0, long r2, int r4, int r5, long r6, @javax.annotation.Nullable int[] r8, long r9, int r11, long r12);

    public static native int callPJPPJI(long r0, long r2, int r4, int r5, long r6, @javax.annotation.Nullable long[] r8, long r9, int r11, long r12);

    public static native int callPJJJJPI(long r0, long r2, long r4, long r6, long r8, @javax.annotation.Nullable int[] r10, long r11);

    public static native int callPPPPPPI(long r0, @javax.annotation.Nullable int[] r2, @javax.annotation.Nullable int[] r3, @javax.annotation.Nullable int[] r4, @javax.annotation.Nullable int[] r5, @javax.annotation.Nullable int[] r6, long r7);

    public static native int callPJJPPPI(long r0, long r2, long r4, int r6, long r7, long r9, @javax.annotation.Nullable long[] r11, long r12);

    public static native int callPPPPPPI(int r0, int r1, @javax.annotation.Nullable int[] r2, @javax.annotation.Nullable int[] r3, @javax.annotation.Nullable int[] r4, @javax.annotation.Nullable int[] r5, @javax.annotation.Nullable int[] r6, long r7, long r9);

    public static native int callPPPPPPPI(long r0, long r2, long r4, long r6, int r8, long r9, @javax.annotation.Nullable int[] r11, long r12, long r14);

    public static native int callPPPPPPPI(long r0, long r2, @javax.annotation.Nullable float[] r4, long r5, long r7, int r9, long r10, long r12, long r14);

    public static native int callPPPPPPPI(long r0, long r2, @javax.annotation.Nullable int[] r4, long r5, long r7, int r9, long r10, long r12, long r14);

    public static native int callPPPPPPPI(long r0, long r2, int r4, long r5, long r7, @javax.annotation.Nullable double[] r9, int r10, long r11, long r13, long r15);

    public static native int callPPPPPPPI(long r0, long r2, int r4, long r5, long r7, @javax.annotation.Nullable float[] r9, int r10, long r11, long r13, long r15);

    public static native int callPPPPPPPI(long r0, long r2, int r4, long r5, long r7, @javax.annotation.Nullable int[] r9, int r10, long r11, long r13, long r15);

    public static native int callPPPPPPPI(long r0, long r2, int r4, long r5, long r7, @javax.annotation.Nullable short[] r9, int r10, long r11, long r13, long r15);

    public static native int callPPJPPPPPI(long r0, @javax.annotation.Nullable long[] r2, long r3, long r5, long r7, int r9, long r10, long r12, long r14, long r16);

    public static native int callPPJPPPPPI(long r0, @javax.annotation.Nullable long[] r2, long r3, long r5, long r7, int r9, long r10, @javax.annotation.Nullable int[] r12, long r13, long r15);

    public static native int callPPPPPPPPPI(long r0, long r2, long r4, long r6, long r8, long r10, int r12, @javax.annotation.Nullable int[] r13, @javax.annotation.Nullable int[] r14, long r15, long r17);

    public static native int callPPPPPPPPPI(long r0, long r2, long r4, @javax.annotation.Nullable float[] r6, long r7, long r9, int r11, @javax.annotation.Nullable int[] r12, @javax.annotation.Nullable int[] r13, long r14, long r16);

    public static native int callPPPPPPPPPI(long r0, long r2, long r4, @javax.annotation.Nullable int[] r6, long r7, long r9, int r11, @javax.annotation.Nullable int[] r12, @javax.annotation.Nullable int[] r13, long r14, long r16);

    public static native int callPPPPPPPPPI(long r0, long r2, int r4, long r5, long r7, long r9, long r11, @javax.annotation.Nullable double[] r13, int r14, long r15, long r17, long r19);

    public static native int callPPPPPPPPPI(long r0, long r2, int r4, long r5, long r7, long r9, long r11, @javax.annotation.Nullable float[] r13, int r14, long r15, long r17, long r19);

    public static native int callPPPPPPPPPI(long r0, long r2, int r4, long r5, long r7, long r9, long r11, @javax.annotation.Nullable int[] r13, int r14, long r15, long r17, long r19);

    public static native int callPPPPPPPPPI(long r0, long r2, int r4, long r5, long r7, long r9, long r11, @javax.annotation.Nullable short[] r13, int r14, long r15, long r17, long r19);

    public static native int callPPPPPPPPPPI(long r0, long r2, long r4, long r6, long r8, long r10, long r12, int r14, @javax.annotation.Nullable int[] r15, @javax.annotation.Nullable int[] r16, long r17, long r19);

    public static native int callPPPPPPPPPPI(long r0, long r2, @javax.annotation.Nullable long[] r4, long r5, int r7, long r8, long r10, long r12, int r14, @javax.annotation.Nullable int[] r15, @javax.annotation.Nullable int[] r16, long r17, long r19);

    public static native int callPPPPPPPPPPPPI(long r0, long r2, int r4, long r5, long r7, long r9, long r11, long r13, long r15, long r17, @javax.annotation.Nullable double[] r19, int r20, long r21, long r23, long r25);

    public static native int callPPPPPPPPPPPPI(long r0, long r2, int r4, long r5, long r7, long r9, long r11, long r13, long r15, long r17, @javax.annotation.Nullable float[] r19, int r20, long r21, long r23, long r25);

    public static native int callPPPPPPPPPPPPI(long r0, long r2, int r4, long r5, long r7, long r9, long r11, long r13, long r15, long r17, @javax.annotation.Nullable int[] r19, int r20, long r21, long r23, long r25);

    public static native int callPPPPPPPPPPPPI(long r0, long r2, int r4, long r5, long r7, long r9, long r11, long r13, long r15, long r17, @javax.annotation.Nullable short[] r19, int r20, long r21, long r23, long r25);

    public static native int callPPPPPPPPPPPPPPI(long r0, long r2, long r4, long r6, long r8, long r10, long r12, long r14, long r16, long r18, long r20, int r22, @javax.annotation.Nullable int[] r23, @javax.annotation.Nullable int[] r24, long r25, long r27);

    public static native long callPP(@javax.annotation.Nullable int[] r0, long r1);

    public static native long callPPP(long r0, @javax.annotation.Nullable int[] r2, long r3);

    public static native long callPPP(int r0, long r1, @javax.annotation.Nullable int[] r3, long r4);

    public static native long callPPP(long r0, int r2, @javax.annotation.Nullable int[] r3, long r4);

    public static native long callPPP(int r0, int r1, int r2, @javax.annotation.Nullable int[] r3, @javax.annotation.Nullable int[] r4, long r5);

    public static native long callPPP(long r0, int r2, int r3, int r4, @javax.annotation.Nullable int[] r5, long r6);

    public static native long callPPPP(long r0, long r2, @javax.annotation.Nullable int[] r4, long r5);

    public static native long callPPPP(long r0, @javax.annotation.Nullable long[] r2, @javax.annotation.Nullable int[] r3, long r4);

    public static native long callPJPP(long r0, long r2, int r4, @javax.annotation.Nullable int[] r5, long r6);

    public static native long callPPPP(int r0, long r1, @javax.annotation.Nullable long[] r3, @javax.annotation.Nullable int[] r4, long r5);

    public static native long callPPPP(long r0, int r2, @javax.annotation.Nullable int[] r3, long r4, long r6);

    public static native long callPPPP(long r0, long r2, int r4, @javax.annotation.Nullable int[] r5, long r6);

    public static native long callPPPP(long r0, long r2, int r4, int r5, @javax.annotation.Nullable int[] r6, long r7);

    public static native long callPJPP(long r0, long r2, int r4, int r5, int r6, @javax.annotation.Nullable int[] r7, long r8);

    public static native long callPPJPP(long r0, long r2, long r4, @javax.annotation.Nullable int[] r6, long r7);

    public static native long callPPNPP(long r0, long r2, long r4, @javax.annotation.Nullable int[] r6, long r7);

    public static native long callPPPPP(long r0, long r2, long r4, @javax.annotation.Nullable int[] r6, long r7);

    public static native long callPPPPP(long r0, long r2, @javax.annotation.Nullable long[] r4, @javax.annotation.Nullable int[] r5, long r6);

    public static native long callPJPPP(long r0, long r2, int r4, long r5, @javax.annotation.Nullable int[] r7, long r8);

    public static native long callPJPPP(long r0, long r2, @javax.annotation.Nullable int[] r4, int r5, @javax.annotation.Nullable int[] r6, long r7);

    public static native long callPPPPP(long r0, int r2, long r3, long r5, @javax.annotation.Nullable int[] r7, long r8);

    public static native long callPPPPP(long r0, long r2, int r4, long r5, @javax.annotation.Nullable int[] r7, long r8);

    public static native long callPPPPP(long r0, long r2, long r4, int r6, @javax.annotation.Nullable int[] r7, long r8);

    public static native long callPPPPP(long r0, @javax.annotation.Nullable long[] r2, long r3, int r5, @javax.annotation.Nullable int[] r6, long r7);

    public static native long callPJPPP(long r0, long r2, int r4, int r5, long r6, @javax.annotation.Nullable int[] r8, long r9);

    public static native long callPJPPPP(long r0, long r2, long r4, long r6, @javax.annotation.Nullable int[] r8, long r9);

    public static native long callPJPPPP(long r0, long r2, long r4, @javax.annotation.Nullable double[] r6, @javax.annotation.Nullable int[] r7, long r8);

    public static native long callPJPPPP(long r0, long r2, long r4, @javax.annotation.Nullable float[] r6, @javax.annotation.Nullable int[] r7, long r8);

    public static native long callPJPPPP(long r0, long r2, long r4, @javax.annotation.Nullable int[] r6, @javax.annotation.Nullable int[] r7, long r8);

    public static native long callPJPPPP(long r0, long r2, long r4, @javax.annotation.Nullable short[] r6, @javax.annotation.Nullable int[] r7, long r8);

    public static native long callPPPPPP(long r0, int r2, long r3, long r5, long r7, @javax.annotation.Nullable int[] r9, long r10);

    public static native long callPPPPPP(long r0, long r2, @javax.annotation.Nullable long[] r4, long r5, int r7, @javax.annotation.Nullable int[] r8, long r9);

    public static native long callPJJPPPP(long r0, long r2, long r4, long r6, long r8, @javax.annotation.Nullable int[] r10, long r11);

    public static native long callPJJPPPP(long r0, long r2, long r4, long r6, @javax.annotation.Nullable double[] r8, @javax.annotation.Nullable int[] r9, long r10);

    public static native long callPJJPPPP(long r0, long r2, long r4, long r6, @javax.annotation.Nullable float[] r8, @javax.annotation.Nullable int[] r9, long r10);

    public static native long callPJJPPPP(long r0, long r2, long r4, long r6, @javax.annotation.Nullable int[] r8, @javax.annotation.Nullable int[] r9, long r10);

    public static native long callPJJPPPP(long r0, long r2, long r4, long r6, @javax.annotation.Nullable short[] r8, @javax.annotation.Nullable int[] r9, long r10);

    public static native long callPJPPPPP(long r0, long r2, long r4, long r6, long r8, @javax.annotation.Nullable int[] r10, long r11);

    public static native long callPJPPPPP(long r0, long r2, long r4, long r6, @javax.annotation.Nullable float[] r8, @javax.annotation.Nullable int[] r9, long r10);

    public static native long callPJPPPPP(long r0, long r2, long r4, long r6, @javax.annotation.Nullable int[] r8, @javax.annotation.Nullable int[] r9, long r10);

    public static native long callPJPPPPP(long r0, long r2, long r4, long r6, @javax.annotation.Nullable short[] r8, @javax.annotation.Nullable int[] r9, long r10);

    public static native long callPPJPPPP(long r0, @javax.annotation.Nullable long[] r2, long r3, long r5, long r7, @javax.annotation.Nullable int[] r9, long r10);

    public static native long callPPJPPPP(long r0, @javax.annotation.Nullable long[] r2, long r3, long r5, @javax.annotation.Nullable double[] r7, @javax.annotation.Nullable int[] r8, long r9);

    public static native long callPPJPPPP(long r0, @javax.annotation.Nullable long[] r2, long r3, long r5, @javax.annotation.Nullable float[] r7, @javax.annotation.Nullable int[] r8, long r9);

    public static native long callPPJPPPP(long r0, @javax.annotation.Nullable long[] r2, long r3, long r5, @javax.annotation.Nullable int[] r7, @javax.annotation.Nullable int[] r8, long r9);

    public static native long callPPJPPPP(long r0, @javax.annotation.Nullable long[] r2, long r3, long r5, @javax.annotation.Nullable short[] r7, @javax.annotation.Nullable int[] r8, long r9);

    public static native long callPPPJPPP(long r0, long r2, long r4, long r6, long r8, @javax.annotation.Nullable int[] r10, long r11);

    public static native long callPPPPPPP(long r0, int r2, long r3, long r5, long r7, @javax.annotation.Nullable int[] r9, @javax.annotation.Nullable int[] r10, long r11);

    public static native long callPPJPPPPP(long r0, @javax.annotation.Nullable long[] r2, long r3, long r5, long r7, long r9, @javax.annotation.Nullable int[] r11, long r12);

    public static native long callPPJPPPPP(long r0, @javax.annotation.Nullable long[] r2, long r3, long r5, long r7, @javax.annotation.Nullable float[] r9, @javax.annotation.Nullable int[] r10, long r11);

    public static native long callPPJPPPPP(long r0, @javax.annotation.Nullable long[] r2, long r3, long r5, long r7, @javax.annotation.Nullable int[] r9, @javax.annotation.Nullable int[] r10, long r11);

    public static native long callPPJPPPPP(long r0, @javax.annotation.Nullable long[] r2, long r3, long r5, long r7, @javax.annotation.Nullable short[] r9, @javax.annotation.Nullable int[] r10, long r11);

    public static native long callPPPPPPPP(long r0, int r2, long r3, long r5, int r7, long r8, long r10, long r12, @javax.annotation.Nullable int[] r14, long r15);

    public static native long callPPPPPPPP(int r0, @javax.annotation.Nullable int[] r1, @javax.annotation.Nullable long[] r2, int r3, int r4, int r5, int r6, long r7, long r9, long r11, int r13, @javax.annotation.Nullable int[] r14, @javax.annotation.Nullable long[] r15, long r16);

    public static native long callPJPPPPPPP(long r0, long r2, long r4, long r6, long r8, long r10, long r12, @javax.annotation.Nullable int[] r14, long r15);

    public static native long callPJPPPPPPP(long r0, long r2, long r4, long r6, long r8, long r10, @javax.annotation.Nullable float[] r12, @javax.annotation.Nullable int[] r13, long r14);

    public static native long callPJPPPPPPP(long r0, long r2, long r4, long r6, long r8, long r10, @javax.annotation.Nullable int[] r12, @javax.annotation.Nullable int[] r13, long r14);

    public static native long callPJPPPPPPP(long r0, long r2, long r4, long r6, long r8, long r10, @javax.annotation.Nullable short[] r12, @javax.annotation.Nullable int[] r13, long r14);

    public static native long callPPJPPPPPP(long r0, long r2, int r4, long r5, long r7, long r9, int r11, long r12, long r14, @javax.annotation.Nullable int[] r16, long r17);

    public static native long callPJPPPPPPPPP(long r0, long r2, long r4, long r6, long r8, long r10, long r12, long r14, long r16, @javax.annotation.Nullable int[] r18, long r19);

    public static native long callPJPPPPPPPPP(long r0, long r2, long r4, long r6, long r8, long r10, long r12, long r14, @javax.annotation.Nullable float[] r16, @javax.annotation.Nullable int[] r17, long r18);

    public static native long callPJPPPPPPPPP(long r0, long r2, long r4, long r6, long r8, long r10, long r12, long r14, @javax.annotation.Nullable int[] r16, @javax.annotation.Nullable int[] r17, long r18);

    public static native long callPJPPPPPPPPP(long r0, long r2, long r4, long r6, long r8, long r10, long r12, long r14, @javax.annotation.Nullable short[] r16, @javax.annotation.Nullable int[] r17, long r18);

    public static native long callPPJPPPPPPPP(long r0, long r2, int r4, long r5, long r7, long r9, long r11, long r13, int r15, long r16, long r18, @javax.annotation.Nullable int[] r20, long r21);

    public static native void callPV(@javax.annotation.Nullable double[] r0, long r1);

    public static native void callPV(@javax.annotation.Nullable float[] r0, long r1);

    public static native void callPV(@javax.annotation.Nullable int[] r0, long r1);

    public static native void callPV(@javax.annotation.Nullable short[] r0, long r1);

    public static native void callPV(int r0, @javax.annotation.Nullable double[] r1, long r2);

    public static native void callPV(int r0, @javax.annotation.Nullable float[] r1, long r2);

    public static native void callPV(int r0, @javax.annotation.Nullable int[] r1, long r2);

    public static native void callPV(int r0, @javax.annotation.Nullable long[] r1, long r2);

    public static native void callPV(int r0, @javax.annotation.Nullable short[] r1, long r2);

    public static native void callPV(int r0, int r1, @javax.annotation.Nullable double[] r2, long r3);

    public static native void callPV(int r0, int r1, @javax.annotation.Nullable float[] r2, long r3);

    public static native void callPV(int r0, int r1, @javax.annotation.Nullable int[] r2, long r3);

    public static native void callPV(int r0, int r1, @javax.annotation.Nullable long[] r2, long r3);

    public static native void callPV(int r0, int r1, @javax.annotation.Nullable short[] r2, long r3);

    public static native void callPV(int r0, @javax.annotation.Nullable int[] r1, int r2, long r3);

    public static native void callPV(int r0, int r1, int r2, @javax.annotation.Nullable double[] r3, long r4);

    public static native void callPV(int r0, int r1, int r2, @javax.annotation.Nullable float[] r3, long r4);

    public static native void callPV(int r0, int r1, int r2, @javax.annotation.Nullable int[] r3, long r4);

    public static native void callPV(int r0, int r1, int r2, @javax.annotation.Nullable long[] r3, long r4);

    public static native void callPV(int r0, int r1, int r2, @javax.annotation.Nullable short[] r3, long r4);

    public static native void callPV(int r0, int r1, boolean r2, @javax.annotation.Nullable double[] r3, long r4);

    public static native void callPV(int r0, int r1, boolean r2, @javax.annotation.Nullable float[] r3, long r4);

    public static native void callPV(int r0, int r1, boolean r2, @javax.annotation.Nullable int[] r3, long r4);

    public static native void callPV(int r0, int r1, @javax.annotation.Nullable int[] r2, int r3, long r4);

    public static native void callPV(int r0, @javax.annotation.Nullable int[] r1, int r2, int r3, long r4);

    public static native void callPV(int r0, int r1, int r2, int r3, @javax.annotation.Nullable double[] r4, long r5);

    public static native void callPV(int r0, int r1, int r2, int r3, @javax.annotation.Nullable float[] r4, long r5);

    public static native void callPV(int r0, int r1, int r2, int r3, @javax.annotation.Nullable int[] r4, long r5);

    public static native void callPV(int r0, int r1, int r2, int r3, @javax.annotation.Nullable long[] r4, long r5);

    public static native void callPV(int r0, int r1, int r2, int r3, @javax.annotation.Nullable short[] r4, long r5);

    public static native void callPV(int r0, int r1, int r2, boolean r3, @javax.annotation.Nullable double[] r4, long r5);

    public static native void callPV(int r0, int r1, int r2, boolean r3, @javax.annotation.Nullable float[] r4, long r5);

    public static native void callPV(int r0, int r1, int r2, @javax.annotation.Nullable int[] r3, boolean r4, long r5);

    public static native void callPV(int r0, int r1, @javax.annotation.Nullable int[] r2, int r3, int r4, long r5);

    public static native void callPV(int r0, boolean r1, int r2, int r3, @javax.annotation.Nullable int[] r4, long r5);

    public static native void callPV(int r0, double r1, double r3, int r5, int r6, @javax.annotation.Nullable double[] r7, long r8);

    public static native void callPV(int r0, float r1, float r2, int r3, int r4, @javax.annotation.Nullable float[] r5, long r6);

    public static native void callPV(int r0, int r1, int r2, int r3, int r4, @javax.annotation.Nullable double[] r5, long r6);

    public static native void callPV(int r0, int r1, int r2, int r3, int r4, @javax.annotation.Nullable float[] r5, long r6);

    public static native void callPV(int r0, int r1, int r2, int r3, int r4, @javax.annotation.Nullable int[] r5, long r6);

    public static native void callPV(int r0, int r1, int r2, int r3, int r4, @javax.annotation.Nullable short[] r5, long r6);

    public static native void callPV(int r0, int r1, int r2, int r3, @javax.annotation.Nullable int[] r4, boolean r5, long r6);

    public static native void callPV(int r0, int r1, int r2, boolean r3, int r4, @javax.annotation.Nullable float[] r5, long r6);

    public static native void callPV(int r0, int r1, int r2, boolean r3, int r4, @javax.annotation.Nullable int[] r5, long r6);

    public static native void callPV(int r0, int r1, int r2, boolean r3, int r4, @javax.annotation.Nullable short[] r5, long r6);

    public static native void callPV(int r0, int r1, int r2, int r3, int r4, int r5, @javax.annotation.Nullable double[] r6, long r7);

    public static native void callPV(int r0, int r1, int r2, int r3, int r4, int r5, @javax.annotation.Nullable float[] r6, long r7);

    public static native void callPV(int r0, int r1, int r2, int r3, int r4, int r5, @javax.annotation.Nullable int[] r6, long r7);

    public static native void callPV(int r0, int r1, int r2, int r3, int r4, int r5, @javax.annotation.Nullable short[] r6, long r7);

    public static native void callPV(int r0, int r1, @javax.annotation.Nullable int[] r2, int r3, int r4, int r5, int r6, long r7);

    public static native void callPV(int r0, int r1, int r2, int r3, int r4, int r5, int r6, @javax.annotation.Nullable double[] r7, long r8);

    public static native void callPV(int r0, int r1, int r2, int r3, int r4, int r5, int r6, @javax.annotation.Nullable float[] r7, long r8);

    public static native void callPV(int r0, int r1, int r2, int r3, int r4, int r5, int r6, @javax.annotation.Nullable int[] r7, long r8);

    public static native void callPV(int r0, int r1, int r2, int r3, int r4, int r5, int r6, @javax.annotation.Nullable short[] r7, long r8);

    public static native void callPV(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, @javax.annotation.Nullable double[] r8, long r9);

    public static native void callPV(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, @javax.annotation.Nullable float[] r8, long r9);

    public static native void callPV(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, @javax.annotation.Nullable int[] r8, long r9);

    public static native void callPV(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, @javax.annotation.Nullable short[] r8, long r9);

    public static native void callPV(int r0, double r1, double r3, int r5, int r6, double r7, double r9, int r11, int r12, @javax.annotation.Nullable double[] r13, long r14);

    public static native void callPV(int r0, float r1, float r2, int r3, int r4, float r5, float r6, int r7, int r8, @javax.annotation.Nullable float[] r9, long r10);

    public static native void callPV(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, @javax.annotation.Nullable double[] r9, long r10);

    public static native void callPV(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, @javax.annotation.Nullable float[] r9, long r10);

    public static native void callPV(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, @javax.annotation.Nullable int[] r9, long r10);

    public static native void callPV(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, @javax.annotation.Nullable short[] r9, long r10);

    public static native void callPV(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, @javax.annotation.Nullable double[] r10, long r11);

    public static native void callPV(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, @javax.annotation.Nullable float[] r10, long r11);

    public static native void callPV(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, @javax.annotation.Nullable int[] r10, long r11);

    public static native void callPV(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, @javax.annotation.Nullable short[] r10, long r11);

    public static native void callPV(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, @javax.annotation.Nullable double[] r11, long r12);

    public static native void callPV(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, @javax.annotation.Nullable float[] r11, long r12);

    public static native void callPV(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, @javax.annotation.Nullable int[] r11, long r12);

    public static native void callPV(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, @javax.annotation.Nullable short[] r11, long r12);

    public static native void callPPV(long r0, @javax.annotation.Nullable float[] r2, long r3);

    public static native void callPPV(long r0, @javax.annotation.Nullable int[] r2, long r3);

    public static native void callPPV(@javax.annotation.Nullable double[] r0, @javax.annotation.Nullable double[] r1, long r2);

    public static native void callPPV(@javax.annotation.Nullable float[] r0, @javax.annotation.Nullable float[] r1, long r2);

    public static native void callPPV(@javax.annotation.Nullable int[] r0, @javax.annotation.Nullable int[] r1, long r2);

    public static native void callPPV(@javax.annotation.Nullable short[] r0, @javax.annotation.Nullable short[] r1, long r2);

    public static native void callPPV(int r0, long r1, @javax.annotation.Nullable int[] r3, long r4);

    public static native void callPPV(int r0, @javax.annotation.Nullable int[] r1, @javax.annotation.Nullable float[] r2, long r3);

    public static native void callPPV(int r0, @javax.annotation.Nullable int[] r1, @javax.annotation.Nullable int[] r2, long r3);

    public static native void callPPV(int r0, @javax.annotation.Nullable int[] r1, @javax.annotation.Nullable long[] r2, long r3);

    public static native void callPPV(long r0, int r2, @javax.annotation.Nullable float[] r3, long r4);

    public static native void callPPV(long r0, int r2, @javax.annotation.Nullable int[] r3, long r4);

    public static native void callPPV(@javax.annotation.Nullable int[] r0, int r1, @javax.annotation.Nullable int[] r2, long r3);

    public static native void callPPV(int r0, int r1, long r2, @javax.annotation.Nullable int[] r4, long r5);

    public static native void callPPV(int r0, int r1, @javax.annotation.Nullable int[] r2, long r3, long r5);

    public static native void callPPV(int r0, int r1, @javax.annotation.Nullable int[] r2, @javax.annotation.Nullable float[] r3, long r4);

    public static native void callPPV(int r0, int r1, @javax.annotation.Nullable int[] r2, @javax.annotation.Nullable int[] r3, long r4);

    public static native void callPPV(int r0, int r1, @javax.annotation.Nullable int[] r2, @javax.annotation.Nullable long[] r3, long r4);

    public static native void callPPV(int r0, long r1, int r3, @javax.annotation.Nullable int[] r4, long r5);

    public static native void callPPV(int r0, long r1, @javax.annotation.Nullable double[] r3, int r4, long r5);

    public static native void callPPV(int r0, long r1, @javax.annotation.Nullable float[] r3, int r4, long r5);

    public static native void callPPV(int r0, long r1, @javax.annotation.Nullable int[] r3, int r4, long r5);

    public static native void callPPV(int r0, long r1, @javax.annotation.Nullable long[] r3, int r4, long r5);

    public static native void callPPV(int r0, long r1, @javax.annotation.Nullable short[] r3, int r4, long r5);

    public static native void callPPV(int r0, @javax.annotation.Nullable int[] r1, @javax.annotation.Nullable int[] r2, int r3, long r4);

    public static native void callPPV(int r0, @javax.annotation.Nullable long[] r1, @javax.annotation.Nullable int[] r2, int r3, long r4);

    public static native void callPPV(long r0, int r2, int r3, @javax.annotation.Nullable int[] r4, long r5);

    public static native void callPPV(int r0, int r1, int r2, long r3, @javax.annotation.Nullable int[] r5, long r6);

    public static native void callPPV(int r0, int r1, int r2, @javax.annotation.Nullable int[] r3, long r4, long r6);

    public static native void callPPV(int r0, int r1, int r2, @javax.annotation.Nullable int[] r3, @javax.annotation.Nullable int[] r4, long r5);

    public static native void callPPV(int r0, int r1, long r2, @javax.annotation.Nullable int[] r4, int r5, long r6);

    public static native void callPPV(int r0, int r1, @javax.annotation.Nullable int[] r2, int r3, @javax.annotation.Nullable int[] r4, long r5);

    public static native void callPPV(int r0, @javax.annotation.Nullable int[] r1, int r2, long r3, int r5, long r6);

    public static native void callPPV(int r0, @javax.annotation.Nullable int[] r1, int r2, @javax.annotation.Nullable int[] r3, int r4, long r5);

    public static native void callPPV(int r0, @javax.annotation.Nullable int[] r1, long r2, int r4, int r5, long r6);

    public static native void callPPV(long r0, int r2, int r3, int r4, @javax.annotation.Nullable int[] r5, long r6);

    public static native void callPPV(int r0, int r1, int r2, int r3, @javax.annotation.Nullable int[] r4, long r5, long r7);

    public static native void callPPV(int r0, int r1, long r2, int r4, int r5, @javax.annotation.Nullable float[] r6, long r7);

    public static native void callPPV(int r0, int r1, long r2, int r4, int r5, @javax.annotation.Nullable short[] r6, long r7);

    public static native void callPPV(int r0, int r1, @javax.annotation.Nullable int[] r2, long r3, int r5, int r6, long r7);

    public static native void callPPV(int r0, int r1, int r2, long r3, int r5, int r6, @javax.annotation.Nullable float[] r7, long r8);

    public static native void callPPV(int r0, int r1, long r2, int r4, int r5, int r6, @javax.annotation.Nullable float[] r7, long r8);

    public static native void callPPV(int r0, int r1, int r2, int r3, long r4, int r6, int r7, @javax.annotation.Nullable float[] r8, long r9);

    public static native void callPPV(int r0, int r1, int r2, int r3, long r4, int r6, int r7, @javax.annotation.Nullable short[] r8, long r9);

    public static native void callPPV(int r0, int r1, long r2, int r4, int r5, int r6, int r7, @javax.annotation.Nullable float[] r8, long r9);

    public static native void callPPV(int r0, int r1, int r2, long r3, int r5, float r6, float r7, int r8, @javax.annotation.Nullable float[] r9, long r10);

    public static native void callPPV(int r0, int r1, long r2, int r4, int r5, int r6, int r7, int r8, @javax.annotation.Nullable float[] r9, long r10);

    public static native void callPJPV(long r0, long r2, @javax.annotation.Nullable long[] r4, long r5);

    public static native void callPPPV(long r0, long r2, @javax.annotation.Nullable int[] r4, long r5);

    public static native void callPPPV(long r0, @javax.annotation.Nullable int[] r2, long r3, long r5);

    public static native void callPJPV(long r0, long r2, int r4, @javax.annotation.Nullable long[] r5, long r6);

    public static native void callPPPV(int r0, long r1, long r3, @javax.annotation.Nullable double[] r5, long r6);

    public static native void callPPPV(int r0, long r1, long r3, @javax.annotation.Nullable float[] r5, long r6);

    public static native void callPPPV(int r0, long r1, long r3, @javax.annotation.Nullable int[] r5, long r6);

    public static native void callPPPV(int r0, long r1, long r3, @javax.annotation.Nullable long[] r5, long r6);

    public static native void callPPPV(int r0, long r1, long r3, @javax.annotation.Nullable short[] r5, long r6);

    public static native void callPPPV(long r0, int r2, @javax.annotation.Nullable int[] r3, long r4, long r6);

    public static native void callPPPV(long r0, int r2, @javax.annotation.Nullable int[] r3, @javax.annotation.Nullable long[] r4, long r5);

    public static native void callPPPV(long r0, int r2, @javax.annotation.Nullable long[] r3, long r4, long r6);

    public static native void callPPPV(long r0, long r2, int r4, @javax.annotation.Nullable int[] r5, long r6);

    public static native void callPPPV(int r0, int r1, long r2, long r4, @javax.annotation.Nullable double[] r6, long r7);

    public static native void callPPPV(int r0, int r1, long r2, long r4, @javax.annotation.Nullable float[] r6, long r7);

    public static native void callPPPV(int r0, int r1, long r2, long r4, @javax.annotation.Nullable int[] r6, long r7);

    public static native void callPPPV(int r0, int r1, long r2, long r4, @javax.annotation.Nullable short[] r6, long r7);

    public static native void callPPPV(int r0, int r1, @javax.annotation.Nullable int[] r2, long r3, @javax.annotation.Nullable int[] r5, long r6);

    public static native void callPPPV(int r0, int r1, @javax.annotation.Nullable int[] r2, @javax.annotation.Nullable int[] r3, long r4, long r6);

    public static native void callPPPV(int r0, long r1, int r3, @javax.annotation.Nullable int[] r4, long r5, long r7);

    public static native void callPPPV(int r0, long r1, int r3, @javax.annotation.Nullable int[] r4, @javax.annotation.Nullable int[] r5, long r6);

    public static native void callPPPV(int r0, @javax.annotation.Nullable int[] r1, @javax.annotation.Nullable int[] r2, int r3, @javax.annotation.Nullable int[] r4, long r5);

    public static native void callPPPV(long r0, int r2, int r3, @javax.annotation.Nullable int[] r4, @javax.annotation.Nullable int[] r5, long r6);

    public static native void callPPPV(long r0, int r2, int r3, @javax.annotation.Nullable long[] r4, @javax.annotation.Nullable long[] r5, long r6);

    public static native void callPJPV(long r0, long r2, int r4, int r5, int r6, @javax.annotation.Nullable double[] r7, long r8);

    public static native void callPJPV(long r0, long r2, int r4, int r5, int r6, @javax.annotation.Nullable float[] r7, long r8);

    public static native void callPJPV(long r0, long r2, int r4, int r5, int r6, @javax.annotation.Nullable int[] r7, long r8);

    public static native void callPJPV(long r0, long r2, int r4, int r5, int r6, @javax.annotation.Nullable long[] r7, long r8);

    public static native void callPJPV(long r0, long r2, int r4, int r5, int r6, @javax.annotation.Nullable short[] r7, long r8);

    public static native void callPPJV(long r0, int r2, @javax.annotation.Nullable long[] r3, int r4, long r5, int r7, long r8);

    public static native void callPPPV(int r0, int r1, int r2, @javax.annotation.Nullable int[] r3, long r4, long r6, long r8);

    public static native void callPPPV(int r0, int r1, int r2, @javax.annotation.Nullable int[] r3, long r4, @javax.annotation.Nullable int[] r6, long r7);

    public static native void callPPPV(int r0, int r1, @javax.annotation.Nullable int[] r2, int r3, @javax.annotation.Nullable int[] r4, @javax.annotation.Nullable int[] r5, long r6);

    public static native void callPPPV(int r0, @javax.annotation.Nullable int[] r1, int r2, long r3, int r5, @javax.annotation.Nullable int[] r6, long r7);

    public static native void callPPPV(int r0, int r1, long r2, long r4, int r6, int r7, @javax.annotation.Nullable float[] r8, long r9);

    public static native void callPPPV(int r0, int r1, long r2, long r4, int r6, int r7, @javax.annotation.Nullable int[] r8, long r9);

    public static native void callPPPV(int r0, int r1, long r2, long r4, int r6, int r7, @javax.annotation.Nullable short[] r8, long r9);

    public static native void callPPPV(long r0, int r2, long r3, int r5, int r6, int r7, @javax.annotation.Nullable int[] r8, long r9);

    public static native void callPPPV(int r0, int r1, int r2, int r3, @javax.annotation.Nullable int[] r4, int r5, @javax.annotation.Nullable int[] r6, @javax.annotation.Nullable float[] r7, long r8);

    public static native void callPPPV(int r0, int r1, int r2, int r3, @javax.annotation.Nullable int[] r4, int r5, @javax.annotation.Nullable int[] r6, @javax.annotation.Nullable int[] r7, long r8);

    public static native void callPPPV(long r0, int r2, int r3, int r4, int r5, int r6, @javax.annotation.Nullable int[] r7, long r8, long r10);

    public static native void callPJPPV(long r0, long r2, @javax.annotation.Nullable int[] r4, long r5, long r7);

    public static native void callPPPPV(long r0, long r2, @javax.annotation.Nullable int[] r4, long r5, long r7);

    public static native void callPJJPV(long r0, int r2, long r3, long r5, @javax.annotation.Nullable long[] r7, long r8);

    public static native void callPPPPV(long r0, int r2, long r3, @javax.annotation.Nullable int[] r5, long r6, long r8);

    public static native void callPPPPV(@javax.annotation.Nullable long[] r0, @javax.annotation.Nullable int[] r1, @javax.annotation.Nullable int[] r2, @javax.annotation.Nullable int[] r3, int r4, long r5);

    public static native void callPPPPV(int r0, long r1, @javax.annotation.Nullable int[] r3, @javax.annotation.Nullable int[] r4, @javax.annotation.Nullable int[] r5, int r6, long r7);

    public static native void callPPPPV(long r0, int r2, int r3, @javax.annotation.Nullable long[] r4, @javax.annotation.Nullable long[] r5, @javax.annotation.Nullable long[] r6, long r7);

    public static native void callPJPPV(long r0, int r2, long r3, int r5, int r6, @javax.annotation.Nullable int[] r7, @javax.annotation.Nullable long[] r8, long r9);

    public static native void callPPPPV(int r0, int r1, int r2, @javax.annotation.Nullable int[] r3, @javax.annotation.Nullable int[] r4, @javax.annotation.Nullable int[] r5, long r6, long r8);

    public static native void callPPPPV(int r0, int r1, long r2, @javax.annotation.Nullable int[] r4, @javax.annotation.Nullable int[] r5, @javax.annotation.Nullable int[] r6, int r7, long r8);

    public static native void callPJPPV(long r0, int r2, long r3, int r5, int r6, @javax.annotation.Nullable long[] r7, int r8, @javax.annotation.Nullable int[] r9, long r10);

    public static native void callPJJJPV(long r0, long r2, long r4, long r6, @javax.annotation.Nullable double[] r8, long r9);

    public static native void callPJJJPV(long r0, long r2, long r4, long r6, @javax.annotation.Nullable float[] r8, long r9);

    public static native void callPJJJPV(long r0, long r2, long r4, long r6, @javax.annotation.Nullable int[] r8, long r9);

    public static native void callPJJJPV(long r0, long r2, long r4, long r6, @javax.annotation.Nullable long[] r8, long r9);

    public static native void callPJJJPV(long r0, long r2, long r4, long r6, @javax.annotation.Nullable short[] r8, long r9);

    public static native void callPPPPPV(long r0, int r2, long r3, @javax.annotation.Nullable long[] r5, @javax.annotation.Nullable int[] r6, long r7, long r9);

    public static native void callPPPPPV(int r0, int r1, long r2, @javax.annotation.Nullable int[] r4, @javax.annotation.Nullable int[] r5, @javax.annotation.Nullable int[] r6, @javax.annotation.Nullable int[] r7, long r8);

    public static native void callPPPPPV(long r0, int r2, int r3, @javax.annotation.Nullable long[] r4, @javax.annotation.Nullable long[] r5, @javax.annotation.Nullable long[] r6, @javax.annotation.Nullable long[] r7, long r8);

    public static native void callPPPPPV(long r0, int r2, @javax.annotation.Nullable long[] r3, int r4, int r5, int r6, long r7, int r9, long r10, int r12, long r13, long r15);

    public static native void callPPPPPPPV(int r0, int r1, int r2, long r3, int r5, long r6, @javax.annotation.Nullable int[] r8, @javax.annotation.Nullable int[] r9, @javax.annotation.Nullable int[] r10, @javax.annotation.Nullable int[] r11, @javax.annotation.Nullable long[] r12, long r13);

    public static native boolean callPPZ(int r0, @javax.annotation.Nullable int[] r1, long r2, long r4);

    public static native boolean callPPPPZ(int r0, int r1, int r2, float r3, @javax.annotation.Nullable float[] r4, @javax.annotation.Nullable float[] r5, @javax.annotation.Nullable float[] r6, @javax.annotation.Nullable float[] r7, long r8);

    static {
            org.lwjgl.system.Library.initialize()
            return
    }
}
