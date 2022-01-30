<h1 align="center">JavaEventAPI</h1>

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
      implementation 'com.github.JavaKira:JavaEventAPI:Tag'
}
````
