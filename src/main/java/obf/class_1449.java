package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Enumeration;

public class class_1449 {
    private static ArrayList lllIIIllIIIIlllIlIIllIIll;
    private static ArrayList lllIlIIlIIIlIlIIIllIlllIl;

    public static void lllIIIllIIIIlllIlIIllIIll() {
        lllIIIllIIIIlllIlIIllIIll = new ArrayList();
        lllIlIIlIIIlIlIIIllIlllIl = new ArrayList();
        Enumeration<NetworkInterface> enumeration = NetworkInterface.getNetworkInterfaces();
        while (enumeration.hasMoreElements()) {
            NetworkInterface networkInterface = enumeration.nextElement();
            if (networkInterface == null || networkInterface.isLoopback() || !networkInterface.isUp()) continue;
            for (InterfaceAddress interfaceAddress : networkInterface.getInterfaceAddresses()) {
                InetAddress inetAddress;
                InetAddress inetAddress2;
                if (interfaceAddress == null || !((inetAddress2 = interfaceAddress.getAddress()) instanceof Inet4Address) || (inetAddress = class_1449.lllIIIllIIIIlllIlIIllIIll(interfaceAddress.getNetworkPrefixLength())) == null) continue;
                lllIIIllIIIIlllIlIIllIIll.add(inetAddress2);
                lllIlIIlIIIlIlIIIllIlllIl.add(inetAddress);
            }
        }
    }

    private static InetAddress lllIIIllIIIIlllIlIIllIIll(int n) {
        try {
            int n2 = Integer.MIN_VALUE;
            for (int i = n - 1; i > 0; --i) {
                n2 >>= 1;
            }
            String string = Integer.toString(n2 >> 24 & 0xFF) + "." + Integer.toString(n2 >> 16 & 0xFF) + "." + Integer.toString(n2 >> 8 & 0xFF) + "." + Integer.toString(n2 & 0xFF);
            return InetAddress.getByName(string);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIllIIIIlllIlIIllIIll(InetAddress inetAddress, InetAddress inetAddress2, InetAddress inetAddress3) {
        byte[] arrby = inetAddress.getAddress();
        byte[] arrby2 = inetAddress2.getAddress();
        byte[] arrby3 = inetAddress3.getAddress();
        for (int i = 0; i < arrby.length; ++i) {
            if ((arrby[i] & arrby3[i]) == (arrby2[i] & arrby3[i])) continue;
            return false;
        }
        return true;
    }

    public static boolean lllIIIllIIIIlllIlIIllIIll(InetAddress inetAddress) {
        try {
            for (int i = 0; i < lllIIIllIIIIlllIlIIllIIll.size(); ++i) {
                if (!class_1449.lllIIIllIIIIlllIlIIllIIll((InetAddress)lllIIIllIIIIlllIlIIllIIll.get(i), inetAddress, (InetAddress)lllIlIIlIIIlIlIIIllIlllIl.get(i))) continue;
                return true;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return false;
    }
}

