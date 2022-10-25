package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.util.MathHelper;

import java.io.DataInput;
import java.io.DataOutput;

public class class_2049
extends class_1447 {
    private double lllIlIIlIIIlIlIIIllIlllIl;

    class_2049() {
    }

    public class_2049(double d) {
        this.lllIlIIlIIIlIlIIIllIlllIl = d;
    }

    @Override
    void lllIIIllIIIIlllIlIIllIIll(DataOutput dataOutput) {
        dataOutput.writeDouble(this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    void lllIIIllIIIIlllIlIIllIIll(DataInput dataInput, int n, class_1633 class_16332) {
        class_16332.lllIIIllIIIIlllIlIIllIIll(64L);
        this.lllIlIIlIIIlIlIIIllIlllIl = dataInput.readDouble();
    }

    @Override
    public byte lllIIIllIIIIlllIlIIllIIll() {
        return 6;
    }

    @Override
    public String toString() {
        return "" + this.lllIlIIlIIIlIlIIIllIlllIl + "d";
    }

    @Override
    public class_2037 lllIlIIlIIIlIlIIIllIlllIl() {
        return new class_2049(this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            class_2049 class_20492 = (class_2049)object;
            return this.lllIlIIlIIIlIlIIIllIlllIl == class_20492.lllIlIIlIIIlIlIIIllIlllIl;
        }
        return false;
    }

    @Override
    public int hashCode() {
        long l = Double.doubleToLongBits(this.lllIlIIlIIIlIlIIIllIlllIl);
        return super.hashCode() ^ (int)(l ^ l >>> 32);
    }

    @Override
    public long lIlllIlllIIIIlIIlllIllIII() {
        return (long)Math.floor(this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll() {
        return MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public short lIllllIIlIIIlIllllllIIIll() {
        return (short)(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIlIIlIIIlIlIIIllIlllIl) & 0xFFFF);
    }

    @Override
    public byte IIIllIIlIIIIIIlIlIIllIIlI() {
        return (byte)(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIlIIlIIIlIlIIIllIlllIl) & 0xFF);
    }

    @Override
    public double IllIIlllllllIIlIIlIIIIlIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public float IIIllIllIIlIlIlIlIllllIIl() {
        return (float)this.lllIlIIlIIIlIlIIIllIlllIl;
    }
}

