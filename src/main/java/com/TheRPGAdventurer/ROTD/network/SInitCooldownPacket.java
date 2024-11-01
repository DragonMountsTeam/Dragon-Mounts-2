package com.TheRPGAdventurer.ROTD.network;

import com.TheRPGAdventurer.ROTD.capability.ArmorEffectManager;
import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import static com.TheRPGAdventurer.ROTD.util.VarInt.readVarInt;
import static com.TheRPGAdventurer.ROTD.util.VarInt.writeVarInt;

public class SInitCooldownPacket implements IMessage {
    public int size;
    public int[] data;

    public SInitCooldownPacket() {
        this.size = 0;
        this.data = new int[0];
    }

    public SInitCooldownPacket(int size, int[] data) {
        this.size = size;
        this.data = data;
    }

    @Override
    public void fromBytes(ByteBuf buffer) {
        final int maxSize = readVarInt(buffer);
        final int[] data = new int[maxSize];
        int i = 0;
        while (i < maxSize && buffer.isReadable()) {
            data[i++] = readVarInt(buffer);
        }
        this.size = i;
        this.data = data;
    }

    @Override
    public void toBytes(ByteBuf buffer) {
        int[] data = this.data;
        int size = this.size;
        writeVarInt(buffer, size);
        for (int i = 0; i < size; ++i) {
            writeVarInt(buffer, data[i]);
        }
    }

    public static class Handler implements IMessageHandler<SInitCooldownPacket, IMessage> {
        @Override
        public IMessage onMessage(SInitCooldownPacket packet, MessageContext context) {
            ArmorEffectManager.init(packet);
            return null;
        }
    }
}
