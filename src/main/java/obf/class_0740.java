package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class class_0740
extends class_0351 {
    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        if (n2 > 3) {
            n2 = 3;
        }
        return random.nextInt(10 - n2 * 3) == 0 ? Items.IIIlIlIllIlllllIlIllllllI : Item.getItemFromBlock(this);
    }
}

