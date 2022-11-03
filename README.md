# The Calculator

[![Java Language](https://img.shields.io/badge/language-Java-3A75B0.svg?logo=OpenJDK)][1]
[![JVM Platform](https://img.shields.io/badge/platform-JVM-6C93B8.svg?logo=IntelliJIDEA)][2]
[![JUnit5 Testing Framework](https://img.shields.io/badge/testing%20framework-JUnit5-26A162.svg?logo=JUnit5)][3]
[![Maven Dependency Manager](https://img.shields.io/badge/dependency%20manager-Maven-AA215A.svg?logo=ApacheMaven)][4]

A simple project to practice writing JUnit 5 tests.

This short guide describes:

- [Prerequisites][5]
- [Development Setup][6]
- [JUnit 5 Exercise][7]

## Prerequisites

This starter project uses the [Java][1] programming language.

Before getting started, ensure you have Java 17 LTS (or higher) installed locally. The following commands should output the version of Java installed.

```bash
$ javac -version

javac 17.0.4
```


```bash
$ java -version

openjdk version "17.0.4" 2022-07-19 LTS
OpenJDK Runtime Environment Zulu17.36+13-CA (build 17.0.4+8-LTS)
OpenJDK 64-Bit Server VM Zulu17.36+13-CA (build 17.0.4+8-LTS, mixed mode, sharing)
```


## Development Setup

Clone this repository locally, then create a branch to work on.

```bash
git clone git@github.com:CodingBlackFemales/the-calculator.git
cd the-calculator
git checkout -b ${your-branch-name}
```


#### <u>Install dependencies</u>

Next, install the project dependencies and validate your project by running the following command at the root of your project:

```bash
./mvnw clean validate
```

If you are on a Windows machine, that will be:

```bash
mvnw clean validate
```

You should see the following console output:

```bash
$ ./mvnw clean validate

[INFO] Scanning for projects...
[INFO] 
[INFO] --------------< com.codingblackfemales:the-calculator >-----------------
[INFO] Building the-calculator 1.0.0
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:3.2.0:clean (default-clean) @ the-calculator ---
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.155 s
[INFO] Finished at: 2022-11-03T20:56:09Z
[INFO] ------------------------------------------------------------------------

```

## Practice

#### Exercise 1

Write tests to ensure the Calculator can multiply two numbers. \
Think of all possible scenarios, and write a test for each of the scenarios.

#### Exercise 2

Write tests to ensure the Calculator can divide two numbers.\
Think of all possible scenarios, and write a test for each of the scenarios.\
One of the scenarios should encover a flaw in the Calculator implementation.

#### Exercise 3
Add more scenarios to cover the Calculator’s addition and subtraction functionalities.

Enjoy working on your exercise! :smiley:


[1]: https://www.java.com/en/download/help/whatis_java.html
[2]: https://www.ibm.com/cloud/blog/jvm-vs-jre-vs-jdk
[3]: https://junit.org/junit5/
[4]: https://maven.apache.org/
[5]: #prerequisites
[6]: #development-setup
[7]: #practice
