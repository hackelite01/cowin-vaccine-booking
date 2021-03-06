package dev.mayank.cowinvaccinebook.data.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RequestOtpResponse(
    @Json(name = "txnId")
    val txnId: String
)