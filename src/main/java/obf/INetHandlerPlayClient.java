package obf;

import net.minecraft.network.play.server.*;

/*
 * Decompiled with CFR 0.150.
 */
public interface INetHandlerPlayClient
extends INetHandler {
    public void lllIIIllIIIIlllIlIIllIIll(S0EPacketSpawnObject var1);

    public void lllIIIllIIIIlllIlIIllIIll(S11PacketSpawnExperienceOrb var1);

    public void lllIIIllIIIIlllIlIIllIIll(S2CPacketSpawnGlobalEntity var1);

    public void lllIIIllIIIIlllIlIIllIIll(S0FPacketSpawnMob var1);

    public void lllIIIllIIIIlllIlIIllIIll(S3BPacketScoreboardObjective var1);

    public void lllIIIllIIIIlllIlIIllIIll(S10PacketSpawnPainting var1);

    public void lllIIIllIIIIlllIlIIllIIll(S0CPacketSpawnPlayer var1);

    public void lllIIIllIIIIlllIlIIllIIll(S0BPacketAnimation var1);

    public void handleStatistics(S37PacketStatistics var1);

    public void lllIIIllIIIIlllIlIIllIIll(S25PacketBlockBreakAnim var1);

    public void lllIIIllIIIIlllIlIIllIIll(S36PacketSignEditorOpen var1);

    public void lllIIIllIIIIlllIlIIllIIll(S35PacketUpdateTileEntity var1);

    public void lllIIIllIIIIlllIlIIllIIll(S24PacketBlockAction var1);

    public void lllIIIllIIIIlllIlIIllIIll(S23PacketBlockChange var1);

    public void lllIIIllIIIIlllIlIIllIIll(S02PacketChat var1);

    public void lllIIIllIIIIlllIlIIllIIll(S3APacketTabComplete var1);

    public void lllIIIllIIIIlllIlIIllIIll(S22PacketMultiBlockChange var1);

    public void lllIIIllIIIIlllIlIIllIIll(S34PacketMaps var1);

    public void lllIIIllIIIIlllIlIIllIIll(S32PacketConfirmTransaction var1);

    public void lllIIIllIIIIlllIlIIllIIll(S2EPacketCloseWindow var1);

    public void lllIIIllIIIIlllIlIIllIIll(S30PacketWindowItems var1);

    public void lllIIIllIIIIlllIlIIllIIll(S2DPacketOpenWindow var1);

    public void lllIIIllIIIIlllIlIIllIIll(S31PacketWindowProperty var1);

    public void lllIIIllIIIIlllIlIIllIIll(S2FPacketSetSlot var1);

    public void lllIIIllIIIIlllIlIIllIIll(S3FPacketCustomPayload var1);

    public void lllIIIllIIIIlllIlIIllIIll(S40PacketDisconnect var1);

    public void lllIIIllIIIIlllIlIIllIIll(S0APacketUseBed var1);

    public void lllIIIllIIIIlllIlIIllIIll(S19PacketEntityStatus var1);

    public void lllIIIllIIIIlllIlIIllIIll(S1BPacketEntityAttach var1);

    public void lllIIIllIIIIlllIlIIllIIll(S27PacketExplosion var1);

    public void lllIIIllIIIIlllIlIIllIIll(S2BPacketChangeGameState var1);

    public void lllIIIllIIIIlllIlIIllIIll(S00PacketKeepAlive var1);

    public void lllIIIllIIIIlllIlIIllIIll(S21PacketChunkData var1);

    public void lllIIIllIIIIlllIlIIllIIll(S26PacketMapChunkBulk var1);

    public void lllIIIllIIIIlllIlIIllIIll(S28PacketEffect var1);

    public void lllIIIllIIIIlllIlIIllIIll(S01PacketJoinGame var1);

    public void lllIIIllIIIIlllIlIIllIIll(S14PacketEntity var1);

    public void lllIIIllIIIIlllIlIIllIIll(S08PacketPlayerPosLook var1);

    public void lllIIIllIIIIlllIlIIllIIll(S2APacketParticles var1);

    public void lllIIIllIIIIlllIlIIllIIll(S39PacketPlayerAbilities var1);

    public void lllIIIllIIIIlllIlIIllIIll(S38PacketPlayerListItem var1);

    public void lllIIIllIIIIlllIlIIllIIll(S13PacketDestroyEntities var1);

    public void lllIIIllIIIIlllIlIIllIIll(S1EPacketRemoveEntityEffect var1);

    public void lllIIIllIIIIlllIlIIllIIll(S07PacketRespawn var1);

    public void lllIIIllIIIIlllIlIIllIIll(S19PacketEntityHeadLook var1);

    public void lllIIIllIIIIlllIlIIllIIll(S09PacketHeldItemChange var1);

    public void lllIIIllIIIIlllIlIIllIIll(S3DPacketDisplayScoreboard var1);

    public void lllIIIllIIIIlllIlIIllIIll(S1CPacketEntityMetadata var1);

    public void lllIIIllIIIIlllIlIIllIIll(S12PacketEntityVelocity var1);

    public void lllIIIllIIIIlllIlIIllIIll(S04PacketEntityEquipment var1);

    public void lllIIIllIIIIlllIlIIllIIll(S1FPacketSetExperience var1);

    public void lllIIIllIIIIlllIlIIllIIll(S06PacketUpdateHealth var1);

    public void lllIIIllIIIIlllIlIIllIIll(S3EPacketTeams var1);

    public void lllIIIllIIIIlllIlIIllIIll(S3CPacketUpdateScore var1);

    public void lllIIIllIIIIlllIlIIllIIll(S05PacketSpawnPosition var1);

    public void lllIIIllIIIIlllIlIIllIIll(S03PacketTimeUpdate var1);

    public void lllIIIllIIIIlllIlIIllIIll(S33PacketUpdateSign var1);

    public void lllIIIllIIIIlllIlIIllIIll(S29PacketSoundEffect var1);

    public void lllIIIllIIIIlllIlIIllIIll(S0DPacketCollectItem var1);

    public void lllIIIllIIIIlllIlIIllIIll(S18PacketEntityTeleport var1);

    public void lllIIIllIIIIlllIlIIllIIll(S20PacketEntityProperties var1);

    public void lllIIIllIIIIlllIlIIllIIll(S1DPacketEntityEffect var1);
}

