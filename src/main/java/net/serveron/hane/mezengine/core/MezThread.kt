package net.serveron.hane.mezengine.core

import net.serveron.hane.mezengine.MezEngine
import net.serveron.hane.mezengine.flow.Flow

class MezThread (val flowsList: List<Flows>) : Runnable {

    companion object {
        var nowFlow = FlowInfo(0, null)
    }

    override fun run() {
        try {
            MezEngine.plugin.logger.info("Game Start")
            for ((index, value) in flowsList.withIndex()) {

                val thread = Thread(value.flow)
                thread.start()
                if (value.async) thread.join()

                nowFlow.number = index.toLong()
                nowFlow.className = value.flow.javaClass.kotlin.simpleName
                MezEngine.plugin.logger.info(nowFlow.className + " start")
            }
            MezEngine.plugin.logger.info("Game Complete")
            nowFlow = FlowInfo(0, null)
        } catch (e: InterruptedException) {
            MezEngine.plugin.logger.info(e.toString())
        }
    }

    data class Flows(var flow: Flow, var async: Boolean)
    data class FlowInfo(var number: Long, var className:String?)
}