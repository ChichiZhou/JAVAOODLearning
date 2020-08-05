场景：
undo mechanisms
需要能够记录或者返回之前的操作

解决方法：
创建一个 state class 来表示 editor 的state => 因此 editor 的内容可以进行扩展。（只需扩展 state 的 field 即可）
创建一个 history 来表示对 editor 的操作 => 因此可以实现 single responsibility 原则（一个 class 只做一件事）

扩展情况：
此时 field 只有 content，如果在 field 中添加别的 String，比如 title,
则只需改变 editor 和 state。
不需要创建新的 list
