场景1：
当一个 Button 需要在不同的情况下实现不同的功能。

解决方法：
在 button 中添加一个 command 属性。这个 command 当做是接口，因此可以有不同的实现方式

扩展：
Button 可以实现多种不同的操作。



场景2：
需要实现一个 undo command

解决方法：
这里不采用 momento 的原因：momento 需要存储许多的 state。但是存储这些 state 会耗费空间。
这里可以使用 command pattern。因为每个 command 都知道 how to undo itself


