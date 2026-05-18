# 多态

# 一.面向对象 —— 多态

统一接口的多种形态

### 格式
```java
父类 变量名 = new 子类();
```

## 什么是多态？

同类型的对象，表现出的不同形态。

- 例： Person  类可以表现为  Student 、 Teacher  等不同的子类形态。

## 为什么要使用多态？

### 核心作用
- **统一参数**：所有子类都能使用同一个方法，避免写大量重复代码。
- **提升可扩展性**：新增子类时，无需修改已有方法即可直接使用。

---

### 示例场景
有 `Student`、`Teacher`、`Administrator` 三类，为它们写注册信息的方法：

```java
// 使用父类 Person 作为参数，这里就用到了多态
public static void register(Person p) {
    // 注册信息的通用处理逻辑
}
 
 
 Person p  可以接收传入的  Student 、 Teacher 、 Administrator  等所有子类对象。
```

## 使用多态的前提

多态生效，必须同时满足以下三个条件：

1.  **要有继承 / 实现关系**
    -   子类继承父类，或类实现接口。
2.  **子类要有方法重写**
    -   对父类的方法进行重写，以此来区分不同子类的行为。
3.  **父类引用指向子类对象**
    -   代码格式示例：
        ```java
        Fu f = new Zi();
        ```
        其中 `Fu` 为父类，`Zi` 为子类。

**多态的好处**:

 使用父类类型作为参数，可以接收所有子类对象，代码更简洁、可扩展。

---

## 多态调用成员的特点

### 调用成员变量
**编译看左边，运行也看左边**
- Java 编译时会检查父类中有没有这个变量，没有就编译报错。
- 运行时，实际访问的是父类中定义的变量。

### 调用成员方法
**编译看左边，运行看右边**
- 编译时：检查父类中有没有这个方法，没有就编译报错。
- 运行时：执行的是子类中重写后的方法。

---

### 示例代码
```java
// 父类 Person
class Person {
    String name = "父类的name";
    public void show() {
        System.out.println("父类的show方法");
    }
}

// 子类 Student 继承 Person
class Student extends Person {
    String name = "子类的name";
    @Override
    public void show() {
        System.out.println("子类的show方法");
    }
}

// 多态场景
public class Test {
    public static void main(String[] args) {
        Person p = new Student(); // 父类引用指向子类对象

        // 1. 调用成员变量：编译看左边，运行也看左边
        System.out.println(p.name); 
        // 输出：父类的name

        // 2. 调用成员方法：编译看左边，运行看右边
        p.show(); 
        // 输出：子类的show方法
    }
}
```



---

## 多态的优势和弊端

###  多态的优势
1.  **在多态形式下，父类的引用可以实现解耦合，使用更灵活**
    ```java
    // 父类引用指向子类对象
    Person p = new Student();
    ```
2.  **定义方法时，使用父类类型作为参数，可以接收所有子类对象，体现多态的扩展性与便利**

---

### 多态的缺点
- 因为**编译看左边**，所以父类对象不能直接调用子类特有的功能。

---

### 解决方法：向下转型（强制类型转换）
```java
Animal a = new Dog();
Dog d = (Dog) a; // 向下转型
```

- 说明： a  本质上是  Dog  对象，只有当引用的实际类型和目标类型一致时，才能安全转型。

  

###    **安全转型：使用  instanceof  判断**

   为了避免转型异常，用  instanceof  判断对象的实际类型：

 

```java
// 方法一：标准写法
if (a instanceof Dog) {
    Dog d = (Dog) a;
    d.lookHome();
} else if (...) {
    // 处理其他类型的对象
}

// 方法二：Java 16+ 模式匹配写法（更简洁）
if (a instanceof Dog d) {
    d.lookHome(); // 自动完成转型，无需强转代码
}
```

- 说明： instanceof  会判断  a  是否是  Dog  类（或其子类）的实例，条件成立才执行转型和调用。