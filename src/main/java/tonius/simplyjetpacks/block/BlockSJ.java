package tonius.simplyjetpacks.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import tonius.simplyjetpacks.SimplyJetpacks;

public class BlockSJ extends Block {

    protected String name;

    public BlockSJ(int id, Material material, String name) {
        super(id, material);
        SimplyJetpacks.logger.info("Constructing block: " + name);
        this.name = name;
        this.setUnlocalizedName("simplyjetpacks." + name);
        this.setCreativeTab(SimplyJetpacks.creativeTab);
    }

}