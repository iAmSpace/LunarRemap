package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;

import java.util.List;

public class class_2159
extends class_0079 {
    private final class_1381 llIIllIllIlIIlIIllIllllll;
    public final List lllIIIllIIIIlllIlIIllIIll = Lists.newArrayList();
    public final List lllIlIIlIIIlIlIIIllIlllIl = Lists.newArrayList();
    private final class_0677 lllIIlIIIllllllIIIIlIlIlI = new class_1195();
    private int IlIlllIIIIIIlIIllIIllIlll = -1;

    public int lllIIIllIIIIlllIlIIllIIll(class_0924 class_09242) {
        if (this.lllIIIllIIIIlllIlIIllIIll.contains(class_09242)) {
            return this.lllIIIllIIIIlllIlIIllIIll.indexOf(class_09242);
        }
        if (this.lllIlIIlIIIlIlIIIllIlllIl.contains(class_09242)) {
            return this.lllIlIIlIIIlIlIIIllIlllIl.indexOf(class_09242);
        }
        return 0;
    }

    public class_2159(class_1381 class_13812, Minecraft class_06672, int n, int n2, int n3, int n4, int n5) {
        super(class_06672, n, n2, n3, n4, n5);
        this.llIIllIllIlIIlIIllIllllll = class_13812;
    }

    @Override
    public class_0677 lllIlIIlIIIlIlIIIllIlllIl(int n) {
        if (n < this.lllIIIllIIIIlllIlIIllIIll.size()) {
            return (class_0677)this.lllIIIllIIIIlllIlIIllIIll.get(n);
        }
        if ((n -= this.lllIIIllIIIIlllIlIIllIIll.size()) == 0) {
            return this.lllIIlIIIllllllIIIIlIlIlI;
        }
        return (class_0677)this.lllIlIIlIIIlIlIIIllIlllIl.get(--n);
    }

    @Override
    protected int lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll.size() + 1 + this.lllIlIIlIIIlIlIIIllIlllIl.size();
    }

    public void IlIllllllIIlIIllllIIlIIIl(int n) {
        this.IlIlllIIIIIIlIIllIIllIlll = n;
    }

    @Override
    protected boolean lllIIIllIIIIlllIlIIllIIll(int n) {
        return n == this.IlIlllIIIIIIlIIllIIllIlll;
    }

    public int lIllllIIlIIIlIllllllIIIll() {
        return this.IlIlllIIIIIIlIIllIIllIlll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_2151 class_21512) {
        this.lllIIIllIIIIlllIlIIllIIll.clear();
        for (int i = 0; i < class_21512.IlIllllllIIlIIllllIIlIIIl(); ++i) {
            class_1092 class_10922 = class_21512.lllIIIllIIIIlllIlIIllIIll(i);
            if (class_10922.llIIlllIllIllllIIIlIIIIII) {
                this.lllIIIllIIIIlllIlIIllIIll.add(new class_1303(this.llIIllIllIlIIlIIllIllllll, class_10922));
                continue;
            }
            if (LunarClient.getInstance().getSettingsManager().lllIlIIlIIIlIlIIIllIlllIl().stream().anyMatch(arrstring -> arrstring[1].equalsIgnoreCase(class_10922.lllIlIIlIIIlIlIIIllIlllIl))) continue;
            this.lllIIIllIIIIlllIlIIllIIll.add(new class_0924(this.llIIllIllIlIIlIIllIllllll, class_10922));
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(List list) {
        this.lllIlIIlIIIlIlIIIllIlllIl.clear();
        for (class_0494 class_04942 : list) {
            this.lllIlIIlIIIlIlIIIllIlllIl.add(new class_1306(this.llIIllIllIlIIlIIllIllllll, class_04942));
        }
    }

    @Override
    protected int lIlllIlllIIIIlIIlllIllIII() {
        return super.lIlllIlllIIIIlIIlllIllIII() + 30;
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll() {
        return super.IlIIIIIllllllIIlllIllllll() + 85;
    }
}

