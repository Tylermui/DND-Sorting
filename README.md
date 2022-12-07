[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-9f69c29eadd1a2efcce9672406de9a39573de1bdf5953fef360cfc2c3f7d7205.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=9270800)
# Mission

In this assignment, you will practice sorting data according to user's preferences. Your goal is to read the D&D characters' skills from `characters.txt`. First goes the D&D character's name, followed by Strength, Dexterity, Constitution, Intelligence, Wisdom, and Charisma in _no particular order_. The D&D characters are separated by an empty line in that file. 

Your goal is to:

1. Read the data from `characters.txt` (choose any way you want to store the data in your program. HINT: use HashMaps!). __[20 points]__
2. Ask the user to enter the skill that should be used to sort the data. It should NOT be case-sensitive. For example, the user could enter "wisdom" or "wiSDom". __[5 points]__
3. After reading the user's input, sort the D&D characters by that skill and print them in _ascending_ order (natural ordering) according to that skill. __[50 points]__
4. When you print their names, append their skill value (that you used in sorting) in parenthesis. [20 points]
5. Continue asking the user to enter the skill that should be used to sort the data until the user enters "recursion!". When the user enters "recursion!", respond with something back and exit the program. __[5 points]__

## Hint

You can use Comparator or Comparable, Collections.sort(), HashMaps, PriorityQueues, etc. to help you out.

## Design

The design of this program is the most important part. So, before starting to code, think through the "whats and hows" of this program.

# Example

Below you can see how your program would read the user's input and show the sorted characters:
```
Please enter the skill you would like to sort D&D characters by:
streNgTH
The characters are in ascending order of their strength:
Thief - Anna Prentice (7)
Cleric - Barry Cade (9)
Monk - Cara Van (11)
Sorcerer - Anne Teak (13)
Bard - Chip Munk (16)
Ranger - Claire Annette Reed (16)
Druid - Brock Lee (17)
Warlock - Billy Rubin (18)
Wizard - Cam Payne (19)
Fighter - Anna Sasin (23)
Barbarian - Alf A. Romeo (25)
Paladin - Casey Macy (26)

Please enter the skill you would like to sort D&D characters by:
wisDOM
The characters are in ascending order of their wisdom:
Barbarian - Alf A. Romeo (2)
Fighter - Anna Sasin (6)
Paladin - Casey Macy (9)
Warlock - Billy Rubin (9)
Thief - Anna Prentice (10)
Bard - Chip Munk (11)
Ranger - Claire Annette Reed (14)
Sorcerer - Anne Teak (15)
Monk - Cara Van (19)
Wizard - Cam Payne (20)
Druid - Brock Lee (21)
Cleric - Barry Cade (26)

Please enter the skill you would like to sort D&D characters by:
recursion!
Bye. May the D&D use recursion on you!
```
