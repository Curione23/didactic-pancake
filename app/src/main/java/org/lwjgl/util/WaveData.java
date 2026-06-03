package org.lwjgl.util;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/WaveData.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/WaveData.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/WaveData.class */
public class WaveData {
    public final java.nio.ByteBuffer data;
    public final int format;
    public final int samplerate;
    static final /* synthetic */ boolean $assertionsDisabled = false;

    private WaveData(java.nio.ByteBuffer r4, int r5, int r6) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.data = r1
            r0 = r3
            r1 = r5
            r0.format = r1
            r0 = r3
            r1 = r6
            r0.samplerate = r1
            return
    }

    public void dispose() {
            r2 = this;
            r0 = r2
            java.nio.ByteBuffer r0 = r0.data
            java.nio.Buffer r0 = r0.clear()
            return
    }

    public static org.lwjgl.util.WaveData create(java.net.URL r3) {
            r0 = r3
            javax.sound.sampled.AudioInputStream r0 = javax.sound.sampled.AudioSystem.getAudioInputStream(r0)     // Catch: java.lang.Exception -> L8
            org.lwjgl.util.WaveData r0 = create(r0)     // Catch: java.lang.Exception -> L8
            return r0
        L8:
            r4 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "Unable to create from: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            java.lang.String r1 = r1.getMessage()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.lwjgl.system.APIUtil.apiLog(r0)
            r0 = 0
            return r0
    }

    public static org.lwjgl.util.WaveData create(java.lang.String r3) {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r0 = r0.getContextClassLoader()
            r1 = r3
            java.net.URL r0 = r0.getResource(r1)
            org.lwjgl.util.WaveData r0 = create(r0)
            return r0
    }

    public static org.lwjgl.util.WaveData create(java.io.InputStream r3) {
            r0 = r3
            javax.sound.sampled.AudioInputStream r0 = javax.sound.sampled.AudioSystem.getAudioInputStream(r0)     // Catch: java.lang.Exception -> L8
            org.lwjgl.util.WaveData r0 = create(r0)     // Catch: java.lang.Exception -> L8
            return r0
        L8:
            r4 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "Unable to create from inputstream, "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            java.lang.String r1 = r1.getMessage()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.lwjgl.system.APIUtil.apiLog(r0)
            r0 = 0
            return r0
    }

    public static org.lwjgl.util.WaveData create(byte[] r6) {
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch: java.lang.Exception -> L16
            r1 = r0
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.lang.Exception -> L16
            r3 = r2
            r4 = r6
            r3.<init>(r4)     // Catch: java.lang.Exception -> L16
            r1.<init>(r2)     // Catch: java.lang.Exception -> L16
            javax.sound.sampled.AudioInputStream r0 = javax.sound.sampled.AudioSystem.getAudioInputStream(r0)     // Catch: java.lang.Exception -> L16
            org.lwjgl.util.WaveData r0 = create(r0)     // Catch: java.lang.Exception -> L16
            return r0
        L16:
            r7 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "Unable to create from byte array, "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r7
            java.lang.String r1 = r1.getMessage()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.lwjgl.system.APIUtil.apiLog(r0)
            r0 = 0
            return r0
    }

    public static org.lwjgl.util.WaveData create(java.nio.ByteBuffer r3) {
            r0 = 0
            r4 = r0
            r0 = r3
            boolean r0 = r0.hasArray()     // Catch: java.lang.Exception -> L23
            if (r0 == 0) goto L11
            r0 = r3
            byte[] r0 = r0.array()     // Catch: java.lang.Exception -> L23
            r4 = r0
            goto L1e
        L11:
            r0 = r3
            int r0 = r0.capacity()     // Catch: java.lang.Exception -> L23
            byte[] r0 = new byte[r0]     // Catch: java.lang.Exception -> L23
            r4 = r0
            r0 = r3
            r1 = r4
            java.nio.ByteBuffer r0 = r0.get(r1)     // Catch: java.lang.Exception -> L23
        L1e:
            r0 = r4
            org.lwjgl.util.WaveData r0 = create(r0)     // Catch: java.lang.Exception -> L23
            return r0
        L23:
            r4 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "Unable to create from ByteBuffer, "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            java.lang.String r1 = r1.getMessage()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.lwjgl.system.APIUtil.apiLog(r0)
            r0 = 0
            return r0
    }

    public static org.lwjgl.util.WaveData create(javax.sound.sampled.AudioInputStream r6) {
            r0 = r6
            javax.sound.sampled.AudioFormat r0 = r0.getFormat()
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = r7
            int r0 = r0.getChannels()
            r1 = 1
            if (r0 != r1) goto L3f
            r0 = r7
            int r0 = r0.getSampleSizeInBits()
            r1 = 8
            if (r0 != r1) goto L1f
            r0 = 4352(0x1100, float:6.098E-42)
            r8 = r0
            goto L87
        L1f:
            r0 = r7
            int r0 = r0.getSampleSizeInBits()
            r1 = 16
            if (r0 != r1) goto L2f
            r0 = 4353(0x1101, float:6.1E-42)
            r8 = r0
            goto L87
        L2f:
            boolean r0 = org.lwjgl.util.WaveData.$assertionsDisabled
            if (r0 != 0) goto L87
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            java.lang.String r2 = "Illegal sample size"
            r1.<init>(r2)
            throw r0
        L3f:
            r0 = r7
            int r0 = r0.getChannels()
            r1 = 2
            if (r0 != r1) goto L77
            r0 = r7
            int r0 = r0.getSampleSizeInBits()
            r1 = 8
            if (r0 != r1) goto L57
            r0 = 4354(0x1102, float:6.101E-42)
            r8 = r0
            goto L87
        L57:
            r0 = r7
            int r0 = r0.getSampleSizeInBits()
            r1 = 16
            if (r0 != r1) goto L67
            r0 = 4355(0x1103, float:6.103E-42)
            r8 = r0
            goto L87
        L67:
            boolean r0 = org.lwjgl.util.WaveData.$assertionsDisabled
            if (r0 != 0) goto L87
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            java.lang.String r2 = "Illegal sample size"
            r1.<init>(r2)
            throw r0
        L77:
            boolean r0 = org.lwjgl.util.WaveData.$assertionsDisabled
            if (r0 != 0) goto L87
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            java.lang.String r2 = "Only mono or stereo is supported"
            r1.<init>(r2)
            throw r0
        L87:
            r0 = 0
            r9 = r0
            r0 = r6
            int r0 = r0.available()     // Catch: java.io.IOException -> L10a
            r10 = r0
            r0 = r10
            if (r0 > 0) goto Lae
            r0 = r6
            javax.sound.sampled.AudioFormat r0 = r0.getFormat()     // Catch: java.io.IOException -> L10a
            int r0 = r0.getChannels()     // Catch: java.io.IOException -> L10a
            r1 = r6
            long r1 = r1.getFrameLength()     // Catch: java.io.IOException -> L10a
            int r1 = (int) r1     // Catch: java.io.IOException -> L10a
            int r0 = r0 * r1
            r1 = r6
            javax.sound.sampled.AudioFormat r1 = r1.getFormat()     // Catch: java.io.IOException -> L10a
            int r1 = r1.getSampleSizeInBits()     // Catch: java.io.IOException -> L10a
            int r0 = r0 * r1
            r1 = 8
            int r0 = r0 / r1
            r10 = r0
        Lae:
            r0 = r6
            int r0 = r0.available()     // Catch: java.io.IOException -> L10a
            byte[] r0 = new byte[r0]     // Catch: java.io.IOException -> L10a
            r11 = r0
            r0 = 0
            r12 = r0
            r0 = 0
            r13 = r0
        Lbc:
            r0 = r6
            r1 = r11
            r2 = r13
            r3 = r11
            int r3 = r3.length     // Catch: java.io.IOException -> L10a
            r4 = r13
            int r3 = r3 - r4
            int r0 = r0.read(r1, r2, r3)     // Catch: java.io.IOException -> L10a
            r1 = r0
            r12 = r1
            r1 = -1
            if (r0 == r1) goto Le3
            r0 = r13
            r1 = r11
            int r1 = r1.length     // Catch: java.io.IOException -> L10a
            if (r0 >= r1) goto Le3
            r0 = r13
            r1 = r12
            int r0 = r0 + r1
            r13 = r0
            goto Lbc
        Le3:
            r0 = r11
            r1 = r7
            int r1 = r1.getSampleSizeInBits()     // Catch: java.io.IOException -> L10a
            r2 = 16
            if (r1 != r2) goto Lf2
            r1 = 1
            goto Lf3
        Lf2:
            r1 = 0
        Lf3:
            r2 = r7
            boolean r2 = r2.isBigEndian()     // Catch: java.io.IOException -> L10a
            if (r2 == 0) goto L100
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN     // Catch: java.io.IOException -> L10a
            goto L103
        L100:
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.io.IOException -> L10a
        L103:
            java.nio.ByteBuffer r0 = convertAudioBytes(r0, r1, r2)     // Catch: java.io.IOException -> L10a
            r9 = r0
            goto L10e
        L10a:
            r10 = move-exception
            r0 = 0
            return r0
        L10e:
            org.lwjgl.util.WaveData r0 = new org.lwjgl.util.WaveData
            r1 = r0
            r2 = r9
            r3 = r8
            r4 = r7
            float r4 = r4.getSampleRate()
            int r4 = (int) r4
            r1.<init>(r2, r3, r4)
            r10 = r0
            r0 = r6
            r0.close()     // Catch: java.io.IOException -> L125
            goto L127
        L125:
            r11 = move-exception
        L127:
            r0 = r10
            return r0
    }

    private static java.nio.ByteBuffer convertAudioBytes(byte[] r3, boolean r4, java.nio.ByteOrder r5) {
            r0 = r3
            int r0 = r0.length
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            r6 = r0
            r0 = r6
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r0 = r0.order(r1)
            r0 = r3
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r7 = r0
            r0 = r7
            r1 = r5
            java.nio.ByteBuffer r0 = r0.order(r1)
            r0 = r4
            if (r0 == 0) goto L45
            r0 = r6
            java.nio.ShortBuffer r0 = r0.asShortBuffer()
            r8 = r0
            r0 = r7
            java.nio.ShortBuffer r0 = r0.asShortBuffer()
            r9 = r0
        L2c:
            r0 = r9
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L42
            r0 = r8
            r1 = r9
            short r1 = r1.get()
            java.nio.ShortBuffer r0 = r0.put(r1)
            goto L2c
        L42:
            goto L5a
        L45:
            r0 = r7
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L5a
            r0 = r6
            r1 = r7
            byte r1 = r1.get()
            java.nio.ByteBuffer r0 = r0.put(r1)
            goto L45
        L5a:
            r0 = r6
            java.nio.Buffer r0 = r0.rewind()
            r0 = r6
            return r0
    }

    static {
            java.lang.Class<org.lwjgl.util.WaveData> r0 = org.lwjgl.util.WaveData.class
            boolean r0 = r0.desiredAssertionStatus()
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            org.lwjgl.util.WaveData.$assertionsDisabled = r0
            return
    }
}
