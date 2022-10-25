package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.Random;

public class class_1709
extends class_2257 {
    public class_1709() {
        super(class_1855.lllllIlllIIllIlIIlIIIllII);
        this.lIlllIlllIlIIIIlllIlIlIIl();
    }

    @Override
    public void lIlllIlllIlIIIIlllIlIlIIl() {
        float f = 0.375f;
        float f2 = f / 2.0f;
        this.lllIIIllIIIIlllIlIIllIIll(0.5f - f2, 0.0f, 0.5f - f2, 0.5f + f2, f, 0.5f + f2);
    }

    @Override
    public boolean IlIlllIIIIIIlIIllIIllIlll() {
        return false;
    }

    @Override
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return 33;
    }

    @Override
    public boolean IllIIIllIIIIlIlIlIllIIlll() {
        return false;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142, int n4, float f, float f2, float f3) {
        ItemStack class_08972 = class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll();
        if (class_08972 != null && class_08972.lllIIIllIIIIlllIlIIllIIll() instanceof class_1272) {
            class_0461 class_04612 = this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3);
            if (class_04612 != null) {
                if (class_04612.lllIIIllIIIIlllIlIIllIIll() != null) {
                    return false;
                }
                Block class_05492 = Block.lllIIIllIIIIlllIlIIllIIll(class_08972.lllIIIllIIIIlllIlIIllIIll());
                if (!this.lllIIIllIIIIlllIlIIllIIll(class_05492, class_08972.IllIIIllIIIIlIlIlIllIIlll())) {
                    return false;
                }
                class_04612.lllIIIllIIIIlllIlIIllIIll(class_08972.lllIIIllIIIIlllIlIIllIIll(), class_08972.IllIIIllIIIIlIlIlIllIIlll());
                class_04612.llIIlIllIllllIlIIIIlIIlll();
                if (!class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, class_08972.IllIIIllIIIIlIlIlIllIIlll(), 2)) {
                    class_13342.IIIllIIlIIIIIIlIlIIllIIlI(n, n2, n3);
                }
                if (!class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII && --class_08972.lllIlIIlIIIlIlIIIllIlllIl <= 0) {
                    class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl(class_08142.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl, null);
                }
                return true;
            }
            return false;
        }
        return false;
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(Block class_05492, int n) {
        return class_05492 != Blocks.llIlllIIllIlllIlIlIlIIIll && class_05492 != Blocks.IIIIlIIlIIIllIIIIllIIIlII && class_05492 != Blocks.IIIIIllIlIllIlIlIIlIllIIl && class_05492 != Blocks.lllIIIIIIlIlllIIlIlIIIllI && class_05492 != Blocks.llIIlIIllIIllIlIIllIIllII && class_05492 != Blocks.IIIllIIlIIIIIIlIlIIllIIlI && class_05492 != Blocks.llllIIIIlIIIlIIIIIIlIllll ? class_05492 == Blocks.IlIlIIlllIllllllllIIIlIlI && n == 2 : true;
    }

    @Override
    public Item IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3) {
        class_0461 class_04612 = this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3);
        return class_04612 != null && class_04612.lllIIIllIIIIlllIlIIllIIll() != null ? class_04612.lllIIIllIIIIlllIlIIllIIll() : Items.lIlIlllIllllIIlllIlllIIIl;
    }

    @Override
    public int IllIIlllllllIIlIIlIIIIlIl(class_1334 class_13342, int n, int n2, int n3) {
        class_0461 class_04612 = this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3);
        return class_04612 != null && class_04612.lllIIIllIIIIlllIlIIllIIll() != null ? class_04612.IlIIIIIllllllIIlllIllllll() : 0;
    }

    @Override
    public boolean llllIIIIlIIIlIIIIIIlIllll() {
        return true;
    }

    @Override
    public boolean IlIIIIIllllllIIlllIllllll(class_1334 class_13342, int n, int n2, int n3) {
        return super.IlIIIIIllllllIIlllIllllll(class_13342, n, n2, n3) && class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 - 1, n3);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        if (!class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 - 1, n3)) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3), 0);
            class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492, int n4) {
        class_0461 class_04612 = this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3);
        if (class_04612 != null && class_04612.lllIIIllIIIIlllIlIIllIIll() != null) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, new ItemStack(class_04612.lllIIIllIIIIlllIlIIllIIll(), 1, class_04612.IlIIIIIllllllIIlllIllllll()));
        }
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_05492, n4);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, class_0814 class_08142) {
        class_0461 class_04612;
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, n4, class_08142);
        if (class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII && (class_04612 = this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3)) != null) {
            class_04612.lllIIIllIIIIlllIlIIllIIll(Item.lllIIIllIIIIlllIlIIllIIll(0), 0);
        }
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return Items.lIlIlllIllllIIlllIlllIIIl;
    }

    private class_0461 IllIIIllIIIIlIlIlIllIIlll(class_1334 class_13342, int n, int n2, int n3) {
        class_1774 class_17742 = class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
        return class_17742 != null && class_17742 instanceof class_0461 ? (class_0461)class_17742 : null;
    }

    @Override
    public class_1774 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n) {
        Block class_05492 = null;
        int n2 = 0;
        switch (n) {
            case 1: {
                class_05492 = Blocks.IIIIlIIlIIIllIIIIllIIIlII;
                n2 = 0;
                break;
            }
            case 2: {
                class_05492 = Blocks.llIlllIIllIlllIlIlIlIIIll;
                break;
            }
            case 3: {
                class_05492 = Blocks.IIIllIIlIIIIIIlIlIIllIIlI;
                n2 = 0;
                break;
            }
            case 4: {
                class_05492 = Blocks.IIIllIIlIIIIIIlIlIIllIIlI;
                n2 = 1;
                break;
            }
            case 5: {
                class_05492 = Blocks.IIIllIIlIIIIIIlIlIIllIIlI;
                n2 = 2;
                break;
            }
            case 6: {
                class_05492 = Blocks.IIIllIIlIIIIIIlIlIIllIIlI;
                n2 = 3;
                break;
            }
            case 7: {
                class_05492 = Blocks.llIIlIIllIIllIlIIllIIllII;
                break;
            }
            case 8: {
                class_05492 = Blocks.lllIIIIIIlIlllIIlIlIIIllI;
                break;
            }
            case 9: {
                class_05492 = Blocks.IIIIIllIlIllIlIlIIlIllIIl;
                break;
            }
            case 10: {
                class_05492 = Blocks.llllIIIIlIIIlIIIIIIlIllll;
                break;
            }
            case 11: {
                class_05492 = Blocks.IlIlIIlllIllllllllIIIlIlI;
                n2 = 2;
                break;
            }
            case 12: {
                class_05492 = Blocks.IIIllIIlIIIIIIlIlIIllIIlI;
                n2 = 4;
                break;
            }
            case 13: {
                class_05492 = Blocks.IIIllIIlIIIIIIlIlIIllIIlI;
                n2 = 5;
            }
        }
        return new class_0461(Item.getItemFromBlock(class_05492), n2);
    }
}

