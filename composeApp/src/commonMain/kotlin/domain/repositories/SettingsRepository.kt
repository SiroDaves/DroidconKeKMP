package domain.repositories

import kotlinx.coroutines.flow.Flow

interface SettingsRepository {
    suspend fun saveAppTheme(theme: Int)
    fun getAppTheme(): Flow<Int?>
    fun clearAll()
}
