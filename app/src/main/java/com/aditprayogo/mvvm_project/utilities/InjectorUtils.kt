package com.aditprayogo.mvvm_project.utilities

import com.aditprayogo.mvvm_project.data.FakeDatabase
import com.aditprayogo.mvvm_project.data.QuoteRepository
import com.aditprayogo.mvvm_project.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        val quotesRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quotesRepository)
    }
}