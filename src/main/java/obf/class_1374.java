package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.net.UnknownHostException;

class class_1374
implements Runnable {
    final /* synthetic */ class_1303 lllIIIllIIIIlllIlIIllIIll;

    class_1374(class_1303 class_13032) {
        this.lllIIIllIIIIlllIlIIllIIll = class_13032;
    }

    @Override
    public void run() {
        try {
            class_1303.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll).IllIIlllllllIIlIIlIIIIlIl().lllIIIllIIIIlllIlIIllIIll(class_1303.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll));
        }
        catch (UnknownHostException unknownHostException) {
            class_1303.lllIIIllIIIIlllIlIIllIIll((class_1303)this.lllIIIllIIIIlllIlIIllIIll).IIIllIIlIIIIIIlIlIIllIIlI = -1L;
            class_1303.lllIIIllIIIIlllIlIIllIIll((class_1303)this.lllIIIllIIIIlllIlIIllIIll).lIllllIIlIIIlIllllllIIIll = (Object)((Object) EnumChatFormatting.DARK_RED) + "Can't resolve hostname";
        }
        catch (Exception exception) {
            class_1303.lllIIIllIIIIlllIlIIllIIll((class_1303)this.lllIIIllIIIIlllIlIIllIIll).IIIllIIlIIIIIIlIlIIllIIlI = -1L;
            class_1303.lllIIIllIIIIlllIlIIllIIll((class_1303)this.lllIIIllIIIIlllIlIIllIIll).lIllllIIlIIIlIllllllIIIll = (Object)((Object) EnumChatFormatting.DARK_RED) + "Can't connect to server.";
        }
    }
}

