package obf;

import net.minecraft.util.IChatComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentTranslation;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1494
extends class_0058 {
    protected class_1521 IlIlIIlIlIllIIlIlIIllIIIl;

    public class_1494(String string, class_1521 class_15212) {
        super(string);
        this.IlIlIIlIlIllIIlIlIIllIIIl = class_15212;
    }

    @Override
    public class_1521 IllIIIllIIIIlIlIlIllIIlll() {
        return this.IlIlIIlIlIllIIlIlIIllIIIl;
    }

    @Override
    public IChatComponent lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652) {
        ItemStack class_08972 = this.IlIlIIlIlIllIIlIlIIllIIIl instanceof class_1965 ? ((class_1965)this.IlIlIIlIlIllIIlIlIIllIIIl).lIIIIlIlIlIIIlIIllIIlIlIl() : null;
        String string = "death.attack." + this.IlIlllIIIIIIlIIllIIllIlll;
        String string2 = string + ".item";
        return class_08972 != null && class_08972.IlIIIlIIIIllIIIllIIIIIIll() && class_1586.IlIllllllIIlIIllllIIlIIIl(string2) ? new ChatComponentTranslation(string2, class_19652.llIIIIllIIIIIIIlIIIlIIIIl(), this.IlIlIIlIlIllIIlIlIIllIIIl.llIIIIllIIIIIIIlIIIlIIIIl(), class_08972.IIlIIlIlIlIllIIlIlIIIIlll()) : new ChatComponentTranslation(string, class_19652.llIIIIllIIIIIIIlIIIlIIIIl(), this.IlIlIIlIlIllIIlIlIIllIIIl.llIIIIllIIIIIIIlIIIlIIIIl());
    }

    @Override
    public boolean IlIlIIlllIIlIllIIIlllllIl() {
        return this.IlIlIIlIlIllIIlIlIIllIIIl != null && this.IlIlIIlIlIllIIlIlIIllIIIl instanceof class_1965 && !(this.IlIlIIlIlIllIIlIlIIllIIIl instanceof class_0814);
    }
}

