# Sangria akka-http Library

![Continuous Integration](https://github.com/sangria-graphql/sangria-akka-http/workflows/Continuous%20Integration/badge.svg)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.sangria-graphql/sangria-akka-http-core_2.13/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.sangria-graphql/sangria-akka-http-core_2.13)
[![License](http://img.shields.io/:license-Apache%202-brightgreen.svg)](http://www.apache.org/licenses/LICENSE-2.0.txt)
[![Join the chat at https://gitter.im/sangria-graphql/sangria](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/sangria-graphql/sangria?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)


A reference, batteries included, [Sangria](https://github.com/sangria-graphql/sangria) [GraphQL](https://graphql.org) 
server implementation using [akka-http](https://github.com/akka/akka-http).

Various json libraries are supported:
- [circe](https://github.com/circe/circe)
- ???
- PRs adding the json library of your choice welcome

## Getting started

Add this to your dependencies:
```sbt
libraryDependencies += "org.sangria-graphql" %% "sangria-akka-http-core" % "2.0"
// And choose your desired json library support:
libraryDependencies += "org.sangria-graphql" %% "sangria-akka-http-circe" % "2.0"
```

```scala
include magic

val server = ???
```

For a full example, consult the [Sangria Akka Http example project](https://github.com/sangria-graphql/sangria-akka-http-example).
 
## Building
TODO: write

## Contributing
TODO: write
