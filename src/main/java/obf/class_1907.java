package obf;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1907
extends class_1327 {
    private final class_0339 lllIIIllIIIIlllIlIIllIIll;
    private final float lllIlIIlIIIlIlIIIllIlllIl;
    private float IlIllllllIIlIIllllIIlIIIl;
    private boolean lIlllIlllIIIIlIIlllIllIII;
    private int IlIIIIIllllllIIlllIllllll;
    private int lIllllIIlIIIlIllllllIIIll;

    public class_1907(class_0339 class_03392, float f) {
        this.lllIIIllIIIIlllIlIIllIIll = class_03392;
        this.lllIlIIlIIIlIlIIIllIlllIl = f;
        this.lllIIIllIIIIlllIlIIllIIll(7);
    }

    @Override
    public void IlIIIIIllllllIIlllIllllll() {
        this.IlIllllllIIlIIllllIIlIIIl = 0.0f;
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        this.lIlllIlllIIIIlIIlllIllIII = false;
        this.IlIllllllIIlIIllllIIlIIIl = 0.0f;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll.IlllIIlllllllIIllIlIllllI() && this.lllIIIllIIIIlllIlIIllIIll.lIlIlIIlIIIIlIIIIIlllIIII != null && this.lllIIIllIIIIlllIlIIllIIll.lIlIlIIlIIIIlIIIIIlllIIII instanceof class_0814 && (this.lIlllIlllIIIIlIIlllIllIII || this.lllIIIllIIIIlllIlIIllIIll.lIIllllIllIlllllIIllIllIl());
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII() {
        Object object;
        class_0814 class_08142 = (class_0814)this.lllIIIllIIIIlllIlIIllIIll.lIlIlIIlIIIIlIIIIIlllIIII;
        class_1252 class_12522 = (class_1252)this.lllIIIllIIIIlllIlIIllIIll;
        float f = MathHelper.IIIllIIlIIIIIIlIlIIllIIlI(class_08142.IIIIlIllIlIIlIIlIllIlIlll - this.lllIIIllIIIIlllIlIIllIIll.IIIIlIllIlIIlIIlIllIlIlll) * 0.5f;
        if (f > 5.0f) {
            f = 5.0f;
        }
        if (f < -5.0f) {
            f = -5.0f;
        }
        this.lllIIIllIIIIlllIlIIllIIll.IIIIlIllIlIIlIIlIllIlIlll = MathHelper.IIIllIIlIIIIIIlIlIIllIIlI(this.lllIIIllIIIIlllIlIIllIIll.IIIIlIllIlIIlIIlIllIlIlll + f);
        if (this.IlIllllllIIlIIllllIIlIIIl < this.lllIlIIlIIIlIlIIIllIlllIl) {
            this.IlIllllllIIlIIllllIIlIIIl += (this.lllIlIIlIIIlIlIIIllIlllIl - this.IlIllllllIIlIIllllIIlIIIl) * 0.01f;
        }
        if (this.IlIllllllIIlIIllllIIlIIIl > this.lllIlIIlIIIlIlIIIllIlllIl) {
            this.IlIllllllIIlIIllllIIlIIIl = this.lllIlIIlIIIlIlIIIllIlllIl;
        }
        int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.IlIIlllllIIlIlIlllllIllll);
        int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI);
        int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl);
        float f2 = this.IlIllllllIIlIIllllIIlIIIl;
        if (this.lIlllIlllIIIIlIIlllIllIII) {
            if (this.IlIIIIIllllllIIlllIllllll++ > this.lIllllIIlIIIlIllllllIIIll) {
                this.lIlllIlllIIIIlIIlllIllIII = false;
            }
            f2 += f2 * 1.15f * MathHelper.lllIIIllIIIIlllIlIIllIIll((float)this.IlIIIIIllllllIIlllIllllll / (float)this.lIllllIIlIIIlIllllllIIIll * (float)Math.PI);
        }
        float f3 = 0.91f;
        if (this.lllIIIllIIIIlllIlIIllIIll.llllllIlIllllIlIlIlIIIIlI) {
            f3 = this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll.a_((int) MathHelper.lIlllIlllIIIIlIIlllIllIII((float)((float)n)), (int)(MathHelper.lIlllIlllIIIIlIIlllIllIII((float)((float)n2)) - 1), (int) MathHelper.lIlllIlllIIIIlIIlllIllIII((float)((float)n3))).llllIIIIlIIIlIIIIIIlIllll * 0.91f;
        }
        float f4 = 0.16277136f / (f3 * f3 * f3);
        float f5 = MathHelper.lllIIIllIIIIlllIlIIllIIll(class_12522.IIIIlIllIlIIlIIlIllIlIlll * (float)Math.PI / 180.0f);
        float f6 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(class_12522.IIIIlIllIlIIlIIlIllIlIlll * (float)Math.PI / 180.0f);
        float f7 = class_12522.lIllIIlIlllIllIlIlIlIllII() * f4;
        float f8 = Math.max(f2, 1.0f);
        f8 = f7 / f8;
        float f9 = f2 * f8;
        float f10 = -(f9 * f5);
        float f11 = f9 * f6;
        if (MathHelper.IlIIIIIllllllIIlllIllllll(f10) > MathHelper.IlIIIIIllllllIIlllIllllll(f11)) {
            if (f10 < 0.0f) {
                f10 -= this.lllIIIllIIIIlllIlIIllIIll.IIIIlIlIIlIIIIlIlllIlIIII / 2.0f;
            }
            if (f10 > 0.0f) {
                f10 += this.lllIIIllIIIIlllIlIIllIIll.IIIIlIlIIlIIIIlIlllIlIIII / 2.0f;
            }
            f11 = 0.0f;
        } else {
            f10 = 0.0f;
            if (f11 < 0.0f) {
                f11 -= this.lllIIIllIIIIlllIlIIllIIll.IIIIlIlIIlIIIIlIlllIlIIII / 2.0f;
            }
            if (f11 > 0.0f) {
                f11 += this.lllIIIllIIIIlllIlIIllIIll.IIIIlIlIIlIIIIlIlllIlIIII / 2.0f;
            }
        }
        int n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.IlIIlllllIIlIlIlllllIllll + (double)f10);
        int n5 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl + (double)f11);
        class_2120 class_21202 = new class_2120(MathHelper.lIlllIlllIIIIlIIlllIllIII(this.lllIIIllIIIIlllIlIIllIIll.IIIIlIlIIlIIIIlIlllIlIIII + 1.0f), MathHelper.lIlllIlllIIIIlIIlllIllIII(this.lllIIIllIIIIlllIlIIllIIll.lllIIIIlIlIIlIIlllIIIIIIl + class_08142.lllIIIIlIlIIlIIlllIIIIIIl + 1.0f), MathHelper.lIlllIlllIIIIlIIlllIllIII(this.lllIIIllIIIIlllIlIIllIIll.IIIIlIlIIlIIIIlIlllIlIIII + 1.0f));
        if (n != n4 || n3 != n5) {
            boolean bl;
            object = this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll.a_(n, n2, n3);
            boolean bl2 = bl = !this.lllIIIllIIIIlllIlIIllIIll((Block)object) && (((Block)object).lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll || !this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll.a_(n, n2 - 1, n3)));
            if (bl && class_2111.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n4, n2, n5, class_21202, false, false, true) == 0 && class_2111.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2 + 1, n3, class_21202, false, false, true) == 1 && class_2111.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n4, n2 + 1, n5, class_21202, false, false, true) == 1) {
                class_12522.IlIIlllllIIlIlIlllllIllll().lllIIIllIIIIlllIlIIllIIll();
            }
        }
        if (!class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII && this.IlIllllllIIlIIllllIIlIIIl >= this.lllIlIIlIIIlIlIIIllIlllIl * 0.5f && this.lllIIIllIIIIlllIlIIllIIll.IlllIIIlIIlIIIIllllIllllI().nextFloat() < 0.006f && !this.lIlllIlllIIIIlIIlllIllIII && (object = class_08142.lIIIIlIlIlIIIlIIllIIlIlIl()) != null && ((ItemStack)object).lllIIIllIIIIlllIlIIllIIll() == Items.lIlIIlIIlIIIIllIIlIllIlll) {
            ((ItemStack)object).lllIIIllIIIIlllIlIIllIIll(1, (class_1965)class_08142);
            if (((ItemStack)object).lllIlIIlIIIlIlIIIllIlllIl == 0) {
                ItemStack class_08972 = new ItemStack(Items.llIllllIIIIIlIIlIlllIIlll);
                class_08972.lIlllIlllIIIIlIIlllIllIII(((ItemStack)object).lIlllIlllIIIIlIIlllIllIII);
                class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll[class_08142.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl] = class_08972;
            }
        }
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(0.0f, f2);
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(Block class_05492) {
        return class_05492.lIIIIlIlIIlllllIIllIIlIII() == 10 || class_05492 instanceof class_2209;
    }

    public boolean IllIIlllllllIIlIIlIIIIlIl() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public void IIIllIllIIlIlIlIlIllllIIl() {
        this.lIlllIlllIIIIlIIlllIllIII = true;
        this.IlIIIIIllllllIIlllIllllll = 0;
        this.lIllllIIlIIIlIllllllIIIll = this.lllIIIllIIIIlllIlIIllIIll.IlllIIIlIIlIIIIllllIllllI().nextInt(841) + 140;
    }

    public boolean IllIIIllIIIIlIlIlIllIIlll() {
        return !this.IllIIlllllllIIlIIlIIIIlIl() && this.IlIllllllIIlIIllllIIlIIIl > this.lllIlIIlIIIlIlIIIllIlllIl * 0.3f;
    }
}

