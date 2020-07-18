# Dystopia_API
The home of the Dystopia API. See README.txt for more information.
---------------------
The Dystopia API provides World States and World Effects:
World States : Act as a way to create specific conditions in a world.
World Effects : Are used by World States to define the actual behavior of the state.
---------------------
NOTE : I will most likely post an example mod using the API sometime soon but in the meantime :
---------------------
You will need 2 things :
  - An Event to act upon (Player loading into world, etc.)
  - A World Effect (Create a new File that extends EffectBase class)
---------------------
  - New world states can just be defined with : new WorldState(stateName, worldEffect, player)
    - stateName is a String to name the state.
    - worldEffect is a new instance of the World Effect you created.
    - And player is kinda self explainatory. (A player in the loaded world)
----------------------
  - New world effects are defined as follows :
    - takes a String to name the effect
    - to execute the effect call onEffectActive()
      - onEffectActive() is where you code the functionality of your state. (print a value, place a block near the player, etc.)
 ---------------------
