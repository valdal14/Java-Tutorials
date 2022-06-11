package com.valdal14.JVM;

/**
 *  JVM -----------------------------------------------------------------------------------------------------------
 *      -> It is an actual virtual machine that can perform operations like a real machine
 *      -> JVM is a software/application based Virtual Machine
 *          -> Program --> ENGINE --> Output == JVM or CLR for .NET app
 *
 *      -> JVM COMPONENTS =========================================================================================
 *          -> Class Loader Subsystem
 *              --> Responsible of loading the .class file into memory
 *          -> Once a class is loaded we need different Memory Areas
*               ----> Method Area
*               ----> Heap Area
*               ----> Stack Area
*               ----> PC Registers
*               ----> Native Method Stacks Area
 *          -> Execution Engine
 *              --> When everything is in place the Execution Engine to run our Java programs
 *              --> We can also use Java Native Interface JNI if we want to invoke methods in other programming
 *                  languages such as C and C++ (Native Method Libraries)
 *              --> Native Method Libraries (written in C and C++)
 *      ===========================================================================================================
 *
 *      -> CLASS LOADER ===========================================================================================
 *          -> The CL follows a delegation model
 *              --> When JVM comes across an application class the JVM will first check if the class is in the
 *                  Method Area. if not, it will ask the Class Loader System to load the class
 *              --> Class Loader System --> Application Classloader --> Delegates the request to the Extension
 *                  Classloader --> Which Internally will request the Bootstrap Classloader
 *              --> The Bootstrap Classloader is at the top of the hierarchy and it will check for the
 *                  path jre/lib/*.jar. If the class is there it will loaded it, otherwise it will delegate back
 *                  the Extension Classloader.
 *              --> Extension Classloader will check if the class is under the path ext/*.jar. if it is there it
 *                  will load it otherwise it will delegate back the Application Classloader.
 *              --> The Application Classloader will check application classpath, if it finds it, it wil load it
 *                  otherwise it will throw a NoClassDefFoundException or a ClassNotFoundException at runtime.
 *      ===========================================================================================================
 *
 *      -> TYPES OF CLASS LOADERS =================================================================================
 *          -> There are three types of class loaders:
 *              --> Bootstrap class loader:
 *                  ---> Also known as Primordial class loader is responsible of loading the classes that comes with
 *                       the JDK installation:
 *                                              JDK
 *                                               |- JRE
 *                                                   |- lib
 *                                                       |- rt.jar
 *
 *                       rt.jar are jars ready to be used in any Java application.
 *                  ---> The Bootstrap class loader come with every Java installation and it is written in C or C++
 *
 *              --> Extension class loader:
 *                  ---> Loads the classes from the ext folder of the JRE path
 *                                                 JDK
 *                                                  |- JRE
 *                                                      |- lib
 *                                                          |- ext
 *                                                              |- security.jar (example)
 *
 *                  ---> The Extension class loader is a Java implementation and the class is:
 *                      ----> sun.misc.Lanucher$ExtClassLocader.class
 *
 *              --> Application class loader:
 *                  ---> Is the Child of Extension class loader and it is responsible of loading all the classes
 *                       that a programmer writes and that puts on the classpath env variable.
 *                  ---> It is also a Java implementation and the class is:
 *                      ----> sun.misc.Lanucher$ApplicationClassLocader.class
 *
 *      ===========================================================================================================
 *
 *      -> We may create multiple instances of a class, but it will be loaded only once in memory
 *
 *      -> CLASS LOADING SUB-SYSTEM ===============================================================================
 *          -> The Class Loading Sub-System is the first important component of the JVM.
 *          -> It is responsible of:
 *              --> LOADING
 *                  ---> Loading it the process of reading the .class inside the HDD and storing the info of the
 *                       class inside the JVM Method area.
 *                  ---> User.class and its binary info will be loaded in the Method Area of the JVM.
 *                  ---> JVM does it for every .class file in our application
 *                  ---> The info stored in the Method area is:
 *                          ----> The Fully-Qualified-Class-Name
 *                          ----> The Fully-Qualified-Parent-Class-Name
 *                          ----> Method information
 *                          ----> Variable information
 *                          ----> Constructor information
 *                          ----> Modifier information
 *                          ----> Constant Pool information
 *                   ---> Once the .class is loaded into memory the JVM creates an Object for the class User
 *                        in the Heap Area. The Object is of type java.lang.Class and this object is not a
 *                        User Object, but it is an Object that represents the User.class in the Method Area
 *                        on the Heap.
 *                   ---> Using this java.lang.Class we can access all the information we have see above such
 *                        as the Class name, the Parent class name, the Method info and so on dynamically at
 *                        runtime.
 *
 *              --> LINKING
 *                  ---> The Linking is divided into three sub-activities:
 *                          ----> VERIFY
 *                                  -----> The process of ensuring that the binary .class file is properly
 *                                         formatted. (Inside the Method Area) This is a check done by the
 *                                         "Byte Code Verifier". If there is an error the Byte Code Verifier
 *                                         will throw a java.lang.VerifyError exception.
 *                          ----> PREPARE
 *                                  -----> When the JVM allocates memory for all the Static Variables and
 *                                         class variables and assign a default value to them.
 *                          ----> RESOLVE
 *                                  -----> It is the process of replacing the Symbolic Names with the Original
 *                                         memory reference address
 *
 *                                         Class A {
 *                                              B u = new B();
 *                                              String s = new String();
 *                                         }
 *
 *                                         Class A will have a constant pool where B.class and String.class
 *                                         are stored. These references will be replaced inside the Method
 *                                         Area with Symbolic values such as 1234 and 4536 (Memory location
 *                                         addresses)
 *
 *              --> INITIALIZATION
 *                  ---> JVM will init the static variables and assign them their values.
 *                  ---> Static Blocks will be executed (Starting from parent to child and top to bottom)
 *
 *      ===========================================================================================================
 *
 *      -> METHOD AREAS ===========================================================================================
 *          --> When a .class is loaded into memory all the binary info are stored in the Method Area.
 *          --> It is a runtime constant pool
 *          --> It is shared across multiple Threads and the Method area is created when the JVM Start-Up.
 *
 *      ===========================================================================================================
 *
 *      -> STACK AREAS ============================================================================================
 *          --> Whenever a Thread is created by the JVM it also creates a Stack Memory also known Runtime Stack.
 *          --> All the method calls and local variables are stored in this stack.
 *          --> Each Thread gets its own Stack memory Area
 *          --> And each method that a thread calls will have a Stack Frame.
 *              ---> The Stack frame is divided into three parts:
 *                  ----> Local Variable Array
 *                          -----> Contains all the parameters and local variables of a method
 *                          -----> This is where all the method params and variable inside the method are stored
 *                          -----> Each block in this array is of 4 bytes
 *                          -----> 1 block of 4 bytes to store int and floating point number
 *                                 ------> bytes, shorts and chars are converted into int
 *                          -----> 2 blocks of 4 bytes to store Double and Long
 *                  ----> Operand Stack
 *                          -----> JVM uses this stack to perform operations.
 *                          -----> Push and Pop operands are used based on the statement we put in the code
 *                  ----> Frame Data
 *                          -----> it contains the Constant Pool info of a particular method.
 *                          -----> it also contains the info about the Exception Table
 *                                 to get the corresponding information for a catch block.
 *          --> Once the method is done with its job the Stack Frame will e also removed from the Stack Area
 *          --> And when the Thread has finished and just before its termination, its Runtime Stack will be
 *              destroyed by the JVM.
 *          --> One thread cannot get access to the Stack Area of another Thread
 *          -->
 *
 *      ===========================================================================================================
 *
 *      -> HEAP AREA ==============================================================================================
 *          -> All Object are stored in the HEAP Area.
 *          -> All the threads can access this area and it is shared
 *          -> It is also created when the JVM starts up
 *      ===========================================================================================================
 *
 *      -> PC REGISTERS AREA ======================================================================================
 *          -> Stands for Program Counters Register Area and stores the address of the current executing instruction
 *          -> Thread1 -> PC Register -> Current Executing Instruction
 *          -> Every Thread will have its own PC Register and once the instruction is done, the PC Register will be
 *             incremented to the address of the next instruction that should be executed
 *      ===========================================================================================================
 *
 *      -> NATIVE METHOD STACK AREA ================================================================================
 *          -> Thread1 ----> Native Method Stacks is used to store any native method call information.
 *          -> Calls into any other languages such as C and C++ which use the Java Native Interface or JNI
 *          -> Each Thread gets its own Native Method Stacks Area.
 *      ===========================================================================================================
 *  ---------------------------------------------------------------------------------------------------------------
 */
public class JVM {
}
