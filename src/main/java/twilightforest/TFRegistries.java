package twilightforest;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.neoforged.neoforge.registries.RegistryBuilder;
import org.jetbrains.annotations.NotNull;
import twilightforest.entity.MagicPaintingVariant;
import twilightforest.entity.passive.DwarfRabbitVariant;
import twilightforest.entity.passive.TinyBirdVariant;
import twilightforest.item.travellers_gear.modifiers.TravellersModifier;
import twilightforest.item.travellers_gear.modifiers.display.ItemDisplayType;
import twilightforest.util.Enforcement;
import twilightforest.util.Restriction;
import twilightforest.util.woods.WoodPalette;
import twilightforest.world.components.chunkblanketing.ChunkBlanketProcessor;
import twilightforest.world.components.chunkblanketing.ChunkBlanketType;
import twilightforest.world.components.layer.vanillalegacy.BiomeLayerFactory;
import twilightforest.world.components.layer.vanillalegacy.BiomeLayerType;
import twilightforest.world.components.layer.BiomeDensitySource;
import twilightforest.world.components.structures.StructureSpeleothemConfig;
import twilightforest.world.components.structures.markerhandler.TemplateMarkerHandler;
import twilightforest.world.components.structures.util.TemplateMarkerHandlerList;
import twilightforest.world.components.structures.markerhandler.TemplateMarkerHandlerType;

import java.util.Locale;

public class TFRegistries {
	public static Registry<@NotNull BiomeLayerType> BIOME_LAYER_TYPE;
	public static Registry<@NotNull Enforcement> ENFORCEMENT;
	public static Registry<@NotNull ChunkBlanketType> CHUNK_BLANKET_TYPES;
	public static Registry<@NotNull TemplateMarkerHandlerType> TEMPLATE_MARKER_HANDLER_TYPES;
	public static Registry<@NotNull ItemDisplayType> ITEM_DISPLAY_TYPE;
	public static Registry<@NotNull MapCodec<? extends TravellersModifier>> TRAVELLERS_MODIFIER_TYPE;

	public static void registerRegistries(net.neoforged.neoforge.registries.NewRegistryEvent event) {
		RegistryBuilder<@NotNull BiomeLayerType> biomeLayerBuilder = new RegistryBuilder<>(Keys.BIOME_LAYER_TYPE);
		RegistryBuilder<@NotNull Enforcement> enforcementBuilder = new RegistryBuilder<>(Keys.ENFORCEMENT).sync(true);
		RegistryBuilder<@NotNull ChunkBlanketType> chunkBlanketBuilder = new RegistryBuilder<>(Keys.CHUNK_BLANKET_TYPE);
		RegistryBuilder<@NotNull TemplateMarkerHandlerType> templateMarkerBuilder = new RegistryBuilder<>(Keys.TEMPLATE_MARKER_HANDLER_TYPE);
		RegistryBuilder<@NotNull ItemDisplayType> itemDisplayBuilder = new RegistryBuilder<>(Keys.ITEM_DISPLAY_TYPE).sync(true);
		RegistryBuilder<@NotNull MapCodec<? extends TravellersModifier>> modifierBuilder = new RegistryBuilder<>(Keys.TRAVELLERS_MODIFIER_TYPE).sync(true);

		event.register(biomeLayerBuilder.create());
		event.register(enforcementBuilder.create());
		event.register(chunkBlanketBuilder.create());
		event.register(templateMarkerBuilder.create());
		event.register(itemDisplayBuilder.create());
		event.register(modifierBuilder.create());

		BIOME_LAYER_TYPE = biomeLayerBuilder.create();
		ENFORCEMENT = enforcementBuilder.create();
		CHUNK_BLANKET_TYPES = chunkBlanketBuilder.create();
		TEMPLATE_MARKER_HANDLER_TYPES = templateMarkerBuilder.create();
		ITEM_DISPLAY_TYPE = itemDisplayBuilder.create();
		TRAVELLERS_MODIFIER_TYPE = modifierBuilder.create();
	}

	public static final class Keys {
		public static final String REGISTRY_NAMESPACE = "twilight";

		//Normal Registries
		public static final ResourceKey<@NotNull Registry<@NotNull BiomeLayerType>> BIOME_LAYER_TYPE = ResourceKey.createRegistryKey(namedRegistry("biome_layer_type"));
		public static final ResourceKey<@NotNull Registry<@NotNull Enforcement>> ENFORCEMENT = ResourceKey.createRegistryKey(TwilightForestMod.prefix("enforcement"));
		public static final ResourceKey<@NotNull Registry<@NotNull ChunkBlanketType>> CHUNK_BLANKET_TYPE = ResourceKey.createRegistryKey(TwilightForestMod.prefix("chunk_blanket_type"));
		public static final ResourceKey<@NotNull Registry<@NotNull TemplateMarkerHandlerType>> TEMPLATE_MARKER_HANDLER_TYPE = ResourceKey.createRegistryKey(TwilightForestMod.prefix("template_marker_handler_type"));
		public static final ResourceKey<@NotNull Registry<@NotNull ItemDisplayType>> ITEM_DISPLAY_TYPE = ResourceKey.createRegistryKey(namedRegistry("item_display_type"));
		public static final ResourceKey<@NotNull Registry<@NotNull MapCodec<? extends TravellersModifier>>> TRAVELLERS_MODIFIER_TYPE = ResourceKey.createRegistryKey(namedRegistry("travellers_modifier_type"));

		//Datapack Registries
		public static final ResourceKey<@NotNull Registry<@NotNull BiomeLayerFactory>> BIOME_STACK = ResourceKey.createRegistryKey(namedRegistry("biome_layer_stack"));
		public static final ResourceKey<@NotNull Registry<@NotNull BiomeDensitySource>> BIOME_TERRAIN_DATA = ResourceKey.createRegistryKey(namedRegistry("biome_terrain_data"));
		public static final ResourceKey<@NotNull Registry<@NotNull DwarfRabbitVariant>> DWARF_RABBIT_VARIANT = ResourceKey.createRegistryKey(namedRegistry("dwarf_rabbit_variant"));
		public static final ResourceKey<@NotNull Registry<@NotNull MagicPaintingVariant>> MAGIC_PAINTINGS = ResourceKey.createRegistryKey(namedRegistry("magic_paintings"));
		public static final ResourceKey<@NotNull Registry<@NotNull Restriction>> RESTRICTIONS = ResourceKey.createRegistryKey(namedRegistry("restrictions"));
		public static final ResourceKey<@NotNull Registry<@NotNull StructureSpeleothemConfig>> STRUCTURE_SPELEOTHEM_SETTINGS = ResourceKey.createRegistryKey(namedRegistry("structure_speleothem_settings"));
		public static final ResourceKey<@NotNull Registry<@NotNull TravellersModifier>> TRAVELLERS_MODIFIERS = ResourceKey.createRegistryKey(namedRegistry("travellers_modifiers"));
		public static final ResourceKey<@NotNull Registry<@NotNull TinyBirdVariant>> TINY_BIRD_VARIANT = ResourceKey.createRegistryKey(namedRegistry("tiny_bird_variant"));
		public static final ResourceKey<@NotNull Registry<@NotNull WoodPalette>> WOOD_PALETTES = ResourceKey.createRegistryKey(namedRegistry("wood_palettes"));
		public static final ResourceKey<@NotNull Registry<@NotNull ChunkBlanketProcessor>> CHUNK_BLANKET_PROCESSORS = ResourceKey.createRegistryKey(namedRegistry("chunk_blanket_processors"));
		public static final ResourceKey<@NotNull Registry<@NotNull TemplateMarkerHandler>> TEMPLATE_MARKER_HANDLER = ResourceKey.createRegistryKey(namedRegistry("template_marker_handler"));
		public static final ResourceKey<@NotNull Registry<@NotNull TemplateMarkerHandlerList>> TEMPLATE_MARKER_HANDLER_LIST = ResourceKey.createRegistryKey(namedRegistry("template_marker_handler_list"));

		public static Identifier namedRegistry(String name) {
			return Identifier.fromNamespaceAndPath(REGISTRY_NAMESPACE, name.toLowerCase(Locale.ROOT));
		}
	}
}
