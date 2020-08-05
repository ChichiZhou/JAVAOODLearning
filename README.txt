This includes the codes from HeadFirstOOD

参考书籍
Design Patterns - Elements of Reusalble Object-Oriented Software by GoF

包含三种 design pattern：
1.Creational: Different ways to create objects
2.Structure: Relationship between objects
3.Behavioural: Interaction or communication between these objects.


========================================================================================================
引入 interface 的背景：
JAVA 中的 class 之间是 coupled。如果一个 class 改变了，那么与之耦合的其它 class 都需要重新 compile。
如果改变了某个 class 中的方法（比如添加了一个参数，那么其它的与之耦合的class都需要改变）
比如，如果你的车轮子坏了，你只需要换车轮子，而不需要换整个车轴。
所以这里引入了 interface （其实在某些地方如果使用 new 方法，就相当于直接耦合。如果更改了构造器，则需要改变 new 方法
所以有的框架帮你做了，比如 Spring）

Interface 的定义：
A contract that specifies the capabilities that a class should provide.
比如你开了一个餐厅，需要一个厨子。你不需要指定某个特定的人。而是只要能够做饭的，都可以。

在工业代码中，我们使用 dependency injection framework 来实现 interface。目的是，即使一个class 重新编译了，消费这个class 的其它
class不需要重新编译。

========================================================================================================
Abstraction 的定义
Reduce complexity by hiding unnecessary details
比如你有一个遥控器，你想换台。你不需要知道换台的原理是什么，你也不想进行过多操作。你想做的是直接按一个按钮，然后换台。

========================================================================================================
多态的意义在于和继承的结合
如果参数是父类，那么也可以接受子类。所以某个类型可以变化成不同的多种类型。
========================================================================================================

UML
composition: 一个class 需要另一个 class 才能构建（这里强调构建！！！）
dependency: 一个class 的创建不需要另一个 class，但是在某个method中可能需要这个class的reference （一个class是另一个class中method的 parameter）
========================================================================================================
原则：
单一目的（single responsibility）：一个class 只干一件事。这里的干一件事，指的是只实现一个logic 的代码。
对扩展开放，对修改关闭：如果你改变一个 class，那么所有的改变仅限于这个 class，不能牵扯到别的 class。
========================================================================================================


