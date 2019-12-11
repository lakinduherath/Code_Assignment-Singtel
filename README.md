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