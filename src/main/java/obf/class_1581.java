package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.concurrent.Callable;

class class_1581
implements Callable {
    final /* synthetic */ int lllIIIllIIIIlllIlIIllIIll;
    final /* synthetic */ class_1462 lllIlIIlIIIlIlIIIllIlllIl;

    class_1581(class_1462 class_14622, int n) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_14622;
        this.lllIIIllIIIIlllIlIIllIIll = n;
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll == 0 ? "MISC_TEXTURE" : (this.lllIIIllIIIIlllIlIIllIIll == 1 ? "TERRAIN_TEXTURE" : (this.lllIIIllIIIIlllIlIIllIIll == 2 ? "ITEM_TEXTURE" : (this.lllIIIllIIIIlllIlIIllIIll == 3 ? "ENTITY_PARTICLE_TEXTURE" : "Unknown - " + this.lllIIIllIIIIlllIlIIllIIll)));
    }

    public /* synthetic */ Object call() {
        return this.lllIIIllIIIIlllIlIIllIIll();
    }
}

