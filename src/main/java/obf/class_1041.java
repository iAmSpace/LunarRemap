package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import java.util.Iterator;
import java.util.Random;

public class class_1041
extends class_2257 {
    private final Random lIlIIllllIlIIIIllIIIIlIIl = new Random();
    public final int llllllIlIllllIlIlIlIIIIlI;

    protected class_1041(int n) {
        super(class_1855.lIlllIlllIIIIlIIlllIllIII);
        this.llllllIlIllllIlIlIlIIIIlI = n;
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.IlIllllllIIlIIllllIIlIIIl);
        this.lllIIIllIIIIlllIlIIllIIll(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.875f, 0.9375f);
    }

    @Override
    public boolean IlIlllIIIIIIlIIllIIllIlll() {
        return false;
    }

    @Override
    public boolean IllIIIllIIIIlIlIlIllIIlll() {
        return false;
    }

    @Override
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return 22;
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(class_1843 class_18432, int n, int n2, int n3) {
        if (class_18432.a_(n, n2, n3 - 1) == this) {
            this.lllIIIllIIIIlllIlIIllIIll(0.0625f, 0.0f, 0.0f, 0.9375f, 0.875f, 0.9375f);
        } else if (class_18432.a_(n, n2, n3 + 1) == this) {
            this.lllIIIllIIIIlllIlIIllIIll(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.875f, 1.0f);
        } else if (class_18432.a_(n - 1, n2, n3) == this) {
            this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0625f, 0.9375f, 0.875f, 0.9375f);
        } else if (class_18432.a_(n + 1, n2, n3) == this) {
            this.lllIIIllIIIIlllIlIIllIIll(0.0625f, 0.0f, 0.0625f, 1.0f, 0.875f, 0.9375f);
        } else {
            this.lllIIIllIIIIlllIlIIllIIll(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.875f, 0.9375f);
        }
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII(class_1334 class_13342, int n, int n2, int n3) {
        super.lIlllIlllIIIIlIIlllIllIII(class_13342, n, n2, n3);
        this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3);
        Block class_05492 = class_13342.a_(n, n2, n3 - 1);
        Block class_05493 = class_13342.a_(n, n2, n3 + 1);
        Block class_05494 = class_13342.a_(n - 1, n2, n3);
        Block class_05495 = class_13342.a_(n + 1, n2, n3);
        if (class_05492 == this) {
            this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3 - 1);
        }
        if (class_05493 == this) {
            this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3 + 1);
        }
        if (class_05494 == this) {
            this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n - 1, n2, n3);
        }
        if (class_05495 == this) {
            this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n + 1, n2, n3);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1965 class_19652, ItemStack class_08972) {
        Block class_05492 = class_13342.a_(n, n2, n3 - 1);
        Block class_05493 = class_13342.a_(n, n2, n3 + 1);
        Block class_05494 = class_13342.a_(n - 1, n2, n3);
        Block class_05495 = class_13342.a_(n + 1, n2, n3);
        int n4 = 0;
        int n5 = MathHelper.IlIllllllIIlIIllllIIlIIIl((double)(class_19652.IIIIlIllIlIIlIIlIllIlIlll * 4.0f / 360.0f) + 0.5) & 3;
        if (n5 == 0) {
            n4 = 2;
        }
        if (n5 == 1) {
            n4 = 5;
        }
        if (n5 == 2) {
            n4 = 3;
        }
        if (n5 == 3) {
            n4 = 4;
        }
        if (class_05492 != this && class_05493 != this && class_05494 != this && class_05495 != this) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, 3);
        } else {
            if (!(class_05492 != this && class_05493 != this || n4 != 4 && n4 != 5)) {
                if (class_05492 == this) {
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3 - 1, n4, 3);
                } else {
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3 + 1, n4, 3);
                }
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, 3);
            }
            if (!(class_05494 != this && class_05495 != this || n4 != 2 && n4 != 3)) {
                if (class_05494 == this) {
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n - 1, n2, n3, n4, 3);
                } else {
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n + 1, n2, n3, n4, 3);
                }
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, 3);
            }
        }
        if (class_08972.IlIIIlIIIIllIIIllIIIIIIll()) {
            ((class_0071)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3)).lllIIIllIIIIlllIlIIllIIll(class_08972.lIIlIIIIIlIlllIlIIlIlIlll());
        }
    }

    public void IllIIIllIIIIlIlIlIllIIlll(class_1334 class_13342, int n, int n2, int n3) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
            int n4;
            Block class_05492 = class_13342.a_(n, n2, n3 - 1);
            Block class_05493 = class_13342.a_(n, n2, n3 + 1);
            Block class_05494 = class_13342.a_(n - 1, n2, n3);
            Block class_05495 = class_13342.a_(n + 1, n2, n3);
            boolean bl = true;
            if (class_05492 != this && class_05493 != this) {
                if (class_05494 != this && class_05495 != this) {
                    n4 = 3;
                    if (class_05492.lllIIIllIIIIlllIlIIllIIll() && !class_05493.lllIIIllIIIIlllIlIIllIIll()) {
                        n4 = 3;
                    }
                    if (class_05493.lllIIIllIIIIlllIlIIllIIll() && !class_05492.lllIIIllIIIIlllIlIIllIIll()) {
                        n4 = 2;
                    }
                    if (class_05494.lllIIIllIIIIlllIlIIllIIll() && !class_05495.lllIIIllIIIIlllIlIIllIIll()) {
                        n4 = 5;
                    }
                    if (class_05495.lllIIIllIIIIlllIlIIllIIll() && !class_05494.lllIIIllIIIIlllIlIIllIIll()) {
                        n4 = 4;
                    }
                } else {
                    int n5 = class_05494 == this ? n - 1 : n + 1;
                    Block class_05496 = class_13342.a_(n5, n2, n3 - 1);
                    int n6 = class_05494 == this ? n - 1 : n + 1;
                    Block class_05497 = class_13342.a_(n6, n2, n3 + 1);
                    n4 = 3;
                    boolean bl2 = true;
                    int n7 = class_05494 == this ? class_13342.IlIllllllIIlIIllllIIlIIIl(n - 1, n2, n3) : class_13342.IlIllllllIIlIIllllIIlIIIl(n + 1, n2, n3);
                    if (n7 == 2) {
                        n4 = 2;
                    }
                    if ((class_05492.lllIIIllIIIIlllIlIIllIIll() || class_05496.lllIIIllIIIIlllIlIIllIIll()) && !class_05493.lllIIIllIIIIlllIlIIllIIll() && !class_05497.lllIIIllIIIIlllIlIIllIIll()) {
                        n4 = 3;
                    }
                    if ((class_05493.lllIIIllIIIIlllIlIIllIIll() || class_05497.lllIIIllIIIIlllIlIIllIIll()) && !class_05492.lllIIIllIIIIlllIlIIllIIll() && !class_05496.lllIIIllIIIIlllIlIIllIIll()) {
                        n4 = 2;
                    }
                }
            } else {
                int n8 = class_05492 == this ? n3 - 1 : n3 + 1;
                Block class_05498 = class_13342.a_(n - 1, n2, n8);
                int n9 = class_05492 == this ? n3 - 1 : n3 + 1;
                Block class_05499 = class_13342.a_(n + 1, n2, n9);
                n4 = 5;
                boolean bl3 = true;
                int n10 = class_05492 == this ? class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3 - 1) : class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3 + 1);
                if (n10 == 4) {
                    n4 = 4;
                }
                if ((class_05494.lllIIIllIIIIlllIlIIllIIll() || class_05498.lllIIIllIIIIlllIlIIllIIll()) && !class_05495.lllIIIllIIIIlllIlIIllIIll() && !class_05499.lllIIIllIIIIlllIlIIllIIll()) {
                    n4 = 5;
                }
                if ((class_05495.lllIIIllIIIIlllIlIIllIIll() || class_05499.lllIIIllIIIIlllIlIIllIIll()) && !class_05494.lllIIIllIIIIlllIlIIllIIll() && !class_05498.lllIIIllIIIIlllIlIIllIIll()) {
                    n4 = 4;
                }
            }
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, 3);
        }
    }

    @Override
    public boolean IlIIIIIllllllIIlllIllllll(class_1334 class_13342, int n, int n2, int n3) {
        int n4 = 0;
        if (class_13342.a_(n - 1, n2, n3) == this) {
            ++n4;
        }
        if (class_13342.a_(n + 1, n2, n3) == this) {
            ++n4;
        }
        if (class_13342.a_(n, n2, n3 - 1) == this) {
            ++n4;
        }
        if (class_13342.a_(n, n2, n3 + 1) == this) {
            ++n4;
        }
        return n4 > 1 ? false : (this.llIIlllIllIllllIIIlIIIIII(class_13342, n - 1, n2, n3) ? false : (this.llIIlllIllIllllIIIlIIIIII(class_13342, n + 1, n2, n3) ? false : (this.llIIlllIllIllllIIIlIIIIII(class_13342, n, n2, n3 - 1) ? false : !this.llIIlllIllIllllIIIlIIIIII(class_13342, n, n2, n3 + 1))));
    }

    private boolean llIIlllIllIllllIIIlIIIIII(class_1334 class_13342, int n, int n2, int n3) {
        return class_13342.a_(n, n2, n3) != this ? false : (class_13342.a_(n - 1, n2, n3) == this ? true : (class_13342.a_(n + 1, n2, n3) == this ? true : (class_13342.a_(n, n2, n3 - 1) == this ? true : class_13342.a_(n, n2, n3 + 1) == this)));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_05492);
        class_0071 class_00712 = (class_0071)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
        if (class_00712 != null) {
            class_00712.llIIlllIllIllllIIIlIIIIII();
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492, int n4) {
        class_0071 class_00712 = (class_0071)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
        if (class_00712 != null) {
            for (int i = 0; i < class_00712.IlIIIIIllllllIIlllIllllll(); ++i) {
                ItemStack class_08972 = class_00712.llIIllIllIlIIlIIllIllllll(i);
                if (class_08972 == null) continue;
                float f = this.lIlIIllllIlIIIIllIIIIlIIl.nextFloat() * 0.8f + 0.1f;
                float f2 = this.lIlIIllllIlIIIIllIIIIlIIl.nextFloat() * 0.8f + 0.1f;
                float f3 = this.lIlIIllllIlIIIIllIIIIlIIl.nextFloat() * 0.8f + 0.1f;
                while (class_08972.lllIlIIlIIIlIlIIIllIlllIl > 0) {
                    int n5 = this.lIlIIllllIlIIIIllIIIIlIIl.nextInt(21) + 10;
                    if (n5 > class_08972.lllIlIIlIIIlIlIIIllIlllIl) {
                        n5 = class_08972.lllIlIIlIIIlIlIIIllIlllIl;
                    }
                    class_08972.lllIlIIlIIIlIlIIIllIlllIl -= n5;
                    class_1781 class_17812 = new class_1781(class_13342, (float)n + f, (float)n2 + f2, (float)n3 + f3, new ItemStack(class_08972.lllIIIllIIIIlllIlIIllIIll(), n5, class_08972.IllIIIllIIIIlIlIlIllIIlll()));
                    float f4 = 0.05f;
                    class_17812.IIIIIIIIlIllIIllIIlllIllI = (float)this.lIlIIllllIlIIIIllIIIIlIIl.nextGaussian() * f4;
                    class_17812.IIlIIlIlIlIllIIlIlIIIIlll = (float)this.lIlIIllllIlIIIIllIIIIlIIl.nextGaussian() * f4 + 0.2f;
                    class_17812.llIIIlllIlllIlIllIIIIllIl = (float)this.lIlIIllllIlIIIIllIIIIlIIl.nextGaussian() * f4;
                    if (class_08972.IlIlIIlIlIllIIlIlIIllIIIl()) {
                        class_17812.lIlllIlllIIIIlIIlllIllIII().lIlllIlllIIIIlIIlllIllIII((class_0775)class_08972.lllllIlllIIllIlIIlIIIllII().lllIlIIlIIIlIlIIIllIlllIl());
                    }
                    class_13342.lllIIIllIIIIlllIlIIllIIll(class_17812);
                }
            }
            class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3, class_05492);
        }
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_05492, n4);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142, int n4, float f, float f2, float f3) {
        if (class_13342.IllIIIIllIIllIllIlllIlIIl) {
            return true;
        }
        class_0850 class_08502 = this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n, n2, n3);
        if (class_08502 != null) {
            class_08142.lllIIIllIIIIlllIlIIllIIll(class_08502);
        }
        return true;
    }

    public class_0850 lIIIIlIlIIlllllIIllIIlIII(class_1334 class_13342, int n, int n2, int n3) {
        class_0850 class_08502 = (class_0071)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
        if (class_08502 == null) {
            return null;
        }
        if (class_13342.a_(n, n2 + 1, n3).IIIllIllIIlIlIlIlIllllIIl()) {
            return null;
        }
        if (class_1041.llIIllIllIlIIlIIllIllllll(class_13342, n, n2, n3)) {
            return null;
        }
        if (class_13342.a_(n - 1, n2, n3) == this && (class_13342.a_(n - 1, n2 + 1, n3).IIIllIllIIlIlIlIlIllllIIl() || class_1041.llIIllIllIlIIlIIllIllllll(class_13342, n - 1, n2, n3))) {
            return null;
        }
        if (class_13342.a_(n + 1, n2, n3) == this && (class_13342.a_(n + 1, n2 + 1, n3).IIIllIllIIlIlIlIlIllllIIl() || class_1041.llIIllIllIlIIlIIllIllllll(class_13342, n + 1, n2, n3))) {
            return null;
        }
        if (class_13342.a_(n, n2, n3 - 1) == this && (class_13342.a_(n, n2 + 1, n3 - 1).IIIllIllIIlIlIlIlIllllIIl() || class_1041.llIIllIllIlIIlIIllIllllll(class_13342, n, n2, n3 - 1))) {
            return null;
        }
        if (class_13342.a_(n, n2, n3 + 1) == this && (class_13342.a_(n, n2 + 1, n3 + 1).IIIllIllIIlIlIlIlIllllIIl() || class_1041.llIIllIllIlIIlIIllIllllll(class_13342, n, n2, n3 + 1))) {
            return null;
        }
        if (class_13342.a_(n - 1, n2, n3) == this) {
            class_08502 = new class_1369("container.chestDouble", (class_0071)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n - 1, n2, n3), class_08502);
        }
        if (class_13342.a_(n + 1, n2, n3) == this) {
            class_08502 = new class_1369("container.chestDouble", class_08502, (class_0071)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n + 1, n2, n3));
        }
        if (class_13342.a_(n, n2, n3 - 1) == this) {
            class_08502 = new class_1369("container.chestDouble", (class_0071)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3 - 1), class_08502);
        }
        if (class_13342.a_(n, n2, n3 + 1) == this) {
            class_08502 = new class_1369("container.chestDouble", class_08502, (class_0071)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3 + 1));
        }
        return class_08502;
    }

    @Override
    public class_1774 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n) {
        class_0071 class_00712 = new class_0071();
        return class_00712;
    }

    @Override
    public boolean llIllllIlIllIIIlIllIIlIlI() {
        return this.llllllIlIllllIlIlIlIIIIlI == 1;
    }

    @Override
    public int lIlllIlllIIIIlIIlllIllIII(class_1843 class_18432, int n, int n2, int n3, int n4) {
        if (!this.llIllllIlIllIIIlIllIIlIlI()) {
            return 0;
        }
        int n5 = ((class_0071)class_18432.lllIlIIlIIIlIlIIIllIlllIl((int)n, (int)n2, (int)n3)).IlIlllIIIIIIlIIllIIllIlll;
        return MathHelper.lllIIIllIIIIlllIlIIllIIll(n5, 0, 15);
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll(class_1843 class_18432, int n, int n2, int n3, int n4) {
        return n4 == 1 ? this.lIlllIlllIIIIlIIlllIllIII(class_18432, n, n2, n3, n4) : 0;
    }

    private static boolean llIIllIllIlIIlIIllIllllll(class_1334 class_13342, int n, int n2, int n3) {
        class_1521 class_15212;
        class_0673 class_06732;
        Iterator iterator = class_13342.lllIIIllIIIIlllIlIIllIIll(class_0673.class, class_1974.lllIIIllIIIIlllIlIIllIIll(n, n2 + 1, n3, n + 1, n2 + 2, n3 + 1)).iterator();
        do {
            if (iterator.hasNext()) continue;
            return false;
        } while (!(class_06732 = (class_0673)(class_15212 = (class_1521)iterator.next())).IlIllIIIIllllIIllIllIIIIl());
        return true;
    }

    @Override
    public boolean IIllIllIIllIIlllIIIlIlllI() {
        return true;
    }

    @Override
    public int lIllllIIlIIIlIllllllIIIll(class_1334 class_13342, int n, int n2, int n3, int n4) {
        return class_1071.lllIlIIlIIIlIlIIIllIlllIl(this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n, n2, n3));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llIIIIllIIIIIIIlIIIlIIIIl = class_08872.lllIIIllIIIIlllIlIIllIIll("planks_oak");
    }
}

