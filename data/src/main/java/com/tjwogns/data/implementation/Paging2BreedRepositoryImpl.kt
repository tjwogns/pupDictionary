package com.tjwogns.data.implementation

import androidx.paging.DataSource
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.tjwogns.data.db.PupDatabase
import com.tjwogns.data.source.paging2.Paging2BreedRemoteSource
import com.tjwogns.data.source.paging2.BreedBoundaryCallback
import com.tjwogns.domain.model.Breed
import com.tjwogns.domain.repository.Paging2BreedRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

class Paging2BreedRepositoryImpl @Inject constructor(
    private val database: PupDatabase,
    private val paging2BreedRemoteSource: Paging2BreedRemoteSource,
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO,
): Paging2BreedRepository {
    override fun getPaging2Breeds(isRefresh: Boolean): DataSource.Factory<Int, Breed> {

        val factory = database.breedDao().getDataSourceFactory()

        // PageBoundaryCallback
        val boundaryCallback = BreedBoundaryCallback(
            database,
            paging2BreedRemoteSource,
            dispatcher
        )

        val config = PagedList.Config.Builder()
            .setPageSize(PAGE_SIZE)
            .setEnablePlaceholders(true)
            .setPrefetchDistance(10)
            .build()


        val data = LivePagedListBuilder(factory, config).setBoundaryCallback(boundaryCallback).build()

        /* OMG : Clean Architecture 에서 Rx를 사용하지 않고 LiveData 를 통해 Paging2 적용을 하려고 했으나
            Domain 계층에서 LiveData 를 알지 못해 (Domain 계층은 Pure 한 Kotlin 코드로만 이루어 져야 한다. LiveData 는 Androidx)
            Presentation 에 전달해 주지못함. Rx로 하면 Observable 을 통해 가능 할지도...
         */

        return database.breedDao().getDataSourceFactory().map { it as Breed }
    }

    companion object {

        private const val PAGE_SIZE = 20
        private const val PAGE_PREFETCH_SIZE = PAGE_SIZE * 2
        private const val PAGE_INIT_LOAD_SIZE = PAGE_SIZE * 3
    }
}