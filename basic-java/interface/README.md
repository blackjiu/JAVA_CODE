# 接口 `interface`

---

## 一、什么是接口？

### 接口的定义
- 接口是一种**行为规范/规则**，定义了类需要具备的能力，但不提供具体实现。
- 它解决了“某些不同类的对象，有相同的行为，但无法通过继承实现”的问题。

### 示例场景

`动物类` → 兔子、`青蛙类`、`狗`

Person` → `Student`、`Teacher`

共同行为 `游泳` → 抽象成一个 `游泳接口`，由不同类去实现。

- 青蛙和狗都能游泳，但兔子不能，不能把游泳方法写在共同的父类 `动物类` 里。
- 所以定义一个 `游泳接口`，让需要游泳能力的类去实现这个接口。



---

## 二、接口的定义和使用

- **①使用 `interface` 关键字定义接口。**

  格式：
  ```java
  public interface 接口名 {
      // 抽象方法（JDK 8 之前默认都是 public abstract）
      public abstract void 方法名();
  }
  
  


- ```java
  - 示例：
  
  
  public interface Swim {
      // 游泳接口
      void swim();
  }
  
   
  ```
  
  
  

**② 接口不能实例化**

- 接口不能用  new  关键字直接创建对象，只能被类实现。

 

**③ 接口和类之间的实现关系**

- 类通过  implements  关键字实现接口。

   格式：

- ```java
  
  // 实现单个接口
  public class 类名 implements 接口名 {
      // 必须重写接口中的所有抽象方法
  }
  
  // 同时继承父类并实现多个接口
  public class 类名 extends 父类 implements 接口1, 接口2 {
      // 必须重写所有接口中的抽象方法
  }
  ```
  
  
  

示例：

```java
public class Dog implements Swim {
    @Override
    public void swim() {
        System.out.println("狗刨式游泳");
    }
}
```

 

**④ 接口的子类（实现类）**

实现接口的类，必须：

1. 重写接口中所有的抽象方法；
2. 或者将自身声明为抽象类，把实现责任交给下一代子类。


