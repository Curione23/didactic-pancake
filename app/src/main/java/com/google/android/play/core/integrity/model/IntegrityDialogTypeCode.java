package com.google.android.play.core.integrity.model;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE, java.lang.annotation.ElementType.PARAMETER})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
public @interface IntegrityDialogTypeCode {
    public static final int CLOSE_ALL_ACCESS_RISK = 3;
    public static final int CLOSE_UNKNOWN_ACCESS_RISK = 2;
    public static final int GET_INTEGRITY = 4;
    public static final int GET_LICENSED = 1;
    public static final int GET_STRONG_INTEGRITY = 5;
}
