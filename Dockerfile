FROM anapsix/alpine-java:8
ADD build/libs/Trie-This-Challenge.jar /
WORKDIR /
CMD ["java", "-cp", "Trie-This-Challenge.jar", "com.captivation.trie.TrieThisChallenge"]
