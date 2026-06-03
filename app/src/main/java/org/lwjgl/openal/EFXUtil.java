package org.lwjgl.openal;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/EFXUtil.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/EFXUtil.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/EFXUtil.class */
public final class EFXUtil {
    private static final int EFFECT = 1111;
    private static final int FILTER = 2222;

    private EFXUtil() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static boolean isEfxSupported() {
            org.lwjgl.openal.ALCdevice r0 = org.lwjgl.openal.AL.alcDevice
            long r0 = r0.device
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.createCapabilities(r0)
            boolean r0 = r0.ALC_EXT_EFX
            return r0
    }

    public static boolean isEffectSupported(int r5) {
            r0 = r5
            switch(r0) {
                case 0: goto L7c;
                case 1: goto L7c;
                case 2: goto L7c;
                case 3: goto L7c;
                case 4: goto L7c;
                case 5: goto L7c;
                case 6: goto L7c;
                case 7: goto L7c;
                case 8: goto L7c;
                case 9: goto L7c;
                case 10: goto L7c;
                case 11: goto L7c;
                case 12: goto L7c;
                case 32768: goto L7c;
                default: goto L7f;
            }
        L7c:
            goto L9a
        L7f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Unknown or invalid effect type: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L9a:
            r0 = 1111(0x457, float:1.557E-42)
            r1 = r5
            boolean r0 = testSupportGeneric(r0, r1)
            return r0
    }

    public static boolean isFilterSupported(int r5) {
            r0 = r5
            switch(r0) {
                case 0: goto L20;
                case 1: goto L20;
                case 2: goto L20;
                case 3: goto L20;
                default: goto L23;
            }
        L20:
            goto L3e
        L23:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Unknown or invalid filter type: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L3e:
            r0 = 2222(0x8ae, float:3.114E-42)
            r1 = r5
            boolean r0 = testSupportGeneric(r0, r1)
            return r0
    }

    private static boolean testSupportGeneric(int r5, int r6) {
            r0 = r5
            switch(r0) {
                case 1111: goto L1c;
                case 2222: goto L1c;
                default: goto L1f;
            }
        L1c:
            goto L3a
        L1f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Invalid objectType: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L3a:
            r0 = 0
            r7 = r0
            boolean r0 = isEfxSupported()
            if (r0 == 0) goto L175
            int r0 = org.lwjgl.openal.AL10.alGetError()
            r0 = 0
            r9 = r0
            r0 = r5
            switch(r0) {
                case 1111: goto L64;
                case 2222: goto L6c;
                default: goto L74;
            }     // Catch: org.lwjgl.openal.OpenALException -> L96
        L64:
            int r0 = org.lwjgl.openal.EXTEfx.alGenEffects()     // Catch: org.lwjgl.openal.OpenALException -> L96
            r9 = r0
            goto L8f
        L6c:
            int r0 = org.lwjgl.openal.EXTEfx.alGenFilters()     // Catch: org.lwjgl.openal.OpenALException -> L96
            r9 = r0
            goto L8f
        L74:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: org.lwjgl.openal.OpenALException -> L96
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: org.lwjgl.openal.OpenALException -> L96
            r3 = r2
            r3.<init>()     // Catch: org.lwjgl.openal.OpenALException -> L96
            java.lang.String r3 = "Invalid objectType: "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: org.lwjgl.openal.OpenALException -> L96
            r3 = r5
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: org.lwjgl.openal.OpenALException -> L96
            java.lang.String r2 = r2.toString()     // Catch: org.lwjgl.openal.OpenALException -> L96
            r1.<init>(r2)     // Catch: org.lwjgl.openal.OpenALException -> L96
            throw r0     // Catch: org.lwjgl.openal.OpenALException -> L96
        L8f:
            int r0 = org.lwjgl.openal.AL10.alGetError()     // Catch: org.lwjgl.openal.OpenALException -> L96
            r8 = r0
            goto Lae
        L96:
            r10 = move-exception
            r0 = r10
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "AL_OUT_OF_MEMORY"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto Lab
            r0 = 40965(0xa005, float:5.7404E-41)
            r8 = r0
            goto Lae
        Lab:
            r0 = 40964(0xa004, float:5.7403E-41)
            r8 = r0
        Lae:
            r0 = r8
            if (r0 != 0) goto L163
            int r0 = org.lwjgl.openal.AL10.alGetError()
            r0 = r5
            switch(r0) {
                case 1111: goto Ld0;
                case 2222: goto Ldb;
                default: goto Le6;
            }     // Catch: org.lwjgl.openal.OpenALException -> L109
        Ld0:
            r0 = r9
            r1 = 32769(0x8001, float:4.5919E-41)
            r2 = r6
            org.lwjgl.openal.EXTEfx.alEffecti(r0, r1, r2)     // Catch: org.lwjgl.openal.OpenALException -> L109
            goto L101
        Ldb:
            r0 = r9
            r1 = 32769(0x8001, float:4.5919E-41)
            r2 = r6
            org.lwjgl.openal.EXTEfx.alFilteri(r0, r1, r2)     // Catch: org.lwjgl.openal.OpenALException -> L109
            goto L101
        Le6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: org.lwjgl.openal.OpenALException -> L109
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: org.lwjgl.openal.OpenALException -> L109
            r3 = r2
            r3.<init>()     // Catch: org.lwjgl.openal.OpenALException -> L109
            java.lang.String r3 = "Invalid objectType: "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: org.lwjgl.openal.OpenALException -> L109
            r3 = r5
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: org.lwjgl.openal.OpenALException -> L109
            java.lang.String r2 = r2.toString()     // Catch: org.lwjgl.openal.OpenALException -> L109
            r1.<init>(r2)     // Catch: org.lwjgl.openal.OpenALException -> L109
            throw r0     // Catch: org.lwjgl.openal.OpenALException -> L109
        L101:
            int r0 = org.lwjgl.openal.AL10.alGetError()     // Catch: org.lwjgl.openal.OpenALException -> L109
            r10 = r0
            goto L10f
        L109:
            r11 = move-exception
            r0 = 40963(0xa003, float:5.7401E-41)
            r10 = r0
        L10f:
            r0 = r10
            if (r0 != 0) goto L116
            r0 = 1
            r7 = r0
        L116:
            r0 = r5
            switch(r0) {
                case 1111: goto L130;
                case 2222: goto L138;
                default: goto L140;
            }     // Catch: org.lwjgl.openal.OpenALException -> L15e
        L130:
            r0 = r9
            org.lwjgl.openal.EXTEfx.alDeleteEffects(r0)     // Catch: org.lwjgl.openal.OpenALException -> L15e
            goto L15b
        L138:
            r0 = r9
            org.lwjgl.openal.EXTEfx.alDeleteFilters(r0)     // Catch: org.lwjgl.openal.OpenALException -> L15e
            goto L15b
        L140:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: org.lwjgl.openal.OpenALException -> L15e
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: org.lwjgl.openal.OpenALException -> L15e
            r3 = r2
            r3.<init>()     // Catch: org.lwjgl.openal.OpenALException -> L15e
            java.lang.String r3 = "Invalid objectType: "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: org.lwjgl.openal.OpenALException -> L15e
            r3 = r5
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: org.lwjgl.openal.OpenALException -> L15e
            java.lang.String r2 = r2.toString()     // Catch: org.lwjgl.openal.OpenALException -> L15e
            r1.<init>(r2)     // Catch: org.lwjgl.openal.OpenALException -> L15e
            throw r0     // Catch: org.lwjgl.openal.OpenALException -> L15e
        L15b:
            goto L160
        L15e:
            r11 = move-exception
        L160:
            goto L175
        L163:
            r0 = r8
            r1 = 40965(0xa005, float:5.7404E-41)
            if (r0 != r1) goto L175
            org.lwjgl.openal.OpenALException r0 = new org.lwjgl.openal.OpenALException
            r1 = r0
            r2 = r8
            java.lang.String r2 = org.lwjgl.openal.AL10.alGetString(r2)
            r1.<init>(r2)
            throw r0
        L175:
            r0 = r7
            return r0
    }
}
