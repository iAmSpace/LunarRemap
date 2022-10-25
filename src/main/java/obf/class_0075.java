package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.util.MathHelper;
import net.minecraft.util.ChatComponentTranslation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class class_0075
extends class_1246 {
    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "help";
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 0;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.help.usage";
    }

    @Override
    public List IlIllllllIIlIIllllIIlIIIl() {
        return Arrays.asList("?");
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        int n;
        List list = this.lIlllIlllIIIIlIIlllIllIII(class_19692);
        int n2 = 7;
        int n3 = (list.size() - 1) / n2;
        boolean bl = false;
        try {
            n = arrstring.length == 0 ? 0 : class_0075.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring[0], 1, n3 + 1) - 1;
        }
        catch (class_1956 class_19562) {
            Map map = this.lIlllIlllIIIIlIIlllIllIII();
            class_0291 class_02912 = (class_0291)map.get(arrstring[0]);
            if (class_02912 != null) {
                throw new class_0932(class_02912.lllIIIllIIIIlllIlIIllIIll(class_19692), new Object[0]);
            }
            if (MathHelper.lllIIIllIIIIlllIlIIllIIll(arrstring[0], -1) != -1) {
                throw class_19562;
            }
            throw new class_1624();
        }
        int n4 = Math.min((n + 1) * n2, list.size());
        ChatComponentTranslation class_17902 = new ChatComponentTranslation("commands.help.header", n + 1, n3 + 1);
        class_17902.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(class_1227.IlIllllllIIlIIllllIIlIIIl);
        class_19692.lllIIIllIIIIlllIlIIllIIll(class_17902);
        for (int i = n * n2; i < n4; ++i) {
            class_0291 class_02913 = (class_0291)list.get(i);
            ChatComponentTranslation class_17903 = new ChatComponentTranslation(class_02913.lllIIIllIIIIlllIlIIllIIll(class_19692), new Object[0]);
            class_17903.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(new class_0203(class_1936.IlIIIIIllllllIIlllIllllll, "/" + class_02913.lllIIIllIIIIlllIlIIllIIll() + " "));
            class_19692.lllIIIllIIIIlllIlIIllIIll(class_17903);
        }
        if (n == 0 && class_19692 instanceof class_0814) {
            ChatComponentTranslation class_17904 = new ChatComponentTranslation("commands.help.footer", new Object[0]);
            class_17904.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(class_1227.lIIIIlIlIIlllllIIllIIlIII);
            class_19692.lllIIIllIIIIlllIlIIllIIll(class_17904);
        }
    }

    protected List lIlllIlllIIIIlIIlllIllIII(class_1969 class_19692) {
        List list = class_0220.IlIIlllllIIlIlIlllllIllll().llIIlIlIlllIIllIlIlllIllI().lllIIIllIIIIlllIlIIllIIll(class_19692);
        Collections.sort(list);
        return list;
    }

    protected Map lIlllIlllIIIIlIIlllIllIII() {
        return class_0220.IlIIlllllIIlIlIlllllIllll().llIIlIlIlllIIllIlIlllIllI().lllIIIllIIIIlllIlIIllIIll();
    }
}

