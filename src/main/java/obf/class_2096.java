package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.util.MathHelper;

import java.util.Map;

public class class_2096
extends class_1340 {
    private double IlIIIIIllllllIIlllIllllll = 0.004;

    public class_2096() {
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "Mineshaft";
    }

    public class_2096(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            if (!((String)entry.getKey()).equals("chance")) continue;
            this.IlIIIIIllllllIIlllIllllll = MathHelper.lllIIIllIIIIlllIlIIllIIll((String)entry.getValue(), this.IlIIIIIllllllIIlllIllllll);
        }
    }

    @Override
    protected boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return this.lllIlIIlIIIlIlIIIllIlllIl.nextDouble() < this.IlIIIIIllllllIIlllIllllll && this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(80) < Math.max(Math.abs(n), Math.abs(n2));
    }

    @Override
    protected class_1099 lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        return new class_0311(this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl, n, n2);
    }
}

