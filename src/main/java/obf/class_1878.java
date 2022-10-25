package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.TimeZone;
import javax.xml.parsers.DocumentBuilderFactory;

import net.minecraft.util.ResourceLocation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class class_1878 {
    private String lIlllIlllIIIIlIIlllIllIII;
    private String IlIIIIIllllllIIlllIllllll;
    private String lIllllIIlIIIlIllllllIIIll;
    private String IIIllIIlIIIIIIlIlIIllIIlI;
    private String IllIIlllllllIIlIIlIIIIlIl;
    private boolean IIIllIllIIlIlIlIlIllllIIl;
    private LocalDateTime IllIIIllIIIIlIlIlIllIIlll;
    private String lIIIIlIlIIlllllIIllIIlIII;
    private String llIIlllIllIllllIIIlIIIIII;
    private String llIIllIllIlIIlIIllIllllll;
    private String lllIIlIIIllllllIIIIlIlIlI = "";
    private int IlIlllIIIIIIlIIllIIllIlll;
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll;
    public ResourceLocation lllIlIIlIIIlIlIIIllIlllIl;
    public boolean IlIllllllIIlIIllllIIlIIIl;

    public class_1878(String string, String string2, String string3, String string4, String string5) {
        this.IllIIlllllllIIlIIlIIIIlIl = string;
        this.IIIllIIlIIIIIIlIlIIllIIlI = string2;
        this.lIllllIIlIIIlIllllllIIIll = string3;
        this.IlIIIIIllllllIIlllIllllll = string4;
        this.lIlllIlllIIIIlIIlllIllIII = string5;
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        class_1868.lllIlIIlIIIlIlIIIllIlllIl(class_1868.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII));
    }

    public void lllIlIIlIIIlIlIIIllIlllIl() {
        try {
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(this.lIlllIlllIIIIlIIlllIllIII());
            NodeList nodeList = document.getElementsByTagName("playlist");
            for (int i = 0; i < nodeList.getLength(); ++i) {
                Node node = nodeList.item(i);
                Element element = (Element)node;
                this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll(element, "title"));
                this.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll(element, "artist"));
                this.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll(element, "album"));
                this.lIlllIlllIIIIlIIlllIllIII(this.lllIIIllIIIIlllIlIIllIIll(element, "cover"));
                this.lllIIIllIIIIlllIlIIllIIll(Integer.parseInt(this.lllIIIllIIIIlllIlIIllIIll(element, "duration")));
                String string = this.lllIIIllIIIIlllIlIIllIIll(element, "programStartTS");
                String string2 = "dd MMM yy hh:mm:ss";
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(string2);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                if (this.lllIIIllIIIIlllIlIIllIIll != null && !("client/songs/" + this.IllIIIllIIIIlIlIlIllIIlll()).equals(this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll())) {
                    this.lllIlIIlIIIlIlIIIllIlllIl = this.lllIIIllIIIIlllIlIIllIIll;
                    this.lllIIIllIIIIlllIlIIllIIll = null;
                }
                try {
                    Date date = simpleDateFormat.parse(string);
                    this.lllIIIllIIIIlllIlIIllIIll(LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()));
                    continue;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (this.IlIllllllIIlIIllllIIlIIIl) {
            this.IlIllllllIIlIIllllIIlIIIl = false;
            this.lllIIIllIIIIlllIlIIllIIll();
        }
    }

    private String lllIIIllIIIIlllIlIIllIIll(Element element, String string) {
        try {
            NodeList nodeList = element.getElementsByTagName(string);
            Element element2 = (Element)nodeList.item(0);
            NodeList nodeList2 = element2.getChildNodes();
            return nodeList2.item(0).getNodeValue().trim();
        }
        catch (Exception exception) {
            return "";
        }
    }

    public String IlIllllllIIlIIllllIIlIIIl() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public String lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public String IlIIIIIllllllIIlllIllllll() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public String lIllllIIlIIIlIllllllIIIll() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public String IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    public boolean IllIIlllllllIIlIIlIIIIlIl() {
        return this.IIIllIllIIlIlIlIlIllllIIl;
    }

    public LocalDateTime IIIllIllIIlIlIlIlIllllIIl() {
        return this.IllIIIllIIIIlIlIlIllIIlll;
    }

    public String IllIIIllIIIIlIlIlIllIIlll() {
        return this.lIIIIlIlIIlllllIIllIIlIII;
    }

    public String lIIIIlIlIIlllllIIllIIlIII() {
        return this.llIIlllIllIllllIIIlIIIIII;
    }

    public String llIIlllIllIllllIIIlIIIIII() {
        return this.llIIllIllIlIIlIIllIllllll;
    }

    public String llIIllIllIlIIlIIllIllllll() {
        return this.lllIIlIIIllllllIIIIlIlIlI;
    }

    public int lllIIlIIIllllllIIIIlIlIlI() {
        return this.IlIlllIIIIIIlIIllIIllIlll;
    }

    public ResourceLocation IlIlllIIIIIIlIIllIIllIlll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public ResourceLocation IlIlIIlIlIllIIlIlIIllIIIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public boolean lllllIlllIIllIlIIlIIIllII() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public String toString() {
        return "Station(streamUrl=" + this.IlIllllllIIlIIllllIIlIIIl() + ", currentSongUrl=" + this.lIlllIlllIIIIlIIlllIllIII() + ", genre=" + this.IlIIIIIllllllIIlllIllllll() + ", logoUrl=" + this.lIllllIIlIIIlIllllllIIIll() + ", name=" + this.IIIllIIlIIIIIIlIlIIllIIlI() + ", favorite=" + this.IllIIlllllllIIlIIlIIIIlIl() + ", startTime=" + this.IIIllIllIIlIlIlIlIllllIIl() + ", title=" + this.IllIIIllIIIIlIlIlIllIIlll() + ", artist=" + this.lIIIIlIlIIlllllIIllIIlIII() + ", album=" + this.llIIlllIllIllllIIIlIIIIII() + ", coverUrl=" + this.llIIllIllIlIIlIIllIllllll() + ", duration=" + this.lllIIlIIIllllllIIIIlIlIlI() + ", RESOURCE_CURRENT=" + this.IlIlllIIIIIIlIIllIIllIlll() + ", RESOURCE_PREVIOUS=" + this.IlIlIIlIlIllIIlIlIIllIIIl() + ", play=" + this.lllllIlllIIllIlIIlIIIllII() + ")";
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.IIIllIllIIlIlIlIlIllllIIl = bl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(LocalDateTime localDateTime) {
        this.IllIIIllIIIIlIlIlIllIIlll = localDateTime;
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.lIIIIlIlIIlllllIIllIIlIII = string;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(String string) {
        this.llIIlllIllIllllIIIlIIIIII = string;
    }

    public void IlIllllllIIlIIllllIIlIIIl(String string) {
        this.llIIllIllIlIIlIIllIllllll = string;
    }

    public void lIlllIlllIIIIlIIlllIllIII(String string) {
        this.lllIIlIIIllllllIIIIlIlIlI = string;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        this.IlIlllIIIIIIlIIllIIllIlll = n;
    }
}

