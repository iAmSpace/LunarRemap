package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.util.concurrent.GenericFutureListener
 */
import com.moonsworth.lunar.client.LunarClient;
import io.netty.util.concurrent.GenericFutureListener;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentTranslation;

import java.net.InetAddress;
import java.net.UnknownHostException;

class class_0477
extends Thread {
    final /* synthetic */ String lllIIIllIIIIlllIlIIllIIll;
    final /* synthetic */ int lllIlIIlIIIlIlIIIllIlllIl;
    final /* synthetic */ class_0019 IlIllllllIIlIIllllIIlIIIl;

    class_0477(class_0019 class_00192, String string, String string2, int n) {
        this.IlIllllllIIlIIllllIIlIIIl = class_00192;
        this.lllIIIllIIIIlllIlIIllIIll = string2;
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        super(string);
    }

    @Override
    public void run() {
        InetAddress inetAddress = null;
        try {
            if (class_0019.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl)) {
                return;
            }
            inetAddress = InetAddress.getByName(this.lllIIIllIIIIlllIlIIllIIll);
            Minecraft.getMinecraft().IlIllllllIIlIIllllIIlIIIl.lIlllIlllIIIIlIIlllIllIII = inetAddress.getHostAddress();
            Minecraft.getMinecraft().IlIllllllIIlIIllllIIlIIIl.IlIIIIIllllllIIlllIllllll = this.lllIlIIlIIIlIlIIIllIlllIl;
            class_0019.lIllllIIlIIIlIllllllIIIll().lllIIIllIIIIlllIlIIllIIll(Minecraft.getMinecraft().IlIllllllIIlIIllllIIlIIIl);
            while (!Minecraft.getMinecraft().IlIllllllIIlIIllllIIlIIIl.llIIllIllIlIIlIIllIllllll) {
                try {
                    Thread.sleep(100L);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
            LunarClient.getInstance().getEventBus().callEvent(new class_1594());
            class_0019.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, class_0800.lllIIIllIIIIlllIlIIllIIll(inetAddress, this.lllIlIIlIIIlIlIIIllIlllIl));
            class_0019.lllIlIIlIIIlIlIIIllIlllIl((class_0019)this.IlIllllllIIlIIllllIIlIIIl).IIIllIllIIlIlIlIlIllllIIl = Minecraft.getMinecraft().IlIllllllIIlIIllllIIlIIIl.lllIIlIIIllllllIIIIlIlIlI;
            class_0019.lllIlIIlIIIlIlIIIllIlllIl(this.IlIllllllIIlIIllllIIlIIIl).lllIIIllIIIIlllIlIIllIIll(new class_0188(class_0019.lllIlIIlIIIlIlIIIllIlllIl(this.IlIllllllIIlIIllllIIlIIIl), class_0019.IlIllllllIIlIIllllIIlIIIl(this.IlIllllllIIlIIllllIIlIIIl), class_0019.lIlllIlllIIIIlIIlllIllIII(this.IlIllllllIIlIIllllIIlIIIl)));
            class_0019.lllIlIIlIIIlIlIIIllIlllIl(this.IlIllllllIIlIIllllIIlIIIl).lllIIIllIIIIlllIlIIllIIll(new class_0302(Minecraft.getMinecraft().IlIllllllIIlIIllllIIlIIIl.IllIIlllllllIIlIIlIIIIlIl == -1332 ? -1332 : 5, this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, class_0546.lIlllIlllIIIIlIIlllIllIII), new GenericFutureListener[0]);
            class_0019.lllIlIIlIIIlIlIIIllIlllIl(this.IlIllllllIIlIIllllIIlIIIl).lllIIIllIIIIlllIlIIllIIll(new class_1222(class_0019.IlIIIIIllllllIIlllIllllll(this.IlIllllllIIlIIllllIIlIIIl).getSession().func_148256_e()), new GenericFutureListener[0]);
        }
        catch (UnknownHostException unknownHostException) {
            if (class_0019.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl)) {
                return;
            }
            class_0019.IIIllIIlIIIIIIlIlIIllIIlI().error("Couldn't connect to server", (Throwable)unknownHostException);
            class_0019.lIllllIIlIIIlIllllllIIIll(this.IlIllllllIIlIIllllIIlIIIl).lllIIIllIIIIlllIlIIllIIll(new class_0768(class_0019.lIlllIlllIIIIlIIlllIllIII(this.IlIllllllIIlIIllllIIlIIIl), "connect.failed", new ChatComponentTranslation("disconnect.genericReason", "Unknown host")));
        }
        catch (Exception exception) {
            if (class_0019.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl)) {
                return;
            }
            class_0019.IIIllIIlIIIIIIlIlIIllIIlI().error("Couldn't connect to server", (Throwable)exception);
            String string = exception.toString();
            if (inetAddress != null) {
                String string2 = inetAddress.toString() + ":" + this.lllIlIIlIIIlIlIIIllIlllIl;
                string = string.replaceAll(string2, "");
            }
            class_0019.IIIllIIlIIIIIIlIlIIllIIlI(this.IlIllllllIIlIIllllIIlIIIl).lllIIIllIIIIlllIlIIllIIll(new class_0768(class_0019.lIlllIlllIIIIlIIlllIllIII(this.IlIllllllIIlIIllllIIlIIIl), "connect.failed", new ChatComponentTranslation("disconnect.genericReason", string)));
        }
    }
}

