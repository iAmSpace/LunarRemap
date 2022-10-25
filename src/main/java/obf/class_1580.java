package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;

import java.util.Random;

public class class_1580
extends class_1067 {
    private Block lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private Block IlIllllllIIlIIllllIIlIIIl;

    public class_1580(Block class_05492, int n) {
        this(class_05492, n, Blocks.lllIlIIlIIIlIlIIIllIlllIl);
    }

    public class_1580(Block class_05492, int n, Block class_05493) {
        this.lllIIIllIIIIlllIlIIllIIll = class_05492;
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.IlIllllllIIlIIllllIIlIIIl = class_05493;
    }

    @Override
    public boolean a_(class_1334 class_13342, Random random, int n, int n2, int n3) {
        float f = random.nextFloat() * (float)Math.PI;
        double d = (float)(n + 8) + MathHelper.lllIIIllIIIIlllIlIIllIIll(f) * (float)this.lllIlIIlIIIlIlIIIllIlllIl / 8.0f;
        double d2 = (float)(n + 8) - MathHelper.lllIIIllIIIIlllIlIIllIIll(f) * (float)this.lllIlIIlIIIlIlIIIllIlllIl / 8.0f;
        double d3 = (float)(n3 + 8) + MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f) * (float)this.lllIlIIlIIIlIlIIIllIlllIl / 8.0f;
        double d4 = (float)(n3 + 8) - MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f) * (float)this.lllIlIIlIIIlIlIIIllIlllIl / 8.0f;
        double d5 = n2 + random.nextInt(3) - 2;
        double d6 = n2 + random.nextInt(3) - 2;
        for (int i = 0; i <= this.lllIlIIlIIIlIlIIIllIlllIl; ++i) {
            double d7 = d + (d2 - d) * (double)i / (double)this.lllIlIIlIIIlIlIIIllIlllIl;
            double d8 = d5 + (d6 - d5) * (double)i / (double)this.lllIlIIlIIIlIlIIIllIlllIl;
            double d9 = d3 + (d4 - d3) * (double)i / (double)this.lllIlIIlIIIlIlIIIllIlllIl;
            double d10 = random.nextDouble() * (double)this.lllIlIIlIIIlIlIIIllIlllIl / 16.0;
            double d11 = (double)(MathHelper.lllIIIllIIIIlllIlIIllIIll((float)i * (float)Math.PI / (float)this.lllIlIIlIIIlIlIIIllIlllIl) + 1.0f) * d10 + 1.0;
            double d12 = (double)(MathHelper.lllIIIllIIIIlllIlIIllIIll((float)i * (float)Math.PI / (float)this.lllIlIIlIIIlIlIIIllIlllIl) + 1.0f) * d10 + 1.0;
            int n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d7 - d11 / 2.0);
            int n5 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d8 - d12 / 2.0);
            int n6 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d9 - d11 / 2.0);
            int n7 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d7 + d11 / 2.0);
            int n8 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d8 + d12 / 2.0);
            int n9 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d9 + d11 / 2.0);
            for (int j = n4; j <= n7; ++j) {
                double d13 = ((double)j + 0.5 - d7) / (d11 / 2.0);
                if (!(d13 * d13 < 1.0)) continue;
                for (int k = n5; k <= n8; ++k) {
                    double d14 = ((double)k + 0.5 - d8) / (d12 / 2.0);
                    if (!(d13 * d13 + d14 * d14 < 1.0)) continue;
                    for (int i2 = n6; i2 <= n9; ++i2) {
                        double d15 = ((double)i2 + 0.5 - d9) / (d11 / 2.0);
                        if (!(d13 * d13 + d14 * d14 + d15 * d15 < 1.0) || class_13342.a_(j, k, i2) != this.IlIllllllIIlIIllllIIlIIIl) continue;
                        class_13342.lllIIIllIIIIlllIlIIllIIll(j, k, i2, this.lllIIIllIIIIlllIlIIllIIll, 0, 2);
                    }
                }
            }
        }
        return true;
    }
}

