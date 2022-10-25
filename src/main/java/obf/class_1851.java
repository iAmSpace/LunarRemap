package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import java.util.List;
import java.util.Random;

public class class_1851
extends class_0854
implements class_0588 {
    public static final String[] llllllIlIllllIlIlIlIIIIlI = new String[]{"oak", "spruce", "birch", "jungle", "acacia", "roofed_oak"};
    private static final IIcon[] lIlIIllllIlIIIIllIIIIlIIl = new IIcon[llllllIlIllllIlIlIlIIIIlI.length];

    protected class_1851() {
        float f = 0.4f;
        this.lllIIIllIIIIlllIlIIllIIll(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, f * 2.0f, 0.5f + f);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.IlIllllllIIlIIllllIIlIIIl);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Random random) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
            super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, random);
            if (class_13342.IllIIIllIIIIlIlIlIllIIlll(n, n2 + 1, n3) >= 9 && random.nextInt(7) == 0) {
                this.IlIllllllIIlIIllllIIlIIIl(class_13342, n, n2, n3, random);
            }
        }
    }

    @Override
    public IIcon lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return lIlIIllllIlIIIIllIIIIlIIl[MathHelper.lllIIIllIIIIlllIlIIllIIll(n2 &= 7, 0, 5)];
    }

    public void IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3, Random random) {
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        if ((n4 & 8) == 0) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4 | 8, 4);
        } else {
            this.lIlllIlllIIIIlIIlllIllIII(class_13342, n, n2, n3, random);
        }
    }

    public void lIlllIlllIIIIlIIlllIllIII(class_1334 class_13342, int n, int n2, int n3, Random random) {
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) & 7;
        class_1174 class_11742 = random.nextInt(10) == 0 ? new class_1240(true) : new class_1219(true);
        int n5 = 0;
        int n6 = 0;
        boolean bl = false;
        switch (n4) {
            default: {
                break;
            }
            case 1: {
                block7: for (n5 = 0; n5 >= -1; --n5) {
                    for (n6 = 0; n6 >= -1; --n6) {
                        if (!this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n + n5, n2, n3 + n6, 1) || !this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n + n5 + 1, n2, n3 + n6, 1) || !this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n + n5, n2, n3 + n6 + 1, 1) || !this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n + n5 + 1, n2, n3 + n6 + 1, 1)) continue;
                        class_11742 = new class_0392(false, random.nextBoolean());
                        bl = true;
                        break block7;
                    }
                }
                if (bl) break;
                n6 = 0;
                n5 = 0;
                class_11742 = new class_1121(true);
                break;
            }
            case 2: {
                class_11742 = new class_1347(true, false);
                break;
            }
            case 3: {
                block9: for (n5 = 0; n5 >= -1; --n5) {
                    for (n6 = 0; n6 >= -1; --n6) {
                        if (!this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n + n5, n2, n3 + n6, 3) || !this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n + n5 + 1, n2, n3 + n6, 3) || !this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n + n5, n2, n3 + n6 + 1, 3) || !this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n + n5 + 1, n2, n3 + n6 + 1, 3)) continue;
                        class_11742 = new class_0637(true, 10, 20, 3, 3);
                        bl = true;
                        break block9;
                    }
                }
                if (bl) break;
                n6 = 0;
                n5 = 0;
                class_11742 = new class_1219(true, 4 + random.nextInt(7), 3, 3, false);
                break;
            }
            case 4: {
                class_11742 = new class_1838(true);
                break;
            }
            case 5: {
                block11: for (n5 = 0; n5 >= -1; --n5) {
                    for (n6 = 0; n6 >= -1; --n6) {
                        if (!this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n + n5, n2, n3 + n6, 5) || !this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n + n5 + 1, n2, n3 + n6, 5) || !this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n + n5, n2, n3 + n6 + 1, 5) || !this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n + n5 + 1, n2, n3 + n6 + 1, 5)) continue;
                        class_11742 = new class_1440(true);
                        bl = true;
                        break block11;
                    }
                }
                if (bl) break;
                return;
            }
        }
        Block class_05492 = Blocks.lllIIIllIIIIlllIlIIllIIll;
        if (bl) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n + n5, n2, n3 + n6, class_05492, 0, 4);
            class_13342.lllIIIllIIIIlllIlIIllIIll(n + n5 + 1, n2, n3 + n6, class_05492, 0, 4);
            class_13342.lllIIIllIIIIlllIlIIllIIll(n + n5, n2, n3 + n6 + 1, class_05492, 0, 4);
            class_13342.lllIIIllIIIIlllIlIIllIIll(n + n5 + 1, n2, n3 + n6 + 1, class_05492, 0, 4);
        } else {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, class_05492, 0, 4);
        }
        if (!((class_1067)class_11742).a_(class_13342, random, n + n5, n2, n3 + n6)) {
            if (bl) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n + n5, n2, n3 + n6, this, n4, 4);
                class_13342.lllIIIllIIIIlllIlIIllIIll(n + n5 + 1, n2, n3 + n6, this, n4, 4);
                class_13342.lllIIIllIIIIlllIlIIllIIll(n + n5, n2, n3 + n6 + 1, this, n4, 4);
                class_13342.lllIIIllIIIIlllIlIIllIIll(n + n5 + 1, n2, n3 + n6 + 1, this, n4, 4);
            } else {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, this, n4, 4);
            }
        }
    }

    public boolean IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3, int n4) {
        return class_13342.a_(n, n2, n3) == this && (class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) & 7) == n4;
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll(int n) {
        return MathHelper.lllIIIllIIIIlllIlIIllIIll(n & 7, 0, 5);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(Item class_06112, class_0931 class_09312, List list) {
        list.add(new ItemStack(class_06112, 1, 0));
        list.add(new ItemStack(class_06112, 1, 1));
        list.add(new ItemStack(class_06112, 1, 2));
        list.add(new ItemStack(class_06112, 1, 3));
        list.add(new ItemStack(class_06112, 1, 4));
        list.add(new ItemStack(class_06112, 1, 5));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        for (int i = 0; i < lIlIIllllIlIIIIllIIIIlIIl.length; ++i) {
            class_1851.lIlIIllllIlIIIIllIIIIlIIl[i] = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_" + llllllIlIllllIlIlIlIIIIlI[i]);
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, boolean bl) {
        return true;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, int n, int n2, int n3) {
        return (double)class_13342.lllllIlllIIllIlIIlIIIllII.nextFloat() < 0.45;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, Random random, int n, int n2, int n3) {
        this.IlIllllllIIlIIllllIIlIIIl(class_13342, n, n2, n3, random);
    }
}

