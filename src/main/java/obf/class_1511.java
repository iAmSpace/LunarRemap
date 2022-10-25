package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.imageio.ImageIO;

import net.minecraft.util.ResourceLocation;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import optifine.Config;
import net.minecraft.crash.CrashReport;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_1511
extends class_1380
implements class_1420,
class_0887 {
    private static final Logger IllIIlllllllIIlIIlIIIIlIl = LogManager.getLogger();
    public static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/atlas/blocks.png");
    public static final ResourceLocation lllIlIIlIIIlIlIIIllIlllIl = new ResourceLocation("textures/atlas/items.png");
    private final List IIIllIllIIlIlIlIlIllllIIl = Lists.newArrayList();
    private final Map IllIIIllIIIIlIlIlIllIIlll = Maps.newHashMap();
    private final Map lIIIIlIlIIlllllIIllIIlIII = Maps.newHashMap();
    public final int IlIllllllIIlIIllllIIlIIIl;
    public final String IlIIIIIllllllIIlllIllllll;
    private int llIIlllIllIllllIIIlIIIIII;
    private int llIIllIllIlIIlIIllIllllll = 1;
    private final class_1585 lllIIlIIIllllllIIIIlIlIlI = new class_1585("missingno");
    public static class_1511 lIllllIIlIIIlIllllllIIIll = null;
    public static class_1511 IIIllIIlIIIIIIlIlIIllIIlI = null;
    private class_1585[] IlIlllIIIIIIlIIllIIllIlll = null;
    private int IlIlIIlIlIllIIlIlIIllIIIl = -1;
    private int lllllIlllIIllIlIIlIIIllII = -1;
    private int IlIlIIlllIIlIllIIIlllllIl = -1;
    private double lIIlIIIIIlIlllIlIIlIlIlll = -1.0;
    private double lIlIlIIlIIIIlIIIIIlllIIII = -1.0;
    private static final boolean IlIIIlIIIIllIIIllIIIIIIll = Boolean.parseBoolean(System.getProperty("fml.skipFirstTextureLoad", "true"));
    private boolean IIlllIlIlllIllIIIlllIIlIl = false;

    public class_1511(int n, String string) {
        this(n, string, false);
    }

    public class_1511(int n, String string, boolean bl) {
        this.IlIllllllIIlIIllllIIlIIIl = n;
        this.IlIIIIIllllllIIlllIllllll = string;
        if (this.IlIllllllIIlIIllllIIlIIIl == 0) {
            lIllllIIlIIIlIllllllIIIll = this;
        }
        if (this.IlIllllllIIlIIllllIIlIIIl == 1) {
            IIIllIIlIIIIIIlIlIIllIIlI = this;
        }
        this.IIIllIllIIlIlIlIlIllllIIl();
        this.IIlllIlIlllIllIIIlllIIlIl = bl && IlIIIlIIIIllIIIllIIIIIIll;
    }

    private void IllIIlllllllIIlIIlIIIIlIl() {
        int[] arrn;
        if ((float)this.llIIllIllIlIIlIIllIllllll > 1.0f) {
            boolean bl = true;
            boolean bl2 = true;
            boolean bl3 = true;
            this.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl(32);
            this.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl(32);
            arrn = new int[1024];
            System.arraycopy(class_0231.lllIlIIlIIIlIlIIIllIlllIl, 0, arrn, 0, class_0231.lllIlIIlIIIlIlIIIllIlllIl.length);
            class_0231.lllIIIllIIIIlllIlIIllIIll(arrn, 16, 16, 8);
        } else {
            arrn = class_0231.lllIlIIlIIIlIlIIIllIlllIl;
            this.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl(16);
            this.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl(16);
        }
        int[][] arrarrn = new int[this.llIIlllIllIllllIIIlIIIIII + 1][];
        arrarrn[0] = arrn;
        this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(Lists.newArrayList((Object[])new int[][][]{arrarrn}));
        this.lllIIlIIIllllllIIIIlIlIlI.IlIIIIIllllllIIlllIllllll(0);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0947 class_09472) {
        this.IllIIlllllllIIlIIlIIIIlIl();
        this.IlIllllllIIlIIllllIIlIIIl();
        this.lllIlIIlIIIlIlIIIllIlllIl(class_09472);
    }

    private boolean IlIIIIIllllllIIlllIllllll(String string) {
        if (string.equalsIgnoreCase("grass_side_overlay")) {
            return false;
        }
        if (string.startsWith("leaves_") && !string.endsWith("_opaque")) {
            return false;
        }
        for (Block class_05492 : Block.blockRegistry) {
            if (!string.equals(class_05492.llllllIlIllllIlIlIlIIIIlI())) continue;
            return class_05492.IlIlllIIIIIIlIIllIIllIlll();
        }
        for (Block class_05492 : Block.blockRegistry) {
            if (class_05492.IlIlllIIIIIIlIIllIIllIlll() || !string.startsWith(class_05492.llllllIlIllllIlIlIlIIIIlI() + "_")) continue;
            return false;
        }
        for (Block class_05492 : Block.blockRegistry) {
            if (!class_05492.IlIlllIIIIIIlIIllIIllIlll() || !string.startsWith(class_05492.llllllIlIllllIlIlIlIIIIlI() + "_")) continue;
            return true;
        }
        return false;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_0947 class_09472) {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Config.lllIIIllIIIIlllIlIIllIIll("Loading texture map: " + this.IlIIIIIllllllIIlllIllllll);
        class_1379.IlIIIIIllllllIIlllIllllll();
        this.IIIllIllIIlIlIlIlIllllIIl();
        int n = Minecraft.IIIIIIIIlIllIIllIIlllIllI();
        class_1654 class_16542 = new class_1654(n, n, true, 0, this.llIIlllIllIllllIIIlIIIIII);
        this.lIIIIlIlIIlllllIIllIIlIII.clear();
        this.IIIllIllIIlIlIlIlIllllIIl.clear();
        int n2 = Integer.MAX_VALUE;
        Iterator iterator = this.IllIIIllIIIIlIlIlIllIIlll.entrySet().iterator();
        while (iterator.hasNext() && !this.IIlllIlIlllIllIIIlllIIlIl) {
            Map.Entry entry = iterator.next();
            object5 = new ResourceLocation((String)entry.getKey());
            class_1585 class_15852 = (class_1585)entry.getValue();
            object4 = this.lllIIIllIIIIlllIlIIllIIll((ResourceLocation)object5, 0);
            if (class_15852.lllIIIllIIIIlllIlIIllIIll(class_09472, (ResourceLocation)object5)) {
                if (!class_15852.lllIlIIlIIIlIlIIIllIlllIl(class_09472, (ResourceLocation)object5)) {
                    n2 = Math.min(n2, Math.min(class_15852.lllIIIllIIIIlllIlIIllIIll(), class_15852.lllIlIIlIIIlIlIIIllIlllIl()));
                    class_16542.lllIIIllIIIIlllIlIIllIIll(class_15852);
                }
                Config.lllIIIllIIIIlllIlIIllIIll("Custom loader: " + class_15852);
                continue;
            }
            try {
                Object object6;
                class_2234 class_22342 = class_09472.getResource((ResourceLocation)object4);
                object3 = new BufferedImage[1 + this.llIIlllIllIllllIIIlIIIIII];
                object3[0] = ImageIO.read(class_22342.getInputStream());
                if (this.IlIllllllIIlIIllllIIlIIIl == 0) {
                    boolean bl = class_2134.lllIIIllIIIIlllIlIIllIIll(object3[0]);
                    class_15852.lllIlIIlIIIlIlIIIllIlllIl(bl);
                    object6 = (String)entry.getKey();
                    if (bl && this.IlIIIIIllllllIIlllIllllll((String)object6)) {
                        if ((((String)object6).equals("stone") || ((String)object6).equals("cobblestone") || ((String)object6).equals("dirt") || ((String)object6).equals("grass_side") || ((String)object6).equals("grass_top")) && class_2134.lllIIIllIIIIlllIlIIllIIll(object3[0], 200)) {
                            Minecraft class_06672 = Minecraft.getMinecraft();
                            class_06672.IllllIIIIlIIlIIIIlllIIIIl().lllIIIllIIIIlllIlIIllIIll(Lists.newArrayList());
                            class_06672.gameSettings.resourcePacks.clear();
                            class_06672.gameSettings.IlIllllllIIlIIllllIIlIIIl();
                            class_06672.IlIIIIIllllllIIlllIllllll();
                            return;
                        }
                        class_2134.lllIlIIlIIIlIlIIIllIlllIl(object3[0]);
                    }
                }
                if ((object2 = (class_1561)class_22342.lllIIIllIIIIlllIlIIllIIll("texture")) != null) {
                    int n3;
                    object6 = ((class_1561)object2).IlIllllllIIlIIllllIIlIIIl();
                    if (!object6.isEmpty()) {
                        int n4 = object3[0].getWidth();
                        n3 = object3[0].getHeight();
                        if (MathHelper.roundUpToPowerOfTwo(n4) != n4 || MathHelper.roundUpToPowerOfTwo(n3) != n3) {
                            throw new RuntimeException("Unable to load extra miplevels, source-texture is not power of two");
                        }
                    }
                    Iterator iterator2 = object6.iterator();
                    while (iterator2.hasNext()) {
                        n3 = (Integer)iterator2.next();
                        if (n3 <= 0 || n3 >= ((BufferedImage[])object3).length - 1 || object3[n3] != null) continue;
                        object = this.lllIIIllIIIIlllIlIIllIIll((ResourceLocation)object5, n3);
                        try {
                            object3[n3] = ImageIO.read(class_09472.getResource((ResourceLocation)object).getInputStream());
                        }
                        catch (IOException iOException) {
                            IllIIlllllllIIlIIlIIIIlIl.error("Unable to load miplevel {} from: {}", new Object[]{n3, object, iOException});
                        }
                    }
                }
                object6 = (class_0762)class_22342.lllIIIllIIIIlllIlIIllIIll("animation");
                class_15852.lllIIIllIIIIlllIlIIllIIll((BufferedImage[])object3, (class_0762)object6, (float)this.llIIllIllIlIIlIIllIllllll > 1.0f);
            }
            catch (RuntimeException runtimeException) {
                IllIIlllllllIIlIIlIIIIlIl.error("Unable to parse metadata from " + object4, (Throwable)runtimeException);
                continue;
            }
            catch (IOException iOException) {
                IllIIlllllllIIlIIlIIIIlIl.error("Using missing texture, unable to load " + object4 + ", " + iOException.getClass().getName());
                continue;
            }
            n2 = Math.min(n2, Math.min(class_15852.lllIIIllIIIIlllIlIIllIIll(), class_15852.lllIlIIlIIIlIlIIIllIlllIl()));
            class_16542.lllIIIllIIIIlllIlIIllIIll(class_15852);
        }
        int n5 = MathHelper.IlIllllllIIlIIllllIIlIIIl(n2);
        if (n5 < 0) {
            n5 = 0;
        }
        if (n5 < this.llIIlllIllIllllIIIlIIIIII) {
            IllIIlllllllIIlIIlIIIIlIl.info("{}: dropping miplevel from {} to {}, because of minTexel: {}", new Object[]{this.IlIIIIIllllllIIlllIllllll, this.llIIlllIllIllllIIIlIIIIII, n5, n2});
            this.llIIlllIllIllllIIIlIIIIII = n5;
        }
        object5 = this.IllIIIllIIIIlIlIlIllIIlll.values().iterator();
        while (object5.hasNext() && !this.IIlllIlIlllIllIIIlllIIlIl) {
            object4 = (class_1585)object5.next();
            try {
                ((class_1585)object4).lIlllIlllIIIIlIIlllIllIII(this.llIIlllIllIllllIIIlIIIIII);
            }
            catch (Throwable throwable) {
                object3 = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Applying mipmap");
                object2 = object3.lllIIIllIIIIlllIlIIllIIll("Sprite being mipmapped");
                ((class_0799)object2).addCrashSectionCallable("Sprite name", new class_2223(this, (class_1585)object4));
                ((class_0799)object2).addCrashSectionCallable("Sprite size", new class_1941(this, (class_1585)object4));
                ((class_0799)object2).addCrashSectionCallable("Sprite frames", new class_0072(this, (class_1585)object4));
                ((class_0799)object2).lllIIIllIIIIlllIlIIllIIll("Mipmap levels", this.llIIlllIllIllllIIIlIIIIII);
                throw new class_0892((CrashReport)object3);
            }
        }
        this.lllIIlIIIllllllIIIIlIlIlI.lIlllIlllIIIIlIIlllIllIII(this.llIIlllIllIllllIIIlIIIIII);
        class_16542.lllIIIllIIIIlllIlIIllIIll(this.lllIIlIIIllllllIIIIlIlIlI);
        this.IIlllIlIlllIllIIIlllIIlIl = false;
        class_16542.IlIllllllIIlIIllllIIlIIIl();
        Config.lllIIIllIIIIlllIlIIllIIll("Texture size: " + this.IlIIIIIllllllIIlllIllllll + ", " + class_16542.lllIIIllIIIIlllIlIIllIIll() + "x" + class_16542.lllIlIIlIIIlIlIIIllIlllIl());
        int n6 = class_16542.lllIIIllIIIIlllIlIIllIIll();
        int n7 = class_16542.lllIlIIlIIIlIlIIIllIlllIl();
        object3 = null;
        if (System.getProperty("saveTextureMap", "false").equalsIgnoreCase("true")) {
            object3 = this.lllIlIIlIIIlIlIIIllIlllIl(n6, n7);
        }
        IllIIlllllllIIlIIlIIIIlIl.info("Created: {}x{} {}-atlas", new Object[]{class_16542.lllIIIllIIIIlllIlIIllIIll(), class_16542.lllIlIIlIIIlIlIIIllIlllIl(), this.IlIIIIIllllllIIlllIllllll});
        class_0231.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll(), this.llIIlllIllIllllIIIlIIIIII, class_16542.lllIIIllIIIIlllIlIIllIIll(), class_16542.lllIlIIlIIIlIlIIIllIlllIl(), (float)this.llIIllIllIlIIlIIllIllllll);
        object2 = Maps.newHashMap((Map)this.IllIIIllIIIIlIlIlIllIIlll);
        for (class_1585 class_15852 : class_16542.lIlllIlllIIIIlIIlllIllIII()) {
            String string = class_15852.IIIllIIlIIIIIIlIlIIllIIlI();
            ((HashMap)object2).remove(string);
            this.lIIIIlIlIIlllllIIllIIlIII.put(string, class_15852);
            try {
                class_0231.lllIIIllIIIIlllIlIIllIIll(class_15852.lllIIIllIIIIlllIlIIllIIll(0), class_15852.lllIIIllIIIIlllIlIIllIIll(), class_15852.lllIlIIlIIIlIlIIIllIlllIl(), class_15852.IllIIlllllllIIlIIlIIIIlIl(), class_15852.IIIllIllIIlIlIlIlIllllIIl(), false, false);
                if (object3 != null) {
                    this.lllIIIllIIIIlllIlIIllIIll(class_15852, (BufferedImage)object3);
                }
            }
            catch (Throwable throwable) {
                object = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Stitching texture atlas");
                class_0799 class_07992 = ((CrashReport)object).lllIIIllIIIIlllIlIIllIIll("Texture being stitched together");
                class_07992.lllIIIllIIIIlllIlIIllIIll("Atlas path", this.IlIIIIIllllllIIlllIllllll);
                class_07992.lllIIIllIIIIlllIlIIllIIll("Sprite", class_15852);
                throw new class_0892((CrashReport)object);
            }
            if (class_15852.llIIllIllIlIIlIIllIllllll()) {
                this.IIIllIllIIlIlIlIlIllllIIl.add(class_15852);
                continue;
            }
            class_15852.llIIlllIllIllllIIIlIIIIII();
        }
        for (class_1585 class_15852 : ((HashMap)object2).values()) {
            class_15852.lllIIIllIIIIlllIlIIllIIll(this.lllIIlIIIllllllIIIIlIlIlI);
        }
        if (object3 != null) {
            this.lllIIIllIIIIlllIlIIllIIll((BufferedImage)object3, "debug_" + this.IlIIIIIllllllIIlllIllllll.replace('/', '_') + ".png");
        }
    }

    private ResourceLocation lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732, int n) {
        return this.lllIIIllIIIIlllIlIIllIIll(class_17732) ? (n == 0 ? new ResourceLocation(class_17732.lllIlIIlIIIlIlIIIllIlllIl(), class_17732.lllIIIllIIIIlllIlIIllIIll() + ".png") : new ResourceLocation(class_17732.lllIlIIlIIIlIlIIIllIlllIl(), class_17732.lllIIIllIIIIlllIlIIllIIll() + "mipmap" + n + ".png")) : (n == 0 ? new ResourceLocation(class_17732.lllIlIIlIIIlIlIIIllIlllIl(), String.format("%s/%s%s", this.IlIIIIIllllllIIlllIllllll, class_17732.lllIIIllIIIIlllIlIIllIIll(), ".png")) : new ResourceLocation(class_17732.lllIlIIlIIIlIlIIIllIlllIl(), String.format("%s/mipmaps/%s.%d%s", this.IlIIIIIllllllIIlllIllllll, class_17732.lllIIIllIIIIlllIlIIllIIll(), n, ".png")));
    }

    private void IIIllIllIIlIlIlIlIllllIIl() {
        this.IllIIIllIIIIlIlIlIllIIlll.clear();
        if (this.IlIllllllIIlIIllllIIlIIIl == 0) {
            for (Object object : Block.blockRegistry) {
                if (((Block)object).lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) continue;
                ((Block)object).lllIIIllIIIIlllIlIIllIIll(this);
            }
            Minecraft.getMinecraft().IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(this);
            class_2114.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this);
            class_1245.lllIIIllIIIIlllIlIIllIIll(this);
        }
        if (this.IlIllllllIIlIIllllIIlIIIl == 1) {
            class_1891.lllIIIllIIIIlllIlIIllIIll(this);
        }
        for (Object object : Item.lllIIIllIIIIlllIlIIllIIll) {
            if (object == null || ((Item)object).lllIlIIlIIIlIlIIIllIlllIl() != this.IlIllllllIIlIIllllIIlIIIl) continue;
            ((Item)object).lllIIIllIIIIlllIlIIllIIll(this);
        }
    }

    public class_1585 lllIlIIlIIIlIlIIIllIlllIl(String string) {
        class_1585 class_15852 = (class_1585)this.lIIIIlIlIIlllllIIllIIlIII.get(string);
        if (class_15852 == null) {
            class_15852 = this.lllIIlIIIllllllIIIIlIlIlI;
        }
        return class_15852;
    }

    public void lIlllIlllIIIIlIIlllIllIII() {
        class_0231.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll());
        for (class_1585 class_15852 : this.IIIllIllIIlIlIlIlIllllIIl) {
            if (this.IlIllllllIIlIIllllIIlIIIl == 0 ? !this.lllIlIIlIIIlIlIIIllIlllIl(class_15852) : this.IlIllllllIIlIIllllIIlIIIl == 1 && !this.lllIIIllIIIIlllIlIIllIIll(class_15852)) continue;
            class_15852.IllIIIllIIIIlIlIlIllIIlll();
        }
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(class_1585 class_15852) {
        return class_15852 != class_1384.lIlIlIIllIIIlllIllIIlIllI && class_15852 != class_1384.llIIIIIlIIlIIIIllIIIlIIII ? Config.IllIIllIlIlllIllIllIlIIIl() : true;
    }

    @Override
    public IIcon lllIIIllIIIIlllIlIIllIIll(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Name cannot be null!");
        }
        if (string.indexOf(92) != -1 && !this.lIllllIIlIIIlIllllllIIIll(string)) {
            throw new IllegalArgumentException("Name cannot contain slashes!");
        }
        class_1585 class_15852 = (class_1585)this.IllIIIllIIIIlIlIlIllIIlll.get(string);
        if (class_15852 == null) {
            class_15852 = this.IlIllllllIIlIIllllIIlIIIl == 1 ? ("clock".equals(string) ? new class_2017(string) : ("compass".equals(string) ? new class_1328(string) : new class_1585(string))) : new class_1585(string);
            this.IllIIIllIIIIlIlIlIllIIlll.put(string, class_15852);
            if (class_15852 instanceof class_1585) {
                class_1585 class_15853 = class_15852;
                class_15853.IlIIIIIllllllIIlllIllllll(this.IllIIIllIIIIlIlIlIllIIlll.size());
            }
        }
        return class_15852;
    }

    public int IlIIIIIllllllIIlllIllllll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl() {
        this.lIlllIlllIIIIlIIlllIllIII();
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        this.llIIlllIllIllllIIIlIIIIII = n;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        this.llIIllIllIlIIlIIllIllllll = n;
    }

    public class_1585 IlIllllllIIlIIllllIIlIIIl(String string) {
        return (class_1585)this.IllIIIllIIIIlIlIlIllIIlll.get(string);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(String string, class_1585 class_15852) {
        if (!this.IllIIIllIIIIlIlIlIllIIlll.containsKey(string)) {
            this.IllIIIllIIIIlIlIlIllIIlll.put(string, class_15852);
            class_15852.IlIIIIIllllllIIlllIllllll(this.IllIIIllIIIIlIlIlIllIIlll.size());
            return true;
        }
        return false;
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732) {
        String string = class_17732.lllIIIllIIIIlllIlIIllIIll();
        return this.lIllllIIlIIIlIllllllIIIll(string);
    }

    private boolean lIllllIIlIIIlIllllllIIIll(String string) {
        String string2 = string.toLowerCase();
        return string2.startsWith("mcpatcher/") || string2.startsWith("optifine/");
    }

    public class_1585 lIlllIlllIIIIlIIlllIllIII(String string) {
        return (class_1585)this.IllIIIllIIIIlIlIlIllIIlll.get(string);
    }

    private int lllIIIllIIIIlllIlIIllIIll(Collection collection) {
        int n;
        int n2;
        int n3;
        int[] arrn = new int[16];
        for (class_1585 class_15852 : collection) {
            if (class_15852 == null || (n3 = Math.max(n2 = class_1384.lllIlIIlIIIlIlIIIllIlllIl(class_15852.lllIIlIIIllllllIIIIlIlIlI()), n = class_1384.lllIlIIlIIIlIlIIIllIlllIl(class_15852.IlIlllIIIIIIlIIllIIllIlll()))) >= arrn.length) continue;
            int n4 = n3;
            arrn[n4] = arrn[n4] + 1;
        }
        int n5 = 4;
        n3 = 0;
        for (n2 = 0; n2 < arrn.length; ++n2) {
            n = arrn[n2];
            if (n <= n3) continue;
            n5 = n2;
            n3 = n;
        }
        if (n5 < 4) {
            n5 = 4;
        }
        n2 = class_1384.IlIllllllIIlIIllllIIlIIIl(n5);
        return n2;
    }

    private void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        this.lllllIlllIIllIlIIlIIIllII = -1;
        this.IlIlIIlllIIlIllIIIlllllIl = -1;
        this.IlIlllIIIIIIlIIllIIllIlll = null;
        if (this.IlIlIIlIlIllIIlIlIIllIIIl > 0) {
            this.lllllIlllIIllIlIIlIIIllII = n / this.IlIlIIlIlIllIIlIlIIllIIIl;
            this.IlIlIIlllIIlIllIIIlllllIl = n2 / this.IlIlIIlIlIllIIlIlIIllIIIl;
            this.IlIlllIIIIIIlIIllIIllIlll = new class_1585[this.lllllIlllIIllIlIIlIIIllII * this.IlIlIIlllIIlIllIIIlllllIl];
            this.lIIlIIIIIlIlllIlIIlIlIlll = 1.0 / (double)this.lllllIlllIIllIlIIlIIIllII;
            this.lIlIlIIlIIIIlIIIIIlllIIII = 1.0 / (double)this.IlIlIIlllIIlIllIIIlllllIl;
            for (class_1585 class_15852 : this.lIIIIlIlIIlllllIIllIIlIII.values()) {
                double d = 0.5 / (double)n;
                double d2 = 0.5 / (double)n2;
                double d3 = (double)Math.min(class_15852.IlIllllllIIlIIllllIIlIIIl(), class_15852.lIlllIlllIIIIlIIlllIllIII()) + d;
                double d4 = (double)Math.min(class_15852.IlIIIIIllllllIIlllIllllll(), class_15852.lIllllIIlIIIlIllllllIIIll()) + d2;
                double d5 = (double)Math.max(class_15852.IlIllllllIIlIIllllIIlIIIl(), class_15852.lIlllIlllIIIIlIIlllIllIII()) - d;
                double d6 = (double)Math.max(class_15852.IlIIIIIllllllIIlllIllllll(), class_15852.lIllllIIlIIIlIllllllIIIll()) - d2;
                int n3 = (int)(d3 / this.lIIlIIIIIlIlllIlIIlIlIlll);
                int n4 = (int)(d4 / this.lIlIlIIlIIIIlIIIIIlllIIII);
                int n5 = (int)(d5 / this.lIIlIIIIIlIlllIlIIlIlIlll);
                int n6 = (int)(d6 / this.lIlIlIIlIIIIlIIIIIlllIIII);
                for (int i = n3; i <= n5; ++i) {
                    if (i >= 0 && i < this.lllllIlllIIllIlIIlIIIllII) {
                        for (int j = n4; j <= n6; ++j) {
                            if (j >= 0 && j < this.lllllIlllIIllIlIIlIIIllII) {
                                int n7 = j * this.lllllIlllIIllIlIIlIIIllII + i;
                                this.IlIlllIIIIIIlIIllIIllIlll[n7] = class_15852;
                                continue;
                            }
                            Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid grid V: " + j + ", icon: " + class_15852.IIIllIIlIIIIIIlIlIIllIIlI());
                        }
                        continue;
                    }
                    Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid grid U: " + i + ", icon: " + class_15852.IIIllIIlIIIIIIlIlIIllIIlI());
                }
            }
        }
    }

    public class_1585 lllIIIllIIIIlllIlIIllIIll(double d, double d2) {
        if (this.IlIlllIIIIIIlIIllIIllIlll == null) {
            return null;
        }
        int n = (int)(d2 / this.lIlIlIIlIIIIlIIIIIlllIIII);
        int n2 = (int)(d / this.lIIlIIIIIlIlllIlIIlIlIlll);
        int n3 = n * this.lllllIlllIIllIlIIlIIIllII + n2;
        return n3 >= 0 && n3 <= this.IlIlllIIIIIIlIIllIIllIlll.length ? this.IlIlllIIIIIIlIIllIIllIlll[n3] : null;
    }

    public class_1585 lIllllIIlIIIlIllllllIIIll() {
        return this.lllIIlIIIllllllIIIIlIlIlI;
    }

    public int IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IllIIIllIIIIlIlIlIllIIlll.size();
    }

    private boolean lllIlIIlIIIlIlIIIllIlllIl(class_1585 class_15852) {
        return class_15852 != class_1384.IIIlIlIllIlllllIlIllllllI && class_15852 != class_1384.IIIIlIllIlIIIIIllllIIlllI ? (class_15852 != class_1384.llllIlIIllIIlllllIIllIIll && class_15852 != class_1384.IlIlIllIIlIIIIlllIlIllIlI ? (class_15852 != class_1384.lIlIIllIllIIIIIlIllllIIIl && class_15852 != class_1384.lIlllIIllIIIIIIlIlIIlIllI ? (class_15852 == class_1384.IlIIllIlIlIllIIIlIIlIlIIl ? Config.llIIIIllIIIIIIIlIIIlIIIIl() : Config.lIIllIIlIIIlllIlllIIlIIlI()) : Config.lIlIIllllIlIIIIllIIIIlIIl()) : Config.IIllIllIIllIIlllIIIlIlllI()) : Config.IlIlIIlllIllllllllIIIlIlI();
    }

    public void IlIllllllIIlIIllllIIlIIIl(class_0947 class_09472) {
        try {
            this.lllIIIllIIIIlllIlIIllIIll(class_09472);
        }
        catch (IOException iOException) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("Error loading texture map: " + this.IlIIIIIllllllIIlllIllllll);
            iOException.printStackTrace();
        }
    }

    private BufferedImage lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        BufferedImage bufferedImage = new BufferedImage(n, n2, 2);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.setPaint(new Color(255, 255, 0));
        graphics2D.fillRect(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight());
        return bufferedImage;
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_1585 class_15852, BufferedImage bufferedImage) {
        if (class_15852.lIIIIlIlIIlllllIIllIIlIII() < 1) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("Debug sprite has no data: " + class_15852.IIIllIIlIIIIIIlIlIIllIIlI());
        } else {
            int[] arrn = class_15852.lllIIIllIIIIlllIlIIllIIll(0)[0];
            bufferedImage.setRGB(class_15852.IllIIlllllllIIlIIlIIIIlIl(), class_15852.IIIllIllIIlIlIlIlIllllIIl(), class_15852.lllIIIllIIIIlllIlIIllIIll(), class_15852.lllIlIIlIIIlIlIIIllIlllIl(), arrn, 0, class_15852.lllIIIllIIIIlllIlIIllIIll());
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(BufferedImage bufferedImage, String string) {
        try {
            ImageIO.write((RenderedImage)bufferedImage, "png", new File(Config.llIlllIlIIllIlIIIIllIIlIl().mcDataDir, string));
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

