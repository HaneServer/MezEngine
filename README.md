# Minecraft Easy Engine
ゲームを簡単に実装するためのライブラリ

## 簡単な説明
Spigotで開発するゲームを楽にするライブラリ

## 必要要件

- OpenJDK 17
- Maven 3.2.4 (Build時に使用します)
- ※Jarを動かすのみ場合はOpenJDK 17のみで結構です。

## 使い方

* Maven
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.HaneServer</groupId>
        <artifactId>MezEngine</artifactId>
        <version>VERSION</version>
    </dependency>
</dependencies>
```

* Gradle
```gradle
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
	implementation 'com.github.HaneServer:MezEngine:Tag'
}
```

## Examples
* 実行
```java
List<MezThread.Flows> flowsList = new ArrayList<>(); // Listを設定する
flowsList.add(new MezThread.Flows(new Start(), true)); // Listに実行クラスをadd
flowsList.add(new MezThread.Flows(new Wait(10000), true)); // Wait(ms)で待機が可能
flowsList.add(new MezThread.Flows(new End(), true)); // Listに実行クラスをadd
new MezEngineCore().run(flowsList); // Listを挿入した順番で実行
```
* 実行クラス
```java
public class Start implements Flow {
    @Override
    public void run() {
        Bukkit.broadcastMessage("GameStart!");
    }
}
```

## Jarビルド方法

```
$ git clone https://github.com/HaneServer/MezEngine/
$ cd MezEngine
$ mvn clean package install
```

## 開発者

[@massa_san_](https://twitter.com/massa_san_)

## ライセンス

MIT LICENSE