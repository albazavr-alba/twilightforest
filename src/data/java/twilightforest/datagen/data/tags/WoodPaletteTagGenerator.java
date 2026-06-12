package twilightforest.datagen.data.tags;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
import org.jetbrains.annotations.NotNull;
import twilightforest.TFRegistries;
import twilightforest.TwilightForestMod;
import twilightforest.init.custom.WoodPalettes;
import twilightforest.tags.TFWoodPaletteTags;
import twilightforest.util.woods.WoodPalette;

import java.util.concurrent.CompletableFuture;

public class WoodPaletteTagGenerator extends TagsProvider<@NotNull WoodPalette> {

	public WoodPaletteTagGenerator(PackOutput output, CompletableFuture< HolderLookup.Provider> provider) {
		super(output, TFRegistries.Keys.WOOD_PALETTES, provider, TwilightForestMod.ID);
	}

	@Override
	protected void addTags(HolderLookup.Provider provider) {
		getOrCreateRawBuilder(TFWoodPaletteTags.WELL_SWIZZLE_MASK).addTag(WoodPalettes.OAK.identifier());
		getOrCreateRawBuilder(TFWoodPaletteTags.DRUID_HUT_SWIZZLE_MASK).addTag(WoodPalettes.OAK.identifier()).addTag(WoodPalettes.SPRUCE.identifier()).addTag(WoodPalettes.BIRCH.identifier());

		getOrCreateRawBuilder(TFWoodPaletteTags.COMMON_PALETTES).addTag(WoodPalettes.SPRUCE.identifier()).addTag(WoodPalettes.CANOPY.identifier());
		getOrCreateRawBuilder(TFWoodPaletteTags.UNCOMMON_PALETTES).addTag(WoodPalettes.OAK.identifier()).addTag(WoodPalettes.DARKWOOD.identifier()).addTag(WoodPalettes.TWILIGHT_OAK.identifier());
		getOrCreateRawBuilder(TFWoodPaletteTags.RARE_PALETTES).addTag(WoodPalettes.BIRCH.identifier()).addTag(WoodPalettes.JUNGLE.identifier()).addTag(WoodPalettes.MANGROVE.identifier());
		getOrCreateRawBuilder(TFWoodPaletteTags.TREASURE_PALETTES).addTag(WoodPalettes.TIMEWOOD.identifier()).addTag(WoodPalettes.TRANSWOOD.identifier()).addTag(WoodPalettes.MINEWOOD.identifier()).addTag(WoodPalettes.SORTWOOD.identifier());
	}

	@Override
	public String getName() {
		return "Twilight Forest Wood Palette Tags";
	}
}
