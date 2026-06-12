package twilightforest.datagen.data.tags;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.world.level.block.entity.BlockEntityType;
import org.jetbrains.annotations.NotNull;
import twilightforest.TwilightForestMod;
import twilightforest.init.TFBlockEntities;
import twilightforest.tags.TFBlockEntityTypeTags;

import java.util.concurrent.CompletableFuture;

public class BlockEntityTypeTagGenerator extends TagsProvider<@NotNull BlockEntityType<?>> {

	public BlockEntityTypeTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> provider) {
		super(output, Registries.BLOCK_ENTITY_TYPE, provider, TwilightForestMod.ID);
	}

	@Override
	protected void addTags(HolderLookup.Provider provider) {
		this.getOrCreateRawBuilder(TFBlockEntityTypeTags.RELOCATION_NOT_SUPPORTED).addTag(
			TFBlockEntities.ANTIBUILDER.getKey().identifier()).addTag(
			TFBlockEntities.BEANSTALK_GROWER.getKey().identifier()).addTag(
			TFBlockEntities.NAGA_SPAWNER.getKey().identifier()).addTag(
			TFBlockEntities.LICH_SPAWNER.getKey().identifier()).addTag(
			TFBlockEntities.MINOSHROOM_SPAWNER.getKey().identifier()).addTag(
			TFBlockEntities.HYDRA_SPAWNER.getKey().identifier()).addTag(
			TFBlockEntities.KNIGHT_PHANTOM_SPAWNER.getKey().identifier()).addTag(
			TFBlockEntities.UR_GHAST_SPAWNER.getKey().identifier()).addTag(
			TFBlockEntities.ALPHA_YETI_SPAWNER.getKey().identifier()).addTag(
			TFBlockEntities.SNOW_QUEEN_SPAWNER.getKey().identifier()).addTag(
			TFBlockEntities.FINAL_BOSS_SPAWNER.getKey().identifier());

		this.getOrCreateRawBuilder(TFBlockEntityTypeTags.IMMOVABLE).addTag(
			TFBlockEntities.ANTIBUILDER.getKey().identifier()).addTag(
			TFBlockEntities.BEANSTALK_GROWER.getKey().identifier()).addTag(
			TFBlockEntities.NAGA_SPAWNER.getKey().identifier()).addTag(
			TFBlockEntities.LICH_SPAWNER.getKey().identifier()).addTag(
			TFBlockEntities.MINOSHROOM_SPAWNER.getKey().identifier()).addTag(
			TFBlockEntities.HYDRA_SPAWNER.getKey().identifier()).addTag(
			TFBlockEntities.KNIGHT_PHANTOM_SPAWNER.getKey().identifier()).addTag(
			TFBlockEntities.UR_GHAST_SPAWNER.getKey().identifier()).addTag(
			TFBlockEntities.ALPHA_YETI_SPAWNER.getKey().identifier()).addTag(
			TFBlockEntities.SNOW_QUEEN_SPAWNER.getKey().identifier()).addTag(
			TFBlockEntities.FINAL_BOSS_SPAWNER.getKey().identifier());
	}

	@Override
	public String getName() {
		return "Twilight Forest Block Entity Tags";
	}
}
