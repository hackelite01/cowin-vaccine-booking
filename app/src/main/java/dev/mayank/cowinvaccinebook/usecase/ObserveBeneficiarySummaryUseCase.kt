package dev.mayank.cowinvaccinebook.usecase

import dev.mayank.cowinvaccinebook.data.model.BeneficiarySummary
import dev.mayank.cowinvaccinebook.repository.CowinAppRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ObserveBeneficiarySummaryUseCase @Inject constructor(
    private val cowinAppRepository: CowinAppRepository
): BaseFlowUseCase<Unit, List<BeneficiarySummary>>() {
    override fun execute(input: Unit): Flow<List<BeneficiarySummary>> {
        return cowinAppRepository.observeBeneficiarySummary()
    }
}