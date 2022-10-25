package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
import net.minecraft.util.ResourceLocation;
import com.moonsworth.lunar.client.config.Setting;
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class class_1388
extends class_2117 {
    private Setting lllIIIllIIIIlllIlIIllIIll;
    private class_0527 IllIIlllllllIIlIIlIIIIlIl;
    private boolean IIIllIllIIlIlIlIlIllllIIl = false;

    public class_1388(Setting class_16092, float f) {
        super(f);
        this.lllIIIllIIIIlllIlIIllIIll = class_16092;
        this.IIIllIIlIIIIIIlIlIIllIIlI = 12;
        this.IllIIlllllllIIlIIlIIIIlIl = new class_0527(LunarClient.getInstance().robotoLight18px, null, Keyboard.getKeyName((int)((Integer)class_16092.getValue())), this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 100, this.IlIIIIIllllllIIlllIllllll, 96, 18, -9442858, f);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        boolean bl = (float)n > (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 48) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n < (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 10) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 > (float)(this.IlIIIIIllllllIIlllIllllll + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 < (float)(this.IlIIIIIllllllIIlllIllllll + 10 + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl;
        boolean bl2 = (float)n > (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 92) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n < (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 48) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 > (float)(this.IlIIIIIllllllIIlllIllllll + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 < (float)(this.IlIIIIIllllllIIlllIllllll + 10 + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl;
        LunarClient.getInstance().ubuntuMedium16px.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.getName().toUpperCase(), this.lIlllIlllIIIIlIIlllIllIII + 10, (float)(this.IlIIIIIllllllIIlllIllllll + 4), bl2 || bl ? -1090519040 : -1895825408);
        if (this.IIIllIllIIlIlIlIlIllllIIl && Keyboard.getEventKeyState()) {
            Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            this.lllIIIllIIIIlllIlIIllIIll.setValue(Keyboard.getEventKey());
            this.IllIIlllllllIIlIIlIIIIlIl.IllIIlllllllIIlIIlIIIIlIl = Keyboard.getKeyName((int)((Integer)this.lllIIIllIIIIlllIlIIllIIll.getValue()));
            this.IIIllIllIIlIlIlIlIllllIIl = false;
        }
        this.IllIIlllllllIIlIIlIIIIlIl.IlIllllllIIlIIllllIIlIIIl = this.IlIllllllIIlIIllllIIlIIIl;
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 100, this.IlIIIIIllllllIIlllIllllll, 96, 18);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        if (this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(n, n2)) {
            Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            this.IIIllIllIIlIlIlIlIllllIIl = true;
            this.IllIIlllllllIIlIIlIIIIlIl.IllIIlllllllIIlIIlIIIIlIl = "<PRESS ANY KEY>";
        }
    }
}

