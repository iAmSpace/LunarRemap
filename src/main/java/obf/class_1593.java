package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.Minecraft;

import java.io.File;

class class_1593
implements class_1978 {
    final /* synthetic */ class_1605 lllIIIllIIIIlllIlIIllIIll;

    class_1593(class_1605 class_16052) {
        this.lllIIIllIIIIlllIlIIllIIll = class_16052;
    }

    @Override
    public void func_148522_a(File file) {
        if (class_1605.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll)) {
            class_1605.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, false);
            class_1605.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, new class_0513(file));
            Minecraft.getMinecraft().IllIIIIllIIllIllIlllIlIIl();
        }
    }
}

