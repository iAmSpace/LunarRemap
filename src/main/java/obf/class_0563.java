package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import optifine.Config;

import java.util.Arrays;

public class class_0563
extends class_1496 {
    private class_1843 lllIIIllIIIIlllIlIIllIIll;
    private class_2020 lllIlIIlIIIlIlIIIllIlllIl;
    private int[] IlIllllllIIlIIllllIIlIIIl;
    private Block[] lIlllIlllIIIIlIIlllIllIII;
    private static class_1910 IlIIIIIllllllIIlllIllllll = new class_1910(Integer.TYPE, 16);
    private static class_1910 lIllllIIlIIIlIllllllIIIll = new class_1910(Block.class, 16);
    private static final int IIIllIIlIIIIIIlIlIIllIIlI = 8000;

    public class_0563(class_1334 class_13342, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        super(class_13342, n, n2, n3, n4, n5, n6, n7);
        this.lllIIIllIIIIlllIlIIllIIll = class_13342;
        this.lllIlIIlIIIlIlIIIllIlllIl = new class_2020(n - n7, n2 - n7, n3 - n7);
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
        if (this.IlIllllllIIlIIllllIIlIIIl == null) {
            int n5 = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4);
            if (Config.lllIlIIllllIllIIIlIlIIIll() && !this.a_(n, n2, n3).IlIlllIIIIIIlIIllIIllIlll()) {
                n5 = class_1825.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n5);
            }
            return n5;
        }
        int n6 = this.IlIIIIIllllllIIlllIllllll(n, n2, n3);
        int n7 = this.IlIllllllIIlIIllllIIlIIIl[n6];
        if (n7 == -1) {
            n7 = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4);
            if (Config.lllIlIIllllIllIIIlIlIIIll() && !this.a_(n, n2, n3).IlIlllIIIIIIlIIllIIllIlll()) {
                n7 = class_1825.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n7);
            }
            this.IlIllllllIIlIIllllIIlIIIl[n6] = n7;
        }
        return n7;
    }

    @Override
    public Block a_(int n, int n2, int n3) {
        if (this.lIlllIlllIIIIlIIlllIllIII == null) {
            return this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2, n3);
        }
        int n4 = this.IlIIIIIllllllIIlllIllllll(n, n2, n3);
        Block class_05492 = this.lIlllIlllIIIIlIIlllIllIII[n4];
        if (class_05492 == null) {
            this.lIlllIlllIIIIlIIlllIllIII[n4] = class_05492 = this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2, n3);
        }
        return class_05492;
    }

    private int IlIIIIIllllllIIlllIllllll(int n, int n2, int n3) {
        int n4 = n - this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll();
        int n5 = n2 - this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl();
        int n6 = n3 - this.lllIlIIlIIIlIlIIIllIlllIl.IlIllllllIIlIIllllIIlIIIl();
        return n4 * 400 + n6 * 20 + n5;
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        if (this.IlIllllllIIlIIllllIIlIIIl == null) {
            this.IlIllllllIIlIIllllIIlIIIl = (int[])IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(8000);
        }
        Arrays.fill(this.IlIllllllIIlIIllllIIlIIIl, -1);
        if (this.lIlllIlllIIIIlIIlllIllIII == null) {
            this.lIlllIlllIIIIlIIlllIllIII = (Block[])lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(8000);
        }
        Arrays.fill(this.lIlllIlllIIIIlIIlllIllIII, null);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl() {
        IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl);
        this.IlIllllllIIlIIllllIIlIIIl = null;
        lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII);
        this.lIlllIlllIIIIlIIlllIllIII = null;
    }
}

