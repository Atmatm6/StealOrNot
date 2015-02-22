package ca.Atmatm6.stealnot.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;

import java.util.Random;

public class OreSecure extends Block {
    public OreSecure(Material rock) {
        super(Material.rock);
        setHarvestLevel("pickaxe",3);

    }
    public EntityPlayer entityPlayer;

    public int quantityDropped(Random randomized) {
        return 4 + randomized.nextInt(2);
    }
}
