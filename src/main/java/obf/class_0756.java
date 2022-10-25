package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  io.netty.util.concurrent.GenericFutureListener
 *  org.apache.commons.lang3.ArrayUtils
 */
import com.mojang.authlib.GameProfile;
import io.netty.util.concurrent.GenericFutureListener;
import net.minecraft.client.Minecraft;
import net.minecraft.util.IChatComponent;
import org.apache.commons.lang3.ArrayUtils;

class class_0756
implements class_0709 {
    private boolean lIlllIlllIIIIlIIlllIllIII = false;
    final /* synthetic */ class_1092 lllIIIllIIIIlllIlIIllIIll;
    final /* synthetic */ class_0800 lllIlIIlIIIlIlIIIllIlllIl;
    final /* synthetic */ class_2245 IlIllllllIIlIIllllIIlIIIl;

    class_0756(class_2245 class_22452, class_1092 class_10922, class_0800 class_08002) {
        this.IlIllllllIIlIIllllIIlIIIl = class_22452;
        this.lllIIIllIIIIlllIlIIllIIll = class_10922;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_08002;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0046 class_00462) {
        CharSequence charSequence;
        class_0111 class_01112 = class_00462.IlIllllllIIlIIllllIIlIIIl();
        this.lllIIIllIIIIlllIlIIllIIll.lllIIlIIIllllllIIIIlIlIlI = class_01112.lllIIIllIIIIlllIlIIllIIll != null;
        this.lllIIIllIIIIlllIlIIllIIll.IlIlllIIIIIIlIIllIIllIlll = class_01112.lllIIIllIIIIlllIlIIllIIll;
        this.lllIIIllIIIIlllIlIIllIIll.llIIllIllIlIIlIIllIllllll = true;
        this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll = class_01112.lllIIIllIIIIlllIlIIllIIll() != null ? class_01112.lllIIIllIIIIlllIlIIllIIll().lIlllIlllIIIIlIIlllIllIII() : "";
        if (class_01112.IlIllllllIIlIIllllIIlIIIl() != null) {
            this.lllIIIllIIIIlllIlIIllIIll.IIIllIllIIlIlIlIlIllllIIl = class_01112.IlIllllllIIlIIllllIIlIIIl().lllIIIllIIIIlllIlIIllIIll();
            this.lllIIIllIIIIlllIlIIllIIll.IllIIlllllllIIlIIlIIIIlIl = class_01112.IlIllllllIIlIIllllIIlIIIl().lllIlIIlIIIlIlIIIllIlllIl();
        } else {
            this.lllIIIllIIIIlllIlIIllIIll.IIIllIllIIlIlIlIlIllllIIl = "Old";
            this.lllIIIllIIIIlllIlIIllIIll.IllIIlllllllIIlIIlIIIIlIl = 0;
        }
        if (class_01112.lllIlIIlIIIlIlIIIllIlllIl() != null) {
            this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl = (Object)((Object)class_1227.IllIIlllllllIIlIIlIIIIlIl) + "" + class_01112.lllIlIIlIIIlIlIIIllIlllIl().lllIlIIlIIIlIlIIIllIlllIl() + "" + (Object)((Object)class_1227.IIIllIllIIlIlIlIlIllllIIl) + "/" + (Object)((Object)class_1227.IllIIlllllllIIlIIlIIIIlIl) + class_01112.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll();
            if (ArrayUtils.isNotEmpty((Object[])class_01112.lllIlIIlIIIlIlIIIllIlllIl().IlIllllllIIlIIllllIIlIIIl())) {
                charSequence = new StringBuilder();
                for (GameProfile gameProfile : class_01112.lllIlIIlIIIlIlIIIllIlllIl().IlIllllllIIlIIllllIIlIIIl()) {
                    if (((StringBuilder)charSequence).length() > 0) {
                        ((StringBuilder)charSequence).append("\n");
                    }
                    ((StringBuilder)charSequence).append(gameProfile.getName());
                }
                if (class_01112.lllIlIIlIIIlIlIIIllIlllIl().IlIllllllIIlIIllllIIlIIIl().length < class_01112.lllIlIIlIIIlIlIIIllIlllIl().lllIlIIlIIIlIlIIIllIlllIl()) {
                    if (((StringBuilder)charSequence).length() > 0) {
                        ((StringBuilder)charSequence).append("\n");
                    }
                    ((StringBuilder)charSequence).append("... and ").append(class_01112.lllIlIIlIIIlIlIIIllIlllIl().lllIlIIlIIIlIlIIIllIlllIl() - class_01112.lllIlIIlIIIlIlIIIllIlllIl().IlIllllllIIlIIllllIIlIIIl().length).append(" more ...");
                }
                this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII = ((StringBuilder)charSequence).toString();
            }
        } else {
            this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl = (Object)((Object)class_1227.IIIllIllIIlIlIlIlIllllIIl) + "???";
        }
        if (class_01112.lIlllIlllIIIIlIIlllIllIII() != null) {
            charSequence = class_01112.lIlllIlllIIIIlIIlllIllIII();
            if (((String)charSequence).startsWith("data:image/png;base64,")) {
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(((String)charSequence).substring("data:image/png;base64,".length()));
            } else {
                class_2245.IlIllllllIIlIIllllIIlIIIl().error("Invalid server icon (unknown format)");
            }
        } else {
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll((String)null);
        }
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new class_1894(Minecraft.llllllIlIllllIlIlIlIIIIlI()), new GenericFutureListener[0]);
        this.lIlllIlllIIIIlIIlllIllIII = true;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1714 class_17142) {
        long l = class_17142.IlIllllllIIlIIllllIIlIIIl();
        long l2 = Minecraft.llllllIlIllllIlIlIlIIIIlI();
        this.lllIIIllIIIIlllIlIIllIIll.IIIllIIlIIIIIIlIlIIllIIlI = l2 - l;
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new class_0722("Finished"));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(IChatComponent class_22552) {
        if (!this.lIlllIlllIIIIlIIlllIllIII) {
            class_2245.IlIllllllIIlIIllllIIlIIIl().error("Can't ping " + this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl + ": " + class_22552.IlIllllllIIlIIllllIIlIIIl());
            this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll = (Object)((Object)class_1227.IlIIIIIllllllIIlllIllllll) + "Can't connect to server.";
            this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl = "";
            class_2245.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, this.lllIIIllIIIIlllIlIIllIIll);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0546 class_05462, class_0546 class_05463) {
        if (class_05463 != class_0546.IlIllllllIIlIIllllIIlIIIl) {
            throw new UnsupportedOperationException("Unexpected change in protocol to " + (Object)((Object)class_05463));
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll() {
    }
}

