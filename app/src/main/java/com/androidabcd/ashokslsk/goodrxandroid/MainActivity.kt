package com.androidabcd.ashokslsk.goodrxandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import java.util.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        createFromArray().subscribe{
                arr-> Log.d("main","recieved array is"+Arrays.toString(arr))
        }
    }

    private fun showJustJob(){

    }

    private fun createFromArray(): Observable<Array<Int>>{
        return Observable.fromArray(arrayOf(1, 5, 7,9,11,13,15))
    }

}
