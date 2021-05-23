package dev.mayank.cowinvaccinebook.usecase

import dev.mayank.cowinvaccinebook.data.model.ApiResult
import dev.mayank.cowinvaccinebook.data.model.StatesResponse
import dev.mayank.cowinvaccinebook.repository.CowinAppRepository
import javax.inject.Inject

class GetStatesUseCase @Inject constructor(
    private val cowinAppRepository: CowinAppRepository
): BaseUseCase<Unit, ApiResult<StatesResponse>>() {
    override suspend fun execute(input: Unit): ApiResult<StatesResponse> {
        return cowinAppRepository.getStates()
    }
}