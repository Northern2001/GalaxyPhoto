//package com.galaxy.galaxyphoto.paging
//
//import androidx.paging.PagingSource
//import androidx.paging.PagingState
//import com.galaxy.galaxyphoto.domain.repository.HomeRepository
//import com.galaxy.galaxyphoto.model.photo.PhotoModel
//
//class PhotoDataSource(
//    private val repository: HomeRepository
//) : PagingSource<Int, PhotoModel>() {
//    override fun getRefreshKey(state: PagingState<Int, PhotoModel>): Int? {
//        return state.anchorPosition?.let { position ->
//            val page = state.closestPageToPosition(position)
//            page?.prevKey?.minus(1) ?: page?.nextKey?.plus(1)
//        }
//    }
//
//    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, PhotoModel> {
//        return try {
//            val page = params.key ?: 1
//            val reponse = repository.getPhotoList(page, 10)
//            LoadResult.Page(
//                data = reponse.blockingGet(),
//                prevKey = null,
//                nextKey = if (reponse.blockingGet().isNotEmpty()) page + 1 else null
//            )
//
//        } catch (e: Exception) {
//            LoadResult.Error(e)
//        }
//    }
//}