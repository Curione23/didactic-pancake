package com.google.android.material.internal;

import com.google.android.material.internal.MaterialCheckable;

/* JADX INFO: loaded from: classes.dex */
public interface MaterialCheckable<T extends com.google.android.material.internal.MaterialCheckable<T>> extends android.widget.Checkable {

    public interface OnCheckedChangeListener<C> {
        void onCheckedChanged(C r1, boolean r2);
    }

    int getId();

    void setInternalOnCheckedChangeListener(com.google.android.material.internal.MaterialCheckable.OnCheckedChangeListener<T> r1);
}
