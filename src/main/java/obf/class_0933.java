package obf;

import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0933
extends class_1774 {
    private final class_0526 IllIIlllllllIIlIIlIIIIlIl = new class_2082(this);

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(class_07752);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        this.IllIIlllllllIIlIIlIIIIlIl.IIIllIIlIIIIIIlIlIIllIIlI();
        super.IlIllllllIIlIIllllIIlIIIl();
    }

    @Override
    public Packet IllIIlllllllIIlIIlIIIIlIl() {
        class_0775 class_07752 = new class_0775();
        this.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        class_07752.IlIlllIIIIIIlIIllIIllIlll("SpawnPotentials");
        return new S35PacketUpdateTileEntity(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, 1, class_07752);
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        return this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl(n) ? true : super.lllIlIIlIIIlIlIIIllIlllIl(n, n2);
    }

    public class_0526 lllIIIllIIIIlllIlIIllIIll() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }
}

