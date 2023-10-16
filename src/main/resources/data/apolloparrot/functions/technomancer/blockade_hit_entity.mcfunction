scoreboard objectives add food dummy
scoreboard players set #hit chaintemp 1
execute at @e[limit=1,sort=nearest] run function apolloparrot:technomancer/blockade_summon
playsound minecraft:block.anvil.use player @a[distance=1..15]