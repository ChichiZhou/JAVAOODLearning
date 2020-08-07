State 用于避免重复代码。这里的 State 指的是 Tool 的不同 state

场景：
我们想要 canvas performance different depends on different tool

解决方式：
采用多态

扩展：
可以创建更多的 tool，只要是实现这个 interface 即可

和 strategy pattern 是区别是:
strategy pattern 有很多个不同的 interface，而 state pattern 只有一个 interface
