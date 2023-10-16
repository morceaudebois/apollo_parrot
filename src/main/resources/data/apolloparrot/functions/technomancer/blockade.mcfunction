execute unless block ~ ~ ~ #apolloparrot:non_solid run function apolloparrot:technomancer/blockade_hit_block
execute if score #hit chaintemp matches 0 as @e[tag=!chainray,distance=..1.5] at @s run function apolloparrot:technomancer/blockade_hit_entity
scoreboard players add #distance chaintemp 1
execute if score #hit chaintemp matches 0 if score #distance chaintemp matches ..400 positioned ^ ^ ^0.1 run function apolloparrot:technomancer/blockade
particle minecraft:crit ~ ~ ~ 0.01 0.01 0.01 0.01 5
particle minecraft:enchant .7 ~ ~ ~ 0.1 0.1 0.1 1 normal
particle minecraft:crit .7 ~ ~ ~ 0.1 0.1 0.1 1 normal
particle minecraft:enchant .7 ~ ~ ~ 0.1 0.1 0.1 1 normal
particle minecraft:crit .7 ~ ~ ~ 0.1 0.1 0.1 1 normal
particle minecraft:enchant .7 ~ ~ ~ 0.1 0.1 0.1 1 normal
particle minecraft:crit .7 ~ ~ ~ 0.1 0.1 0.1 1 normal
particle minecraft:enchant .7 ~ ~ ~ 0.1 0.1 0.1 1 normal
particle minecraft:crit .7 ~ ~ ~ 0.1 0.1 0.1 1 normal
particle minecraft:enchant .7 ~ ~ ~ 0.1 0.1 0.1 1 normal
particle minecraft:crit .7 ~ ~ ~ 0.1 0.1 0.1 1 normal