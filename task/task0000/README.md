#task0000
##任务目的
* 带领大家熟悉github study flow
* 练习git命令

##start
task0000下新建文件夹，以自己的名字缩写命名
编写Demo.java文件，输出Hello World
push 到自己的仓库
编写README.md，介绍一下自己的问题或者收获什么的

##如何提交？
>以task0000 王钰作为例子

```flow
st=>start: Start
e=>end: End
op1=>operation: fork adolphlwq/javagroup(注意是否是最新提交的)
op2=>operation: cd task0000
op3=>operation: 查看`README.md`,了解任务
op4=>operation: 新建文件夹`wy`（王钰名字的缩写）
op5=>operation: cd my
op6=>operation: 完成任务
op7=>operation: 将完成的文件放到`wy`文件夹下
op8=>operation: 在`wy`文件夹下编写README.md文件(参考lwq文件下的格式)
op9=>operation: 执行git操作，将代码push到自己的项目上
op10=>operation: github查看项目是否有问题
op11=>operation: pull request
op12=>operation: lwq检查PR(pull request是否合理)
cond=>condition: Yes or No?
op13=>operation: no problem,merge request
op14=>operation: 修改，重新PR

st->op1->op2->op3->op4->op5->op6->op7->op8->op9->op10->op11->cond
cond(yes)->op13->e
cond(no)->op14->op11
```

