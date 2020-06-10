(1)synchronized与Lock的区别
   synchronized是java关键字，而Lock是一个接口
   synchronized获取锁和释放锁都是隐示的，而Lock获取锁/释放锁都是显示的
   synchronized是非公平锁，Lock默认是公平锁
   当有多个线程的时候，Lock的执行效率远远比synchronized高
(2)java中length()和length的区别
   length是数组的属性；而length()是字符串的方法
(3)jsp的9个隐士对象：application、config、exception、out、page、pageContext、request、reponse、session
(4)java中常见运算符
   && 、 ||、  !、  ^、  &、  |、   ~    >>、  << 、  >>>
(5)字符串拼接的方法
(6)String a = new String(“1”+”2”)最终创建了几个对象？(对new关键字的分析)
(7)indexOf方法的使用
(8)线程的五种状态：创建、就绪、运行、阻塞、死亡