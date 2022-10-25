package obf;/*
 * Decompiled with CFR 0.150.
 */
import optifine.Config;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;

public class class_1145
extends Thread {
    private class_1506 lllIIIllIIIIlllIlIIllIIll = null;
    private static final Charset lllIlIIlIIIlIlIIIllIlllIl = Charset.forName("ASCII");
    private static final String IlIllllllIIlIIllllIIlIIIl = "Content-Length";
    private static final char lIlllIlllIIIIlIIlllIllIII = '\r';
    private static final char IlIIIIIllllllIIlllIllllll = '\n';

    public class_1145(class_1506 class_15062) {
        super("HttpPipelineReceiver");
        this.lllIIIllIIIIlllIlIIllIIll = class_15062;
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            class_1929 class_19292 = null;
            try {
                class_19292 = this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII();
                InputStream inputStream = this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl();
                class_0962 class_09622 = this.lllIIIllIIIIlllIlIIllIIll(inputStream);
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_19292, class_09622);
            }
            catch (InterruptedException interruptedException) {
                return;
            }
            catch (Exception exception) {
                this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(class_19292, exception);
            }
        }
    }

    private class_0962 lllIIIllIIIIlllIlIIllIIll(InputStream inputStream) {
        String string = this.IlIllllllIIlIIllllIIlIIIl(inputStream);
        String[] arrstring = Config.lllIIIllIIIIlllIlIIllIIll(string, " ");
        if (arrstring.length < 3) {
            throw new IOException("Invalid status line: " + string);
        }
        String string2 = arrstring[0];
        int n = Config.lllIIIllIIIIlllIlIIllIIll(arrstring[1], 0);
        String string3 = arrstring[2];
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        while (true) {
            String string4;
            String string5;
            String string6;
            if ((string6 = this.IlIllllllIIlIIllllIIlIIIl(inputStream)).length() <= 0) {
                byte[] arrby = null;
                string5 = (String)linkedHashMap.get(IlIllllllIIlIIllllIIlIIIl);
                if (string5 != null) {
                    int n2 = Config.lllIIIllIIIIlllIlIIllIIll(string5, -1);
                    if (n2 > 0) {
                        arrby = new byte[n2];
                        this.lllIIIllIIIIlllIlIIllIIll(arrby, inputStream);
                    }
                } else {
                    string4 = (String)linkedHashMap.get("Transfer-Encoding");
                    if (Config.lllIIIllIIIIlllIlIIllIIll((Object)string4, (Object)"chunked")) {
                        arrby = this.lllIlIIlIIIlIlIIIllIlllIl(inputStream);
                    }
                }
                return new class_0962(n, string, linkedHashMap, arrby);
            }
            int n3 = string6.indexOf(":");
            if (n3 <= 0) continue;
            string4 = string6.substring(0, n3).trim();
            string5 = string6.substring(n3 + 1).trim();
            linkedHashMap.put(string4, string5);
        }
    }

    private byte[] lllIlIIlIIIlIlIIIllIlllIl(InputStream inputStream) {
        int n;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        do {
            String string = this.IlIllllllIIlIIllllIIlIIIl(inputStream);
            String[] arrstring = Config.lllIIIllIIIIlllIlIIllIIll(string, "; ");
            n = Integer.parseInt(arrstring[0], 16);
            byte[] arrby = new byte[n];
            this.lllIIIllIIIIlllIlIIllIIll(arrby, inputStream);
            byteArrayOutputStream.write(arrby);
            this.IlIllllllIIlIIllllIIlIIIl(inputStream);
        } while (n != 0);
        return byteArrayOutputStream.toByteArray();
    }

    private void lllIIIllIIIIlllIlIIllIIll(byte[] arrby, InputStream inputStream) {
        int n;
        for (int i = 0; i < arrby.length; i += n) {
            n = inputStream.read(arrby, i, arrby.length - i);
            if (n >= 0) continue;
            throw new EOFException();
        }
    }

    private String IlIllllllIIlIIllllIIlIIIl(InputStream inputStream) {
        int n;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int n2 = -1;
        boolean bl = false;
        while ((n = inputStream.read()) >= 0) {
            byteArrayOutputStream.write(n);
            if (n2 == 13 && n == 10) {
                bl = true;
                break;
            }
            n2 = n;
        }
        byte[] arrby = byteArrayOutputStream.toByteArray();
        String string = new String(arrby, lllIlIIlIIIlIlIIIllIlllIl);
        if (bl) {
            string = string.substring(0, string.length() - 2);
        }
        return string;
    }
}

