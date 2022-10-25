package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import java.util.Random;

public abstract class class_0816
extends Block {
    private IIcon[] llllllIlIllllIlIlIlIIIIlI;

    protected class_0816(class_1855 class_18552) {
        super(class_18552);
        float f = 0.0f;
        float f2 = 0.0f;
        this.lllIIIllIIIIlllIlIIllIIll(0.0f + f2, 0.0f + f, 0.0f + f2, 1.0f + f2, 1.0f + f, 1.0f + f2);
        this.lllIIIllIIIIlllIlIIllIIll(true);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1843 class_18432, int n, int n2, int n3) {
        return this.IlIlIIlllIllllllllIIIlIlI != class_1855.IIIllIllIIlIlIlIlIllllIIl;
    }

    @Override
    public int llIIlIllIllllIlIIIIlIIlll() {
        return 0xFFFFFF;
    }

    @Override
    public int lIlllIlllIIIIlIIlllIllIII(class_1843 class_18432, int n, int n2, int n3) {
        if (this.IlIlIIlllIllllllllIIIlIlI != class_1855.IllIIlllllllIIlIIlIIIIlIl) {
            return 0xFFFFFF;
        }
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                int n7 = class_18432.a_((int)(n + j), (int)(n3 + i)).lIlllIIllIIIIIIlIlIIlIllI;
                n4 += (n7 & 0xFF0000) >> 16;
                n5 += (n7 & 0xFF00) >> 8;
                n6 += n7 & 0xFF;
            }
        }
        return (n4 / 9 & 0xFF) << 16 | (n5 / 9 & 0xFF) << 8 | n6 / 9 & 0xFF;
    }

    public static float IllIIlllllllIIlIIlIIIIlIl(int n) {
        if (n >= 8) {
            n = 0;
        }
        return (float)(n + 1) / 9.0f;
    }

    @Override
    public IIcon lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return n != 0 && n != 1 ? this.llllllIlIllllIlIlIlIIIIlI[1] : this.llllllIlIllllIlIlIlIIIIlI[0];
    }

    protected int IllIIIllIIIIlIlIlIllIIlll(class_1334 class_13342, int n, int n2, int n3) {
        return class_13342.a_(n, n2, n3).lIllllIIlIIIlIllllllIIIll() == this.IlIlIIlllIllllllllIIIlIlI ? class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) : -1;
    }

    protected int IlIIIIIllllllIIlllIllllll(class_1843 class_18432, int n, int n2, int n3) {
        if (class_18432.a_(n, n2, n3).lIllllIIlIIIlIllllllIIIll() != this.IlIlIIlllIllllllllIIIlIlI) {
            return -1;
        }
        int n4 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        if (n4 >= 8) {
            n4 = 0;
        }
        return n4;
    }

    @Override
    public boolean IllIIIllIIIIlIlIlIllIIlll() {
        return false;
    }

    @Override
    public boolean IlIlllIIIIIIlIIllIIllIlll() {
        return false;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(int n, boolean bl) {
        return bl && n == 0;
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl(class_1843 class_18432, int n, int n2, int n3, int n4) {
        class_1855 class_18552 = class_18432.a_(n, n2, n3).lIllllIIlIIIlIllllllIIIll();
        return class_18552 == this.IlIlIIlllIllllllllIIIlIlI ? false : (n4 == 1 ? true : (class_18552 == class_1855.lIlIllIIlIIlIIlIIlIIlIIll ? false : super.lllIlIIlIIIlIlIIIllIlllIl(class_18432, n, n2, n3, n4)));
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1843 class_18432, int n, int n2, int n3, int n4) {
        class_1855 class_18552 = class_18432.a_(n, n2, n3).lIllllIIlIIIlIllllllIIIll();
        return class_18552 == this.IlIlIIlllIllllllllIIIlIlI ? false : (n4 == 1 ? true : super.lllIIIllIIIIlllIlIIllIIll(class_18432, n, n2, n3, n4));
    }

    @Override
    public class_1974 IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3) {
        return null;
    }

    @Override
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return 4;
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return null;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(Random random) {
        return 0;
    }

    private class_0864 lIllllIIlIIIlIllllllIIIll(class_1843 class_18432, int n, int n2, int n3) {
        int n4;
        class_0864 class_08642 = class_0864.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.0);
        int n5 = this.IlIIIIIllllllIIlllIllllll(class_18432, n, n2, n3);
        for (n4 = 0; n4 < 4; ++n4) {
            int n6;
            int n7;
            int n8 = n;
            int n9 = n3;
            if (n4 == 0) {
                n8 = n - 1;
            }
            if (n4 == 1) {
                n9 = n3 - 1;
            }
            if (n4 == 2) {
                ++n8;
            }
            if (n4 == 3) {
                ++n9;
            }
            if ((n7 = this.IlIIIIIllllllIIlllIllllll(class_18432, n8, n2, n9)) < 0) {
                if (class_18432.a_(n8, n2, n9).lIllllIIlIIIlIllllllIIIll().lIlllIlllIIIIlIIlllIllIII() || (n7 = this.IlIIIIIllllllIIlllIllllll(class_18432, n8, n2 - 1, n9)) < 0) continue;
                n6 = n7 - (n5 - 8);
                class_08642 = class_08642.IlIllllllIIlIIllllIIlIIIl((n8 - n) * n6, (n2 - n2) * n6, (n9 - n3) * n6);
                continue;
            }
            if (n7 < 0) continue;
            n6 = n7 - n5;
            class_08642 = class_08642.IlIllllllIIlIIllllIIlIIIl((n8 - n) * n6, (n2 - n2) * n6, (n9 - n3) * n6);
        }
        if (class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) >= 8) {
            n4 = 0;
            if (n4 != 0 || this.lllIlIIlIIIlIlIIIllIlllIl(class_18432, n, n2, n3 - 1, 2)) {
                n4 = 1;
            }
            if (n4 != 0 || this.lllIlIIlIIIlIlIIIllIlllIl(class_18432, n, n2, n3 + 1, 3)) {
                n4 = 1;
            }
            if (n4 != 0 || this.lllIlIIlIIIlIlIIIllIlllIl(class_18432, n - 1, n2, n3, 4)) {
                n4 = 1;
            }
            if (n4 != 0 || this.lllIlIIlIIIlIlIIIllIlllIl(class_18432, n + 1, n2, n3, 5)) {
                n4 = 1;
            }
            if (n4 != 0 || this.lllIlIIlIIIlIlIIIllIlllIl(class_18432, n, n2 + 1, n3 - 1, 2)) {
                n4 = 1;
            }
            if (n4 != 0 || this.lllIlIIlIIIlIlIIIllIlllIl(class_18432, n, n2 + 1, n3 + 1, 3)) {
                n4 = 1;
            }
            if (n4 != 0 || this.lllIlIIlIIIlIlIIIllIlllIl(class_18432, n - 1, n2 + 1, n3, 4)) {
                n4 = 1;
            }
            if (n4 != 0 || this.lllIlIIlIIIlIlIIIllIlllIl(class_18432, n + 1, n2 + 1, n3, 5)) {
                n4 = 1;
            }
            if (n4 != 0) {
                class_08642 = class_08642.lllIIIllIIIIlllIlIIllIIll().IlIllllllIIlIIllllIIlIIIl(0.0, -6.0, 0.0);
            }
        }
        class_08642 = class_08642.lllIIIllIIIIlllIlIIllIIll();
        return class_08642;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1521 class_15212, class_0864 class_08642) {
        class_0864 class_08643 = this.lIllllIIlIIIlIllllllIIIll((class_1843)class_13342, n, n2, n3);
        class_08642.lllIIIllIIIIlllIlIIllIIll += class_08643.lllIIIllIIIIlllIlIIllIIll;
        class_08642.lllIlIIlIIIlIlIIIllIlllIl += class_08643.lllIlIIlIIIlIlIIIllIlllIl;
        class_08642.IlIllllllIIlIIllllIIlIIIl += class_08643.IlIllllllIIlIIllllIIlIIIl;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342) {
        return this.IlIlIIlllIllllllllIIIlIlI == class_1855.IllIIlllllllIIlIIlIIIIlIl ? 5 : (this.IlIlIIlllIllllllllIIIlIlI == class_1855.IIIllIllIIlIlIlIlIllllIIl ? (class_13342.IlIlIIlllIIlIllIIIlllllIl.IIIllIIlIIIIIIlIlIIllIIlI ? 10 : 30) : 0);
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl(class_1843 class_18432, int n, int n2, int n3) {
        int n4 = class_18432.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, 0);
        int n5 = class_18432.lllIIIllIIIIlllIlIIllIIll(n, n2 + 1, n3, 0);
        int n6 = n4 & 0xFF;
        int n7 = n5 & 0xFF;
        int n8 = n4 >> 16 & 0xFF;
        int n9 = n5 >> 16 & 0xFF;
        return (n6 > n7 ? n6 : n7) | (n8 > n9 ? n8 : n9) << 16;
    }

    @Override
    public int lllllIlllIIllIlIIlIIIllII() {
        return this.IlIlIIlllIllllllllIIIlIlI == class_1855.IllIIlllllllIIlIIlIIIIlIl ? 1 : 0;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, Random random) {
        double d;
        int n4;
        if (this.IlIlIIlllIllllllllIIIlIlI == class_1855.IllIIlllllllIIlIIlIIIIlIl) {
            if (random.nextInt(10) == 0 && ((n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3)) <= 0 || n4 >= 8)) {
                class_13342.lllIIIllIIIIlllIlIIllIIll("suspended", (double)((float)n + random.nextFloat()), (double)((float)n2 + random.nextFloat()), (double)((float)n3 + random.nextFloat()), 0.0, 0.0, 0.0);
            }
            for (n4 = 0; n4 < 0; ++n4) {
                int n5 = random.nextInt(4);
                int n6 = n;
                int n7 = n3;
                if (n5 == 0) {
                    n6 = n - 1;
                }
                if (n5 == 1) {
                    ++n6;
                }
                if (n5 == 2) {
                    n7 = n3 - 1;
                }
                if (n5 == 3) {
                    ++n7;
                }
                if (class_13342.a_(n6, n2, n7).lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll || !class_13342.a_(n6, n2 - 1, n7).lIllllIIlIIIlIllllllIIIll().lIlllIlllIIIIlIIlllIllIII() && !class_13342.a_(n6, n2 - 1, n7).lIllllIIlIIIlIllllllIIIll().lllIIIllIIIIlllIlIIllIIll()) continue;
                float f = 0.0625f;
                d = (float)n + random.nextFloat();
                double d2 = (float)n2 + random.nextFloat();
                double d3 = (float)n3 + random.nextFloat();
                if (n5 == 0) {
                    d = (float)n - f;
                }
                if (n5 == 1) {
                    d = (float)(n + 1) + f;
                }
                if (n5 == 2) {
                    d3 = (float)n3 - f;
                }
                if (n5 == 3) {
                    d3 = (float)(n3 + 1) + f;
                }
                double d4 = 0.0;
                double d5 = 0.0;
                if (n5 == 0) {
                    d4 = -f;
                }
                if (n5 == 1) {
                    d4 = f;
                }
                if (n5 == 2) {
                    d5 = -f;
                }
                if (n5 == 3) {
                    d5 = f;
                }
                class_13342.lllIIIllIIIIlllIlIIllIIll("splash", d, d2, d3, d4, 0.0, d5);
            }
        }
        if (this.IlIlIIlllIllllllllIIIlIlI == class_1855.IllIIlllllllIIlIIlIIIIlIl && random.nextInt(64) == 0 && (n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3)) > 0 && n4 < 8) {
            class_13342.lllIIIllIIIIlllIlIIllIIll((double)((float)n + 0.5f), (double)((float)n2 + 0.5f), (double)((float)n3 + 0.5f), "liquid.water", random.nextFloat() * 0.25f + 0.75f, random.nextFloat() * 1.0f + 0.5f, false);
        }
        if (this.IlIlIIlllIllllllllIIIlIlI == class_1855.IIIllIllIIlIlIlIlIllllIIl && class_13342.a_(n, n2 + 1, n3).lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll && !class_13342.a_(n, n2 + 1, n3).IlIlllIIIIIIlIIllIIllIlll()) {
            if (random.nextInt(100) == 0) {
                double d6 = (float)n + random.nextFloat();
                double d7 = (double)n2 + this.IIIIIIIIlIllIIllIIlllIllI;
                d = (float)n3 + random.nextFloat();
                class_13342.lllIIIllIIIIlllIlIIllIIll("lava", d6, d7, d, 0.0, 0.0, 0.0);
                class_13342.lllIIIllIIIIlllIlIIllIIll(d6, d7, d, "liquid.lavapop", 0.2f + random.nextFloat() * 0.2f, 0.9f + random.nextFloat() * 0.15f, false);
            }
            if (random.nextInt(200) == 0) {
                class_13342.lllIIIllIIIIlllIlIIllIIll((double)n, (double)n2, (double)n3, "liquid.lava", 0.2f + random.nextFloat() * 0.2f, 0.9f + random.nextFloat() * 0.15f, false);
            }
        }
        if (random.nextInt(10) == 0 && class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 - 1, n3) && !class_13342.a_(n, n2 - 2, n3).lIllllIIlIIIlIllllllIIIll().lIlllIlllIIIIlIIlllIllIII()) {
            double d8 = (float)n + random.nextFloat();
            double d9 = (double)n2 - 1.05;
            d = (float)n3 + random.nextFloat();
            if (this.IlIlIIlllIllllllllIIIlIlI == class_1855.IllIIlllllllIIlIIlIIIIlIl) {
                class_13342.lllIIIllIIIIlllIlIIllIIll("dripWater", d8, d9, d, 0.0, 0.0, 0.0);
            } else {
                class_13342.lllIIIllIIIIlllIlIIllIIll("dripLava", d8, d9, d, 0.0, 0.0, 0.0);
            }
        }
    }

    public static double lllIIIllIIIIlllIlIIllIIll(class_1843 class_18432, int n, int n2, int n3, class_1855 class_18552) {
        class_0864 class_08642 = null;
        if (class_18552 == class_1855.IllIIlllllllIIlIIlIIIIlIl) {
            class_08642 = Blocks.IIIllIllIIlIlIlIlIllllIIl.lIllllIIlIIIlIllllllIIIll(class_18432, n, n2, n3);
        }
        if (class_18552 == class_1855.IIIllIllIIlIlIlIlIllllIIl) {
            class_08642 = Blocks.lIIIIlIlIIlllllIIllIIlIII.lIllllIIlIIIlIllllllIIIll(class_18432, n, n2, n3);
        }
        return class_08642.lllIIIllIIIIlllIlIIllIIll == 0.0 && class_08642.IlIllllllIIlIIllllIIlIIIl == 0.0 ? -1000.0 : Math.atan2(class_08642.IlIllllllIIlIIllllIIlIIIl, class_08642.lllIIIllIIIIlllIlIIllIIll) - 1.5707963267948966;
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII(class_1334 class_13342, int n, int n2, int n3) {
        this.llIIlllIllIllllIIIlIIIIII(class_13342, n, n2, n3);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        this.llIIlllIllIllllIIIlIIIIII(class_13342, n, n2, n3);
    }

    private void llIIlllIllIllllIIIlIIIIII(class_1334 class_13342, int n, int n2, int n3) {
        if (class_13342.a_(n, n2, n3) == this && this.IlIlIIlllIllllllllIIIlIlI == class_1855.IIIllIllIIlIlIlIlIllllIIl) {
            boolean bl = false;
            if (bl || class_13342.a_(n, n2, n3 - 1).lIllllIIlIIIlIllllllIIIll() == class_1855.IllIIlllllllIIlIIlIIIIlIl) {
                bl = true;
            }
            if (bl || class_13342.a_(n, n2, n3 + 1).lIllllIIlIIIlIllllllIIIll() == class_1855.IllIIlllllllIIlIIlIIIIlIl) {
                bl = true;
            }
            if (bl || class_13342.a_(n - 1, n2, n3).lIllllIIlIIIlIllllllIIIll() == class_1855.IllIIlllllllIIlIIlIIIIlIl) {
                bl = true;
            }
            if (bl || class_13342.a_(n + 1, n2, n3).lIllllIIlIIIlIllllllIIIll() == class_1855.IllIIlllllllIIlIIlIIIIlIl) {
                bl = true;
            }
            if (bl || class_13342.a_(n, n2 + 1, n3).lIllllIIlIIIlIllllllIIIll() == class_1855.IllIIlllllllIIlIIlIIIIlIl) {
                bl = true;
            }
            if (bl) {
                int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
                if (n4 == 0) {
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.obsidian);
                } else if (n4 <= 4) {
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.IlIIIIIllllllIIlllIllllll);
                }
                this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n, n2, n3);
            }
        }
    }

    protected void lIIIIlIlIIlllllIIllIIlIII(class_1334 class_13342, int n, int n2, int n3) {
        class_13342.lllIIIllIIIIlllIlIIllIIll((float)n + 0.5f, (double)((float)n2 + 0.5f), (double)((float)n3 + 0.5f), "random.fizz", 0.5f, 2.6f + (class_13342.lllllIlllIIllIlIIlIIIllII.nextFloat() - class_13342.lllllIlllIIllIlIIlIIIllII.nextFloat()) * 0.8f);
        for (int i = 0; i < 8; ++i) {
            class_13342.lllIIIllIIIIlllIlIIllIIll("largesmoke", (double)n + Math.random(), (double)n2 + 1.2, (double)n3 + Math.random(), 0.0, 0.0, 0.0);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llllllIlIllllIlIlIlIIIIlI = this.IlIlIIlllIllllllllIIIlIlI == class_1855.IIIllIllIIlIlIlIlIllllIIl ? new IIcon[]{class_08872.lllIIIllIIIIlllIlIIllIIll("lava_still"), class_08872.lllIIIllIIIIlllIlIIllIIll("lava_flow")} : new IIcon[]{class_08872.lllIIIllIIIIlllIlIIllIIll("water_still"), class_08872.lllIIIllIIIIlllIlIIllIIll("water_flow")};
    }

    public static IIcon lIlllIlllIIIIlIIlllIllIII(String string) {
        return string == "water_still" ? Blocks.IIIllIllIIlIlIlIlIllllIIl.llllllIlIllllIlIlIlIIIIlI[0] : (string == "water_flow" ? Blocks.IIIllIllIIlIlIlIlIllllIIl.llllllIlIllllIlIlIlIIIIlI[1] : (string == "lava_still" ? Blocks.lIIIIlIlIIlllllIIllIIlIII.llllllIlIllllIlIlIlIIIIlI[0] : (string == "lava_flow" ? Blocks.lIIIIlIlIIlllllIIllIIlIII.llllllIlIllllIlIlIlIIIIlI[1] : null)));
    }
}

