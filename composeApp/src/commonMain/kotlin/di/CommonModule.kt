package di

import data.local.LocalStorage
import data.repository.SettingsRepositoryImpl
import domain.repositories.SettingsRepository
import org.koin.core.module.Module
import org.koin.dsl.module
import ui.screens.AppViewModel

fun commonModule() = module {
    single<LocalStorage> {
        LocalStorage(settings = get())
    }

    single<SettingsRepository> {
        SettingsRepositoryImpl(localStorage = get())
    }

    single<AppViewModel> {
        AppViewModel(settingsRepository = get())
    }
}

expect fun platformModule(): Module
