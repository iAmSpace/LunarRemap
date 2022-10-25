package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

import java.util.Set;

public class class_0948
extends class_1578 {
    private static final Set lIIIIlIlIIlllllIIllIIlIII = Sets.newHashSet((Object[])new Block[]{Blocks.lIllllIIlIIIlIllllllIIIll, Blocks.bookshelf, Blocks.log, Blocks.lIIlIIIIIlIlllIlIIlIlIlll, Blocks.IllIlIlIIIlllIIllIIIIlIll, Blocks.lIlIIlllllIlllllIlIIIllll, Blocks.IllIlllIIIlllllIllIIlIlIl});

    protected class_0948(class_1971 class_19712) {
        super(3.0f, class_19712, lIIIIlIlIIlllllIIllIIlIII);
    }

    @Override
    public float lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, Block class_05492) {
        return class_05492.lIllllIIlIIIlIllllllIIIll() != class_1855.lIlllIlllIIIIlIIlllIllIII && class_05492.lIllllIIlIIIlIllllllIIIll() != class_1855.lIIIIlIlIIlllllIIllIIlIII && class_05492.lIllllIIlIIIlIllllllIIIll() != class_1855.llIIlllIllIllllIIIlIIIIII ? super.lllIIIllIIIIlllIlIIllIIll(class_08972, class_05492) : this.IIIllIllIIlIlIlIlIllllIIl;
    }
}

