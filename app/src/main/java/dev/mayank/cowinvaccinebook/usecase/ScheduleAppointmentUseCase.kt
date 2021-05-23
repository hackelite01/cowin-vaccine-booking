package dev.mayank.cowinvaccinebook.usecase

import dev.mayank.cowinvaccinebook.data.model.ApiResult
import dev.mayank.cowinvaccinebook.data.model.ScheduleAppointmentResponse
import dev.mayank.cowinvaccinebook.repository.CowinAppRepository
import dev.mayank.cowinvaccinebook.usecase.model.ScheduleAppointmentRequest
import javax.inject.Inject


class ScheduleAppointmentUseCase @Inject constructor(
    private val cowinAppRepository: CowinAppRepository
): BaseUseCase<ScheduleAppointmentRequest, ApiResult<ScheduleAppointmentResponse>>() {
    override suspend fun execute(input: ScheduleAppointmentRequest): ApiResult<ScheduleAppointmentResponse> {
        return cowinAppRepository.scheduleAppointment(input)
    }
}