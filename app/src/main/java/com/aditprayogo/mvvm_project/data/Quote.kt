package com.aditprayogo.mvvm_project.data

data class Quote (val quoteText: String, val auther: String) {

    override fun toString(): String {
        return "$quoteText - $auther"
    }
}