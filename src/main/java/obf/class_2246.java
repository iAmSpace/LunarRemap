package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class class_2246
extends Block {
    private IIcon llllllIlIllllIlIlIlIIIIlI;

    protected class_2246() {
        super(class_1855.IllIIIIllIIllIllIlllIlIIl);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public IIcon lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return n != 1 && n != 0 ? this.llIIIIllIIIIIIIlIIIlIIIIl : this.llllllIlIllllIlIlIlIIIIlI;
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return Items.IllIlIlIIIlIllIlIlIIlllII;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(Random random) {
        return 3 + random.nextInt(5);
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(int n, Random random) {
        int n2 = this.lllIIIllIIIIlllIlIIllIIll(random) + random.nextInt(1 + n);
        if (n2 > 9) {
            n2 = 9;
        }
        return n2;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llIIIIllIIIIIIIlIIIlIIIIl = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_side");
        this.llllllIlIllllIlIlIlIIIIlI = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_top");
    }
}

