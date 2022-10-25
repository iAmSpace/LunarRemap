package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.moonsworth.client.nethandler.LCPacket
 *  com.moonsworth.client.nethandler.client.LCPacketEmoteBroadcast
 */
import net.minecraft.util.ResourceLocation;
import com.moonsworth.client.nethandler.LCPacket;
import com.moonsworth.client.nethandler.client.LCPacketEmoteBroadcast;
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;

public abstract class class_0764 {
    protected final class_0556 lllIIIllIIIIlllIlIIllIIll;
    private final String lllIlIIlIIIlIlIIIllIlllIl;
    private final ResourceLocation IlIllllllIIlIIllllIIlIIIl;

    public class_0764(String string, class_0556 class_05562) {
        this.lllIIIllIIIIlllIlIIllIIll = class_05562;
        class_05562.lllIlIIlIIIlIlIIIllIlllIl();
        this.lllIlIIlIIIlIlIIIllIlllIl = string;
        this.IlIllllllIIlIIllllIIlIIIl = new ResourceLocation("client/emote/" + string.toLowerCase().replace("-", "").replace(" ", "") + ".png");
    }

    public abstract void lllIIIllIIIIlllIlIIllIIll(class_2174 var1, class_1931 var2, float var3);

    public abstract void lllIIIllIIIIlllIlIIllIIll(class_2174 var1, float var2);

    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll();
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_2174 class_21742) {
        if (class_21742 == null) {
            return;
        }
        if (class_21742.lIIlllIIlIlIlIIIlIlllIIll().equals(Minecraft.getMinecraft().lIIIIlIlIIlllllIIllIIlIII.lIIlllIIlIlIlIIIlIlllIIll())) {
            LunarClient.getInstance().getNetworkManager().lllIIIllIIIIlllIlIIllIIll((LCPacket)new LCPacketEmoteBroadcast(Minecraft.getMinecraft().lIIIIlIlIIlllllIIllIIlIII.lIIlllIIlIlIlIIIlIlllIIll(), -1));
            if (LunarClient.getInstance().llIIlIlIlllIIllIlIlllIllI().lllIlIIlIIIlIlIIIllIlllIl) {
                Minecraft.getMinecraft().gameSettings.IIlIlIlIIlllIIIlIIIIlIIIl = 0;
                LunarClient.getInstance().llIIlIlIlllIIllIlIlllIllI().lllIlIIlIIIlIlIIIllIlllIl = false;
                LunarClient.getInstance().llIIlIlIlllIIllIlIlllIllI().IlIllllllIIlIIllllIIlIIIl = false;
            }
        }
    }

    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public ResourceLocation IlIllllllIIlIIllllIIlIIIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }
}

