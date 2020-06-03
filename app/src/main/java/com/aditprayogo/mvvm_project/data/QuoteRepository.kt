package com.aditprayogo.mvvm_project.data


/**
 * Mediator beetwen database and view model
 */
class QuoteRepository private constructor(private val quoteDao: FakeQuoteDao){

    fun addQuote(quote: Quote) {
        quoteDao.addQutes(quote)
    }

    fun  getQuotes() = quoteDao.getQuotes()

    companion object {
        @Volatile private var instance: QuoteRepository? = null

        /**singleton part
         *
         */
        fun getInstance(quoteDao: FakeQuoteDao) =
            instance ?: synchronized(this) {
                instance ?: QuoteRepository(quoteDao).also {
                    instance = it
                }
            }
    }
}