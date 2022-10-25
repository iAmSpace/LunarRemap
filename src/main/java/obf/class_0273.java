package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.ImmutablePair
 */
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.apache.commons.lang3.tuple.ImmutablePair;

public class class_0273
extends Block {
    public static final String[] llllllIlIllllIlIlIlIIIIlI = new String[]{"stone", "cobble", "brick", "mossybrick", "crackedbrick", "chiseledbrick"};

    public class_0273() {
        super(class_1855.llIIlIlIlllIIllIlIlllIllI);
        this.IlIllllllIIlIIllllIIlIIIl(0.0f);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.IlIllllllIIlIIllllIIlIIIl);
    }

    @Override
    public IIcon lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        switch (n2) {
            case 1: {
                return Blocks.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII(n);
            }
            case 2: {
                return Blocks.lllllIllllIIIIllIIlIlIlII.lIlllIlllIIIIlIIlllIllIII(n);
            }
            case 3: {
                return Blocks.lllllIllllIIIIllIIlIlIlII.lllIIIllIIIIlllIlIIllIIll(n, 1);
            }
            case 4: {
                return Blocks.lllllIllllIIIIllIIlIlIlII.lllIIIllIIIIlllIlIIllIIll(n, 2);
            }
            case 5: {
                return Blocks.lllllIllllIIIIllIIlIlIlII.lllIIIllIIIIlllIlIIllIIll(n, 3);
            }
        }
        return Blocks.lllIlIIlIIIlIlIIIllIlllIl.lIlllIlllIIIIlIIlllIllIII(n);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
            class_0085 class_00852 = new class_0085(class_13342);
            class_00852.lllIlIIlIIIlIlIIIllIlllIl((double)n + 0.5, n2, (double)n3 + 0.5, 0.0f, 0.0f);
            class_13342.lllIIIllIIIIlllIlIIllIIll(class_00852);
            class_00852.lIlIIlllllIlllllIlIIIllll();
        }
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, n4);
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(Random random) {
        return 0;
    }

    public static boolean IlIllllllIIlIIllllIIlIIIl(Block class_05492) {
        return class_05492 == Blocks.lllIlIIlIIIlIlIIIllIlllIl || class_05492 == Blocks.IlIIIIIllllllIIlllIllllll || class_05492 == Blocks.lllllIllllIIIIllIIlIlIlII;
    }

    public static int lllIIIllIIIIlllIlIIllIIll(Block class_05492, int n) {
        if (n == 0) {
            if (class_05492 == Blocks.IlIIIIIllllllIIlllIllllll) {
                return 1;
            }
            if (class_05492 == Blocks.lllllIllllIIIIllIIlIlIlII) {
                return 2;
            }
        } else if (class_05492 == Blocks.lllllIllllIIIIllIIlIlIlII) {
            switch (n) {
                case 1: {
                    return 3;
                }
                case 2: {
                    return 4;
                }
                case 3: {
                    return 5;
                }
            }
        }
        return 0;
    }

    public static ImmutablePair IllIIlllllllIIlIIlIIIIlIl(int n) {
        switch (n) {
            case 1: {
                return new ImmutablePair((Object) Blocks.IlIIIIIllllllIIlllIllllll, (Object)0);
            }
            case 2: {
                return new ImmutablePair((Object) Blocks.lllllIllllIIIIllIIlIlIlII, (Object)0);
            }
            case 3: {
                return new ImmutablePair((Object) Blocks.lllllIllllIIIIllIIlIlIlII, (Object)1);
            }
            case 4: {
                return new ImmutablePair((Object) Blocks.lllllIllllIIIIllIIlIlIlII, (Object)2);
            }
            case 5: {
                return new ImmutablePair((Object) Blocks.lllllIllllIIIIllIIlIlIlII, (Object)3);
            }
        }
        return new ImmutablePair((Object) Blocks.lllIlIIlIIIlIlIIIllIlllIl, (Object)0);
    }

    @Override
    protected ItemStack IIIllIIlIIIIIIlIlIIllIIlI(int n) {
        switch (n) {
            case 1: {
                return new ItemStack(Blocks.IlIIIIIllllllIIlllIllllll);
            }
            case 2: {
                return new ItemStack(Blocks.lllllIllllIIIIllIIlIlIlII);
            }
            case 3: {
                return new ItemStack(Blocks.lllllIllllIIIIllIIlIlIlII, 1, 1);
            }
            case 4: {
                return new ItemStack(Blocks.lllllIllllIIIIllIIlIlIlII, 1, 2);
            }
            case 5: {
                return new ItemStack(Blocks.lllllIllllIIIIllIIlIlIlII, 1, 3);
            }
        }
        return new ItemStack(Blocks.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, float f, int n5) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
            class_0085 class_00852 = new class_0085(class_13342);
            class_00852.lllIlIIlIIIlIlIIIllIlllIl((double)n + 0.5, n2, (double)n3 + 0.5, 0.0f, 0.0f);
            class_13342.lllIIIllIIIIlllIlIIllIIll(class_00852);
            class_00852.lIlIIlllllIlllllIlIIIllll();
        }
    }

    @Override
    public int IllIIlllllllIIlIIlIIIIlIl(class_1334 class_13342, int n, int n2, int n3) {
        return class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(Item class_06112, class_0931 class_09312, List list) {
        for (int i = 0; i < llllllIlIllllIlIlIlIIIIlI.length; ++i) {
            list.add(new ItemStack(class_06112, 1, i));
        }
    }
}

