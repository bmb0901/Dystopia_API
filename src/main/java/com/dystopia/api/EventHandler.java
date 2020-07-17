package com.dystopia.api;

import com.dystopia.api.effects.WorldEffects;
import com.dystopia.api.states.WorldStateManager;

import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.FORGE)
public class EventHandler {
	
	@SubscribeEvent
	public static void onWorldLoad(PlayerEvent.PlayerLoggedInEvent event) {
		//World States
		WorldStateManager.setupWorldStates();
		WorldStateManager.parseWorldState();
		
		// World Effects
		WorldEffects.setupWorldEffects();		
		WorldEffects.parseWorldEffects();		
	}

}
