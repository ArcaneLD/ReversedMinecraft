package fr.arcane.reversedminecraft;

import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.inventory.ItemStack;

public class BlazeListener implements Listener {


    @EventHandler
    public void OnBlazeDeath(EntityDeathEvent e) {
        if (e.getEntityType() == EntityType.BLAZE) {
            e.getDrops().clear();
            e.getEntity().getWorld().dropItem(e.getEntity().getLocation(), new ItemStack(Material.ENDER_PEARL,1));
        }
    }


    @EventHandler
    public void OnBlazeShoot(ProjectileLaunchEvent e) {

        Entity ent = (Entity) e.getEntity().getShooter();

        if (ent != null) {
            if (ent.getType() == EntityType.BLAZE) {

                e.getEntity().setVelocity(e.getEntity().getVelocity().multiply(-2));

            }


        }
    }
}
