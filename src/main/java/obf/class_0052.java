package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.net.UnknownHostException;

class class_0052
implements Runnable {
    final /* synthetic */ class_0924 lllIIIllIIIIlllIlIIllIIll;

    class_0052(class_0924 class_09242) {
        this.lllIIIllIIIIlllIlIIllIIll = class_09242;
    }

    @Override
    public void run() {
        try {
            class_0924.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll).IllIIlllllllIIlIIlIIIIlIl().lllIIIllIIIIlllIlIIllIIll(class_0924.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll));
        }
        catch (UnknownHostException unknownHostException) {
            class_0924.lllIIIllIIIIlllIlIIllIIll((class_0924)this.lllIIIllIIIIlllIlIIllIIll).IIIllIIlIIIIIIlIlIIllIIlI = -1L;
            class_0924.lllIIIllIIIIlllIlIIllIIll((class_0924)this.lllIIIllIIIIlllIlIIllIIll).lIllllIIlIIIlIllllllIIIll = (Object)((Object) EnumChatFormatting.DARK_RED) + "Can't resolve hostname";
        }
        catch (Exception exception) {
            class_0924.lllIIIllIIIIlllIlIIllIIll((class_0924)this.lllIIIllIIIIlllIlIIllIIll).IIIllIIlIIIIIIlIlIIllIIlI = -1L;
            class_0924.lllIIIllIIIIlllIlIIllIIll((class_0924)this.lllIIIllIIIIlllIlIIllIIll).lIllllIIlIIIlIllllllIIIll = (Object)((Object) EnumChatFormatting.DARK_RED) + "Can't connect to server.";
        }
    }
}

