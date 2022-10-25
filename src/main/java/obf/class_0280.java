package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

public class class_0280
extends Thread {
    private final class_1422 lllIIIllIIIIlllIlIIllIIll;
    private final InetAddress lllIlIIlIIIlIlIIIllIlllIl;
    private final MulticastSocket IlIllllllIIlIIllllIIlIIIl;

    public class_0280(class_1422 class_14222) {
        super("LanServerDetector #" + class_0901.lllIIIllIIIIlllIlIIllIIll().incrementAndGet());
        this.lllIIIllIIIIlllIlIIllIIll = class_14222;
        this.setDaemon(true);
        this.IlIllllllIIlIIllllIIlIIIl = new MulticastSocket(4445);
        this.lllIlIIlIIIlIlIIIllIlllIl = InetAddress.getByName("224.0.2.60");
        this.IlIllllllIIlIIllllIIlIIIl.setSoTimeout(5000);
        this.IlIllllllIIlIIllllIIlIIIl.joinGroup(this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public void run() {
        byte[] arrby = new byte[1024];
        while (!this.isInterrupted()) {
            DatagramPacket datagramPacket = new DatagramPacket(arrby, arrby.length);
            try {
                this.IlIllllllIIlIIllllIIlIIIl.receive(datagramPacket);
            }
            catch (SocketTimeoutException socketTimeoutException) {
                continue;
            }
            catch (IOException iOException) {
                class_0901.lllIlIIlIIIlIlIIIllIlllIl().error("Couldn't ping server", (Throwable)iOException);
                break;
            }
            String string = new String(datagramPacket.getData(), datagramPacket.getOffset(), datagramPacket.getLength());
            class_0901.lllIlIIlIIIlIlIIIllIlllIl().debug(datagramPacket.getAddress() + ": " + string);
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(string, datagramPacket.getAddress());
        }
        try {
            this.IlIllllllIIlIIllllIIlIIIl.leaveGroup(this.lllIlIIlIIIlIlIIIllIlllIl);
        }
        catch (IOException iOException) {
            // empty catch block
        }
        this.IlIllllllIIlIIllllIIlIIIl.close();
    }
}

