package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.Display
 *  org.lwjgl.opengl.Drawable
 *  org.lwjgl.opengl.Pbuffer
 *  org.lwjgl.opengl.PixelFormat
 */
import java.util.List;

import optifine.Config;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.Drawable;
import org.lwjgl.opengl.Pbuffer;
import org.lwjgl.opengl.PixelFormat;

public class class_1154
implements class_0119 {
    private class_1595 lllIIIllIIIIlllIlIIllIIll = null;
    private float lllIlIIlIIIlIlIIIllIlllIl = 10.0f;
    private long IlIllllllIIlIIllllIIlIIIl = 0L;
    private boolean lIlllIlllIIIIlIIlllIllIII = true;
    private int IlIIIIIllllllIIlllIllllll = 0;

    @Override
    public void IIIllIIlIIIIIIlIlIIllIIlI() {
        if (this.lllIIIllIIIIlllIlIIllIIll != null) {
            this.lllIIIllIIIIlllIlIIllIIll.IIIllIllIIlIlIlIlIllllIIl();
            this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll();
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll() {
    }

    private void IllIIIllIIIIlIlIlIllIIlll() {
        if (this.lllIIIllIIIIlllIlIIllIIll == null) {
            this.lllIIIllIIIIlllIlIIllIIll(Display.getDrawable());
        }
    }

    @Override
    public class_0734 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, List list, int n, int n2, int n3, int n4) {
        return new class_1703(class_13342, list, n, n2, n3, n4);
    }

    public class_1595 lllIIIllIIIIlllIlIIllIIll(Drawable drawable) {
        if (this.lllIIIllIIIIlllIlIIllIIll != null) {
            throw new IllegalStateException("UpdateThread is already existing");
        }
        try {
            Pbuffer pbuffer = new Pbuffer(1, 1, new PixelFormat(), drawable);
            this.lllIIIllIIIIlllIlIIllIIll = new class_1595(pbuffer);
            this.lllIIIllIIIIlllIlIIllIIll.setPriority(1);
            this.lllIIIllIIIIlllIlIIllIIll.start();
            this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl();
            return this.lllIIIllIIIIlllIlIIllIIll;
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public boolean IllIIlllllllIIlIIlIIIIlIl() {
        return Thread.currentThread() == this.lllIIIllIIIIlllIlIIllIIll;
    }

    public static boolean IIIllIllIIlIlIlIlIllllIIl() {
        return true;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1114 class_11142, class_1965 class_19652) {
        this.IlIIIIIllllllIIlllIllllll = 0;
        if (this.lllIIIllIIIIlllIlIIllIIll != null) {
            if (this.IlIllllllIIlIIllllIIlIIIl == 0L) {
                this.IlIllllllIIlIIllllIIlIIIl = System.nanoTime();
            }
            if (this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll()) {
                this.IlIIIIIllllllIIlllIllllll = Config.lIlIllIIlIIlIIlIIlIIlIIll();
                if (Config.llIIlIllIllllIlIIIIlIIlll() && !class_11142.lllIIIllIIIIlllIlIIllIIll(class_19652)) {
                    this.IlIIIIIllllllIIlllIllllll *= 3;
                }
                this.IlIIIIIllllllIIlllIllllll = Math.min(this.IlIIIIIllllllIIlllIllllll, this.lllIIIllIIIIlllIlIIllIIll.IIIllIIlIIIIIIlIlIIllIIlI());
                if (this.IlIIIIIllllllIIlllIllllll > 0) {
                    this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII();
                }
            }
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl() {
        if (this.lllIIIllIIIIlllIlIIllIIll != null) {
            float f = 0.0f;
            if (this.IlIIIIIllllllIIlllIllllll > 0) {
                long l = System.nanoTime() - this.IlIllllllIIlIIllllIIlIIIl;
                float f2 = this.lllIlIIlIIIlIlIIIllIlllIl * (1.0f + (float)(this.IlIIIIIllllllIIlllIllllll - 1) / 2.0f);
                if (f2 > 0.0f) {
                    int n = (int)f2;
                    Config.lllIIIllIIIIlllIlIIllIIll((long)n);
                }
                this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl();
            }
            float f3 = 0.2f;
            if (this.IlIIIIIllllllIIlllIllllll > 0) {
                int n = this.lllIIIllIIIIlllIlIIllIIll.IllIIlllllllIIlIIlIIIIlIl();
                if (n < this.IlIIIIIllllllIIlllIllllll) {
                    this.lllIlIIlIIIlIlIIIllIlllIl += f3;
                }
                if (n > this.IlIIIIIllllllIIlllIllllll) {
                    this.lllIlIIlIIIlIlIIIllIlllIl -= f3;
                }
                if (n == this.IlIIIIIllllllIIlllIllllll) {
                    this.lllIlIIlIIIlIlIIIllIlllIl -= f3;
                }
            } else {
                this.lllIlIIlIIIlIlIIIllIlllIl -= f3 / 5.0f;
            }
            if (this.lllIlIIlIIIlIlIIIllIlllIl < 0.0f) {
                this.lllIlIIlIIIlIlIIIllIlllIl = 0.0f;
            }
            this.IlIllllllIIlIIllllIIlIIIl = System.nanoTime();
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1114 class_11142, class_1965 class_19652, boolean bl) {
        int n;
        float f;
        int n2;
        this.IllIIIllIIIIlIlIlIllIIlll();
        if (class_11142.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII() <= 0) {
            return true;
        }
        int n3 = 0;
        int n4 = 4;
        int n5 = 0;
        class_0734 class_07342 = null;
        float f2 = Float.MAX_VALUE;
        int n6 = -1;
        for (n2 = 0; n2 < class_11142.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII(); ++n2) {
            class_0734 class_07343 = (class_0734)class_11142.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(n2);
            if (class_07343 == null) continue;
            ++n5;
            if (class_07343.IIllIllIIllIIlllIIIlIlllI) continue;
            if (!class_07343.lIlIlIIlIIIIlIIIIIlllIIII) {
                class_11142.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(n2, null);
                continue;
            }
            f = class_07343.lllIIIllIIIIlllIlIIllIIll((class_1521)class_19652);
            if (f < 512.0f) {
                if (f < 256.0f && class_11142.IllIIIllIIIIlIlIlIllIIlll() && class_07343.IlIlllIIIIIIlIIllIIllIlll || this.lIlllIlllIIIIlIIlllIllIII) {
                    if (this.lllIIIllIIIIlllIlIIllIIll != null) {
                        this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll();
                    }
                    class_07343.lllIIIllIIIIlllIlIIllIIll(class_19652);
                    class_07343.lIlIlIIlIIIIlIIIIIlllIIII = false;
                    class_11142.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(n2, null);
                    ++n3;
                    continue;
                }
                if (this.lllIIIllIIIIlllIlIIllIIll != null) {
                    this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_07343, true);
                    class_07343.lIlIlIIlIIIIlIIIIIlllIIII = false;
                    class_11142.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(n2, null);
                    ++n3;
                    continue;
                }
            }
            if (!class_07343.IlIlllIIIIIIlIIllIIllIlll) {
                f *= (float)n4;
            }
            if (class_07342 == null) {
                class_07342 = class_07343;
                f2 = f;
                n6 = n2;
                continue;
            }
            if (!(f < f2)) continue;
            class_07342 = class_07343;
            f2 = f;
            n6 = n2;
        }
        n2 = Config.lIlIllIIlIIlIIlIIlIIlIIll();
        boolean bl2 = false;
        if (Config.llIIlIllIllllIlIIIIlIIlll() && !class_11142.lllIIIllIIIIlllIlIIllIIll(class_19652)) {
            n2 *= 3;
            bl2 = true;
        }
        if (this.lllIIIllIIIIlllIlIIllIIll != null && (n2 = this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl()) <= 0) {
            return true;
        }
        if (class_07342 != null) {
            this.lllIIIllIIIIlllIlIIllIIll(class_07342, class_19652);
            class_11142.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(n6, null);
            ++n3;
            f = f2 / 5.0f;
            for (n = 0; n < class_11142.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII() && n3 < n2; ++n) {
                float f3;
                class_0734 class_07344 = (class_0734)class_11142.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(n);
                if (class_07344 == null || class_07344.IIllIllIIllIIlllIIIlIlllI) continue;
                float f4 = class_07344.lllIIIllIIIIlllIlIIllIIll((class_1521)class_19652);
                if (!class_07344.IlIlllIIIIIIlIIllIIllIlll) {
                    f4 *= (float)n4;
                }
                if (!((f3 = Math.abs(f4 - f2)) < f)) continue;
                this.lllIIIllIIIIlllIlIIllIIll(class_07344, class_19652);
                class_11142.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(n, null);
                ++n3;
            }
        }
        if (n5 == 0) {
            class_11142.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll();
        }
        if (class_11142.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII() > 100 && n5 < class_11142.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII() * 4 / 5) {
            int n7 = 0;
            for (n = 0; n < class_11142.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII(); ++n) {
                Object object = class_11142.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(n);
                if (object == null) continue;
                if (n != n7) {
                    class_11142.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(n7, object);
                }
                ++n7;
            }
            for (n = class_11142.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII() - 1; n >= n7; --n) {
                class_11142.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(n);
            }
        }
        this.lIlllIlllIIIIlIIlllIllIII = false;
        return true;
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_0734 class_07342, class_1965 class_19652) {
        class_1595 class_15952 = this.lllIIIllIIIIlllIlIIllIIll;
        if (class_15952 != null) {
            class_15952.lllIIIllIIIIlllIlIIllIIll(class_07342, false);
            class_07342.lIlIlIIlIIIIlIIIIIlllIIII = false;
        } else {
            class_07342.lllIIIllIIIIlllIlIIllIIll(class_19652);
            class_07342.lIlIlIIlIIIIlIIIIIlllIIII = false;
            class_07342.IIllIllIIllIIlllIIIlIlllI = false;
        }
    }

    @Override
    public void IlIIIIIllllllIIlllIllllll() {
        if (this.lllIIIllIIIIlllIlIIllIIll != null) {
            this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll();
        }
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        if (this.lllIIIllIIIIlllIlIIllIIll != null) {
            this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII();
        }
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII() {
        if (this.lllIIIllIIIIlllIlIIllIIll != null) {
            this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl();
        }
    }

    @Override
    public void lIllllIIlIIIlIllllllIIIll() {
        if (this.lllIIIllIIIIlllIlIIllIIll != null) {
            this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll();
        }
        this.lIlllIlllIIIIlIIlllIllIII = true;
    }
}

