execute as @a[scores={rclick=1..},nbt={SelectedItem:{tag:{matrix:1}}},tag=!inMatrix] at @s run function apolloparrot:corrupted-wither/start
execute as @a[scores={rclick=1..},nbt={SelectedItem:{tag:{matrix:1}}},tag=inMatrix] at @s run function apolloparrot:corrupted-wither/stop

execute as @a[tag=inMatrix] at @s run function apolloparrot:corrupted-wither/start