package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import java.util.List;

public class class_1627
extends class_0003
implements class_0278 {
    private static final class_0830 lIIIIlIIIIllIlIIllllIlIII = new class_1567();
    private static final class_2191 lIIIlllllllIlllIIllllllll = new class_1904("horse.jumpStrength", 0.7, 0.0, 2.0).lllIIIllIIIIlllIlIIllIIll("Jump Strength").lllIIIllIIIIlllIlIIllIIll(true);
    private static final String[] IIllllIIlIlIlIlllIIIllIIl = new String[]{null, "textures/entity/horse/armor/horse_armor_iron.png", "textures/entity/horse/armor/horse_armor_gold.png", "textures/entity/horse/armor/horse_armor_diamond.png"};
    private static final String[] IIIllIIIlIlllllllIIIlllll = new String[]{"", "meo", "goo", "dio"};
    private static final int[] lIlIlllIllllIIlllIlllIIIl = new int[]{0, 5, 7, 11};
    private static final String[] lIlIllllIlIIIIIllIIIIlIlI = new String[]{"textures/entity/horse/horse_white.png", "textures/entity/horse/horse_creamy.png", "textures/entity/horse/horse_chestnut.png", "textures/entity/horse/horse_brown.png", "textures/entity/horse/horse_black.png", "textures/entity/horse/horse_gray.png", "textures/entity/horse/horse_darkbrown.png"};
    private static final String[] IIlllllIIlIIlIlIIlIIlIlII = new String[]{"hwh", "hcr", "hch", "hbr", "hbl", "hgr", "hdb"};
    private static final String[] IIlIlIIIIlIlllIlIlIIIIIlI = new String[]{null, "textures/entity/horse/horse_markings_white.png", "textures/entity/horse/horse_markings_whitefield.png", "textures/entity/horse/horse_markings_whitedots.png", "textures/entity/horse/horse_markings_blackdots.png"};
    private static final String[] IlIlIIllIlIlIIIIIlIlllllI = new String[]{"", "wo_", "wmo", "wdo", "bdo"};
    private int lIlIIIlIlIllIlIlIIIlIlIII;
    private int lIllIIlIlllIllIlIlIlIllII;
    private int IIIIIllIIlIlIlIIlIlIlIllI;
    public int lIIIlIllllIlllIIIIIllIIIl;
    public int lllIIIlllIlllIIlIllllIIlI;
    protected boolean lIIlIlllIIlllIIlllIIlIlII;
    private class_0583 lIlIIlIIlIIIIllIIlIllIlll;
    private boolean lIIlIlIlIlIllIIlIIllllIll;
    protected int lIIlIIIlIlIIlllIlIllIllIl;
    protected float lIIlIlIIIIIllIIIIllIlIlII;
    private boolean lllIlllllIllIlIIlIlIIIlll;
    private float llllIllIIIlIllIllllllIlIl;
    private float llIlllllIIlIIlIIllllIllll;
    private float lIllIlIlIIIIlIlIIlIlIlllI;
    private float lllIIIlIllIlllIlIIllIllIl;
    private float IIlIlIIIIlIlllIIlIIlIIIII;
    private float lIllIIlllIIIlIlIIIlllIlIl;
    private int IIlIlIlIIlllIIIlIIIIlIIIl;
    private String lllIIIIlIIllIIIlIllIlllII;
    private String[] IlIllIIIIllllIIllIllIIIIl = new String[3];

    public class_1627(class_1334 class_13342) {
        super(class_13342);
        this.IlIIIIIllllllIIlllIllllll(1.4f, 1.6f);
        this.llllIlIIllIIlllllIIllIIll = false;
        this.llIIlllIllIllllIIIlIIIIII(false);
        this.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(true);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(0, new class_0866(this));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(1, new class_0826(this, 1.2));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(1, new class_0024(this, 1.2));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(2, new class_0303(this, 1.0));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(4, new class_1954(this, 1.0));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(6, new class_0454(this, 0.7));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(7, new class_0235(this, class_0814.class, 6.0f));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(8, new class_0558(this));
        this.llIllIllIllIIIIlIlllllIlI();
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
        super.lllIlIIlIIIlIlIIIllIlllIl();
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16, (Object)0);
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(19, (Object)0);
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(20, (Object)0);
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(21, String.valueOf(""));
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(22, (Object)0);
    }

    public void lIIlIIIIIlIlllIlIIlIlIlll(int n) {
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(19, (byte)n);
        this.llIIIIIIlIIllIllIIIIlIIlI();
    }

    public int IIlIlIlIIlllIIIlIIIIlIIIl() {
        return this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(19);
    }

    public void lIlIlIIlIIIIlIIIIIlllIIII(int n) {
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(20, n);
        this.llIIIIIIlIIllIllIIIIlIIlI();
    }

    public int lllIIIIlIIllIIIlIllIlllII() {
        return this.IlIlIllIIlIIIIlllIlIllIlI.IlIllllllIIlIIllllIIlIIIl(20);
    }

    @Override
    public String llllIIIIlIIIlIIIIIIlIllll() {
        if (this.IllIlIlIIIlIllIlIlIIlllII()) {
            return this.llllIIllllIllIlllllIIlIlI();
        }
        int n = this.IIlIlIlIIlllIIIlIIIIlIIIl();
        switch (n) {
            default: {
                return class_1586.lllIIIllIIIIlllIlIIllIIll("entity.horse.name");
            }
            case 1: {
                return class_1586.lllIIIllIIIIlllIlIIllIIll("entity.donkey.name");
            }
            case 2: {
                return class_1586.lllIIIllIIIIlllIlIIllIIll("entity.mule.name");
            }
            case 3: {
                return class_1586.lllIIIllIIIIlllIlIIllIIll("entity.zombiehorse.name");
            }
            case 4: 
        }
        return class_1586.lllIIIllIIIIlllIlIIllIIll("entity.skeletonhorse.name");
    }

    private boolean llIIlIllIllllIlIIIIlIIlll(int n) {
        return (this.IlIlIllIIlIIIIlllIlIllIlI.IlIllllllIIlIIllllIIlIIIl(16) & n) != 0;
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(int n, boolean bl) {
        int n2 = this.IlIlIllIIlIIIIlllIlIllIlI.IlIllllllIIlIIllllIIlIIIl(16);
        if (bl) {
            this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(16, n2 | n);
        } else {
            this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(16, n2 & ~n);
        }
    }

    public boolean IlIllIIIIllllIIllIllIIIIl() {
        return !this.g_();
    }

    public boolean lIlIlIIllIlIIIIIlIIlllIlI() {
        return this.llIIlIllIllllIlIIIIlIIlll(2);
    }

    public boolean llllIllllllIllIIIlIlIIllI() {
        return this.IlIllIIIIllllIIllIllIIIIl();
    }

    public String IIlIlIIIlIIllIlIlIlIlIIll() {
        return this.IlIlIllIIlIIIIlllIlIllIlI.IlIIIIIllllllIIlllIllllll(21);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(String string) {
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(21, string);
    }

    public float IIIIlllllIlllIIllIIIlIllI() {
        int n = this.u_();
        return n >= 0 ? 1.0f : 0.5f + (float)(-24000 - n) / -24000.0f * 0.5f;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        if (bl) {
            this.lIlllIlllIIIIlIIlllIllIII(this.IIIIlllllIlllIIllIIIlIllI());
        } else {
            this.lIlllIlllIIIIlIIlllIllIII(1.0f);
        }
    }

    public boolean IlIlIIlllIIlIlllllIlIIIIl() {
        return this.lIIlIlllIIlllIIlllIIlIlII;
    }

    public void IIIllIllIIlIlIlIlIllllIIl(boolean bl) {
        this.lllIlIIlIIIlIlIIIllIlllIl(2, bl);
    }

    public void IllIIIllIIIIlIlIlIllIIlll(boolean bl) {
        this.lIIlIlllIIlllIIlllIIlIlII = bl;
    }

    @Override
    public boolean IIIIlIIIllIIIlIIlIIIIIlll() {
        return !this.lIIIlIllIlIIlIIIllIIlIlll() && super.IIIIlIIIllIIIlIIlIIIIIlll();
    }

    @Override
    protected void IlIIIIIllllllIIlllIllllll(float f) {
        if (f > 6.0f && this.lIlIllIIIlIlIlIlIIIllllll()) {
            this.IlIlllIIIIIIlIIllIIllIlll(false);
        }
    }

    public boolean IIllllllIIllIlIllllIIIlll() {
        return this.llIIlIllIllllIlIIIIlIIlll(8);
    }

    public int llllIIIllIllIIIllIlIIIIIl() {
        return this.IlIlIllIIlIIIIlllIlIllIlI.IlIllllllIIlIIllllIIlIIIl(22);
    }

    private int IlIIIIIllllllIIlllIllllll(ItemStack class_08972) {
        if (class_08972 == null) {
            return 0;
        }
        Item class_06112 = class_08972.lllIIIllIIIIlllIlIIllIIll();
        return class_06112 == Items.IlIllIIIIllllIIllIllIIIIl ? 1 : (class_06112 == Items.lIlIlIIllIlIIIIIlIIlllIlI ? 2 : (class_06112 == Items.llllIllllllIllIIIlIlIIllI ? 3 : 0));
    }

    public boolean lIlIllIIIlIlIlIlIIIllllll() {
        return this.llIIlIllIllllIlIIIIlIIlll(32);
    }

    public boolean IllIIIIIllIIlllIlIIIlIlll() {
        return this.llIIlIllIllllIlIIIIlIIlll(64);
    }

    public boolean IllIlIIllIIllIlIIlIllIlIl() {
        return this.llIIlIllIllllIlIIIIlIIlll(16);
    }

    public boolean IllIIlIIlIIIIlIlIlIIlIlIl() {
        return this.lIIlIlIlIlIllIIlIIllllIll;
    }

    public void lIlllIlllIIIIlIIlllIllIII(ItemStack class_08972) {
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(22, this.IlIIIIIllllllIIlllIllllll(class_08972));
        this.llIIIIIIlIIllIllIIIIlIIlI();
    }

    public void lIIIIlIlIIlllllIIllIIlIII(boolean bl) {
        this.lllIlIIlIIIlIlIIIllIlllIl(16, bl);
    }

    public void llIIlllIllIllllIIIlIIIIII(boolean bl) {
        this.lllIlIIlIIIlIlIIIllIlllIl(8, bl);
    }

    public void llIIllIllIlIIlIIllIllllll(boolean bl) {
        this.lIIlIlIlIlIllIIlIIllllIll = bl;
    }

    public void lllIIlIIIllllllIIIIlIlIlI(boolean bl) {
        this.lllIlIIlIIIlIlIIIllIlllIl(4, bl);
    }

    public int lllIlIlIIIlIllllIlllIlIlI() {
        return this.lIIlIIIlIlIIlllIlIllIllIl;
    }

    public void IlIIIlIIIIllIIIllIIIIIIll(int n) {
        this.lIIlIIIlIlIIlllIlIllIllIl = n;
    }

    public int IIlllIlIlllIllIIIlllIIlIl(int n) {
        int n2 = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.lllIlIlIIIlIllllIlllIlIlI() + n, 0, this.lIlIIlIIllIllllllIIIIlllI());
        this.IlIIIlIIIIllIIIllIIIIIIll(n2);
        return n2;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582, float f) {
        class_1521 class_15212 = class_00582.IllIIIllIIIIlIlIlIllIIlll();
        return this.lIlIlIIlIIIIlIIIIIlllIIII != null && this.lIlIlIIlIIIIlIIIIIlllIIII.equals(class_15212) ? false : super.lllIIIllIIIIlllIlIIllIIll(class_00582, f);
    }

    @Override
    public int lIIlIlIIIIIllIIIIllIlIlII() {
        return lIlIlllIllllIIlllIlllIIIl[this.llllIIIllIllIIIllIlIIIIIl()];
    }

    @Override
    public boolean lIIIIlIlIIlllllIIllIIlIII() {
        return this.lIlIlIIlIIIIlIIIIIlllIIII == null;
    }

    public boolean IIIIIlIIIIIllIIllIlIlIlIl() {
        int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll);
        int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl);
        this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n, n2);
        return true;
    }

    public void lIIIlIIllIlIIIlIlIlIlIllI() {
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && this.IIllllllIIllIlIllllIIIlll()) {
            this.lllIIIllIIIIlllIlIIllIIll(Item.getItemFromBlock(Blocks.IllIlIlIIIlllIIllIIIIlIll), 1);
            this.llIIlllIllIllllIIIlIIIIII(false);
        }
    }

    private void lIlIIIIlIllIllIlIIlllllII() {
        this.IllllllIlIlIIlIIllllllIIl();
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this, "eating", 1.0f, 1.0f + (this.IlllIIlllllllIIllIlIllllI.nextFloat() - this.IlllIIlllllllIIllIlIllllI.nextFloat()) * 0.2f);
    }

    @Override
    protected void lIllllIIlIIIlIllllllIIIll(float f) {
        int n;
        if (f > 1.0f) {
            this.lllIIIllIIIIlllIlIIllIIll("mob.horse.land", 0.4f, 1.0f);
        }
        if ((n = MathHelper.lIllllIIlIIIlIllllllIIIll(f * 0.5f - 3.0f)) > 0) {
            Block class_05492;
            this.lllIIIllIIIIlllIlIIllIIll(class_0058.IllIIlllllllIIlIIlIIIIlIl, (float)n);
            if (this.lIlIlIIlIIIIlIIIIIlllIIII != null) {
                this.lIlIlIIlIIIIlIIIIIlllIIII.lllIIIllIIIIlllIlIIllIIll(class_0058.IllIIlllllllIIlIIlIIIIlIl, (float)n);
            }
            if ((class_05492 = this.lIlIllIIlIIlIIlIIlIIlIIll.a_(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI - 0.2 - (double)this.llllIIIIlIIIlIIIIIIlIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl))).lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll) {
                class_1031 class_10312 = class_05492.llIIIlllIlllIlIllIIIIllIl;
                this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this, class_10312.IlIIIIIllllllIIlllIllllll(), class_10312.IlIllllllIIlIIllllIIlIIIl() * 0.5f, class_10312.lIlllIlllIIIIlIIlllIllIII() * 0.75f);
            }
        }
    }

    private int llIIIIIIIlllIIlIIIIllIIlI() {
        int n = this.IIlIlIlIIlllIIIlIIIIlIIIl();
        return this.IIllllllIIllIlIllllIIIlll() && (n == 1 || n == 2) ? 17 : 2;
    }

    private void llIllIllIllIIIIlIlllllIlI() {
        class_0583 class_05832 = this.lIlIIlIIlIIIIllIIlIllIlll;
        this.lIlIIlIIlIIIIllIIlIllIlll = new class_0583("HorseChest", this.llIIIIIIIlllIIlIIIIllIIlI());
        this.lIlIIlIIlIIIIllIIlIllIlll.lllIIIllIIIIlllIlIIllIIll(this.llllIIIIlIIIlIIIIIIlIllll());
        if (class_05832 != null) {
            class_05832.lllIlIIlIIIlIlIIIllIlllIl(this);
            int n = Math.min(class_05832.IlIIIIIllllllIIlllIllllll(), this.lIlIIlIIlIIIIllIIlIllIlll.IlIIIIIllllllIIlllIllllll());
            for (int i = 0; i < n; ++i) {
                ItemStack class_08972 = class_05832.llIIllIllIlIIlIIllIllllll(i);
                if (class_08972 == null) continue;
                this.lIlIIlIIlIIIIllIIlIllIlll.lllIlIIlIIIlIlIIIllIlllIl(i, class_08972.llIIlllIllIllllIIIlIIIIII());
            }
            class_05832 = null;
        }
        this.lIlIIlIIlIIIIllIIlIllIlll.lllIIIllIIIIlllIlIIllIIll(this);
        this.IIllIlIIlIIlIlllIIllIllll();
    }

    private void IIllIlIIlIIlIlllIIllIllll() {
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            this.lllIIlIIIllllllIIIIlIlIlI(this.lIlIIlIIlIIIIllIIlIllIlll.llIIllIllIlIIlIIllIllllll(0) != null);
            if (this.IIIIIIIllllllIIIIllIIIIII()) {
                this.lIlllIlllIIIIlIIlllIllIII(this.lIlIIlIIlIIIIllIIlIllIlll.llIIllIllIlIIlIIllIllllll(1));
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1749 class_17492) {
        int n = this.llllIIIllIllIIIllIlIIIIIl();
        boolean bl = this.IIIIlIIIIIIIllIlllIIlllII();
        this.IIllIlIIlIIlIlllIIllIllll();
        if (this.IlllIIIllllIIllIllIlIIlIl > 20) {
            if (n == 0 && n != this.llllIIIllIllIIIllIlIIIIIl()) {
                this.lllIIIllIIIIlllIlIIllIIll("mob.horse.armor", 0.5f, 1.0f);
            } else if (n != this.llllIIIllIllIIIllIlIIIIIl()) {
                this.lllIIIllIIIIlllIlIIllIIll("mob.horse.armor", 0.5f, 1.0f);
            }
            if (!bl && this.IIIIlIIIIIIIllIlllIIlllII()) {
                this.lllIIIllIIIIlllIlIIllIIll("mob.horse.leather", 0.5f, 1.0f);
            }
        }
    }

    @Override
    public boolean lllIIlIIIllllllIIIIlIlIlI() {
        this.IIIIIlIIIIIllIIllIlIlIlIl();
        return super.lllIIlIIIllllllIIIIlIlIlI();
    }

    protected class_1627 lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d) {
        double d2 = Double.MAX_VALUE;
        class_1521 class_15213 = null;
        List list = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_15212, class_15212.IIllIllIIllIIlllIIIlIlllI.lllIIIllIIIIlllIlIIllIIll(d, d, d), lIIIIlIIIIllIlIIllllIlIII);
        for (class_1521 class_15214 : list) {
            double d3 = class_15214.lIllllIIlIIIlIllllllIIIll(class_15212.IlIIlllllIIlIlIlllllIllll, class_15212.llIIlIlIlllIIllIlIlllIllI, class_15212.IllIIIIllIIllIllIlllIlIIl);
            if (!(d3 < d2)) continue;
            class_15213 = class_15214;
            d2 = d3;
        }
        return (class_1627)class_15213;
    }

    public double IIIlIlIIlIIlIlIIIIIlIlIlI() {
        return this.lllIIIllIIIIlllIlIIllIIll(lIIIlllllllIlllIIllllllll).IlIIIIIllllllIIlllIllllll();
    }

    @Override
    protected String lIIlIIIlIlIIlllIlIllIllIl() {
        this.IllllllIlIlIIlIIllllllIIl();
        int n = this.IIlIlIlIIlllIIIlIIIIlIIIl();
        return n == 3 ? "mob.horse.zombie.death" : (n == 4 ? "mob.horse.skeleton.death" : (n != 1 && n != 2 ? "mob.horse.death" : "mob.horse.donkey.death"));
    }

    @Override
    protected Item llIllllIIIIIlIIlIlllIIlll() {
        boolean bl = this.IlllIIlllllllIIllIlIllllI.nextInt(4) == 0;
        int n = this.IIlIlIlIIlllIIIlIIIIlIIIl();
        return n == 4 ? Items.bone : (n == 3 ? (bl ? Item.lllIIIllIIIIlllIlIIllIIll(0) : Items.lIIIlllIlIIIlIllIIIlIllll) : Items.leather);
    }

    @Override
    protected String lIIlIlllIIlllIIlllIIlIlII() {
        int n;
        this.IllllllIlIlIIlIIllllllIIl();
        if (this.IlllIIlllllllIIllIlIllllI.nextInt(3) == 0) {
            this.lIIlIIlIlIIIIIlllIIIIIllI();
        }
        return (n = this.IIlIlIlIIlllIIIlIIIIlIIIl()) == 3 ? "mob.horse.zombie.hit" : (n == 4 ? "mob.horse.skeleton.hit" : (n != 1 && n != 2 ? "mob.horse.hit" : "mob.horse.donkey.hit"));
    }

    public boolean IIIIlIIIIIIIllIlllIIlllII() {
        return this.llIIlIllIllllIlIIIIlIIlll(4);
    }

    @Override
    protected String lllllllIlIIlIlIIIlIlIIlll() {
        int n;
        this.IllllllIlIlIIlIIllllllIIl();
        if (this.IlllIIlllllllIIllIlIllllI.nextInt(10) == 0 && !this.lIlIIIlIlIllIlIlIIIlIlIII()) {
            this.lIIlIIlIlIIIIIlllIIIIIllI();
        }
        return (n = this.IIlIlIlIIlllIIIlIIIIlIIIl()) == 3 ? "mob.horse.zombie.idle" : (n == 4 ? "mob.horse.skeleton.idle" : (n != 1 && n != 2 ? "mob.horse.idle" : "mob.horse.donkey.idle"));
    }

    protected String IIllllllllIlllIIllllllllI() {
        this.IllllllIlIlIIlIIllllllIIl();
        this.lIIlIIlIlIIIIIlllIIIIIllI();
        int n = this.IIlIlIlIIlllIIIlIIIIlIIIl();
        return n != 3 && n != 4 ? (n != 1 && n != 2 ? "mob.horse.angry" : "mob.horse.donkey.angry") : null;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, Block class_05492) {
        class_1031 class_10312 = class_05492.llIIIlllIlllIlIllIIIIllIl;
        if (this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n, n2 + 1, n3) == Blocks.lIIllIIlIIIlllIlllIIlIIlI) {
            class_10312 = Blocks.lIIllIIlIIIlllIlllIIlIIlI.llIIIlllIlllIlIllIIIIllIl;
        }
        if (!class_05492.lIllllIIlIIIlIllllllIIIll().lllIIIllIIIIlllIlIIllIIll()) {
            int n4 = this.IIlIlIlIIlllIIIlIIIIlIIIl();
            if (this.lIlIlIIlIIIIlIIIIIlllIIII != null && n4 != 1 && n4 != 2) {
                ++this.IIlIlIlIIlllIIIlIIIIlIIIl;
                if (this.IIlIlIlIIlllIIIlIIIIlIIIl > 5 && this.IIlIlIlIIlllIIIlIIIIlIIIl % 3 == 0) {
                    this.lllIIIllIIIIlllIlIIllIIll("mob.horse.gallop", class_10312.IlIllllllIIlIIllllIIlIIIl() * 0.15f, class_10312.lIlllIlllIIIIlIIlllIllIII());
                    if (n4 == 0 && this.IlllIIlllllllIIllIlIllllI.nextInt(10) == 0) {
                        this.lllIIIllIIIIlllIlIIllIIll("mob.horse.breathe", class_10312.IlIllllllIIlIIllllIIlIIIl() * 0.6f, class_10312.lIlllIlllIIIIlIIlllIllIII());
                    }
                } else if (this.IIlIlIlIIlllIIIlIIIIlIIIl <= 5) {
                    this.lllIIIllIIIIlllIlIIllIIll("mob.horse.wood", class_10312.IlIllllllIIlIIllllIIlIIIl() * 0.15f, class_10312.lIlllIlllIIIIlIIlllIllIII());
                }
            } else if (class_10312 == Block.lIlllIlllIIIIlIIlllIllIII) {
                this.lllIIIllIIIIlllIlIIllIIll("mob.horse.wood", class_10312.IlIllllllIIlIIllllIIlIIIl() * 0.15f, class_10312.lIlllIlllIIIIlIIlllIllIII());
            } else {
                this.lllIIIllIIIIlllIlIIllIIll("mob.horse.soft", class_10312.IlIllllllIIlIIllllIIlIIIl() * 0.15f, class_10312.lIlllIlllIIIIlIIlllIllIII());
            }
        }
    }

    @Override
    protected void llIIlIllIllllIlIIIIlIIlll() {
        super.llIIlIllIllllIlIIIIlIIlll();
        this.lIlIllllIlIIIIIllIIIIlIlI().lllIlIIlIIIlIlIIIllIlllIl(lIIIlllllllIlllIIllllllll);
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll(53.0);
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII).lllIIIllIIIIlllIlIIllIIll(0.225f);
    }

    @Override
    public int llIIIlIIllIIllIllIIlIlllI() {
        return 6;
    }

    public int lIlIIlIIllIllllllIIIIlllI() {
        return 100;
    }

    @Override
    protected float IIlIlIIIIlIlllIlIlIIIIIlI() {
        return 0.8f;
    }

    @Override
    public int IIllIllIIllIIlllIIIlIlllI() {
        return 400;
    }

    public boolean lIllIllllIlIlIIlIllIlIIlI() {
        return this.IIlIlIlIIlllIIIlIIIIlIIIl() == 0 || this.llllIIIllIllIIIllIlIIIIIl() > 0;
    }

    private void llIIIIIIlIIllIllIIIIlIIlI() {
        this.lllIIIIlIIllIIIlIllIlllII = null;
    }

    private void lllIIllIlIlIlIllllIllIlll() {
        int n;
        this.lllIIIIlIIllIIIlIllIlllII = "horse/";
        this.IlIllIIIIllllIIllIllIIIIl[0] = null;
        this.IlIllIIIIllllIIllIllIIIIl[1] = null;
        this.IlIllIIIIllllIIllIllIIIIl[2] = null;
        int n2 = this.IIlIlIlIIlllIIIlIIIIlIIIl();
        int n3 = this.lllIIIIlIIllIIIlIllIlllII();
        if (n2 == 0) {
            n = n3 & 0xFF;
            int n4 = (n3 & 0xFF00) >> 8;
            this.IlIllIIIIllllIIllIllIIIIl[0] = lIlIllllIlIIIIIllIIIIlIlI[n];
            this.lllIIIIlIIllIIIlIllIlllII = this.lllIIIIlIIllIIIlIllIlllII + IIlllllIIlIIlIlIIlIIlIlII[n];
            this.IlIllIIIIllllIIllIllIIIIl[1] = IIlIlIIIIlIlllIlIlIIIIIlI[n4];
            this.lllIIIIlIIllIIIlIllIlllII = this.lllIIIIlIIllIIIlIllIlllII + IlIlIIllIlIlIIIIIlIlllllI[n4];
        } else {
            this.IlIllIIIIllllIIllIllIIIIl[0] = "";
            this.lllIIIIlIIllIIIlIllIlllII = this.lllIIIIlIIllIIIlIllIlllII + "_" + n2 + "_";
        }
        n = this.llllIIIllIllIIIllIlIIIIIl();
        this.IlIllIIIIllllIIllIllIIIIl[2] = IIllllIIlIlIlIlllIIIllIIl[n];
        this.lllIIIIlIIllIIIlIllIlllII = this.lllIIIIlIIllIIIlIllIlllII + IIIllIIIlIlllllllIIIlllll[n];
    }

    public String lllIllllllIIlIIllllIIllIl() {
        if (this.lllIIIIlIIllIIIlIllIlllII == null) {
            this.lllIIllIlIlIlIllllIllIlll();
        }
        return this.lllIIIIlIIllIIIlIllIlllII;
    }

    public String[] IIIllllllIlIlllIlIlIIIIll() {
        if (this.lllIIIIlIIllIIIlIllIlllII == null) {
            this.lllIIllIlIlIlIllllIllIlll();
        }
        return this.IlIllIIIIllllIIllIllIIIIl;
    }

    public void IIIllIIlIIIIIIlIlIIllIIlI(class_0814 class_08142) {
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && (this.lIlIlIIlIIIIlIIIIIlllIIII == null || this.lIlIlIIlIIIIlIIIIIlllIIII == class_08142) && this.lIlIlIIllIlIIIIIlIIlllIlI()) {
            this.lIlIIlIIlIIIIllIIlIllIlll.lllIIIllIIIIlllIlIIllIIll(this.llllIIIIlIIIlIIIIIIlIllll());
            class_08142.lllIIIllIIIIlllIlIIllIIll(this, this.lIlIIlIIlIIIIllIIlIllIlll);
        }
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII(class_0814 class_08142) {
        ItemStack class_08972 = class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll();
        if (class_08972 != null && class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.spawn_egg) {
            return super.lIlllIlllIIIIlIIlllIllIII(class_08142);
        }
        if (!this.lIlIlIIllIlIIIIIlIIlllIlI() && this.lIIIlIllIlIIlIIIllIIlIlll()) {
            return false;
        }
        if (this.lIlIlIIllIlIIIIIlIIlllIlI() && this.IlIllIIIIllllIIllIllIIIIl() && class_08142.IIlIIlIlIlIllIIlIlIIIIlll()) {
            this.IIIllIIlIIIIIIlIlIIllIIlI(class_08142);
            return true;
        }
        if (this.llllIllllllIllIIIlIlIIllI() && this.lIlIlIIlIIIIlIIIIIlllIIII != null) {
            return super.lIlllIlllIIIIlIIlllIllIII(class_08142);
        }
        if (class_08972 != null) {
            boolean bl = false;
            if (this.IIIIIIIllllllIIIIllIIIIII()) {
                int n = -1;
                if (class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.IlIllIIIIllllIIllIllIIIIl) {
                    n = 1;
                } else if (class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.lIlIlIIllIlIIIIIlIIlllIlI) {
                    n = 2;
                } else if (class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.llllIllllllIllIIIlIlIIllI) {
                    n = 3;
                }
                if (n >= 0) {
                    if (!this.lIlIlIIllIlIIIIIlIIlllIlI()) {
                        this.IIIlIlIIllllIlllllllIIlll();
                        return true;
                    }
                    this.IIIllIIlIIIIIIlIlIIllIIlI(class_08142);
                    return true;
                }
            }
            if (!bl && !this.lIIIlIllIlIIlIIIllIIlIlll()) {
                float f = 0.0f;
                int n = 0;
                int n2 = 0;
                if (class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.wheat) {
                    f = 2.0f;
                    n = 60;
                    n2 = 3;
                } else if (class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.llIIIlIIllIIllIllIIlIlllI) {
                    f = 1.0f;
                    n = 30;
                    n2 = 3;
                } else if (class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.bread) {
                    f = 7.0f;
                    n = 180;
                    n2 = 3;
                } else if (Block.lllIIIllIIIIlllIlIIllIIll(class_08972.lllIIIllIIIIlllIlIIllIIll()) == Blocks.lIlIllIIIlIlIlIlIIIllllll) {
                    f = 20.0f;
                    n = 180;
                } else if (class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.IlIIIIIllllllIIlllIllllll) {
                    f = 3.0f;
                    n = 60;
                    n2 = 3;
                } else if (class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.lIllIIlIlllIllIlIlIlIllII) {
                    f = 4.0f;
                    n = 60;
                    n2 = 5;
                    if (this.lIlIlIIllIlIIIIIlIIlllIlI() && this.u_() == 0) {
                        bl = true;
                        this.lIllllIIlIIIlIllllllIIIll(class_08142);
                    }
                } else if (class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.IlIIllIlIlIllIIIlIIlIlIIl) {
                    f = 10.0f;
                    n = 240;
                    n2 = 10;
                    if (this.lIlIlIIllIlIIIIIlIIlllIlI() && this.u_() == 0) {
                        bl = true;
                        this.lIllllIIlIIIlIllllllIIIll(class_08142);
                    }
                }
                if (this.lllIIIlllIlllIIlIllllIIlI() < this.IIllllIIlIlIlIlllIIIllIIl() && f > 0.0f) {
                    this.IlIllllllIIlIIllllIIlIIIl(f);
                    bl = true;
                }
                if (!this.IlIllIIIIllllIIllIllIIIIl() && n > 0) {
                    this.lllIIIllIIIIlllIlIIllIIll(n);
                    bl = true;
                }
                if (n2 > 0 && (bl || !this.lIlIlIIllIlIIIIIlIIlllIlI()) && n2 < this.lIlIIlIIllIllllllIIIIlllI()) {
                    bl = true;
                    this.IIlllIlIlllIllIIIlllIIlIl(n2);
                }
                if (bl) {
                    this.lIlIIIIlIllIllIlIIlllllII();
                }
            }
            if (!this.lIlIlIIllIlIIIIIlIIlllIlI() && !bl) {
                if (class_08972 != null && class_08972.lllIIIllIIIIlllIlIIllIIll(class_08142, (class_1965)this)) {
                    return true;
                }
                this.IIIlIlIIllllIlllllllIIlll();
                return true;
            }
            if (!bl && this.lIIIIIIIlllIllIlIlIlIllII() && !this.IIllllllIIllIlIllllIIIlll() && class_08972.lllIIIllIIIIlllIlIIllIIll() == Item.getItemFromBlock(Blocks.IllIlIlIIIlllIIllIIIIlIll)) {
                this.llIIlllIllIllllIIIlIIIIII(true);
                this.lllIIIllIIIIlllIlIIllIIll("mob.chickenplop", 1.0f, (this.IlllIIlllllllIIllIlIllllI.nextFloat() - this.IlllIIlllllllIIllIlIllllI.nextFloat()) * 0.2f + 1.0f);
                bl = true;
                this.llIllIllIllIIIIlIlllllIlI();
            }
            if (!bl && this.llllIllllllIllIIIlIlIIllI() && !this.IIIIlIIIIIIIllIlllIIlllII() && class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.saddle) {
                this.IIIllIIlIIIIIIlIlIIllIIlI(class_08142);
                return true;
            }
            if (bl) {
                if (!class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII && --class_08972.lllIlIIlIIIlIlIIIllIlllIl == 0) {
                    class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl(class_08142.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl, null);
                }
                return true;
            }
        }
        if (this.llllIllllllIllIIIlIlIIllI() && this.lIlIlIIlIIIIlIIIIIlllIIII == null) {
            if (class_08972 != null && class_08972.lllIIIllIIIIlllIlIIllIIll(class_08142, (class_1965)this)) {
                return true;
            }
            this.IIIllIllIIlIlIlIlIllllIIl(class_08142);
            return true;
        }
        return super.lIlllIlllIIIIlIIlllIllIII(class_08142);
    }

    private void IIIllIllIIlIlIlIlIllllIIl(class_0814 class_08142) {
        class_08142.IIIIlIllIlIIlIIlIllIlIlll = this.IIIIlIllIlIIlIIlIllIlIlll;
        class_08142.IlIlIIlllIllllllllIIIlIlI = this.IlIlIIlllIllllllllIIIlIlI;
        this.IlIlllIIIIIIlIIllIIllIlll(false);
        this.IlIlIIlIlIllIIlIlIIllIIIl(false);
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            class_08142.lllIIIllIIIIlllIlIIllIIll((class_1521)this);
        }
    }

    public boolean IIIIIIIllllllIIIIllIIIIII() {
        return this.IIlIlIlIIlllIIIlIIIIlIIIl() == 0;
    }

    public boolean lIIIIIIIlllIllIlIlIlIllII() {
        int n = this.IIlIlIlIIlllIIIlIIIIlIIIl();
        return n == 2 || n == 1;
    }

    @Override
    protected boolean lIlIIIlIlIllIlIlIIIlIlIII() {
        return this.lIlIlIIlIIIIlIIIIIlllIIII != null && this.IIIIlIIIIIIIllIlllIIlllII() ? true : this.lIlIllIIIlIlIlIlIIIllllll() || this.IllIIIIIllIIlllIlIIIlIlll();
    }

    public boolean lIIIlIllIlIIlIIIllIIlIlll() {
        int n = this.IIlIlIlIIlllIIIlIIIIlIIIl();
        return n == 3 || n == 4;
    }

    public boolean IIllllIIllIIIllllIIlIIIIl() {
        return this.lIIIlIllIlIIlIIIllIIlIlll() || this.IIlIlIlIIlllIIIlIIIIlIIIl() == 2;
    }

    @Override
    public boolean IlIllllllIIlIIllllIIlIIIl(ItemStack class_08972) {
        return false;
    }

    private void IllIIIlIIIllIIIlIIIllIIll() {
        this.lIIIlIllllIlllIIIIIllIIIl = 1;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582) {
        super.lllIIIllIIIIlllIlIIllIIll(class_00582);
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            this.IIlIllllIIllllIllllllIllI();
        }
    }

    @Override
    public void d_() {
        if (this.IlllIIlllllllIIllIlIllllI.nextInt(200) == 0) {
            this.IllIIIlIIIllIIIlIIIllIIll();
        }
        super.d_();
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            class_1627 class_16272;
            if (this.IlllIIlllllllIIllIlIllllI.nextInt(900) == 0 && this.lIlIIIllIIllIIlIllllllIll == 0) {
                this.IlIllllllIIlIIllllIIlIIIl(1.0f);
            }
            if (!this.lIlIllIIIlIlIlIlIIIllllll() && this.lIlIlIIlIIIIlIIIIIlllIIII == null && this.IlllIIlllllllIIllIlIllllI.nextInt(300) == 0 && this.lIlIllIIlIIlIIlIIlIIlIIll.a_(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI) - 1, MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl)) == Blocks.IlIllllllIIlIIllllIIlIIIl) {
                this.IlIlllIIIIIIlIIllIIllIlll(true);
            }
            if (this.lIlIllIIIlIlIlIlIIIllllll() && ++this.lIlIIIlIlIllIlIlIIIlIlIII > 50) {
                this.lIlIIIlIlIllIlIlIIIlIlIII = 0;
                this.IlIlllIIIIIIlIIllIIllIlll(false);
            }
            if (this.IllIlIIllIIllIlIIlIllIlIl() && !this.IlIllIIIIllllIIllIllIIIIl() && !this.lIlIllIIIlIlIlIlIIIllllll() && (class_16272 = this.lllIIIllIIIIlllIlIIllIIll((class_1521)this, 16.0)) != null && this.IlIIIIIllllllIIlllIllllll(class_16272) > 4.0) {
                class_2086 class_20862 = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this, class_16272, 16.0f, true, false, false, true);
                this.lllIIIllIIIIlllIlIIllIIll(class_20862);
            }
        }
    }

    @Override
    public void s_() {
        super.s_();
        if (this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll()) {
            this.IlIlIllIIlIIIIlllIlIllIlI.IlIIIIIllllllIIlllIllllll();
            this.llIIIIIIlIIllIllIIIIlIIlI();
        }
        if (this.lIllIIlIlllIllIlIlIlIllII > 0 && ++this.lIllIIlIlllIllIlIlIlIllII > 30) {
            this.lIllIIlIlllIllIlIlIlIllII = 0;
            this.lllIlIIlIIIlIlIIIllIlllIl(128, false);
        }
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && this.IIIIIllIIlIlIlIIlIlIlIllI > 0 && ++this.IIIIIllIIlIlIlIIlIlIlIllI > 20) {
            this.IIIIIllIIlIlIlIIlIlIlIllI = 0;
            this.IlIlIIlIlIllIIlIlIIllIIIl(false);
        }
        if (this.lIIIlIllllIlllIIIIIllIIIl > 0 && ++this.lIIIlIllllIlllIIIIIllIIIl > 8) {
            this.lIIIlIllllIlllIIIIIllIIIl = 0;
        }
        if (this.lllIIIlllIlllIIlIllllIIlI > 0) {
            ++this.lllIIIlllIlllIIlIllllIIlI;
            if (this.lllIIIlllIlllIIlIllllIIlI > 300) {
                this.lllIIIlllIlllIIlIllllIIlI = 0;
            }
        }
        this.llIlllllIIlIIlIIllllIllll = this.llllIllIIIlIllIllllllIlIl;
        if (this.lIlIllIIIlIlIlIlIIIllllll()) {
            this.llllIllIIIlIllIllllllIlIl += (1.0f - this.llllIllIIIlIllIllllllIlIl) * 0.4f + 0.05f;
            if (this.llllIllIIIlIllIllllllIlIl > 1.0f) {
                this.llllIllIIIlIllIllllllIlIl = 1.0f;
            }
        } else {
            this.llllIllIIIlIllIllllllIlIl += (0.0f - this.llllIllIIIlIllIllllllIlIl) * 0.4f - 0.05f;
            if (this.llllIllIIIlIllIllllllIlIl < 0.0f) {
                this.llllIllIIIlIllIllllllIlIl = 0.0f;
            }
        }
        this.lllIIIlIllIlllIlIIllIllIl = this.lIllIlIlIIIIlIlIIlIlIlllI;
        if (this.IllIIIIIllIIlllIlIIIlIlll()) {
            this.llllIllIIIlIllIllllllIlIl = 0.0f;
            this.llIlllllIIlIIlIIllllIllll = 0.0f;
            this.lIllIlIlIIIIlIlIIlIlIlllI += (1.0f - this.lIllIlIlIIIIlIlIIlIlIlllI) * 0.4f + 0.05f;
            if (this.lIllIlIlIIIIlIlIIlIlIlllI > 1.0f) {
                this.lIllIlIlIIIIlIlIIlIlIlllI = 1.0f;
            }
        } else {
            this.lllIlllllIllIlIIlIlIIIlll = false;
            this.lIllIlIlIIIIlIlIIlIlIlllI += (0.8f * this.lIllIlIlIIIIlIlIIlIlIlllI * this.lIllIlIlIIIIlIlIIlIlIlllI * this.lIllIlIlIIIIlIlIIlIlIlllI - this.lIllIlIlIIIIlIlIIlIlIlllI) * 0.6f - 0.05f;
            if (this.lIllIlIlIIIIlIlIIlIlIlllI < 0.0f) {
                this.lIllIlIlIIIIlIlIIlIlIlllI = 0.0f;
            }
        }
        this.lIllIIlllIIIlIlIIIlllIlIl = this.IIlIlIIIIlIlllIIlIIlIIIII;
        if (this.llIIlIllIllllIlIIIIlIIlll(128)) {
            this.IIlIlIIIIlIlllIIlIIlIIIII += (1.0f - this.IIlIlIIIIlIlllIIlIIlIIIII) * 0.7f + 0.05f;
            if (this.IIlIlIIIIlIlllIIlIIlIIIII > 1.0f) {
                this.IIlIlIIIIlIlllIIlIIlIIIII = 1.0f;
            }
        } else {
            this.IIlIlIIIIlIlllIIlIIlIIIII += (0.0f - this.IIlIlIIIIlIlllIIlIIlIIIII) * 0.7f - 0.05f;
            if (this.IIlIlIIIIlIlllIIlIIlIIIII < 0.0f) {
                this.IIlIlIIIIlIlllIIlIIlIIIII = 0.0f;
            }
        }
    }

    private void IllllllIlIlIIlIIllllllIIl() {
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            this.lIllIIlIlllIllIlIlIlIllII = 1;
            this.lllIlIIlIIIlIlIIIllIlllIl(128, true);
        }
    }

    private boolean lIIlIlllIlllllIlllIllIIII() {
        return this.lIlIlIIlIIIIlIIIIIlllIIII == null && this.IlIIIlIIIIllIIIllIIIIIIll == null && this.lIlIlIIllIlIIIIIlIIlllIlI() && this.IlIllIIIIllllIIllIllIIIIl() && !this.IIllllIIllIIIllllIIlIIIIl() && this.lllIIIlllIlllIIlIllllIIlI() >= this.IIllllIIlIlIlIlllIIIllIIl();
    }

    @Override
    public void lIllllIIlIIIlIllllllIIIll(boolean bl) {
        this.lllIlIIlIIIlIlIIIllIlllIl(32, bl);
    }

    public void IlIlllIIIIIIlIIllIIllIlll(boolean bl) {
        this.lIllllIIlIIIlIllllllIIIll(bl);
    }

    public void IlIlIIlIlIllIIlIlIIllIIIl(boolean bl) {
        if (bl) {
            this.IlIlllIIIIIIlIIllIIllIlll(false);
        }
        this.lllIlIIlIIIlIlIIIllIlllIl(64, bl);
    }

    private void lIIlIIlIlIIIIIlllIIIIIllI() {
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            this.IIIIIllIIlIlIlIIlIlIlIllI = 1;
            this.IlIlIIlIlIllIIlIlIIllIIIl(true);
        }
    }

    public void IIIlIlIIllllIlllllllIIlll() {
        this.lIIlIIlIlIIIIIlllIIIIIllI();
        String string = this.IIllllllllIlllIIllllllllI();
        if (string != null) {
            this.lllIIIllIIIIlllIlIIllIIll(string, this.IIlIlIIIIlIlllIlIlIIIIIlI(), this.IlIlIIllIlIlIIIIIlIlllllI());
        }
    }

    public void IIlIllllIIllllIllllllIllI() {
        this.lllIIIllIIIIlllIlIIllIIll((class_1521)this, this.lIlIIlIIlIIIIllIIlIllIlll);
        this.lIIIlIIllIlIIIlIlIlIlIllI();
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, class_0583 class_05832) {
        if (class_05832 != null && !this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            for (int i = 0; i < class_05832.IlIIIIIllllllIIlllIllllll(); ++i) {
                ItemStack class_08972 = class_05832.llIIllIllIlIIlIIllIllllll(i);
                if (class_08972 == null) continue;
                this.lllIIIllIIIIlllIlIIllIIll(class_08972, 0.0f);
            }
        }
    }

    public boolean IllIIlllllllIIlIIlIIIIlIl(class_0814 class_08142) {
        this.lllIlIIlIIIlIlIIIllIlllIl(class_08142.lIIlllIIlIlIlIIIlIlllIIll().toString());
        this.IIIllIllIIlIlIlIlIllllIIl(true);
        return true;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2) {
        if (this.lIlIlIIlIIIIlIIIIIlllIIII != null && this.lIlIlIIlIIIIlIIIIIlllIIII instanceof class_1965 && this.IIIIlIIIIIIIllIlllIIlllII()) {
            this.llllIIIIlIIIlIIIIIIlIllll = this.IIIIlIllIlIIlIIlIllIlIlll = this.lIlIlIIlIIIIlIIIIIlllIIII.IIIIlIllIlIIlIIlIllIlIlll;
            this.IlIlIIlllIllllllllIIIlIlI = this.lIlIlIIlIIIIlIIIIIlllIIII.IlIlIIlllIllllllllIIIlIlI * 0.5f;
            this.lIllllIIlIIIlIllllllIIIll(this.IIIIlIllIlIIlIIlIllIlIlll, this.IlIlIIlllIllllllllIIIlIlI);
            this.lIIllllIllIlllllIIllIllIl = this.lllllIllllIIIIllIIlIlIlII = this.IIIIlIllIlIIlIIlIllIlIlll;
            f = ((class_1965)this.lIlIlIIlIIIIlIIIIIlllIIII).IlllIIIlIIlIIIIllllIllllI * 0.5f;
            f2 = ((class_1965)this.lIlIlIIlIIIIlIIIIIlllIIII).llIlIIIlllIIIllIllllIIIll;
            if (f2 <= 0.0f) {
                f2 *= 0.25f;
                this.IIlIlIlIIlllIIIlIIIIlIIIl = 0;
            }
            if (this.llllllIlIllllIlIlIlIIIIlI && this.lIIlIlIIIIIllIIIIllIlIlII == 0.0f && this.IllIIIIIllIIlllIlIIIlIlll() && !this.lllIlllllIllIlIIlIlIIIlll) {
                f = 0.0f;
                f2 = 0.0f;
            }
            if (this.lIIlIlIIIIIllIIIIllIlIlII > 0.0f && !this.IlIlIIlllIIlIlllllIlIIIIl() && this.llllllIlIllllIlIlIlIIIIlI) {
                this.IIlIIlIlIlIllIIlIlIIIIlll = this.IIIlIlIIlIIlIlIIIIIlIlIlI() * (double)this.lIIlIlIIIIIllIIIIllIlIlII;
                if (this.lllIIIllIIIIlllIlIIllIIll(class_0700.IllIIIllIIIIlIlIlIllIIlll)) {
                    this.IIlIIlIlIlIllIIlIlIIIIlll += (double)((float)(this.lllIlIIlIIIlIlIIIllIlllIl(class_0700.IllIIIllIIIIlIlIlIllIIlll).IlIllllllIIlIIllllIIlIIIl() + 1) * 0.1f);
                }
                this.IllIIIllIIIIlIlIlIllIIlll(true);
                this.lIIlIlIIllIIIlIIlIlIIIlII = true;
                if (f2 > 0.0f) {
                    float f3 = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IIIIlIllIlIIlIIlIllIlIlll * (float)Math.PI / 180.0f);
                    float f4 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(this.IIIIlIllIlIIlIIlIllIlIlll * (float)Math.PI / 180.0f);
                    this.IIIIIIIIlIllIIllIIlllIllI += (double)(-0.4f * f3 * this.lIIlIlIIIIIllIIIIllIlIlII);
                    this.llIIIlllIlllIlIllIIIIllIl += (double)(0.4f * f4 * this.lIIlIlIIIIIllIIIIllIlIlII);
                    this.lllIIIllIIIIlllIlIIllIIll("mob.horse.jump", 0.4f, 1.0f);
                }
                this.lIIlIlIIIIIllIIIIllIlIlII = 0.0f;
            }
            this.IllIlIlIIIlllIIllIIIIlIll = 1.0f;
            this.llllIIllllIllIlllllIIlIlI = this.lIllIIlIlllIllIlIlIlIllII() * 0.1f;
            if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
                this.IIIllIllIIlIlIlIlIllllIIl((float)this.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII).IlIIIIIllllllIIlllIllllll());
                super.lllIIIllIIIIlllIlIIllIIll(f, f2);
            }
            if (this.llllllIlIllllIlIlIlIIIIlI) {
                this.lIIlIlIIIIIllIIIIllIlIlII = 0.0f;
                this.IllIIIllIIIIlIlIlIllIIlll(false);
            }
            this.IIIIlllIIlIllllllIllIIlll = this.IIIIIIlIIIIIIIIIIlIlIlIlI;
            double d = this.IlIIlllllIIlIlIlllllIllll - this.llIIlIllIllllIlIIIIlIIlll;
            double d2 = this.IllIIIIllIIllIllIlllIlIIl - this.lIlllIlllIlIIIIlllIlIlIIl;
            float f5 = MathHelper.lllIIIllIIIIlllIlIIllIIll(d * d + d2 * d2) * 4.0f;
            if (f5 > 1.0f) {
                f5 = 1.0f;
            }
            this.IIIIIIlIIIIIIIIIIlIlIlIlI += (f5 - this.IIIIIIlIIIIIIIIIIlIlIlIlI) * 0.4f;
            this.IllIlllIIIlllllIllIIlIlIl += this.IIIIIIlIIIIIIIIIIlIlIlIlI;
        } else {
            this.IllIlIlIIIlllIIllIIIIlIll = 0.5f;
            this.llllIIllllIllIlllllIIlIlI = 0.02f;
            super.lllIIIllIIIIlllIlIIllIIll(f, f2);
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("EatingHaystack", this.lIlIllIIIlIlIlIlIIIllllll());
        class_07752.lllIIIllIIIIlllIlIIllIIll("ChestedHorse", this.IIllllllIIllIlIllllIIIlll());
        class_07752.lllIIIllIIIIlllIlIIllIIll("HasReproduced", this.IllIIlIIlIIIIlIlIlIIlIlIl());
        class_07752.lllIIIllIIIIlllIlIIllIIll("Bred", this.IllIlIIllIIllIlIIlIllIlIl());
        class_07752.lllIIIllIIIIlllIlIIllIIll("Type", this.IIlIlIlIIlllIIIlIIIIlIIIl());
        class_07752.lllIIIllIIIIlllIlIIllIIll("Variant", this.lllIIIIlIIllIIIlIllIlllII());
        class_07752.lllIIIllIIIIlllIlIIllIIll("Temper", this.lllIlIlIIIlIllllIlllIlIlI());
        class_07752.lllIIIllIIIIlllIlIIllIIll("Tame", this.lIlIlIIllIlIIIIIlIIlllIlI());
        class_07752.lllIIIllIIIIlllIlIIllIIll("OwnerUUID", this.IIlIlIIIlIIllIlIlIlIlIIll());
        if (this.IIllllllIIllIlIllllIIIlll()) {
            class_2145 class_21452 = new class_2145();
            for (int i = 2; i < this.lIlIIlIIlIIIIllIIlIllIlll.IlIIIIIllllllIIlllIllllll(); ++i) {
                ItemStack class_08972 = this.lIlIIlIIlIIIIllIIlIllIlll.llIIllIllIlIIlIIllIllllll(i);
                if (class_08972 == null) continue;
                class_0775 class_07753 = new class_0775();
                class_07753.lllIIIllIIIIlllIlIIllIIll("Slot", (byte)i);
                class_08972.lllIlIIlIIIlIlIIIllIlllIl(class_07753);
                class_21452.lllIIIllIIIIlllIlIIllIIll(class_07753);
            }
            class_07752.lllIIIllIIIIlllIlIIllIIll("net.minecraft.init.Items", class_21452);
        }
        if (this.lIlIIlIIlIIIIllIIlIllIlll.llIIllIllIlIIlIIllIllllll(1) != null) {
            class_07752.lllIIIllIIIIlllIlIIllIIll("ArmorItem", this.lIlIIlIIlIIIIllIIlIllIlll.llIIllIllIlIIlIIllIllllll(1).lllIlIIlIIIlIlIIIllIlllIl(new class_0775()));
        }
        if (this.lIlIIlIIlIIIIllIIlIllIlll.llIIllIllIlIIlIIllIllllll(0) != null) {
            class_07752.lllIIIllIIIIlllIlIIllIIll("SaddleItem", this.lIlIIlIIlIIIIllIIlIllIlll.llIIllIllIlIIlIIllIllllll(0).lllIlIIlIIIlIlIIIllIlllIl(new class_0775()));
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        Object object;
        class_1685 class_16852;
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        this.IlIlllIIIIIIlIIllIIllIlll(class_07752.lllIIlIIIllllllIIIIlIlIlI("EatingHaystack"));
        this.lIIIIlIlIIlllllIIllIIlIII(class_07752.lllIIlIIIllllllIIIIlIlIlI("Bred"));
        this.llIIlllIllIllllIIIlIIIIII(class_07752.lllIIlIIIllllllIIIIlIlIlI("ChestedHorse"));
        this.llIIllIllIlIIlIIllIllllll(class_07752.lllIIlIIIllllllIIIIlIlIlI("HasReproduced"));
        this.lIIlIIIIIlIlllIlIIlIlIlll(class_07752.lIllllIIlIIIlIllllllIIIll("Type"));
        this.lIlIlIIlIIIIlIIIIIlllIIII(class_07752.lIllllIIlIIIlIllllllIIIll("Variant"));
        this.IlIIIlIIIIllIIIllIIIIIIll(class_07752.lIllllIIlIIIlIllllllIIIll("Temper"));
        this.IIIllIllIIlIlIlIlIllllIIl(class_07752.lllIIlIIIllllllIIIIlIlIlI("Tame"));
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("OwnerUUID", 8)) {
            this.lllIlIIlIIIlIlIIIllIlllIl(class_07752.IllIIIllIIIIlIlIlIllIIlll("OwnerUUID"));
        }
        if ((class_16852 = this.lIlIllllIlIIIIIllIIIIlIlI().lllIIIllIIIIlllIlIIllIIll("Speed")) != null) {
            this.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII).lllIIIllIIIIlllIlIIllIIll(class_16852.lllIlIIlIIIlIlIIIllIlllIl() * 0.25);
        }
        if (this.IIllllllIIllIlIllllIIIlll()) {
            object = class_07752.IlIllllllIIlIIllllIIlIIIl("net.minecraft.init.Items", 10);
            this.llIllIllIllIIIIlIlllllIlI();
            for (int i = 0; i < ((class_2145)object).lIlllIlllIIIIlIIlllIllIII(); ++i) {
                class_0775 class_07753 = ((class_2145)object).lllIlIIlIIIlIlIIIllIlllIl(i);
                int n = class_07753.lIlllIlllIIIIlIIlllIllIII("Slot") & 0xFF;
                if (n < 2 || n >= this.lIlIIlIIlIIIIllIIlIllIlll.IlIIIIIllllllIIlllIllllll()) continue;
                this.lIlIIlIIlIIIIllIIlIllIlll.lllIlIIlIIIlIlIIIllIlllIl(n, ItemStack.lllIIIllIIIIlllIlIIllIIll(class_07753));
            }
        }
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("ArmorItem", 10) && (object = ItemStack.lllIIIllIIIIlllIlIIllIIll(class_07752.llIIllIllIlIIlIIllIllllll("ArmorItem"))) != null && class_1627.lllIIIllIIIIlllIlIIllIIll(((ItemStack)object).lllIIIllIIIIlllIlIIllIIll())) {
            this.lIlIIlIIlIIIIllIIlIllIlll.lllIlIIlIIIlIlIIIllIlllIl(1, (ItemStack)object);
        }
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("SaddleItem", 10)) {
            object = ItemStack.lllIIIllIIIIlllIlIIllIIll(class_07752.llIIllIllIlIIlIIllIllllll("SaddleItem"));
            if (object != null && ((ItemStack)object).lllIIIllIIIIlllIlIIllIIll() == Items.saddle) {
                this.lIlIIlIIlIIIIllIIlIllIlll.lllIlIIlIIIlIlIIIllIlllIl(0, (ItemStack)object);
            }
        } else if (class_07752.lllIIlIIIllllllIIIIlIlIlI("Saddle")) {
            this.lIlIIlIIlIIIIllIIlIllIlll.lllIlIIlIIIlIlIIIllIlllIl(0, new ItemStack(Items.saddle));
        }
        this.IIllIlIIlIIlIlllIIllIllll();
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0003 class_00032) {
        if (class_00032 == this) {
            return false;
        }
        if (class_00032.getClass() != this.getClass()) {
            return false;
        }
        class_1627 class_16272 = (class_1627)class_00032;
        if (this.lIIlIlllIlllllIlllIllIIII() && class_16272.lIIlIlllIlllllIlllIllIIII()) {
            int n;
            int n2 = this.IIlIlIlIIlllIIIlIIIIlIIIl();
            return n2 == (n = class_16272.IIlIlIlIIlllIIIlIIIIlIIIl()) || n2 == 0 && n == 1 || n2 == 1 && n == 0;
        }
        return false;
    }

    @Override
    public class_0650 lllIIIllIIIIlllIlIIllIIll(class_0650 class_06502) {
        class_1627 class_16272 = (class_1627)class_06502;
        class_1627 class_16273 = new class_1627(this.lIlIllIIlIIlIIlIIlIIlIIll);
        int n = this.IIlIlIlIIlllIIIlIIIIlIIIl();
        int n2 = class_16272.IIlIlIlIIlllIIIlIIIIlIIIl();
        int n3 = 0;
        if (n == n2) {
            n3 = n;
        } else if (n == 0 && n2 == 1 || n == 1 && n2 == 0) {
            n3 = 2;
        }
        if (n3 == 0) {
            int n4 = this.IlllIIlllllllIIllIlIllllI.nextInt(9);
            int n5 = n4 < 4 ? this.lllIIIIlIIllIIIlIllIlllII() & 0xFF : (n4 < 8 ? class_16272.lllIIIIlIIllIIIlIllIlllII() & 0xFF : this.IlllIIlllllllIIllIlIllllI.nextInt(7));
            int n6 = this.IlllIIlllllllIIllIlIllllI.nextInt(5);
            n5 = n6 < 2 ? (n5 |= this.lllIIIIlIIllIIIlIllIlllII() & 0xFF00) : (n6 < 4 ? (n5 |= class_16272.lllIIIIlIIllIIIlIllIlllII() & 0xFF00) : (n5 |= this.IlllIIlllllllIIllIlIllllI.nextInt(5) << 8 & 0xFF00));
            class_16273.lIlIlIIlIIIIlIIIIIlllIIII(n5);
        }
        class_16273.lIIlIIIIIlIlllIlIIlIlIlll(n3);
        double d = this.lllIIIllIIIIlllIlIIllIIll(class_1152.lllIIIllIIIIlllIlIIllIIll).lllIlIIlIIIlIlIIIllIlllIl() + class_06502.lllIIIllIIIIlllIlIIllIIll(class_1152.lllIIIllIIIIlllIlIIllIIll).lllIlIIlIIIlIlIIIllIlllIl() + (double)this.IIllllIIlIllIIIIllIIIIllI();
        class_16273.lllIIIllIIIIlllIlIIllIIll(class_1152.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll(d / 3.0);
        double d2 = this.lllIIIllIIIIlllIlIIllIIll(lIIIlllllllIlllIIllllllll).lllIlIIlIIIlIlIIIllIlllIl() + class_06502.lllIIIllIIIIlllIlIIllIIll(lIIIlllllllIlllIIllllllll).lllIlIIlIIIlIlIIIllIlllIl() + this.lIIIlIIlIIlllIIlIlIIIIllI();
        class_16273.lllIIIllIIIIlllIlIIllIIll(lIIIlllllllIlllIIllllllll).lllIIIllIIIIlllIlIIllIIll(d2 / 3.0);
        double d3 = this.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII).lllIlIIlIIIlIlIIIllIlllIl() + class_06502.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII).lllIlIIlIIIlIlIIIllIlllIl() + this.lIlIllIlIIllIlIIIllIlIIlI();
        class_16273.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII).lllIIIllIIIIlllIlIIllIIll(d3 / 3.0);
        return class_16273;
    }

    @Override
    public class_2025 lllIIIllIIIIlllIlIIllIIll(class_2025 class_20252) {
        int n;
        class_2025 class_20253 = super.lllIIIllIIIIlllIlIIllIIll(class_20252);
        boolean bl = false;
        int n2 = 0;
        if (class_20253 instanceof class_2002) {
            n = ((class_2002)class_20253).lllIIIllIIIIlllIlIIllIIll;
            n2 = ((class_2002)class_20253).lllIlIIlIIIlIlIIIllIlllIl & 0xFF | this.IlllIIlllllllIIllIlIllllI.nextInt(5) << 8;
        } else {
            if (this.IlllIIlllllllIIllIlIllllI.nextInt(10) == 0) {
                n = 1;
            } else {
                int n3 = this.IlllIIlllllllIIllIlIllllI.nextInt(7);
                int n4 = this.IlllIIlllllllIIllIlIllllI.nextInt(5);
                n = 0;
                n2 = n3 | n4 << 8;
            }
            class_20253 = new class_2002(n, n2);
        }
        this.lIIlIIIIIlIlllIlIIlIlIlll(n);
        this.lIlIlIIlIIIIlIIIIIlllIIII(n2);
        if (this.IlllIIlllllllIIllIlIllllI.nextInt(5) == 0) {
            this.lllIlIIlIIIlIlIIIllIlllIl(-24000);
        }
        if (n != 4 && n != 3) {
            this.lllIIIllIIIIlllIlIIllIIll(class_1152.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll(this.IIllllIIlIllIIIIllIIIIllI());
            if (n == 0) {
                this.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII).lllIIIllIIIIlllIlIIllIIll(this.lIlIllIlIIllIlIIIllIlIIlI());
            } else {
                this.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII).lllIIIllIIIIlllIlIIllIIll(0.175f);
            }
        } else {
            this.lllIIIllIIIIlllIlIIllIIll(class_1152.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll(15.0);
            this.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII).lllIIIllIIIIlllIlIIllIIll(0.2f);
        }
        if (n != 2 && n != 1) {
            this.lllIIIllIIIIlllIlIIllIIll(lIIIlllllllIlllIIllllllll).lllIIIllIIIIlllIlIIllIIll(this.lIIIlIIlIIlllIIlIlIIIIllI());
        } else {
            this.lllIIIllIIIIlllIlIIllIIll(lIIIlllllllIlllIIllllllll).lllIIIllIIIIlllIlIIllIIll(0.5);
        }
        this.IllIIIllIIIIlIlIlIllIIlll(this.IIllllIIlIlIlIlllIIIllIIl());
        return class_20253;
    }

    public float IlIlIIlIlIllIIlIlIIllIIIl(float f) {
        return this.llIlllllIIlIIlIIllllIllll + (this.llllIllIIIlIllIllllllIlIl - this.llIlllllIIlIIlIIllllIllll) * f;
    }

    public float lllllIlllIIllIlIIlIIIllII(float f) {
        return this.lllIIIlIllIlllIlIIllIllIl + (this.lIllIlIlIIIIlIlIIlIlIlllI - this.lllIIIlIllIlllIlIIllIllIl) * f;
    }

    public float IlIlIIlllIIlIllIIIlllllIl(float f) {
        return this.lIllIIlllIIIlIlIIIlllIlIl + (this.IIlIlIIIIlIlllIIlIIlIIIII - this.lIllIIlllIIIlIlIIIlllIlIl) * f;
    }

    @Override
    protected boolean IIIIlllIIlIllllllIllIIlll() {
        return true;
    }

    public void lIlIllIIlIIlIIlIIlIIlIIll(int n) {
        if (this.IIIIlIIIIIIIllIlllIIlllII()) {
            if (n < 0) {
                n = 0;
            } else {
                this.lllIlllllIllIlIIlIlIIIlll = true;
                this.lIIlIIlIlIIIIIlllIIIIIllI();
            }
            this.lIIlIlIIIIIllIIIIllIlIlII = n >= 90 ? 1.0f : 0.4f + 0.4f * (float)n / 90.0f;
        }
    }

    protected void lllllIlllIIllIlIIlIIIllII(boolean bl) {
        String string = bl ? "heart" : "smoke";
        for (int i = 0; i < 7; ++i) {
            double d = this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 0.02;
            double d2 = this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 0.02;
            double d3 = this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 0.02;
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(string, this.IlIIlllllIIlIlIlllllIllll + (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * this.IIIIlIlIIlIIIIlIlllIlIIII * 2.0f) - (double)this.IIIIlIlIIlIIIIlIlllIlIIII, this.llIIlIlIlllIIllIlIlllIllI + 0.5 + (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * this.lllIIIIlIlIIlIIlllIIIIIIl), this.IllIIIIllIIllIllIlllIlIIl + (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * this.IIIIlIlIIlIIIIlIlllIlIIII * 2.0f) - (double)this.IIIIlIlIIlIIIIlIlllIlIIII, d, d2, d3);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(byte by) {
        if (by == 7) {
            this.lllllIlllIIllIlIIlIIIllII(true);
        } else if (by == 6) {
            this.lllllIlllIIllIlIIlIIIllII(false);
        } else {
            super.lllIIIllIIIIlllIlIIllIIll(by);
        }
    }

    @Override
    public void IIIlIlIllIlllllIlIllllllI() {
        super.IIIlIlIllIlllllIlIllllllI();
        if (this.lllIIIlIllIlllIlIIllIllIl > 0.0f) {
            float f = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.lllllIllllIIIIllIIlIlIlII * (float)Math.PI / 180.0f);
            float f2 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(this.lllllIllllIIIIllIIlIlIlII * (float)Math.PI / 180.0f);
            float f3 = 0.7f * this.lllIIIlIllIlllIlIIllIllIl;
            float f4 = 0.15f * this.lllIIIlIllIlllIlIIllIllIl;
            this.lIlIlIIlIIIIlIIIIIlllIIII.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll + (double)(f3 * f), this.llIIlIlIlllIIllIlIlllIllI + this.llllIlIIllIIlllllIIllIIll() + this.lIlIlIIlIIIIlIIIIIlllIIII.IIIIlIllIlIIIIIllllIIlllI() + (double)f4, this.IllIIIIllIIllIllIlllIlIIl - (double)(f3 * f2));
            if (this.lIlIlIIlIIIIlIIIIIlllIIII instanceof class_1965) {
                ((class_1965)this.lIlIlIIlIIIIlIIIIIlllIIII).lllllIllllIIIIllIIlIlIlII = this.lllllIllllIIIIllIIlIlIlII;
            }
        }
    }

    private float IIllllIIlIllIIIIllIIIIllI() {
        return 15.0f + (float)this.IlllIIlllllllIIllIlIllllI.nextInt(8) + (float)this.IlllIIlllllllIIllIlIllllI.nextInt(9);
    }

    private double lIIIlIIlIIlllIIlIlIIIIllI() {
        return (double)0.4f + this.IlllIIlllllllIIllIlIllllI.nextDouble() * 0.2 + this.IlllIIlllllllIIllIlIllllI.nextDouble() * 0.2 + this.IlllIIlllllllIIllIlIllllI.nextDouble() * 0.2;
    }

    private double lIlIllIlIIllIlIIIllIlIIlI() {
        return ((double)0.45f + this.IlllIIlllllllIIllIlIllllI.nextDouble() * 0.3 + this.IlllIIlllllllIIllIlIllllI.nextDouble() * 0.3 + this.IlllIIlllllllIIllIlIllllI.nextDouble() * 0.3) * 0.25;
    }

    public static boolean lllIIIllIIIIlllIlIIllIIll(Item class_06112) {
        return class_06112 == Items.IlIllIIIIllllIIllIllIIIIl || class_06112 == Items.lIlIlIIllIlIIIIIlIIlllIlI || class_06112 == Items.llllIllllllIllIIIlIlIIllI;
    }

    @Override
    public boolean h_() {
        return false;
    }
}

