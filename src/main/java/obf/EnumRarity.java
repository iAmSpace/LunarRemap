package obf;

public enum EnumRarity {
    common(EnumChatFormatting.WHITE, "Common"),
    uncommon(EnumChatFormatting.YELLOW, "Uncommon"),
    rare(EnumChatFormatting.AQUA, "Rare"),
    epic(EnumChatFormatting.LIGHT_PURPLE, "Epic");

    public final EnumChatFormatting rarityColor;
    public final String rarityName;

    private EnumRarity(EnumChatFormatting p_i45349_3_, String p_i45349_4_)
    {
        this.rarityColor = p_i45349_3_;
        this.rarityName = p_i45349_4_;
    }
}

