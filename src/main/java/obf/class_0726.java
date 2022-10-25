package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javafx.geometry.Point3D
 */
import java.awt.Color;
import javafx.geometry.Point3D;

public class class_0726 {
    private String lllIIIllIIIIlllIlIIllIIll;
    private boolean lllIlIIlIIIlIlIIIllIlllIl = false;
    private Point3D IlIllllllIIlIIllllIIlIIIl;
    private long lIlllIlllIIIIlIIlllIllIII;
    private Color IlIIIIIllllllIIlllIllllll;
    private long lIllllIIlIIIlIllllllIIIll;

    public void lllIIIllIIIIlllIlIIllIIll(Color color) {
        this.IlIIIIIllllllIIlllIllllll = color;
    }

    public class_0726(String string, boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
        this.lllIlIIlIIIlIlIIIllIlllIl = bl;
        this.lIlllIlllIIIIlIIlllIllIII = System.currentTimeMillis();
    }

    public void lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3, long l) {
        this.IlIllllllIIlIIllllIIlIIIl = new Point3D(d, d2, d3);
        this.lIlllIlllIIIIlIIlllIllIII = System.currentTimeMillis();
        this.lIllllIIlIIIlIllllllIIIll = l;
    }

    public Point3D lllIIIllIIIIlllIlIIllIIll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public long lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public String IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public long lIlllIlllIIIIlIIlllIllIII() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public boolean IlIIIIIllllllIIlllIllllll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public Color lIllllIIlIIIlIllllllIIIll() {
        return this.IlIIIIIllllllIIlllIllllll;
    }
}

