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

public class class_0185
extends class_1578 {
    private static final Set lIIIIlIlIIlllllIIllIIlIII = Sets.newHashSet((Object[])new Block[]{Blocks.IlIIIIIllllllIIlllIllllll, Blocks.llllIlIIIIIIIIIlllIIlIIIl, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, Blocks.lllIlIIlIIIlIlIIIllIlllIl, Blocks.IlIIlllllIIlIlIlllllIllll, Blocks.llIlllIlIIllIlIIIIllIIlIl, Blocks.IlIlIIlIlIllIIlIlIIllIIIl, Blocks.IllllIIIIlIIlIIIIlllIIIIl, Blocks.lllllIlllIIllIlIIlIIIllII, Blocks.lIlIlIIIIIIlIIllllIlIIllI, Blocks.IlIlllIIIIIIlIIllIIllIlll, Blocks.diamond_ore, Blocks.IlllIIlllllllIIllIlIllllI, Blocks.IllIIllIlIlllIllIllIlIIIl, Blocks.lllllllIlIIlIlIIIlIlIIlll, Blocks.llIIlIllIllllIlIIIIlIIlll, Blocks.llIllllIlIllIIIlIllIIlIlI, Blocks.lIIIlIIllIllIIlIIlIIIllII, Blocks.lIlIllIIllIIIIlllIlIlllIl, Blocks.rail, Blocks.IIlIIlIlIlIllIIlIlIIIIlll, Blocks.IIIIIIIIlIllIIllIIlllIllI, Blocks.IlIlIIlllIIlIlllllIlIIIIl});

    protected class_0185(class_1971 class_19712) {
        super(2.0f, class_19712, lIIIIlIlIIlllllIIllIIlIII);
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl(Block class_05492) {
        return class_05492 == Blocks.obsidian ? this.IllIIIllIIIIlIlIlIllIIlll.lIlllIlllIIIIlIIlllIllIII() == 3 : (class_05492 != Blocks.IlllIIlllllllIIllIlIllllI && class_05492 != Blocks.diamond_ore ? (class_05492 != Blocks.lIIIIlIIIIllIlIIllllIlIII && class_05492 != Blocks.lIlIlllIllllIIlllIlllIIIl ? (class_05492 != Blocks.lIlIlIIIIIIlIIllllIlIIllI && class_05492 != Blocks.IlIlllIIIIIIlIIllIIllIlll ? (class_05492 != Blocks.IllllIIIIlIIlIIIIlllIIIIl && class_05492 != Blocks.IlIlIIlIlIllIIlIlIIllIIIl ? (class_05492 != Blocks.llIllllIlIllIIIlIllIIlIlI && class_05492 != Blocks.llIIlIllIllllIlIIIIlIIlll ? (class_05492 != Blocks.lIIIlIIllIllIIlIIlIIIllII && class_05492 != Blocks.lIlIllIIllIIIIlllIlIlllIl ? (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.IlIIIIIllllllIIlllIllllll ? true : (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lIllllIIlIIIlIllllllIIIll ? true : class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.IIIllIIlIIIIIIlIlIIllIIlI)) : this.IllIIIllIIIIlIlIlIllIIlll.lIlllIlllIIIIlIIlllIllIII() >= 2) : this.IllIIIllIIIIlIlIlIllIIlll.lIlllIlllIIIIlIIlllIllIII() >= 1) : this.IllIIIllIIIIlIlIlIllIIlll.lIlllIlllIIIIlIIlllIllIII() >= 1) : this.IllIIIllIIIIlIlIlIllIIlll.lIlllIlllIIIIlIIlllIllIII() >= 2) : this.IllIIIllIIIIlIlIlIllIIlll.lIlllIlllIIIIlIIlllIllIII() >= 2) : this.IllIIIllIIIIlIlIlIllIIlll.lIlllIlllIIIIlIIlllIllIII() >= 2);
    }

    @Override
    public float lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, Block class_05492) {
        return class_05492.lIllllIIlIIIlIllllllIIIll() != class_1855.lIllllIIlIIIlIllllllIIIll && class_05492.lIllllIIlIIIlIllllllIIIll() != class_1855.IIIllIIlIIIIIIlIlIIllIIlI && class_05492.lIllllIIlIIIlIllllllIIIll() != class_1855.IlIIIIIllllllIIlllIllllll ? super.lllIIIllIIIIlllIlIIllIIll(class_08972, class_05492) : this.IIIllIllIIlIlIlIlIllllIIl;
    }
}

