package dev.mayank.cowinvaccinebook.usecase

import dev.mayank.cowinvaccinebook.repository.CowinAppRepository
import dev.mayank.cowinvaccinebook.usecase.model.UserPreferenceAndBeneficiaries
import javax.inject.Inject

class SaveUserPreferenceUseCase @Inject constructor(
    private  val cowinAppRepository: CowinAppRepository
): BaseUseCase<UserPreferenceAndBeneficiaries, Unit>() {
    override suspend fun execute(input: UserPreferenceAndBeneficiaries) {
        cowinAppRepository.saveBeneficiaryDetails(input.beneficiaries)
        cowinAppRepository.saveUserPreference(input.userPreference)
    }
}