package com.emoyoma.retrofitapp.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.emoyoma.retrofitapp.api.RetrofitProvider
import com.emoyoma.retrofitapp.models.User
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class MainViewModel : ViewModel() {
    val usersLiveData = MutableLiveData<List<User>>()

    fun getUsers(){
        RetrofitProvider.placeholderAPI.getUsers().enqueue(object : retrofit2.Callback<List<User>> {
            override fun onResponse(call: Call<List<User>>, response: Response<List<User>>) {
               response.body()?.let {
                   usersLiveData.postValue(it)
               }
            }

            override fun onFailure(call: Call<List<User>>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })
    }
}