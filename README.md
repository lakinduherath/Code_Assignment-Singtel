# Singtel Code Assignment - Answers

# A.
1. Can you implement the `sing()` method for the bird?

	a. How did you unit test it?
	
		Implemented JUnit testcases for methods in Bird class.
		In view of testing, refactored the code to return a String instead of printing the results to System.out.
     
	b. How did you optimize the code for maintainability?
	
		To optimize maintainability; Animal class converted to an interface, as there are no common methods for abstraction. Features walk, sing, fly implemented via interfaces implemented on Bird.
	 
2. Now, we have 2 special kinds of birds: the Duck and the Chicken... Can you implement them to make their own special sound?

	a. A duck says: “Quack, quack”
	
	b. A duck can swim
	
	c. A chicken says: “Cluck, cluck”
	
	d. A chicken cannot fly (assumption: its wings are clipped but ignore that)
	
	- Added two new classes : Chicken and Duck 
	- Implemented BirdFeature interface to both Chicken and Duck. BirdFeature has chirp & behaviour methods.
	- Implemented Swimming interface to Duck.
	- Added unit tests for Chicken and Duck.

3. Now how would you model a rooster?

    a. A rooster says: “Cock-a-doodle-doo”
    
    b. How is the rooster related to the chicken?
    
    c. Can you think of other ways to model a rooster without using inheritance?
    
	- Created a new Rooster class by extending Chicken class.
		- Assumption: Rooster is a specific type(subtype) of Chicken. 
	- Without using Inheritance, we could create Rooster as a separate class implementing the Animal interface with extra methods that's specific to Chicken & Rooster. 
	  This would be duplicating implementation at Chicken/Rooster, hence avoided.

4. Can you model a parrot? We are specifically interested in three parrots, one that lived in a house with dogs one in a house with cats, the other lived on a farm next to the rooster.

    a. A parrot living with dogs says: “Woof, woof”
    
    b. A parrot living with cats says: “Meow”
    
    c. A parrot living near the rooster says: “Cock-a-doodle-doo”
    
    d. How do you keep the parrot maintainable? What if we need another parrot lives near a Duck? Or near a phone that rings frequently?
    
	- Created a Parrot class with constructor to accept object with imitating sound(which implements  that implements `Sounding` interface).
	- This way we are able to create parrots that make sound depending on object passes & without making changes to the Parrot class itself.
	- Parrot is maintainable in a way when it is instantiated, it need to have an object of `Sounding` type. No changes requeired in Parrot class. 
	  If it's Duck class, only needed is implementing `Sounding` for Duck.
	  If it's phone class, only needed is implementing `Sounding` for Phone. 


# B
1. In addition to the birds, can you model a fish?

    a. Fishes don’t sing
    
    b. Fishes don’t walk
    
    c. Fishes can swim
    
	- Created a Fish class by implementing `Swimming` interface.
	- Added unit tests.

