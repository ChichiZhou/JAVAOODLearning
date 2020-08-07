场景：
当需要不断添加新的 operation 的时候，需要对每个 class 都添加相同的操作。这样就需要在多个 class 中添加新的方法，会增大工作量

解决方法：
把 operation 作为一个单独的类。对于每一个 class，这个 operation 会有不同的操作。（主体逆转）

扩展：
可以添加更多的 operation
但是不把 Operation 当做是构造器的内容
