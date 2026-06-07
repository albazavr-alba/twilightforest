package twilightforest.client.model.block.patch;

import net.minecraft.client.renderer.block.dispatch.ModelState;
import net.minecraft.client.resources.model.*;
import net.minecraft.client.resources.model.cuboid.ItemTransforms;
import net.minecraft.client.resources.model.geometry.UnbakedGeometry;
import net.minecraft.client.resources.model.sprite.TextureSlots;
import net.minecraft.util.context.ContextMap;
import net.neoforged.neoforge.client.model.AbstractUnbakedModel;
import net.neoforged.neoforge.client.model.StandardModelParameters;
import org.jspecify.annotations.Nullable;

public class UnbakedPatchModel extends AbstractUnbakedModel {
	private final boolean shaggify;

	public UnbakedPatchModel(boolean shaggify, StandardModelParameters parameters) {
		super(parameters);
		this.shaggify = shaggify;
	}

	@Override
	public UnbakedGeometry geometry() {
		return new PatchModel(this.shaggify);
	}
}
