package obf;/*
 * Decompiled with CFR 0.150.
 */
import optifine.Config;

import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Proxy;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

public class class_1506 {
    private String IlIllllllIIlIIllllIIlIIIl = null;
    private int lIlllIlllIIIIlIIlllIllIII = 0;
    private Proxy IlIIIIIllllllIIlllIllllll = Proxy.NO_PROXY;
    private List lIllllIIlIIIlIllllllIIIll = new LinkedList();
    private List IIIllIIlIIIIIIlIlIIllIIlI = new LinkedList();
    private Socket IllIIlllllllIIlIIlIIIIlIl = null;
    private InputStream IIIllIllIIlIlIlIlIllllIIl = null;
    private OutputStream IllIIIllIIIIlIlIlIllIIlll = null;
    private class_1943 lIIIIlIlIIlllllIIllIIlIII = null;
    private class_1145 llIIlllIllIllllIIIlIIIIII = null;
    private int llIIllIllIlIIlIIllIllllll = 0;
    private boolean lllIIlIIIllllllIIIIlIlIlI = false;
    private long IlIlllIIIIIIlIIllIIllIlll = 5000L;
    private int IlIlIIlIlIllIIlIlIIllIIIl = 1000;
    private long lllllIlllIIllIlIIlIIIllII = System.currentTimeMillis();
    private boolean IlIlIIlllIIlIllIIIlllllIl = false;
    private static final String lIIlIIIIIlIlllIlIIlIlIlll = "\n";
    public static final int lllIIIllIIIIlllIlIIllIIll = 5000;
    public static final int lllIlIIlIIIlIlIIIllIlllIl = 5000;
    private static final Pattern lIlIlIIlIIIIlIIIIIlllIIII = Pattern.compile("^[a-zA-Z]+://.*");

    public class_1506(String string, int n) {
        this(string, n, Proxy.NO_PROXY);
    }

    public class_1506(String string, int n, Proxy proxy) {
        this.IlIllllllIIlIIllllIIlIIIl = string;
        this.lIlllIlllIIIIlIIlllIllIII = n;
        this.IlIIIIIllllllIIlllIllllll = proxy;
        this.lIIIIlIlIIlllllIIllIIlIII = new class_1943(this);
        this.lIIIIlIlIIlllllIIllIIlIII.start();
        this.llIIlllIllIllllIIIlIIIIII = new class_1145(this);
        this.llIIlllIllIllllIIIlIIIIII.start();
    }

    public synchronized boolean lllIIIllIIIIlllIlIIllIIll(class_1929 class_19292) {
        if (this.IlIIIIIllllllIIlllIllllll()) {
            return false;
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_19292, this.lIllllIIlIIIlIllllllIIIll);
        this.lllIIIllIIIIlllIlIIllIIll(class_19292, this.IIIllIIlIIIIIIlIlIIllIIlI);
        ++this.llIIllIllIlIIlIIllIllllll;
        return true;
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_1929 class_19292, List list) {
        list.add(class_19292);
        this.notifyAll();
    }

    public synchronized void lllIIIllIIIIlllIlIIllIIll(Socket socket) {
        if (!this.IlIlIIlllIIlIllIIIlllllIl) {
            if (this.IllIIlllllllIIlIIlIIIIlIl != null) {
                throw new IllegalArgumentException("Already connected");
            }
            this.IllIIlllllllIIlIIlIIIIlIl = socket;
            this.IllIIlllllllIIlIIlIIIIlIl.setTcpNoDelay(true);
            this.IIIllIllIIlIlIlIlIllllIIl = this.IllIIlllllllIIlIIlIIIIlIl.getInputStream();
            this.IllIIIllIIIIlIlIlIllIIlll = new BufferedOutputStream(this.IllIIlllllllIIlIIlIIIIlIl.getOutputStream());
            this.llIIlllIllIllllIIIlIIIIII();
            this.notifyAll();
        }
    }

    public synchronized OutputStream lllIIIllIIIIlllIlIIllIIll() {
        while (this.IllIIIllIIIIlIlIlIllIIlll == null) {
            this.lIIIIlIlIIlllllIIllIIlIII();
            this.wait(1000L);
        }
        return this.IllIIIllIIIIlIlIlIllIIlll;
    }

    public synchronized InputStream lllIlIIlIIIlIlIIIllIlllIl() {
        while (this.IIIllIllIIlIlIlIlIllllIIl == null) {
            this.lIIIIlIlIIlllllIIllIIlIII();
            this.wait(1000L);
        }
        return this.IIIllIllIIlIlIlIlIllllIIl;
    }

    public synchronized class_1929 IlIllllllIIlIIllllIIlIIIl() {
        if (this.IIIllIIlIIIIIIlIlIIllIIlI.size() <= 0 && this.IllIIIllIIIIlIlIlIllIIlll != null) {
            this.IllIIIllIIIIlIlIlIllIIlll.flush();
        }
        return this.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI, true);
    }

    public synchronized class_1929 lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll, false);
    }

    private class_1929 lllIIIllIIIIlllIlIIllIIll(List list, boolean bl) {
        while (list.size() <= 0) {
            this.lIIIIlIlIIlllllIIllIIlIII();
            this.wait(1000L);
        }
        this.llIIlllIllIllllIIIlIIIIII();
        if (bl) {
            return (class_1929)list.remove(0);
        }
        return (class_1929)list.get(0);
    }

    private void lIIIIlIlIIlllllIIllIIlIII() {
        if (this.IllIIlllllllIIlIIlIIIIlIl != null) {
            long l;
            long l2 = this.IlIlllIIIIIIlIIllIIllIlll;
            if (this.lIllllIIlIIIlIllllllIIIll.size() > 0) {
                l2 = 5000L;
            }
            if ((l = System.currentTimeMillis()) > this.lllllIlllIIllIlIIlIIIllII + l2) {
                this.lllIIIllIIIIlllIlIIllIIll(new InterruptedException("Timeout " + l2));
            }
        }
    }

    private void llIIlllIllIllllIIIlIIIIII() {
        this.lllllIlllIIllIlIIlIIIllII = System.currentTimeMillis();
    }

    public synchronized void lllIlIIlIIIlIlIIIllIlllIl(class_1929 class_19292) {
        if (!this.IlIlIIlllIIlIllIIIlllllIl) {
            this.llIIlllIllIllllIIIlIIIIII();
        }
    }

    public synchronized void lllIIIllIIIIlllIlIIllIIll(class_1929 class_19292, class_0962 class_09622) {
        if (!this.IlIlIIlllIIlIllIIIlllllIl) {
            this.lllIIlIIIllllllIIIIlIlIlI = true;
            this.llIIlllIllIllllIIIlIIIIII();
            if (this.lIllllIIlIIIlIllllllIIIll.size() > 0 && this.lIllllIIlIIIlIllllllIIIll.get(0) == class_19292) {
                this.lIllllIIlIIIlIllllllIIIll.remove(0);
                class_19292.lllIIIllIIIIlllIlIIllIIll(true);
                String string = class_09622.lllIIIllIIIIlllIlIIllIIll("Location");
                if (class_09622.lllIIIllIIIIlllIlIIllIIll() / 100 == 3 && string != null && class_19292.lllIIIllIIIIlllIlIIllIIll().IllIIlllllllIIlIIlIIIIlIl() < 5) {
                    try {
                        string = this.lllIIIllIIIIlllIlIIllIIll(string, class_19292.lllIIIllIIIIlllIlIIllIIll());
                        class_1416 class_14162 = class_1186.lllIIIllIIIIlllIlIIllIIll(string, class_19292.lllIIIllIIIIlllIlIIllIIll().IIIllIllIIlIlIlIlIllllIIl());
                        class_14162.lllIIIllIIIIlllIlIIllIIll(class_19292.lllIIIllIIIIlllIlIIllIIll().IllIIlllllllIIlIIlIIIIlIl() + 1);
                        class_1929 class_19293 = new class_1929(class_14162, class_19292.lllIlIIlIIIlIlIIIllIlllIl());
                        class_1186.lllIIIllIIIIlllIlIIllIIll(class_19293);
                    }
                    catch (IOException iOException) {
                        class_19292.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(class_19292.lllIIIllIIIIlllIlIIllIIll(), iOException);
                    }
                } else {
                    class_1874 class_18742 = class_19292.lllIlIIlIIIlIlIIIllIlllIl();
                    class_18742.lllIIIllIIIIlllIlIIllIIll(class_19292.lllIIIllIIIIlllIlIIllIIll(), class_09622);
                }
                this.lllIIIllIIIIlllIlIIllIIll(class_09622);
            } else {
                throw new IllegalArgumentException("Response out of order: " + class_19292);
            }
        }
    }

    private String lllIIIllIIIIlllIlIIllIIll(String string, class_1416 class_14162) {
        if (lIlIlIIlIIIIlIIIIIlllIIII.matcher(string).matches()) {
            return string;
        }
        if (string.startsWith("//")) {
            return "http:" + string;
        }
        String string2 = class_14162.lllIIIllIIIIlllIlIIllIIll();
        if (class_14162.lllIlIIlIIIlIlIIIllIlllIl() != 80) {
            string2 = string2 + ":" + class_14162.lllIlIIlIIIlIlIIIllIlllIl();
        }
        if (string.startsWith("/")) {
            return "http://" + string2 + string;
        }
        String string3 = class_14162.lIlllIlllIIIIlIIlllIllIII();
        int n = string3.lastIndexOf("/");
        return n >= 0 ? "http://" + string2 + string3.substring(0, n + 1) + string : "http://" + string2 + "/" + string;
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_0962 class_09622) {
        String string;
        String string2 = class_09622.lllIIIllIIIIlllIlIIllIIll("Connection");
        if (string2 != null && !string2.toLowerCase().equals("keep-alive")) {
            this.lllIIIllIIIIlllIlIIllIIll(new EOFException("Connection not keep-alive"));
        }
        if ((string = class_09622.lllIIIllIIIIlllIlIIllIIll("Keep-Alive")) != null) {
            String[] arrstring = Config.lllIIIllIIIIlllIlIIllIIll(string, ",;");
            for (int i = 0; i < arrstring.length; ++i) {
                int n;
                String string3 = arrstring[i];
                String[] arrstring2 = this.lllIIIllIIIIlllIlIIllIIll(string3, '=');
                if (arrstring2.length < 2) continue;
                if (arrstring2[0].equals("timeout") && (n = Config.lllIIIllIIIIlllIlIIllIIll(arrstring2[1], -1)) > 0) {
                    this.IlIlllIIIIIIlIIllIIllIlll = n * 1000;
                }
                if (!arrstring2[0].equals("max") || (n = Config.lllIIIllIIIIlllIlIIllIIll(arrstring2[1], -1)) <= 0) continue;
                this.IlIlIIlIlIllIIlIlIIllIIIl = n;
            }
        }
    }

    private String[] lllIIIllIIIIlllIlIIllIIll(String string, char c) {
        int n = string.indexOf(c);
        if (n < 0) {
            return new String[]{string};
        }
        String string2 = string.substring(0, n);
        String string3 = string.substring(n + 1);
        return new String[]{string2, string3};
    }

    public synchronized void lllIIIllIIIIlllIlIIllIIll(class_1929 class_19292, Exception exception) {
        this.lllIIIllIIIIlllIlIIllIIll(exception);
    }

    public synchronized void lllIlIIlIIIlIlIIIllIlllIl(class_1929 class_19292, Exception exception) {
        this.lllIIIllIIIIlllIlIIllIIll(exception);
    }

    private synchronized void lllIIIllIIIIlllIlIIllIIll(Exception exception) {
        if (!this.IlIlIIlllIIlIllIIIlllllIl) {
            this.IlIlIIlllIIlIllIIIlllllIl = true;
            this.lllIlIIlIIIlIlIIIllIlllIl(exception);
            if (this.lIIIIlIlIIlllllIIllIIlIII != null) {
                this.lIIIIlIlIIlllllIIllIIlIII.interrupt();
            }
            if (this.llIIlllIllIllllIIIlIIIIII != null) {
                this.llIIlllIllIllllIIIlIIIIII.interrupt();
            }
            try {
                if (this.IllIIlllllllIIlIIlIIIIlIl != null) {
                    this.IllIIlllllllIIlIIlIIIIlIl.close();
                }
            }
            catch (IOException iOException) {
                // empty catch block
            }
            this.IllIIlllllllIIlIIlIIIIlIl = null;
            this.IIIllIllIIlIlIlIlIllllIIl = null;
            this.IllIIIllIIIIlIlIlIllIIlll = null;
        }
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(Exception exception) {
        if (this.lIllllIIlIIIlIllllllIIIll.size() > 0) {
            class_1929 class_19292;
            if (!this.lllIIlIIIllllllIIIIlIlIlI) {
                class_19292 = (class_1929)this.lIllllIIlIIIlIllllllIIIll.remove(0);
                class_19292.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(class_19292.lllIIIllIIIIlllIlIIllIIll(), exception);
                class_19292.lllIIIllIIIIlllIlIIllIIll(true);
            }
            while (this.lIllllIIlIIIlIllllllIIIll.size() > 0) {
                class_19292 = (class_1929)this.lIllllIIlIIIlIllllllIIIll.remove(0);
                class_1186.lllIIIllIIIIlllIlIIllIIll(class_19292);
            }
        }
    }

    public synchronized boolean IlIIIIIllllllIIlllIllllll() {
        return this.IlIlIIlllIIlIllIIIlllllIl ? true : this.llIIllIllIlIIlIIllIllllll >= this.IlIlIIlIlIllIIlIlIIllIIIl;
    }

    public int lIllllIIlIIIlIllllllIIIll() {
        return this.llIIllIllIlIIlIIllIllllll;
    }

    public synchronized boolean IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.lIllllIIlIIIlIllllllIIIll.size() > 0;
    }

    public String IllIIlllllllIIlIIlIIIIlIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public int IIIllIllIIlIlIlIlIllllIIl() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public Proxy IllIIIllIIIIlIlIlIllIIlll() {
        return this.IlIIIIIllllllIIlllIllllll;
    }
}

