package com.valdal14.Java11Features;

/**
 *  JAVA 11 FEATURES -------------------------------------------------------------------------------------------
 *
 *      -> STRING API UPDATES:
 *          -> isBlank() method
 *
 *             var str = "          ";
 *             System.out.println(str.isBlank()); // true
 *
 *          -> str.lines() method
 *              --> It will split the string where it finds a new line and return a Stream
 *
 *             var newStr = "I'am \n the best programmer \n in my localhost";
 *             Stream<String> newStream = newStr.lines();
 *
 *          -> str.strip() method
 *              -> Support for ANICODE
 *              -> We can also use str.stripLeading() and str.stripTrailing()
 *
 *              char c = '\u2000'; // blank space in unicode
 *              String s = "I am a new string" + c + "there was not space in it";
 *              System.out.println(s);
 *
 *              Note: str.trim() does not suppot ANICODE char and it will not trim the space
 *
 *
 *      -> FILE API UPDATES:
 *          -> Simplify the way we read and write Strings from a file
 *
 *         // Write a String to a File
 *         Path path = Files.writeString(Path.of(FilesAPIUpdates.FILEPATH), "Java 11 new Files API");
 *         System.out.println(path);
 *         // Read the content of the file
 *         String contentOfTheFile = Files.readString(path);
 *         System.out.println(contentOfTheFile);
 *         // We can also create a temp file
 *         Path newTempPath = Files.writeString(Files.createTempFile("newTestFile", ".txt"), "Writing on a temp file");
 *         System.out.println(newTempPath);
 *         String contentofTempFile = Files.readString(newTempPath);
 *         System.out.println(contentofTempFile);
 *
 *      -> isEmpty on Optional
 *          -> Java 11 provides with the new isEmpty() method on the Optional class
 *
 *         // Empty Optional
 *         Optional<String> str = Optional.empty();
 *         // Before Java 11 we have to do...
 *         if(str.isPresent()){
 *             System.out.println("The Optional value is empty");
 *         } else {
 *             System.out.println("The Optional values is: " + str);
 *         }
 *
 *         // In Java 11 we can use the new isEmpty method
 *         System.out.println(str.isEmpty());
 *
 *         // Create an Optional with a value
 *         Optional<Integer> op = Optional.of(123);
 *         System.out.println(op.isEmpty());
 *
 *  -----------------------------------------------------------------------------------------------------------
 */

public class Java11Features {
}
