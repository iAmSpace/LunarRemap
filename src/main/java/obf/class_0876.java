package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_0876
extends Block
implements class_0588 {
    private static final Logger llllllIlIllllIlIlIlIIIIlI = LogManager.getLogger();
    private IIcon lIlIIllllIlIIIIllIIIIlIIl;
    private IIcon llIlllIIllIlllIlIlIlIIIll;
    private IIcon IIIIlIIlIIIllIIIIllIIIlII;

    protected class_0876() {
        super(class_1855.lllIlIIlIIIlIlIIIllIlllIl);
        this.lllIIIllIIIIlllIlIIllIIll(true);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public IIcon lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return n == 1 ? this.lIlIIllllIlIIIIllIIIIlIIl : (n == 0 ? Blocks.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII(n) : this.llIIIIllIIIIIIIlIIIlIIIIl);
    }

    @Override
    public IIcon IlIllllllIIlIIllllIIlIIIl(class_1843 class_18432, int n, int n2, int n3, int n4) {
        if (n4 == 1) {
            return this.lIlIIllllIlIIIIllIIIIlIIl;
        }
        if (n4 == 0) {
            return Blocks.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII(n4);
        }
        class_1855 class_18552 = class_18432.a_(n, n2 + 1, n3).lIllllIIlIIIlIllllllIIIll();
        return class_18552 != class_1855.llIllllIlIllIIIlIllIIlIlI && class_18552 != class_1855.lIlllIlllIlIIIIlllIlIlIIl ? this.llIIIIllIIIIIIIlIIIlIIIIl : this.llIlllIIllIlllIlIlIlIIIll;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llIIIIllIIIIIIIlIIIlIIIIl = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_side");
        this.lIlIIllllIlIIIIllIIIIlIIl = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_top");
        this.llIlllIIllIlllIlIlIlIIIll = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_side_snowed");
        this.IIIIlIIlIIIllIIIIllIIIlII = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_side_overlay");
    }

    @Override
    public int llIIlIllIllllIlIIIIlIIlll() {
        double d = 0.5;
        double d2 = 1.0;
        return class_0614.lllIIIllIIIIlllIlIIllIIll(d, d2);
    }

    @Override
    public int lIllllIIlIIIlIllllllIIIll(int n) {
        return this.llIIlIllIllllIlIIIIlIIlll();
    }

    @Override
    public int lIlllIlllIIIIlIIlllIllIII(class_1843 class_18432, int n, int n2, int n3) {
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                int n7 = class_18432.a_(n + j, n3 + i).lllIlIIlIIIlIlIIIllIlllIl(n + j, n2, n3 + i);
                n4 += (n7 & 0xFF0000) >> 16;
                n5 += (n7 & 0xFF00) >> 8;
                n6 += n7 & 0xFF;
            }
        }
        return (n4 / 9 & 0xFF) << 16 | (n5 / 9 & 0xFF) << 8 | n6 / 9 & 0xFF;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Random random) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
            if (class_13342.IllIIIllIIIIlIlIlIllIIlll(n, n2 + 1, n3) < 4 && class_13342.a_(n, n2 + 1, n3).lllIlIIlIIIlIlIIIllIlllIl() > 2) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.lIlllIlllIIIIlIIlllIllIII);
            } else if (class_13342.IllIIIllIIIIlIlIlIllIIlll(n, n2 + 1, n3) >= 9) {
                for (int i = 0; i < 4; ++i) {
                    int n4 = n + random.nextInt(3) - 1;
                    int n5 = n2 + random.nextInt(5) - 3;
                    int n6 = n3 + random.nextInt(3) - 1;
                    Block class_05492 = class_13342.a_(n4, n5 + 1, n6);
                    if (class_13342.a_(n4, n5, n6) != Blocks.lIlllIlllIIIIlIIlllIllIII || class_13342.IlIllllllIIlIIllllIIlIIIl(n4, n5, n6) != 0 || class_13342.IllIIIllIIIIlIlIlIllIIlll(n4, n5 + 1, n6) < 4 || class_05492.lllIlIIlIIIlIlIIIllIlllIl() > 2) continue;
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n4, n5, n6, Blocks.IlIllllllIIlIIllllIIlIIIl);
                }
            }
        }
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return Blocks.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(0, random, n2);
    }

    public static IIcon llIlllIIllIlllIlIlIlIIIll() {
        return Blocks.IlIllllllIIlIIllllIIlIIIl.IIIIlIIlIIIllIIIIllIIIlII;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, boolean bl) {
        return true;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, int n, int n2, int n3) {
        return true;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, Random random, int n, int n2, int n3) {
        block0: for (int i = 0; i < 128; ++i) {
            int n4 = n;
            int n5 = n2 + 1;
            int n6 = n3;
            for (int j = 0; j < i / 16; ++j) {
                if (class_13342.a_(n4 += random.nextInt(3) - 1, (n5 += (random.nextInt(3) - 1) * random.nextInt(3) / 2) - 1, n6 += random.nextInt(3) - 1) != Blocks.IlIllllllIIlIIllllIIlIIIl || class_13342.a_(n4, n5, n6).IIIllIllIIlIlIlIlIllllIIl()) continue block0;
            }
            if (class_13342.a_((int)n4, (int)n5, (int)n6).IlIlIIlllIllllllllIIIlIlI != class_1855.lllIIIllIIIIlllIlIIllIIll) continue;
            if (random.nextInt(8) != 0) {
                if (!Blocks.IlIlIIlllIllllllllIIIlIlI.lIllllIIlIIIlIllllllIIIll(class_13342, n4, n5, n6)) continue;
                class_13342.lllIIIllIIIIlllIlIIllIIll(n4, n5, n6, Blocks.IlIlIIlllIllllllllIIIlIlI, 1, 3);
                continue;
            }
            String string = class_13342.a_(n4, n6).lllIIIllIIIIlllIlIIllIIll(random, n4, n5, n6);
            llllllIlIllllIlIlIlIIIIlI.debug("Flower in " + class_13342.a_((int)n4, (int)n6).IlIIIlIllIIIllIIIIlIIlIll + ": " + string);
            class_1209 class_12092 = class_1209.lIlllIlllIIIIlIIlllIllIII(string);
            if (class_12092 == null || !class_12092.lIllllIIlIIIlIllllllIIIll(class_13342, n4, n5, n6)) continue;
            int n7 = class_1209.IlIIIIIllllllIIlllIllllll(string);
            class_13342.lllIIIllIIIIlllIlIIllIIll(n4, n5, n6, class_12092, n7, 3);
        }
    }
}

