package com.valdal14.iostreams;

/**
 *  IO STREAMS (FILE IO) ----------------------------------------------------------------------------------------
 *
 *  -> A Stream is a logical handle to an input source in which can read or write data
 *  -> Usually a Stream has its own INPUT and OUTPUT classes
 *  -> Java supports the followings: package java.io
 *      --> ByteStreams
 *          -> Read and Write 1 byte at the time
 *          -> Used to Read and Write binary data
 *          -> Important Classes of ByteStreams are:
 *              --> InputStream  --> Abstract class FileInputStream
 *              --> OutputStream --> Abstract class FileOutputStream
 *      --> CharactersStreams
 *          -> uses UNICODE (in Java 2 bytes) so 1 char Read and Write at the time
 *          -> Used to read textual data
 *          -> Important Classes of CharactersStreams are:
 *              --> Reader --> Abstract class FileReader
 *              --> Writer --> Abstract class FileWriter
 *              --> File (Which is not a Stream but acts like an handle to the underline File or Folder on our PC)
 *              --> Throws checked exception such as FileNotFoundException or IOException that we need to handle it
 *      --> BufferedStreams
 *          -> Wrappers for ByteStreams and CharactersStreams
 *          -> Allow us to read more data at the time
 *      --> ObjectStreams
 *          -> Allow us to Read and Write Objects
 *          -> File System or Networks (serialization)
 *
 * -> String Tokenizer:
 *      -> Allows us to break a String into multiple tokens
 *      -> import java.util.StringTokenizer;
 *
 * -> SERIALIZATION (How to Serialize and De-Serialize Objects) -------------------------------------------------
 *
 *  -> Serialization is the process of writing an Object into a Stream. File Stream or Network Stream
 *  -> For an Object to be serialized its class should implements the Serializable Interface
 *      --> class Person implements Serializable
 *      --> This is a MARKER INTERFACE
 *              --> A Marker Interface is an interface without any methods
 *      --> Just gives the permission to the JVM to serialize the Object
 *      --> If we do not want a field to be serialized we mark it with the transient keyword:
 *              class Person implements Serializable {
 *                  int id;
 *                  String name:
 *                  double salary;
 *                  transient int ssn; // this will not be serialized
 *              }
 *       --> When the serialization happen the field marked as transient will not be returned
 *   -> We use the ObjectOutputStream to write and Object and ObjectInputStream to read it
 *   -> Writing an Object is called Serialization while Reading it is called De-Serialization
 *   -> This process or serializing and de-serialising can happen on the same machine or different machines
 *   -> Very popular when RMI (Remote Method Invocation) or EJB (Enterprice Java Beans) were very popular
 *   -> Nowadays we see more JMS or Java Message Service to accomplish Serialization and de-serialization
 *  -------------------------------------------------------------------------------------------------------------
 */
public class IOStreams {
}
