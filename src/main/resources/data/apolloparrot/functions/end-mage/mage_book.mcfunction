give @s minecraft:written_book{pages:['{"translate":"apolloparrot.end-mage.book.welcome"}','{"translate":"apolloparrot.book.mana_potions"}','{"translate":"apolloparrot.end-mage.book.hidden_crafts"}','{"translate":"apolloparrot.end-mage.book.infinite_range"}','{"translate":"apolloparrot.end-mage.book.waypoint"}'],title:"Hidden Knowledge",author:"End Mage"}
clear @s minecraft:book 1
particle minecraft:enchant ~ ~ ~ 2 2 2 2 1000
particle minecraft:enchanted_hit ~ ~ ~ 3 3 3 3 1000
playsound minecraft:block.note_block.iron_xylophone player @a[distance=..20] ~ ~ ~ 100 0.9 1