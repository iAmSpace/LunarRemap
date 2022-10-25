package obf;

import net.minecraft.util.IChatComponent;
import net.minecraft.stats.IStatType;
import net.minecraft.stats.StatBase;
import net.minecraft.stats.StatList;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0320
extends StatBase {
    public class_0320(String string, IChatComponent class_22552, IStatType class_18692) {
        super(string, class_22552, class_18692);
    }

    public class_0320(String string, IChatComponent class_22552) {
        super(string, class_22552);
    }

    @Override
    public StatBase IllIIlllllllIIlIIlIIIIlIl() {
        super.IllIIlllllllIIlIIlIIIIlIl();
        StatList.IlIllllllIIlIIllllIIlIIIl.add(this);
        return this;
    }
}

