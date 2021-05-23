package dev.mayank.cowinvaccinebook.usecase

import dev.mayank.cowinvaccinebook.repository.CowinAppRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ObserveOTPReceiveUseCase @Inject constructor(
    private val cowinAppRepository: CowinAppRepository
): BaseFlowUseCase<Unit, String>() {

    override fun execute(input: Unit): Flow<String> {
        return cowinAppRepository.onOtpReceived()
    }
}