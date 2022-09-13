package fr.arcane.reversedminecraft;

import org.bukkit.Material;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityTargetEvent;
import org.bukkit.inventory.ItemStack;

public class EndermanListener implements Listener {

    @EventHandler
    public void OnEndermanDeath(EntityDeathEvent e) {
        if (e.getEntityType() == EntityType.ENDERMAN) {
            e.getDrops().clear();
            e.getEntity().getWorld().dropItem(e.getEntity().getLocation(), new ItemStack(Material.BLAZE_ROD,1));
        }
    }

    @EventHandler
    public void OnEndermanTarget(EntityTargetEvent e) {
        if (e.getEntityType() == EntityType.ENDERMAN) {
            Enderman ender = (Enderman) e.getEntity();
            ender.damage(50);
        }
    }
}
