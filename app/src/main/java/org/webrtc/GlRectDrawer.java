package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/GlRectDrawer.class */
public class GlRectDrawer extends org.webrtc.GlGenericDrawer {
    private static final java.lang.String FRAGMENT_SHADER = "void main() {\n  gl_FragColor = sample(tc);\n}\n";

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/GlRectDrawer$ShaderCallbacks.class */
    private static class ShaderCallbacks implements org.webrtc.GlGenericDrawer.ShaderCallbacks {
        private ShaderCallbacks() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // org.webrtc.GlGenericDrawer.ShaderCallbacks
        public void onNewShader(org.webrtc.GlShader r2) {
                r1 = this;
                return
        }

        @Override // org.webrtc.GlGenericDrawer.ShaderCallbacks
        public void onPrepareShader(org.webrtc.GlShader r2, float[] r3, int r4, int r5, int r6, int r7) {
                r1 = this;
                return
        }
    }

    public GlRectDrawer() {
            r5 = this;
            r0 = r5
            java.lang.String r1 = "void main() {\n  gl_FragColor = sample(tc);\n}\n"
            org.webrtc.GlRectDrawer$ShaderCallbacks r2 = new org.webrtc.GlRectDrawer$ShaderCallbacks
            r3 = r2
            r3.<init>()
            r0.<init>(r1, r2)
            return
    }

    @Override // org.webrtc.GlGenericDrawer, org.webrtc.RendererCommon.GlDrawer
    public /* bridge */ /* synthetic */ void release() {
            r2 = this;
            r0 = r2
            super.release()
            return
    }

    @Override // org.webrtc.GlGenericDrawer, org.webrtc.RendererCommon.GlDrawer
    public /* bridge */ /* synthetic */ void drawYuv(int[] r11, float[] r12, int r13, int r14, int r15, int r16, int r17, int r18) {
            r10 = this;
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            super.drawYuv(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    @Override // org.webrtc.GlGenericDrawer, org.webrtc.RendererCommon.GlDrawer
    public /* bridge */ /* synthetic */ void drawRgb(int r11, float[] r12, int r13, int r14, int r15, int r16, int r17, int r18) {
            r10 = this;
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            super.drawRgb(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    @Override // org.webrtc.GlGenericDrawer, org.webrtc.RendererCommon.GlDrawer
    public /* bridge */ /* synthetic */ void drawOes(int r11, float[] r12, int r13, int r14, int r15, int r16, int r17, int r18) {
            r10 = this;
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            super.drawOes(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }
}
