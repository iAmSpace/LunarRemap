package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.Minecraft;
import net.minecraft.client.ClientBrandRetriever;

import java.util.concurrent.Callable;

class class_0707
implements Callable {
    final /* synthetic */ IntegratedServer lllIIIllIIIIlllIlIIllIIll;

    class_0707(IntegratedServer class_05192) {
        this.lllIIIllIIIIlllIlIIllIIll = class_05192;
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        String string = ClientBrandRetriever.getClientModName();
        if (!string.equals("vanilla")) {
            return "Definitely; Client brand changed to '" + string + "'";
        }
        string = this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIlIIIIlllIlIlIIl();
        return !string.equals("vanilla") ? "Definitely; Server brand changed to '" + string + "'" : (Minecraft.class.getSigners() == null ? "Very likely; Jar signature invalidated" : "Probably not. Jar signature remains and both client + server brands are untouched.");
    }

    public /* synthetic */ Object call() {
        return this.lllIIIllIIIIlllIlIIllIIll();
    }
}

