# Kotlin-Flows

<p>
Kotlin Flow is a new Stream API from the team of jetbrains. This has similarities to 
Livedata and RxJava. They are all a way to utilize the observer pattern in your kotlin code. 
In terms of both complexity and power you can think of kotlin flow is falling somewhere in between 
LiveData and RxJava, In fact Flow looks much more like RxJava APIs containing streams of items that can 
be manipulated by operators as they are processed in the stream. In time, Kotlin Flow may come to rival 
RxJava as the go-to concurrency approach on Android and JVM systems.
</p>
<p>
A key aspect of Kotlin Flow is that it is build on top of Kotlin Coroutines. The effort that you 
put on learning the concepts and nuance of coroutines will pay off as you are working with flow. 
Coroutines allow you to write asynchronous code in a way that looks very much like normal synchronous code, and
without the need of writing your own thread, or litter your code with callbacks. 
One of the goals of Flow is to provide structural concurrency in your asynchronous code. With 
structured concurrency, you define coroutines within a given scope that may have the limited lifetime and not 
in a global scope.
</p>
<img src="\img\structured_concurrency.png">

<p>
If the scope the coroutines are running in ends its lifecycle. The coroutines are automatically 
cleaned up, even if they are not finished running. Flows share the same cancellable properties as 
coroutines, and so you don't need to dispose them as you do with RxJava. You can think of Kotlin flows as a:
<br>
<b>Flow = Cold, asynchronous stream</b>
<br>
because it is running within a coroutine. Flows are cold because it does not start the stream until 
it is observed, witch is called collection for a flow. If you are familiar with RxJava, this will be much simpler. 
Here is the link to my repo if you are not familiar with Rx -> [link](https://github.com/iamjosephmj/learn-rx).
Please get an understanding about [marble diagrams](https://rxmarbles.com/) before you start learning Flows
</p>