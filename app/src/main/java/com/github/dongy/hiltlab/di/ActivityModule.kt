package com.github.dongy.hiltlab.di

import com.github.dongy.hiltlab.di.qualifier.ActivityHash
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class) //scope
object ActivityModule {

    @ActivityHash
    @Provides
    fun provideHash() = hashCode().toString()

}