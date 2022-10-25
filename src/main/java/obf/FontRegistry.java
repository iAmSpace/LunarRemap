package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class FontRegistry {
    public static final LCFontRenderer robotoLight12px;
    public static final LCFontRenderer robotoLight14px;
    public static final LCFontRenderer robotoLight16px;
    public static final LCFontRenderer robotoLight18px;
    public static final LCFontRenderer robotoLight22px;
    public static final LCFontRenderer robotoLight38px;
    public static final LCFontRenderer robotoMedium10px;
    public static final LCFontRenderer robotoMedium13px;
    public static final LCFontRenderer robotoMedium18px;
    public static final LCFontRenderer robotoBold10px;
    public static final LCFontRenderer robotoBold12px;
    public static final LCFontRenderer robotoBold14px;
    public static final LCFontRenderer robotoBold18px;
    public static final LCFontRenderer robotoBold22px;
    private static final ResourceLocation robotoLight;
    private static final ResourceLocation robotoMedium;
    private static final ResourceLocation robotoBold;

    static {
        robotoLight = new ResourceLocation("client/font/Roboto-Light.ttf");
        robotoMedium = new ResourceLocation("client/font/Roboto-Medium.ttf");
        robotoBold = new ResourceLocation("client/font/Roboto-Bold.ttf");

        robotoLight12px = new LCFontRenderer(robotoLight, 12.0f);
        robotoLight14px = new LCFontRenderer(robotoLight, 14.0f);
        robotoLight16px = new LCFontRenderer(robotoLight, 16.0f);
        robotoLight18px = new LCFontRenderer(robotoLight, 18.0f);
        robotoLight22px = new LCFontRenderer(robotoLight, 22.0f);
        robotoLight38px = new LCFontRenderer(robotoLight, 38.0f);
        robotoMedium10px = new LCFontRenderer(robotoMedium, 10.0f);
        robotoMedium13px = new LCFontRenderer(robotoMedium, 13.0f);
        robotoMedium18px = new LCFontRenderer(robotoMedium, 18.0f);
        robotoBold10px = new LCFontRenderer(robotoBold, 10.0f);
        robotoBold12px = new LCFontRenderer(robotoBold, 12.0f);
        robotoBold14px = new LCFontRenderer(robotoBold, 14.0f);
        robotoBold18px = new LCFontRenderer(robotoBold, 18.0f);
        robotoBold22px = new LCFontRenderer(robotoBold, 22.0f);
    }
}

