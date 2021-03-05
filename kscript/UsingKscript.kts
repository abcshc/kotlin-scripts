#!/usr/bin/env kscript

//DEPS org.koin:koin-core:2.2.2

import org.koin.dsl.module

println("Hello from Kotlin!")
for(arg in args) {
    println("arg: $arg")
}

@file:Include("Included.kt")
// //Included.kt (Doesn't work)
includedFunction()
//INCLUDE DirectiveInclude.kt
directiveIncludedFunction()

class DictionaryRepository {
    val dictionary = HashMap<String, String>()

    fun addWord(name: String, description: String) {
        dictionary.put(name, description)
    }

    fun findWord(name: String): String? {
        return dictionary.get(name)
    }
}

val appModule = module {
    single { DictionaryRepository() }
}