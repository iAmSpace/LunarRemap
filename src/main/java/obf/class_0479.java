package obf;/*
 * Decompiled with CFR 0.150.
 */
import com.moonsworth.lunar.client.events.Event;

import java.beans.ConstructorProperties;

public class class_0479
extends Event {
    private final int lllIIIllIIIIlllIlIIllIIll;
    private final boolean lllIlIIlIIIlIlIIIllIlllIl;

    public int lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @ConstructorProperties(value={"mouseButton", "state"})
    public class_0479(int n, boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = bl;
    }
}

