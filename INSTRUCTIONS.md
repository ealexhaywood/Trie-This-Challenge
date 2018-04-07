# Alex's Java Trie Implementation
This is a trie implementation in Java.  It's a command line app that gives the user options to add, contains, or search the trie.  

### Build Requirements
In order to build and run this program, you will need an installation of:
* Docker

### Building and Running
To build the program and its docker image, first `cd` into the directory in which the Dockerfile is located and run:
```
docker build -t trie-this-challenge .
```

To run the docker image, use interactive mode like so:
```
docker run -it trie-this-challenge
```

Enjoy!