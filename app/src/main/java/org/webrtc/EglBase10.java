package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/EglBase10.class */
public interface EglBase10 extends org.webrtc.EglBase {

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/EglBase10$Context.class */
    public interface Context extends org.webrtc.EglBase.Context {
        javax.microedition.khronos.egl.EGLContext getRawContext();
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/EglBase10$EglConnection.class */
    public interface EglConnection extends org.webrtc.EglBase.EglConnection {
        javax.microedition.khronos.egl.EGL10 getEgl();

        javax.microedition.khronos.egl.EGLContext getContext();

        javax.microedition.khronos.egl.EGLDisplay getDisplay();

        javax.microedition.khronos.egl.EGLConfig getConfig();
    }
}
