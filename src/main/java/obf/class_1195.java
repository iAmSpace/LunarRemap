package obf;

import net.minecraft.client.Minecraft;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1195
implements class_0677 {
    private final Minecraft lllIIIllIIIIlllIlIIllIIll = Minecraft.getMinecraft();

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, int n5, class_0868 class_08682, int n6, int n7, boolean bl) {
        String string;
        int n8 = n3 + n5 / 2 - this.lllIIIllIIIIlllIlIIllIIll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll / 2;
        this.lllIIIllIIIIlllIlIIllIIll.IlIlllIIIIIIlIIllIIllIlll.lllIlIIlIIIlIlIIIllIlllIl(class_0616.lllIIIllIIIIlllIlIIllIIll("lanServer.scanning", new Object[0]), this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII.IlIlIIlllIIlIllIIIlllllIl / 2 - this.lllIIIllIIIIlllIlIIllIIll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(class_0616.lllIIIllIIIIlllIlIIllIIll("lanServer.scanning", new Object[0])) / 2, n8, 0xFFFFFF);
        switch ((int)(Minecraft.llllllIlIllllIlIlIlIIIIlI() / 300L % 4L)) {
            default: {
                string = "O o o";
                break;
            }
            case 1: 
            case 3: {
                string = "o O o";
                break;
            }
            case 2: {
                string = "o o O";
            }
        }
        this.lllIIIllIIIIlllIlIIllIIll.IlIlllIIIIIIlIIllIIllIlll.lllIlIIlIIIlIlIIIllIlllIl(string, this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII.IlIlIIlllIIlIllIIIlllllIl / 2 - this.lllIIIllIIIIlllIlIIllIIll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string) / 2, n8 + this.lllIIIllIIIIlllIlIIllIIll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll, 0x808080);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, int n5, int n6) {
        return false;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3, int n4, int n5, int n6) {
    }
}

