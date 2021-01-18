package com.codeart.filmskuy.core.di

import androidx.room.Room
import com.codeart.filmskuy.core.data.source.CatalogueRepository
import com.codeart.filmskuy.core.data.source.local.LocalDataSource
import com.codeart.filmskuy.core.data.source.local.room.CatalogueDatabase
import com.codeart.filmskuy.core.data.source.remote.RemoteDataSource
import com.codeart.filmskuy.core.data.source.remote.network.ApiService
import com.codeart.filmskuy.core.domain.repository.ICatalogueRepository
import com.codeart.filmskuy.core.utils.API_BASE
import com.codeart.filmskuy.core.utils.AppExecutors
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Created by wahyu_septiadi on 18, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

val databaseModule = module {
    factory { get<CatalogueDatabase>().catalogueDao() }
    single {
        Room.databaseBuilder(
            androidContext(),
            CatalogueDatabase::class.java, "Catalogue.db"
        ).fallbackToDestructiveMigration().build()
    }
}

val networkModule = module {
    single {
        OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
            .connectTimeout(120, TimeUnit.SECONDS)
            .readTimeout(120, TimeUnit.SECONDS)
            .build()
    }
    single {
        val retrofit = Retrofit.Builder()
            .baseUrl(API_BASE)
            .addConverterFactory(GsonConverterFactory.create())
            .client(get())
            .build()
        retrofit.create(ApiService::class.java)
    }
}

val repositoryModule = module {
    single { LocalDataSource(get()) }
    single { RemoteDataSource(get()) }
    factory { AppExecutors() }
    single<ICatalogueRepository> { CatalogueRepository(get(), get(), get()) }
}