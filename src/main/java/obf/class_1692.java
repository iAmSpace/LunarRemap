package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class class_1692
extends class_1665 {
    private class_1609 IlIllllllIIlIIllllIIlIIIl;
    private class_1609 lIlllIlllIIIIlIIlllIllIII;
    private class_1609 IlIIIIIllllllIIlllIllllll;
    public class_1609 lllIIIllIIIIlllIlIIllIIll;
    private class_1609 lIllllIIlIIIlIllllllIIIll;
    private class_1609 IIIllIIlIIIIIIlIlIIllIIlI;
    private class_1609 IllIIlllllllIIlIIlIIIIlIl;
    private class_1609 IIIllIllIIlIlIlIlIllllIIl;
    public class_1609 lllIlIIlIIIlIlIIIllIlllIl;
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
        this.IlIllllllIIlIIllllIIlIIIl = new class_1609(this, "Show clicks").lllIlIIlIIIlIlIIIllIlllIl(true);
        this.lIlllIlllIIIIlIIlllIllIII = new class_1609(this, "Show movement keys").lllIlIIlIIIlIlIIIllIlllIl(true);
        this.IlIIIIIllllllIIlllIllllll = new class_1609(this, "Show spacebar").lllIlIIlIIIlIlIIIllIlllIl(false);
        this.lllIIIllIIIIlllIlIIllIIll = new class_1609(this, "Replace names with arrows").lllIlIIlIIIlIlIIIllIlllIl(false);
        this.lllIlIIlIIIlIlIIIllIlllIl = new class_1609(this, "Box size").lllIlIIlIIIlIlIIIllIlllIl(18).lllIIIllIIIIlllIlIIllIIll((Object)10, (Object)32);
        this.lIllllIIlIIIlIllllllIIIll = new class_1609(this, "Text Color").lllIlIIlIIIlIlIIIllIlllIl(-1).lllIIIllIIIIlllIlIIllIIll((Object)Integer.MIN_VALUE, (Object)Integer.MAX_VALUE);
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_1609(this, "Text Color (Pressed)").lllIlIIlIIIlIlIIIllIlllIl(-16777216).lllIIIllIIIIlllIlIIllIIll((Object)Integer.MIN_VALUE, (Object)Integer.MAX_VALUE);
        this.IllIIlllllllIIlIIlIIIIlIl = new class_1609(this, "Background Color").lllIlIIlIIIlIlIIIllIlllIl(0x6F000000).lllIIIllIIIIlllIlIIllIIll((Object)Integer.MIN_VALUE, (Object)Integer.MAX_VALUE);
        this.IIIllIllIIlIlIlIlIllllIIl = new class_1609(this, "Background Color (Pressed)").lllIlIIlIIIlIlIIIllIlllIl(0x6FFFFFFF).lllIIIllIIIIlllIlIIllIIll((Object)Integer.MIN_VALUE, (Object)Integer.MAX_VALUE);
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
        if (((Boolean)this.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII()).booleanValue()) {
            this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl() + 1.0f, 0.0f, this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(), this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(), this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(), this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll());
            this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(0.0f, this.IllIIIllIIIIlIlIlIllIIlll.IlIllllllIIlIIllllIIlIIIl() + 1.0f, this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(), this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(), this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(), this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll());
            this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl() + 1.0f, this.IllIIIllIIIIlIlIlIllIIlll.IlIllllllIIlIIllllIIlIIIl() + 1.0f, this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(), this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(), this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(), this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll());
            this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl() + this.llIIllIllIlIIlIIllIllllll.lllIlIIlIIIlIlIIIllIlllIl() + 2.0f, this.IllIIIllIIIIlIlIlIllIIlll.IlIllllllIIlIIllllIIlIIIl() + 1.0f, this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(), this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(), this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(), this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll());
            f = this.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl() + this.llIIllIllIlIIlIIllIllllll.lllIlIIlIIIlIlIIIllIlllIl() + this.llIIlllIllIllllIIIlIIIIII.lllIlIIlIIIlIlIIIllIlllIl() + 2.0f;
            f2 += this.IllIIIllIIIIlIlIlIllIIlll.IlIllllllIIlIIllllIIlIIIl() + 2.0f + this.llIIllIllIlIIlIIllIllllll.IlIllllllIIlIIllllIIlIIIl();
        }
        if (((Boolean)this.IlIllllllIIlIIllllIIlIIIl.lIlllIlllIIIIlIIlllIllIII()).booleanValue()) {
            this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(0.0f, f2, this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(), this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(), this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(), this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll());
            this.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(this.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl() + 1.0f, f2, this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(), this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(), this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(), this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll());
            f = this.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl() + this.IlIlllIIIIIIlIIllIIllIlll.lllIlIIlIIIlIlIIIllIlllIl() + 1.0f;
            f2 += this.IlIlllIIIIIIlIIllIIllIlll.IlIllllllIIlIIllllIIlIIIl() + 1.0f;
        }
        if (((Boolean)this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII()).booleanValue()) {
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
        int n5 = (Integer)this.lllIlIIlIIIlIlIIIllIlllIl.lIlllIlllIIIIlIIlllIllIII();
        String string = Keyboard.getKeyName((int)n);
        String string2 = Keyboard.getKeyName((int)n2);
        String string3 = Keyboard.getKeyName((int)n3);
        String string4 = Keyboard.getKeyName((int)n4);
        float f = (float)this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string) * ((Float)this.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
        float f2 = (float)this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string2) * ((Float)this.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
        float f3 = (float)this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string3) * ((Float)this.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
        float f4 = (float)this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string4) * ((Float)this.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
        int n6 = this.lIIlIIIIIlIlllIlIIlIlIlll.gameSettings.lIIIIlIIIIllIlIIllllIlIII.IIIllIllIIlIlIlIlIllllIIl();
        int n7 = this.lIIlIIIIIlIlllIlIIlIlIlll.gameSettings.lIlIllllIlIIIIIllIIIIlIlI.IIIllIllIIlIlIlIlIllllIIl();
        int n8 = this.lIIlIIIIIlIlllIlIIlIlIlll.gameSettings.IIIllIIIlIlllllllIIIlllll.IIIllIllIIlIlIlIlIllllIIl();
        boolean bl = (Boolean)this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII();
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

