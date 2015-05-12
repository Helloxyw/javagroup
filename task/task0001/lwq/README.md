#task0001
##任务目的
* 带领大家熟悉github study flow
* 练习git命令

##基础练习
[java基础及例子](http://www.tutorialspoint.com/javaexamples/java_environment_setup.htm)

这道练习考察的时一些命令，只需要运行`截图`就好，然后把图片放到README.md里

##String相关方法练习
[知识讲解和例子](http://www.tutorialspoint.com/javaexamples/java_strings.htm)

新建`Java Project`，在里面写自己的代码

<span style="color:red;">注意：</span>
* 基础的包结构`com.dh.*`,*表示自己定义的包

e.g
```shell

└── src
    └── com
        └── dh
            └── task0000
                └── Task000.java

```
把自己的项目文件拷贝到task0001文件下

##任务安排
* 5.11  24.00之前完成`基础练习`并提交
* 5.12 00:00-5.14 24:00完成`String相关方法练习`并提交

#任务完成情况
* compile java file

```shell
adolph@geek:~/document/projects/javagroup/task/task0001/lwq$ ls -al
总用量 20
drwxrwxr-x 2 adolph adolph 4096  5月 11 15:52 .
drwxrwxr-x 3 adolph adolph 4096  5月 11 15:52 ..
-rw-rw-r-- 1 adolph adolph  886  5月 11 15:52 README.md
-rw-rw-r-- 1 adolph adolph  444  5月 11 15:49 Task0001_1.class
-rw-rw-r-- 1 adolph adolph  184  5月 11 15:49 Task0001_1.java
adolph@geek:~/document/projects/javagroup/task/task0001/lwq$ javac Task0001_1.java 
adolph@geek:~/document/projects/javagroup/task/task0001/lwq$ java Task0001_1 
compile java file successfully
```

* set classpath
这个主要是考察命令行中的知识，下来看目录结构
```language
.
├── lwq
│   ├── README.md
│   ├── Task0001_1.class
│   └── Task0001_1.java
└── README.md
```
当前目录在`task0001`下，没有.class文件
```language
java Task0001_1
错误: 找不到或无法加载主类 Task0001_1
```
而这样
```language
java -classpath lwq/ Task0001_1
compile java file successfully
```

* set classpath
java -classpath

* view classpath
```language
echo $CLASSPATH
.:/home/adolph/programs/java/jdk1.8.0_45/lib:/home/adolph/programs/java/jdk1.8.0_45/jre/lib
```

* set destination of the class file?
指定编译文件输出目录
`javac -help`

*  run a class file?
之前的代码已经体现了

* check version of java running on your system?
```language
java -version
java version "1.8.0_45"
Java(TM) SE Runtime Environment (build 1.8.0_45-b14)
Java HotSpot(TM) 64-Bit Server VM (build 25.45-b02, mixed mode)
```

* set classpath when class files are in .jar file?
```language
.
├── lwq
│   ├── JarTest.jar
│   ├── lwq.jar
│   ├── MANIFEST.MF~
│   ├── README.md
│   └── Task0001_1.java
└── README.md
```
此时目录下已经没有.class文件了
```language
java -classpath lwq/lwq.jar Task0001_1
compile java file successfully
```
#总结
把.class文件打包用到了jar命令，先用jar -help 查看帮助，未果，搜索jar用法，大致了解了下。这个命令还是有不少坑的，不知道你们会不会踩到。
