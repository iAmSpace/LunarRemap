package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.Display
 */
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;

public class class_1813 {
    public int lllIIIllIIIIlllIlIIllIIll;
    public int lllIlIIlIIIlIlIIIllIlllIl;

    public void lllIIIllIIIIlllIlIIllIIll() {
        Mouse.setGrabbed((boolean)true);
        this.lllIIIllIIIIlllIlIIllIIll = 0;
        this.lllIlIIlIIIlIlIIIllIlllIl = 0;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl() {
        Mouse.setCursorPosition((int)(Display.getWidth() / 2), (int)(Display.getHeight() / 2));
        Mouse.setGrabbed((boolean)false);
    }

    public void IlIllllllIIlIIllllIIlIIIl() {
        this.lllIIIllIIIIlllIlIIllIIll = Mouse.getDX();
        this.lllIlIIlIIIlIlIIIllIlllIl = Mouse.getDY();
    }
}

