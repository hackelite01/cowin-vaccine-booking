package dev.mayank.cowinvaccinebook.usecase

abstract class BaseUseCase<Input, Output> {
    abstract suspend fun execute(input: Input): Output
}