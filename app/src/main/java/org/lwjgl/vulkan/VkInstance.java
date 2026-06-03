package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkInstance.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkInstance.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkInstance.class */
public class VkInstance extends org.lwjgl.vulkan.DispatchableHandleInstance {
    public VkInstance(long r8, org.lwjgl.vulkan.VkInstanceCreateInfo r10) {
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r8
            r3 = r10
            org.lwjgl.vulkan.VKCapabilitiesInstance r2 = getInstanceCapabilities(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    private static org.lwjgl.vulkan.VKCapabilitiesInstance getInstanceCapabilities(long r8, org.lwjgl.vulkan.VkInstanceCreateInfo r10) {
            r0 = r10
            org.lwjgl.vulkan.VkApplicationInfo r0 = r0.pApplicationInfo()
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L17
            r0 = r11
            int r0 = r0.apiVersion()
            if (r0 == 0) goto L17
            r0 = r11
            int r0 = r0.apiVersion()
            goto L1a
        L17:
            int r0 = org.lwjgl.vulkan.VK10.VK_API_VERSION_1_0
        L1a:
            r12 = r0
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = new org.lwjgl.vulkan.VKCapabilitiesInstance
            r1 = r0
            r2 = r8
            org.lwjgl.vulkan.VKCapabilitiesInstance r2 = (v1) -> { // org.lwjgl.system.FunctionProvider.getFunctionAddress(java.nio.ByteBuffer):long
                return lambda$getInstanceCapabilities$0(r2, v1);
            }
            r3 = r12
            r4 = r12
            r5 = r10
            org.lwjgl.PointerBuffer r5 = r5.ppEnabledExtensionNames()
            java.util.Set r4 = org.lwjgl.vulkan.VK.getEnabledExtensionSet(r4, r5)
            r5 = r8
            java.util.Set r5 = getAvailableDeviceExtensions(r5)
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    private static java.util.Set<java.lang.String> getAvailableDeviceExtensions(long r11) {
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r1.<init>()
            r13 = r0
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackPush()
            r14 = r0
            r0 = 0
            r15 = r0
            r0 = r14
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L228 java.lang.Throwable -> L231
            r16 = r0
            org.lwjgl.vulkan.VK$GlobalCommands r0 = org.lwjgl.vulkan.VK.getGlobalCommands()     // Catch: java.lang.Throwable -> L228 java.lang.Throwable -> L231
            long r0 = r0.vkGetInstanceProcAddr     // Catch: java.lang.Throwable -> L228 java.lang.Throwable -> L231
            r17 = r0
            r0 = r11
            r1 = r14
            java.lang.String r2 = "vkEnumeratePhysicalDevices"
            java.nio.ByteBuffer r1 = r1.ASCII(r2)     // Catch: java.lang.Throwable -> L228 java.lang.Throwable -> L231
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L228 java.lang.Throwable -> L231
            r2 = r17
            long r0 = org.lwjgl.system.JNI.callPPP(r0, r1, r2)     // Catch: java.lang.Throwable -> L228 java.lang.Throwable -> L231
            r19 = r0
            r0 = r11
            r1 = r14
            java.lang.String r2 = "vkEnumerateDeviceExtensionProperties"
            java.nio.ByteBuffer r1 = r1.ASCII(r2)     // Catch: java.lang.Throwable -> L228 java.lang.Throwable -> L231
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L228 java.lang.Throwable -> L231
            r2 = r17
            long r0 = org.lwjgl.system.JNI.callPPP(r0, r1, r2)     // Catch: java.lang.Throwable -> L228 java.lang.Throwable -> L231
            r21 = r0
            r0 = r19
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L4e
            r0 = r21
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L71
        L4e:
            r0 = r14
            if (r0 == 0) goto L256
            r0 = r15
            if (r0 == 0) goto L6a
            r0 = r14
            r0.close()     // Catch: java.lang.Throwable -> L5e
            goto L256
        L5e:
            r23 = move-exception
            r0 = r15
            r1 = r23
            r0.addSuppressed(r1)
            goto L256
        L6a:
            r0 = r14
            r0.close()
            goto L256
        L71:
            r0 = r11
            r1 = r16
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L228 java.lang.Throwable -> L231
            r2 = 0
            r3 = r19
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L228 java.lang.Throwable -> L231
            r23 = r0
            r0 = r23
            if (r0 != 0) goto L8d
            r0 = r16
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L228 java.lang.Throwable -> L231
            if (r0 != 0) goto Lb0
        L8d:
            r0 = r14
            if (r0 == 0) goto L256
            r0 = r15
            if (r0 == 0) goto La9
            r0 = r14
            r0.close()     // Catch: java.lang.Throwable -> L9d
            goto L256
        L9d:
            r24 = move-exception
            r0 = r15
            r1 = r24
            r0.addSuppressed(r1)
            goto L256
        La9:
            r0 = r14
            r0.close()
            goto L256
        Lb0:
            r0 = r14
            r1 = r16
            r2 = 0
            int r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L228 java.lang.Throwable -> L231
            org.lwjgl.PointerBuffer r0 = r0.mallocPointer(r1)     // Catch: java.lang.Throwable -> L228 java.lang.Throwable -> L231
            r24 = r0
            r0 = r11
            r1 = r16
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L228 java.lang.Throwable -> L231
            r2 = r24
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L228 java.lang.Throwable -> L231
            r3 = r19
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L228 java.lang.Throwable -> L231
            r23 = r0
            r0 = r23
            if (r0 == 0) goto Lf6
            r0 = r14
            if (r0 == 0) goto L256
            r0 = r15
            if (r0 == 0) goto Lef
            r0 = r14
            r0.close()     // Catch: java.lang.Throwable -> Le3
            goto L256
        Le3:
            r25 = move-exception
            r0 = r15
            r1 = r25
            r0.addSuppressed(r1)
            goto L256
        Lef:
            r0 = r14
            r0.close()
            goto L256
        Lf6:
            r0 = 0
            r25 = r0
        Lf9:
            r0 = r25
            r1 = r24
            int r1 = r1.remaining()     // Catch: java.lang.Throwable -> L228 java.lang.Throwable -> L231
            if (r0 >= r1) goto L205
            r0 = r24
            r1 = r25
            long r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L228 java.lang.Throwable -> L231
            r1 = 0
            r2 = r16
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L228 java.lang.Throwable -> L231
            r3 = 0
            r4 = r21
            int r0 = org.lwjgl.system.JNI.callPPPPI(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L228 java.lang.Throwable -> L231
            r23 = r0
            r0 = r23
            if (r0 != 0) goto L1ff
            r0 = r16
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L228 java.lang.Throwable -> L231
            if (r0 != 0) goto L129
            goto L1ff
        L129:
            r0 = r14
            org.lwjgl.system.MemoryStack r0 = r0.push()     // Catch: java.lang.Throwable -> L228 java.lang.Throwable -> L231
            r26 = r0
            r0 = 0
            r27 = r0
            r0 = r16
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L1ce java.lang.Throwable -> L1d7 java.lang.Throwable -> L228 java.lang.Throwable -> L231
            r1 = r26
            org.lwjgl.vulkan.VkExtensionProperties$Buffer r0 = org.lwjgl.vulkan.VkExtensionProperties.malloc(r0, r1)     // Catch: java.lang.Throwable -> L1ce java.lang.Throwable -> L1d7 java.lang.Throwable -> L228 java.lang.Throwable -> L231
            r28 = r0
            r0 = r24
            r1 = r25
            long r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L1ce java.lang.Throwable -> L1d7 java.lang.Throwable -> L228 java.lang.Throwable -> L231
            r1 = 0
            r2 = r16
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L1ce java.lang.Throwable -> L1d7 java.lang.Throwable -> L228 java.lang.Throwable -> L231
            r3 = r28
            long r3 = r3.address()     // Catch: java.lang.Throwable -> L1ce java.lang.Throwable -> L1d7 java.lang.Throwable -> L228 java.lang.Throwable -> L231
            r4 = r21
            int r0 = org.lwjgl.system.JNI.callPPPPI(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L1ce java.lang.Throwable -> L1d7 java.lang.Throwable -> L228 java.lang.Throwable -> L231
            r23 = r0
            r0 = r23
            if (r0 == 0) goto L183
            r0 = r26
            if (r0 == 0) goto L1ff
            r0 = r27
            if (r0 == 0) goto L17b
            r0 = r26
            r0.close()     // Catch: java.lang.Throwable -> L16f java.lang.Throwable -> L228 java.lang.Throwable -> L231
            goto L1ff
        L16f:
            r29 = move-exception
            r0 = r27
            r1 = r29
            r0.addSuppressed(r1)     // Catch: java.lang.Throwable -> L228 java.lang.Throwable -> L231
            goto L1ff
        L17b:
            r0 = r26
            r0.close()     // Catch: java.lang.Throwable -> L228 java.lang.Throwable -> L231
            goto L1ff
        L183:
            r0 = 0
            r29 = r0
        L186:
            r0 = r29
            r1 = r28
            int r1 = r1.remaining()     // Catch: java.lang.Throwable -> L1ce java.lang.Throwable -> L1d7 java.lang.Throwable -> L228 java.lang.Throwable -> L231
            if (r0 >= r1) goto L1a8
            r0 = r13
            r1 = r28
            r2 = r29
            org.lwjgl.system.Struct r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L1ce java.lang.Throwable -> L1d7 java.lang.Throwable -> L228 java.lang.Throwable -> L231
            org.lwjgl.vulkan.VkExtensionProperties r1 = (org.lwjgl.vulkan.VkExtensionProperties) r1     // Catch: java.lang.Throwable -> L1ce java.lang.Throwable -> L1d7 java.lang.Throwable -> L228 java.lang.Throwable -> L231
            java.lang.String r1 = r1.extensionNameString()     // Catch: java.lang.Throwable -> L1ce java.lang.Throwable -> L1d7 java.lang.Throwable -> L228 java.lang.Throwable -> L231
            boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> L1ce java.lang.Throwable -> L1d7 java.lang.Throwable -> L228 java.lang.Throwable -> L231
            int r29 = r29 + 1
            goto L186
        L1a8:
            r0 = r26
            if (r0 == 0) goto L1ff
            r0 = r27
            if (r0 == 0) goto L1c6
            r0 = r26
            r0.close()     // Catch: java.lang.Throwable -> L1ba java.lang.Throwable -> L228 java.lang.Throwable -> L231
            goto L1ff
        L1ba:
            r28 = move-exception
            r0 = r27
            r1 = r28
            r0.addSuppressed(r1)     // Catch: java.lang.Throwable -> L228 java.lang.Throwable -> L231
            goto L1ff
        L1c6:
            r0 = r26
            r0.close()     // Catch: java.lang.Throwable -> L228 java.lang.Throwable -> L231
            goto L1ff
        L1ce:
            r28 = move-exception
            r0 = r28
            r27 = r0
            r0 = r28
            throw r0     // Catch: java.lang.Throwable -> L1d7 java.lang.Throwable -> L228 java.lang.Throwable -> L231
        L1d7:
            r30 = move-exception
            r0 = r26
            if (r0 == 0) goto L1fc
            r0 = r27
            if (r0 == 0) goto L1f7
            r0 = r26
            r0.close()     // Catch: java.lang.Throwable -> L1eb java.lang.Throwable -> L228 java.lang.Throwable -> L231
            goto L1fc
        L1eb:
            r31 = move-exception
            r0 = r27
            r1 = r31
            r0.addSuppressed(r1)     // Catch: java.lang.Throwable -> L228 java.lang.Throwable -> L231
            goto L1fc
        L1f7:
            r0 = r26
            r0.close()     // Catch: java.lang.Throwable -> L228 java.lang.Throwable -> L231
        L1fc:
            r0 = r30
            throw r0     // Catch: java.lang.Throwable -> L228 java.lang.Throwable -> L231
        L1ff:
            int r25 = r25 + 1
            goto Lf9
        L205:
            r0 = r14
            if (r0 == 0) goto L256
            r0 = r15
            if (r0 == 0) goto L221
            r0 = r14
            r0.close()     // Catch: java.lang.Throwable -> L215
            goto L256
        L215:
            r16 = move-exception
            r0 = r15
            r1 = r16
            r0.addSuppressed(r1)
            goto L256
        L221:
            r0 = r14
            r0.close()
            goto L256
        L228:
            r16 = move-exception
            r0 = r16
            r15 = r0
            r0 = r16
            throw r0     // Catch: java.lang.Throwable -> L231
        L231:
            r32 = move-exception
            r0 = r14
            if (r0 == 0) goto L253
            r0 = r15
            if (r0 == 0) goto L24f
            r0 = r14
            r0.close()     // Catch: java.lang.Throwable -> L243
            goto L253
        L243:
            r33 = move-exception
            r0 = r15
            r1 = r33
            r0.addSuppressed(r1)
            goto L253
        L24f:
            r0 = r14
            r0.close()
        L253:
            r0 = r32
            throw r0
        L256:
            r0 = r13
            return r0
    }

    @Override // org.lwjgl.vulkan.DispatchableHandleInstance
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VKCapabilitiesInstance getCapabilities() {
            r2 = this;
            r0 = r2
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = super.getCapabilities()
            return r0
    }

    private static /* synthetic */ long lambda$getInstanceCapabilities$0(long r7, java.nio.ByteBuffer r9) {
            r0 = r7
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.vulkan.VK$GlobalCommands r2 = org.lwjgl.vulkan.VK.getGlobalCommands()
            long r2 = r2.vkGetInstanceProcAddr
            long r0 = org.lwjgl.system.JNI.callPPP(r0, r1, r2)
            r10 = r0
            r0 = r10
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L21
            boolean r0 = org.lwjgl.system.Checks.DEBUG_FUNCTIONS
            if (r0 == 0) goto L21
            java.lang.String r0 = "VK instance"
            r1 = r9
            org.lwjgl.system.APIUtil.apiLogMissing(r0, r1)
        L21:
            r0 = r10
            return r0
    }
}
