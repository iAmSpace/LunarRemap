package obf;

import net.minecraft.network.play.client.*;
import net.minecraft.network.play.server.*;

/*
 * Decompiled with CFR 0.150.
 */
final class class_2041
extends EnumConnectionState {
    class_2041(String string2, int n2, int n3, Object object) {
        this.func_150756_b(0, S00PacketKeepAlive.class);
        this.func_150756_b(1, S01PacketJoinGame.class);
        this.func_150756_b(2, S02PacketChat.class);
        this.func_150756_b(3, S03PacketTimeUpdate.class);
        this.func_150756_b(4, S04PacketEntityEquipment.class);
        this.func_150756_b(5, S05PacketSpawnPosition.class);
        this.func_150756_b(6, S06PacketUpdateHealth.class);
        this.func_150756_b(7, S07PacketRespawn.class);
        this.func_150756_b(8, S08PacketPlayerPosLook.class);
        this.func_150756_b(9, S09PacketHeldItemChange.class);
        this.func_150756_b(10, S0APacketUseBed.class);
        this.func_150756_b(11, S0BPacketAnimation.class);
        this.func_150756_b(12, S0CPacketSpawnPlayer.class);
        this.func_150756_b(13, S0DPacketCollectItem.class);
        this.func_150756_b(14, S0EPacketSpawnObject.class);
        this.func_150756_b(15, S0FPacketSpawnMob.class);
        this.func_150756_b(16, S10PacketSpawnPainting.class);
        this.func_150756_b(17, S11PacketSpawnExperienceOrb.class);
        this.func_150756_b(18, S12PacketEntityVelocity.class);
        this.func_150756_b(19, S13PacketDestroyEntities.class);
        this.func_150756_b(20, S14PacketEntity.class);
        this.func_150756_b(21, S14PacketEntity_S15PacketEntityRelMove.class);
        this.func_150756_b(22, S14PacketEntity_S16PacketEntityLook.class);
        this.func_150756_b(23, S14PacketEntity_S17PacketEntityLookMove.class);
        this.func_150756_b(24, S18PacketEntityTeleport.class);
        this.func_150756_b(25, S19PacketEntityHeadLook.class);
        this.func_150756_b(26, S19PacketEntityStatus.class);
        this.func_150756_b(27, S1BPacketEntityAttach.class);
        this.func_150756_b(28, S1CPacketEntityMetadata.class);
        this.func_150756_b(29, S1DPacketEntityEffect.class);
        this.func_150756_b(30, S1EPacketRemoveEntityEffect.class);
        this.func_150756_b(31, S1FPacketSetExperience.class);
        this.func_150756_b(32, S20PacketEntityProperties.class);
        this.func_150756_b(33, S21PacketChunkData.class);
        this.func_150756_b(34, S22PacketMultiBlockChange.class);
        this.func_150756_b(35, S23PacketBlockChange.class);
        this.func_150756_b(36, S24PacketBlockAction.class);
        this.func_150756_b(37, S25PacketBlockBreakAnim.class);
        this.func_150756_b(38, S26PacketMapChunkBulk.class);
        this.func_150756_b(39, S27PacketExplosion.class);
        this.func_150756_b(40, S28PacketEffect.class);
        this.func_150756_b(41, S29PacketSoundEffect.class);
        this.func_150756_b(42, S2APacketParticles.class);
        this.func_150756_b(43, S2BPacketChangeGameState.class);
        this.func_150756_b(44, S2CPacketSpawnGlobalEntity.class);
        this.func_150756_b(45, S2DPacketOpenWindow.class);
        this.func_150756_b(46, S2EPacketCloseWindow.class);
        this.func_150756_b(47, S2FPacketSetSlot.class);
        this.func_150756_b(48, S30PacketWindowItems.class);
        this.func_150756_b(49, S31PacketWindowProperty.class);
        this.func_150756_b(50, S32PacketConfirmTransaction.class);
        this.func_150756_b(51, S33PacketUpdateSign.class);
        this.func_150756_b(52, S34PacketMaps.class);
        this.func_150756_b(53, S35PacketUpdateTileEntity.class);
        this.func_150756_b(54, S36PacketSignEditorOpen.class);
        this.func_150756_b(55, S37PacketStatistics.class);
        this.func_150756_b(56, S38PacketPlayerListItem.class);
        this.func_150756_b(57, S39PacketPlayerAbilities.class);
        this.func_150756_b(58, S3APacketTabComplete.class);
        this.func_150756_b(59, S3BPacketScoreboardObjective.class);
        this.func_150756_b(60, S3CPacketUpdateScore.class);
        this.func_150756_b(61, S3DPacketDisplayScoreboard.class);
        this.func_150756_b(62, S3EPacketTeams.class);
        this.func_150756_b(63, S3FPacketCustomPayload.class);
        this.func_150756_b(64, S40PacketDisconnect.class);
        this.func_150751_a(0, C00PacketKeepAlive.class);
        this.func_150751_a(1, C01PacketChatMessage.class);
        this.func_150751_a(2, C02PacketUseEntity.class);
        this.func_150751_a(3, C03PacketPlayer.class);
        this.func_150751_a(4, C03PacketPlayer_C04PacketPlayerPosition.class);
        this.func_150751_a(5, C03PacketPlayer_C05PacketPlayerLook.class);
        this.func_150751_a(6, C03PacketPlayer_C06PacketPlayerPosLook.class);
        this.func_150751_a(7, C07PacketPlayerDigging.class);
        this.func_150751_a(8, C08PacketPlayerBlockPlacement.class);
        this.func_150751_a(9, C09PacketHeldItemChange.class);
        this.func_150751_a(10, C0APacketAnimation.class);
        this.func_150751_a(11, C0BPacketEntityAction.class);
        this.func_150751_a(12, C0CPacketInput.class);
        this.func_150751_a(13, C0DPacketCloseWindow.class);
        this.func_150751_a(14, C0EPacketClickWindow.class);
        this.func_150751_a(15, C0FPacketConfirmTransaction.class);
        this.func_150751_a(16, C10PacketCreativeInventoryAction.class);
        this.func_150751_a(17, C11PacketEnchantItem.class);
        this.func_150751_a(18, C12PacketUpdateSign.class);
        this.func_150751_a(19, C13PacketPlayerAbilities.class);
        this.func_150751_a(20, C14PacketTabComplete.class);
        this.func_150751_a(21, C15PacketClientSettings.class);
        this.func_150751_a(22, C16PacketClientStatus.class);
        this.func_150751_a(23, C17PacketCustomPayload.class);
    }
}

