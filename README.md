# Rx-Android
Comprehensive Rx Android and Rx Java example

# RxJava for Android developers

This has already created enough buzz in the android developer community not knowing this is like hooking yourself back. Just keep this key repository in your understanding and this repository is a practical driven approach by looking at the code you shall definitely comprehend the intention of the code lets start. 

#### Reactive Manifesto: 

Just like Election manifesto RX has its own manifesto that dictates what it can do for the Rx applications as Reactive Manifesto states. 

- Responsive (Systems should respond in a timely manner)
- Message driven (systems should use async message-passing between components to ensure loose coupling)
- Elastic (systems should stay responsive under high load)
- Resilient (systems should stay responsive when some components fail)



#### Lets create a simple RxJava components 

```kotlin
 val dataStream = Observable.just(10, 20, 30, 40, 50 ,60)
        val dataObserver = object : Observer<Int> {
            override fun onComplete() {
                 //To change body of created functions use File | Settings | File Templates.
                println("All data received from the stream")
            }

            override fun onSubscribe(d: Disposable?) {
                //To change body of created functions use File | Settings | File Templates.
            }

            override fun onNext(t: Int?) {
              //To change body of created functions use File | Settings | File Templates.
                println("new data item is recieved: "+t)
            }

            override fun onError(e: Throwable?) {
                //To change body of created functions use File | Settings | File Templates.
                println("An error is recieved "+e?.message)
            }

        }

        dataStream.subscribe(dataObserver)
```

The above example illustrates the simplicity of initializing the Data and observables. The above example uses a simple Just operator like as you see but you don't have remember all of the operators cause there is a good documentation available instead you should remember what kind of operator suits your problem and what you should use. 

### There exists the following operators. 

- Creation Operators
- Filtering Operators
- Combining Operators 
- Concurrency Operators

