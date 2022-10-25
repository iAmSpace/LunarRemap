package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_0014
extends Thread {
    private static final AtomicInteger lllIIIllIIIIlllIlIIllIIll = new AtomicInteger(0);
    private static final Logger lllIlIIlIIIlIlIIIllIlllIl = LogManager.getLogger();
    private final String IlIllllllIIlIIllllIIlIIIl;
    private final DatagramSocket lIlllIlllIIIIlIIlllIllIII;
    private boolean IlIIIIIllllllIIlllIllllll = true;
    private final String lIllllIIlIIIlIllllllIIIll;

    public class_0014(String string, String string2) {
        super("LanServerPinger #" + lllIIIllIIIIlllIlIIllIIll.incrementAndGet());
        this.IlIllllllIIlIIllllIIlIIIl = string;
        this.lIllllIIlIIIlIllllllIIIll = string2;
        this.setDaemon(true);
        this.lIlllIlllIIIIlIIlllIllIII = new DatagramSocket();
    }

    @Override
    public void run() {
        String string = class_0014.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, this.lIllllIIlIIIlIllllllIIIll);
        byte[] arrby = string.getBytes();
        while (!this.isInterrupted() && this.IlIIIIIllllllIIlllIllllll) {
            try {
                InetAddress inetAddress = InetAddress.getByName("224.0.2.60");
                DatagramPacket datagramPacket = new DatagramPacket(arrby, arrby.length, inetAddress, 4445);
                this.lIlllIlllIIIIlIIlllIllIII.send(datagramPacket);
            }
            catch (IOException iOException) {
                lllIlIIlIIIlIlIIIllIlllIl.warn("LanServerPinger: " + iOException.getMessage());
                break;
            }
            try {
                class_0014.sleep(1500L);
            }
            catch (InterruptedException interruptedException) {}
        }
    }

    @Override
    public void interrupt() {
        super.interrupt();
        this.IlIIIIIllllllIIlllIllllll = false;
    }

    public static String lllIIIllIIIIlllIlIIllIIll(String string, String string2) {
        return "[MOTD]" + string + "[/MOTD][AD]" + string2 + "[/AD]";
    }

    public static String lllIIIllIIIIlllIlIIllIIll(String string) {
        int n = string.indexOf("[MOTD]");
        if (n < 0) {
            return "missing no";
        }
        int n2 = string.indexOf("[/MOTD]", n + "[MOTD]".length());
        return n2 < n ? "missing no" : string.substring(n + "[MOTD]".length(), n2);
    }

    public static String lllIlIIlIIIlIlIIIllIlllIl(String string) {
        int n = string.indexOf("[/MOTD]");
        if (n < 0) {
            return null;
        }
        int n2 = string.indexOf("[/MOTD]", n + "[/MOTD]".length());
        if (n2 >= 0) {
            return null;
        }
        int n3 = string.indexOf("[AD]", n + "[/MOTD]".length());
        if (n3 < 0) {
            return null;
        }
        int n4 = string.indexOf("[/AD]", n3 + "[AD]".length());
        return n4 < n3 ? null : string.substring(n3 + "[AD]".length(), n4);
    }
}

