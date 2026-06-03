package org.lwjgl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/LWJGLUtil.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/LWJGLUtil.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/LWJGLUtil.class */
public class LWJGLUtil {
    public static final int PLATFORM_LINUX = 1;
    public static final int PLATFORM_MACOSX = 2;
    public static final int PLATFORM_WINDOWS = 3;
    public static final java.lang.String PLATFORM_LINUX_NAME = "linux";
    public static final java.lang.String PLATFORM_MACOSX_NAME = "macosx";
    public static final java.lang.String PLATFORM_WINDOWS_NAME = "windows";
    private static final java.lang.String LWJGL_ICON_DATA_16x16 = "ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿþÿÿÿÂ×èÿt¤ËÿP\u008b½ÿT\u008e¿ÿ\u0086¯Òÿçïöÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿõõõÿ\u008d\u008f\u0091ÿv\u0082\u008dÿ}\u008d\u009bÿ\u0084\u0099ªÿ\u0094·Õÿ:}µÿH\u0086ºÿÚçñÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿôøûÿ\u009c\u009e ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿäääÿ\u0084\u00adÐÿ:}µÿ[\u0092Áÿüýþÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0091¶Õÿ___ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\"\"\"ÿÿÿÿÿèðöÿ9|µÿ:}µÿÄØéÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÆÙéÿ\u0081«Îÿ\u001d\u001d\u001dÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿfffÿÿÿÿÿÐàíÿ:}µÿ:}µÿ\u008d´Ôÿÿÿÿÿòòòÿ¥¥¥ÿßßßÿ¢ÁÜÿ°ÅÖÿ\n\n\nÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ¨¨¨ÿÿÿÿÿ\u0097ºØÿ:}µÿ:}µÿq¡Êÿÿÿÿÿ¡¡¡ÿ\u0000\u0000\u0000ÿ\u0001\u0001\u0001ÿ###ÿÌÌÌÿÐÐÐÿ¥¥¥ÿ\u0084\u0084\u0084ÿ\\\\\\ÿïïïÿÿÿÿÿ`\u0096Ãÿ:}µÿ:}µÿm\u009eÈÿÿÿÿÿ^^^ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿÏÏÏÿ\u001f\u001f\u001fÿ\u0003\u0003\u0003ÿ+++ÿlllÿÆÆÆÿúüýÿ\u009e¿Úÿw¥ÌÿL\u0089¼ÿ|¨Îÿÿÿÿÿ\u001b\u001b\u001bÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0017\u0017\u0017ÿÖÖÖÿ\u0001\u0001\u0001ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿRRRÿåååÿ===ÿhhhÿ¦¦§ÿÚÞáÿÿÿÿÿtttÿ\u000e\u000e\u000eÿ\u0000\u0000\u0000ÿYYYÿ\u0095\u0095\u0095ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0091\u0091\u0091ÿ\u009b\u009b\u009bÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0002\u0002\u0002ÿCCCÿÿÿÿÿîîîÿ\u008c\u008c\u008cÿ¿¿¿ÿVVVÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿÓÓÓÿXXXÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ333ÿÿÿÿÿÿÿÿÿüýþÿÿÿÿÿÀÀÀÿ@@@ÿ\u0002\u0002\u0002ÿ\u0000\u0000\u0000ÿ\u001b\u001b\u001bÿûûûÿ\u0017\u0017\u0017ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿxxxÿÿÿÿÿÿÿÿÿÒáîÿ~©ÎÿàêóÿÿÿÿÿÔÔÔÿmmmÿ\u0084\u0084\u0084ÿÓÓÓÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ½½½ÿÿÿÿÿÿÿÿÿþþþÿf\u009aÅÿ=\u007f¶ÿ\u0082¬Ðÿäíõÿÿÿÿÿÿÿÿÿåååÿ---ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\f\f\fÿöööÿÿÿÿÿÿÿÿÿÿÿÿÿâìôÿM\u0089¼ÿ:}µÿ>\u0080¶ÿ\u0087°Òÿçïöÿÿÿÿÿþþþÿ¼¼¼ÿOOOÿ\u0003\u0003\u0003ÿJJJÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿëòøÿ\u008c³ÔÿV\u0090ÀÿP\u008c½ÿw¥Ìÿíóøÿÿÿÿÿÿÿÿÿÿÿÿÿßßßÿæææÿÿÿÿÿ";
    private static final java.lang.String LWJGL_ICON_DATA_32x32 = "ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿúüýÿËÝìÿ\u0093·Öÿo Éÿ\\\u0093Âÿ`\u0096Ãÿz§Íÿ¬ÈàÿíóøÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿüýþÿµÎãÿZ\u0092Áÿ:}µÿ:}µÿ:}µÿ:}µÿ:}µÿ:}µÿ:}µÿE\u0085¹ÿ¡ÁÜÿüýþÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿüüüÿâêñÿ¸Ïãÿ®Éàÿ£ÂÜÿ\u0098ºØÿ\u008c³Óÿ\u0081¬Ïÿn\u009fÈÿ=\u007f¶ÿ:}µÿ:}µÿ:}µÿr¢ÊÿõøûÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿØØØÿ111ÿ$$$ÿ111ÿ@@@ÿRRRÿeeeÿtttÿ\u008f\u008f\u008fÿ÷øøÿ¬Èßÿ;}µÿ:}µÿ:}µÿ:}µÿy§Íÿüýþÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿþþþÿhhhÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ¶¶¶ÿþþþÿ\u0086®Ñÿ:}µÿ:}µÿ:}µÿ:}µÿ®ÊáÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÓâîÿáêòÿ(((ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0002\u0002\u0002ÿÞÞÞÿÿÿÿÿõøûÿ[\u0092Áÿ:}µÿ:}µÿ:}µÿH\u0086ºÿôøûÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿìóøÿd\u0099Åÿ×ÙÛÿ\u0005\u0005\u0005ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ$$$ÿþþþÿÿÿÿÿÿÿÿÿÀÕçÿ9|µÿ:}µÿ:}µÿ:}µÿ«Èàÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿþÿÿÿx¦Ìÿ{§Íÿ\u009e\u009e\u009eÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿeeeÿÿÿÿÿÿÿÿÿÿÿÿÿâìôÿ7{´ÿ:}µÿ:}µÿ:}µÿf\u009aÅÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÃ×èÿ9}µÿ²ÌáÿXXXÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ©©©ÿÿÿÿÿÿÿÿÿÿÿÿÿ¼Òåÿ:}µÿ:}µÿ:}µÿ:}µÿ@\u0081·ÿîôùÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿúüýÿZ\u0092Áÿ=\u007f¶ÿÝåíÿ\u001c\u001c\u001cÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0007\u0007\u0007ÿçççÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0085®Ñÿ:}µÿ:}µÿ:}µÿ:}µÿ9}µÿÌÞìÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿþþþÿÿÿÿÿÿÿÿÿÿÿÿÿºÒåÿ:}µÿW\u0090¿ÿÐÑÑÿ\u0003\u0003\u0003ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ333ÿýýýÿÿÿÿÿÿÿÿÿûüýÿP\u008b½ÿ:}µÿ:}µÿ:}µÿ:}µÿ9}µÿ±ÌâÿÿÿÿÿÿÿÿÿÿÿÿÿÊÊÊÿ777ÿaaaÿ¢¢¢ÿÝÝÝÿäìóÿ±Ëáÿ´Íâÿæææÿ###ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿrrrÿÿÿÿÿÿÿÿÿÿÿÿÿØåðÿ:}µÿ:}µÿ:}µÿ:}µÿ:}µÿ:}µÿ ÀÛÿÿÿÿÿÿÿÿÿÿÿÿÿfffÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0006\u0006\u0006ÿ'''ÿfffÿÔÔÔÿÿÿÿÿöööÿÐÐÐÿ\u0097\u0097\u0097ÿ^^^ÿ'''ÿ\u0004\u0004\u0004ÿ\u0000\u0000\u0000ÿ\u0003\u0003\u0003ÿÀÀÀÿÿÿÿÿÿÿÿÿÿÿÿÿ¢ÁÛÿ:}µÿ:}µÿ:}µÿ:}µÿ:}µÿ:}µÿ\u009e¿Úÿÿÿÿÿÿÿÿÿûûûÿ%%%ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\\\\\\ÿÿÿÿÿêêêÿ\u008f\u008f\u008fÿµµµÿéééÿýýýÿçççÿ²²²ÿ½½½ÿþþþÿÿÿÿÿÿÿÿÿÿÿÿÿk\u009dÇÿ:}µÿ:}µÿ:}µÿ:}µÿ:}µÿ:}µÿ¡ÁÜÿÿÿÿÿÿÿÿÿÛÛÛÿ\u0003\u0003\u0003ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0083\u0083\u0083ÿÿÿÿÿ___ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u000b\u000b\u000bÿ777ÿvvvÿ···ÿðððÿÿÿÿÿÿÿÿÿÿÿÿÿðõùÿK\u0088»ÿ=\u007f¶ÿ9|µÿ:}µÿ:}µÿ:}µÿ:}µÿ²Ìâÿÿÿÿÿÿÿÿÿ\u009a\u009a\u009aÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿÅÅÅÿ÷÷÷ÿ\u001d\u001d\u001dÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0007\u0007\u0007ÿ<<<ÿßßßÿÿÿÿÿûüýÿüýþÿó÷úÿÌÝëÿ\u009e¾Úÿr¡ÉÿL\u0089»ÿ:}µÿÉÜëÿÿÿÿÿÿÿÿÿVVVÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u000f\u000f\u000fÿùùùÿÑÑÑÿ\u0003\u0003\u0003ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u008e\u008e\u008eÿÿÿÿÿùùùÿ\u0084\u0084\u0084ÿpppÿ°°°ÿêêêÿÿÿÿÿùûüÿÜèòÿöùüÿÿÿÿÿÿÿÿÿ\u0015\u0015\u0015ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿNNNÿÿÿÿÿ\u0091\u0091\u0091ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ»»»ÿÿÿÿÿ\u009e\u009e\u009eÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0004\u0004\u0004ÿ///ÿpppÿ°°°ÿæææÿþþþÿÿÿÿÿ999ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0090\u0090\u0090ÿÿÿÿÿMMMÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0010\u0010\u0010ÿðððÿÿÿÿÿZZZÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\t\t\tÿ222ÿ±±±ÿöööÿ¡¡¡ÿ555ÿ\u0002\u0002\u0002ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0002\u0002\u0002ÿÑÑÑÿõõõÿ\u0013\u0013\u0013ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿEEEÿþþþÿøøøÿ\u001d\u001d\u001dÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ+++ÿÿÿÿÿÿÿÿÿüüüÿ¾¾¾ÿPPPÿ\u0005\u0005\u0005ÿ%%%ÿùùùÿÂÂÂÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0086\u0086\u0086ÿÿÿÿÿÒÒÒÿ\u0001\u0001\u0001ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿCCCÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿþþþÿÜÜÜÿàààÿÿÿÿÿ\u0095\u0095\u0095ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0001\u0001\u0001ÿÈÈÈÿÿÿÿÿ\u008e\u008e\u008eÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0088\u0088\u0088ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿßßßÿ)))ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0018\u0018\u0018ÿõõõÿÿÿÿÿJJJÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿÏÏÏÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿñöúÿÿÿÿÿÿÿÿÿÿÿÿÿùùùÿµµµÿKKKÿ\u0006\u0006\u0006ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿRRRÿÿÿÿÿøøøÿ\u0010\u0010\u0010ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u001c\u001c\u001cÿøøøÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0086¯Ñÿ\u0090µÕÿêñ÷ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÛÛÛÿxxxÿ\u001b\u001b\u001bÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0096\u0096\u0096ÿÿÿÿÿÆÆÆÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿZZZÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÃØéÿ:}µÿC\u0083¸ÿ\u0094¸Öÿíóøÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿôôôÿ§§§ÿ\u0085\u0085\u0085ÿôôôÿÿÿÿÿ\u0086\u0086\u0086ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u009d\u009d\u009dÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿúûýÿ]\u0094Âÿ:}µÿ:}µÿF\u0085¹ÿ\u0098»Øÿïôùÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u009b\u009b\u009bÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0005\u0005\u0005ÿÝÝÝÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÅÙéÿ;~¶ÿ:}µÿ:}µÿ:}µÿH\u0086ºÿ\u009e¾Úÿòöúÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿûûûÿ\u008e\u008e\u008eÿ%%%ÿ\u0001\u0001\u0001ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ,,,ÿüüüÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u008fµÕÿ:}µÿ:}µÿ:}µÿ:}µÿ:}µÿJ\u0087»ÿ£ÂÜÿó÷úÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿúúúÿ°°°ÿEEEÿ\u0004\u0004\u0004ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿnnnÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿüýþÿ\u0085¯Ñÿ:}µÿ:}µÿ:}µÿ:}µÿ:}µÿ:}µÿM\u0089¼ÿ¨ÅÞÿöùüÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿþþþÿÒÒÒÿhhhÿ\u000e\u000e\u000eÿ\u0000\u0000\u0000ÿ\u0001\u0001\u0001ÿ¸¸¸ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿþþÿÿ±ËâÿL\u0089¼ÿ9}µÿ:}µÿ:}µÿ:}µÿ:}µÿ:}µÿM\u0089¼ÿ¿Ôçÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿìììÿ\u0093\u0093\u0093ÿ\u009b\u009b\u009bÿýýýÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿó÷úÿµÎãÿ\u0081¬Ðÿe\u0099Åÿa\u0097Äÿl\u009eÈÿ\u008fµÕÿÅÙéÿ÷úüÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ";
    public static final java.nio.ByteBuffer LWJGLIcon16x16 = null;
    public static final java.nio.ByteBuffer LWJGLIcon32x32 = null;
    public static final boolean DEBUG = false;
    public static final boolean CHECKS = false;
    private static final int PLATFORM = 0;







    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/LWJGLUtil$TokenFilter.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/LWJGLUtil$TokenFilter.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/LWJGLUtil$TokenFilter.class */
    public interface TokenFilter {
        boolean accept(java.lang.reflect.Field r1, int r2);
    }

    public LWJGLUtil() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    private static java.nio.ByteBuffer loadIcon(java.lang.String r5) {
            r0 = r5
            int r0 = r0.length()
            r6 = r0
            r0 = r6
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r7 = r0
            r0 = 0
            r8 = r0
        Lc:
            r0 = r8
            r1 = r6
            if (r0 >= r1) goto L23
            r0 = r7
            r1 = r8
            r2 = r5
            r3 = r8
            char r2 = r2.charAt(r3)
            byte r2 = (byte) r2
            java.nio.ByteBuffer r0 = r0.put(r1, r2)
            int r8 = r8 + 1
            goto Lc
        L23:
            r0 = r7
            java.nio.ByteBuffer r0 = r0.asReadOnlyBuffer()
            return r0
    }

    public static int getPlatform() {
            int r0 = org.lwjgl.LWJGLUtil.PLATFORM
            return r0
    }

    public static java.lang.String getPlatformName() {
            int r0 = getPlatform()
            switch(r0) {
                case 1: goto L1c;
                case 2: goto L1f;
                case 3: goto L22;
                default: goto L25;
            }
        L1c:
            java.lang.String r0 = "linux"
            return r0
        L1f:
            java.lang.String r0 = "macosx"
            return r0
        L22:
            java.lang.String r0 = "windows"
            return r0
        L25:
            java.lang.String r0 = "unknown"
            return r0
    }

    public static java.lang.String[] getLibraryPaths(java.lang.String r6, java.lang.String r7, java.lang.ClassLoader r8) {
            r0 = r6
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = r1
            r3 = 0
            r4 = r7
            r2[r3] = r4
            r2 = r8
            java.lang.String[] r0 = getLibraryPaths(r0, r1, r2)
            return r0
    }

    public static java.lang.String[] getLibraryPaths(java.lang.String r7, java.lang.String[] r8, java.lang.ClassLoader r9) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r7
            r1 = r9
            java.lang.String r0 = getPathFromClassLoader(r0, r1)
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L34
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "getPathFromClassLoader: Path found: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r11
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            log(r0)
            r0 = r10
            r1 = r11
            boolean r0 = r0.add(r1)
        L34:
            r0 = r8
            r12 = r0
            r0 = r12
            int r0 = r0.length
            r13 = r0
            r0 = 0
            r14 = r0
        L3f:
            r0 = r14
            r1 = r13
            if (r0 >= r1) goto L14a
            r0 = r12
            r1 = r14
            r0 = r0[r1]
            r15 = r0
            java.lang.String r0 = "lwjgl"
            r1 = r9
            java.lang.String r0 = getPathFromClassLoader(r0, r1)
            r16 = r0
            r0 = r16
            if (r0 == 0) goto L9e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "getPathFromClassLoader: Path found: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r16
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            log(r0)
            r0 = r10
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            r2 = r16
            r3 = 0
            r4 = r16
            java.lang.String r5 = java.io.File.separator
            int r4 = r4.lastIndexOf(r5)
            java.lang.String r2 = r2.substring(r3, r4)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = java.io.File.separator
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r15
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.add(r1)
        L9e:
            java.lang.String r0 = "org.lwjgl.librarypath"
            java.lang.String r0 = getPrivilegedProperty(r0)
            r17 = r0
            r0 = r17
            if (r0 == 0) goto Lcb
            r0 = r10
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            r2 = r17
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = java.io.File.separator
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r15
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.add(r1)
        Lcb:
            java.lang.String r0 = "java.library.path"
            java.lang.String r0 = getPrivilegedProperty(r0)
            r18 = r0
            java.util.StringTokenizer r0 = new java.util.StringTokenizer
            r1 = r0
            r2 = r18
            java.lang.String r3 = java.io.File.pathSeparator
            r1.<init>(r2, r3)
            r19 = r0
        Le0:
            r0 = r19
            boolean r0 = r0.hasMoreTokens()
            if (r0 == 0) goto L113
            r0 = r19
            java.lang.String r0 = r0.nextToken()
            r20 = r0
            r0 = r10
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            r2 = r20
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = java.io.File.separator
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r15
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.add(r1)
            goto Le0
        L113:
            java.lang.String r0 = "user.dir"
            java.lang.String r0 = getPrivilegedProperty(r0)
            r20 = r0
            r0 = r10
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            r2 = r20
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = java.io.File.separator
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r15
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.add(r1)
            r0 = r10
            r1 = r15
            boolean r0 = r0.add(r1)
            int r14 = r14 + 1
            goto L3f
        L14a:
            r0 = r10
            r1 = r10
            int r1 = r1.size()
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    static void execPrivileged(java.lang.String[] r4) throws java.lang.Exception {
            org.lwjgl.LWJGLUtil$1 r0 = new org.lwjgl.LWJGLUtil$1     // Catch: java.security.PrivilegedActionException -> L27
            r1 = r0
            r2 = r4
            r1.<init>(r2)     // Catch: java.security.PrivilegedActionException -> L27
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch: java.security.PrivilegedActionException -> L27
            java.lang.Process r0 = (java.lang.Process) r0     // Catch: java.security.PrivilegedActionException -> L27
            r5 = r0
            r0 = r5
            java.io.InputStream r0 = r0.getInputStream()     // Catch: java.security.PrivilegedActionException -> L27
            r0.close()     // Catch: java.security.PrivilegedActionException -> L27
            r0 = r5
            java.io.OutputStream r0 = r0.getOutputStream()     // Catch: java.security.PrivilegedActionException -> L27
            r0.close()     // Catch: java.security.PrivilegedActionException -> L27
            r0 = r5
            java.io.InputStream r0 = r0.getErrorStream()     // Catch: java.security.PrivilegedActionException -> L27
            r0.close()     // Catch: java.security.PrivilegedActionException -> L27
            goto L30
        L27:
            r5 = move-exception
            r0 = r5
            java.lang.Throwable r0 = r0.getCause()
            java.lang.Exception r0 = (java.lang.Exception) r0
            throw r0
        L30:
            return
    }

    private static java.lang.String getPrivilegedProperty(java.lang.String r4) {
            org.lwjgl.LWJGLUtil$2 r0 = new org.lwjgl.LWJGLUtil$2
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    private static java.lang.String getPathFromClassLoader(java.lang.String r6, java.lang.ClassLoader r7) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L59
            r1 = r0
            r1.<init>()     // Catch: java.lang.Exception -> L59
            java.lang.String r1 = "getPathFromClassLoader: searching for: "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L59
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L59
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L59
            log(r0)     // Catch: java.lang.Exception -> L59
            r0 = r7
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Exception -> L59
            r8 = r0
        L1b:
            r0 = r8
            if (r0 == 0) goto L56
            r0 = r8
            r9 = r0
            org.lwjgl.LWJGLUtil$3 r0 = new org.lwjgl.LWJGLUtil$3     // Catch: java.security.PrivilegedActionException -> L32 java.lang.Exception -> L59
            r1 = r0
            r2 = r9
            r3 = r7
            r4 = r6
            r1.<init>(r2, r3, r4)     // Catch: java.security.PrivilegedActionException -> L32 java.lang.Exception -> L59
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch: java.security.PrivilegedActionException -> L32 java.lang.Exception -> L59
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.security.PrivilegedActionException -> L32 java.lang.Exception -> L59
            return r0
        L32:
            r10 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L59
            r1 = r0
            r1.<init>()     // Catch: java.lang.Exception -> L59
            java.lang.String r1 = "Failed to locate findLibrary method: "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L59
            r1 = r10
            java.lang.Throwable r1 = r1.getCause()     // Catch: java.lang.Exception -> L59
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L59
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L59
            log(r0)     // Catch: java.lang.Exception -> L59
            r0 = r8
            java.lang.Class r0 = r0.getSuperclass()     // Catch: java.lang.Exception -> L59
            r8 = r0
            goto L1b
        L56:
            goto L79
        L59:
            r8 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "Failure locating "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " using classloader:"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            log(r0)
        L79:
            r0 = 0
            return r0
    }

    public static boolean getPrivilegedBoolean(java.lang.String r4) {
            org.lwjgl.LWJGLUtil$4 r0 = new org.lwjgl.LWJGLUtil$4
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public static java.lang.Integer getPrivilegedInteger(java.lang.String r4) {
            org.lwjgl.LWJGLUtil$5 r0 = new org.lwjgl.LWJGLUtil$5
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            return r0
    }

    public static java.lang.Integer getPrivilegedInteger(java.lang.String r5, int r6) {
            org.lwjgl.LWJGLUtil$6 r0 = new org.lwjgl.LWJGLUtil$6
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            return r0
    }

    public static void log(java.lang.CharSequence r4) {
            boolean r0 = org.lwjgl.LWJGLUtil.DEBUG
            if (r0 == 0) goto L1f
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "[LWJGL] "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r4
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
        L1f:
            return
    }

    public static boolean isMacOSXEqualsOrBetterThan(int r5, int r6) {
            java.lang.String r0 = "os.version"
            java.lang.String r0 = getPrivilegedProperty(r0)
            r7 = r0
            java.util.StringTokenizer r0 = new java.util.StringTokenizer
            r1 = r0
            r2 = r7
            java.lang.String r3 = "."
            r1.<init>(r2, r3)
            r8 = r0
            r0 = r8
            java.lang.String r0 = r0.nextToken()     // Catch: java.lang.Exception -> L2e
            r11 = r0
            r0 = r8
            java.lang.String r0 = r0.nextToken()     // Catch: java.lang.Exception -> L2e
            r12 = r0
            r0 = r11
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L2e
            r9 = r0
            r0 = r12
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L2e
            r10 = r0
            goto L49
        L2e:
            r11 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "Exception occurred while trying to determine OS version: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r11
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            log(r0)
            r0 = 0
            return r0
        L49:
            r0 = r9
            r1 = r5
            if (r0 > r1) goto L5b
            r0 = r9
            r1 = r5
            if (r0 != r1) goto L5f
            r0 = r10
            r1 = r6
            if (r0 < r1) goto L5f
        L5b:
            r0 = 1
            goto L60
        L5f:
            r0 = 0
        L60:
            return r0
    }

    public static java.util.Map<java.lang.Integer, java.lang.String> getClassTokens(org.lwjgl.LWJGLUtil.TokenFilter r4, java.util.Map<java.lang.Integer, java.lang.String> r5, java.lang.Class... r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.util.Map r0 = getClassTokens(r0, r1, r2)
            return r0
    }

    public static java.util.Map<java.lang.Integer, java.lang.String> getClassTokens(org.lwjgl.LWJGLUtil.TokenFilter r4, java.util.Map<java.lang.Integer, java.lang.String> r5, java.lang.Iterable<java.lang.Class> r6) {
            r0 = r5
            if (r0 != 0) goto Lc
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r5 = r0
        Lc:
            r0 = 25
            r7 = r0
            r0 = r6
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
        L17:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Lbf
            r0 = r8
            java.lang.Object r0 = r0.next()
            java.lang.Class r0 = (java.lang.Class) r0
            r9 = r0
            r0 = r9
            java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
            r10 = r0
            r0 = r10
            int r0 = r0.length
            r11 = r0
            r0 = 0
            r12 = r0
        L3c:
            r0 = r12
            r1 = r11
            if (r0 >= r1) goto Lbc
            r0 = r10
            r1 = r12
            r0 = r0[r1]
            r13 = r0
            r0 = r13
            int r0 = r0.getModifiers()
            r1 = 25
            r0 = r0 & r1
            r1 = 25
            if (r0 != r1) goto Lb6
            r0 = r13
            java.lang.Class r0 = r0.getType()
            java.lang.Class r1 = java.lang.Integer.TYPE
            if (r0 != r1) goto Lb6
            r0 = r13
            r1 = 0
            int r0 = r0.getInt(r1)     // Catch: java.lang.IllegalAccessException -> Lb4
            r14 = r0
            r0 = r4
            if (r0 == 0) goto L7e
            r0 = r4
            r1 = r13
            r2 = r14
            boolean r0 = r0.accept(r1, r2)     // Catch: java.lang.IllegalAccessException -> Lb4
            if (r0 != 0) goto L7e
            goto Lb6
        L7e:
            r0 = r5
            r1 = r14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.IllegalAccessException -> Lb4
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.IllegalAccessException -> Lb4
            if (r0 == 0) goto La0
            r0 = r5
            r1 = r14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.IllegalAccessException -> Lb4
            r2 = r14
            java.lang.String r2 = toHexString(r2)     // Catch: java.lang.IllegalAccessException -> Lb4
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.IllegalAccessException -> Lb4
            goto Lb1
        La0:
            r0 = r5
            r1 = r14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.IllegalAccessException -> Lb4
            r2 = r13
            java.lang.String r2 = r2.getName()     // Catch: java.lang.IllegalAccessException -> Lb4
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.IllegalAccessException -> Lb4
        Lb1:
            goto Lb6
        Lb4:
            r14 = move-exception
        Lb6:
            int r12 = r12 + 1
            goto L3c
        Lbc:
            goto L17
        Lbf:
            r0 = r5
            return r0
    }

    public static java.lang.String toHexString(int r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "0x"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            java.lang.String r1 = r1.toUpperCase()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    static {
            java.lang.String r0 = "ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿþÿÿÿÂ×èÿt¤ËÿP\u008b½ÿT\u008e¿ÿ\u0086¯Òÿçïöÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿõõõÿ\u008d\u008f\u0091ÿv\u0082\u008dÿ}\u008d\u009bÿ\u0084\u0099ªÿ\u0094·Õÿ:}µÿH\u0086ºÿÚçñÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿôøûÿ\u009c\u009e ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿäääÿ\u0084\u00adÐÿ:}µÿ[\u0092Áÿüýþÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0091¶Õÿ___ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\"\"\"ÿÿÿÿÿèðöÿ9|µÿ:}µÿÄØéÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÆÙéÿ\u0081«Îÿ\u001d\u001d\u001dÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿfffÿÿÿÿÿÐàíÿ:}µÿ:}µÿ\u008d´Ôÿÿÿÿÿòòòÿ¥¥¥ÿßßßÿ¢ÁÜÿ°ÅÖÿ\n\n\nÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ¨¨¨ÿÿÿÿÿ\u0097ºØÿ:}µÿ:}µÿq¡Êÿÿÿÿÿ¡¡¡ÿ\u0000\u0000\u0000ÿ\u0001\u0001\u0001ÿ###ÿÌÌÌÿÐÐÐÿ¥¥¥ÿ\u0084\u0084\u0084ÿ\\\\\\ÿïïïÿÿÿÿÿ`\u0096Ãÿ:}µÿ:}µÿm\u009eÈÿÿÿÿÿ^^^ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿÏÏÏÿ\u001f\u001f\u001fÿ\u0003\u0003\u0003ÿ+++ÿlllÿÆÆÆÿúüýÿ\u009e¿Úÿw¥ÌÿL\u0089¼ÿ|¨Îÿÿÿÿÿ\u001b\u001b\u001bÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0017\u0017\u0017ÿÖÖÖÿ\u0001\u0001\u0001ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿRRRÿåååÿ===ÿhhhÿ¦¦§ÿÚÞáÿÿÿÿÿtttÿ\u000e\u000e\u000eÿ\u0000\u0000\u0000ÿYYYÿ\u0095\u0095\u0095ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0091\u0091\u0091ÿ\u009b\u009b\u009bÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0002\u0002\u0002ÿCCCÿÿÿÿÿîîîÿ\u008c\u008c\u008cÿ¿¿¿ÿVVVÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿÓÓÓÿXXXÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ333ÿÿÿÿÿÿÿÿÿüýþÿÿÿÿÿÀÀÀÿ@@@ÿ\u0002\u0002\u0002ÿ\u0000\u0000\u0000ÿ\u001b\u001b\u001bÿûûûÿ\u0017\u0017\u0017ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿxxxÿÿÿÿÿÿÿÿÿÒáîÿ~©ÎÿàêóÿÿÿÿÿÔÔÔÿmmmÿ\u0084\u0084\u0084ÿÓÓÓÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ½½½ÿÿÿÿÿÿÿÿÿþþþÿf\u009aÅÿ=\u007f¶ÿ\u0082¬Ðÿäíõÿÿÿÿÿÿÿÿÿåååÿ---ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\f\f\fÿöööÿÿÿÿÿÿÿÿÿÿÿÿÿâìôÿM\u0089¼ÿ:}µÿ>\u0080¶ÿ\u0087°Òÿçïöÿÿÿÿÿþþþÿ¼¼¼ÿOOOÿ\u0003\u0003\u0003ÿJJJÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿëòøÿ\u008c³ÔÿV\u0090ÀÿP\u008c½ÿw¥Ìÿíóøÿÿÿÿÿÿÿÿÿÿÿÿÿßßßÿæææÿÿÿÿÿ"
            java.nio.ByteBuffer r0 = loadIcon(r0)
            org.lwjgl.LWJGLUtil.LWJGLIcon16x16 = r0
            java.lang.String r0 = "ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿúüýÿËÝìÿ\u0093·Öÿo Éÿ\\\u0093Âÿ`\u0096Ãÿz§Íÿ¬ÈàÿíóøÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿüýþÿµÎãÿZ\u0092Áÿ:}µÿ:}µÿ:}µÿ:}µÿ:}µÿ:}µÿ:}µÿE\u0085¹ÿ¡ÁÜÿüýþÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿüüüÿâêñÿ¸Ïãÿ®Éàÿ£ÂÜÿ\u0098ºØÿ\u008c³Óÿ\u0081¬Ïÿn\u009fÈÿ=\u007f¶ÿ:}µÿ:}µÿ:}µÿr¢ÊÿõøûÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿØØØÿ111ÿ$$$ÿ111ÿ@@@ÿRRRÿeeeÿtttÿ\u008f\u008f\u008fÿ÷øøÿ¬Èßÿ;}µÿ:}µÿ:}µÿ:}µÿy§Íÿüýþÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿþþþÿhhhÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ¶¶¶ÿþþþÿ\u0086®Ñÿ:}µÿ:}µÿ:}µÿ:}µÿ®ÊáÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÓâîÿáêòÿ(((ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0002\u0002\u0002ÿÞÞÞÿÿÿÿÿõøûÿ[\u0092Áÿ:}µÿ:}µÿ:}µÿH\u0086ºÿôøûÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿìóøÿd\u0099Åÿ×ÙÛÿ\u0005\u0005\u0005ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ$$$ÿþþþÿÿÿÿÿÿÿÿÿÀÕçÿ9|µÿ:}µÿ:}µÿ:}µÿ«Èàÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿþÿÿÿx¦Ìÿ{§Íÿ\u009e\u009e\u009eÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿeeeÿÿÿÿÿÿÿÿÿÿÿÿÿâìôÿ7{´ÿ:}µÿ:}µÿ:}µÿf\u009aÅÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÃ×èÿ9}µÿ²ÌáÿXXXÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ©©©ÿÿÿÿÿÿÿÿÿÿÿÿÿ¼Òåÿ:}µÿ:}µÿ:}µÿ:}µÿ@\u0081·ÿîôùÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿúüýÿZ\u0092Áÿ=\u007f¶ÿÝåíÿ\u001c\u001c\u001cÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0007\u0007\u0007ÿçççÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0085®Ñÿ:}µÿ:}µÿ:}µÿ:}µÿ9}µÿÌÞìÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿþþþÿÿÿÿÿÿÿÿÿÿÿÿÿºÒåÿ:}µÿW\u0090¿ÿÐÑÑÿ\u0003\u0003\u0003ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ333ÿýýýÿÿÿÿÿÿÿÿÿûüýÿP\u008b½ÿ:}µÿ:}µÿ:}µÿ:}µÿ9}µÿ±ÌâÿÿÿÿÿÿÿÿÿÿÿÿÿÊÊÊÿ777ÿaaaÿ¢¢¢ÿÝÝÝÿäìóÿ±Ëáÿ´Íâÿæææÿ###ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿrrrÿÿÿÿÿÿÿÿÿÿÿÿÿØåðÿ:}µÿ:}µÿ:}µÿ:}µÿ:}µÿ:}µÿ ÀÛÿÿÿÿÿÿÿÿÿÿÿÿÿfffÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0006\u0006\u0006ÿ'''ÿfffÿÔÔÔÿÿÿÿÿöööÿÐÐÐÿ\u0097\u0097\u0097ÿ^^^ÿ'''ÿ\u0004\u0004\u0004ÿ\u0000\u0000\u0000ÿ\u0003\u0003\u0003ÿÀÀÀÿÿÿÿÿÿÿÿÿÿÿÿÿ¢ÁÛÿ:}µÿ:}µÿ:}µÿ:}µÿ:}µÿ:}µÿ\u009e¿Úÿÿÿÿÿÿÿÿÿûûûÿ%%%ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\\\\\\ÿÿÿÿÿêêêÿ\u008f\u008f\u008fÿµµµÿéééÿýýýÿçççÿ²²²ÿ½½½ÿþþþÿÿÿÿÿÿÿÿÿÿÿÿÿk\u009dÇÿ:}µÿ:}µÿ:}µÿ:}µÿ:}µÿ:}µÿ¡ÁÜÿÿÿÿÿÿÿÿÿÛÛÛÿ\u0003\u0003\u0003ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0083\u0083\u0083ÿÿÿÿÿ___ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u000b\u000b\u000bÿ777ÿvvvÿ···ÿðððÿÿÿÿÿÿÿÿÿÿÿÿÿðõùÿK\u0088»ÿ=\u007f¶ÿ9|µÿ:}µÿ:}µÿ:}µÿ:}µÿ²Ìâÿÿÿÿÿÿÿÿÿ\u009a\u009a\u009aÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿÅÅÅÿ÷÷÷ÿ\u001d\u001d\u001dÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0007\u0007\u0007ÿ<<<ÿßßßÿÿÿÿÿûüýÿüýþÿó÷úÿÌÝëÿ\u009e¾Úÿr¡ÉÿL\u0089»ÿ:}µÿÉÜëÿÿÿÿÿÿÿÿÿVVVÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u000f\u000f\u000fÿùùùÿÑÑÑÿ\u0003\u0003\u0003ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u008e\u008e\u008eÿÿÿÿÿùùùÿ\u0084\u0084\u0084ÿpppÿ°°°ÿêêêÿÿÿÿÿùûüÿÜèòÿöùüÿÿÿÿÿÿÿÿÿ\u0015\u0015\u0015ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿNNNÿÿÿÿÿ\u0091\u0091\u0091ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ»»»ÿÿÿÿÿ\u009e\u009e\u009eÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0004\u0004\u0004ÿ///ÿpppÿ°°°ÿæææÿþþþÿÿÿÿÿ999ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0090\u0090\u0090ÿÿÿÿÿMMMÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0010\u0010\u0010ÿðððÿÿÿÿÿZZZÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\t\t\tÿ222ÿ±±±ÿöööÿ¡¡¡ÿ555ÿ\u0002\u0002\u0002ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0002\u0002\u0002ÿÑÑÑÿõõõÿ\u0013\u0013\u0013ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿEEEÿþþþÿøøøÿ\u001d\u001d\u001dÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ+++ÿÿÿÿÿÿÿÿÿüüüÿ¾¾¾ÿPPPÿ\u0005\u0005\u0005ÿ%%%ÿùùùÿÂÂÂÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0086\u0086\u0086ÿÿÿÿÿÒÒÒÿ\u0001\u0001\u0001ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿCCCÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿþþþÿÜÜÜÿàààÿÿÿÿÿ\u0095\u0095\u0095ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0001\u0001\u0001ÿÈÈÈÿÿÿÿÿ\u008e\u008e\u008eÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0088\u0088\u0088ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿßßßÿ)))ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0018\u0018\u0018ÿõõõÿÿÿÿÿJJJÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿÏÏÏÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿñöúÿÿÿÿÿÿÿÿÿÿÿÿÿùùùÿµµµÿKKKÿ\u0006\u0006\u0006ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿRRRÿÿÿÿÿøøøÿ\u0010\u0010\u0010ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u001c\u001c\u001cÿøøøÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0086¯Ñÿ\u0090µÕÿêñ÷ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÛÛÛÿxxxÿ\u001b\u001b\u001bÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0096\u0096\u0096ÿÿÿÿÿÆÆÆÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿZZZÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÃØéÿ:}µÿC\u0083¸ÿ\u0094¸Öÿíóøÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿôôôÿ§§§ÿ\u0085\u0085\u0085ÿôôôÿÿÿÿÿ\u0086\u0086\u0086ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u009d\u009d\u009dÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿúûýÿ]\u0094Âÿ:}µÿ:}µÿF\u0085¹ÿ\u0098»Øÿïôùÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u009b\u009b\u009bÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0005\u0005\u0005ÿÝÝÝÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÅÙéÿ;~¶ÿ:}µÿ:}µÿ:}µÿH\u0086ºÿ\u009e¾Úÿòöúÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿûûûÿ\u008e\u008e\u008eÿ%%%ÿ\u0001\u0001\u0001ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ,,,ÿüüüÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u008fµÕÿ:}µÿ:}µÿ:}µÿ:}µÿ:}µÿJ\u0087»ÿ£ÂÜÿó÷úÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿúúúÿ°°°ÿEEEÿ\u0004\u0004\u0004ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿ\u0000\u0000\u0000ÿnnnÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿüýþÿ\u0085¯Ñÿ:}µÿ:}µÿ:}µÿ:}µÿ:}µÿ:}µÿM\u0089¼ÿ¨ÅÞÿöùüÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿþþþÿÒÒÒÿhhhÿ\u000e\u000e\u000eÿ\u0000\u0000\u0000ÿ\u0001\u0001\u0001ÿ¸¸¸ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿþþÿÿ±ËâÿL\u0089¼ÿ9}µÿ:}µÿ:}µÿ:}µÿ:}µÿ:}µÿM\u0089¼ÿ¿Ôçÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿìììÿ\u0093\u0093\u0093ÿ\u009b\u009b\u009bÿýýýÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿó÷úÿµÎãÿ\u0081¬Ðÿe\u0099Åÿa\u0097Äÿl\u009eÈÿ\u008fµÕÿÅÙéÿ÷úüÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ"
            java.nio.ByteBuffer r0 = loadIcon(r0)
            org.lwjgl.LWJGLUtil.LWJGLIcon32x32 = r0
            java.lang.String r0 = "org.lwjgl.util.Debug"
            boolean r0 = getPrivilegedBoolean(r0)
            org.lwjgl.LWJGLUtil.DEBUG = r0
            java.lang.String r0 = "org.lwjgl.util.NoChecks"
            boolean r0 = getPrivilegedBoolean(r0)
            if (r0 != 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            org.lwjgl.LWJGLUtil.CHECKS = r0
            java.lang.String r0 = "os.name"
            java.lang.String r0 = getPrivilegedProperty(r0)
            r5 = r0
            r0 = r5
            java.lang.String r1 = "Windows"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L3e
            r0 = 3
            org.lwjgl.LWJGLUtil.PLATFORM = r0
            goto La6
        L3e:
            r0 = r5
            java.lang.String r1 = "Linux"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L6b
            r0 = r5
            java.lang.String r1 = "FreeBSD"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L6b
            r0 = r5
            java.lang.String r1 = "SunOS"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L6b
            r0 = r5
            java.lang.String r1 = "Unix"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L6b
            r0 = r5
            java.lang.String r1 = "Android"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L72
        L6b:
            r0 = 1
            org.lwjgl.LWJGLUtil.PLATFORM = r0
            goto La6
        L72:
            r0 = r5
            java.lang.String r1 = "Mac OS X"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L84
            r0 = r5
            java.lang.String r1 = "Darwin"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L8b
        L84:
            r0 = 2
            org.lwjgl.LWJGLUtil.PLATFORM = r0
            goto La6
        L8b:
            java.lang.LinkageError r0 = new java.lang.LinkageError
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Unknown platform: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        La6:
            return
    }
}
