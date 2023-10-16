summon minecraft:snow_golem ~ ~ ~ {Pumpkin:0b,Team:light-mage,CustomName:'{"translate":"apolloparrot.light-mage.golem"}',DeathLootTable:"minecraft:empty"}
summon minecraft:snow_golem ~ ~ ~ {Pumpkin:0b,Team:light-mage,CustomName:'{"translate":"apolloparrot.light-mage.golem"}',DeathLootTable:"minecraft:empty"}
summon minecraft:snow_golem ~ ~ ~ {Pumpkin:0b,Team:light-mage,CustomName:'{"translate":"apolloparrot.light-mage.golem"}',DeathLootTable:"minecraft:empty"}
particle minecraft:snowflake ~ ~ ~ 1 1 1 1 1000
playsound minecraft:entity.snow_golem.hurt player @a[distance=..20] ~ ~ ~ 100 1 1
team join light-mage @a[distance=..4]
resource change @s apolloparrot:light-mage/resource -100
clear @s minecraft:carved_pumpkin 1