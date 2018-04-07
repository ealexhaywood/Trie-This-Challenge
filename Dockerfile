FROM gradle:jdk8-alpine
USER root

# Update apk manager and install git
RUN apk update && \
    apk add git

# cd to /
WORKDIR /

# Clone the project
RUN git clone https://github.com/ealexhaywood/Trie-This-Challenge.git

# cd to the project
WORKDIR /Trie-This-Challenge

# build it
RUN gradle clean build

# run it
CMD ["java", "-cp", "build/libs/Trie-This-Challenge.jar", "com.captivation.trie.TrieThisChallenge"]
