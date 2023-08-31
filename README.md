# Testing project for single module application builds

This project has three features A, B and C and all of these features are packed in a single `app` module.

Since every feature is part of the same module, they can navigate to each other easily by directly calling the features' activity. 

Here are some build scans for different test cases:

* [Clean build](https://scans.gradle.com/s/e2sa2jbwyrrta/timeline)
* [Incremental build with no change](https://scans.gradle.com/s/hok44mk2qei2y/timeline)
* [Incremental build with a new text addition to Feature C](https://scans.gradle.com/s/fl2nn5jyhq4wi/timeline)
* [Incremental build with a new text addition to App module](https://scans.gradle.com/s/kntbswif7673a/timeline)
