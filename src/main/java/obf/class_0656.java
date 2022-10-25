package obf;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0656
extends class_2178 {
    public class_0656(class_1334 class_13342) {
        super(class_13342);
    }

    public class_0656(class_1334 class_13342, double d, double d2, double d3) {
        super(class_13342, d, d2, d3);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582) {
        super.lllIIIllIIIIlllIlIIllIIll(class_00582);
        this.lllIIIllIIIIlllIlIIllIIll(Item.getItemFromBlock(Blocks.IllIlIlIIIlllIIllIIIIlIll), 1, 0.0f);
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll() {
        return 27;
    }

    @Override
    public int IlIllllllIIlIIllllIIlIIIl() {
        return 1;
    }

    @Override
    public Block lIlllIlllIIIIlIIlllIllIII() {
        return Blocks.IllIlIlIIIlllIIllIIIIlIll;
    }

    @Override
    public int lIlIlIIlIIIIlIIIIIlllIIII() {
        return 8;
    }
}

