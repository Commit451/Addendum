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
    compile 'com.github.Commit451.Addendum:addendum:latest.version.here'
    //for design support library
    compile 'com.github.Commit451.Addendum:addendum-design:latest.version.here'
    //for RecyclerView support
    compile 'com.github.Commit451.Addendum:addendum-recyclerview:latest.version.here'
    //for Parceler support
    compile 'com.github.Commit451.Addendum:addendum-parceler:latest.version.here'
}
```

## Addendum
The general set of extensions. Covers the base framework and `app-compat`

### Activity
```kotlin
//bind a view in a lazy way, like KotterKnife
val text: TextView by bindView(R.id.first_name)
//or
val text by bindView<TextView>(R.id.first_name)
//get from intent extras
val someString by extra<String>(KEY_STRING)
//toggle fullscreen
flagFullscreen()
val screenHeight = screenHeight()
val screenWidth = screenWidth()
//set screen brightness
brightness()
```

### Context
```kotlin
val color = color(R.color.black)
copyToClipboard("A label", someString)
```

### Fragment
```kotlin
//bind a view in a lazy way, like KotterKnife
val text: TextView by bindView(R.id.first_name)
```

### Intent
```kotlin
//for when it can be null, no needed hasValue check
val someInt = intent.getIntExtra("some_key")
val someFloat = intent.getFloatExtra("float_key")
val someLong = intent.getLongExtra("long_key")
val someDouble = intent.getDoubleExtra("double_key")
```

### String
```kotlin
val span = someHtmlString.htmlToSpanned()
```

### View
```kotlin
view.setHeight(somePixelValue)
//sets view to visible
view.visible()
view.invisible()
view.gone()
//bind a view in a lazy way, like KotterKnife
val text: TextView by bindView(R.id.first_name)
```

### ViewPager
```kotlin
viewPager.back()
viewPager.forward()
val isLast = viewPager.isOnLastPage()
val isFirst = viewPager.isOnFirstPage()
```

## Addendum Design
For the design support library

### TextInputLayout
```kotlin
//Sets the error if empty, returning true if not empty
val valid = textInputLayout.validateEmpty("Empty not allowed")
val text = textInputLayout.text()
```

## Addendum Parceler
For use with [Parceler](https://github.com/johncarl81/parceler)
```kotlin
val item = intent.getParcelerParcelableExtra("some_key")
intent.putParcelerParcelableExtra("some_key", thing)
val otherItem = bundle.getParcelerParcelableExtra("some_key")
bundle.putParcelerParcelable("some_key", thing)
```

## Addendum RecyclerView
For use with RecyclerView

### ViewHolder
```kotlin
//within a view holder...
val string = resources().getString(R.string.some_string)
val context = context()
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
