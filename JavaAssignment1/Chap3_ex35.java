
//(Keyword new) What’s the purpose of keyword new? Explain what happens when you use it.

/*
In Java, the keyword 'new' is used to create new objects. 
When you use the 'new' keyword followed by a constructor, 
it allocates memory for a new object of the specified type and initializes its state using the constructor.
Here's what happens when you use the new keyword:
Memory Allocation: When you use new, the Java Virtual Machine (JVM) allocates 
memory on the heap to store the object. The size of the memory allocated depends 
on the fields (instance variables) of the object and any overhead associated with object management.
Constructor Invocation: After memory allocation, 
the constructor of the class is invoked to initialize the newly created object. 
The constructor initializes the state of the object, 
setting initial values for its instance variables and performing any necessary setup tasks.
Object Creation: Once the constructor completes execution, 
the new expression returns a reference to the newly created object. 
This reference can be stored in a variable, passed as an argument, 
or used in any other way to access and manipulate the object.
 */   
// FROM ChatGPT