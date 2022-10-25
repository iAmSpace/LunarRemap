package obf;

import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1345
extends class_1774 {
    private final class_0484 IllIIlllllllIIlIIlIIIIlIl = new class_1081(this);

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(class_07752);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
    }

    @Override
    public Packet IllIIlllllllIIlIIlIIIIlIl() {
        class_0775 class_07752 = new class_0775();
        this.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        return new S35PacketUpdateTileEntity(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, 2, class_07752);
    }

    public class_0484 lllIIIllIIIIlllIlIIllIIll() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }
}

