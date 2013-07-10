package sobiohazardous.minestrappolation.extradecor.handler;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import sobiohazardous.minestrappolation.extradecor.ExtraDecor;
import sobiohazardous.minestrappolation.extradecor.block.EDBlockPane;
import sobiohazardous.minestrappolation.extradecor.block.BlockRope;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockPane;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;

public class RopeRender extends RenderBlocks implements ISimpleBlockRenderingHandler
{
	public void renderInventoryBlock(Block block, int metadata, int modelID, RenderBlocks renderer)
    {
         
    }
	
	 @Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer)
	{
	    if (modelId == ExtraDecor.ropeRenderId)
		{
				return renderBlockRope((BlockRope)block, renderer, x, y, z);
		}
	    return false;
	 }

	public boolean shouldRender3DInInventory()
	{
	    return false;
	}

	public int getRenderId()
	{
	     return ExtraDecor.ropeRenderId;
	}
	
	public boolean renderBlockRope(BlockRope par1BlockFence, RenderBlocks r, int par2, int par3, int par4)
    {
        boolean flag = false;
        float f = 0.375F;
        float f1 = 0.625F;
        r.setRenderBounds((double)f, 0.0D, (double)f, (double)f1, 1.0D, (double)f1);
        r.renderStandardBlock(par1BlockFence, par2, par3, par4);
        flag = true;
        boolean flag1 = false;
        boolean flag2 = false;

        if (!flag1 && !flag2)
        {
            flag1 = true;
        }

        f = 0.4375F;
        f1 = 0.5625F;
        float f2 = 0.75F;
        float f3 = 0.9375F;

        if (flag1)
        {
            r.renderStandardBlock(par1BlockFence, par2, par3, par4);
            flag = true;
        }

        if (flag2)
        {
            r.renderStandardBlock(par1BlockFence, par2, par3, par4);
            flag = true;
        }

        f2 = 0.375F;
        f3 = 0.5625F;

        if (flag1)
        {
            r.renderStandardBlock(par1BlockFence, par2, par3, par4);
            flag = true;
        }

        if (flag2)
        {
            r.renderStandardBlock(par1BlockFence, par2, par3, par4);
            flag = true;
        }

        par1BlockFence.setBlockBoundsBasedOnState(r.blockAccess, par2, par3, par4);
        return flag;
    }
	
}
