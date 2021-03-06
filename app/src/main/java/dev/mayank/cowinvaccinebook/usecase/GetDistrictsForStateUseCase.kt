package dev.mayank.cowinvaccinebook.usecase

import dev.mayank.cowinvaccinebook.data.model.ApiResult
import dev.mayank.cowinvaccinebook.data.model.DistrictsResponse
import dev.mayank.cowinvaccinebook.repository.CowinAppRepository
import javax.inject.Inject

class GetDistrictsForStateUseCase @Inject constructor(
    private val cowinAppRepository: CowinAppRepository
): BaseUseCase<Int, ApiResult<DistrictsResponse>>() {
    override suspend fun execute(input: Int): ApiResult<DistrictsResponse> {
        return cowinAppRepository.getDistricts(input)
    }
}