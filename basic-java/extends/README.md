#  继承（extends）

## 👨‍🏫 案例：Person 类继承
这是我在学习继承时的练习。
- 父类：`Person`（姓名，年龄，吃饭，set/get）
- 子类：`Student`（学习）、`Teacher`（教书）

> 感悟：因为student和teacher都具有姓名，年龄，吃饭和get/set方法所以可以把共性放在父类

---

## 继承的适用场景
类与类之间，存在相同（共性）的内容，并满足子类是父类中的一种，就可以考虑使用继承，来优化代码。
- 示例：学生和老师都是人的一种

## 继承的格式
```java
public class 子类 extends 父类 {

}
```





## 继承好处

可以把多个子类中重复的代码抽取到父类中，提高代码复用性。

## 继承后子类特点

子类可以得到父类的属性和行为，子类可以使用
子类可以在父类的基础上新增其他功能，子类更强大。

## 继承的特点

Java支持单继承，不支持多继承，但支持多层继承

- 一个儿子只有一个父亲，不能有多个父亲

多层继承

子类A继承父类B，父类B可以继承父类C

- 包含直接父类、间接父类

- 父类提供了子类的属性和行为的复用

> 每个类直接或间接继承 Object 类。

1. 在Java里， Object 是所有类的根类（老祖宗）

2. 在定义一个类时，如果没有写任何 extends ，Java默认帮你加上 extends Object 
那么这个类就是直接继承 Object 类

**直接继承 示例**

// 没有写extends，默认直接继承Object

```
class Person{...}
```

 **间接继承 实例**

// 父类Person直接继承Object

```
`class Person{...}`
```

// 子类Student继承Person，间接继承Object

```
class Student extends Person{...}
```

markdown

# 继承的练习(自设计一个体系) 画图法

## 一、案例背景
现有四种动物：布偶猫、中国狸花猫、哈士奇、泰迪
暂不考虑属性，只考虑行为。
请按照继承的思想进行体系结构的设计。

### 四种动物的行为
- 布偶猫：吃饭、喝水、抓老鼠
- 中国狸花猫：吃饭、喝水、抓老鼠
- 哈士奇：吃饭、喝水、看家、拆家
- 泰迪：吃饭、喝水、看家、蹭一蹭

## 二、画图法设计思路
### 核心规则
1. 🔽 下面是子类，🔼 上面是父类
2. ⬆️ 从下往上画图：先写具体类(子类)，再把它们的共性行为往上抽到父类
3. 核心：共性内容抽取，子类是父类的一种

### 体系结构图示
```text
        动物(Animal)
       （吃饭、喝水）
             /    \
            /      \
      猫(Cat)      狗(Dog)
  （吃、喝、抓鼠） （吃、喝、看家）
     /      \          /    \
   布偶猫  狸花猫    哈士奇  泰迪
 
 
三、书写代码规范
 
代码书写顺序
 
① ⬇️ 从上往下写代码：先写顶层父类  Animal ，再写  Cat/Dog ，最后写具体种类
 
1. 顶层父类：Animal
 
java
  
class Animal {
    // 共性方法：吃饭、喝水
    public void eat() {
        System.out.println("吃饭");
    }
    public void drink() {
        System.out.println("喝水");
    }
}
 
 
2. 中间抽象父类：Cat / Dog
 
java
  
// 猫类：继承Animal
class Cat extends Animal {
    // 猫的特有行为
    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}

// 狗类：继承Animal
class Dog extends Animal {
    // 狗的特有行为
    public void lookHome() {
        System.out.println("看家");
    }
}
 
 
3. 具体子类：布偶猫、狸花猫、哈士奇、泰迪
 
java
  
// 布偶猫：继承猫类
class Ragdoll extends Cat {
    // 可扩展特有行为（如无特殊行为可留空）
}

// 中国狸花猫：继承猫类
class LiHua extends Cat {
    // 可扩展特有行为（如无特殊行为可留空）
}

// 哈士奇：继承狗类
class Husky extends Dog {
    // 特有行为
    public void destroyHome() {
        System.out.println("拆家");
    }
}

// 泰迪：继承狗类
class Teddy extends Dog {
    // 特有行为
    public void rub() {
        System.out.println("蹭一蹭");
    }
}
```

## 四、核心总结

1. 继承原则：子类复用父类代码，子类是父类的一种具体实现
2. 设计顺序：先分析具体类共性 -> 抽取父类 -> 子类继承父类扩展特有行为
3. 代码顺序：先敲父类，在敲子类（顶层父类 -> 中间父类 -> 具体子类）
