package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VKCapabilitiesDevice.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VKCapabilitiesDevice.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VKCapabilitiesDevice.class */
public class VKCapabilitiesDevice {
    public final long vkGetDeviceProcAddr;
    public final long vkDestroyDevice;
    public final long vkGetDeviceQueue;
    public final long vkQueueSubmit;
    public final long vkQueueWaitIdle;
    public final long vkDeviceWaitIdle;
    public final long vkAllocateMemory;
    public final long vkFreeMemory;
    public final long vkMapMemory;
    public final long vkUnmapMemory;
    public final long vkFlushMappedMemoryRanges;
    public final long vkInvalidateMappedMemoryRanges;
    public final long vkGetDeviceMemoryCommitment;
    public final long vkBindBufferMemory;
    public final long vkBindImageMemory;
    public final long vkGetBufferMemoryRequirements;
    public final long vkGetImageMemoryRequirements;
    public final long vkGetImageSparseMemoryRequirements;
    public final long vkQueueBindSparse;
    public final long vkCreateFence;
    public final long vkDestroyFence;
    public final long vkResetFences;
    public final long vkGetFenceStatus;
    public final long vkWaitForFences;
    public final long vkCreateSemaphore;
    public final long vkDestroySemaphore;
    public final long vkCreateEvent;
    public final long vkDestroyEvent;
    public final long vkGetEventStatus;
    public final long vkSetEvent;
    public final long vkResetEvent;
    public final long vkCreateQueryPool;
    public final long vkDestroyQueryPool;
    public final long vkGetQueryPoolResults;
    public final long vkCreateBuffer;
    public final long vkDestroyBuffer;
    public final long vkCreateBufferView;
    public final long vkDestroyBufferView;
    public final long vkCreateImage;
    public final long vkDestroyImage;
    public final long vkGetImageSubresourceLayout;
    public final long vkCreateImageView;
    public final long vkDestroyImageView;
    public final long vkCreateShaderModule;
    public final long vkDestroyShaderModule;
    public final long vkCreatePipelineCache;
    public final long vkDestroyPipelineCache;
    public final long vkGetPipelineCacheData;
    public final long vkMergePipelineCaches;
    public final long vkCreateGraphicsPipelines;
    public final long vkCreateComputePipelines;
    public final long vkDestroyPipeline;
    public final long vkCreatePipelineLayout;
    public final long vkDestroyPipelineLayout;
    public final long vkCreateSampler;
    public final long vkDestroySampler;
    public final long vkCreateDescriptorSetLayout;
    public final long vkDestroyDescriptorSetLayout;
    public final long vkCreateDescriptorPool;
    public final long vkDestroyDescriptorPool;
    public final long vkResetDescriptorPool;
    public final long vkAllocateDescriptorSets;
    public final long vkFreeDescriptorSets;
    public final long vkUpdateDescriptorSets;
    public final long vkCreateFramebuffer;
    public final long vkDestroyFramebuffer;
    public final long vkCreateRenderPass;
    public final long vkDestroyRenderPass;
    public final long vkGetRenderAreaGranularity;
    public final long vkCreateCommandPool;
    public final long vkDestroyCommandPool;
    public final long vkResetCommandPool;
    public final long vkAllocateCommandBuffers;
    public final long vkFreeCommandBuffers;
    public final long vkBeginCommandBuffer;
    public final long vkEndCommandBuffer;
    public final long vkResetCommandBuffer;
    public final long vkCmdBindPipeline;
    public final long vkCmdSetViewport;
    public final long vkCmdSetScissor;
    public final long vkCmdSetLineWidth;
    public final long vkCmdSetDepthBias;
    public final long vkCmdSetBlendConstants;
    public final long vkCmdSetDepthBounds;
    public final long vkCmdSetStencilCompareMask;
    public final long vkCmdSetStencilWriteMask;
    public final long vkCmdSetStencilReference;
    public final long vkCmdBindDescriptorSets;
    public final long vkCmdBindIndexBuffer;
    public final long vkCmdBindVertexBuffers;
    public final long vkCmdDraw;
    public final long vkCmdDrawIndexed;
    public final long vkCmdDrawIndirect;
    public final long vkCmdDrawIndexedIndirect;
    public final long vkCmdDispatch;
    public final long vkCmdDispatchIndirect;
    public final long vkCmdCopyBuffer;
    public final long vkCmdCopyImage;
    public final long vkCmdBlitImage;
    public final long vkCmdCopyBufferToImage;
    public final long vkCmdCopyImageToBuffer;
    public final long vkCmdUpdateBuffer;
    public final long vkCmdFillBuffer;
    public final long vkCmdClearColorImage;
    public final long vkCmdClearDepthStencilImage;
    public final long vkCmdClearAttachments;
    public final long vkCmdResolveImage;
    public final long vkCmdSetEvent;
    public final long vkCmdResetEvent;
    public final long vkCmdWaitEvents;
    public final long vkCmdPipelineBarrier;
    public final long vkCmdBeginQuery;
    public final long vkCmdEndQuery;
    public final long vkCmdResetQueryPool;
    public final long vkCmdWriteTimestamp;
    public final long vkCmdCopyQueryPoolResults;
    public final long vkCmdPushConstants;
    public final long vkCmdBeginRenderPass;
    public final long vkCmdNextSubpass;
    public final long vkCmdEndRenderPass;
    public final long vkCmdExecuteCommands;
    public final long vkBindBufferMemory2;
    public final long vkBindImageMemory2;
    public final long vkGetDeviceGroupPeerMemoryFeatures;
    public final long vkCmdSetDeviceMask;
    public final long vkCmdDispatchBase;
    public final long vkGetImageMemoryRequirements2;
    public final long vkGetBufferMemoryRequirements2;
    public final long vkGetImageSparseMemoryRequirements2;
    public final long vkTrimCommandPool;
    public final long vkGetDeviceQueue2;
    public final long vkCreateSamplerYcbcrConversion;
    public final long vkDestroySamplerYcbcrConversion;
    public final long vkCreateDescriptorUpdateTemplate;
    public final long vkDestroyDescriptorUpdateTemplate;
    public final long vkUpdateDescriptorSetWithTemplate;
    public final long vkGetDescriptorSetLayoutSupport;
    public final long vkCmdDrawIndirectCount;
    public final long vkCmdDrawIndexedIndirectCount;
    public final long vkCreateRenderPass2;
    public final long vkCmdBeginRenderPass2;
    public final long vkCmdNextSubpass2;
    public final long vkCmdEndRenderPass2;
    public final long vkResetQueryPool;
    public final long vkGetSemaphoreCounterValue;
    public final long vkWaitSemaphores;
    public final long vkSignalSemaphore;
    public final long vkGetBufferDeviceAddress;
    public final long vkGetBufferOpaqueCaptureAddress;
    public final long vkGetDeviceMemoryOpaqueCaptureAddress;
    public final long vkCreatePrivateDataSlot;
    public final long vkDestroyPrivateDataSlot;
    public final long vkSetPrivateData;
    public final long vkGetPrivateData;
    public final long vkCmdSetEvent2;
    public final long vkCmdResetEvent2;
    public final long vkCmdWaitEvents2;
    public final long vkCmdPipelineBarrier2;
    public final long vkCmdWriteTimestamp2;
    public final long vkQueueSubmit2;
    public final long vkCmdCopyBuffer2;
    public final long vkCmdCopyImage2;
    public final long vkCmdCopyBufferToImage2;
    public final long vkCmdCopyImageToBuffer2;
    public final long vkCmdBlitImage2;
    public final long vkCmdResolveImage2;
    public final long vkCmdBeginRendering;
    public final long vkCmdEndRendering;
    public final long vkCmdSetCullMode;
    public final long vkCmdSetFrontFace;
    public final long vkCmdSetPrimitiveTopology;
    public final long vkCmdSetViewportWithCount;
    public final long vkCmdSetScissorWithCount;
    public final long vkCmdBindVertexBuffers2;
    public final long vkCmdSetDepthTestEnable;
    public final long vkCmdSetDepthWriteEnable;
    public final long vkCmdSetDepthCompareOp;
    public final long vkCmdSetDepthBoundsTestEnable;
    public final long vkCmdSetStencilTestEnable;
    public final long vkCmdSetStencilOp;
    public final long vkCmdSetRasterizerDiscardEnable;
    public final long vkCmdSetDepthBiasEnable;
    public final long vkCmdSetPrimitiveRestartEnable;
    public final long vkGetDeviceBufferMemoryRequirements;
    public final long vkGetDeviceImageMemoryRequirements;
    public final long vkGetDeviceImageSparseMemoryRequirements;
    public final long vkCmdWriteBufferMarkerAMD;
    public final long vkSetLocalDimmingAMD;
    public final long vkCmdDrawIndirectCountAMD;
    public final long vkCmdDrawIndexedIndirectCountAMD;
    public final long vkGetShaderInfoAMD;
    public final long vkCreateExecutionGraphPipelinesAMDX;
    public final long vkGetExecutionGraphPipelineScratchSizeAMDX;
    public final long vkGetExecutionGraphPipelineNodeIndexAMDX;
    public final long vkCmdInitializeGraphScratchMemoryAMDX;
    public final long vkCmdDispatchGraphAMDX;
    public final long vkCmdDispatchGraphIndirectAMDX;
    public final long vkCmdDispatchGraphIndirectCountAMDX;
    public final long vkGetAndroidHardwareBufferPropertiesANDROID;
    public final long vkGetMemoryAndroidHardwareBufferANDROID;
    public final long vkCmdSetAttachmentFeedbackLoopEnableEXT;
    public final long vkGetBufferDeviceAddressEXT;
    public final long vkGetCalibratedTimestampsEXT;
    public final long vkCmdSetColorWriteEnableEXT;
    public final long vkCmdBeginConditionalRenderingEXT;
    public final long vkCmdEndConditionalRenderingEXT;
    public final long vkDebugMarkerSetObjectTagEXT;
    public final long vkDebugMarkerSetObjectNameEXT;
    public final long vkCmdDebugMarkerBeginEXT;
    public final long vkCmdDebugMarkerEndEXT;
    public final long vkCmdDebugMarkerInsertEXT;
    public final long vkCmdSetDepthBias2EXT;
    public final long vkGetDescriptorSetLayoutSizeEXT;
    public final long vkGetDescriptorSetLayoutBindingOffsetEXT;
    public final long vkGetDescriptorEXT;
    public final long vkCmdBindDescriptorBuffersEXT;
    public final long vkCmdSetDescriptorBufferOffsetsEXT;
    public final long vkCmdBindDescriptorBufferEmbeddedSamplersEXT;
    public final long vkGetBufferOpaqueCaptureDescriptorDataEXT;
    public final long vkGetImageOpaqueCaptureDescriptorDataEXT;
    public final long vkGetImageViewOpaqueCaptureDescriptorDataEXT;
    public final long vkGetSamplerOpaqueCaptureDescriptorDataEXT;
    public final long vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT;
    public final long vkGetDeviceFaultInfoEXT;
    public final long vkCmdSetDiscardRectangleEXT;
    public final long vkCmdSetDiscardRectangleEnableEXT;
    public final long vkCmdSetDiscardRectangleModeEXT;
    public final long vkDisplayPowerControlEXT;
    public final long vkRegisterDeviceEventEXT;
    public final long vkRegisterDisplayEventEXT;
    public final long vkGetSwapchainCounterEXT;
    public final long vkCmdSetCullModeEXT;
    public final long vkCmdSetFrontFaceEXT;
    public final long vkCmdSetPrimitiveTopologyEXT;
    public final long vkCmdSetViewportWithCountEXT;
    public final long vkCmdSetScissorWithCountEXT;
    public final long vkCmdBindVertexBuffers2EXT;
    public final long vkCmdSetDepthTestEnableEXT;
    public final long vkCmdSetDepthWriteEnableEXT;
    public final long vkCmdSetDepthCompareOpEXT;
    public final long vkCmdSetDepthBoundsTestEnableEXT;
    public final long vkCmdSetStencilTestEnableEXT;
    public final long vkCmdSetStencilOpEXT;
    public final long vkCmdSetPatchControlPointsEXT;
    public final long vkCmdSetRasterizerDiscardEnableEXT;
    public final long vkCmdSetDepthBiasEnableEXT;
    public final long vkCmdSetLogicOpEXT;
    public final long vkCmdSetPrimitiveRestartEnableEXT;
    public final long vkCmdSetTessellationDomainOriginEXT;
    public final long vkCmdSetDepthClampEnableEXT;
    public final long vkCmdSetPolygonModeEXT;
    public final long vkCmdSetRasterizationSamplesEXT;
    public final long vkCmdSetSampleMaskEXT;
    public final long vkCmdSetAlphaToCoverageEnableEXT;
    public final long vkCmdSetAlphaToOneEnableEXT;
    public final long vkCmdSetLogicOpEnableEXT;
    public final long vkCmdSetColorBlendEnableEXT;
    public final long vkCmdSetColorBlendEquationEXT;
    public final long vkCmdSetColorWriteMaskEXT;
    public final long vkCmdSetRasterizationStreamEXT;
    public final long vkCmdSetConservativeRasterizationModeEXT;
    public final long vkCmdSetExtraPrimitiveOverestimationSizeEXT;
    public final long vkCmdSetDepthClipEnableEXT;
    public final long vkCmdSetSampleLocationsEnableEXT;
    public final long vkCmdSetColorBlendAdvancedEXT;
    public final long vkCmdSetProvokingVertexModeEXT;
    public final long vkCmdSetLineRasterizationModeEXT;
    public final long vkCmdSetLineStippleEnableEXT;
    public final long vkCmdSetDepthClipNegativeOneToOneEXT;
    public final long vkCmdSetViewportWScalingEnableNV;
    public final long vkCmdSetViewportSwizzleNV;
    public final long vkCmdSetCoverageToColorEnableNV;
    public final long vkCmdSetCoverageToColorLocationNV;
    public final long vkCmdSetCoverageModulationModeNV;
    public final long vkCmdSetCoverageModulationTableEnableNV;
    public final long vkCmdSetCoverageModulationTableNV;
    public final long vkCmdSetShadingRateImageEnableNV;
    public final long vkCmdSetRepresentativeFragmentTestEnableNV;
    public final long vkCmdSetCoverageReductionModeNV;
    public final long vkGetMemoryHostPointerPropertiesEXT;
    public final long vkAcquireFullScreenExclusiveModeEXT;
    public final long vkReleaseFullScreenExclusiveModeEXT;
    public final long vkGetDeviceGroupSurfacePresentModes2EXT;
    public final long vkSetHdrMetadataEXT;
    public final long vkCopyMemoryToImageEXT;
    public final long vkCopyImageToMemoryEXT;
    public final long vkCopyImageToImageEXT;
    public final long vkTransitionImageLayoutEXT;
    public final long vkGetImageSubresourceLayout2EXT;
    public final long vkResetQueryPoolEXT;
    public final long vkGetImageDrmFormatModifierPropertiesEXT;
    public final long vkCmdSetLineStippleEXT;
    public final long vkCmdDrawMeshTasksEXT;
    public final long vkCmdDrawMeshTasksIndirectEXT;
    public final long vkCmdDrawMeshTasksIndirectCountEXT;
    public final long vkExportMetalObjectsEXT;
    public final long vkCmdDrawMultiEXT;
    public final long vkCmdDrawMultiIndexedEXT;
    public final long vkCreateMicromapEXT;
    public final long vkDestroyMicromapEXT;
    public final long vkCmdBuildMicromapsEXT;
    public final long vkBuildMicromapsEXT;
    public final long vkCopyMicromapEXT;
    public final long vkCopyMicromapToMemoryEXT;
    public final long vkCopyMemoryToMicromapEXT;
    public final long vkWriteMicromapsPropertiesEXT;
    public final long vkCmdCopyMicromapEXT;
    public final long vkCmdCopyMicromapToMemoryEXT;
    public final long vkCmdCopyMemoryToMicromapEXT;
    public final long vkCmdWriteMicromapsPropertiesEXT;
    public final long vkGetDeviceMicromapCompatibilityEXT;
    public final long vkGetMicromapBuildSizesEXT;
    public final long vkSetDeviceMemoryPriorityEXT;
    public final long vkGetPipelinePropertiesEXT;
    public final long vkCreatePrivateDataSlotEXT;
    public final long vkDestroyPrivateDataSlotEXT;
    public final long vkSetPrivateDataEXT;
    public final long vkGetPrivateDataEXT;
    public final long vkCmdSetSampleLocationsEXT;
    public final long vkGetShaderModuleIdentifierEXT;
    public final long vkGetShaderModuleCreateInfoIdentifierEXT;
    public final long vkCreateShadersEXT;
    public final long vkDestroyShaderEXT;
    public final long vkGetShaderBinaryDataEXT;
    public final long vkCmdBindShadersEXT;
    public final long vkCmdSetVertexInputEXT;
    public final long vkReleaseSwapchainImagesEXT;
    public final long vkCmdBindTransformFeedbackBuffersEXT;
    public final long vkCmdBeginTransformFeedbackEXT;
    public final long vkCmdEndTransformFeedbackEXT;
    public final long vkCmdBeginQueryIndexedEXT;
    public final long vkCmdEndQueryIndexedEXT;
    public final long vkCmdDrawIndirectByteCountEXT;
    public final long vkCreateValidationCacheEXT;
    public final long vkDestroyValidationCacheEXT;
    public final long vkMergeValidationCachesEXT;
    public final long vkGetValidationCacheDataEXT;
    public final long vkGetRefreshCycleDurationGOOGLE;
    public final long vkGetPastPresentationTimingGOOGLE;
    public final long vkCmdDrawClusterHUAWEI;
    public final long vkCmdDrawClusterIndirectHUAWEI;
    public final long vkCmdBindInvocationMaskHUAWEI;
    public final long vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI;
    public final long vkCmdSubpassShadingHUAWEI;
    public final long vkInitializePerformanceApiINTEL;
    public final long vkUninitializePerformanceApiINTEL;
    public final long vkCmdSetPerformanceMarkerINTEL;
    public final long vkCmdSetPerformanceStreamMarkerINTEL;
    public final long vkCmdSetPerformanceOverrideINTEL;
    public final long vkAcquirePerformanceConfigurationINTEL;
    public final long vkReleasePerformanceConfigurationINTEL;
    public final long vkQueueSetPerformanceConfigurationINTEL;
    public final long vkGetPerformanceParameterINTEL;
    public final long vkCreateAccelerationStructureKHR;
    public final long vkDestroyAccelerationStructureKHR;
    public final long vkCmdBuildAccelerationStructuresKHR;
    public final long vkCmdBuildAccelerationStructuresIndirectKHR;
    public final long vkBuildAccelerationStructuresKHR;
    public final long vkCopyAccelerationStructureKHR;
    public final long vkCopyAccelerationStructureToMemoryKHR;
    public final long vkCopyMemoryToAccelerationStructureKHR;
    public final long vkWriteAccelerationStructuresPropertiesKHR;
    public final long vkCmdCopyAccelerationStructureKHR;
    public final long vkCmdCopyAccelerationStructureToMemoryKHR;
    public final long vkCmdCopyMemoryToAccelerationStructureKHR;
    public final long vkGetAccelerationStructureDeviceAddressKHR;
    public final long vkCmdWriteAccelerationStructuresPropertiesKHR;
    public final long vkGetDeviceAccelerationStructureCompatibilityKHR;
    public final long vkGetAccelerationStructureBuildSizesKHR;
    public final long vkBindBufferMemory2KHR;
    public final long vkBindImageMemory2KHR;
    public final long vkGetBufferDeviceAddressKHR;
    public final long vkGetBufferOpaqueCaptureAddressKHR;
    public final long vkGetDeviceMemoryOpaqueCaptureAddressKHR;
    public final long vkCmdCopyBuffer2KHR;
    public final long vkCmdCopyImage2KHR;
    public final long vkCmdCopyBufferToImage2KHR;
    public final long vkCmdCopyImageToBuffer2KHR;
    public final long vkCmdBlitImage2KHR;
    public final long vkCmdResolveImage2KHR;
    public final long vkCreateRenderPass2KHR;
    public final long vkCmdBeginRenderPass2KHR;
    public final long vkCmdNextSubpass2KHR;
    public final long vkCmdEndRenderPass2KHR;
    public final long vkCreateDeferredOperationKHR;
    public final long vkDestroyDeferredOperationKHR;
    public final long vkGetDeferredOperationMaxConcurrencyKHR;
    public final long vkGetDeferredOperationResultKHR;
    public final long vkDeferredOperationJoinKHR;
    public final long vkCreateDescriptorUpdateTemplateKHR;
    public final long vkDestroyDescriptorUpdateTemplateKHR;
    public final long vkUpdateDescriptorSetWithTemplateKHR;
    public final long vkCmdPushDescriptorSetWithTemplateKHR;
    public final long vkGetDeviceGroupPeerMemoryFeaturesKHR;
    public final long vkCmdSetDeviceMaskKHR;
    public final long vkCmdDispatchBaseKHR;
    public final long vkGetDeviceGroupPresentCapabilitiesKHR;
    public final long vkGetDeviceGroupSurfacePresentModesKHR;
    public final long vkAcquireNextImage2KHR;
    public final long vkCreateSharedSwapchainsKHR;
    public final long vkCmdDrawIndirectCountKHR;
    public final long vkCmdDrawIndexedIndirectCountKHR;
    public final long vkCmdBeginRenderingKHR;
    public final long vkCmdEndRenderingKHR;
    public final long vkImportFenceFdKHR;
    public final long vkGetFenceFdKHR;
    public final long vkImportFenceWin32HandleKHR;
    public final long vkGetFenceWin32HandleKHR;
    public final long vkGetMemoryFdKHR;
    public final long vkGetMemoryFdPropertiesKHR;
    public final long vkGetMemoryWin32HandleKHR;
    public final long vkGetMemoryWin32HandlePropertiesKHR;
    public final long vkImportSemaphoreFdKHR;
    public final long vkGetSemaphoreFdKHR;
    public final long vkImportSemaphoreWin32HandleKHR;
    public final long vkGetSemaphoreWin32HandleKHR;
    public final long vkCmdSetFragmentShadingRateKHR;
    public final long vkGetImageMemoryRequirements2KHR;
    public final long vkGetBufferMemoryRequirements2KHR;
    public final long vkGetImageSparseMemoryRequirements2KHR;
    public final long vkTrimCommandPoolKHR;
    public final long vkGetDescriptorSetLayoutSupportKHR;
    public final long vkGetDeviceBufferMemoryRequirementsKHR;
    public final long vkGetDeviceImageMemoryRequirementsKHR;
    public final long vkGetDeviceImageSparseMemoryRequirementsKHR;
    public final long vkCmdBindIndexBuffer2KHR;
    public final long vkGetRenderingAreaGranularityKHR;
    public final long vkGetDeviceImageSubresourceLayoutKHR;
    public final long vkGetImageSubresourceLayout2KHR;
    public final long vkMapMemory2KHR;
    public final long vkUnmapMemory2KHR;
    public final long vkAcquireProfilingLockKHR;
    public final long vkReleaseProfilingLockKHR;
    public final long vkGetPipelineExecutablePropertiesKHR;
    public final long vkGetPipelineExecutableStatisticsKHR;
    public final long vkGetPipelineExecutableInternalRepresentationsKHR;
    public final long vkWaitForPresentKHR;
    public final long vkCmdPushDescriptorSetKHR;
    public final long vkCmdTraceRaysIndirect2KHR;
    public final long vkCmdTraceRaysKHR;
    public final long vkCreateRayTracingPipelinesKHR;
    public final long vkGetRayTracingShaderGroupHandlesKHR;
    public final long vkGetRayTracingCaptureReplayShaderGroupHandlesKHR;
    public final long vkCmdTraceRaysIndirectKHR;
    public final long vkGetRayTracingShaderGroupStackSizeKHR;
    public final long vkCmdSetRayTracingPipelineStackSizeKHR;
    public final long vkCreateSamplerYcbcrConversionKHR;
    public final long vkDestroySamplerYcbcrConversionKHR;
    public final long vkGetSwapchainStatusKHR;
    public final long vkCreateSwapchainKHR;
    public final long vkDestroySwapchainKHR;
    public final long vkGetSwapchainImagesKHR;
    public final long vkAcquireNextImageKHR;
    public final long vkQueuePresentKHR;
    public final long vkCmdSetEvent2KHR;
    public final long vkCmdResetEvent2KHR;
    public final long vkCmdWaitEvents2KHR;
    public final long vkCmdPipelineBarrier2KHR;
    public final long vkCmdWriteTimestamp2KHR;
    public final long vkQueueSubmit2KHR;
    public final long vkCmdWriteBufferMarker2AMD;
    public final long vkGetQueueCheckpointData2NV;
    public final long vkGetSemaphoreCounterValueKHR;
    public final long vkWaitSemaphoresKHR;
    public final long vkSignalSemaphoreKHR;
    public final long vkCmdDecodeVideoKHR;
    public final long vkGetEncodedVideoSessionParametersKHR;
    public final long vkCmdEncodeVideoKHR;
    public final long vkCreateVideoSessionKHR;
    public final long vkDestroyVideoSessionKHR;
    public final long vkGetVideoSessionMemoryRequirementsKHR;
    public final long vkBindVideoSessionMemoryKHR;
    public final long vkCreateVideoSessionParametersKHR;
    public final long vkUpdateVideoSessionParametersKHR;
    public final long vkDestroyVideoSessionParametersKHR;
    public final long vkCmdBeginVideoCodingKHR;
    public final long vkCmdEndVideoCodingKHR;
    public final long vkCmdControlVideoCodingKHR;
    public final long vkCmdSetViewportWScalingNV;
    public final long vkCmdCopyMemoryIndirectNV;
    public final long vkCmdCopyMemoryToImageIndirectNV;
    public final long vkCmdSetCheckpointNV;
    public final long vkGetQueueCheckpointDataNV;
    public final long vkGetGeneratedCommandsMemoryRequirementsNV;
    public final long vkCmdPreprocessGeneratedCommandsNV;
    public final long vkCmdExecuteGeneratedCommandsNV;
    public final long vkCmdBindPipelineShaderGroupNV;
    public final long vkCreateIndirectCommandsLayoutNV;
    public final long vkDestroyIndirectCommandsLayoutNV;
    public final long vkGetPipelineIndirectMemoryRequirementsNV;
    public final long vkCmdUpdatePipelineIndirectBufferNV;
    public final long vkGetPipelineIndirectDeviceAddressNV;
    public final long vkGetMemoryRemoteAddressNV;
    public final long vkGetMemoryWin32HandleNV;
    public final long vkCmdSetFragmentShadingRateEnumNV;
    public final long vkCmdDecompressMemoryNV;
    public final long vkCmdDecompressMemoryIndirectCountNV;
    public final long vkCmdDrawMeshTasksNV;
    public final long vkCmdDrawMeshTasksIndirectNV;
    public final long vkCmdDrawMeshTasksIndirectCountNV;
    public final long vkCreateOpticalFlowSessionNV;
    public final long vkDestroyOpticalFlowSessionNV;
    public final long vkBindOpticalFlowSessionImageNV;
    public final long vkCmdOpticalFlowExecuteNV;
    public final long vkCreateAccelerationStructureNV;
    public final long vkDestroyAccelerationStructureNV;
    public final long vkGetAccelerationStructureMemoryRequirementsNV;
    public final long vkBindAccelerationStructureMemoryNV;
    public final long vkCmdBuildAccelerationStructureNV;
    public final long vkCmdCopyAccelerationStructureNV;
    public final long vkCmdTraceRaysNV;
    public final long vkCreateRayTracingPipelinesNV;
    public final long vkGetRayTracingShaderGroupHandlesNV;
    public final long vkGetAccelerationStructureHandleNV;
    public final long vkCmdWriteAccelerationStructuresPropertiesNV;
    public final long vkCompileDeferredNV;
    public final long vkCmdSetExclusiveScissorEnableNV;
    public final long vkCmdSetExclusiveScissorNV;
    public final long vkCmdBindShadingRateImageNV;
    public final long vkCmdSetViewportShadingRatePaletteNV;
    public final long vkCmdSetCoarseSampleOrderNV;
    public final long vkCreateCuModuleNVX;
    public final long vkCreateCuFunctionNVX;
    public final long vkDestroyCuModuleNVX;
    public final long vkDestroyCuFunctionNVX;
    public final long vkCmdCuLaunchKernelNVX;
    public final long vkGetImageViewHandleNVX;
    public final long vkGetImageViewAddressNVX;
    public final long vkGetFramebufferTilePropertiesQCOM;
    public final long vkGetDynamicRenderingTilePropertiesQCOM;
    public final long vkGetDescriptorSetLayoutHostMappingInfoVALVE;
    public final long vkGetDescriptorSetHostMappingVALVE;
    public final int apiVersion;
    public final boolean Vulkan10;
    public final boolean Vulkan11;
    public final boolean Vulkan12;
    public final boolean Vulkan13;
    public final boolean VK_AMD_buffer_marker;
    public final boolean VK_AMD_device_coherent_memory;
    public final boolean VK_AMD_display_native_hdr;
    public final boolean VK_AMD_draw_indirect_count;
    public final boolean VK_AMD_gcn_shader;
    public final boolean VK_AMD_gpu_shader_half_float;
    public final boolean VK_AMD_gpu_shader_int16;
    public final boolean VK_AMD_memory_overallocation_behavior;
    public final boolean VK_AMD_mixed_attachment_samples;
    public final boolean VK_AMD_negative_viewport_height;
    public final boolean VK_AMD_pipeline_compiler_control;
    public final boolean VK_AMD_rasterization_order;
    public final boolean VK_AMD_shader_ballot;
    public final boolean VK_AMD_shader_core_properties;
    public final boolean VK_AMD_shader_core_properties2;
    public final boolean VK_AMD_shader_early_and_late_fragment_tests;
    public final boolean VK_AMD_shader_explicit_vertex_parameter;
    public final boolean VK_AMD_shader_fragment_mask;
    public final boolean VK_AMD_shader_image_load_store_lod;
    public final boolean VK_AMD_shader_info;
    public final boolean VK_AMD_shader_trinary_minmax;
    public final boolean VK_AMD_texture_gather_bias_lod;
    public final boolean VK_AMDX_shader_enqueue;
    public final boolean VK_ANDROID_external_memory_android_hardware_buffer;
    public final boolean VK_ARM_rasterization_order_attachment_access;
    public final boolean VK_ARM_shader_core_builtins;
    public final boolean VK_ARM_shader_core_properties;
    public final boolean VK_EXT_4444_formats;
    public final boolean VK_EXT_astc_decode_mode;
    public final boolean VK_EXT_attachment_feedback_loop_dynamic_state;
    public final boolean VK_EXT_attachment_feedback_loop_layout;
    public final boolean VK_EXT_blend_operation_advanced;
    public final boolean VK_EXT_border_color_swizzle;
    public final boolean VK_EXT_buffer_device_address;
    public final boolean VK_EXT_calibrated_timestamps;
    public final boolean VK_EXT_color_write_enable;
    public final boolean VK_EXT_conditional_rendering;
    public final boolean VK_EXT_conservative_rasterization;
    public final boolean VK_EXT_custom_border_color;
    public final boolean VK_EXT_debug_marker;
    public final boolean VK_EXT_depth_bias_control;
    public final boolean VK_EXT_depth_clamp_zero_one;
    public final boolean VK_EXT_depth_clip_control;
    public final boolean VK_EXT_depth_clip_enable;
    public final boolean VK_EXT_depth_range_unrestricted;
    public final boolean VK_EXT_descriptor_buffer;
    public final boolean VK_EXT_descriptor_indexing;
    public final boolean VK_EXT_device_address_binding_report;
    public final boolean VK_EXT_device_fault;
    public final boolean VK_EXT_device_memory_report;
    public final boolean VK_EXT_discard_rectangles;
    public final boolean VK_EXT_display_control;
    public final boolean VK_EXT_dynamic_rendering_unused_attachments;
    public final boolean VK_EXT_extended_dynamic_state;
    public final boolean VK_EXT_extended_dynamic_state2;
    public final boolean VK_EXT_extended_dynamic_state3;
    public final boolean VK_EXT_external_memory_acquire_unmodified;
    public final boolean VK_EXT_external_memory_dma_buf;
    public final boolean VK_EXT_external_memory_host;
    public final boolean VK_EXT_filter_cubic;
    public final boolean VK_EXT_fragment_density_map;
    public final boolean VK_EXT_fragment_density_map2;
    public final boolean VK_EXT_fragment_shader_interlock;
    public final boolean VK_EXT_frame_boundary;
    public final boolean VK_EXT_full_screen_exclusive;
    public final boolean VK_EXT_global_priority;
    public final boolean VK_EXT_global_priority_query;
    public final boolean VK_EXT_graphics_pipeline_library;
    public final boolean VK_EXT_hdr_metadata;
    public final boolean VK_EXT_host_image_copy;
    public final boolean VK_EXT_host_query_reset;
    public final boolean VK_EXT_image_2d_view_of_3d;
    public final boolean VK_EXT_image_compression_control;
    public final boolean VK_EXT_image_compression_control_swapchain;
    public final boolean VK_EXT_image_drm_format_modifier;
    public final boolean VK_EXT_image_robustness;
    public final boolean VK_EXT_image_sliced_view_of_3d;
    public final boolean VK_EXT_image_view_min_lod;
    public final boolean VK_EXT_index_type_uint8;
    public final boolean VK_EXT_inline_uniform_block;
    public final boolean VK_EXT_legacy_dithering;
    public final boolean VK_EXT_line_rasterization;
    public final boolean VK_EXT_load_store_op_none;
    public final boolean VK_EXT_memory_budget;
    public final boolean VK_EXT_memory_priority;
    public final boolean VK_EXT_mesh_shader;
    public final boolean VK_EXT_metal_objects;
    public final boolean VK_EXT_multi_draw;
    public final boolean VK_EXT_multisampled_render_to_single_sampled;
    public final boolean VK_EXT_mutable_descriptor_type;
    public final boolean VK_EXT_non_seamless_cube_map;
    public final boolean VK_EXT_opacity_micromap;
    public final boolean VK_EXT_pageable_device_local_memory;
    public final boolean VK_EXT_pci_bus_info;
    public final boolean VK_EXT_physical_device_drm;
    public final boolean VK_EXT_pipeline_creation_cache_control;
    public final boolean VK_EXT_pipeline_creation_feedback;
    public final boolean VK_EXT_pipeline_library_group_handles;
    public final boolean VK_EXT_pipeline_properties;
    public final boolean VK_EXT_pipeline_protected_access;
    public final boolean VK_EXT_pipeline_robustness;
    public final boolean VK_EXT_post_depth_coverage;
    public final boolean VK_EXT_primitive_topology_list_restart;
    public final boolean VK_EXT_primitives_generated_query;
    public final boolean VK_EXT_private_data;
    public final boolean VK_EXT_provoking_vertex;
    public final boolean VK_EXT_queue_family_foreign;
    public final boolean VK_EXT_rasterization_order_attachment_access;
    public final boolean VK_EXT_rgba10x6_formats;
    public final boolean VK_EXT_robustness2;
    public final boolean VK_EXT_sample_locations;
    public final boolean VK_EXT_sampler_filter_minmax;
    public final boolean VK_EXT_scalar_block_layout;
    public final boolean VK_EXT_separate_stencil_usage;
    public final boolean VK_EXT_shader_atomic_float;
    public final boolean VK_EXT_shader_atomic_float2;
    public final boolean VK_EXT_shader_demote_to_helper_invocation;
    public final boolean VK_EXT_shader_image_atomic_int64;
    public final boolean VK_EXT_shader_module_identifier;
    public final boolean VK_EXT_shader_object;
    public final boolean VK_EXT_shader_stencil_export;
    public final boolean VK_EXT_shader_subgroup_ballot;
    public final boolean VK_EXT_shader_subgroup_vote;
    public final boolean VK_EXT_shader_tile_image;
    public final boolean VK_EXT_shader_viewport_index_layer;
    public final boolean VK_EXT_subgroup_size_control;
    public final boolean VK_EXT_subpass_merge_feedback;
    public final boolean VK_EXT_swapchain_maintenance1;
    public final boolean VK_EXT_texel_buffer_alignment;
    public final boolean VK_EXT_texture_compression_astc_hdr;
    public final boolean VK_EXT_tooling_info;
    public final boolean VK_EXT_transform_feedback;
    public final boolean VK_EXT_validation_cache;
    public final boolean VK_EXT_vertex_attribute_divisor;
    public final boolean VK_EXT_vertex_input_dynamic_state;
    public final boolean VK_EXT_video_encode_h264;
    public final boolean VK_EXT_video_encode_h265;
    public final boolean VK_EXT_ycbcr_2plane_444_formats;
    public final boolean VK_EXT_ycbcr_image_arrays;
    public final boolean VK_GOOGLE_decorate_string;
    public final boolean VK_GOOGLE_display_timing;
    public final boolean VK_GOOGLE_hlsl_functionality1;
    public final boolean VK_GOOGLE_user_type;
    public final boolean VK_HUAWEI_cluster_culling_shader;
    public final boolean VK_HUAWEI_invocation_mask;
    public final boolean VK_HUAWEI_subpass_shading;
    public final boolean VK_IMG_filter_cubic;
    public final boolean VK_IMG_format_pvrtc;
    public final boolean VK_INTEL_performance_query;
    public final boolean VK_INTEL_shader_integer_functions2;
    public final boolean VK_KHR_16bit_storage;
    public final boolean VK_KHR_8bit_storage;
    public final boolean VK_KHR_acceleration_structure;
    public final boolean VK_KHR_bind_memory2;
    public final boolean VK_KHR_buffer_device_address;
    public final boolean VK_KHR_cooperative_matrix;
    public final boolean VK_KHR_copy_commands2;
    public final boolean VK_KHR_create_renderpass2;
    public final boolean VK_KHR_dedicated_allocation;
    public final boolean VK_KHR_deferred_host_operations;
    public final boolean VK_KHR_depth_stencil_resolve;
    public final boolean VK_KHR_descriptor_update_template;
    public final boolean VK_KHR_device_group;
    public final boolean VK_KHR_display_swapchain;
    public final boolean VK_KHR_draw_indirect_count;
    public final boolean VK_KHR_driver_properties;
    public final boolean VK_KHR_dynamic_rendering;
    public final boolean VK_KHR_external_fence;
    public final boolean VK_KHR_external_fence_fd;
    public final boolean VK_KHR_external_fence_win32;
    public final boolean VK_KHR_external_memory;
    public final boolean VK_KHR_external_memory_fd;
    public final boolean VK_KHR_external_memory_win32;
    public final boolean VK_KHR_external_semaphore;
    public final boolean VK_KHR_external_semaphore_fd;
    public final boolean VK_KHR_external_semaphore_win32;
    public final boolean VK_KHR_format_feature_flags2;
    public final boolean VK_KHR_fragment_shader_barycentric;
    public final boolean VK_KHR_fragment_shading_rate;
    public final boolean VK_KHR_get_memory_requirements2;
    public final boolean VK_KHR_global_priority;
    public final boolean VK_KHR_image_format_list;
    public final boolean VK_KHR_imageless_framebuffer;
    public final boolean VK_KHR_incremental_present;
    public final boolean VK_KHR_maintenance1;
    public final boolean VK_KHR_maintenance2;
    public final boolean VK_KHR_maintenance3;
    public final boolean VK_KHR_maintenance4;
    public final boolean VK_KHR_maintenance5;
    public final boolean VK_KHR_map_memory2;
    public final boolean VK_KHR_multiview;
    public final boolean VK_KHR_performance_query;
    public final boolean VK_KHR_pipeline_executable_properties;
    public final boolean VK_KHR_pipeline_library;
    public final boolean VK_KHR_portability_subset;
    public final boolean VK_KHR_present_id;
    public final boolean VK_KHR_present_wait;
    public final boolean VK_KHR_push_descriptor;
    public final boolean VK_KHR_ray_query;
    public final boolean VK_KHR_ray_tracing_maintenance1;
    public final boolean VK_KHR_ray_tracing_pipeline;
    public final boolean VK_KHR_ray_tracing_position_fetch;
    public final boolean VK_KHR_relaxed_block_layout;
    public final boolean VK_KHR_sampler_mirror_clamp_to_edge;
    public final boolean VK_KHR_sampler_ycbcr_conversion;
    public final boolean VK_KHR_separate_depth_stencil_layouts;
    public final boolean VK_KHR_shader_atomic_int64;
    public final boolean VK_KHR_shader_clock;
    public final boolean VK_KHR_shader_draw_parameters;
    public final boolean VK_KHR_shader_float16_int8;
    public final boolean VK_KHR_shader_float_controls;
    public final boolean VK_KHR_shader_integer_dot_product;
    public final boolean VK_KHR_shader_non_semantic_info;
    public final boolean VK_KHR_shader_subgroup_extended_types;
    public final boolean VK_KHR_shader_subgroup_uniform_control_flow;
    public final boolean VK_KHR_shader_terminate_invocation;
    public final boolean VK_KHR_shared_presentable_image;
    public final boolean VK_KHR_spirv_1_4;
    public final boolean VK_KHR_storage_buffer_storage_class;
    public final boolean VK_KHR_swapchain;
    public final boolean VK_KHR_swapchain_mutable_format;
    public final boolean VK_KHR_synchronization2;
    public final boolean VK_KHR_timeline_semaphore;
    public final boolean VK_KHR_uniform_buffer_standard_layout;
    public final boolean VK_KHR_variable_pointers;
    public final boolean VK_KHR_video_decode_h264;
    public final boolean VK_KHR_video_decode_h265;
    public final boolean VK_KHR_video_decode_queue;
    public final boolean VK_KHR_video_encode_queue;
    public final boolean VK_KHR_video_queue;
    public final boolean VK_KHR_vulkan_memory_model;
    public final boolean VK_KHR_win32_keyed_mutex;
    public final boolean VK_KHR_workgroup_memory_explicit_layout;
    public final boolean VK_KHR_zero_initialize_workgroup_memory;
    public final boolean VK_MSFT_layered_driver;
    public final boolean VK_NV_acquire_winrt_display;
    public final boolean VK_NV_clip_space_w_scaling;
    public final boolean VK_NV_compute_shader_derivatives;
    public final boolean VK_NV_cooperative_matrix;
    public final boolean VK_NV_copy_memory_indirect;
    public final boolean VK_NV_corner_sampled_image;
    public final boolean VK_NV_coverage_reduction_mode;
    public final boolean VK_NV_dedicated_allocation;
    public final boolean VK_NV_dedicated_allocation_image_aliasing;
    public final boolean VK_NV_descriptor_pool_overallocation;
    public final boolean VK_NV_device_diagnostic_checkpoints;
    public final boolean VK_NV_device_diagnostics_config;
    public final boolean VK_NV_device_generated_commands;
    public final boolean VK_NV_device_generated_commands_compute;
    public final boolean VK_NV_displacement_micromap;
    public final boolean VK_NV_external_memory;
    public final boolean VK_NV_external_memory_rdma;
    public final boolean VK_NV_external_memory_win32;
    public final boolean VK_NV_fill_rectangle;
    public final boolean VK_NV_fragment_coverage_to_color;
    public final boolean VK_NV_fragment_shader_barycentric;
    public final boolean VK_NV_fragment_shading_rate_enums;
    public final boolean VK_NV_framebuffer_mixed_samples;
    public final boolean VK_NV_geometry_shader_passthrough;
    public final boolean VK_NV_glsl_shader;
    public final boolean VK_NV_inherited_viewport_scissor;
    public final boolean VK_NV_linear_color_attachment;
    public final boolean VK_NV_low_latency;
    public final boolean VK_NV_memory_decompression;
    public final boolean VK_NV_mesh_shader;
    public final boolean VK_NV_optical_flow;
    public final boolean VK_NV_present_barrier;
    public final boolean VK_NV_ray_tracing;
    public final boolean VK_NV_ray_tracing_invocation_reorder;
    public final boolean VK_NV_ray_tracing_motion_blur;
    public final boolean VK_NV_representative_fragment_test;
    public final boolean VK_NV_sample_mask_override_coverage;
    public final boolean VK_NV_scissor_exclusive;
    public final boolean VK_NV_shader_image_footprint;
    public final boolean VK_NV_shader_sm_builtins;
    public final boolean VK_NV_shader_subgroup_partitioned;
    public final boolean VK_NV_shading_rate_image;
    public final boolean VK_NV_viewport_array2;
    public final boolean VK_NV_viewport_swizzle;
    public final boolean VK_NV_win32_keyed_mutex;
    public final boolean VK_NVX_binary_import;
    public final boolean VK_NVX_image_view_handle;
    public final boolean VK_NVX_multiview_per_view_attributes;
    public final boolean VK_QCOM_filter_cubic_clamp;
    public final boolean VK_QCOM_filter_cubic_weights;
    public final boolean VK_QCOM_fragment_density_map_offset;
    public final boolean VK_QCOM_image_processing;
    public final boolean VK_QCOM_image_processing2;
    public final boolean VK_QCOM_multiview_per_view_render_areas;
    public final boolean VK_QCOM_multiview_per_view_viewports;
    public final boolean VK_QCOM_render_pass_shader_resolve;
    public final boolean VK_QCOM_render_pass_store_ops;
    public final boolean VK_QCOM_render_pass_transform;
    public final boolean VK_QCOM_rotated_copy_commands;
    public final boolean VK_QCOM_tile_properties;
    public final boolean VK_QCOM_ycbcr_degamma;
    public final boolean VK_SEC_amigo_profiling;
    public final boolean STD_vulkan_video_codec_h264;
    public final boolean STD_vulkan_video_codec_h265;
    public final boolean VK_VALVE_descriptor_set_host_mapping;
    public final boolean VK_VALVE_mutable_descriptor_type;

    VKCapabilitiesDevice(org.lwjgl.system.FunctionProvider r6, org.lwjgl.vulkan.VKCapabilitiesInstance r7, int r8, java.util.Set<java.lang.String> r9) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            r1 = r8
            r0.apiVersion = r1
            r0 = 532(0x214, float:7.45E-43)
            long[] r0 = new long[r0]
            r10 = r0
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_VK10(r1, r2, r3)
            r0.Vulkan10 = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_VK11(r1, r2, r3)
            r0.Vulkan11 = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_VK12(r1, r2, r3)
            r0.Vulkan12 = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_VK13(r1, r2, r3)
            r0.Vulkan13 = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_AMD_buffer_marker(r1, r2, r3)
            r0.VK_AMD_buffer_marker = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_AMD_device_coherent_memory"
            boolean r1 = r1.contains(r2)
            r0.VK_AMD_device_coherent_memory = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_AMD_display_native_hdr(r1, r2, r3)
            r0.VK_AMD_display_native_hdr = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_AMD_draw_indirect_count(r1, r2, r3)
            r0.VK_AMD_draw_indirect_count = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_AMD_gcn_shader"
            boolean r1 = r1.contains(r2)
            r0.VK_AMD_gcn_shader = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_AMD_gpu_shader_half_float"
            boolean r1 = r1.contains(r2)
            r0.VK_AMD_gpu_shader_half_float = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_AMD_gpu_shader_int16"
            boolean r1 = r1.contains(r2)
            r0.VK_AMD_gpu_shader_int16 = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_AMD_memory_overallocation_behavior"
            boolean r1 = r1.contains(r2)
            r0.VK_AMD_memory_overallocation_behavior = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_AMD_mixed_attachment_samples"
            boolean r1 = r1.contains(r2)
            r0.VK_AMD_mixed_attachment_samples = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_AMD_negative_viewport_height"
            boolean r1 = r1.contains(r2)
            r0.VK_AMD_negative_viewport_height = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_AMD_pipeline_compiler_control"
            boolean r1 = r1.contains(r2)
            r0.VK_AMD_pipeline_compiler_control = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_AMD_rasterization_order"
            boolean r1 = r1.contains(r2)
            r0.VK_AMD_rasterization_order = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_AMD_shader_ballot"
            boolean r1 = r1.contains(r2)
            r0.VK_AMD_shader_ballot = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_AMD_shader_core_properties"
            boolean r1 = r1.contains(r2)
            r0.VK_AMD_shader_core_properties = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_AMD_shader_core_properties2"
            boolean r1 = r1.contains(r2)
            r0.VK_AMD_shader_core_properties2 = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_AMD_shader_early_and_late_fragment_tests"
            boolean r1 = r1.contains(r2)
            r0.VK_AMD_shader_early_and_late_fragment_tests = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_AMD_shader_explicit_vertex_parameter"
            boolean r1 = r1.contains(r2)
            r0.VK_AMD_shader_explicit_vertex_parameter = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_AMD_shader_fragment_mask"
            boolean r1 = r1.contains(r2)
            r0.VK_AMD_shader_fragment_mask = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_AMD_shader_image_load_store_lod"
            boolean r1 = r1.contains(r2)
            r0.VK_AMD_shader_image_load_store_lod = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_AMD_shader_info(r1, r2, r3)
            r0.VK_AMD_shader_info = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_AMD_shader_trinary_minmax"
            boolean r1 = r1.contains(r2)
            r0.VK_AMD_shader_trinary_minmax = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_AMD_texture_gather_bias_lod"
            boolean r1 = r1.contains(r2)
            r0.VK_AMD_texture_gather_bias_lod = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_AMDX_shader_enqueue(r1, r2, r3)
            r0.VK_AMDX_shader_enqueue = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_ANDROID_external_memory_android_hardware_buffer(r1, r2, r3)
            r0.VK_ANDROID_external_memory_android_hardware_buffer = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_ARM_rasterization_order_attachment_access"
            boolean r1 = r1.contains(r2)
            r0.VK_ARM_rasterization_order_attachment_access = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_ARM_shader_core_builtins"
            boolean r1 = r1.contains(r2)
            r0.VK_ARM_shader_core_builtins = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_ARM_shader_core_properties"
            boolean r1 = r1.contains(r2)
            r0.VK_ARM_shader_core_properties = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_4444_formats"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_4444_formats = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_astc_decode_mode"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_astc_decode_mode = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_EXT_attachment_feedback_loop_dynamic_state(r1, r2, r3)
            r0.VK_EXT_attachment_feedback_loop_dynamic_state = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_attachment_feedback_loop_layout"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_attachment_feedback_loop_layout = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_blend_operation_advanced"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_blend_operation_advanced = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_border_color_swizzle"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_border_color_swizzle = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_EXT_buffer_device_address(r1, r2, r3)
            r0.VK_EXT_buffer_device_address = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_EXT_calibrated_timestamps(r1, r2, r3)
            r0.VK_EXT_calibrated_timestamps = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_EXT_color_write_enable(r1, r2, r3)
            r0.VK_EXT_color_write_enable = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_EXT_conditional_rendering(r1, r2, r3)
            r0.VK_EXT_conditional_rendering = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_conservative_rasterization"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_conservative_rasterization = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_custom_border_color"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_custom_border_color = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_EXT_debug_marker(r1, r2, r3)
            r0.VK_EXT_debug_marker = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_EXT_depth_bias_control(r1, r2, r3)
            r0.VK_EXT_depth_bias_control = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_depth_clamp_zero_one"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_depth_clamp_zero_one = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_depth_clip_control"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_depth_clip_control = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_depth_clip_enable"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_depth_clip_enable = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_depth_range_unrestricted"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_depth_range_unrestricted = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_EXT_descriptor_buffer(r1, r2, r3)
            r0.VK_EXT_descriptor_buffer = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_descriptor_indexing"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_descriptor_indexing = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_device_address_binding_report"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_device_address_binding_report = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_EXT_device_fault(r1, r2, r3)
            r0.VK_EXT_device_fault = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_device_memory_report"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_device_memory_report = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_EXT_discard_rectangles(r1, r2, r3)
            r0.VK_EXT_discard_rectangles = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_EXT_display_control(r1, r2, r3)
            r0.VK_EXT_display_control = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_dynamic_rendering_unused_attachments"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_dynamic_rendering_unused_attachments = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_EXT_extended_dynamic_state(r1, r2, r3)
            r0.VK_EXT_extended_dynamic_state = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_EXT_extended_dynamic_state2(r1, r2, r3)
            r0.VK_EXT_extended_dynamic_state2 = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_EXT_extended_dynamic_state3(r1, r2, r3)
            r0.VK_EXT_extended_dynamic_state3 = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_external_memory_acquire_unmodified"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_external_memory_acquire_unmodified = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_external_memory_dma_buf"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_external_memory_dma_buf = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_EXT_external_memory_host(r1, r2, r3)
            r0.VK_EXT_external_memory_host = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_filter_cubic"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_filter_cubic = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_fragment_density_map"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_fragment_density_map = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_fragment_density_map2"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_fragment_density_map2 = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_fragment_shader_interlock"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_fragment_shader_interlock = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_frame_boundary"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_frame_boundary = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_EXT_full_screen_exclusive(r1, r2, r3)
            r0.VK_EXT_full_screen_exclusive = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_global_priority"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_global_priority = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_global_priority_query"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_global_priority_query = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_graphics_pipeline_library"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_graphics_pipeline_library = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_EXT_hdr_metadata(r1, r2, r3)
            r0.VK_EXT_hdr_metadata = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_EXT_host_image_copy(r1, r2, r3)
            r0.VK_EXT_host_image_copy = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_EXT_host_query_reset(r1, r2, r3)
            r0.VK_EXT_host_query_reset = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_image_2d_view_of_3d"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_image_2d_view_of_3d = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_EXT_image_compression_control(r1, r2, r3)
            r0.VK_EXT_image_compression_control = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_image_compression_control_swapchain"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_image_compression_control_swapchain = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_EXT_image_drm_format_modifier(r1, r2, r3)
            r0.VK_EXT_image_drm_format_modifier = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_image_robustness"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_image_robustness = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_image_sliced_view_of_3d"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_image_sliced_view_of_3d = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_image_view_min_lod"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_image_view_min_lod = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_index_type_uint8"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_index_type_uint8 = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_inline_uniform_block"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_inline_uniform_block = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_legacy_dithering"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_legacy_dithering = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_EXT_line_rasterization(r1, r2, r3)
            r0.VK_EXT_line_rasterization = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_load_store_op_none"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_load_store_op_none = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_memory_budget"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_memory_budget = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_memory_priority"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_memory_priority = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_EXT_mesh_shader(r1, r2, r3)
            r0.VK_EXT_mesh_shader = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_EXT_metal_objects(r1, r2, r3)
            r0.VK_EXT_metal_objects = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_EXT_multi_draw(r1, r2, r3)
            r0.VK_EXT_multi_draw = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_multisampled_render_to_single_sampled"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_multisampled_render_to_single_sampled = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_mutable_descriptor_type"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_mutable_descriptor_type = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_non_seamless_cube_map"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_non_seamless_cube_map = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_EXT_opacity_micromap(r1, r2, r3)
            r0.VK_EXT_opacity_micromap = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_EXT_pageable_device_local_memory(r1, r2, r3)
            r0.VK_EXT_pageable_device_local_memory = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_pci_bus_info"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_pci_bus_info = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_physical_device_drm"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_physical_device_drm = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_pipeline_creation_cache_control"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_pipeline_creation_cache_control = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_pipeline_creation_feedback"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_pipeline_creation_feedback = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_pipeline_library_group_handles"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_pipeline_library_group_handles = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_EXT_pipeline_properties(r1, r2, r3)
            r0.VK_EXT_pipeline_properties = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_pipeline_protected_access"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_pipeline_protected_access = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_pipeline_robustness"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_pipeline_robustness = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_post_depth_coverage"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_post_depth_coverage = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_primitive_topology_list_restart"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_primitive_topology_list_restart = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_primitives_generated_query"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_primitives_generated_query = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_EXT_private_data(r1, r2, r3)
            r0.VK_EXT_private_data = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_provoking_vertex"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_provoking_vertex = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_queue_family_foreign"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_queue_family_foreign = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_rasterization_order_attachment_access"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_rasterization_order_attachment_access = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_rgba10x6_formats"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_rgba10x6_formats = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_robustness2"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_robustness2 = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_EXT_sample_locations(r1, r2, r3)
            r0.VK_EXT_sample_locations = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_sampler_filter_minmax"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_sampler_filter_minmax = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_scalar_block_layout"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_scalar_block_layout = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_separate_stencil_usage"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_separate_stencil_usage = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_shader_atomic_float"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_shader_atomic_float = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_shader_atomic_float2"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_shader_atomic_float2 = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_shader_demote_to_helper_invocation"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_shader_demote_to_helper_invocation = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_shader_image_atomic_int64"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_shader_image_atomic_int64 = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_EXT_shader_module_identifier(r1, r2, r3)
            r0.VK_EXT_shader_module_identifier = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_EXT_shader_object(r1, r2, r3)
            r0.VK_EXT_shader_object = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_shader_stencil_export"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_shader_stencil_export = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_shader_subgroup_ballot"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_shader_subgroup_ballot = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_shader_subgroup_vote"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_shader_subgroup_vote = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_shader_tile_image"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_shader_tile_image = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_shader_viewport_index_layer"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_shader_viewport_index_layer = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_subgroup_size_control"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_subgroup_size_control = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_subpass_merge_feedback"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_subpass_merge_feedback = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_EXT_swapchain_maintenance1(r1, r2, r3)
            r0.VK_EXT_swapchain_maintenance1 = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_texel_buffer_alignment"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_texel_buffer_alignment = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_texture_compression_astc_hdr"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_texture_compression_astc_hdr = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_tooling_info"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_tooling_info = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_EXT_transform_feedback(r1, r2, r3)
            r0.VK_EXT_transform_feedback = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_EXT_validation_cache(r1, r2, r3)
            r0.VK_EXT_validation_cache = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_vertex_attribute_divisor"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_vertex_attribute_divisor = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_EXT_vertex_input_dynamic_state(r1, r2, r3)
            r0.VK_EXT_vertex_input_dynamic_state = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_video_encode_h264"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_video_encode_h264 = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_video_encode_h265"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_video_encode_h265 = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_ycbcr_2plane_444_formats"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_ycbcr_2plane_444_formats = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_EXT_ycbcr_image_arrays"
            boolean r1 = r1.contains(r2)
            r0.VK_EXT_ycbcr_image_arrays = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_GOOGLE_decorate_string"
            boolean r1 = r1.contains(r2)
            r0.VK_GOOGLE_decorate_string = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_GOOGLE_display_timing(r1, r2, r3)
            r0.VK_GOOGLE_display_timing = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_GOOGLE_hlsl_functionality1"
            boolean r1 = r1.contains(r2)
            r0.VK_GOOGLE_hlsl_functionality1 = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_GOOGLE_user_type"
            boolean r1 = r1.contains(r2)
            r0.VK_GOOGLE_user_type = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_HUAWEI_cluster_culling_shader(r1, r2, r3)
            r0.VK_HUAWEI_cluster_culling_shader = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_HUAWEI_invocation_mask(r1, r2, r3)
            r0.VK_HUAWEI_invocation_mask = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_HUAWEI_subpass_shading(r1, r2, r3)
            r0.VK_HUAWEI_subpass_shading = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_IMG_filter_cubic"
            boolean r1 = r1.contains(r2)
            r0.VK_IMG_filter_cubic = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_IMG_format_pvrtc"
            boolean r1 = r1.contains(r2)
            r0.VK_IMG_format_pvrtc = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_INTEL_performance_query(r1, r2, r3)
            r0.VK_INTEL_performance_query = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_INTEL_shader_integer_functions2"
            boolean r1 = r1.contains(r2)
            r0.VK_INTEL_shader_integer_functions2 = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_16bit_storage"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_16bit_storage = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_8bit_storage"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_8bit_storage = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_KHR_acceleration_structure(r1, r2, r3)
            r0.VK_KHR_acceleration_structure = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_KHR_bind_memory2(r1, r2, r3)
            r0.VK_KHR_bind_memory2 = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_KHR_buffer_device_address(r1, r2, r3)
            r0.VK_KHR_buffer_device_address = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_cooperative_matrix"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_cooperative_matrix = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_KHR_copy_commands2(r1, r2, r3)
            r0.VK_KHR_copy_commands2 = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_KHR_create_renderpass2(r1, r2, r3)
            r0.VK_KHR_create_renderpass2 = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_dedicated_allocation"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_dedicated_allocation = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_KHR_deferred_host_operations(r1, r2, r3)
            r0.VK_KHR_deferred_host_operations = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_depth_stencil_resolve"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_depth_stencil_resolve = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_KHR_descriptor_update_template(r1, r2, r3)
            r0.VK_KHR_descriptor_update_template = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_KHR_device_group(r1, r2, r3)
            r0.VK_KHR_device_group = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_KHR_display_swapchain(r1, r2, r3)
            r0.VK_KHR_display_swapchain = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_KHR_draw_indirect_count(r1, r2, r3)
            r0.VK_KHR_draw_indirect_count = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_driver_properties"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_driver_properties = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_KHR_dynamic_rendering(r1, r2, r3)
            r0.VK_KHR_dynamic_rendering = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_external_fence"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_external_fence = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_KHR_external_fence_fd(r1, r2, r3)
            r0.VK_KHR_external_fence_fd = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_KHR_external_fence_win32(r1, r2, r3)
            r0.VK_KHR_external_fence_win32 = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_external_memory"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_external_memory = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_KHR_external_memory_fd(r1, r2, r3)
            r0.VK_KHR_external_memory_fd = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_KHR_external_memory_win32(r1, r2, r3)
            r0.VK_KHR_external_memory_win32 = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_external_semaphore"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_external_semaphore = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_KHR_external_semaphore_fd(r1, r2, r3)
            r0.VK_KHR_external_semaphore_fd = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_KHR_external_semaphore_win32(r1, r2, r3)
            r0.VK_KHR_external_semaphore_win32 = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_format_feature_flags2"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_format_feature_flags2 = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_fragment_shader_barycentric"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_fragment_shader_barycentric = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_KHR_fragment_shading_rate(r1, r2, r3)
            r0.VK_KHR_fragment_shading_rate = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_KHR_get_memory_requirements2(r1, r2, r3)
            r0.VK_KHR_get_memory_requirements2 = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_global_priority"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_global_priority = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_image_format_list"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_image_format_list = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_imageless_framebuffer"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_imageless_framebuffer = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_incremental_present"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_incremental_present = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_KHR_maintenance1(r1, r2, r3)
            r0.VK_KHR_maintenance1 = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_maintenance2"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_maintenance2 = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_KHR_maintenance3(r1, r2, r3)
            r0.VK_KHR_maintenance3 = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_KHR_maintenance4(r1, r2, r3)
            r0.VK_KHR_maintenance4 = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_KHR_maintenance5(r1, r2, r3)
            r0.VK_KHR_maintenance5 = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_KHR_map_memory2(r1, r2, r3)
            r0.VK_KHR_map_memory2 = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_multiview"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_multiview = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_KHR_performance_query(r1, r2, r3)
            r0.VK_KHR_performance_query = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_KHR_pipeline_executable_properties(r1, r2, r3)
            r0.VK_KHR_pipeline_executable_properties = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_pipeline_library"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_pipeline_library = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_portability_subset"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_portability_subset = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_present_id"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_present_id = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_KHR_present_wait(r1, r2, r3)
            r0.VK_KHR_present_wait = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_KHR_push_descriptor(r1, r2, r3)
            r0.VK_KHR_push_descriptor = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_ray_query"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_ray_query = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_KHR_ray_tracing_maintenance1(r1, r2, r3)
            r0.VK_KHR_ray_tracing_maintenance1 = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_KHR_ray_tracing_pipeline(r1, r2, r3)
            r0.VK_KHR_ray_tracing_pipeline = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_ray_tracing_position_fetch"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_ray_tracing_position_fetch = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_relaxed_block_layout"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_relaxed_block_layout = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_sampler_mirror_clamp_to_edge"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_sampler_mirror_clamp_to_edge = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_KHR_sampler_ycbcr_conversion(r1, r2, r3)
            r0.VK_KHR_sampler_ycbcr_conversion = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_separate_depth_stencil_layouts"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_separate_depth_stencil_layouts = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_shader_atomic_int64"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_shader_atomic_int64 = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_shader_clock"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_shader_clock = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_shader_draw_parameters"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_shader_draw_parameters = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_shader_float16_int8"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_shader_float16_int8 = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_shader_float_controls"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_shader_float_controls = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_shader_integer_dot_product"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_shader_integer_dot_product = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_shader_non_semantic_info"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_shader_non_semantic_info = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_shader_subgroup_extended_types"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_shader_subgroup_extended_types = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_shader_subgroup_uniform_control_flow"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_shader_subgroup_uniform_control_flow = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_shader_terminate_invocation"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_shader_terminate_invocation = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_KHR_shared_presentable_image(r1, r2, r3)
            r0.VK_KHR_shared_presentable_image = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_spirv_1_4"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_spirv_1_4 = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_storage_buffer_storage_class"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_storage_buffer_storage_class = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_KHR_swapchain(r1, r2, r3)
            r0.VK_KHR_swapchain = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_swapchain_mutable_format"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_swapchain_mutable_format = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_KHR_synchronization2(r1, r2, r3)
            r0.VK_KHR_synchronization2 = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_KHR_timeline_semaphore(r1, r2, r3)
            r0.VK_KHR_timeline_semaphore = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_uniform_buffer_standard_layout"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_uniform_buffer_standard_layout = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_variable_pointers"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_variable_pointers = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_video_decode_h264"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_video_decode_h264 = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_video_decode_h265"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_video_decode_h265 = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_KHR_video_decode_queue(r1, r2, r3)
            r0.VK_KHR_video_decode_queue = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_KHR_video_encode_queue(r1, r2, r3)
            r0.VK_KHR_video_encode_queue = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_KHR_video_queue(r1, r2, r3)
            r0.VK_KHR_video_queue = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_vulkan_memory_model"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_vulkan_memory_model = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_win32_keyed_mutex"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_win32_keyed_mutex = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_workgroup_memory_explicit_layout"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_workgroup_memory_explicit_layout = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_KHR_zero_initialize_workgroup_memory"
            boolean r1 = r1.contains(r2)
            r0.VK_KHR_zero_initialize_workgroup_memory = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_MSFT_layered_driver"
            boolean r1 = r1.contains(r2)
            r0.VK_MSFT_layered_driver = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_NV_acquire_winrt_display"
            boolean r1 = r1.contains(r2)
            r0.VK_NV_acquire_winrt_display = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_NV_clip_space_w_scaling(r1, r2, r3)
            r0.VK_NV_clip_space_w_scaling = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_NV_compute_shader_derivatives"
            boolean r1 = r1.contains(r2)
            r0.VK_NV_compute_shader_derivatives = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_NV_cooperative_matrix"
            boolean r1 = r1.contains(r2)
            r0.VK_NV_cooperative_matrix = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_NV_copy_memory_indirect(r1, r2, r3)
            r0.VK_NV_copy_memory_indirect = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_NV_corner_sampled_image"
            boolean r1 = r1.contains(r2)
            r0.VK_NV_corner_sampled_image = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_NV_coverage_reduction_mode"
            boolean r1 = r1.contains(r2)
            r0.VK_NV_coverage_reduction_mode = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_NV_dedicated_allocation"
            boolean r1 = r1.contains(r2)
            r0.VK_NV_dedicated_allocation = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_NV_dedicated_allocation_image_aliasing"
            boolean r1 = r1.contains(r2)
            r0.VK_NV_dedicated_allocation_image_aliasing = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_NV_descriptor_pool_overallocation"
            boolean r1 = r1.contains(r2)
            r0.VK_NV_descriptor_pool_overallocation = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_NV_device_diagnostic_checkpoints(r1, r2, r3)
            r0.VK_NV_device_diagnostic_checkpoints = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_NV_device_diagnostics_config"
            boolean r1 = r1.contains(r2)
            r0.VK_NV_device_diagnostics_config = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_NV_device_generated_commands(r1, r2, r3)
            r0.VK_NV_device_generated_commands = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_NV_device_generated_commands_compute(r1, r2, r3)
            r0.VK_NV_device_generated_commands_compute = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_NV_displacement_micromap"
            boolean r1 = r1.contains(r2)
            r0.VK_NV_displacement_micromap = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_NV_external_memory"
            boolean r1 = r1.contains(r2)
            r0.VK_NV_external_memory = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_NV_external_memory_rdma(r1, r2, r3)
            r0.VK_NV_external_memory_rdma = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_NV_external_memory_win32(r1, r2, r3)
            r0.VK_NV_external_memory_win32 = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_NV_fill_rectangle"
            boolean r1 = r1.contains(r2)
            r0.VK_NV_fill_rectangle = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_NV_fragment_coverage_to_color"
            boolean r1 = r1.contains(r2)
            r0.VK_NV_fragment_coverage_to_color = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_NV_fragment_shader_barycentric"
            boolean r1 = r1.contains(r2)
            r0.VK_NV_fragment_shader_barycentric = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_NV_fragment_shading_rate_enums(r1, r2, r3)
            r0.VK_NV_fragment_shading_rate_enums = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_NV_framebuffer_mixed_samples"
            boolean r1 = r1.contains(r2)
            r0.VK_NV_framebuffer_mixed_samples = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_NV_geometry_shader_passthrough"
            boolean r1 = r1.contains(r2)
            r0.VK_NV_geometry_shader_passthrough = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_NV_glsl_shader"
            boolean r1 = r1.contains(r2)
            r0.VK_NV_glsl_shader = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_NV_inherited_viewport_scissor"
            boolean r1 = r1.contains(r2)
            r0.VK_NV_inherited_viewport_scissor = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_NV_linear_color_attachment"
            boolean r1 = r1.contains(r2)
            r0.VK_NV_linear_color_attachment = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_NV_low_latency"
            boolean r1 = r1.contains(r2)
            r0.VK_NV_low_latency = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_NV_memory_decompression(r1, r2, r3)
            r0.VK_NV_memory_decompression = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_NV_mesh_shader(r1, r2, r3)
            r0.VK_NV_mesh_shader = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_NV_optical_flow(r1, r2, r3)
            r0.VK_NV_optical_flow = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_NV_present_barrier"
            boolean r1 = r1.contains(r2)
            r0.VK_NV_present_barrier = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_NV_ray_tracing(r1, r2, r3)
            r0.VK_NV_ray_tracing = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_NV_ray_tracing_invocation_reorder"
            boolean r1 = r1.contains(r2)
            r0.VK_NV_ray_tracing_invocation_reorder = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_NV_ray_tracing_motion_blur"
            boolean r1 = r1.contains(r2)
            r0.VK_NV_ray_tracing_motion_blur = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_NV_representative_fragment_test"
            boolean r1 = r1.contains(r2)
            r0.VK_NV_representative_fragment_test = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_NV_sample_mask_override_coverage"
            boolean r1 = r1.contains(r2)
            r0.VK_NV_sample_mask_override_coverage = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_NV_scissor_exclusive(r1, r2, r3)
            r0.VK_NV_scissor_exclusive = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_NV_shader_image_footprint"
            boolean r1 = r1.contains(r2)
            r0.VK_NV_shader_image_footprint = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_NV_shader_sm_builtins"
            boolean r1 = r1.contains(r2)
            r0.VK_NV_shader_sm_builtins = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_NV_shader_subgroup_partitioned"
            boolean r1 = r1.contains(r2)
            r0.VK_NV_shader_subgroup_partitioned = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_NV_shading_rate_image(r1, r2, r3)
            r0.VK_NV_shading_rate_image = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_NV_viewport_array2"
            boolean r1 = r1.contains(r2)
            r0.VK_NV_viewport_array2 = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_NV_viewport_swizzle"
            boolean r1 = r1.contains(r2)
            r0.VK_NV_viewport_swizzle = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_NV_win32_keyed_mutex"
            boolean r1 = r1.contains(r2)
            r0.VK_NV_win32_keyed_mutex = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_NVX_binary_import(r1, r2, r3)
            r0.VK_NVX_binary_import = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_NVX_image_view_handle(r1, r2, r3)
            r0.VK_NVX_image_view_handle = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_NVX_multiview_per_view_attributes"
            boolean r1 = r1.contains(r2)
            r0.VK_NVX_multiview_per_view_attributes = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_QCOM_filter_cubic_clamp"
            boolean r1 = r1.contains(r2)
            r0.VK_QCOM_filter_cubic_clamp = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_QCOM_filter_cubic_weights"
            boolean r1 = r1.contains(r2)
            r0.VK_QCOM_filter_cubic_weights = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_QCOM_fragment_density_map_offset"
            boolean r1 = r1.contains(r2)
            r0.VK_QCOM_fragment_density_map_offset = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_QCOM_image_processing"
            boolean r1 = r1.contains(r2)
            r0.VK_QCOM_image_processing = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_QCOM_image_processing2"
            boolean r1 = r1.contains(r2)
            r0.VK_QCOM_image_processing2 = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_QCOM_multiview_per_view_render_areas"
            boolean r1 = r1.contains(r2)
            r0.VK_QCOM_multiview_per_view_render_areas = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_QCOM_multiview_per_view_viewports"
            boolean r1 = r1.contains(r2)
            r0.VK_QCOM_multiview_per_view_viewports = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_QCOM_render_pass_shader_resolve"
            boolean r1 = r1.contains(r2)
            r0.VK_QCOM_render_pass_shader_resolve = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_QCOM_render_pass_store_ops"
            boolean r1 = r1.contains(r2)
            r0.VK_QCOM_render_pass_store_ops = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_QCOM_render_pass_transform"
            boolean r1 = r1.contains(r2)
            r0.VK_QCOM_render_pass_transform = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_QCOM_rotated_copy_commands"
            boolean r1 = r1.contains(r2)
            r0.VK_QCOM_rotated_copy_commands = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_QCOM_tile_properties(r1, r2, r3)
            r0.VK_QCOM_tile_properties = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_QCOM_ycbcr_degamma"
            boolean r1 = r1.contains(r2)
            r0.VK_QCOM_ycbcr_degamma = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_SEC_amigo_profiling"
            boolean r1 = r1.contains(r2)
            r0.VK_SEC_amigo_profiling = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "STD_vulkan_video_codec_h264"
            boolean r1 = r1.contains(r2)
            r0.STD_vulkan_video_codec_h264 = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "STD_vulkan_video_codec_h265"
            boolean r1 = r1.contains(r2)
            r0.STD_vulkan_video_codec_h265 = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            boolean r1 = check_VALVE_descriptor_set_host_mapping(r1, r2, r3)
            r0.VK_VALVE_descriptor_set_host_mapping = r1
            r0 = r5
            r1 = r9
            java.lang.String r2 = "VK_VALVE_mutable_descriptor_type"
            boolean r1 = r1.contains(r2)
            r0.VK_VALVE_mutable_descriptor_type = r1
            r0 = r5
            r1 = r10
            r2 = 0
            r1 = r1[r2]
            r0.vkGetDeviceProcAddr = r1
            r0 = r5
            r1 = r10
            r2 = 1
            r1 = r1[r2]
            r0.vkDestroyDevice = r1
            r0 = r5
            r1 = r10
            r2 = 2
            r1 = r1[r2]
            r0.vkGetDeviceQueue = r1
            r0 = r5
            r1 = r10
            r2 = 3
            r1 = r1[r2]
            r0.vkQueueSubmit = r1
            r0 = r5
            r1 = r10
            r2 = 4
            r1 = r1[r2]
            r0.vkQueueWaitIdle = r1
            r0 = r5
            r1 = r10
            r2 = 5
            r1 = r1[r2]
            r0.vkDeviceWaitIdle = r1
            r0 = r5
            r1 = r10
            r2 = 6
            r1 = r1[r2]
            r0.vkAllocateMemory = r1
            r0 = r5
            r1 = r10
            r2 = 7
            r1 = r1[r2]
            r0.vkFreeMemory = r1
            r0 = r5
            r1 = r10
            r2 = 8
            r1 = r1[r2]
            r0.vkMapMemory = r1
            r0 = r5
            r1 = r10
            r2 = 9
            r1 = r1[r2]
            r0.vkUnmapMemory = r1
            r0 = r5
            r1 = r10
            r2 = 10
            r1 = r1[r2]
            r0.vkFlushMappedMemoryRanges = r1
            r0 = r5
            r1 = r10
            r2 = 11
            r1 = r1[r2]
            r0.vkInvalidateMappedMemoryRanges = r1
            r0 = r5
            r1 = r10
            r2 = 12
            r1 = r1[r2]
            r0.vkGetDeviceMemoryCommitment = r1
            r0 = r5
            r1 = r10
            r2 = 13
            r1 = r1[r2]
            r0.vkBindBufferMemory = r1
            r0 = r5
            r1 = r10
            r2 = 14
            r1 = r1[r2]
            r0.vkBindImageMemory = r1
            r0 = r5
            r1 = r10
            r2 = 15
            r1 = r1[r2]
            r0.vkGetBufferMemoryRequirements = r1
            r0 = r5
            r1 = r10
            r2 = 16
            r1 = r1[r2]
            r0.vkGetImageMemoryRequirements = r1
            r0 = r5
            r1 = r10
            r2 = 17
            r1 = r1[r2]
            r0.vkGetImageSparseMemoryRequirements = r1
            r0 = r5
            r1 = r10
            r2 = 18
            r1 = r1[r2]
            r0.vkQueueBindSparse = r1
            r0 = r5
            r1 = r10
            r2 = 19
            r1 = r1[r2]
            r0.vkCreateFence = r1
            r0 = r5
            r1 = r10
            r2 = 20
            r1 = r1[r2]
            r0.vkDestroyFence = r1
            r0 = r5
            r1 = r10
            r2 = 21
            r1 = r1[r2]
            r0.vkResetFences = r1
            r0 = r5
            r1 = r10
            r2 = 22
            r1 = r1[r2]
            r0.vkGetFenceStatus = r1
            r0 = r5
            r1 = r10
            r2 = 23
            r1 = r1[r2]
            r0.vkWaitForFences = r1
            r0 = r5
            r1 = r10
            r2 = 24
            r1 = r1[r2]
            r0.vkCreateSemaphore = r1
            r0 = r5
            r1 = r10
            r2 = 25
            r1 = r1[r2]
            r0.vkDestroySemaphore = r1
            r0 = r5
            r1 = r10
            r2 = 26
            r1 = r1[r2]
            r0.vkCreateEvent = r1
            r0 = r5
            r1 = r10
            r2 = 27
            r1 = r1[r2]
            r0.vkDestroyEvent = r1
            r0 = r5
            r1 = r10
            r2 = 28
            r1 = r1[r2]
            r0.vkGetEventStatus = r1
            r0 = r5
            r1 = r10
            r2 = 29
            r1 = r1[r2]
            r0.vkSetEvent = r1
            r0 = r5
            r1 = r10
            r2 = 30
            r1 = r1[r2]
            r0.vkResetEvent = r1
            r0 = r5
            r1 = r10
            r2 = 31
            r1 = r1[r2]
            r0.vkCreateQueryPool = r1
            r0 = r5
            r1 = r10
            r2 = 32
            r1 = r1[r2]
            r0.vkDestroyQueryPool = r1
            r0 = r5
            r1 = r10
            r2 = 33
            r1 = r1[r2]
            r0.vkGetQueryPoolResults = r1
            r0 = r5
            r1 = r10
            r2 = 34
            r1 = r1[r2]
            r0.vkCreateBuffer = r1
            r0 = r5
            r1 = r10
            r2 = 35
            r1 = r1[r2]
            r0.vkDestroyBuffer = r1
            r0 = r5
            r1 = r10
            r2 = 36
            r1 = r1[r2]
            r0.vkCreateBufferView = r1
            r0 = r5
            r1 = r10
            r2 = 37
            r1 = r1[r2]
            r0.vkDestroyBufferView = r1
            r0 = r5
            r1 = r10
            r2 = 38
            r1 = r1[r2]
            r0.vkCreateImage = r1
            r0 = r5
            r1 = r10
            r2 = 39
            r1 = r1[r2]
            r0.vkDestroyImage = r1
            r0 = r5
            r1 = r10
            r2 = 40
            r1 = r1[r2]
            r0.vkGetImageSubresourceLayout = r1
            r0 = r5
            r1 = r10
            r2 = 41
            r1 = r1[r2]
            r0.vkCreateImageView = r1
            r0 = r5
            r1 = r10
            r2 = 42
            r1 = r1[r2]
            r0.vkDestroyImageView = r1
            r0 = r5
            r1 = r10
            r2 = 43
            r1 = r1[r2]
            r0.vkCreateShaderModule = r1
            r0 = r5
            r1 = r10
            r2 = 44
            r1 = r1[r2]
            r0.vkDestroyShaderModule = r1
            r0 = r5
            r1 = r10
            r2 = 45
            r1 = r1[r2]
            r0.vkCreatePipelineCache = r1
            r0 = r5
            r1 = r10
            r2 = 46
            r1 = r1[r2]
            r0.vkDestroyPipelineCache = r1
            r0 = r5
            r1 = r10
            r2 = 47
            r1 = r1[r2]
            r0.vkGetPipelineCacheData = r1
            r0 = r5
            r1 = r10
            r2 = 48
            r1 = r1[r2]
            r0.vkMergePipelineCaches = r1
            r0 = r5
            r1 = r10
            r2 = 49
            r1 = r1[r2]
            r0.vkCreateGraphicsPipelines = r1
            r0 = r5
            r1 = r10
            r2 = 50
            r1 = r1[r2]
            r0.vkCreateComputePipelines = r1
            r0 = r5
            r1 = r10
            r2 = 51
            r1 = r1[r2]
            r0.vkDestroyPipeline = r1
            r0 = r5
            r1 = r10
            r2 = 52
            r1 = r1[r2]
            r0.vkCreatePipelineLayout = r1
            r0 = r5
            r1 = r10
            r2 = 53
            r1 = r1[r2]
            r0.vkDestroyPipelineLayout = r1
            r0 = r5
            r1 = r10
            r2 = 54
            r1 = r1[r2]
            r0.vkCreateSampler = r1
            r0 = r5
            r1 = r10
            r2 = 55
            r1 = r1[r2]
            r0.vkDestroySampler = r1
            r0 = r5
            r1 = r10
            r2 = 56
            r1 = r1[r2]
            r0.vkCreateDescriptorSetLayout = r1
            r0 = r5
            r1 = r10
            r2 = 57
            r1 = r1[r2]
            r0.vkDestroyDescriptorSetLayout = r1
            r0 = r5
            r1 = r10
            r2 = 58
            r1 = r1[r2]
            r0.vkCreateDescriptorPool = r1
            r0 = r5
            r1 = r10
            r2 = 59
            r1 = r1[r2]
            r0.vkDestroyDescriptorPool = r1
            r0 = r5
            r1 = r10
            r2 = 60
            r1 = r1[r2]
            r0.vkResetDescriptorPool = r1
            r0 = r5
            r1 = r10
            r2 = 61
            r1 = r1[r2]
            r0.vkAllocateDescriptorSets = r1
            r0 = r5
            r1 = r10
            r2 = 62
            r1 = r1[r2]
            r0.vkFreeDescriptorSets = r1
            r0 = r5
            r1 = r10
            r2 = 63
            r1 = r1[r2]
            r0.vkUpdateDescriptorSets = r1
            r0 = r5
            r1 = r10
            r2 = 64
            r1 = r1[r2]
            r0.vkCreateFramebuffer = r1
            r0 = r5
            r1 = r10
            r2 = 65
            r1 = r1[r2]
            r0.vkDestroyFramebuffer = r1
            r0 = r5
            r1 = r10
            r2 = 66
            r1 = r1[r2]
            r0.vkCreateRenderPass = r1
            r0 = r5
            r1 = r10
            r2 = 67
            r1 = r1[r2]
            r0.vkDestroyRenderPass = r1
            r0 = r5
            r1 = r10
            r2 = 68
            r1 = r1[r2]
            r0.vkGetRenderAreaGranularity = r1
            r0 = r5
            r1 = r10
            r2 = 69
            r1 = r1[r2]
            r0.vkCreateCommandPool = r1
            r0 = r5
            r1 = r10
            r2 = 70
            r1 = r1[r2]
            r0.vkDestroyCommandPool = r1
            r0 = r5
            r1 = r10
            r2 = 71
            r1 = r1[r2]
            r0.vkResetCommandPool = r1
            r0 = r5
            r1 = r10
            r2 = 72
            r1 = r1[r2]
            r0.vkAllocateCommandBuffers = r1
            r0 = r5
            r1 = r10
            r2 = 73
            r1 = r1[r2]
            r0.vkFreeCommandBuffers = r1
            r0 = r5
            r1 = r10
            r2 = 74
            r1 = r1[r2]
            r0.vkBeginCommandBuffer = r1
            r0 = r5
            r1 = r10
            r2 = 75
            r1 = r1[r2]
            r0.vkEndCommandBuffer = r1
            r0 = r5
            r1 = r10
            r2 = 76
            r1 = r1[r2]
            r0.vkResetCommandBuffer = r1
            r0 = r5
            r1 = r10
            r2 = 77
            r1 = r1[r2]
            r0.vkCmdBindPipeline = r1
            r0 = r5
            r1 = r10
            r2 = 78
            r1 = r1[r2]
            r0.vkCmdSetViewport = r1
            r0 = r5
            r1 = r10
            r2 = 79
            r1 = r1[r2]
            r0.vkCmdSetScissor = r1
            r0 = r5
            r1 = r10
            r2 = 80
            r1 = r1[r2]
            r0.vkCmdSetLineWidth = r1
            r0 = r5
            r1 = r10
            r2 = 81
            r1 = r1[r2]
            r0.vkCmdSetDepthBias = r1
            r0 = r5
            r1 = r10
            r2 = 82
            r1 = r1[r2]
            r0.vkCmdSetBlendConstants = r1
            r0 = r5
            r1 = r10
            r2 = 83
            r1 = r1[r2]
            r0.vkCmdSetDepthBounds = r1
            r0 = r5
            r1 = r10
            r2 = 84
            r1 = r1[r2]
            r0.vkCmdSetStencilCompareMask = r1
            r0 = r5
            r1 = r10
            r2 = 85
            r1 = r1[r2]
            r0.vkCmdSetStencilWriteMask = r1
            r0 = r5
            r1 = r10
            r2 = 86
            r1 = r1[r2]
            r0.vkCmdSetStencilReference = r1
            r0 = r5
            r1 = r10
            r2 = 87
            r1 = r1[r2]
            r0.vkCmdBindDescriptorSets = r1
            r0 = r5
            r1 = r10
            r2 = 88
            r1 = r1[r2]
            r0.vkCmdBindIndexBuffer = r1
            r0 = r5
            r1 = r10
            r2 = 89
            r1 = r1[r2]
            r0.vkCmdBindVertexBuffers = r1
            r0 = r5
            r1 = r10
            r2 = 90
            r1 = r1[r2]
            r0.vkCmdDraw = r1
            r0 = r5
            r1 = r10
            r2 = 91
            r1 = r1[r2]
            r0.vkCmdDrawIndexed = r1
            r0 = r5
            r1 = r10
            r2 = 92
            r1 = r1[r2]
            r0.vkCmdDrawIndirect = r1
            r0 = r5
            r1 = r10
            r2 = 93
            r1 = r1[r2]
            r0.vkCmdDrawIndexedIndirect = r1
            r0 = r5
            r1 = r10
            r2 = 94
            r1 = r1[r2]
            r0.vkCmdDispatch = r1
            r0 = r5
            r1 = r10
            r2 = 95
            r1 = r1[r2]
            r0.vkCmdDispatchIndirect = r1
            r0 = r5
            r1 = r10
            r2 = 96
            r1 = r1[r2]
            r0.vkCmdCopyBuffer = r1
            r0 = r5
            r1 = r10
            r2 = 97
            r1 = r1[r2]
            r0.vkCmdCopyImage = r1
            r0 = r5
            r1 = r10
            r2 = 98
            r1 = r1[r2]
            r0.vkCmdBlitImage = r1
            r0 = r5
            r1 = r10
            r2 = 99
            r1 = r1[r2]
            r0.vkCmdCopyBufferToImage = r1
            r0 = r5
            r1 = r10
            r2 = 100
            r1 = r1[r2]
            r0.vkCmdCopyImageToBuffer = r1
            r0 = r5
            r1 = r10
            r2 = 101(0x65, float:1.42E-43)
            r1 = r1[r2]
            r0.vkCmdUpdateBuffer = r1
            r0 = r5
            r1 = r10
            r2 = 102(0x66, float:1.43E-43)
            r1 = r1[r2]
            r0.vkCmdFillBuffer = r1
            r0 = r5
            r1 = r10
            r2 = 103(0x67, float:1.44E-43)
            r1 = r1[r2]
            r0.vkCmdClearColorImage = r1
            r0 = r5
            r1 = r10
            r2 = 104(0x68, float:1.46E-43)
            r1 = r1[r2]
            r0.vkCmdClearDepthStencilImage = r1
            r0 = r5
            r1 = r10
            r2 = 105(0x69, float:1.47E-43)
            r1 = r1[r2]
            r0.vkCmdClearAttachments = r1
            r0 = r5
            r1 = r10
            r2 = 106(0x6a, float:1.49E-43)
            r1 = r1[r2]
            r0.vkCmdResolveImage = r1
            r0 = r5
            r1 = r10
            r2 = 107(0x6b, float:1.5E-43)
            r1 = r1[r2]
            r0.vkCmdSetEvent = r1
            r0 = r5
            r1 = r10
            r2 = 108(0x6c, float:1.51E-43)
            r1 = r1[r2]
            r0.vkCmdResetEvent = r1
            r0 = r5
            r1 = r10
            r2 = 109(0x6d, float:1.53E-43)
            r1 = r1[r2]
            r0.vkCmdWaitEvents = r1
            r0 = r5
            r1 = r10
            r2 = 110(0x6e, float:1.54E-43)
            r1 = r1[r2]
            r0.vkCmdPipelineBarrier = r1
            r0 = r5
            r1 = r10
            r2 = 111(0x6f, float:1.56E-43)
            r1 = r1[r2]
            r0.vkCmdBeginQuery = r1
            r0 = r5
            r1 = r10
            r2 = 112(0x70, float:1.57E-43)
            r1 = r1[r2]
            r0.vkCmdEndQuery = r1
            r0 = r5
            r1 = r10
            r2 = 113(0x71, float:1.58E-43)
            r1 = r1[r2]
            r0.vkCmdResetQueryPool = r1
            r0 = r5
            r1 = r10
            r2 = 114(0x72, float:1.6E-43)
            r1 = r1[r2]
            r0.vkCmdWriteTimestamp = r1
            r0 = r5
            r1 = r10
            r2 = 115(0x73, float:1.61E-43)
            r1 = r1[r2]
            r0.vkCmdCopyQueryPoolResults = r1
            r0 = r5
            r1 = r10
            r2 = 116(0x74, float:1.63E-43)
            r1 = r1[r2]
            r0.vkCmdPushConstants = r1
            r0 = r5
            r1 = r10
            r2 = 117(0x75, float:1.64E-43)
            r1 = r1[r2]
            r0.vkCmdBeginRenderPass = r1
            r0 = r5
            r1 = r10
            r2 = 118(0x76, float:1.65E-43)
            r1 = r1[r2]
            r0.vkCmdNextSubpass = r1
            r0 = r5
            r1 = r10
            r2 = 119(0x77, float:1.67E-43)
            r1 = r1[r2]
            r0.vkCmdEndRenderPass = r1
            r0 = r5
            r1 = r10
            r2 = 120(0x78, float:1.68E-43)
            r1 = r1[r2]
            r0.vkCmdExecuteCommands = r1
            r0 = r5
            r1 = r10
            r2 = 121(0x79, float:1.7E-43)
            r1 = r1[r2]
            r0.vkBindBufferMemory2 = r1
            r0 = r5
            r1 = r10
            r2 = 122(0x7a, float:1.71E-43)
            r1 = r1[r2]
            r0.vkBindImageMemory2 = r1
            r0 = r5
            r1 = r10
            r2 = 123(0x7b, float:1.72E-43)
            r1 = r1[r2]
            r0.vkGetDeviceGroupPeerMemoryFeatures = r1
            r0 = r5
            r1 = r10
            r2 = 124(0x7c, float:1.74E-43)
            r1 = r1[r2]
            r0.vkCmdSetDeviceMask = r1
            r0 = r5
            r1 = r10
            r2 = 125(0x7d, float:1.75E-43)
            r1 = r1[r2]
            r0.vkCmdDispatchBase = r1
            r0 = r5
            r1 = r10
            r2 = 126(0x7e, float:1.77E-43)
            r1 = r1[r2]
            r0.vkGetImageMemoryRequirements2 = r1
            r0 = r5
            r1 = r10
            r2 = 127(0x7f, float:1.78E-43)
            r1 = r1[r2]
            r0.vkGetBufferMemoryRequirements2 = r1
            r0 = r5
            r1 = r10
            r2 = 128(0x80, float:1.8E-43)
            r1 = r1[r2]
            r0.vkGetImageSparseMemoryRequirements2 = r1
            r0 = r5
            r1 = r10
            r2 = 129(0x81, float:1.81E-43)
            r1 = r1[r2]
            r0.vkTrimCommandPool = r1
            r0 = r5
            r1 = r10
            r2 = 130(0x82, float:1.82E-43)
            r1 = r1[r2]
            r0.vkGetDeviceQueue2 = r1
            r0 = r5
            r1 = r10
            r2 = 131(0x83, float:1.84E-43)
            r1 = r1[r2]
            r0.vkCreateSamplerYcbcrConversion = r1
            r0 = r5
            r1 = r10
            r2 = 132(0x84, float:1.85E-43)
            r1 = r1[r2]
            r0.vkDestroySamplerYcbcrConversion = r1
            r0 = r5
            r1 = r10
            r2 = 133(0x85, float:1.86E-43)
            r1 = r1[r2]
            r0.vkCreateDescriptorUpdateTemplate = r1
            r0 = r5
            r1 = r10
            r2 = 134(0x86, float:1.88E-43)
            r1 = r1[r2]
            r0.vkDestroyDescriptorUpdateTemplate = r1
            r0 = r5
            r1 = r10
            r2 = 135(0x87, float:1.89E-43)
            r1 = r1[r2]
            r0.vkUpdateDescriptorSetWithTemplate = r1
            r0 = r5
            r1 = r10
            r2 = 136(0x88, float:1.9E-43)
            r1 = r1[r2]
            r0.vkGetDescriptorSetLayoutSupport = r1
            r0 = r5
            r1 = r10
            r2 = 137(0x89, float:1.92E-43)
            r1 = r1[r2]
            r0.vkCmdDrawIndirectCount = r1
            r0 = r5
            r1 = r10
            r2 = 138(0x8a, float:1.93E-43)
            r1 = r1[r2]
            r0.vkCmdDrawIndexedIndirectCount = r1
            r0 = r5
            r1 = r10
            r2 = 139(0x8b, float:1.95E-43)
            r1 = r1[r2]
            r0.vkCreateRenderPass2 = r1
            r0 = r5
            r1 = r10
            r2 = 140(0x8c, float:1.96E-43)
            r1 = r1[r2]
            r0.vkCmdBeginRenderPass2 = r1
            r0 = r5
            r1 = r10
            r2 = 141(0x8d, float:1.98E-43)
            r1 = r1[r2]
            r0.vkCmdNextSubpass2 = r1
            r0 = r5
            r1 = r10
            r2 = 142(0x8e, float:1.99E-43)
            r1 = r1[r2]
            r0.vkCmdEndRenderPass2 = r1
            r0 = r5
            r1 = r10
            r2 = 143(0x8f, float:2.0E-43)
            r1 = r1[r2]
            r0.vkResetQueryPool = r1
            r0 = r5
            r1 = r10
            r2 = 144(0x90, float:2.02E-43)
            r1 = r1[r2]
            r0.vkGetSemaphoreCounterValue = r1
            r0 = r5
            r1 = r10
            r2 = 145(0x91, float:2.03E-43)
            r1 = r1[r2]
            r0.vkWaitSemaphores = r1
            r0 = r5
            r1 = r10
            r2 = 146(0x92, float:2.05E-43)
            r1 = r1[r2]
            r0.vkSignalSemaphore = r1
            r0 = r5
            r1 = r10
            r2 = 147(0x93, float:2.06E-43)
            r1 = r1[r2]
            r0.vkGetBufferDeviceAddress = r1
            r0 = r5
            r1 = r10
            r2 = 148(0x94, float:2.07E-43)
            r1 = r1[r2]
            r0.vkGetBufferOpaqueCaptureAddress = r1
            r0 = r5
            r1 = r10
            r2 = 149(0x95, float:2.09E-43)
            r1 = r1[r2]
            r0.vkGetDeviceMemoryOpaqueCaptureAddress = r1
            r0 = r5
            r1 = r10
            r2 = 150(0x96, float:2.1E-43)
            r1 = r1[r2]
            r0.vkCreatePrivateDataSlot = r1
            r0 = r5
            r1 = r10
            r2 = 151(0x97, float:2.12E-43)
            r1 = r1[r2]
            r0.vkDestroyPrivateDataSlot = r1
            r0 = r5
            r1 = r10
            r2 = 152(0x98, float:2.13E-43)
            r1 = r1[r2]
            r0.vkSetPrivateData = r1
            r0 = r5
            r1 = r10
            r2 = 153(0x99, float:2.14E-43)
            r1 = r1[r2]
            r0.vkGetPrivateData = r1
            r0 = r5
            r1 = r10
            r2 = 154(0x9a, float:2.16E-43)
            r1 = r1[r2]
            r0.vkCmdSetEvent2 = r1
            r0 = r5
            r1 = r10
            r2 = 155(0x9b, float:2.17E-43)
            r1 = r1[r2]
            r0.vkCmdResetEvent2 = r1
            r0 = r5
            r1 = r10
            r2 = 156(0x9c, float:2.19E-43)
            r1 = r1[r2]
            r0.vkCmdWaitEvents2 = r1
            r0 = r5
            r1 = r10
            r2 = 157(0x9d, float:2.2E-43)
            r1 = r1[r2]
            r0.vkCmdPipelineBarrier2 = r1
            r0 = r5
            r1 = r10
            r2 = 158(0x9e, float:2.21E-43)
            r1 = r1[r2]
            r0.vkCmdWriteTimestamp2 = r1
            r0 = r5
            r1 = r10
            r2 = 159(0x9f, float:2.23E-43)
            r1 = r1[r2]
            r0.vkQueueSubmit2 = r1
            r0 = r5
            r1 = r10
            r2 = 160(0xa0, float:2.24E-43)
            r1 = r1[r2]
            r0.vkCmdCopyBuffer2 = r1
            r0 = r5
            r1 = r10
            r2 = 161(0xa1, float:2.26E-43)
            r1 = r1[r2]
            r0.vkCmdCopyImage2 = r1
            r0 = r5
            r1 = r10
            r2 = 162(0xa2, float:2.27E-43)
            r1 = r1[r2]
            r0.vkCmdCopyBufferToImage2 = r1
            r0 = r5
            r1 = r10
            r2 = 163(0xa3, float:2.28E-43)
            r1 = r1[r2]
            r0.vkCmdCopyImageToBuffer2 = r1
            r0 = r5
            r1 = r10
            r2 = 164(0xa4, float:2.3E-43)
            r1 = r1[r2]
            r0.vkCmdBlitImage2 = r1
            r0 = r5
            r1 = r10
            r2 = 165(0xa5, float:2.31E-43)
            r1 = r1[r2]
            r0.vkCmdResolveImage2 = r1
            r0 = r5
            r1 = r10
            r2 = 166(0xa6, float:2.33E-43)
            r1 = r1[r2]
            r0.vkCmdBeginRendering = r1
            r0 = r5
            r1 = r10
            r2 = 167(0xa7, float:2.34E-43)
            r1 = r1[r2]
            r0.vkCmdEndRendering = r1
            r0 = r5
            r1 = r10
            r2 = 168(0xa8, float:2.35E-43)
            r1 = r1[r2]
            r0.vkCmdSetCullMode = r1
            r0 = r5
            r1 = r10
            r2 = 169(0xa9, float:2.37E-43)
            r1 = r1[r2]
            r0.vkCmdSetFrontFace = r1
            r0 = r5
            r1 = r10
            r2 = 170(0xaa, float:2.38E-43)
            r1 = r1[r2]
            r0.vkCmdSetPrimitiveTopology = r1
            r0 = r5
            r1 = r10
            r2 = 171(0xab, float:2.4E-43)
            r1 = r1[r2]
            r0.vkCmdSetViewportWithCount = r1
            r0 = r5
            r1 = r10
            r2 = 172(0xac, float:2.41E-43)
            r1 = r1[r2]
            r0.vkCmdSetScissorWithCount = r1
            r0 = r5
            r1 = r10
            r2 = 173(0xad, float:2.42E-43)
            r1 = r1[r2]
            r0.vkCmdBindVertexBuffers2 = r1
            r0 = r5
            r1 = r10
            r2 = 174(0xae, float:2.44E-43)
            r1 = r1[r2]
            r0.vkCmdSetDepthTestEnable = r1
            r0 = r5
            r1 = r10
            r2 = 175(0xaf, float:2.45E-43)
            r1 = r1[r2]
            r0.vkCmdSetDepthWriteEnable = r1
            r0 = r5
            r1 = r10
            r2 = 176(0xb0, float:2.47E-43)
            r1 = r1[r2]
            r0.vkCmdSetDepthCompareOp = r1
            r0 = r5
            r1 = r10
            r2 = 177(0xb1, float:2.48E-43)
            r1 = r1[r2]
            r0.vkCmdSetDepthBoundsTestEnable = r1
            r0 = r5
            r1 = r10
            r2 = 178(0xb2, float:2.5E-43)
            r1 = r1[r2]
            r0.vkCmdSetStencilTestEnable = r1
            r0 = r5
            r1 = r10
            r2 = 179(0xb3, float:2.51E-43)
            r1 = r1[r2]
            r0.vkCmdSetStencilOp = r1
            r0 = r5
            r1 = r10
            r2 = 180(0xb4, float:2.52E-43)
            r1 = r1[r2]
            r0.vkCmdSetRasterizerDiscardEnable = r1
            r0 = r5
            r1 = r10
            r2 = 181(0xb5, float:2.54E-43)
            r1 = r1[r2]
            r0.vkCmdSetDepthBiasEnable = r1
            r0 = r5
            r1 = r10
            r2 = 182(0xb6, float:2.55E-43)
            r1 = r1[r2]
            r0.vkCmdSetPrimitiveRestartEnable = r1
            r0 = r5
            r1 = r10
            r2 = 183(0xb7, float:2.56E-43)
            r1 = r1[r2]
            r0.vkGetDeviceBufferMemoryRequirements = r1
            r0 = r5
            r1 = r10
            r2 = 184(0xb8, float:2.58E-43)
            r1 = r1[r2]
            r0.vkGetDeviceImageMemoryRequirements = r1
            r0 = r5
            r1 = r10
            r2 = 185(0xb9, float:2.59E-43)
            r1 = r1[r2]
            r0.vkGetDeviceImageSparseMemoryRequirements = r1
            r0 = r5
            r1 = r10
            r2 = 186(0xba, float:2.6E-43)
            r1 = r1[r2]
            r0.vkCmdWriteBufferMarkerAMD = r1
            r0 = r5
            r1 = r10
            r2 = 187(0xbb, float:2.62E-43)
            r1 = r1[r2]
            r0.vkSetLocalDimmingAMD = r1
            r0 = r5
            r1 = r10
            r2 = 188(0xbc, float:2.63E-43)
            r1 = r1[r2]
            r0.vkCmdDrawIndirectCountAMD = r1
            r0 = r5
            r1 = r10
            r2 = 189(0xbd, float:2.65E-43)
            r1 = r1[r2]
            r0.vkCmdDrawIndexedIndirectCountAMD = r1
            r0 = r5
            r1 = r10
            r2 = 190(0xbe, float:2.66E-43)
            r1 = r1[r2]
            r0.vkGetShaderInfoAMD = r1
            r0 = r5
            r1 = r10
            r2 = 191(0xbf, float:2.68E-43)
            r1 = r1[r2]
            r0.vkCreateExecutionGraphPipelinesAMDX = r1
            r0 = r5
            r1 = r10
            r2 = 192(0xc0, float:2.69E-43)
            r1 = r1[r2]
            r0.vkGetExecutionGraphPipelineScratchSizeAMDX = r1
            r0 = r5
            r1 = r10
            r2 = 193(0xc1, float:2.7E-43)
            r1 = r1[r2]
            r0.vkGetExecutionGraphPipelineNodeIndexAMDX = r1
            r0 = r5
            r1 = r10
            r2 = 194(0xc2, float:2.72E-43)
            r1 = r1[r2]
            r0.vkCmdInitializeGraphScratchMemoryAMDX = r1
            r0 = r5
            r1 = r10
            r2 = 195(0xc3, float:2.73E-43)
            r1 = r1[r2]
            r0.vkCmdDispatchGraphAMDX = r1
            r0 = r5
            r1 = r10
            r2 = 196(0xc4, float:2.75E-43)
            r1 = r1[r2]
            r0.vkCmdDispatchGraphIndirectAMDX = r1
            r0 = r5
            r1 = r10
            r2 = 197(0xc5, float:2.76E-43)
            r1 = r1[r2]
            r0.vkCmdDispatchGraphIndirectCountAMDX = r1
            r0 = r5
            r1 = r10
            r2 = 198(0xc6, float:2.77E-43)
            r1 = r1[r2]
            r0.vkGetAndroidHardwareBufferPropertiesANDROID = r1
            r0 = r5
            r1 = r10
            r2 = 199(0xc7, float:2.79E-43)
            r1 = r1[r2]
            r0.vkGetMemoryAndroidHardwareBufferANDROID = r1
            r0 = r5
            r1 = r10
            r2 = 200(0xc8, float:2.8E-43)
            r1 = r1[r2]
            r0.vkCmdSetAttachmentFeedbackLoopEnableEXT = r1
            r0 = r5
            r1 = r10
            r2 = 201(0xc9, float:2.82E-43)
            r1 = r1[r2]
            r0.vkGetBufferDeviceAddressEXT = r1
            r0 = r5
            r1 = r10
            r2 = 202(0xca, float:2.83E-43)
            r1 = r1[r2]
            r0.vkGetCalibratedTimestampsEXT = r1
            r0 = r5
            r1 = r10
            r2 = 203(0xcb, float:2.84E-43)
            r1 = r1[r2]
            r0.vkCmdSetColorWriteEnableEXT = r1
            r0 = r5
            r1 = r10
            r2 = 204(0xcc, float:2.86E-43)
            r1 = r1[r2]
            r0.vkCmdBeginConditionalRenderingEXT = r1
            r0 = r5
            r1 = r10
            r2 = 205(0xcd, float:2.87E-43)
            r1 = r1[r2]
            r0.vkCmdEndConditionalRenderingEXT = r1
            r0 = r5
            r1 = r10
            r2 = 206(0xce, float:2.89E-43)
            r1 = r1[r2]
            r0.vkDebugMarkerSetObjectTagEXT = r1
            r0 = r5
            r1 = r10
            r2 = 207(0xcf, float:2.9E-43)
            r1 = r1[r2]
            r0.vkDebugMarkerSetObjectNameEXT = r1
            r0 = r5
            r1 = r10
            r2 = 208(0xd0, float:2.91E-43)
            r1 = r1[r2]
            r0.vkCmdDebugMarkerBeginEXT = r1
            r0 = r5
            r1 = r10
            r2 = 209(0xd1, float:2.93E-43)
            r1 = r1[r2]
            r0.vkCmdDebugMarkerEndEXT = r1
            r0 = r5
            r1 = r10
            r2 = 210(0xd2, float:2.94E-43)
            r1 = r1[r2]
            r0.vkCmdDebugMarkerInsertEXT = r1
            r0 = r5
            r1 = r10
            r2 = 211(0xd3, float:2.96E-43)
            r1 = r1[r2]
            r0.vkCmdSetDepthBias2EXT = r1
            r0 = r5
            r1 = r10
            r2 = 212(0xd4, float:2.97E-43)
            r1 = r1[r2]
            r0.vkGetDescriptorSetLayoutSizeEXT = r1
            r0 = r5
            r1 = r10
            r2 = 213(0xd5, float:2.98E-43)
            r1 = r1[r2]
            r0.vkGetDescriptorSetLayoutBindingOffsetEXT = r1
            r0 = r5
            r1 = r10
            r2 = 214(0xd6, float:3.0E-43)
            r1 = r1[r2]
            r0.vkGetDescriptorEXT = r1
            r0 = r5
            r1 = r10
            r2 = 215(0xd7, float:3.01E-43)
            r1 = r1[r2]
            r0.vkCmdBindDescriptorBuffersEXT = r1
            r0 = r5
            r1 = r10
            r2 = 216(0xd8, float:3.03E-43)
            r1 = r1[r2]
            r0.vkCmdSetDescriptorBufferOffsetsEXT = r1
            r0 = r5
            r1 = r10
            r2 = 217(0xd9, float:3.04E-43)
            r1 = r1[r2]
            r0.vkCmdBindDescriptorBufferEmbeddedSamplersEXT = r1
            r0 = r5
            r1 = r10
            r2 = 218(0xda, float:3.05E-43)
            r1 = r1[r2]
            r0.vkGetBufferOpaqueCaptureDescriptorDataEXT = r1
            r0 = r5
            r1 = r10
            r2 = 219(0xdb, float:3.07E-43)
            r1 = r1[r2]
            r0.vkGetImageOpaqueCaptureDescriptorDataEXT = r1
            r0 = r5
            r1 = r10
            r2 = 220(0xdc, float:3.08E-43)
            r1 = r1[r2]
            r0.vkGetImageViewOpaqueCaptureDescriptorDataEXT = r1
            r0 = r5
            r1 = r10
            r2 = 221(0xdd, float:3.1E-43)
            r1 = r1[r2]
            r0.vkGetSamplerOpaqueCaptureDescriptorDataEXT = r1
            r0 = r5
            r1 = r10
            r2 = 222(0xde, float:3.11E-43)
            r1 = r1[r2]
            r0.vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT = r1
            r0 = r5
            r1 = r10
            r2 = 223(0xdf, float:3.12E-43)
            r1 = r1[r2]
            r0.vkGetDeviceFaultInfoEXT = r1
            r0 = r5
            r1 = r10
            r2 = 224(0xe0, float:3.14E-43)
            r1 = r1[r2]
            r0.vkCmdSetDiscardRectangleEXT = r1
            r0 = r5
            r1 = r10
            r2 = 225(0xe1, float:3.15E-43)
            r1 = r1[r2]
            r0.vkCmdSetDiscardRectangleEnableEXT = r1
            r0 = r5
            r1 = r10
            r2 = 226(0xe2, float:3.17E-43)
            r1 = r1[r2]
            r0.vkCmdSetDiscardRectangleModeEXT = r1
            r0 = r5
            r1 = r10
            r2 = 227(0xe3, float:3.18E-43)
            r1 = r1[r2]
            r0.vkDisplayPowerControlEXT = r1
            r0 = r5
            r1 = r10
            r2 = 228(0xe4, float:3.2E-43)
            r1 = r1[r2]
            r0.vkRegisterDeviceEventEXT = r1
            r0 = r5
            r1 = r10
            r2 = 229(0xe5, float:3.21E-43)
            r1 = r1[r2]
            r0.vkRegisterDisplayEventEXT = r1
            r0 = r5
            r1 = r10
            r2 = 230(0xe6, float:3.22E-43)
            r1 = r1[r2]
            r0.vkGetSwapchainCounterEXT = r1
            r0 = r5
            r1 = r10
            r2 = 231(0xe7, float:3.24E-43)
            r1 = r1[r2]
            r0.vkCmdSetCullModeEXT = r1
            r0 = r5
            r1 = r10
            r2 = 232(0xe8, float:3.25E-43)
            r1 = r1[r2]
            r0.vkCmdSetFrontFaceEXT = r1
            r0 = r5
            r1 = r10
            r2 = 233(0xe9, float:3.27E-43)
            r1 = r1[r2]
            r0.vkCmdSetPrimitiveTopologyEXT = r1
            r0 = r5
            r1 = r10
            r2 = 234(0xea, float:3.28E-43)
            r1 = r1[r2]
            r0.vkCmdSetViewportWithCountEXT = r1
            r0 = r5
            r1 = r10
            r2 = 235(0xeb, float:3.3E-43)
            r1 = r1[r2]
            r0.vkCmdSetScissorWithCountEXT = r1
            r0 = r5
            r1 = r10
            r2 = 236(0xec, float:3.31E-43)
            r1 = r1[r2]
            r0.vkCmdBindVertexBuffers2EXT = r1
            r0 = r5
            r1 = r10
            r2 = 237(0xed, float:3.32E-43)
            r1 = r1[r2]
            r0.vkCmdSetDepthTestEnableEXT = r1
            r0 = r5
            r1 = r10
            r2 = 238(0xee, float:3.34E-43)
            r1 = r1[r2]
            r0.vkCmdSetDepthWriteEnableEXT = r1
            r0 = r5
            r1 = r10
            r2 = 239(0xef, float:3.35E-43)
            r1 = r1[r2]
            r0.vkCmdSetDepthCompareOpEXT = r1
            r0 = r5
            r1 = r10
            r2 = 240(0xf0, float:3.36E-43)
            r1 = r1[r2]
            r0.vkCmdSetDepthBoundsTestEnableEXT = r1
            r0 = r5
            r1 = r10
            r2 = 241(0xf1, float:3.38E-43)
            r1 = r1[r2]
            r0.vkCmdSetStencilTestEnableEXT = r1
            r0 = r5
            r1 = r10
            r2 = 242(0xf2, float:3.39E-43)
            r1 = r1[r2]
            r0.vkCmdSetStencilOpEXT = r1
            r0 = r5
            r1 = r10
            r2 = 243(0xf3, float:3.4E-43)
            r1 = r1[r2]
            r0.vkCmdSetPatchControlPointsEXT = r1
            r0 = r5
            r1 = r10
            r2 = 244(0xf4, float:3.42E-43)
            r1 = r1[r2]
            r0.vkCmdSetRasterizerDiscardEnableEXT = r1
            r0 = r5
            r1 = r10
            r2 = 245(0xf5, float:3.43E-43)
            r1 = r1[r2]
            r0.vkCmdSetDepthBiasEnableEXT = r1
            r0 = r5
            r1 = r10
            r2 = 246(0xf6, float:3.45E-43)
            r1 = r1[r2]
            r0.vkCmdSetLogicOpEXT = r1
            r0 = r5
            r1 = r10
            r2 = 247(0xf7, float:3.46E-43)
            r1 = r1[r2]
            r0.vkCmdSetPrimitiveRestartEnableEXT = r1
            r0 = r5
            r1 = r10
            r2 = 248(0xf8, float:3.48E-43)
            r1 = r1[r2]
            r0.vkCmdSetTessellationDomainOriginEXT = r1
            r0 = r5
            r1 = r10
            r2 = 249(0xf9, float:3.49E-43)
            r1 = r1[r2]
            r0.vkCmdSetDepthClampEnableEXT = r1
            r0 = r5
            r1 = r10
            r2 = 250(0xfa, float:3.5E-43)
            r1 = r1[r2]
            r0.vkCmdSetPolygonModeEXT = r1
            r0 = r5
            r1 = r10
            r2 = 251(0xfb, float:3.52E-43)
            r1 = r1[r2]
            r0.vkCmdSetRasterizationSamplesEXT = r1
            r0 = r5
            r1 = r10
            r2 = 252(0xfc, float:3.53E-43)
            r1 = r1[r2]
            r0.vkCmdSetSampleMaskEXT = r1
            r0 = r5
            r1 = r10
            r2 = 253(0xfd, float:3.55E-43)
            r1 = r1[r2]
            r0.vkCmdSetAlphaToCoverageEnableEXT = r1
            r0 = r5
            r1 = r10
            r2 = 254(0xfe, float:3.56E-43)
            r1 = r1[r2]
            r0.vkCmdSetAlphaToOneEnableEXT = r1
            r0 = r5
            r1 = r10
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1[r2]
            r0.vkCmdSetLogicOpEnableEXT = r1
            r0 = r5
            r1 = r10
            r2 = 256(0x100, float:3.59E-43)
            r1 = r1[r2]
            r0.vkCmdSetColorBlendEnableEXT = r1
            r0 = r5
            r1 = r10
            r2 = 257(0x101, float:3.6E-43)
            r1 = r1[r2]
            r0.vkCmdSetColorBlendEquationEXT = r1
            r0 = r5
            r1 = r10
            r2 = 258(0x102, float:3.62E-43)
            r1 = r1[r2]
            r0.vkCmdSetColorWriteMaskEXT = r1
            r0 = r5
            r1 = r10
            r2 = 259(0x103, float:3.63E-43)
            r1 = r1[r2]
            r0.vkCmdSetRasterizationStreamEXT = r1
            r0 = r5
            r1 = r10
            r2 = 260(0x104, float:3.64E-43)
            r1 = r1[r2]
            r0.vkCmdSetConservativeRasterizationModeEXT = r1
            r0 = r5
            r1 = r10
            r2 = 261(0x105, float:3.66E-43)
            r1 = r1[r2]
            r0.vkCmdSetExtraPrimitiveOverestimationSizeEXT = r1
            r0 = r5
            r1 = r10
            r2 = 262(0x106, float:3.67E-43)
            r1 = r1[r2]
            r0.vkCmdSetDepthClipEnableEXT = r1
            r0 = r5
            r1 = r10
            r2 = 263(0x107, float:3.69E-43)
            r1 = r1[r2]
            r0.vkCmdSetSampleLocationsEnableEXT = r1
            r0 = r5
            r1 = r10
            r2 = 264(0x108, float:3.7E-43)
            r1 = r1[r2]
            r0.vkCmdSetColorBlendAdvancedEXT = r1
            r0 = r5
            r1 = r10
            r2 = 265(0x109, float:3.71E-43)
            r1 = r1[r2]
            r0.vkCmdSetProvokingVertexModeEXT = r1
            r0 = r5
            r1 = r10
            r2 = 266(0x10a, float:3.73E-43)
            r1 = r1[r2]
            r0.vkCmdSetLineRasterizationModeEXT = r1
            r0 = r5
            r1 = r10
            r2 = 267(0x10b, float:3.74E-43)
            r1 = r1[r2]
            r0.vkCmdSetLineStippleEnableEXT = r1
            r0 = r5
            r1 = r10
            r2 = 268(0x10c, float:3.76E-43)
            r1 = r1[r2]
            r0.vkCmdSetDepthClipNegativeOneToOneEXT = r1
            r0 = r5
            r1 = r10
            r2 = 269(0x10d, float:3.77E-43)
            r1 = r1[r2]
            r0.vkCmdSetViewportWScalingEnableNV = r1
            r0 = r5
            r1 = r10
            r2 = 270(0x10e, float:3.78E-43)
            r1 = r1[r2]
            r0.vkCmdSetViewportSwizzleNV = r1
            r0 = r5
            r1 = r10
            r2 = 271(0x10f, float:3.8E-43)
            r1 = r1[r2]
            r0.vkCmdSetCoverageToColorEnableNV = r1
            r0 = r5
            r1 = r10
            r2 = 272(0x110, float:3.81E-43)
            r1 = r1[r2]
            r0.vkCmdSetCoverageToColorLocationNV = r1
            r0 = r5
            r1 = r10
            r2 = 273(0x111, float:3.83E-43)
            r1 = r1[r2]
            r0.vkCmdSetCoverageModulationModeNV = r1
            r0 = r5
            r1 = r10
            r2 = 274(0x112, float:3.84E-43)
            r1 = r1[r2]
            r0.vkCmdSetCoverageModulationTableEnableNV = r1
            r0 = r5
            r1 = r10
            r2 = 275(0x113, float:3.85E-43)
            r1 = r1[r2]
            r0.vkCmdSetCoverageModulationTableNV = r1
            r0 = r5
            r1 = r10
            r2 = 276(0x114, float:3.87E-43)
            r1 = r1[r2]
            r0.vkCmdSetShadingRateImageEnableNV = r1
            r0 = r5
            r1 = r10
            r2 = 277(0x115, float:3.88E-43)
            r1 = r1[r2]
            r0.vkCmdSetRepresentativeFragmentTestEnableNV = r1
            r0 = r5
            r1 = r10
            r2 = 278(0x116, float:3.9E-43)
            r1 = r1[r2]
            r0.vkCmdSetCoverageReductionModeNV = r1
            r0 = r5
            r1 = r10
            r2 = 279(0x117, float:3.91E-43)
            r1 = r1[r2]
            r0.vkGetMemoryHostPointerPropertiesEXT = r1
            r0 = r5
            r1 = r10
            r2 = 280(0x118, float:3.92E-43)
            r1 = r1[r2]
            r0.vkAcquireFullScreenExclusiveModeEXT = r1
            r0 = r5
            r1 = r10
            r2 = 281(0x119, float:3.94E-43)
            r1 = r1[r2]
            r0.vkReleaseFullScreenExclusiveModeEXT = r1
            r0 = r5
            r1 = r10
            r2 = 282(0x11a, float:3.95E-43)
            r1 = r1[r2]
            r0.vkGetDeviceGroupSurfacePresentModes2EXT = r1
            r0 = r5
            r1 = r10
            r2 = 283(0x11b, float:3.97E-43)
            r1 = r1[r2]
            r0.vkSetHdrMetadataEXT = r1
            r0 = r5
            r1 = r10
            r2 = 284(0x11c, float:3.98E-43)
            r1 = r1[r2]
            r0.vkCopyMemoryToImageEXT = r1
            r0 = r5
            r1 = r10
            r2 = 285(0x11d, float:4.0E-43)
            r1 = r1[r2]
            r0.vkCopyImageToMemoryEXT = r1
            r0 = r5
            r1 = r10
            r2 = 286(0x11e, float:4.01E-43)
            r1 = r1[r2]
            r0.vkCopyImageToImageEXT = r1
            r0 = r5
            r1 = r10
            r2 = 287(0x11f, float:4.02E-43)
            r1 = r1[r2]
            r0.vkTransitionImageLayoutEXT = r1
            r0 = r5
            r1 = r10
            r2 = 288(0x120, float:4.04E-43)
            r1 = r1[r2]
            r0.vkGetImageSubresourceLayout2EXT = r1
            r0 = r5
            r1 = r10
            r2 = 289(0x121, float:4.05E-43)
            r1 = r1[r2]
            r0.vkResetQueryPoolEXT = r1
            r0 = r5
            r1 = r10
            r2 = 290(0x122, float:4.06E-43)
            r1 = r1[r2]
            r0.vkGetImageDrmFormatModifierPropertiesEXT = r1
            r0 = r5
            r1 = r10
            r2 = 291(0x123, float:4.08E-43)
            r1 = r1[r2]
            r0.vkCmdSetLineStippleEXT = r1
            r0 = r5
            r1 = r10
            r2 = 292(0x124, float:4.09E-43)
            r1 = r1[r2]
            r0.vkCmdDrawMeshTasksEXT = r1
            r0 = r5
            r1 = r10
            r2 = 293(0x125, float:4.1E-43)
            r1 = r1[r2]
            r0.vkCmdDrawMeshTasksIndirectEXT = r1
            r0 = r5
            r1 = r10
            r2 = 294(0x126, float:4.12E-43)
            r1 = r1[r2]
            r0.vkCmdDrawMeshTasksIndirectCountEXT = r1
            r0 = r5
            r1 = r10
            r2 = 295(0x127, float:4.13E-43)
            r1 = r1[r2]
            r0.vkExportMetalObjectsEXT = r1
            r0 = r5
            r1 = r10
            r2 = 296(0x128, float:4.15E-43)
            r1 = r1[r2]
            r0.vkCmdDrawMultiEXT = r1
            r0 = r5
            r1 = r10
            r2 = 297(0x129, float:4.16E-43)
            r1 = r1[r2]
            r0.vkCmdDrawMultiIndexedEXT = r1
            r0 = r5
            r1 = r10
            r2 = 298(0x12a, float:4.18E-43)
            r1 = r1[r2]
            r0.vkCreateMicromapEXT = r1
            r0 = r5
            r1 = r10
            r2 = 299(0x12b, float:4.19E-43)
            r1 = r1[r2]
            r0.vkDestroyMicromapEXT = r1
            r0 = r5
            r1 = r10
            r2 = 300(0x12c, float:4.2E-43)
            r1 = r1[r2]
            r0.vkCmdBuildMicromapsEXT = r1
            r0 = r5
            r1 = r10
            r2 = 301(0x12d, float:4.22E-43)
            r1 = r1[r2]
            r0.vkBuildMicromapsEXT = r1
            r0 = r5
            r1 = r10
            r2 = 302(0x12e, float:4.23E-43)
            r1 = r1[r2]
            r0.vkCopyMicromapEXT = r1
            r0 = r5
            r1 = r10
            r2 = 303(0x12f, float:4.25E-43)
            r1 = r1[r2]
            r0.vkCopyMicromapToMemoryEXT = r1
            r0 = r5
            r1 = r10
            r2 = 304(0x130, float:4.26E-43)
            r1 = r1[r2]
            r0.vkCopyMemoryToMicromapEXT = r1
            r0 = r5
            r1 = r10
            r2 = 305(0x131, float:4.27E-43)
            r1 = r1[r2]
            r0.vkWriteMicromapsPropertiesEXT = r1
            r0 = r5
            r1 = r10
            r2 = 306(0x132, float:4.29E-43)
            r1 = r1[r2]
            r0.vkCmdCopyMicromapEXT = r1
            r0 = r5
            r1 = r10
            r2 = 307(0x133, float:4.3E-43)
            r1 = r1[r2]
            r0.vkCmdCopyMicromapToMemoryEXT = r1
            r0 = r5
            r1 = r10
            r2 = 308(0x134, float:4.32E-43)
            r1 = r1[r2]
            r0.vkCmdCopyMemoryToMicromapEXT = r1
            r0 = r5
            r1 = r10
            r2 = 309(0x135, float:4.33E-43)
            r1 = r1[r2]
            r0.vkCmdWriteMicromapsPropertiesEXT = r1
            r0 = r5
            r1 = r10
            r2 = 310(0x136, float:4.34E-43)
            r1 = r1[r2]
            r0.vkGetDeviceMicromapCompatibilityEXT = r1
            r0 = r5
            r1 = r10
            r2 = 311(0x137, float:4.36E-43)
            r1 = r1[r2]
            r0.vkGetMicromapBuildSizesEXT = r1
            r0 = r5
            r1 = r10
            r2 = 312(0x138, float:4.37E-43)
            r1 = r1[r2]
            r0.vkSetDeviceMemoryPriorityEXT = r1
            r0 = r5
            r1 = r10
            r2 = 313(0x139, float:4.39E-43)
            r1 = r1[r2]
            r0.vkGetPipelinePropertiesEXT = r1
            r0 = r5
            r1 = r10
            r2 = 314(0x13a, float:4.4E-43)
            r1 = r1[r2]
            r0.vkCreatePrivateDataSlotEXT = r1
            r0 = r5
            r1 = r10
            r2 = 315(0x13b, float:4.41E-43)
            r1 = r1[r2]
            r0.vkDestroyPrivateDataSlotEXT = r1
            r0 = r5
            r1 = r10
            r2 = 316(0x13c, float:4.43E-43)
            r1 = r1[r2]
            r0.vkSetPrivateDataEXT = r1
            r0 = r5
            r1 = r10
            r2 = 317(0x13d, float:4.44E-43)
            r1 = r1[r2]
            r0.vkGetPrivateDataEXT = r1
            r0 = r5
            r1 = r10
            r2 = 318(0x13e, float:4.46E-43)
            r1 = r1[r2]
            r0.vkCmdSetSampleLocationsEXT = r1
            r0 = r5
            r1 = r10
            r2 = 319(0x13f, float:4.47E-43)
            r1 = r1[r2]
            r0.vkGetShaderModuleIdentifierEXT = r1
            r0 = r5
            r1 = r10
            r2 = 320(0x140, float:4.48E-43)
            r1 = r1[r2]
            r0.vkGetShaderModuleCreateInfoIdentifierEXT = r1
            r0 = r5
            r1 = r10
            r2 = 321(0x141, float:4.5E-43)
            r1 = r1[r2]
            r0.vkCreateShadersEXT = r1
            r0 = r5
            r1 = r10
            r2 = 322(0x142, float:4.51E-43)
            r1 = r1[r2]
            r0.vkDestroyShaderEXT = r1
            r0 = r5
            r1 = r10
            r2 = 323(0x143, float:4.53E-43)
            r1 = r1[r2]
            r0.vkGetShaderBinaryDataEXT = r1
            r0 = r5
            r1 = r10
            r2 = 324(0x144, float:4.54E-43)
            r1 = r1[r2]
            r0.vkCmdBindShadersEXT = r1
            r0 = r5
            r1 = r10
            r2 = 325(0x145, float:4.55E-43)
            r1 = r1[r2]
            r0.vkCmdSetVertexInputEXT = r1
            r0 = r5
            r1 = r10
            r2 = 326(0x146, float:4.57E-43)
            r1 = r1[r2]
            r0.vkReleaseSwapchainImagesEXT = r1
            r0 = r5
            r1 = r10
            r2 = 327(0x147, float:4.58E-43)
            r1 = r1[r2]
            r0.vkCmdBindTransformFeedbackBuffersEXT = r1
            r0 = r5
            r1 = r10
            r2 = 328(0x148, float:4.6E-43)
            r1 = r1[r2]
            r0.vkCmdBeginTransformFeedbackEXT = r1
            r0 = r5
            r1 = r10
            r2 = 329(0x149, float:4.61E-43)
            r1 = r1[r2]
            r0.vkCmdEndTransformFeedbackEXT = r1
            r0 = r5
            r1 = r10
            r2 = 330(0x14a, float:4.62E-43)
            r1 = r1[r2]
            r0.vkCmdBeginQueryIndexedEXT = r1
            r0 = r5
            r1 = r10
            r2 = 331(0x14b, float:4.64E-43)
            r1 = r1[r2]
            r0.vkCmdEndQueryIndexedEXT = r1
            r0 = r5
            r1 = r10
            r2 = 332(0x14c, float:4.65E-43)
            r1 = r1[r2]
            r0.vkCmdDrawIndirectByteCountEXT = r1
            r0 = r5
            r1 = r10
            r2 = 333(0x14d, float:4.67E-43)
            r1 = r1[r2]
            r0.vkCreateValidationCacheEXT = r1
            r0 = r5
            r1 = r10
            r2 = 334(0x14e, float:4.68E-43)
            r1 = r1[r2]
            r0.vkDestroyValidationCacheEXT = r1
            r0 = r5
            r1 = r10
            r2 = 335(0x14f, float:4.7E-43)
            r1 = r1[r2]
            r0.vkMergeValidationCachesEXT = r1
            r0 = r5
            r1 = r10
            r2 = 336(0x150, float:4.71E-43)
            r1 = r1[r2]
            r0.vkGetValidationCacheDataEXT = r1
            r0 = r5
            r1 = r10
            r2 = 337(0x151, float:4.72E-43)
            r1 = r1[r2]
            r0.vkGetRefreshCycleDurationGOOGLE = r1
            r0 = r5
            r1 = r10
            r2 = 338(0x152, float:4.74E-43)
            r1 = r1[r2]
            r0.vkGetPastPresentationTimingGOOGLE = r1
            r0 = r5
            r1 = r10
            r2 = 339(0x153, float:4.75E-43)
            r1 = r1[r2]
            r0.vkCmdDrawClusterHUAWEI = r1
            r0 = r5
            r1 = r10
            r2 = 340(0x154, float:4.76E-43)
            r1 = r1[r2]
            r0.vkCmdDrawClusterIndirectHUAWEI = r1
            r0 = r5
            r1 = r10
            r2 = 341(0x155, float:4.78E-43)
            r1 = r1[r2]
            r0.vkCmdBindInvocationMaskHUAWEI = r1
            r0 = r5
            r1 = r10
            r2 = 342(0x156, float:4.79E-43)
            r1 = r1[r2]
            r0.vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI = r1
            r0 = r5
            r1 = r10
            r2 = 343(0x157, float:4.8E-43)
            r1 = r1[r2]
            r0.vkCmdSubpassShadingHUAWEI = r1
            r0 = r5
            r1 = r10
            r2 = 344(0x158, float:4.82E-43)
            r1 = r1[r2]
            r0.vkInitializePerformanceApiINTEL = r1
            r0 = r5
            r1 = r10
            r2 = 345(0x159, float:4.83E-43)
            r1 = r1[r2]
            r0.vkUninitializePerformanceApiINTEL = r1
            r0 = r5
            r1 = r10
            r2 = 346(0x15a, float:4.85E-43)
            r1 = r1[r2]
            r0.vkCmdSetPerformanceMarkerINTEL = r1
            r0 = r5
            r1 = r10
            r2 = 347(0x15b, float:4.86E-43)
            r1 = r1[r2]
            r0.vkCmdSetPerformanceStreamMarkerINTEL = r1
            r0 = r5
            r1 = r10
            r2 = 348(0x15c, float:4.88E-43)
            r1 = r1[r2]
            r0.vkCmdSetPerformanceOverrideINTEL = r1
            r0 = r5
            r1 = r10
            r2 = 349(0x15d, float:4.89E-43)
            r1 = r1[r2]
            r0.vkAcquirePerformanceConfigurationINTEL = r1
            r0 = r5
            r1 = r10
            r2 = 350(0x15e, float:4.9E-43)
            r1 = r1[r2]
            r0.vkReleasePerformanceConfigurationINTEL = r1
            r0 = r5
            r1 = r10
            r2 = 351(0x15f, float:4.92E-43)
            r1 = r1[r2]
            r0.vkQueueSetPerformanceConfigurationINTEL = r1
            r0 = r5
            r1 = r10
            r2 = 352(0x160, float:4.93E-43)
            r1 = r1[r2]
            r0.vkGetPerformanceParameterINTEL = r1
            r0 = r5
            r1 = r10
            r2 = 353(0x161, float:4.95E-43)
            r1 = r1[r2]
            r0.vkCreateAccelerationStructureKHR = r1
            r0 = r5
            r1 = r10
            r2 = 354(0x162, float:4.96E-43)
            r1 = r1[r2]
            r0.vkDestroyAccelerationStructureKHR = r1
            r0 = r5
            r1 = r10
            r2 = 355(0x163, float:4.97E-43)
            r1 = r1[r2]
            r0.vkCmdBuildAccelerationStructuresKHR = r1
            r0 = r5
            r1 = r10
            r2 = 356(0x164, float:4.99E-43)
            r1 = r1[r2]
            r0.vkCmdBuildAccelerationStructuresIndirectKHR = r1
            r0 = r5
            r1 = r10
            r2 = 357(0x165, float:5.0E-43)
            r1 = r1[r2]
            r0.vkBuildAccelerationStructuresKHR = r1
            r0 = r5
            r1 = r10
            r2 = 358(0x166, float:5.02E-43)
            r1 = r1[r2]
            r0.vkCopyAccelerationStructureKHR = r1
            r0 = r5
            r1 = r10
            r2 = 359(0x167, float:5.03E-43)
            r1 = r1[r2]
            r0.vkCopyAccelerationStructureToMemoryKHR = r1
            r0 = r5
            r1 = r10
            r2 = 360(0x168, float:5.04E-43)
            r1 = r1[r2]
            r0.vkCopyMemoryToAccelerationStructureKHR = r1
            r0 = r5
            r1 = r10
            r2 = 361(0x169, float:5.06E-43)
            r1 = r1[r2]
            r0.vkWriteAccelerationStructuresPropertiesKHR = r1
            r0 = r5
            r1 = r10
            r2 = 362(0x16a, float:5.07E-43)
            r1 = r1[r2]
            r0.vkCmdCopyAccelerationStructureKHR = r1
            r0 = r5
            r1 = r10
            r2 = 363(0x16b, float:5.09E-43)
            r1 = r1[r2]
            r0.vkCmdCopyAccelerationStructureToMemoryKHR = r1
            r0 = r5
            r1 = r10
            r2 = 364(0x16c, float:5.1E-43)
            r1 = r1[r2]
            r0.vkCmdCopyMemoryToAccelerationStructureKHR = r1
            r0 = r5
            r1 = r10
            r2 = 365(0x16d, float:5.11E-43)
            r1 = r1[r2]
            r0.vkGetAccelerationStructureDeviceAddressKHR = r1
            r0 = r5
            r1 = r10
            r2 = 366(0x16e, float:5.13E-43)
            r1 = r1[r2]
            r0.vkCmdWriteAccelerationStructuresPropertiesKHR = r1
            r0 = r5
            r1 = r10
            r2 = 367(0x16f, float:5.14E-43)
            r1 = r1[r2]
            r0.vkGetDeviceAccelerationStructureCompatibilityKHR = r1
            r0 = r5
            r1 = r10
            r2 = 368(0x170, float:5.16E-43)
            r1 = r1[r2]
            r0.vkGetAccelerationStructureBuildSizesKHR = r1
            r0 = r5
            r1 = r10
            r2 = 369(0x171, float:5.17E-43)
            r1 = r1[r2]
            r0.vkBindBufferMemory2KHR = r1
            r0 = r5
            r1 = r10
            r2 = 370(0x172, float:5.18E-43)
            r1 = r1[r2]
            r0.vkBindImageMemory2KHR = r1
            r0 = r5
            r1 = r10
            r2 = 371(0x173, float:5.2E-43)
            r1 = r1[r2]
            r0.vkGetBufferDeviceAddressKHR = r1
            r0 = r5
            r1 = r10
            r2 = 372(0x174, float:5.21E-43)
            r1 = r1[r2]
            r0.vkGetBufferOpaqueCaptureAddressKHR = r1
            r0 = r5
            r1 = r10
            r2 = 373(0x175, float:5.23E-43)
            r1 = r1[r2]
            r0.vkGetDeviceMemoryOpaqueCaptureAddressKHR = r1
            r0 = r5
            r1 = r10
            r2 = 374(0x176, float:5.24E-43)
            r1 = r1[r2]
            r0.vkCmdCopyBuffer2KHR = r1
            r0 = r5
            r1 = r10
            r2 = 375(0x177, float:5.25E-43)
            r1 = r1[r2]
            r0.vkCmdCopyImage2KHR = r1
            r0 = r5
            r1 = r10
            r2 = 376(0x178, float:5.27E-43)
            r1 = r1[r2]
            r0.vkCmdCopyBufferToImage2KHR = r1
            r0 = r5
            r1 = r10
            r2 = 377(0x179, float:5.28E-43)
            r1 = r1[r2]
            r0.vkCmdCopyImageToBuffer2KHR = r1
            r0 = r5
            r1 = r10
            r2 = 378(0x17a, float:5.3E-43)
            r1 = r1[r2]
            r0.vkCmdBlitImage2KHR = r1
            r0 = r5
            r1 = r10
            r2 = 379(0x17b, float:5.31E-43)
            r1 = r1[r2]
            r0.vkCmdResolveImage2KHR = r1
            r0 = r5
            r1 = r10
            r2 = 380(0x17c, float:5.32E-43)
            r1 = r1[r2]
            r0.vkCreateRenderPass2KHR = r1
            r0 = r5
            r1 = r10
            r2 = 381(0x17d, float:5.34E-43)
            r1 = r1[r2]
            r0.vkCmdBeginRenderPass2KHR = r1
            r0 = r5
            r1 = r10
            r2 = 382(0x17e, float:5.35E-43)
            r1 = r1[r2]
            r0.vkCmdNextSubpass2KHR = r1
            r0 = r5
            r1 = r10
            r2 = 383(0x17f, float:5.37E-43)
            r1 = r1[r2]
            r0.vkCmdEndRenderPass2KHR = r1
            r0 = r5
            r1 = r10
            r2 = 384(0x180, float:5.38E-43)
            r1 = r1[r2]
            r0.vkCreateDeferredOperationKHR = r1
            r0 = r5
            r1 = r10
            r2 = 385(0x181, float:5.4E-43)
            r1 = r1[r2]
            r0.vkDestroyDeferredOperationKHR = r1
            r0 = r5
            r1 = r10
            r2 = 386(0x182, float:5.41E-43)
            r1 = r1[r2]
            r0.vkGetDeferredOperationMaxConcurrencyKHR = r1
            r0 = r5
            r1 = r10
            r2 = 387(0x183, float:5.42E-43)
            r1 = r1[r2]
            r0.vkGetDeferredOperationResultKHR = r1
            r0 = r5
            r1 = r10
            r2 = 388(0x184, float:5.44E-43)
            r1 = r1[r2]
            r0.vkDeferredOperationJoinKHR = r1
            r0 = r5
            r1 = r10
            r2 = 389(0x185, float:5.45E-43)
            r1 = r1[r2]
            r0.vkCreateDescriptorUpdateTemplateKHR = r1
            r0 = r5
            r1 = r10
            r2 = 390(0x186, float:5.47E-43)
            r1 = r1[r2]
            r0.vkDestroyDescriptorUpdateTemplateKHR = r1
            r0 = r5
            r1 = r10
            r2 = 391(0x187, float:5.48E-43)
            r1 = r1[r2]
            r0.vkUpdateDescriptorSetWithTemplateKHR = r1
            r0 = r5
            r1 = r10
            r2 = 392(0x188, float:5.5E-43)
            r1 = r1[r2]
            r0.vkCmdPushDescriptorSetWithTemplateKHR = r1
            r0 = r5
            r1 = r10
            r2 = 393(0x189, float:5.51E-43)
            r1 = r1[r2]
            r0.vkGetDeviceGroupPeerMemoryFeaturesKHR = r1
            r0 = r5
            r1 = r10
            r2 = 394(0x18a, float:5.52E-43)
            r1 = r1[r2]
            r0.vkCmdSetDeviceMaskKHR = r1
            r0 = r5
            r1 = r10
            r2 = 395(0x18b, float:5.54E-43)
            r1 = r1[r2]
            r0.vkCmdDispatchBaseKHR = r1
            r0 = r5
            r1 = r10
            r2 = 396(0x18c, float:5.55E-43)
            r1 = r1[r2]
            r0.vkGetDeviceGroupPresentCapabilitiesKHR = r1
            r0 = r5
            r1 = r10
            r2 = 397(0x18d, float:5.56E-43)
            r1 = r1[r2]
            r0.vkGetDeviceGroupSurfacePresentModesKHR = r1
            r0 = r5
            r1 = r10
            r2 = 398(0x18e, float:5.58E-43)
            r1 = r1[r2]
            r0.vkAcquireNextImage2KHR = r1
            r0 = r5
            r1 = r10
            r2 = 399(0x18f, float:5.59E-43)
            r1 = r1[r2]
            r0.vkCreateSharedSwapchainsKHR = r1
            r0 = r5
            r1 = r10
            r2 = 400(0x190, float:5.6E-43)
            r1 = r1[r2]
            r0.vkCmdDrawIndirectCountKHR = r1
            r0 = r5
            r1 = r10
            r2 = 401(0x191, float:5.62E-43)
            r1 = r1[r2]
            r0.vkCmdDrawIndexedIndirectCountKHR = r1
            r0 = r5
            r1 = r10
            r2 = 402(0x192, float:5.63E-43)
            r1 = r1[r2]
            r0.vkCmdBeginRenderingKHR = r1
            r0 = r5
            r1 = r10
            r2 = 403(0x193, float:5.65E-43)
            r1 = r1[r2]
            r0.vkCmdEndRenderingKHR = r1
            r0 = r5
            r1 = r10
            r2 = 404(0x194, float:5.66E-43)
            r1 = r1[r2]
            r0.vkImportFenceFdKHR = r1
            r0 = r5
            r1 = r10
            r2 = 405(0x195, float:5.68E-43)
            r1 = r1[r2]
            r0.vkGetFenceFdKHR = r1
            r0 = r5
            r1 = r10
            r2 = 406(0x196, float:5.69E-43)
            r1 = r1[r2]
            r0.vkImportFenceWin32HandleKHR = r1
            r0 = r5
            r1 = r10
            r2 = 407(0x197, float:5.7E-43)
            r1 = r1[r2]
            r0.vkGetFenceWin32HandleKHR = r1
            r0 = r5
            r1 = r10
            r2 = 408(0x198, float:5.72E-43)
            r1 = r1[r2]
            r0.vkGetMemoryFdKHR = r1
            r0 = r5
            r1 = r10
            r2 = 409(0x199, float:5.73E-43)
            r1 = r1[r2]
            r0.vkGetMemoryFdPropertiesKHR = r1
            r0 = r5
            r1 = r10
            r2 = 410(0x19a, float:5.75E-43)
            r1 = r1[r2]
            r0.vkGetMemoryWin32HandleKHR = r1
            r0 = r5
            r1 = r10
            r2 = 411(0x19b, float:5.76E-43)
            r1 = r1[r2]
            r0.vkGetMemoryWin32HandlePropertiesKHR = r1
            r0 = r5
            r1 = r10
            r2 = 412(0x19c, float:5.77E-43)
            r1 = r1[r2]
            r0.vkImportSemaphoreFdKHR = r1
            r0 = r5
            r1 = r10
            r2 = 413(0x19d, float:5.79E-43)
            r1 = r1[r2]
            r0.vkGetSemaphoreFdKHR = r1
            r0 = r5
            r1 = r10
            r2 = 414(0x19e, float:5.8E-43)
            r1 = r1[r2]
            r0.vkImportSemaphoreWin32HandleKHR = r1
            r0 = r5
            r1 = r10
            r2 = 415(0x19f, float:5.82E-43)
            r1 = r1[r2]
            r0.vkGetSemaphoreWin32HandleKHR = r1
            r0 = r5
            r1 = r10
            r2 = 416(0x1a0, float:5.83E-43)
            r1 = r1[r2]
            r0.vkCmdSetFragmentShadingRateKHR = r1
            r0 = r5
            r1 = r10
            r2 = 417(0x1a1, float:5.84E-43)
            r1 = r1[r2]
            r0.vkGetImageMemoryRequirements2KHR = r1
            r0 = r5
            r1 = r10
            r2 = 418(0x1a2, float:5.86E-43)
            r1 = r1[r2]
            r0.vkGetBufferMemoryRequirements2KHR = r1
            r0 = r5
            r1 = r10
            r2 = 419(0x1a3, float:5.87E-43)
            r1 = r1[r2]
            r0.vkGetImageSparseMemoryRequirements2KHR = r1
            r0 = r5
            r1 = r10
            r2 = 420(0x1a4, float:5.89E-43)
            r1 = r1[r2]
            r0.vkTrimCommandPoolKHR = r1
            r0 = r5
            r1 = r10
            r2 = 421(0x1a5, float:5.9E-43)
            r1 = r1[r2]
            r0.vkGetDescriptorSetLayoutSupportKHR = r1
            r0 = r5
            r1 = r10
            r2 = 422(0x1a6, float:5.91E-43)
            r1 = r1[r2]
            r0.vkGetDeviceBufferMemoryRequirementsKHR = r1
            r0 = r5
            r1 = r10
            r2 = 423(0x1a7, float:5.93E-43)
            r1 = r1[r2]
            r0.vkGetDeviceImageMemoryRequirementsKHR = r1
            r0 = r5
            r1 = r10
            r2 = 424(0x1a8, float:5.94E-43)
            r1 = r1[r2]
            r0.vkGetDeviceImageSparseMemoryRequirementsKHR = r1
            r0 = r5
            r1 = r10
            r2 = 425(0x1a9, float:5.96E-43)
            r1 = r1[r2]
            r0.vkCmdBindIndexBuffer2KHR = r1
            r0 = r5
            r1 = r10
            r2 = 426(0x1aa, float:5.97E-43)
            r1 = r1[r2]
            r0.vkGetRenderingAreaGranularityKHR = r1
            r0 = r5
            r1 = r10
            r2 = 427(0x1ab, float:5.98E-43)
            r1 = r1[r2]
            r0.vkGetDeviceImageSubresourceLayoutKHR = r1
            r0 = r5
            r1 = r10
            r2 = 428(0x1ac, float:6.0E-43)
            r1 = r1[r2]
            r0.vkGetImageSubresourceLayout2KHR = r1
            r0 = r5
            r1 = r10
            r2 = 429(0x1ad, float:6.01E-43)
            r1 = r1[r2]
            r0.vkMapMemory2KHR = r1
            r0 = r5
            r1 = r10
            r2 = 430(0x1ae, float:6.03E-43)
            r1 = r1[r2]
            r0.vkUnmapMemory2KHR = r1
            r0 = r5
            r1 = r10
            r2 = 431(0x1af, float:6.04E-43)
            r1 = r1[r2]
            r0.vkAcquireProfilingLockKHR = r1
            r0 = r5
            r1 = r10
            r2 = 432(0x1b0, float:6.05E-43)
            r1 = r1[r2]
            r0.vkReleaseProfilingLockKHR = r1
            r0 = r5
            r1 = r10
            r2 = 433(0x1b1, float:6.07E-43)
            r1 = r1[r2]
            r0.vkGetPipelineExecutablePropertiesKHR = r1
            r0 = r5
            r1 = r10
            r2 = 434(0x1b2, float:6.08E-43)
            r1 = r1[r2]
            r0.vkGetPipelineExecutableStatisticsKHR = r1
            r0 = r5
            r1 = r10
            r2 = 435(0x1b3, float:6.1E-43)
            r1 = r1[r2]
            r0.vkGetPipelineExecutableInternalRepresentationsKHR = r1
            r0 = r5
            r1 = r10
            r2 = 436(0x1b4, float:6.11E-43)
            r1 = r1[r2]
            r0.vkWaitForPresentKHR = r1
            r0 = r5
            r1 = r10
            r2 = 437(0x1b5, float:6.12E-43)
            r1 = r1[r2]
            r0.vkCmdPushDescriptorSetKHR = r1
            r0 = r5
            r1 = r10
            r2 = 438(0x1b6, float:6.14E-43)
            r1 = r1[r2]
            r0.vkCmdTraceRaysIndirect2KHR = r1
            r0 = r5
            r1 = r10
            r2 = 439(0x1b7, float:6.15E-43)
            r1 = r1[r2]
            r0.vkCmdTraceRaysKHR = r1
            r0 = r5
            r1 = r10
            r2 = 440(0x1b8, float:6.17E-43)
            r1 = r1[r2]
            r0.vkCreateRayTracingPipelinesKHR = r1
            r0 = r5
            r1 = r10
            r2 = 441(0x1b9, float:6.18E-43)
            r1 = r1[r2]
            r0.vkGetRayTracingShaderGroupHandlesKHR = r1
            r0 = r5
            r1 = r10
            r2 = 442(0x1ba, float:6.2E-43)
            r1 = r1[r2]
            r0.vkGetRayTracingCaptureReplayShaderGroupHandlesKHR = r1
            r0 = r5
            r1 = r10
            r2 = 443(0x1bb, float:6.21E-43)
            r1 = r1[r2]
            r0.vkCmdTraceRaysIndirectKHR = r1
            r0 = r5
            r1 = r10
            r2 = 444(0x1bc, float:6.22E-43)
            r1 = r1[r2]
            r0.vkGetRayTracingShaderGroupStackSizeKHR = r1
            r0 = r5
            r1 = r10
            r2 = 445(0x1bd, float:6.24E-43)
            r1 = r1[r2]
            r0.vkCmdSetRayTracingPipelineStackSizeKHR = r1
            r0 = r5
            r1 = r10
            r2 = 446(0x1be, float:6.25E-43)
            r1 = r1[r2]
            r0.vkCreateSamplerYcbcrConversionKHR = r1
            r0 = r5
            r1 = r10
            r2 = 447(0x1bf, float:6.26E-43)
            r1 = r1[r2]
            r0.vkDestroySamplerYcbcrConversionKHR = r1
            r0 = r5
            r1 = r10
            r2 = 448(0x1c0, float:6.28E-43)
            r1 = r1[r2]
            r0.vkGetSwapchainStatusKHR = r1
            r0 = r5
            r1 = r10
            r2 = 449(0x1c1, float:6.29E-43)
            r1 = r1[r2]
            r0.vkCreateSwapchainKHR = r1
            r0 = r5
            r1 = r10
            r2 = 450(0x1c2, float:6.3E-43)
            r1 = r1[r2]
            r0.vkDestroySwapchainKHR = r1
            r0 = r5
            r1 = r10
            r2 = 451(0x1c3, float:6.32E-43)
            r1 = r1[r2]
            r0.vkGetSwapchainImagesKHR = r1
            r0 = r5
            r1 = r10
            r2 = 452(0x1c4, float:6.33E-43)
            r1 = r1[r2]
            r0.vkAcquireNextImageKHR = r1
            r0 = r5
            r1 = r10
            r2 = 453(0x1c5, float:6.35E-43)
            r1 = r1[r2]
            r0.vkQueuePresentKHR = r1
            r0 = r5
            r1 = r10
            r2 = 454(0x1c6, float:6.36E-43)
            r1 = r1[r2]
            r0.vkCmdSetEvent2KHR = r1
            r0 = r5
            r1 = r10
            r2 = 455(0x1c7, float:6.38E-43)
            r1 = r1[r2]
            r0.vkCmdResetEvent2KHR = r1
            r0 = r5
            r1 = r10
            r2 = 456(0x1c8, float:6.39E-43)
            r1 = r1[r2]
            r0.vkCmdWaitEvents2KHR = r1
            r0 = r5
            r1 = r10
            r2 = 457(0x1c9, float:6.4E-43)
            r1 = r1[r2]
            r0.vkCmdPipelineBarrier2KHR = r1
            r0 = r5
            r1 = r10
            r2 = 458(0x1ca, float:6.42E-43)
            r1 = r1[r2]
            r0.vkCmdWriteTimestamp2KHR = r1
            r0 = r5
            r1 = r10
            r2 = 459(0x1cb, float:6.43E-43)
            r1 = r1[r2]
            r0.vkQueueSubmit2KHR = r1
            r0 = r5
            r1 = r10
            r2 = 460(0x1cc, float:6.45E-43)
            r1 = r1[r2]
            r0.vkCmdWriteBufferMarker2AMD = r1
            r0 = r5
            r1 = r10
            r2 = 461(0x1cd, float:6.46E-43)
            r1 = r1[r2]
            r0.vkGetQueueCheckpointData2NV = r1
            r0 = r5
            r1 = r10
            r2 = 462(0x1ce, float:6.47E-43)
            r1 = r1[r2]
            r0.vkGetSemaphoreCounterValueKHR = r1
            r0 = r5
            r1 = r10
            r2 = 463(0x1cf, float:6.49E-43)
            r1 = r1[r2]
            r0.vkWaitSemaphoresKHR = r1
            r0 = r5
            r1 = r10
            r2 = 464(0x1d0, float:6.5E-43)
            r1 = r1[r2]
            r0.vkSignalSemaphoreKHR = r1
            r0 = r5
            r1 = r10
            r2 = 465(0x1d1, float:6.52E-43)
            r1 = r1[r2]
            r0.vkCmdDecodeVideoKHR = r1
            r0 = r5
            r1 = r10
            r2 = 466(0x1d2, float:6.53E-43)
            r1 = r1[r2]
            r0.vkGetEncodedVideoSessionParametersKHR = r1
            r0 = r5
            r1 = r10
            r2 = 467(0x1d3, float:6.54E-43)
            r1 = r1[r2]
            r0.vkCmdEncodeVideoKHR = r1
            r0 = r5
            r1 = r10
            r2 = 468(0x1d4, float:6.56E-43)
            r1 = r1[r2]
            r0.vkCreateVideoSessionKHR = r1
            r0 = r5
            r1 = r10
            r2 = 469(0x1d5, float:6.57E-43)
            r1 = r1[r2]
            r0.vkDestroyVideoSessionKHR = r1
            r0 = r5
            r1 = r10
            r2 = 470(0x1d6, float:6.59E-43)
            r1 = r1[r2]
            r0.vkGetVideoSessionMemoryRequirementsKHR = r1
            r0 = r5
            r1 = r10
            r2 = 471(0x1d7, float:6.6E-43)
            r1 = r1[r2]
            r0.vkBindVideoSessionMemoryKHR = r1
            r0 = r5
            r1 = r10
            r2 = 472(0x1d8, float:6.61E-43)
            r1 = r1[r2]
            r0.vkCreateVideoSessionParametersKHR = r1
            r0 = r5
            r1 = r10
            r2 = 473(0x1d9, float:6.63E-43)
            r1 = r1[r2]
            r0.vkUpdateVideoSessionParametersKHR = r1
            r0 = r5
            r1 = r10
            r2 = 474(0x1da, float:6.64E-43)
            r1 = r1[r2]
            r0.vkDestroyVideoSessionParametersKHR = r1
            r0 = r5
            r1 = r10
            r2 = 475(0x1db, float:6.66E-43)
            r1 = r1[r2]
            r0.vkCmdBeginVideoCodingKHR = r1
            r0 = r5
            r1 = r10
            r2 = 476(0x1dc, float:6.67E-43)
            r1 = r1[r2]
            r0.vkCmdEndVideoCodingKHR = r1
            r0 = r5
            r1 = r10
            r2 = 477(0x1dd, float:6.68E-43)
            r1 = r1[r2]
            r0.vkCmdControlVideoCodingKHR = r1
            r0 = r5
            r1 = r10
            r2 = 478(0x1de, float:6.7E-43)
            r1 = r1[r2]
            r0.vkCmdSetViewportWScalingNV = r1
            r0 = r5
            r1 = r10
            r2 = 479(0x1df, float:6.71E-43)
            r1 = r1[r2]
            r0.vkCmdCopyMemoryIndirectNV = r1
            r0 = r5
            r1 = r10
            r2 = 480(0x1e0, float:6.73E-43)
            r1 = r1[r2]
            r0.vkCmdCopyMemoryToImageIndirectNV = r1
            r0 = r5
            r1 = r10
            r2 = 481(0x1e1, float:6.74E-43)
            r1 = r1[r2]
            r0.vkCmdSetCheckpointNV = r1
            r0 = r5
            r1 = r10
            r2 = 482(0x1e2, float:6.75E-43)
            r1 = r1[r2]
            r0.vkGetQueueCheckpointDataNV = r1
            r0 = r5
            r1 = r10
            r2 = 483(0x1e3, float:6.77E-43)
            r1 = r1[r2]
            r0.vkGetGeneratedCommandsMemoryRequirementsNV = r1
            r0 = r5
            r1 = r10
            r2 = 484(0x1e4, float:6.78E-43)
            r1 = r1[r2]
            r0.vkCmdPreprocessGeneratedCommandsNV = r1
            r0 = r5
            r1 = r10
            r2 = 485(0x1e5, float:6.8E-43)
            r1 = r1[r2]
            r0.vkCmdExecuteGeneratedCommandsNV = r1
            r0 = r5
            r1 = r10
            r2 = 486(0x1e6, float:6.81E-43)
            r1 = r1[r2]
            r0.vkCmdBindPipelineShaderGroupNV = r1
            r0 = r5
            r1 = r10
            r2 = 487(0x1e7, float:6.82E-43)
            r1 = r1[r2]
            r0.vkCreateIndirectCommandsLayoutNV = r1
            r0 = r5
            r1 = r10
            r2 = 488(0x1e8, float:6.84E-43)
            r1 = r1[r2]
            r0.vkDestroyIndirectCommandsLayoutNV = r1
            r0 = r5
            r1 = r10
            r2 = 489(0x1e9, float:6.85E-43)
            r1 = r1[r2]
            r0.vkGetPipelineIndirectMemoryRequirementsNV = r1
            r0 = r5
            r1 = r10
            r2 = 490(0x1ea, float:6.87E-43)
            r1 = r1[r2]
            r0.vkCmdUpdatePipelineIndirectBufferNV = r1
            r0 = r5
            r1 = r10
            r2 = 491(0x1eb, float:6.88E-43)
            r1 = r1[r2]
            r0.vkGetPipelineIndirectDeviceAddressNV = r1
            r0 = r5
            r1 = r10
            r2 = 492(0x1ec, float:6.9E-43)
            r1 = r1[r2]
            r0.vkGetMemoryRemoteAddressNV = r1
            r0 = r5
            r1 = r10
            r2 = 493(0x1ed, float:6.91E-43)
            r1 = r1[r2]
            r0.vkGetMemoryWin32HandleNV = r1
            r0 = r5
            r1 = r10
            r2 = 494(0x1ee, float:6.92E-43)
            r1 = r1[r2]
            r0.vkCmdSetFragmentShadingRateEnumNV = r1
            r0 = r5
            r1 = r10
            r2 = 495(0x1ef, float:6.94E-43)
            r1 = r1[r2]
            r0.vkCmdDecompressMemoryNV = r1
            r0 = r5
            r1 = r10
            r2 = 496(0x1f0, float:6.95E-43)
            r1 = r1[r2]
            r0.vkCmdDecompressMemoryIndirectCountNV = r1
            r0 = r5
            r1 = r10
            r2 = 497(0x1f1, float:6.96E-43)
            r1 = r1[r2]
            r0.vkCmdDrawMeshTasksNV = r1
            r0 = r5
            r1 = r10
            r2 = 498(0x1f2, float:6.98E-43)
            r1 = r1[r2]
            r0.vkCmdDrawMeshTasksIndirectNV = r1
            r0 = r5
            r1 = r10
            r2 = 499(0x1f3, float:6.99E-43)
            r1 = r1[r2]
            r0.vkCmdDrawMeshTasksIndirectCountNV = r1
            r0 = r5
            r1 = r10
            r2 = 500(0x1f4, float:7.0E-43)
            r1 = r1[r2]
            r0.vkCreateOpticalFlowSessionNV = r1
            r0 = r5
            r1 = r10
            r2 = 501(0x1f5, float:7.02E-43)
            r1 = r1[r2]
            r0.vkDestroyOpticalFlowSessionNV = r1
            r0 = r5
            r1 = r10
            r2 = 502(0x1f6, float:7.03E-43)
            r1 = r1[r2]
            r0.vkBindOpticalFlowSessionImageNV = r1
            r0 = r5
            r1 = r10
            r2 = 503(0x1f7, float:7.05E-43)
            r1 = r1[r2]
            r0.vkCmdOpticalFlowExecuteNV = r1
            r0 = r5
            r1 = r10
            r2 = 504(0x1f8, float:7.06E-43)
            r1 = r1[r2]
            r0.vkCreateAccelerationStructureNV = r1
            r0 = r5
            r1 = r10
            r2 = 505(0x1f9, float:7.08E-43)
            r1 = r1[r2]
            r0.vkDestroyAccelerationStructureNV = r1
            r0 = r5
            r1 = r10
            r2 = 506(0x1fa, float:7.09E-43)
            r1 = r1[r2]
            r0.vkGetAccelerationStructureMemoryRequirementsNV = r1
            r0 = r5
            r1 = r10
            r2 = 507(0x1fb, float:7.1E-43)
            r1 = r1[r2]
            r0.vkBindAccelerationStructureMemoryNV = r1
            r0 = r5
            r1 = r10
            r2 = 508(0x1fc, float:7.12E-43)
            r1 = r1[r2]
            r0.vkCmdBuildAccelerationStructureNV = r1
            r0 = r5
            r1 = r10
            r2 = 509(0x1fd, float:7.13E-43)
            r1 = r1[r2]
            r0.vkCmdCopyAccelerationStructureNV = r1
            r0 = r5
            r1 = r10
            r2 = 510(0x1fe, float:7.15E-43)
            r1 = r1[r2]
            r0.vkCmdTraceRaysNV = r1
            r0 = r5
            r1 = r10
            r2 = 511(0x1ff, float:7.16E-43)
            r1 = r1[r2]
            r0.vkCreateRayTracingPipelinesNV = r1
            r0 = r5
            r1 = r10
            r2 = 512(0x200, float:7.17E-43)
            r1 = r1[r2]
            r0.vkGetRayTracingShaderGroupHandlesNV = r1
            r0 = r5
            r1 = r10
            r2 = 513(0x201, float:7.19E-43)
            r1 = r1[r2]
            r0.vkGetAccelerationStructureHandleNV = r1
            r0 = r5
            r1 = r10
            r2 = 514(0x202, float:7.2E-43)
            r1 = r1[r2]
            r0.vkCmdWriteAccelerationStructuresPropertiesNV = r1
            r0 = r5
            r1 = r10
            r2 = 515(0x203, float:7.22E-43)
            r1 = r1[r2]
            r0.vkCompileDeferredNV = r1
            r0 = r5
            r1 = r10
            r2 = 516(0x204, float:7.23E-43)
            r1 = r1[r2]
            r0.vkCmdSetExclusiveScissorEnableNV = r1
            r0 = r5
            r1 = r10
            r2 = 517(0x205, float:7.24E-43)
            r1 = r1[r2]
            r0.vkCmdSetExclusiveScissorNV = r1
            r0 = r5
            r1 = r10
            r2 = 518(0x206, float:7.26E-43)
            r1 = r1[r2]
            r0.vkCmdBindShadingRateImageNV = r1
            r0 = r5
            r1 = r10
            r2 = 519(0x207, float:7.27E-43)
            r1 = r1[r2]
            r0.vkCmdSetViewportShadingRatePaletteNV = r1
            r0 = r5
            r1 = r10
            r2 = 520(0x208, float:7.29E-43)
            r1 = r1[r2]
            r0.vkCmdSetCoarseSampleOrderNV = r1
            r0 = r5
            r1 = r10
            r2 = 521(0x209, float:7.3E-43)
            r1 = r1[r2]
            r0.vkCreateCuModuleNVX = r1
            r0 = r5
            r1 = r10
            r2 = 522(0x20a, float:7.31E-43)
            r1 = r1[r2]
            r0.vkCreateCuFunctionNVX = r1
            r0 = r5
            r1 = r10
            r2 = 523(0x20b, float:7.33E-43)
            r1 = r1[r2]
            r0.vkDestroyCuModuleNVX = r1
            r0 = r5
            r1 = r10
            r2 = 524(0x20c, float:7.34E-43)
            r1 = r1[r2]
            r0.vkDestroyCuFunctionNVX = r1
            r0 = r5
            r1 = r10
            r2 = 525(0x20d, float:7.36E-43)
            r1 = r1[r2]
            r0.vkCmdCuLaunchKernelNVX = r1
            r0 = r5
            r1 = r10
            r2 = 526(0x20e, float:7.37E-43)
            r1 = r1[r2]
            r0.vkGetImageViewHandleNVX = r1
            r0 = r5
            r1 = r10
            r2 = 527(0x20f, float:7.38E-43)
            r1 = r1[r2]
            r0.vkGetImageViewAddressNVX = r1
            r0 = r5
            r1 = r10
            r2 = 528(0x210, float:7.4E-43)
            r1 = r1[r2]
            r0.vkGetFramebufferTilePropertiesQCOM = r1
            r0 = r5
            r1 = r10
            r2 = 529(0x211, float:7.41E-43)
            r1 = r1[r2]
            r0.vkGetDynamicRenderingTilePropertiesQCOM = r1
            r0 = r5
            r1 = r10
            r2 = 530(0x212, float:7.43E-43)
            r1 = r1[r2]
            r0.vkGetDescriptorSetLayoutHostMappingInfoVALVE = r1
            r0 = r5
            r1 = r10
            r2 = 531(0x213, float:7.44E-43)
            r1 = r1[r2]
            r0.vkGetDescriptorSetHostMappingVALVE = r1
            return
    }

    private static boolean check_VK10(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "Vulkan10"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 121(0x79, float:1.7E-43)
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 0
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 1
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 2
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 3
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 4
            r3[r4] = r5
            r3 = r2
            r4 = 5
            r5 = 5
            r3[r4] = r5
            r3 = r2
            r4 = 6
            r5 = 6
            r3[r4] = r5
            r3 = r2
            r4 = 7
            r5 = 7
            r3[r4] = r5
            r3 = r2
            r4 = 8
            r5 = 8
            r3[r4] = r5
            r3 = r2
            r4 = 9
            r5 = 9
            r3[r4] = r5
            r3 = r2
            r4 = 10
            r5 = 10
            r3[r4] = r5
            r3 = r2
            r4 = 11
            r5 = 11
            r3[r4] = r5
            r3 = r2
            r4 = 12
            r5 = 12
            r3[r4] = r5
            r3 = r2
            r4 = 13
            r5 = 13
            r3[r4] = r5
            r3 = r2
            r4 = 14
            r5 = 14
            r3[r4] = r5
            r3 = r2
            r4 = 15
            r5 = 15
            r3[r4] = r5
            r3 = r2
            r4 = 16
            r5 = 16
            r3[r4] = r5
            r3 = r2
            r4 = 17
            r5 = 17
            r3[r4] = r5
            r3 = r2
            r4 = 18
            r5 = 18
            r3[r4] = r5
            r3 = r2
            r4 = 19
            r5 = 19
            r3[r4] = r5
            r3 = r2
            r4 = 20
            r5 = 20
            r3[r4] = r5
            r3 = r2
            r4 = 21
            r5 = 21
            r3[r4] = r5
            r3 = r2
            r4 = 22
            r5 = 22
            r3[r4] = r5
            r3 = r2
            r4 = 23
            r5 = 23
            r3[r4] = r5
            r3 = r2
            r4 = 24
            r5 = 24
            r3[r4] = r5
            r3 = r2
            r4 = 25
            r5 = 25
            r3[r4] = r5
            r3 = r2
            r4 = 26
            r5 = 26
            r3[r4] = r5
            r3 = r2
            r4 = 27
            r5 = 27
            r3[r4] = r5
            r3 = r2
            r4 = 28
            r5 = 28
            r3[r4] = r5
            r3 = r2
            r4 = 29
            r5 = 29
            r3[r4] = r5
            r3 = r2
            r4 = 30
            r5 = 30
            r3[r4] = r5
            r3 = r2
            r4 = 31
            r5 = 31
            r3[r4] = r5
            r3 = r2
            r4 = 32
            r5 = 32
            r3[r4] = r5
            r3 = r2
            r4 = 33
            r5 = 33
            r3[r4] = r5
            r3 = r2
            r4 = 34
            r5 = 34
            r3[r4] = r5
            r3 = r2
            r4 = 35
            r5 = 35
            r3[r4] = r5
            r3 = r2
            r4 = 36
            r5 = 36
            r3[r4] = r5
            r3 = r2
            r4 = 37
            r5 = 37
            r3[r4] = r5
            r3 = r2
            r4 = 38
            r5 = 38
            r3[r4] = r5
            r3 = r2
            r4 = 39
            r5 = 39
            r3[r4] = r5
            r3 = r2
            r4 = 40
            r5 = 40
            r3[r4] = r5
            r3 = r2
            r4 = 41
            r5 = 41
            r3[r4] = r5
            r3 = r2
            r4 = 42
            r5 = 42
            r3[r4] = r5
            r3 = r2
            r4 = 43
            r5 = 43
            r3[r4] = r5
            r3 = r2
            r4 = 44
            r5 = 44
            r3[r4] = r5
            r3 = r2
            r4 = 45
            r5 = 45
            r3[r4] = r5
            r3 = r2
            r4 = 46
            r5 = 46
            r3[r4] = r5
            r3 = r2
            r4 = 47
            r5 = 47
            r3[r4] = r5
            r3 = r2
            r4 = 48
            r5 = 48
            r3[r4] = r5
            r3 = r2
            r4 = 49
            r5 = 49
            r3[r4] = r5
            r3 = r2
            r4 = 50
            r5 = 50
            r3[r4] = r5
            r3 = r2
            r4 = 51
            r5 = 51
            r3[r4] = r5
            r3 = r2
            r4 = 52
            r5 = 52
            r3[r4] = r5
            r3 = r2
            r4 = 53
            r5 = 53
            r3[r4] = r5
            r3 = r2
            r4 = 54
            r5 = 54
            r3[r4] = r5
            r3 = r2
            r4 = 55
            r5 = 55
            r3[r4] = r5
            r3 = r2
            r4 = 56
            r5 = 56
            r3[r4] = r5
            r3 = r2
            r4 = 57
            r5 = 57
            r3[r4] = r5
            r3 = r2
            r4 = 58
            r5 = 58
            r3[r4] = r5
            r3 = r2
            r4 = 59
            r5 = 59
            r3[r4] = r5
            r3 = r2
            r4 = 60
            r5 = 60
            r3[r4] = r5
            r3 = r2
            r4 = 61
            r5 = 61
            r3[r4] = r5
            r3 = r2
            r4 = 62
            r5 = 62
            r3[r4] = r5
            r3 = r2
            r4 = 63
            r5 = 63
            r3[r4] = r5
            r3 = r2
            r4 = 64
            r5 = 64
            r3[r4] = r5
            r3 = r2
            r4 = 65
            r5 = 65
            r3[r4] = r5
            r3 = r2
            r4 = 66
            r5 = 66
            r3[r4] = r5
            r3 = r2
            r4 = 67
            r5 = 67
            r3[r4] = r5
            r3 = r2
            r4 = 68
            r5 = 68
            r3[r4] = r5
            r3 = r2
            r4 = 69
            r5 = 69
            r3[r4] = r5
            r3 = r2
            r4 = 70
            r5 = 70
            r3[r4] = r5
            r3 = r2
            r4 = 71
            r5 = 71
            r3[r4] = r5
            r3 = r2
            r4 = 72
            r5 = 72
            r3[r4] = r5
            r3 = r2
            r4 = 73
            r5 = 73
            r3[r4] = r5
            r3 = r2
            r4 = 74
            r5 = 74
            r3[r4] = r5
            r3 = r2
            r4 = 75
            r5 = 75
            r3[r4] = r5
            r3 = r2
            r4 = 76
            r5 = 76
            r3[r4] = r5
            r3 = r2
            r4 = 77
            r5 = 77
            r3[r4] = r5
            r3 = r2
            r4 = 78
            r5 = 78
            r3[r4] = r5
            r3 = r2
            r4 = 79
            r5 = 79
            r3[r4] = r5
            r3 = r2
            r4 = 80
            r5 = 80
            r3[r4] = r5
            r3 = r2
            r4 = 81
            r5 = 81
            r3[r4] = r5
            r3 = r2
            r4 = 82
            r5 = 82
            r3[r4] = r5
            r3 = r2
            r4 = 83
            r5 = 83
            r3[r4] = r5
            r3 = r2
            r4 = 84
            r5 = 84
            r3[r4] = r5
            r3 = r2
            r4 = 85
            r5 = 85
            r3[r4] = r5
            r3 = r2
            r4 = 86
            r5 = 86
            r3[r4] = r5
            r3 = r2
            r4 = 87
            r5 = 87
            r3[r4] = r5
            r3 = r2
            r4 = 88
            r5 = 88
            r3[r4] = r5
            r3 = r2
            r4 = 89
            r5 = 89
            r3[r4] = r5
            r3 = r2
            r4 = 90
            r5 = 90
            r3[r4] = r5
            r3 = r2
            r4 = 91
            r5 = 91
            r3[r4] = r5
            r3 = r2
            r4 = 92
            r5 = 92
            r3[r4] = r5
            r3 = r2
            r4 = 93
            r5 = 93
            r3[r4] = r5
            r3 = r2
            r4 = 94
            r5 = 94
            r3[r4] = r5
            r3 = r2
            r4 = 95
            r5 = 95
            r3[r4] = r5
            r3 = r2
            r4 = 96
            r5 = 96
            r3[r4] = r5
            r3 = r2
            r4 = 97
            r5 = 97
            r3[r4] = r5
            r3 = r2
            r4 = 98
            r5 = 98
            r3[r4] = r5
            r3 = r2
            r4 = 99
            r5 = 99
            r3[r4] = r5
            r3 = r2
            r4 = 100
            r5 = 100
            r3[r4] = r5
            r3 = r2
            r4 = 101(0x65, float:1.42E-43)
            r5 = 101(0x65, float:1.42E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 102(0x66, float:1.43E-43)
            r5 = 102(0x66, float:1.43E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 103(0x67, float:1.44E-43)
            r5 = 103(0x67, float:1.44E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 104(0x68, float:1.46E-43)
            r5 = 104(0x68, float:1.46E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 105(0x69, float:1.47E-43)
            r5 = 105(0x69, float:1.47E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 106(0x6a, float:1.49E-43)
            r5 = 106(0x6a, float:1.49E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 107(0x6b, float:1.5E-43)
            r5 = 107(0x6b, float:1.5E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 108(0x6c, float:1.51E-43)
            r5 = 108(0x6c, float:1.51E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 109(0x6d, float:1.53E-43)
            r5 = 109(0x6d, float:1.53E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 110(0x6e, float:1.54E-43)
            r5 = 110(0x6e, float:1.54E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 111(0x6f, float:1.56E-43)
            r5 = 111(0x6f, float:1.56E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 112(0x70, float:1.57E-43)
            r5 = 112(0x70, float:1.57E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 113(0x71, float:1.58E-43)
            r5 = 113(0x71, float:1.58E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 114(0x72, float:1.6E-43)
            r5 = 114(0x72, float:1.6E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 115(0x73, float:1.61E-43)
            r5 = 115(0x73, float:1.61E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 116(0x74, float:1.63E-43)
            r5 = 116(0x74, float:1.63E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 117(0x75, float:1.64E-43)
            r5 = 117(0x75, float:1.64E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 118(0x76, float:1.65E-43)
            r5 = 118(0x76, float:1.65E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 119(0x77, float:1.67E-43)
            r5 = 119(0x77, float:1.67E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 120(0x78, float:1.68E-43)
            r5 = 120(0x78, float:1.68E-43)
            r3[r4] = r5
            r3 = 121(0x79, float:1.7E-43)
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkGetDeviceProcAddr"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkDestroyDevice"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkGetDeviceQueue"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "vkQueueSubmit"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "vkQueueWaitIdle"
            r4[r5] = r6
            r4 = r3
            r5 = 5
            java.lang.String r6 = "vkDeviceWaitIdle"
            r4[r5] = r6
            r4 = r3
            r5 = 6
            java.lang.String r6 = "vkAllocateMemory"
            r4[r5] = r6
            r4 = r3
            r5 = 7
            java.lang.String r6 = "vkFreeMemory"
            r4[r5] = r6
            r4 = r3
            r5 = 8
            java.lang.String r6 = "vkMapMemory"
            r4[r5] = r6
            r4 = r3
            r5 = 9
            java.lang.String r6 = "vkUnmapMemory"
            r4[r5] = r6
            r4 = r3
            r5 = 10
            java.lang.String r6 = "vkFlushMappedMemoryRanges"
            r4[r5] = r6
            r4 = r3
            r5 = 11
            java.lang.String r6 = "vkInvalidateMappedMemoryRanges"
            r4[r5] = r6
            r4 = r3
            r5 = 12
            java.lang.String r6 = "vkGetDeviceMemoryCommitment"
            r4[r5] = r6
            r4 = r3
            r5 = 13
            java.lang.String r6 = "vkBindBufferMemory"
            r4[r5] = r6
            r4 = r3
            r5 = 14
            java.lang.String r6 = "vkBindImageMemory"
            r4[r5] = r6
            r4 = r3
            r5 = 15
            java.lang.String r6 = "vkGetBufferMemoryRequirements"
            r4[r5] = r6
            r4 = r3
            r5 = 16
            java.lang.String r6 = "vkGetImageMemoryRequirements"
            r4[r5] = r6
            r4 = r3
            r5 = 17
            java.lang.String r6 = "vkGetImageSparseMemoryRequirements"
            r4[r5] = r6
            r4 = r3
            r5 = 18
            java.lang.String r6 = "vkQueueBindSparse"
            r4[r5] = r6
            r4 = r3
            r5 = 19
            java.lang.String r6 = "vkCreateFence"
            r4[r5] = r6
            r4 = r3
            r5 = 20
            java.lang.String r6 = "vkDestroyFence"
            r4[r5] = r6
            r4 = r3
            r5 = 21
            java.lang.String r6 = "vkResetFences"
            r4[r5] = r6
            r4 = r3
            r5 = 22
            java.lang.String r6 = "vkGetFenceStatus"
            r4[r5] = r6
            r4 = r3
            r5 = 23
            java.lang.String r6 = "vkWaitForFences"
            r4[r5] = r6
            r4 = r3
            r5 = 24
            java.lang.String r6 = "vkCreateSemaphore"
            r4[r5] = r6
            r4 = r3
            r5 = 25
            java.lang.String r6 = "vkDestroySemaphore"
            r4[r5] = r6
            r4 = r3
            r5 = 26
            java.lang.String r6 = "vkCreateEvent"
            r4[r5] = r6
            r4 = r3
            r5 = 27
            java.lang.String r6 = "vkDestroyEvent"
            r4[r5] = r6
            r4 = r3
            r5 = 28
            java.lang.String r6 = "vkGetEventStatus"
            r4[r5] = r6
            r4 = r3
            r5 = 29
            java.lang.String r6 = "vkSetEvent"
            r4[r5] = r6
            r4 = r3
            r5 = 30
            java.lang.String r6 = "vkResetEvent"
            r4[r5] = r6
            r4 = r3
            r5 = 31
            java.lang.String r6 = "vkCreateQueryPool"
            r4[r5] = r6
            r4 = r3
            r5 = 32
            java.lang.String r6 = "vkDestroyQueryPool"
            r4[r5] = r6
            r4 = r3
            r5 = 33
            java.lang.String r6 = "vkGetQueryPoolResults"
            r4[r5] = r6
            r4 = r3
            r5 = 34
            java.lang.String r6 = "vkCreateBuffer"
            r4[r5] = r6
            r4 = r3
            r5 = 35
            java.lang.String r6 = "vkDestroyBuffer"
            r4[r5] = r6
            r4 = r3
            r5 = 36
            java.lang.String r6 = "vkCreateBufferView"
            r4[r5] = r6
            r4 = r3
            r5 = 37
            java.lang.String r6 = "vkDestroyBufferView"
            r4[r5] = r6
            r4 = r3
            r5 = 38
            java.lang.String r6 = "vkCreateImage"
            r4[r5] = r6
            r4 = r3
            r5 = 39
            java.lang.String r6 = "vkDestroyImage"
            r4[r5] = r6
            r4 = r3
            r5 = 40
            java.lang.String r6 = "vkGetImageSubresourceLayout"
            r4[r5] = r6
            r4 = r3
            r5 = 41
            java.lang.String r6 = "vkCreateImageView"
            r4[r5] = r6
            r4 = r3
            r5 = 42
            java.lang.String r6 = "vkDestroyImageView"
            r4[r5] = r6
            r4 = r3
            r5 = 43
            java.lang.String r6 = "vkCreateShaderModule"
            r4[r5] = r6
            r4 = r3
            r5 = 44
            java.lang.String r6 = "vkDestroyShaderModule"
            r4[r5] = r6
            r4 = r3
            r5 = 45
            java.lang.String r6 = "vkCreatePipelineCache"
            r4[r5] = r6
            r4 = r3
            r5 = 46
            java.lang.String r6 = "vkDestroyPipelineCache"
            r4[r5] = r6
            r4 = r3
            r5 = 47
            java.lang.String r6 = "vkGetPipelineCacheData"
            r4[r5] = r6
            r4 = r3
            r5 = 48
            java.lang.String r6 = "vkMergePipelineCaches"
            r4[r5] = r6
            r4 = r3
            r5 = 49
            java.lang.String r6 = "vkCreateGraphicsPipelines"
            r4[r5] = r6
            r4 = r3
            r5 = 50
            java.lang.String r6 = "vkCreateComputePipelines"
            r4[r5] = r6
            r4 = r3
            r5 = 51
            java.lang.String r6 = "vkDestroyPipeline"
            r4[r5] = r6
            r4 = r3
            r5 = 52
            java.lang.String r6 = "vkCreatePipelineLayout"
            r4[r5] = r6
            r4 = r3
            r5 = 53
            java.lang.String r6 = "vkDestroyPipelineLayout"
            r4[r5] = r6
            r4 = r3
            r5 = 54
            java.lang.String r6 = "vkCreateSampler"
            r4[r5] = r6
            r4 = r3
            r5 = 55
            java.lang.String r6 = "vkDestroySampler"
            r4[r5] = r6
            r4 = r3
            r5 = 56
            java.lang.String r6 = "vkCreateDescriptorSetLayout"
            r4[r5] = r6
            r4 = r3
            r5 = 57
            java.lang.String r6 = "vkDestroyDescriptorSetLayout"
            r4[r5] = r6
            r4 = r3
            r5 = 58
            java.lang.String r6 = "vkCreateDescriptorPool"
            r4[r5] = r6
            r4 = r3
            r5 = 59
            java.lang.String r6 = "vkDestroyDescriptorPool"
            r4[r5] = r6
            r4 = r3
            r5 = 60
            java.lang.String r6 = "vkResetDescriptorPool"
            r4[r5] = r6
            r4 = r3
            r5 = 61
            java.lang.String r6 = "vkAllocateDescriptorSets"
            r4[r5] = r6
            r4 = r3
            r5 = 62
            java.lang.String r6 = "vkFreeDescriptorSets"
            r4[r5] = r6
            r4 = r3
            r5 = 63
            java.lang.String r6 = "vkUpdateDescriptorSets"
            r4[r5] = r6
            r4 = r3
            r5 = 64
            java.lang.String r6 = "vkCreateFramebuffer"
            r4[r5] = r6
            r4 = r3
            r5 = 65
            java.lang.String r6 = "vkDestroyFramebuffer"
            r4[r5] = r6
            r4 = r3
            r5 = 66
            java.lang.String r6 = "vkCreateRenderPass"
            r4[r5] = r6
            r4 = r3
            r5 = 67
            java.lang.String r6 = "vkDestroyRenderPass"
            r4[r5] = r6
            r4 = r3
            r5 = 68
            java.lang.String r6 = "vkGetRenderAreaGranularity"
            r4[r5] = r6
            r4 = r3
            r5 = 69
            java.lang.String r6 = "vkCreateCommandPool"
            r4[r5] = r6
            r4 = r3
            r5 = 70
            java.lang.String r6 = "vkDestroyCommandPool"
            r4[r5] = r6
            r4 = r3
            r5 = 71
            java.lang.String r6 = "vkResetCommandPool"
            r4[r5] = r6
            r4 = r3
            r5 = 72
            java.lang.String r6 = "vkAllocateCommandBuffers"
            r4[r5] = r6
            r4 = r3
            r5 = 73
            java.lang.String r6 = "vkFreeCommandBuffers"
            r4[r5] = r6
            r4 = r3
            r5 = 74
            java.lang.String r6 = "vkBeginCommandBuffer"
            r4[r5] = r6
            r4 = r3
            r5 = 75
            java.lang.String r6 = "vkEndCommandBuffer"
            r4[r5] = r6
            r4 = r3
            r5 = 76
            java.lang.String r6 = "vkResetCommandBuffer"
            r4[r5] = r6
            r4 = r3
            r5 = 77
            java.lang.String r6 = "vkCmdBindPipeline"
            r4[r5] = r6
            r4 = r3
            r5 = 78
            java.lang.String r6 = "vkCmdSetViewport"
            r4[r5] = r6
            r4 = r3
            r5 = 79
            java.lang.String r6 = "vkCmdSetScissor"
            r4[r5] = r6
            r4 = r3
            r5 = 80
            java.lang.String r6 = "vkCmdSetLineWidth"
            r4[r5] = r6
            r4 = r3
            r5 = 81
            java.lang.String r6 = "vkCmdSetDepthBias"
            r4[r5] = r6
            r4 = r3
            r5 = 82
            java.lang.String r6 = "vkCmdSetBlendConstants"
            r4[r5] = r6
            r4 = r3
            r5 = 83
            java.lang.String r6 = "vkCmdSetDepthBounds"
            r4[r5] = r6
            r4 = r3
            r5 = 84
            java.lang.String r6 = "vkCmdSetStencilCompareMask"
            r4[r5] = r6
            r4 = r3
            r5 = 85
            java.lang.String r6 = "vkCmdSetStencilWriteMask"
            r4[r5] = r6
            r4 = r3
            r5 = 86
            java.lang.String r6 = "vkCmdSetStencilReference"
            r4[r5] = r6
            r4 = r3
            r5 = 87
            java.lang.String r6 = "vkCmdBindDescriptorSets"
            r4[r5] = r6
            r4 = r3
            r5 = 88
            java.lang.String r6 = "vkCmdBindIndexBuffer"
            r4[r5] = r6
            r4 = r3
            r5 = 89
            java.lang.String r6 = "vkCmdBindVertexBuffers"
            r4[r5] = r6
            r4 = r3
            r5 = 90
            java.lang.String r6 = "vkCmdDraw"
            r4[r5] = r6
            r4 = r3
            r5 = 91
            java.lang.String r6 = "vkCmdDrawIndexed"
            r4[r5] = r6
            r4 = r3
            r5 = 92
            java.lang.String r6 = "vkCmdDrawIndirect"
            r4[r5] = r6
            r4 = r3
            r5 = 93
            java.lang.String r6 = "vkCmdDrawIndexedIndirect"
            r4[r5] = r6
            r4 = r3
            r5 = 94
            java.lang.String r6 = "vkCmdDispatch"
            r4[r5] = r6
            r4 = r3
            r5 = 95
            java.lang.String r6 = "vkCmdDispatchIndirect"
            r4[r5] = r6
            r4 = r3
            r5 = 96
            java.lang.String r6 = "vkCmdCopyBuffer"
            r4[r5] = r6
            r4 = r3
            r5 = 97
            java.lang.String r6 = "vkCmdCopyImage"
            r4[r5] = r6
            r4 = r3
            r5 = 98
            java.lang.String r6 = "vkCmdBlitImage"
            r4[r5] = r6
            r4 = r3
            r5 = 99
            java.lang.String r6 = "vkCmdCopyBufferToImage"
            r4[r5] = r6
            r4 = r3
            r5 = 100
            java.lang.String r6 = "vkCmdCopyImageToBuffer"
            r4[r5] = r6
            r4 = r3
            r5 = 101(0x65, float:1.42E-43)
            java.lang.String r6 = "vkCmdUpdateBuffer"
            r4[r5] = r6
            r4 = r3
            r5 = 102(0x66, float:1.43E-43)
            java.lang.String r6 = "vkCmdFillBuffer"
            r4[r5] = r6
            r4 = r3
            r5 = 103(0x67, float:1.44E-43)
            java.lang.String r6 = "vkCmdClearColorImage"
            r4[r5] = r6
            r4 = r3
            r5 = 104(0x68, float:1.46E-43)
            java.lang.String r6 = "vkCmdClearDepthStencilImage"
            r4[r5] = r6
            r4 = r3
            r5 = 105(0x69, float:1.47E-43)
            java.lang.String r6 = "vkCmdClearAttachments"
            r4[r5] = r6
            r4 = r3
            r5 = 106(0x6a, float:1.49E-43)
            java.lang.String r6 = "vkCmdResolveImage"
            r4[r5] = r6
            r4 = r3
            r5 = 107(0x6b, float:1.5E-43)
            java.lang.String r6 = "vkCmdSetEvent"
            r4[r5] = r6
            r4 = r3
            r5 = 108(0x6c, float:1.51E-43)
            java.lang.String r6 = "vkCmdResetEvent"
            r4[r5] = r6
            r4 = r3
            r5 = 109(0x6d, float:1.53E-43)
            java.lang.String r6 = "vkCmdWaitEvents"
            r4[r5] = r6
            r4 = r3
            r5 = 110(0x6e, float:1.54E-43)
            java.lang.String r6 = "vkCmdPipelineBarrier"
            r4[r5] = r6
            r4 = r3
            r5 = 111(0x6f, float:1.56E-43)
            java.lang.String r6 = "vkCmdBeginQuery"
            r4[r5] = r6
            r4 = r3
            r5 = 112(0x70, float:1.57E-43)
            java.lang.String r6 = "vkCmdEndQuery"
            r4[r5] = r6
            r4 = r3
            r5 = 113(0x71, float:1.58E-43)
            java.lang.String r6 = "vkCmdResetQueryPool"
            r4[r5] = r6
            r4 = r3
            r5 = 114(0x72, float:1.6E-43)
            java.lang.String r6 = "vkCmdWriteTimestamp"
            r4[r5] = r6
            r4 = r3
            r5 = 115(0x73, float:1.61E-43)
            java.lang.String r6 = "vkCmdCopyQueryPoolResults"
            r4[r5] = r6
            r4 = r3
            r5 = 116(0x74, float:1.63E-43)
            java.lang.String r6 = "vkCmdPushConstants"
            r4[r5] = r6
            r4 = r3
            r5 = 117(0x75, float:1.64E-43)
            java.lang.String r6 = "vkCmdBeginRenderPass"
            r4[r5] = r6
            r4 = r3
            r5 = 118(0x76, float:1.65E-43)
            java.lang.String r6 = "vkCmdNextSubpass"
            r4[r5] = r6
            r4 = r3
            r5 = 119(0x77, float:1.67E-43)
            java.lang.String r6 = "vkCmdEndRenderPass"
            r4[r5] = r6
            r4 = r3
            r5 = 120(0x78, float:1.68E-43)
            java.lang.String r6 = "vkCmdExecuteCommands"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L63e
            java.lang.String r0 = "VK"
            java.lang.String r1 = "Vulkan10"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L642
        L63e:
            r0 = 1
            goto L643
        L642:
            r0 = 0
        L643:
            return r0
    }

    private static boolean check_VK11(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "Vulkan11"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 16
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 121(0x79, float:1.7E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 122(0x7a, float:1.71E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 123(0x7b, float:1.72E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 124(0x7c, float:1.74E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 125(0x7d, float:1.75E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 5
            r5 = 126(0x7e, float:1.77E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 6
            r5 = 127(0x7f, float:1.78E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 7
            r5 = 128(0x80, float:1.8E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 8
            r5 = 129(0x81, float:1.81E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 9
            r5 = 130(0x82, float:1.82E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 10
            r5 = 131(0x83, float:1.84E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 11
            r5 = 132(0x84, float:1.85E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 12
            r5 = 133(0x85, float:1.86E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 13
            r5 = 134(0x86, float:1.88E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 14
            r5 = 135(0x87, float:1.89E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 15
            r5 = 136(0x88, float:1.9E-43)
            r3[r4] = r5
            r3 = 16
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkBindBufferMemory2"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkBindImageMemory2"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkGetDeviceGroupPeerMemoryFeatures"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "vkCmdSetDeviceMask"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "vkCmdDispatchBase"
            r4[r5] = r6
            r4 = r3
            r5 = 5
            java.lang.String r6 = "vkGetImageMemoryRequirements2"
            r4[r5] = r6
            r4 = r3
            r5 = 6
            java.lang.String r6 = "vkGetBufferMemoryRequirements2"
            r4[r5] = r6
            r4 = r3
            r5 = 7
            java.lang.String r6 = "vkGetImageSparseMemoryRequirements2"
            r4[r5] = r6
            r4 = r3
            r5 = 8
            java.lang.String r6 = "vkTrimCommandPool"
            r4[r5] = r6
            r4 = r3
            r5 = 9
            java.lang.String r6 = "vkGetDeviceQueue2"
            r4[r5] = r6
            r4 = r3
            r5 = 10
            java.lang.String r6 = "vkCreateSamplerYcbcrConversion"
            r4[r5] = r6
            r4 = r3
            r5 = 11
            java.lang.String r6 = "vkDestroySamplerYcbcrConversion"
            r4[r5] = r6
            r4 = r3
            r5 = 12
            java.lang.String r6 = "vkCreateDescriptorUpdateTemplate"
            r4[r5] = r6
            r4 = r3
            r5 = 13
            java.lang.String r6 = "vkDestroyDescriptorUpdateTemplate"
            r4[r5] = r6
            r4 = r3
            r5 = 14
            java.lang.String r6 = "vkUpdateDescriptorSetWithTemplate"
            r4[r5] = r6
            r4 = r3
            r5 = 15
            java.lang.String r6 = "vkGetDescriptorSetLayoutSupport"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto Lf8
            java.lang.String r0 = "VK"
            java.lang.String r1 = "Vulkan11"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto Lfc
        Lf8:
            r0 = 1
            goto Lfd
        Lfc:
            r0 = 0
        Lfd:
            return r0
    }

    private static boolean check_VK12(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "Vulkan12"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 13
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 137(0x89, float:1.92E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 138(0x8a, float:1.93E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 139(0x8b, float:1.95E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 140(0x8c, float:1.96E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 141(0x8d, float:1.98E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 5
            r5 = 142(0x8e, float:1.99E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 6
            r5 = 143(0x8f, float:2.0E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 7
            r5 = 144(0x90, float:2.02E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 8
            r5 = 145(0x91, float:2.03E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 9
            r5 = 146(0x92, float:2.05E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 10
            r5 = 147(0x93, float:2.06E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 11
            r5 = 148(0x94, float:2.07E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 12
            r5 = 149(0x95, float:2.09E-43)
            r3[r4] = r5
            r3 = 13
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCmdDrawIndirectCount"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkCmdDrawIndexedIndirectCount"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkCreateRenderPass2"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "vkCmdBeginRenderPass2"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "vkCmdNextSubpass2"
            r4[r5] = r6
            r4 = r3
            r5 = 5
            java.lang.String r6 = "vkCmdEndRenderPass2"
            r4[r5] = r6
            r4 = r3
            r5 = 6
            java.lang.String r6 = "vkResetQueryPool"
            r4[r5] = r6
            r4 = r3
            r5 = 7
            java.lang.String r6 = "vkGetSemaphoreCounterValue"
            r4[r5] = r6
            r4 = r3
            r5 = 8
            java.lang.String r6 = "vkWaitSemaphores"
            r4[r5] = r6
            r4 = r3
            r5 = 9
            java.lang.String r6 = "vkSignalSemaphore"
            r4[r5] = r6
            r4 = r3
            r5 = 10
            java.lang.String r6 = "vkGetBufferDeviceAddress"
            r4[r5] = r6
            r4 = r3
            r5 = 11
            java.lang.String r6 = "vkGetBufferOpaqueCaptureAddress"
            r4[r5] = r6
            r4 = r3
            r5 = 12
            java.lang.String r6 = "vkGetDeviceMemoryOpaqueCaptureAddress"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto Ld5
            java.lang.String r0 = "VK"
            java.lang.String r1 = "Vulkan12"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto Ld9
        Ld5:
            r0 = 1
            goto Lda
        Ld9:
            r0 = 0
        Lda:
            return r0
    }

    private static boolean check_VK13(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "Vulkan13"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 36
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 150(0x96, float:2.1E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 151(0x97, float:2.12E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 152(0x98, float:2.13E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 153(0x99, float:2.14E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 154(0x9a, float:2.16E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 5
            r5 = 155(0x9b, float:2.17E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 6
            r5 = 156(0x9c, float:2.19E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 7
            r5 = 157(0x9d, float:2.2E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 8
            r5 = 158(0x9e, float:2.21E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 9
            r5 = 159(0x9f, float:2.23E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 10
            r5 = 160(0xa0, float:2.24E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 11
            r5 = 161(0xa1, float:2.26E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 12
            r5 = 162(0xa2, float:2.27E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 13
            r5 = 163(0xa3, float:2.28E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 14
            r5 = 164(0xa4, float:2.3E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 15
            r5 = 165(0xa5, float:2.31E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 16
            r5 = 166(0xa6, float:2.33E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 17
            r5 = 167(0xa7, float:2.34E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 18
            r5 = 168(0xa8, float:2.35E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 19
            r5 = 169(0xa9, float:2.37E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 20
            r5 = 170(0xaa, float:2.38E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 21
            r5 = 171(0xab, float:2.4E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 22
            r5 = 172(0xac, float:2.41E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 23
            r5 = 173(0xad, float:2.42E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 24
            r5 = 174(0xae, float:2.44E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 25
            r5 = 175(0xaf, float:2.45E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 26
            r5 = 176(0xb0, float:2.47E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 27
            r5 = 177(0xb1, float:2.48E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 28
            r5 = 178(0xb2, float:2.5E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 29
            r5 = 179(0xb3, float:2.51E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 30
            r5 = 180(0xb4, float:2.52E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 31
            r5 = 181(0xb5, float:2.54E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 32
            r5 = 182(0xb6, float:2.55E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 33
            r5 = 183(0xb7, float:2.56E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 34
            r5 = 184(0xb8, float:2.58E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 35
            r5 = 185(0xb9, float:2.59E-43)
            r3[r4] = r5
            r3 = 36
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCreatePrivateDataSlot"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkDestroyPrivateDataSlot"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkSetPrivateData"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "vkGetPrivateData"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "vkCmdSetEvent2"
            r4[r5] = r6
            r4 = r3
            r5 = 5
            java.lang.String r6 = "vkCmdResetEvent2"
            r4[r5] = r6
            r4 = r3
            r5 = 6
            java.lang.String r6 = "vkCmdWaitEvents2"
            r4[r5] = r6
            r4 = r3
            r5 = 7
            java.lang.String r6 = "vkCmdPipelineBarrier2"
            r4[r5] = r6
            r4 = r3
            r5 = 8
            java.lang.String r6 = "vkCmdWriteTimestamp2"
            r4[r5] = r6
            r4 = r3
            r5 = 9
            java.lang.String r6 = "vkQueueSubmit2"
            r4[r5] = r6
            r4 = r3
            r5 = 10
            java.lang.String r6 = "vkCmdCopyBuffer2"
            r4[r5] = r6
            r4 = r3
            r5 = 11
            java.lang.String r6 = "vkCmdCopyImage2"
            r4[r5] = r6
            r4 = r3
            r5 = 12
            java.lang.String r6 = "vkCmdCopyBufferToImage2"
            r4[r5] = r6
            r4 = r3
            r5 = 13
            java.lang.String r6 = "vkCmdCopyImageToBuffer2"
            r4[r5] = r6
            r4 = r3
            r5 = 14
            java.lang.String r6 = "vkCmdBlitImage2"
            r4[r5] = r6
            r4 = r3
            r5 = 15
            java.lang.String r6 = "vkCmdResolveImage2"
            r4[r5] = r6
            r4 = r3
            r5 = 16
            java.lang.String r6 = "vkCmdBeginRendering"
            r4[r5] = r6
            r4 = r3
            r5 = 17
            java.lang.String r6 = "vkCmdEndRendering"
            r4[r5] = r6
            r4 = r3
            r5 = 18
            java.lang.String r6 = "vkCmdSetCullMode"
            r4[r5] = r6
            r4 = r3
            r5 = 19
            java.lang.String r6 = "vkCmdSetFrontFace"
            r4[r5] = r6
            r4 = r3
            r5 = 20
            java.lang.String r6 = "vkCmdSetPrimitiveTopology"
            r4[r5] = r6
            r4 = r3
            r5 = 21
            java.lang.String r6 = "vkCmdSetViewportWithCount"
            r4[r5] = r6
            r4 = r3
            r5 = 22
            java.lang.String r6 = "vkCmdSetScissorWithCount"
            r4[r5] = r6
            r4 = r3
            r5 = 23
            java.lang.String r6 = "vkCmdBindVertexBuffers2"
            r4[r5] = r6
            r4 = r3
            r5 = 24
            java.lang.String r6 = "vkCmdSetDepthTestEnable"
            r4[r5] = r6
            r4 = r3
            r5 = 25
            java.lang.String r6 = "vkCmdSetDepthWriteEnable"
            r4[r5] = r6
            r4 = r3
            r5 = 26
            java.lang.String r6 = "vkCmdSetDepthCompareOp"
            r4[r5] = r6
            r4 = r3
            r5 = 27
            java.lang.String r6 = "vkCmdSetDepthBoundsTestEnable"
            r4[r5] = r6
            r4 = r3
            r5 = 28
            java.lang.String r6 = "vkCmdSetStencilTestEnable"
            r4[r5] = r6
            r4 = r3
            r5 = 29
            java.lang.String r6 = "vkCmdSetStencilOp"
            r4[r5] = r6
            r4 = r3
            r5 = 30
            java.lang.String r6 = "vkCmdSetRasterizerDiscardEnable"
            r4[r5] = r6
            r4 = r3
            r5 = 31
            java.lang.String r6 = "vkCmdSetDepthBiasEnable"
            r4[r5] = r6
            r4 = r3
            r5 = 32
            java.lang.String r6 = "vkCmdSetPrimitiveRestartEnable"
            r4[r5] = r6
            r4 = r3
            r5 = 33
            java.lang.String r6 = "vkGetDeviceBufferMemoryRequirements"
            r4[r5] = r6
            r4 = r3
            r5 = 34
            java.lang.String r6 = "vkGetDeviceImageMemoryRequirements"
            r4[r5] = r6
            r4 = r3
            r5 = 35
            java.lang.String r6 = "vkGetDeviceImageSparseMemoryRequirements"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L217
            java.lang.String r0 = "VK"
            java.lang.String r1 = "Vulkan13"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L21b
        L217:
            r0 = 1
            goto L21c
        L21b:
            r0 = 0
        L21c:
            return r0
    }

    private static boolean check_AMD_buffer_marker(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_AMD_buffer_marker"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 186(0xba, float:2.6E-43)
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCmdWriteBufferMarkerAMD"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L35
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_AMD_buffer_marker"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L39
        L35:
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
    }

    private static boolean check_AMD_display_native_hdr(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_AMD_display_native_hdr"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 187(0xbb, float:2.62E-43)
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkSetLocalDimmingAMD"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L35
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_AMD_display_native_hdr"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L39
        L35:
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
    }

    private static boolean check_AMD_draw_indirect_count(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_AMD_draw_indirect_count"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 2
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 188(0xbc, float:2.63E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 189(0xbd, float:2.65E-43)
            r3[r4] = r5
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCmdDrawIndirectCountAMD"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkCmdDrawIndexedIndirectCountAMD"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L41
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_AMD_draw_indirect_count"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L45
        L41:
            r0 = 1
            goto L46
        L45:
            r0 = 0
        L46:
            return r0
    }

    private static boolean check_AMD_shader_info(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_AMD_shader_info"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 190(0xbe, float:2.66E-43)
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkGetShaderInfoAMD"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L35
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_AMD_shader_info"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L39
        L35:
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
    }

    private static boolean check_AMDX_shader_enqueue(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_AMDX_shader_enqueue"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 7
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 191(0xbf, float:2.68E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 192(0xc0, float:2.69E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 193(0xc1, float:2.7E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 194(0xc2, float:2.72E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 195(0xc3, float:2.73E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 5
            r5 = 196(0xc4, float:2.75E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 6
            r5 = 197(0xc5, float:2.76E-43)
            r3[r4] = r5
            r3 = 7
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCreateExecutionGraphPipelinesAMDX"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkGetExecutionGraphPipelineScratchSizeAMDX"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkGetExecutionGraphPipelineNodeIndexAMDX"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "vkCmdInitializeGraphScratchMemoryAMDX"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "vkCmdDispatchGraphAMDX"
            r4[r5] = r6
            r4 = r3
            r5 = 5
            java.lang.String r6 = "vkCmdDispatchGraphIndirectAMDX"
            r4[r5] = r6
            r4 = r3
            r5 = 6
            java.lang.String r6 = "vkCmdDispatchGraphIndirectCountAMDX"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L81
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_AMDX_shader_enqueue"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L85
        L81:
            r0 = 1
            goto L86
        L85:
            r0 = 0
        L86:
            return r0
    }

    private static boolean check_ANDROID_external_memory_android_hardware_buffer(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_ANDROID_external_memory_android_hardware_buffer"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 2
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 198(0xc6, float:2.77E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 199(0xc7, float:2.79E-43)
            r3[r4] = r5
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkGetAndroidHardwareBufferPropertiesANDROID"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkGetMemoryAndroidHardwareBufferANDROID"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L41
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_ANDROID_external_memory_android_hardware_buffer"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L45
        L41:
            r0 = 1
            goto L46
        L45:
            r0 = 0
        L46:
            return r0
    }

    private static boolean check_EXT_attachment_feedback_loop_dynamic_state(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_EXT_attachment_feedback_loop_dynamic_state"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 200(0xc8, float:2.8E-43)
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCmdSetAttachmentFeedbackLoopEnableEXT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L35
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_EXT_attachment_feedback_loop_dynamic_state"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L39
        L35:
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
    }

    private static boolean check_EXT_buffer_device_address(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_EXT_buffer_device_address"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 201(0xc9, float:2.82E-43)
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkGetBufferDeviceAddressEXT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L35
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_EXT_buffer_device_address"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L39
        L35:
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
    }

    private static boolean check_EXT_calibrated_timestamps(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_EXT_calibrated_timestamps"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 202(0xca, float:2.83E-43)
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkGetCalibratedTimestampsEXT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L35
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_EXT_calibrated_timestamps"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L39
        L35:
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
    }

    private static boolean check_EXT_color_write_enable(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_EXT_color_write_enable"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 203(0xcb, float:2.84E-43)
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCmdSetColorWriteEnableEXT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L35
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_EXT_color_write_enable"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L39
        L35:
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
    }

    private static boolean check_EXT_conditional_rendering(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_EXT_conditional_rendering"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 2
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 204(0xcc, float:2.86E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 205(0xcd, float:2.87E-43)
            r3[r4] = r5
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCmdBeginConditionalRenderingEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkCmdEndConditionalRenderingEXT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L41
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_EXT_conditional_rendering"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L45
        L41:
            r0 = 1
            goto L46
        L45:
            r0 = 0
        L46:
            return r0
    }

    private static boolean check_EXT_debug_marker(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_EXT_debug_marker"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 5
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 206(0xce, float:2.89E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 207(0xcf, float:2.9E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 208(0xd0, float:2.91E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 209(0xd1, float:2.93E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 210(0xd2, float:2.94E-43)
            r3[r4] = r5
            r3 = 5
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkDebugMarkerSetObjectTagEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkDebugMarkerSetObjectNameEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkCmdDebugMarkerBeginEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "vkCmdDebugMarkerEndEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "vkCmdDebugMarkerInsertEXT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L65
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_EXT_debug_marker"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L69
        L65:
            r0 = 1
            goto L6a
        L69:
            r0 = 0
        L6a:
            return r0
    }

    private static boolean check_EXT_depth_bias_control(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_EXT_depth_bias_control"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 211(0xd3, float:2.96E-43)
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCmdSetDepthBias2EXT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L35
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_EXT_depth_bias_control"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L39
        L35:
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
    }

    private static boolean check_EXT_descriptor_buffer(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_EXT_descriptor_buffer"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r10
            java.lang.String r1 = "VK_KHR_acceleration_structure"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L26
            r0 = r10
            java.lang.String r1 = "VK_NV_ray_tracing"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L2a
        L26:
            r0 = 0
            goto L2d
        L2a:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L2d:
            r11 = r0
            r0 = r8
            r1 = r9
            r2 = 11
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 212(0xd4, float:2.97E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 213(0xd5, float:2.98E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 214(0xd6, float:3.0E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 215(0xd7, float:3.01E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 216(0xd8, float:3.03E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 5
            r5 = 217(0xd9, float:3.04E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 6
            r5 = 218(0xda, float:3.05E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 7
            r5 = 219(0xdb, float:3.07E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 8
            r5 = 220(0xdc, float:3.08E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 9
            r5 = 221(0xdd, float:3.1E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 10
            r5 = r11
            r6 = 222(0xde, float:3.11E-43)
            int r5 = r5 + r6
            r3[r4] = r5
            r3 = 11
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkGetDescriptorSetLayoutSizeEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkGetDescriptorSetLayoutBindingOffsetEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkGetDescriptorEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "vkCmdBindDescriptorBuffersEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "vkCmdSetDescriptorBufferOffsetsEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 5
            java.lang.String r6 = "vkCmdBindDescriptorBufferEmbeddedSamplersEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 6
            java.lang.String r6 = "vkGetBufferOpaqueCaptureDescriptorDataEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 7
            java.lang.String r6 = "vkGetImageOpaqueCaptureDescriptorDataEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 8
            java.lang.String r6 = "vkGetImageViewOpaqueCaptureDescriptorDataEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 9
            java.lang.String r6 = "vkGetSamplerOpaqueCaptureDescriptorDataEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 10
            java.lang.String r6 = "vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto Ldb
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_EXT_descriptor_buffer"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto Ldf
        Ldb:
            r0 = 1
            goto Le0
        Ldf:
            r0 = 0
        Le0:
            return r0
    }

    private static boolean check_EXT_device_fault(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_EXT_device_fault"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 223(0xdf, float:3.12E-43)
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkGetDeviceFaultInfoEXT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L35
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_EXT_device_fault"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L39
        L35:
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
    }

    private static boolean check_EXT_discard_rectangles(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_EXT_discard_rectangles"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 3
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 224(0xe0, float:3.14E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 225(0xe1, float:3.15E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 226(0xe2, float:3.17E-43)
            r3[r4] = r5
            r3 = 3
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCmdSetDiscardRectangleEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkCmdSetDiscardRectangleEnableEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkCmdSetDiscardRectangleModeEXT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L4d
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_EXT_discard_rectangles"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L51
        L4d:
            r0 = 1
            goto L52
        L51:
            r0 = 0
        L52:
            return r0
    }

    private static boolean check_EXT_display_control(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_EXT_display_control"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 4
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 227(0xe3, float:3.18E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 228(0xe4, float:3.2E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 229(0xe5, float:3.21E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 230(0xe6, float:3.22E-43)
            r3[r4] = r5
            r3 = 4
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkDisplayPowerControlEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkRegisterDeviceEventEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkRegisterDisplayEventEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "vkGetSwapchainCounterEXT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L59
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_EXT_display_control"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L5d
        L59:
            r0 = 1
            goto L5e
        L5d:
            r0 = 0
        L5e:
            return r0
    }

    private static boolean check_EXT_extended_dynamic_state(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_EXT_extended_dynamic_state"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 12
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 231(0xe7, float:3.24E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 232(0xe8, float:3.25E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 233(0xe9, float:3.27E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 234(0xea, float:3.28E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 235(0xeb, float:3.3E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 5
            r5 = 236(0xec, float:3.31E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 6
            r5 = 237(0xed, float:3.32E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 7
            r5 = 238(0xee, float:3.34E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 8
            r5 = 239(0xef, float:3.35E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 9
            r5 = 240(0xf0, float:3.36E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 10
            r5 = 241(0xf1, float:3.38E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 11
            r5 = 242(0xf2, float:3.39E-43)
            r3[r4] = r5
            r3 = 12
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCmdSetCullModeEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkCmdSetFrontFaceEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkCmdSetPrimitiveTopologyEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "vkCmdSetViewportWithCountEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "vkCmdSetScissorWithCountEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 5
            java.lang.String r6 = "vkCmdBindVertexBuffers2EXT"
            r4[r5] = r6
            r4 = r3
            r5 = 6
            java.lang.String r6 = "vkCmdSetDepthTestEnableEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 7
            java.lang.String r6 = "vkCmdSetDepthWriteEnableEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 8
            java.lang.String r6 = "vkCmdSetDepthCompareOpEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 9
            java.lang.String r6 = "vkCmdSetDepthBoundsTestEnableEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 10
            java.lang.String r6 = "vkCmdSetStencilTestEnableEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 11
            java.lang.String r6 = "vkCmdSetStencilOpEXT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto Lc7
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_EXT_extended_dynamic_state"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto Lcb
        Lc7:
            r0 = 1
            goto Lcc
        Lcb:
            r0 = 0
        Lcc:
            return r0
    }

    private static boolean check_EXT_extended_dynamic_state2(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_EXT_extended_dynamic_state2"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 5
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 243(0xf3, float:3.4E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 244(0xf4, float:3.42E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 245(0xf5, float:3.43E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 246(0xf6, float:3.45E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 247(0xf7, float:3.46E-43)
            r3[r4] = r5
            r3 = 5
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCmdSetPatchControlPointsEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkCmdSetRasterizerDiscardEnableEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkCmdSetDepthBiasEnableEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "vkCmdSetLogicOpEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "vkCmdSetPrimitiveRestartEnableEXT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L65
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_EXT_extended_dynamic_state2"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L69
        L65:
            r0 = 1
            goto L6a
        L69:
            r0 = 0
        L6a:
            return r0
    }

    private static boolean check_EXT_extended_dynamic_state3(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_EXT_extended_dynamic_state3"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r10
            java.lang.String r1 = "VK_NV_clip_space_w_scaling"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L1e
            r0 = 0
            goto L21
        L1e:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L21:
            r11 = r0
            r0 = r10
            java.lang.String r1 = "VK_NV_viewport_swizzle"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L32
            r0 = 0
            goto L35
        L32:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L35:
            r12 = r0
            r0 = r10
            java.lang.String r1 = "VK_NV_fragment_coverage_to_color"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L47
            r0 = 0
            goto L4a
        L47:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L4a:
            r13 = r0
            r0 = r10
            java.lang.String r1 = "VK_NV_framebuffer_mixed_samples"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L5c
            r0 = 0
            goto L5f
        L5c:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L5f:
            r14 = r0
            r0 = r10
            java.lang.String r1 = "VK_NV_shading_rate_image"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L71
            r0 = 0
            goto L74
        L71:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L74:
            r15 = r0
            r0 = r10
            java.lang.String r1 = "VK_NV_representative_fragment_test"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L86
            r0 = 0
            goto L89
        L86:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L89:
            r16 = r0
            r0 = r10
            java.lang.String r1 = "VK_NV_coverage_reduction_mode"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L9b
            r0 = 0
            goto L9e
        L9b:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L9e:
            r17 = r0
            r0 = r8
            r1 = r9
            r2 = 31
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 248(0xf8, float:3.48E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 249(0xf9, float:3.49E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 250(0xfa, float:3.5E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 251(0xfb, float:3.52E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 252(0xfc, float:3.53E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 5
            r5 = 253(0xfd, float:3.55E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 6
            r5 = 254(0xfe, float:3.56E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 7
            r5 = 255(0xff, float:3.57E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 8
            r5 = 256(0x100, float:3.59E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 9
            r5 = 257(0x101, float:3.6E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 10
            r5 = 258(0x102, float:3.62E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 11
            r5 = 259(0x103, float:3.63E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 12
            r5 = 260(0x104, float:3.64E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 13
            r5 = 261(0x105, float:3.66E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 14
            r5 = 262(0x106, float:3.67E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 15
            r5 = 263(0x107, float:3.69E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 16
            r5 = 264(0x108, float:3.7E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 17
            r5 = 265(0x109, float:3.71E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 18
            r5 = 266(0x10a, float:3.73E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 19
            r5 = 267(0x10b, float:3.74E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 20
            r5 = 268(0x10c, float:3.76E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 21
            r5 = r11
            r6 = 269(0x10d, float:3.77E-43)
            int r5 = r5 + r6
            r3[r4] = r5
            r3 = r2
            r4 = 22
            r5 = r12
            r6 = 270(0x10e, float:3.78E-43)
            int r5 = r5 + r6
            r3[r4] = r5
            r3 = r2
            r4 = 23
            r5 = r13
            r6 = 271(0x10f, float:3.8E-43)
            int r5 = r5 + r6
            r3[r4] = r5
            r3 = r2
            r4 = 24
            r5 = r13
            r6 = 272(0x110, float:3.81E-43)
            int r5 = r5 + r6
            r3[r4] = r5
            r3 = r2
            r4 = 25
            r5 = r14
            r6 = 273(0x111, float:3.83E-43)
            int r5 = r5 + r6
            r3[r4] = r5
            r3 = r2
            r4 = 26
            r5 = r14
            r6 = 274(0x112, float:3.84E-43)
            int r5 = r5 + r6
            r3[r4] = r5
            r3 = r2
            r4 = 27
            r5 = r14
            r6 = 275(0x113, float:3.85E-43)
            int r5 = r5 + r6
            r3[r4] = r5
            r3 = r2
            r4 = 28
            r5 = r15
            r6 = 276(0x114, float:3.87E-43)
            int r5 = r5 + r6
            r3[r4] = r5
            r3 = r2
            r4 = 29
            r5 = r16
            r6 = 277(0x115, float:3.88E-43)
            int r5 = r5 + r6
            r3[r4] = r5
            r3 = r2
            r4 = 30
            r5 = r17
            r6 = 278(0x116, float:3.9E-43)
            int r5 = r5 + r6
            r3[r4] = r5
            r3 = 31
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCmdSetTessellationDomainOriginEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkCmdSetDepthClampEnableEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkCmdSetPolygonModeEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "vkCmdSetRasterizationSamplesEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "vkCmdSetSampleMaskEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 5
            java.lang.String r6 = "vkCmdSetAlphaToCoverageEnableEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 6
            java.lang.String r6 = "vkCmdSetAlphaToOneEnableEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 7
            java.lang.String r6 = "vkCmdSetLogicOpEnableEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 8
            java.lang.String r6 = "vkCmdSetColorBlendEnableEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 9
            java.lang.String r6 = "vkCmdSetColorBlendEquationEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 10
            java.lang.String r6 = "vkCmdSetColorWriteMaskEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 11
            java.lang.String r6 = "vkCmdSetRasterizationStreamEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 12
            java.lang.String r6 = "vkCmdSetConservativeRasterizationModeEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 13
            java.lang.String r6 = "vkCmdSetExtraPrimitiveOverestimationSizeEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 14
            java.lang.String r6 = "vkCmdSetDepthClipEnableEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 15
            java.lang.String r6 = "vkCmdSetSampleLocationsEnableEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 16
            java.lang.String r6 = "vkCmdSetColorBlendAdvancedEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 17
            java.lang.String r6 = "vkCmdSetProvokingVertexModeEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 18
            java.lang.String r6 = "vkCmdSetLineRasterizationModeEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 19
            java.lang.String r6 = "vkCmdSetLineStippleEnableEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 20
            java.lang.String r6 = "vkCmdSetDepthClipNegativeOneToOneEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 21
            java.lang.String r6 = "vkCmdSetViewportWScalingEnableNV"
            r4[r5] = r6
            r4 = r3
            r5 = 22
            java.lang.String r6 = "vkCmdSetViewportSwizzleNV"
            r4[r5] = r6
            r4 = r3
            r5 = 23
            java.lang.String r6 = "vkCmdSetCoverageToColorEnableNV"
            r4[r5] = r6
            r4 = r3
            r5 = 24
            java.lang.String r6 = "vkCmdSetCoverageToColorLocationNV"
            r4[r5] = r6
            r4 = r3
            r5 = 25
            java.lang.String r6 = "vkCmdSetCoverageModulationModeNV"
            r4[r5] = r6
            r4 = r3
            r5 = 26
            java.lang.String r6 = "vkCmdSetCoverageModulationTableEnableNV"
            r4[r5] = r6
            r4 = r3
            r5 = 27
            java.lang.String r6 = "vkCmdSetCoverageModulationTableNV"
            r4[r5] = r6
            r4 = r3
            r5 = 28
            java.lang.String r6 = "vkCmdSetShadingRateImageEnableNV"
            r4[r5] = r6
            r4 = r3
            r5 = 29
            java.lang.String r6 = "vkCmdSetRepresentativeFragmentTestEnableNV"
            r4[r5] = r6
            r4 = r3
            r5 = 30
            java.lang.String r6 = "vkCmdSetCoverageReductionModeNV"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L280
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_EXT_extended_dynamic_state3"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L284
        L280:
            r0 = 1
            goto L285
        L284:
            r0 = 0
        L285:
            return r0
    }

    private static boolean check_EXT_external_memory_host(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_EXT_external_memory_host"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 279(0x117, float:3.91E-43)
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkGetMemoryHostPointerPropertiesEXT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L35
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_EXT_external_memory_host"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L39
        L35:
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
    }

    private static boolean check_EXT_full_screen_exclusive(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_EXT_full_screen_exclusive"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r10
            java.lang.String r1 = "VK_KHR_device_group"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L26
            r0 = r10
            java.lang.String r1 = "Vulkan11"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L2a
        L26:
            r0 = 0
            goto L2d
        L2a:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L2d:
            r11 = r0
            r0 = r8
            r1 = r9
            r2 = 3
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 280(0x118, float:3.92E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 281(0x119, float:3.94E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r11
            r6 = 282(0x11a, float:3.95E-43)
            int r5 = r5 + r6
            r3[r4] = r5
            r3 = 3
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkAcquireFullScreenExclusiveModeEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkReleaseFullScreenExclusiveModeEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkGetDeviceGroupSurfacePresentModes2EXT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L6f
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_EXT_full_screen_exclusive"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L73
        L6f:
            r0 = 1
            goto L74
        L73:
            r0 = 0
        L74:
            return r0
    }

    private static boolean check_EXT_hdr_metadata(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_EXT_hdr_metadata"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 283(0x11b, float:3.97E-43)
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkSetHdrMetadataEXT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L35
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_EXT_hdr_metadata"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L39
        L35:
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
    }

    private static boolean check_EXT_host_image_copy(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_EXT_host_image_copy"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 5
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 284(0x11c, float:3.98E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 285(0x11d, float:4.0E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 286(0x11e, float:4.01E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 287(0x11f, float:4.02E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 288(0x120, float:4.04E-43)
            r3[r4] = r5
            r3 = 5
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCopyMemoryToImageEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkCopyImageToMemoryEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkCopyImageToImageEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "vkTransitionImageLayoutEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "vkGetImageSubresourceLayout2EXT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L65
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_EXT_host_image_copy"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L69
        L65:
            r0 = 1
            goto L6a
        L69:
            r0 = 0
        L6a:
            return r0
    }

    private static boolean check_EXT_host_query_reset(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_EXT_host_query_reset"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 289(0x121, float:4.05E-43)
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkResetQueryPoolEXT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L35
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_EXT_host_query_reset"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L39
        L35:
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
    }

    private static boolean check_EXT_image_compression_control(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_EXT_image_compression_control"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 288(0x120, float:4.04E-43)
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkGetImageSubresourceLayout2EXT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L35
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_EXT_image_compression_control"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L39
        L35:
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
    }

    private static boolean check_EXT_image_drm_format_modifier(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_EXT_image_drm_format_modifier"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 290(0x122, float:4.06E-43)
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkGetImageDrmFormatModifierPropertiesEXT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L35
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_EXT_image_drm_format_modifier"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L39
        L35:
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
    }

    private static boolean check_EXT_line_rasterization(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_EXT_line_rasterization"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 291(0x123, float:4.08E-43)
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCmdSetLineStippleEXT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L35
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_EXT_line_rasterization"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L39
        L35:
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
    }

    private static boolean check_EXT_mesh_shader(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_EXT_mesh_shader"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 3
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 292(0x124, float:4.09E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 293(0x125, float:4.1E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 294(0x126, float:4.12E-43)
            r3[r4] = r5
            r3 = 3
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCmdDrawMeshTasksEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkCmdDrawMeshTasksIndirectEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkCmdDrawMeshTasksIndirectCountEXT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L4d
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_EXT_mesh_shader"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L51
        L4d:
            r0 = 1
            goto L52
        L51:
            r0 = 0
        L52:
            return r0
    }

    private static boolean check_EXT_metal_objects(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_EXT_metal_objects"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 295(0x127, float:4.13E-43)
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkExportMetalObjectsEXT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L35
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_EXT_metal_objects"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L39
        L35:
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
    }

    private static boolean check_EXT_multi_draw(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_EXT_multi_draw"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 2
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 296(0x128, float:4.15E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 297(0x129, float:4.16E-43)
            r3[r4] = r5
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCmdDrawMultiEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkCmdDrawMultiIndexedEXT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L41
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_EXT_multi_draw"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L45
        L41:
            r0 = 1
            goto L46
        L45:
            r0 = 0
        L46:
            return r0
    }

    private static boolean check_EXT_opacity_micromap(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_EXT_opacity_micromap"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 14
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 298(0x12a, float:4.18E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 299(0x12b, float:4.19E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 300(0x12c, float:4.2E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 301(0x12d, float:4.22E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 302(0x12e, float:4.23E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 5
            r5 = 303(0x12f, float:4.25E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 6
            r5 = 304(0x130, float:4.26E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 7
            r5 = 305(0x131, float:4.27E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 8
            r5 = 306(0x132, float:4.29E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 9
            r5 = 307(0x133, float:4.3E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 10
            r5 = 308(0x134, float:4.32E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 11
            r5 = 309(0x135, float:4.33E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 12
            r5 = 310(0x136, float:4.34E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 13
            r5 = 311(0x137, float:4.36E-43)
            r3[r4] = r5
            r3 = 14
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCreateMicromapEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkDestroyMicromapEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkCmdBuildMicromapsEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "vkBuildMicromapsEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "vkCopyMicromapEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 5
            java.lang.String r6 = "vkCopyMicromapToMemoryEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 6
            java.lang.String r6 = "vkCopyMemoryToMicromapEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 7
            java.lang.String r6 = "vkWriteMicromapsPropertiesEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 8
            java.lang.String r6 = "vkCmdCopyMicromapEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 9
            java.lang.String r6 = "vkCmdCopyMicromapToMemoryEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 10
            java.lang.String r6 = "vkCmdCopyMemoryToMicromapEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 11
            java.lang.String r6 = "vkCmdWriteMicromapsPropertiesEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 12
            java.lang.String r6 = "vkGetDeviceMicromapCompatibilityEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 13
            java.lang.String r6 = "vkGetMicromapBuildSizesEXT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto Le3
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_EXT_opacity_micromap"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto Le7
        Le3:
            r0 = 1
            goto Le8
        Le7:
            r0 = 0
        Le8:
            return r0
    }

    private static boolean check_EXT_pageable_device_local_memory(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_EXT_pageable_device_local_memory"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 312(0x138, float:4.37E-43)
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkSetDeviceMemoryPriorityEXT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L35
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_EXT_pageable_device_local_memory"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L39
        L35:
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
    }

    private static boolean check_EXT_pipeline_properties(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_EXT_pipeline_properties"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 313(0x139, float:4.39E-43)
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkGetPipelinePropertiesEXT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L35
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_EXT_pipeline_properties"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L39
        L35:
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
    }

    private static boolean check_EXT_private_data(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_EXT_private_data"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 4
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 314(0x13a, float:4.4E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 315(0x13b, float:4.41E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 316(0x13c, float:4.43E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 317(0x13d, float:4.44E-43)
            r3[r4] = r5
            r3 = 4
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCreatePrivateDataSlotEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkDestroyPrivateDataSlotEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkSetPrivateDataEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "vkGetPrivateDataEXT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L59
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_EXT_private_data"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L5d
        L59:
            r0 = 1
            goto L5e
        L5d:
            r0 = 0
        L5e:
            return r0
    }

    private static boolean check_EXT_sample_locations(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_EXT_sample_locations"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 318(0x13e, float:4.46E-43)
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCmdSetSampleLocationsEXT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L35
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_EXT_sample_locations"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L39
        L35:
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
    }

    private static boolean check_EXT_shader_module_identifier(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_EXT_shader_module_identifier"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 2
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 319(0x13f, float:4.47E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 320(0x140, float:4.48E-43)
            r3[r4] = r5
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkGetShaderModuleIdentifierEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkGetShaderModuleCreateInfoIdentifierEXT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L41
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_EXT_shader_module_identifier"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L45
        L41:
            r0 = 1
            goto L46
        L45:
            r0 = 0
        L46:
            return r0
    }

    private static boolean check_EXT_shader_object(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_EXT_shader_object"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r10
            java.lang.String r1 = "VK_NV_clip_space_w_scaling"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L1e
            r0 = 0
            goto L21
        L1e:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L21:
            r11 = r0
            r0 = r10
            java.lang.String r1 = "VK_NV_viewport_swizzle"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L32
            r0 = 0
            goto L35
        L32:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L35:
            r12 = r0
            r0 = r10
            java.lang.String r1 = "VK_NV_fragment_coverage_to_color"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L47
            r0 = 0
            goto L4a
        L47:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L4a:
            r13 = r0
            r0 = r10
            java.lang.String r1 = "VK_NV_framebuffer_mixed_samples"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L5c
            r0 = 0
            goto L5f
        L5c:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L5f:
            r14 = r0
            r0 = r10
            java.lang.String r1 = "VK_NV_shading_rate_image"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L71
            r0 = 0
            goto L74
        L71:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L74:
            r15 = r0
            r0 = r10
            java.lang.String r1 = "VK_NV_representative_fragment_test"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L86
            r0 = 0
            goto L89
        L86:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L89:
            r16 = r0
            r0 = r10
            java.lang.String r1 = "VK_NV_coverage_reduction_mode"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L9b
            r0 = 0
            goto L9e
        L9b:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L9e:
            r17 = r0
            r0 = r8
            r1 = r9
            r2 = 53
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 321(0x141, float:4.5E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 322(0x142, float:4.51E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 323(0x143, float:4.53E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 324(0x144, float:4.54E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 231(0xe7, float:3.24E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 5
            r5 = 232(0xe8, float:3.25E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 6
            r5 = 233(0xe9, float:3.27E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 7
            r5 = 234(0xea, float:3.28E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 8
            r5 = 235(0xeb, float:3.3E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 9
            r5 = 236(0xec, float:3.31E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 10
            r5 = 237(0xed, float:3.32E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 11
            r5 = 238(0xee, float:3.34E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 12
            r5 = 239(0xef, float:3.35E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 13
            r5 = 240(0xf0, float:3.36E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 14
            r5 = 241(0xf1, float:3.38E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 15
            r5 = 242(0xf2, float:3.39E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 16
            r5 = 325(0x145, float:4.55E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 17
            r5 = 243(0xf3, float:3.4E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 18
            r5 = 244(0xf4, float:3.42E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 19
            r5 = 245(0xf5, float:3.43E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 20
            r5 = 246(0xf6, float:3.45E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 21
            r5 = 247(0xf7, float:3.46E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 22
            r5 = 248(0xf8, float:3.48E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 23
            r5 = 249(0xf9, float:3.49E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 24
            r5 = 250(0xfa, float:3.5E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 25
            r5 = 251(0xfb, float:3.52E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 26
            r5 = 252(0xfc, float:3.53E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 27
            r5 = 253(0xfd, float:3.55E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 28
            r5 = 254(0xfe, float:3.56E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 29
            r5 = 255(0xff, float:3.57E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 30
            r5 = 256(0x100, float:3.59E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 31
            r5 = 257(0x101, float:3.6E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 32
            r5 = 258(0x102, float:3.62E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 33
            r5 = 259(0x103, float:3.63E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 34
            r5 = 260(0x104, float:3.64E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 35
            r5 = 261(0x105, float:3.66E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 36
            r5 = 262(0x106, float:3.67E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 37
            r5 = 263(0x107, float:3.69E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 38
            r5 = 264(0x108, float:3.7E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 39
            r5 = 265(0x109, float:3.71E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 40
            r5 = 266(0x10a, float:3.73E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 41
            r5 = 267(0x10b, float:3.74E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 42
            r5 = 268(0x10c, float:3.76E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 43
            r5 = r11
            r6 = 269(0x10d, float:3.77E-43)
            int r5 = r5 + r6
            r3[r4] = r5
            r3 = r2
            r4 = 44
            r5 = r12
            r6 = 270(0x10e, float:3.78E-43)
            int r5 = r5 + r6
            r3[r4] = r5
            r3 = r2
            r4 = 45
            r5 = r13
            r6 = 271(0x10f, float:3.8E-43)
            int r5 = r5 + r6
            r3[r4] = r5
            r3 = r2
            r4 = 46
            r5 = r13
            r6 = 272(0x110, float:3.81E-43)
            int r5 = r5 + r6
            r3[r4] = r5
            r3 = r2
            r4 = 47
            r5 = r14
            r6 = 273(0x111, float:3.83E-43)
            int r5 = r5 + r6
            r3[r4] = r5
            r3 = r2
            r4 = 48
            r5 = r14
            r6 = 274(0x112, float:3.84E-43)
            int r5 = r5 + r6
            r3[r4] = r5
            r3 = r2
            r4 = 49
            r5 = r14
            r6 = 275(0x113, float:3.85E-43)
            int r5 = r5 + r6
            r3[r4] = r5
            r3 = r2
            r4 = 50
            r5 = r15
            r6 = 276(0x114, float:3.87E-43)
            int r5 = r5 + r6
            r3[r4] = r5
            r3 = r2
            r4 = 51
            r5 = r16
            r6 = 277(0x115, float:3.88E-43)
            int r5 = r5 + r6
            r3[r4] = r5
            r3 = r2
            r4 = 52
            r5 = r17
            r6 = 278(0x116, float:3.9E-43)
            int r5 = r5 + r6
            r3[r4] = r5
            r3 = 53
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCreateShadersEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkDestroyShaderEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkGetShaderBinaryDataEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "vkCmdBindShadersEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "vkCmdSetCullModeEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 5
            java.lang.String r6 = "vkCmdSetFrontFaceEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 6
            java.lang.String r6 = "vkCmdSetPrimitiveTopologyEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 7
            java.lang.String r6 = "vkCmdSetViewportWithCountEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 8
            java.lang.String r6 = "vkCmdSetScissorWithCountEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 9
            java.lang.String r6 = "vkCmdBindVertexBuffers2EXT"
            r4[r5] = r6
            r4 = r3
            r5 = 10
            java.lang.String r6 = "vkCmdSetDepthTestEnableEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 11
            java.lang.String r6 = "vkCmdSetDepthWriteEnableEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 12
            java.lang.String r6 = "vkCmdSetDepthCompareOpEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 13
            java.lang.String r6 = "vkCmdSetDepthBoundsTestEnableEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 14
            java.lang.String r6 = "vkCmdSetStencilTestEnableEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 15
            java.lang.String r6 = "vkCmdSetStencilOpEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 16
            java.lang.String r6 = "vkCmdSetVertexInputEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 17
            java.lang.String r6 = "vkCmdSetPatchControlPointsEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 18
            java.lang.String r6 = "vkCmdSetRasterizerDiscardEnableEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 19
            java.lang.String r6 = "vkCmdSetDepthBiasEnableEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 20
            java.lang.String r6 = "vkCmdSetLogicOpEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 21
            java.lang.String r6 = "vkCmdSetPrimitiveRestartEnableEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 22
            java.lang.String r6 = "vkCmdSetTessellationDomainOriginEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 23
            java.lang.String r6 = "vkCmdSetDepthClampEnableEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 24
            java.lang.String r6 = "vkCmdSetPolygonModeEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 25
            java.lang.String r6 = "vkCmdSetRasterizationSamplesEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 26
            java.lang.String r6 = "vkCmdSetSampleMaskEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 27
            java.lang.String r6 = "vkCmdSetAlphaToCoverageEnableEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 28
            java.lang.String r6 = "vkCmdSetAlphaToOneEnableEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 29
            java.lang.String r6 = "vkCmdSetLogicOpEnableEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 30
            java.lang.String r6 = "vkCmdSetColorBlendEnableEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 31
            java.lang.String r6 = "vkCmdSetColorBlendEquationEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 32
            java.lang.String r6 = "vkCmdSetColorWriteMaskEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 33
            java.lang.String r6 = "vkCmdSetRasterizationStreamEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 34
            java.lang.String r6 = "vkCmdSetConservativeRasterizationModeEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 35
            java.lang.String r6 = "vkCmdSetExtraPrimitiveOverestimationSizeEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 36
            java.lang.String r6 = "vkCmdSetDepthClipEnableEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 37
            java.lang.String r6 = "vkCmdSetSampleLocationsEnableEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 38
            java.lang.String r6 = "vkCmdSetColorBlendAdvancedEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 39
            java.lang.String r6 = "vkCmdSetProvokingVertexModeEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 40
            java.lang.String r6 = "vkCmdSetLineRasterizationModeEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 41
            java.lang.String r6 = "vkCmdSetLineStippleEnableEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 42
            java.lang.String r6 = "vkCmdSetDepthClipNegativeOneToOneEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 43
            java.lang.String r6 = "vkCmdSetViewportWScalingEnableNV"
            r4[r5] = r6
            r4 = r3
            r5 = 44
            java.lang.String r6 = "vkCmdSetViewportSwizzleNV"
            r4[r5] = r6
            r4 = r3
            r5 = 45
            java.lang.String r6 = "vkCmdSetCoverageToColorEnableNV"
            r4[r5] = r6
            r4 = r3
            r5 = 46
            java.lang.String r6 = "vkCmdSetCoverageToColorLocationNV"
            r4[r5] = r6
            r4 = r3
            r5 = 47
            java.lang.String r6 = "vkCmdSetCoverageModulationModeNV"
            r4[r5] = r6
            r4 = r3
            r5 = 48
            java.lang.String r6 = "vkCmdSetCoverageModulationTableEnableNV"
            r4[r5] = r6
            r4 = r3
            r5 = 49
            java.lang.String r6 = "vkCmdSetCoverageModulationTableNV"
            r4[r5] = r6
            r4 = r3
            r5 = 50
            java.lang.String r6 = "vkCmdSetShadingRateImageEnableNV"
            r4[r5] = r6
            r4 = r3
            r5 = 51
            java.lang.String r6 = "vkCmdSetRepresentativeFragmentTestEnableNV"
            r4[r5] = r6
            r4 = r3
            r5 = 52
            java.lang.String r6 = "vkCmdSetCoverageReductionModeNV"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L3b4
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_EXT_shader_object"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L3b8
        L3b4:
            r0 = 1
            goto L3b9
        L3b8:
            r0 = 0
        L3b9:
            return r0
    }

    private static boolean check_EXT_swapchain_maintenance1(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_EXT_swapchain_maintenance1"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 326(0x146, float:4.57E-43)
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkReleaseSwapchainImagesEXT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L35
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_EXT_swapchain_maintenance1"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L39
        L35:
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
    }

    private static boolean check_EXT_transform_feedback(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_EXT_transform_feedback"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 6
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 327(0x147, float:4.58E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 328(0x148, float:4.6E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 329(0x149, float:4.61E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 330(0x14a, float:4.62E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 331(0x14b, float:4.64E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 5
            r5 = 332(0x14c, float:4.65E-43)
            r3[r4] = r5
            r3 = 6
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCmdBindTransformFeedbackBuffersEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkCmdBeginTransformFeedbackEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkCmdEndTransformFeedbackEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "vkCmdBeginQueryIndexedEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "vkCmdEndQueryIndexedEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 5
            java.lang.String r6 = "vkCmdDrawIndirectByteCountEXT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L73
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_EXT_transform_feedback"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L77
        L73:
            r0 = 1
            goto L78
        L77:
            r0 = 0
        L78:
            return r0
    }

    private static boolean check_EXT_validation_cache(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_EXT_validation_cache"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 4
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 333(0x14d, float:4.67E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 334(0x14e, float:4.68E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 335(0x14f, float:4.7E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 336(0x150, float:4.71E-43)
            r3[r4] = r5
            r3 = 4
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCreateValidationCacheEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkDestroyValidationCacheEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkMergeValidationCachesEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "vkGetValidationCacheDataEXT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L59
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_EXT_validation_cache"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L5d
        L59:
            r0 = 1
            goto L5e
        L5d:
            r0 = 0
        L5e:
            return r0
    }

    private static boolean check_EXT_vertex_input_dynamic_state(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_EXT_vertex_input_dynamic_state"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 325(0x145, float:4.55E-43)
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCmdSetVertexInputEXT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L35
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_EXT_vertex_input_dynamic_state"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L39
        L35:
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
    }

    private static boolean check_GOOGLE_display_timing(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_GOOGLE_display_timing"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 2
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 337(0x151, float:4.72E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 338(0x152, float:4.74E-43)
            r3[r4] = r5
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkGetRefreshCycleDurationGOOGLE"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkGetPastPresentationTimingGOOGLE"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L41
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_GOOGLE_display_timing"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L45
        L41:
            r0 = 1
            goto L46
        L45:
            r0 = 0
        L46:
            return r0
    }

    private static boolean check_HUAWEI_cluster_culling_shader(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_HUAWEI_cluster_culling_shader"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 2
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 339(0x153, float:4.75E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 340(0x154, float:4.76E-43)
            r3[r4] = r5
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCmdDrawClusterHUAWEI"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkCmdDrawClusterIndirectHUAWEI"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L41
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_HUAWEI_cluster_culling_shader"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L45
        L41:
            r0 = 1
            goto L46
        L45:
            r0 = 0
        L46:
            return r0
    }

    private static boolean check_HUAWEI_invocation_mask(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_HUAWEI_invocation_mask"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 341(0x155, float:4.78E-43)
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCmdBindInvocationMaskHUAWEI"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L35
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_HUAWEI_invocation_mask"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L39
        L35:
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
    }

    private static boolean check_HUAWEI_subpass_shading(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_HUAWEI_subpass_shading"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 2
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 342(0x156, float:4.79E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 343(0x157, float:4.8E-43)
            r3[r4] = r5
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkCmdSubpassShadingHUAWEI"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L41
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_HUAWEI_subpass_shading"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L45
        L41:
            r0 = 1
            goto L46
        L45:
            r0 = 0
        L46:
            return r0
    }

    private static boolean check_INTEL_performance_query(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_INTEL_performance_query"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 9
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 344(0x158, float:4.82E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 345(0x159, float:4.83E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 346(0x15a, float:4.85E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 347(0x15b, float:4.86E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 348(0x15c, float:4.88E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 5
            r5 = 349(0x15d, float:4.89E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 6
            r5 = 350(0x15e, float:4.9E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 7
            r5 = 351(0x15f, float:4.92E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 8
            r5 = 352(0x160, float:4.93E-43)
            r3[r4] = r5
            r3 = 9
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkInitializePerformanceApiINTEL"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkUninitializePerformanceApiINTEL"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkCmdSetPerformanceMarkerINTEL"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "vkCmdSetPerformanceStreamMarkerINTEL"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "vkCmdSetPerformanceOverrideINTEL"
            r4[r5] = r6
            r4 = r3
            r5 = 5
            java.lang.String r6 = "vkAcquirePerformanceConfigurationINTEL"
            r4[r5] = r6
            r4 = r3
            r5 = 6
            java.lang.String r6 = "vkReleasePerformanceConfigurationINTEL"
            r4[r5] = r6
            r4 = r3
            r5 = 7
            java.lang.String r6 = "vkQueueSetPerformanceConfigurationINTEL"
            r4[r5] = r6
            r4 = r3
            r5 = 8
            java.lang.String r6 = "vkGetPerformanceParameterINTEL"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L9d
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_INTEL_performance_query"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto La1
        L9d:
            r0 = 1
            goto La2
        La1:
            r0 = 0
        La2:
            return r0
    }

    private static boolean check_KHR_acceleration_structure(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_KHR_acceleration_structure"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 16
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 353(0x161, float:4.95E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 354(0x162, float:4.96E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 355(0x163, float:4.97E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 356(0x164, float:4.99E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 357(0x165, float:5.0E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 5
            r5 = 358(0x166, float:5.02E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 6
            r5 = 359(0x167, float:5.03E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 7
            r5 = 360(0x168, float:5.04E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 8
            r5 = 361(0x169, float:5.06E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 9
            r5 = 362(0x16a, float:5.07E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 10
            r5 = 363(0x16b, float:5.09E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 11
            r5 = 364(0x16c, float:5.1E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 12
            r5 = 365(0x16d, float:5.11E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 13
            r5 = 366(0x16e, float:5.13E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 14
            r5 = 367(0x16f, float:5.14E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 15
            r5 = 368(0x170, float:5.16E-43)
            r3[r4] = r5
            r3 = 16
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCreateAccelerationStructureKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkDestroyAccelerationStructureKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkCmdBuildAccelerationStructuresKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "vkCmdBuildAccelerationStructuresIndirectKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "vkBuildAccelerationStructuresKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 5
            java.lang.String r6 = "vkCopyAccelerationStructureKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 6
            java.lang.String r6 = "vkCopyAccelerationStructureToMemoryKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 7
            java.lang.String r6 = "vkCopyMemoryToAccelerationStructureKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 8
            java.lang.String r6 = "vkWriteAccelerationStructuresPropertiesKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 9
            java.lang.String r6 = "vkCmdCopyAccelerationStructureKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 10
            java.lang.String r6 = "vkCmdCopyAccelerationStructureToMemoryKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 11
            java.lang.String r6 = "vkCmdCopyMemoryToAccelerationStructureKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 12
            java.lang.String r6 = "vkGetAccelerationStructureDeviceAddressKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 13
            java.lang.String r6 = "vkCmdWriteAccelerationStructuresPropertiesKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 14
            java.lang.String r6 = "vkGetDeviceAccelerationStructureCompatibilityKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 15
            java.lang.String r6 = "vkGetAccelerationStructureBuildSizesKHR"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto Lff
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_KHR_acceleration_structure"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L103
        Lff:
            r0 = 1
            goto L104
        L103:
            r0 = 0
        L104:
            return r0
    }

    private static boolean check_KHR_bind_memory2(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_KHR_bind_memory2"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 2
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 369(0x171, float:5.17E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 370(0x172, float:5.18E-43)
            r3[r4] = r5
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkBindBufferMemory2KHR"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkBindImageMemory2KHR"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L41
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_KHR_bind_memory2"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L45
        L41:
            r0 = 1
            goto L46
        L45:
            r0 = 0
        L46:
            return r0
    }

    private static boolean check_KHR_buffer_device_address(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_KHR_buffer_device_address"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 3
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 371(0x173, float:5.2E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 372(0x174, float:5.21E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 373(0x175, float:5.23E-43)
            r3[r4] = r5
            r3 = 3
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkGetBufferDeviceAddressKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkGetBufferOpaqueCaptureAddressKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkGetDeviceMemoryOpaqueCaptureAddressKHR"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L4d
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_KHR_buffer_device_address"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L51
        L4d:
            r0 = 1
            goto L52
        L51:
            r0 = 0
        L52:
            return r0
    }

    private static boolean check_KHR_copy_commands2(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_KHR_copy_commands2"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 6
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 374(0x176, float:5.24E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 375(0x177, float:5.25E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 376(0x178, float:5.27E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 377(0x179, float:5.28E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 378(0x17a, float:5.3E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 5
            r5 = 379(0x17b, float:5.31E-43)
            r3[r4] = r5
            r3 = 6
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCmdCopyBuffer2KHR"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkCmdCopyImage2KHR"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkCmdCopyBufferToImage2KHR"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "vkCmdCopyImageToBuffer2KHR"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "vkCmdBlitImage2KHR"
            r4[r5] = r6
            r4 = r3
            r5 = 5
            java.lang.String r6 = "vkCmdResolveImage2KHR"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L73
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_KHR_copy_commands2"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L77
        L73:
            r0 = 1
            goto L78
        L77:
            r0 = 0
        L78:
            return r0
    }

    private static boolean check_KHR_create_renderpass2(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_KHR_create_renderpass2"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 4
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 380(0x17c, float:5.32E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 381(0x17d, float:5.34E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 382(0x17e, float:5.35E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 383(0x17f, float:5.37E-43)
            r3[r4] = r5
            r3 = 4
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCreateRenderPass2KHR"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkCmdBeginRenderPass2KHR"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkCmdNextSubpass2KHR"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "vkCmdEndRenderPass2KHR"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L59
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_KHR_create_renderpass2"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L5d
        L59:
            r0 = 1
            goto L5e
        L5d:
            r0 = 0
        L5e:
            return r0
    }

    private static boolean check_KHR_deferred_host_operations(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_KHR_deferred_host_operations"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 5
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 384(0x180, float:5.38E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 385(0x181, float:5.4E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 386(0x182, float:5.41E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 387(0x183, float:5.42E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 388(0x184, float:5.44E-43)
            r3[r4] = r5
            r3 = 5
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCreateDeferredOperationKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkDestroyDeferredOperationKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkGetDeferredOperationMaxConcurrencyKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "vkGetDeferredOperationResultKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "vkDeferredOperationJoinKHR"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L65
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_KHR_deferred_host_operations"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L69
        L65:
            r0 = 1
            goto L6a
        L69:
            r0 = 0
        L6a:
            return r0
    }

    private static boolean check_KHR_descriptor_update_template(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_KHR_descriptor_update_template"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r10
            java.lang.String r1 = "VK_KHR_push_descriptor"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L1e
            r0 = 0
            goto L21
        L1e:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L21:
            r11 = r0
            r0 = r8
            r1 = r9
            r2 = 4
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 389(0x185, float:5.45E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 390(0x186, float:5.47E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 391(0x187, float:5.48E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = r11
            r6 = 392(0x188, float:5.5E-43)
            int r5 = r5 + r6
            r3[r4] = r5
            r3 = 4
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCreateDescriptorUpdateTemplateKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkDestroyDescriptorUpdateTemplateKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkUpdateDescriptorSetWithTemplateKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "vkCmdPushDescriptorSetWithTemplateKHR"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L6f
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_KHR_descriptor_update_template"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L73
        L6f:
            r0 = 1
            goto L74
        L73:
            r0 = 0
        L74:
            return r0
    }

    private static boolean check_KHR_device_group(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_KHR_device_group"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r10
            java.lang.String r1 = "VK_KHR_surface"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L1e
            r0 = 0
            goto L21
        L1e:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L21:
            r11 = r0
            r0 = r10
            java.lang.String r1 = "VK_KHR_swapchain"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L32
            r0 = 0
            goto L35
        L32:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L35:
            r12 = r0
            r0 = r8
            r1 = r9
            r2 = 6
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 393(0x189, float:5.51E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 394(0x18a, float:5.52E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 395(0x18b, float:5.54E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = r11
            r6 = 396(0x18c, float:5.55E-43)
            int r5 = r5 + r6
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = r11
            r6 = 397(0x18d, float:5.56E-43)
            int r5 = r5 + r6
            r3[r4] = r5
            r3 = r2
            r4 = 5
            r5 = r12
            r6 = 398(0x18e, float:5.58E-43)
            int r5 = r5 + r6
            r3[r4] = r5
            r3 = 6
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkGetDeviceGroupPeerMemoryFeaturesKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkCmdSetDeviceMaskKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkCmdDispatchBaseKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "vkGetDeviceGroupPresentCapabilitiesKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "vkGetDeviceGroupSurfacePresentModesKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 5
            java.lang.String r6 = "vkAcquireNextImage2KHR"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto La3
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_KHR_device_group"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto La7
        La3:
            r0 = 1
            goto La8
        La7:
            r0 = 0
        La8:
            return r0
    }

    private static boolean check_KHR_display_swapchain(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_KHR_display_swapchain"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 399(0x18f, float:5.59E-43)
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCreateSharedSwapchainsKHR"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L35
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_KHR_display_swapchain"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L39
        L35:
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
    }

    private static boolean check_KHR_draw_indirect_count(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_KHR_draw_indirect_count"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 2
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 400(0x190, float:5.6E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 401(0x191, float:5.62E-43)
            r3[r4] = r5
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCmdDrawIndirectCountKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkCmdDrawIndexedIndirectCountKHR"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L41
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_KHR_draw_indirect_count"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L45
        L41:
            r0 = 1
            goto L46
        L45:
            r0 = 0
        L46:
            return r0
    }

    private static boolean check_KHR_dynamic_rendering(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_KHR_dynamic_rendering"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 2
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 402(0x192, float:5.63E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 403(0x193, float:5.65E-43)
            r3[r4] = r5
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCmdBeginRenderingKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkCmdEndRenderingKHR"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L41
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_KHR_dynamic_rendering"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L45
        L41:
            r0 = 1
            goto L46
        L45:
            r0 = 0
        L46:
            return r0
    }

    private static boolean check_KHR_external_fence_fd(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_KHR_external_fence_fd"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 2
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 404(0x194, float:5.66E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 405(0x195, float:5.68E-43)
            r3[r4] = r5
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkImportFenceFdKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkGetFenceFdKHR"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L41
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_KHR_external_fence_fd"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L45
        L41:
            r0 = 1
            goto L46
        L45:
            r0 = 0
        L46:
            return r0
    }

    private static boolean check_KHR_external_fence_win32(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_KHR_external_fence_win32"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 2
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 406(0x196, float:5.69E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 407(0x197, float:5.7E-43)
            r3[r4] = r5
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkImportFenceWin32HandleKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkGetFenceWin32HandleKHR"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L41
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_KHR_external_fence_win32"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L45
        L41:
            r0 = 1
            goto L46
        L45:
            r0 = 0
        L46:
            return r0
    }

    private static boolean check_KHR_external_memory_fd(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_KHR_external_memory_fd"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 2
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 408(0x198, float:5.72E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 409(0x199, float:5.73E-43)
            r3[r4] = r5
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkGetMemoryFdKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkGetMemoryFdPropertiesKHR"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L41
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_KHR_external_memory_fd"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L45
        L41:
            r0 = 1
            goto L46
        L45:
            r0 = 0
        L46:
            return r0
    }

    private static boolean check_KHR_external_memory_win32(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_KHR_external_memory_win32"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 2
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 410(0x19a, float:5.75E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 411(0x19b, float:5.76E-43)
            r3[r4] = r5
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkGetMemoryWin32HandleKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkGetMemoryWin32HandlePropertiesKHR"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L41
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_KHR_external_memory_win32"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L45
        L41:
            r0 = 1
            goto L46
        L45:
            r0 = 0
        L46:
            return r0
    }

    private static boolean check_KHR_external_semaphore_fd(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_KHR_external_semaphore_fd"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 2
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 412(0x19c, float:5.77E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 413(0x19d, float:5.79E-43)
            r3[r4] = r5
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkImportSemaphoreFdKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkGetSemaphoreFdKHR"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L41
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_KHR_external_semaphore_fd"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L45
        L41:
            r0 = 1
            goto L46
        L45:
            r0 = 0
        L46:
            return r0
    }

    private static boolean check_KHR_external_semaphore_win32(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_KHR_external_semaphore_win32"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 2
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 414(0x19e, float:5.8E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 415(0x19f, float:5.82E-43)
            r3[r4] = r5
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkImportSemaphoreWin32HandleKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkGetSemaphoreWin32HandleKHR"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L41
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_KHR_external_semaphore_win32"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L45
        L41:
            r0 = 1
            goto L46
        L45:
            r0 = 0
        L46:
            return r0
    }

    private static boolean check_KHR_fragment_shading_rate(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_KHR_fragment_shading_rate"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 416(0x1a0, float:5.83E-43)
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCmdSetFragmentShadingRateKHR"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L35
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_KHR_fragment_shading_rate"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L39
        L35:
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
    }

    private static boolean check_KHR_get_memory_requirements2(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_KHR_get_memory_requirements2"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 3
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 417(0x1a1, float:5.84E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 418(0x1a2, float:5.86E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 419(0x1a3, float:5.87E-43)
            r3[r4] = r5
            r3 = 3
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkGetImageMemoryRequirements2KHR"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkGetBufferMemoryRequirements2KHR"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkGetImageSparseMemoryRequirements2KHR"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L4d
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_KHR_get_memory_requirements2"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L51
        L4d:
            r0 = 1
            goto L52
        L51:
            r0 = 0
        L52:
            return r0
    }

    private static boolean check_KHR_maintenance1(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_KHR_maintenance1"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 420(0x1a4, float:5.89E-43)
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkTrimCommandPoolKHR"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L35
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_KHR_maintenance1"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L39
        L35:
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
    }

    private static boolean check_KHR_maintenance3(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_KHR_maintenance3"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 421(0x1a5, float:5.9E-43)
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkGetDescriptorSetLayoutSupportKHR"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L35
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_KHR_maintenance3"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L39
        L35:
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
    }

    private static boolean check_KHR_maintenance4(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_KHR_maintenance4"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 3
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 422(0x1a6, float:5.91E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 423(0x1a7, float:5.93E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 424(0x1a8, float:5.94E-43)
            r3[r4] = r5
            r3 = 3
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkGetDeviceBufferMemoryRequirementsKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkGetDeviceImageMemoryRequirementsKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkGetDeviceImageSparseMemoryRequirementsKHR"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L4d
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_KHR_maintenance4"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L51
        L4d:
            r0 = 1
            goto L52
        L51:
            r0 = 0
        L52:
            return r0
    }

    private static boolean check_KHR_maintenance5(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_KHR_maintenance5"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 4
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 425(0x1a9, float:5.96E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 426(0x1aa, float:5.97E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 427(0x1ab, float:5.98E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 428(0x1ac, float:6.0E-43)
            r3[r4] = r5
            r3 = 4
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCmdBindIndexBuffer2KHR"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkGetRenderingAreaGranularityKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkGetDeviceImageSubresourceLayoutKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "vkGetImageSubresourceLayout2KHR"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L59
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_KHR_maintenance5"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L5d
        L59:
            r0 = 1
            goto L5e
        L5d:
            r0 = 0
        L5e:
            return r0
    }

    private static boolean check_KHR_map_memory2(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_KHR_map_memory2"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 2
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 429(0x1ad, float:6.01E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 430(0x1ae, float:6.03E-43)
            r3[r4] = r5
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkMapMemory2KHR"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkUnmapMemory2KHR"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L41
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_KHR_map_memory2"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L45
        L41:
            r0 = 1
            goto L46
        L45:
            r0 = 0
        L46:
            return r0
    }

    private static boolean check_KHR_performance_query(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_KHR_performance_query"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 2
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 431(0x1af, float:6.04E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 432(0x1b0, float:6.05E-43)
            r3[r4] = r5
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkAcquireProfilingLockKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkReleaseProfilingLockKHR"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L41
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_KHR_performance_query"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L45
        L41:
            r0 = 1
            goto L46
        L45:
            r0 = 0
        L46:
            return r0
    }

    private static boolean check_KHR_pipeline_executable_properties(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_KHR_pipeline_executable_properties"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 3
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 433(0x1b1, float:6.07E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 434(0x1b2, float:6.08E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 435(0x1b3, float:6.1E-43)
            r3[r4] = r5
            r3 = 3
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkGetPipelineExecutablePropertiesKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkGetPipelineExecutableStatisticsKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkGetPipelineExecutableInternalRepresentationsKHR"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L4d
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_KHR_pipeline_executable_properties"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L51
        L4d:
            r0 = 1
            goto L52
        L51:
            r0 = 0
        L52:
            return r0
    }

    private static boolean check_KHR_present_wait(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_KHR_present_wait"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 436(0x1b4, float:6.11E-43)
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkWaitForPresentKHR"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L35
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_KHR_present_wait"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L39
        L35:
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
    }

    private static boolean check_KHR_push_descriptor(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_KHR_push_descriptor"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r10
            java.lang.String r1 = "Vulkan11"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L26
            r0 = r10
            java.lang.String r1 = "VK_KHR_descriptor_update_template"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L2a
        L26:
            r0 = 0
            goto L2d
        L2a:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L2d:
            r11 = r0
            r0 = r8
            r1 = r9
            r2 = 2
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 437(0x1b5, float:6.12E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r11
            r6 = 392(0x188, float:5.5E-43)
            int r5 = r5 + r6
            r3[r4] = r5
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCmdPushDescriptorSetKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkCmdPushDescriptorSetWithTemplateKHR"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L63
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_KHR_push_descriptor"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L67
        L63:
            r0 = 1
            goto L68
        L67:
            r0 = 0
        L68:
            return r0
    }

    private static boolean check_KHR_ray_tracing_maintenance1(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_KHR_ray_tracing_maintenance1"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r10
            java.lang.String r1 = "VK_KHR_ray_tracing_pipeline"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L1e
            r0 = 0
            goto L21
        L1e:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L21:
            r11 = r0
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = r11
            r6 = 438(0x1b6, float:6.14E-43)
            int r5 = r5 + r6
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCmdTraceRaysIndirect2KHR"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L4b
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_KHR_ray_tracing_maintenance1"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L4f
        L4b:
            r0 = 1
            goto L50
        L4f:
            r0 = 0
        L50:
            return r0
    }

    private static boolean check_KHR_ray_tracing_pipeline(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_KHR_ray_tracing_pipeline"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 7
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 439(0x1b7, float:6.15E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 440(0x1b8, float:6.17E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 441(0x1b9, float:6.18E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 442(0x1ba, float:6.2E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 443(0x1bb, float:6.21E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 5
            r5 = 444(0x1bc, float:6.22E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 6
            r5 = 445(0x1bd, float:6.24E-43)
            r3[r4] = r5
            r3 = 7
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCmdTraceRaysKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkCreateRayTracingPipelinesKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkGetRayTracingShaderGroupHandlesKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "vkGetRayTracingCaptureReplayShaderGroupHandlesKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "vkCmdTraceRaysIndirectKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 5
            java.lang.String r6 = "vkGetRayTracingShaderGroupStackSizeKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 6
            java.lang.String r6 = "vkCmdSetRayTracingPipelineStackSizeKHR"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L81
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_KHR_ray_tracing_pipeline"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L85
        L81:
            r0 = 1
            goto L86
        L85:
            r0 = 0
        L86:
            return r0
    }

    private static boolean check_KHR_sampler_ycbcr_conversion(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_KHR_sampler_ycbcr_conversion"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 2
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 446(0x1be, float:6.25E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 447(0x1bf, float:6.26E-43)
            r3[r4] = r5
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCreateSamplerYcbcrConversionKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkDestroySamplerYcbcrConversionKHR"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L41
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_KHR_sampler_ycbcr_conversion"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L45
        L41:
            r0 = 1
            goto L46
        L45:
            r0 = 0
        L46:
            return r0
    }

    private static boolean check_KHR_shared_presentable_image(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_KHR_shared_presentable_image"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 448(0x1c0, float:6.28E-43)
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkGetSwapchainStatusKHR"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L35
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_KHR_shared_presentable_image"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L39
        L35:
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
    }

    private static boolean check_KHR_swapchain(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_KHR_swapchain"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r10
            java.lang.String r1 = "Vulkan11"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L1e
            r0 = 0
            goto L21
        L1e:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L21:
            r11 = r0
            r0 = r8
            r1 = r9
            r2 = 8
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 449(0x1c1, float:6.29E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 450(0x1c2, float:6.3E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 451(0x1c3, float:6.32E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 452(0x1c4, float:6.33E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 453(0x1c5, float:6.35E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 5
            r5 = r11
            r6 = 396(0x18c, float:5.55E-43)
            int r5 = r5 + r6
            r3[r4] = r5
            r3 = r2
            r4 = 6
            r5 = r11
            r6 = 397(0x18d, float:5.56E-43)
            int r5 = r5 + r6
            r3[r4] = r5
            r3 = r2
            r4 = 7
            r5 = r11
            r6 = 398(0x18e, float:5.58E-43)
            int r5 = r5 + r6
            r3[r4] = r5
            r3 = 8
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCreateSwapchainKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkDestroySwapchainKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkGetSwapchainImagesKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "vkAcquireNextImageKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "vkQueuePresentKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 5
            java.lang.String r6 = "vkGetDeviceGroupPresentCapabilitiesKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 6
            java.lang.String r6 = "vkGetDeviceGroupSurfacePresentModesKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 7
            java.lang.String r6 = "vkAcquireNextImage2KHR"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto La9
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_KHR_swapchain"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto Lad
        La9:
            r0 = 1
            goto Lae
        Lad:
            r0 = 0
        Lae:
            return r0
    }

    private static boolean check_KHR_synchronization2(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_KHR_synchronization2"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r10
            java.lang.String r1 = "VK_AMD_buffer_marker"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L1e
            r0 = 0
            goto L21
        L1e:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L21:
            r11 = r0
            r0 = r10
            java.lang.String r1 = "VK_NV_device_diagnostic_checkpoints"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L32
            r0 = 0
            goto L35
        L32:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L35:
            r12 = r0
            r0 = r8
            r1 = r9
            r2 = 8
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 454(0x1c6, float:6.36E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 455(0x1c7, float:6.38E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 456(0x1c8, float:6.39E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 457(0x1c9, float:6.4E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 458(0x1ca, float:6.42E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 5
            r5 = 459(0x1cb, float:6.43E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 6
            r5 = r11
            r6 = 460(0x1cc, float:6.45E-43)
            int r5 = r5 + r6
            r3[r4] = r5
            r3 = r2
            r4 = 7
            r5 = r12
            r6 = 461(0x1cd, float:6.46E-43)
            int r5 = r5 + r6
            r3[r4] = r5
            r3 = 8
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCmdSetEvent2KHR"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkCmdResetEvent2KHR"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkCmdWaitEvents2KHR"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "vkCmdPipelineBarrier2KHR"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "vkCmdWriteTimestamp2KHR"
            r4[r5] = r6
            r4 = r3
            r5 = 5
            java.lang.String r6 = "vkQueueSubmit2KHR"
            r4[r5] = r6
            r4 = r3
            r5 = 6
            java.lang.String r6 = "vkCmdWriteBufferMarker2AMD"
            r4[r5] = r6
            r4 = r3
            r5 = 7
            java.lang.String r6 = "vkGetQueueCheckpointData2NV"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto Lbd
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_KHR_synchronization2"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto Lc1
        Lbd:
            r0 = 1
            goto Lc2
        Lc1:
            r0 = 0
        Lc2:
            return r0
    }

    private static boolean check_KHR_timeline_semaphore(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_KHR_timeline_semaphore"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 3
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 462(0x1ce, float:6.47E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 463(0x1cf, float:6.49E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 464(0x1d0, float:6.5E-43)
            r3[r4] = r5
            r3 = 3
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkGetSemaphoreCounterValueKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkWaitSemaphoresKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkSignalSemaphoreKHR"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L4d
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_KHR_timeline_semaphore"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L51
        L4d:
            r0 = 1
            goto L52
        L51:
            r0 = 0
        L52:
            return r0
    }

    private static boolean check_KHR_video_decode_queue(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_KHR_video_decode_queue"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 465(0x1d1, float:6.52E-43)
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCmdDecodeVideoKHR"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L35
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_KHR_video_decode_queue"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L39
        L35:
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
    }

    private static boolean check_KHR_video_encode_queue(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_KHR_video_encode_queue"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 2
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 466(0x1d2, float:6.53E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 467(0x1d3, float:6.54E-43)
            r3[r4] = r5
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkGetEncodedVideoSessionParametersKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkCmdEncodeVideoKHR"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L41
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_KHR_video_encode_queue"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L45
        L41:
            r0 = 1
            goto L46
        L45:
            r0 = 0
        L46:
            return r0
    }

    private static boolean check_KHR_video_queue(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_KHR_video_queue"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 10
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 468(0x1d4, float:6.56E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 469(0x1d5, float:6.57E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 470(0x1d6, float:6.59E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 471(0x1d7, float:6.6E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 472(0x1d8, float:6.61E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 5
            r5 = 473(0x1d9, float:6.63E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 6
            r5 = 474(0x1da, float:6.64E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 7
            r5 = 475(0x1db, float:6.66E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 8
            r5 = 476(0x1dc, float:6.67E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 9
            r5 = 477(0x1dd, float:6.68E-43)
            r3[r4] = r5
            r3 = 10
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCreateVideoSessionKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkDestroyVideoSessionKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkGetVideoSessionMemoryRequirementsKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "vkBindVideoSessionMemoryKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "vkCreateVideoSessionParametersKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 5
            java.lang.String r6 = "vkUpdateVideoSessionParametersKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 6
            java.lang.String r6 = "vkDestroyVideoSessionParametersKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 7
            java.lang.String r6 = "vkCmdBeginVideoCodingKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 8
            java.lang.String r6 = "vkCmdEndVideoCodingKHR"
            r4[r5] = r6
            r4 = r3
            r5 = 9
            java.lang.String r6 = "vkCmdControlVideoCodingKHR"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_KHR_video_queue"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto Laf
        Lab:
            r0 = 1
            goto Lb0
        Laf:
            r0 = 0
        Lb0:
            return r0
    }

    private static boolean check_NV_clip_space_w_scaling(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_NV_clip_space_w_scaling"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 478(0x1de, float:6.7E-43)
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCmdSetViewportWScalingNV"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L35
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_NV_clip_space_w_scaling"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L39
        L35:
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
    }

    private static boolean check_NV_copy_memory_indirect(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_NV_copy_memory_indirect"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 2
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 479(0x1df, float:6.71E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 480(0x1e0, float:6.73E-43)
            r3[r4] = r5
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCmdCopyMemoryIndirectNV"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkCmdCopyMemoryToImageIndirectNV"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L41
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_NV_copy_memory_indirect"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L45
        L41:
            r0 = 1
            goto L46
        L45:
            r0 = 0
        L46:
            return r0
    }

    private static boolean check_NV_device_diagnostic_checkpoints(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_NV_device_diagnostic_checkpoints"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 2
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 481(0x1e1, float:6.74E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 482(0x1e2, float:6.75E-43)
            r3[r4] = r5
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCmdSetCheckpointNV"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkGetQueueCheckpointDataNV"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L41
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_NV_device_diagnostic_checkpoints"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L45
        L41:
            r0 = 1
            goto L46
        L45:
            r0 = 0
        L46:
            return r0
    }

    private static boolean check_NV_device_generated_commands(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_NV_device_generated_commands"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 6
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 483(0x1e3, float:6.77E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 484(0x1e4, float:6.78E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 485(0x1e5, float:6.8E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 486(0x1e6, float:6.81E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 487(0x1e7, float:6.82E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 5
            r5 = 488(0x1e8, float:6.84E-43)
            r3[r4] = r5
            r3 = 6
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkGetGeneratedCommandsMemoryRequirementsNV"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkCmdPreprocessGeneratedCommandsNV"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkCmdExecuteGeneratedCommandsNV"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "vkCmdBindPipelineShaderGroupNV"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "vkCreateIndirectCommandsLayoutNV"
            r4[r5] = r6
            r4 = r3
            r5 = 5
            java.lang.String r6 = "vkDestroyIndirectCommandsLayoutNV"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L73
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_NV_device_generated_commands"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L77
        L73:
            r0 = 1
            goto L78
        L77:
            r0 = 0
        L78:
            return r0
    }

    private static boolean check_NV_device_generated_commands_compute(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_NV_device_generated_commands_compute"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 3
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 489(0x1e9, float:6.85E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 490(0x1ea, float:6.87E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 491(0x1eb, float:6.88E-43)
            r3[r4] = r5
            r3 = 3
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkGetPipelineIndirectMemoryRequirementsNV"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkCmdUpdatePipelineIndirectBufferNV"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkGetPipelineIndirectDeviceAddressNV"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L4d
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_NV_device_generated_commands_compute"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L51
        L4d:
            r0 = 1
            goto L52
        L51:
            r0 = 0
        L52:
            return r0
    }

    private static boolean check_NV_external_memory_rdma(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_NV_external_memory_rdma"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 492(0x1ec, float:6.9E-43)
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkGetMemoryRemoteAddressNV"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L35
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_NV_external_memory_rdma"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L39
        L35:
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
    }

    private static boolean check_NV_external_memory_win32(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_NV_external_memory_win32"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 493(0x1ed, float:6.91E-43)
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkGetMemoryWin32HandleNV"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L35
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_NV_external_memory_win32"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L39
        L35:
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
    }

    private static boolean check_NV_fragment_shading_rate_enums(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_NV_fragment_shading_rate_enums"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 494(0x1ee, float:6.92E-43)
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCmdSetFragmentShadingRateEnumNV"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L35
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_NV_fragment_shading_rate_enums"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L39
        L35:
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
    }

    private static boolean check_NV_memory_decompression(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_NV_memory_decompression"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 2
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 495(0x1ef, float:6.94E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 496(0x1f0, float:6.95E-43)
            r3[r4] = r5
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCmdDecompressMemoryNV"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkCmdDecompressMemoryIndirectCountNV"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L41
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_NV_memory_decompression"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L45
        L41:
            r0 = 1
            goto L46
        L45:
            r0 = 0
        L46:
            return r0
    }

    private static boolean check_NV_mesh_shader(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_NV_mesh_shader"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 3
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 497(0x1f1, float:6.96E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 498(0x1f2, float:6.98E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 499(0x1f3, float:6.99E-43)
            r3[r4] = r5
            r3 = 3
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCmdDrawMeshTasksNV"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkCmdDrawMeshTasksIndirectNV"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkCmdDrawMeshTasksIndirectCountNV"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L4d
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_NV_mesh_shader"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L51
        L4d:
            r0 = 1
            goto L52
        L51:
            r0 = 0
        L52:
            return r0
    }

    private static boolean check_NV_optical_flow(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_NV_optical_flow"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 4
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 500(0x1f4, float:7.0E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 501(0x1f5, float:7.02E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 502(0x1f6, float:7.03E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 503(0x1f7, float:7.05E-43)
            r3[r4] = r5
            r3 = 4
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCreateOpticalFlowSessionNV"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkDestroyOpticalFlowSessionNV"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkBindOpticalFlowSessionImageNV"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "vkCmdOpticalFlowExecuteNV"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L59
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_NV_optical_flow"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L5d
        L59:
            r0 = 1
            goto L5e
        L5d:
            r0 = 0
        L5e:
            return r0
    }

    private static boolean check_NV_ray_tracing(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_NV_ray_tracing"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 12
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 504(0x1f8, float:7.06E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 505(0x1f9, float:7.08E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 506(0x1fa, float:7.09E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 507(0x1fb, float:7.1E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 508(0x1fc, float:7.12E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 5
            r5 = 509(0x1fd, float:7.13E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 6
            r5 = 510(0x1fe, float:7.15E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 7
            r5 = 511(0x1ff, float:7.16E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 8
            r5 = 512(0x200, float:7.17E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 9
            r5 = 513(0x201, float:7.19E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 10
            r5 = 514(0x202, float:7.2E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 11
            r5 = 515(0x203, float:7.22E-43)
            r3[r4] = r5
            r3 = 12
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCreateAccelerationStructureNV"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkDestroyAccelerationStructureNV"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkGetAccelerationStructureMemoryRequirementsNV"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "vkBindAccelerationStructureMemoryNV"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "vkCmdBuildAccelerationStructureNV"
            r4[r5] = r6
            r4 = r3
            r5 = 5
            java.lang.String r6 = "vkCmdCopyAccelerationStructureNV"
            r4[r5] = r6
            r4 = r3
            r5 = 6
            java.lang.String r6 = "vkCmdTraceRaysNV"
            r4[r5] = r6
            r4 = r3
            r5 = 7
            java.lang.String r6 = "vkCreateRayTracingPipelinesNV"
            r4[r5] = r6
            r4 = r3
            r5 = 8
            java.lang.String r6 = "vkGetRayTracingShaderGroupHandlesNV"
            r4[r5] = r6
            r4 = r3
            r5 = 9
            java.lang.String r6 = "vkGetAccelerationStructureHandleNV"
            r4[r5] = r6
            r4 = r3
            r5 = 10
            java.lang.String r6 = "vkCmdWriteAccelerationStructuresPropertiesNV"
            r4[r5] = r6
            r4 = r3
            r5 = 11
            java.lang.String r6 = "vkCompileDeferredNV"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto Lc7
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_NV_ray_tracing"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto Lcb
        Lc7:
            r0 = 1
            goto Lcc
        Lcb:
            r0 = 0
        Lcc:
            return r0
    }

    private static boolean check_NV_scissor_exclusive(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_NV_scissor_exclusive"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 2
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 516(0x204, float:7.23E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 517(0x205, float:7.24E-43)
            r3[r4] = r5
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCmdSetExclusiveScissorEnableNV"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkCmdSetExclusiveScissorNV"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L41
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_NV_scissor_exclusive"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L45
        L41:
            r0 = 1
            goto L46
        L45:
            r0 = 0
        L46:
            return r0
    }

    private static boolean check_NV_shading_rate_image(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_NV_shading_rate_image"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 3
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 518(0x206, float:7.26E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 519(0x207, float:7.27E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 520(0x208, float:7.29E-43)
            r3[r4] = r5
            r3 = 3
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCmdBindShadingRateImageNV"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkCmdSetViewportShadingRatePaletteNV"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkCmdSetCoarseSampleOrderNV"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L4d
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_NV_shading_rate_image"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L51
        L4d:
            r0 = 1
            goto L52
        L51:
            r0 = 0
        L52:
            return r0
    }

    private static boolean check_NVX_binary_import(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_NVX_binary_import"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 5
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 521(0x209, float:7.3E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 522(0x20a, float:7.31E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 523(0x20b, float:7.33E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 524(0x20c, float:7.34E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 525(0x20d, float:7.36E-43)
            r3[r4] = r5
            r3 = 5
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkCreateCuModuleNVX"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkCreateCuFunctionNVX"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "vkDestroyCuModuleNVX"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "vkDestroyCuFunctionNVX"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "vkCmdCuLaunchKernelNVX"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L65
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_NVX_binary_import"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L69
        L65:
            r0 = 1
            goto L6a
        L69:
            r0 = 0
        L6a:
            return r0
    }

    private static boolean check_NVX_image_view_handle(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_NVX_image_view_handle"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 2
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 526(0x20e, float:7.37E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 527(0x20f, float:7.38E-43)
            r3[r4] = r5
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkGetImageViewHandleNVX"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkGetImageViewAddressNVX"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L41
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_NVX_image_view_handle"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L45
        L41:
            r0 = 1
            goto L46
        L45:
            r0 = 0
        L46:
            return r0
    }

    private static boolean check_QCOM_tile_properties(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_QCOM_tile_properties"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 2
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 528(0x210, float:7.4E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 529(0x211, float:7.41E-43)
            r3[r4] = r5
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkGetFramebufferTilePropertiesQCOM"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkGetDynamicRenderingTilePropertiesQCOM"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L41
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_QCOM_tile_properties"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L45
        L41:
            r0 = 1
            goto L46
        L45:
            r0 = 0
        L46:
            return r0
    }

    private static boolean check_VALVE_descriptor_set_host_mapping(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "VK_VALVE_descriptor_set_host_mapping"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 2
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 530(0x212, float:7.43E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 531(0x213, float:7.44E-43)
            r3[r4] = r5
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vkGetDescriptorSetLayoutHostMappingInfoVALVE"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "vkGetDescriptorSetHostMappingVALVE"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L41
            java.lang.String r0 = "VK"
            java.lang.String r1 = "VK_VALVE_descriptor_set_host_mapping"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L45
        L41:
            r0 = 1
            goto L46
        L45:
            r0 = 0
        L46:
            return r0
    }
}
