package twilightforest.client.model.block.carpet;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import net.neoforged.neoforge.client.model.UnbakedModelLoader;
import org.jetbrains.annotations.NotNull;
import twilightforest.block.GenericModelLoader;

public class RoyalRagsModelLoader extends GenericModelLoader<@NotNull UnbakedRoyalRagsModel> {
	public static final RoyalRagsModelLoader INSTANCE = new RoyalRagsModelLoader();

	public RoyalRagsModelLoader() {
		super(UnbakedRoyalRagsModel::new);
	}
}
