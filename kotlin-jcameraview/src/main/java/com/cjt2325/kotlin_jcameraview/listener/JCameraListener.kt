package com.cjt2325.kotlin_jcameraview.listener

/**
 * =====================================
 * 作    者: 陈嘉桐
 * 版    本：1.1.4
 * 创建日期：2017/8/16
 * 描    述：
 * =====================================
 */
interface JCameraListener {
    fun caputre()
    fun recorderShort()
    fun recorderStart()
    fun recorderEnd(time: Long)
    fun cancle()
    fun confirm()
    fun quit()
}