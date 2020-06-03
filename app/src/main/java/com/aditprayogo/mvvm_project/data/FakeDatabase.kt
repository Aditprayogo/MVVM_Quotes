package com.aditprayogo.mvvm_project.data



class FakeDatabase private constructor(){

    var quoteDao = FakeQuoteDao()
        private set

    companion object {
        @Volatile private var instance: FakeDatabase? = null

        /**singleton part
         *
         */
        fun getInstance() =
            instance ?: synchronized(this) {
                instance ?: FakeDatabase().also {
                    instance = it
                }
            }
    }

}