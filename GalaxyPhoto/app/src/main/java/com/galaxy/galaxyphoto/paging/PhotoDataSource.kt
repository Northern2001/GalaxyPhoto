//package com.galaxy.galaxyphoto.paging
//
//import androidx.paging.PagingSource
//import androidx.paging.PagingState
//import com.galaxy.galaxyphoto.domain.helpe.Resource.Initialize.page
//import com.galaxy.galaxyphoto.domain.repository.HomeRepository
//import com.galaxy.galaxyphoto.model.photo.PhotoModel
//
//class PhotoDataSource(
//    private val repository: HomeRepository
//) : PagingSource<Int, PhotoModel>() {
//    override fun getRefreshKey(state: PagingState<Int, PhotoModel>): Int? {
//        return state.anchorPosition?.let { position ->
//            val page = state.closestPageToPosition(position)
//            page?.prevKey?.plus(1) ?: page?.nextKey?.minus(1)
//        }
//    }
//
//    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, PhotoModel> {
//        return try {
//            val nextPageNumber = params.key ?: 1
//            val response = repository.getPhotoList(nextPageNumber, 10)
//            LoadResult.Page(
//                data = response.blockingGet(),
//                prevKey = null,
//                nextKey = if (response.blockingGet().isNotEmpty()) page + 1 else null
//            )
//        } catch (e: Exception) {
//            LoadResult.Error(e)
//        }
//    }
//}