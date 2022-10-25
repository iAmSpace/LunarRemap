package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.nio.FloatBuffer;

import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class class_1972
extends class_1460 {
    private static class_1972 IlIIIIIllllllIIlllIllllll = new class_1972();
    private FloatBuffer lIllllIIlIIIlIllllllIIIll = class_0994.IlIIIIIllllllIIlllIllllll(16);
    private FloatBuffer IIIllIIlIIIIIIlIlIIllIIlI = class_0994.IlIIIIIllllllIIlllIllllll(16);
    private FloatBuffer IllIIlllllllIIlIIlIIIIlIl = class_0994.IlIIIIIllllllIIlllIllllll(16);

    public static class_1460 lllIIIllIIIIlllIlIIllIIll() {
        IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl();
        return IlIIIIIllllllIIlllIllllll;
    }

    private void lllIIIllIIIIlllIlIIllIIll(float[][] arrf, int n) {
        float f = MathHelper.IlIllllllIIlIIllllIIlIIIl(arrf[n][0] * arrf[n][0] + arrf[n][1] * arrf[n][1] + arrf[n][2] * arrf[n][2]);
        float[] arrf2 = arrf[n];
        arrf2[0] = arrf2[0] / f;
        float[] arrf3 = arrf[n];
        arrf3[1] = arrf3[1] / f;
        float[] arrf4 = arrf[n];
        arrf4[2] = arrf4[2] / f;
        float[] arrf5 = arrf[n];
        arrf5[3] = arrf5[3] / f;
    }

    private void lllIlIIlIIIlIlIIIllIlllIl() {
        this.lIllllIIlIIIlIllllllIIIll.clear();
        this.IIIllIIlIIIIIIlIlIIllIIlI.clear();
        this.IllIIlllllllIIlIIlIIIIlIl.clear();
        GL11.glGetFloat((int)2983, (FloatBuffer)this.lIllllIIlIIIlIllllllIIIll);
        GL11.glGetFloat((int)2982, (FloatBuffer)this.IIIllIIlIIIIIIlIlIIllIIlI);
        this.lIllllIIlIIIlIllllllIIIll.flip().limit(16);
        this.lIllllIIlIIIlIllllllIIIll.get(this.lllIlIIlIIIlIlIIIllIlllIl);
        this.IIIllIIlIIIIIIlIlIIllIIlI.flip().limit(16);
        this.IIIllIIlIIIIIIlIlIIllIIlI.get(this.IlIllllllIIlIIllllIIlIIIl);
        this.lIlllIlllIIIIlIIlllIllIII[0] = this.IlIllllllIIlIIllllIIlIIIl[0] * this.lllIlIIlIIIlIlIIIllIlllIl[0] + this.IlIllllllIIlIIllllIIlIIIl[1] * this.lllIlIIlIIIlIlIIIllIlllIl[4] + this.IlIllllllIIlIIllllIIlIIIl[2] * this.lllIlIIlIIIlIlIIIllIlllIl[8] + this.IlIllllllIIlIIllllIIlIIIl[3] * this.lllIlIIlIIIlIlIIIllIlllIl[12];
        this.lIlllIlllIIIIlIIlllIllIII[1] = this.IlIllllllIIlIIllllIIlIIIl[0] * this.lllIlIIlIIIlIlIIIllIlllIl[1] + this.IlIllllllIIlIIllllIIlIIIl[1] * this.lllIlIIlIIIlIlIIIllIlllIl[5] + this.IlIllllllIIlIIllllIIlIIIl[2] * this.lllIlIIlIIIlIlIIIllIlllIl[9] + this.IlIllllllIIlIIllllIIlIIIl[3] * this.lllIlIIlIIIlIlIIIllIlllIl[13];
        this.lIlllIlllIIIIlIIlllIllIII[2] = this.IlIllllllIIlIIllllIIlIIIl[0] * this.lllIlIIlIIIlIlIIIllIlllIl[2] + this.IlIllllllIIlIIllllIIlIIIl[1] * this.lllIlIIlIIIlIlIIIllIlllIl[6] + this.IlIllllllIIlIIllllIIlIIIl[2] * this.lllIlIIlIIIlIlIIIllIlllIl[10] + this.IlIllllllIIlIIllllIIlIIIl[3] * this.lllIlIIlIIIlIlIIIllIlllIl[14];
        this.lIlllIlllIIIIlIIlllIllIII[3] = this.IlIllllllIIlIIllllIIlIIIl[0] * this.lllIlIIlIIIlIlIIIllIlllIl[3] + this.IlIllllllIIlIIllllIIlIIIl[1] * this.lllIlIIlIIIlIlIIIllIlllIl[7] + this.IlIllllllIIlIIllllIIlIIIl[2] * this.lllIlIIlIIIlIlIIIllIlllIl[11] + this.IlIllllllIIlIIllllIIlIIIl[3] * this.lllIlIIlIIIlIlIIIllIlllIl[15];
        this.lIlllIlllIIIIlIIlllIllIII[4] = this.IlIllllllIIlIIllllIIlIIIl[4] * this.lllIlIIlIIIlIlIIIllIlllIl[0] + this.IlIllllllIIlIIllllIIlIIIl[5] * this.lllIlIIlIIIlIlIIIllIlllIl[4] + this.IlIllllllIIlIIllllIIlIIIl[6] * this.lllIlIIlIIIlIlIIIllIlllIl[8] + this.IlIllllllIIlIIllllIIlIIIl[7] * this.lllIlIIlIIIlIlIIIllIlllIl[12];
        this.lIlllIlllIIIIlIIlllIllIII[5] = this.IlIllllllIIlIIllllIIlIIIl[4] * this.lllIlIIlIIIlIlIIIllIlllIl[1] + this.IlIllllllIIlIIllllIIlIIIl[5] * this.lllIlIIlIIIlIlIIIllIlllIl[5] + this.IlIllllllIIlIIllllIIlIIIl[6] * this.lllIlIIlIIIlIlIIIllIlllIl[9] + this.IlIllllllIIlIIllllIIlIIIl[7] * this.lllIlIIlIIIlIlIIIllIlllIl[13];
        this.lIlllIlllIIIIlIIlllIllIII[6] = this.IlIllllllIIlIIllllIIlIIIl[4] * this.lllIlIIlIIIlIlIIIllIlllIl[2] + this.IlIllllllIIlIIllllIIlIIIl[5] * this.lllIlIIlIIIlIlIIIllIlllIl[6] + this.IlIllllllIIlIIllllIIlIIIl[6] * this.lllIlIIlIIIlIlIIIllIlllIl[10] + this.IlIllllllIIlIIllllIIlIIIl[7] * this.lllIlIIlIIIlIlIIIllIlllIl[14];
        this.lIlllIlllIIIIlIIlllIllIII[7] = this.IlIllllllIIlIIllllIIlIIIl[4] * this.lllIlIIlIIIlIlIIIllIlllIl[3] + this.IlIllllllIIlIIllllIIlIIIl[5] * this.lllIlIIlIIIlIlIIIllIlllIl[7] + this.IlIllllllIIlIIllllIIlIIIl[6] * this.lllIlIIlIIIlIlIIIllIlllIl[11] + this.IlIllllllIIlIIllllIIlIIIl[7] * this.lllIlIIlIIIlIlIIIllIlllIl[15];
        this.lIlllIlllIIIIlIIlllIllIII[8] = this.IlIllllllIIlIIllllIIlIIIl[8] * this.lllIlIIlIIIlIlIIIllIlllIl[0] + this.IlIllllllIIlIIllllIIlIIIl[9] * this.lllIlIIlIIIlIlIIIllIlllIl[4] + this.IlIllllllIIlIIllllIIlIIIl[10] * this.lllIlIIlIIIlIlIIIllIlllIl[8] + this.IlIllllllIIlIIllllIIlIIIl[11] * this.lllIlIIlIIIlIlIIIllIlllIl[12];
        this.lIlllIlllIIIIlIIlllIllIII[9] = this.IlIllllllIIlIIllllIIlIIIl[8] * this.lllIlIIlIIIlIlIIIllIlllIl[1] + this.IlIllllllIIlIIllllIIlIIIl[9] * this.lllIlIIlIIIlIlIIIllIlllIl[5] + this.IlIllllllIIlIIllllIIlIIIl[10] * this.lllIlIIlIIIlIlIIIllIlllIl[9] + this.IlIllllllIIlIIllllIIlIIIl[11] * this.lllIlIIlIIIlIlIIIllIlllIl[13];
        this.lIlllIlllIIIIlIIlllIllIII[10] = this.IlIllllllIIlIIllllIIlIIIl[8] * this.lllIlIIlIIIlIlIIIllIlllIl[2] + this.IlIllllllIIlIIllllIIlIIIl[9] * this.lllIlIIlIIIlIlIIIllIlllIl[6] + this.IlIllllllIIlIIllllIIlIIIl[10] * this.lllIlIIlIIIlIlIIIllIlllIl[10] + this.IlIllllllIIlIIllllIIlIIIl[11] * this.lllIlIIlIIIlIlIIIllIlllIl[14];
        this.lIlllIlllIIIIlIIlllIllIII[11] = this.IlIllllllIIlIIllllIIlIIIl[8] * this.lllIlIIlIIIlIlIIIllIlllIl[3] + this.IlIllllllIIlIIllllIIlIIIl[9] * this.lllIlIIlIIIlIlIIIllIlllIl[7] + this.IlIllllllIIlIIllllIIlIIIl[10] * this.lllIlIIlIIIlIlIIIllIlllIl[11] + this.IlIllllllIIlIIllllIIlIIIl[11] * this.lllIlIIlIIIlIlIIIllIlllIl[15];
        this.lIlllIlllIIIIlIIlllIllIII[12] = this.IlIllllllIIlIIllllIIlIIIl[12] * this.lllIlIIlIIIlIlIIIllIlllIl[0] + this.IlIllllllIIlIIllllIIlIIIl[13] * this.lllIlIIlIIIlIlIIIllIlllIl[4] + this.IlIllllllIIlIIllllIIlIIIl[14] * this.lllIlIIlIIIlIlIIIllIlllIl[8] + this.IlIllllllIIlIIllllIIlIIIl[15] * this.lllIlIIlIIIlIlIIIllIlllIl[12];
        this.lIlllIlllIIIIlIIlllIllIII[13] = this.IlIllllllIIlIIllllIIlIIIl[12] * this.lllIlIIlIIIlIlIIIllIlllIl[1] + this.IlIllllllIIlIIllllIIlIIIl[13] * this.lllIlIIlIIIlIlIIIllIlllIl[5] + this.IlIllllllIIlIIllllIIlIIIl[14] * this.lllIlIIlIIIlIlIIIllIlllIl[9] + this.IlIllllllIIlIIllllIIlIIIl[15] * this.lllIlIIlIIIlIlIIIllIlllIl[13];
        this.lIlllIlllIIIIlIIlllIllIII[14] = this.IlIllllllIIlIIllllIIlIIIl[12] * this.lllIlIIlIIIlIlIIIllIlllIl[2] + this.IlIllllllIIlIIllllIIlIIIl[13] * this.lllIlIIlIIIlIlIIIllIlllIl[6] + this.IlIllllllIIlIIllllIIlIIIl[14] * this.lllIlIIlIIIlIlIIIllIlllIl[10] + this.IlIllllllIIlIIllllIIlIIIl[15] * this.lllIlIIlIIIlIlIIIllIlllIl[14];
        this.lIlllIlllIIIIlIIlllIllIII[15] = this.IlIllllllIIlIIllllIIlIIIl[12] * this.lllIlIIlIIIlIlIIIllIlllIl[3] + this.IlIllllllIIlIIllllIIlIIIl[13] * this.lllIlIIlIIIlIlIIIllIlllIl[7] + this.IlIllllllIIlIIllllIIlIIIl[14] * this.lllIlIIlIIIlIlIIIllIlllIl[11] + this.IlIllllllIIlIIllllIIlIIIl[15] * this.lllIlIIlIIIlIlIIIllIlllIl[15];
        this.lllIIIllIIIIlllIlIIllIIll[0][0] = this.lIlllIlllIIIIlIIlllIllIII[3] - this.lIlllIlllIIIIlIIlllIllIII[0];
        this.lllIIIllIIIIlllIlIIllIIll[0][1] = this.lIlllIlllIIIIlIIlllIllIII[7] - this.lIlllIlllIIIIlIIlllIllIII[4];
        this.lllIIIllIIIIlllIlIIllIIll[0][2] = this.lIlllIlllIIIIlIIlllIllIII[11] - this.lIlllIlllIIIIlIIlllIllIII[8];
        this.lllIIIllIIIIlllIlIIllIIll[0][3] = this.lIlllIlllIIIIlIIlllIllIII[15] - this.lIlllIlllIIIIlIIlllIllIII[12];
        this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, 0);
        this.lllIIIllIIIIlllIlIIllIIll[1][0] = this.lIlllIlllIIIIlIIlllIllIII[3] + this.lIlllIlllIIIIlIIlllIllIII[0];
        this.lllIIIllIIIIlllIlIIllIIll[1][1] = this.lIlllIlllIIIIlIIlllIllIII[7] + this.lIlllIlllIIIIlIIlllIllIII[4];
        this.lllIIIllIIIIlllIlIIllIIll[1][2] = this.lIlllIlllIIIIlIIlllIllIII[11] + this.lIlllIlllIIIIlIIlllIllIII[8];
        this.lllIIIllIIIIlllIlIIllIIll[1][3] = this.lIlllIlllIIIIlIIlllIllIII[15] + this.lIlllIlllIIIIlIIlllIllIII[12];
        this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, 1);
        this.lllIIIllIIIIlllIlIIllIIll[2][0] = this.lIlllIlllIIIIlIIlllIllIII[3] + this.lIlllIlllIIIIlIIlllIllIII[1];
        this.lllIIIllIIIIlllIlIIllIIll[2][1] = this.lIlllIlllIIIIlIIlllIllIII[7] + this.lIlllIlllIIIIlIIlllIllIII[5];
        this.lllIIIllIIIIlllIlIIllIIll[2][2] = this.lIlllIlllIIIIlIIlllIllIII[11] + this.lIlllIlllIIIIlIIlllIllIII[9];
        this.lllIIIllIIIIlllIlIIllIIll[2][3] = this.lIlllIlllIIIIlIIlllIllIII[15] + this.lIlllIlllIIIIlIIlllIllIII[13];
        this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, 2);
        this.lllIIIllIIIIlllIlIIllIIll[3][0] = this.lIlllIlllIIIIlIIlllIllIII[3] - this.lIlllIlllIIIIlIIlllIllIII[1];
        this.lllIIIllIIIIlllIlIIllIIll[3][1] = this.lIlllIlllIIIIlIIlllIllIII[7] - this.lIlllIlllIIIIlIIlllIllIII[5];
        this.lllIIIllIIIIlllIlIIllIIll[3][2] = this.lIlllIlllIIIIlIIlllIllIII[11] - this.lIlllIlllIIIIlIIlllIllIII[9];
        this.lllIIIllIIIIlllIlIIllIIll[3][3] = this.lIlllIlllIIIIlIIlllIllIII[15] - this.lIlllIlllIIIIlIIlllIllIII[13];
        this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, 3);
        this.lllIIIllIIIIlllIlIIllIIll[4][0] = this.lIlllIlllIIIIlIIlllIllIII[3] - this.lIlllIlllIIIIlIIlllIllIII[2];
        this.lllIIIllIIIIlllIlIIllIIll[4][1] = this.lIlllIlllIIIIlIIlllIllIII[7] - this.lIlllIlllIIIIlIIlllIllIII[6];
        this.lllIIIllIIIIlllIlIIllIIll[4][2] = this.lIlllIlllIIIIlIIlllIllIII[11] - this.lIlllIlllIIIIlIIlllIllIII[10];
        this.lllIIIllIIIIlllIlIIllIIll[4][3] = this.lIlllIlllIIIIlIIlllIllIII[15] - this.lIlllIlllIIIIlIIlllIllIII[14];
        this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, 4);
        this.lllIIIllIIIIlllIlIIllIIll[5][0] = this.lIlllIlllIIIIlIIlllIllIII[3] + this.lIlllIlllIIIIlIIlllIllIII[2];
        this.lllIIIllIIIIlllIlIIllIIll[5][1] = this.lIlllIlllIIIIlIIlllIllIII[7] + this.lIlllIlllIIIIlIIlllIllIII[6];
        this.lllIIIllIIIIlllIlIIllIIll[5][2] = this.lIlllIlllIIIIlIIlllIllIII[11] + this.lIlllIlllIIIIlIIlllIllIII[10];
        this.lllIIIllIIIIlllIlIIllIIll[5][3] = this.lIlllIlllIIIIlIIlllIllIII[15] + this.lIlllIlllIIIIlIIlllIllIII[14];
        this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, 5);
    }
}

