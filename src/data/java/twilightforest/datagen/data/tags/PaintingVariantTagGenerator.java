package twilightforest.datagen.data.tags;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.world.entity.decoration.painting.PaintingVariant;
import net.minecraft.world.entity.decoration.painting.PaintingVariants;
import org.jetbrains.annotations.NotNull;
import twilightforest.TwilightForestMod;
import twilightforest.tags.TFPaintingVariantTags;

import java.util.concurrent.CompletableFuture;

public class PaintingVariantTagGenerator extends TagsProvider<@NotNull PaintingVariant> {

	public PaintingVariantTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> provider) {
		super(output, Registries.PAINTING_VARIANT, provider, TwilightForestMod.ID);
	}

	@Override
	protected void addTags(HolderLookup.Provider provider) {
		// Every single painting except for Humble
		getOrCreateRawBuilder(TFPaintingVariantTags.LICH_TOWER_PAINTINGS).addTag(
			PaintingVariants.KEBAB.identifier()).addTag(
			PaintingVariants.AZTEC.identifier()).addTag(
			PaintingVariants.ALBAN.identifier()).addTag(
			PaintingVariants.AZTEC2.identifier()).addTag(
			PaintingVariants.BOMB.identifier()).addTag(
			PaintingVariants.PLANT.identifier()).addTag(
			PaintingVariants.WASTELAND.identifier()).addTag(
			PaintingVariants.POOL.identifier()).addTag(
			PaintingVariants.COURBET.identifier()).addTag(
			PaintingVariants.SEA.identifier()).addTag(
			PaintingVariants.SUNSET.identifier()).addTag(
			PaintingVariants.CREEBET.identifier()).addTag(
			PaintingVariants.WANDERER.identifier()).addTag(
			PaintingVariants.GRAHAM.identifier()).addTag(
			PaintingVariants.MATCH.identifier()).addTag(
			PaintingVariants.BUST.identifier()).addTag(
			PaintingVariants.STAGE.identifier()).addTag(
			PaintingVariants.VOID.identifier()).addTag(
			PaintingVariants.SKULL_AND_ROSES.identifier()).addTag(
			PaintingVariants.WITHER.identifier()).addTag(
			PaintingVariants.FIGHTERS.identifier()).addTag(
			PaintingVariants.POINTER.identifier()).addTag(
			PaintingVariants.PIGSCENE.identifier()).addTag(
			PaintingVariants.BURNING_SKULL.identifier()).addTag(
			PaintingVariants.SKELETON.identifier()).addTag(
			PaintingVariants.DONKEY_KONG.identifier()).addTag(
			PaintingVariants.EARTH.identifier()).addTag(
			PaintingVariants.WIND.identifier()).addTag(
			PaintingVariants.WATER.identifier()).addTag(
			PaintingVariants.FIRE.identifier()).addTag(
			PaintingVariants.BAROQUE.identifier()).addTag(
			PaintingVariants.MEDITATIVE.identifier()).addTag(
			PaintingVariants.PRAIRIE_RIDE.identifier()).addTag(
			PaintingVariants.UNPACKED.identifier()).addTag(
			PaintingVariants.BACKYARD.identifier()).addTag(
			PaintingVariants.BOUQUET.identifier()).addTag(
			PaintingVariants.CAVEBIRD.identifier()).addTag(
			PaintingVariants.CHANGING.identifier()).addTag(
			PaintingVariants.COTAN.identifier()).addTag(
			PaintingVariants.ENDBOSS.identifier()).addTag(
			PaintingVariants.FERN.identifier()).addTag(
			PaintingVariants.FINDING.identifier()).addTag(
			PaintingVariants.LOWMIST.identifier()).addTag(
			PaintingVariants.ORB.identifier()).addTag(
			PaintingVariants.OWLEMONS.identifier()).addTag(
			PaintingVariants.PASSAGE.identifier()).addTag(
			PaintingVariants.POND.identifier()).addTag(
			PaintingVariants.SUNFLOWERS.identifier()).addTag(
			PaintingVariants.TIDES.identifier()
		);
		// Every single painting except for Humble, Unpacked and the 4 elements
		getOrCreateRawBuilder(TFPaintingVariantTags.LICH_BOSS_PAINTINGS).addTag(
			PaintingVariants.KEBAB.identifier()).addTag(
			PaintingVariants.AZTEC.identifier()).addTag(
			PaintingVariants.ALBAN.identifier()).addTag(
			PaintingVariants.AZTEC2.identifier()).addTag(
			PaintingVariants.BOMB.identifier()).addTag(
			PaintingVariants.PLANT.identifier()).addTag(
			PaintingVariants.WASTELAND.identifier()).addTag(
			PaintingVariants.POOL.identifier()).addTag(
			PaintingVariants.COURBET.identifier()).addTag(
			PaintingVariants.SEA.identifier()).addTag(
			PaintingVariants.SUNSET.identifier()).addTag(
			PaintingVariants.CREEBET.identifier()).addTag(
			PaintingVariants.WANDERER.identifier()).addTag(
			PaintingVariants.GRAHAM.identifier()).addTag(
			PaintingVariants.MATCH.identifier()).addTag(
			PaintingVariants.BUST.identifier()).addTag(
			PaintingVariants.STAGE.identifier()).addTag(
			PaintingVariants.VOID.identifier()).addTag(
			PaintingVariants.SKULL_AND_ROSES.identifier()).addTag(
			PaintingVariants.WITHER.identifier()).addTag(
			PaintingVariants.FIGHTERS.identifier()).addTag(
			PaintingVariants.POINTER.identifier()).addTag(
			PaintingVariants.PIGSCENE.identifier()).addTag(
			PaintingVariants.BURNING_SKULL.identifier()).addTag(
			PaintingVariants.SKELETON.identifier()).addTag(
			PaintingVariants.DONKEY_KONG.identifier()).addTag(
			PaintingVariants.BAROQUE.identifier()).addTag(
			PaintingVariants.MEDITATIVE.identifier()).addTag(
			PaintingVariants.PRAIRIE_RIDE.identifier()).addTag(
			PaintingVariants.BACKYARD.identifier()).addTag(
			PaintingVariants.BOUQUET.identifier()).addTag(
			PaintingVariants.CAVEBIRD.identifier()).addTag(
			PaintingVariants.CHANGING.identifier()).addTag(
			PaintingVariants.COTAN.identifier()).addTag(
			PaintingVariants.ENDBOSS.identifier()).addTag(
			PaintingVariants.FERN.identifier()).addTag(
			PaintingVariants.FINDING.identifier()).addTag(
			PaintingVariants.LOWMIST.identifier()).addTag(
			PaintingVariants.ORB.identifier()).addTag(
			PaintingVariants.OWLEMONS.identifier()).addTag(
			PaintingVariants.PASSAGE.identifier()).addTag(
			PaintingVariants.POND.identifier()).addTag(
			PaintingVariants.SUNFLOWERS.identifier()).addTag(
			PaintingVariants.TIDES.identifier()
		);
	}

	@Override
	public String getName() {
		return "Twilight Forest Painting Variant Tags";
	}
}
