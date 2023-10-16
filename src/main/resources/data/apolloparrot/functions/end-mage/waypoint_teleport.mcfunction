tp @s @e[type=minecraft:armor_stand,tag=tp,sort=nearest,limit=1]
kill @e[distance=..2,type=minecraft:armor_stand]
forceload remove ~ ~
playsound minecraft:block.beacon.deactivate player @a[distance=..20] ~ ~ ~ 100 2
resource change @s apolloparrot:end-mage/resource -100