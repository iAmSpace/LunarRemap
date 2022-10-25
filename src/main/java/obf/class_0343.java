package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.ArrayList;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.opengl.GL11;

public class class_0343
extends class_0210 {
    protected int lllIIIllIIIIlllIlIIllIIll;
    protected int lllIlIIlIIIlIlIIIllIlllIl;
    public int IlIllllllIIlIIllllIIlIIIl;
    public int lIlllIlllIIIIlIIlllIllIII;
    private ArrayList lIllllIIlIIIlIllllllIIIll;
    private boolean IIIllIIlIIIIIIlIlIIllIIlI;
    public boolean IlIIIIIllllllIIlllIllllll;
    private boolean IllIIlllllllIIlIIlIIIIlIl;
    private int IIIllIllIIlIlIlIlIllllIIl;
    private int IllIIIllIIIIlIlIlIllIIlll;
    private int lIIIIlIlIIlllllIIllIIlIII;
    private int IlIlIIlIlIllIIlIlIIllIIIl;
    private class_1854 lllllIlllIIllIlIIlIIIllII;
    private int IlIlIIlllIIlIllIIIlllllIl;

    public void lllIIIllIIIIlllIlIIllIIll(Minecraft class_06672, int n, int n2) {
        if (this.IlIIIIIllllllIIlllIllllll) {
            GL11.glEnable((int)3042);
            OpenGlHelper.glBlendFunc(770, 771, 1, 0);
            GL11.glBlendFunc((int)770, (int)771);
            this.lllIlIIlIIIlIlIIIllIlllIl(class_06672, n, n2);
            int n3 = this.lIlllIlllIIIIlIIlllIllIII + this.lllIlIIlIIIlIlIIIllIlllIl / 2 + this.IlIlIIlllIIlIllIIIlllllIl / 2;
            int n4 = n3 - this.lIllllIIlIIIlIllllllIIIll.size() * 10 / 2;
            for (int i = 0; i < this.lIllllIIlIIIlIllllllIIIll.size(); ++i) {
                if (this.IIIllIIlIIIIIIlIlIIllIIlI) {
                    this.lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII, (String)this.lIllllIIlIIIlIllllllIIIll.get(i), this.IlIllllllIIlIIllllIIlIIIl + this.lllIIIllIIIIlllIlIIllIIll / 2, n4 + i * 10, this.IIIllIllIIlIlIlIlIllllIIl);
                    continue;
                }
                this.lllIlIIlIIIlIlIIIllIlllIl(this.lllllIlllIIllIlIIlIIIllII, (String)this.lIllllIIlIIIlIllllllIIIll.get(i), this.IlIllllllIIlIIllllIIlIIIl, n4 + i * 10, this.IIIllIllIIlIlIlIlIllllIIl);
            }
        }
    }

    protected void lllIlIIlIIIlIlIIIllIlllIl(Minecraft class_06672, int n, int n2) {
        if (this.IllIIlllllllIIlIIlIIIIlIl) {
            int n3 = this.lllIIIllIIIIlllIlIIllIIll + this.IlIlIIlllIIlIllIIIlllllIl * 2;
            int n4 = this.lllIlIIlIIIlIlIIIllIlllIl + this.IlIlIIlllIIlIllIIIlllllIl * 2;
            int n5 = this.IlIllllllIIlIIllllIIlIIIl - this.IlIlIIlllIIlIllIIIlllllIl;
            int n6 = this.lIlllIlllIIIIlIIlllIllIII - this.IlIlIIlllIIlIllIIIlllllIl;
            class_0343.lllIIIllIIIIlllIlIIllIIll(n5, n6, n5 + n3, n6 + n4, this.IllIIIllIIIIlIlIlIllIIlll);
            this.lllIIIllIIIIlllIlIIllIIll(n5, n5 + n3, n6, this.lIIIIlIlIIlllllIIllIIlIII);
            this.lllIIIllIIIIlllIlIIllIIll(n5, n5 + n3, n6 + n4, this.IlIlIIlIlIllIIlIlIIllIIIl);
            this.lllIlIIlIIIlIlIIIllIlllIl(n5, n6, n6 + n4, this.lIIIIlIlIIlllllIIllIIlIII);
            this.lllIlIIlIIIlIlIIIllIlllIl(n5 + n3, n6, n6 + n4, this.IlIlIIlIlIllIIlIlIIllIIIl);
        }
    }
}

