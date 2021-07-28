package com.tjwogns.data.db.converter

import com.google.gson.Gson
import com.google.gson.JsonParser
import com.google.gson.reflect.TypeToken

object ConverterUtils {
    fun <T> toModel(jsonString: String, klass: Class<T>): T {
        val model = Gson().fromJson<T>(jsonString, TypeToken.getParameterized(klass).type)
        return model as T
    }

    fun <T> toListModel(jsonString: String, klass: Class<T>): List<T> {
        val parser = JsonParser.parseString(jsonString).asJsonArray
        val arrayModel = mutableListOf<T>()

        parser.forEach { element ->
            arrayModel.add(Gson().fromJson<T>(element, TypeToken.getParameterized(klass).type))
        }

        return arrayModel
    }

    fun toJsonString(obj: Any): String {
        return Gson().toJson(obj)
    }
}