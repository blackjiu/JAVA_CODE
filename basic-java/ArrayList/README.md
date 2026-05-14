# ArrayList

---

## ArrayList 简介
- 软件包：`java.util`
- 定义：会自动增长/变长的数组，也叫**动态数组 / 集合**

---

## 1. 集合和数组的对比

### ① 长度
- **数组**：长度是固定不可变的
- **集合**：长度是可变的

### ② 存储类型
- **数组**：可以存基本数据类型，也可以存引用数据类型
- **集合**：**只能存引用数据类型**
  > 注意：如果集合要存“基本数据类型”，需要变成**包装类**（如 `int` → `Integer`）

---

## 2. 创建集合

### 格式

ArrayList<E> 变量名 = new ArrayList<>();

```java
注意事项
1.  ArrayList  是 Java 写好的类，底层已经做了处理。
2. 打印集合时，输出的不是地址，而是集合中存储的数据内容。
3. 输出时，会自动用  []  把所有的数据包裹起来。
      
例子：
// 创建一个只能存字符串的 ArrayList
ArrayList<String> list = new ArrayList<>();
System.out.println(list); // 输出：[]
 
 

 


```

---

## 泛型 `<E>`

###  `<E>` 到底是什么意思？
- `E = Element`（元素），表示：**这个集合里要装什么类型的东西，由你自己来定**。
- 示例：`ArrayList<String>` 表示：这个集合**只能装字符串**。

###  泛型 `<E>` 的限制
`<E>`：只能放**引用数据类型**。

---

## 包装类（基本数据类型 → 引用数据类型）
因为集合只能存引用数据类型，要存基本数据类型，必须用对应的包装类：

| 基本数据类型 | 包装类      |
| ------------ | ----------- |
| `int`        | `Integer`   |
| `double`     | `Double`    |
| `boolean`    | `Boolean`   |
| `char`       | `Character` |

##  ArrayList 成员方法（常用）

### ① 添加元素 `add()`

- 方法：`boolean add(E e);`
- 返回值：`boolean` 类型，表示是否添加成功。
- 示例：
  ```java
  ArrayList<String> list = new ArrayList<>();
  list.add("aaa");
  list.add("bbb");
  System.out.println(list); // 输出：[aaa, bbb]
  
  boolean re = list.add("ccc");
  System.out.println(re);    // 输出：true
  System.out.println(list);  // 输出：[aaa, bbb, ccc]

 

### ② 删除元素  remove() 

有两种重载形式：

1.  boolean remove(Object o); ：删除指定元素，返回是否删除成功。
2.  E remove(int index); ：删除指定索引的元素，返回被删除的元素。

- ```
  示例1：按元素删除
  
  ArrayList<String> list = new ArrayList<>();
  list.add("aaa");
  list.add("bbb");
  
  boolean re = list.remove("aaa");
  System.out.println(re);    // 输出：true
  System.out.println(list);  // 输出：[bbb]
  
   示例2：按索引删除
  
  ArrayList<String> list = new ArrayList<>();
  list.add("aaa");
  list.add("bbb");
  
  String str = list.remove(0);
  System.out.println(str);  // 输出：aaa
  System.out.println(list);  // 输出：[bbb]
  ```

  

 

### ③ 修改元素  set() 

- 方法： E set(int index, E element); 
- 作用：修改指定索引位置的元素。
- 返回值：被修改的旧元素。
- 示例
  

```
ArrayList<String> list = new ArrayList<>();
list.add("aaa");
list.add("bbb");

String old = list.set(0, "eee");
System.out.println(old);   // 输出：aaa（被替换掉的旧值）
System.out.println(list);  // 输出：[eee, bbb]
```

 

### ④ 查询元素  get() 

- 方法： E get(int index); 
- 作用：根据索引获取元素。
- 示例：
  

```
ArrayList<String> list = new ArrayList<>();
list.add("aaa");
list.add("bbb");

String s = list.get(1);
System.out.println(s); // 输出：bbb

 
```

### ⑤ 获取长度  size() 

- 方法： int size(); 
- 作用：获取集合中元素的个数。
- 示例：
  

```
ArrayList<String> list = new ArrayList<>();
list.add("aaa");
list.add("bbb");

int len = list.size();
System.out.println(len); // 输出：2
```

---

## 遍历 ArrayList集合（for 循环）

### 示例代码
```java
// 1. 创建并添加元素
ArrayList<String> list = new ArrayList<>();
list.add("aaa");
list.add("bbb");

// 2. 用 for 循环遍历
for (int i = 0; i < list.size(); i++) {
    String str = list.get(i);
    System.out.println(str);
}
```





## 基本数据类型对应的包装类

### 对应关系表
| 基本数据类型 | 包装类      |
| ------------ | ----------- |
| `byte`       | `Byte`      |
| `short`      | `Short`     |
| `char`       | `Character` |
| `int`        | `Integer`   |
| `long`       | `Long`      |
| `float`      | `Float`     |
| `double`     | `Double`    |
| `boolean`    | `Boolean`   |

---

### 核心说明
- 包装类属于**引用数据类型**。
- 集合（如 `ArrayList`）只能存储引用数据类型，因此要存储基本数据类型，必须使用对应的包装类。

---

### 代码示例
```java
// 存储 int 类型，使用 Integer 包装类
ArrayList<Integer> list1 = new ArrayList<>();
list1.add(1);  // 自动装箱：int → Integer

// 存储 char 类型，使用 Character 包装类
ArrayList<Character> list2 = new ArrayList<>();
list2.add('a'); // 自动装箱：char → Character