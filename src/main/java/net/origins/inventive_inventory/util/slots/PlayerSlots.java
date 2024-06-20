package net.origins.inventive_inventory.util.slots;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.origins.inventive_inventory.InventiveInventory;
import net.origins.inventive_inventory.util.ScreenCheck;

public class PlayerSlots {
    private static final int HOTBAR_SIZE = 9;
    private static final int OFFHAND_SIZE = 1;

    public static SlotRange get() {
        ScreenHandler screenHandler = InventiveInventory.getScreenHandler();
        int start = screenHandler.slots.size() - PlayerInventory.MAIN_SIZE - (ScreenCheck.isPlayerInventory() ? OFFHAND_SIZE : 0);
        int stop = screenHandler.slots.size() - HOTBAR_SIZE - (ScreenCheck.isPlayerInventory() ? OFFHAND_SIZE : 0);
        return new SlotRange(start, stop);
    }
}
