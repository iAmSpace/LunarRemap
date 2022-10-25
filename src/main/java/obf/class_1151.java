package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
import java.io.File;
import java.nio.file.CopyOption;
import java.nio.file.Files;

import com.moonsworth.lunar.client.LunarClient;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class class_1151
extends class_0229 {
    private final class_0229 lllIIIllIIIIlllIlIIllIIll;
    private class_0598 lllIlIIlIIIlIlIIIllIlllIl = null;
    private final float IlIllllllIIlIIllllIIlIIIl;
    private final int lIlllIlllIIIIlIIlllIllIII;
    private final class_1319 IlIIIIIllllllIIlllIllllll;
    private String lIllllIIlIIIlIllllllIIIll = "";
    private boolean IIIllIIlIIIIIIlIlIIllIIlI = false;
    private Profile IllIIlllllllIIlIIlIIIIlIl;

    public class_1151(Profile class_11652, class_0229 class_02292, class_1319 class_13192, int n, float f) {
        this(class_02292, class_13192, n, f);
        this.IllIIlllllllIIlIIlIIIIlIl = class_11652;
    }

    public class_1151(class_0229 class_02292, class_1319 class_13192, int n, float f) {
        this.lllIIIllIIIIlllIlIIllIIll = class_02292;
        this.IlIllllllIIlIIllllIIlIIIl = f;
        this.IlIIIIIllllllIIlllIllllll = class_13192;
        this.lIlllIlllIIIIlIIlllIllIII = n;
        this.IIIllIIlIIIIIIlIlIIllIIlI = true;
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll();
    }

    @Override
    public void o_() {
        Keyboard.enableRepeatEvents((boolean)false);
    }

    @Override
    public void n_() {
        Keyboard.enableRepeatEvents((boolean)true);
        if (!this.IIIllIIlIIIIIIlIlIIllIIlI) {
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll);
            ((class_0822)this.lllIIIllIIIIlllIlIIllIIll).IllIIIllIIIIlIlIlIllIIlll = ((class_0822)this.lllIIIllIIIIlllIlIIllIIll).lIllllIIlIIIlIllllllIIIll;
        } else {
            this.IIIllIIlIIIIIIlIlIIllIIlI = false;
            this.lllIlIIlIIIlIlIIIllIlllIl = new class_0598(this.lllllIlllIIllIlIIlIIIllII.IlIlllIIIIIIlIIllIIllIlll, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 70, this.lIIlIIIIIlIlllIlIIlIlIlll / 2 - 6, 140, 10);
            if (this.IllIIlllllllIIlIIlIIIIlIl != null) {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl.getName());
            }
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl(true);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        this.llIIlIllIllllIlIIIIlIIlll();
        class_1151.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlllIIlIllIIIlllllIl / 2 - 73, this.lIIlIIIIIlIlllIlIIlIlIlll / 2 - 19, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 73, this.lIIlIIIIIlIlllIlIIlIlIlll / 2 + 8, -11250604);
        class_1151.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlllIIlIllIIIlllllIl / 2 - 72, this.lIIlIIIIIlIlllIlIIlIlIlll / 2 - 18, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 72, this.lIIlIIIIIlIlllIlIIlIlIlll / 2 + 7, -3881788);
        GL11.glPushMatrix();
        GL11.glScalef((float)this.IlIllllllIIlIIllllIIlIIIl, (float)this.IlIllllllIIlIIllllIIlIIIl, (float)this.IlIllllllIIlIIllllIIlIIIl);
        int n3 = (int)((float)this.IlIlIIlllIIlIllIIIlllllIl / this.IlIllllllIIlIIllllIIlIIIl);
        int n4 = (int)((float)this.lIIlIIIIIlIlllIlIIlIlIlll / this.IlIllllllIIlIIllllIIlIIIl);
        LunarClient.getInstance().ubuntuMedium16px.lllIIIllIIIIlllIlIIllIIll("Profile Name: ", (float)(n3 / 2) - 70.0f / this.IlIllllllIIlIIllllIIlIIIl, (float)(n4 / 2) - 17.0f / this.IlIllllllIIlIIllllIIlIIIl, 0x6F000000);
        LunarClient.getInstance().ubuntuMedium16px.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll, (float)(n3 / 2) - 72.0f / this.IlIllllllIIlIIllllIIlIIIl, (float)(n4 / 2) + 8.0f / this.IlIllllllIIlIIllllIIlIIIl, -1358954496);
        GL11.glPopMatrix();
        this.lllIlIIlIIIlIlIIIllIlllIl.lIllllIIlIIIlIllllllIIIll();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
        super.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
        switch (n) {
            case 1: {
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll);
                ((class_0822)this.lllIIIllIIIIlllIlIIllIIll).IllIIIllIIIIlIlIlIllIIlll = ((class_0822)this.lllIIIllIIIIlllIlIIllIIll).lIllllIIlIIIlIllllllIIIll;
                break;
            }
            case 28: {
                if (this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl().length() < 3) {
                    this.lIllllIIlIIIlIllllllIIIll = (Object)((Object) EnumChatFormatting.RED) + "Name must be at least 3 characters long.";
                    break;
                }
                if (this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl().equalsIgnoreCase("default")) {
                    this.lIllllIIlIIIlIllllllIIIll = (Object)((Object) EnumChatFormatting.RED) + "That name is already in use.";
                    break;
                }
                if (!this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl().matches("([a-zA-Z0-9-_ \\]\\[]+)")) {
                    this.lIllllIIlIIIlIllllllIIIll = (Object)((Object) EnumChatFormatting.RED) + "Illegal characters in name.";
                    break;
                }
                if (this.IllIIlllllllIIlIIlIIIIlIl != null && !this.IllIIlllllllIIlIIlIIIIlIl.isEditable()) {
                    File file = new File(class_0576.lllIIIllIIIIlllIlIIllIIll + File.separator + "profiles" + File.separator + this.IllIIlllllllIIlIIlIIIIlIl.getName() + ".cfg");
                    File file2 = new File(class_0576.lllIIIllIIIIlllIlIIllIIll + File.separator + "profiles" + File.separator + this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl() + ".cfg");
                    if (!file.exists()) break;
                    try {
                        Files.copy(file.toPath(), file2.toPath(), new CopyOption[0]);
                        Files.delete(file.toPath());
                        this.IllIIlllllllIIlIIlIIIIlIl.setName(this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl());
                        this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll);
                        ((class_0822)this.lllIIIllIIIIlllIlIIllIIll).IllIIIllIIIIlIlIlIllIIlll = ((class_0822)this.lllIIIllIIIIlllIlIIllIIll).lIllllIIlIIIlIllllllIIIll;
                    }
                    catch (Exception exception) {
                        this.lIllllIIlIIIlIllllllIIIll = (Object)((Object) EnumChatFormatting.RED) + "Could not save profile.";
                        exception.printStackTrace();
                    }
                    break;
                }
                Profile class_11652 = null;
                for (Profile class_11653 : LunarClient.getInstance().profiles) {
                    if (!class_11653.getName().toLowerCase().equalsIgnoreCase(this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl())) continue;
                    class_11652 = class_11653;
                    break;
                }
                if (class_11652 == null) {
                    LunarClient.getInstance().lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(LunarClient.getInstance().activeProfile.getName());
                    Profile class_11654 = new Profile(this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl(), false);
                    LunarClient.getInstance().profiles.add(class_11654);
                    LunarClient.getInstance().activeProfile = class_11654;
                    this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll.add(new class_0883(this.IlIIIIIllllllIIlllIllllll, this.lIlllIlllIIIIlIIlllIllIII, class_11654, this.IlIllllllIIlIIllllIIlIIIl));
                    LunarClient.getInstance().lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(LunarClient.getInstance().activeProfile.getName());
                    this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll);
                    ((class_0822)this.lllIIIllIIIIlllIlIIllIIll).IllIIIllIIIIlIlIlIllIIlll = ((class_0822)this.lllIIIllIIIIlllIlIIllIIll).lIllllIIlIIIlIllllllIIIll;
                    break;
                }
                this.lIllllIIlIIIlIllllllIIIll = (Object)((Object) EnumChatFormatting.RED) + "That name is already in use.";
                break;
            }
            default: {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(c, n);
            }
        }
    }
}

