package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.Pbuffer
 */
import java.util.LinkedList;
import java.util.List;

import optifine.Config;
import org.lwjgl.opengl.Pbuffer;

public class class_1595
extends Thread {
    private Pbuffer lllIIIllIIIIlllIlIIllIIll = null;
    private Object lllIlIIlIIIlIlIIIllIlllIl = new Object();
    private List IlIllllllIIlIIllllIIlIIIl = new LinkedList();
    private List lIlllIlllIIIIlIIlllIllIII = new LinkedList();
    private int IlIIIIIllllllIIlllIllllll = 0;
    private class_0868 lIllllIIlIIIlIllllllIIIll = class_0868.IlIIIIIllllllIIlllIllllll;
    private class_0868 IIIllIIlIIIIIIlIlIIllIIlI = new class_0868(0x200000);
    private boolean IllIIlllllllIIlIIlIIIIlIl = false;
    private class_1703 IIIllIllIIlIlIlIlIllllIIl = null;
    private boolean IllIIIllIIIIlIlIlIllIIlll = false;
    private boolean lIIIIlIlIIlllllIIllIIlIII = false;
    private boolean llIIlllIllIllllIIIlIIIIII = false;
    private static final int llIIllIllIlIIlIIllIllllll = 10;

    public class_1595(Pbuffer pbuffer) {
        super("WrUpdateThread");
        this.lllIIIllIIIIlllIlIIllIIll = pbuffer;
    }

    @Override
    public void run() {
        try {
            this.lllIIIllIIIIlllIlIIllIIll.makeCurrent();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        class_2045 class_20452 = new class_2045(this, null);
        while (!Thread.interrupted() && !this.llIIlllIllIllllIIIlIIIIII) {
            try {
                class_1703 class_17032 = this.IllIIIllIIIIlIlIlIllIIlll();
                if (class_17032 == null) {
                    return;
                }
                this.lllIIIllIIIIlllIlIIllIIll((class_1456)null);
                try {
                    this.IIIllIllIIlIlIlIlIllllIIl = class_17032;
                    class_0868.IlIIIIIllllllIIlllIllllll = this.IIIllIIlIIIIIIlIlIIllIIlI;
                    class_17032.lllIIIllIIIIlllIlIIllIIll(class_20452);
                }
                finally {
                    class_0868.IlIIIIIllllllIIlllIllllll = this.lIllllIIlIIIlIllllllIIIll;
                }
                this.lllIIIllIIIIlllIlIIllIIll(class_17032);
            }
            catch (Exception exception) {
                exception.printStackTrace();
                if (this.IIIllIllIIlIlIlIlIllllIIl != null) {
                    this.IIIllIllIIlIlIlIlIllllIIl.IIllIllIIllIIlllIIIlIlllI = false;
                    this.IIIllIllIIlIlIlIlIllllIIl.lIlIlIIlIIIIlIIIIIlllIIII = true;
                }
                this.IIIllIllIIlIlIlIlIllllIIl = null;
                this.IllIIlllllllIIlIIlIIIIlIl = false;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void lllIIIllIIIIlllIlIIllIIll(class_0734 class_07342, boolean bl) {
        Object object = this.lllIlIIlIIIlIlIIIllIlllIl;
        Object object2 = this.lllIlIIlIIIlIlIIIllIlllIl;
        synchronized (object2) {
            if (class_07342.IIllIllIIllIIlllIIIlIlllI) {
                throw new IllegalArgumentException("Renderer already updating");
            }
            if (bl) {
                this.IlIllllllIIlIIllllIIlIIIl.add(0, class_07342);
            } else {
                this.IlIllllllIIlIIllllIIlIIIl.add(class_07342);
            }
            class_07342.IIllIllIIllIIlllIIIlIlllI = true;
            this.lllIlIIlIIIlIlIIIllIlllIl.notifyAll();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private class_1703 IllIIIllIIIIlIlIlIllIIlll() {
        Object object = this.lllIlIIlIIIlIlIIIllIlllIl;
        Object object2 = this.lllIlIIlIIIlIlIIIllIlllIl;
        synchronized (object2) {
            while (this.IlIllllllIIlIIllllIIlIIIl.size() <= 0) {
                try {
                    this.lllIlIIlIIIlIlIIIllIlllIl.wait(2000L);
                    if (!this.llIIlllIllIllllIIIlIIIIII) continue;
                    Object var3_4 = null;
                    return var3_4;
                }
                catch (InterruptedException interruptedException) {
                }
            }
            class_1703 class_17032 = (class_1703)this.IlIllllllIIlIIllllIIlIIIl.remove(0);
            this.lllIlIIlIIIlIlIIIllIlllIl.notifyAll();
            return class_17032;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean lllIIIllIIIIlllIlIIllIIll() {
        Object object = this.lllIlIIlIIIlIlIIIllIlllIl;
        Object object2 = this.lllIlIIlIIIlIlIIIllIlllIl;
        synchronized (object2) {
            return this.IlIllllllIIlIIllllIIlIIIl.size() > 0 ? true : (this.IIIllIllIIlIlIlIlIllllIIl != null ? true : this.IllIIlllllllIIlIIlIIIIlIl);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        Object object = this.lllIlIIlIIIlIlIIIllIlllIl;
        Object object2 = this.lllIlIIlIIIlIlIIIllIlllIl;
        synchronized (object2) {
            return this.IlIllllllIIlIIllllIIlIIIl.size() > 10 ? 0 : 10 - this.IlIllllllIIlIIllllIIlIIIl.size();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void lllIIIllIIIIlllIlIIllIIll(class_0734 class_07342) {
        Object object = this.lllIlIIlIIIlIlIIIllIlllIl;
        Object object2 = this.lllIlIIlIIIlIlIIIllIlllIl;
        synchronized (object2) {
            this.lIlllIlllIIIIlIIlllIllIII.add(class_07342);
            ++this.IlIIIIIllllllIIlllIllllll;
            this.IIIllIllIIlIlIlIlIllllIIl = null;
            this.IllIIlllllllIIlIIlIIIIlIl = false;
            this.lllIlIIlIIIlIlIIIllIlllIl.notifyAll();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void lIIIIlIlIIlllllIIllIIlIII() {
        Object object = this.lllIlIIlIIIlIlIIIllIlllIl;
        Object object2 = this.lllIlIIlIIIlIlIIIllIlllIl;
        synchronized (object2) {
            for (int i = 0; i < this.lIlllIlllIIIIlIIlllIllIII.size(); ++i) {
                class_1703 class_17032 = (class_1703)this.lIlllIlllIIIIlIIlllIllIII.get(i);
                class_17032.IIIllIllIIlIlIlIlIllllIIl();
                class_17032.IIllIllIIllIIlllIIIlIlllI = false;
            }
            this.lIlllIlllIIIIlIIlllIllIII.clear();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void IlIllllllIIlIIllllIIlIIIl() {
        Object object = this.lllIlIIlIIIlIlIIIllIlllIl;
        Object object2 = this.lllIlIIlIIIlIlIIIllIlllIl;
        synchronized (object2) {
            this.IllIIIllIIIIlIlIlIllIIlll = false;
            this.lIIIIlIlIIlllllIIllIIlIII = false;
            this.lllIlIIlIIIlIlIIIllIlllIl.notifyAll();
            while (this.IllIIlllllllIIlIIlIIIIlIl) {
                try {
                    this.lllIlIIlIIIlIlIIIllIlllIl.wait();
                }
                catch (InterruptedException interruptedException) {}
            }
            this.lIIIIlIlIIlllllIIllIIlIII();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void lIlllIlllIIIIlIIlllIllIII() {
        Object object = this.lllIlIIlIIIlIlIIIllIlllIl;
        Object object2 = this.lllIlIIlIIIlIlIIIllIlllIl;
        synchronized (object2) {
            if (this.IllIIlllllllIIlIIlIIIIlIl) {
                Config.lllIlIIlIIIlIlIIIllIlllIl("UpdateThread still working in unpause()!!!");
            }
            this.IllIIIllIIIIlIlIlIllIIlll = true;
            this.lIIIIlIlIIlllllIIllIIlIII = false;
            this.lllIlIIlIIIlIlIIIllIlllIl.notifyAll();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void IlIIIIIllllllIIlllIllllll() {
        Object object = this.lllIlIIlIIIlIlIIIllIlllIl;
        Object object2 = this.lllIlIIlIIIlIlIIIllIlllIl;
        synchronized (object2) {
            if (this.IllIIlllllllIIlIIlIIIIlIl) {
                Config.lllIlIIlIIIlIlIIIllIlllIl("UpdateThread still working in unpause()!!!");
            }
            if (this.IIIllIllIIlIlIlIlIllllIIl != null) {
                while (this.IIIllIllIIlIlIlIlIllllIIl != null) {
                    this.IllIIIllIIIIlIlIlIllIIlll = false;
                    this.lIIIIlIlIIlllllIIllIIlIII = true;
                    this.lllIlIIlIIIlIlIIIllIlllIl.notifyAll();
                    try {
                        this.lllIlIIlIIIlIlIIIllIlllIl.wait();
                    }
                    catch (InterruptedException interruptedException) {}
                }
                this.IlIllllllIIlIIllllIIlIIIl();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void lllIIIllIIIIlllIlIIllIIll(class_1456 class_14562) {
        Thread.yield();
        Object object = this.lllIlIIlIIIlIlIIIllIlllIl;
        Object object2 = this.lllIlIIlIIIlIlIIIllIlllIl;
        synchronized (object2) {
            while (!(this.IllIIIllIIIIlIlIlIllIIlll || this.lIIIIlIlIIlllllIIllIIlIII && this.IIIllIllIIlIlIlIlIllllIIl != null)) {
                if (class_14562 != null) {
                    class_14562.lllIIIllIIIIlllIlIIllIIll();
                }
                this.IllIIlllllllIIlIIlIIIIlIl = false;
                this.lllIlIIlIIIlIlIIIllIlllIl.notifyAll();
                try {
                    this.lllIlIIlIIIlIlIIIllIlllIl.wait();
                }
                catch (InterruptedException interruptedException) {}
            }
            this.IllIIlllllllIIlIIlIIIIlIl = true;
            if (class_14562 != null) {
                class_14562.lllIlIIlIIIlIlIIIllIlllIl();
            }
            this.lllIlIIlIIIlIlIIIllIlllIl.notifyAll();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void lIllllIIlIIIlIllllllIIIll() {
        Object object = this.lllIlIIlIIIlIlIIIllIlllIl;
        Object object2 = this.lllIlIIlIIIlIlIIIllIlllIl;
        synchronized (object2) {
            this.IlIIIIIllllllIIlllIllllll();
            for (int i = 0; i < this.IlIllllllIIlIIllllIIlIIIl.size(); ++i) {
                class_0734 class_07342 = (class_0734)this.IlIllllllIIlIIllllIIlIIIl.get(i);
                class_07342.lIlIlIIlIIIIlIIIIIlllIIII = true;
                class_07342.IIllIllIIllIIlllIIIlIlllI = false;
            }
            this.IlIllllllIIlIIllllIIlIIIl.clear();
            this.lllIlIIlIIIlIlIIIllIlllIl.notifyAll();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int IIIllIIlIIIIIIlIlIIllIIlI() {
        Object object = this.lllIlIIlIIIlIlIIIllIlllIl;
        Object object2 = this.lllIlIIlIIIlIlIIIllIlllIl;
        synchronized (object2) {
            int n = this.IlIllllllIIlIIllllIIlIIIl.size();
            if (this.IIIllIllIIlIlIlIlIllllIIl != null) {
                ++n;
            }
            return n;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int IllIIlllllllIIlIIlIIIIlIl() {
        Object object = this.lllIlIIlIIIlIlIIIllIlllIl;
        Object object2 = this.lllIlIIlIIIlIlIIIllIlllIl;
        synchronized (object2) {
            int n = this.IlIIIIIllllllIIlllIllllll;
            this.IlIIIIIllllllIIlllIllllll = 0;
            return n;
        }
    }

    public void IIIllIllIIlIlIlIlIllllIIl() {
        this.llIIlllIllIllllIIIlIIIIII = true;
    }

    static /* synthetic */ class_0868 lllIIIllIIIIlllIlIIllIIll(class_1595 class_15952) {
        return class_15952.lIllllIIlIIIlIllllllIIIll;
    }

    static /* synthetic */ class_0868 lllIlIIlIIIlIlIIIllIlllIl(class_1595 class_15952) {
        return class_15952.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    static /* synthetic */ void lllIIIllIIIIlllIlIIllIIll(class_1595 class_15952, class_1456 class_14562) {
        class_15952.lllIIIllIIIIlllIlIIllIIll(class_14562);
    }
}

