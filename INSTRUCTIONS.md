# Alex's Java Trie Implementation
This is a trie implementation in Java.  It's a command line app that gives the user options to add, contains, or search the trie.  

### Build Requirements
In order to build and run this program, you will need an installation of:
* Java 8
* Docker
* Gradle 3.1+

### Building and Running
To build the program and its docker image, first `cd` into the project and run:
```
gradle clean build dockBuild
```

To run the docker image, use interactive mode like so:
```
docker run -i -t trie-this-challenge
```

Enjoy!