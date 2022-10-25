package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.ResourceLocation;
import com.moonsworth.lunar.client.config.Setting;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class class_1692
extends AbstractModule {
    private Setting IlIllllllIIlIIllllIIlIIIl;
    private Setting lIlllIlllIIIIlIIlllIllIII;
    private Setting IlIIIIIllllllIIlllIllllll;
    public Setting lllIIIllIIIIlllIlIIllIIll;
    private Setting lIllllIIlIIIlIllllllIIIll;
    private Setting IIIllIIlIIIIIIlIlIIllIIlI;
    private Setting IllIIlllllllIIlIIlIIIIlIl;
    private Setting IIIllIllIIlIlIlIlIllllIIl;
    public Setting lllIlIIlIIIlIlIIIllIlllIl;
    private class_1573 IllIIIllIIIIlIlIlIllIIlll;
    private class_1573 lIIIIlIlIIlllllIIllIIlIII;
    private class_1573 llIIlllIllIllllIIIlIIIIII;
    private class_1573 llIIllIllIlIIlIIllIllllll;
    private class_1573 lllIIlIIIllllllIIIIlIlIlI;
    private class_1573 IlIlllIIIIIIlIIllIIllIlll;
    private class_1573 IlIlIIlIlIllIIlIlIIllIIIl;

    public class_1692() {
        super("Key Strokes");
        this.lllIlIIlIIIlIlIIIllIlllIl(class_0767.IllIIlllllllIIlIIlIIIIlIl);
        this.lllIlIIlIIIlIlIIIllIlllIl(-70.0f, 5.0f);
        this.lllIlIIlIIIlIlIIIllIlllIl(false);
        this.IlIllllllIIlIIllllIIlIIIl = new Setting(this, "Show clicks").setValue(true);
        this.lIlllIlllIIIIlIIlllIllIII = new Setting(this, "Show movement keys").setValue(true);
        this.IlIIIIIllllllIIlllIllllll = new Setting(this, "Show spacebar").setValue(false);
        this.lllIIIllIIIIlllIlIIllIIll = new Setting(this, "Replace names with arrows").setValue(false);
        this.lllIlIIlIIIlIlIIIllIlllIl = new Setting(this, "Box size").setValue(18).setMinMax((Object)10, (Object)32);
        this.lIllllIIlIIIlIllllllIIIll = new Setting(this, "Text Color").setValue(-1).setMinMax((Object)Integer.MIN_VALUE, (Object)Integer.MAX_VALUE);
        this.IIIllIIlIIIIIIlIlIIllIIlI = new Setting(this, "Text Color (Pressed)").setValue(-16777216).setMinMax((Object)Integer.MIN_VALUE, (Object)Integer.MAX_VALUE);
        this.IllIIlllllllIIlIIlIIIIlIl = new Setting(this, "Background Color").setValue(0x6F000000).setMinMax((Object)Integer.MIN_VALUE, (Object)Integer.MAX_VALUE);
        this.IIIllIllIIlIlIlIlIllllIIl = new Setting(this, "Background Color (Pressed)").setValue(0x6FFFFFFF).setMinMax((Object)Integer.MIN_VALUE, (Object)Integer.MAX_VALUE);
        this.lllIIIllIIIIlllIlIIllIIll();
        this.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("client/icons/mods/wasd.png"), 55, 37);
        this.lllIIIllIIIIlllIlIIllIIll(class_2201.class, this::lllIIIllIIIIlllIlIIllIIll);
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_2201 class_22012) {
        if (!this.lllIIlIIIllllllIIIIlIlIlI()) {
            return;
        }
        GL11.glPushMatrix();
        this.lllIIIllIIIIlllIlIIllIIll(class_22012.lllIIIllIIIIlllIlIIllIIll());
        float f = 0.0f;
        float f2 = 0.0f;
        if (((Boolean)this.lIlllIlllIIIIlIIlllIllIII.getValue()).booleanValue()) {
            this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl() + 1.0f, 0.0f, this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(), this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(), this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(), this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll());
            this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(0.0f, this.IllIIIllIIIIlIlIlIllIIlll.IlIllllllIIlIIllllIIlIIIl() + 1.0f, this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(), this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(), this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(), this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll());
            this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl() + 1.0f, this.IllIIIllIIIIlIlIlIllIIlll.IlIllllllIIlIIllllIIlIIIl() + 1.0f, this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(), this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(), this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(), this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll());
            this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl() + this.llIIllIllIlIIlIIllIllllll.lllIlIIlIIIlIlIIIllIlllIl() + 2.0f, this.IllIIIllIIIIlIlIlIllIIlll.IlIllllllIIlIIllllIIlIIIl() + 1.0f, this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(), this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(), this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(), this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll());
            f = this.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl() + this.llIIllIllIlIIlIIllIllllll.lllIlIIlIIIlIlIIIllIlllIl() + this.llIIlllIllIllllIIIlIIIIII.lllIlIIlIIIlIlIIIllIlllIl() + 2.0f;
            f2 += this.IllIIIllIIIIlIlIlIllIIlll.IlIllllllIIlIIllllIIlIIIl() + 2.0f + this.llIIllIllIlIIlIIllIllllll.IlIllllllIIlIIllllIIlIIIl();
        }
        if (((Boolean)this.IlIllllllIIlIIllllIIlIIIl.getValue()).booleanValue()) {
            this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(0.0f, f2, this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(), this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(), this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(), this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll());
            this.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(this.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl() + 1.0f, f2, this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(), this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(), this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(), this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll());
            f = this.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl() + this.IlIlllIIIIIIlIIllIIllIlll.lllIlIIlIIIlIlIIIllIlllIl() + 1.0f;
            f2 += this.IlIlllIIIIIIlIIllIIllIlll.IlIllllllIIlIIllllIIlIIIl() + 1.0f;
        }
        if (((Boolean)this.IlIIIIIllllllIIlllIllllll.getValue()).booleanValue()) {
            this.IlIlIIlIlIllIIlIlIIllIIIl.lllIIIllIIIIlllIlIIllIIll(0.0f, f2, this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(), this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(), this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(), this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll());
            f2 += this.IlIlIIlIlIllIIlIlIIllIIIl.IlIllllllIIlIIllllIIlIIIl() + 1.0f;
        }
        this.IlIllllllIIlIIllllIIlIIIl(f, f2 < 18.0f ? 18.0f : f2 + 2.0f);
        GL11.glPopMatrix();
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        int n = this.lIIlIIIIIlIlllIlIIlIlIlll.gameSettings.lllIIIlllIlllIIlIllllIIlI.IIIllIllIIlIlIlIlIllllIIl();
        int n2 = this.lIIlIIIIIlIlllIlIIlIlIlll.gameSettings.lIIlIlllIIlllIIlllIIlIlII.IIIllIllIIlIlIlIlIllllIIl();
        int n3 = this.lIIlIIIIIlIlllIlIIlIlIlll.gameSettings.lIIlIIIlIlIIlllIlIllIllIl.IIIllIllIIlIlIlIlIllllIIl();
        int n4 = this.lIIlIIIIIlIlllIlIIlIlIlll.gameSettings.lIIlIlIIIIIllIIIIllIlIlII.IIIllIllIIlIlIlIlIllllIIl();
        int n5 = (Integer)this.lllIlIIlIIIlIlIIIllIlllIl.getValue();
        String string = Keyboard.getKeyName((int)n);
        String string2 = Keyboard.getKeyName((int)n2);
        String string3 = Keyboard.getKeyName((int)n3);
        String string4 = Keyboard.getKeyName((int)n4);
        float f = (float)this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string) * ((Float)this.llIIlIlIlllIIllIlIlllIllI.getValue()).floatValue();
        float f2 = (float)this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string2) * ((Float)this.llIIlIlIlllIIllIlIlllIllI.getValue()).floatValue();
        float f3 = (float)this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string3) * ((Float)this.llIIlIlIlllIIllIlIlllIllI.getValue()).floatValue();
        float f4 = (float)this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string4) * ((Float)this.llIIlIlIlllIIllIlIlllIllI.getValue()).floatValue();
        int n6 = this.lIIlIIIIIlIlllIlIIlIlIlll.gameSettings.lIIIIlIIIIllIlIIllllIlIII.IIIllIllIIlIlIlIlIllllIIl();
        int n7 = this.lIIlIIIIIlIlllIlIIlIlIlll.gameSettings.lIlIllllIlIIIIIllIIIIlIlI.IIIllIllIIlIlIlIlIllllIIl();
        int n8 = this.lIIlIIIIIlIlllIlIIlIlIlll.gameSettings.IIIllIIIlIlllllllIIIlllll.IIIllIllIIlIlIlIlIllllIIl();
        boolean bl = (Boolean)this.lllIIIllIIIIlllIlIIllIIll.getValue();
        this.IllIIIllIIIIlIlIlIllIIlll = new class_1573(bl ? "\u25b2" : (f > (float)n5 ? string.substring(0, 1) : string), n, n5, n5);
        this.lIIIIlIlIIlllllIIllIIlIII = new class_1573(bl ? "\u25c0" : (f2 > (float)n5 ? string2.substring(0, 1) : string2), n2, n5, n5);
        this.llIIllIllIlIIlIIllIllllll = new class_1573(bl ? "\u25bc" : (f3 > (float)n5 ? string3.substring(0, 1) : string3), n3, n5, n5);
        this.llIIlllIllIllllIIIlIIIIII = new class_1573(bl ? "\u25b6" : (f4 > (float)n5 ? string4.substring(0, 1) : string4), n4, n5, n5);
        float f5 = (this.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl() + this.llIIllIllIlIIlIIllIllllll.lllIlIIlIIIlIlIIIllIlllIl() + this.llIIlllIllIllllIIIlIIIIII.lllIlIIlIIIlIlIIIllIlllIl() + 1.0f) / 2.0f;
        this.lllIIlIIIllllllIIIIlIlIlI = new class_1573(n5 < 14 ? "L" : "LMB", n8, f5, n5);
        this.IlIlllIIIIIIlIIllIIllIlll = new class_1573(n5 < 14 ? "R" : "RMB", n7, f5, n5);
        this.IlIlIIlIlIllIIlIlIIllIIIl = new class_1573(Keyboard.getKeyName((int)n6), n6, this.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl() + this.llIIllIllIlIIlIIllIllllll.lllIlIIlIIIlIlIIIllIlllIl() + this.llIIlllIllIllllIIIlIIIIII.lllIlIIlIIIlIlIIIllIlllIl() + 2.0f, (float)n5 * 0.5f);
    }
}

