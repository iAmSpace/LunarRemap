package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.ImmutablePair
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import org.apache.commons.lang3.tuple.ImmutablePair;

public class class_0085
extends class_1168 {
    private int lIIIlIllllIlllIIIIIllIIIl;

    public class_0085(class_1334 class_13342) {
        super(class_13342);
        this.IlIIIIIllllllIIlllIllllll(0.3f, 0.7f);
    }

    @Override
    protected void llIIlIllIllllIlIIIIlIIlll() {
        super.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll(8.0);
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII).lllIIIllIIIIlllIlIIllIIll(0.6f);
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.IlIIIIIllllllIIlllIllllll).lllIIIllIIIIlllIlIIllIIll(1.0);
    }

    @Override
    protected boolean IIIllIIlIIIIIIlIlIIllIIlI() {
        return false;
    }

    @Override
    protected class_1521 IllIIlllllllIIlIIlIIIIlIl() {
        double d = 8.0;
        return this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl((class_1521)this, d);
    }

    @Override
    protected String lllllllIlIIlIlIIIlIlIIlll() {
        return "mob.silverfish.say";
    }

    @Override
    protected String lIIlIlllIIlllIIlllIIlIlII() {
        return "mob.silverfish.hit";
    }

    @Override
    protected String lIIlIIIlIlIIlllIlIllIllIl() {
        return "mob.silverfish.kill";
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582, float f) {
        if (this.lIIllIIlIIIlllIlllIIlIIlI()) {
            return false;
        }
        if (this.lIIIlIllllIlllIIIIIllIIIl <= 0 && (class_00582 instanceof class_1494 || class_00582 == class_0058.lIIIIlIlIIlllllIIllIIlIII)) {
            this.lIIIlIllllIlllIIIIIllIIIl = 20;
        }
        return super.lllIIIllIIIIlllIlIIllIIll(class_00582, f);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, float f) {
        if (this.lIlIIlllllIlllllIlIIIllll <= 0 && f < 1.2f && class_15212.IIllIllIIllIIlllIIIlIlllI.IlIIIIIllllllIIlllIllllll > this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl && class_15212.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl < this.IIllIllIIllIIlllIIIlIlllI.IlIIIIIllllllIIlllIllllll) {
            this.lIlIIlllllIlllllIlIIIllll = 20;
            this.llIIllIllIlIIlIIllIllllll(class_15212);
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, Block class_05492) {
        this.lllIIIllIIIIlllIlIIllIIll("mob.silverfish.step", 0.15f, 1.0f);
    }

    @Override
    protected Item llIllllIIIIIlIIlIlllIIlll() {
        return Item.lllIIIllIIIIlllIlIIllIIll(0);
    }

    @Override
    public void s_() {
        this.lllllIllllIIIIllIIlIlIlII = this.IIIIlIllIlIIlIIlIllIlIlll;
        super.s_();
    }

    @Override
    protected void llIIlIlIlllIIllIlIlllIllI() {
        super.llIIlIlIlllIIllIlIlllIllI();
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            int n;
            int n2;
            int n3;
            int n4;
            int n5;
            if (this.lIIIlIllllIlllIIIIIllIIIl > 0) {
                --this.lIIIlIllllIlllIIIIIllIIIl;
                if (this.lIIIlIllllIlllIIIIIllIIIl == 0) {
                    n5 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll);
                    n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI);
                    n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl);
                    n2 = 0;
                    int n6 = 0;
                    while (n2 == 0 && n6 <= 5 && n6 >= -5) {
                        n = 0;
                        while (n2 == 0 && n <= 10 && n >= -10) {
                            int n7 = 0;
                            while (n2 == 0 && n7 <= 10 && n7 >= -10) {
                                if (this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n5 + n, n4 + n6, n3 + n7) == Blocks.lIIIIlIlIlIIIlIIllIIlIlIl) {
                                    if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl("mobGriefing")) {
                                        int n8 = this.lIlIllIIlIIlIIlIIlIIlIIll.IlIllllllIIlIIllllIIlIIIl(n5 + n, n4 + n6, n3 + n7);
                                        ImmutablePair immutablePair = class_0273.IllIIlllllllIIlIIlIIIIlIl(n8);
                                        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(n5 + n, n4 + n6, n3 + n7, (Block)immutablePair.getLeft(), (int)((Integer)immutablePair.getRight()), 3);
                                    } else {
                                        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(n5 + n, n4 + n6, n3 + n7, false);
                                    }
                                    Blocks.lIIIIlIlIlIIIlIIllIIlIlIl.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, n5 + n, n4 + n6, n3 + n7, 0);
                                    if (this.IlllIIlllllllIIllIlIllllI.nextBoolean()) {
                                        n2 = 1;
                                        break;
                                    }
                                }
                                n7 = n7 <= 0 ? 1 - n7 : 0 - n7;
                            }
                            n = n <= 0 ? 1 - n : 0 - n;
                        }
                        n6 = n6 <= 0 ? 1 - n6 : 0 - n6;
                    }
                }
            }
            if (this.IlIllllllIIlIIllllIIlIIIl == null && !this.IlIlllIIIIIIlIIllIIllIlll()) {
                n5 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll);
                n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI + 0.5);
                n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl);
                n2 = this.IlllIIlllllllIIllIlIllllI.nextInt(6);
                Block class_05492 = this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n5 + class_0573.lllIlIIlIIIlIlIIIllIlllIl[n2], n4 + class_0573.IlIllllllIIlIIllllIIlIIIl[n2], n3 + class_0573.lIlllIlllIIIIlIIlllIllIII[n2]);
                n = this.lIlIllIIlIIlIIlIIlIIlIIll.IlIllllllIIlIIllllIIlIIIl(n5 + class_0573.lllIlIIlIIIlIlIIIllIlllIl[n2], n4 + class_0573.IlIllllllIIlIIllllIIlIIIl[n2], n3 + class_0573.lIlllIlllIIIIlIIlllIllIII[n2]);
                if (class_0273.IlIllllllIIlIIllllIIlIIIl(class_05492)) {
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(n5 + class_0573.lllIlIIlIIIlIlIIIllIlllIl[n2], n4 + class_0573.IlIllllllIIlIIllllIIlIIIl[n2], n3 + class_0573.lIlllIlllIIIIlIIlllIllIII[n2], Blocks.lIIIIlIlIlIIIlIIllIIlIlIl, class_0273.lllIIIllIIIIlllIlIIllIIll(class_05492, n), 3);
                    this.lIlIIlllllIlllllIlIIIllll();
                    this.IIIIlIIlIIIllIIIIllIIIlII();
                } else {
                    this.lIllllIIlIIIlIllllllIIIll();
                }
            } else if (this.IlIllllllIIlIIllllIIlIIIl != null && !this.IlIlllIIIIIIlIIllIIllIlll()) {
                this.IlIllllllIIlIIllllIIlIIIl = null;
            }
        }
    }

    @Override
    public float lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        return this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n, n2 - 1, n3) == Blocks.lllIlIIlIIIlIlIIIllIlllIl ? 10.0f : super.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
    }

    @Override
    protected boolean t_() {
        return true;
    }

    @Override
    public boolean lllIIlIIIllllllIIIIlIlIlI() {
        if (super.lllIIlIIIllllllIIIIlIlIlI()) {
            class_0814 class_08142 = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this, 5.0);
            return class_08142 == null;
        }
        return false;
    }

    @Override
    public class_0529 IIlllllIIlIIlIlIIlIIlIlII() {
        return class_0529.IlIllllllIIlIIllllIIlIIIl;
    }
}

