package dev.mayank.cowinvaccinebook.data.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CaptchaResponse(
    @Json(name ="captcha")
    val captcha: String
)