package obf;

import net.minecraft.util.ChatComponentTranslation;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1330
extends class_0229 {
    private final class_0229 lllIIIllIIIIlllIlIIllIIll;
    private class_1197 lllIlIIlIIIlIlIIIllIlllIl;
    private class_1197 IlIllllllIIlIIllllIIlIIIl;
    private String lIlllIlllIIIIlIIlllIllIII = "survival";
    private boolean IlIIIIIllllllIIlllIllllll;

    public class_1330(class_0229 class_02292) {
        this.lllIIIllIIIIlllIlIIllIIll = class_02292;
    }

    @Override
    public void n_() {
        this.lIlIlIIlIIIIlIIIIIlllIIII.clear();
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(101, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 155, this.lIIlIIIIIlIlllIlIIlIlIlll - 28, 150, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("lanServer.start", new Object[0])));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(102, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 5, this.lIIlIIIIIlIlllIlIIlIlIlll - 28, 150, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("gui.cancel", new Object[0])));
        this.IlIllllllIIlIIllllIIlIIIl = new class_1197(104, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 155, 100, 150, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.gameMode", new Object[0]));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.IlIllllllIIlIIllllIIlIIIl);
        this.lllIlIIlIIIlIlIIIllIlllIl = new class_1197(103, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 5, 100, 150, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.allowCommands", new Object[0]));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.lllIlIIlIIIlIlIIIllIlllIl);
        this.lIllllIIlIIIlIllllllIIIll();
    }

    private void lIllllIIlIIIlIllllllIIIll() {
        this.IlIllllllIIlIIllllIIlIIIl.IllIIlllllllIIlIIlIIIIlIl = class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.gameMode", new Object[0]) + " " + class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.gameMode." + this.lIlllIlllIIIIlIIlllIllIII, new Object[0]);
        this.lllIlIIlIIIlIlIIIllIlllIl.IllIIlllllllIIlIIlIIIIlIl = class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.allowCommands", new Object[0]) + " ";
        this.lllIlIIlIIIlIlIIIllIlllIl.IllIIlllllllIIlIIlIIIIlIl = this.IlIIIIIllllllIIlllIllllll ? this.lllIlIIlIIIlIlIIIllIlllIl.IllIIlllllllIIlIIlIIIIlIl + class_0616.lllIIIllIIIIlllIlIIllIIll("options.on", new Object[0]) : this.lllIlIIlIIIlIlIIIllIlllIl.IllIIlllllllIIlIIlIIIIlIl + class_0616.lllIIIllIIIIlllIlIIllIIll("options.off", new Object[0]);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 102) {
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll);
        } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 104) {
            this.lIlllIlllIIIIlIIlllIllIII = this.lIlllIlllIIIIlIIlllIllIII.equals("survival") ? "creative" : (this.lIlllIlllIIIIlIIlllIllIII.equals("creative") ? "adventure" : "survival");
            this.lIllllIIlIIIlIllllllIIIll();
        } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 103) {
            this.IlIIIIIllllllIIlllIllllll = !this.IlIIIIIllllllIIlllIllllll;
            this.lIllllIIlIIIlIllllllIIIll();
        } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 101) {
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll((class_0229)null);
            String string = this.lllllIlllIIllIlIIlIIIllII.llllIIIIlIIIlIIIIIIlIllll().lllIIIllIIIIlllIlIIllIIll(class_2243.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII), this.IlIIIIIllllllIIlllIllllll);
            class_1014 class_10142 = string != null ? new ChatComponentTranslation("commands.publish.started", string) : new class_0722("commands.publish.failed");
            this.lllllIlllIIllIlIIlIIIllII.IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(class_10142);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        this.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, class_0616.lllIIIllIIIIlllIlIIllIIll("lanServer.title", new Object[0]), this.IlIlIIlllIIlIllIIIlllllIl / 2, 50, 0xFFFFFF);
        this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, class_0616.lllIIIllIIIIlllIlIIllIIll("lanServer.otherPlayers", new Object[0]), this.IlIlIIlllIIlIllIIIlllllIl / 2, 82, 0xFFFFFF);
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
    }
}

