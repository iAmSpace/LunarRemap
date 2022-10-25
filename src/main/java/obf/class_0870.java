package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentTranslation;

import java.util.Arrays;
import java.util.List;

public class class_0870
extends class_1246 {
    @Override
    public List IlIllllllIIlIIllllIIlIIIl() {
        return Arrays.asList("w", "msg");
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "tell";
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 0;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.message.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        if (arrstring.length < 2) {
            throw new class_0932("commands.message.usage", new Object[0]);
        }
        class_1822 class_18222 = class_0870.lIlllIlllIIIIlIIlllIllIII(class_19692, arrstring[0]);
        if (class_18222 == null) {
            throw new class_0340();
        }
        if (class_18222 == class_19692) {
            throw new class_0340("commands.message.sameTarget", new Object[0]);
        }
        IChatComponent class_22552 = class_0870.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring, 1, !(class_19692 instanceof class_0814));
        ChatComponentTranslation class_17902 = new ChatComponentTranslation("commands.message.display.incoming", class_19692.llIIIIllIIIIIIIlIIIlIIIIl(), class_22552.IIIllIllIIlIlIlIlIllllIIl());
        ChatComponentTranslation class_17903 = new ChatComponentTranslation("commands.message.display.outgoing", class_18222.llIIIIllIIIIIIIlIIIlIIIIl(), class_22552.IIIllIllIIlIlIlIlIllllIIl());
        class_17902.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(class_1227.IllIIlllllllIIlIIlIIIIlIl).lllIlIIlIIIlIlIIIllIlllIl(true);
        class_17903.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(class_1227.IllIIlllllllIIlIIlIIIIlIl).lllIlIIlIIIlIlIIIllIlllIl(true);
        class_18222.lllIIIllIIIIlllIlIIllIIll(class_17902);
        class_19692.lllIIIllIIIIlllIlIIllIIll(class_17903);
    }

    @Override
    public List lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692, String[] arrstring) {
        return class_0870.lllIIIllIIIIlllIlIIllIIll(arrstring, class_0220.IlIIlllllIIlIlIlllllIllll().llIIlIllIllllIlIIIIlIIlll());
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(String[] arrstring, int n) {
        return n == 0;
    }
}

