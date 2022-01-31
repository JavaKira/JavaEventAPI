![Release](https://jitpack.io/v/JavaKira/JavaEventAPI.svg)
<h1 align="center">JavaEventAPI</h1>

## purpose of the API

make more comfortable use events without creating bikes.

avoid this not cool realization for event
```java
List<Runnable> runnableList = new ArrayList<>();
runnableList.add((() -> System.out.println("test2")));
runnableList.forEach(Runnable::run);
```

JavaEventAPI provides:

```java
Event event1 = new BasicEvent();
event1.addAction(() -> System.out.println("test2"));
event1.invoke();
```

## adding to project
### maven 
````
<repositories>
        <repository>
            <id>jitpack.io</id>
            <url>https://jitpack.io</url>
        </repository>
</repositories>
    
<dependencies>
        <dependency>
            <groupId>com.github.JavaKira</groupId>
            <artifactId>JavaEventAPI</artifactId>
            <version>1</version>
        </dependency>
</dependencies>
````
### gradle
Step 1. Add it in your root build.gradle at the end of repositories:
````
allprojects {
      repositories {
        maven { url 'https://jitpack.io' }
      }
}
````
Step 2. Add the dependency
```` 
dependencies {
      implementation 'com.github.JavaKira:JavaEventAPI:1'
}
````
