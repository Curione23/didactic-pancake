package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/EglBase14.class */
public interface EglBase14 extends org.webrtc.EglBase {

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/EglBase14$Context.class */
    public interface Context extends org.webrtc.EglBase.Context {
        android.opengl.EGLContext getRawContext();
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/EglBase14$EglConnection.class */
    public interface EglConnection extends org.webrtc.EglBase.EglConnection {
        android.opengl.EGLContext getContext();

        android.opengl.EGLDisplay getDisplay();

        android.opengl.EGLConfig getConfig();
    }
}
