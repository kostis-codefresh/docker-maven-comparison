# Using Docker from Maven and Maven from Docker

[Codefresh status](http://codefresh.io): [![Codefresh build status]( https://g.codefresh.io/api/badges/build?repoOwner=kostis-codefresh&repoName=docker-maven-comparison&branch=master&pipelineName=basic&accountName=kostis-codefresh&type=cf-2)]( https://g.codefresh.io/repositories/kostis-codefresh/docker-maven-comparison/builds?filter=trigger:build;branch:master;service:5b17f311f38e9275624153a3~basic)

This repository holds the code mentioned in the Codefresh blog post "Using Docker from Maven and Maven from Docker"

It is consists of 4 individual projects mentioned in the article

1. A Java project that uses the [Maven spotify plugin](01-using-spotify-plugin/pom.xml#L184)
1. A Java project that uses the [Fabric8 Maven plugin](02-using-fabric8-plugin/pom.xml#L183) (also runs integration tests)
1. A Java project with a [Multi-stage dockerfile](03-multistage/Dockerfile) that runs Maven from within Docker
1. The same multi-stage Java projects with a [YAML build file for Codefresh](codefresh.yml)






