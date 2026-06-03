package org.lwjgl.system.macosx;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/macosx/ObjCRuntime.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/macosx/ObjCRuntime.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/macosx/ObjCRuntime.class */
public class ObjCRuntime {
    private static final org.lwjgl.system.SharedLibrary OBJC = null;
    public static final long nil = 0;
    public static final byte YES = 1;
    public static final byte NO = 0;
    public static final char _C_ID = '@';
    public static final char _C_CLASS = '#';
    public static final char _C_SEL = ':';
    public static final char _C_CHR = 'c';
    public static final char _C_UCHR = 'C';
    public static final char _C_SHT = 's';
    public static final char _C_USHT = 'S';
    public static final char _C_INT = 'i';
    public static final char _C_UINT = 'I';
    public static final char _C_LNG = 'l';
    public static final char _C_ULNG = 'L';
    public static final char _C_LNG_LNG = 'q';
    public static final char _C_ULNG_LNG = 'Q';
    public static final char _C_FLT = 'f';
    public static final char _C_DBL = 'd';
    public static final char _C_BFLD = 'b';
    public static final char _C_BOOL = 'B';
    public static final char _C_VOID = 'v';
    public static final char _C_UNDEF = '?';
    public static final char _C_PTR = '^';
    public static final char _C_CHARPTR = '*';
    public static final char _C_ATOM = '%';
    public static final char _C_ARY_B = '[';
    public static final char _C_ARY_E = ']';
    public static final char _C_UNION_B = '(';
    public static final char _C_UNION_E = ')';
    public static final char _C_STRUCT_B = '{';
    public static final char _C_STRUCT_E = '}';
    public static final char _C_VECTOR = '!';
    public static final char _C_CONST = 'r';
    public static final int OBJC_ASSOCIATION_ASSIGN = 0;
    public static final int OBJC_ASSOCIATION_RETAIN_NONATOMIC = 1;
    public static final int OBJC_ASSOCIATION_COPY_NONATOMIC = 3;
    public static final int OBJC_ASSOCIATION_RETAIN = 1401;
    public static final int OBJC_ASSOCIATION_COPY = 1403;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/macosx/ObjCRuntime$Functions.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/macosx/ObjCRuntime$Functions.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/macosx/ObjCRuntime$Functions.class */
    public static final class Functions {
        public static final long object_copy = 0;
        public static final long object_dispose = 0;
        public static final long object_getClass = 0;
        public static final long object_setClass = 0;
        public static final long object_getClassName = 0;
        public static final long object_getIndexedIvars = 0;
        public static final long object_getIvar = 0;
        public static final long object_setIvar = 0;
        public static final long object_setInstanceVariable = 0;
        public static final long object_getInstanceVariable = 0;
        public static final long objc_getClass = 0;
        public static final long objc_getMetaClass = 0;
        public static final long objc_lookUpClass = 0;
        public static final long objc_getRequiredClass = 0;
        public static final long objc_getClassList = 0;
        public static final long objc_copyClassList = 0;
        public static final long class_getName = 0;
        public static final long class_isMetaClass = 0;
        public static final long class_getSuperclass = 0;
        public static final long class_getVersion = 0;
        public static final long class_setVersion = 0;
        public static final long class_getInstanceSize = 0;
        public static final long class_getInstanceVariable = 0;
        public static final long class_getClassVariable = 0;
        public static final long class_copyIvarList = 0;
        public static final long class_getInstanceMethod = 0;
        public static final long class_getClassMethod = 0;
        public static final long class_getMethodImplementation = 0;
        public static final long class_respondsToSelector = 0;
        public static final long class_copyMethodList = 0;
        public static final long class_conformsToProtocol = 0;
        public static final long class_copyProtocolList = 0;
        public static final long class_getProperty = 0;
        public static final long class_copyPropertyList = 0;
        public static final long class_getIvarLayout = 0;
        public static final long class_getWeakIvarLayout = 0;
        public static final long class_addMethod = 0;
        public static final long class_replaceMethod = 0;
        public static final long class_addIvar = 0;
        public static final long class_addProtocol = 0;
        public static final long class_addProperty = 0;
        public static final long class_replaceProperty = 0;
        public static final long class_setIvarLayout = 0;
        public static final long class_setWeakIvarLayout = 0;
        public static final long class_createInstance = 0;
        public static final long objc_constructInstance = 0;
        public static final long objc_destructInstance = 0;
        public static final long objc_allocateClassPair = 0;
        public static final long objc_registerClassPair = 0;
        public static final long objc_disposeClassPair = 0;
        public static final long method_getName = 0;
        public static final long method_getImplementation = 0;
        public static final long method_getTypeEncoding = 0;
        public static final long method_getNumberOfArguments = 0;
        public static final long method_copyReturnType = 0;
        public static final long method_copyArgumentType = 0;
        public static final long method_getReturnType = 0;
        public static final long method_getArgumentType = 0;
        public static final long method_setImplementation = 0;
        public static final long method_exchangeImplementations = 0;
        public static final long ivar_getName = 0;
        public static final long ivar_getTypeEncoding = 0;
        public static final long ivar_getOffset = 0;
        public static final long property_getName = 0;
        public static final long property_getAttributes = 0;
        public static final long property_copyAttributeList = 0;
        public static final long property_copyAttributeValue = 0;
        public static final long objc_getProtocol = 0;
        public static final long objc_copyProtocolList = 0;
        public static final long protocol_conformsToProtocol = 0;
        public static final long protocol_isEqual = 0;
        public static final long protocol_getName = 0;
        public static final long protocol_getMethodDescription = 0;
        public static final long protocol_copyMethodDescriptionList = 0;
        public static final long protocol_getProperty = 0;
        public static final long protocol_copyPropertyList = 0;
        public static final long protocol_copyProtocolList = 0;
        public static final long objc_allocateProtocol = 0;
        public static final long objc_registerProtocol = 0;
        public static final long protocol_addMethodDescription = 0;
        public static final long protocol_addProtocol = 0;
        public static final long protocol_addProperty = 0;
        public static final long objc_copyImageNames = 0;
        public static final long class_getImageName = 0;
        public static final long objc_copyClassNamesForImage = 0;
        public static final long sel_getName = 0;
        public static final long sel_getUid = 0;
        public static final long sel_registerName = 0;
        public static final long sel_isEqual = 0;
        public static final long objc_enumerationMutation = 0;
        public static final long objc_setEnumerationMutationHandler = 0;
        public static final long imp_implementationWithBlock = 0;
        public static final long imp_getBlock = 0;
        public static final long imp_removeBlock = 0;
        public static final long objc_loadWeak = 0;
        public static final long objc_storeWeak = 0;
        public static final long objc_setAssociatedObject = 0;
        public static final long objc_getAssociatedObject = 0;
        public static final long objc_removeAssociatedObjects = 0;

        private Functions() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static {
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "object_copy"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.object_copy = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "object_dispose"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.object_dispose = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "object_getClass"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.object_getClass = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "object_setClass"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.object_setClass = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "object_getClassName"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.object_getClassName = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "object_getIndexedIvars"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.object_getIndexedIvars = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "object_getIvar"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.object_getIvar = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "object_setIvar"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.object_setIvar = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "object_setInstanceVariable"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.object_setInstanceVariable = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "object_getInstanceVariable"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.object_getInstanceVariable = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "objc_getClass"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_getClass = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "objc_getMetaClass"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_getMetaClass = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "objc_lookUpClass"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_lookUpClass = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "objc_getRequiredClass"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_getRequiredClass = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "objc_getClassList"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_getClassList = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "objc_copyClassList"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_copyClassList = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "class_getName"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.class_getName = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "class_isMetaClass"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.class_isMetaClass = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "class_getSuperclass"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.class_getSuperclass = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "class_getVersion"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.class_getVersion = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "class_setVersion"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.class_setVersion = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "class_getInstanceSize"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.class_getInstanceSize = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "class_getInstanceVariable"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.class_getInstanceVariable = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "class_getClassVariable"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.class_getClassVariable = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "class_copyIvarList"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.class_copyIvarList = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "class_getInstanceMethod"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.class_getInstanceMethod = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "class_getClassMethod"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.class_getClassMethod = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "class_getMethodImplementation"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.class_getMethodImplementation = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "class_respondsToSelector"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.class_respondsToSelector = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "class_copyMethodList"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.class_copyMethodList = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "class_conformsToProtocol"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.class_conformsToProtocol = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "class_copyProtocolList"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.class_copyProtocolList = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "class_getProperty"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.class_getProperty = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "class_copyPropertyList"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.class_copyPropertyList = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "class_getIvarLayout"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.class_getIvarLayout = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "class_getWeakIvarLayout"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.class_getWeakIvarLayout = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "class_addMethod"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.class_addMethod = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "class_replaceMethod"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.class_replaceMethod = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "class_addIvar"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.class_addIvar = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "class_addProtocol"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.class_addProtocol = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "class_addProperty"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.class_addProperty = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "class_replaceProperty"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.class_replaceProperty = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "class_setIvarLayout"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.class_setIvarLayout = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "class_setWeakIvarLayout"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.class_setWeakIvarLayout = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "class_createInstance"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.class_createInstance = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "objc_constructInstance"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_constructInstance = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "objc_destructInstance"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_destructInstance = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "objc_allocateClassPair"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_allocateClassPair = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "objc_registerClassPair"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_registerClassPair = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "objc_disposeClassPair"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_disposeClassPair = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "method_getName"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.method_getName = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "method_getImplementation"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.method_getImplementation = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "method_getTypeEncoding"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.method_getTypeEncoding = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "method_getNumberOfArguments"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.method_getNumberOfArguments = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "method_copyReturnType"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.method_copyReturnType = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "method_copyArgumentType"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.method_copyArgumentType = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "method_getReturnType"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.method_getReturnType = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "method_getArgumentType"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.method_getArgumentType = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "method_setImplementation"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.method_setImplementation = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "method_exchangeImplementations"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.method_exchangeImplementations = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "ivar_getName"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.ivar_getName = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "ivar_getTypeEncoding"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.ivar_getTypeEncoding = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "ivar_getOffset"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.ivar_getOffset = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "property_getName"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.property_getName = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "property_getAttributes"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.property_getAttributes = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "property_copyAttributeList"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.property_copyAttributeList = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "property_copyAttributeValue"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.property_copyAttributeValue = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "objc_getProtocol"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_getProtocol = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "objc_copyProtocolList"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_copyProtocolList = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "protocol_conformsToProtocol"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.protocol_conformsToProtocol = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "protocol_isEqual"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.protocol_isEqual = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "protocol_getName"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.protocol_getName = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "protocol_getMethodDescription"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.protocol_getMethodDescription = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "protocol_copyMethodDescriptionList"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.protocol_copyMethodDescriptionList = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "protocol_getProperty"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.protocol_getProperty = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "protocol_copyPropertyList"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.protocol_copyPropertyList = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "protocol_copyProtocolList"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.protocol_copyProtocolList = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "objc_allocateProtocol"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_allocateProtocol = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "objc_registerProtocol"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_registerProtocol = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "protocol_addMethodDescription"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.protocol_addMethodDescription = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "protocol_addProtocol"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.protocol_addProtocol = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "protocol_addProperty"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.protocol_addProperty = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "objc_copyImageNames"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_copyImageNames = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "class_getImageName"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.class_getImageName = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "objc_copyClassNamesForImage"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_copyClassNamesForImage = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "sel_getName"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.sel_getName = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "sel_getUid"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.sel_getUid = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "sel_registerName"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.sel_registerName = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "sel_isEqual"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.sel_isEqual = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "objc_enumerationMutation"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_enumerationMutation = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "objc_setEnumerationMutationHandler"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_setEnumerationMutationHandler = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "imp_implementationWithBlock"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.imp_implementationWithBlock = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "imp_getBlock"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.imp_getBlock = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "imp_removeBlock"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.imp_removeBlock = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "objc_loadWeak"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_loadWeak = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "objc_storeWeak"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_storeWeak = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "objc_setAssociatedObject"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_setAssociatedObject = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "objc_getAssociatedObject"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_getAssociatedObject = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.access$000()
                java.lang.String r1 = "objc_removeAssociatedObjects"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_removeAssociatedObjects = r0
                return
        }
    }

    public static org.lwjgl.system.SharedLibrary getLibrary() {
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.OBJC
            return r0
    }

    protected ObjCRuntime() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("id")
    public static long object_copy(@org.lwjgl.system.NativeType("id") long r7, @org.lwjgl.system.NativeType("size_t") long r9) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.object_copy
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.invokePPP(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("id")
    public static long object_dispose(@org.lwjgl.system.NativeType("id") long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.object_dispose
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("Class")
    public static long object_getClass(@org.lwjgl.system.NativeType("id") long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.object_getClass
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("Class")
    public static long object_setClass(@org.lwjgl.system.NativeType("id") long r7, @org.lwjgl.system.NativeType("Class") long r9) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.object_setClass
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.invokePPP(r0, r1, r2)
            return r0
    }

    public static long nobject_getClassName(long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.object_getClassName
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String object_getClassName(@org.lwjgl.system.NativeType("id") long r3) {
            r0 = r3
            long r0 = nobject_getClassName(r0)
            r5 = r0
            r0 = r5
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public static long object_getIndexedIvars(@org.lwjgl.system.NativeType("id") long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.object_getIndexedIvars
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("id")
    public static long object_getIvar(@org.lwjgl.system.NativeType("id") long r7, @org.lwjgl.system.NativeType("Ivar") long r9) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.object_getIvar
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.invokePPP(r0, r1, r2)
            return r0
    }

    public static void object_setIvar(@org.lwjgl.system.NativeType("id") long r9, @org.lwjgl.system.NativeType("Ivar") long r11, @org.lwjgl.system.NativeType("id") long r13) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.object_setIvar
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L1b:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            org.lwjgl.system.JNI.invokePPPV(r0, r1, r2, r3)
            return
    }

    public static long nobject_setInstanceVariable(long r9, long r11, long r13) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.object_setInstanceVariable
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            long r0 = org.lwjgl.system.JNI.invokePPPP(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("Ivar")
    public static long object_setInstanceVariable(@org.lwjgl.system.NativeType("id") long r7, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r9, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r9
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r7
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            long r0 = nobject_setInstanceVariable(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("Ivar")
    public static long object_setInstanceVariable(@org.lwjgl.system.NativeType("id") long r7, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r9, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r10) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r11 = r0
            r0 = r11
            int r0 = r0.getPointer()
            r12 = r0
            r0 = r11
            r1 = r9
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L31
            r0 = r11
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L31
            r13 = r0
            r0 = r7
            r1 = r13
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L31
            long r0 = nobject_setInstanceVariable(r0, r1, r2)     // Catch: java.lang.Throwable -> L31
            r15 = r0
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r15
            return r0
        L31:
            r17 = move-exception
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r17
            throw r0
    }

    public static long nobject_getInstanceVariable(long r9, long r11, long r13) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.object_getInstanceVariable
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            long r0 = org.lwjgl.system.JNI.invokePPPP(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("Ivar")
    public static long object_getInstanceVariable(@org.lwjgl.system.NativeType("id") long r7, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r9, @org.lwjgl.system.NativeType("void **") org.lwjgl.PointerBuffer r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r9
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lf:
            r0 = r7
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            long r0 = nobject_getInstanceVariable(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("Ivar")
    public static long object_getInstanceVariable(@org.lwjgl.system.NativeType("id") long r7, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r9, @org.lwjgl.system.NativeType("void **") org.lwjgl.PointerBuffer r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r11 = r0
            r0 = r11
            int r0 = r0.getPointer()
            r12 = r0
            r0 = r11
            r1 = r9
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L3c
            r0 = r11
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L3c
            r13 = r0
            r0 = r7
            r1 = r13
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L3c
            long r0 = nobject_getInstanceVariable(r0, r1, r2)     // Catch: java.lang.Throwable -> L3c
            r15 = r0
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r15
            return r0
        L3c:
            r17 = move-exception
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r17
            throw r0
    }

    public static long nobjc_getClass(long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_getClass
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("Class")
    public static long objc_getClass(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r3
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            long r0 = nobjc_getClass(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("Class")
    public static long objc_getClass(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = r4
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L23
            r0 = r5
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L23
            r7 = r0
            r0 = r7
            long r0 = nobjc_getClass(r0)     // Catch: java.lang.Throwable -> L23
            r9 = r0
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r9
            return r0
        L23:
            r11 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static long nobjc_getMetaClass(long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_getMetaClass
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("Class")
    public static long objc_getMetaClass(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r3
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            long r0 = nobjc_getMetaClass(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("Class")
    public static long objc_getMetaClass(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = r4
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L23
            r0 = r5
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L23
            r7 = r0
            r0 = r7
            long r0 = nobjc_getMetaClass(r0)     // Catch: java.lang.Throwable -> L23
            r9 = r0
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r9
            return r0
        L23:
            r11 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static long nobjc_lookUpClass(long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_lookUpClass
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("Class")
    public static long objc_lookUpClass(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r3
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            long r0 = nobjc_lookUpClass(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("Class")
    public static long objc_lookUpClass(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = r4
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L23
            r0 = r5
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L23
            r7 = r0
            r0 = r7
            long r0 = nobjc_lookUpClass(r0)     // Catch: java.lang.Throwable -> L23
            r9 = r0
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r9
            return r0
        L23:
            r11 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static long nobjc_getRequiredClass(long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_getRequiredClass
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("Class")
    public static long objc_getRequiredClass(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r3
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            long r0 = nobjc_getRequiredClass(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("Class")
    public static long objc_getRequiredClass(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = r4
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L23
            r0 = r5
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L23
            r7 = r0
            r0 = r7
            long r0 = nobjc_getRequiredClass(r0)     // Catch: java.lang.Throwable -> L23
            r9 = r0
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r9
            return r0
        L23:
            r11 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static int nobjc_getClassList(long r6, int r8) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_getClassList
            r9 = r0
            r0 = r6
            r1 = r8
            r2 = r9
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1, r2)
            return r0
    }

    public static int objc_getClassList(@javax.annotation.Nullable @org.lwjgl.system.NativeType("Class *") org.lwjgl.PointerBuffer r4) {
            r0 = r4
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            r1 = r4
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            int r0 = nobjc_getClassList(r0, r1)
            return r0
    }

    public static long nobjc_copyClassList(long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_copyClassList
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("Class *")
    public static org.lwjgl.PointerBuffer objc_copyClassList() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)
            r7 = r0
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)     // Catch: java.lang.Throwable -> L2a
            long r0 = nobjc_copyClassList(r0)     // Catch: java.lang.Throwable -> L2a
            r8 = r0
            r0 = r8
            r1 = r7
            r2 = 0
            int r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L2a
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBufferSafe(r0, r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r11 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static long nclass_getName(long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.class_getName
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String class_getName(@org.lwjgl.system.NativeType("Class") long r3) {
            r0 = r3
            long r0 = nclass_getName(r0)
            r5 = r0
            r0 = r5
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean class_isMetaClass(@org.lwjgl.system.NativeType("Class") long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.class_isMetaClass
            r7 = r0
            r0 = r5
            r1 = r7
            boolean r0 = org.lwjgl.system.JNI.invokePZ(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("Class")
    public static long class_getSuperclass(@org.lwjgl.system.NativeType("Class") long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.class_getSuperclass
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    public static int class_getVersion(@org.lwjgl.system.NativeType("Class") long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.class_getVersion
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            return r0
    }

    public static void class_setVersion(@org.lwjgl.system.NativeType("Class") long r6, int r8) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.class_setVersion
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r6
            r1 = r8
            r2 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("size_t")
    public static long class_getInstanceSize(@org.lwjgl.system.NativeType("Class") long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.class_getInstanceSize
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    public static long nclass_getInstanceVariable(long r7, long r9) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.class_getInstanceVariable
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.invokePPP(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("Ivar")
    public static long class_getInstanceVariable(@org.lwjgl.system.NativeType("Class") long r5, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            long r0 = nclass_getInstanceVariable(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("Ivar")
    public static long class_getInstanceVariable(@org.lwjgl.system.NativeType("Class") long r5, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r7) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = r7
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L28
            r0 = r8
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L28
            r10 = r0
            r0 = r5
            r1 = r10
            long r0 = nclass_getInstanceVariable(r0, r1)     // Catch: java.lang.Throwable -> L28
            r12 = r0
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r12
            return r0
        L28:
            r14 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r14
            throw r0
    }

    public static long nclass_getClassVariable(long r7, long r9) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.class_getClassVariable
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.invokePPP(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("Ivar")
    public static long class_getClassVariable(@org.lwjgl.system.NativeType("Class") long r5, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            long r0 = nclass_getClassVariable(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("Ivar")
    public static long class_getClassVariable(@org.lwjgl.system.NativeType("Class") long r5, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r7) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = r7
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L28
            r0 = r8
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L28
            r10 = r0
            r0 = r5
            r1 = r10
            long r0 = nclass_getClassVariable(r0, r1)     // Catch: java.lang.Throwable -> L28
            r12 = r0
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r12
            return r0
        L28:
            r14 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r14
            throw r0
    }

    public static long nclass_copyIvarList(long r7, long r9) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.class_copyIvarList
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.invokePPP(r0, r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("Ivar *")
    public static org.lwjgl.PointerBuffer class_copyIvarList(@org.lwjgl.system.NativeType("Class") long r5) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)
            r9 = r0
            r0 = r5
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L30
            long r0 = nclass_copyIvarList(r0, r1)     // Catch: java.lang.Throwable -> L30
            r10 = r0
            r0 = r10
            r1 = r9
            r2 = 0
            int r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L30
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBufferSafe(r0, r1)     // Catch: java.lang.Throwable -> L30
            r12 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r12
            return r0
        L30:
            r13 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    @org.lwjgl.system.NativeType("Method")
    public static long class_getInstanceMethod(@org.lwjgl.system.NativeType("Class") long r7, @org.lwjgl.system.NativeType("SEL") long r9) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.class_getInstanceMethod
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.invokePPP(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("Method")
    public static long class_getClassMethod(@org.lwjgl.system.NativeType("Class") long r7, @org.lwjgl.system.NativeType("SEL") long r9) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.class_getClassMethod
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.invokePPP(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("IMP")
    public static long class_getMethodImplementation(@org.lwjgl.system.NativeType("Class") long r7, @org.lwjgl.system.NativeType("SEL") long r9) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.class_getMethodImplementation
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.invokePPP(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean class_respondsToSelector(@org.lwjgl.system.NativeType("Class") long r7, @org.lwjgl.system.NativeType("SEL") long r9) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.class_respondsToSelector
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r7
            r1 = r9
            r2 = r11
            boolean r0 = org.lwjgl.system.JNI.invokePPZ(r0, r1, r2)
            return r0
    }

    public static long nclass_copyMethodList(long r7, long r9) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.class_copyMethodList
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.invokePPP(r0, r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("Method *")
    public static org.lwjgl.PointerBuffer class_copyMethodList(@org.lwjgl.system.NativeType("Class") long r5) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)
            r9 = r0
            r0 = r5
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L30
            long r0 = nclass_copyMethodList(r0, r1)     // Catch: java.lang.Throwable -> L30
            r10 = r0
            r0 = r10
            r1 = r9
            r2 = 0
            int r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L30
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBufferSafe(r0, r1)     // Catch: java.lang.Throwable -> L30
            r12 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r12
            return r0
        L30:
            r13 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean class_conformsToProtocol(@org.lwjgl.system.NativeType("Class") long r7, @org.lwjgl.system.NativeType("Protocol *") long r9) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.class_conformsToProtocol
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r7
            r1 = r9
            r2 = r11
            boolean r0 = org.lwjgl.system.JNI.invokePPZ(r0, r1, r2)
            return r0
    }

    public static long nclass_copyProtocolList(long r7, long r9) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.class_copyProtocolList
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.invokePPP(r0, r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("Protocol **")
    public static org.lwjgl.PointerBuffer class_copyProtocolList(@org.lwjgl.system.NativeType("Class") long r5) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)
            r9 = r0
            r0 = r5
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L30
            long r0 = nclass_copyProtocolList(r0, r1)     // Catch: java.lang.Throwable -> L30
            r10 = r0
            r0 = r10
            r1 = r9
            r2 = 0
            int r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L30
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBufferSafe(r0, r1)     // Catch: java.lang.Throwable -> L30
            r12 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r12
            return r0
        L30:
            r13 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static long nclass_getProperty(long r7, long r9) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.class_getProperty
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.invokePPP(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("objc_property_t")
    public static long class_getProperty(@org.lwjgl.system.NativeType("Class") long r5, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            long r0 = nclass_getProperty(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("objc_property_t")
    public static long class_getProperty(@org.lwjgl.system.NativeType("Class") long r5, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r7) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = r7
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L28
            r0 = r8
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L28
            r10 = r0
            r0 = r5
            r1 = r10
            long r0 = nclass_getProperty(r0, r1)     // Catch: java.lang.Throwable -> L28
            r12 = r0
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r12
            return r0
        L28:
            r14 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r14
            throw r0
    }

    public static long nclass_copyPropertyList(long r7, long r9) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.class_copyPropertyList
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.invokePPP(r0, r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("objc_property_t *")
    public static org.lwjgl.PointerBuffer class_copyPropertyList(@org.lwjgl.system.NativeType("Class") long r5) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)
            r9 = r0
            r0 = r5
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L30
            long r0 = nclass_copyPropertyList(r0, r1)     // Catch: java.lang.Throwable -> L30
            r10 = r0
            r0 = r10
            r1 = r9
            r2 = 0
            int r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L30
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBufferSafe(r0, r1)     // Catch: java.lang.Throwable -> L30
            r12 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r12
            return r0
        L30:
            r13 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static long nclass_getIvarLayout(long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.class_getIvarLayout
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("uint8_t const *")
    public static java.lang.String class_getIvarLayout(@org.lwjgl.system.NativeType("Class") long r3) {
            r0 = r3
            long r0 = nclass_getIvarLayout(r0)
            r5 = r0
            r0 = r5
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCIISafe(r0)
            return r0
    }

    public static long nclass_getWeakIvarLayout(long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.class_getWeakIvarLayout
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("uint8_t const *")
    public static java.lang.String class_getWeakIvarLayout(@org.lwjgl.system.NativeType("Class") long r3) {
            r0 = r3
            long r0 = nclass_getWeakIvarLayout(r0)
            r5 = r0
            r0 = r5
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCIISafe(r0)
            return r0
    }

    public static boolean nclass_addMethod(long r11, long r13, long r15, long r17) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.class_addMethod
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
        L1b:
            r0 = r11
            r1 = r13
            r2 = r15
            r3 = r17
            r4 = r19
            boolean r0 = org.lwjgl.system.JNI.invokePPPPZ(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean class_addMethod(@org.lwjgl.system.NativeType("Class") long r9, @org.lwjgl.system.NativeType("SEL") long r11, @org.lwjgl.system.NativeType("IMP") long r13, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r15
            org.lwjgl.system.Checks.checkNT1(r0)
        Lb:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            boolean r0 = nclass_addMethod(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean class_addMethod(@org.lwjgl.system.NativeType("Class") long r9, @org.lwjgl.system.NativeType("SEL") long r11, @org.lwjgl.system.NativeType("IMP") long r13, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r15) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r16 = r0
            r0 = r16
            int r0 = r0.getPointer()
            r17 = r0
            r0 = r16
            r1 = r15
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L31
            r0 = r16
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L31
            r18 = r0
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r18
            boolean r0 = nclass_addMethod(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L31
            r20 = r0
            r0 = r16
            r1 = r17
            r0.setPointer(r1)
            r0 = r20
            return r0
        L31:
            r21 = move-exception
            r0 = r16
            r1 = r17
            r0.setPointer(r1)
            r0 = r21
            throw r0
    }

    public static long nclass_replaceMethod(long r11, long r13, long r15, long r17) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.class_replaceMethod
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
        L1b:
            r0 = r11
            r1 = r13
            r2 = r15
            r3 = r17
            r4 = r19
            long r0 = org.lwjgl.system.JNI.invokePPPPP(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("IMP")
    public static long class_replaceMethod(@org.lwjgl.system.NativeType("Class") long r9, @org.lwjgl.system.NativeType("SEL") long r11, @org.lwjgl.system.NativeType("IMP") long r13, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r15
            org.lwjgl.system.Checks.checkNT1(r0)
        Lb:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            long r0 = nclass_replaceMethod(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("IMP")
    public static long class_replaceMethod(@org.lwjgl.system.NativeType("Class") long r9, @org.lwjgl.system.NativeType("SEL") long r11, @org.lwjgl.system.NativeType("IMP") long r13, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r15) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r16 = r0
            r0 = r16
            int r0 = r0.getPointer()
            r17 = r0
            r0 = r16
            r1 = r15
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L31
            r0 = r16
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L31
            r18 = r0
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r18
            long r0 = nclass_replaceMethod(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L31
            r20 = r0
            r0 = r16
            r1 = r17
            r0.setPointer(r1)
            r0 = r20
            return r0
        L31:
            r22 = move-exception
            r0 = r16
            r1 = r17
            r0.setPointer(r1)
            r0 = r22
            throw r0
    }

    public static boolean nclass_addIvar(long r12, long r14, long r16, byte r18, long r19) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.class_addIvar
            r21 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r12
            r1 = r14
            r2 = r16
            r3 = r18
            r4 = r19
            r5 = r21
            boolean r0 = org.lwjgl.system.JNI.invokePPPUPZ(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean class_addIvar(@org.lwjgl.system.NativeType("Class") long r10, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r12, @org.lwjgl.system.NativeType("size_t") long r13, @org.lwjgl.system.NativeType("uint8_t") byte r15, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r16) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r12
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r16
            org.lwjgl.system.Checks.checkNT1(r0)
        Lf:
            r0 = r10
            r1 = r12
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r13
            r3 = r15
            r4 = r16
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            boolean r0 = nclass_addIvar(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean class_addIvar(@org.lwjgl.system.NativeType("Class") long r10, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r12, @org.lwjgl.system.NativeType("size_t") long r13, @org.lwjgl.system.NativeType("uint8_t") byte r15, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r16) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r17 = r0
            r0 = r17
            int r0 = r0.getPointer()
            r18 = r0
            r0 = r17
            r1 = r12
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L42
            r0 = r17
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L42
            r19 = r0
            r0 = r17
            r1 = r16
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L42
            r0 = r17
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L42
            r21 = r0
            r0 = r10
            r1 = r19
            r2 = r13
            r3 = r15
            r4 = r21
            boolean r0 = nclass_addIvar(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L42
            r23 = r0
            r0 = r17
            r1 = r18
            r0.setPointer(r1)
            r0 = r23
            return r0
        L42:
            r24 = move-exception
            r0 = r17
            r1 = r18
            r0.setPointer(r1)
            r0 = r24
            throw r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean class_addProtocol(@org.lwjgl.system.NativeType("Class") long r7, @org.lwjgl.system.NativeType("Protocol *") long r9) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.class_addProtocol
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r7
            r1 = r9
            r2 = r11
            boolean r0 = org.lwjgl.system.JNI.invokePPZ(r0, r1, r2)
            return r0
    }

    public static boolean nclass_addProperty(long r10, long r12, long r14, int r16) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.class_addProperty
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1f
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r14
            r1 = r16
            int r2 = org.lwjgl.system.macosx.ObjCPropertyAttribute.SIZEOF
            boolean r3 = org.lwjgl.system.macosx.ObjCPropertyAttribute::validate
            org.lwjgl.system.Struct.validate(r0, r1, r2, r3)
        L1f:
            r0 = r10
            r1 = r12
            r2 = r14
            r3 = r16
            r4 = r17
            boolean r0 = org.lwjgl.system.JNI.invokePPPZ(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean class_addProperty(@org.lwjgl.system.NativeType("Class") long r8, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r10, @org.lwjgl.system.NativeType("objc_property_attribute_t const *") org.lwjgl.system.macosx.ObjCPropertyAttribute.Buffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r10
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r8
            r1 = r10
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r11
            long r2 = r2.address()
            r3 = r11
            int r3 = r3.remaining()
            boolean r0 = nclass_addProperty(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean class_addProperty(@org.lwjgl.system.NativeType("Class") long r8, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r10, @org.lwjgl.system.NativeType("objc_property_attribute_t const *") org.lwjgl.system.macosx.ObjCPropertyAttribute.Buffer r11) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r12 = r0
            r0 = r12
            int r0 = r0.getPointer()
            r13 = r0
            r0 = r12
            r1 = r10
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L35
            r0 = r12
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L35
            r14 = r0
            r0 = r8
            r1 = r14
            r2 = r11
            long r2 = r2.address()     // Catch: java.lang.Throwable -> L35
            r3 = r11
            int r3 = r3.remaining()     // Catch: java.lang.Throwable -> L35
            boolean r0 = nclass_addProperty(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L35
            r16 = r0
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            r0 = r16
            return r0
        L35:
            r17 = move-exception
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            r0 = r17
            throw r0
    }

    public static void nclass_replaceProperty(long r10, long r12, long r14, int r16) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.class_replaceProperty
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1f
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r14
            r1 = r16
            int r2 = org.lwjgl.system.macosx.ObjCPropertyAttribute.SIZEOF
            void r3 = org.lwjgl.system.macosx.ObjCPropertyAttribute::validate
            org.lwjgl.system.Struct.validate(r0, r1, r2, r3)
        L1f:
            r0 = r10
            r1 = r12
            r2 = r14
            r3 = r16
            r4 = r17
            org.lwjgl.system.JNI.invokePPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void class_replaceProperty(@org.lwjgl.system.NativeType("Class") long r8, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r10, @org.lwjgl.system.NativeType("objc_property_attribute_t const *") org.lwjgl.system.macosx.ObjCPropertyAttribute.Buffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r10
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r8
            r1 = r10
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r11
            long r2 = r2.address()
            r3 = r11
            int r3 = r3.remaining()
            nclass_replaceProperty(r0, r1, r2, r3)
            return
    }

    public static void class_replaceProperty(@org.lwjgl.system.NativeType("Class") long r8, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r10, @org.lwjgl.system.NativeType("objc_property_attribute_t const *") org.lwjgl.system.macosx.ObjCPropertyAttribute.Buffer r11) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r12 = r0
            r0 = r12
            int r0 = r0.getPointer()
            r13 = r0
            r0 = r12
            r1 = r10
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L33
            r0 = r12
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L33
            r14 = r0
            r0 = r8
            r1 = r14
            r2 = r11
            long r2 = r2.address()     // Catch: java.lang.Throwable -> L33
            r3 = r11
            int r3 = r3.remaining()     // Catch: java.lang.Throwable -> L33
            nclass_replaceProperty(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L33
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            goto L3f
        L33:
            r16 = move-exception
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            r0 = r16
            throw r0
        L3f:
            return
    }

    public static void nclass_setIvarLayout(long r7, long r9) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.class_setIvarLayout
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2)
            return
    }

    public static void class_setIvarLayout(@org.lwjgl.system.NativeType("Class") long r5, @org.lwjgl.system.NativeType("uint8_t const *") java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nclass_setIvarLayout(r0, r1)
            return
    }

    public static void class_setIvarLayout(@org.lwjgl.system.NativeType("Class") long r5, @org.lwjgl.system.NativeType("uint8_t const *") java.lang.CharSequence r7) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = r7
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L26
            r0 = r8
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L26
            r10 = r0
            r0 = r5
            r1 = r10
            nclass_setIvarLayout(r0, r1)     // Catch: java.lang.Throwable -> L26
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            goto L31
        L26:
            r12 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r12
            throw r0
        L31:
            return
    }

    public static void nclass_setWeakIvarLayout(long r7, long r9) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.class_setWeakIvarLayout
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2)
            return
    }

    public static void class_setWeakIvarLayout(@org.lwjgl.system.NativeType("Class") long r5, @org.lwjgl.system.NativeType("uint8_t const *") java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nclass_setWeakIvarLayout(r0, r1)
            return
    }

    public static void class_setWeakIvarLayout(@org.lwjgl.system.NativeType("Class") long r5, @org.lwjgl.system.NativeType("uint8_t const *") java.lang.CharSequence r7) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = r7
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L26
            r0 = r8
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L26
            r10 = r0
            r0 = r5
            r1 = r10
            nclass_setWeakIvarLayout(r0, r1)     // Catch: java.lang.Throwable -> L26
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            goto L31
        L26:
            r12 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r12
            throw r0
        L31:
            return
    }

    @org.lwjgl.system.NativeType("id")
    public static long class_createInstance(@org.lwjgl.system.NativeType("Class") long r7, @org.lwjgl.system.NativeType("size_t") long r9) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.class_createInstance
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.invokePPP(r0, r1, r2)
            return r0
    }

    public static long nobjc_constructInstance(long r7, long r9) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_constructInstance
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.invokePPP(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("id")
    public static long objc_constructInstance(@org.lwjgl.system.NativeType("Class") long r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            boolean r0 = org.lwjgl.system.Checks.DEBUG
            if (r0 == 0) goto L14
            r0 = r7
            r1 = r5
            long r1 = class_getInstanceSize(r1)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L14:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            long r0 = nobjc_constructInstance(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public static long objc_destructInstance(@org.lwjgl.system.NativeType("id") long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_destructInstance
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    public static long nobjc_allocateClassPair(long r9, long r11, long r13) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_allocateClassPair
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            long r0 = org.lwjgl.system.JNI.invokePPPP(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("Class")
    public static long objc_allocateClassPair(@org.lwjgl.system.NativeType("Class") long r7, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r9, @org.lwjgl.system.NativeType("size_t") long r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r9
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r7
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r10
            long r0 = nobjc_allocateClassPair(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("Class")
    public static long objc_allocateClassPair(@org.lwjgl.system.NativeType("Class") long r7, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r9, @org.lwjgl.system.NativeType("size_t") long r10) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r12 = r0
            r0 = r12
            int r0 = r0.getPointer()
            r13 = r0
            r0 = r12
            r1 = r9
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L2e
            r0 = r12
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L2e
            r14 = r0
            r0 = r7
            r1 = r14
            r2 = r10
            long r0 = nobjc_allocateClassPair(r0, r1, r2)     // Catch: java.lang.Throwable -> L2e
            r16 = r0
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            r0 = r16
            return r0
        L2e:
            r18 = move-exception
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            r0 = r18
            throw r0
    }

    public static void objc_registerClassPair(@org.lwjgl.system.NativeType("Class") long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_registerClassPair
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    public static void objc_disposeClassPair(@org.lwjgl.system.NativeType("Class") long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_disposeClassPair
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("SEL")
    public static long method_getName(@org.lwjgl.system.NativeType("Method") long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.method_getName
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("IMP")
    public static long method_getImplementation(@org.lwjgl.system.NativeType("Method") long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.method_getImplementation
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    public static long nmethod_getTypeEncoding(long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.method_getTypeEncoding
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String method_getTypeEncoding(@org.lwjgl.system.NativeType("Method") long r3) {
            r0 = r3
            long r0 = nmethod_getTypeEncoding(r0)
            r5 = r0
            r0 = r5
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned int")
    public static int method_getNumberOfArguments(@org.lwjgl.system.NativeType("Method") long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.method_getNumberOfArguments
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            return r0
    }

    public static long nmethod_copyReturnType(long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.method_copyReturnType
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char *")
    public static java.lang.String method_copyReturnType(@org.lwjgl.system.NativeType("Method") long r3) {
            r0 = r3
            long r0 = nmethod_copyReturnType(r0)
            r5 = r0
            r0 = r5
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    public static long nmethod_copyArgumentType(long r6, int r8) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.method_copyArgumentType
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r6
            r1 = r8
            r2 = r9
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char *")
    public static java.lang.String method_copyArgumentType(@org.lwjgl.system.NativeType("Method") long r5, @org.lwjgl.system.NativeType("unsigned int") int r7) {
            r0 = 0
            r8 = r0
            r0 = r5
            r1 = r7
            long r0 = nmethod_copyArgumentType(r0, r1)     // Catch: java.lang.Throwable -> L1b
            r8 = r0
            r0 = r8
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)     // Catch: java.lang.Throwable -> L1b
            r10 = r0
            r0 = r8
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L18
            r0 = r8
            org.lwjgl.system.libc.LibCStdlib.nfree(r0)
        L18:
            r0 = r10
            return r0
        L1b:
            r11 = move-exception
            r0 = r8
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L27
            r0 = r8
            org.lwjgl.system.libc.LibCStdlib.nfree(r0)
        L27:
            r0 = r11
            throw r0
    }

    public static void nmethod_getReturnType(long r9, long r11, long r13) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.method_getReturnType
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            org.lwjgl.system.JNI.invokePPPV(r0, r1, r2, r3)
            return
    }

    public static void method_getReturnType(@org.lwjgl.system.NativeType("Method") long r7, @org.lwjgl.system.NativeType("char *") java.nio.ByteBuffer r9) {
            r0 = r7
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            int r2 = r2.remaining()
            long r2 = (long) r2
            nmethod_getReturnType(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String method_getReturnType(@org.lwjgl.system.NativeType("Method") long r7, @org.lwjgl.system.NativeType("size_t") long r9) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r11 = r0
            r0 = r11
            int r0 = r0.getPointer()
            r12 = r0
            r0 = r11
            r1 = r9
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L38
            java.nio.ByteBuffer r0 = r0.malloc(r1)     // Catch: java.lang.Throwable -> L38
            r13 = r0
            r0 = r7
            r1 = r13
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L38
            r2 = r9
            nmethod_getReturnType(r0, r1, r2)     // Catch: java.lang.Throwable -> L38
            r0 = r13
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)     // Catch: java.lang.Throwable -> L38
            r1 = r9
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L38
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferNT1(r0, r1)     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8(r0)     // Catch: java.lang.Throwable -> L38
            r14 = r0
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r14
            return r0
        L38:
            r15 = move-exception
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r15
            throw r0
    }

    public static void nmethod_getArgumentType(long r10, int r12, long r13, long r15) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.method_getArgumentType
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r17
            org.lwjgl.system.JNI.invokePPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void method_getArgumentType(@org.lwjgl.system.NativeType("Method") long r8, @org.lwjgl.system.NativeType("unsigned int") int r10, @org.lwjgl.system.NativeType("char *") java.nio.ByteBuffer r11) {
            r0 = r8
            r1 = r10
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r11
            int r3 = r3.remaining()
            long r3 = (long) r3
            nmethod_getArgumentType(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String method_getArgumentType(@org.lwjgl.system.NativeType("Method") long r8, @org.lwjgl.system.NativeType("unsigned int") int r10, @org.lwjgl.system.NativeType("size_t") long r11) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r13 = r0
            r0 = r13
            int r0 = r0.getPointer()
            r14 = r0
            r0 = r13
            r1 = r11
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L39
            java.nio.ByteBuffer r0 = r0.malloc(r1)     // Catch: java.lang.Throwable -> L39
            r15 = r0
            r0 = r8
            r1 = r10
            r2 = r15
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L39
            r3 = r11
            nmethod_getArgumentType(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L39
            r0 = r15
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)     // Catch: java.lang.Throwable -> L39
            r1 = r11
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L39
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferNT1(r0, r1)     // Catch: java.lang.Throwable -> L39
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8(r0)     // Catch: java.lang.Throwable -> L39
            r16 = r0
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            r0 = r16
            return r0
        L39:
            r17 = move-exception
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            r0 = r17
            throw r0
    }

    @org.lwjgl.system.NativeType("IMP")
    public static long method_setImplementation(@org.lwjgl.system.NativeType("Method") long r7, @org.lwjgl.system.NativeType("IMP") long r9) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.method_setImplementation
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.invokePPP(r0, r1, r2)
            return r0
    }

    public static void method_exchangeImplementations(@org.lwjgl.system.NativeType("Method") long r7, @org.lwjgl.system.NativeType("Method") long r9) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.method_exchangeImplementations
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r7
            r1 = r9
            r2 = r11
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2)
            return
    }

    public static long nivar_getName(long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.ivar_getName
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String ivar_getName(@org.lwjgl.system.NativeType("Ivar") long r3) {
            r0 = r3
            long r0 = nivar_getName(r0)
            r5 = r0
            r0 = r5
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    public static long nivar_getTypeEncoding(long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.ivar_getTypeEncoding
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String ivar_getTypeEncoding(@org.lwjgl.system.NativeType("Ivar") long r3) {
            r0 = r3
            long r0 = nivar_getTypeEncoding(r0)
            r5 = r0
            r0 = r5
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("ptrdiff_t")
    public static long ivar_getOffset(@org.lwjgl.system.NativeType("Ivar") long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.ivar_getOffset
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    public static long nproperty_getName(long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.property_getName
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String property_getName(@org.lwjgl.system.NativeType("objc_property_t") long r3) {
            r0 = r3
            long r0 = nproperty_getName(r0)
            r5 = r0
            r0 = r5
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    public static long nproperty_getAttributes(long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.property_getAttributes
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String property_getAttributes(@org.lwjgl.system.NativeType("objc_property_t") long r3) {
            r0 = r3
            long r0 = nproperty_getAttributes(r0)
            r5 = r0
            r0 = r5
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    public static long nproperty_copyAttributeList(long r7, long r9) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.property_copyAttributeList
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.invokePPP(r0, r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("objc_property_attribute_t *")
    public static org.lwjgl.system.macosx.ObjCPropertyAttribute.Buffer property_copyAttributeList(@org.lwjgl.system.NativeType("objc_property_t") long r5) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)
            r9 = r0
            r0 = r5
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L30
            long r0 = nproperty_copyAttributeList(r0, r1)     // Catch: java.lang.Throwable -> L30
            r10 = r0
            r0 = r10
            r1 = r9
            r2 = 0
            int r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L30
            org.lwjgl.system.macosx.ObjCPropertyAttribute$Buffer r0 = org.lwjgl.system.macosx.ObjCPropertyAttribute.createSafe(r0, r1)     // Catch: java.lang.Throwable -> L30
            r12 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r12
            return r0
        L30:
            r13 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static long nproperty_copyAttributeValue(long r7, long r9) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.property_copyAttributeValue
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.invokePPP(r0, r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char *")
    public static java.lang.String property_copyAttributeValue(@org.lwjgl.system.NativeType("objc_property_t") long r5, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = 0
            r8 = r0
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L28
            long r0 = nproperty_copyAttributeValue(r0, r1)     // Catch: java.lang.Throwable -> L28
            r8 = r0
            r0 = r8
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)     // Catch: java.lang.Throwable -> L28
            r10 = r0
            r0 = r8
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L25
            r0 = r8
            org.lwjgl.system.libc.LibCStdlib.nfree(r0)
        L25:
            r0 = r10
            return r0
        L28:
            r11 = move-exception
            r0 = r8
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L34
            r0 = r8
            org.lwjgl.system.libc.LibCStdlib.nfree(r0)
        L34:
            r0 = r11
            throw r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char *")
    public static java.lang.String property_copyAttributeValue(@org.lwjgl.system.NativeType("objc_property_t") long r5, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r7) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = r8
            r1 = r7
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L3e
            r0 = r8
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L3e
            r12 = r0
            r0 = r5
            r1 = r12
            long r0 = nproperty_copyAttributeValue(r0, r1)     // Catch: java.lang.Throwable -> L3e
            r10 = r0
            r0 = r10
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)     // Catch: java.lang.Throwable -> L3e
            r14 = r0
            r0 = r10
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L35
            r0 = r10
            org.lwjgl.system.libc.LibCStdlib.nfree(r0)
        L35:
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r14
            return r0
        L3e:
            r15 = move-exception
            r0 = r10
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L4c
            r0 = r10
            org.lwjgl.system.libc.LibCStdlib.nfree(r0)
        L4c:
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r15
            throw r0
    }

    public static long nobjc_getProtocol(long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_getProtocol
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("Protocol *")
    public static long objc_getProtocol(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r3
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            long r0 = nobjc_getProtocol(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("Protocol *")
    public static long objc_getProtocol(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = r4
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L23
            r0 = r5
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L23
            r7 = r0
            r0 = r7
            long r0 = nobjc_getProtocol(r0)     // Catch: java.lang.Throwable -> L23
            r9 = r0
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r9
            return r0
        L23:
            r11 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static long nobjc_copyProtocolList(long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_copyProtocolList
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("Protocol **")
    public static org.lwjgl.PointerBuffer objc_copyProtocolList() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)
            r7 = r0
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)     // Catch: java.lang.Throwable -> L2a
            long r0 = nobjc_copyProtocolList(r0)     // Catch: java.lang.Throwable -> L2a
            r8 = r0
            r0 = r8
            r1 = r7
            r2 = 0
            int r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L2a
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBufferSafe(r0, r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r11 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean protocol_conformsToProtocol(@org.lwjgl.system.NativeType("Protocol *") long r7, @org.lwjgl.system.NativeType("Protocol *") long r9) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.protocol_conformsToProtocol
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r7
            r1 = r9
            r2 = r11
            boolean r0 = org.lwjgl.system.JNI.invokePPZ(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean protocol_isEqual(@org.lwjgl.system.NativeType("Protocol *") long r7, @org.lwjgl.system.NativeType("Protocol *") long r9) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.protocol_isEqual
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r7
            r1 = r9
            r2 = r11
            boolean r0 = org.lwjgl.system.JNI.invokePPZ(r0, r1, r2)
            return r0
    }

    public static long nprotocol_getName(long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.protocol_getName
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String protocol_getName(@org.lwjgl.system.NativeType("Protocol *") long r3) {
            r0 = r3
            long r0 = nprotocol_getName(r0)
            r5 = r0
            r0 = r5
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    public static native void nprotocol_getMethodDescription(long r0, long r2, boolean r4, boolean r5, long r6, long r8);

    public static void nprotocol_getMethodDescription(long r11, long r13, boolean r15, boolean r16, long r17) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.protocol_getMethodDescription
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r11
            r1 = r13
            r2 = r15
            r3 = r16
            r4 = r19
            r5 = r17
            nprotocol_getMethodDescription(r0, r1, r2, r3, r4, r5)
            return
    }

    @org.lwjgl.system.NativeType("struct objc_method_description")
    public static org.lwjgl.system.macosx.ObjCMethodDescription protocol_getMethodDescription(@org.lwjgl.system.NativeType("Protocol *") long r9, @org.lwjgl.system.NativeType("SEL") long r11, @org.lwjgl.system.NativeType("BOOL") boolean r13, @org.lwjgl.system.NativeType("BOOL") boolean r14, @org.lwjgl.system.NativeType("struct objc_method_description") org.lwjgl.system.macosx.ObjCMethodDescription r15) {
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r14
            r4 = r15
            long r4 = r4.address()
            nprotocol_getMethodDescription(r0, r1, r2, r3, r4)
            r0 = r15
            return r0
    }

    public static long nprotocol_copyMethodDescriptionList(long r9, boolean r11, boolean r12, long r13) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.protocol_copyMethodDescriptionList
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r15
            long r0 = org.lwjgl.system.JNI.invokePPP(r0, r1, r2, r3, r4)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("struct objc_method_description *")
    public static org.lwjgl.system.macosx.ObjCMethodDescription.Buffer protocol_copyMethodDescriptionList(@org.lwjgl.system.NativeType("Protocol *") long r7, @org.lwjgl.system.NativeType("BOOL") boolean r9, @org.lwjgl.system.NativeType("BOOL") boolean r10) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r11 = r0
            r0 = r11
            int r0 = r0.getPointer()
            r12 = r0
            r0 = r11
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)
            r13 = r0
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L38
            long r0 = nprotocol_copyMethodDescriptionList(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L38
            r14 = r0
            r0 = r14
            r1 = r13
            r2 = 0
            int r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L38
            org.lwjgl.system.macosx.ObjCMethodDescription$Buffer r0 = org.lwjgl.system.macosx.ObjCMethodDescription.createSafe(r0, r1)     // Catch: java.lang.Throwable -> L38
            r16 = r0
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r16
            return r0
        L38:
            r17 = move-exception
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r17
            throw r0
    }

    public static long nprotocol_getProperty(long r9, long r11, boolean r13, boolean r14) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.protocol_getProperty
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r14
            r4 = r15
            long r0 = org.lwjgl.system.JNI.invokePPP(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("objc_property_t")
    public static long protocol_getProperty(@org.lwjgl.system.NativeType("Protocol *") long r7, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r9, @org.lwjgl.system.NativeType("BOOL") boolean r10, @org.lwjgl.system.NativeType("BOOL") boolean r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r9
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r7
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r10
            r3 = r11
            long r0 = nprotocol_getProperty(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("objc_property_t")
    public static long protocol_getProperty(@org.lwjgl.system.NativeType("Protocol *") long r7, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r9, @org.lwjgl.system.NativeType("BOOL") boolean r10, @org.lwjgl.system.NativeType("BOOL") boolean r11) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r12 = r0
            r0 = r12
            int r0 = r0.getPointer()
            r13 = r0
            r0 = r12
            r1 = r9
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L30
            r0 = r12
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L30
            r14 = r0
            r0 = r7
            r1 = r14
            r2 = r10
            r3 = r11
            long r0 = nprotocol_getProperty(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L30
            r16 = r0
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            r0 = r16
            return r0
        L30:
            r18 = move-exception
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            r0 = r18
            throw r0
    }

    public static long nprotocol_copyPropertyList(long r7, long r9) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.protocol_copyPropertyList
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.invokePPP(r0, r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("objc_property_t *")
    public static org.lwjgl.PointerBuffer protocol_copyPropertyList(@org.lwjgl.system.NativeType("Protocol *") long r5) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)
            r9 = r0
            r0 = r5
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L30
            long r0 = nprotocol_copyPropertyList(r0, r1)     // Catch: java.lang.Throwable -> L30
            r10 = r0
            r0 = r10
            r1 = r9
            r2 = 0
            int r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L30
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBufferSafe(r0, r1)     // Catch: java.lang.Throwable -> L30
            r12 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r12
            return r0
        L30:
            r13 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static long nprotocol_copyProtocolList(long r7, long r9) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.protocol_copyProtocolList
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.invokePPP(r0, r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("Protocol **")
    public static org.lwjgl.PointerBuffer protocol_copyProtocolList(@org.lwjgl.system.NativeType("Protocol *") long r5) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)
            r9 = r0
            r0 = r5
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L30
            long r0 = nprotocol_copyProtocolList(r0, r1)     // Catch: java.lang.Throwable -> L30
            r10 = r0
            r0 = r10
            r1 = r9
            r2 = 0
            int r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L30
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBufferSafe(r0, r1)     // Catch: java.lang.Throwable -> L30
            r12 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r12
            return r0
        L30:
            r13 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static long nobjc_allocateProtocol(long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_allocateProtocol
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("Protocol *")
    public static long objc_allocateProtocol(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r3
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            long r0 = nobjc_allocateProtocol(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("Protocol *")
    public static long objc_allocateProtocol(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = r4
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L23
            r0 = r5
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L23
            r7 = r0
            r0 = r7
            long r0 = nobjc_allocateProtocol(r0)     // Catch: java.lang.Throwable -> L23
            r9 = r0
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r9
            return r0
        L23:
            r11 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static void objc_registerProtocol(@org.lwjgl.system.NativeType("Protocol *") long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_registerProtocol
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    public static void nprotocol_addMethodDescription(long r11, long r13, long r15, boolean r17, boolean r18) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.protocol_addMethodDescription
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r11
            r1 = r13
            r2 = r15
            r3 = r17
            r4 = r18
            r5 = r19
            org.lwjgl.system.JNI.invokePPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void protocol_addMethodDescription(@org.lwjgl.system.NativeType("Protocol *") long r9, @org.lwjgl.system.NativeType("SEL") long r11, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r13, @org.lwjgl.system.NativeType("BOOL") boolean r14, @org.lwjgl.system.NativeType("BOOL") boolean r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r13
            org.lwjgl.system.Checks.checkNT1(r0)
        Lb:
            r0 = r9
            r1 = r11
            r2 = r13
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r14
            r4 = r15
            nprotocol_addMethodDescription(r0, r1, r2, r3, r4)
            return
    }

    public static void protocol_addMethodDescription(@org.lwjgl.system.NativeType("Protocol *") long r9, @org.lwjgl.system.NativeType("SEL") long r11, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r13, @org.lwjgl.system.NativeType("BOOL") boolean r14, @org.lwjgl.system.NativeType("BOOL") boolean r15) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r16 = r0
            r0 = r16
            int r0 = r0.getPointer()
            r17 = r0
            r0 = r16
            r1 = r13
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L31
            r0 = r16
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L31
            r18 = r0
            r0 = r9
            r1 = r11
            r2 = r18
            r3 = r14
            r4 = r15
            nprotocol_addMethodDescription(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L31
            r0 = r16
            r1 = r17
            r0.setPointer(r1)
            goto L3d
        L31:
            r20 = move-exception
            r0 = r16
            r1 = r17
            r0.setPointer(r1)
            r0 = r20
            throw r0
        L3d:
            return
    }

    public static void protocol_addProtocol(@org.lwjgl.system.NativeType("Protocol *") long r7, @org.lwjgl.system.NativeType("Protocol *") long r9) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.protocol_addProtocol
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r7
            r1 = r9
            r2 = r11
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2)
            return
    }

    public static void nprotocol_addProperty(long r12, long r14, long r16, int r18, boolean r19, boolean r20) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.protocol_addProperty
            r21 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1f
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r16
            r1 = r18
            int r2 = org.lwjgl.system.macosx.ObjCPropertyAttribute.SIZEOF
            void r3 = org.lwjgl.system.macosx.ObjCPropertyAttribute::validate
            org.lwjgl.system.Struct.validate(r0, r1, r2, r3)
        L1f:
            r0 = r12
            r1 = r14
            r2 = r16
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            org.lwjgl.system.JNI.invokePPPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void protocol_addProperty(@org.lwjgl.system.NativeType("Protocol *") long r10, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r12, @org.lwjgl.system.NativeType("objc_property_attribute_t const *") org.lwjgl.system.macosx.ObjCPropertyAttribute.Buffer r13, @org.lwjgl.system.NativeType("BOOL") boolean r14, @org.lwjgl.system.NativeType("BOOL") boolean r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r12
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r10
            r1 = r12
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r13
            long r2 = r2.address()
            r3 = r13
            int r3 = r3.remaining()
            r4 = r14
            r5 = r15
            nprotocol_addProperty(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void protocol_addProperty(@org.lwjgl.system.NativeType("Protocol *") long r10, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r12, @org.lwjgl.system.NativeType("objc_property_attribute_t const *") org.lwjgl.system.macosx.ObjCPropertyAttribute.Buffer r13, @org.lwjgl.system.NativeType("BOOL") boolean r14, @org.lwjgl.system.NativeType("BOOL") boolean r15) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r16 = r0
            r0 = r16
            int r0 = r0.getPointer()
            r17 = r0
            r0 = r16
            r1 = r12
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L37
            r0 = r16
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L37
            r18 = r0
            r0 = r10
            r1 = r18
            r2 = r13
            long r2 = r2.address()     // Catch: java.lang.Throwable -> L37
            r3 = r13
            int r3 = r3.remaining()     // Catch: java.lang.Throwable -> L37
            r4 = r14
            r5 = r15
            nprotocol_addProperty(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L37
            r0 = r16
            r1 = r17
            r0.setPointer(r1)
            goto L43
        L37:
            r20 = move-exception
            r0 = r16
            r1 = r17
            r0.setPointer(r1)
            r0 = r20
            throw r0
        L43:
            return
    }

    public static long nobjc_copyImageNames(long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_copyImageNames
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const **")
    public static org.lwjgl.PointerBuffer objc_copyImageNames() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)
            r7 = r0
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)     // Catch: java.lang.Throwable -> L2a
            long r0 = nobjc_copyImageNames(r0)     // Catch: java.lang.Throwable -> L2a
            r8 = r0
            r0 = r8
            r1 = r7
            r2 = 0
            int r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L2a
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBufferSafe(r0, r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r11 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static long nclass_getImageName(long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.class_getImageName
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String class_getImageName(@org.lwjgl.system.NativeType("Class") long r3) {
            r0 = r3
            long r0 = nclass_getImageName(r0)
            r5 = r0
            r0 = r5
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    public static long nobjc_copyClassNamesForImage(long r7, long r9) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_copyClassNamesForImage
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.invokePPP(r0, r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const **")
    public static org.lwjgl.PointerBuffer objc_copyClassNamesForImage(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r5
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r6 = r0
            r0 = r6
            int r0 = r0.getPointer()
            r7 = r0
            r0 = r6
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)
            r8 = r0
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)     // Catch: java.lang.Throwable -> L3a
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L3a
            long r0 = nobjc_copyClassNamesForImage(r0, r1)     // Catch: java.lang.Throwable -> L3a
            r9 = r0
            r0 = r9
            r1 = r8
            r2 = 0
            int r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L3a
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBufferSafe(r0, r1)     // Catch: java.lang.Throwable -> L3a
            r11 = r0
            r0 = r6
            r1 = r7
            r0.setPointer(r1)
            r0 = r11
            return r0
        L3a:
            r12 = move-exception
            r0 = r6
            r1 = r7
            r0.setPointer(r1)
            r0 = r12
            throw r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const **")
    public static org.lwjgl.PointerBuffer objc_copyClassNamesForImage(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r5) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r6 = r0
            r0 = r6
            int r0 = r0.getPointer()
            r7 = r0
            r0 = r6
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L3b
            r8 = r0
            r0 = r6
            r1 = r5
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L3b
            r0 = r6
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L3b
            r9 = r0
            r0 = r9
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L3b
            long r0 = nobjc_copyClassNamesForImage(r0, r1)     // Catch: java.lang.Throwable -> L3b
            r11 = r0
            r0 = r11
            r1 = r8
            r2 = 0
            int r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L3b
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBufferSafe(r0, r1)     // Catch: java.lang.Throwable -> L3b
            r13 = r0
            r0 = r6
            r1 = r7
            r0.setPointer(r1)
            r0 = r13
            return r0
        L3b:
            r14 = move-exception
            r0 = r6
            r1 = r7
            r0.setPointer(r1)
            r0 = r14
            throw r0
    }

    public static long nsel_getName(long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.sel_getName
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String sel_getName(@org.lwjgl.system.NativeType("SEL") long r3) {
            r0 = r3
            long r0 = nsel_getName(r0)
            r5 = r0
            r0 = r5
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    public static long nsel_getUid(long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.sel_getUid
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("SEL")
    public static long sel_getUid(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r3
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            long r0 = nsel_getUid(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("SEL")
    public static long sel_getUid(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = r4
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L23
            r0 = r5
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L23
            r7 = r0
            r0 = r7
            long r0 = nsel_getUid(r0)     // Catch: java.lang.Throwable -> L23
            r9 = r0
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r9
            return r0
        L23:
            r11 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static long nsel_registerName(long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.sel_registerName
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("SEL")
    public static long sel_registerName(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r3
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            long r0 = nsel_registerName(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("SEL")
    public static long sel_registerName(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = r4
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L23
            r0 = r5
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L23
            r7 = r0
            r0 = r7
            long r0 = nsel_registerName(r0)     // Catch: java.lang.Throwable -> L23
            r9 = r0
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r9
            return r0
        L23:
            r11 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean sel_isEqual(@org.lwjgl.system.NativeType("SEL") long r7, @org.lwjgl.system.NativeType("SEL") long r9) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.sel_isEqual
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r7
            r1 = r9
            r2 = r11
            boolean r0 = org.lwjgl.system.JNI.invokePPZ(r0, r1, r2)
            return r0
    }

    public static void objc_enumerationMutation(@org.lwjgl.system.NativeType("id") long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_enumerationMutation
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    public static void nobjc_setEnumerationMutationHandler(long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_setEnumerationMutationHandler
            r7 = r0
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    public static void objc_setEnumerationMutationHandler(@org.lwjgl.system.NativeType("EnumerationMutationHandler") org.lwjgl.system.macosx.EnumerationMutationHandlerI r3) {
            r0 = r3
            long r0 = r0.address()
            nobjc_setEnumerationMutationHandler(r0)
            return
    }

    @org.lwjgl.system.NativeType("IMP")
    public static long imp_implementationWithBlock(@org.lwjgl.system.NativeType("id") long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.imp_implementationWithBlock
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("id")
    public static long imp_getBlock(@org.lwjgl.system.NativeType("IMP") long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.imp_getBlock
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean imp_removeBlock(@org.lwjgl.system.NativeType("IMP") long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.imp_removeBlock
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            boolean r0 = org.lwjgl.system.JNI.invokePZ(r0, r1)
            return r0
    }

    public static long nobjc_loadWeak(long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_loadWeak
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("id")
    public static long objc_loadWeak(@javax.annotation.Nullable @org.lwjgl.system.NativeType("id *") org.lwjgl.PointerBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            long r0 = nobjc_loadWeak(r0)
            return r0
    }

    public static long nobjc_storeWeak(long r7, long r9) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_storeWeak
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.invokePPP(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("id")
    public static long objc_storeWeak(@org.lwjgl.system.NativeType("id *") org.lwjgl.PointerBuffer r5, @org.lwjgl.system.NativeType("id") long r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r6
            long r0 = nobjc_storeWeak(r0, r1)
            return r0
    }

    public static void objc_setAssociatedObject(@org.lwjgl.system.NativeType("id") long r11, @org.lwjgl.system.NativeType("void const *") long r13, @org.lwjgl.system.NativeType("id") long r15, @org.lwjgl.system.NativeType("objc_AssociationPolicy") long r17) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_setAssociatedObject
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
        L1b:
            r0 = r11
            r1 = r13
            r2 = r15
            r3 = r17
            r4 = r19
            org.lwjgl.system.JNI.invokePPPPV(r0, r1, r2, r3, r4)
            return
    }

    @org.lwjgl.system.NativeType("id")
    public static long objc_getAssociatedObject(@org.lwjgl.system.NativeType("id") long r7, @org.lwjgl.system.NativeType("void const *") long r9) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_getAssociatedObject
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.invokePPP(r0, r1, r2)
            return r0
    }

    public static void objc_removeAssociatedObjects(@org.lwjgl.system.NativeType("id") long r5) {
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.Functions.objc_removeAssociatedObjects
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    static /* synthetic */ org.lwjgl.system.SharedLibrary access$000() {
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.OBJC
            return r0
    }

    static {
            java.lang.Class<org.lwjgl.system.macosx.ObjCRuntime> r0 = org.lwjgl.system.macosx.ObjCRuntime.class
            java.lang.String r1 = "org.lwjgl"
            java.lang.String r2 = "objc"
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.Library.loadNative(r0, r1, r2)
            org.lwjgl.system.macosx.ObjCRuntime.OBJC = r0
            return
    }
}
