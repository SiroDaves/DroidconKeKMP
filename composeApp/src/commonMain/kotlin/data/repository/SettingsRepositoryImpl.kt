package data.repository

import data.local.LocalStorage
import domain.repositories.SettingsRepository
import kotlinx.coroutines.flow.Flow

class SettingsRepositoryImpl(
    private val localStorage: LocalStorage,
) : SettingsRepository {
    override suspend fun saveAppTheme(theme: Int) {
        localStorage.setInt(key = LocalStorage.appTheme, value = theme)
    }

    override fun getAppTheme(): Flow<Int?> {
        return localStorage.getInt(key = LocalStorage.appTheme)
    }

    override fun clearAll() {
        return localStorage.clearPreferences()
    }

}
