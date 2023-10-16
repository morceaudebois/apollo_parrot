particle minecraft:dust 0 1 0 1 ~ ~1 ~ 0.75 0.75 0.75 0 175

power grant @e[type=!#apolloparrot:untargetable,distance=..2] apolloparrot:witch-of-ink/color/green

execute as @e[type=!#apolloparrot:untargetable,distance=..2] at @s store result score @s Witch_of_Ink run power has @s apolloparrot:witch-of-ink/color/red
execute as @e[type=!#apolloparrot:untargetable,distance=..2] at @s if score @s Witch_of_Ink matches 1 run function apolloparrot:witch-of-ink/brush/yellow

power revoke @e[type=!#apolloparrot:untargetable,distance=..2] apolloparrot:witch-of-ink/color/blue
power revoke @e[type=!#apolloparrot:untargetable,distance=..2] apolloparrot:witch-of-ink/color/red