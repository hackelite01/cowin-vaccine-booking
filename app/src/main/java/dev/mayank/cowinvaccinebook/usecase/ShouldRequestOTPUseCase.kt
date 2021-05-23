package dev.mayank.cowinvaccinebook.usecase

import dev.mayank.cowinvaccinebook.repository.CowinAppRepository
import javax.inject.Inject

class ShouldRequestOTPUseCase @Inject constructor(
    private val cowinAppRepository: CowinAppRepository
): BaseUseCase<Unit, Boolean>() {
    override suspend fun execute(input: Unit): Boolean {
        val lastOTPRequestTime = cowinAppRepository.getLastOTPRequestTime()
        val currTime = System.currentTimeMillis() / 1000
        return lastOTPRequestTime == 0L || currTime > (lastOTPRequestTime + 180)
    }
}