package com.androidabcd.ashokslsk.goodrxandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.disposables.Disposable

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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
    }


}
