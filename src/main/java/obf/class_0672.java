package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Sets;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class class_0672 {
    private static final Logger lIIllIIlIIIlllIlllIIlIIlI = LogManager.getLogger();
    protected static final class_0753 lllIIIllIIIIlllIlIIllIIll = new class_0753(0.1f, 0.2f);
    protected static final class_0753 lllIlIIlIIIlIlIIIllIlllIl = new class_0753(-0.5f, 0.0f);
    protected static final class_0753 IlIllllllIIlIIllllIIlIIIl = new class_0753(-1.0f, 0.1f);
    protected static final class_0753 lIlllIlllIIIIlIIlllIllIII = new class_0753(-1.8f, 0.1f);
    protected static final class_0753 IlIIIIIllllllIIlllIllllll = new class_0753(0.125f, 0.05f);
    protected static final class_0753 lIllllIIlIIIlIllllllIIIll = new class_0753(0.2f, 0.2f);
    protected static final class_0753 IIIllIIlIIIIIIlIlIIllIIlI = new class_0753(0.45f, 0.3f);
    protected static final class_0753 IllIIlllllllIIlIIlIIIIlIl = new class_0753(1.5f, 0.025f);
    protected static final class_0753 IIIllIllIIlIlIlIlIllllIIl = new class_0753(1.0f, 0.5f);
    protected static final class_0753 IllIIIllIIIIlIlIlIllIIlll = new class_0753(0.0f, 0.025f);
    protected static final class_0753 lIIIIlIlIIlllllIIllIIlIII = new class_0753(0.1f, 0.8f);
    protected static final class_0753 llIIlllIllIllllIIIlIIIIII = new class_0753(0.2f, 0.3f);
    protected static final class_0753 llIIllIllIlIIlIIllIllllll = new class_0753(-0.2f, 0.1f);
    private static final class_0672[] IllIIllIlIlllIllIllIlIIIl = new class_0672[256];
    public static final Set lllIIlIIIllllllIIIIlIlIlI = Sets.newHashSet();
    public static final class_0672 IlIlllIIIIIIlIIllIIllIlll = new class_0065(0).lllIlIIlIIIlIlIIIllIlllIl(112).lllIIIllIIIIlllIlIIllIIll("Ocean").lllIIIllIIIIlllIlIIllIIll(IlIllllllIIlIIllllIIlIIIl);
    public static final class_0672 IlIlIIlIlIllIIlIlIIllIIIl = new class_1313(1).lllIlIIlIIIlIlIIIllIlllIl(9286496).lllIIIllIIIIlllIlIIllIIll("Plains");
    public static final class_0672 lllllIlllIIllIlIIlIIIllII = new class_1204(2).lllIlIIlIIIlIlIIIllIlllIl(16421912).lllIIIllIIIIlllIlIIllIIll("Desert").lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(2.0f, 0.0f).lllIIIllIIIIlllIlIIllIIll(IlIIIIIllllllIIlllIllllll);
    public static final class_0672 IlIlIIlllIIlIllIIIlllllIl = new class_1467(3, false).lllIlIIlIIIlIlIIIllIlllIl(0x606060).lllIIIllIIIIlllIlIIllIIll("Extreme Hills").lllIIIllIIIIlllIlIIllIIll(IIIllIllIIlIlIlIlIllllIIl).lllIIIllIIIIlllIlIIllIIll(0.2f, 0.3f);
    public static final class_0672 lIIlIIIIIlIlllIlIIlIlIlll = new class_1806(4, 0).lllIlIIlIIIlIlIIIllIlllIl(353825).lllIIIllIIIIlllIlIIllIIll("Forest");
    public static final class_0672 lIlIlIIlIIIIlIIIIIlllIIII = new class_1043(5, 0).lllIlIIlIIIlIlIIIllIlllIl(747097).lllIIIllIIIIlllIlIIllIIll("Taiga").lllIIIllIIIIlllIlIIllIIll(5159473).lllIIIllIIIIlllIlIIllIIll(0.25f, 0.8f).lllIIIllIIIIlllIlIIllIIll(lIllllIIlIIIlIllllllIIIll);
    public static final class_0672 IlIIIlIIIIllIIIllIIIIIIll = new class_0126(6).lllIlIIlIIIlIlIIIllIlllIl(522674).lllIIIllIIIIlllIlIIllIIll("Swampland").lllIIIllIIIIlllIlIIllIIll(9154376).lllIIIllIIIIlllIlIIllIIll(llIIllIllIlIIlIIllIllllll).lllIIIllIIIIlllIlIIllIIll(0.8f, 0.9f);
    public static final class_0672 IIlllIlIlllIllIIIlllIIlIl = new class_0086(7).lllIlIIlIIIlIlIIIllIlllIl(255).lllIIIllIIIIlllIlIIllIIll("River").lllIIIllIIIIlllIlIIllIIll(lllIlIIlIIIlIlIIIllIlllIl);
    public static final class_0672 lIlIllIIlIIlIIlIIlIIlIIll = new class_2044(8).lllIlIIlIIIlIlIIIllIlllIl(0xFF0000).lllIIIllIIIIlllIlIIllIIll("Hell").lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(2.0f, 0.0f);
    public static final class_0672 llIIlIllIllllIlIIIIlIIlll = new class_0254(9).lllIlIIlIIIlIlIIIllIlllIl(0x8080FF).lllIIIllIIIIlllIlIIllIIll("Sky").lllIlIIlIIIlIlIIIllIlllIl();
    public static final class_0672 llIllllIlIllIIIlIllIIlIlI = new class_0065(10).lllIlIIlIIIlIlIIIllIlllIl(0x9090A0).lllIIIllIIIIlllIlIIllIIll("FrozenOcean").IlIllllllIIlIIllllIIlIIIl().lllIIIllIIIIlllIlIIllIIll(IlIllllllIIlIIllllIIlIIIl).lllIIIllIIIIlllIlIIllIIll(0.0f, 0.5f);
    public static final class_0672 lIlllIlllIlIIIIlllIlIlIIl = new class_0086(11).lllIlIIlIIIlIlIIIllIlllIl(0xA0A0FF).lllIIIllIIIIlllIlIIllIIll("FrozenRiver").IlIllllllIIlIIllllIIlIIIl().lllIIIllIIIIlllIlIIllIIll(lllIlIIlIIIlIlIIIllIlllIl).lllIIIllIIIIlllIlIIllIIll(0.0f, 0.5f);
    public static final class_0672 IlIIlllllIIlIlIlllllIllll = new class_2171(12, false).lllIlIIlIIIlIlIIIllIlllIl(0xFFFFFF).lllIIIllIIIIlllIlIIllIIll("Ice Plains").IlIllllllIIlIIllllIIlIIIl().lllIIIllIIIIlllIlIIllIIll(0.0f, 0.5f).lllIIIllIIIIlllIlIIllIIll(IlIIIIIllllllIIlllIllllll);
    public static final class_0672 llIIlIlIlllIIllIlIlllIllI = new class_2171(13, false).lllIlIIlIIIlIlIIIllIlllIl(0xA0A0A0).lllIIIllIIIIlllIlIIllIIll("Ice Mountains").IlIllllllIIlIIllllIIlIIIl().lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI).lllIIIllIIIIlllIlIIllIIll(0.0f, 0.5f);
    public static final class_0672 IllIIIIllIIllIllIlllIlIIl = new class_1967(14).lllIlIIlIIIlIlIIIllIlllIl(0xFF00FF).lllIIIllIIIIlllIlIIllIIll("MushroomIsland").lllIIIllIIIIlllIlIIllIIll(0.9f, 1.0f).lllIIIllIIIIlllIlIIllIIll(llIIlllIllIllllIIIlIIIIII);
    public static final class_0672 IIIIIIIIlIllIIllIIlllIllI = new class_1967(15).lllIlIIlIIIlIlIIIllIlllIl(0xA000FF).lllIIIllIIIIlllIlIIllIIll("MushroomIslandShore").lllIIIllIIIIlllIlIIllIIll(0.9f, 1.0f).lllIIIllIIIIlllIlIIllIIll(IllIIIllIIIIlIlIlIllIIlll);
    public static final class_0672 IIlIIlIlIlIllIIlIlIIIIlll = new class_0316(16).lllIlIIlIIIlIlIIIllIlllIl(16440917).lllIIIllIIIIlllIlIIllIIll("Beach").lllIIIllIIIIlllIlIIllIIll(0.8f, 0.4f).lllIIIllIIIIlllIlIIllIIll(IllIIIllIIIIlIlIlIllIIlll);
    public static final class_0672 llIIIlllIlllIlIllIIIIllIl = new class_1204(17).lllIlIIlIIIlIlIIIllIlllIl(13786898).lllIIIllIIIIlllIlIIllIIll("DesertHills").lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(2.0f, 0.0f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI);
    public static final class_0672 IIIIlIllIlIIlIIlIllIlIlll = new class_1806(18, 0).lllIlIIlIIIlIlIIIllIlllIl(2250012).lllIIIllIIIIlllIlIIllIIll("ForestHills").lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI);
    public static final class_0672 IlIlIIlllIllllllllIIIlIlI = new class_1043(19, 0).lllIlIIlIIIlIlIIIllIlllIl(1456435).lllIIIllIIIIlllIlIIllIIll("TaigaHills").lllIIIllIIIIlllIlIIllIIll(5159473).lllIIIllIIIIlllIlIIllIIll(0.25f, 0.8f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI);
    public static final class_0672 llllIIIIlIIIlIIIIIIlIllll = new class_1467(20, true).lllIlIIlIIIlIlIIIllIlllIl(7501978).lllIIIllIIIIlllIlIIllIIll("Extreme Hills Edge").lllIIIllIIIIlllIlIIllIIll(IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll()).lllIIIllIIIIlllIlIIllIIll(0.2f, 0.3f);
    public static final class_0672 llIIIIllIIIIIIIlIIIlIIIIl = new class_1061(21, false).lllIlIIlIIIlIlIIIllIlllIl(5470985).lllIIIllIIIIlllIlIIllIIll("Jungle").lllIIIllIIIIlllIlIIllIIll(5470985).lllIIIllIIIIlllIlIIllIIll(0.95f, 0.9f);
    public static final class_0672 IIllIllIIllIIlllIIIlIlllI = new class_1061(22, false).lllIlIIlIIIlIlIIIllIlllIl(2900485).lllIIIllIIIIlllIlIIllIIll("JungleHills").lllIIIllIIIIlllIlIIllIIll(5470985).lllIIIllIIIIlllIlIIllIIll(0.95f, 0.9f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI);
    public static final class_0672 llllllIlIllllIlIlIlIIIIlI = new class_1061(23, true).lllIlIIlIIIlIlIIIllIlllIl(6458135).lllIIIllIIIIlllIlIIllIIll("JungleEdge").lllIIIllIIIIlllIlIIllIIll(5470985).lllIIIllIIIIlllIlIIllIIll(0.95f, 0.8f);
    public static final class_0672 lIlIIllllIlIIIIllIIIIlIIl = new class_0065(24).lllIlIIlIIIlIlIIIllIlllIl(48).lllIIIllIIIIlllIlIIllIIll("Deep Ocean").lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII);
    public static final class_0672 llIlllIIllIlllIlIlIlIIIll = new class_0810(25).lllIlIIlIIIlIlIIIllIlllIl(10658436).lllIIIllIIIIlllIlIIllIIll("Stone Beach").lllIIIllIIIIlllIlIIllIIll(0.2f, 0.3f).lllIIIllIIIIlllIlIIllIIll(lIIIIlIlIIlllllIIllIIlIII);
    public static final class_0672 IIIIlIIlIIIllIIIIllIIIlII = new class_0316(26).lllIlIIlIIIlIlIIIllIlllIl(16445632).lllIIIllIIIIlllIlIIllIIll("Cold Beach").lllIIIllIIIIlllIlIIllIIll(0.05f, 0.3f).lllIIIllIIIIlllIlIIllIIll(IllIIIllIIIIlIlIlIllIIlll).IlIllllllIIlIIllllIIlIIIl();
    public static final class_0672 lllIIIIIIlIlllIIlIlIIIllI = new class_1806(27, 2).lllIIIllIIIIlllIlIIllIIll("Birch Forest").lllIlIIlIIIlIlIIIllIlllIl(3175492);
    public static final class_0672 llIIlIIllIIllIlIIllIIllII = new class_1806(28, 2).lllIIIllIIIIlllIlIIllIIll("Birch Forest Hills").lllIlIIlIIIlIlIIIllIlllIl(2055986).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI);
    public static final class_0672 lIlIlIIIIIIlIIllllIlIIllI = new class_1806(29, 3).lllIlIIlIIIlIlIIIllIlllIl(4215066).lllIIIllIIIIlllIlIIllIIll("Roofed Forest");
    public static final class_0672 IllllIIIIlIIlIIIIlllIIIIl = new class_1043(30, 0).lllIlIIlIIIlIlIIIllIlllIl(3233098).lllIIIllIIIIlllIlIIllIIll("Cold Taiga").lllIIIllIIIIlllIlIIllIIll(5159473).IlIllllllIIlIIllllIIlIIIl().lllIIIllIIIIlllIlIIllIIll(-0.5f, 0.4f).lllIIIllIIIIlllIlIIllIIll(lIllllIIlIIIlIllllllIIIll).IlIllllllIIlIIllllIIlIIIl(0xFFFFFF);
    public static final class_0672 llllIlIIIIIIIIIlllIIlIIIl = new class_1043(31, 0).lllIlIIlIIIlIlIIIllIlllIl(2375478).lllIIIllIIIIlllIlIIllIIll("Cold Taiga Hills").lllIIIllIIIIlllIlIIllIIll(5159473).IlIllllllIIlIIllllIIlIIIl().lllIIIllIIIIlllIlIIllIIll(-0.5f, 0.4f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI).IlIllllllIIlIIllllIIlIIIl(0xFFFFFF);
    public static final class_0672 IIIIlIlIIlIIIIlIlllIlIIII = new class_1043(32, 1).lllIlIIlIIIlIlIIIllIlllIl(5858897).lllIIIllIIIIlllIlIIllIIll("Mega Taiga").lllIIIllIIIIlllIlIIllIIll(5159473).lllIIIllIIIIlllIlIIllIIll(0.3f, 0.8f).lllIIIllIIIIlllIlIIllIIll(lIllllIIlIIIlIllllllIIIll);
    public static final class_0672 lllIIIIlIlIIlIIlllIIIIIIl = new class_1043(33, 1).lllIlIIlIIIlIlIIIllIlllIl(4542270).lllIIIllIIIIlllIlIIllIIll("Mega Taiga Hills").lllIIIllIIIIlllIlIIllIIll(5159473).lllIIIllIIIIlllIlIIllIIll(0.3f, 0.8f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI);
    public static final class_0672 llIlIIlllIIIIIllIIlIlIIII = new class_1467(34, true).lllIlIIlIIIlIlIIIllIlllIl(0x507050).lllIIIllIIIIlllIlIIllIIll("Extreme Hills+").lllIIIllIIIIlllIlIIllIIll(IIIllIllIIlIlIlIlIllllIIl).lllIIIllIIIIlllIlIIllIIll(0.2f, 0.3f);
    public static final class_0672 IllIIIlllllIlIlllIlllllII = new class_1526(35).lllIlIIlIIIlIlIIIllIlllIl(12431967).lllIIIllIIIIlllIlIIllIIll("Savanna").lllIIIllIIIIlllIlIIllIIll(1.2f, 0.0f).lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(IlIIIIIllllllIIlllIllllll);
    public static final class_0672 llIlllIlIIllIlIIIIllIIlIl = new class_1526(36).lllIlIIlIIIlIlIIIllIlllIl(10984804).lllIIIllIIIIlllIlIIllIIll("Savanna Plateau").lllIIIllIIIIlllIlIIllIIll(1.0f, 0.0f).lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(IllIIlllllllIIlIIlIIIIlIl);
    public static final class_0672 lIIIllIIIIIllllIlIlIllIll = new class_1754(37, false, false).lllIlIIlIIIlIlIIIllIlllIl(14238997).lllIIIllIIIIlllIlIIllIIll("Mesa");
    public static final class_0672 lIIIlIIIlIlllIllIIIlIIIlI = new class_1754(38, false, true).lllIlIIlIIIlIlIIIllIlllIl(11573093).lllIIIllIIIIlllIlIIllIIll("Mesa Plateau F").lllIIIllIIIIlllIlIIllIIll(IllIIlllllllIIlIIlIIIIlIl);
    public static final class_0672 lIIlIlllIllIlIlllIIIIIIII = new class_1754(39, false, false).lllIlIIlIIIlIlIIIllIlllIl(13274213).lllIIIllIIIIlllIlIIllIIll("Mesa Plateau").lllIIIllIIIIlllIlIIllIIll(IllIIlllllllIIlIIlIIIIlIl);
    protected static final class_1940 IIlIllIIlllllIIlIIllllIIl;
    protected static final class_1940 IllllIIlIIIllIlllIlllIllI;
    protected static final class_0092 IllIlIlIIIlllIIllIIIIlIll;
    public String IlIIIlIllIIIllIIIIlIIlIll;
    public int llllIIllIlIlllllllIIlIIlI;
    public int IlllIIlllllllIIllIlIllllI;
    public Block IlllIIIllllIIllIllIlIIlIl = Blocks.IlIllllllIIlIIllllIIlIIIl;
    public int lllIIIlIIlIlIllIIIIIlIIll = 0;
    public Block IIIlIlIllIlllllIlIllllllI = Blocks.lIlllIlllIIIIlIIlllIllIII;
    public int IIIIlIllIlIIIIIllllIIlllI = 5169201;
    public float llllIlIIllIIlllllIIllIIll;
    public float IlIlIllIIlIIIIlllIlIllIlI;
    public float IlIIllIlIlIllIIIlIIlIlIIl;
    public float lIlIIllIllIIIIIlIllllIIIl;
    public int lIlllIIllIIIIIIlIlIIlIllI;
    public class_0964 llIIIlIlIlIIlIllIIIllIlIl;
    protected List lIIlIIlIllIlIIlIlIIlIlIlI;
    protected List llIIIIIlIIlIIIIllIIIlIIII;
    protected List lIlIlIIllIIIlllIllIIlIllI;
    protected List IlIIIIIllIlllIIIIlIIIllIl;
    protected boolean lIIlIlIIllIIIlIIlIlIIIlII;
    protected boolean lIIIlIIllIllIIlIIlIIIllII;
    public final int lIlIllIIllIIIIlllIlIlllIl;
    protected class_1219 IlIIIlIIlllllIIIllIlIlIll;
    protected class_1240 lIIllllllllIlIllllllllIlI;
    protected class_1075 lIIIIllIIllIIIlIIIllIllII;

    protected class_0672(int n) {
        this.llllIlIIllIIlllllIIllIIll = class_0672.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll;
        this.IlIlIllIIlIIIIlllIlIllIlI = class_0672.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl;
        this.IlIIllIlIlIllIIIlIIlIlIIl = 0.5f;
        this.lIlIIllIllIIIIIlIllllIIIl = 0.5f;
        this.lIlllIIllIIIIIIlIlIIlIllI = 0xFFFFFF;
        this.lIIlIIlIllIlIIlIlIIlIlIlI = new ArrayList();
        this.llIIIIIlIIlIIIIllIIIlIIII = new ArrayList();
        this.lIlIlIIllIIIlllIllIIlIllI = new ArrayList();
        this.IlIIIIIllIlllIIIIlIIIllIl = new ArrayList();
        this.lIIIlIIllIllIIlIIlIIIllII = true;
        this.IlIIIlIIlllllIIIllIlIlIll = new class_1219(false);
        this.lIIllllllllIlIllllllllIlI = new class_1240(false);
        this.lIIIIllIIllIIIlIIIllIllII = new class_1075();
        this.lIlIllIIllIIIIlllIlIlllIl = n;
        class_0672.IllIIllIlIlllIllIllIlIIIl[n] = this;
        this.llIIIlIlIlIIlIllIIIllIlIl = this.lllIIIllIIIIlllIlIIllIIll();
        this.llIIIIIlIIlIIIIllIIIlIIII.add(new class_0920(class_1317.class, 12, 4, 4));
        this.llIIIIIlIIlIIIIllIIIlIIII.add(new class_0920(class_0161.class, 10, 4, 4));
        this.llIIIIIlIIlIIIIllIIIlIIII.add(new class_0920(class_1554.class, 10, 4, 4));
        this.llIIIIIlIIlIIIIllIIIlIIII.add(new class_0920(class_1802.class, 8, 4, 4));
        this.lIIlIIlIllIlIIlIlIIlIlIlI.add(new class_0920(class_1051.class, 100, 4, 4));
        this.lIIlIIlIllIlIIlIlIIlIlIlI.add(new class_0920(class_0724.class, 100, 4, 4));
        this.lIIlIIlIllIlIIlIlIIlIlIlI.add(new class_0920(class_0630.class, 100, 4, 4));
        this.lIIlIIlIllIlIIlIlIIlIlIlI.add(new class_0920(class_1234.class, 100, 4, 4));
        this.lIIlIIlIllIlIIlIlIIlIlIlI.add(new class_0920(class_2105.class, 100, 4, 4));
        this.lIIlIIlIllIlIIlIlIIlIlIlI.add(new class_0920(class_0793.class, 10, 1, 4));
        this.lIIlIIlIllIlIIlIlIIlIlIlI.add(new class_0920(class_0066.class, 5, 1, 1));
        this.lIlIlIIllIIIlllIllIIlIllI.add(new class_0920(class_0002.class, 10, 4, 4));
        this.IlIIIIIllIlllIIIIlIIIllIl.add(new class_0920(class_0453.class, 10, 8, 8));
    }

    protected class_0964 lllIIIllIIIIlllIlIIllIIll() {
        return new class_0964();
    }

    protected class_0672 lllIIIllIIIIlllIlIIllIIll(float f, float f2) {
        if (f > 0.1f && f < 0.2f) {
            throw new IllegalArgumentException("Please avoid temperatures in the range 0.1 - 0.2 because of snow");
        }
        this.IlIIllIlIlIllIIIlIIlIlIIl = f;
        this.lIlIIllIllIIIIIlIllllIIIl = f2;
        return this;
    }

    protected final class_0672 lllIIIllIIIIlllIlIIllIIll(class_0753 class_07532) {
        this.llllIlIIllIIlllllIIllIIll = class_07532.lllIIIllIIIIlllIlIIllIIll;
        this.IlIlIllIIlIIIIlllIlIllIlI = class_07532.lllIlIIlIIIlIlIIIllIlllIl;
        return this;
    }

    protected class_0672 lllIlIIlIIIlIlIIIllIlllIl() {
        this.lIIIlIIllIllIIlIIlIIIllII = false;
        return this;
    }

    public class_1174 lllIIIllIIIIlllIlIIllIIll(Random random) {
        return random.nextInt(10) == 0 ? this.lIIllllllllIlIllllllllIlI : this.IlIIIlIIlllllIIIllIlIlIll;
    }

    public class_1067 lllIlIIlIIIlIlIIIllIlllIl(Random random) {
        return new class_1448(Blocks.IlIlIIlllIllllllllIIIlIlI, 1);
    }

    public String lllIIIllIIIIlllIlIIllIIll(Random random, int n, int n2, int n3) {
        return random.nextInt(3) > 0 ? class_1209.lIlIIllllIlIIIIllIIIIlIIl[0] : class_1209.llllllIlIllllIlIlIlIIIIlI[0];
    }

    protected class_0672 IlIllllllIIlIIllllIIlIIIl() {
        this.lIIlIlIIllIIIlIIlIlIIIlII = true;
        return this;
    }

    protected class_0672 lllIIIllIIIIlllIlIIllIIll(String string) {
        this.IlIIIlIllIIIllIIIIlIIlIll = string;
        return this;
    }

    protected class_0672 lllIIIllIIIIlllIlIIllIIll(int n) {
        this.IIIIlIllIlIIIIIllllIIlllI = n;
        return this;
    }

    protected class_0672 lllIlIIlIIIlIlIIIllIlllIl(int n) {
        this.lllIIIllIIIIlllIlIIllIIll(n, false);
        return this;
    }

    protected class_0672 IlIllllllIIlIIllllIIlIIIl(int n) {
        this.IlllIIlllllllIIllIlIllllI = n;
        return this;
    }

    protected class_0672 lllIIIllIIIIlllIlIIllIIll(int n, boolean bl) {
        this.llllIIllIlIlllllllIIlIIlI = n;
        this.IlllIIlllllllIIllIlIllllI = bl ? (n & 0xFEFEFE) >> 1 : n;
        return this;
    }

    public int lllIIIllIIIIlllIlIIllIIll(float f) {
        if ((f /= 3.0f) < -1.0f) {
            f = -1.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        return Color.getHSBColor(0.62222224f - f * 0.05f, 0.5f + f * 0.1f, 1.0f).getRGB();
    }

    public List lllIIIllIIIIlllIlIIllIIll(class_1012 class_10122) {
        return class_10122 == class_1012.lllIIIllIIIIlllIlIIllIIll ? this.lIIlIIlIllIlIIlIlIIlIlIlI : (class_10122 == class_1012.lllIlIIlIIIlIlIIIllIlllIl ? this.llIIIIIlIIlIIIIllIIIlIIII : (class_10122 == class_1012.lIlllIlllIIIIlIIlllIllIII ? this.lIlIlIIllIIIlllIllIIlIllI : (class_10122 == class_1012.IlIllllllIIlIIllllIIlIIIl ? this.IlIIIIIllIlllIIIIlIIIllIl : null)));
    }

    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return this.IllIIIllIIIIlIlIlIllIIlll();
    }

    public boolean IlIIIIIllllllIIlllIllllll() {
        return this.IllIIIllIIIIlIlIlIllIIlll() ? false : this.lIIIlIIllIllIIlIIlIIIllII;
    }

    public boolean lIllllIIlIIIlIllllllIIIll() {
        return this.lIlIIllIllIIIIIlIllllIIIl > 0.85f;
    }

    public float IIIllIIlIIIIIIlIlIIllIIlI() {
        return 0.1f;
    }

    public final int IllIIlllllllIIlIIlIIIIlIl() {
        return (int)(this.lIlIIllIllIIIIIlIllllIIIl * 65536.0f);
    }

    public final float IIIllIllIIlIlIlIlIllllIIl() {
        return this.lIlIIllIllIIIIIlIllllIIIl;
    }

    public final float lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        if (n2 > 64) {
            float f = (float)IIlIllIIlllllIIlIIllllIIl.lllIIIllIIIIlllIlIIllIIll((double)n * 1.0 / 8.0, (double)n3 * 1.0 / 8.0) * 4.0f;
            return this.IlIIllIlIlIllIIIlIIlIlIIl - (f + (float)n2 - 64.0f) * 0.05f / 30.0f;
        }
        return this.IlIIllIlIlIllIIIlIIlIlIIl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, int n, int n2) {
        this.llIIIlIlIlIIlIllIIIllIlIl.lllIIIllIIIIlllIlIIllIIll(class_13342, random, this, n, n2);
    }

    public int lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
        double d = MathHelper.clamp_float(this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3), 0.0f, 1.0f);
        double d2 = MathHelper.clamp_float(this.IIIllIllIIlIlIlIlIllllIIl(), 0.0f, 1.0f);
        return class_0614.lllIIIllIIIIlllIlIIllIIll(d, d2);
    }

    public int IlIllllllIIlIIllllIIlIIIl(int n, int n2, int n3) {
        double d = MathHelper.clamp_float(this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3), 0.0f, 1.0f);
        double d2 = MathHelper.clamp_float(this.IIIllIllIIlIlIlIlIllllIIl(), 0.0f, 1.0f);
        return class_0828.lllIIIllIIIIlllIlIIllIIll(d, d2);
    }

    public boolean IllIIIllIIIIlIlIlIllIIlll() {
        return this.lIIlIlIIllIIIlIIlIlIIIlII;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, Block[] arrclass_0549, byte[] arrby, int n, int n2, double d) {
        this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, random, arrclass_0549, arrby, n, n2, d);
    }

    public final void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, Random random, Block[] arrclass_0549, byte[] arrby, int n, int n2, double d) {
        boolean bl = true;
        Block class_05492 = this.IlllIIIllllIIllIllIlIIlIl;
        byte by = (byte)(this.lllIIIlIIlIlIllIIIIIlIIll & 0xFF);
        Block class_05493 = this.IIIlIlIllIlllllIlIllllllI;
        int n3 = -1;
        int n4 = (int)(d / 3.0 + 3.0 + random.nextDouble() * 0.25);
        int n5 = n & 0xF;
        int n6 = n2 & 0xF;
        int n7 = arrclass_0549.length / 256;
        for (int i = 255; i >= 0; --i) {
            int n8 = (n6 * 16 + n5) * n7 + i;
            if (i <= 0 + random.nextInt(5)) {
                arrclass_0549[n8] = Blocks.IllIIlllllllIIlIIlIIIIlIl;
                continue;
            }
            Block class_05494 = arrclass_0549[n8];
            if (class_05494 != null && class_05494.lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll) {
                if (class_05494 != Blocks.lllIlIIlIIIlIlIIIllIlllIl) continue;
                if (n3 == -1) {
                    if (n4 <= 0) {
                        class_05492 = null;
                        by = 0;
                        class_05493 = Blocks.lllIlIIlIIIlIlIIIllIlllIl;
                    } else if (i >= 59 && i <= 64) {
                        class_05492 = this.IlllIIIllllIIllIllIlIIlIl;
                        by = (byte)(this.lllIIIlIIlIlIllIIIIIlIIll & 0xFF);
                        class_05493 = this.IIIlIlIllIlllllIlIllllllI;
                    }
                    if (i < 63 && (class_05492 == null || class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll)) {
                        if (this.lllIIIllIIIIlllIlIIllIIll(n, i, n2) < 0.15f) {
                            class_05492 = Blocks.IllIIllIlIlllIllIllIlIIIl;
                            by = 0;
                        } else {
                            class_05492 = Blocks.IllIIIllIIIIlIlIlIllIIlll;
                            by = 0;
                        }
                    }
                    n3 = n4;
                    if (i >= 62) {
                        arrclass_0549[n8] = class_05492;
                        arrby[n8] = by;
                        continue;
                    }
                    if (i < 56 - n4) {
                        class_05492 = null;
                        class_05493 = Blocks.lllIlIIlIIIlIlIIIllIlllIl;
                        arrclass_0549[n8] = Blocks.lllIIlIIIllllllIIIIlIlIlI;
                        continue;
                    }
                    arrclass_0549[n8] = class_05493;
                    continue;
                }
                if (n3 <= 0) continue;
                arrclass_0549[n8] = class_05493;
                if (--n3 != 0 || class_05493 != Blocks.llIIllIllIlIIlIIllIllllll) continue;
                n3 = random.nextInt(4) + Math.max(0, i - 63);
                class_05493 = Blocks.IlIIlllllIIlIlIlllllIllll;
                continue;
            }
            n3 = -1;
        }
    }

    protected class_0672 lIIIIlIlIIlllllIIllIIlIII() {
        return new class_0743(this.lIlIllIIllIIIIlllIlIlllIl + 128, this);
    }

    public Class llIIlllIllIllllIIIlIIIIII() {
        return this.getClass();
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_0672 class_06722) {
        return class_06722 == this ? true : (class_06722 == null ? false : this.llIIlllIllIllllIIIlIIIIII() == class_06722.llIIlllIllIllllIIIlIIIIII());
    }

    public class_1052 llIIllIllIlIIlIIllIllllll() {
        return (double)this.IlIIllIlIlIllIIIlIIlIlIIl < 0.2 ? class_1052.lllIlIIlIIIlIlIIIllIlllIl : ((double)this.IlIIllIlIlIllIIIlIIlIlIIl < 1.0 ? class_1052.IlIllllllIIlIIllllIIlIIIl : class_1052.lIlllIlllIIIIlIIlllIllIII);
    }

    public static class_0672[] lllIIlIIIllllllIIIIlIlIlI() {
        return IllIIllIlIlllIllIllIlIIIl;
    }

    public static class_0672 lIlllIlllIIIIlIIlllIllIII(int n) {
        if (n >= 0 && n <= IllIIllIlIlllIllIllIlIIIl.length) {
            return IllIIllIlIlllIllIllIlIIIl[n];
        }
        lIIllIIlIIIlllIlllIIlIIlI.warn("Biome ID is out of bounds: " + n + ", defaulting to 0 (Ocean)");
        return IlIlllIIIIIIlIIllIIllIlll;
    }

    static {
        IlIlIIlIlIllIIlIlIIllIIIl.lIIIIlIlIIlllllIIllIIlIII();
        lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII();
        lIIlIIIIIlIlllIlIIlIlIlll.lIIIIlIlIIlllllIIllIIlIII();
        lIlIlIIlIIIIlIIIIIlllIIII.lIIIIlIlIIlllllIIllIIlIII();
        IlIIIlIIIIllIIIllIIIIIIll.lIIIIlIlIIlllllIIllIIlIII();
        IlIIlllllIIlIlIlllllIllll.lIIIIlIlIIlllllIIllIIlIII();
        llIIIIllIIIIIIIlIIIlIIIIl.lIIIIlIlIIlllllIIllIIlIII();
        llllllIlIllllIlIlIlIIIIlI.lIIIIlIlIIlllllIIllIIlIII();
        IllllIIIIlIIlIIIIlllIIIIl.lIIIIlIlIIlllllIIllIIlIII();
        IllIIIlllllIlIlllIlllllII.lIIIIlIlIIlllllIIllIIlIII();
        llIlllIlIIllIlIIIIllIIlIl.lIIIIlIlIIlllllIIllIIlIII();
        lIIIllIIIIIllllIlIlIllIll.lIIIIlIlIIlllllIIllIIlIII();
        lIIIlIIIlIlllIllIIIlIIIlI.lIIIIlIlIIlllllIIllIIlIII();
        lIIlIlllIllIlIlllIIIIIIII.lIIIIlIlIIlllllIIllIIlIII();
        lllIIIIIIlIlllIIlIlIIIllI.lIIIIlIlIIlllllIIllIIlIII();
        llIIlIIllIIllIlIIllIIllII.lIIIIlIlIIlllllIIllIIlIII();
        lIlIlIIIIIIlIIllllIlIIllI.lIIIIlIlIIlllllIIllIIlIII();
        IIIIlIlIIlIIIIlIlllIlIIII.lIIIIlIlIIlllllIIllIIlIII();
        IlIlIIlllIIlIllIIIlllllIl.lIIIIlIlIIlllllIIllIIlIII();
        llIlIIlllIIIIIllIIlIlIIII.lIIIIlIlIIlllllIIllIIlIII();
        class_0672.IllIIllIlIlllIllIllIlIIIl[class_0672.lllIIIIlIlIIlIIlllIIIIIIl.lIlIllIIllIIIIlllIlIlllIl + 128] = IllIIllIlIlllIllIllIlIIIl[class_0672.IIIIlIlIIlIIIIlIlllIlIIII.lIlIllIIllIIIIlllIlIlllIl + 128];
        for (class_0672 class_06722 : IllIIllIlIlllIllIllIlIIIl) {
            if (class_06722 == null || class_06722.lIlIllIIllIIIIlllIlIlllIl >= 128) continue;
            lllIIlIIIllllllIIIIlIlIlI.add(class_06722);
        }
        lllIIlIIIllllllIIIIlIlIlI.remove(lIlIllIIlIIlIIlIIlIIlIIll);
        lllIIlIIIllllllIIIIlIlIlI.remove(llIIlIllIllllIlIIIIlIIlll);
        lllIIlIIIllllllIIIIlIlIlI.remove(llIllllIlIllIIIlIllIIlIlI);
        lllIIlIIIllllllIIIIlIlIlI.remove(llllIIIIlIIIlIIIIIIlIllll);
        IIlIllIIlllllIIlIIllllIIl = new class_1940(new Random(1234L), 1);
        IllllIIlIIIllIlllIlllIllI = new class_1940(new Random(2345L), 1);
        IllIlIlIIIlllIIllIIIIlIll = new class_0092();
    }
}

