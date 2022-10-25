package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.Minecraft;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

class class_0200
extends URLConnection {
    final /* synthetic */ class_1466 lllIIIllIIIIlllIlIIllIIll;

    class_0200(class_1466 class_14662, URL uRL) {
        this.lllIIIllIIIIlllIlIIllIIll = class_14662;
        super(uRL);
    }

    @Override
    public void connect() {
    }

    @Override
    public InputStream getInputStream() {
        return Minecraft.getMinecraft().getResourceManager().getResource(this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll).getInputStream();
    }
}

