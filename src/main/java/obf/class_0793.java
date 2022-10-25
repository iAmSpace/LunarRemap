package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import java.util.UUID;

public class class_0793
extends class_1168 {
    private static final UUID lIIIlIllllIlllIIIIIllIIIl = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
    private static final class_1256 lllIIIlllIlllIIlIllllIIlI = new class_1256(lIIIlIllllIlllIIIIIllIIIl, "Attacking speed boost", 6.2f, 0).lllIIIllIIIIlllIlIIllIIll(false);
    private static boolean[] lIIlIlllIIlllIIlllIIlIlII = new boolean[256];
    private int lIIlIIIlIlIIlllIlIllIllIl;
    private int lIIlIlIIIIIllIIIIllIlIlII;
    private class_1521 lIIIIlIIIIllIlIIllllIlIII;
    private boolean lIIIlllllllIlllIIllllllll;

    public class_0793(class_1334 class_13342) {
        super(class_13342);
        this.IlIIIIIllllllIIlllIllllll(0.6f, 2.9f);
        this.IllIlIlIIIlllIIllIIIIlIll = 1.0f;
    }

    @Override
    protected void llIIlIllIllllIlIIIIlIIlll() {
        super.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll(40.0);
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII).lllIIIllIIIIlllIlIIllIIll(0.3f);
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.IlIIIIIllllllIIlllIllllll).lllIIIllIIIIlllIlIIllIIll(7.0);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
        super.lllIlIIlIIIlIlIIIllIlllIl();
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16, new Byte(0));
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(17, new Byte(0));
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(18, new Byte(0));
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("carried", (short) Block.lllIIIllIIIIlllIlIIllIIll(this.lIllIIlllIIIlIlIIIlllIlIl()));
        class_07752.lllIIIllIIIIlllIlIIllIIll("carriedData", (short)this.IIlIlIlIIlllIIIlIIIIlIIIl());
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        this.lllIIIllIIIIlllIlIIllIIll(Block.lllIIIllIIIIlllIlIIllIIll(class_07752.IlIIIIIllllllIIlllIllllll("carried")));
        this.lllIIIllIIIIlllIlIIllIIll(class_07752.IlIIIIIllllllIIlllIllllll("carriedData"));
    }

    @Override
    protected class_1521 IllIIlllllllIIlIIlIIIIlIl() {
        class_0814 class_08142 = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl((class_1521)this, 64.0);
        if (class_08142 != null) {
            if (this.lIllllIIlIIIlIllllllIIIll(class_08142)) {
                this.lIIIlllllllIlllIIllllllll = true;
                if (this.lIIlIlIIIIIllIIIIllIlIlII == 0) {
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_08142.IlIIlllllIIlIlIlllllIllll, class_08142.llIIlIlIlllIIllIlIlllIllI, class_08142.IllIIIIllIIllIllIlllIlIIl, "mob.endermen.stare", 1.0f, 1.0f);
                }
                if (this.lIIlIlIIIIIllIIIIllIlIlII++ == 5) {
                    this.lIIlIlIIIIIllIIIIllIlIlII = 0;
                    this.lllIIIllIIIIlllIlIIllIIll(true);
                    return class_08142;
                }
            } else {
                this.lIIlIlIIIIIllIIIIllIlIlII = 0;
            }
        }
        return null;
    }

    private boolean lIllllIIlIIIlIllllllIIIll(class_0814 class_08142) {
        ItemStack class_08972 = class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl[3];
        if (class_08972 != null && class_08972.lllIIIllIIIIlllIlIIllIIll() == Item.getItemFromBlock(Blocks.lIlIIlllllIlllllIlIIIllll)) {
            return false;
        }
        class_0864 class_08642 = class_08142.llIIlllIllIllllIIIlIIIIII(1.0f).lllIIIllIIIIlllIlIIllIIll();
        class_0864 class_08643 = class_0864.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll - class_08142.IlIIlllllIIlIlIlllllIllll, this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + (double)(this.lllIIIIlIlIIlIIlllIIIIIIl / 2.0f) - (class_08142.llIIlIlIlllIIllIlIlllIllI + (double)class_08142.llIIllIllIlIIlIIllIllllll()), this.IllIIIIllIIllIllIlllIlIIl - class_08142.IllIIIIllIIllIllIlllIlIIl);
        double d = class_08643.lllIlIIlIIIlIlIIIllIlllIl();
        double d2 = class_08642.lllIlIIlIIIlIlIIIllIlllIl(class_08643 = class_08643.lllIIIllIIIIlllIlIIllIIll());
        return d2 > 1.0 - 0.025 / d && class_08142.IlIlllIIIIIIlIIllIIllIlll(this);
    }

    @Override
    public void d_() {
        float f;
        if (this.IllIIIlllllIlIlllIlllllII()) {
            this.lllIIIllIIIIlllIlIIllIIll(class_0058.IlIIIIIllllllIIlllIllllll, 1.0f);
        }
        if (this.lIIIIlIIIIllIlIIllllIlIII != this.IlIllllllIIlIIllllIIlIIIl) {
            class_1685 class_16852 = this.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII);
            class_16852.lllIlIIlIIIlIlIIIllIlllIl(lllIIIlllIlllIIlIllllIIlI);
            if (this.IlIllllllIIlIIllllIIlIIIl != null) {
                class_16852.lllIIIllIIIIlllIlIIllIIll(lllIIIlllIlllIIlIllllIIlI);
            }
        }
        this.lIIIIlIIIIllIlIIllllIlIII = this.IlIllllllIIlIIllllIIlIIIl;
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl("mobGriefing")) {
            int n;
            int n2;
            Block class_05492;
            if (this.lIllIIlllIIIlIlIIIlllIlIl().lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) {
                int n3;
                if (this.IlllIIlllllllIIllIlIllllI.nextInt(20) == 0 && lIIlIlllIIlllIIlllIIlIlII[Block.lllIIIllIIIIlllIlIIllIIll(class_05492 = this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll - 2.0 + this.IlllIIlllllllIIllIlIllllI.nextDouble() * 4.0), n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI + this.IlllIIlllllllIIllIlIllllI.nextDouble() * 3.0), n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl - 2.0 + this.IlllIIlllllllIIllIlIllllI.nextDouble() * 4.0)))]) {
                    this.lllIIIllIIIIlllIlIIllIIll(class_05492);
                    this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll.IlIllllllIIlIIllllIIlIIIl(n3, n2, n));
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(n3, n2, n, Blocks.lllIIIllIIIIlllIlIIllIIll);
                }
            } else if (this.IlllIIlllllllIIllIlIllllI.nextInt(2000) == 0) {
                int n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll - 1.0 + this.IlllIIlllllllIIllIlIllllI.nextDouble() * 2.0);
                n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI + this.IlllIIlllllllIIllIlIllllI.nextDouble() * 2.0);
                n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl - 1.0 + this.IlllIIlllllllIIllIlIllllI.nextDouble() * 2.0);
                class_05492 = this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n4, n2, n);
                Block class_05493 = this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n4, n2 - 1, n);
                if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll && class_05493.lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll && class_05493.IllIIIllIIIIlIlIlIllIIlll()) {
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(n4, n2, n, this.lIllIIlllIIIlIlIIIlllIlIl(), this.IIlIlIlIIlllIIIlIIIIlIIIl(), 3);
                    this.lllIIIllIIIIlllIlIIllIIll(Blocks.lllIIIllIIIIlllIlIIllIIll);
                }
            }
        }
        for (int i = 0; i < 2; ++i) {
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll("portal", this.IlIIlllllIIlIlIlllllIllll + (this.IlllIIlllllllIIllIlIllllI.nextDouble() - 0.5) * (double)this.IIIIlIlIIlIIIIlIlllIlIIII, this.llIIlIlIlllIIllIlIlllIllI + this.IlllIIlllllllIIllIlIllllI.nextDouble() * (double)this.lllIIIIlIlIIlIIlllIIIIIIl - 0.25, this.IllIIIIllIIllIllIlllIlIIl + (this.IlllIIlllllllIIllIlIllllI.nextDouble() - 0.5) * (double)this.IIIIlIlIIlIIIIlIlllIlIIII, (this.IlllIIlllllllIIllIlIllllI.nextDouble() - 0.5) * 2.0, -this.IlllIIlllllllIIllIlIllllI.nextDouble(), (this.IlllIIlllllllIIllIlIllllI.nextDouble() - 0.5) * 2.0);
        }
        if (this.lIlIllIIlIIlIIlIIlIIlIIll.lIIIIlIlIIlllllIIllIIlIII() && !this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && (f = this.lllIlIIlIIIlIlIIIllIlllIl(1.0f)) > 0.5f && this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIlllllllIIlIIlIIIIlIl(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl)) && this.IlllIIlllllllIIllIlIllllI.nextFloat() * 30.0f < (f - 0.4f) * 2.0f) {
            this.IlIllllllIIlIIllllIIlIIIl = null;
            this.lllIIIllIIIIlllIlIIllIIll(false);
            this.lIIIlllllllIlllIIllllllll = false;
            this.lllIIIlIllIlllIlIIllIllIl();
        }
        if (this.IllIIIlllllIlIlllIlllllII() || this.llIIIIIlIIlIIIIllIIIlIIII()) {
            this.IlIllllllIIlIIllllIIlIIIl = null;
            this.lllIIIllIIIIlllIlIIllIIll(false);
            this.lIIIlllllllIlllIIllllllll = false;
            this.lllIIIlIllIlllIlIIllIllIl();
        }
        if (this.lllIIIIlIIllIIIlIllIlllII() && !this.lIIIlllllllIlllIIllllllll && this.IlllIIlllllllIIllIlIllllI.nextInt(100) == 0) {
            this.lllIIIllIIIIlllIlIIllIIll(false);
        }
        this.llIllIlllIllIlIIIIlIIlIII = false;
        if (this.IlIllllllIIlIIllllIIlIIIl != null) {
            this.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, 100.0f, 100.0f);
        }
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && this.IlllIIlllllllIIllIlIllllI()) {
            if (this.IlIllllllIIlIIllllIIlIIIl != null) {
                if (this.IlIllllllIIlIIllllIIlIIIl instanceof class_0814 && this.lIllllIIlIIIlIllllllIIIll((class_0814)this.IlIllllllIIlIIllllIIlIIIl)) {
                    if (this.IlIllllllIIlIIllllIIlIIIl.IlIIIIIllllllIIlllIllllll(this) < 16.0) {
                        this.lllIIIlIllIlllIlIIllIllIl();
                    }
                    this.lIIlIIIlIlIIlllIlIllIllIl = 0;
                } else if (this.IlIllllllIIlIIllllIIlIIIl.IlIIIIIllllllIIlllIllllll(this) > 256.0 && this.lIIlIIIlIlIIlllIlIllIllIl++ >= 30 && this.IlIllllllIIlIIllllIIlIIIl(this.IlIllllllIIlIIllllIIlIIIl)) {
                    this.lIIlIIIlIlIIlllIlIllIllIl = 0;
                }
            } else {
                this.lllIIIllIIIIlllIlIIllIIll(false);
                this.lIIlIIIlIlIIlllIlIllIllIl = 0;
            }
        }
        super.d_();
    }

    protected boolean lllIIIlIllIlllIlIIllIllIl() {
        double d = this.IlIIlllllIIlIlIlllllIllll + (this.IlllIIlllllllIIllIlIllllI.nextDouble() - 0.5) * 64.0;
        double d2 = this.llIIlIlIlllIIllIlIlllIllI + (double)(this.IlllIIlllllllIIllIlIllllI.nextInt(64) - 32);
        double d3 = this.IllIIIIllIIllIllIlllIlIIl + (this.IlllIIlllllllIIllIlIllllI.nextDouble() - 0.5) * 64.0;
        return this.lIIIIlIlIIlllllIIllIIlIII(d, d2, d3);
    }

    protected boolean IlIllllllIIlIIllllIIlIIIl(class_1521 class_15212) {
        class_0864 class_08642 = class_0864.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll - class_15212.IlIIlllllIIlIlIlllllIllll, this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + (double)(this.lllIIIIlIlIIlIIlllIIIIIIl / 2.0f) - class_15212.llIIlIlIlllIIllIlIlllIllI + (double)class_15212.llIIllIllIlIIlIIllIllllll(), this.IllIIIIllIIllIllIlllIlIIl - class_15212.IllIIIIllIIllIllIlllIlIIl);
        class_08642 = class_08642.lllIIIllIIIIlllIlIIllIIll();
        double d = 16.0;
        double d2 = this.IlIIlllllIIlIlIlllllIllll + (this.IlllIIlllllllIIllIlIllllI.nextDouble() - 0.5) * 8.0 - class_08642.lllIIIllIIIIlllIlIIllIIll * d;
        double d3 = this.llIIlIlIlllIIllIlIlllIllI + (double)(this.IlllIIlllllllIIllIlIllllI.nextInt(16) - 8) - class_08642.lllIlIIlIIIlIlIIIllIlllIl * d;
        double d4 = this.IllIIIIllIIllIllIlllIlIIl + (this.IlllIIlllllllIIllIlIllllI.nextDouble() - 0.5) * 8.0 - class_08642.IlIllllllIIlIIllllIIlIIIl * d;
        return this.lIIIIlIlIIlllllIIllIIlIII(d2, d3, d4);
    }

    protected boolean lIIIIlIlIIlllllIIllIIlIII(double d, double d2, double d3) {
        int n;
        int n2;
        int n3;
        double d4 = this.IlIIlllllIIlIlIlllllIllll;
        double d5 = this.llIIlIlIlllIIllIlIlllIllI;
        double d6 = this.IllIIIIllIIllIllIlllIlIIl;
        this.IlIIlllllIIlIlIlllllIllll = d;
        this.llIIlIlIlllIIllIlIlllIllI = d2;
        this.IllIIIIllIIllIllIlllIlIIl = d3;
        boolean bl = false;
        int n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll);
        if (this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIIIIllllllIIlllIllllll(n4, n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI), n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl))) {
            n = 0;
            while (n == 0 && n3 > 0) {
                Block class_05492 = this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n4, n3 - 1, n2);
                if (class_05492.lIllllIIlIIIlIllllllIIIll().lIlllIlllIIIIlIIlllIllIII()) {
                    n = 1;
                    continue;
                }
                this.llIIlIlIlllIIllIlIlllIllI -= 1.0;
                --n3;
            }
            if (n != 0) {
                this.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl);
                if (this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this, this.IIllIllIIllIIlllIIIlIlllI).isEmpty() && !this.lIlIllIIlIIlIIlIIlIIlIIll.lIlllIlllIIIIlIIlllIllIII(this.IIllIllIIllIIlllIIIlIlllI)) {
                    bl = true;
                }
            }
        }
        if (!bl) {
            this.IlIllllllIIlIIllllIIlIIIl(d4, d5, d6);
            return false;
        }
        n = 128;
        for (int i = 0; i < n; ++i) {
            double d7 = (double)i / ((double)n - 1.0);
            float f = (this.IlllIIlllllllIIllIlIllllI.nextFloat() - 0.5f) * 0.2f;
            float f2 = (this.IlllIIlllllllIIllIlIllllI.nextFloat() - 0.5f) * 0.2f;
            float f3 = (this.IlllIIlllllllIIllIlIllllI.nextFloat() - 0.5f) * 0.2f;
            double d8 = d4 + (this.IlIIlllllIIlIlIlllllIllll - d4) * d7 + (this.IlllIIlllllllIIllIlIllllI.nextDouble() - 0.5) * (double)this.IIIIlIlIIlIIIIlIlllIlIIII * 2.0;
            double d9 = d5 + (this.llIIlIlIlllIIllIlIlllIllI - d5) * d7 + this.IlllIIlllllllIIllIlIllllI.nextDouble() * (double)this.lllIIIIlIlIIlIIlllIIIIIIl;
            double d10 = d6 + (this.IllIIIIllIIllIllIlllIlIIl - d6) * d7 + (this.IlllIIlllllllIIllIlIllllI.nextDouble() - 0.5) * (double)this.IIIIlIlIIlIIIIlIlllIlIIII * 2.0;
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll("portal", d8, d9, d10, (double)f, (double)f2, f3);
        }
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(d4, d5, d6, "mob.endermen.portal", 1.0f, 1.0f);
        this.lllIIIllIIIIlllIlIIllIIll("mob.endermen.portal", 1.0f, 1.0f);
        return true;
    }

    @Override
    protected String lllllllIlIIlIlIIIlIlIIlll() {
        return this.lllIIIIlIIllIIIlIllIlllII() ? "mob.endermen.scream" : "mob.endermen.idle";
    }

    @Override
    protected String lIIlIlllIIlllIIlllIIlIlII() {
        return "mob.endermen.hit";
    }

    @Override
    protected String lIIlIIIlIlIIlllIlIllIllIl() {
        return "mob.endermen.death";
    }

    @Override
    protected Item llIllllIIIIIlIIlIlllIIlll() {
        return Items.IlIIIIIIIIIIlIIlllIIIlIlI;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(boolean bl, int n) {
        Item class_06112 = this.llIllllIIIIIlIIlIlllIIlll();
        if (class_06112 != null) {
            int n2 = this.IlllIIlllllllIIllIlIllllI.nextInt(2 + n);
            for (int i = 0; i < n2; ++i) {
                this.lllIIIllIIIIlllIlIIllIIll(class_06112, 1);
            }
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(Block class_05492) {
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(16, (byte)(Block.lllIIIllIIIIlllIlIIllIIll(class_05492) & 0xFF));
    }

    public Block lIllIIlllIIIlIlIIIlllIlIl() {
        return Block.lllIIIllIIIIlllIlIIllIIll(this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16));
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(17, (byte)(n & 0xFF));
    }

    public int IIlIlIlIIlllIIIlIIIIlIIIl() {
        return this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(17);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582, float f) {
        if (this.lIIllIIlIIIlllIlllIIlIIlI()) {
            return false;
        }
        this.lllIIIllIIIIlllIlIIllIIll(true);
        if (class_00582 instanceof class_1494 && class_00582.IllIIIllIIIIlIlIlIllIIlll() instanceof class_0814) {
            this.lIIIlllllllIlllIIllllllll = true;
        }
        if (class_00582 instanceof class_0666) {
            this.lIIIlllllllIlllIIllllllll = false;
            for (int i = 0; i < 64; ++i) {
                if (!this.lllIIIlIllIlllIlIIllIllIl()) continue;
                return true;
            }
            return false;
        }
        return super.lllIIIllIIIIlllIlIIllIIll(class_00582, f);
    }

    public boolean lllIIIIlIIllIIIlIllIlllII() {
        return this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(18) > 0;
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(18, (byte)(bl ? 1 : 0));
    }

    static {
        class_0793.lIIlIlllIIlllIIlllIIlIlII[Block.lllIIIllIIIIlllIlIIllIIll((Block) Blocks.IlIllllllIIlIIllllIIlIIIl)] = true;
        class_0793.lIIlIlllIIlllIIlllIIlIlII[Block.lllIIIllIIIIlllIlIIllIIll((Block) Blocks.lIlllIlllIIIIlIIlllIllIII)] = true;
        class_0793.lIIlIlllIIlllIIlllIIlIlII[Block.lllIIIllIIIIlllIlIIllIIll((Block) Blocks.llIIllIllIlIIlIIllIllllll)] = true;
        class_0793.lIIlIlllIIlllIIlllIIlIlII[Block.lllIIIllIIIIlllIlIIllIIll((Block) Blocks.lllIIlIIIllllllIIIIlIlIlI)] = true;
        class_0793.lIIlIlllIIlllIIlllIIlIlII[Block.lllIIIllIIIIlllIlIIllIIll((Block) Blocks.llIlllIIllIlllIlIlIlIIIll)] = true;
        class_0793.lIIlIlllIIlllIIlllIIlIlII[Block.lllIIIllIIIIlllIlIIllIIll((Block) Blocks.IIIIlIIlIIIllIIIIllIIIlII)] = true;
        class_0793.lIIlIlllIIlllIIlllIIlIlII[Block.lllIIIllIIIIlllIlIIllIIll((Block) Blocks.lllIIIIIIlIlllIIlIlIIIllI)] = true;
        class_0793.lIIlIlllIIlllIIlllIIlIlII[Block.lllIIIllIIIIlllIlIIllIIll((Block) Blocks.llIIlIIllIIllIlIIllIIllII)] = true;
        class_0793.lIIlIlllIIlllIIlllIIlIlII[Block.lllIIIllIIIIlllIlIIllIIll((Block) Blocks.tnt)] = true;
        class_0793.lIIlIlllIIlllIIlllIIlIlII[Block.lllIIIllIIIIlllIlIIllIIll((Block) Blocks.IIIIIllIlIllIlIlIIlIllIIl)] = true;
        class_0793.lIIlIlllIIlllIIlllIIlIlII[Block.lllIIIllIIIIlllIlIIllIIll((Block) Blocks.lIIllIlIIlIIlllllIlIIllIl)] = true;
        class_0793.lIIlIlllIIlllIIlllIIlIlII[Block.lllIIIllIIIIlllIlIIllIIll((Block) Blocks.lIlIIlllllIlllllIlIIIllll)] = true;
        class_0793.lIIlIlllIIlllIIlllIIlIlII[Block.lllIIIllIIIIlllIlIIllIIll((Block) Blocks.IllIlIlIIIlIllIlIlIIlllII)] = true;
        class_0793.lIIlIlllIIlllIIlllIIlIlII[Block.lllIIIllIIIIlllIlIIllIIll((Block) Blocks.lIIIlllIlIIIlIllIIIlIllll)] = true;
    }
}

