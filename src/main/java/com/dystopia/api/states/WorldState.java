package com.dystopia.api.states;

import com.dystopia.api.effects.EffectBase;
import com.dystopia.api.effects.WorldEffects;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

/**
 * Defines a base WorldState
 * See {@link WorldStateManager}
 * @author bmb0901
 *
 */
public class WorldState {
	
	public static String name;
	public static EffectBase worldEffect;
	public static PlayerEntity player;
	
	public WorldState(String stateName, EffectBase effect, PlayerEntity playerIn) {
		name = stateName;
		worldEffect = effect;
		player = playerIn;
		
		WorldEffects.setWorldEffect(getWorldStateEffect());
		
		if(player != null) {
			EffectBase.getEffect();
		}
	}
	
	/**
	 * Gets the current instance of the world
	 * @return
	 */
	public static World getWorld() {
		return Minecraft.getInstance().world;
	}
	
	/**
	 * Gets the WorldState name parameter
	 * @return name
	 */
	public String getWorldStateName() {
		return name;
	}
	/**
	 * Gets the worldEffect used by the WorldState
	 * see {@link EffectBase}
	 * @return
	 */
	public static EffectBase getWorldStateEffect() {
		return worldEffect;
	}
	/**
	 *  Gets an instance of the WorldState by
	 * 	returning a new WorldState() with {@code name, effect,
	 * 	and player} parameters.
	 **/
	public static WorldState getWorldState() {
		return WorldStateManager.currentState;
		
	}
	/**
	 * Sets the currentState to the WorldState specified
	 * @param state
	 * @return 
	 */
	public static WorldState setWorldState(WorldState state) {
		return WorldStateManager.currentState = state;
	}
}
