package dev.mayank.cowinvaccinebook.usecase.model

import dev.mayank.cowinvaccinebook.data.model.BeneficiarySummary

class UserPreferenceAndBeneficiaries(
    val userPreference: UserPreference,
    val beneficiaries: List<BeneficiarySummary>
)