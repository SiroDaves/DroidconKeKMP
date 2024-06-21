package di

import org.koin.core.module.Module
import org.koin.dsl.module
import platform.MultiplatformSettingsWrapper

val commonModule = module { }

actual fun platformModule(): Module = module {
    single { MultiplatformSettingsWrapper(context = get()).createSettings() }
}