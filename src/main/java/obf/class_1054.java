package obf;/*
 * Decompiled with CFR 0.150.
 */
import com.moonsworth.lunar.client.config.Setting;
import net.minecraft.client.Minecraft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class class_1054
extends class_2256 {
    private List lllIlIIlIIIlIlIIIllIlllIl;
    public Setting lllIIIllIIIIlllIlIIllIIll;

    public class_1054(String string) {
        super(string);
        this.IlIllllllIIlIIllllIIlIIIl(true);
        this.lllIlIIlIIIlIlIIIllIlllIl = new ArrayList();
        Collections.addAll(this.lllIlIIlIIIlIlIIIllIlllIl, 14, 15, 16, 15, 56, 129, 52);
        this.lllIIIllIIIIlllIlIIllIIll = new Setting(this, "Opacity").setValue(45).setMinMax((Object)15, (Object)255);
    }

    @Override
    public void addAllEvents() {
        super.addAllEvents();
        Minecraft.getMinecraft().IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll();
    }

    @Override
    public void removeAllEvents() {
        super.removeAllEvents();
        Minecraft.getMinecraft().IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll();
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(int n, boolean bl) {
        return !this.lIllllIIlIIIlIllllllIIIll() ? bl : this.lllIlIIlIIIlIlIIIllIlllIl.contains(n);
    }

    public List llIIlIllIllllIlIIIIlIIlll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }
}

