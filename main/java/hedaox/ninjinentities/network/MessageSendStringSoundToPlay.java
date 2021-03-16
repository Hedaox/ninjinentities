package hedaox.ninjinentities.network;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;

public class MessageSendStringSoundToPlay implements IMessage {

    private String toSend;

    public MessageSendStringSoundToPlay() {
    }

    public MessageSendStringSoundToPlay(String toSend) {
        this.toSend = toSend;
    }

    @Override
    public void toBytes(ByteBuf buf) {
        ByteBufUtils.writeUTF8String(buf,toSend);
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        toSend = ByteBufUtils.readUTF8String(buf);
    }

    public static class MyMessageHandler implements
            IMessageHandler<MessageSendStringSoundToPlay, IMessage> {

        @Override
        public IMessage onMessage(MessageSendStringSoundToPlay message,
                                  MessageContext ctx) {

            String SoundStr = message.toSend.split("#")[0];
            int entityID = Integer.valueOf(message.toSend.split("#")[1]);
            Entity entity = MinecraftServer.getServer().getEntityWorld().getEntityByID(entityID);

            entity.worldObj.playSoundAtEntity(entity, SoundStr,0.4F,1);

            return null;
        }
    }
}
