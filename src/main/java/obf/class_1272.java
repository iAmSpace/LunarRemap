package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class class_1272
extends Item {
    protected final Block IIIllIllIIlIlIlIlIllllIIl;
    private IIcon IllIIIllIIIIlIlIlIllIIlll;

    public class_1272(Block class_05492) {
        this.IIIllIllIIlIlIlIlIllllIIl = class_05492;
    }

    public class_1272 lIlllIlllIIIIlIIlllIllIII(String string) {
        super.lllIIIllIIIIlllIlIIllIIll(string);
        return this;
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IIIllIllIIlIlIlIlIllllIIl.lIlIIllllIlIIIIllIIIIlIIl() != null ? 1 : 0;
    }

    @Override
    public IIcon IlIllllllIIlIIllllIIlIIIl(int n) {
        return this.IllIIIllIIIIlIlIlIllIIlll != null ? this.IllIIIllIIIIlIlIlIllIIlll : this.IIIllIllIIlIlIlIlIllllIIl.lIlllIlllIIIIlIIlllIllIII(1);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_0814 class_08142, class_1334 class_13342, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        Block class_05492 = class_13342.a_(n, n2, n3);
        if (class_05492 == Blocks.lIIllIIlIIIlllIlllIIlIIlI && (class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) & 7) < 1) {
            n4 = 1;
        } else if (class_05492 != Blocks.lIIlIlllIIlIIIIlIlIIIIlll && class_05492 != Blocks.IlIlIIlllIllllllllIIIlIlI && class_05492 != Blocks.llllIIIIlIIIlIIIIIIlIllll) {
            if (n4 == 0) {
                --n2;
            }
            if (n4 == 1) {
                ++n2;
            }
            if (n4 == 2) {
                --n3;
            }
            if (n4 == 3) {
                ++n3;
            }
            if (n4 == 4) {
                --n;
            }
            if (n4 == 5) {
                ++n;
            }
        }
        if (class_08972.lllIlIIlIIIlIlIIIllIlllIl == 0) {
            return false;
        }
        if (!class_08142.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, class_08972)) {
            return false;
        }
        if (n2 == 255 && this.IIIllIllIIlIlIlIlIllllIIl.lIllllIIlIIIlIllllllIIIll().lllIlIIlIIIlIlIIIllIlllIl()) {
            return false;
        }
        if (class_13342.lllIIIllIIIIlllIlIIllIIll(this.IIIllIllIIlIlIlIlIllllIIl, n, n2, n3, false, n4, class_08142, class_08972)) {
            int n5 = this.lIlllIlllIIIIlIIlllIllIII(class_08972.IllIIIllIIIIlIlIlIllIIlll());
            int n6 = this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, n4, f, f2, f3, n5);
            if (class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, this.IIIllIllIIlIlIlIlIllllIIl, n6, 3)) {
                if (class_13342.a_(n, n2, n3) == this.IIIllIllIIlIlIlIlIllllIIl) {
                    this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_08142, class_08972);
                    this.IIIllIllIIlIlIlIlIllllIIl.lIlllIlllIIIIlIIlllIllIII(class_13342, n, n2, n3, n6);
                }
                class_13342.lllIIIllIIIIlllIlIIllIIll((float)n + 0.5f, (double)((float)n2 + 0.5f), (double)((float)n3 + 0.5f), this.IIIllIllIIlIlIlIlIllllIIl.llIIIlllIlllIlIllIIIIllIl.lllIlIIlIIIlIlIIIllIlllIl(), (this.IIIllIllIIlIlIlIlIllllIIl.llIIIlllIlllIlIllIIIIllIl.IlIllllllIIlIIllllIIlIIIl() + 1.0f) / 2.0f, this.IIIllIllIIlIlIlIlIllllIIl.llIIIlllIlllIlIllIIIIllIl.lIlllIlllIIIIlIIlllIllIII() * 0.8f);
                --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
            }
            return true;
        }
        return false;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, class_0814 class_08142, ItemStack class_08972) {
        Block class_05492 = class_13342.a_(n, n2, n3);
        if (class_05492 == Blocks.lIIllIIlIIIlllIlllIIlIIlI) {
            n4 = 1;
        } else if (class_05492 != Blocks.lIIlIlllIIlIIIIlIlIIIIlll && class_05492 != Blocks.IlIlIIlllIllllllllIIIlIlI && class_05492 != Blocks.llllIIIIlIIIlIIIIIIlIllll) {
            if (n4 == 0) {
                --n2;
            }
            if (n4 == 1) {
                ++n2;
            }
            if (n4 == 2) {
                --n3;
            }
            if (n4 == 3) {
                ++n3;
            }
            if (n4 == 4) {
                --n;
            }
            if (n4 == 5) {
                ++n;
            }
        }
        return class_13342.lllIIIllIIIIlllIlIIllIIll(this.IIIllIllIIlIlIlIlIllllIIl, n, n2, n3, false, n4, null, class_08972);
    }

    @Override
    public String IlIllllllIIlIIllllIIlIIIl(ItemStack class_08972) {
        return this.IIIllIllIIlIlIlIlIllllIIl.IllIIIIllIIllIllIlllIlIIl();
    }

    @Override
    public String IllIIIllIIIIlIlIlIllIIlll() {
        return this.IIIllIllIIlIlIlIlIllllIIl.IllIIIIllIIllIllIlllIlIIl();
    }

    @Override
    public class_0931 lllllIlllIIllIlIIlIIIllII() {
        return this.IIIllIllIIlIlIlIlIllllIIl.IlIlIIlllIllllllllIIIlIlI();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(Item class_06112, class_0931 class_09312, List list) {
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(class_06112, class_09312, list);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        String string = this.IIIllIllIIlIlIlIlIllllIIl.lIlIIllllIlIIIIllIIIIlIIl();
        if (string != null) {
            this.IllIIIllIIIIlIlIlIllIIlll = class_08872.lllIIIllIIIIlllIlIIllIIll(string);
        }
    }

    @Override
    public /* synthetic */ Item lllIIIllIIIIlllIlIIllIIll(String string) {
        return this.lIlllIlllIIIIlIIlllIllIII(string);
    }
}

