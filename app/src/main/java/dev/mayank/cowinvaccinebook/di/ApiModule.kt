package dev.mayank.cowinvaccinebook.di

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.components.SingletonComponent
import dev.mayank.cowinvaccinebook.data.network.CowinApiService
import dev.mayank.cowinvaccinebook.repository.CowinAppRepository
import dev.mayank.cowinvaccinebook.repository.CowinRepositoryImpl
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ApiModule {
    @Singleton
    @Provides
    fun provideCowinApiService(retrofit: Retrofit): CowinApiService =
        retrofit.create(CowinApiService::class.java)
}

@Module
@InstallIn(SingletonComponent::class)
abstract class ApiBindingModule {

    @Singleton
    @Binds
    abstract fun bindsCowinAppRepository(cowinRepositoryImpl: CowinRepositoryImpl): CowinAppRepository
}