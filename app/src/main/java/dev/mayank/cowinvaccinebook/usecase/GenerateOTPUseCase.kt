package dev.mayank.cowinvaccinebook.usecase

import dev.mayank.cowinvaccinebook.data.model.ApiResult
import dev.mayank.cowinvaccinebook.data.model.RequestOtpResponse
import dev.mayank.cowinvaccinebook.repository.CowinAppRepository
import javax.inject.Inject

class GenerateOTPUseCase @Inject constructor(
    private val cowinAppRepository: CowinAppRepository
): BaseUseCase<Unit, ApiResult<RequestOtpResponse>>() {
    override suspend fun execute(input: Unit): ApiResult<RequestOtpResponse> {
        val savedMobileNum = cowinAppRepository.getSavedMobileNum()
        return savedMobileNum?.let {
            val apiResult = cowinAppRepository.generateOtp(savedMobileNum)
            if(apiResult is ApiResult.Success) {
                cowinAppRepository.saveOtpTxnId(apiResult.value.txnId)
                cowinAppRepository.saveLastOTPRequestTime(System.currentTimeMillis()/1000)
            }
            apiResult
        } ?: ApiResult.GenericError.default()
    }
}