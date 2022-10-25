package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Set;

public class class_1943
extends Thread {
    private class_1506 lllIIIllIIIIlllIlIIllIIll = null;
    private static final String lllIlIIlIIIlIlIIIllIlllIl = "\r\n";
    private static Charset IlIllllllIIlIIllllIIlIIIl = Charset.forName("ASCII");

    public class_1943(class_1506 class_15062) {
        super("HttpPipelineSender");
        this.lllIIIllIIIIlllIlIIllIIll = class_15062;
    }

    @Override
    public void run() {
        class_1929 class_19292 = null;
        try {
            this.lllIIIllIIIIlllIlIIllIIll();
            while (!Thread.interrupted()) {
                class_19292 = this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl();
                class_1416 class_14162 = class_19292.lllIIIllIIIIlllIlIIllIIll();
                OutputStream outputStream = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll();
                this.lllIIIllIIIIlllIlIIllIIll(class_14162, outputStream);
                this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(class_19292);
            }
        }
        catch (InterruptedException interruptedException) {
            return;
        }
        catch (Exception exception) {
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_19292, exception);
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll() {
        String string = this.lllIIIllIIIIlllIlIIllIIll.IllIIlllllllIIlIIlIIIIlIl();
        int n = this.lllIIIllIIIIlllIlIIllIIll.IIIllIllIIlIlIlIlIllllIIl();
        Proxy proxy = this.lllIIIllIIIIlllIlIIllIIll.IllIIIllIIIIlIlIlIllIIlll();
        Socket socket = new Socket(proxy);
        socket.connect(new InetSocketAddress(string, n), 5000);
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(socket);
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_1416 class_14162, OutputStream outputStream) {
        this.lllIIIllIIIIlllIlIIllIIll(outputStream, class_14162.IlIllllllIIlIIllllIIlIIIl() + " " + class_14162.lIlllIlllIIIIlIIlllIllIII() + " " + class_14162.IlIIIIIllllllIIlllIllllll() + lllIlIIlIIIlIlIIIllIlllIl);
        Map map = class_14162.lIllllIIlIIIlIllllllIIIll();
        Set set = map.keySet();
        for (String string : set) {
            String string2 = (String)class_14162.lIllllIIlIIIlIllllllIIIll().get(string);
            this.lllIIIllIIIIlllIlIIllIIll(outputStream, string + ": " + string2 + lllIlIIlIIIlIlIIIllIlllIl);
        }
        this.lllIIIllIIIIlllIlIIllIIll(outputStream, lllIlIIlIIIlIlIIIllIlllIl);
    }

    private void lllIIIllIIIIlllIlIIllIIll(OutputStream outputStream, String string) {
        byte[] arrby = string.getBytes(IlIllllllIIlIIllllIIlIIIl);
        outputStream.write(arrby);
    }
}

