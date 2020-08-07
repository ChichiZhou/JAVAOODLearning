场景：
多个 object 之间需要相互交流。
如果直接把别的 object 当做构造函数放进去，则会使得 object 变得很复杂

解决方式：
把所有 object 之间的交流放到一个独立的 object 中。
所有 object 都是基于这个 dialog object 生成的

扩展：
可以生成更多的 object，object 之间可以有更多的复杂的交流

构造器？
在初始化的时候，除了执行构造器，还会对 field 进行初始化？？？？？？？？？？？？？？
