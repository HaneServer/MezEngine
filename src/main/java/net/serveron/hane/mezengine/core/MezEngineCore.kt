package net.serveron.hane.mezengine.core

import net.serveron.hane.mezengine.flow.Flow

class MezEngineCore {

    fun run(flowsList: List<MezThread.Flows>): Thread {
        val thread = Thread(MezThread(flowsList))
        thread.start()
        return thread
    }

}