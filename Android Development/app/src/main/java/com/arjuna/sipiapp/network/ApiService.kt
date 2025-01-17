package com.arjuna.sipiapp.network

import com.arjuna.sipiapp.data.PredictResponse
import retrofit2.Call
import retrofit2.http.*

interface ApiService {

    @Multipart
    @POST("predict?path={imgUrl}")
    fun predictObject(
        @Path("imgUrl") imgUrl: String
    ): Call<PredictResponse>

    // gagal
}