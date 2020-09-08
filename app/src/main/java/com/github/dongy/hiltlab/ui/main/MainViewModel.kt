package com.github.dongy.hiltlab.ui.main

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.github.dongy.hiltlab.data.MyRepository

class MainViewModel  @ViewModelInject constructor(
   private val repository: MyRepository
): ViewModel() {
//    방법 1. 직접 생성
//    val repository = MyRepository()

//    방법 2. ViewModel 생성자 활용 ( 그러나 ViewModel Factory 등 생성해서 파라미터 넣어줘야하고 번거로움)
//    class MainViewModel constructor(val repository: MyRepository): ViewModel()

//    방법 3. Hilt를 이용한 의존성 주입
//    Hilt and Jetpack integrations
//    https://developer.android.com/training/dependency-injection/hilt-jetpack 참고

    fun getRepositoryHash() = repository.toString()

}