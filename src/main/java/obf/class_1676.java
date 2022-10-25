package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import net.minecraft.util.ResourceLocation;
import com.moonsworth.lunar.client.LunarClient;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class class_1676
extends class_1716 {
    private class_0115 IIIllIIlIIIIIIlIlIIllIIlI;
    private final class_0869 IllIIlllllllIIlIIlIIIIlIl;
    private final class_0806 IIIllIllIIlIlIlIlIllllIIl;
    private final class_1326 IllIIIllIIIIlIlIlIllIIlll;
    private final class_1326 lIIIIlIlIIlllllIIllIIlIII;
    private final class_0806 llIIlllIllIllllIIIlIIIIII;
    private final class_0806 llIIllIllIlIIlIIllIllllll;
    private final int lllIIlIIIllllllIIIIlIlIlI = 22;

    public class_1676(class_0115 class_01152) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_01152;
        this.IllIIlllllllIIlIIlIIIIlIl = new class_0869(LunarClient.getInstance().robotoMedium13px, "Message", 0x2FFFFFFF, 0x6FFFFFFF);
        this.IllIIlllllllIIlIIlIIIIlIl.lIllllIIlIIIlIllllllIIIll(256);
        this.IIIllIllIIlIlIlIlIllllIIl = new class_0806("SEND");
        this.IllIIIllIIIIlIlIlIllIIlll = new class_1326(this);
        this.lIIIIlIlIIlllllIIllIIlIII = new class_1326(this);
        this.llIIlllIllIllllIIIlIIIIII = new class_0806("Aliases");
        this.llIIllIllIlIIlIIllIllllll = new class_0806("X");
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4) {
        super.lllIIIllIIIIlllIlIIllIIll(f, f2, f3, f4);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(f + 26.0f, f2 + f4 - 15.0f, f3 - 62.0f, 13.0f);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(f + f3 - 37.0f, f2 + f4 - 15.0f, 35.0f, 13.0f);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(f + f3 - 6.0f, f2 + 22.0f, 4.0f, f4 - 39.0f);
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(f + 2.0f, f2 + 2.0f, 0.0f, f4 - 4.0f);
        this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(f + f3 - 54.0f, f2 + 2.0f, 40.0f, 16.0f);
        this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(f + f3 - 12.0f, f2 + 2.0f, 10.0f, 16.0f);
    }

    public static String lllIIIllIIIIlllIlIIllIIll(byte[] arrby) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(LunarClient.IlIIIlIIIIllIIIllIIIIIIll, "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(2, secretKeySpec);
        return new String(cipher.doFinal(arrby));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, boolean bl) {
        String[] arrstring;
        this.lllIlIIlIIIlIlIIIllIlllIl(f, f2);
        class_0210.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIIIllIIIIlllIlIIllIIll + 23.0f, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII, 0.5f, -16777216, -14869219);
        class_0210.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll + 23.0f, this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII, 0.5f, -16777216, -15395563);
        GL11.glPushMatrix();
        class_0210.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll + 25.0f, this.lllIlIIlIIIlIlIIIllIlllIl - 0.5f, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl, -1357572843);
        class_0210.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll + 25.0f, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII + 0.5f, -1357572843);
        class_0210.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll + 27.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 3.0f, this.lllIIIllIIIIlllIlIIllIIll + 43.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 19.0f, this.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIIlIIIIIIlIlIIllIIlI() ? class_0115.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIllIIlIlIlIlIllllIIl()) : -13158601);
        LunarClient.getInstance().robotoLight16px.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI.lIlllIlllIIIIlIIlllIllIII(), this.lllIIIllIIIIlllIlIIllIIll + 52.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 2.0f, -1);
        LunarClient.getInstance().robotoBold12px.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(), this.lllIIIllIIIIlllIlIIllIIll + 52.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 11.0f, -5460820);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        ResourceLocation class_17732 = LunarClient.getInstance().lllIIIllIIIIlllIlIIllIIll(EnumChatFormatting.getTextWithoutFormattingCodes(this.IIIllIIlIIIIIIlIlIIllIIlI.lIlllIlllIIIIlIIlllIllIII()), this.IIIllIIlIIIIIIlIlIIllIIlI.IlIllllllIIlIIllllIIlIIIl());
        class_0857.lllIIIllIIIIlllIlIIllIIll(class_17732, 7.0f, this.lllIIIllIIIIlllIlIIllIIll + 28.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 4.0f);
        class_0210.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll + 27.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 22.0f, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl - 2.0f, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII - 17.0f, -1356783327);
        this.lIIIIlIlIIlllllIIllIIlIII.IlIllllllIIlIIllllIIlIIIl(f, f2, bl);
        GL11.glPushMatrix();
        GL11.glEnable((int)3089);
        class_0713 class_07132 = class_0713.IlIlllIIIIIIlIIllIIllIlll();
        class_0857.lllIIIllIIIIlllIlIIllIIll(0, (int)(this.lllIlIIlIIIlIlIIIllIlllIl + 2.0f), (int)class_07132.lIllllIIlIIIlIllllllIIIll(), (int)(this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII - 2.0f), (float)((int)((float)class_07132.llIIlllIllIllllIIIlIIIIII().IlIIIIIllllllIIlllIllllll() * class_07132.IlIIIIIllllllIIlllIllllll())), (int)class_07132.IIIllIIlIIIIIIlIlIIllIIlI());
        int n = 18;
        int n2 = 0;
        for (class_0115 class_01152 : this.lIllllIIlIIIlIllllllIIIll.llIllllIlIllIIIlIllIIlIlI().lllIIIllIIIIlllIlIIllIIll().values()) {
            if (class_01152 != this.IIIllIIlIIIIIIlIlIIllIIlI && !this.lIllllIIlIIIlIllllllIIIll.llIllllIlIllIIIlIllIIlIlI().IlIllllllIIlIIllllIIlIIIl().containsKey(class_01152.IlIllllllIIlIIllllIIlIIIl()) && !class_01152.IIIllIIlIIIIIIlIlIIllIIlI()) continue;
            float f3 = this.lllIlIIlIIIlIlIIIllIlllIl + 3.0f + (float)n2;
            boolean bl2 = f > this.lllIIIllIIIIlllIlIIllIIll && f < this.lllIIIllIIIIlllIlIIllIIll + 25.0f && f2 > f3 - this.lIIIIlIlIIlllllIIllIIlIII.IllIIlllllllIIlIIlIIIIlIl() && f2 < f3 + 16.0f - this.lIIIIlIlIIlllllIIllIIlIII.IllIIlllllllIIlIIlIIIIlIl() && f2 > this.lllIlIIlIIIlIlIIIllIlllIl && f2 < this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII;
            class_0210.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll + 3.0f, f3, this.lllIIIllIIIIlllIlIIllIIll + 19.0f, f3 + 16.0f, class_01152.IIIllIIlIIIIIIlIlIIllIIlI() ? class_0115.lllIIIllIIIIlllIlIIllIIll(class_01152.IIIllIllIIlIlIlIlIllllIIl()) : -13158601);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)(bl2 ? 1.0f : 0.85f));
            arrstring = LunarClient.getInstance().lllIIIllIIIIlllIlIIllIIll(EnumChatFormatting.getTextWithoutFormattingCodes(class_01152.lIlllIlllIIIIlIIlllIllIII()), class_01152.IlIllllllIIlIIllllIIlIIIl());
            class_0857.lllIIIllIIIIlllIlIIllIIll((ResourceLocation)arrstring, 7.0f, this.lllIIIllIIIIlllIlIIllIIll + 4.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 4.0f + (float)n2);
            if (bl2) {
                float f4 = this.lIllllIIlIIIlIllllllIIIll.robotoRegular13px.lllIlIIlIIIlIlIIIllIlllIl(EnumChatFormatting.getTextWithoutFormattingCodes(class_01152.lIlllIlllIIIIlIIlllIllIII()));
                class_0857.lllIIIllIIIIlllIlIIllIIll((double)(this.lllIIIllIIIIlllIlIIllIIll - 10.0f - f4), (double)(f3 + 2.0f), (double)(this.lllIIIllIIIIlllIlIIllIIll - 2.0f), (double)(f3 + 14.0f), 6.0, -1895825408);
                this.lIllllIIlIIIlIllllllIIIll.robotoRegular13px.lllIIIllIIIIlllIlIIllIIll(class_01152.lIlllIlllIIIIlIIlllIllIII(), this.lllIIIllIIIIlllIlIIllIIll - 6.0f - f4, f3 + 4.0f, -1);
                if (Mouse.isButtonDown((int)0) && this.IIIllIIlIIIIIIlIlIIllIIlI != class_01152) {
                    this.IlIIIIIllllllIIlllIllllll.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
                    this.IIIllIIlIIIIIIlIlIIllIIlI = class_01152;
                }
            }
            n2 += 18;
        }
        this.lIIIIlIlIIlllllIIllIIlIII.IlIIIIIllllllIIlllIllllll(n2);
        GL11.glDisable((int)3089);
        GL11.glPopMatrix();
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(f, f2, bl);
        this.IllIIIllIIIIlIlIlIllIIlll.IlIIIIIllllllIIlllIllllll(f, f2, bl);
        try {
            if (LunarClient.getInstance().llIllllIlIllIIIlIllIIlIlI().IlIllllllIIlIIllllIIlIIIl().containsKey(this.IIIllIIlIIIIIIlIlIIllIIlI.IlIllllllIIlIIllllIIlIIIl())) {
                GL11.glPushMatrix();
                GL11.glEnable((int)3089);
                class_0857.lllIIIllIIIIlllIlIIllIIll((int)(this.lllIIIllIIIIlllIlIIllIIll + 2.0f), (int)(this.lllIlIIlIIIlIlIIIllIlllIl + 22.0f), (int)(this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl - 2.0f), (int)(this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII - 17.0f), (float)((int)((float)class_07132.llIIlllIllIllllIIIlIIIIII().IlIIIIIllllllIIlllIllllll() * class_07132.IlIIIIIllllllIIlllIllllll())), (int)class_07132.IIIllIIlIIIIIIlIlIIllIIlI());
                List list = (List) LunarClient.getInstance().llIllllIlIllIIIlIllIIlIlI().IlIllllllIIlIIllllIIlIIIl().get(this.IIIllIIlIIIIIIlIlIIllIIlI.IlIllllllIIlIIllllIIlIIIl());
                int n3 = 0;
                for (int i = list.size() - 1; i >= 0; --i) {
                    String string = (String)list.get(i);
                    arrstring = LunarClient.getInstance().robotoMedium13px.lllIlIIlIIIlIlIIIllIlllIl(string, this.IlIllllllIIlIIllllIIlIIIl - 25.0f).split("\n");
                    n3 += arrstring.length * 10;
                    int n4 = 0;
                    for (String string2 : arrstring) {
                        LunarClient.getInstance().robotoMedium13px.lllIIIllIIIIlllIlIIllIIll(string2, this.lllIIIllIIIIlllIlIIllIIll + 31.0f, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII - 19.0f - (float)n3 + (float)(n4 * 10), -1);
                        ++n4;
                    }
                }
                this.IllIIIllIIIIlIlIlIllIIlll.IlIIIIIllllllIIlllIllllll(n3 + 4);
                GL11.glDisable((int)3089);
                GL11.glPopMatrix();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.IllIIIllIIIIlIlIlIllIIlll.lIlllIlllIIIIlIIlllIllIII(f, f2, bl);
        GL11.glPopMatrix();
        this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl(f, f2, bl);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl(f, f2, bl);
        this.llIIlllIllIllllIIIlIIIIII.lllIlIIlIIIlIlIIIllIlllIl(f, f2, bl);
        this.llIIllIllIlIIlIIllIllllll.lllIlIIlIIIlIlIIIllIlllIl(f, f2, bl);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll() {
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll();
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll();
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll();
        this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll();
        this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll();
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl() {
        this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl();
        this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl();
        this.IllIIIllIIIIlIlIlIllIIlll.lllIlIIlIIIlIlIIIllIlllIl();
        this.llIIlllIllIllllIIIlIIIIII.lllIlIIlIIIlIlIIIllIlllIl();
        this.llIIllIllIlIIlIIllIllllll.lllIlIIlIIIlIlIIIllIlllIl();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
        if (this.IllIIlllllllIIlIIlIIIIlIl.lllllIlllIIllIlIIlIIIllII() && !this.IllIIlllllllIIlIIlIIIIlIl.IIIllIllIIlIlIlIlIllllIIl().equals("") && n == 28) {
            this.lIIIIlIlIIlllllIIllIIlIII();
        }
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(c, n);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(c, n);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(c, n);
        this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(c, n);
        this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(c, n);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(float f, float f2, int n) {
        if (!this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(f, f2) && this.IllIIlllllllIIlIIlIIIIlIl.lllllIlllIIllIlIIlIIIllII()) {
            this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl(false);
        }
        return false;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(float f, float f2, int n, boolean bl) {
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(f, f2, n, bl);
        if (!bl) {
            return false;
        }
        if (!this.IllIIlllllllIIlIIlIIIIlIl.IIIllIllIIlIlIlIlIllllIIl().equals("") && this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(f, f2)) {
            this.lIIIIlIlIIlllllIIllIIlIII();
        }
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(f, f2, n, bl);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(f, f2, n, bl);
        this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(f, f2, n, bl);
        if (!this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(f, f2) && this.lllIIIllIIIIlllIlIIllIIll(f, f2) && f2 < this.lllIlIIlIIIlIlIIIllIlllIl + 22.0f) {
            this.IlIllllllIIlIIllllIIlIIIl(f, f2);
        }
        if (this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(f, f2)) {
            this.IlIIIIIllllllIIlllIllllll.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            class_0713.IlIlllIIIIIIlIIllIIllIlll().IlIllllllIIlIIllllIIlIIIl(this);
            return true;
        }
        if (this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(f, f2)) {
            this.IlIIIIIllllllIIlllIllllll.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            class_0759[] arrclass_0759 = new class_0759[1];
            class_0708 class_07082 = new class_0708(this.IIIllIIlIIIIIIlIlIIllIIlI);
            arrclass_0759[0] = class_07082;
            class_0713.IlIlllIIIIIIlIIllIIllIlll().lllIlIIlIIIlIlIIIllIlllIl(arrclass_0759);
            class_07082.lllIIIllIIIIlllIlIIllIIll(60.0f, 30.0f, 140.0f, 30.0f);
            return true;
        }
        return false;
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        this.IllIIIllIIIIlIlIlIllIIlll.IlIllllllIIlIIllllIIlIIIl();
        this.lIIIIlIlIIlllllIIllIIlIII.IlIllllllIIlIIllllIIlIIIl();
    }

    private void lIIIIlIlIIlllllIIllIIlIII() {
        String string = this.IllIIlllllllIIlIIlIIIIlIl.IIIllIllIIlIlIlIlIllllIIl();
        LunarClient.getInstance().llIllllIlIllIIIlIllIIlIlI().IlIllllllIIlIIllllIIlIIIl(this.IIIllIIlIIIIIIlIlIIllIIlI.IlIllllllIIlIIllllIIlIIIl(), string);
        LunarClient.getInstance().getWebsocket().lllIIIllIIIIlllIlIIllIIll((class_0688)new class_0222(this.IIIllIIlIIIIIIlIlIIllIIlI.IlIllllllIIlIIllllIIlIIIl(), string));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll("");
        this.IlIIIIIllllllIIlllIllllll.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl(float f, float f2, int n, boolean bl) {
        if (!bl) {
            return false;
        }
        this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl(f, f2, n, bl);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl(f, f2, n, bl);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIlIIlIIIlIlIIIllIlllIl(f, f2, n, bl);
        this.llIIlllIllIllllIIIlIIIIII.lllIlIIlIIIlIlIIIllIlllIl(f, f2, n, bl);
        this.llIIllIllIlIIlIIllIllllll.lllIlIIlIIIlIlIIIllIlllIl(f, f2, n, bl);
        return false;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0115 class_01152) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_01152;
    }

    public class_0115 IIIllIllIIlIlIlIlIllllIIl() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public class_0869 IllIIIllIIIIlIlIlIllIIlll() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }
}

