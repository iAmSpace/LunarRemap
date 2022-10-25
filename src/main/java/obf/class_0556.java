package obf;

/*
 * Decompiled with CFR 0.150.
 */
public abstract class class_0556 {
    protected long lllIIIllIIIIlllIlIIllIIll;
    protected long lllIlIIlIIIlIlIIIllIlllIl;
    protected long IlIllllllIIlIIllllIIlIIIl;
    protected boolean lIlllIlllIIIIlIIlllIllIII = true;
    protected float IlIIIIIllllllIIlllIllllll;
    protected long lIllllIIlIIIlIllllllIIIll;
    protected final float IIIllIIlIIIIIIlIlIIllIIlI;
    private boolean IllIIlllllllIIlIIlIIIIlIl;
    private int IIIllIllIIlIlIlIlIllllIIl = 1;
    private int IllIIIllIIIIlIlIlIllIIlll = 1;
    private long lIIIIlIlIIlllllIIllIIlIII;
    private boolean llIIlllIllIllllIIIlIIIIII;

    public class_0556(long l, float f) {
        this.IlIllllllIIlIIllllIIlIIIl = l;
        this.IIIllIIlIIIIIIlIlIIllIIlI = f;
    }

    protected abstract float lllIIIllIIIIlllIlIIllIIll();

    public void lllIlIIlIIIlIlIIIllIlllIl() {
        this.lllIIIllIIIIlllIlIIllIIll = System.currentTimeMillis();
        this.lIlllIlllIIIIlIIlllIllIII = true;
        this.lIIIIlIlIIlllllIIllIIlIII = 0L;
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f) {
        this.lllIIIllIIIIlllIlIIllIIll = System.currentTimeMillis();
        this.lIIIIlIlIIlllllIIllIIlIII = f == 0.0f ? 0L : (long)((float)this.IlIllllllIIlIIllllIIlIIIl * (1.0f - f));
        this.lIlllIlllIIIIlIIlllIllIII = true;
    }

    public void IlIllllllIIlIIllllIIlIIIl() {
        this.IllIIlllllllIIlIIlIIIIlIl = true;
    }

    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIIIllIIIIlllIlIIllIIll != 0L;
    }

    public boolean IlIIIIIllllllIIlllIllllll() {
        return this.llIIlllIllIllllIIIlIIIIII() <= 0L && this.lIlllIlllIIIIlIIlllIllIII;
    }

    public void lIllllIIlIIIlIllllllIIIll() {
        this.lllIIIllIIIIlllIlIIllIIll = 0L;
        this.IIIllIllIIlIlIlIlIllllIIl = 1;
    }

    public float lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        if (bl && !this.llIIlllIllIllllIIIlIIIIII) {
            this.llIIlllIllIllllIIIlIIIIII = true;
            this.lllIIIllIIIIlllIlIIllIIll(this.IIlllIlIlllIllIIIlllIIlIl());
        } else if (this.llIIlllIllIllllIIIlIIIIII && !bl) {
            this.llIIlllIllIllllIIIlIIIIII = false;
            this.lllIIIllIIIIlllIlIIllIIll(this.IIlllIlIlllIllIIIlllIIlIl());
        }
        if (this.lllIIIllIIIIlllIlIIllIIll == 0L) {
            return 0.0f;
        }
        float f = this.IIlllIlIlllIllIIIlllIIlIl();
        return this.llIIlllIllIllllIIIlIIIIII ? f : 1.0f - f;
    }

    public boolean IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.lllIIIllIIIIlllIlIIllIIll != 0L && this.llIIlllIllIllllIIIlIIIIII() > 0L;
    }

    private float IIlllIlIlllIllIIIlllIIlIl() {
        if (this.lllIIIllIIIIlllIlIIllIIll == 0L) {
            return 0.0f;
        }
        if (this.llIIlllIllIllllIIIlIIIIII() <= 0L) {
            return 1.0f;
        }
        return this.lllIIIllIIIIlllIlIIllIIll();
    }

    public float IllIIlllllllIIlIIlIIIIlIl() {
        if (this.lllIIIllIIIIlllIlIIllIIll == 0L) {
            return 0.0f;
        }
        if (this.IlIIIIIllllllIIlllIllllll()) {
            if (this.IllIIlllllllIIlIIlIIIIlIl || this.IllIIIllIIIIlIlIlIllIIlll >= 1 && this.IIIllIllIIlIlIlIlIllllIIl < this.IllIIIllIIIIlIlIlIllIIlll) {
                this.lllIlIIlIIIlIlIIIllIlllIl();
                ++this.IIIllIllIIlIlIlIlIllllIIl;
            }
            return this.IIIllIIlIIIIIIlIlIIllIIlI;
        }
        if (this.lIlllIlllIIIIlIIlllIllIII) {
            return this.lllIIIllIIIIlllIlIIllIIll();
        }
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public void IIIllIllIIlIlIlIlIllllIIl() {
        this.lIlllIlllIIIIlIIlllIllIII = false;
        this.IlIIIIIllllllIIlllIllllll = this.lllIIIllIIIIlllIlIIllIIll();
        this.lIllllIIlIIIlIllllllIIIll = System.currentTimeMillis() - this.lllIIIllIIIIlllIlIIllIIll;
    }

    public void IllIIIllIIIIlIlIlIllIIlll() {
        this.lllIIIllIIIIlllIlIIllIIll = System.currentTimeMillis() - this.lIllllIIlIIIlIllllllIIIll;
        this.lIlllIlllIIIIlIIlllIllIII = true;
    }

    public long lIIIIlIlIIlllllIIllIIlIII() {
        long l = this.lIlllIlllIIIIlIIlllIllIII ? this.llIIlllIllIllllIIIlIIIIII() : System.currentTimeMillis() - this.lIllllIIlIIIlIllllllIIIll + this.IlIllllllIIlIIllllIIlIIIl - System.currentTimeMillis();
        return Math.min(this.IlIllllllIIlIIllllIIlIIIl, Math.max(0L, l));
    }

    protected long llIIlllIllIllllIIIlIIIIII() {
        return this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl - this.lIIIIlIlIIlllllIIllIIlIII - System.currentTimeMillis();
    }

    public long llIIllIllIlIIlIIllIllllll() {
        return this.IlIllllllIIlIIllllIIlIIIl - this.lIIIIlIlIIlllllIIllIIlIII();
    }

    public long lllIIlIIIllllllIIIIlIlIlI() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public long IlIlllIIIIIIlIIllIIllIlll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public long IlIlIIlIlIllIIlIlIIllIIIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public boolean lllllIlllIIllIlIIlIIIllII() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public float IlIlIIlllIIlIllIIIlllllIl() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public long lIIlIIIIIlIlllIlIIlIlIlll() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public float lIlIlIIlIIIIlIIIIIlllIIII() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        this.IllIIIllIIIIlIlIlIllIIlll = n;
    }

    public boolean IlIIIlIIIIllIIIllIIIIIIll() {
        return this.llIIlllIllIllllIIIlIIIIII;
    }
}

