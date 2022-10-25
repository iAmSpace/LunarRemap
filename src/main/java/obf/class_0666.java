package obf;

import net.minecraft.util.IChatComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentTranslation;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0666
extends class_1494 {
    private class_1521 lllllIlllIIllIlIIlIIIllII;

    public class_0666(String string, class_1521 class_15212, class_1521 class_15213) {
        super(string, class_15212);
        this.lllllIlllIIllIlIIlIIIllII = class_15213;
    }

    @Override
    public class_1521 IIIllIllIIlIlIlIlIllllIIl() {
        return this.IlIlIIlIlIllIIlIlIIllIIIl;
    }

    @Override
    public class_1521 IllIIIllIIIIlIlIlIllIIlll() {
        return this.lllllIlllIIllIlIIlIIIllII;
    }

    @Override
    public IChatComponent lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652) {
        IChatComponent class_22552 = this.lllllIlllIIllIlIIlIIIllII == null ? this.IlIlIIlIlIllIIlIlIIllIIIl.llIIIIllIIIIIIIlIIIlIIIIl() : this.lllllIlllIIllIlIIlIIIllII.llIIIIllIIIIIIIlIIIlIIIIl();
        ItemStack class_08972 = this.lllllIlllIIllIlIIlIIIllII instanceof class_1965 ? ((class_1965)this.lllllIlllIIllIlIIlIIIllII).lIIIIlIlIlIIIlIIllIIlIlIl() : null;
        String string = "death.attack." + this.IlIlllIIIIIIlIIllIIllIlll;
        String string2 = string + ".item";
        return class_08972 != null && class_08972.IlIIIlIIIIllIIIllIIIIIIll() && class_1586.IlIllllllIIlIIllllIIlIIIl(string2) ? new ChatComponentTranslation(string2, class_19652.llIIIIllIIIIIIIlIIIlIIIIl(), class_22552, class_08972.IIlIIlIlIlIllIIlIlIIIIlll()) : new ChatComponentTranslation(string, class_19652.llIIIIllIIIIIIIlIIIlIIIIl(), class_22552);
    }
}

