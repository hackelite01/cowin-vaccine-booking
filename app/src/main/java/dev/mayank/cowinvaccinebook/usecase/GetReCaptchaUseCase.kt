package dev.mayank.cowinvaccinebook.usecase

import dev.mayank.cowinvaccinebook.data.model.ApiResult
import dev.mayank.cowinvaccinebook.data.model.CaptchaResponse
import dev.mayank.cowinvaccinebook.repository.CowinAppRepository
import javax.inject.Inject

class GetReCaptchaUseCase @Inject constructor(
    private val cowinAppRepository: CowinAppRepository
): BaseUseCase<Unit, ApiResult<CaptchaResponse>>() {
    override suspend fun execute(input: Unit): ApiResult<CaptchaResponse> {
        return cowinAppRepository.generateCaptcha()
    }
}