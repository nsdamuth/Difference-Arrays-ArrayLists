# Difference-Arrays-ArrayLists

## Credits
Stefan Karlsson for the ObjectSizeFetcher object to wrap the java Instrumentation package
Source - https://stackoverflow.com/a/52682

---
## Description
This project prints out the three key differences between Arrays and ArrayList in Java. 
- Memory addressing
- Memory usage
- Modification

The third display will perform edits to the Array and Arraylist objects, then re-run the previous two methods.

---
## Compile

### 1. Compile the ObjectSizeFetcher as a jar
jar cmf MANIFEST.MF ObjectSizeFetcherAgent.jar ObjectSizeFetcher.class

### 2. Compile the DifferenceArrayArrayLists program
javac DifferenceArraysArrayLists.java


## Running

### 1. Run with the ObjectSizeFetcherAgent jar passed
java -javaagent:ObjectSizeFetcherAgent.jar DifferenceArraysArrayLists

