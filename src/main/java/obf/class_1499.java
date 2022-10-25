package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.moonsworth.client.nethandler.LCPacket
 *  com.moonsworth.client.nethandler.client.LCPacketClientVoice
 */
import com.moonsworth.client.nethandler.LCPacket;
import com.moonsworth.client.nethandler.client.LCPacketClientVoice;
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class class_1499 {
    private String IlIllllllIIlIIllllIIlIIIl;
    public static byte[] lllIIIllIIIIlllIlIIllIIll;
    public static byte[] lllIlIIlIIIlIlIIIllIlllIl;

    public class_1499(String string) {
        this.IlIllllllIIlIIllllIIlIIIl = string;
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public static native void lllIIIllIIIIlllIlIIllIIll(String[] var0);

    public static native void lllIIIllIIIIlllIlIIllIIll(String var0);

    public static native void lllIIIllIIIIlllIlIIllIIll(String var0, String var1, String var2);

    public static void lllIlIIlIIIlIlIIIllIlllIl() {
        String string = "";
        String string2 = "";
        String string3 = "";
        String string4 = "";
        String string5 = "";
        String string6 = "";
        String string7 = "";
        for (Method accessibleObject : Minecraft.class.getMethods()) {
            if (accessibleObject.getReturnType() == Minecraft.class) {
                string = accessibleObject.getName() + ":()L" + Minecraft.class.getCanonicalName().replaceAll("\\.", "/") + ";";
                continue;
            }
            if (accessibleObject.getReturnType() != class_1764.class) continue;
            string2 = accessibleObject.getName() + ":()L" + class_1764.class.getCanonicalName().replaceAll("\\.", "/") + ";";
        }
        for (Method method : class_1764.class.getMethods()) {
            if (method.getParameterTypes().length != 1 || method.getParameterTypes()[0] != class_0703.class) continue;
            string3 = method.getName() + ":(L" + class_0703.class.getCanonicalName().replaceAll("\\.", "/") + ";)V";
        }
        for (AccessibleObject accessibleObject : class_1521.class.getFields()) {
            if (((Field)accessibleObject).getType() != Float.TYPE) continue;
            string4 = ((Field)accessibleObject).getName() + ":F";
            break;
        }
        for (AccessibleObject accessibleObject : Main.class.getMethods()) {
            if (((Method)accessibleObject).getParameterTypes().length != 1 || ((Method)accessibleObject).getParameterTypes()[0] != String[].class) continue;
            string5 = ((Method)accessibleObject).getName() + ":([Ljava/lang/String;)V";
        }
        for (AccessibleObject accessibleObject : class_0298.class.getMethods()) {
            if (accessibleObject.isAnnotationPresent(class_1556.class)) {
                string6 = ((Method)accessibleObject).getName() + ":(Ljava/lang/String;)[B";
            }
            if (!accessibleObject.isAnnotationPresent(class_2112.class)) continue;
            string7 = ((Method)accessibleObject).getName() + ":(Ljava/lang/String;)Z";
        }
        class_1499.lllIIIllIIIIlllIlIIllIIll(new String[]{class_1499.lIlllIlllIIIIlIIlllIllIII(class_0917.class.getName()), class_1499.lIlllIlllIIIIlIIlllIllIII(class_1147.class.getName()), class_1499.lIlllIlllIIIIlIIlllIllIII(Minecraft.class.getName()), class_1499.lIlllIlllIIIIlIIlllIllIII(class_1764.class.getName()), class_1499.lIlllIlllIIIIlIIlllIllIII(class_1521.class.getName()), class_1499.lIlllIlllIIIIlIIlllIllIII(class_0298.class.getName()), class_1499.lIlllIlllIIIIlIIlllIllIII(Main.class.getName()), string, string2, string3, string4, string5, string6, string7});
    }

    private static String lIlllIlllIIIIlIIlllIllIII(String string) {
        return string.replaceAll("\\.", "/");
    }

    public static native void lllIIIllIIIIlllIlIIllIIll(boolean var0);

    public static native void lllIIIllIIIIlllIlIIllIIll(String var0, byte[] var1);

    public static void lllIIIllIIIIlllIlIIllIIll(byte[] arrby) {
        LunarClient.getInstance().getNetworkManager().lllIIIllIIIIlllIlIIllIIll((LCPacket)new LCPacketClientVoice(arrby));
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl(byte[] arrby) {
        lllIIIllIIIIlllIlIIllIIll = arrby;
        Minecraft class_06672 = Minecraft.getMinecraft();
        if (class_06672.theWorld != null && class_06672.llIIlIllIllllIlIIIIlIIlll().IlIllllllIIlIIllllIIlIIIl().IllIIlllllllIIlIIlIIIIlIl().isOpen() && LunarClient.getInstance().getNetworkManager().lllIlIIlIIIlIlIIIllIlllIl()) {
            class_06672.llIIlIllIllllIlIIIIlIIlll().IlIllllllIIlIIllllIIlIIIl().IllIIlllllllIIlIIlIIIIlIl().writeAndFlush((Object)new class_0917(LunarClient.getInstance().lllIlIIlIIIlIlIIIllIlllIl(), arrby));
        }
    }

    public static void lllIIIllIIIIlllIlIIllIIll(String[] arrstring, String[] arrstring2) {
        for (int i = 0; i < arrstring.length; ++i) {
            System.out.print("[LC] Added mic option : " + arrstring2[i]);
            LunarClient.IIlIIlIlIlIllIIlIlIIIIlll().add(new class_1098(arrstring[i], arrstring2[i]));
        }
    }

    public static native void lllIlIIlIIIlIlIIIllIlllIl(String var0);

    public static native byte[] IlIllllllIIlIIllllIIlIIIl();

    public static native void lIlllIlllIIIIlIIlllIllIII();

    public static native void lllIIIllIIIIlllIlIIllIIll(float var0);

    public static native void lllIlIIlIIIlIlIIIllIlllIl(float var0);

    public static void IlIIIIIllllllIIlllIllllll() {
        Minecraft.getMinecraft().llIIllIllIlIIlIIllIllllll();
    }

    public static void IlIllllllIIlIIllllIIlIIIl(String string) {
        Minecraft class_06672 = Minecraft.getMinecraft();
        if (class_06672 != null && class_06672.IlIIIlIIIIllIIIllIIIIIIll != null && class_06672.IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl() != null) {
            class_0722 class_07222 = new class_0722("    " + string);
            class_07222.lllIIIllIIIIlllIlIIllIIll(true);
            Minecraft.getMinecraft().IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(class_07222);
        }
    }

    public static native boolean lllIIIllIIIIlllIlIIllIIll(int var0);

    public static native void lllIIIllIIIIlllIlIIllIIll(int var0, boolean var1);
}

