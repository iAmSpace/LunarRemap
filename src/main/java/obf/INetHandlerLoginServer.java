package obf;

import net.minecraft.network.login.client.C00PacketLoginStart;
import net.minecraft.network.login.client.C01PacketEncryptionResponse;

/*
 * Decompiled with CFR 0.150.
 */
public interface INetHandlerLoginServer
extends INetHandler {
    public void lllIIIllIIIIlllIlIIllIIll(C00PacketLoginStart var1);

    public void processEncryptionResponse(C01PacketEncryptionResponse var1);
}

