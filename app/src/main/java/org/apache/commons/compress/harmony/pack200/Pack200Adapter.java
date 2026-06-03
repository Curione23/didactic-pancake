package org.apache.commons.compress.harmony.pack200;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Pack200Adapter {
    protected static final int DEFAULT_BUFFER_SIZE = 8192;
    private final java.util.SortedMap<java.lang.String, java.lang.String> properties;
    private final java.beans.PropertyChangeSupport support;

    public Pack200Adapter() {
            r1 = this;
            r1.<init>()
            java.beans.PropertyChangeSupport r0 = new java.beans.PropertyChangeSupport
            r0.<init>(r1)
            r1.support = r0
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            r1.properties = r0
            return
    }

    public void addPropertyChangeListener(java.beans.PropertyChangeListener r2) {
            r1 = this;
            java.beans.PropertyChangeSupport r0 = r1.support
            r0.addPropertyChangeListener(r2)
            return
    }

    protected void completed(double r3) throws java.io.IOException {
            r2 = this;
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r3 = r3 * r0
            int r3 = (int) r3
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "pack.progress"
            r0 = 0
            r2.firePropertyChange(r4, r0, r3)
            return
    }

    protected void firePropertyChange(java.lang.String r2, java.lang.Object r3, java.lang.Object r4) throws java.io.IOException {
            r1 = this;
            java.beans.PropertyChangeSupport r0 = r1.support
            r0.firePropertyChange(r2, r3, r4)
            return
    }

    public java.util.SortedMap<java.lang.String, java.lang.String> properties() {
            r1 = this;
            java.util.SortedMap<java.lang.String, java.lang.String> r0 = r1.properties
            return r0
    }

    public void removePropertyChangeListener(java.beans.PropertyChangeListener r2) {
            r1 = this;
            java.beans.PropertyChangeSupport r0 = r1.support
            r0.removePropertyChangeListener(r2)
            return
    }
}
