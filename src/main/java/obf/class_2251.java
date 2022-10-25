package obf;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;

import java.util.Random;

public class class_2251
extends class_0371 {
    private boolean IllIIlllllllIIlIIlIIIIlIl;
    private boolean IIIllIllIIlIlIlIlIllllIIl;
    private boolean IllIIIllIIIIlIlIlIllIIlll;
    private boolean lIIIIlIlIIlllllIIllIIlIII;
    private static final class_0425[] llIIlllIllIllllIIIlIIIIII = new class_0425[]{new class_0425(Items.diamond, 0, 1, 3, 3), new class_0425(Items.iron_ingot, 0, 1, 5, 10), new class_0425(Items.lIIIIlIlIIlllllIIllIIlIII, 0, 2, 7, 15), new class_0425(Items.IIllllIIlIlIlIlllIIIllIIl, 0, 1, 3, 2), new class_0425(Items.bone, 0, 4, 6, 20), new class_0425(Items.lIIIlllIlIIIlIllIIIlIllll, 0, 3, 7, 16), new class_0425(Items.saddle, 0, 1, 1, 3), new class_0425(Items.IlIllIIIIllllIIllIllIIIIl, 0, 1, 1, 1), new class_0425(Items.lIlIlIIllIlIIIIIlIIlllIlI, 0, 1, 1, 1), new class_0425(Items.llllIllllllIllIIIlIlIIllI, 0, 1, 1, 1)};
    private static final class_0425[] llIIllIllIlIIlIIllIllllll = new class_0425[]{new class_0425(Items.arrow, 0, 2, 7, 30)};
    private static class_0000 lllIIlIIIllllllIIIIlIlIlI = new class_0000(null);

    public class_2251() {
    }

    public class_2251(Random random, int n, int n2) {
        super(random, n, 64, n2, 12, 10, 15);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("placedMainChest", this.IllIIlllllllIIlIIlIIIIlIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("placedHiddenChest", this.IIIllIllIIlIlIlIlIllllIIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("placedTrap1", this.IllIIIllIIIIlIlIlIllIIlll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("placedTrap2", this.lIIIIlIlIIlllllIIllIIlIII);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        this.IllIIlllllllIIlIIlIIIIlIl = class_07752.lllIIlIIIllllllIIIIlIlIlI("placedMainChest");
        this.IIIllIllIIlIlIlIlIllllIIl = class_07752.lllIIlIIIllllllIIIIlIlIlI("placedHiddenChest");
        this.IllIIIllIIIIlIlIlIllIIlll = class_07752.lllIIlIIIllllllIIIIlIlIlI("placedTrap1");
        this.lIIIIlIlIIlllllIIllIIlIII = class_07752.lllIIlIIIllllllIIIIlIlIlI("placedTrap2");
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, class_2046 class_20462) {
        int n;
        if (!this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0)) {
            return false;
        }
        int n2 = this.lllIIIllIIIIlllIlIIllIIll(Blocks.llIIIlIlIlIIlIllIIIllIlIl, 3);
        int n3 = this.lllIIIllIIIIlllIlIIllIIll(Blocks.llIIIlIlIlIIlIllIIIllIlIl, 2);
        int n4 = this.lllIIIllIIIIlllIlIIllIIll(Blocks.llIIIlIlIlIIlIllIIIllIlIl, 0);
        int n5 = this.lllIIIllIIIIlllIlIIllIIll(Blocks.llIIIlIlIlIIlIllIIIllIlIl, 1);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, -4, 0, this.lllIIIllIIIIlllIlIIllIIll - 1, 0, this.IlIllllllIIlIIllllIIlIIIl - 1, false, random, lllIIlIIIllllllIIIIlIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 2, 1, 2, 9, 2, 2, false, random, lllIIlIIIllllllIIIIlIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 2, 1, 12, 9, 2, 12, false, random, lllIIlIIIllllllIIIIlIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 2, 1, 3, 2, 2, 11, false, random, lllIIlIIIllllllIIIIlIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 9, 1, 3, 9, 2, 11, false, random, lllIIlIIIllllllIIIIlIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 3, 1, 10, 6, 1, false, random, lllIIlIIIllllllIIIIlIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 3, 13, 10, 6, 13, false, random, lllIIlIIIllllllIIIIlIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 3, 2, 1, 6, 12, false, random, lllIIlIIIllllllIIIIlIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 10, 3, 2, 10, 6, 12, false, random, lllIIlIIIllllllIIIIlIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 2, 3, 2, 9, 3, 12, false, random, lllIIlIIIllllllIIIIlIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 2, 6, 2, 9, 6, 12, false, random, lllIIlIIIllllllIIIIlIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 3, 7, 3, 8, 7, 11, false, random, lllIIlIIIllllllIIIIlIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 8, 4, 7, 8, 10, false, random, lllIIlIIIllllllIIIIlIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 3, 1, 3, 8, 2, 11);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 3, 6, 7, 3, 9);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 2, 4, 2, 9, 5, 12);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 6, 5, 7, 6, 9);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 5, 7, 6, 6, 7, 8);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 5, 1, 2, 6, 2, 2);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 5, 2, 12, 6, 2, 12);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 5, 5, 1, 6, 5, 1);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 5, 5, 13, 6, 5, 13);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, 1, 5, 5, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, 10, 5, 5, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, 1, 5, 9, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, 10, 5, 9, class_20462);
        for (n = 0; n <= 14; n += 14) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 2, 4, n, 2, 5, n, false, random, lllIIlIIIllllllIIIIlIlIlI);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 4, n, 4, 5, n, false, random, lllIIlIIIllllllIIIIlIlIlI);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 7, 4, n, 7, 5, n, false, random, lllIIlIIIllllllIIIIlIlIlI);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 9, 4, n, 9, 5, n, false, random, lllIIlIIIllllllIIIIlIlIlI);
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 5, 6, 0, 6, 6, 0, false, random, lllIIlIIIllllllIIIIlIlIlI);
        for (n = 0; n <= 11; n += 11) {
            for (int i = 2; i <= 12; i += 2) {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, n, 4, i, n, 5, i, false, random, lllIIlIIIllllllIIIIlIlIlI);
            }
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, n, 6, 5, n, 6, 5, false, random, lllIIlIIIllllllIIIIlIlIlI);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, n, 6, 9, n, 6, 9, false, random, lllIIlIIIllllllIIIIlIlIlI);
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 2, 7, 2, 2, 9, 2, false, random, lllIIlIIIllllllIIIIlIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 9, 7, 2, 9, 9, 2, false, random, lllIIlIIIllllllIIIIlIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 2, 7, 12, 2, 9, 12, false, random, lllIIlIIIllllllIIIIlIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 9, 7, 12, 9, 9, 12, false, random, lllIIlIIIllllllIIIIlIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 9, 4, 4, 9, 4, false, random, lllIIlIIIllllllIIIIlIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 7, 9, 4, 7, 9, 4, false, random, lllIIlIIIllllllIIIIlIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 9, 10, 4, 9, 10, false, random, lllIIlIIIllllllIIIIlIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 7, 9, 10, 7, 9, 10, false, random, lllIIlIIIllllllIIIIlIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 5, 9, 7, 6, 9, 7, false, random, lllIIlIIIllllllIIIIlIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIIIlIlIlIIlIllIIIllIlIl, n2, 5, 9, 6, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIIIlIlIlIIlIllIIIllIlIl, n2, 6, 9, 6, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIIIlIlIlIIlIllIIIllIlIl, n3, 5, 9, 8, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIIIlIlIlIIlIllIIIllIlIl, n3, 6, 9, 8, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIIIlIlIlIIlIllIIIllIlIl, n2, 4, 0, 0, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIIIlIlIlIIlIllIIIllIlIl, n2, 5, 0, 0, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIIIlIlIlIIlIllIIIllIlIl, n2, 6, 0, 0, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIIIlIlIlIIlIllIIIllIlIl, n2, 7, 0, 0, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIIIlIlIlIIlIllIIIllIlIl, n2, 4, 1, 8, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIIIlIlIlIIlIllIIIllIlIl, n2, 4, 2, 9, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIIIlIlIlIIlIllIIIllIlIl, n2, 4, 3, 10, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIIIlIlIlIIlIllIIIllIlIl, n2, 7, 1, 8, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIIIlIlIlIIlIllIIIllIlIl, n2, 7, 2, 9, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIIIlIlIlIIlIllIIIllIlIl, n2, 7, 3, 10, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 1, 9, 4, 1, 9, false, random, lllIIlIIIllllllIIIIlIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 7, 1, 9, 7, 1, 9, false, random, lllIIlIIIllllllIIIIlIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 1, 10, 7, 2, 10, false, random, lllIIlIIIllllllIIIIlIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 5, 4, 5, 6, 4, 5, false, random, lllIIlIIIllllllIIIIlIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIIIlIlIlIIlIllIIIllIlIl, n4, 4, 4, 5, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIIIlIlIlIIlIllIIIllIlIl, n5, 7, 4, 5, class_20462);
        for (n = 0; n < 4; ++n) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIIIlIlIlIIlIllIIIllIlIl, n3, 5, 0 - n, 6 + n, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIIIlIlIlIIlIllIIIllIlIl, n3, 6, 0 - n, 6 + n, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 5, 0 - n, 7 + n, 6, 0 - n, 9 + n);
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, -3, 12, 10, -1, 13);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, -3, 1, 3, -1, 13);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, -3, 1, 9, -1, 5);
        for (n = 1; n <= 13; n += 2) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, -3, n, 1, -2, n, false, random, lllIIlIIIllllllIIIIlIlIlI);
        }
        for (n = 2; n <= 12; n += 2) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, -1, n, 3, -1, n, false, random, lllIIlIIIllllllIIIIlIlIlI);
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 2, -2, 1, 5, -2, 1, false, random, lllIIlIIIllllllIIIIlIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 7, -2, 1, 9, -2, 1, false, random, lllIIlIIIllllllIIIIlIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 6, -3, 1, 6, -3, 1, false, random, lllIIlIIIllllllIIIIlIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 6, -1, 1, 6, -1, 1, false, random, lllIIlIIIllllllIIIIlIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIllllIIlIlIlIlllIIIllIIl, this.lllIIIllIIIIlllIlIIllIIll(Blocks.IIllllIIlIlIlIlllIIIllIIl, 3) | 4, 1, -3, 8, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIllllIIlIlIlIlllIIIllIIl, this.lllIIIllIIIIlllIlIIllIIll(Blocks.IIllllIIlIlIlIlllIIIllIIl, 1) | 4, 4, -3, 8, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIllIIIlIlllllllIIIlllll, 4, 2, -3, 8, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIllIIIlIlllllllIIIlllll, 4, 3, -3, 8, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIlIllIIIllIIIIlIIlIll, 0, 5, -3, 7, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIlIllIIIllIIIIlIIlIll, 0, 5, -3, 6, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIlIllIIIllIIIIlIIlIll, 0, 5, -3, 5, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIlIllIIIllIIIIlIIlIll, 0, 5, -3, 4, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIlIllIIIllIIIIlIIlIll, 0, 5, -3, 3, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIlIllIIIllIIIIlIIlIll, 0, 5, -3, 2, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIlIllIIIllIIIIlIIlIll, 0, 5, -3, 1, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIlIllIIIllIIIIlIIlIll, 0, 4, -3, 1, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIlllIlIIllIlIIIIllIIlIl, 0, 3, -3, 1, class_20462);
        if (!this.IllIIIllIIIIlIlIlIllIIlll) {
            this.IllIIIllIIIIlIlIlIllIIlll = this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, random, 3, -2, 1, 2, llIIllIllIlIIlIIllIllllll, 2);
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIlIlllIIlIIIIlIlIIIIlll, 15, 3, -2, 2, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIllllIIlIlIlIlllIIIllIIl, this.lllIIIllIIIIlllIlIIllIIll(Blocks.IIllllIIlIlIlIlllIIIllIIl, 2) | 4, 7, -3, 1, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIllllIIlIlIlIlllIIIllIIl, this.lllIIIllIIIIlllIlIIllIIll(Blocks.IIllllIIlIlIlIlllIIIllIIl, 0) | 4, 7, -3, 5, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIllIIIlIlllllllIIIlllll, 4, 7, -3, 2, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIllIIIlIlllllllIIIlllll, 4, 7, -3, 3, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIllIIIlIlllllllIIIlllll, 4, 7, -3, 4, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIlIllIIIllIIIIlIIlIll, 0, 8, -3, 6, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIlIllIIIllIIIIlIIlIll, 0, 9, -3, 6, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIlIllIIIllIIIIlIIlIll, 0, 9, -3, 5, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIlllIlIIllIlIIIIllIIlIl, 0, 9, -3, 4, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIlIllIIIllIIIIlIIlIll, 0, 9, -2, 4, class_20462);
        if (!this.lIIIIlIlIIlllllIIllIIlIII) {
            this.lIIIIlIlIIlllllIIllIIlIII = this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, random, 9, -2, 3, 4, llIIllIllIlIIlIIllIllllll, 2);
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIlIlllIIlIIIIlIlIIIIlll, 15, 8, -1, 3, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIlIlllIIlIIIIlIlIIIIlll, 15, 8, -2, 3, class_20462);
        if (!this.IllIIlllllllIIlIIlIIIIlIl) {
            this.IllIIlllllllIIlIIlIIIIlIl = this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, random, 8, -3, 3, class_0425.lllIIIllIIIIlllIlIIllIIll(llIIlllIllIllllIIIlIIIIII, Items.lIllIlIlIIIIlIlIIlIlIlllI.lllIIIllIIIIlllIlIIllIIll(random)), 2 + random.nextInt(5));
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIlllIlIIllIlIIIIllIIlIl, 0, 9, -3, 2, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIlllIlIIllIlIIIIllIIlIl, 0, 8, -3, 1, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIlllIlIIllIlIIIIllIIlIl, 0, 4, -3, 5, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIlllIlIIllIlIIIIllIIlIl, 0, 5, -2, 5, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIlllIlIIllIlIIIIllIIlIl, 0, 5, -1, 5, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIlllIlIIllIlIIIIllIIlIl, 0, 6, -3, 5, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIlllIlIIllIlIIIIllIIlIl, 0, 7, -2, 5, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIlllIlIIllIlIIIIllIIlIl, 0, 7, -1, 5, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIlllIlIIllIlIIIIllIIlIl, 0, 8, -3, 5, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 9, -1, 1, 9, -1, 5, false, random, lllIIlIIIllllllIIIIlIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 8, -3, 8, 10, -1, 10);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 3, 8, -2, 11, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 3, 9, -2, 11, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 3, 10, -2, 11, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIIIIIlIIlIIIIllIIIlIIII, class_0446.IllIIlllllllIIlIIlIIIIlIl(this.lllIIIllIIIIlllIlIIllIIll(Blocks.llIIIIIlIIlIIIIllIIIlIIII, 2)), 8, -2, 12, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIIIIIlIIlIIIIllIIIlIIII, class_0446.IllIIlllllllIIlIIlIIIIlIl(this.lllIIIllIIIIlllIlIIllIIll(Blocks.llIIIIIlIIlIIIIllIIIlIIII, 2)), 9, -2, 12, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIIIIIlIIlIIIIllIIIlIIII, class_0446.IllIIlllllllIIlIIlIIIIlIl(this.lllIIIllIIIIlllIlIIllIIll(Blocks.llIIIIIlIIlIIIIllIIIlIIII, 2)), 10, -2, 12, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 8, -3, 8, 8, -3, 10, false, random, lllIIlIIIllllllIIIIlIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 10, -3, 8, 10, -3, 10, false, random, lllIIlIIIllllllIIIIlIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIlllIlIIllIlIIIIllIIlIl, 0, 10, -2, 9, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIlIllIIIllIIIIlIIlIll, 0, 8, -2, 9, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIlIllIIIllIIIIlIIlIll, 0, 8, -2, 10, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIlIllIIIllIIIIlIIlIll, 0, 10, -1, 9, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIIIlllIlllIlIllIIIIllIl, 1, 9, -2, 8, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIIIlllIlllIlIllIIIIllIl, this.lllIIIllIIIIlllIlIIllIIll(Blocks.llIIIlllIlllIlIllIIIIllIl, 4), 10, -2, 8, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIIIlllIlllIlIllIIIIllIl, this.lllIIIllIIIIlllIlIIllIIll(Blocks.llIIIlllIlllIlIllIIIIllIl, 4), 10, -1, 8, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIlllIlIIllIIlIlIllIlIIl, this.lllIIIllIIIIlllIlIIllIIll(Blocks.IIIlllIlIIllIIlIlIllIlIIl, 2), 10, -2, 10, class_20462);
        if (!this.IIIllIllIIlIlIlIlIllllIIl) {
            this.IIIllIllIIlIlIlIlIllllIIl = this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, random, 9, -3, 10, class_0425.lllIIIllIIIIlllIlIIllIIll(llIIlllIllIllllIIIlIIIIII, Items.lIllIlIlIIIIlIlIIlIlIlllI.lllIIIllIIIIlllIlIIllIIll(random)), 2 + random.nextInt(5));
        }
        return true;
    }
}

