package com.aditprayogo.mvvm_project.ui.quotes

import androidx.lifecycle.ViewModel
import com.aditprayogo.mvvm_project.data.Quote
import com.aditprayogo.mvvm_project.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository) : ViewModel(){

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuotes(quote: Quote) = quoteRepository.addQuote(quote)
}