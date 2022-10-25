package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.util.ResourceLocation;

import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

final class class_1466
extends URLStreamHandler {
    final /* synthetic */ ResourceLocation lllIIIllIIIIlllIlIIllIIll;

    class_1466(ResourceLocation class_17732) {
        this.lllIIIllIIIIlllIlIIllIIll = class_17732;
    }

    @Override
    protected URLConnection openConnection(URL uRL) {
        return new class_0200(this, uRL);
    }
}

