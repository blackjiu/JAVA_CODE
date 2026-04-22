#  一.继承（extends）

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

# 二.继承的练习(自设计一个体系) 画图法

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

# 三.extend 2

---

## 一、子类到底能继承父类中哪些内容？

### 1. 构造方法
无论是否私有，**都不能被继承**，但可以通过 `super()` 调用。

### 2. 成员变量
- **非私有（public / protected / default）**：可以被继承，子类可直接访问。
- **私有（private）**：逻辑上被继承，但语法上不能直接访问，可通过父类提供的 `get/set` 方法间接访问。

### 3. 成员方法
只有父类中的**虚方法**才能被继承

> 虚方法表：父类中 **非 private、非 static、非 final** 的方法，才能被子类继承。



---

## 二、继承中成员变量的访问特点

### 核心原则：就近原则
查找顺序：**局部变量 → 本类成员变量 → 父类成员变量（向上查找）**

### 代码示例
```java
// 父类
public class Fu {
    String name = "Fu";
}

// 子类
public class Zi extends Fu {
    String name = "Zi";

    public void ziShow() {
        String name = "ziShow";
        
        System.out.println(name);      // ① 局部变量：输出 ziShow
        System.out.println(this.name); // ② 本类成员变量：输出 Zi
        System.out.println(super.name);// ③ 父类成员变量：输出 Fu
    }
}
```

---

## 三、继承中成员方法访问特点

### 核心原则：就近原则
**谁离我近，我就用谁**。
- 方法调用时，优先在当前类中查找方法；
- 如果当前类中找不到，再向上到父类中查找。

### 访问父类方法：`super` 调用
- 使用 `super.方法名()` 可以明确访问父类中的方法。
- 示例：
  ```java
  super.eat(); // 调用父类的 eat() 方法





# 四.继承中方法重写

> 方法重写：出现在**继承关系**中。

### 1. 方法重写的定义
当父类的方法不能满足子类现在的需求时，需要对方法进行**方法重写**。

### 2. 书写格式
在继承体系中，子类出现了和父类中**一模一样**的方法声明，我们就称子类这个方法是重写方法。

### 3. `@Override` 重写注解

> 好处：
> - 明确表明该方法是重写，而不是子类新增方法，让代码逻辑更清晰。
> - 如果子类写的这个方法于父类不一样，编译器直接报错，避免开始发者写出错误代码。

- 放在重写方法上，**校验子类重写时语法是否正确**。
- 加上注解后如果有红色波浪线，表示语法错误。
- 建议重写方法都加上 `@Override` 注解，代码更安全。

---

### 示例代码
```java
// 父类 Person
class Person {
    public void eat() {
        System.out.println("吃饭");
    }

    public void drink() {
        System.out.println("喝水");
    }
}

// 子类 OverseasStudent 继承 Person
class OverseasStudent extends Person {
    @Override
    public void eat() {
        // 方法重写：扩展/修改了学生的吃喝方式
        System.out.println("吃意面");
    }

    @Override
    public void drink() {
        System.out.println("喝奶茶");
    }
}
 
 
 
 
方法重写的本质
 
方法重写的本质就是覆盖了父类里的方法。
 
- 子类把父类的方法给覆盖了；
- 如果还想使用父类的原方法，需要用  super.方法名()  调用。
 
```

我把这页笔记也按 Typora 风格的 Markdown 格式整理好了，你可以直接复制进  .md  文件里：

markdown

# 五.方法重写注意事项和重写要求

### 方法重写的注意事项和要求
1.  建议：重写的方法尽量和父类保持一致。
2.  只有**非 private、非 static、非 final** 的方法才能被重写。
3.  重写方法的名称、形参列表必须与父类一致。
4.  子类重写父类方法时，子类访问权限 ≥ 父类（权限顺序：` 空着不写< protected < public`）。
5.  子类重写父类方法时，子类返回类型 ≤ 父类返回类型（例如父类返回 `Object`，子类可以返回 `String`；父类返回 `void`，子类也必须返回 `void`）。

---

### 示例：利用方法重写设计继承结构
#### 场景描述
三种动物分别有以下行为：
- 哈士奇：吃饭（吃狗粮）、喝水、看家、拆家
- 沙皮狗：吃饭（吃狗粮、吃骨头）、喝水、看家
- 中华田园犬：吃饭（吃剩饭）、喝水、看家

#### 设计思路
- 画图：**从下往上抽取共性**，先看子类有什么共性，再提炼出父类。
- 写代码：**从上往下写**，先写父类，再写子类并根据需要重写方法。

#### 继承结构示意图（文字版）
```text
          动物
     吃饭、喝水、看家
      /      |      \
  哈士奇   沙皮狗   中华田园犬
拆家     吃骨头    吃剩饭
 
 
代码实现示例
 
java
  
// 父类：动物
class Animal {
    public void eat() {
        System.out.println("吃饭");
    }

    public void drink() {
        System.out.println("喝水");
    }

    public void watchHouse() {
        System.out.println("看家");
    }
}

// 子类：哈士奇
class Husky extends Animal {
    @Override
    public void eat() {
        System.out.println("吃狗粮");
    }

    @Override
    public void watchHouse() {
        System.out.println("看家，但拆家更在行");
    }

    // 哈士奇特有的方法
    public void breakHouse() {
        System.out.println("拆家");
    }
}

// 子类：沙皮狗
class SharPei extends Animal {
    @Override
    public void eat() {
        System.out.println("吃狗粮、吃骨头");
    }
}

// 子类：中华田园犬
class ChineseRuralDog extends Animal {
    @Override
    public void eat() {
        System.out.println("吃剩饭");
    }
}
 
