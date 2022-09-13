package fr.arcane.reversedminecraft;

import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.ChunkPopulateEvent;

public class TreeListener implements Listener {

    @EventHandler
    @SuppressWarnings("all")
    public void TreeReverser(ChunkPopulateEvent e) {

        Chunk chunk = e.getChunk();

        int bx = chunk.getX()<<4;
        int bz = chunk.getZ()<<4;

        World world = e.getWorld();

        for(int xx = bx; xx < bx+16; xx++) {
            for(int zz = bz; zz < bz+16; zz++) {
                for(int yy = 50; yy < 120; yy++) {
                    Block type = ((World) world).getBlockAt(xx, yy, zz);
                    if (type.getType() == Material.OAK_LEAVES) {
                        world.getBlockAt(xx,yy,zz).setType(Material.OAK_WOOD);
                    }
                    if(type.getType() == Material.OAK_LOG) {
                        world.getBlockAt(xx,yy,zz).setType(Material.OAK_LEAVES);
                    }

                    if (type.getType() == Material.BIRCH_LEAVES) {
                        world.getBlockAt(xx,yy,zz).setType(Material.BIRCH_WOOD);
                    }
                    if(type.getType() == Material.BIRCH_LOG) {
                        world.getBlockAt(xx,yy,zz).setType(Material.BIRCH_LEAVES);
                    }

                    if (type.getType() == Material.SPRUCE_LEAVES) {
                        world.getBlockAt(xx,yy,zz).setType(Material.SPRUCE_WOOD);
                    }
                    if(type.getType() == Material.SPRUCE_LOG) {
                        world.getBlockAt(xx,yy,zz).setType(Material.SPRUCE_LEAVES);
                    }

                    if (type.getType() == Material.DARK_OAK_LEAVES) {
                        world.getBlockAt(xx,yy,zz).setType(Material.DARK_OAK_WOOD);
                    }
                    if(type.getType() == Material.DARK_OAK_LOG) {
                        world.getBlockAt(xx,yy,zz).setType(Material.DARK_OAK_LEAVES);
                    }

                    if (type.getType() == Material.ACACIA_LEAVES) {
                        world.getBlockAt(xx,yy,zz).setType(Material.ACACIA_WOOD);
                    }
                    if(type.getType() == Material.ACACIA_LOG) {
                        world.getBlockAt(xx,yy,zz).setType(Material.ACACIA_LEAVES);
                    }

                    if (type.getType() == Material.JUNGLE_LEAVES) {
                        world.getBlockAt(xx,yy,zz).setType(Material.JUNGLE_WOOD);
                    }
                    if(type.getType() == Material.JUNGLE_LOG) {
                        world.getBlockAt(xx,yy,zz).setType(Material.JUNGLE_LEAVES);
                    }

                }
            }
        }
    }
}
