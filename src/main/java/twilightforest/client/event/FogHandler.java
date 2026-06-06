package twilightforest.client.event;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.util.Mth;
import net.minecraft.world.level.material.FogType;
import net.neoforged.neoforge.client.event.ViewportEvent;
import net.neoforged.neoforge.event.level.LevelEvent;
import twilightforest.init.TFBiomes;
import twilightforest.init.TFDimension;

import javax.annotation.Nullable;

public class FogHandler {
	private static boolean FOG_CHUNK_LOADED = false;

	private static float TERRAIN_FAR = 0.0F;
	private static float TERRAIN_NEAR = 0.0F;

	protected static void renderFog(ViewportEvent.RenderFog event) {
		if (event.getType().equals(FogType.NONE) && Minecraft.getInstance().getCameraEntity() instanceof LocalPlayer player && player.level() instanceof ClientLevel clientLevel && clientLevel.dimension() == TFDimension.DIMENSION_KEY) {
			if (FOG_CHUNK_LOADED) {
				boolean spooky = isSpooky(clientLevel, player);

				float far = spooky ? event.getFarPlaneDistance() * 0.5F : event.getFarPlaneDistance();
				float near = spooky ? far * 0.75F : event.getNearPlaneDistance();

				TERRAIN_FAR = Mth.lerp(0.003F, TERRAIN_FAR, far);
				TERRAIN_NEAR = Mth.lerp(0.003F * (TERRAIN_NEAR < near ? 0.5F : 2.0F), TERRAIN_NEAR, near);

				event.setFarPlaneDistance(TERRAIN_FAR);
				event.setNearPlaneDistance(TERRAIN_NEAR);

			} else if (clientLevel.isLoaded(player.blockPosition())) {
				FOG_CHUNK_LOADED = true;

				TERRAIN_FAR = isSpooky(clientLevel, player) ? event.getFarPlaneDistance() * 0.5F : event.getFarPlaneDistance();
				TERRAIN_NEAR = isSpooky(clientLevel, player) ? TERRAIN_FAR * 0.75F : event.getNearPlaneDistance();
			}
		}
	}

	protected static void unloadFog(LevelEvent.Unload event) { //As supernatural as the fog is, it shouldn't follow the player between worlds
		FOG_CHUNK_LOADED = false;
	}

	private static boolean isSpooky(@Nullable ClientLevel level, @Nullable LocalPlayer player) {
		return level != null && player != null && level.getBiome(player.blockPosition()).is(TFBiomes.SPOOKY_FOREST);
	}
}
