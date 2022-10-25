package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
import java.util.concurrent.atomic.AtomicBoolean;
import org.lwjgl.input.Mouse;

public abstract class class_1716
extends class_0759 {
    private double IIIllIIlIIIIIIlIlIIllIIlI = 0.0;
    private double IllIIlllllllIIlIIlIIIIlIl = 0.0;
    private AtomicBoolean IIIllIllIIlIlIlIlIllllIIl = new AtomicBoolean();

    protected void lllIlIIlIIIlIlIIIllIlllIl(float f, float f2) {
        if (this.IIIllIllIIlIlIlIlIllllIIl.get()) {
            if (!Mouse.isButtonDown((int)0)) {
                this.IIIllIllIIlIlIlIlIllllIIl.set(false);
                return;
            }
            double d = (double)f - this.IIIllIIlIIIIIIlIlIIllIIlI;
            double d2 = (double)f2 - this.IllIIlllllllIIlIIlIIIIlIl;
            this.lllIIIllIIIIlllIlIIllIIll((float)d, (float)d2, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII);
        }
    }

    protected void IlIllllllIIlIIllllIIlIIIl(float f, float f2) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = f - this.lllIIIllIIIIlllIlIIllIIll;
        this.IllIIlllllllIIlIIlIIIIlIl = f2 - this.lllIlIIlIIIlIlIIIllIlllIl;
        this.IIIllIllIIlIlIlIlIllllIIl.set(true);
    }

    protected void IllIIlllllllIIlIIlIIIIlIl() {
        if (this.IIIllIllIIlIlIlIlIllllIIl.get()) {
            this.IIIllIllIIlIlIlIlIllllIIl.set(false);
        }
    }
}

