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

        createFromIteratable().subscribe{
            arr-> Log.d("mainitr", "recieved iterated data "+ arr)
        }

        createRange().subscribe{
            it-> Log.d("mainrange","range "+it)
        }
    }

    private fun showJustJob(){

    }

    private fun createFromArray(): Observable<Array<Int>>{
        return Observable.fromArray(arrayOf(1, 5, 7,9,11,13,15))
    }

    private fun createFromIteratable(): Observable<Int>{
        return Observable.fromIterable(mutableListOf(1,2,34,6,7,8))
    }


    private fun createRange(): Observable<Int>{
        return Observable.range(1,5).repeat(3)
    }


}
