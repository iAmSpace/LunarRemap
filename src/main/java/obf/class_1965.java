package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.server.S04PacketEntityEquipment;
import net.minecraft.network.play.server.S0BPacketAnimation;
import net.minecraft.network.play.server.S0DPacketCollectItem;
import net.minecraft.util.MathHelper;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public abstract class class_1965
extends class_1521 {
    private static final UUID lllIIIllIIIIlllIlIIllIIll = UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D");
    private static final class_1256 lllIlIIlIIIlIlIIIllIlllIl = new class_1256(lllIIIllIIIIlllIlIIllIIll, "Sprinting speed boost", 0.3f, 2).lllIIIllIIIIlllIlIIllIIll(false);
    private class_1901 IlIllllllIIlIIllllIIlIIIl;
    private final class_1406 lIlllIlllIIIIlIIlllIllIII = new class_1406(this);
    private final HashMap IlIIIIIllllllIIlllIllllll = new HashMap();
    private final ItemStack[] IIIllIIlIIIIIIlIlIIllIIlI = new ItemStack[5];
    public boolean IlIlIIlIlIllIIlIlIIllIIIl;
    public int lllllIlllIIllIlIIlIIIllII;
    public int IIIlIllllIIIlllllIllIlIII;
    public float IIIIIllIlIllIlIlIIlIllIIl;
    public int lIIllIlIIlIIlllllIlIIllIl;
    public int lIIlllIIlIlIlIIIlIlllIIll;
    public float IlIIlIIlllllIlIIlIlIlIlIl;
    public int lIlIIIllIIllIIlIllllllIll;
    public int lIlIIlllllIlllllIlIIIllll;
    public float lllllllIlIIlIlIIIlIlIIlll;
    public float llIllllIIIIIlIIlIlllIIlll;
    public float IIIIlllIIlIllllllIllIIlll;
    public float IIIIIIlIIIIIIIIIIlIlIlIlI;
    public float IllIlllIIIlllllIllIIlIlIl;
    public int IllIIIIlIIlllllllllIlIlII = 20;
    public float IIIlllIlIIllIIlIlIllIlIIl;
    public float llllIIIlIlIlIlIIlIIIIIlIl;
    public float llIIIlIIllIIllIllIIlIlllI;
    public float lIIIIlIlIlIIIlIIllIIlIlIl;
    public float lllllIllllIIIIllIIlIlIlII;
    public float lIIllIlIllIlIlIIlIlIIIIll;
    public float lIIllllIllIlllllIIllIllIl;
    public float IIIIIlllIIllllIlllIlllIIl;
    public float llllIIllllIllIlllllIIlIlI = 0.02f;
    protected class_0814 IllIlIlIIIlIllIlIlIIlllII;
    protected int lIIIllIlIlIlIIIllIlIlIllI;
    protected boolean IIIlIllIlllIlIIIlIlIIllII;
    public int lIIlIlllIIlIIIIlIlIIIIlll;
    protected float IIIlIIllIIlIlIIlIIllIIIIl;
    protected float IIIIlIIIllIIIlIIlIIIIIlll;
    protected float lIIIIIlIllIllIlIlIIllllll;
    protected float lIIIlllIlIIIlIllIIIlIllll;
    protected float IlIIIIIIIIIIlIIlllIIIlIlI;
    protected int llIllIllIllIlIlIllIlIIIIl;
    protected float lllIlIIllllIllIIIlIlIIIll;
    protected boolean llIllIlllIllIlIIIIlIIlIII;
    public float IlllIIIlIIlIIIIllllIllllI;
    public float llIlIIIlllIIIllIllllIIIll;
    protected float lIIlllIIIlIIlIllIIIIIlIlI;
    protected int lllIlIIllllIIllIIIIllIlIl;
    protected double IllIIIIIllIlIIllIllllllIl;
    protected double IIIlllllIIIIIllIllIIIIllI;
    protected double IlIIIIIIllIIlIllIIllIllIl;
    protected double IlIIllIIIlIlIlIIlIlIllIIl;
    protected double IIllIIIlIIllllIIIIIIIIlll;
    private boolean IllIIlllllllIIlIIlIIIIlIl = true;
    private class_1965 IIIllIllIIlIlIlIlIllllIIl;
    private int IllIIIllIIIIlIlIlIllIIlll;
    private class_1965 lIIIIlIlIIlllllIIllIIlIII;
    private int llIIlllIllIllllIIIlIIIIII;
    private float llIIllIllIlIIlIIllIllllll;
    private int lllIIlIIIllllllIIIIlIlIlI;
    private float IlIlllIIIIIIlIIllIIllIlll;

    public class_1965(class_1334 class_13342) {
        super(class_13342);
        this.llIIlIllIllllIlIIIIlIIlll();
        this.IllIIIllIIIIlIlIlIllIIlll(this.IIllllIIlIlIlIlllIIIllIIl());
        this.lIIlIIIIIlIlllIlIIlIlIlll = true;
        this.lIIIIlIlIlIIIlIIllIIlIlIl = (float)(Math.random() + 1.0) * 0.01f;
        this.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl);
        this.llIIIlIIllIIllIllIIlIlllI = (float)Math.random() * 12398.0f;
        this.lIIllllIllIlllllIIllIllIl = this.IIIIlIllIlIIlIIlIllIlIlll = (float)(Math.random() * Math.PI * 2.0);
        this.IllIlIlIIIlllIIllIIIIlIll = 0.5f;
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(7, (Object)0);
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(8, (Object)0);
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(9, (Object)0);
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(6, Float.valueOf(1.0f));
    }

    protected void llIIlIllIllllIlIIIIlIIlll() {
        this.lIlIllllIlIIIIIllIIIIlIlI().lllIlIIlIIIlIlIIIllIlllIl(class_1152.lllIIIllIIIIlllIlIIllIIll);
        this.lIlIllllIlIIIIIllIIIIlIlI().lllIlIIlIIIlIlIIIllIlllIl(class_1152.IlIllllllIIlIIllllIIlIIIl);
        this.lIlIllllIlIIIIIllIIIIlIlI().lllIlIIlIIIlIlIIIllIlllIl(class_1152.lIlllIlllIIIIlIIlllIllIII);
        if (!this.IIIIlllIIlIllllllIllIIlll()) {
            this.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII).lllIIIllIIIIlllIlIIllIIll(0.1f);
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(double d, boolean bl) {
        if (!this.llIlllIlIIllIlIIIIllIIlIl()) {
            this.lIIIllIIIIIllllIlIlIllIll();
        }
        if (bl && this.lIIIllIIIIIllllIlIlIllIll > 0.0f) {
            int n;
            int n2;
            int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll);
            Block class_05492 = this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n3, n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI - (double)0.2f - (double)this.llllIlIIIIIIIIIlllIIlIIIl), n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl));
            if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) {
                int n4 = this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n3, n2 - 1, n).lIIIIlIlIIlllllIIllIIlIII();
                if (n4 == 11 || n4 == 32 || n4 == 21) {
                    class_05492 = this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n3, n2 - 1, n);
                }
            } else if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && this.lIIIllIIIIIllllIlIlIllIll > 3.0f) {
                this.lIlIllIIlIIlIIlIIlIIlIIll.IlIllllllIIlIIllllIIlIIIl(2006, n3, n2, n, MathHelper.lIllllIIlIIIlIllllllIIIll(this.lIIIllIIIIIllllIlIlIllIll - 3.0f));
            }
            class_05492.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, n3, n2, n, (class_1521)this, this.lIIIllIIIIIllllIlIlIllIll);
        }
        super.lllIIIllIIIIlllIlIIllIIll(d, bl);
    }

    public boolean IlIIIIIIIIIIlIIlllIIIlIlI() {
        return false;
    }

    @Override
    public void lllIIIIIIlIlllIIlIlIIIllI() {
        boolean bl;
        this.lllllllIlIIlIlIIIlIlIIlll = this.llIllllIIIIIlIIlIlllIIlll;
        super.lllIIIIIIlIlllIIlIlIIIllI();
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.startSection("livingEntityBaseTick");
        if (this.IlllIIlllllllIIllIlIllllI() && this.IlllIIIllllIIllIllIlIIlIl()) {
            this.lllIIIllIIIIlllIlIIllIIll(class_0058.lIlllIlllIIIIlIIlllIllIII, 1.0f);
        }
        if (this.llIlIIlllIIIIIllIIlIlIIII() || this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            this.IllllIIIIlIIlIIIIlllIIIIl();
        }
        boolean bl2 = bl = this instanceof class_0814 && ((class_0814)this).lIIlIlIlIlIllIIlIIllllIll.lllIIIllIIIIlllIlIIllIIll;
        if (this.IlllIIlllllllIIllIlIllllI() && this.lllIIIllIIIIlllIlIIllIIll(class_1855.IllIIlllllllIIlIIlIIIIlIl)) {
            if (!(this.IlIIIIIIIIIIlIIlllIIIlIlI() || this.llIIllIllIlIIlIIllIllllll(class_0700.IlIlllIIIIIIlIIllIIllIlll.IlIlIIlllIllllllllIIIlIlI) || bl)) {
                this.IllIIlllllllIIlIIlIIIIlIl(this.llIIlllIllIllllIIIlIIIIII(this.lIlIllIIllIIIIlllIlIlllIl()));
                if (this.lIlIllIIllIIIIlllIlIlllIl() == -20) {
                    this.IllIIlllllllIIlIIlIIIIlIl(0);
                    for (int i = 0; i < 8; ++i) {
                        float f = this.IlllIIlllllllIIllIlIllllI.nextFloat() - this.IlllIIlllllllIIllIlIllllI.nextFloat();
                        float f2 = this.IlllIIlllllllIIllIlIllllI.nextFloat() - this.IlllIIlllllllIIllIlIllllI.nextFloat();
                        float f3 = this.IlllIIlllllllIIllIlIllllI.nextFloat() - this.IlllIIlllllllIIllIlIllllI.nextFloat();
                        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll("bubble", this.IlIIlllllIIlIlIlllllIllll + (double)f, this.llIIlIlIlllIIllIlIlllIllI + (double)f2, this.IllIIIIllIIllIllIlllIlIIl + (double)f3, this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
                    }
                    this.lllIIIllIIIIlllIlIIllIIll(class_0058.IlIIIIIllllllIIlllIllllll, 2.0f);
                }
            }
            if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && this.lIlIlIIllIIIlllIllIIlIllI() && this.IlIIIlIIIIllIIIllIIIIIIll instanceof class_1965) {
                this.lllIIIllIIIIlllIlIIllIIll((class_1521)null);
            }
        } else {
            this.IllIIlllllllIIlIIlIIIIlIl(300);
        }
        if (this.IlllIIlllllllIIllIlIllllI() && this.IllIIIlllllIlIlllIlllllII()) {
            this.IllllIIIIlIIlIIIIlllIIIIl();
        }
        this.IIIlllIlIIllIIlIlIllIlIIl = this.llllIIIlIlIlIlIIlIIIIIlIl;
        if (this.lIlIIlllllIlllllIlIIIllll > 0) {
            --this.lIlIIlllllIlllllIlIIIllll;
        }
        if (this.lIIllIlIIlIIlllllIlIIllIl > 0) {
            --this.lIIllIlIIlIIlllllIlIIllIl;
        }
        if (this.IIIIlIllIlIIIIIllllIIlllI > 0 && !(this instanceof class_1822)) {
            --this.IIIIlIllIlIIIIIllllIIlllI;
        }
        if (this.lllIIIlllIlllIIlIllllIIlI() <= 0.0f) {
            this.llIllIllIllIlIlIllIlIIIIl();
        }
        if (this.lIIIllIlIlIlIIIllIlIlIllI > 0) {
            --this.lIIIllIlIlIlIIIllIlIlIllI;
        } else {
            this.IllIlIlIIIlIllIlIlIIlllII = null;
        }
        if (this.lIIIIlIlIIlllllIIllIIlIII != null && !this.lIIIIlIlIIlllllIIllIIlIII.IlllIIlllllllIIllIlIllllI()) {
            this.lIIIIlIlIIlllllIIllIIlIII = null;
        }
        if (this.IIIllIllIIlIlIlIlIllllIIl != null) {
            if (!this.IIIllIllIIlIlIlIlIllllIIl.IlllIIlllllllIIllIlIllllI()) {
                this.IlIllllllIIlIIllllIIlIIIl((class_1965)null);
            } else if (this.IlllIIIllllIIllIllIlIIlIl - this.IllIIIllIIIIlIlIlIllIIlll > 100) {
                this.IlIllllllIIlIIllllIIlIIIl((class_1965)null);
            }
        }
        this.IlIIIIIIllIIlIllIIllIllIl();
        this.lIIIlllIlIIIlIllIIIlIllll = this.lIIIIIlIllIllIlIlIIllllll;
        this.lIIllIlIllIlIlIIlIlIIIIll = this.lllllIllllIIIIllIIlIlIlII;
        this.IIIIIlllIIllllIlllIlllIIl = this.lIIllllIllIlllllIIllIllIl;
        this.llllIIIIlIIIlIIIIIIlIllll = this.IIIIlIllIlIIlIIlIllIlIlll;
        this.llIIIIllIIIIIIIlIIIlIIIIl = this.IlIlIIlllIllllllllIIIlIlI;
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.endSection();
    }

    public boolean g_() {
        return false;
    }

    protected void llIllIllIllIlIlIllIlIIIIl() {
        ++this.lIlIIIllIIllIIlIllllllIll;
        if (this.lIlIIIllIIllIIlIllllllIll == 20) {
            int n;
            if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && (this.lIIIllIlIlIlIIIllIlIlIllI > 0 || this.llIllIlllIllIlIIIIlIIlIII()) && this.lllIlIIllllIllIIIlIlIIIll() && this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl("doMobLoot")) {
                int n2;
                for (n = this.IlIIIIIllllllIIlllIllllll(this.IllIlIlIIIlIllIlIlIIlllII); n > 0; n -= n2) {
                    n2 = class_1138.lllIIIllIIIIlllIlIIllIIll(n);
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(new class_1138(this.lIlIllIIlIIlIIlIIlIIlIIll, this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl, n2));
                }
            }
            this.IIIIlIIlIIIllIIIIllIIIlII();
            for (n = 0; n < 20; ++n) {
                double d = this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 0.02;
                double d2 = this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 0.02;
                double d3 = this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 0.02;
                this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll("explode", this.IlIIlllllIIlIlIlllllIllll + (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * this.IIIIlIlIIlIIIIlIlllIlIIII * 2.0f) - (double)this.IIIIlIlIIlIIIIlIlllIlIIII, this.llIIlIlIlllIIllIlIlllIllI + (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * this.lllIIIIlIlIIlIIlllIIIIIIl), this.IllIIIIllIIllIllIlllIlIIl + (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * this.IIIIlIlIIlIIIIlIlllIlIIII * 2.0f) - (double)this.IIIIlIlIIlIIIIlIlllIlIIII, d, d2, d3);
            }
        }
    }

    protected boolean lllIlIIllllIllIIIlIlIIIll() {
        return !this.g_();
    }

    protected int llIIlllIllIllllIIIlIIIIII(int n) {
        int n2 = class_1250.lllIlIIlIIIlIlIIIllIlllIl(this);
        return n2 > 0 && this.IlllIIlllllllIIllIlIllllI.nextInt(n2 + 1) > 0 ? n : n - 1;
    }

    protected int IlIIIIIllllllIIlllIllllll(class_0814 class_08142) {
        return 0;
    }

    protected boolean llIllIlllIllIlIIIIlIIlIII() {
        return false;
    }

    public Random IlllIIIlIIlIIIIllllIllllI() {
        return this.IlllIIlllllllIIllIlIllllI;
    }

    public class_1965 llIlIIIlllIIIllIllllIIIll() {
        return this.IIIllIllIIlIlIlIlIllllIIl;
    }

    public int lIIlllIIIlIIlIllIIIIIlIlI() {
        return this.IllIIIllIIIIlIlIlIllIIlll;
    }

    public void IlIllllllIIlIIllllIIlIIIl(class_1965 class_19652) {
        this.IIIllIllIIlIlIlIlIllllIIl = class_19652;
        this.IllIIIllIIIIlIlIlIllIIlll = this.IlllIIIllllIIllIllIlIIlIl;
    }

    public class_1965 lllIlIIllllIIllIIIIllIlIl() {
        return this.lIIIIlIlIIlllllIIllIIlIII;
    }

    public int IllIIIIIllIlIIllIllllllIl() {
        return this.llIIlllIllIllllIIIlIIIIII;
    }

    public void lIIIIlIlIIlllllIIllIIlIII(class_1521 class_15212) {
        this.lIIIIlIlIIlllllIIllIIlIII = class_15212 instanceof class_1965 ? (class_1965)class_15212 : null;
        this.llIIlllIllIllllIIIlIIIIII = this.IlllIIIllllIIllIllIlIIlIl;
    }

    public int IIIlllllIIIIIllIllIIIIllI() {
        return this.lIIlIlllIIlIIIIlIlIIIIlll;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        class_07752.lllIIIllIIIIlllIlIIllIIll("HealF", this.lllIIIlllIlllIIlIllllIIlI());
        class_07752.lllIIIllIIIIlllIlIIllIIll("Health", (short)Math.ceil(this.lllIIIlllIlllIIlIllllIIlI()));
        class_07752.lllIIIllIIIIlllIlIIllIIll("HurtTime", (short)this.lIIllIlIIlIIlllllIlIIllIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("DeathTime", (short)this.lIlIIIllIIllIIlIllllllIll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("AttackTime", (short)this.lIlIIlllllIlllllIlIIIllll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("AbsorptionAmount", this.lllIlllllIllIlIIlIlIIIlll());
        for (ItemStack class_08972 : this.lIIlIIlIllIlIIlIlIIlIlIlI()) {
            if (class_08972 == null) continue;
            this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(class_08972.IIIIIIIIlIllIIllIIlllIllI());
        }
        class_07752.lllIIIllIIIIlllIlIIllIIll("Attributes", class_1152.lllIIIllIIIIlllIlIIllIIll(this.lIlIllllIlIIIIIllIIIIlIlI()));
        for (ItemStack class_08972 : this.lIIlIIlIllIlIIlIlIIlIlIlI()) {
            if (class_08972 == null) continue;
            this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl(class_08972.IIIIIIIIlIllIIllIIlllIllI());
        }
        if (!this.IlIIIIIllllllIIlllIllllll.isEmpty()) {
            class_2145 class_21452 = new class_2145();
            for (class_1852 class_18522 : this.IlIIIIIllllllIIlllIllllll.values()) {
                class_21452.lllIIIllIIIIlllIlIIllIIll(class_18522.lllIIIllIIIIlllIlIIllIIll(new class_0775()));
            }
            class_07752.lllIIIllIIIIlllIlIIllIIll("ActiveEffects", class_21452);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        class_2037 class_20372;
        this.IlIlllIIIIIIlIIllIIllIlll(class_07752.IllIIlllllllIIlIIlIIIIlIl("AbsorptionAmount"));
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("Attributes", 9) && this.lIlIllIIlIIlIIlIIlIIlIIll != null && !this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            class_1152.lllIIIllIIIIlllIlIIllIIll(this.lIlIllllIlIIIIIllIIIIlIlI(), class_07752.IlIllllllIIlIIllllIIlIIIl("Attributes", 10));
        }
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("ActiveEffects", 9)) {
            class_20372 = class_07752.IlIllllllIIlIIllllIIlIIIl("ActiveEffects", 10);
            for (int i = 0; i < ((class_2145)class_20372).lIlllIlllIIIIlIIlllIllIII(); ++i) {
                class_0775 class_07753 = ((class_2145)class_20372).lllIlIIlIIIlIlIIIllIlllIl(i);
                class_1852 class_18522 = class_1852.lllIlIIlIIIlIlIIIllIlllIl(class_07753);
                if (class_18522 == null) continue;
                this.IlIIIIIllllllIIlllIllllll.put(class_18522.lllIIIllIIIIlllIlIIllIIll(), class_18522);
            }
        }
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("HealF", 99)) {
            this.IllIIIllIIIIlIlIlIllIIlll(class_07752.IllIIlllllllIIlIIlIIIIlIl("HealF"));
        } else {
            class_20372 = class_07752.lllIIIllIIIIlllIlIIllIIll("Health");
            if (class_20372 == null) {
                this.IllIIIllIIIIlIlIlIllIIlll(this.IIllllIIlIlIlIlllIIIllIIl());
            } else if (class_20372.lllIIIllIIIIlllIlIIllIIll() == 5) {
                this.IllIIIllIIIIlIlIlIllIIlll(((class_0112)class_20372).IIIllIllIIlIlIlIlIllllIIl());
            } else if (class_20372.lllIIIllIIIIlllIlIIllIIll() == 2) {
                this.IllIIIllIIIIlIlIlIllIIlll((float)((class_0791)class_20372).lIllllIIlIIIlIllllllIIIll());
            }
        }
        this.lIIllIlIIlIIlllllIlIIllIl = class_07752.IlIIIIIllllllIIlllIllllll("HurtTime");
        this.lIlIIIllIIllIIlIllllllIll = class_07752.IlIIIIIllllllIIlllIllllll("DeathTime");
        this.lIlIIlllllIlllllIlIIIllll = class_07752.IlIIIIIllllllIIlllIllllll("AttackTime");
    }

    protected void IlIIIIIIllIIlIllIIllIllIl() {
        boolean bl;
        Iterator iterator = this.IlIIIIIllllllIIlllIllllll.keySet().iterator();
        while (iterator.hasNext()) {
            Integer n = (Integer)iterator.next();
            class_1852 class_18522 = (class_1852)this.IlIIIIIllllllIIlllIllllll.get(n);
            if (!class_18522.lllIIIllIIIIlllIlIIllIIll(this)) {
                if (this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) continue;
                iterator.remove();
                this.lIlllIlllIIIIlIIlllIllIII(class_18522);
                continue;
            }
            if (class_18522.lllIlIIlIIIlIlIIIllIlllIl() % 600 != 0) continue;
            this.lllIIIllIIIIlllIlIIllIIll(class_18522, false);
        }
        if (this.IllIIlllllllIIlIIlIIIIlIl) {
            if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
                if (this.IlIIIIIllllllIIlllIllllll.isEmpty()) {
                    this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(8, (byte)0);
                    this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(7, 0);
                    this.IlIIIIIllllllIIlllIllllll(false);
                } else {
                    int n = class_0668.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll.values());
                    this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(8, (byte)(class_0668.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll.values()) ? 1 : 0));
                    this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(7, n);
                    this.IlIIIIIllllllIIlllIllllll(this.llIIllIllIlIIlIIllIllllll(class_0700.IlIlIIlIlIllIIlIlIIllIIIl.IlIlIIlllIllllllllIIIlIlI));
                }
            }
            this.IllIIlllllllIIlIIlIIIIlIl = false;
        }
        int n = this.IlIlIllIIlIIIIlllIlIllIlI.IlIllllllIIlIIllllIIlIIIl(7);
        boolean bl2 = bl = this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(8) > 0;
        if (n > 0) {
            boolean bl3 = false;
            if (!this.lIIlIlIIllIIIlIIlIlIIIlII()) {
                bl3 = this.IlllIIlllllllIIllIlIllllI.nextBoolean();
            } else {
                boolean bl4 = bl3 = this.IlllIIlllllllIIllIlIllllI.nextInt(15) == 0;
            }
            if (bl) {
                bl3 &= this.IlllIIlllllllIIllIlIllllI.nextInt(5) == 0;
            }
            if (bl3 && n > 0) {
                double d = (double)(n >> 16 & 0xFF) / 255.0;
                double d2 = (double)(n >> 8 & 0xFF) / 255.0;
                double d3 = (double)(n >> 0 & 0xFF) / 255.0;
                this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(bl ? "mobSpellAmbient" : "mobSpell", this.IlIIlllllIIlIlIlllllIllll + (this.IlllIIlllllllIIllIlIllllI.nextDouble() - 0.5) * (double)this.IIIIlIlIIlIIIIlIlllIlIIII, this.llIIlIlIlllIIllIlIlllIllI + this.IlllIIlllllllIIllIlIllllI.nextDouble() * (double)this.lllIIIIlIlIIlIIlllIIIIIIl - (double)this.llllIlIIIIIIIIIlllIIlIIIl, this.IllIIIIllIIllIllIlllIlIIl + (this.IlllIIlllllllIIllIlIllllI.nextDouble() - 0.5) * (double)this.IIIIlIlIIlIIIIlIlllIlIIII, d, d2, d3);
            }
        }
    }

    public void IlIIllIIIlIlIlIIlIlIllIIl() {
        Iterator iterator = this.IlIIIIIllllllIIlllIllllll.keySet().iterator();
        while (iterator.hasNext()) {
            Integer n = (Integer)iterator.next();
            class_1852 class_18522 = (class_1852)this.IlIIIIIllllllIIlllIllllll.get(n);
            if (this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) continue;
            iterator.remove();
            this.lIlllIlllIIIIlIIlllIllIII(class_18522);
        }
    }

    public Collection IIllIIIlIIllllIIIIIIIIlll() {
        return this.IlIIIIIllllllIIlllIllllll.values();
    }

    public boolean llIIllIllIlIIlIIllIllllll(int n) {
        return this.IlIIIIIllllllIIlllIllllll.containsKey(n);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_0700 class_07002) {
        return this.IlIIIIIllllllIIlllIllllll.containsKey(class_07002.IlIlIIlllIllllllllIIIlIlI);
    }

    public class_1852 lllIlIIlIIIlIlIIIllIlllIl(class_0700 class_07002) {
        return (class_1852)this.IlIIIIIllllllIIlllIllllll.get(class_07002.IlIlIIlllIllllllllIIIlIlI);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1852 class_18522) {
        if (this.lllIlIIlIIIlIlIIIllIlllIl(class_18522)) {
            if (this.IlIIIIIllllllIIlllIllllll.containsKey(class_18522.lllIIIllIIIIlllIlIIllIIll())) {
                ((class_1852)this.IlIIIIIllllllIIlllIllllll.get(class_18522.lllIIIllIIIIlllIlIIllIIll())).lllIIIllIIIIlllIlIIllIIll(class_18522);
                this.lllIIIllIIIIlllIlIIllIIll((class_1852)this.IlIIIIIllllllIIlllIllllll.get(class_18522.lllIIIllIIIIlllIlIIllIIll()), true);
            } else {
                this.IlIIIIIllllllIIlllIllllll.put(class_18522.lllIIIllIIIIlllIlIIllIIll(), class_18522);
                this.IlIllllllIIlIIllllIIlIIIl(class_18522);
            }
        }
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(class_1852 class_18522) {
        int n;
        return this.IIlllllIIlIIlIlIIlIIlIlII() != class_0529.lllIlIIlIIIlIlIIIllIlllIl || (n = class_18522.lllIIIllIIIIlllIlIIllIIll()) != class_0700.llIIlllIllIllllIIIlIIIIII.IlIlIIlllIllllllllIIIlIlI && n != class_0700.IlIIIlIIIIllIIIllIIIIIIll.IlIlIIlllIllllllllIIIlIlI;
    }

    public boolean lIIIlIllllIlllIIIIIllIIIl() {
        return this.IIlllllIIlIIlIlIIlIIlIlII() == class_0529.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public void lllIIlIIIllllllIIIIlIlIlI(int n) {
        this.IlIIIIIllllllIIlllIllllll.remove(n);
    }

    public void IlIlllIIIIIIlIIllIIllIlll(int n) {
        class_1852 class_18522 = (class_1852)this.IlIIIIIllllllIIlllIllllll.remove(n);
        if (class_18522 != null) {
            this.lIlllIlllIIIIlIIlllIllIII(class_18522);
        }
    }

    protected void IlIllllllIIlIIllllIIlIIIl(class_1852 class_18522) {
        this.IllIIlllllllIIlIIlIIIIlIl = true;
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            class_0700.lllIIIllIIIIlllIlIIllIIll[class_18522.lllIIIllIIIIlllIlIIllIIll()].lllIlIIlIIIlIlIIIllIlllIl(this, this.lIlIllllIlIIIIIllIIIIlIlI(), class_18522.IlIllllllIIlIIllllIIlIIIl());
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1852 class_18522, boolean bl) {
        this.IllIIlllllllIIlIIlIIIIlIl = true;
        if (bl && !this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            class_0700.lllIIIllIIIIlllIlIIllIIll[class_18522.lllIIIllIIIIlllIlIIllIIll()].lllIIIllIIIIlllIlIIllIIll(this, this.lIlIllllIlIIIIIllIIIIlIlI(), class_18522.IlIllllllIIlIIllllIIlIIIl());
            class_0700.lllIIIllIIIIlllIlIIllIIll[class_18522.lllIIIllIIIIlllIlIIllIIll()].lllIlIIlIIIlIlIIIllIlllIl(this, this.lIlIllllIlIIIIIllIIIIlIlI(), class_18522.IlIllllllIIlIIllllIIlIIIl());
        }
    }

    protected void lIlllIlllIIIIlIIlllIllIII(class_1852 class_18522) {
        this.IllIIlllllllIIlIIlIIIIlIl = true;
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            class_0700.lllIIIllIIIIlllIlIIllIIll[class_18522.lllIIIllIIIIlllIlIIllIIll()].lllIIIllIIIIlllIlIIllIIll(this, this.lIlIllllIlIIIIIllIIIIlIlI(), class_18522.IlIllllllIIlIIllllIIlIIIl());
        }
    }

    public void IlIllllllIIlIIllllIIlIIIl(float f) {
        float f2 = this.lllIIIlllIlllIIlIllllIIlI();
        if (f2 > 0.0f) {
            this.IllIIIllIIIIlIlIlIllIIlll(f2 + f);
        }
    }

    public final float lllIIIlllIlllIIlIllllIIlI() {
        return this.IlIlIllIIlIIIIlllIlIllIlI.lIlllIlllIIIIlIIlllIllIII(6);
    }

    public void IllIIIllIIIIlIlIlIllIIlll(float f) {
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(6, Float.valueOf(MathHelper.clamp_float(f, 0.0f, this.IIllllIIlIlIlIlllIIIllIIl())));
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582, float f) {
        Object object;
        if (this.lIIllIIlIIIlllIlllIIlIIlI()) {
            return false;
        }
        if (this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            return false;
        }
        this.lIIlIlllIIlIIIIlIlIIIIlll = 0;
        if (this.lllIIIlllIlllIIlIllllIIlI() <= 0.0f) {
            return false;
        }
        if (class_00582.IlIlllIIIIIIlIIllIIllIlll() && this.lllIIIllIIIIlllIlIIllIIll(class_0700.lllIIlIIIllllllIIIIlIlIlI)) {
            return false;
        }
        if ((class_00582 == class_0058.llIIllIllIlIIlIIllIllllll || class_00582 == class_0058.lllIIlIIIllllllIIIIlIlIlI) && this.IlIllllllIIlIIllllIIlIIIl(4) != null) {
            this.IlIllllllIIlIIllllIIlIIIl(4).lllIIIllIIIIlllIlIIllIIll((int)(f * 4.0f + this.IlllIIlllllllIIllIlIllllI.nextFloat() * f * 2.0f), this);
            f *= 0.75f;
        }
        this.IIIIIIlIIIIIIIIIIlIlIlIlI = 1.5f;
        boolean bl = true;
        if ((float)this.IIIIlIllIlIIIIIllllIIlllI > (float)this.IllIIIIlIIlllllllllIlIlII / 2.0f) {
            if (f <= this.lllIlIIllllIllIIIlIlIIIll) {
                return false;
            }
            this.lllIlIIlIIIlIlIIIllIlllIl(class_00582, f - this.lllIlIIllllIllIIIlIlIIIll);
            this.lllIlIIllllIllIIIlIlIIIll = f;
            bl = false;
        } else {
            this.lllIlIIllllIllIIIlIlIIIll = f;
            this.IIIIIllIlIllIlIlIIlIllIIl = this.lllIIIlllIlllIIlIllllIIlI();
            this.IIIIlIllIlIIIIIllllIIlllI = this.IllIIIIlIIlllllllllIlIlII;
            this.lllIlIIlIIIlIlIIIllIlllIl(class_00582, f);
            this.lIIlllIIlIlIlIIIlIlllIIll = 10;
            this.lIIllIlIIlIIlllllIlIIllIl = 10;
        }
        this.IlIIlIIlllllIlIIlIlIlIlIl = 0.0f;
        class_1521 class_15212 = class_00582.IllIIIllIIIIlIlIlIllIIlll();
        if (class_15212 != null) {
            if (class_15212 instanceof class_1965) {
                this.IlIllllllIIlIIllllIIlIIIl((class_1965)class_15212);
            }
            if (class_15212 instanceof class_0814) {
                this.lIIIllIlIlIlIIIllIlIlIllI = 100;
                this.IllIlIlIIIlIllIlIlIIlllII = (class_0814)class_15212;
            } else if (class_15212 instanceof class_1305 && ((class_2094)(object = (class_1305)class_15212)).lllIIIIlIIllIIIlIllIlllII()) {
                this.lIIIllIlIlIlIIIllIlIlIllI = 100;
                this.IllIlIlIIIlIllIlIlIIlllII = null;
            }
        }
        if (bl) {
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this, (byte)2);
            if (class_00582 != class_0058.IlIIIIIllllllIIlllIllllll) {
                this.IIlIllIIlllllIIlIIllllIIl();
            }
            if (class_15212 != null) {
                double d = class_15212.IlIIlllllIIlIlIlllllIllll - this.IlIIlllllIIlIlIlllllIllll;
                double d2 = class_15212.IllIIIIllIIllIllIlllIlIIl - this.IllIIIIllIIllIllIlllIlIIl;
                while (d * d + d2 * d2 < 1.0E-4) {
                    d = (Math.random() - Math.random()) * 0.01;
                    d2 = (Math.random() - Math.random()) * 0.01;
                }
                this.IlIIlIIlllllIlIIlIlIlIlIl = (float)(Math.atan2(d2, d) * 180.0 / Math.PI) - this.IIIIlIllIlIIlIIlIllIlIlll;
                this.lllIIIllIIIIlllIlIIllIIll(class_15212, f, d, d2);
            } else {
                this.IlIIlIIlllllIlIIlIlIlIlIl = (int)(Math.random() * 2.0) * 180;
            }
        }
        if (this.lllIIIlllIlllIIlIllllIIlI() <= 0.0f) {
            object = this.lIIlIIIlIlIIlllIlIllIllIl();
            if (bl && object != null) {
                this.lllIIIllIIIIlllIlIIllIIll((String)object, this.IIlIlIIIIlIlllIlIlIIIIIlI(), this.IlIlIIllIlIlIIIIIlIlllllI());
            }
            this.lllIIIllIIIIlllIlIIllIIll(class_00582);
        } else {
            object = this.lIIlIlllIIlllIIlllIIlIlII();
            if (bl && object != null) {
                this.lllIIIllIIIIlllIlIIllIIll((String)object, this.IIlIlIIIIlIlllIlIlIIIIIlI(), this.IlIlIIllIlIlIIIIIlIlllllI());
            }
        }
        return true;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(ItemStack class_08972) {
        this.lllIIIllIIIIlllIlIIllIIll("random.break", 0.8f, 0.8f + this.lIlIllIIlIIlIIlIIlIIlIIll.lllllIlllIIllIlIIlIIIllII.nextFloat() * 0.4f);
        for (int i = 0; i < 5; ++i) {
            class_0864 class_08642 = class_0864.lllIIIllIIIIlllIlIIllIIll(((double)this.IlllIIlllllllIIllIlIllllI.nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
            class_08642.lllIIIllIIIIlllIlIIllIIll(-this.IlIlIIlllIllllllllIIIlIlI * (float)Math.PI / 180.0f);
            class_08642.lllIlIIlIIIlIlIIIllIlllIl(-this.IIIIlIllIlIIlIIlIllIlIlll * (float)Math.PI / 180.0f);
            class_0864 class_08643 = class_0864.lllIIIllIIIIlllIlIIllIIll(((double)this.IlllIIlllllllIIllIlIllllI.nextFloat() - 0.5) * 0.3, (double)(-this.IlllIIlllllllIIllIlIllllI.nextFloat()) * 0.6 - 0.3, 0.6);
            class_08643.lllIIIllIIIIlllIlIIllIIll(-this.IlIlIIlllIllllllllIIIlIlI * (float)Math.PI / 180.0f);
            class_08643.lllIlIIlIIIlIlIIIllIlllIl(-this.IIIIlIllIlIIlIIlIllIlIlll * (float)Math.PI / 180.0f);
            class_08643 = class_08643.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI + (double)this.llIIllIllIlIIlIIllIllllll(), this.IllIIIIllIIllIllIlllIlIIl);
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll("iconcrack_" + Item.lllIIIllIIIIlllIlIIllIIll(class_08972.lllIIIllIIIIlllIlIIllIIll()), class_08643.lllIIIllIIIIlllIlIIllIIll, class_08643.lllIlIIlIIIlIlIIIllIlllIl, class_08643.IlIllllllIIlIIllllIIlIIIl, class_08642.lllIIIllIIIIlllIlIIllIIll, class_08642.lllIlIIlIIIlIlIIIllIlllIl + 0.05, class_08642.IlIllllllIIlIIllllIIlIIIl);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582) {
        class_1521 class_15212 = class_00582.IllIIIllIIIIlIlIlIllIIlll();
        class_1965 class_19652 = this.lIIIlllllllIlllIIllllllll();
        if (this.llIllIllIllIlIlIllIlIIIIl >= 0 && class_19652 != null) {
            class_19652.lllIlIIlIIIlIlIIIllIlllIl(this, this.llIllIllIllIlIlIllIlIIIIl);
        }
        if (class_15212 != null) {
            class_15212.lllIIIllIIIIlllIlIIllIIll(this);
        }
        this.IIIlIllIlllIlIIIlIlIIllII = true;
        this.lIIIIlIIIIllIlIIllllIlIII().lIlllIlllIIIIlIIlllIllIII();
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            int n = 0;
            if (class_15212 instanceof class_0814) {
                n = class_1250.IllIIlllllllIIlIIlIIIIlIl((class_1965)class_15212);
            }
            if (this.lllIlIIllllIllIIIlIlIIIll() && this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl("doMobLoot")) {
                int n2;
                this.lllIIIllIIIIlllIlIIllIIll(this.lIIIllIlIlIlIIIllIlIlIllI > 0, n);
                this.lllIlIIlIIIlIlIIIllIlllIl(this.lIIIllIlIlIlIIIllIlIlIllI > 0, n);
                if (this.lIIIllIlIlIlIIIllIlIlIllI > 0 && (n2 = this.IlllIIlllllllIIllIlIllllI.nextInt(200) - n) < 5) {
                    this.IlIlIIlIlIllIIlIlIIllIIIl(n2 <= 0 ? 1 : 0);
                }
            }
        }
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this, (byte)3);
    }

    protected void lllIlIIlIIIlIlIIIllIlllIl(boolean bl, int n) {
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, float f, double d, double d2) {
        if (this.IlllIIlllllllIIllIlIllllI.nextDouble() >= this.lllIIIllIIIIlllIlIIllIIll(class_1152.IlIllllllIIlIIllllIIlIIIl).IlIIIIIllllllIIlllIllllll()) {
            this.lIIlIlIIllIIIlIIlIlIIIlII = true;
            float f2 = MathHelper.lllIIIllIIIIlllIlIIllIIll(d * d + d2 * d2);
            float f3 = 0.4f;
            this.IIIIIIIIlIllIIllIIlllIllI /= 2.0;
            this.IIlIIlIlIlIllIIlIlIIIIlll /= 2.0;
            this.llIIIlllIlllIlIllIIIIllIl /= 2.0;
            this.IIIIIIIIlIllIIllIIlllIllI -= d / (double)f2 * (double)f3;
            this.IIlIIlIlIlIllIIlIlIIIIlll += (double)f3;
            this.llIIIlllIlllIlIllIIIIllIl -= d2 / (double)f2 * (double)f3;
            if (this.IIlIIlIlIlIllIIlIlIIIIlll > (double)0.4f) {
                this.IIlIIlIlIlIllIIlIlIIIIlll = 0.4f;
            }
        }
    }

    protected String lIIlIlllIIlllIIlllIIlIlII() {
        return "game.neutral.hurt";
    }

    protected String lIIlIIIlIlIIlllIlIllIllIl() {
        return "game.neutral.die";
    }

    protected void IlIlIIlIlIllIIlIlIIllIIIl(int n) {
    }

    protected void lllIIIllIIIIlllIlIIllIIll(boolean bl, int n) {
    }

    public boolean h_() {
        int n;
        int n2;
        int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll);
        Block class_05492 = this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n3, n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl), n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl));
        return class_05492 == Blocks.lIlIIllIllIIIIIlIllllIIIl || class_05492 == Blocks.lIIlIlllIIlIIIIlIlIIIIlll;
    }

    @Override
    public boolean IlllIIlllllllIIllIlIllllI() {
        return !this.IllllIIIIlIIlIIIIlllIIIIl && this.lllIIIlllIlllIIlIllllIIlI() > 0.0f;
    }

    @Override
    protected void lIllllIIlIIIlIllllllIIIll(float f) {
        super.lIllllIIlIIIlIllllllIIIll(f);
        class_1852 class_18522 = this.lllIlIIlIIIlIlIIIllIlllIl(class_0700.IllIIIllIIIIlIlIlIllIIlll);
        float f2 = class_18522 != null ? (float)(class_18522.IlIllllllIIlIIllllIIlIIIl() + 1) : 0.0f;
        int n = MathHelper.lIllllIIlIIIlIllllllIIIll(f - 3.0f - f2);
        if (n > 0) {
            this.lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII(n), 1.0f, 1.0f);
            this.lllIIIllIIIIlllIlIIllIIll(class_0058.IllIIlllllllIIlIIlIIIIlIl, (float)n);
            int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll);
            int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI - (double)0.2f - (double)this.llllIlIIIIIIIIIlllIIlIIIl);
            int n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl);
            Block class_05492 = this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n2, n3, n4);
            if (class_05492.lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll) {
                class_1031 class_10312 = class_05492.llIIIlllIlllIlIllIIIIllIl;
                this.lllIIIllIIIIlllIlIIllIIll(class_10312.IlIIIIIllllllIIlllIllllll(), class_10312.IlIllllllIIlIIllllIIlIIIl() * 0.5f, class_10312.lIlllIlllIIIIlIIlllIllIII() * 0.75f);
            }
        }
    }

    protected String lllllIlllIIllIlIIlIIIllII(int n) {
        return n > 4 ? "game.neutral.hurt.fall.big" : "game.neutral.hurt.fall.small";
    }

    @Override
    public void llIIIlIlIlIIlIllIIIllIlIl() {
        this.lIIlllIIlIlIlIIIlIlllIIll = 10;
        this.lIIllIlIIlIIlllllIlIIllIl = 10;
        this.IlIIlIIlllllIlIIlIlIlIlIl = 0.0f;
    }

    public int lIIlIlIIIIIllIIIIllIlIlII() {
        int n = 0;
        for (ItemStack class_08972 : this.lIIlIIlIllIlIIlIlIIlIlIlI()) {
            if (class_08972 == null || !(class_08972.lllIIIllIIIIlllIlIIllIIll() instanceof ItemArmor)) continue;
            int n2 = ((ItemArmor)class_08972.lllIIIllIIIIlllIlIIllIIll()).lIIIIlIlIIlllllIIllIIlIII;
            n += n2;
        }
        return n;
    }

    protected void lIIIIlIlIIlllllIIllIIlIII(float f) {
    }

    protected float IlIllllllIIlIIllllIIlIIIl(class_0058 class_00582, float f) {
        if (!class_00582.IlIIIIIllllllIIlllIllllll()) {
            int n = 25 - this.lIIlIlIIIIIllIIIIllIlIlII();
            float f2 = f * (float)n;
            this.lIIIIlIlIIlllllIIllIIlIII(f);
            f = f2 / 25.0f;
        }
        return f;
    }

    protected float lIlllIlllIIIIlIIlllIllIII(class_0058 class_00582, float f) {
        float f2;
        int n;
        int n2;
        if (class_00582.IllIIlllllllIIlIIlIIIIlIl()) {
            return f;
        }
        if (this instanceof class_0724) {
            // empty if block
        }
        if (this.lllIIIllIIIIlllIlIIllIIll(class_0700.llIIllIllIlIIlIIllIllllll) && class_00582 != class_0058.IIIllIllIIlIlIlIlIllllIIl) {
            n2 = (this.lllIlIIlIIIlIlIIIllIlllIl(class_0700.llIIllIllIlIIlIIllIllllll).IlIllllllIIlIIllllIIlIIIl() + 1) * 5;
            n = 25 - n2;
            f2 = f * (float)n;
            f = f2 / 25.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        n2 = class_1250.lllIIIllIIIIlllIlIIllIIll(this.lIIlIIlIllIlIIlIlIIlIlIlI(), class_00582);
        if (n2 > 20) {
            n2 = 20;
        }
        if (n2 > 0 && n2 <= 20) {
            n = 25 - n2;
            f2 = f * (float)n;
            f = f2 / 25.0f;
        }
        return f;
    }

    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0058 class_00582, float f) {
        if (!this.lIIllIIlIIIlllIlllIIlIIlI()) {
            f = this.IlIllllllIIlIIllllIIlIIIl(class_00582, f);
            float f2 = f = this.lIlllIlllIIIIlIIlllIllIII(class_00582, f);
            f = Math.max(f - this.lllIlllllIllIlIIlIlIIIlll(), 0.0f);
            this.IlIlllIIIIIIlIIllIIllIlll(this.lllIlllllIllIlIIlIlIIIlll() - (f2 - f));
            if (f != 0.0f) {
                float f3 = this.lllIIIlllIlllIIlIllllIIlI();
                this.IllIIIllIIIIlIlIlIllIIlll(f3 - f);
                this.lIIIIlIIIIllIlIIllllIlIII().lllIIIllIIIIlllIlIIllIIll(class_00582, f3, f);
                this.IlIlllIIIIIIlIIllIIllIlll(this.lllIlllllIllIlIIlIlIIIlll() - f);
            }
        }
    }

    public class_1406 lIIIIlIIIIllIlIIllllIlIII() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public class_1965 lIIIlllllllIlllIIllllllll() {
        return this.lIlllIlllIIIIlIIlllIllIII.IlIllllllIIlIIllllIIlIIIl() != null ? this.lIlllIlllIIIIlIIlllIllIII.IlIllllllIIlIIllllIIlIIIl() : (this.IllIlIlIIIlIllIlIlIIlllII != null ? this.IllIlIlIIIlIllIlIlIIlllII : (this.IIIllIllIIlIlIlIlIllllIIl != null ? this.IIIllIllIIlIlIlIlIllllIIl : null));
    }

    public final float IIllllIIlIlIlIlllIIIllIIl() {
        return (float)this.lllIIIllIIIIlllIlIIllIIll(class_1152.lllIIIllIIIIlllIlIIllIIll).IlIIIIIllllllIIlllIllllll();
    }

    public final int IIIllIIIlIlllllllIIIlllll() {
        return this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(9);
    }

    public final void IlIlIIlllIIlIllIIIlllllIl(int n) {
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(9, (byte)n);
    }

    private int IlIIIIIllllllIIlllIllllll() {
        return this.lllIIIllIIIIlllIlIIllIIll(class_0700.IlIIIIIllllllIIlllIllllll) ? 6 - (1 + this.lllIlIIlIIIlIlIIIllIlllIl(class_0700.IlIIIIIllllllIIlllIllllll).IlIllllllIIlIIllllIIlIIIl()) * 1 : (this.lllIIIllIIIIlllIlIIllIIll(class_0700.lIllllIIlIIIlIllllllIIIll) ? 6 + (1 + this.lllIlIIlIIIlIlIIIllIlllIl(class_0700.lIllllIIlIIIlIllllllIIIll).IlIllllllIIlIIllllIIlIIIl()) * 2 : 6);
    }

    public void lIIlIIIIIlIlllIlIIlIlIlll() {
        if (!this.IlIlIIlIlIllIIlIlIIllIIIl || this.lllllIlllIIllIlIIlIIIllII >= this.IlIIIIIllllllIIlllIllllll() / 2 || this.lllllIlllIIllIlIIlIIIllII < 0) {
            this.lllllIlllIIllIlIIlIIIllII = -1;
            this.IlIlIIlIlIllIIlIlIIllIIIl = true;
            if (this.lIlIllIIlIIlIIlIIlIIlIIll instanceof class_0976) {
                ((class_0976)this.lIlIllIIlIIlIIlIIlIIlIIll).lIlIlIIIIIIlIIllllIlIIllI().lllIIIllIIIIlllIlIIllIIll(this, new S0BPacketAnimation(this, 0));
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(byte by) {
        if (by == 2) {
            this.IIIIIIlIIIIIIIIIIlIlIlIlI = 1.5f;
            this.IIIIlIllIlIIIIIllllIIlllI = this.IllIIIIlIIlllllllllIlIlII;
            this.lIIlllIIlIlIlIIIlIlllIIll = 10;
            this.lIIllIlIIlIIlllllIlIIllIl = 10;
            this.IlIIlIIlllllIlIIlIlIlIlIl = 0.0f;
            this.lllIIIllIIIIlllIlIIllIIll(this.lIIlIlllIIlllIIlllIIlIlII(), this.IIlIlIIIIlIlllIlIlIIIIIlI(), (this.IlllIIlllllllIIllIlIllllI.nextFloat() - this.IlllIIlllllllIIllIlIllllI.nextFloat()) * 0.2f + 1.0f);
            this.lllIIIllIIIIlllIlIIllIIll(class_0058.IllIIIllIIIIlIlIlIllIIlll, 0.0f);
        } else if (by == 3) {
            this.lllIIIllIIIIlllIlIIllIIll(this.lIIlIIIlIlIIlllIlIllIllIl(), this.IIlIlIIIIlIlllIlIlIIIIIlI(), (this.IlllIIlllllllIIllIlIllllI.nextFloat() - this.IlllIIlllllllIIllIlIllllI.nextFloat()) * 0.2f + 1.0f);
            this.IllIIIllIIIIlIlIlIllIIlll(0.0f);
            this.lllIIIllIIIIlllIlIIllIIll(class_0058.IllIIIllIIIIlIlIlIllIIlll);
        } else {
            super.lllIIIllIIIIlllIlIIllIIll(by);
        }
    }

    @Override
    protected void llllIlIIIIIIIIIlllIIlIIIl() {
        this.lllIIIllIIIIlllIlIIllIIll(class_0058.IIIllIllIIlIlIlIlIllllIIl, 4.0f);
    }

    protected void lIlIlllIllllIIlllIlllIIIl() {
        int n = this.IlIIIIIllllllIIlllIllllll();
        if (this.IlIlIIlIlIllIIlIlIIllIIIl) {
            ++this.lllllIlllIIllIlIIlIIIllII;
            if (this.lllllIlllIIllIlIIlIIIllII >= n) {
                this.lllllIlllIIllIlIIlIIIllII = 0;
                this.IlIlIIlIlIllIIlIlIIllIIIl = false;
            }
        } else {
            this.lllllIlllIIllIlIIlIIIllII = 0;
        }
        this.llIllllIIIIIlIIlIlllIIlll = (float)this.lllllIlllIIllIlIIlIIIllII / (float)n;
    }

    public class_1685 lllIIIllIIIIlllIlIIllIIll(class_2191 class_21912) {
        return this.lIlIllllIlIIIIIllIIIIlIlI().lllIIIllIIIIlllIlIIllIIll(class_21912);
    }

    public class_1901 lIlIllllIlIIIIIllIIIIlIlI() {
        if (this.IlIllllllIIlIIllllIIlIIIl == null) {
            this.IlIllllllIIlIIllllIIlIIIl = new class_1539();
        }
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public class_0529 IIlllllIIlIIlIlIIlIIlIlII() {
        return class_0529.lllIIIllIIIIlllIlIIllIIll;
    }

    public abstract ItemStack lIIIIlIlIlIIIlIIllIIlIlIl();

    public abstract ItemStack IlIllllllIIlIIllllIIlIIIl(int var1);

    @Override
    public abstract void lllIIIllIIIIlllIlIIllIIll(int var1, ItemStack var2);

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(boolean bl) {
        super.lllIlIIlIIIlIlIIIllIlllIl(bl);
        class_1685 class_16852 = this.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII);
        if (class_16852.lllIIIllIIIIlllIlIIllIIll(lllIIIllIIIIlllIlIIllIIll) != null) {
            class_16852.lllIlIIlIIIlIlIIIllIlllIl(lllIlIIlIIIlIlIIIllIlllIl);
        }
        if (bl) {
            class_16852.lllIIIllIIIIlllIlIIllIIll(lllIlIIlIIIlIlIIIllIlllIl);
        }
    }

    @Override
    public abstract ItemStack[] lIIlIIlIllIlIIlIlIIlIlIlI();

    protected float IIlIlIIIIlIlllIlIlIIIIIlI() {
        return 1.0f;
    }

    protected float IlIlIIllIlIlIIIIIlIlllllI() {
        return this.g_() ? (this.IlllIIlllllllIIllIlIllllI.nextFloat() - this.IlllIIlllllllIIllIlIllllI.nextFloat()) * 0.2f + 1.5f : (this.IlllIIlllllllIIllIlIllllI.nextFloat() - this.IlllIIlllllllIIllIlIllllI.nextFloat()) * 0.2f + 1.0f;
    }

    protected boolean lIlIIIlIlIllIlIlIIIlIlIII() {
        return this.lllIIIlllIlllIIlIllllIIlI() <= 0.0f;
    }

    public void IllIIIllIIIIlIlIlIllIIlll(double d, double d2, double d3) {
        this.lllIlIIlIIIlIlIIIllIlllIl(d, d2, d3, this.IIIIlIllIlIIlIIlIllIlIlll, this.IlIlIIlllIllllllllIIIlIlI);
    }

    public void llIIlllIllIllllIIIlIIIIII(class_1521 class_15212) {
        double d = class_15212.IlIIlllllIIlIlIlllllIllll;
        double d2 = class_15212.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + (double)class_15212.lllIIIIlIlIIlIIlllIIIIIIl;
        double d3 = class_15212.IllIIIIllIIllIllIlllIlIIl;
        int n = 1;
        for (int i = -n; i <= n; ++i) {
            for (int j = -n; j < n; ++j) {
                if (i == 0 && j == 0) continue;
                int n2 = (int)(this.IlIIlllllIIlIlIlllllIllll + (double)i);
                int n3 = (int)(this.IllIIIIllIIllIllIlllIlIIl + (double)j);
                class_1974 class_19742 = this.IIllIllIIllIIlllIIIlIlllI.IlIllllllIIlIIllllIIlIIIl(i, 1.0, j);
                if (!this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_19742).isEmpty()) continue;
                if (class_1334.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, n2, (int)this.llIIlIlIlllIIllIlIlllIllI, n3)) {
                    this.IllIIIllIIIIlIlIlIllIIlll(this.IlIIlllllIIlIlIlllllIllll + (double)i, this.llIIlIlIlllIIllIlIlllIllI + 1.0, this.IllIIIIllIIllIllIlllIlIIl + (double)j);
                    return;
                }
                if (!class_1334.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, n2, (int)this.llIIlIlIlllIIllIlIlllIllI - 1, n3) && this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n2, (int)this.llIIlIlIlllIIllIlIlllIllI - 1, n3).lIllllIIlIIIlIllllllIIIll() != class_1855.IllIIlllllllIIlIIlIIIIlIl) continue;
                d = this.IlIIlllllIIlIlIlllllIllll + (double)i;
                d2 = this.llIIlIlIlllIIllIlIlllIllI + 1.0;
                d3 = this.IllIIIIllIIllIllIlllIlIIl + (double)j;
            }
        }
        this.IllIIIllIIIIlIlIlIllIIlll(d, d2, d3);
    }

    public boolean IIIlIllIlllIlIIIlIlIIllII() {
        return false;
    }

    public IIcon lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, int n) {
        return class_08972.lllIIIllIIIIlllIlIIllIIll().IlIlIIlIlIllIIlIlIIllIIIl() ? class_08972.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll(class_08972.IllIIIllIIIIlIlIlIllIIlll(), n) : class_08972.lllIlIIlIIIlIlIIIllIlllIl();
    }

    protected void f_() {
        this.IIlIIlIlIlIllIIlIlIIIIlll = 0.42f;
        if (this.lllIIIllIIIIlllIlIIllIIll(class_0700.IllIIIllIIIIlIlIlIllIIlll)) {
            this.IIlIIlIlIlIllIIlIlIIIIlll += (double)((float)(this.lllIlIIlIIIlIlIIIllIlllIl(class_0700.IllIIIllIIIIlIlIlIllIIlll).IlIllllllIIlIIllllIIlIIIl() + 1) * 0.1f);
        }
        if (this.IlIIIIIllIlllIIIIlIIIllIl()) {
            float f = this.IIIIlIllIlIIlIIlIllIlIlll * ((float)Math.PI / 180);
            this.IIIIIIIIlIllIIllIIlllIllI -= (double)(MathHelper.lllIIIllIIIIlllIlIIllIIll(f) * 0.2f);
            this.llIIIlllIlllIlIllIIIIllIl += (double)(MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f) * 0.2f);
        }
        this.lIIlIlIIllIIIlIIlIlIIIlII = true;
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2) {
        float f3;
        double d;
        if (!(!this.llIlllIlIIllIlIIIIllIIlIl() || this instanceof class_0814 && ((class_0814)this).lIIlIlIlIlIllIIlIIllllIll.lllIlIIlIIIlIlIIIllIlllIl)) {
            d = this.llIIlIlIlllIIllIlIlllIllI;
            this.lllIIIllIIIIlllIlIIllIIll(f, f2, this.IIIIlllIIlIllllllIllIIlll() ? 0.04f : 0.02f);
            this.IlIIIIIllllllIIlllIllllll(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
            this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.8f;
            this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)0.8f;
            this.llIIIlllIlllIlIllIIIIllIl *= (double)0.8f;
            this.IIlIIlIlIlIllIIlIlIIIIlll -= 0.02;
            if (this.lIlIIllllIlIIIIllIIIIlIIl && this.lIlllIlllIIIIlIIlllIllIII(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll + (double)0.6f - this.llIIlIlIlllIIllIlIlllIllI + d, this.llIIIlllIlllIlIllIIIIllIl)) {
                this.IIlIIlIlIlIllIIlIlIIIIlll = 0.3f;
            }
        } else if (!(!this.lIIlIlllIllIlIlllIIIIIIII() || this instanceof class_0814 && ((class_0814)this).lIIlIlIlIlIllIIlIIllllIll.lllIlIIlIIIlIlIIIllIlllIl)) {
            d = this.llIIlIlIlllIIllIlIlllIllI;
            this.lllIIIllIIIIlllIlIIllIIll(f, f2, 0.02f);
            this.IlIIIIIllllllIIlllIllllll(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
            this.IIIIIIIIlIllIIllIIlllIllI *= 0.5;
            this.IIlIIlIlIlIllIIlIlIIIIlll *= 0.5;
            this.llIIIlllIlllIlIllIIIIllIl *= 0.5;
            this.IIlIIlIlIlIllIIlIlIIIIlll -= 0.02;
            if (this.lIlIIllllIlIIIIllIIIIlIIl && this.lIlllIlllIIIIlIIlllIllIII(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll + (double)0.6f - this.llIIlIlIlllIIllIlIlllIllI + d, this.llIIIlllIlllIlIllIIIIllIl)) {
                this.IIlIIlIlIlIllIIlIlIIIIlll = 0.3f;
            }
        } else {
            float f4 = 0.91f;
            if (this.llllllIlIllllIlIlIlIIIIlI) {
                f4 = this.lIlIllIIlIIlIIlIIlIIlIIll.a_((int) MathHelper.IlIllllllIIlIIllllIIlIIIl((double)this.IlIIlllllIIlIlIlllllIllll), (int)(MathHelper.IlIllllllIIlIIllllIIlIIIl((double)this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl) - 1), (int) MathHelper.IlIllllllIIlIIllllIIlIIIl((double)this.IllIIIIllIIllIllIlllIlIIl)).llllIIIIlIIIlIIIIIIlIllll * 0.91f;
            }
            float f5 = 0.16277136f / (f4 * f4 * f4);
            f3 = this.llllllIlIllllIlIlIlIIIIlI ? this.lIllIIlIlllIllIlIlIlIllII() * f5 : this.llllIIllllIllIlllllIIlIlI;
            this.lllIIIllIIIIlllIlIIllIIll(f, f2, f3);
            f4 = 0.91f;
            if (this.llllllIlIllllIlIlIlIIIIlI) {
                f4 = this.lIlIllIIlIIlIIlIIlIIlIIll.a_((int) MathHelper.IlIllllllIIlIIllllIIlIIIl((double)this.IlIIlllllIIlIlIlllllIllll), (int)(MathHelper.IlIllllllIIlIIllllIIlIIIl((double)this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl) - 1), (int) MathHelper.IlIllllllIIlIIllllIIlIIIl((double)this.IllIIIIllIIllIllIlllIlIIl)).llllIIIIlIIIlIIIIIIlIllll * 0.91f;
            }
            if (this.h_()) {
                boolean bl;
                float f6 = 0.15f;
                if (this.IIIIIIIIlIllIIllIIlllIllI < (double)(-f6)) {
                    this.IIIIIIIIlIllIIllIIlllIllI = -f6;
                }
                if (this.IIIIIIIIlIllIIllIIlllIllI > (double)f6) {
                    this.IIIIIIIIlIllIIllIIlllIllI = f6;
                }
                if (this.llIIIlllIlllIlIllIIIIllIl < (double)(-f6)) {
                    this.llIIIlllIlllIlIllIIIIllIl = -f6;
                }
                if (this.llIIIlllIlllIlIllIIIIllIl > (double)f6) {
                    this.llIIIlllIlllIlIllIIIIllIl = f6;
                }
                this.lIIIllIIIIIllllIlIlIllIll = 0.0f;
                if (this.IIlIIlIlIlIllIIlIlIIIIlll < -0.15) {
                    this.IIlIIlIlIlIllIIlIlIIIIlll = -0.15;
                }
                boolean bl2 = bl = this.IIlIIlIlIlIllIIlIlIIIIlll() && this instanceof class_0814;
                if (bl && this.IIlIIlIlIlIllIIlIlIIIIlll < 0.0) {
                    this.IIlIIlIlIlIllIIlIlIIIIlll = 0.0;
                }
            }
            this.IlIIIIIllllllIIlllIllllll(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
            if (this.lIlIIllllIlIIIIllIIIIlIIl && this.h_()) {
                this.IIlIIlIlIlIllIIlIlIIIIlll = 0.2;
            }
            this.IIlIIlIlIlIllIIlIlIIIIlll = !(!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl || this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIIIIllllllIIlllIllllll((int)this.IlIIlllllIIlIlIlllllIllll, 0, (int)this.IllIIIIllIIllIllIlllIlIIl) && this.lIlIllIIlIIlIIlIIlIIlIIll.lIlllIlllIIIIlIIlllIllIII((int)((int)this.IlIIlllllIIlIlIlllllIllll), (int)((int)this.IllIIIIllIIllIllIlllIlIIl)).lIlllIlllIIIIlIIlllIllIII) ? (this.llIIlIlIlllIIllIlIlllIllI > 0.0 ? -0.1 : 0.0) : (this.IIlIIlIlIlIllIIlIlIIIIlll -= 0.08);
            this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)0.98f;
            this.IIIIIIIIlIllIIllIIlllIllI *= (double)f4;
            this.llIIIlllIlllIlIllIIIIllIl *= (double)f4;
        }
        this.IIIIlllIIlIllllllIllIIlll = this.IIIIIIlIIIIIIIIIIlIlIlIlI;
        d = this.IlIIlllllIIlIlIlllllIllll - this.llIIlIllIllllIlIIIIlIIlll;
        double d2 = this.IllIIIIllIIllIllIlllIlIIl - this.lIlllIlllIlIIIIlllIlIlIIl;
        f3 = MathHelper.lllIIIllIIIIlllIlIIllIIll(d * d + d2 * d2) * 4.0f;
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        this.IIIIIIlIIIIIIIIIIlIlIlIlI += (f3 - this.IIIIIIlIIIIIIIIIIlIlIlIlI) * 0.4f;
        this.IllIlllIIIlllllIllIIlIlIl += this.IIIIIIlIIIIIIIIIIlIlIlIlI;
    }

    protected boolean IIIIlllIIlIllllllIllIIlll() {
        return false;
    }

    public float lIllIIlIlllIllIlIlIlIllII() {
        return this.IIIIlllIIlIllllllIllIIlll() ? this.llIIllIllIlIIlIIllIllllll : 0.1f;
    }

    public void IIIllIllIIlIlIlIlIllllIIl(float f) {
        this.llIIllIllIlIIlIIllIllllll = f;
    }

    public boolean llIIllIllIlIIlIIllIllllll(class_1521 class_15212) {
        this.lIIIIlIlIIlllllIIllIIlIII(class_15212);
        return false;
    }

    public boolean IIIIIllIIlIlIlIIlIlIlIllI() {
        return false;
    }

    @Override
    public void s_() {
        super.s_();
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            int n = this.IIIllIIIlIlllllllIIIlllll();
            if (n > 0) {
                if (this.IIIlIllllIIIlllllIllIlIII <= 0) {
                    this.IIIlIllllIIIlllllIllIlIII = 20 * (30 - n);
                }
                --this.IIIlIllllIIIlllllIllIlIII;
                if (this.IIIlIllllIIIlllllIllIlIII <= 0) {
                    this.IlIlIIlllIIlIllIIIlllllIl(n - 1);
                }
            }
            for (int i = 0; i < 5; ++i) {
                ItemStack class_08972 = this.IIIllIIlIIIIIIlIlIIllIIlI[i];
                ItemStack class_08973 = this.IlIllllllIIlIIllllIIlIIIl(i);
                if (ItemStack.lllIlIIlIIIlIlIIIllIlllIl(class_08973, class_08972)) continue;
                ((class_0976)this.lIlIllIIlIIlIIlIIlIIlIIll).lIlIlIIIIIIlIIllllIlIIllI().lllIIIllIIIIlllIlIIllIIll(this, new S04PacketEntityEquipment(this.llllllIlIllllIlIlIlIIIIlI(), i, class_08973));
                if (class_08972 != null) {
                    this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(class_08972.IIIIIIIIlIllIIllIIlllIllI());
                }
                if (class_08973 != null) {
                    this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl(class_08973.IIIIIIIIlIllIIllIIlllIllI());
                }
                this.IIIllIIlIIIIIIlIlIIllIIlI[i] = class_08973 == null ? null : class_08973.llIIlllIllIllllIIIlIIIIII();
            }
            if (this.IlllIIIllllIIllIllIlIIlIl % 20 == 0) {
                this.lIIIIlIIIIllIlIIllllIlIII().lIlllIlllIIIIlIIlllIllIII();
            }
        }
        this.d_();
        double d = this.IlIIlllllIIlIlIlllllIllll - this.llIIlIllIllllIlIIIIlIIlll;
        double d2 = this.IllIIIIllIIllIllIlllIlIIl - this.lIlllIlllIlIIIIlllIlIlIIl;
        float f = (float)(d * d + d2 * d2);
        float f2 = this.lllllIllllIIIIllIIlIlIlII;
        float f3 = 0.0f;
        this.IIIlIIllIIlIlIIlIIllIIIIl = this.IIIIlIIIllIIIlIIlIIIIIlll;
        float f4 = 0.0f;
        if (f > 0.0025000002f) {
            f4 = 1.0f;
            f3 = (float)Math.sqrt(f) * 3.0f;
            f2 = (float)Math.atan2(d2, d) * 180.0f / (float)Math.PI - 90.0f;
        }
        if (this.llIllllIIIIIlIIlIlllIIlll > 0.0f) {
            f2 = this.IIIIlIllIlIIlIIlIllIlIlll;
        }
        if (!this.llllllIlIllllIlIlIlIIIIlI) {
            f4 = 0.0f;
        }
        this.IIIIlIIIllIIIlIIlIIIIIlll += (f4 - this.IIIIlIIIllIIIlIIlIIIIIlll) * 0.3f;
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.startSection("headTurn");
        f3 = this.lllIlIIlIIIlIlIIIllIlllIl(f2, f3);
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.endSection();
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.startSection("rangeChecks");
        while (this.IIIIlIllIlIIlIIlIllIlIlll - this.llllIIIIlIIIlIIIIIIlIllll < -180.0f) {
            this.llllIIIIlIIIlIIIIIIlIllll -= 360.0f;
        }
        while (this.IIIIlIllIlIIlIIlIllIlIlll - this.llllIIIIlIIIlIIIIIIlIllll >= 180.0f) {
            this.llllIIIIlIIIlIIIIIIlIllll += 360.0f;
        }
        while (this.lllllIllllIIIIllIIlIlIlII - this.lIIllIlIllIlIlIIlIlIIIIll < -180.0f) {
            this.lIIllIlIllIlIlIIlIlIIIIll -= 360.0f;
        }
        while (this.lllllIllllIIIIllIIlIlIlII - this.lIIllIlIllIlIlIIlIlIIIIll >= 180.0f) {
            this.lIIllIlIllIlIlIIlIlIIIIll += 360.0f;
        }
        while (this.IlIlIIlllIllllllllIIIlIlI - this.llIIIIllIIIIIIIlIIIlIIIIl < -180.0f) {
            this.llIIIIllIIIIIIIlIIIlIIIIl -= 360.0f;
        }
        while (this.IlIlIIlllIllllllllIIIlIlI - this.llIIIIllIIIIIIIlIIIlIIIIl >= 180.0f) {
            this.llIIIIllIIIIIIIlIIIlIIIIl += 360.0f;
        }
        while (this.lIIllllIllIlllllIIllIllIl - this.IIIIIlllIIllllIlllIlllIIl < -180.0f) {
            this.IIIIIlllIIllllIlllIlllIIl -= 360.0f;
        }
        while (this.lIIllllIllIlllllIIllIllIl - this.IIIIIlllIIllllIlllIlllIIl >= 180.0f) {
            this.IIIIIlllIIllllIlllIlllIIl += 360.0f;
        }
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.endSection();
        this.lIIIIIlIllIllIlIlIIllllll += f3;
    }

    protected float lllIlIIlIIIlIlIIIllIlllIl(float f, float f2) {
        boolean bl;
        float f3 = MathHelper.IIIllIIlIIIIIIlIlIIllIIlI(f - this.lllllIllllIIIIllIIlIlIlII);
        this.lllllIllllIIIIllIIlIlIlII += f3 * 0.3f;
        float f4 = MathHelper.IIIllIIlIIIIIIlIlIIllIIlI(this.IIIIlIllIlIIlIIlIllIlIlll - this.lllllIllllIIIIllIIlIlIlII);
        boolean bl2 = bl = f4 < -90.0f || f4 >= 90.0f;
        if (f4 < -75.0f) {
            f4 = -75.0f;
        }
        if (f4 >= 75.0f) {
            f4 = 75.0f;
        }
        this.lllllIllllIIIIllIIlIlIlII = this.IIIIlIllIlIIlIIlIllIlIlll - f4;
        if (f4 * f4 > 2500.0f) {
            this.lllllIllllIIIIllIIlIlIlII += f4 * 0.2f;
        }
        if (bl) {
            f2 *= -1.0f;
        }
        return f2;
    }

    public void d_() {
        if (this.lllIIlIIIllllllIIIIlIlIlI > 0) {
            --this.lllIIlIIIllllllIIIIlIlIlI;
        }
        if (this.lllIlIIllllIIllIIIIllIlIl > 0) {
            double d = this.IlIIlllllIIlIlIlllllIllll + (this.IllIIIIIllIlIIllIllllllIl - this.IlIIlllllIIlIlIlllllIllll) / (double)this.lllIlIIllllIIllIIIIllIlIl;
            double d2 = this.llIIlIlIlllIIllIlIlllIllI + (this.IIIlllllIIIIIllIllIIIIllI - this.llIIlIlIlllIIllIlIlllIllI) / (double)this.lllIlIIllllIIllIIIIllIlIl;
            double d3 = this.IllIIIIllIIllIllIlllIlIIl + (this.IlIIIIIIllIIlIllIIllIllIl - this.IllIIIIllIIllIllIlllIlIIl) / (double)this.lllIlIIllllIIllIIIIllIlIl;
            double d4 = MathHelper.IIIllIIlIIIIIIlIlIIllIIlI(this.IlIIllIIIlIlIlIIlIlIllIIl - (double)this.IIIIlIllIlIIlIIlIllIlIlll);
            this.IIIIlIllIlIIlIIlIllIlIlll = (float)((double)this.IIIIlIllIlIIlIIlIllIlIlll + d4 / (double)this.lllIlIIllllIIllIIIIllIlIl);
            this.IlIlIIlllIllllllllIIIlIlI = (float)((double)this.IlIlIIlllIllllllllIIIlIlI + (this.IIllIIIlIIllllIIIIIIIIlll - (double)this.IlIlIIlllIllllllllIIIlIlI) / (double)this.lllIlIIllllIIllIIIIllIlIl);
            --this.lllIlIIllllIIllIIIIllIlIl;
            this.IlIllllllIIlIIllllIIlIIIl(d, d2, d3);
            this.lIllllIIlIIIlIllllllIIIll(this.IIIIlIllIlIIlIIlIllIlIlll, this.IlIlIIlllIllllllllIIIlIlI);
        } else if (!this.llIIIlllIlllIlIllIIIIllIl()) {
            this.IIIIIIIIlIllIIllIIlllIllI *= 0.98;
            this.IIlIIlIlIlIllIIlIlIIIIlll *= 0.98;
            this.llIIIlllIlllIlIllIIIIllIl *= 0.98;
        }
        if (Math.abs(this.IIIIIIIIlIllIIllIIlllIllI) < 0.005) {
            this.IIIIIIIIlIllIIllIIlllIllI = 0.0;
        }
        if (Math.abs(this.IIlIIlIlIlIllIIlIlIIIIlll) < 0.005) {
            this.IIlIIlIlIlIllIIlIlIIIIlll = 0.0;
        }
        if (Math.abs(this.llIIIlllIlllIlIllIIIIllIl) < 0.005) {
            this.llIIIlllIlllIlIllIIIIllIl = 0.0;
        }
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.startSection("ai");
        if (this.lIlIIIlIlIllIlIlIIIlIlIII()) {
            this.llIllIlllIllIlIIIIlIIlIII = false;
            this.IlllIIIlIIlIIIIllllIllllI = 0.0f;
            this.llIlIIIlllIIIllIllllIIIll = 0.0f;
            this.lIIlllIIIlIIlIllIIIIIlIlI = 0.0f;
        } else if (this.llIIIlllIlllIlIllIIIIllIl()) {
            if (this.IIIIlllIIlIllllllIllIIlll()) {
                this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.startSection("newAi");
                this.IllIIIIlIIlllllllllIlIlII();
                this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.endSection();
            } else {
                this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.startSection("oldAi");
                this.llIIlIlIlllIIllIlIlllIllI();
                this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.endSection();
                this.lIIllllIllIlllllIIllIllIl = this.IIIIlIllIlIIlIIlIllIlIlll;
            }
        }
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.endSection();
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.startSection("jump");
        if (this.llIllIlllIllIlIIIIlIIlIII) {
            if (!this.llIlllIlIIllIlIIIIllIIlIl() && !this.lIIlIlllIllIlIlllIIIIIIII()) {
                if (this.llllllIlIllllIlIlIlIIIIlI && this.lllIIlIIIllllllIIIIlIlIlI == 0) {
                    this.f_();
                    this.lllIIlIIIllllllIIIIlIlIlI = 10;
                }
            } else {
                this.IIlIIlIlIlIllIIlIlIIIIlll += (double)0.04f;
            }
        } else {
            this.lllIIlIIIllllllIIIIlIlIlI = 0;
        }
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.endSection();
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.startSection("travel");
        this.IlllIIIlIIlIIIIllllIllllI *= 0.98f;
        this.llIlIIIlllIIIllIllllIIIll *= 0.98f;
        this.lIIlllIIIlIIlIllIIIIIlIlI *= 0.9f;
        this.lllIIIllIIIIlllIlIIllIIll(this.IlllIIIlIIlIIIIllllIllllI, this.llIlIIIlllIIIllIllllIIIll);
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.endSection();
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.startSection("push");
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            this.lIlIIlIIlIIIIllIIlIllIlll();
        }
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.endSection();
    }

    protected void IllIIIIlIIlllllllllIlIlII() {
    }

    protected void lIlIIlIIlIIIIllIIlIllIlll() {
        List list = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl((class_1521)this, this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(0.2f, 0.0, 0.2f));
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); ++i) {
                class_1521 class_15212 = (class_1521)list.get(i);
                if (!class_15212.lIIIIlIlIIlllllIIllIIlIII()) continue;
                this.lllIIlIIIllllllIIIIlIlIlI(class_15212);
            }
        }
    }

    protected void lllIIlIIIllllllIIIIlIlIlI(class_1521 class_15212) {
        class_15212.lIllllIIlIIIlIllllllIIIll(this);
    }

    @Override
    public void lllIIIlIIlIlIllIIIIIlIIll() {
        super.lllIIIlIIlIlIllIIIIIlIIll();
        this.IIIlIIllIIlIlIIlIIllIIIIl = this.IIIIlIIIllIIIlIIlIIIIIlll;
        this.IIIIlIIIllIIIlIIlIIIIIlll = 0.0f;
        this.lIIIllIIIIIllllIlIlIllIll = 0.0f;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3, float f, float f2, int n) {
        this.llllIlIIIIIIIIIlllIIlIIIl = 0.0f;
        this.IllIIIIIllIlIIllIllllllIl = d;
        this.IIIlllllIIIIIllIllIIIIllI = d2;
        this.IlIIIIIIllIIlIllIIllIllIl = d3;
        this.IlIIllIIIlIlIlIIlIlIllIIl = f;
        this.IIllIIIlIIllllIIIIIIIIlll = f2;
        this.lllIlIIllllIIllIIIIllIlIl = n;
    }

    protected void lIIlIlIlIlIllIIlIIllllIll() {
    }

    protected void llIIlIlIlllIIllIlIlllIllI() {
        ++this.lIIlIlllIIlIIIIlIlIIIIlll;
    }

    public void IllIIlllllllIIlIIlIIIIlIl(boolean bl) {
        this.llIllIlllIllIlIIIIlIIlIII = bl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, int n) {
        if (!class_15212.IllllIIIIlIIlIIIIlllIIIIl && !this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            class_1105 class_11052 = ((class_0976)this.lIlIllIIlIIlIIlIIlIIlIIll).lIlIlIIIIIIlIIllllIlIIllI();
            if (class_15212 instanceof class_1781) {
                class_11052.lllIIIllIIIIlllIlIIllIIll(class_15212, new S0DPacketCollectItem(class_15212.llllllIlIllllIlIlIlIIIIlI(), this.llllllIlIllllIlIlIlIIIIlI()));
            }
            if (class_15212 instanceof class_0369) {
                class_11052.lllIIIllIIIIlllIlIIllIIll(class_15212, new S0DPacketCollectItem(class_15212.llllllIlIllllIlIlIlIIIIlI(), this.llllllIlIllllIlIlIlIIIIlI()));
            }
            if (class_15212 instanceof class_1138) {
                class_11052.lllIIIllIIIIlllIlIIllIIll(class_15212, new S0DPacketCollectItem(class_15212.llllllIlIllllIlIlIlIIIIlI(), this.llllllIlIllllIlIlIlIIIIlI()));
            }
        }
    }

    public boolean IlIlllIIIIIIlIIllIIllIlll(class_1521 class_15212) {
        return this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_0864.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI + (double)this.llIIllIllIlIIlIIllIllllll(), this.IllIIIIllIIllIllIlllIlIIl), class_0864.lllIIIllIIIIlllIlIIllIIll(class_15212.IlIIlllllIIlIlIlllllIllll, class_15212.llIIlIlIlllIIllIlIlllIllI + (double)class_15212.llIIllIllIlIIlIIllIllllll(), class_15212.IllIIIIllIIllIllIlllIlIIl)) == null;
    }

    @Override
    public class_0864 IlIIllIlIlIllIIIlIIlIlIIl() {
        return this.llIIlllIllIllllIIIlIIIIII(1.0f);
    }

    public class_0864 llIIlllIllIllllIIIlIIIIII(float f) {
        if (f == 1.0f) {
            float f2 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(-this.IIIIlIllIlIIlIIlIllIlIlll * ((float)Math.PI / 180) - (float)Math.PI);
            float f3 = MathHelper.lllIIIllIIIIlllIlIIllIIll(-this.IIIIlIllIlIIlIIlIllIlIlll * ((float)Math.PI / 180) - (float)Math.PI);
            float f4 = -MathHelper.lllIlIIlIIIlIlIIIllIlllIl(-this.IlIlIIlllIllllllllIIIlIlI * ((float)Math.PI / 180));
            float f5 = MathHelper.lllIIIllIIIIlllIlIIllIIll(-this.IlIlIIlllIllllllllIIIlIlI * ((float)Math.PI / 180));
            return class_0864.lllIIIllIIIIlllIlIIllIIll(f3 * f4, f5, f2 * f4);
        }
        float f6 = this.llIIIIllIIIIIIIlIIIlIIIIl + (this.IlIlIIlllIllllllllIIIlIlI - this.llIIIIllIIIIIIIlIIIlIIIIl) * f;
        float f7 = this.llllIIIIlIIIlIIIIIIlIllll + (this.IIIIlIllIlIIlIIlIllIlIlll - this.llllIIIIlIIIlIIIIIIlIllll) * f;
        float f8 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(-f7 * ((float)Math.PI / 180) - (float)Math.PI);
        float f9 = MathHelper.lllIIIllIIIIlllIlIIllIIll(-f7 * ((float)Math.PI / 180) - (float)Math.PI);
        float f10 = -MathHelper.lllIlIIlIIIlIlIIIllIlllIl(-f6 * ((float)Math.PI / 180));
        float f11 = MathHelper.lllIIIllIIIIlllIlIIllIIll(-f6 * ((float)Math.PI / 180));
        return class_0864.lllIIIllIIIIlllIlIIllIIll(f9 * f10, f11, f8 * f10);
    }

    public float llIIllIllIlIIlIIllIllllll(float f) {
        float f2 = this.llIllllIIIIIlIIlIlllIIlll - this.lllllllIlIIlIlIIIlIlIIlll;
        if (f2 < 0.0f) {
            f2 += 1.0f;
        }
        return this.lllllllIlIIlIlIIIlIlIIlll + f2 * f;
    }

    public class_0864 lllIIlIIIllllllIIIIlIlIlI(float f) {
        if (f == 1.0f) {
            return class_0864.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl);
        }
        double d = this.llIIlIllIllllIlIIIIlIIlll + (this.IlIIlllllIIlIlIlllllIllll - this.llIIlIllIllllIlIIIIlIIlll) * (double)f;
        double d2 = this.llIllllIlIllIIIlIllIIlIlI + (this.llIIlIlIlllIIllIlIlllIllI - this.llIllllIlIllIIIlIllIIlIlI) * (double)f;
        double d3 = this.lIlllIlllIlIIIIlllIlIlIIl + (this.IllIIIIllIIllIllIlllIlIIl - this.lIlllIlllIlIIIIlllIlIlIIl) * (double)f;
        return class_0864.lllIIIllIIIIlllIlIIllIIll(d, d2, d3);
    }

    public class_1112 lllIIIllIIIIlllIlIIllIIll(double d, float f) {
        class_0864 class_08642 = this.lllIIlIIIllllllIIIIlIlIlI(f);
        class_0864 class_08643 = this.llIIlllIllIllllIIIlIIIIII(f);
        class_0864 class_08644 = class_08642.IlIllllllIIlIIllllIIlIIIl(class_08643.lllIIIllIIIIlllIlIIllIIll * d, class_08643.lllIlIIlIIIlIlIIIllIlllIl * d, class_08643.IlIllllllIIlIIllllIIlIIIl * d);
        return this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_08642, class_08644, false, false, true);
    }

    public boolean llIIIlllIlllIlIllIIIIllIl() {
        return !this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl;
    }

    @Override
    public boolean IllllIIlIIIllIlllIlllIllI() {
        return !this.IllllIIIIlIIlIIIIlllIIIIl;
    }

    @Override
    public boolean lIIIIlIlIIlllllIIllIIlIII() {
        return !this.IllllIIIIlIIlIIIIlllIIIIl;
    }

    @Override
    public float llIIllIllIlIIlIIllIllllll() {
        return this.lllIIIIlIlIIlIIlllIIIIIIl * 0.85f;
    }

    @Override
    protected void IIlIllIIlllllIIlIIllllIIl() {
        this.lllIIIIIIlIlllIIlIlIIIllI = this.IlllIIlllllllIIllIlIllllI.nextDouble() >= this.lllIIIllIIIIlllIlIIllIIll(class_1152.IlIllllllIIlIIllllIIlIIIl).IlIIIIIllllllIIlllIllllll();
    }

    @Override
    public float lIIIIllIIllIIIlIIIllIllII() {
        return this.lIIllllIllIlllllIIllIllIl;
    }

    @Override
    public void IIIllIIlIIIIIIlIlIIllIIlI(float f) {
        this.lIIllllIllIlllllIIllIllIl = f;
    }

    public float lllIlllllIllIlIIlIlIIIlll() {
        return this.IlIlllIIIIIIlIIllIIllIlll;
    }

    public void IlIlllIIIIIIlIIllIIllIlll(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.IlIlllIIIIIIlIIllIIllIlll = f;
    }

    public class_0827 llllIllIIIlIllIllllllIlIl() {
        return null;
    }

    public boolean lIlllIlllIIIIlIIlllIllIII(class_1965 class_19652) {
        return this.lllIIIllIIIIlllIlIIllIIll(class_19652.llllIllIIIlIllIllllllIlIl());
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_0827 class_08272) {
        return this.llllIllIIIlIllIllllllIlIl() != null ? this.llllIllIIIlIllIllllllIlIl().lllIIIllIIIIlllIlIIllIIll(class_08272) : false;
    }

    public void llIlllllIIlIIlIIllllIllll() {
    }

    public void lIllIlIlIIIIlIlIIlIlIlllI() {
    }
}

