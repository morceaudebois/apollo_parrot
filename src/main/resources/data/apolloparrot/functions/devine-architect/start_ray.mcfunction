tag @s add chainray
tag @s add temppos
scoreboard players set #hit Devine_Architect 0
scoreboard players set #distance Devine_Architect 0
execute positioned ~ ~1.3 ~ run function apolloparrot:devine-architect/ray
tag @s remove chainray
scoreboard objectives add Devine_Architect dummy
playsound minecraft:entity.illusioner.mirror_move master @a ~ ~ ~ 1 2
resource change @s apolloparrot:devine-architect/energy -50