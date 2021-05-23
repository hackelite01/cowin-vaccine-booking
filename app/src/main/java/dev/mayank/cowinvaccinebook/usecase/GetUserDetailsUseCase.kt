package dev.mayank.cowinvaccinebook.usecase

import dev.mayank.cowinvaccinebook.data.model.UserDetails
import dev.mayank.cowinvaccinebook.repository.CowinAppRepository
import javax.inject.Inject

class GetUserDetailsUseCase @Inject constructor(
    private val cowinAppRepository: CowinAppRepository
): BaseUseCase<Unit, UserDetails?>() {
    override suspend fun execute(input: Unit): UserDetails? {
        return cowinAppRepository.getSavedMobileNum()?.let {
            UserDetails(it)
        }
    }

}