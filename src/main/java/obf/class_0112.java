package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.util.MathHelper;

import java.io.DataInput;
import java.io.DataOutput;

public class class_0112
extends class_1447 {
    private float lllIlIIlIIIlIlIIIllIlllIl;

    class_0112() {
    }

    public class_0112(float f) {
        this.lllIlIIlIIIlIlIIIllIlllIl = f;
    }

    @Override
    void lllIIIllIIIIlllIlIIllIIll(DataOutput dataOutput) {
        dataOutput.writeFloat(this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    void lllIIIllIIIIlllIlIIllIIll(DataInput dataInput, int n, class_1633 class_16332) {
        class_16332.lllIIIllIIIIlllIlIIllIIll(32L);
        this.lllIlIIlIIIlIlIIIllIlllIl = dataInput.readFloat();
    }

    @Override
    public byte lllIIIllIIIIlllIlIIllIIll() {
        return 5;
    }

    @Override
    public String toString() {
        return "" + this.lllIlIIlIIIlIlIIIllIlllIl + "f";
    }

    @Override
    public class_2037 lllIlIIlIIIlIlIIIllIlllIl() {
        return new class_0112(this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            class_0112 class_01122 = (class_0112)object;
            return this.lllIlIIlIIIlIlIIIllIlllIl == class_01122.lllIlIIlIIIlIlIIIllIlllIl;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ Float.floatToIntBits(this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public long lIlllIlllIIIIlIIlllIllIII() {
        return (long)this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll() {
        return MathHelper.lIlllIlllIIIIlIIlllIllIII(this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public short lIllllIIlIIIlIllllllIIIll() {
        return (short)(MathHelper.lIlllIlllIIIIlIIlllIllIII(this.lllIlIIlIIIlIlIIIllIlllIl) & 0xFFFF);
    }

    @Override
    public byte IIIllIIlIIIIIIlIlIIllIIlI() {
        return (byte)(MathHelper.lIlllIlllIIIIlIIlllIllIII(this.lllIlIIlIIIlIlIIIllIlllIl) & 0xFF);
    }

    @Override
    public double IllIIlllllllIIlIIlIIIIlIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public float IIIllIllIIlIlIlIlIllllIIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }
}

