package com.dystopia.api.states;

import java.util.ArrayList;

import com.dystopia.api.effects.WorldEffects;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.ObjectHolder;

@EventBusSubscriber(modid = "dystopia", bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder("dystopia")
/**
 * Class responsible for management of WorldStates.
 * @author bmb0901
 */
public class WorldStateManager {
	
	public static WorldState base;
	
	/**
	 * The currentState variable is used to determine the
	 * current WorldState.
	 */
	public static WorldState currentState = null;
	
	/**
	 * A collection of WorldState() objects
	 * See {@code setupWorldStates}
	 */
	public static ArrayList<WorldState> worldStates = new ArrayList<WorldState>();
	
	public WorldStateManager() {
		
	}
	/**
	 * First assigns each list object with an WorldState(),
	 * then adds it to the worldStates list.
	 * @return worldStates
	 */
	public static ArrayList<WorldState> setupWorldStates() {
		base = new WorldState("base", null, null);
		
		worldStates.add(base);
		
		return worldStates;
	}
	/**
	 * First gets an instance of an WorldState() for each object
	 * in the worldStates ArrayList. After doing so, it assigns
	 * the most recent list object to currentState.
	 * @return currentState
	 */
	public static WorldState parseWorldState() {
		for(WorldState states : worldStates) {
			
			if(currentState == null) {
				WorldState.setWorldState(WorldStateManager.base);
			}
			if(currentState.worldEffect == null) {
				WorldEffects.setWorldEffect(WorldEffects.base);
			}
		}
		return currentState;
		
	}
}