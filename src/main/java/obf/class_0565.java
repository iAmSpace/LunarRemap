package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;

import java.util.Random;

public class class_0565
extends class_0371 {
    private boolean[] IllIIlllllllIIlIIlIIIIlIl = new boolean[4];
    private static final class_0425[] IIIllIllIIlIlIlIlIllllIIl = new class_0425[]{new class_0425(Items.diamond, 0, 1, 3, 3), new class_0425(Items.iron_ingot, 0, 1, 5, 10), new class_0425(Items.lIIIIlIlIIlllllIIllIIlIII, 0, 2, 7, 15), new class_0425(Items.IIllllIIlIlIlIlllIIIllIIl, 0, 1, 3, 2), new class_0425(Items.bone, 0, 4, 6, 20), new class_0425(Items.lIIIlllIlIIIlIllIIIlIllll, 0, 3, 7, 16), new class_0425(Items.saddle, 0, 1, 1, 3), new class_0425(Items.IlIllIIIIllllIIllIllIIIIl, 0, 1, 1, 1), new class_0425(Items.lIlIlIIllIlIIIIIlIIlllIlI, 0, 1, 1, 1), new class_0425(Items.llllIllllllIllIIIlIlIIllI, 0, 1, 1, 1)};

    public class_0565() {
    }

    public class_0565(Random random, int n, int n2) {
        super(random, n, 64, n2, 21, 15, 21);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("hasPlacedChest0", this.IllIIlllllllIIlIIlIIIIlIl[0]);
        class_07752.lllIIIllIIIIlllIlIIllIIll("hasPlacedChest1", this.IllIIlllllllIIlIIlIIIIlIl[1]);
        class_07752.lllIIIllIIIIlllIlIIllIIll("hasPlacedChest2", this.IllIIlllllllIIlIIlIIIIlIl[2]);
        class_07752.lllIIIllIIIIlllIlIIllIIll("hasPlacedChest3", this.IllIIlllllllIIlIIlIIIIlIl[3]);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        this.IllIIlllllllIIlIIlIIIIlIl[0] = class_07752.lllIIlIIIllllllIIIIlIlIlI("hasPlacedChest0");
        this.IllIIlllllllIIlIIlIIIIlIl[1] = class_07752.lllIIlIIIllllllIIIIlIlIlI("hasPlacedChest1");
        this.IllIIlllllllIIlIIlIIIIlIl[2] = class_07752.lllIIlIIIllllllIIIIlIlIlI("hasPlacedChest2");
        this.IllIIlllllllIIlIIlIIIIlIl[3] = class_07752.lllIIlIIIllllllIIIIlIlIlI("hasPlacedChest3");
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, class_2046 class_20462) {
        int n;
        int n2;
        int n3;
        int n4;
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, -4, 0, this.lllIIIllIIIIlllIlIIllIIll - 1, 0, this.IlIllllllIIlIIllllIIlIIIl - 1, Blocks.IlIIlllllIIlIlIlllllIllll, Blocks.IlIIlllllIIlIlIlllllIllll, false);
        for (n4 = 1; n4 <= 9; ++n4) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, n4, n4, n4, this.lllIIIllIIIIlllIlIIllIIll - 1 - n4, n4, this.IlIllllllIIlIIllllIIlIIIl - 1 - n4, Blocks.IlIIlllllIIlIlIlllllIllll, Blocks.IlIIlllllIIlIlIlllllIllll, false);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, n4 + 1, n4, n4 + 1, this.lllIIIllIIIIlllIlIIllIIll - 2 - n4, n4, this.IlIllllllIIlIIllllIIlIIIl - 2 - n4, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        }
        for (n4 = 0; n4 < this.lllIIIllIIIIlllIlIIllIIll; ++n4) {
            for (n3 = 0; n3 < this.IlIllllllIIlIIllllIIlIIIl; ++n3) {
                n2 = -5;
                this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 0, n4, n2, n3, class_20462);
            }
        }
        n4 = this.lllIIIllIIIIlllIlIIllIIll(Blocks.lIIlIlIIIIIllIIIIllIlIlII, 3);
        n3 = this.lllIIIllIIIIlllIlIIllIIll(Blocks.lIIlIlIIIIIllIIIIllIlIlII, 2);
        n2 = this.lllIIIllIIIIlllIlIIllIIll(Blocks.lIIlIlIIIIIllIIIIllIlIlII, 0);
        int n5 = this.lllIIIllIIIIlllIlIIllIIll(Blocks.lIIlIlIIIIIllIIIIllIlIlII, 1);
        int n6 = 1;
        int n7 = 11;
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 0, 0, 4, 9, 4, Blocks.IlIIlllllIIlIlIlllllIllll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 10, 1, 3, 10, 3, Blocks.IlIIlllllIIlIlIlllllIllll, Blocks.IlIIlllllIIlIlIlllllIllll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIlIlIIIIIllIIIIllIlIlII, n4, 2, 10, 0, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIlIlIIIIIllIIIIllIlIlII, n3, 2, 10, 4, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIlIlIIIIIllIIIIllIlIlII, n2, 0, 10, 2, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIlIlIIIIIllIIIIllIlIlII, n5, 4, 10, 2, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, this.lllIIIllIIIIlllIlIIllIIll - 5, 0, 0, this.lllIIIllIIIIlllIlIIllIIll - 1, 9, 4, Blocks.IlIIlllllIIlIlIlllllIllll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, this.lllIIIllIIIIlllIlIIllIIll - 4, 10, 1, this.lllIIIllIIIIlllIlIIllIIll - 2, 10, 3, Blocks.IlIIlllllIIlIlIlllllIllll, Blocks.IlIIlllllIIlIlIlllllIllll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIlIlIIIIIllIIIIllIlIlII, n4, this.lllIIIllIIIIlllIlIIllIIll - 3, 10, 0, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIlIlIIIIIllIIIIllIlIlII, n3, this.lllIIIllIIIIlllIlIIllIIll - 3, 10, 4, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIlIlIIIIIllIIIIllIlIlII, n2, this.lllIIIllIIIIlllIlIIllIIll - 5, 10, 2, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIlIlIIIIIllIIIIllIlIlII, n5, this.lllIIIllIIIIlllIlIIllIIll - 1, 10, 2, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 8, 0, 0, 12, 4, 4, Blocks.IlIIlllllIIlIlIlllllIllll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 9, 1, 0, 11, 3, 4, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 2, 9, 1, 1, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 2, 9, 2, 1, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 2, 9, 3, 1, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 2, 10, 3, 1, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 2, 11, 3, 1, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 2, 11, 2, 1, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 2, 11, 1, 1, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 1, 1, 8, 3, 3, Blocks.IlIIlllllIIlIlIlllllIllll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 1, 2, 8, 2, 2, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 12, 1, 1, 16, 3, 3, Blocks.IlIIlllllIIlIlIlllllIllll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 12, 1, 2, 16, 2, 2, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 5, 4, 5, this.lllIIIllIIIIlllIlIIllIIll - 6, 4, this.IlIllllllIIlIIllllIIlIIIl - 6, Blocks.IlIIlllllIIlIlIlllllIllll, Blocks.IlIIlllllIIlIlIlllllIllll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 9, 4, 9, 11, 4, 11, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 8, 1, 8, 8, 3, 8, Blocks.IlIIlllllIIlIlIlllllIllll, 2, Blocks.IlIIlllllIIlIlIlllllIllll, 2, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 12, 1, 8, 12, 3, 8, Blocks.IlIIlllllIIlIlIlllllIllll, 2, Blocks.IlIIlllllIIlIlIlllllIllll, 2, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 8, 1, 12, 8, 3, 12, Blocks.IlIIlllllIIlIlIlllllIllll, 2, Blocks.IlIIlllllIIlIlIlllllIllll, 2, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 12, 1, 12, 12, 3, 12, Blocks.IlIIlllllIIlIlIlllllIllll, 2, Blocks.IlIIlllllIIlIlIlllllIllll, 2, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 1, 5, 4, 4, 11, Blocks.IlIIlllllIIlIlIlllllIllll, Blocks.IlIIlllllIIlIlIlllllIllll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, this.lllIIIllIIIIlllIlIIllIIll - 5, 1, 5, this.lllIIIllIIIIlllIlIIllIIll - 2, 4, 11, Blocks.IlIIlllllIIlIlIlllllIllll, Blocks.IlIIlllllIIlIlIlllllIllll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 6, 7, 9, 6, 7, 11, Blocks.IlIIlllllIIlIlIlllllIllll, Blocks.IlIIlllllIIlIlIlllllIllll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, this.lllIIIllIIIIlllIlIIllIIll - 7, 7, 9, this.lllIIIllIIIIlllIlIIllIIll - 7, 7, 11, Blocks.IlIIlllllIIlIlIlllllIllll, Blocks.IlIIlllllIIlIlIlllllIllll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 5, 5, 9, 5, 7, 11, Blocks.IlIIlllllIIlIlIlllllIllll, 2, Blocks.IlIIlllllIIlIlIlllllIllll, 2, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, this.lllIIIllIIIIlllIlIIllIIll - 6, 5, 9, this.lllIIIllIIIIlllIlIIllIIll - 6, 7, 11, Blocks.IlIIlllllIIlIlIlllllIllll, 2, Blocks.IlIIlllllIIlIlIlllllIllll, 2, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, 5, 5, 10, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, 5, 6, 10, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, 6, 6, 10, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, this.lllIIIllIIIIlllIlIIllIIll - 6, 5, 10, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, this.lllIIIllIIIIlllIlIIllIIll - 6, 6, 10, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, this.lllIIIllIIIIlllIlIIllIIll - 7, 6, 10, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 2, 4, 4, 2, 6, 4, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, this.lllIIIllIIIIlllIlIIllIIll - 3, 4, 4, this.lllIIIllIIIIlllIlIIllIIll - 3, 6, 4, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIlIlIIIIIllIIIIllIlIlII, n4, 2, 4, 5, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIlIlIIIIIllIIIIllIlIlII, n4, 2, 3, 4, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIlIlIIIIIllIIIIllIlIlII, n4, this.lllIIIllIIIIlllIlIIllIIll - 3, 4, 5, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIlIlIIIIIllIIIIllIlIlII, n4, this.lllIIIllIIIIlllIlIIllIIll - 3, 3, 4, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 1, 3, 2, 2, 3, Blocks.IlIIlllllIIlIlIlllllIllll, Blocks.IlIIlllllIIlIlIlllllIllll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, this.lllIIIllIIIIlllIlIIllIIll - 3, 1, 3, this.lllIIIllIIIIlllIlIIllIIll - 2, 2, 3, Blocks.IlIIlllllIIlIlIlllllIllll, Blocks.IlIIlllllIIlIlIlllllIllll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIlIlIIIIIllIIIIllIlIlII, 0, 1, 1, 2, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIlIlIIIIIllIIIIllIlIlII, 0, this.lllIIIllIIIIlllIlIIllIIll - 2, 1, 2, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, 1, 1, 2, 2, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, 1, this.lllIIIllIIIIlllIlIIllIIll - 2, 2, 2, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIlIlIIIIIllIIIIllIlIlII, n5, 2, 1, 2, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIlIlIIIIIllIIIIllIlIlII, n2, this.lllIIIllIIIIlllIlIIllIIll - 3, 1, 2, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 3, 5, 4, 3, 18, Blocks.IlIIlllllIIlIlIlllllIllll, Blocks.IlIIlllllIIlIlIlllllIllll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, this.lllIIIllIIIIlllIlIIllIIll - 5, 3, 5, this.lllIIIllIIIIlllIlIIllIIll - 5, 3, 17, Blocks.IlIIlllllIIlIlIlllllIllll, Blocks.IlIIlllllIIlIlIlllllIllll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 3, 1, 5, 4, 2, 16, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, this.lllIIIllIIIIlllIlIIllIIll - 6, 1, 5, this.lllIIIllIIIIlllIlIIllIIll - 5, 2, 16, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        for (n = 5; n <= 17; n += 2) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 2, 4, 1, n, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 1, 4, 2, n, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 2, this.lllIIIllIIIIlllIlIIllIIll - 5, 1, n, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 1, this.lllIIIllIIIIlllIlIIllIIll - 5, 2, n, class_20462);
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllllIlIllllIlIlIlIIIIlI, n6, 10, 0, 7, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllllIlIllllIlIlIlIIIIlI, n6, 10, 0, 8, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllllIlIllllIlIlIlIIIIlI, n6, 9, 0, 9, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllllIlIllllIlIlIlIIIIlI, n6, 11, 0, 9, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllllIlIllllIlIlIlIIIIlI, n6, 8, 0, 10, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllllIlIllllIlIlIlIIIIlI, n6, 12, 0, 10, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllllIlIllllIlIlIlIIIIlI, n6, 7, 0, 10, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllllIlIllllIlIlIlIIIIlI, n6, 13, 0, 10, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllllIlIllllIlIlIlIIIIlI, n6, 9, 0, 11, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllllIlIllllIlIlIlIIIIlI, n6, 11, 0, 11, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllllIlIllllIlIlIlIIIIlI, n6, 10, 0, 12, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllllIlIllllIlIlIlIIIIlI, n6, 10, 0, 13, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllllIlIllllIlIlIlIIIIlI, n7, 10, 0, 10, class_20462);
        for (n = 0; n <= this.lllIIIllIIIIlllIlIIllIIll - 1; n += this.lllIIIllIIIIlllIlIIllIIll - 1) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 2, n, 2, 1, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllllIlIllllIlIlIlIIIIlI, n6, n, 2, 2, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 2, n, 2, 3, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 2, n, 3, 1, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllllIlIllllIlIlIlIIIIlI, n6, n, 3, 2, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 2, n, 3, 3, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllllIlIllllIlIlIlIIIIlI, n6, n, 4, 1, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 1, n, 4, 2, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllllIlIllllIlIlIlIIIIlI, n6, n, 4, 3, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 2, n, 5, 1, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllllIlIllllIlIlIlIIIIlI, n6, n, 5, 2, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 2, n, 5, 3, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllllIlIllllIlIlIlIIIIlI, n6, n, 6, 1, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 1, n, 6, 2, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllllIlIllllIlIlIlIIIIlI, n6, n, 6, 3, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllllIlIllllIlIlIlIIIIlI, n6, n, 7, 1, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllllIlIllllIlIlIlIIIIlI, n6, n, 7, 2, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllllIlIllllIlIlIlIIIIlI, n6, n, 7, 3, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 2, n, 8, 1, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 2, n, 8, 2, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 2, n, 8, 3, class_20462);
        }
        for (n = 2; n <= this.lllIIIllIIIIlllIlIIllIIll - 3; n += this.lllIIIllIIIIlllIlIIllIIll - 3 - 2) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 2, n - 1, 2, 0, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllllIlIllllIlIlIlIIIIlI, n6, n, 2, 0, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 2, n + 1, 2, 0, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 2, n - 1, 3, 0, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllllIlIllllIlIlIlIIIIlI, n6, n, 3, 0, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 2, n + 1, 3, 0, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllllIlIllllIlIlIlIIIIlI, n6, n - 1, 4, 0, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 1, n, 4, 0, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllllIlIllllIlIlIlIIIIlI, n6, n + 1, 4, 0, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 2, n - 1, 5, 0, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllllIlIllllIlIlIlIIIIlI, n6, n, 5, 0, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 2, n + 1, 5, 0, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllllIlIllllIlIlIlIIIIlI, n6, n - 1, 6, 0, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 1, n, 6, 0, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllllIlIllllIlIlIlIIIIlI, n6, n + 1, 6, 0, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllllIlIllllIlIlIlIIIIlI, n6, n - 1, 7, 0, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllllIlIllllIlIlIlIIIIlI, n6, n, 7, 0, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllllIlIllllIlIlIlIIIIlI, n6, n + 1, 7, 0, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 2, n - 1, 8, 0, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 2, n, 8, 0, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 2, n + 1, 8, 0, class_20462);
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 8, 4, 0, 12, 6, 0, Blocks.IlIIlllllIIlIlIlllllIllll, 2, Blocks.IlIIlllllIIlIlIlllllIllll, 2, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, 8, 6, 0, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, 12, 6, 0, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllllIlIllllIlIlIlIIIIlI, n6, 9, 5, 0, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 1, 10, 5, 0, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllllIlIllllIlIlIlIIIIlI, n6, 11, 5, 0, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 8, -14, 8, 12, -11, 12, Blocks.IlIIlllllIIlIlIlllllIllll, 2, Blocks.IlIIlllllIIlIlIlllllIllll, 2, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 8, -10, 8, 12, -10, 12, Blocks.IlIIlllllIIlIlIlllllIllll, 1, Blocks.IlIIlllllIIlIlIlllllIllll, 1, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 8, -9, 8, 12, -9, 12, Blocks.IlIIlllllIIlIlIlllllIllll, 2, Blocks.IlIIlllllIIlIlIlllllIllll, 2, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 8, -8, 8, 12, -1, 12, Blocks.IlIIlllllIIlIlIlllllIllll, Blocks.IlIIlllllIIlIlIlllllIllll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 9, -11, 9, 11, -1, 11, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIlIIllIIIlllIllIIlIllI, 0, 10, -11, 10, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 9, -13, 9, 11, -13, 11, Blocks.tnt, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, 8, -11, 10, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, 8, -10, 10, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 1, 7, -10, 10, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 2, 7, -11, 10, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, 12, -11, 10, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, 12, -10, 10, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 1, 13, -10, 10, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 2, 13, -11, 10, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, 10, -11, 8, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, 10, -10, 8, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 1, 10, -10, 7, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 2, 10, -11, 7, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, 10, -11, 12, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, 10, -10, 12, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 1, 10, -10, 13, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIlllllIIlIlIlllllIllll, 2, 10, -11, 13, class_20462);
        for (n = 0; n < 4; ++n) {
            if (this.IllIIlllllllIIlIIlIIIIlIl[n]) continue;
            int n8 = class_1632.lllIIIllIIIIlllIlIIllIIll[n] * 2;
            int n9 = class_1632.lllIlIIlIIIlIlIIIllIlllIl[n] * 2;
            this.IllIIlllllllIIlIIlIIIIlIl[n] = this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, random, 10 + n8, -11, 10 + n9, class_0425.lllIIIllIIIIlllIlIIllIIll(IIIllIllIIlIlIlIlIllllIIl, Items.lIllIlIlIIIIlIlIIlIlIlllI.lllIIIllIIIIlllIlIIllIIll(random)), 2 + random.nextInt(5));
        }
        return true;
    }
}

