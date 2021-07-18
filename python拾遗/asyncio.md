## asyncio

```python
import asyncio


# 使用async表达式、即使不包含await表达式也是一个协程函数
# 与常规生成器类似，协程函数调用时会返回一个coroutine对象
async def hello():
    print("hello world")
    # 新语法中await代替yield from
    r = await asyncio.sleep(1)
    print("hello again")
 #任务
    #一个协程可以如下封装成一个task
    task=asyncio.create_task(hello())
    asyncio.run(task)

if __name__ == '__main__':
    # #获取eventLoop
    # loop=asyncio.get_event_loop()
    # #执行coroutine
    # loop.run_until_complete(hello())
    # loop.close()

    # 在python3.7之后，使用run即可处理创建事件、
    # 添加写成对象到事件循环、关闭事件循环

    asyncio.run(hello())
    #run的对象是一个可等待对象，有三类：协程、任务、未来对象Future


#使用asyncio框架，本质上是一个开启事件循环，事件循环对应的实例提供了注册、取消、执行
#回调等方法，方便控制整个事件循环实例
```

所谓事件循环，就是将协程函数、任务 Task、未来对象 Future 等注册到事件循环中，事件循环实例会循环执行这些函数😐，注意同一时刻下只执行某个函数对象，具体执行某个函数时，如果执行到函数中进行 I/O 耗时操作的部分，事件循环就会将该函数暂停，而去执行其他函数，等进行 I/O 耗时操作的函数执行完后，会再次加入循环队列，等事件循环下次循环到它时继续从此前位置执行，从而实现这些可异步操作对象的协同运行，达到并发的效果😲

## Coroutine

一个用async def的函数在调用的时候会返回一个协程，但是不会执行

执行一个协程可以有如下三种方式：

1. asyncio.run()

2. await 该协程

3. asyncio.create_task封装成一个Task、可以让协程之间并发的run

   ```python
   async def main():
       task1 = asyncio.create_task(
           say_after(1, 'hello'))
   
       task2 = asyncio.create_task(
           say_after(2, 'world'))
   
       print(f"started at {time.strftime('%X')}")
   
       # Wait until both tasks are completed (should take
       # around 2 seconds.)
       await task1
       await task2
   
       print(f"finished at {time.strftime('%X')}")
   ```

   输出

   ```
   started at 17:14:32
   hello
   world
   finished at 17:14:34
   ```

## Task

