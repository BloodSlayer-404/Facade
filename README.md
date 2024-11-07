### Introduction:
This is an example of the structural design pattern called "Facade" for an app that helps you learn about design patterns, you can find that app [here](https://github.com/JoseMartinez117/AppPatrones "here").

#### About: 
The example is based on how the player in "The Leyend of Zelda" videogames saga, do complex actions only controling Link.

For this, the example gives common class to the user, to use specific complex actions, like have a combat, gets, and use items, and solve puzzles without the necesity of interact directly with corresponding classes in the videogames saga of "The Leyend of Zelda".

It saves resources from the RAM creating a enemyType class that saves all the common information that an specific enemy have, like the texture, the name and the max health that it can have.  And also creates an specific class to each enemy, to save specific information, like the position in the map.

#### Documentation: 
The documentation of the methods and classes created for the example is in the [Javadoc](https://github.com/BloodSlayer-404/Facade/tree/master/JavaDoc "Javadoc") folder. 

You can check the coverage of the unitary test created for this proyect in the [htmlReport](https://github.com/BloodSlayer-404/Facade/tree/master/htmlReport "htmlReport") folder, you can create more test for your own methods.
