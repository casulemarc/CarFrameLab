Thread Lab CS204 Myers Start with the Car,
CarPanel and CarFrame provided. 

Add a CarQueue class that maintains a queue of random directions that the car should go.

1.	There is an addToQueue method that has a class that implements runnable, define the run method (add random directions into the queue and then sleep), creates an instance of the runnable object, creates a thread and starts the thread. 
2./** Adds 0,1,2 or 3 to queue 	    
3.*  0 = up 	     *  1 = down 	   
4. *  2 = right 	     *  3 = left 	    
5. */  2.	It also has a deleteQueue method that returns an Integer;  
6. 3.	In your constructor, place 5 or 6 numbers in the queue so that when the animation starts – there will be something to retrieve from the queue  Modify the run method of the startAnimation in CarPanel so that the car will go to the right, left, up or down depending on what is retrieved from the CarQueue. 
7.  The cars should go in the opposite direction if they hit a boundary.
