package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.DefaultResourcePack;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.util.MathHelper;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.imageio.ImageIO;

public class class_0602
implements class_0237 {
    private class_2013 IlIllllllIIlIIllllIIlIIIl;
    private class_1835 lIlllIlllIIIIlIIlllIllIII = null;
    Minecraft lllIIIllIIIIlllIlIIllIIll = null;
    private List IlIIIIIllllllIIlllIllllll = null;
    private BufferedImage lIllllIIlIIIlIllllllIIIll = null;
    private BufferedImage IIIllIIlIIIIIIlIlIIllIIlI;
    private int IllIIlllllllIIlIIlIIIIlIl = -1;
    private int[] IIIllIllIIlIlIlIlIllllIIl = new int[86016];
    private int[] IllIIIllIIIIlIlIlIllIIlll = new int[86016];
    private static int lIIIIlIlIIlllllIIllIIlIII = -65281;
    private Set llIIlllIllIllllIIIlIIIIII = new HashSet();
    private boolean llIIllIllIlIIlIIllIllllll = false;
    private boolean lllIIlIIIllllllIIIIlIlIlI = false;
    private HashMap IlIlllIIIIIIlIIllIIllIlll = new HashMap();
    private Set IlIlIIlIlIllIIlIlIIllIIIl = new HashSet();
    private HashMap lllllIlllIIllIlIIlIIIllII = new HashMap();
    private String IlIlIIlllIIlIllIIIlllllIl;
    private final Object lIIlIIIIIlIlllIlIIlIlIlll = new Object();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public class_0602(class_2013 class_20132) {
        this.IlIllllllIIlIIllllIIlIIIl = class_20132;
        this.lIlllIlllIIIIlIIlllIllIII = class_20132.lllIlIIlIIIlIlIIIllIlllIl();
        this.lllIIIllIIIIlllIlIIllIIll = Minecraft.getMinecraft();
        this.lllIIlIIIllllllIIIIlIlIlI = false;
        Field field = null;
        try {
            field = GameSettings.class.getDeclaredField("llIIIlllIlllIlIllIIIIllIl");
        }
        catch (SecurityException securityException) {
        }
        catch (NoSuchFieldException noSuchFieldException) {
        }
        finally {
            if (field != null) {
                this.lllIIlIIIllllllIIIIlIlIlI = true;
            }
        }
        this.llIIllIllIlIIlIIllIllllll = class_1736.lllIIIllIIIIlllIlIIllIIll("com.prupe.mcpatcher.ctm.CTMUtils");
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IIIllIllIIlIlIlIlIllllIIl[class_1498.lllIIIllIIIIlllIlIIllIIll];
    }

    @Override
    public Set IlIllllllIIlIIllllIIlIIIl() {
        return this.llIIlllIllIllllIIIlIIIIII;
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIIlIIIllllllIIIIlIlIlI;
    }

    @Override
    public HashMap IlIIIIIllllllIIlllIllllll() {
        return this.IlIlllIIIIIIlIIllIIllIlll;
    }

    @Override
    public BufferedImage lIllllIIlIIIlIllllllIIIll() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    @Override
    public boolean IIIllIIlIIIIIIlIlIIllIIlI() {
        if (this.IlIIIIIllllllIIlllIllllll == null || !this.IlIIIIIllllllIIlllIllllll.equals(this.lllIIIllIIIIlllIlIIllIIll.gameSettings.resourcePacks)) {
            this.IllIIlllllllIIlIIlIIIIlIl();
            return true;
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void IllIIlllllllIIlIIlIIIIlIl() {
        this.IlIIIIIllllllIIlllIllllll = new ArrayList(this.lllIIIllIIIIlllIlIIllIIll.gameSettings.resourcePacks);
        class_1498.lllIIIllIIIIlllIlIIllIIll();
        this.IllIIIllIIIIlIlIlIllIIlll();
        this.lIIIIlIlIIlllllIIllIIlIII();
        this.llIIlllIllIllllIIIlIIIIII();
        Object object = this.lIIlIIIIIlIlllIlIIlIlIlll;
        synchronized (object) {
            try {
                new Thread((Runnable)new class_0506(this), "Voxelmap Load Resourcepack Thread").start();
            }
            catch (Exception exception) {
                System.err.println("error loading pack");
                exception.printStackTrace();
            }
        }
        if (this.IlIllllllIIlIIllllIIlIIIl.IlIIIIIllllllIIlllIllllll() != null) {
            this.IlIllllllIIlIIllllIIlIIIl.IlIIIIIllllllIIlllIllllll().lllIIIllIIIIlllIlIIllIIll();
        }
    }

    @Override
    public final BufferedImage lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        try {
            class_2102 class_21022 = ((Block) Block.blockRegistry.lllIIIllIIIIlllIlIIllIIll(n)).lllIIIllIIIIlllIlIIllIIll(3, n2);
            int n3 = (int)(class_21022.IlIllllllIIlIIllllIIlIIIl() * (float)this.lIllllIIlIIIlIllllllIIIll.getWidth());
            int n4 = (int)(class_21022.lIlllIlllIIIIlIIlllIllIII() * (float)this.lIllllIIlIIIlIllllllIIIll.getWidth());
            int n5 = (int)(class_21022.IlIIIIIllllllIIlllIllllll() * (float)this.lIllllIIlIIIlIllllllIIIll.getHeight());
            int n6 = (int)(class_21022.lIllllIIlIIIlIllllllIIIll() * (float)this.lIllllIIlIIIlIllllllIIIll.getHeight());
            return this.lIllllIIlIIIlIllllllIIIll.getSubimage(n3, n5, n4 - n3, n6 - n5);
        }
        catch (Exception exception) {
            return null;
        }
    }

    private void IllIIIllIIIIlIlIlIllIIlll() {
        try {
            InputStream inputStream = this.lllIIIllIIIIlllIlIIllIIll.getResourceManager().getResource(new ResourceLocation("voxelmap/images/colorPicker.png")).getInputStream();
            BufferedImage bufferedImage = ImageIO.read(inputStream);
            inputStream.close();
            this.IIIllIIlIIIIIIlIlIIllIIlI = new BufferedImage(((Image)bufferedImage).getWidth(null), ((Image)bufferedImage).getHeight(null), 2);
            Graphics2D graphics2D = this.IIIllIIlIIIIIIlIlIIllIIlI.createGraphics();
            graphics2D.drawImage((Image)bufferedImage, 0, 0, null);
            graphics2D.dispose();
        }
        catch (Exception exception) {
            System.err.println("Error loading color picker: " + exception.getLocalizedMessage());
        }
    }

    private void lIIIIlIlIIlllllIIllIIlIII() {
        if (this.IllIIlllllllIIlIIlIIIIlIl != -1) {
            class_2210.lllIlIIlIIIlIlIIIllIlllIl(this.IllIIlllllllIIlIIlIIIIlIl);
        }
        try {
            InputStream inputStream = this.lllIIIllIIIIlllIlIIllIIll.getResourceManager().getResource(new ResourceLocation("voxelmap/images/squaremap.png")).getInputStream();
            BufferedImage bufferedImage = ImageIO.read(inputStream);
            BufferedImage bufferedImage2 = new BufferedImage(((Image)bufferedImage).getWidth(null), ((Image)bufferedImage).getHeight(null), 2);
            Graphics2D graphics2D = bufferedImage2.createGraphics();
            graphics2D.drawImage((Image)bufferedImage, 0, 0, null);
            this.IllIIlllllllIIlIIlIIIIlIl = class_2210.lllIIIllIIIIlllIlIIllIIll(bufferedImage2);
        }
        catch (Exception exception) {
            try {
                InputStream inputStream = this.lllIIIllIIIIlllIlIIllIIll.getResourceManager().getResource(new ResourceLocation("textures/map/map_background.png")).getInputStream();
                BufferedImage bufferedImage = ImageIO.read(inputStream);
                inputStream.close();
                BufferedImage bufferedImage3 = new BufferedImage(((Image)bufferedImage).getWidth(null), ((Image)bufferedImage).getHeight(null), 2);
                Graphics2D graphics2D = bufferedImage3.createGraphics();
                if (!class_2210.IlIllllllIIlIIllllIIlIIIl && !class_2210.IlIIIIIllllllIIlllIllllll) {
                    graphics2D.setColor(Color.DARK_GRAY);
                    graphics2D.fillRect(0, 0, bufferedImage3.getWidth(), bufferedImage3.getHeight());
                }
                graphics2D.drawImage((Image)bufferedImage, 0, 0, null);
                int n = bufferedImage3.getWidth() * 8 / 128;
                graphics2D.setComposite(AlphaComposite.Clear);
                graphics2D.fillRect(n, n, bufferedImage3.getWidth() - n * 2, bufferedImage3.getHeight() - n * 2);
                graphics2D.dispose();
                this.IllIIlllllllIIlIIlIIIIlIl = class_2210.lllIIIllIIIIlllIlIIllIIll(bufferedImage3);
            }
            catch (Exception exception2) {
                System.err.println("Error loading texture pack's map image: " + exception2.getLocalizedMessage());
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        for (int i = 0; i < 16; ++i) {
            this.IIIllIllIIlIlIlIlIllllIIl[this.lIlllIlllIIIIlIIlllIllIII((int)class_1498.lllIIIllIIIIlllIlIIllIIll, (int)i)] = n;
        }
    }

    private void llIIlllIllIllllIIIlIIIIII() {
        try {
            class_1682 class_16822 = this.lllIIIllIIIIlllIlIIllIIll.llIIlIIllIIllIlIIllIIllII();
            class_16822.lllIIIllIIIIlllIlIIllIIll(class_16822.lllIIIllIIIIlllIlIIllIIll(0));
            BufferedImage bufferedImage = class_0450.lllIIIllIIIIlllIlIIllIIll();
            this.lIllllIIlIIIlIllllllIIIll = new BufferedImage(bufferedImage.getWidth(null), bufferedImage.getHeight(null), 6);
            Graphics2D graphics2D = this.lIllllIIlIIIlIllllllIIIll.createGraphics();
            graphics2D.drawImage((Image)bufferedImage, 0, 0, null);
            graphics2D.dispose();
        }
        catch (Exception exception) {
            System.err.println("Error processing new resource pack: " + exception.getLocalizedMessage());
            exception.printStackTrace();
        }
    }

    private void llIIllIllIlIIlIIllIllllll() {
        this.IIIllIllIIlIlIlIlIllllIIl[this.lIlllIlllIIIIlIIlllIllIII((int)class_1498.IIIllIllIIlIlIlIlIllllIIl, (int)0)] = this.lllIlIIlIIIlIlIIIllIlllIl(this.lIllllIIlIIIlIllllllIIIll(class_1498.IIIllIllIIlIlIlIlIllllIIl, 0), -1);
        for (int i = 0; i < 16; ++i) {
            this.IIIllIllIIlIlIlIlIllllIIl[this.lIlllIlllIIIIlIIlllIllIII((int)class_1498.IlIlllIIIIIIlIIllIIllIlll, (int)i)] = this.lllIIIllIIIIlllIlIIllIIll(class_1498.IlIlllIIIIIIlIIllIIllIlll, i, false);
        }
        class_1415.lllIIIllIIIIlllIlIIllIIll(Block.lllIIIllIIIIlllIlIIllIIll("minecraft:flowing_lava"), 1);
        class_1415.lllIIIllIIIIlllIlIIllIIll(Block.lllIIIllIIIIlllIlIIllIIll("minecraft:lava"), 1);
    }

    private void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.IllIIIllIIIIlIlIlIllIIlll[this.lIlllIlllIIIIlIIlllIllIII((int)class_1498.IIIllIIlIIIIIIlIlIIllIIlI, (int)0)] = this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll(class_1498.IIIllIIlIIIIIIlIlIIllIIlI, 0), class_0614.lllIIIllIIIIlllIlIIllIIll(0.7, 0.8) | 0xFF000000);
        this.IllIIIllIIIIlIlIlIllIIlll[this.lIlllIlllIIIIlIIlllIllIII((int)class_1498.IllIIlllllllIIlIIlIIIIlIl, (int)0)] = this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll(class_1498.IllIIlllllllIIlIIlIIIIlIl, 0), class_0828.IlIllllllIIlIIllllIIlIIIl() | 0xFF000000);
        this.IllIIIllIIIIlIlIlIllIIlll[this.lIlllIlllIIIIlIIlllIllIII((int)class_1498.IllIIlllllllIIlIIlIIIIlIl, (int)1)] = this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll(class_1498.IllIIlllllllIIlIIlIIIIlIl, 1), class_0828.lllIIIllIIIIlllIlIIllIIll() | 0xFF000000);
        this.IllIIIllIIIIlIlIlIllIIlll[this.lIlllIlllIIIIlIIlllIllIII((int)class_1498.IllIIlllllllIIlIIlIIIIlIl, (int)2)] = this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll(class_1498.IllIIlllllllIIlIIlIIIIlIl, 2), class_0828.lllIlIIlIIIlIlIIIllIlllIl() | 0xFF000000);
        this.IllIIIllIIIIlIlIlIllIIlll[this.lIlllIlllIIIIlIIlllIllIII((int)class_1498.IllIIlllllllIIlIIlIIIIlIl, (int)3)] = this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll(class_1498.IllIIlllllllIIlIIlIIIIlIl, 3), class_0828.IlIllllllIIlIIllllIIlIIIl() | 0xFF000000);
        this.IllIIIllIIIIlIlIlIllIIlll[this.lIlllIlllIIIIlIIlllIllIII((int)class_1498.IllIIlllllllIIlIIlIIIIlIl, (int)4)] = this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll(class_1498.IllIIlllllllIIlIIlIIIIlIl, 4), class_0828.IlIllllllIIlIIllllIIlIIIl() | 0xFF000000);
        this.IllIIIllIIIIlIlIlIllIIlll[this.lIlllIlllIIIIlIIlllIllIII((int)class_1498.IllIIlllllllIIlIIlIIIIlIl, (int)5)] = this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll(class_1498.IllIIlllllllIIlIIlIIIIlIl, 5), class_0828.lllIIIllIIIIlllIlIIllIIll() | 0xFF000000);
        this.IllIIIllIIIIlIlIlIllIIlll[this.lIlllIlllIIIIlIIlllIllIII((int)class_1498.IllIIlllllllIIlIIlIIIIlIl, (int)6)] = this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll(class_1498.IllIIlllllllIIlIIlIIIIlIl, 6), class_0828.lllIlIIlIIIlIlIIIllIlllIl() | 0xFF000000);
        this.IllIIIllIIIIlIlIlIllIIlll[this.lIlllIlllIIIIlIIlllIllIII((int)class_1498.IllIIlllllllIIlIIlIIIIlIl, (int)7)] = this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll(class_1498.IllIIlllllllIIlIIlIIIIlIl, 7), class_0828.IlIllllllIIlIIllllIIlIIIl() | 0xFF000000);
        this.IllIIIllIIIIlIlIlIllIIlll[this.lIlllIlllIIIIlIIlllIllIII((int)class_1498.IllIIlllllllIIlIIlIIIIlIl, (int)8)] = this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll(class_1498.IllIIlllllllIIlIIlIIIIlIl, 8), class_0828.IlIllllllIIlIIllllIIlIIIl() | 0xFF000000);
        this.IllIIIllIIIIlIlIlIllIIlll[this.lIlllIlllIIIIlIIlllIllIII((int)class_1498.IllIIlllllllIIlIIlIIIIlIl, (int)9)] = this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll(class_1498.IllIIlllllllIIlIIlIIIIlIl, 9), class_0828.lllIIIllIIIIlllIlIIllIIll() | 0xFF000000);
        this.IllIIIllIIIIlIlIlIllIIlll[this.lIlllIlllIIIIlIIlllIllIII((int)class_1498.IllIIlllllllIIlIIlIIIIlIl, (int)10)] = this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll(class_1498.IllIIlllllllIIlIIlIIIIlIl, 10), class_0828.lllIlIIlIIIlIlIIIllIlllIl() | 0xFF000000);
        this.IllIIIllIIIIlIlIlIllIIlll[this.lIlllIlllIIIIlIIlllIllIII((int)class_1498.IllIIlllllllIIlIIlIIIIlIl, (int)11)] = this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll(class_1498.IllIIlllllllIIlIIlIIIIlIl, 11), class_0828.IlIllllllIIlIIllllIIlIIIl() | 0xFF000000);
        this.IllIIIllIIIIlIlIlIllIIlll[this.lIlllIlllIIIIlIIlllIllIII((int)class_1498.IllIIlllllllIIlIIlIIIIlIl, (int)12)] = this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll(class_1498.IllIIlllllllIIlIIlIIIIlIl, 12), class_0828.IlIllllllIIlIIllllIIlIIIl() | 0xFF000000);
        this.IllIIIllIIIIlIlIlIllIIlll[this.lIlllIlllIIIIlIIlllIllIII((int)class_1498.IllIIlllllllIIlIIlIIIIlIl, (int)13)] = this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll(class_1498.IllIIlllllllIIlIIlIIIIlIl, 13), class_0828.lllIIIllIIIIlllIlIIllIIll() | 0xFF000000);
        this.IllIIIllIIIIlIlIlIllIIlll[this.lIlllIlllIIIIlIIlllIllIII((int)class_1498.IllIIlllllllIIlIIlIIIIlIl, (int)14)] = this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll(class_1498.IllIIlllllllIIlIIlIIIIlIl, 14), class_0828.lllIlIIlIIIlIlIIIllIlllIl() | 0xFF000000);
        this.IllIIIllIIIIlIlIlIllIIlll[this.lIlllIlllIIIIlIIlllIllIII((int)class_1498.IllIIlllllllIIlIIlIIIIlIl, (int)15)] = this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll(class_1498.IllIIlllllllIIlIIlIIIIlIl, 15), class_0828.IlIllllllIIlIIllllIIlIIIl() | 0xFF000000);
        this.IllIIIllIIIIlIlIlIllIIlll[this.lIlllIlllIIIIlIIlllIllIII((int)class_1498.llIIllIllIlIIlIIllIllllll, (int)0)] = this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll(class_1498.llIIllIllIlIIlIIllIllllll, 0), class_0828.IlIllllllIIlIIllllIIlIIIl() | 0xFF000000);
        this.IllIIIllIIIIlIlIlIllIIlll[this.lIlllIlllIIIIlIIlllIllIII((int)class_1498.llIIllIllIlIIlIIllIllllll, (int)1)] = this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll(class_1498.llIIllIllIlIIlIIllIllllll, 1), class_0828.IlIllllllIIlIIllllIIlIIIl() | 0xFF000000);
        this.IllIIIllIIIIlIlIlIllIIlll[this.lIlllIlllIIIIlIIlllIllIII((int)class_1498.llIIllIllIlIIlIIllIllllll, (int)4)] = this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll(class_1498.llIIllIllIlIIlIIllIllllll, 4), class_0828.IlIllllllIIlIIllllIIlIIIl() | 0xFF000000);
        this.IllIIIllIIIIlIlIlIllIIlll[this.lIlllIlllIIIIlIIlllIllIII((int)class_1498.llIIllIllIlIIlIIllIllllll, (int)5)] = this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll(class_1498.llIIllIllIlIIlIIllIllllll, 5), class_0828.IlIllllllIIlIIllllIIlIIIl() | 0xFF000000);
        this.IllIIIllIIIIlIlIlIllIIlll[this.lIlllIlllIIIIlIIlllIllIII((int)class_1498.IIIllIllIIlIlIlIlIllllIIl, (int)1)] = this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll(class_1498.IIIllIllIIlIlIlIlIllllIIl, 1), class_0614.lllIIIllIIIIlllIlIIllIIll(0.7, 0.8) | 0xFF000000);
        this.IllIIIllIIIIlIlIlIllIIlll[this.lIlllIlllIIIIlIIlllIllIII((int)class_1498.IIIllIllIIlIlIlIlIllllIIl, (int)2)] = this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll(class_1498.IIIllIllIIlIlIlIlIllllIIl, 2), class_0614.lllIIIllIIIIlllIlIIllIIll(0.7, 0.8) | 0xFF000000);
        this.IllIIIllIIIIlIlIlIllIIlll[this.lIlllIlllIIIIlIIlllIllIII((int)class_1498.lllIIlIIIllllllIIIIlIlIlI, (int)2)] = this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll(class_1498.lllIIlIIIllllllIIIIlIlIlI, 2), class_0614.lllIIIllIIIIlllIlIIllIIll(0.7, 0.8) | 0xFF000000);
        this.IllIIIllIIIIlIlIlIllIIlll[this.lIlllIlllIIIIlIIlllIllIII((int)class_1498.lllIIlIIIllllllIIIIlIlIlI, (int)3)] = this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll(class_1498.lllIIlIIIllllllIIIIlIlIlI, 3), class_0614.lllIIIllIIIIlllIlIIllIIll(0.7, 0.8) | 0xFF000000);
        for (int i = 0; i < 16; ++i) {
            this.IllIIIllIIIIlIlIlIllIIlll[this.lIlllIlllIIIIlIIlllIllIII((int)class_1498.IllIIIllIIIIlIlIlIllIIlll, (int)0)] = this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll(class_1498.IllIIIllIIIIlIlIlIllIIlll, 0), class_0614.lllIIIllIIIIlllIlIIllIIll(0.7, 0.8) | 0xFF000000);
            this.IllIIIllIIIIlIlIlIllIIlll[this.lIlllIlllIIIIlIIlllIllIII((int)class_1498.lIIIIlIlIIlllllIIllIIlIII, (int)i)] = this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll(class_1498.lIIIIlIlIIlllllIIllIIlIII, i), class_0828.lllIIIllIIIIlllIlIIllIIll(0.7, 0.8) | 0xFF000000);
        }
        this.lllIlIIlIIIlIlIIIllIlllIl(bl);
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(boolean bl) {
        int n = -1;
        n = this.IlIIIIIllllllIIlllIllllll(class_1498.lllIlIIlIIIlIlIIIllIlllIl, 0);
        InputStream inputStream = null;
        int n2 = -1;
        BufferedImage bufferedImage = null;
        try {
            inputStream = this.lllIIIllIIIIlllIlIIllIIll.getResourceManager().getResource(new ResourceLocation("mcpatcher/colormap/water.png")).getInputStream();
        }
        catch (IOException iOException) {
            inputStream = null;
        }
        if (inputStream != null) {
            try {
                BufferedImage bufferedImage2 = ImageIO.read(inputStream);
                inputStream.close();
                bufferedImage = new BufferedImage(((Image)bufferedImage2).getWidth(null), ((Image)bufferedImage2).getHeight(null), 1);
                Graphics2D graphics2D = bufferedImage.createGraphics();
                graphics2D.drawImage((Image)bufferedImage2, 0, 0, null);
                graphics2D.dispose();
                class_0672 class_06722 = class_0672.lIIlIIIIIlIlllIlIIlIlIlll;
                double d = MathHelper.clamp_float(class_06722.lllIIIllIIIIlllIlIIllIIll(0, 64, 0), 0.0f, 1.0f);
                double d2 = MathHelper.clamp_float(class_06722.IIIllIllIIlIlIlIlIllllIIl(), 0.0f, 1.0f);
                d2 *= d;
                d = 1.0 - d;
                d2 = 1.0 - d2;
                n2 = bufferedImage.getRGB((int)((double)(bufferedImage.getWidth() - 1) * d), (int)((double)(bufferedImage.getHeight() - 1) * d2)) & 0xFFFFFF;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        n = n2 != -1 && n2 != 0 ? this.lllIlIIlIIIlIlIIIllIlllIl(n, n2 | 0xFF000000) : this.lllIlIIlIIIlIlIIIllIlllIl(n, class_0672.lIIlIIIIIlIlllIlIIlIlIlll.lIlllIIllIIIIIIlIlIIlIllI | 0xFF000000);
        for (int i = 0; i < 16; ++i) {
            this.IllIIIllIIIIlIlIlIllIIlll[this.lIlllIlllIIIIlIIlllIllIII((int)class_1498.IlIllllllIIlIIllllIIlIIIl, (int)i)] = n;
            this.IllIIIllIIIIlIlIlIllIIlll[this.lIlllIlllIIIIlIIlllIllIII((int)class_1498.lllIlIIlIIIlIlIIIllIlllIl, (int)i)] = n;
        }
    }

    private final int lIlllIlllIIIIlIIlllIllIII(int n, int n2) {
        return n | n2 << 12;
    }

    @Override
    public final int lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        int n4 = this.IllIIIllIIIIlIlIlIllIIlll[this.lIlllIlllIIIIlIIlllIllIII(n, n2)];
        if (n4 != lIIIIlIlIIlllllIIllIIlIII) {
            return n4;
        }
        return this.IlIIIIIllllllIIlllIllllll(n, n2);
    }

    @Override
    public final int lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
        Integer n4;
        if ((this.llIIllIllIlIIlIIllIllllll || this.lllIIlIIIllllllIIIIlIlIlI) && this.IlIlIIlIlIllIIlIlIIllIIIl.contains(n) && (n4 = (Integer)this.lllllIlllIIllIlIIlIIIllII.get("" + this.lIlllIlllIIIIlIIlllIllIII(n, n2) + " " + n3)) != null) {
            return n4;
        }
        return this.IlIIIIIllllllIIlllIllllll(n, n2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final int IlIIIIIllllllIIlllIllllll(int n, int n2) {
        Object object = this.lIIlIIIIIlIlllIlIIlIlIlll;
        synchronized (object) {
            try {
                int n3;
                if (this.IIIllIllIIlIlIlIlIllllIIl[this.lIlllIlllIIIIlIIlllIllIII(n, n2)] == lIIIIlIlIIlllllIIllIIlIII) {
                    this.IIIllIllIIlIlIlIlIllllIIl[this.lIlllIlllIIIIlIIlllIllIII((int)n, (int)n2)] = this.lIllllIIlIIIlIllllllIIIll(n, n2);
                }
                if ((n3 = this.IIIllIllIIlIlIlIlIllllIIl[this.lIlllIlllIIIIlIIlllIllIII(n, n2)]) != -65025) {
                    return n3;
                }
                if (this.IIIllIllIIlIlIlIlIllllIIl[this.lIlllIlllIIIIlIIlllIllIII(n, 0)] == lIIIIlIlIIlllllIIllIIlIII) {
                    this.IIIllIllIIlIlIlIlIllllIIl[this.lIlllIlllIIIIlIIlllIllIII((int)n, (int)0)] = this.lIllllIIlIIIlIllllllIIIll(n, 0);
                }
                if ((n3 = this.IIIllIllIIlIlIlIlIllllIIl[this.lIlllIlllIIIIlIIlllIllIII(n, 0)]) != -65025) {
                    return n3;
                }
                return 0;
            }
            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                return -65025;
            }
        }
    }

    private int lllIIIllIIIIlllIlIIllIIll(int n, int n2, boolean bl) {
        int n3 = this.lIllllIIlIIIlIllllllIIIll(n, n2);
        if (!bl) {
            n3 |= 0xFF000000;
        }
        return n3;
    }

    private int lIllllIIlIIIlIllllllIIIll(int n, int n2) {
        try {
            int n3;
            class_2102 class_21022 = null;
            if (n == class_1498.IlIlIIlIlIllIIlIlIIllIIIl) {
                return 0x19000000 | (30 + n2 * 15 & 0xFF) << 16 | 0 | 0;
            }
            class_21022 = Block.lllIIIllIIIIlllIlIIllIIll(n).lllIIIllIIIIlllIlIIllIIll(1, n2);
            int n4 = this.lllIIIllIIIIlllIlIIllIIll(class_21022, this.lIllllIIlIIIlIllllllIIIll);
            if (Arrays.asList(class_1498.llIIlIlIlllIIllIlIlllIllI).contains(n)) {
                n4 = this.IlIllllllIIlIIllllIIlIIIl(n, n2, n4);
            }
            if ((n4 >> 24 & 0xFF) < 27) {
                n4 |= 0x1B000000;
            }
            if (n != class_1498.IIIllIIlIIIIIIlIlIIllIIlI && n != class_1498.IllIIlllllllIIlIIlIIIIlIl && n != class_1498.llIIllIllIlIIlIIllIllllll && n != class_1498.IIIllIllIIlIlIlIlIllllIIl && n != class_1498.IllIIIllIIIIlIlIlIllIIlll && n != class_1498.lIIIIlIlIIlllllIIllIIlIII && n != class_1498.lllIIlIIIllllllIIIIlIlIlI && n != class_1498.lllIlIIlIIIlIlIIIllIlllIl && n != class_1498.IlIllllllIIlIIllllIIlIIIl && (n3 = Block.lllIIIllIIIIlllIlIIllIIll(n).lIlllIlllIIIIlIIlllIllIII((class_1843)this.lllIIIllIIIIlllIlIIllIIll.theWorld, this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII.lIIlIIlIllIlIIlIlIIlIlIlI, 78, (int)this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII.IllIIIIllIIllIllIlllIlIIl) | 0xFF000000) != 0xFFFFFF && n3 != -1) {
                this.llIIlllIllIllllIIIlIIIIII.add(n);
                this.IllIIIllIIIIlIlIlIllIIlll[this.lIlllIlllIIIIlIIlllIllIII((int)n, (int)n2)] = this.lllIlIIlIIIlIlIIIllIlllIl(n4, n3);
            }
            return n4;
        }
        catch (Exception exception) {
            System.err.println("failed getting color: " + n + " " + n2);
            exception.printStackTrace();
            return -65025;
        }
    }

    private int lllIIIllIIIIlllIlIIllIIll(class_2102 class_21022, BufferedImage bufferedImage) {
        int n = 0;
        if (class_21022 != null) {
            int n2 = (int)(class_21022.IlIllllllIIlIIllllIIlIIIl() * (float)bufferedImage.getWidth());
            int n3 = (int)(class_21022.lIlllIlllIIIIlIIlllIllIII() * (float)bufferedImage.getWidth());
            int n4 = (int)(class_21022.IlIIIIIllllllIIlllIllllll() * (float)bufferedImage.getHeight());
            int n5 = (int)(class_21022.lIllllIIlIIIlIllllllIIIll() * (float)bufferedImage.getHeight());
            BufferedImage bufferedImage2 = bufferedImage.getSubimage(n2, n4, n3 - n2, n5 - n4);
            Image image = bufferedImage2.getScaledInstance(1, 1, 4);
            BufferedImage bufferedImage3 = new BufferedImage(1, 1, bufferedImage.getType());
            Graphics2D graphics2D = bufferedImage3.createGraphics();
            graphics2D.drawImage(image, 0, 0, null);
            graphics2D.dispose();
            n = bufferedImage3.getRGB(0, 0);
        }
        return n;
    }

    private int IlIllllllIIlIIllllIIlIIIl(int n, int n2, int n3) {
        int n4 = n3 >> 24 & 0xFF;
        int n5 = n3 >> 16 & 0xFF;
        int n6 = n3 >> 8 & 0xFF;
        int n7 = n3 >> 0 & 0xFF;
        if (n == class_1498.lllllIlllIIllIlIIlIIIllII || n == class_1498.lIlIlIIlIIIIlIIIIIlllIIII) {
            n4 = 31;
        } else if (n == class_1498.IlIlIIlllIIlIllIIIlllllIl || n == class_1498.IlIIIlIIIIllIIIllIIIIIIll) {
            n4 = 47;
        } else if (n == class_1498.lIIlIIIIIlIlllIlIIlIlIlll || n == class_1498.lIIIIlIlIIlllllIIllIIlIII) {
            n4 = 15;
        } else if (n == class_1498.IIlllIlIlllIllIIIlllIIlIl || n == class_1498.IlIIlllllIIlIlIlllllIllll) {
            n4 = 11;
        } else if (n == class_1498.lIlIllIIlIIlIIlIIlIIlIIll || n == class_1498.llIllllIlIllIIIlIllIIlIlI) {
            n4 = 95;
        } else if (n == class_1498.llIIlIllIllllIlIIIIlIIlll) {
            n4 = 92;
        } else if (n == class_1498.lIlllIlllIlIIIIlllIlIlIIl) {
            n4 = 153;
        }
        n3 = (n4 & 0xFF) << 24 | (n5 & 0xFF) << 16 | (n6 & 0xFF) << 8 | n7 & 0xFF;
        return n3;
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        int n3 = n >> 24 & 0xFF;
        int n4 = n >> 16 & 0xFF;
        int n5 = n >> 8 & 0xFF;
        int n6 = n >> 0 & 0xFF;
        int n7 = n2 >> 24 & 0xFF;
        int n8 = n2 >> 16 & 0xFF;
        int n9 = n2 >> 8 & 0xFF;
        int n10 = n2 >> 0 & 0xFF;
        int n11 = n3 * n7 / 255;
        int n12 = n4 * n8 / 255;
        int n13 = n5 * n9 / 255;
        int n14 = n6 * n10 / 255;
        return (n11 & 0xFF) << 24 | (n12 & 0xFF) << 16 | (n13 & 0xFF) << 8 | n14 & 0xFF;
    }

    @Override
    public int IlIllllllIIlIIllllIIlIIIl(int n, int n2) {
        float f = (float)(n >> 24 & 0xFF) / 255.0f;
        float f2 = (float)(n >> 16 & 0xFF) * f;
        float f3 = (float)(n >> 8 & 0xFF) * f;
        float f4 = (float)(n >> 0 & 0xFF) * f;
        float f5 = (float)(n2 >> 24 & 0xFF) / 255.0f;
        float f6 = (float)(n2 >> 16 & 0xFF) * f5 * (1.0f - f);
        float f7 = (float)(n2 >> 8 & 0xFF) * f5 * (1.0f - f);
        float f8 = (float)(n2 >> 0 & 0xFF) * f5 * (1.0f - f);
        float f9 = f + f5 * (1.0f - f);
        float f10 = (f2 + f6) / f9;
        float f11 = (f3 + f7) / f9;
        float f12 = (f4 + f8) / f9;
        return ((int)(f9 * 255.0f) & 0xFF) << 24 | ((int)f10 & 0xFF) << 16 | ((int)f11 & 0xFF) << 8 | (int)f12 & 0xFF;
    }

    private void lllIIlIIIllllllIIIIlIlIlI() {
        Object object;
        this.IlIlIIlllIIlIllIIIlllllIl = "alpha";
        Properties properties = new Properties();
        ResourceLocation class_17732 = new ResourceLocation("minecraft", "mcpatcher/renderpass.properties");
        try {
            object = this.lllIIIllIIIIlllIlIIllIIll.getResourceManager().getResource(class_17732).getInputStream();
            if (object != null) {
                properties.load((InputStream)object);
                ((InputStream)object).close();
                this.IlIlIIlllIIlIllIIIlllllIl = properties.getProperty("blend.3");
            }
        }
        catch (IOException iOException) {
            this.IlIlIIlllIIlIllIIIlllllIl = "alpha";
        }
        object = "minecraft";
        for (ResourceLocation class_17733 : this.lllIIIllIIIIlllIlIIllIIll((String)object, "/mcpatcher/ctm", ".properties", true, false, true)) {
            try {
                this.lllIIIllIIIIlllIlIIllIIll(class_17733);
            }
            catch (NumberFormatException numberFormatException) {
            }
            catch (IllegalArgumentException illegalArgumentException) {}
        }
        for (int i = 0; i < this.IIIllIllIIlIlIlIlIllllIIl.length; ++i) {
            if (this.IIIllIllIIlIlIlIlIllllIIl[i] == -65025 || this.IIIllIllIIlIlIlIlIllllIIl[i] == lIIIIlIlIIlllllIIllIIlIII || (this.IIIllIllIIlIlIlIlIllllIIl[i] >> 24 & 0xFF) >= 27) continue;
            int n = i;
            this.IIIllIllIIlIlIlIlIllllIIl[n] = this.IIIllIllIIlIlIlIlIllllIIl[n] | 0x1B000000;
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732) {
        int n;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        int n2;
        Object object5;
        if (class_17732 == null) {
            return;
        }
        Properties properties = new Properties();
        try {
            object5 = this.lllIIIllIIIIlllIlIIllIIll.getResourceManager().getResource(class_17732).getInputStream();
            if (object5 != null) {
                properties.load((InputStream)object5);
                ((InputStream)object5).close();
            }
        }
        catch (IOException iOException) {
            return;
        }
        object5 = new class_1333();
        String string = class_17732.lllIIIllIIIIlllIlIIllIIll();
        String string2 = properties.getProperty("method", "").trim().toLowerCase();
        String string3 = properties.getProperty("faces", "").trim().toLowerCase();
        String string4 = properties.getProperty("matchBlocks", "").trim().toLowerCase();
        String string5 = properties.getProperty("matchTiles", "").trim().toLowerCase();
        String string6 = properties.getProperty("metadata", "").trim().toLowerCase();
        String string7 = properties.getProperty("tiles", "").trim();
        String string8 = properties.getProperty("biomes", "").trim().toLowerCase();
        String string9 = properties.getProperty("renderPass", "").trim().toLowerCase();
        String[] arrstring = this.lllIIIllIIIIlllIlIIllIIll(string4);
        int[] arrn = new int[arrstring.length];
        for (int i = 0; i < arrstring.length; ++i) {
            arrn[i] = this.lIlllIlllIIIIlIIlllIllIII(arrstring[i]);
        }
        int[] arrn2 = this.lllIIIllIIIIlllIlIIllIIll(string6, 0, 255);
        String string10 = string.substring(0, string.lastIndexOf("/") + 1);
        String[] arrstring2 = this.lllIIIllIIIIlllIlIIllIIll(string7);
        String string11 = string10 + "0";
        if (arrstring2.length > 0) {
            string11 = arrstring2[0].trim();
        }
        if (!(string11 = string11.startsWith("~") ? string11.replace("~", "mcpatcher") : string10 + string11).toLowerCase().endsWith(".png")) {
            string11 = string11 + ".png";
        }
        String[] arrstring3 = string8.split(" ");
        if (arrn.length == 0) {
            n2 = -1;
            object4 = Pattern.compile(".*/block([\\d]+)[a-zA-Z]*.properties");
            object3 = ((Pattern)object4).matcher(string);
            if (((Matcher)object3).find()) {
                n2 = Integer.parseInt(((Matcher)object3).group(1));
            } else {
                object2 = string.substring(string.lastIndexOf("/") + 1, string.lastIndexOf(".properties"));
                for (int i = 0; i < 4096; ++i) {
                    int n3;
                    object = (Block) Block.blockRegistry.lllIIIllIIIIlllIlIIllIIll(i);
                    if (object == null) continue;
                    String string12 = "";
                    if (arrn2.length > 0) {
                        for (n = 0; n < arrn2.length; ++n) {
                            try {
                                string12 = ((class_1333)object5).lllIIIllIIIIlllIlIIllIIll((Block)object, 1, arrn2[n]).IIIllIIlIIIIIIlIlIIllIIlI();
                            }
                            catch (Exception exception) {
                                string12 = "";
                            }
                            if (!string12.equals(object2)) continue;
                            n2 = i;
                        }
                        continue;
                    }
                    ArrayList<Integer> arrayList = new ArrayList<Integer>();
                    for (n3 = 0; n3 < 16; ++n3) {
                        try {
                            string12 = ((class_1333)object5).lllIIIllIIIIlllIlIIllIIll((Block)object, 1, n3).IIIllIIlIIIIIIlIlIIllIIlI();
                        }
                        catch (Exception exception) {
                            string12 = "";
                        }
                        if (!string12.equals(object2)) continue;
                        n2 = i;
                        arrayList.add(n3);
                    }
                    arrn2 = new int[arrayList.size()];
                    for (n3 = 0; n3 < arrn2.length; ++n3) {
                        arrn2[n3] = (Integer)arrayList.get(n3);
                    }
                }
            }
            if (n2 != -1) {
                arrn = new int[]{n2};
            }
        }
        if (arrn2.length == 0) {
            arrn2 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        }
        if (arrn.length == 0) {
            return;
        }
        if (!string2.equals("horizontal") && (string2.equals("sandstone") || string2.equals("top") || string3.contains("top") || string3.contains("all") || string3.length() == 0)) {
            try {
                for (n2 = 0; n2 < arrn.length; ++n2) {
                    object4 = new ResourceLocation(class_17732.lllIlIIlIIIlIlIIIllIlllIl(), string11);
                    object3 = this.lllIIIllIIIIlllIlIIllIIll.getResourceManager().getResource((ResourceLocation)object4).getInputStream();
                    object2 = ImageIO.read((InputStream)object3);
                    ((InputStream)object3).close();
                    object2 = ((Image)object2).getScaledInstance(1, 1, 4);
                    BufferedImage bufferedImage = new BufferedImage(((Image)object2).getWidth(null), ((Image)object2).getHeight(null), 6);
                    object = bufferedImage.createGraphics();
                    ((Graphics)object).drawImage((Image)object2, 0, 0, null);
                    ((Graphics)object).dispose();
                    int n4 = bufferedImage.getRGB(0, 0);
                    if (arrn[n2] == class_1498.IlIlllIIIIIIlIIllIIllIlll) {
                        n4 |= 0xFF000000;
                    }
                    if (string9.equals("3")) {
                        n4 = this.lllIlIIlIIIlIlIIIllIlllIl(n4);
                        n = this.IIIllIllIIlIlIlIlIllllIIl[this.lIlllIlllIIIIlIIlllIllIII(arrn[n2], arrn2[0])];
                        if (n != -65025 && n != lIIIIlIlIIlllllIIllIIlIII) {
                            n4 = this.lllIlIIlIIIlIlIIIllIlllIl(n, n4);
                        }
                    }
                    if (Arrays.asList(class_1498.llIIlIlIlllIIllIlIlllIllI).contains(arrn[n2])) {
                        n4 = this.IlIllllllIIlIIllllIIlIIIl(arrn[n2], arrn2[0], n4);
                    }
                    for (n = 0; n < arrn2.length; ++n) {
                        try {
                            if (!string8.equals("")) {
                                this.IlIlIIlIlIllIIlIlIIllIIIl.add(arrn[n2]);
                                for (int i = 0; i < arrstring3.length; ++i) {
                                    int n5 = this.lllIlIIlIIIlIlIIIllIlllIl(arrstring3[i]);
                                    if (n5 == -1) continue;
                                    this.lllllIlllIIllIlIIlIIIllII.put("" + this.lIlllIlllIIIIlIIlllIllIII(arrn[n2], arrn2[n]) + " " + n5, n4);
                                }
                                continue;
                            }
                            this.IIIllIllIIlIlIlIlIllllIIl[this.lIlllIlllIIIIlIIlllIllIII((int)arrn[n2], (int)arrn2[n])] = n4;
                            continue;
                        }
                        catch (Exception exception) {
                            System.err.println("blockID + metadata (" + arrn[n2] + ", " + arrn2[n] + ") out of range");
                        }
                    }
                }
            }
            catch (IOException iOException) {
                System.err.println("error getting CTM block: " + string + " " + arrn[0] + " " + arrn2[0] + " " + string11);
            }
        }
    }

    private int lllIlIIlIIIlIlIIIllIlllIl(int n) {
        if (this.IlIlIIlllIIlIllIIIlllllIl.equals("color") || this.IlIlIIlllIIlIllIIIlllllIl.equals("overlay")) {
            int n2 = n >> 24 & 0xFF;
            int n3 = n >> 16 & 0xFF;
            int n4 = n >> 8 & 0xFF;
            int n5 = n >> 0 & 0xFF;
            float f = (float)(n3 + n5 + n4) / 3.0f;
            float f2 = (f - 127.5f) * 2.0f;
            n3 += (int)((float)n3 * (f2 / 255.0f));
            int n6 = (int)Math.abs(f2);
            n = n6 << 24 | (n3 & 0xFF) << 16 | ((n4 += (int)((float)n3 * (f2 / 255.0f))) & 0xFF) << 8 | (n5 += (int)((float)n3 * (f2 / 255.0f))) & 0xFF;
        }
        return n;
    }

    /*
     * WARNING - void declaration
     */
    private int[] lllIIIllIIIIlllIlIIllIIll(String string, int n, int n2) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        String[] arrobject = string.replace(',', ' ').split("\\s+");
        int n3 = arrobject.length;
        for (int i = 0; i < n3; ++i) {
            String string2 = arrobject[i];
            string2 = string2.trim();
            try {
                int n4;
                int n5;
                String[] arrstring;
                if (string2.matches("^\\d+$")) {
                    arrayList.add(Integer.parseInt(string2));
                    continue;
                }
                if (string2.matches("^\\d+-\\d+$")) {
                    arrstring = string2.split("-");
                    n5 = Integer.parseInt(arrstring[0]);
                    n4 = Integer.parseInt(arrstring[1]);
                    for (int j = n5; j <= n4; ++j) {
                        arrayList.add(j);
                    }
                    continue;
                }
                if (!string2.matches("^\\d+:\\d+$")) continue;
                arrstring = string2.split(":");
                n5 = Integer.parseInt(arrstring[0]);
                n4 = Integer.parseInt(arrstring[1]);
                arrayList.add(n5);
                continue;
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
        }
        if (n <= n2) {
            void var5_7;
            boolean n5 = false;
            while (++var5_7 < arrayList.size()) {
                if ((Integer)arrayList.get((int)var5_7) < n || (Integer)arrayList.get((int)var5_7) > n2) {
                    arrayList.remove((int)var5_7);
                }
            }
        }
        int[] arrn = new int[arrayList.size()];
        for (n3 = 0; n3 < arrn.length; ++n3) {
            arrn[n3] = (Integer)arrayList.get(n3);
        }
        return arrn;
    }

    private String[] lllIIIllIIIIlllIlIIllIIll(String string) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (String string2 : string.replace(',', ' ').split("\\s+")) {
            string2 = string2.trim();
            try {
                if (string2.matches("^\\d+$")) {
                    arrayList.add("" + Integer.parseInt(string2));
                    continue;
                }
                if (string2.matches("^\\d+-\\d+$")) {
                    String[] arrstring = string2.split("-");
                    int n = Integer.parseInt(arrstring[0]);
                    int n2 = Integer.parseInt(arrstring[1]);
                    for (int i = n; i <= n2; ++i) {
                        arrayList.add("" + i);
                    }
                    continue;
                }
                if (string2 == null || string2 == "") continue;
                arrayList.add(string2);
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
        }
        String[] arrstring = new String[arrayList.size()];
        for (int i = 0; i < arrstring.length; ++i) {
            arrstring[i] = (String)arrayList.get(i);
        }
        return arrstring;
    }

    private int lllIlIIlIIIlIlIIIllIlllIl(String string) {
        if (string.matches("^\\d+$")) {
            return Integer.parseInt(string);
        }
        for (int i = 0; i < class_0672.lllIIlIIIllllllIIIIlIlIlI().length; ++i) {
            if (class_0672.lllIIlIIIllllllIIIIlIlIlI()[i] == null || !class_0672.lllIIlIIIllllllIIIIlIlIlI()[i].IlIIIlIllIIIllIIIIlIIlIll.toLowerCase().replace(" ", "").equalsIgnoreCase(string)) continue;
            return i;
        }
        return -1;
    }

    private List IlIllllllIIlIIllllIIlIIIl(String string) {
        ArrayList arrayList = new ArrayList();
        class_0947 class_09472 = this.lllIIIllIIIIlllIlIIllIIll.getResourceManager();
        if (class_09472 instanceof class_0059) {
            Map map = null;
            Object object = class_1736.lllIIIllIIIIlllIlIIllIIll(class_09472, class_0059.class, Map.class);
            if (object == null) {
                return arrayList;
            }
            map = (Map)object;
            for (Map.Entry entry : map.entrySet()) {
                if (string != null && !string.equals(entry.getKey())) continue;
                class_1290 class_12902 = (class_1290)entry.getValue();
                List list = null;
                Object object2 = class_1736.lllIIIllIIIIlllIlIIllIIll(class_12902, class_1290.class, List.class);
                if (object2 == null) {
                    return arrayList;
                }
                list = (List)object2;
                arrayList.addAll(list);
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    private List lllIIIllIIIIlllIlIIllIIll(String string, String string2, String string3, boolean bl, boolean bl2, boolean bl3) {
        if (string2 == null) {
            string2 = "";
        }
        if (string2.startsWith("/")) {
            string2 = string2.substring(1);
        }
        if (string3 == null) {
            string3 = "";
        }
        ArrayList arrayList = new ArrayList();
        for (class_0449 class_04492 : this.IlIllllllIIlIIllllIIlIIIl(string)) {
            Object object;
            Object object2;
            if (class_04492 instanceof DefaultResourcePack) continue;
            if (class_04492 instanceof class_0513) {
                object2 = class_1736.lllIIIllIIIIlllIlIIllIIll(class_04492, class_0513.class, ZipFile.class);
                if (object2 == null) {
                    return arrayList;
                }
                object = (ZipFile)object2;
                if (object == null) continue;
                this.lllIIIllIIIIlllIlIIllIIll((ZipFile)object, string, "assets/" + string, string2, string3, bl, bl2, arrayList);
                continue;
            }
            if (!(class_04492 instanceof class_0821)) continue;
            object2 = class_1736.lllIIIllIIIIlllIlIIllIIll(class_04492, class_0821.class, File.class);
            if (object2 == null) {
                return arrayList;
            }
            object = (File)object2;
            if (object == null || !((File)object).isDirectory() || !((File)(object = new File((File)object, "assets/" + string))).isDirectory()) continue;
            class_0602.lllIIIllIIIIlllIlIIllIIll((File)object, string, string2, string3, bl, bl2, arrayList);
        }
        if (bl3) {
            Collections.sort(arrayList, new class_0939(this));
        } else {
            Collections.sort(arrayList, new class_1322(this));
        }
        return arrayList;
    }

    private void lllIIIllIIIIlllIlIIllIIll(ZipFile zipFile, String string, String string2, String string3, String string4, boolean bl, boolean bl2, Collection collection) {
        String string5 = string2 + "/" + string3;
        for (ZipEntry zipEntry : Collections.list(zipFile.entries())) {
            String string6;
            if (zipEntry.isDirectory() != bl2 || !(string6 = zipEntry.getName().replaceFirst("^/", "")).startsWith(string5) || !string6.endsWith(string4)) continue;
            if (string3.equals("")) {
                if (!bl && string6.contains("/")) continue;
                collection.add(new ResourceLocation(string, string6));
                continue;
            }
            String string7 = string6.substring(string5.length());
            if (!string7.equals("") && !string7.startsWith("/") || !bl && !string7.equals("") && string7.substring(1).contains("/")) continue;
            collection.add(new ResourceLocation(string, string6.substring(string2.length() + 1)));
        }
    }

    private static void lllIIIllIIIIlllIlIIllIIll(File file, String string, String string2, String string3, boolean bl, boolean bl2, Collection collection) {
        File file2 = new File(file, string2);
        String[] arrstring = file2.list();
        if (arrstring != null) {
            String string4 = string2 + "/";
            for (String string5 : arrstring) {
                File file3 = new File(file2, string5);
                String string6 = string4 + string5;
                if (file3.isDirectory()) {
                    if (bl2 && string5.endsWith(string3)) {
                        collection.add(new ResourceLocation(string, string6));
                    }
                    if (!bl) continue;
                    class_0602.lllIIIllIIIIlllIlIIllIIll(file, string, string4 + string5, string3, bl, bl2, collection);
                    continue;
                }
                if (!string5.endsWith(string3) || bl2) continue;
                collection.add(new ResourceLocation(string, string6));
            }
        }
    }

    private void IlIlllIIIIIIlIIllIIllIlll() {
        Object object;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.lllIIIllIIIIlllIlIIllIIll("minecraft", "/mcpatcher/colormap/blocks", ".png", true, false, true));
        Properties properties = new Properties();
        try {
            InputStream inputStream = this.lllIIIllIIIIlllIlIIllIIll.getResourceManager().getResource(new ResourceLocation("mcpatcher/color.properties")).getInputStream();
            if (inputStream != null) {
                properties.load(inputStream);
                inputStream.close();
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
        int n = 2129968;
        String string = properties.getProperty("lilypad");
        if (string != null) {
            n = Integer.parseInt(string, 16);
        }
        for (int i = 0; i < 16; ++i) {
            this.IIIllIllIIlIlIlIlIllllIIl[this.lIlllIlllIIIIlIIlllIllIII((int)class_1498.llIIlllIllIllllIIIlIIIIII, (int)i)] = this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll(class_1498.llIIlllIllIllllIIIlIIIIII, i), n | 0xFF000000);
        }
        Iterator iterator = properties.propertyNames();
        while (iterator.hasMoreElements()) {
            Object object2 = (String)iterator.nextElement();
            if (!((String)object2).startsWith("palette.block")) continue;
            object = ((String)object2).substring("palette.block.".length());
            object = ((String)object).replace("~", "mcpatcher");
            this.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation((String)object), properties.getProperty((String)object2));
        }
        for (Object object2 : this.lllIIIllIIIIlllIlIIllIIll("minecraft", "/mcpatcher/colormap/blocks", ".properties", true, false, true)) {
            Object object3;
            block10: {
                object = new Properties();
                try {
                    object3 = this.lllIIIllIIIIlllIlIIllIIll.getResourceManager().getResource((ResourceLocation)object2).getInputStream();
                    if (object3 == null) break block10;
                    properties.load((InputStream)object3);
                    ((InputStream)object3).close();
                }
                catch (IOException iOException) {
                    break;
                }
            }
            object3 = ((Properties)object).getProperty("blocks");
            ResourceLocation class_17732 = new ResourceLocation(((ResourceLocation)object2).lllIlIIlIIIlIlIIIllIlllIl(), ((ResourceLocation)object2).lllIIIllIIIIlllIlIIllIIll().replace(".properties", ".png"));
            arrayList.remove(class_17732);
            this.lllIIIllIIIIlllIlIIllIIll(class_17732, (String)object3);
        }
        for (Object object2 : arrayList) {
            object = ((ResourceLocation)object2).lllIIIllIIIIlllIlIIllIIll();
            System.out.println("processing name: " + (String)object);
            object = ((String)object).substring(((String)object).lastIndexOf("/") + 1, ((String)object).lastIndexOf(".png"));
            System.out.println("processed name: " + (String)object);
            this.lllIIIllIIIIlllIlIIllIIll((ResourceLocation)object2, "minecraft:" + (String)object);
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732, String string) {
        Integer[] arrinteger = new Integer[class_0672.lllIIlIIIllllllIIIIlIlIlI().length];
        boolean bl = class_17732.lllIIIllIIIIlllIlIIllIIll().contains("/swampgrass") || class_17732.lllIIIllIIIIlllIlIIllIIll().contains("/swampfoliage");
        BufferedImage bufferedImage = null;
        try {
            InputStream inputStream = this.lllIIIllIIIIlllIlIIllIIll.getResourceManager().getResource(class_17732).getInputStream();
            bufferedImage = ImageIO.read(inputStream);
            inputStream.close();
        }
        catch (IOException iOException) {
            return;
        }
        for (int i = 0; i < class_0672.lllIIlIIIllllllIIIIlIlIlI().length; ++i) {
            arrinteger[i] = -1;
        }
        BufferedImage bufferedImage2 = new BufferedImage(((Image)bufferedImage).getWidth(null), ((Image)bufferedImage).getHeight(null), 1);
        Graphics2D graphics2D = bufferedImage2.createGraphics();
        graphics2D.drawImage((Image)bufferedImage, 0, 0, null);
        graphics2D.dispose();
        for (int i = 0; i < class_0672.lllIIlIIIllllllIIIIlIlIlI().length; ++i) {
            if (class_0672.lllIIlIIIllllllIIIIlIlIlI()[i] == null) continue;
            class_0672 class_06722 = class_0672.lllIIlIIIllllllIIIIlIlIlI()[i];
            double d = MathHelper.clamp_float(class_06722.lllIIIllIIIIlllIlIIllIIll(0, 64, 0), 0.0f, 1.0f);
            double d2 = MathHelper.clamp_float(class_06722.IIIllIllIIlIlIlIlIllllIIl(), 0.0f, 1.0f);
            d2 *= d;
            d = 1.0 - d;
            d2 = 1.0 - d2;
            int n = bufferedImage2.getRGB((int)((double)(bufferedImage2.getWidth() - 1) * d), (int)((double)(bufferedImage2.getHeight() - 1) * d2)) & 0xFFFFFF;
            if (n == 0 || bl && i != class_0672.IlIIIlIIIIllIIIllIIIIIIll.lIlIllIIllIIIIlllIlIlllIl) continue;
            arrinteger[i] = n;
        }
        for (String string2 : string.split("\\s+")) {
            string2 = string2.trim();
            String string3 = "";
            int n = -1;
            int[] arrn = new int[]{};
            try {
                String string4;
                int n2;
                if (string2.matches(".*:[-0-9, ]+")) {
                    n2 = string2.lastIndexOf(58);
                    string3 = string2.substring(n2 + 1);
                    string4 = string2.substring(0, n2);
                } else {
                    string4 = string2;
                }
                n = this.lIlllIlllIIIIlIIlllIllIII(string4);
                if (n <= 0) continue;
                this.llIIlllIllIllllIIIlIIIIII.add(n);
                arrn = this.lllIIIllIIIIlllIlIIllIIll(string3, 0, 15);
                if (arrn.length == 0) {
                    arrn = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
                }
                for (n2 = 0; n2 < arrn.length; ++n2) {
                    Integer[] arrinteger2 = (Integer[])this.IlIlllIIIIIIlIIllIIllIlll.get(n + " " + arrn[n2]);
                    if (bl && arrinteger2 == null) {
                        ResourceLocation class_17733 = class_17732.lllIIIllIIIIlllIlIIllIIll().endsWith("/swampgrass.png") ? new ResourceLocation("textures/colormap/grass.png") : new ResourceLocation("textures/colormap/foliage.png");
                        this.lllIIIllIIIIlllIlIIllIIll(class_17733, "" + n + ":" + arrn[n2]);
                        arrinteger2 = (Integer[])this.IlIlllIIIIIIlIIllIIllIlll.get(n + " " + arrn[n2]);
                    }
                    if (arrinteger2 != null) {
                        for (int i = 0; i < class_0672.lllIIlIIIllllllIIIIlIlIlI().length; ++i) {
                            if (arrinteger[i] != -1) continue;
                            arrinteger[i] = arrinteger2[i];
                        }
                    }
                    this.IllIIIllIIIIlIlIlIllIIlll[this.lIlllIlllIIIIlIIlllIllIII((int)n, (int)arrn[n2])] = this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll(n, arrn[n2]), (int)(arrinteger[4] | 0xFF000000));
                    this.IlIlllIIIIIIlIIllIIllIlll.put(n + " " + arrn[n2], arrinteger);
                }
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
        }
    }

    private int lIlllIlllIIIIlIIlllIllIII(String string) {
        Block class_05492 = Block.lllIIIllIIIIlllIlIIllIIll(string);
        if (class_05492 != null) {
            return Block.lllIIIllIIIIlllIlIIllIIll(class_05492);
        }
        return -1;
    }

    static /* synthetic */ int[] lllIIIllIIIIlllIlIIllIIll(class_0602 class_06022) {
        return class_06022.IIIllIllIIlIlIlIlIllllIIl;
    }

    static /* synthetic */ int IIIllIllIIlIlIlIlIllllIIl() {
        return lIIIIlIlIIlllllIIllIIlIII;
    }

    static /* synthetic */ int[] lllIlIIlIIIlIlIIIllIlllIl(class_0602 class_06022) {
        return class_06022.IllIIIllIIIIlIlIlIllIIlll;
    }

    static /* synthetic */ void IlIllllllIIlIIllllIIlIIIl(class_0602 class_06022) {
        class_06022.llIIllIllIlIIlIIllIllllll();
    }

    static /* synthetic */ Set lIlllIlllIIIIlIIlllIllIII(class_0602 class_06022) {
        return class_06022.llIIlllIllIllllIIIlIIIIII;
    }

    static /* synthetic */ Set IlIIIIIllllllIIlllIllllll(class_0602 class_06022) {
        return class_06022.IlIlIIlIlIllIIlIlIIllIIIl;
    }

    static /* synthetic */ HashMap lIllllIIlIIIlIllllllIIIll(class_0602 class_06022) {
        return class_06022.lllllIlllIIllIlIIlIIIllII;
    }

    static /* synthetic */ boolean IIIllIIlIIIIIIlIlIIllIIlI(class_0602 class_06022) {
        return class_06022.llIIllIllIlIIlIIllIllllll;
    }

    static /* synthetic */ boolean IllIIlllllllIIlIIlIIIIlIl(class_0602 class_06022) {
        return class_06022.lllIIlIIIllllllIIIIlIlIlI;
    }

    static /* synthetic */ void IIIllIllIIlIlIlIlIllllIIl(class_0602 class_06022) {
        class_06022.lllIIlIIIllllllIIIIlIlIlI();
    }

    static /* synthetic */ class_1835 IllIIIllIIIIlIlIlIllIIlll(class_0602 class_06022) {
        return class_06022.lIlllIlllIIIIlIIlllIllIII;
    }

    static /* synthetic */ void lllIIIllIIIIlllIlIIllIIll(class_0602 class_06022, boolean bl) {
        class_06022.lllIIIllIIIIlllIlIIllIIll(bl);
    }

    static /* synthetic */ HashMap lIIIIlIlIIlllllIIllIIlIII(class_0602 class_06022) {
        return class_06022.IlIlllIIIIIIlIIllIIllIlll;
    }

    static /* synthetic */ void llIIlllIllIllllIIIlIIIIII(class_0602 class_06022) {
        class_06022.IlIlllIIIIIIlIIllIIllIlll();
    }

    static /* synthetic */ void lllIIIllIIIIlllIlIIllIIll(class_0602 class_06022, ResourceLocation class_17732, String string) {
        class_06022.lllIIIllIIIIlllIlIIllIIll(class_17732, string);
    }

    static /* synthetic */ class_2013 llIIllIllIlIIlIIllIllllll(class_0602 class_06022) {
        return class_06022.IlIllllllIIlIIllllIIlIIIl;
    }
}

