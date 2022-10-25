package obf;

import net.minecraft.network.login.server.S00PacketDisconnect;
import net.minecraft.network.login.server.S01PacketEncryptionRequest;
import net.minecraft.network.login.server.S02PacketLoginSuccess;

/*
 * Decompiled with CFR 0.150.
 */
public interface class_0774
extends INetHandler {
    public void lllIIIllIIIIlllIlIIllIIll(S01PacketEncryptionRequest var1);

    public void lllIIIllIIIIlllIlIIllIIll(S02PacketLoginSuccess var1);

    public void lllIIIllIIIIlllIlIIllIIll(S00PacketDisconnect var1);
}

