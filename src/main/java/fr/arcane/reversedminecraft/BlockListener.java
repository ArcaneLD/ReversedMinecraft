package fr.arcane.reversedminecraft;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class BlockListener implements Listener {

    @EventHandler
    public void OnBreakInverse(BlockBreakEvent e) {

        Block b = e.getBlock();
        Player p = e.getPlayer();

        if (b.getType() == Material.STONE) {
            ItemStack i = new ItemStack(Material.DIRT, 1);
            e.setDropItems(false);
            p.getWorld().dropItem(b.getLocation(), i);

        }

        if (b.getType() == Material.DIRT) {
            ItemStack i = new ItemStack(Material.STONE, 1);
            e.setDropItems(false);
            p.getWorld().dropItem(b.getLocation(), i);

        }

        if (b.getType() == Material.COAL_ORE) {
            ItemStack i = new ItemStack(Material.DIAMOND, 1 );
            e.setDropItems(false);
            p.getWorld().dropItem(b.getLocation(), i);

        }

        if (b.getType() == Material.DIAMOND_ORE) {
            ItemStack i = new ItemStack(Material.COAL, 1 );
            e.setDropItems(false);
            p.getWorld().dropItem(b.getLocation(), i);

        }

        if (b.getType() == Material.IRON_ORE) {
            ItemStack i = new ItemStack(Material.GOLD_ORE, 1 );
            e.setDropItems(false);
            p.getWorld().dropItem(b.getLocation(), i);

        }

        if (b.getType() == Material.GOLD_ORE) {
            ItemStack i = new ItemStack(Material.IRON_ORE, 1 );
            e.setDropItems(false);
            p.getWorld().dropItem(b.getLocation(), i);

        }


    }








}
