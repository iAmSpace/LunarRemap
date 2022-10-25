package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.network.play.server.S20PacketEntityProperties;

import java.util.Collection;

public class class_1341 {
    private final String lllIlIIlIIIlIlIIIllIlllIl;
    private final double IlIllllllIIlIIllllIIlIIIl;
    private final Collection lIlllIlllIIIIlIIlllIllIII;
    final /* synthetic */ S20PacketEntityProperties lllIIIllIIIIlllIlIIllIIll;

    public class_1341(S20PacketEntityProperties class_19222, String string, double d, Collection collection) {
        this.lllIIIllIIIIlllIlIIllIIll = class_19222;
        this.lllIlIIlIIIlIlIIIllIlllIl = string;
        this.IlIllllllIIlIIllllIIlIIIl = d;
        this.lIlllIlllIIIIlIIlllIllIII = collection;
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public double lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public Collection<class_1256> IlIllllllIIlIIllllIIlIIIl() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }
}

