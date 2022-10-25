package obf;

import net.minecraft.client.Minecraft;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1115
extends Thread {
    private String lllIIIllIIIIlllIlIIllIIll = null;
    private class_1286 lllIlIIlIIIlIlIIIllIlllIl = null;

    public class_1115(String string, class_1286 class_12862) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_12862;
    }

    @Override
    public void run() {
        try {
            byte[] arrby = class_1186.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, Minecraft.getMinecraft().lllIIIIIIlIlllIIlIlIIIllI());
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, arrby, null);
        }
        catch (Exception exception) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, null, exception);
        }
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public class_1286 lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }
}

