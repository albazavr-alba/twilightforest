package twilightforest.network;

import net.minecraft.client.Minecraft;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.neoforged.neoforge.network.handling.IPayloadContext;
import org.jetbrains.annotations.NotNull;
import twilightforest.TwilightForestMod;
import twilightforest.init.TFGameRules;

public record EnforceProgressionStatusPacket(boolean enforce) implements CustomPacketPayload {

	public static final Type<@NotNull EnforceProgressionStatusPacket> TYPE = new Type<>(TwilightForestMod.prefix("sync_progression_status"));
	public static final StreamCodec<@NotNull RegistryFriendlyByteBuf, @NotNull EnforceProgressionStatusPacket> STREAM_CODEC = CustomPacketPayload.codec(EnforceProgressionStatusPacket::write, EnforceProgressionStatusPacket::new);

	public EnforceProgressionStatusPacket(FriendlyByteBuf buf) {
		this(buf.readBoolean());
	}

	public void write(FriendlyByteBuf buf) {
		buf.writeBoolean(this.enforce);
	}

	@Override
	public Type<? extends @NotNull CustomPacketPayload> type() {
		return TYPE;
	}

	public static void handle(EnforceProgressionStatusPacket message, IPayloadContext ctx) {
		ctx.enqueueWork(() ->
			Minecraft.getInstance().level.getServer().getGameRules().set(TFGameRules.ENFORCED_PROGRESSION_RULE.get(), message.enforce(), null)
		);
	}
}
