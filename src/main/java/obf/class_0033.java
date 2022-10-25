package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.Options;

import java.util.List;

public class class_0033
extends class_0079 {
    private final List lllIIIllIIIIlllIlIIllIIll = Lists.newArrayList();

    public class_0033(Minecraft class_06672, int n, int n2, int n3, int n4, int n5, Options... arrclass_0728) {
        super(class_06672, n, n2, n3, n4, n5);
        this.lIIIIlIlIIlllllIIllIIlIII = false;
        for (int i = 0; i < arrclass_0728.length; i += 2) {
            Options class_07282 = arrclass_0728[i];
            Options class_07283 = i < arrclass_0728.length - 1 ? arrclass_0728[i + 1] : null;
            class_1197 class_11972 = this.lllIIIllIIIIlllIlIIllIIll(class_06672, n / 2 - 155, 0, class_07282);
            class_1197 class_11973 = this.lllIIIllIIIIlllIlIIllIIll(class_06672, n / 2 - 155 + 160, 0, class_07283);
            this.lllIIIllIIIIlllIlIIllIIll.add(new class_2031(class_11972, class_11973));
        }
    }

    private class_1197 lllIIIllIIIIlllIlIIllIIll(Minecraft class_06672, int n, int n2, Options class_07282) {
        if (class_07282 == null) {
            return null;
        }
        int n3 = class_07282.returnEnumOrdinal();
        return class_07282.getEnumFloat() ? new class_1474(n3, n, n2, class_07282) : new class_1249(n3, n, n2, class_07282, class_06672.gameSettings.IlIllllllIIlIIllllIIlIIIl(class_07282));
    }

    public class_2031 IlIllllllIIlIIllllIIlIIIl(int n) {
        return (class_2031)this.lllIIIllIIIIlllIlIIllIIll.get(n);
    }

    @Override
    protected int lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll.size();
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll() {
        return 400;
    }

    @Override
    protected int lIlllIlllIIIIlIIlllIllIII() {
        return super.lIlllIlllIIIIlIIlllIllIII() + 32;
    }

    @Override
    public /* synthetic */ class_0677 lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return this.IlIllllllIIlIIllllIIlIIIl(n);
    }
}

