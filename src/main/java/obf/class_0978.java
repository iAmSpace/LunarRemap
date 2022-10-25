package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.Set;

public class class_0978
extends class_1578 {
    private static final Set lIIIIlIlIIlllllIIllIIlIII = Sets.newHashSet((Object[])new Block[]{Blocks.IlIllllllIIlIIllllIIlIIIl, Blocks.lIlllIlllIIIIlIIlllIllIII, Blocks.llIIllIllIlIIlIIllIllllll, Blocks.lllIIlIIIllllllIIIIlIlIlI, Blocks.lIIllIIlIIIlllIlllIIlIIlI, Blocks.IIIlIllllIIIlllllIllIlIII, Blocks.lIIllIlIIlIIlllllIlIIllIl, Blocks.IIIlIlIllIlllllIlIllllllI, Blocks.llIllllIIIIIlIIlIlllIIlll, Blocks.lIIIlllIlIIIlIllIIIlIllll});

    public class_0978(class_1971 class_19712) {
        super(1.0f, class_19712, lIIIIlIlIIlllllIIllIIlIII);
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl(Block class_05492) {
        return class_05492 == Blocks.lIIllIIlIIIlllIlllIIlIIlI ? true : class_05492 == Blocks.IIIlIllllIIIlllllIllIlIII;
    }
}

