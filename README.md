# Addendum
The best Kotlin Extensions for Android

[![Build Status](https://travis-ci.org/Commit451/Addendum.svg?branch=master)](https://travis-ci.org/Commit451/Addendum) [![](https://jitpack.io/v/Commit451/Addendum.svg)](https://jitpack.io/#Commit451/Addendum)

## Gradle Dependency
Add the jitpack url to the project:
```groovy
allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}
```
then, in your app `build.gradle`
```groovy
dependencies {
    compile 'com.github.Commit451.Addendum:addendum:latest.version.here@aar'
    //for design support library
    compile 'com.github.Commit451.Addendum:addendum-design:latest.version.here@aar'
    //for RecyclerView support
    compile 'com.github.Commit451.Addendum:addendum-recyclerview:latest.version.here@aar'
    //for [Parceler](https://github.com/johncarl81/parceler) support
    compile 'com.github.Commit451.Addendum:addendum-parceler:latest.version.here@aar'
}
```


License
--------

    Copyright 2017 Commit 451

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
